package com.opengamma.strata.pricer.swaption;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BlackSwaptionCashParYieldProductPricerDiffblueTest {
  /**
   * Test {@link
   * BlackSwaptionCashParYieldProductPricer#BlackSwaptionCashParYieldProductPricer(DiscountingSwapProductPricer)}.
   *
   * <ul>
   *   <li>Then return SwapPricer is {@link DiscountingSwapProductPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackSwaptionCashParYieldProductPricer#BlackSwaptionCashParYieldProductPricer(DiscountingSwapProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new BlackSwaptionCashParYieldProductPricer(DiscountingSwapProductPricer); then return SwapPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BlackSwaptionCashParYieldProductPricer.<init>(DiscountingSwapProductPricer)"
  })
  void testNewBlackSwaptionCashParYieldProductPricer_thenReturnSwapPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapProductPricer.DEFAULT,
        new BlackSwaptionCashParYieldProductPricer(DiscountingSwapProductPricer.DEFAULT)
            .getSwapPricer());
  }
}
