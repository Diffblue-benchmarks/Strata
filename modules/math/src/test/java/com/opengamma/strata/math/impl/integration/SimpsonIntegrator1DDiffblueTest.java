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
import com.opengamma.strata.math.impl.function.special.IncompleteGammaFunction;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SimpsonIntegrator1DDiffblueTest {
  /**
   * Test {@link SimpsonIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link SimpsonIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given ten; then return doubleValue is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double SimpsonIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenTen_thenReturnDoubleValueIsMinusTen() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult =
        RealFunctionIntegrator1DFactory.SIMPSON_INSTANCE.integrate(f, 0.5d, -0.5d);

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(-10.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link SimpsonIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is ninety-five.
   * </ul>
   *
   * <p>Method under test: {@link SimpsonIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given ten; then return doubleValue is ninety-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double SimpsonIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenTen_thenReturnDoubleValueIsNinetyFive() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult =
        RealFunctionIntegrator1DFactory.SIMPSON_INSTANCE.integrate(f, 0.5d, 10.0d);

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(95.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link SimpsonIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.4309643970620776}.
   * </ul>
   *
   * <p>Method under test: {@link SimpsonIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.4309643970620776'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double SimpsonIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs04309643970620776() {
    // Arrange, Act and Assert
    assertEquals(
        -0.4309643970620776d,
        RealFunctionIntegrator1DFactory.SIMPSON_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 1.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link SimpsonIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.4559507422579316}.
   * </ul>
   *
   * <p>Method under test: {@link SimpsonIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.4559507422579316'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double SimpsonIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs04559507422579316() {
    // Arrange, Act and Assert
    assertEquals(
        -0.4559507422579316d,
        RealFunctionIntegrator1DFactory.SIMPSON_INSTANCE
            .integrate(new IncompleteBetaFunction(10.0d, 10.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link SimpsonIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.4999897227130683}.
   * </ul>
   *
   * <p>Method under test: {@link SimpsonIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.4999897227130683'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double SimpsonIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs04999897227130683() {
    // Arrange, Act and Assert
    assertEquals(
        -0.4999897227130683d,
        RealFunctionIntegrator1DFactory.SIMPSON_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 10.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link SimpsonIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 5.325231368158024E-13}.
   * </ul>
   *
   * <p>Method under test: {@link SimpsonIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '5.325231368158024E-13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double SimpsonIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs5325231368158024e13() {
    // Arrange, Act and Assert
    assertEquals(
        5.325231368158024E-13d,
        RealFunctionIntegrator1DFactory.SIMPSON_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 1.0E-12d), 0.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link SimpsonIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.09086470262852346}.
   * </ul>
   *
   * <p>Method under test: {@link SimpsonIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.09086470262852346'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double SimpsonIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs009086470262852346() {
    // Arrange, Act and Assert
    assertEquals(
        -0.09086470262852346d,
        RealFunctionIntegrator1DFactory.SIMPSON_INSTANCE
            .integrate(new IncompleteBetaFunction(10.0d, 1.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link SimpsonIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -9.258036224618069}.
   * </ul>
   *
   * <p>Method under test: {@link SimpsonIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-9.258036224618069'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double SimpsonIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs9258036224618069() {
    // Arrange
    SimpsonIntegrator1D simpsonIntegrator1D = new SimpsonIntegrator1D();

    // Act and Assert
    assertEquals(
        -9.258036224618069d,
        simpsonIntegrator1D
            .integrate(new IncompleteGammaFunction(0.5d), 10.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link SimpsonIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -1.2511003302008468}.
   * </ul>
   *
   * <p>Method under test: {@link SimpsonIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-1.2511003302008468'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double SimpsonIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs12511003302008468() {
    // Arrange
    SimpsonIntegrator1D simpsonIntegrator1D = new SimpsonIntegrator1D();

    // Act and Assert
    assertEquals(
        -1.2511003302008468d,
        simpsonIntegrator1D
            .integrate(new IncompleteGammaFunction(10.0d), 10.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link SimpsonIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.39751160837793154}.
   * </ul>
   *
   * <p>Method under test: {@link SimpsonIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.39751160837793154'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double SimpsonIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs039751160837793154() {
    // Arrange, Act and Assert
    assertEquals(
        -0.39751160837793154d,
        RealFunctionIntegrator1DFactory.SIMPSON_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 0.75d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link SimpsonIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>When {@link Function}.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link SimpsonIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; when Function; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double SimpsonIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_whenFunction_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class,
        () ->
            RealFunctionIntegrator1DFactory.SIMPSON_INSTANCE.integrate(
                mock(Function.class), 10.0d, 10.0d));
  }
}
