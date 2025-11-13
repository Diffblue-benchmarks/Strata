package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CholeskyDecompositionOpenGammaDiffblueTest {
  /**
   * Test {@link CholeskyDecompositionOpenGamma#apply(DoubleMatrix)} with {@code DoubleMatrix}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return L is {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CholeskyDecompositionOpenGamma#apply(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test apply(DoubleMatrix) with 'DoubleMatrix'; when DoubleMatrix; then return L is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CholeskyDecompositionResult CholeskyDecompositionOpenGamma.apply(DoubleMatrix)"
  })
  void testApplyWithDoubleMatrix_whenDoubleMatrix_thenReturnLIsEmpty() {
    // Arrange
    CholeskyDecompositionOpenGamma choleskyDecompositionOpenGamma =
        new CholeskyDecompositionOpenGamma();

    // Act
    CholeskyDecompositionResult actualApplyResult =
        choleskyDecompositionOpenGamma.apply(DoubleMatrix.of());

    // Assert
    assertTrue(actualApplyResult instanceof CholeskyDecompositionOpenGammaResult);
    DoubleMatrix doubleMatrix = DoubleMatrix.EMPTY;
    assertSame(doubleMatrix, actualApplyResult.getL());
    assertSame(doubleMatrix, actualApplyResult.getLT());
  }

  /**
   * Test {@link CholeskyDecompositionOpenGamma#apply(DoubleMatrix)} with {@code DoubleMatrix}.
   *
   * <ul>
   *   <li>When identity three.
   *   <li>Then return Determinant is one.
   * </ul>
   *
   * <p>Method under test: {@link CholeskyDecompositionOpenGamma#apply(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test apply(DoubleMatrix) with 'DoubleMatrix'; when identity three; then return Determinant is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CholeskyDecompositionResult CholeskyDecompositionOpenGamma.apply(DoubleMatrix)"
  })
  void testApplyWithDoubleMatrix_whenIdentityThree_thenReturnDeterminantIsOne() {
    // Arrange
    CholeskyDecompositionOpenGamma choleskyDecompositionOpenGamma =
        new CholeskyDecompositionOpenGamma();
    DoubleMatrix x = DoubleMatrix.identity(3);

    // Act
    CholeskyDecompositionResult actualApplyResult = choleskyDecompositionOpenGamma.apply(x);

    // Assert
    assertTrue(actualApplyResult instanceof CholeskyDecompositionOpenGammaResult);
    assertEquals(1.0d, actualApplyResult.getDeterminant());
    assertEquals(x, actualApplyResult.getL());
    assertEquals(x, actualApplyResult.getLT());
  }

  /**
   * Test {@link CholeskyDecompositionOpenGamma#evaluate(DoubleMatrix, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return Determinant is one.
   * </ul>
   *
   * <p>Method under test: {@link CholeskyDecompositionOpenGamma#evaluate(DoubleMatrix, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(DoubleMatrix, double, double); when '0.5'; then return Determinant is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CholeskyDecompositionResult CholeskyDecompositionOpenGamma.evaluate(DoubleMatrix, double, double)"
  })
  void testEvaluate_when05_thenReturnDeterminantIsOne() {
    // Arrange
    CholeskyDecompositionOpenGamma choleskyDecompositionOpenGamma =
        new CholeskyDecompositionOpenGamma();
    DoubleMatrix matrix = DoubleMatrix.identity(3);

    // Act
    CholeskyDecompositionResult actualEvaluateResult =
        choleskyDecompositionOpenGamma.evaluate(matrix, 10.0d, 0.5d);

    // Assert
    assertTrue(actualEvaluateResult instanceof CholeskyDecompositionOpenGammaResult);
    assertEquals(1.0d, actualEvaluateResult.getDeterminant());
    assertEquals(matrix, actualEvaluateResult.getL());
    assertEquals(matrix, actualEvaluateResult.getLT());
  }

  /**
   * Test {@link CholeskyDecompositionOpenGamma#evaluate(DoubleMatrix, double, double)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return L is {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CholeskyDecompositionOpenGamma#evaluate(DoubleMatrix, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(DoubleMatrix, double, double); when DoubleMatrix; then return L is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CholeskyDecompositionResult CholeskyDecompositionOpenGamma.evaluate(DoubleMatrix, double, double)"
  })
  void testEvaluate_whenDoubleMatrix_thenReturnLIsEmpty() {
    // Arrange
    CholeskyDecompositionOpenGamma choleskyDecompositionOpenGamma =
        new CholeskyDecompositionOpenGamma();

    // Act
    CholeskyDecompositionResult actualEvaluateResult =
        choleskyDecompositionOpenGamma.evaluate(DoubleMatrix.of(), 10.0d, 10.0d);

    // Assert
    assertTrue(actualEvaluateResult instanceof CholeskyDecompositionOpenGammaResult);
    DoubleMatrix doubleMatrix = DoubleMatrix.EMPTY;
    assertSame(doubleMatrix, actualEvaluateResult.getL());
    assertSame(doubleMatrix, actualEvaluateResult.getLT());
  }
}
