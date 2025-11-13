package com.opengamma.strata.math.impl.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TridiagonalSolverDiffblueTest {
  /**
   * Test {@link TridiagonalSolver#solvTriDag(TridiagonalMatrix, double[])} with {@code
   * TridiagonalMatrix}, {@code double[]}.
   *
   * <p>Method under test: {@link TridiagonalSolver#solvTriDag(TridiagonalMatrix, double[])}
   */
  @Test
  @DisplayName("Test solvTriDag(TridiagonalMatrix, double[]) with 'TridiagonalMatrix', 'double[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] TridiagonalSolver.solvTriDag(TridiagonalMatrix, double[])"})
  void testSolvTriDagWithTridiagonalMatrixDouble() {
    // Arrange
    TridiagonalMatrix aM = mock(TridiagonalMatrix.class);
    when(aM.getLowerSubDiagonalData()).thenReturn(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    when(aM.getUpperSubDiagonalData()).thenReturn(new double[] {10.0d, 0.5d, 10.0d, 0.5d});
    when(aM.getDiagonal()).thenReturn(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act
    double[] actualSolvTriDagResult =
        TridiagonalSolver.solvTriDag(aM, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    verify(aM).getDiagonal();
    verify(aM).getLowerSubDiagonalData();
    verify(aM).getUpperSubDiagonalData();
    assertArrayEquals(
        new double[] {
          -1.385233411831166E-4d, 1.000138523341183d, 0.0026319434824768413d, 0.947361130350464d
        },
        actualSolvTriDagResult,
        0.0);
  }
}
