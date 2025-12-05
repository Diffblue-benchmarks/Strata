package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SimpleCreditCurveCalibratorDiffblueTest {
  /**
   * Test {@link SimpleCreditCurveCalibrator#standard()}.
   *
   * <p>Method under test: {@link SimpleCreditCurveCalibrator#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleCreditCurveCalibrator SimpleCreditCurveCalibrator.standard()"})
  void testStandard() {
    // Arrange and Act
    SimpleCreditCurveCalibrator actualStandardResult = SimpleCreditCurveCalibrator.standard();

    // Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualStandardResult.getTradePricer().getAccrualOnDefaultFormula());
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA, actualStandardResult.getAccrualOnDefaultFormula());
    assertEquals(ArbitrageHandling.IGNORE, actualStandardResult.getArbitrageHandling());
  }

  /**
   * Test {@link SimpleCreditCurveCalibrator#SimpleCreditCurveCalibrator(AccrualOnDefaultFormula)}.
   *
   * <p>Method under test: {@link
   * SimpleCreditCurveCalibrator#SimpleCreditCurveCalibrator(AccrualOnDefaultFormula)}
   */
  @Test
  @DisplayName("Test new SimpleCreditCurveCalibrator(AccrualOnDefaultFormula)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SimpleCreditCurveCalibrator.<init>(AccrualOnDefaultFormula)"})
  void testNewSimpleCreditCurveCalibrator() {
    // Arrange and Act
    SimpleCreditCurveCalibrator actualSimpleCreditCurveCalibrator =
        new SimpleCreditCurveCalibrator(AccrualOnDefaultFormula.ORIGINAL_ISDA);

    // Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualSimpleCreditCurveCalibrator.getTradePricer().getAccrualOnDefaultFormula());
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualSimpleCreditCurveCalibrator.getAccrualOnDefaultFormula());
    assertEquals(
        ArbitrageHandling.IGNORE, actualSimpleCreditCurveCalibrator.getArbitrageHandling());
  }
}
