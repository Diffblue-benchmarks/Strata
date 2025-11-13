package com.opengamma.strata.measure.index;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.index.IborFutureOptionVolatilities;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.index.ResolvedIborFutureOptionTrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborFutureOptionMeasureCalculationsDiffblueTest {
  /**
   * Test {@link
   * IborFutureOptionMeasureCalculations#pv01CalibratedSum(ResolvedIborFutureOptionTrade,
   * RatesProvider, IborFutureOptionVolatilities)} with {@code trade}, {@code ratesProvider}, {@code
   * volatilities}.
   *
   * <p>Method under test: {@link
   * IborFutureOptionMeasureCalculations#pv01CalibratedSum(ResolvedIborFutureOptionTrade,
   * RatesProvider, IborFutureOptionVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedIborFutureOptionTrade, RatesProvider, IborFutureOptionVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.currency.MultiCurrencyAmount IborFutureOptionMeasureCalculations.pv01CalibratedSum(ResolvedIborFutureOptionTrade, RatesProvider, IborFutureOptionVolatilities)"
  })
  void testPv01CalibratedSumWithTradeRatesProviderVolatilities() {
    // Arrange
    MockRatesProvider ratesProvider = new MockRatesProvider();

    IborFutureOptionVolatilities volatilities = mock(IborFutureOptionVolatilities.class);
    when(volatilities.getVolatilityType()).thenReturn(ValueType.of("Name"));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            IborFutureOptionMeasureCalculations.DEFAULT.pv01CalibratedSum(
                null, ratesProvider, volatilities));
    verify(volatilities).getVolatilityType();
  }

  /**
   * Test {@link
   * IborFutureOptionMeasureCalculations#pv01CalibratedBucketed(ResolvedIborFutureOptionTrade,
   * RatesProvider, IborFutureOptionVolatilities)} with {@code trade}, {@code ratesProvider}, {@code
   * volatilities}.
   *
   * <p>Method under test: {@link
   * IborFutureOptionMeasureCalculations#pv01CalibratedBucketed(ResolvedIborFutureOptionTrade,
   * RatesProvider, IborFutureOptionVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedBucketed(ResolvedIborFutureOptionTrade, RatesProvider, IborFutureOptionVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.param.CurrencyParameterSensitivities IborFutureOptionMeasureCalculations.pv01CalibratedBucketed(ResolvedIborFutureOptionTrade, RatesProvider, IborFutureOptionVolatilities)"
  })
  void testPv01CalibratedBucketedWithTradeRatesProviderVolatilities() {
    // Arrange
    MockRatesProvider ratesProvider = new MockRatesProvider();

    IborFutureOptionVolatilities volatilities = mock(IborFutureOptionVolatilities.class);
    when(volatilities.getVolatilityType()).thenReturn(ValueType.of("Name"));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            IborFutureOptionMeasureCalculations.DEFAULT.pv01CalibratedBucketed(
                null, ratesProvider, volatilities));
    verify(volatilities).getVolatilityType();
  }

  /**
   * Test {@link
   * IborFutureOptionMeasureCalculations#pv01MarketQuoteSum(ResolvedIborFutureOptionTrade,
   * RatesProvider, IborFutureOptionVolatilities)} with {@code trade}, {@code ratesProvider}, {@code
   * volatilities}.
   *
   * <p>Method under test: {@link
   * IborFutureOptionMeasureCalculations#pv01MarketQuoteSum(ResolvedIborFutureOptionTrade,
   * RatesProvider, IborFutureOptionVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedIborFutureOptionTrade, RatesProvider, IborFutureOptionVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.currency.MultiCurrencyAmount IborFutureOptionMeasureCalculations.pv01MarketQuoteSum(ResolvedIborFutureOptionTrade, RatesProvider, IborFutureOptionVolatilities)"
  })
  void testPv01MarketQuoteSumWithTradeRatesProviderVolatilities() {
    // Arrange
    MockRatesProvider ratesProvider = new MockRatesProvider();

    IborFutureOptionVolatilities volatilities = mock(IborFutureOptionVolatilities.class);
    when(volatilities.getVolatilityType()).thenReturn(ValueType.of("Name"));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            IborFutureOptionMeasureCalculations.DEFAULT.pv01MarketQuoteSum(
                null, ratesProvider, volatilities));
    verify(volatilities).getVolatilityType();
  }

  /**
   * Test {@link
   * IborFutureOptionMeasureCalculations#pv01MarketQuoteBucketed(ResolvedIborFutureOptionTrade,
   * RatesProvider, IborFutureOptionVolatilities)} with {@code trade}, {@code ratesProvider}, {@code
   * volatilities}.
   *
   * <p>Method under test: {@link
   * IborFutureOptionMeasureCalculations#pv01MarketQuoteBucketed(ResolvedIborFutureOptionTrade,
   * RatesProvider, IborFutureOptionVolatilities)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteBucketed(ResolvedIborFutureOptionTrade, RatesProvider, IborFutureOptionVolatilities) with 'trade', 'ratesProvider', 'volatilities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.param.CurrencyParameterSensitivities IborFutureOptionMeasureCalculations.pv01MarketQuoteBucketed(ResolvedIborFutureOptionTrade, RatesProvider, IborFutureOptionVolatilities)"
  })
  void testPv01MarketQuoteBucketedWithTradeRatesProviderVolatilities() {
    // Arrange
    MockRatesProvider ratesProvider = new MockRatesProvider();

    IborFutureOptionVolatilities volatilities = mock(IborFutureOptionVolatilities.class);
    when(volatilities.getVolatilityType()).thenReturn(ValueType.of("Name"));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            IborFutureOptionMeasureCalculations.DEFAULT.pv01MarketQuoteBucketed(
                null, ratesProvider, volatilities));
    verify(volatilities).getVolatilityType();
  }
}
