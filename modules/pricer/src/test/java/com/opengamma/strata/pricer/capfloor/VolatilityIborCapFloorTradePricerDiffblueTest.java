package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.DiscountingPaymentPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class VolatilityIborCapFloorTradePricerDiffblueTest {
  /**
   * Test {@link
   * VolatilityIborCapFloorTradePricer#VolatilityIborCapFloorTradePricer(VolatilityIborCapFloorProductPricer,
   * DiscountingPaymentPricer)}.
   *
   * <ul>
   *   <li>Then return PaymentPricer is {@link DiscountingPaymentPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * VolatilityIborCapFloorTradePricer#VolatilityIborCapFloorTradePricer(VolatilityIborCapFloorProductPricer,
   * DiscountingPaymentPricer)}
   */
  @Test
  @DisplayName(
      "Test new VolatilityIborCapFloorTradePricer(VolatilityIborCapFloorProductPricer, DiscountingPaymentPricer); then return PaymentPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void VolatilityIborCapFloorTradePricer.<init>(VolatilityIborCapFloorProductPricer, DiscountingPaymentPricer)"
  })
  void testNewVolatilityIborCapFloorTradePricer_thenReturnPaymentPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingPaymentPricer.DEFAULT,
        new VolatilityIborCapFloorTradePricer(
                BlackIborCapFloorProductPricer.DEFAULT, DiscountingPaymentPricer.DEFAULT)
            .getPaymentPricer());
  }

  /**
   * Test {@link VolatilityIborCapFloorTradePricer#getPaymentPricer()}.
   *
   * <p>Method under test: {@link VolatilityIborCapFloorTradePricer#getPaymentPricer()}
   */
  @Test
  @DisplayName("Test getPaymentPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingPaymentPricer VolatilityIborCapFloorTradePricer.getPaymentPricer()"
  })
  void testGetPaymentPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingPaymentPricer.DEFAULT,
        new VolatilityIborCapFloorTradePricer(
                BlackIborCapFloorProductPricer.DEFAULT, DiscountingPaymentPricer.DEFAULT)
            .getPaymentPricer());
  }
}
