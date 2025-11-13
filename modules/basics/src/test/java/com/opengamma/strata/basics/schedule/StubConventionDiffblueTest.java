package com.opengamma.strata.basics.schedule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StubConventionDiffblueTest {
  /**
   * Test {@link StubConvention#of(String)}.
   *
   * <ul>
   *   <li>When {@code BOTH}.
   *   <li>Then return {@code BOTH}.
   * </ul>
   *
   * <p>Method under test: {@link StubConvention#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'BOTH'; then return 'BOTH'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StubConvention StubConvention.of(String)"})
  void testOf_whenBoth_thenReturnBoth() {
    // Arrange, Act and Assert
    assertEquals(StubConvention.BOTH, StubConvention.of("BOTH"));
  }
}
