package com.opengamma.strata.measure.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.index.IborFutureOptionPosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborFutureOptionTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link IborFutureOptionTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link IborFutureOptionTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class IborFutureOptionTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<IborFutureOptionPosition> actualTargetTypeResult =
        IborFutureOptionTradeCalculationFunction.POSITION.targetType();

    // Assert
    Class<IborFutureOptionPosition> expectedTargetTypeResult = IborFutureOptionPosition.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link IborFutureOptionTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link IborFutureOptionTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set IborFutureOptionTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(7, IborFutureOptionTradeCalculationFunction.POSITION.supportedMeasures().size());
  }
}
