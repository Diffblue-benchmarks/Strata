package com.opengamma.strata.basics.schedule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.schedule.DayRollConventions.Dom;
import com.opengamma.strata.basics.schedule.DayRollConventions.Dow;
import com.opengamma.strata.collect.named.ExtendedEnum;
import java.time.DayOfWeek;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RollConventionDiffblueTest {
  /**
   * Test {@link RollConvention#ofDayOfMonth(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@link Dom}.
   * </ul>
   *
   * <p>Method under test: {@link RollConvention#ofDayOfMonth(int)}
   */
  @Test
  @DisplayName("Test ofDayOfMonth(int); when one; then return Dom")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RollConvention RollConvention.ofDayOfMonth(int)"})
  void testOfDayOfMonth_whenOne_thenReturnDom() {
    // Arrange and Act
    RollConvention actualOfDayOfMonthResult = RollConvention.ofDayOfMonth(1);

    // Assert
    assertTrue(actualOfDayOfMonthResult instanceof Dom);
    assertEquals("Day1", actualOfDayOfMonthResult.getName());
    assertEquals("Day1", actualOfDayOfMonthResult.toString());
    assertEquals(1, actualOfDayOfMonthResult.getDayOfMonth());
  }

  /**
   * Test {@link RollConvention#ofDayOfMonth(int)}.
   *
   * <ul>
   *   <li>When thirty-one.
   *   <li>Then return DayOfMonth is thirty-one.
   * </ul>
   *
   * <p>Method under test: {@link RollConvention#ofDayOfMonth(int)}
   */
  @Test
  @DisplayName("Test ofDayOfMonth(int); when thirty-one; then return DayOfMonth is thirty-one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RollConvention RollConvention.ofDayOfMonth(int)"})
  void testOfDayOfMonth_whenThirtyOne_thenReturnDayOfMonthIsThirtyOne() {
    // Arrange and Act
    RollConvention actualOfDayOfMonthResult = RollConvention.ofDayOfMonth(31);

    // Assert
    assertEquals(31, actualOfDayOfMonthResult.getDayOfMonth());
  }

  /**
   * Test {@link RollConvention#ofDayOfWeek(DayOfWeek)}.
   *
   * <ul>
   *   <li>When {@code MONDAY}.
   *   <li>Then return {@link Dow}.
   * </ul>
   *
   * <p>Method under test: {@link RollConvention#ofDayOfWeek(DayOfWeek)}
   */
  @Test
  @DisplayName("Test ofDayOfWeek(DayOfWeek); when 'MONDAY'; then return Dow")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RollConvention RollConvention.ofDayOfWeek(DayOfWeek)"})
  void testOfDayOfWeek_whenMonday_thenReturnDow() {
    // Arrange and Act
    RollConvention actualOfDayOfWeekResult = RollConvention.ofDayOfWeek(DayOfWeek.MONDAY);

    // Assert
    assertTrue(actualOfDayOfWeekResult instanceof Dow);
    assertEquals("DayMon", actualOfDayOfWeekResult.getName());
    assertEquals("DayMon", actualOfDayOfWeekResult.toString());
    assertEquals(0, actualOfDayOfWeekResult.getDayOfMonth());
  }

  /**
   * Test {@link RollConvention#extendedEnum()}.
   *
   * <p>Method under test: {@link RollConvention#extendedEnum()}
   */
  @Test
  @DisplayName("Test extendedEnum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExtendedEnum RollConvention.extendedEnum()"})
  void testExtendedEnum() {
    // Arrange and Act
    ExtendedEnum<RollConvention> actualExtendedEnumResult = RollConvention.extendedEnum();

    // Assert
    assertTrue(actualExtendedEnumResult.alternateNames().isEmpty());
    Class<RollConvention> expectedType = RollConvention.class;
    assertEquals(expectedType, actualExtendedEnumResult.getType());
  }
}
