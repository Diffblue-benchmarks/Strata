package com.opengamma.strata.market.curve.interpolator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.interpolator.DoubleQuadraticCurveInterpolator.Bound;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractBoundCurveInterpolatorDiffblueTest {
  /**
   * Test {@link AbstractBoundCurveInterpolator#interpolate(double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractBoundCurveInterpolator#interpolate(double)}
   */
  @Test
  @DisplayName("Test interpolate(double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AbstractBoundCurveInterpolator.interpolate(double)"})
  void testInterpolate_whenNaN_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(Double.NaN, bound.interpolate(Double.NaN));
  }

  /**
   * Test {@link AbstractBoundCurveInterpolator#interpolate(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link AbstractBoundCurveInterpolator#interpolate(double)}
   */
  @Test
  @DisplayName("Test interpolate(double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AbstractBoundCurveInterpolator.interpolate(double)"})
  void testInterpolate_whenZero_thenReturnZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(0.0d, bound.interpolate(0.0d));
  }

  /**
   * Test {@link AbstractBoundCurveInterpolator#doInterpolateFromExtrapolator(double)}.
   *
   * <ul>
   *   <li>When {@code -0.0}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AbstractBoundCurveInterpolator#doInterpolateFromExtrapolator(double)}
   */
  @Test
  @DisplayName("Test doInterpolateFromExtrapolator(double); when '-0.0'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AbstractBoundCurveInterpolator.doInterpolateFromExtrapolator(double)"})
  void testDoInterpolateFromExtrapolator_when00_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(Double.NaN, bound.doInterpolateFromExtrapolator(-0.0d));
  }

  /**
   * Test {@link AbstractBoundCurveInterpolator#doInterpolateFromExtrapolator(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * AbstractBoundCurveInterpolator#doInterpolateFromExtrapolator(double)}
   */
  @Test
  @DisplayName("Test doInterpolateFromExtrapolator(double); when '-0.5'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AbstractBoundCurveInterpolator.doInterpolateFromExtrapolator(double)"})
  void testDoInterpolateFromExtrapolator_when05_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(Double.NaN, bound.doInterpolateFromExtrapolator(-0.5d));
  }

  /**
   * Test {@link AbstractBoundCurveInterpolator#firstDerivative(double)}.
   *
   * <ul>
   *   <li>When {@code -0.0}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractBoundCurveInterpolator#firstDerivative(double)}
   */
  @Test
  @DisplayName("Test firstDerivative(double); when '-0.0'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AbstractBoundCurveInterpolator.firstDerivative(double)"})
  void testFirstDerivative_when00_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(Double.NaN, bound.firstDerivative(-0.0d));
  }

  /**
   * Test {@link AbstractBoundCurveInterpolator#firstDerivative(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractBoundCurveInterpolator#firstDerivative(double)}
   */
  @Test
  @DisplayName("Test firstDerivative(double); when zero; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AbstractBoundCurveInterpolator.firstDerivative(double)"})
  void testFirstDerivative_whenZero_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(Double.NaN, bound.firstDerivative(0.0d));
  }

  /**
   * Test {@link AbstractBoundCurveInterpolator#parameterSensitivity(double)}.
   *
   * <ul>
   *   <li>When {@code -0.0}.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractBoundCurveInterpolator#parameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test parameterSensitivity(double); when '-0.0'; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray AbstractBoundCurveInterpolator.parameterSensitivity(double)"})
  void testParameterSensitivity_when00_thenReturnDimensionsIsOne() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act
    DoubleArray actualParameterSensitivityResult = bound.parameterSensitivity(-0.0d);

    // Assert
    assertEquals(1, actualParameterSensitivityResult.dimensions());
    assertEquals(3, actualParameterSensitivityResult.size());
    List<Double> toListResult = actualParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertFalse(actualParameterSensitivityResult.isEmpty());
    assertEquals(Double.NaN, actualParameterSensitivityResult.max());
    assertEquals(Double.NaN, actualParameterSensitivityResult.min());
    assertEquals(Double.NaN, actualParameterSensitivityResult.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN},
        actualParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link AbstractBoundCurveInterpolator#parameterSensitivity(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractBoundCurveInterpolator#parameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test parameterSensitivity(double); when zero; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray AbstractBoundCurveInterpolator.parameterSensitivity(double)"})
  void testParameterSensitivity_whenZero_thenReturnDimensionsIsOne() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act
    DoubleArray actualParameterSensitivityResult = bound.parameterSensitivity(0.0d);

    // Assert
    assertEquals(1, actualParameterSensitivityResult.dimensions());
    assertEquals(3, actualParameterSensitivityResult.size());
    List<Double> toListResult = actualParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertFalse(actualParameterSensitivityResult.isEmpty());
    assertEquals(Double.NaN, actualParameterSensitivityResult.max());
    assertEquals(Double.NaN, actualParameterSensitivityResult.min());
    assertEquals(Double.NaN, actualParameterSensitivityResult.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN},
        actualParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link AbstractBoundCurveInterpolator#lowerBoundIndex(double, double[])}.
   *
   * <ul>
   *   <li>When {@code -0.0}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractBoundCurveInterpolator#lowerBoundIndex(double, double[])}
   */
  @Test
  @DisplayName("Test lowerBoundIndex(double, double[]); when '-0.0'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractBoundCurveInterpolator.lowerBoundIndex(double, double[])"})
  void testLowerBoundIndex_when00_thenReturnOne() {
    // Arrange and Act
    int actualLowerBoundIndexResult =
        AbstractBoundCurveInterpolator.lowerBoundIndex(
            -0.0d, new double[] {10.0d, -0.0d, 10.0d, -0.0d});

    // Assert
    assertEquals(1, actualLowerBoundIndexResult);
  }

  /**
   * Test {@link AbstractBoundCurveInterpolator#lowerBoundIndex(double, double[])}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link AbstractBoundCurveInterpolator#lowerBoundIndex(double, double[])}
   */
  @Test
  @DisplayName("Test lowerBoundIndex(double, double[]); when '0.5'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractBoundCurveInterpolator.lowerBoundIndex(double, double[])"})
  void testLowerBoundIndex_when05_thenReturnOne() {
    // Arrange and Act
    int actualLowerBoundIndexResult =
        AbstractBoundCurveInterpolator.lowerBoundIndex(
            0.5d, new double[] {10.0d, -0.0d, 10.0d, -0.0d});

    // Assert
    assertEquals(1, actualLowerBoundIndexResult);
  }

  /**
   * Test {@link AbstractBoundCurveInterpolator#lowerBoundIndex(double, double[])}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link AbstractBoundCurveInterpolator#lowerBoundIndex(double, double[])}
   */
  @Test
  @DisplayName(
      "Test lowerBoundIndex(double, double[]); when empty array of double; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractBoundCurveInterpolator.lowerBoundIndex(double, double[])"})
  void testLowerBoundIndex_whenEmptyArrayOfDouble_thenReturnZero() {
    // Arrange and Act
    int actualLowerBoundIndexResult =
        AbstractBoundCurveInterpolator.lowerBoundIndex(10.0d, new double[] {});

    // Assert
    assertEquals(0, actualLowerBoundIndexResult);
  }

  /**
   * Test {@link AbstractBoundCurveInterpolator#lowerBoundIndex(double, double[])}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link AbstractBoundCurveInterpolator#lowerBoundIndex(double, double[])}
   */
  @Test
  @DisplayName("Test lowerBoundIndex(double, double[]); when ten; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int AbstractBoundCurveInterpolator.lowerBoundIndex(double, double[])"})
  void testLowerBoundIndex_whenTen_thenReturnTwo() {
    // Arrange and Act
    int actualLowerBoundIndexResult =
        AbstractBoundCurveInterpolator.lowerBoundIndex(
            10.0d, new double[] {10.0d, -0.0d, 10.0d, -0.0d});

    // Assert
    assertEquals(2, actualLowerBoundIndexResult);
  }
}
