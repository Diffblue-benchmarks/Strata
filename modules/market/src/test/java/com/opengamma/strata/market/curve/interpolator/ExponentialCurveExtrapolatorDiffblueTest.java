package com.opengamma.strata.market.curve.interpolator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.interpolator.ExponentialCurveExtrapolator.Bound;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExponentialCurveExtrapolatorDiffblueTest {
  /**
   * Test Bound {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return leftExtrapolate ten is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#Bound(DoubleArray, DoubleArray, BoundCurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Bound new Bound(DoubleArray, DoubleArray, BoundCurveInterpolator); when filled three; then return leftExtrapolate ten is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Bound.<init>(DoubleArray, DoubleArray, BoundCurveInterpolator)"})
  void testBoundNewBound_whenFilledThree_thenReturnLeftExtrapolateTenIsZero() {
    // Arrange
    DoubleArray xValues = DoubleArray.filled(3);

    // Act
    Bound actualBound = new Bound(xValues, DoubleArray.filled(3), null);

    // Assert
    assertEquals(0.0d, actualBound.leftExtrapolate(10.0d));
    assertEquals(0.0d, actualBound.rightExtrapolate(10.0d));
    DoubleArray leftExtrapolateParameterSensitivityResult =
        actualBound.leftExtrapolateParameterSensitivity(10.0d);
    assertEquals(1, leftExtrapolateParameterSensitivityResult.dimensions());
    assertEquals(3, leftExtrapolateParameterSensitivityResult.size());
    assertEquals(3, leftExtrapolateParameterSensitivityResult.toList().size());
    assertFalse(leftExtrapolateParameterSensitivityResult.isEmpty());
    assertEquals(Double.NaN, leftExtrapolateParameterSensitivityResult.max());
    assertEquals(Double.NaN, leftExtrapolateParameterSensitivityResult.min());
    assertEquals(Double.NaN, leftExtrapolateParameterSensitivityResult.sum());
    assertEquals(Double.NaN, actualBound.leftExtrapolateFirstDerivative(10.0d));
    assertArrayEquals(
        new double[] {Double.NaN, 0.0d, 0.0d},
        leftExtrapolateParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }
}
