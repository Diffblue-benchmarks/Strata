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
    assertArrayEquals(new double[] {16.723583083775804d}, actualGenerateResult.getWeights(), 0.0);
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
}
