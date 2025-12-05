package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixingRelativeToDiffblueTest {
  /**
   * Test {@link FixingRelativeTo#of(String)}.
   *
   * <ul>
   *   <li>When {@code PERIOD_END}.
   *   <li>Then return {@code PERIOD_END}.
   * </ul>
   *
   * <p>Method under test: {@link FixingRelativeTo#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'PERIOD_END'; then return 'PERIOD_END'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixingRelativeTo FixingRelativeTo.of(String)"})
  void testOf_whenPeriodEnd_thenReturnPeriodEnd() {
    // Arrange, Act and Assert
    assertEquals(FixingRelativeTo.PERIOD_END, FixingRelativeTo.of("PERIOD_END"));
  }

  /**
   * Test {@link FixingRelativeTo#toString()}.
   *
   * <p>Method under test: {@link FixingRelativeTo#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FixingRelativeTo.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("PeriodStart", FixingRelativeTo.valueOf("PERIOD_START").toString());
  }
}
