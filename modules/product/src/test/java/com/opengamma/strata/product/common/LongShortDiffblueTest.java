package com.opengamma.strata.product.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LongShortDiffblueTest {
  /**
   * Test {@link LongShort#of(String)}.
   *
   * <ul>
   *   <li>When {@code LONG}.
   *   <li>Then return {@code LONG}.
   * </ul>
   *
   * <p>Method under test: {@link LongShort#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'LONG'; then return 'LONG'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongShort LongShort.of(String)"})
  void testOf_whenLong_thenReturnLong() {
    // Arrange, Act and Assert
    assertEquals(LongShort.LONG, LongShort.of("LONG"));
  }

  /**
   * Test {@link LongShort#ofLong(boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code SHORT}.
   * </ul>
   *
   * <p>Method under test: {@link LongShort#ofLong(boolean)}
   */
  @Test
  @DisplayName("Test ofLong(boolean); when 'false'; then return 'SHORT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongShort LongShort.ofLong(boolean)"})
  void testOfLong_whenFalse_thenReturnShort() {
    // Arrange, Act and Assert
    assertEquals(LongShort.SHORT, LongShort.ofLong(false));
  }

  /**
   * Test {@link LongShort#ofLong(boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code LONG}.
   * </ul>
   *
   * <p>Method under test: {@link LongShort#ofLong(boolean)}
   */
  @Test
  @DisplayName("Test ofLong(boolean); when 'true'; then return 'LONG'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongShort LongShort.ofLong(boolean)"})
  void testOfLong_whenTrue_thenReturnLong() {
    // Arrange, Act and Assert
    assertEquals(LongShort.LONG, LongShort.ofLong(true));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LongShort#toString()}
   *   <li>{@link LongShort#isLong()}
   *   <li>{@link LongShort#sign()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LongShort.isLong()",
    "int LongShort.sign()",
    "String LongShort.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    LongShort valueOfResult = LongShort.valueOf("LONG");

    // Act
    String actualToStringResult = valueOfResult.toString();
    boolean actualIsLongResult = valueOfResult.isLong();

    // Assert
    assertEquals("Long", actualToStringResult);
    assertEquals(1, valueOfResult.sign());
    assertTrue(actualIsLongResult);
  }

  /**
   * Test {@link LongShort#isShort()}.
   *
   * <ul>
   *   <li>Given {@code LONG}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link LongShort#isShort()}
   */
  @Test
  @DisplayName("Test isShort(); given 'LONG'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongShort.isShort()"})
  void testIsShort_givenLong_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(LongShort.LONG.isShort());
  }

  /**
   * Test {@link LongShort#isShort()}.
   *
   * <ul>
   *   <li>Given {@code SHORT}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link LongShort#isShort()}
   */
  @Test
  @DisplayName("Test isShort(); given 'SHORT'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LongShort.isShort()"})
  void testIsShort_givenShort_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(LongShort.SHORT.isShort());
  }

  /**
   * Test {@link LongShort#opposite()}.
   *
   * <ul>
   *   <li>Given {@code LONG}.
   *   <li>Then return {@code SHORT}.
   * </ul>
   *
   * <p>Method under test: {@link LongShort#opposite()}
   */
  @Test
  @DisplayName("Test opposite(); given 'LONG'; then return 'SHORT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongShort LongShort.opposite()"})
  void testOpposite_givenLong_thenReturnShort() {
    // Arrange, Act and Assert
    assertEquals(LongShort.SHORT, LongShort.LONG.opposite());
  }

  /**
   * Test {@link LongShort#opposite()}.
   *
   * <ul>
   *   <li>Given {@code SHORT}.
   *   <li>Then return {@code LONG}.
   * </ul>
   *
   * <p>Method under test: {@link LongShort#opposite()}
   */
  @Test
  @DisplayName("Test opposite(); given 'SHORT'; then return 'LONG'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LongShort LongShort.opposite()"})
  void testOpposite_givenShort_thenReturnLong() {
    // Arrange, Act and Assert
    assertEquals(LongShort.LONG, LongShort.SHORT.opposite());
  }
}
