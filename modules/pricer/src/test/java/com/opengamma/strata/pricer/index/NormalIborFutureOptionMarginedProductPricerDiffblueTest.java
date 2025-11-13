package com.opengamma.strata.pricer.index;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NormalIborFutureOptionMarginedProductPricerDiffblueTest {
  /**
   * Test {@link
   * NormalIborFutureOptionMarginedProductPricer#NormalIborFutureOptionMarginedProductPricer(DiscountingIborFutureProductPricer)}.
   *
   * <p>Method under test: {@link
   * NormalIborFutureOptionMarginedProductPricer#NormalIborFutureOptionMarginedProductPricer(DiscountingIborFutureProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new NormalIborFutureOptionMarginedProductPricer(DiscountingIborFutureProductPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NormalIborFutureOptionMarginedProductPricer.<init>(DiscountingIborFutureProductPricer)"
  })
  void testNewNormalIborFutureOptionMarginedProductPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingIborFutureProductPricer.DEFAULT,
        new NormalIborFutureOptionMarginedProductPricer(DiscountingIborFutureProductPricer.DEFAULT)
            .getFuturePricer());
  }

  /**
   * Test {@link NormalIborFutureOptionMarginedProductPricer#getFuturePricer()}.
   *
   * <p>Method under test: {@link NormalIborFutureOptionMarginedProductPricer#getFuturePricer()}
   */
  @Test
  @DisplayName("Test getFuturePricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingIborFutureProductPricer NormalIborFutureOptionMarginedProductPricer.getFuturePricer()"
  })
  void testGetFuturePricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingIborFutureProductPricer.DEFAULT,
        new NormalIborFutureOptionMarginedProductPricer(DiscountingIborFutureProductPricer.DEFAULT)
            .getFuturePricer());
  }
}
