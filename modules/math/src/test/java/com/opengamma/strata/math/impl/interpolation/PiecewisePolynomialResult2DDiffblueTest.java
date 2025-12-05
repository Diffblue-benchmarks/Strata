package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PiecewisePolynomialResult2DDiffblueTest {
  /**
   * Test {@link PiecewisePolynomialResult2D#PiecewisePolynomialResult2D(DoubleArray, DoubleArray,
   * DoubleMatrix[][], int[])}.
   *
   * <ul>
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialResult2D#PiecewisePolynomialResult2D(DoubleArray, DoubleArray,
   * DoubleMatrix[][], int[])}
   */
  @Test
  @DisplayName(
      "Test new PiecewisePolynomialResult2D(DoubleArray, DoubleArray, DoubleMatrix[][], int[]); then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void PiecewisePolynomialResult2D.<init>(DoubleArray, DoubleArray, DoubleMatrix[][], int[])"
  })
  void testNewPiecewisePolynomialResult2D_thenReturnArrayLengthIsOne() {
    // Arrange
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    PiecewisePolynomialResult2D actualPiecewisePolynomialResult2D =
        new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1});

    // Assert
    DoubleMatrix[][] coefs = actualPiecewisePolynomialResult2D.getCoefs();
    assertEquals(1, coefs.length);
    assertEquals(1, coefs[0].length);
    ArrayList<DoubleArray> knots2D = actualPiecewisePolynomialResult2D.getKnots2D();
    assertEquals(2, knots2D.size());
    assertSame(coefMatrix, coefs);
    DoubleArray doubleArray = DoubleArray.EMPTY;
    assertSame(doubleArray, actualPiecewisePolynomialResult2D.getKnots0());
    assertSame(doubleArray, actualPiecewisePolynomialResult2D.getKnots1());
    assertSame(doubleArray, knots2D.get(0));
    assertSame(doubleArray, knots2D.get(1));
    assertArrayEquals(new int[] {-1, -1}, actualPiecewisePolynomialResult2D.getNumberOfIntervals());
    assertArrayEquals(new int[] {1, -1, 1, -1}, actualPiecewisePolynomialResult2D.getOrder());
  }

  /**
   * Test {@link PiecewisePolynomialResult2D#getKnots2D()}.
   *
   * <p>Method under test: {@link PiecewisePolynomialResult2D#getKnots2D()}
   */
  @Test
  @DisplayName("Test getKnots2D()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ArrayList PiecewisePolynomialResult2D.getKnots2D()"})
  void testGetKnots2D() {
    // Arrange
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    ArrayList<DoubleArray> actualKnots2D =
        new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1})
            .getKnots2D();

    // Assert
    assertEquals(2, actualKnots2D.size());
    DoubleArray doubleArray = DoubleArray.EMPTY;
    assertSame(doubleArray, actualKnots2D.get(0));
    assertSame(doubleArray, actualKnots2D.get(1));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PiecewisePolynomialResult2D#getCoefs()}
   *   <li>{@link PiecewisePolynomialResult2D#getKnots0()}
   *   <li>{@link PiecewisePolynomialResult2D#getKnots1()}
   *   <li>{@link PiecewisePolynomialResult2D#getNumberOfIntervals()}
   *   <li>{@link PiecewisePolynomialResult2D#getOrder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix[][] PiecewisePolynomialResult2D.getCoefs()",
    "DoubleArray PiecewisePolynomialResult2D.getKnots0()",
    "DoubleArray PiecewisePolynomialResult2D.getKnots1()",
    "int[] PiecewisePolynomialResult2D.getNumberOfIntervals()",
    "int[] PiecewisePolynomialResult2D.getOrder()"
  })
  void testGettersAndSetters() {
    // Arrange
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    PiecewisePolynomialResult2D piecewisePolynomialResult2D =
        new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1});

    // Act
    DoubleMatrix[][] actualCoefs = piecewisePolynomialResult2D.getCoefs();
    DoubleArray actualKnots0 = piecewisePolynomialResult2D.getKnots0();
    DoubleArray actualKnots1 = piecewisePolynomialResult2D.getKnots1();
    int[] actualNumberOfIntervals = piecewisePolynomialResult2D.getNumberOfIntervals();

    // Assert
    assertEquals(1, actualCoefs.length);
    DoubleMatrix[] doubleMatrixArray = actualCoefs[0];
    assertEquals(1, doubleMatrixArray.length);
    DoubleArray doubleArray = DoubleArray.EMPTY;
    assertSame(doubleArray, actualKnots0);
    assertSame(doubleArray, actualKnots1);
    assertSame(DoubleMatrix.EMPTY, doubleMatrixArray[0]);
    assertArrayEquals(new int[] {-1, -1}, actualNumberOfIntervals);
    assertArrayEquals(new int[] {1, -1, 1, -1}, piecewisePolynomialResult2D.getOrder());
  }
}
