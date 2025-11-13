package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BlackFixedCouponBondOptionPricerDiffblueTest {
  /**
   * Test {@link
   * BlackFixedCouponBondOptionPricer#BlackFixedCouponBondOptionPricer(DiscountingFixedCouponBondProductPricer)}.
   *
   * <ul>
   *   <li>Then return BondPricer is {@link DiscountingFixedCouponBondProductPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackFixedCouponBondOptionPricer#BlackFixedCouponBondOptionPricer(DiscountingFixedCouponBondProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new BlackFixedCouponBondOptionPricer(DiscountingFixedCouponBondProductPricer); then return BondPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BlackFixedCouponBondOptionPricer.<init>(DiscountingFixedCouponBondProductPricer)"
  })
  void testNewBlackFixedCouponBondOptionPricer_thenReturnBondPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingFixedCouponBondProductPricer.DEFAULT,
        new BlackFixedCouponBondOptionPricer(BondFuturesUtils.PRICER_BOND).getBondPricer());
  }

  /**
   * Test {@link BlackFixedCouponBondOptionPricer#getBondPricer()}.
   *
   * <p>Method under test: {@link BlackFixedCouponBondOptionPricer#getBondPricer()}
   */
  @Test
  @DisplayName("Test getBondPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingFixedCouponBondProductPricer BlackFixedCouponBondOptionPricer.getBondPricer()"
  })
  void testGetBondPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingFixedCouponBondProductPricer.DEFAULT,
        new BlackFixedCouponBondOptionPricer(BondFuturesUtils.PRICER_BOND).getBondPricer());
  }
}
