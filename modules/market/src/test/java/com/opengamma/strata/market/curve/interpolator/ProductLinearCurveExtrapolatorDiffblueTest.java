package com.opengamma.strata.market.curve.interpolator;

import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.interpolator.DoubleQuadraticCurveInterpolator.Bound;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProductLinearCurveExtrapolatorDiffblueTest {
  /**
   * Test Bound {@link ProductLinearCurveExtrapolator.Bound#Bound(DoubleArray, DoubleArray,
   * BoundCurveInterpolator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then calls {@link Bound#doFirstDerivative(double)}.
   * </ul>
   *
   * <p>Method under test: {@link ProductLinearCurveExtrapolator.Bound#Bound(DoubleArray,
   * DoubleArray, BoundCurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Bound new Bound(DoubleArray, DoubleArray, BoundCurveInterpolator); given ten; then calls doFirstDerivative(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void ProductLinearCurveExtrapolator.Bound.<init>(DoubleArray, DoubleArray, BoundCurveInterpolator)"
  })
  void testBoundNewBound_givenTen_thenCallsDoFirstDerivative() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);

    Bound interpolator = mock(Bound.class);
    when(interpolator.doFirstDerivative(anyDouble())).thenReturn(10.0d);

    // Act
    new ProductLinearCurveExtrapolator.Bound(xValues, yValues, interpolator);

    // Assert
    verify(interpolator, atLeast(1)).doFirstDerivative(0.0d);
  }
}
