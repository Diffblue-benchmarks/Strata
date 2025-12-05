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

class ParameterizedCurveVectorFunctionDiffblueTest {
  /**
   * Test {@link ParameterizedCurveVectorFunction#ParameterizedCurveVectorFunction(double[],
   * ParameterizedCurve)}.
   *
   * <ul>
   *   <li>Then return LengthOfDomain is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ParameterizedCurveVectorFunction#ParameterizedCurveVectorFunction(double[],
   * ParameterizedCurve)}
   */
  @Test
  @DisplayName(
      "Test new ParameterizedCurveVectorFunction(double[], ParameterizedCurve); then return LengthOfDomain is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ParameterizedCurveVectorFunction.<init>(double[], ParameterizedCurve)"})
  void testNewParameterizedCurveVectorFunction_thenReturnLengthOfDomainIsZero() {
    // Arrange and Act
    ParameterizedCurveVectorFunction actualParameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, mock(ParameterizedCurve.class));

    // Assert
    assertEquals(0, actualParameterizedCurveVectorFunction.getLengthOfDomain());
    assertEquals(4, actualParameterizedCurveVectorFunction.getLengthOfRange());
  }

  /**
   * Test {@link ParameterizedCurveVectorFunction#calculateJacobian(DoubleArray)}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedCurveVectorFunction#calculateJacobian(DoubleArray)}
   */
  @Test
  @DisplayName("Test calculateJacobian(DoubleArray); then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix ParameterizedCurveVectorFunction.calculateJacobian(DoubleArray)"
  })
  void testCalculateJacobian_thenReturnEmpty() {
    // Arrange
    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.getNumberOfParameters()).thenReturn(0);
    when(curve.getYParameterSensitivity(Mockito.<DoubleArray>any()))
        .thenReturn(mock(Function.class));
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);

    // Act
    DoubleMatrix actualCalculateJacobianResult =
        parameterizedCurveVectorFunction.calculateJacobian(DoubleArray.of());

    // Assert
    verify(curve).getYParameterSensitivity(isA(DoubleArray.class));
    verify(curve).getNumberOfParameters();
    assertSame(DoubleMatrix.EMPTY, actualCalculateJacobianResult);
  }

  /**
   * Test {@link ParameterizedCurveVectorFunction#calculateJacobian(DoubleArray)}.
   *
   * <ul>
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedCurveVectorFunction#calculateJacobian(DoubleArray)}
   */
  @Test
  @DisplayName("Test calculateJacobian(DoubleArray); then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix ParameterizedCurveVectorFunction.calculateJacobian(DoubleArray)"
  })
  void testCalculateJacobian_thenReturnSizeIsFour() {
    // Arrange
    Function<Double, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(DoubleArray.of(10.0d));

    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.getNumberOfParameters()).thenReturn(1);
    when(curve.getYParameterSensitivity(Mockito.<DoubleArray>any())).thenReturn(function);
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);

    // Act
    DoubleMatrix actualCalculateJacobianResult =
        parameterizedCurveVectorFunction.calculateJacobian(DoubleArray.of());

    // Assert
    verify(curve).getYParameterSensitivity(isA(DoubleArray.class));
    verify(curve).getNumberOfParameters();
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(4, actualCalculateJacobianResult.size());
    double[][] toArrayUnsafeResult = actualCalculateJacobianResult.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertEquals(40.0d, actualCalculateJacobianResult.total());
    assertFalse(actualCalculateJacobianResult.isEmpty());
    assertFalse(actualCalculateJacobianResult.isSquare());
    double[] doubleArray = toArrayUnsafeResult[0];
    assertSame(doubleArray, toArrayUnsafeResult[1]);
    assertSame(doubleArray, toArrayUnsafeResult[2]);
    assertSame(doubleArray, toArrayUnsafeResult[3]);
    assertArrayEquals(new double[] {10.0d}, doubleArray, 0.0);
  }

  /**
   * Test {@link ParameterizedCurveVectorFunction#getLengthOfDomain()}.
   *
   * <p>Method under test: {@link ParameterizedCurveVectorFunction#getLengthOfDomain()}
   */
  @Test
  @DisplayName("Test getLengthOfDomain()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ParameterizedCurveVectorFunction.getLengthOfDomain()"})
  void testGetLengthOfDomain() {
    // Arrange
    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.getNumberOfParameters()).thenReturn(10);
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);

    // Act
    int actualLengthOfDomain = parameterizedCurveVectorFunction.getLengthOfDomain();

    // Assert
    verify(curve).getNumberOfParameters();
    assertEquals(10, actualLengthOfDomain);
  }

  /**
   * Test {@link ParameterizedCurveVectorFunction#getLengthOfRange()}.
   *
   * <p>Method under test: {@link ParameterizedCurveVectorFunction#getLengthOfRange()}
   */
  @Test
  @DisplayName("Test getLengthOfRange()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ParameterizedCurveVectorFunction.getLengthOfRange()"})
  void testGetLengthOfRange() {
    // Arrange
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d}, mock(ParameterizedCurve.class));

    // Act and Assert
    assertEquals(4, parameterizedCurveVectorFunction.getLengthOfRange());
  }

  /**
   * Test {@link ParameterizedCurveVectorFunction#apply(DoubleArray)} with {@code DoubleArray}.
   *
   * <p>Method under test: {@link ParameterizedCurveVectorFunction#apply(DoubleArray)}
   */
  @Test
  @DisplayName("Test apply(DoubleArray) with 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray ParameterizedCurveVectorFunction.apply(DoubleArray)"})
  void testApplyWithDoubleArray() {
    // Arrange
    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.asFunctionOfArguments(Mockito.<DoubleArray>any())).thenReturn(function);
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);

    // Act
    DoubleArray actualApplyResult = parameterizedCurveVectorFunction.apply(DoubleArray.of());

    // Assert
    verify(curve).asFunctionOfArguments(isA(DoubleArray.class));
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
