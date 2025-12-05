package com.opengamma.strata.product.fx.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxSwapConventionDiffblueTest {
  /**
   * Test {@link FxSwapConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link FxSwapConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum FxSwapConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<FxSwapConvention> actualExtendedEnumResult = FxSwapConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<FxSwapConvention> expectedType = FxSwapConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
