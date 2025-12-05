package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DERFCDiffblueTest {
  /**
   * Test {@link DERFC#getErfc(double)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link DERFC#getErfc(double)}
   */
  @Test
  @DisplayName("Test getErfc(double); when '-6.0136873569177505'; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DERFC.getErfc(double)"})
  void testGetErfc_when60136873569177505_thenReturnTwo() {
    // Arrange, Act and Assert
    assertEquals(2.0d, DERFC.getErfc(-6.0136873569177505d));
  }

  /**
   * Test {@link DERFC#getErfc(double)}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return {@code 1.5417257900280017E-8}.
   * </ul>
   *
   * <p>Method under test: {@link DERFC#getErfc(double)}
   */
  @Test
  @DisplayName("Test getErfc(double); when four; then return '1.5417257900280017E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DERFC.getErfc(double)"})
  void testGetErfc_whenFour_thenReturn15417257900280017e8() {
    // Arrange, Act and Assert
    assertEquals(1.5417257900280017E-8d, DERFC.getErfc(4.0d));
  }

  /**
   * Test {@link DERFC#getErfc(double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.15729920705028477}.
   * </ul>
   *
   * <p>Method under test: {@link DERFC#getErfc(double)}
   */
  @Test
  @DisplayName("Test getErfc(double); when one; then return '0.15729920705028477'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DERFC.getErfc(double)"})
  void testGetErfc_whenOne_thenReturn015729920705028477() {
    // Arrange, Act and Assert
    assertEquals(0.15729920705028477d, DERFC.getErfc(1.0d));
  }

  /**
   * Test {@link DERFC#getErfc(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.004677734981047265}.
   * </ul>
   *
   * <p>Method under test: {@link DERFC#getErfc(double)}
   */
  @Test
  @DisplayName("Test getErfc(double); when two; then return '0.004677734981047265'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DERFC.getErfc(double)"})
  void testGetErfc_whenTwo_thenReturn0004677734981047265() {
    // Arrange, Act and Assert
    assertEquals(0.004677734981047265d, DERFC.getErfc(2.0d));
  }

  /**
   * Test {@link DERFC#getErfc(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link DERFC#getErfc(double)}
   */
  @Test
  @DisplayName("Test getErfc(double); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DERFC.getErfc(double)"})
  void testGetErfc_whenZero_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, DERFC.getErfc(0.0d));
  }
}
