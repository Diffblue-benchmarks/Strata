package com.opengamma.strata.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MathUtilsDiffblueTest {
  /**
   * Test {@link MathUtils#pow2(double)}.
   *
   * <p>Method under test: {@link MathUtils#pow2(double)}
   */
  @Test
  @DisplayName("Test pow2(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MathUtils.pow2(double)"})
  void testPow2() {
    // Arrange, Act and Assert
    assertEquals(100.0d, MathUtils.pow2(10.0d));
  }

  /**
   * Test {@link MathUtils#pow3(double)}.
   *
   * <p>Method under test: {@link MathUtils#pow3(double)}
   */
  @Test
  @DisplayName("Test pow3(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MathUtils.pow3(double)"})
  void testPow3() {
    // Arrange, Act and Assert
    assertEquals(1000.0d, MathUtils.pow3(10.0d));
  }

  /**
   * Test {@link MathUtils#pow4(double)}.
   *
   * <p>Method under test: {@link MathUtils#pow4(double)}
   */
  @Test
  @DisplayName("Test pow4(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MathUtils.pow4(double)"})
  void testPow4() {
    // Arrange, Act and Assert
    assertEquals(10000.0d, MathUtils.pow4(10.0d));
  }

  /**
   * Test {@link MathUtils#nearZero(double, double)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MathUtils#nearZero(double, double)}
   */
  @Test
  @DisplayName("Test nearZero(double, double); when minus ten; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MathUtils.nearZero(double, double)"})
  void testNearZero_whenMinusTen_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MathUtils.nearZero(10.0d, -10.0d));
  }

  /**
   * Test {@link MathUtils#nearZero(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MathUtils#nearZero(double, double)}
   */
  @Test
  @DisplayName("Test nearZero(double, double); when NaN; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MathUtils.nearZero(double, double)"})
  void testNearZero_whenNaN_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MathUtils.nearZero(Double.NaN, 10.0d));
  }

  /**
   * Test {@link MathUtils#nearZero(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MathUtils#nearZero(double, double)}
   */
  @Test
  @DisplayName("Test nearZero(double, double); when ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MathUtils.nearZero(double, double)"})
  void testNearZero_whenTen_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(MathUtils.nearZero(10.0d, 10.0d));
  }

  /**
   * Test {@link MathUtils#nearOne(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MathUtils#nearOne(double, double)}
   */
  @Test
  @DisplayName("Test nearOne(double, double); when NaN; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MathUtils.nearOne(double, double)"})
  void testNearOne_whenNaN_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MathUtils.nearOne(Double.NaN, 10.0d));
  }

  /**
   * Test {@link MathUtils#nearOne(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MathUtils#nearOne(double, double)}
   */
  @Test
  @DisplayName("Test nearOne(double, double); when one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MathUtils.nearOne(double, double)"})
  void testNearOne_whenOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(MathUtils.nearOne(10.0d, 1.0d));
  }

  /**
   * Test {@link MathUtils#nearOne(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MathUtils#nearOne(double, double)}
   */
  @Test
  @DisplayName("Test nearOne(double, double); when ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MathUtils.nearOne(double, double)"})
  void testNearOne_whenTen_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(MathUtils.nearOne(10.0d, 10.0d));
  }
}
