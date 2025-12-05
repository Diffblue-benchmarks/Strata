package com.opengamma.strata.product.swap.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OvernightOvernightSwapConventionDiffblueTest {
  /**
   * Test {@link OvernightOvernightSwapConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link OvernightOvernightSwapConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum OvernightOvernightSwapConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<OvernightOvernightSwapConvention> actualExtendedEnumResult =
        OvernightOvernightSwapConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<OvernightOvernightSwapConvention> expectedType = OvernightOvernightSwapConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
