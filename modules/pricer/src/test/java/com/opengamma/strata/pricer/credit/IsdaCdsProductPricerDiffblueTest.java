package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IsdaCdsProductPricerDiffblueTest {
  /**
   * Test {@link IsdaCdsProductPricer#IsdaCdsProductPricer(AccrualOnDefaultFormula)}.
   *
   * <ul>
   *   <li>Then return AccrualOnDefaultFormula is {@code ORIGINAL_ISDA}.
   * </ul>
   *
   * <p>Method under test: {@link
   * IsdaCdsProductPricer#IsdaCdsProductPricer(AccrualOnDefaultFormula)}
   */
  @Test
  @DisplayName(
      "Test new IsdaCdsProductPricer(AccrualOnDefaultFormula); then return AccrualOnDefaultFormula is 'ORIGINAL_ISDA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IsdaCdsProductPricer.<init>(AccrualOnDefaultFormula)"})
  void testNewIsdaCdsProductPricer_thenReturnAccrualOnDefaultFormulaIsOriginalIsda() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        new IsdaCdsProductPricer(AccrualOnDefaultFormula.ORIGINAL_ISDA)
            .getAccrualOnDefaultFormula());
  }

  /**
   * Test {@link IsdaCdsProductPricer#getAccrualOnDefaultFormula()}.
   *
   * <p>Method under test: {@link IsdaCdsProductPricer#getAccrualOnDefaultFormula()}
   */
  @Test
  @DisplayName("Test getAccrualOnDefaultFormula()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AccrualOnDefaultFormula IsdaCdsProductPricer.getAccrualOnDefaultFormula()"})
  void testGetAccrualOnDefaultFormula() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        new IsdaCdsProductPricer(AccrualOnDefaultFormula.ORIGINAL_ISDA)
            .getAccrualOnDefaultFormula());
  }
}
