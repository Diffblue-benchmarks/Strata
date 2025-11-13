package com.opengamma.strata.product.deposit.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborFixingDepositConventionDiffblueTest {
  /**
   * Test {@link IborFixingDepositConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link IborFixingDepositConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum IborFixingDepositConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<IborFixingDepositConvention> actualExtendedEnumResult =
        IborFixingDepositConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<IborFixingDepositConvention> expectedType = IborFixingDepositConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
