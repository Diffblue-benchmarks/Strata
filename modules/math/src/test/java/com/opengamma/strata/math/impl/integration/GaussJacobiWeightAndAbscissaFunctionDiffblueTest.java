package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GaussJacobiWeightAndAbscissaFunctionDiffblueTest {
  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction()}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction()}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>()"})
  void testNewGaussJacobiWeightAndAbscissaFunction() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction().generate(1);

    // Assert
    assertArrayEquals(new double[] {0.0d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {2.0d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction()}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction()}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>()"})
  void testNewGaussJacobiWeightAndAbscissaFunction2() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction().generate(2);

    // Assert
    assertArrayEquals(
        new double[] {0.5773502691896257d, -0.5773502691896257d},
        actualGenerateResult.getAbscissas(),
        0.0);
    assertArrayEquals(
        new double[] {1.0000000000000002d, 1.0000000000000002d},
        actualGenerateResult.getWeights(),
        0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>(double, double)"})
  void testNewGaussJacobiWeightAndAbscissaFunction3() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(10.0d, 10.0d).generate(1);

    // Assert
    assertArrayEquals(new double[] {0.0d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {0.5405203671457569d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>(double, double)"})
  void testNewGaussJacobiWeightAndAbscissaFunction4() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(2.0d, 10.0d).generate(1);

    // Assert
    assertArrayEquals(new double[] {0.5714285714285714d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {9.547785547785555d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>(double, double)"})
  void testNewGaussJacobiWeightAndAbscissaFunction5() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(1.0d, 10.0d).generate(1);

    // Assert
    assertArrayEquals(new double[] {0.6923076923076923d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {31.03030303030304d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>(double, double)"})
  void testNewGaussJacobiWeightAndAbscissaFunction6() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(2.78d, 10.0d).generate(1);

    // Assert
    assertArrayEquals(
        new double[] {0.48849797023004066d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {4.825274827792789d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>(double, double)"})
  void testNewGaussJacobiWeightAndAbscissaFunction7() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(1.48d, 10.0d).generate(1);

    // Assert
    assertArrayEquals(new double[] {0.6320474777448071d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {16.7235830837758d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>(double, double)"})
  void testNewGaussJacobiWeightAndAbscissaFunction8() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(10.0d, 2.0d).generate(1);

    // Assert
    assertArrayEquals(
        new double[] {-0.5714285714285714d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {9.547785547785555d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>(double, double)"})
  void testNewGaussJacobiWeightAndAbscissaFunction9() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(10.0d, 1.0d).generate(1);

    // Assert
    assertArrayEquals(
        new double[] {-0.6923076923076923d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {31.03030303030304d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>(double, double)"})
  void testNewGaussJacobiWeightAndAbscissaFunction10() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(2.0d, 2.0d).generate(1);

    // Assert
    assertArrayEquals(new double[] {0.0d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {1.0666666666666669d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>(double, double)"})
  void testNewGaussJacobiWeightAndAbscissaFunction11() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(1.0d, -0.5d).generate(1);

    // Assert
    assertArrayEquals(new double[] {-0.6d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {3.7712361663282543d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>(double, double)"})
  void testNewGaussJacobiWeightAndAbscissaFunction12() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(1.48d, 0.5d).generate(1);

    // Assert
    assertArrayEquals(
        new double[] {-0.24623115577889446d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {1.566463449601575d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussJacobiWeightAndAbscissaFunction#GaussJacobiWeightAndAbscissaFunction(double, double)}
   */
  @Test
  @DisplayName("Test new GaussJacobiWeightAndAbscissaFunction(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussJacobiWeightAndAbscissaFunction.<init>(double, double)"})
  void testNewGaussJacobiWeightAndAbscissaFunction13() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(10.0d, 10.0d).generate(2);

    // Assert
    assertArrayEquals(
        new double[] {0.20851441405707477d, -0.20851441405707477d},
        actualGenerateResult.getAbscissas(),
        0.0);
    assertArrayEquals(
        new double[] {0.27026018357287657d, 0.27026018357287657d},
        actualGenerateResult.getWeights(),
        0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}.
   *
   * <p>Method under test: {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName("Test generate(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussJacobiWeightAndAbscissaFunction.generate(int)"})
  void testGenerate() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction().generate(2);

    // Assert
    assertArrayEquals(
        new double[] {0.5773502691896257d, -0.5773502691896257d},
        actualGenerateResult.getAbscissas(),
        0.0);
    assertArrayEquals(
        new double[] {1.0000000000000002d, 1.0000000000000002d},
        actualGenerateResult.getWeights(),
        0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Abscissas is array of {@code double} with {@code 0.0948905109489051}.
   * </ul>
   *
   * <p>Method under test: {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName(
      "Test generate(int); then return Abscissas is array of double with '0.0948905109489051'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussJacobiWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnAbscissasIsArrayOfDoubleWith00948905109489051() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(1.48d, 2.0d).generate(1);

    // Assert
    assertArrayEquals(new double[] {0.0948905109489051d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {1.1543444984758233d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Abscissas is array of {@code double} with {@code -0.1150442477876106}.
   * </ul>
   *
   * <p>Method under test: {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName(
      "Test generate(int); then return Abscissas is array of double with '-0.1150442477876106'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussJacobiWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnAbscissasIsArrayOfDoubleWith01150442477876106() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(2.78d, 2.0d).generate(1);

    // Assert
    assertArrayEquals(
        new double[] {-0.1150442477876106d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {1.052290950903604d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Abscissas is array of {@code double} with {@code -0.5714285714285714}.
   * </ul>
   *
   * <p>Method under test: {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName(
      "Test generate(int); then return Abscissas is array of double with '-0.5714285714285714'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussJacobiWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnAbscissasIsArrayOfDoubleWith05714285714285714() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(10.0d, 2.0d).generate(1);

    // Assert
    assertArrayEquals(
        new double[] {-0.5714285714285714d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {9.547785547785555d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Abscissas is array of {@code double} with {@code -0.24623115577889446}.
   * </ul>
   *
   * <p>Method under test: {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName(
      "Test generate(int); then return Abscissas is array of double with '-0.24623115577889446'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussJacobiWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnAbscissasIsArrayOfDoubleWith024623115577889446() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(1.48d, 0.5d).generate(1);

    // Assert
    assertArrayEquals(
        new double[] {-0.24623115577889446d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {1.566463449601575d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Abscissas is array of {@code double} with {@code 0.5714285714285714}.
   * </ul>
   *
   * <p>Method under test: {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName(
      "Test generate(int); then return Abscissas is array of double with '0.5714285714285714'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussJacobiWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnAbscissasIsArrayOfDoubleWith057142857142857142() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(2.0d, 10.0d).generate(1);

    // Assert
    assertArrayEquals(new double[] {0.5714285714285714d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {9.547785547785555d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Weights is array of {@code double} with {@code 1.0666666666666669}.
   * </ul>
   *
   * <p>Method under test: {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName(
      "Test generate(int); then return Weights is array of double with '1.0666666666666669'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussJacobiWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnWeightsIsArrayOfDoubleWith10666666666666669() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction(2.0d, 2.0d).generate(1);

    // Assert
    assertArrayEquals(new double[] {0.0d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {1.0666666666666669d}, actualGenerateResult.getWeights(), 0.0);
  }

  /**
   * Test {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}.
   *
   * <ul>
   *   <li>Then return Weights is array of {@code double} with two.
   * </ul>
   *
   * <p>Method under test: {@link GaussJacobiWeightAndAbscissaFunction#generate(int)}
   */
  @Test
  @DisplayName("Test generate(int); then return Weights is array of double with two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"GaussianQuadratureData GaussJacobiWeightAndAbscissaFunction.generate(int)"})
  void testGenerate_thenReturnWeightsIsArrayOfDoubleWithTwo() {
    // Arrange and Act
    GaussianQuadratureData actualGenerateResult =
        new GaussJacobiWeightAndAbscissaFunction().generate(1);

    // Assert
    assertArrayEquals(new double[] {0.0d}, actualGenerateResult.getAbscissas(), 0.0);
    assertArrayEquals(new double[] {2.0d}, actualGenerateResult.getWeights(), 0.0);
  }
}
