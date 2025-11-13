package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.DiscountingPaymentPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BlackIborCapFloorTradePricerDiffblueTest {
  /**
   * Test {@link
   * BlackIborCapFloorTradePricer#BlackIborCapFloorTradePricer(BlackIborCapFloorProductPricer,
   * DiscountingPaymentPricer)}.
   *
   * <ul>
   *   <li>When {@link BlackIborCapFloorProductPricer#DEFAULT}.
   *   <li>Then return PaymentPricer is {@link DiscountingPaymentPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackIborCapFloorTradePricer#BlackIborCapFloorTradePricer(BlackIborCapFloorProductPricer,
   * DiscountingPaymentPricer)}
   */
  @Test
  @DisplayName(
      "Test new BlackIborCapFloorTradePricer(BlackIborCapFloorProductPricer, DiscountingPaymentPricer); when DEFAULT; then return PaymentPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BlackIborCapFloorTradePricer.<init>(BlackIborCapFloorProductPricer, DiscountingPaymentPricer)"
  })
  void testNewBlackIborCapFloorTradePricer_whenDefault_thenReturnPaymentPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingPaymentPricer.DEFAULT,
        new BlackIborCapFloorTradePricer(
                BlackIborCapFloorProductPricer.DEFAULT, DiscountingPaymentPricer.DEFAULT)
            .getPaymentPricer());
  }
}
