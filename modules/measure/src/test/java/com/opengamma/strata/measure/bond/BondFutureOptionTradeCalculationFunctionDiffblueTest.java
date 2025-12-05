package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.bond.BondFutureOptionPosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BondFutureOptionTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link BondFutureOptionTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link BondFutureOptionTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class BondFutureOptionTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<BondFutureOptionPosition> actualTargetTypeResult =
        BondFutureOptionTradeCalculationFunction.POSITION.targetType();

    // Assert
    Class<BondFutureOptionPosition> expectedTargetTypeResult = BondFutureOptionPosition.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link BondFutureOptionTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link BondFutureOptionTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set BondFutureOptionTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(6, BondFutureOptionTradeCalculationFunction.POSITION.supportedMeasures().size());
  }
}
