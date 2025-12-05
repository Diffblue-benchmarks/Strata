package com.opengamma.strata.math.impl.matrix;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.collect.array.IntArray;
import com.opengamma.strata.collect.array.Matrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OGMatrixAlgebraDiffblueTest {
  /**
   * Test {@link OGMatrixAlgebra#getCondition(Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getCondition(Matrix)}
   */
  @Test
  @DisplayName(
      "Test getCondition(Matrix); when DoubleArray; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getCondition(Matrix)"})
  void testGetCondition_whenDoubleArray_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getCondition(DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getDeterminant(Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getDeterminant(Matrix)}
   */
  @Test
  @DisplayName(
      "Test getDeterminant(Matrix); when DoubleArray; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getDeterminant(Matrix)"})
  void testGetDeterminant_whenDoubleArray_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getDeterminant(DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getInnerProduct(Matrix, Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getInnerProduct(Matrix, Matrix)}
   */
  @Test
  @DisplayName("Test getInnerProduct(Matrix, Matrix); when DoubleArray; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getInnerProduct(Matrix, Matrix)"})
  void testGetInnerProduct_whenDoubleArray_thenReturnZero() {
    // Arrange
    DoubleArray m1 = DoubleArray.of();

    // Act and Assert
    assertEquals(0.0d, MatrixAlgebraFactory.OG_ALGEBRA.getInnerProduct(m1, DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getInnerProduct(Matrix, Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getInnerProduct(Matrix, Matrix)}
   */
  @Test
  @DisplayName(
      "Test getInnerProduct(Matrix, Matrix); when DoubleMatrix; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getInnerProduct(Matrix, Matrix)"})
  void testGetInnerProduct_whenDoubleMatrix_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleArray m1 = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getInnerProduct(m1, DoubleMatrix.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getInnerProduct(Matrix, Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getInnerProduct(Matrix, Matrix)}
   */
  @Test
  @DisplayName(
      "Test getInnerProduct(Matrix, Matrix); when DoubleMatrix; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getInnerProduct(Matrix, Matrix)"})
  void testGetInnerProduct_whenDoubleMatrix_thenThrowIllegalArgumentException2() {
    // Arrange
    DoubleMatrix m1 = DoubleMatrix.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getInnerProduct(m1, DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getInverse(Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getInverse(Matrix)}
   */
  @Test
  @DisplayName(
      "Test getInverse(Matrix); when DoubleArray; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix OGMatrixAlgebra.getInverse(Matrix)"})
  void testGetInverse_whenDoubleArray_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getInverse(DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getNorm1(Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getNorm1(Matrix)}
   */
  @Test
  @DisplayName("Test getNorm1(Matrix); when DoubleArray; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getNorm1(Matrix)"})
  void testGetNorm1_whenDoubleArray_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getNorm1(DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getNorm2(Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getNorm2(Matrix)}
   */
  @Test
  @DisplayName("Test getNorm2(Matrix); when DoubleArray; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getNorm2(Matrix)"})
  void testGetNorm2_whenDoubleArray_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MatrixAlgebraFactory.OG_ALGEBRA.getNorm2(DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getNorm2(Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getNorm2(Matrix)}
   */
  @Test
  @DisplayName("Test getNorm2(Matrix); when DoubleMatrix; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getNorm2(Matrix)"})
  void testGetNorm2_whenDoubleMatrix_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getNorm2(DoubleMatrix.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getNorm2(Matrix)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getNorm2(Matrix)}
   */
  @Test
  @DisplayName("Test getNorm2(Matrix); when filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getNorm2(Matrix)"})
  void testGetNorm2_whenFilledThree_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MatrixAlgebraFactory.OG_ALGEBRA.getNorm2(DoubleArray.filled(3)));
  }

  /**
   * Test {@link OGMatrixAlgebra#getNorm2(Matrix)}.
   *
   * <ul>
   *   <li>When {@link IntArray}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getNorm2(Matrix)}
   */
  @Test
  @DisplayName("Test getNorm2(Matrix); when IntArray; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getNorm2(Matrix)"})
  void testGetNorm2_whenIntArray_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getNorm2(IntArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getNormInfinity(Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getNormInfinity(Matrix)}
   */
  @Test
  @DisplayName(
      "Test getNormInfinity(Matrix); when DoubleArray; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getNormInfinity(Matrix)"})
  void testGetNormInfinity_whenDoubleArray_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getNormInfinity(DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getOuterProduct(Matrix, Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getOuterProduct(Matrix, Matrix)}
   */
  @Test
  @DisplayName("Test getOuterProduct(Matrix, Matrix); when DoubleArray; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix OGMatrixAlgebra.getOuterProduct(Matrix, Matrix)"})
  void testGetOuterProduct_whenDoubleArray_thenReturnEmpty() {
    // Arrange
    DoubleArray m1 = DoubleArray.of();

    // Act and Assert
    assertSame(
        DoubleMatrix.EMPTY, MatrixAlgebraFactory.OG_ALGEBRA.getOuterProduct(m1, DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getOuterProduct(Matrix, Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getOuterProduct(Matrix, Matrix)}
   */
  @Test
  @DisplayName(
      "Test getOuterProduct(Matrix, Matrix); when DoubleMatrix; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix OGMatrixAlgebra.getOuterProduct(Matrix, Matrix)"})
  void testGetOuterProduct_whenDoubleMatrix_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleArray m1 = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getOuterProduct(m1, DoubleMatrix.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getOuterProduct(Matrix, Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getOuterProduct(Matrix, Matrix)}
   */
  @Test
  @DisplayName(
      "Test getOuterProduct(Matrix, Matrix); when DoubleMatrix; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix OGMatrixAlgebra.getOuterProduct(Matrix, Matrix)"})
  void testGetOuterProduct_whenDoubleMatrix_thenThrowIllegalArgumentException2() {
    // Arrange
    DoubleMatrix m1 = DoubleMatrix.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getOuterProduct(m1, DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getOuterProduct(Matrix, Matrix)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getOuterProduct(Matrix, Matrix)}
   */
  @Test
  @DisplayName("Test getOuterProduct(Matrix, Matrix); when filled three; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix OGMatrixAlgebra.getOuterProduct(Matrix, Matrix)"})
  void testGetOuterProduct_whenFilledThree_thenReturnEmpty() {
    // Arrange
    DoubleArray m1 = DoubleArray.filled(3);

    // Act and Assert
    assertSame(
        DoubleMatrix.EMPTY, MatrixAlgebraFactory.OG_ALGEBRA.getOuterProduct(m1, DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getPower(Matrix, double)} with {@code Matrix}, {@code double}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getPower(Matrix, double)}
   */
  @Test
  @DisplayName(
      "Test getPower(Matrix, double) with 'Matrix', 'double'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix OGMatrixAlgebra.getPower(Matrix, double)"})
  void testGetPowerWithMatrixDouble_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getPower(DoubleArray.of(), 10.0d));
  }

  /**
   * Test {@link OGMatrixAlgebra#getPower(Matrix, int)} with {@code Matrix}, {@code int}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getPower(Matrix, int)}
   */
  @Test
  @DisplayName(
      "Test getPower(Matrix, int) with 'Matrix', 'int'; when DoubleArray; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix OGMatrixAlgebra.getPower(Matrix, int)"})
  void testGetPowerWithMatrixInt_whenDoubleArray_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getPower(DoubleArray.of(), 1));
  }

  /**
   * Test {@link OGMatrixAlgebra#getTrace(Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getTrace(Matrix)}
   */
  @Test
  @DisplayName("Test getTrace(Matrix); when DoubleArray; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getTrace(Matrix)"})
  void testGetTrace_whenDoubleArray_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getTrace(DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getTrace(Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getTrace(Matrix)}
   */
  @Test
  @DisplayName("Test getTrace(Matrix); when DoubleMatrix; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getTrace(Matrix)"})
  void testGetTrace_whenDoubleMatrix_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, MatrixAlgebraFactory.OG_ALGEBRA.getTrace(DoubleMatrix.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getTrace(Matrix)}.
   *
   * <ul>
   *   <li>When identity three.
   *   <li>Then return three.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getTrace(Matrix)}
   */
  @Test
  @DisplayName("Test getTrace(Matrix); when identity three; then return three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double OGMatrixAlgebra.getTrace(Matrix)"})
  void testGetTrace_whenIdentityThree_thenReturnThree() {
    // Arrange, Act and Assert
    assertEquals(3.0d, MatrixAlgebraFactory.OG_ALGEBRA.getTrace(DoubleMatrix.identity(3)));
  }

  /**
   * Test {@link OGMatrixAlgebra#getTranspose(Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getTranspose(Matrix)}
   */
  @Test
  @DisplayName("Test getTranspose(Matrix); when DoubleArray; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix OGMatrixAlgebra.getTranspose(Matrix)"})
  void testGetTranspose_whenDoubleArray_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> MatrixAlgebraFactory.OG_ALGEBRA.getTranspose(DoubleArray.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getTranspose(Matrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getTranspose(Matrix)}
   */
  @Test
  @DisplayName("Test getTranspose(Matrix); when DoubleMatrix; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix OGMatrixAlgebra.getTranspose(Matrix)"})
  void testGetTranspose_whenDoubleMatrix_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertSame(DoubleMatrix.EMPTY, MatrixAlgebraFactory.OG_ALGEBRA.getTranspose(DoubleMatrix.of()));
  }

  /**
   * Test {@link OGMatrixAlgebra#getTranspose(Matrix)}.
   *
   * <ul>
   *   <li>When identity three.
   *   <li>Then return identity three.
   * </ul>
   *
   * <p>Method under test: {@link OGMatrixAlgebra#getTranspose(Matrix)}
   */
  @Test
  @DisplayName("Test getTranspose(Matrix); when identity three; then return identity three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix OGMatrixAlgebra.getTranspose(Matrix)"})
  void testGetTranspose_whenIdentityThree_thenReturnIdentityThree() {
    // Arrange
    DoubleMatrix m = DoubleMatrix.identity(3);

    // Act
    DoubleMatrix actualTranspose = MatrixAlgebraFactory.OG_ALGEBRA.getTranspose(m);

    // Assert
    assertEquals(m, actualTranspose);
  }
}
