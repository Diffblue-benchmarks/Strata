package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.product.GenericSecurityTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GenericSecurityTradeCsvPluginDiffblueTest {
  /**
   * Test {@link GenericSecurityTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link GenericSecurityTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set GenericSecurityTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange and Act
    Set<String> actualHeadersResult =
        GenericSecurityTradeCsvPlugin.INSTANCE.headers(new ArrayList<>());

    // Assert
    assertEquals(9, actualHeadersResult.size());
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.BUY_SELL_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CONTRACT_SIZE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.CURRENCY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.PRICE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.QUANTITY_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.SECURITY_ID_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.SECURITY_ID_SCHEME_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.TICK_SIZE_FIELD));
    assertTrue(actualHeadersResult.contains(CsvLoaderColumns.TICK_VALUE_FIELD));
  }

  /**
   * Test {@link GenericSecurityTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link GenericSecurityTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String GenericSecurityTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("GenericSecurityTrade", GenericSecurityTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link GenericSecurityTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link GenericSecurityTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set GenericSecurityTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        GenericSecurityTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(GenericSecurityTrade.class));
  }

  /**
   * Test new {@link GenericSecurityTradeCsvPlugin} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * GenericSecurityTradeCsvPlugin}
   */
  @Test
  @DisplayName("Test new GenericSecurityTradeCsvPlugin (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void GenericSecurityTradeCsvPlugin.<init>()"})
  void testNewGenericSecurityTradeCsvPlugin() {
    // Arrange, Act and Assert
    assertEquals("GenericSecurityTrade", new GenericSecurityTradeCsvPlugin().getName());
  }
}
