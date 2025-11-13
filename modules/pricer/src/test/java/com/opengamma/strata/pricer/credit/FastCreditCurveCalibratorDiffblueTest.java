package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FastCreditCurveCalibratorDiffblueTest {
  /**
   * Test {@link FastCreditCurveCalibrator#standard()}.
   *
   * <p>Method under test: {@link FastCreditCurveCalibrator#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FastCreditCurveCalibrator FastCreditCurveCalibrator.standard()"})
  void testStandard() {
    // Arrange and Act
    FastCreditCurveCalibrator actualStandardResult = FastCreditCurveCalibrator.standard();

    // Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualStandardResult.getTradePricer().getAccrualOnDefaultFormula());
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA, actualStandardResult.getAccrualOnDefaultFormula());
    assertEquals(ArbitrageHandling.IGNORE, actualStandardResult.getArbitrageHandling());
  }

  /**
   * Test {@link FastCreditCurveCalibrator#FastCreditCurveCalibrator(AccrualOnDefaultFormula)}.
   *
   * <p>Method under test: {@link
   * FastCreditCurveCalibrator#FastCreditCurveCalibrator(AccrualOnDefaultFormula)}
   */
  @Test
  @DisplayName("Test new FastCreditCurveCalibrator(AccrualOnDefaultFormula)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void FastCreditCurveCalibrator.<init>(AccrualOnDefaultFormula)"})
  void testNewFastCreditCurveCalibrator() {
    // Arrange and Act
    FastCreditCurveCalibrator actualFastCreditCurveCalibrator =
        new FastCreditCurveCalibrator(AccrualOnDefaultFormula.ORIGINAL_ISDA);

    // Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualFastCreditCurveCalibrator.getTradePricer().getAccrualOnDefaultFormula());
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualFastCreditCurveCalibrator.getAccrualOnDefaultFormula());
    assertEquals(ArbitrageHandling.IGNORE, actualFastCreditCurveCalibrator.getArbitrageHandling());
  }

  /**
   * Test {@link FastCreditCurveCalibrator#FastCreditCurveCalibrator(AccrualOnDefaultFormula,
   * ArbitrageHandling)}.
   *
   * <p>Method under test: {@link
   * FastCreditCurveCalibrator#FastCreditCurveCalibrator(AccrualOnDefaultFormula,
   * ArbitrageHandling)}
   */
  @Test
  @DisplayName("Test new FastCreditCurveCalibrator(AccrualOnDefaultFormula, ArbitrageHandling)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FastCreditCurveCalibrator.<init>(AccrualOnDefaultFormula, ArbitrageHandling)"
  })
  void testNewFastCreditCurveCalibrator2() {
    // Arrange and Act
    FastCreditCurveCalibrator actualFastCreditCurveCalibrator =
        new FastCreditCurveCalibrator(
            AccrualOnDefaultFormula.ORIGINAL_ISDA, ArbitrageHandling.IGNORE);

    // Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualFastCreditCurveCalibrator.getTradePricer().getAccrualOnDefaultFormula());
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualFastCreditCurveCalibrator.getAccrualOnDefaultFormula());
    assertEquals(ArbitrageHandling.IGNORE, actualFastCreditCurveCalibrator.getArbitrageHandling());
  }
}
