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

class FixedIborSwapConventionDiffblueTest {
  /**
   * Test {@link FixedIborSwapConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link FixedIborSwapConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum FixedIborSwapConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<FixedIborSwapConvention> actualExtendedEnumResult =
        FixedIborSwapConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<FixedIborSwapConvention> expectedType = FixedIborSwapConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }

  /**
   * Test {@link FixedIborSwapConvention#toTemplate(Tenor)}.
   *
   * <ul>
   *   <li>Then Convention return {@link ImmutableFixedIborSwapConvention}.
   * </ul>
   *
   * <p>Method under test: {@link FixedIborSwapConvention#toTemplate(Tenor)}
   */
  @Test
  @DisplayName("Test toTemplate(Tenor); then Convention return ImmutableFixedIborSwapConvention")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedIborSwapTemplate FixedIborSwapConvention.toTemplate(Tenor)"})
  void testToTemplate_thenConventionReturnImmutableFixedIborSwapConvention() {
    // Arrange
    FixedIborSwapConvention fixedIborSwapConvention =
        FixedIborSwapConventions.CHF_FIXED_1Y_LIBOR_3M;
    Tenor tenor = Tenor.ofDays(1);

    // Act
    FixedIborSwapTemplate actualToTemplateResult = fixedIborSwapConvention.toTemplate(tenor);

    // Assert
    FixedIborSwapConvention convention = actualToTemplateResult.getConvention();
    assertTrue(convention instanceof ImmutableFixedIborSwapConvention);
    assertEquals("CHF-FIXED-1Y-LIBOR-3M", convention.getName());
    Period periodToStart = actualToTemplateResult.getPeriodToStart();
    assertEquals(0, periodToStart.getDays());
    assertEquals(0, periodToStart.getMonths());
    assertEquals(0, periodToStart.getYears());
    assertEquals(0L, periodToStart.toTotalMonths());
    assertEquals(3, periodToStart.getUnits().size());
    assertFalse(periodToStart.isNegative());
    assertTrue(periodToStart.isZero());
    assertSame(tenor, actualToTemplateResult.getTenor());
    assertSame(fixedIborSwapConvention, convention);
  }
}
