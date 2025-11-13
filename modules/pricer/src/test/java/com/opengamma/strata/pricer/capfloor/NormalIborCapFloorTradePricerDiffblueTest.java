package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.DiscountingPaymentPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NormalIborCapFloorTradePricerDiffblueTest {
  /**
   * Test {@link
   * NormalIborCapFloorTradePricer#NormalIborCapFloorTradePricer(NormalIborCapFloorProductPricer,
   * DiscountingPaymentPricer)}.
   *
   * <ul>
   *   <li>Then return PaymentPricer is {@link DiscountingPaymentPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalIborCapFloorTradePricer#NormalIborCapFloorTradePricer(NormalIborCapFloorProductPricer,
   * DiscountingPaymentPricer)}
   */
  @Test
  @DisplayName(
      "Test new NormalIborCapFloorTradePricer(NormalIborCapFloorProductPricer, DiscountingPaymentPricer); then return PaymentPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NormalIborCapFloorTradePricer.<init>(NormalIborCapFloorProductPricer, DiscountingPaymentPricer)"
  })
  void testNewNormalIborCapFloorTradePricer_thenReturnPaymentPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingPaymentPricer.DEFAULT,
        new NormalIborCapFloorTradePricer(
                NormalIborCapFloorProductPricer.DEFAULT, DiscountingPaymentPricer.DEFAULT)
            .getPaymentPricer());
  }
}
