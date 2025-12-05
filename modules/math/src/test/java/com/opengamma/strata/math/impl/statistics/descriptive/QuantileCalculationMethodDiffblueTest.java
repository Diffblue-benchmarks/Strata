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

class QuantileCalculationMethodDiffblueTest {
  /**
   * Test {@link QuantileCalculationMethod#quantileResultFromUnsorted(double, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Weights min is zero.
   * </ul>
   *
   * <p>Method under test: {@link QuantileCalculationMethod#quantileResultFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileResultFromUnsorted(double, DoubleArray); when filled three; then return Weights min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult QuantileCalculationMethod.quantileResultFromUnsorted(double, DoubleArray)"
  })
  void testQuantileResultFromUnsorted_whenFilledThree_thenReturnWeightsMinIsZero() {
    // Arrange and Act
    QuantileResult actualQuantileResultFromUnsortedResult =
        ExcelInterpolationQuantileMethod.DEFAULT.quantileResultFromUnsorted(
            0.5d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualQuantileResultFromUnsortedResult.getWeights();
    assertEquals(0.0d, weights.min());
    assertEquals(0.0d, actualQuantileResultFromUnsortedResult.getValue());
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
    assertArrayEquals(new int[] {0, 0}, actualQuantileResultFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link QuantileCalculationMethod#quantileResultWithExtrapolationFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>Then return Weights min is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * QuantileCalculationMethod#quantileResultWithExtrapolationFromUnsorted(double, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileResultWithExtrapolationFromUnsorted(double, DoubleArray); then return Weights min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult QuantileCalculationMethod.quantileResultWithExtrapolationFromUnsorted(double, DoubleArray)"
  })
  void testQuantileResultWithExtrapolationFromUnsorted_thenReturnWeightsMinIsZero() {
    // Arrange and Act
    QuantileResult actualQuantileResultWithExtrapolationFromUnsortedResult =
        ExcelInterpolationQuantileMethod.DEFAULT.quantileResultWithExtrapolationFromUnsorted(
            0.5d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualQuantileResultWithExtrapolationFromUnsortedResult.getWeights();
    assertEquals(0.0d, weights.min());
    assertEquals(0.0d, actualQuantileResultWithExtrapolationFromUnsortedResult.getValue());
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
    assertArrayEquals(
        new int[] {0, 0}, actualQuantileResultWithExtrapolationFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link QuantileCalculationMethod#quantileFromSorted(double, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link QuantileCalculationMethod#quantileFromSorted(double, DoubleArray)}
   */
  @Test
  @DisplayName("Test quantileFromSorted(double, DoubleArray); when filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double QuantileCalculationMethod.quantileFromSorted(double, DoubleArray)"})
  void testQuantileFromSorted_whenFilledThree_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ExcelInterpolationQuantileMethod.DEFAULT.quantileFromSorted(0.5d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link QuantileCalculationMethod#quantileFromUnsorted(double, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link QuantileCalculationMethod#quantileFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileFromUnsorted(double, DoubleArray); when DoubleArray with value is ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double QuantileCalculationMethod.quantileFromUnsorted(double, DoubleArray)"})
  void testQuantileFromUnsorted_whenDoubleArrayWithValueIsTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        ExcelInterpolationQuantileMethod.DEFAULT.quantileFromUnsorted(0.5d, DoubleArray.of(10.0d)));
  }

  /**
   * Test {@link QuantileCalculationMethod#quantileFromUnsorted(double, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link QuantileCalculationMethod#quantileFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileFromUnsorted(double, DoubleArray); when filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double QuantileCalculationMethod.quantileFromUnsorted(double, DoubleArray)"})
  void testQuantileFromUnsorted_whenFilledThree_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ExcelInterpolationQuantileMethod.DEFAULT.quantileFromUnsorted(0.5d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link QuantileCalculationMethod#quantileWithExtrapolationFromSorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * QuantileCalculationMethod#quantileWithExtrapolationFromSorted(double, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileWithExtrapolationFromSorted(double, DoubleArray); when filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double QuantileCalculationMethod.quantileWithExtrapolationFromSorted(double, DoubleArray)"
  })
  void testQuantileWithExtrapolationFromSorted_whenFilledThree_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ExcelInterpolationQuantileMethod.DEFAULT.quantileWithExtrapolationFromSorted(
            0.5d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link QuantileCalculationMethod#quantileWithExtrapolationFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * QuantileCalculationMethod#quantileWithExtrapolationFromUnsorted(double, DoubleArray)}
   */
  @Test
  @DisplayName("Test quantileWithExtrapolationFromUnsorted(double, DoubleArray); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double QuantileCalculationMethod.quantileWithExtrapolationFromUnsorted(double, DoubleArray)"
  })
  void testQuantileWithExtrapolationFromUnsorted_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        ExcelInterpolationQuantileMethod.DEFAULT.quantileWithExtrapolationFromUnsorted(
            0.5d, DoubleArray.of(10.0d)));
  }

  /**
   * Test {@link QuantileCalculationMethod#quantileWithExtrapolationFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * QuantileCalculationMethod#quantileWithExtrapolationFromUnsorted(double, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileWithExtrapolationFromUnsorted(double, DoubleArray); when filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double QuantileCalculationMethod.quantileWithExtrapolationFromUnsorted(double, DoubleArray)"
  })
  void testQuantileWithExtrapolationFromUnsorted_whenFilledThree_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ExcelInterpolationQuantileMethod.DEFAULT.quantileWithExtrapolationFromUnsorted(
            0.5d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link QuantileCalculationMethod#expectedShortfallResultFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * QuantileCalculationMethod#expectedShortfallResultFromUnsorted(double, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfallResultFromUnsorted(double, DoubleArray); when filled three; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult QuantileCalculationMethod.expectedShortfallResultFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallResultFromUnsorted_whenFilledThree_thenReturnValueIsZero() {
    // Arrange and Act
    QuantileResult actualExpectedShortfallResultFromUnsortedResult =
        ExcelInterpolationQuantileMethod.DEFAULT.expectedShortfallResultFromUnsorted(
            0.5d, DoubleArray.filled(3));

    // Assert
    assertEquals(0.0d, actualExpectedShortfallResultFromUnsortedResult.getValue());
    DoubleArray weights = actualExpectedShortfallResultFromUnsortedResult.getWeights();
    assertEquals(0.5d, weights.max());
    assertEquals(0.5d, weights.min());
    List<Double> toListResult = weights.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.5d, toListResult.get(0).doubleValue());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(1, weights.dimensions());
    assertEquals(1.0d, weights.sum());
    assertEquals(2, weights.size());
    assertFalse(weights.isEmpty());
    assertArrayEquals(new double[] {0.5d, 0.5d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new int[] {2, 0}, actualExpectedShortfallResultFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link QuantileCalculationMethod#expectedShortfallFromSorted(double, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link QuantileCalculationMethod#expectedShortfallFromSorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfallFromSorted(double, DoubleArray); when filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double QuantileCalculationMethod.expectedShortfallFromSorted(double, DoubleArray)"
  })
  void testExpectedShortfallFromSorted_whenFilledThree_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ExcelInterpolationQuantileMethod.DEFAULT.expectedShortfallFromSorted(
            0.5d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link QuantileCalculationMethod#expectedShortfallFromUnsorted(double, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link QuantileCalculationMethod#expectedShortfallFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfallFromUnsorted(double, DoubleArray); when DoubleArray with value is ten; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double QuantileCalculationMethod.expectedShortfallFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallFromUnsorted_whenDoubleArrayWithValueIsTen_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN,
        ExcelInterpolationQuantileMethod.DEFAULT.expectedShortfallFromUnsorted(
            0.5d, DoubleArray.of(10.0d)));
  }

  /**
   * Test {@link QuantileCalculationMethod#expectedShortfallFromUnsorted(double, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link QuantileCalculationMethod#expectedShortfallFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfallFromUnsorted(double, DoubleArray); when filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double QuantileCalculationMethod.expectedShortfallFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallFromUnsorted_whenFilledThree_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ExcelInterpolationQuantileMethod.DEFAULT.expectedShortfallFromUnsorted(
            0.5d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link QuantileCalculationMethod#checkIndex(double, int, boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link QuantileCalculationMethod#checkIndex(double, int, boolean)}
   */
  @Test
  @DisplayName("Test checkIndex(double, int, boolean); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double QuantileCalculationMethod.checkIndex(double, int, boolean)"})
  void testCheckIndex_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, ExcelInterpolationQuantileMethod.DEFAULT.checkIndex(1.0d, 3, false));
  }

  /**
   * Test {@link QuantileCalculationMethod#checkIndex(double, int, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return three.
   * </ul>
   *
   * <p>Method under test: {@link QuantileCalculationMethod#checkIndex(double, int, boolean)}
   */
  @Test
  @DisplayName("Test checkIndex(double, int, boolean); when 'true'; then return three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double QuantileCalculationMethod.checkIndex(double, int, boolean)"})
  void testCheckIndex_whenTrue_thenReturnThree() {
    // Arrange, Act and Assert
    assertEquals(3.0d, ExcelInterpolationQuantileMethod.DEFAULT.checkIndex(10.0d, 3, true));
  }
}
