package com.opengamma.strata.pricer.swaption;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NormalSwaptionCashParYieldProductPricerDiffblueTest {
  /**
   * Test {@link
   * NormalSwaptionCashParYieldProductPricer#NormalSwaptionCashParYieldProductPricer(DiscountingSwapProductPricer)}.
   *
   * <ul>
   *   <li>Then return SwapPricer is {@link DiscountingSwapProductPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalSwaptionCashParYieldProductPricer#NormalSwaptionCashParYieldProductPricer(DiscountingSwapProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new NormalSwaptionCashParYieldProductPricer(DiscountingSwapProductPricer); then return SwapPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NormalSwaptionCashParYieldProductPricer.<init>(DiscountingSwapProductPricer)"
  })
  void testNewNormalSwaptionCashParYieldProductPricer_thenReturnSwapPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapProductPricer.DEFAULT,
        new NormalSwaptionCashParYieldProductPricer(DiscountingSwapProductPricer.DEFAULT)
            .getSwapPricer());
  }
}
