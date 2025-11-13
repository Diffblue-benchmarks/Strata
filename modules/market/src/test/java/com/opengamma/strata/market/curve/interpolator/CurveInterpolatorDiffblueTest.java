package com.opengamma.strata.market.curve.interpolator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurveInterpolatorDiffblueTest {
  /**
   * Test {@link CurveInterpolator#extendedEnum()}.
   *
   * <p>Method under test: {@link CurveInterpolator#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum CurveInterpolator.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<CurveInterpolator> actualExtendedEnumResult = CurveInterpolator.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<CurveInterpolator> expectedType = CurveInterpolator.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
