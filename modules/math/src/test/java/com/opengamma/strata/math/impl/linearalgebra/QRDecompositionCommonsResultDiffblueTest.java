package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.List;
import org.apache.commons.math3.exception.DimensionMismatchException;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.QRDecomposition;
import org.apache.commons.math3.linear.RRQRDecomposition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class QRDecompositionCommonsResultDiffblueTest {
  /**
   * Test {@link QRDecompositionCommonsResult#QRDecompositionCommonsResult(QRDecomposition)}.
   *
   * <p>Method under test: {@link
   * QRDecompositionCommonsResult#QRDecompositionCommonsResult(QRDecomposition)}
   */
  @Test
  @DisplayName("Test new QRDecompositionCommonsResult(QRDecomposition)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void QRDecompositionCommonsResult.<init>(QRDecomposition)"})
  void testNewQRDecompositionCommonsResult() throws NotStrictlyPositiveException {
    // Arrange and Act
    QRDecompositionCommonsResult actualQrDecompositionCommonsResult =
        new QRDecompositionCommonsResult(new QRDecomposition(new Array2DRowRealMatrix(1, 1)));

    // Assert
    DoubleMatrix r = actualQrDecompositionCommonsResult.getR();
    assertEquals(0.0d, r.total());
    DoubleMatrix q = actualQrDecompositionCommonsResult.getQ();
    assertEquals(1, q.size());
    assertEquals(1, r.size());
    double[][] toArrayUnsafeResult = q.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = r.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult2.length);
    assertEquals(1.0d, q.total());
    assertTrue(r.isSquare());
    assertEquals(q, actualQrDecompositionCommonsResult.getQT());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult2[0], 0.0);
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link QRDecompositionCommonsResult#QRDecompositionCommonsResult(QRDecomposition)}.
   *
   * <p>Method under test: {@link
   * QRDecompositionCommonsResult#QRDecompositionCommonsResult(QRDecomposition)}
   */
  @Test
  @DisplayName("Test new QRDecompositionCommonsResult(QRDecomposition)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void QRDecompositionCommonsResult.<init>(QRDecomposition)"})
  void testNewQRDecompositionCommonsResult2() throws NotStrictlyPositiveException {
    // Arrange and Act
    QRDecompositionCommonsResult actualQrDecompositionCommonsResult =
        new QRDecompositionCommonsResult(new RRQRDecomposition(new Array2DRowRealMatrix(1, 1)));

    // Assert
    DoubleMatrix r = actualQrDecompositionCommonsResult.getR();
    assertEquals(0.0d, r.total());
    DoubleMatrix q = actualQrDecompositionCommonsResult.getQ();
    assertEquals(1, q.size());
    assertEquals(1, r.size());
    double[][] toArrayUnsafeResult = q.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = r.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult2.length);
    assertEquals(1.0d, q.total());
    assertTrue(r.isSquare());
    assertEquals(q, actualQrDecompositionCommonsResult.getQT());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult2[0], 0.0);
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link QRDecompositionCommonsResult#QRDecompositionCommonsResult(QRDecomposition)}.
   *
   * <ul>
   *   <li>Then return R total is {@code -14.159802258506296}.
   * </ul>
   *
   * <p>Method under test: {@link
   * QRDecompositionCommonsResult#QRDecompositionCommonsResult(QRDecomposition)}
   */
  @Test
  @DisplayName(
      "Test new QRDecompositionCommonsResult(QRDecomposition); then return R total is '-14.159802258506296'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void QRDecompositionCommonsResult.<init>(QRDecomposition)"})
  void testNewQRDecompositionCommonsResult_thenReturnRTotalIs14159802258506296() {
    // Arrange
    Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    QRDecomposition qr = new QRDecomposition(matrix);

    // Act
    QRDecompositionCommonsResult actualQrDecompositionCommonsResult =
        new QRDecompositionCommonsResult(qr);

    // Assert
    DoubleMatrix r = actualQrDecompositionCommonsResult.getR();
    assertEquals(-14.159802258506296d, r.total());
    DoubleMatrix q = actualQrDecompositionCommonsResult.getQ();
    assertEquals(0.38638164139086983d, q.total());
    assertEquals(4, r.size());
    assertEquals(4, q.toArrayUnsafe().length);
    assertEquals(4, r.toArrayUnsafe().length);
    assertFalse(r.isSquare());
    assertEquals(q, actualQrDecompositionCommonsResult.getQT());
    assertEquals(Short.SIZE, q.size());
  }

  /**
   * Test {@link QRDecompositionCommonsResult#solve(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>Given array of {@code double} with ten and {@code 0.5}.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link QRDecompositionCommonsResult#solve(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray) with 'DoubleArray'; given array of double with ten and '0.5'; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray QRDecompositionCommonsResult.solve(DoubleArray)"})
  void testSolveWithDoubleArray_givenArrayOfDoubleWithTenAnd05_thenReturnMinIsZero()
      throws DimensionMismatchException, NotStrictlyPositiveException {
    // Arrange
    double[][] rawData = new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}};
    BlockRealMatrix matrix = new BlockRealMatrix(rawData);
    QRDecomposition qr = new QRDecomposition(matrix);
    QRDecompositionCommonsResult qrDecompositionCommonsResult =
        new QRDecompositionCommonsResult(qr);

    // Act
    DoubleArray actualSolveResult = qrDecompositionCommonsResult.solve(DoubleArray.of(10.0d));

    // Assert
    assertEquals(0.0d, actualSolveResult.min());
    List<Double> toListResult = actualSolveResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertEquals(1, actualSolveResult.dimensions());
    assertEquals(1.0d, actualSolveResult.max());
    assertEquals(1.0d, actualSolveResult.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(4, actualSolveResult.size());
    assertFalse(actualSolveResult.isEmpty());
    assertArrayEquals(
        new double[] {1.0d, 0.0d, 0.0d, 0.0d}, actualSolveResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link QRDecompositionCommonsResult#solve(DoubleMatrix)} with {@code DoubleMatrix}.
   *
   * <ul>
   *   <li>Given array of {@code double} with ten and {@code 0.5}.
   *   <li>Then return total is zero.
   * </ul>
   *
   * <p>Method under test: {@link QRDecompositionCommonsResult#solve(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleMatrix) with 'DoubleMatrix'; given array of double with ten and '0.5'; then return total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix QRDecompositionCommonsResult.solve(DoubleMatrix)"})
  void testSolveWithDoubleMatrix_givenArrayOfDoubleWithTenAnd05_thenReturnTotalIsZero()
      throws DimensionMismatchException, NotStrictlyPositiveException {
    // Arrange
    double[][] rawData = new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}};
    BlockRealMatrix matrix = new BlockRealMatrix(rawData);
    QRDecomposition qr = new QRDecomposition(matrix);
    QRDecompositionCommonsResult qrDecompositionCommonsResult =
        new QRDecompositionCommonsResult(qr);

    // Act
    DoubleMatrix actualSolveResult = qrDecompositionCommonsResult.solve(DoubleMatrix.filled(1, 1));

    // Assert
    assertEquals(0.0d, actualSolveResult.total());
    assertEquals(2, actualSolveResult.dimensions());
    assertEquals(4, actualSolveResult.size());
    double[][] toArrayUnsafeResult = actualSolveResult.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertFalse(actualSolveResult.isEmpty());
    assertFalse(actualSolveResult.isSquare());
    assertArrayEquals(new double[] {-0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[3], 0.0);
  }

  /**
   * Test {@link QRDecompositionCommonsResult#solve(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with one.
   * </ul>
   *
   * <p>Method under test: {@link QRDecompositionCommonsResult#solve(double[])}
   */
  @Test
  @DisplayName("Test solve(double[]) with 'double[]'; then return array of double with one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] QRDecompositionCommonsResult.solve(double[])"})
  void testSolveWithDouble_thenReturnArrayOfDoubleWithOne() {
    // Arrange
    Array2DRowRealMatrix matrix = new Array2DRowRealMatrix(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    QRDecomposition qr = new QRDecomposition(matrix);

    // Act
    double[] actualSolveResult =
        new QRDecompositionCommonsResult(qr).solve(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertArrayEquals(new double[] {1.0d}, actualSolveResult, 0.0);
  }

  /**
   * Test {@link QRDecompositionCommonsResult#solve(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with one and one.
   * </ul>
   *
   * <p>Method under test: {@link QRDecompositionCommonsResult#solve(double[])}
   */
  @Test
  @DisplayName("Test solve(double[]) with 'double[]'; then return array of double with one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] QRDecompositionCommonsResult.solve(double[])"})
  void testSolveWithDouble_thenReturnArrayOfDoubleWithOneAndOne() {
    // Arrange
    DiagonalMatrix matrix = new DiagonalMatrix(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    QRDecomposition qr = new QRDecomposition(matrix);

    // Act
    double[] actualSolveResult =
        new QRDecompositionCommonsResult(qr).solve(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertArrayEquals(new double[] {1.0d, 1.0d, 1.0d, 1.0d}, actualSolveResult, 0.0);
  }
}
