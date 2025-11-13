package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fra.FraTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FraTradeCsvPluginDiffblueTest {
  /**
   * Test {@link FraTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link FraTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FraTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = FraTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(1, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("FRA"));
  }

  /**
   * Test {@link FraTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link FraTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FraTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("FraTrade", FraTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link FraTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link FraTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FraTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        FraTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(FraTrade.class));
  }

  /**
   * Test {@link FraTradeCsvPlugin#headers(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is eleven.
   * </ul>
   *
   * <p>Method under test: {@link FraTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List); when ArrayList(); then return size is eleven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FraTradeCsvPlugin.headers(List)"})
  void testHeaders_whenArrayList_thenReturnSizeIsEleven() {
    // Arrange and Act
    Set<String> actualHeadersResult = FraTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(11, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.BUY_SELL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.DATE_ADJ_CAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.DATE_ADJ_CNV_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.END_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.FIXED_RATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.INDEX_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.NOTIONAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_DATE_CAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_DATE_CNV_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.START_DATE_FIELD));
  }
}
