package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NonnegativityPreservingCubicSplineInterpolatorDiffblueTest {
  /**
   * Test {@link
   * NonnegativityPreservingCubicSplineInterpolator#NonnegativityPreservingCubicSplineInterpolator(PiecewisePolynomialInterpolator)}.
   *
   * <p>Method under test: {@link
   * NonnegativityPreservingCubicSplineInterpolator#NonnegativityPreservingCubicSplineInterpolator(PiecewisePolynomialInterpolator)}
   */
  @Test
  @DisplayName(
      "Test new NonnegativityPreservingCubicSplineInterpolator(PiecewisePolynomialInterpolator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NonnegativityPreservingCubicSplineInterpolator.<init>(PiecewisePolynomialInterpolator)"
  })
  void testNewNonnegativityPreservingCubicSplineInterpolator() {
    // Arrange
    ConstrainedCubicSplineInterpolator method = new ConstrainedCubicSplineInterpolator();

    // Act and Assert
    PiecewisePolynomialInterpolator primaryMethod =
        new NonnegativityPreservingCubicSplineInterpolator(method).getPrimaryMethod();
    assertTrue(primaryMethod instanceof ConstrainedCubicSplineInterpolator);
    assertSame(method, primaryMethod);
  }

  /**
   * Test {@link NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[])}
   * with {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 19.99999999999822}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '19.99999999999822'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult NonnegativityPreservingCubicSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs1999999999999822() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new NonnegativityPreservingCubicSplineInterpolator(new ConstrainedCubicSplineInterpolator())
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[] {10.0d, 1.0E-14d, 0.0d, 1.0E-14d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(19.99999999999822d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-14d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {39.99999999999757d, 0.0d, -29.99999999999937d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
    assertArrayEquals(
        new double[] {5.831753899985419E-18d, -1.6620498614958447E-16d, 0.0d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
  }

  /**
   * Test {@link NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[])}
   * with {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 0.16037323224960884}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '0.16037323224960884'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult NonnegativityPreservingCubicSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs016037323224960884() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new NonnegativityPreservingCubicSplineInterpolator(new ConstrainedCubicSplineInterpolator())
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[] {0.0d, 1.0E-14d, 10.0d, 1.0E-14d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(0.16037323224960884d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.005831753899985409d, 0.16620498614958426d, 0.0d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-14d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-3.9999999999997596E-14d, 0.0d, 2.99999999999994E-14d, 0.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[])}
   * with {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 19.659133984543935}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '19.659133984543935'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult NonnegativityPreservingCubicSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs19659133984543935() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new NonnegativityPreservingCubicSplineInterpolator(new CubicSplineInterpolator())
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[] {10.0d, 1.0E-14d, 10.0d, 1.0E-14d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(19.659133984543935d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.05831753899985351d, 0.6648199445983249d, 6.00000000000012E-14d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {-0.0d, 1.200000000000048E-13d, -6.00000000000012E-14d, 1.0E-14d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {36.21052631578618d, 3.7894736842113397d, -30.947368421052197d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[][])}
   * with {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 19.99999999999822}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '19.99999999999822'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult NonnegativityPreservingCubicSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs19999999999998222() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new NonnegativityPreservingCubicSplineInterpolator(new ConstrainedCubicSplineInterpolator())
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[][] {new double[] {10.0d, 1.0E-14d, 0.0d, 1.0E-14d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(19.99999999999822d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-14d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {39.99999999999757d, 0.0d, -29.99999999999937d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
    assertArrayEquals(
        new double[] {5.831753899985419E-18d, -1.6620498614958447E-16d, 0.0d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
  }

  /**
   * Test {@link NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[])}
   * with {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 20.160373232247743}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '20.160373232247743'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult NonnegativityPreservingCubicSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs20160373232247743() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new NonnegativityPreservingCubicSplineInterpolator(new ConstrainedCubicSplineInterpolator())
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[] {10.0d, 0.0d, 10.0d, 1.0E-14d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(20.160373232247743d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.005831753899985417d, 0.16620498614958445d, 0.0d, 0.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          1.7670484276951373E-28d, 4.0000000000001414E-14d, -4.000000000000076E-14d, 1.0E-14d
        },
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {39.999999999997485d, 0.0d, -29.99999999999935d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[])}
   * with {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 20.160373232247817}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '20.160373232247817'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult NonnegativityPreservingCubicSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs20160373232247817() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new NonnegativityPreservingCubicSplineInterpolator(new ConstrainedCubicSplineInterpolator())
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[] {10.0d, 1.0E-14d, 10.0d, 1.0E-14d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(20.160373232247817d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.005831753899985409d, 0.16620498614958426d, 0.0d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-14d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {39.99999999999757d, 0.0d, -29.99999999999937d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[][])}
   * with {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 0.16037323224960884}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '0.16037323224960884'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult NonnegativityPreservingCubicSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs0160373232249608842() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new NonnegativityPreservingCubicSplineInterpolator(new ConstrainedCubicSplineInterpolator())
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[][] {new double[] {0.0d, 1.0E-14d, 10.0d, 1.0E-14d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(0.16037323224960884d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.005831753899985409d, 0.16620498614958426d, 0.0d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-14d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-3.9999999999997596E-14d, 0.0d, 2.99999999999994E-14d, 0.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[][])}
   * with {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 19.659133984543935}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '19.659133984543935'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult NonnegativityPreservingCubicSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs196591339845439352() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new NonnegativityPreservingCubicSplineInterpolator(new CubicSplineInterpolator())
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[][] {new double[] {10.0d, 1.0E-14d, 10.0d, 1.0E-14d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(19.659133984543935d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.05831753899985351d, 0.6648199445983249d, 6.00000000000012E-14d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {-0.0d, 1.200000000000048E-13d, -6.00000000000012E-14d, 1.0E-14d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {36.21052631578618d, 3.7894736842113397d, -30.947368421052197d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[][])}
   * with {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 20.160373232247743}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '20.160373232247743'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult NonnegativityPreservingCubicSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs201603732322477432() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new NonnegativityPreservingCubicSplineInterpolator(new ConstrainedCubicSplineInterpolator())
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[][] {new double[] {10.0d, 0.0d, 10.0d, 1.0E-14d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(20.160373232247743d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.005831753899985417d, 0.16620498614958445d, 0.0d, 0.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          1.7670484276951373E-28d, 4.0000000000001414E-14d, -4.000000000000076E-14d, 1.0E-14d
        },
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {39.999999999997485d, 0.0d, -29.99999999999935d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[][])}
   * with {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 20.160373232247817}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NonnegativityPreservingCubicSplineInterpolator#interpolate(double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '20.160373232247817'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult NonnegativityPreservingCubicSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs201603732322478172() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new NonnegativityPreservingCubicSplineInterpolator(new ConstrainedCubicSplineInterpolator())
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-14d},
                new double[][] {new double[] {10.0d, 1.0E-14d, 10.0d, 1.0E-14d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(20.160373232247817d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.005831753899985409d, 0.16620498614958426d, 0.0d, 1.0E-14d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d, 1.0E-14d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-14d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {39.99999999999757d, 0.0d, -29.99999999999937d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link NonnegativityPreservingCubicSplineInterpolator#getPrimaryMethod()}.
   *
   * <p>Method under test: {@link NonnegativityPreservingCubicSplineInterpolator#getPrimaryMethod()}
   */
  @Test
  @DisplayName("Test getPrimaryMethod()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialInterpolator NonnegativityPreservingCubicSplineInterpolator.getPrimaryMethod()"
  })
  void testGetPrimaryMethod() {
    // Arrange
    ConstrainedCubicSplineInterpolator method = new ConstrainedCubicSplineInterpolator();

    // Act
    PiecewisePolynomialInterpolator actualPrimaryMethod =
        new NonnegativityPreservingCubicSplineInterpolator(method).getPrimaryMethod();

    // Assert
    assertTrue(actualPrimaryMethod instanceof ConstrainedCubicSplineInterpolator);
    assertSame(method, actualPrimaryMethod);
  }
}
