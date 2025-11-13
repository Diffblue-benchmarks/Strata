package com.opengamma.strata.math.impl.matrix;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.collect.array.IntArray;
import com.opengamma.strata.collect.array.Matrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MatrixAlgebraDiffblueTest {
  /**
   * Test {@link MatrixAlgebra#scale(Matrix, double)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebra#scale(Matrix, double)}
   */
  @Test
  @DisplayName("Test scale(Matrix, double); when DoubleArray; then return DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Matrix MatrixAlgebra.scale(Matrix, double)"})
  void testScale_whenDoubleArray_thenReturnDoubleArray() {
    // Arrange, Act and Assert
    assertTrue(
        MatrixAlgebraFactory.COMMONS_ALGEBRA.scale(DoubleArray.of(), 10.0d) instanceof DoubleArray);
  }

  /**
   * Test {@link MatrixAlgebra#scale(Matrix, double)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebra#scale(Matrix, double)}
   */
  @Test
  @DisplayName("Test scale(Matrix, double); when DoubleArray; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Matrix MatrixAlgebra.scale(Matrix, double)"})
  void testScale_whenDoubleArray_thenReturnEmpty() {
    // Arrange and Act
    Matrix actualScaleResult = MatrixAlgebraFactory.COMMONS_ALGEBRA.scale(DoubleArray.of(), 1.0d);

    // Assert
    assertSame(((DoubleArray) actualScaleResult).EMPTY, actualScaleResult);
  }

  /**
   * Test {@link MatrixAlgebra#scale(Matrix, double)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return {@link DoubleMatrix}.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebra#scale(Matrix, double)}
   */
  @Test
  @DisplayName("Test scale(Matrix, double); when DoubleMatrix; then return DoubleMatrix")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Matrix MatrixAlgebra.scale(Matrix, double)"})
  void testScale_whenDoubleMatrix_thenReturnDoubleMatrix() {
    // Arrange, Act and Assert
    assertTrue(
        MatrixAlgebraFactory.COMMONS_ALGEBRA.scale(DoubleMatrix.of(), 10.0d)
            instanceof DoubleMatrix);
  }

  /**
   * Test {@link MatrixAlgebra#scale(Matrix, double)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebra#scale(Matrix, double)}
   */
  @Test
  @DisplayName("Test scale(Matrix, double); when DoubleMatrix; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Matrix MatrixAlgebra.scale(Matrix, double)"})
  void testScale_whenDoubleMatrix_thenReturnEmpty() {
    // Arrange and Act
    Matrix actualScaleResult = MatrixAlgebraFactory.COMMONS_ALGEBRA.scale(DoubleMatrix.of(), 1.0d);

    // Assert
    assertSame(((DoubleMatrix) actualScaleResult).EMPTY, actualScaleResult);
  }

  /**
   * Test {@link MatrixAlgebra#scale(Matrix, double)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebra#scale(Matrix, double)}
   */
  @Test
  @DisplayName("Test scale(Matrix, double); when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Matrix MatrixAlgebra.scale(Matrix, double)"})
  void testScale_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    DoubleArray m = DoubleArray.filled(3);

    // Act
    Matrix actualScaleResult = MatrixAlgebraFactory.COMMONS_ALGEBRA.scale(m, 10.0d);

    // Assert
    assertTrue(actualScaleResult instanceof DoubleArray);
    assertEquals(m, actualScaleResult);
  }

  /**
   * Test {@link MatrixAlgebra#scale(Matrix, double)}.
   *
   * <ul>
   *   <li>When identity three.
   *   <li>Then return array length is three.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebra#scale(Matrix, double)}
   */
  @Test
  @DisplayName("Test scale(Matrix, double); when identity three; then return array length is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Matrix MatrixAlgebra.scale(Matrix, double)"})
  void testScale_whenIdentityThree_thenReturnArrayLengthIsThree() {
    // Arrange and Act
    Matrix actualScaleResult =
        MatrixAlgebraFactory.COMMONS_ALGEBRA.scale(DoubleMatrix.identity(3), 10.0d);

    // Assert
    assertTrue(actualScaleResult instanceof DoubleMatrix);
    double[][] toArrayUnsafeResult = ((DoubleMatrix) actualScaleResult).toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(30.0d, ((DoubleMatrix) actualScaleResult).total());
    assertEquals(9, actualScaleResult.size());
    assertFalse(((DoubleMatrix) actualScaleResult).isEmpty());
    assertArrayEquals(new double[] {0.0d, 0.0d, 10.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 10.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {10.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link MatrixAlgebra#scale(Matrix, double)}.
   *
   * <ul>
   *   <li>When {@link IntArray}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebra#scale(Matrix, double)}
   */
  @Test
  @DisplayName(
      "Test scale(Matrix, double); when IntArray; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Matrix MatrixAlgebra.scale(Matrix, double)"})
  void testScale_whenIntArray_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> MatrixAlgebraFactory.COMMONS_ALGEBRA.scale(IntArray.of(), 10.0d));
  }

  /**
   * Test {@link MatrixAlgebra#matrixTransposeMultiplyMatrix(DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebra#matrixTransposeMultiplyMatrix(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test matrixTransposeMultiplyMatrix(DoubleMatrix); when DoubleMatrix; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix MatrixAlgebra.matrixTransposeMultiplyMatrix(DoubleMatrix)"})
  void testMatrixTransposeMultiplyMatrix_whenDoubleMatrix_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(
        DoubleMatrix.EMPTY,
        MatrixAlgebraFactory.COMMONS_ALGEBRA.matrixTransposeMultiplyMatrix(DoubleMatrix.of()));
  }

  /**
   * Test {@link MatrixAlgebra#matrixTransposeMultiplyMatrix(DoubleMatrix)}.
   *
   * <ul>
   *   <li>When identity three.
   *   <li>Then return identity three.
   * </ul>
   *
   * <p>Method under test: {@link MatrixAlgebra#matrixTransposeMultiplyMatrix(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test matrixTransposeMultiplyMatrix(DoubleMatrix); when identity three; then return identity three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix MatrixAlgebra.matrixTransposeMultiplyMatrix(DoubleMatrix)"})
  void testMatrixTransposeMultiplyMatrix_whenIdentityThree_thenReturnIdentityThree() {
    // Arrange
    DoubleMatrix a = DoubleMatrix.identity(3);

    // Act
    DoubleMatrix actualMatrixTransposeMultiplyMatrixResult =
        MatrixAlgebraFactory.COMMONS_ALGEBRA.matrixTransposeMultiplyMatrix(a);

    // Assert
    assertEquals(a, actualMatrixTransposeMultiplyMatrixResult);
  }
}
