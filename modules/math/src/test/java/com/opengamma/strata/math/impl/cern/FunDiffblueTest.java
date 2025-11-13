package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FunDiffblueTest {
  /**
   * Test {@link Fun#Fun()}.
   *
   * <p>Method under test: default or parameterless constructor of {@link Fun}
   */
  @Test
  @DisplayName("Test new Fun()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Fun.<init>()"})
  void testNewFun() {
    // Arrange, Act and Assert
    assertThrows(RuntimeException.class, () -> new Fun());
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.1}.
   *   <li>Then return {@code -1.5787132}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when '0.1'; then return '-1.5787132'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_when01_thenReturn15787132() {
    // Arrange, Act and Assert
    assertEquals(-1.5787132d, Fun.bessel2_fkt(0.0d, 0.1d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.1}.
   *   <li>Then return {@code -1.9694802}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when '0.1'; then return '-1.9694802'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_when01_thenReturn19694802() {
    // Arrange, Act and Assert
    assertEquals(-1.9694802d, Fun.bessel2_fkt(0.5d, 0.1d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.1}.
   *   <li>Then return {@code -2.9807345}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when '0.1'; then return '-2.9807345'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_when01_thenReturn29807345() {
    // Arrange, Act and Assert
    assertEquals(-2.9807345d, Fun.bessel2_fkt(1.0d, 0.1d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.01}.
   *   <li>Then return {@code -65.78500114556454}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when '0.01'; then return '-65.78500114556454'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_when001_thenReturn6578500114556454() {
    // Arrange, Act and Assert
    assertEquals(-65.78500114556454d, Fun.bessel2_fkt(10.0d, 0.01d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.01}.
   *   <li>Then return {@code 10.244243439456055}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when '0.01'; then return '10.244243439456055'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_when001_thenReturn10244243439456055() {
    // Arrange, Act and Assert
    assertEquals(10.244243439456055d, Fun.bessel2_fkt(0.01d, 10.0d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code -0.7642538}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when '0.5'; then return '-0.7642538'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_when05_thenReturn07642538() {
    // Arrange, Act and Assert
    assertEquals(-0.7642538d, Fun.bessel2_fkt(0.5d, 0.5d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.4793411}.
   *   <li>Then return {@code -15.756769485937655}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName(
      "Test bessel2_fkt(double, double); when '1.4793411'; then return '-15.756769485937655'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_when14793411_thenReturn15756769485937655() {
    // Arrange, Act and Assert
    assertEquals(-15.756769485937655d, Fun.bessel2_fkt(10.0d, 1.4793411d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@code -1.5787132}.
   *   <li>Then return {@code 10.125498775182654}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName(
      "Test bessel2_fkt(double, double); when '-1.5787132'; then return '10.125498775182654'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_when15787132_thenReturn10125498775182654() {
    // Arrange, Act and Assert
    assertEquals(10.125498775182654d, Fun.bessel2_fkt(-1.5787132d, 10.0d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Fun.bessel2_fkt(Double.NaN, 10.0d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenNaN_thenReturnNaN2() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Fun.bessel2_fkt(-1.5787132d, Double.NaN));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.0826017}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when one; then return '0.0826017'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenOne_thenReturn00826017() {
    // Arrange, Act and Assert
    assertEquals(0.0826017d, Fun.bessel2_fkt(0.5d, 1.0d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code -0.1843161}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when one; then return '-0.1843161'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenOne_thenReturn01843161() {
    // Arrange, Act and Assert
    assertEquals(-0.1843161d, Fun.bessel2_fkt(1.0d, 1.0d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code -1.1969943}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when one; then return '-1.1969943'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenOne_thenReturn11969943() {
    // Arrange, Act and Assert
    assertEquals(-1.1969943d, Fun.bessel2_fkt(1.0d, 0.5d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 10.196562852370656}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when one; then return '10.196562852370656'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenOne_thenReturn10196562852370656() {
    // Arrange, Act and Assert
    assertEquals(10.196562852370656d, Fun.bessel2_fkt(1.0d, 10.0d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@link Math#PI}.
   *   <li>Then return {@code 2.79501966239196}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when PI; then return '2.79501966239196'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenPi_thenReturn279501966239196() {
    // Arrange, Act and Assert
    assertEquals(2.79501966239196d, Fun.bessel2_fkt(0.5d, 3.141592653589793d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When {@link Math#PI}.
   *   <li>Then return {@code 9.776208630560616}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when PI; then return '9.776208630560616'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenPi_thenReturn9776208630560616() {
    // Arrange, Act and Assert
    assertEquals(9.776208630560616d, Fun.bessel2_fkt(3.141592653589793d, 10.0d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 5.735734362401038}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when ten; then return '5.735734362401038'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenTen_thenReturn5735734362401038() {
    // Arrange, Act and Assert
    assertEquals(5.735734362401038d, Fun.bessel2_fkt(10.0d, 10.0d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 0.1735823}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when zero; then return '0.1735823'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenZero_thenReturn01735823() {
    // Arrange, Act and Assert
    assertEquals(0.1735823d, Fun.bessel2_fkt(0.0d, 1.0d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code -0.6130827}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when zero; then return '-0.6130827'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenZero_thenReturn06130827() {
    // Arrange, Act and Assert
    assertEquals(-0.6130827d, Fun.bessel2_fkt(0.0d, 0.5d));
  }

  /**
   * Test {@link Fun#bessel2_fkt(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 10.244248194983442}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessel2_fkt(double, double)}
   */
  @Test
  @DisplayName("Test bessel2_fkt(double, double); when zero; then return '10.244248194983442'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessel2_fkt(double, double)"})
  void testBessel2_fkt_whenZero_thenReturn10244248194983442() {
    // Arrange, Act and Assert
    assertEquals(10.244248194983442d, Fun.bessel2_fkt(0.0d, 10.0d));
  }

  /**
   * Test {@link Fun#bessi0(double)}.
   *
   * <ul>
   *   <li>When {@code 3.75}.
   *   <li>Then return {@code 9.118945993790991}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessi0(double)}
   */
  @Test
  @DisplayName("Test bessi0(double); when '3.75'; then return '9.118945993790991'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessi0(double)"})
  void testBessi0_when375_thenReturn9118945993790991() {
    // Arrange, Act and Assert
    assertEquals(9.118945993790991d, Fun.bessi0(3.75d));
  }

  /**
   * Test {@link Fun#bessi0(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 2.279585307296026}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessi0(double)}
   */
  @Test
  @DisplayName("Test bessi0(double); when two; then return '2.279585307296026'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessi0(double)"})
  void testBessi0_whenTwo_thenReturn2279585307296026() {
    // Arrange, Act and Assert
    assertEquals(2.279585307296026d, Fun.bessi0(2.0d));
  }

  /**
   * Test {@link Fun#bessi1(double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code -5.0E-11}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessi1(double)}
   */
  @Test
  @DisplayName("Test bessi1(double); when '-1.0E-10'; then return '-5.0E-11'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessi1(double)"})
  void testBessi1_when10e10_thenReturn50e11() {
    // Arrange, Act and Assert
    assertEquals(-5.0E-11d, Fun.bessi1(-1.0E-10d));
  }

  /**
   * Test {@link Fun#bessi1(double)}.
   *
   * <ul>
   *   <li>When {@code 3.75}.
   *   <li>Then return {@code 7.78001515135595}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessi1(double)}
   */
  @Test
  @DisplayName("Test bessi1(double); when '3.75'; then return '7.78001515135595'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessi1(double)"})
  void testBessi1_when375_thenReturn778001515135595() {
    // Arrange, Act and Assert
    assertEquals(7.78001515135595d, Fun.bessi1(3.75d));
  }

  /**
   * Test {@link Fun#bessi1(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 1.5906368572633083}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#bessi1(double)}
   */
  @Test
  @DisplayName("Test bessi1(double); when two; then return '1.5906368572633083'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.bessi1(double)"})
  void testBessi1_whenTwo_thenReturn15906368572633083() {
    // Arrange, Act and Assert
    assertEquals(1.5906368572633083d, Fun.bessi1(2.0d));
  }

  /**
   * Test {@link Fun#factorial(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Fun#factorial(int)}
   */
  @Test
  @DisplayName("Test factorial(int); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Fun.factorial(int)"})
  void testFactorial_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1L, Fun.factorial(1));
  }

  /**
   * Test {@link Fun#gamma(double)}.
   *
   * <ul>
   *   <li>When eleven.
   *   <li>Then return {@code 3628800.0000098003}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when eleven; then return '3628800.0000098003'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.gamma(double)"})
  void testGamma_whenEleven_thenReturn36288000000098003() {
    // Arrange, Act and Assert
    assertEquals(3628800.0000098003d, Fun.gamma(11.0d));
  }

  /**
   * Test {@link Fun#gamma(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 362880.0000009802}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when ten; then return '362880.0000009802'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.gamma(double)"})
  void testGamma_whenTen_thenReturn3628800000009802() {
    // Arrange, Act and Assert
    assertEquals(362880.0000009802d, Fun.gamma(10.0d));
  }

  /**
   * Test {@link Fun#gamma(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Fun#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.gamma(double)"})
  void testGamma_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Fun.gamma(0.0d));
  }

  /**
   * Test {@link Fun#logGamma(double)}.
   *
   * <ul>
   *   <li>When eleven.
   *   <li>Then return {@code 15.104412573078216}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#logGamma(double)}
   */
  @Test
  @DisplayName("Test logGamma(double); when eleven; then return '15.104412573078216'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.logGamma(double)"})
  void testLogGamma_whenEleven_thenReturn15104412573078216() {
    // Arrange, Act and Assert
    assertEquals(15.104412573078216d, Fun.logGamma(11.0d));
  }

  /**
   * Test {@link Fun#logGamma(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 12.801827480084171}.
   * </ul>
   *
   * <p>Method under test: {@link Fun#logGamma(double)}
   */
  @Test
  @DisplayName("Test logGamma(double); when ten; then return '12.801827480084171'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.logGamma(double)"})
  void testLogGamma_whenTen_thenReturn12801827480084171() {
    // Arrange, Act and Assert
    assertEquals(12.801827480084171d, Fun.logGamma(10.0d));
  }

  /**
   * Test {@link Fun#logGamma(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return minus nine hundred ninety-nine.
   * </ul>
   *
   * <p>Method under test: {@link Fun#logGamma(double)}
   */
  @Test
  @DisplayName("Test logGamma(double); when zero; then return minus nine hundred ninety-nine")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Fun.logGamma(double)"})
  void testLogGamma_whenZero_thenReturnMinusNineHundredNinetyNine() {
    // Arrange, Act and Assert
    assertEquals(-999.0d, Fun.logGamma(0.0d));
  }
}
