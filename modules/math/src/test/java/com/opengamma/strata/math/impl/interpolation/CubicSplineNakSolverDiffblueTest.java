package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CubicSplineNakSolverDiffblueTest {
  /**
   * Test {@link CubicSplineNakSolver#solve(double[], double[])}.
   *
   * <ul>
   *   <li>When array of {@code double} with {@link Double#NaN} and two.
   *   <li>Then return size is twelve.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineNakSolver#solve(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test solve(double[], double[]); when array of double with NaN and two; then return size is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix CubicSplineNakSolver.solve(double[], double[])"})
  void testSolve_whenArrayOfDoubleWithNaNAndTwo_thenReturnSizeIsTwelve() {
    // Arrange and Act
    DoubleMatrix actualSolveResult =
        new CubicSplineNakSolver()
            .solve(
                new double[] {Double.NaN, 2.0d, 10.0d, 2.0d},
                new double[] {10.0d, 2.0d, 10.0d, 2.0d});

    // Assert
    assertEquals(12, actualSolveResult.size());
    assertEquals(2, actualSolveResult.dimensions());
    double[][] toArrayUnsafeResult = actualSolveResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertFalse(actualSolveResult.isEmpty());
    assertFalse(actualSolveResult.isSquare());
    assertEquals(Double.NaN, actualSolveResult.total());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, 10.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, 10.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, 2.0d}, toArrayUnsafeResult[1], 0.0);
  }

  /**
   * Test {@link CubicSplineNakSolver#solveWithSensitivity(double[], double[])}.
   *
   * <ul>
   *   <li>Then return first element size is twelve.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineNakSolver#solveWithSensitivity(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test solveWithSensitivity(double[], double[]); then return first element size is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] CubicSplineNakSolver.solveWithSensitivity(double[], double[])"
  })
  void testSolveWithSensitivity_thenReturnFirstElementSizeIsTwelve() {
    // Arrange and Act
    DoubleMatrix[] actualSolveWithSensitivityResult =
        new CubicSplineNakSolver()
            .solveWithSensitivity(
                new double[] {Double.NaN, 2.0d, 10.0d, 2.0d},
                new double[] {10.0d, 2.0d, 10.0d, 2.0d});

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
   * Test {@link CubicSplineNakSolver#solveMultiDim(double[], DoubleMatrix)}.
   *
   * <ul>
   *   <li>Then return first element size is twelve.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineNakSolver#solveMultiDim(double[], DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solveMultiDim(double[], DoubleMatrix); then return first element size is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix[] CubicSplineNakSolver.solveMultiDim(double[], DoubleMatrix)"})
  void testSolveMultiDim_thenReturnFirstElementSizeIsTwelve() {
    // Arrange
    CubicSplineNakSolver cubicSplineNakSolver = new CubicSplineNakSolver();

    // Act
    DoubleMatrix[] actualSolveMultiDimResult =
        cubicSplineNakSolver.solveMultiDim(
            new double[] {Double.NaN, 2.0d, 10.0d, 2.0d}, DoubleMatrix.identity(4));

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

  /**
   * Test {@link CubicSplineNakSolver#solveMultiDim(double[], DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineNakSolver#solveMultiDim(double[], DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solveMultiDim(double[], DoubleMatrix); when DoubleMatrix; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix[] CubicSplineNakSolver.solveMultiDim(double[], DoubleMatrix)"})
  void testSolveMultiDim_whenDoubleMatrix_thenReturnArrayLengthIsZero() {
    // Arrange
    CubicSplineNakSolver cubicSplineNakSolver = new CubicSplineNakSolver();

    // Act and Assert
    assertEquals(
        0,
        cubicSplineNakSolver.solveMultiDim(
                new double[] {10.0d, 2.0d, 10.0d, 2.0d}, DoubleMatrix.of())
            .length);
  }

  /**
   * Test {@link CubicSplineNakSolver#getKnotsMat1D(double[])}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and two.
   *   <li>Then return max is ten.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineNakSolver#getKnotsMat1D(double[])}
   */
  @Test
  @DisplayName(
      "Test getKnotsMat1D(double[]); when array of double with ten and two; then return max is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray CubicSplineNakSolver.getKnotsMat1D(double[])"})
  void testGetKnotsMat1D_whenArrayOfDoubleWithTenAndTwo_thenReturnMaxIsTen() {
    // Arrange and Act
    DoubleArray actualKnotsMat1D =
        new CubicSplineNakSolver().getKnotsMat1D(new double[] {10.0d, 2.0d, 10.0d, 2.0d});

    // Assert
    assertEquals(10.0d, actualKnotsMat1D.max());
    List<Double> toListResult = actualKnotsMat1D.toList();
    assertEquals(4, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(2.0d, actualKnotsMat1D.min());
    assertEquals(2.0d, toListResult.get(1).doubleValue());
    assertEquals(2.0d, toListResult.get(3).doubleValue());
    assertEquals(24.0d, actualKnotsMat1D.sum());
    assertEquals(4, actualKnotsMat1D.size());
    assertFalse(actualKnotsMat1D.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 2.0d, 10.0d, 2.0d}, actualKnotsMat1D.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CubicSplineNakSolver#getKnotsMat1D(double[])}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineNakSolver#getKnotsMat1D(double[])}
   */
  @Test
  @DisplayName("Test getKnotsMat1D(double[]); when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray CubicSplineNakSolver.getKnotsMat1D(double[])"})
  void testGetKnotsMat1D_whenEmptyArrayOfDouble_thenReturnEmpty() {
    // Arrange and Act
    DoubleArray actualKnotsMat1D = new CubicSplineNakSolver().getKnotsMat1D(new double[] {});

    // Assert
    assertSame(DoubleArray.EMPTY, actualKnotsMat1D);
  }
}
