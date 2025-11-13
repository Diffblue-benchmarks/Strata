package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fxopt.FxSingleBarrierOptionTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxSingleBarrierOptionTradeCsvPluginDiffblueTest {
  /**
   * Test {@link FxSingleBarrierOptionTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link FxSingleBarrierOptionTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxSingleBarrierOptionTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult =
        FxSingleBarrierOptionTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(2, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("FX SINGLE BARRIER OPTION"));
    assertTrue(actualTradeTypeNamesResult.contains("FXSINGLEBARRIEROPTION"));
  }

  /**
   * Test {@link FxSingleBarrierOptionTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link FxSingleBarrierOptionTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxSingleBarrierOptionTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals(
        "FxSingleBarrierOptionTrade", FxSingleBarrierOptionTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link FxSingleBarrierOptionTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link FxSingleBarrierOptionTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxSingleBarrierOptionTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        FxSingleBarrierOptionTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(FxSingleBarrierOptionTrade.class));
  }

  /**
   * Test {@link FxSingleBarrierOptionTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link FxSingleBarrierOptionTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxSingleBarrierOptionTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange, Act and Assert
    assertSame(
        FxSingleBarrierOptionTradeCsvPlugin.HEADERS,
        FxSingleBarrierOptionTradeCsvPlugin.INSTANCE.headers(new ArrayList<>()));
  }
}
