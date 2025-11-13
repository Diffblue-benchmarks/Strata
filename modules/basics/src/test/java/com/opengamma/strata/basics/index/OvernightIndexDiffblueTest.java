package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OvernightIndexDiffblueTest {
  /**
   * Test {@link OvernightIndex#extendedEnum()}.
   *
   * <p>Method under test: {@link OvernightIndex#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum OvernightIndex.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<OvernightIndex> actualExtendedEnumResult = OvernightIndex.extendedEnum();

    // Assert
    ImmutableMap<String, String> alternateNamesResult = actualExtendedEnumResult.alternateNames();
    assertEquals(13, alternateNamesResult.size());
    assertEquals("HKD-HONIA", alternateNamesResult.get("HKD-HONIX"));
    assertEquals("JPY-TONAR", alternateNamesResult.get("JPY-TONA"));
    assertEquals("USD-FED-FUND", alternateNamesResult.get("USD-FED-FUNDS"));
    assertEquals("USD-FED-FUND", alternateNamesResult.get("USD-FEDERAL FUNDS"));
    assertEquals("USD-FED-FUND", alternateNamesResult.get("USD-FEDFUNDS"));
    assertEquals("USD-FED-FUND", alternateNamesResult.get("USD-Federal Funds"));
    Class<OvernightIndex> expectedType = OvernightIndex.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
