package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveNodeClashActionDiffblueTest {
  /**
   * Test {@link CurveNodeClashAction#of(String)}.
   *
   * <ul>
   *   <li>When {@code DROP_OTHER}.
   *   <li>Then return {@code DROP_OTHER}.
   * </ul>
   *
   * <p>Method under test: {@link CurveNodeClashAction#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'DROP_OTHER'; then return 'DROP_OTHER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveNodeClashAction CurveNodeClashAction.of(String)"})
  void testOf_whenDropOther_thenReturnDropOther() {
    // Arrange, Act and Assert
    assertEquals(CurveNodeClashAction.DROP_OTHER, CurveNodeClashAction.of("DROP_OTHER"));
  }

  /**
   * Test {@link CurveNodeClashAction#toString()}.
   *
   * <p>Method under test: {@link CurveNodeClashAction#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CurveNodeClashAction.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Exception", CurveNodeClashAction.valueOf("EXCEPTION").toString());
  }
}
