package com.opengamma.strata.math.impl.regression;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LeastSquaresRegressionResultDiffblueTest {
  /**
   * Test {@link
   * LeastSquaresRegressionResult#LeastSquaresRegressionResult(LeastSquaresRegressionResult)}.
   *
   * <p>Method under test: {@link
   * LeastSquaresRegressionResult#LeastSquaresRegressionResult(LeastSquaresRegressionResult)}
   */
  @Test
  @DisplayName("Test new LeastSquaresRegressionResult(LeastSquaresRegressionResult)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegressionResult.<init>(LeastSquaresRegressionResult)"})
  void testNewLeastSquaresRegressionResult() {
    // Arrange
    LeastSquaresRegressionResult result =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act
    LeastSquaresRegressionResult actualLeastSquaresRegressionResult =
        new LeastSquaresRegressionResult(result);

    // Assert
    assertEquals(result, actualLeastSquaresRegressionResult);
  }

  /**
   * Test {@link
   * LeastSquaresRegressionResult#LeastSquaresRegressionResult(LeastSquaresRegressionResult)}.
   *
   * <p>Method under test: {@link
   * LeastSquaresRegressionResult#LeastSquaresRegressionResult(LeastSquaresRegressionResult)}
   */
  @Test
  @DisplayName("Test new LeastSquaresRegressionResult(LeastSquaresRegressionResult)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegressionResult.<init>(LeastSquaresRegressionResult)"})
  void testNewLeastSquaresRegressionResult2() {
    // Arrange
    LeastSquaresRegressionResult result =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            false);

    // Act
    LeastSquaresRegressionResult actualLeastSquaresRegressionResult =
        new LeastSquaresRegressionResult(result);

    // Assert
    assertEquals(result, actualLeastSquaresRegressionResult);
  }

  /**
   * Test {@link LeastSquaresRegressionResult#LeastSquaresRegressionResult(double[], double[],
   * double, double[], double, double, double[], double[], boolean)}.
   *
   * <p>Method under test: {@link
   * LeastSquaresRegressionResult#LeastSquaresRegressionResult(double[], double[], double, double[],
   * double, double, double[], double[], boolean)}
   */
  @Test
  @DisplayName(
      "Test new LeastSquaresRegressionResult(double[], double[], double, double[], double, double, double[], double[], boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void LeastSquaresRegressionResult.<init>(double[], double[], double, double[], double, double, double[], double[], boolean)"
  })
  void testNewLeastSquaresRegressionResult3() {
    // Arrange and Act
    LeastSquaresRegressionResult actualLeastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Assert
    assertEquals(10.0d, actualLeastSquaresRegressionResult.getAdjustedRSquared());
    assertEquals(10.0d, actualLeastSquaresRegressionResult.getMeanSquareError());
    assertEquals(10.0d, actualLeastSquaresRegressionResult.getRSquared());
    assertTrue(actualLeastSquaresRegressionResult.hasIntercept());
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualLeastSquaresRegressionResult.getBetas(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualLeastSquaresRegressionResult.getPValues(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualLeastSquaresRegressionResult.getResiduals(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualLeastSquaresRegressionResult.getStandardErrorOfBetas(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.5d, 10.0d, 0.5d},
        actualLeastSquaresRegressionResult.getTStatistics(),
        0.0);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LeastSquaresRegressionResult#getAdjustedRSquared()}
   *   <li>{@link LeastSquaresRegressionResult#getBetas()}
   *   <li>{@link LeastSquaresRegressionResult#getMeanSquareError()}
   *   <li>{@link LeastSquaresRegressionResult#getPValues()}
   *   <li>{@link LeastSquaresRegressionResult#getRSquared()}
   *   <li>{@link LeastSquaresRegressionResult#getResiduals()}
   *   <li>{@link LeastSquaresRegressionResult#getStandardErrorOfBetas()}
   *   <li>{@link LeastSquaresRegressionResult#getTStatistics()}
   *   <li>{@link LeastSquaresRegressionResult#hasIntercept()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double LeastSquaresRegressionResult.getAdjustedRSquared()",
    "double[] LeastSquaresRegressionResult.getBetas()",
    "double LeastSquaresRegressionResult.getMeanSquareError()",
    "double[] LeastSquaresRegressionResult.getPValues()",
    "double LeastSquaresRegressionResult.getRSquared()",
    "double[] LeastSquaresRegressionResult.getResiduals()",
    "double[] LeastSquaresRegressionResult.getStandardErrorOfBetas()",
    "double[] LeastSquaresRegressionResult.getTStatistics()",
    "boolean LeastSquaresRegressionResult.hasIntercept()"
  })
  void testGettersAndSetters() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act
    double actualAdjustedRSquared = leastSquaresRegressionResult.getAdjustedRSquared();
    double[] actualBetas = leastSquaresRegressionResult.getBetas();
    double actualMeanSquareError = leastSquaresRegressionResult.getMeanSquareError();
    double[] actualPValues = leastSquaresRegressionResult.getPValues();
    double actualRSquared = leastSquaresRegressionResult.getRSquared();
    double[] actualResiduals = leastSquaresRegressionResult.getResiduals();
    double[] actualStandardErrorOfBetas = leastSquaresRegressionResult.getStandardErrorOfBetas();
    double[] actualTStatistics = leastSquaresRegressionResult.getTStatistics();

    // Assert
    assertEquals(10.0d, actualAdjustedRSquared);
    assertEquals(10.0d, actualMeanSquareError);
    assertEquals(10.0d, actualRSquared);
    assertTrue(leastSquaresRegressionResult.hasIntercept());
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, actualBetas, 0.0);
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, actualPValues, 0.0);
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, actualResiduals, 0.0);
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, actualStandardErrorOfBetas, 0.0);
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, actualTStatistics, 0.0);
  }

  /**
   * Test {@link LeastSquaresRegressionResult#getPredictedValue(double[])}.
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#getPredictedValue(double[])}
   */
  @Test
  @DisplayName("Test getPredictedValue(double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LeastSquaresRegressionResult.getPredictedValue(double[])"})
  void testGetPredictedValue() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            false);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            leastSquaresRegressionResult.getPredictedValue(
                new double[] {2.0d, 10.0d, 2.0d, 10.0d}));
  }

  /**
   * Test {@link LeastSquaresRegressionResult#getPredictedValue(double[])}.
   *
   * <ul>
   *   <li>Then return fifty.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#getPredictedValue(double[])}
   */
  @Test
  @DisplayName("Test getPredictedValue(double[]); then return fifty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LeastSquaresRegressionResult.getPredictedValue(double[])"})
  void testGetPredictedValue_thenReturnFifty() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            false);

    // Act
    double actualPredictedValue =
        leastSquaresRegressionResult.getPredictedValue(new double[] {2.0d, 10.0d, 2.0d, 10.0d});

    // Assert
    assertEquals(50.0d, actualPredictedValue);
  }

  /**
   * Test {@link LeastSquaresRegressionResult#getPredictedValue(double[])}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#getPredictedValue(double[])}
   */
  @Test
  @DisplayName("Test getPredictedValue(double[]); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LeastSquaresRegressionResult.getPredictedValue(double[])"})
  void testGetPredictedValue_thenThrowIllegalArgumentException() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            leastSquaresRegressionResult.getPredictedValue(
                new double[] {2.0d, 10.0d, 2.0d, 10.0d}));
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}, and {@link
   * LeastSquaresRegressionResult#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LeastSquaresRegressionResult#equals(Object)}
   *   <li>{@link LeastSquaresRegressionResult#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);
    LeastSquaresRegressionResult leastSquaresRegressionResult2 =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertEquals(leastSquaresRegressionResult, leastSquaresRegressionResult2);
    assertEquals(leastSquaresRegressionResult.hashCode(), leastSquaresRegressionResult2.hashCode());
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}, and {@link
   * LeastSquaresRegressionResult#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link LeastSquaresRegressionResult#equals(Object)}
   *   <li>{@link LeastSquaresRegressionResult#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertEquals(leastSquaresRegressionResult, leastSquaresRegressionResult);
    int expectedHashCodeResult = leastSquaresRegressionResult.hashCode();
    assertEquals(expectedHashCodeResult, leastSquaresRegressionResult.hashCode());
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            null,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertNotEquals(
        leastSquaresRegressionResult,
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true));
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            null,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertNotEquals(
        leastSquaresRegressionResult,
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true));
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            0.5d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertNotEquals(
        leastSquaresRegressionResult,
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true));
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            null,
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertNotEquals(
        leastSquaresRegressionResult,
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true));
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            0.5d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertNotEquals(
        leastSquaresRegressionResult,
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true));
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            0.5d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertNotEquals(
        leastSquaresRegressionResult,
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true));
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual7() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            null,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true);

    // Act and Assert
    assertNotEquals(
        leastSquaresRegressionResult,
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true));
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual8() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            null,
            true);

    // Act and Assert
    assertNotEquals(
        leastSquaresRegressionResult,
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true));
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual9() {
    // Arrange
    LeastSquaresRegressionResult leastSquaresRegressionResult =
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            false);

    // Act and Assert
    assertNotEquals(
        leastSquaresRegressionResult,
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true));
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true),
        null);
  }

  /**
   * Test {@link LeastSquaresRegressionResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegressionResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean LeastSquaresRegressionResult.equals(Object)",
    "int LeastSquaresRegressionResult.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new LeastSquaresRegressionResult(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            10.0d,
            10.0d,
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            true),
        "Different type to LeastSquaresRegressionResult");
  }
}
