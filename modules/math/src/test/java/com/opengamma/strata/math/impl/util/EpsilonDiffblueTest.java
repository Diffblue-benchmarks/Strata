package com.opengamma.strata.math.impl.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EpsilonDiffblueTest {
  /**
   * Test {@link Epsilon#epsilon(double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code 1.00000000005}.
   * </ul>
   *
   * <p>Method under test: {@link Epsilon#epsilon(double)}
   */
  @Test
  @DisplayName("Test epsilon(double); when '1.0E-10'; then return '1.00000000005'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Epsilon.epsilon(double)"})
  void testEpsilon_when10e10_thenReturn100000000005() {
    // Arrange, Act and Assert
    assertEquals(1.00000000005d, Epsilon.epsilon(1.0E-10d));
  }

  /**
   * Test {@link Epsilon#epsilon(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 3.194528049465325}.
   * </ul>
   *
   * <p>Method under test: {@link Epsilon#epsilon(double)}
   */
  @Test
  @DisplayName("Test epsilon(double); when two; then return '3.194528049465325'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Epsilon.epsilon(double)"})
  void testEpsilon_whenTwo_thenReturn3194528049465325() {
    // Arrange, Act and Assert
    assertEquals(3.194528049465325d, Epsilon.epsilon(2.0d));
  }

  /**
   * Test {@link Epsilon#epsilonP(double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-7}.
   *   <li>Then return {@code 0.5000000333333345}.
   * </ul>
   *
   * <p>Method under test: {@link Epsilon#epsilonP(double)}
   */
  @Test
  @DisplayName("Test epsilonP(double); when '1.0E-7'; then return '0.5000000333333345'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Epsilon.epsilonP(double)"})
  void testEpsilonP_when10e7_thenReturn05000000333333345() {
    // Arrange, Act and Assert
    assertEquals(0.5000000333333345d, Epsilon.epsilonP(1.0E-7d));
  }

  /**
   * Test {@link Epsilon#epsilonP(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 2.0972640247326626}.
   * </ul>
   *
   * <p>Method under test: {@link Epsilon#epsilonP(double)}
   */
  @Test
  @DisplayName("Test epsilonP(double); when two; then return '2.0972640247326626'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Epsilon.epsilonP(double)"})
  void testEpsilonP_whenTwo_thenReturn20972640247326626() {
    // Arrange, Act and Assert
    assertEquals(2.0972640247326626d, Epsilon.epsilonP(2.0d));
  }

  /**
   * Test {@link Epsilon#epsilonPP(double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-5}.
   *   <li>Then return {@code 0.33333583334333333}.
   * </ul>
   *
   * <p>Method under test: {@link Epsilon#epsilonPP(double)}
   */
  @Test
  @DisplayName("Test epsilonPP(double); when '1.0E-5'; then return '0.33333583334333333'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Epsilon.epsilonPP(double)"})
  void testEpsilonPP_when10e5_thenReturn033333583334333333() {
    // Arrange, Act and Assert
    assertEquals(0.33333583334333333d, Epsilon.epsilonPP(1.0E-5d));
  }

  /**
   * Test {@link Epsilon#epsilonPP(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 1.5972640247326626}.
   * </ul>
   *
   * <p>Method under test: {@link Epsilon#epsilonPP(double)}
   */
  @Test
  @DisplayName("Test epsilonPP(double); when two; then return '1.5972640247326626'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Epsilon.epsilonPP(double)"})
  void testEpsilonPP_whenTwo_thenReturn15972640247326626() {
    // Arrange, Act and Assert
    assertEquals(1.5972640247326626d, Epsilon.epsilonPP(2.0d));
  }
}
