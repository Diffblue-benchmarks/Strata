package com.opengamma.strata.math.impl.regression;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OrdinaryLeastSquaresRegressionDiffblueTest {
  /**
   * Test {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code x}, {@code weights}, {@code y}, {@code useIntercept}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and ten.
   * </ul>
   *
   * <p>Method under test: {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'x', 'weights', 'y', 'useIntercept'; when array of double with two and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult OrdinaryLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithXWeightsYUseIntercept_whenArrayOfDoubleWithTwoAndTen() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new OrdinaryLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code x}, {@code weights}, {@code y}, {@code useIntercept}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'x', 'weights', 'y', 'useIntercept'; when empty 2D array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult OrdinaryLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithXWeightsYUseIntercept_whenEmpty2dArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new OrdinaryLeastSquaresRegression()
                .regress(
                    new double[][] {},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code x}, {@code weights}, {@code y}, {@code useIntercept}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'x', 'weights', 'y', 'useIntercept'; when empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult OrdinaryLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithXWeightsYUseIntercept_whenEmptyArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new OrdinaryLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {},
                    true));
  }

  /**
   * Test {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code x}, {@code weights}, {@code y}, {@code useIntercept}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'x', 'weights', 'y', 'useIntercept'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult OrdinaryLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithXWeightsYUseIntercept_whenNull() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new OrdinaryLeastSquaresRegression()
                .regress(
                    null,
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code x}, {@code weights}, {@code y}, {@code useIntercept}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'x', 'weights', 'y', 'useIntercept'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult OrdinaryLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithXWeightsYUseIntercept_whenNull2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new OrdinaryLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    null,
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][], double[], boolean)}
   * with {@code x}, {@code weights}, {@code y}, {@code useIntercept}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link OrdinaryLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean) with 'x', 'weights', 'y', 'useIntercept'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult OrdinaryLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegressWithXWeightsYUseIntercept_whenNull3() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new OrdinaryLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    null,
                    true));
  }

  /**
   * Test {@link OrdinaryLeastSquaresRegression#regress(double[][], double[], boolean)} with {@code
   * x}, {@code y}, {@code useIntercept}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and ten.
   * </ul>
   *
   * <p>Method under test: {@link OrdinaryLeastSquaresRegression#regress(double[][], double[],
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[], boolean) with 'x', 'y', 'useIntercept'; when array of double with two and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult OrdinaryLeastSquaresRegression.regress(double[][], double[], boolean)"
  })
  void testRegressWithXYUseIntercept_whenArrayOfDoubleWithTwoAndTen() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new OrdinaryLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link OrdinaryLeastSquaresRegression#regress(double[][], double[], boolean)} with {@code
   * x}, {@code y}, {@code useIntercept}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link OrdinaryLeastSquaresRegression#regress(double[][], double[],
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[], boolean) with 'x', 'y', 'useIntercept'; when empty 2D array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult OrdinaryLeastSquaresRegression.regress(double[][], double[], boolean)"
  })
  void testRegressWithXYUseIntercept_whenEmpty2dArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new OrdinaryLeastSquaresRegression()
                .regress(new double[][] {}, new double[] {3.0d, 10.0d, 3.0d, 10.0d}, true));
  }

  /**
   * Test {@link OrdinaryLeastSquaresRegression#regress(double[][], double[], boolean)} with {@code
   * x}, {@code y}, {@code useIntercept}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link OrdinaryLeastSquaresRegression#regress(double[][], double[],
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[], boolean) with 'x', 'y', 'useIntercept'; when empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult OrdinaryLeastSquaresRegression.regress(double[][], double[], boolean)"
  })
  void testRegressWithXYUseIntercept_whenEmptyArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new OrdinaryLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[] {},
                    true));
  }
}
