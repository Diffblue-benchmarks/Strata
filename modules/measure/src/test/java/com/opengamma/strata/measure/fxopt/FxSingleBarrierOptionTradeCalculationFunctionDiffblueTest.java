package com.opengamma.strata.measure.fxopt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fxopt.FxSingleBarrierOptionTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxSingleBarrierOptionTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link FxSingleBarrierOptionTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link FxSingleBarrierOptionTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class FxSingleBarrierOptionTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<FxSingleBarrierOptionTrade> actualTargetTypeResult =
        new FxSingleBarrierOptionTradeCalculationFunction().targetType();

    // Assert
    Class<FxSingleBarrierOptionTrade> expectedTargetTypeResult = FxSingleBarrierOptionTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link FxSingleBarrierOptionTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link FxSingleBarrierOptionTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Set FxSingleBarrierOptionTradeCalculationFunction.supportedMeasures()"
  })
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(9, new FxSingleBarrierOptionTradeCalculationFunction().supportedMeasures().size());
  }
}
