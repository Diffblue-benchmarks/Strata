package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FiniteDifferenceSpreadSensitivityCalculatorDiffblueTest {
  /**
   * Test {@link
   * FiniteDifferenceSpreadSensitivityCalculator#FiniteDifferenceSpreadSensitivityCalculator(AccrualOnDefaultFormula,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * FiniteDifferenceSpreadSensitivityCalculator#FiniteDifferenceSpreadSensitivityCalculator(AccrualOnDefaultFormula,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new FiniteDifferenceSpreadSensitivityCalculator(AccrualOnDefaultFormula, double); when NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FiniteDifferenceSpreadSensitivityCalculator.<init>(AccrualOnDefaultFormula, double)"
  })
  void testNewFiniteDifferenceSpreadSensitivityCalculator_whenNaN() {
    // Arrange and Act
    FiniteDifferenceSpreadSensitivityCalculator actualFiniteDifferenceSpreadSensitivityCalculator =
        new FiniteDifferenceSpreadSensitivityCalculator(
            AccrualOnDefaultFormula.ORIGINAL_ISDA, Double.NaN);

    // Assert
    IsdaCompliantCreditCurveCalibrator calibrator =
        actualFiniteDifferenceSpreadSensitivityCalculator.getCalibrator();
    assertTrue(calibrator instanceof FastCreditCurveCalibrator);
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        calibrator.getTradePricer().getAccrualOnDefaultFormula());
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualFiniteDifferenceSpreadSensitivityCalculator.getPricer().getAccrualOnDefaultFormula());
    assertEquals(AccrualOnDefaultFormula.ORIGINAL_ISDA, calibrator.getAccrualOnDefaultFormula());
    assertEquals(ArbitrageHandling.IGNORE, calibrator.getArbitrageHandling());
  }

  /**
   * Test {@link
   * FiniteDifferenceSpreadSensitivityCalculator#FiniteDifferenceSpreadSensitivityCalculator(AccrualOnDefaultFormula,
   * double)}.
   *
   * <ul>
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * FiniteDifferenceSpreadSensitivityCalculator#FiniteDifferenceSpreadSensitivityCalculator(AccrualOnDefaultFormula,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new FiniteDifferenceSpreadSensitivityCalculator(AccrualOnDefaultFormula, double); when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FiniteDifferenceSpreadSensitivityCalculator.<init>(AccrualOnDefaultFormula, double)"
  })
  void testNewFiniteDifferenceSpreadSensitivityCalculator_whenTen() {
    // Arrange and Act
    FiniteDifferenceSpreadSensitivityCalculator actualFiniteDifferenceSpreadSensitivityCalculator =
        new FiniteDifferenceSpreadSensitivityCalculator(
            AccrualOnDefaultFormula.ORIGINAL_ISDA, 10.0d);

    // Assert
    IsdaCompliantCreditCurveCalibrator calibrator =
        actualFiniteDifferenceSpreadSensitivityCalculator.getCalibrator();
    assertTrue(calibrator instanceof FastCreditCurveCalibrator);
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        calibrator.getTradePricer().getAccrualOnDefaultFormula());
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualFiniteDifferenceSpreadSensitivityCalculator.getPricer().getAccrualOnDefaultFormula());
    assertEquals(AccrualOnDefaultFormula.ORIGINAL_ISDA, calibrator.getAccrualOnDefaultFormula());
    assertEquals(ArbitrageHandling.IGNORE, calibrator.getArbitrageHandling());
  }
}
