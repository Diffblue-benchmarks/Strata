package com.opengamma.strata.math.impl.rootfinding.newton;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.matrix.MatrixAlgebra;
import com.opengamma.strata.math.impl.matrix.MatrixAlgebraFactory;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ShermanMorrisonMatrixUpdateFunctionDiffblueTest {
  /**
   * Test {@link
   * ShermanMorrisonMatrixUpdateFunction#ShermanMorrisonMatrixUpdateFunction(MatrixAlgebra)}.
   *
   * <ul>
   *   <li>Then {@link DoubleMatrix} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ShermanMorrisonMatrixUpdateFunction#ShermanMorrisonMatrixUpdateFunction(MatrixAlgebra)}
   */
  @Test
  @DisplayName(
      "Test new ShermanMorrisonMatrixUpdateFunction(MatrixAlgebra); then DoubleMatrix size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ShermanMorrisonMatrixUpdateFunction.<init>(MatrixAlgebra)"})
  void testNewShermanMorrisonMatrixUpdateFunction_thenDoubleMatrixSizeIsZero() {
    // Arrange and Act
    ShermanMorrisonMatrixUpdateFunction actualShermanMorrisonMatrixUpdateFunction =
        new ShermanMorrisonMatrixUpdateFunction(MatrixAlgebraFactory.OG_ALGEBRA);
    Function<DoubleArray, DoubleMatrix> g = mock(Function.class);
    DoubleArray x = DoubleArray.of();
    DoubleArray deltaX = DoubleArray.of();
    DoubleArray deltaY = DoubleArray.of();
    DoubleMatrix matrix = DoubleMatrix.of();
    DoubleMatrix actualUpdatedMatrix =
        actualShermanMorrisonMatrixUpdateFunction.getUpdatedMatrix(g, x, deltaX, deltaY, matrix);

    // Assert
    assertEquals(0, x.size());
    assertEquals(0, matrix.size());
    assertEquals(0.0d, x.sum());
    assertEquals(0.0d, matrix.total());
    assertEquals(1, x.dimensions());
    assertEquals(2, matrix.dimensions());
    assertTrue(x.isEmpty());
    assertTrue(matrix.isEmpty());
    assertTrue(matrix.isSquare());
    assertTrue(x.toList().isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualUpdatedMatrix);
    assertArrayEquals(new double[] {}, x.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * ShermanMorrisonMatrixUpdateFunction#ShermanMorrisonMatrixUpdateFunction(MatrixAlgebra)}.
   *
   * <ul>
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ShermanMorrisonMatrixUpdateFunction#ShermanMorrisonMatrixUpdateFunction(MatrixAlgebra)}
   */
  @Test
  @DisplayName(
      "Test new ShermanMorrisonMatrixUpdateFunction(MatrixAlgebra); then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ShermanMorrisonMatrixUpdateFunction.<init>(MatrixAlgebra)"})
  void testNewShermanMorrisonMatrixUpdateFunction_thenFilledThreeMaxIsZero() {
    // Arrange and Act
    ShermanMorrisonMatrixUpdateFunction actualShermanMorrisonMatrixUpdateFunction =
        new ShermanMorrisonMatrixUpdateFunction(MatrixAlgebraFactory.OG_ALGEBRA);
    Function<DoubleArray, DoubleMatrix> g = mock(Function.class);
    DoubleArray x = DoubleArray.of();
    DoubleArray deltaX = DoubleArray.filled(3);
    DoubleArray deltaY = DoubleArray.filled(3);
    DoubleMatrix matrix = DoubleMatrix.identity(3);
    DoubleMatrix actualUpdatedMatrix =
        actualShermanMorrisonMatrixUpdateFunction.getUpdatedMatrix(g, x, deltaX, deltaY, matrix);

    // Assert
    assertEquals(0, x.size());
    assertEquals(0.0d, deltaX.max());
    assertEquals(0.0d, deltaX.min());
    assertEquals(0.0d, deltaX.sum());
    assertEquals(0.0d, x.sum());
    assertEquals(1, deltaX.dimensions());
    assertEquals(1, x.dimensions());
    assertEquals(2, matrix.dimensions());
    assertEquals(3, deltaX.size());
    assertEquals(3, deltaX.toList().size());
    assertEquals(3.0d, matrix.total());
    assertEquals(9, matrix.size());
    assertFalse(deltaX.isEmpty());
    assertFalse(matrix.isEmpty());
    assertTrue(x.isEmpty());
    assertTrue(matrix.isSquare());
    assertTrue(x.toList().isEmpty());
    assertSame(matrix, actualUpdatedMatrix);
    assertArrayEquals(new double[] {}, x.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, deltaX.toArrayUnsafe(), 0.0);
  }
}
