package com.opengamma.strata.measure.fx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fx.FxSwapTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxSwapTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link FxSwapTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link FxSwapTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class FxSwapTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<FxSwapTrade> actualTargetTypeResult = new FxSwapTradeCalculationFunction().targetType();

    // Assert
    Class<FxSwapTrade> expectedTargetTypeResult = FxSwapTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link FxSwapTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link FxSwapTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set FxSwapTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(9, new FxSwapTradeCalculationFunction().supportedMeasures().size());
  }
}
