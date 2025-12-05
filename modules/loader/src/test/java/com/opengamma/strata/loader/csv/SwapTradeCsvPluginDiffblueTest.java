package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwapTradeCsvPluginDiffblueTest {
  /**
   * Test {@link SwapTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link SwapTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SwapTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = SwapTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(1, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("SWAP"));
  }

  /**
   * Test {@link SwapTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link SwapTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SwapTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("Swap", SwapTradeCsvPlugin.INSTANCE.getName());
  }
}
