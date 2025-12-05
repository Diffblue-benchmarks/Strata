package com.opengamma.strata.math.impl.rootfinding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.MathException;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BrentSingleRootFinderDiffblueTest {
  /**
   * Test {@link BrentSingleRootFinder#getRoot(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given {@link BrentSingleRootFinder#BrentSingleRootFinder(double)} with accuracy is {@code
   *       -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BrentSingleRootFinder#getRoot(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, Double, Double) with 'Function', 'Double', 'Double'; given BrentSingleRootFinder(double) with accuracy is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double BrentSingleRootFinder.getRoot(Function, Double, Double)"})
  void testGetRootWithFunctionDoubleDouble_givenBrentSingleRootFinderWithAccuracyIs05() {
    // Arrange
    BrentSingleRootFinder brentSingleRootFinder = new BrentSingleRootFinder(-0.5d);

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(0.0d);

    // Act and Assert
    assertThrows(
        MathException.class, () -> brentSingleRootFinder.getRoot(function, 1.0E-16d, 10.0d));
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link BrentSingleRootFinder#getRoot(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given {@link BrentSingleRootFinder#BrentSingleRootFinder(double)} with accuracy is {@link
   *       Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BrentSingleRootFinder#getRoot(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, Double, Double) with 'Function', 'Double', 'Double'; given BrentSingleRootFinder(double) with accuracy is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double BrentSingleRootFinder.getRoot(Function, Double, Double)"})
  void testGetRootWithFunctionDoubleDouble_givenBrentSingleRootFinderWithAccuracyIsNaN() {
    // Arrange
    BrentSingleRootFinder brentSingleRootFinder = new BrentSingleRootFinder(Double.NaN);

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(0.0d);

    // Act and Assert
    assertThrows(
        MathException.class, () -> brentSingleRootFinder.getRoot(function, 1.0E-16d, 10.0d));
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link BrentSingleRootFinder#getRoot(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link BrentSingleRootFinder#getRoot(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double BrentSingleRootFinder.getRoot(Function, Double, Double)"})
  void testGetRootWithFunctionDoubleDouble_thenReturnDoubleValueIsTen() {
    // Arrange
    BrentSingleRootFinder brentSingleRootFinder = new BrentSingleRootFinder(10.0d);

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(0.0d);

    // Act
    Double actualRoot = brentSingleRootFinder.getRoot(function, 10.0d, 10.0d);

    // Assert
    verify(function, atLeast(1)).apply(10.0d);
    assertEquals(10.0d, actualRoot.doubleValue());
  }

  /**
   * Test {@link BrentSingleRootFinder#getRoot(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link BrentSingleRootFinder#getRoot(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test getRoot(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double BrentSingleRootFinder.getRoot(Function, Double, Double)"})
  void testGetRootWithFunctionDoubleDouble_thenReturnDoubleValueIsTen2() {
    // Arrange
    BrentSingleRootFinder brentSingleRootFinder = new BrentSingleRootFinder(10.0d);

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(0.0d);

    // Act
    Double actualRoot = brentSingleRootFinder.getRoot(function, 1.0E-16d, 10.0d);

    // Assert
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(10.0d, actualRoot.doubleValue());
  }
}
