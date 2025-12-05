package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.impl.rate.DispatchingRateComputationFn;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingCapitalIndexedBondProductPricerDiffblueTest {
  /**
   * Test {@link
   * DiscountingCapitalIndexedBondProductPricer#DiscountingCapitalIndexedBondProductPricer(DiscountingCapitalIndexedBondPaymentPeriodPricer)}.
   *
   * <p>Method under test: {@link
   * DiscountingCapitalIndexedBondProductPricer#DiscountingCapitalIndexedBondProductPricer(DiscountingCapitalIndexedBondPaymentPeriodPricer)}
   */
  @Test
  @DisplayName(
      "Test new DiscountingCapitalIndexedBondProductPricer(DiscountingCapitalIndexedBondPaymentPeriodPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DiscountingCapitalIndexedBondProductPricer.<init>(DiscountingCapitalIndexedBondPaymentPeriodPricer)"
  })
  void testNewDiscountingCapitalIndexedBondProductPricer() {
    // Arrange, Act and Assert
    DiscountingCapitalIndexedBondPaymentPeriodPricer periodPricer =
        new DiscountingCapitalIndexedBondProductPricer(
                DiscountingCapitalIndexedBondPaymentPeriodPricer.DEFAULT)
            .getPeriodPricer();
    assertTrue(periodPricer.getRateComputationFn() instanceof DispatchingRateComputationFn);
    assertSame(DiscountingCapitalIndexedBondPaymentPeriodPricer.DEFAULT, periodPricer);
  }

  /**
   * Test {@link DiscountingCapitalIndexedBondProductPricer#getPeriodPricer()}.
   *
   * <p>Method under test: {@link DiscountingCapitalIndexedBondProductPricer#getPeriodPricer()}
   */
  @Test
  @DisplayName("Test getPeriodPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingCapitalIndexedBondPaymentPeriodPricer DiscountingCapitalIndexedBondProductPricer.getPeriodPricer()"
  })
  void testGetPeriodPricer() {
    // Arrange and Act
    DiscountingCapitalIndexedBondPaymentPeriodPricer actualPeriodPricer =
        new DiscountingCapitalIndexedBondProductPricer(
                DiscountingCapitalIndexedBondPaymentPeriodPricer.DEFAULT)
            .getPeriodPricer();

    // Assert
    assertTrue(actualPeriodPricer.getRateComputationFn() instanceof DispatchingRateComputationFn);
    assertSame(DiscountingCapitalIndexedBondPaymentPeriodPricer.DEFAULT, actualPeriodPricer);
  }
}
