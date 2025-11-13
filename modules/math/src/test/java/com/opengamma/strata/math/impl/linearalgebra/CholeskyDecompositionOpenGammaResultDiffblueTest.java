package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CholeskyDecompositionOpenGammaResultDiffblueTest {
  /**
   * Test {@link
   * CholeskyDecompositionOpenGammaResult#CholeskyDecompositionOpenGammaResult(double[][])}.
   *
   * <ul>
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * CholeskyDecompositionOpenGammaResult#CholeskyDecompositionOpenGammaResult(double[][])}
   */
  @Test
  @DisplayName(
      "Test new CholeskyDecompositionOpenGammaResult(double[][]); then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CholeskyDecompositionOpenGammaResult.<init>(double[][])"})
  void testNewCholeskyDecompositionOpenGammaResult_thenReturnArrayLengthIsOne() {
    // Arrange
    double[][] lArray = new double[][] {new double[] {10.0d, 2.0d, 10.0d, 2.0d}};

    // Act
    CholeskyDecompositionOpenGammaResult actualCholeskyDecompositionOpenGammaResult =
        new CholeskyDecompositionOpenGammaResult(lArray);

    // Assert
    DoubleMatrix l = actualCholeskyDecompositionOpenGammaResult.getL();
    assertEquals(1, l.toArrayUnsafe().length);
    assertEquals(100.0d, actualCholeskyDecompositionOpenGammaResult.getDeterminant());
    DoubleMatrix lT = actualCholeskyDecompositionOpenGammaResult.getLT();
    assertEquals(2, lT.dimensions());
    assertEquals(24.0d, l.total());
    assertEquals(24.0d, lT.total());
    assertEquals(4, l.size());
    assertEquals(4, lT.size());
    assertEquals(4, lT.toArrayUnsafe().length);
    assertFalse(l.isEmpty());
    assertFalse(lT.isEmpty());
    assertFalse(l.isSquare());
    assertFalse(lT.isSquare());
  }

  /**
   * Test {@link
   * CholeskyDecompositionOpenGammaResult#CholeskyDecompositionOpenGammaResult(double[][])}.
   *
   * <ul>
   *   <li>Then return L size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * CholeskyDecompositionOpenGammaResult#CholeskyDecompositionOpenGammaResult(double[][])}
   */
  @Test
  @DisplayName(
      "Test new CholeskyDecompositionOpenGammaResult(double[][]); then return L size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CholeskyDecompositionOpenGammaResult.<init>(double[][])"})
  void testNewCholeskyDecompositionOpenGammaResult_thenReturnLSizeIsZero() {
    // Arrange and Act
    CholeskyDecompositionOpenGammaResult actualCholeskyDecompositionOpenGammaResult =
        new CholeskyDecompositionOpenGammaResult(new double[][] {});

    // Assert
    DoubleMatrix l = actualCholeskyDecompositionOpenGammaResult.getL();
    assertEquals(0, l.size());
    assertEquals(0, l.toArrayUnsafe().length);
    assertEquals(0.0d, l.total());
    assertEquals(1.0d, actualCholeskyDecompositionOpenGammaResult.getDeterminant());
    assertTrue(l.isEmpty());
    assertTrue(l.isSquare());
    assertSame(l, actualCholeskyDecompositionOpenGammaResult.getLT());
  }

  /**
   * Test {@link CholeskyDecompositionOpenGammaResult#solve(DoubleMatrix)} with {@code
   * DoubleMatrix}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CholeskyDecompositionOpenGammaResult#solve(DoubleMatrix)}
   */
  @Test
  @DisplayName("Test solve(DoubleMatrix) with 'DoubleMatrix'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix CholeskyDecompositionOpenGammaResult.solve(DoubleMatrix)"})
  void testSolveWithDoubleMatrix_thenReturnEmpty() {
    // Arrange
    CholeskyDecompositionOpenGammaResult choleskyDecompositionOpenGammaResult =
        new CholeskyDecompositionOpenGammaResult(new double[][] {});

    // Act and Assert
    assertSame(DoubleMatrix.EMPTY, choleskyDecompositionOpenGammaResult.solve(DoubleMatrix.of()));
  }

  /**
   * Test {@link CholeskyDecompositionOpenGammaResult#solve(DoubleMatrix)} with {@code
   * DoubleMatrix}.
   *
   * <ul>
   *   <li>When filled one and one.
   *   <li>Then return filled one and one.
   * </ul>
   *
   * <p>Method under test: {@link CholeskyDecompositionOpenGammaResult#solve(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleMatrix) with 'DoubleMatrix'; when filled one and one; then return filled one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix CholeskyDecompositionOpenGammaResult.solve(DoubleMatrix)"})
  void testSolveWithDoubleMatrix_whenFilledOneAndOne_thenReturnFilledOneAndOne() {
    // Arrange
    double[][] lArray = new double[][] {new double[] {10.0d, 2.0d, 10.0d, 2.0d}};
    CholeskyDecompositionOpenGammaResult choleskyDecompositionOpenGammaResult =
        new CholeskyDecompositionOpenGammaResult(lArray);
    DoubleMatrix b = DoubleMatrix.filled(1, 1);

    // Act
    DoubleMatrix actualSolveResult = choleskyDecompositionOpenGammaResult.solve(b);

    // Assert
    assertEquals(b, actualSolveResult);
  }

  /**
   * Test {@link CholeskyDecompositionOpenGammaResult#solve(DoubleMatrix)} with {@code
   * DoubleMatrix}.
   *
   * <ul>
   *   <li>When identity three.
   *   <li>Then return total is {@code 0.010000000000000018}.
   * </ul>
   *
   * <p>Method under test: {@link CholeskyDecompositionOpenGammaResult#solve(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleMatrix) with 'DoubleMatrix'; when identity three; then return total is '0.010000000000000018'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix CholeskyDecompositionOpenGammaResult.solve(DoubleMatrix)"})
  void testSolveWithDoubleMatrix_whenIdentityThree_thenReturnTotalIs0010000000000000018() {
    // Arrange
    CholeskyDecompositionOpenGammaResult choleskyDecompositionOpenGammaResult =
        new CholeskyDecompositionOpenGammaResult(
            new double[][] {
              new double[] {10.0d, 2.0d, 10.0d, 2.0d},
              new double[] {10.0d, 2.0d, 10.0d, 2.0d},
              new double[] {10.0d, 2.0d, 10.0d, 2.0d}
            });

    // Act
    DoubleMatrix actualSolveResult =
        choleskyDecompositionOpenGammaResult.solve(DoubleMatrix.identity(3));

    // Assert
    assertEquals(0.010000000000000018d, actualSolveResult.total());
    double[][] toArrayUnsafeResult = actualSolveResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, actualSolveResult.size());
    assertFalse(actualSolveResult.isEmpty());
    assertArrayEquals(new double[] {-0.25d, 0.26d, -0.01d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, -0.01d, 0.01d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.26d, -0.25d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link CholeskyDecompositionOpenGammaResult#solve(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link CholeskyDecompositionOpenGammaResult#solve(double[])}
   */
  @Test
  @DisplayName("Test solve(double[]) with 'double[]'; then return empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] CholeskyDecompositionOpenGammaResult.solve(double[])"})
  void testSolveWithDouble_thenReturnEmptyArrayOfDouble() {
    // Arrange
    CholeskyDecompositionOpenGammaResult choleskyDecompositionOpenGammaResult =
        new CholeskyDecompositionOpenGammaResult(new double[][] {});

    // Act
    double[] actualSolveResult = choleskyDecompositionOpenGammaResult.solve(new double[] {});

    // Assert
    assertArrayEquals(new double[] {}, actualSolveResult, 0.0);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CholeskyDecompositionOpenGammaResult#getDeterminant()}
   *   <li>{@link CholeskyDecompositionOpenGammaResult#getL()}
   *   <li>{@link CholeskyDecompositionOpenGammaResult#getLT()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double CholeskyDecompositionOpenGammaResult.getDeterminant()",
    "DoubleMatrix CholeskyDecompositionOpenGammaResult.getL()",
    "DoubleMatrix CholeskyDecompositionOpenGammaResult.getLT()"
  })
  void testGettersAndSetters() {
    // Arrange
    double[][] lArray = new double[][] {new double[] {10.0d, 2.0d, 10.0d, 2.0d}};
    CholeskyDecompositionOpenGammaResult choleskyDecompositionOpenGammaResult =
        new CholeskyDecompositionOpenGammaResult(lArray);

    // Act
    double actualDeterminant = choleskyDecompositionOpenGammaResult.getDeterminant();
    DoubleMatrix actualL = choleskyDecompositionOpenGammaResult.getL();
    DoubleMatrix actualLT = choleskyDecompositionOpenGammaResult.getLT();

    // Assert
    double[][] toArrayUnsafeResult = actualL.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(100.0d, actualDeterminant);
    assertEquals(2, actualL.dimensions());
    assertEquals(2, actualLT.dimensions());
    assertEquals(24.0d, actualL.total());
    assertEquals(24.0d, actualLT.total());
    assertEquals(4, actualL.size());
    assertEquals(4, actualLT.size());
    double[][] toArrayUnsafeResult2 = actualLT.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult2.length);
    assertFalse(actualL.isEmpty());
    assertFalse(actualLT.isEmpty());
    assertFalse(actualL.isSquare());
    assertFalse(actualLT.isSquare());
    assertArrayEquals(new double[] {10.0d}, toArrayUnsafeResult2[0], 0.0);
    assertArrayEquals(new double[] {10.0d}, toArrayUnsafeResult2[2], 0.0);
    assertArrayEquals(new double[] {2.0d}, toArrayUnsafeResult2[1], 0.0);
    assertArrayEquals(new double[] {2.0d}, toArrayUnsafeResult2[3], 0.0);
    assertArrayEquals(new double[] {10.0d, 2.0d, 10.0d, 2.0d}, toArrayUnsafeResult[0], 0.0);
  }
}
