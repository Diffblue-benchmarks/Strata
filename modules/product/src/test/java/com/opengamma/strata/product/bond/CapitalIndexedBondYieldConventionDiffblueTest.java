package com.opengamma.strata.product.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CapitalIndexedBondYieldConventionDiffblueTest {
  /**
   * Test {@link CapitalIndexedBondYieldConvention#of(String)}.
   *
   * <ul>
   *   <li>When {@code GB-I/L-Bond}.
   *   <li>Then return {@code GB_IL_BOND}.
   * </ul>
   *
   * <p>Method under test: {@link CapitalIndexedBondYieldConvention#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'GB-I/L-Bond'; then return 'GB_IL_BOND'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CapitalIndexedBondYieldConvention CapitalIndexedBondYieldConvention.of(String)"
  })
  void testOf_whenGbILBond_thenReturnGbIlBond() {
    // Arrange, Act and Assert
    assertEquals(
        CapitalIndexedBondYieldConvention.GB_IL_BOND,
        CapitalIndexedBondYieldConvention.of("GB-I/L-Bond"));
  }

  /**
   * Test {@link CapitalIndexedBondYieldConvention#toString()}.
   *
   * <p>Method under test: {@link CapitalIndexedBondYieldConvention#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CapitalIndexedBondYieldConvention.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("US-I/L-Real", CapitalIndexedBondYieldConvention.valueOf("US_IL_REAL").toString());
  }
}
