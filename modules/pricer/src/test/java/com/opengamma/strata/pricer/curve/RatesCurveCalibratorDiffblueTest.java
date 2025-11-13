package com.opengamma.strata.pricer.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.math.impl.rootfinding.newton.BroydenVectorRootFinder;
import com.opengamma.strata.math.rootfind.NewtonVectorRootFinder;
import com.opengamma.strata.product.deposit.ResolvedIborFixingDepositTrade;
import com.opengamma.strata.product.fra.ResolvedFraTrade;
import com.opengamma.strata.product.fx.ResolvedFxSwapTrade;
import com.opengamma.strata.product.index.ResolvedIborFutureTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatesCurveCalibratorDiffblueTest {
  /**
   * Test {@link RatesCurveCalibrator#standard()}.
   *
   * <p>Method under test: {@link RatesCurveCalibrator#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveCalibrator RatesCurveCalibrator.standard()"})
  void testStandard() {
    // Arrange, Act and Assert
    CalibrationMeasures measures = RatesCurveCalibrator.standard().getMeasures();
    assertEquals("ParSpread", measures.getName());
    assertEquals("ParSpread", measures.toString());
    ImmutableSet<Class<?>> tradeTypes = measures.getTradeTypes();
    assertEquals(7, tradeTypes.size());
    assertTrue(tradeTypes.contains(ResolvedIborFixingDepositTrade.class));
    assertTrue(tradeTypes.contains(ResolvedFraTrade.class));
    assertTrue(tradeTypes.contains(ResolvedFxSwapTrade.class));
    assertTrue(tradeTypes.contains(ResolvedIborFutureTrade.class));
  }

  /**
   * Test {@link RatesCurveCalibrator#of(NewtonVectorRootFinder, CalibrationMeasures,
   * CalibrationMeasures)} with {@code rootFinder}, {@code measures}, {@code pvMeasures}.
   *
   * <ul>
   *   <li>Then return Measures is {@link CalibrationMeasures#MARKET_QUOTE}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveCalibrator#of(NewtonVectorRootFinder,
   * CalibrationMeasures, CalibrationMeasures)}
   */
  @Test
  @DisplayName(
      "Test of(NewtonVectorRootFinder, CalibrationMeasures, CalibrationMeasures) with 'rootFinder', 'measures', 'pvMeasures'; then return Measures is MARKET_QUOTE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveCalibrator RatesCurveCalibrator.of(NewtonVectorRootFinder, CalibrationMeasures, CalibrationMeasures)"
  })
  void testOfWithRootFinderMeasuresPvMeasures_thenReturnMeasuresIsMarket_quote() {
    // Arrange and Act
    RatesCurveCalibrator actualOfResult =
        RatesCurveCalibrator.of(
            new BroydenVectorRootFinder(),
            CalibrationMeasures.MARKET_QUOTE,
            CalibrationMeasures.MARKET_QUOTE);

    // Assert
    assertSame(CalibrationMeasures.MARKET_QUOTE, actualOfResult.getMeasures());
  }

  /**
   * Test {@link RatesCurveCalibrator#of(double, double, int, CalibrationMeasures)} with {@code
   * toleranceAbs}, {@code toleranceRel}, {@code stepMaximum}, {@code measures}.
   *
   * <p>Method under test: {@link RatesCurveCalibrator#of(double, double, int, CalibrationMeasures)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, int, CalibrationMeasures) with 'toleranceAbs', 'toleranceRel', 'stepMaximum', 'measures'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveCalibrator RatesCurveCalibrator.of(double, double, int, CalibrationMeasures)"
  })
  void testOfWithToleranceAbsToleranceRelStepMaximumMeasures() {
    // Arrange and Act
    RatesCurveCalibrator actualOfResult =
        RatesCurveCalibrator.of(10.0d, 10.0d, 1, CalibrationMeasures.MARKET_QUOTE);

    // Assert
    assertSame(CalibrationMeasures.MARKET_QUOTE, actualOfResult.getMeasures());
  }

  /**
   * Test {@link RatesCurveCalibrator#of(double, double, int, CalibrationMeasures,
   * CalibrationMeasures)} with {@code toleranceAbs}, {@code toleranceRel}, {@code stepMaximum},
   * {@code measures}, {@code pvMeasures}.
   *
   * <p>Method under test: {@link RatesCurveCalibrator#of(double, double, int, CalibrationMeasures,
   * CalibrationMeasures)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, int, CalibrationMeasures, CalibrationMeasures) with 'toleranceAbs', 'toleranceRel', 'stepMaximum', 'measures', 'pvMeasures'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveCalibrator RatesCurveCalibrator.of(double, double, int, CalibrationMeasures, CalibrationMeasures)"
  })
  void testOfWithToleranceAbsToleranceRelStepMaximumMeasuresPvMeasures() {
    // Arrange and Act
    RatesCurveCalibrator actualOfResult =
        RatesCurveCalibrator.of(
            10.0d, 10.0d, 1, CalibrationMeasures.MARKET_QUOTE, CalibrationMeasures.MARKET_QUOTE);

    // Assert
    assertSame(CalibrationMeasures.MARKET_QUOTE, actualOfResult.getMeasures());
  }

  /**
   * Test {@link RatesCurveCalibrator#of(double, double, int)} with {@code toleranceAbs}, {@code
   * toleranceRel}, {@code stepMaximum}.
   *
   * <ul>
   *   <li>Then return Measures Name is {@code ParSpread}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveCalibrator#of(double, double, int)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, int) with 'toleranceAbs', 'toleranceRel', 'stepMaximum'; then return Measures Name is 'ParSpread'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveCalibrator RatesCurveCalibrator.of(double, double, int)"})
  void testOfWithToleranceAbsToleranceRelStepMaximum_thenReturnMeasuresNameIsParSpread() {
    // Arrange, Act and Assert
    CalibrationMeasures measures = RatesCurveCalibrator.of(10.0d, 10.0d, 1).getMeasures();
    assertEquals("ParSpread", measures.getName());
    assertEquals("ParSpread", measures.toString());
    ImmutableSet<Class<?>> tradeTypes = measures.getTradeTypes();
    assertEquals(7, tradeTypes.size());
    assertTrue(tradeTypes.contains(ResolvedIborFixingDepositTrade.class));
    assertTrue(tradeTypes.contains(ResolvedFraTrade.class));
    assertTrue(tradeTypes.contains(ResolvedFxSwapTrade.class));
    assertTrue(tradeTypes.contains(ResolvedIborFutureTrade.class));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveCalibrator#toString()}
   *   <li>{@link RatesCurveCalibrator#getMeasures()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CalibrationMeasures RatesCurveCalibrator.getMeasures()",
    "String RatesCurveCalibrator.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    RatesCurveCalibrator standardResult = RatesCurveCalibrator.standard();

    // Act
    String actualToStringResult = standardResult.toString();

    // Assert
    assertEquals("CurveCalibrator[ParSpread]", actualToStringResult);
    assertSame(CalibrationMeasures.PAR_SPREAD, standardResult.getMeasures());
  }
}
