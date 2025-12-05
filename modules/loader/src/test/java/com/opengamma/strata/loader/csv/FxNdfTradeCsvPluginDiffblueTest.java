package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.fx.FxNdfTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxNdfTradeCsvPluginDiffblueTest {
  /**
   * Test {@link FxNdfTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link FxNdfTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxNdfTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = FxNdfTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(3, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("FX NDF"));
    assertTrue(actualTradeTypeNamesResult.contains("FXNDF"));
    assertTrue(actualTradeTypeNamesResult.contains("NDF"));
  }

  /**
   * Test {@link FxNdfTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link FxNdfTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxNdfTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("FxNdf", FxNdfTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link FxNdfTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link FxNdfTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxNdfTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        FxNdfTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(FxNdfTrade.class));
  }

  /**
   * Test {@link FxNdfTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link FxNdfTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FxNdfTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange and Act
    Set<String> actualHeadersResult = FxNdfTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(9, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains("FX Index"));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.FX_RATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_1_CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_1_DIRECTION_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_1_NOTIONAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_2_CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_2_DIRECTION_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.LEG_2_NOTIONAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_DATE_FIELD));
  }
}
