package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OvernightAccrualMethodDiffblueTest {
  /**
   * Test {@link OvernightAccrualMethod#of(String)}.
   *
   * <ul>
   *   <li>When {@code AVERAGED}.
   *   <li>Then return {@code AVERAGED}.
   * </ul>
   *
   * <p>Method under test: {@link OvernightAccrualMethod#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'AVERAGED'; then return 'AVERAGED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"OvernightAccrualMethod OvernightAccrualMethod.of(String)"})
  void testOf_whenAveraged_thenReturnAveraged() {
    // Arrange, Act and Assert
    assertEquals(OvernightAccrualMethod.AVERAGED, OvernightAccrualMethod.of("AVERAGED"));
  }

  /**
   * Test {@link OvernightAccrualMethod#toString()}.
   *
   * <p>Method under test: {@link OvernightAccrualMethod#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OvernightAccrualMethod.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Compounded", OvernightAccrualMethod.valueOf("COMPOUNDED").toString());
  }
}
