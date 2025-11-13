package com.opengamma.strata.measure.rate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.curve.RatesCurveGroupId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatesCurveGroupMarketDataFunctionDiffblueTest {
  /**
   * Test {@link RatesCurveGroupMarketDataFunction#RatesCurveGroupMarketDataFunction()}.
   *
   * <p>Method under test: {@link
   * RatesCurveGroupMarketDataFunction#RatesCurveGroupMarketDataFunction()}
   */
  @Test
  @DisplayName("Test new RatesCurveGroupMarketDataFunction()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RatesCurveGroupMarketDataFunction.<init>()"})
  void testNewRatesCurveGroupMarketDataFunction2() {
    // Arrange and Act
    RatesCurveGroupMarketDataFunction actualRatesCurveGroupMarketDataFunction =
        new RatesCurveGroupMarketDataFunction();

    // Assert
    Class<RatesCurveGroupId> expectedMarketDataIdType = RatesCurveGroupId.class;
    assertEquals(
        expectedMarketDataIdType, actualRatesCurveGroupMarketDataFunction.getMarketDataIdType());
  }

  /**
   * Test {@link RatesCurveGroupMarketDataFunction#RatesCurveGroupMarketDataFunction()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveGroupMarketDataFunction#RatesCurveGroupMarketDataFunction()}
   *   <li>{@link RatesCurveGroupMarketDataFunction#getMarketDataIdType()}
   * </ul>
   */
  @Test
  @DisplayName("Test new RatesCurveGroupMarketDataFunction()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.MarketDataBox RatesCurveGroupMarketDataFunction.build(RatesCurveGroupId, com.opengamma.strata.calc.marketdata.MarketDataConfig, com.opengamma.strata.data.scenario.ScenarioMarketData, com.opengamma.strata.basics.ReferenceData)",
    "Class RatesCurveGroupMarketDataFunction.getMarketDataIdType()"
  })
  void testNewRatesCurveGroupMarketDataFunction() {
    // Arrange and Act
    RatesCurveGroupMarketDataFunction actualRatesCurveGroupMarketDataFunction =
        new RatesCurveGroupMarketDataFunction();

    // Assert
    Class<RatesCurveGroupId> expectedMarketDataIdType = RatesCurveGroupId.class;
    assertEquals(
        expectedMarketDataIdType, actualRatesCurveGroupMarketDataFunction.getMarketDataIdType());
  }
}
