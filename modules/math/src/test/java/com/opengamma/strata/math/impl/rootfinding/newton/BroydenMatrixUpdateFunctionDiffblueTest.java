package com.opengamma.strata.math.impl.rootfinding.newton;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BroydenMatrixUpdateFunctionDiffblueTest {
  /**
   * Test {@link BroydenMatrixUpdateFunction#getUpdatedMatrix(Function, DoubleArray, DoubleArray,
   * DoubleArray, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is one.
   *   <li>Then return total is ten.
   * </ul>
   *
   * <p>Method under test: {@link BroydenMatrixUpdateFunction#getUpdatedMatrix(Function,
   * DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix); when DoubleArray with value is one; then return total is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix BroydenMatrixUpdateFunction.getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)"
  })
  void testGetUpdatedMatrix_whenDoubleArrayWithValueIsOne_thenReturnTotalIsTen() {
    // Arrange
    BroydenMatrixUpdateFunction broydenMatrixUpdateFunction = new BroydenMatrixUpdateFunction();
    Function<DoubleArray, DoubleMatrix> j = mock(Function.class);
    DoubleArray x = DoubleArray.of();
    DoubleArray deltaX = DoubleArray.of(1.0d);
    DoubleArray deltaY = DoubleArray.of(10.0d);

    // Act
    DoubleMatrix actualUpdatedMatrix =
        broydenMatrixUpdateFunction.getUpdatedMatrix(
            j, x, deltaX, deltaY, DoubleMatrix.filled(1, 1));

    // Assert
    assertEquals(1, actualUpdatedMatrix.size());
    double[][] toArrayUnsafeResult = actualUpdatedMatrix.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(10.0d, actualUpdatedMatrix.total());
    assertFalse(actualUpdatedMatrix.isEmpty());
    assertArrayEquals(new double[] {10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link BroydenMatrixUpdateFunction#getUpdatedMatrix(Function, DoubleArray, DoubleArray,
   * DoubleArray, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link BroydenMatrixUpdateFunction#getUpdatedMatrix(Function,
   * DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix); when DoubleMatrix; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix BroydenMatrixUpdateFunction.getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)"
  })
  void testGetUpdatedMatrix_whenDoubleMatrix_thenReturnEmpty() {
    // Arrange
    BroydenMatrixUpdateFunction broydenMatrixUpdateFunction = new BroydenMatrixUpdateFunction();
    Function<DoubleArray, DoubleMatrix> j = mock(Function.class);
    DoubleArray x = DoubleArray.of();
    DoubleArray deltaX = DoubleArray.of();
    DoubleArray deltaY = DoubleArray.of();

    // Act and Assert
    assertSame(
        DoubleMatrix.EMPTY,
        broydenMatrixUpdateFunction.getUpdatedMatrix(j, x, deltaX, deltaY, DoubleMatrix.of()));
  }

  /**
   * Test {@link BroydenMatrixUpdateFunction#getUpdatedMatrix(Function, DoubleArray, DoubleArray,
   * DoubleArray, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When filled one and one.
   *   <li>Then return total is one.
   * </ul>
   *
   * <p>Method under test: {@link BroydenMatrixUpdateFunction#getUpdatedMatrix(Function,
   * DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix); when filled one and one; then return total is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix BroydenMatrixUpdateFunction.getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)"
  })
  void testGetUpdatedMatrix_whenFilledOneAndOne_thenReturnTotalIsOne() {
    // Arrange
    BroydenMatrixUpdateFunction broydenMatrixUpdateFunction = new BroydenMatrixUpdateFunction();
    Function<DoubleArray, DoubleMatrix> j = mock(Function.class);
    DoubleArray x = DoubleArray.of();
    DoubleArray deltaX = DoubleArray.of(10.0d);
    DoubleArray deltaY = DoubleArray.of(10.0d);

    // Act
    DoubleMatrix actualUpdatedMatrix =
        broydenMatrixUpdateFunction.getUpdatedMatrix(
            j, x, deltaX, deltaY, DoubleMatrix.filled(1, 1));

    // Assert
    assertEquals(1, actualUpdatedMatrix.size());
    double[][] toArrayUnsafeResult = actualUpdatedMatrix.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, actualUpdatedMatrix.total());
    assertFalse(actualUpdatedMatrix.isEmpty());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link BroydenMatrixUpdateFunction#getUpdatedMatrix(Function, DoubleArray, DoubleArray,
   * DoubleArray, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link BroydenMatrixUpdateFunction#getUpdatedMatrix(Function,
   * DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix); when filled three; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix BroydenMatrixUpdateFunction.getUpdatedMatrix(Function, DoubleArray, DoubleArray, DoubleArray, DoubleMatrix)"
  })
  void testGetUpdatedMatrix_whenFilledThree_thenReturnEmpty() {
    // Arrange
    BroydenMatrixUpdateFunction broydenMatrixUpdateFunction = new BroydenMatrixUpdateFunction();
    Function<DoubleArray, DoubleMatrix> j = mock(Function.class);
    DoubleArray x = DoubleArray.of();
    DoubleArray deltaX = DoubleArray.filled(3);
    DoubleArray deltaY = DoubleArray.of();

    // Act and Assert
    assertSame(
        DoubleMatrix.EMPTY,
        broydenMatrixUpdateFunction.getUpdatedMatrix(j, x, deltaX, deltaY, DoubleMatrix.of()));
  }
}
