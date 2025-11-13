package com.opengamma.strata.product.swaption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CashSwaptionSettlementMethodDiffblueTest {
  /**
   * Test {@link CashSwaptionSettlementMethod#of(String)}.
   *
   * <ul>
   *   <li>When {@code CASH_PRICE}.
   *   <li>Then return {@code CASH_PRICE}.
   * </ul>
   *
   * <p>Method under test: {@link CashSwaptionSettlementMethod#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'CASH_PRICE'; then return 'CASH_PRICE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CashSwaptionSettlementMethod CashSwaptionSettlementMethod.of(String)"})
  void testOf_whenCashPrice_thenReturnCashPrice() {
    // Arrange, Act and Assert
    assertEquals(
        CashSwaptionSettlementMethod.CASH_PRICE, CashSwaptionSettlementMethod.of("CASH_PRICE"));
  }

  /**
   * Test {@link CashSwaptionSettlementMethod#toString()}.
   *
   * <p>Method under test: {@link CashSwaptionSettlementMethod#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CashSwaptionSettlementMethod.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("CashPrice", CashSwaptionSettlementMethod.valueOf("CASH_PRICE").toString());
  }
}
