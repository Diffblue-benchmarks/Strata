package com.opengamma.strata.pricer.impl.tree;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.product.common.PutCall;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OptionFunctionDiffblueTest {
  /**
   * Test {@link OptionFunction#getNextOptionValues(double, DoubleMatrix, DoubleArray, DoubleArray,
   * int)} with {@code discountFactor}, {@code transitionProbability}, {@code stateValue}, {@code
   * value}, {@code i}.
   *
   * <p>Method under test: {@link OptionFunction#getNextOptionValues(double, DoubleMatrix,
   * DoubleArray, DoubleArray, int)}
   */
  @Test
  @DisplayName(
      "Test getNextOptionValues(double, DoubleMatrix, DoubleArray, DoubleArray, int) with 'discountFactor', 'transitionProbability', 'stateValue', 'value', 'i'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray OptionFunction.getNextOptionValues(double, DoubleMatrix, DoubleArray, DoubleArray, int)"
  })
  void testGetNextOptionValuesWithDiscountFactorTransitionProbabilityStateValueValueI() {
    // Arrange
    EuropeanVanillaOptionFunction ofResult =
        EuropeanVanillaOptionFunction.of(10.0d, 10.0d, PutCall.PUT, 10);
    DoubleMatrix transitionProbability = DoubleMatrix.identity(3);
    DoubleArray stateValue = DoubleArray.of();

    // Act
    DoubleArray actualNextOptionValues =
        ofResult.getNextOptionValues(
            10.0d, transitionProbability, stateValue, DoubleArray.filled(3), 0);

    // Assert
    assertEquals(0.0d, actualNextOptionValues.max());
    assertEquals(0.0d, actualNextOptionValues.min());
    assertEquals(0.0d, actualNextOptionValues.sum());
    List<Double> toListResult = actualNextOptionValues.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(1, actualNextOptionValues.dimensions());
    assertEquals(1, actualNextOptionValues.size());
    assertFalse(actualNextOptionValues.isEmpty());
    assertArrayEquals(new double[] {0.0d}, actualNextOptionValues.toArrayUnsafe(), 0.0);
  }
}
