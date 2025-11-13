package com.opengamma.strata.market;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ShiftTypeDiffblueTest {
  /**
   * Test {@link ShiftType#of(String)}.
   *
   * <ul>
   *   <li>When {@code ABSOLUTE}.
   *   <li>Then return {@code ABSOLUTE}.
   * </ul>
   *
   * <p>Method under test: {@link ShiftType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'ABSOLUTE'; then return 'ABSOLUTE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ShiftType ShiftType.of(String)"})
  void testOf_whenAbsolute_thenReturnAbsolute() {
    // Arrange, Act and Assert
    assertEquals(ShiftType.ABSOLUTE, ShiftType.of("ABSOLUTE"));
  }
}
