package com.opengamma.strata.product.option;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class KnockTypeDiffblueTest {
  /**
   * Test {@link KnockType#of(String)}.
   *
   * <ul>
   *   <li>When {@code KNOCK_IN}.
   *   <li>Then return {@code KNOCK_IN}.
   * </ul>
   *
   * <p>Method under test: {@link KnockType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'KNOCK_IN'; then return 'KNOCK_IN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"KnockType KnockType.of(String)"})
  void testOf_whenKnockIn_thenReturnKnockIn() {
    // Arrange, Act and Assert
    assertEquals(KnockType.KNOCK_IN, KnockType.of("KNOCK_IN"));
  }

  /**
   * Test {@link KnockType#isKnockIn()}.
   *
   * <ul>
   *   <li>Given {@code KNOCK_IN}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link KnockType#isKnockIn()}
   */
  @Test
  @DisplayName("Test isKnockIn(); given 'KNOCK_IN'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KnockType.isKnockIn()"})
  void testIsKnockIn_givenKnockIn_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(KnockType.KNOCK_IN.isKnockIn());
  }

  /**
   * Test {@link KnockType#isKnockIn()}.
   *
   * <ul>
   *   <li>Given {@code KNOCK_OUT}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link KnockType#isKnockIn()}
   */
  @Test
  @DisplayName("Test isKnockIn(); given 'KNOCK_OUT'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean KnockType.isKnockIn()"})
  void testIsKnockIn_givenKnockOut_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(KnockType.KNOCK_OUT.isKnockIn());
  }

  /**
   * Test {@link KnockType#toString()}.
   *
   * <p>Method under test: {@link KnockType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String KnockType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("KnockIn", KnockType.valueOf("KNOCK_IN").toString());
  }
}
