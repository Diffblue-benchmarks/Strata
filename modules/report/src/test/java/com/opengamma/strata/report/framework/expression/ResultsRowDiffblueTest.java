package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.Measure;
import com.opengamma.strata.calc.runner.CalculationFunction;
import com.opengamma.strata.calc.runner.CalculationFunctions;
import com.opengamma.strata.market.sensitivity.CurveSensitivities;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ResultsRowDiffblueTest {
  /**
   * Test {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}.
   *
   * <p>Method under test: {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}
   */
  @Test
  @DisplayName("Test measureNames(CalculationTarget, CalculationFunctions)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ResultsRow.measureNames(CalculationTarget, CalculationFunctions)"})
  void testMeasureNames() {
    // Arrange
    CurveSensitivities target = CurveSensitivities.empty();

    CalculationFunction<? super CurveSensitivities> calculationFunction =
        mock(CalculationFunction.class);
    when(calculationFunction.supportedMeasures()).thenThrow(new IllegalArgumentException());
    Optional<CalculationFunction<? super CurveSensitivities>> ofResult =
        Optional.of(calculationFunction);

    CalculationFunctions calculationFunctions = mock(CalculationFunctions.class);
    Mockito.<Optional<CalculationFunction<? super CurveSensitivities>>>when(
            calculationFunctions.findFunction(Mockito.<CurveSensitivities>any()))
        .thenReturn(ofResult);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ResultsRow.measureNames(target, calculationFunctions));
    verify(calculationFunction).supportedMeasures();
    verify(calculationFunctions).findFunction(isA(CurveSensitivities.class));
  }

  /**
   * Test {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link CalculationFunctions} {@link
   *       CalculationFunctions#findFunction(CalculationTarget)} return empty.
   * </ul>
   *
   * <p>Method under test: {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}
   */
  @Test
  @DisplayName(
      "Test measureNames(CalculationTarget, CalculationFunctions); given empty; when CalculationFunctions findFunction(CalculationTarget) return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ResultsRow.measureNames(CalculationTarget, CalculationFunctions)"})
  void testMeasureNames_givenEmpty_whenCalculationFunctionsFindFunctionReturnEmpty() {
    // Arrange
    CurveSensitivities target = CurveSensitivities.empty();

    CalculationFunctions calculationFunctions = mock(CalculationFunctions.class);
    Optional<CalculationFunction<? super CurveSensitivities>> emptyResult = Optional.empty();
    Mockito.<Optional<CalculationFunction<? super CurveSensitivities>>>when(
            calculationFunctions.findFunction(Mockito.<CurveSensitivities>any()))
        .thenReturn(emptyResult);

    // Act
    List<String> actualMeasureNamesResult = ResultsRow.measureNames(target, calculationFunctions);

    // Assert
    verify(calculationFunctions).findFunction(isA(CurveSensitivities.class));
    assertTrue(actualMeasureNamesResult.isEmpty());
  }

  /**
   * Test {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link ImmutableMeasure} with name is {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}
   */
  @Test
  @DisplayName(
      "Test measureNames(CalculationTarget, CalculationFunctions); given HashSet() add ImmutableMeasure with name is '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ResultsRow.measureNames(CalculationTarget, CalculationFunctions)"})
  void testMeasureNames_givenHashSetAddImmutableMeasureWithNameIs42_thenReturnSizeIsTwo() {
    // Arrange
    CurveSensitivities target = CurveSensitivities.empty();

    HashSet<Measure> measureSet = new HashSet<>();
    measureSet.add(ImmutableMeasure.of("Name"));
    measureSet.add(ImmutableMeasure.of("42"));

    CalculationFunction<? super CurveSensitivities> calculationFunction =
        mock(CalculationFunction.class);
    when(calculationFunction.supportedMeasures()).thenReturn(measureSet);
    Optional<CalculationFunction<? super CurveSensitivities>> ofResult =
        Optional.of(calculationFunction);

    CalculationFunctions calculationFunctions = mock(CalculationFunctions.class);
    Mockito.<Optional<CalculationFunction<? super CurveSensitivities>>>when(
            calculationFunctions.findFunction(Mockito.<CurveSensitivities>any()))
        .thenReturn(ofResult);

    // Act
    List<String> actualMeasureNamesResult = ResultsRow.measureNames(target, calculationFunctions);

    // Assert
    verify(calculationFunction).supportedMeasures();
    verify(calculationFunctions).findFunction(isA(CurveSensitivities.class));
    assertEquals(2, actualMeasureNamesResult.size());
    assertEquals("42", actualMeasureNamesResult.get(0));
    assertEquals("Name", actualMeasureNamesResult.get(1));
  }

  /**
   * Test {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}.
   *
   * <ul>
   *   <li>Given {@link HashSet#HashSet()} add {@link ImmutableMeasure} with {@code Name}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}
   */
  @Test
  @DisplayName(
      "Test measureNames(CalculationTarget, CalculationFunctions); given HashSet() add ImmutableMeasure with 'Name'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ResultsRow.measureNames(CalculationTarget, CalculationFunctions)"})
  void testMeasureNames_givenHashSetAddImmutableMeasureWithName_thenReturnSizeIsOne() {
    // Arrange
    CurveSensitivities target = CurveSensitivities.empty();

    HashSet<Measure> measureSet = new HashSet<>();
    measureSet.add(ImmutableMeasure.of("Name"));

    CalculationFunction<? super CurveSensitivities> calculationFunction =
        mock(CalculationFunction.class);
    when(calculationFunction.supportedMeasures()).thenReturn(measureSet);
    Optional<CalculationFunction<? super CurveSensitivities>> ofResult =
        Optional.of(calculationFunction);

    CalculationFunctions calculationFunctions = mock(CalculationFunctions.class);
    Mockito.<Optional<CalculationFunction<? super CurveSensitivities>>>when(
            calculationFunctions.findFunction(Mockito.<CurveSensitivities>any()))
        .thenReturn(ofResult);

    // Act
    List<String> actualMeasureNamesResult = ResultsRow.measureNames(target, calculationFunctions);

    // Assert
    verify(calculationFunction).supportedMeasures();
    verify(calculationFunctions).findFunction(isA(CurveSensitivities.class));
    assertEquals(1, actualMeasureNamesResult.size());
    assertEquals("Name", actualMeasureNamesResult.get(0));
  }

  /**
   * Test {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}
   */
  @Test
  @DisplayName(
      "Test measureNames(CalculationTarget, CalculationFunctions); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ResultsRow.measureNames(CalculationTarget, CalculationFunctions)"})
  void testMeasureNames_givenIllegalArgumentException() {
    // Arrange
    CurveSensitivities target = CurveSensitivities.empty();

    CalculationFunctions calculationFunctions = mock(CalculationFunctions.class);
    Mockito.<Optional<CalculationFunction<? super CurveSensitivities>>>when(
            calculationFunctions.findFunction(Mockito.<CurveSensitivities>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ResultsRow.measureNames(target, calculationFunctions));
    verify(calculationFunctions).findFunction(isA(CurveSensitivities.class));
  }

  /**
   * Test {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ResultsRow#measureNames(CalculationTarget, CalculationFunctions)}
   */
  @Test
  @DisplayName("Test measureNames(CalculationTarget, CalculationFunctions); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ResultsRow.measureNames(CalculationTarget, CalculationFunctions)"})
  void testMeasureNames_thenReturnEmpty() {
    // Arrange
    CurveSensitivities target = CurveSensitivities.empty();

    CalculationFunction<? super CurveSensitivities> calculationFunction =
        mock(CalculationFunction.class);
    when(calculationFunction.supportedMeasures()).thenReturn(new HashSet<>());
    Optional<CalculationFunction<? super CurveSensitivities>> ofResult =
        Optional.of(calculationFunction);

    CalculationFunctions calculationFunctions = mock(CalculationFunctions.class);
    Mockito.<Optional<CalculationFunction<? super CurveSensitivities>>>when(
            calculationFunctions.findFunction(Mockito.<CurveSensitivities>any()))
        .thenReturn(ofResult);

    // Act
    List<String> actualMeasureNamesResult = ResultsRow.measureNames(target, calculationFunctions);

    // Assert
    verify(calculationFunction).supportedMeasures();
    verify(calculationFunctions).findFunction(isA(CurveSensitivities.class));
    assertTrue(actualMeasureNamesResult.isEmpty());
  }
}
