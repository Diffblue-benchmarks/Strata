package com.opengamma.strata.measure.payment;

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
import com.opengamma.strata.data.scenario.MultiCurrencyScenarioArray;
import com.opengamma.strata.data.scenario.ScenarioArray;
import com.opengamma.strata.market.amount.CashFlows;
import com.opengamma.strata.market.explain.ExplainMap;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.measure.rate.RatesMarketData;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.pricer.BaseProvider;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.payment.DiscountingBulletPaymentTradePricer;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.payment.ResolvedBulletPaymentTrade;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BulletPaymentMeasureCalculationsDiffblueTest {
  /**
   * Test {@link BulletPaymentMeasureCalculations#presentValue(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#presentValue(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount BulletPaymentMeasureCalculations.presentValue(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPresentValueWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValue(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(null);
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    // Act
    CurrencyAmount actualPresentValueResult =
        bulletPaymentMeasureCalculations.presentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValue(isNull(), isA(BaseProvider.class));
    assertNull(actualPresentValueResult);
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#explainPresentValue(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#explainPresentValue(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray BulletPaymentMeasureCalculations.explainPresentValue(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testExplainPresentValueWithTradeMarketData() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    ExplainMap emptyResult = ExplainMap.empty();
    when(tradePricer.explainPresentValue(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(emptyResult);
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    ScenarioArray<ExplainMap> actualExplainPresentValueResult =
        bulletPaymentMeasureCalculations.explainPresentValue(null, marketData);

    // Assert
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
    verify(tradePricer).explainPresentValue(isNull(), isA(BaseProvider.class));
    Stream<ExplainMap> streamResult = actualExplainPresentValueResult.stream();
    List<ExplainMap> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertSame(emptyResult, collectResult.get(0));
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#explainPresentValue(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#explainPresentValue(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray BulletPaymentMeasureCalculations.explainPresentValue(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testExplainPresentValueWithTradeMarketData2() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    ExplainMap emptyResult = ExplainMap.empty();
    when(tradePricer.explainPresentValue(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(emptyResult);
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(3);

    // Act
    ScenarioArray<ExplainMap> actualExplainPresentValueResult =
        bulletPaymentMeasureCalculations.explainPresentValue(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).explainPresentValue(isNull(), isA(BaseProvider.class));
    Stream<ExplainMap> streamResult = actualExplainPresentValueResult.stream();
    List<ExplainMap> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertSame(emptyResult, collectResult.get(1));
    assertSame(emptyResult, collectResult.get(2));
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#explainPresentValue(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#explainPresentValue(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray BulletPaymentMeasureCalculations.explainPresentValue(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testExplainPresentValueWithTradeMarketData3() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    ExplainMap emptyResult = ExplainMap.empty();
    when(tradePricer.explainPresentValue(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(emptyResult);
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(4);

    // Act
    ScenarioArray<ExplainMap> actualExplainPresentValueResult =
        bulletPaymentMeasureCalculations.explainPresentValue(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).explainPresentValue(isNull(), isA(BaseProvider.class));
    Stream<ExplainMap> streamResult = actualExplainPresentValueResult.stream();
    List<ExplainMap> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(4, collectResult.size());
    assertSame(emptyResult, collectResult.get(1));
    assertSame(emptyResult, collectResult.get(2));
    assertSame(emptyResult, collectResult.get(3));
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#explainPresentValue(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#explainPresentValue(ResolvedBulletPaymentTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ExplainMap BulletPaymentMeasureCalculations.explainPresentValue(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testExplainPresentValueWithTradeRatesProvider_thenReturnEmpty() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    ExplainMap emptyResult = ExplainMap.empty();
    when(tradePricer.explainPresentValue(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(emptyResult);
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    // Act
    ExplainMap actualExplainPresentValueResult =
        bulletPaymentMeasureCalculations.explainPresentValue(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).explainPresentValue(isNull(), isA(BaseProvider.class));
    assertSame(emptyResult, actualExplainPresentValueResult);
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray BulletPaymentMeasureCalculations.pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        BulletPaymentMeasureCalculations.DEFAULT.pv01CalibratedSum(null, marketData);

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
   * Test {@link BulletPaymentMeasureCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount BulletPaymentMeasureCalculations.pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        bulletPaymentMeasureCalculations.pv01CalibratedSum(null, ratesProvider);

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
   * Test {@link BulletPaymentMeasureCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount BulletPaymentMeasureCalculations.pv01CalibratedSum(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01CalibratedSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01CalibratedSumResult =
        bulletPaymentMeasureCalculations.pv01CalibratedSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    assertEquals(0, actualPv01CalibratedSumResult.size());
    assertTrue(actualPv01CalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01CalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray BulletPaymentMeasureCalculations.pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01CalibratedBucketedResult =
        bulletPaymentMeasureCalculations.pv01CalibratedBucketed(null, marketData);

    // Assert
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
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
   * Test {@link BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray BulletPaymentMeasureCalculations.pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData2() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

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
        bulletPaymentMeasureCalculations.pv01CalibratedBucketed(null, marketData);

    // Assert
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    verify(mockRatesProvider).parameterSensitivity(isA(PointSensitivities.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01CalibratedBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals(emptyResult, collectResult.get(0));
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray BulletPaymentMeasureCalculations.pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData3() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

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
        bulletPaymentMeasureCalculations.pv01CalibratedBucketed(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).presentValueSensitivity(isNull(), isA(BaseProvider.class));
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
   * Test {@link BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray BulletPaymentMeasureCalculations.pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testPv01CalibratedBucketedWithTradeMarketData4() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

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
        bulletPaymentMeasureCalculations.pv01CalibratedBucketed(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    verify(mockRatesProvider, atLeast(1)).parameterSensitivity(isA(PointSensitivities.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01CalibratedBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(4, collectResult.size());
    assertEquals(emptyResult, collectResult.get(3));
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities BulletPaymentMeasureCalculations.pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        bulletPaymentMeasureCalculations.pv01CalibratedBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01CalibratedBucketedResult);
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01CalibratedBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities BulletPaymentMeasureCalculations.pv01CalibratedBucketed(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01CalibratedBucketedResult =
        bulletPaymentMeasureCalculations.pv01CalibratedBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    assertEquals(0, actualPv01CalibratedBucketedResult.size());
    assertTrue(actualPv01CalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray BulletPaymentMeasureCalculations.pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualPv01MarketQuoteSumResult =
        BulletPaymentMeasureCalculations.DEFAULT.pv01MarketQuoteSum(null, marketData);

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
   * Test {@link BulletPaymentMeasureCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then calls {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then calls parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount BulletPaymentMeasureCalculations.pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenCallsParameterSensitivity() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        bulletPaymentMeasureCalculations.pv01MarketQuoteSum(null, ratesProvider);

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
   * Test {@link BulletPaymentMeasureCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount BulletPaymentMeasureCalculations.pv01MarketQuoteSum(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01MarketQuoteSumResult =
        bulletPaymentMeasureCalculations.pv01MarketQuoteSum(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    assertEquals(0, actualPv01MarketQuoteSumResult.size());
    assertTrue(actualPv01MarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01MarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray BulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.ratesProvider()).thenReturn(new MockRatesProvider());

    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.scenario(anyInt())).thenReturn(ratesMarketData);
    when(marketData.getScenarioCount()).thenReturn(1);

    // Act
    ScenarioArray<CurrencyParameterSensitivities> actualPv01MarketQuoteBucketedResult =
        bulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

    // Assert
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
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
   * Test {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray BulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData2() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

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
        bulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

    // Assert
    verify(ratesMarketData).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData).scenario(0);
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    verify(mockRatesProvider).parameterSensitivity(isA(PointSensitivities.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01MarketQuoteBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals(emptyResult, collectResult.get(0));
  }

  /**
   * Test {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray BulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData3() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

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
        bulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).presentValueSensitivity(isNull(), isA(BaseProvider.class));
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
   * Test {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray BulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testPv01MarketQuoteBucketedWithTradeMarketData4() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

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
        bulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(null, marketData);

    // Assert
    verify(ratesMarketData, atLeast(1)).ratesProvider();
    verify(marketData).getScenarioCount();
    verify(marketData, atLeast(1)).scenario(anyInt());
    verify(tradePricer, atLeast(1)).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    verify(mockRatesProvider, atLeast(1)).parameterSensitivity(isA(PointSensitivities.class));
    Stream<CurrencyParameterSensitivities> streamResult =
        actualPv01MarketQuoteBucketedResult.stream();
    List<CurrencyParameterSensitivities> collectResult =
        streamResult.limit(5).collect(Collectors.toList());
    assertEquals(4, collectResult.size());
    assertEquals(emptyResult, collectResult.get(3));
  }

  /**
   * Test {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities BulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_givenEmpty_thenReturnEmpty() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        bulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(null, ratesProvider);

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01MarketQuoteBucketedResult);
  }

  /**
   * Test {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities BulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProvider_thenReturnSizeIsZero() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.presentValueSensitivity(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(PointSensitivities.empty());
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01MarketQuoteBucketedResult =
        bulletPaymentMeasureCalculations.pv01MarketQuoteBucketed(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).presentValueSensitivity(isNull(), isA(BaseProvider.class));
    assertEquals(0, actualPv01MarketQuoteBucketedResult.size());
    assertTrue(actualPv01MarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#cashFlows(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#cashFlows(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test cashFlows(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CashFlows BulletPaymentMeasureCalculations.cashFlows(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testCashFlowsWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.cashFlows(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(null);
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    // Act
    CashFlows actualCashFlowsResult =
        bulletPaymentMeasureCalculations.cashFlows(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).cashFlows(isNull(), isA(BaseProvider.class));
    assertNull(actualCashFlowsResult);
  }

  /**
   * Test {@link BulletPaymentMeasureCalculations#currencyExposure(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#currencyExposure(ResolvedBulletPaymentTrade,
   * RatesScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedBulletPaymentTrade, RatesScenarioMarketData) with 'trade', 'marketData'; given zero; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray BulletPaymentMeasureCalculations.currencyExposure(ResolvedBulletPaymentTrade, RatesScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData_givenZero_thenReturnAmountsSizeIsZero() {
    // Arrange
    RatesScenarioMarketData marketData = mock(RatesScenarioMarketData.class);
    when(marketData.getScenarioCount()).thenReturn(0);

    // Act
    MultiCurrencyScenarioArray actualCurrencyExposureResult =
        BulletPaymentMeasureCalculations.DEFAULT.currencyExposure(null, marketData);

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
   * Test {@link BulletPaymentMeasureCalculations#currentCash(ResolvedBulletPaymentTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BulletPaymentMeasureCalculations#currentCash(ResolvedBulletPaymentTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedBulletPaymentTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount BulletPaymentMeasureCalculations.currentCash(ResolvedBulletPaymentTrade, RatesProvider)"
  })
  void testCurrentCashWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingBulletPaymentTradePricer tradePricer =
        mock(DiscountingBulletPaymentTradePricer.class);
    when(tradePricer.currentCash(
            Mockito.<ResolvedBulletPaymentTrade>any(), Mockito.<BaseProvider>any()))
        .thenReturn(null);
    BulletPaymentMeasureCalculations bulletPaymentMeasureCalculations =
        new BulletPaymentMeasureCalculations(tradePricer);

    // Act
    CurrencyAmount actualCurrentCashResult =
        bulletPaymentMeasureCalculations.currentCash(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(BaseProvider.class));
    assertNull(actualCurrentCashResult);
  }
}
