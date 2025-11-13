package com.opengamma.strata.product;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PortfolioItemTypeDiffblueTest {
  /**
   * Test {@link PortfolioItemType#of(String)}.
   *
   * <ul>
   *   <li>When {@code OTHER}.
   *   <li>Then return {@code OTHER}.
   * </ul>
   *
   * <p>Method under test: {@link PortfolioItemType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'OTHER'; then return 'OTHER'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PortfolioItemType PortfolioItemType.of(String)"})
  void testOf_whenOther_thenReturnOther() {
    // Arrange, Act and Assert
    assertEquals(PortfolioItemType.OTHER, PortfolioItemType.of("OTHER"));
  }

  /**
   * Test {@link PortfolioItemType#toString()}.
   *
   * <p>Method under test: {@link PortfolioItemType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PortfolioItemType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Trade", PortfolioItemType.valueOf("TRADE").toString());
  }
}
