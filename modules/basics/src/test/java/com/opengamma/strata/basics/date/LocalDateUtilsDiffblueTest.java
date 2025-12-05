package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LocalDateUtilsDiffblueTest {
  /**
   * Test {@link LocalDateUtils#doy(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateUtils#doy(LocalDate)}
   */
  @Test
  @DisplayName("Test doy(LocalDate); when LocalDate with '1970' and one and one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LocalDateUtils.doy(LocalDate)"})
  void testDoy_whenLocalDateWith1970AndOneAndOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, LocalDateUtils.doy(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link LocalDateUtils#doy(LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay zero and one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateUtils#doy(LocalDate)}
   */
  @Test
  @DisplayName("Test doy(LocalDate); when ofYearDay zero and one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LocalDateUtils.doy(LocalDate)"})
  void testDoy_whenOfYearDayZeroAndOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, LocalDateUtils.doy(LocalDate.ofYearDay(0, 1)));
  }

  /**
   * Test {@link LocalDateUtils#plusDays(LocalDate, int)}.
   *
   * <ul>
   *   <li>When fifty-nine.
   *   <li>Then return toString is {@code 1970-03-01}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateUtils#plusDays(LocalDate, int)}
   */
  @Test
  @DisplayName(
      "Test plusDays(LocalDate, int); when fifty-nine; then return toString is '1970-03-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate LocalDateUtils.plusDays(LocalDate, int)"})
  void testPlusDays_whenFiftyNine_thenReturnToStringIs19700301() {
    // Arrange, Act and Assert
    assertEquals("1970-03-01", LocalDateUtils.plusDays(LocalDate.of(1970, 1, 1), 59).toString());
  }

  /**
   * Test {@link LocalDateUtils#plusDays(LocalDate, int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return toString is {@code 1969-12-31}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateUtils#plusDays(LocalDate, int)}
   */
  @Test
  @DisplayName(
      "Test plusDays(LocalDate, int); when minus one; then return toString is '1969-12-31'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate LocalDateUtils.plusDays(LocalDate, int)"})
  void testPlusDays_whenMinusOne_thenReturnToStringIs19691231() {
    // Arrange, Act and Assert
    assertEquals("1969-12-31", LocalDateUtils.plusDays(LocalDate.of(1970, 1, 1), -1).toString());
  }

  /**
   * Test {@link LocalDateUtils#plusDays(LocalDate, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toString is {@code 1970-01-02}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateUtils#plusDays(LocalDate, int)}
   */
  @Test
  @DisplayName("Test plusDays(LocalDate, int); when one; then return toString is '1970-01-02'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate LocalDateUtils.plusDays(LocalDate, int)"})
  void testPlusDays_whenOne_thenReturnToStringIs19700102() {
    // Arrange, Act and Assert
    assertEquals("1970-01-02", LocalDateUtils.plusDays(LocalDate.of(1970, 1, 1), 1).toString());
  }

  /**
   * Test {@link LocalDateUtils#plusDays(LocalDate, int)}.
   *
   * <ul>
   *   <li>When thirty-one.
   *   <li>Then return toString is {@code 1970-02-01}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateUtils#plusDays(LocalDate, int)}
   */
  @Test
  @DisplayName(
      "Test plusDays(LocalDate, int); when thirty-one; then return toString is '1970-02-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate LocalDateUtils.plusDays(LocalDate, int)"})
  void testPlusDays_whenThirtyOne_thenReturnToStringIs19700201() {
    // Arrange, Act and Assert
    assertEquals("1970-02-01", LocalDateUtils.plusDays(LocalDate.of(1970, 1, 1), 31).toString());
  }

  /**
   * Test {@link LocalDateUtils#plusDays(LocalDate, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateUtils#plusDays(LocalDate, int)}
   */
  @Test
  @DisplayName("Test plusDays(LocalDate, int); when zero; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate LocalDateUtils.plusDays(LocalDate, int)"})
  void testPlusDays_whenZero_thenReturnToStringIs19700101() {
    // Arrange, Act and Assert
    assertEquals("1970-01-01", LocalDateUtils.plusDays(LocalDate.of(1970, 1, 1), 0).toString());
  }

  /**
   * Test {@link LocalDateUtils#daysBetween(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateUtils#daysBetween(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test daysBetween(LocalDate, LocalDate); when LocalDate with '1970' and one and one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LocalDateUtils.daysBetween(LocalDate, LocalDate)"})
  void testDaysBetween_whenLocalDateWith1970AndOneAndOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0L, LocalDateUtils.daysBetween(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link LocalDateUtils#daysBetween(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay minus one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateUtils#daysBetween(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test daysBetween(LocalDate, LocalDate); when ofEpochDay minus one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long LocalDateUtils.daysBetween(LocalDate, LocalDate)"})
  void testDaysBetween_whenOfEpochDayMinusOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(
        1L, LocalDateUtils.daysBetween(LocalDate.ofEpochDay(-1L), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link LocalDateUtils#stream(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link LocalDateUtils#stream(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test stream(LocalDate, LocalDate); then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream LocalDateUtils.stream(LocalDate, LocalDate)"})
  void testStream_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange and Act
    Stream<LocalDate> actualStreamResult =
        LocalDateUtils.stream(LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1));

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }
}
