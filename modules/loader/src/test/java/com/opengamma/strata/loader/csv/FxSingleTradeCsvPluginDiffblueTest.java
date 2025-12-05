package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fx.FxSingleTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxSingleTradeCsvPluginDiffblueTest {
  /**
   * Test {@link FxSingleTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link FxSingleTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxSingleTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = FxSingleTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(3, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("FX SINGLE"));
    assertTrue(actualTradeTypeNamesResult.contains("FX"));
    assertTrue(actualTradeTypeNamesResult.contains("FXSINGLE"));
  }

  /**
   * Test {@link FxSingleTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link FxSingleTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxSingleTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("FxSingleTrade", FxSingleTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link FxSingleTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link FxSingleTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxSingleTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        FxSingleTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(FxSingleTrade.class));
  }

  /**
   * Test {@link FxSingleTradeCsvPlugin#headers(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is ten.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List); when ArrayList(); then return size is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxSingleTradeCsvPlugin.headers(List)"})
  void testHeaders_whenArrayList_thenReturnSizeIsTen() {
    // Arrange and Act
    Set<String> actualHeadersResult = FxSingleTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(10, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_1_CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_1_DIRECTION_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_1_NOTIONAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_1_PAYMENT_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_2_CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_2_DIRECTION_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_2_NOTIONAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_2_PAYMENT_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_DATE_CAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_DATE_CNV_FIELD));
  }
}
