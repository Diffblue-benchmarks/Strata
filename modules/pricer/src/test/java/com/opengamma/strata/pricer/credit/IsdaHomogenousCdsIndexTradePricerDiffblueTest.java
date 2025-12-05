package com.opengamma.strata.pricer.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IsdaHomogenousCdsIndexTradePricerDiffblueTest {
  /**
   * Test {@link IsdaHomogenousCdsIndexTradePricer#IsdaHomogenousCdsIndexTradePricer()}.
   *
   * <p>Method under test: {@link
   * IsdaHomogenousCdsIndexTradePricer#IsdaHomogenousCdsIndexTradePricer()}
   */
  @Test
  @DisplayName("Test new IsdaHomogenousCdsIndexTradePricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IsdaHomogenousCdsIndexTradePricer.<init>()"})
  void testNewIsdaHomogenousCdsIndexTradePricer() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        new IsdaHomogenousCdsIndexTradePricer().getAccrualOnDefaultFormula());
  }

  /**
   * Test {@link
   * IsdaHomogenousCdsIndexTradePricer#IsdaHomogenousCdsIndexTradePricer(AccrualOnDefaultFormula)}.
   *
   * <p>Method under test: {@link
   * IsdaHomogenousCdsIndexTradePricer#IsdaHomogenousCdsIndexTradePricer(AccrualOnDefaultFormula)}
   */
  @Test
  @DisplayName("Test new IsdaHomogenousCdsIndexTradePricer(AccrualOnDefaultFormula)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void IsdaHomogenousCdsIndexTradePricer.<init>(AccrualOnDefaultFormula)"})
  void testNewIsdaHomogenousCdsIndexTradePricer2() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        new IsdaHomogenousCdsIndexTradePricer(AccrualOnDefaultFormula.ORIGINAL_ISDA)
            .getAccrualOnDefaultFormula());
  }

  /**
   * Test {@link IsdaHomogenousCdsIndexTradePricer#getAccrualOnDefaultFormula()}.
   *
   * <p>Method under test: {@link IsdaHomogenousCdsIndexTradePricer#getAccrualOnDefaultFormula()}
   */
  @Test
  @DisplayName("Test getAccrualOnDefaultFormula()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AccrualOnDefaultFormula IsdaHomogenousCdsIndexTradePricer.getAccrualOnDefaultFormula()"
  })
  void testGetAccrualOnDefaultFormula() {
    // Arrange, Act and Assert
    assertEquals(
        AccrualOnDefaultFormula.ORIGINAL_ISDA,
        IsdaHomogenousCdsIndexTradePricer.DEFAULT.getAccrualOnDefaultFormula());
  }
}
