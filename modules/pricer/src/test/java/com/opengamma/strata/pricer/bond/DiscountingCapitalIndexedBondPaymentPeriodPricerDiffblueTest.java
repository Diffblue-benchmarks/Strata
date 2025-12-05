package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.impl.rate.DispatchingRateComputationFn;
import com.opengamma.strata.pricer.rate.RateComputationFn;
import com.opengamma.strata.product.rate.RateComputation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingCapitalIndexedBondPaymentPeriodPricerDiffblueTest {
  /**
   * Test {@link
   * DiscountingCapitalIndexedBondPaymentPeriodPricer#DiscountingCapitalIndexedBondPaymentPeriodPricer(RateComputationFn)}.
   *
   * <p>Method under test: {@link
   * DiscountingCapitalIndexedBondPaymentPeriodPricer#DiscountingCapitalIndexedBondPaymentPeriodPricer(RateComputationFn)}
   */
  @Test
  @DisplayName("Test new DiscountingCapitalIndexedBondPaymentPeriodPricer(RateComputationFn)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DiscountingCapitalIndexedBondPaymentPeriodPricer.<init>(RateComputationFn)"
  })
  void testNewDiscountingCapitalIndexedBondPaymentPeriodPricer() {
    // Arrange, Act and Assert
    RateComputationFn<RateComputation> rateComputationFn =
        new DiscountingCapitalIndexedBondPaymentPeriodPricer(DispatchingRateComputationFn.DEFAULT)
            .getRateComputationFn();
    assertTrue(rateComputationFn instanceof DispatchingRateComputationFn);
    assertSame(DispatchingRateComputationFn.DEFAULT, rateComputationFn);
  }

  /**
   * Test {@link DiscountingCapitalIndexedBondPaymentPeriodPricer#getRateComputationFn()}.
   *
   * <p>Method under test: {@link
   * DiscountingCapitalIndexedBondPaymentPeriodPricer#getRateComputationFn()}
   */
  @Test
  @DisplayName("Test getRateComputationFn()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RateComputationFn DiscountingCapitalIndexedBondPaymentPeriodPricer.getRateComputationFn()"
  })
  void testGetRateComputationFn() {
    // Arrange, Act and Assert
    assertTrue(
        new DiscountingCapitalIndexedBondPaymentPeriodPricer(DispatchingRateComputationFn.DEFAULT)
                .getRateComputationFn()
            instanceof DispatchingRateComputationFn);
  }
}
