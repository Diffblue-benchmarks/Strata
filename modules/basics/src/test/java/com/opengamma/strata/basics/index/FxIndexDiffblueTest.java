package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.basics.date.DaysAdjustment;
import com.opengamma.strata.basics.date.HolidayCalendar;
import com.opengamma.strata.basics.date.HolidayCalendarId;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxIndexDiffblueTest {
  /**
   * Test {@link FxIndex#of(String)} with {@code uniqueName}.
   *
   * <ul>
   *   <li>When {@code Unique Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FxIndex#of(String)}
   */
  @Test
  @DisplayName(
      "Test of(String) with 'uniqueName'; when 'Unique Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxIndex FxIndex.of(String)"})
  void testOfWithUniqueName_whenUniqueName_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> FxIndex.of("Unique Name"));
  }

  /**
   * Test {@link FxIndex#of(String)} with {@code uniqueName}.
   *
   * <ul>
   *   <li>When {@code UUU/UUU}.
   *   <li>Then return {@link ImmutableFxIndex}.
   * </ul>
   *
   * <p>Method under test: {@link FxIndex#of(String)}
   */
  @Test
  @DisplayName("Test of(String) with 'uniqueName'; when 'UUU/UUU'; then return ImmutableFxIndex")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxIndex FxIndex.of(String)"})
  void testOfWithUniqueName_whenUuuUuu_thenReturnImmutableFxIndex() {
    // Arrange and Act
    FxIndex actualOfResult = FxIndex.of("UUU/UUU");

    // Assert
    assertTrue(actualOfResult instanceof ImmutableFxIndex);
    HolidayCalendarId fixingCalendar = actualOfResult.getFixingCalendar();
    assertEquals("NoHolidays", fixingCalendar.getName());
    assertEquals("NoHolidays", fixingCalendar.toString());
    assertEquals("UUU/UUU", actualOfResult.getName());
    DaysAdjustment fixingDateOffset = actualOfResult.getFixingDateOffset();
    assertEquals(-2, fixingDateOffset.getDays());
    CurrencyPair currencyPair = actualOfResult.getCurrencyPair();
    assertEquals(0, currencyPair.getRateDigits());
    DaysAdjustment maturityDateOffset = actualOfResult.getMaturityDateOffset();
    assertEquals(2, maturityDateOffset.getDays());
    assertTrue(currencyPair.isIdentity());
    CurrencyPair actualInverseResult = currencyPair.inverse();
    assertEquals(currencyPair, actualInverseResult);
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, fixingCalendar.getReferenceDataType());
    CurrencyPair actualToConventionalResult = currencyPair.toConventional();
    assertSame(currencyPair, actualToConventionalResult);
    assertSame(fixingCalendar, fixingDateOffset.getCalendar());
    assertSame(fixingCalendar, maturityDateOffset.getCalendar());
    assertSame(fixingCalendar, fixingDateOffset.getResultCalendar());
    assertSame(fixingCalendar, maturityDateOffset.getResultCalendar());
  }

  /**
   * Test {@link FxIndex#extendedEnum()}.
   *
   * <p>Method under test: {@link FxIndex#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum FxIndex.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<FxIndex> actualExtendedEnumResult = FxIndex.extendedEnum();

    // Assert
    ImmutableMap<String, String> alternateNamesResult = actualExtendedEnumResult.alternateNames();
    assertEquals(1, alternateNamesResult.size());
    assertEquals("USD/INR-FBIL-INR01", alternateNamesResult.get("USD/INR-RBIB-INR01"));
    Class<FxIndex> expectedType = FxIndex.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
