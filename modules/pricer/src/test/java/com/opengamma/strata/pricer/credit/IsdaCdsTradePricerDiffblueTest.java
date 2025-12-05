package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IsdaCdsTradePricerDiffblueTest {
  /**
   * Test {@link IsdaCdsTradePricer#IsdaCdsTradePricer()}.
   *
   * <p>Method under test: {@link IsdaCdsTradePricer#IsdaCdsTradePricer()}
   */
  @Test
  @DisplayName("Test new IsdaCdsTradePricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IsdaCdsTradePricer.<init>()"})
  void testNewIsdaCdsTradePricer() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        new IsdaCdsTradePricer().getAccrualOnDefaultFormula());
  }

  /**
   * Test {@link IsdaCdsTradePricer#IsdaCdsTradePricer(AccrualOnDefaultFormula)}.
   *
   * <ul>
   *   <li>Then return AccrualOnDefaultFormula is {@code ORIGINAL_ISDA}.
   * </ul>
   *
   * <p>Method under test: {@link IsdaCdsTradePricer#IsdaCdsTradePricer(AccrualOnDefaultFormula)}
   */
  @Test
  @DisplayName(
      "Test new IsdaCdsTradePricer(AccrualOnDefaultFormula); then return AccrualOnDefaultFormula is 'ORIGINAL_ISDA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IsdaCdsTradePricer.<init>(AccrualOnDefaultFormula)"})
  void testNewIsdaCdsTradePricer_thenReturnAccrualOnDefaultFormulaIsOriginalIsda() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        new IsdaCdsTradePricer(AccrualOnDefaultFormula.ORIGINAL_ISDA).getAccrualOnDefaultFormula());
  }

  /**
   * Test {@link IsdaCdsTradePricer#getAccrualOnDefaultFormula()}.
   *
   * <p>Method under test: {@link IsdaCdsTradePricer#getAccrualOnDefaultFormula()}
   */
  @Test
  @DisplayName("Test getAccrualOnDefaultFormula()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AccrualOnDefaultFormula IsdaCdsTradePricer.getAccrualOnDefaultFormula()"})
  void testGetAccrualOnDefaultFormula() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        IsdaCdsTradePricer.DEFAULT.getAccrualOnDefaultFormula());
  }
}
