package com.opengamma.strata.pricer.impl.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.market.sensitivity.MutablePointSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivity;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.swap.KnownAmountSwapPaymentPeriod;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingKnownAmountPaymentPeriodPricerDiffblueTest {
  /**
   * Test {@link DiscountingKnownAmountPaymentPeriodPricer#pvbp(KnownAmountSwapPaymentPeriod,
   * RatesProvider)} with {@code KnownAmountSwapPaymentPeriod}, {@code RatesProvider}.
   *
   * <p>Method under test: {@link
   * DiscountingKnownAmountPaymentPeriodPricer#pvbp(KnownAmountSwapPaymentPeriod, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pvbp(KnownAmountSwapPaymentPeriod, RatesProvider) with 'KnownAmountSwapPaymentPeriod', 'RatesProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DiscountingKnownAmountPaymentPeriodPricer.pvbp(KnownAmountSwapPaymentPeriod, RatesProvider)"
  })
  void testPvbpWithKnownAmountSwapPaymentPeriodRatesProvider() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            DiscountingKnownAmountPaymentPeriodPricer.DEFAULT.pvbp(null, new MockRatesProvider()));
  }

  /**
   * Test {@link
   * DiscountingKnownAmountPaymentPeriodPricer#forecastValueSensitivity(KnownAmountSwapPaymentPeriod,
   * RatesProvider)} with {@code KnownAmountSwapPaymentPeriod}, {@code RatesProvider}.
   *
   * <p>Method under test: {@link
   * DiscountingKnownAmountPaymentPeriodPricer#forecastValueSensitivity(KnownAmountSwapPaymentPeriod,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test forecastValueSensitivity(KnownAmountSwapPaymentPeriod, RatesProvider) with 'KnownAmountSwapPaymentPeriod', 'RatesProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PointSensitivityBuilder DiscountingKnownAmountPaymentPeriodPricer.forecastValueSensitivity(KnownAmountSwapPaymentPeriod, RatesProvider)"
  })
  void testForecastValueSensitivityWithKnownAmountSwapPaymentPeriodRatesProvider() {
    // Arrange, Act and Assert
    PointSensitivities pointSensitivities =
        DiscountingKnownAmountPaymentPeriodPricer.DEFAULT
            .forecastValueSensitivity(null, new MockRatesProvider())
            .build();
    MutablePointSensitivities toMutableResult = pointSensitivities.toMutable();
    assertEquals(0, toMutableResult.size());
    assertEquals(0, pointSensitivities.size());
    ImmutableList<PointSensitivity> sensitivities = pointSensitivities.getSensitivities();
    assertTrue(sensitivities.isEmpty());
    assertSame(sensitivities, toMutableResult.getSensitivities());
  }

  /**
   * Test {@link
   * DiscountingKnownAmountPaymentPeriodPricer#pvbpSensitivity(KnownAmountSwapPaymentPeriod,
   * RatesProvider)} with {@code KnownAmountSwapPaymentPeriod}, {@code RatesProvider}.
   *
   * <p>Method under test: {@link
   * DiscountingKnownAmountPaymentPeriodPricer#pvbpSensitivity(KnownAmountSwapPaymentPeriod,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test pvbpSensitivity(KnownAmountSwapPaymentPeriod, RatesProvider) with 'KnownAmountSwapPaymentPeriod', 'RatesProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PointSensitivityBuilder DiscountingKnownAmountPaymentPeriodPricer.pvbpSensitivity(KnownAmountSwapPaymentPeriod, RatesProvider)"
  })
  void testPvbpSensitivityWithKnownAmountSwapPaymentPeriodRatesProvider() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            DiscountingKnownAmountPaymentPeriodPricer.DEFAULT.pvbpSensitivity(
                null, new MockRatesProvider()));
  }
}
