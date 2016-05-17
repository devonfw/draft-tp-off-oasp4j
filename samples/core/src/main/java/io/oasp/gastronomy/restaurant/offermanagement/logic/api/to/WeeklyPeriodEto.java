package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.to.AbstractEto;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.datatype.DayOfWeek;

/**
 * Entity transport object of WeeklyPeriod
 */
public class WeeklyPeriodEto extends AbstractEto implements WeeklyPeriod {

  private static final long serialVersionUID = 1L;

  private DayOfWeek startingDay;

  private int startingHour;

  private DayOfWeek endingDay;

  private int endingHour;

  /**
   * {@inheritDoc}
   */
  @Override
  public DayOfWeek getStartingDay() {

    return startingDay;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setStartingDay(DayOfWeek startingDay) {

    this.startingDay = startingDay;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getStartingHour() {

    return startingHour;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setStartingHour(int startingHour) {

    this.startingHour = startingHour;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public DayOfWeek getEndingDay() {

    return endingDay;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setEndingDay(DayOfWeek endingDay) {

    this.endingDay = endingDay;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public int getEndingHour() {

    return endingHour;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public void setEndingHour(int endingHour) {

    this.endingHour = endingHour;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.startingDay == null) ? 0 : this.startingDay.hashCode());
    result = prime * result + ((Integer) startingHour).hashCode();
    result = prime * result + ((this.endingDay == null) ? 0 : this.endingDay.hashCode());
    result = prime * result + ((Integer) endingHour).hashCode();
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    WeeklyPeriodEto other = (WeeklyPeriodEto) obj;
    if (this.startingDay == null) {
      if (other.startingDay != null) {
        return false;
      }
    } else if (!this.startingDay.equals(other.startingDay)) {
      return false;
    }
    if (this.startingHour != other.startingHour) {
      return false;
    }
    if (this.endingDay == null) {
      if (other.endingDay != null) {
        return false;
      }
    } else if (!this.endingDay.equals(other.endingDay)) {
      return false;
    }
    if (this.endingHour != other.endingHour) {
      return false;
    }
    return true;
  }
}
