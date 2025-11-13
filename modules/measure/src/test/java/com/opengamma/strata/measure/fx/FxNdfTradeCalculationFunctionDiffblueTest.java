package com.opengamma.strata.measure.fx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fx.FxNdfTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxNdfTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link FxNdfTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link FxNdfTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class FxNdfTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<FxNdfTrade> actualTargetTypeResult = new FxNdfTradeCalculationFunction().targetType();

    // Assert
    Class<FxNdfTrade> expectedTargetTypeResult = FxNdfTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link FxNdfTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link FxNdfTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set FxNdfTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(9, new FxNdfTradeCalculationFunction().supportedMeasures().size());
  }
}
