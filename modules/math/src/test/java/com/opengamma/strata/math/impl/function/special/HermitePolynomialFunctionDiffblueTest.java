package com.opengamma.strata.math.impl.function.special;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.function.DoubleFunction1D;
import com.opengamma.strata.math.impl.function.RealPolynomialFunction1D;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HermitePolynomialFunctionDiffblueTest {
  /**
   * Test {@link HermitePolynomialFunction#getPolynomials(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return array length is two.
   * </ul>
   *
   * <p>Method under test: {@link HermitePolynomialFunction#getPolynomials(int)}
   */
  @Test
  @DisplayName("Test getPolynomials(int); when one; then return array length is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] HermitePolynomialFunction.getPolynomials(int)"})
  void testGetPolynomials_whenOne_thenReturnArrayLengthIsTwo() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials = new HermitePolynomialFunction().getPolynomials(1);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[0];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    assertEquals(2, actualPolynomials.length);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(), 0.0);
  }

  /**
   * Test {@link HermitePolynomialFunction#getPolynomials(int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return array length is four.
   * </ul>
   *
   * <p>Method under test: {@link HermitePolynomialFunction#getPolynomials(int)}
   */
  @Test
  @DisplayName("Test getPolynomials(int); when three; then return array length is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] HermitePolynomialFunction.getPolynomials(int)"})
  void testGetPolynomials_whenThree_thenReturnArrayLengthIsFour() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials = new HermitePolynomialFunction().getPolynomials(3);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[0];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    assertEquals(4, actualPolynomials.length);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(), 0.0);
  }

  /**
   * Test {@link HermitePolynomialFunction#getPolynomials(int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return array length is three.
   * </ul>
   *
   * <p>Method under test: {@link HermitePolynomialFunction#getPolynomials(int)}
   */
  @Test
  @DisplayName("Test getPolynomials(int); when two; then return array length is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D[] HermitePolynomialFunction.getPolynomials(int)"})
  void testGetPolynomials_whenTwo_thenReturnArrayLengthIsThree() {
    // Arrange and Act
    DoubleFunction1D[] actualPolynomials = new HermitePolynomialFunction().getPolynomials(2);

    // Assert
    DoubleFunction1D doubleFunction1D = actualPolynomials[0];
    assertTrue(doubleFunction1D instanceof RealPolynomialFunction1D);
    assertEquals(3, actualPolynomials.length);
    assertArrayEquals(
        new double[] {1.0d}, ((RealPolynomialFunction1D) doubleFunction1D).getCoefficients(), 0.0);
  }

  /**
   * Test {@link HermitePolynomialFunction#getPolynomialsAndFirstDerivative(int)}.
   *
   * <p>Method under test: {@link HermitePolynomialFunction#getPolynomialsAndFirstDerivative(int)}
   */
  @Test
  @DisplayName("Test getPolynomialsAndFirstDerivative(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.collect.tuple.Pair[] HermitePolynomialFunction.getPolynomialsAndFirstDerivative(int)"
  })
  void testGetPolynomialsAndFirstDerivative() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new HermitePolynomialFunction().getPolynomialsAndFirstDerivative(1));
  }

  /**
   * Test new {@link HermitePolynomialFunction} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link HermitePolynomialFunction}
   */
  @Test
  @DisplayName("Test new HermitePolynomialFunction (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void HermitePolynomialFunction.<init>()"})
  void testNewHermitePolynomialFunction() {
    // Arrange and Act
    HermitePolynomialFunction actualHermitePolynomialFunction = new HermitePolynomialFunction();

    // Assert
    DoubleFunction1D one = actualHermitePolynomialFunction.getOne();
    assertTrue(one instanceof RealPolynomialFunction1D);
    DoubleFunction1D x = actualHermitePolynomialFunction.getX();
    assertTrue(x instanceof RealPolynomialFunction1D);
    DoubleFunction1D zero = actualHermitePolynomialFunction.getZero();
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
