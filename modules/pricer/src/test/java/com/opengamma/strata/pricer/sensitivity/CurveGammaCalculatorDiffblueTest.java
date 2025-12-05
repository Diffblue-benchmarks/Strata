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
import com.opengamma.strata.market.param.CrossGammaParameterSensitivities;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.pricer.bond.ImmutableLegalEntityDiscountingProvider;
import com.opengamma.strata.pricer.bond.ImmutableLegalEntityDiscountingProvider.Builder;
import com.opengamma.strata.pricer.bond.LegalEntityDiscountingProvider;
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

class CurveGammaCalculatorDiffblueTest {
  /**
   * Test {@link CurveGammaCalculator#calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider,
   * Function)} with {@code LegalEntityDiscountingProvider}, {@code Function}.
   *
   * <p>Method under test: {@link
   * CurveGammaCalculator#calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider, Function)}
   */
  @Test
  @DisplayName(
      "Test calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider, Function) with 'LegalEntityDiscountingProvider', 'Function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivities CurveGammaCalculator.calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider, Function)"
  })
  void testCalculateCrossGammaIntraCurveWithLegalEntityDiscountingProviderFunction() {
    // Arrange
    LegalEntityDiscountingProvider ratesProvider = mock(LegalEntityDiscountingProvider.class);
    when(ratesProvider.getValuationDate()).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            CurveGammaCalculator.DEFAULT.calculateCrossGammaIntraCurve(
                ratesProvider, mock(Function.class)));
    verify(ratesProvider).getValuationDate();
  }

  /**
   * Test {@link CurveGammaCalculator#calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider,
   * Function)} with {@code LegalEntityDiscountingProvider}, {@code Function}.
   *
   * <p>Method under test: {@link
   * CurveGammaCalculator#calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider, Function)}
   */
  @Test
  @DisplayName(
      "Test calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider, Function) with 'LegalEntityDiscountingProvider', 'Function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivities CurveGammaCalculator.calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider, Function)"
  })
  void testCalculateCrossGammaIntraCurveWithLegalEntityDiscountingProviderFunction2() {
    // Arrange
    LegalEntityDiscountingProvider ratesProvider = mock(LegalEntityDiscountingProvider.class);

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    when(ratesProvider.toImmutableLegalEntityDiscountingProvider())
        .thenReturn(
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build());
    when(ratesProvider.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    Function<ImmutableLegalEntityDiscountingProvider, CurrencyParameterSensitivities>
        sensitivitiesFn = mock(Function.class);
    when(sensitivitiesFn.apply(Mockito.<ImmutableLegalEntityDiscountingProvider>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    CrossGammaParameterSensitivities actualCalculateCrossGammaIntraCurveResult =
        CurveGammaCalculator.DEFAULT.calculateCrossGammaIntraCurve(ratesProvider, sensitivitiesFn);

    // Assert
    verify(ratesProvider).getValuationDate();
    verify(ratesProvider).toImmutableLegalEntityDiscountingProvider();
    verify(sensitivitiesFn).apply(isA(ImmutableLegalEntityDiscountingProvider.class));
    assertEquals(0, actualCalculateCrossGammaIntraCurveResult.size());
    assertTrue(actualCalculateCrossGammaIntraCurveResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link CurveGammaCalculator#calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider,
   * Function)} with {@code LegalEntityDiscountingProvider}, {@code Function}.
   *
   * <p>Method under test: {@link
   * CurveGammaCalculator#calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider, Function)}
   */
  @Test
  @DisplayName(
      "Test calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider, Function) with 'LegalEntityDiscountingProvider', 'Function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivities CurveGammaCalculator.calculateCrossGammaIntraCurve(LegalEntityDiscountingProvider, Function)"
  })
  void testCalculateCrossGammaIntraCurveWithLegalEntityDiscountingProviderFunction3() {
    // Arrange
    LegalEntityDiscountingProvider ratesProvider = mock(LegalEntityDiscountingProvider.class);

    Builder builderResult = ImmutableLegalEntityDiscountingProvider.builder();

    Builder issuerCurveGroupsResult = builderResult.issuerCurveGroups(new HashMap<>());

    Builder issuerCurvesResult = issuerCurveGroupsResult.issuerCurves(new HashMap<>());

    Builder repoCurveGroupsResult = issuerCurvesResult.repoCurveGroups(new HashMap<>());

    Builder repoCurveSecurityGroupsResult =
        repoCurveGroupsResult.repoCurveSecurityGroups(new HashMap<>());
    when(ratesProvider.toImmutableLegalEntityDiscountingProvider())
        .thenReturn(
            repoCurveSecurityGroupsResult
                .repoCurves(new HashMap<>())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build());
    when(ratesProvider.getValuationDate()).thenReturn(LocalDate.of(1970, 1, 1));

    Function<ImmutableLegalEntityDiscountingProvider, CurrencyParameterSensitivities>
        sensitivitiesFn = mock(Function.class);
    when(sensitivitiesFn.apply(Mockito.<ImmutableLegalEntityDiscountingProvider>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            CurveGammaCalculator.DEFAULT.calculateCrossGammaIntraCurve(
                ratesProvider, sensitivitiesFn));
    verify(ratesProvider).getValuationDate();
    verify(ratesProvider).toImmutableLegalEntityDiscountingProvider();
    verify(sensitivitiesFn).apply(isA(ImmutableLegalEntityDiscountingProvider.class));
  }

  /**
   * Test {@link CurveGammaCalculator#calculateCrossGammaIntraCurve(RatesProvider, Function)} with
   * {@code RatesProvider}, {@code Function}.
   *
   * <p>Method under test: {@link CurveGammaCalculator#calculateCrossGammaIntraCurve(RatesProvider,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test calculateCrossGammaIntraCurve(RatesProvider, Function) with 'RatesProvider', 'Function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivities CurveGammaCalculator.calculateCrossGammaIntraCurve(RatesProvider, Function)"
  })
  void testCalculateCrossGammaIntraCurveWithRatesProviderFunction() {
    // Arrange
    MockRatesProvider ratesProvider = mock(MockRatesProvider.class);
    when(ratesProvider.toImmutableRatesProvider()).thenReturn(null);

    Function<ImmutableRatesProvider, CurrencyParameterSensitivities> sensitivitiesFn =
        mock(Function.class);
    when(sensitivitiesFn.apply(Mockito.<ImmutableRatesProvider>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            CurveGammaCalculator.DEFAULT.calculateCrossGammaIntraCurve(
                ratesProvider, sensitivitiesFn));
    verify(ratesProvider).toImmutableRatesProvider();
    verify(sensitivitiesFn).apply(isNull());
  }

  /**
   * Test {@link CurveGammaCalculator#calculateCrossGammaCrossCurve(RatesProvider, Function)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link CurveGammaCalculator#calculateCrossGammaCrossCurve(RatesProvider,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test calculateCrossGammaCrossCurve(RatesProvider, Function); given empty; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivities CurveGammaCalculator.calculateCrossGammaCrossCurve(RatesProvider, Function)"
  })
  void testCalculateCrossGammaCrossCurve_givenEmpty_thenReturnSizeIsZero() {
    // Arrange
    MockRatesProvider ratesProvider = mock(MockRatesProvider.class);
    when(ratesProvider.toImmutableRatesProvider()).thenReturn(null);

    Function<ImmutableRatesProvider, CurrencyParameterSensitivities> sensitivitiesFn =
        mock(Function.class);
    when(sensitivitiesFn.apply(Mockito.<ImmutableRatesProvider>any()))
        .thenReturn(CurrencyParameterSensitivities.empty());

    // Act
    CrossGammaParameterSensitivities actualCalculateCrossGammaCrossCurveResult =
        CurveGammaCalculator.DEFAULT.calculateCrossGammaCrossCurve(ratesProvider, sensitivitiesFn);

    // Assert
    verify(ratesProvider).toImmutableRatesProvider();
    verify(sensitivitiesFn).apply(isNull());
    assertEquals(0, actualCalculateCrossGammaCrossCurveResult.size());
    assertTrue(actualCalculateCrossGammaCrossCurveResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link CurveGammaCalculator#calculateCrossGammaCrossCurve(RatesProvider, Function)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurveGammaCalculator#calculateCrossGammaCrossCurve(RatesProvider,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test calculateCrossGammaCrossCurve(RatesProvider, Function); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CrossGammaParameterSensitivities CurveGammaCalculator.calculateCrossGammaCrossCurve(RatesProvider, Function)"
  })
  void testCalculateCrossGammaCrossCurve_thenThrowIllegalArgumentException() {
    // Arrange
    MockRatesProvider ratesProvider = mock(MockRatesProvider.class);
    when(ratesProvider.toImmutableRatesProvider()).thenReturn(null);

    Function<ImmutableRatesProvider, CurrencyParameterSensitivities> sensitivitiesFn =
        mock(Function.class);
    when(sensitivitiesFn.apply(Mockito.<ImmutableRatesProvider>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            CurveGammaCalculator.DEFAULT.calculateCrossGammaCrossCurve(
                ratesProvider, sensitivitiesFn));
    verify(ratesProvider).toImmutableRatesProvider();
    verify(sensitivitiesFn).apply(isNull());
  }
}
