package com.opengamma.strata.product.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProtectionStartOfDayDiffblueTest {
  /**
   * Test {@link ProtectionStartOfDay#of(String)}.
   *
   * <ul>
   *   <li>When {@code BEGINNING}.
   *   <li>Then return {@code BEGINNING}.
   * </ul>
   *
   * <p>Method under test: {@link ProtectionStartOfDay#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'BEGINNING'; then return 'BEGINNING'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ProtectionStartOfDay ProtectionStartOfDay.of(String)"})
  void testOf_whenBeginning_thenReturnBeginning() {
    // Arrange, Act and Assert
    assertEquals(ProtectionStartOfDay.BEGINNING, ProtectionStartOfDay.of("BEGINNING"));
  }

  /**
   * Test {@link ProtectionStartOfDay#isBeginning()}.
   *
   * <ul>
   *   <li>Given {@code BEGINNING}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ProtectionStartOfDay#isBeginning()}
   */
  @Test
  @DisplayName("Test isBeginning(); given 'BEGINNING'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProtectionStartOfDay.isBeginning()"})
  void testIsBeginning_givenBeginning_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(ProtectionStartOfDay.BEGINNING.isBeginning());
  }

  /**
   * Test {@link ProtectionStartOfDay#isBeginning()}.
   *
   * <ul>
   *   <li>Given {@code NONE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ProtectionStartOfDay#isBeginning()}
   */
  @Test
  @DisplayName("Test isBeginning(); given 'NONE'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ProtectionStartOfDay.isBeginning()"})
  void testIsBeginning_givenNone_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(ProtectionStartOfDay.NONE.isBeginning());
  }

  /**
   * Test {@link ProtectionStartOfDay#toString()}.
   *
   * <p>Method under test: {@link ProtectionStartOfDay#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ProtectionStartOfDay.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Beginning", ProtectionStartOfDay.valueOf("BEGINNING").toString());
  }
}
