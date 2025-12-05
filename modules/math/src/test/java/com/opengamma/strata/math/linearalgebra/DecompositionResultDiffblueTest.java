package com.opengamma.strata.math.linearalgebra;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.math.impl.linearalgebra.CholeskyDecompositionOpenGammaResult;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DecompositionResultDiffblueTest {
  /**
   * Test {@link DecompositionResult#solve(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link DecompositionResult#solve(DoubleArray)}
   */
  @Test
  @DisplayName("Test solve(DoubleArray) with 'DoubleArray'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DecompositionResult.solve(DoubleArray)"})
  void testSolveWithDoubleArray_thenReturnEmpty() {
    // Arrange
    CholeskyDecompositionOpenGammaResult choleskyDecompositionOpenGammaResult =
        new CholeskyDecompositionOpenGammaResult(new double[][] {});

    // Act and Assert
    assertSame(DoubleArray.EMPTY, choleskyDecompositionOpenGammaResult.solve(DoubleArray.of()));
  }

  /**
   * Test {@link DecompositionResult#solve(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return max is {@code 0.1}.
   * </ul>
   *
   * <p>Method under test: {@link DecompositionResult#solve(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray) with 'DoubleArray'; when DoubleArray with value is ten; then return max is '0.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray DecompositionResult.solve(DoubleArray)"})
  void testSolveWithDoubleArray_whenDoubleArrayWithValueIsTen_thenReturnMaxIs01() {
    // Arrange
    double[][] lArray = new double[][] {new double[] {10.0d, 2.0d, 10.0d, 2.0d}};
    CholeskyDecompositionOpenGammaResult choleskyDecompositionOpenGammaResult =
        new CholeskyDecompositionOpenGammaResult(lArray);

    // Act
    DoubleArray actualSolveResult =
        choleskyDecompositionOpenGammaResult.solve(DoubleArray.of(10.0d));

    // Assert
    assertEquals(0.1d, actualSolveResult.max());
    assertEquals(0.1d, actualSolveResult.min());
    assertEquals(0.1d, actualSolveResult.sum());
    List<Double> toListResult = actualSolveResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.1d, toListResult.get(0).doubleValue());
    assertEquals(1, actualSolveResult.size());
    assertFalse(actualSolveResult.isEmpty());
    assertArrayEquals(new double[] {0.1d}, actualSolveResult.toArrayUnsafe(), 0.0);
  }
}
