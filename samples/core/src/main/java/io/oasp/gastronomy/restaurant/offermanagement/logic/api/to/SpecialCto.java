package io.oasp.gastronomy.restaurant.offermanagement.logic.api.to;

import io.oasp.gastronomy.restaurant.general.common.api.to.AbstractCto;

/**
 * Composite transport object of Special
 */
public class SpecialCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private SpecialEto special;

  private OfferEto offer;

  public SpecialEto getSpecial() {

    return special;
  }

  public void setSpecial(SpecialEto special) {

    this.special = special;
  }

  public OfferEto getOffer() {

    return offer;
  }

  public void setOffer(OfferEto offer) {

    this.offer = offer;
  }

}
