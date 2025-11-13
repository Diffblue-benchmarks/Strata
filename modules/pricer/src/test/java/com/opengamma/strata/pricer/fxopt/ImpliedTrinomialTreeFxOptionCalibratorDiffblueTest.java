package com.opengamma.strata.pricer.fxopt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ImpliedTrinomialTreeFxOptionCalibratorDiffblueTest {
  /**
   * Test {@link
   * ImpliedTrinomialTreeFxOptionCalibrator#ImpliedTrinomialTreeFxOptionCalibrator(int)}.
   *
   * <ul>
   *   <li>Then return NumberOfSteps is two.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeFxOptionCalibrator#ImpliedTrinomialTreeFxOptionCalibrator(int)}
   */
  @Test
  @DisplayName(
      "Test new ImpliedTrinomialTreeFxOptionCalibrator(int); then return NumberOfSteps is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ImpliedTrinomialTreeFxOptionCalibrator.<init>(int)"})
  void testNewImpliedTrinomialTreeFxOptionCalibrator_thenReturnNumberOfStepsIsTwo() {
    // Arrange, Act and Assert
    assertEquals(2, new ImpliedTrinomialTreeFxOptionCalibrator(2).getNumberOfSteps());
  }
}
