package com.opengamma.strata.pricer.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.product.deposit.ResolvedIborFixingDepositTrade;
import com.opengamma.strata.product.fra.ResolvedFraTrade;
import com.opengamma.strata.product.fx.ResolvedFxSwapTrade;
import com.opengamma.strata.product.index.ResolvedIborFutureTrade;
import com.opengamma.strata.product.index.ResolvedOvernightFutureTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SyntheticRatesCurveCalibratorDiffblueTest {
  /**
   * Test {@link SyntheticRatesCurveCalibrator#standard()}.
   *
   * <p>Method under test: {@link SyntheticRatesCurveCalibrator#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SyntheticRatesCurveCalibrator SyntheticRatesCurveCalibrator.standard()"})
  void testStandard() {
    // Arrange and Act
    SyntheticRatesCurveCalibrator actualStandardResult = SyntheticRatesCurveCalibrator.standard();

    // Assert
    CalibrationMeasures measures = actualStandardResult.getMeasures();
    assertEquals("MarketQuote", measures.getName());
    assertEquals("MarketQuote", measures.toString());
    CalibrationMeasures measures2 = actualStandardResult.getCalibrator().getMeasures();
    assertEquals("ParSpread", measures2.getName());
    assertEquals("ParSpread", measures2.toString());
    ImmutableSet<Class<?>> tradeTypes = measures.getTradeTypes();
    assertEquals(6, tradeTypes.size());
    ImmutableSet<Class<?>> tradeTypes2 = measures2.getTradeTypes();
    assertEquals(7, tradeTypes2.size());
    assertTrue(tradeTypes2.contains(ResolvedIborFixingDepositTrade.class));
    assertTrue(tradeTypes2.contains(ResolvedFraTrade.class));
    assertTrue(tradeTypes2.contains(ResolvedFxSwapTrade.class));
    assertTrue(tradeTypes.contains(ResolvedIborFixingDepositTrade.class));
    assertTrue(tradeTypes.contains(ResolvedFraTrade.class));
    assertTrue(tradeTypes.contains(ResolvedIborFutureTrade.class));
    assertTrue(tradeTypes.contains(ResolvedOvernightFutureTrade.class));
  }

  /**
   * Test {@link SyntheticRatesCurveCalibrator#of(RatesCurveCalibrator, CalibrationMeasures)}.
   *
   * <p>Method under test: {@link SyntheticRatesCurveCalibrator#of(RatesCurveCalibrator,
   * CalibrationMeasures)}
   */
  @Test
  @DisplayName("Test of(RatesCurveCalibrator, CalibrationMeasures)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SyntheticRatesCurveCalibrator SyntheticRatesCurveCalibrator.of(RatesCurveCalibrator, CalibrationMeasures)"
  })
  void testOf() {
    // Arrange
    RatesCurveCalibrator calibrator = RatesCurveCalibrator.standard();

    // Act
    SyntheticRatesCurveCalibrator actualOfResult =
        SyntheticRatesCurveCalibrator.of(calibrator, CalibrationMeasures.MARKET_QUOTE);

    // Assert
    assertSame(calibrator, actualOfResult.getCalibrator());
    assertSame(CalibrationMeasures.MARKET_QUOTE, actualOfResult.getMeasures());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SyntheticRatesCurveCalibrator#toString()}
   *   <li>{@link SyntheticRatesCurveCalibrator#getCalibrator()}
   *   <li>{@link SyntheticRatesCurveCalibrator#getMeasures()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesCurveCalibrator SyntheticRatesCurveCalibrator.getCalibrator()",
    "CalibrationMeasures SyntheticRatesCurveCalibrator.getMeasures()",
    "String SyntheticRatesCurveCalibrator.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SyntheticRatesCurveCalibrator standardResult = SyntheticRatesCurveCalibrator.standard();

    // Act
    String actualToStringResult = standardResult.toString();
    RatesCurveCalibrator actualCalibrator = standardResult.getCalibrator();

    // Assert
    assertEquals(
        "SyntheticCurveCalibrator[CurveCalibrator[ParSpread], MarketQuote]", actualToStringResult);
    assertSame(CalibrationMeasures.MARKET_QUOTE, standardResult.getMeasures());
    assertSame(CalibrationMeasures.PAR_SPREAD, actualCalibrator.getMeasures());
  }
}
