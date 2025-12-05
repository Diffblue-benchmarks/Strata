package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.bond.CapitalIndexedBondPosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CapitalIndexedBondTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link CapitalIndexedBondTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link CapitalIndexedBondTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class CapitalIndexedBondTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<CapitalIndexedBondPosition> actualTargetTypeResult =
        CapitalIndexedBondTradeCalculationFunction.POSITION.targetType();

    // Assert
    Class<CapitalIndexedBondPosition> expectedTargetTypeResult = CapitalIndexedBondPosition.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link CapitalIndexedBondTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link CapitalIndexedBondTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Set CapitalIndexedBondTradeCalculationFunction.supportedMeasures()"
  })
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(6, CapitalIndexedBondTradeCalculationFunction.POSITION.supportedMeasures().size());
  }
}
