package com.opengamma.strata.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReportingCurrencyTypeDiffblueTest {
  /**
   * Test {@link ReportingCurrencyType#of(String)}.
   *
   * <ul>
   *   <li>When {@code NATURAL}.
   *   <li>Then return {@code NATURAL}.
   * </ul>
   *
   * <p>Method under test: {@link ReportingCurrencyType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'NATURAL'; then return 'NATURAL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReportingCurrencyType ReportingCurrencyType.of(String)"})
  void testOf_whenNatural_thenReturnNatural() {
    // Arrange, Act and Assert
    assertEquals(ReportingCurrencyType.NATURAL, ReportingCurrencyType.of("NATURAL"));
  }

  /**
   * Test {@link ReportingCurrencyType#toString()}.
   *
   * <p>Method under test: {@link ReportingCurrencyType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ReportingCurrencyType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Specific", ReportingCurrencyType.valueOf("SPECIFIC").toString());
  }
}
