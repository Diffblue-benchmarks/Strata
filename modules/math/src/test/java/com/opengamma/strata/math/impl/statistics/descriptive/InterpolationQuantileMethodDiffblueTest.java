package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InterpolationQuantileMethodDiffblueTest {
  /**
   * Test {@link InterpolationQuantileMethod#quantile(double, DoubleArray, boolean)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Weights min is zero.
   * </ul>
   *
   * <p>Method under test: {@link InterpolationQuantileMethod#quantile(double, DoubleArray,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test quantile(double, DoubleArray, boolean); when filled three; then return Weights min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult InterpolationQuantileMethod.quantile(double, DoubleArray, boolean)"
  })
  void testQuantile_whenFilledThree_thenReturnWeightsMinIsZero() {
    // Arrange and Act
    QuantileResult actualQuantileResult =
        ExcelInterpolationQuantileMethod.DEFAULT.quantile(0.5d, DoubleArray.filled(3), true);

    // Assert
    DoubleArray weights = actualQuantileResult.getWeights();
    assertEquals(0.0d, weights.min());
    assertEquals(0.0d, actualQuantileResult.getValue());
    List<Double> toListResult = weights.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(1, weights.dimensions());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.sum());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(2, weights.size());
    assertFalse(weights.isEmpty());
    assertArrayEquals(new double[] {0.0d, 1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {0, 0}, actualQuantileResult.getIndices());
  }

  /**
   * Test {@link InterpolationQuantileMethod#quantile(double, DoubleArray, boolean)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Weights min is zero.
   * </ul>
   *
   * <p>Method under test: {@link InterpolationQuantileMethod#quantile(double, DoubleArray,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test quantile(double, DoubleArray, boolean); when filled three; then return Weights min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult InterpolationQuantileMethod.quantile(double, DoubleArray, boolean)"
  })
  void testQuantile_whenFilledThree_thenReturnWeightsMinIsZero2() {
    // Arrange and Act
    QuantileResult actualQuantileResult =
        ExcelInterpolationQuantileMethod.DEFAULT.quantile(0.5d, DoubleArray.filled(3), false);

    // Assert
    DoubleArray weights = actualQuantileResult.getWeights();
    assertEquals(0.0d, weights.min());
    assertEquals(0.0d, actualQuantileResult.getValue());
    List<Double> toListResult = weights.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(1, weights.dimensions());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.sum());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(2, weights.size());
    assertFalse(weights.isEmpty());
    assertArrayEquals(new double[] {0.0d, 1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {0, 0}, actualQuantileResult.getIndices());
  }

  /**
   * Test {@link InterpolationQuantileMethod#expectedShortfall(double, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return Weights max is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolationQuantileMethod#expectedShortfall(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfall(double, DoubleArray); when '0.5'; then return Weights max is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult InterpolationQuantileMethod.expectedShortfall(double, DoubleArray)"
  })
  void testExpectedShortfall_when05_thenReturnWeightsMaxIs05() {
    // Arrange and Act
    QuantileResult actualExpectedShortfallResult =
        ExcelInterpolationQuantileMethod.DEFAULT.expectedShortfall(0.5d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualExpectedShortfallResult.getWeights();
    assertEquals(0.5d, weights.max());
    assertEquals(0.5d, weights.min());
    List<Double> toListResult = weights.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.5d, toListResult.get(0).doubleValue());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, weights.sum());
    assertArrayEquals(new double[] {0.5d, 0.5d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {2, 0}, actualExpectedShortfallResult.getIndices());
  }

  /**
   * Test {@link InterpolationQuantileMethod#expectedShortfall(double, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Weights max is {@code 1.000000082640371}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolationQuantileMethod#expectedShortfall(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfall(double, DoubleArray); when filled three; then return Weights max is '1.000000082640371'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult InterpolationQuantileMethod.expectedShortfall(double, DoubleArray)"
  })
  void testExpectedShortfall_whenFilledThree_thenReturnWeightsMaxIs1000000082640371() {
    // Arrange and Act
    QuantileResult actualExpectedShortfallResult =
        ExcelInterpolationQuantileMethod.DEFAULT.expectedShortfall(1.0E-10d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualExpectedShortfallResult.getWeights();
    assertEquals(1.000000082640371d, weights.max());
    List<Double> toListResult = weights.toList();
    assertEquals(2, toListResult.size());
    assertEquals(1.000000082640371d, toListResult.get(0).doubleValue());
    assertEquals(1.000000082740371d, weights.sum());
    assertEquals(1.0000001654807488E-10d, weights.min());
    assertEquals(1.0000001654807488E-10d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {1.000000082640371d, 1.0000001654807488E-10d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {2, 0}, actualExpectedShortfallResult.getIndices());
  }
}
