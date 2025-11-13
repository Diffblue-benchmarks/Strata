package com.opengamma.strata.market.curve.interpolator;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.interpolator.DiscountFactorLinearRightZeroRateCurveExtrapolator.Bound;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountFactorLinearRightZeroRateCurveExtrapolatorDiffblueTest {
  /**
   * Test Bound {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Bound new Bound(DoubleArray, DoubleArray, BoundCurveInterpolator); given DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Bound.<init>(DoubleArray, DoubleArray, BoundCurveInterpolator)"})
  void testBoundNewBound_givenDoubleArray() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);

    DoubleQuadraticCurveInterpolator.Bound interpolator =
        mock(DoubleQuadraticCurveInterpolator.Bound.class);
    when(interpolator.doParameterSensitivity(anyDouble())).thenReturn(DoubleArray.of());

    // Act
    new Bound(xValues, yValues, interpolator);

    // Assert
    verify(interpolator).doParameterSensitivity(0.0d);
  }

  /**
   * Test Bound {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}.
   *
   * <ul>
   *   <li>Given filled three.
   * </ul>
   *
   * <p>Method under test: {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Bound new Bound(DoubleArray, DoubleArray, BoundCurveInterpolator); given filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Bound.<init>(DoubleArray, DoubleArray, BoundCurveInterpolator)"})
  void testBoundNewBound_givenFilledThree() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);

    DoubleQuadraticCurveInterpolator.Bound interpolator =
        mock(DoubleQuadraticCurveInterpolator.Bound.class);
    when(interpolator.doParameterSensitivity(anyDouble())).thenReturn(DoubleArray.filled(3));

    // Act
    new Bound(xValues, yValues, interpolator);

    // Assert
    verify(interpolator).doParameterSensitivity(0.0d);
  }

  /**
   * Test Bound {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Bound new Bound(DoubleArray, DoubleArray, BoundCurveInterpolator); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Bound.<init>(DoubleArray, DoubleArray, BoundCurveInterpolator)"})
  void testBoundNewBound_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);

    DoubleQuadraticCurveInterpolator.Bound interpolator =
        mock(DoubleQuadraticCurveInterpolator.Bound.class);
    when(interpolator.doParameterSensitivity(anyDouble()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new Bound(xValues, yValues, interpolator));
    verify(interpolator).doParameterSensitivity(0.0d);
  }
}
