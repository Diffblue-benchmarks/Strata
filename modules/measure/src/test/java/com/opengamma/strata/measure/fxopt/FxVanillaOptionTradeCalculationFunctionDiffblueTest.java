package com.opengamma.strata.measure.fxopt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fxopt.FxVanillaOptionTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxVanillaOptionTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link FxVanillaOptionTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link FxVanillaOptionTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class FxVanillaOptionTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<FxVanillaOptionTrade> actualTargetTypeResult =
        new FxVanillaOptionTradeCalculationFunction().targetType();

    // Assert
    Class<FxVanillaOptionTrade> expectedTargetTypeResult = FxVanillaOptionTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link FxVanillaOptionTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link FxVanillaOptionTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set FxVanillaOptionTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(10, new FxVanillaOptionTradeCalculationFunction().supportedMeasures().size());
  }
}
