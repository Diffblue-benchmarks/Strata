package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NegativeRateMethodDiffblueTest {
  /**
   * Test {@link NegativeRateMethod#of(String)}.
   *
   * <ul>
   *   <li>When {@code ALLOW_NEGATIVE}.
   *   <li>Then return {@code ALLOW_NEGATIVE}.
   * </ul>
   *
   * <p>Method under test: {@link NegativeRateMethod#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'ALLOW_NEGATIVE'; then return 'ALLOW_NEGATIVE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NegativeRateMethod NegativeRateMethod.of(String)"})
  void testOf_whenAllowNegative_thenReturnAllowNegative() {
    // Arrange, Act and Assert
    assertEquals(NegativeRateMethod.ALLOW_NEGATIVE, NegativeRateMethod.of("ALLOW_NEGATIVE"));
  }
}
