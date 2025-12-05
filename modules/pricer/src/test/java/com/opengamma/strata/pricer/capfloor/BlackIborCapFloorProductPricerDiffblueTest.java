package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.swap.DiscountingSwapLegPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BlackIborCapFloorProductPricerDiffblueTest {
  /**
   * Test {@link
   * BlackIborCapFloorProductPricer#BlackIborCapFloorProductPricer(BlackIborCapFloorLegPricer,
   * DiscountingSwapLegPricer)}.
   *
   * <ul>
   *   <li>Then return PayLegPricer is {@link DiscountingSwapLegPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackIborCapFloorProductPricer#BlackIborCapFloorProductPricer(BlackIborCapFloorLegPricer,
   * DiscountingSwapLegPricer)}
   */
  @Test
  @DisplayName(
      "Test new BlackIborCapFloorProductPricer(BlackIborCapFloorLegPricer, DiscountingSwapLegPricer); then return PayLegPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void BlackIborCapFloorProductPricer.<init>(BlackIborCapFloorLegPricer, DiscountingSwapLegPricer)"
  })
  void testNewBlackIborCapFloorProductPricer_thenReturnPayLegPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapLegPricer.DEFAULT,
        new BlackIborCapFloorProductPricer(
                BlackIborCapFloorLegPricer.DEFAULT, DiscountingSwapLegPricer.DEFAULT)
            .getPayLegPricer());
  }
}
