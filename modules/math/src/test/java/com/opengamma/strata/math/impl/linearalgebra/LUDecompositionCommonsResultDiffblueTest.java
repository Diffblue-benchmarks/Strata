package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.LUDecomposition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LUDecompositionCommonsResultDiffblueTest {
  /**
   * Test {@link LUDecompositionCommonsResult#LUDecompositionCommonsResult(LUDecomposition)}.
   *
   * <ul>
   *   <li>Then return L dimensions is two.
   * </ul>
   *
   * <p>Method under test: {@link
   * LUDecompositionCommonsResult#LUDecompositionCommonsResult(LUDecomposition)}
   */
  @Test
  @DisplayName(
      "Test new LUDecompositionCommonsResult(LUDecomposition); then return L dimensions is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LUDecompositionCommonsResult.<init>(LUDecomposition)"})
  void testNewLUDecompositionCommonsResult_thenReturnLDimensionsIsTwo() {
    // Arrange
    DiagonalMatrix matrix = new DiagonalMatrix(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    LUDecomposition lu = new LUDecomposition(matrix);

    // Act
    LUDecompositionCommonsResult actualLuDecompositionCommonsResult =
        new LUDecompositionCommonsResult(lu);

    // Assert
    DoubleMatrix l = actualLuDecompositionCommonsResult.getL();
    assertEquals(2, l.dimensions());
    DoubleMatrix u = actualLuDecompositionCommonsResult.getU();
    assertEquals(2, u.dimensions());
    assertEquals(21.0d, u.total());
    assertEquals(25.0d, actualLuDecompositionCommonsResult.getDeterminant());
    assertEquals(4, l.toArrayUnsafe().length);
    assertEquals(4, u.toArrayUnsafe().length);
    assertEquals(4.0d, l.total());
    assertFalse(l.isEmpty());
    assertFalse(u.isEmpty());
    assertTrue(l.isSquare());
    assertTrue(u.isSquare());
    assertEquals(l, actualLuDecompositionCommonsResult.getP());
    assertEquals(Short.SIZE, l.size());
    assertEquals(Short.SIZE, u.size());
    assertArrayEquals(new int[] {0, 1, 2, 3}, actualLuDecompositionCommonsResult.getPivot());
  }

  /**
   * Test {@link LUDecompositionCommonsResult#solve(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with one and one.
   * </ul>
   *
   * <p>Method under test: {@link LUDecompositionCommonsResult#solve(double[])}
   */
  @Test
  @DisplayName("Test solve(double[]) with 'double[]'; then return array of double with one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] LUDecompositionCommonsResult.solve(double[])"})
  void testSolveWithDouble_thenReturnArrayOfDoubleWithOneAndOne() {
    // Arrange
    DiagonalMatrix matrix = new DiagonalMatrix(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    LUDecomposition lu = new LUDecomposition(matrix);

    // Act
    double[] actualSolveResult =
        new LUDecompositionCommonsResult(lu).solve(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertArrayEquals(new double[] {1.0d, 1.0d, 1.0d, 1.0d}, actualSolveResult, 0.0);
  }
}
