package com.opengamma.strata.loader.fpml;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FpmlParserPluginDiffblueTest {
  /**
   * Test {@link FpmlParserPlugin#extendedEnum()}.
   *
   * <p>Method under test: {@link FpmlParserPlugin#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum FpmlParserPlugin.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<FpmlParserPlugin> actualExtendedEnumResult = FpmlParserPlugin.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<FpmlParserPlugin> expectedType = FpmlParserPlugin.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
