package com.opengamma.strata.measure.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.index.OvernightFuturePosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OvernightFutureTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link
   * OvernightFutureTradeCalculationFunction#OvernightFutureTradeCalculationFunction(Class)}.
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculationFunction#OvernightFutureTradeCalculationFunction(Class)}
   */
  @Test
  @DisplayName("Test new OvernightFutureTradeCalculationFunction(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OvernightFutureTradeCalculationFunction.<init>(Class)"})
  void testNewOvernightFutureTradeCalculationFunction() {
    // Arrange
    Class<OvernightFuturePosition> targetType = OvernightFuturePosition.class;

    // Act
    OvernightFutureTradeCalculationFunction<OvernightFuturePosition>
        actualOvernightFutureTradeCalculationFunction =
            new OvernightFutureTradeCalculationFunction<>(targetType);

    // Assert
    Class<OvernightFuturePosition> expectedTargetTypeResult = OvernightFuturePosition.class;
    assertEquals(
        expectedTargetTypeResult, actualOvernightFutureTradeCalculationFunction.targetType());
  }

  /**
   * Test {@link OvernightFutureTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link OvernightFutureTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class OvernightFutureTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange
    Class<OvernightFuturePosition> targetType = OvernightFuturePosition.class;
    OvernightFutureTradeCalculationFunction<OvernightFuturePosition>
        overnightFutureTradeCalculationFunction =
            new OvernightFutureTradeCalculationFunction<>(targetType);

    // Act
    Class<OvernightFuturePosition> actualTargetTypeResult =
        overnightFutureTradeCalculationFunction.targetType();

    // Assert
    Class<OvernightFuturePosition> expectedTargetTypeResult = OvernightFuturePosition.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link OvernightFutureTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link OvernightFutureTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set OvernightFutureTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(8, OvernightFutureTradeCalculationFunction.POSITION.supportedMeasures().size());
  }
}
