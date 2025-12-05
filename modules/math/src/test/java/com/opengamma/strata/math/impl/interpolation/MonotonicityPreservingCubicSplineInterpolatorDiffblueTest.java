package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MonotonicityPreservingCubicSplineInterpolatorDiffblueTest {
  /**
   * Test {@link
   * MonotonicityPreservingCubicSplineInterpolator#MonotonicityPreservingCubicSplineInterpolator(PiecewisePolynomialInterpolator)}.
   *
   * <p>Method under test: {@link
   * MonotonicityPreservingCubicSplineInterpolator#MonotonicityPreservingCubicSplineInterpolator(PiecewisePolynomialInterpolator)}
   */
  @Test
  @DisplayName(
      "Test new MonotonicityPreservingCubicSplineInterpolator(PiecewisePolynomialInterpolator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void MonotonicityPreservingCubicSplineInterpolator.<init>(PiecewisePolynomialInterpolator)"
  })
  void testNewMonotonicityPreservingCubicSplineInterpolator() {
    // Arrange
    ConstrainedCubicSplineInterpolator method = new ConstrainedCubicSplineInterpolator();

    // Act and Assert
    PiecewisePolynomialInterpolator primaryMethod =
        new MonotonicityPreservingCubicSplineInterpolator(method).getPrimaryMethod();
    assertTrue(primaryMethod instanceof ConstrainedCubicSplineInterpolator);
    assertSame(method, primaryMethod);
  }

  /**
   * Test {@link MonotonicityPreservingCubicSplineInterpolator#getPrimaryMethod()}.
   *
   * <p>Method under test: {@link MonotonicityPreservingCubicSplineInterpolator#getPrimaryMethod()}
   */
  @Test
  @DisplayName("Test getPrimaryMethod()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PiecewisePolynomialInterpolator MonotonicityPreservingCubicSplineInterpolator.getPrimaryMethod()"
  })
  void testGetPrimaryMethod() {
    // Arrange
    ConstrainedCubicSplineInterpolator method = new ConstrainedCubicSplineInterpolator();

    // Act
    PiecewisePolynomialInterpolator actualPrimaryMethod =
        new MonotonicityPreservingCubicSplineInterpolator(method).getPrimaryMethod();

    // Assert
    assertTrue(actualPrimaryMethod instanceof ConstrainedCubicSplineInterpolator);
    assertSame(method, actualPrimaryMethod);
  }
}
