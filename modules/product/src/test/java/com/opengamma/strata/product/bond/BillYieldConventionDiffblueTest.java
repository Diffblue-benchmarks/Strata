package com.opengamma.strata.product.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BillYieldConventionDiffblueTest {
  /**
   * Test {@link BillYieldConvention#of(String)}.
   *
   * <ul>
   *   <li>When {@code DISCOUNT}.
   *   <li>Then return {@code DISCOUNT}.
   * </ul>
   *
   * <p>Method under test: {@link BillYieldConvention#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'DISCOUNT'; then return 'DISCOUNT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BillYieldConvention BillYieldConvention.of(String)"})
  void testOf_whenDiscount_thenReturnDiscount() {
    // Arrange, Act and Assert
    assertEquals(BillYieldConvention.DISCOUNT, BillYieldConvention.of("DISCOUNT"));
  }
}
