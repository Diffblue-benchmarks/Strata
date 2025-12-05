package com.opengamma.strata.measure.capfloor;

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
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.pricer.capfloor.BlackIborCapFloorTradePricer;
import com.opengamma.strata.pricer.capfloor.IborCapletFloorletVolatilities;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.capfloor.ResolvedIborCapFloorTrade;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class IborCapFloorTradeCalculationsDiffblueTest {
  /**
   * Test {@link IborCapFloorTradeCalculations#presentValue(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)} with {@code trade}, {@code ratesProvider},
   * {@code volatilities}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * IborCapFloorTradeCalculations#presentValue(ResolvedIborCapFloorTrade, RatesProvider,
   * IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test presentValue(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities) with 'trade', 'ratesProvider', 'volatilities'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount IborCapFloorTradeCalculations.presentValue(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testPresentValueWithTradeRatesProviderVolatilities_thenReturnEmpty() {
    // Arrange
    BlackIborCapFloorTradePricer tradePricer = mock(BlackIborCapFloorTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.presentValue(
            Mockito.<ResolvedIborCapFloorTrade>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<IborCapletFloorletVolatilities>any()))
        .thenReturn(emptyResult);
    IborCapFloorTradeCalculations iborCapFloorTradeCalculations =
        new IborCapFloorTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPresentValueResult =
        iborCapFloorTradeCalculations.presentValue(null, new MockRatesProvider(), null);

    // Assert
    verify(tradePricer).presentValue(isNull(), isA(RatesProvider.class), isNull());
    assertSame(emptyResult, actualPresentValueResult);
  }

  /**
   * Test {@link IborCapFloorTradeCalculations#pv01RatesCalibratedSum(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)} with {@code trade}, {@code ratesProvider},
   * {@code volatilities}.
   *
   * <p>Method under test: {@link
   * IborCapFloorTradeCalculations#pv01RatesCalibratedSum(ResolvedIborCapFloorTrade, RatesProvider,
   * IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01RatesCalibratedSum(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount IborCapFloorTradeCalculations.pv01RatesCalibratedSum(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testPv01RatesCalibratedSumWithTradeRatesProviderVolatilities() {
    // Arrange
    BlackIborCapFloorTradePricer tradePricer = mock(BlackIborCapFloorTradePricer.class);
    when(tradePricer.presentValueSensitivityRates(
            Mockito.<ResolvedIborCapFloorTrade>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<IborCapletFloorletVolatilities>any()))
        .thenReturn(PointSensitivities.empty());
    IborCapFloorTradeCalculations iborCapFloorTradeCalculations =
        new IborCapFloorTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01RatesCalibratedSumResult =
        iborCapFloorTradeCalculations.pv01RatesCalibratedSum(null, new MockRatesProvider(), null);

    // Assert
    verify(tradePricer).presentValueSensitivityRates(isNull(), isA(RatesProvider.class), isNull());
    assertEquals(0, actualPv01RatesCalibratedSumResult.size());
    assertTrue(actualPv01RatesCalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01RatesCalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01RatesCalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IborCapFloorTradeCalculations#pv01RatesCalibratedSum(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)} with {@code trade}, {@code ratesProvider},
   * {@code volatilities}.
   *
   * <p>Method under test: {@link
   * IborCapFloorTradeCalculations#pv01RatesCalibratedSum(ResolvedIborCapFloorTrade, RatesProvider,
   * IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01RatesCalibratedSum(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount IborCapFloorTradeCalculations.pv01RatesCalibratedSum(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testPv01RatesCalibratedSumWithTradeRatesProviderVolatilities2() {
    // Arrange
    BlackIborCapFloorTradePricer tradePricer = mock(BlackIborCapFloorTradePricer.class);
    when(tradePricer.presentValueSensitivityRates(
            Mockito.<ResolvedIborCapFloorTrade>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<IborCapletFloorletVolatilities>any()))
        .thenReturn(PointSensitivities.empty());
    IborCapFloorTradeCalculations iborCapFloorTradeCalculations =
        new IborCapFloorTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01RatesCalibratedSumResult =
        iborCapFloorTradeCalculations.pv01RatesCalibratedSum(null, ratesProvider, null);

    // Assert
    verify(tradePricer).presentValueSensitivityRates(isNull(), isA(RatesProvider.class), isNull());
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(0, actualPv01RatesCalibratedSumResult.size());
    assertTrue(actualPv01RatesCalibratedSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01RatesCalibratedSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01RatesCalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link
   * IborCapFloorTradeCalculations#pv01RatesCalibratedBucketed(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)} with {@code trade}, {@code ratesProvider},
   * {@code volatilities}.
   *
   * <p>Method under test: {@link
   * IborCapFloorTradeCalculations#pv01RatesCalibratedBucketed(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01RatesCalibratedBucketed(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities IborCapFloorTradeCalculations.pv01RatesCalibratedBucketed(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testPv01RatesCalibratedBucketedWithTradeRatesProviderVolatilities() {
    // Arrange
    BlackIborCapFloorTradePricer tradePricer = mock(BlackIborCapFloorTradePricer.class);
    when(tradePricer.presentValueSensitivityRates(
            Mockito.<ResolvedIborCapFloorTrade>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<IborCapletFloorletVolatilities>any()))
        .thenReturn(PointSensitivities.empty());
    IborCapFloorTradeCalculations iborCapFloorTradeCalculations =
        new IborCapFloorTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01RatesCalibratedBucketedResult =
        iborCapFloorTradeCalculations.pv01RatesCalibratedBucketed(
            null, new MockRatesProvider(), null);

    // Assert
    verify(tradePricer).presentValueSensitivityRates(isNull(), isA(RatesProvider.class), isNull());
    assertEquals(0, actualPv01RatesCalibratedBucketedResult.size());
    assertTrue(actualPv01RatesCalibratedBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link
   * IborCapFloorTradeCalculations#pv01RatesCalibratedBucketed(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)} with {@code trade}, {@code ratesProvider},
   * {@code volatilities}.
   *
   * <p>Method under test: {@link
   * IborCapFloorTradeCalculations#pv01RatesCalibratedBucketed(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01RatesCalibratedBucketed(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities IborCapFloorTradeCalculations.pv01RatesCalibratedBucketed(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testPv01RatesCalibratedBucketedWithTradeRatesProviderVolatilities2() {
    // Arrange
    BlackIborCapFloorTradePricer tradePricer = mock(BlackIborCapFloorTradePricer.class);
    when(tradePricer.presentValueSensitivityRates(
            Mockito.<ResolvedIborCapFloorTrade>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<IborCapletFloorletVolatilities>any()))
        .thenReturn(PointSensitivities.empty());
    IborCapFloorTradeCalculations iborCapFloorTradeCalculations =
        new IborCapFloorTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01RatesCalibratedBucketedResult =
        iborCapFloorTradeCalculations.pv01RatesCalibratedBucketed(null, ratesProvider, null);

    // Assert
    verify(tradePricer).presentValueSensitivityRates(isNull(), isA(RatesProvider.class), isNull());
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01RatesCalibratedBucketedResult);
  }

  /**
   * Test {@link IborCapFloorTradeCalculations#pv01RatesMarketQuoteSum(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)} with {@code trade}, {@code ratesProvider},
   * {@code volatilities}.
   *
   * <p>Method under test: {@link
   * IborCapFloorTradeCalculations#pv01RatesMarketQuoteSum(ResolvedIborCapFloorTrade, RatesProvider,
   * IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01RatesMarketQuoteSum(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount IborCapFloorTradeCalculations.pv01RatesMarketQuoteSum(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testPv01RatesMarketQuoteSumWithTradeRatesProviderVolatilities() {
    // Arrange
    BlackIborCapFloorTradePricer tradePricer = mock(BlackIborCapFloorTradePricer.class);
    when(tradePricer.presentValueSensitivityRates(
            Mockito.<ResolvedIborCapFloorTrade>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<IborCapletFloorletVolatilities>any()))
        .thenReturn(PointSensitivities.empty());
    IborCapFloorTradeCalculations iborCapFloorTradeCalculations =
        new IborCapFloorTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualPv01RatesMarketQuoteSumResult =
        iborCapFloorTradeCalculations.pv01RatesMarketQuoteSum(null, new MockRatesProvider(), null);

    // Assert
    verify(tradePricer).presentValueSensitivityRates(isNull(), isA(RatesProvider.class), isNull());
    assertEquals(0, actualPv01RatesMarketQuoteSumResult.size());
    assertTrue(actualPv01RatesMarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01RatesMarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01RatesMarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link IborCapFloorTradeCalculations#pv01RatesMarketQuoteSum(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)} with {@code trade}, {@code ratesProvider},
   * {@code volatilities}.
   *
   * <p>Method under test: {@link
   * IborCapFloorTradeCalculations#pv01RatesMarketQuoteSum(ResolvedIborCapFloorTrade, RatesProvider,
   * IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01RatesMarketQuoteSum(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount IborCapFloorTradeCalculations.pv01RatesMarketQuoteSum(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testPv01RatesMarketQuoteSumWithTradeRatesProviderVolatilities2() {
    // Arrange
    BlackIborCapFloorTradePricer tradePricer = mock(BlackIborCapFloorTradePricer.class);
    when(tradePricer.presentValueSensitivityRates(
            Mockito.<ResolvedIborCapFloorTrade>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<IborCapletFloorletVolatilities>any()))
        .thenReturn(PointSensitivities.empty());
    IborCapFloorTradeCalculations iborCapFloorTradeCalculations =
        new IborCapFloorTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    MultiCurrencyAmount actualPv01RatesMarketQuoteSumResult =
        iborCapFloorTradeCalculations.pv01RatesMarketQuoteSum(null, ratesProvider, null);

    // Assert
    verify(tradePricer).presentValueSensitivityRates(isNull(), isA(RatesProvider.class), isNull());
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(0, actualPv01RatesMarketQuoteSumResult.size());
    assertTrue(actualPv01RatesMarketQuoteSumResult.getAmounts().isEmpty());
    assertTrue(actualPv01RatesMarketQuoteSumResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualPv01RatesMarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link
   * IborCapFloorTradeCalculations#pv01RatesMarketQuoteBucketed(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)} with {@code trade}, {@code ratesProvider},
   * {@code volatilities}.
   *
   * <p>Method under test: {@link
   * IborCapFloorTradeCalculations#pv01RatesMarketQuoteBucketed(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01RatesMarketQuoteBucketed(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities IborCapFloorTradeCalculations.pv01RatesMarketQuoteBucketed(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testPv01RatesMarketQuoteBucketedWithTradeRatesProviderVolatilities() {
    // Arrange
    BlackIborCapFloorTradePricer tradePricer = mock(BlackIborCapFloorTradePricer.class);
    when(tradePricer.presentValueSensitivityRates(
            Mockito.<ResolvedIborCapFloorTrade>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<IborCapletFloorletVolatilities>any()))
        .thenReturn(PointSensitivities.empty());
    IborCapFloorTradeCalculations iborCapFloorTradeCalculations =
        new IborCapFloorTradeCalculations(tradePricer);

    // Act
    CurrencyParameterSensitivities actualPv01RatesMarketQuoteBucketedResult =
        iborCapFloorTradeCalculations.pv01RatesMarketQuoteBucketed(
            null, new MockRatesProvider(), null);

    // Assert
    verify(tradePricer).presentValueSensitivityRates(isNull(), isA(RatesProvider.class), isNull());
    assertEquals(0, actualPv01RatesMarketQuoteBucketedResult.size());
    assertTrue(actualPv01RatesMarketQuoteBucketedResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link
   * IborCapFloorTradeCalculations#pv01RatesMarketQuoteBucketed(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)} with {@code trade}, {@code ratesProvider},
   * {@code volatilities}.
   *
   * <p>Method under test: {@link
   * IborCapFloorTradeCalculations#pv01RatesMarketQuoteBucketed(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01RatesMarketQuoteBucketed(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities IborCapFloorTradeCalculations.pv01RatesMarketQuoteBucketed(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testPv01RatesMarketQuoteBucketedWithTradeRatesProviderVolatilities2() {
    // Arrange
    BlackIborCapFloorTradePricer tradePricer = mock(BlackIborCapFloorTradePricer.class);
    when(tradePricer.presentValueSensitivityRates(
            Mockito.<ResolvedIborCapFloorTrade>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<IborCapletFloorletVolatilities>any()))
        .thenReturn(PointSensitivities.empty());
    IborCapFloorTradeCalculations iborCapFloorTradeCalculations =
        new IborCapFloorTradeCalculations(tradePricer);

    RatesProvider ratesProvider = mock(RatesProvider.class);
    CurrencyParameterSensitivities emptyResult = CurrencyParameterSensitivities.empty();
    when(ratesProvider.parameterSensitivity(Mockito.<PointSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    CurrencyParameterSensitivities actualPv01RatesMarketQuoteBucketedResult =
        iborCapFloorTradeCalculations.pv01RatesMarketQuoteBucketed(null, ratesProvider, null);

    // Assert
    verify(tradePricer).presentValueSensitivityRates(isNull(), isA(RatesProvider.class), isNull());
    verify(ratesProvider).parameterSensitivity(isA(PointSensitivities.class));
    assertEquals(emptyResult, actualPv01RatesMarketQuoteBucketedResult);
  }

  /**
   * Test {@link IborCapFloorTradeCalculations#currencyExposure(ResolvedIborCapFloorTrade,
   * RatesProvider, IborCapletFloorletVolatilities)} with {@code trade}, {@code ratesProvider},
   * {@code volatilities}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * IborCapFloorTradeCalculations#currencyExposure(ResolvedIborCapFloorTrade, RatesProvider,
   * IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities) with 'trade', 'ratesProvider', 'volatilities'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount IborCapFloorTradeCalculations.currencyExposure(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testCurrencyExposureWithTradeRatesProviderVolatilities_thenReturnEmpty() {
    // Arrange
    BlackIborCapFloorTradePricer tradePricer = mock(BlackIborCapFloorTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currencyExposure(
            Mockito.<ResolvedIborCapFloorTrade>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<IborCapletFloorletVolatilities>any()))
        .thenReturn(emptyResult);
    IborCapFloorTradeCalculations iborCapFloorTradeCalculations =
        new IborCapFloorTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrencyExposureResult =
        iborCapFloorTradeCalculations.currencyExposure(null, new MockRatesProvider(), null);

    // Assert
    verify(tradePricer).currencyExposure(isNull(), isA(RatesProvider.class), isNull());
    assertSame(emptyResult, actualCurrencyExposureResult);
  }

  /**
   * Test {@link IborCapFloorTradeCalculations#currentCash(ResolvedIborCapFloorTrade, RatesProvider,
   * IborCapletFloorletVolatilities)} with {@code trade}, {@code ratesProvider}, {@code
   * volatilities}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * IborCapFloorTradeCalculations#currentCash(ResolvedIborCapFloorTrade, RatesProvider,
   * IborCapletFloorletVolatilities)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities) with 'trade', 'ratesProvider', 'volatilities'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyAmount IborCapFloorTradeCalculations.currentCash(ResolvedIborCapFloorTrade, RatesProvider, IborCapletFloorletVolatilities)"
  })
  void testCurrentCashWithTradeRatesProviderVolatilities_thenReturnEmpty() {
    // Arrange
    BlackIborCapFloorTradePricer tradePricer = mock(BlackIborCapFloorTradePricer.class);
    MultiCurrencyAmount emptyResult = MultiCurrencyAmount.empty();
    when(tradePricer.currentCash(
            Mockito.<ResolvedIborCapFloorTrade>any(),
            Mockito.<RatesProvider>any(),
            Mockito.<IborCapletFloorletVolatilities>any()))
        .thenReturn(emptyResult);
    IborCapFloorTradeCalculations iborCapFloorTradeCalculations =
        new IborCapFloorTradeCalculations(tradePricer);

    // Act
    MultiCurrencyAmount actualCurrentCashResult =
        iborCapFloorTradeCalculations.currentCash(null, new MockRatesProvider(), null);

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(RatesProvider.class), isNull());
    assertSame(emptyResult, actualCurrentCashResult);
  }
}
