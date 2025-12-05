package com.opengamma.strata.math.impl.statistics.leastsquare;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.MathException;
import com.opengamma.strata.math.impl.function.ParameterizedFunction;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NonLinearLeastSquareDiffblueTest {
  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double, ParameterizedFunction,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code double}, {@code
   * ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double,
   * ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, double, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'double', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, double, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayDoubleParameterizedFunctionDoubleArray() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(10.0d);

    // Act
    LeastSquareResults actualSolveResult =
        nonLinearLeastSquare.solve(x, y, 10.0d, func, DoubleArray.filled(3));

    // Assert
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3.0d, actualSolveResult.getChiSq());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double, ParameterizedFunction,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code double}, {@code
   * ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double,
   * ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, double, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'double', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, double, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayDoubleParameterizedFunctionDoubleArray2() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(10.0d);
    DoubleArray startPos = DoubleArray.of(1.0E-5d);

    // Act
    LeastSquareResults actualSolveResult = nonLinearLeastSquare.solve(x, y, 10.0d, func, startPos);

    // Assert
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
    DoubleMatrix fittingParameterSensitivityToData =
        actualSolveResult.getFittingParameterSensitivityToData();
    assertEquals(0.0d, fittingParameterSensitivityToData.total());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(1, covariance.size());
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = fittingParameterSensitivityToData.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult2.length);
    assertEquals(2, fittingParameterSensitivityToData.dimensions());
    assertEquals(3, fittingParameterSensitivityToData.size());
    assertFalse(fittingParameterSensitivityToData.isEmpty());
    assertFalse(fittingParameterSensitivityToData.isSquare());
    assertEquals(startPos, actualSolveResult.getFitParameters());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double, ParameterizedFunction,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code double}, {@code
   * ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double,
   * ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, double, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'double', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, double, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayDoubleParameterizedFunctionDoubleArray3() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(10.0d);

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> nonLinearLeastSquare.solve(x, y, 0.0d, func, DoubleArray.filled(3)));
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double, ParameterizedFunction,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code double}, {@code
   * ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double,
   * ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, double, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'double', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, double, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayDoubleParameterizedFunctionDoubleArray4() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(1.0E-5d);

    // Act
    LeastSquareResults actualSolveResult =
        nonLinearLeastSquare.solve(x, y, 10.0d, func, DoubleArray.filled(3));

    // Assert
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3.000000000000001E-12d, actualSolveResult.getChiSq());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double, ParameterizedFunction,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code double}, {@code
   * ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double,
   * ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, double, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'double', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, double, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayDoubleParameterizedFunctionDoubleArray5() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(0.0d);
    DoubleArray startPos = DoubleArray.filled(3);

    // Act
    LeastSquareResults actualSolveResult = nonLinearLeastSquare.solve(x, y, 10.0d, func, startPos);

    // Assert
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
    assertEquals(0.0d, actualSolveResult.getChiSq());
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertSame(startPos, actualSolveResult.getFitParameters());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double, ParameterizedFunction,
   * ParameterizedFunction, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code
   * double}, {@code ParameterizedFunction}, {@code ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double,
   * ParameterizedFunction, ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, double, ParameterizedFunction, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'double', 'ParameterizedFunction', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, double, ParameterizedFunction, ParameterizedFunction, DoubleArray)"
  })
  void
      testSolveWithDoubleArrayDoubleArrayDoubleParameterizedFunctionParameterizedFunctionDoubleArray() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(10.0d);

    ParameterizedFunction<Double, DoubleArray, DoubleArray> grad =
        mock(ParameterizedFunction.class);
    when(grad.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.filled(3));

    // Act
    LeastSquareResults actualSolveResult =
        nonLinearLeastSquare.solve(x, y, 10.0d, func, grad, DoubleArray.filled(3));

    // Assert
    verify(grad, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3.0d, actualSolveResult.getChiSq());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double, ParameterizedFunction,
   * ParameterizedFunction, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code
   * double}, {@code ParameterizedFunction}, {@code ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double,
   * ParameterizedFunction, ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, double, ParameterizedFunction, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'double', 'ParameterizedFunction', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, double, ParameterizedFunction, ParameterizedFunction, DoubleArray)"
  })
  void
      testSolveWithDoubleArrayDoubleArrayDoubleParameterizedFunctionParameterizedFunctionDoubleArray2() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(10.0d);

    ParameterizedFunction<Double, DoubleArray, DoubleArray> grad =
        mock(ParameterizedFunction.class);
    when(grad.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.filled(3));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> nonLinearLeastSquare.solve(x, y, 0.0d, func, grad, DoubleArray.filled(3)));
    verify(grad, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    verify(func, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double, ParameterizedFunction,
   * ParameterizedFunction, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code
   * double}, {@code ParameterizedFunction}, {@code ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double,
   * ParameterizedFunction, ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, double, ParameterizedFunction, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'double', 'ParameterizedFunction', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, double, ParameterizedFunction, ParameterizedFunction, DoubleArray)"
  })
  void
      testSolveWithDoubleArrayDoubleArrayDoubleParameterizedFunctionParameterizedFunctionDoubleArray3() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(1.0E-8d);

    ParameterizedFunction<Double, DoubleArray, DoubleArray> grad =
        mock(ParameterizedFunction.class);
    when(grad.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.filled(3));

    // Act
    LeastSquareResults actualSolveResult =
        nonLinearLeastSquare.solve(x, y, 10.0d, func, grad, DoubleArray.filled(3));

    // Assert
    verify(grad, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    verify(func, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3.0000000000000002E-18d, actualSolveResult.getChiSq());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double, ParameterizedFunction,
   * ParameterizedFunction, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code
   * double}, {@code ParameterizedFunction}, {@code ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, double,
   * ParameterizedFunction, ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, double, ParameterizedFunction, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'double', 'ParameterizedFunction', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, double, ParameterizedFunction, ParameterizedFunction, DoubleArray)"
  })
  void
      testSolveWithDoubleArrayDoubleArrayDoubleParameterizedFunctionParameterizedFunctionDoubleArray4() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(0.0d);

    ParameterizedFunction<Double, DoubleArray, DoubleArray> grad =
        mock(ParameterizedFunction.class);
    when(grad.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.filled(3));
    DoubleArray startPos = DoubleArray.filled(3);

    // Act
    LeastSquareResults actualSolveResult =
        nonLinearLeastSquare.solve(x, y, 10.0d, func, grad, startPos);

    // Assert
    verify(grad, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    verify(func, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    assertEquals(0.0d, actualSolveResult.getChiSq());
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertSame(startPos, actualSolveResult.getFitParameters());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function, DoubleArray)} with
   * {@code DoubleArray}, {@code DoubleArray}, {@code Function}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, DoubleArray) with 'DoubleArray', 'DoubleArray', 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, Function, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayFunctionDoubleArray() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> nonLinearLeastSquare.solve(observedValues, sigma, func, DoubleArray.of()));
    verify(func).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function, DoubleArray,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code Function}, {@code
   * DoubleArray}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleArray) with 'DoubleArray', 'DoubleArray', 'Function', 'DoubleArray', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayFunctionDoubleArrayDoubleArray() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));
    DoubleArray startPos = DoubleArray.of();

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> nonLinearLeastSquare.solve(observedValues, sigma, func, startPos, DoubleArray.of()));
    verify(func).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code Function}, {@code
   * Function}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function,
   * Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray) with 'DoubleArray', 'DoubleArray', 'Function', 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayFunctionFunctionDoubleArray() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    when(jac.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> nonLinearLeastSquare.solve(observedValues, sigma, func, jac, DoubleArray.of()));
    verify(func).apply(isA(DoubleArray.class));
    verify(jac).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code Function},
   * {@code Function}, {@code DoubleArray}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function,
   * Function, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleArray) with 'DoubleArray', 'DoubleArray', 'Function', 'Function', 'DoubleArray', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayFunctionFunctionDoubleArrayDoubleArray() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));
    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    DoubleArray startPos = DoubleArray.of();

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquare.solve(
                observedValues, sigma, func, jac, startPos, DoubleArray.of()));
    verify(func).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code Function},
   * {@code Function}, {@code DoubleArray}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function,
   * Function, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleArray) with 'DoubleArray', 'DoubleArray', 'Function', 'Function', 'DoubleArray', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayFunctionFunctionDoubleArrayDoubleArray2() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    when(jac.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));
    DoubleArray startPos = DoubleArray.of();

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquare.solve(
                observedValues, sigma, func, jac, startPos, DoubleArray.of()));
    verify(func).apply(isA(DoubleArray.class));
    verify(jac).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, Function, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code
   * Function}, {@code Function}, {@code DoubleArray}, {@code Function}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function,
   * Function, DoubleArray, Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, Function, DoubleArray) with 'DoubleArray', 'DoubleArray', 'Function', 'Function', 'DoubleArray', 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, Function, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayFunctionFunctionDoubleArrayFunctionDoubleArray() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();
    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    DoubleArray startPos = DoubleArray.of();

    Function<DoubleArray, Boolean> constraints = mock(Function.class);
    when(constraints.apply(Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquare.solve(
                observedValues, sigma, func, jac, startPos, constraints, DoubleArray.of()));
    verify(constraints).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, Function, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code
   * Function}, {@code Function}, {@code DoubleArray}, {@code Function}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function,
   * Function, DoubleArray, Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, Function, DoubleArray) with 'DoubleArray', 'DoubleArray', 'Function', 'Function', 'DoubleArray', 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, Function, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayFunctionFunctionDoubleArrayFunctionDoubleArray2() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));
    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    DoubleArray startPos = DoubleArray.of();

    Function<DoubleArray, Boolean> constraints = mock(Function.class);
    when(constraints.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquare.solve(
                observedValues, sigma, func, jac, startPos, constraints, DoubleArray.of()));
    verify(func).apply(isA(DoubleArray.class));
    verify(constraints).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, Function, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code
   * Function}, {@code Function}, {@code DoubleArray}, {@code Function}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function,
   * Function, DoubleArray, Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, Function, DoubleArray) with 'DoubleArray', 'DoubleArray', 'Function', 'Function', 'DoubleArray', 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, Function, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayFunctionFunctionDoubleArrayFunctionDoubleArray3() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    when(jac.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));
    DoubleArray startPos = DoubleArray.of();

    Function<DoubleArray, Boolean> constraints = mock(Function.class);
    when(constraints.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquare.solve(
                observedValues, sigma, func, jac, startPos, constraints, DoubleArray.of()));
    verify(func).apply(isA(DoubleArray.class));
    verify(jac).apply(isA(DoubleArray.class));
    verify(constraints).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code Function}, {@code
   * Function}, {@code DoubleArray}.
   *
   * <ul>
   *   <li>When {@link Function}.
   * </ul>
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, Function,
   * Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray) with 'DoubleArray', 'DoubleArray', 'Function', 'Function', 'DoubleArray'; when Function")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayFunctionFunctionDoubleArray_whenFunction() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));
    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> nonLinearLeastSquare.solve(observedValues, sigma, func, jac, DoubleArray.of()));
    verify(func).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, ParameterizedFunction,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code ParameterizedFunction},
   * {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray,
   * ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayParameterizedFunctionDoubleArray() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(10.0d);

    // Act
    LeastSquareResults actualSolveResult =
        nonLinearLeastSquare.solve(x, y, func, DoubleArray.filled(3));

    // Assert
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(300.0d, actualSolveResult.getChiSq());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, ParameterizedFunction,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code ParameterizedFunction},
   * {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray,
   * ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayParameterizedFunctionDoubleArray2() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(10.0d);
    DoubleArray startPos = DoubleArray.of(1.0d);

    // Act
    LeastSquareResults actualSolveResult = nonLinearLeastSquare.solve(x, y, func, startPos);

    // Assert
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
    DoubleMatrix fittingParameterSensitivityToData =
        actualSolveResult.getFittingParameterSensitivityToData();
    assertEquals(0.0d, fittingParameterSensitivityToData.total());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(1, covariance.size());
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    double[][] toArrayUnsafeResult2 = fittingParameterSensitivityToData.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult2.length);
    assertEquals(2, fittingParameterSensitivityToData.dimensions());
    assertEquals(3, fittingParameterSensitivityToData.size());
    assertFalse(fittingParameterSensitivityToData.isEmpty());
    assertFalse(fittingParameterSensitivityToData.isSquare());
    assertEquals(startPos, actualSolveResult.getFitParameters());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult2[0], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, ParameterizedFunction,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code ParameterizedFunction},
   * {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray,
   * ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayParameterizedFunctionDoubleArray3() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(1.0E-5d);

    // Act
    LeastSquareResults actualSolveResult =
        nonLinearLeastSquare.solve(x, y, func, DoubleArray.filled(3));

    // Assert
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3.0000000000000005E-10d, actualSolveResult.getChiSq());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, ParameterizedFunction,
   * DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code ParameterizedFunction},
   * {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray,
   * ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayParameterizedFunctionDoubleArray4() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(0.0d);
    DoubleArray startPos = DoubleArray.filled(3);

    // Act
    LeastSquareResults actualSolveResult = nonLinearLeastSquare.solve(x, y, func, startPos);

    // Assert
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
    assertEquals(0.0d, actualSolveResult.getChiSq());
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertSame(startPos, actualSolveResult.getFitParameters());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, ParameterizedFunction,
   * ParameterizedFunction, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code
   * ParameterizedFunction}, {@code ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray,
   * ParameterizedFunction, ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, ParameterizedFunction, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'ParameterizedFunction', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, ParameterizedFunction, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayParameterizedFunctionParameterizedFunctionDoubleArray() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(10.0d);

    ParameterizedFunction<Double, DoubleArray, DoubleArray> grad =
        mock(ParameterizedFunction.class);
    when(grad.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.filled(3));

    // Act
    LeastSquareResults actualSolveResult =
        nonLinearLeastSquare.solve(x, y, func, grad, DoubleArray.filled(3));

    // Assert
    verify(grad, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(300.0d, actualSolveResult.getChiSq());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, ParameterizedFunction,
   * ParameterizedFunction, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code
   * ParameterizedFunction}, {@code ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray,
   * ParameterizedFunction, ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, ParameterizedFunction, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'ParameterizedFunction', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, ParameterizedFunction, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayParameterizedFunctionParameterizedFunctionDoubleArray2() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(1.0E-8d);

    ParameterizedFunction<Double, DoubleArray, DoubleArray> grad =
        mock(ParameterizedFunction.class);
    when(grad.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.filled(3));

    // Act
    LeastSquareResults actualSolveResult =
        nonLinearLeastSquare.solve(x, y, func, grad, DoubleArray.filled(3));

    // Assert
    verify(grad, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    verify(func, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(3.0000000000000004E-16d, actualSolveResult.getChiSq());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, ParameterizedFunction,
   * ParameterizedFunction, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code
   * ParameterizedFunction}, {@code ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray,
   * ParameterizedFunction, ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, ParameterizedFunction, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'ParameterizedFunction', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, ParameterizedFunction, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayParameterizedFunctionParameterizedFunctionDoubleArray3() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(0.0d);

    ParameterizedFunction<Double, DoubleArray, DoubleArray> grad =
        mock(ParameterizedFunction.class);
    when(grad.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.filled(3));
    DoubleArray startPos = DoubleArray.filled(3);

    // Act
    LeastSquareResults actualSolveResult = nonLinearLeastSquare.solve(x, y, func, grad, startPos);

    // Assert
    verify(grad, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    verify(func, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    assertEquals(0.0d, actualSolveResult.getChiSq());
    double[][] toArrayUnsafeResult = actualSolveResult.getCovariance().toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertSame(startPos, actualSolveResult.getFitParameters());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray, ParameterizedFunction,
   * ParameterizedFunction, DoubleArray)} with {@code DoubleArray}, {@code DoubleArray}, {@code
   * ParameterizedFunction}, {@code ParameterizedFunction}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, DoubleArray,
   * ParameterizedFunction, ParameterizedFunction, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, ParameterizedFunction, ParameterizedFunction, DoubleArray) with 'DoubleArray', 'DoubleArray', 'ParameterizedFunction', 'ParameterizedFunction', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, DoubleArray, ParameterizedFunction, ParameterizedFunction, DoubleArray)"
  })
  void testSolveWithDoubleArrayDoubleArrayParameterizedFunctionParameterizedFunctionDoubleArray4() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray x = DoubleArray.filled(3);
    DoubleArray y = DoubleArray.filled(3);

    ParameterizedFunction<Double, DoubleArray, Double> func = mock(ParameterizedFunction.class);
    when(func.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any())).thenReturn(Double.NaN);

    ParameterizedFunction<Double, DoubleArray, DoubleArray> grad =
        mock(ParameterizedFunction.class);
    when(grad.evaluate(Mockito.<Double>any(), Mockito.<DoubleArray>any()))
        .thenReturn(DoubleArray.filled(3));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> nonLinearLeastSquare.solve(x, y, func, grad, DoubleArray.filled(3)));
    verify(grad, atLeast(1)).evaluate(eq(0.0d), isA(DoubleArray.class));
    verify(func, atLeast(1)).evaluate(eq(0.0d), Mockito.<DoubleArray>any());
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, Function, DoubleArray)} with {@code
   * DoubleArray}, {@code Function}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, Function, DoubleArray) with 'DoubleArray', 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, Function, DoubleArray)"
  })
  void testSolveWithDoubleArrayFunctionDoubleArray() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> nonLinearLeastSquare.solve(observedValues, func, DoubleArray.of()));
    verify(func).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, Function, DoubleArray)} with {@code
   * DoubleArray}, {@code Function}, {@code DoubleArray}.
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, Function, DoubleArray) with 'DoubleArray', 'Function', 'DoubleArray'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, Function, DoubleArray)"
  })
  void testSolveWithDoubleArrayFunctionDoubleArray2() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.filled(3);

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.filled(3));
    DoubleArray startPos = DoubleArray.of(1.0E-5d);

    // Act
    LeastSquareResults actualSolveResult =
        nonLinearLeastSquare.solve(observedValues, func, startPos);

    // Assert
    verify(func, atLeast(1)).apply(Mockito.<DoubleArray>any());
    DoubleMatrix fittingParameterSensitivityToData =
        actualSolveResult.getFittingParameterSensitivityToData();
    assertEquals(0.0d, fittingParameterSensitivityToData.total());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(1, covariance.size());
    assertEquals(1, covariance.toArrayUnsafe().length);
    assertEquals(1, fittingParameterSensitivityToData.toArrayUnsafe().length);
    assertEquals(2, fittingParameterSensitivityToData.dimensions());
    assertEquals(3, fittingParameterSensitivityToData.size());
    assertFalse(fittingParameterSensitivityToData.isEmpty());
    assertFalse(fittingParameterSensitivityToData.isSquare());
    assertSame(startPos, actualSolveResult.getFitParameters());
  }

  /**
   * Test {@link NonLinearLeastSquare#solve(DoubleArray, Function, DoubleArray)} with {@code
   * DoubleArray}, {@code Function}, {@code DoubleArray}.
   *
   * <ul>
   *   <li>Then return array length is three.
   * </ul>
   *
   * <p>Method under test: {@link NonLinearLeastSquare#solve(DoubleArray, Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, Function, DoubleArray) with 'DoubleArray', 'Function', 'DoubleArray'; then return array length is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareResults NonLinearLeastSquare.solve(DoubleArray, Function, DoubleArray)"
  })
  void testSolveWithDoubleArrayFunctionDoubleArray_thenReturnArrayLengthIsThree() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray observedValues = DoubleArray.filled(3);

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.filled(3));
    DoubleArray startPos = DoubleArray.filled(3);

    // Act
    LeastSquareResults actualSolveResult =
        nonLinearLeastSquare.solve(observedValues, func, startPos);

    // Assert
    verify(func, atLeast(1)).apply(Mockito.<DoubleArray>any());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, covariance.size());
    assertEquals(covariance, actualSolveResult.getFittingParameterSensitivityToData());
    assertSame(startPos, actualSolveResult.getFitParameters());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquare#calInverseJacobian(DoubleArray, Function, Function,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>Given {@link MathException#MathException(String)} with message is {@code
   *       0123456789ABCDEF}.
   * </ul>
   *
   * <p>Method under test: {@link NonLinearLeastSquare#calInverseJacobian(DoubleArray, Function,
   * Function, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test calInverseJacobian(DoubleArray, Function, Function, DoubleArray); given MathException(String) with message is '0123456789ABCDEF'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix NonLinearLeastSquare.calInverseJacobian(DoubleArray, Function, Function, DoubleArray)"
  })
  void testCalInverseJacobian_givenMathExceptionWithMessageIs0123456789abcdef() {
    // Arrange
    NonLinearLeastSquare nonLinearLeastSquare = new NonLinearLeastSquare();
    DoubleArray sigma = DoubleArray.of();
    Function<DoubleArray, DoubleArray> func = mock(Function.class);

    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    when(jac.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> nonLinearLeastSquare.calInverseJacobian(sigma, func, jac, DoubleArray.of()));
    verify(jac).apply(isA(DoubleArray.class));
  }
}
