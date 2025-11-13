package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.NoHolidaysCalendar.Meta;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NoHolidaysCalendarDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NoHolidaysCalendar#toString()}
   *   <li>{@link NoHolidaysCalendar#getId()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "HolidayCalendarId NoHolidaysCalendar.getId()",
    "String NoHolidaysCalendar.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    NoHolidaysCalendar noHolidaysCalendar = NoHolidaysCalendar.INSTANCE;

    // Act
    String actualToStringResult = noHolidaysCalendar.toString();
    HolidayCalendarId actualId = noHolidaysCalendar.getId();

    // Assert
    assertEquals("HolidayCalendar[NoHolidays]", actualToStringResult);
    assertEquals("NoHolidays", actualId.getName());
    assertEquals("NoHolidays", actualId.toString());
    Class<HolidayCalendar> expectedReferenceDataType = HolidayCalendar.class;
    assertEquals(expectedReferenceDataType, actualId.getReferenceDataType());
  }

  /**
   * Test {@link NoHolidaysCalendar#isHoliday(LocalDate)}.
   *
   * <p>Method under test: {@link NoHolidaysCalendar#isHoliday(LocalDate)}
   */
  @Test
  @DisplayName("Test isHoliday(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NoHolidaysCalendar.isHoliday(LocalDate)"})
  void testIsHoliday() {
    // Arrange, Act and Assert
    assertFalse(NoHolidaysCalendar.INSTANCE.isHoliday(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link NoHolidaysCalendar#isBusinessDay(LocalDate)}.
   *
   * <p>Method under test: {@link NoHolidaysCalendar#isBusinessDay(LocalDate)}
   */
  @Test
  @DisplayName("Test isBusinessDay(LocalDate)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean NoHolidaysCalendar.isBusinessDay(LocalDate)"})
  void testIsBusinessDay() {
    // Arrange, Act and Assert
    assertTrue(NoHolidaysCalendar.INSTANCE.isBusinessDay(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends NoHolidaysCalendar> actualBeanTypeResult = NoHolidaysCalendar.meta().beanType();

    // Assert
    Class<NoHolidaysCalendar> expectedBeanTypeResult = NoHolidaysCalendar.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange, Act and Assert
    assertTrue(NoHolidaysCalendar.meta().metaPropertyMap().isEmpty());
  }

  /**
   * Test {@link NoHolidaysCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>When fifty-nine.
   *   <li>Then return toString is {@code 1970-03-01}.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int); when fifty-nine; then return toString is '1970-03-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.shift(LocalDate, int)"})
  void testShift_whenFiftyNine_thenReturnToStringIs19700301() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-03-01", NoHolidaysCalendar.INSTANCE.shift(LocalDate.of(1970, 1, 1), 59).toString());
  }

  /**
   * Test {@link NoHolidaysCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return toString is {@code 1969-12-31}.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int); when minus one; then return toString is '1969-12-31'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.shift(LocalDate, int)"})
  void testShift_whenMinusOne_thenReturnToStringIs19691231() {
    // Arrange, Act and Assert
    assertEquals(
        "1969-12-31", NoHolidaysCalendar.INSTANCE.shift(LocalDate.of(1970, 1, 1), -1).toString());
  }

  /**
   * Test {@link NoHolidaysCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>When ofEpochDay minus one.
   *   <li>Then return toString is {@code 1970-01-10}.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName(
      "Test shift(LocalDate, int); when ofEpochDay minus one; then return toString is '1970-01-10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.shift(LocalDate, int)"})
  void testShift_whenOfEpochDayMinusOne_thenReturnToStringIs19700110() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-10", NoHolidaysCalendar.INSTANCE.shift(LocalDate.ofEpochDay(-1L), 10).toString());
  }

  /**
   * Test {@link NoHolidaysCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return toString is {@code 1970-01-11}.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int); when ten; then return toString is '1970-01-11'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.shift(LocalDate, int)"})
  void testShift_whenTen_thenReturnToStringIs19700111() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-11", NoHolidaysCalendar.INSTANCE.shift(LocalDate.of(1970, 1, 1), 10).toString());
  }

  /**
   * Test {@link NoHolidaysCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>When thirty-one.
   *   <li>Then return toString is {@code 1970-02-01}.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName("Test shift(LocalDate, int); when thirty-one; then return toString is '1970-02-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.shift(LocalDate, int)"})
  void testShift_whenThirtyOne_thenReturnToStringIs19700201() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-02-01", NoHolidaysCalendar.INSTANCE.shift(LocalDate.of(1970, 1, 1), 31).toString());
  }

  /**
   * Test {@link NoHolidaysCalendar#shift(LocalDate, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#shift(LocalDate, int)}
   */
  @Test
  @DisplayName(
      "Test shift(LocalDate, int); when zero; then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.shift(LocalDate, int)"})
  void testShift_whenZero_thenReturnLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualShiftResult = NoHolidaysCalendar.INSTANCE.shift(date, 0);

    // Assert
    assertSame(date, actualShiftResult);
  }

  /**
   * Test {@link NoHolidaysCalendar#next(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return toString is {@code 1970-01-02}.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test next(LocalDate); when LocalDate with '1970' and one and one; then return toString is '1970-01-02'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.next(LocalDate)"})
  void testNext_whenLocalDateWith1970AndOneAndOne_thenReturnToStringIs19700102() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-02", NoHolidaysCalendar.INSTANCE.next(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link NoHolidaysCalendar#next(LocalDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay minus one.
   *   <li>Then return toString is {@code 1970-01-01}.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#next(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test next(LocalDate); when ofEpochDay minus one; then return toString is '1970-01-01'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.next(LocalDate)"})
  void testNext_whenOfEpochDayMinusOne_thenReturnToStringIs19700101() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-01-01", NoHolidaysCalendar.INSTANCE.next(LocalDate.ofEpochDay(-1L)).toString());
  }

  /**
   * Test {@link NoHolidaysCalendar#nextOrSame(LocalDate)}.
   *
   * <ul>
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#nextOrSame(LocalDate)}
   */
  @Test
  @DisplayName("Test nextOrSame(LocalDate); then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.nextOrSame(LocalDate)"})
  void testNextOrSame_thenReturnLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNextOrSameResult = NoHolidaysCalendar.INSTANCE.nextOrSame(date);

    // Assert
    assertSame(date, actualNextOrSameResult);
  }

  /**
   * Test {@link NoHolidaysCalendar#previous(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return toString is {@code 1969-12-31}.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#previous(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test previous(LocalDate); when LocalDate with '1970' and one and one; then return toString is '1969-12-31'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.previous(LocalDate)"})
  void testPrevious_whenLocalDateWith1970AndOneAndOne_thenReturnToStringIs19691231() {
    // Arrange, Act and Assert
    assertEquals(
        "1969-12-31", NoHolidaysCalendar.INSTANCE.previous(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link NoHolidaysCalendar#previousOrSame(LocalDate)}.
   *
   * <ul>
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#previousOrSame(LocalDate)}
   */
  @Test
  @DisplayName("Test previousOrSame(LocalDate); then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.previousOrSame(LocalDate)"})
  void testPreviousOrSame_thenReturnLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualPreviousOrSameResult = NoHolidaysCalendar.INSTANCE.previousOrSame(date);

    // Assert
    assertSame(date, actualPreviousOrSameResult);
  }

  /**
   * Test {@link NoHolidaysCalendar#nextSameOrLastInMonth(LocalDate)}.
   *
   * <ul>
   *   <li>Then return {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#nextSameOrLastInMonth(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test nextSameOrLastInMonth(LocalDate); then return LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate NoHolidaysCalendar.nextSameOrLastInMonth(LocalDate)"})
  void testNextSameOrLastInMonth_thenReturnLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate date = LocalDate.of(1970, 1, 1);

    // Act
    LocalDate actualNextSameOrLastInMonthResult =
        NoHolidaysCalendar.INSTANCE.nextSameOrLastInMonth(date);

    // Assert
    assertSame(date, actualNextSameOrLastInMonthResult);
  }

  /**
   * Test {@link NoHolidaysCalendar#daysBetween(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#daysBetween(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName(
      "Test daysBetween(LocalDate, LocalDate); when LocalDate with '1970' and one and one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int NoHolidaysCalendar.daysBetween(LocalDate, LocalDate)"})
  void testDaysBetween_whenLocalDateWith1970AndOneAndOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0,
        NoHolidaysCalendar.INSTANCE.daysBetween(
            LocalDate.of(1970, 1, 1), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link NoHolidaysCalendar#daysBetween(LocalDate, LocalDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay minus one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#daysBetween(LocalDate, LocalDate)}
   */
  @Test
  @DisplayName("Test daysBetween(LocalDate, LocalDate); when ofEpochDay minus one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int NoHolidaysCalendar.daysBetween(LocalDate, LocalDate)"})
  void testDaysBetween_whenOfEpochDayMinusOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(
        1,
        NoHolidaysCalendar.INSTANCE.daysBetween(
            LocalDate.ofEpochDay(-1L), LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link NoHolidaysCalendar#combinedWith(HolidayCalendar)}.
   *
   * <ul>
   *   <li>When {@link NoHolidaysCalendar#INSTANCE}.
   *   <li>Then return {@link NoHolidaysCalendar#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#combinedWith(HolidayCalendar)}
   */
  @Test
  @DisplayName("Test combinedWith(HolidayCalendar); when INSTANCE; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"HolidayCalendar NoHolidaysCalendar.combinedWith(HolidayCalendar)"})
  void testCombinedWith_whenInstance_thenReturnInstance() {
    // Arrange and Act
    HolidayCalendar actualCombinedWithResult =
        NoHolidaysCalendar.INSTANCE.combinedWith(NoHolidaysCalendar.INSTANCE);

    // Assert
    assertSame(((NoHolidaysCalendar) actualCombinedWithResult).INSTANCE, actualCombinedWithResult);
  }

  /**
   * Test {@link NoHolidaysCalendar#equals(Object)}, and {@link NoHolidaysCalendar#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NoHolidaysCalendar#equals(Object)}
   *   <li>{@link NoHolidaysCalendar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NoHolidaysCalendar.equals(Object)",
    "int NoHolidaysCalendar.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    NoHolidaysCalendar noHolidaysCalendar = NoHolidaysCalendar.INSTANCE;
    NoHolidaysCalendar noHolidaysCalendar2 = NoHolidaysCalendar.INSTANCE;

    // Act and Assert
    assertEquals(noHolidaysCalendar, noHolidaysCalendar2);
    assertEquals(noHolidaysCalendar.hashCode(), noHolidaysCalendar2.hashCode());
  }

  /**
   * Test {@link NoHolidaysCalendar#equals(Object)}, and {@link NoHolidaysCalendar#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link NoHolidaysCalendar#equals(Object)}
   *   <li>{@link NoHolidaysCalendar#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NoHolidaysCalendar.equals(Object)",
    "int NoHolidaysCalendar.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    NoHolidaysCalendar noHolidaysCalendar = NoHolidaysCalendar.INSTANCE;

    // Act and Assert
    assertEquals(noHolidaysCalendar, noHolidaysCalendar);
    int expectedHashCodeResult = noHolidaysCalendar.hashCode();
    assertEquals(expectedHashCodeResult, noHolidaysCalendar.hashCode());
  }

  /**
   * Test {@link NoHolidaysCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NoHolidaysCalendar.equals(Object)",
    "int NoHolidaysCalendar.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NoHolidaysCalendar.INSTANCE, 3);
  }

  /**
   * Test {@link NoHolidaysCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NoHolidaysCalendar.equals(Object)",
    "int NoHolidaysCalendar.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NoHolidaysCalendar.INSTANCE, null);
  }

  /**
   * Test {@link NoHolidaysCalendar#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link NoHolidaysCalendar#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean NoHolidaysCalendar.equals(Object)",
    "int NoHolidaysCalendar.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(NoHolidaysCalendar.INSTANCE, "Different type to NoHolidaysCalendar");
  }

  /**
   * Test {@link NoHolidaysCalendar#meta()}.
   *
   * <p>Method under test: {@link NoHolidaysCalendar#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta NoHolidaysCalendar.meta()"})
  void testMeta() {
    // Arrange, Act and Assert
    assertTrue(NoHolidaysCalendar.meta().isBuildable());
  }

  /**
   * Test {@link NoHolidaysCalendar#metaBean()}.
   *
   * <p>Method under test: {@link NoHolidaysCalendar#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta NoHolidaysCalendar.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    Meta actualMetaBeanResult = NoHolidaysCalendar.INSTANCE.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult.isBuildable());
    assertSame(Meta.INSTANCE, actualMetaBeanResult);
  }
}
