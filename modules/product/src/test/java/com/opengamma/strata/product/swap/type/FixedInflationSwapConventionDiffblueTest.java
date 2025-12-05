package com.opengamma.strata.product.swap.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedInflationSwapConventionDiffblueTest {
  /**
   * Test {@link FixedInflationSwapConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link FixedInflationSwapConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum FixedInflationSwapConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<FixedInflationSwapConvention> actualExtendedEnumResult =
        FixedInflationSwapConvention.extendedEnum();

    // Assert
    ImmutableMap<String, String> alternateNamesResult = actualExtendedEnumResult.alternateNames();
    assertEquals(1, alternateNamesResult.size());
    assertEquals("GBP-FIXED-ZC-GB-HICP", alternateNamesResult.get("GBP-FIXED-ZC-GB-HCIP"));
    Class<FixedInflationSwapConvention> expectedType = FixedInflationSwapConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
