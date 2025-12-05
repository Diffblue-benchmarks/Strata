package com.opengamma.strata.measure.fra;

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
import com.opengamma.strata.pricer.fra.DiscountingFraTradePricer;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.fra.ResolvedFraTrade;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FraTradeCalculationsDiffblueTest {
  /**
   * Test {@link FraTradeCalculations#presentValue(ResolvedFraTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#presentValue(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount FraTradeCalculations.presentValue(ResolvedFraTrade, RatesProvider)"
  })
  void testPresentValueWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValue(Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    // Act
    CurrencyAmount actualPresentValueResult =
        fraTradeCalculations.presentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValue(isNull(), isA(RatesProvider.class));
    assertNull(actualPresentValueResult);
  }

  /**
   * Test {@link FraTradeCalculations#explainPresentValue(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#explainPresentValue(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExplainMap FraTradeCalculations.explainPresentValue(ResolvedFraTrade, RatesProvider)"
  })
  void testExplainPresentValueWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    ExplainMap emptyResult = ExplainMap.empty();
    when(tradePricer.explainPresentValue(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    // Act
    ExplainMap actualExplainPresentValueResult =
        fraTradeCalculations.explainPresentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).explainPresentValue(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualExplainPresentValueResult);
  }

  /**
   * Test {@link FraTradeCalculations#pv01CalibratedSum(ResolvedFraTrade, RatesMarketDataLookup,
   * ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFraTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraTradeCalculations.pv01CalibratedSum(ResolvedFraTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        FraTradeCalculations.DEFAULT.pv01CalibratedSum(null, lookup, marketData);

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
   * Test {@link FraTradeCalculations#pv01CalibratedSum(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FraTradeCalculations.pv01CalibratedSum(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        fraTradeCalculations.pv01CalibratedSum(null, ratesProvider);

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
   * Test {@link FraTradeCalculations#pv01CalibratedSum(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FraTradeCalculations.pv01CalibratedSum(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        fraTradeCalculations.pv01CalibratedSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FraTradeCalculations#pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#pv01CalibratedBucketed(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FraTradeCalculations.pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        fraTradeCalculations.pv01CalibratedBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01CalibratedBucketedResult);
  }

  /**
   * Test {@link FraTradeCalculations#pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#pv01CalibratedBucketed(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FraTradeCalculations.pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        fraTradeCalculations.pv01CalibratedBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedBucketedResult.size());
    assertTrue(actualPv01CalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link FraTradeCalculations#pv01MarketQuoteSum(ResolvedFraTrade, RatesMarketDataLookup,
   * ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFraTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraTradeCalculations.pv01MarketQuoteSum(ResolvedFraTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        FraTradeCalculations.DEFAULT.pv01MarketQuoteSum(null, lookup, marketData);

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
   * Test {@link FraTradeCalculations#pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FraTradeCalculations.pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        fraTradeCalculations.pv01MarketQuoteSum(null, ratesProvider);

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
   * Test {@link FraTradeCalculations#pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FraTradeCalculations.pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        fraTradeCalculations.pv01MarketQuoteSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FraTradeCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FraTradeCalculations.pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        fraTradeCalculations.pv01MarketQuoteBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01MarketQuoteBucketedResult);
  }

  /**
   * Test {@link FraTradeCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FraTradeCalculations.pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        fraTradeCalculations.pv01MarketQuoteBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteBucketedResult.size());
    assertTrue(actualPv01MarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link FraTradeCalculations#parRate(ResolvedFraTrade, RatesProvider)} with {@code trade},
   * {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#parRate(ResolvedFraTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parRate(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FraTradeCalculations.parRate(ResolvedFraTrade, RatesProvider)"})
  void testParRateWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.parRate(Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    // Act
    double actualParRateResult = fraTradeCalculations.parRate(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parRate(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParRateResult);
  }

  /**
   * Test {@link FraTradeCalculations#parSpread(ResolvedFraTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#parSpread(ResolvedFraTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FraTradeCalculations.parSpread(ResolvedFraTrade, RatesProvider)"})
  void testParSpreadWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.parSpread(Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    // Act
    double actualParSpreadResult = fraTradeCalculations.parSpread(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parSpread(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParSpreadResult);
  }

  /**
   * Test {@link FraTradeCalculations#cashFlows(ResolvedFraTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#cashFlows(ResolvedFraTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CashFlows FraTradeCalculations.cashFlows(ResolvedFraTrade, RatesProvider)"})
  void testCashFlowsWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.cashFlows(Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    // Act
    CashFlows actualCashFlowsResult = fraTradeCalculations.cashFlows(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).cashFlows(isNull(), isA(RatesProvider.class));
    assertNull(actualCashFlowsResult);
  }

  /**
   * Test {@link FraTradeCalculations#currencyExposure(ResolvedFraTrade, RatesMarketDataLookup,
   * ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#currencyExposure(ResolvedFraTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFraTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraTradeCalculations.currencyExposure(ResolvedFraTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        FraTradeCalculations.DEFAULT.currencyExposure(null, lookup, marketData);

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
   * Test {@link FraTradeCalculations#currencyExposure(ResolvedFraTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#currencyExposure(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FraTradeCalculations.currencyExposure(ResolvedFraTrade, RatesProvider)"
  })
  void testCurrencyExposureWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currencyExposure(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrencyExposureResult =
        fraTradeCalculations.currencyExposure(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currencyExposure(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrencyExposureResult);
  }

  /**
   * Test {@link FraTradeCalculations#currentCash(ResolvedFraTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCalculations#currentCash(ResolvedFraTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount FraTradeCalculations.currentCash(ResolvedFraTrade, RatesProvider)"
  })
  void testCurrentCashWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.currentCash(Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    FraTradeCalculations fraTradeCalculations = new FraTradeCalculations(tradePricer);

    // Act
    CurrencyAmount actualCurrentCashResult =
        fraTradeCalculations.currentCash(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(RatesProvider.class));
    assertNull(actualCurrentCashResult);
  }
}
