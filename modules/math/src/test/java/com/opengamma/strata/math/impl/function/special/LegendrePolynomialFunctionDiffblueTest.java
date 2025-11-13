package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.math.impl.function.DoubleFunction1D;
import com.opengamma.strata.math.impl.function.RealPolynomialFunction1D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LegendrePolynomialFunctionDiffblueTest {
  /**
   * Test {@link LegendrePolynomialFunction#getPolynomials(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then first element return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link LegendrePolynomialFunction#getPolynomials(int)}
   */
  @Test
  @DisplayName(
      "Test getPolynomials(int); when one; then first element return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] LegendrePolynomialFunction.getPolynomials(int)"})
  void testGetPolynomials_whenOne_thenFirstElementReturnRealPolynomialFunction1D() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials = new LegendrePolynomialFunction().getPolynomials(1);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[0];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    DoubleFunction1D doubleFunction1D2 = actualPolynomials[1];
    assertTrue(doubleFunction1D2 instanceof RealPolynomialFunction1D);
    assertEquals(2, actualPolynomials.length);
    assertEquals(doubleFunction1D, doubleFunction1D2.derivative());
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.0d},
        ((RealPolynomialFunction1D) doubleFunction1D2).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link LegendrePolynomialFunction#getPolynomials(int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then third element return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link LegendrePolynomialFunction#getPolynomials(int)}
   */
  @Test
  @DisplayName(
      "Test getPolynomials(int); when two; then third element return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] LegendrePolynomialFunction.getPolynomials(int)"})
  void testGetPolynomials_whenTwo_thenThirdElementReturnRealPolynomialFunction1D() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials = new LegendrePolynomialFunction().getPolynomials(2);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[1];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    DoubleFunction1D doubleFunction1D2 = actualPolynomials[2];
    assertTrue(doubleFunction1D2 instanceof RealPolynomialFunction1D);
    assertEquals(3, actualPolynomials.length);
    DoubleFunction1D expectedDerivativeResult = actualPolynomials[0];
    assertEquals(expectedDerivativeResult, doubleFunction1D.derivative());
    DoubleFunction1D derivativeResult = doubleFunction1D2.derivative();
    assertArrayEquals(
        new double[] {3.0d},
        ((RealPolynomialFunction1D) derivativeResult.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 3.0d},
        ((RealPolynomialFunction1D) derivativeResult).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {-0.5d, 0.0d, 1.5d},
        ((RealPolynomialFunction1D) doubleFunction1D2).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link LegendrePolynomialFunction#getPolynomialsAndFirstDerivative(int)}.
   *
   * <p>Method under test: {@link LegendrePolynomialFunction#getPolynomialsAndFirstDerivative(int)}
   */
  @Test
  @DisplayName("Test getPolynomialsAndFirstDerivative(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair[] LegendrePolynomialFunction.getPolynomialsAndFirstDerivative(int)"})
  void testGetPolynomialsAndFirstDerivative() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new LegendrePolynomialFunction().getPolynomialsAndFirstDerivative(1);

    // Assert
    Pair<DoubleFunction1D, DoubleFunction1D> pair = actualPolynomialsAndFirstDerivative[0];
    DoubleFunction1D first = pair.getFirst();
    assertTrue(first instanceof RealPolynomialFunction1D);
    Pair<DoubleFunction1D, DoubleFunction1D> pair2 = actualPolynomialsAndFirstDerivative[1];
    DoubleFunction1D first2 = pair2.getFirst();
    assertTrue(first2 instanceof RealPolynomialFunction1D);
    DoubleFunction1D second = pair.getSecond();
    assertTrue(second instanceof RealPolynomialFunction1D);
    assertEquals(2, pair.size());
    assertEquals(2, pair2.size());
    assertEquals(2, actualPolynomialsAndFirstDerivative.length);
    assertEquals(first, first2.derivative());
    assertSame(first, pair2.getSecond());
    assertArrayEquals(
        new double[] {0.0d}, ((RealPolynomialFunction1D) second).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) first).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.0d}, ((RealPolynomialFunction1D) first2).getCoefficients(), 0.0);
  }

  /**
   * Test {@link LegendrePolynomialFunction#getPolynomialsAndFirstDerivative(int)}.
   *
   * <p>Method under test: {@link LegendrePolynomialFunction#getPolynomialsAndFirstDerivative(int)}
   */
  @Test
  @DisplayName("Test getPolynomialsAndFirstDerivative(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Pair[] LegendrePolynomialFunction.getPolynomialsAndFirstDerivative(int)"})
  void testGetPolynomialsAndFirstDerivative2() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new LegendrePolynomialFunction().getPolynomialsAndFirstDerivative(2);

    // Assert
    assertTrue(
        actualPolynomialsAndFirstDerivative[1].getFirst() instanceof RealPolynomialFunction1D);
    Pair<DoubleFunction1D, DoubleFunction1D> pair = actualPolynomialsAndFirstDerivative[2];
    DoubleFunction1D first = pair.getFirst();
    assertTrue(first instanceof RealPolynomialFunction1D);
    DoubleFunction1D second = pair.getSecond();
    assertTrue(second instanceof RealPolynomialFunction1D);
    assertEquals(2, pair.size());
    assertEquals(3, actualPolynomialsAndFirstDerivative.length);
    assertArrayEquals(
        new double[] {3.0d},
        ((RealPolynomialFunction1D) second.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 3.0d}, ((RealPolynomialFunction1D) second).getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 3.0d},
        ((RealPolynomialFunction1D) first.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {-0.5d, 0.0d, 1.5d},
        ((RealPolynomialFunction1D) first).getCoefficients(),
        0.0);
  }

  /**
   * Test new {@link LegendrePolynomialFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * LegendrePolynomialFunction}
   */
  @Test
  @DisplayName("Test new LegendrePolynomialFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LegendrePolynomialFunction.<init>()"})
  void testNewLegendrePolynomialFunction() {
    // Arrange and Act
    LegendrePolynomialFunction actualLegendrePolynomialFunction = new LegendrePolynomialFunction();

    // Assert
    DoubleFunction1D one = actualLegendrePolynomialFunction.getOne();
    assertTrue(one instanceof RealPolynomialFunction1D);
    DoubleFunction1D x = actualLegendrePolynomialFunction.getX();
    assertTrue(x instanceof RealPolynomialFunction1D);
    DoubleFunction1D zero = actualLegendrePolynomialFunction.getZero();
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
