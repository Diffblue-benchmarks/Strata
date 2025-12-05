package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IsdaCompliantCreditCurveCalibratorDiffblueTest {
  /**
   * Test {@link IsdaCompliantCreditCurveCalibrator#getArbitrageHandling()}.
   *
   * <p>Method under test: {@link IsdaCompliantCreditCurveCalibrator#getArbitrageHandling()}
   */
  @Test
  @DisplayName("Test getArbitrageHandling()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArbitrageHandling IsdaCompliantCreditCurveCalibrator.getArbitrageHandling()"})
  void testGetArbitrageHandling() {
    // Arrange, Act and Assert
    assertEquals(
        ArbitrageHandling.IGNORE, FastCreditCurveCalibrator.standard().getArbitrageHandling());
  }

  /**
   * Test {@link IsdaCompliantCreditCurveCalibrator#getAccrualOnDefaultFormula()}.
   *
   * <p>Method under test: {@link IsdaCompliantCreditCurveCalibrator#getAccrualOnDefaultFormula()}
   */
  @Test
  @DisplayName("Test getAccrualOnDefaultFormula()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AccrualOnDefaultFormula IsdaCompliantCreditCurveCalibrator.getAccrualOnDefaultFormula()"
  })
  void testGetAccrualOnDefaultFormula() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        FastCreditCurveCalibrator.standard().getAccrualOnDefaultFormula());
  }

  /**
   * Test {@link IsdaCompliantCreditCurveCalibrator#getTradePricer()}.
   *
   * <p>Method under test: {@link IsdaCompliantCreditCurveCalibrator#getTradePricer()}
   */
  @Test
  @DisplayName("Test getTradePricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.credit.IsdaCdsTradePricer IsdaCompliantCreditCurveCalibrator.getTradePricer()"
  })
  void testGetTradePricer() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        FastCreditCurveCalibrator.standard().getTradePricer().getAccrualOnDefaultFormula());
  }
}
