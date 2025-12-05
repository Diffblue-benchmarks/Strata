package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PenaltyMatrixGeneratorDiffblueTest {
  /**
   * Test {@link PenaltyMatrixGenerator#getDifferenceMatrix(int, int)}.
   *
   * <ul>
   *   <li>When twenty.
   *   <li>Then return array length is twenty.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getDifferenceMatrix(int, int)}
   */
  @Test
  @DisplayName(
      "Test getDifferenceMatrix(int, int); when twenty; then return array length is twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getDifferenceMatrix(int, int)"})
  void testGetDifferenceMatrix_whenTwenty_thenReturnArrayLengthIsTwenty() {
    // Arrange and Act
    DoubleMatrix actualDifferenceMatrix = PenaltyMatrixGenerator.getDifferenceMatrix(20, 2);

    // Assert
    assertEquals(20, actualDifferenceMatrix.toArrayUnsafe().length);
    assertEquals(400, actualDifferenceMatrix.size());
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getDifferenceMatrix(int, int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return array length is two.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getDifferenceMatrix(int, int)}
   */
  @Test
  @DisplayName("Test getDifferenceMatrix(int, int); when two; then return array length is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getDifferenceMatrix(int, int)"})
  void testGetDifferenceMatrix_whenTwo_thenReturnArrayLengthIsTwo() {
    // Arrange and Act
    DoubleMatrix actualDifferenceMatrix = PenaltyMatrixGenerator.getDifferenceMatrix(2, 1);

    // Assert
    double[][] toArrayUnsafeResult = actualDifferenceMatrix.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4, actualDifferenceMatrix.size());
    assertArrayEquals(new double[] {-1.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getDifferenceMatrix(int, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getDifferenceMatrix(int, int)}
   */
  @Test
  @DisplayName("Test getDifferenceMatrix(int, int); when zero; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getDifferenceMatrix(int, int)"})
  void testGetDifferenceMatrix_whenZero_thenReturnSizeIsOne() {
    // Arrange and Act
    DoubleMatrix actualDifferenceMatrix = PenaltyMatrixGenerator.getDifferenceMatrix(1, 0);

    // Assert
    assertEquals(1, actualDifferenceMatrix.size());
    double[][] toArrayUnsafeResult = actualDifferenceMatrix.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, actualDifferenceMatrix.total());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(int, int)} with {@code m}, {@code k}.
   *
   * <ul>
   *   <li>When twenty.
   *   <li>Then return array length is twenty.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(int, int)}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(int, int) with 'm', 'k'; when twenty; then return array length is twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(int, int)"})
  void testGetPenaltyMatrixWithMK_whenTwenty_thenReturnArrayLengthIsTwenty() {
    // Arrange and Act
    DoubleMatrix actualPenaltyMatrix = PenaltyMatrixGenerator.getPenaltyMatrix(20, 2);

    // Assert
    assertEquals(20, actualPenaltyMatrix.toArrayUnsafe().length);
    assertEquals(400, actualPenaltyMatrix.size());
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(int, int)} with {@code m}, {@code k}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return array length is two.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(int, int)}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(int, int) with 'm', 'k'; when two; then return array length is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(int, int)"})
  void testGetPenaltyMatrixWithMK_whenTwo_thenReturnArrayLengthIsTwo() {
    // Arrange and Act
    DoubleMatrix actualPenaltyMatrix = PenaltyMatrixGenerator.getPenaltyMatrix(2, 1);

    // Assert
    double[][] toArrayUnsafeResult = actualPenaltyMatrix.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4, actualPenaltyMatrix.size());
    assertArrayEquals(new double[] {-1.0d, 1.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, -1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(int, int)} with {@code m}, {@code k}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(int, int)}
   */
  @Test
  @DisplayName("Test getPenaltyMatrix(int, int) with 'm', 'k'; when zero; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(int, int)"})
  void testGetPenaltyMatrixWithMK_whenZero_thenReturnSizeIsOne() {
    // Arrange and Act
    DoubleMatrix actualPenaltyMatrix = PenaltyMatrixGenerator.getPenaltyMatrix(1, 0);

    // Assert
    assertEquals(1, actualPenaltyMatrix.size());
    double[][] toArrayUnsafeResult = actualPenaltyMatrix.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, actualPenaltyMatrix.total());
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(int[], int[], double[])} with {@code
   * numElements}, {@code k}, {@code lambda}.
   *
   * <ul>
   *   <li>Then return array length is one hundred.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(int[], int[], double[])}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(int[], int[], double[]) with 'numElements', 'k', 'lambda'; then return array length is one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(int[], int[], double[])"
  })
  void testGetPenaltyMatrixWithNumElementsKLambda_thenReturnArrayLengthIsOneHundred() {
    // Arrange, Act and Assert
    assertEquals(
        100,
        PenaltyMatrixGenerator.getPenaltyMatrix(
                new int[] {10, 1, 10, 1},
                new int[] {1, 0, 1, 0},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d})
            .toArrayUnsafe()
            .length);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(int[], int[], double[])} with {@code
   * numElements}, {@code k}, {@code lambda}.
   *
   * <ul>
   *   <li>When array of {@code int} with four and zero.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(int[], int[], double[])}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(int[], int[], double[]) with 'numElements', 'k', 'lambda'; when array of int with four and zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(int[], int[], double[])"
  })
  void testGetPenaltyMatrixWithNumElementsKLambda_whenArrayOfIntWithFourAndZero() {
    // Arrange, Act and Assert
    assertEquals(
        100,
        PenaltyMatrixGenerator.getPenaltyMatrix(
                new int[] {10, 1, 10, 1},
                new int[] {4, 0, 1, 0},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d})
            .toArrayUnsafe()
            .length);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[][], int, int)} with {@code x},
   * {@code k}, {@code index}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[][], int, int)}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(double[][], int, int) with 'x', 'k', 'index'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(double[][], int, int)"})
  void testGetPenaltyMatrixWithXKIndex_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            PenaltyMatrixGenerator.getPenaltyMatrix(
                new double[][] {
                  new double[] {2.0d, 10.0d, 2.0d, 10.0d},
                  new double[] {2.0d, 8.0d, 2.0d, 8.0d, 2.0d, 8.0d, 2.0d, 8.0d}
                },
                4,
                1));
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[][], int, int)} with {@code x},
   * {@code k}, {@code index}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[][], int, int)}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(double[][], int, int) with 'x', 'k', 'index'; when empty array of double; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(double[][], int, int)"})
  void testGetPenaltyMatrixWithXKIndex_whenEmptyArrayOfDouble_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualPenaltyMatrix =
        PenaltyMatrixGenerator.getPenaltyMatrix(
            new double[][] {new double[] {}, new double[] {2.0d, 10.0d, 2.0d, 10.0d}}, 0, 1);

    // Assert
    assertEquals(0, actualPenaltyMatrix.size());
    assertEquals(0, actualPenaltyMatrix.toArrayUnsafe().length);
    assertEquals(0.0d, actualPenaltyMatrix.total());
    assertTrue(actualPenaltyMatrix.isEmpty());
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[][], int, int)} with {@code x},
   * {@code k}, {@code index}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return array length is {@link Short#SIZE}.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[][], int, int)}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(double[][], int, int) with 'x', 'k', 'index'; when zero; then return array length is SIZE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(double[][], int, int)"})
  void testGetPenaltyMatrixWithXKIndex_whenZero_thenReturnArrayLengthIsSize() {
    // Arrange, Act and Assert
    double[][] toArrayUnsafeResult =
        PenaltyMatrixGenerator.getPenaltyMatrix(
                new double[][] {
                  new double[] {2.0d, 10.0d, 2.0d, 10.0d}, new double[] {2.0d, 10.0d, 2.0d, 10.0d}
                },
                0,
                1)
            .toArrayUnsafe();
    assertEquals(Short.SIZE, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          1.0d
        },
        toArrayUnsafeResult[15],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d,
          0.0d
        },
        toArrayUnsafeResult[14],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[13],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[12],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[11],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[10],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[9],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[8],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[7],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[6],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[5],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[4],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[3],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {
          1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[][], int, int)} with {@code x},
   * {@code k}, {@code index}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return array length is {@link Short#SIZE}.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[][], int, int)}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(double[][], int, int) with 'x', 'k', 'index'; when zero; then return array length is SIZE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(double[][], int, int)"})
  void testGetPenaltyMatrixWithXKIndex_whenZero_thenReturnArrayLengthIsSize2() {
    // Arrange, Act and Assert
    double[][] toArrayUnsafeResult =
        PenaltyMatrixGenerator.getPenaltyMatrix(
                new double[][] {
                  new double[] {2.0d, 10.0d, 2.0d, 10.0d}, new double[] {2.0d, 10.0d, 2.0d, 10.0d}
                },
                0,
                0)
            .toArrayUnsafe();
    assertEquals(Short.SIZE, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          1.0d
        },
        toArrayUnsafeResult[15],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d,
          0.0d
        },
        toArrayUnsafeResult[14],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[13],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[12],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[11],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[10],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[9],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[8],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[7],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[6],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[5],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[4],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[3],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {
          1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d
        },
        toArrayUnsafeResult[0],
        0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[][], int, int)} with {@code x},
   * {@code k}, {@code index}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return size is {@code 4096}.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[][], int, int)}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(double[][], int, int) with 'x', 'k', 'index'; when zero; then return size is '4096'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(double[][], int, int)"})
  void testGetPenaltyMatrixWithXKIndex_whenZero_thenReturnSizeIs4096() {
    // Arrange and Act
    DoubleMatrix actualPenaltyMatrix =
        PenaltyMatrixGenerator.getPenaltyMatrix(
            new double[][] {
              new double[] {2.0d, 10.0d, 2.0d, 10.0d},
              new double[] {2.0d, 10.0d, 2.0d, 10.0d},
              new double[] {2.0d, 10.0d, 2.0d, 10.0d}
            },
            0,
            1);

    // Assert
    assertEquals(4096, actualPenaltyMatrix.size());
    assertEquals(64.0d, actualPenaltyMatrix.total());
    assertEquals(Double.SIZE, actualPenaltyMatrix.toArrayUnsafe().length);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[], int)} with {@code x}, {@code k}.
   *
   * <ul>
   *   <li>Then return total is {@code 5.6843418860808015E-14}.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[], int)}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(double[], int) with 'x', 'k'; then return total is '5.6843418860808015E-14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(double[], int)"})
  void testGetPenaltyMatrixWithXK_thenReturnTotalIs56843418860808015e14() {
    // Arrange and Act
    DoubleMatrix actualPenaltyMatrix =
        PenaltyMatrixGenerator.getPenaltyMatrix(new double[] {-8.0d, 1.0d, 2.0d, 10.0d}, 1);

    // Assert
    double[][] toArrayUnsafeResult = actualPenaltyMatrix.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertEquals(5.6843418860808015E-14d, actualPenaltyMatrix.total());
    assertArrayEquals(
        new double[] {-3.24d, -511.2d, 510.5025d, 3.9375d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {0.04000000000000001d, 3.2d, -3.24d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, -4.0d, 3.9375d, 0.0625d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(new double[] {3.2d, 512.0d, -511.2d, -4.0d}, toArrayUnsafeResult[1], 0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[], int)} with {@code x}, {@code k}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[], int)}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(double[], int) with 'x', 'k'; when three; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(double[], int)"})
  void testGetPenaltyMatrixWithXK_whenThree_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> PenaltyMatrixGenerator.getPenaltyMatrix(new double[] {2.0d, 10.0d, 2.0d, 10.0d}, 3));
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[], int)} with {@code x}, {@code k}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return total is {@code 3.637978807091713E-12}.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[], int)}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(double[], int) with 'x', 'k'; when two; then return total is '3.637978807091713E-12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(double[], int)"})
  void testGetPenaltyMatrixWithXK_whenTwo_thenReturnTotalIs3637978807091713e12() {
    // Arrange and Act
    DoubleMatrix actualPenaltyMatrix =
        PenaltyMatrixGenerator.getPenaltyMatrix(new double[] {-8.0d, 1.0d, 2.0d, 10.0d}, 2);

    // Assert
    assertEquals(3.637978807091713E-12d, actualPenaltyMatrix.total());
    double[][] toArrayUnsafeResult = actualPenaltyMatrix.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-518.4d, 10368.0d, -10497.599999999999d, 648.0d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(new double[] {0.0d, 648.0d, -729.0d, 81.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(
        new double[] {466.56d, -10497.599999999999d, 10760.04d, -729.0d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {51.84d, -518.4d, 466.56d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[], int)} with {@code x}, {@code k}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return total is four.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getPenaltyMatrix(double[], int)}
   */
  @Test
  @DisplayName(
      "Test getPenaltyMatrix(double[], int) with 'x', 'k'; when zero; then return total is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix PenaltyMatrixGenerator.getPenaltyMatrix(double[], int)"})
  void testGetPenaltyMatrixWithXK_whenZero_thenReturnTotalIsFour() {
    // Arrange and Act
    DoubleMatrix actualPenaltyMatrix =
        PenaltyMatrixGenerator.getPenaltyMatrix(new double[] {2.0d, 10.0d, 2.0d, 10.0d}, 0);

    // Assert
    double[][] toArrayUnsafeResult = actualPenaltyMatrix.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertEquals(4.0d, actualPenaltyMatrix.total());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 1.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 1.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int, boolean)}.
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int,
   * boolean)}
   */
  @Test
  @DisplayName("Test getDerivativeMatrix(double[], int, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getDerivativeMatrix(double[], int, boolean)"
  })
  void testGetDerivativeMatrix() {
    // Arrange, Act and Assert
    double[][] toArrayUnsafeResult =
        PenaltyMatrixGenerator.getDerivativeMatrix(new double[] {-8.0d, 1.0d, 2.0d, 10.0d}, 2, true)
            .toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {0.022222222222222223d, -0.22222222222222224d, 0.2d, 0.0d},
        toArrayUnsafeResult[0],
        0.0);
    assertArrayEquals(
        new double[] {0.022222222222222223d, -0.22222222222222224d, 0.2d, 0.0d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.2222222222222222d, -0.25d, 0.027777777777777776d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.2222222222222222d, -0.25d, 0.027777777777777776d},
        toArrayUnsafeResult[3],
        0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int, boolean)}.
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int,
   * boolean)}
   */
  @Test
  @DisplayName("Test getDerivativeMatrix(double[], int, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getDerivativeMatrix(double[], int, boolean)"
  })
  void testGetDerivativeMatrix2() {
    // Arrange, Act and Assert
    double[][] toArrayUnsafeResult =
        PenaltyMatrixGenerator.getDerivativeMatrix(
                new double[] {-8.0d, 1.0d, 2.0d, 10.0d}, 2, false)
            .toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {0.022222222222222223d, -0.22222222222222224d, 0.2d, 0.0d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.2222222222222222d, -0.25d, 0.027777777777777776d},
        toArrayUnsafeResult[2],
        0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int, boolean)}.
   *
   * <ul>
   *   <li>Then return total is {@code -5.551115123125783E-17}.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test getDerivativeMatrix(double[], int, boolean); then return total is '-5.551115123125783E-17'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getDerivativeMatrix(double[], int, boolean)"
  })
  void testGetDerivativeMatrix_thenReturnTotalIs5551115123125783e17() {
    // Arrange and Act
    DoubleMatrix actualDerivativeMatrix =
        PenaltyMatrixGenerator.getDerivativeMatrix(
            new double[] {-8.0d, 1.0d, 2.0d, 10.0d}, 1, true);

    // Assert
    assertEquals(-5.551115123125783E-17d, actualDerivativeMatrix.total());
    double[][] toArrayUnsafeResult = actualDerivativeMatrix.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {-0.011111111111111112d, -0.888888888888889d, 0.9d, 0.0d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {-0.2111111111111111d, 1.1111111111111112d, -0.9d, 0.0d},
        toArrayUnsafeResult[0],
        0.0);
    assertArrayEquals(
        new double[] {0.0d, -0.8888888888888888d, 0.875d, 0.013888888888888888d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.8888888888888888d, -1.125d, 0.2361111111111111d},
        toArrayUnsafeResult[3],
        0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return total is {@code 4.85722573273506E-17}.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test getDerivativeMatrix(double[], int, boolean); when 'false'; then return total is '4.85722573273506E-17'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getDerivativeMatrix(double[], int, boolean)"
  })
  void testGetDerivativeMatrix_whenFalse_thenReturnTotalIs485722573273506e17() {
    // Arrange and Act
    DoubleMatrix actualDerivativeMatrix =
        PenaltyMatrixGenerator.getDerivativeMatrix(
            new double[] {-8.0d, 1.0d, 2.0d, 10.0d}, 1, false);

    // Assert
    double[][] toArrayUnsafeResult = actualDerivativeMatrix.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertEquals(4.85722573273506E-17d, actualDerivativeMatrix.total());
    assertArrayEquals(
        new double[] {-0.011111111111111112d, -0.888888888888889d, 0.9d, 0.0d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {0.0d, -0.8888888888888888d, 0.875d, 0.013888888888888888d},
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int, boolean)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test getDerivativeMatrix(double[], int, boolean); when three; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getDerivativeMatrix(double[], int, boolean)"
  })
  void testGetDerivativeMatrix_whenThree_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            PenaltyMatrixGenerator.getDerivativeMatrix(
                new double[] {2.0d, 10.0d, 2.0d, 10.0d}, 3, true));
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return total is four.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getDerivativeMatrix(double[], int,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test getDerivativeMatrix(double[], int, boolean); when zero; then return total is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getDerivativeMatrix(double[], int, boolean)"
  })
  void testGetDerivativeMatrix_whenZero_thenReturnTotalIsFour() {
    // Arrange and Act
    DoubleMatrix actualDerivativeMatrix =
        PenaltyMatrixGenerator.getDerivativeMatrix(
            new double[] {2.0d, 10.0d, 2.0d, 10.0d}, 0, true);

    // Assert
    double[][] toArrayUnsafeResult = actualDerivativeMatrix.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertEquals(4.0d, actualDerivativeMatrix.total());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 1.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 1.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 1.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {1.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#flattenMatrix(DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleMatrix}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#flattenMatrix(DoubleMatrix)}
   */
  @Test
  @DisplayName("Test flattenMatrix(DoubleMatrix); when DoubleMatrix; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray PenaltyMatrixGenerator.flattenMatrix(DoubleMatrix)"})
  void testFlattenMatrix_whenDoubleMatrix_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleArray actualFlattenMatrixResult = PenaltyMatrixGenerator.flattenMatrix(DoubleMatrix.of());

    // Assert
    assertEquals(0, actualFlattenMatrixResult.size());
    assertEquals(0.0d, actualFlattenMatrixResult.sum());
    assertTrue(actualFlattenMatrixResult.isEmpty());
    assertTrue(actualFlattenMatrixResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualFlattenMatrixResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#flattenMatrix(DoubleMatrix)}.
   *
   * <ul>
   *   <li>When identity three.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#flattenMatrix(DoubleMatrix)}
   */
  @Test
  @DisplayName("Test flattenMatrix(DoubleMatrix); when identity three; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray PenaltyMatrixGenerator.flattenMatrix(DoubleMatrix)"})
  void testFlattenMatrix_whenIdentityThree_thenReturnMinIsZero() {
    // Arrange and Act
    DoubleArray actualFlattenMatrixResult =
        PenaltyMatrixGenerator.flattenMatrix(DoubleMatrix.identity(3));

    // Assert
    assertEquals(0.0d, actualFlattenMatrixResult.min());
    List<Double> toListResult = actualFlattenMatrixResult.toList();
    assertEquals(9, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(0.0d, toListResult.get(6).doubleValue());
    assertEquals(0.0d, toListResult.get(7).doubleValue());
    assertEquals(1.0d, actualFlattenMatrixResult.max());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(1.0d, toListResult.get(8).doubleValue());
    assertEquals(3.0d, actualFlattenMatrixResult.sum());
    assertEquals(9, actualFlattenMatrixResult.size());
    assertFalse(actualFlattenMatrixResult.isEmpty());
    assertArrayEquals(
        new double[] {1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d},
        actualFlattenMatrixResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getMatrixForFlattened(int[], DoubleMatrix, int)}.
   *
   * <ul>
   *   <li>When array of {@code int} with one and zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getMatrixForFlattened(int[], DoubleMatrix,
   * int)}
   */
  @Test
  @DisplayName(
      "Test getMatrixForFlattened(int[], DoubleMatrix, int); when array of int with one and zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getMatrixForFlattened(int[], DoubleMatrix, int)"
  })
  void testGetMatrixForFlattened_whenArrayOfIntWithOneAndZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualMatrixForFlattened =
        PenaltyMatrixGenerator.getMatrixForFlattened(new int[] {1, 0, 10, 1}, DoubleMatrix.of(), 1);

    // Assert
    assertEquals(0, actualMatrixForFlattened.size());
    assertEquals(0, actualMatrixForFlattened.toArrayUnsafe().length);
    assertEquals(0.0d, actualMatrixForFlattened.total());
    assertEquals(2, actualMatrixForFlattened.dimensions());
    assertTrue(actualMatrixForFlattened.isEmpty());
    assertTrue(actualMatrixForFlattened.isSquare());
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getMatrixForFlattened(int[], DoubleMatrix, int)}.
   *
   * <ul>
   *   <li>When array of {@code int} with ten and zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getMatrixForFlattened(int[], DoubleMatrix,
   * int)}
   */
  @Test
  @DisplayName(
      "Test getMatrixForFlattened(int[], DoubleMatrix, int); when array of int with ten and zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getMatrixForFlattened(int[], DoubleMatrix, int)"
  })
  void testGetMatrixForFlattened_whenArrayOfIntWithTenAndZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualMatrixForFlattened =
        PenaltyMatrixGenerator.getMatrixForFlattened(
            new int[] {10, 0, 10, 1}, DoubleMatrix.of(), 1);

    // Assert
    assertEquals(0, actualMatrixForFlattened.size());
    assertEquals(0, actualMatrixForFlattened.toArrayUnsafe().length);
    assertEquals(0.0d, actualMatrixForFlattened.total());
    assertEquals(2, actualMatrixForFlattened.dimensions());
    assertTrue(actualMatrixForFlattened.isEmpty());
    assertTrue(actualMatrixForFlattened.isSquare());
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getMatrixForFlattened(int[], DoubleMatrix, int)}.
   *
   * <ul>
   *   <li>When array of {@code int} with ten and zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getMatrixForFlattened(int[], DoubleMatrix,
   * int)}
   */
  @Test
  @DisplayName(
      "Test getMatrixForFlattened(int[], DoubleMatrix, int); when array of int with ten and zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getMatrixForFlattened(int[], DoubleMatrix, int)"
  })
  void testGetMatrixForFlattened_whenArrayOfIntWithTenAndZero_thenReturnSizeIsZero2() {
    // Arrange and Act
    DoubleMatrix actualMatrixForFlattened =
        PenaltyMatrixGenerator.getMatrixForFlattened(new int[] {10, 0, 1, 1}, DoubleMatrix.of(), 1);

    // Assert
    assertEquals(0, actualMatrixForFlattened.size());
    assertEquals(0, actualMatrixForFlattened.toArrayUnsafe().length);
    assertEquals(0.0d, actualMatrixForFlattened.total());
    assertEquals(2, actualMatrixForFlattened.dimensions());
    assertTrue(actualMatrixForFlattened.isEmpty());
    assertTrue(actualMatrixForFlattened.isSquare());
  }

  /**
   * Test {@link PenaltyMatrixGenerator#getMatrixForFlattened(int[], DoubleMatrix, int)}.
   *
   * <ul>
   *   <li>When array of {@code int} with zero and zero.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link PenaltyMatrixGenerator#getMatrixForFlattened(int[], DoubleMatrix,
   * int)}
   */
  @Test
  @DisplayName(
      "Test getMatrixForFlattened(int[], DoubleMatrix, int); when array of int with zero and zero; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PenaltyMatrixGenerator.getMatrixForFlattened(int[], DoubleMatrix, int)"
  })
  void testGetMatrixForFlattened_whenArrayOfIntWithZeroAndZero_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualMatrixForFlattened =
        PenaltyMatrixGenerator.getMatrixForFlattened(new int[] {0, 0, 10, 1}, DoubleMatrix.of(), 1);

    // Assert
    assertEquals(0, actualMatrixForFlattened.size());
    assertEquals(0, actualMatrixForFlattened.toArrayUnsafe().length);
    assertEquals(0.0d, actualMatrixForFlattened.total());
    assertEquals(2, actualMatrixForFlattened.dimensions());
    assertTrue(actualMatrixForFlattened.isEmpty());
    assertTrue(actualMatrixForFlattened.isSquare());
  }
}
