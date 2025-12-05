package com.opengamma.strata.measure.fra;

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
import com.opengamma.strata.pricer.fra.DiscountingFraTradePricer;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.fra.ResolvedFraTrade;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FraMeasureCalculationsDiffblueTest {
  /**
   * Test {@link FraMeasureCalculations#presentValue(ResolvedFraTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#presentValue(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FraMeasureCalculations.presentValue(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPresentValueWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.presentValue(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#presentValue(ResolvedFraTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#presentValue(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FraMeasureCalculations.presentValue(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPresentValueWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.presentValue(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#presentValue(ResolvedFraTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#presentValue(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FraMeasureCalculations.presentValue(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPresentValueWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.presentValue(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#presentValue(ResolvedFraTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#presentValue(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount FraMeasureCalculations.presentValue(ResolvedFraTrade, RatesProvider)"
  })
  void testPresentValueWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValue(Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    // Act
    CurrencyAmount actualPresentValueResult =
        fraMeasureCalculations.presentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValue(isNull(), isA(RatesProvider.class));
    assertNull(actualPresentValueResult);
  }

  /**
   * Test {@link FraMeasureCalculations#explainPresentValue(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#explainPresentValue(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.explainPresentValue(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testExplainPresentValueWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.explainPresentValue(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#explainPresentValue(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#explainPresentValue(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.explainPresentValue(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testExplainPresentValueWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.explainPresentValue(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#explainPresentValue(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#explainPresentValue(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.explainPresentValue(ResolvedFraTrade, RatesScenarioMarketData)"
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
        () -> FraMeasureCalculations.DEFAULT.explainPresentValue(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#explainPresentValue(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#explainPresentValue(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExplainMap FraMeasureCalculations.explainPresentValue(ResolvedFraTrade, RatesProvider)"
  })
  void testExplainPresentValueWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    ExplainMap emptyResult = ExplainMap.empty();
    when(tradePricer.explainPresentValue(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    // Act
    ExplainMap actualExplainPresentValueResult =
        fraMeasureCalculations.explainPresentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).explainPresentValue(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualExplainPresentValueResult);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.pv01CalibratedSum(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.pv01CalibratedSum(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.pv01CalibratedSum(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        FraMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData);

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
   * Test {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.pv01CalibratedSum(ResolvedFraTrade, RatesScenarioMarketData)"
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
        () -> FraMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FraMeasureCalculations.pv01CalibratedSum(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        fraMeasureCalculations.pv01CalibratedSum(null, ratesProvider);

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
   * Test {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01CalibratedSum(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FraMeasureCalculations.pv01CalibratedSum(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        fraMeasureCalculations.pv01CalibratedSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FraMeasureCalculations#pv01CalibratedBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01CalibratedBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.pv01CalibratedBucketed(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01CalibratedBucketed(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#pv01CalibratedBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01CalibratedBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.pv01CalibratedBucketed(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01CalibratedBucketed(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01CalibratedBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01CalibratedBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.pv01CalibratedBucketed(ResolvedFraTrade, RatesScenarioMarketData)"
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
        () -> FraMeasureCalculations.DEFAULT.pv01CalibratedBucketed(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01CalibratedBucketed(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FraMeasureCalculations.pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        fraMeasureCalculations.pv01CalibratedBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01CalibratedBucketedResult);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01CalibratedBucketed(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FraMeasureCalculations.pv01CalibratedBucketed(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        fraMeasureCalculations.pv01CalibratedBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01CalibratedBucketedResult.size());
    assertTrue(actualPv01CalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.pv01MarketQuoteSum(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.pv01MarketQuoteSum(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.pv01MarketQuoteSum(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01MarketQuoteSumResult =
        FraMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData);

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
   * Test {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.pv01MarketQuoteSum(ResolvedFraTrade, RatesScenarioMarketData)"
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
        () -> FraMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FraMeasureCalculations.pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        fraMeasureCalculations.pv01MarketQuoteSum(null, ratesProvider);

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
   * Test {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01MarketQuoteSum(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FraMeasureCalculations.pv01MarketQuoteSum(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        fraMeasureCalculations.pv01MarketQuoteSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link FraMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01MarketQuoteBucketed(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01MarketQuoteBucketed(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFraTrade, RatesScenarioMarketData)"
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
        () -> FraMeasureCalculations.DEFAULT.pv01MarketQuoteBucketed(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FraMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        fraMeasureCalculations.pv01MarketQuoteBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01MarketQuoteBucketedResult);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider)}
   * with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#pv01MarketQuoteBucketed(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities FraMeasureCalculations.pv01MarketQuoteBucketed(ResolvedFraTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        fraMeasureCalculations.pv01MarketQuoteBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualPv01MarketQuoteBucketedResult.size());
    assertTrue(actualPv01MarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link FraMeasureCalculations#pv01SemiParallelGammaBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code ResolvedFraTrade}, {@code RatesScenarioMarketData}.
   *
   * <p>Method under test: {@link
   * FraMeasureCalculations#pv01SemiParallelGammaBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01SemiParallelGammaBucketed(ResolvedFraTrade, RatesScenarioMarketData) with 'ResolvedFraTrade', 'RatesScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.pv01SemiParallelGammaBucketed(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01SemiParallelGammaBucketedWithResolvedFraTradeRatesScenarioMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01SemiParallelGammaBucketed(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#pv01SemiParallelGammaBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code ResolvedFraTrade}, {@code RatesScenarioMarketData}.
   *
   * <p>Method under test: {@link
   * FraMeasureCalculations#pv01SemiParallelGammaBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01SemiParallelGammaBucketed(ResolvedFraTrade, RatesScenarioMarketData) with 'ResolvedFraTrade', 'RatesScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.pv01SemiParallelGammaBucketed(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01SemiParallelGammaBucketedWithResolvedFraTradeRatesScenarioMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01SemiParallelGammaBucketed(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#pv01SingleNodeGammaBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * FraMeasureCalculations#pv01SingleNodeGammaBucketed(ResolvedFraTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01SingleNodeGammaBucketed(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.pv01SingleNodeGammaBucketed(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01SingleNodeGammaBucketedWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01SingleNodeGammaBucketed(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#pv01SingleNodeGammaBucketed(ResolvedFraTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesScenarioMarketData#scenario(int)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * FraMeasureCalculations#pv01SingleNodeGammaBucketed(ResolvedFraTrade, RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01SingleNodeGammaBucketed(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls scenario(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.pv01SingleNodeGammaBucketed(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testPv01SingleNodeGammaBucketedWithTradeMarketData_thenCallsScenario() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.pv01SingleNodeGammaBucketed(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#parRate(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#parRate(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName("Test parRate(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray FraMeasureCalculations.parRate(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testParRateWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.parRate(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#parRate(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#parRate(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName("Test parRate(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray FraMeasureCalculations.parRate(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testParRateWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.parRate(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#parRate(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#parRate(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parRate(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray FraMeasureCalculations.parRate(ResolvedFraTrade, RatesScenarioMarketData)"
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
        () -> FraMeasureCalculations.DEFAULT.parRate(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#parRate(ResolvedFraTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#parRate(ResolvedFraTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parRate(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FraMeasureCalculations.parRate(ResolvedFraTrade, RatesProvider)"})
  void testParRateWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.parRate(Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    // Act
    double actualParRateResult = fraMeasureCalculations.parRate(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parRate(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParRateResult);
  }

  /**
   * Test {@link FraMeasureCalculations#parSpread(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#parSpread(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray FraMeasureCalculations.parSpread(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testParSpreadWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.parSpread(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#parSpread(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#parSpread(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray FraMeasureCalculations.parSpread(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testParSpreadWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.parSpread(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#parSpread(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#parSpread(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.DoubleScenarioArray FraMeasureCalculations.parSpread(ResolvedFraTrade, RatesScenarioMarketData)"
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
        () -> FraMeasureCalculations.DEFAULT.parSpread(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#parSpread(ResolvedFraTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#parSpread(ResolvedFraTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test parSpread(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FraMeasureCalculations.parSpread(ResolvedFraTrade, RatesProvider)"})
  void testParSpreadWithTradeRatesProvider_thenReturnTen() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.parSpread(Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    // Act
    double actualParSpreadResult = fraMeasureCalculations.parSpread(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).parSpread(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualParSpreadResult);
  }

  /**
   * Test {@link FraMeasureCalculations#cashFlows(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#cashFlows(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.cashFlows(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testCashFlowsWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.cashFlows(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#cashFlows(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#cashFlows(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.cashFlows(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testCashFlowsWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.cashFlows(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#cashFlows(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#cashFlows(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.ScenarioArray FraMeasureCalculations.cashFlows(ResolvedFraTrade, RatesScenarioMarketData)"
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
        () -> FraMeasureCalculations.DEFAULT.cashFlows(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#cashFlows(ResolvedFraTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#cashFlows(ResolvedFraTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CashFlows FraMeasureCalculations.cashFlows(ResolvedFraTrade, RatesProvider)"})
  void testCashFlowsWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.cashFlows(Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    // Act
    CashFlows actualCashFlowsResult =
        fraMeasureCalculations.cashFlows(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).cashFlows(isNull(), isA(RatesProvider.class));
    assertNull(actualCashFlowsResult);
  }

  /**
   * Test {@link FraMeasureCalculations#currencyExposure(ResolvedFraTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#currencyExposure(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.currencyExposure(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.currencyExposure(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#currencyExposure(ResolvedFraTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#currencyExposure(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.currencyExposure(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.currencyExposure(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#currencyExposure(ResolvedFraTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#currencyExposure(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.currencyExposure(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualCurrencyExposureResult =
        FraMeasureCalculations.DEFAULT.currencyExposure(null, marketData);

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
   * Test {@link FraMeasureCalculations#currencyExposure(ResolvedFraTrade, RatesScenarioMarketData)}
   * with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#currencyExposure(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FraMeasureCalculations.currencyExposure(ResolvedFraTrade, RatesScenarioMarketData)"
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
        () -> FraMeasureCalculations.DEFAULT.currencyExposure(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#currencyExposure(ResolvedFraTrade, RatesProvider)} with
   * {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#currencyExposure(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount FraMeasureCalculations.currencyExposure(ResolvedFraTrade, RatesProvider)"
  })
  void testCurrencyExposureWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currencyExposure(
            Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(emptyResult);
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrencyExposureResult =
        fraMeasureCalculations.currencyExposure(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currencyExposure(isNull(), isA(RatesProvider.class));
    assertSame(emptyResult, actualCurrencyExposureResult);
  }

  /**
   * Test {@link FraMeasureCalculations#currentCash(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#currentCash(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FraMeasureCalculations.currentCash(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testCurrentCashWithTradeMarketData() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.currentCash(null, marketData));
    verify(marketData).getScenarioCount();
  }

  /**
   * Test {@link FraMeasureCalculations#currentCash(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link FraMeasureCalculations#currentCash(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FraMeasureCalculations.currentCash(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testCurrentCashWithTradeMarketData2() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.currentCash(null, marketData));
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#currentCash(ResolvedFraTrade, RatesScenarioMarketData)} with
   * {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then calls {@link RatesMarketData#ratesProvider()}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#currentCash(ResolvedFraTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFraTrade, RatesScenarioMarketData) with 'trade', 'marketData'; then calls ratesProvider()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FraMeasureCalculations.currentCash(ResolvedFraTrade, RatesScenarioMarketData)"
  })
  void testCurrentCashWithTradeMarketData_thenCallsRatesProvider() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FraMeasureCalculations.DEFAULT.currentCash(null, marketData));
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
  }

  /**
   * Test {@link FraMeasureCalculations#currentCash(ResolvedFraTrade, RatesProvider)} with {@code
   * trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FraMeasureCalculations#currentCash(ResolvedFraTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFraTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount FraMeasureCalculations.currentCash(ResolvedFraTrade, RatesProvider)"
  })
  void testCurrentCashWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingFraTradePricer tradePricer = mock(DiscountingFraTradePricer.class);
    when(tradePricer.currentCash(Mockito.<ResolvedFraTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    FraMeasureCalculations fraMeasureCalculations = new FraMeasureCalculations(tradePricer);

    // Act
    CurrencyAmount actualCurrentCashResult =
        fraMeasureCalculations.currentCash(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(RatesProvider.class));
    assertNull(actualCurrentCashResult);
  }
}
