package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.math.impl.function.DoubleFunction1D;
import com.opengamma.strata.math.impl.function.RealPolynomialFunction1D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LaguerrePolynomialFunctionDiffblueTest {
  /**
   * Test {@link LaguerrePolynomialFunction#getPolynomials(int, double)} with {@code n}, {@code
   * alpha}.
   *
   * <ul>
   *   <li>Then first element return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link LaguerrePolynomialFunction#getPolynomials(int, double)}
   */
  @Test
  @DisplayName(
      "Test getPolynomials(int, double) with 'n', 'alpha'; then first element return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] LaguerrePolynomialFunction.getPolynomials(int, double)"})
  void testGetPolynomialsWithNAlpha_thenFirstElementReturnRealPolynomialFunction1D() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials =
        new LaguerrePolynomialFunction().getPolynomials(1, 10.0d);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[0];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    DoubleFunction1D doubleFunction1D2 = actualPolynomials[1];
    assertTrue(doubleFunction1D2 instanceof RealPolynomialFunction1D);
    assertEquals(2, actualPolynomials.length);
    assertArrayEquals(
        new double[] {-1.0d},
        ((RealPolynomialFunction1D) doubleFunction1D2.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {11.0d, -1.0d},
        ((RealPolynomialFunction1D) doubleFunction1D2).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link LaguerrePolynomialFunction#getPolynomials(int, double)} with {@code n}, {@code
   * alpha}.
   *
   * <ul>
   *   <li>Then third element return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link LaguerrePolynomialFunction#getPolynomials(int, double)}
   */
  @Test
  @DisplayName(
      "Test getPolynomials(int, double) with 'n', 'alpha'; then third element return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] LaguerrePolynomialFunction.getPolynomials(int, double)"})
  void testGetPolynomialsWithNAlpha_thenThirdElementReturnRealPolynomialFunction1D() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials =
        new LaguerrePolynomialFunction().getPolynomials(2, 10.0d);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[1];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    DoubleFunction1D doubleFunction1D2 = actualPolynomials[2];
    assertTrue(doubleFunction1D2 instanceof RealPolynomialFunction1D);
    assertEquals(3, actualPolynomials.length);
    DoubleFunction1D expectedDerivativeResult = actualPolynomials[0];
    DoubleFunction1D derivativeResult = doubleFunction1D2.derivative();
    assertEquals(expectedDerivativeResult, derivativeResult.derivative());
    assertArrayEquals(
        new double[] {-1.0d},
        ((RealPolynomialFunction1D) doubleFunction1D.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {-12.0d, 1.0d},
        ((RealPolynomialFunction1D) derivativeResult).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {11.0d, -1.0d},
        ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {66.0d, -12.0d, 0.5d},
        ((RealPolynomialFunction1D) doubleFunction1D2).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link LaguerrePolynomialFunction#getPolynomials(int)} with {@code n}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then first element return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link LaguerrePolynomialFunction#getPolynomials(int)}
   */
  @Test
  @DisplayName(
      "Test getPolynomials(int) with 'n'; when one; then first element return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] LaguerrePolynomialFunction.getPolynomials(int)"})
  void testGetPolynomialsWithN_whenOne_thenFirstElementReturnRealPolynomialFunction1D() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials = new LaguerrePolynomialFunction().getPolynomials(1);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[0];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    DoubleFunction1D doubleFunction1D2 = actualPolynomials[1];
    assertTrue(doubleFunction1D2 instanceof RealPolynomialFunction1D);
    assertEquals(2, actualPolynomials.length);
    assertArrayEquals(
        new double[] {-1.0d},
        ((RealPolynomialFunction1D) doubleFunction1D2.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0d, -1.0d},
        ((RealPolynomialFunction1D) doubleFunction1D2).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link LaguerrePolynomialFunction#getPolynomials(int)} with {@code n}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then third element return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link LaguerrePolynomialFunction#getPolynomials(int)}
   */
  @Test
  @DisplayName(
      "Test getPolynomials(int) with 'n'; when two; then third element return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] LaguerrePolynomialFunction.getPolynomials(int)"})
  void testGetPolynomialsWithN_whenTwo_thenThirdElementReturnRealPolynomialFunction1D() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials = new LaguerrePolynomialFunction().getPolynomials(2);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[1];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    DoubleFunction1D doubleFunction1D2 = actualPolynomials[2];
    assertTrue(doubleFunction1D2 instanceof RealPolynomialFunction1D);
    assertEquals(3, actualPolynomials.length);
    DoubleFunction1D expectedDerivativeResult = actualPolynomials[0];
    DoubleFunction1D derivativeResult = doubleFunction1D2.derivative();
    assertEquals(expectedDerivativeResult, derivativeResult.derivative());
    assertArrayEquals(
        new double[] {-1.0d},
        ((RealPolynomialFunction1D) doubleFunction1D.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {-2.0d, 1.0d},
        ((RealPolynomialFunction1D) derivativeResult).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0d, -1.0d},
        ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0d, -2.0d, 0.5d},
        ((RealPolynomialFunction1D) doubleFunction1D2).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link LaguerrePolynomialFunction#getPolynomialsAndFirstDerivative(int)} with {@code n}.
   *
   * <p>Method under test: {@link LaguerrePolynomialFunction#getPolynomialsAndFirstDerivative(int)}
   */
  @Test
  @DisplayName("Test getPolynomialsAndFirstDerivative(int) with 'n'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair[] LaguerrePolynomialFunction.getPolynomialsAndFirstDerivative(int)"})
  void testGetPolynomialsAndFirstDerivativeWithN() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new LaguerrePolynomialFunction().getPolynomialsAndFirstDerivative(1);

    // Assert
    Pair<DoubleFunction1D, DoubleFunction1D> pair = actualPolynomialsAndFirstDerivative[0];
    DoubleFunction1D first = pair.getFirst();
    assertTrue(first instanceof RealPolynomialFunction1D);
    Pair<DoubleFunction1D, DoubleFunction1D> pair2 = actualPolynomialsAndFirstDerivative[1];
    DoubleFunction1D first2 = pair2.getFirst();
    assertTrue(first2 instanceof RealPolynomialFunction1D);
    DoubleFunction1D second = pair.getSecond();
    assertTrue(second instanceof RealPolynomialFunction1D);
    DoubleFunction1D second2 = pair2.getSecond();
    assertTrue(second2 instanceof RealPolynomialFunction1D);
    assertEquals(2, pair.size());
    assertEquals(2, pair2.size());
    assertEquals(2, actualPolynomialsAndFirstDerivative.length);
    assertEquals(second2, first2.derivative());
    assertArrayEquals(
        new double[] {-1.0d}, ((RealPolynomialFunction1D) second2).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {0.0d}, ((RealPolynomialFunction1D) second).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) first).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0d, -1.0d}, ((RealPolynomialFunction1D) first2).getCoefficients(), 0.0);
  }

  /**
   * Test {@link LaguerrePolynomialFunction#getPolynomialsAndFirstDerivative(int)} with {@code n}.
   *
   * <p>Method under test: {@link LaguerrePolynomialFunction#getPolynomialsAndFirstDerivative(int)}
   */
  @Test
  @DisplayName("Test getPolynomialsAndFirstDerivative(int) with 'n'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair[] LaguerrePolynomialFunction.getPolynomialsAndFirstDerivative(int)"})
  void testGetPolynomialsAndFirstDerivativeWithN2() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new LaguerrePolynomialFunction().getPolynomialsAndFirstDerivative(2);

    // Assert
    assertTrue(
        actualPolynomialsAndFirstDerivative[1].getFirst() instanceof RealPolynomialFunction1D);
    Pair<DoubleFunction1D, DoubleFunction1D> pair = actualPolynomialsAndFirstDerivative[2];
    DoubleFunction1D first = pair.getFirst();
    assertTrue(first instanceof RealPolynomialFunction1D);
    assertEquals(2, pair.size());
    assertEquals(3, actualPolynomialsAndFirstDerivative.length);
    assertArrayEquals(
        new double[] {-2.0d, 1.0d},
        ((RealPolynomialFunction1D) first.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0d, -2.0d, 0.5d},
        ((RealPolynomialFunction1D) first).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link LaguerrePolynomialFunction#getPolynomialsAndFirstDerivative(int, double)} with
   * {@code n}, {@code alpha}.
   *
   * <p>Method under test: {@link LaguerrePolynomialFunction#getPolynomialsAndFirstDerivative(int,
   * double)}
   */
  @Test
  @DisplayName("Test getPolynomialsAndFirstDerivative(int, double) with 'n', 'alpha'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair[] LaguerrePolynomialFunction.getPolynomialsAndFirstDerivative(int, double)"
  })
  void testGetPolynomialsAndFirstDerivativeWithNAlpha() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new LaguerrePolynomialFunction().getPolynomialsAndFirstDerivative(1, 10.0d);

    // Assert
    Pair<DoubleFunction1D, DoubleFunction1D> pair = actualPolynomialsAndFirstDerivative[0];
    DoubleFunction1D first = pair.getFirst();
    assertTrue(first instanceof RealPolynomialFunction1D);
    Pair<DoubleFunction1D, DoubleFunction1D> pair2 = actualPolynomialsAndFirstDerivative[1];
    DoubleFunction1D first2 = pair2.getFirst();
    assertTrue(first2 instanceof RealPolynomialFunction1D);
    DoubleFunction1D second = pair.getSecond();
    assertTrue(second instanceof RealPolynomialFunction1D);
    DoubleFunction1D second2 = pair2.getSecond();
    assertTrue(second2 instanceof RealPolynomialFunction1D);
    assertEquals(2, pair.size());
    assertEquals(2, pair2.size());
    assertEquals(2, actualPolynomialsAndFirstDerivative.length);
    assertEquals(second2, first2.derivative());
    assertArrayEquals(
        new double[] {-1.0d}, ((RealPolynomialFunction1D) second2).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {0.0d}, ((RealPolynomialFunction1D) second).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) first).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0d, -1.0d}, ((RealPolynomialFunction1D) first2).getCoefficients(), 0.0);
  }

  /**
   * Test {@link LaguerrePolynomialFunction#getPolynomialsAndFirstDerivative(int, double)} with
   * {@code n}, {@code alpha}.
   *
   * <p>Method under test: {@link LaguerrePolynomialFunction#getPolynomialsAndFirstDerivative(int,
   * double)}
   */
  @Test
  @DisplayName("Test getPolynomialsAndFirstDerivative(int, double) with 'n', 'alpha'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair[] LaguerrePolynomialFunction.getPolynomialsAndFirstDerivative(int, double)"
  })
  void testGetPolynomialsAndFirstDerivativeWithNAlpha2() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new LaguerrePolynomialFunction().getPolynomialsAndFirstDerivative(2, 10.0d);

    // Assert
    assertTrue(
        actualPolynomialsAndFirstDerivative[1].getFirst() instanceof RealPolynomialFunction1D);
    Pair<DoubleFunction1D, DoubleFunction1D> pair = actualPolynomialsAndFirstDerivative[2];
    DoubleFunction1D first = pair.getFirst();
    assertTrue(first instanceof RealPolynomialFunction1D);
    assertEquals(2, pair.size());
    assertEquals(3, actualPolynomialsAndFirstDerivative.length);
    assertArrayEquals(
        new double[] {-7.0d, 1.0d},
        ((RealPolynomialFunction1D) first.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0d, -7.0d, 0.5d},
        ((RealPolynomialFunction1D) first).getCoefficients(),
        0.0);
  }

  /**
   * Test new {@link LaguerrePolynomialFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * LaguerrePolynomialFunction}
   */
  @Test
  @DisplayName("Test new LaguerrePolynomialFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LaguerrePolynomialFunction.<init>()"})
  void testNewLaguerrePolynomialFunction() {
    // Arrange and Act
    LaguerrePolynomialFunction actualLaguerrePolynomialFunction = new LaguerrePolynomialFunction();

    // Assert
    DoubleFunction1D one = actualLaguerrePolynomialFunction.getOne();
    assertTrue(one instanceof RealPolynomialFunction1D);
    DoubleFunction1D x = actualLaguerrePolynomialFunction.getX();
    assertTrue(x instanceof RealPolynomialFunction1D);
    DoubleFunction1D zero = actualLaguerrePolynomialFunction.getZero();
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
