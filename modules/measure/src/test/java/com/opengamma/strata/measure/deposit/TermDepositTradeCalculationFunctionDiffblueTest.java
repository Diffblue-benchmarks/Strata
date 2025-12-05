package com.opengamma.strata.measure.deposit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.deposit.TermDepositTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TermDepositTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link TermDepositTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link TermDepositTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class TermDepositTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<TermDepositTrade> actualTargetTypeResult =
        new TermDepositTradeCalculationFunction().targetType();

    // Assert
    Class<TermDepositTrade> expectedTargetTypeResult = TermDepositTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link TermDepositTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link TermDepositTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set TermDepositTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(10, new TermDepositTradeCalculationFunction().supportedMeasures().size());
  }
}
