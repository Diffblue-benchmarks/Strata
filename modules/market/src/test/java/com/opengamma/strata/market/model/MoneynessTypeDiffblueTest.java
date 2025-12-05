package com.opengamma.strata.market.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MoneynessTypeDiffblueTest {
  /**
   * Test {@link MoneynessType#of(String)}.
   *
   * <ul>
   *   <li>When {@code PRICE}.
   *   <li>Then return {@code PRICE}.
   * </ul>
   *
   * <p>Method under test: {@link MoneynessType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'PRICE'; then return 'PRICE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MoneynessType MoneynessType.of(String)"})
  void testOf_whenPrice_thenReturnPrice() {
    // Arrange, Act and Assert
    assertEquals(MoneynessType.PRICE, MoneynessType.of("PRICE"));
  }

  /**
   * Test {@link MoneynessType#toString()}.
   *
   * <p>Method under test: {@link MoneynessType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MoneynessType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Price", MoneynessType.valueOf("PRICE").toString());
  }
}
