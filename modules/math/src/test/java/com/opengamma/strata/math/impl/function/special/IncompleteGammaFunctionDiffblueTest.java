package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.MathException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IncompleteGammaFunctionDiffblueTest {
  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int, double)}.
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int,
   * double)}
   */
  @Test
  @DisplayName("Test new IncompleteGammaFunction(double, int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double, int, double)"})
  void testNewIncompleteGammaFunction() {
    // Arrange, Act and Assert
    assertEquals(
        4.6468769320892686E-5d,
        new IncompleteGammaFunction(10.0d, 100000, 0.015625d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int, double)}.
   *
   * <ul>
   *   <li>Then return apply ten doubleValue is {@code 0.5348837809242959}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double, int, double); then return apply ten doubleValue is '0.5348837809242959'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double, int, double)"})
  void testNewIncompleteGammaFunction_thenReturnApplyTenDoubleValueIs05348837809242959() {
    // Arrange, Act and Assert
    assertEquals(
        0.5348837809242959d,
        new IncompleteGammaFunction(10.0d, 100000, 0.015625d).apply(10.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}.
   *
   * <ul>
   *   <li>Then return apply ten doubleValue is {@code 0.5420702855281083}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double); then return apply ten doubleValue is '0.5420702855281083'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double)"})
  void testNewIncompleteGammaFunction_thenReturnApplyTenDoubleValueIs05420702855281083() {
    // Arrange, Act and Assert
    assertEquals(
        0.5420702855281083d, new IncompleteGammaFunction(10.0d).apply(10.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}.
   *
   * <ul>
   *   <li>Then return apply two doubleValue is {@code 0.954499736103698}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double); then return apply two doubleValue is '0.954499736103698'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double)"})
  void testNewIncompleteGammaFunction_thenReturnApplyTwoDoubleValueIs0954499736103698() {
    // Arrange, Act and Assert
    assertEquals(0.954499736103698d, new IncompleteGammaFunction(0.5d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int, double)}.
   *
   * <ul>
   *   <li>Then return apply two doubleValue is {@code 0.954556701531986}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double, int, double); then return apply two doubleValue is '0.954556701531986'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double, int, double)"})
  void testNewIncompleteGammaFunction_thenReturnApplyTwoDoubleValueIs0954556701531986() {
    // Arrange, Act and Assert
    assertEquals(
        0.954556701531986d,
        new IncompleteGammaFunction(0.5d, 3, 0.015625d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}.
   *
   * <ul>
   *   <li>Then return apply two doubleValue is {@code 4.649807501725987E-5}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double); then return apply two doubleValue is '4.649807501725987E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double)"})
  void testNewIncompleteGammaFunction_thenReturnApplyTwoDoubleValueIs4649807501725987e5() {
    // Arrange, Act and Assert
    assertEquals(
        4.649807501725987E-5d, new IncompleteGammaFunction(10.0d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}.
   *
   * <ul>
   *   <li>Then return apply two doubleValue is {@code 0.9999999999951099}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double); then return apply two doubleValue is '0.9999999999951099'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double)"})
  void testNewIncompleteGammaFunction_thenReturnApplyTwoDoubleValueIs09999999999951099() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999951099d, new IncompleteGammaFunction(1.0E-10d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int, double)}.
   *
   * <ul>
   *   <li>Then return apply two doubleValue is {@code 0.9999999999999513}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double, int, double); then return apply two doubleValue is '0.9999999999999513'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double, int, double)"})
  void testNewIncompleteGammaFunction_thenReturnApplyTwoDoubleValueIs09999999999999513() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999513d,
        new IncompleteGammaFunction(1.0E-12d, 3, 0.015625d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return apply two doubleValue is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double); when NaN; then return apply two doubleValue is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double)"})
  void testNewIncompleteGammaFunction_whenNaN_thenReturnApplyTwoDoubleValueIsNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new IncompleteGammaFunction(Double.NaN).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return apply two doubleValue is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double, int, double); when NaN; then return apply two doubleValue is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double, int, double)"})
  void testNewIncompleteGammaFunction_whenNaN_thenReturnApplyTwoDoubleValueIsNaN2() {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN,
        new IncompleteGammaFunction(Double.NaN, 3, 0.015625d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return apply {@code -0.5} doubleValue is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double); when ten; then return apply '-0.5' doubleValue is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double)"})
  void testNewIncompleteGammaFunction_whenTen_thenReturnApply05DoubleValueIsNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new IncompleteGammaFunction(10.0d).apply(-0.5d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return apply {@code -0.5} doubleValue is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double, int, double); when ten; then return apply '-0.5' doubleValue is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double, int, double)"})
  void testNewIncompleteGammaFunction_whenTen_thenReturnApply05DoubleValueIsNaN2() {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN, new IncompleteGammaFunction(10.0d, 3, 0.015625d).apply(-0.5d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return apply {@link Double#NaN} doubleValue is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double); when ten; then return apply NaN doubleValue is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double)"})
  void testNewIncompleteGammaFunction_whenTen_thenReturnApplyNaNDoubleValueIsNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new IncompleteGammaFunction(10.0d).apply(Double.NaN).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return apply {@link Double#NaN} doubleValue is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#IncompleteGammaFunction(double, int,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new IncompleteGammaFunction(double, int, double); when ten; then return apply NaN doubleValue is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IncompleteGammaFunction.<init>(double, int, double)"})
  void testNewIncompleteGammaFunction_whenTen_thenReturnApplyNaNDoubleValueIsNaN2() {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN,
        new IncompleteGammaFunction(10.0d, 3, 0.015625d).apply(Double.NaN).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class, () -> new IncompleteGammaFunction(10.0d, 3, 0.015625d).apply(2.0d));
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble2() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class, () -> new IncompleteGammaFunction(10.0d, 1, 0.015625d).apply(2.0d));
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble3() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class, () -> new IncompleteGammaFunction(1.0E-12d, 1, 0.015625d).apply(2.0d));
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteGammaFunction#IncompleteGammaFunction(double)} with a is {@code
   *       0.5}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteGammaFunction(double) with a is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteGammaFunctionWithAIs05() {
    // Arrange, Act and Assert
    assertEquals(0.954499736103698d, new IncompleteGammaFunction(0.5d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteGammaFunction#IncompleteGammaFunction(double)} with a is {@code
   *       1.0E-10}.
   *   <li>When {@code -1.0E-10}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteGammaFunction(double) with a is '1.0E-10'; when '-1.0E-10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteGammaFunctionWithAIs10e10_when10e10() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new IncompleteGammaFunction(1.0E-10d).apply(-1.0E-10d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteGammaFunction#IncompleteGammaFunction(double)} with a is {@code
   *       0.49999999999999994}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteGammaFunction(double) with a is '0.49999999999999994'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteGammaFunctionWithAIs049999999999999994() {
    // Arrange, Act and Assert
    assertEquals(
        0.954499736103698d,
        new IncompleteGammaFunction(0.49999999999999994d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Given {@link IncompleteGammaFunction#IncompleteGammaFunction(double)} with a is {@link
   *       Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; given IncompleteGammaFunction(double) with a is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble_givenIncompleteGammaFunctionWithAIsNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new IncompleteGammaFunction(Double.NaN).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.4505840486471998}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; then return doubleValue is '0.4505840486471998'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs04505840486471998() {
    // Arrange, Act and Assert
    assertEquals(0.4505840486471998d, new IncompleteGammaFunction(2.5d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 4.649807501725987E-5}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; then return doubleValue is '4.649807501725987E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs4649807501725987e5() {
    // Arrange, Act and Assert
    assertEquals(
        4.649807501725987E-5d, new IncompleteGammaFunction(10.0d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.9999999999999512}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; then return doubleValue is '0.9999999999999512'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs09999999999999512() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999512d, new IncompleteGammaFunction(1.0E-12d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 0.45058404864719975}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; then return doubleValue is '0.45058404864719975'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIs045058404864719975() {
    // Arrange, Act and Assert
    assertEquals(
        0.45058404864719975d,
        new IncompleteGammaFunction(2.5000000000000004d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return doubleValue is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; when NaN; then return doubleValue is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble_whenNaN_thenReturnDoubleValueIsNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new IncompleteGammaFunction(10.0d).apply(Double.NaN).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return doubleValue is {@code 0.5420702855281083}.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; when ten; then return doubleValue is '0.5420702855281083'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble_whenTen_thenReturnDoubleValueIs05420702855281083() {
    // Arrange, Act and Assert
    assertEquals(
        0.5420702855281083d, new IncompleteGammaFunction(10.0d).apply(10.0d).doubleValue());
  }

  /**
   * Test {@link IncompleteGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link IncompleteGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; when zero; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IncompleteGammaFunction.apply(Double)"})
  void testApplyWithDouble_whenZero_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new IncompleteGammaFunction(1.0E-10d).apply(0.0d).doubleValue());
  }
}
