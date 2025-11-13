package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fxopt.FxVanillaOptionTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxVanillaOptionTradeCsvPluginDiffblueTest {
  /**
   * Test {@link FxVanillaOptionTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link FxVanillaOptionTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxVanillaOptionTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult =
        FxVanillaOptionTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(2, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("FX VANILLA OPTION"));
    assertTrue(actualTradeTypeNamesResult.contains("FXVANILLAOPTION"));
  }

  /**
   * Test {@link FxVanillaOptionTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link FxVanillaOptionTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxVanillaOptionTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("FxVanillaOptionTrade", FxVanillaOptionTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link FxVanillaOptionTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link FxVanillaOptionTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxVanillaOptionTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        FxVanillaOptionTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(FxVanillaOptionTrade.class));
  }

  /**
   * Test {@link FxVanillaOptionTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link FxVanillaOptionTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxVanillaOptionTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange and Act
    Set<String> actualHeadersResult =
        FxVanillaOptionTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(20, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.EXPIRY_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.EXPIRY_TIME_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.EXPIRY_ZONE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_1_DIRECTION_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LONG_SHORT_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_AMOUNT_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_DATE_CAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_DATE_CNV_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_DIRECTION_FIELD));
  }
}
