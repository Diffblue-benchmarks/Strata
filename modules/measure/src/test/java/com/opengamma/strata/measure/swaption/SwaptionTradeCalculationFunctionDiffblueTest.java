package com.opengamma.strata.measure.swaption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.swaption.SwaptionTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwaptionTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link SwaptionTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link SwaptionTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class SwaptionTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<SwaptionTrade> actualTargetTypeResult =
        new SwaptionTradeCalculationFunction().targetType();

    // Assert
    Class<SwaptionTrade> expectedTargetTypeResult = SwaptionTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link SwaptionTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link SwaptionTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set SwaptionTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(9, new SwaptionTradeCalculationFunction().supportedMeasures().size());
  }
}
