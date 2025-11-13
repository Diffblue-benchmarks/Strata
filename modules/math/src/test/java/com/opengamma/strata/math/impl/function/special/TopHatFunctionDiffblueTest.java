package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TopHatFunctionDiffblueTest {
  /**
   * Test {@link TopHatFunction#TopHatFunction(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return apply {@code 0.5} doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link TopHatFunction#TopHatFunction(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test new TopHatFunction(double, double, double); when one; then return apply '0.5' doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TopHatFunction.<init>(double, double, double)"})
  void testNewTopHatFunction_whenOne_thenReturnApply05DoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new TopHatFunction(1.0d, 10.0d, 3.0d).apply(0.5d).doubleValue());
  }

  /**
   * Test {@link TopHatFunction#TopHatFunction(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return apply two doubleValue is three.
   * </ul>
   *
   * <p>Method under test: {@link TopHatFunction#TopHatFunction(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test new TopHatFunction(double, double, double); when one; then return apply two doubleValue is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TopHatFunction.<init>(double, double, double)"})
  void testNewTopHatFunction_whenOne_thenReturnApplyTwoDoubleValueIsThree() {
    // Arrange, Act and Assert
    assertEquals(3.0d, new TopHatFunction(1.0d, 10.0d, 3.0d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link TopHatFunction#TopHatFunction(double, double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return apply ten doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link TopHatFunction#TopHatFunction(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test new TopHatFunction(double, double, double); when two; then return apply ten doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TopHatFunction.<init>(double, double, double)"})
  void testNewTopHatFunction_whenTwo_thenReturnApplyTenDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new TopHatFunction(1.0d, 2.0d, 3.0d).apply(10.0d).doubleValue());
  }

  /**
   * Test {@link TopHatFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>Then return doubleValue is three.
   * </ul>
   *
   * <p>Method under test: {@link TopHatFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; then return doubleValue is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double TopHatFunction.apply(Double)"})
  void testApplyWithDouble_thenReturnDoubleValueIsThree() {
    // Arrange, Act and Assert
    assertEquals(3.0d, new TopHatFunction(1.0d, 10.0d, 3.0d).apply(2.0d).doubleValue());
  }

  /**
   * Test {@link TopHatFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link TopHatFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; when '0.5'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double TopHatFunction.apply(Double)"})
  void testApplyWithDouble_when05_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new TopHatFunction(1.0d, 10.0d, 3.0d).apply(0.5d).doubleValue());
  }

  /**
   * Test {@link TopHatFunction#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link TopHatFunction#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; when ten; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double TopHatFunction.apply(Double)"})
  void testApplyWithDouble_whenTen_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new TopHatFunction(1.0d, 2.0d, 3.0d).apply(10.0d).doubleValue());
  }
}
