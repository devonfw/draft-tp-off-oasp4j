package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import java.util.Date;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.general.common.api.to.AbstractEto;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.Special;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;

/**
 * Entity transport object of Special
 */
public class SpecialEto extends AbstractEto implements Special {

  private static final long serialVersionUID = 1L;

  private String name;

  private Long offerId;

  private WeeklyPeriodEto activePeriod;

  private Money specialPrice;

  private Date created;

  private String comment;

  @Override
  public String getName() {

    return this.name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public Long getOfferId() {

    return this.offerId;
  }

  @Override
  public void setOfferId(Long offerId) {

    this.offerId = offerId;
  }

  @Override
  public WeeklyPeriod getActivePeriod() {

    return this.activePeriod;
  }

  @Override
  public void setActivePeriod(WeeklyPeriod activePeriod) {

    this.activePeriod = (WeeklyPeriodEto) activePeriod;
  }

  @Override
  public Money getSpecialPrice() {

    return this.specialPrice;
  }

  @Override
  public void setSpecialPrice(Money specialPrice) {

    this.specialPrice = specialPrice;
  }

  @Override
  public Date getCreated() {

    return this.created;
  }

  @Override
  public void setCreated(Date created) {

    this.created = created;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());

    result = prime * result + ((this.offerId == null) ? 0 : this.offerId.hashCode());
    result = prime * result + ((this.activePeriod == null) ? 0 : this.activePeriod.hashCode());
    result = prime * result + ((this.specialPrice == null) ? 0 : this.specialPrice.hashCode());
    result = prime * result + ((this.created == null) ? 0 : this.created.hashCode());
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
    SpecialEto other = (SpecialEto) obj;
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }

    if (this.offerId == null) {
      if (other.offerId != null) {
        return false;
      }
    } else if (!this.offerId.equals(other.offerId)) {
      return false;
    }
    if (this.activePeriod == null) {
      if (other.activePeriod != null) {
        return false;
      }
    } else if (!this.activePeriod.equals(other.activePeriod)) {
      return false;
    }
    if (this.specialPrice == null) {
      if (other.specialPrice != null) {
        return false;
      }
    } else if (!this.specialPrice.equals(other.specialPrice)) {
      return false;
    }
    if (this.created == null) {
      if (other.created != null) {
        return false;
      }
    } else if (!this.created.equals(other.created)) {
      return false;
    }
    return true;
  }

  @Override
  public String getComment() {

    return comment;
  }

  @Override
  public void setComment(String comment) {

    this.comment = comment;
  }

}
