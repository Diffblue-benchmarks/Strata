package com.opengamma.strata.pricer.swaption;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrSwaptionPhysicalProductPricerDiffblueTest {
  /**
   * Test {@link
   * SabrSwaptionPhysicalProductPricer#SabrSwaptionPhysicalProductPricer(DiscountingSwapProductPricer)}.
   *
   * <ul>
   *   <li>Then return SwapPricer is {@link DiscountingSwapProductPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrSwaptionPhysicalProductPricer#SabrSwaptionPhysicalProductPricer(DiscountingSwapProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new SabrSwaptionPhysicalProductPricer(DiscountingSwapProductPricer); then return SwapPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SabrSwaptionPhysicalProductPricer.<init>(DiscountingSwapProductPricer)"})
  void testNewSabrSwaptionPhysicalProductPricer_thenReturnSwapPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapProductPricer.DEFAULT,
        new SabrSwaptionPhysicalProductPricer(DiscountingSwapProductPricer.DEFAULT)
            .getSwapPricer());
  }
}
