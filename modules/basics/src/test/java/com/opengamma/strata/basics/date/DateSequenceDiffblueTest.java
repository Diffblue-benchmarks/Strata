package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DateSequenceTest.DummyDateSequence;
import com.opengamma.strata.collect.named.ExtendedEnum;
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DateSequenceDiffblueTest {
  /**
   * Test {@link DateSequence#extendedEnum()}.
   *
   * <p>Method under test: {@link DateSequence#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum DateSequence.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<DateSequence> actualExtendedEnumResult = DateSequence.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<DateSequence> expectedType = DateSequence.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }

  /**
   * Test {@link DateSequence#baseSequence()}.
   *
   * <p>Method under test: {@link DateSequence#baseSequence()}
   */
  @Test
  @DisplayName("Test baseSequence()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DateSequence DateSequence.baseSequence()"})
  void testBaseSequence() {
    // Arrange
    DummyDateSequence dummyDateSequence = new DummyDateSequence();

    // Act
    DateSequence actualBaseSequenceResult = dummyDateSequence.baseSequence();

    // Assert
    assertTrue(actualBaseSequenceResult instanceof DummyDateSequence);
    assertEquals("Dummy", actualBaseSequenceResult.getName());
    assertSame(dummyDateSequence, actualBaseSequenceResult);
  }

  /**
   * Test {@link DateSequence#next(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#next(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test next(LocalDate); when LocalDate with '1970' and one and one; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.next(LocalDate)"})
  void testNext_whenLocalDateWith1970AndOneAndOne_thenReturnToStringIs20151015() {
    // Arrange, Act and Assert
    assertEquals("2015-10-15", new DummyDateSequence().next(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link DateSequence#next(LocalDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay minus one.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#next(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test next(LocalDate); when ofEpochDay minus one; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.next(LocalDate)"})
  void testNext_whenOfEpochDayMinusOne_thenReturnToStringIs20151015() {
    // Arrange, Act and Assert
    assertEquals("2015-10-15", new DummyDateSequence().next(LocalDate.ofEpochDay(-1L)).toString());
  }

  /**
   * Test {@link DateSequence#nth(LocalDate, int)}.
   *
   * <ul>
   *   <li>When ofEpochDay minus one.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#nth(LocalDate, int)}
   */
  @Test
  @DisplayName(
      "Test nth(LocalDate, int); when ofEpochDay minus one; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.nth(LocalDate, int)"})
  void testNth_whenOfEpochDayMinusOne_thenReturnToStringIs20151015() {
    // Arrange, Act and Assert
    assertEquals(
        "2015-10-15", new DummyDateSequence().nth(LocalDate.ofEpochDay(-1L), 1).toString());
  }

  /**
   * Test {@link DateSequence#nth(LocalDate, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#nth(LocalDate, int)}
   */
  @Test
  @DisplayName("Test nth(LocalDate, int); when one; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.nth(LocalDate, int)"})
  void testNth_whenOne_thenReturnToStringIs20151015() {
    // Arrange, Act and Assert
    assertEquals("2015-10-15", new DummyDateSequence().nth(LocalDate.of(1970, 1, 1), 1).toString());
  }

  /**
   * Test {@link DateSequence#nth(LocalDate, int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return toString is {@code 2015-10-22}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#nth(LocalDate, int)}
   */
  @Test
  @DisplayName("Test nth(LocalDate, int); when two; then return toString is '2015-10-22'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.nth(LocalDate, int)"})
  void testNth_whenTwo_thenReturnToStringIs20151022() {
    // Arrange, Act and Assert
    assertEquals("2015-10-22", new DummyDateSequence().nth(LocalDate.of(1970, 1, 1), 2).toString());
  }

  /**
   * Test {@link DateSequence#nthOrSame(LocalDate, int)}.
   *
   * <ul>
   *   <li>Given {@link DummyDateSequence} (default constructor).
   *   <li>When one.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#nthOrSame(LocalDate, int)}
   */
  @Test
  @DisplayName(
      "Test nthOrSame(LocalDate, int); given DummyDateSequence (default constructor); when one; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.nthOrSame(LocalDate, int)"})
  void testNthOrSame_givenDummyDateSequence_whenOne_thenReturnToStringIs20151015() {
    // Arrange, Act and Assert
    assertEquals(
        "2015-10-15", new DummyDateSequence().nthOrSame(LocalDate.of(1970, 1, 1), 1).toString());
  }

  /**
   * Test {@link DateSequence#nthOrSame(LocalDate, int)}.
   *
   * <ul>
   *   <li>Given {@link DateSequences#MONTHLY_1ST}.
   *   <li>When one.
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#nthOrSame(LocalDate, int)}
   */
  @Test
  @DisplayName(
      "Test nthOrSame(LocalDate, int); given MONTHLY_1ST; when one; then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.nthOrSame(LocalDate, int)"})
  void testNthOrSame_givenMonthly_1st_whenOne_thenReturnLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNthOrSameResult = DateSequences.MONTHLY_1ST.nthOrSame(date, 1);

    // Assert
    assertSame(date, actualNthOrSameResult);
  }

  /**
   * Test {@link DateSequence#selectDate(LocalDate, SequenceDate)}.
   *
   * <ul>
   *   <li>When base one.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#selectDate(LocalDate, SequenceDate)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, SequenceDate); when base one; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.selectDate(LocalDate, SequenceDate)"})
  void testSelectDate_whenBaseOne_thenReturnToStringIs20151015() {
    // Arrange
    DummyDateSequence dummyDateSequence = new DummyDateSequence();
    LocalDate inputDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        "2015-10-15", dummyDateSequence.selectDate(inputDate, SequenceDate.base(1)).toString());
  }

  /**
   * Test {@link DateSequence#selectDate(LocalDate, SequenceDate)}.
   *
   * <ul>
   *   <li>When base two.
   *   <li>Then return toString is {@code 2015-10-22}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#selectDate(LocalDate, SequenceDate)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, SequenceDate); when base two; then return toString is '2015-10-22'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.selectDate(LocalDate, SequenceDate)"})
  void testSelectDate_whenBaseTwo_thenReturnToStringIs20151022() {
    // Arrange
    DummyDateSequence dummyDateSequence = new DummyDateSequence();
    LocalDate inputDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        "2015-10-22", dummyDateSequence.selectDate(inputDate, SequenceDate.base(2)).toString());
  }

  /**
   * Test {@link DateSequence#selectDate(LocalDate, SequenceDate)}.
   *
   * <ul>
   *   <li>When base {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#selectDate(LocalDate, SequenceDate)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, SequenceDate); when base YearMonth with '1970' and 'JANUARY'; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.selectDate(LocalDate, SequenceDate)"})
  void testSelectDate_whenBaseYearMonthWith1970AndJanuary_thenReturnToStringIs20151015() {
    // Arrange
    DummyDateSequence dummyDateSequence = new DummyDateSequence();
    LocalDate inputDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        "2015-10-15",
        dummyDateSequence
            .selectDate(inputDate, SequenceDate.base(YearMonth.of(1970, Month.JANUARY)))
            .toString());
  }

  /**
   * Test {@link DateSequence#selectDate(LocalDate, SequenceDate)}.
   *
   * <ul>
   *   <li>When full one.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#selectDate(LocalDate, SequenceDate)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, SequenceDate); when full one; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.selectDate(LocalDate, SequenceDate)"})
  void testSelectDate_whenFullOne_thenReturnToStringIs20151015() {
    // Arrange
    DummyDateSequence dummyDateSequence = new DummyDateSequence();
    LocalDate inputDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        "2015-10-15", dummyDateSequence.selectDate(inputDate, SequenceDate.full(1)).toString());
  }

  /**
   * Test {@link DateSequence#selectDate(LocalDate, SequenceDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay minus one.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#selectDate(LocalDate, SequenceDate)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, SequenceDate); when ofEpochDay minus one; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.selectDate(LocalDate, SequenceDate)"})
  void testSelectDate_whenOfEpochDayMinusOne_thenReturnToStringIs20151015() {
    // Arrange
    DummyDateSequence dummyDateSequence = new DummyDateSequence();
    LocalDate inputDate = LocalDate.ofEpochDay(-1L);

    // Act and Assert
    assertEquals(
        "2015-10-15", dummyDateSequence.selectDate(inputDate, SequenceDate.base(1)).toString());
  }

  /**
   * Test {@link DateSequence#selectDateOrSame(LocalDate, SequenceDate)}.
   *
   * <ul>
   *   <li>When base one.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#selectDateOrSame(LocalDate, SequenceDate)}
   */
  @Test
  @DisplayName(
      "Test selectDateOrSame(LocalDate, SequenceDate); when base one; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.selectDateOrSame(LocalDate, SequenceDate)"})
  void testSelectDateOrSame_whenBaseOne_thenReturnToStringIs20151015() {
    // Arrange
    DummyDateSequence dummyDateSequence = new DummyDateSequence();
    LocalDate inputDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        "2015-10-15",
        dummyDateSequence.selectDateOrSame(inputDate, SequenceDate.base(1)).toString());
  }

  /**
   * Test {@link DateSequence#selectDateOrSame(LocalDate, SequenceDate)}.
   *
   * <ul>
   *   <li>When base {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#selectDateOrSame(LocalDate, SequenceDate)}
   */
  @Test
  @DisplayName(
      "Test selectDateOrSame(LocalDate, SequenceDate); when base YearMonth with '1970' and 'JANUARY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.selectDateOrSame(LocalDate, SequenceDate)"})
  void testSelectDateOrSame_whenBaseYearMonthWith1970AndJanuary() {
    // Arrange
    DummyDateSequence dummyDateSequence = new DummyDateSequence();
    LocalDate inputDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        "2015-10-15",
        dummyDateSequence
            .selectDateOrSame(inputDate, SequenceDate.base(YearMonth.of(1970, Month.JANUARY)))
            .toString());
  }

  /**
   * Test {@link DateSequence#selectDateOrSame(LocalDate, SequenceDate)}.
   *
   * <ul>
   *   <li>When full one.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link DateSequence#selectDateOrSame(LocalDate, SequenceDate)}
   */
  @Test
  @DisplayName(
      "Test selectDateOrSame(LocalDate, SequenceDate); when full one; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate DateSequence.selectDateOrSame(LocalDate, SequenceDate)"})
  void testSelectDateOrSame_whenFullOne_thenReturnToStringIs20151015() {
    // Arrange
    DummyDateSequence dummyDateSequence = new DummyDateSequence();
    LocalDate inputDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        "2015-10-15",
        dummyDateSequence.selectDateOrSame(inputDate, SequenceDate.full(1)).toString());
  }
}
