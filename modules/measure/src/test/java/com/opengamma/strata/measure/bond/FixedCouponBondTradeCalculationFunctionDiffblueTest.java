package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.bond.FixedCouponBondPosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedCouponBondTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link FixedCouponBondTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link FixedCouponBondTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class FixedCouponBondTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<FixedCouponBondPosition> actualTargetTypeResult =
        FixedCouponBondTradeCalculationFunction.POSITION.targetType();

    // Assert
    Class<FixedCouponBondPosition> expectedTargetTypeResult = FixedCouponBondPosition.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link FixedCouponBondTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link FixedCouponBondTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set FixedCouponBondTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(8, FixedCouponBondTradeCalculationFunction.POSITION.supportedMeasures().size());
  }
}
