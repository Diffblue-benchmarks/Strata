package com.opengamma.strata.pricer.swap;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingSwapProductPricerDiffblueTest {
  /**
   * Test {@link
   * DiscountingSwapProductPricer#DiscountingSwapProductPricer(DiscountingSwapLegPricer)}.
   *
   * <ul>
   *   <li>When {@link DiscountingSwapLegPricer#DEFAULT}.
   *   <li>Then return LegPricer is {@link DiscountingSwapLegPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DiscountingSwapProductPricer#DiscountingSwapProductPricer(DiscountingSwapLegPricer)}
   */
  @Test
  @DisplayName(
      "Test new DiscountingSwapProductPricer(DiscountingSwapLegPricer); when DEFAULT; then return LegPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DiscountingSwapProductPricer.<init>(DiscountingSwapLegPricer)"})
  void testNewDiscountingSwapProductPricer_whenDefault_thenReturnLegPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapLegPricer.DEFAULT,
        new DiscountingSwapProductPricer(DiscountingSwapLegPricer.DEFAULT).getLegPricer());
  }

  /**
   * Test {@link DiscountingSwapProductPricer#getLegPricer()}.
   *
   * <p>Method under test: {@link DiscountingSwapProductPricer#getLegPricer()}
   */
  @Test
  @DisplayName("Test getLegPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DiscountingSwapLegPricer DiscountingSwapProductPricer.getLegPricer()"})
  void testGetLegPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapLegPricer.DEFAULT,
        new DiscountingSwapProductPricer(DiscountingSwapLegPricer.DEFAULT).getLegPricer());
  }
}
