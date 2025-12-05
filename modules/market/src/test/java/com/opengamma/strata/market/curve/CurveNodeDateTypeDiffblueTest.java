package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveNodeDateTypeDiffblueTest {
  /**
   * Test {@link CurveNodeDateType#of(String)}.
   *
   * <ul>
   *   <li>When {@code END}.
   *   <li>Then return {@code END}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeDateType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'END'; then return 'END'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveNodeDateType CurveNodeDateType.of(String)"})
  void testOf_whenEnd_thenReturnEnd() {
    // Arrange, Act and Assert
    assertEquals(CurveNodeDateType.END, CurveNodeDateType.of("END"));
  }

  /**
   * Test {@link CurveNodeDateType#toString()}.
   *
   * <p>Method under test: {@link CurveNodeDateType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CurveNodeDateType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Fixed", CurveNodeDateType.valueOf("FIXED").toString());
  }
}
