package com.opengamma.strata.measure.swaption;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.measure.rate.RatesMarketData;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.product.swaption.ResolvedSwaptionTrade;
import java.time.LocalDate;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwaptionMeasureCalculationsDiffblueTest {
  /**
   * Test {@link SwaptionMeasureCalculations#currentCash(ResolvedSwaptionTrade,
   * RatesScenarioMarketData, SwaptionScenarioMarketData)} with {@code trade}, {@code
   * ratesMarketData}, {@code swaptionMarketData}.
   *
   * <p>Method under test: {@link SwaptionMeasureCalculations#currentCash(ResolvedSwaptionTrade,
   * RatesScenarioMarketData, SwaptionScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedSwaptionTrade, RatesScenarioMarketData, SwaptionScenarioMarketData) with 'trade', 'ratesMarketData', 'swaptionMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray SwaptionMeasureCalculations.currentCash(ResolvedSwaptionTrade, RatesScenarioMarketData, SwaptionScenarioMarketData)"
  })
  void testCurrentCashWithTradeRatesMarketDataSwaptionMarketData() {
    // Arrange
    RatesScenarioMarketData ratesMarketData = mock(RatesScenarioMarketData.class);
    when(ratesMarketData.getScenarioCount()).thenThrow(new IllegalArgumentException());
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultSwaptionScenarioMarketData swaptionMarketData =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            SwaptionMeasureCalculations.DEFAULT.currentCash(
                null, ratesMarketData, swaptionMarketData));
    verify(ratesMarketData).getScenarioCount();
  }

  /**
   * Test {@link SwaptionMeasureCalculations#currentCash(ResolvedSwaptionTrade,
   * RatesScenarioMarketData, SwaptionScenarioMarketData)} with {@code trade}, {@code
   * ratesMarketData}, {@code swaptionMarketData}.
   *
   * <p>Method under test: {@link SwaptionMeasureCalculations#currentCash(ResolvedSwaptionTrade,
   * RatesScenarioMarketData, SwaptionScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedSwaptionTrade, RatesScenarioMarketData, SwaptionScenarioMarketData) with 'trade', 'ratesMarketData', 'swaptionMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray SwaptionMeasureCalculations.currentCash(ResolvedSwaptionTrade, RatesScenarioMarketData, SwaptionScenarioMarketData)"
  })
  void testCurrentCashWithTradeRatesMarketDataSwaptionMarketData2() {
    // Arrange
    RatesScenarioMarketData ratesMarketData = mock(RatesScenarioMarketData.class);
    when(ratesMarketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(ratesMarketData.getScenarioCount()).thenReturn(1);
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultSwaptionScenarioMarketData swaptionMarketData =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            SwaptionMeasureCalculations.DEFAULT.currentCash(
                null, ratesMarketData, swaptionMarketData));
    verify(ratesMarketData).getScenarioCount();
    verify(ratesMarketData).scenario(0);
  }

  /**
   * Test {@link SwaptionMeasureCalculations#currentCash(ResolvedSwaptionTrade,
   * RatesScenarioMarketData, SwaptionScenarioMarketData)} with {@code trade}, {@code
   * ratesMarketData}, {@code swaptionMarketData}.
   *
   * <p>Method under test: {@link SwaptionMeasureCalculations#currentCash(ResolvedSwaptionTrade,
   * RatesScenarioMarketData, SwaptionScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedSwaptionTrade, RatesScenarioMarketData, SwaptionScenarioMarketData) with 'trade', 'ratesMarketData', 'swaptionMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray SwaptionMeasureCalculations.currentCash(ResolvedSwaptionTrade, RatesScenarioMarketData, SwaptionScenarioMarketData)"
  })
  void testCurrentCashWithTradeRatesMarketDataSwaptionMarketData3() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.getValuationDate()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData ratesMarketData2 = mock(RatesScenarioMarketData.class);
    when(ratesMarketData2.scenario(anyInt())).thenReturn(ratesMarketData);
    when(ratesMarketData2.getScenarioCount()).thenReturn(1);
    DefaultSwaptionMarketDataLookup lookup = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultSwaptionScenarioMarketData swaptionMarketData =
        DefaultSwaptionScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            SwaptionMeasureCalculations.DEFAULT.currentCash(
                null, ratesMarketData2, swaptionMarketData));
    verify(ratesMarketData).getValuationDate();
    verify(ratesMarketData2).getScenarioCount();
    verify(ratesMarketData2).scenario(0);
  }
}
