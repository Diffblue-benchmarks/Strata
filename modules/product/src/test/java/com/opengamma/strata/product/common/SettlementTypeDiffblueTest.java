package com.opengamma.strata.product.common;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SettlementTypeDiffblueTest {
  /**
   * Test {@link SettlementType#of(String)}.
   *
   * <ul>
   *   <li>When {@code CASH}.
   *   <li>Then return {@code CASH}.
   * </ul>
   *
   * <p>Method under test: {@link SettlementType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'CASH'; then return 'CASH'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SettlementType SettlementType.of(String)"})
  void testOf_whenCash_thenReturnCash() {
    // Arrange, Act and Assert
    assertEquals(SettlementType.CASH, SettlementType.of("CASH"));
  }

  /**
   * Test {@link SettlementType#toString()}.
   *
   * <p>Method under test: {@link SettlementType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SettlementType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Cash", SettlementType.valueOf("CASH").toString());
  }
}
