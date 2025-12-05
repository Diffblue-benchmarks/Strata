package com.opengamma.strata.math.impl.function;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.interpolation.PiecewisePolynomialResult2D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PiecewisePolynomialFunction2DDiffblueTest {
  /**
   * Test {@link PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double,
   * double)} with {@code pp}, {@code x0Key}, {@code x1Key}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double, double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult2D, double, double) with 'pp', 'x0Key', 'x1Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialFunction2D.evaluate(PiecewisePolynomialResult2D, double, double)"
  })
  void testEvaluateWithPpX0KeyX1Key() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.filled(3);
    DoubleArray knots1 = DoubleArray.of(10.0d);
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    PiecewisePolynomialResult2D pp =
        new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1});

    // Act and Assert
    assertEquals(0.0d, piecewisePolynomialFunction2D.evaluate(pp, -0.5d, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double,
   * double)} with {@code pp}, {@code x0Key}, {@code x1Key}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double, double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult2D, double, double) with 'pp', 'x0Key', 'x1Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialFunction2D.evaluate(PiecewisePolynomialResult2D, double, double)"
  })
  void testEvaluateWithPpX0KeyX1Key2() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of(10.0d);
    DoubleArray knots1 = DoubleArray.filled(3);
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    PiecewisePolynomialResult2D pp =
        new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1});

    // Act and Assert
    assertEquals(0.0d, piecewisePolynomialFunction2D.evaluate(pp, 10.0d, -0.5d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double,
   * double)} with {@code pp}, {@code x0Key}, {@code x1Key}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double, double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult2D, double, double) with 'pp', 'x0Key', 'x1Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialFunction2D.evaluate(PiecewisePolynomialResult2D, double, double)"
  })
  void testEvaluateWithPpX0KeyX1Key3() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.filled(3);
    DoubleArray knots1 = DoubleArray.of(10.0d);

    PiecewisePolynomialResult2D pp =
        new PiecewisePolynomialResult2D(
            knots0,
            knots1,
            new DoubleMatrix[][] {
              new DoubleMatrix[] {DoubleMatrix.of()}, new DoubleMatrix[] {DoubleMatrix.of()}
            },
            new int[] {1, -1, 1, -1});

    // Act and Assert
    assertEquals(0.0d, piecewisePolynomialFunction2D.evaluate(pp, 10.0d, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double,
   * double)} with {@code pp}, {@code x0Key}, {@code x1Key}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double, double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult2D, double, double) with 'pp', 'x0Key', 'x1Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialFunction2D.evaluate(PiecewisePolynomialResult2D, double, double)"
  })
  void testEvaluateWithPpX0KeyX1Key4() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of(10.0d);
    DoubleArray knots1 = DoubleArray.filled(3);
    DoubleMatrix ofResult = DoubleMatrix.of();
    DoubleMatrix[][] coefMatrix =
        new DoubleMatrix[][] {new DoubleMatrix[] {ofResult, DoubleMatrix.of()}};

    PiecewisePolynomialResult2D pp =
        new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1});

    // Act and Assert
    assertEquals(0.0d, piecewisePolynomialFunction2D.evaluate(pp, 10.0d, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double,
   * double)} with {@code pp}, {@code x0Key}, {@code x1Key}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double, double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult2D, double, double) with 'pp', 'x0Key', 'x1Key'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialFunction2D.evaluate(PiecewisePolynomialResult2D, double, double)"
  })
  void testEvaluateWithPpX0KeyX1Key_thenReturnOne() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of(10.0d);
    DoubleArray knots1 = DoubleArray.of(10.0d);
    DoubleMatrix[][] coefMatrix =
        new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.identity(3)}};

    PiecewisePolynomialResult2D pp =
        new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1});

    // Act and Assert
    assertEquals(1.0d, piecewisePolynomialFunction2D.evaluate(pp, 10.0d, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double,
   * double)} with {@code pp}, {@code x0Key}, {@code x1Key}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double, double)}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult2D, double, double) with 'pp', 'x0Key', 'x1Key'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double PiecewisePolynomialFunction2D.evaluate(PiecewisePolynomialResult2D, double, double)"
  })
  void testEvaluateWithPpX0KeyX1Key_thenReturnZero() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of(10.0d);
    DoubleArray knots1 = DoubleArray.of(10.0d);
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    PiecewisePolynomialResult2D pp =
        new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1});

    // Act and Assert
    assertEquals(0.0d, piecewisePolynomialFunction2D.evaluate(pp, 10.0d, 10.0d));
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double[],
   * double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double[], double[])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.evaluate(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testEvaluateWithPpX0KeysX1Keys() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of(10.0d);
    DoubleArray knots1 = DoubleArray.of(10.0d);
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    PiecewisePolynomialResult2D pp =
        new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1});

    // Act and Assert
    double[][] toArrayUnsafeResult =
        piecewisePolynomialFunction2D
            .evaluate(
                pp,
                new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                new double[] {10.0d, 0.5d, 10.0d, 0.5d})
            .toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double[],
   * double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>Then return total is {@code 32957.25}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double[], double[])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; then return total is '32957.25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.evaluate(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testEvaluateWithPpX0KeysX1Keys_thenReturnTotalIs3295725() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of(10.0d);
    DoubleArray knots1 = DoubleArray.of(10.0d);
    DoubleMatrix[][] coefMatrix =
        new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.identity(3)}};

    PiecewisePolynomialResult2D pp =
        new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1});

    // Act
    DoubleMatrix actualEvaluateResult =
        piecewisePolynomialFunction2D.evaluate(
            pp, new double[] {10.0d, 0.5d, 10.0d, 0.5d}, new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals(32957.25d, actualEvaluateResult.total());
    double[][] toArrayUnsafeResult = actualEvaluateResult.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {1.0d, 1.0d, 1.0d, 1.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d, 1.0d, 1.0d, 1.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {1.0d, 8236.3125d, 1.0d, 8236.3125d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {1.0d, 8236.3125d, 1.0d, 8236.3125d}, toArrayUnsafeResult[3], 0.0);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double[],
   * double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double[], double[])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.evaluate(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testEvaluateWithPpX0KeysX1Keys_whenEmptyArrayOfDouble_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualEvaluateResult =
        piecewisePolynomialFunction2D.evaluate(
            new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1}),
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualEvaluateResult);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double[],
   * double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#evaluate(PiecewisePolynomialResult2D, double[], double[])}
   */
  @Test
  @DisplayName(
      "Test evaluate(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.evaluate(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testEvaluateWithPpX0KeysX1Keys_whenEmptyArrayOfDouble_thenReturnEmpty2() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualEvaluateResult =
        piecewisePolynomialFunction2D.evaluate(
            new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {1, -1, 1, -1}),
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualEvaluateResult);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateX0(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateX0(PiecewisePolynomialResult2D, double[], double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateX0(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateX0(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateX0WithPpX0KeysX1Keys_whenEmptyArrayOfDouble_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateX0Result =
        piecewisePolynomialFunction2D.differentiateX0(
            new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {2, -1, 1, -1}),
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateX0Result);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateX0(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateX0(PiecewisePolynomialResult2D, double[], double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateX0(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateX0(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateX0WithPpX0KeysX1Keys_whenEmptyArrayOfDouble_thenReturnEmpty2() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateX0Result =
        piecewisePolynomialFunction2D.differentiateX0(
            new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {2, -1, 1, -1}),
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateX0Result);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateX0(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateX0(PiecewisePolynomialResult2D, double[], double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateX0(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateX0(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateX0WithPpX0KeysX1Keys_whenEmptyArrayOfDouble_thenReturnEmpty3() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.filled(3);
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateX0Result =
        piecewisePolynomialFunction2D.differentiateX0(
            new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {2, -1, 1, -1}),
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateX0Result);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateX1(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateX1(PiecewisePolynomialResult2D, double[], double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateX1(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateX1(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateX1WithPpX0KeysX1Keys_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateX1Result =
        piecewisePolynomialFunction2D.differentiateX1(
            new PiecewisePolynomialResult2D(
                knots0, knots1, coefMatrix, new int[] {1, 2, 1, 2, 1, 2, 1, 2}),
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateX1Result);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateX1(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateX1(PiecewisePolynomialResult2D, double[], double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateX1(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateX1(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateX1WithPpX0KeysX1Keys_thenReturnEmpty2() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateX1Result =
        piecewisePolynomialFunction2D.differentiateX1(
            new PiecewisePolynomialResult2D(
                knots0, knots1, coefMatrix, new int[] {1, 2, 1, 2, 1, 2, 1, 2}),
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateX1Result);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateX1(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateX1(PiecewisePolynomialResult2D, double[], double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateX1(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateX1(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateX1WithPpX0KeysX1Keys_whenEmptyArrayOfDouble_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.filled(3);
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateX1Result =
        piecewisePolynomialFunction2D.differentiateX1(
            new PiecewisePolynomialResult2D(
                knots0, knots1, coefMatrix, new int[] {1, 2, 1, 2, 1, 2, 1, 2}),
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateX1Result);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateCross(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateCross(PiecewisePolynomialResult2D, double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateCross(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateCross(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateCrossWithPpX0KeysX1Keys_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateCrossResult =
        piecewisePolynomialFunction2D.differentiateCross(
            new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {2, 2, 1, -1}),
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateCrossResult);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateCross(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateCross(PiecewisePolynomialResult2D, double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateCross(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateCross(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateCrossWithPpX0KeysX1Keys_thenReturnEmpty2() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateCrossResult =
        piecewisePolynomialFunction2D.differentiateCross(
            new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {2, 2, 1, -1}),
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateCrossResult);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateCross(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateCross(PiecewisePolynomialResult2D, double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateCross(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; when empty array of double; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateCross(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateCrossWithPpX0KeysX1Keys_whenEmptyArrayOfDouble_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.filled(3);
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateCrossResult =
        piecewisePolynomialFunction2D.differentiateCross(
            new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {2, 2, 1, -1}),
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateCrossResult);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateTwiceX0(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateTwiceX0(PiecewisePolynomialResult2D, double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceX0(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateTwiceX0(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateTwiceX0WithPpX0KeysX1Keys_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateTwiceX0Result =
        piecewisePolynomialFunction2D.differentiateTwiceX0(
            new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {3, -1, 1, -1}),
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateTwiceX0Result);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateTwiceX0(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateTwiceX0(PiecewisePolynomialResult2D, double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceX0(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateTwiceX0(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateTwiceX0WithPpX0KeysX1Keys_thenReturnEmpty2() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateTwiceX0Result =
        piecewisePolynomialFunction2D.differentiateTwiceX0(
            new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {3, -1, 1, -1}),
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateTwiceX0Result);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateTwiceX0(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateTwiceX0(PiecewisePolynomialResult2D, double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceX0(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateTwiceX0(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateTwiceX0WithPpX0KeysX1Keys_thenReturnEmpty3() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.filled(3);
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateTwiceX0Result =
        piecewisePolynomialFunction2D.differentiateTwiceX0(
            new PiecewisePolynomialResult2D(knots0, knots1, coefMatrix, new int[] {3, -1, 1, -1}),
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateTwiceX0Result);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateTwiceX1(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateTwiceX1(PiecewisePolynomialResult2D, double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceX1(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateTwiceX1(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateTwiceX1WithPpX0KeysX1Keys_thenReturnEmpty() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateTwiceX1Result =
        piecewisePolynomialFunction2D.differentiateTwiceX1(
            new PiecewisePolynomialResult2D(
                knots0, knots1, coefMatrix, new int[] {1, 3, 1, 3, 1, 3, 1, 3}),
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateTwiceX1Result);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateTwiceX1(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateTwiceX1(PiecewisePolynomialResult2D, double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceX1(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateTwiceX1(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateTwiceX1WithPpX0KeysX1Keys_thenReturnEmpty2() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.of();
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateTwiceX1Result =
        piecewisePolynomialFunction2D.differentiateTwiceX1(
            new PiecewisePolynomialResult2D(
                knots0, knots1, coefMatrix, new int[] {1, 3, 1, 3, 1, 3, 1, 3}),
            new double[] {10.0d, 0.5d, 10.0d, 0.5d},
            new double[] {});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateTwiceX1Result);
  }

  /**
   * Test {@link PiecewisePolynomialFunction2D#differentiateTwiceX1(PiecewisePolynomialResult2D,
   * double[], double[])} with {@code pp}, {@code x0Keys}, {@code x1Keys}.
   *
   * <ul>
   *   <li>Then return {@link DoubleMatrix#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * PiecewisePolynomialFunction2D#differentiateTwiceX1(PiecewisePolynomialResult2D, double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test differentiateTwiceX1(PiecewisePolynomialResult2D, double[], double[]) with 'pp', 'x0Keys', 'x1Keys'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleMatrix PiecewisePolynomialFunction2D.differentiateTwiceX1(PiecewisePolynomialResult2D, double[], double[])"
  })
  void testDifferentiateTwiceX1WithPpX0KeysX1Keys_thenReturnEmpty3() {
    // Arrange
    PiecewisePolynomialFunction2D piecewisePolynomialFunction2D =
        new PiecewisePolynomialFunction2D();
    DoubleArray knots0 = DoubleArray.filled(3);
    DoubleArray knots1 = DoubleArray.of();
    DoubleMatrix[][] coefMatrix = new DoubleMatrix[][] {new DoubleMatrix[] {DoubleMatrix.of()}};

    // Act
    DoubleMatrix actualDifferentiateTwiceX1Result =
        piecewisePolynomialFunction2D.differentiateTwiceX1(
            new PiecewisePolynomialResult2D(
                knots0, knots1, coefMatrix, new int[] {1, 3, 1, 3, 1, 3, 1, 3}),
            new double[] {},
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertSame(DoubleMatrix.EMPTY, actualDifferentiateTwiceX1Result);
  }
}
