package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PiecewisePolynomialInterpolator2DDiffblueTest {
  /**
   * Test {@link PiecewisePolynomialInterpolator2D#getValue(DoubleMatrix, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator2D#getValue(DoubleMatrix, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test getValue(DoubleMatrix, double, double, double, double); when DoubleMatrix; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialInterpolator2D.getValue(DoubleMatrix, double, double, double, double)"
  })
  void testGetValue_whenDoubleMatrix_thenReturnZero() {
    // Arrange
    BicubicSplineInterpolator bicubicSplineInterpolator =
        new BicubicSplineInterpolator(new ConstrainedCubicSplineInterpolator());

    // Act and Assert
    assertEquals(
        0.0d, bicubicSplineInterpolator.getValue(DoubleMatrix.of(), 4.0d, 1.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialInterpolator2D#getValue(DoubleMatrix, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When identity three.
   *   <li>Then return {@code 2971.0}.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialInterpolator2D#getValue(DoubleMatrix, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test getValue(DoubleMatrix, double, double, double, double); when identity three; then return '2971.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialInterpolator2D.getValue(DoubleMatrix, double, double, double, double)"
  })
  void testGetValue_whenIdentityThree_thenReturn29710() {
    // Arrange
    BicubicSplineInterpolator bicubicSplineInterpolator =
        new BicubicSplineInterpolator(new ConstrainedCubicSplineInterpolator());

    // Act and Assert
    assertEquals(
        2971.0d,
        bicubicSplineInterpolator.getValue(DoubleMatrix.identity(3), 4.0d, 1.0d, 10.0d, 10.0d));
  }
}
