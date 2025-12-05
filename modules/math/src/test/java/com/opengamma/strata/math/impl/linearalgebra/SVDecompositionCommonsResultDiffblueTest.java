package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.List;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.SingularValueDecomposition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SVDecompositionCommonsResultDiffblueTest {
  /**
   * Test {@link
   * SVDecompositionCommonsResult#SVDecompositionCommonsResult(SingularValueDecomposition)}.
   *
   * <ul>
   *   <li>Then return Norm is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * SVDecompositionCommonsResult#SVDecompositionCommonsResult(SingularValueDecomposition)}
   */
  @Test
  @DisplayName(
      "Test new SVDecompositionCommonsResult(SingularValueDecomposition); then return Norm is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SVDecompositionCommonsResult.<init>(SingularValueDecomposition)"})
  void testNewSVDecompositionCommonsResult_thenReturnNormIsTen() {
    // Arrange
    DiagonalMatrix matrix = new DiagonalMatrix(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    SingularValueDecomposition svd = new SingularValueDecomposition(matrix);

    // Act
    SVDecompositionCommonsResult actualSvDecompositionCommonsResult =
        new SVDecompositionCommonsResult(svd);

    // Assert
    assertEquals(10.0d, actualSvDecompositionCommonsResult.getNorm());
    assertEquals(20.0d, actualSvDecompositionCommonsResult.getConditionNumber());
    assertEquals(4, actualSvDecompositionCommonsResult.getRank());
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 0.5d, 0.5d},
        actualSvDecompositionCommonsResult.getSingularValues(),
        0.0);
  }

  /**
   * Test {@link
   * SVDecompositionCommonsResult#SVDecompositionCommonsResult(SingularValueDecomposition)}.
   *
   * <ul>
   *   <li>Then return V total is minus one.
   * </ul>
   *
   * <p>Method under test: {@link
   * SVDecompositionCommonsResult#SVDecompositionCommonsResult(SingularValueDecomposition)}
   */
  @Test
  @DisplayName(
      "Test new SVDecompositionCommonsResult(SingularValueDecomposition); then return V total is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SVDecompositionCommonsResult.<init>(SingularValueDecomposition)"})
  void testNewSVDecompositionCommonsResult_thenReturnVTotalIsMinusOne()
      throws NotStrictlyPositiveException {
    // Arrange and Act
    SVDecompositionCommonsResult actualSvDecompositionCommonsResult =
        new SVDecompositionCommonsResult(
            new SingularValueDecomposition(new Array2DRowRealMatrix(1, 1)));

    // Assert
    DoubleMatrix v = actualSvDecompositionCommonsResult.getV();
    assertEquals(-1.0d, v.total());
    assertEquals(0, actualSvDecompositionCommonsResult.getRank());
    DoubleMatrix s = actualSvDecompositionCommonsResult.getS();
    assertEquals(0.0d, s.total());
    assertEquals(0.0d, actualSvDecompositionCommonsResult.getNorm());
    assertEquals(1, s.size());
    DoubleMatrix u = actualSvDecompositionCommonsResult.getU();
    assertEquals(1, u.size());
    assertEquals(1, v.size());
    assertEquals(1, s.toArrayUnsafe().length);
    assertEquals(1, u.toArrayUnsafe().length);
    assertEquals(1, v.toArrayUnsafe().length);
    assertEquals(1.0d, u.total());
    assertEquals(u, actualSvDecompositionCommonsResult.getUT());
    assertEquals(v, actualSvDecompositionCommonsResult.getVT());
    assertEquals(Double.NaN, actualSvDecompositionCommonsResult.getConditionNumber());
    assertArrayEquals(
        new double[] {0.0d}, actualSvDecompositionCommonsResult.getSingularValues(), 0.0);
  }

  /**
   * Test {@link SVDecompositionCommonsResult#solve(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link SVDecompositionCommonsResult#solve(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray) with 'DoubleArray'; when DoubleArray with value is ten; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray SVDecompositionCommonsResult.solve(DoubleArray)"})
  void testSolveWithDoubleArray_whenDoubleArrayWithValueIsTen_thenReturnMaxIsZero()
      throws NotStrictlyPositiveException {
    // Arrange
    SVDecompositionCommonsResult svDecompositionCommonsResult =
        new SVDecompositionCommonsResult(
            new SingularValueDecomposition(new Array2DRowRealMatrix(1, 1)));

    // Act
    DoubleArray actualSolveResult = svDecompositionCommonsResult.solve(DoubleArray.of(10.0d));

    // Assert
    assertEquals(0.0d, actualSolveResult.max());
    assertEquals(0.0d, actualSolveResult.min());
    assertEquals(0.0d, actualSolveResult.sum());
    List<Double> toListResult = actualSolveResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(1, actualSolveResult.dimensions());
    assertEquals(1, actualSolveResult.size());
    assertFalse(actualSolveResult.isEmpty());
    assertArrayEquals(new double[] {0.0d}, actualSolveResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SVDecompositionCommonsResult#solve(DoubleMatrix)} with {@code DoubleMatrix}.
   *
   * <ul>
   *   <li>When filled one and one.
   *   <li>Then return filled one and one.
   * </ul>
   *
   * <p>Method under test: {@link SVDecompositionCommonsResult#solve(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleMatrix) with 'DoubleMatrix'; when filled one and one; then return filled one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix SVDecompositionCommonsResult.solve(DoubleMatrix)"})
  void testSolveWithDoubleMatrix_whenFilledOneAndOne_thenReturnFilledOneAndOne()
      throws NotStrictlyPositiveException {
    // Arrange
    SVDecompositionCommonsResult svDecompositionCommonsResult =
        new SVDecompositionCommonsResult(
            new SingularValueDecomposition(new Array2DRowRealMatrix(1, 1)));
    DoubleMatrix b = DoubleMatrix.filled(1, 1);

    // Act
    DoubleMatrix actualSolveResult = svDecompositionCommonsResult.solve(b);

    // Assert
    assertEquals(b, actualSolveResult);
  }

  /**
   * Test {@link SVDecompositionCommonsResult#solve(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with one.
   * </ul>
   *
   * <p>Method under test: {@link SVDecompositionCommonsResult#solve(double[])}
   */
  @Test
  @DisplayName("Test solve(double[]) with 'double[]'; then return array of double with one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SVDecompositionCommonsResult.solve(double[])"})
  void testSolveWithDouble_thenReturnArrayOfDoubleWithOne() {
    // Arrange
    Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    SingularValueDecomposition svd = new SingularValueDecomposition(matrix);

    // Act
    double[] actualSolveResult =
        new SVDecompositionCommonsResult(svd).solve(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertArrayEquals(new double[] {1.0d}, actualSolveResult, 0.0);
  }
}
