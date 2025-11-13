package com.opengamma.strata.math.impl.statistics.leastsquare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.minimization.NonLinearParameterTransforms;
import com.opengamma.strata.math.impl.minimization.NullTransform;
import com.opengamma.strata.math.impl.minimization.ParameterLimitsTransform;
import com.opengamma.strata.math.impl.minimization.UncoupledParameterTransforms;
import java.util.BitSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class LeastSquareResultsWithTransformDiffblueTest {
  /**
   * Test {@link
   * LeastSquareResultsWithTransform#LeastSquareResultsWithTransform(LeastSquareResults)}.
   *
   * <ul>
   *   <li>Then return ChiSq is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * LeastSquareResultsWithTransform#LeastSquareResultsWithTransform(LeastSquareResults)}
   */
  @Test
  @DisplayName(
      "Test new LeastSquareResultsWithTransform(LeastSquareResults); then return ChiSq is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquareResultsWithTransform.<init>(LeastSquareResults)"})
  void testNewLeastSquareResultsWithTransform_thenReturnChiSqIsTen() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    DoubleMatrix covariance = DoubleMatrix.of();

    LeastSquareResults transformedFitResult =
        new LeastSquareResults(10.0d, parameters, covariance, DoubleMatrix.of());

    // Act
    LeastSquareResultsWithTransform actualLeastSquareResultsWithTransform =
        new LeastSquareResultsWithTransform(transformedFitResult);

    // Assert
    assertEquals(10.0d, actualLeastSquareResultsWithTransform.getChiSq());
    DoubleArray doubleArray = DoubleArray.EMPTY;
    assertSame(doubleArray, actualLeastSquareResultsWithTransform.getFitParameters());
    assertSame(doubleArray, actualLeastSquareResultsWithTransform.getModelParameters());
    DoubleMatrix doubleMatrix = DoubleMatrix.EMPTY;
    assertSame(doubleMatrix, actualLeastSquareResultsWithTransform.getCovariance());
    assertSame(
        doubleMatrix, actualLeastSquareResultsWithTransform.getFittingParameterSensitivityToData());
    assertSame(
        doubleMatrix, actualLeastSquareResultsWithTransform.getModelParameterSensitivityToData());
  }

  /**
   * Test {@link LeastSquareResultsWithTransform#LeastSquareResultsWithTransform(LeastSquareResults,
   * NonLinearParameterTransforms)}.
   *
   * <ul>
   *   <li>Then return ChiSq is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * LeastSquareResultsWithTransform#LeastSquareResultsWithTransform(LeastSquareResults,
   * NonLinearParameterTransforms)}
   */
  @Test
  @DisplayName(
      "Test new LeastSquareResultsWithTransform(LeastSquareResults, NonLinearParameterTransforms); then return ChiSq is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void LeastSquareResultsWithTransform.<init>(LeastSquareResults, NonLinearParameterTransforms)"
  })
  void testNewLeastSquareResultsWithTransform_thenReturnChiSqIsTen2() {
    // Arrange
    DoubleArray parameters = DoubleArray.of(10.0d);
    DoubleMatrix covariance = DoubleMatrix.filled(1, 1);

    LeastSquareResults transformedFitResult = new LeastSquareResults(10.0d, parameters, covariance);
    DoubleArray startValues = DoubleArray.of(10.0d);
    ParameterLimitsTransform[] transforms = new ParameterLimitsTransform[] {new NullTransform()};

    UncoupledParameterTransforms transform =
        new UncoupledParameterTransforms(startValues, transforms, new BitSet());

    // Act
    LeastSquareResultsWithTransform actualLeastSquareResultsWithTransform =
        new LeastSquareResultsWithTransform(transformedFitResult, transform);

    // Assert
    assertEquals(10.0d, actualLeastSquareResultsWithTransform.getChiSq());
    assertSame(parameters, actualLeastSquareResultsWithTransform.getFitParameters());
    assertSame(covariance, actualLeastSquareResultsWithTransform.getCovariance());
  }

  /**
   * Test {@link
   * LeastSquareResultsWithTransform#LeastSquareResultsWithTransform(LeastSquareResults)}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LeastSquareResultsWithTransform#LeastSquareResultsWithTransform(LeastSquareResults)}
   */
  @Test
  @DisplayName(
      "Test new LeastSquareResultsWithTransform(LeastSquareResults); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquareResultsWithTransform.<init>(LeastSquareResults)"})
  void testNewLeastSquareResultsWithTransform_thenThrowUnsupportedOperationException() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    LeastSquareResults transformedFitResult =
        new LeastSquareResults(10.0d, parameters, DoubleMatrix.of());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new LeastSquareResultsWithTransform(transformedFitResult));
  }

  /**
   * Test {@link LeastSquareResultsWithTransform#getModelParameterSensitivityToData()}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LeastSquareResultsWithTransform#getModelParameterSensitivityToData()}
   */
  @Test
  @DisplayName("Test getModelParameterSensitivityToData(); then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix LeastSquareResultsWithTransform.getModelParameterSensitivityToData()"
  })
  void testGetModelParameterSensitivityToData_thenReturnEmpty() {
    // Arrange
    UncoupledParameterTransforms transform = mock(UncoupledParameterTransforms.class);
    when(transform.inverseTransform(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());
    when(transform.inverseJacobian(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());
    DoubleArray parameters = DoubleArray.of();
    DoubleMatrix covariance = DoubleMatrix.of();

    LeastSquareResults transformedFitResult =
        new LeastSquareResults(10.0d, parameters, covariance, DoubleMatrix.of());

    LeastSquareResultsWithTransform leastSquareResultsWithTransform =
        new LeastSquareResultsWithTransform(transformedFitResult, transform);

    // Act
    DoubleMatrix actualModelParameterSensitivityToData =
        leastSquareResultsWithTransform.getModelParameterSensitivityToData();

    // Assert
    verify(transform).inverseJacobian(isA(DoubleArray.class));
    verify(transform).inverseTransform(isA(DoubleArray.class));
    assertSame(DoubleMatrix.EMPTY, actualModelParameterSensitivityToData);
  }

  /**
   * Test {@link LeastSquareResultsWithTransform#getModelParameterSensitivityToData()}.
   *
   * <ul>
   *   <li>Then return identity three.
   * </ul>
   *
   * <p>Method under test: {@link
   * LeastSquareResultsWithTransform#getModelParameterSensitivityToData()}
   */
  @Test
  @DisplayName("Test getModelParameterSensitivityToData(); then return identity three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix LeastSquareResultsWithTransform.getModelParameterSensitivityToData()"
  })
  void testGetModelParameterSensitivityToData_thenReturnIdentityThree() {
    // Arrange
    UncoupledParameterTransforms transform = mock(UncoupledParameterTransforms.class);
    when(transform.inverseTransform(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());
    when(transform.inverseJacobian(Mockito.<DoubleArray>any()))
        .thenReturn(DoubleMatrix.identity(3));
    DoubleArray parameters = DoubleArray.of();
    DoubleMatrix covariance = DoubleMatrix.of();
    DoubleMatrix inverseJacobian = DoubleMatrix.identity(3);

    LeastSquareResults transformedFitResult =
        new LeastSquareResults(10.0d, parameters, covariance, inverseJacobian);

    LeastSquareResultsWithTransform leastSquareResultsWithTransform =
        new LeastSquareResultsWithTransform(transformedFitResult, transform);

    // Act
    DoubleMatrix actualModelParameterSensitivityToData =
        leastSquareResultsWithTransform.getModelParameterSensitivityToData();

    // Assert
    verify(transform).inverseJacobian(isA(DoubleArray.class));
    verify(transform).inverseTransform(isA(DoubleArray.class));
    assertEquals(inverseJacobian, actualModelParameterSensitivityToData);
  }

  /**
   * Test {@link LeastSquareResultsWithTransform#getModelParameterSensitivityToData()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LeastSquareResultsWithTransform#getModelParameterSensitivityToData()}
   */
  @Test
  @DisplayName(
      "Test getModelParameterSensitivityToData(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix LeastSquareResultsWithTransform.getModelParameterSensitivityToData()"
  })
  void testGetModelParameterSensitivityToData_thenThrowUnsupportedOperationException() {
    // Arrange
    UncoupledParameterTransforms transform = mock(UncoupledParameterTransforms.class);
    when(transform.inverseTransform(Mockito.<DoubleArray>any())).thenReturn(DoubleArray.of());
    when(transform.inverseJacobian(Mockito.<DoubleArray>any())).thenReturn(DoubleMatrix.of());
    DoubleArray parameters = DoubleArray.of();
    LeastSquareResults transformedFitResult =
        new LeastSquareResults(10.0d, parameters, DoubleMatrix.of());

    LeastSquareResultsWithTransform leastSquareResultsWithTransform =
        new LeastSquareResultsWithTransform(transformedFitResult, transform);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> leastSquareResultsWithTransform.getModelParameterSensitivityToData());
    verify(transform).inverseJacobian(isA(DoubleArray.class));
    verify(transform).inverseTransform(isA(DoubleArray.class));
  }
}
