package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CubicSplineSolverDiffblueTest {
  /**
   * Test {@link CubicSplineSolver#getKnotsMat1D(double[])}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and {@code 0.5}.
   *   <li>Then return min is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineSolver#getKnotsMat1D(double[])}
   */
  @Test
  @DisplayName(
      "Test getKnotsMat1D(double[]); when array of double with ten and '0.5'; then return min is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray CubicSplineSolver.getKnotsMat1D(double[])"})
  void testGetKnotsMat1D_whenArrayOfDoubleWithTenAnd05_thenReturnMinIs05() {
    // Arrange and Act
    DoubleArray actualKnotsMat1D =
        new CubicSplineNakSolver().getKnotsMat1D(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(0.5d, actualKnotsMat1D.min());
    List<Double> toListResult = actualKnotsMat1D.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.5d, toListResult.get(1).doubleValue());
    assertEquals(0.5d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, actualKnotsMat1D.max());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(21.0d, actualKnotsMat1D.sum());
    assertEquals(4, actualKnotsMat1D.size());
    assertFalse(actualKnotsMat1D.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d}, actualKnotsMat1D.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CubicSplineSolver#getKnotsMat1D(double[])}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineSolver#getKnotsMat1D(double[])}
   */
  @Test
  @DisplayName("Test getKnotsMat1D(double[]); when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray CubicSplineSolver.getKnotsMat1D(double[])"})
  void testGetKnotsMat1D_whenEmptyArrayOfDouble_thenReturnEmpty() {
    // Arrange and Act
    DoubleArray actualKnotsMat1D = new CubicSplineNakSolver().getKnotsMat1D(new double[] {});

    // Assert
    assertSame(DoubleArray.EMPTY, actualKnotsMat1D);
  }

  /**
   * Test {@link CubicSplineSolver#getDiffs(double[])}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and {@code 0.5}.
   *   <li>Then return array of {@code double} with {@code -9.5} and {@code 9.5}.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineSolver#getDiffs(double[])}
   */
  @Test
  @DisplayName(
      "Test getDiffs(double[]); when array of double with ten and '0.5'; then return array of double with '-9.5' and '9.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] CubicSplineSolver.getDiffs(double[])"})
  void testGetDiffs_whenArrayOfDoubleWithTenAnd05_thenReturnArrayOfDoubleWith95And95() {
    // Arrange and Act
    double[] actualDiffs =
        new CubicSplineNakSolver().getDiffs(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertArrayEquals(new double[] {-9.5d, 9.5d, -9.5d}, actualDiffs, 0.0);
  }

  /**
   * Test {@link CubicSplineSolver#getCommonSplineCoeffs(double[], double[], double[], double[])}.
   *
   * <ul>
   *   <li>Then return total is {@code -18.55000000000001}.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineSolver#getCommonSplineCoeffs(double[], double[],
   * double[], double[])}
   */
  @Test
  @DisplayName(
      "Test getCommonSplineCoeffs(double[], double[], double[], double[]); then return total is '-18.55000000000001'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix CubicSplineSolver.getCommonSplineCoeffs(double[], double[], double[], double[])"
  })
  void testGetCommonSplineCoeffs_thenReturnTotalIs1855000000000001() {
    // Arrange and Act
    DoubleMatrix actualCommonSplineCoeffs =
        new CubicSplineNakSolver()
            .getCommonSplineCoeffs(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(-18.55000000000001d, actualCommonSplineCoeffs.total());
    assertEquals(12, actualCommonSplineCoeffs.size());
    assertEquals(2, actualCommonSplineCoeffs.dimensions());
    double[][] toArrayUnsafeResult = actualCommonSplineCoeffs.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertFalse(actualCommonSplineCoeffs.isEmpty());
    assertFalse(actualCommonSplineCoeffs.isSquare());
    assertArrayEquals(
        new double[] {-0.15833333333333335d, 5.0d, -35.116666666666674d, 10.0d},
        toArrayUnsafeResult[0],
        0.0);
    assertArrayEquals(
        new double[] {-0.15833333333333335d, 5.0d, -35.116666666666674d, 10.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {3.166666666666667d, 0.25d, 18.083333333333336d, 0.5d},
        toArrayUnsafeResult[1],
        0.0);
  }

  /**
   * Test {@link CubicSplineSolver#getCommonSensitivityCoeffs(double[], double[][])}.
   *
   * <ul>
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineSolver#getCommonSensitivityCoeffs(double[],
   * double[][])}
   */
  @Test
  @DisplayName(
      "Test getCommonSensitivityCoeffs(double[], double[][]); then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] CubicSplineSolver.getCommonSensitivityCoeffs(double[], double[][])"
  })
  void testGetCommonSensitivityCoeffs_thenReturnArrayLengthIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0,
        new CubicSplineNakSolver()
            .getCommonSensitivityCoeffs(
                new double[] {}, new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}})
            .length);
  }

  /**
   * Test {@link CubicSplineSolver#getCommonMatrixElements(double[])}.
   *
   * <p>Method under test: {@link CubicSplineSolver#getCommonMatrixElements(double[])}
   */
  @Test
  @DisplayName("Test getCommonMatrixElements(double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] CubicSplineSolver.getCommonMatrixElements(double[])"})
  void testGetCommonMatrixElements() {
    // Arrange and Act
    double[][] actualCommonMatrixElements =
        new CubicSplineNakSolver().getCommonMatrixElements(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(5, actualCommonMatrixElements.length);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, actualCommonMatrixElements[0], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, actualCommonMatrixElements[4], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 10.0d, 21.0d, 0.5d}, actualCommonMatrixElements[3], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.5d, 21.0d, 10.0d, 0.0d}, actualCommonMatrixElements[2], 0.0);
    assertArrayEquals(
        new double[] {10.0d, 21.0d, 0.5d, 0.0d, 0.0d}, actualCommonMatrixElements[1], 0.0);
  }

  /**
   * Test {@link CubicSplineSolver#getCommonVectorElements(double[], double[])}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with zero and {@code 119.7}.
   * </ul>
   *
   * <p>Method under test: {@link CubicSplineSolver#getCommonVectorElements(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test getCommonVectorElements(double[], double[]); then return array of double with zero and '119.7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] CubicSplineSolver.getCommonVectorElements(double[], double[])"})
  void testGetCommonVectorElements_thenReturnArrayOfDoubleWithZeroAnd1197() {
    // Arrange and Act
    double[] actualCommonVectorElements =
        new CubicSplineNakSolver()
            .getCommonVectorElements(
                new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertArrayEquals(new double[] {0.0d, 119.7d, -119.7d, 0.0d}, actualCommonVectorElements, 0.0);
  }

  /**
   * Test {@link CubicSplineSolver#getCommonVectorSensitivity(double[])}.
   *
   * <p>Method under test: {@link CubicSplineSolver#getCommonVectorSensitivity(double[])}
   */
  @Test
  @DisplayName("Test getCommonVectorSensitivity(double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] CubicSplineSolver.getCommonVectorSensitivity(double[])"})
  void testGetCommonVectorSensitivity() {
    // Arrange and Act
    double[][] actualCommonVectorSensitivity =
        new CubicSplineNakSolver()
            .getCommonVectorSensitivity(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(5, actualCommonVectorSensitivity.length);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, actualCommonVectorSensitivity[0], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, actualCommonVectorSensitivity[4], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.6d, -12.6d, 12.0d}, actualCommonVectorSensitivity[3], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 12.0d, -12.6d, 0.6d, 0.0d}, actualCommonVectorSensitivity[2], 0.0);
    assertArrayEquals(
        new double[] {0.6d, -12.6d, 12.0d, 0.0d, 0.0d}, actualCommonVectorSensitivity[1], 0.0);
  }
}
