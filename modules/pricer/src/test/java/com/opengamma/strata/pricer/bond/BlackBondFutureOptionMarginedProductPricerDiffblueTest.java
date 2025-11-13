package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BlackBondFutureOptionMarginedProductPricerDiffblueTest {
  /**
   * Test {@link
   * BlackBondFutureOptionMarginedProductPricer#BlackBondFutureOptionMarginedProductPricer(DiscountingBondFutureProductPricer)}.
   *
   * <p>Method under test: {@link
   * BlackBondFutureOptionMarginedProductPricer#BlackBondFutureOptionMarginedProductPricer(DiscountingBondFutureProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new BlackBondFutureOptionMarginedProductPricer(DiscountingBondFutureProductPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BlackBondFutureOptionMarginedProductPricer.<init>(DiscountingBondFutureProductPricer)"
  })
  void testNewBlackBondFutureOptionMarginedProductPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingBondFutureProductPricer.DEFAULT,
        new BlackBondFutureOptionMarginedProductPricer(DiscountingBondFutureProductPricer.DEFAULT)
            .getFuturePricer());
  }

  /**
   * Test {@link BlackBondFutureOptionMarginedProductPricer#getFuturePricer()}.
   *
   * <p>Method under test: {@link BlackBondFutureOptionMarginedProductPricer#getFuturePricer()}
   */
  @Test
  @DisplayName("Test getFuturePricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingBondFutureProductPricer BlackBondFutureOptionMarginedProductPricer.getFuturePricer()"
  })
  void testGetFuturePricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingBondFutureProductPricer.DEFAULT,
        new BlackBondFutureOptionMarginedProductPricer(DiscountingBondFutureProductPricer.DEFAULT)
            .getFuturePricer());
  }
}
