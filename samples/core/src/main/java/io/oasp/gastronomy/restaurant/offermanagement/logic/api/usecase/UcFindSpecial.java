package io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase;

import java.util.List;

import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialEto;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

public interface UcFindSpecial {

  /**
   * Returns a Special by its id 'id'.
   *
   * @param id The id 'id' of the Special.
   * @return The {@link SpecialEto} with id 'id'
   */
  SpecialEto findSpecial(Long id);

  /**
   * Returns a paginated list of Specials matching the search criteria.
   *
   * @param criteria the {@link SpecialSearchCriteriaTo}.
   * @return the {@link List} of matching {@link SpecialEto}s.
   */
  PaginatedListTo<SpecialEto> findSpecialEtos(SpecialSearchCriteriaTo criteria);

}
