package com.opengamma.strata.pricer.impl.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.market.sensitivity.MutablePointSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivity;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.swap.NotionalExchange;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingNotionalExchangePricerDiffblueTest {
  /**
   * Test {@link DiscountingNotionalExchangePricer#forecastValueSensitivity(NotionalExchange,
   * RatesProvider)} with {@code NotionalExchange}, {@code RatesProvider}.
   *
   * <p>Method under test: {@link
   * DiscountingNotionalExchangePricer#forecastValueSensitivity(NotionalExchange, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test forecastValueSensitivity(NotionalExchange, RatesProvider) with 'NotionalExchange', 'RatesProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PointSensitivityBuilder DiscountingNotionalExchangePricer.forecastValueSensitivity(NotionalExchange, RatesProvider)"
  })
  void testForecastValueSensitivityWithNotionalExchangeRatesProvider() {
    // Arrange, Act and Assert
    PointSensitivities pointSensitivities =
        DiscountingNotionalExchangePricer.DEFAULT
            .forecastValueSensitivity(null, new MockRatesProvider())
            .build();
    MutablePointSensitivities toMutableResult = pointSensitivities.toMutable();
    assertEquals(0, toMutableResult.size());
    assertEquals(0, pointSensitivities.size());
    ImmutableList<PointSensitivity> sensitivities = pointSensitivities.getSensitivities();
    assertTrue(sensitivities.isEmpty());
    assertSame(sensitivities, toMutableResult.getSensitivities());
  }
}
