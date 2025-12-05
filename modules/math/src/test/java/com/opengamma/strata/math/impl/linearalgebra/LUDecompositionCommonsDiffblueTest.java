package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LUDecompositionCommonsDiffblueTest {
  /**
   * Test {@link LUDecompositionCommons#apply(DoubleMatrix)} with {@code DoubleMatrix}.
   *
   * <ul>
   *   <li>Then return {@link LUDecompositionCommonsResult}.
   * </ul>
   *
   * <p>Method under test: {@link LUDecompositionCommons#apply(DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test apply(DoubleMatrix) with 'DoubleMatrix'; then return LUDecompositionCommonsResult")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LUDecompositionResult LUDecompositionCommons.apply(DoubleMatrix)"})
  void testApplyWithDoubleMatrix_thenReturnLUDecompositionCommonsResult() {
    // Arrange
    LUDecompositionCommons luDecompositionCommons = new LUDecompositionCommons();
    DoubleMatrix x = DoubleMatrix.identity(3);

    // Act
    LUDecompositionResult actualApplyResult = luDecompositionCommons.apply(x);

    // Assert
    assertTrue(actualApplyResult instanceof LUDecompositionCommonsResult);
    assertEquals(1.0d, actualApplyResult.getDeterminant());
    assertEquals(x, actualApplyResult.getL());
    assertEquals(x, actualApplyResult.getP());
    assertEquals(x, actualApplyResult.getU());
    assertArrayEquals(new int[] {0, 1, 2}, actualApplyResult.getPivot());
  }
}
