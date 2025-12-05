package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PolynomialsLeastSquaresFitterResultDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PolynomialsLeastSquaresFitterResult#PolynomialsLeastSquaresFitterResult(double[],
   *       DoubleMatrix, int, double)}
   *   <li>{@link PolynomialsLeastSquaresFitterResult#getCoeff()}
   *   <li>{@link PolynomialsLeastSquaresFitterResult#getDiffNorm()}
   *   <li>{@link PolynomialsLeastSquaresFitterResult#getDof()}
   *   <li>{@link PolynomialsLeastSquaresFitterResult#getRMat()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PolynomialsLeastSquaresFitterResult.<init>(double[], DoubleMatrix, int, double)",
    "double[] PolynomialsLeastSquaresFitterResult.getCoeff()",
    "double PolynomialsLeastSquaresFitterResult.getDiffNorm()",
    "int PolynomialsLeastSquaresFitterResult.getDof()",
    "DoubleMatrix PolynomialsLeastSquaresFitterResult.getRMat()"
  })
  void testGettersAndSetters() {
    // Arrange
    double[] coefficients = new double[] {10.0d, 0.5d, 10.0d, 0.5d};

    // Act
    PolynomialsLeastSquaresFitterResult actualPolynomialsLeastSquaresFitterResult =
        new PolynomialsLeastSquaresFitterResult(coefficients, DoubleMatrix.of(), 1, 10.0d);
    double[] actualCoeff = actualPolynomialsLeastSquaresFitterResult.getCoeff();
    double actualDiffNorm = actualPolynomialsLeastSquaresFitterResult.getDiffNorm();
    int actualDof = actualPolynomialsLeastSquaresFitterResult.getDof();

    // Assert
    assertEquals(1, actualDof);
    assertEquals(10.0d, actualDiffNorm);
    assertSame(coefficients, actualCoeff);
    assertSame(DoubleMatrix.EMPTY, actualPolynomialsLeastSquaresFitterResult.getRMat());
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, actualCoeff, 0.0);
  }

  /**
   * Test {@link PolynomialsLeastSquaresFitterResult#PolynomialsLeastSquaresFitterResult(double[],
   * DoubleMatrix, int, double, double[])}.
   *
   * <p>Method under test: {@link
   * PolynomialsLeastSquaresFitterResult#PolynomialsLeastSquaresFitterResult(double[], DoubleMatrix,
   * int, double, double[])}
   */
  @Test
  @DisplayName(
      "Test new PolynomialsLeastSquaresFitterResult(double[], DoubleMatrix, int, double, double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PolynomialsLeastSquaresFitterResult.<init>(double[], DoubleMatrix, int, double, double[])"
  })
  void testNewPolynomialsLeastSquaresFitterResult() {
    // Arrange and Act
    PolynomialsLeastSquaresFitterResult actualPolynomialsLeastSquaresFitterResult =
        new PolynomialsLeastSquaresFitterResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            DoubleMatrix.of(),
            1,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(1, actualPolynomialsLeastSquaresFitterResult.getDof());
    assertEquals(10.0d, actualPolynomialsLeastSquaresFitterResult.getDiffNorm());
    assertSame(DoubleMatrix.EMPTY, actualPolynomialsLeastSquaresFitterResult.getRMat());
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualPolynomialsLeastSquaresFitterResult.getCoeff(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualPolynomialsLeastSquaresFitterResult.getMeanAndStd(),
        0.0);
  }

  /**
   * Test {@link PolynomialsLeastSquaresFitterResult#getMeanAndStd()}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with ten and {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link PolynomialsLeastSquaresFitterResult#getMeanAndStd()}
   */
  @Test
  @DisplayName("Test getMeanAndStd(); then return array of double with ten and '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] PolynomialsLeastSquaresFitterResult.getMeanAndStd()"})
  void testGetMeanAndStd_thenReturnArrayOfDoubleWithTenAnd05() {
    // Arrange
    PolynomialsLeastSquaresFitterResult polynomialsLeastSquaresFitterResult =
        new PolynomialsLeastSquaresFitterResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            DoubleMatrix.of(),
            1,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act and Assert
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        polynomialsLeastSquaresFitterResult.getMeanAndStd(),
        0.0);
  }
}
