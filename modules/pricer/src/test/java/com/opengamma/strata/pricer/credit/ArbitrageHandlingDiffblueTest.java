package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ArbitrageHandlingDiffblueTest {
  /**
   * Test {@link ArbitrageHandling#of(String)}.
   *
   * <ul>
   *   <li>When {@code FAIL}.
   *   <li>Then return {@code FAIL}.
   * </ul>
   *
   * <p>Method under test: {@link ArbitrageHandling#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'FAIL'; then return 'FAIL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArbitrageHandling ArbitrageHandling.of(String)"})
  void testOf_whenFail_thenReturnFail() {
    // Arrange, Act and Assert
    assertEquals(ArbitrageHandling.FAIL, ArbitrageHandling.of("FAIL"));
  }

  /**
   * Test {@link ArbitrageHandling#toString()}.
   *
   * <p>Method under test: {@link ArbitrageHandling#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ArbitrageHandling.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Ignore", ArbitrageHandling.valueOf("IGNORE").toString());
  }
}
