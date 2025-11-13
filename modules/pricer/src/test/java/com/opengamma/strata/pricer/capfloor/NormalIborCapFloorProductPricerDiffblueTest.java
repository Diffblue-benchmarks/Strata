package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.swap.DiscountingSwapLegPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NormalIborCapFloorProductPricerDiffblueTest {
  /**
   * Test {@link
   * NormalIborCapFloorProductPricer#NormalIborCapFloorProductPricer(NormalIborCapFloorLegPricer,
   * DiscountingSwapLegPricer)}.
   *
   * <ul>
   *   <li>Then return PayLegPricer is {@link DiscountingSwapLegPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalIborCapFloorProductPricer#NormalIborCapFloorProductPricer(NormalIborCapFloorLegPricer,
   * DiscountingSwapLegPricer)}
   */
  @Test
  @DisplayName(
      "Test new NormalIborCapFloorProductPricer(NormalIborCapFloorLegPricer, DiscountingSwapLegPricer); then return PayLegPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NormalIborCapFloorProductPricer.<init>(NormalIborCapFloorLegPricer, DiscountingSwapLegPricer)"
  })
  void testNewNormalIborCapFloorProductPricer_thenReturnPayLegPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapLegPricer.DEFAULT,
        new NormalIborCapFloorProductPricer(
                NormalIborCapFloorLegPricer.DEFAULT, DiscountingSwapLegPricer.DEFAULT)
            .getPayLegPricer());
  }
}
