package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ProbabilityDiffblueTest {
  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.5000000000000002}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when '0.5'; then return '0.5000000000000002'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_when05_thenReturn05000000000000002() {
    // Arrange, Act and Assert
    assertEquals(0.5000000000000002d, Probability.beta(10.0d, 10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.9997665525652514}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when '0.5'; then return '0.9997665525652514'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_when05_thenReturn09997665525652514() {
    // Arrange, Act and Assert
    assertEquals(0.9997665525652514d, Probability.beta(0.5d, 10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 2.3344743474862243E-4}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when '0.5'; then return '2.3344743474862243E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_when05_thenReturn23344743474862243e4() {
    // Arrange, Act and Assert
    assertEquals(2.3344743474862243E-4d, Probability.beta(10.0d, 0.5d, 0.5d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.95}.
   *   <li>Then return {@code 0.583216995936136}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when '0.95'; then return '0.583216995936136'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_when095_thenReturn0583216995936136() {
    // Arrange, Act and Assert
    assertEquals(0.583216995936136d, Probability.beta(171.6243769563027d, 10.0d, 0.95d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.95}.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when '0.95'; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_when095_thenReturn09999999999999999() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999999d, Probability.beta(171.6243769563027d, 171.6243769563027d, 0.95d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 8.581218847815142}.
   *   <li>Then return {@code 0.40013941511185175}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test beta(double, double, double); when '8.581218847815142'; then return '0.40013941511185175'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_when8581218847815142_thenReturn040013941511185175() {
    // Arrange, Act and Assert
    assertEquals(
        0.40013941511185175d, Probability.beta(171.6243769563027d, 8.581218847815142d, 0.95d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test beta(double, double, double); when '3.3306690738754696E-16'; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_when33306690738754696e16_thenReturn09999999999999999() {
    // Arrange, Act and Assert
    assertEquals(0.9999999999999999d, Probability.beta(3.3306690738754696E-16d, 10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when '3.3306690738754696E-16'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_when33306690738754696e16_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.beta(Double.NaN, 10.0d, 3.3306690738754696E-16d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when '3.3306690738754696E-16'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_when33306690738754696e16_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.beta(171.6243769563027d, 10.0d, 3.3306690738754696E-16d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return {@code 0.91021728515625}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when five; then return '0.91021728515625'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_whenFive_thenReturn091021728515625() {
    // Arrange, Act and Assert
    assertEquals(0.91021728515625d, Probability.beta(5.0d, 10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.beta(10.0d, 10.0d, Double.NaN));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_whenNaN_thenReturnNaN2() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.beta(Double.NaN, 10.0d, Double.NaN));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_whenNaN_thenReturnNaN3() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.beta(0.5d, 10.0d, Double.NaN));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.9990234375}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when one; then return '0.9990234375'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_whenOne_thenReturn09990234375() {
    // Arrange, Act and Assert
    assertEquals(0.9990234375d, Probability.beta(1.0d, 10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when one; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_whenOne_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.beta(1.0d, 10.0d, Double.NaN));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.beta(10.0d, 10.0d, 1.0d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.beta(10.0d, 10.0d, 0.0d));
  }

  /**
   * Test {@link Probability#beta(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#beta(double, double, double)}
   */
  @Test
  @DisplayName("Test beta(double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.beta(double, double, double)"})
  void testBeta_whenZero_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.beta(1.0d, 10.0d, 0.0d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.5000000000000002}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '0.5'; then return '0.5000000000000002'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when05_thenReturn05000000000000002() {
    // Arrange, Act and Assert
    assertEquals(0.5000000000000002d, Probability.betaComplemented(10.0d, 10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.9997665525652514}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '0.5'; then return '0.9997665525652514'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when05_thenReturn09997665525652514() {
    // Arrange, Act and Assert
    assertEquals(0.9997665525652514d, Probability.betaComplemented(10.0d, 0.5d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 2.3344743474862243E-4}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '0.5'; then return '2.3344743474862243E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when05_thenReturn23344743474862243e4() {
    // Arrange, Act and Assert
    assertEquals(2.3344743474862243E-4d, Probability.betaComplemented(0.5d, 10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 171.6243769563027}.
   *   <li>Then return {@code 2.167277633275472E-52}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '171.6243769563027'; then return '2.167277633275472E-52'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when1716243769563027_thenReturn2167277633275472e52() {
    // Arrange, Act and Assert
    assertEquals(
        2.167277633275472E-52d, Probability.betaComplemented(1.0d, 171.6243769563027d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 171.6243769563027}.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '171.6243769563027'; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when1716243769563027_thenReturn09999999999999999() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999999d, Probability.betaComplemented(171.6243769563027d, 10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 85.81218847815136}.
   *   <li>Then return {@code 0.9999999683165041}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '85.81218847815136'; then return '0.9999999683165041'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when8581218847815136_thenReturn09999999683165041() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999683165041d,
        Probability.betaComplemented(171.6243769563027d, 85.81218847815136d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 85.81218847815136}.
   *   <li>Then return {@code 1.2589934171435624E-27}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '85.81218847815136'; then return '1.2589934171435624E-27'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when8581218847815136_thenReturn12589934171435624e27() {
    // Arrange, Act and Assert
    assertEquals(
        1.2589934171435624E-27d, Probability.betaComplemented(0.5d, 85.81218847815136d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.9523809523809523}.
   *   <li>Then return {@code 0.3292565771717097}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '0.9523809523809523'; then return '0.3292565771717097'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when09523809523809523_thenReturn03292565771717097() {
    // Arrange, Act and Assert
    assertEquals(
        0.3292565771717097d, Probability.betaComplemented(0.5d, 10.0d, 0.9523809523809523d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.1102230246251565E-16}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '1.1102230246251565E-16'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when11102230246251565e16_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, Probability.betaComplemented(1.0d, 171.6243769563027d, 1.1102230246251565E-16d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.1102230246251565E-16}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '1.1102230246251565E-16'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when11102230246251565e16_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, Probability.betaComplemented(0.5d, 85.81218847815136d, 1.1102230246251565E-16d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return {@code 5.994560153321514E-20}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '3.3306690738754696E-16'; then return '5.994560153321514E-20'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when33306690738754696e16_thenReturn5994560153321514e20() {
    // Arrange, Act and Assert
    assertEquals(
        5.994560153321514E-20d, Probability.betaComplemented(3.3306690738754696E-16d, 10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when '3.3306690738754696E-16'; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_when33306690738754696e16_thenReturn09999999999999999() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999999d, Probability.betaComplemented(10.0d, 3.3306690738754696E-16d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return {@code 0.91021728515625}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when five; then return '0.91021728515625'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_whenFive_thenReturn091021728515625() {
    // Arrange, Act and Assert
    assertEquals(0.91021728515625d, Probability.betaComplemented(10.0d, 5.0d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return {@code 0.08978271484375001}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test betaComplemented(double, double, double); when five; then return '0.08978271484375001'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_whenFive_thenReturn008978271484375001() {
    // Arrange, Act and Assert
    assertEquals(0.08978271484375001d, Probability.betaComplemented(5.0d, 10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test betaComplemented(double, double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.betaComplemented(10.0d, 10.0d, Double.NaN));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test betaComplemented(double, double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_whenNaN_thenReturnNaN2() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.betaComplemented(1.0d, 10.0d, Double.NaN));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test betaComplemented(double, double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_whenNaN_thenReturnNaN3() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.betaComplemented(Double.NaN, 10.0d, Double.NaN));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test betaComplemented(double, double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_whenNaN_thenReturnNaN4() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.betaComplemented(0.5d, 10.0d, Double.NaN));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 9.765625E-4}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test betaComplemented(double, double, double); when one; then return '9.765625E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_whenOne_thenReturn9765625e4() {
    // Arrange, Act and Assert
    assertEquals(9.765625E-4d, Probability.betaComplemented(1.0d, 10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test betaComplemented(double, double, double); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.betaComplemented(10.0d, 10.0d, 1.0d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test betaComplemented(double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.betaComplemented(10.0d, 10.0d, 0.0d));
  }

  /**
   * Test {@link Probability#betaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#betaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test betaComplemented(double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.betaComplemented(double, double, double)"})
  void testBetaComplemented_whenZero_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.betaComplemented(1.0d, 10.0d, 0.0d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when '0.5'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_when05_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals(0.5d, Probability.binomial(1, 3, 0.5d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code -709.782712893384}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomial(int, int, double); when '-709.782712893384'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_when709782712893384_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Probability.binomial(3, 3, -709.782712893384d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.9933554817275747}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when '0.9933554817275747'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_when09933554817275747_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.binomial(1, 300, 0.9933554817275747d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomial(int, int, double); when '3.3306690738754696E-16'; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_when33306690738754696e16_thenReturn09999999999999999() {
    // Arrange, Act and Assert
    assertEquals(0.9999999999999999d, Probability.binomial(2, 3, 3.3306690738754696E-16d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomial(int, int, double); when '3.3306690738754696E-16'; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_when33306690738754696e16_thenReturn099999999999999992() {
    // Arrange, Act and Assert
    assertEquals(0.9999999999999999d, Probability.binomial(1, 300, 3.3306690738754696E-16d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when five; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenFive_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals(0.5d, Probability.binomial(2, 5, 0.5d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return {@code 0.7734375000000002}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when four; then return '0.7734375000000002'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenFour_thenReturn07734375000000002() {
    // Arrange, Act and Assert
    assertEquals(0.7734375000000002d, Probability.binomial(4, 7, 0.5d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomial(int, int, double); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.binomial(-1, 3, 10.0d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomial(int, int, double); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenMinusOne_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.binomial(-1, 3, 1.0d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.binomial(1, 3, Double.NaN));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenNaN_thenReturnNaN2() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.binomial(2, 3, Double.NaN));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.binomial(3, 3, 1.0d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.binomial(1, 3, 1.0d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.binomial(3, 1, 1.0d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When seven.
   *   <li>Then return {@code 0.22656249999999983}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when seven; then return '0.22656249999999983'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenSeven_thenReturn022656249999999983() {
    // Arrange, Act and Assert
    assertEquals(0.22656249999999983d, Probability.binomial(2, 7, 0.5d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.binomial(3, 3, 10.0d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenTen_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.binomial(1, 3, 10.0d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When three hundred.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when three hundred; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenThreeHundred_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.binomial(1, 300, Double.NaN));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.875}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when two; then return '0.875'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenTwo_thenReturn0875() {
    // Arrange, Act and Assert
    assertEquals(0.875d, Probability.binomial(2, 3, 0.5d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenZero_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.binomial(1, 3, 0.0d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.binomial(0, 3, 1.0d));
  }

  /**
   * Test {@link Probability#binomial(int, int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomial(int, int, double)}
   */
  @Test
  @DisplayName("Test binomial(int, int, double); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomial(int, int, double)"})
  void testBinomial_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.binomial(0, 3, 10.0d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when '0.5'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_when05_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals(0.5d, Probability.binomialComplemented(1, 3, 0.5d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code -709.782712893384}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomialComplemented(int, int, double); when '-709.782712893384'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_when709782712893384_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Probability.binomialComplemented(3, 3, -709.782712893384d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   *   <li>Then return {@code 4.975370381130767E-27}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomialComplemented(int, int, double); when '3.3306690738754696E-16'; then return '4.975370381130767E-27'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_when33306690738754696e16_thenReturn4975370381130767e27() {
    // Arrange, Act and Assert
    assertEquals(
        4.975370381130767E-27d, Probability.binomialComplemented(1, 300, 3.3306690738754696E-16d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when five; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenFive_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals(0.5d, Probability.binomialComplemented(2, 5, 0.5d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomialComplemented(int, int, double); when five; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenFive_thenReturn09999999999999999() {
    // Arrange, Act and Assert
    assertEquals(0.9999999999999999d, Probability.binomialComplemented(5, 300, 0.5d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomialComplemented(int, int, double); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Probability.binomialComplemented(-1, 3, 10.0d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomialComplemented(int, int, double); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenMinusOne_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Probability.binomialComplemented(-1, 3, 1.0d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.binomialComplemented(1, 3, Double.NaN));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenNaN_thenReturnNaN2() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.binomialComplemented(2, 3, Double.NaN));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenNaN_thenReturnNaN3() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.binomialComplemented(1, 300, Double.NaN));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.binomialComplemented(1, 3, 1.0d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.binomialComplemented(3, 3, 1.0d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomialComplemented(int, int, double); when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Probability.binomialComplemented(3, 1, 1.0d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When seven.
   *   <li>Then return {@code 0.9375}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when seven; then return '0.9375'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenSeven_thenReturn09375() {
    // Arrange, Act and Assert
    assertEquals(0.9375d, Probability.binomialComplemented(1, 7, 0.5d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When seven.
   *   <li>Then return {@code 0.7734375000000002}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomialComplemented(int, int, double); when seven; then return '0.7734375000000002'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenSeven_thenReturn07734375000000002() {
    // Arrange, Act and Assert
    assertEquals(0.7734375000000002d, Probability.binomialComplemented(2, 7, 0.5d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomialComplemented(int, int, double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Probability.binomialComplemented(3, 3, 10.0d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomialComplemented(int, int, double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenTen_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Probability.binomialComplemented(1, 3, 10.0d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When three hundred.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomialComplemented(int, int, double); when three hundred; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenThreeHundred_thenReturn09999999999999999() {
    // Arrange, Act and Assert
    assertEquals(0.9999999999999999d, Probability.binomialComplemented(1, 300, 0.5d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When two hundred.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when two hundred; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenTwoHundred_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.binomialComplemented(200, 300, 3.3306690738754696E-16d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.125}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when two; then return '0.125'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenTwo_thenReturn0125() {
    // Arrange, Act and Assert
    assertEquals(0.125d, Probability.binomialComplemented(2, 3, 0.5d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenZero_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.binomialComplemented(0, 3, 1.0d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test binomialComplemented(int, int, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.binomialComplemented(1, 3, 0.0d));
  }

  /**
   * Test {@link Probability#binomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#binomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test binomialComplemented(int, int, double); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.binomialComplemented(int, int, double)"})
  void testBinomialComplemented_whenZero_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Probability.binomialComplemented(0, 3, 10.0d));
  }

  /**
   * Test {@link Probability#chiSquare(double, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquare(double, double)}
   */
  @Test
  @DisplayName("Test chiSquare(double, double); when '-1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquare(double, double)"})
  void testChiSquare_when10e10_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.chiSquare(1.0d, -1.0E-10d));
  }

  /**
   * Test {@link Probability#chiSquare(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.9999999999999999}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquare(double, double)}
   */
  @Test
  @DisplayName("Test chiSquare(double, double); when '0.9999999999999999'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquare(double, double)"})
  void testChiSquare_when09999999999999999_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.chiSquare(0.9999999999999999d, 0.0d));
  }

  /**
   * Test {@link Probability#chiSquare(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquare(double, double)}
   */
  @Test
  @DisplayName("Test chiSquare(double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquare(double, double)"})
  void testChiSquare_whenNaN_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.chiSquare(Double.NaN, 2.0d));
  }

  /**
   * Test {@link Probability#chiSquare(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.8427007929497151}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquare(double, double)}
   */
  @Test
  @DisplayName("Test chiSquare(double, double); when one; then return '0.8427007929497151'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquare(double, double)"})
  void testChiSquare_whenOne_thenReturn08427007929497151() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.8427007929497151d, Probability.chiSquare(1.0d, 2.0d));
  }

  /**
   * Test {@link Probability#chiSquare(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.9984345977419975}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquare(double, double)}
   */
  @Test
  @DisplayName("Test chiSquare(double, double); when one; then return '0.9984345977419975'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquare(double, double)"})
  void testChiSquare_whenOne_thenReturn09984345977419975() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9984345977419975d, Probability.chiSquare(1.0d, 10.0d));
  }

  /**
   * Test {@link Probability#chiSquare(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.003659846827343713}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquare(double, double)}
   */
  @Test
  @DisplayName("Test chiSquare(double, double); when ten; then return '0.003659846827343713'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquare(double, double)"})
  void testChiSquare_whenTen_thenReturn0003659846827343713() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.003659846827343713d, Probability.chiSquare(10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#chiSquare(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.5595067149347874}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquare(double, double)}
   */
  @Test
  @DisplayName("Test chiSquare(double, double); when ten; then return '0.5595067149347874'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquare(double, double)"})
  void testChiSquare_whenTen_thenReturn05595067149347874() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5595067149347874d, Probability.chiSquare(10.0d, 10.0d));
  }

  /**
   * Test {@link Probability#chiSquare(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.9932620530009145}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquare(double, double)}
   */
  @Test
  @DisplayName("Test chiSquare(double, double); when ten; then return '0.9932620530009145'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquare(double, double)"})
  void testChiSquare_whenTen_thenReturn09932620530009145() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9932620530009145d, Probability.chiSquare(2.0d, 10.0d));
  }

  /**
   * Test {@link Probability#chiSquare(double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.6321205588285578}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquare(double, double)}
   */
  @Test
  @DisplayName("Test chiSquare(double, double); when two; then return '0.6321205588285578'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquare(double, double)"})
  void testChiSquare_whenTwo_thenReturn06321205588285578() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.6321205588285578d, Probability.chiSquare(2.0d, 2.0d));
  }

  /**
   * Test {@link Probability#chiSquare(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquare(double, double)}
   */
  @Test
  @DisplayName("Test chiSquare(double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquare(double, double)"})
  void testChiSquare_whenZero_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.chiSquare(1.0d, 0.0d));
  }

  /**
   * Test {@link Probability#chiSquareComplemented(double, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquareComplemented(double, double)}
   */
  @Test
  @DisplayName("Test chiSquareComplemented(double, double); when '-1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquareComplemented(double, double)"})
  void testChiSquareComplemented_when10e10_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.chiSquareComplemented(1.0d, -1.0E-10d));
  }

  /**
   * Test {@link Probability#chiSquareComplemented(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.9999999999999999}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquareComplemented(double, double)}
   */
  @Test
  @DisplayName(
      "Test chiSquareComplemented(double, double); when '0.9999999999999999'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquareComplemented(double, double)"})
  void testChiSquareComplemented_when09999999999999999_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.chiSquareComplemented(0.9999999999999999d, 0.0d));
  }

  /**
   * Test {@link Probability#chiSquareComplemented(double, double)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return {@code 0.8911780189141513}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquareComplemented(double, double)}
   */
  @Test
  @DisplayName(
      "Test chiSquareComplemented(double, double); when five; then return '0.8911780189141513'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquareComplemented(double, double)"})
  void testChiSquareComplemented_whenFive_thenReturn08911780189141513() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.8911780189141513d, Probability.chiSquareComplemented(10.0d, 5.0d));
  }

  /**
   * Test {@link Probability#chiSquareComplemented(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquareComplemented(double, double)}
   */
  @Test
  @DisplayName("Test chiSquareComplemented(double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquareComplemented(double, double)"})
  void testChiSquareComplemented_whenNaN_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.chiSquareComplemented(Double.NaN, 2.0d));
  }

  /**
   * Test {@link Probability#chiSquareComplemented(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.15729920705028505}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquareComplemented(double, double)}
   */
  @Test
  @DisplayName(
      "Test chiSquareComplemented(double, double); when one; then return '0.15729920705028505'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquareComplemented(double, double)"})
  void testChiSquareComplemented_whenOne_thenReturn015729920705028505() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.15729920705028505d, Probability.chiSquareComplemented(1.0d, 2.0d));
  }

  /**
   * Test {@link Probability#chiSquareComplemented(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.9963401531726563}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquareComplemented(double, double)}
   */
  @Test
  @DisplayName(
      "Test chiSquareComplemented(double, double); when ten; then return '0.9963401531726563'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquareComplemented(double, double)"})
  void testChiSquareComplemented_whenTen_thenReturn09963401531726563() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9963401531726563d, Probability.chiSquareComplemented(10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#chiSquareComplemented(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.9998278843700441}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquareComplemented(double, double)}
   */
  @Test
  @DisplayName(
      "Test chiSquareComplemented(double, double); when ten; then return '0.9998278843700441'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquareComplemented(double, double)"})
  void testChiSquareComplemented_whenTen_thenReturn09998278843700441() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9998278843700441d, Probability.chiSquareComplemented(10.0d, 1.0d));
  }

  /**
   * Test {@link Probability#chiSquareComplemented(double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.36787944117144233}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquareComplemented(double, double)}
   */
  @Test
  @DisplayName(
      "Test chiSquareComplemented(double, double); when two; then return '0.36787944117144233'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquareComplemented(double, double)"})
  void testChiSquareComplemented_whenTwo_thenReturn036787944117144233() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.36787944117144233d, Probability.chiSquareComplemented(2.0d, 2.0d));
  }

  /**
   * Test {@link Probability#chiSquareComplemented(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#chiSquareComplemented(double, double)}
   */
  @Test
  @DisplayName("Test chiSquareComplemented(double, double); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.chiSquareComplemented(double, double)"})
  void testChiSquareComplemented_whenZero_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.chiSquareComplemented(1.0d, 0.0d));
  }

  /**
   * Test {@link Probability#errorFunction(double)}.
   *
   * <ul>
   *   <li>When {@code -709.782712893384}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunction(double)}
   */
  @Test
  @DisplayName("Test errorFunction(double); when '-709.782712893384'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunction(double)"})
  void testErrorFunction_when709782712893384_thenReturnMinusOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-1.0d, Probability.errorFunction(-709.782712893384d));
  }

  /**
   * Test {@link Probability#errorFunction(double)}.
   *
   * <ul>
   *   <li>When {@code 90.02601972038427}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunction(double)}
   */
  @Test
  @DisplayName("Test errorFunction(double); when '90.02601972038427'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunction(double)"})
  void testErrorFunction_when9002601972038427_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.errorFunction(90.02601972038427d));
  }

  /**
   * Test {@link Probability#errorFunction(double)}.
   *
   * <ul>
   *   <li>When {@code -1.2391658386738125}.
   *   <li>Then return {@code -0.9203027038438489}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunction(double)}
   */
  @Test
  @DisplayName(
      "Test errorFunction(double); when '-1.2391658386738125'; then return '-0.9203027038438489'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunction(double)"})
  void testErrorFunction_when12391658386738125_thenReturn09203027038438489()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-0.9203027038438489d, Probability.errorFunction(-1.2391658386738125d));
  }

  /**
   * Test {@link Probability#errorFunction(double)}.
   *
   * <ul>
   *   <li>When eight.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunction(double)}
   */
  @Test
  @DisplayName("Test errorFunction(double); when eight; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunction(double)"})
  void testErrorFunction_whenEight_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.errorFunction(8.0d));
  }

  /**
   * Test {@link Probability#errorFunction(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.9953222650189527}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunction(double)}
   */
  @Test
  @DisplayName("Test errorFunction(double); when two; then return '0.9953222650189527'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunction(double)"})
  void testErrorFunction_whenTwo_thenReturn09953222650189527() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9953222650189527d, Probability.errorFunction(2.0d));
  }

  /**
   * Test {@link Probability#errorFunction(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunction(double)}
   */
  @Test
  @DisplayName("Test errorFunction(double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunction(double)"})
  void testErrorFunction_whenZero_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.errorFunction(0.0d));
  }

  /**
   * Test {@link Probability#errorFunctionComplemented(double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code 1.000000000112838}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunctionComplemented(double)}
   */
  @Test
  @DisplayName(
      "Test errorFunctionComplemented(double); when '-1.0E-10'; then return '1.000000000112838'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunctionComplemented(double)"})
  void testErrorFunctionComplemented_when10e10_thenReturn1000000000112838()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.000000000112838d, Probability.errorFunctionComplemented(-1.0E-10d));
  }

  /**
   * Test {@link Probability#errorFunctionComplemented(double)}.
   *
   * <ul>
   *   <li>When {@code -709.782712893384}.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunctionComplemented(double)}
   */
  @Test
  @DisplayName("Test errorFunctionComplemented(double); when '-709.782712893384'; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunctionComplemented(double)"})
  void testErrorFunctionComplemented_when709782712893384_thenReturnTwo()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2.0d, Probability.errorFunctionComplemented(-709.782712893384d));
  }

  /**
   * Test {@link Probability#errorFunctionComplemented(double)}.
   *
   * <ul>
   *   <li>When {@code 48.63719709856814}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunctionComplemented(double)}
   */
  @Test
  @DisplayName("Test errorFunctionComplemented(double); when '48.63719709856814'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunctionComplemented(double)"})
  void testErrorFunctionComplemented_when4863719709856814_thenReturnZero()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.errorFunctionComplemented(48.63719709856814d));
  }

  /**
   * Test {@link Probability#errorFunctionComplemented(double)}.
   *
   * <ul>
   *   <li>When {@code -1.2391658386738125}.
   *   <li>Then return {@code 1.920302703843849}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunctionComplemented(double)}
   */
  @Test
  @DisplayName(
      "Test errorFunctionComplemented(double); when '-1.2391658386738125'; then return '1.920302703843849'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunctionComplemented(double)"})
  void testErrorFunctionComplemented_when12391658386738125_thenReturn1920302703843849()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.920302703843849d, Probability.errorFunctionComplemented(-1.2391658386738125d));
  }

  /**
   * Test {@link Probability#errorFunctionComplemented(double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.15729920705028516}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunctionComplemented(double)}
   */
  @Test
  @DisplayName(
      "Test errorFunctionComplemented(double); when one; then return '0.15729920705028516'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunctionComplemented(double)"})
  void testErrorFunctionComplemented_whenOne_thenReturn015729920705028516()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.15729920705028516d, Probability.errorFunctionComplemented(1.0d));
  }

  /**
   * Test {@link Probability#errorFunctionComplemented(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 2.0884875837625446E-45}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunctionComplemented(double)}
   */
  @Test
  @DisplayName(
      "Test errorFunctionComplemented(double); when ten; then return '2.0884875837625446E-45'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunctionComplemented(double)"})
  void testErrorFunctionComplemented_whenTen_thenReturn20884875837625446e45()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(2.0884875837625446E-45d, Probability.errorFunctionComplemented(10.0d));
  }

  /**
   * Test {@link Probability#errorFunctionComplemented(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#errorFunctionComplemented(double)}
   */
  @Test
  @DisplayName("Test errorFunctionComplemented(double); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.errorFunctionComplemented(double)"})
  void testErrorFunctionComplemented_whenZero_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.errorFunctionComplemented(0.0d));
  }

  /**
   * Test {@link Probability#gamma(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gamma(double, double, double)}
   */
  @Test
  @DisplayName("Test gamma(double, double, double); when '-1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gamma(double, double, double)"})
  void testGamma_when10e10_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.gamma(10.0d, 0.0d, -1.0E-10d));
  }

  /**
   * Test {@link Probability#gamma(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gamma(double, double, double)}
   */
  @Test
  @DisplayName("Test gamma(double, double, double); when '1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gamma(double, double, double)"})
  void testGamma_when10e10_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.gamma(10.0d, 1.0E-10d, 0.0d));
  }

  /**
   * Test {@link Probability#gamma(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 8.116141674705085E-4}.
   *   <li>Then return {@code 0.99999999999992}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gamma(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double); when '8.116141674705085E-4'; then return '0.99999999999992'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gamma(double, double, double)"})
  void testGamma_when8116141674705085e4_thenReturn099999999999992() {
    // Arrange, Act and Assert
    assertEquals(0.99999999999992d, Probability.gamma(10.0d, 8.116141674705085E-4d, 2.0d));
  }

  /**
   * Test {@link Probability#gamma(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 8.116141674705085E-4}.
   *   <li>Then return {@code 3.4945579774194216E-35}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gamma(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double); when '8.116141674705085E-4'; then return '3.4945579774194216E-35'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gamma(double, double, double)"})
  void testGamma_when8116141674705085e4_thenReturn34945579774194216e35() {
    // Arrange, Act and Assert
    assertEquals(3.4945579774194216E-35d, Probability.gamma(8.116141674705085E-4d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#gamma(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.9999999979388464}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gamma(double, double, double)}
   */
  @Test
  @DisplayName("Test gamma(double, double, double); when one; then return '0.9999999979388464'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gamma(double, double, double)"})
  void testGamma_whenOne_thenReturn09999999979388464() {
    // Arrange, Act and Assert
    assertEquals(0.9999999979388464d, Probability.gamma(10.0d, 1.0d, 2.0d));
  }

  /**
   * Test {@link Probability#gamma(double, double, double)}.
   *
   * <ul>
   *   <li>When twenty.
   *   <li>Then return {@code 0.5297427331607578}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gamma(double, double, double)}
   */
  @Test
  @DisplayName("Test gamma(double, double, double); when twenty; then return '0.5297427331607578'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gamma(double, double, double)"})
  void testGamma_whenTwenty_thenReturn05297427331607578() {
    // Arrange, Act and Assert
    assertEquals(0.5297427331607578d, Probability.gamma(10.0d, 20.0d, 2.0d));
  }

  /**
   * Test {@link Probability#gamma(double, double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.008132242796933871}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gamma(double, double, double)}
   */
  @Test
  @DisplayName("Test gamma(double, double, double); when two; then return '0.008132242796933871'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gamma(double, double, double)"})
  void testGamma_whenTwo_thenReturn0008132242796933871() {
    // Arrange, Act and Assert
    assertEquals(0.008132242796933871d, Probability.gamma(2.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#gamma(double, double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.9950045876916924}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gamma(double, double, double)}
   */
  @Test
  @DisplayName("Test gamma(double, double, double); when two; then return '0.9950045876916924'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gamma(double, double, double)"})
  void testGamma_whenTwo_thenReturn09950045876916924() {
    // Arrange, Act and Assert
    assertEquals(0.9950045876916924d, Probability.gamma(10.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#gamma(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gamma(double, double, double)}
   */
  @Test
  @DisplayName("Test gamma(double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gamma(double, double, double)"})
  void testGamma_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.gamma(10.0d, 0.0d, 0.0d));
  }

  /**
   * Test {@link Probability#gamma(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gamma(double, double, double)}
   */
  @Test
  @DisplayName("Test gamma(double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gamma(double, double, double)"})
  void testGamma_whenZero_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.gamma(10.0d, 0.0d, 2.0d));
  }

  /**
   * Test {@link Probability#gammaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gammaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test gammaComplemented(double, double, double); when '1.0E-10'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gammaComplemented(double, double, double)"})
  void testGammaComplemented_when10e10_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.gammaComplemented(10.0d, 1.0E-10d, 0.0d));
  }

  /**
   * Test {@link Probability#gammaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gammaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test gammaComplemented(double, double, double); when '-1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gammaComplemented(double, double, double)"})
  void testGammaComplemented_when10e10_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.gammaComplemented(10.0d, 0.0d, -1.0E-10d));
  }

  /**
   * Test {@link Probability#gammaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 8.116141674705085E-4}.
   *   <li>Then return {@code 8.006126506601329E-14}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gammaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gammaComplemented(double, double, double); when '8.116141674705085E-4'; then return '8.006126506601329E-14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gammaComplemented(double, double, double)"})
  void testGammaComplemented_when8116141674705085e4_thenReturn8006126506601329e14() {
    // Arrange, Act and Assert
    assertEquals(
        8.006126506601329E-14d, Probability.gammaComplemented(10.0d, 8.116141674705085E-4d, 2.0d));
  }

  /**
   * Test {@link Probability#gammaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 8.116141674705085E-4}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gammaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gammaComplemented(double, double, double); when '8.116141674705085E-4'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gammaComplemented(double, double, double)"})
  void testGammaComplemented_when8116141674705085e4_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.gammaComplemented(8.116141674705085E-4d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#gammaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 2.0611536224385566E-9}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gammaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gammaComplemented(double, double, double); when one; then return '2.0611536224385566E-9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gammaComplemented(double, double, double)"})
  void testGammaComplemented_whenOne_thenReturn20611536224385566e9() {
    // Arrange, Act and Assert
    assertEquals(2.0611536224385566E-9d, Probability.gammaComplemented(10.0d, 1.0d, 2.0d));
  }

  /**
   * Test {@link Probability#gammaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When twenty.
   *   <li>Then return {@code 0.4702572668392375}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gammaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gammaComplemented(double, double, double); when twenty; then return '0.4702572668392375'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gammaComplemented(double, double, double)"})
  void testGammaComplemented_whenTwenty_thenReturn04702572668392375() {
    // Arrange, Act and Assert
    assertEquals(0.4702572668392375d, Probability.gammaComplemented(10.0d, 20.0d, 2.0d));
  }

  /**
   * Test {@link Probability#gammaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.9918677572030661}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gammaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gammaComplemented(double, double, double); when two; then return '0.9918677572030661'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gammaComplemented(double, double, double)"})
  void testGammaComplemented_whenTwo_thenReturn09918677572030661() {
    // Arrange, Act and Assert
    assertEquals(0.9918677572030661d, Probability.gammaComplemented(2.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#gammaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.0049954123083075785}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gammaComplemented(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gammaComplemented(double, double, double); when two; then return '0.0049954123083075785'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gammaComplemented(double, double, double)"})
  void testGammaComplemented_whenTwo_thenReturn00049954123083075785() {
    // Arrange, Act and Assert
    assertEquals(0.0049954123083075785d, Probability.gammaComplemented(10.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#gammaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gammaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test gammaComplemented(double, double, double); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gammaComplemented(double, double, double)"})
  void testGammaComplemented_whenZero_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.gammaComplemented(10.0d, 0.0d, 0.0d));
  }

  /**
   * Test {@link Probability#gammaComplemented(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#gammaComplemented(double, double, double)}
   */
  @Test
  @DisplayName("Test gammaComplemented(double, double, double); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.gammaComplemented(double, double, double)"})
  void testGammaComplemented_whenZero_thenReturnOne2() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.gammaComplemented(10.0d, 0.0d, 2.0d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.3125}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomial(int, int, double); when '0.5'; then return '0.3125'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_when05_thenReturn03125() {
    // Arrange, Act and Assert
    assertEquals(0.3125d, Probability.negativeBinomial(1, 3, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.9375}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomial(int, int, double); when '0.5'; then return '0.9375'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_when05_thenReturn09375() {
    // Arrange, Act and Assert
    assertEquals(0.9375d, Probability.negativeBinomial(3, 1, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.6562499999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when '0.5'; then return '0.6562499999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_when05_thenReturn06562499999999999() {
    // Arrange, Act and Assert
    assertEquals(0.6562499999999999d, Probability.negativeBinomial(3, 3, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.95}.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when '0.95'; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_when095_thenReturn09999999999999999() {
    // Arrange, Act and Assert
    assertEquals(0.9999999999999999d, Probability.negativeBinomial(300, 1, 0.95d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.00660066006600657}.
   *   <li>Then return {@code 0.8637664748266022}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when '0.00660066006600657'; then return '0.8637664748266022'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_when000660066006600657_thenReturn08637664748266022() {
    // Arrange, Act and Assert
    assertEquals(0.8637664748266022d, Probability.negativeBinomial(300, 1, 0.00660066006600657d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.00660066006600657}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when '0.00660066006600657'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_when000660066006600657_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.negativeBinomial(300, 300, 0.00660066006600657d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code -709.782712893384}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when '-709.782712893384'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_when709782712893384_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Probability.negativeBinomial(3, 3, -709.782712893384d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomial(int, int, double); when minus one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenMinusOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.negativeBinomial(-1, 3, 1.0d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.negativeBinomial(-1, 3, 10.0d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomial(int, int, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.negativeBinomial(3, 3, Double.NaN));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomial(int, int, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenNaN_thenReturnNaN2() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.negativeBinomial(0, 3, Double.NaN));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomial(int, int, double); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.negativeBinomial(3, 3, 1.0d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.negativeBinomial(3, 3, 10.0d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenTen_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.negativeBinomial(1, 3, 10.0d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenTen_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.negativeBinomial(0, 3, 10.0d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When three hundred.
   *   <li>Then return {@code 0.5162799656673773}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when three hundred; then return '0.5162799656673773'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenThreeHundred_thenReturn05162799656673773() {
    // Arrange, Act and Assert
    assertEquals(0.5162799656673773d, Probability.negativeBinomial(300, 300, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When three hundred.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when three hundred; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenThreeHundred_thenReturn09999999999999999() {
    // Arrange, Act and Assert
    assertEquals(0.9999999999999999d, Probability.negativeBinomial(300, 3, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When three hundred.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomial(int, int, double); when three hundred; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenThreeHundred_thenReturn099999999999999992() {
    // Arrange, Act and Assert
    assertEquals(0.9999999999999999d, Probability.negativeBinomial(300, 1, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomial(int, int, double); when two; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenTwo_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals(0.5d, Probability.negativeBinomial(2, 3, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 0.125}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomial(int, int, double); when zero; then return '0.125'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenZero_thenReturn0125() {
    // Arrange, Act and Assert
    assertEquals(0.125d, Probability.negativeBinomial(0, 3, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomial(int, int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomial(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomial(int, int, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomial(int, int, double)"})
  void testNegativeBinomial_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.negativeBinomial(3, 3, 0.0d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.948964356448539}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); then return '0.948964356448539'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_thenReturn0948964356448539() {
    // Arrange, Act and Assert
    assertEquals(
        0.948964356448539d, Probability.negativeBinomialComplemented(0, 300, 0.9901315789473685d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.7978719906711413}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); then return '0.7978719906711413'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_thenReturn07978719906711413() {
    // Arrange, Act and Assert
    assertEquals(
        0.7978719906711413d, Probability.negativeBinomialComplemented(1, 300, 0.9901315789473685d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.9999999999999996}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); then return '0.9999999999999996'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_thenReturn09999999999999996() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999996d,
        Probability.negativeBinomialComplemented(3, 1, 1.1102230246251565E-16d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.3437500000000001}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when '0.5'; then return '0.3437500000000001'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_when05_thenReturn03437500000000001() {
    // Arrange, Act and Assert
    assertEquals(0.3437500000000001d, Probability.negativeBinomialComplemented(3, 3, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code -709.782712893384}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomialComplemented(int, int, double); when '-709.782712893384'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_when709782712893384() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Probability.negativeBinomialComplemented(3, 3, -709.782712893384d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.9901315789473685}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when '0.9901315789473685'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_when09901315789473685_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.negativeBinomialComplemented(300, 3, 0.9901315789473685d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 0.9901315789473685}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when '0.9901315789473685'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_when09901315789473685_thenReturnZero2() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.negativeBinomialComplemented(300, 300, 0.9901315789473685d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 3.3306690738754696E-16}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomialComplemented(int, int, double); when '3.3306690738754696E-16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_when33306690738754696e16() {
    // Arrange, Act and Assert
    assertEquals(
        0.9999999999999999d,
        Probability.negativeBinomialComplemented(2, 3, 3.3306690738754696E-16d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when minus one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenMinusOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.negativeBinomialComplemented(-1, 3, 1.0d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Probability.negativeBinomialComplemented(-1, 3, 10.0d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomialComplemented(int, int, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.negativeBinomialComplemented(3, 3, Double.NaN));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomialComplemented(int, int, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenNaN_thenReturnNaN2() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.negativeBinomialComplemented(0, 3, Double.NaN));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.0625}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when one; then return '0.0625'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenOne_thenReturn00625() {
    // Arrange, Act and Assert
    assertEquals(0.0625d, Probability.negativeBinomialComplemented(3, 1, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.6875}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when one; then return '0.6875'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenOne_thenReturn06875() {
    // Arrange, Act and Assert
    assertEquals(0.6875d, Probability.negativeBinomialComplemented(1, 3, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomialComplemented(int, int, double); when one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.negativeBinomialComplemented(3, 3, 1.0d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When seven.
   *   <li>Then return {@code 0.91015625}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when seven; then return '0.91015625'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenSeven_thenReturn091015625() {
    // Arrange, Act and Assert
    assertEquals(0.91015625d, Probability.negativeBinomialComplemented(2, 7, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Probability.negativeBinomialComplemented(3, 3, 10.0d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenTen_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Probability.negativeBinomialComplemented(1, 3, 10.0d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenTen_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Probability.negativeBinomialComplemented(0, 3, 10.0d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When three hundred.
   *   <li>Then return {@code 0.9999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when three hundred; then return '0.9999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenThreeHundred_thenReturn09999999999999999() {
    // Arrange, Act and Assert
    assertEquals(0.9999999999999999d, Probability.negativeBinomialComplemented(3, 300, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When three hundred.
   *   <li>Then return {@code 2.4545467326496486E-91}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when three hundred; then return '2.4545467326496486E-91'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenThreeHundred_thenReturn24545467326496486e91() {
    // Arrange, Act and Assert
    assertEquals(2.4545467326496486E-91d, Probability.negativeBinomialComplemented(300, 1, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When three hundred.
   *   <li>Then return {@code 2.8262264716405933E-87}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when three hundred; then return '2.8262264716405933E-87'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenThreeHundred_thenReturn28262264716405933e87() {
    // Arrange, Act and Assert
    assertEquals(2.8262264716405933E-87d, Probability.negativeBinomialComplemented(300, 3, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When three hundred.
   *   <li>Then return {@code 0.48372003433262273}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when three hundred; then return '0.48372003433262273'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenThreeHundred_thenReturn048372003433262273() {
    // Arrange, Act and Assert
    assertEquals(0.48372003433262273d, Probability.negativeBinomialComplemented(300, 300, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomialComplemented(int, int, double); when two; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenTwo_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals(0.5d, Probability.negativeBinomialComplemented(2, 3, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 0.875}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test negativeBinomialComplemented(int, int, double); when zero; then return '0.875'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenZero_thenReturn0875() {
    // Arrange, Act and Assert
    assertEquals(0.875d, Probability.negativeBinomialComplemented(0, 3, 0.5d));
  }

  /**
   * Test {@link Probability#negativeBinomialComplemented(int, int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#negativeBinomialComplemented(int, int, double)}
   */
  @Test
  @DisplayName("Test negativeBinomialComplemented(int, int, double); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.negativeBinomialComplemented(int, int, double)"})
  void testNegativeBinomialComplemented_whenZero_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.negativeBinomialComplemented(3, 3, 0.0d));
  }

  /**
   * Test {@link Probability#normal(double)} with {@code a}.
   *
   * <ul>
   *   <li>When {@code -709.782712893384}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double)}
   */
  @Test
  @DisplayName("Test normal(double) with 'a'; when '-709.782712893384'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double)"})
  void testNormalWithA_when709782712893384_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.normal(-709.782712893384d));
  }

  /**
   * Test {@link Probability#normal(double)} with {@code a}.
   *
   * <ul>
   *   <li>When {@code 48.63719709856814}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double)}
   */
  @Test
  @DisplayName("Test normal(double) with 'a'; when '48.63719709856814'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double)"})
  void testNormalWithA_when4863719709856814_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.normal(48.63719709856814d));
  }

  /**
   * Test {@link Probability#normal(double)} with {@code a}.
   *
   * <ul>
   *   <li>When {@code 0.7071067811865476}.
   *   <li>Then return {@code 0.7602499389065234}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double)}
   */
  @Test
  @DisplayName(
      "Test normal(double) with 'a'; when '0.7071067811865476'; then return '0.7602499389065234'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double)"})
  void testNormalWithA_when07071067811865476_thenReturn07602499389065234()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.7602499389065234d, Probability.normal(0.7071067811865476d));
  }

  /**
   * Test {@link Probability#normal(double)} with {@code a}.
   *
   * <ul>
   *   <li>When {@code -1.2391658386738125}.
   *   <li>Then return {@code 0.10764204439583136}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double)}
   */
  @Test
  @DisplayName(
      "Test normal(double) with 'a'; when '-1.2391658386738125'; then return '0.10764204439583136'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double)"})
  void testNormalWithA_when12391658386738125_thenReturn010764204439583136()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.10764204439583136d, Probability.normal(-1.2391658386738125d));
  }

  /**
   * Test {@link Probability#normal(double)} with {@code a}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double)}
   */
  @Test
  @DisplayName("Test normal(double) with 'a'; when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double)"})
  void testNormalWithA_whenNaN_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.normal(Double.NaN));
  }

  /**
   * Test {@link Probability#normal(double)} with {@code a}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double)}
   */
  @Test
  @DisplayName("Test normal(double) with 'a'; when ten; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double)"})
  void testNormalWithA_whenTen_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.normal(10.0d));
  }

  /**
   * Test {@link Probability#normal(double, double, double)} with {@code mean}, {@code variance},
   * {@code x}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.6823718520013758}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test normal(double, double, double) with 'mean', 'variance', 'x'; when '0.5'; then return '0.6823718520013758'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double, double, double)"})
  void testNormalWithMeanVarianceX_when05_thenReturn06823718520013758() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.6823718520013758d, Probability.normal(0.5d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#normal(double, double, double)} with {@code mean}, {@code variance},
   * {@code x}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code 7.82701129086294E-4}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test normal(double, double, double) with 'mean', 'variance', 'x'; when '1.0E-10'; then return '7.82701129086294E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double, double, double)"})
  void testNormalWithMeanVarianceX_when10e10_thenReturn782701129086294e4()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(7.82701129086294E-4d, Probability.normal(10.0d, 10.0d, 1.0E-10d));
  }

  /**
   * Test {@link Probability#normal(double, double, double)} with {@code mean}, {@code variance},
   * {@code x}.
   *
   * <ul>
   *   <li>When {@code -709.782712893384}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test normal(double, double, double) with 'mean', 'variance', 'x'; when '-709.782712893384'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double, double, double)"})
  void testNormalWithMeanVarianceX_when709782712893384_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.normal(-709.782712893384d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#normal(double, double, double)} with {@code mean}, {@code variance},
   * {@code x}.
   *
   * <ul>
   *   <li>When {@code 2232.005345946843}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test normal(double, double, double) with 'mean', 'variance', 'x'; when '2232.005345946843'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double, double, double)"})
  void testNormalWithMeanVarianceX_when2232005345946843_thenReturnZero()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.normal(2232.005345946843d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#normal(double, double, double)} with {@code mean}, {@code variance},
   * {@code x}.
   *
   * <ul>
   *   <li>When {@code 90.02601972038427}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test normal(double, double, double) with 'mean', 'variance', 'x'; when '90.02601972038427'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double, double, double)"})
  void testNormalWithMeanVarianceX_when9002601972038427_thenReturnZero()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.normal(90.02601972038427d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#normal(double, double, double)} with {@code mean}, {@code variance},
   * {@code x}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test normal(double, double, double) with 'mean', 'variance', 'x'; when two; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double, double, double)"})
  void testNormalWithMeanVarianceX_whenTwo_thenReturn05() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5d, Probability.normal(2.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#normal(double, double, double)} with {@code mean}, {@code variance},
   * {@code x}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 0.005706018193000872}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test normal(double, double, double) with 'mean', 'variance', 'x'; when two; then return '0.005706018193000872'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double, double, double)"})
  void testNormalWithMeanVarianceX_whenTwo_thenReturn0005706018193000872()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.005706018193000872d, Probability.normal(10.0d, 10.0d, 2.0d));
  }

  /**
   * Test {@link Probability#normal(double, double, double)} with {@code mean}, {@code variance},
   * {@code x}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 7.827011290012509E-4}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normal(double, double, double)}
   */
  @Test
  @DisplayName(
      "Test normal(double, double, double) with 'mean', 'variance', 'x'; when zero; then return '7.827011290012509E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normal(double, double, double)"})
  void testNormalWithMeanVarianceX_whenZero_thenReturn7827011290012509e4()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(7.827011290012509E-4d, Probability.normal(10.0d, 10.0d, 0.0d));
  }

  /**
   * Test {@link Probability#normalInverse(double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code -6.361340902404056}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normalInverse(double)}
   */
  @Test
  @DisplayName("Test normalInverse(double); when '1.0E-10'; then return '-6.361340902404056'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normalInverse(double)"})
  void testNormalInverse_when10e10_thenReturn6361340902404056() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(-6.361340902404056d, Probability.normalInverse(1.0E-10d));
  }

  /**
   * Test {@link Probability#normalInverse(double)}.
   *
   * <ul>
   *   <li>When {@code 0.8646647167633873}.
   *   <li>Then return {@code 1.1015196284987503}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normalInverse(double)}
   */
  @Test
  @DisplayName(
      "Test normalInverse(double); when '0.8646647167633873'; then return '1.1015196284987503'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normalInverse(double)"})
  void testNormalInverse_when08646647167633873_thenReturn11015196284987503()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.1015196284987503d, Probability.normalInverse(0.8646647167633873d));
  }

  /**
   * Test {@link Probability#normalInverse(double)}.
   *
   * <ul>
   *   <li>When {@code 0.9999999999999999}.
   *   <li>Then return {@code 8.209536151601387}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normalInverse(double)}
   */
  @Test
  @DisplayName(
      "Test normalInverse(double); when '0.9999999999999999'; then return '8.209536151601387'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normalInverse(double)"})
  void testNormalInverse_when09999999999999999_thenReturn8209536151601387()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(8.209536151601387d, Probability.normalInverse(0.9999999999999999d));
  }

  /**
   * Test {@link Probability#normalInverse(double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normalInverse(double)}
   */
  @Test
  @DisplayName("Test normalInverse(double); when two; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normalInverse(double)"})
  void testNormalInverse_whenTwo_thenThrowIllegalArgumentException() throws ArithmeticException {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.normalInverse(2.0d));
  }

  /**
   * Test {@link Probability#normalInverse(double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#normalInverse(double)}
   */
  @Test
  @DisplayName("Test normalInverse(double); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.normalInverse(double)"})
  void testNormalInverse_whenZero_thenThrowIllegalArgumentException() throws ArithmeticException {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.normalInverse(0.0d));
  }

  /**
   * Test {@link Probability#poisson(int, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code 0.9999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poisson(int, double)}
   */
  @Test
  @DisplayName("Test poisson(int, double); when '1.0E-10'; then return '0.9999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poisson(int, double)"})
  void testPoisson_when10e10_thenReturn09999999999() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9999999999d, Probability.poisson(0, 1.0E-10d));
  }

  /**
   * Test {@link Probability#poisson(int, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poisson(int, double)}
   */
  @Test
  @DisplayName("Test poisson(int, double); when '-1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poisson(int, double)"})
  void testPoisson_when10e10_thenThrowIllegalArgumentException() throws ArithmeticException {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.poisson(0, -1.0E-10d));
  }

  /**
   * Test {@link Probability#poisson(int, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002}.
   *   <li>Then return {@code 0.9810118431238462}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poisson(int, double)}
   */
  @Test
  @DisplayName(
      "Test poisson(int, double); when '1.0000000000000002'; then return '0.9810118431238462'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poisson(int, double)"})
  void testPoisson_when10000000000000002_thenReturn09810118431238462() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9810118431238462d, Probability.poisson(3, 1.0000000000000002d));
  }

  /**
   * Test {@link Probability#poisson(int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poisson(int, double)}
   */
  @Test
  @DisplayName("Test poisson(int, double); when minus one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poisson(int, double)"})
  void testPoisson_whenMinusOne_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.poisson(-1, 0.0d));
  }

  /**
   * Test {@link Probability#poisson(int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.9810118431238462}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poisson(int, double)}
   */
  @Test
  @DisplayName("Test poisson(int, double); when one; then return '0.9810118431238462'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poisson(int, double)"})
  void testPoisson_whenOne_thenReturn09810118431238462() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9810118431238462d, Probability.poisson(3, 1.0d));
  }

  /**
   * Test {@link Probability#poisson(int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poisson(int, double)}
   */
  @Test
  @DisplayName("Test poisson(int, double); when one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poisson(int, double)"})
  void testPoisson_whenOne_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.poisson(200, 1.0d));
  }

  /**
   * Test {@link Probability#poisson(int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.010336050675925726}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poisson(int, double)}
   */
  @Test
  @DisplayName("Test poisson(int, double); when ten; then return '0.010336050675925726'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poisson(int, double)"})
  void testPoisson_whenTen_thenReturn0010336050675925726() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.010336050675925726d, Probability.poisson(3, 10.0d));
  }

  /**
   * Test {@link Probability#poisson(int, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poisson(int, double)}
   */
  @Test
  @DisplayName("Test poisson(int, double); when ten; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poisson(int, double)"})
  void testPoisson_whenTen_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.poisson(200, 10.0d));
  }

  /**
   * Test {@link Probability#poisson(int, double)}.
   *
   * <ul>
   *   <li>When two hundred one.
   *   <li>Then return {@code 0.49062000401379563}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poisson(int, double)}
   */
  @Test
  @DisplayName("Test poisson(int, double); when two hundred one; then return '0.49062000401379563'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poisson(int, double)"})
  void testPoisson_whenTwoHundredOne_thenReturn049062000401379563() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.49062000401379563d, Probability.poisson(200, 201.0d));
  }

  /**
   * Test {@link Probability#poisson(int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poisson(int, double)}
   */
  @Test
  @DisplayName("Test poisson(int, double); when zero; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poisson(int, double)"})
  void testPoisson_whenZero_thenReturnOne() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(1.0d, Probability.poisson(0, 0.0d));
  }

  /**
   * Test {@link Probability#poissonComplemented(int, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poissonComplemented(int, double)}
   */
  @Test
  @DisplayName("Test poissonComplemented(int, double); when '1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poissonComplemented(int, double)"})
  void testPoissonComplemented_when10e10_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.poissonComplemented(-1, 1.0E-10d));
  }

  /**
   * Test {@link Probability#poissonComplemented(int, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poissonComplemented(int, double)}
   */
  @Test
  @DisplayName(
      "Test poissonComplemented(int, double); when '-1.0E-10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poissonComplemented(int, double)"})
  void testPoissonComplemented_when10e10_thenThrowIllegalArgumentException()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Probability.poissonComplemented(-1, -1.0E-10d));
  }

  /**
   * Test {@link Probability#poissonComplemented(int, double)}.
   *
   * <ul>
   *   <li>When four.
   *   <li>Then return {@code 0.5665298796332909}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poissonComplemented(int, double)}
   */
  @Test
  @DisplayName("Test poissonComplemented(int, double); when four; then return '0.5665298796332909'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poissonComplemented(int, double)"})
  void testPoissonComplemented_whenFour_thenReturn05665298796332909() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5665298796332909d, Probability.poissonComplemented(3, 4.0d));
  }

  /**
   * Test {@link Probability#poissonComplemented(int, double)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poissonComplemented(int, double)}
   */
  @Test
  @DisplayName("Test poissonComplemented(int, double); when minus one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poissonComplemented(int, double)"})
  void testPoissonComplemented_whenMinusOne_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.poissonComplemented(-1, 0.0d));
  }

  /**
   * Test {@link Probability#poissonComplemented(int, double)}.
   *
   * <ul>
   *   <li>When minus two.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poissonComplemented(int, double)}
   */
  @Test
  @DisplayName("Test poissonComplemented(int, double); when minus two; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poissonComplemented(int, double)"})
  void testPoissonComplemented_whenMinusTwo_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.poissonComplemented(-2, 0.0d));
  }

  /**
   * Test {@link Probability#poissonComplemented(int, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.01898815687615381}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poissonComplemented(int, double)}
   */
  @Test
  @DisplayName("Test poissonComplemented(int, double); when one; then return '0.01898815687615381'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poissonComplemented(int, double)"})
  void testPoissonComplemented_whenOne_thenReturn001898815687615381() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.01898815687615381d, Probability.poissonComplemented(3, 1.0d));
  }

  /**
   * Test {@link Probability#poissonComplemented(int, double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@code 0.9896639493240743}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poissonComplemented(int, double)}
   */
  @Test
  @DisplayName(
      "Test poissonComplemented(int, double); when three; then return '0.9896639493240743'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poissonComplemented(int, double)"})
  void testPoissonComplemented_whenThree_thenReturn09896639493240743() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9896639493240743d, Probability.poissonComplemented(3, 10.0d));
  }

  /**
   * Test {@link Probability#poissonComplemented(int, double)}.
   *
   * <ul>
   *   <li>When two hundred.
   *   <li>Then return {@code 3.013108890665765E-181}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poissonComplemented(int, double)}
   */
  @Test
  @DisplayName(
      "Test poissonComplemented(int, double); when two hundred; then return '3.013108890665765E-181'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poissonComplemented(int, double)"})
  void testPoissonComplemented_whenTwoHundred_thenReturn3013108890665765e181()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(3.013108890665765E-181d, Probability.poissonComplemented(200, 10.0d));
  }

  /**
   * Test {@link Probability#poissonComplemented(int, double)}.
   *
   * <ul>
   *   <li>When two hundred.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poissonComplemented(int, double)}
   */
  @Test
  @DisplayName("Test poissonComplemented(int, double); when two hundred; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poissonComplemented(int, double)"})
  void testPoissonComplemented_whenTwoHundred_thenReturnZero() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.poissonComplemented(200, 1.0d));
  }

  /**
   * Test {@link Probability#poissonComplemented(int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 0.9999546000702375}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#poissonComplemented(int, double)}
   */
  @Test
  @DisplayName("Test poissonComplemented(int, double); when zero; then return '0.9999546000702375'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.poissonComplemented(int, double)"})
  void testPoissonComplemented_whenZero_thenReturn09999546000702375() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9999546000702375d, Probability.poissonComplemented(0, 10.0d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.6860531971285135}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName("Test studentT(double, double); when '0.5'; then return '0.6860531971285135'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_when05_thenReturn06860531971285135() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.6860531971285135d, Probability.studentT(10.0d, 0.5d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.8986613236143345}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName("Test studentT(double, double); when '0.5'; then return '0.8986613236143345'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_when05_thenReturn08986613236143345() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.8986613236143345d, Probability.studentT(0.5d, 10.0d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When {@code -709.782712893384}.
   *   <li>Then return {@code 3.7912017948556165E-25}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName(
      "Test studentT(double, double); when '-709.782712893384'; then return '3.7912017948556165E-25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_when709782712893384_thenReturn37912017948556165e25()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(3.7912017948556165E-25d, Probability.studentT(10.0d, -709.782712893384d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When {@code 5.551115123125783E-17}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName("Test studentT(double, double); when '5.551115123125783E-17'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_when5551115123125783e17_thenReturn05() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5d, Probability.studentT(5.551115123125783E-17d, 1.1102230246251565E-16d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.09090909090909091}.
   *   <li>Then return {@code 0.6574423714206068}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName(
      "Test studentT(double, double); when '0.09090909090909091'; then return '0.6574423714206068'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_when009090909090909091_thenReturn06574423714206068()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.6574423714206068d, Probability.studentT(0.09090909090909091d, 10.0d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.1102230246251565E-16}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName("Test studentT(double, double); when '1.1102230246251565E-16'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_when11102230246251565e16_thenReturn05() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5d, Probability.studentT(1.1102230246251565E-16d, 1.1102230246251565E-16d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.1102230246251565E-16}.
   *   <li>Then return {@code 0.5000000000000011}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName(
      "Test studentT(double, double); when '1.1102230246251565E-16'; then return '0.5000000000000011'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_when11102230246251565e16_thenReturn05000000000000011()
      throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5000000000000011d, Probability.studentT(1.1102230246251565E-16d, 10.0d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return {@code 0.9999145262121285}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName("Test studentT(double, double); when five; then return '0.9999145262121285'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_whenFive_thenReturn09999145262121285() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9999145262121285d, Probability.studentT(5.0d, 10.0d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName("Test studentT(double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_whenNaN_thenReturnNaN() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.studentT(Double.NaN, 10.0d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName("Test studentT(double, double); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_whenNaN_thenReturnNaN2() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.studentT(10.0d, Double.NaN));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.9999992052234122}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName("Test studentT(double, double); when ten; then return '0.9999992052234122'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_whenTen_thenReturn09999992052234122() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.9999992052234122d, Probability.studentT(10.0d, 10.0d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName("Test studentT(double, double); when zero; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_whenZero_thenReturn05() throws ArithmeticException {
    // Arrange, Act and Assert
    assertEquals(0.5d, Probability.studentT(10.0d, 0.0d));
  }

  /**
   * Test {@link Probability#studentT(double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentT(double, double)}
   */
  @Test
  @DisplayName("Test studentT(double, double); when zero; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentT(double, double)"})
  void testStudentT_whenZero_thenThrowIllegalArgumentException() throws ArithmeticException {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.studentT(0.0d, 10.0d));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 1.000000015321726}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName("Test studentTInverse(double, int); when '0.5'; then return '1.000000015321726'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_when05_thenReturn1000000015321726() {
    // Arrange, Act and Assert
    assertEquals(1.000000015321726d, Probability.studentTInverse(0.5d, 1));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.7648943186665504}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName("Test studentTInverse(double, int); when '0.5'; then return '0.7648943186665504'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_when05_thenReturn07648943186665504() {
    // Arrange, Act and Assert
    assertEquals(0.7648943186665504d, Probability.studentTInverse(0.5d, 3));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When {@code 0.1353352832366127}.
   *   <li>Then return {@code 4.63294341354229}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName(
      "Test studentTInverse(double, int); when '0.1353352832366127'; then return '4.63294341354229'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_when01353352832366127_thenReturn463294341354229() {
    // Arrange, Act and Assert
    assertEquals(4.63294341354229d, Probability.studentTInverse(0.1353352832366127d, 1));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When {@code 0.1353352832366127}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName(
      "Test studentTInverse(double, int); when '0.1353352832366127'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_when01353352832366127_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Probability.studentTInverse(0.1353352832366127d, -1));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When {@code 6.283185307179586}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName(
      "Test studentTInverse(double, int); when '6.283185307179586'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_when6283185307179586_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Probability.studentTInverse(6.283185307179586d, 3));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When {@code 0.8646647167633873}.
   *   <li>Then return {@code 0.17940316935276246}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName(
      "Test studentTInverse(double, int); when '0.8646647167633873'; then return '0.17940316935276246'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_when08646647167633873_thenReturn017940316935276246() {
    // Arrange, Act and Assert
    assertEquals(0.17940316935276246d, Probability.studentTInverse(0.8646647167633873d, 5));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When {@code 0.9999999968801273}.
   *   <li>Then return {@code 6.482136325158577E-9}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName(
      "Test studentTInverse(double, int); when '0.9999999968801273'; then return '6.482136325158577E-9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_when09999999968801273_thenReturn6482136325158577e9() {
    // Arrange, Act and Assert
    assertEquals(6.482136325158577E-9d, Probability.studentTInverse(0.9999999968801273d, 1));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return {@code 0.7266874113339133}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName("Test studentTInverse(double, int); when five; then return '0.7266874113339133'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_whenFive_thenReturn07266874113339133() {
    // Arrange, Act and Assert
    assertEquals(0.7266874113339133d, Probability.studentTInverse(0.5d, 5));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When five.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName("Test studentTInverse(double, int); when five; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_whenFive_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.studentTInverse(1.0d, 5));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When minus four.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName(
      "Test studentTInverse(double, int); when minus four; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_whenMinusFour_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.studentTInverse(-4.0d, 3));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName(
      "Test studentTInverse(double, int); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.studentTInverse(1.0d, -1));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName("Test studentTInverse(double, int); when NaN; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_whenNaN_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, Probability.studentTInverse(Double.NaN, 3));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName("Test studentTInverse(double, int); when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.studentTInverse(10.0d, 3));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName("Test studentTInverse(double, int); when three; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_whenThree_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.studentTInverse(1.0d, 3));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When two hundred.
   *   <li>Then return {@code 0.6757183376765118}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName(
      "Test studentTInverse(double, int); when two hundred; then return '0.6757183376765118'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_whenTwoHundred_thenReturn06757183376765118() {
    // Arrange, Act and Assert
    assertEquals(0.6757183376765118d, Probability.studentTInverse(0.5d, 200));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When two hundred.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName("Test studentTInverse(double, int); when two hundred; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_whenTwoHundred_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, Probability.studentTInverse(1.0d, 200));
  }

  /**
   * Test {@link Probability#studentTInverse(double, int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Probability#studentTInverse(double, int)}
   */
  @Test
  @DisplayName("Test studentTInverse(double, int); when two; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Probability.studentTInverse(double, int)"})
  void testStudentTInverse_whenTwo_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Probability.studentTInverse(2.0d, 3));
  }
}
