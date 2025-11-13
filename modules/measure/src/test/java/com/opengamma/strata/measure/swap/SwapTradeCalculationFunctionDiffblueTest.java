package com.opengamma.strata.measure.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.swap.SwapTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwapTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link SwapTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link SwapTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class SwapTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<SwapTrade> actualTargetTypeResult = new SwapTradeCalculationFunction().targetType();

    // Assert
    Class<SwapTrade> expectedTargetTypeResult = SwapTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link SwapTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link SwapTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set SwapTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(17, new SwapTradeCalculationFunction().supportedMeasures().size());
  }
}
