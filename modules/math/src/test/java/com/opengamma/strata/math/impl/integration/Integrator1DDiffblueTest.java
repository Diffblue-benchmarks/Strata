package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.function.special.IncompleteBetaFunction;
import com.opengamma.strata.math.impl.function.special.InverseIncompleteBetaFunction;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class Integrator1DDiffblueTest {
  /**
   * Test {@link Integrator1D#integrate(Function, Object[], Object[])} with {@code Function}, {@code
   * Double[]}, {@code Double[]}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is ninety-five.
   * </ul>
   *
   * <p>Method under test: {@link Integrator1D#integrate(Function, Object[], Object[])}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Object[], Object[]) with 'Function', 'Double[]', 'Double[]'; given ten; then return doubleValue is ninety-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Integrator1D.integrate(Function, Object[], Object[])"})
  void testIntegrateWithFunctionDoubleDouble_givenTen_thenReturnDoubleValueIsNinetyFive() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult =
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE.integrate(
            f, new Double[] {0.5d}, new Double[] {10.0d});

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(95.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link Integrator1D#integrate(Function, Object[], Object[])} with {@code Function}, {@code
   * Double[]}, {@code Double[]}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is ninety-five.
   * </ul>
   *
   * <p>Method under test: {@link Integrator1D#integrate(Function, Object[], Object[])}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Object[], Object[]) with 'Function', 'Double[]', 'Double[]'; given ten; then return doubleValue is ninety-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Integrator1D.integrate(Function, Object[], Object[])"})
  void testIntegrateWithFunctionDoubleDouble_givenTen_thenReturnDoubleValueIsNinetyFive2() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult =
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE.integrate(
            f, new Double[] {0.5d}, new Double[] {10.0d, 0.5d});

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(95.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link Integrator1D#integrate(Function, Object[], Object[])} with {@code Function}, {@code
   * Double[]}, {@code Double[]}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.4559506669850725}.
   * </ul>
   *
   * <p>Method under test: {@link Integrator1D#integrate(Function, Object[], Object[])}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Object[], Object[]) with 'Function', 'Double[]', 'Double[]'; then return doubleValue is '-0.4559506669850725'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Integrator1D.integrate(Function, Object[], Object[])"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs04559506669850725() {
    // Arrange, Act and Assert
    assertEquals(
        -0.4559506669850725d,
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE
            .integrate(
                new IncompleteBetaFunction(10.0d, 10.0d), new Double[] {1.0d}, new Double[] {0.5d})
            .doubleValue());
  }

  /**
   * Test {@link Integrator1D#integrate(Function, Object[], Object[])} with {@code Function}, {@code
   * Double[]}, {@code Double[]}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.10846766120695601}.
   * </ul>
   *
   * <p>Method under test: {@link Integrator1D#integrate(Function, Object[], Object[])}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Object[], Object[]) with 'Function', 'Double[]', 'Double[]'; then return doubleValue is '0.10846766120695601'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Integrator1D.integrate(Function, Object[], Object[])"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs010846766120695601() {
    // Arrange, Act and Assert
    assertEquals(
        0.10846766120695601d,
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE
            .integrate(
                new InverseIncompleteBetaFunction(10.0d, 10.0d),
                new Double[] {0.27061d},
                new Double[] {0.5d})
            .doubleValue());
  }

  /**
   * Test {@link Integrator1D#integrate(Function, Object[], Object[])} with {@code Function}, {@code
   * Double[]}, {@code Double[]}.
   *
   * <ul>
   *   <li>Then return doubleValue is minus ninety-five.
   * </ul>
   *
   * <p>Method under test: {@link Integrator1D#integrate(Function, Object[], Object[])}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Object[], Object[]) with 'Function', 'Double[]', 'Double[]'; then return doubleValue is minus ninety-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Integrator1D.integrate(Function, Object[], Object[])"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIsMinusNinetyFive() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult =
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE.integrate(
            f, new Double[] {10.0d, 0.5d}, new Double[] {0.5d});

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(-95.0d, actualIntegrateResult.doubleValue());
  }
}
