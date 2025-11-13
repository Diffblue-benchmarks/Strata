package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GaussLaguerreQuadratureIntegrator1DDiffblueTest {
  /**
   * Test {@link GaussLaguerreQuadratureIntegrator1D#GaussLaguerreQuadratureIntegrator1D(int)}.
   *
   * <p>Method under test: {@link
   * GaussLaguerreQuadratureIntegrator1D#GaussLaguerreQuadratureIntegrator1D(int)}
   */
  @Test
  @DisplayName("Test new GaussLaguerreQuadratureIntegrator1D(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussLaguerreQuadratureIntegrator1D.<init>(int)"})
  void testNewGaussLaguerreQuadratureIntegrator1D() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new Double[] {0.0d, Double.POSITIVE_INFINITY},
        new GaussLaguerreQuadratureIntegrator1D(1).getLimits());
  }

  /**
   * Test {@link GaussLaguerreQuadratureIntegrator1D#GaussLaguerreQuadratureIntegrator1D(int,
   * double)}.
   *
   * <p>Method under test: {@link
   * GaussLaguerreQuadratureIntegrator1D#GaussLaguerreQuadratureIntegrator1D(int, double)}
   */
  @Test
  @DisplayName("Test new GaussLaguerreQuadratureIntegrator1D(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussLaguerreQuadratureIntegrator1D.<init>(int, double)"})
  void testNewGaussLaguerreQuadratureIntegrator1D2() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new Double[] {0.0d, Double.POSITIVE_INFINITY},
        new GaussLaguerreQuadratureIntegrator1D(1, 10.0d).getLimits());
  }

  /**
   * Test {@link GaussLaguerreQuadratureIntegrator1D#getLimits()}.
   *
   * <p>Method under test: {@link GaussLaguerreQuadratureIntegrator1D#getLimits()}
   */
  @Test
  @DisplayName("Test getLimits()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] GaussLaguerreQuadratureIntegrator1D.getLimits()"})
  void testGetLimits() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new Double[] {0.0d, Double.POSITIVE_INFINITY},
        new GaussLaguerreQuadratureIntegrator1D(1).getLimits());
  }
}
