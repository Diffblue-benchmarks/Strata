package com.opengamma.strata.market.curve.interpolator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.interpolator.DoubleQuadraticCurveInterpolator.Bound;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DoubleQuadraticCurveInterpolatorDiffblueTest {
  /**
   * Test Bound {@link Bound#bind(BoundCurveExtrapolator, BoundCurveExtrapolator)}.
   *
   * <ul>
   *   <li>Then return {@link Bound}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#bind(BoundCurveExtrapolator, BoundCurveExtrapolator)}
   */
  @Test
  @DisplayName("Test Bound bind(BoundCurveExtrapolator, BoundCurveExtrapolator); then return Bound")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BoundCurveInterpolator Bound.bind(BoundCurveExtrapolator, BoundCurveExtrapolator)"
  })
  void testBoundBind_thenReturnBound() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act
    BoundCurveInterpolator actualBindResult =
        bound.bind(ExceptionCurveExtrapolator.INSTANCE, ExceptionCurveExtrapolator.INSTANCE);

    // Assert
    assertTrue(actualBindResult instanceof Bound);
    DoubleArray doParameterSensitivityResult =
        ((Bound) actualBindResult).doParameterSensitivity(10.0d);
    assertEquals(0.0d, doParameterSensitivityResult.min());
    List<Double> toListResult = doParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1, doParameterSensitivityResult.dimensions());
    assertEquals(1.0d, doParameterSensitivityResult.max());
    assertEquals(1.0d, doParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertEquals(3, doParameterSensitivityResult.size());
    assertFalse(doParameterSensitivityResult.isEmpty());
    assertEquals(Double.NaN, ((Bound) actualBindResult).doFirstDerivative(10.0d));
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0d}, doParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#doFirstDerivative(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#doFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test Bound doFirstDerivative(double); when '-0.5'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.doFirstDerivative(double)"})
  void testBoundDoFirstDerivative_when05_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(Double.NaN, bound.doFirstDerivative(-0.5d));
  }

  /**
   * Test Bound {@link Bound#doFirstDerivative(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#doFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test Bound doFirstDerivative(double); when ten; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.doFirstDerivative(double)"})
  void testBoundDoFirstDerivative_whenTen_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(Double.NaN, bound.doFirstDerivative(10.0d));
  }

  /**
   * Test Bound {@link Bound#doFirstDerivative(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#doFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test Bound doFirstDerivative(double); when zero; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.doFirstDerivative(double)"})
  void testBoundDoFirstDerivative_whenZero_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(Double.NaN, bound.doFirstDerivative(0.0d));
  }

  /**
   * Test Bound {@link Bound#doInterpolate(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#doInterpolate(double)}
   */
  @Test
  @DisplayName("Test Bound doInterpolate(double); when '-0.5'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.doInterpolate(double)"})
  void testBoundDoInterpolate_when05_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(Double.NaN, bound.doInterpolate(-0.5d));
  }

  /**
   * Test Bound {@link Bound#doInterpolate(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#doInterpolate(double)}
   */
  @Test
  @DisplayName("Test Bound doInterpolate(double); when zero; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.doInterpolate(double)"})
  void testBoundDoInterpolate_whenZero_thenReturnNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(Double.NaN, bound.doInterpolate(0.0d));
  }

  /**
   * Test Bound {@link Bound#doParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return min is {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#doParameterSensitivity(double)}
   */
  @Test
  @DisplayName(
      "Test Bound doParameterSensitivity(double); when '-0.5'; then return min is NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.doParameterSensitivity(double)"})
  void testBoundDoParameterSensitivity_when05_thenReturnMinIsNegative_infinity() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act
    DoubleArray actualDoParameterSensitivityResult = bound.doParameterSensitivity(-0.5d);

    // Assert
    List<Double> toListResult = actualDoParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(Double.NEGATIVE_INFINITY, actualDoParameterSensitivityResult.min());
    assertEquals(Double.NEGATIVE_INFINITY, toListResult.get(1).doubleValue());
    assertEquals(Double.POSITIVE_INFINITY, actualDoParameterSensitivityResult.max());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(0).doubleValue());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY},
        actualDoParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#doParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#doParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test Bound doParameterSensitivity(double); when ten; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.doParameterSensitivity(double)"})
  void testBoundDoParameterSensitivity_whenTen_thenReturnMinIsZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act
    DoubleArray actualDoParameterSensitivityResult = bound.doParameterSensitivity(10.0d);

    // Assert
    assertEquals(0.0d, actualDoParameterSensitivityResult.min());
    List<Double> toListResult = actualDoParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, actualDoParameterSensitivityResult.max());
    assertEquals(1.0d, actualDoParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0d}, actualDoParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#doParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return max is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#doParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test Bound doParameterSensitivity(double); when zero; then return max is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.doParameterSensitivity(double)"})
  void testBoundDoParameterSensitivity_whenZero_thenReturnMaxIsNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act
    DoubleArray actualDoParameterSensitivityResult = bound.doParameterSensitivity(0.0d);

    // Assert
    List<Double> toListResult = actualDoParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(Double.NaN, actualDoParameterSensitivityResult.max());
    assertEquals(Double.NaN, actualDoParameterSensitivityResult.min());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN},
        actualDoParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#Bound(Bound, BoundCurveExtrapolator, BoundCurveExtrapolator)}.
   *
   * <ul>
   *   <li>Then return doParameterSensitivity ten min is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#Bound(Bound, BoundCurveExtrapolator,
   * BoundCurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test Bound new Bound(Bound, BoundCurveExtrapolator, BoundCurveExtrapolator); then return doParameterSensitivity ten min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Bound.<init>(Bound, BoundCurveExtrapolator, BoundCurveExtrapolator)"})
  void testBoundNewBound_thenReturnDoParameterSensitivityTenMinIsZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound base = new Bound(xValues, DoubleArray.filled(3));

    // Act
    Bound actualBound =
        new Bound(base, ExceptionCurveExtrapolator.INSTANCE, ExceptionCurveExtrapolator.INSTANCE);

    // Assert
    DoubleArray doParameterSensitivityResult = actualBound.doParameterSensitivity(10.0d);
    assertEquals(0.0d, doParameterSensitivityResult.min());
    List<Double> toListResult = doParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1, doParameterSensitivityResult.dimensions());
    assertEquals(1.0d, doParameterSensitivityResult.max());
    assertEquals(1.0d, doParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertEquals(3, doParameterSensitivityResult.size());
    assertFalse(doParameterSensitivityResult.isEmpty());
    assertEquals(Double.NaN, actualBound.doFirstDerivative(10.0d));
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0d}, doParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#Bound(DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return doParameterSensitivity ten min is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#Bound(DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test Bound new Bound(DoubleArray, DoubleArray); when filled three; then return doParameterSensitivity ten min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Bound.<init>(DoubleArray, DoubleArray)"})
  void testBoundNewBound_whenFilledThree_thenReturnDoParameterSensitivityTenMinIsZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);

    // Act
    Bound actualBound = new Bound(xValues, DoubleArray.filled(3));

    // Assert
    DoubleArray doParameterSensitivityResult = actualBound.doParameterSensitivity(10.0d);
    assertEquals(0.0d, doParameterSensitivityResult.min());
    List<Double> toListResult = doParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1, doParameterSensitivityResult.dimensions());
    assertEquals(1.0d, doParameterSensitivityResult.max());
    assertEquals(1.0d, doParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertEquals(3, doParameterSensitivityResult.size());
    assertFalse(doParameterSensitivityResult.isEmpty());
    assertEquals(Double.NaN, actualBound.doFirstDerivative(10.0d));
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0d}, doParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }
}
