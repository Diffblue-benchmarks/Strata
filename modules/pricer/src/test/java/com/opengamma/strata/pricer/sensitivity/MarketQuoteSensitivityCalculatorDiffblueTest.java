package com.opengamma.strata.pricer.sensitivity;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.pricer.bond.LegalEntityDiscountingProvider;
import com.opengamma.strata.pricer.credit.CreditRatesProvider;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketQuoteSensitivityCalculatorDiffblueTest {
  /**
   * Test {@link MarketQuoteSensitivityCalculator#sensitivity(CurrencyParameterSensitivities,
   * CreditRatesProvider)} with {@code CurrencyParameterSensitivities}, {@code CreditRatesProvider}.
   *
   * <p>Method under test: {@link
   * MarketQuoteSensitivityCalculator#sensitivity(CurrencyParameterSensitivities,
   * CreditRatesProvider)}
   */
  @Test
  @DisplayName(
      "Test sensitivity(CurrencyParameterSensitivities, CreditRatesProvider) with 'CurrencyParameterSensitivities', 'CreditRatesProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities MarketQuoteSensitivityCalculator.sensitivity(CurrencyParameterSensitivities, CreditRatesProvider)"
  })
  void testSensitivityWithCurrencyParameterSensitivitiesCreditRatesProvider() {
    // Arrange
    CurrencyParameterSensitivities paramSensitivities = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualSensitivityResult =
        MarketQuoteSensitivityCalculator.DEFAULT.sensitivity(
            paramSensitivities, mock(CreditRatesProvider.class));

    // Assert
    assertSame(paramSensitivities, actualSensitivityResult);
  }

  /**
   * Test {@link MarketQuoteSensitivityCalculator#sensitivity(CurrencyParameterSensitivities,
   * LegalEntityDiscountingProvider)} with {@code CurrencyParameterSensitivities}, {@code
   * LegalEntityDiscountingProvider}.
   *
   * <p>Method under test: {@link
   * MarketQuoteSensitivityCalculator#sensitivity(CurrencyParameterSensitivities,
   * LegalEntityDiscountingProvider)}
   */
  @Test
  @DisplayName(
      "Test sensitivity(CurrencyParameterSensitivities, LegalEntityDiscountingProvider) with 'CurrencyParameterSensitivities', 'LegalEntityDiscountingProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities MarketQuoteSensitivityCalculator.sensitivity(CurrencyParameterSensitivities, LegalEntityDiscountingProvider)"
  })
  void testSensitivityWithCurrencyParameterSensitivitiesLegalEntityDiscountingProvider() {
    // Arrange
    CurrencyParameterSensitivities paramSensitivities = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualSensitivityResult =
        MarketQuoteSensitivityCalculator.DEFAULT.sensitivity(
            paramSensitivities, mock(LegalEntityDiscountingProvider.class));

    // Assert
    assertSame(paramSensitivities, actualSensitivityResult);
  }

  /**
   * Test {@link MarketQuoteSensitivityCalculator#sensitivity(CurrencyParameterSensitivities,
   * RatesProvider)} with {@code CurrencyParameterSensitivities}, {@code RatesProvider}.
   *
   * <ul>
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * MarketQuoteSensitivityCalculator#sensitivity(CurrencyParameterSensitivities, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test sensitivity(CurrencyParameterSensitivities, RatesProvider) with 'CurrencyParameterSensitivities', 'RatesProvider'; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities MarketQuoteSensitivityCalculator.sensitivity(CurrencyParameterSensitivities, RatesProvider)"
  })
  void testSensitivityWithCurrencyParameterSensitivitiesRatesProvider_thenReturnEmpty() {
    // Arrange
    CurrencyParameterSensitivities paramSensitivities = CurrencyParameterSensitivities.empty();

    // Act
    CurrencyParameterSensitivities actualSensitivityResult =
        MarketQuoteSensitivityCalculator.DEFAULT.sensitivity(
            paramSensitivities, new MockRatesProvider());

    // Assert
    assertSame(paramSensitivities, actualSensitivityResult);
  }
}
