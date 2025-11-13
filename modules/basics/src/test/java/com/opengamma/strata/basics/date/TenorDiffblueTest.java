package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TenorDiffblueTest {
  /**
   * Test {@link Tenor#ofDays(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toString is {@code 1D}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#ofDays(int)}
   */
  @Test
  @DisplayName("Test ofDays(int); when one; then return toString is '1D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.ofDays(int)"})
  void testOfDays_whenOne_thenReturnToStringIs1d() {
    // Arrange and Act
    Tenor actualOfDaysResult = Tenor.ofDays(1);

    // Assert
    assertEquals("1D", actualOfDaysResult.toString());
    assertEquals(1, actualOfDaysResult.getPeriod().getDays());
    assertFalse(actualOfDaysResult.isWeekBased());
  }

  /**
   * Test {@link Tenor#ofDays(int)}.
   *
   * <ul>
   *   <li>When seven.
   *   <li>Then return toString is {@code 1W}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#ofDays(int)}
   */
  @Test
  @DisplayName("Test ofDays(int); when seven; then return toString is '1W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.ofDays(int)"})
  void testOfDays_whenSeven_thenReturnToStringIs1w() {
    // Arrange and Act
    Tenor actualOfDaysResult = Tenor.ofDays(7);

    // Assert
    assertEquals("1W", actualOfDaysResult.toString());
    assertEquals(7, actualOfDaysResult.getPeriod().getDays());
    assertTrue(actualOfDaysResult.isWeekBased());
  }

  /**
   * Test {@link Tenor#ofWeeks(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Units size is three.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#ofWeeks(int)}
   */
  @Test
  @DisplayName("Test ofWeeks(int); when one; then return Units size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.ofWeeks(int)"})
  void testOfWeeks_whenOne_thenReturnUnitsSizeIsThree() {
    // Arrange and Act
    Tenor actualOfWeeksResult = Tenor.ofWeeks(1);

    // Assert
    List<TemporalUnit> units = actualOfWeeksResult.getUnits();
    assertEquals(3, units.size());
    TemporalUnit getResult = units.get(0);
    assertTrue(getResult instanceof ChronoUnit);
    TemporalUnit getResult2 = units.get(1);
    assertTrue(getResult2 instanceof ChronoUnit);
    TemporalUnit getResult3 = units.get(2);
    assertTrue(getResult3 instanceof ChronoUnit);
    assertEquals("1W", actualOfWeeksResult.toString());
    Period period = actualOfWeeksResult.getPeriod();
    assertEquals(0, period.getMonths());
    assertEquals(0, period.getYears());
    assertEquals(0L, period.toTotalMonths());
    assertEquals(7, period.getDays());
    assertEquals(ChronoUnit.DAYS, getResult3);
    assertEquals(ChronoUnit.MONTHS, getResult2);
    assertEquals(ChronoUnit.YEARS, getResult);
    assertFalse(actualOfWeeksResult.isMonthBased());
    assertFalse(period.isNegative());
    assertFalse(period.isZero());
    assertTrue(actualOfWeeksResult.isWeekBased());
    assertSame(units, period.getUnits());
  }

  /**
   * Test {@link Tenor#ofMonths(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Units size is three.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#ofMonths(int)}
   */
  @Test
  @DisplayName("Test ofMonths(int); when one; then return Units size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.ofMonths(int)"})
  void testOfMonths_whenOne_thenReturnUnitsSizeIsThree() {
    // Arrange and Act
    Tenor actualOfMonthsResult = Tenor.ofMonths(1);

    // Assert
    List<TemporalUnit> units = actualOfMonthsResult.getUnits();
    assertEquals(3, units.size());
    TemporalUnit getResult = units.get(0);
    assertTrue(getResult instanceof ChronoUnit);
    TemporalUnit getResult2 = units.get(1);
    assertTrue(getResult2 instanceof ChronoUnit);
    TemporalUnit getResult3 = units.get(2);
    assertTrue(getResult3 instanceof ChronoUnit);
    assertEquals("1M", actualOfMonthsResult.toString());
    Period period = actualOfMonthsResult.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0, period.getYears());
    assertEquals(1, period.getMonths());
    assertEquals(1L, period.toTotalMonths());
    assertEquals(ChronoUnit.DAYS, getResult3);
    assertEquals(ChronoUnit.MONTHS, getResult2);
    assertEquals(ChronoUnit.YEARS, getResult);
    assertFalse(actualOfMonthsResult.isWeekBased());
    assertFalse(period.isNegative());
    assertFalse(period.isZero());
    assertTrue(actualOfMonthsResult.isMonthBased());
    assertSame(units, period.getUnits());
  }

  /**
   * Test {@link Tenor#ofYears(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Units size is three.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#ofYears(int)}
   */
  @Test
  @DisplayName("Test ofYears(int); when one; then return Units size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.ofYears(int)"})
  void testOfYears_whenOne_thenReturnUnitsSizeIsThree() {
    // Arrange and Act
    Tenor actualOfYearsResult = Tenor.ofYears(1);

    // Assert
    List<TemporalUnit> units = actualOfYearsResult.getUnits();
    assertEquals(3, units.size());
    TemporalUnit getResult = units.get(0);
    assertTrue(getResult instanceof ChronoUnit);
    TemporalUnit getResult2 = units.get(1);
    assertTrue(getResult2 instanceof ChronoUnit);
    TemporalUnit getResult3 = units.get(2);
    assertTrue(getResult3 instanceof ChronoUnit);
    assertEquals("1Y", actualOfYearsResult.toString());
    Period period = actualOfYearsResult.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0, period.getMonths());
    assertEquals(1, period.getYears());
    assertEquals(12L, period.toTotalMonths());
    assertEquals(ChronoUnit.DAYS, getResult3);
    assertEquals(ChronoUnit.MONTHS, getResult2);
    assertEquals(ChronoUnit.YEARS, getResult);
    assertFalse(actualOfYearsResult.isWeekBased());
    assertFalse(period.isNegative());
    assertFalse(period.isZero());
    assertTrue(actualOfYearsResult.isMonthBased());
    assertSame(units, period.getUnits());
  }

  /**
   * Test {@link Tenor#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42D}.
   *   <li>Then return toString is {@code 6W}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '42D'; then return toString is '6W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.parse(String)"})
  void testParse_when42d_thenReturnToStringIs6w() {
    // Arrange and Act
    Tenor actualParseResult = Tenor.parse("42D");

    // Assert
    assertEquals("6W", actualParseResult.toString());
    Period period = actualParseResult.getPeriod();
    assertEquals(0, period.getMonths());
    assertEquals(0L, period.toTotalMonths());
    assertEquals(42, period.getDays());
    assertFalse(actualParseResult.isMonthBased());
    assertTrue(actualParseResult.isWeekBased());
  }

  /**
   * Test {@link Tenor#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42M}.
   *   <li>Then return toString is {@code 42M}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '42M'; then return toString is '42M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.parse(String)"})
  void testParse_when42m_thenReturnToStringIs42m() {
    // Arrange and Act
    Tenor actualParseResult = Tenor.parse("42M");

    // Assert
    assertEquals("42M", actualParseResult.toString());
    Period period = actualParseResult.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(42, period.getMonths());
    assertEquals(42L, period.toTotalMonths());
    assertFalse(actualParseResult.isWeekBased());
    assertTrue(actualParseResult.isMonthBased());
  }

  /**
   * Test {@link Tenor#parse(String)}.
   *
   * <ul>
   *   <li>When {@code P}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'P'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.parse(String)"})
  void testParse_whenP_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Tenor.parse("P"));
  }

  /**
   * Test {@link Tenor#parse(String)}.
   *
   * <ul>
   *   <li>When {@code To Parse}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'To Parse'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.parse(String)"})
  void testParse_whenToParse_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Tenor.parse("To Parse"));
  }

  /**
   * Test {@link Tenor#normalized()}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_10M}.
   *   <li>Then return {@link Tenor#TENOR_10M}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#normalized()}
   */
  @Test
  @DisplayName("Test normalized(); given TENOR_10M; then return TENOR_10M")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.normalized()"})
  void testNormalized_givenTenor_10m_thenReturnTenor_10m() {
    // Arrange, Act and Assert
    assertSame(Tenor.TENOR_10M, Tenor.TENOR_10M.normalized());
  }

  /**
   * Test {@link Tenor#normalized()}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_12M}.
   *   <li>Then return {@link Tenor#TENOR_12M}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#normalized()}
   */
  @Test
  @DisplayName("Test normalized(); given TENOR_12M; then return TENOR_12M")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.normalized()"})
  void testNormalized_givenTenor_12m_thenReturnTenor_12m() {
    // Arrange, Act and Assert
    assertSame(Tenor.TENOR_12M, Tenor.TENOR_12M.normalized());
  }

  /**
   * Test {@link Tenor#normalized()}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_13W}.
   *   <li>Then return {@link Tenor#TENOR_13W}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#normalized()}
   */
  @Test
  @DisplayName("Test normalized(); given TENOR_13W; then return TENOR_13W")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.normalized()"})
  void testNormalized_givenTenor_13w_thenReturnTenor_13w() {
    // Arrange, Act and Assert
    assertSame(Tenor.TENOR_13W, Tenor.TENOR_13W.normalized());
  }

  /**
   * Test {@link Tenor#normalized()}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_15M}.
   *   <li>Then return toString is {@code 1Y3M}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#normalized()}
   */
  @Test
  @DisplayName("Test normalized(); given TENOR_15M; then return toString is '1Y3M'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor Tenor.normalized()"})
  void testNormalized_givenTenor_15m_thenReturnToStringIs1y3m() {
    // Arrange and Act
    Tenor actualNormalizedResult = Tenor.TENOR_15M.normalized();

    // Assert
    assertEquals("1Y3M", actualNormalizedResult.toString());
    Period period = actualNormalizedResult.getPeriod();
    assertEquals(1, period.getYears());
    assertEquals(15L, period.toTotalMonths());
    assertEquals(3, period.getMonths());
  }

  /**
   * Test {@link Tenor#isWeekBased()}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_1D}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#isWeekBased()}
   */
  @Test
  @DisplayName("Test isWeekBased(); given TENOR_1D; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Tenor.isWeekBased()"})
  void testIsWeekBased_givenTenor_1d_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Tenor.TENOR_1D.isWeekBased());
  }

  /**
   * Test {@link Tenor#isWeekBased()}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_10M}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#isWeekBased()}
   */
  @Test
  @DisplayName("Test isWeekBased(); given TENOR_10M; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Tenor.isWeekBased()"})
  void testIsWeekBased_givenTenor_10m_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Tenor.TENOR_10M.isWeekBased());
  }

  /**
   * Test {@link Tenor#isWeekBased()}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_13W}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#isWeekBased()}
   */
  @Test
  @DisplayName("Test isWeekBased(); given TENOR_13W; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Tenor.isWeekBased()"})
  void testIsWeekBased_givenTenor_13w_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Tenor.TENOR_13W.isWeekBased());
  }

  /**
   * Test {@link Tenor#isMonthBased()}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_10M}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#isMonthBased()}
   */
  @Test
  @DisplayName("Test isMonthBased(); given TENOR_10M; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Tenor.isMonthBased()"})
  void testIsMonthBased_givenTenor_10m_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Tenor.TENOR_10M.isMonthBased());
  }

  /**
   * Test {@link Tenor#isMonthBased()}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_13W}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#isMonthBased()}
   */
  @Test
  @DisplayName("Test isMonthBased(); given TENOR_13W; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Tenor.isMonthBased()"})
  void testIsMonthBased_givenTenor_13w_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Tenor.TENOR_13W.isMonthBased());
  }

  /**
   * Test {@link Tenor#getUnits()}.
   *
   * <p>Method under test: {@link Tenor#getUnits()}
   */
  @Test
  @DisplayName("Test getUnits()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List Tenor.getUnits()"})
  void testGetUnits() {
    // Arrange and Act
    List<TemporalUnit> actualUnits = Tenor.TENOR_10M.getUnits();

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
   * Test {@link Tenor#compareTo(Tenor)} with {@code Tenor}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_10M}.
   *   <li>When {@link Tenor#TENOR_10M}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#compareTo(Tenor)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Tenor) with 'Tenor'; given TENOR_10M; when TENOR_10M; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Tenor.compareTo(Tenor)"})
  void testCompareToWithTenor_givenTenor_10m_whenTenor_10m_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, Tenor.TENOR_10M.compareTo(Tenor.TENOR_10M));
  }

  /**
   * Test {@link Tenor#compareTo(Tenor)} with {@code Tenor}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_10M}.
   *   <li>When {@link Tenor#TENOR_13W}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#compareTo(Tenor)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Tenor) with 'Tenor'; given TENOR_10M; when TENOR_13W; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Tenor.compareTo(Tenor)"})
  void testCompareToWithTenor_givenTenor_10m_whenTenor_13w_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, Tenor.TENOR_10M.compareTo(Tenor.TENOR_13W));
  }

  /**
   * Test {@link Tenor#compareTo(Tenor)} with {@code Tenor}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_13W}.
   *   <li>When {@link Tenor#TENOR_10M}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#compareTo(Tenor)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Tenor) with 'Tenor'; given TENOR_13W; when TENOR_10M; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Tenor.compareTo(Tenor)"})
  void testCompareToWithTenor_givenTenor_13w_whenTenor_10m_thenReturnMinusOne() {
    // Arrange, Act and Assert
    assertEquals(-1, Tenor.TENOR_13W.compareTo(Tenor.TENOR_10M));
  }

  /**
   * Test {@link Tenor#compareTo(Tenor)} with {@code Tenor}.
   *
   * <ul>
   *   <li>Given {@link Tenor#TENOR_13W}.
   *   <li>When {@link Tenor#TENOR_13W}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#compareTo(Tenor)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Tenor) with 'Tenor'; given TENOR_13W; when TENOR_13W; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Tenor.compareTo(Tenor)"})
  void testCompareToWithTenor_givenTenor_13w_whenTenor_13w_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, Tenor.TENOR_13W.compareTo(Tenor.TENOR_13W));
  }

  /**
   * Test {@link Tenor#equals(Object)}, and {@link Tenor#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Tenor#equals(Object)}
   *   <li>{@link Tenor#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Tenor.equals(Object)", "int Tenor.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Tenor tenor = Tenor.TENOR_10M;
    Tenor tenor2 = Tenor.TENOR_10M;

    // Act and Assert
    assertEquals(tenor, tenor2);
    assertEquals(tenor.hashCode(), tenor2.hashCode());
  }

  /**
   * Test {@link Tenor#equals(Object)}, and {@link Tenor#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Tenor#equals(Object)}
   *   <li>{@link Tenor#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Tenor.equals(Object)", "int Tenor.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Tenor tenor = Tenor.TENOR_10M;

    // Act and Assert
    assertEquals(tenor, tenor);
    int expectedHashCodeResult = tenor.hashCode();
    assertEquals(expectedHashCodeResult, tenor.hashCode());
  }

  /**
   * Test {@link Tenor#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Tenor.equals(Object)", "int Tenor.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Tenor.TENOR_10Y, Tenor.TENOR_10M);
  }

  /**
   * Test {@link Tenor#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Tenor.equals(Object)", "int Tenor.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Tenor.TENOR_10M, null);
  }

  /**
   * Test {@link Tenor#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Tenor#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Tenor.equals(Object)", "int Tenor.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Tenor.TENOR_10M, "Different type to Tenor");
  }
}
