package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.function.special.IncompleteBetaFunction;
import com.opengamma.strata.math.impl.function.special.TopHatFunction;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GaussianQuadratureIntegrator1DDiffblueTest {
  /**
   * Test {@link GaussianQuadratureIntegrator1D#integrateFromPolyFunc(Function)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return {@code 17.724538509055158}.
   * </ul>
   *
   * <p>Method under test: {@link GaussianQuadratureIntegrator1D#integrateFromPolyFunc(Function)}
   */
  @Test
  @DisplayName("Test integrateFromPolyFunc(Function); given ten; then return '17.724538509055158'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GaussianQuadratureIntegrator1D.integrateFromPolyFunc(Function)"})
  void testIntegrateFromPolyFunc_givenTen_thenReturn17724538509055158() {
    // Arrange
    GaussHermiteQuadratureIntegrator1D gaussHermiteQuadratureIntegrator1D =
        new GaussHermiteQuadratureIntegrator1D(1);

    Function<Double, Double> polyFunction = mock(Function.class);
    when(polyFunction.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    double actualIntegrateFromPolyFuncResult =
        gaussHermiteQuadratureIntegrator1D.integrateFromPolyFunc(polyFunction);

    // Assert
    verify(polyFunction).apply(0.0d);
    assertEquals(17.724538509055158d, actualIntegrateFromPolyFuncResult);
  }

  /**
   * Test {@link GaussianQuadratureIntegrator1D#integrateFromPolyFunc(Function)}.
   *
   * <ul>
   *   <li>When {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is ten
   *       and b is ten.
   * </ul>
   *
   * <p>Method under test: {@link GaussianQuadratureIntegrator1D#integrateFromPolyFunc(Function)}
   */
  @Test
  @DisplayName(
      "Test integrateFromPolyFunc(Function); when IncompleteBetaFunction(double, double) with a is ten and b is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GaussianQuadratureIntegrator1D.integrateFromPolyFunc(Function)"})
  void testIntegrateFromPolyFunc_whenIncompleteBetaFunctionWithAIsTenAndBIsTen() {
    // Arrange
    GaussHermiteQuadratureIntegrator1D gaussHermiteQuadratureIntegrator1D =
        new GaussHermiteQuadratureIntegrator1D(1);

    // Act
    double actualIntegrateFromPolyFuncResult =
        gaussHermiteQuadratureIntegrator1D.integrateFromPolyFunc(
            new IncompleteBetaFunction(10.0d, 10.0d));

    // Assert
    assertEquals(0.0d, actualIntegrateFromPolyFuncResult);
  }

  /**
   * Test {@link GaussianQuadratureIntegrator1D#integrateFromPolyFunc(Function)}.
   *
   * <ul>
   *   <li>When {@link TopHatFunction#TopHatFunction(double, double, double)} with x1 is one and x2
   *       is ten and y is three.
   * </ul>
   *
   * <p>Method under test: {@link GaussianQuadratureIntegrator1D#integrateFromPolyFunc(Function)}
   */
  @Test
  @DisplayName(
      "Test integrateFromPolyFunc(Function); when TopHatFunction(double, double, double) with x1 is one and x2 is ten and y is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GaussianQuadratureIntegrator1D.integrateFromPolyFunc(Function)"})
  void testIntegrateFromPolyFunc_whenTopHatFunctionWithX1IsOneAndX2IsTenAndYIsThree() {
    // Arrange
    GaussHermiteQuadratureIntegrator1D gaussHermiteQuadratureIntegrator1D =
        new GaussHermiteQuadratureIntegrator1D(1);

    // Act
    double actualIntegrateFromPolyFuncResult =
        gaussHermiteQuadratureIntegrator1D.integrateFromPolyFunc(
            new TopHatFunction(1.0d, 10.0d, 3.0d));

    // Assert
    assertEquals(0.0d, actualIntegrateFromPolyFuncResult);
  }

  /**
   * Test {@link GaussianQuadratureIntegrator1D#equals(Object)}, and {@link
   * GaussianQuadratureIntegrator1D#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GaussianQuadratureIntegrator1D#equals(Object)}
   *   <li>{@link GaussianQuadratureIntegrator1D#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GaussianQuadratureIntegrator1D.equals(Object)",
    "int GaussianQuadratureIntegrator1D.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GaussHermiteQuadratureIntegrator1D gaussHermiteQuadratureIntegrator1D =
        new GaussHermiteQuadratureIntegrator1D(1);
    GaussHermiteQuadratureIntegrator1D gaussHermiteQuadratureIntegrator1D2 =
        new GaussHermiteQuadratureIntegrator1D(1);

    // Act and Assert
    assertEquals(gaussHermiteQuadratureIntegrator1D, gaussHermiteQuadratureIntegrator1D2);
    assertEquals(
        gaussHermiteQuadratureIntegrator1D.hashCode(),
        gaussHermiteQuadratureIntegrator1D2.hashCode());
  }

  /**
   * Test {@link GaussianQuadratureIntegrator1D#equals(Object)}, and {@link
   * GaussianQuadratureIntegrator1D#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GaussianQuadratureIntegrator1D#equals(Object)}
   *   <li>{@link GaussianQuadratureIntegrator1D#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GaussianQuadratureIntegrator1D.equals(Object)",
    "int GaussianQuadratureIntegrator1D.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GaussHermiteQuadratureIntegrator1D gaussHermiteQuadratureIntegrator1D =
        new GaussHermiteQuadratureIntegrator1D(1);

    // Act and Assert
    assertEquals(gaussHermiteQuadratureIntegrator1D, gaussHermiteQuadratureIntegrator1D);
    int expectedHashCodeResult = gaussHermiteQuadratureIntegrator1D.hashCode();
    assertEquals(expectedHashCodeResult, gaussHermiteQuadratureIntegrator1D.hashCode());
  }

  /**
   * Test {@link GaussianQuadratureIntegrator1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GaussianQuadratureIntegrator1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GaussianQuadratureIntegrator1D.equals(Object)",
    "int GaussianQuadratureIntegrator1D.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GaussHermiteQuadratureIntegrator1D(1), 1);
  }

  /**
   * Test {@link GaussianQuadratureIntegrator1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GaussianQuadratureIntegrator1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GaussianQuadratureIntegrator1D.equals(Object)",
    "int GaussianQuadratureIntegrator1D.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new GaussHermiteQuadratureIntegrator1D(1), null);
  }

  /**
   * Test {@link GaussianQuadratureIntegrator1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GaussianQuadratureIntegrator1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GaussianQuadratureIntegrator1D.equals(Object)",
    "int GaussianQuadratureIntegrator1D.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new GaussHermiteQuadratureIntegrator1D(1),
        "Different type to GaussianQuadratureIntegrator1D");
  }
}
