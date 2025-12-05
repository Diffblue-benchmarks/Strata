package com.opengamma.strata.measure.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.SecurityTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SecurityTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link SecurityTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link SecurityTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class SecurityTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<SecurityTrade> actualTargetTypeResult =
        new SecurityTradeCalculationFunction().targetType();

    // Assert
    Class<SecurityTrade> expectedTargetTypeResult = SecurityTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link SecurityTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link SecurityTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set SecurityTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(1, new SecurityTradeCalculationFunction().supportedMeasures().size());
  }
}
