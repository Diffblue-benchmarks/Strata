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
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.collect.io.CsvRow;
import com.opengamma.strata.product.TradeInfo;
import com.opengamma.strata.product.capfloor.IborCapFloorTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class IborCapFloorTradeCsvPluginDiffblueTest {
  /**
   * Test {@link IborCapFloorTradeCsvPlugin#tradeTypeNames()}.
   *
   * <p>Method under test: {@link IborCapFloorTradeCsvPlugin#tradeTypeNames()}
   */
  @Test
  @DisplayName("Test tradeTypeNames()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IborCapFloorTradeCsvPlugin.tradeTypeNames()"})
  void testTradeTypeNames() {
    // Arrange and Act
    Set<String> actualTradeTypeNamesResult = IborCapFloorTradeCsvPlugin.INSTANCE.tradeTypeNames();

    // Assert
    assertEquals(3, actualTradeTypeNamesResult.size());
    assertTrue(actualTradeTypeNamesResult.contains("CAPFLOOR"));
    assertTrue(actualTradeTypeNamesResult.contains("IBOR CAPFLOOR"));
    assertTrue(actualTradeTypeNamesResult.contains("IBORCAPFLOOR"));
  }

  /**
   * Test {@link IborCapFloorTradeCsvPlugin#parseTrade(Class, CsvRow, List, TradeInfo,
   * TradeCsvInfoResolver)}.
   *
   * <ul>
   *   <li>When {@code IborIndex}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link IborCapFloorTradeCsvPlugin#parseTrade(Class, CsvRow, List,
   * TradeInfo, TradeCsvInfoResolver)}
   */
  @Test
  @DisplayName(
      "Test parseTrade(Class, CsvRow, List, TradeInfo, TradeCsvInfoResolver); when 'com.opengamma.strata.basics.index.IborIndex'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional IborCapFloorTradeCsvPlugin.parseTrade(Class, CsvRow, List, TradeInfo, TradeCsvInfoResolver)"
  })
  void testParseTrade_whenComOpengammaStrataBasicsIndexIborIndex_thenReturnNotPresent() {
    // Arrange
    Class<IborIndex> requiredJavaType = IborIndex.class;
    ArrayList<CsvRow> additionalRows = new ArrayList<>();

    // Act and Assert
    assertFalse(
        IborCapFloorTradeCsvPlugin.INSTANCE
            .parseTrade(
                requiredJavaType,
                null,
                additionalRows,
                TradeInfo.empty(),
                mock(TradeCsvInfoResolver.class))
            .isPresent());
  }

  /**
   * Test {@link IborCapFloorTradeCsvPlugin#parseTrade(Class, CsvRow, List, TradeInfo,
   * TradeCsvInfoResolver)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link IborCapFloorTradeCsvPlugin#parseTrade(Class, CsvRow, List,
   * TradeInfo, TradeCsvInfoResolver)}
   */
  @Test
  @DisplayName(
      "Test parseTrade(Class, CsvRow, List, TradeInfo, TradeCsvInfoResolver); when 'java.lang.Object'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional IborCapFloorTradeCsvPlugin.parseTrade(Class, CsvRow, List, TradeInfo, TradeCsvInfoResolver)"
  })
  void testParseTrade_whenJavaLangObject_thenThrowUnsupportedOperationException() {
    // Arrange
    Class<Object> requiredJavaType = Object.class;
    ArrayList<CsvRow> additionalRows = new ArrayList<>();
    TradeInfo info = TradeInfo.empty();

    TradeCsvInfoResolver resolver = mock(TradeCsvInfoResolver.class);
    when(resolver.parseIborCapFloorTrade(Mockito.<CsvRow>any(), Mockito.<TradeInfo>any()))
        .thenThrow(new UnsupportedOperationException());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            IborCapFloorTradeCsvPlugin.INSTANCE.parseTrade(
                requiredJavaType, null, additionalRows, info, resolver));
    verify(resolver).parseIborCapFloorTrade(isNull(), isA(TradeInfo.class));
  }

  /**
   * Test {@link IborCapFloorTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link IborCapFloorTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IborCapFloorTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("IborCapFloorTrade", IborCapFloorTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link IborCapFloorTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link IborCapFloorTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IborCapFloorTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        IborCapFloorTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(IborCapFloorTrade.class));
  }

  /**
   * Test {@link IborCapFloorTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link IborCapFloorTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set IborCapFloorTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange and Act
    Set<String> actualHeadersResult =
        IborCapFloorTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

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
