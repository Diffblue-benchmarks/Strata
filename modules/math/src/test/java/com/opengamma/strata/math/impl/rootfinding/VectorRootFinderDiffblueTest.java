package com.opengamma.strata.math.impl.rootfinding;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.math.impl.function.ConcatenatedVectorFunction;
import com.opengamma.strata.math.impl.function.ParameterizedCurve;
import com.opengamma.strata.math.impl.function.ParameterizedCurveVectorFunction;
import com.opengamma.strata.math.impl.function.VectorFunction;
import com.opengamma.strata.math.impl.rootfinding.newton.BroydenVectorRootFinder;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class VectorRootFinderDiffblueTest {
  /**
   * Test {@link VectorRootFinder#getRoot(Function, DoubleArray[])} with {@code Function}, {@code
   * DoubleArray[]}.
   *
   * <ul>
   *   <li>Given filled three.
   * </ul>
   *
   * <p>Method under test: {@link VectorRootFinder#getRoot(Function, DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, DoubleArray[]) with 'Function', 'DoubleArray[]'; given filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray VectorRootFinder.getRoot(Function, DoubleArray[])"})
  void testGetRootWithFunctionDoubleArray_givenFilledThree() {
    // Arrange
    BroydenVectorRootFinder broydenVectorRootFinder = new BroydenVectorRootFinder();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.filled(3));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> broydenVectorRootFinder.getRoot(function, DoubleArray.of()));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link VectorRootFinder#getRoot(Function, DoubleArray[])} with {@code Function}, {@code
   * DoubleArray[]}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link VectorRootFinder#getRoot(Function, DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, DoubleArray[]) with 'Function', 'DoubleArray[]'; given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray VectorRootFinder.getRoot(Function, DoubleArray[])"})
  void testGetRootWithFunctionDoubleArray_givenIllegalArgumentException() {
    // Arrange
    BroydenVectorRootFinder broydenVectorRootFinder = new BroydenVectorRootFinder();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> broydenVectorRootFinder.getRoot(function, DoubleArray.of()));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link VectorRootFinder#getRoot(Function, DoubleArray[])} with {@code Function}, {@code
   * DoubleArray[]}.
   *
   * <ul>
   *   <li>When filled three.
   * </ul>
   *
   * <p>Method under test: {@link VectorRootFinder#getRoot(Function, DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, DoubleArray[]) with 'Function', 'DoubleArray[]'; when filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray VectorRootFinder.getRoot(Function, DoubleArray[])"})
  void testGetRootWithFunctionDoubleArray_whenFilledThree() {
    // Arrange
    BroydenVectorRootFinder broydenVectorRootFinder = new BroydenVectorRootFinder();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> broydenVectorRootFinder.getRoot(function, DoubleArray.filled(3)));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link VectorRootFinder#checkInputsAndApplyFunction(Function, DoubleArray)}.
   *
   * <p>Method under test: {@link VectorRootFinder#checkInputsAndApplyFunction(Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test checkInputsAndApplyFunction(Function, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray VectorRootFinder.checkInputsAndApplyFunction(Function, DoubleArray)"
  })
  void testCheckInputsAndApplyFunction() {
    // Arrange
    BroydenVectorRootFinder broydenVectorRootFinder = new BroydenVectorRootFinder();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.asFunctionOfArguments(Mockito.<DoubleArray>any())).thenReturn(function);
    ParameterizedCurveVectorFunction function2 =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> broydenVectorRootFinder.checkInputsAndApplyFunction(function2, DoubleArray.of()));
    verify(curve).asFunctionOfArguments(isA(DoubleArray.class));
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link VectorRootFinder#checkInputsAndApplyFunction(Function, DoubleArray)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link VectorRootFinder#checkInputsAndApplyFunction(Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test checkInputsAndApplyFunction(Function, DoubleArray); given DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray VectorRootFinder.checkInputsAndApplyFunction(Function, DoubleArray)"
  })
  void testCheckInputsAndApplyFunction_givenDoubleArray() {
    // Arrange
    BroydenVectorRootFinder broydenVectorRootFinder = new BroydenVectorRootFinder();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> broydenVectorRootFinder.checkInputsAndApplyFunction(function, DoubleArray.filled(3)));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link VectorRootFinder#checkInputsAndApplyFunction(Function, DoubleArray)}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link VectorRootFinder#checkInputsAndApplyFunction(Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test checkInputsAndApplyFunction(Function, DoubleArray); given DoubleArray; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray VectorRootFinder.checkInputsAndApplyFunction(Function, DoubleArray)"
  })
  void testCheckInputsAndApplyFunction_givenDoubleArray_thenReturnEmpty() {
    // Arrange
    BroydenVectorRootFinder broydenVectorRootFinder = new BroydenVectorRootFinder();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());

    // Act
    DoubleArray actualCheckInputsAndApplyFunctionResult =
        broydenVectorRootFinder.checkInputsAndApplyFunction(function, DoubleArray.of());

    // Assert
    verify(function).apply(isA(DoubleArray.class));
    assertSame(DoubleArray.EMPTY, actualCheckInputsAndApplyFunctionResult);
  }

  /**
   * Test {@link VectorRootFinder#checkInputsAndApplyFunction(Function, DoubleArray)}.
   *
   * <ul>
   *   <li>Given filled three.
   * </ul>
   *
   * <p>Method under test: {@link VectorRootFinder#checkInputsAndApplyFunction(Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test checkInputsAndApplyFunction(Function, DoubleArray); given filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray VectorRootFinder.checkInputsAndApplyFunction(Function, DoubleArray)"
  })
  void testCheckInputsAndApplyFunction_givenFilledThree() {
    // Arrange
    BroydenVectorRootFinder broydenVectorRootFinder = new BroydenVectorRootFinder();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.filled(3));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> broydenVectorRootFinder.checkInputsAndApplyFunction(function, DoubleArray.of()));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link VectorRootFinder#checkInputsAndApplyFunction(Function, DoubleArray)}.
   *
   * <ul>
   *   <li>Given filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link VectorRootFinder#checkInputsAndApplyFunction(Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test checkInputsAndApplyFunction(Function, DoubleArray); given filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray VectorRootFinder.checkInputsAndApplyFunction(Function, DoubleArray)"
  })
  void testCheckInputsAndApplyFunction_givenFilledThree_thenReturnFilledThree() {
    // Arrange
    BroydenVectorRootFinder broydenVectorRootFinder = new BroydenVectorRootFinder();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    DoubleArray filledResult = DoubleArray.filled(3);
    when(function.apply(Mockito.<DoubleArray>any())).thenReturn(filledResult);

    // Act
    DoubleArray actualCheckInputsAndApplyFunctionResult =
        broydenVectorRootFinder.checkInputsAndApplyFunction(function, DoubleArray.filled(3));

    // Assert
    verify(function).apply(isA(DoubleArray.class));
    assertSame(filledResult, actualCheckInputsAndApplyFunctionResult);
  }

  /**
   * Test {@link VectorRootFinder#checkInputsAndApplyFunction(Function, DoubleArray)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link VectorRootFinder#checkInputsAndApplyFunction(Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test checkInputsAndApplyFunction(Function, DoubleArray); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray VectorRootFinder.checkInputsAndApplyFunction(Function, DoubleArray)"
  })
  void testCheckInputsAndApplyFunction_givenIllegalArgumentException() {
    // Arrange
    BroydenVectorRootFinder broydenVectorRootFinder = new BroydenVectorRootFinder();

    Function<DoubleArray, DoubleArray> function = mock(Function.class);
    when(function.apply(Mockito.<DoubleArray>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> broydenVectorRootFinder.checkInputsAndApplyFunction(function, DoubleArray.of()));
    verify(function).apply(isA(DoubleArray.class));
  }

  /**
   * Test {@link VectorRootFinder#checkInputsAndApplyFunction(Function, DoubleArray)}.
   *
   * <ul>
   *   <li>Then calls {@link ParameterizedCurve#getNumberOfParameters()}.
   * </ul>
   *
   * <p>Method under test: {@link VectorRootFinder#checkInputsAndApplyFunction(Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test checkInputsAndApplyFunction(Function, DoubleArray); then calls getNumberOfParameters()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray VectorRootFinder.checkInputsAndApplyFunction(Function, DoubleArray)"
  })
  void testCheckInputsAndApplyFunction_thenCallsGetNumberOfParameters() {
    // Arrange
    BroydenVectorRootFinder broydenVectorRootFinder = new BroydenVectorRootFinder();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.getNumberOfParameters()).thenReturn(0);
    when(curve.asFunctionOfArguments(Mockito.<DoubleArray>any())).thenReturn(function);
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);
    VectorFunction[] functions = new VectorFunction[] {parameterizedCurveVectorFunction};
    ConcatenatedVectorFunction function2 = new ConcatenatedVectorFunction(functions);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> broydenVectorRootFinder.checkInputsAndApplyFunction(function2, DoubleArray.of()));
    verify(curve).asFunctionOfArguments(isA(DoubleArray.class));
    verify(curve).getNumberOfParameters();
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link VectorRootFinder#checkInputsAndApplyFunction(Function, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link VectorRootFinder#checkInputsAndApplyFunction(Function,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test checkInputsAndApplyFunction(Function, DoubleArray); when DoubleArray with value is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray VectorRootFinder.checkInputsAndApplyFunction(Function, DoubleArray)"
  })
  void testCheckInputsAndApplyFunction_whenDoubleArrayWithValueIsNaN() {
    // Arrange
    BroydenVectorRootFinder broydenVectorRootFinder = new BroydenVectorRootFinder();
    Function<DoubleArray, DoubleArray> function = mock(Function.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            broydenVectorRootFinder.checkInputsAndApplyFunction(
                function, DoubleArray.of(Double.NaN)));
  }
}
