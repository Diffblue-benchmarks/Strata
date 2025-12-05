package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AdaptiveCompositeIntegrator1DDiffblueTest {
  /**
   * Test {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName("Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double AdaptiveCompositeIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            new AdaptiveCompositeIntegrator1D(
                    new AdaptiveCompositeIntegrator1D(
                        RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d),
                    10.0d,
                    10.0d)
                .integrate(mock(Function.class), 10.0d, 10.0d));
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given {@code 1.0E-14}.
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code 1.0E-14}.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given '1.0E-14'; when Function apply(Object) return '1.0E-14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double AdaptiveCompositeIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_given10e14_whenFunctionApplyReturn10e14() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(new ExtendedTrapezoidIntegrator1D(), 0.0d, 10.0d);

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(1.0E-14d);

    // Act
    Double actualIntegrateResult = adaptiveCompositeIntegrator1D.integrate(f, 2.0d, 10.0d);

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(Double.NaN, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IllegalStateException#IllegalStateException()}.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given IllegalStateException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double AdaptiveCompositeIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenIllegalStateException() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d);

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(
        IllegalStateException.class,
        () -> adaptiveCompositeIntegrator1D.integrate(f, 1.0E-14d, 10.0d));
    verify(f).apply(1.0E-14d);
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double AdaptiveCompositeIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIs00() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(new RungeKuttaIntegrator1D(), 10.0d, 10.0d);

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult = adaptiveCompositeIntegrator1D.integrate(f, 10.0d, 10.0d);

    // Assert
    verify(f, atLeast(1)).apply(10.0d);
    assertEquals(-0.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is eighty.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is eighty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double AdaptiveCompositeIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIsEighty() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(new RungeKuttaIntegrator1D(), 10.0d, 10.0d);

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult = adaptiveCompositeIntegrator1D.integrate(f, 2.0d, 10.0d);

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(80.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is eighty.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is eighty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double AdaptiveCompositeIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIsEighty2() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(
            new AdaptiveCompositeIntegrator1D(
                RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d),
            10.0d,
            10.0d);

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult = adaptiveCompositeIntegrator1D.integrate(f, 2.0d, 10.0d);

    // Assert
    verify(f, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(80.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double AdaptiveCompositeIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIsNaN() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(new RungeKuttaIntegrator1D(), 0.0d, 10.0d);

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult = adaptiveCompositeIntegrator1D.integrate(f, 10.0d, 10.0d);

    // Assert
    verify(f, atLeast(1)).apply(10.0d);
    assertEquals(Double.NaN, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)} with {@code
   * Function}, {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double AdaptiveCompositeIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenThrowIllegalStateException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalStateException.class,
        () ->
            new AdaptiveCompositeIntegrator1D(
                    RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d)
                .integrate(mock(Function.class), 10.0d, 10.0d));
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#equals(Object)}, and {@link
   * AdaptiveCompositeIntegrator1D#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdaptiveCompositeIntegrator1D#equals(Object)}
   *   <li>{@link AdaptiveCompositeIntegrator1D#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdaptiveCompositeIntegrator1D.equals(Object)",
    "int AdaptiveCompositeIntegrator1D.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d);
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D2 =
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(adaptiveCompositeIntegrator1D, adaptiveCompositeIntegrator1D2);
    assertEquals(
        adaptiveCompositeIntegrator1D.hashCode(), adaptiveCompositeIntegrator1D2.hashCode());
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#equals(Object)}, and {@link
   * AdaptiveCompositeIntegrator1D#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AdaptiveCompositeIntegrator1D#equals(Object)}
   *   <li>{@link AdaptiveCompositeIntegrator1D#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdaptiveCompositeIntegrator1D.equals(Object)",
    "int AdaptiveCompositeIntegrator1D.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(adaptiveCompositeIntegrator1D, adaptiveCompositeIntegrator1D);
    int expectedHashCodeResult = adaptiveCompositeIntegrator1D.hashCode();
    assertEquals(expectedHashCodeResult, adaptiveCompositeIntegrator1D.hashCode());
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdaptiveCompositeIntegrator1D.equals(Object)",
    "int AdaptiveCompositeIntegrator1D.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.ROMBERG_INSTANCE, 10.0d, 10.0d);

    // Act and Assert
    assertNotEquals(
        adaptiveCompositeIntegrator1D,
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d));
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdaptiveCompositeIntegrator1D.equals(Object)",
    "int AdaptiveCompositeIntegrator1D.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(
            new AdaptiveCompositeIntegrator1D(
                RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d),
            10.0d,
            10.0d);

    // Act and Assert
    assertNotEquals(
        adaptiveCompositeIntegrator1D,
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d));
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdaptiveCompositeIntegrator1D.equals(Object)",
    "int AdaptiveCompositeIntegrator1D.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 1.0E-14d, 10.0d);

    // Act and Assert
    assertNotEquals(
        adaptiveCompositeIntegrator1D,
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d));
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdaptiveCompositeIntegrator1D.equals(Object)",
    "int AdaptiveCompositeIntegrator1D.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    AdaptiveCompositeIntegrator1D adaptiveCompositeIntegrator1D =
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 1.0E-14d);

    // Act and Assert
    assertNotEquals(
        adaptiveCompositeIntegrator1D,
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d));
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdaptiveCompositeIntegrator1D.equals(Object)",
    "int AdaptiveCompositeIntegrator1D.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d),
        null);
  }

  /**
   * Test {@link AdaptiveCompositeIntegrator1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AdaptiveCompositeIntegrator1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AdaptiveCompositeIntegrator1D.equals(Object)",
    "int AdaptiveCompositeIntegrator1D.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new AdaptiveCompositeIntegrator1D(
            RealFunctionIntegrator1DFactory.EXTENDED_TRAPEZOID_INSTANCE, 10.0d, 10.0d),
        "Different type to AdaptiveCompositeIntegrator1D");
  }
}
