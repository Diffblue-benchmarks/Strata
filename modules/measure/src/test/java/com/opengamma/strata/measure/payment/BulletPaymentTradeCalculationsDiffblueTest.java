package com.opengamma.strata.measure.payment;

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
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.measure.rate.RatesMarketDataLookup;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.pricer.BaseProvider;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.payment.DiscountingBulletPaymentTradePricer;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.payment.ResolvedBulletPaymentTrade;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BulletPaymentTradeCalculationsDiffblueTest {
  /**
   * Test {@link BulletPaymentTradeCalculations#presentValue(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#presentValue(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount BulletPaymentTradeCalculations.presentValue(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPresentValueWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValue(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(null);
    BulletPaymentTradeCalculations bulletPaymentTradeCalculations =
        new BulletPaymentTradeCalculations(tradePricer);

    // Act
    CurrencyAmount actualPresentValueResult =
        bulletPaymentTradeCalculations.presentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValue(isNull(), isA(BaseProvider.class));
    assertNull(actualPresentValueResult);
  }

  /**
   * Test {@link BulletPaymentTradeCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade,
   * RatesMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code
   * marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray BulletPaymentTradeCalculations.pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        BulletPaymentTradeCalculations.DEFAULT.pv01CalibratedSum(null, lookup, marketData);

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
   * Test {@link BulletPaymentTradeCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount BulletPaymentTradeCalculations.pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentTradeCalculations bulletPaymentTradeCalculations =
        new BulletPaymentTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        bulletPaymentTradeCalculations.pv01CalibratedSum(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link BulletPaymentTradeCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount BulletPaymentTradeCalculations.pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentTradeCalculations bulletPaymentTradeCalculations =
        new BulletPaymentTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        bulletPaymentTradeCalculations.pv01CalibratedSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link BulletPaymentTradeCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities BulletPaymentTradeCalculations.pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentTradeCalculations bulletPaymentTradeCalculations =
        new BulletPaymentTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        bulletPaymentTradeCalculations.pv01CalibratedBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01CalibratedBucketedResult);
  }

  /**
   * Test {@link BulletPaymentTradeCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities BulletPaymentTradeCalculations.pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentTradeCalculations bulletPaymentTradeCalculations =
        new BulletPaymentTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        bulletPaymentTradeCalculations.pv01CalibratedBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    assertEquals(0, actualPv01CalibratedBucketedResult.size());
    assertTrue(actualPv01CalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link BulletPaymentTradeCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade,
   * RatesMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code
   * marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray BulletPaymentTradeCalculations.pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        BulletPaymentTradeCalculations.DEFAULT.pv01MarketQuoteSum(null, lookup, marketData);

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
   * Test {@link BulletPaymentTradeCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount BulletPaymentTradeCalculations.pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentTradeCalculations bulletPaymentTradeCalculations =
        new BulletPaymentTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        bulletPaymentTradeCalculations.pv01MarketQuoteSum(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link BulletPaymentTradeCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount BulletPaymentTradeCalculations.pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentTradeCalculations bulletPaymentTradeCalculations =
        new BulletPaymentTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        bulletPaymentTradeCalculations.pv01MarketQuoteSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link BulletPaymentTradeCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities BulletPaymentTradeCalculations.pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentTradeCalculations bulletPaymentTradeCalculations =
        new BulletPaymentTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        bulletPaymentTradeCalculations.pv01MarketQuoteBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01MarketQuoteBucketedResult);
  }

  /**
   * Test {@link BulletPaymentTradeCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities BulletPaymentTradeCalculations.pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentTradeCalculations bulletPaymentTradeCalculations =
        new BulletPaymentTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        bulletPaymentTradeCalculations.pv01MarketQuoteBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    assertEquals(0, actualPv01MarketQuoteBucketedResult.size());
    assertTrue(actualPv01MarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link BulletPaymentTradeCalculations#cashFlows(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#cashFlows(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CashFlows BulletPaymentTradeCalculations.cashFlows(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testCashFlowsWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.cashFlows(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(null);
    BulletPaymentTradeCalculations bulletPaymentTradeCalculations =
        new BulletPaymentTradeCalculations(tradePricer);

    // Act
    CashFlows actualCashFlowsResult =
        bulletPaymentTradeCalculations.cashFlows(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).cashFlows(isNull(), isA(BaseProvider.class));
    assertNull(actualCashFlowsResult);
  }

  /**
   * Test {@link BulletPaymentTradeCalculations#currencyExposure(ResolvedBulletPaymentTrade,
   * RatesMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code lookup}, {@code
   * marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#currencyExposure(ResolvedBulletPaymentTrade,
   * RatesMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedBulletPaymentTrade, RatesMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray BulletPaymentTradeCalculations.currencyExposure(ResolvedBulletPaymentTrade, RatesMarketDataLookup, ScenarioMarketData)"
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
        BulletPaymentTradeCalculations.DEFAULT.currencyExposure(null, lookup, marketData);

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
   * Test {@link BulletPaymentTradeCalculations#currentCash(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentTradeCalculations#currentCash(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount BulletPaymentTradeCalculations.currentCash(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testCurrentCashWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.currentCash(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(null);
    BulletPaymentTradeCalculations bulletPaymentTradeCalculations =
        new BulletPaymentTradeCalculations(tradePricer);

    // Act
    CurrencyAmount actualCurrentCashResult =
        bulletPaymentTradeCalculations.currentCash(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(BaseProvider.class));
    assertNull(actualCurrentCashResult);
  }
}
