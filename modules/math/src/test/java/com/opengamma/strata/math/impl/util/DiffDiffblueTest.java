package com.opengamma.strata.math.impl.util;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiffDiffblueTest {
  /**
   * Test {@link Diff#values(double[], int)} with {@code double[]}, {@code int}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with nineteen and minus nineteen.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(double[], int)}
   */
  @Test
  @DisplayName(
      "Test values(double[], int) with 'double[]', 'int'; then return array of double with nineteen and minus nineteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] Diff.values(double[], int)"})
  void testValuesWithDoubleInt_thenReturnArrayOfDoubleWithNineteenAndMinusNineteen() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {19.0d, -19.0d}, Diff.values(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, 2), 0.0);
  }

  /**
   * Test {@link Diff#values(double[], int)} with {@code double[]}, {@code int}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return array of {@code double} with {@code -9.5} and {@code 9.5}.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(double[], int)}
   */
  @Test
  @DisplayName(
      "Test values(double[], int) with 'double[]', 'int'; when one; then return array of double with '-9.5' and '9.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] Diff.values(double[], int)"})
  void testValuesWithDoubleInt_whenOne_thenReturnArrayOfDoubleWith95And95() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {-9.5d, 9.5d, -9.5d},
        Diff.values(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, 1),
        0.0);
  }

  /**
   * Test {@link Diff#values(double[], int)} with {@code double[]}, {@code int}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return array of {@code double} with ten and {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(double[], int)}
   */
  @Test
  @DisplayName(
      "Test values(double[], int) with 'double[]', 'int'; when zero; then return array of double with ten and '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] Diff.values(double[], int)"})
  void testValuesWithDoubleInt_whenZero_thenReturnArrayOfDoubleWithTenAnd05() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        Diff.values(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, 0),
        0.0);
  }

  /**
   * Test {@link Diff#values(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with {@code -9.5} and {@code 9.5}.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(double[])}
   */
  @Test
  @DisplayName(
      "Test values(double[]) with 'double[]'; then return array of double with '-9.5' and '9.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] Diff.values(double[])"})
  void testValuesWithDouble_thenReturnArrayOfDoubleWith95And95() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {-9.5d, 9.5d, -9.5d},
        Diff.values(new double[] {10.0d, 0.5d, 10.0d, 0.5d}),
        0.0);
  }

  /**
   * Test {@link Diff#values(float[], int)} with {@code float[]}, {@code int}.
   *
   * <ul>
   *   <li>Then return array of {@code float} with nineteen and minus nineteen.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(float[], int)}
   */
  @Test
  @DisplayName(
      "Test values(float[], int) with 'float[]', 'int'; then return array of float with nineteen and minus nineteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float[] Diff.values(float[], int)"})
  void testValuesWithFloatInt_thenReturnArrayOfFloatWithNineteenAndMinusNineteen() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new float[] {19.0f, -19.0f}, Diff.values(new float[] {10.0f, 0.5f, 10.0f, 0.5f}, 2), 0.0f);
  }

  /**
   * Test {@link Diff#values(float[], int)} with {@code float[]}, {@code int}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return array of {@code float} with {@code -9.5} and {@code 9.5}.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(float[], int)}
   */
  @Test
  @DisplayName(
      "Test values(float[], int) with 'float[]', 'int'; when one; then return array of float with '-9.5' and '9.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float[] Diff.values(float[], int)"})
  void testValuesWithFloatInt_whenOne_thenReturnArrayOfFloatWith95And95() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new float[] {-9.5f, 9.5f, -9.5f},
        Diff.values(new float[] {10.0f, 0.5f, 10.0f, 0.5f}, 1),
        0.0f);
  }

  /**
   * Test {@link Diff#values(float[], int)} with {@code float[]}, {@code int}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return array of {@code float} with ten and {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(float[], int)}
   */
  @Test
  @DisplayName(
      "Test values(float[], int) with 'float[]', 'int'; when zero; then return array of float with ten and '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float[] Diff.values(float[], int)"})
  void testValuesWithFloatInt_whenZero_thenReturnArrayOfFloatWithTenAnd05() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new float[] {10.0f, 0.5f, 10.0f, 0.5f},
        Diff.values(new float[] {10.0f, 0.5f, 10.0f, 0.5f}, 0),
        0.0f);
  }

  /**
   * Test {@link Diff#values(float[])} with {@code float[]}.
   *
   * <ul>
   *   <li>Then return array of {@code float} with {@code -9.5} and {@code 9.5}.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(float[])}
   */
  @Test
  @DisplayName(
      "Test values(float[]) with 'float[]'; then return array of float with '-9.5' and '9.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"float[] Diff.values(float[])"})
  void testValuesWithFloat_thenReturnArrayOfFloatWith95And95() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new float[] {-9.5f, 9.5f, -9.5f},
        Diff.values(new float[] {10.0f, 0.5f, 10.0f, 0.5f}),
        0.0f);
  }

  /**
   * Test {@link Diff#values(int[], int)} with {@code int[]}, {@code int}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return array of {@code int} with minus two and two.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(int[], int)}
   */
  @Test
  @DisplayName(
      "Test values(int[], int) with 'int[]', 'int'; when one; then return array of int with minus two and two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] Diff.values(int[], int)"})
  void testValuesWithIntInt_whenOne_thenReturnArrayOfIntWithMinusTwoAndTwo() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[] {-2, 2, -2}, Diff.values(new int[] {1, -1, 1, -1}, 1));
  }

  /**
   * Test {@link Diff#values(int[], int)} with {@code int[]}, {@code int}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return array of {@code int} with four and minus four.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(int[], int)}
   */
  @Test
  @DisplayName(
      "Test values(int[], int) with 'int[]', 'int'; when two; then return array of int with four and minus four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] Diff.values(int[], int)"})
  void testValuesWithIntInt_whenTwo_thenReturnArrayOfIntWithFourAndMinusFour() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[] {4, -4}, Diff.values(new int[] {1, -1, 1, -1}, 2));
  }

  /**
   * Test {@link Diff#values(int[], int)} with {@code int[]}, {@code int}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return array of {@code int} with one and minus one.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(int[], int)}
   */
  @Test
  @DisplayName(
      "Test values(int[], int) with 'int[]', 'int'; when zero; then return array of int with one and minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] Diff.values(int[], int)"})
  void testValuesWithIntInt_whenZero_thenReturnArrayOfIntWithOneAndMinusOne() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[] {1, -1, 1, -1}, Diff.values(new int[] {1, -1, 1, -1}, 0));
  }

  /**
   * Test {@link Diff#values(int[])} with {@code int[]}.
   *
   * <ul>
   *   <li>Then return array of {@code int} with minus two and two.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(int[])}
   */
  @Test
  @DisplayName("Test values(int[]) with 'int[]'; then return array of int with minus two and two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[] Diff.values(int[])"})
  void testValuesWithInt_thenReturnArrayOfIntWithMinusTwoAndTwo() {
    // Arrange, Act and Assert
    assertArrayEquals(new int[] {-2, 2, -2}, Diff.values(new int[] {1, -1, 1, -1}));
  }

  /**
   * Test {@link Diff#values(long[], int)} with {@code long[]}, {@code int}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return array of {@code long} with minus two and two.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(long[], int)}
   */
  @Test
  @DisplayName(
      "Test values(long[], int) with 'long[]', 'int'; when one; then return array of long with minus two and two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] Diff.values(long[], int)"})
  void testValuesWithLongInt_whenOne_thenReturnArrayOfLongWithMinusTwoAndTwo() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[] {-2L, 2L, -2L}, Diff.values(new long[] {1L, -1L, 1L, -1L}, 1));
  }

  /**
   * Test {@link Diff#values(long[], int)} with {@code long[]}, {@code int}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return array of {@code long} with four and minus four.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(long[], int)}
   */
  @Test
  @DisplayName(
      "Test values(long[], int) with 'long[]', 'int'; when two; then return array of long with four and minus four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] Diff.values(long[], int)"})
  void testValuesWithLongInt_whenTwo_thenReturnArrayOfLongWithFourAndMinusFour() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[] {4L, -4L}, Diff.values(new long[] {1L, -1L, 1L, -1L}, 2));
  }

  /**
   * Test {@link Diff#values(long[], int)} with {@code long[]}, {@code int}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return array of {@code long} with one and minus one.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(long[], int)}
   */
  @Test
  @DisplayName(
      "Test values(long[], int) with 'long[]', 'int'; when zero; then return array of long with one and minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] Diff.values(long[], int)"})
  void testValuesWithLongInt_whenZero_thenReturnArrayOfLongWithOneAndMinusOne() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[] {1L, -1L, 1L, -1L}, Diff.values(new long[] {1L, -1L, 1L, -1L}, 0));
  }

  /**
   * Test {@link Diff#values(long[])} with {@code long[]}.
   *
   * <ul>
   *   <li>Then return array of {@code long} with minus two and two.
   * </ul>
   *
   * <p>Method under test: {@link Diff#values(long[])}
   */
  @Test
  @DisplayName(
      "Test values(long[]) with 'long[]'; then return array of long with minus two and two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long[] Diff.values(long[])"})
  void testValuesWithLong_thenReturnArrayOfLongWithMinusTwoAndTwo() {
    // Arrange, Act and Assert
    assertArrayEquals(new long[] {-2L, 2L, -2L}, Diff.values(new long[] {1L, -1L, 1L, -1L}));
  }
}
