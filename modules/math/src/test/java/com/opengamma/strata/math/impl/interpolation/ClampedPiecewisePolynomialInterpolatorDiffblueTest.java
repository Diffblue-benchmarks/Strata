package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ClampedPiecewisePolynomialInterpolatorDiffblueTest {
  /**
   * Test {@link
   * ClampedPiecewisePolynomialInterpolator#ClampedPiecewisePolynomialInterpolator(PiecewisePolynomialInterpolator,
   * double[], double[])}.
   *
   * <p>Method under test: {@link
   * ClampedPiecewisePolynomialInterpolator#ClampedPiecewisePolynomialInterpolator(PiecewisePolynomialInterpolator,
   * double[], double[])}
   */
  @Test
  @DisplayName(
      "Test new ClampedPiecewisePolynomialInterpolator(PiecewisePolynomialInterpolator, double[], double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ClampedPiecewisePolynomialInterpolator.<init>(PiecewisePolynomialInterpolator, double[], double[])"
  })
  void testNewClampedPiecewisePolynomialInterpolator() {
    // Arrange
    ConstrainedCubicSplineInterpolator baseMethod = new ConstrainedCubicSplineInterpolator();

    // Act
    ClampedPiecewisePolynomialInterpolator actualClampedPiecewisePolynomialInterpolator =
        new ClampedPiecewisePolynomialInterpolator(
            baseMethod,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    PiecewisePolynomialInterpolator primaryMethod =
        actualClampedPiecewisePolynomialInterpolator.getPrimaryMethod();
    assertTrue(primaryMethod instanceof ConstrainedCubicSplineInterpolator);
    assertSame(baseMethod, primaryMethod);
  }

  /**
   * Test {@link ClampedPiecewisePolynomialInterpolator#interpolate(double[], double[])} with {@code
   * double[]}, {@code double[]}.
   *
   * <p>Method under test: {@link ClampedPiecewisePolynomialInterpolator#interpolate(double[],
   * double[])}
   */
  @Test
  @DisplayName("Test interpolate(double[], double[]) with 'double[]', 'double[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult ClampedPiecewisePolynomialInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble() {
    // Arrange
    ConstrainedCubicSplineInterpolator baseMethod = mock(ConstrainedCubicSplineInterpolator.class);
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult piecewisePolynomialResult =
        new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1);
    when(baseMethod.interpolate(Mockito.<double[]>any(), Mockito.<double[]>any()))
        .thenReturn(piecewisePolynomialResult);
    ClampedPiecewisePolynomialInterpolator clampedPiecewisePolynomialInterpolator =
        new ClampedPiecewisePolynomialInterpolator(
            baseMethod,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act
    PiecewisePolynomialResult actualInterpolateResult =
        clampedPiecewisePolynomialInterpolator.interpolate(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    verify(baseMethod).interpolate(isA(double[].class), isA(double[].class));
    assertSame(piecewisePolynomialResult, actualInterpolateResult);
  }

  /**
   * Test {@link ClampedPiecewisePolynomialInterpolator#interpolate(double[], double[][])} with
   * {@code double[]}, {@code double[][]}.
   *
   * <p>Method under test: {@link ClampedPiecewisePolynomialInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName("Test interpolate(double[], double[][]) with 'double[]', 'double[][]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult ClampedPiecewisePolynomialInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble2() {
    // Arrange
    ClampedPiecewisePolynomialInterpolator clampedPiecewisePolynomialInterpolator =
        new ClampedPiecewisePolynomialInterpolator(
            new ConstrainedCubicSplineInterpolator(),
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            clampedPiecewisePolynomialInterpolator.interpolate(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}}));
  }

  /**
   * Test {@link ClampedPiecewisePolynomialInterpolator#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <p>Method under test: {@link
   * ClampedPiecewisePolynomialInterpolator#interpolateWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName("Test interpolateWithSensitivity(double[], double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity ClampedPiecewisePolynomialInterpolator.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity() {
    // Arrange
    ConstrainedCubicSplineInterpolator baseMethod = mock(ConstrainedCubicSplineInterpolator.class);
    DoubleArray knots = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity piecewisePolynomialResultsWithSensitivity =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);
    when(baseMethod.interpolateWithSensitivity(Mockito.<double[]>any(), Mockito.<double[]>any()))
        .thenReturn(piecewisePolynomialResultsWithSensitivity);
    ClampedPiecewisePolynomialInterpolator clampedPiecewisePolynomialInterpolator =
        new ClampedPiecewisePolynomialInterpolator(
            baseMethod,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        clampedPiecewisePolynomialInterpolator.interpolateWithSensitivity(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    verify(baseMethod).interpolateWithSensitivity(isA(double[].class), isA(double[].class));
    assertSame(piecewisePolynomialResultsWithSensitivity, actualInterpolateWithSensitivityResult);
  }

  /**
   * Test {@link ClampedPiecewisePolynomialInterpolator#getPrimaryMethod()}.
   *
   * <p>Method under test: {@link ClampedPiecewisePolynomialInterpolator#getPrimaryMethod()}
   */
  @Test
  @DisplayName("Test getPrimaryMethod()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialInterpolator ClampedPiecewisePolynomialInterpolator.getPrimaryMethod()"
  })
  void testGetPrimaryMethod() {
    // Arrange
    ConstrainedCubicSplineInterpolator baseMethod = new ConstrainedCubicSplineInterpolator();
    ClampedPiecewisePolynomialInterpolator clampedPiecewisePolynomialInterpolator =
        new ClampedPiecewisePolynomialInterpolator(
            baseMethod,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act
    PiecewisePolynomialInterpolator actualPrimaryMethod =
        clampedPiecewisePolynomialInterpolator.getPrimaryMethod();

    // Assert
    assertTrue(actualPrimaryMethod instanceof ConstrainedCubicSplineInterpolator);
    assertSame(baseMethod, actualPrimaryMethod);
  }
}
