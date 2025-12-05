package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BusinessDayConventionDiffblueTest {
  /**
   * Test {@link BusinessDayConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link BusinessDayConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum BusinessDayConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<BusinessDayConvention> actualExtendedEnumResult =
        BusinessDayConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<BusinessDayConvention> expectedType = BusinessDayConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
