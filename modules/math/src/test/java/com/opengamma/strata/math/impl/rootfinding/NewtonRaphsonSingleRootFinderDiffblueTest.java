package com.opengamma.strata.math.impl.rootfinding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.MathException;
import com.opengamma.strata.math.impl.function.DoubleFunction1D;
import com.opengamma.strata.math.impl.function.RealPolynomialFunction1D;
import com.opengamma.strata.math.impl.function.special.IncompleteBetaFunction;
import com.opengamma.strata.math.impl.function.special.InverseIncompleteBetaFunction;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class NewtonRaphsonSingleRootFinderDiffblueTest {
  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, Double)} with {@code
   * DoubleFunction1D}, {@code Double}.
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, Double)}
   */
  @Test
  @DisplayName("Test getRoot(DoubleFunction1D, Double) with 'DoubleFunction1D', 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double NewtonRaphsonSingleRootFinder.getRoot(DoubleFunction1D, Double)"})
  void testGetRootWithDoubleFunction1DDouble() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    DoubleFunction1D doubleFunction1D = mock(DoubleFunction1D.class);
    when(doubleFunction1D.applyAsDouble(anyDouble()))
        .thenThrow(new MathException("0123456789ABCDEF"));

    DoubleFunction1D function = mock(DoubleFunction1D.class);
    when(function.applyAsDouble(anyDouble())).thenReturn(10.0d);
    when(function.derivative()).thenReturn(doubleFunction1D);

    // Act and Assert
    assertThrows(MathException.class, () -> newtonRaphsonSingleRootFinder.getRoot(function, 2.0d));
    verify(function).derivative();
    verify(function).applyAsDouble(2.0d);
    verify(doubleFunction1D).applyAsDouble(2.0d);
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, Double, Double)} with
   * {@code DoubleFunction1D}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, Double,
   * Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(DoubleFunction1D, Double, Double) with 'DoubleFunction1D', 'Double', 'Double'; given zero; then return doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double NewtonRaphsonSingleRootFinder.getRoot(DoubleFunction1D, Double, Double)"
  })
  void testGetRootWithDoubleFunction1DDoubleDouble_givenZero_thenReturnDoubleValueIsOne() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    DoubleFunction1D function = mock(DoubleFunction1D.class);
    when(function.applyAsDouble(anyDouble())).thenReturn(0.0d);
    when(function.derivative()).thenReturn(mock(DoubleFunction1D.class));

    // Act
    Double actualRoot = newtonRaphsonSingleRootFinder.getRoot(function, 1.0d, 10.0d);

    // Assert
    verify(function).derivative();
    verify(function, atLeast(1)).applyAsDouble(anyDouble());
    assertEquals(1.0d, actualRoot.doubleValue());
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, DoubleFunction1D, Double)}
   * with {@code DoubleFunction1D}, {@code DoubleFunction1D}, {@code Double}.
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D,
   * DoubleFunction1D, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(DoubleFunction1D, DoubleFunction1D, Double) with 'DoubleFunction1D', 'DoubleFunction1D', 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double NewtonRaphsonSingleRootFinder.getRoot(DoubleFunction1D, DoubleFunction1D, Double)"
  })
  void testGetRootWithDoubleFunction1DDoubleFunction1DDouble() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    DoubleFunction1D function = mock(DoubleFunction1D.class);
    when(function.applyAsDouble(anyDouble())).thenReturn(1.0E-12d);

    DoubleFunction1D derivative = mock(DoubleFunction1D.class);
    when(derivative.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    Double actualRoot = newtonRaphsonSingleRootFinder.getRoot(function, derivative, 2.0d);

    // Assert
    verify(function).applyAsDouble(2.0d);
    verify(derivative).applyAsDouble(2.0d);
    assertEquals(1.9999999999999d, actualRoot.doubleValue());
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, DoubleFunction1D, Double)}
   * with {@code DoubleFunction1D}, {@code DoubleFunction1D}, {@code Double}.
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D,
   * DoubleFunction1D, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(DoubleFunction1D, DoubleFunction1D, Double) with 'DoubleFunction1D', 'DoubleFunction1D', 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double NewtonRaphsonSingleRootFinder.getRoot(DoubleFunction1D, DoubleFunction1D, Double)"
  })
  void testGetRootWithDoubleFunction1DDoubleFunction1DDouble2() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    DoubleFunction1D function = mock(DoubleFunction1D.class);
    when(function.applyAsDouble(anyDouble())).thenReturn(10.0d);
    RealPolynomialFunction1D derivative =
        new RealPolynomialFunction1D(
            1.0E-12d,
            0.19999999999999998d,
            1.0E-12d,
            0.19999999999999998d,
            1.0E-12d,
            0.19999999999999998d,
            1.0E-12d,
            0.19999999999999998d,
            1.0E-12d,
            0.19999999999999998d,
            1.0E-12d,
            0.19999999999999998d);

    // Act
    Double actualRoot = newtonRaphsonSingleRootFinder.getRoot(function, derivative, 2.0d);

    // Assert
    verify(function, atLeast(1)).applyAsDouble(anyDouble());
    assertEquals(-18.310286507160342d, actualRoot.doubleValue());
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, DoubleFunction1D, Double)}
   * with {@code DoubleFunction1D}, {@code DoubleFunction1D}, {@code Double}.
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D,
   * DoubleFunction1D, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(DoubleFunction1D, DoubleFunction1D, Double) with 'DoubleFunction1D', 'DoubleFunction1D', 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double NewtonRaphsonSingleRootFinder.getRoot(DoubleFunction1D, DoubleFunction1D, Double)"
  })
  void testGetRootWithDoubleFunction1DDoubleFunction1DDouble3() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();
    RealPolynomialFunction1D function =
        new RealPolynomialFunction1D(
            1.0E-12d,
            0.19999999999999998d,
            1.0E-12d,
            0.19999999999999998d,
            1.0E-12d,
            0.19999999999999998d,
            1.0E-12d,
            0.19999999999999998d);

    DoubleFunction1D derivative = mock(DoubleFunction1D.class);
    when(derivative.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    Double actualRoot = newtonRaphsonSingleRootFinder.getRoot(function, derivative, 2.0d);

    // Assert
    verify(derivative, atLeast(1)).applyAsDouble(anyDouble());
    assertEquals(-5.3484694794502165E-11d, actualRoot.doubleValue());
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, DoubleFunction1D, Double,
   * Double)} with {@code DoubleFunction1D}, {@code DoubleFunction1D}, {@code Double}, {@code
   * Double}.
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D,
   * DoubleFunction1D, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(DoubleFunction1D, DoubleFunction1D, Double, Double) with 'DoubleFunction1D', 'DoubleFunction1D', 'Double', 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double NewtonRaphsonSingleRootFinder.getRoot(DoubleFunction1D, DoubleFunction1D, Double, Double)"
  })
  void testGetRootWithDoubleFunction1DDoubleFunction1DDoubleDouble() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    DoubleFunction1D function = mock(DoubleFunction1D.class);
    when(function.applyAsDouble(anyDouble())).thenReturn(0.0d);

    // Act
    Double actualRoot =
        newtonRaphsonSingleRootFinder.getRoot(function, mock(DoubleFunction1D.class), 1.0d, 10.0d);

    // Assert
    verify(function, atLeast(1)).applyAsDouble(anyDouble());
    assertEquals(1.0d, actualRoot.doubleValue());
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, DoubleFunction1D, Double)}
   * with {@code DoubleFunction1D}, {@code DoubleFunction1D}, {@code Double}.
   *
   * <ul>
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D,
   * DoubleFunction1D, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(DoubleFunction1D, DoubleFunction1D, Double) with 'DoubleFunction1D', 'DoubleFunction1D', 'Double'; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double NewtonRaphsonSingleRootFinder.getRoot(DoubleFunction1D, DoubleFunction1D, Double)"
  })
  void testGetRootWithDoubleFunction1DDoubleFunction1DDouble_thenThrowMathException() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    DoubleFunction1D function = mock(DoubleFunction1D.class);
    when(function.applyAsDouble(anyDouble())).thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> newtonRaphsonSingleRootFinder.getRoot(function, mock(DoubleFunction1D.class), 2.0d));
    verify(function).applyAsDouble(2.0d);
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, DoubleFunction1D, Double)}
   * with {@code DoubleFunction1D}, {@code DoubleFunction1D}, {@code Double}.
   *
   * <ul>
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D,
   * DoubleFunction1D, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(DoubleFunction1D, DoubleFunction1D, Double) with 'DoubleFunction1D', 'DoubleFunction1D', 'Double'; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double NewtonRaphsonSingleRootFinder.getRoot(DoubleFunction1D, DoubleFunction1D, Double)"
  })
  void testGetRootWithDoubleFunction1DDoubleFunction1DDouble_thenThrowMathException2() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    DoubleFunction1D function = mock(DoubleFunction1D.class);
    when(function.applyAsDouble(anyDouble())).thenReturn(10.0d);

    DoubleFunction1D derivative = mock(DoubleFunction1D.class);
    when(derivative.applyAsDouble(anyDouble())).thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> newtonRaphsonSingleRootFinder.getRoot(function, derivative, 2.0d));
    verify(function).applyAsDouble(2.0d);
    verify(derivative).applyAsDouble(2.0d);
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, Double)} with {@code
   * DoubleFunction1D}, {@code Double}.
   *
   * <ul>
   *   <li>Given {@link DoubleFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(DoubleFunction1D, Double) with 'DoubleFunction1D', 'Double'; given DoubleFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double NewtonRaphsonSingleRootFinder.getRoot(DoubleFunction1D, Double)"})
  void testGetRootWithDoubleFunction1DDouble_givenDoubleFunction1D() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    DoubleFunction1D function = mock(DoubleFunction1D.class);
    when(function.applyAsDouble(anyDouble())).thenThrow(new MathException("0123456789ABCDEF"));
    when(function.derivative()).thenReturn(mock(DoubleFunction1D.class));

    // Act and Assert
    assertThrows(MathException.class, () -> newtonRaphsonSingleRootFinder.getRoot(function, 2.0d));
    verify(function).derivative();
    verify(function).applyAsDouble(2.0d);
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, Double)} with {@code
   * DoubleFunction1D}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 1.9999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(DoubleFunction1D, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(DoubleFunction1D, Double) with 'DoubleFunction1D', 'Double'; then return doubleValue is '1.9999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double NewtonRaphsonSingleRootFinder.getRoot(DoubleFunction1D, Double)"})
  void testGetRootWithDoubleFunction1DDouble_thenReturnDoubleValueIs19999999999999() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    DoubleFunction1D doubleFunction1D = mock(DoubleFunction1D.class);
    when(doubleFunction1D.applyAsDouble(anyDouble())).thenReturn(10.0d);

    DoubleFunction1D function = mock(DoubleFunction1D.class);
    when(function.applyAsDouble(anyDouble())).thenReturn(1.0E-12d);
    when(function.derivative()).thenReturn(doubleFunction1D);

    // Act
    Double actualRoot = newtonRaphsonSingleRootFinder.getRoot(function, 2.0d);

    // Assert
    verify(function).derivative();
    verify(function).applyAsDouble(2.0d);
    verify(doubleFunction1D).applyAsDouble(2.0d);
    assertEquals(1.9999999999999d, actualRoot.doubleValue());
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, Double, Double) with 'Function', 'Double', 'Double'; given zero; then return doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double NewtonRaphsonSingleRootFinder.getRoot(Function, Double, Double)"})
  void testGetRootWithFunctionDoubleDouble_givenZero_thenReturnDoubleValueIsOne() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(0.0d);

    // Act
    Double actualRoot = newtonRaphsonSingleRootFinder.getRoot(function, 1.0d, 10.0d);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(1.0d, actualRoot.doubleValue());
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(Function, Function, Double, Double)} with
   * {@code Function}, {@code Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(Function, Function, Double,
   * Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, Function, Double, Double) with 'Function', 'Function', 'Double', 'Double'; given zero; then return doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Double NewtonRaphsonSingleRootFinder.getRoot(Function, Function, Double, Double)"
  })
  void testGetRootWithFunctionFunctionDoubleDouble_givenZero_thenReturnDoubleValueIsOne() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(0.0d);

    // Act
    Double actualRoot =
        newtonRaphsonSingleRootFinder.getRoot(function, mock(Function.class), 1.0d, 10.0d);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(1.0d, actualRoot.doubleValue());
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(Function, Function, Double)} with {@code
   * Function}, {@code Function}, {@code Double}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return doubleValue is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(Function, Function, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, Function, Double) with 'Function', 'Function', 'Double'; given zero; then return doubleValue is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double NewtonRaphsonSingleRootFinder.getRoot(Function, Function, Double)"})
  void testGetRootWithFunctionFunctionDouble_givenZero_thenReturnDoubleValueIs05() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(0.0d);

    // Act
    Double actualRoot =
        newtonRaphsonSingleRootFinder.getRoot(
            function, new InverseIncompleteBetaFunction(10.0d, 10.0d), 0.5d);

    // Assert
    verify(function).apply(0.5d);
    assertEquals(0.5d, actualRoot.doubleValue());
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(Function, Function, Double)} with {@code
   * Function}, {@code Function}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(Function, Function, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, Function, Double) with 'Function', 'Function', 'Double'; then return doubleValue is '0.999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double NewtonRaphsonSingleRootFinder.getRoot(Function, Function, Double)"})
  void testGetRootWithFunctionFunctionDouble_thenReturnDoubleValueIs0999999999999() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(1.0E-12d);

    // Act
    Double actualRoot =
        newtonRaphsonSingleRootFinder.getRoot(
            function, new IncompleteBetaFunction(10.0d, 10.0d), 1.0d);

    // Assert
    verify(function).apply(1.0d);
    assertEquals(0.999999999999d, actualRoot.doubleValue());
  }

  /**
   * Test {@link NewtonRaphsonSingleRootFinder#getRoot(Function, Function, Double)} with {@code
   * Function}, {@code Function}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 1.9999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link NewtonRaphsonSingleRootFinder#getRoot(Function, Function, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, Function, Double) with 'Function', 'Function', 'Double'; then return doubleValue is '1.9999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double NewtonRaphsonSingleRootFinder.getRoot(Function, Function, Double)"})
  void testGetRootWithFunctionFunctionDouble_thenReturnDoubleValueIs19999999999999() {
    // Arrange
    NewtonRaphsonSingleRootFinder newtonRaphsonSingleRootFinder =
        new NewtonRaphsonSingleRootFinder();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(1.0E-12d);

    Function<Double, Double> derivative = mock(Function.class);
    when(derivative.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualRoot = newtonRaphsonSingleRootFinder.getRoot(function, derivative, 2.0d);

    // Assert
    verify(function).apply(2.0d);
    verify(derivative).apply(2.0d);
    assertEquals(1.9999999999999d, actualRoot.doubleValue());
  }
}
