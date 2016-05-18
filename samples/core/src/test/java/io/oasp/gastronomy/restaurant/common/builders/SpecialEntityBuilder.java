package io.oasp.gastronomy.restaurant.common.builders;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.EntityManager;

import io.oasp.gastronomy.restaurant.general.common.api.datatype.Money;
import io.oasp.gastronomy.restaurant.offermanagement.common.api.WeeklyPeriod;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.OfferEntity;
import io.oasp.gastronomy.restaurant.offermanagement.dataaccess.api.SpecialEntity;

public class SpecialEntityBuilder {

  private List<P<SpecialEntity>> parameterToBeApplied;

  public SpecialEntityBuilder() {

    parameterToBeApplied = new LinkedList<P<SpecialEntity>>();
    fillMandatoryFields();
    fillMandatoryFields_custom();
  }

  public SpecialEntityBuilder name(final String name) {

    parameterToBeApplied.add(new P<SpecialEntity>() {
      @Override
      public void apply(SpecialEntity target) {

        target.setName(name);
      }
    });
    return this;
  }

  public SpecialEntityBuilder offer(final OfferEntity offer) {

    parameterToBeApplied.add(new P<SpecialEntity>() {
      @Override
      public void apply(SpecialEntity target) {

        target.setOffer(offer);
      }
    });
    return this;
  }

  public SpecialEntityBuilder activePeriod(final WeeklyPeriod activePeriod) {

    parameterToBeApplied.add(new P<SpecialEntity>() {
      @Override
      public void apply(SpecialEntity target) {

        target.setActivePeriod(activePeriod);
      }
    });
    return this;
  }

  public SpecialEntityBuilder specialPrice(final Money specialPrice) {

    parameterToBeApplied.add(new P<SpecialEntity>() {
      @Override
      public void apply(SpecialEntity target) {

        target.setSpecialPrice(specialPrice);
      }
    });
    return this;
  }

  public SpecialEntityBuilder revision(final Number revision) {

    parameterToBeApplied.add(new P<SpecialEntity>() {
      @Override
      public void apply(SpecialEntity target) {

        target.setRevision(revision);
      }
    });
    return this;
  }

  public SpecialEntityBuilder offerId(final Long offerId) {

    parameterToBeApplied.add(new P<SpecialEntity>() {
      @Override
      public void apply(SpecialEntity target) {

        target.setOfferId(offerId);
      }
    });
    return this;
  }

  public SpecialEntity createNew() {

    SpecialEntity specialentity = new SpecialEntity();
    for (P<SpecialEntity> parameter : parameterToBeApplied) {
      parameter.apply(specialentity);
    }
    return specialentity;
  }

  public SpecialEntity persist(EntityManager em) {

    SpecialEntity specialentity = createNew();
    em.persist(specialentity);
    return specialentity;
  }

  public List<SpecialEntity> persistAndDuplicate(EntityManager em, int quantity) {

    List<SpecialEntity> specialentityList = new LinkedList<SpecialEntity>();
    for (int i = 0; i < quantity; i++) {
      SpecialEntity specialentity = createNew();
      // TODO alter at least values with unique key constraints to prevent from exceptions while persisting
      em.persist(specialentity);
      specialentityList.add(specialentity);
    }

    return specialentityList;
  }

  /**
   * Might be enrichted to users needs (will not be overwritten)
   */
  private void fillMandatoryFields_custom() {

  }

  /**
   * Fills all mandatory fields by default. (will be overwritten on re-generation)
   */
  private void fillMandatoryFields() {

  }

}
