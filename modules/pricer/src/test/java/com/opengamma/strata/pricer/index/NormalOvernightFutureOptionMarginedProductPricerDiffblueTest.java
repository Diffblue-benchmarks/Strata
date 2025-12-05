package com.opengamma.strata.pricer.index;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NormalOvernightFutureOptionMarginedProductPricerDiffblueTest {
  /**
   * Test {@link
   * NormalOvernightFutureOptionMarginedProductPricer#NormalOvernightFutureOptionMarginedProductPricer(DiscountingOvernightFutureProductPricer)}.
   *
   * <p>Method under test: {@link
   * NormalOvernightFutureOptionMarginedProductPricer#NormalOvernightFutureOptionMarginedProductPricer(DiscountingOvernightFutureProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new NormalOvernightFutureOptionMarginedProductPricer(DiscountingOvernightFutureProductPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NormalOvernightFutureOptionMarginedProductPricer.<init>(DiscountingOvernightFutureProductPricer)"
  })
  void testNewNormalOvernightFutureOptionMarginedProductPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingOvernightFutureProductPricer.DEFAULT,
        new NormalOvernightFutureOptionMarginedProductPricer(
                DiscountingOvernightFutureProductPricer.DEFAULT)
            .getFuturePricer());
  }

  /**
   * Test {@link NormalOvernightFutureOptionMarginedProductPricer#getFuturePricer()}.
   *
   * <p>Method under test: {@link
   * NormalOvernightFutureOptionMarginedProductPricer#getFuturePricer()}
   */
  @Test
  @DisplayName("Test getFuturePricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingOvernightFutureProductPricer NormalOvernightFutureOptionMarginedProductPricer.getFuturePricer()"
  })
  void testGetFuturePricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingOvernightFutureProductPricer.DEFAULT,
        new NormalOvernightFutureOptionMarginedProductPricer(
                DiscountingOvernightFutureProductPricer.DEFAULT)
            .getFuturePricer());
  }
}
