package com.opengamma.strata.math.impl.differentiation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class VectorFieldFirstOrderDifferentiatorDiffblueTest {
  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function, Function) with 'function', 'domain'; given DoubleArray; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function VectorFieldFirstOrderDifferentiator.differentiate(Function, Function)"
  })
  void testDifferentiateWithFunctionDomain_givenDoubleArray_thenDoubleArraySizeIsZero() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function, domain);
    DoubleArray ofResult = DoubleArray.of();
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(ofResult);

    // Assert
    verify(function).apply(isA(DoubleArray.class));
    verify(domain).apply(isA(DoubleArray.class));
    assertEquals(0, ofResult.size());
    assertEquals(0.0d, ofResult.sum());
    assertEquals(1, ofResult.dimensions());
    assertTrue(ofResult.isEmpty());
    assertTrue(ofResult.toList().isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualApplyResult);
    assertArrayEquals(new double[] {}, ofResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function, Function) with 'function', 'domain'; given DoubleArray; then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function VectorFieldFirstOrderDifferentiator.differentiate(Function, Function)"
  })
  void testDifferentiateWithFunctionDomain_givenDoubleArray_thenFilledThreeMaxIsZero() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function, domain);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(filledResult);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    verify(domain, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, filledResult.max());
    assertEquals(0.0d, filledResult.min());
    assertEquals(0.0d, filledResult.sum());
    assertEquals(1, filledResult.dimensions());
    assertEquals(3, filledResult.size());
    assertEquals(3, filledResult.toList().size());
    assertFalse(filledResult.isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualApplyResult);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <ul>
   *   <li>Then return apply filled three total is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function, Function) with 'function', 'domain'; then return apply filled three total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function VectorFieldFirstOrderDifferentiator.differentiate(Function, Function)"
  })
  void testDifferentiateWithFunctionDomain_thenReturnApplyFilledThreeTotalIsZero() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    DoubleArray filledResult = DoubleArray.filled(3);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(filledResult);

    Function<DoubleArray, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function, domain);
    DoubleArray filledResult2 = DoubleArray.filled(3);
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(filledResult2);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    verify(domain, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, actualApplyResult.total());
    assertEquals(2, actualApplyResult.dimensions());
    double[][] toArrayUnsafeResult = actualApplyResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, actualApplyResult.size());
    assertFalse(actualApplyResult.isEmpty());
    assertTrue(actualApplyResult.isSquare());
    assertEquals(filledResult, filledResult2);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; given DoubleArray; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_givenDoubleArray_thenDoubleArraySizeIsZero() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray ofResult = DoubleArray.of();
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(ofResult);

    // Assert
    verify(function).apply(isA(DoubleArray.class));
    assertEquals(0, ofResult.size());
    assertEquals(0.0d, ofResult.sum());
    assertEquals(1, ofResult.dimensions());
    assertTrue(ofResult.isEmpty());
    assertTrue(ofResult.toList().isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualApplyResult);
    assertArrayEquals(new double[] {}, ofResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; given DoubleArray; then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_givenDoubleArray_thenFilledThreeMaxIsZero() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(filledResult);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, filledResult.max());
    assertEquals(0.0d, filledResult.min());
    assertEquals(0.0d, filledResult.sum());
    assertEquals(1, filledResult.dimensions());
    assertEquals(3, filledResult.size());
    assertEquals(3, filledResult.toList().size());
    assertFalse(filledResult.isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualApplyResult);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenDoubleArraySizeIsZero() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator(FiniteDifferenceType.FORWARD);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray ofResult = DoubleArray.of();
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(ofResult);

    // Assert
    verify(function).apply(isA(DoubleArray.class));
    assertEquals(0, ofResult.size());
    assertEquals(0.0d, ofResult.sum());
    assertEquals(1, ofResult.dimensions());
    assertTrue(ofResult.isEmpty());
    assertTrue(ofResult.toList().isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualApplyResult);
    assertArrayEquals(new double[] {}, ofResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenDoubleArraySizeIsZero2() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator(FiniteDifferenceType.BACKWARD);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray ofResult = DoubleArray.of();
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(ofResult);

    // Assert
    verify(function).apply(isA(DoubleArray.class));
    assertEquals(0, ofResult.size());
    assertEquals(0.0d, ofResult.sum());
    assertEquals(1, ofResult.dimensions());
    assertTrue(ofResult.isEmpty());
    assertTrue(ofResult.toList().isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualApplyResult);
    assertArrayEquals(new double[] {}, ofResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'; then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenFilledThreeMaxIsZero() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator(FiniteDifferenceType.FORWARD);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(filledResult);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, filledResult.max());
    assertEquals(0.0d, filledResult.min());
    assertEquals(0.0d, filledResult.sum());
    assertEquals(1, filledResult.dimensions());
    assertEquals(3, filledResult.size());
    assertEquals(3, filledResult.toList().size());
    assertFalse(filledResult.isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualApplyResult);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'; then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenFilledThreeMaxIsZero2() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator(FiniteDifferenceType.BACKWARD);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(filledResult);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, filledResult.max());
    assertEquals(0.0d, filledResult.min());
    assertEquals(0.0d, filledResult.sum());
    assertEquals(1, filledResult.dimensions());
    assertEquals(3, filledResult.size());
    assertEquals(3, filledResult.toList().size());
    assertFalse(filledResult.isEmpty());
    assertSame(DoubleMatrix.EMPTY, actualApplyResult);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then return apply filled three total is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then return apply filled three total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenReturnApplyFilledThreeTotalIsZero() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    DoubleArray filledResult = DoubleArray.filled(3);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(filledResult);

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray filledResult2 = DoubleArray.filled(3);
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(filledResult2);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, actualApplyResult.total());
    assertEquals(2, actualApplyResult.dimensions());
    double[][] toArrayUnsafeResult = actualApplyResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, actualApplyResult.size());
    assertFalse(actualApplyResult.isEmpty());
    assertTrue(actualApplyResult.isSquare());
    assertEquals(filledResult, filledResult2);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then return apply filled three total is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then return apply filled three total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenReturnApplyFilledThreeTotalIsZero2() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator(FiniteDifferenceType.FORWARD);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    DoubleArray filledResult = DoubleArray.filled(3);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(filledResult);

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray filledResult2 = DoubleArray.filled(3);
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(filledResult2);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, actualApplyResult.total());
    assertEquals(2, actualApplyResult.dimensions());
    double[][] toArrayUnsafeResult = actualApplyResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, actualApplyResult.size());
    assertFalse(actualApplyResult.isEmpty());
    assertTrue(actualApplyResult.isSquare());
    assertEquals(filledResult, filledResult2);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then return apply filled three total is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then return apply filled three total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenReturnApplyFilledThreeTotalIsZero3() {
    // Arrange
    VectorFieldFirstOrderDifferentiator vectorFieldFirstOrderDifferentiator =
        new VectorFieldFirstOrderDifferentiator(FiniteDifferenceType.BACKWARD);

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    DoubleArray filledResult = DoubleArray.filled(3);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(filledResult);

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateResult =
        vectorFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray filledResult2 = DoubleArray.filled(3);
    DoubleMatrix actualApplyResult = actualDifferentiateResult.apply(filledResult2);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, actualApplyResult.total());
    assertEquals(2, actualApplyResult.dimensions());
    double[][] toArrayUnsafeResult = actualApplyResult.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, actualApplyResult.size());
    assertFalse(actualApplyResult.isEmpty());
    assertTrue(actualApplyResult.isSquare());
    assertEquals(filledResult, filledResult2);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }
}
