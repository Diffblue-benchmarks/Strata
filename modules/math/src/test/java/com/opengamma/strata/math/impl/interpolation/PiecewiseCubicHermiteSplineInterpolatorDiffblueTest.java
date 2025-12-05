package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PiecewiseCubicHermiteSplineInterpolatorDiffblueTest {
  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[], double[])} with
   * {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 29.95}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '29.95'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs2995() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolate(
                new double[] {0.5d, 3.0d, 10.0d, 1.0d}, new double[] {10.0d, 3.0d, 10.0d, 1.0d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(29.95d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.25d, 1.0d, 0.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 1.0d, 3.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 3.0d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {56.8d, -20.799999999999997d, -21.8d, 10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[], double[][])} with
   * {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 29.95}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '29.95'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs29952() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolate(
                new double[] {0.5d, 3.0d, 10.0d, 1.0d},
                new double[][] {new double[] {10.0d, 3.0d, 10.0d, 1.0d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(29.95d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.25d, 1.0d, 0.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 1.0d, 3.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 3.0d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {56.8d, -20.799999999999997d, -21.8d, 10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[], double[])} with
   * {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 3.21865889212828}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '3.21865889212828'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs321865889212828() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolate(
                new double[] {0.5d, 3.0d, 10.0d, 1.0d}, new double[] {1.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3.21865889212828d, coefMatrix.total());
    assertArrayEquals(
        new double[] {-0.005830903790087461d, 0.22448979591836737d, 0.0d, 1.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 3.0d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[], double[][])} with
   * {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 3.21865889212828}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '3.21865889212828'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs3218658892128282() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolate(
                new double[] {0.5d, 3.0d, 10.0d, 1.0d},
                new double[][] {new double[] {1.0d, 1.0d, 10.0d, 1.0d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3.21865889212828d, coefMatrix.total());
    assertArrayEquals(
        new double[] {-0.005830903790087461d, 0.22448979591836737d, 0.0d, 1.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 3.0d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[], double[])} with
   * {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 26.618658892128277}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '26.618658892128277'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs26618658892128277() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolate(
                new double[] {0.5d, 3.0d, 10.0d, 1.0d}, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(26.618658892128277d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.005830903790087461d, 0.22448979591836737d, 0.0d, 1.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 3.0d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {57.599999999999994d, -21.599999999999994d, -21.6d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[], double[][])} with
   * {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 26.618658892128277}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '26.618658892128277'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs266186588921282772() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolate(
                new double[] {0.5d, 3.0d, 10.0d, 1.0d},
                new double[][] {new double[] {10.0d, 1.0d, 10.0d, 1.0d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(26.618658892128277d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.005830903790087461d, 0.22448979591836737d, 0.0d, 1.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 3.0d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {57.599999999999994d, -21.599999999999994d, -21.6d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[], double[])} with
   * {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return Knots min is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return Knots min is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnKnotsMinIs05() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolate(
                new double[] {0.5d, -0.5d, 10.0d, 1.0d}, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    DoubleArray knots = actualInterpolateResult.getKnots();
    assertEquals(-0.5d, knots.min());
    List<Double> toListResult = knots.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.5d, toListResult.get(0).doubleValue());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertEquals(11.0d, knots.sum());
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(57.01234567901235d, coefMatrix.total());
    assertArrayEquals(new double[] {-0.5d, 0.5d, 1.0d, 10.0d}, knots.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {0.012345679012345678d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {144.0d, -108.0d, 0.0d, 10.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {9.0d, -27.0d, 27.0d, 1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[], double[][])} with
   * {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return Knots min is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return Knots min is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnKnotsMinIs052() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolate(
                new double[] {0.5d, -0.5d, 10.0d, 1.0d},
                new double[][] {new double[] {10.0d, 1.0d, 10.0d, 1.0d}});

    // Assert
    DoubleArray knots = actualInterpolateResult.getKnots();
    assertEquals(-0.5d, knots.min());
    List<Double> toListResult = knots.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.5d, toListResult.get(0).doubleValue());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertEquals(11.0d, knots.sum());
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(57.01234567901235d, coefMatrix.total());
    assertArrayEquals(new double[] {-0.5d, 0.5d, 1.0d, 10.0d}, knots.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {0.012345679012345678d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {144.0d, -108.0d, 0.0d, 10.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {9.0d, -27.0d, 27.0d, 1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[], double[])} with
   * {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return Knots min is one.
   * </ul>
   *
   * <p>Method under test: {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return Knots min is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnKnotsMinIsOne() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolate(
                new double[] {54.0d, 3.0d, 10.0d, 1.0d}, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    DoubleArray knots = actualInterpolateResult.getKnots();
    assertEquals(1.0d, knots.min());
    List<Double> toListResult = knots.toList();
    assertEquals(4, toListResult.size());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(12.498542274052479d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3.0d, toListResult.get(1).doubleValue());
    assertEquals(54.0d, knots.max());
    assertEquals(54.0d, toListResult.get(3).doubleValue());
    assertEquals(68.0d, knots.sum());
    assertArrayEquals(
        new double[] {-0.052478134110787174d, 0.5510204081632654d, 0.0d, 1.0d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 10.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {1.0d, 3.0d, 10.0d, 54.0d}, knots.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[], double[][])} with
   * {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return Knots min is one.
   * </ul>
   *
   * <p>Method under test: {@link PiecewiseCubicHermiteSplineInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return Knots min is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnKnotsMinIsOne2() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolate(
                new double[] {54.0d, 3.0d, 10.0d, 1.0d},
                new double[][] {new double[] {10.0d, 1.0d, 10.0d, 1.0d}});

    // Assert
    DoubleArray knots = actualInterpolateResult.getKnots();
    assertEquals(1.0d, knots.min());
    List<Double> toListResult = knots.toList();
    assertEquals(4, toListResult.size());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(12.498542274052479d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3.0d, toListResult.get(1).doubleValue());
    assertEquals(54.0d, knots.max());
    assertEquals(54.0d, toListResult.get(3).doubleValue());
    assertEquals(68.0d, knots.sum());
    assertArrayEquals(
        new double[] {-0.052478134110787174d, 0.5510204081632654d, 0.0d, 1.0d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 10.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {1.0d, 3.0d, 10.0d, 54.0d}, knots.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 29.95}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return CoefMatrix total is '29.95'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolator.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnCoefMatrixTotalIs2995() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolateWithSensitivity(
                new double[] {0.5d, 3.0d, 10.0d, 1.0d}, new double[] {10.0d, 3.0d, 10.0d, 1.0d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    assertEquals(29.95d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.25d, 1.0d, 0.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 1.0d, 3.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 3.0d, 10.0d},
        actualInterpolateWithSensitivityResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {56.8d, -20.799999999999997d, -21.8d, 10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 26.618658892128277}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return CoefMatrix total is '26.618658892128277'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolator.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnCoefMatrixTotalIs26618658892128277() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolateWithSensitivity(
                new double[] {0.5d, 3.0d, 10.0d, 1.0d}, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    assertEquals(26.618658892128277d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.005830903790087461d, 0.22448979591836737d, 0.0d, 1.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 3.0d, 10.0d},
        actualInterpolateWithSensitivityResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {57.599999999999994d, -21.599999999999994d, -21.6d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 47.176572903780105}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return CoefMatrix total is '47.176572903780105'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolator.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnCoefMatrixTotalIs47176572903780105() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolateWithSensitivity(
                new double[] {0.5d, 3.0d, 10.0d, 1.0d}, new double[] {10.0d, 1.0d, 10.0d, -18.0d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(47.176572903780105d, coefMatrix.total());
    assertArrayEquals(
        new double[] {-4.090805254140491d, 12.931610508280983d, 0.0d, -18.0d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {0.0013336818777441703d, -0.20234501567617347d, 2.636778983438036d, 1.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 3.0d, 10.0d},
        actualInterpolateWithSensitivityResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {171.60000000000002d, -59.60000000000002d, -69.1d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return first element total is {@code 1.1}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return first element total is '1.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolator.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnFirstElementTotalIs11() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolateWithSensitivity(
                new double[] {0.5d, 3.0d, 10.0d, 1.0d}, new double[] {1.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    DoubleMatrix[] coefficientSensitivityAll =
        actualInterpolateWithSensitivityResult.getCoefficientSensitivityAll();
    assertEquals(1.1d, coefficientSensitivityAll[0].total());
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3, coefficientSensitivityAll.length);
    assertEquals(3.21865889212828d, coefMatrix.total());
    assertArrayEquals(
        new double[] {-0.005830903790087461d, 0.22448979591836737d, 0.0d, 1.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 3.0d, 10.0d},
        actualInterpolateWithSensitivityResult.getKnots().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return Knots min is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return Knots min is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolator.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnKnotsMinIs05() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolateWithSensitivity(
                new double[] {0.5d, -0.5d, 10.0d, 1.0d}, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    DoubleArray knots = actualInterpolateWithSensitivityResult.getKnots();
    assertEquals(-0.5d, knots.min());
    List<Double> toListResult = knots.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.5d, toListResult.get(0).doubleValue());
    assertEquals(11.0d, knots.sum());
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(57.01234567901235d, coefMatrix.total());
    assertArrayEquals(new double[] {-0.5d, 0.5d, 1.0d, 10.0d}, knots.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {0.012345679012345678d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {144.0d, -108.0d, 0.0d, 10.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {9.0d, -27.0d, 27.0d, 1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return Knots sum is {@code -13.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return Knots sum is '-13.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolator.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnKnotsSumIs135() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolateWithSensitivity(
                new double[] {0.5d, 3.0d, -18.0d, 1.0d}, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    DoubleArray knots = actualInterpolateWithSensitivityResult.getKnots();
    assertEquals(-13.5d, knots.sum());
    assertEquals(-18.0d, knots.min());
    assertEquals(3.0d, knots.max());
    assertEquals(57.0d, actualInterpolateWithSensitivityResult.getCoefMatrix().total());
    assertArrayEquals(new double[] {-18.0d, 0.5d, 1.0d, 3.0d}, knots.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return third element total is {@code 1.021379980563654}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolator#interpolateWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return third element total is '1.021379980563654'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolator.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnThirdElementTotalIs1021379980563654() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolator()
            .interpolateWithSensitivity(
                new double[] {0.5d, 3.0d, 10.0d, 1.0d}, new double[] {10.0d, 1.0d, 1.0d, 1.0d});

    // Assert
    DoubleMatrix[] coefficientSensitivityAll =
        actualInterpolateWithSensitivityResult.getCoefficientSensitivityAll();
    assertEquals(1.021379980563654d, coefficientSensitivityAll[2].total());
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    assertEquals(26.4d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3, coefficientSensitivityAll.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {0.5d, 1.0d, 3.0d, 10.0d},
        actualInterpolateWithSensitivityResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {57.599999999999994d, -21.599999999999994d, -21.6d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }
}
