package com.opengamma.strata.product.credit.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CdsQuoteConventionDiffblueTest {
  /**
   * Test {@link CdsQuoteConvention#of(String)}.
   *
   * <ul>
   *   <li>When {@code PAR_SPREAD}.
   *   <li>Then return {@code PAR_SPREAD}.
   * </ul>
   *
   * <p>Method under test: {@link CdsQuoteConvention#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'PAR_SPREAD'; then return 'PAR_SPREAD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CdsQuoteConvention CdsQuoteConvention.of(String)"})
  void testOf_whenParSpread_thenReturnParSpread() {
    // Arrange, Act and Assert
    assertEquals(CdsQuoteConvention.PAR_SPREAD, CdsQuoteConvention.of("PAR_SPREAD"));
  }

  /**
   * Test {@link CdsQuoteConvention#toString()}.
   *
   * <p>Method under test: {@link CdsQuoteConvention#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CdsQuoteConvention.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("ParSpread", CdsQuoteConvention.valueOf("PAR_SPREAD").toString());
  }
}
