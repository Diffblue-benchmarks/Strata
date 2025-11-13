package com.opengamma.strata.math.impl.function;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.interpolation.PiecewisePolynomialResult;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PiecewisePolynomialFunction1DDiffblueTest {
  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double)} with
   * {@code PiecewisePolynomialResult}, {@code double}.
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double) with 'PiecewisePolynomialResult', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.evaluate(pp, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double)} with
   * {@code PiecewisePolynomialResult}, {@code double}.
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double) with 'PiecewisePolynomialResult', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble2() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(Double.NaN);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.evaluate(pp, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double)} with
   * {@code PiecewisePolynomialResult}, {@code double}.
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double) with 'PiecewisePolynomialResult', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble3() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(Double.NaN);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.evaluate(pp, -0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double[])} with
   * {@code PiecewisePolynomialResult}, {@code double[]}.
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double[]) with 'PiecewisePolynomialResult', 'double[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double[])"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble4() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 0);

    // Act
    DoubleMatrix actualEvaluateResult =
        piecewisePolynomialFunction1D.evaluate(pp, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualEvaluateResult);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double[][])} with
   * {@code PiecewisePolynomialResult}, {@code double[][]}.
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double[][]) with 'PiecewisePolynomialResult', 'double[][]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double[][])"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble5() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    DoubleMatrix[] actualEvaluateResult =
        piecewisePolynomialFunction1D.evaluate(
            pp, new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}});

    // Assert
    DoubleMatrix doubleMatrix = actualEvaluateResult[0];
    double[][] toArrayUnsafeResult = doubleMatrix.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1, actualEvaluateResult.length);
    assertEquals(21.0d, doubleMatrix.total());
    assertEquals(4, doubleMatrix.size());
    assertFalse(doubleMatrix.isEmpty());
    assertFalse(doubleMatrix.isSquare());
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double[][])} with
   * {@code PiecewisePolynomialResult}, {@code double[][]}.
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double[][]) with 'PiecewisePolynomialResult', 'double[][]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double[][])"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble6() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    DoubleMatrix[] actualEvaluateResult =
        piecewisePolynomialFunction1D.evaluate(
            pp, new double[][] {new double[] {-0.5d, 0.5d, 10.0d, 0.5d}});

    // Assert
    DoubleMatrix doubleMatrix = actualEvaluateResult[0];
    double[][] toArrayUnsafeResult = doubleMatrix.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1, actualEvaluateResult.length);
    assertEquals(11.25d, doubleMatrix.total());
    assertEquals(4, doubleMatrix.size());
    assertFalse(doubleMatrix.isEmpty());
    assertFalse(doubleMatrix.isSquare());
    assertArrayEquals(new double[] {0.25d, 0.5d, 10.0d, 0.5d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double[][])} with
   * {@code PiecewisePolynomialResult}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double[][]) with 'PiecewisePolynomialResult', 'double[][]'; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double[][])"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble_thenReturnArrayLengthIsZero() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 0);

    // Act and Assert
    assertEquals(
        0,
        piecewisePolynomialFunction1D.evaluate(
                pp, new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}})
            .length);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double[][])} with
   * {@code PiecewisePolynomialResult}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return first element is {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double[][]) with 'PiecewisePolynomialResult', 'double[][]'; then return first element is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double[][])"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble_thenReturnFirstElementIsEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1);

    // Act
    DoubleMatrix[] actualEvaluateResult =
        piecewisePolynomialFunction1D.evaluate(pp, new double[][] {new double[] {}});

    // Assert
    assertEquals(1, actualEvaluateResult.length);
    assertSame(DoubleMatrix.EMPTY, actualEvaluateResult[0]);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double)} with
   * {@code PiecewisePolynomialResult}, {@code double}.
   *
   * <ul>
   *   <li>Then return max is ten.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double) with 'PiecewisePolynomialResult', 'double'; then return max is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble_thenReturnMaxIsTen() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    DoubleArray actualEvaluateResult = piecewisePolynomialFunction1D.evaluate(pp, 10.0d);

    // Assert
    List<Double> toListResult = actualEvaluateResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(10.0d, actualEvaluateResult.max());
    assertEquals(10.0d, actualEvaluateResult.min());
    assertEquals(10.0d, actualEvaluateResult.sum());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {10.0d}, actualEvaluateResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double)} with
   * {@code PiecewisePolynomialResult}, {@code double}.
   *
   * <ul>
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double) with 'PiecewisePolynomialResult', 'double'; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble_thenReturnMaxIsZero() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    DoubleArray actualEvaluateResult = piecewisePolynomialFunction1D.evaluate(pp, -0.0d);

    // Assert
    assertEquals(0.0d, actualEvaluateResult.max());
    assertEquals(0.0d, actualEvaluateResult.min());
    List<Double> toListResult = actualEvaluateResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0d}, actualEvaluateResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double)} with
   * {@code PiecewisePolynomialResult}, {@code double}.
   *
   * <ul>
   *   <li>Then return toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double) with 'PiecewisePolynomialResult', 'double'; then return toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble_thenReturnToListSizeIsTwo() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 2);

    // Act
    DoubleArray actualEvaluateResult = piecewisePolynomialFunction1D.evaluate(pp, -0.0d);

    // Assert
    List<Double> toListResult = actualEvaluateResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(2, actualEvaluateResult.size());
    assertArrayEquals(new double[] {0.0d, 0.0d}, actualEvaluateResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double[])} with
   * {@code PiecewisePolynomialResult}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return total is {@code 11.25}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double[]) with 'PiecewisePolynomialResult', 'double[]'; then return total is '11.25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double[])"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble_thenReturnTotalIs1125() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    DoubleMatrix actualEvaluateResult =
        piecewisePolynomialFunction1D.evaluate(pp, new double[] {-0.5d, 0.5d, 10.0d, 0.5d});

    // Assert
    double[][] toArrayUnsafeResult = actualEvaluateResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(11.25d, actualEvaluateResult.total());
    assertEquals(4, actualEvaluateResult.size());
    assertFalse(actualEvaluateResult.isEmpty());
    assertFalse(actualEvaluateResult.isSquare());
    assertArrayEquals(new double[] {0.25d, 0.5d, 10.0d, 0.5d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double[])} with
   * {@code PiecewisePolynomialResult}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return total is twenty-one.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double[]) with 'PiecewisePolynomialResult', 'double[]'; then return total is twenty-one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double[])"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble_thenReturnTotalIsTwentyOne() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    DoubleMatrix actualEvaluateResult =
        piecewisePolynomialFunction1D.evaluate(pp, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    double[][] toArrayUnsafeResult = actualEvaluateResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(21.0d, actualEvaluateResult.total());
    assertEquals(4, actualEvaluateResult.size());
    assertFalse(actualEvaluateResult.isEmpty());
    assertFalse(actualEvaluateResult.isSquare());
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double)} with
   * {@code PiecewisePolynomialResult}, {@code double}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return max is {@code 0.25}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double) with 'PiecewisePolynomialResult', 'double'; when '-0.5'; then return max is '0.25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble_when05_thenReturnMaxIs025() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    DoubleArray actualEvaluateResult = piecewisePolynomialFunction1D.evaluate(pp, -0.5d);

    // Assert
    assertEquals(0.25d, actualEvaluateResult.max());
    assertEquals(0.25d, actualEvaluateResult.min());
    assertEquals(0.25d, actualEvaluateResult.sum());
    List<Double> toListResult = actualEvaluateResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.25d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {0.25d}, actualEvaluateResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double)} with
   * {@code PiecewisePolynomialResult}, {@code double}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double) with 'PiecewisePolynomialResult', 'double'; when DoubleArray with value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble_whenDoubleArrayWithValueIsTen() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(10.0d);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.evaluate(pp, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double[])} with
   * {@code PiecewisePolynomialResult}, {@code double[]}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double[]) with 'PiecewisePolynomialResult', 'double[]'; when empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double[])"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble_whenEmptyArrayOfDouble() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1);

    // Act
    DoubleMatrix actualEvaluateResult = piecewisePolynomialFunction1D.evaluate(pp, new double[] {});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualEvaluateResult);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult, double)} with
   * {@code PiecewisePolynomialResult}, {@code double}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#evaluate(PiecewisePolynomialResult,
   * double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult, double) with 'PiecewisePolynomialResult', 'double'; when zero; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.evaluate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateWithPiecewisePolynomialResultDouble_whenZero_thenReturnMaxIsZero() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    DoubleArray actualEvaluateResult = piecewisePolynomialFunction1D.evaluate(pp, 0.0d);

    // Assert
    assertEquals(0.0d, actualEvaluateResult.max());
    assertEquals(0.0d, actualEvaluateResult.min());
    List<Double> toListResult = actualEvaluateResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0d}, actualEvaluateResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   * with {@code pp}, {@code xKey}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName("Test differentiate(PiecewisePolynomialResult, double) with 'pp', 'xKey'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiate(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateWithPpXKey() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 2, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiate(pp, -0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   * with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiate(PiecewisePolynomialResult, double) with 'pp', 'xKey'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiate(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateWithPpXKey_thenReturnSizeIsOne() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 2, 1);

    // Act
    DoubleArray actualDifferentiateResult = piecewisePolynomialFunction1D.differentiate(pp, -0.0d);

    // Assert
    assertEquals(1, actualDifferentiateResult.size());
    List<Double> toListResult = actualDifferentiateResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, actualDifferentiateResult.max());
    assertEquals(1.0d, actualDifferentiateResult.min());
    assertEquals(1.0d, actualDifferentiateResult.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertFalse(actualDifferentiateResult.isEmpty());
    assertArrayEquals(new double[] {1.0d}, actualDifferentiateResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   * with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is {@code -0.0}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiate(PiecewisePolynomialResult, double) with 'pp', 'xKey'; when DoubleArray with value is '-0.0'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiate(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateWithPpXKey_whenDoubleArrayWithValueIs00_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(-0.0d);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 2, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiate(pp, -0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   * with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is {@code -0.5}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiate(PiecewisePolynomialResult, double) with 'pp', 'xKey'; when DoubleArray with value is '-0.5'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiate(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateWithPpXKey_whenDoubleArrayWithValueIs05_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(-0.5d);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 2, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiate(pp, -0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   * with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is {@link Double#NaN}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiate(PiecewisePolynomialResult, double) with 'pp', 'xKey'; when DoubleArray with value is NaN; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiate(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateWithPpXKey_whenDoubleArrayWithValueIsNaN_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(Double.NaN);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 2, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiate(pp, -0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   * with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiate(PiecewisePolynomialResult, double) with 'pp', 'xKey'; when DoubleArray with value is ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiate(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateWithPpXKey_whenDoubleArrayWithValueIsTen_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(10.0d);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 2, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiate(pp, -0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   * with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiate(PiecewisePolynomialResult, double) with 'pp', 'xKey'; when ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiate(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateWithPpXKey_whenTen_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(Double.NaN);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 2, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiate(pp, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double[])}
   * with {@code pp}, {@code xKeys}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double[])}
   */
  @Test
  @DisplayName("Test differentiate(PiecewisePolynomialResult, double[]) with 'pp', 'xKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.differentiate(PiecewisePolynomialResult, double[])"
  })
  void testDifferentiateWithPpXKeys() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 2, 0);

    // Act
    DoubleMatrix actualDifferentiateResult =
        piecewisePolynomialFunction1D.differentiate(pp, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateResult);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double[])}
   * with {@code pp}, {@code xKeys}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double[])}
   */
  @Test
  @DisplayName("Test differentiate(PiecewisePolynomialResult, double[]) with 'pp', 'xKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.differentiate(PiecewisePolynomialResult, double[])"
  })
  void testDifferentiateWithPpXKeys2() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 2, 1);

    // Act
    DoubleMatrix actualDifferentiateResult =
        piecewisePolynomialFunction1D.differentiate(pp, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    double[][] toArrayUnsafeResult = actualDifferentiateResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(4, actualDifferentiateResult.size());
    assertFalse(actualDifferentiateResult.isEmpty());
    assertFalse(actualDifferentiateResult.isSquare());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double[])}
   * with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>When array of {@code double} with {@code -0.5} and {@code 0.5}.
   *   <li>Then return total is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double[])}
   */
  @Test
  @DisplayName(
      "Test differentiate(PiecewisePolynomialResult, double[]) with 'pp', 'xKeys'; when array of double with '-0.5' and '0.5'; then return total is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.differentiate(PiecewisePolynomialResult, double[])"
  })
  void testDifferentiateWithPpXKeys_whenArrayOfDoubleWith05And05_thenReturnTotalIsOne() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 2, 1);

    // Act
    DoubleMatrix actualDifferentiateResult =
        piecewisePolynomialFunction1D.differentiate(pp, new double[] {-0.5d, 0.5d, 10.0d, 0.5d});

    // Assert
    double[][] toArrayUnsafeResult = actualDifferentiateResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, actualDifferentiateResult.total());
    assertEquals(4, actualDifferentiateResult.size());
    assertFalse(actualDifferentiateResult.isEmpty());
    assertFalse(actualDifferentiateResult.isSquare());
    assertArrayEquals(new double[] {1.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double[])}
   * with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiate(PiecewisePolynomialResult, double[])}
   */
  @Test
  @DisplayName(
      "Test differentiate(PiecewisePolynomialResult, double[]) with 'pp', 'xKeys'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.differentiate(PiecewisePolynomialResult, double[])"
  })
  void testDifferentiateWithPpXKeys_whenEmptyArrayOfDouble_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(10.0d);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 2, 1);

    // Act
    DoubleMatrix actualDifferentiateResult =
        piecewisePolynomialFunction1D.differentiate(pp, new double[] {});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateResult);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName("Test differentiateTwice(PiecewisePolynomialResult, double) with 'pp', 'xKey'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiateTwice(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateTwiceWithPpXKey() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 3, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiateTwice(pp, -0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiateTwice(PiecewisePolynomialResult, double) with 'pp', 'xKey'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiateTwice(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateTwiceWithPpXKey_thenReturnSizeIsOne() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 3, 1);

    // Act
    DoubleArray actualDifferentiateTwiceResult =
        piecewisePolynomialFunction1D.differentiateTwice(pp, -0.0d);

    // Assert
    assertEquals(1, actualDifferentiateTwiceResult.size());
    List<Double> toListResult = actualDifferentiateTwiceResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(2.0d, actualDifferentiateTwiceResult.max());
    assertEquals(2.0d, actualDifferentiateTwiceResult.min());
    assertEquals(2.0d, actualDifferentiateTwiceResult.sum());
    assertEquals(2.0d, toListResult.get(0).doubleValue());
    assertFalse(actualDifferentiateTwiceResult.isEmpty());
    assertArrayEquals(new double[] {2.0d}, actualDifferentiateTwiceResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is {@code -0.0}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiateTwice(PiecewisePolynomialResult, double) with 'pp', 'xKey'; when DoubleArray with value is '-0.0'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiateTwice(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateTwiceWithPpXKey_whenDoubleArrayWithValueIs00_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(-0.0d);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 3, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiateTwice(pp, -0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is {@code -0.5}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiateTwice(PiecewisePolynomialResult, double) with 'pp', 'xKey'; when DoubleArray with value is '-0.5'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiateTwice(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateTwiceWithPpXKey_whenDoubleArrayWithValueIs05_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(-0.5d);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 3, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiateTwice(pp, -0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is {@link Double#NaN}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiateTwice(PiecewisePolynomialResult, double) with 'pp', 'xKey'; when DoubleArray with value is NaN; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiateTwice(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateTwiceWithPpXKey_whenDoubleArrayWithValueIsNaN_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(Double.NaN);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 3, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiateTwice(pp, -0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiateTwice(PiecewisePolynomialResult, double) with 'pp', 'xKey'; when DoubleArray with value is ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiateTwice(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateTwiceWithPpXKey_whenDoubleArrayWithValueIsTen_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(10.0d);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 3, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiateTwice(pp, -0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test differentiateTwice(PiecewisePolynomialResult, double) with 'pp', 'xKey'; when ten; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.differentiateTwice(PiecewisePolynomialResult, double)"
  })
  void testDifferentiateTwiceWithPpXKey_whenTen_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(Double.NaN);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 3, 0);

    // Act and Assert
    assertSame(DoubleArray.EMPTY, piecewisePolynomialFunction1D.differentiateTwice(pp, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult, double[])}
   */
  @Test
  @DisplayName("Test differentiateTwice(PiecewisePolynomialResult, double[]) with 'pp', 'xKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.differentiateTwice(PiecewisePolynomialResult, double[])"
  })
  void testDifferentiateTwiceWithPpXKeys() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 3, 0);

    // Act
    DoubleMatrix actualDifferentiateTwiceResult =
        piecewisePolynomialFunction1D.differentiateTwice(
            pp, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateTwiceResult);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult, double[])}
   */
  @Test
  @DisplayName("Test differentiateTwice(PiecewisePolynomialResult, double[]) with 'pp', 'xKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.differentiateTwice(PiecewisePolynomialResult, double[])"
  })
  void testDifferentiateTwiceWithPpXKeys2() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 3, 1);

    // Act
    DoubleMatrix actualDifferentiateTwiceResult =
        piecewisePolynomialFunction1D.differentiateTwice(
            pp, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    double[][] toArrayUnsafeResult = actualDifferentiateTwiceResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(4, actualDifferentiateTwiceResult.size());
    assertFalse(actualDifferentiateTwiceResult.isEmpty());
    assertFalse(actualDifferentiateTwiceResult.isSquare());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return total is two.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult, double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwice(PiecewisePolynomialResult, double[]) with 'pp', 'xKeys'; then return total is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.differentiateTwice(PiecewisePolynomialResult, double[])"
  })
  void testDifferentiateTwiceWithPpXKeys_thenReturnTotalIsTwo() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 3, 1);

    // Act
    DoubleMatrix actualDifferentiateTwiceResult =
        piecewisePolynomialFunction1D.differentiateTwice(
            pp, new double[] {-0.5d, 0.5d, 10.0d, 0.5d});

    // Assert
    double[][] toArrayUnsafeResult = actualDifferentiateTwiceResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(2.0d, actualDifferentiateTwiceResult.total());
    assertEquals(4, actualDifferentiateTwiceResult.size());
    assertFalse(actualDifferentiateTwiceResult.isEmpty());
    assertFalse(actualDifferentiateTwiceResult.isSquare());
    assertArrayEquals(new double[] {2.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#differentiateTwice(PiecewisePolynomialResult, double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwice(PiecewisePolynomialResult, double[]) with 'pp', 'xKeys'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction1D.differentiateTwice(PiecewisePolynomialResult, double[])"
  })
  void testDifferentiateTwiceWithPpXKeys_whenEmptyArrayOfDouble_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.of(10.0d);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 3, 1);

    // Act
    DoubleMatrix actualDifferentiateTwiceResult =
        piecewisePolynomialFunction1D.differentiateTwice(pp, new double[] {});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateTwiceResult);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult, double, double)}
   * with {@code pp}, {@code initialKey}, {@code xKey}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test integrate(PiecewisePolynomialResult, double, double) with 'pp', 'initialKey', 'xKey'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialFunction1D.integrate(PiecewisePolynomialResult, double, double)"
  })
  void testIntegrateWithPpInitialKeyXKey_thenReturnZero() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act and Assert
    assertEquals(0.0d, piecewisePolynomialFunction1D.integrate(pp, 10.0d, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult, double, double)}
   * with {@code pp}, {@code initialKey}, {@code xKey}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test integrate(PiecewisePolynomialResult, double, double) with 'pp', 'initialKey', 'xKey'; when '-0.5'; then return '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialFunction1D.integrate(PiecewisePolynomialResult, double, double)"
  })
  void testIntegrateWithPpInitialKeyXKey_when05_thenReturn05() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act and Assert
    assertEquals(-0.5d, piecewisePolynomialFunction1D.integrate(pp, 10.0d, -0.5d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult, double, double)}
   * with {@code pp}, {@code initialKey}, {@code xKey}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test integrate(PiecewisePolynomialResult, double, double) with 'pp', 'initialKey', 'xKey'; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialFunction1D.integrate(PiecewisePolynomialResult, double, double)"
  })
  void testIntegrateWithPpInitialKeyXKey_whenZero_thenReturnZero() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act and Assert
    assertEquals(0.0d, piecewisePolynomialFunction1D.integrate(pp, 0.0d, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult, double, double)}
   * with {@code pp}, {@code initialKey}, {@code xKey}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test integrate(PiecewisePolynomialResult, double, double) with 'pp', 'initialKey', 'xKey'; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialFunction1D.integrate(PiecewisePolynomialResult, double, double)"
  })
  void testIntegrateWithPpInitialKeyXKey_whenZero_thenReturnZero2() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act and Assert
    assertEquals(0.0d, piecewisePolynomialFunction1D.integrate(pp, 10.0d, 0.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult, double,
   * double[])} with {@code pp}, {@code initialKey}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return min is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult,
   * double, double[])}
   */
  @Test
  @DisplayName(
      "Test integrate(PiecewisePolynomialResult, double, double[]) with 'pp', 'initialKey', 'xKeys'; then return min is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.integrate(PiecewisePolynomialResult, double, double[])"
  })
  void testIntegrateWithPpInitialKeyXKeys_thenReturnMinIs05() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    DoubleArray actualIntegrateResult =
        piecewisePolynomialFunction1D.integrate(pp, 10.0d, new double[] {-0.5d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(-0.5d, actualIntegrateResult.min());
    assertEquals(-0.5d, actualIntegrateResult.sum());
    List<Double> toListResult = actualIntegrateResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.5d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {-0.5d, 0.0d, 0.0d, 0.0d}, actualIntegrateResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult, double,
   * double[])} with {@code pp}, {@code initialKey}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult,
   * double, double[])}
   */
  @Test
  @DisplayName(
      "Test integrate(PiecewisePolynomialResult, double, double[]) with 'pp', 'initialKey', 'xKeys'; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.integrate(PiecewisePolynomialResult, double, double[])"
  })
  void testIntegrateWithPpInitialKeyXKeys_thenReturnMinIsZero() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    DoubleArray actualIntegrateResult =
        piecewisePolynomialFunction1D.integrate(pp, 10.0d, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(0.0d, actualIntegrateResult.min());
    assertEquals(0.0d, actualIntegrateResult.sum());
    List<Double> toListResult = actualIntegrateResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d}, actualIntegrateResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult, double,
   * double[])} with {@code pp}, {@code initialKey}, {@code xKeys}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#integrate(PiecewisePolynomialResult,
   * double, double[])}
   */
  @Test
  @DisplayName(
      "Test integrate(PiecewisePolynomialResult, double, double[]) with 'pp', 'initialKey', 'xKeys'; when zero; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialFunction1D.integrate(PiecewisePolynomialResult, double, double[])"
  })
  void testIntegrateWithPpInitialKeyXKeys_whenZero_thenReturnMinIsZero() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    DoubleArray actualIntegrateResult =
        piecewisePolynomialFunction1D.integrate(pp, 0.0d, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(0.0d, actualIntegrateResult.min());
    assertEquals(0.0d, actualIntegrateResult.sum());
    List<Double> toListResult = actualIntegrateResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d}, actualIntegrateResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult,
   * double)}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName("Test evaluateAndDifferentiate(PiecewisePolynomialResult, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives PiecewisePolynomialFunction1D.evaluateAndDifferentiate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateAndDifferentiate() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 0);

    // Act
    ValueDerivatives actualEvaluateAndDifferentiateResult =
        piecewisePolynomialFunction1D.evaluateAndDifferentiate(pp, 10.0d);

    // Assert
    DoubleArray derivatives = actualEvaluateAndDifferentiateResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, derivatives.max());
    assertEquals(1.0d, derivatives.min());
    assertEquals(1.0d, derivatives.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, actualEvaluateAndDifferentiateResult.getValue());
    assertArrayEquals(new double[] {1.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult,
   * double)}.
   *
   * <ul>
   *   <li>Then return Value is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test evaluateAndDifferentiate(PiecewisePolynomialResult, double); then return Value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives PiecewisePolynomialFunction1D.evaluateAndDifferentiate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateAndDifferentiate_thenReturnValueIsTen() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    ValueDerivatives actualEvaluateAndDifferentiateResult =
        piecewisePolynomialFunction1D.evaluateAndDifferentiate(pp, 10.0d);

    // Assert
    DoubleArray derivatives = actualEvaluateAndDifferentiateResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, derivatives.max());
    assertEquals(1.0d, derivatives.min());
    assertEquals(1.0d, derivatives.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, actualEvaluateAndDifferentiateResult.getValue());
    assertArrayEquals(new double[] {1.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult,
   * double)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test evaluateAndDifferentiate(PiecewisePolynomialResult, double); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives PiecewisePolynomialFunction1D.evaluateAndDifferentiate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateAndDifferentiate_thenThrowUnsupportedOperationException() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp = new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 2);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> piecewisePolynomialFunction1D.evaluateAndDifferentiate(pp, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult,
   * double)}.
   *
   * <ul>
   *   <li>When {@code -0.0}.
   *   <li>Then return Derivatives max is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test evaluateAndDifferentiate(PiecewisePolynomialResult, double); when '-0.0'; then return Derivatives max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives PiecewisePolynomialFunction1D.evaluateAndDifferentiate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateAndDifferentiate_when00_thenReturnDerivativesMaxIsZero() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act and Assert
    DoubleArray derivatives =
        piecewisePolynomialFunction1D.evaluateAndDifferentiate(pp, -0.0d).getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult,
   * double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return Derivatives max is minus one.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test evaluateAndDifferentiate(PiecewisePolynomialResult, double); when '-0.5'; then return Derivatives max is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives PiecewisePolynomialFunction1D.evaluateAndDifferentiate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateAndDifferentiate_when05_thenReturnDerivativesMaxIsMinusOne() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    ValueDerivatives actualEvaluateAndDifferentiateResult =
        piecewisePolynomialFunction1D.evaluateAndDifferentiate(pp, -0.5d);

    // Assert
    DoubleArray derivatives = actualEvaluateAndDifferentiateResult.getDerivatives();
    assertEquals(-1.0d, derivatives.max());
    assertEquals(-1.0d, derivatives.min());
    assertEquals(-1.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(-1.0d, toListResult.get(0).doubleValue());
    assertEquals(0.25d, actualEvaluateAndDifferentiateResult.getValue());
    assertArrayEquals(new double[] {-1.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction1D#evaluateAndDifferentiate(PiecewisePolynomialResult, double)}
   */
  @Test
  @DisplayName(
      "Test evaluateAndDifferentiate(PiecewisePolynomialResult, double); when zero; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives PiecewisePolynomialFunction1D.evaluateAndDifferentiate(PiecewisePolynomialResult, double)"
  })
  void testEvaluateAndDifferentiate_whenZero_thenReturnValueIsZero() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult pp =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);

    // Act
    ValueDerivatives actualEvaluateAndDifferentiateResult =
        piecewisePolynomialFunction1D.evaluateAndDifferentiate(pp, 0.0d);

    // Assert
    assertEquals(0.0d, actualEvaluateAndDifferentiateResult.getValue());
    DoubleArray derivatives = actualEvaluateAndDifferentiateResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, derivatives.max());
    assertEquals(1.0d, derivatives.min());
    assertEquals(1.0d, derivatives.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#getValue(DoubleArray, double, double)} with {@code
   * DoubleArray}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#getValue(DoubleArray, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getValue(DoubleArray, double, double) with 'DoubleArray', 'double', 'double'; when filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double PiecewisePolynomialFunction1D.getValue(DoubleArray, double, double)"})
  void testGetValueWithDoubleArrayDoubleDouble_whenFilledThree_thenReturnZero() {
    // Arrange
    PiecewisePolynomialFunction1D piecewisePolynomialFunction1D =
        new PiecewisePolynomialFunction1D();

    // Act and Assert
    assertEquals(0.0d, piecewisePolynomialFunction1D.getValue(DoubleArray.filled(3), 2.0d, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction1D#getValue(double[], double, double)} with {@code
   * double[]}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and {@code 0.5}.
   *   <li>Then return {@code -5167.5}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialFunction1D#getValue(double[], double, double)}
   */
  @Test
  @DisplayName(
      "Test getValue(double[], double, double) with 'double[]', 'double', 'double'; when array of double with ten and '0.5'; then return '-5167.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double PiecewisePolynomialFunction1D.getValue(double[], double, double)"})
  void testGetValueWithDoubleDoubleDouble_whenArrayOfDoubleWithTenAnd05_thenReturn51675() {
    // Arrange, Act and Assert
    assertEquals(
        -5167.5d,
        new PiecewisePolynomialFunction1D()
            .getValue(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, 2.0d, 10.0d));
  }
}
