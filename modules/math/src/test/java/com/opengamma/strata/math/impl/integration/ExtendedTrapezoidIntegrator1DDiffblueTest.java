package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.MathException;
import com.opengamma.strata.math.impl.function.special.IncompleteBetaFunction;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ExtendedTrapezoidIntegrator1DDiffblueTest {
  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName("Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class,
        () ->
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE.integrate(
                new IncompleteBetaFunction(10.0d, 0.5d), 1.0d, 0.5d));
  }

  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given {@link Double#NaN}.
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given NaN; when Function apply(Object) return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenNaN_whenFunctionApplyReturnNaN() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(Double.NaN);

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE.integrate(f, 0.5d, 10.0d));
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given ten; then return doubleValue is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenTen_thenReturnDoubleValueIsMinusTen() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult =
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE.integrate(f, 0.5d, -0.5d);

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(-10.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is ninety-five.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given ten; then return doubleValue is ninety-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenTen_thenReturnDoubleValueIsNinetyFive() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult =
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE.integrate(f, 0.5d, 10.0d);

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(95.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.3408452346109152}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.3408452346109152'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs03408452346109152() {
    // Arrange, Act and Assert
    assertEquals(
        -0.3408452346109152d,
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 0.5d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.4559506669850725}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.4559506669850725'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs04559506669850725() {
    // Arrange, Act and Assert
    assertEquals(
        -0.4559506669850725d,
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE
            .integrate(new IncompleteBetaFunction(10.0d, 10.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 5.325671648614371E-13}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '5.325671648614371E-13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs5325671648614371e13() {
    // Arrange, Act and Assert
    assertEquals(
        5.325671648614371E-13d,
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 1.0E-12d), 0.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.09086471409792654}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.09086471409792654'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs009086471409792654() {
    // Arrange, Act and Assert
    assertEquals(
        -0.09086471409792654d,
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE
            .integrate(new IncompleteBetaFunction(10.0d, 1.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.39751162860488287}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.39751162860488287'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs039751162860488287() {
    // Arrange, Act and Assert
    assertEquals(
        -0.39751162860488287d,
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 0.75d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.43096434043371684}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.43096434043371684'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs043096434043371684() {
    // Arrange, Act and Assert
    assertEquals(
        -0.43096434043371684d,
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 1.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.49998963205184954}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.49998963205184954'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs049998963205184954() {
    // Arrange, Act and Assert
    assertEquals(
        -0.49998963205184954d,
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 10.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>When {@link Function}.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link ExtendedTrapezoidIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; when Function; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double ExtendedTrapezoidIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_whenFunction_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class,
        () ->
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE.integrate(
                mock(Function.class), 10.0d, 10.0d));
  }
}
