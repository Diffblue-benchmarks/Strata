package com.opengamma.strata.math.impl.statistics.leastsquare;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LeastSquareResultsDiffblueTest {
  /**
   * Test {@link LeastSquareResults#LeastSquareResults(LeastSquareResults)}.
   *
   * <p>Method under test: {@link LeastSquareResults#LeastSquareResults(LeastSquareResults)}
   */
  @Test
  @DisplayName("Test new LeastSquareResults(LeastSquareResults)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquareResults.<init>(LeastSquareResults)"})
  void testNewLeastSquareResults() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    LeastSquareResults from = new LeastSquareResults(10.0d, parameters, DoubleMatrix.of());

    // Act
    LeastSquareResults actualLeastSquareResults = new LeastSquareResults(from);

    // Assert
    assertEquals(from, actualLeastSquareResults);
  }

  /**
   * Test {@link LeastSquareResults#LeastSquareResults(double, DoubleArray, DoubleMatrix)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return ChiSq is ten.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquareResults#LeastSquareResults(double, DoubleArray,
   * DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test new LeastSquareResults(double, DoubleArray, DoubleMatrix); when ten; then return ChiSq is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquareResults.<init>(double, DoubleArray, DoubleMatrix)"})
  void testNewLeastSquareResults_whenTen_thenReturnChiSqIsTen() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();

    // Act
    LeastSquareResults actualLeastSquareResults =
        new LeastSquareResults(10.0d, parameters, DoubleMatrix.of());

    // Assert
    assertEquals(10.0d, actualLeastSquareResults.getChiSq());
    assertSame(DoubleArray.EMPTY, actualLeastSquareResults.getFitParameters());
    assertSame(DoubleMatrix.EMPTY, actualLeastSquareResults.getCovariance());
  }

  /**
   * Test {@link LeastSquareResults#LeastSquareResults(double, DoubleArray, DoubleMatrix,
   * DoubleMatrix)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return ChiSq is ten.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquareResults#LeastSquareResults(double, DoubleArray,
   * DoubleMatrix, DoubleMatrix)}
   */
  @Test
  @DisplayName(
      "Test new LeastSquareResults(double, DoubleArray, DoubleMatrix, DoubleMatrix); when ten; then return ChiSq is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void LeastSquareResults.<init>(double, DoubleArray, DoubleMatrix, DoubleMatrix)"
  })
  void testNewLeastSquareResults_whenTen_thenReturnChiSqIsTen2() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    DoubleMatrix covariance = DoubleMatrix.of();

    // Act
    LeastSquareResults actualLeastSquareResults =
        new LeastSquareResults(10.0d, parameters, covariance, DoubleMatrix.of());

    // Assert
    assertEquals(10.0d, actualLeastSquareResults.getChiSq());
    assertSame(DoubleArray.EMPTY, actualLeastSquareResults.getFitParameters());
    DoubleMatrix doubleMatrix = DoubleMatrix.EMPTY;
    assertSame(doubleMatrix, actualLeastSquareResults.getCovariance());
    assertSame(doubleMatrix, actualLeastSquareResults.getFittingParameterSensitivityToData());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LeastSquareResults#toString()}
   *   <li>{@link LeastSquareResults#getChiSq()}
   *   <li>{@link LeastSquareResults#getCovariance()}
   *   <li>{@link LeastSquareResults#getFitParameters()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double LeastSquareResults.getChiSq()",
    "DoubleMatrix LeastSquareResults.getCovariance()",
    "DoubleArray LeastSquareResults.getFitParameters()",
    "String LeastSquareResults.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    LeastSquareResults leastSquareResults =
        new LeastSquareResults(10.0d, parameters, DoubleMatrix.of());

    // Act
    String actualToStringResult = leastSquareResults.toString();
    double actualChiSq = leastSquareResults.getChiSq();
    DoubleMatrix actualCovariance = leastSquareResults.getCovariance();

    // Assert
    assertEquals(
        "LeastSquareResults [chiSq=10.0, fit parameters=[], covariance=]", actualToStringResult);
    assertEquals(10.0d, actualChiSq);
    assertSame(DoubleArray.EMPTY, leastSquareResults.getFitParameters());
    assertSame(DoubleMatrix.EMPTY, actualCovariance);
  }

  /**
   * Test {@link LeastSquareResults#getFittingParameterSensitivityToData()}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquareResults#getFittingParameterSensitivityToData()}
   */
  @Test
  @DisplayName("Test getFittingParameterSensitivityToData(); then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix LeastSquareResults.getFittingParameterSensitivityToData()"})
  void testGetFittingParameterSensitivityToData_thenReturnEmpty() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    DoubleMatrix covariance = DoubleMatrix.of();

    LeastSquareResults leastSquareResults =
        new LeastSquareResults(10.0d, parameters, covariance, DoubleMatrix.of());

    // Act and Assert
    assertSame(DoubleMatrix.EMPTY, leastSquareResults.getFittingParameterSensitivityToData());
  }

  /**
   * Test {@link LeastSquareResults#getFittingParameterSensitivityToData()}.
   *
   * <ul>
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquareResults#getFittingParameterSensitivityToData()}
   */
  @Test
  @DisplayName(
      "Test getFittingParameterSensitivityToData(); then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix LeastSquareResults.getFittingParameterSensitivityToData()"})
  void testGetFittingParameterSensitivityToData_thenThrowUnsupportedOperationException() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    LeastSquareResults leastSquareResults =
        new LeastSquareResults(10.0d, parameters, DoubleMatrix.of());

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> leastSquareResults.getFittingParameterSensitivityToData());
  }

  /**
   * Test {@link LeastSquareResults#equals(Object)}, and {@link LeastSquareResults#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LeastSquareResults#equals(Object)}
   *   <li>{@link LeastSquareResults#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquareResults.equals(Object)",
    "int LeastSquareResults.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    LeastSquareResults leastSquareResults =
        new LeastSquareResults(10.0d, parameters, DoubleMatrix.of());
    DoubleArray parameters2 = DoubleArray.of();
    LeastSquareResults leastSquareResults2 =
        new LeastSquareResults(10.0d, parameters2, DoubleMatrix.of());

    // Act and Assert
    assertEquals(leastSquareResults, leastSquareResults2);
    assertEquals(leastSquareResults.hashCode(), leastSquareResults2.hashCode());
  }

  /**
   * Test {@link LeastSquareResults#equals(Object)}, and {@link LeastSquareResults#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LeastSquareResults#equals(Object)}
   *   <li>{@link LeastSquareResults#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquareResults.equals(Object)",
    "int LeastSquareResults.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    LeastSquareResults leastSquareResults =
        new LeastSquareResults(10.0d, parameters, DoubleMatrix.of());

    // Act and Assert
    assertEquals(leastSquareResults, leastSquareResults);
    int expectedHashCodeResult = leastSquareResults.hashCode();
    assertEquals(expectedHashCodeResult, leastSquareResults.hashCode());
  }

  /**
   * Test {@link LeastSquareResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquareResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquareResults.equals(Object)",
    "int LeastSquareResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    LeastSquareResults leastSquareResults =
        new LeastSquareResults(1.0d, parameters, DoubleMatrix.of());
    DoubleArray parameters2 = DoubleArray.of();

    // Act and Assert
    assertNotEquals(
        leastSquareResults, new LeastSquareResults(10.0d, parameters2, DoubleMatrix.of()));
  }

  /**
   * Test {@link LeastSquareResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquareResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquareResults.equals(Object)",
    "int LeastSquareResults.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();
    DoubleMatrix covariance = DoubleMatrix.of();

    LeastSquareResults leastSquareResults =
        new LeastSquareResults(10.0d, parameters, covariance, DoubleMatrix.of());
    DoubleArray parameters2 = DoubleArray.of();

    // Act and Assert
    assertNotEquals(
        leastSquareResults, new LeastSquareResults(10.0d, parameters2, DoubleMatrix.of()));
  }

  /**
   * Test {@link LeastSquareResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquareResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquareResults.equals(Object)",
    "int LeastSquareResults.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();

    // Act and Assert
    assertNotEquals(new LeastSquareResults(10.0d, parameters, DoubleMatrix.of()), null);
  }

  /**
   * Test {@link LeastSquareResults#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquareResults#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquareResults.equals(Object)",
    "int LeastSquareResults.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DoubleArray parameters = DoubleArray.of();

    // Act and Assert
    assertNotEquals(
        new LeastSquareResults(10.0d, parameters, DoubleMatrix.of()),
        "Different type to LeastSquareResults");
  }
}
