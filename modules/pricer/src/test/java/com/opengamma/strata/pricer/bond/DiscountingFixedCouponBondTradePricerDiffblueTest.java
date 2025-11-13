package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.DiscountingPaymentPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingFixedCouponBondTradePricerDiffblueTest {
  /**
   * Test {@link
   * DiscountingFixedCouponBondTradePricer#DiscountingFixedCouponBondTradePricer(DiscountingFixedCouponBondProductPricer,
   * DiscountingPaymentPricer)}.
   *
   * <ul>
   *   <li>Then return ProductPricer is {@link DiscountingFixedCouponBondProductPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DiscountingFixedCouponBondTradePricer#DiscountingFixedCouponBondTradePricer(DiscountingFixedCouponBondProductPricer,
   * DiscountingPaymentPricer)}
   */
  @Test
  @DisplayName(
      "Test new DiscountingFixedCouponBondTradePricer(DiscountingFixedCouponBondProductPricer, DiscountingPaymentPricer); then return ProductPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DiscountingFixedCouponBondTradePricer.<init>(DiscountingFixedCouponBondProductPricer, DiscountingPaymentPricer)"
  })
  void testNewDiscountingFixedCouponBondTradePricer_thenReturnProductPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingFixedCouponBondProductPricer.DEFAULT,
        new DiscountingFixedCouponBondTradePricer(
                BondFuturesUtils.PRICER_BOND, DiscountingPaymentPricer.DEFAULT)
            .getProductPricer());
  }

  /**
   * Test {@link DiscountingFixedCouponBondTradePricer#getProductPricer()}.
   *
   * <p>Method under test: {@link DiscountingFixedCouponBondTradePricer#getProductPricer()}
   */
  @Test
  @DisplayName("Test getProductPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingFixedCouponBondProductPricer DiscountingFixedCouponBondTradePricer.getProductPricer()"
  })
  void testGetProductPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingFixedCouponBondProductPricer.DEFAULT,
        new DiscountingFixedCouponBondTradePricer(
                BondFuturesUtils.PRICER_BOND, DiscountingPaymentPricer.DEFAULT)
            .getProductPricer());
  }
}
