package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fx.FxSwapTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxSwapTradeCsvPluginDiffblueTest {
  /**
   * Test {@link FxSwapTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link FxSwapTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxSwapTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = FxSwapTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(2, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("FX SWAP"));
    assertTrue(actualTradeTypeNamesResult.contains("FXSWAP"));
  }

  /**
   * Test {@link FxSwapTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link FxSwapTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxSwapTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("FxSwapTrade", FxSwapTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link FxSwapTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link FxSwapTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxSwapTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        FxSwapTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(FxSwapTrade.class));
  }

  /**
   * Test {@link FxSwapTradeCsvPlugin#headers(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is twenty.
   * </ul>
   *
   * <p>Method under test: {@link FxSwapTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List); when ArrayList(); then return size is twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxSwapTradeCsvPlugin.headers(List)"})
  void testHeaders_whenArrayList_thenReturnSizeIsTwenty() {
    // Arrange and Act
    Set<String> actualHeadersResult = FxSwapTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(20, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains("Far Leg 1 Direction"));
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
