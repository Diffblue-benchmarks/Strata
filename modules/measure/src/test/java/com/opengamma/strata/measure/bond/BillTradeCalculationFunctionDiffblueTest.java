package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.bond.BillPosition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BillTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link BillTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link BillTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class BillTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<BillPosition> actualTargetTypeResult = BillTradeCalculationFunction.POSITION.targetType();

    // Assert
    Class<BillPosition> expectedTargetTypeResult = BillPosition.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link BillTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link BillTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set BillTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(8, BillTradeCalculationFunction.POSITION.supportedMeasures().size());
  }
}
