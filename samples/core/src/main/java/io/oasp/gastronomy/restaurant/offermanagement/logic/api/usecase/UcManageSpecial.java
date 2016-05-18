package io.oasp.gastronomy.restaurant.offermanagement.logic.api.usecase;

import io.oasp.gastronomy.restaurant.offermanagement.logic.api.to.SpecialEto;

/**
 * Interface of UcManageSpecial to centralize documentation and signatures of methods.
 */
public interface UcManageSpecial {

  /**
   * Deletes a special from the database by its id 'specialId'.
   *
   * @param specialId Id of the special to delete
   * @return boolean <code>true</code> if the special can be deleted, <code>false</code> otherwise
   */
  boolean deleteSpecial(Long specialId);

  /**
   * Saves a special and store it in the database.
   *
   * @param special the {@link SpecialEto} to create.
   * @return the new {@link SpecialEto} that has been saved with ID and version.
   */
  SpecialEto saveSpecial(SpecialEto special);

}
