package com.opengamma.strata.pricer.fxopt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImpliedTrinomialTreeFxSingleBarrierOptionProductPricerDiffblueTest {
  /**
   * Test {@link
   * ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer#ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer()}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer#ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer()}
   */
  @Test
  @DisplayName("Test new ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer.<init>()"})
  void testNewImpliedTrinomialTreeFxSingleBarrierOptionProductPricer() {
    // Arrange, Act and Assert
    assertEquals(
        51,
        new ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer()
            .getCalibrator()
            .getNumberOfSteps());
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer#ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer(int)}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer#ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer(int)}
   */
  @Test
  @DisplayName("Test new ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer.<init>(int)"})
  void testNewImpliedTrinomialTreeFxSingleBarrierOptionProductPricer2() {
    // Arrange, Act and Assert
    assertEquals(
        2,
        new ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer(2)
            .getCalibrator()
            .getNumberOfSteps());
  }

  /**
   * Test {@link ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer#getCalibrator()}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer#getCalibrator()}
   */
  @Test
  @DisplayName("Test getCalibrator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.fxopt.ImpliedTrinomialTreeFxOptionCalibrator ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer.getCalibrator()"
  })
  void testGetCalibrator() {
    // Arrange, Act and Assert
    assertEquals(
        51,
        new ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer()
            .getCalibrator()
            .getNumberOfSteps());
  }
}
