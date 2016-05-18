package io.oasp.gastronomy.restaurant.offermanagement.logic.impl.usecase;

import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;

import io.oasp.gastronomy.restaurant.general.logic.api.UseCase;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialEto;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteriaTo;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase.UcFindSpecial;
import io.oasp.gastronomy.restaurant.offermanagement.logic.base.usecase.AbstractSpecialUc;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Use case implementation for searching, filtering and getting Specials
 */
@Named
@UseCase
@Validated
public class UcFindSpecialImpl extends AbstractSpecialUc implements UcFindSpecial {

  /** Logger instance. */
  private static final Logger LOG = LoggerFactory.getLogger(UcFindSpecialImpl.class);

  @Override
  public SpecialEto findSpecial(Long id) {

    LOG.debug("Get Special with id {} from database.", id);
    return getBeanMapper().map(getSpecialDao().findOne(id), SpecialEto.class);
  }

  @Override
  public PaginatedListTo<SpecialEto> findSpecialEtos(SpecialSearchCriteriaTo criteria) {

    criteria.limitMaximumPageSize(MAXIMUM_HIT_LIMIT);
    PaginatedListTo<SpecialEntity> specials = getSpecialDao().findSpecials(criteria);
    return mapPaginatedEntityList(specials, SpecialEto.class);
  }

}
