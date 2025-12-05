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

class ProductPiecewisePolynomialInterpolatorDiffblueTest {
  /**
   * Test {@link
   * ProductPiecewisePolynomialInterpolator#ProductPiecewisePolynomialInterpolator(PiecewisePolynomialInterpolator)}.
   *
   * <p>Method under test: {@link
   * ProductPiecewisePolynomialInterpolator#ProductPiecewisePolynomialInterpolator(PiecewisePolynomialInterpolator)}
   */
  @Test
  @DisplayName("Test new ProductPiecewisePolynomialInterpolator(PiecewisePolynomialInterpolator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ProductPiecewisePolynomialInterpolator.<init>(PiecewisePolynomialInterpolator)"
  })
  void testNewProductPiecewisePolynomialInterpolator() {
    // Arrange
    ConstrainedCubicSplineInterpolator baseMethod = new ConstrainedCubicSplineInterpolator();

    // Act and Assert
    PiecewisePolynomialInterpolator primaryMethod =
        new ProductPiecewisePolynomialInterpolator(baseMethod).getPrimaryMethod();
    assertTrue(primaryMethod instanceof ConstrainedCubicSplineInterpolator);
    assertSame(baseMethod, primaryMethod);
  }

  /**
   * Test {@link
   * ProductPiecewisePolynomialInterpolator#ProductPiecewisePolynomialInterpolator(PiecewisePolynomialInterpolator,
   * double[], double[])}.
   *
   * <p>Method under test: {@link
   * ProductPiecewisePolynomialInterpolator#ProductPiecewisePolynomialInterpolator(PiecewisePolynomialInterpolator,
   * double[], double[])}
   */
  @Test
  @DisplayName(
      "Test new ProductPiecewisePolynomialInterpolator(PiecewisePolynomialInterpolator, double[], double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ProductPiecewisePolynomialInterpolator.<init>(PiecewisePolynomialInterpolator, double[], double[])"
  })
  void testNewProductPiecewisePolynomialInterpolator2() {
    // Arrange
    ConstrainedCubicSplineInterpolator baseMethod = new ConstrainedCubicSplineInterpolator();

    // Act
    ProductPiecewisePolynomialInterpolator actualProductPiecewisePolynomialInterpolator =
        new ProductPiecewisePolynomialInterpolator(
            baseMethod,
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    PiecewisePolynomialInterpolator primaryMethod =
        actualProductPiecewisePolynomialInterpolator.getPrimaryMethod();
    assertTrue(primaryMethod instanceof ConstrainedCubicSplineInterpolator);
    assertSame(baseMethod, primaryMethod);
  }

  /**
   * Test {@link ProductPiecewisePolynomialInterpolator#interpolate(double[], double[])} with {@code
   * double[]}, {@code double[]}.
   *
   * <p>Method under test: {@link ProductPiecewisePolynomialInterpolator#interpolate(double[],
   * double[])}
   */
  @Test
  @DisplayName("Test interpolate(double[], double[]) with 'double[]', 'double[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult ProductPiecewisePolynomialInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble() {
    // Arrange
    ClampedPiecewisePolynomialInterpolator baseMethod =
        mock(ClampedPiecewisePolynomialInterpolator.class);
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult piecewisePolynomialResult =
        new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1);
    when(baseMethod.interpolate(Mockito.<double[]>any(), Mockito.<double[]>any()))
        .thenReturn(piecewisePolynomialResult);
    ProductPiecewisePolynomialInterpolator productPiecewisePolynomialInterpolator =
        new ProductPiecewisePolynomialInterpolator(
            baseMethod,
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Act
    PiecewisePolynomialResult actualInterpolateResult =
        productPiecewisePolynomialInterpolator.interpolate(
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    verify(baseMethod).interpolate(isA(double[].class), isA(double[].class));
    assertSame(piecewisePolynomialResult, actualInterpolateResult);
  }

  /**
   * Test {@link ProductPiecewisePolynomialInterpolator#interpolate(double[], double[])} with {@code
   * double[]}, {@code double[]}.
   *
   * <p>Method under test: {@link ProductPiecewisePolynomialInterpolator#interpolate(double[],
   * double[])}
   */
  @Test
  @DisplayName("Test interpolate(double[], double[]) with 'double[]', 'double[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult ProductPiecewisePolynomialInterpolator.interpolate(double[], double[])"
  })
  void testInterpolateWithDoubleDouble2() {
    // Arrange
    ClampedPiecewisePolynomialInterpolator baseMethod =
        mock(ClampedPiecewisePolynomialInterpolator.class);
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult piecewisePolynomialResult =
        new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1);
    when(baseMethod.interpolate(Mockito.<double[]>any(), Mockito.<double[]>any()))
        .thenReturn(piecewisePolynomialResult);

    // Act
    PiecewisePolynomialResult actualInterpolateResult =
        new ProductPiecewisePolynomialInterpolator(baseMethod)
            .interpolate(
                new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    verify(baseMethod).interpolate(isA(double[].class), isA(double[].class));
    assertSame(piecewisePolynomialResult, actualInterpolateResult);
  }

  /**
   * Test {@link ProductPiecewisePolynomialInterpolator#interpolate(double[], double[][])} with
   * {@code double[]}, {@code double[][]}.
   *
   * <p>Method under test: {@link ProductPiecewisePolynomialInterpolator#interpolate(double[],
   * double[][])}
   */
  @Test
  @DisplayName("Test interpolate(double[], double[][]) with 'double[]', 'double[][]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResult ProductPiecewisePolynomialInterpolator.interpolate(double[], double[][])"
  })
  void testInterpolateWithDoubleDouble3() {
    // Arrange
    ProductPiecewisePolynomialInterpolator productPiecewisePolynomialInterpolator =
        new ProductPiecewisePolynomialInterpolator(
            new ConstrainedCubicSplineInterpolator(),
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            productPiecewisePolynomialInterpolator.interpolate(
                new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
                new double[][] {new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d}}));
  }

  /**
   * Test {@link ProductPiecewisePolynomialInterpolator#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <p>Method under test: {@link
   * ProductPiecewisePolynomialInterpolator#interpolateWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName("Test interpolateWithSensitivity(double[], double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity ProductPiecewisePolynomialInterpolator.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity() {
    // Arrange
    ClampedPiecewisePolynomialInterpolator baseMethod =
        mock(ClampedPiecewisePolynomialInterpolator.class);
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity piecewisePolynomialResultsWithSensitivity =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);
    when(baseMethod.interpolateWithSensitivity(Mockito.<double[]>any(), Mockito.<double[]>any()))
        .thenReturn(piecewisePolynomialResultsWithSensitivity);
    ProductPiecewisePolynomialInterpolator productPiecewisePolynomialInterpolator =
        new ProductPiecewisePolynomialInterpolator(
            baseMethod,
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        productPiecewisePolynomialInterpolator.interpolateWithSensitivity(
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    verify(baseMethod).interpolateWithSensitivity(isA(double[].class), isA(double[].class));
    assertSame(piecewisePolynomialResultsWithSensitivity, actualInterpolateWithSensitivityResult);
  }

  /**
   * Test {@link ProductPiecewisePolynomialInterpolator#interpolateWithSensitivity(double[],
   * double[])}.
   *
   * <p>Method under test: {@link
   * ProductPiecewisePolynomialInterpolator#interpolateWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName("Test interpolateWithSensitivity(double[], double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialResultsWithSensitivity ProductPiecewisePolynomialInterpolator.interpolateWithSensitivity(double[], double[])"
  })
  void testInterpolateWithSensitivity2() {
    // Arrange
    ClampedPiecewisePolynomialInterpolator baseMethod =
        mock(ClampedPiecewisePolynomialInterpolator.class);
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity piecewisePolynomialResultsWithSensitivity =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);
    when(baseMethod.interpolateWithSensitivity(Mockito.<double[]>any(), Mockito.<double[]>any()))
        .thenReturn(piecewisePolynomialResultsWithSensitivity);

    // Act
    PiecewisePolynomialResultsWithSensitivity actualInterpolateWithSensitivityResult =
        new ProductPiecewisePolynomialInterpolator(baseMethod)
            .interpolateWithSensitivity(
                new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
                new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Assert
    verify(baseMethod).interpolateWithSensitivity(isA(double[].class), isA(double[].class));
    assertSame(piecewisePolynomialResultsWithSensitivity, actualInterpolateWithSensitivityResult);
  }

  /**
   * Test {@link ProductPiecewisePolynomialInterpolator#getPrimaryMethod()}.
   *
   * <p>Method under test: {@link ProductPiecewisePolynomialInterpolator#getPrimaryMethod()}
   */
  @Test
  @DisplayName("Test getPrimaryMethod()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialInterpolator ProductPiecewisePolynomialInterpolator.getPrimaryMethod()"
  })
  void testGetPrimaryMethod() {
    // Arrange
    ConstrainedCubicSplineInterpolator baseMethod = new ConstrainedCubicSplineInterpolator();
    ProductPiecewisePolynomialInterpolator productPiecewisePolynomialInterpolator =
        new ProductPiecewisePolynomialInterpolator(
            baseMethod,
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
            new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d});

    // Act
    PiecewisePolynomialInterpolator actualPrimaryMethod =
        productPiecewisePolynomialInterpolator.getPrimaryMethod();

    // Assert
    assertTrue(actualPrimaryMethod instanceof ConstrainedCubicSplineInterpolator);
    assertSame(baseMethod, actualPrimaryMethod);
  }
}
