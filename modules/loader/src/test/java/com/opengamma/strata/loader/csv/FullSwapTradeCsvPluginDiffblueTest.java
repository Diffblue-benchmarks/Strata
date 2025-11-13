package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.io.CsvOutput;
import com.opengamma.strata.collect.io.CsvOutput.CsvRowOutputWithHeaders;
import com.opengamma.strata.product.swap.SwapTrade;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FullSwapTradeCsvPluginDiffblueTest {
  /**
   * Test {@link FullSwapTradeCsvPlugin#headers(List)}.
   *
   * <p>Method under test: {@link FullSwapTradeCsvPlugin#headers(List)}
   */
  @Test
  @DisplayName("Test headers(List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FullSwapTradeCsvPlugin.headers(List)"})
  void testHeaders() {
    // Arrange, Act and Assert
    assertTrue(FullSwapTradeCsvPlugin.INSTANCE.headers(new ArrayList<>()).isEmpty());
  }

  /**
   * Test {@link FullSwapTradeCsvPlugin#writeCsv(CsvRowOutputWithHeaders, SwapTrade)} with {@code
   * CsvRowOutputWithHeaders}, {@code SwapTrade}.
   *
   * <p>Method under test: {@link FullSwapTradeCsvPlugin#writeCsv(CsvOutput.CsvRowOutputWithHeaders,
   * SwapTrade)}
   */
  @Test
  @DisplayName(
      "Test writeCsv(CsvRowOutputWithHeaders, SwapTrade) with 'CsvRowOutputWithHeaders', 'SwapTrade'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void FullSwapTradeCsvPlugin.writeCsv(CsvOutput.CsvRowOutputWithHeaders, SwapTrade)"
  })
  void testWriteCsvWithCsvRowOutputWithHeadersSwapTrade() {
    // Arrange
    CsvRowOutputWithHeaders csv = mock(CsvRowOutputWithHeaders.class);
    when(csv.writeCell(Mockito.<String>any(), Mockito.<String>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> FullSwapTradeCsvPlugin.INSTANCE.writeCsv(csv, null));
    verify(csv).writeCell("Strata Trade Type", "Swap");
  }

  /**
   * Test {@link FullSwapTradeCsvPlugin#getName()}.
   *
   * <p>Method under test: {@link FullSwapTradeCsvPlugin#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FullSwapTradeCsvPlugin.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals("SwapTrade", FullSwapTradeCsvPlugin.INSTANCE.getName());
  }

  /**
   * Test {@link FullSwapTradeCsvPlugin#supportedTradeTypes()}.
   *
   * <p>Method under test: {@link FullSwapTradeCsvPlugin#supportedTradeTypes()}
   */
  @Test
  @DisplayName("Test supportedTradeTypes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set FullSwapTradeCsvPlugin.supportedTradeTypes()"})
  void testSupportedTradeTypes() {
    // Arrange and Act
    Set<Class<?>> actualSupportedTradeTypesResult =
        FullSwapTradeCsvPlugin.INSTANCE.supportedTradeTypes();

    // Assert
    assertEquals(1, actualSupportedTradeTypesResult.size());
    assertTrue(actualSupportedTradeTypesResult.contains(SwapTrade.class));
  }
}
