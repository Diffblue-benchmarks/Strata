package com.opengamma.strata.pricer.rate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.market.curve.Curve;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatesProviderDiffblueTest {
  /**
   * Test {@link RatesProvider#indices()}.
   *
   * <p>Method under test: {@link RatesProvider#indices()}
   */
  @Test
  @DisplayName("Test indices()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream RatesProvider.indices()"})
  void testIndices() {
    // Arrange and Act
    Stream<Index> actualIndicesResult = new MockRatesProvider().indices();

    // Assert
    assertTrue(actualIndicesResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   *
   * <p>Method under test: {@link RatesProvider#parameterSensitivity(PointSensitivities)}
   */
  @Test
  @DisplayName("Test parameterSensitivity(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities RatesProvider.parameterSensitivity(PointSensitivities)"
  })
  void testParameterSensitivity() {
    // Arrange
    LocalDate valuationDate = LocalDate.now();
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    CurrencyParameterSensitivities actualParameterSensitivityResult =
        immutableRatesProvider.parameterSensitivity(PointSensitivities.empty());

    // Assert
    assertEquals(0, actualParameterSensitivityResult.size());
    assertTrue(actualParameterSensitivityResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link RatesProvider#parameterSensitivity(PointSensitivities)}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link RatesProvider#parameterSensitivity(PointSensitivities)}
   */
  @Test
  @DisplayName(
      "Test parameterSensitivity(PointSensitivities); given LocalDate with '1970' and one and one; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities RatesProvider.parameterSensitivity(PointSensitivities)"
  })
  void testParameterSensitivity_givenLocalDateWith1970AndOneAndOne_thenReturnSizeIsZero() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    CurrencyParameterSensitivities actualParameterSensitivityResult =
        immutableRatesProvider.parameterSensitivity(PointSensitivities.empty());

    // Assert
    assertEquals(0, actualParameterSensitivityResult.size());
    assertTrue(actualParameterSensitivityResult.getSensitivities().isEmpty());
  }

  /**
   * Test {@link RatesProvider#currencyExposure(PointSensitivities)}.
   *
   * <p>Method under test: {@link RatesProvider#currencyExposure(PointSensitivities)}
   */
  @Test
  @DisplayName("Test currencyExposure(PointSensitivities)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount RatesProvider.currencyExposure(PointSensitivities)"})
  void testCurrencyExposure() {
    // Arrange
    LocalDate valuationDate = LocalDate.now();
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    MultiCurrencyAmount actualCurrencyExposureResult =
        immutableRatesProvider.currencyExposure(PointSensitivities.empty());

    // Assert
    assertEquals(0, actualCurrencyExposureResult.size());
    assertTrue(actualCurrencyExposureResult.getAmounts().isEmpty());
    assertTrue(actualCurrencyExposureResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualCurrencyExposureResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link RatesProvider#currencyExposure(PointSensitivities)}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link RatesProvider#currencyExposure(PointSensitivities)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(PointSensitivities); given LocalDate with '1970' and one and one; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MultiCurrencyAmount RatesProvider.currencyExposure(PointSensitivities)"})
  void testCurrencyExposure_givenLocalDateWith1970AndOneAndOne_thenReturnSizeIsZero() {
    // Arrange
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    FxRateProvider fxRateProvider = mock(FxRateProvider.class);
    HashMap<Currency, Curve> discountCurves = new HashMap<>();
    HashMap<Index, Curve> indexCurves = new HashMap<>();

    ImmutableRatesProvider immutableRatesProvider =
        new ImmutableRatesProvider(
            valuationDate, fxRateProvider, discountCurves, indexCurves, new HashMap<>());

    // Act
    MultiCurrencyAmount actualCurrencyExposureResult =
        immutableRatesProvider.currencyExposure(PointSensitivities.empty());

    // Assert
    assertEquals(0, actualCurrencyExposureResult.size());
    assertTrue(actualCurrencyExposureResult.getAmounts().isEmpty());
    assertTrue(actualCurrencyExposureResult.getCurrencies().isEmpty());
    Stream<CurrencyAmount> streamResult = actualCurrencyExposureResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }
}
