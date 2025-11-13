package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.credit.CdsTrade;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CdsTradeCsvPluginDiffblueTest {
  /**
   * Test {@link CdsTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link CdsTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CdsTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = CdsTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(1, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("CDS"));
  }

  /**
   * Test {@link CdsTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link CdsTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CdsTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange and Act
    Set<String> actualHeadersResult = CdsTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(18, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.BUY_SELL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.DAY_COUNT_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.END_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.FIXED_RATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEGAL_ENTITY_ID_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEGAL_ENTITY_ID_SCHEME_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.NOTIONAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_ON_DEFAULT_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PROTECTION_START_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.START_DATE_FIELD));
  }

  /**
   * Test {@link CdsTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link CdsTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CdsTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("CdsTrade", CdsTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link CdsTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link CdsTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CdsTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        CdsTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(CdsTrade.class));
  }

  /**
   * Test {@link CdsTradeCsvPlugin#createHeaders(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return size is eighteen.
   * </ul>
   *
   * <p>Method under test: {@link CdsTradeCsvPlugin#createHeaders(boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}
   */
  @Test
  @DisplayName(
      "Test createHeaders(boolean, boolean, boolean, boolean, boolean, boolean, boolean); when 'false'; then return size is eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LinkedHashSet CdsTradeCsvPlugin.createHeaders(boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  void testCreateHeaders_whenFalse_thenReturnSizeIsEighteen() {
    // Arrange and Act
    LinkedHashSet<String> actualCreateHeadersResult =
        CdsTradeCsvPlugin.createHeaders(false, false, false, false, false, false, false);

    // Assert
    assertEquals(18, actualCreateHeadersResult.size());
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.DAY_COUNT_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.END_DATE_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.LEGAL_ENTITY_ID_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.LEGAL_ENTITY_ID_SCHEME_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.PAYMENT_ON_DEFAULT_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.PROTECTION_START_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.START_DATE_FIELD));
  }

  /**
   * Test {@link CdsTradeCsvPlugin#createHeaders(boolean, boolean, boolean, boolean, boolean,
   * boolean, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return size is forty-one.
   * </ul>
   *
   * <p>Method under test: {@link CdsTradeCsvPlugin#createHeaders(boolean, boolean, boolean,
   * boolean, boolean, boolean, boolean)}
   */
  @Test
  @DisplayName(
      "Test createHeaders(boolean, boolean, boolean, boolean, boolean, boolean, boolean); when 'true'; then return size is forty-one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LinkedHashSet CdsTradeCsvPlugin.createHeaders(boolean, boolean, boolean, boolean, boolean, boolean, boolean)"
  })
  void testCreateHeaders_whenTrue_thenReturnSizeIsFortyOne() {
    // Arrange and Act
    LinkedHashSet<String> actualCreateHeadersResult =
        CdsTradeCsvPlugin.createHeaders(true, true, true, true, true, true, true);

    // Assert
    assertEquals(41, actualCreateHeadersResult.size());
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.CDS_INDEX_ID_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.CDS_INDEX_ID_SCHEME_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.LEGAL_ENTITY_ID_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.LEGAL_ENTITY_ID_SCHEME_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.PREMIUM_AMOUNT_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.PREMIUM_CURRENCY_FIELD));
    assertTrue(actualCreateHeadersResult.contains(CsvLoaderColumns.PREMIUM_DIRECTION_FIELD));
  }
}
