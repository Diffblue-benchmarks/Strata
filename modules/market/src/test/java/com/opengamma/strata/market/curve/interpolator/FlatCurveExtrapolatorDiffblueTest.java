package com.opengamma.strata.market.curve.interpolator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.interpolator.FlatCurveExtrapolator.Bound;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FlatCurveExtrapolatorDiffblueTest {
  /**
   * Test Bound {@link Bound#leftExtrapolateFirstDerivative(double)}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#leftExtrapolateFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test Bound leftExtrapolateFirstDerivative(double); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.leftExtrapolateFirstDerivative(double)"})
  void testBoundLeftExtrapolateFirstDerivative_thenReturnZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(0.0d, bound.leftExtrapolateFirstDerivative(10.0d));
  }

  /**
   * Test Bound {@link Bound#leftExtrapolateParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#leftExtrapolateParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test Bound leftExtrapolateParameterSensitivity(double); then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.leftExtrapolateParameterSensitivity(double)"})
  void testBoundLeftExtrapolateParameterSensitivity_thenReturnMinIsZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act
    DoubleArray actualLeftExtrapolateParameterSensitivityResult =
        bound.leftExtrapolateParameterSensitivity(10.0d);

    // Assert
    assertEquals(0.0d, actualLeftExtrapolateParameterSensitivityResult.min());
    List<Double> toListResult = actualLeftExtrapolateParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, actualLeftExtrapolateParameterSensitivityResult.dimensions());
    assertEquals(1.0d, actualLeftExtrapolateParameterSensitivityResult.max());
    assertEquals(1.0d, actualLeftExtrapolateParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(3, actualLeftExtrapolateParameterSensitivityResult.size());
    assertFalse(actualLeftExtrapolateParameterSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {1.0d, 0.0d, 0.0d},
        actualLeftExtrapolateParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#leftExtrapolate(double)}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#leftExtrapolate(double)}
   */
  @Test
  @DisplayName("Test Bound leftExtrapolate(double); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.leftExtrapolate(double)"})
  void testBoundLeftExtrapolate_thenReturnZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(0.0d, bound.leftExtrapolate(10.0d));
  }

  /**
   * Test Bound {@link Bound#Bound(DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return leftExtrapolateParameterSensitivity ten min is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#Bound(DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test Bound new Bound(DoubleArray, DoubleArray); then return leftExtrapolateParameterSensitivity ten min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Bound.<init>(DoubleArray, DoubleArray)"})
  void testBoundNewBound_thenReturnLeftExtrapolateParameterSensitivityTenMinIsZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);

    // Act
    Bound actualBound = new Bound(xValues, DoubleArray.filled(3));

    // Assert
    DoubleArray leftExtrapolateParameterSensitivityResult =
        actualBound.leftExtrapolateParameterSensitivity(10.0d);
    assertEquals(0.0d, leftExtrapolateParameterSensitivityResult.min());
    assertEquals(0.0d, actualBound.leftExtrapolate(10.0d));
    assertEquals(0.0d, actualBound.leftExtrapolateFirstDerivative(10.0d));
    assertEquals(0.0d, actualBound.rightExtrapolate(10.0d));
    assertEquals(1, leftExtrapolateParameterSensitivityResult.dimensions());
    assertEquals(1.0d, leftExtrapolateParameterSensitivityResult.max());
    assertEquals(1.0d, leftExtrapolateParameterSensitivityResult.sum());
    assertEquals(3, leftExtrapolateParameterSensitivityResult.size());
    assertEquals(3, leftExtrapolateParameterSensitivityResult.toList().size());
    assertFalse(leftExtrapolateParameterSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {1.0d, 0.0d, 0.0d},
        leftExtrapolateParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#rightExtrapolateFirstDerivative(double)}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#rightExtrapolateFirstDerivative(double)}
   */
  @Test
  @DisplayName("Test Bound rightExtrapolateFirstDerivative(double); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.rightExtrapolateFirstDerivative(double)"})
  void testBoundRightExtrapolateFirstDerivative_thenReturnZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(0.0d, bound.rightExtrapolateFirstDerivative(10.0d));
  }

  /**
   * Test Bound {@link Bound#rightExtrapolateParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#rightExtrapolateParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test Bound rightExtrapolateParameterSensitivity(double); then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.rightExtrapolateParameterSensitivity(double)"})
  void testBoundRightExtrapolateParameterSensitivity_thenReturnMinIsZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act
    DoubleArray actualRightExtrapolateParameterSensitivityResult =
        bound.rightExtrapolateParameterSensitivity(10.0d);

    // Assert
    assertEquals(0.0d, actualRightExtrapolateParameterSensitivityResult.min());
    List<Double> toListResult = actualRightExtrapolateParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1, actualRightExtrapolateParameterSensitivityResult.dimensions());
    assertEquals(1.0d, actualRightExtrapolateParameterSensitivityResult.max());
    assertEquals(1.0d, actualRightExtrapolateParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualRightExtrapolateParameterSensitivityResult.size());
    assertFalse(actualRightExtrapolateParameterSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0d},
        actualRightExtrapolateParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test Bound {@link Bound#rightExtrapolate(double)}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#rightExtrapolate(double)}
   */
  @Test
  @DisplayName("Test Bound rightExtrapolate(double); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.rightExtrapolate(double)"})
  void testBoundRightExtrapolate_thenReturnZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    Bound bound = new Bound(xValues, DoubleArray.filled(3));

    // Act and Assert
    assertEquals(0.0d, bound.rightExtrapolate(10.0d));
  }
}
