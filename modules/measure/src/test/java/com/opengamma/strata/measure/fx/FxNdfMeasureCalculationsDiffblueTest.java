package com.opengamma.strata.measure.fx;

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
import com.opengamma.strata.basics.currency.FxRate;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmountArray;
import com.opengamma.strata.data.scenario.MultiCurrencyScenarioArray;
import com.opengamma.strata.data.scenario.ScenarioArray;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.measure.rate.RatesMarketData;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.pricer.fx.DiscountingFxNdfTradePricer;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.fx.ResolvedFxNdfTrade;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FxNdfMeasureCalculationsDiffblueTest {
  /**
   * Test {@link FxNdfMeasureCalculations#presentValue(ResolvedFxNdfTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FxNdfMeasureCalculations#presentValue(ResolvedFxNdfTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount FxNdfMeasureCalculations.presentValue(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testPresentValueWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValue(Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    // Act
    CurrencyAmount actualPresentValueResult =
        fxNdfMeasureCalculations.presentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValue(isNull(), isA(RatesProvider.class));
    assertNull(actualPresentValueResult);
  }

  /**
   * Test {@link FxNdfMeasureCalculations#pv01CalibratedSum(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxNdfMeasureCalculations#pv01CalibratedSum(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFxNdfTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxNdfMeasureCalculations.pv01CalibratedSum(ResolvedFxNdfTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        FxNdfMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData);

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
   * Test {@link FxNdfMeasureCalculations#pv01CalibratedSum(ResolvedFxNdfTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link FxNdfMeasureCalculations#pv01CalibratedSum(ResolvedFxNdfTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxNdfMeasureCalculations.pv01CalibratedSum(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        fxNdfMeasureCalculations.pv01CalibratedSum(null, ratesProvider);

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
   * Test {@link FxNdfMeasureCalculations#pv01CalibratedSum(ResolvedFxNdfTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxNdfMeasureCalculations#pv01CalibratedSum(ResolvedFxNdfTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxNdfMeasureCalculations.pv01CalibratedSum(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        fxNdfMeasureCalculations.pv01CalibratedSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxNdfMeasureCalculations.pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01CalibratedBucketedResult =
        fxNdfMeasureCalculations.pv01CalibratedBucketed(null, marketData);

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
   * Test {@link FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxNdfMeasureCalculations.pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData2() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

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
        fxNdfMeasureCalculations.pv01CalibratedBucketed(null, marketData);

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
   * Test {@link FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxNdfMeasureCalculations.pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData3() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

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
        fxNdfMeasureCalculations.pv01CalibratedBucketed(null, marketData);

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
   * Test {@link FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxNdfMeasureCalculations.pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData4() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

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
        fxNdfMeasureCalculations.pv01CalibratedBucketed(null, marketData);

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
   * Test {@link FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxNdfMeasureCalculations.pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        fxNdfMeasureCalculations.pv01CalibratedBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01CalibratedBucketedResult);
  }

  /**
   * Test {@link FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxNdfMeasureCalculations.pv01CalibratedBucketed(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        fxNdfMeasureCalculations.pv01CalibratedBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedBucketedResult.size());
    assertTrue(actualPv01CalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link FxNdfMeasureCalculations#pv01MarketQuoteSum(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxNdfMeasureCalculations#pv01MarketQuoteSum(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFxNdfTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxNdfMeasureCalculations.pv01MarketQuoteSum(ResolvedFxNdfTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01MarketQuoteSumResult =
        FxNdfMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData);

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
   * Test {@link FxNdfMeasureCalculations#pv01MarketQuoteSum(ResolvedFxNdfTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link FxNdfMeasureCalculations#pv01MarketQuoteSum(ResolvedFxNdfTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxNdfMeasureCalculations.pv01MarketQuoteSum(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        fxNdfMeasureCalculations.pv01MarketQuoteSum(null, ratesProvider);

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
   * Test {@link FxNdfMeasureCalculations#pv01MarketQuoteSum(ResolvedFxNdfTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxNdfMeasureCalculations#pv01MarketQuoteSum(ResolvedFxNdfTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxNdfMeasureCalculations.pv01MarketQuoteSum(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        fxNdfMeasureCalculations.pv01MarketQuoteSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxNdfMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01MarketQuoteBucketedResult =
        fxNdfMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

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
   * Test {@link FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxNdfMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData2() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

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
        fxNdfMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

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
   * Test {@link FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxNdfMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData3() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

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
        fxNdfMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

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
   * Test {@link FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxNdfMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData4() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

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
        fxNdfMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

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
   * Test {@link FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxNdfMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        fxNdfMeasureCalculations.pv01MarketQuoteBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01MarketQuoteBucketedResult);
  }

  /**
   * Test {@link FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxNdfMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxNdfMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        fxNdfMeasureCalculations.pv01MarketQuoteBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteBucketedResult.size());
    assertTrue(actualPv01MarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link FxNdfMeasureCalculations#currencyExposure(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxNdfMeasureCalculations#currencyExposure(ResolvedFxNdfTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFxNdfTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxNdfMeasureCalculations.currencyExposure(ResolvedFxNdfTrade, RatesScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualCurrencyExposureResult =
        FxNdfMeasureCalculations.DEFAULT.currencyExposure(null, marketData);

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
   * Test {@link FxNdfMeasureCalculations#currencyExposure(ResolvedFxNdfTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FxNdfMeasureCalculations#currencyExposure(ResolvedFxNdfTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxNdfMeasureCalculations.currencyExposure(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testCurrencyExposureWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currencyExposure(
            Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrencyExposureResult =
        fxNdfMeasureCalculations.currencyExposure(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currencyExposure(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrencyExposureResult);
  }

  /**
   * Test {@link FxNdfMeasureCalculations#currentCash(ResolvedFxNdfTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FxNdfMeasureCalculations#currentCash(ResolvedFxNdfTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount FxNdfMeasureCalculations.currentCash(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testCurrentCashWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.currentCash(Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    // Act
    CurrencyAmount actualCurrentCashResult =
        fxNdfMeasureCalculations.currentCash(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(RatesProvider.class));
    assertNull(actualCurrentCashResult);
  }

  /**
   * Test {@link FxNdfMeasureCalculations#forwardFxRate(ResolvedFxNdfTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FxNdfMeasureCalculations#forwardFxRate(ResolvedFxNdfTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test forwardFxRate(ResolvedFxNdfTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FxRate FxNdfMeasureCalculations.forwardFxRate(ResolvedFxNdfTrade, RatesProvider)"
  })
  void testForwardFxRateWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingFxNdfTradePricer tradePricer = mock(DiscountingFxNdfTradePricer.class);
    when(tradePricer.forwardFxRate(Mockito.<ResolvedFxNdfTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    FxNdfMeasureCalculations fxNdfMeasureCalculations = new FxNdfMeasureCalculations(tradePricer);

    // Act
    FxRate actualForwardFxRateResult =
        fxNdfMeasureCalculations.forwardFxRate(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).forwardFxRate(isNull(), isA(RatesProvider.class));
    assertNull(actualForwardFxRateResult);
  }
}
