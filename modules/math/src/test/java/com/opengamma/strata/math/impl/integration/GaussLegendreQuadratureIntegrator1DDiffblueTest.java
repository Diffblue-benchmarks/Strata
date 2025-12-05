package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.function.special.NaturalLogGammaFunction;
import com.opengamma.strata.math.impl.function.special.TopHatFunction;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GaussLegendreQuadratureIntegrator1DDiffblueTest {
  /**
   * Test {@link GaussLegendreQuadratureIntegrator1D#GaussLegendreQuadratureIntegrator1D(int)}.
   *
   * <p>Method under test: {@link
   * GaussLegendreQuadratureIntegrator1D#GaussLegendreQuadratureIntegrator1D(int)}
   */
  @Test
  @DisplayName("Test new GaussLegendreQuadratureIntegrator1D(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GaussLegendreQuadratureIntegrator1D.<init>(int)"})
  void testNewGaussLegendreQuadratureIntegrator1D() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new Double[] {-1.0d, 1.0d}, new GaussLegendreQuadratureIntegrator1D(1).getLimits());
  }

  /**
   * Test {@link GaussLegendreQuadratureIntegrator1D#getLimits()}.
   *
   * <p>Method under test: {@link GaussLegendreQuadratureIntegrator1D#getLimits()}
   */
  @Test
  @DisplayName("Test getLimits()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double[] GaussLegendreQuadratureIntegrator1D.getLimits()"})
  void testGetLimits() {
    // Arrange, Act and Assert
    assertArrayEquals(
        new Double[] {-1.0d, 1.0d}, new GaussLegendreQuadratureIntegrator1D(1).getLimits());
  }

  /**
   * Test {@link GaussLegendreQuadratureIntegrator1D#getIntegralFunction(Function, Double, Double)}.
   *
   * <p>Method under test: {@link GaussLegendreQuadratureIntegrator1D#getIntegralFunction(Function,
   * Double, Double)}
   */
  @Test
  @DisplayName("Test getIntegralFunction(Function, Double, Double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function GaussLegendreQuadratureIntegrator1D.getIntegralFunction(Function, Double, Double)"
  })
  void testGetIntegralFunction() {
    // Arrange
    GaussLegendreQuadratureIntegrator1D gaussLegendreQuadratureIntegrator1D =
        new GaussLegendreQuadratureIntegrator1D(1);
    TopHatFunction function = new TopHatFunction(1.0d, 10.0d, 3.0d);

    // Act and Assert
    assertEquals(
        0.0d,
        gaussLegendreQuadratureIntegrator1D
            .getIntegralFunction(function, 1.0d, 10.0d)
            .apply(10.0d)
            .doubleValue());
    assertEquals(3.0d, function.apply(2.0d).doubleValue());
    assertArrayEquals(new Double[] {-1.0d, 1.0d}, gaussLegendreQuadratureIntegrator1D.getLimits());
  }

  /**
   * Test {@link GaussLegendreQuadratureIntegrator1D#getIntegralFunction(Function, Double, Double)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   *   <li>Then calls {@link Function#apply(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link GaussLegendreQuadratureIntegrator1D#getIntegralFunction(Function,
   * Double, Double)}
   */
  @Test
  @DisplayName(
      "Test getIntegralFunction(Function, Double, Double); given ten; when Function apply(Object) return ten; then calls apply(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function GaussLegendreQuadratureIntegrator1D.getIntegralFunction(Function, Double, Double)"
  })
  void testGetIntegralFunction_givenTen_whenFunctionApplyReturnTen_thenCallsApply() {
    // Arrange
    GaussLegendreQuadratureIntegrator1D gaussLegendreQuadratureIntegrator1D =
        new GaussLegendreQuadratureIntegrator1D(1);

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualApplyResult =
        gaussLegendreQuadratureIntegrator1D
            .getIntegralFunction(function, 10.0d, 10.0d)
            .apply(10.0d);

    // Assert
    verify(function).apply(10.0d);
    assertEquals(0.0d, actualApplyResult.doubleValue());
    assertArrayEquals(new Double[] {-1.0d, 1.0d}, gaussLegendreQuadratureIntegrator1D.getLimits());
  }

  /**
   * Test {@link GaussLegendreQuadratureIntegrator1D#getIntegralFunction(Function, Double, Double)}.
   *
   * <ul>
   *   <li>Then {@link NaturalLogGammaFunction} (default constructor) apply two doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link GaussLegendreQuadratureIntegrator1D#getIntegralFunction(Function,
   * Double, Double)}
   */
  @Test
  @DisplayName(
      "Test getIntegralFunction(Function, Double, Double); then NaturalLogGammaFunction (default constructor) apply two doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function GaussLegendreQuadratureIntegrator1D.getIntegralFunction(Function, Double, Double)"
  })
  void testGetIntegralFunction_thenNaturalLogGammaFunctionApplyTwoDoubleValueIsZero() {
    // Arrange
    GaussLegendreQuadratureIntegrator1D gaussLegendreQuadratureIntegrator1D =
        new GaussLegendreQuadratureIntegrator1D(1);
    NaturalLogGammaFunction function = new NaturalLogGammaFunction();

    // Act
    Double actualApplyResult =
        gaussLegendreQuadratureIntegrator1D
            .getIntegralFunction(function, 10.0d, 10.0d)
            .apply(10.0d);

    // Assert
    assertEquals(0.0d, function.apply(2.0d).doubleValue());
    assertEquals(0.0d, actualApplyResult.doubleValue());
    assertArrayEquals(new Double[] {-1.0d, 1.0d}, gaussLegendreQuadratureIntegrator1D.getLimits());
  }

  /**
   * Test {@link GaussLegendreQuadratureIntegrator1D#getIntegralFunction(Function, Double, Double)}.
   *
   * <ul>
   *   <li>When {@link Function}.
   * </ul>
   *
   * <p>Method under test: {@link GaussLegendreQuadratureIntegrator1D#getIntegralFunction(Function,
   * Double, Double)}
   */
  @Test
  @DisplayName("Test getIntegralFunction(Function, Double, Double); when Function")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function GaussLegendreQuadratureIntegrator1D.getIntegralFunction(Function, Double, Double)"
  })
  void testGetIntegralFunction_whenFunction() {
    // Arrange
    GaussLegendreQuadratureIntegrator1D gaussLegendreQuadratureIntegrator1D =
        new GaussLegendreQuadratureIntegrator1D(1);

    // Act
    gaussLegendreQuadratureIntegrator1D.getIntegralFunction(mock(Function.class), 10.0d, 10.0d);

    // Assert that nothing has changed
    assertArrayEquals(new Double[] {-1.0d, 1.0d}, gaussLegendreQuadratureIntegrator1D.getLimits());
  }
}
