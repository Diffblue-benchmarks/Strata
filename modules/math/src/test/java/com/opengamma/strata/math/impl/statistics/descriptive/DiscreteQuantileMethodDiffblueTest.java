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

class DiscreteQuantileMethodDiffblueTest {
  /**
   * Test {@link DiscreteQuantileMethod#quantile(double, DoubleArray, boolean)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link DiscreteQuantileMethod#quantile(double, DoubleArray, boolean)}
   */
  @Test
  @DisplayName(
      "Test quantile(double, DoubleArray, boolean); when filled three; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult DiscreteQuantileMethod.quantile(double, DoubleArray, boolean)"
  })
  void testQuantile_whenFilledThree_thenReturnValueIsZero() {
    // Arrange and Act
    QuantileResult actualQuantileResult =
        IndexAboveQuantileMethod.DEFAULT.quantile(0.5d, DoubleArray.filled(3), true);

    // Assert
    assertEquals(0.0d, actualQuantileResult.getValue());
    DoubleArray weights = actualQuantileResult.getWeights();
    assertEquals(1, weights.dimensions());
    assertEquals(1, weights.size());
    List<Double> toListResult = weights.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.min());
    assertEquals(1.0d, weights.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertFalse(weights.isEmpty());
    assertArrayEquals(new double[] {1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {0}, actualQuantileResult.getIndices());
  }

  /**
   * Test {@link DiscreteQuantileMethod#quantile(double, DoubleArray, boolean)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link DiscreteQuantileMethod#quantile(double, DoubleArray, boolean)}
   */
  @Test
  @DisplayName(
      "Test quantile(double, DoubleArray, boolean); when filled three; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult DiscreteQuantileMethod.quantile(double, DoubleArray, boolean)"
  })
  void testQuantile_whenFilledThree_thenReturnValueIsZero2() {
    // Arrange and Act
    QuantileResult actualQuantileResult =
        IndexAboveQuantileMethod.DEFAULT.quantile(0.5d, DoubleArray.filled(3), false);

    // Assert
    assertEquals(0.0d, actualQuantileResult.getValue());
    DoubleArray weights = actualQuantileResult.getWeights();
    assertEquals(1, weights.dimensions());
    assertEquals(1, weights.size());
    List<Double> toListResult = weights.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.min());
    assertEquals(1.0d, weights.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertFalse(weights.isEmpty());
    assertArrayEquals(new double[] {1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {0}, actualQuantileResult.getIndices());
  }

  /**
   * Test {@link DiscreteQuantileMethod#expectedShortfall(double, DoubleArray)}.
   *
   * <ul>
   *   <li>Given {@link IndexAboveQuantileMethod#DEFAULT}.
   *   <li>When filled three.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link DiscreteQuantileMethod#expectedShortfall(double, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfall(double, DoubleArray); given DEFAULT; when filled three; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult DiscreteQuantileMethod.expectedShortfall(double, DoubleArray)"
  })
  void testExpectedShortfall_givenDefault_whenFilledThree_thenReturnValueIsZero() {
    // Arrange and Act
    QuantileResult actualExpectedShortfallResult =
        IndexAboveQuantileMethod.DEFAULT.expectedShortfall(0.5d, DoubleArray.filled(3));

    // Assert
    assertEquals(0.0d, actualExpectedShortfallResult.getValue());
    DoubleArray weights = actualExpectedShortfallResult.getWeights();
    assertEquals(0.3333333333333333d, weights.min());
    List<Double> toListResult = weights.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.3333333333333333d, toListResult.get(1).doubleValue());
    assertEquals(0.6666666666666666d, weights.max());
    assertEquals(0.6666666666666666d, toListResult.get(0).doubleValue());
    assertEquals(1, weights.dimensions());
    assertEquals(1.0d, weights.sum());
    assertEquals(2, weights.size());
    assertFalse(weights.isEmpty());
    assertArrayEquals(
        new double[] {0.6666666666666666d, 0.3333333333333333d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {2, 0}, actualExpectedShortfallResult.getIndices());
  }

  /**
   * Test {@link DiscreteQuantileMethod#expectedShortfall(double, DoubleArray)}.
   *
   * <ul>
   *   <li>Given {@link IndexAboveQuantileMethod} (default constructor).
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link DiscreteQuantileMethod#expectedShortfall(double, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfall(double, DoubleArray); given IndexAboveQuantileMethod (default constructor); then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult DiscreteQuantileMethod.expectedShortfall(double, DoubleArray)"
  })
  void testExpectedShortfall_givenIndexAboveQuantileMethod_thenReturnValueIsZero() {
    // Arrange
    IndexAboveQuantileMethod indexAboveQuantileMethod = new IndexAboveQuantileMethod();

    // Act
    QuantileResult actualExpectedShortfallResult =
        indexAboveQuantileMethod.expectedShortfall(0.5d, DoubleArray.filled(3));

    // Assert
    assertEquals(0.0d, actualExpectedShortfallResult.getValue());
    DoubleArray weights = actualExpectedShortfallResult.getWeights();
    assertEquals(0.3333333333333333d, weights.min());
    List<Double> toListResult = weights.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.3333333333333333d, toListResult.get(1).doubleValue());
    assertEquals(0.6666666666666666d, weights.max());
    assertEquals(0.6666666666666666d, toListResult.get(0).doubleValue());
    assertEquals(1, weights.dimensions());
    assertEquals(1.0d, weights.sum());
    assertEquals(2, weights.size());
    assertFalse(weights.isEmpty());
    assertArrayEquals(
        new double[] {0.6666666666666666d, 0.3333333333333333d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {2, 0}, actualExpectedShortfallResult.getIndices());
  }
}
