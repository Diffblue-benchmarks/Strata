package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.DiscountingPaymentPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrIborCapFloorTradePricerDiffblueTest {
  /**
   * Test {@link
   * SabrIborCapFloorTradePricer#SabrIborCapFloorTradePricer(SabrIborCapFloorProductPricer,
   * DiscountingPaymentPricer)}.
   *
   * <ul>
   *   <li>When {@link SabrIborCapFloorProductPricer#DEFAULT}.
   *   <li>Then return PaymentPricer is {@link DiscountingPaymentPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrIborCapFloorTradePricer#SabrIborCapFloorTradePricer(SabrIborCapFloorProductPricer,
   * DiscountingPaymentPricer)}
   */
  @Test
  @DisplayName(
      "Test new SabrIborCapFloorTradePricer(SabrIborCapFloorProductPricer, DiscountingPaymentPricer); when DEFAULT; then return PaymentPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SabrIborCapFloorTradePricer.<init>(SabrIborCapFloorProductPricer, DiscountingPaymentPricer)"
  })
  void testNewSabrIborCapFloorTradePricer_whenDefault_thenReturnPaymentPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingPaymentPricer.DEFAULT,
        new SabrIborCapFloorTradePricer(
                SabrIborCapFloorProductPricer.DEFAULT, DiscountingPaymentPricer.DEFAULT)
            .getPaymentPricer());
  }
}
