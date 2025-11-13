package com.opengamma.strata.math.impl.regression;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class WeightedLeastSquaresRegressionDiffblueTest {
  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[], double[], boolean)}
   * with {@code double[][]}, {@code double[]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and ten.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[], double[], boolean) with 'double[][]', 'double[]', 'double[]', 'boolean'; when array of double with two and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenArrayOfDoubleWithTwoAndTen() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code double[][]}, {@code double[][]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and ten.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'double[][]', 'double[][]', 'double[]', 'boolean'; when array of double with two and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenArrayOfDoubleWithTwoAndTen2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[], double[], boolean)}
   * with {@code double[][]}, {@code double[]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[], double[], boolean) with 'double[][]', 'double[]', 'double[]', 'boolean'; when empty 2D array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenEmpty2dArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    new double[][] {},
                    new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code double[][]}, {@code double[][]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'double[][]', 'double[][]', 'double[]', 'boolean'; when empty 2D array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenEmpty2dArrayOfDouble2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    new double[][] {},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[], double[], boolean)}
   * with {@code double[][]}, {@code double[]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[], double[], boolean) with 'double[][]', 'double[]', 'double[]', 'boolean'; when empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenEmptyArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                    new double[] {},
                    true));
  }

  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code double[][]}, {@code double[][]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'double[][]', 'double[][]', 'double[]', 'boolean'; when empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenEmptyArrayOfDouble2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {},
                    true));
  }

  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[], double[], boolean)}
   * with {@code double[][]}, {@code double[]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[], double[], boolean) with 'double[][]', 'double[]', 'double[]', 'boolean'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenNull() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    null,
                    new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[], double[], boolean)}
   * with {@code double[][]}, {@code double[]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[], double[], boolean) with 'double[][]', 'double[]', 'double[]', 'boolean'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenNull2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    (double[]) null,
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[], double[], boolean)}
   * with {@code double[][]}, {@code double[]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[], double[], boolean) with 'double[][]', 'double[]', 'double[]', 'boolean'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenNull3() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                    null,
                    true));
  }

  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code double[][]}, {@code double[][]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'double[][]', 'double[][]', 'double[]', 'boolean'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenNull4() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    null,
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code double[][]}, {@code double[][]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'double[][]', 'double[][]', 'double[]', 'boolean'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenNull5() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    (double[][]) null,
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link WeightedLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code double[][]}, {@code double[][]}, {@code double[]}, {@code boolean}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link WeightedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'double[][]', 'double[][]', 'double[]', 'boolean'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult WeightedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithDoubleDoubleDoubleBoolean_whenNull6() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new WeightedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    null,
                    true));
  }
}
