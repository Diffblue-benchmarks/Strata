package com.opengamma.strata.product.index.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborFutureConventionDiffblueTest {
  /**
   * Test {@link IborFutureConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link IborFutureConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum IborFutureConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<IborFutureConvention> actualExtendedEnumResult =
        IborFutureConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<IborFutureConvention> expectedType = IborFutureConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
