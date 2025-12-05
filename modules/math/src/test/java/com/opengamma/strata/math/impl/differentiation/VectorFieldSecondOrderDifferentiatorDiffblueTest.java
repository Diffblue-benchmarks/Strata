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
import com.opengamma.strata.math.impl.function.ConcatenatedVectorFunction;
import com.opengamma.strata.math.impl.function.ParameterizedCurve;
import com.opengamma.strata.math.impl.function.ParameterizedCurveVectorFunction;
import com.opengamma.strata.math.impl.function.VectorFunction;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class VectorFieldSecondOrderDifferentiatorDiffblueTest {
  /**
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiate(Function)} with {@code
   * function}.
   *
   * <p>Method under test: {@link VectorFieldSecondOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldSecondOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.asFunctionOfArguments(Mockito.<DoubleArray>any())).thenReturn(function);
    when(curve.getNumberOfParameters()).thenReturn(3);
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);
    VectorFunction[] functions = new VectorFunction[] {parameterizedCurveVectorFunction};
    ConcatenatedVectorFunction function2 = new ConcatenatedVectorFunction(functions);

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateResult =
        vectorFieldSecondOrderDifferentiator.differentiate(function2);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleMatrix[] actualApplyResult = actualDifferentiateResult.apply(filledResult);

    // Assert
    verify(curve, atLeast(1)).asFunctionOfArguments(Mockito.<DoubleArray>any());
    verify(curve).getNumberOfParameters();
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(0.0d, filledResult.max());
    assertEquals(0.0d, filledResult.min());
    assertEquals(0.0d, filledResult.sum());
    assertEquals(1, filledResult.dimensions());
    assertEquals(3, filledResult.size());
    assertEquals(3, function2.getLengthOfDomain());
    assertEquals(3, filledResult.toList().size());
    assertEquals(4, function2.getLengthOfRange());
    assertEquals(4, actualApplyResult.length);
    assertFalse(filledResult.isEmpty());
    DoubleMatrix doubleMatrix = actualApplyResult[0];
    assertEquals(doubleMatrix, actualApplyResult[1]);
    assertEquals(doubleMatrix, actualApplyResult[2]);
    assertEquals(doubleMatrix, actualApplyResult[3]);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiate(Function)} with {@code
   * function}.
   *
   * <p>Method under test: {@link VectorFieldSecondOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName("Test differentiate(Function) with 'function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldSecondOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction2() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.asFunctionOfArguments(Mockito.<DoubleArray>any())).thenReturn(function);
    ParameterizedCurveVectorFunction function2 =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateResult =
        vectorFieldSecondOrderDifferentiator.differentiate(function2);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleMatrix[] actualApplyResult = actualDifferentiateResult.apply(filledResult);

    // Assert
    verify(curve, atLeast(1)).asFunctionOfArguments(Mockito.<DoubleArray>any());
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(0, function2.getLengthOfDomain());
    assertEquals(0.0d, filledResult.max());
    assertEquals(0.0d, filledResult.min());
    assertEquals(0.0d, filledResult.sum());
    assertEquals(1, filledResult.dimensions());
    assertEquals(3, filledResult.size());
    assertEquals(3, filledResult.toList().size());
    assertEquals(4, function2.getLengthOfRange());
    assertEquals(4, actualApplyResult.length);
    assertFalse(filledResult.isEmpty());
    DoubleMatrix doubleMatrix = actualApplyResult[0];
    assertEquals(doubleMatrix, actualApplyResult[1]);
    assertEquals(doubleMatrix, actualApplyResult[2]);
    assertEquals(doubleMatrix, actualApplyResult[3]);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiate(Function, Function)} with {@code
   * function}, {@code domain}.
   *
   * <ul>
   *   <li>Then return first element total is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldSecondOrderDifferentiator#differentiate(Function,
   * Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function, Function) with 'function', 'domain'; then return first element total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function VectorFieldSecondOrderDifferentiator.differentiate(Function, Function)"
  })
  void testDifferentiateWithFunctionDomain_thenReturnFirstElementTotalIsZero() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    DoubleArray filledResult = DoubleArray.filled(3);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(filledResult);

    Function<DoubleArray, Boolean> domain = mock(Function.class);
    when(domain.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateResult =
        vectorFieldSecondOrderDifferentiator.differentiate(function, domain);
    DoubleArray filledResult2 = DoubleArray.filled(3);
    DoubleMatrix[] actualApplyResult = actualDifferentiateResult.apply(filledResult2);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    verify(domain, atLeast(1)).apply(Mockito.<DoubleArray>any());
    DoubleMatrix doubleMatrix = actualApplyResult[0];
    assertEquals(0.0d, doubleMatrix.total());
    assertEquals(2, doubleMatrix.dimensions());
    double[][] toArrayUnsafeResult = doubleMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3, actualApplyResult.length);
    assertEquals(9, doubleMatrix.size());
    assertFalse(doubleMatrix.isEmpty());
    assertTrue(doubleMatrix.isSquare());
    assertEquals(filledResult, filledResult2);
    assertEquals(doubleMatrix, actualApplyResult[1]);
    assertEquals(doubleMatrix, actualApplyResult[2]);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiate(Function)} with {@code
   * function}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return first element total is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldSecondOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; given filled three; then return first element total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldSecondOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_givenFilledThree_thenReturnFirstElementTotalIsZero() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    DoubleArray filledResult = DoubleArray.filled(3);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(filledResult);

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateResult =
        vectorFieldSecondOrderDifferentiator.differentiate(function);
    DoubleArray filledResult2 = DoubleArray.filled(3);
    DoubleMatrix[] actualApplyResult = actualDifferentiateResult.apply(filledResult2);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    DoubleMatrix doubleMatrix = actualApplyResult[0];
    assertEquals(0.0d, doubleMatrix.total());
    assertEquals(2, doubleMatrix.dimensions());
    double[][] toArrayUnsafeResult = doubleMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3, actualApplyResult.length);
    assertEquals(9, doubleMatrix.size());
    assertFalse(doubleMatrix.isEmpty());
    assertTrue(doubleMatrix.isSquare());
    assertEquals(filledResult, filledResult2);
    assertEquals(doubleMatrix, actualApplyResult[1]);
    assertEquals(doubleMatrix, actualApplyResult[2]);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiate(Function)} with {@code
   * function}.
   *
   * <ul>
   *   <li>Then {@link DoubleArray} with value is {@link Double#NaN} dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldSecondOrderDifferentiator#differentiate(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiate(Function) with 'function'; then DoubleArray with value is NaN dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldSecondOrderDifferentiator.differentiate(Function)"})
  void testDifferentiateWithFunction_thenDoubleArrayWithValueIsNaNDimensionsIsOne() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.filled(3));

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateResult =
        vectorFieldSecondOrderDifferentiator.differentiate(function);
    DoubleArray ofResult = DoubleArray.of(Double.NaN);
    DoubleMatrix[] actualApplyResult = actualDifferentiateResult.apply(ofResult);

    // Assert
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
    assertEquals(1, ofResult.dimensions());
    assertEquals(1, ofResult.size());
    assertEquals(1, ofResult.toList().size());
    assertEquals(3, actualApplyResult.length);
    assertFalse(ofResult.isEmpty());
    DoubleMatrix doubleMatrix = actualApplyResult[0];
    assertEquals(doubleMatrix, actualApplyResult[1]);
    assertEquals(doubleMatrix, actualApplyResult[2]);
    assertEquals(Double.NaN, ofResult.max());
    assertEquals(Double.NaN, ofResult.min());
    assertEquals(Double.NaN, ofResult.sum());
    assertArrayEquals(new double[] {Double.NaN}, ofResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiateFull(Function)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldSecondOrderDifferentiator#differentiateFull(Function)}
   */
  @Test
  @DisplayName("Test differentiateFull(Function); given DoubleArray; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldSecondOrderDifferentiator.differentiateFull(Function)"})
  void testDifferentiateFull_givenDoubleArray_thenDoubleArraySizeIsZero() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateFullResult =
        vectorFieldSecondOrderDifferentiator.differentiateFull(function);
    DoubleArray ofResult = DoubleArray.of();
    DoubleMatrix[] actualApplyResult = actualDifferentiateFullResult.apply(ofResult);

    // Assert
    verify(function).apply(isA(DoubleArray.class));
    assertEquals(0, ofResult.size());
    assertEquals(0, actualApplyResult.length);
    assertEquals(0.0d, ofResult.sum());
    assertEquals(1, ofResult.dimensions());
    assertTrue(ofResult.isEmpty());
    assertTrue(ofResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, ofResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiateFull(Function)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldSecondOrderDifferentiator#differentiateFull(Function)}
   */
  @Test
  @DisplayName("Test differentiateFull(Function); given DoubleArray; then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldSecondOrderDifferentiator.differentiateFull(Function)"})
  void testDifferentiateFull_givenDoubleArray_thenFilledThreeMaxIsZero() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateFullResult =
        vectorFieldSecondOrderDifferentiator.differentiateFull(function);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleMatrix[] actualApplyResult = actualDifferentiateFullResult.apply(filledResult);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    assertEquals(0, actualApplyResult.length);
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
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, filledResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiateFull(Function)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldSecondOrderDifferentiator#differentiateFull(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiateFull(Function); given filled three; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldSecondOrderDifferentiator.differentiateFull(Function)"})
  void testDifferentiateFull_givenFilledThree_thenDoubleArraySizeIsZero() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.filled(3));

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateFullResult =
        vectorFieldSecondOrderDifferentiator.differentiateFull(function);
    DoubleArray ofResult = DoubleArray.of();
    DoubleMatrix[] actualApplyResult = actualDifferentiateFullResult.apply(ofResult);

    // Assert
    verify(function).apply(isA(DoubleArray.class));
    assertEquals(0, ofResult.size());
    assertEquals(0.0d, ofResult.sum());
    assertEquals(1, ofResult.dimensions());
    assertEquals(3, actualApplyResult.length);
    assertTrue(ofResult.isEmpty());
    assertTrue(ofResult.toList().isEmpty());
    DoubleMatrix doubleMatrix = actualApplyResult[0];
    assertSame(doubleMatrix, actualApplyResult[1]);
    assertSame(doubleMatrix, actualApplyResult[2]);
    assertArrayEquals(new double[] {}, ofResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiateFull(Function)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return first element total is zero.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldSecondOrderDifferentiator#differentiateFull(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiateFull(Function); given filled three; then return first element total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldSecondOrderDifferentiator.differentiateFull(Function)"})
  void testDifferentiateFull_givenFilledThree_thenReturnFirstElementTotalIsZero() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    DoubleArray filledResult = DoubleArray.filled(3);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(filledResult);

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateFullResult =
        vectorFieldSecondOrderDifferentiator.differentiateFull(function);
    DoubleArray filledResult2 = DoubleArray.filled(3);
    DoubleMatrix[] actualApplyResult = actualDifferentiateFullResult.apply(filledResult2);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<DoubleArray>any());
    DoubleMatrix doubleMatrix = actualApplyResult[0];
    assertEquals(0.0d, doubleMatrix.total());
    assertEquals(2, doubleMatrix.dimensions());
    double[][] toArrayUnsafeResult = doubleMatrix.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3, actualApplyResult.length);
    assertEquals(9, doubleMatrix.size());
    assertFalse(doubleMatrix.isEmpty());
    assertTrue(doubleMatrix.isSquare());
    assertEquals(filledResult, filledResult2);
    assertEquals(doubleMatrix, actualApplyResult[1]);
    assertEquals(doubleMatrix, actualApplyResult[2]);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiateFull(Function)}.
   *
   * <ul>
   *   <li>Then {@link DoubleArray} with value is {@link Double#NaN} dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link VectorFieldSecondOrderDifferentiator#differentiateFull(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiateFull(Function); then DoubleArray with value is NaN dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function VectorFieldSecondOrderDifferentiator.differentiateFull(Function)"})
  void testDifferentiateFull_thenDoubleArrayWithValueIsNaNDimensionsIsOne() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix[]> actualDifferentiateFullResult =
        vectorFieldSecondOrderDifferentiator.differentiateFull(function);
    DoubleArray ofResult = DoubleArray.of(Double.NaN);
    DoubleMatrix[] actualApplyResult = actualDifferentiateFullResult.apply(ofResult);

    // Assert
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
    assertEquals(0, actualApplyResult.length);
    assertEquals(1, ofResult.dimensions());
    assertEquals(1, ofResult.size());
    List<Double> toListResult = ofResult.toList();
    assertEquals(1, toListResult.size());
    assertFalse(ofResult.isEmpty());
    assertEquals(Double.NaN, ofResult.max());
    assertEquals(Double.NaN, ofResult.min());
    assertEquals(Double.NaN, ofResult.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {Double.NaN}, ofResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiateNoCross(Function)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * VectorFieldSecondOrderDifferentiator#differentiateNoCross(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiateNoCross(Function); given DoubleArray; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function VectorFieldSecondOrderDifferentiator.differentiateNoCross(Function)"
  })
  void testDifferentiateNoCross_givenDoubleArray_thenDoubleArraySizeIsZero() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateNoCrossResult =
        vectorFieldSecondOrderDifferentiator.differentiateNoCross(function);
    DoubleArray ofResult = DoubleArray.of();
    DoubleMatrix actualApplyResult = actualDifferentiateNoCrossResult.apply(ofResult);

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
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiateNoCross(Function)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   *   <li>Then filled three max is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * VectorFieldSecondOrderDifferentiator#differentiateNoCross(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiateNoCross(Function); given DoubleArray; then filled three max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function VectorFieldSecondOrderDifferentiator.differentiateNoCross(Function)"
  })
  void testDifferentiateNoCross_givenDoubleArray_thenFilledThreeMaxIsZero() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateNoCrossResult =
        vectorFieldSecondOrderDifferentiator.differentiateNoCross(function);
    DoubleArray filledResult = DoubleArray.filled(3);
    DoubleMatrix actualApplyResult = actualDifferentiateNoCrossResult.apply(filledResult);

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
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiateNoCross(Function)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then {@link DoubleArray} size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * VectorFieldSecondOrderDifferentiator#differentiateNoCross(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiateNoCross(Function); given filled three; then DoubleArray size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function VectorFieldSecondOrderDifferentiator.differentiateNoCross(Function)"
  })
  void testDifferentiateNoCross_givenFilledThree_thenDoubleArraySizeIsZero() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.filled(3));

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateNoCrossResult =
        vectorFieldSecondOrderDifferentiator.differentiateNoCross(function);
    DoubleArray ofResult = DoubleArray.of();
    DoubleMatrix actualApplyResult = actualDifferentiateNoCrossResult.apply(ofResult);

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
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiateNoCross(Function)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return apply filled three total is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * VectorFieldSecondOrderDifferentiator#differentiateNoCross(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiateNoCross(Function); given filled three; then return apply filled three total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function VectorFieldSecondOrderDifferentiator.differentiateNoCross(Function)"
  })
  void testDifferentiateNoCross_givenFilledThree_thenReturnApplyFilledThreeTotalIsZero() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    DoubleArray filledResult = DoubleArray.filled(3);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(filledResult);

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateNoCrossResult =
        vectorFieldSecondOrderDifferentiator.differentiateNoCross(function);
    DoubleArray filledResult2 = DoubleArray.filled(3);
    DoubleMatrix actualApplyResult = actualDifferentiateNoCrossResult.apply(filledResult2);

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
   * Test {@link VectorFieldSecondOrderDifferentiator#differentiateNoCross(Function)}.
   *
   * <ul>
   *   <li>Then {@link DoubleArray} with value is {@link Double#NaN} dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * VectorFieldSecondOrderDifferentiator#differentiateNoCross(Function)}
   */
  @Test
  @DisplayName(
      "Test differentiateNoCross(Function); then DoubleArray with value is NaN dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function VectorFieldSecondOrderDifferentiator.differentiateNoCross(Function)"
  })
  void testDifferentiateNoCross_thenDoubleArrayWithValueIsNaNDimensionsIsOne() {
    // Arrange
    VectorFieldSecondOrderDifferentiator vectorFieldSecondOrderDifferentiator =
        new VectorFieldSecondOrderDifferentiator();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    Function<DoubleArray, DoubleMatrix> actualDifferentiateNoCrossResult =
        vectorFieldSecondOrderDifferentiator.differentiateNoCross(function);
    DoubleArray ofResult = DoubleArray.of(Double.NaN);
    DoubleMatrix actualApplyResult = actualDifferentiateNoCrossResult.apply(ofResult);

    // Assert
    verify(function, atLeast(1)).apply(isA(DoubleArray.class));
    assertEquals(1, ofResult.dimensions());
    assertEquals(1, ofResult.size());
    assertEquals(1, ofResult.toList().size());
    assertFalse(ofResult.isEmpty());
    assertEquals(Double.NaN, ofResult.max());
    assertEquals(Double.NaN, ofResult.min());
    assertEquals(Double.NaN, ofResult.sum());
    assertSame(DoubleMatrix.EMPTY, actualApplyResult);
    assertArrayEquals(new double[] {Double.NaN}, ofResult.toArrayUnsafe(), 0.0);
  }
}
