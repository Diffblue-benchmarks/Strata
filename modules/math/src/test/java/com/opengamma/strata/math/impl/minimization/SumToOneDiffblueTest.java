package com.opengamma.strata.math.impl.minimization;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SumToOneDiffblueTest {
  /**
   * Test {@link SumToOne#transform(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>Given {@link SumToOne#SumToOne(int)} with n is four.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link SumToOne#transform(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test transform(DoubleArray) with 'DoubleArray'; given SumToOne(int) with n is four; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray SumToOne.transform(DoubleArray)"})
  void testTransformWithDoubleArray_givenSumToOneWithNIsFour_thenReturnMinIsZero() {
    // Arrange
    SumToOne sumToOne = new SumToOne(4);

    // Act
    DoubleArray actualTransformResult = sumToOne.transform(DoubleArray.filled(3));

    // Assert
    assertEquals(0.0d, actualTransformResult.min());
    List<Double> toListResult = actualTransformResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1.0d, actualTransformResult.max());
    assertEquals(1.0d, toListResult.get(3).doubleValue());
    assertEquals(4, actualTransformResult.size());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 1.0d}, actualTransformResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SumToOne#transform(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>Then return min is {@code 0.295958969093304}.
   * </ul>
   *
   * <p>Method under test: {@link SumToOne#transform(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test transform(DoubleArray) with 'DoubleArray'; then return min is '0.295958969093304'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray SumToOne.transform(DoubleArray)"})
  void testTransformWithDoubleArray_thenReturnMinIs0295958969093304() {
    // Arrange
    SumToOne sumToOne = new SumToOne(2);

    // Act
    DoubleArray actualTransformResult = sumToOne.transform(DoubleArray.of(10.0d));

    // Assert
    assertEquals(0.295958969093304d, actualTransformResult.min());
    List<Double> toListResult = actualTransformResult.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.295958969093304d, toListResult.get(0).doubleValue());
    assertEquals(0.704041030906696d, actualTransformResult.max());
    assertEquals(0.704041030906696d, toListResult.get(1).doubleValue());
    assertEquals(2, actualTransformResult.size());
    assertArrayEquals(
        new double[] {0.295958969093304d, 0.704041030906696d},
        actualTransformResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SumToOne#jacobian(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>Given {@link SumToOne#SumToOne(int)} with n is four.
   *   <li>Then return size is twelve.
   * </ul>
   *
   * <p>Method under test: {@link SumToOne#jacobian(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test jacobian(DoubleArray) with 'DoubleArray'; given SumToOne(int) with n is four; then return size is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix SumToOne.jacobian(DoubleArray)"})
  void testJacobianWithDoubleArray_givenSumToOneWithNIsFour_thenReturnSizeIsTwelve() {
    // Arrange
    SumToOne sumToOne = new SumToOne(4);

    // Act
    DoubleMatrix actualJacobianResult = sumToOne.jacobian(DoubleArray.filled(3));

    // Assert
    assertEquals(12, actualJacobianResult.size());
    double[][] toArrayUnsafeResult = actualJacobianResult.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.0d, 0.0d, -0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link SumToOne#jacobian(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>Then return total is {@code 1.1102230246251565E-16}.
   * </ul>
   *
   * <p>Method under test: {@link SumToOne#jacobian(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test jacobian(DoubleArray) with 'DoubleArray'; then return total is '1.1102230246251565E-16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix SumToOne.jacobian(DoubleArray)"})
  void testJacobianWithDoubleArray_thenReturnTotalIs11102230246251565e16() {
    // Arrange
    SumToOne sumToOne = new SumToOne(2);

    // Act
    DoubleMatrix actualJacobianResult = sumToOne.jacobian(DoubleArray.of(10.0d));

    // Assert
    assertEquals(1.1102230246251565E-16d, actualJacobianResult.total());
    assertEquals(2, actualJacobianResult.size());
    double[][] toArrayUnsafeResult = actualJacobianResult.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.9129452507276276d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.9129452507276277d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link SumToOne#jacobian(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is zero.
   *   <li>Then return total is zero.
   * </ul>
   *
   * <p>Method under test: {@link SumToOne#jacobian(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test jacobian(DoubleArray) with 'DoubleArray'; when DoubleArray with value is zero; then return total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix SumToOne.jacobian(DoubleArray)"})
  void testJacobianWithDoubleArray_whenDoubleArrayWithValueIsZero_thenReturnTotalIsZero() {
    // Arrange
    SumToOne sumToOne = new SumToOne(2);

    // Act
    DoubleMatrix actualJacobianResult = sumToOne.jacobian(DoubleArray.of(0.0d));

    // Assert
    assertEquals(0.0d, actualJacobianResult.total());
    assertEquals(2, actualJacobianResult.size());
    double[][] toArrayUnsafeResult = actualJacobianResult.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link SumToOne#getSet(int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return array length is two.
   * </ul>
   *
   * <p>Method under test: {@link SumToOne#getSet(int)}
   */
  @Test
  @DisplayName("Test getSet(int); when two; then return array length is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int[][] SumToOne.getSet(int)"})
  void testGetSet_whenTwo_thenReturnArrayLengthIsTwo() {
    // Arrange and Act
    int[][] actualSet = SumToOne.getSet(2);

    // Assert
    assertEquals(2, actualSet.length);
    assertArrayEquals(new int[] {-1}, actualSet[1]);
    assertArrayEquals(new int[] {1}, actualSet[0]);
  }
}
