package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.MathException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CholeskyDecompositionCommonsDiffblueTest {
  /**
   * Test {@link CholeskyDecompositionCommons#apply(DoubleMatrix)} with {@code DoubleMatrix}.
   *
   * <ul>
   *   <li>Then return {@link CholeskyDecompositionCommonsResult}.
   * </ul>
   *
   * <p>Method under test: {@link CholeskyDecompositionCommons#apply(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test apply(DoubleMatrix) with 'DoubleMatrix'; then return CholeskyDecompositionCommonsResult")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CholeskyDecompositionResult CholeskyDecompositionCommons.apply(DoubleMatrix)"
  })
  void testApplyWithDoubleMatrix_thenReturnCholeskyDecompositionCommonsResult() {
    // Arrange
    CholeskyDecompositionCommons choleskyDecompositionCommons = new CholeskyDecompositionCommons();
    DoubleMatrix x = DoubleMatrix.identity(3);

    // Act
    CholeskyDecompositionResult actualApplyResult = choleskyDecompositionCommons.apply(x);

    // Assert
    assertTrue(actualApplyResult instanceof CholeskyDecompositionCommonsResult);
    assertEquals(1.0d, actualApplyResult.getDeterminant());
    assertEquals(x, actualApplyResult.getL());
    assertEquals(x, actualApplyResult.getLT());
  }

  /**
   * Test {@link CholeskyDecompositionCommons#apply(DoubleMatrix)} with {@code DoubleMatrix}.
   *
   * <ul>
   *   <li>When filled one and one.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link CholeskyDecompositionCommons#apply(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test apply(DoubleMatrix) with 'DoubleMatrix'; when filled one and one; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CholeskyDecompositionResult CholeskyDecompositionCommons.apply(DoubleMatrix)"
  })
  void testApplyWithDoubleMatrix_whenFilledOneAndOne_thenThrowMathException() {
    // Arrange
    CholeskyDecompositionCommons choleskyDecompositionCommons = new CholeskyDecompositionCommons();

    // Act and Assert
    assertThrows(
        MathException.class, () -> choleskyDecompositionCommons.apply(DoubleMatrix.filled(1, 1)));
  }
}
