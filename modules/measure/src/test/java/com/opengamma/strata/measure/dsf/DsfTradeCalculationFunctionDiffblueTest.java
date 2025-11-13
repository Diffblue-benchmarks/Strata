package com.opengamma.strata.measure.dsf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.dsf.DsfPosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DsfTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link DsfTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link DsfTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class DsfTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<DsfPosition> actualTargetTypeResult = DsfTradeCalculationFunction.POSITION.targetType();

    // Assert
    Class<DsfPosition> expectedTargetTypeResult = DsfPosition.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link DsfTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link DsfTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set DsfTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(8, DsfTradeCalculationFunction.POSITION.supportedMeasures().size());
  }
}
