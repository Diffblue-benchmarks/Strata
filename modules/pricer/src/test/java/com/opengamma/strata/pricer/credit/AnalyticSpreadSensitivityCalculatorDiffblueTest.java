package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AnalyticSpreadSensitivityCalculatorDiffblueTest {
  /**
   * Test {@link
   * AnalyticSpreadSensitivityCalculator#AnalyticSpreadSensitivityCalculator(AccrualOnDefaultFormula)}.
   *
   * <p>Method under test: {@link
   * AnalyticSpreadSensitivityCalculator#AnalyticSpreadSensitivityCalculator(AccrualOnDefaultFormula)}
   */
  @Test
  @DisplayName("Test new AnalyticSpreadSensitivityCalculator(AccrualOnDefaultFormula)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AnalyticSpreadSensitivityCalculator.<init>(AccrualOnDefaultFormula)"})
  void testNewAnalyticSpreadSensitivityCalculator() {
    // Arrange and Act
    AnalyticSpreadSensitivityCalculator actualAnalyticSpreadSensitivityCalculator =
        new AnalyticSpreadSensitivityCalculator(AccrualOnDefaultFormula.ORIGINAL_ISDA);

    // Assert
    IsdaCompliantCreditCurveCalibrator calibrator =
        actualAnalyticSpreadSensitivityCalculator.getCalibrator();
    assertTrue(calibrator instanceof FastCreditCurveCalibrator);
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        calibrator.getTradePricer().getAccrualOnDefaultFormula());
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualAnalyticSpreadSensitivityCalculator.getPricer().getAccrualOnDefaultFormula());
    assertEquals(AccrualOnDefaultFormula.ORIGINAL_ISDA, calibrator.getAccrualOnDefaultFormula());
    assertEquals(ArbitrageHandling.IGNORE, calibrator.getArbitrageHandling());
  }
}
