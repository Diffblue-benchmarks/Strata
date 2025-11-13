package com.opengamma.strata.pricer.sensitivity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.pricer.bond.ImmutableLegalEntityDiscountingProvider;
import com.opengamma.strata.pricer.bond.ImmutableLegalEntityDiscountingProvider.Builder;
import com.opengamma.strata.pricer.bond.LegalEntityDiscountingProvider;
import com.opengamma.strata.pricer.credit.CreditRatesProvider;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.ImmutableRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RatesFiniteDifferenceSensitivityCalculatorDiffblueTest {
  /**
   * Test {@link RatesFiniteDifferenceSensitivityCalculator#sensitivity(CreditRatesProvider,
   * Function)} with {@code CreditRatesProvider}, {@code Function}.
   *
   * <p>Method under test: {@link
   * RatesFiniteDifferenceSensitivityCalculator#sensitivity(CreditRatesProvider, Function)}
   */
  @Test
  @DisplayName(
      "Test sensitivity(CreditRatesProvider, Function) with 'CreditRatesProvider', 'Function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities RatesFiniteDifferenceSensitivityCalculator.sensitivity(CreditRatesProvider, Function)"
  })
  void testSensitivityWithCreditRatesProviderFunction() {
    // Arrange
    CreditRatesProvider provider = mock(CreditRatesProvider.class);
    when(provider.toImmutableCreditRatesProvider()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            RatesFiniteDifferenceSensitivityCalculator.DEFAULT.sensitivity(
                provider, mock(Function.class)));
    verify(provider).toImmutableCreditRatesProvider();
  }

  /**
   * Test {@link
   * RatesFiniteDifferenceSensitivityCalculator#sensitivity(LegalEntityDiscountingProvider,
   * Function)} with {@code LegalEntityDiscountingProvider}, {@code Function}.
   *
   * <p>Method under test: {@link
   * RatesFiniteDifferenceSensitivityCalculator#sensitivity(LegalEntityDiscountingProvider,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test sensitivity(LegalEntityDiscountingProvider, Function) with 'LegalEntityDiscountingProvider', 'Function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities RatesFiniteDifferenceSensitivityCalculator.sensitivity(LegalEntityDiscountingProvider, Function)"
  })
  void testSensitivityWithLegalEntityDiscountingProviderFunction() {
    // Arrange
    LegalEntityDiscountingProvider provider = mock(LegalEntityDiscountingProvider.class);
    when(provider.toImmutableLegalEntityDiscountingProvider())
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            RatesFiniteDifferenceSensitivityCalculator.DEFAULT.sensitivity(
                provider, mock(Function.class)));
    verify(provider).toImmutableLegalEntityDiscountingProvider();
  }

  /**
   * Test {@link
   * RatesFiniteDifferenceSensitivityCalculator#sensitivity(LegalEntityDiscountingProvider,
   * Function)} with {@code LegalEntityDiscountingProvider}, {@code Function}.
   *
   * <p>Method under test: {@link
   * RatesFiniteDifferenceSensitivityCalculator#sensitivity(LegalEntityDiscountingProvider,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test sensitivity(LegalEntityDiscountingProvider, Function) with 'LegalEntityDiscountingProvider', 'Function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities RatesFiniteDifferenceSensitivityCalculator.sensitivity(LegalEntityDiscountingProvider, Function)"
  })
  void testSensitivityWithLegalEntityDiscountingProviderFunction2() {
    // Arrange
    LegalEntityDiscountingProvider provider = mock(LegalEntityDiscountingProvider.class);

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    when(provider.toImmutableLegalEntityDiscountingProvider())
        .thenReturn(
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build());

    Function<ImmutableLegalEntityDiscountingProvider, CurrencyAmount> valueFn =
        mock(Function.class);
    when(valueFn.apply(Mockito.<ImmutableLegalEntityDiscountingProvider>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> RatesFiniteDifferenceSensitivityCalculator.DEFAULT.sensitivity(provider, valueFn));
    verify(provider).toImmutableLegalEntityDiscountingProvider();
    verify(valueFn).apply(isA(ImmutableLegalEntityDiscountingProvider.class));
  }

  /**
   * Test {@link
   * RatesFiniteDifferenceSensitivityCalculator#sensitivity(LegalEntityDiscountingProvider,
   * Function)} with {@code LegalEntityDiscountingProvider}, {@code Function}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesFiniteDifferenceSensitivityCalculator#sensitivity(LegalEntityDiscountingProvider,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test sensitivity(LegalEntityDiscountingProvider, Function) with 'LegalEntityDiscountingProvider', 'Function'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities RatesFiniteDifferenceSensitivityCalculator.sensitivity(LegalEntityDiscountingProvider, Function)"
  })
  void testSensitivityWithLegalEntityDiscountingProviderFunction_thenReturnSizeIsZero() {
    // Arrange
    LegalEntityDiscountingProvider provider = mock(LegalEntityDiscountingProvider.class);

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    when(provider.toImmutableLegalEntityDiscountingProvider())
        .thenReturn(
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build());

    Function<ImmutableLegalEntityDiscountingProvider, CurrencyAmount> valueFn =
        mock(Function.class);
    when(valueFn.apply(Mockito.<ImmutableLegalEntityDiscountingProvider>any())).thenReturn(null);

    // Act
    CurrencyParameterSensitivities actualSensitivityResult =
        RatesFiniteDifferenceSensitivityCalculator.DEFAULT.sensitivity(provider, valueFn);

    // Assert
    verify(provider).toImmutableLegalEntityDiscountingProvider();
    verify(valueFn).apply(isA(ImmutableLegalEntityDiscountingProvider.class));
    assertEquals(0, actualSensitivityResult.size());
    assertTrue(actualSensitivityResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link RatesFiniteDifferenceSensitivityCalculator#sensitivity(RatesProvider, Function)}
   * with {@code RatesProvider}, {@code Function}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesFiniteDifferenceSensitivityCalculator#sensitivity(RatesProvider, Function)}
   */
  @Test
  @DisplayName(
      "Test sensitivity(RatesProvider, Function) with 'RatesProvider', 'Function'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities RatesFiniteDifferenceSensitivityCalculator.sensitivity(RatesProvider, Function)"
  })
  void testSensitivityWithRatesProviderFunction_thenThrowIllegalArgumentException() {
    // Arrange
    MockRatesProvider provider = mock(MockRatesProvider.class);
    when(provider.toImmutableRatesProvider()).thenReturn(null);

    Function<ImmutableRatesProvider, CurrencyAmount> valueFn = mock(Function.class);
    when(valueFn.apply(Mockito.<ImmutableRatesProvider>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> RatesFiniteDifferenceSensitivityCalculator.DEFAULT.sensitivity(provider, valueFn));
    verify(provider).toImmutableRatesProvider();
    verify(valueFn).apply(isNull());
  }
}
