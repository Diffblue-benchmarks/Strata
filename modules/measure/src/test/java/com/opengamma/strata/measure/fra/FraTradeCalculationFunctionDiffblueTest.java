package com.opengamma.strata.measure.fra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fra.FraTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FraTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link FraTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link FraTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class FraTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<FraTrade> actualTargetTypeResult = new FraTradeCalculationFunction().targetType();

    // Assert
    Class<FraTrade> expectedTargetTypeResult = FraTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link FraTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link FraTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set FraTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(14, new FraTradeCalculationFunction().supportedMeasures().size());
  }
}
