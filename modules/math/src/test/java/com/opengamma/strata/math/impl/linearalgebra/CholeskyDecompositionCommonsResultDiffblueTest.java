package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.apache.commons.math3.linear.CholeskyDecomposition;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CholeskyDecompositionCommonsResultDiffblueTest {
  /**
   * Test {@link
   * CholeskyDecompositionCommonsResult#CholeskyDecompositionCommonsResult(CholeskyDecomposition)}.
   *
   * <ul>
   *   <li>Then return L dimensions is two.
   * </ul>
   *
   * <p>Method under test: {@link
   * CholeskyDecompositionCommonsResult#CholeskyDecompositionCommonsResult(CholeskyDecomposition)}
   */
  @Test
  @DisplayName(
      "Test new CholeskyDecompositionCommonsResult(CholeskyDecomposition); then return L dimensions is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CholeskyDecompositionCommonsResult.<init>(CholeskyDecomposition)"})
  void testNewCholeskyDecompositionCommonsResult_thenReturnLDimensionsIsTwo() {
    // Arrange
    DiagonalMatrix matrix = new DiagonalMatrix(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    CholeskyDecomposition ch = new CholeskyDecomposition(matrix);

    // Act
    CholeskyDecompositionCommonsResult actualCholeskyDecompositionCommonsResult =
        new CholeskyDecompositionCommonsResult(ch);

    // Assert
    DoubleMatrix l = actualCholeskyDecompositionCommonsResult.getL();
    assertEquals(2, l.dimensions());
    assertEquals(25.00000000000002d, actualCholeskyDecompositionCommonsResult.getDeterminant());
    double[][] toArrayUnsafeResult = l.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertEquals(7.738768882709854d, l.total());
    assertFalse(l.isEmpty());
    assertTrue(l.isSquare());
    assertEquals(l, actualCholeskyDecompositionCommonsResult.getLT());
    assertEquals(Short.SIZE, l.size());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.7071067811865476d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 3.1622776601683795d, 0.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.7071067811865476d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {3.1622776601683795d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link CholeskyDecompositionCommonsResult#solve(double[])} with {@code double[]}.
   *
   * <p>Method under test: {@link CholeskyDecompositionCommonsResult#solve(double[])}
   */
  @Test
  @DisplayName("Test solve(double[]) with 'double[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] CholeskyDecompositionCommonsResult.solve(double[])"})
  void testSolveWithDouble() {
    // Arrange
    DiagonalMatrix matrix = new DiagonalMatrix(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    CholeskyDecomposition ch = new CholeskyDecomposition(matrix);

    // Act
    double[] actualSolveResult =
        new CholeskyDecompositionCommonsResult(ch).solve(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertArrayEquals(
        new double[] {
          0.9999999999999999d, 0.9999999999999999d, 0.9999999999999999d, 0.9999999999999999d
        },
        actualSolveResult,
        0.0);
  }
}
