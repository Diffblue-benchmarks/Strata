package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ConstrainedCubicSplineInterpolatorDiffblueTest {
  /**
   * Test {@link ConstrainedCubicSplineInterpolator#interpolate(double[], double[])} with {@code
   * double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 21.4999999999812}.
   * </ul>
   *
   * <p>Method under test: {@link ConstrainedCubicSplineInterpolator#interpolate(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '21.4999999999812'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult ConstrainedCubicSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs214999999999812() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-13d},
                new double[] {10.0d, 0.5d, 10.0d, 1.0E-13d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(21.4999999999812d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 1.0d, 0.5d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-13d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-4.0000000000016005d, 4.0000000000008d, 0.0d, 1.0E-13d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {39.9999999999756d, 0.0d, -29.9999999999937d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link ConstrainedCubicSplineInterpolator#interpolate(double[], double[][])} with {@code
   * double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 21.4999999999812}.
   * </ul>
   *
   * <p>Method under test: {@link ConstrainedCubicSplineInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '21.4999999999812'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult ConstrainedCubicSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs2149999999998122() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-13d},
                new double[][] {new double[] {10.0d, 0.5d, 10.0d, 1.0E-13d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(21.4999999999812d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 1.0d, 0.5d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-13d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-4.0000000000016005d, 4.0000000000008d, 0.0d, 1.0E-13d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {39.9999999999756d, 0.0d, -29.9999999999937d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link ConstrainedCubicSplineInterpolator#interpolate(double[], double[])} with {@code
   * double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 20.160373232231695}.
   * </ul>
   *
   * <p>Method under test: {@link ConstrainedCubicSplineInterpolator#interpolate(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '20.160373232231695'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult ConstrainedCubicSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs20160373232231695() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-13d},
                new double[] {10.0d, 1.0E-13d, 10.0d, 1.0E-13d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(20.160373232231695d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.0058317538999853626d, 0.16620498614958282d, 0.0d, 1.0E-13d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-13d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-13d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {39.9999999999756d, 0.0d, -29.9999999999937d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link ConstrainedCubicSplineInterpolator#interpolate(double[], double[][])} with {@code
   * double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 20.160373232231695}.
   * </ul>
   *
   * <p>Method under test: {@link ConstrainedCubicSplineInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '20.160373232231695'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult ConstrainedCubicSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs201603732322316952() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new ConstrainedCubicSplineInterpolator()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-13d},
                new double[][] {new double[] {10.0d, 1.0E-13d, 10.0d, 1.0E-13d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(20.160373232231695d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.0058317538999853626d, 0.16620498614958282d, 0.0d, 1.0E-13d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-13d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-13d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {39.9999999999756d, 0.0d, -29.9999999999937d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }
}
