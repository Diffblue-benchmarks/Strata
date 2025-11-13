package com.opengamma.strata.product.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedCouponBondYieldConventionDiffblueTest {
  /**
   * Test {@link FixedCouponBondYieldConvention#of(String)}.
   *
   * <ul>
   *   <li>When {@code DE-Bonds}.
   *   <li>Then return {@code DE_BONDS}.
   * </ul>
   *
   * <p>Method under test: {@link FixedCouponBondYieldConvention#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'DE-Bonds'; then return 'DE_BONDS'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedCouponBondYieldConvention FixedCouponBondYieldConvention.of(String)"})
  void testOf_whenDeBonds_thenReturnDeBonds() {
    // Arrange, Act and Assert
    assertEquals(
        FixedCouponBondYieldConvention.DE_BONDS, FixedCouponBondYieldConvention.of("DE-Bonds"));
  }

  /**
   * Test {@link FixedCouponBondYieldConvention#toString()}.
   *
   * <p>Method under test: {@link FixedCouponBondYieldConvention#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FixedCouponBondYieldConvention.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("GB-Bump-DMO", FixedCouponBondYieldConvention.valueOf("GB_BUMP_DMO").toString());
  }
}
