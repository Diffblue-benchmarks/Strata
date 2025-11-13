package com.opengamma.strata.pricer.impl.swap;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.explain.ExplainMap;
import com.opengamma.strata.market.explain.ExplainMapBuilder;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.swap.SwapPaymentEvent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DispatchingSwapPaymentEventPricerDiffblueTest {
  /**
   * Test {@link DispatchingSwapPaymentEventPricer#presentValue(SwapPaymentEvent, RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentEvent}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingSwapPaymentEventPricer#presentValue(SwapPaymentEvent,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValue(SwapPaymentEvent, RatesProvider); when SwapPaymentEvent; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingSwapPaymentEventPricer.presentValue(SwapPaymentEvent, RatesProvider)"
  })
  void testPresentValue_whenSwapPaymentEvent_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentEvent paymentEvent = mock(SwapPaymentEvent.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentEventPricer.DEFAULT.presentValue(
                paymentEvent, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentEventPricer#presentValueSensitivity(SwapPaymentEvent,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DispatchingSwapPaymentEventPricer#presentValueSensitivity(SwapPaymentEvent, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test presentValueSensitivity(SwapPaymentEvent, RatesProvider); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.sensitivity.PointSensitivityBuilder DispatchingSwapPaymentEventPricer.presentValueSensitivity(SwapPaymentEvent, RatesProvider)"
  })
  void testPresentValueSensitivity_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentEvent paymentEvent = mock(SwapPaymentEvent.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentEventPricer.DEFAULT.presentValueSensitivity(
                paymentEvent, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentEventPricer#forecastValue(SwapPaymentEvent, RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentEvent}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingSwapPaymentEventPricer#forecastValue(SwapPaymentEvent,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test forecastValue(SwapPaymentEvent, RatesProvider); when SwapPaymentEvent; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingSwapPaymentEventPricer.forecastValue(SwapPaymentEvent, RatesProvider)"
  })
  void testForecastValue_whenSwapPaymentEvent_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentEvent paymentEvent = mock(SwapPaymentEvent.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentEventPricer.DEFAULT.forecastValue(
                paymentEvent, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentEventPricer#forecastValueSensitivity(SwapPaymentEvent,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DispatchingSwapPaymentEventPricer#forecastValueSensitivity(SwapPaymentEvent, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test forecastValueSensitivity(SwapPaymentEvent, RatesProvider); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.sensitivity.PointSensitivityBuilder DispatchingSwapPaymentEventPricer.forecastValueSensitivity(SwapPaymentEvent, RatesProvider)"
  })
  void testForecastValueSensitivity_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentEvent paymentEvent = mock(SwapPaymentEvent.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentEventPricer.DEFAULT.forecastValueSensitivity(
                paymentEvent, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentEventPricer#explainPresentValue(SwapPaymentEvent,
   * RatesProvider, ExplainMapBuilder)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentEvent}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DispatchingSwapPaymentEventPricer#explainPresentValue(SwapPaymentEvent, RatesProvider,
   * ExplainMapBuilder)}
   */
  @Test
  @DisplayName(
      "Test explainPresentValue(SwapPaymentEvent, RatesProvider, ExplainMapBuilder); when SwapPaymentEvent; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DispatchingSwapPaymentEventPricer.explainPresentValue(SwapPaymentEvent, RatesProvider, ExplainMapBuilder)"
  })
  void testExplainPresentValue_whenSwapPaymentEvent_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentEvent paymentEvent = mock(SwapPaymentEvent.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentEventPricer.DEFAULT.explainPresentValue(
                paymentEvent, new MockRatesProvider(), ExplainMap.builder()));
  }

  /**
   * Test {@link DispatchingSwapPaymentEventPricer#currencyExposure(SwapPaymentEvent,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentEvent}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DispatchingSwapPaymentEventPricer#currencyExposure(SwapPaymentEvent, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(SwapPaymentEvent, RatesProvider); when SwapPaymentEvent; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.currency.MultiCurrencyAmount DispatchingSwapPaymentEventPricer.currencyExposure(SwapPaymentEvent, RatesProvider)"
  })
  void testCurrencyExposure_whenSwapPaymentEvent_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentEvent paymentEvent = mock(SwapPaymentEvent.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentEventPricer.DEFAULT.currencyExposure(
                paymentEvent, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingSwapPaymentEventPricer#currentCash(SwapPaymentEvent, RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link SwapPaymentEvent}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingSwapPaymentEventPricer#currentCash(SwapPaymentEvent,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(SwapPaymentEvent, RatesProvider); when SwapPaymentEvent; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingSwapPaymentEventPricer.currentCash(SwapPaymentEvent, RatesProvider)"
  })
  void testCurrentCash_whenSwapPaymentEvent_thenThrowIllegalArgumentException() {
    // Arrange
    SwapPaymentEvent paymentEvent = mock(SwapPaymentEvent.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingSwapPaymentEventPricer.DEFAULT.currentCash(
                paymentEvent, new MockRatesProvider()));
  }
}
