package com.opengamma.strata.measure.rate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.curve.RatesCurveInputsId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatesCurveInputsMarketDataFunctionDiffblueTest {
  /**
   * Test new {@link RatesCurveInputsMarketDataFunction} (default constructor).
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link RatesCurveInputsMarketDataFunction}
   *   <li>{@link RatesCurveInputsMarketDataFunction#getMarketDataIdType()}
   * </ul>
   */
  @Test
  @DisplayName("Test new RatesCurveInputsMarketDataFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurveInputsMarketDataFunction.<init>()",
    "com.opengamma.strata.data.scenario.MarketDataBox RatesCurveInputsMarketDataFunction.build(RatesCurveInputsId, com.opengamma.strata.calc.marketdata.MarketDataConfig, com.opengamma.strata.data.scenario.ScenarioMarketData, com.opengamma.strata.basics.ReferenceData)",
    "Class RatesCurveInputsMarketDataFunction.getMarketDataIdType()"
  })
  void testNewRatesCurveInputsMarketDataFunction() {
    // Arrange and Act
    RatesCurveInputsMarketDataFunction actualRatesCurveInputsMarketDataFunction =
        new RatesCurveInputsMarketDataFunction();

    // Assert
    Class<RatesCurveInputsId> expectedMarketDataIdType = RatesCurveInputsId.class;
    assertEquals(
        expectedMarketDataIdType, actualRatesCurveInputsMarketDataFunction.getMarketDataIdType());
  }
}
