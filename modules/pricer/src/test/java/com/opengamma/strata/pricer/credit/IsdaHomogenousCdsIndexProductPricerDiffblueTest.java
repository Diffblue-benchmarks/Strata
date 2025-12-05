package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IsdaHomogenousCdsIndexProductPricerDiffblueTest {
  /**
   * Test {@link
   * IsdaHomogenousCdsIndexProductPricer#IsdaHomogenousCdsIndexProductPricer(AccrualOnDefaultFormula)}.
   *
   * <p>Method under test: {@link
   * IsdaHomogenousCdsIndexProductPricer#IsdaHomogenousCdsIndexProductPricer(AccrualOnDefaultFormula)}
   */
  @Test
  @DisplayName("Test new IsdaHomogenousCdsIndexProductPricer(AccrualOnDefaultFormula)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IsdaHomogenousCdsIndexProductPricer.<init>(AccrualOnDefaultFormula)"})
  void testNewIsdaHomogenousCdsIndexProductPricer() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        new IsdaHomogenousCdsIndexProductPricer(AccrualOnDefaultFormula.ORIGINAL_ISDA)
            .getAccrualOnDefaultFormula());
  }

  /**
   * Test {@link IsdaHomogenousCdsIndexProductPricer#getAccrualOnDefaultFormula()}.
   *
   * <p>Method under test: {@link IsdaHomogenousCdsIndexProductPricer#getAccrualOnDefaultFormula()}
   */
  @Test
  @DisplayName("Test getAccrualOnDefaultFormula()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AccrualOnDefaultFormula IsdaHomogenousCdsIndexProductPricer.getAccrualOnDefaultFormula()"
  })
  void testGetAccrualOnDefaultFormula() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        IsdaHomogenousCdsIndexProductPricer.DEFAULT.getAccrualOnDefaultFormula());
  }
}
