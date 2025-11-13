package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DoubleArrayMathDiffblueTest {
  /**
   * Test {@link DoubleArrayMath#toObject(double[])}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and one.
   *   <li>Then return array of {@link Double} with ten and one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#toObject(double[])}
   */
  @Test
  @DisplayName(
      "Test toObject(double[]); when array of double with ten and one; then return array of Double with ten and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] DoubleArrayMath.toObject(double[])"})
  void testToObject_whenArrayOfDoubleWithTenAndOne_thenReturnArrayOfDoubleWithTenAndOne() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new Double[] {10.0d, 1.0d, 10.0d, 1.0d},
        DoubleArrayMath.toObject(new double[] {10.0d, 1.0d, 10.0d, 1.0d}));
  }

  /**
   * Test {@link DoubleArrayMath#toObject(double[])}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#toObject(double[])}
   */
  @Test
  @DisplayName(
      "Test toObject(double[]); when empty array of double; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] DoubleArrayMath.toObject(double[])"})
  void testToObject_whenEmptyArrayOfDouble_thenReturnArrayLengthIsZero() {
    // Arrange, Act and Assert
    assertEquals(0, DoubleArrayMath.toObject(new double[] {}).length);
  }

  /**
   * Test {@link DoubleArrayMath#toPrimitive(Double[])}.
   *
   * <ul>
   *   <li>When array of {@link Double} with ten.
   *   <li>Then return array of {@code double} with ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#toPrimitive(Double[])}
   */
  @Test
  @DisplayName(
      "Test toPrimitive(Double[]); when array of Double with ten; then return array of double with ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.toPrimitive(Double[])"})
  void testToPrimitive_whenArrayOfDoubleWithTen_thenReturnArrayOfDoubleWithTen() {
    // Arrange, Act and Assert
    assertArrayEquals(new double[] {10.0d}, DoubleArrayMath.toPrimitive(new Double[] {10.0d}), 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#toPrimitive(Double[])}.
   *
   * <ul>
   *   <li>When empty array of {@link Double}.
   *   <li>Then return empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#toPrimitive(Double[])}
   */
  @Test
  @DisplayName(
      "Test toPrimitive(Double[]); when empty array of Double; then return empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.toPrimitive(Double[])"})
  void testToPrimitive_whenEmptyArrayOfDouble_thenReturnEmptyArrayOfDouble() {
    // Arrange, Act and Assert
    assertArrayEquals(new double[] {}, DoubleArrayMath.toPrimitive(new Double[] {}), 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#sum(double[])}.
   *
   * <p>Method under test: {@link DoubleArrayMath#sum(double[])}
   */
  @Test
  @DisplayName("Test sum(double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DoubleArrayMath.sum(double[])"})
  void testSum() {
    // Arrange, Act and Assert
    assertEquals(22.0d, DoubleArrayMath.sum(new double[] {10.0d, 1.0d, 10.0d, 1.0d}));
  }

  /**
   * Test {@link DoubleArrayMath#applyAddition(double[], double)}.
   *
   * <p>Method under test: {@link DoubleArrayMath#applyAddition(double[], double)}
   */
  @Test
  @DisplayName("Test applyAddition(double[], double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.applyAddition(double[], double)"})
  void testApplyAddition() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {20.0d, 11.0d, 20.0d, 11.0d},
        DoubleArrayMath.applyAddition(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, 10.0d),
        0.0);
  }

  /**
   * Test {@link DoubleArrayMath#applyMultiplication(double[], double)}.
   *
   * <p>Method under test: {@link DoubleArrayMath#applyMultiplication(double[], double)}
   */
  @Test
  @DisplayName("Test applyMultiplication(double[], double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.applyMultiplication(double[], double)"})
  void testApplyMultiplication() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new double[] {100.0d, 10.0d, 100.0d, 10.0d},
        DoubleArrayMath.applyMultiplication(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, 10.0d),
        0.0);
  }

  /**
   * Test {@link DoubleArrayMath#apply(double[], DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#apply(double[], DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test apply(double[], DoubleUnaryOperator); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.apply(double[], DoubleUnaryOperator)"})
  void testApply_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleUnaryOperator operator = mock(DoubleUnaryOperator.class);
    when(operator.applyAsDouble(anyDouble())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> DoubleArrayMath.apply(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, operator));
    verify(operator).applyAsDouble(10.0d);
  }

  /**
   * Test {@link DoubleArrayMath#apply(double[], DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return array of {@code double} with ten and ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#apply(double[], DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test apply(double[], DoubleUnaryOperator); given ten; then return array of double with ten and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.apply(double[], DoubleUnaryOperator)"})
  void testApply_givenTen_thenReturnArrayOfDoubleWithTenAndTen() {
    // Arrange
    DoubleUnaryOperator operator = mock(DoubleUnaryOperator.class);
    when(operator.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    double[] actualApplyResult =
        DoubleArrayMath.apply(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(anyDouble());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d, 10.0d}, actualApplyResult, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#mutateByAddition(double[], double[])} with {@code array}, {@code
   * arrayToAdd}.
   *
   * <p>Method under test: {@link DoubleArrayMath#mutateByAddition(double[], double[])}
   */
  @Test
  @DisplayName("Test mutateByAddition(double[], double[]) with 'array', 'arrayToAdd'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.mutateByAddition(double[], double[])"})
  void testMutateByAdditionWithArrayArrayToAdd() {
    // Arrange
    double[] array = new double[] {10.0d, 1.0d, 10.0d, 1.0d};

    // Act
    DoubleArrayMath.mutateByAddition(array, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    assertArrayEquals(new double[] {20.0d, 2.0d, 20.0d, 2.0d}, array, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#mutateByAddition(double[], double[])} with {@code array}, {@code
   * arrayToAdd}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#mutateByAddition(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test mutateByAddition(double[], double[]) with 'array', 'arrayToAdd'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.mutateByAddition(double[], double[])"})
  void testMutateByAdditionWithArrayArrayToAdd_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DoubleArrayMath.mutateByAddition(
                new double[] {}, new double[] {10.0d, 1.0d, 10.0d, 1.0d}));
  }

  /**
   * Test {@link DoubleArrayMath#mutateByAddition(double[], double)} with {@code array}, {@code
   * valueToAdd}.
   *
   * <p>Method under test: {@link DoubleArrayMath#mutateByAddition(double[], double)}
   */
  @Test
  @DisplayName("Test mutateByAddition(double[], double) with 'array', 'valueToAdd'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.mutateByAddition(double[], double)"})
  void testMutateByAdditionWithArrayValueToAdd() {
    // Arrange
    double[] array = new double[] {10.0d, 1.0d, 10.0d, 1.0d};

    // Act
    DoubleArrayMath.mutateByAddition(array, 10.0d);

    // Assert
    assertArrayEquals(new double[] {20.0d, 11.0d, 20.0d, 11.0d}, array, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#mutateByMultiplication(double[], double[])} with {@code array},
   * {@code arrayToMultiplyBy}.
   *
   * <p>Method under test: {@link DoubleArrayMath#mutateByMultiplication(double[], double[])}
   */
  @Test
  @DisplayName("Test mutateByMultiplication(double[], double[]) with 'array', 'arrayToMultiplyBy'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.mutateByMultiplication(double[], double[])"})
  void testMutateByMultiplicationWithArrayArrayToMultiplyBy() {
    // Arrange
    double[] array = new double[] {10.0d, 1.0d, 10.0d, 1.0d};

    // Act
    DoubleArrayMath.mutateByMultiplication(array, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    assertArrayEquals(new double[] {100.0d, 1.0d, 100.0d, 1.0d}, array, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#mutateByMultiplication(double[], double[])} with {@code array},
   * {@code arrayToMultiplyBy}.
   *
   * <p>Method under test: {@link DoubleArrayMath#mutateByMultiplication(double[], double[])}
   */
  @Test
  @DisplayName("Test mutateByMultiplication(double[], double[]) with 'array', 'arrayToMultiplyBy'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.mutateByMultiplication(double[], double[])"})
  void testMutateByMultiplicationWithArrayArrayToMultiplyBy2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DoubleArrayMath.mutateByMultiplication(
                new double[] {}, new double[] {10.0d, 1.0d, 10.0d, 1.0d}));
  }

  /**
   * Test {@link DoubleArrayMath#mutateByMultiplication(double[], double)} with {@code array},
   * {@code valueToMultiplyBy}.
   *
   * <p>Method under test: {@link DoubleArrayMath#mutateByMultiplication(double[], double)}
   */
  @Test
  @DisplayName("Test mutateByMultiplication(double[], double) with 'array', 'valueToMultiplyBy'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.mutateByMultiplication(double[], double)"})
  void testMutateByMultiplicationWithArrayValueToMultiplyBy() {
    // Arrange
    double[] array = new double[] {10.0d, 1.0d, 10.0d, 1.0d};

    // Act
    DoubleArrayMath.mutateByMultiplication(array, 10.0d);

    // Assert
    assertArrayEquals(new double[] {100.0d, 10.0d, 100.0d, 10.0d}, array, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#mutate(double[], DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#mutate(double[], DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mutate(double[], DoubleUnaryOperator); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.mutate(double[], DoubleUnaryOperator)"})
  void testMutate_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleUnaryOperator operator = mock(DoubleUnaryOperator.class);
    when(operator.applyAsDouble(anyDouble())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> DoubleArrayMath.mutate(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, operator));
    verify(operator).applyAsDouble(10.0d);
  }

  /**
   * Test {@link DoubleArrayMath#mutate(double[], DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then array of {@code double} with ten and one is array of {@code double} with ten and
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#mutate(double[], DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mutate(double[], DoubleUnaryOperator); given ten; then array of double with ten and one is array of double with ten and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.mutate(double[], DoubleUnaryOperator)"})
  void testMutate_givenTen_thenArrayOfDoubleWithTenAndOneIsArrayOfDoubleWithTenAndTen() {
    // Arrange
    double[] array = new double[] {10.0d, 1.0d, 10.0d, 1.0d};

    DoubleUnaryOperator operator = mock(DoubleUnaryOperator.class);
    when(operator.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    DoubleArrayMath.mutate(array, operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(anyDouble());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d, 10.0d}, array, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#combineByAddition(double[], double[])}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with twenty and two.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combineByAddition(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test combineByAddition(double[], double[]); then return array of double with twenty and two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.combineByAddition(double[], double[])"})
  void testCombineByAddition_thenReturnArrayOfDoubleWithTwentyAndTwo() {
    // Arrange and Act
    double[] actualCombineByAdditionResult =
        DoubleArrayMath.combineByAddition(
            new double[] {10.0d, 1.0d, 10.0d, 1.0d}, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    assertArrayEquals(new double[] {20.0d, 2.0d, 20.0d, 2.0d}, actualCombineByAdditionResult, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#combineByAddition(double[], double[])}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combineByAddition(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test combineByAddition(double[], double[]); when empty array of double; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.combineByAddition(double[], double[])"})
  void testCombineByAddition_whenEmptyArrayOfDouble_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DoubleArrayMath.combineByAddition(
                new double[] {}, new double[] {10.0d, 1.0d, 10.0d, 1.0d}));
  }

  /**
   * Test {@link DoubleArrayMath#combineByMultiplication(double[], double[])}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with one hundred and one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combineByMultiplication(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test combineByMultiplication(double[], double[]); then return array of double with one hundred and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.combineByMultiplication(double[], double[])"})
  void testCombineByMultiplication_thenReturnArrayOfDoubleWithOneHundredAndOne() {
    // Arrange and Act
    double[] actualCombineByMultiplicationResult =
        DoubleArrayMath.combineByMultiplication(
            new double[] {10.0d, 1.0d, 10.0d, 1.0d}, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    assertArrayEquals(
        new double[] {100.0d, 1.0d, 100.0d, 1.0d}, actualCombineByMultiplicationResult, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#combineByMultiplication(double[], double[])}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combineByMultiplication(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test combineByMultiplication(double[], double[]); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.combineByMultiplication(double[], double[])"})
  void testCombineByMultiplication_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DoubleArrayMath.combineByMultiplication(
                new double[] {}, new double[] {10.0d, 1.0d, 10.0d, 1.0d}));
  }

  /**
   * Test {@link DoubleArrayMath#combine(double[], double[], DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combine(double[], double[], DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(double[], double[], DoubleBinaryOperator); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.combine(double[], double[], DoubleBinaryOperator)"})
  void testCombine_givenIllegalArgumentException() {
    // Arrange
    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DoubleArrayMath.combine(
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                operator));
    verify(operator).applyAsDouble(10.0d, 10.0d);
  }

  /**
   * Test {@link DoubleArrayMath#combine(double[], double[], DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return array of {@code double} with ten and ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combine(double[], double[], DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(double[], double[], DoubleBinaryOperator); given ten; then return array of double with ten and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.combine(double[], double[], DoubleBinaryOperator)"})
  void testCombine_givenTen_thenReturnArrayOfDoubleWithTenAndTen() {
    // Arrange
    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble())).thenReturn(10.0d);

    // Act
    double[] actualCombineResult =
        DoubleArrayMath.combine(
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(anyDouble(), anyDouble());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d, 10.0d}, actualCombineResult, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#combine(double[], double[], DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combine(double[], double[], DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combine(double[], double[], DoubleBinaryOperator); when empty array of double; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.combine(double[], double[], DoubleBinaryOperator)"})
  void testCombine_whenEmptyArrayOfDouble_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DoubleArrayMath.combine(
                new double[] {},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                mock(DoubleBinaryOperator.class)));
  }

  /**
   * Test {@link DoubleArrayMath#combineLenient(double[], double[], DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return array of {@code double} with ten and ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combineLenient(double[], double[],
   * DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combineLenient(double[], double[], DoubleBinaryOperator); given ten; then return array of double with ten and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] DoubleArrayMath.combineLenient(double[], double[], DoubleBinaryOperator)"
  })
  void testCombineLenient_givenTen_thenReturnArrayOfDoubleWithTenAndTen() {
    // Arrange
    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble())).thenReturn(10.0d);

    // Act
    double[] actualCombineLenientResult =
        DoubleArrayMath.combineLenient(
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(anyDouble(), anyDouble());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d, 10.0d}, actualCombineLenientResult, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#combineLenient(double[], double[], DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return array of {@code double} with ten and ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combineLenient(double[], double[],
   * DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combineLenient(double[], double[], DoubleBinaryOperator); given ten; then return array of double with ten and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] DoubleArrayMath.combineLenient(double[], double[], DoubleBinaryOperator)"
  })
  void testCombineLenient_givenTen_thenReturnArrayOfDoubleWithTenAndTen2() {
    // Arrange
    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble())).thenReturn(10.0d);

    // Act
    double[] actualCombineLenientResult =
        DoubleArrayMath.combineLenient(
            new double[] {10.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d},
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            operator);

    // Assert
    verify(operator, atLeast(1)).applyAsDouble(anyDouble(), anyDouble());
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0d, 10.0d, 1.0d},
        actualCombineLenientResult,
        0.0);
  }

  /**
   * Test {@link DoubleArrayMath#combineLenient(double[], double[], DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combineLenient(double[], double[],
   * DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combineLenient(double[], double[], DoubleBinaryOperator); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] DoubleArrayMath.combineLenient(double[], double[], DoubleBinaryOperator)"
  })
  void testCombineLenient_thenThrowIllegalArgumentException() {
    // Arrange
    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DoubleArrayMath.combineLenient(
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                operator));
    verify(operator).applyAsDouble(10.0d, 10.0d);
  }

  /**
   * Test {@link DoubleArrayMath#combineLenient(double[], double[], DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combineLenient(double[], double[],
   * DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combineLenient(double[], double[], DoubleBinaryOperator); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] DoubleArrayMath.combineLenient(double[], double[], DoubleBinaryOperator)"
  })
  void testCombineLenient_thenThrowIllegalArgumentException2() {
    // Arrange
    DoubleBinaryOperator operator = mock(DoubleBinaryOperator.class);
    when(operator.applyAsDouble(anyDouble(), anyDouble()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DoubleArrayMath.combineLenient(
                new double[] {10.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                operator));
    verify(operator).applyAsDouble(10.0d, 10.0d);
  }

  /**
   * Test {@link DoubleArrayMath#combineLenient(double[], double[], DoubleBinaryOperator)}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return array of {@code double} with ten and one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#combineLenient(double[], double[],
   * DoubleBinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test combineLenient(double[], double[], DoubleBinaryOperator); when empty array of double; then return array of double with ten and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] DoubleArrayMath.combineLenient(double[], double[], DoubleBinaryOperator)"
  })
  void testCombineLenient_whenEmptyArrayOfDouble_thenReturnArrayOfDoubleWithTenAndOne() {
    // Arrange and Act
    double[] actualCombineLenientResult =
        DoubleArrayMath.combineLenient(
            new double[] {},
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            mock(DoubleBinaryOperator.class));

    // Assert
    assertArrayEquals(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, actualCombineLenientResult, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#fuzzyEqualsZero(double[], double)}.
   *
   * <ul>
   *   <li>When array of {@code double} with {@link Double#NaN} and one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#fuzzyEqualsZero(double[], double)}
   */
  @Test
  @DisplayName(
      "Test fuzzyEqualsZero(double[], double); when array of double with NaN and one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArrayMath.fuzzyEqualsZero(double[], double)"})
  void testFuzzyEqualsZero_whenArrayOfDoubleWithNaNAndOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(
        DoubleArrayMath.fuzzyEqualsZero(new double[] {Double.NaN, 1.0d, 10.0d, 1.0d}, 10.0d));
  }

  /**
   * Test {@link DoubleArrayMath#fuzzyEqualsZero(double[], double)}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#fuzzyEqualsZero(double[], double)}
   */
  @Test
  @DisplayName(
      "Test fuzzyEqualsZero(double[], double); when array of double with ten and one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArrayMath.fuzzyEqualsZero(double[], double)"})
  void testFuzzyEqualsZero_whenArrayOfDoubleWithTenAndOne_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(DoubleArrayMath.fuzzyEqualsZero(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, 10.0d));
  }

  /**
   * Test {@link DoubleArrayMath#fuzzyEqualsZero(double[], double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#fuzzyEqualsZero(double[], double)}
   */
  @Test
  @DisplayName("Test fuzzyEqualsZero(double[], double); when zero; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArrayMath.fuzzyEqualsZero(double[], double)"})
  void testFuzzyEqualsZero_whenZero_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(DoubleArrayMath.fuzzyEqualsZero(new double[] {10.0d, 1.0d, 10.0d, 1.0d}, 0.0d));
  }

  /**
   * Test {@link DoubleArrayMath#fuzzyEquals(double[], double[], double)}.
   *
   * <ul>
   *   <li>When array of {@code double} with {@code -0.5} and one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#fuzzyEquals(double[], double[], double)}
   */
  @Test
  @DisplayName(
      "Test fuzzyEquals(double[], double[], double); when array of double with '-0.5' and one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArrayMath.fuzzyEquals(double[], double[], double)"})
  void testFuzzyEquals_whenArrayOfDoubleWith05AndOne_thenReturnFalse() {
    // Arrange and Act
    boolean actualFuzzyEqualsResult =
        DoubleArrayMath.fuzzyEquals(
            new double[] {-0.5d, 1.0d, 10.0d, 1.0d},
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            10.0d);

    // Assert
    assertFalse(actualFuzzyEqualsResult);
  }

  /**
   * Test {@link DoubleArrayMath#fuzzyEquals(double[], double[], double)}.
   *
   * <ul>
   *   <li>When array of {@code double} with {@link Double#NaN} and one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#fuzzyEquals(double[], double[], double)}
   */
  @Test
  @DisplayName(
      "Test fuzzyEquals(double[], double[], double); when array of double with NaN and one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArrayMath.fuzzyEquals(double[], double[], double)"})
  void testFuzzyEquals_whenArrayOfDoubleWithNaNAndOne_thenReturnFalse() {
    // Arrange and Act
    boolean actualFuzzyEqualsResult =
        DoubleArrayMath.fuzzyEquals(
            new double[] {Double.NaN, 1.0d, 10.0d, 1.0d},
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            10.0d);

    // Assert
    assertFalse(actualFuzzyEqualsResult);
  }

  /**
   * Test {@link DoubleArrayMath#fuzzyEquals(double[], double[], double)}.
   *
   * <ul>
   *   <li>When array of {@code double} with {@link Double#NaN} and one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#fuzzyEquals(double[], double[], double)}
   */
  @Test
  @DisplayName(
      "Test fuzzyEquals(double[], double[], double); when array of double with NaN and one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArrayMath.fuzzyEquals(double[], double[], double)"})
  void testFuzzyEquals_whenArrayOfDoubleWithNaNAndOne_thenReturnTrue() {
    // Arrange and Act
    boolean actualFuzzyEqualsResult =
        DoubleArrayMath.fuzzyEquals(
            new double[] {Double.NaN, 1.0d, 10.0d, 1.0d},
            new double[] {Double.NaN, 1.0d, 10.0d, 1.0d},
            10.0d);

    // Assert
    assertTrue(actualFuzzyEqualsResult);
  }

  /**
   * Test {@link DoubleArrayMath#fuzzyEquals(double[], double[], double)}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#fuzzyEquals(double[], double[], double)}
   */
  @Test
  @DisplayName(
      "Test fuzzyEquals(double[], double[], double); when array of double with ten and one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArrayMath.fuzzyEquals(double[], double[], double)"})
  void testFuzzyEquals_whenArrayOfDoubleWithTenAndOne_thenReturnTrue() {
    // Arrange and Act
    boolean actualFuzzyEqualsResult =
        DoubleArrayMath.fuzzyEquals(
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            10.0d);

    // Assert
    assertTrue(actualFuzzyEqualsResult);
  }

  /**
   * Test {@link DoubleArrayMath#fuzzyEquals(double[], double[], double)}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#fuzzyEquals(double[], double[], double)}
   */
  @Test
  @DisplayName(
      "Test fuzzyEquals(double[], double[], double); when empty array of double; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean DoubleArrayMath.fuzzyEquals(double[], double[], double)"})
  void testFuzzyEquals_whenEmptyArrayOfDouble_thenReturnFalse() {
    // Arrange and Act
    boolean actualFuzzyEqualsResult =
        DoubleArrayMath.fuzzyEquals(
            new double[] {}, new double[] {10.0d, 1.0d, 10.0d, 1.0d}, 10.0d);

    // Assert
    assertFalse(actualFuzzyEqualsResult);
  }

  /**
   * Test {@link DoubleArrayMath#sortPairs(double[], double[])} with {@code double[]}, {@code
   * double[]}.
   *
   * <p>Method under test: {@link DoubleArrayMath#sortPairs(double[], double[])}
   */
  @Test
  @DisplayName("Test sortPairs(double[], double[]) with 'double[]', 'double[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.sortPairs(double[], double[])"})
  void testSortPairsWithDoubleDouble() {
    // Arrange
    double[] keys = new double[] {10.0d, 1.0d, 10.0d, 1.0d};

    // Act
    DoubleArrayMath.sortPairs(keys, new double[] {10.0d, 1.0d, 10.0d, 1.0d});

    // Assert
    assertArrayEquals(new double[] {1.0d, 1.0d, 10.0d, 10.0d}, keys, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#sortPairs(double[], double[])} with {@code double[]}, {@code
   * double[]}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#sortPairs(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test sortPairs(double[], double[]) with 'double[]', 'double[]'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.sortPairs(double[], double[])"})
  void testSortPairsWithDoubleDouble_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> DoubleArrayMath.sortPairs(new double[] {}, new double[] {10.0d, 1.0d, 10.0d, 1.0d}));
  }

  /**
   * Test {@link DoubleArrayMath#sortPairs(double[], int[])} with {@code double[]}, {@code int[]}.
   *
   * <p>Method under test: {@link DoubleArrayMath#sortPairs(double[], int[])}
   */
  @Test
  @DisplayName("Test sortPairs(double[], int[]) with 'double[]', 'int[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.sortPairs(double[], int[])"})
  void testSortPairsWithDoubleInt() {
    // Arrange
    double[] keys = new double[] {10.0d, 1.0d, 10.0d, 1.0d};
    int[] values = new int[] {42, 1, 42, 1};

    // Act
    DoubleArrayMath.sortPairs(keys, values);

    // Assert
    assertArrayEquals(new double[] {1.0d, 1.0d, 10.0d, 10.0d}, keys, 0.0);
    assertArrayEquals(new int[] {1, 1, 42, 42}, values);
  }

  /**
   * Test {@link DoubleArrayMath#sortPairs(double[], int[])} with {@code double[]}, {@code int[]}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#sortPairs(double[], int[])}
   */
  @Test
  @DisplayName(
      "Test sortPairs(double[], int[]) with 'double[]', 'int[]'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.sortPairs(double[], int[])"})
  void testSortPairsWithDoubleInt_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> DoubleArrayMath.sortPairs(new double[] {}, new int[] {42, 1, 42, 1}));
  }

  /**
   * Test {@link DoubleArrayMath#sortPairs(double[], Object[])} with {@code double[]}, {@code
   * Object[]}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#sortPairs(double[], Object[])}
   */
  @Test
  @DisplayName(
      "Test sortPairs(double[], Object[]) with 'double[]', 'Object[]'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.sortPairs(double[], Object[])"})
  void testSortPairsWithDoubleObject_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            DoubleArrayMath.sortPairs(
                new double[] {10.0d, 1.0d, 10.0d, 1.0d}, new Object[] {"Values"}));
  }

  /**
   * Test {@link DoubleArrayMath#sortPairs(double[], Object[])} with {@code double[]}, {@code
   * Object[]}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#sortPairs(double[], Object[])}
   */
  @Test
  @DisplayName(
      "Test sortPairs(double[], Object[]) with 'double[]', 'Object[]'; when empty array of double; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DoubleArrayMath.sortPairs(double[], Object[])"})
  void testSortPairsWithDoubleObject_whenEmptyArrayOfDouble_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> DoubleArrayMath.sortPairs(new double[] {}, new Object[] {}));
  }

  /**
   * Test {@link DoubleArrayMath#reorderedCopy(double[], int[])}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with one and ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#reorderedCopy(double[], int[])}
   */
  @Test
  @DisplayName("Test reorderedCopy(double[], int[]); then return array of double with one and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.reorderedCopy(double[], int[])"})
  void testReorderedCopy_thenReturnArrayOfDoubleWithOneAndTen() {
    // Arrange and Act
    double[] actualReorderedCopyResult =
        DoubleArrayMath.reorderedCopy(
            new double[] {10.0d, 1.0d, 10.0d, 1.0d}, new int[] {1, 0, 1, 0});

    // Assert
    assertArrayEquals(new double[] {1.0d, 10.0d, 1.0d, 10.0d}, actualReorderedCopyResult, 0.0);
  }

  /**
   * Test {@link DoubleArrayMath#reorderedCopy(double[], int[])}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleArrayMath#reorderedCopy(double[], int[])}
   */
  @Test
  @DisplayName(
      "Test reorderedCopy(double[], int[]); when empty array of double; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] DoubleArrayMath.reorderedCopy(double[], int[])"})
  void testReorderedCopy_whenEmptyArrayOfDouble_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> DoubleArrayMath.reorderedCopy(new double[] {}, new int[] {1, 0, 1, 0}));
  }
}
