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

class FxVanillaOptionMethodDiffblueTest {
  /**
   * Test {@link FxVanillaOptionMethod#of(String)}.
   *
   * <ul>
   *   <li>When {@code BLACK}.
   *   <li>Then return {@code BLACK}.
   * </ul>
   *
   * <p>Method under test: {@link FxVanillaOptionMethod#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'BLACK'; then return 'BLACK'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxVanillaOptionMethod FxVanillaOptionMethod.of(String)"})
  void testOf_whenBlack_thenReturnBlack() {
    // Arrange, Act and Assert
    assertEquals(FxVanillaOptionMethod.BLACK, FxVanillaOptionMethod.of("BLACK"));
  }

  /**
   * Test {@link FxVanillaOptionMethod#filter(CalculationTarget, Measure)}.
   *
   * <p>Method under test: {@link FxVanillaOptionMethod#filter(CalculationTarget, Measure)}
   */
  @Test
  @DisplayName("Test filter(CalculationTarget, Measure)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Optional FxVanillaOptionMethod.filter(CalculationTarget, Measure)"})
  void testFilter() {
    // Arrange, Act and Assert
    assertFalse(
        FxVanillaOptionMethod.BLACK
            .filter(CurveSensitivities.empty(), AdvancedMeasures.PV01_SEMI_PARALLEL_GAMMA_BUCKETED)
            .isPresent());
  }

  /**
   * Test {@link FxVanillaOptionMethod#toString()}.
   *
   * <p>Method under test: {@link FxVanillaOptionMethod#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FxVanillaOptionMethod.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Black", FxVanillaOptionMethod.valueOf("BLACK").toString());
  }
}
