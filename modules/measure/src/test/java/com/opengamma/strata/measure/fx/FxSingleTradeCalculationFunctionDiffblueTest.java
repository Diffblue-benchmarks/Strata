package com.opengamma.strata.measure.fx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fx.FxSingleTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxSingleTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link FxSingleTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link FxSingleTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class FxSingleTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<FxSingleTrade> actualTargetTypeResult =
        new FxSingleTradeCalculationFunction().targetType();

    // Assert
    Class<FxSingleTrade> expectedTargetTypeResult = FxSingleTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link FxSingleTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link FxSingleTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set FxSingleTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(10, new FxSingleTradeCalculationFunction().supportedMeasures().size());
  }
}
