package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

class RungeKuttaIntegrator1DDiffblueTest {
  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D()}.
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D()}
   */
  @Test
  @DisplayName("Test new RungeKuttaIntegrator1D()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>()"})
  void testNewRungeKuttaIntegrator1D() {
    // Arrange, Act and Assert
    assertEquals(1.0E-10d, new RungeKuttaIntegrator1D().getRelativeTolerance());
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double); when '-1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double)"})
  void testNewRungeKuttaIntegrator1D_when10e10_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(-1.0E-10d));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, double); when '-1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, double)"})
  void testNewRungeKuttaIntegrator1D_when10e10_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(-1.0E-10d, 0.0d));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double, int)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double,
   * int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, double, int); when '-1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, double, int)"})
  void testNewRungeKuttaIntegrator1D_when10e10_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(0.0d, -1.0E-10d, 1));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double, int)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double,
   * int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, double, int); when '-1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, double, int)"})
  void testNewRungeKuttaIntegrator1D_when10e10_thenThrowIllegalArgumentException4() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(-1.0E-10d, 0.0d, 1));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, int)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, int); when '-1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, int)"})
  void testNewRungeKuttaIntegrator1D_when10e10_thenThrowIllegalArgumentException5() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(-1.0E-10d, 1));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double); when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double)"})
  void testNewRungeKuttaIntegrator1D_whenNaN_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(Double.NaN));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, double); when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, double)"})
  void testNewRungeKuttaIntegrator1D_whenNaN_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(Double.NaN, 10.0d));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, double); when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, double)"})
  void testNewRungeKuttaIntegrator1D_whenNaN_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(10.0d, Double.NaN));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double, int)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double,
   * int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, double, int); when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, double, int)"})
  void testNewRungeKuttaIntegrator1D_whenNaN_thenThrowIllegalArgumentException4() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(Double.NaN, 10.0d, 1));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double, int)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double,
   * int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, double, int); when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, double, int)"})
  void testNewRungeKuttaIntegrator1D_whenNaN_thenThrowIllegalArgumentException5() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(10.0d, Double.NaN, 1));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, int)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, int); when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, int)"})
  void testNewRungeKuttaIntegrator1D_whenNaN_thenThrowIllegalArgumentException6() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(Double.NaN, 1));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return RelativeTolerance is {@code 1.0E-10}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(int); when one; then return RelativeTolerance is '1.0E-10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(int)"})
  void testNewRungeKuttaIntegrator1D_whenOne_thenReturnRelativeToleranceIs10e10() {
    // Arrange, Act and Assert
    assertEquals(1.0E-10d, new RungeKuttaIntegrator1D(1).getRelativeTolerance());
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return RelativeTolerance is ten.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double); when ten; then return RelativeTolerance is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double)"})
  void testNewRungeKuttaIntegrator1D_whenTen_thenReturnRelativeToleranceIsTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new RungeKuttaIntegrator1D(10.0d).getRelativeTolerance());
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return RelativeTolerance is ten.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, double); when ten; then return RelativeTolerance is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, double)"})
  void testNewRungeKuttaIntegrator1D_whenTen_thenReturnRelativeToleranceIsTen2() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new RungeKuttaIntegrator1D(10.0d, 10.0d).getRelativeTolerance());
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double, int)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return RelativeTolerance is ten.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double,
   * int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, double, int); when ten; then return RelativeTolerance is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, double, int)"})
  void testNewRungeKuttaIntegrator1D_whenTen_thenReturnRelativeToleranceIsTen3() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new RungeKuttaIntegrator1D(10.0d, 10.0d, 1).getRelativeTolerance());
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, int)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return RelativeTolerance is ten.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, int); when ten; then return RelativeTolerance is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, int)"})
  void testNewRungeKuttaIntegrator1D_whenTen_thenReturnRelativeToleranceIsTen4() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new RungeKuttaIntegrator1D(10.0d, 1).getRelativeTolerance());
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, double); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, double)"})
  void testNewRungeKuttaIntegrator1D_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(0.0d, -1.0E-10d));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, double,
   * int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, double, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, double, int)"})
  void testNewRungeKuttaIntegrator1D_whenZero_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(0.0d, 0.0d, 0));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(double, int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(double, int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(double, int)"})
  void testNewRungeKuttaIntegrator1D_whenZero_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(0.0d, 0));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#RungeKuttaIntegrator1D(int)}
   */
  @Test
  @DisplayName(
      "Test new RungeKuttaIntegrator1D(int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RungeKuttaIntegrator1D.<init>(int)"})
  void testNewRungeKuttaIntegrator1D_whenZero_thenThrowIllegalArgumentException4() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> new RungeKuttaIntegrator1D(0));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#getRelativeTolerance()}.
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#getRelativeTolerance()}
   */
  @Test
  @DisplayName("Test getRelativeTolerance()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RungeKuttaIntegrator1D.getRelativeTolerance()"})
  void testGetRelativeTolerance() {
    // Arrange, Act and Assert
    assertEquals(1.0E-10d, new RungeKuttaIntegrator1D().getRelativeTolerance());
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RungeKuttaIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenIllegalArgumentException() {
    // Arrange
    RungeKuttaIntegrator1D rungeKuttaIntegrator1D = new RungeKuttaIntegrator1D();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> rungeKuttaIntegrator1D.integrate(f, 10.0d, 10.0d));
    verify(f).apply(10.0d);
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given {@link Double#NaN}.
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given NaN; when Function apply(Object) return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RungeKuttaIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenNaN_whenFunctionApplyReturnNaN() {
    // Arrange
    RungeKuttaIntegrator1D rungeKuttaIntegrator1D = new RungeKuttaIntegrator1D();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(Double.NaN);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> rungeKuttaIntegrator1D.integrate(f, 10.0d, 10.0d));
    verify(f).apply(10.0d);
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; given ten; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RungeKuttaIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_givenTen_thenReturnDoubleValueIsZero() {
    // Arrange
    RungeKuttaIntegrator1D rungeKuttaIntegrator1D = new RungeKuttaIntegrator1D();

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult = rungeKuttaIntegrator1D.integrate(f, 10.0d, 10.0d);

    // Assert
    verify(f, atLeast(1)).apply(10.0d);
    assertEquals(0.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RungeKuttaIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_thenReturnDoubleValueIsZero() {
    // Arrange
    RungeKuttaIntegrator1D rungeKuttaIntegrator1D = new RungeKuttaIntegrator1D(0.0d);

    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult = rungeKuttaIntegrator1D.integrate(f, 10.0d, 10.0d);

    // Assert
    verify(f, atLeast(1)).apply(10.0d);
    assertEquals(0.0d, actualIntegrateResult.doubleValue());
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>When {@link Function}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; when Function")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RungeKuttaIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_whenFunction() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new RungeKuttaIntegrator1D().integrate(mock(Function.class), Double.NaN, 10.0d));
  }

  /**
   * Test {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)} with {@code Function},
   * {@code Double}, {@code Double}.
   *
   * <ul>
   *   <li>When {@link Function}.
   * </ul>
   *
   * <p>Method under test: {@link RungeKuttaIntegrator1D#integrate(Function, Double, Double)}
   */
  @Test
  @DisplayName(
      "Test integrate(Function, Double, Double) with 'Function', 'Double', 'Double'; when Function")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double RungeKuttaIntegrator1D.integrate(Function, Double, Double)"})
  void testIntegrateWithFunctionDoubleDouble_whenFunction2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new RungeKuttaIntegrator1D().integrate(mock(Function.class), 10.0d, Double.NaN));
  }
}
