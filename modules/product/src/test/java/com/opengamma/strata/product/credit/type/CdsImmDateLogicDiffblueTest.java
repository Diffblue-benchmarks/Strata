package com.opengamma.strata.product.credit.type;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CdsImmDateLogicDiffblueTest {
  /**
   * Test {@link CdsImmDateLogic#isSemiAnnualRollDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CdsImmDateLogic#isSemiAnnualRollDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isSemiAnnualRollDate(LocalDate); when LocalDate with '1970' and one and one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CdsImmDateLogic.isSemiAnnualRollDate(LocalDate)"})
  void testIsSemiAnnualRollDate_whenLocalDateWith1970AndOneAndOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CdsImmDateLogic.isSemiAnnualRollDate(LocalDate.of(1970, 1, 1)));
  }

  /**
   * Test {@link CdsImmDateLogic#isSemiAnnualRollDate(LocalDate)}.
   *
   * <ul>
   *   <li>When ofYearDay twenty and twenty.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CdsImmDateLogic#isSemiAnnualRollDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test isSemiAnnualRollDate(LocalDate); when ofYearDay twenty and twenty; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CdsImmDateLogic.isSemiAnnualRollDate(LocalDate)"})
  void testIsSemiAnnualRollDate_whenOfYearDayTwentyAndTwenty_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CdsImmDateLogic.isSemiAnnualRollDate(LocalDate.ofYearDay(20, 20)));
  }

  /**
   * Test {@link CdsImmDateLogic#getPreviousImmDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link CdsImmDateLogic#getPreviousImmDate(LocalDate)}
   */
  @Test
  @DisplayName("Test getPreviousImmDate(LocalDate); when LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CdsImmDateLogic.getPreviousImmDate(LocalDate)"})
  void testGetPreviousImmDate_whenLocalDateWith1970AndOneAndOne() {
    // Arrange, Act and Assert
    assertEquals(
        "1969-12-20", CdsImmDateLogic.getPreviousImmDate(LocalDate.of(1970, 1, 1)).toString());
  }

  /**
   * Test {@link CdsImmDateLogic#getPreviousImmDate(LocalDate)}.
   *
   * <ul>
   *   <li>When ofEpochDay minus one.
   *   <li>Then return toString is {@code 1969-12-20}.
   * </ul>
   *
   * <p>Method under test: {@link CdsImmDateLogic#getPreviousImmDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test getPreviousImmDate(LocalDate); when ofEpochDay minus one; then return toString is '1969-12-20'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CdsImmDateLogic.getPreviousImmDate(LocalDate)"})
  void testGetPreviousImmDate_whenOfEpochDayMinusOne_thenReturnToStringIs19691220() {
    // Arrange, Act and Assert
    assertEquals(
        "1969-12-20", CdsImmDateLogic.getPreviousImmDate(LocalDate.ofEpochDay(-1L)).toString());
  }

  /**
   * Test {@link CdsImmDateLogic#getNextSemiAnnualRollDate(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 0020-03-20}.
   * </ul>
   *
   * <p>Method under test: {@link CdsImmDateLogic#getNextSemiAnnualRollDate(LocalDate)}
   */
  @Test
  @DisplayName("Test getNextSemiAnnualRollDate(LocalDate); then return toString is '0020-03-20'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CdsImmDateLogic.getNextSemiAnnualRollDate(LocalDate)"})
  void testGetNextSemiAnnualRollDate_thenReturnToStringIs00200320() {
    // Arrange, Act and Assert
    assertEquals(
        "0020-03-20",
        CdsImmDateLogic.getNextSemiAnnualRollDate(LocalDate.ofYearDay(20, 20)).toString());
  }

  /**
   * Test {@link CdsImmDateLogic#getNextSemiAnnualRollDate(LocalDate)}.
   *
   * <ul>
   *   <li>Then return toString is {@code 1970-03-20}.
   * </ul>
   *
   * <p>Method under test: {@link CdsImmDateLogic#getNextSemiAnnualRollDate(LocalDate)}
   */
  @Test
  @DisplayName("Test getNextSemiAnnualRollDate(LocalDate); then return toString is '1970-03-20'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"LocalDate CdsImmDateLogic.getNextSemiAnnualRollDate(LocalDate)"})
  void testGetNextSemiAnnualRollDate_thenReturnToStringIs19700320() {
    // Arrange, Act and Assert
    assertEquals(
        "1970-03-20",
        CdsImmDateLogic.getNextSemiAnnualRollDate(LocalDate.of(1970, 1, 1)).toString());
  }
}
