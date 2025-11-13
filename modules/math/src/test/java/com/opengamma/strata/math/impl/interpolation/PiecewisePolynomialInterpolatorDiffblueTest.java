package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PiecewisePolynomialInterpolatorDiffblueTest {
  /**
   * Test {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][], double[][])} with
   * {@code double[]}, {@code double[][]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][], double[][]) with 'double[]', 'double[][]', 'double[][]'; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] PiecewisePolynomialInterpolator.interpolate(double[], double[][], double[][])"
  })
  void testInterpolateWithDoubleDoubleDouble_thenReturnArrayLengthIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0,
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                new double[][] {new double[] {}})
            .length);
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][], double[][])} with
   * {@code double[]}, {@code double[][]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return first element size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][], double[][]) with 'double[]', 'double[][]', 'double[][]'; then return first element size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] PiecewisePolynomialInterpolator.interpolate(double[], double[][], double[][])"
  })
  void testInterpolateWithDoubleDoubleDouble_thenReturnFirstElementSizeIsZero() {
    // Arrange and Act
    DoubleMatrix[] actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[][] {},
                new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}});

    // Assert
    DoubleMatrix doubleMatrix = actualInterpolateResult[0];
    assertEquals(0, doubleMatrix.size());
    assertEquals(0, doubleMatrix.toArrayUnsafe().length);
    assertEquals(0.0d, doubleMatrix.total());
    assertEquals(2, doubleMatrix.dimensions());
    assertEquals(4, actualInterpolateResult.length);
    assertTrue(doubleMatrix.isEmpty());
    assertTrue(doubleMatrix.isSquare());
    assertSame(doubleMatrix, actualInterpolateResult[1]);
    assertSame(doubleMatrix, actualInterpolateResult[2]);
    assertSame(doubleMatrix, actualInterpolateResult[3]);
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][], double[][])} with
   * {@code double[]}, {@code double[][]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return first element size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][], double[][]) with 'double[]', 'double[][]', 'double[][]'; then return first element size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] PiecewisePolynomialInterpolator.interpolate(double[], double[][], double[][])"
  })
  void testInterpolateWithDoubleDoubleDouble_thenReturnFirstElementSizeIsZero2() {
    // Arrange and Act
    DoubleMatrix[] actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[][] {},
                new double[][] {
                  new double[] {0.5d, 10.0d, 0.5d, 10.0d}, new double[] {0.5d, 10.0d, 0.5d, 10.0d}
                });

    // Assert
    DoubleMatrix doubleMatrix = actualInterpolateResult[0];
    assertEquals(0, doubleMatrix.size());
    assertEquals(0, doubleMatrix.toArrayUnsafe().length);
    assertEquals(0.0d, doubleMatrix.total());
    assertEquals(2, doubleMatrix.dimensions());
    assertEquals(4, actualInterpolateResult.length);
    assertTrue(doubleMatrix.isEmpty());
    assertTrue(doubleMatrix.isSquare());
    assertSame(doubleMatrix, actualInterpolateResult[1]);
    assertSame(doubleMatrix, actualInterpolateResult[2]);
    assertSame(doubleMatrix, actualInterpolateResult[3]);
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][], double)} with
   * {@code double[]}, {@code double[][]}, {@code double}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][],
   * double)}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][], double) with 'double[]', 'double[][]', 'double'; when empty 2D array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialInterpolator.interpolate(double[], double[][], double)"
  })
  void testInterpolateWithDoubleDoubleDouble_whenEmpty2dArrayOfDouble_thenReturnEmpty() {
    // Arrange and Act
    DoubleArray actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[][] {}, 2.0d);

    // Assert
    assertSame(DoubleArray.EMPTY, actualInterpolateResult);
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][], double[])} with
   * {@code double[]}, {@code double[][]}, {@code double[]}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][], double[]) with 'double[]', 'double[][]', 'double[]'; when empty 2D array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialInterpolator.interpolate(double[], double[][], double[])"
  })
  void testInterpolateWithDoubleDoubleDouble_whenEmpty2dArrayOfDouble_thenReturnEmpty2() {
    // Arrange and Act
    DoubleMatrix actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[][] {},
                new double[] {2.0d, 10.0d, 2.0d, 10.0d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualInterpolateResult);
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][], double[])} with
   * {@code double[]}, {@code double[][]}, {@code double[]}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][], double[]) with 'double[]', 'double[][]', 'double[]'; when empty 2D array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialInterpolator.interpolate(double[], double[][], double[])"
  })
  void testInterpolateWithDoubleDoubleDouble_whenEmpty2dArrayOfDouble_thenReturnEmpty3() {
    // Arrange and Act
    DoubleMatrix actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[][] {new double[] {}},
                new double[] {});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualInterpolateResult);
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator#interpolate(double[], double[], double[][])} with
   * {@code double[]}, {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#interpolate(double[], double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[], double[][]) with 'double[]', 'double[]', 'double[][]'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialInterpolator.interpolate(double[], double[], double[][])"
  })
  void testInterpolateWithDoubleDoubleDouble_whenEmptyArrayOfDouble_thenReturnEmpty() {
    // Arrange and Act
    DoubleMatrix actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[][] {new double[] {}});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualInterpolateResult);
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][], double)} with
   * {@code double[]}, {@code double[][]}, {@code double}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][],
   * double)}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][], double) with 'double[]', 'double[][]', 'double'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialInterpolator.interpolate(double[], double[][], double)"
  })
  void testInterpolateWithDoubleDoubleDouble_whenEmptyArrayOfDouble_thenReturnEmpty2() {
    // Arrange and Act
    DoubleArray actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[][] {new double[] {}}, 2.0d);

    // Assert
    assertSame(DoubleArray.EMPTY, actualInterpolateResult);
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][], double[])} with
   * {@code double[]}, {@code double[][]}, {@code double[]}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#interpolate(double[], double[][],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][], double[]) with 'double[]', 'double[][]', 'double[]'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialInterpolator.interpolate(double[], double[][], double[])"
  })
  void testInterpolateWithDoubleDoubleDouble_whenEmptyArrayOfDouble_thenReturnEmpty3() {
    // Arrange and Act
    DoubleMatrix actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                new double[] {});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualInterpolateResult);
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator#getPrimaryMethod()}.
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#getPrimaryMethod()}
   */
  @Test
  @DisplayName("Test getPrimaryMethod()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialInterpolator PiecewisePolynomialInterpolator.getPrimaryMethod()"
  })
  void testGetPrimaryMethod() {
    // Arrange
    ConstrainedCubicSplineInterpolator constrainedCubicSplineInterpolator =
        new ConstrainedCubicSplineInterpolator();

    // Act
    PiecewisePolynomialInterpolator actualPrimaryMethod =
        constrainedCubicSplineInterpolator.getPrimaryMethod();

    // Assert
    assertTrue(actualPrimaryMethod instanceof ConstrainedCubicSplineInterpolator);
    assertSame(constrainedCubicSplineInterpolator, actualPrimaryMethod);
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator#getValue(DoubleArray, double, double)} with {@code
   * DoubleArray}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#getValue(DoubleArray, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getValue(DoubleArray, double, double) with 'DoubleArray', 'double', 'double'; when filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialInterpolator.getValue(DoubleArray, double, double)"
  })
  void testGetValueWithDoubleArrayDoubleDouble_whenFilledThree_thenReturnZero() {
    // Arrange
    ConstrainedCubicSplineInterpolator constrainedCubicSplineInterpolator =
        new ConstrainedCubicSplineInterpolator();

    // Act and Assert
    assertEquals(
        0.0d, constrainedCubicSplineInterpolator.getValue(DoubleArray.filled(3), 2.0d, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator#getValue(double[], double, double)} with {@code
   * double[]}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and {@code 0.5}.
   *   <li>Then return {@code -5167.5}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator#getValue(double[], double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getValue(double[], double, double) with 'double[]', 'double', 'double'; when array of double with ten and '0.5'; then return '-5167.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double PiecewisePolynomialInterpolator.getValue(double[], double, double)"})
  void testGetValueWithDoubleDoubleDouble_whenArrayOfDoubleWithTenAnd05_thenReturn51675() {
    // Arrange, Act and Assert
    assertEquals(
        -5167.5d,
        new ConstrainedCubicSplineInterpolator()
            .getValue(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, 2.0d, 10.0d));
  }
}
