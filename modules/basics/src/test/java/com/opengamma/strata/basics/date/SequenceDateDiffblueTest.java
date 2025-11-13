package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DateSequenceTest.DummyDateSequence;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.util.Map;
import java.util.Optional;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SequenceDateDiffblueTest {
  /**
   * Test {@link SequenceDate#base(Period, int)} with {@code minimumPeriod}, {@code sequenceNumber}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return SequenceNumber is ten.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#base(Period, int)}
   */
  @Test
  @DisplayName(
      "Test base(Period, int) with 'minimumPeriod', 'sequenceNumber'; when ten; then return SequenceNumber is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.base(Period, int)"})
  void testBaseWithMinimumPeriodSequenceNumber_whenTen_thenReturnSequenceNumberIsTen() {
    // Arrange and Act
    SequenceDate actualBaseResult = SequenceDate.base((Period) null, 10);

    // Assert
    assertEquals(10, actualBaseResult.getSequenceNumber());
    assertFalse(actualBaseResult.isFullSequence());
    Optional<Period> minimumPeriod = actualBaseResult.getMinimumPeriod();
    assertFalse(minimumPeriod.isPresent());
    assertSame(minimumPeriod, actualBaseResult.getYearMonth());
  }

  /**
   * Test {@link SequenceDate#base(int)} with {@code sequenceNumber}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return SequenceNumber is ten.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#base(int)}
   */
  @Test
  @DisplayName("Test base(int) with 'sequenceNumber'; when ten; then return SequenceNumber is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.base(int)"})
  void testBaseWithSequenceNumber_whenTen_thenReturnSequenceNumberIsTen() {
    // Arrange and Act
    SequenceDate actualBaseResult = SequenceDate.base(10);

    // Assert
    assertEquals(10, actualBaseResult.getSequenceNumber());
    assertFalse(actualBaseResult.isFullSequence());
    Optional<Period> minimumPeriod = actualBaseResult.getMinimumPeriod();
    assertFalse(minimumPeriod.isPresent());
    assertSame(minimumPeriod, actualBaseResult.getYearMonth());
  }

  /**
   * Test {@link SequenceDate#base(YearMonth, int)} with {@code yearMonth}, {@code sequenceNumber}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return SequenceNumber is one.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#base(YearMonth, int)}
   */
  @Test
  @DisplayName(
      "Test base(YearMonth, int) with 'yearMonth', 'sequenceNumber'; when one; then return SequenceNumber is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.base(YearMonth, int)"})
  void testBaseWithYearMonthSequenceNumber_whenOne_thenReturnSequenceNumberIsOne() {
    // Arrange and Act
    SequenceDate actualBaseResult = SequenceDate.base((YearMonth) null, 1);

    // Assert
    assertEquals(1, actualBaseResult.getSequenceNumber());
    assertFalse(actualBaseResult.isFullSequence());
    Optional<Period> minimumPeriod = actualBaseResult.getMinimumPeriod();
    assertFalse(minimumPeriod.isPresent());
    assertSame(minimumPeriod, actualBaseResult.getYearMonth());
  }

  /**
   * Test {@link SequenceDate#base(YearMonth, int)} with {@code yearMonth}, {@code sequenceNumber}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return SequenceNumber is ten.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#base(YearMonth, int)}
   */
  @Test
  @DisplayName(
      "Test base(YearMonth, int) with 'yearMonth', 'sequenceNumber'; when ten; then return SequenceNumber is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.base(YearMonth, int)"})
  void testBaseWithYearMonthSequenceNumber_whenTen_thenReturnSequenceNumberIsTen() {
    // Arrange
    YearMonth yearMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    SequenceDate actualBaseResult = SequenceDate.base(yearMonth, 10);

    // Assert
    assertEquals(10, actualBaseResult.getSequenceNumber());
    assertFalse(actualBaseResult.isFullSequence());
    assertFalse(actualBaseResult.getMinimumPeriod().isPresent());
    Optional<YearMonth> yearMonth2 = actualBaseResult.getYearMonth();
    assertTrue(yearMonth2.isPresent());
    assertSame(yearMonth, yearMonth2.get());
  }

  /**
   * Test {@link SequenceDate#base(YearMonth)} with {@code yearMonth}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return YearMonth is MinimumPeriod.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#base(YearMonth)}
   */
  @Test
  @DisplayName(
      "Test base(YearMonth) with 'yearMonth'; when 'null'; then return YearMonth is MinimumPeriod")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.base(YearMonth)"})
  void testBaseWithYearMonth_whenNull_thenReturnYearMonthIsMinimumPeriod() {
    // Arrange and Act
    SequenceDate actualBaseResult = SequenceDate.base(null);

    // Assert
    assertEquals(1, actualBaseResult.getSequenceNumber());
    assertFalse(actualBaseResult.isFullSequence());
    Optional<Period> minimumPeriod = actualBaseResult.getMinimumPeriod();
    assertFalse(minimumPeriod.isPresent());
    assertSame(minimumPeriod, actualBaseResult.getYearMonth());
  }

  /**
   * Test {@link SequenceDate#base(YearMonth)} with {@code yearMonth}.
   *
   * <ul>
   *   <li>When {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   *   <li>Then return YearMonth Present.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#base(YearMonth)}
   */
  @Test
  @DisplayName(
      "Test base(YearMonth) with 'yearMonth'; when YearMonth with '1970' and 'JANUARY'; then return YearMonth Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.base(YearMonth)"})
  void testBaseWithYearMonth_whenYearMonthWith1970AndJanuary_thenReturnYearMonthPresent() {
    // Arrange
    YearMonth yearMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    SequenceDate actualBaseResult = SequenceDate.base(yearMonth);

    // Assert
    assertEquals(1, actualBaseResult.getSequenceNumber());
    assertFalse(actualBaseResult.isFullSequence());
    assertFalse(actualBaseResult.getMinimumPeriod().isPresent());
    Optional<YearMonth> yearMonth2 = actualBaseResult.getYearMonth();
    assertTrue(yearMonth2.isPresent());
    assertSame(yearMonth, yearMonth2.get());
  }

  /**
   * Test {@link SequenceDate#full(Period, int)} with {@code minimumPeriod}, {@code sequenceNumber}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return SequenceNumber is ten.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#full(Period, int)}
   */
  @Test
  @DisplayName(
      "Test full(Period, int) with 'minimumPeriod', 'sequenceNumber'; when ten; then return SequenceNumber is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.full(Period, int)"})
  void testFullWithMinimumPeriodSequenceNumber_whenTen_thenReturnSequenceNumberIsTen() {
    // Arrange and Act
    SequenceDate actualFullResult = SequenceDate.full((Period) null, 10);

    // Assert
    assertEquals(10, actualFullResult.getSequenceNumber());
    Optional<Period> minimumPeriod = actualFullResult.getMinimumPeriod();
    assertFalse(minimumPeriod.isPresent());
    assertTrue(actualFullResult.isFullSequence());
    assertSame(minimumPeriod, actualFullResult.getYearMonth());
  }

  /**
   * Test {@link SequenceDate#full(int)} with {@code sequenceNumber}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return SequenceNumber is ten.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#full(int)}
   */
  @Test
  @DisplayName("Test full(int) with 'sequenceNumber'; when ten; then return SequenceNumber is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.full(int)"})
  void testFullWithSequenceNumber_whenTen_thenReturnSequenceNumberIsTen() {
    // Arrange and Act
    SequenceDate actualFullResult = SequenceDate.full(10);

    // Assert
    assertEquals(10, actualFullResult.getSequenceNumber());
    Optional<Period> minimumPeriod = actualFullResult.getMinimumPeriod();
    assertFalse(minimumPeriod.isPresent());
    assertTrue(actualFullResult.isFullSequence());
    assertSame(minimumPeriod, actualFullResult.getYearMonth());
  }

  /**
   * Test {@link SequenceDate#full(YearMonth, int)} with {@code yearMonth}, {@code sequenceNumber}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return SequenceNumber is one.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#full(YearMonth, int)}
   */
  @Test
  @DisplayName(
      "Test full(YearMonth, int) with 'yearMonth', 'sequenceNumber'; when one; then return SequenceNumber is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.full(YearMonth, int)"})
  void testFullWithYearMonthSequenceNumber_whenOne_thenReturnSequenceNumberIsOne() {
    // Arrange and Act
    SequenceDate actualFullResult = SequenceDate.full((YearMonth) null, 1);

    // Assert
    assertEquals(1, actualFullResult.getSequenceNumber());
    Optional<Period> minimumPeriod = actualFullResult.getMinimumPeriod();
    assertFalse(minimumPeriod.isPresent());
    assertTrue(actualFullResult.isFullSequence());
    assertSame(minimumPeriod, actualFullResult.getYearMonth());
  }

  /**
   * Test {@link SequenceDate#full(YearMonth, int)} with {@code yearMonth}, {@code sequenceNumber}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return SequenceNumber is ten.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#full(YearMonth, int)}
   */
  @Test
  @DisplayName(
      "Test full(YearMonth, int) with 'yearMonth', 'sequenceNumber'; when ten; then return SequenceNumber is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.full(YearMonth, int)"})
  void testFullWithYearMonthSequenceNumber_whenTen_thenReturnSequenceNumberIsTen() {
    // Arrange
    YearMonth yearMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    SequenceDate actualFullResult = SequenceDate.full(yearMonth, 10);

    // Assert
    assertEquals(10, actualFullResult.getSequenceNumber());
    assertFalse(actualFullResult.getMinimumPeriod().isPresent());
    assertTrue(actualFullResult.isFullSequence());
    Optional<YearMonth> yearMonth2 = actualFullResult.getYearMonth();
    assertTrue(yearMonth2.isPresent());
    assertSame(yearMonth, yearMonth2.get());
  }

  /**
   * Test {@link SequenceDate#full(YearMonth)} with {@code yearMonth}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return YearMonth is MinimumPeriod.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#full(YearMonth)}
   */
  @Test
  @DisplayName(
      "Test full(YearMonth) with 'yearMonth'; when 'null'; then return YearMonth is MinimumPeriod")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.full(YearMonth)"})
  void testFullWithYearMonth_whenNull_thenReturnYearMonthIsMinimumPeriod() {
    // Arrange and Act
    SequenceDate actualFullResult = SequenceDate.full(null);

    // Assert
    assertEquals(1, actualFullResult.getSequenceNumber());
    Optional<Period> minimumPeriod = actualFullResult.getMinimumPeriod();
    assertFalse(minimumPeriod.isPresent());
    assertTrue(actualFullResult.isFullSequence());
    assertSame(minimumPeriod, actualFullResult.getYearMonth());
  }

  /**
   * Test {@link SequenceDate#full(YearMonth)} with {@code yearMonth}.
   *
   * <ul>
   *   <li>When {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   *   <li>Then return YearMonth Present.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#full(YearMonth)}
   */
  @Test
  @DisplayName(
      "Test full(YearMonth) with 'yearMonth'; when YearMonth with '1970' and 'JANUARY'; then return YearMonth Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SequenceDate SequenceDate.full(YearMonth)"})
  void testFullWithYearMonth_whenYearMonthWith1970AndJanuary_thenReturnYearMonthPresent() {
    // Arrange
    YearMonth yearMonth = YearMonth.of(1970, Month.JANUARY);

    // Act
    SequenceDate actualFullResult = SequenceDate.full(yearMonth);

    // Assert
    assertEquals(1, actualFullResult.getSequenceNumber());
    assertFalse(actualFullResult.getMinimumPeriod().isPresent());
    assertTrue(actualFullResult.isFullSequence());
    Optional<YearMonth> yearMonth2 = actualFullResult.getYearMonth();
    assertTrue(yearMonth2.isPresent());
    assertSame(yearMonth, yearMonth2.get());
  }

  /**
   * Test {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}.
   *
   * <ul>
   *   <li>Given base one.
   *   <li>When {@link DummyDateSequence} (default constructor).
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, DateSequence, boolean); given base one; when DummyDateSequence (default constructor); then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate SequenceDate.selectDate(LocalDate, DateSequence, boolean)"})
  void testSelectDate_givenBaseOne_whenDummyDateSequence_thenReturnToStringIs20151015() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(1);
    LocalDate inputDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        "2015-10-15", baseResult.selectDate(inputDate, new DummyDateSequence(), true).toString());
  }

  /**
   * Test {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}.
   *
   * <ul>
   *   <li>Given base ten.
   *   <li>When {@code false}.
   *   <li>Then return toString is {@code 1970-11-01}.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, DateSequence, boolean); given base ten; when 'false'; then return toString is '1970-11-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate SequenceDate.selectDate(LocalDate, DateSequence, boolean)"})
  void testSelectDate_givenBaseTen_whenFalse_thenReturnToStringIs19701101() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(10);

    // Act and Assert
    assertEquals(
        "1970-11-01",
        baseResult
            .selectDate(LocalDate.of(1970, 1, 1), DateSequences.MONTHLY_1ST, false)
            .toString());
  }

  /**
   * Test {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}.
   *
   * <ul>
   *   <li>Given base ten.
   *   <li>When {@link DateSequences#MONTHLY_1ST}.
   *   <li>Then return toString is {@code 1970-10-01}.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, DateSequence, boolean); given base ten; when MONTHLY_1ST; then return toString is '1970-10-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate SequenceDate.selectDate(LocalDate, DateSequence, boolean)"})
  void testSelectDate_givenBaseTen_whenMonthly_1st_thenReturnToStringIs19701001() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(10);

    // Act and Assert
    assertEquals(
        "1970-10-01",
        baseResult
            .selectDate(LocalDate.of(1970, 1, 1), DateSequences.MONTHLY_1ST, true)
            .toString());
  }

  /**
   * Test {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}.
   *
   * <ul>
   *   <li>Given base {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, DateSequence, boolean); given base YearMonth with '1970' and 'JANUARY'; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate SequenceDate.selectDate(LocalDate, DateSequence, boolean)"})
  void testSelectDate_givenBaseYearMonthWith1970AndJanuary_thenReturnToStringIs19700101() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-01",
        SequenceDate.base(YearMonth.of(1970, Month.JANUARY))
            .selectDate(LocalDate.of(1970, 1, 1), DateSequences.MONTHLY_1ST, true)
            .toString());
  }

  /**
   * Test {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}.
   *
   * <ul>
   *   <li>Given base {@link YearMonth} with {@code 1970} and {@code JANUARY}.
   *   <li>Then return toString is {@code 2015-10-15}.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, DateSequence, boolean); given base YearMonth with '1970' and 'JANUARY'; then return toString is '2015-10-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate SequenceDate.selectDate(LocalDate, DateSequence, boolean)"})
  void testSelectDate_givenBaseYearMonthWith1970AndJanuary_thenReturnToStringIs20151015() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(YearMonth.of(1970, Month.JANUARY));
    LocalDate inputDate = LocalDate.of(1970, 1, 1);

    // Act and Assert
    assertEquals(
        "2015-10-15", baseResult.selectDate(inputDate, new DummyDateSequence(), true).toString());
  }

  /**
   * Test {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}.
   *
   * <ul>
   *   <li>Given full ten.
   *   <li>When {@link DateSequences#MONTHLY_1ST}.
   *   <li>Then return toString is {@code 1970-10-01}.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, DateSequence, boolean); given full ten; when MONTHLY_1ST; then return toString is '1970-10-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate SequenceDate.selectDate(LocalDate, DateSequence, boolean)"})
  void testSelectDate_givenFullTen_whenMonthly_1st_thenReturnToStringIs19701001() {
    // Arrange
    SequenceDate fullResult = SequenceDate.full(10);

    // Act and Assert
    assertEquals(
        "1970-10-01",
        fullResult
            .selectDate(LocalDate.of(1970, 1, 1), DateSequences.MONTHLY_1ST, true)
            .toString());
  }

  /**
   * Test {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}.
   *
   * <ul>
   *   <li>When {@link DateSequences#QUARTERLY_IMM_3_SERIAL}.
   *   <li>Then return toString is {@code 1972-06-21}.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#selectDate(LocalDate, DateSequence, boolean)}
   */
  @Test
  @DisplayName(
      "Test selectDate(LocalDate, DateSequence, boolean); when QUARTERLY_IMM_3_SERIAL; then return toString is '1972-06-21'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate SequenceDate.selectDate(LocalDate, DateSequence, boolean)"})
  void testSelectDate_whenQuarterly_imm_3_serial_thenReturnToStringIs19720621() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(10);

    // Act and Assert
    assertEquals(
        "1972-06-21",
        baseResult
            .selectDate(LocalDate.of(1970, 1, 1), DateSequences.QUARTERLY_IMM_3_SERIAL, true)
            .toString());
  }

  /**
   * Test {@link SequenceDate#meta()}.
   *
   * <p>Method under test: {@link SequenceDate#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SequenceDate.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SequenceDate> actualMetaResult = SequenceDate.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("fullSequence"));
    assertTrue(metaPropertyMapResult.containsKey("minimumPeriod"));
    assertTrue(metaPropertyMapResult.containsKey("sequenceNumber"));
    assertTrue(metaPropertyMapResult.containsKey("yearMonth"));
    assertTrue(actualMetaResult.isBuildable());
    Class<SequenceDate> expectedBeanTypeResult = SequenceDate.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SequenceDate#metaBean()}.
   *
   * <p>Method under test: {@link SequenceDate#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SequenceDate.metaBean()"})
  void testMetaBean() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(10);

    // Act
    TypedMetaBean<SequenceDate> actualMetaBeanResult = baseResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(4, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("fullSequence"));
    assertTrue(metaPropertyMapResult.containsKey("minimumPeriod"));
    assertTrue(metaPropertyMapResult.containsKey("sequenceNumber"));
    assertTrue(metaPropertyMapResult.containsKey("yearMonth"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SequenceDate> expectedBeanTypeResult = SequenceDate.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link SequenceDate#getYearMonth()}.
   *
   * <p>Method under test: {@link SequenceDate#getYearMonth()}
   */
  @Test
  @DisplayName("Test getYearMonth()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional SequenceDate.getYearMonth()"})
  void testGetYearMonth() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(10);

    // Act and Assert
    assertFalse(baseResult.getYearMonth().isPresent());
  }

  /**
   * Test {@link SequenceDate#getMinimumPeriod()}.
   *
   * <p>Method under test: {@link SequenceDate#getMinimumPeriod()}
   */
  @Test
  @DisplayName("Test getMinimumPeriod()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional SequenceDate.getMinimumPeriod()"})
  void testGetMinimumPeriod() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(10);

    // Act and Assert
    assertFalse(baseResult.getMinimumPeriod().isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SequenceDate#toString()}
   *   <li>{@link SequenceDate#getSequenceNumber()}
   *   <li>{@link SequenceDate#isFullSequence()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "int SequenceDate.getSequenceNumber()",
    "boolean SequenceDate.isFullSequence()",
    "String SequenceDate.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(10);

    // Act
    String actualToStringResult = baseResult.toString();
    int actualSequenceNumber = baseResult.getSequenceNumber();

    // Assert
    assertEquals(
        "SequenceDate{yearMonth=null, minimumPeriod=null, sequenceNumber=10, fullSequence=false}",
        actualToStringResult);
    assertEquals(10, actualSequenceNumber);
    assertFalse(baseResult.isFullSequence());
  }

  /**
   * Test {@link SequenceDate#equals(Object)}, and {@link SequenceDate#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SequenceDate#equals(Object)}
   *   <li>{@link SequenceDate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SequenceDate.equals(Object)", "int SequenceDate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(10);
    SequenceDate baseResult2 = SequenceDate.base(10);

    // Act and Assert
    assertEquals(baseResult, baseResult2);
    assertEquals(baseResult.hashCode(), baseResult2.hashCode());
  }

  /**
   * Test {@link SequenceDate#equals(Object)}, and {@link SequenceDate#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SequenceDate#equals(Object)}
   *   <li>{@link SequenceDate#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SequenceDate.equals(Object)", "int SequenceDate.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(10);

    // Act and Assert
    assertEquals(baseResult, baseResult);
    int expectedHashCodeResult = baseResult.hashCode();
    assertEquals(expectedHashCodeResult, baseResult.hashCode());
  }

  /**
   * Test {@link SequenceDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SequenceDate.equals(Object)", "int SequenceDate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SequenceDate fullResult = SequenceDate.full(10);

    // Act and Assert
    assertNotEquals(fullResult, SequenceDate.base(10));
  }

  /**
   * Test {@link SequenceDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SequenceDate.equals(Object)", "int SequenceDate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(YearMonth.of(1970, Month.JANUARY));

    // Act and Assert
    assertNotEquals(baseResult, SequenceDate.base(10));
  }

  /**
   * Test {@link SequenceDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SequenceDate.equals(Object)", "int SequenceDate.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(1);

    // Act and Assert
    assertNotEquals(baseResult, SequenceDate.base(10));
  }

  /**
   * Test {@link SequenceDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SequenceDate.equals(Object)", "int SequenceDate.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(10);

    // Act and Assert
    assertNotEquals(baseResult, null);
  }

  /**
   * Test {@link SequenceDate#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SequenceDate#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SequenceDate.equals(Object)", "int SequenceDate.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    SequenceDate baseResult = SequenceDate.base(10);

    // Act and Assert
    assertNotEquals(baseResult, "Different type to SequenceDate");
  }
}
