package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GaussLaguerreWeightAndAbscissaFunctionDiffblueTest {
  /**
   * Test {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}.
   *
   * <p>Method under test: {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName("Test generate(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussLaguerreWeightAndAbscissaFunction.generate(int)"})
  void testGenerate() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussLaguerreWeightAndAbscissaFunction(10.0d).generate(2);

    // Assert
    assertArrayEquals(
        new double[] {13.855654600429142d, 13.855654600440042d},
        actualGenerateResult.getAbscissas(),
        0.0);
    assertArrayEquals(
        new double[] {139438.63858290348d, 139438.63858264167d},
        actualGenerateResult.getWeights(),
        0.0);
  }

  /**
   * Test {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Weights is array of {@code double} with {@code 2.981206426810332}.
   * </ul>
   *
   * <p>Method under test: {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName(
      "Test generate(int); then return Weights is array of double with '2.981206426810332'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussLaguerreWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnWeightsIsArrayOfDoubleWith2981206426810332() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussLaguerreWeightAndAbscissaFunction(2.4d).generate(1);

    // Assert
    assertArrayEquals(new double[] {1.0d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {2.981206426810332d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Weights is array of {@code double} with {@code 0.9687743090259738}.
   * </ul>
   *
   * <p>Method under test: {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName(
      "Test generate(int); then return Weights is array of double with '0.9687743090259738'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussLaguerreWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnWeightsIsArrayOfDoubleWith09687743090259738() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussLaguerreWeightAndAbscissaFunction(0.92d).generate(1);

    // Assert
    assertArrayEquals(new double[] {0.9687743090259738d}, actualGenerateResult.getWeights(), 0.0);
    assertArrayEquals(new double[] {1.0d}, actualGenerateResult.getAbscissas(), 0.0);
  }

  /**
   * Test {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Weights is array of {@code double} with {@code 3628800.0000000214}.
   * </ul>
   *
   * <p>Method under test: {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName(
      "Test generate(int); then return Weights is array of double with '3628800.0000000214'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussLaguerreWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnWeightsIsArrayOfDoubleWith36288000000000214() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussLaguerreWeightAndAbscissaFunction(10.0d).generate(1);

    // Assert
    assertArrayEquals(new double[] {1.0d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {3628800.0000000214d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Weights is array of {@code double} with one.
   * </ul>
   *
   * <p>Method under test: {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName("Test generate(int); then return Weights is array of double with one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussLaguerreWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnWeightsIsArrayOfDoubleWithOne() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussLaguerreWeightAndAbscissaFunction(1.0d).generate(1);

    // Assert
    assertArrayEquals(new double[] {1.0d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {1.0d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Weights is array of {@code double} with six.
   * </ul>
   *
   * <p>Method under test: {@link GaussLaguerreWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName("Test generate(int); then return Weights is array of double with six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussLaguerreWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnWeightsIsArrayOfDoubleWithSix() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussLaguerreWeightAndAbscissaFunction(3.0d).generate(1);

    // Assert
    assertArrayEquals(new double[] {1.0d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {6.0d}, actualGenerateResult.getWeights(), 0.0);
  }
}
