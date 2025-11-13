package com.opengamma.strata.pricer.impl.volatility.smile;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.pricer.model.SabrVolatilityFormula;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrModelFitterDiffblueTest {
  /**
   * Test {@link SabrModelFitter#SabrModelFitter(double, DoubleArray, double, DoubleArray,
   * DoubleArray, VolatilityFunctionProvider)}.
   *
   * <ul>
   *   <li>When {@link SabrHaganVolatilityFunctionProvider#DEFAULT}.
   *   <li>Then return MaximumStep is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SabrModelFitter#SabrModelFitter(double, DoubleArray, double,
   * DoubleArray, DoubleArray, VolatilityFunctionProvider)}
   */
  @Test
  @DisplayName(
      "Test new SabrModelFitter(double, DoubleArray, double, DoubleArray, DoubleArray, VolatilityFunctionProvider); when DEFAULT; then return MaximumStep is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SabrModelFitter.<init>(double, DoubleArray, double, DoubleArray, DoubleArray, VolatilityFunctionProvider)"
  })
  void testNewSabrModelFitter_whenDefault_thenReturnMaximumStepIsNull() {
    // Arrange
    DoubleArray strikes = DoubleArray.of();
    DoubleArray impliedVols = DoubleArray.of();

    // Act
    SabrModelFitter actualSabrModelFitter =
        new SabrModelFitter(
            10.0d,
            strikes,
            10.0d,
            impliedVols,
            DoubleArray.of(),
            (VolatilityFunctionProvider<SabrFormulaData>)
                SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Assert
    assertNull(actualSabrModelFitter.getMaximumStep());
    assertSame(SabrHaganVolatilityFunctionProvider.DEFAULT, actualSabrModelFitter.getModel());
  }

  /**
   * Test {@link SabrModelFitter#SabrModelFitter(double, DoubleArray, double, DoubleArray,
   * DoubleArray, SabrVolatilityFormula)}.
   *
   * <ul>
   *   <li>When {@link SabrHaganVolatilityFunctionProvider#DEFAULT}.
   *   <li>Then return MaximumStep is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SabrModelFitter#SabrModelFitter(double, DoubleArray, double,
   * DoubleArray, DoubleArray, SabrVolatilityFormula)}
   */
  @Test
  @DisplayName(
      "Test new SabrModelFitter(double, DoubleArray, double, DoubleArray, DoubleArray, SabrVolatilityFormula); when DEFAULT; then return MaximumStep is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SabrModelFitter.<init>(double, DoubleArray, double, DoubleArray, DoubleArray, SabrVolatilityFormula)"
  })
  void testNewSabrModelFitter_whenDefault_thenReturnMaximumStepIsNull2() {
    // Arrange
    DoubleArray strikes = DoubleArray.of();
    DoubleArray impliedVols = DoubleArray.of();

    // Act
    SabrModelFitter actualSabrModelFitter =
        new SabrModelFitter(
            10.0d,
            strikes,
            10.0d,
            impliedVols,
            DoubleArray.of(),
            (SabrVolatilityFormula) SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Assert
    assertNull(actualSabrModelFitter.getMaximumStep());
    assertSame(SabrHaganVolatilityFunctionProvider.DEFAULT, actualSabrModelFitter.getModel());
  }

  /**
   * Test {@link SabrModelFitter#getMaximumStep()}.
   *
   * <p>Method under test: {@link SabrModelFitter#getMaximumStep()}
   */
  @Test
  @DisplayName("Test getMaximumStep()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray SabrModelFitter.getMaximumStep()"})
  void testGetMaximumStep() {
    // Arrange
    DoubleArray strikes = DoubleArray.of();
    DoubleArray impliedVols = DoubleArray.of();

    SabrModelFitter sabrModelFitter =
        new SabrModelFitter(
            10.0d,
            strikes,
            10.0d,
            impliedVols,
            DoubleArray.of(),
            (VolatilityFunctionProvider<SabrFormulaData>)
                SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Act and Assert
    assertNull(sabrModelFitter.getMaximumStep());
  }
}
