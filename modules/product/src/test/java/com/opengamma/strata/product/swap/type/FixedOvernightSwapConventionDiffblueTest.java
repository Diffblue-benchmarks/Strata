package com.opengamma.strata.product.swap.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.collect.named.ExtendedEnum;
import java.time.Period;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedOvernightSwapConventionDiffblueTest {
  /**
   * Test {@link FixedOvernightSwapConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link FixedOvernightSwapConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum FixedOvernightSwapConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<FixedOvernightSwapConvention> actualExtendedEnumResult =
        FixedOvernightSwapConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<FixedOvernightSwapConvention> expectedType = FixedOvernightSwapConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }

  /**
   * Test {@link FixedOvernightSwapConvention#toTemplate(Tenor)}.
   *
   * <ul>
   *   <li>Then Convention return {@link ImmutableFixedOvernightSwapConvention}.
   * </ul>
   *
   * <p>Method under test: {@link FixedOvernightSwapConvention#toTemplate(Tenor)}
   */
  @Test
  @DisplayName(
      "Test toTemplate(Tenor); then Convention return ImmutableFixedOvernightSwapConvention")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedOvernightSwapTemplate FixedOvernightSwapConvention.toTemplate(Tenor)"})
  void testToTemplate_thenConventionReturnImmutableFixedOvernightSwapConvention() {
    // Arrange
    FixedOvernightSwapConvention fixedOvernightSwapConvention =
        FixedOvernightSwapConventions.CHF_FIXED_1Y_SARON_OIS;
    Tenor tenor = Tenor.ofDays(1);

    // Act
    FixedOvernightSwapTemplate actualToTemplateResult =
        fixedOvernightSwapConvention.toTemplate(tenor);

    // Assert
    FixedOvernightSwapConvention convention = actualToTemplateResult.getConvention();
    assertTrue(convention instanceof ImmutableFixedOvernightSwapConvention);
    assertEquals("CHF-FIXED-1Y-SARON-OIS", convention.getName());
    Period periodToStart = actualToTemplateResult.getPeriodToStart();
    assertEquals(0, periodToStart.getDays());
    assertEquals(0, periodToStart.getMonths());
    assertEquals(0, periodToStart.getYears());
    assertEquals(0L, periodToStart.toTotalMonths());
    assertEquals(3, periodToStart.getUnits().size());
    assertFalse(periodToStart.isNegative());
    assertTrue(periodToStart.isZero());
    assertSame(tenor, actualToTemplateResult.getTenor());
    assertSame(fixedOvernightSwapConvention, convention);
  }
}
