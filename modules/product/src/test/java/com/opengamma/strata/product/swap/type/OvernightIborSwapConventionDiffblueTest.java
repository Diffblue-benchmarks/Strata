package com.opengamma.strata.product.swap.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OvernightIborSwapConventionDiffblueTest {
  /**
   * Test {@link OvernightIborSwapConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link OvernightIborSwapConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum OvernightIborSwapConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<OvernightIborSwapConvention> actualExtendedEnumResult =
        OvernightIborSwapConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<OvernightIborSwapConvention> expectedType = OvernightIborSwapConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
