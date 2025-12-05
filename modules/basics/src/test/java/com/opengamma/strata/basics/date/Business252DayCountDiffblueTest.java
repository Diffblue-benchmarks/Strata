package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.Business252DayCount.Bus252;
import com.opengamma.strata.basics.date.DayCount.ScheduleInfo;
import com.opengamma.strata.basics.date.DayCountTest.Info;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class Business252DayCountDiffblueTest {
  /**
   * Test Bus252 {@link Bus252#days(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link Bus252#Bus252(String, HolidayCalendar)} with {@code Name} and calendar is
   *       {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Bus252#days(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Bus252 days(LocalDate, LocalDate); given Bus252(String, HolidayCalendar) with 'Name' and calendar is FRI_SAT; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Bus252.days(LocalDate, LocalDate)"})
  void testBus252Days_givenBus252WithNameAndCalendarIsFri_sat_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0,
        new Bus252("Name", HolidayCalendars.FRI_SAT)
            .days(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test Bus252 {@link Bus252#days(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link Bus252#Bus252(String, HolidayCalendar)} with {@code Name} and calendar is
   *       {@link ImmutableHolidayCalendar}.
   * </ul>
   *
   * <p>Method under test: {@link Bus252#days(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Bus252 days(LocalDate, LocalDate); given Bus252(String, HolidayCalendar) with 'Name' and calendar is ImmutableHolidayCalendar")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Bus252.days(LocalDate, LocalDate)"})
  void testBus252Days_givenBus252WithNameAndCalendarIsImmutableHolidayCalendar() {
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
    assertEquals(0, bus252.days(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test Bus252 {@link Bus252#days(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link Bus252#Bus252(String, HolidayCalendar)} with {@code Name} and calendar is
   *       {@link HolidayCalendars#NO_HOLIDAYS}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Bus252#days(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Bus252 days(LocalDate, LocalDate); given Bus252(String, HolidayCalendar) with 'Name' and calendar is NO_HOLIDAYS; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Bus252.days(LocalDate, LocalDate)"})
  void testBus252Days_givenBus252WithNameAndCalendarIsNo_holidays_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0,
        new Bus252("Name", HolidayCalendars.NO_HOLIDAYS)
            .days(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test Bus252 {@link Bus252#equals(Object)}, and {@link Bus252#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Bus252#equals(Object)}
   *   <li>{@link Bus252#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test Bus252 equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Bus252.equals(Object)", "int Bus252.hashCode()"})
  void testBus252EqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Bus252 bus252 = new Bus252("Name", HolidayCalendars.FRI_SAT);
    Bus252 bus2522 = new Bus252("Name", HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertEquals(bus252, bus2522);
    assertEquals(bus252.hashCode(), bus2522.hashCode());
  }

  /**
   * Test Bus252 {@link Bus252#equals(Object)}, and {@link Bus252#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Bus252#equals(Object)}
   *   <li>{@link Bus252#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test Bus252 equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Bus252.equals(Object)", "int Bus252.hashCode()"})
  void testBus252EqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Bus252 bus252 = new Bus252("Name", HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertEquals(bus252, bus252);
    int expectedHashCodeResult = bus252.hashCode();
    assertEquals(expectedHashCodeResult, bus252.hashCode());
  }

  /**
   * Test Bus252 {@link Bus252#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Bus252#equals(Object)}
   */
  @Test
  @DisplayName("Test Bus252 equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Bus252.equals(Object)", "int Bus252.hashCode()"})
  void testBus252Equals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Bus252 bus252 =
        new Bus252(
            "com.opengamma.strata.basics.date.Business252DayCount$Bus252",
            HolidayCalendars.FRI_SAT);

    // Act and Assert
    assertNotEquals(bus252, new Bus252("Name", HolidayCalendars.FRI_SAT));
  }

  /**
   * Test Bus252 {@link Bus252#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Bus252#equals(Object)}
   */
  @Test
  @DisplayName("Test Bus252 equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Bus252.equals(Object)", "int Bus252.hashCode()"})
  void testBus252Equals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Bus252("Name", HolidayCalendars.FRI_SAT), null);
  }

  /**
   * Test Bus252 {@link Bus252#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Bus252#equals(Object)}
   */
  @Test
  @DisplayName("Test Bus252 equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Bus252.equals(Object)", "int Bus252.hashCode()"})
  void testBus252Equals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new Bus252("Name", HolidayCalendars.FRI_SAT), "Different type to Bus252");
  }

  /**
   * Test Bus252 getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Bus252#Bus252(String, HolidayCalendar)}
   *   <li>{@link Bus252#getName()}
   *   <li>{@link Bus252#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test Bus252 getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void Bus252.<init>(String, HolidayCalendar)",
    "String Bus252.getName()",
    "String Bus252.toString()"
  })
  void testBus252GettersAndSetters() {
    // Arrange and Act
    Bus252 actualBus252 = new Bus252("Name", HolidayCalendars.FRI_SAT);
    String actualName = actualBus252.getName();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Name", actualBus252.toString());
  }

  /**
   * Test Bus252 {@link Bus252#yearFraction(LocalDate, LocalDate, ScheduleInfo)} with {@code
   * firstDate}, {@code secondDate}, {@code scheduleInfo}.
   *
   * <p>Method under test: {@link Bus252#yearFraction(LocalDate, LocalDate, ScheduleInfo)}
   */
  @Test
  @DisplayName(
      "Test Bus252 yearFraction(LocalDate, LocalDate, ScheduleInfo) with 'firstDate', 'secondDate', 'scheduleInfo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bus252.yearFraction(LocalDate, LocalDate, ScheduleInfo)"})
  void testBus252YearFractionWithFirstDateSecondDateScheduleInfo() {
    // Arrange
    Bus252 bus252 = new Bus252("Name", HolidayCalendars.NO_HOLIDAYS);
    LocalDate firstDate = LocalDate.of(1970, 1, 1);
    LocalDate secondDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(0.0d, bus252.yearFraction(firstDate, secondDate, new Info(true)));
  }

  /**
   * Test Bus252 {@link Bus252#yearFraction(LocalDate, LocalDate, ScheduleInfo)} with {@code
   * firstDate}, {@code secondDate}, {@code scheduleInfo}.
   *
   * <p>Method under test: {@link Bus252#yearFraction(LocalDate, LocalDate, ScheduleInfo)}
   */
  @Test
  @DisplayName(
      "Test Bus252 yearFraction(LocalDate, LocalDate, ScheduleInfo) with 'firstDate', 'secondDate', 'scheduleInfo'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bus252.yearFraction(LocalDate, LocalDate, ScheduleInfo)"})
  void testBus252YearFractionWithFirstDateSecondDateScheduleInfo2() {
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
    assertEquals(0.0d, bus252.yearFraction(firstDate, secondDate, new Info(true)));
  }

  /**
   * Test Bus252 {@link Bus252#yearFraction(LocalDate, LocalDate, ScheduleInfo)} with {@code
   * firstDate}, {@code secondDate}, {@code scheduleInfo}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Bus252#yearFraction(LocalDate, LocalDate, ScheduleInfo)}
   */
  @Test
  @DisplayName(
      "Test Bus252 yearFraction(LocalDate, LocalDate, ScheduleInfo) with 'firstDate', 'secondDate', 'scheduleInfo'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bus252.yearFraction(LocalDate, LocalDate, ScheduleInfo)"})
  void testBus252YearFractionWithFirstDateSecondDateScheduleInfo_thenReturnZero() {
    // Arrange
    Bus252 bus252 = new Bus252("Name", HolidayCalendars.FRI_SAT);
    LocalDate firstDate = LocalDate.of(1970, 1, 1);
    LocalDate secondDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(0.0d, bus252.yearFraction(firstDate, secondDate, new Info(true)));
  }

  /**
   * Test {@link Business252DayCount#of(HolidayCalendar)}.
   *
   * <ul>
   *   <li>Then return Name is {@code Bus/252 AUSY}.
   * </ul>
   *
   * <p>Method under test: {@link Business252DayCount#of(HolidayCalendar)}
   */
  @Test
  @DisplayName("Test of(HolidayCalendar); then return Name is 'Bus/252 AUSY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DayCount Business252DayCount.of(HolidayCalendar)"})
  void testOf_thenReturnNameIsBus252Ausy() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar calendar =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());

    // Act
    DayCount actualOfResult = Business252DayCount.INSTANCE.of(calendar);

    // Assert
    assertTrue(actualOfResult instanceof Bus252);
    assertEquals("Bus/252 AUSY", actualOfResult.getName());
    assertEquals("Bus/252 AUSY", actualOfResult.toString());
  }

  /**
   * Test {@link Business252DayCount#of(HolidayCalendar)}.
   *
   * <ul>
   *   <li>Then return Name is {@code Bus/252 Fri/Sat+Sat/Sun}.
   * </ul>
   *
   * <p>Method under test: {@link Business252DayCount#of(HolidayCalendar)}
   */
  @Test
  @DisplayName("Test of(HolidayCalendar); then return Name is 'Bus/252 Fri/Sat+Sat/Sun'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DayCount Business252DayCount.of(HolidayCalendar)"})
  void testOf_thenReturnNameIsBus252FriSatSatSun() {
    // Arrange and Act
    DayCount actualOfResult =
        Business252DayCount.INSTANCE.of(
            new CombinedHolidayCalendar(HolidayCalendars.SAT_SUN, HolidayCalendars.FRI_SAT));

    // Assert
    assertTrue(actualOfResult instanceof Bus252);
    assertEquals("Bus/252 Fri/Sat+Sat/Sun", actualOfResult.getName());
    assertEquals("Bus/252 Fri/Sat+Sat/Sun", actualOfResult.toString());
  }

  /**
   * Test {@link Business252DayCount#of(HolidayCalendar)}.
   *
   * <ul>
   *   <li>When {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return Name is {@code Bus/252 Fri/Sat}.
   * </ul>
   *
   * <p>Method under test: {@link Business252DayCount#of(HolidayCalendar)}
   */
  @Test
  @DisplayName("Test of(HolidayCalendar); when FRI_SAT; then return Name is 'Bus/252 Fri/Sat'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DayCount Business252DayCount.of(HolidayCalendar)"})
  void testOf_whenFri_sat_thenReturnNameIsBus252FriSat() {
    // Arrange and Act
    DayCount actualOfResult = Business252DayCount.INSTANCE.of(HolidayCalendars.FRI_SAT);

    // Assert
    assertTrue(actualOfResult instanceof Bus252);
    assertEquals("Bus/252 Fri/Sat", actualOfResult.getName());
    assertEquals("Bus/252 Fri/Sat", actualOfResult.toString());
  }

  /**
   * Test {@link Business252DayCount#of(HolidayCalendar)}.
   *
   * <ul>
   *   <li>When {@link NoHolidaysCalendar#INSTANCE}.
   *   <li>Then return Name is {@code Bus/252 NoHolidays}.
   * </ul>
   *
   * <p>Method under test: {@link Business252DayCount#of(HolidayCalendar)}
   */
  @Test
  @DisplayName("Test of(HolidayCalendar); when INSTANCE; then return Name is 'Bus/252 NoHolidays'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DayCount Business252DayCount.of(HolidayCalendar)"})
  void testOf_whenInstance_thenReturnNameIsBus252NoHolidays() {
    // Arrange and Act
    DayCount actualOfResult = Business252DayCount.INSTANCE.of(NoHolidaysCalendar.INSTANCE);

    // Assert
    assertTrue(actualOfResult instanceof Bus252);
    assertEquals("Bus/252 NoHolidays", actualOfResult.getName());
    assertEquals("Bus/252 NoHolidays", actualOfResult.toString());
  }

  /**
   * Test {@link Business252DayCount#lookup(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Business252DayCount#lookup(String)}
   */
  @Test
  @DisplayName("Test lookup(String); when 'Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DayCount Business252DayCount.lookup(String)"})
  void testLookup_whenName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(Business252DayCount.INSTANCE.lookup("Name"));
  }

  /**
   * Test {@link Business252DayCount#lookupAll()}.
   *
   * <p>Method under test: {@link Business252DayCount#lookupAll()}
   */
  @Test
  @DisplayName("Test lookupAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map Business252DayCount.lookupAll()"})
  void testLookupAll() {
    // Arrange, Act and Assert
    assertTrue(Business252DayCount.INSTANCE.lookupAll().isEmpty());
  }
}
