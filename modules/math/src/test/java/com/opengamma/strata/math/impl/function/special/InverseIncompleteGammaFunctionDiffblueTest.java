package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InverseIncompleteGammaFunctionDiffblueTest {
  /**
   * Test {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 7.85398163397448E-17}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when '0.5'; then return '7.85398163397448E-17'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InverseIncompleteGammaFunction.applyAsDouble(double, double)"})
  void testApplyAsDouble_when05_thenReturn785398163397448e17() {
    // Arrange, Act and Assert
    assertEquals(
        7.85398163397448E-17d, new InverseIncompleteGammaFunction().applyAsDouble(0.5d, 1.0E-8d));
  }

  /**
   * Test {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 9.668714614714604}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when '0.5'; then return '9.668714614714604'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InverseIncompleteGammaFunction.applyAsDouble(double, double)"})
  void testApplyAsDouble_when05_thenReturn9668714614714604() {
    // Arrange, Act and Assert
    assertEquals(
        9.668714614714604d, new InverseIncompleteGammaFunction().applyAsDouble(10.0d, 0.5d));
  }

  /**
   * Test {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-8}.
   *   <li>Then return {@code 0.7696086530117636}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test applyAsDouble(double, double); when '1.0E-8'; then return '0.7696086530117636'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InverseIncompleteGammaFunction.applyAsDouble(double, double)"})
  void testApplyAsDouble_when10e8_thenReturn07696086530117636() {
    // Arrange, Act and Assert
    assertEquals(
        0.7696086530117636d, new InverseIncompleteGammaFunction().applyAsDouble(10.0d, 1.0E-8d));
  }

  /**
   * Test {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-8}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when '1.0E-8'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InverseIncompleteGammaFunction.applyAsDouble(double, double)"})
  void testApplyAsDouble_when10e8_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new InverseIncompleteGammaFunction().applyAsDouble(1.0E-8d, 1.0E-8d));
  }

  /**
   * Test {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.99229}.
   *   <li>Then return {@code 19.245144910153275}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test applyAsDouble(double, double); when '0.99229'; then return '19.245144910153275'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InverseIncompleteGammaFunction.applyAsDouble(double, double)"})
  void testApplyAsDouble_when099229_thenReturn19245144910153275() {
    // Arrange, Act and Assert
    assertEquals(
        19.245144910153275d, new InverseIncompleteGammaFunction().applyAsDouble(10.0d, 0.99229d));
  }

  /**
   * Test {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 2.30753}.
   *   <li>Then return {@code 5.252986355495901E-4}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName(
      "Test applyAsDouble(double, double); when '2.30753'; then return '5.252986355495901E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InverseIncompleteGammaFunction.applyAsDouble(double, double)"})
  void testApplyAsDouble_when230753_thenReturn5252986355495901e4() {
    // Arrange, Act and Assert
    assertEquals(
        5.252986355495901E-4d,
        new InverseIncompleteGammaFunction().applyAsDouble(2.30753d, 1.0E-8d));
  }

  /**
   * Test {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InverseIncompleteGammaFunction.applyAsDouble(double, double)"})
  void testApplyAsDouble_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new InverseIncompleteGammaFunction().applyAsDouble(10.0d, Double.NaN));
  }

  /**
   * Test {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InverseIncompleteGammaFunction.applyAsDouble(double, double)"})
  void testApplyAsDouble_whenNaN_thenReturnNaN2() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new InverseIncompleteGammaFunction().applyAsDouble(1.0d, Double.NaN));
  }

  /**
   * Test {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.6931471805599488}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when one; then return '0.6931471805599488'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InverseIncompleteGammaFunction.applyAsDouble(double, double)"})
  void testApplyAsDouble_whenOne_thenReturn06931471805599488() {
    // Arrange, Act and Assert
    assertEquals(
        0.6931471805599488d, new InverseIncompleteGammaFunction().applyAsDouble(1.0d, 0.5d));
  }

  /**
   * Test {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 1.0000000050000013E-8}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when one; then return '1.0000000050000013E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InverseIncompleteGammaFunction.applyAsDouble(double, double)"})
  void testApplyAsDouble_whenOne_thenReturn10000000050000013e8() {
    // Arrange, Act and Assert
    assertEquals(
        1.0000000050000013E-8d, new InverseIncompleteGammaFunction().applyAsDouble(1.0d, 1.0E-8d));
  }

  /**
   * Test {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@code 2.6740603137236416}.
   * </ul>
   *
   * <p>Method under test: {@link InverseIncompleteGammaFunction#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when three; then return '2.6740603137236416'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double InverseIncompleteGammaFunction.applyAsDouble(double, double)"})
  void testApplyAsDouble_whenThree_thenReturn26740603137236416() {
    // Arrange, Act and Assert
    assertEquals(
        2.6740603137236416d, new InverseIncompleteGammaFunction().applyAsDouble(3.0d, 0.5d));
  }

  /**
   * Test new {@link InverseIncompleteGammaFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * InverseIncompleteGammaFunction}
   */
  @Test
  @DisplayName("Test new InverseIncompleteGammaFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteGammaFunction.<init>()"})
  void testNewInverseIncompleteGammaFunction() {
    // Arrange, Act and Assert
    assertEquals(
        0.7696086530117636d, new InverseIncompleteGammaFunction().applyAsDouble(10.0d, 1.0E-8d));
  }

  /**
   * Test new {@link InverseIncompleteGammaFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * InverseIncompleteGammaFunction}
   */
  @Test
  @DisplayName("Test new InverseIncompleteGammaFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteGammaFunction.<init>()"})
  void testNewInverseIncompleteGammaFunction2() {
    // Arrange, Act and Assert
    assertEquals(
        9.668714614714604d, new InverseIncompleteGammaFunction().applyAsDouble(10.0d, 0.5d));
  }

  /**
   * Test new {@link InverseIncompleteGammaFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * InverseIncompleteGammaFunction}
   */
  @Test
  @DisplayName("Test new InverseIncompleteGammaFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteGammaFunction.<init>()"})
  void testNewInverseIncompleteGammaFunction3() {
    // Arrange, Act and Assert
    assertEquals(
        1.0000000050000013E-8d, new InverseIncompleteGammaFunction().applyAsDouble(1.0d, 1.0E-8d));
  }

  /**
   * Test new {@link InverseIncompleteGammaFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * InverseIncompleteGammaFunction}
   */
  @Test
  @DisplayName("Test new InverseIncompleteGammaFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteGammaFunction.<init>()"})
  void testNewInverseIncompleteGammaFunction4() {
    // Arrange, Act and Assert
    assertEquals(
        7.85398163397448E-17d, new InverseIncompleteGammaFunction().applyAsDouble(0.5d, 1.0E-8d));
  }

  /**
   * Test new {@link InverseIncompleteGammaFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * InverseIncompleteGammaFunction}
   */
  @Test
  @DisplayName("Test new InverseIncompleteGammaFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteGammaFunction.<init>()"})
  void testNewInverseIncompleteGammaFunction5() {
    // Arrange, Act and Assert
    assertEquals(
        5.252986355495901E-4d,
        new InverseIncompleteGammaFunction().applyAsDouble(2.30753d, 1.0E-8d));
  }

  /**
   * Test new {@link InverseIncompleteGammaFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * InverseIncompleteGammaFunction}
   */
  @Test
  @DisplayName("Test new InverseIncompleteGammaFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteGammaFunction.<init>()"})
  void testNewInverseIncompleteGammaFunction6() {
    // Arrange, Act and Assert
    assertEquals(
        19.245144910153275d, new InverseIncompleteGammaFunction().applyAsDouble(10.0d, 0.99229d));
  }

  /**
   * Test new {@link InverseIncompleteGammaFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * InverseIncompleteGammaFunction}
   */
  @Test
  @DisplayName("Test new InverseIncompleteGammaFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteGammaFunction.<init>()"})
  void testNewInverseIncompleteGammaFunction7() {
    // Arrange, Act and Assert
    assertEquals(
        2.6740603137236416d, new InverseIncompleteGammaFunction().applyAsDouble(3.0d, 0.5d));
  }

  /**
   * Test new {@link InverseIncompleteGammaFunction} (default constructor).
   *
   * <ul>
   *   <li>Then return applyAsDouble {@code 1.0E-8} and {@code 1.0E-8} is zero.
   * </ul>
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * InverseIncompleteGammaFunction}
   */
  @Test
  @DisplayName(
      "Test new InverseIncompleteGammaFunction (default constructor); then return applyAsDouble '1.0E-8' and '1.0E-8' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteGammaFunction.<init>()"})
  void testNewInverseIncompleteGammaFunction_thenReturnApplyAsDouble10e8And10e8IsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new InverseIncompleteGammaFunction().applyAsDouble(1.0E-8d, 1.0E-8d));
  }

  /**
   * Test new {@link InverseIncompleteGammaFunction} (default constructor).
   *
   * <ul>
   *   <li>Then return applyAsDouble one and {@link Double#NaN} is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * InverseIncompleteGammaFunction}
   */
  @Test
  @DisplayName(
      "Test new InverseIncompleteGammaFunction (default constructor); then return applyAsDouble one and NaN is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteGammaFunction.<init>()"})
  void testNewInverseIncompleteGammaFunction_thenReturnApplyAsDoubleOneAndNaNIsNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new InverseIncompleteGammaFunction().applyAsDouble(1.0d, Double.NaN));
  }

  /**
   * Test new {@link InverseIncompleteGammaFunction} (default constructor).
   *
   * <ul>
   *   <li>Then return applyAsDouble ten and {@link Double#NaN} is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * InverseIncompleteGammaFunction}
   */
  @Test
  @DisplayName(
      "Test new InverseIncompleteGammaFunction (default constructor); then return applyAsDouble ten and NaN is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void InverseIncompleteGammaFunction.<init>()"})
  void testNewInverseIncompleteGammaFunction_thenReturnApplyAsDoubleTenAndNaNIsNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, new InverseIncompleteGammaFunction().applyAsDouble(10.0d, Double.NaN));
  }
}
