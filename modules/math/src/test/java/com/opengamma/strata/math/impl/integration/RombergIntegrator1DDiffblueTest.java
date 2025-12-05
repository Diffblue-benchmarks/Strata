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

class RombergIntegrator1DDiffblueTest {
  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName("Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class,
        () ->
            RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE.integrate(
                new IncompleteBetaFunction(10.0d, 0.5d), 1.0d, 0.5d));
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given {@link Double#NaN}.
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given NaN; when Function apply(Object) return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenNaN_whenFunctionApplyReturnNaN() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(Double.NaN);

    // Act and Assert
    assertThrows(
        MathException.class,
        () -> RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE.integrate(f, 0.5d, 10.0d));
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given ten; then return doubleValue is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenTen_thenReturnDoubleValueIsMinusTen() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult =
        RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE.integrate(f, 0.5d, -0.5d);

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(-10.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is ninety-five.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given ten; then return doubleValue is ninety-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenTen_thenReturnDoubleValueIsNinetyFive() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult =
        RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE.integrate(f, 0.5d, 10.0d);

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(95.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.3408452234051479}.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.3408452234051479'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs03408452234051479() {
    // Arrange, Act and Assert
    assertEquals(
        -0.3408452234051479d,
        RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 0.5d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.3975115914312582}.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.3975115914312582'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs03975115914312582() {
    // Arrange, Act and Assert
    assertEquals(
        -0.3975115914312582d,
        RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 0.75d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.4309644039838905}.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.4309644039838905'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs04309644039838905() {
    // Arrange, Act and Assert
    assertEquals(
        -0.4309644039838905d,
        RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 1.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.04404926299970401}.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '0.04404926299970401'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs004404926299970401() {
    // Arrange, Act and Assert
    assertEquals(
        0.04404926299970401d,
        RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE
            .integrate(new IncompleteBetaFunction(10.0d, 10.0d), 0.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 7.685976780921375E-18}.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '7.685976780921375E-18'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs7685976780921375e18() {
    // Arrange, Act and Assert
    assertEquals(
        7.685976780921375E-18d,
        RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE
            .integrate(new IncompleteBetaFunction(10.0d, 1.0E-12d), 0.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.09086470170454594}.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.09086470170454594'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs009086470170454594() {
    // Arrange, Act and Assert
    assertEquals(
        -0.09086470170454594d,
        RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE
            .integrate(new IncompleteBetaFunction(10.0d, 1.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.45595073616920906}.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.45595073616920906'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs045595073616920906() {
    // Arrange, Act and Assert
    assertEquals(
        -0.45595073616920906d,
        RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE
            .integrate(new IncompleteBetaFunction(10.0d, 10.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.49998973088324483}.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.49998973088324483'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs049998973088324483() {
    // Arrange, Act and Assert
    assertEquals(
        -0.49998973088324483d,
        RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE
            .integrate(new IncompleteBetaFunction(0.5d, 10.0d), 1.0d, 0.5d)
            .doubleValue());
  }

  /**
   * Test {@link RombergIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>When {@link Function}.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link RombergIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; when Function; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RombergIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_whenFunction_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class,
        () ->
            RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE.integrate(
                mock(Function.class), 10.0d, 10.0d));
  }
}
