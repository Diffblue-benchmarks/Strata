package com.opengamma.strata.measure.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmountArray;
import com.opengamma.strata.data.scenario.MultiCurrencyScenarioArray;
import com.opengamma.strata.market.amount.CashFlows;
import com.opengamma.strata.market.explain.ExplainMap;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.measure.rate.RatesMarketData;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.pricer.swap.DiscountingSwapTradePricer;
import com.opengamma.strata.product.swap.ResolvedSwapTrade;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SwapMeasureCalculationsDiffblueTest {
  /**
   * Test {@link SwapMeasureCalculations#presentValue(ResolvedSwapTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#presentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.presentValue(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPresentValueWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.presentValue(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#presentValue(ResolvedSwapTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#presentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.presentValue(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPresentValueWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.presentValue(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#presentValue(ResolvedSwapTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#presentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.presentValue(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPresentValueWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPresentValueResult =
        SwapMeasureCalculations.DEFAULT.presentValue(null, marketData);

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
   * Test {@link SwapMeasureCalculations#presentValue(ResolvedSwapTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#presentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.presentValue(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPresentValueWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.presentValue(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#presentValue(ResolvedSwapTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#presentValue(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapMeasureCalculations.presentValue(ResolvedSwapTrade, RatesProvider)"
  })
  void testPresentValueWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.presentValue(Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPresentValueResult =
        swapMeasureCalculations.presentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValue(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualPresentValueResult);
  }

  /**
   * Test {@link SwapMeasureCalculations#explainPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#explainPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.explainPresentValue(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testExplainPresentValueWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.explainPresentValue(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#explainPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#explainPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.explainPresentValue(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testExplainPresentValueWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.explainPresentValue(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#explainPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#explainPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.explainPresentValue(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testExplainPresentValueWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.explainPresentValue(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#explainPresentValue(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#explainPresentValue(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExplainMap SwapMeasureCalculations.explainPresentValue(ResolvedSwapTrade, RatesProvider)"
  })
  void testExplainPresentValueWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    ExplainMap emptyResult = ExplainMap.empty();
    when(tradePricer.explainPresentValue(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    ExplainMap actualExplainPresentValueResult =
        swapMeasureCalculations.explainPresentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).explainPresentValue(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualExplainPresentValueResult);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.pv01CalibratedSum(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.pv01CalibratedSum(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.pv01CalibratedSum(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        SwapMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData);

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
   * Test {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.pv01CalibratedSum(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapMeasureCalculations.pv01CalibratedSum(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        swapMeasureCalculations.pv01CalibratedSum(null, ratesProvider);

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
   * Test {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01CalibratedSum(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapMeasureCalculations.pv01CalibratedSum(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        swapMeasureCalculations.pv01CalibratedSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01CalibratedBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01CalibratedBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.pv01CalibratedBucketed(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01CalibratedBucketed(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01CalibratedBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01CalibratedBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.pv01CalibratedBucketed(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01CalibratedBucketed(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01CalibratedBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01CalibratedBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.pv01CalibratedBucketed(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01CalibratedBucketed(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01CalibratedBucketed(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities SwapMeasureCalculations.pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        swapMeasureCalculations.pv01CalibratedBucketed(null, ratesProvider);

    // Assert
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(emptyResult, actualPv01CalibratedBucketedResult);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01CalibratedBucketed(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities SwapMeasureCalculations.pv01CalibratedBucketed(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        swapMeasureCalculations.pv01CalibratedBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedBucketedResult.size());
    assertTrue(actualPv01CalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.pv01MarketQuoteSum(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.pv01MarketQuoteSum(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.pv01MarketQuoteSum(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01MarketQuoteSumResult =
        SwapMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData);

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
   * Test {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.pv01MarketQuoteSum(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapMeasureCalculations.pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        swapMeasureCalculations.pv01MarketQuoteSum(null, ratesProvider);

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
   * Test {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01MarketQuoteSum(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapMeasureCalculations.pv01MarketQuoteSum(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        swapMeasureCalculations.pv01MarketQuoteSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01MarketQuoteBucketed(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01MarketQuoteBucketed(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01MarketQuoteBucketed(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities SwapMeasureCalculations.pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        swapMeasureCalculations.pv01MarketQuoteBucketed(null, ratesProvider);

    // Assert
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(emptyResult, actualPv01MarketQuoteBucketedResult);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#pv01MarketQuoteBucketed(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities SwapMeasureCalculations.pv01MarketQuoteBucketed(ResolvedSwapTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        swapMeasureCalculations.pv01MarketQuoteBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteBucketedResult.size());
    assertTrue(actualPv01MarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01SemiParallelGammaBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code ResolvedSwapTrade}, {@code RatesScenarioMarketData}.
   *
   * <p>Method under test: {@link
   * SwapMeasureCalculations#pv01SemiParallelGammaBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01SemiParallelGammaBucketed(ResolvedSwapTrade, RatesScenarioMarketData) with 'ResolvedSwapTrade', 'RatesScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.pv01SemiParallelGammaBucketed(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01SemiParallelGammaBucketedWithResolvedSwapTradeRatesScenarioMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01SemiParallelGammaBucketed(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01SemiParallelGammaBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code ResolvedSwapTrade}, {@code RatesScenarioMarketData}.
   *
   * <p>Method under test: {@link
   * SwapMeasureCalculations#pv01SemiParallelGammaBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01SemiParallelGammaBucketed(ResolvedSwapTrade, RatesScenarioMarketData) with 'ResolvedSwapTrade', 'RatesScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.pv01SemiParallelGammaBucketed(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01SemiParallelGammaBucketedWithResolvedSwapTradeRatesScenarioMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01SemiParallelGammaBucketed(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01SingleNodeGammaBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * SwapMeasureCalculations#pv01SingleNodeGammaBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01SingleNodeGammaBucketed(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.pv01SingleNodeGammaBucketed(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01SingleNodeGammaBucketedWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01SingleNodeGammaBucketed(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#pv01SingleNodeGammaBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesScenarioMarketData#scenario(int)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SwapMeasureCalculations#pv01SingleNodeGammaBucketed(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01SingleNodeGammaBucketed(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls scenario(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.pv01SingleNodeGammaBucketed(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testPv01SingleNodeGammaBucketedWithTradeMarketData_thenCallsScenario() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.pv01SingleNodeGammaBucketed(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#parRate(ResolvedSwapTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#parRate(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parRate(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray SwapMeasureCalculations.parRate(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testParRateWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.parRate(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#parRate(ResolvedSwapTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#parRate(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parRate(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray SwapMeasureCalculations.parRate(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testParRateWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.parRate(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#parRate(ResolvedSwapTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#parRate(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parRate(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray SwapMeasureCalculations.parRate(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testParRateWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.parRate(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#parRate(ResolvedSwapTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#parRate(ResolvedSwapTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parRate(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SwapMeasureCalculations.parRate(ResolvedSwapTrade, RatesProvider)"})
  void testParRateWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.parRate(Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    double actualParRateResult = swapMeasureCalculations.parRate(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parRate(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParRateResult);
  }

  /**
   * Test {@link SwapMeasureCalculations#parSpread(ResolvedSwapTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#parSpread(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray SwapMeasureCalculations.parSpread(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testParSpreadWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.parSpread(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#parSpread(ResolvedSwapTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#parSpread(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray SwapMeasureCalculations.parSpread(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testParSpreadWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.parSpread(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#parSpread(ResolvedSwapTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#parSpread(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray SwapMeasureCalculations.parSpread(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testParSpreadWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.parSpread(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#parSpread(ResolvedSwapTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#parSpread(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SwapMeasureCalculations.parSpread(ResolvedSwapTrade, RatesProvider)"})
  void testParSpreadWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.parSpread(Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    double actualParSpreadResult = swapMeasureCalculations.parSpread(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parSpread(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParSpreadResult);
  }

  /**
   * Test {@link SwapMeasureCalculations#cashFlows(ResolvedSwapTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#cashFlows(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.cashFlows(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testCashFlowsWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.cashFlows(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#cashFlows(ResolvedSwapTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#cashFlows(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.cashFlows(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testCashFlowsWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.cashFlows(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#cashFlows(ResolvedSwapTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#cashFlows(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.cashFlows(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testCashFlowsWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.cashFlows(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#cashFlows(ResolvedSwapTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#cashFlows(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CashFlows SwapMeasureCalculations.cashFlows(ResolvedSwapTrade, RatesProvider)"
  })
  void testCashFlowsWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    when(tradePricer.cashFlows(Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    CashFlows actualCashFlowsResult =
        swapMeasureCalculations.cashFlows(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).cashFlows(isNull(), isA(RatesProvider.class));
    assertNull(actualCashFlowsResult);
  }

  /**
   * Test {@link SwapMeasureCalculations#accruedInterest(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#accruedInterest(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test accruedInterest(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.accruedInterest(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testAccruedInterestWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.accruedInterest(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#accruedInterest(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#accruedInterest(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test accruedInterest(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.accruedInterest(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testAccruedInterestWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.accruedInterest(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#accruedInterest(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#accruedInterest(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test accruedInterest(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.accruedInterest(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testAccruedInterestWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualAccruedInterestResult =
        SwapMeasureCalculations.DEFAULT.accruedInterest(null, marketData);

    // Assert
    verify(marketData).getScenarioCount();
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
   * Test {@link SwapMeasureCalculations#accruedInterest(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#accruedInterest(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test accruedInterest(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.accruedInterest(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testAccruedInterestWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.accruedInterest(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#accruedInterest(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#accruedInterest(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test accruedInterest(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapMeasureCalculations.accruedInterest(ResolvedSwapTrade, RatesProvider)"
  })
  void testAccruedInterestWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.accruedInterest(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualAccruedInterestResult =
        swapMeasureCalculations.accruedInterest(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).accruedInterest(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualAccruedInterestResult);
  }

  /**
   * Test {@link SwapMeasureCalculations#legPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#legPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test legPresentValue(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.legPresentValue(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testLegPresentValueWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.legPresentValue(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#legPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#legPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test legPresentValue(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.legPresentValue(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testLegPresentValueWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.legPresentValue(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#legPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#legPresentValue(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test legPresentValue(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray SwapMeasureCalculations.legPresentValue(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testLegPresentValueWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.legPresentValue(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#currencyExposure(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#currencyExposure(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.currencyExposure(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.currencyExposure(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#currencyExposure(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#currencyExposure(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.currencyExposure(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.currencyExposure(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#currencyExposure(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#currencyExposure(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.currencyExposure(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualCurrencyExposureResult =
        SwapMeasureCalculations.DEFAULT.currencyExposure(null, marketData);

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
   * Test {@link SwapMeasureCalculations#currencyExposure(ResolvedSwapTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#currencyExposure(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.currencyExposure(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.currencyExposure(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#currencyExposure(ResolvedSwapTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#currencyExposure(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapMeasureCalculations.currencyExposure(ResolvedSwapTrade, RatesProvider)"
  })
  void testCurrencyExposureWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currencyExposure(
            Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrencyExposureResult =
        swapMeasureCalculations.currencyExposure(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currencyExposure(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrencyExposureResult);
  }

  /**
   * Test {@link SwapMeasureCalculations#currentCash(ResolvedSwapTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#currentCash(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.currentCash(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testCurrentCashWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.currentCash(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link SwapMeasureCalculations#currentCash(ResolvedSwapTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link SwapMeasureCalculations#currentCash(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.currentCash(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testCurrentCashWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.currentCash(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#currentCash(ResolvedSwapTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#currentCash(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.currentCash(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testCurrentCashWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualCurrentCashResult =
        SwapMeasureCalculations.DEFAULT.currentCash(null, marketData);

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
   * Test {@link SwapMeasureCalculations#currentCash(ResolvedSwapTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#currentCash(ResolvedSwapTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedSwapTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray SwapMeasureCalculations.currentCash(ResolvedSwapTrade, RatesScenarioMarketData)"
  })
  void testCurrentCashWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SwapMeasureCalculations.DEFAULT.currentCash(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link SwapMeasureCalculations#currentCash(ResolvedSwapTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link SwapMeasureCalculations#currentCash(ResolvedSwapTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedSwapTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount SwapMeasureCalculations.currentCash(ResolvedSwapTrade, RatesProvider)"
  })
  void testCurrentCashWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingSwapTradePricer tradePricer = mock(DiscountingSwapTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currentCash(Mockito.<ResolvedSwapTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    SwapMeasureCalculations swapMeasureCalculations = new SwapMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrentCashResult =
        swapMeasureCalculations.currentCash(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrentCashResult);
  }
}
