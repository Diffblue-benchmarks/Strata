package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
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
}
