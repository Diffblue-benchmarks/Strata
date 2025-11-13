package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SmithWilsonCurveFunctionDiffblueTest {
  /**
   * Test {@link SmithWilsonCurveFunction#gap(double, double, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#gap(double, double, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test gap(double, double, DoubleArray, DoubleArray); when DoubleArray; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SmithWilsonCurveFunction.gap(double, double, DoubleArray, DoubleArray)"
  })
  void testGap_whenDoubleArray_thenReturnZero() {
    // Arrange
    DoubleArray nodes = DoubleArray.of();

    // Act and Assert
    assertEquals(0.0d, SmithWilsonCurveFunction.gap(2.0d, 10.0d, nodes, DoubleArray.of()));
  }

  /**
   * Test {@link SmithWilsonCurveFunction#gap(double, double, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#gap(double, double, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test gap(double, double, DoubleArray, DoubleArray); when filled three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SmithWilsonCurveFunction.gap(double, double, DoubleArray, DoubleArray)"
  })
  void testGap_whenFilledThree_thenReturnZero() {
    // Arrange
    DoubleArray nodes = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(0.0d, SmithWilsonCurveFunction.gap(2.0d, 10.0d, nodes, DoubleArray.filled(3)));
  }

  /**
   * Test {@link SmithWilsonCurveFunction#value(double, double, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code -0.0}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#value(double, double, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test value(double, double, DoubleArray, DoubleArray); when '-0.0'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SmithWilsonCurveFunction.value(double, double, DoubleArray, DoubleArray)"
  })
  void testValue_when00_thenReturnOne() {
    // Arrange
    DoubleArray nodes = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(
        1.0d, SmithWilsonCurveFunction.DEFAULT.value(-0.0d, 10.0d, nodes, DoubleArray.filled(3)));
  }

  /**
   * Test {@link SmithWilsonCurveFunction#value(double, double, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code 1.0207840124139875}.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#value(double, double, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test value(double, double, DoubleArray, DoubleArray); when '-0.5'; then return '1.0207840124139875'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SmithWilsonCurveFunction.value(double, double, DoubleArray, DoubleArray)"
  })
  void testValue_when05_thenReturn10207840124139875() {
    // Arrange
    DoubleArray nodes = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(
        1.0207840124139875d,
        SmithWilsonCurveFunction.DEFAULT.value(-0.5d, 10.0d, nodes, DoubleArray.filled(3)));
  }

  /**
   * Test {@link SmithWilsonCurveFunction#value(double, double, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#value(double, double, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test value(double, double, DoubleArray, DoubleArray); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SmithWilsonCurveFunction.value(double, double, DoubleArray, DoubleArray)"
  })
  void testValue_whenNaN_thenReturnNaN() {
    // Arrange
    DoubleArray nodes = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(
        Double.NaN,
        SmithWilsonCurveFunction.DEFAULT.value(Double.NaN, 10.0d, nodes, DoubleArray.filled(3)));
  }

  /**
   * Test {@link SmithWilsonCurveFunction#value(double, double, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.9210104589947723}.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#value(double, double, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test value(double, double, DoubleArray, DoubleArray); when two; then return '0.9210104589947723'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SmithWilsonCurveFunction.value(double, double, DoubleArray, DoubleArray)"
  })
  void testValue_whenTwo_thenReturn09210104589947723() {
    // Arrange
    DoubleArray nodes = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(
        0.9210104589947723d,
        SmithWilsonCurveFunction.DEFAULT.value(2.0d, 10.0d, nodes, DoubleArray.filled(3)));
  }

  /**
   * Test {@link SmithWilsonCurveFunction#value(double, double, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#value(double, double, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName("Test value(double, double, DoubleArray, DoubleArray); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SmithWilsonCurveFunction.value(double, double, DoubleArray, DoubleArray)"
  })
  void testValue_whenZero_thenReturnOne() {
    // Arrange
    DoubleArray nodes = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(
        1.0d, SmithWilsonCurveFunction.DEFAULT.value(0.0d, 10.0d, nodes, DoubleArray.filled(3)));
  }

  /**
   * Test {@link SmithWilsonCurveFunction#firstDerivative(double, double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return {@code 84.48472171708933}.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#firstDerivative(double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test firstDerivative(double, double, DoubleArray, DoubleArray); when DoubleArray with value is ten; then return '84.48472171708933'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SmithWilsonCurveFunction.firstDerivative(double, double, DoubleArray, DoubleArray)"
  })
  void testFirstDerivative_whenDoubleArrayWithValueIsTen_thenReturn8448472171708933() {
    // Arrange
    DoubleArray nodes = DoubleArray.of(10.0d);

    // Act and Assert
    assertEquals(
        84.48472171708933d,
        SmithWilsonCurveFunction.DEFAULT.firstDerivative(
            2.0d, 10.0d, nodes, DoubleArray.of(10.0d)));
  }

  /**
   * Test {@link SmithWilsonCurveFunction#firstDerivative(double, double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return {@code -0.03789216011138259}.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#firstDerivative(double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test firstDerivative(double, double, DoubleArray, DoubleArray); when filled three; then return '-0.03789216011138259'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SmithWilsonCurveFunction.firstDerivative(double, double, DoubleArray, DoubleArray)"
  })
  void testFirstDerivative_whenFilledThree_thenReturn003789216011138259() {
    // Arrange
    DoubleArray nodes = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(
        -0.03789216011138259d,
        SmithWilsonCurveFunction.DEFAULT.firstDerivative(
            2.0d, 10.0d, nodes, DoubleArray.filled(3)));
  }

  /**
   * Test {@link SmithWilsonCurveFunction#firstDerivative(double, double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#firstDerivative(double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test firstDerivative(double, double, DoubleArray, DoubleArray); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SmithWilsonCurveFunction.firstDerivative(double, double, DoubleArray, DoubleArray)"
  })
  void testFirstDerivative_whenNaN_thenReturnNaN() {
    // Arrange
    DoubleArray nodes = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(
        Double.NaN,
        SmithWilsonCurveFunction.DEFAULT.firstDerivative(
            Double.NaN, 10.0d, nodes, DoubleArray.filled(3)));
  }

  /**
   * Test {@link SmithWilsonCurveFunction#firstDerivative(double, double, DoubleArray,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code -0.04114194333117521}.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#firstDerivative(double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test firstDerivative(double, double, DoubleArray, DoubleArray); when zero; then return '-0.04114194333117521'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SmithWilsonCurveFunction.firstDerivative(double, double, DoubleArray, DoubleArray)"
  })
  void testFirstDerivative_whenZero_thenReturn004114194333117521() {
    // Arrange
    DoubleArray nodes = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(
        -0.04114194333117521d,
        SmithWilsonCurveFunction.DEFAULT.firstDerivative(
            0.0d, 10.0d, nodes, DoubleArray.filled(3)));
  }

  /**
   * Test {@link SmithWilsonCurveFunction#parameterSensitivity(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#parameterSensitivity(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test parameterSensitivity(double, double, DoubleArray); when DoubleArray with value is ten; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray SmithWilsonCurveFunction.parameterSensitivity(double, double, DoubleArray)"
  })
  void testParameterSensitivity_whenDoubleArrayWithValueIsTen_thenReturnSizeIsOne() {
    // Arrange and Act
    DoubleArray actualParameterSensitivityResult =
        SmithWilsonCurveFunction.DEFAULT.parameterSensitivity(2.0d, 10.0d, DoubleArray.of(10.0d));

    // Assert
    assertEquals(1, actualParameterSensitivityResult.size());
    List<Double> toListResult = actualParameterSensitivityResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(18.420209179895444d, actualParameterSensitivityResult.max());
    assertEquals(18.420209179895444d, actualParameterSensitivityResult.min());
    assertEquals(18.420209179895444d, actualParameterSensitivityResult.sum());
    assertEquals(18.420209179895444d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {18.420209179895444d}, actualParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SmithWilsonCurveFunction#parameterSensitivity(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#parameterSensitivity(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test parameterSensitivity(double, double, DoubleArray); when filled three; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray SmithWilsonCurveFunction.parameterSensitivity(double, double, DoubleArray)"
  })
  void testParameterSensitivity_whenFilledThree_thenReturnFilledThree() {
    // Arrange
    DoubleArray nodes = DoubleArray.filled(3);

    // Act
    DoubleArray actualParameterSensitivityResult =
        SmithWilsonCurveFunction.DEFAULT.parameterSensitivity(2.0d, 10.0d, nodes);

    // Assert
    assertEquals(nodes, actualParameterSensitivityResult);
  }

  /**
   * Test {@link SmithWilsonCurveFunction#parameterSensitivity(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#parameterSensitivity(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test parameterSensitivity(double, double, DoubleArray); when NaN; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray SmithWilsonCurveFunction.parameterSensitivity(double, double, DoubleArray)"
  })
  void testParameterSensitivity_whenNaN_thenReturnSizeIsThree() {
    // Arrange and Act
    DoubleArray actualParameterSensitivityResult =
        SmithWilsonCurveFunction.DEFAULT.parameterSensitivity(
            Double.NaN, 10.0d, DoubleArray.filled(3));

    // Assert
    assertEquals(3, actualParameterSensitivityResult.size());
    List<Double> toListResult = actualParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(Double.NaN, actualParameterSensitivityResult.max());
    assertEquals(Double.NaN, actualParameterSensitivityResult.min());
    assertEquals(Double.NaN, actualParameterSensitivityResult.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN},
        actualParameterSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SmithWilsonCurveFunction#parameterSensitivity(double, double, DoubleArray)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return filled three.
   * </ul>
   *
   * <p>Method under test: {@link SmithWilsonCurveFunction#parameterSensitivity(double, double,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test parameterSensitivity(double, double, DoubleArray); when zero; then return filled three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray SmithWilsonCurveFunction.parameterSensitivity(double, double, DoubleArray)"
  })
  void testParameterSensitivity_whenZero_thenReturnFilledThree() {
    // Arrange
    DoubleArray nodes = DoubleArray.filled(3);

    // Act
    DoubleArray actualParameterSensitivityResult =
        SmithWilsonCurveFunction.DEFAULT.parameterSensitivity(0.0d, 10.0d, nodes);

    // Assert
    assertEquals(nodes, actualParameterSensitivityResult);
  }
}
