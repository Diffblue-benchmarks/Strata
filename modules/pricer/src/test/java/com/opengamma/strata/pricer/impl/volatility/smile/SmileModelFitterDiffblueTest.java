package com.opengamma.strata.pricer.impl.volatility.smile;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.math.impl.minimization.NonLinearParameterTransforms;
import com.opengamma.strata.math.impl.minimization.NullTransform;
import com.opengamma.strata.math.impl.minimization.ParameterLimitsTransform;
import com.opengamma.strata.math.impl.minimization.UncoupledParameterTransforms;
import java.util.BitSet;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SmileModelFitterDiffblueTest {
  /**
   * Test {@link SmileModelFitter#getConstraintFunction(NonLinearParameterTransforms)}.
   *
   * <ul>
   *   <li>Then return apply {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SmileModelFitter#getConstraintFunction(NonLinearParameterTransforms)}
   */
  @Test
  @DisplayName(
      "Test getConstraintFunction(NonLinearParameterTransforms); then return apply DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Function SmileModelFitter.getConstraintFunction(NonLinearParameterTransforms)"
  })
  void testGetConstraintFunction_thenReturnApplyDoubleArray() {
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
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms = new ParameterLimitsTransform[] {new NullTransform()};

    UncoupledParameterTransforms t =
        new UncoupledParameterTransforms(startValues, transforms, new BitSet());

    // Act
    Function<DoubleArray, Boolean> actualConstraintFunction =
        sabrModelFitter.getConstraintFunction(t);

    // Assert
    assertTrue(actualConstraintFunction.apply(DoubleArray.of()));
  }

  /**
   * Test {@link SmileModelFitter#getModel()}.
   *
   * <p>Method under test: {@link SmileModelFitter#getModel()}
   */
  @Test
  @DisplayName("Test getModel()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"VolatilityFunctionProvider SmileModelFitter.getModel()"})
  void testGetModel() {
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

    // Act
    VolatilityFunctionProvider<SabrFormulaData> actualModel = sabrModelFitter.getModel();

    // Assert
    assertSame(((SabrHaganVolatilityFunctionProvider) actualModel).DEFAULT, actualModel);
  }
}
