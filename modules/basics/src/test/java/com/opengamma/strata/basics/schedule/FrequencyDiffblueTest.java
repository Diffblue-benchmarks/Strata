package com.opengamma.strata.basics.schedule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalUnit;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FrequencyDiffblueTest {
  /**
   * Test {@link Frequency#ofDays(int)}.
   *
   * <ul>
   *   <li>When {@code 12000}.
   *   <li>Then return toString is {@code P12000D}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofDays(int)}
   */
  @Test
  @DisplayName("Test ofDays(int); when '12000'; then return toString is 'P12000D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofDays(int)"})
  void testOfDays_when12000_thenReturnToStringIsP12000d() {
    // Arrange and Act
    Frequency actualOfDaysResult = Frequency.ofDays(12000);

    // Assert
    assertEquals("P12000D", actualOfDaysResult.toString());
    assertEquals(0.030333333333333334d, actualOfDaysResult.eventsPerYearEstimate());
    assertEquals(12000, actualOfDaysResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#ofDays(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toString is {@code P1D}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofDays(int)}
   */
  @Test
  @DisplayName("Test ofDays(int); when one; then return toString is 'P1D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofDays(int)"})
  void testOfDays_whenOne_thenReturnToStringIsP1d() {
    // Arrange and Act
    Frequency actualOfDaysResult = Frequency.ofDays(1);

    // Assert
    assertEquals("P1D", actualOfDaysResult.toString());
    assertEquals(1, actualOfDaysResult.getPeriod().getDays());
    assertEquals(364, actualOfDaysResult.eventsPerYear());
    assertEquals(364.0d, actualOfDaysResult.eventsPerYearEstimate());
  }

  /**
   * Test {@link Frequency#ofDays(int)}.
   *
   * <ul>
   *   <li>When seven.
   *   <li>Then return toString is {@code P1W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofDays(int)}
   */
  @Test
  @DisplayName("Test ofDays(int); when seven; then return toString is 'P1W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofDays(int)"})
  void testOfDays_whenSeven_thenReturnToStringIsP1w() {
    // Arrange and Act
    Frequency actualOfDaysResult = Frequency.ofDays(7);

    // Assert
    assertEquals("P1W", actualOfDaysResult.toString());
    assertEquals(52, actualOfDaysResult.eventsPerYear());
    assertEquals(52.0d, actualOfDaysResult.eventsPerYearEstimate());
    assertEquals(7, actualOfDaysResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#ofDays(int)}.
   *
   * <ul>
   *   <li>When three hundred sixty-four.
   *   <li>Then return toString is {@code P52W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofDays(int)}
   */
  @Test
  @DisplayName("Test ofDays(int); when three hundred sixty-four; then return toString is 'P52W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofDays(int)"})
  void testOfDays_whenThreeHundredSixtyFour_thenReturnToStringIsP52w() {
    // Arrange and Act
    Frequency actualOfDaysResult = Frequency.ofDays(364);

    // Assert
    assertEquals("P52W", actualOfDaysResult.toString());
    assertEquals(1, actualOfDaysResult.eventsPerYear());
    assertEquals(1.0d, actualOfDaysResult.eventsPerYearEstimate());
    assertEquals(364, actualOfDaysResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#ofWeeks(int)}.
   *
   * <ul>
   *   <li>When fifty-two.
   *   <li>Then return toString is {@code P52W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofWeeks(int)}
   */
  @Test
  @DisplayName("Test ofWeeks(int); when fifty-two; then return toString is 'P52W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofWeeks(int)"})
  void testOfWeeks_whenFiftyTwo_thenReturnToStringIsP52w() {
    // Arrange and Act
    Frequency actualOfWeeksResult = Frequency.ofWeeks(52);

    // Assert
    assertEquals("P52W", actualOfWeeksResult.toString());
    assertEquals(1, actualOfWeeksResult.eventsPerYear());
    assertEquals(1.0d, actualOfWeeksResult.eventsPerYearEstimate());
    assertEquals(364, actualOfWeeksResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#ofWeeks(int)}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return toString is {@code P4W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofWeeks(int)}
   */
  @Test
  @DisplayName("Test ofWeeks(int); when four; then return toString is 'P4W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofWeeks(int)"})
  void testOfWeeks_whenFour_thenReturnToStringIsP4w() {
    // Arrange and Act
    Frequency actualOfWeeksResult = Frequency.ofWeeks(4);

    // Assert
    assertEquals("P4W", actualOfWeeksResult.toString());
    assertEquals(13, actualOfWeeksResult.eventsPerYear());
    assertEquals(13.0d, actualOfWeeksResult.eventsPerYearEstimate());
    assertEquals(28, actualOfWeeksResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#ofWeeks(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toString is {@code P1W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofWeeks(int)}
   */
  @Test
  @DisplayName("Test ofWeeks(int); when one; then return toString is 'P1W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofWeeks(int)"})
  void testOfWeeks_whenOne_thenReturnToStringIsP1w() {
    // Arrange and Act
    Frequency actualOfWeeksResult = Frequency.ofWeeks(1);

    // Assert
    assertEquals("P1W", actualOfWeeksResult.toString());
    assertEquals(52, actualOfWeeksResult.eventsPerYear());
    assertEquals(52.0d, actualOfWeeksResult.eventsPerYearEstimate());
    assertEquals(7, actualOfWeeksResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#ofWeeks(int)}.
   *
   * <ul>
   *   <li>When thirteen.
   *   <li>Then return toString is {@code P13W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofWeeks(int)}
   */
  @Test
  @DisplayName("Test ofWeeks(int); when thirteen; then return toString is 'P13W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofWeeks(int)"})
  void testOfWeeks_whenThirteen_thenReturnToStringIsP13w() {
    // Arrange and Act
    Frequency actualOfWeeksResult = Frequency.ofWeeks(13);

    // Assert
    assertEquals("P13W", actualOfWeeksResult.toString());
    assertEquals(4, actualOfWeeksResult.eventsPerYear());
    assertEquals(4.0d, actualOfWeeksResult.eventsPerYearEstimate());
    assertEquals(91, actualOfWeeksResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#ofWeeks(int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return toString is {@code P3W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofWeeks(int)}
   */
  @Test
  @DisplayName("Test ofWeeks(int); when three; then return toString is 'P3W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofWeeks(int)"})
  void testOfWeeks_whenThree_thenReturnToStringIsP3w() {
    // Arrange and Act
    Frequency actualOfWeeksResult = Frequency.ofWeeks(3);

    // Assert
    assertEquals("P3W", actualOfWeeksResult.toString());
    assertEquals(17.333333333333332d, actualOfWeeksResult.eventsPerYearEstimate());
    assertEquals(21, actualOfWeeksResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#ofWeeks(int)}.
   *
   * <ul>
   *   <li>When twenty-six.
   *   <li>Then return toString is {@code P26W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofWeeks(int)}
   */
  @Test
  @DisplayName("Test ofWeeks(int); when twenty-six; then return toString is 'P26W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofWeeks(int)"})
  void testOfWeeks_whenTwentySix_thenReturnToStringIsP26w() {
    // Arrange and Act
    Frequency actualOfWeeksResult = Frequency.ofWeeks(26);

    // Assert
    assertEquals("P26W", actualOfWeeksResult.toString());
    assertEquals(182, actualOfWeeksResult.getPeriod().getDays());
    assertEquals(2, actualOfWeeksResult.eventsPerYear());
    assertEquals(2.0d, actualOfWeeksResult.eventsPerYearEstimate());
  }

  /**
   * Test {@link Frequency#ofWeeks(int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return toString is {@code P2W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofWeeks(int)}
   */
  @Test
  @DisplayName("Test ofWeeks(int); when two; then return toString is 'P2W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofWeeks(int)"})
  void testOfWeeks_whenTwo_thenReturnToStringIsP2w() {
    // Arrange and Act
    Frequency actualOfWeeksResult = Frequency.ofWeeks(2);

    // Assert
    assertEquals("P2W", actualOfWeeksResult.toString());
    assertEquals(14, actualOfWeeksResult.getPeriod().getDays());
    assertEquals(26, actualOfWeeksResult.eventsPerYear());
    assertEquals(26.0d, actualOfWeeksResult.eventsPerYearEstimate());
  }

  /**
   * Test {@link Frequency#ofMonths(int)}.
   *
   * <ul>
   *   <li>When {@code 12001}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofMonths(int)}
   */
  @Test
  @DisplayName("Test ofMonths(int); when '12001'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofMonths(int)"})
  void testOfMonths_when12001_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Frequency.ofMonths(12001));
  }

  /**
   * Test {@link Frequency#ofMonths(int)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return toString is {@code P5M}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofMonths(int)}
   */
  @Test
  @DisplayName("Test ofMonths(int); when five; then return toString is 'P5M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofMonths(int)"})
  void testOfMonths_whenFive_thenReturnToStringIsP5m() {
    // Arrange and Act
    Frequency actualOfMonthsResult = Frequency.ofMonths(5);

    // Assert
    assertEquals("P5M", actualOfMonthsResult.toString());
    assertEquals(2.4d, actualOfMonthsResult.eventsPerYearEstimate());
    Period period = actualOfMonthsResult.getPeriod();
    assertEquals(5, period.getMonths());
    assertEquals(5L, period.toTotalMonths());
  }

  /**
   * Test {@link Frequency#ofMonths(int)}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return toString is {@code P4M}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofMonths(int)}
   */
  @Test
  @DisplayName("Test ofMonths(int); when four; then return toString is 'P4M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofMonths(int)"})
  void testOfMonths_whenFour_thenReturnToStringIsP4m() {
    // Arrange and Act
    Frequency actualOfMonthsResult = Frequency.ofMonths(4);

    // Assert
    assertEquals("P4M", actualOfMonthsResult.toString());
    assertEquals(3, actualOfMonthsResult.eventsPerYear());
    assertEquals(3.0d, actualOfMonthsResult.eventsPerYearEstimate());
    Period period = actualOfMonthsResult.getPeriod();
    assertEquals(4, period.getMonths());
    assertEquals(4L, period.toTotalMonths());
  }

  /**
   * Test {@link Frequency#ofMonths(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toString is {@code P1M}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofMonths(int)}
   */
  @Test
  @DisplayName("Test ofMonths(int); when one; then return toString is 'P1M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofMonths(int)"})
  void testOfMonths_whenOne_thenReturnToStringIsP1m() {
    // Arrange and Act
    Frequency actualOfMonthsResult = Frequency.ofMonths(1);

    // Assert
    assertEquals("P1M", actualOfMonthsResult.toString());
    Period period = actualOfMonthsResult.getPeriod();
    assertEquals(1, period.getMonths());
    assertEquals(12, actualOfMonthsResult.eventsPerYear());
    assertEquals(12.0d, actualOfMonthsResult.eventsPerYearEstimate());
    assertEquals(1L, period.toTotalMonths());
  }

  /**
   * Test {@link Frequency#ofMonths(int)}.
   *
   * <ul>
   *   <li>When six.
   *   <li>Then return toString is {@code P6M}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofMonths(int)}
   */
  @Test
  @DisplayName("Test ofMonths(int); when six; then return toString is 'P6M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofMonths(int)"})
  void testOfMonths_whenSix_thenReturnToStringIsP6m() {
    // Arrange and Act
    Frequency actualOfMonthsResult = Frequency.ofMonths(6);

    // Assert
    assertEquals("P6M", actualOfMonthsResult.toString());
    assertEquals(2, actualOfMonthsResult.eventsPerYear());
    assertEquals(2.0d, actualOfMonthsResult.eventsPerYearEstimate());
    Period period = actualOfMonthsResult.getPeriod();
    assertEquals(6, period.getMonths());
    assertEquals(6L, period.toTotalMonths());
  }

  /**
   * Test {@link Frequency#ofMonths(int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return toString is {@code P3M}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofMonths(int)}
   */
  @Test
  @DisplayName("Test ofMonths(int); when three; then return toString is 'P3M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofMonths(int)"})
  void testOfMonths_whenThree_thenReturnToStringIsP3m() {
    // Arrange and Act
    Frequency actualOfMonthsResult = Frequency.ofMonths(3);

    // Assert
    assertEquals("P3M", actualOfMonthsResult.toString());
    Period period = actualOfMonthsResult.getPeriod();
    assertEquals(3, period.getMonths());
    assertEquals(3L, period.toTotalMonths());
    assertEquals(4, actualOfMonthsResult.eventsPerYear());
    assertEquals(4.0d, actualOfMonthsResult.eventsPerYearEstimate());
  }

  /**
   * Test {@link Frequency#ofMonths(int)}.
   *
   * <ul>
   *   <li>When twelve.
   *   <li>Then return toString is {@code P12M}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofMonths(int)}
   */
  @Test
  @DisplayName("Test ofMonths(int); when twelve; then return toString is 'P12M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofMonths(int)"})
  void testOfMonths_whenTwelve_thenReturnToStringIsP12m() {
    // Arrange and Act
    Frequency actualOfMonthsResult = Frequency.ofMonths(12);

    // Assert
    assertEquals("P12M", actualOfMonthsResult.toString());
    assertEquals(1, actualOfMonthsResult.eventsPerYear());
    assertEquals(1.0d, actualOfMonthsResult.eventsPerYearEstimate());
    Period period = actualOfMonthsResult.getPeriod();
    assertEquals(12, period.getMonths());
    assertEquals(12L, period.toTotalMonths());
    assertTrue(actualOfMonthsResult.isAnnual());
  }

  /**
   * Test {@link Frequency#ofMonths(int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return toString is {@code P2M}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofMonths(int)}
   */
  @Test
  @DisplayName("Test ofMonths(int); when two; then return toString is 'P2M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofMonths(int)"})
  void testOfMonths_whenTwo_thenReturnToStringIsP2m() {
    // Arrange and Act
    Frequency actualOfMonthsResult = Frequency.ofMonths(2);

    // Assert
    assertEquals("P2M", actualOfMonthsResult.toString());
    Period period = actualOfMonthsResult.getPeriod();
    assertEquals(2, period.getMonths());
    assertEquals(2L, period.toTotalMonths());
    assertEquals(6, actualOfMonthsResult.eventsPerYear());
    assertEquals(6.0d, actualOfMonthsResult.eventsPerYearEstimate());
  }

  /**
   * Test {@link Frequency#ofYears(int)}.
   *
   * <ul>
   *   <li>When {@code 1001}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofYears(int)}
   */
  @Test
  @DisplayName("Test ofYears(int); when '1001'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofYears(int)"})
  void testOfYears_when1001_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Frequency.ofYears(1001));
  }

  /**
   * Test {@link Frequency#ofYears(int)}.
   *
   * <ul>
   *   <li>When one thousand.
   *   <li>Then return toString is {@code P1000Y}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofYears(int)}
   */
  @Test
  @DisplayName("Test ofYears(int); when one thousand; then return toString is 'P1000Y'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofYears(int)"})
  void testOfYears_whenOneThousand_thenReturnToStringIsP1000y() {
    // Arrange and Act
    Frequency actualOfYearsResult = Frequency.ofYears(1000);

    // Assert
    assertEquals("P1000Y", actualOfYearsResult.toString());
    assertEquals(0.001d, actualOfYearsResult.eventsPerYearEstimate());
    Period period = actualOfYearsResult.getPeriod();
    assertEquals(1000, period.getYears());
    assertEquals(12000L, period.toTotalMonths());
    assertFalse(actualOfYearsResult.isAnnual());
  }

  /**
   * Test {@link Frequency#ofYears(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toString is {@code P1Y}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#ofYears(int)}
   */
  @Test
  @DisplayName("Test ofYears(int); when one; then return toString is 'P1Y'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.ofYears(int)"})
  void testOfYears_whenOne_thenReturnToStringIsP1y() {
    // Arrange and Act
    Frequency actualOfYearsResult = Frequency.ofYears(1);

    // Assert
    assertEquals("P1Y", actualOfYearsResult.toString());
    assertEquals(1, actualOfYearsResult.eventsPerYear());
    Period period = actualOfYearsResult.getPeriod();
    assertEquals(1, period.getYears());
    assertEquals(1.0d, actualOfYearsResult.eventsPerYearEstimate());
    assertEquals(12L, period.toTotalMonths());
    assertTrue(actualOfYearsResult.isAnnual());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 0T}.
   *   <li>Then return toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '0T'; then return toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_when0t_thenReturnToStringIsTerm() {
    // Arrange and Act
    Frequency actualParseResult = Frequency.parse("0T");

    // Assert
    assertEquals("Term", actualParseResult.toString());
    assertEquals(0, actualParseResult.eventsPerYear());
    Period period = actualParseResult.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0.0d, actualParseResult.eventsPerYearEstimate());
    assertEquals(10000, period.getYears());
    assertEquals(120000L, period.toTotalMonths());
    assertFalse(actualParseResult.isWeekBased());
    assertTrue(actualParseResult.isTerm());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 1T}.
   *   <li>Then return toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '1T'; then return toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_when1t_thenReturnToStringIsTerm() {
    // Arrange and Act
    Frequency actualParseResult = Frequency.parse("1T");

    // Assert
    assertEquals("Term", actualParseResult.toString());
    assertEquals(0, actualParseResult.eventsPerYear());
    Period period = actualParseResult.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0.0d, actualParseResult.eventsPerYearEstimate());
    assertEquals(10000, period.getYears());
    assertEquals(120000L, period.toTotalMonths());
    assertFalse(actualParseResult.isWeekBased());
    assertTrue(actualParseResult.isTerm());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42W}.
   *   <li>Then return toString is {@code P42W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '42W'; then return toString is 'P42W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_when42w_thenReturnToStringIsP42w() {
    // Arrange and Act
    Frequency actualParseResult = Frequency.parse("42W");

    // Assert
    assertEquals("P42W", actualParseResult.toString());
    assertEquals(1.2380952380952381d, actualParseResult.eventsPerYearEstimate());
    assertEquals(294, actualParseResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code P1W}.
   *   <li>Then return toString is {@code P1W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'P1W'; then return toString is 'P1W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_whenP1w_thenReturnToStringIsP1w() {
    // Arrange and Act
    Frequency actualParseResult = Frequency.parse("P1W");

    // Assert
    assertEquals("P1W", actualParseResult.toString());
    assertEquals(52, actualParseResult.eventsPerYear());
    assertEquals(52.0d, actualParseResult.eventsPerYearEstimate());
    assertEquals(7, actualParseResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code P2W}.
   *   <li>Then return toString is {@code P2W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'P2W'; then return toString is 'P2W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_whenP2w_thenReturnToStringIsP2w() {
    // Arrange and Act
    Frequency actualParseResult = Frequency.parse("P2W");

    // Assert
    assertEquals("P2W", actualParseResult.toString());
    assertEquals(14, actualParseResult.getPeriod().getDays());
    assertEquals(26, actualParseResult.eventsPerYear());
    assertEquals(26.0d, actualParseResult.eventsPerYearEstimate());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code P4W}.
   *   <li>Then return toString is {@code P4W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'P4W'; then return toString is 'P4W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_whenP4w_thenReturnToStringIsP4w() {
    // Arrange and Act
    Frequency actualParseResult = Frequency.parse("P4W");

    // Assert
    assertEquals("P4W", actualParseResult.toString());
    assertEquals(13, actualParseResult.eventsPerYear());
    assertEquals(13.0d, actualParseResult.eventsPerYearEstimate());
    assertEquals(28, actualParseResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code P13W}.
   *   <li>Then return toString is {@code P13W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'P13W'; then return toString is 'P13W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_whenP13w_thenReturnToStringIsP13w() {
    // Arrange and Act
    Frequency actualParseResult = Frequency.parse("P13W");

    // Assert
    assertEquals("P13W", actualParseResult.toString());
    assertEquals(4, actualParseResult.eventsPerYear());
    assertEquals(4.0d, actualParseResult.eventsPerYearEstimate());
    assertEquals(91, actualParseResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code P26W}.
   *   <li>Then return toString is {@code P26W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'P26W'; then return toString is 'P26W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_whenP26w_thenReturnToStringIsP26w() {
    // Arrange and Act
    Frequency actualParseResult = Frequency.parse("P26W");

    // Assert
    assertEquals("P26W", actualParseResult.toString());
    assertEquals(182, actualParseResult.getPeriod().getDays());
    assertEquals(2, actualParseResult.eventsPerYear());
    assertEquals(2.0d, actualParseResult.eventsPerYearEstimate());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code P52W}.
   *   <li>Then return toString is {@code P52W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'P52W'; then return toString is 'P52W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_whenP52w_thenReturnToStringIsP52w() {
    // Arrange and Act
    Frequency actualParseResult = Frequency.parse("P52W");

    // Assert
    assertEquals("P52W", actualParseResult.toString());
    assertEquals(1, actualParseResult.eventsPerYear());
    assertEquals(1.0d, actualParseResult.eventsPerYearEstimate());
    assertEquals(364, actualParseResult.getPeriod().getDays());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code P}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'P'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_whenP_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Frequency.parse("P"));
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code T}.
   *   <li>Then return toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'T'; then return toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_whenT_thenReturnToStringIsTerm() {
    // Arrange and Act
    Frequency actualParseResult = Frequency.parse("T");

    // Assert
    assertEquals("Term", actualParseResult.toString());
    assertEquals(0, actualParseResult.eventsPerYear());
    Period period = actualParseResult.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0.0d, actualParseResult.eventsPerYearEstimate());
    assertEquals(10000, period.getYears());
    assertEquals(120000L, period.toTotalMonths());
    assertFalse(actualParseResult.isWeekBased());
    assertTrue(actualParseResult.isTerm());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Term}.
   *   <li>Then return toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Term'; then return toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_whenTerm_thenReturnToStringIsTerm() {
    // Arrange and Act
    Frequency actualParseResult = Frequency.parse("Term");

    // Assert
    assertEquals("Term", actualParseResult.toString());
    assertEquals(0, actualParseResult.eventsPerYear());
    Period period = actualParseResult.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0.0d, actualParseResult.eventsPerYearEstimate());
    assertEquals(10000, period.getYears());
    assertEquals(120000L, period.toTotalMonths());
    assertFalse(actualParseResult.isWeekBased());
    assertTrue(actualParseResult.isTerm());
  }

  /**
   * Test {@link Frequency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code To Parse}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'To Parse'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.parse(String)"})
  void testParse_whenToParse_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Frequency.parse("To Parse"));
  }

  /**
   * Test {@link Frequency#isTerm()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P12M}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#isTerm()}
   */
  @Test
  @DisplayName("Test isTerm(); given P12M; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.isTerm()"})
  void testIsTerm_givenP12m_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Frequency.P12M.isTerm());
  }

  /**
   * Test {@link Frequency#isTerm()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#TERM}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#isTerm()}
   */
  @Test
  @DisplayName("Test isTerm(); given TERM; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.isTerm()"})
  void testIsTerm_givenTerm_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Frequency.TERM.isTerm());
  }

  /**
   * Test {@link Frequency#normalized()}.
   *
   * <ul>
   *   <li>Given ofMonths thirteen.
   *   <li>Then return toString is {@code P1Y1M}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#normalized()}
   */
  @Test
  @DisplayName("Test normalized(); given ofMonths thirteen; then return toString is 'P1Y1M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.normalized()"})
  void testNormalized_givenOfMonthsThirteen_thenReturnToStringIsP1y1m() {
    // Arrange
    Frequency ofMonthsResult = Frequency.ofMonths(13);

    // Act
    Frequency actualNormalizedResult = ofMonthsResult.normalized();

    // Assert
    assertEquals("P1Y1M", actualNormalizedResult.toString());
    assertEquals(0.9230769230769231d, actualNormalizedResult.eventsPerYearEstimate());
    Period period = actualNormalizedResult.getPeriod();
    assertEquals(1, period.getMonths());
    assertEquals(13L, period.toTotalMonths());
  }

  /**
   * Test {@link Frequency#normalized()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P12M}.
   *   <li>Then return toString is {@code P1Y}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#normalized()}
   */
  @Test
  @DisplayName("Test normalized(); given P12M; then return toString is 'P1Y'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.normalized()"})
  void testNormalized_givenP12m_thenReturnToStringIsP1y() {
    // Arrange and Act
    Frequency actualNormalizedResult = Frequency.P12M.normalized();

    // Assert
    assertEquals("P1Y", actualNormalizedResult.toString());
    assertEquals(1, actualNormalizedResult.eventsPerYear());
    assertEquals(1.0d, actualNormalizedResult.eventsPerYearEstimate());
    assertEquals(12L, actualNormalizedResult.getPeriod().toTotalMonths());
    assertTrue(actualNormalizedResult.isAnnual());
  }

  /**
   * Test {@link Frequency#normalized()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P13W}.
   *   <li>Then return {@link Frequency#P13W}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#normalized()}
   */
  @Test
  @DisplayName("Test normalized(); given P13W; then return P13W")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency Frequency.normalized()"})
  void testNormalized_givenP13w_thenReturnP13w() {
    // Arrange, Act and Assert
    assertSame(Frequency.P13W, Frequency.P13W.normalized());
  }

  /**
   * Test {@link Frequency#isWeekBased()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P1D}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#isWeekBased()}
   */
  @Test
  @DisplayName("Test isWeekBased(); given P1D; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.isWeekBased()"})
  void testIsWeekBased_givenP1d_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Frequency.P1D.isWeekBased());
  }

  /**
   * Test {@link Frequency#isWeekBased()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P12M}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#isWeekBased()}
   */
  @Test
  @DisplayName("Test isWeekBased(); given P12M; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.isWeekBased()"})
  void testIsWeekBased_givenP12m_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Frequency.P12M.isWeekBased());
  }

  /**
   * Test {@link Frequency#isWeekBased()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P13W}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#isWeekBased()}
   */
  @Test
  @DisplayName("Test isWeekBased(); given P13W; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.isWeekBased()"})
  void testIsWeekBased_givenP13w_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Frequency.P13W.isWeekBased());
  }

  /**
   * Test {@link Frequency#isMonthBased()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P12M}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#isMonthBased()}
   */
  @Test
  @DisplayName("Test isMonthBased(); given P12M; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.isMonthBased()"})
  void testIsMonthBased_givenP12m_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Frequency.P12M.isMonthBased());
  }

  /**
   * Test {@link Frequency#isMonthBased()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P13W}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#isMonthBased()}
   */
  @Test
  @DisplayName("Test isMonthBased(); given P13W; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.isMonthBased()"})
  void testIsMonthBased_givenP13w_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Frequency.P13W.isMonthBased());
  }

  /**
   * Test {@link Frequency#isMonthBased()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#TERM}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#isMonthBased()}
   */
  @Test
  @DisplayName("Test isMonthBased(); given TERM; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.isMonthBased()"})
  void testIsMonthBased_givenTerm_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Frequency.TERM.isMonthBased());
  }

  /**
   * Test {@link Frequency#isAnnual()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P12M}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#isAnnual()}
   */
  @Test
  @DisplayName("Test isAnnual(); given P12M; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.isAnnual()"})
  void testIsAnnual_givenP12m_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Frequency.P12M.isAnnual());
  }

  /**
   * Test {@link Frequency#isAnnual()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P13W}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#isAnnual()}
   */
  @Test
  @DisplayName("Test isAnnual(); given P13W; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.isAnnual()"})
  void testIsAnnual_givenP13w_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Frequency.P13W.isAnnual());
  }

  /**
   * Test {@link Frequency#eventsPerYear()}.
   *
   * <ul>
   *   <li>Given ofDays three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#eventsPerYear()}
   */
  @Test
  @DisplayName("Test eventsPerYear(); given ofDays three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Frequency.eventsPerYear()"})
  void testEventsPerYear_givenOfDaysThree_thenThrowIllegalArgumentException() {
    // Arrange
    Frequency ofDaysResult = Frequency.ofDays(3);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofDaysResult.eventsPerYear());
  }

  /**
   * Test {@link Frequency#eventsPerYear()}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P12M}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#eventsPerYear()}
   */
  @Test
  @DisplayName("Test eventsPerYear(); given P12M; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Frequency.eventsPerYear()"})
  void testEventsPerYear_givenP12m_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, Frequency.P12M.eventsPerYear());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Frequency#eventsPerYearEstimate()}
   *   <li>{@link Frequency#getPeriod()}
   *   <li>{@link Frequency#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double Frequency.eventsPerYearEstimate()",
    "Period Frequency.getPeriod()",
    "String Frequency.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Frequency ofDaysResult = Frequency.ofDays(1);

    // Act
    double actualEventsPerYearEstimateResult = ofDaysResult.eventsPerYearEstimate();
    Period actualPeriod = ofDaysResult.getPeriod();

    // Assert
    List<TemporalUnit> units = actualPeriod.getUnits();
    assertEquals(3, units.size());
    TemporalUnit getResult = units.get(0);
    assertTrue(getResult instanceof ChronoUnit);
    TemporalUnit getResult2 = units.get(1);
    assertTrue(getResult2 instanceof ChronoUnit);
    TemporalUnit getResult3 = units.get(2);
    assertTrue(getResult3 instanceof ChronoUnit);
    IsoChronology chronology = actualPeriod.getChronology();
    assertEquals("ISO", chronology.getId());
    assertEquals("P1D", ofDaysResult.toString());
    assertEquals("iso8601", chronology.getCalendarType());
    assertEquals(0, actualPeriod.getMonths());
    assertEquals(0, actualPeriod.getYears());
    assertEquals(0L, actualPeriod.toTotalMonths());
    assertEquals(1, actualPeriod.getDays());
    assertEquals(364.0d, actualEventsPerYearEstimateResult);
    assertEquals(ChronoUnit.DAYS, getResult3);
    assertEquals(ChronoUnit.MONTHS, getResult2);
    assertEquals(ChronoUnit.YEARS, getResult);
    assertFalse(actualPeriod.isNegative());
    assertFalse(actualPeriod.isZero());
  }

  /**
   * Test {@link Frequency#exactDivide(Frequency)}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P1M}.
   *   <li>When {@link Frequency#P12M}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#exactDivide(Frequency)}
   */
  @Test
  @DisplayName(
      "Test exactDivide(Frequency); given P1M; when P12M; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Frequency.exactDivide(Frequency)"})
  void testExactDivide_givenP1m_whenP12m_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Frequency.P1M.exactDivide(Frequency.P12M));
  }

  /**
   * Test {@link Frequency#exactDivide(Frequency)}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P12M}.
   *   <li>When {@link Frequency#P12M}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#exactDivide(Frequency)}
   */
  @Test
  @DisplayName("Test exactDivide(Frequency); given P12M; when P12M; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Frequency.exactDivide(Frequency)"})
  void testExactDivide_givenP12m_whenP12m_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, Frequency.P12M.exactDivide(Frequency.P12M));
  }

  /**
   * Test {@link Frequency#exactDivide(Frequency)}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P12M}.
   *   <li>When {@link Frequency#P13W}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#exactDivide(Frequency)}
   */
  @Test
  @DisplayName(
      "Test exactDivide(Frequency); given P12M; when P13W; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Frequency.exactDivide(Frequency)"})
  void testExactDivide_givenP12m_whenP13w_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Frequency.P12M.exactDivide(Frequency.P13W));
  }

  /**
   * Test {@link Frequency#exactDivide(Frequency)}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P13W}.
   *   <li>When {@link Frequency#P12M}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#exactDivide(Frequency)}
   */
  @Test
  @DisplayName(
      "Test exactDivide(Frequency); given P13W; when P12M; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Frequency.exactDivide(Frequency)"})
  void testExactDivide_givenP13w_whenP12m_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Frequency.P13W.exactDivide(Frequency.P12M));
  }

  /**
   * Test {@link Frequency#exactDivide(Frequency)}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P13W}.
   *   <li>When {@link Frequency#P13W}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#exactDivide(Frequency)}
   */
  @Test
  @DisplayName("Test exactDivide(Frequency); given P13W; when P13W; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Frequency.exactDivide(Frequency)"})
  void testExactDivide_givenP13w_whenP13w_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, Frequency.P13W.exactDivide(Frequency.P13W));
  }

  /**
   * Test {@link Frequency#exactDivide(Frequency)}.
   *
   * <ul>
   *   <li>Given {@link Frequency#P13W}.
   *   <li>When {@link Frequency#P26W}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#exactDivide(Frequency)}
   */
  @Test
  @DisplayName(
      "Test exactDivide(Frequency); given P13W; when P26W; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Frequency.exactDivide(Frequency)"})
  void testExactDivide_givenP13w_whenP26w_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Frequency.P13W.exactDivide(Frequency.P26W));
  }

  /**
   * Test {@link Frequency#exactDivide(Frequency)}.
   *
   * <ul>
   *   <li>Given {@link Frequency#TERM}.
   *   <li>When {@link Frequency#P12M}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#exactDivide(Frequency)}
   */
  @Test
  @DisplayName(
      "Test exactDivide(Frequency); given TERM; when P12M; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Frequency.exactDivide(Frequency)"})
  void testExactDivide_givenTerm_whenP12m_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Frequency.TERM.exactDivide(Frequency.P12M));
  }

  /**
   * Test {@link Frequency#getUnits()}.
   *
   * <p>Method under test: {@link Frequency#getUnits()}
   */
  @Test
  @DisplayName("Test getUnits()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List Frequency.getUnits()"})
  void testGetUnits() {
    // Arrange and Act
    List<TemporalUnit> actualUnits = Frequency.P12M.getUnits();

    // Assert
    assertEquals(3, actualUnits.size());
    TemporalUnit getResult = actualUnits.get(0);
    assertTrue(getResult instanceof ChronoUnit);
    TemporalUnit getResult2 = actualUnits.get(1);
    assertTrue(getResult2 instanceof ChronoUnit);
    TemporalUnit getResult3 = actualUnits.get(2);
    assertTrue(getResult3 instanceof ChronoUnit);
    assertEquals(ChronoUnit.DAYS, getResult3);
    assertEquals(ChronoUnit.MONTHS, getResult2);
    assertEquals(ChronoUnit.YEARS, getResult);
  }

  /**
   * Test {@link Frequency#addTo(Temporal)}.
   *
   * <ul>
   *   <li>Then return toLocalDate toString is {@code 0002-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#addTo(Temporal)}
   */
  @Test
  @DisplayName("Test addTo(Temporal); then return toLocalDate toString is '0002-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Temporal Frequency.addTo(Temporal)"})
  void testAddTo_thenReturnToLocalDateToStringIs00020101() {
    // Arrange
    LocalDateTime temporal = LocalDateTime.of(1, 1, 1, 1, 1);

    // Act
    Temporal actualAddToResult = Frequency.P12M.addTo(temporal);

    // Assert
    assertEquals("0002-01-01", ((LocalDateTime) actualAddToResult).toLocalDate().toString());
    assertEquals("01:01", ((LocalDateTime) actualAddToResult).toLocalTime().toString());
  }

  /**
   * Test {@link Frequency#addTo(Temporal)}.
   *
   * <ul>
   *   <li>When ofEpochDay one.
   *   <li>Then return toString is {@code 1971-01-02}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#addTo(Temporal)}
   */
  @Test
  @DisplayName("Test addTo(Temporal); when ofEpochDay one; then return toString is '1971-01-02'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Temporal Frequency.addTo(Temporal)"})
  void testAddTo_whenOfEpochDayOne_thenReturnToStringIs19710102() {
    // Arrange, Act and Assert
    assertEquals("1971-01-02", Frequency.P12M.addTo(LocalDate.ofEpochDay(1L)).toString());
  }

  /**
   * Test {@link Frequency#subtractFrom(Temporal)}.
   *
   * <ul>
   *   <li>Then return toLocalDate toString is {@code 0000-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#subtractFrom(Temporal)}
   */
  @Test
  @DisplayName("Test subtractFrom(Temporal); then return toLocalDate toString is '0000-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Temporal Frequency.subtractFrom(Temporal)"})
  void testSubtractFrom_thenReturnToLocalDateToStringIs00000101() {
    // Arrange
    LocalDateTime temporal = LocalDateTime.of(1, 1, 1, 1, 1);

    // Act
    Temporal actualSubtractFromResult = Frequency.P12M.subtractFrom(temporal);

    // Assert
    assertEquals("0000-01-01", ((LocalDateTime) actualSubtractFromResult).toLocalDate().toString());
    assertEquals("01:01", ((LocalDateTime) actualSubtractFromResult).toLocalTime().toString());
  }

  /**
   * Test {@link Frequency#subtractFrom(Temporal)}.
   *
   * <ul>
   *   <li>When ofEpochDay one.
   *   <li>Then return toString is {@code 1969-01-02}.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#subtractFrom(Temporal)}
   */
  @Test
  @DisplayName(
      "Test subtractFrom(Temporal); when ofEpochDay one; then return toString is '1969-01-02'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Temporal Frequency.subtractFrom(Temporal)"})
  void testSubtractFrom_whenOfEpochDayOne_thenReturnToStringIs19690102() {
    // Arrange, Act and Assert
    assertEquals("1969-01-02", Frequency.P12M.subtractFrom(LocalDate.ofEpochDay(1L)).toString());
  }

  /**
   * Test {@link Frequency#equals(Object)}, and {@link Frequency#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Frequency#equals(Object)}
   *   <li>{@link Frequency#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.equals(Object)", "int Frequency.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Frequency frequency = Frequency.P12M;
    Frequency frequency2 = Frequency.P12M;

    // Act and Assert
    assertEquals(frequency, frequency2);
    assertEquals(frequency.hashCode(), frequency2.hashCode());
  }

  /**
   * Test {@link Frequency#equals(Object)}, and {@link Frequency#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Frequency#equals(Object)}
   *   <li>{@link Frequency#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.equals(Object)", "int Frequency.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Frequency frequency = Frequency.P12M;

    // Act and Assert
    assertEquals(frequency, frequency);
    int expectedHashCodeResult = frequency.hashCode();
    assertEquals(expectedHashCodeResult, frequency.hashCode());
  }

  /**
   * Test {@link Frequency#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.equals(Object)", "int Frequency.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Frequency.P13W, Frequency.P12M);
  }

  /**
   * Test {@link Frequency#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.equals(Object)", "int Frequency.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Frequency.P12M, null);
  }

  /**
   * Test {@link Frequency#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Frequency#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Frequency.equals(Object)", "int Frequency.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Frequency.P12M, "Different type to Frequency");
  }
}
