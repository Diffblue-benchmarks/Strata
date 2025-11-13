package com.opengamma.strata.measure.fxopt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.fxopt.FxOptionVolatilitiesId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxOptionVolatilitiesMarketDataFunctionDiffblueTest {
  /**
   * Test new {@link FxOptionVolatilitiesMarketDataFunction} (default constructor).
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link FxOptionVolatilitiesMarketDataFunction}
   *   <li>{@link FxOptionVolatilitiesMarketDataFunction#getMarketDataIdType()}
   * </ul>
   */
  @Test
  @DisplayName("Test new FxOptionVolatilitiesMarketDataFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FxOptionVolatilitiesMarketDataFunction.<init>()",
    "com.opengamma.strata.data.scenario.MarketDataBox FxOptionVolatilitiesMarketDataFunction.build(FxOptionVolatilitiesId, com.opengamma.strata.calc.marketdata.MarketDataConfig, com.opengamma.strata.data.scenario.ScenarioMarketData, com.opengamma.strata.basics.ReferenceData)",
    "Class FxOptionVolatilitiesMarketDataFunction.getMarketDataIdType()"
  })
  void testNewFxOptionVolatilitiesMarketDataFunction() {
    // Arrange and Act
    FxOptionVolatilitiesMarketDataFunction actualFxOptionVolatilitiesMarketDataFunction =
        new FxOptionVolatilitiesMarketDataFunction();

    // Assert
    Class<FxOptionVolatilitiesId> expectedMarketDataIdType = FxOptionVolatilitiesId.class;
    assertEquals(
        expectedMarketDataIdType,
        actualFxOptionVolatilitiesMarketDataFunction.getMarketDataIdType());
  }
}
