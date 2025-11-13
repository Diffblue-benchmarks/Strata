package com.opengamma.strata.math.impl.function;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.interpolation.PiecewisePolynomialResultsWithSensitivity;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PiecewisePolynomialWithSensitivityFunction1DDiffblueTest {
  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>Then return min is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'; then return min is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testNodeSensitivityWithPpXKey_thenReturnMinIs05() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.identity(3)};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);

    // Act
    DoubleArray actualNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(pp, -0.5d);

    // Assert
    assertEquals(-0.5d, actualNodeSensitivityResult.min());
    List<Double> toListResult = actualNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-0.5d, toListResult.get(1).doubleValue());
    assertEquals(0.25d, toListResult.get(0).doubleValue());
    assertEquals(0.75d, actualNodeSensitivityResult.sum());
    assertArrayEquals(
        new double[] {0.25d, -0.5d, 1.0d}, actualNodeSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testNodeSensitivityWithPpXKey_thenReturnMinIsZero() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.identity(3)};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);

    // Act
    DoubleArray actualNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(pp, -0.0d);

    // Assert
    assertEquals(0.0d, actualNodeSensitivityResult.min());
    List<Double> toListResult = actualNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, actualNodeSensitivityResult.sum());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0d}, actualNodeSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>Then return toList second doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'; then return toList second doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testNodeSensitivityWithPpXKey_thenReturnToListSecondDoubleValueIsTen() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 1, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray actualNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(pp, 10.0d);

    // Assert
    List<Double> toListResult = actualNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(100.0d, actualNodeSensitivityResult.max());
    assertEquals(100.0d, toListResult.get(0).doubleValue());
    assertEquals(111.0d, actualNodeSensitivityResult.sum());
    assertArrayEquals(
        new double[] {100.0d, 10.0d, 1.0d}, actualNodeSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return toList first doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'; when one; then return toList first doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testNodeSensitivityWithPpXKey_whenOne_thenReturnToListFirstDoubleValueIsOne() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 1, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray actualNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(pp, 1.0d);

    // Assert
    List<Double> toListResult = actualNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(3.0d, actualNodeSensitivityResult.sum());
    assertArrayEquals(
        new double[] {1.0d, 1.0d, 1.0d}, actualNodeSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'; when zero; then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testNodeSensitivityWithPpXKey_whenZero_thenReturnMinIsZero() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 1, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray actualNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(pp, 0.0d);

    // Assert
    assertEquals(0.0d, actualNodeSensitivityResult.min());
    List<Double> toListResult = actualNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, actualNodeSensitivityResult.sum());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0d}, actualNodeSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testNodeSensitivityWithPpXKeys() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 1, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray[] actualNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(
            pp, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    DoubleArray doubleArray = actualNodeSensitivityResult[0];
    List<Double> toListResult = doubleArray.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(100.0d, doubleArray.max());
    assertEquals(100.0d, toListResult.get(0).doubleValue());
    assertEquals(111.0d, doubleArray.sum());
    assertEquals(4, actualNodeSensitivityResult.length);
    DoubleArray doubleArray2 = actualNodeSensitivityResult[1];
    assertEquals(doubleArray2, actualNodeSensitivityResult[3]);
    assertArrayEquals(new double[] {0.25d, 0.5d, 1.0d}, doubleArray2.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {100.0d, 10.0d, 1.0d}, doubleArray.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {100.0d, 10.0d, 1.0d}, actualNodeSensitivityResult[2].toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testNodeSensitivityWithPpXKeys2() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 1, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray[] actualNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(
            pp, new double[] {0.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(4, actualNodeSensitivityResult.length);
    DoubleArray doubleArray = actualNodeSensitivityResult[1];
    assertEquals(doubleArray, actualNodeSensitivityResult[3]);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0d}, actualNodeSensitivityResult[0].toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {0.25d, 0.5d, 1.0d}, doubleArray.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {100.0d, 10.0d, 1.0d}, actualNodeSensitivityResult[2].toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testNodeSensitivityWithPpXKeys_thenReturnArrayLengthIsZero() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);

    // Act and Assert
    assertEquals(
        0,
        piecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(pp, new double[] {}).length);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return eleventh element is second element.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return eleventh element is second element")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testNodeSensitivityWithPpXKeys_thenReturnEleventhElementIsSecondElement() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.identity(3)};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);

    // Act
    DoubleArray[] actualNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(
            pp,
            new double[] {
              -0.5d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d,
              -0.0d, -0.0d, -0.0d, -0.0d, -0.0d
            });

    // Assert
    assertEquals(17, actualNodeSensitivityResult.length);
    DoubleArray doubleArray = actualNodeSensitivityResult[1];
    assertEquals(doubleArray, actualNodeSensitivityResult[10]);
    assertEquals(doubleArray, actualNodeSensitivityResult[11]);
    assertEquals(doubleArray, actualNodeSensitivityResult[12]);
    assertEquals(doubleArray, actualNodeSensitivityResult[13]);
    assertEquals(doubleArray, actualNodeSensitivityResult[14]);
    assertEquals(doubleArray, actualNodeSensitivityResult[15]);
    assertEquals(doubleArray, actualNodeSensitivityResult[2]);
    assertEquals(doubleArray, actualNodeSensitivityResult[3]);
    assertEquals(doubleArray, actualNodeSensitivityResult[4]);
    assertEquals(doubleArray, actualNodeSensitivityResult[5]);
    assertEquals(doubleArray, actualNodeSensitivityResult[6]);
    assertEquals(doubleArray, actualNodeSensitivityResult[7]);
    assertEquals(doubleArray, actualNodeSensitivityResult[8]);
    assertEquals(doubleArray, actualNodeSensitivityResult[9]);
    assertEquals(doubleArray, actualNodeSensitivityResult[Short.SIZE]);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return first element toList first doubleValue is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return first element toList first doubleValue is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testNodeSensitivityWithPpXKeys_thenReturnFirstElementToListFirstDoubleValueIsOne() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 1, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray[] actualNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(
            pp, new double[] {1.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    DoubleArray doubleArray = actualNodeSensitivityResult[0];
    List<Double> toListResult = doubleArray.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(3.0d, doubleArray.sum());
    assertEquals(4, actualNodeSensitivityResult.length);
    DoubleArray doubleArray2 = actualNodeSensitivityResult[1];
    assertEquals(doubleArray2, actualNodeSensitivityResult[3]);
    assertArrayEquals(new double[] {0.25d, 0.5d, 1.0d}, doubleArray2.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {1.0d, 1.0d, 1.0d}, doubleArray.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {100.0d, 10.0d, 1.0d}, actualNodeSensitivityResult[2].toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return second element is first element.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#nodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return second element is first element")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testNodeSensitivityWithPpXKeys_thenReturnSecondElementIsFirstElement() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.identity(3)};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);

    // Act
    DoubleArray[] actualNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.nodeSensitivity(
            pp,
            new double[] {
              -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d, -0.0d,
              -0.0d, -0.0d, -0.0d, -0.0d, -0.0d
            });

    // Assert
    assertEquals(17, actualNodeSensitivityResult.length);
    DoubleArray doubleArray = actualNodeSensitivityResult[0];
    assertEquals(doubleArray, actualNodeSensitivityResult[1]);
    assertEquals(doubleArray, actualNodeSensitivityResult[10]);
    assertEquals(doubleArray, actualNodeSensitivityResult[11]);
    assertEquals(doubleArray, actualNodeSensitivityResult[12]);
    assertEquals(doubleArray, actualNodeSensitivityResult[13]);
    assertEquals(doubleArray, actualNodeSensitivityResult[14]);
    assertEquals(doubleArray, actualNodeSensitivityResult[15]);
    assertEquals(doubleArray, actualNodeSensitivityResult[2]);
    assertEquals(doubleArray, actualNodeSensitivityResult[3]);
    assertEquals(doubleArray, actualNodeSensitivityResult[4]);
    assertEquals(doubleArray, actualNodeSensitivityResult[5]);
    assertEquals(doubleArray, actualNodeSensitivityResult[6]);
    assertEquals(doubleArray, actualNodeSensitivityResult[7]);
    assertEquals(doubleArray, actualNodeSensitivityResult[8]);
    assertEquals(doubleArray, actualNodeSensitivityResult[9]);
    assertEquals(doubleArray, actualNodeSensitivityResult[Short.SIZE]);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testDifferentiateNodeSensitivityWithPpXKey() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 2, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray actualDifferentiateNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(pp, 10.0d);

    // Assert
    List<Double> toListResult = actualDifferentiateNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, actualDifferentiateNodeSensitivityResult.max());
    assertEquals(1.0d, actualDifferentiateNodeSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {1.0d, 0.0d, 0.0d},
        actualDifferentiateNodeSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testDifferentiateNodeSensitivityWithPpXKey2() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.identity(3)};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 2, 1, coeffSense);

    // Act
    DoubleArray actualDifferentiateNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(pp, -0.5d);

    // Assert
    List<Double> toListResult = actualDifferentiateNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, actualDifferentiateNodeSensitivityResult.max());
    assertEquals(1.0d, actualDifferentiateNodeSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {1.0d, 0.0d, 0.0d},
        actualDifferentiateNodeSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testDifferentiateNodeSensitivityWithPpXKey3() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 3, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray actualDifferentiateNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(pp, 10.0d);

    // Assert
    List<Double> toListResult = actualDifferentiateNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(20.0d, actualDifferentiateNodeSensitivityResult.max());
    assertEquals(20.0d, toListResult.get(0).doubleValue());
    assertEquals(21.0d, actualDifferentiateNodeSensitivityResult.sum());
    assertArrayEquals(
        new double[] {20.0d, 1.0d, 0.0d},
        actualDifferentiateNodeSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testDifferentiateNodeSensitivityWithPpXKey4() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 2, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray actualDifferentiateNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(pp, 0.0d);

    // Assert
    List<Double> toListResult = actualDifferentiateNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, actualDifferentiateNodeSensitivityResult.max());
    assertEquals(1.0d, actualDifferentiateNodeSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {1.0d, 0.0d, 0.0d},
        actualDifferentiateNodeSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testDifferentiateNodeSensitivityWithPpXKey5() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.identity(3)};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 2, 1, coeffSense);

    // Act
    DoubleArray actualDifferentiateNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(pp, -0.0d);

    // Assert
    List<Double> toListResult = actualDifferentiateNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, actualDifferentiateNodeSensitivityResult.max());
    assertEquals(1.0d, actualDifferentiateNodeSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {1.0d, 0.0d, 0.0d},
        actualDifferentiateNodeSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateNodeSensitivityWithPpXKeys_thenReturnArrayLengthIsZero() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.of(10.0d);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 2, 1, coeffSense);

    // Act and Assert
    assertEquals(
        0,
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(
                pp, new double[] {})
            .length);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateNodeSensitivityWithPpXKeys_thenReturnArrayLengthIsZero2() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 2, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.of()});

    // Act and Assert
    assertEquals(
        0,
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(
                pp, new double[] {})
            .length);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return first element max is twenty.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return first element max is twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateNodeSensitivityWithPpXKeys_thenReturnFirstElementMaxIsTwenty() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 3, 1, new DoubleMatrix[] {identityResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray[] actualDifferentiateNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(
            pp, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    DoubleArray doubleArray = actualDifferentiateNodeSensitivityResult[0];
    assertEquals(20.0d, doubleArray.max());
    List<Double> toListResult = doubleArray.toList();
    assertEquals(3, toListResult.size());
    assertEquals(20.0d, toListResult.get(0).doubleValue());
    assertEquals(21.0d, doubleArray.sum());
    assertEquals(4, actualDifferentiateNodeSensitivityResult.length);
    DoubleArray doubleArray2 = actualDifferentiateNodeSensitivityResult[1];
    assertEquals(doubleArray2, actualDifferentiateNodeSensitivityResult[3]);
    assertArrayEquals(new double[] {1.0d, 1.0d, 0.0d}, doubleArray2.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {20.0d, 1.0d, 0.0d}, doubleArray.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {20.0d, 1.0d, 0.0d},
        actualDifferentiateNodeSensitivityResult[2].toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return first element max is two.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return first element max is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateNodeSensitivityWithPpXKeys_thenReturnFirstElementMaxIsTwo() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 3, 1, new DoubleMatrix[] {identityResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray[] actualDifferentiateNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(
            pp, new double[] {1.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    DoubleArray doubleArray = actualDifferentiateNodeSensitivityResult[0];
    assertEquals(2.0d, doubleArray.max());
    DoubleArray doubleArray2 = actualDifferentiateNodeSensitivityResult[2];
    assertEquals(3, doubleArray2.toList().size());
    assertEquals(3.0d, doubleArray.sum());
    assertEquals(4, actualDifferentiateNodeSensitivityResult.length);
    DoubleArray doubleArray3 = actualDifferentiateNodeSensitivityResult[1];
    assertEquals(doubleArray3, actualDifferentiateNodeSensitivityResult[3]);
    assertArrayEquals(new double[] {1.0d, 1.0d, 0.0d}, doubleArray3.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {2.0d, 1.0d, 0.0d}, doubleArray.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {20.0d, 1.0d, 0.0d}, doubleArray2.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return third element is first element.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return third element is first element")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateNodeSensitivityWithPpXKeys_thenReturnThirdElementIsFirstElement() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 2, 1, new DoubleMatrix[] {identityResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray[] actualDifferentiateNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(
            pp, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(4, actualDifferentiateNodeSensitivityResult.length);
    DoubleArray doubleArray = actualDifferentiateNodeSensitivityResult[0];
    assertEquals(doubleArray, actualDifferentiateNodeSensitivityResult[1]);
    assertEquals(doubleArray, actualDifferentiateNodeSensitivityResult[2]);
    assertEquals(doubleArray, actualDifferentiateNodeSensitivityResult[3]);
    assertArrayEquals(new double[] {1.0d, 0.0d, 0.0d}, doubleArray.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return third element is first element.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return third element is first element")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateNodeSensitivityWithPpXKeys_thenReturnThirdElementIsFirstElement2() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 2, 1, new DoubleMatrix[] {identityResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray[] actualDifferentiateNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(
            pp, new double[] {0.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(4, actualDifferentiateNodeSensitivityResult.length);
    DoubleArray doubleArray = actualDifferentiateNodeSensitivityResult[0];
    assertEquals(doubleArray, actualDifferentiateNodeSensitivityResult[1]);
    assertEquals(doubleArray, actualDifferentiateNodeSensitivityResult[2]);
    assertEquals(doubleArray, actualDifferentiateNodeSensitivityResult[3]);
    assertArrayEquals(new double[] {1.0d, 0.0d, 0.0d}, doubleArray.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>When array of {@code double} with {@code -0.5} and {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; when array of double with '-0.5' and '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateNodeSensitivityWithPpXKeys_whenArrayOfDoubleWith05And05() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 2, 1, new DoubleMatrix[] {identityResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray[] actualDifferentiateNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateNodeSensitivity(
            pp, new double[] {-0.5d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(4, actualDifferentiateNodeSensitivityResult.length);
    DoubleArray doubleArray = actualDifferentiateNodeSensitivityResult[0];
    assertEquals(doubleArray, actualDifferentiateNodeSensitivityResult[1]);
    assertArrayEquals(new double[] {1.0d, 0.0d, 0.0d}, doubleArray.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testDifferentiateTwiceNodeSensitivityWithPpXKey() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 3, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray actualDifferentiateTwiceNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(pp, 10.0d);

    // Assert
    assertEquals(0.0d, actualDifferentiateTwiceNodeSensitivityResult.min());
    List<Double> toListResult = actualDifferentiateTwiceNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, actualDifferentiateTwiceNodeSensitivityResult.dimensions());
    assertEquals(2.0d, actualDifferentiateTwiceNodeSensitivityResult.max());
    assertEquals(2.0d, actualDifferentiateTwiceNodeSensitivityResult.sum());
    assertEquals(2.0d, toListResult.get(0).doubleValue());
    assertEquals(3, actualDifferentiateTwiceNodeSensitivityResult.size());
    assertFalse(actualDifferentiateTwiceNodeSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {2.0d, 0.0d, 0.0d},
        actualDifferentiateTwiceNodeSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testDifferentiateTwiceNodeSensitivityWithPpXKey2() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.identity(3)};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 3, 1, coeffSense);

    // Act
    DoubleArray actualDifferentiateTwiceNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(pp, -0.5d);

    // Assert
    assertEquals(0.0d, actualDifferentiateTwiceNodeSensitivityResult.min());
    List<Double> toListResult = actualDifferentiateTwiceNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, actualDifferentiateTwiceNodeSensitivityResult.dimensions());
    assertEquals(2.0d, actualDifferentiateTwiceNodeSensitivityResult.max());
    assertEquals(2.0d, actualDifferentiateTwiceNodeSensitivityResult.sum());
    assertEquals(2.0d, toListResult.get(0).doubleValue());
    assertEquals(3, actualDifferentiateTwiceNodeSensitivityResult.size());
    assertFalse(actualDifferentiateTwiceNodeSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {2.0d, 0.0d, 0.0d},
        actualDifferentiateTwiceNodeSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testDifferentiateTwiceNodeSensitivityWithPpXKey3() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 3, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act
    DoubleArray actualDifferentiateTwiceNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(pp, 0.0d);

    // Assert
    assertEquals(0.0d, actualDifferentiateTwiceNodeSensitivityResult.min());
    List<Double> toListResult = actualDifferentiateTwiceNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, actualDifferentiateTwiceNodeSensitivityResult.dimensions());
    assertEquals(2.0d, actualDifferentiateTwiceNodeSensitivityResult.max());
    assertEquals(2.0d, actualDifferentiateTwiceNodeSensitivityResult.sum());
    assertEquals(2.0d, toListResult.get(0).doubleValue());
    assertEquals(3, actualDifferentiateTwiceNodeSensitivityResult.size());
    assertFalse(actualDifferentiateTwiceNodeSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {2.0d, 0.0d, 0.0d},
        actualDifferentiateTwiceNodeSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)} with {@code pp}, {@code xKey}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double)}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double) with 'pp', 'xKey'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray PiecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double)"
  })
  void testDifferentiateTwiceNodeSensitivityWithPpXKey4() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.identity(3)};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 3, 1, coeffSense);

    // Act
    DoubleArray actualDifferentiateTwiceNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(pp, -0.0d);

    // Assert
    assertEquals(0.0d, actualDifferentiateTwiceNodeSensitivityResult.min());
    List<Double> toListResult = actualDifferentiateTwiceNodeSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, actualDifferentiateTwiceNodeSensitivityResult.dimensions());
    assertEquals(2.0d, actualDifferentiateTwiceNodeSensitivityResult.max());
    assertEquals(2.0d, actualDifferentiateTwiceNodeSensitivityResult.sum());
    assertEquals(2.0d, toListResult.get(0).doubleValue());
    assertEquals(3, actualDifferentiateTwiceNodeSensitivityResult.size());
    assertFalse(actualDifferentiateTwiceNodeSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {2.0d, 0.0d, 0.0d},
        actualDifferentiateTwiceNodeSensitivityResult.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateTwiceNodeSensitivityWithPpXKeys() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 3, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.of()});

    // Act and Assert
    assertEquals(
        0,
        piecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(
                pp, new double[] {})
            .length);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateTwiceNodeSensitivityWithPpXKeys2() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix ofResult = DoubleMatrix.of();

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 3, 1, new DoubleMatrix[] {ofResult, DoubleMatrix.identity(3)});

    // Act and Assert
    assertEquals(
        0,
        piecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(
                pp, new double[] {})
            .length);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateTwiceNodeSensitivityWithPpXKeys3() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(3);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix identityResult = DoubleMatrix.identity(3);

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, coefMatrix, 3, 1, new DoubleMatrix[] {identityResult, DoubleMatrix.identity(3)});

    // Act and Assert
    assertEquals(
        0,
        piecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(
                pp, new double[] {})
            .length);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return array length is four.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return array length is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateTwiceNodeSensitivityWithPpXKeys_thenReturnArrayLengthIsFour() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(2);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.identity(3)};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 3, 1, coeffSense);

    // Act
    DoubleArray[] actualDifferentiateTwiceNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(
            pp, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(4, actualDifferentiateTwiceNodeSensitivityResult.length);
    DoubleArray doubleArray = actualDifferentiateTwiceNodeSensitivityResult[0];
    assertEquals(doubleArray, actualDifferentiateTwiceNodeSensitivityResult[1]);
    assertEquals(doubleArray, actualDifferentiateTwiceNodeSensitivityResult[2]);
    assertEquals(doubleArray, actualDifferentiateTwiceNodeSensitivityResult[3]);
    assertArrayEquals(new double[] {2.0d, 0.0d, 0.0d}, doubleArray.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateTwiceNodeSensitivityWithPpXKeys_thenReturnArrayLengthIsZero() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.of(10.0d);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 3, 1, coeffSense);

    // Act and Assert
    assertEquals(
        0,
        piecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(
                pp, new double[] {})
            .length);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>When array of {@code double} with {@code -0.5} and {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; when array of double with '-0.5' and '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateTwiceNodeSensitivityWithPpXKeys_whenArrayOfDoubleWith05And05() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(2);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.identity(3)};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 3, 1, coeffSense);

    // Act
    DoubleArray[] actualDifferentiateTwiceNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(
            pp, new double[] {-0.5d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(4, actualDifferentiateTwiceNodeSensitivityResult.length);
    DoubleArray doubleArray = actualDifferentiateTwiceNodeSensitivityResult[0];
    assertEquals(doubleArray, actualDifferentiateTwiceNodeSensitivityResult[1]);
    assertEquals(doubleArray, actualDifferentiateTwiceNodeSensitivityResult[2]);
    assertEquals(doubleArray, actualDifferentiateTwiceNodeSensitivityResult[3]);
    assertArrayEquals(new double[] {2.0d, 0.0d, 0.0d}, doubleArray.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])} with {@code pp}, {@code xKeys}.
   *
   * <ul>
   *   <li>When array of {@code double} with zero and {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialWithSensitivityFunction1D#differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity,
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[]) with 'pp', 'xKeys'; when array of double with zero and '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray[] PiecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(PiecewisePolynomialResultsWithSensitivity, double[])"
  })
  void testDifferentiateTwiceNodeSensitivityWithPpXKeys_whenArrayOfDoubleWithZeroAnd05() {
    // Arrange
    PiecewisePolynomialWithSensitivityFunction1D piecewisePolynomialWithSensitivityFunction1D =
        new PiecewisePolynomialWithSensitivityFunction1D();
    DoubleArray knots = DoubleArray.filled(2);
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.identity(3)};

    PiecewisePolynomialResultsWithSensitivity pp =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 3, 1, coeffSense);

    // Act
    DoubleArray[] actualDifferentiateTwiceNodeSensitivityResult =
        piecewisePolynomialWithSensitivityFunction1D.differentiateTwiceNodeSensitivity(
            pp, new double[] {0.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(4, actualDifferentiateTwiceNodeSensitivityResult.length);
    DoubleArray doubleArray = actualDifferentiateTwiceNodeSensitivityResult[0];
    assertEquals(doubleArray, actualDifferentiateTwiceNodeSensitivityResult[1]);
    assertEquals(doubleArray, actualDifferentiateTwiceNodeSensitivityResult[2]);
    assertEquals(doubleArray, actualDifferentiateTwiceNodeSensitivityResult[3]);
    assertArrayEquals(new double[] {2.0d, 0.0d, 0.0d}, doubleArray.toArrayUnsafe(), 0.0);
  }
}
