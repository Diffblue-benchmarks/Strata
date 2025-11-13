package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GaussLegendreWeightAndAbscissaFunctionDiffblueTest {
  /**
   * Test {@link GaussLegendreWeightAndAbscissaFunction#generate(int)}.
   *
   * <p>Method under test: {@link GaussLegendreWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName("Test generate(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussLegendreWeightAndAbscissaFunction.generate(int)"})
  void testGenerate() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussLegendreWeightAndAbscissaFunction().generate(2);

    // Assert
    assertArrayEquals(
        new double[] {-0.5773502691896257d, 0.5773502691896257d},
        actualGenerateResult.getAbscissas(),
        0.0);
    assertArrayEquals(new double[] {1.0d, 1.0d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussLegendreWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Abscissas is array of {@code double} with zero.
   * </ul>
   *
   * <p>Method under test: {@link GaussLegendreWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName("Test generate(int); when one; then return Abscissas is array of double with zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussLegendreWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_whenOne_thenReturnAbscissasIsArrayOfDoubleWithZero() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussLegendreWeightAndAbscissaFunction().generate(1);

    // Assert
    assertArrayEquals(new double[] {0.0d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {2.0d}, actualGenerateResult.getWeights(), 0.0);
  }
}
