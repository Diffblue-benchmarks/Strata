package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.bond.BondFuturePosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BondFutureTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link BondFutureTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link BondFutureTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class BondFutureTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<BondFuturePosition> actualTargetTypeResult =
        BondFutureTradeCalculationFunction.POSITION.targetType();

    // Assert
    Class<BondFuturePosition> expectedTargetTypeResult = BondFuturePosition.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link BondFutureTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link BondFutureTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set BondFutureTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(9, BondFutureTradeCalculationFunction.POSITION.supportedMeasures().size());
  }
}
