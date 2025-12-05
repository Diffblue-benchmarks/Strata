package com.opengamma.strata.measure.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.index.IborFuturePosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborFutureTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link IborFutureTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link IborFutureTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class IborFutureTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<IborFuturePosition> actualTargetTypeResult =
        IborFutureTradeCalculationFunction.POSITION.targetType();

    // Assert
    Class<IborFuturePosition> expectedTargetTypeResult = IborFuturePosition.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link IborFutureTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link IborFutureTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set IborFutureTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(8, IborFutureTradeCalculationFunction.POSITION.supportedMeasures().size());
  }
}
