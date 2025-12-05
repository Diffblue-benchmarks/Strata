package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PolynomialDiffblueTest {
  /**
   * Test {@link Polynomial#p1evl(double, double[], int)}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and {@code 0.5}.
   *   <li>Then return {@code 24.5}.
   * </ul>
   *
   * <p>Method under test: {@link Polynomial#p1evl(double, double[], int)}
   */
  @Test
  @DisplayName(
      "Test p1evl(double, double[], int); when array of double with ten and '0.5'; then return '24.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Polynomial.p1evl(double, double[], int)"})
  void testP1evl_whenArrayOfDoubleWithTenAnd05_thenReturn245() throws ArithmeticException {
    // Arrange and Act
    double actualP1evlResult = Polynomial.p1evl(2.0d, new double[] {10.0d, 0.5d, 10.0d, 0.5d}, 2);

    // Assert
    assertEquals(24.5d, actualP1evlResult);
  }

  /**
   * Test {@link Polynomial#p1evl(double, double[], int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return twelve.
   * </ul>
   *
   * <p>Method under test: {@link Polynomial#p1evl(double, double[], int)}
   */
  @Test
  @DisplayName("Test p1evl(double, double[], int); when one; then return twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Polynomial.p1evl(double, double[], int)"})
  void testP1evl_whenOne_thenReturnTwelve() throws ArithmeticException {
    // Arrange and Act
    double actualP1evlResult = Polynomial.p1evl(2.0d, new double[] {10.0d, 0.5d, 10.0d, 0.5d}, 1);

    // Assert
    assertEquals(12.0d, actualP1evlResult);
  }

  /**
   * Test {@link Polynomial#polevl(double, double[], int)}.
   *
   * <ul>
   *   <li>When array of {@code double} with ten and {@code 0.5}.
   *   <li>Then return {@code 20.5}.
   * </ul>
   *
   * <p>Method under test: {@link Polynomial#polevl(double, double[], int)}
   */
  @Test
  @DisplayName(
      "Test polevl(double, double[], int); when array of double with ten and '0.5'; then return '20.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Polynomial.polevl(double, double[], int)"})
  void testPolevl_whenArrayOfDoubleWithTenAnd05_thenReturn205() throws ArithmeticException {
    // Arrange and Act
    double actualPolevlResult = Polynomial.polevl(2.0d, new double[] {10.0d, 0.5d, 10.0d, 0.5d}, 1);

    // Assert
    assertEquals(20.5d, actualPolevlResult);
  }
}
