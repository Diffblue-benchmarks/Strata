package com.opengamma.strata.product.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CapFloorDiffblueTest {
  /**
   * Test {@link CapFloor#of(String)}.
   *
   * <ul>
   *   <li>When {@code CAP}.
   *   <li>Then return {@code CAP}.
   * </ul>
   *
   * <p>Method under test: {@link CapFloor#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'CAP'; then return 'CAP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CapFloor CapFloor.of(String)"})
  void testOf_whenCap_thenReturnCap() {
    // Arrange, Act and Assert
    assertEquals(CapFloor.CAP, CapFloor.of("CAP"));
  }

  /**
   * Test {@link CapFloor#isCap()}.
   *
   * <ul>
   *   <li>Given {@code CAP}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CapFloor#isCap()}
   */
  @Test
  @DisplayName("Test isCap(); given 'CAP'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CapFloor.isCap()"})
  void testIsCap_givenCap_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CapFloor.CAP.isCap());
  }

  /**
   * Test {@link CapFloor#isCap()}.
   *
   * <ul>
   *   <li>Given {@code FLOOR}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CapFloor#isCap()}
   */
  @Test
  @DisplayName("Test isCap(); given 'FLOOR'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CapFloor.isCap()"})
  void testIsCap_givenFloor_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CapFloor.FLOOR.isCap());
  }

  /**
   * Test {@link CapFloor#isFloor()}.
   *
   * <ul>
   *   <li>Given {@code CAP}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CapFloor#isFloor()}
   */
  @Test
  @DisplayName("Test isFloor(); given 'CAP'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CapFloor.isFloor()"})
  void testIsFloor_givenCap_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CapFloor.CAP.isFloor());
  }

  /**
   * Test {@link CapFloor#isFloor()}.
   *
   * <ul>
   *   <li>Given {@link CapFloor#FLOOR}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CapFloor#isFloor()}
   */
  @Test
  @DisplayName("Test isFloor(); given FLOOR; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CapFloor.isFloor()"})
  void testIsFloor_givenFloor_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CapFloor.FLOOR.isFloor());
  }

  /**
   * Test {@link CapFloor#opposite()}.
   *
   * <ul>
   *   <li>Given {@code CAP}.
   *   <li>Then return {@code FLOOR}.
   * </ul>
   *
   * <p>Method under test: {@link CapFloor#opposite()}
   */
  @Test
  @DisplayName("Test opposite(); given 'CAP'; then return 'FLOOR'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CapFloor CapFloor.opposite()"})
  void testOpposite_givenCap_thenReturnFloor() {
    // Arrange, Act and Assert
    assertEquals(CapFloor.FLOOR, CapFloor.CAP.opposite());
  }

  /**
   * Test {@link CapFloor#opposite()}.
   *
   * <ul>
   *   <li>Given {@code FLOOR}.
   *   <li>Then return {@code CAP}.
   * </ul>
   *
   * <p>Method under test: {@link CapFloor#opposite()}
   */
  @Test
  @DisplayName("Test opposite(); given 'FLOOR'; then return 'CAP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CapFloor CapFloor.opposite()"})
  void testOpposite_givenFloor_thenReturnCap() {
    // Arrange, Act and Assert
    assertEquals(CapFloor.CAP, CapFloor.FLOOR.opposite());
  }

  /**
   * Test {@link CapFloor#toString()}.
   *
   * <p>Method under test: {@link CapFloor#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CapFloor.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Cap", CapFloor.valueOf("CAP").toString());
  }
}
