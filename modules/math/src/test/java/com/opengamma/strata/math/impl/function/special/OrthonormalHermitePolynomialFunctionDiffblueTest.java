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

class OrthonormalHermitePolynomialFunctionDiffblueTest {
  /**
   * Test {@link OrthonormalHermitePolynomialFunction#getPolynomials(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then first element return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link OrthonormalHermitePolynomialFunction#getPolynomials(int)}
   */
  @Test
  @DisplayName(
      "Test getPolynomials(int); when one; then first element return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] OrthonormalHermitePolynomialFunction.getPolynomials(int)"})
  void testGetPolynomials_whenOne_thenFirstElementReturnRealPolynomialFunction1D() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials =
        new OrthonormalHermitePolynomialFunction().getPolynomials(1);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[0];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    DoubleFunction1D doubleFunction1D2 = actualPolynomials[1];
    assertTrue(doubleFunction1D2 instanceof RealPolynomialFunction1D);
    assertEquals(2, actualPolynomials.length);
    assertArrayEquals(
        new double[] {0.7511255444649425d},
        ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.062251932027197d},
        ((RealPolynomialFunction1D) doubleFunction1D2.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.062251932027197d},
        ((RealPolynomialFunction1D) doubleFunction1D2).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link OrthonormalHermitePolynomialFunction#getPolynomials(int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then third element return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link OrthonormalHermitePolynomialFunction#getPolynomials(int)}
   */
  @Test
  @DisplayName(
      "Test getPolynomials(int); when two; then third element return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] OrthonormalHermitePolynomialFunction.getPolynomials(int)"})
  void testGetPolynomials_whenTwo_thenThirdElementReturnRealPolynomialFunction1D() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials =
        new OrthonormalHermitePolynomialFunction().getPolynomials(2);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[1];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    DoubleFunction1D doubleFunction1D2 = actualPolynomials[2];
    assertTrue(doubleFunction1D2 instanceof RealPolynomialFunction1D);
    assertEquals(3, actualPolynomials.length);
    assertArrayEquals(
        new double[] {1.062251932027197d},
        ((RealPolynomialFunction1D) doubleFunction1D.derivative()).getCoefficients(),
        0.0);
    DoubleFunction1D derivativeResult = doubleFunction1D2.derivative();
    assertArrayEquals(
        new double[] {2.124503864054394d},
        ((RealPolynomialFunction1D) derivativeResult.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.062251932027197d},
        ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 2.124503864054394d},
        ((RealPolynomialFunction1D) derivativeResult).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {-0.5311259660135985d, 0.0d, 1.062251932027197d},
        ((RealPolynomialFunction1D) doubleFunction1D2).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link OrthonormalHermitePolynomialFunction#getPolynomialsAndFirstDerivative(int)}.
   *
   * <p>Method under test: {@link
   * OrthonormalHermitePolynomialFunction#getPolynomialsAndFirstDerivative(int)}
   */
  @Test
  @DisplayName("Test getPolynomialsAndFirstDerivative(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair[] OrthonormalHermitePolynomialFunction.getPolynomialsAndFirstDerivative(int)"
  })
  void testGetPolynomialsAndFirstDerivative() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new OrthonormalHermitePolynomialFunction().getPolynomialsAndFirstDerivative(1);

    // Assert
    Pair<DoubleFunction1D, DoubleFunction1D> pair = actualPolynomialsAndFirstDerivative[1];
    DoubleFunction1D first = pair.getFirst();
    assertTrue(first instanceof RealPolynomialFunction1D);
    DoubleFunction1D second = pair.getSecond();
    assertTrue(second instanceof RealPolynomialFunction1D);
    assertEquals(2, pair.size());
    assertEquals(2, actualPolynomialsAndFirstDerivative.length);
    assertEquals(second, first.derivative());
    assertArrayEquals(
        new double[] {1.062251932027197d},
        ((RealPolynomialFunction1D) second).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.062251932027197d},
        ((RealPolynomialFunction1D) first).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link OrthonormalHermitePolynomialFunction#getPolynomialsAndFirstDerivative(int)}.
   *
   * <p>Method under test: {@link
   * OrthonormalHermitePolynomialFunction#getPolynomialsAndFirstDerivative(int)}
   */
  @Test
  @DisplayName("Test getPolynomialsAndFirstDerivative(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair[] OrthonormalHermitePolynomialFunction.getPolynomialsAndFirstDerivative(int)"
  })
  void testGetPolynomialsAndFirstDerivative2() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new OrthonormalHermitePolynomialFunction().getPolynomialsAndFirstDerivative(0);

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
        new double[] {0.7511255444649425d},
        ((RealPolynomialFunction1D) first).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link OrthonormalHermitePolynomialFunction#getPolynomialsAndFirstDerivative(int)}.
   *
   * <p>Method under test: {@link
   * OrthonormalHermitePolynomialFunction#getPolynomialsAndFirstDerivative(int)}
   */
  @Test
  @DisplayName("Test getPolynomialsAndFirstDerivative(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair[] OrthonormalHermitePolynomialFunction.getPolynomialsAndFirstDerivative(int)"
  })
  void testGetPolynomialsAndFirstDerivative3() {
    // Arrange and Act
    Pair<DoubleFunction1D, DoubleFunction1D>[] actualPolynomialsAndFirstDerivative =
        new OrthonormalHermitePolynomialFunction().getPolynomialsAndFirstDerivative(2);

    // Assert
    DoubleFunction1D first = actualPolynomialsAndFirstDerivative[1].getFirst();
    assertTrue(first instanceof RealPolynomialFunction1D);
    Pair<DoubleFunction1D, DoubleFunction1D> pair = actualPolynomialsAndFirstDerivative[2];
    DoubleFunction1D first2 = pair.getFirst();
    assertTrue(first2 instanceof RealPolynomialFunction1D);
    DoubleFunction1D second = pair.getSecond();
    assertTrue(second instanceof RealPolynomialFunction1D);
    assertEquals(2, pair.size());
    assertEquals(3, actualPolynomialsAndFirstDerivative.length);
    assertArrayEquals(
        new double[] {2.124503864054394d},
        ((RealPolynomialFunction1D) second.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.062251932027197d},
        ((RealPolynomialFunction1D) first).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 2.124503864054394d},
        ((RealPolynomialFunction1D) second).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 2.124503864054394d},
        ((RealPolynomialFunction1D) first2.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {-0.5311259660135985d, 0.0d, 1.062251932027197d},
        ((RealPolynomialFunction1D) first2).getCoefficients(),
        0.0);
  }

  /**
   * Test new {@link OrthonormalHermitePolynomialFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * OrthonormalHermitePolynomialFunction}
   */
  @Test
  @DisplayName("Test new OrthonormalHermitePolynomialFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void OrthonormalHermitePolynomialFunction.<init>()"})
  void testNewOrthonormalHermitePolynomialFunction() {
    // Arrange and Act
    OrthonormalHermitePolynomialFunction actualOrthonormalHermitePolynomialFunction =
        new OrthonormalHermitePolynomialFunction();

    // Assert
    DoubleFunction1D one = actualOrthonormalHermitePolynomialFunction.getOne();
    assertTrue(one instanceof RealPolynomialFunction1D);
    DoubleFunction1D x = actualOrthonormalHermitePolynomialFunction.getX();
    assertTrue(x instanceof RealPolynomialFunction1D);
    DoubleFunction1D zero = actualOrthonormalHermitePolynomialFunction.getZero();
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
