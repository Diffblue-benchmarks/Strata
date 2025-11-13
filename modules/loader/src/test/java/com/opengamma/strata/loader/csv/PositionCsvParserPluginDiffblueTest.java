package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PositionCsvParserPluginDiffblueTest {
  /**
   * Test {@link PositionCsvParserPlugin#extendedEnum()}.
   *
   * <p>Method under test: {@link PositionCsvParserPlugin#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum PositionCsvParserPlugin.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<PositionCsvParserPlugin> actualExtendedEnumResult =
        PositionCsvParserPlugin.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<PositionCsvParserPlugin> expectedType = PositionCsvParserPlugin.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
