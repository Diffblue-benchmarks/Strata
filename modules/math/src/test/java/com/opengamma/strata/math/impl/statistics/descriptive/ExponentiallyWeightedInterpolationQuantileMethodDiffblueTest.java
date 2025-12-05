package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExponentiallyWeightedInterpolationQuantileMethodDiffblueTest {
  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#ExponentiallyWeightedInterpolationQuantileMethod(double)}.
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#ExponentiallyWeightedInterpolationQuantileMethod(double)}
   */
  @Test
  @DisplayName("Test new ExponentiallyWeightedInterpolationQuantileMethod(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ExponentiallyWeightedInterpolationQuantileMethod.<init>(double)"})
  void testNewExponentiallyWeightedInterpolationQuantileMethod() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {0.14285714285714285d, 0.2857142857142857d, 0.5714285714285714d},
        new ExponentiallyWeightedInterpolationQuantileMethod(0.5d).weights(3),
        0.0);
  }

  /**
   * Test {@link ExponentiallyWeightedInterpolationQuantileMethod#quantileResultFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return Weights min is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileResultFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileResultFromUnsorted(double, DoubleArray); when '0.5'; then return Weights min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.quantileResultFromUnsorted(double, DoubleArray)"
  })
  void testQuantileResultFromUnsorted_when05_thenReturnWeightsMinIsZero() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act
    QuantileResult actualQuantileResultFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod.quantileResultFromUnsorted(
            0.5d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualQuantileResultFromUnsortedResult.getWeights();
    assertEquals(0.0d, weights.min());
    assertEquals(0.0d, actualQuantileResultFromUnsortedResult.getValue());
    List<Double> toListResult = weights.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(0.125d, toListResult.get(0).doubleValue());
    assertEquals(0.875d, weights.max());
    assertEquals(0.875d, toListResult.get(1).doubleValue());
    assertEquals(1, weights.dimensions());
    assertEquals(1.0d, weights.sum());
    assertEquals(3, weights.size());
    assertFalse(weights.isEmpty());
    assertArrayEquals(new double[] {0.125d, 0.875d, 0.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {2, 0, 1}, actualQuantileResultFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileResultWithExtrapolationFromUnsorted(double,
   * DoubleArray)}.
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileResultWithExtrapolationFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test quantileResultWithExtrapolationFromUnsorted(double, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.quantileResultWithExtrapolationFromUnsorted(double, DoubleArray)"
  })
  void testQuantileResultWithExtrapolationFromUnsorted() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(Double.NaN);

    // Act
    QuantileResult actualQuantileResultWithExtrapolationFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod
            .quantileResultWithExtrapolationFromUnsorted(-9.0d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualQuantileResultWithExtrapolationFromUnsortedResult.getWeights();
    assertEquals(1, weights.size());
    List<Double> toListResult = weights.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.min());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new int[] {1}, actualQuantileResultWithExtrapolationFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileResultWithExtrapolationFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>Then return Weights min is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileResultWithExtrapolationFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileResultWithExtrapolationFromUnsorted(double, DoubleArray); then return Weights min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.quantileResultWithExtrapolationFromUnsorted(double, DoubleArray)"
  })
  void testQuantileResultWithExtrapolationFromUnsorted_thenReturnWeightsMinIsZero() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act
    QuantileResult actualQuantileResultWithExtrapolationFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod
            .quantileResultWithExtrapolationFromUnsorted(0.5d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualQuantileResultWithExtrapolationFromUnsortedResult.getWeights();
    assertEquals(0.0d, weights.min());
    List<Double> toListResult = weights.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(0.125d, toListResult.get(0).doubleValue());
    assertEquals(0.875d, weights.max());
    assertEquals(0.875d, toListResult.get(1).doubleValue());
    assertEquals(3, weights.size());
    assertArrayEquals(new double[] {0.125d, 0.875d, 0.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new int[] {2, 0, 1}, actualQuantileResultWithExtrapolationFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileResultWithExtrapolationFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>Then return Weights size is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileResultWithExtrapolationFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileResultWithExtrapolationFromUnsorted(double, DoubleArray); then return Weights size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.quantileResultWithExtrapolationFromUnsorted(double, DoubleArray)"
  })
  void testQuantileResultWithExtrapolationFromUnsorted_thenReturnWeightsSizeIsOne() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act
    QuantileResult actualQuantileResultWithExtrapolationFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod
            .quantileResultWithExtrapolationFromUnsorted(10.0d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualQuantileResultWithExtrapolationFromUnsortedResult.getWeights();
    assertEquals(1, weights.size());
    List<Double> toListResult = weights.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.min());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new int[] {1}, actualQuantileResultWithExtrapolationFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link ExponentiallyWeightedInterpolationQuantileMethod#quantileFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileFromUnsorted(double, DoubleArray)}
   */
  @Test
  @DisplayName("Test quantileFromUnsorted(double, DoubleArray); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double ExponentiallyWeightedInterpolationQuantileMethod.quantileFromUnsorted(double, DoubleArray)"
  })
  void testQuantileFromUnsorted_when05_thenReturnZero() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act and Assert
    assertEquals(
        0.0d,
        exponentiallyWeightedInterpolationQuantileMethod.quantileFromUnsorted(
            0.5d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileWithExtrapolationFromUnsorted(double,
   * DoubleArray)}.
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileWithExtrapolationFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test quantileWithExtrapolationFromUnsorted(double, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double ExponentiallyWeightedInterpolationQuantileMethod.quantileWithExtrapolationFromUnsorted(double, DoubleArray)"
  })
  void testQuantileWithExtrapolationFromUnsorted() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(Double.NaN);

    // Act and Assert
    assertEquals(
        0.0d,
        exponentiallyWeightedInterpolationQuantileMethod.quantileWithExtrapolationFromUnsorted(
            -9.0d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileWithExtrapolationFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileWithExtrapolationFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileWithExtrapolationFromUnsorted(double, DoubleArray); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double ExponentiallyWeightedInterpolationQuantileMethod.quantileWithExtrapolationFromUnsorted(double, DoubleArray)"
  })
  void testQuantileWithExtrapolationFromUnsorted_when05_thenReturnZero() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act and Assert
    assertEquals(
        0.0d,
        exponentiallyWeightedInterpolationQuantileMethod.quantileWithExtrapolationFromUnsorted(
            0.5d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileWithExtrapolationFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileWithExtrapolationFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileWithExtrapolationFromUnsorted(double, DoubleArray); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double ExponentiallyWeightedInterpolationQuantileMethod.quantileWithExtrapolationFromUnsorted(double, DoubleArray)"
  })
  void testQuantileWithExtrapolationFromUnsorted_whenTen_thenReturnZero() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act and Assert
    assertEquals(
        0.0d,
        exponentiallyWeightedInterpolationQuantileMethod.quantileWithExtrapolationFromUnsorted(
            10.0d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallResultFromUnsorted(double,
   * DoubleArray)}.
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallResultFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test expectedShortfallResultFromUnsorted(double, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.expectedShortfallResultFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallResultFromUnsorted() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(Double.NaN);

    // Act
    QuantileResult actualExpectedShortfallResultFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod.expectedShortfallResultFromUnsorted(
            -9.0d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualExpectedShortfallResultFromUnsortedResult.getWeights();
    assertEquals(1, weights.size());
    List<Double> toListResult = weights.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.min());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {1}, actualExpectedShortfallResultFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallResultFromUnsorted(double,
   * DoubleArray)}.
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallResultFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test expectedShortfallResultFromUnsorted(double, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.expectedShortfallResultFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallResultFromUnsorted2() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act
    QuantileResult actualExpectedShortfallResultFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod.expectedShortfallResultFromUnsorted(
            0.5d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualExpectedShortfallResultFromUnsortedResult.getWeights();
    assertEquals(0.008928571428571428d, weights.min());
    List<Double> toListResult = weights.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.008928571428571428d, toListResult.get(0).doubleValue());
    assertEquals(0.2767857142857143d, toListResult.get(1).doubleValue());
    assertEquals(0.7142857142857142d, weights.max());
    assertEquals(0.7142857142857142d, toListResult.get(2).doubleValue());
    assertEquals(3, weights.size());
    assertArrayEquals(
        new double[] {0.008928571428571428d, 0.2767857142857143d, 0.7142857142857142d},
        weights.toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new int[] {2, 0, 1}, actualExpectedShortfallResultFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallResultFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Weights size is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallResultFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfallResultFromUnsorted(double, DoubleArray); when ten; then return Weights size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.expectedShortfallResultFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallResultFromUnsorted_whenTen_thenReturnWeightsSizeIsOne() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act
    QuantileResult actualExpectedShortfallResultFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod.expectedShortfallResultFromUnsorted(
            10.0d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualExpectedShortfallResultFromUnsortedResult.getWeights();
    assertEquals(1, weights.size());
    List<Double> toListResult = weights.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.min());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {1}, actualExpectedShortfallResultFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallFromUnsorted(double,
   * DoubleArray)}.
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test expectedShortfallFromUnsorted(double, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double ExponentiallyWeightedInterpolationQuantileMethod.expectedShortfallFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallFromUnsorted() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(Double.NaN);

    // Act and Assert
    assertEquals(
        0.0d,
        exponentiallyWeightedInterpolationQuantileMethod.expectedShortfallFromUnsorted(
            -9.0d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfallFromUnsorted(double, DoubleArray); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double ExponentiallyWeightedInterpolationQuantileMethod.expectedShortfallFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallFromUnsorted_when05_thenReturnZero() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act and Assert
    assertEquals(
        0.0d,
        exponentiallyWeightedInterpolationQuantileMethod.expectedShortfallFromUnsorted(
            0.5d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfallFromUnsorted(double, DoubleArray); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double ExponentiallyWeightedInterpolationQuantileMethod.expectedShortfallFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallFromUnsorted_whenTen_thenReturnZero() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act and Assert
    assertEquals(
        0.0d,
        exponentiallyWeightedInterpolationQuantileMethod.expectedShortfallFromUnsorted(
            10.0d, DoubleArray.filled(3)));
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileDetailsFromUnsorted(double,
   * DoubleArray)}.
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileDetailsFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test quantileDetailsFromUnsorted(double, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.quantileDetailsFromUnsorted(double, DoubleArray)"
  })
  void testQuantileDetailsFromUnsorted() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(Double.NaN);

    // Act
    QuantileResult actualQuantileDetailsFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod.quantileDetailsFromUnsorted(
            -9.0d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualQuantileDetailsFromUnsortedResult.getWeights();
    assertEquals(1, weights.size());
    List<Double> toListResult = weights.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.min());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {1}, actualQuantileDetailsFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileDetailsFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return Weights min is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileDetailsFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileDetailsFromUnsorted(double, DoubleArray); when '0.5'; then return Weights min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.quantileDetailsFromUnsorted(double, DoubleArray)"
  })
  void testQuantileDetailsFromUnsorted_when05_thenReturnWeightsMinIsZero() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act
    QuantileResult actualQuantileDetailsFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod.quantileDetailsFromUnsorted(
            0.5d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualQuantileDetailsFromUnsortedResult.getWeights();
    assertEquals(0.0d, weights.min());
    List<Double> toListResult = weights.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(0.125d, toListResult.get(0).doubleValue());
    assertEquals(0.875d, weights.max());
    assertEquals(0.875d, toListResult.get(1).doubleValue());
    assertEquals(3, weights.size());
    assertArrayEquals(new double[] {0.125d, 0.875d, 0.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {2, 0, 1}, actualQuantileDetailsFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileDetailsFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Weights size is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#quantileDetailsFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test quantileDetailsFromUnsorted(double, DoubleArray); when ten; then return Weights size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.quantileDetailsFromUnsorted(double, DoubleArray)"
  })
  void testQuantileDetailsFromUnsorted_whenTen_thenReturnWeightsSizeIsOne() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act
    QuantileResult actualQuantileDetailsFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod.quantileDetailsFromUnsorted(
            10.0d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualQuantileDetailsFromUnsortedResult.getWeights();
    assertEquals(1, weights.size());
    List<Double> toListResult = weights.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.min());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {1}, actualQuantileDetailsFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallDetailsFromUnsorted(double,
   * DoubleArray)}.
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallDetailsFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test expectedShortfallDetailsFromUnsorted(double, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.expectedShortfallDetailsFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallDetailsFromUnsorted() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(Double.NaN);

    // Act
    QuantileResult actualExpectedShortfallDetailsFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod.expectedShortfallDetailsFromUnsorted(
            -9.0d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualExpectedShortfallDetailsFromUnsortedResult.getWeights();
    assertEquals(1, weights.size());
    List<Double> toListResult = weights.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.min());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {1}, actualExpectedShortfallDetailsFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallDetailsFromUnsorted(double,
   * DoubleArray)}.
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallDetailsFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test expectedShortfallDetailsFromUnsorted(double, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.expectedShortfallDetailsFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallDetailsFromUnsorted2() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act
    QuantileResult actualExpectedShortfallDetailsFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod.expectedShortfallDetailsFromUnsorted(
            0.5d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualExpectedShortfallDetailsFromUnsortedResult.getWeights();
    assertEquals(0.008928571428571428d, weights.min());
    List<Double> toListResult = weights.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.008928571428571428d, toListResult.get(0).doubleValue());
    assertEquals(0.2767857142857143d, toListResult.get(1).doubleValue());
    assertEquals(0.7142857142857142d, weights.max());
    assertEquals(0.7142857142857142d, toListResult.get(2).doubleValue());
    assertEquals(3, weights.size());
    assertArrayEquals(
        new double[] {0.008928571428571428d, 0.2767857142857143d, 0.7142857142857142d},
        weights.toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new int[] {2, 0, 1}, actualExpectedShortfallDetailsFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallDetailsFromUnsorted(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Weights size is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfallDetailsFromUnsorted(double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfallDetailsFromUnsorted(double, DoubleArray); when ten; then return Weights size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.expectedShortfallDetailsFromUnsorted(double, DoubleArray)"
  })
  void testExpectedShortfallDetailsFromUnsorted_whenTen_thenReturnWeightsSizeIsOne() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act
    QuantileResult actualExpectedShortfallDetailsFromUnsortedResult =
        exponentiallyWeightedInterpolationQuantileMethod.expectedShortfallDetailsFromUnsorted(
            10.0d, DoubleArray.filled(3));

    // Assert
    DoubleArray weights = actualExpectedShortfallDetailsFromUnsortedResult.getWeights();
    assertEquals(1, weights.size());
    List<Double> toListResult = weights.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, weights.max());
    assertEquals(1.0d, weights.min());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.0d}, weights.toArrayUnsafe(), 0.0);
    assertArrayEquals(new int[] {1}, actualExpectedShortfallDetailsFromUnsortedResult.getIndices());
  }

  /**
   * Test {@link ExponentiallyWeightedInterpolationQuantileMethod#quantile(double, DoubleArray,
   * boolean)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link ExponentiallyWeightedInterpolationQuantileMethod#quantile(double,
   * DoubleArray, boolean)}
   */
  @Test
  @DisplayName(
      "Test quantile(double, DoubleArray, boolean); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.quantile(double, DoubleArray, boolean)"
  })
  void testQuantile_thenThrowUnsupportedOperationException() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            exponentiallyWeightedInterpolationQuantileMethod.quantile(
                10.0d, DoubleArray.of(), true));
  }

  /**
   * Test {@link ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfall(double,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ExponentiallyWeightedInterpolationQuantileMethod#expectedShortfall(double, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test expectedShortfall(double, DoubleArray); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "QuantileResult ExponentiallyWeightedInterpolationQuantileMethod.expectedShortfall(double, DoubleArray)"
  })
  void testExpectedShortfall_thenThrowUnsupportedOperationException() {
    // Arrange
    ExponentiallyWeightedInterpolationQuantileMethod
        exponentiallyWeightedInterpolationQuantileMethod =
            new ExponentiallyWeightedInterpolationQuantileMethod(0.5d);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            exponentiallyWeightedInterpolationQuantileMethod.expectedShortfall(
                10.0d, DoubleArray.of()));
  }

  /**
   * Test {@link ExponentiallyWeightedInterpolationQuantileMethod#weights(int)}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with {@code 0.14285714285714285} and {@code
   *       0.2857142857142857}.
   * </ul>
   *
   * <p>Method under test: {@link ExponentiallyWeightedInterpolationQuantileMethod#weights(int)}
   */
  @Test
  @DisplayName(
      "Test weights(int); then return array of double with '0.14285714285714285' and '0.2857142857142857'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] ExponentiallyWeightedInterpolationQuantileMethod.weights(int)"})
  void testWeights_thenReturnArrayOfDoubleWith014285714285714285And02857142857142857() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {0.14285714285714285d, 0.2857142857142857d, 0.5714285714285714d},
        new ExponentiallyWeightedInterpolationQuantileMethod(0.5d).weights(3),
        0.0);
  }
}
