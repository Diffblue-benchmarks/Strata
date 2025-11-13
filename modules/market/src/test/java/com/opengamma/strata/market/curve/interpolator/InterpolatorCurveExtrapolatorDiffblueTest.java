package com.opengamma.strata.market.curve.interpolator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.interpolator.InterpolatorCurveExtrapolator.Bound;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InterpolatorCurveExtrapolatorDiffblueTest {
  /**
   * Test Bound {@link Bound#leftExtrapolateFirstDerivative(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#leftExtrapolateFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test Bound leftExtrapolateFirstDerivative(double); when '-0.5'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.leftExtrapolateFirstDerivative(double)"})
  void testBoundLeftExtrapolateFirstDerivative_when05_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act and Assert
    assertEquals(Double.NaN, bound.leftExtrapolateFirstDerivative(-0.5d));
  }

  /**
   * Test Bound {@link Bound#leftExtrapolateFirstDerivative(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#leftExtrapolateFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test Bound leftExtrapolateFirstDerivative(double); when ten; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.leftExtrapolateFirstDerivative(double)"})
  void testBoundLeftExtrapolateFirstDerivative_whenTen_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act and Assert
    assertEquals(Double.NaN, bound.leftExtrapolateFirstDerivative(10.0d));
  }

  /**
   * Test Bound {@link Bound#leftExtrapolateFirstDerivative(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#leftExtrapolateFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test Bound leftExtrapolateFirstDerivative(double); when zero; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.leftExtrapolateFirstDerivative(double)"})
  void testBoundLeftExtrapolateFirstDerivative_whenZero_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act and Assert
    assertEquals(Double.NaN, bound.leftExtrapolateFirstDerivative(0.0d));
  }

  /**
   * Test Bound {@link Bound#leftExtrapolateParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>Then return min is {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#leftExtrapolateParameterSensitivity(double)}
   */
  @Test
  @DisplayName(
      "Test Bound leftExtrapolateParameterSensitivity(double); then return min is NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.leftExtrapolateParameterSensitivity(double)"})
  void testBoundLeftExtrapolateParameterSensitivity_thenReturnMinIsNegative_infinity() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act
    DoubleArray actualLeftExtrapolateParameterSensitivityResult =
        bound.leftExtrapolateParameterSensitivity(-0.5d);

    // Assert
    List<Double> toListResult = actualLeftExtrapolateParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(Double.NEGATIVE_INFINITY, actualLeftExtrapolateParameterSensitivityResult.min());
    assertEquals(Double.NEGATIVE_INFINITY, toListResult.get(1).doubleValue());
    assertEquals(Double.POSITIVE_INFINITY, actualLeftExtrapolateParameterSensitivityResult.max());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(0).doubleValue());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY},
        actualLeftExtrapolateParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#leftExtrapolateParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#leftExtrapolateParameterSensitivity(double)}
   */
  @Test
  @DisplayName(
      "Test Bound leftExtrapolateParameterSensitivity(double); when ten; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.leftExtrapolateParameterSensitivity(double)"})
  void testBoundLeftExtrapolateParameterSensitivity_whenTen_thenReturnMinIsZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act
    DoubleArray actualLeftExtrapolateParameterSensitivityResult =
        bound.leftExtrapolateParameterSensitivity(10.0d);

    // Assert
    assertEquals(0.0d, actualLeftExtrapolateParameterSensitivityResult.min());
    List<Double> toListResult = actualLeftExtrapolateParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, actualLeftExtrapolateParameterSensitivityResult.max());
    assertEquals(1.0d, actualLeftExtrapolateParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0d},
        actualLeftExtrapolateParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#leftExtrapolateParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return max is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#leftExtrapolateParameterSensitivity(double)}
   */
  @Test
  @DisplayName(
      "Test Bound leftExtrapolateParameterSensitivity(double); when zero; then return max is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.leftExtrapolateParameterSensitivity(double)"})
  void testBoundLeftExtrapolateParameterSensitivity_whenZero_thenReturnMaxIsNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act
    DoubleArray actualLeftExtrapolateParameterSensitivityResult =
        bound.leftExtrapolateParameterSensitivity(0.0d);

    // Assert
    List<Double> toListResult = actualLeftExtrapolateParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(Double.NaN, actualLeftExtrapolateParameterSensitivityResult.max());
    assertEquals(Double.NaN, actualLeftExtrapolateParameterSensitivityResult.min());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN},
        actualLeftExtrapolateParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#leftExtrapolate(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#leftExtrapolate(double)}
   */
  @Test
  @DisplayName("Test Bound leftExtrapolate(double); when '-0.5'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.leftExtrapolate(double)"})
  void testBoundLeftExtrapolate_when05_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act and Assert
    assertEquals(Double.NaN, bound.leftExtrapolate(-0.5d));
  }

  /**
   * Test Bound {@link Bound#leftExtrapolate(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#leftExtrapolate(double)}
   */
  @Test
  @DisplayName("Test Bound leftExtrapolate(double); when zero; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.leftExtrapolate(double)"})
  void testBoundLeftExtrapolate_whenZero_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act and Assert
    assertEquals(Double.NaN, bound.leftExtrapolate(0.0d));
  }

  /**
   * Test Bound {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}.
   *
   * <ul>
   *   <li>Then return leftExtrapolateParameterSensitivity ten min is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Bound new Bound(DoubleArray, DoubleArray, BoundCurveInterpolator); then return leftExtrapolateParameterSensitivity ten min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Bound.<init>(DoubleArray, DoubleArray, BoundCurveInterpolator)"})
  void testBoundNewBound_thenReturnLeftExtrapolateParameterSensitivityTenMinIsZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    // Act
    Bound actualBound = new Bound(xValues, yValues, interpolator);

    // Assert
    DoubleArray leftExtrapolateParameterSensitivityResult =
        actualBound.leftExtrapolateParameterSensitivity(10.0d);
    assertEquals(0.0d, leftExtrapolateParameterSensitivityResult.min());
    List<Double> toListResult = leftExtrapolateParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1, leftExtrapolateParameterSensitivityResult.dimensions());
    assertEquals(1.0d, leftExtrapolateParameterSensitivityResult.max());
    assertEquals(1.0d, leftExtrapolateParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertEquals(3, leftExtrapolateParameterSensitivityResult.size());
    assertFalse(leftExtrapolateParameterSensitivityResult.isEmpty());
    assertEquals(Double.NaN, actualBound.leftExtrapolateFirstDerivative(10.0d));
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0d},
        leftExtrapolateParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#rightExtrapolateFirstDerivative(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#rightExtrapolateFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test Bound rightExtrapolateFirstDerivative(double); when '-0.5'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.rightExtrapolateFirstDerivative(double)"})
  void testBoundRightExtrapolateFirstDerivative_when05_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act and Assert
    assertEquals(Double.NaN, bound.rightExtrapolateFirstDerivative(-0.5d));
  }

  /**
   * Test Bound {@link Bound#rightExtrapolateFirstDerivative(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#rightExtrapolateFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test Bound rightExtrapolateFirstDerivative(double); when ten; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.rightExtrapolateFirstDerivative(double)"})
  void testBoundRightExtrapolateFirstDerivative_whenTen_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act and Assert
    assertEquals(Double.NaN, bound.rightExtrapolateFirstDerivative(10.0d));
  }

  /**
   * Test Bound {@link Bound#rightExtrapolateFirstDerivative(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#rightExtrapolateFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test Bound rightExtrapolateFirstDerivative(double); when zero; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.rightExtrapolateFirstDerivative(double)"})
  void testBoundRightExtrapolateFirstDerivative_whenZero_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act and Assert
    assertEquals(Double.NaN, bound.rightExtrapolateFirstDerivative(0.0d));
  }

  /**
   * Test Bound {@link Bound#rightExtrapolateParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>Then return min is {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#rightExtrapolateParameterSensitivity(double)}
   */
  @Test
  @DisplayName(
      "Test Bound rightExtrapolateParameterSensitivity(double); then return min is NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.rightExtrapolateParameterSensitivity(double)"})
  void testBoundRightExtrapolateParameterSensitivity_thenReturnMinIsNegative_infinity() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act
    DoubleArray actualRightExtrapolateParameterSensitivityResult =
        bound.rightExtrapolateParameterSensitivity(-0.5d);

    // Assert
    List<Double> toListResult = actualRightExtrapolateParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(Double.NEGATIVE_INFINITY, actualRightExtrapolateParameterSensitivityResult.min());
    assertEquals(Double.NEGATIVE_INFINITY, toListResult.get(1).doubleValue());
    assertEquals(Double.POSITIVE_INFINITY, actualRightExtrapolateParameterSensitivityResult.max());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(0).doubleValue());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY},
        actualRightExtrapolateParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#rightExtrapolateParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#rightExtrapolateParameterSensitivity(double)}
   */
  @Test
  @DisplayName(
      "Test Bound rightExtrapolateParameterSensitivity(double); when ten; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.rightExtrapolateParameterSensitivity(double)"})
  void testBoundRightExtrapolateParameterSensitivity_whenTen_thenReturnMinIsZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act
    DoubleArray actualRightExtrapolateParameterSensitivityResult =
        bound.rightExtrapolateParameterSensitivity(10.0d);

    // Assert
    assertEquals(0.0d, actualRightExtrapolateParameterSensitivityResult.min());
    List<Double> toListResult = actualRightExtrapolateParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, actualRightExtrapolateParameterSensitivityResult.max());
    assertEquals(1.0d, actualRightExtrapolateParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0d},
        actualRightExtrapolateParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#rightExtrapolateParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return max is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#rightExtrapolateParameterSensitivity(double)}
   */
  @Test
  @DisplayName(
      "Test Bound rightExtrapolateParameterSensitivity(double); when zero; then return max is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.rightExtrapolateParameterSensitivity(double)"})
  void testBoundRightExtrapolateParameterSensitivity_whenZero_thenReturnMaxIsNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act
    DoubleArray actualRightExtrapolateParameterSensitivityResult =
        bound.rightExtrapolateParameterSensitivity(0.0d);

    // Assert
    List<Double> toListResult = actualRightExtrapolateParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(Double.NaN, actualRightExtrapolateParameterSensitivityResult.max());
    assertEquals(Double.NaN, actualRightExtrapolateParameterSensitivityResult.min());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN},
        actualRightExtrapolateParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#rightExtrapolate(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#rightExtrapolate(double)}
   */
  @Test
  @DisplayName("Test Bound rightExtrapolate(double); when '-0.5'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.rightExtrapolate(double)"})
  void testBoundRightExtrapolate_when05_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act and Assert
    assertEquals(Double.NaN, bound.rightExtrapolate(-0.5d));
  }

  /**
   * Test Bound {@link Bound#rightExtrapolate(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#rightExtrapolate(double)}
   */
  @Test
  @DisplayName("Test Bound rightExtrapolate(double); when zero; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.rightExtrapolate(double)"})
  void testBoundRightExtrapolate_whenZero_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray xValues2 = DoubleArray.filled(3);
    DoubleQuadraticCurveInterpolator.Bound interpolator =
        new DoubleQuadraticCurveInterpolator.Bound(xValues2, DoubleArray.filled(3));

    Bound bound = new Bound(xValues, yValues, interpolator);

    // Act and Assert
    assertEquals(Double.NaN, bound.rightExtrapolate(0.0d));
  }
}
