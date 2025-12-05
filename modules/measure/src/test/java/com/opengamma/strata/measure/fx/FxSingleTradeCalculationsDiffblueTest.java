package com.opengamma.strata.measure.fx;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.FxRate;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmountArray;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.scenario.MultiCurrencyScenarioArray;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.measure.rate.RatesMarketDataLookup;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.pricer.fx.DiscountingFxSingleTradePricer;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.fx.ResolvedFxSingleTrade;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FxSingleTradeCalculationsDiffblueTest {
  /**
   * Test {@link FxSingleTradeCalculations#presentValue(ResolvedFxSingleTrade,
   * RatesMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code
   * marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCalculations#presentValue(ResolvedFxSingleTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedFxSingleTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxSingleTradeCalculations.presentValue(ResolvedFxSingleTrade, RatesMarketDataLookup, ScenarioMarketData)"
  })
  void testPresentValueWithTradeLookupMarketData_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData ratesScenarioMarketData = mock(RatesScenarioMarketData.class);
    when(ratesScenarioMarketData.getScenarioCount()).thenReturn(0);

    RatesMarketDataLookup lookup = mock(RatesMarketDataLookup.class);
    when(lookup.marketDataView(Mockito.<ScenarioMarketData>any()))
        .thenReturn(ratesScenarioMarketData);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    MultiCurrencyScenarioArray actualPresentValueResult =
        FxSingleTradeCalculations.DEFAULT.presentValue(null, lookup, marketData);

    // Assert
    verify(lookup).marketDataView(isA(ScenarioMarketData.class));
    verify(ratesScenarioMarketData).getScenarioCount();
    MultiCurrencyAmountArray amounts = actualPresentValueResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualPresentValueResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualPresentValueResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualPresentValueResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link FxSingleTradeCalculations#presentValue(ResolvedFxSingleTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCalculations#presentValue(ResolvedFxSingleTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleTradeCalculations.presentValue(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPresentValueWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.presentValue(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPresentValueResult =
        fxSingleTradeCalculations.presentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValue(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualPresentValueResult);
  }

  /**
   * Test {@link FxSingleTradeCalculations#pv01CalibratedSum(ResolvedFxSingleTrade,
   * RatesMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code
   * marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCalculations#pv01CalibratedSum(ResolvedFxSingleTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFxSingleTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxSingleTradeCalculations.pv01CalibratedSum(ResolvedFxSingleTrade, RatesMarketDataLookup, ScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeLookupMarketData_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData ratesScenarioMarketData = mock(RatesScenarioMarketData.class);
    when(ratesScenarioMarketData.getScenarioCount()).thenReturn(0);

    RatesMarketDataLookup lookup = mock(RatesMarketDataLookup.class);
    when(lookup.marketDataView(Mockito.<ScenarioMarketData>any()))
        .thenReturn(ratesScenarioMarketData);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        FxSingleTradeCalculations.DEFAULT.pv01CalibratedSum(null, lookup, marketData);

    // Assert
    verify(lookup).marketDataView(isA(ScenarioMarketData.class));
    verify(ratesScenarioMarketData).getScenarioCount();
    MultiCurrencyAmountArray amounts = actualPv01CalibratedSumResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualPv01CalibratedSumResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualPv01CalibratedSumResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link FxSingleTradeCalculations#pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCalculations#pv01CalibratedSum(ResolvedFxSingleTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleTradeCalculations.pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        fxSingleTradeCalculations.pv01CalibratedSum(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FxSingleTradeCalculations#pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCalculations#pv01CalibratedSum(ResolvedFxSingleTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleTradeCalculations.pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        fxSingleTradeCalculations.pv01CalibratedSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FxSingleTradeCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleTradeCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxSingleTradeCalculations.pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        fxSingleTradeCalculations.pv01CalibratedBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01CalibratedBucketedResult);
  }

  /**
   * Test {@link FxSingleTradeCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleTradeCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxSingleTradeCalculations.pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        fxSingleTradeCalculations.pv01CalibratedBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedBucketedResult.size());
    assertTrue(actualPv01CalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link FxSingleTradeCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade,
   * RatesMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code
   * marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleTradeCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesMarketDataLookup,
   * ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxSingleTradeCalculations.pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesMarketDataLookup, ScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeLookupMarketData_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData ratesScenarioMarketData = mock(RatesScenarioMarketData.class);
    when(ratesScenarioMarketData.getScenarioCount()).thenReturn(0);

    RatesMarketDataLookup lookup = mock(RatesMarketDataLookup.class);
    when(lookup.marketDataView(Mockito.<ScenarioMarketData>any()))
        .thenReturn(ratesScenarioMarketData);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    MultiCurrencyScenarioArray actualPv01MarketQuoteSumResult =
        FxSingleTradeCalculations.DEFAULT.pv01MarketQuoteSum(null, lookup, marketData);

    // Assert
    verify(lookup).marketDataView(isA(ScenarioMarketData.class));
    verify(ratesScenarioMarketData).getScenarioCount();
    MultiCurrencyAmountArray amounts = actualPv01MarketQuoteSumResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualPv01MarketQuoteSumResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualPv01MarketQuoteSumResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link FxSingleTradeCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleTradeCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleTradeCalculations.pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        fxSingleTradeCalculations.pv01MarketQuoteSum(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FxSingleTradeCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleTradeCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleTradeCalculations.pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        fxSingleTradeCalculations.pv01MarketQuoteSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FxSingleTradeCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleTradeCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxSingleTradeCalculations.pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        fxSingleTradeCalculations.pv01MarketQuoteBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01MarketQuoteBucketedResult);
  }

  /**
   * Test {@link FxSingleTradeCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleTradeCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxSingleTradeCalculations.pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        fxSingleTradeCalculations.pv01MarketQuoteBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteBucketedResult.size());
    assertTrue(actualPv01MarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link FxSingleTradeCalculations#parSpread(ResolvedFxSingleTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCalculations#parSpread(ResolvedFxSingleTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double FxSingleTradeCalculations.parSpread(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testParSpreadWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.parSpread(Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    // Act
    double actualParSpreadResult =
        fxSingleTradeCalculations.parSpread(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parSpread(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParSpreadResult);
  }

  /**
   * Test {@link FxSingleTradeCalculations#currencyExposure(ResolvedFxSingleTrade,
   * RatesMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code
   * marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCalculations#currencyExposure(ResolvedFxSingleTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFxSingleTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxSingleTradeCalculations.currencyExposure(ResolvedFxSingleTrade, RatesMarketDataLookup, ScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeLookupMarketData_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData ratesScenarioMarketData = mock(RatesScenarioMarketData.class);
    when(ratesScenarioMarketData.getScenarioCount()).thenReturn(0);

    RatesMarketDataLookup lookup = mock(RatesMarketDataLookup.class);
    when(lookup.marketDataView(Mockito.<ScenarioMarketData>any()))
        .thenReturn(ratesScenarioMarketData);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    MultiCurrencyScenarioArray actualCurrencyExposureResult =
        FxSingleTradeCalculations.DEFAULT.currencyExposure(null, lookup, marketData);

    // Assert
    verify(lookup).marketDataView(isA(ScenarioMarketData.class));
    verify(ratesScenarioMarketData).getScenarioCount();
    MultiCurrencyAmountArray amounts = actualCurrencyExposureResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualCurrencyExposureResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualCurrencyExposureResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualCurrencyExposureResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link FxSingleTradeCalculations#currencyExposure(ResolvedFxSingleTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCalculations#currencyExposure(ResolvedFxSingleTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleTradeCalculations.currencyExposure(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testCurrencyExposureWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currencyExposure(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrencyExposureResult =
        fxSingleTradeCalculations.currencyExposure(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currencyExposure(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrencyExposureResult);
  }

  /**
   * Test {@link FxSingleTradeCalculations#currentCash(ResolvedFxSingleTrade, RatesMarketDataLookup,
   * ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCalculations#currentCash(ResolvedFxSingleTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxSingleTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxSingleTradeCalculations.currentCash(ResolvedFxSingleTrade, RatesMarketDataLookup, ScenarioMarketData)"
  })
  void testCurrentCashWithTradeLookupMarketData_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData ratesScenarioMarketData = mock(RatesScenarioMarketData.class);
    when(ratesScenarioMarketData.getScenarioCount()).thenReturn(0);

    RatesMarketDataLookup lookup = mock(RatesMarketDataLookup.class);
    when(lookup.marketDataView(Mockito.<ScenarioMarketData>any()))
        .thenReturn(ratesScenarioMarketData);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    MultiCurrencyScenarioArray actualCurrentCashResult =
        FxSingleTradeCalculations.DEFAULT.currentCash(null, lookup, marketData);

    // Assert
    verify(lookup).marketDataView(isA(ScenarioMarketData.class));
    verify(ratesScenarioMarketData).getScenarioCount();
    MultiCurrencyAmountArray amounts = actualCurrentCashResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualCurrentCashResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualCurrentCashResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualCurrentCashResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link FxSingleTradeCalculations#currentCash(ResolvedFxSingleTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCalculations#currentCash(ResolvedFxSingleTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleTradeCalculations.currentCash(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testCurrentCashWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currentCash(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrentCashResult =
        fxSingleTradeCalculations.currentCash(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrentCashResult);
  }

  /**
   * Test {@link FxSingleTradeCalculations#forwardFxRate(ResolvedFxSingleTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCalculations#forwardFxRate(ResolvedFxSingleTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test forwardFxRate(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FxRate FxSingleTradeCalculations.forwardFxRate(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testForwardFxRateWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.forwardFxRate(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    FxSingleTradeCalculations fxSingleTradeCalculations =
        new FxSingleTradeCalculations(tradePricer);

    // Act
    FxRate actualForwardFxRateResult =
        fxSingleTradeCalculations.forwardFxRate(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).forwardFxRate(isNull(), isA(RatesProvider.class));
    assertNull(actualForwardFxRateResult);
  }
}
