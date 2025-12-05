package com.opengamma.strata.measure.capfloor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.capfloor.IborCapFloorTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborCapFloorTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link IborCapFloorTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link IborCapFloorTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class IborCapFloorTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<IborCapFloorTrade> actualTargetTypeResult =
        new IborCapFloorTradeCalculationFunction().targetType();

    // Assert
    Class<IborCapFloorTrade> expectedTargetTypeResult = IborCapFloorTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link IborCapFloorTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link IborCapFloorTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set IborCapFloorTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(8, new IborCapFloorTradeCalculationFunction().supportedMeasures().size());
  }
}
