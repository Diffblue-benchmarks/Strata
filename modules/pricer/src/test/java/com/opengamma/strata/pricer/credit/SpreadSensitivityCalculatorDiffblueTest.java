package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SpreadSensitivityCalculatorDiffblueTest {
  /**
   * Test {@link SpreadSensitivityCalculator#getPricer()}.
   *
   * <p>Method under test: {@link SpreadSensitivityCalculator#getPricer()}
   */
  @Test
  @DisplayName("Test getPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.credit.IsdaCdsTradePricer SpreadSensitivityCalculator.getPricer()"
  })
  void testGetPricer() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        AnalyticSpreadSensitivityCalculator.DEFAULT.getPricer().getAccrualOnDefaultFormula());
  }

  /**
   * Test {@link SpreadSensitivityCalculator#getCalibrator()}.
   *
   * <p>Method under test: {@link SpreadSensitivityCalculator#getCalibrator()}
   */
  @Test
  @DisplayName("Test getCalibrator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IsdaCompliantCreditCurveCalibrator SpreadSensitivityCalculator.getCalibrator()"
  })
  void testGetCalibrator() {
    // Arrange and Act
    IsdaCompliantCreditCurveCalibrator actualCalibrator =
        AnalyticSpreadSensitivityCalculator.DEFAULT.getCalibrator();

    // Assert
    assertTrue(actualCalibrator instanceof FastCreditCurveCalibrator);
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        actualCalibrator.getTradePricer().getAccrualOnDefaultFormula());
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA, actualCalibrator.getAccrualOnDefaultFormula());
    assertEquals(ArbitrageHandling.IGNORE, actualCalibrator.getArbitrageHandling());
  }

  /**
   * Test {@link SpreadSensitivityCalculator#impliedSpread(List, CreditRatesProvider,
   * ReferenceData)}.
   *
   * <p>Method under test: {@link SpreadSensitivityCalculator#impliedSpread(List,
   * CreditRatesProvider, ReferenceData)}
   */
  @Test
  @DisplayName("Test impliedSpread(List, CreditRatesProvider, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray SpreadSensitivityCalculator.impliedSpread(List, CreditRatesProvider, ReferenceData)"
  })
  void testImpliedSpread() {
    // Arrange, Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        AnalyticSpreadSensitivityCalculator.DEFAULT.impliedSpread(
            new ArrayList<>(), null, mock(ReferenceData.class)));
  }
}
