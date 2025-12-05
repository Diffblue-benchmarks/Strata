package com.opengamma.strata.math.impl.statistics.leastsquare;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
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
import com.opengamma.strata.math.MathException;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NonLinearLeastSquareWithPenaltyDiffblueTest {
  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, Function, DoubleArray,
   * DoubleMatrix)} with {@code observedValues}, {@code func}, {@code startPos}, {@code penalty}.
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, Function,
   * DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, Function, DoubleArray, DoubleMatrix) with 'observedValues', 'func', 'startPos', 'penalty'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, Function, DoubleArray, DoubleMatrix)"
  })
  void testSolveWithObservedValuesFuncStartPosPenalty() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());
    DoubleArray startPos = DoubleArray.of();

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, func, startPos, DoubleMatrix.of()));
    verify(func, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, Function, DoubleArray,
   * DoubleMatrix)} with {@code observedValues}, {@code func}, {@code startPos}, {@code penalty}.
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, Function,
   * DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, Function, DoubleArray, DoubleMatrix) with 'observedValues', 'func', 'startPos', 'penalty'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, Function, DoubleArray, DoubleMatrix)"
  })
  void testSolveWithObservedValuesFuncStartPosPenalty2() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));
    DoubleArray startPos = DoubleArray.of();

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, func, startPos, DoubleMatrix.of()));
    verify(func).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, Function, DoubleArray,
   * DoubleMatrix)} with {@code observedValues}, {@code func}, {@code startPos}, {@code penalty}.
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, Function,
   * DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, Function, DoubleArray, DoubleMatrix) with 'observedValues', 'func', 'startPos', 'penalty'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, Function, DoubleArray, DoubleMatrix)"
  })
  void testSolveWithObservedValuesFuncStartPosPenalty3() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.filled(3);

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.filled(3));
    DoubleArray startPos = DoubleArray.filled(3);
    DoubleMatrix penalty = DoubleMatrix.identity(3);

    // Act
    LeastSquareWithPenaltyResults actualSolveResult =
        nonLinearLeastSquareWithPenalty.solve(observedValues, func, startPos, penalty);

    // Assert
    verify(func, atLeast(1)).apply(Mockito.<DoubleArray>any());
    DoubleMatrix fittingParameterSensitivityToData =
        actualSolveResult.getFittingParameterSensitivityToData();
    assertEquals(0.0d, fittingParameterSensitivityToData.total());
    assertEquals(0.0d, actualSolveResult.getChiSq());
    assertEquals(0.0d, actualSolveResult.getPenalty());
    assertEquals(2, fittingParameterSensitivityToData.dimensions());
    double[][] toArrayUnsafeResult = fittingParameterSensitivityToData.toArrayUnsafe();
    assertEquals(3, toArrayUnsafeResult.length);
    assertEquals(9, fittingParameterSensitivityToData.size());
    assertFalse(fittingParameterSensitivityToData.isEmpty());
    assertTrue(fittingParameterSensitivityToData.isSquare());
    assertEquals(observedValues, actualSolveResult.getFitParameters());
    assertEquals(penalty, actualSolveResult.getCovariance());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, DoubleMatrix)} with {@code observedValues}, {@code sigma}, {@code func}, {@code
   * jac}, {@code startPos}, {@code penalty}.
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, Function, DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix) with 'observedValues', 'sigma', 'func', 'jac', 'startPos', 'penalty'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix)"
  })
  void testSolveWithObservedValuesSigmaFuncJacStartPosPenalty() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    when(jac.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());
    DoubleArray startPos = DoubleArray.of();

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, jac, startPos, DoubleMatrix.of()));
    verify(func).apply(isA(DoubleArray.class));
    verify(jac).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, DoubleMatrix)} with {@code observedValues}, {@code sigma}, {@code func}, {@code
   * jac}, {@code startPos}, {@code penalty}.
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, Function, DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix) with 'observedValues', 'sigma', 'func', 'jac', 'startPos', 'penalty'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix)"
  })
  void testSolveWithObservedValuesSigmaFuncJacStartPosPenalty2() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
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
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, jac, startPos, DoubleMatrix.of()));
    verify(func).apply(isA(DoubleArray.class));
    verify(jac).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, DoubleMatrix, Function)} with {@code observedValues}, {@code sigma}, {@code func},
   * {@code jac}, {@code startPos}, {@code penalty}, {@code allowedValue}.
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, Function, DoubleArray, DoubleMatrix, Function)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix, Function) with 'observedValues', 'sigma', 'func', 'jac', 'startPos', 'penalty', 'allowedValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix, Function)"
  })
  void testSolveWithObservedValuesSigmaFuncJacStartPosPenaltyAllowedValue() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    when(jac.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());
    DoubleArray startPos = DoubleArray.of();
    DoubleMatrix penalty = DoubleMatrix.of();

    Function<DoubleArray, Boolean> allowedValue = mock(Function.class);
    when(allowedValue.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, jac, startPos, penalty, allowedValue));
    verify(func).apply(isA(DoubleArray.class));
    verify(jac).apply(isA(DoubleArray.class));
    verify(allowedValue).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, DoubleMatrix, Function)} with {@code observedValues}, {@code sigma}, {@code func},
   * {@code jac}, {@code startPos}, {@code penalty}, {@code allowedValue}.
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, Function, DoubleArray, DoubleMatrix, Function)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix, Function) with 'observedValues', 'sigma', 'func', 'jac', 'startPos', 'penalty', 'allowedValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix, Function)"
  })
  void testSolveWithObservedValuesSigmaFuncJacStartPosPenaltyAllowedValue2() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    when(jac.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));
    DoubleArray startPos = DoubleArray.of();
    DoubleMatrix penalty = DoubleMatrix.of();

    Function<DoubleArray, Boolean> allowedValue = mock(Function.class);
    when(allowedValue.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, jac, startPos, penalty, allowedValue));
    verify(func).apply(isA(DoubleArray.class));
    verify(jac).apply(isA(DoubleArray.class));
    verify(allowedValue).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, DoubleMatrix, Function)} with {@code observedValues}, {@code sigma}, {@code func},
   * {@code jac}, {@code startPos}, {@code penalty}, {@code allowedValue}.
   *
   * <ul>
   *   <li>When {@link Function}.
   * </ul>
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, Function, DoubleArray, DoubleMatrix, Function)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix, Function) with 'observedValues', 'sigma', 'func', 'jac', 'startPos', 'penalty', 'allowedValue'; when Function")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix, Function)"
  })
  void testSolveWithObservedValuesSigmaFuncJacStartPosPenaltyAllowedValue_whenFunction() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();
    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    DoubleArray startPos = DoubleArray.of();
    DoubleMatrix penalty = DoubleMatrix.of();

    Function<DoubleArray, Boolean> allowedValue = mock(Function.class);
    when(allowedValue.apply(Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, jac, startPos, penalty, allowedValue));
    verify(allowedValue).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, DoubleMatrix, Function)} with {@code observedValues}, {@code sigma}, {@code func},
   * {@code jac}, {@code startPos}, {@code penalty}, {@code allowedValue}.
   *
   * <ul>
   *   <li>When {@link Function}.
   * </ul>
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, Function, DoubleArray, DoubleMatrix, Function)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix, Function) with 'observedValues', 'sigma', 'func', 'jac', 'startPos', 'penalty', 'allowedValue'; when Function")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix, Function)"
  })
  void testSolveWithObservedValuesSigmaFuncJacStartPosPenaltyAllowedValue_whenFunction2() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));
    Function<DoubleArray, DoubleMatrix> jac = mock(Function.class);
    DoubleArray startPos = DoubleArray.of();
    DoubleMatrix penalty = DoubleMatrix.of();

    Function<DoubleArray, Boolean> allowedValue = mock(Function.class);
    when(allowedValue.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, jac, startPos, penalty, allowedValue));
    verify(func).apply(isA(DoubleArray.class));
    verify(allowedValue).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function, Function,
   * DoubleArray, DoubleMatrix)} with {@code observedValues}, {@code sigma}, {@code func}, {@code
   * jac}, {@code startPos}, {@code penalty}.
   *
   * <ul>
   *   <li>When {@link Function}.
   * </ul>
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, Function, DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix) with 'observedValues', 'sigma', 'func', 'jac', 'startPos', 'penalty'; when Function")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, Function, DoubleArray, DoubleMatrix)"
  })
  void testSolveWithObservedValuesSigmaFuncJacStartPosPenalty_whenFunction() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
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
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, jac, startPos, DoubleMatrix.of()));
    verify(func).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function,
   * DoubleArray, DoubleMatrix)} with {@code observedValues}, {@code sigma}, {@code func}, {@code
   * startPos}, {@code penalty}.
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleMatrix) with 'observedValues', 'sigma', 'func', 'startPos', 'penalty'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleMatrix)"
  })
  void testSolveWithObservedValuesSigmaFuncStartPosPenalty() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());
    DoubleArray startPos = DoubleArray.of();

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, startPos, DoubleMatrix.of()));
    verify(func, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function,
   * DoubleArray, DoubleMatrix)} with {@code observedValues}, {@code sigma}, {@code func}, {@code
   * startPos}, {@code penalty}.
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleMatrix) with 'observedValues', 'sigma', 'func', 'startPos', 'penalty'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleMatrix)"
  })
  void testSolveWithObservedValuesSigmaFuncStartPosPenalty2() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));
    DoubleArray startPos = DoubleArray.of();

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, startPos, DoubleMatrix.of()));
    verify(func).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function,
   * DoubleArray, DoubleMatrix, Function)} with {@code observedValues}, {@code sigma}, {@code func},
   * {@code startPos}, {@code penalty}, {@code allowedValue}.
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, DoubleArray, DoubleMatrix, Function)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleMatrix, Function) with 'observedValues', 'sigma', 'func', 'startPos', 'penalty', 'allowedValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleMatrix, Function)"
  })
  void testSolveWithObservedValuesSigmaFuncStartPosPenaltyAllowedValue() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());
    DoubleArray startPos = DoubleArray.of();
    DoubleMatrix penalty = DoubleMatrix.of();

    Function<DoubleArray, Boolean> allowedValue = mock(Function.class);
    when(allowedValue.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, startPos, penalty, allowedValue));
    verify(allowedValue).apply(isA(DoubleArray.class));
    verify(func, atLeast(1)).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function,
   * DoubleArray, DoubleMatrix, Function)} with {@code observedValues}, {@code sigma}, {@code func},
   * {@code startPos}, {@code penalty}, {@code allowedValue}.
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, DoubleArray, DoubleMatrix, Function)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleMatrix, Function) with 'observedValues', 'sigma', 'func', 'startPos', 'penalty', 'allowedValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleMatrix, Function)"
  })
  void testSolveWithObservedValuesSigmaFuncStartPosPenaltyAllowedValue2() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();

    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    when(func.apply(Mockito.<DoubleArray>any())).thenThrow(new MathException("0123456789ABCDEF"));
    DoubleArray startPos = DoubleArray.of();
    DoubleMatrix penalty = DoubleMatrix.of();

    Function<DoubleArray, Boolean> allowedValue = mock(Function.class);
    when(allowedValue.apply(Mockito.<DoubleArray>any())).thenReturn(true);

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, startPos, penalty, allowedValue));
    verify(func).apply(isA(DoubleArray.class));
    verify(allowedValue).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray, Function,
   * DoubleArray, DoubleMatrix, Function)} with {@code observedValues}, {@code sigma}, {@code func},
   * {@code startPos}, {@code penalty}, {@code allowedValue}.
   *
   * <ul>
   *   <li>When {@link Function}.
   * </ul>
   *
   * <p>Method under test: {@link NonLinearLeastSquareWithPenalty#solve(DoubleArray, DoubleArray,
   * Function, DoubleArray, DoubleMatrix, Function)}
   */
  @Test
  @DisplayName(
      "Test solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleMatrix, Function) with 'observedValues', 'sigma', 'func', 'startPos', 'penalty', 'allowedValue'; when Function")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquareWithPenaltyResults NonLinearLeastSquareWithPenalty.solve(DoubleArray, DoubleArray, Function, DoubleArray, DoubleMatrix, Function)"
  })
  void testSolveWithObservedValuesSigmaFuncStartPosPenaltyAllowedValue_whenFunction() {
    // Arrange
    NonLinearLeastSquareWithPenalty nonLinearLeastSquareWithPenalty =
        new NonLinearLeastSquareWithPenalty();
    DoubleArray observedValues = DoubleArray.of();
    DoubleArray sigma = DoubleArray.of();
    Function<DoubleArray, DoubleArray> func = mock(Function.class);
    DoubleArray startPos = DoubleArray.of();
    DoubleMatrix penalty = DoubleMatrix.of();

    Function<DoubleArray, Boolean> allowedValue = mock(Function.class);
    when(allowedValue.apply(Mockito.<DoubleArray>any()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            nonLinearLeastSquareWithPenalty.solve(
                observedValues, sigma, func, startPos, penalty, allowedValue));
    verify(allowedValue).apply(isA(DoubleArray.class));
  }
}
