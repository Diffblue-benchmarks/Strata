package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.Business252DayCount.Bus252;
import com.opengamma.strata.basics.date.DayCount.ScheduleInfo;
import com.opengamma.strata.basics.date.DayCountTest.Info;
import com.opengamma.strata.collect.named.ExtendedEnum;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DayCountDiffblueTest {
  /**
   * Test {@link DayCount#ofBus252(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>When {@link HolidayCalendarIds#AUSY}.
   *   <li>Then return Name is {@code Bus/252 AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link DayCount#ofBus252(HolidayCalendarId)}
   */
  @Test
  @DisplayName("Test ofBus252(HolidayCalendarId); when AUSY; then return Name is 'Bus/252 AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DayCount DayCount.ofBus252(HolidayCalendarId)"})
  void testOfBus252_whenAusy_thenReturnNameIsBus252Ausy() {
    // Arrange and Act
    DayCount actualOfBus252Result = DayCount.ofBus252(HolidayCalendarIds.AUSY);

    // Assert
    assertTrue(actualOfBus252Result instanceof Bus252);
    assertEquals("Bus/252 AUSY", actualOfBus252Result.getName());
    assertEquals("Bus/252 AUSY", actualOfBus252Result.toString());
  }

  /**
   * Test {@link DayCount#ofBus252(HolidayCalendarId)}.
   *
   * <ul>
   *   <li>When {@link HolidayCalendarIds#BRBD}.
   *   <li>Then return Name is {@code Bus/252 BRBD}.
   * </ul>
   *
   * <p>Method under test: {@link DayCount#ofBus252(HolidayCalendarId)}
   */
  @Test
  @DisplayName("Test ofBus252(HolidayCalendarId); when BRBD; then return Name is 'Bus/252 BRBD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DayCount DayCount.ofBus252(HolidayCalendarId)"})
  void testOfBus252_whenBrbd_thenReturnNameIsBus252Brbd() {
    // Arrange and Act
    DayCount actualOfBus252Result = DayCount.ofBus252(HolidayCalendarIds.BRBD);

    // Assert
    assertTrue(actualOfBus252Result instanceof Bus252);
    assertEquals("Bus/252 BRBD", actualOfBus252Result.getName());
    assertEquals("Bus/252 BRBD", actualOfBus252Result.toString());
  }

  /**
   * Test {@link DayCount#extendedEnum()}.
   *
   * <p>Method under test: {@link DayCount#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum DayCount.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<DayCount> actualExtendedEnumResult = DayCount.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<DayCount> expectedType = DayCount.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }

  /**
   * Test ScheduleInfo {@link ScheduleInfo#getEndDate()}.
   *
   * <ul>
   *   <li>Given {@link Info#Info(boolean)} with eom is {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ScheduleInfo#getEndDate()}
   */
  @Test
  @DisplayName(
      "Test ScheduleInfo getEndDate(); given Info(boolean) with eom is 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ScheduleInfo.getEndDate()"})
  void testScheduleInfoGetEndDate_givenInfoWithEomIsTrue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new Info(true).getEndDate());
  }

  /**
   * Test ScheduleInfo {@link ScheduleInfo#getFrequency()}.
   *
   * <ul>
   *   <li>Given {@link Info#Info(boolean)} with eom is {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ScheduleInfo#getFrequency()}
   */
  @Test
  @DisplayName(
      "Test ScheduleInfo getFrequency(); given Info(boolean) with eom is 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.basics.schedule.Frequency ScheduleInfo.getFrequency()"})
  void testScheduleInfoGetFrequency_givenInfoWithEomIsTrue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new Info(true).getFrequency());
  }

  /**
   * Test ScheduleInfo {@link ScheduleInfo#getPeriodEndDate(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link Info#Info(boolean)} with eom is {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ScheduleInfo#getPeriodEndDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test ScheduleInfo getPeriodEndDate(LocalDate); given Info(boolean) with eom is 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ScheduleInfo.getPeriodEndDate(LocalDate)"})
  void testScheduleInfoGetPeriodEndDate_givenInfoWithEomIsTrue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new Info(true).getPeriodEndDate(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test ScheduleInfo {@link ScheduleInfo#getStartDate()}.
   *
   * <ul>
   *   <li>Given {@link Info#Info(boolean)} with eom is {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ScheduleInfo#getStartDate()}
   */
  @Test
  @DisplayName(
      "Test ScheduleInfo getStartDate(); given Info(boolean) with eom is 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate ScheduleInfo.getStartDate()"})
  void testScheduleInfoGetStartDate_givenInfoWithEomIsTrue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new Info(true).getStartDate());
  }

  /**
   * Test ScheduleInfo {@link ScheduleInfo#isEndOfMonthConvention()}.
   *
   * <ul>
   *   <li>Given {@link Info#Info(boolean)} with eom is {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ScheduleInfo#isEndOfMonthConvention()}
   */
  @Test
  @DisplayName(
      "Test ScheduleInfo isEndOfMonthConvention(); given Info(boolean) with eom is 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ScheduleInfo.isEndOfMonthConvention()"})
  void testScheduleInfoIsEndOfMonthConvention_givenInfoWithEomIsFalse_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(new Info(false).isEndOfMonthConvention());
  }

  /**
   * Test ScheduleInfo {@link ScheduleInfo#isEndOfMonthConvention()}.
   *
   * <ul>
   *   <li>Given {@link Info#Info(boolean)} with eom is {@code true}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ScheduleInfo#isEndOfMonthConvention()}
   */
  @Test
  @DisplayName(
      "Test ScheduleInfo isEndOfMonthConvention(); given Info(boolean) with eom is 'true'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ScheduleInfo.isEndOfMonthConvention()"})
  void testScheduleInfoIsEndOfMonthConvention_givenInfoWithEomIsTrue_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(new Info(true).isEndOfMonthConvention());
  }

  /**
   * Test {@link DayCount#yearFraction(LocalDate, LocalDate)} with {@code firstDate}, {@code
   * secondDate}.
   *
   * <p>Method under test: {@link DayCount#yearFraction(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test yearFraction(LocalDate, LocalDate) with 'firstDate', 'secondDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.yearFraction(LocalDate, LocalDate)"})
  void testYearFractionWithFirstDateSecondDate() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar calendar =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());
    Bus252 bus252 = new Bus252("Name", calendar);

    // Act and Assert
    assertEquals(0.0d, bus252.yearFraction(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link DayCount#yearFraction(LocalDate, LocalDate)} with {@code firstDate}, {@code
   * secondDate}.
   *
   * <ul>
   *   <li>Given {@link DayCounts#ACT_360}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DayCount#yearFraction(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test yearFraction(LocalDate, LocalDate) with 'firstDate', 'secondDate'; given ACT_360; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.yearFraction(LocalDate, LocalDate)"})
  void testYearFractionWithFirstDateSecondDate_givenAct_360_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, DayCounts.ACT_360.yearFraction(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link DayCount#yearFraction(LocalDate, LocalDate)} with {@code firstDate}, {@code
   * secondDate}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DayCount#yearFraction(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test yearFraction(LocalDate, LocalDate) with 'firstDate', 'secondDate'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.yearFraction(LocalDate, LocalDate)"})
  void testYearFractionWithFirstDateSecondDate_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        new Bus252("Name", HolidayCalendars.FRI_SAT)
            .yearFraction(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link DayCount#relativeYearFraction(LocalDate, LocalDate)} with {@code firstDate}, {@code
   * secondDate}.
   *
   * <p>Method under test: {@link DayCount#relativeYearFraction(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test relativeYearFraction(LocalDate, LocalDate) with 'firstDate', 'secondDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.relativeYearFraction(LocalDate, LocalDate)"})
  void testRelativeYearFractionWithFirstDateSecondDate() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        new Bus252("Name", HolidayCalendars.NO_HOLIDAYS)
            .relativeYearFraction(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link DayCount#relativeYearFraction(LocalDate, LocalDate)} with {@code firstDate}, {@code
   * secondDate}.
   *
   * <p>Method under test: {@link DayCount#relativeYearFraction(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test relativeYearFraction(LocalDate, LocalDate) with 'firstDate', 'secondDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.relativeYearFraction(LocalDate, LocalDate)"})
  void testRelativeYearFractionWithFirstDateSecondDate2() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar calendar =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());
    Bus252 bus252 = new Bus252("Name", calendar);

    // Act and Assert
    assertEquals(
        0.0d, bus252.relativeYearFraction(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link DayCount#relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)} with {@code
   * firstDate}, {@code secondDate}, {@code scheduleInfo}.
   *
   * <p>Method under test: {@link DayCount#relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)}
   */
  @Test
  @DisplayName(
      "Test relativeYearFraction(LocalDate, LocalDate, ScheduleInfo) with 'firstDate', 'secondDate', 'scheduleInfo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)"})
  void testRelativeYearFractionWithFirstDateSecondDateScheduleInfo() {
    // Arrange
    Bus252 bus252 = new Bus252("Name", HolidayCalendars.NO_HOLIDAYS);
    LocalDate firstDate = LocalDate.of(1970, 1, 1);
    LocalDate secondDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(0.0d, bus252.relativeYearFraction(firstDate, secondDate, new Info(true)));
  }

  /**
   * Test {@link DayCount#relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)} with {@code
   * firstDate}, {@code secondDate}, {@code scheduleInfo}.
   *
   * <p>Method under test: {@link DayCount#relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)}
   */
  @Test
  @DisplayName(
      "Test relativeYearFraction(LocalDate, LocalDate, ScheduleInfo) with 'firstDate', 'secondDate', 'scheduleInfo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)"})
  void testRelativeYearFractionWithFirstDateSecondDateScheduleInfo2() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar calendar =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());
    Bus252 bus252 = new Bus252("Name", calendar);
    LocalDate firstDate = LocalDate.of(1970, 1, 1);
    LocalDate secondDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(0.0d, bus252.relativeYearFraction(firstDate, secondDate, new Info(true)));
  }

  /**
   * Test {@link DayCount#relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)} with {@code
   * firstDate}, {@code secondDate}, {@code scheduleInfo}.
   *
   * <p>Method under test: {@link DayCount#relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)}
   */
  @Test
  @DisplayName(
      "Test relativeYearFraction(LocalDate, LocalDate, ScheduleInfo) with 'firstDate', 'secondDate', 'scheduleInfo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)"})
  void testRelativeYearFractionWithFirstDateSecondDateScheduleInfo3() {
    // Arrange
    Bus252 bus252 = new Bus252("Name", HolidayCalendars.FRI_SAT);
    LocalDate firstDate = LocalDate.ofEpochDay(1L);
    LocalDate secondDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        -0.003968253968253968d, bus252.relativeYearFraction(firstDate, secondDate, new Info(true)));
  }

  /**
   * Test {@link DayCount#relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)} with {@code
   * firstDate}, {@code secondDate}, {@code scheduleInfo}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DayCount#relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)}
   */
  @Test
  @DisplayName(
      "Test relativeYearFraction(LocalDate, LocalDate, ScheduleInfo) with 'firstDate', 'secondDate', 'scheduleInfo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.relativeYearFraction(LocalDate, LocalDate, ScheduleInfo)"})
  void testRelativeYearFractionWithFirstDateSecondDateScheduleInfo_thenReturnZero() {
    // Arrange
    Bus252 bus252 = new Bus252("Name", HolidayCalendars.FRI_SAT);
    LocalDate firstDate = LocalDate.of(1970, 1, 1);
    LocalDate secondDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(0.0d, bus252.relativeYearFraction(firstDate, secondDate, new Info(true)));
  }

  /**
   * Test {@link DayCount#relativeYearFraction(LocalDate, LocalDate)} with {@code firstDate}, {@code
   * secondDate}.
   *
   * <ul>
   *   <li>Given {@link DayCounts#ACT_360}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DayCount#relativeYearFraction(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test relativeYearFraction(LocalDate, LocalDate) with 'firstDate', 'secondDate'; given ACT_360; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.relativeYearFraction(LocalDate, LocalDate)"})
  void testRelativeYearFractionWithFirstDateSecondDate_givenAct_360_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        DayCounts.ACT_360.relativeYearFraction(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link DayCount#relativeYearFraction(LocalDate, LocalDate)} with {@code firstDate}, {@code
   * secondDate}.
   *
   * <ul>
   *   <li>Then return {@code -0.003968253968253968}.
   * </ul>
   *
   * <p>Method under test: {@link DayCount#relativeYearFraction(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test relativeYearFraction(LocalDate, LocalDate) with 'firstDate', 'secondDate'; then return '-0.003968253968253968'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.relativeYearFraction(LocalDate, LocalDate)"})
  void testRelativeYearFractionWithFirstDateSecondDate_thenReturn0003968253968253968() {
    // Arrange, Act and Assert
    assertEquals(
        -0.003968253968253968d,
        new Bus252("Name", HolidayCalendars.FRI_SAT)
            .relativeYearFraction(LocalDate.ofEpochDay(1L), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link DayCount#relativeYearFraction(LocalDate, LocalDate)} with {@code firstDate}, {@code
   * secondDate}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DayCount#relativeYearFraction(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test relativeYearFraction(LocalDate, LocalDate) with 'firstDate', 'secondDate'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DayCount.relativeYearFraction(LocalDate, LocalDate)"})
  void testRelativeYearFractionWithFirstDateSecondDate_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        new Bus252("Name", HolidayCalendars.FRI_SAT)
            .relativeYearFraction(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }
}
