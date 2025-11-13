package com.opengamma.strata.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MeasureDiffblueTest {
  /**
   * Test {@link Measure#extendedEnum()}.
   *
   * <p>Method under test: {@link Measure#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum Measure.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<Measure> actualExtendedEnumResult = Measure.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<Measure> expectedType = Measure.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
