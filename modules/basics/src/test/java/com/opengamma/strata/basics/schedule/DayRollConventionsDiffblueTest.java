package com.opengamma.strata.basics.schedule;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.schedule.DayRollConventions.Dom;
import com.opengamma.strata.basics.schedule.DayRollConventions.Dow;
import java.time.DayOfWeek;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DayRollConventionsDiffblueTest {
  /**
   * Test Dom {@link Dom#of(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@link Dom}.
   * </ul>
   *
   * <p>Method under test: {@link Dom#of(int)}
   */
  @Test
  @DisplayName("Test Dom of(int); when one; then return Dom")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RollConvention Dom.of(int)"})
  void testDomOf_whenOne_thenReturnDom() {
    // Arrange and Act
    RollConvention actualOfResult = Dom.of(1);

    // Assert
    assertTrue(actualOfResult instanceof Dom);
    assertEquals("Day1", actualOfResult.getName());
    assertEquals("Day1", actualOfResult.toString());
    assertEquals(1, actualOfResult.getDayOfMonth());
  }

  /**
   * Test Dom {@link Dom#of(int)}.
   *
   * <ul>
   *   <li>When thirty-one.
   *   <li>Then return DayOfMonth is thirty-one.
   * </ul>
   *
   * <p>Method under test: {@link Dom#of(int)}
   */
  @Test
  @DisplayName("Test Dom of(int); when thirty-one; then return DayOfMonth is thirty-one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RollConvention Dom.of(int)"})
  void testDomOf_whenThirtyOne_thenReturnDayOfMonthIsThirtyOne() {
    // Arrange and Act
    RollConvention actualOfResult = Dom.of(31);

    // Assert
    assertEquals(31, actualOfResult.getDayOfMonth());
  }

  /**
   * Test Dom {@link Dom#of(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Dom#of(int)}
   */
  @Test
  @DisplayName("Test Dom of(int); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RollConvention Dom.of(int)"})
  void testDomOf_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Dom.of(0));
  }

  /**
   * Test Dow {@link Dow#of(DayOfWeek)}.
   *
   * <ul>
   *   <li>When {@code MONDAY}.
   *   <li>Then return {@link Dow}.
   * </ul>
   *
   * <p>Method under test: {@link Dow#of(DayOfWeek)}
   */
  @Test
  @DisplayName("Test Dow of(DayOfWeek); when 'MONDAY'; then return Dow")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RollConvention Dow.of(DayOfWeek)"})
  void testDowOf_whenMonday_thenReturnDow() {
    // Arrange and Act
    RollConvention actualOfResult = Dow.of(DayOfWeek.MONDAY);

    // Assert
    assertTrue(actualOfResult instanceof Dow);
    assertEquals("DayMon", actualOfResult.getName());
    assertEquals("DayMon", actualOfResult.toString());
    assertEquals(0, actualOfResult.getDayOfMonth());
  }
}
