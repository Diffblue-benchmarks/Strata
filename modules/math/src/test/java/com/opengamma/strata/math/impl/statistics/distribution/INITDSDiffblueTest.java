package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.MathException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class INITDSDiffblueTest {
  /**
   * Test {@link INITDS#getInitds(double[], int, double)}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link INITDS#getInitds(double[], int, double)}
   */
  @Test
  @DisplayName("Test getInitds(double[], int, double); when four; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int INITDS.getInitds(double[], int, double)"})
  void testGetInitds_whenFour_thenReturnTwo() {
    // Arrange, Act and Assert
    assertEquals(2, INITDS.getInitds(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, 4, 10.0d));
  }

  /**
   * Test {@link INITDS#getInitds(double[], int, double)}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link INITDS#getInitds(double[], int, double)}
   */
  @Test
  @DisplayName("Test getInitds(double[], int, double); when four; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int INITDS.getInitds(double[], int, double)"})
  void testGetInitds_whenFour_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class,
        () -> INITDS.getInitds(new double[] {10.0d, 0.5d, Double.NaN, 0.5d}, 4, 10.0d));
  }

  /**
   * Test {@link INITDS#getInitds(double[], int, double)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link INITDS#getInitds(double[], int, double)}
   */
  @Test
  @DisplayName("Test getInitds(double[], int, double); when 'null'; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int INITDS.getInitds(double[], int, double)"})
  void testGetInitds_whenNull_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(MathException.class, () -> INITDS.getInitds(null, 1, 10.0d));
  }

  /**
   * Test {@link INITDS#getInitds(double[], int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link INITDS#getInitds(double[], int, double)}
   */
  @Test
  @DisplayName("Test getInitds(double[], int, double); when one; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int INITDS.getInitds(double[], int, double)"})
  void testGetInitds_whenOne_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class,
        () -> INITDS.getInitds(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, 1, 10.0d));
  }
}
