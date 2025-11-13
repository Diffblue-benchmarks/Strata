package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CubicSplineNaturalSolverDiffblueTest {
  /**
   * Test {@link CubicSplineNaturalSolver#solve(double[], double[])}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and {@code 0.5}.
   *   <li>Then return size is twelve.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineNaturalSolver#solve(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test solve(double[], double[]); when array of double with ten and '0.5'; then return size is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix CubicSplineNaturalSolver.solve(double[], double[])"})
  void testSolve_whenArrayOfDoubleWithTenAnd05_thenReturnSizeIsTwelve() {
    // Arrange and Act
    DoubleMatrix actualSolveResult =
        new CubicSplineNaturalSolver()
            .solve(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(12, actualSolveResult.size());
    assertEquals(2, actualSolveResult.dimensions());
    assertEquals(23.5d, actualSolveResult.total());
    double[][] toArrayUnsafeResult = actualSolveResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertFalse(actualSolveResult.isEmpty());
    assertFalse(actualSolveResult.isSquare());
    assertArrayEquals(new double[] {0.0d, 0.0d, 1.0d, 10.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {2.0502733603419326E-19d, -5.843279076974508E-18d, 1.0d, 0.5d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {2.0502733603419326E-19d, 0.0d, 1.0d, 10.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link CubicSplineNaturalSolver#solveWithSensitivity(double[], double[])}.
   *
   * <ul>
   *   <li>Then return second element total is one.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineNaturalSolver#solveWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test solveWithSensitivity(double[], double[]); then return second element total is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] CubicSplineNaturalSolver.solveWithSensitivity(double[], double[])"
  })
  void testSolveWithSensitivity_thenReturnSecondElementTotalIsOne() {
    // Arrange and Act
    DoubleMatrix[] actualSolveWithSensitivityResult =
        new CubicSplineNaturalSolver()
            .solveWithSensitivity(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    DoubleMatrix doubleMatrix = actualSolveWithSensitivityResult[1];
    assertEquals(1.0d, doubleMatrix.total());
    DoubleMatrix doubleMatrix2 = actualSolveWithSensitivityResult[2];
    assertEquals(1.0d, doubleMatrix2.total());
    DoubleMatrix doubleMatrix3 = actualSolveWithSensitivityResult[3];
    assertEquals(1.0d, doubleMatrix3.total());
    DoubleMatrix doubleMatrix4 = actualSolveWithSensitivityResult[0];
    assertEquals(12, doubleMatrix4.size());
    assertEquals(2, doubleMatrix4.dimensions());
    assertEquals(2, doubleMatrix.dimensions());
    assertEquals(2, doubleMatrix2.dimensions());
    assertEquals(2, doubleMatrix3.dimensions());
    assertEquals(23.5d, doubleMatrix4.total());
    assertEquals(3, doubleMatrix4.toArrayUnsafe().length);
    assertEquals(4, doubleMatrix.toArrayUnsafe().length);
    assertEquals(4, doubleMatrix2.toArrayUnsafe().length);
    assertEquals(4, doubleMatrix3.toArrayUnsafe().length);
    assertEquals(4, actualSolveWithSensitivityResult.length);
    assertFalse(doubleMatrix4.isEmpty());
    assertFalse(doubleMatrix.isEmpty());
    assertFalse(doubleMatrix2.isEmpty());
    assertFalse(doubleMatrix3.isEmpty());
    assertFalse(doubleMatrix4.isSquare());
    assertTrue(doubleMatrix.isSquare());
    assertTrue(doubleMatrix2.isSquare());
    assertTrue(doubleMatrix3.isSquare());
    assertEquals(Short.SIZE, doubleMatrix.size());
    assertEquals(Short.SIZE, doubleMatrix2.size());
    assertEquals(Short.SIZE, doubleMatrix3.size());
  }

  /**
   * Test {@link CubicSplineNaturalSolver#solveMultiDim(double[], DoubleMatrix)}.
   *
   * <ul>
   *   <li>Then return fourth element total is {@code -0.030908295669922786}.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineNaturalSolver#solveMultiDim(double[], DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solveMultiDim(double[], DoubleMatrix); then return fourth element total is '-0.030908295669922786'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] CubicSplineNaturalSolver.solveMultiDim(double[], DoubleMatrix)"
  })
  void testSolveMultiDim_thenReturnFourthElementTotalIs0030908295669922786() {
    // Arrange
    CubicSplineNaturalSolver cubicSplineNaturalSolver = new CubicSplineNaturalSolver();

    // Act
    DoubleMatrix[] actualSolveMultiDimResult =
        cubicSplineNaturalSolver.solveMultiDim(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, DoubleMatrix.identity(4));

    // Assert
    DoubleMatrix doubleMatrix = actualSolveMultiDimResult[3];
    assertEquals(-0.030908295669922786d, doubleMatrix.total());
    DoubleMatrix doubleMatrix2 = actualSolveMultiDimResult[1];
    assertEquals(0.7151188219857123d, doubleMatrix2.total());
    DoubleMatrix doubleMatrix3 = actualSolveMultiDimResult[0];
    assertEquals(0.9644263012100889d, doubleMatrix3.total());
    DoubleMatrix doubleMatrix4 = actualSolveMultiDimResult[2];
    assertEquals(1.3513631724741215d, doubleMatrix4.total());
    assertEquals(12, doubleMatrix3.size());
    assertEquals(12, doubleMatrix2.size());
    assertEquals(12, doubleMatrix4.size());
    assertEquals(12, doubleMatrix.size());
    assertEquals(2, doubleMatrix3.dimensions());
    assertEquals(2, doubleMatrix2.dimensions());
    assertEquals(2, doubleMatrix4.dimensions());
    assertEquals(2, doubleMatrix.dimensions());
    assertEquals(3, doubleMatrix3.toArrayUnsafe().length);
    assertEquals(3, doubleMatrix2.toArrayUnsafe().length);
    assertEquals(3, doubleMatrix4.toArrayUnsafe().length);
    assertEquals(3, doubleMatrix.toArrayUnsafe().length);
    assertEquals(4, actualSolveMultiDimResult.length);
    assertFalse(doubleMatrix3.isEmpty());
    assertFalse(doubleMatrix2.isEmpty());
    assertFalse(doubleMatrix4.isEmpty());
    assertFalse(doubleMatrix.isEmpty());
    assertFalse(doubleMatrix3.isSquare());
    assertFalse(doubleMatrix2.isSquare());
    assertFalse(doubleMatrix4.isSquare());
    assertFalse(doubleMatrix.isSquare());
  }

  /**
   * Test {@link CubicSplineNaturalSolver#solveMultiDim(double[], DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineNaturalSolver#solveMultiDim(double[], DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solveMultiDim(double[], DoubleMatrix); when DoubleMatrix; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] CubicSplineNaturalSolver.solveMultiDim(double[], DoubleMatrix)"
  })
  void testSolveMultiDim_whenDoubleMatrix_thenReturnArrayLengthIsZero() {
    // Arrange
    CubicSplineNaturalSolver cubicSplineNaturalSolver = new CubicSplineNaturalSolver();

    // Act and Assert
    assertEquals(
        0,
        cubicSplineNaturalSolver.solveMultiDim(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d}, DoubleMatrix.of())
            .length);
  }
}
