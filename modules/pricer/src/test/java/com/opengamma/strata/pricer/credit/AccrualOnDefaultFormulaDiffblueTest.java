package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AccrualOnDefaultFormulaDiffblueTest {
  /**
   * Test {@link AccrualOnDefaultFormula#of(String)}.
   *
   * <ul>
   *   <li>When {@code CORRECT}.
   *   <li>Then return {@code CORRECT}.
   * </ul>
   *
   * <p>Method under test: {@link AccrualOnDefaultFormula#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'CORRECT'; then return 'CORRECT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AccrualOnDefaultFormula AccrualOnDefaultFormula.of(String)"})
  void testOf_whenCorrect_thenReturnCorrect() {
    // Arrange, Act and Assert
    assertEquals(AccrualOnDefaultFormula.CORRECT, AccrualOnDefaultFormula.of("CORRECT"));
  }

  /**
   * Test {@link AccrualOnDefaultFormula#getOmega()}.
   *
   * <ul>
   *   <li>Given {@code MARKIT_FIX}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link AccrualOnDefaultFormula#getOmega()}
   */
  @Test
  @DisplayName("Test getOmega(); given 'MARKIT_FIX'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AccrualOnDefaultFormula.getOmega()"})
  void testGetOmega_givenMarkitFix_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, AccrualOnDefaultFormula.MARKIT_FIX.getOmega());
  }

  /**
   * Test {@link AccrualOnDefaultFormula#getOmega()}.
   *
   * <ul>
   *   <li>Given {@code ORIGINAL_ISDA}.
   *   <li>Then return {@code 0.0013698630136986301}.
   * </ul>
   *
   * <p>Method under test: {@link AccrualOnDefaultFormula#getOmega()}
   */
  @Test
  @DisplayName("Test getOmega(); given 'ORIGINAL_ISDA'; then return '0.0013698630136986301'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double AccrualOnDefaultFormula.getOmega()"})
  void testGetOmega_givenOriginalIsda_thenReturn00013698630136986301() {
    // Arrange, Act and Assert
    assertEquals(0.0013698630136986301d, AccrualOnDefaultFormula.ORIGINAL_ISDA.getOmega());
  }

  /**
   * Test {@link AccrualOnDefaultFormula#toString()}.
   *
   * <p>Method under test: {@link AccrualOnDefaultFormula#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AccrualOnDefaultFormula.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("OriginalISDA", AccrualOnDefaultFormula.valueOf("ORIGINAL_ISDA").toString());
  }
}
