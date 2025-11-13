package com.opengamma.strata.pricer.swaption;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class VolatilitySwaptionPhysicalProductPricerDiffblueTest {
  /**
   * Test {@link
   * VolatilitySwaptionPhysicalProductPricer#VolatilitySwaptionPhysicalProductPricer(DiscountingSwapProductPricer)}.
   *
   * <ul>
   *   <li>Then return SwapPricer is {@link DiscountingSwapProductPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * VolatilitySwaptionPhysicalProductPricer#VolatilitySwaptionPhysicalProductPricer(DiscountingSwapProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new VolatilitySwaptionPhysicalProductPricer(DiscountingSwapProductPricer); then return SwapPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void VolatilitySwaptionPhysicalProductPricer.<init>(DiscountingSwapProductPricer)"
  })
  void testNewVolatilitySwaptionPhysicalProductPricer_thenReturnSwapPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapProductPricer.DEFAULT,
        new VolatilitySwaptionPhysicalProductPricer(DiscountingSwapProductPricer.DEFAULT)
            .getSwapPricer());
  }

  /**
   * Test {@link VolatilitySwaptionPhysicalProductPricer#getSwapPricer()}.
   *
   * <p>Method under test: {@link VolatilitySwaptionPhysicalProductPricer#getSwapPricer()}
   */
  @Test
  @DisplayName("Test getSwapPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingSwapProductPricer VolatilitySwaptionPhysicalProductPricer.getSwapPricer()"
  })
  void testGetSwapPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapProductPricer.DEFAULT,
        new VolatilitySwaptionPhysicalProductPricer(DiscountingSwapProductPricer.DEFAULT)
            .getSwapPricer());
  }
}
