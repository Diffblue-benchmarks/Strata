package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PiecewisePolynomialResultDiffblueTest {
  /**
   * Test {@link PiecewisePolynomialResult#PiecewisePolynomialResult(DoubleArray, DoubleMatrix, int,
   * int)}.
   *
   * <ul>
   *   <li>Then return NumberOfIntervals is minus one.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialResult#PiecewisePolynomialResult(DoubleArray,
   * DoubleMatrix, int, int)}
   */
  @Test
  @DisplayName(
      "Test new PiecewisePolynomialResult(DoubleArray, DoubleMatrix, int, int); then return NumberOfIntervals is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void PiecewisePolynomialResult.<init>(DoubleArray, DoubleMatrix, int, int)"})
  void testNewPiecewisePolynomialResult_thenReturnNumberOfIntervalsIsMinusOne() {
    // Arrange
    DoubleArray knots = DoubleArray.of();

    // Act
    PiecewisePolynomialResult actualPiecewisePolynomialResult =
        new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1);

    // Assert
    assertEquals(-1, actualPiecewisePolynomialResult.getNumberOfIntervals());
    assertEquals(1, actualPiecewisePolynomialResult.getDimensions());
    assertEquals(1, actualPiecewisePolynomialResult.getOrder());
    assertSame(DoubleArray.EMPTY, actualPiecewisePolynomialResult.getKnots());
    assertSame(DoubleMatrix.EMPTY, actualPiecewisePolynomialResult.getCoefMatrix());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PiecewisePolynomialResult#getCoefMatrix()}
   *   <li>{@link PiecewisePolynomialResult#getDimensions()}
   *   <li>{@link PiecewisePolynomialResult#getKnots()}
   *   <li>{@link PiecewisePolynomialResult#getNumberOfIntervals()}
   *   <li>{@link PiecewisePolynomialResult#getOrder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialResult.getCoefMatrix()",
    "int PiecewisePolynomialResult.getDimensions()",
    "DoubleArray PiecewisePolynomialResult.getKnots()",
    "int PiecewisePolynomialResult.getNumberOfIntervals()",
    "int PiecewisePolynomialResult.getOrder()"
  })
  void testGettersAndSetters() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult piecewisePolynomialResult =
        new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1);

    // Act
    DoubleMatrix actualCoefMatrix = piecewisePolynomialResult.getCoefMatrix();
    int actualDimensions = piecewisePolynomialResult.getDimensions();
    DoubleArray actualKnots = piecewisePolynomialResult.getKnots();
    int actualNumberOfIntervals = piecewisePolynomialResult.getNumberOfIntervals();

    // Assert
    assertEquals(-1, actualNumberOfIntervals);
    assertEquals(1, actualDimensions);
    assertEquals(1, piecewisePolynomialResult.getOrder());
    assertSame(DoubleArray.EMPTY, actualKnots);
    assertSame(DoubleMatrix.EMPTY, actualCoefMatrix);
  }

  /**
   * Test {@link PiecewisePolynomialResult#equals(Object)}, and {@link
   * PiecewisePolynomialResult#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PiecewisePolynomialResult#equals(Object)}
   *   <li>{@link PiecewisePolynomialResult#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResult.equals(Object)",
    "int PiecewisePolynomialResult.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult piecewisePolynomialResult =
        new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1);
    DoubleArray knots2 = DoubleArray.of();
    PiecewisePolynomialResult piecewisePolynomialResult2 =
        new PiecewisePolynomialResult(knots2, DoubleMatrix.of(), 1, 1);

    // Act and Assert
    assertEquals(piecewisePolynomialResult, piecewisePolynomialResult2);
    assertEquals(piecewisePolynomialResult.hashCode(), piecewisePolynomialResult2.hashCode());
  }

  /**
   * Test {@link PiecewisePolynomialResult#equals(Object)}, and {@link
   * PiecewisePolynomialResult#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PiecewisePolynomialResult#equals(Object)}
   *   <li>{@link PiecewisePolynomialResult#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResult.equals(Object)",
    "int PiecewisePolynomialResult.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult piecewisePolynomialResult =
        new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1);

    // Act and Assert
    assertEquals(piecewisePolynomialResult, piecewisePolynomialResult);
    int expectedHashCodeResult = piecewisePolynomialResult.hashCode();
    assertEquals(expectedHashCodeResult, piecewisePolynomialResult.hashCode());
  }

  /**
   * Test {@link PiecewisePolynomialResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResult.equals(Object)",
    "int PiecewisePolynomialResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DoubleArray knots = DoubleArray.filled(3);
    PiecewisePolynomialResult piecewisePolynomialResult =
        new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1);
    DoubleArray knots2 = DoubleArray.of();

    // Act and Assert
    assertNotEquals(
        piecewisePolynomialResult, new PiecewisePolynomialResult(knots2, DoubleMatrix.of(), 1, 1));
  }

  /**
   * Test {@link PiecewisePolynomialResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResult.equals(Object)",
    "int PiecewisePolynomialResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult piecewisePolynomialResult =
        new PiecewisePolynomialResult(knots, DoubleMatrix.identity(3), 1, 1);
    DoubleArray knots2 = DoubleArray.of();

    // Act and Assert
    assertNotEquals(
        piecewisePolynomialResult, new PiecewisePolynomialResult(knots2, DoubleMatrix.of(), 1, 1));
  }

  /**
   * Test {@link PiecewisePolynomialResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResult.equals(Object)",
    "int PiecewisePolynomialResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult piecewisePolynomialResult =
        new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 0, 1);
    DoubleArray knots2 = DoubleArray.of();

    // Act and Assert
    assertNotEquals(
        piecewisePolynomialResult, new PiecewisePolynomialResult(knots2, DoubleMatrix.of(), 1, 1));
  }

  /**
   * Test {@link PiecewisePolynomialResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResult.equals(Object)",
    "int PiecewisePolynomialResult.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    DoubleArray knots = DoubleArray.of();
    PiecewisePolynomialResult piecewisePolynomialResult =
        new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 0);
    DoubleArray knots2 = DoubleArray.of();

    // Act and Assert
    assertNotEquals(
        piecewisePolynomialResult, new PiecewisePolynomialResult(knots2, DoubleMatrix.of(), 1, 1));
  }

  /**
   * Test {@link PiecewisePolynomialResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResult.equals(Object)",
    "int PiecewisePolynomialResult.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    DoubleArray knots = DoubleArray.of();

    // Act and Assert
    assertNotEquals(new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1), null);
  }

  /**
   * Test {@link PiecewisePolynomialResult#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PiecewisePolynomialResult#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PiecewisePolynomialResult.equals(Object)",
    "int PiecewisePolynomialResult.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    DoubleArray knots = DoubleArray.of();

    // Act and Assert
    assertNotEquals(
        new PiecewisePolynomialResult(knots, DoubleMatrix.of(), 1, 1),
        "Different type to PiecewisePolynomialResult");
  }
}
