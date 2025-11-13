package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SemiLocalCubicSplineInterpolatorDiffblueTest {
  /**
   * Test {@link SemiLocalCubicSplineInterpolator#interpolate(double[], double[])} with {@code
   * double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 19.96092724886847}.
   * </ul>
   *
   * <p>Method under test: {@link SemiLocalCubicSplineInterpolator#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '19.96092724886847'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult SemiLocalCubicSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs1996092724886847() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new SemiLocalCubicSplineInterpolator()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[] {10.0d, 1.0E-14d, 10.0d, 1.0E-14d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(19.96092724886847d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.0d, 2.000000000000036d, -0.999999999999998d, 1.0E-14d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {0.0052485785099868655d, -0.04432132963988898d, 0.999999999999998d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {35.999999999997726d, 1.99999999999996d, -29.99999999999937d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link SemiLocalCubicSplineInterpolator#interpolate(double[], double[])} with {@code
   * double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 23.99999999999812}.
   * </ul>
   *
   * <p>Method under test: {@link SemiLocalCubicSplineInterpolator#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '23.99999999999812'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult SemiLocalCubicSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs2399999999999812() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new SemiLocalCubicSplineInterpolator()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[] {10.0d, 0.5d, 10.0d, 1.0E-14d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(23.99999999999812d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 1.0d, 0.5d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 1.0d, 1.0E-14d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {41.99999999999747d, 1.421085471520172E-14d, -30.499999999999375d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link SemiLocalCubicSplineInterpolator#interpolate(double[], double[])} with {@code
   * double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 0.16037323224962888}.
   * </ul>
   *
   * <p>Method under test: {@link SemiLocalCubicSplineInterpolator#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '0.16037323224962888'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult SemiLocalCubicSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs016037323224962888() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new SemiLocalCubicSplineInterpolator()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[] {1.0E-14d, 1.0E-14d, 10.0d, 1.0E-14d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(0.16037323224962888d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.005831753899985412d, 0.1662049861495843d, 0.0d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-14d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-14d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SemiLocalCubicSplineInterpolator#interpolate(double[], double[][])} with {@code
   * double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 19.96092724886847}.
   * </ul>
   *
   * <p>Method under test: {@link SemiLocalCubicSplineInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '19.96092724886847'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult SemiLocalCubicSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs19960927248868472() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new SemiLocalCubicSplineInterpolator()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[][] {new double[] {10.0d, 1.0E-14d, 10.0d, 1.0E-14d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(19.96092724886847d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.0d, 2.000000000000036d, -0.999999999999998d, 1.0E-14d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {0.0052485785099868655d, -0.04432132963988898d, 0.999999999999998d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {35.999999999997726d, 1.99999999999996d, -29.99999999999937d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link SemiLocalCubicSplineInterpolator#interpolate(double[], double[][])} with {@code
   * double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 23.99999999999812}.
   * </ul>
   *
   * <p>Method under test: {@link SemiLocalCubicSplineInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '23.99999999999812'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult SemiLocalCubicSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs23999999999998122() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new SemiLocalCubicSplineInterpolator()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[][] {new double[] {10.0d, 0.5d, 10.0d, 1.0E-14d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(23.99999999999812d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 1.0d, 0.5d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 1.0d, 1.0E-14d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {41.99999999999747d, 1.421085471520172E-14d, -30.499999999999375d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link SemiLocalCubicSplineInterpolator#interpolate(double[], double[][])} with {@code
   * double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 0.16037323224962888}.
   * </ul>
   *
   * <p>Method under test: {@link SemiLocalCubicSplineInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '0.16037323224962888'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult SemiLocalCubicSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs0160373232249628882() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new SemiLocalCubicSplineInterpolator()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[][] {new double[] {1.0E-14d, 1.0E-14d, 10.0d, 1.0E-14d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(0.16037323224962888d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.005831753899985412d, 0.1662049861495843d, 0.0d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-14d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-14d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
  }
}
