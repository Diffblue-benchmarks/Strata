package com.opengamma.strata.product.option;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FutureOptionPremiumStyleDiffblueTest {
  /**
   * Test {@link FutureOptionPremiumStyle#of(String)}.
   *
   * <ul>
   *   <li>When {@code DAILY_MARGIN}.
   *   <li>Then return {@code DAILY_MARGIN}.
   * </ul>
   *
   * <p>Method under test: {@link FutureOptionPremiumStyle#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'DAILY_MARGIN'; then return 'DAILY_MARGIN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FutureOptionPremiumStyle FutureOptionPremiumStyle.of(String)"})
  void testOf_whenDailyMargin_thenReturnDailyMargin() {
    // Arrange, Act and Assert
    assertEquals(
        FutureOptionPremiumStyle.DAILY_MARGIN, FutureOptionPremiumStyle.of("DAILY_MARGIN"));
  }

  /**
   * Test {@link FutureOptionPremiumStyle#toString()}.
   *
   * <p>Method under test: {@link FutureOptionPremiumStyle#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FutureOptionPremiumStyle.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("DailyMargin", FutureOptionPremiumStyle.valueOf("DAILY_MARGIN").toString());
  }
}
