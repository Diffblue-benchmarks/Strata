package com.opengamma.strata.math.impl.rootfinding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.function.DoubleFunction1D;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RealSingleRootFinderDiffblueTest {
  /**
   * Test {@link RealSingleRootFinder#getRoot(Function, Double[])} with {@code Function}, {@code
   * Double[]}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link RealSingleRootFinder#getRoot(Function, Double[])}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, Double[]) with 'Function', 'Double[]'; given zero; then return doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RealSingleRootFinder.getRoot(Function, Double[])"})
  void testGetRootWithFunctionDouble_givenZero_thenReturnDoubleValueIsOne() {
    // Arrange
    BisectionSingleRootFinder bisectionSingleRootFinder = new BisectionSingleRootFinder();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(0.0d);

    // Act
    Double actualRoot = bisectionSingleRootFinder.getRoot(function, 1.0d, 1.0d);

    // Assert
    verify(function, atLeast(1)).apply(1.0d);
    assertEquals(1.0d, actualRoot.doubleValue());
  }

  /**
   * Test {@link RealSingleRootFinder#checkInputs(DoubleFunction1D, Double, Double)} with {@code
   * DoubleFunction1D}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then calls {@link DoubleFunction1D#applyAsDouble(double)}.
   * </ul>
   *
   * <p>Method under test: {@link RealSingleRootFinder#checkInputs(DoubleFunction1D, Double,
   * Double)}
   */
  @Test
  @DisplayName(
      "Test checkInputs(DoubleFunction1D, Double, Double) with 'DoubleFunction1D', 'Double', 'Double'; given zero; then calls applyAsDouble(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealSingleRootFinder.checkInputs(DoubleFunction1D, Double, Double)"})
  void testCheckInputsWithDoubleFunction1DDoubleDouble_givenZero_thenCallsApplyAsDouble() {
    // Arrange
    BisectionSingleRootFinder bisectionSingleRootFinder = new BisectionSingleRootFinder();

    DoubleFunction1D function = mock(DoubleFunction1D.class);
    when(function.applyAsDouble(anyDouble())).thenReturn(0.0d);

    // Act
    bisectionSingleRootFinder.checkInputs(function, 1.0d, 10.0d);

    // Assert
    verify(function, atLeast(1)).applyAsDouble(anyDouble());
  }

  /**
   * Test {@link RealSingleRootFinder#checkInputs(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then calls {@link Function#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link RealSingleRootFinder#checkInputs(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test checkInputs(Function, Double, Double) with 'Function', 'Double', 'Double'; given zero; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealSingleRootFinder.checkInputs(Function, Double, Double)"})
  void testCheckInputsWithFunctionDoubleDouble_givenZero_thenCallsApply() {
    // Arrange
    BisectionSingleRootFinder bisectionSingleRootFinder = new BisectionSingleRootFinder();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(0.0d);

    // Act
    bisectionSingleRootFinder.checkInputs(function, 1.0d, 10.0d);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
  }
}
