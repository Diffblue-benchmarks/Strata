package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ArithmeticDiffblueTest {
  /**
   * Test {@link Arithmetic#binomial(long, long)} with {@code n}, {@code inK}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(long, long)}
   */
  @Test
  @DisplayName("Test binomial(long, long) with 'n', 'inK'; when five; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(long, long)"})
  void testBinomialWithNInK_whenFive_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Arithmetic.binomial(5L, 5L));
  }

  /**
   * Test {@link Arithmetic#binomial(long, long)} with {@code n}, {@code inK}.
   *
   * <ul>
   *   <li>When {@link Long#MAX_VALUE}.
   *   <li>Then return {@code 5.56246623937737E92}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(long, long)}
   */
  @Test
  @DisplayName(
      "Test binomial(long, long) with 'n', 'inK'; when MAX_VALUE; then return '5.56246623937737E92'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(long, long)"})
  void testBinomialWithNInK_whenMax_value_thenReturn556246623937737e92() {
    // Arrange, Act and Assert
    assertEquals(5.56246623937737E92d, Arithmetic.binomial(Long.MAX_VALUE, 5L));
  }

  /**
   * Test {@link Arithmetic#binomial(long, long)} with {@code n}, {@code inK}.
   *
   * <ul>
   *   <li>When {@link Long#MIN_VALUE}.
   *   <li>Then return {@code -9.223372036854776E18}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(long, long)}
   */
  @Test
  @DisplayName(
      "Test binomial(long, long) with 'n', 'inK'; when MIN_VALUE; then return '-9.223372036854776E18'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(long, long)"})
  void testBinomialWithNInK_whenMin_value_thenReturn9223372036854776e18() {
    // Arrange, Act and Assert
    assertEquals(-9.223372036854776E18d, Arithmetic.binomial(Long.MIN_VALUE, Long.MAX_VALUE));
  }

  /**
   * Test {@link Arithmetic#binomial(long, long)} with {@code n}, {@code inK}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(long, long)}
   */
  @Test
  @DisplayName("Test binomial(long, long) with 'n', 'inK'; when minus one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(long, long)"})
  void testBinomialWithNInK_whenMinusOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Arithmetic.binomial(5L, -1L));
  }

  /**
   * Test {@link Arithmetic#binomial(long, long)} with {@code n}, {@code inK}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(long, long)}
   */
  @Test
  @DisplayName("Test binomial(long, long) with 'n', 'inK'; when one; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(long, long)"})
  void testBinomialWithNInK_whenOne_thenReturn00() {
    // Arrange, Act and Assert
    assertEquals(-0.0d, Arithmetic.binomial(1L, 5L));
  }

  /**
   * Test {@link Arithmetic#binomial(long, long)} with {@code n}, {@code inK}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return five.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(long, long)}
   */
  @Test
  @DisplayName("Test binomial(long, long) with 'n', 'inK'; when one; then return five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(long, long)"})
  void testBinomialWithNInK_whenOne_thenReturnFive() {
    // Arrange, Act and Assert
    assertEquals(5.0d, Arithmetic.binomial(5L, 1L));
  }

  /**
   * Test {@link Arithmetic#binomial(long, long)} with {@code n}, {@code inK}.
   *
   * <ul>
   *   <li>When twenty-one.
   *   <li>Then return two hundred ten.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(long, long)}
   */
  @Test
  @DisplayName(
      "Test binomial(long, long) with 'n', 'inK'; when twenty-one; then return two hundred ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(long, long)"})
  void testBinomialWithNInK_whenTwentyOne_thenReturnTwoHundredTen() {
    // Arrange, Act and Assert
    assertEquals(210.0d, Arithmetic.binomial(21L, 2L));
  }

  /**
   * Test {@link Arithmetic#binomial(long, long)} with {@code n}, {@code inK}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(long, long)}
   */
  @Test
  @DisplayName("Test binomial(long, long) with 'n', 'inK'; when two; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(long, long)"})
  void testBinomialWithNInK_whenTwo_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, Arithmetic.binomial(5L, 2L));
  }

  /**
   * Test {@link Arithmetic#binomial(long, long)} with {@code n}, {@code inK}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(long, long)}
   */
  @Test
  @DisplayName("Test binomial(long, long) with 'n', 'inK'; when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(long, long)"})
  void testBinomialWithNInK_whenZero_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Arithmetic.binomial(5L, 0L));
  }

  /**
   * Test {@link Arithmetic#binomial(double, long)} with {@code n}, {@code k}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return two hundred fifty-two.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(double, long)}
   */
  @Test
  @DisplayName(
      "Test binomial(double, long) with 'n', 'k'; when five; then return two hundred fifty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(double, long)"})
  void testBinomialWithNK_whenFive_thenReturnTwoHundredFiftyTwo() {
    // Arrange, Act and Assert
    assertEquals(252.0d, Arithmetic.binomial(10.0d, 5L));
  }

  /**
   * Test {@link Arithmetic#binomial(double, long)} with {@code n}, {@code k}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(double, long)}
   */
  @Test
  @DisplayName("Test binomial(double, long) with 'n', 'k'; when minus one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(double, long)"})
  void testBinomialWithNK_whenMinusOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Arithmetic.binomial(10.0d, -1L));
  }

  /**
   * Test {@link Arithmetic#binomial(double, long)} with {@code n}, {@code k}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(double, long)}
   */
  @Test
  @DisplayName("Test binomial(double, long) with 'n', 'k'; when one; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(double, long)"})
  void testBinomialWithNK_whenOne_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, Arithmetic.binomial(10.0d, 1L));
  }

  /**
   * Test {@link Arithmetic#binomial(double, long)} with {@code n}, {@code k}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#binomial(double, long)}
   */
  @Test
  @DisplayName("Test binomial(double, long) with 'n', 'k'; when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.binomial(double, long)"})
  void testBinomialWithNK_whenZero_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Arithmetic.binomial(10.0d, 0L));
  }

  /**
   * Test {@link Arithmetic#ceil(double)}.
   *
   * <p>Method under test: {@link Arithmetic#ceil(double)}
   */
  @Test
  @DisplayName("Test ceil(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Arithmetic.ceil(double)"})
  void testCeil() {
    // Arrange, Act and Assert
    assertEquals(10L, Arithmetic.ceil(10.0d));
  }

  /**
   * Test {@link Arithmetic#chbevl(double, double[], int)}.
   *
   * <ul>
   *   <li>Then return {@code 9.999702380952382}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#chbevl(double, double[], int)}
   */
  @Test
  @DisplayName("Test chbevl(double, double[], int); then return '9.999702380952382'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.chbevl(double, double[], int)"})
  void testChbevl_thenReturn9999702380952382() throws ArithmeticException {
    // Arrange and Act
    double actualChbevlResult =
        Arithmetic.chbevl(
            2.0d, new double[] {10.0d, -5.952380952380953E-4d, 10.0d, -5.952380952380953E-4d}, 1);

    // Assert
    assertEquals(9.999702380952382d, actualChbevlResult);
  }

  /**
   * Test {@link Arithmetic#factorial(int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#factorial(int)}
   */
  @Test
  @DisplayName("Test factorial(int); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.factorial(int)"})
  void testFactorial_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Arithmetic.factorial(-1));
  }

  /**
   * Test {@link Arithmetic#factorial(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#factorial(int)}
   */
  @Test
  @DisplayName("Test factorial(int); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.factorial(int)"})
  void testFactorial_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Arithmetic.factorial(1));
  }

  /**
   * Test {@link Arithmetic#factorial(int)}.
   *
   * <ul>
   *   <li>When twenty-one.
   *   <li>Then return {@code 5.109094217170944E19}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#factorial(int)}
   */
  @Test
  @DisplayName("Test factorial(int); when twenty-one; then return '5.109094217170944E19'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.factorial(int)"})
  void testFactorial_whenTwentyOne_thenReturn5109094217170944e19() {
    // Arrange, Act and Assert
    assertEquals(5.109094217170944E19d, Arithmetic.factorial(21));
  }

  /**
   * Test {@link Arithmetic#floor(double)}.
   *
   * <p>Method under test: {@link Arithmetic#floor(double)}
   */
  @Test
  @DisplayName("Test floor(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Arithmetic.floor(double)"})
  void testFloor() {
    // Arrange, Act and Assert
    assertEquals(10L, Arithmetic.floor(10.0d));
  }

  /**
   * Test {@link Arithmetic#log(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code -3.3219280948873626}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#log(double, double)}
   */
  @Test
  @DisplayName("Test log(double, double); when '0.5'; then return '-3.3219280948873626'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.log(double, double)"})
  void testLog_when05_thenReturn33219280948873626() {
    // Arrange, Act and Assert
    assertEquals(-3.3219280948873626d, Arithmetic.log(0.5d, 10.0d));
  }

  /**
   * Test {@link Arithmetic#log(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.00277767492975269}.
   *   <li>Then return {@code -0.39118754894424745}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#log(double, double)}
   */
  @Test
  @DisplayName(
      "Test log(double, double); when '0.00277767492975269'; then return '-0.39118754894424745'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.log(double, double)"})
  void testLog_when000277767492975269_thenReturn039118754894424745() {
    // Arrange, Act and Assert
    assertEquals(-0.39118754894424745d, Arithmetic.log(0.00277767492975269d, 10.0d));
  }

  /**
   * Test {@link Arithmetic#log(double, double)}.
   *
   * <ul>
   *   <li>When {@code -5.952380952380953E-4}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#log(double, double)}
   */
  @Test
  @DisplayName("Test log(double, double); when '-5.952380952380953E-4'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.log(double, double)"})
  void testLog_when5952380952380953e4_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Arithmetic.log(-5.952380952380953E-4d, 10.0d));
  }

  /**
   * Test {@link Arithmetic#log(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#log(double, double)}
   */
  @Test
  @DisplayName("Test log(double, double); when ten; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.log(double, double)"})
  void testLog_whenTen_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Arithmetic.log(10.0d, 10.0d));
  }

  /**
   * Test {@link Arithmetic#log10(double)}.
   *
   * <p>Method under test: {@link Arithmetic#log10(double)}
   */
  @Test
  @DisplayName("Test log10(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.log10(double)"})
  void testLog10() {
    // Arrange, Act and Assert
    assertEquals(0.9999999999999999d, Arithmetic.log10(10.0d));
  }

  /**
   * Test {@link Arithmetic#log2(double)}.
   *
   * <p>Method under test: {@link Arithmetic#log2(double)}
   */
  @Test
  @DisplayName("Test log2(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.log2(double)"})
  void testLog2() {
    // Arrange, Act and Assert
    assertEquals(3.3219280948873626d, Arithmetic.log2(10.0d));
  }

  /**
   * Test {@link Arithmetic#logFactorial(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#logFactorial(int)}
   */
  @Test
  @DisplayName("Test logFactorial(int); when one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.logFactorial(int)"})
  void testLogFactorial_whenOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Arithmetic.logFactorial(1));
  }

  /**
   * Test {@link Arithmetic#logFactorial(int)}.
   *
   * <ul>
   *   <li>When thirty.
   *   <li>Then return {@code 74.65823634883016}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#logFactorial(int)}
   */
  @Test
  @DisplayName("Test logFactorial(int); when thirty; then return '74.65823634883016'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.logFactorial(int)"})
  void testLogFactorial_whenThirty_thenReturn7465823634883016() {
    // Arrange, Act and Assert
    assertEquals(74.65823634883016d, Arithmetic.logFactorial(30));
  }

  /**
   * Test {@link Arithmetic#longFactorial(int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#longFactorial(int)}
   */
  @Test
  @DisplayName("Test longFactorial(int); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Arithmetic.longFactorial(int)"})
  void testLongFactorial_whenMinusOne_thenThrowIllegalArgumentException()
      throws IllegalArgumentException {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Arithmetic.longFactorial(-1));
  }

  /**
   * Test {@link Arithmetic#longFactorial(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#longFactorial(int)}
   */
  @Test
  @DisplayName("Test longFactorial(int); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Arithmetic.longFactorial(int)"})
  void testLongFactorial_whenOne_thenReturnOne() throws IllegalArgumentException {
    // Arrange, Act and Assert
    assertEquals(1L, Arithmetic.longFactorial(1));
  }

  /**
   * Test {@link Arithmetic#longFactorial(int)}.
   *
   * <ul>
   *   <li>When twenty-one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#longFactorial(int)}
   */
  @Test
  @DisplayName("Test longFactorial(int); when twenty-one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Arithmetic.longFactorial(int)"})
  void testLongFactorial_whenTwentyOne_thenThrowIllegalArgumentException()
      throws IllegalArgumentException {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Arithmetic.longFactorial(21));
  }

  /**
   * Test {@link Arithmetic#stirlingCorrection(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.08106146679532726}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#stirlingCorrection(int)}
   */
  @Test
  @DisplayName("Test stirlingCorrection(int); when one; then return '0.08106146679532726'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.stirlingCorrection(int)"})
  void testStirlingCorrection_whenOne_thenReturn008106146679532726() {
    // Arrange, Act and Assert
    assertEquals(0.08106146679532726d, Arithmetic.stirlingCorrection(1));
  }

  /**
   * Test {@link Arithmetic#stirlingCorrection(int)}.
   *
   * <ul>
   *   <li>When thirty-one.
   *   <li>Then return {@code 0.002688078828531111}.
   * </ul>
   *
   * <p>Method under test: {@link Arithmetic#stirlingCorrection(int)}
   */
  @Test
  @DisplayName("Test stirlingCorrection(int); when thirty-one; then return '0.002688078828531111'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Arithmetic.stirlingCorrection(int)"})
  void testStirlingCorrection_whenThirtyOne_thenReturn0002688078828531111() {
    // Arrange, Act and Assert
    assertEquals(0.002688078828531111d, Arithmetic.stirlingCorrection(31));
  }
}
