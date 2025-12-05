package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.swaption.SwaptionTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwaptionTradeCsvPluginDiffblueTest {
  /**
   * Test {@link SwaptionTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link SwaptionTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SwaptionTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = SwaptionTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(1, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("SWAPTION"));
  }

  /**
   * Test {@link SwaptionTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link SwaptionTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SwaptionTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("SwaptionTrade", SwaptionTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link SwaptionTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link SwaptionTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SwaptionTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        SwaptionTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(SwaptionTrade.class));
  }

  /**
   * Test {@link SwaptionTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link SwaptionTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set SwaptionTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange and Act
    Set<String> actualHeadersResult = SwaptionTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(12, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.EXPIRY_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.EXPIRY_TIME_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.EXPIRY_ZONE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LONG_SHORT_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYOFF_SETTLEMENT_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYOFF_SETTLEMENT_TYPE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_DATE_CAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_DATE_CNV_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_DIRECTION_FIELD));
  }
}
