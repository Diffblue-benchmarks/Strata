package com.opengamma.strata.measure.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.credit.CdsIndexTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CdsIndexTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link CdsIndexTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link CdsIndexTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class CdsIndexTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<CdsIndexTrade> actualTargetTypeResult =
        new CdsIndexTradeCalculationFunction().targetType();

    // Assert
    Class<CdsIndexTrade> expectedTargetTypeResult = CdsIndexTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link CdsIndexTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link CdsIndexTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CdsIndexTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(17, new CdsIndexTradeCalculationFunction().supportedMeasures().size());
  }
}
