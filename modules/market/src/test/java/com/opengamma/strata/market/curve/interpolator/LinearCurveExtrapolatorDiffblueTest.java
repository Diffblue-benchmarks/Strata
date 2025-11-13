package com.opengamma.strata.market.curve.interpolator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.interpolator.LinearCurveExtrapolator.Bound;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LinearCurveExtrapolatorDiffblueTest {
  /**
   * Test Bound {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   *   <li>Then return leftExtrapolate ten is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Bound new Bound(DoubleArray, DoubleArray, BoundCurveInterpolator); given DoubleArray; then return leftExtrapolate ten is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Bound.<init>(DoubleArray, DoubleArray, BoundCurveInterpolator)"})
  void testBoundNewBound_givenDoubleArray_thenReturnLeftExtrapolateTenIsNaN() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);

    DoubleQuadraticCurveInterpolator.Bound interpolator =
        mock(DoubleQuadraticCurveInterpolator.Bound.class);
    when(interpolator.doParameterSensitivity(anyDouble())).thenReturn(DoubleArray.of());

    // Act
    Bound actualBound = new Bound(xValues, yValues, interpolator);

    // Assert
    verify(interpolator, atLeast(1)).doParameterSensitivity(0.0d);
    assertEquals(Double.NaN, actualBound.leftExtrapolate(10.0d));
    assertEquals(Double.NaN, actualBound.leftExtrapolateFirstDerivative(10.0d));
    assertEquals(Double.NaN, actualBound.rightExtrapolate(10.0d));
  }
}
