package com.opengamma.strata.pricer.swap;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingSwapTradePricerDiffblueTest {
  /**
   * Test {@link
   * DiscountingSwapTradePricer#DiscountingSwapTradePricer(DiscountingSwapProductPricer)}.
   *
   * <ul>
   *   <li>When {@link DiscountingSwapProductPricer#DEFAULT}.
   *   <li>Then return ProductPricer is {@link DiscountingSwapProductPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DiscountingSwapTradePricer#DiscountingSwapTradePricer(DiscountingSwapProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new DiscountingSwapTradePricer(DiscountingSwapProductPricer); when DEFAULT; then return ProductPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DiscountingSwapTradePricer.<init>(DiscountingSwapProductPricer)"})
  void testNewDiscountingSwapTradePricer_whenDefault_thenReturnProductPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapProductPricer.DEFAULT,
        new DiscountingSwapTradePricer(DiscountingSwapProductPricer.DEFAULT).getProductPricer());
  }

  /**
   * Test {@link DiscountingSwapTradePricer#getProductPricer()}.
   *
   * <p>Method under test: {@link DiscountingSwapTradePricer#getProductPricer()}
   */
  @Test
  @DisplayName("Test getProductPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DiscountingSwapProductPricer DiscountingSwapTradePricer.getProductPricer()"})
  void testGetProductPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapProductPricer.DEFAULT,
        new DiscountingSwapTradePricer(DiscountingSwapProductPricer.DEFAULT).getProductPricer());
  }
}
