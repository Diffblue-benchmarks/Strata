package com.opengamma.strata.collect.result;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FailureReasonDiffblueTest {
  /**
   * Test {@link FailureReason#of(String)}.
   *
   * <ul>
   *   <li>When {@code CALCULATION_FAILED}.
   *   <li>Then return {@code CALCULATION_FAILED}.
   * </ul>
   *
   * <p>Method under test: {@link FailureReason#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'CALCULATION_FAILED'; then return 'CALCULATION_FAILED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FailureReason FailureReason.of(String)"})
  void testOf_whenCalculationFailed_thenReturnCalculationFailed() {
    // Arrange, Act and Assert
    assertEquals(FailureReason.CALCULATION_FAILED, FailureReason.of("CALCULATION_FAILED"));
  }

  /**
   * Test {@link FailureReason#toString()}.
   *
   * <p>Method under test: {@link FailureReason#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FailureReason.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("MULTIPLE", FailureReason.valueOf("MULTIPLE").toString());
  }
}
