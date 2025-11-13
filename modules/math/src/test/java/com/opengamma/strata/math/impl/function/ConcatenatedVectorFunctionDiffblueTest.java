package com.opengamma.strata.math.impl.function;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ConcatenatedVectorFunctionDiffblueTest {
  /**
   * Test {@link ConcatenatedVectorFunction#ConcatenatedVectorFunction(VectorFunction[])}.
   *
   * <p>Method under test: {@link
   * ConcatenatedVectorFunction#ConcatenatedVectorFunction(VectorFunction[])}
   */
  @Test
  @DisplayName("Test new ConcatenatedVectorFunction(VectorFunction[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ConcatenatedVectorFunction.<init>(VectorFunction[])"})
  void testNewConcatenatedVectorFunction() {
    // Arrange
    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.getNumberOfParameters()).thenReturn(10);
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);
    VectorFunction[] functions = new VectorFunction[] {parameterizedCurveVectorFunction};
    ConcatenatedVectorFunction concatenatedVectorFunction =
        new ConcatenatedVectorFunction(functions);
    VectorFunction[] functions2 = new VectorFunction[] {concatenatedVectorFunction};

    // Act
    ConcatenatedVectorFunction actualConcatenatedVectorFunction =
        new ConcatenatedVectorFunction(functions2);

    // Assert
    verify(curve).getNumberOfParameters();
    assertEquals(10, actualConcatenatedVectorFunction.getLengthOfDomain());
    assertEquals(4, actualConcatenatedVectorFunction.getLengthOfRange());
  }

  /**
   * Test {@link ConcatenatedVectorFunction#ConcatenatedVectorFunction(VectorFunction[])}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return LengthOfDomain is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * ConcatenatedVectorFunction#ConcatenatedVectorFunction(VectorFunction[])}
   */
  @Test
  @DisplayName(
      "Test new ConcatenatedVectorFunction(VectorFunction[]); given ten; then return LengthOfDomain is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ConcatenatedVectorFunction.<init>(VectorFunction[])"})
  void testNewConcatenatedVectorFunction_givenTen_thenReturnLengthOfDomainIsTen() {
    // Arrange
    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.getNumberOfParameters()).thenReturn(10);
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);
    VectorFunction[] functions = new VectorFunction[] {parameterizedCurveVectorFunction};

    // Act
    ConcatenatedVectorFunction actualConcatenatedVectorFunction =
        new ConcatenatedVectorFunction(functions);

    // Assert
    verify(curve).getNumberOfParameters();
    assertEquals(10, actualConcatenatedVectorFunction.getLengthOfDomain());
    assertEquals(4, actualConcatenatedVectorFunction.getLengthOfRange());
  }

  /**
   * Test {@link ConcatenatedVectorFunction#calculateJacobian(DoubleArray)}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link ConcatenatedVectorFunction#calculateJacobian(DoubleArray)}
   */
  @Test
  @DisplayName("Test calculateJacobian(DoubleArray); then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix ConcatenatedVectorFunction.calculateJacobian(DoubleArray)"})
  void testCalculateJacobian_thenReturnEmpty() {
    // Arrange
    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.getNumberOfParameters()).thenReturn(0);
    when(curve.getYParameterSensitivity(Mockito.<DoubleArray>any()))
        .thenReturn(mock(Function.class));
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);
    VectorFunction[] functions = new VectorFunction[] {parameterizedCurveVectorFunction};
    ConcatenatedVectorFunction concatenatedVectorFunction =
        new ConcatenatedVectorFunction(functions);

    // Act
    DoubleMatrix actualCalculateJacobianResult =
        concatenatedVectorFunction.calculateJacobian(DoubleArray.of());

    // Assert
    verify(curve).getYParameterSensitivity(isA(DoubleArray.class));
    verify(curve, atLeast(1)).getNumberOfParameters();
    assertSame(DoubleMatrix.EMPTY, actualCalculateJacobianResult);
  }

  /**
   * Test {@link ConcatenatedVectorFunction#apply(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>Given {@link Function} {@link Function#apply(Object)} return ten.
   *   <li>Then return dimensions is one.
   * </ul>
   *
   * <p>Method under test: {@link ConcatenatedVectorFunction#apply(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test apply(DoubleArray) with 'DoubleArray'; given Function apply(Object) return ten; then return dimensions is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray ConcatenatedVectorFunction.apply(DoubleArray)"})
  void testApplyWithDoubleArray_givenFunctionApplyReturnTen_thenReturnDimensionsIsOne() {
    // Arrange
    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.getNumberOfParameters()).thenReturn(0);
    when(curve.asFunctionOfArguments(Mockito.<DoubleArray>any())).thenReturn(function);
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);
    VectorFunction[] functions = new VectorFunction[] {parameterizedCurveVectorFunction};
    ConcatenatedVectorFunction concatenatedVectorFunction =
        new ConcatenatedVectorFunction(functions);

    // Act
    DoubleArray actualApplyResult = concatenatedVectorFunction.apply(DoubleArray.of());

    // Assert
    verify(curve).asFunctionOfArguments(isA(DoubleArray.class));
    verify(curve).getNumberOfParameters();
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(1, actualApplyResult.dimensions());
    assertEquals(10.0d, actualApplyResult.max());
    assertEquals(10.0d, actualApplyResult.min());
    List<Double> toListResult = actualApplyResult.toList();
    assertEquals(4, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(10.0d, toListResult.get(3).doubleValue());
    assertEquals(4, actualApplyResult.size());
    assertEquals(40.0d, actualApplyResult.sum());
    assertFalse(actualApplyResult.isEmpty());
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 10.0d, 10.0d}, actualApplyResult.toArrayUnsafe(), 0.0);
  }
}
