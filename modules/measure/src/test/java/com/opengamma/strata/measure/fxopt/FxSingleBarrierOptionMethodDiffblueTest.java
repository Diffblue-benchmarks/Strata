package com.opengamma.strata.measure.fxopt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.calc.Measure;
import com.opengamma.strata.market.sensitivity.CurveSensitivities;
import com.opengamma.strata.measure.AdvancedMeasures;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxSingleBarrierOptionMethodDiffblueTest {
  /**
   * Test {@link FxSingleBarrierOptionMethod#of(String)}.
   *
   * <ul>
   *   <li>When {@code BLACK}.
   *   <li>Then return {@code BLACK}.
   * </ul>
   *
   * <p>Method under test: {@link FxSingleBarrierOptionMethod#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'BLACK'; then return 'BLACK'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxSingleBarrierOptionMethod FxSingleBarrierOptionMethod.of(String)"})
  void testOf_whenBlack_thenReturnBlack() {
    // Arrange, Act and Assert
    assertEquals(FxSingleBarrierOptionMethod.BLACK, FxSingleBarrierOptionMethod.of("BLACK"));
  }

  /**
   * Test {@link FxSingleBarrierOptionMethod#filter(CalculationTarget, Measure)}.
   *
   * <p>Method under test: {@link FxSingleBarrierOptionMethod#filter(CalculationTarget, Measure)}
   */
  @Test
  @DisplayName("Test filter(CalculationTarget, Measure)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional FxSingleBarrierOptionMethod.filter(CalculationTarget, Measure)"
  })
  void testFilter() {
    // Arrange, Act and Assert
    assertFalse(
        FxSingleBarrierOptionMethod.BLACK
            .filter(CurveSensitivities.empty(), AdvancedMeasures.PV01_SEMI_PARALLEL_GAMMA_BUCKETED)
            .isPresent());
  }

  /**
   * Test {@link FxSingleBarrierOptionMethod#toString()}.
   *
   * <p>Method under test: {@link FxSingleBarrierOptionMethod#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxSingleBarrierOptionMethod.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Black", FxSingleBarrierOptionMethod.valueOf("BLACK").toString());
  }
}
