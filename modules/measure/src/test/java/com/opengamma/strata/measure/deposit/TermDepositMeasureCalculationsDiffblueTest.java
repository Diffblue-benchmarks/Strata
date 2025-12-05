package com.opengamma.strata.measure.deposit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmountArray;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.data.scenario.DoubleScenarioArray;
import com.opengamma.strata.data.scenario.MultiCurrencyScenarioArray;
import com.opengamma.strata.data.scenario.ScenarioArray;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.measure.rate.RatesMarketData;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.pricer.deposit.DiscountingTermDepositTradePricer;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.deposit.ResolvedTermDepositTrade;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TermDepositMeasureCalculationsDiffblueTest {
  /**
   * Test {@link TermDepositMeasureCalculations#presentValue(ResolvedTermDepositTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#presentValue(ResolvedTermDepositTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount TermDepositMeasureCalculations.presentValue(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testPresentValueWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValue(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    // Act
    CurrencyAmount actualPresentValueResult =
        termDepositMeasureCalculations.presentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValue(isNull(), isA(RatesProvider.class));
    assertNull(actualPresentValueResult);
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01CalibratedSum(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01CalibratedSum(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray TermDepositMeasureCalculations.pv01CalibratedSum(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        TermDepositMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData);

    // Assert
    verify(marketData).getScenarioCount();
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
   * Test {@link TermDepositMeasureCalculations#pv01CalibratedSum(ResolvedTermDepositTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01CalibratedSum(ResolvedTermDepositTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount TermDepositMeasureCalculations.pv01CalibratedSum(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        termDepositMeasureCalculations.pv01CalibratedSum(null, ratesProvider);

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
   * Test {@link TermDepositMeasureCalculations#pv01CalibratedSum(ResolvedTermDepositTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01CalibratedSum(ResolvedTermDepositTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount TermDepositMeasureCalculations.pv01CalibratedSum(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        termDepositMeasureCalculations.pv01CalibratedSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray TermDepositMeasureCalculations.pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01CalibratedBucketedResult =
        termDepositMeasureCalculations.pv01CalibratedBucketed(null, marketData);

    // Assert
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01CalibratedBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyParameterSensitivities getResult = collectResult.get(0);
    assertEquals(0, getResult.size());
    assertTrue(getResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray TermDepositMeasureCalculations.pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData2() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    MockRatesProvider mockRatesProvider = mock(MockRatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(mockRatesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(mockRatesProvider);

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01CalibratedBucketedResult =
        termDepositMeasureCalculations.pv01CalibratedBucketed(null, marketData);

    // Assert
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(mockRatesProvider).parameterSensitivity(isA(PointSensitivities.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01CalibratedBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals(emptyResult, collectResult.get(0));
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray TermDepositMeasureCalculations.pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData3() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    MockRatesProvider mockRatesProvider = mock(MockRatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(mockRatesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(mockRatesProvider);

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01CalibratedBucketedResult =
        termDepositMeasureCalculations.pv01CalibratedBucketed(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(mockRatesProvider, atLeast(1)).parameterSensitivity(isA(PointSensitivities.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01CalibratedBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals(emptyResult, collectResult.get(1));
    assertEquals(emptyResult, collectResult.get(2));
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray TermDepositMeasureCalculations.pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData4() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    MockRatesProvider mockRatesProvider = mock(MockRatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(mockRatesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(mockRatesProvider);

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(4);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01CalibratedBucketedResult =
        termDepositMeasureCalculations.pv01CalibratedBucketed(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(mockRatesProvider, atLeast(1)).parameterSensitivity(isA(PointSensitivities.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01CalibratedBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(4, collectResult.size());
    assertEquals(emptyResult, collectResult.get(3));
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities TermDepositMeasureCalculations.pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        termDepositMeasureCalculations.pv01CalibratedBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01CalibratedBucketedResult);
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities TermDepositMeasureCalculations.pv01CalibratedBucketed(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        termDepositMeasureCalculations.pv01CalibratedBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedBucketedResult.size());
    assertTrue(actualPv01CalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01MarketQuoteSum(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01MarketQuoteSum(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray TermDepositMeasureCalculations.pv01MarketQuoteSum(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01MarketQuoteSumResult =
        TermDepositMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData);

    // Assert
    verify(marketData).getScenarioCount();
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
   * Test {@link TermDepositMeasureCalculations#pv01MarketQuoteSum(ResolvedTermDepositTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01MarketQuoteSum(ResolvedTermDepositTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount TermDepositMeasureCalculations.pv01MarketQuoteSum(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        termDepositMeasureCalculations.pv01MarketQuoteSum(null, ratesProvider);

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
   * Test {@link TermDepositMeasureCalculations#pv01MarketQuoteSum(ResolvedTermDepositTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01MarketQuoteSum(ResolvedTermDepositTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount TermDepositMeasureCalculations.pv01MarketQuoteSum(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        termDepositMeasureCalculations.pv01MarketQuoteSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray TermDepositMeasureCalculations.pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01MarketQuoteBucketedResult =
        termDepositMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

    // Assert
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01MarketQuoteBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    CurrencyParameterSensitivities getResult = collectResult.get(0);
    assertEquals(0, getResult.size());
    assertTrue(getResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray TermDepositMeasureCalculations.pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData2() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    MockRatesProvider mockRatesProvider = mock(MockRatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(mockRatesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(mockRatesProvider);

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01MarketQuoteBucketedResult =
        termDepositMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

    // Assert
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(mockRatesProvider).parameterSensitivity(isA(PointSensitivities.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01MarketQuoteBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals(emptyResult, collectResult.get(0));
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray TermDepositMeasureCalculations.pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData3() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    MockRatesProvider mockRatesProvider = mock(MockRatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(mockRatesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(mockRatesProvider);

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01MarketQuoteBucketedResult =
        termDepositMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(mockRatesProvider, atLeast(1)).parameterSensitivity(isA(PointSensitivities.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01MarketQuoteBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals(emptyResult, collectResult.get(1));
    assertEquals(emptyResult, collectResult.get(2));
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray TermDepositMeasureCalculations.pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData4() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    MockRatesProvider mockRatesProvider = mock(MockRatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(mockRatesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(mockRatesProvider);

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(4);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01MarketQuoteBucketedResult =
        termDepositMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(mockRatesProvider, atLeast(1)).parameterSensitivity(isA(PointSensitivities.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01MarketQuoteBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(4, collectResult.size());
    assertEquals(emptyResult, collectResult.get(3));
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities TermDepositMeasureCalculations.pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        termDepositMeasureCalculations.pv01MarketQuoteBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01MarketQuoteBucketedResult);
  }

  /**
   * Test {@link TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#pv01MarketQuoteBucketed(ResolvedTermDepositTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities TermDepositMeasureCalculations.pv01MarketQuoteBucketed(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        termDepositMeasureCalculations.pv01MarketQuoteBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteBucketedResult.size());
    assertTrue(actualPv01MarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link TermDepositMeasureCalculations#parRate(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given three.
   *   <li>Then return Values toList size is three.
   * </ul>
   *
   * <p>Method under test: {@link TermDepositMeasureCalculations#parRate(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parRate(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given three; then return Values toList size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleScenarioArray TermDepositMeasureCalculations.parRate(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testParRateWithTradeMarketData_givenThree_thenReturnValuesToListSizeIsThree() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.parRate(Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    DoubleScenarioArray actualParRateResult =
        termDepositMeasureCalculations.parRate(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).parRate(isNull(), isA(RatesProvider.class));
    DoubleArray values = actualParRateResult.getValues();
    List<Double> toListResult = values.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    Stream<Double> streamResult = actualParRateResult.stream();
    List<Double> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals(10.0d, collectResult.get(1).doubleValue());
    assertEquals(10.0d, collectResult.get(2).doubleValue());
    assertEquals(3, values.size());
    assertEquals(3, actualParRateResult.getScenarioCount());
    assertEquals(30.0d, values.sum());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link TermDepositMeasureCalculations#parRate(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link TermDepositMeasureCalculations#parRate(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parRate(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleScenarioArray TermDepositMeasureCalculations.parRate(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testParRateWithTradeMarketData_thenReturnValuesSizeIsOne() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.parRate(Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    DoubleScenarioArray actualParRateResult =
        termDepositMeasureCalculations.parRate(null, marketData);

    // Assert
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
    verify(tradePricer).parRate(isNull(), isA(RatesProvider.class));
    DoubleArray values = actualParRateResult.getValues();
    assertEquals(1, values.size());
    assertEquals(1, actualParRateResult.getScenarioCount());
    assertEquals(1, values.toList().size());
    Stream<Double> streamResult = actualParRateResult.stream();
    assertEquals(1, streamResult.limit(5).collect(Collectors.toList()).size());
    assertEquals(10.0d, values.sum());
    assertArrayEquals(new double[] {10.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link TermDepositMeasureCalculations#parRate(ResolvedTermDepositTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link TermDepositMeasureCalculations#parRate(ResolvedTermDepositTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parRate(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double TermDepositMeasureCalculations.parRate(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testParRateWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.parRate(Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    // Act
    double actualParRateResult =
        termDepositMeasureCalculations.parRate(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parRate(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParRateResult);
  }

  /**
   * Test {@link TermDepositMeasureCalculations#parSpread(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given three.
   *   <li>Then return Values toList size is three.
   * </ul>
   *
   * <p>Method under test: {@link TermDepositMeasureCalculations#parSpread(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given three; then return Values toList size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleScenarioArray TermDepositMeasureCalculations.parSpread(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testParSpreadWithTradeMarketData_givenThree_thenReturnValuesToListSizeIsThree() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.parSpread(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    DoubleScenarioArray actualParSpreadResult =
        termDepositMeasureCalculations.parSpread(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).parSpread(isNull(), isA(RatesProvider.class));
    DoubleArray values = actualParSpreadResult.getValues();
    List<Double> toListResult = values.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    Stream<Double> streamResult = actualParSpreadResult.stream();
    List<Double> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals(10.0d, collectResult.get(1).doubleValue());
    assertEquals(10.0d, collectResult.get(2).doubleValue());
    assertEquals(3, values.size());
    assertEquals(3, actualParSpreadResult.getScenarioCount());
    assertEquals(30.0d, values.sum());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link TermDepositMeasureCalculations#parSpread(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link TermDepositMeasureCalculations#parSpread(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleScenarioArray TermDepositMeasureCalculations.parSpread(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testParSpreadWithTradeMarketData_thenReturnValuesSizeIsOne() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.parSpread(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    DoubleScenarioArray actualParSpreadResult =
        termDepositMeasureCalculations.parSpread(null, marketData);

    // Assert
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
    verify(tradePricer).parSpread(isNull(), isA(RatesProvider.class));
    DoubleArray values = actualParSpreadResult.getValues();
    assertEquals(1, values.size());
    assertEquals(1, actualParSpreadResult.getScenarioCount());
    assertEquals(1, values.toList().size());
    Stream<Double> streamResult = actualParSpreadResult.stream();
    assertEquals(1, streamResult.limit(5).collect(Collectors.toList()).size());
    assertEquals(10.0d, values.sum());
    assertArrayEquals(new double[] {10.0d}, values.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link TermDepositMeasureCalculations#parSpread(ResolvedTermDepositTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link TermDepositMeasureCalculations#parSpread(ResolvedTermDepositTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double TermDepositMeasureCalculations.parSpread(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testParSpreadWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.parSpread(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    // Act
    double actualParSpreadResult =
        termDepositMeasureCalculations.parSpread(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parSpread(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParSpreadResult);
  }

  /**
   * Test {@link TermDepositMeasureCalculations#currencyExposure(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#currencyExposure(ResolvedTermDepositTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedTermDepositTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray TermDepositMeasureCalculations.currencyExposure(ResolvedTermDepositTrade, RatesScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualCurrencyExposureResult =
        TermDepositMeasureCalculations.DEFAULT.currencyExposure(null, marketData);

    // Assert
    verify(marketData).getScenarioCount();
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
   * Test {@link TermDepositMeasureCalculations#currencyExposure(ResolvedTermDepositTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#currencyExposure(ResolvedTermDepositTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount TermDepositMeasureCalculations.currencyExposure(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testCurrencyExposureWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currencyExposure(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrencyExposureResult =
        termDepositMeasureCalculations.currencyExposure(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currencyExposure(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrencyExposureResult);
  }

  /**
   * Test {@link TermDepositMeasureCalculations#currentCash(ResolvedTermDepositTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * TermDepositMeasureCalculations#currentCash(ResolvedTermDepositTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedTermDepositTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount TermDepositMeasureCalculations.currentCash(ResolvedTermDepositTrade, RatesProvider)"
  })
  void testCurrentCashWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingTermDepositTradePricer tradePricer = mock(DiscountingTermDepositTradePricer.class);
    when(tradePricer.currentCash(
            Mockito.<ResolvedTermDepositTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    TermDepositMeasureCalculations termDepositMeasureCalculations =
        new TermDepositMeasureCalculations(tradePricer);

    // Act
    CurrencyAmount actualCurrentCashResult =
        termDepositMeasureCalculations.currentCash(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(RatesProvider.class));
    assertNull(actualCurrentCashResult);
  }
}
