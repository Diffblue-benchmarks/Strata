package com.opengamma.strata.pricer.dsf;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingDsfProductPricerDiffblueTest {
  /**
   * Test {@link
   * DiscountingDsfProductPricer#DiscountingDsfProductPricer(DiscountingSwapProductPricer)}.
   *
   * <ul>
   *   <li>When {@link DiscountingSwapProductPricer#DEFAULT}.
   *   <li>Then return SwapPricer is {@link DiscountingSwapProductPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DiscountingDsfProductPricer#DiscountingDsfProductPricer(DiscountingSwapProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new DiscountingDsfProductPricer(DiscountingSwapProductPricer); when DEFAULT; then return SwapPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DiscountingDsfProductPricer.<init>(DiscountingSwapProductPricer)"})
  void testNewDiscountingDsfProductPricer_whenDefault_thenReturnSwapPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapProductPricer.DEFAULT,
        new DiscountingDsfProductPricer(DiscountingSwapProductPricer.DEFAULT).getSwapPricer());
  }

  /**
   * Test {@link DiscountingDsfProductPricer#getSwapPricer()}.
   *
   * <p>Method under test: {@link DiscountingDsfProductPricer#getSwapPricer()}
   */
  @Test
  @DisplayName("Test getSwapPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DiscountingSwapProductPricer DiscountingDsfProductPricer.getSwapPricer()"})
  void testGetSwapPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapProductPricer.DEFAULT,
        new DiscountingDsfProductPricer(DiscountingSwapProductPricer.DEFAULT).getSwapPricer());
  }
}
