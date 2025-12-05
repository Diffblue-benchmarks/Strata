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
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ScalarFieldFirstOrderDifferentiatorDiffblueTest {
  /**
   * Test {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <p>Method under test: {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction() {
    // Arrange
    ScalarFieldFirstOrderDifferentiator scalarFieldFirstOrderDifferentiator =
        new ScalarFieldFirstOrderDifferentiator(FiniteDifferenceType.CENTRAL, 0.015625d);

    Function<DoubleArray, Double> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(10.0d);

    // Act
    Function<DoubleArray, DoubleArray> actualDifferentiateResult =
        scalarFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleArray actualApplyResult = actualDifferentiateResult.apply(filledResult);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, filledResult.max());
    assertEquals(0.0d, filledResult.min());
    assertEquals(0.0d, filledResult.sum());
    List<Double> toListResult = filledResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, filledResult.dimensions());
    assertEquals(3, filledResult.size());
    assertFalse(filledResult.isEmpty());
    assertEquals(filledResult, actualApplyResult);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function, Function) with 'function', 'domain'; given ten; then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function ScalarFieldFirstOrderDifferentiator.differentiate(Function, Function)"
  })
  void testDifferentiateWithFunctionDomain_givenTen_thenFilledThreeMaxIsZero() {
    // Arrange
    ScalarFieldFirstOrderDifferentiator scalarFieldFirstOrderDifferentiator =
        new ScalarFieldFirstOrderDifferentiator();

    Function<DoubleArray, Double> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(10.0d);

    Function<DoubleArray, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act
    Function<DoubleArray, DoubleArray> actualDifferentiateResult =
        scalarFieldFirstOrderDifferentiator.differentiate(function, domain);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleArray actualApplyResult = actualDifferentiateResult.apply(filledResult);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    verify(domain, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, filledResult.max());
    assertEquals(0.0d, filledResult.min());
    assertEquals(0.0d, filledResult.sum());
    List<Double> toListResult = filledResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, filledResult.dimensions());
    assertEquals(3, filledResult.size());
    assertFalse(filledResult.isEmpty());
    assertEquals(filledResult, actualApplyResult);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function, Function) with 'function', 'domain'; given 'true'; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function ScalarFieldFirstOrderDifferentiator.differentiate(Function, Function)"
  })
  void testDifferentiateWithFunctionDomain_givenTrue_thenDoubleArraySizeIsZero() {
    // Arrange
    ScalarFieldFirstOrderDifferentiator scalarFieldFirstOrderDifferentiator =
        new ScalarFieldFirstOrderDifferentiator();
    Function<DoubleArray, Double> function = mock(Function.class);

    Function<DoubleArray, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act
    Function<DoubleArray, DoubleArray> actualDifferentiateResult =
        scalarFieldFirstOrderDifferentiator.differentiate(function, domain);
    DoubleArray ofResult = DoubleArray.of();
    DoubleArray actualApplyResult = actualDifferentiateResult.apply(ofResult);

    // Assert
    verify(domain).apply(isA(DoubleArray.class));
    assertEquals(0, ofResult.size());
    assertEquals(0.0d, ofResult.sum());
    assertEquals(1, ofResult.dimensions());
    assertTrue(ofResult.isEmpty());
    assertTrue(ofResult.toList().isEmpty());
    assertSame(DoubleArray.EMPTY, actualApplyResult);
  }

  /**
   * Test {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Given {@link ScalarFieldFirstOrderDifferentiator#ScalarFieldFirstOrderDifferentiator()}.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; given ScalarFieldFirstOrderDifferentiator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_givenScalarFieldFirstOrderDifferentiator() {
    // Arrange and Act
    Function<DoubleArray, DoubleArray> actualDifferentiateResult =
        new ScalarFieldFirstOrderDifferentiator().differentiate(mock(Function.class));
    DoubleArray ofResult = DoubleArray.of();
    DoubleArray actualApplyResult = actualDifferentiateResult.apply(ofResult);

    // Assert
    assertEquals(0, ofResult.size());
    assertEquals(0.0d, ofResult.sum());
    assertEquals(1, ofResult.dimensions());
    assertTrue(ofResult.isEmpty());
    assertTrue(ofResult.toList().isEmpty());
    assertSame(DoubleArray.EMPTY, actualApplyResult);
  }

  /**
   * Test {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenDoubleArraySizeIsZero() {
    // Arrange
    ScalarFieldFirstOrderDifferentiator scalarFieldFirstOrderDifferentiator =
        new ScalarFieldFirstOrderDifferentiator(FiniteDifferenceType.FORWARD, 0.015625d);

    Function<DoubleArray, Double> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(10.0d);

    // Act
    Function<DoubleArray, DoubleArray> actualDifferentiateResult =
        scalarFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray ofResult = DoubleArray.of();
    DoubleArray actualApplyResult = actualDifferentiateResult.apply(ofResult);

    // Assert
    verify(function).apply(isA(DoubleArray.class));
    assertEquals(0, ofResult.size());
    assertEquals(0.0d, ofResult.sum());
    assertEquals(1, ofResult.dimensions());
    assertTrue(ofResult.isEmpty());
    assertTrue(ofResult.toList().isEmpty());
    assertSame(DoubleArray.EMPTY, actualApplyResult);
  }

  /**
   * Test {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenDoubleArraySizeIsZero2() {
    // Arrange
    ScalarFieldFirstOrderDifferentiator scalarFieldFirstOrderDifferentiator =
        new ScalarFieldFirstOrderDifferentiator(FiniteDifferenceType.BACKWARD, 0.015625d);

    Function<DoubleArray, Double> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(10.0d);

    // Act
    Function<DoubleArray, DoubleArray> actualDifferentiateResult =
        scalarFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray ofResult = DoubleArray.of();
    DoubleArray actualApplyResult = actualDifferentiateResult.apply(ofResult);

    // Assert
    verify(function).apply(isA(DoubleArray.class));
    assertEquals(0, ofResult.size());
    assertEquals(0.0d, ofResult.sum());
    assertEquals(1, ofResult.dimensions());
    assertTrue(ofResult.isEmpty());
    assertTrue(ofResult.toList().isEmpty());
    assertSame(DoubleArray.EMPTY, actualApplyResult);
  }

  /**
   * Test {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'; then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenFilledThreeMaxIsZero() {
    // Arrange
    ScalarFieldFirstOrderDifferentiator scalarFieldFirstOrderDifferentiator =
        new ScalarFieldFirstOrderDifferentiator(FiniteDifferenceType.FORWARD, 0.015625d);

    Function<DoubleArray, Double> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(10.0d);

    // Act
    Function<DoubleArray, DoubleArray> actualDifferentiateResult =
        scalarFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleArray actualApplyResult = actualDifferentiateResult.apply(filledResult);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, filledResult.max());
    assertEquals(0.0d, filledResult.min());
    assertEquals(0.0d, filledResult.sum());
    List<Double> toListResult = filledResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, filledResult.dimensions());
    assertEquals(3, filledResult.size());
    assertFalse(filledResult.isEmpty());
    assertEquals(filledResult, actualApplyResult);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScalarFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'; then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function ScalarFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenFilledThreeMaxIsZero2() {
    // Arrange
    ScalarFieldFirstOrderDifferentiator scalarFieldFirstOrderDifferentiator =
        new ScalarFieldFirstOrderDifferentiator(FiniteDifferenceType.BACKWARD, 0.015625d);

    Function<DoubleArray, Double> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(10.0d);

    // Act
    Function<DoubleArray, DoubleArray> actualDifferentiateResult =
        scalarFieldFirstOrderDifferentiator.differentiate(function);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleArray actualApplyResult = actualDifferentiateResult.apply(filledResult);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, filledResult.max());
    assertEquals(0.0d, filledResult.min());
    assertEquals(0.0d, filledResult.sum());
    List<Double> toListResult = filledResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, filledResult.dimensions());
    assertEquals(3, filledResult.size());
    assertFalse(filledResult.isEmpty());
    assertEquals(filledResult, actualApplyResult);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }
}
