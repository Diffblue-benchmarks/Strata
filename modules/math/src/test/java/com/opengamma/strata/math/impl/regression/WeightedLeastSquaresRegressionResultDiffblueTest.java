package com.opengamma.strata.math.impl.regression;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class WeightedLeastSquaresRegressionResultDiffblueTest {
  /**
   * Test {@link WeightedLeastSquaresRegressionResult#WeightedLeastSquaresRegressionResult(double[],
   * double[], double, double[], double, double, double[], double[], boolean)}.
   *
   * <p>Method under test: {@link
   * WeightedLeastSquaresRegressionResult#WeightedLeastSquaresRegressionResult(double[], double[],
   * double, double[], double, double, double[], double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test new WeightedLeastSquaresRegressionResult(double[], double[], double, double[], double, double, double[], double[], boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void WeightedLeastSquaresRegressionResult.<init>(double[], double[], double, double[], double, double, double[], double[], boolean)"
  })
  void testNewWeightedLeastSquaresRegressionResult() {
    // Arrange and Act
    WeightedLeastSquaresRegressionResult actualWeightedLeastSquaresRegressionResult =
        new WeightedLeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Assert
    assertEquals(10.0d, actualWeightedLeastSquaresRegressionResult.getAdjustedRSquared());
    assertEquals(10.0d, actualWeightedLeastSquaresRegressionResult.getMeanSquareError());
    assertEquals(10.0d, actualWeightedLeastSquaresRegressionResult.getRSquared());
    assertTrue(actualWeightedLeastSquaresRegressionResult.hasIntercept());
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getBetas(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getPValues(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getResiduals(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getStandardErrorOfBetas(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getTStatistics(),
        0.0);
  }

  /**
   * Test {@link
   * WeightedLeastSquaresRegressionResult#WeightedLeastSquaresRegressionResult(LeastSquaresRegressionResult)}.
   *
   * <ul>
   *   <li>Then return hasIntercept.
   * </ul>
   *
   * <p>Method under test: {@link
   * WeightedLeastSquaresRegressionResult#WeightedLeastSquaresRegressionResult(LeastSquaresRegressionResult)}
   */
  @Test
  @DisplayName(
      "Test new WeightedLeastSquaresRegressionResult(LeastSquaresRegressionResult); then return hasIntercept")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void WeightedLeastSquaresRegressionResult.<init>(LeastSquaresRegressionResult)"
  })
  void testNewWeightedLeastSquaresRegressionResult_thenReturnHasIntercept() {
    // Arrange
    LeastSquaresRegressionResult result =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act
    WeightedLeastSquaresRegressionResult actualWeightedLeastSquaresRegressionResult =
        new WeightedLeastSquaresRegressionResult(result);

    // Assert
    assertTrue(actualWeightedLeastSquaresRegressionResult.hasIntercept());
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getBetas(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getPValues(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getResiduals(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getStandardErrorOfBetas(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getTStatistics(),
        0.0);
  }

  /**
   * Test {@link
   * WeightedLeastSquaresRegressionResult#WeightedLeastSquaresRegressionResult(LeastSquaresRegressionResult)}.
   *
   * <ul>
   *   <li>Then return not hasIntercept.
   * </ul>
   *
   * <p>Method under test: {@link
   * WeightedLeastSquaresRegressionResult#WeightedLeastSquaresRegressionResult(LeastSquaresRegressionResult)}
   */
  @Test
  @DisplayName(
      "Test new WeightedLeastSquaresRegressionResult(LeastSquaresRegressionResult); then return not hasIntercept")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void WeightedLeastSquaresRegressionResult.<init>(LeastSquaresRegressionResult)"
  })
  void testNewWeightedLeastSquaresRegressionResult_thenReturnNotHasIntercept() {
    // Arrange
    LeastSquaresRegressionResult result =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            false);

    // Act
    WeightedLeastSquaresRegressionResult actualWeightedLeastSquaresRegressionResult =
        new WeightedLeastSquaresRegressionResult(result);

    // Assert
    assertFalse(actualWeightedLeastSquaresRegressionResult.hasIntercept());
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getBetas(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getPValues(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getResiduals(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getStandardErrorOfBetas(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualWeightedLeastSquaresRegressionResult.getTStatistics(),
        0.0);
  }

  /**
   * Test {@link WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[],
   * double[])}.
   *
   * <p>Method under test: {@link
   * WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[], double[])}
   */
  @Test
  @DisplayName("Test getWeightedPredictedValue(double[], double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double WeightedLeastSquaresRegressionResult.getWeightedPredictedValue(double[], double[])"
  })
  void testGetWeightedPredictedValue() {
    // Arrange
    WeightedLeastSquaresRegressionResult weightedLeastSquaresRegressionResult =
        new WeightedLeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            weightedLeastSquaresRegressionResult.getWeightedPredictedValue(
                new double[] {2.0d, 10.0d, 2.0d, 10.0d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d}));
  }

  /**
   * Test {@link WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[],
   * double[])}.
   *
   * <p>Method under test: {@link
   * WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[], double[])}
   */
  @Test
  @DisplayName("Test getWeightedPredictedValue(double[], double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double WeightedLeastSquaresRegressionResult.getWeightedPredictedValue(double[], double[])"
  })
  void testGetWeightedPredictedValue2() {
    // Arrange
    WeightedLeastSquaresRegressionResult weightedLeastSquaresRegressionResult =
        new WeightedLeastSquaresRegressionResult(
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            weightedLeastSquaresRegressionResult.getWeightedPredictedValue(
                new double[] {2.0d, 10.0d, 2.0d, 10.0d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d}));
  }

  /**
   * Test {@link WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[],
   * double[])}.
   *
   * <ul>
   *   <li>Then return four hundred five.
   * </ul>
   *
   * <p>Method under test: {@link
   * WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[], double[])}
   */
  @Test
  @DisplayName("Test getWeightedPredictedValue(double[], double[]); then return four hundred five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double WeightedLeastSquaresRegressionResult.getWeightedPredictedValue(double[], double[])"
  })
  void testGetWeightedPredictedValue_thenReturnFourHundredFive() {
    // Arrange
    WeightedLeastSquaresRegressionResult weightedLeastSquaresRegressionResult =
        new WeightedLeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            false);

    // Act
    double actualWeightedPredictedValue =
        weightedLeastSquaresRegressionResult.getWeightedPredictedValue(
            new double[] {2.0d, 10.0d, 2.0d, 10.0d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(405.0d, actualWeightedPredictedValue);
  }

  /**
   * Test {@link WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[],
   * double[])}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link
   * WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[], double[])}
   */
  @Test
  @DisplayName("Test getWeightedPredictedValue(double[], double[]); when empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double WeightedLeastSquaresRegressionResult.getWeightedPredictedValue(double[], double[])"
  })
  void testGetWeightedPredictedValue_whenEmptyArrayOfDouble() {
    // Arrange
    WeightedLeastSquaresRegressionResult weightedLeastSquaresRegressionResult =
        new WeightedLeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            weightedLeastSquaresRegressionResult.getWeightedPredictedValue(
                new double[] {2.0d, 10.0d, 2.0d, 10.0d}, new double[] {}));
  }

  /**
   * Test {@link WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[],
   * double[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[], double[])}
   */
  @Test
  @DisplayName("Test getWeightedPredictedValue(double[], double[]); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double WeightedLeastSquaresRegressionResult.getWeightedPredictedValue(double[], double[])"
  })
  void testGetWeightedPredictedValue_whenNull() {
    // Arrange
    WeightedLeastSquaresRegressionResult weightedLeastSquaresRegressionResult =
        new WeightedLeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            weightedLeastSquaresRegressionResult.getWeightedPredictedValue(
                new double[] {2.0d, 10.0d, 2.0d, 10.0d}, null));
  }

  /**
   * Test {@link WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[],
   * double[])}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * WeightedLeastSquaresRegressionResult#getWeightedPredictedValue(double[], double[])}
   */
  @Test
  @DisplayName("Test getWeightedPredictedValue(double[], double[]); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double WeightedLeastSquaresRegressionResult.getWeightedPredictedValue(double[], double[])"
  })
  void testGetWeightedPredictedValue_whenNull2() {
    // Arrange
    WeightedLeastSquaresRegressionResult weightedLeastSquaresRegressionResult =
        new WeightedLeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            weightedLeastSquaresRegressionResult.getWeightedPredictedValue(
                null, new double[] {10.0d, 0.5d, 10.0d, 0.5d}));
  }
}
