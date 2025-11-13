package com.opengamma.strata.pricer.fxopt;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.fx.DiscountingFxSingleProductPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BlackFxVanillaOptionProductPricerDiffblueTest {
  /**
   * Test {@link
   * BlackFxVanillaOptionProductPricer#BlackFxVanillaOptionProductPricer(DiscountingFxSingleProductPricer)}.
   *
   * <p>Method under test: {@link
   * BlackFxVanillaOptionProductPricer#BlackFxVanillaOptionProductPricer(DiscountingFxSingleProductPricer)}
   */
  @Test
  @DisplayName("Test new BlackFxVanillaOptionProductPricer(DiscountingFxSingleProductPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BlackFxVanillaOptionProductPricer.<init>(DiscountingFxSingleProductPricer)"
  })
  void testNewBlackFxVanillaOptionProductPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingFxSingleProductPricer.DEFAULT,
        new BlackFxVanillaOptionProductPricer(DiscountingFxSingleProductPricer.DEFAULT)
            .getDiscountingFxSingleProductPricer());
  }

  /**
   * Test {@link BlackFxVanillaOptionProductPricer#getDiscountingFxSingleProductPricer()}.
   *
   * <p>Method under test: {@link
   * BlackFxVanillaOptionProductPricer#getDiscountingFxSingleProductPricer()}
   */
  @Test
  @DisplayName("Test getDiscountingFxSingleProductPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingFxSingleProductPricer BlackFxVanillaOptionProductPricer.getDiscountingFxSingleProductPricer()"
  })
  void testGetDiscountingFxSingleProductPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingFxSingleProductPricer.DEFAULT,
        new BlackFxVanillaOptionProductPricer(DiscountingFxSingleProductPricer.DEFAULT)
            .getDiscountingFxSingleProductPricer());
  }
}
