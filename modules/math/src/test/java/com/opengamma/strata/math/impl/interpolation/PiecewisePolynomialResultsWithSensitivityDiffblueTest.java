package com.opengamma.strata.math.impl.interpolation;

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

class PiecewisePolynomialResultsWithSensitivityDiffblueTest {
  /**
   * Test {@link
   * PiecewisePolynomialResultsWithSensitivity#PiecewisePolynomialResultsWithSensitivity(DoubleArray,
   * DoubleMatrix, int, int, DoubleMatrix[])}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialResultsWithSensitivity#PiecewisePolynomialResultsWithSensitivity(DoubleArray,
   * DoubleMatrix, int, int, DoubleMatrix[])}
   */
  @Test
  @DisplayName(
      "Test new PiecewisePolynomialResultsWithSensitivity(DoubleArray, DoubleMatrix, int, int, DoubleMatrix[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PiecewisePolynomialResultsWithSensitivity.<init>(DoubleArray, DoubleMatrix, int, int, DoubleMatrix[])"
  })
  void testNewPiecewisePolynomialResultsWithSensitivity() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    // Act
    PiecewisePolynomialResultsWithSensitivity actualPiecewisePolynomialResultsWithSensitivity =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);

    // Assert
    assertEquals(-1, actualPiecewisePolynomialResultsWithSensitivity.getNumberOfIntervals());
    assertEquals(1, actualPiecewisePolynomialResultsWithSensitivity.getDimensions());
    assertEquals(1, actualPiecewisePolynomialResultsWithSensitivity.getOrder());
    DoubleMatrix[] coefficientSensitivityAll =
        actualPiecewisePolynomialResultsWithSensitivity.getCoefficientSensitivityAll();
    assertEquals(1, coefficientSensitivityAll.length);
    assertSame(coeffSense, coefficientSensitivityAll);
    assertSame(DoubleArray.EMPTY, actualPiecewisePolynomialResultsWithSensitivity.getKnots());
    assertSame(DoubleMatrix.EMPTY, actualPiecewisePolynomialResultsWithSensitivity.getCoefMatrix());
  }

  /**
   * Test {@link
   * PiecewisePolynomialResultsWithSensitivity#PiecewisePolynomialResultsWithSensitivity(DoubleArray,
   * DoubleMatrix, int, int, DoubleMatrix[])}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialResultsWithSensitivity#PiecewisePolynomialResultsWithSensitivity(DoubleArray,
   * DoubleMatrix, int, int, DoubleMatrix[])}
   */
  @Test
  @DisplayName(
      "Test new PiecewisePolynomialResultsWithSensitivity(DoubleArray, DoubleMatrix, int, int, DoubleMatrix[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PiecewisePolynomialResultsWithSensitivity.<init>(DoubleArray, DoubleMatrix, int, int, DoubleMatrix[])"
  })
  void testNewPiecewisePolynomialResultsWithSensitivity2() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 0, coeffSense));
  }

  /**
   * Test {@link PiecewisePolynomialResultsWithSensitivity#getCoefficientSensitivityAll()}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialResultsWithSensitivity#getCoefficientSensitivityAll()}
   */
  @Test
  @DisplayName("Test getCoefficientSensitivityAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[] PiecewisePolynomialResultsWithSensitivity.getCoefficientSensitivityAll()"
  })
  void testGetCoefficientSensitivityAll() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity piecewisePolynomialResultsWithSensitivity =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);

    // Act
    DoubleMatrix[] actualCoefficientSensitivityAll =
        piecewisePolynomialResultsWithSensitivity.getCoefficientSensitivityAll();

    // Assert
    assertEquals(1, actualCoefficientSensitivityAll.length);
    assertSame(DoubleMatrix.EMPTY, actualCoefficientSensitivityAll[0]);
  }

  /**
   * Test {@link PiecewisePolynomialResultsWithSensitivity#getCoefficientSensitivity(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialResultsWithSensitivity#getCoefficientSensitivity(int)}
   */
  @Test
  @DisplayName("Test getCoefficientSensitivity(int); when zero; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialResultsWithSensitivity.getCoefficientSensitivity(int)"
  })
  void testGetCoefficientSensitivity_whenZero_thenReturnEmpty() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity piecewisePolynomialResultsWithSensitivity =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);

    // Act and Assert
    assertSame(
        DoubleMatrix.EMPTY, piecewisePolynomialResultsWithSensitivity.getCoefficientSensitivity(0));
  }

  /**
   * Test {@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}, and {@link
   * PiecewisePolynomialResultsWithSensitivity#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}
   *   <li>{@link PiecewisePolynomialResultsWithSensitivity#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResultsWithSensitivity.equals(Object)",
    "int PiecewisePolynomialResultsWithSensitivity.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity piecewisePolynomialResultsWithSensitivity =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);
    DoubleArray knots2 = DoubleArray.of();
    DoubleMatrix coefMatrix2 = DoubleMatrix.of();
    DoubleMatrix[] coeffSense2 = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity piecewisePolynomialResultsWithSensitivity2 =
        new PiecewisePolynomialResultsWithSensitivity(knots2, coefMatrix2, 1, 1, coeffSense2);

    // Act and Assert
    assertEquals(
        piecewisePolynomialResultsWithSensitivity, piecewisePolynomialResultsWithSensitivity2);
    assertEquals(
        piecewisePolynomialResultsWithSensitivity.hashCode(),
        piecewisePolynomialResultsWithSensitivity2.hashCode());
  }

  /**
   * Test {@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}, and {@link
   * PiecewisePolynomialResultsWithSensitivity#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}
   *   <li>{@link PiecewisePolynomialResultsWithSensitivity#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResultsWithSensitivity.equals(Object)",
    "int PiecewisePolynomialResultsWithSensitivity.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity piecewisePolynomialResultsWithSensitivity =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);

    // Act and Assert
    assertEquals(
        piecewisePolynomialResultsWithSensitivity, piecewisePolynomialResultsWithSensitivity);
    int expectedHashCodeResult = piecewisePolynomialResultsWithSensitivity.hashCode();
    assertEquals(expectedHashCodeResult, piecewisePolynomialResultsWithSensitivity.hashCode());
  }

  /**
   * Test {@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResultsWithSensitivity.equals(Object)",
    "int PiecewisePolynomialResultsWithSensitivity.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResultsWithSensitivity piecewisePolynomialResultsWithSensitivity =
        new PiecewisePolynomialResultsWithSensitivity(
            knots, DoubleMatrix.of(), 1, 1, new DoubleMatrix[] {});
    DoubleArray knots2 = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    // Act and Assert
    assertNotEquals(
        piecewisePolynomialResultsWithSensitivity,
        new PiecewisePolynomialResultsWithSensitivity(knots2, coefMatrix, 1, 1, coeffSense));
  }

  /**
   * Test {@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResultsWithSensitivity.equals(Object)",
    "int PiecewisePolynomialResultsWithSensitivity.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    PiecewisePolynomialResultsWithSensitivity piecewisePolynomialResultsWithSensitivity =
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense);
    DoubleArray knots2 = DoubleArray.of();

    // Act and Assert
    assertNotEquals(
        piecewisePolynomialResultsWithSensitivity,
        new PiecewisePolynomialResult(knots2, DoubleMatrix.of(), 1, 1));
  }

  /**
   * Test {@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResultsWithSensitivity.equals(Object)",
    "int PiecewisePolynomialResultsWithSensitivity.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    // Act and Assert
    assertNotEquals(
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense), null);
  }

  /**
   * Test {@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialResultsWithSensitivity#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResultsWithSensitivity.equals(Object)",
    "int PiecewisePolynomialResultsWithSensitivity.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    DoubleMatrix coefMatrix = DoubleMatrix.of();
    DoubleMatrix[] coeffSense = new DoubleMatrix[] {DoubleMatrix.of()};

    // Act and Assert
    assertNotEquals(
        new PiecewisePolynomialResultsWithSensitivity(knots, coefMatrix, 1, 1, coeffSense),
        "Different type to PiecewisePolynomialResultsWithSensitivity");
  }
}
