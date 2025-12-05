package com.opengamma.strata.product.credit.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AccrualStartDiffblueTest {
  /**
   * Test {@link AccrualStart#of(String)}.
   *
   * <ul>
   *   <li>When {@code IMM_DATE}.
   *   <li>Then return {@code IMM_DATE}.
   * </ul>
   *
   * <p>Method under test: {@link AccrualStart#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'IMM_DATE'; then return 'IMM_DATE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AccrualStart AccrualStart.of(String)"})
  void testOf_whenImmDate_thenReturnImmDate() {
    // Arrange, Act and Assert
    assertEquals(AccrualStart.IMM_DATE, AccrualStart.of("IMM_DATE"));
  }

  /**
   * Test {@link AccrualStart#toString()}.
   *
   * <p>Method under test: {@link AccrualStart#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AccrualStart.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("NextDay", AccrualStart.valueOf("NEXT_DAY").toString());
  }
}
