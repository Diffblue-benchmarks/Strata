package com.opengamma.strata.measure.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.curve.CurveId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveMarketDataFunctionDiffblueTest {
  /**
   * Test new {@link CurveMarketDataFunction} (default constructor).
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link CurveMarketDataFunction}
   *   <li>{@link CurveMarketDataFunction#getMarketDataIdType()}
   * </ul>
   */
  @Test
  @DisplayName("Test new CurveMarketDataFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void CurveMarketDataFunction.<init>()",
    "com.opengamma.strata.data.scenario.MarketDataBox CurveMarketDataFunction.build(CurveId, com.opengamma.strata.calc.marketdata.MarketDataConfig, com.opengamma.strata.data.scenario.ScenarioMarketData, com.opengamma.strata.basics.ReferenceData)",
    "Class CurveMarketDataFunction.getMarketDataIdType()"
  })
  void testNewCurveMarketDataFunction() {
    // Arrange and Act
    CurveMarketDataFunction actualCurveMarketDataFunction = new CurveMarketDataFunction();

    // Assert
    Class<CurveId> expectedMarketDataIdType = CurveId.class;
    assertEquals(expectedMarketDataIdType, actualCurveMarketDataFunction.getMarketDataIdType());
  }
}
