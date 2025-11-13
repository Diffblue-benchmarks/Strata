package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.deposit.TermDepositTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TermDepositTradeCsvPluginDiffblueTest {
  /**
   * Test {@link TermDepositTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link TermDepositTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set TermDepositTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = TermDepositTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(2, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("TERM DEPOSIT"));
    assertTrue(actualTradeTypeNamesResult.contains("TERMDEPOSIT"));
  }

  /**
   * Test {@link TermDepositTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link TermDepositTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String TermDepositTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("TermDepositTrade", TermDepositTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link TermDepositTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link TermDepositTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set TermDepositTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        TermDepositTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(TermDepositTrade.class));
  }

  /**
   * Test {@link TermDepositTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link TermDepositTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set TermDepositTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange and Act
    Set<String> actualHeadersResult = TermDepositTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(9, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.BUY_SELL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.DATE_ADJ_CAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.DATE_ADJ_CNV_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.DAY_COUNT_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.END_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.FIXED_RATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.NOTIONAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.START_DATE_FIELD));
  }
}
