package com.opengamma.strata.basics.date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DateAdjustersDiffblueTest {
  /**
   * Test {@link DateAdjusters#nextLeapDay()}.
   *
   * <ul>
   *   <li>Then return adjust {@link LocalDate} with {@code 1970} and one and one toString is {@code
   *       1972-02-29}.
   * </ul>
   *
   * <p>Method under test: {@link DateAdjusters#nextLeapDay()}
   */
  @Test
  @DisplayName(
      "Test nextLeapDay(); then return adjust LocalDate with '1970' and one and one toString is '1972-02-29'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.basics.date.DateAdjuster DateAdjusters.nextLeapDay()"})
  void testNextLeapDay_thenReturnAdjustLocalDateWith1970AndOneAndOneToStringIs19720229() {
    // Arrange, Act and Assert
    assertEquals(
        "1972-02-29", DateAdjusters.nextLeapDay().adjust(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link DateAdjusters#nextLeapDay()}.
   *
   * <ul>
   *   <li>Then return adjust ofYearDay zero and two toString is {@code 0000-02-29}.
   * </ul>
   *
   * <p>Method under test: {@link DateAdjusters#nextLeapDay()}
   */
  @Test
  @DisplayName(
      "Test nextLeapDay(); then return adjust ofYearDay zero and two toString is '0000-02-29'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.basics.date.DateAdjuster DateAdjusters.nextLeapDay()"})
  void testNextLeapDay_thenReturnAdjustOfYearDayZeroAndTwoToStringIs00000229() {
    // Arrange, Act and Assert
    assertEquals(
        "0000-02-29", DateAdjusters.nextLeapDay().adjust(LocalDate.ofYearDay(0, 2)).toString());
  }

  /**
   * Test {@link DateAdjusters#nextOrSameLeapDay()}.
   *
   * <p>Method under test: {@link DateAdjusters#nextOrSameLeapDay()}
   */
  @Test
  @DisplayName("Test nextOrSameLeapDay()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DateAdjusters.nextOrSameLeapDay()"
  })
  void testNextOrSameLeapDay() {
    // Arrange, Act and Assert
    assertEquals(
        "1972-02-29",
        DateAdjusters.nextOrSameLeapDay().adjust(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link DateAdjusters#nextOrSameLeapDay()}.
   *
   * <ul>
   *   <li>Then return adjust ofYearDay zero and two toString is {@code 0000-02-29}.
   * </ul>
   *
   * <p>Method under test: {@link DateAdjusters#nextOrSameLeapDay()}
   */
  @Test
  @DisplayName(
      "Test nextOrSameLeapDay(); then return adjust ofYearDay zero and two toString is '0000-02-29'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.DateAdjuster DateAdjusters.nextOrSameLeapDay()"
  })
  void testNextOrSameLeapDay_thenReturnAdjustOfYearDayZeroAndTwoToStringIs00000229() {
    // Arrange, Act and Assert
    assertEquals(
        "0000-02-29",
        DateAdjusters.nextOrSameLeapDay().adjust(LocalDate.ofYearDay(0, 2)).toString());
  }
}
