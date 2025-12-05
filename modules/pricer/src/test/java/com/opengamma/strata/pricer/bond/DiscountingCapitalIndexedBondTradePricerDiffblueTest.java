package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.impl.rate.DispatchingRateComputationFn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingCapitalIndexedBondTradePricerDiffblueTest {
  /**
   * Test {@link
   * DiscountingCapitalIndexedBondTradePricer#DiscountingCapitalIndexedBondTradePricer(DiscountingCapitalIndexedBondProductPricer)}.
   *
   * <p>Method under test: {@link
   * DiscountingCapitalIndexedBondTradePricer#DiscountingCapitalIndexedBondTradePricer(DiscountingCapitalIndexedBondProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new DiscountingCapitalIndexedBondTradePricer(DiscountingCapitalIndexedBondProductPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DiscountingCapitalIndexedBondTradePricer.<init>(DiscountingCapitalIndexedBondProductPricer)"
  })
  void testNewDiscountingCapitalIndexedBondTradePricer() {
    // Arrange, Act and Assert
    DiscountingCapitalIndexedBondProductPricer productPricer =
        new DiscountingCapitalIndexedBondTradePricer(
                DiscountingCapitalIndexedBondProductPricer.DEFAULT)
            .getProductPricer();
    assertTrue(
        productPricer.getPeriodPricer().getRateComputationFn()
            instanceof DispatchingRateComputationFn);
    assertSame(DiscountingCapitalIndexedBondProductPricer.DEFAULT, productPricer);
  }

  /**
   * Test {@link DiscountingCapitalIndexedBondTradePricer#getProductPricer()}.
   *
   * <p>Method under test: {@link DiscountingCapitalIndexedBondTradePricer#getProductPricer()}
   */
  @Test
  @DisplayName("Test getProductPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingCapitalIndexedBondProductPricer DiscountingCapitalIndexedBondTradePricer.getProductPricer()"
  })
  void testGetProductPricer() {
    // Arrange and Act
    DiscountingCapitalIndexedBondProductPricer actualProductPricer =
        new DiscountingCapitalIndexedBondTradePricer(
                DiscountingCapitalIndexedBondProductPricer.DEFAULT)
            .getProductPricer();

    // Assert
    assertTrue(
        actualProductPricer.getPeriodPricer().getRateComputationFn()
            instanceof DispatchingRateComputationFn);
    assertSame(DiscountingCapitalIndexedBondProductPricer.DEFAULT, actualProductPricer);
  }
}
