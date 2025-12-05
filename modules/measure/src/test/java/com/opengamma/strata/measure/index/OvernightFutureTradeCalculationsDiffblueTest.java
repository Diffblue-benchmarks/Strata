package com.opengamma.strata.measure.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.measure.rate.RatesMarketDataLookup;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.index.DiscountingOvernightFutureTradePricer;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.index.ResolvedOvernightFutureTrade;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OvernightFutureTradeCalculationsDiffblueTest {
  /**
   * Test {@link OvernightFutureTradeCalculations#pv01CalibratedSum(ResolvedOvernightFutureTrade,
   * RatesMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code
   * marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculations#pv01CalibratedSum(ResolvedOvernightFutureTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedOvernightFutureTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray OvernightFutureTradeCalculations.pv01CalibratedSum(ResolvedOvernightFutureTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        OvernightFutureTradeCalculations.DEFAULT.pv01CalibratedSum(null, lookup, marketData);

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
   * Test {@link OvernightFutureTradeCalculations#pv01CalibratedSum(ResolvedOvernightFutureTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculations#pv01CalibratedSum(ResolvedOvernightFutureTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedOvernightFutureTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount OvernightFutureTradeCalculations.pv01CalibratedSum(ResolvedOvernightFutureTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingOvernightFutureTradePricer tradePricer =
        mock(DiscountingOvernightFutureTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedOvernightFutureTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    OvernightFutureTradeCalculations overnightFutureTradeCalculations =
        new OvernightFutureTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        overnightFutureTradeCalculations.pv01CalibratedSum(null, ratesProvider);

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
   * Test {@link OvernightFutureTradeCalculations#pv01CalibratedSum(ResolvedOvernightFutureTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculations#pv01CalibratedSum(ResolvedOvernightFutureTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedOvernightFutureTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount OvernightFutureTradeCalculations.pv01CalibratedSum(ResolvedOvernightFutureTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingOvernightFutureTradePricer tradePricer =
        mock(DiscountingOvernightFutureTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedOvernightFutureTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    OvernightFutureTradeCalculations overnightFutureTradeCalculations =
        new OvernightFutureTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        overnightFutureTradeCalculations.pv01CalibratedSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link
   * OvernightFutureTradeCalculations#pv01CalibratedBucketed(ResolvedOvernightFutureTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculations#pv01CalibratedBucketed(ResolvedOvernightFutureTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedOvernightFutureTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities OvernightFutureTradeCalculations.pv01CalibratedBucketed(ResolvedOvernightFutureTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingOvernightFutureTradePricer tradePricer =
        mock(DiscountingOvernightFutureTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedOvernightFutureTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    OvernightFutureTradeCalculations overnightFutureTradeCalculations =
        new OvernightFutureTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        overnightFutureTradeCalculations.pv01CalibratedBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01CalibratedBucketedResult);
  }

  /**
   * Test {@link
   * OvernightFutureTradeCalculations#pv01CalibratedBucketed(ResolvedOvernightFutureTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculations#pv01CalibratedBucketed(ResolvedOvernightFutureTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedOvernightFutureTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities OvernightFutureTradeCalculations.pv01CalibratedBucketed(ResolvedOvernightFutureTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingOvernightFutureTradePricer tradePricer =
        mock(DiscountingOvernightFutureTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedOvernightFutureTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    OvernightFutureTradeCalculations overnightFutureTradeCalculations =
        new OvernightFutureTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        overnightFutureTradeCalculations.pv01CalibratedBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedBucketedResult.size());
    assertTrue(actualPv01CalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link OvernightFutureTradeCalculations#pv01MarketQuoteSum(ResolvedOvernightFutureTrade,
   * RatesMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code
   * marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculations#pv01MarketQuoteSum(ResolvedOvernightFutureTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedOvernightFutureTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray OvernightFutureTradeCalculations.pv01MarketQuoteSum(ResolvedOvernightFutureTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        OvernightFutureTradeCalculations.DEFAULT.pv01MarketQuoteSum(null, lookup, marketData);

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
   * Test {@link OvernightFutureTradeCalculations#pv01MarketQuoteSum(ResolvedOvernightFutureTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculations#pv01MarketQuoteSum(ResolvedOvernightFutureTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedOvernightFutureTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount OvernightFutureTradeCalculations.pv01MarketQuoteSum(ResolvedOvernightFutureTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingOvernightFutureTradePricer tradePricer =
        mock(DiscountingOvernightFutureTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedOvernightFutureTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    OvernightFutureTradeCalculations overnightFutureTradeCalculations =
        new OvernightFutureTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        overnightFutureTradeCalculations.pv01MarketQuoteSum(null, ratesProvider);

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
   * Test {@link OvernightFutureTradeCalculations#pv01MarketQuoteSum(ResolvedOvernightFutureTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculations#pv01MarketQuoteSum(ResolvedOvernightFutureTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedOvernightFutureTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount OvernightFutureTradeCalculations.pv01MarketQuoteSum(ResolvedOvernightFutureTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingOvernightFutureTradePricer tradePricer =
        mock(DiscountingOvernightFutureTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedOvernightFutureTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    OvernightFutureTradeCalculations overnightFutureTradeCalculations =
        new OvernightFutureTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        overnightFutureTradeCalculations.pv01MarketQuoteSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link
   * OvernightFutureTradeCalculations#pv01MarketQuoteBucketed(ResolvedOvernightFutureTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculations#pv01MarketQuoteBucketed(ResolvedOvernightFutureTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedOvernightFutureTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities OvernightFutureTradeCalculations.pv01MarketQuoteBucketed(ResolvedOvernightFutureTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingOvernightFutureTradePricer tradePricer =
        mock(DiscountingOvernightFutureTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedOvernightFutureTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    OvernightFutureTradeCalculations overnightFutureTradeCalculations =
        new OvernightFutureTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        overnightFutureTradeCalculations.pv01MarketQuoteBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01MarketQuoteBucketedResult);
  }

  /**
   * Test {@link
   * OvernightFutureTradeCalculations#pv01MarketQuoteBucketed(ResolvedOvernightFutureTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculations#pv01MarketQuoteBucketed(ResolvedOvernightFutureTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedOvernightFutureTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities OvernightFutureTradeCalculations.pv01MarketQuoteBucketed(ResolvedOvernightFutureTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingOvernightFutureTradePricer tradePricer =
        mock(DiscountingOvernightFutureTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedOvernightFutureTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    OvernightFutureTradeCalculations overnightFutureTradeCalculations =
        new OvernightFutureTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        overnightFutureTradeCalculations.pv01MarketQuoteBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteBucketedResult.size());
    assertTrue(actualPv01MarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link OvernightFutureTradeCalculations#unitPrice(ResolvedOvernightFutureTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureTradeCalculations#unitPrice(ResolvedOvernightFutureTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test unitPrice(ResolvedOvernightFutureTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double OvernightFutureTradeCalculations.unitPrice(ResolvedOvernightFutureTrade, RatesProvider)"
  })
  void testUnitPriceWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingOvernightFutureTradePricer tradePricer =
        mock(DiscountingOvernightFutureTradePricer.class);
    when(tradePricer.price(
            Mockito.<ResolvedOvernightFutureTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    OvernightFutureTradeCalculations overnightFutureTradeCalculations =
        new OvernightFutureTradeCalculations(tradePricer);

    // Act
    double actualUnitPriceResult =
        overnightFutureTradeCalculations.unitPrice(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).price(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualUnitPriceResult);
  }
}
