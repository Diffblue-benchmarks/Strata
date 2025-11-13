package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GaussHermiteQuadratureIntegrator1DDiffblueTest {
  /**
   * Test {@link GaussHermiteQuadratureIntegrator1D#GaussHermiteQuadratureIntegrator1D(int)}.
   *
   * <p>Method under test: {@link
   * GaussHermiteQuadratureIntegrator1D#GaussHermiteQuadratureIntegrator1D(int)}
   */
  @Test
  @DisplayName("Test new GaussHermiteQuadratureIntegrator1D(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussHermiteQuadratureIntegrator1D.<init>(int)"})
  void testNewGaussHermiteQuadratureIntegrator1D() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new Double[] {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY},
        new GaussHermiteQuadratureIntegrator1D(1).getLimits());
  }

  /**
   * Test {@link GaussHermiteQuadratureIntegrator1D#getLimits()}.
   *
   * <p>Method under test: {@link GaussHermiteQuadratureIntegrator1D#getLimits()}
   */
  @Test
  @DisplayName("Test getLimits()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] GaussHermiteQuadratureIntegrator1D.getLimits()"})
  void testGetLimits() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new Double[] {Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY},
        new GaussHermiteQuadratureIntegrator1D(1).getLimits());
  }
}
