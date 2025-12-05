package com.opengamma.strata.product.cms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CmsPeriodTypeDiffblueTest {
  /**
   * Test {@link CmsPeriodType#of(String)}.
   *
   * <ul>
   *   <li>When {@code CAPLET}.
   *   <li>Then return {@code CAPLET}.
   * </ul>
   *
   * <p>Method under test: {@link CmsPeriodType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'CAPLET'; then return 'CAPLET'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CmsPeriodType CmsPeriodType.of(String)"})
  void testOf_whenCaplet_thenReturnCaplet() {
    // Arrange, Act and Assert
    assertEquals(CmsPeriodType.CAPLET, CmsPeriodType.of("CAPLET"));
  }

  /**
   * Test {@link CmsPeriodType#toString()}.
   *
   * <p>Method under test: {@link CmsPeriodType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CmsPeriodType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Coupon", CmsPeriodType.valueOf("COUPON").toString());
  }
}
