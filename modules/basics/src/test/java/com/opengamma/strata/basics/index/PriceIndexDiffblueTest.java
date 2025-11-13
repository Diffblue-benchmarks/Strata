package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PriceIndexDiffblueTest {
  /**
   * Test {@link PriceIndex#extendedEnum()}.
   *
   * <p>Method under test: {@link PriceIndex#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum PriceIndex.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<PriceIndex> actualExtendedEnumResult = PriceIndex.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<PriceIndex> expectedType = PriceIndex.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
