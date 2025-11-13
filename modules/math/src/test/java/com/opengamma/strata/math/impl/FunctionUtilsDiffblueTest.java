package com.opengamma.strata.math.impl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FunctionUtilsDiffblueTest {
  /**
   * Test {@link FunctionUtils#square(double)}.
   *
   * <p>Method under test: {@link FunctionUtils#square(double)}
   */
  @Test
  @DisplayName("Test square(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FunctionUtils.square(double)"})
  void testSquare() {
    // Arrange, Act and Assert
    assertEquals(4.0d, FunctionUtils.square(2.0d));
  }

  /**
   * Test {@link FunctionUtils#cube(double)}.
   *
   * <p>Method under test: {@link FunctionUtils#cube(double)}
   */
  @Test
  @DisplayName("Test cube(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double FunctionUtils.cube(double)"})
  void testCube() {
    // Arrange, Act and Assert
    assertEquals(8.0d, FunctionUtils.cube(2.0d));
  }

  /**
   * Test {@link FunctionUtils#toTensorIndex(int[], int[])}.
   *
   * <ul>
   *   <li>When array of {@code int} with four and one.
   *   <li>Then return five.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#toTensorIndex(int[], int[])}
   */
  @Test
  @DisplayName(
      "Test toTensorIndex(int[], int[]); when array of int with four and one; then return five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FunctionUtils.toTensorIndex(int[], int[])"})
  void testToTensorIndex_whenArrayOfIntWithFourAndOne_thenReturnFive() {
    // Arrange and Act
    int actualToTensorIndexResult =
        FunctionUtils.toTensorIndex(new int[] {1, 0, 1, 0}, new int[] {4, 1, 4, 1});

    // Assert
    assertEquals(5, actualToTensorIndexResult);
  }

  /**
   * Test {@link FunctionUtils#toTensorIndex(int[], int[])}.
   *
   * <ul>
   *   <li>When empty array of {@code int}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#toTensorIndex(int[], int[])}
   */
  @Test
  @DisplayName("Test toTensorIndex(int[], int[]); when empty array of int; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FunctionUtils.toTensorIndex(int[], int[])"})
  void testToTensorIndex_whenEmptyArrayOfInt_thenReturnZero() {
    // Arrange and Act
    int actualToTensorIndexResult = FunctionUtils.toTensorIndex(new int[] {}, new int[] {});

    // Assert
    assertEquals(0, actualToTensorIndexResult);
  }

  /**
   * Test {@link FunctionUtils#fromTensorIndex(int, int[])}.
   *
   * <ul>
   *   <li>Then return array of {@code int} with zero and one.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#fromTensorIndex(int, int[])}
   */
  @Test
  @DisplayName("Test fromTensorIndex(int, int[]); then return array of int with zero and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] FunctionUtils.fromTensorIndex(int, int[])"})
  void testFromTensorIndex_thenReturnArrayOfIntWithZeroAndOne() {
    // Arrange and Act
    int[] actualFromTensorIndexResult =
        FunctionUtils.fromTensorIndex(1, new int[] {1, 3, 1, 3, 1, 3, 1, 3});

    // Assert
    assertArrayEquals(new int[] {0, 1, 0, 0, 0, 0, 0, 0}, actualFromTensorIndexResult);
  }

  /**
   * Test {@link FunctionUtils#unique(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with {@code -0.0} and {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#unique(double[])}
   */
  @Test
  @DisplayName(
      "Test unique(double[]) with 'double[]'; then return array of double with '-0.0' and '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] FunctionUtils.unique(double[])"})
  void testUniqueWithDouble_thenReturnArrayOfDoubleWith00And05() {
    // Arrange
    double[] in = new double[] {0.5d, 1.0d, 10.0d, -0.0d};

    // Act and Assert
    assertArrayEquals(new double[] {-0.0d, 0.5d, 1.0d, 10.0d}, FunctionUtils.unique(in), 0.0);
    assertArrayEquals(new double[] {-0.0d, 0.5d, 1.0d, 10.0d}, in, 0.0);
  }

  /**
   * Test {@link FunctionUtils#unique(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with {@code -0.0} and ten.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#unique(double[])}
   */
  @Test
  @DisplayName(
      "Test unique(double[]) with 'double[]'; then return array of double with '-0.0' and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] FunctionUtils.unique(double[])"})
  void testUniqueWithDouble_thenReturnArrayOfDoubleWith00AndTen() {
    // Arrange
    double[] in = new double[] {10.0d, -0.0d, 10.0d, -0.0d};

    // Act and Assert
    assertArrayEquals(new double[] {-0.0d, 10.0d}, FunctionUtils.unique(in), 0.0);
    assertArrayEquals(new double[] {-0.0d, -0.0d, 10.0d, 10.0d}, in, 0.0);
  }

  /**
   * Test {@link FunctionUtils#unique(int[])} with {@code int[]}.
   *
   * <ul>
   *   <li>Then return array of {@code int} with minus one and zero.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#unique(int[])}
   */
  @Test
  @DisplayName("Test unique(int[]) with 'int[]'; then return array of int with minus one and zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] FunctionUtils.unique(int[])"})
  void testUniqueWithInt_thenReturnArrayOfIntWithMinusOneAndZero() {
    // Arrange
    int[] in = new int[] {4, -1, 1, 0};

    // Act and Assert
    assertArrayEquals(new int[] {-1, 0, 1, 4}, FunctionUtils.unique(in));
    assertArrayEquals(new int[] {-1, 0, 1, 4}, in);
  }

  /**
   * Test {@link FunctionUtils#unique(int[])} with {@code int[]}.
   *
   * <ul>
   *   <li>Then return array of {@code int} with zero and zero.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#unique(int[])}
   */
  @Test
  @DisplayName("Test unique(int[]) with 'int[]'; then return array of int with zero and zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] FunctionUtils.unique(int[])"})
  void testUniqueWithInt_thenReturnArrayOfIntWithZeroAndZero() {
    // Arrange
    int[] in = new int[] {1, 0, 1, 0};

    // Act and Assert
    assertArrayEquals(new int[] {0, 0}, FunctionUtils.unique(in));
    assertArrayEquals(new int[] {0, 0, 1, 1}, in);
  }

  /**
   * Test {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}.
   *
   * <ul>
   *   <li>When {@code -0.0}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}
   */
  @Test
  @DisplayName("Test getLowerBoundIndex(DoubleArray, double); when '-0.0'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FunctionUtils.getLowerBoundIndex(DoubleArray, double)"})
  void testGetLowerBoundIndex_when00_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, FunctionUtils.getLowerBoundIndex(DoubleArray.filled(3), -0.0d));
  }

  /**
   * Test {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}
   */
  @Test
  @DisplayName("Test getLowerBoundIndex(DoubleArray, double); when '-0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FunctionUtils.getLowerBoundIndex(DoubleArray, double)"})
  void testGetLowerBoundIndex_when05_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, FunctionUtils.getLowerBoundIndex(DoubleArray.filled(3), -0.5d));
  }

  /**
   * Test {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is {@link Double#NaN}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test getLowerBoundIndex(DoubleArray, double); when DoubleArray with value is NaN; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FunctionUtils.getLowerBoundIndex(DoubleArray, double)"})
  void testGetLowerBoundIndex_whenDoubleArrayWithValueIsNaN_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1, FunctionUtils.getLowerBoundIndex(DoubleArray.of(Double.NaN), -0.0d));
  }

  /**
   * Test {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test getLowerBoundIndex(DoubleArray, double); when DoubleArray with value is ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FunctionUtils.getLowerBoundIndex(DoubleArray, double)"})
  void testGetLowerBoundIndex_whenDoubleArrayWithValueIsTen_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, FunctionUtils.getLowerBoundIndex(DoubleArray.of(10.0d), 10.0d));
  }

  /**
   * Test {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}
   */
  @Test
  @DisplayName("Test getLowerBoundIndex(DoubleArray, double); when filled three; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FunctionUtils.getLowerBoundIndex(DoubleArray, double)"})
  void testGetLowerBoundIndex_whenFilledThree_thenReturnTwo() {
    // Arrange, Act and Assert
    assertEquals(2, FunctionUtils.getLowerBoundIndex(DoubleArray.filled(3), 10.0d));
  }

  /**
   * Test {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link FunctionUtils#getLowerBoundIndex(DoubleArray, double)}
   */
  @Test
  @DisplayName("Test getLowerBoundIndex(DoubleArray, double); when NaN; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int FunctionUtils.getLowerBoundIndex(DoubleArray, double)"})
  void testGetLowerBoundIndex_whenNaN_thenReturnTwo() {
    // Arrange, Act and Assert
    assertEquals(2, FunctionUtils.getLowerBoundIndex(DoubleArray.filled(3), Double.NaN));
  }
}
