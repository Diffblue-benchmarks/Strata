package com.opengamma.strata.measure.cms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.cms.CmsTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CmsTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link CmsTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link CmsTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class CmsTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<CmsTrade> actualTargetTypeResult = new CmsTradeCalculationFunction().targetType();

    // Assert
    Class<CmsTrade> expectedTargetTypeResult = CmsTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link CmsTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link CmsTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set CmsTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(8, new CmsTradeCalculationFunction().supportedMeasures().size());
  }
}
