package com.opengamma.strata.math.impl.differentiation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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

class MatrixFieldFirstOrderDifferentiatorDiffblueTest {
  /**
   * Test {@link MatrixFieldFirstOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix}.
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link MatrixFieldFirstOrderDifferentiator#differentiate(Function,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function, Function) with 'function', 'domain'; given DoubleMatrix; then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function MatrixFieldFirstOrderDifferentiator.differentiate(Function, Function)"
  })
  void testDifferentiateWithFunctionDomain_givenDoubleMatrix_thenFilledThreeMaxIsZero() {
    // Arrange
    MatrixFieldFirstOrderDifferentiator matrixFieldFirstOrderDifferentiator =
        new MatrixFieldFirstOrderDifferentiator();

    Function<DoubleArray, DoubleMatrix> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());

    Function<DoubleArray, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateResult =
        matrixFieldFirstOrderDifferentiator.differentiate(function, domain);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleMatrix[] actualApplyResult = actualDifferentiateResult.apply(filledResult);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    verify(domain, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0.0d, filledResult.max());
    assertEquals(0.0d, filledResult.min());
    assertEquals(0.0d, filledResult.sum());
    assertEquals(1, filledResult.dimensions());
    assertEquals(3, filledResult.size());
    assertEquals(3, filledResult.toList().size());
    assertEquals(3, actualApplyResult.length);
    assertFalse(filledResult.isEmpty());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link MatrixFieldFirstOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MatrixFieldFirstOrderDifferentiator#differentiate(Function,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function, Function) with 'function', 'domain'; given 'true'; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function MatrixFieldFirstOrderDifferentiator.differentiate(Function, Function)"
  })
  void testDifferentiateWithFunctionDomain_givenTrue_thenDoubleArraySizeIsZero() {
    // Arrange
    MatrixFieldFirstOrderDifferentiator matrixFieldFirstOrderDifferentiator =
        new MatrixFieldFirstOrderDifferentiator();
    Function<DoubleArray, DoubleMatrix> function = mock(Function.class);

    Function<DoubleArray, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateResult =
        matrixFieldFirstOrderDifferentiator.differentiate(function, domain);
    DoubleArray ofResult = DoubleArray.of();
    DoubleMatrix[] actualApplyResult = actualDifferentiateResult.apply(ofResult);

    // Assert
    verify(domain).apply(isA(DoubleArray.class));
    assertEquals(0, ofResult.size());
    assertEquals(0, actualApplyResult.length);
    assertEquals(0.0d, ofResult.sum());
    assertEquals(1, ofResult.dimensions());
    assertTrue(ofResult.isEmpty());
    assertTrue(ofResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, ofResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link MatrixFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>Given {@link DoubleMatrix}.
   *   <li>Then return array length is three.
   * </ul>
   *
   * <p>Method under test: {@link MatrixFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; given DoubleMatrix; then return array length is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function MatrixFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_givenDoubleMatrix_thenReturnArrayLengthIsThree() {
    // Arrange
    MatrixFieldFirstOrderDifferentiator matrixFieldFirstOrderDifferentiator =
        new MatrixFieldFirstOrderDifferentiator();

    Function<DoubleArray, DoubleMatrix> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateResult =
        matrixFieldFirstOrderDifferentiator.differentiate(function);
    DoubleMatrix[] actualApplyResult = actualDifferentiateResult.apply(DoubleArray.filled(3));

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(3, actualApplyResult.length);
  }

  /**
   * Test {@link MatrixFieldFirstOrderDifferentiator#differentiate(Function)} with {@code function}.
   *
   * <ul>
   *   <li>When {@link Function}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link MatrixFieldFirstOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; when Function; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function MatrixFieldFirstOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_whenFunction_thenReturnArrayLengthIsZero() {
    // Arrange and Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateResult =
        new MatrixFieldFirstOrderDifferentiator().differentiate(mock(Function.class));

    // Assert
    assertEquals(0, actualDifferentiateResult.apply(DoubleArray.of()).length);
  }
}
