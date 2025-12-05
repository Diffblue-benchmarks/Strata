package com.opengamma.strata.measure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.calc.marketdata.MarketDataFunction;
import com.opengamma.strata.data.FxRateId;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.market.curve.RatesCurveGroupId;
import com.opengamma.strata.market.curve.RatesCurveInputsId;
import com.opengamma.strata.measure.curve.CurveMarketDataFunction;
import com.opengamma.strata.measure.fx.FxRateMarketDataFunction;
import com.opengamma.strata.measure.fxopt.FxOptionVolatilitiesMarketDataFunction;
import com.opengamma.strata.measure.rate.RatesCurveGroupMarketDataFunction;
import com.opengamma.strata.measure.rate.RatesCurveInputsMarketDataFunction;
import com.opengamma.strata.pricer.fxopt.FxOptionVolatilitiesId;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StandardComponentsDiffblueTest {
  /**
   * Test {@link StandardComponents#marketDataFunctions()}.
   *
   * <p>Method under test: {@link StandardComponents#marketDataFunctions()}
   */
  @Test
  @DisplayName("Test marketDataFunctions()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List StandardComponents.marketDataFunctions()"})
  void testMarketDataFunctions() {
    // Arrange and Act
    List<MarketDataFunction<?, ?>> actualMarketDataFunctionsResult =
        StandardComponents.marketDataFunctions();

    // Assert
    assertEquals(5, actualMarketDataFunctionsResult.size());
    MarketDataFunction<?, ?> getResult = actualMarketDataFunctionsResult.get(0);
    assertTrue(getResult instanceof CurveMarketDataFunction);
    MarketDataFunction<?, ?> getResult2 = actualMarketDataFunctionsResult.get(3);
    assertTrue(getResult2 instanceof FxRateMarketDataFunction);
    MarketDataFunction<?, ?> getResult3 = actualMarketDataFunctionsResult.get(4);
    assertTrue(getResult3 instanceof FxOptionVolatilitiesMarketDataFunction);
    MarketDataFunction<?, ?> getResult4 = actualMarketDataFunctionsResult.get(1);
    assertTrue(getResult4 instanceof RatesCurveGroupMarketDataFunction);
    MarketDataFunction<?, ?> getResult5 = actualMarketDataFunctionsResult.get(2);
    assertTrue(getResult5 instanceof RatesCurveInputsMarketDataFunction);
    Class<FxRateId> expectedMarketDataIdType = FxRateId.class;
    assertEquals(expectedMarketDataIdType, getResult2.getMarketDataIdType());
    Class<CurveId> expectedMarketDataIdType2 = CurveId.class;
    assertEquals(expectedMarketDataIdType2, getResult.getMarketDataIdType());
    Class<RatesCurveGroupId> expectedMarketDataIdType3 = RatesCurveGroupId.class;
    assertEquals(expectedMarketDataIdType3, getResult4.getMarketDataIdType());
    Class<RatesCurveInputsId> expectedMarketDataIdType4 = RatesCurveInputsId.class;
    assertEquals(expectedMarketDataIdType4, getResult5.getMarketDataIdType());
    Class<FxOptionVolatilitiesId> expectedMarketDataIdType5 = FxOptionVolatilitiesId.class;
    assertEquals(expectedMarketDataIdType5, getResult3.getMarketDataIdType());
  }
}
