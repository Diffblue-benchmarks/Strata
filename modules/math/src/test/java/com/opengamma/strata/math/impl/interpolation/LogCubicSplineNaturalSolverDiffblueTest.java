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

class LogCubicSplineNaturalSolverDiffblueTest {
  /**
   * Test {@link LogCubicSplineNaturalSolver#solve(double[], double[])}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and {@code 0.5}.
   *   <li>Then return size is twelve.
   * </ul>
   *
   * <p>Method under test: {@link LogCubicSplineNaturalSolver#solve(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test solve(double[], double[]); when array of double with ten and '0.5'; then return size is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix LogCubicSplineNaturalSolver.solve(double[], double[])"})
  void testSolve_whenArrayOfDoubleWithTenAnd05_thenReturnSizeIsTwelve() {
    // Arrange and Act
    DoubleMatrix actualSolveResult =
        new LogCubicSplineNaturalSolver()
            .solve(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(12, actualSolveResult.size());
    assertEquals(2, actualSolveResult.dimensions());
    double[][] toArrayUnsafeResult = actualSolveResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertFalse(actualSolveResult.isEmpty());
    assertFalse(actualSolveResult.isSquare());
    assertEquals(Double.NaN, actualSolveResult.total());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, 0.5d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, 10.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, 10.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link LogCubicSplineNaturalSolver#solveWithSensitivity(double[], double[])}.
   *
   * <ul>
   *   <li>Then return first element size is twelve.
   * </ul>
   *
   * <p>Method under test: {@link LogCubicSplineNaturalSolver#solveWithSensitivity(double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test solveWithSensitivity(double[], double[]); then return first element size is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] LogCubicSplineNaturalSolver.solveWithSensitivity(double[], double[])"
  })
  void testSolveWithSensitivity_thenReturnFirstElementSizeIsTwelve() {
    // Arrange and Act
    DoubleMatrix[] actualSolveWithSensitivityResult =
        new LogCubicSplineNaturalSolver()
            .solveWithSensitivity(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    DoubleMatrix doubleMatrix = actualSolveWithSensitivityResult[0];
    assertEquals(12, doubleMatrix.size());
    assertEquals(2, doubleMatrix.dimensions());
    DoubleMatrix doubleMatrix2 = actualSolveWithSensitivityResult[1];
    assertEquals(2, doubleMatrix2.dimensions());
    DoubleMatrix doubleMatrix3 = actualSolveWithSensitivityResult[2];
    assertEquals(2, doubleMatrix3.dimensions());
    DoubleMatrix doubleMatrix4 = actualSolveWithSensitivityResult[3];
    assertEquals(2, doubleMatrix4.dimensions());
    assertEquals(3, doubleMatrix.toArrayUnsafe().length);
    assertEquals(4, doubleMatrix2.toArrayUnsafe().length);
    assertEquals(4, doubleMatrix3.toArrayUnsafe().length);
    assertEquals(4, doubleMatrix4.toArrayUnsafe().length);
    assertEquals(4, actualSolveWithSensitivityResult.length);
    assertFalse(doubleMatrix.isEmpty());
    assertFalse(doubleMatrix2.isEmpty());
    assertFalse(doubleMatrix3.isEmpty());
    assertFalse(doubleMatrix4.isEmpty());
    assertFalse(doubleMatrix.isSquare());
    assertTrue(doubleMatrix2.isSquare());
    assertTrue(doubleMatrix3.isSquare());
    assertTrue(doubleMatrix4.isSquare());
    assertEquals(Double.NaN, doubleMatrix.total());
    assertEquals(Double.NaN, doubleMatrix2.total());
    assertEquals(Double.NaN, doubleMatrix3.total());
    assertEquals(Double.NaN, doubleMatrix4.total());
    assertEquals(Short.SIZE, doubleMatrix2.size());
    assertEquals(Short.SIZE, doubleMatrix3.size());
    assertEquals(Short.SIZE, doubleMatrix4.size());
  }

  /**
   * Test {@link LogCubicSplineNaturalSolver#solveMultiDim(double[], DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link LogCubicSplineNaturalSolver#solveMultiDim(double[], DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solveMultiDim(double[], DoubleMatrix); when DoubleMatrix; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] LogCubicSplineNaturalSolver.solveMultiDim(double[], DoubleMatrix)"
  })
  void testSolveMultiDim_whenDoubleMatrix_thenReturnArrayLengthIsZero() {
    // Arrange
    LogCubicSplineNaturalSolver logCubicSplineNaturalSolver = new LogCubicSplineNaturalSolver();

    // Act and Assert
    assertEquals(
        0,
        logCubicSplineNaturalSolver.solveMultiDim(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d}, DoubleMatrix.of())
            .length);
  }

  /**
   * Test {@link LogCubicSplineNaturalSolver#solveMultiDim(double[], DoubleMatrix)}.
   *
   * <ul>
   *   <li>When identity four.
   *   <li>Then return first element size is twelve.
   * </ul>
   *
   * <p>Method under test: {@link LogCubicSplineNaturalSolver#solveMultiDim(double[], DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solveMultiDim(double[], DoubleMatrix); when identity four; then return first element size is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] LogCubicSplineNaturalSolver.solveMultiDim(double[], DoubleMatrix)"
  })
  void testSolveMultiDim_whenIdentityFour_thenReturnFirstElementSizeIsTwelve() {
    // Arrange
    LogCubicSplineNaturalSolver logCubicSplineNaturalSolver = new LogCubicSplineNaturalSolver();

    // Act
    DoubleMatrix[] actualSolveMultiDimResult =
        logCubicSplineNaturalSolver.solveMultiDim(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, DoubleMatrix.identity(4));

    // Assert
    DoubleMatrix doubleMatrix = actualSolveMultiDimResult[0];
    assertEquals(12, doubleMatrix.size());
    DoubleMatrix doubleMatrix2 = actualSolveMultiDimResult[1];
    assertEquals(12, doubleMatrix2.size());
    DoubleMatrix doubleMatrix3 = actualSolveMultiDimResult[2];
    assertEquals(12, doubleMatrix3.size());
    DoubleMatrix doubleMatrix4 = actualSolveMultiDimResult[3];
    assertEquals(12, doubleMatrix4.size());
    assertEquals(2, doubleMatrix.dimensions());
    assertEquals(2, doubleMatrix2.dimensions());
    assertEquals(2, doubleMatrix3.dimensions());
    assertEquals(2, doubleMatrix4.dimensions());
    assertEquals(3, doubleMatrix.toArrayUnsafe().length);
    assertEquals(3, doubleMatrix2.toArrayUnsafe().length);
    assertEquals(3, doubleMatrix3.toArrayUnsafe().length);
    assertEquals(3, doubleMatrix4.toArrayUnsafe().length);
    assertEquals(4, actualSolveMultiDimResult.length);
    assertFalse(doubleMatrix.isEmpty());
    assertFalse(doubleMatrix2.isEmpty());
    assertFalse(doubleMatrix3.isEmpty());
    assertFalse(doubleMatrix4.isEmpty());
    assertFalse(doubleMatrix.isSquare());
    assertFalse(doubleMatrix2.isSquare());
    assertFalse(doubleMatrix3.isSquare());
    assertFalse(doubleMatrix4.isSquare());
    assertEquals(Double.NaN, doubleMatrix.total());
    assertEquals(Double.NaN, doubleMatrix2.total());
    assertEquals(Double.NaN, doubleMatrix3.total());
    assertEquals(Double.NaN, doubleMatrix4.total());
  }
}
