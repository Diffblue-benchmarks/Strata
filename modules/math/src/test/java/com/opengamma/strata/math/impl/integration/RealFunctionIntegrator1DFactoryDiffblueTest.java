package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RealFunctionIntegrator1DFactoryDiffblueTest {
  /**
   * Test {@link RealFunctionIntegrator1DFactory#getIntegrator(String)}.
   *
   * <ul>
   *   <li>When {@link RealFunctionIntegrator1DFactory#EXTENDED_TRAPEZOID}.
   *   <li>Then return {@link ExtendedTrapezoidIntegrator1D}.
   * </ul>
   *
   * <p>Method under test: {@link RealFunctionIntegrator1DFactory#getIntegrator(String)}
   */
  @Test
  @DisplayName(
      "Test getIntegrator(String); when EXTENDED_TRAPEZOID; then return ExtendedTrapezoidIntegrator1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integrator1D RealFunctionIntegrator1DFactory.getIntegrator(String)"})
  void testGetIntegrator_whenExtended_trapezoid_thenReturnExtendedTrapezoidIntegrator1D() {
    // Arrange and Act
    Integrator1D<Double, Double> actualIntegrator =
        RealFunctionIntegrator1DFactory.getIntegrator(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID);

    // Assert
    assertTrue(actualIntegrator instanceof ExtendedTrapezoidIntegrator1D);
  }

  /**
   * Test {@link RealFunctionIntegrator1DFactory#getIntegrator(String)}.
   *
   * <ul>
   *   <li>When {@code Integrator Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RealFunctionIntegrator1DFactory#getIntegrator(String)}
   */
  @Test
  @DisplayName(
      "Test getIntegrator(String); when 'Integrator Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Integrator1D RealFunctionIntegrator1DFactory.getIntegrator(String)"})
  void testGetIntegrator_whenIntegratorName_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> RealFunctionIntegrator1DFactory.getIntegrator("Integrator Name"));
  }

  /**
   * Test {@link RealFunctionIntegrator1DFactory#getIntegratorName(Integrator1D)}.
   *
   * <ul>
   *   <li>Then return {@link RealFunctionIntegrator1DFactory#EXTENDED_TRAPEZOID}.
   * </ul>
   *
   * <p>Method under test: {@link RealFunctionIntegrator1DFactory#getIntegratorName(Integrator1D)}
   */
  @Test
  @DisplayName("Test getIntegratorName(Integrator1D); then return EXTENDED_TRAPEZOID")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String RealFunctionIntegrator1DFactory.getIntegratorName(Integrator1D)"})
  void testGetIntegratorName_thenReturnExtended_trapezoid() {
    // Arrange, Act and Assert
    assertEquals(
        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID,
        RealFunctionIntegrator1DFactory.getIntegratorName(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE));
  }

  /**
   * Test {@link RealFunctionIntegrator1DFactory#getIntegratorName(Integrator1D)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RealFunctionIntegrator1DFactory#getIntegratorName(Integrator1D)}
   */
  @Test
  @DisplayName("Test getIntegratorName(Integrator1D); when 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String RealFunctionIntegrator1DFactory.getIntegratorName(Integrator1D)"})
  void testGetIntegratorName_whenNull_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RealFunctionIntegrator1DFactory.getIntegratorName(null));
  }
}
