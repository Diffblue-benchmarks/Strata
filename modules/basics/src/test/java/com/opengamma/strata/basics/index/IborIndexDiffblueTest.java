package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborIndexDiffblueTest {
  /**
   * Test {@link IborIndex#extendedEnum()}.
   *
   * <p>Method under test: {@link IborIndex#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum IborIndex.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<IborIndex> actualExtendedEnumResult = IborIndex.extendedEnum();

    // Assert
    ImmutableMap<String, String> alternateNamesResult = actualExtendedEnumResult.alternateNames();
    assertEquals(1, alternateNamesResult.size());
    assertEquals("KRW-CD-13W", alternateNamesResult.get("KRW-CD-3M"));
    Class<IborIndex> expectedType = IborIndex.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
