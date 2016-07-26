package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.offermanagement.common.api.datatype.DayOfWeek;
import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod}s.
 *
 */
public class WeeklyPeriodSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private DayOfWeek startingDay;

  private Integer startingHour;

  private DayOfWeek endingDay;

  private Integer endingHour;

  /**
   * The constructor.
   */
  public WeeklyPeriodSearchCriteriaTo() {

    super();
  }

  public DayOfWeek getStartingDay() {

    return this.startingDay;
  }

  public void setStartingDay(DayOfWeek startingDay) {

    this.startingDay = startingDay;
  }

  public Integer getStartingHour() {

    return this.startingHour;
  }

  public void setStartingHour(Integer startingHour) {

    this.startingHour = startingHour;
  }

  public DayOfWeek getEndingDay() {

    return this.endingDay;
  }

  public void setEndingDay(DayOfWeek endingDay) {

    this.endingDay = endingDay;
  }

  public Integer getEndingHour() {

    return this.endingHour;
  }

  public void setEndingHour(Integer endingHour) {

    this.endingHour = endingHour;
  }

}
