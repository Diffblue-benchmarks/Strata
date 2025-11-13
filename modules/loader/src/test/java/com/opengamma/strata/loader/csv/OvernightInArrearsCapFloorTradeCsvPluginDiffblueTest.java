package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.collect.io.CsvRow;
import com.opengamma.strata.product.TradeInfo;
import com.opengamma.strata.product.capfloor.OvernightInArrearsCapFloorTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class OvernightInArrearsCapFloorTradeCsvPluginDiffblueTest {
  /**
   * Test {@link OvernightInArrearsCapFloorTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link OvernightInArrearsCapFloorTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set OvernightInArrearsCapFloorTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult =
        OvernightInArrearsCapFloorTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(2, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("OVERNIGHT CAPFLOOR"));
    assertTrue(actualTradeTypeNamesResult.contains("OVERNIGHTCAPFLOOR"));
  }

  /**
   * Test {@link OvernightInArrearsCapFloorTradeCsvPlugin#parseTrade(Class, CsvRow, List, TradeInfo,
   * TradeCsvInfoResolver)}.
   *
   * <ul>
   *   <li>When {@code Index}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link OvernightInArrearsCapFloorTradeCsvPlugin#parseTrade(Class, CsvRow,
   * List, TradeInfo, TradeCsvInfoResolver)}
   */
  @Test
  @DisplayName(
      "Test parseTrade(Class, CsvRow, List, TradeInfo, TradeCsvInfoResolver); when 'com.opengamma.strata.basics.index.Index'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional OvernightInArrearsCapFloorTradeCsvPlugin.parseTrade(Class, CsvRow, List, TradeInfo, TradeCsvInfoResolver)"
  })
  void testParseTrade_whenComOpengammaStrataBasicsIndexIndex_thenReturnNotPresent() {
    // Arrange
    Class<Index> requiredJavaType = Index.class;
    ArrayList<CsvRow> additionalRows = new ArrayList<>();

    // Act and Assert
    assertFalse(
        OvernightInArrearsCapFloorTradeCsvPlugin.INSTANCE
            .parseTrade(
                requiredJavaType,
                null,
                additionalRows,
                TradeInfo.empty(),
                mock(TradeCsvInfoResolver.class))
            .isPresent());
  }

  /**
   * Test {@link OvernightInArrearsCapFloorTradeCsvPlugin#parseTrade(Class, CsvRow, List, TradeInfo,
   * TradeCsvInfoResolver)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link OvernightInArrearsCapFloorTradeCsvPlugin#parseTrade(Class, CsvRow,
   * List, TradeInfo, TradeCsvInfoResolver)}
   */
  @Test
  @DisplayName(
      "Test parseTrade(Class, CsvRow, List, TradeInfo, TradeCsvInfoResolver); when 'java.lang.Object'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional OvernightInArrearsCapFloorTradeCsvPlugin.parseTrade(Class, CsvRow, List, TradeInfo, TradeCsvInfoResolver)"
  })
  void testParseTrade_whenJavaLangObject_thenThrowUnsupportedOperationException() {
    // Arrange
    Class<Object> requiredJavaType = Object.class;
    ArrayList<CsvRow> additionalRows = new ArrayList<>();
    TradeInfo info = TradeInfo.empty();

    TradeCsvInfoResolver resolver = mock(TradeCsvInfoResolver.class);
    when(resolver.parseOvernightCapFloorTrade(Mockito.<CsvRow>any(), Mockito.<TradeInfo>any()))
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            OvernightInArrearsCapFloorTradeCsvPlugin.INSTANCE.parseTrade(
                requiredJavaType, null, additionalRows, info, resolver));
    verify(resolver).parseOvernightCapFloorTrade(isNull(), isA(TradeInfo.class));
  }

  /**
   * Test {@link OvernightInArrearsCapFloorTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link OvernightInArrearsCapFloorTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String OvernightInArrearsCapFloorTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals(
        "OvernightInArrearsCapFloorTrade",
        OvernightInArrearsCapFloorTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link OvernightInArrearsCapFloorTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link OvernightInArrearsCapFloorTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set OvernightInArrearsCapFloorTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        OvernightInArrearsCapFloorTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(OvernightInArrearsCapFloorTrade.class));
  }

  /**
   * Test {@link OvernightInArrearsCapFloorTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link OvernightInArrearsCapFloorTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set OvernightInArrearsCapFloorTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange and Act
    Set<String> actualHeadersResult =
        OvernightInArrearsCapFloorTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(28, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CAP_FLOOR_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.DIRECTION_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.END_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.INDEX_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.NOTIONAL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PAYMENT_FREQUENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_AMOUNT_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PREMIUM_CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.START_DATE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.STRIKE_FIELD));
  }
}
