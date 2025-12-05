package com.opengamma.strata.math.impl.rootfinding;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

class BracketRootDiffblueTest {
  /**
   * Test {@link BracketRoot#getBracketedPoints(Function, double, double)} with {@code f}, {@code
   * xLower}, {@code xUpper}.
   *
   * <p>Method under test: {@link BracketRoot#getBracketedPoints(Function, double, double)}
   */
  @Test
  @DisplayName("Test getBracketedPoints(Function, double, double) with 'f', 'xLower', 'xUpper'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] BracketRoot.getBracketedPoints(Function, double, double)"})
  void testGetBracketedPointsWithFXLowerXUpper() {
    // Arrange
    BracketRoot bracketRoot = new BracketRoot();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(MathException.class, () -> bracketRoot.getBracketedPoints(f, 10.0d, 10.0d));
    verify(f).apply(10.0d);
  }

  /**
   * Test {@link BracketRoot#getBracketedPoints(Function, double, double, double, double)} with
   * {@code f}, {@code xLower}, {@code xUpper}, {@code minX}, {@code maxX}.
   *
   * <p>Method under test: {@link BracketRoot#getBracketedPoints(Function, double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getBracketedPoints(Function, double, double, double, double) with 'f', 'xLower', 'xUpper', 'minX', 'maxX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] BracketRoot.getBracketedPoints(Function, double, double, double, double)"
  })
  void testGetBracketedPointsWithFXLowerXUpperMinXMaxX() {
    // Arrange
    BracketRoot bracketRoot = new BracketRoot();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class, () -> bracketRoot.getBracketedPoints(f, 10.0d, 10.0d, 10.0d, 10.0d));
    verify(f).apply(10.0d);
  }

  /**
   * Test {@link BracketRoot#getBracketedPoints(Function, double, double, double, double)} with
   * {@code f}, {@code xLower}, {@code xUpper}, {@code minX}, {@code maxX}.
   *
   * <p>Method under test: {@link BracketRoot#getBracketedPoints(Function, double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getBracketedPoints(Function, double, double, double, double) with 'f', 'xLower', 'xUpper', 'minX', 'maxX'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] BracketRoot.getBracketedPoints(Function, double, double, double, double)"
  })
  void testGetBracketedPointsWithFXLowerXUpperMinXMaxX2() {
    // Arrange
    BracketRoot bracketRoot = new BracketRoot();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(0.0d);

    // Act
    double[] actualBracketedPoints = bracketRoot.getBracketedPoints(f, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    verify(f, atLeast(1)).apply(10.0d);
    assertArrayEquals(new double[] {10.0d, 10.0d}, actualBracketedPoints, 0.0);
  }

  /**
   * Test {@link BracketRoot#getBracketedPoints(Function, double, double, double, double)} with
   * {@code f}, {@code xLower}, {@code xUpper}, {@code minX}, {@code maxX}.
   *
   * <ul>
   *   <li>Given {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BracketRoot#getBracketedPoints(Function, double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getBracketedPoints(Function, double, double, double, double) with 'f', 'xLower', 'xUpper', 'minX', 'maxX'; given NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] BracketRoot.getBracketedPoints(Function, double, double, double, double)"
  })
  void testGetBracketedPointsWithFXLowerXUpperMinXMaxX_givenNaN() {
    // Arrange
    BracketRoot bracketRoot = new BracketRoot();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(Double.NaN);

    // Act and Assert
    assertThrows(
        MathException.class, () -> bracketRoot.getBracketedPoints(f, 10.0d, 10.0d, 10.0d, 10.0d));
    verify(f, atLeast(1)).apply(10.0d);
  }

  /**
   * Test {@link BracketRoot#getBracketedPoints(Function, double, double, double, double)} with
   * {@code f}, {@code xLower}, {@code xUpper}, {@code minX}, {@code maxX}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link BracketRoot#getBracketedPoints(Function, double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getBracketedPoints(Function, double, double, double, double) with 'f', 'xLower', 'xUpper', 'minX', 'maxX'; given ten; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] BracketRoot.getBracketedPoints(Function, double, double, double, double)"
  })
  void testGetBracketedPointsWithFXLowerXUpperMinXMaxX_givenTen_thenThrowMathException() {
    // Arrange
    BracketRoot bracketRoot = new BracketRoot();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act and Assert
    assertThrows(
        MathException.class, () -> bracketRoot.getBracketedPoints(f, 10.0d, 10.0d, 10.0d, 10.0d));
    verify(f, atLeast(1)).apply(10.0d);
  }

  /**
   * Test {@link BracketRoot#getBracketedPoints(Function, double, double, double, double)} with
   * {@code f}, {@code xLower}, {@code xUpper}, {@code minX}, {@code maxX}.
   *
   * <ul>
   *   <li>When {@code 1.6}.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link BracketRoot#getBracketedPoints(Function, double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getBracketedPoints(Function, double, double, double, double) with 'f', 'xLower', 'xUpper', 'minX', 'maxX'; when '1.6'; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] BracketRoot.getBracketedPoints(Function, double, double, double, double)"
  })
  void testGetBracketedPointsWithFXLowerXUpperMinXMaxX_when16_thenThrowMathException() {
    // Arrange
    BracketRoot bracketRoot = new BracketRoot();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act and Assert
    assertThrows(
        MathException.class, () -> bracketRoot.getBracketedPoints(f, 1.6d, 10.0d, 1.6d, 10.0d));
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link BracketRoot#getBracketedPoints(Function, double, double)} with {@code f}, {@code
   * xLower}, {@code xUpper}.
   *
   * <ul>
   *   <li>Given {@link Double#NaN}.
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BracketRoot#getBracketedPoints(Function, double, double)}
   */
  @Test
  @DisplayName(
      "Test getBracketedPoints(Function, double, double) with 'f', 'xLower', 'xUpper'; given NaN; when Function apply(Object) return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] BracketRoot.getBracketedPoints(Function, double, double)"})
  void testGetBracketedPointsWithFXLowerXUpper_givenNaN_whenFunctionApplyReturnNaN() {
    // Arrange
    BracketRoot bracketRoot = new BracketRoot();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(Double.NaN);

    // Act and Assert
    assertThrows(MathException.class, () -> bracketRoot.getBracketedPoints(f, 10.0d, 10.0d));
    verify(f, atLeast(1)).apply(10.0d);
  }

  /**
   * Test {@link BracketRoot#getBracketedPoints(Function, double, double)} with {@code f}, {@code
   * xLower}, {@code xUpper}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   * </ul>
   *
   * <p>Method under test: {@link BracketRoot#getBracketedPoints(Function, double, double)}
   */
  @Test
  @DisplayName(
      "Test getBracketedPoints(Function, double, double) with 'f', 'xLower', 'xUpper'; given ten; when Function apply(Object) return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] BracketRoot.getBracketedPoints(Function, double, double)"})
  void testGetBracketedPointsWithFXLowerXUpper_givenTen_whenFunctionApplyReturnTen() {
    // Arrange
    BracketRoot bracketRoot = new BracketRoot();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act and Assert
    assertThrows(MathException.class, () -> bracketRoot.getBracketedPoints(f, 10.0d, 10.0d));
    verify(f, atLeast(1)).apply(10.0d);
  }
}
