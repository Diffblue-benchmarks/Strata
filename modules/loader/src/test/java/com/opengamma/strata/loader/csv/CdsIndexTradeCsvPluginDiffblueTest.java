package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.credit.CdsIndexTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CdsIndexTradeCsvPluginDiffblueTest {
  /**
   * Test {@link CdsIndexTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link CdsIndexTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CdsIndexTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = CdsIndexTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(2, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("CDS INDEX"));
    assertTrue(actualTradeTypeNamesResult.contains("CDSINDEX"));
  }

  /**
   * Test {@link CdsIndexTradeCsvPlugin#headers(List)}.
   *
   * <ul>
   *   <li>Given {@link CdsIndexTradeCsvPlugin} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link CdsIndexTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List); given CdsIndexTradeCsvPlugin (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CdsIndexTradeCsvPlugin.headers(List)"})
  void testHeaders_givenCdsIndexTradeCsvPlugin() {
    // Arrange
    CdsIndexTradeCsvPlugin cdsIndexTradeCsvPlugin = new CdsIndexTradeCsvPlugin();

    // Act
    Set<String> actualHeadersResult = cdsIndexTradeCsvPlugin.headers(new ArrayList<>());

    // Assert
    assertEquals(20, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.BUY_SELL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CDS_INDEX_ID_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CDS_INDEX_ID_SCHEME_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.DAY_COUNT_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.FIXED_RATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEGAL_ENTITY_ID_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEGAL_ENTITY_ID_SCHEME_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.NOTIONAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_ON_DEFAULT_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PROTECTION_START_FIELD));
  }

  /**
   * Test {@link CdsIndexTradeCsvPlugin#headers(List)}.
   *
   * <ul>
   *   <li>Given {@link CdsIndexTradeCsvPlugin#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link CdsIndexTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List); given INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CdsIndexTradeCsvPlugin.headers(List)"})
  void testHeaders_givenInstance() {
    // Arrange and Act
    Set<String> actualHeadersResult = CdsIndexTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(20, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.BUY_SELL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CDS_INDEX_ID_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CDS_INDEX_ID_SCHEME_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.DAY_COUNT_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.FIXED_RATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEGAL_ENTITY_ID_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEGAL_ENTITY_ID_SCHEME_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.NOTIONAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_ON_DEFAULT_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PROTECTION_START_FIELD));
  }

  /**
   * Test {@link CdsIndexTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link CdsIndexTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CdsIndexTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("CdsIndexTrade", CdsIndexTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link CdsIndexTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link CdsIndexTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CdsIndexTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        CdsIndexTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(CdsIndexTrade.class));
  }

  /**
   * Test new {@link CdsIndexTradeCsvPlugin} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link CdsIndexTradeCsvPlugin}
   */
  @Test
  @DisplayName("Test new CdsIndexTradeCsvPlugin (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CdsIndexTradeCsvPlugin.<init>()"})
  void testNewCdsIndexTradeCsvPlugin() {
    // Arrange, Act and Assert
    assertEquals("CdsIndexTrade", new CdsIndexTradeCsvPlugin().getName());
  }
}
