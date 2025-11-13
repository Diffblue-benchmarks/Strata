package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.HolidayCalendarTest.MockEomHolCal;
import com.opengamma.strata.basics.date.HolidayCalendarTest.MockHolCal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HolidayCalendarDiffblueTest {
  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay() {
    // Arrange, Act and Assert
    assertTrue(
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT)
            .isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay2() {
    // Arrange, Act and Assert
    assertTrue(
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT)
            .isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay3() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.FRI_SAT)
            .isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay4() {
    // Arrange, Act and Assert
    assertTrue(
        new CombinedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay5() {
    // Arrange, Act and Assert
    assertTrue(
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay6() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.THU_FRI)
            .isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay7() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertTrue(combinedHolidayCalendar.isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay8() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertTrue(combinedHolidayCalendar.isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay9() {
    // Arrange, Act and Assert
    assertTrue(
        new LinkedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.FRI_SAT)
            .isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay10() {
    // Arrange, Act and Assert
    assertTrue(
        new LinkedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay11() {
    // Arrange, Act and Assert
    assertTrue(
        new LinkedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay12() {
    // Arrange, Act and Assert
    assertFalse(
        new LinkedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.THU_FRI)
            .isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay13() {
    // Arrange
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(
            HolidayCalendars.THU_FRI,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertTrue(linkedHolidayCalendar.isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay14() {
    // Arrange
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(
            HolidayCalendars.THU_FRI,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertTrue(linkedHolidayCalendar.isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate); given FRI_SAT; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay_givenFri_sat_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(HolidayCalendars.FRI_SAT.isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isBusinessDay(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#THU_FRI}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate); given THU_FRI; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay_givenThu_fri_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(HolidayCalendars.THU_FRI.isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#adjustBy(int)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return adjustInto ofEpochDay one toString is {@code 1970-01-15}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#adjustBy(int)}
   */
  @Test
  @DisplayName(
      "Test adjustBy(int); given FRI_SAT; then return adjustInto ofEpochDay one toString is '1970-01-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.temporal.TemporalAdjuster HolidayCalendar.adjustBy(int)"})
  void testAdjustBy_givenFri_sat_thenReturnAdjustIntoOfEpochDayOneToStringIs19700115() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-15",
        HolidayCalendars.FRI_SAT.adjustBy(10).adjustInto(LocalDate.ofEpochDay(1L)).toString());
  }

  /**
   * Test {@link HolidayCalendar#shift(LocalDate, int)}.
   *
   * <p>Method under test: {@link HolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.shift(LocalDate, int)"})
  void testShift() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-15",
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT)
            .shift(LocalDate.of(1970, 1, 1), 10)
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#shift(LocalDate, int)}.
   *
   * <p>Method under test: {@link HolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.shift(LocalDate, int)"})
  void testShift2() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-15",
        new CombinedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT)
            .shift(LocalDate.of(1970, 1, 1), 10)
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#shift(LocalDate, int)}.
   *
   * <p>Method under test: {@link HolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.shift(LocalDate, int)"})
  void testShift3() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-15",
        new CombinedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .shift(LocalDate.of(1970, 1, 1), 10)
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#shift(LocalDate, int)}.
   *
   * <p>Method under test: {@link HolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.shift(LocalDate, int)"})
  void testShift4() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1970-01-15", combinedHolidayCalendar.shift(LocalDate.of(1970, 1, 1), 10).toString());
  }

  /**
   * Test {@link HolidayCalendar#shift(LocalDate, int)}.
   *
   * <p>Method under test: {@link HolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.shift(LocalDate, int)"})
  void testShift5() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1970-01-15", combinedHolidayCalendar.shift(LocalDate.of(1970, 1, 1), 10).toString());
  }

  /**
   * Test {@link HolidayCalendar#shift(LocalDate, int)}.
   *
   * <p>Method under test: {@link HolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.shift(LocalDate, int)"})
  void testShift6() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-15",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .shift(LocalDate.of(1970, 1, 1), 10)
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#shift(LocalDate, int)}.
   *
   * <p>Method under test: {@link HolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.shift(LocalDate, int)"})
  void testShift7() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-15",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .shift(LocalDate.of(1970, 1, 1), 10)
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#shift(LocalDate, int)}.
   *
   * <p>Method under test: {@link HolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.shift(LocalDate, int)"})
  void testShift8() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1970-01-15",
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT)
            .shift(LocalDate.of(1970, 1, 1), 10)
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#shift(LocalDate, int)}.
   *
   * <p>Method under test: {@link HolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.shift(LocalDate, int)"})
  void testShift9() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1970-01-15",
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT)
            .shift(LocalDate.of(1970, 1, 1), 10)
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>Given {@link LinkedHolidayCalendar#LinkedHolidayCalendar(HolidayCalendar,
   *       HolidayCalendar)} with calendar1 is {@link HolidayCalendars#FRI_SAT} and calendar2 is
   *       {@link HolidayCalendars#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName(
      "Test shift(LocalDate, int); given LinkedHolidayCalendar(HolidayCalendar, HolidayCalendar) with calendar1 is FRI_SAT and calendar2 is FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.shift(LocalDate, int)"})
  void testShift_givenLinkedHolidayCalendarWithCalendar1IsFri_satAndCalendar2IsFri_sat() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-15",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .shift(LocalDate.of(1970, 1, 1), 10)
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>Given {@link LinkedHolidayCalendar#LinkedHolidayCalendar(HolidayCalendar,
   *       HolidayCalendar)} with calendar1 is {@link HolidayCalendars#SAT_SUN} and calendar2 is
   *       {@link HolidayCalendars#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName(
      "Test shift(LocalDate, int); given LinkedHolidayCalendar(HolidayCalendar, HolidayCalendar) with calendar1 is SAT_SUN and calendar2 is FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.shift(LocalDate, int)"})
  void testShift_givenLinkedHolidayCalendarWithCalendar1IsSat_sunAndCalendar2IsFri_sat() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-15",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.SAT_SUN, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .shift(LocalDate.of(1970, 1, 1), 10)
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#next(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName("Test next(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.next(LocalDate)"})
  void testNext() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-04",
        new CombinedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT)
            .next(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#next(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName("Test next(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.next(LocalDate)"})
  void testNext2() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-04",
        new CombinedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .next(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#next(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName("Test next(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.next(LocalDate)"})
  void testNext3() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals("1970-01-04", combinedHolidayCalendar.next(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link HolidayCalendar#next(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName("Test next(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.next(LocalDate)"})
  void testNext4() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals("1970-01-04", combinedHolidayCalendar.next(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link HolidayCalendar#next(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName("Test next(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.next(LocalDate)"})
  void testNext5() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-04",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .next(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#next(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName("Test next(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.next(LocalDate)"})
  void testNext6() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-04",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .next(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#next(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName("Test next(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.next(LocalDate)"})
  void testNext7() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1970-01-04",
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT)
            .next(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#next(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName("Test next(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.next(LocalDate)"})
  void testNext8() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1970-01-04",
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT)
            .next(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#next(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link CombinedHolidayCalendar#CombinedHolidayCalendar(HolidayCalendar,
   *       HolidayCalendar)} with calendar1 is {@link HolidayCalendars#FRI_SAT} and calendar2 is
   *       {@link HolidayCalendars#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test next(LocalDate); given CombinedHolidayCalendar(HolidayCalendar, HolidayCalendar) with calendar1 is FRI_SAT and calendar2 is FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.next(LocalDate)"})
  void testNext_givenCombinedHolidayCalendarWithCalendar1IsFri_satAndCalendar2IsFri_sat() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-04",
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT)
            .next(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#next(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link LinkedHolidayCalendar#LinkedHolidayCalendar(HolidayCalendar,
   *       HolidayCalendar)} with calendar1 is {@link HolidayCalendars#FRI_SAT} and calendar2 is
   *       {@link HolidayCalendars#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test next(LocalDate); given LinkedHolidayCalendar(HolidayCalendar, HolidayCalendar) with calendar1 is FRI_SAT and calendar2 is FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.next(LocalDate)"})
  void testNext_givenLinkedHolidayCalendarWithCalendar1IsFri_satAndCalendar2IsFri_sat() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-04",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .next(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#next(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link LinkedHolidayCalendar#LinkedHolidayCalendar(HolidayCalendar,
   *       HolidayCalendar)} with calendar1 is {@link HolidayCalendars#SAT_SUN} and calendar2 is
   *       {@link HolidayCalendars#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test next(LocalDate); given LinkedHolidayCalendar(HolidayCalendar, HolidayCalendar) with calendar1 is SAT_SUN and calendar2 is FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.next(LocalDate)"})
  void testNext_givenLinkedHolidayCalendarWithCalendar1IsSat_sunAndCalendar2IsFri_sat() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-04",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.SAT_SUN, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .next(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious() {
    // Arrange, Act and Assert
    assertEquals(
        "1969-12-31",
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT)
            .previous(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious2() {
    // Arrange, Act and Assert
    assertEquals(
        "1969-12-31",
        new CombinedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .previous(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious3() {
    // Arrange, Act and Assert
    assertEquals(
        "1969-12-30",
        new CombinedHolidayCalendar(new MockHolCal(), HolidayCalendars.FRI_SAT)
            .previous(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious4() {
    // Arrange, Act and Assert
    assertEquals(
        "1969-12-31",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .previous(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious5() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1969-12-31", combinedHolidayCalendar.previous(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious6() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, new MockHolCal());

    // Act and Assert
    assertEquals(
        "1969-12-30", combinedHolidayCalendar.previous(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious7() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1969-12-31", combinedHolidayCalendar.previous(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious8() {
    // Arrange, Act and Assert
    assertEquals(
        "1969-12-31",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .previous(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious9() {
    // Arrange, Act and Assert
    assertEquals(
        "1969-12-31",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(new MockHolCal(), HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .previous(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious10() {
    // Arrange, Act and Assert
    assertEquals(
        "1969-12-31",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .previous(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious11() {
    // Arrange
    MockHolCal calendar1 = new MockHolCal();
    LinkedHolidayCalendar calendar12 =
        new LinkedHolidayCalendar(
            calendar1,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1969-12-31",
        new CombinedHolidayCalendar(calendar12, HolidayCalendars.FRI_SAT)
            .previous(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious12() {
    // Arrange
    MockHolCal calendar1 = new MockHolCal();
    LinkedHolidayCalendar calendar12 = new LinkedHolidayCalendar(calendar1, new MockHolCal());

    // Act and Assert
    assertEquals(
        "1969-12-30",
        new CombinedHolidayCalendar(calendar12, HolidayCalendars.FRI_SAT)
            .previous(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#previous(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName("Test previous(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.previous(LocalDate)"})
  void testPrevious13() {
    // Arrange
    MockHolCal calendar1 = new MockHolCal();
    LinkedHolidayCalendar calendar12 =
        new LinkedHolidayCalendar(
            calendar1,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1969-12-31",
        new CombinedHolidayCalendar(calendar12, HolidayCalendars.FRI_SAT)
            .previous(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT)
            .nextSameOrLastInMonth(date);

    // Assert
    assertSame(date, actualNextSameOrLastInMonthResult);
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth2() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-04",
        new CombinedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.FRI_SAT)
            .nextSameOrLastInMonth(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth3() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        new CombinedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .nextSameOrLastInMonth(date);

    // Assert
    assertSame(date, actualNextSameOrLastInMonthResult);
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth4() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .nextSameOrLastInMonth(date);

    // Assert
    assertSame(date, actualNextSameOrLastInMonthResult);
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth5() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        combinedHolidayCalendar.nextSameOrLastInMonth(date);

    // Assert
    assertSame(date, actualNextSameOrLastInMonthResult);
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth6() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        combinedHolidayCalendar.nextSameOrLastInMonth(date);

    // Assert
    assertSame(date, actualNextSameOrLastInMonthResult);
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth7() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.THU_FRI,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1970-01-04",
        combinedHolidayCalendar.nextSameOrLastInMonth(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth8() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .nextSameOrLastInMonth(date);

    // Assert
    assertSame(date, actualNextSameOrLastInMonthResult);
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth9() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .nextSameOrLastInMonth(date);

    // Assert
    assertSame(date, actualNextSameOrLastInMonthResult);
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth10() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .nextSameOrLastInMonth(date);

    // Assert
    assertSame(date, actualNextSameOrLastInMonthResult);
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth11() {
    // Arrange
    LinkedHolidayCalendar calendar2 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.THU_FRI, calendar2);

    // Act and Assert
    assertEquals(
        "1970-01-04",
        combinedHolidayCalendar.nextSameOrLastInMonth(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test nextSameOrLastInMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth12() {
    // Arrange
    LinkedHolidayCalendar calendar2 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.THU_FRI, calendar2);

    // Act and Assert
    assertEquals(
        "1970-01-04",
        combinedHolidayCalendar.nextSameOrLastInMonth(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth2() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth3() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.FRI_SAT)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth4() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth5() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth6() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertFalse(combinedHolidayCalendar.isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth7() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertFalse(combinedHolidayCalendar.isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth8() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.SAT_SUN, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth9() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth10() {
    // Arrange, Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth11() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#isLastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test isLastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean HolidayCalendar.isLastBusinessDayOfMonth(LocalDate)"})
  void testIsLastBusinessDayOfMonth12() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertFalse(
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT)
            .isLastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-29",
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT)
            .lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth2() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-29",
        new CombinedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT)
            .lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth3() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-29",
        new CombinedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth4() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-29",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth5() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1970-01-29",
        combinedHolidayCalendar.lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth6() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1970-01-29",
        combinedHolidayCalendar.lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth7() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-29",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.THU_FRI, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth8() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-29",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth9() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-29",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(
                    new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                    HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth10() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1970-01-29",
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT)
            .lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth11() {
    // Arrange
    LinkedHolidayCalendar calendar1 =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals(
        "1970-01-29",
        new CombinedHolidayCalendar(calendar1, HolidayCalendars.FRI_SAT)
            .lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return toString is {@code 1970-01-29}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test lastBusinessDayOfMonth(LocalDate); given FRI_SAT; then return toString is '1970-01-29'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth_givenFri_sat_thenReturnToStringIs19700129() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-29",
        HolidayCalendars.FRI_SAT.lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-01-31}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#lastBusinessDayOfMonth(LocalDate)}
   */
  @Test
  @DisplayName("Test lastBusinessDayOfMonth(LocalDate); then return toString is '1970-01-31'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate HolidayCalendar.lastBusinessDayOfMonth(LocalDate)"})
  void testLastBusinessDayOfMonth_thenReturnToStringIs19700131() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-31",
        new CombinedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.NO_HOLIDAYS)
            .lastBusinessDayOfMonth(LocalDate.of(1970, 1, 1))
            .toString());
  }

  /**
   * Test {@link HolidayCalendar#daysBetween(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#daysBetween(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test daysBetween(LocalDate, LocalDate); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int HolidayCalendar.daysBetween(LocalDate, LocalDate)"})
  void testDaysBetween_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0,
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT)
            .daysBetween(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link HolidayCalendar#combinedWith(HolidayCalendar)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return {@link WeekendHolidayCalendar#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#combinedWith(HolidayCalendar)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(HolidayCalendar); given FRI_SAT; when FRI_SAT; then return FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendar HolidayCalendar.combinedWith(HolidayCalendar)"})
  void testCombinedWith_givenFri_sat_whenFri_sat_thenReturnFri_sat() {
    // Arrange and Act
    HolidayCalendar actualCombinedWithResult =
        HolidayCalendars.FRI_SAT.combinedWith(HolidayCalendars.FRI_SAT);

    // Assert
    assertSame(
        ((WeekendHolidayCalendar) actualCombinedWithResult).FRI_SAT, actualCombinedWithResult);
  }

  /**
   * Test {@link HolidayCalendar#combinedWith(HolidayCalendar)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@link HolidayCalendars#NO_HOLIDAYS}.
   *   <li>Then return {@link WeekendHolidayCalendar#FRI_SAT}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#combinedWith(HolidayCalendar)}
   */
  @Test
  @DisplayName(
      "Test combinedWith(HolidayCalendar); given FRI_SAT; when NO_HOLIDAYS; then return FRI_SAT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendar HolidayCalendar.combinedWith(HolidayCalendar)"})
  void testCombinedWith_givenFri_sat_whenNo_holidays_thenReturnFri_sat() {
    // Arrange and Act
    HolidayCalendar actualCombinedWithResult =
        HolidayCalendars.FRI_SAT.combinedWith(HolidayCalendars.NO_HOLIDAYS);

    // Assert
    assertSame(
        ((WeekendHolidayCalendar) actualCombinedWithResult).FRI_SAT, actualCombinedWithResult);
  }

  /**
   * Test {@link HolidayCalendar#linkedWith(HolidayCalendar)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>When {@link HolidayCalendars#NO_HOLIDAYS}.
   *   <li>Then return {@link NoHolidaysCalendar#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#linkedWith(HolidayCalendar)}
   */
  @Test
  @DisplayName(
      "Test linkedWith(HolidayCalendar); given FRI_SAT; when NO_HOLIDAYS; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendar HolidayCalendar.linkedWith(HolidayCalendar)"})
  void testLinkedWith_givenFri_sat_whenNo_holidays_thenReturnInstance() {
    // Arrange and Act
    HolidayCalendar actualLinkedWithResult =
        HolidayCalendars.FRI_SAT.linkedWith(HolidayCalendars.NO_HOLIDAYS);

    // Assert
    assertSame(((NoHolidaysCalendar) actualLinkedWithResult).INSTANCE, actualLinkedWithResult);
  }

  /**
   * Test {@link HolidayCalendar#linkedWith(HolidayCalendar)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#NO_HOLIDAYS}.
   *   <li>When {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return {@link NoHolidaysCalendar#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#linkedWith(HolidayCalendar)}
   */
  @Test
  @DisplayName(
      "Test linkedWith(HolidayCalendar); given NO_HOLIDAYS; when FRI_SAT; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendar HolidayCalendar.linkedWith(HolidayCalendar)"})
  void testLinkedWith_givenNo_holidays_whenFri_sat_thenReturnInstance() {
    // Arrange and Act
    HolidayCalendar actualLinkedWithResult =
        HolidayCalendars.NO_HOLIDAYS.linkedWith(HolidayCalendars.FRI_SAT);

    // Assert
    assertSame(((NoHolidaysCalendar) actualLinkedWithResult).INSTANCE, actualLinkedWithResult);
  }

  /**
   * Test {@link HolidayCalendar#linkedWith(HolidayCalendar)}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#NO_HOLIDAYS}.
   *   <li>When {@link HolidayCalendars#NO_HOLIDAYS}.
   *   <li>Then return {@link NoHolidaysCalendar#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#linkedWith(HolidayCalendar)}
   */
  @Test
  @DisplayName(
      "Test linkedWith(HolidayCalendar); given NO_HOLIDAYS; when NO_HOLIDAYS; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendar HolidayCalendar.linkedWith(HolidayCalendar)"})
  void testLinkedWith_givenNo_holidays_whenNo_holidays_thenReturnInstance() {
    // Arrange and Act
    HolidayCalendar actualLinkedWithResult =
        HolidayCalendars.NO_HOLIDAYS.linkedWith(HolidayCalendars.NO_HOLIDAYS);

    // Assert
    assertSame(((NoHolidaysCalendar) actualLinkedWithResult).INSTANCE, actualLinkedWithResult);
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat",
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT).getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName2() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat",
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT).getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName3() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat",
        new CombinedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT)
            .getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName4() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat",
        new CombinedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName5() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat+MockEom",
        new CombinedHolidayCalendar(new MockEomHolCal(), HolidayCalendars.FRI_SAT).getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName6() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat",
        new CombinedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName7() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat",
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.NO_HOLIDAYS)
            .getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName8() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals("Fri/Sat", combinedHolidayCalendar.getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName9() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, new MockEomHolCal());

    // Act and Assert
    assertEquals("Fri/Sat+MockEom", combinedHolidayCalendar.getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName10() {
    // Arrange
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals("Fri/Sat", combinedHolidayCalendar.getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName11() {
    // Arrange, Act and Assert
    assertEquals(
        "NoHolidays",
        new LinkedHolidayCalendar(HolidayCalendars.NO_HOLIDAYS, HolidayCalendars.FRI_SAT)
            .getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName12() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat",
        new LinkedHolidayCalendar(
                new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName13() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat~MockEom",
        new LinkedHolidayCalendar(new MockEomHolCal(), HolidayCalendars.FRI_SAT).getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName14() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat",
        new LinkedHolidayCalendar(
                new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT),
                HolidayCalendars.FRI_SAT)
            .getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName15() {
    // Arrange, Act and Assert
    assertEquals(
        "NoHolidays",
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.NO_HOLIDAYS)
            .getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName16() {
    // Arrange
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals("Fri/Sat", linkedHolidayCalendar.getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName17() {
    // Arrange
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, new MockEomHolCal());

    // Act and Assert
    assertEquals("Fri/Sat~MockEom", linkedHolidayCalendar.getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName18() {
    // Arrange
    LinkedHolidayCalendar linkedHolidayCalendar =
        new LinkedHolidayCalendar(
            HolidayCalendars.FRI_SAT,
            new LinkedHolidayCalendar(HolidayCalendars.FRI_SAT, HolidayCalendars.FRI_SAT));

    // Act and Assert
    assertEquals("Fri/Sat", linkedHolidayCalendar.getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <ul>
   *   <li>Given {@link HolidayCalendars#FRI_SAT}.
   *   <li>Then return {@code Fri/Sat}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName(); given FRI_SAT; then return 'Fri/Sat'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName_givenFri_sat_thenReturnFriSat() {
    // Arrange, Act and Assert
    assertEquals("Fri/Sat", HolidayCalendars.FRI_SAT.getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <ul>
   *   <li>Given {@link MockEomHolCal} (default constructor).
   *   <li>Then return {@code MockEom}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName(); given MockEomHolCal (default constructor); then return 'MockEom'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName_givenMockEomHolCal_thenReturnMockEom() {
    // Arrange, Act and Assert
    assertEquals("MockEom", new MockEomHolCal().getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <ul>
   *   <li>Given {@link MockHolCal} (default constructor).
   *   <li>Then return {@code Mock}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName(); given MockHolCal (default constructor); then return 'Mock'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName_givenMockHolCal_thenReturnMock() {
    // Arrange, Act and Assert
    assertEquals("Mock", new MockHolCal().getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <ul>
   *   <li>Then return {@code AUSY+Fri/Sat}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName(); then return 'AUSY+Fri/Sat'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName_thenReturnAusyFriSat() {
    // Arrange
    TreeSet<LocalDate> holidays = new TreeSet<>();
    HashSet<DayOfWeek> weekendDays = new HashSet<>();
    ImmutableHolidayCalendar calendar2 =
        ImmutableHolidayCalendar.of(
            HolidayCalendarIds.AUSY,
            (SortedSet<LocalDate>) holidays,
            weekendDays,
            new ArrayList<>());
    CombinedHolidayCalendar combinedHolidayCalendar =
        new CombinedHolidayCalendar(HolidayCalendars.FRI_SAT, calendar2);

    // Act and Assert
    assertEquals("AUSY+Fri/Sat", combinedHolidayCalendar.getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <ul>
   *   <li>Then return {@code Fri/Sat+Sat/Sun}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName(); then return 'Fri/Sat+Sat/Sun'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName_thenReturnFriSatSatSun() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat+Sat/Sun",
        new CombinedHolidayCalendar(HolidayCalendars.SAT_SUN, HolidayCalendars.FRI_SAT).getName());
  }

  /**
   * Test {@link HolidayCalendar#getName()}.
   *
   * <ul>
   *   <li>Then return {@code Fri/Sat~Sat/Sun}.
   * </ul>
   *
   * <p>Method under test: {@link HolidayCalendar#getName()}
   */
  @Test
  @DisplayName("Test getName(); then return 'Fri/Sat~Sat/Sun'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String HolidayCalendar.getName()"})
  void testGetName_thenReturnFriSatSatSun2() {
    // Arrange, Act and Assert
    assertEquals(
        "Fri/Sat~Sat/Sun",
        new LinkedHolidayCalendar(HolidayCalendars.SAT_SUN, HolidayCalendars.FRI_SAT).getName());
  }
}
