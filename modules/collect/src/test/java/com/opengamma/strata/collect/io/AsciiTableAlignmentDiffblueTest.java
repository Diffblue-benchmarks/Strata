package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AsciiTableAlignmentDiffblueTest {
  /**
   * Test {@link AsciiTableAlignment#of(String)}.
   *
   * <ul>
   *   <li>When {@code LEFT}.
   *   <li>Then return {@code LEFT}.
   * </ul>
   *
   * <p>Method under test: {@link AsciiTableAlignment#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'LEFT'; then return 'LEFT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AsciiTableAlignment AsciiTableAlignment.of(String)"})
  void testOf_whenLeft_thenReturnLeft() {
    // Arrange, Act and Assert
    assertEquals(AsciiTableAlignment.LEFT, AsciiTableAlignment.of("LEFT"));
  }

  /**
   * Test {@link AsciiTableAlignment#toString()}.
   *
   * <p>Method under test: {@link AsciiTableAlignment#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AsciiTableAlignment.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Left", AsciiTableAlignment.valueOf("LEFT").toString());
  }
}
