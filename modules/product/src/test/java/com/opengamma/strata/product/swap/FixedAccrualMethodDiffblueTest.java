package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedAccrualMethodDiffblueTest {
  /**
   * Test {@link FixedAccrualMethod#of(String)}.
   *
   * <ul>
   *   <li>When {@code DEFAULT}.
   *   <li>Then return {@code DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link FixedAccrualMethod#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'DEFAULT'; then return 'DEFAULT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedAccrualMethod FixedAccrualMethod.of(String)"})
  void testOf_whenDefault_thenReturnDefault() {
    // Arrange, Act and Assert
    assertEquals(FixedAccrualMethod.DEFAULT, FixedAccrualMethod.of("DEFAULT"));
  }

  /**
   * Test {@link FixedAccrualMethod#toString()}.
   *
   * <p>Method under test: {@link FixedAccrualMethod#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FixedAccrualMethod.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Default", FixedAccrualMethod.valueOf("DEFAULT").toString());
  }
}
