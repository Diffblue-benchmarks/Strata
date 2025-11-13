package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.io.CsvRow;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeCsvParserPluginDiffblueTest {
  /**
   * Test {@link TradeCsvParserPlugin#extendedEnum()}.
   *
   * <p>Method under test: {@link TradeCsvParserPlugin#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum TradeCsvParserPlugin.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<TradeCsvParserPlugin> actualExtendedEnumResult =
        TradeCsvParserPlugin.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<TradeCsvParserPlugin> expectedType = TradeCsvParserPlugin.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }

  /**
   * Test {@link TradeCsvParserPlugin#isAdditionalRow(CsvRow, CsvRow)}.
   *
   * <p>Method under test: {@link TradeCsvParserPlugin#isAdditionalRow(CsvRow, CsvRow)}
   */
  @Test
  @DisplayName("Test isAdditionalRow(CsvRow, CsvRow)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeCsvParserPlugin.isAdditionalRow(CsvRow, CsvRow)"})
  void testIsAdditionalRow() {
    // Arrange, Act and Assert
    assertFalse(CdsIndexTradeCsvPlugin.INSTANCE.isAdditionalRow(null, null));
  }
}
