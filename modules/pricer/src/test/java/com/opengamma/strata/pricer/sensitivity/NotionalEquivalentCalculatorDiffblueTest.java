package com.opengamma.strata.pricer.sensitivity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NotionalEquivalentCalculatorDiffblueTest {
  /**
   * Test {@link NotionalEquivalentCalculator#notionalEquivalent(CurrencyParameterSensitivities,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * NotionalEquivalentCalculator#notionalEquivalent(CurrencyParameterSensitivities, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test notionalEquivalent(CurrencyParameterSensitivities, RatesProvider); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities NotionalEquivalentCalculator.notionalEquivalent(CurrencyParameterSensitivities, RatesProvider)"
  })
  void testNotionalEquivalent_whenEmpty_thenReturnEmpty() {
    // Arrange
    CurrencyParameterSensitivities marketQuoteSensitivities =
        CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualNotionalEquivalentResult =
        NotionalEquivalentCalculator.DEFAULT.notionalEquivalent(
            marketQuoteSensitivities, new MockRatesProvider());

    // Assert
    assertEquals(marketQuoteSensitivities, actualNotionalEquivalentResult);
  }
}
