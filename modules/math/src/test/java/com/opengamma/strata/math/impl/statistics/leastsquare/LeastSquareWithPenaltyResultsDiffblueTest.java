package com.opengamma.strata.math.impl.statistics.leastsquare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LeastSquareWithPenaltyResultsDiffblueTest {
  /**
   * Test {@link LeastSquareWithPenaltyResults#LeastSquareWithPenaltyResults(double, double,
   * DoubleArray, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return ChiSq is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * LeastSquareWithPenaltyResults#LeastSquareWithPenaltyResults(double, double, DoubleArray,
   * DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test new LeastSquareWithPenaltyResults(double, double, DoubleArray, DoubleMatrix); when DoubleArray; then return ChiSq is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void LeastSquareWithPenaltyResults.<init>(double, double, DoubleArray, DoubleMatrix)"
  })
  void testNewLeastSquareWithPenaltyResults_whenDoubleArray_thenReturnChiSqIsTen() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();

    // Act
    LeastSquareWithPenaltyResults actualLeastSquareWithPenaltyResults =
        new LeastSquareWithPenaltyResults(10.0d, 10.0d, parameters, DoubleMatrix.of());

    // Assert
    assertEquals(10.0d, actualLeastSquareWithPenaltyResults.getChiSq());
    assertEquals(10.0d, actualLeastSquareWithPenaltyResults.getPenalty());
    assertSame(DoubleArray.EMPTY, actualLeastSquareWithPenaltyResults.getFitParameters());
    assertSame(DoubleMatrix.EMPTY, actualLeastSquareWithPenaltyResults.getCovariance());
  }

  /**
   * Test {@link LeastSquareWithPenaltyResults#LeastSquareWithPenaltyResults(double, double,
   * DoubleArray, DoubleMatrix, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return ChiSq is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * LeastSquareWithPenaltyResults#LeastSquareWithPenaltyResults(double, double, DoubleArray,
   * DoubleMatrix, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test new LeastSquareWithPenaltyResults(double, double, DoubleArray, DoubleMatrix, DoubleMatrix); when DoubleArray; then return ChiSq is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void LeastSquareWithPenaltyResults.<init>(double, double, DoubleArray, DoubleMatrix, DoubleMatrix)"
  })
  void testNewLeastSquareWithPenaltyResults_whenDoubleArray_thenReturnChiSqIsTen2() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    DoubleMatrix covariance = DoubleMatrix.of();

    // Act
    LeastSquareWithPenaltyResults actualLeastSquareWithPenaltyResults =
        new LeastSquareWithPenaltyResults(10.0d, 10.0d, parameters, covariance, DoubleMatrix.of());

    // Assert
    assertEquals(10.0d, actualLeastSquareWithPenaltyResults.getChiSq());
    assertEquals(10.0d, actualLeastSquareWithPenaltyResults.getPenalty());
    assertSame(DoubleArray.EMPTY, actualLeastSquareWithPenaltyResults.getFitParameters());
    DoubleMatrix doubleMatrix = DoubleMatrix.EMPTY;
    assertSame(doubleMatrix, actualLeastSquareWithPenaltyResults.getCovariance());
    assertSame(
        doubleMatrix, actualLeastSquareWithPenaltyResults.getFittingParameterSensitivityToData());
  }

  /**
   * Test {@link LeastSquareWithPenaltyResults#getPenalty()}.
   *
   * <p>Method under test: {@link LeastSquareWithPenaltyResults#getPenalty()}
   */
  @Test
  @DisplayName("Test getPenalty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LeastSquareWithPenaltyResults.getPenalty()"})
  void testGetPenalty() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();

    // Act and Assert
    assertEquals(
        10.0d,
        new LeastSquareWithPenaltyResults(10.0d, 10.0d, parameters, DoubleMatrix.of())
            .getPenalty());
  }
}
