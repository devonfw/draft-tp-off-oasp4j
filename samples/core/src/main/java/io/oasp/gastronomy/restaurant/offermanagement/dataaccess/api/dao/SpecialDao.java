package io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.dao;

import io.oasp.gastronomy.restaurant.general.dataaccess.api.dao.ApplicationDao;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;
import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialSearchCriteriaTo;
import io.oasp.module.jpa.common.api.to.PaginatedListTo;

/**
 * Data access interface for Special entities
 */
public interface SpecialDao extends ApplicationDao<SpecialEntity> {

  /**
   * Finds the {@link SpecialEntity specials} matching the given {@link SpecialSearchCriteriaTo}.
   *
   * @param criteria is the {@link SpecialSearchCriteriaTo}.
   * @return the {@link PaginatedListTo} with the matching {@link SpecialEntity} objects.
   */
  PaginatedListTo<SpecialEntity> findSpecials(SpecialSearchCriteriaTo criteria);
}
