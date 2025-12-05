package com.opengamma.strata.product.option;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BarrierTypeDiffblueTest {
  /**
   * Test {@link BarrierType#of(String)}.
   *
   * <ul>
   *   <li>When {@code DOWN}.
   *   <li>Then return {@code DOWN}.
   * </ul>
   *
   * <p>Method under test: {@link BarrierType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'DOWN'; then return 'DOWN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BarrierType BarrierType.of(String)"})
  void testOf_whenDown_thenReturnDown() {
    // Arrange, Act and Assert
    assertEquals(BarrierType.DOWN, BarrierType.of("DOWN"));
  }

  /**
   * Test {@link BarrierType#isDown()}.
   *
   * <ul>
   *   <li>Given {@code DOWN}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BarrierType#isDown()}
   */
  @Test
  @DisplayName("Test isDown(); given 'DOWN'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BarrierType.isDown()"})
  void testIsDown_givenDown_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(BarrierType.DOWN.isDown());
  }

  /**
   * Test {@link BarrierType#isDown()}.
   *
   * <ul>
   *   <li>Given {@code UP}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BarrierType#isDown()}
   */
  @Test
  @DisplayName("Test isDown(); given 'UP'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BarrierType.isDown()"})
  void testIsDown_givenUp_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(BarrierType.UP.isDown());
  }

  /**
   * Test {@link BarrierType#toString()}.
   *
   * <p>Method under test: {@link BarrierType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BarrierType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Down", BarrierType.valueOf("DOWN").toString());
  }
}
