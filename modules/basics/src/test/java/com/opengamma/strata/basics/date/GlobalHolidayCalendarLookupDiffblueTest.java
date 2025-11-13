package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GlobalHolidayCalendarLookupDiffblueTest {
  /**
   * Test {@link GlobalHolidayCalendarLookup#lookupAll()}.
   *
   * <p>Method under test: {@link GlobalHolidayCalendarLookup#lookupAll()}
   */
  @Test
  @DisplayName("Test lookupAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap GlobalHolidayCalendarLookup.lookupAll()"})
  void testLookupAll() {
    // Arrange and Act
    ImmutableMap<String, HolidayCalendar> actualLookupAllResult =
        GlobalHolidayCalendarLookup.INSTANCE.lookupAll();

    // Assert
    assertEquals(25, actualLookupAllResult.size());
    assertTrue(actualLookupAllResult.get("AUSY") instanceof ImmutableHolidayCalendar);
    assertTrue(actualLookupAllResult.get("CHZU") instanceof ImmutableHolidayCalendar);
    assertTrue(actualLookupAllResult.get("DEFR") instanceof ImmutableHolidayCalendar);
    assertTrue(actualLookupAllResult.get("EUTA") instanceof ImmutableHolidayCalendar);
    assertTrue(actualLookupAllResult.get("FRPA") instanceof ImmutableHolidayCalendar);
    assertTrue(actualLookupAllResult.get("GBLO") instanceof ImmutableHolidayCalendar);
    assertTrue(actualLookupAllResult.get("JPTO") instanceof ImmutableHolidayCalendar);
    assertTrue(actualLookupAllResult.get("NYFD") instanceof ImmutableHolidayCalendar);
    assertTrue(actualLookupAllResult.get("NYSE") instanceof ImmutableHolidayCalendar);
    assertTrue(actualLookupAllResult.get("USGS") instanceof ImmutableHolidayCalendar);
    assertTrue(actualLookupAllResult.get("USNY") instanceof ImmutableHolidayCalendar);
  }
}
