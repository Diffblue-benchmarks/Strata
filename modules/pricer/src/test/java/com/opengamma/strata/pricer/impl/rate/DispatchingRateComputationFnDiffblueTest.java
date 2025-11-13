package com.opengamma.strata.pricer.impl.rate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.market.explain.ExplainMap;
import com.opengamma.strata.market.explain.ExplainMapBuilder;
import com.opengamma.strata.market.sensitivity.MutablePointSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivity;
import com.opengamma.strata.math.MathException;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.rate.FixedOvernightCompoundedAnnualRateComputation;
import com.opengamma.strata.product.rate.FixedRateComputation;
import com.opengamma.strata.product.rate.RateComputation;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DispatchingRateComputationFnDiffblueTest {
  /**
   * Test {@link DispatchingRateComputationFn#rate(RateComputation, LocalDate, LocalDate,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>Then return {@code 2.59374246E9}.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingRateComputationFn#rate(RateComputation, LocalDate,
   * LocalDate, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test rate(RateComputation, LocalDate, LocalDate, RatesProvider); then return '2.59374246E9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingRateComputationFn.rate(RateComputation, LocalDate, LocalDate, RatesProvider)"
  })
  void testRate_thenReturn259374246e9() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation computation =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        2.59374246E9d,
        DispatchingRateComputationFn.DEFAULT.rate(
            computation, startDate, endDate, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingRateComputationFn#rate(RateComputation, LocalDate, LocalDate,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link FixedRateComputation} with rate is {@link Double#NaN}.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingRateComputationFn#rate(RateComputation, LocalDate,
   * LocalDate, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test rate(RateComputation, LocalDate, LocalDate, RatesProvider); when FixedRateComputation with rate is NaN; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingRateComputationFn.rate(RateComputation, LocalDate, LocalDate, RatesProvider)"
  })
  void testRate_whenFixedRateComputationWithRateIsNaN_thenThrowMathException() {
    // Arrange
    FixedRateComputation computation = FixedRateComputation.of(Double.NaN);
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            DispatchingRateComputationFn.DEFAULT.rate(
                computation, startDate, endDate, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingRateComputationFn#rate(RateComputation, LocalDate, LocalDate,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link FixedRateComputation} with rate is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingRateComputationFn#rate(RateComputation, LocalDate,
   * LocalDate, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test rate(RateComputation, LocalDate, LocalDate, RatesProvider); when FixedRateComputation with rate is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingRateComputationFn.rate(RateComputation, LocalDate, LocalDate, RatesProvider)"
  })
  void testRate_whenFixedRateComputationWithRateIsTen_thenReturnTen() {
    // Arrange
    FixedRateComputation computation = FixedRateComputation.of(10.0d);
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        10.0d,
        DispatchingRateComputationFn.DEFAULT.rate(
            computation, startDate, endDate, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingRateComputationFn#rate(RateComputation, LocalDate, LocalDate,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link RateComputation}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingRateComputationFn#rate(RateComputation, LocalDate,
   * LocalDate, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test rate(RateComputation, LocalDate, LocalDate, RatesProvider); when RateComputation; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingRateComputationFn.rate(RateComputation, LocalDate, LocalDate, RatesProvider)"
  })
  void testRate_whenRateComputation_thenThrowIllegalArgumentException() {
    // Arrange
    RateComputation computation = mock(RateComputation.class);
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingRateComputationFn.DEFAULT.rate(
                computation, startDate, endDate, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingRateComputationFn#rateSensitivity(RateComputation, LocalDate, LocalDate,
   * RatesProvider)}.
   *
   * <p>Method under test: {@link DispatchingRateComputationFn#rateSensitivity(RateComputation,
   * LocalDate, LocalDate, RatesProvider)}
   */
  @Test
  @DisplayName("Test rateSensitivity(RateComputation, LocalDate, LocalDate, RatesProvider)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PointSensitivityBuilder DispatchingRateComputationFn.rateSensitivity(RateComputation, LocalDate, LocalDate, RatesProvider)"
  })
  void testRateSensitivity() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation computation =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    PointSensitivities pointSensitivities =
        DispatchingRateComputationFn.DEFAULT
            .rateSensitivity(computation, startDate, endDate, new MockRatesProvider())
            .build();
    MutablePointSensitivities toMutableResult = pointSensitivities.toMutable();
    assertEquals(0, toMutableResult.size());
    assertEquals(0, pointSensitivities.size());
    ImmutableList<PointSensitivity> sensitivities = pointSensitivities.getSensitivities();
    assertTrue(sensitivities.isEmpty());
    assertSame(sensitivities, toMutableResult.getSensitivities());
  }

  /**
   * Test {@link DispatchingRateComputationFn#rateSensitivity(RateComputation, LocalDate, LocalDate,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link FixedRateComputation} with rate is ten.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingRateComputationFn#rateSensitivity(RateComputation,
   * LocalDate, LocalDate, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test rateSensitivity(RateComputation, LocalDate, LocalDate, RatesProvider); when FixedRateComputation with rate is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PointSensitivityBuilder DispatchingRateComputationFn.rateSensitivity(RateComputation, LocalDate, LocalDate, RatesProvider)"
  })
  void testRateSensitivity_whenFixedRateComputationWithRateIsTen() {
    // Arrange
    FixedRateComputation computation = FixedRateComputation.of(10.0d);
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    PointSensitivities pointSensitivities =
        DispatchingRateComputationFn.DEFAULT
            .rateSensitivity(computation, startDate, endDate, new MockRatesProvider())
            .build();
    MutablePointSensitivities toMutableResult = pointSensitivities.toMutable();
    assertEquals(0, toMutableResult.size());
    assertEquals(0, pointSensitivities.size());
    ImmutableList<PointSensitivity> sensitivities = pointSensitivities.getSensitivities();
    assertTrue(sensitivities.isEmpty());
    assertSame(sensitivities, toMutableResult.getSensitivities());
  }

  /**
   * Test {@link DispatchingRateComputationFn#rateSensitivity(RateComputation, LocalDate, LocalDate,
   * RatesProvider)}.
   *
   * <ul>
   *   <li>When {@link RateComputation}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingRateComputationFn#rateSensitivity(RateComputation,
   * LocalDate, LocalDate, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test rateSensitivity(RateComputation, LocalDate, LocalDate, RatesProvider); when RateComputation; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PointSensitivityBuilder DispatchingRateComputationFn.rateSensitivity(RateComputation, LocalDate, LocalDate, RatesProvider)"
  })
  void testRateSensitivity_whenRateComputation_thenThrowIllegalArgumentException() {
    // Arrange
    RateComputation computation = mock(RateComputation.class);
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingRateComputationFn.DEFAULT.rateSensitivity(
                computation, startDate, endDate, new MockRatesProvider()));
  }

  /**
   * Test {@link DispatchingRateComputationFn#explainRate(RateComputation, LocalDate, LocalDate,
   * RatesProvider, ExplainMapBuilder)}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingRateComputationFn#explainRate(RateComputation,
   * LocalDate, LocalDate, RatesProvider, ExplainMapBuilder)}
   */
  @Test
  @DisplayName(
      "Test explainRate(RateComputation, LocalDate, LocalDate, RatesProvider, ExplainMapBuilder); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingRateComputationFn.explainRate(RateComputation, LocalDate, LocalDate, RatesProvider, ExplainMapBuilder)"
  })
  void testExplainRate_thenReturnTen() {
    // Arrange
    FixedOvernightCompoundedAnnualRateComputation computation =
        FixedOvernightCompoundedAnnualRateComputation.of(10.0d, 10.0d);
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);
    ExplainMapBuilder builder = ExplainMap.builder();

    // Act and Assert
    assertEquals(
        10.0d,
        DispatchingRateComputationFn.DEFAULT.explainRate(
            computation, startDate, endDate, new MockRatesProvider(), builder));
    ExplainMap explainMap = builder.build();
    assertEquals(2, explainMap.getMap().size());
    assertFalse(explainMap.isEmpty());
  }

  /**
   * Test {@link DispatchingRateComputationFn#explainRate(RateComputation, LocalDate, LocalDate,
   * RatesProvider, ExplainMapBuilder)}.
   *
   * <ul>
   *   <li>When {@link FixedRateComputation} with rate is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingRateComputationFn#explainRate(RateComputation,
   * LocalDate, LocalDate, RatesProvider, ExplainMapBuilder)}
   */
  @Test
  @DisplayName(
      "Test explainRate(RateComputation, LocalDate, LocalDate, RatesProvider, ExplainMapBuilder); when FixedRateComputation with rate is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingRateComputationFn.explainRate(RateComputation, LocalDate, LocalDate, RatesProvider, ExplainMapBuilder)"
  })
  void testExplainRate_whenFixedRateComputationWithRateIsTen_thenReturnTen() {
    // Arrange
    FixedRateComputation computation = FixedRateComputation.of(10.0d);
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);
    ExplainMapBuilder builder = ExplainMap.builder();

    // Act and Assert
    assertEquals(
        10.0d,
        DispatchingRateComputationFn.DEFAULT.explainRate(
            computation, startDate, endDate, new MockRatesProvider(), builder));
    ExplainMap explainMap = builder.build();
    assertEquals(2, explainMap.getMap().size());
    assertFalse(explainMap.isEmpty());
  }

  /**
   * Test {@link DispatchingRateComputationFn#explainRate(RateComputation, LocalDate, LocalDate,
   * RatesProvider, ExplainMapBuilder)}.
   *
   * <ul>
   *   <li>When {@link RateComputation}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DispatchingRateComputationFn#explainRate(RateComputation,
   * LocalDate, LocalDate, RatesProvider, ExplainMapBuilder)}
   */
  @Test
  @DisplayName(
      "Test explainRate(RateComputation, LocalDate, LocalDate, RatesProvider, ExplainMapBuilder); when RateComputation; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double DispatchingRateComputationFn.explainRate(RateComputation, LocalDate, LocalDate, RatesProvider, ExplainMapBuilder)"
  })
  void testExplainRate_whenRateComputation_thenThrowIllegalArgumentException() {
    // Arrange
    RateComputation computation = mock(RateComputation.class);
    LocalDate startDate = LocalDate.of(1970, 1, 1);
    LocalDate endDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DispatchingRateComputationFn.DEFAULT.explainRate(
                computation, startDate, endDate, new MockRatesProvider(), ExplainMap.builder()));
  }
}
