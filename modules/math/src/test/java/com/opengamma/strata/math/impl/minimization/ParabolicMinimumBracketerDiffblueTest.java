package com.opengamma.strata.math.impl.minimization;

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

class ParabolicMinimumBracketerDiffblueTest {
  /**
   * Test {@link ParabolicMinimumBracketer#getBracketedPoints(Function, double, double)}.
   *
   * <ul>
   *   <li>Given {@link MathException#MathException(String)} with message is {@code
   *       0123456789ABCDEF}.
   * </ul>
   *
   * <p>Method under test: {@link ParabolicMinimumBracketer#getBracketedPoints(Function, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getBracketedPoints(Function, double, double); given MathException(String) with message is '0123456789ABCDEF'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] ParabolicMinimumBracketer.getBracketedPoints(Function, double, double)"
  })
  void testGetBracketedPoints_givenMathExceptionWithMessageIs0123456789abcdef() {
    // Arrange
    ParabolicMinimumBracketer parabolicMinimumBracketer = new ParabolicMinimumBracketer();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenThrow(new MathException("0123456789ABCDEF"));

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> parabolicMinimumBracketer.getBracketedPoints(f, 1.0E-15d, 10.0d));
    verify(f).apply(1.0E-15d);
  }

  /**
   * Test {@link ParabolicMinimumBracketer#getBracketedPoints(Function, double, double)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@code 26.180339899999996}.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link ParabolicMinimumBracketer#getBracketedPoints(Function, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getBracketedPoints(Function, double, double); given ten; when '26.180339899999996'; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] ParabolicMinimumBracketer.getBracketedPoints(Function, double, double)"
  })
  void testGetBracketedPoints_givenTen_when26180339899999996_thenThrowMathException() {
    // Arrange
    ParabolicMinimumBracketer parabolicMinimumBracketer = new ParabolicMinimumBracketer();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> parabolicMinimumBracketer.getBracketedPoints(f, 26.180339899999996d, 10.0d));
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link ParabolicMinimumBracketer#getBracketedPoints(Function, double, double)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   * </ul>
   *
   * <p>Method under test: {@link ParabolicMinimumBracketer#getBracketedPoints(Function, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getBracketedPoints(Function, double, double); given ten; when Function apply(Object) return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] ParabolicMinimumBracketer.getBracketedPoints(Function, double, double)"
  })
  void testGetBracketedPoints_givenTen_whenFunctionApplyReturnTen() {
    // Arrange
    ParabolicMinimumBracketer parabolicMinimumBracketer = new ParabolicMinimumBracketer();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> parabolicMinimumBracketer.getBracketedPoints(f, 1.0E-15d, 10.0d));
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link ParabolicMinimumBracketer#getBracketedPoints(Function, double, double)}.
   *
   * <ul>
   *   <li>When {@link Function}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ParabolicMinimumBracketer#getBracketedPoints(Function, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test getBracketedPoints(Function, double, double); when Function; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[] ParabolicMinimumBracketer.getBracketedPoints(Function, double, double)"
  })
  void testGetBracketedPoints_whenFunction_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new ParabolicMinimumBracketer().getBracketedPoints(mock(Function.class), 10.0d, 10.0d));
  }
}
