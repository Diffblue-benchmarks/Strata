package com.opengamma.strata.math.impl.statistics.leastsquare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.interpolation.BasisFunctionAggregation;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GeneralizedLeastSquareResultsDiffblueTest {
  /**
   * Test {@link GeneralizedLeastSquareResults#GeneralizedLeastSquareResults(List, double,
   * DoubleArray, DoubleMatrix)}.
   *
   * <ul>
   *   <li>Then Function return {@link BasisFunctionAggregation}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquareResults#GeneralizedLeastSquareResults(List,
   * double, DoubleArray, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test new GeneralizedLeastSquareResults(List, double, DoubleArray, DoubleMatrix); then Function return BasisFunctionAggregation")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void GeneralizedLeastSquareResults.<init>(List, double, DoubleArray, DoubleMatrix)"
  })
  void testNewGeneralizedLeastSquareResults_thenFunctionReturnBasisFunctionAggregation() {
    // Arrange
    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(mock(Function.class));
    DoubleArray parameters = DoubleArray.of(10.0d);
    DoubleMatrix covariance = DoubleMatrix.filled(1, 1);

    // Act
    GeneralizedLeastSquareResults<Object> actualGeneralizedLeastSquareResults =
        new GeneralizedLeastSquareResults<>(basisFunctions, 10.0d, parameters, covariance);

    // Assert
    assertTrue(
        actualGeneralizedLeastSquareResults.getFunction() instanceof BasisFunctionAggregation);
    assertEquals(10.0d, actualGeneralizedLeastSquareResults.getChiSq());
    assertSame(parameters, actualGeneralizedLeastSquareResults.getFitParameters());
    assertSame(covariance, actualGeneralizedLeastSquareResults.getCovariance());
  }
}
