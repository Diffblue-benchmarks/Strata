package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.DiscountingPaymentPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingBillTradePricerDiffblueTest {
  /**
   * Test {@link DiscountingBillTradePricer#DiscountingBillTradePricer(DiscountingBillProductPricer,
   * DiscountingPaymentPricer)}.
   *
   * <ul>
   *   <li>When {@link DiscountingBillProductPricer#DEFAULT}.
   *   <li>Then return ProductPricer is {@link DiscountingBillProductPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DiscountingBillTradePricer#DiscountingBillTradePricer(DiscountingBillProductPricer,
   * DiscountingPaymentPricer)}
   */
  @Test
  @DisplayName(
      "Test new DiscountingBillTradePricer(DiscountingBillProductPricer, DiscountingPaymentPricer); when DEFAULT; then return ProductPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DiscountingBillTradePricer.<init>(DiscountingBillProductPricer, DiscountingPaymentPricer)"
  })
  void testNewDiscountingBillTradePricer_whenDefault_thenReturnProductPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingBillProductPricer.DEFAULT,
        new DiscountingBillTradePricer(
                DiscountingBillProductPricer.DEFAULT, DiscountingPaymentPricer.DEFAULT)
            .getProductPricer());
  }

  /**
   * Test {@link DiscountingBillTradePricer#getProductPricer()}.
   *
   * <p>Method under test: {@link DiscountingBillTradePricer#getProductPricer()}
   */
  @Test
  @DisplayName("Test getProductPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DiscountingBillProductPricer DiscountingBillTradePricer.getProductPricer()"})
  void testGetProductPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingBillProductPricer.DEFAULT,
        new DiscountingBillTradePricer(
                DiscountingBillProductPricer.DEFAULT, DiscountingPaymentPricer.DEFAULT)
            .getProductPricer());
  }
}
