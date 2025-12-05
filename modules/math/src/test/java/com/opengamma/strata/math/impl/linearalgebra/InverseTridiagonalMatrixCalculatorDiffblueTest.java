package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InverseTridiagonalMatrixCalculatorDiffblueTest {
  /**
   * Test {@link InverseTridiagonalMatrixCalculator#apply(TridiagonalMatrix)} with {@code
   * TridiagonalMatrix}.
   *
   * <ul>
   *   <li>Then return total is {@code 0.19973680565175234}.
   * </ul>
   *
   * <p>Method under test: {@link InverseTridiagonalMatrixCalculator#apply(TridiagonalMatrix)}
   */
  @Test
  @DisplayName(
      "Test apply(TridiagonalMatrix) with 'TridiagonalMatrix'; then return total is '0.19973680565175234'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix InverseTridiagonalMatrixCalculator.apply(TridiagonalMatrix)"})
  void testApplyWithTridiagonalMatrix_thenReturnTotalIs019973680565175234() {
    // Arrange
    InverseTridiagonalMatrixCalculator inverseTridiagonalMatrixCalculator =
        new InverseTridiagonalMatrixCalculator();

    TridiagonalMatrix x = mock(TridiagonalMatrix.class);
    when(x.getDiagonalData()).thenReturn(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    when(x.getLowerSubDiagonalData()).thenReturn(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    when(x.getUpperSubDiagonalData()).thenReturn(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act
    DoubleMatrix actualApplyResult = inverseTridiagonalMatrixCalculator.apply(x);

    // Assert
    verify(x).getDiagonalData();
    verify(x).getLowerSubDiagonalData();
    verify(x).getUpperSubDiagonalData();
    assertEquals(0.19973680565175234d, actualApplyResult.total());
    assertEquals(2, actualApplyResult.dimensions());
    double[][] toArrayUnsafeResult = actualApplyResult.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertFalse(actualApplyResult.isEmpty());
    assertTrue(actualApplyResult.isSquare());
    assertEquals(Short.SIZE, actualApplyResult.size());
    assertArrayEquals(
        new double[] {
          -0.005277739299071894d,
          0.10527773929907189d,
          2.770466823659787E-4d,
          -0.0055409336473195734d
        },
        toArrayUnsafeResult[0],
        0.0);
    assertArrayEquals(
        new double[] {
          -0.0055409336473195734d,
          0.0055409336473195734d,
          0.10527773929907189d,
          -0.10555478598143787d
        },
        toArrayUnsafeResult[3],
        0.0);
    assertArrayEquals(
        new double[] {
          0.10527773929907189d,
          -0.10527773929907189d,
          -2.770466823659787E-4d,
          0.0055409336473195734d
        },
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {
          2.770466823659787E-4d,
          -2.770466823659787E-4d,
          -0.005263886964953595d,
          0.10527773929907189d
        },
        toArrayUnsafeResult[2],
        0.0);
  }
}
