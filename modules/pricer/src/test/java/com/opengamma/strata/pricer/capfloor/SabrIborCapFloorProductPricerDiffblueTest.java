package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.swap.DiscountingSwapLegPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrIborCapFloorProductPricerDiffblueTest {
  /**
   * Test {@link
   * SabrIborCapFloorProductPricer#SabrIborCapFloorProductPricer(SabrIborCapFloorLegPricer,
   * DiscountingSwapLegPricer)}.
   *
   * <ul>
   *   <li>When {@link SabrIborCapFloorLegPricer#DEFAULT}.
   *   <li>Then return PayLegPricer is {@link DiscountingSwapLegPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrIborCapFloorProductPricer#SabrIborCapFloorProductPricer(SabrIborCapFloorLegPricer,
   * DiscountingSwapLegPricer)}
   */
  @Test
  @DisplayName(
      "Test new SabrIborCapFloorProductPricer(SabrIborCapFloorLegPricer, DiscountingSwapLegPricer); when DEFAULT; then return PayLegPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SabrIborCapFloorProductPricer.<init>(SabrIborCapFloorLegPricer, DiscountingSwapLegPricer)"
  })
  void testNewSabrIborCapFloorProductPricer_whenDefault_thenReturnPayLegPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapLegPricer.DEFAULT,
        new SabrIborCapFloorProductPricer(
                SabrIborCapFloorLegPricer.DEFAULT, DiscountingSwapLegPricer.DEFAULT)
            .getPayLegPricer());
  }
}
