package com.opengamma.strata.market.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrParameterTypeDiffblueTest {
  /**
   * Test {@link SabrParameterType#of(String)}.
   *
   * <ul>
   *   <li>When {@code ALPHA}.
   *   <li>Then return {@code ALPHA}.
   * </ul>
   *
   * <p>Method under test: {@link SabrParameterType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'ALPHA'; then return 'ALPHA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SabrParameterType SabrParameterType.of(String)"})
  void testOf_whenAlpha_thenReturnAlpha() {
    // Arrange, Act and Assert
    assertEquals(SabrParameterType.ALPHA, SabrParameterType.of("ALPHA"));
  }

  /**
   * Test {@link SabrParameterType#toString()}.
   *
   * <p>Method under test: {@link SabrParameterType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SabrParameterType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Alpha", SabrParameterType.valueOf("ALPHA").toString());
  }
}
