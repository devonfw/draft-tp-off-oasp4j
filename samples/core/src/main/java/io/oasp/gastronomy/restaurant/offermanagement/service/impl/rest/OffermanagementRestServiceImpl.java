package io.oasp.gastronomy.restaurant.offermanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.transaction.annotation.Transactional;

import io.oasp.gastronomy.restaurant.offermanagement.logic.api.Offermanagement;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialEto;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteriaTo;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase.UcFindSpecial;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase.UcManageSpecial;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * The service class for REST calls in order to execute the methods in {@link Offermanagement}.
 */
@Path("/offermanagement/v1")
@Named("OffermanagementRestService")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Transactional
public class OffermanagementRestServiceImpl {

  private Offermanagement specialManagement;

  /**
   * This method sets the field <tt>specialManagement</tt>.
   *
   * @param specialManagement the new value of the field specialManagement
   */
  @Inject
  public void setSpecialManagement(Offermanagement specialManagement) {

    this.specialManagement = specialManagement;
  }

  /**
   * Delegates to {@link UcFindSpecial#findSpecial}.
   *
   * @param id the ID of the {@link SpecialEto}
   * @return the {@link SpecialEto}
   */
  @GET
  @Path("/special/{id}/")
  public SpecialEto getSpecial(@PathParam("id") String id) {

    Long idAsLong;
    if (id == null) {
      throw new BadRequestException("missing id");
    }
    try {
      idAsLong = Long.parseLong(id);
    } catch (NumberFormatException e) {
      throw new BadRequestException("id is not a number");
    } catch (NotFoundException e) {
      throw new BadRequestException("special not found");
    }
    return this.specialManagement.findSpecial(idAsLong);
  }

  /**
   * Delegates to {@link UcManageSpecial#createSpecial}.
   *
   * @param special the {@link SpecialEto} to be created
   * @return the recently created {@link SpecialEto}
   */
  @POST
  @Path("/special/")
  public SpecialEto saveSpecial(SpecialEto special) {

    return this.specialManagement.saveSpecial(special);
  }

  /**
   * Delegates to {@link UcManageSpecial#deleteSpecial}.
   *
   * @param id ID of the {@link SpecialEto} to be deleted
   */
  @DELETE
  @Path("/special/{id}/")
  public void deleteSpecial(@PathParam("id") String id) {

    Long idAsLong;
    if (id == null) {
      throw new BadRequestException("missing id");
    }
    try {
      idAsLong = Long.parseLong(id);
    } catch (NumberFormatException e) {
      throw new BadRequestException("id is not a number");
    } catch (NotFoundException e) {
      throw new BadRequestException("special not found");
    }
    this.specialManagement.deleteSpecial(idAsLong);
  }

  /**
   * Delegates to {@link UcFindSpecial#findSpecialEtos}.
   *
   * @param searchCriteriaTo the pagination and search criteria to be used for finding specials.
   * @return the {@link PaginatedListTo list} of matching {@link SpecialEto}s.
   */
  @Path("/special/search")
  @POST
  public PaginatedListTo<SpecialEto> findSpecialsByPost(SpecialSearchCriteriaTo searchCriteriaTo) {

    return this.specialManagement.findSpecialEtos(searchCriteriaTo);
  }

}
