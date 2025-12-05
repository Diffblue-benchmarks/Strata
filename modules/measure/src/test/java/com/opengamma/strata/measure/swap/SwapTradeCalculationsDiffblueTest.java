package com.opengamma.strata.measure.swap;

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
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmountArray;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.scenario.MultiCurrencyScenarioArray;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.market.amount.CashFlows;
import com.opengamma.strata.market.explain.ExplainMap;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.measure.rate.RatesMarketDataLookup;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.pricer.swap.DiscountingSwapTradePricer;
import com.opengamma.strata.product.swap.ResolvedSwapTrade;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SwapTradeCalculationsDiffblueTest {
  /**
   * Test {@link SwapTradeCalculations#presentValue(ResolvedSwapTrade, RatesMarketDataLookup,
   * ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#presentValue(ResolvedSwapTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapTradeCalculations.presentValue(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        SwapTradeCalculations.DEFAULT.presentValue(null, lookup, marketData);

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
   * Test {@link SwapTradeCalculations#presentValue(ResolvedSwapTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#presentValue(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapTradeCalculations.presentValue(ResolvedSwapTrade, RatesProvider)"
  })
  void testPresentValueWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.presentValue(Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPresentValueResult =
        swapTradeCalculations.presentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValue(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualPresentValueResult);
  }

  /**
   * Test {@link SwapTradeCalculations#explainPresentValue(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#explainPresentValue(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExplainMap SwapTradeCalculations.explainPresentValue(ResolvedSwapTrade, RatesProvider)"
  })
  void testExplainPresentValueWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    ExplainMap emptyResult = ExplainMap.empty();
    when(tradePricer.explainPresentValue(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    ExplainMap actualExplainPresentValueResult =
        swapTradeCalculations.explainPresentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).explainPresentValue(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualExplainPresentValueResult);
  }

  /**
   * Test {@link SwapTradeCalculations#pv01CalibratedSum(ResolvedSwapTrade, RatesMarketDataLookup,
   * ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapTradeCalculations.pv01CalibratedSum(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        SwapTradeCalculations.DEFAULT.pv01CalibratedSum(null, lookup, marketData);

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
   * Test {@link SwapTradeCalculations#pv01CalibratedSum(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapTradeCalculations.pv01CalibratedSum(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        swapTradeCalculations.pv01CalibratedSum(null, ratesProvider);

    // Assert
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link SwapTradeCalculations#pv01CalibratedSum(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapTradeCalculations.pv01CalibratedSum(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        swapTradeCalculations.pv01CalibratedSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link SwapTradeCalculations#pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#pv01CalibratedBucketed(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities SwapTradeCalculations.pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        swapTradeCalculations.pv01CalibratedBucketed(null, ratesProvider);

    // Assert
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(emptyResult, actualPv01CalibratedBucketedResult);
  }

  /**
   * Test {@link SwapTradeCalculations#pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#pv01CalibratedBucketed(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities SwapTradeCalculations.pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        swapTradeCalculations.pv01CalibratedBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedBucketedResult.size());
    assertTrue(actualPv01CalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link SwapTradeCalculations#pv01MarketQuoteSum(ResolvedSwapTrade, RatesMarketDataLookup,
   * ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapTradeCalculations.pv01MarketQuoteSum(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        SwapTradeCalculations.DEFAULT.pv01MarketQuoteSum(null, lookup, marketData);

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
   * Test {@link SwapTradeCalculations#pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapTradeCalculations.pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        swapTradeCalculations.pv01MarketQuoteSum(null, ratesProvider);

    // Assert
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link SwapTradeCalculations#pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapTradeCalculations.pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        swapTradeCalculations.pv01MarketQuoteSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link SwapTradeCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities SwapTradeCalculations.pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        swapTradeCalculations.pv01MarketQuoteBucketed(null, ratesProvider);

    // Assert
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(emptyResult, actualPv01MarketQuoteBucketedResult);
  }

  /**
   * Test {@link SwapTradeCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities SwapTradeCalculations.pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        swapTradeCalculations.pv01MarketQuoteBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteBucketedResult.size());
    assertTrue(actualPv01MarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link SwapTradeCalculations#parRate(ResolvedSwapTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#parRate(ResolvedSwapTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parRate(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SwapTradeCalculations.parRate(ResolvedSwapTrade, RatesProvider)"})
  void testParRateWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.parRate(Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    double actualParRateResult = swapTradeCalculations.parRate(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parRate(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParRateResult);
  }

  /**
   * Test {@link SwapTradeCalculations#parSpread(ResolvedSwapTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#parSpread(ResolvedSwapTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SwapTradeCalculations.parSpread(ResolvedSwapTrade, RatesProvider)"})
  void testParSpreadWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.parSpread(Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    double actualParSpreadResult = swapTradeCalculations.parSpread(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parSpread(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParSpreadResult);
  }

  /**
   * Test {@link SwapTradeCalculations#cashFlows(ResolvedSwapTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#cashFlows(ResolvedSwapTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CashFlows SwapTradeCalculations.cashFlows(ResolvedSwapTrade, RatesProvider)"})
  void testCashFlowsWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.cashFlows(Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    CashFlows actualCashFlowsResult =
        swapTradeCalculations.cashFlows(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).cashFlows(isNull(), isA(RatesProvider.class));
    assertNull(actualCashFlowsResult);
  }

  /**
   * Test {@link SwapTradeCalculations#accruedInterest(ResolvedSwapTrade, RatesMarketDataLookup,
   * ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#accruedInterest(ResolvedSwapTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test accruedInterest(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapTradeCalculations.accruedInterest(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData)"
  })
  void testAccruedInterestWithTradeLookupMarketData_thenReturnAmountsSizeIsZero() {
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
    MultiCurrencyScenarioArray actualAccruedInterestResult =
        SwapTradeCalculations.DEFAULT.accruedInterest(null, lookup, marketData);

    // Assert
    verify(lookup).marketDataView(isA(ScenarioMarketData.class));
    verify(ratesScenarioMarketData).getScenarioCount();
    MultiCurrencyAmountArray amounts = actualAccruedInterestResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualAccruedInterestResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualAccruedInterestResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualAccruedInterestResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link SwapTradeCalculations#accruedInterest(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#accruedInterest(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test accruedInterest(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapTradeCalculations.accruedInterest(ResolvedSwapTrade, RatesProvider)"
  })
  void testAccruedInterestWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.accruedInterest(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualAccruedInterestResult =
        swapTradeCalculations.accruedInterest(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).accruedInterest(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualAccruedInterestResult);
  }

  /**
   * Test {@link SwapTradeCalculations#currencyExposure(ResolvedSwapTrade, RatesMarketDataLookup,
   * ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#currencyExposure(ResolvedSwapTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapTradeCalculations.currencyExposure(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        SwapTradeCalculations.DEFAULT.currencyExposure(null, lookup, marketData);

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
   * Test {@link SwapTradeCalculations#currencyExposure(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#currencyExposure(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapTradeCalculations.currencyExposure(ResolvedSwapTrade, RatesProvider)"
  })
  void testCurrencyExposureWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currencyExposure(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrencyExposureResult =
        swapTradeCalculations.currencyExposure(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currencyExposure(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrencyExposureResult);
  }

  /**
   * Test {@link SwapTradeCalculations#currentCash(ResolvedSwapTrade, RatesMarketDataLookup,
   * ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#currentCash(ResolvedSwapTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapTradeCalculations.currentCash(ResolvedSwapTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        SwapTradeCalculations.DEFAULT.currentCash(null, lookup, marketData);

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
   * Test {@link SwapTradeCalculations#currentCash(ResolvedSwapTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapTradeCalculations#currentCash(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapTradeCalculations.currentCash(ResolvedSwapTrade, RatesProvider)"
  })
  void testCurrentCashWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currentCash(Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    SwapTradeCalculations swapTradeCalculations = new SwapTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrentCashResult =
        swapTradeCalculations.currentCash(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrentCashResult);
  }
}
