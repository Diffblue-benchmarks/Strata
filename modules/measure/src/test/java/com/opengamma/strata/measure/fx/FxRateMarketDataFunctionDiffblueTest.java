package com.opengamma.strata.measure.fx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.FxRateId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxRateMarketDataFunctionDiffblueTest {
  /**
   * Test new {@link FxRateMarketDataFunction} (default constructor).
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link FxRateMarketDataFunction}
   *   <li>{@link FxRateMarketDataFunction#getMarketDataIdType()}
   * </ul>
   */
  @Test
  @DisplayName("Test new FxRateMarketDataFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FxRateMarketDataFunction.<init>()",
    "com.opengamma.strata.data.scenario.MarketDataBox FxRateMarketDataFunction.build(FxRateId, com.opengamma.strata.calc.marketdata.MarketDataConfig, com.opengamma.strata.data.scenario.ScenarioMarketData, com.opengamma.strata.basics.ReferenceData)",
    "Class FxRateMarketDataFunction.getMarketDataIdType()"
  })
  void testNewFxRateMarketDataFunction() {
    // Arrange and Act
    FxRateMarketDataFunction actualFxRateMarketDataFunction = new FxRateMarketDataFunction();

    // Assert
    Class<FxRateId> expectedMarketDataIdType = FxRateId.class;
    assertEquals(expectedMarketDataIdType, actualFxRateMarketDataFunction.getMarketDataIdType());
  }
}
