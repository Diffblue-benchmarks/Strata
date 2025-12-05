package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GammaFunctionsDiffblueTest {
  /**
   * Test {@link GammaFunctions#beta(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-9}.
   *   <li>Then return {@code -8.999999999999998E9}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#beta(double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double); when '1.0E-9'; then return '-8.999999999999998E9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.beta(double, double)"})
  void testBeta_when10e9_thenReturn8999999999999998e9() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-8.999999999999998E9d, GammaFunctions.beta(-1.0E-10d, 1.0E-9d));
  }

  /**
   * Test {@link GammaFunctions#beta(double, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-9}.
   *   <li>Then return {@code -1.0999999999999998E10}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#beta(double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double); when '-1.0E-9'; then return '-1.0999999999999998E10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.beta(double, double)"})
  void testBeta_when10e9_thenReturn10999999999999998e10() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-1.0999999999999998E10d, GammaFunctions.beta(-1.0E-10d, -1.0E-9d));
  }

  /**
   * Test {@link GammaFunctions#beta(double, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code -2.0E10}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#beta(double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double); when '-1.0E-10'; then return '-2.0E10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.beta(double, double)"})
  void testBeta_when10e10_thenReturn20e10() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-2.0E10d, GammaFunctions.beta(-1.0E-10d, -1.0E-10d));
  }

  /**
   * Test {@link GammaFunctions#beta(double, double)}.
   *
   * <ul>
   *   <li>When {@code -853555.6642457654}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#beta(double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double); when '-853555.6642457654'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.beta(double, double)"})
  void testBeta_when8535556642457654_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, GammaFunctions.beta(-853555.6642457654d, 10.0d));
  }

  /**
   * Test {@link GammaFunctions#beta(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.9999999999999998}.
   *   <li>Then return {@code -5.000000000500001E9}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#beta(double, double)}
   */
  @Test
  @DisplayName(
      "Test beta(double, double); when '1.9999999999999998'; then return '-5.000000000500001E9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.beta(double, double)"})
  void testBeta_when19999999999999998_thenReturn5000000000500001e9() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-5.000000000500001E9d, GammaFunctions.beta(-1.0E-10d, 1.9999999999999998d));
  }

  /**
   * Test {@link GammaFunctions#beta(double, double)}.
   *
   * <ul>
   *   <li>When {@code -2018891.4143353277}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#beta(double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double); when '-2018891.4143353277'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.beta(double, double)"})
  void testBeta_when20188914143353277_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, GammaFunctions.beta(-2018891.4143353277d, 10.0d));
  }

  /**
   * Test {@link GammaFunctions#beta(double, double)}.
   *
   * <ul>
   *   <li>When {@code 2.9999999999999996}.
   *   <li>Then return {@code -1.0000000001500002E10}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#beta(double, double)}
   */
  @Test
  @DisplayName(
      "Test beta(double, double); when '2.9999999999999996'; then return '-1.0000000001500002E10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.beta(double, double)"})
  void testBeta_when29999999999999996_thenReturn10000000001500002e10() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-1.0000000001500002E10d, GammaFunctions.beta(-1.0E-10d, 2.9999999999999996d));
  }

  /**
   * Test {@link GammaFunctions#beta(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 1.0825088224469029E-6}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#beta(double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double); when ten; then return '1.0825088224469029E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.beta(double, double)"})
  void testBeta_whenTen_thenReturn10825088224469029e6() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0825088224469029E-6d, GammaFunctions.beta(10.0d, 10.0d));
  }

  /**
   * Test {@link GammaFunctions#beta(double, double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@code -1.0000000001500002E10}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#beta(double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double); when three; then return '-1.0000000001500002E10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.beta(double, double)"})
  void testBeta_whenThree_thenReturn10000000001500002e10() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-1.0000000001500002E10d, GammaFunctions.beta(-1.0E-10d, 3.0d));
  }

  /**
   * Test {@link GammaFunctions#gamma(double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-9}.
   *   <li>Then return {@code -1.0000000005772154E9}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when '-1.0E-9'; then return '-1.0000000005772154E9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.gamma(double)"})
  void testGamma_when10e9_thenReturn10000000005772154e9() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-1.0000000005772154E9d, GammaFunctions.gamma(-1.0E-9d));
  }

  /**
   * Test {@link GammaFunctions#gamma(double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code -1.0000000000577215E10}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when '-1.0E-10'; then return '-1.0000000000577215E10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.gamma(double)"})
  void testGamma_when10e10_thenReturn10000000000577215e10() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-1.0000000000577215E10d, GammaFunctions.gamma(-1.0E-10d));
  }

  /**
   * Test {@link GammaFunctions#gamma(double)}.
   *
   * <ul>
   *   <li>When {@code 143.01608}.
   *   <li>Then return {@code 2.919114949633028E245}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when '143.01608'; then return '2.919114949633028E245'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.gamma(double)"})
  void testGamma_when14301608_thenReturn2919114949633028e245() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2.919114949633028E245d, GammaFunctions.gamma(143.01608d));
  }

  /**
   * Test {@link GammaFunctions#gamma(double)}.
   *
   * <ul>
   *   <li>When {@code -853555.6642457654}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when '-853555.6642457654'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.gamma(double)"})
  void testGamma_when8535556642457654_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, GammaFunctions.gamma(-853555.6642457654d));
  }

  /**
   * Test {@link GammaFunctions#gamma(double)}.
   *
   * <ul>
   *   <li>When {@code 9.999999999999999E-10}.
   *   <li>Then return {@code 9.999999994227846E8}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#gamma(double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double); when '9.999999999999999E-10'; then return '9.999999994227846E8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.gamma(double)"})
  void testGamma_when9999999999999999e10_thenReturn9999999994227846e8() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(9.999999994227846E8d, GammaFunctions.gamma(9.999999999999999E-10d));
  }

  /**
   * Test {@link GammaFunctions#gamma(double)}.
   *
   * <ul>
   *   <li>When {@code 143.01608000000002}.
   *   <li>Then return {@code 2.919114949633439E245}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when '143.01608000000002'; then return '2.919114949633439E245'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.gamma(double)"})
  void testGamma_when14301608000000002_thenReturn2919114949633439e245() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2.919114949633439E245d, GammaFunctions.gamma(143.01608000000002d));
  }

  /**
   * Test {@link GammaFunctions#gamma(double)}.
   *
   * <ul>
   *   <li>When {@code 1.9999999999999998}.
   *   <li>Then return {@code 0.5000000000000001}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when '1.9999999999999998'; then return '0.5000000000000001'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.gamma(double)"})
  void testGamma_when19999999999999998_thenReturn05000000000000001() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5000000000000001d, GammaFunctions.gamma(1.9999999999999998d));
  }

  /**
   * Test {@link GammaFunctions#gamma(double)}.
   *
   * <ul>
   *   <li>When {@code -2018891.4143353277}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when '-2018891.4143353277'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.gamma(double)"})
  void testGamma_when20188914143353277_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, GammaFunctions.gamma(-2018891.4143353277d));
  }

  /**
   * Test {@link GammaFunctions#gamma(double)}.
   *
   * <ul>
   *   <li>When {@code 2.9999999999999996}.
   *   <li>Then return {@code 1.9999999999999993}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when '2.9999999999999996'; then return '1.9999999999999993'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.gamma(double)"})
  void testGamma_when29999999999999996_thenReturn19999999999999993() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.9999999999999993d, GammaFunctions.gamma(2.9999999999999996d));
  }

  /**
   * Test {@link GammaFunctions#gamma(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 362880.0}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#gamma(double)}
   */
  @Test
  @DisplayName("Test gamma(double); when ten; then return '362880.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.gamma(double)"})
  void testGamma_whenTen_thenReturn3628800() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(362880.0d, GammaFunctions.gamma(10.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.5000000000000002}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBeta(double, double, double); when '0.5'; then return '0.5000000000000002'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_when05_thenReturn05000000000000002() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5000000000000002d, GammaFunctions.incompleteBeta(10.0d, 10.0d, 0.5d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.9997665525652514}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBeta(double, double, double); when '0.5'; then return '0.9997665525652514'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_when05_thenReturn09997665525652514() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9997665525652514d, GammaFunctions.incompleteBeta(0.5d, 10.0d, 0.5d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 2.3344743474862243E-4}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBeta(double, double, double); when '0.5'; then return '2.3344743474862243E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_when05_thenReturn23344743474862243e4() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2.3344743474862243E-4d, GammaFunctions.incompleteBeta(10.0d, 0.5d, 0.5d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.95}.
   *   <li>Then return {@code 0.583216995936136}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBeta(double, double, double); when '0.95'; then return '0.583216995936136'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_when095_thenReturn0583216995936136() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        0.583216995936136d, GammaFunctions.incompleteBeta(171.6243769563027d, 10.0d, 0.95d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.95}.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBeta(double, double, double); when '0.95'; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_when095_thenReturn09999999999999999() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999999d,
        GammaFunctions.incompleteBeta(171.6243769563027d, 171.6243769563027d, 0.95d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 8.581218847815142}.
   *   <li>Then return {@code 0.40013941511185175}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBeta(double, double, double); when '8.581218847815142'; then return '0.40013941511185175'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_when8581218847815142_thenReturn040013941511185175()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        0.40013941511185175d,
        GammaFunctions.incompleteBeta(171.6243769563027d, 8.581218847815142d, 0.95d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBeta(double, double, double); when '3.3306690738754696E-16'; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_when33306690738754696e16_thenReturn09999999999999999()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999999d, GammaFunctions.incompleteBeta(3.3306690738754696E-16d, 10.0d, 0.5d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBeta(double, double, double); when '3.3306690738754696E-16'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_when33306690738754696e16_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN, GammaFunctions.incompleteBeta(Double.NaN, 10.0d, 3.3306690738754696E-16d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBeta(double, double, double); when '3.3306690738754696E-16'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_when33306690738754696e16_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, GammaFunctions.incompleteBeta(171.6243769563027d, 10.0d, 3.3306690738754696E-16d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return {@code 0.91021728515625}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBeta(double, double, double); when five; then return '0.91021728515625'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_whenFive_thenReturn091021728515625() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.91021728515625d, GammaFunctions.incompleteBeta(5.0d, 10.0d, 0.5d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName("Test incompleteBeta(double, double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_whenNaN_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, GammaFunctions.incompleteBeta(10.0d, 10.0d, Double.NaN));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName("Test incompleteBeta(double, double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_whenNaN_thenReturnNaN2() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, GammaFunctions.incompleteBeta(Double.NaN, 10.0d, Double.NaN));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName("Test incompleteBeta(double, double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_whenNaN_thenReturnNaN3() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, GammaFunctions.incompleteBeta(0.5d, 10.0d, Double.NaN));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.9990234375}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName("Test incompleteBeta(double, double, double); when one; then return '0.9990234375'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_whenOne_thenReturn09990234375() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9990234375d, GammaFunctions.incompleteBeta(1.0d, 10.0d, 0.5d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName("Test incompleteBeta(double, double, double); when one; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_whenOne_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, GammaFunctions.incompleteBeta(1.0d, 10.0d, Double.NaN));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName("Test incompleteBeta(double, double, double); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_whenOne_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, GammaFunctions.incompleteBeta(10.0d, 10.0d, 1.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName("Test incompleteBeta(double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_whenZero_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, GammaFunctions.incompleteBeta(10.0d, 10.0d, 0.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBeta(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBeta(double, double, double)}
   */
  @Test
  @DisplayName("Test incompleteBeta(double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBeta(double, double, double)"})
  void testIncompleteBeta_whenZero_thenReturnZero2() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, GammaFunctions.incompleteBeta(1.0d, 10.0d, 0.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}
   */
  @Test
  @DisplayName("Test incompleteBetaFraction1(double, double, double); when '-0.5'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBetaFraction1(double, double, double)"})
  void testIncompleteBetaFraction1_when05_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, GammaFunctions.incompleteBetaFraction1(1.0d, -0.5d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -2.5}.
   *   <li>Then return {@code 2592.6503496505}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBetaFraction1(double, double, double); when '-2.5'; then return '2592.6503496505'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBetaFraction1(double, double, double)"})
  void testIncompleteBetaFraction1_when25_thenReturn25926503496505() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2592.6503496505d, GammaFunctions.incompleteBetaFraction1(-2.5d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return {@code -0.9434250337228087}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBetaFraction1(double, double, double); when '3.3306690738754696E-16'; then return '-0.9434250337228087'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBetaFraction1(double, double, double)"})
  void testIncompleteBetaFraction1_when33306690738754696e16_thenReturn09434250337228087()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        -0.9434250337228087d,
        GammaFunctions.incompleteBetaFraction1(10.0d, 3.3306690738754696E-16d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBetaFraction1(double, double, double); when '3.3306690738754696E-16'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBetaFraction1(double, double, double)"})
  void testIncompleteBetaFraction1_when33306690738754696e16_thenReturnOne()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        1.0d, GammaFunctions.incompleteBetaFraction1(3.3306690738754696E-16d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code -0.12138825218216759}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBetaFraction1(double, double, double); when one; then return '-0.12138825218216759'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBetaFraction1(double, double, double)"})
  void testIncompleteBetaFraction1_whenOne_thenReturn012138825218216759()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-0.12138825218216759d, GammaFunctions.incompleteBetaFraction1(1.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code -0.34863279135724945}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBetaFraction1(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBetaFraction1(double, double, double); when ten; then return '-0.34863279135724945'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBetaFraction1(double, double, double)"})
  void testIncompleteBetaFraction1_whenTen_thenReturn034863279135724945()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-0.34863279135724945d, GammaFunctions.incompleteBetaFraction1(10.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBetaFraction2(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code -7.65191279308924}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBetaFraction2(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBetaFraction2(double, double, double); when '-0.5'; then return '-7.65191279308924'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBetaFraction2(double, double, double)"})
  void testIncompleteBetaFraction2_when05_thenReturn765191279308924() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-7.65191279308924d, GammaFunctions.incompleteBetaFraction2(-0.5d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBetaFraction2(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 2.3333333333333335}.
   *   <li>Then return {@code 0.10748745511953339}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBetaFraction2(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBetaFraction2(double, double, double); when '2.3333333333333335'; then return '0.10748745511953339'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBetaFraction2(double, double, double)"})
  void testIncompleteBetaFraction2_when23333333333333335_thenReturn010748745511953339()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        0.10748745511953339d,
        GammaFunctions.incompleteBetaFraction2(2.3333333333333335d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBetaFraction2(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBetaFraction2(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBetaFraction2(double, double, double); when '3.3306690738754696E-16'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBetaFraction2(double, double, double)"})
  void testIncompleteBetaFraction2_when33306690738754696e16_thenReturnMinusOne()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        -1.0d, GammaFunctions.incompleteBetaFraction2(3.3306690738754696E-16d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBetaFraction2(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.1227702740675521}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBetaFraction2(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBetaFraction2(double, double, double); when one; then return '0.1227702740675521'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBetaFraction2(double, double, double)"})
  void testIncompleteBetaFraction2_whenOne_thenReturn01227702740675521()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.1227702740675521d, GammaFunctions.incompleteBetaFraction2(1.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteBetaFraction2(double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.3486327913572494}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteBetaFraction2(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteBetaFraction2(double, double, double); when ten; then return '0.3486327913572494'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteBetaFraction2(double, double, double)"})
  void testIncompleteBetaFraction2_whenTen_thenReturn03486327913572494()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.3486327913572494d, GammaFunctions.incompleteBetaFraction2(10.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGamma(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code 0.9999999977551376}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGamma(double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteGamma(double, double); when '1.0E-10'; then return '0.9999999977551376'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGamma(double, double)"})
  void testIncompleteGamma_when10e10_thenReturn09999999977551376() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9999999977551376d, GammaFunctions.incompleteGamma(1.0E-10d, 1.0E-10d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGamma(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002}.
   *   <li>Then return {@code 0.9999999999780617}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGamma(double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteGamma(double, double); when '1.0000000000000002'; then return '0.9999999999780617'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGamma(double, double)"})
  void testIncompleteGamma_when10000000000000002_thenReturn09999999999780617()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999780617d, GammaFunctions.incompleteGamma(1.0E-10d, 1.0000000000000002d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGamma(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGamma(double, double)}
   */
  @Test
  @DisplayName("Test incompleteGamma(double, double); when one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGamma(double, double)"})
  void testIncompleteGamma_whenOne_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, GammaFunctions.incompleteGamma(0.0d, 1.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGamma(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 4.649807501726386E-5}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGamma(double, double)}
   */
  @Test
  @DisplayName("Test incompleteGamma(double, double); when ten; then return '4.649807501726386E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGamma(double, double)"})
  void testIncompleteGamma_whenTen_thenReturn4649807501726386e5() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(4.649807501726386E-5d, GammaFunctions.incompleteGamma(10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGamma(double, double)}.
   *
   * <ul>
   *   <li>When thirteen.
   *   <li>Then return {@code 1.6059043835330673E-140}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGamma(double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteGamma(double, double); when thirteen; then return '1.6059043835330673E-140'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGamma(double, double)"})
  void testIncompleteGamma_whenThirteen_thenReturn16059043835330673e140()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.6059043835330673E-140d, GammaFunctions.incompleteGamma(13.0d, 1.0E-10d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGamma(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGamma(double, double)}
   */
  @Test
  @DisplayName("Test incompleteGamma(double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGamma(double, double)"})
  void testIncompleteGamma_whenZero_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, GammaFunctions.incompleteGamma(0.0d, 0.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGamma(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGamma(double, double)}
   */
  @Test
  @DisplayName("Test incompleteGamma(double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGamma(double, double)"})
  void testIncompleteGamma_whenZero_thenReturnZero2() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, GammaFunctions.incompleteGamma(0.0d, 1.0E-10d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGammaComplement(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code 2.244862407074777E-9}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGammaComplement(double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteGammaComplement(double, double); when '1.0E-10'; then return '2.244862407074777E-9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGammaComplement(double, double)"})
  void testIncompleteGammaComplement_when10e10_thenReturn2244862407074777e9()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        2.244862407074777E-9d, GammaFunctions.incompleteGammaComplement(1.0E-10d, 1.0E-10d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGammaComplement(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 2.1938393441796804E-11}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGammaComplement(double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteGammaComplement(double, double); when one; then return '2.1938393441796804E-11'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGammaComplement(double, double)"})
  void testIncompleteGammaComplement_whenOne_thenReturn21938393441796804e11()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2.1938393441796804E-11d, GammaFunctions.incompleteGammaComplement(1.0E-10d, 1.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGammaComplement(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGammaComplement(double, double)}
   */
  @Test
  @DisplayName("Test incompleteGammaComplement(double, double); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGammaComplement(double, double)"})
  void testIncompleteGammaComplement_whenOne_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, GammaFunctions.incompleteGammaComplement(0.0d, 1.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGammaComplement(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.9999535019249828}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGammaComplement(double, double)}
   */
  @Test
  @DisplayName(
      "Test incompleteGammaComplement(double, double); when ten; then return '0.9999535019249828'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGammaComplement(double, double)"})
  void testIncompleteGammaComplement_whenTen_thenReturn09999535019249828()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9999535019249828d, GammaFunctions.incompleteGammaComplement(10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGammaComplement(double, double)}.
   *
   * <ul>
   *   <li>When thirteen.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGammaComplement(double, double)}
   */
  @Test
  @DisplayName("Test incompleteGammaComplement(double, double); when thirteen; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGammaComplement(double, double)"})
  void testIncompleteGammaComplement_whenThirteen_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, GammaFunctions.incompleteGammaComplement(13.0d, 1.0E-10d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGammaComplement(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGammaComplement(double, double)}
   */
  @Test
  @DisplayName("Test incompleteGammaComplement(double, double); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGammaComplement(double, double)"})
  void testIncompleteGammaComplement_whenZero_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, GammaFunctions.incompleteGammaComplement(0.0d, 0.0d));
  }

  /**
   * Test {@link GammaFunctions#incompleteGammaComplement(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#incompleteGammaComplement(double, double)}
   */
  @Test
  @DisplayName("Test incompleteGammaComplement(double, double); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.incompleteGammaComplement(double, double)"})
  void testIncompleteGammaComplement_whenZero_thenReturnOne2() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, GammaFunctions.incompleteGammaComplement(0.0d, 1.0E-10d));
  }

  /**
   * Test {@link GammaFunctions#logGamma(double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E8}.
   *   <li>Then return {@code 1.7420680661038349E9}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#logGamma(double)}
   */
  @Test
  @DisplayName("Test logGamma(double); when '1.0E8'; then return '1.7420680661038349E9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.logGamma(double)"})
  void testLogGamma_when10e8_thenReturn17420680661038349e9() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.7420680661038349E9d, GammaFunctions.logGamma(1.0E8d));
  }

  /**
   * Test {@link GammaFunctions#logGamma(double)}.
   *
   * <ul>
   *   <li>When {@code 2.556348E305}.
   *   <li>Then return {@code 1.7951366714594412E308}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#logGamma(double)}
   */
  @Test
  @DisplayName("Test logGamma(double); when '2.556348E305'; then return '1.7951366714594412E308'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.logGamma(double)"})
  void testLogGamma_when2556348e305_thenReturn17951366714594412e308() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.7951366714594412E308d, GammaFunctions.logGamma(2.556348E305d));
  }

  /**
   * Test {@link GammaFunctions#logGamma(double)}.
   *
   * <ul>
   *   <li>When {@code -34.00000000000001}.
   *   <li>Then return {@code -56.002910055880264}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#logGamma(double)}
   */
  @Test
  @DisplayName(
      "Test logGamma(double); when '-34.00000000000001'; then return '-56.002910055880264'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.logGamma(double)"})
  void testLogGamma_when3400000000000001_thenReturn56002910055880264() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-56.002910055880264d, GammaFunctions.logGamma(-34.00000000000001d));
  }

  /**
   * Test {@link GammaFunctions#logGamma(double)}.
   *
   * <ul>
   *   <li>When {@code -5.950619042843014E-4}.
   *   <li>Then return {@code 7.427188887388247}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#logGamma(double)}
   */
  @Test
  @DisplayName(
      "Test logGamma(double); when '-5.950619042843014E-4'; then return '7.427188887388247'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.logGamma(double)"})
  void testLogGamma_when5950619042843014e4_thenReturn7427188887388247() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(7.427188887388247d, GammaFunctions.logGamma(-5.950619042843014E-4d));
  }

  /**
   * Test {@link GammaFunctions#logGamma(double)}.
   *
   * <ul>
   *   <li>When {@code 12.999999999999998}.
   *   <li>Then return {@code 19.98721449566188}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#logGamma(double)}
   */
  @Test
  @DisplayName("Test logGamma(double); when '12.999999999999998'; then return '19.98721449566188'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.logGamma(double)"})
  void testLogGamma_when12999999999999998_thenReturn1998721449566188() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(19.98721449566188d, GammaFunctions.logGamma(12.999999999999998d));
  }

  /**
   * Test {@link GammaFunctions#logGamma(double)}.
   *
   * <ul>
   *   <li>When {@code 1.9999999999999998}.
   *   <li>Then return {@code 2.220446049250313E-16}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#logGamma(double)}
   */
  @Test
  @DisplayName(
      "Test logGamma(double); when '1.9999999999999998'; then return '2.220446049250313E-16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.logGamma(double)"})
  void testLogGamma_when19999999999999998_thenReturn2220446049250313e16()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2.220446049250313E-16d, GammaFunctions.logGamma(1.9999999999999998d));
  }

  /**
   * Test {@link GammaFunctions#logGamma(double)}.
   *
   * <ul>
   *   <li>When {@code -38801.631513463784}.
   *   <li>Then return {@code -371189.8187090435}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#logGamma(double)}
   */
  @Test
  @DisplayName(
      "Test logGamma(double); when '-38801.631513463784'; then return '-371189.8187090435'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.logGamma(double)"})
  void testLogGamma_when38801631513463784_thenReturn3711898187090435() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-371189.8187090435d, GammaFunctions.logGamma(-38801.631513463784d));
  }

  /**
   * Test {@link GammaFunctions#logGamma(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 12.801827480081469}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#logGamma(double)}
   */
  @Test
  @DisplayName("Test logGamma(double); when ten; then return '12.801827480081469'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.logGamma(double)"})
  void testLogGamma_whenTen_thenReturn12801827480081469() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(12.801827480081469d, GammaFunctions.logGamma(10.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName("Test powerSeries(double, double, double); when '-0.5'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when05_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, GammaFunctions.powerSeries(1.1102230246251566E-17d, -0.5d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName("Test powerSeries(double, double, double); when '-0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when05_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, GammaFunctions.powerSeries(10.0d, -0.5d, 0.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1651820.248092541}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '1651820.248092541'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when1651820248092541_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN, GammaFunctions.powerSeries(1651820.248092541d, 10.0d, -2018891.4143353277d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 51.69230769230769}.
   *   <li>Then return {@code -4.440204429850377E25}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '51.69230769230769'; then return '-4.440204429850377E25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when5169230769230769_thenReturn4440204429850377e25()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        -4.440204429850377E25d, GammaFunctions.powerSeries(51.69230769230769d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -853555.6642457654}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '-853555.6642457654'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when8535556642457654_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN,
        GammaFunctions.powerSeries(10.0d, -853555.6642457654d, 1.1102230246251565E-16d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -853555.6642457654}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '-853555.6642457654'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when8535556642457654_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, GammaFunctions.powerSeries(10.0d, -853555.6642457654d, 0.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.1102230246251565E-16}.
   *   <li>Then return {@code 0.9999999999999996}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '1.1102230246251565E-16'; then return '0.9999999999999996'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when11102230246251565e16_thenReturn09999999999999996()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999996d, GammaFunctions.powerSeries(1.1102230246251565E-16d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.1102230246251565E-16}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '1.1102230246251565E-16'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when11102230246251565e16_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN,
        GammaFunctions.powerSeries(10.0d, -2018891.4143353277d, 1.1102230246251565E-16d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.1102230246251566E-17}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '1.1102230246251566E-17'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when11102230246251566e17_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, GammaFunctions.powerSeries(1.1102230246251566E-17d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.2227767628630701E13}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '1.2227767628630701E13'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when12227767628630701e13_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN,
        GammaFunctions.powerSeries(1.2227767628630701E13d, 10.0d, -2018891.4143353277d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.6363636363636365}.
   *   <li>Then return {@code -6.645918702526722}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '1.6363636363636365'; then return '-6.645918702526722'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when16363636363636365_thenReturn6645918702526722()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-6.645918702526722d, GammaFunctions.powerSeries(1.6363636363636365d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.6363636363636365}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '1.6363636363636365'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when16363636363636365_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN, GammaFunctions.powerSeries(1.6363636363636365d, 10.0d, -2018891.4143353277d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -2018891.4143353277}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '-2018891.4143353277'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when20188914143353277_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, GammaFunctions.powerSeries(10.0d, 10.0d, -2018891.4143353277d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -2018891.4143353277}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when '-2018891.4143353277'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_when20188914143353277_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, GammaFunctions.powerSeries(10.0d, -2018891.4143353277d, 0.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName("Test powerSeries(double, double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_whenNaN_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, GammaFunctions.powerSeries(Double.NaN, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When one hundred forty-four.
   *   <li>Then return {@code -1.973286877649095E57}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when one hundred forty-four; then return '-1.973286877649095E57'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_whenOneHundredFortyFour_thenReturn1973286877649095e57()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-1.973286877649095E57d, GammaFunctions.powerSeries(144.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code -2.8421709430404007E-13}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when one; then return '-2.8421709430404007E-13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_whenOne_thenReturn28421709430404007e13() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-2.8421709430404007E-13d, GammaFunctions.powerSeries(1.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName("Test powerSeries(double, double, double); when one; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_whenOne_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, GammaFunctions.powerSeries(1.0d, 10.0d, -2018891.4143353277d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code -3.2978944000000183E7}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test powerSeries(double, double, double); when two; then return '-3.2978944000000183E7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_whenTwo_thenReturn32978944000000183e7() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-3.2978944000000183E7d, GammaFunctions.powerSeries(10.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link GammaFunctions#powerSeries(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#powerSeries(double, double, double)}
   */
  @Test
  @DisplayName("Test powerSeries(double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.powerSeries(double, double, double)"})
  void testPowerSeries_whenZero_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, GammaFunctions.powerSeries(10.0d, 10.0d, 0.0d));
  }

  /**
   * Test {@link GammaFunctions#stirlingFormula(double)}.
   *
   * <ul>
   *   <li>When {@code 143.01608000000002}.
   *   <li>Then return {@code 2.919114949633439E245}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#stirlingFormula(double)}
   */
  @Test
  @DisplayName(
      "Test stirlingFormula(double); when '143.01608000000002'; then return '2.919114949633439E245'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.stirlingFormula(double)"})
  void testStirlingFormula_when14301608000000002_thenReturn2919114949633439e245()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2.919114949633439E245d, GammaFunctions.stirlingFormula(143.01608000000002d));
  }

  /**
   * Test {@link GammaFunctions#stirlingFormula(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 1.0000025832104018}.
   * </ul>
   *
   * <p>Method under test: {@link GammaFunctions#stirlingFormula(double)}
   */
  @Test
  @DisplayName("Test stirlingFormula(double); when two; then return '1.0000025832104018'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GammaFunctions.stirlingFormula(double)"})
  void testStirlingFormula_whenTwo_thenReturn10000025832104018() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0000025832104018d, GammaFunctions.stirlingFormula(2.0d));
  }
}
