package com.opengamma.strata.pricer.impl.swap;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.explain.ExplainMap;
import com.opengamma.strata.market.explain.ExplainMapBuilder;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.swap.SwapPaymentPeriod;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DispatchingSwapPaymentPeriodPricerDiffblueTest {
  /**
   * Test {@link DispatchingSwapPaymentPeriodPricer#presentValue(SwapPaymentPeriod, RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentPeriod}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingSwapPaymentPeriodPricer#presentValue(SwapPaymentPeriod,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(SwapPaymentPeriod, RatesProvider); when SwapPaymentPeriod; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingSwapPaymentPeriodPricer.presentValue(SwapPaymentPeriod, RatesProvider)"
  })
  void testPresentValue_whenSwapPaymentPeriod_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentPeriod paymentPeriod = mock(SwapPaymentPeriod.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentPeriodPricer.DEFAULT.presentValue(
                paymentPeriod, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentPeriodPricer#presentValueSensitivity(SwapPaymentPeriod,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DispatchingSwapPaymentPeriodPricer#presentValueSensitivity(SwapPaymentPeriod, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValueSensitivity(SwapPaymentPeriod, RatesProvider); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.sensitivity.PointSensitivityBuilder DispatchingSwapPaymentPeriodPricer.presentValueSensitivity(SwapPaymentPeriod, RatesProvider)"
  })
  void testPresentValueSensitivity_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentPeriod paymentPeriod = mock(SwapPaymentPeriod.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentPeriodPricer.DEFAULT.presentValueSensitivity(
                paymentPeriod, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentPeriodPricer#forecastValue(SwapPaymentPeriod,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentPeriod}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DispatchingSwapPaymentPeriodPricer#forecastValue(SwapPaymentPeriod, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test forecastValue(SwapPaymentPeriod, RatesProvider); when SwapPaymentPeriod; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingSwapPaymentPeriodPricer.forecastValue(SwapPaymentPeriod, RatesProvider)"
  })
  void testForecastValue_whenSwapPaymentPeriod_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentPeriod paymentPeriod = mock(SwapPaymentPeriod.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentPeriodPricer.DEFAULT.forecastValue(
                paymentPeriod, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentPeriodPricer#forecastValueSensitivity(SwapPaymentPeriod,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DispatchingSwapPaymentPeriodPricer#forecastValueSensitivity(SwapPaymentPeriod, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test forecastValueSensitivity(SwapPaymentPeriod, RatesProvider); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.sensitivity.PointSensitivityBuilder DispatchingSwapPaymentPeriodPricer.forecastValueSensitivity(SwapPaymentPeriod, RatesProvider)"
  })
  void testForecastValueSensitivity_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentPeriod paymentPeriod = mock(SwapPaymentPeriod.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentPeriodPricer.DEFAULT.forecastValueSensitivity(
                paymentPeriod, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentPeriodPricer#pvbp(SwapPaymentPeriod, RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentPeriod}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingSwapPaymentPeriodPricer#pvbp(SwapPaymentPeriod,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pvbp(SwapPaymentPeriod, RatesProvider); when SwapPaymentPeriod; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingSwapPaymentPeriodPricer.pvbp(SwapPaymentPeriod, RatesProvider)"
  })
  void testPvbp_whenSwapPaymentPeriod_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentPeriod paymentPeriod = mock(SwapPaymentPeriod.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentPeriodPricer.DEFAULT.pvbp(
                paymentPeriod, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentPeriodPricer#pvbpSensitivity(SwapPaymentPeriod,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentPeriod}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DispatchingSwapPaymentPeriodPricer#pvbpSensitivity(SwapPaymentPeriod, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pvbpSensitivity(SwapPaymentPeriod, RatesProvider); when SwapPaymentPeriod; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.sensitivity.PointSensitivityBuilder DispatchingSwapPaymentPeriodPricer.pvbpSensitivity(SwapPaymentPeriod, RatesProvider)"
  })
  void testPvbpSensitivity_whenSwapPaymentPeriod_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentPeriod paymentPeriod = mock(SwapPaymentPeriod.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentPeriodPricer.DEFAULT.pvbpSensitivity(
                paymentPeriod, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentPeriodPricer#accruedInterest(SwapPaymentPeriod,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentPeriod}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DispatchingSwapPaymentPeriodPricer#accruedInterest(SwapPaymentPeriod, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test accruedInterest(SwapPaymentPeriod, RatesProvider); when SwapPaymentPeriod; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingSwapPaymentPeriodPricer.accruedInterest(SwapPaymentPeriod, RatesProvider)"
  })
  void testAccruedInterest_whenSwapPaymentPeriod_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentPeriod paymentPeriod = mock(SwapPaymentPeriod.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentPeriodPricer.DEFAULT.accruedInterest(
                paymentPeriod, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentPeriodPricer#explainPresentValue(SwapPaymentPeriod,
   * RatesProvider, ExplainMapBuilder)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentPeriod}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DispatchingSwapPaymentPeriodPricer#explainPresentValue(SwapPaymentPeriod, RatesProvider,
   * ExplainMapBuilder)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(SwapPaymentPeriod, RatesProvider, ExplainMapBuilder); when SwapPaymentPeriod; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DispatchingSwapPaymentPeriodPricer.explainPresentValue(SwapPaymentPeriod, RatesProvider, ExplainMapBuilder)"
  })
  void testExplainPresentValue_whenSwapPaymentPeriod_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentPeriod paymentPeriod = mock(SwapPaymentPeriod.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentPeriodPricer.DEFAULT.explainPresentValue(
                paymentPeriod, new MockRatesProvider(), ExplainMap.builder()));
  }

  /**
   * Test {@link DispatchingSwapPaymentPeriodPricer#currencyExposure(SwapPaymentPeriod,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentPeriod}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DispatchingSwapPaymentPeriodPricer#currencyExposure(SwapPaymentPeriod, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(SwapPaymentPeriod, RatesProvider); when SwapPaymentPeriod; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.currency.MultiCurrencyAmount DispatchingSwapPaymentPeriodPricer.currencyExposure(SwapPaymentPeriod, RatesProvider)"
  })
  void testCurrencyExposure_whenSwapPaymentPeriod_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentPeriod paymentPeriod = mock(SwapPaymentPeriod.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentPeriodPricer.DEFAULT.currencyExposure(
                paymentPeriod, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentPeriodPricer#currentCash(SwapPaymentPeriod, RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentPeriod}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingSwapPaymentPeriodPricer#currentCash(SwapPaymentPeriod,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(SwapPaymentPeriod, RatesProvider); when SwapPaymentPeriod; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingSwapPaymentPeriodPricer.currentCash(SwapPaymentPeriod, RatesProvider)"
  })
  void testCurrentCash_whenSwapPaymentPeriod_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentPeriod paymentPeriod = mock(SwapPaymentPeriod.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentPeriodPricer.DEFAULT.currentCash(
                paymentPeriod, new MockRatesProvider()));
  }
}
