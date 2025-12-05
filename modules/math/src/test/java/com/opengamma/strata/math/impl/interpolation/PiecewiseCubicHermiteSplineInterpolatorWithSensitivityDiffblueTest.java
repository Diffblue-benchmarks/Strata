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

class PiecewiseCubicHermiteSplineInterpolatorWithSensitivityDiffblueTest {
  /**
   * Test {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 0.11576031491471354}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return CoefMatrix total is '0.11576031491471354'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnCoefMatrixTotalIs011576031491471354() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolateWithSensitivity(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-15d},
                new double[] {1.0E-15d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    assertEquals(0.11576031491471354d, coefMatrix.total());
    DoubleMatrix[] coefficientSensitivityAll =
        actualInterpolateWithSensitivityResult.getCoefficientSensitivityAll();
    assertEquals(1.999999999999997d, coefficientSensitivityAll[0].total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3, coefficientSensitivityAll.length);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-15d, 0.5d, 10.0d},
        actualInterpolateWithSensitivityResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-5.83175389998539E-4d, 0.11634349030470909d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[1], 0.0);
  }

  /**
   * Test {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 20.115760314914514}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return CoefMatrix total is '20.115760314914514'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnCoefMatrixTotalIs20115760314914514() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolateWithSensitivity(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    assertEquals(20.115760314914514d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-15d, 0.5d, 10.0d},
        actualInterpolateWithSensitivityResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-5.83175389998539E-4d, 0.11634349030470909d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {39.99999999999969d, 7.105427357600988E-14d, -29.999999999999954d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is minus thirty.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return CoefMatrix total is minus thirty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnCoefMatrixTotalIsMinusThirty() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolateWithSensitivity(
                new double[] {1.0d, 0.5d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    assertEquals(-30.0d, coefMatrix.total());
    DoubleArray knots = actualInterpolateWithSensitivityResult.getKnots();
    List<Double> toListResult = knots.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(1.0E-15d, knots.min());
    assertEquals(1.0E-15d, toListResult.get(0).doubleValue());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertEquals(11.5d, knots.sum());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-159.99999999999997d, 119.99999999999997d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 10.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {1.0E-15d, 0.5d, 1.0d, 10.0d}, knots.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return Knots toList second doubleValue is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return Knots toList second doubleValue is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnKnotsToListSecondDoubleValueIs05() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolateWithSensitivity(
                new double[] {-0.5d, -19.999999999999957d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    DoubleArray knots = actualInterpolateWithSensitivityResult.getKnots();
    List<Double> toListResult = knots.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.5d, toListResult.get(1).doubleValue());
    assertEquals(-10.499999999999957d, knots.sum());
    assertEquals(-19.999999999999957d, knots.min());
    assertEquals(-19.999999999999957d, toListResult.get(0).doubleValue());
    assertEquals(1.0E-15d, toListResult.get(2).doubleValue());
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(51.47091471535213d, coefMatrix.total());
    assertArrayEquals(
        new double[] {-19.999999999999957d, -0.5d, 1.0E-15d, 10.0d}, knots.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {0.0013486404018948485d, -0.07889546351084846d, 1.5384615384615417d, 1.0E-15d},
        toArrayUnsafeResult[0],
        0.0);
    assertArrayEquals(
        new double[] {0.010000000000000004d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {159.99999999999903d, -119.9999999999995d, 0.0d, 10.0d},
        toArrayUnsafeResult[1],
        0.0);
  }

  /**
   * Test {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return second element total is {@code 0.9999999999999992}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return second element total is '0.9999999999999992'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnSecondElementTotalIs09999999999999992() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolateWithSensitivity(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0E-15d});

    // Assert
    DoubleMatrix[] coefficientSensitivityAll =
        actualInterpolateWithSensitivityResult.getCoefficientSensitivityAll();
    assertEquals(0.9999999999999992d, coefficientSensitivityAll[1].total());
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    assertEquals(20.310972444962605d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3, coefficientSensitivityAll.length);
    assertArrayEquals(
        new double[] {-0.005038635369587393d, -0.003988919667590208d, 1.4400000000000008d, 1.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-15d, 0.5d, 10.0d},
        actualInterpolateWithSensitivityResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-10.240000000000057d, 9.12000000000003d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {35.99999999999969d, 4.000000000000077d, -30.999999999999957d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return second element total is {@code 1.0000000000000004}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return second element total is '1.0000000000000004'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnSecondElementTotalIs10000000000000004() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolateWithSensitivity(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 0.5d, 10.0d, 1.0E-15d});

    // Assert
    DoubleMatrix[] coefficientSensitivityAll =
        actualInterpolateWithSensitivityResult.getCoefficientSensitivityAll();
    assertEquals(1.0000000000000004d, coefficientSensitivityAll[1].total());
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    assertEquals(20.99999999999979d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3, coefficientSensitivityAll.length);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-15d, 0.5d, 10.0d},
        actualInterpolateWithSensitivityResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-4.000000000000016d, 4.000000000000008d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {2.4603280324103192E-18d, -2.337311630789803E-17d, 1.0d, 0.5d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {37.99999999999969d, 2.000000000000067d, -30.499999999999954d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return third element total is {@code 1.010409680711474}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolateWithSensitivity(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test interpolateWithSensitivity(double[], double[]); then return third element total is '1.010409680711474'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity_thenReturnThirdElementTotalIs1010409680711474() {
    // Arrange and Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolateWithSensitivity(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 1.0E-15d, 1.0E-15d, 1.0E-15d});

    // Assert
    DoubleMatrix[] coefficientSensitivityAll =
        actualInterpolateWithSensitivityResult.getCoefficientSensitivityAll();
    assertEquals(1.010409680711474d, coefficientSensitivityAll[2].total());
    DoubleMatrix coefMatrix = actualInterpolateWithSensitivityResult.getCoefMatrix();
    assertEquals(19.999999999999805d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3, coefficientSensitivityAll.length);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-15d, 0.5d, 10.0d},
        actualInterpolateWithSensitivityResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {39.99999999999969d, 7.105427357600988E-14d, -29.999999999999954d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[],
   * double[])} with {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 20.99999999999979}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '20.99999999999979'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs2099999999999979() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 0.5d, 10.0d, 1.0E-15d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(20.99999999999979d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-15d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-4.000000000000016d, 4.000000000000008d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {2.4603280324103192E-18d, -2.337311630789803E-17d, 1.0d, 0.5d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {37.99999999999969d, 2.000000000000067d, -30.499999999999954d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[],
   * double[])} with {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 0.11576031491471354}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '0.11576031491471354'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs011576031491471354() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-15d},
                new double[] {1.0E-15d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(0.11576031491471354d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-15d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-5.83175389998539E-4d, 0.11634349030470909d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[1], 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[],
   * double[])} with {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 20.115760314914514}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return CoefMatrix total is '20.115760314914514'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs20115760314914514() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(20.115760314914514d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-15d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-5.83175389998539E-4d, 0.11634349030470909d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {39.99999999999969d, 7.105427357600988E-14d, -29.999999999999954d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[],
   * double[][])} with {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 20.99999999999979}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '20.99999999999979'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs20999999999999792() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-15d},
                new double[][] {new double[] {10.0d, 0.5d, 10.0d, 1.0E-15d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(20.99999999999979d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-15d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-4.000000000000016d, 4.000000000000008d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {2.4603280324103192E-18d, -2.337311630789803E-17d, 1.0d, 0.5d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {37.99999999999969d, 2.000000000000067d, -30.499999999999954d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[],
   * double[][])} with {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 0.11576031491471354}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '0.11576031491471354'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs0115760314914713542() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-15d},
                new double[][] {new double[] {1.0E-15d, 1.0E-15d, 10.0d, 1.0E-15d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(0.11576031491471354d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-15d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-5.83175389998539E-4d, 0.11634349030470909d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[1], 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[],
   * double[][])} with {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return CoefMatrix total is {@code 20.115760314914514}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return CoefMatrix total is '20.115760314914514'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnCoefMatrixTotalIs201157603149145142() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolate(
                new double[] {-0.5d, 0.5d, 10.0d, 1.0E-15d},
                new double[][] {new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d}});

    // Assert
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(20.115760314914514d, coefMatrix.total());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.5d, 1.0E-15d, 0.5d, 10.0d},
        actualInterpolateResult.getKnots().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {-5.83175389998539E-4d, 0.11634349030470909d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {39.99999999999969d, 7.105427357600988E-14d, -29.999999999999954d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[],
   * double[])} with {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return Knots toList second doubleValue is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return Knots toList second doubleValue is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnKnotsToListSecondDoubleValueIs05() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolate(
                new double[] {2.0d, 0.5d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    DoubleArray knots = actualInterpolateResult.getKnots();
    List<Double> toListResult = knots.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(1.0E-15d, knots.min());
    assertEquals(1.0E-15d, toListResult.get(0).doubleValue());
    assertEquals(12.5d, knots.sum());
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(17.40740740740741d, coefMatrix.total());
    assertEquals(2.0d, toListResult.get(2).doubleValue());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-5.925925925925925d, 13.33333333333333d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 10.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {1.0E-15d, 0.5d, 2.0d, 10.0d}, knots.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[],
   * double[])} with {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>Then return Knots toList second doubleValue is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[]) with 'double[]', 'double[]'; then return Knots toList second doubleValue is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble_thenReturnKnotsToListSecondDoubleValueIs052() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolate(
                new double[] {-0.5d, -1.0d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    DoubleArray knots = actualInterpolateResult.getKnots();
    List<Double> toListResult = knots.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.5d, toListResult.get(1).doubleValue());
    assertEquals(-1.0d, knots.min());
    assertEquals(-1.0d, toListResult.get(0).doubleValue());
    assertEquals(1.0E-15d, toListResult.get(2).doubleValue());
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(50.00999999999947d, coefMatrix.total());
    assertEquals(8.500000000000002d, knots.sum());
    assertArrayEquals(new double[] {-1.0d, -0.5d, 1.0E-15d, 10.0d}, knots.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {-1.7053025658242404E-13d, -39.99999999999983d, 39.99999999999995d, 1.0E-15d},
        toArrayUnsafeResult[0],
        0.0);
    assertArrayEquals(
        new double[] {0.010000000000000004d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {159.99999999999903d, -119.9999999999995d, 0.0d, 10.0d},
        toArrayUnsafeResult[1],
        0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[],
   * double[][])} with {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return Knots toList second doubleValue is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return Knots toList second doubleValue is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnKnotsToListSecondDoubleValueIs053() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolate(
                new double[] {2.0d, 0.5d, 10.0d, 1.0E-15d},
                new double[][] {new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d}});

    // Assert
    DoubleArray knots = actualInterpolateResult.getKnots();
    List<Double> toListResult = knots.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(1.0E-15d, knots.min());
    assertEquals(1.0E-15d, toListResult.get(0).doubleValue());
    assertEquals(12.5d, knots.sum());
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    assertEquals(17.40740740740741d, coefMatrix.total());
    assertEquals(2.0d, toListResult.get(2).doubleValue());
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-5.925925925925925d, 13.33333333333333d, 0.0d, 1.0E-15d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 10.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {1.0E-15d, 0.5d, 2.0d, 10.0d}, knots.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[],
   * double[][])} with {@code double[]}, {@code double[][]}.
   *
   * <ul>
   *   <li>Then return Knots toList second doubleValue is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewiseCubicHermiteSplineInterpolatorWithSensitivity#interpolate(double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test interpolate(double[], double[][]) with 'double[]', 'double[][]'; then return Knots toList second doubleValue is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult PiecewiseCubicHermiteSplineInterpolatorWithSensitivity.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble_thenReturnKnotsToListSecondDoubleValueIs054() {
    // Arrange and Act
    PiecewisePolynomialResult actualInterpolateResult =
        new PiecewiseCubicHermiteSplineInterpolatorWithSensitivity()
            .interpolate(
                new double[] {-0.5d, -1.0d, 10.0d, 1.0E-15d},
                new double[][] {new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d}});

    // Assert
    DoubleArray knots = actualInterpolateResult.getKnots();
    List<Double> toListResult = knots.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.5d, toListResult.get(1).doubleValue());
    assertEquals(-1.0d, knots.min());
    assertEquals(-1.0d, toListResult.get(0).doubleValue());
    assertEquals(1.0E-15d, toListResult.get(2).doubleValue());
    DoubleMatrix coefMatrix = actualInterpolateResult.getCoefMatrix();
    double[][] toArrayUnsafeResult = coefMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(50.00999999999947d, coefMatrix.total());
    assertEquals(8.500000000000002d, knots.sum());
    assertArrayEquals(new double[] {-1.0d, -0.5d, 1.0E-15d, 10.0d}, knots.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {-1.7053025658242404E-13d, -39.99999999999983d, 39.99999999999995d, 1.0E-15d},
        toArrayUnsafeResult[0],
        0.0);
    assertArrayEquals(
        new double[] {0.010000000000000004d, 0.0d, 0.0d, 1.0E-15d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {159.99999999999903d, -119.9999999999995d, 0.0d, 10.0d},
        toArrayUnsafeResult[1],
        0.0);
  }
}
