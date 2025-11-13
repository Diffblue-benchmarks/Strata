package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdExpiryTypeDiffblueTest {
  /**
   * Test {@link EtdExpiryType#of(String)}.
   *
   * <ul>
   *   <li>When {@code DAILY}.
   *   <li>Then return {@code DAILY}.
   * </ul>
   *
   * <p>Method under test: {@link EtdExpiryType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'DAILY'; then return 'DAILY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdExpiryType EtdExpiryType.of(String)"})
  void testOf_whenDaily_thenReturnDaily() {
    // Arrange, Act and Assert
    assertEquals(EtdExpiryType.DAILY, EtdExpiryType.of("DAILY"));
  }

  /**
   * Test {@link EtdExpiryType#toString()}.
   *
   * <p>Method under test: {@link EtdExpiryType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String EtdExpiryType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Monthly", EtdExpiryType.valueOf("MONTHLY").toString());
  }
}
