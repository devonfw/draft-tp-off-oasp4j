package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.Special}s.
 *
 */
public class SpecialSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private String name;

  private Long offerId;

  private WeeklyPeriodSearchCriteriaTo activePeriod;

  private Money specialPrice;

  /**
   * The constructor.
   */
  public SpecialSearchCriteriaTo() {

    super();
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public Long getOfferId() {

    return offerId;
  }

  public void setOfferId(Long offerId) {

    this.offerId = offerId;
  }

  public WeeklyPeriodSearchCriteriaTo getActivePeriod() {

    return activePeriod;
  }

  public void setActivePeriod(WeeklyPeriodSearchCriteriaTo activePeriod) {

    this.activePeriod = activePeriod;
  }

  public Money getSpecialPrice() {

    return specialPrice;
  }

  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

}
