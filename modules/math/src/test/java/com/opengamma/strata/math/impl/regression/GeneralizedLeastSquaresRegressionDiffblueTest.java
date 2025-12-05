package com.opengamma.strata.math.impl.regression;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GeneralizedLeastSquaresRegressionDiffblueTest {
  /**
   * Test {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][], double[],
   * boolean)}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and ten.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean); when array of double with two and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult GeneralizedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegress_whenArrayOfDoubleWithTwoAndTen() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 1.0d, 10.0d, 1.0d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][], double[],
   * boolean)}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean); when empty 2D array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult GeneralizedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegress_whenEmpty2dArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .regress(
                    new double[][] {},
                    new double[][] {new double[] {10.0d, 1.0d, 10.0d, 1.0d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][], double[],
   * boolean)}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test regress(double[][], double[][], double[], boolean); when empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult GeneralizedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegress_whenEmptyArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 1.0d, 10.0d, 1.0d}},
                    new double[] {},
                    true));
  }

  /**
   * Test {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][], double[],
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName("Test regress(double[][], double[][], double[], boolean); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult GeneralizedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegress_whenNull() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .regress(
                    null,
                    new double[][] {new double[] {10.0d, 1.0d, 10.0d, 1.0d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][], double[],
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName("Test regress(double[][], double[][], double[], boolean); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult GeneralizedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegress_whenNull2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    null,
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d},
                    true));
  }

  /**
   * Test {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][], double[],
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquaresRegression#regress(double[][], double[][],
   * double[], boolean)}
   */
  @Test
  @DisplayName("Test regress(double[][], double[][], double[], boolean); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult GeneralizedLeastSquaresRegression.regress(double[][], double[][], double[], boolean)"
  })
  void testRegress_whenNull3() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .regress(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 1.0d, 10.0d, 1.0d}},
                    null,
                    true));
  }
}
