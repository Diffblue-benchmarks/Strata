package com.opengamma.strata.product.swap.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ThreeLegBasisSwapConventionDiffblueTest {
  /**
   * Test {@link ThreeLegBasisSwapConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link ThreeLegBasisSwapConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum ThreeLegBasisSwapConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<ThreeLegBasisSwapConvention> actualExtendedEnumResult =
        ThreeLegBasisSwapConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<ThreeLegBasisSwapConvention> expectedType = ThreeLegBasisSwapConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
