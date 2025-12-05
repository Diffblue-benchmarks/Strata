package com.opengamma.strata.pricer.payment;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.DiscountingPaymentPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingBulletPaymentTradePricerDiffblueTest {
  /**
   * Test {@link
   * DiscountingBulletPaymentTradePricer#DiscountingBulletPaymentTradePricer(DiscountingPaymentPricer)}.
   *
   * <ul>
   *   <li>Then return PaymentPricer is {@link DiscountingPaymentPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DiscountingBulletPaymentTradePricer#DiscountingBulletPaymentTradePricer(DiscountingPaymentPricer)}
   */
  @Test
  @DisplayName(
      "Test new DiscountingBulletPaymentTradePricer(DiscountingPaymentPricer); then return PaymentPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DiscountingBulletPaymentTradePricer.<init>(DiscountingPaymentPricer)"})
  void testNewDiscountingBulletPaymentTradePricer_thenReturnPaymentPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingPaymentPricer.DEFAULT,
        new DiscountingBulletPaymentTradePricer(DiscountingPaymentPricer.DEFAULT)
            .getPaymentPricer());
  }

  /**
   * Test {@link DiscountingBulletPaymentTradePricer#getPaymentPricer()}.
   *
   * <p>Method under test: {@link DiscountingBulletPaymentTradePricer#getPaymentPricer()}
   */
  @Test
  @DisplayName("Test getPaymentPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingPaymentPricer DiscountingBulletPaymentTradePricer.getPaymentPricer()"
  })
  void testGetPaymentPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingPaymentPricer.DEFAULT,
        new DiscountingBulletPaymentTradePricer(DiscountingPaymentPricer.DEFAULT)
            .getPaymentPricer());
  }
}
