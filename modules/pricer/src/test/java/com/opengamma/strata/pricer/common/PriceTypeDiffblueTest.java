package com.opengamma.strata.pricer.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PriceTypeDiffblueTest {
  /**
   * Test {@link PriceType#of(String)}.
   *
   * <ul>
   *   <li>When {@code CLEAN}.
   *   <li>Then return {@code CLEAN}.
   * </ul>
   *
   * <p>Method under test: {@link PriceType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'CLEAN'; then return 'CLEAN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PriceType PriceType.of(String)"})
  void testOf_whenClean_thenReturnClean() {
    // Arrange, Act and Assert
    assertEquals(PriceType.CLEAN, PriceType.of("CLEAN"));
  }

  /**
   * Test {@link PriceType#isCleanPrice()}.
   *
   * <ul>
   *   <li>Given {@code CLEAN}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PriceType#isCleanPrice()}
   */
  @Test
  @DisplayName("Test isCleanPrice(); given 'CLEAN'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PriceType.isCleanPrice()"})
  void testIsCleanPrice_givenClean_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(PriceType.CLEAN.isCleanPrice());
  }

  /**
   * Test {@link PriceType#isCleanPrice()}.
   *
   * <ul>
   *   <li>Given {@code DIRTY}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PriceType#isCleanPrice()}
   */
  @Test
  @DisplayName("Test isCleanPrice(); given 'DIRTY'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PriceType.isCleanPrice()"})
  void testIsCleanPrice_givenDirty_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(PriceType.DIRTY.isCleanPrice());
  }

  /**
   * Test {@link PriceType#toString()}.
   *
   * <p>Method under test: {@link PriceType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PriceType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Clean", PriceType.valueOf("CLEAN").toString());
  }
}
