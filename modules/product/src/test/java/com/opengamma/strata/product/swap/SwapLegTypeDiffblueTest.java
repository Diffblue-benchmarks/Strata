package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwapLegTypeDiffblueTest {
  /**
   * Test {@link SwapLegType#of(String)}.
   *
   * <ul>
   *   <li>When {@code FIXED}.
   *   <li>Then return {@code FIXED}.
   * </ul>
   *
   * <p>Method under test: {@link SwapLegType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'FIXED'; then return 'FIXED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwapLegType SwapLegType.of(String)"})
  void testOf_whenFixed_thenReturnFixed() {
    // Arrange, Act and Assert
    assertEquals(SwapLegType.FIXED, SwapLegType.of("FIXED"));
  }

  /**
   * Test {@link SwapLegType#isFixed()}.
   *
   * <ul>
   *   <li>Given {@code FIXED}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SwapLegType#isFixed()}
   */
  @Test
  @DisplayName("Test isFixed(); given 'FIXED'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SwapLegType.isFixed()"})
  void testIsFixed_givenFixed_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(SwapLegType.FIXED.isFixed());
  }

  /**
   * Test {@link SwapLegType#isFixed()}.
   *
   * <ul>
   *   <li>Given {@code IBOR}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SwapLegType#isFixed()}
   */
  @Test
  @DisplayName("Test isFixed(); given 'IBOR'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SwapLegType.isFixed()"})
  void testIsFixed_givenIbor_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(SwapLegType.IBOR.isFixed());
  }

  /**
   * Test {@link SwapLegType#isFloat()}.
   *
   * <ul>
   *   <li>Given {@code FIXED}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link SwapLegType#isFloat()}
   */
  @Test
  @DisplayName("Test isFloat(); given 'FIXED'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SwapLegType.isFloat()"})
  void testIsFloat_givenFixed_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(SwapLegType.FIXED.isFloat());
  }

  /**
   * Test {@link SwapLegType#isFloat()}.
   *
   * <ul>
   *   <li>Given {@link SwapLegType#IBOR}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SwapLegType#isFloat()}
   */
  @Test
  @DisplayName("Test isFloat(); given IBOR; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SwapLegType.isFloat()"})
  void testIsFloat_givenIbor_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(SwapLegType.IBOR.isFloat());
  }

  /**
   * Test {@link SwapLegType#isFloat()}.
   *
   * <ul>
   *   <li>Given {@link SwapLegType#INFLATION}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SwapLegType#isFloat()}
   */
  @Test
  @DisplayName("Test isFloat(); given INFLATION; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SwapLegType.isFloat()"})
  void testIsFloat_givenInflation_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(SwapLegType.INFLATION.isFloat());
  }

  /**
   * Test {@link SwapLegType#isFloat()}.
   *
   * <ul>
   *   <li>Given {@link SwapLegType#OVERNIGHT}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link SwapLegType#isFloat()}
   */
  @Test
  @DisplayName("Test isFloat(); given OVERNIGHT; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SwapLegType.isFloat()"})
  void testIsFloat_givenOvernight_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(SwapLegType.OVERNIGHT.isFloat());
  }

  /**
   * Test {@link SwapLegType#toString()}.
   *
   * <p>Method under test: {@link SwapLegType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SwapLegType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Fixed", SwapLegType.valueOf("FIXED").toString());
  }
}
