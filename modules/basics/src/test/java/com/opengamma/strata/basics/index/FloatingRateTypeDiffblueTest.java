package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FloatingRateTypeDiffblueTest {
  /**
   * Test {@link FloatingRateType#of(String)}.
   *
   * <ul>
   *   <li>When {@code IBOR}.
   *   <li>Then return {@code IBOR}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'IBOR'; then return 'IBOR'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateType FloatingRateType.of(String)"})
  void testOf_whenIbor_thenReturnIbor() {
    // Arrange, Act and Assert
    assertEquals(FloatingRateType.IBOR, FloatingRateType.of("IBOR"));
  }

  /**
   * Test {@link FloatingRateType#isIbor()}.
   *
   * <ul>
   *   <li>Given {@code IBOR}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateType#isIbor()}
   */
  @Test
  @DisplayName("Test isIbor(); given 'IBOR'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FloatingRateType.isIbor()"})
  void testIsIbor_givenIbor_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(FloatingRateType.IBOR.isIbor());
  }

  /**
   * Test {@link FloatingRateType#isIbor()}.
   *
   * <ul>
   *   <li>Given {@code OVERNIGHT_COMPOUNDED}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateType#isIbor()}
   */
  @Test
  @DisplayName("Test isIbor(); given 'OVERNIGHT_COMPOUNDED'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FloatingRateType.isIbor()"})
  void testIsIbor_givenOvernightCompounded_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(FloatingRateType.OVERNIGHT_COMPOUNDED.isIbor());
  }

  /**
   * Test {@link FloatingRateType#isOvernight()}.
   *
   * <ul>
   *   <li>Given {@code IBOR}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateType#isOvernight()}
   */
  @Test
  @DisplayName("Test isOvernight(); given 'IBOR'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FloatingRateType.isOvernight()"})
  void testIsOvernight_givenIbor_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(FloatingRateType.IBOR.isOvernight());
  }

  /**
   * Test {@link FloatingRateType#isOvernight()}.
   *
   * <ul>
   *   <li>Given {@link FloatingRateType#OVERNIGHT_AVERAGED}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateType#isOvernight()}
   */
  @Test
  @DisplayName("Test isOvernight(); given OVERNIGHT_AVERAGED; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FloatingRateType.isOvernight()"})
  void testIsOvernight_givenOvernight_averaged_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(FloatingRateType.OVERNIGHT_AVERAGED.isOvernight());
  }

  /**
   * Test {@link FloatingRateType#isOvernight()}.
   *
   * <ul>
   *   <li>Given {@link FloatingRateType#OVERNIGHT_COMPOUNDED}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateType#isOvernight()}
   */
  @Test
  @DisplayName("Test isOvernight(); given OVERNIGHT_COMPOUNDED; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FloatingRateType.isOvernight()"})
  void testIsOvernight_givenOvernight_compounded_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(FloatingRateType.OVERNIGHT_COMPOUNDED.isOvernight());
  }

  /**
   * Test {@link FloatingRateType#isPrice()}.
   *
   * <ul>
   *   <li>Given {@code IBOR}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateType#isPrice()}
   */
  @Test
  @DisplayName("Test isPrice(); given 'IBOR'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FloatingRateType.isPrice()"})
  void testIsPrice_givenIbor_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(FloatingRateType.IBOR.isPrice());
  }

  /**
   * Test {@link FloatingRateType#isPrice()}.
   *
   * <ul>
   *   <li>Given {@link FloatingRateType#PRICE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateType#isPrice()}
   */
  @Test
  @DisplayName("Test isPrice(); given PRICE; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean FloatingRateType.isPrice()"})
  void testIsPrice_givenPrice_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(FloatingRateType.PRICE.isPrice());
  }

  /**
   * Test {@link FloatingRateType#toString()}.
   *
   * <p>Method under test: {@link FloatingRateType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FloatingRateType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Ibor", FloatingRateType.valueOf("IBOR").toString());
  }
}
