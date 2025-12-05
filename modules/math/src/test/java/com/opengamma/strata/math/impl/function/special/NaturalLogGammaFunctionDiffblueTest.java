package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NaturalLogGammaFunctionDiffblueTest {
  /**
   * Test {@link NaturalLogGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return doubleValue is {@code 0.5723649429247001}.
   * </ul>
   *
   * <p>Method under test: {@link NaturalLogGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; when '0.5'; then return doubleValue is '0.5723649429247001'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double NaturalLogGammaFunction.apply(Double)"})
  void testApplyWithDouble_when05_thenReturnDoubleValueIs05723649429247001() {
    // Arrange, Act and Assert
    assertEquals(0.5723649429247001d, new NaturalLogGammaFunction().apply(0.5d).doubleValue());
  }

  /**
   * Test {@link NaturalLogGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return doubleValue is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link NaturalLogGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; when one; then return doubleValue is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double NaturalLogGammaFunction.apply(Double)"})
  void testApplyWithDouble_whenOne_thenReturnDoubleValueIs00() {
    // Arrange, Act and Assert
    assertEquals(-0.0d, new NaturalLogGammaFunction().apply(1.0d).doubleValue());
  }

  /**
   * Test {@link NaturalLogGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return doubleValue is {@code 12.801827480081469}.
   * </ul>
   *
   * <p>Method under test: {@link NaturalLogGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; when ten; then return doubleValue is '12.801827480081469'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double NaturalLogGammaFunction.apply(Double)"})
  void testApplyWithDouble_whenTen_thenReturnDoubleValueIs12801827480081469() {
    // Arrange, Act and Assert
    assertEquals(12.801827480081469d, new NaturalLogGammaFunction().apply(10.0d).doubleValue());
  }

  /**
   * Test {@link NaturalLogGammaFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link NaturalLogGammaFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; when two; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double NaturalLogGammaFunction.apply(Double)"})
  void testApplyWithDouble_whenTwo_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new NaturalLogGammaFunction().apply(2.0d).doubleValue());
  }
}
