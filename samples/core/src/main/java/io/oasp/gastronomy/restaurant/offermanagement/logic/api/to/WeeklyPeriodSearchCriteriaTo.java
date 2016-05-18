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

  private int startingHour;

  private DayOfWeek endingDay;

  private int endingHour;

  /**
   * The constructor.
   */
  public WeeklyPeriodSearchCriteriaTo() {

    super();
  }

  public DayOfWeek getStartingDay() {

    return startingDay;
  }

  public void setStartingDay(DayOfWeek startingDay) {

    this.startingDay = startingDay;
  }

  public int getStartingHour() {

    return startingHour;
  }

  public void setStartingHour(int startingHour) {

    this.startingHour = startingHour;
  }

  public DayOfWeek getEndingDay() {

    return endingDay;
  }

  public void setEndingDay(DayOfWeek endingDay) {

    this.endingDay = endingDay;
  }

  public int getEndingHour() {

    return endingHour;
  }

  public void setEndingHour(int endingHour) {

    this.endingHour = endingHour;
  }

}
