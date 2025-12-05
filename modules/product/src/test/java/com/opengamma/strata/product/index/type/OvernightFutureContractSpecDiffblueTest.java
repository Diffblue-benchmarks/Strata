package com.opengamma.strata.product.index.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OvernightFutureContractSpecDiffblueTest {
  /**
   * Test {@link OvernightFutureContractSpec#extendedEnum()}.
   *
   * <p>Method under test: {@link OvernightFutureContractSpec#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum OvernightFutureContractSpec.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<OvernightFutureContractSpec> actualExtendedEnumResult =
        OvernightFutureContractSpec.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<OvernightFutureContractSpec> expectedType = OvernightFutureContractSpec.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
