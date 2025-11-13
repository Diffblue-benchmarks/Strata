package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import com.opengamma.strata.collect.named.ExtendedEnum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HolidayCalendarsDiffblueTest {
  /**
   * Test {@link HolidayCalendars#defaultingReferenceData(ReferenceData)}.
   *
   * <ul>
   *   <li>Then return Underlying is {@link ReferenceData}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendars#defaultingReferenceData(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test defaultingReferenceData(ReferenceData); then return Underlying is ReferenceData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData HolidayCalendars.defaultingReferenceData(ReferenceData)"})
  void testDefaultingReferenceData_thenReturnUnderlyingIsReferenceData() {
    // Arrange
    ReferenceData underlying = mock(ReferenceData.class);

    // Act
    ReferenceData actualDefaultingReferenceDataResult =
        HolidayCalendars.defaultingReferenceData(underlying);
    Object actualQueryValueOrNullResult =
        actualDefaultingReferenceDataResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualDefaultingReferenceDataResult instanceof HolidaySafeReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertSame(
        underlying,
        ((HolidaySafeReferenceData) actualDefaultingReferenceDataResult).getUnderlying());
  }

  /**
   * Test {@link HolidayCalendars#defaultingReferenceData(ReferenceData)}.
   *
   * <ul>
   *   <li>Then Underlying return {@link HolidaySafeReferenceData}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendars#defaultingReferenceData(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test defaultingReferenceData(ReferenceData); then Underlying return HolidaySafeReferenceData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData HolidayCalendars.defaultingReferenceData(ReferenceData)"})
  void testDefaultingReferenceData_thenUnderlyingReturnHolidaySafeReferenceData() {
    // Arrange
    HolidaySafeReferenceData underlying = new HolidaySafeReferenceData(mock(ReferenceData.class));

    // Act
    ReferenceData actualDefaultingReferenceDataResult =
        HolidayCalendars.defaultingReferenceData(underlying);
    Object actualQueryValueOrNullResult =
        actualDefaultingReferenceDataResult.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    ReferenceData underlying2 =
        ((HolidaySafeReferenceData) actualDefaultingReferenceDataResult).getUnderlying();
    assertTrue(underlying2 instanceof HolidaySafeReferenceData);
    assertTrue(actualDefaultingReferenceDataResult instanceof HolidaySafeReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertSame(underlying, underlying2);
  }

  /**
   * Test {@link HolidayCalendars#extendedEnum()}.
   *
   * <p>Method under test: {@link HolidayCalendars#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum HolidayCalendars.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<HolidayCalendar> actualExtendedEnumResult = HolidayCalendars.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<HolidayCalendar> expectedType = HolidayCalendar.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
