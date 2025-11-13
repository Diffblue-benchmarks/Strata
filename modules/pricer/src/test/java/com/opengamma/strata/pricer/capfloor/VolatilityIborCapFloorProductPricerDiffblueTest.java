package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.swap.DiscountingSwapLegPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class VolatilityIborCapFloorProductPricerDiffblueTest {
  /**
   * Test {@link
   * VolatilityIborCapFloorProductPricer#VolatilityIborCapFloorProductPricer(VolatilityIborCapFloorLegPricer,
   * DiscountingSwapLegPricer)}.
   *
   * <ul>
   *   <li>Then return PayLegPricer is {@link DiscountingSwapLegPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * VolatilityIborCapFloorProductPricer#VolatilityIborCapFloorProductPricer(VolatilityIborCapFloorLegPricer,
   * DiscountingSwapLegPricer)}
   */
  @Test
  @DisplayName(
      "Test new VolatilityIborCapFloorProductPricer(VolatilityIborCapFloorLegPricer, DiscountingSwapLegPricer); then return PayLegPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void VolatilityIborCapFloorProductPricer.<init>(VolatilityIborCapFloorLegPricer, DiscountingSwapLegPricer)"
  })
  void testNewVolatilityIborCapFloorProductPricer_thenReturnPayLegPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapLegPricer.DEFAULT,
        new VolatilityIborCapFloorProductPricer(
                BlackIborCapFloorLegPricer.DEFAULT, DiscountingSwapLegPricer.DEFAULT)
            .getPayLegPricer());
  }

  /**
   * Test {@link VolatilityIborCapFloorProductPricer#getPayLegPricer()}.
   *
   * <p>Method under test: {@link VolatilityIborCapFloorProductPricer#getPayLegPricer()}
   */
  @Test
  @DisplayName("Test getPayLegPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingSwapLegPricer VolatilityIborCapFloorProductPricer.getPayLegPricer()"
  })
  void testGetPayLegPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapLegPricer.DEFAULT,
        new VolatilityIborCapFloorProductPricer(
                BlackIborCapFloorLegPricer.DEFAULT, DiscountingSwapLegPricer.DEFAULT)
            .getPayLegPricer());
  }
}
