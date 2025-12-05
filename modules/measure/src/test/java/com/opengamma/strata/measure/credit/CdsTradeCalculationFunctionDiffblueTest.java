package com.opengamma.strata.measure.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.credit.CdsTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CdsTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link CdsTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link CdsTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class CdsTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<CdsTrade> actualTargetTypeResult = new CdsTradeCalculationFunction().targetType();

    // Assert
    Class<CdsTrade> expectedTargetTypeResult = CdsTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link CdsTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link CdsTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CdsTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(17, new CdsTradeCalculationFunction().supportedMeasures().size());
  }
}
