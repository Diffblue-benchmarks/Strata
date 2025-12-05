package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.math.impl.function.DoubleFunction1D;
import com.opengamma.strata.math.impl.function.RealPolynomialFunction1D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JacobiPolynomialFunctionDiffblueTest {
  /**
   * Test {@link JacobiPolynomialFunction#getPolynomials(int)} with {@code n}.
   *
   * <p>Method under test: {@link JacobiPolynomialFunction#getPolynomials(int)}
   */
  @Test
  @DisplayName("Test getPolynomials(int) with 'n'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] JacobiPolynomialFunction.getPolynomials(int)"})
  void testGetPolynomialsWithN() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new JacobiPolynomialFunction().getPolynomials(1));
  }

  /**
   * Test {@link JacobiPolynomialFunction#getPolynomials(int, double, double)} with {@code n},
   * {@code alpha}, {@code beta}.
   *
   * <ul>
   *   <li>Then first element return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link JacobiPolynomialFunction#getPolynomials(int, double, double)}
   */
  @Test
  @DisplayName(
      "Test getPolynomials(int, double, double) with 'n', 'alpha', 'beta'; then first element return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleFunction1D[] JacobiPolynomialFunction.getPolynomials(int, double, double)"
  })
  void testGetPolynomialsWithNAlphaBeta_thenFirstElementReturnRealPolynomialFunction1D() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials =
        new JacobiPolynomialFunction().getPolynomials(1, 10.0d, 10.0d);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[0];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    DoubleFunction1D doubleFunction1D2 = actualPolynomials[1];
    assertTrue(doubleFunction1D2 instanceof RealPolynomialFunction1D);
    assertEquals(2, actualPolynomials.length);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {11.0d},
        ((RealPolynomialFunction1D) doubleFunction1D2.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 11.0d},
        ((RealPolynomialFunction1D) doubleFunction1D2).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link JacobiPolynomialFunction#getPolynomials(int, double, double)} with {@code n},
   * {@code alpha}, {@code beta}.
   *
   * <ul>
   *   <li>Then third element return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link JacobiPolynomialFunction#getPolynomials(int, double, double)}
   */
  @Test
  @DisplayName(
      "Test getPolynomials(int, double, double) with 'n', 'alpha', 'beta'; then third element return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleFunction1D[] JacobiPolynomialFunction.getPolynomials(int, double, double)"
  })
  void testGetPolynomialsWithNAlphaBeta_thenThirdElementReturnRealPolynomialFunction1D() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials =
        new JacobiPolynomialFunction().getPolynomials(2, 10.0d, 10.0d);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[1];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    DoubleFunction1D doubleFunction1D2 = actualPolynomials[2];
    assertTrue(doubleFunction1D2 instanceof RealPolynomialFunction1D);
    assertEquals(3, actualPolynomials.length);
    assertArrayEquals(
        new double[] {11.0d},
        ((RealPolynomialFunction1D) doubleFunction1D.derivative()).getCoefficients(),
        0.0);
    DoubleFunction1D derivativeResult = doubleFunction1D2.derivative();
    assertArrayEquals(
        new double[] {138.0d},
        ((RealPolynomialFunction1D) derivativeResult.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 11.0d},
        ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 138.0d},
        ((RealPolynomialFunction1D) derivativeResult).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {-3.0d, 0.0d, 69.0d},
        ((RealPolynomialFunction1D) doubleFunction1D2).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link JacobiPolynomialFunction#getPolynomialsAndFirstDerivative(int)} with {@code n}.
   *
   * <p>Method under test: {@link JacobiPolynomialFunction#getPolynomialsAndFirstDerivative(int)}
   */
  @Test
  @DisplayName("Test getPolynomialsAndFirstDerivative(int) with 'n'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair[] JacobiPolynomialFunction.getPolynomialsAndFirstDerivative(int)"})
  void testGetPolynomialsAndFirstDerivativeWithN() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new JacobiPolynomialFunction().getPolynomialsAndFirstDerivative(1));
  }

  /**
   * Test {@link JacobiPolynomialFunction#getPolynomialsAndFirstDerivative(int, double, double)}
   * with {@code n}, {@code alpha}, {@code beta}.
   *
   * <p>Method under test: {@link JacobiPolynomialFunction#getPolynomialsAndFirstDerivative(int,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test getPolynomialsAndFirstDerivative(int, double, double) with 'n', 'alpha', 'beta'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair[] JacobiPolynomialFunction.getPolynomialsAndFirstDerivative(int, double, double)"
  })
  void testGetPolynomialsAndFirstDerivativeWithNAlphaBeta() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new JacobiPolynomialFunction().getPolynomialsAndFirstDerivative(0, 10.0d, 10.0d);

    // Assert
    Pair<DoubleFunction1D, DoubleFunction1D> pair = actualPolynomialsAndFirstDerivative[0];
    DoubleFunction1D first = pair.getFirst();
    assertTrue(first instanceof RealPolynomialFunction1D);
    DoubleFunction1D second = pair.getSecond();
    assertTrue(second instanceof RealPolynomialFunction1D);
    assertEquals(1, actualPolynomialsAndFirstDerivative.length);
    assertEquals(2, pair.size());
    assertArrayEquals(
        new double[] {0.0d}, ((RealPolynomialFunction1D) second).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) first).getCoefficients(), 0.0);
  }

  /**
   * Test {@link JacobiPolynomialFunction#getPolynomialsAndFirstDerivative(int, double, double)}
   * with {@code n}, {@code alpha}, {@code beta}.
   *
   * <p>Method under test: {@link JacobiPolynomialFunction#getPolynomialsAndFirstDerivative(int,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test getPolynomialsAndFirstDerivative(int, double, double) with 'n', 'alpha', 'beta'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair[] JacobiPolynomialFunction.getPolynomialsAndFirstDerivative(int, double, double)"
  })
  void testGetPolynomialsAndFirstDerivativeWithNAlphaBeta2() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new JacobiPolynomialFunction().getPolynomialsAndFirstDerivative(2, 10.0d, 10.0d);

    // Assert
    Pair<DoubleFunction1D, DoubleFunction1D> pair = actualPolynomialsAndFirstDerivative[1];
    DoubleFunction1D first = pair.getFirst();
    assertTrue(first instanceof RealPolynomialFunction1D);
    Pair<DoubleFunction1D, DoubleFunction1D> pair2 = actualPolynomialsAndFirstDerivative[2];
    DoubleFunction1D first2 = pair2.getFirst();
    assertTrue(first2 instanceof RealPolynomialFunction1D);
    DoubleFunction1D second = pair.getSecond();
    assertTrue(second instanceof RealPolynomialFunction1D);
    DoubleFunction1D second2 = pair2.getSecond();
    assertTrue(second2 instanceof RealPolynomialFunction1D);
    assertEquals(2, pair2.size());
    assertEquals(3, actualPolynomialsAndFirstDerivative.length);
    assertEquals(second, first.derivative());
    assertEquals(second2, first2.derivative());
    assertArrayEquals(
        new double[] {11.0d}, ((RealPolynomialFunction1D) second).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 11.0d}, ((RealPolynomialFunction1D) first).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 138.0d}, ((RealPolynomialFunction1D) second2).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {-3.0d, 0.0d, 69.0d},
        ((RealPolynomialFunction1D) first2).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link JacobiPolynomialFunction#getPolynomialsAndFirstDerivative(int, double, double)}
   * with {@code n}, {@code alpha}, {@code beta}.
   *
   * <ul>
   *   <li>Then return array length is two.
   * </ul>
   *
   * <p>Method under test: {@link JacobiPolynomialFunction#getPolynomialsAndFirstDerivative(int,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test getPolynomialsAndFirstDerivative(int, double, double) with 'n', 'alpha', 'beta'; then return array length is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair[] JacobiPolynomialFunction.getPolynomialsAndFirstDerivative(int, double, double)"
  })
  void testGetPolynomialsAndFirstDerivativeWithNAlphaBeta_thenReturnArrayLengthIsTwo() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new JacobiPolynomialFunction().getPolynomialsAndFirstDerivative(1, 10.0d, 10.0d);

    // Assert
    Pair<DoubleFunction1D, DoubleFunction1D> pair = actualPolynomialsAndFirstDerivative[1];
    DoubleFunction1D first = pair.getFirst();
    assertTrue(first instanceof RealPolynomialFunction1D);
    DoubleFunction1D second = pair.getSecond();
    assertTrue(second instanceof RealPolynomialFunction1D);
    assertEquals(2, actualPolynomialsAndFirstDerivative.length);
    assertEquals(second, first.derivative());
    assertArrayEquals(
        new double[] {11.0d}, ((RealPolynomialFunction1D) second).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 11.0d}, ((RealPolynomialFunction1D) first).getCoefficients(), 0.0);
  }

  /**
   * Test new {@link JacobiPolynomialFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link JacobiPolynomialFunction}
   */
  @Test
  @DisplayName("Test new JacobiPolynomialFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void JacobiPolynomialFunction.<init>()"})
  void testNewJacobiPolynomialFunction() {
    // Arrange and Act
    JacobiPolynomialFunction actualJacobiPolynomialFunction = new JacobiPolynomialFunction();

    // Assert
    DoubleFunction1D one = actualJacobiPolynomialFunction.getOne();
    assertTrue(one instanceof RealPolynomialFunction1D);
    DoubleFunction1D x = actualJacobiPolynomialFunction.getX();
    assertTrue(x instanceof RealPolynomialFunction1D);
    DoubleFunction1D zero = actualJacobiPolynomialFunction.getZero();
    assertTrue(zero instanceof RealPolynomialFunction1D);
    assertArrayEquals(
        new double[] {0.0d}, ((RealPolynomialFunction1D) zero).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) x.derivative()).getCoefficients(), 0.0);
    assertArrayEquals(new double[] {1.0d}, ((RealPolynomialFunction1D) one).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.0d}, ((RealPolynomialFunction1D) x).getCoefficients(), 0.0);
  }
}
