package com.opengamma.strata.measure.fx;

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
import com.opengamma.strata.basics.currency.FxRate;
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
import com.opengamma.strata.pricer.fx.DiscountingFxSingleTradePricer;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.fx.ResolvedFxSingleTrade;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FxSingleMeasureCalculationsDiffblueTest {
  /**
   * Test {@link FxSingleMeasureCalculations#presentValue(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleMeasureCalculations#presentValue(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxSingleMeasureCalculations.presentValue(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testPresentValueWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPresentValueResult =
        FxSingleMeasureCalculations.DEFAULT.presentValue(null, marketData);

    // Assert
    verify(marketData).getScenarioCount();
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
   * Test {@link FxSingleMeasureCalculations#presentValue(ResolvedFxSingleTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleMeasureCalculations#presentValue(ResolvedFxSingleTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleMeasureCalculations.presentValue(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPresentValueWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.presentValue(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPresentValueResult =
        fxSingleMeasureCalculations.presentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValue(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualPresentValueResult);
  }

  /**
   * Test {@link FxSingleMeasureCalculations#pv01CalibratedSum(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01CalibratedSum(ResolvedFxSingleTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxSingleMeasureCalculations.pv01CalibratedSum(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        FxSingleMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#pv01CalibratedSum(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleMeasureCalculations.pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        fxSingleMeasureCalculations.pv01CalibratedSum(null, ratesProvider);

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
   * Test {@link FxSingleMeasureCalculations#pv01CalibratedSum(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleMeasureCalculations.pv01CalibratedSum(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        fxSingleMeasureCalculations.pv01CalibratedSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxSingleMeasureCalculations.pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01CalibratedBucketedResult =
        fxSingleMeasureCalculations.pv01CalibratedBucketed(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxSingleMeasureCalculations.pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData2() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

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
        fxSingleMeasureCalculations.pv01CalibratedBucketed(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxSingleMeasureCalculations.pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData3() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

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
        fxSingleMeasureCalculations.pv01CalibratedBucketed(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxSingleMeasureCalculations.pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData4() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

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
        fxSingleMeasureCalculations.pv01CalibratedBucketed(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxSingleMeasureCalculations.pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        fxSingleMeasureCalculations.pv01CalibratedBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01CalibratedBucketedResult);
  }

  /**
   * Test {@link FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxSingleMeasureCalculations.pv01CalibratedBucketed(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        fxSingleMeasureCalculations.pv01CalibratedBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedBucketedResult.size());
    assertTrue(actualPv01CalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link FxSingleMeasureCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxSingleMeasureCalculations.pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01MarketQuoteSumResult =
        FxSingleMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleMeasureCalculations.pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        fxSingleMeasureCalculations.pv01MarketQuoteSum(null, ratesProvider);

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
   * Test {@link FxSingleMeasureCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleMeasureCalculations.pv01MarketQuoteSum(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        fxSingleMeasureCalculations.pv01MarketQuoteSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxSingleMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01MarketQuoteBucketedResult =
        fxSingleMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxSingleMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData2() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

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
        fxSingleMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxSingleMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData3() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

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
        fxSingleMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray FxSingleMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData4() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

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
        fxSingleMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxSingleMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        fxSingleMeasureCalculations.pv01MarketQuoteBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01MarketQuoteBucketedResult);
  }

  /**
   * Test {@link FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FxSingleMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        fxSingleMeasureCalculations.pv01MarketQuoteBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteBucketedResult.size());
    assertTrue(actualPv01MarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link FxSingleMeasureCalculations#parSpread(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given three.
   *   <li>Then return Values toList size is three.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleMeasureCalculations#parSpread(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given three; then return Values toList size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleScenarioArray FxSingleMeasureCalculations.parSpread(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testParSpreadWithTradeMarketData_givenThree_thenReturnValuesToListSizeIsThree() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.parSpread(Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    DoubleScenarioArray actualParSpreadResult =
        fxSingleMeasureCalculations.parSpread(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#parSpread(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleMeasureCalculations#parSpread(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleScenarioArray FxSingleMeasureCalculations.parSpread(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testParSpreadWithTradeMarketData_thenReturnValuesSizeIsOne() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.parSpread(Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    DoubleScenarioArray actualParSpreadResult =
        fxSingleMeasureCalculations.parSpread(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#parSpread(ResolvedFxSingleTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleMeasureCalculations#parSpread(ResolvedFxSingleTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double FxSingleMeasureCalculations.parSpread(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testParSpreadWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.parSpread(Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    // Act
    double actualParSpreadResult =
        fxSingleMeasureCalculations.parSpread(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parSpread(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParSpreadResult);
  }

  /**
   * Test {@link FxSingleMeasureCalculations#currencyExposure(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#currencyExposure(ResolvedFxSingleTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxSingleMeasureCalculations.currencyExposure(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualCurrencyExposureResult =
        FxSingleMeasureCalculations.DEFAULT.currencyExposure(null, marketData);

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
   * Test {@link FxSingleMeasureCalculations#currencyExposure(ResolvedFxSingleTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleMeasureCalculations#currencyExposure(ResolvedFxSingleTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleMeasureCalculations.currencyExposure(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testCurrencyExposureWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currencyExposure(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrencyExposureResult =
        fxSingleMeasureCalculations.currencyExposure(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currencyExposure(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrencyExposureResult);
  }

  /**
   * Test {@link FxSingleMeasureCalculations#currentCash(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleMeasureCalculations#currentCash(ResolvedFxSingleTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxSingleTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FxSingleMeasureCalculations.currentCash(ResolvedFxSingleTrade, RatesScenarioMarketData)"
  })
  void testCurrentCashWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualCurrentCashResult =
        FxSingleMeasureCalculations.DEFAULT.currentCash(null, marketData);

    // Assert
    verify(marketData).getScenarioCount();
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
   * Test {@link FxSingleMeasureCalculations#currentCash(ResolvedFxSingleTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleMeasureCalculations#currentCash(ResolvedFxSingleTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FxSingleMeasureCalculations.currentCash(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testCurrentCashWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currentCash(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrentCashResult =
        fxSingleMeasureCalculations.currentCash(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrentCashResult);
  }

  /**
   * Test {@link FxSingleMeasureCalculations#forwardFxRate(ResolvedFxSingleTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleMeasureCalculations#forwardFxRate(ResolvedFxSingleTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test forwardFxRate(ResolvedFxSingleTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FxRate FxSingleMeasureCalculations.forwardFxRate(ResolvedFxSingleTrade, RatesProvider)"
  })
  void testForwardFxRateWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingFxSingleTradePricer tradePricer = mock(DiscountingFxSingleTradePricer.class);
    when(tradePricer.forwardFxRate(
            Mockito.<ResolvedFxSingleTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    FxSingleMeasureCalculations fxSingleMeasureCalculations =
        new FxSingleMeasureCalculations(tradePricer);

    // Act
    FxRate actualForwardFxRateResult =
        fxSingleMeasureCalculations.forwardFxRate(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).forwardFxRate(isNull(), isA(RatesProvider.class));
    assertNull(actualForwardFxRateResult);
  }
}
