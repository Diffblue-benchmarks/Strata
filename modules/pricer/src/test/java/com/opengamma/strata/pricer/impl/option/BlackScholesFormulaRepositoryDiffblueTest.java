package com.opengamma.strata.pricer.impl.option;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BlackScholesFormulaRepositoryDiffblueTest {
  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 9.999731955863117}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '0.5'; then return '9.999731955863117'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when05_thenReturn9999731955863117() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 10.0d, 0.5d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(9.999731955863117d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 1.0000000000000002E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E13'; then return '1.0000000000000002E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturn10000000000000002e13() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0000000000000002E13d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 1.2615667611003008E-5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '1.2615667611003008E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturn12615667611003008e5() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.2615667611003008E-5d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E-13'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturnTen() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(10.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturnZero4() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 1.0E-13d, 10.0d, 10.0d, 1.0E13d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturnZero5() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return {@code 1.0E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E14'; then return '1.0E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e14_thenReturn10e14() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(1.0E14d, 1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0E14d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return {@code 1.0000000000000002E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E14'; then return '1.0000000000000002E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e14_thenReturn10000000000000002e14() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0000000000000002E14d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E14'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e14_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d, true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E26}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0E26'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10e26_thenReturnZero() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(1.0E13d, 10.0d, 1.0E26d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 1.0000000000000002E13d, false);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_whenFalse_thenReturnZero() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return {@code 1.3838965267367375E-74}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when minus ten; then return '1.3838965267367375E-74'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_whenMinusTen_thenReturn13838965267367375e74() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, -10.0d, true);

    // Assert
    assertEquals(1.3838965267367375E-74d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_whenNegative_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, true);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_whenNegative_infinity_thenReturnZero2() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, false);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when 'true'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_whenTrue_thenReturnTen() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(10.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 2.6881171418161355E44}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when zero; then return '2.6881171418161355E44'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_whenZero_thenReturn26881171418161355e44() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(2.6881171418161355E44d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when zero; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_whenZero_thenReturnTen() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 10.0d, 10.0d, 0.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(10.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when zero; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_whenZero_thenReturnTen2() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 10.0d, 1.0E13d, 0.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(10.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#price(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#price(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, double, boolean); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.price(double, double, double, double, double, double, boolean)"
  })
  void testPrice_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualPriceResult =
        BlackScholesFormulaRepository.price(10.0d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 0.5000007569397567}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '0.5000007569397567'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturn05000007569397567() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(10.0d, 10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.5000007569397567d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnMinusOne() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(-1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E13'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnOne() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnOne2() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E13'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnOne3() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E13'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnOne4() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(1.0E13d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E14'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e14_thenReturnOne() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E14'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e14_thenReturnOne2() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(
            1.0E14d, 1.0000000000000002E13d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10e14_thenReturnZero() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d, false);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0000000000000002E13'; then return '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10000000000000002e13_thenReturn05() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 1.0000000000000002E13d, false);

    // Assert
    assertEquals(-0.5d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_whenFalse_thenReturnZero() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return {@code 1.3838965267367376E-87}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when minus ten; then return '1.3838965267367376E-87'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_whenMinusTen_thenReturn13838965267367376e87() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, -10.0d, true);

    // Assert
    assertEquals(1.3838965267367376E-87d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_whenNegative_infinity_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, false);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_whenNegative_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, true);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.9999999990134123}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when one; then return '0.9999999990134123'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_whenOne_thenReturn09999999990134123() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(10.0d, 10.0d, 1.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.9999999990134123d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when one; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_whenOne_thenReturnZero() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(1.0d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when 'true'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_whenTrue_thenReturnOne() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#delta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#delta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, double, double, boolean); when zero; then return '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.delta(double, double, double, double, double, double, boolean)"
  })
  void testDelta_whenZero_thenReturn05() {
    // Arrange and Act
    double actualDeltaResult =
        BlackScholesFormulaRepository.delta(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 0.0d, false);

    // Assert
    assertEquals(-0.5d, actualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#strikeForDelta(double, double, double, double,
   * double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 3.7730203009303687E261}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#strikeForDelta(double, double,
   * double, double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test strikeForDelta(double, double, double, double, double, double, boolean); when '0.5'; then return '3.7730203009303687E261'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.strikeForDelta(double, double, double, double, double, double, boolean)"
  })
  void testStrikeForDelta_when05_thenReturn37730203009303687e261() {
    // Arrange and Act
    double actualStrikeForDeltaResult =
        BlackScholesFormulaRepository.strikeForDelta(10.0d, 0.5d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(3.7730203009303687E261d, actualStrikeForDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#strikeForDelta(double, double, double, double,
   * double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#strikeForDelta(double, double,
   * double, double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test strikeForDelta(double, double, double, double, double, double, boolean); when '0.5'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.strikeForDelta(double, double, double, double, double, double, boolean)"
  })
  void testStrikeForDelta_when05_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualStrikeForDeltaResult =
        BlackScholesFormulaRepository.strikeForDelta(10.0d, 0.5d, 10.0d, 10.0d, 0.5d, 10.0d, true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualStrikeForDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#strikeForDelta(double, double, double, double,
   * double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code 1.0000000009999938E-10}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#strikeForDelta(double, double,
   * double, double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test strikeForDelta(double, double, double, double, double, double, boolean); when '-1.0E-10'; then return '1.0000000009999938E-10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.strikeForDelta(double, double, double, double, double, double, boolean)"
  })
  void testStrikeForDelta_when10e10_thenReturn10000000009999938e10() {
    // Arrange and Act
    double actualStrikeForDeltaResult =
        BlackScholesFormulaRepository.strikeForDelta(
            1.0E-10d, -1.0E-10d, 1.0E-10d, 1.0E-10d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(1.0000000009999938E-10d, actualStrikeForDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#strikeForDelta(double, double, double, double,
   * double, double, boolean)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return {@code 1.0000000010000061E-10}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#strikeForDelta(double, double,
   * double, double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test strikeForDelta(double, double, double, double, double, double, boolean); when minus one; then return '1.0000000010000061E-10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.strikeForDelta(double, double, double, double, double, double, boolean)"
  })
  void testStrikeForDelta_whenMinusOne_thenReturn10000000010000061e10() {
    // Arrange and Act
    double actualStrikeForDeltaResult =
        BlackScholesFormulaRepository.strikeForDelta(
            1.0E-10d, -1.0d, 1.0E-10d, 1.0E-10d, 1.0E-10d, 10.0d, false);

    // Assert
    assertEquals(1.0000000010000061E-10d, actualStrikeForDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code -1.575916518903227E-5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '0.5'; then return '-1.575916518903227E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when05_thenReturn1575916518903227e5() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(10.0d, 10.0d, 0.5d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-1.575916518903227E-5d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.006722187833896435}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '0.5'; then return '0.006722187833896435'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when05_thenReturn0006722187833896435() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(10.0d, 10.0d, 0.5d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.006722187833896435d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E-12'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e12_thenReturnZero() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(1.0E-12d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E13'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturn05() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 0.0d, false);

    // Assert
    assertEquals(0.5d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -3.720075976020836E-44}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '-3.720075976020836E-44'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturn3720075976020836e44() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-3.720075976020836E-44d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -3.720075976020836E-44}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '-3.720075976020836E-44'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturn3720075976020836e442() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(10.0d, 10.0d, 10.0d, 1.0E-13d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-3.720075976020836E-44d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 3.720075976020836E-44}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '3.720075976020836E-44'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturn3720075976020836e443() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(3.720075976020836E-44d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.4999994953729956}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '-0.4999994953729956'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturn04999994953729956() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(10.0d, 10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-0.4999994953729956d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E13'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnMinusOne() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-1.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(1.0E13d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnZero4() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnZero5() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e14_thenReturnZero() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10e14_thenReturnZero2() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(10.0d, 10.0d, 1.0E14d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 9.999999999999E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '9.999999999999E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when9999999999999e13_thenReturnZero() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(
            1.0E14d, 9.999999999999E13d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when minus ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_whenMinusTen_thenReturnZero() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, -10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_whenNegative_infinity_thenReturnMinusOne() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(
            1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, true);

    // Assert
    assertEquals(-1.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_whenNegative_infinity_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_whenNegative_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, false);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when 'true'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_whenTrue_thenReturnZero() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualDelta(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualDelta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, double, double, boolean); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualDelta(double, double, double, double, double, double, boolean)"
  })
  void testDualDelta_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackScholesFormulaRepository.dualDelta(10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '-1.0E-10'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10e10_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, -1.0E-10d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0E-13'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10e13_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(0.0d, 0.0d, 0.0d, 1.0E-13d, 1.0E13d, 0.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10e13_thenReturnZero4() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(10.0d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10e14_thenReturnZero() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10e14_thenReturnZero2() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10e14_thenReturnZero3() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(
            1.0E14d, 1.0000000000000002E13d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10000000000000002e13_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10000000000000002e13_thenReturnPositive_infinity2() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 0.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(
            1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when minus ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_whenMinusTen_thenReturnZero() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, -10.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_whenNegative_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when zero; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_whenZero_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 0.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when zero; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_whenZero_thenReturnPositive_infinity2() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(0.0d, 0.0d, 1.0E13d, 0.0d, 1.0E13d, 0.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#gamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#gamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.gamma(double, double, double, double, double, double)"
  })
  void testGamma_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualGammaResult =
        BlackScholesFormulaRepository.gamma(1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '-1.0E-10'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10e10_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, -1.0E-10d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0E-13'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10e13_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(0.0d, 0.0d, 0.0d, 1.0E-13d, 1.0E13d, 0.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10e13_thenReturnZero4() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(10.0d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10e13_thenReturnZero5() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10e14_thenReturnZero() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10e14_thenReturnZero2() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(10.0d, 10.0d, 1.0E14d, 10.0d, 0.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10e14_thenReturnZero3() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 1.0E14d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10000000000000002e13_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 0.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(
            1.0E14d, 1.0000000000000002E13d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when minus ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_whenMinusTen_thenReturnZero() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, -10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_whenNegative_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(
            1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when POSITIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_whenPositive_infinity_thenReturnZero() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when zero; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_whenZero_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 0.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualGamma(double, double, double, double, double, double)"
  })
  void testDualGamma_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackScholesFormulaRepository.dualGamma(10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '-1.0E-10'; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10e10_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, -1.0E-10d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0E-13'; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10e13_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(0.0d, 0.0d, 0.0d, 1.0E-13d, 1.0E13d, 0.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10e13_thenReturnZero4() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(10.0d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10e13_thenReturnZero5() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10e14_thenReturnZero() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10e14_thenReturnZero2() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(10.0d, 10.0d, 1.0E14d, 10.0d, 0.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10e14_thenReturnZero3() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 1.0E14d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10000000000000002e13_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 0.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(
            1.0E14d, 1.0000000000000002E13d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when minus ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_whenMinusTen_thenReturnZero() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, -10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_whenNegative_infinity_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(
            1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when POSITIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_whenPositive_infinity_thenReturnZero() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when zero; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_whenZero_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 0.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#crossGamma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#crossGamma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.crossGamma(double, double, double, double, double, double)"
  })
  void testCrossGamma_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackScholesFormulaRepository.crossGamma(10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code -0.005057242817571916}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '0.5'; then return '-0.005057242817571916'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when05_thenReturn0005057242817571916() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 0.5d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-0.005057242817571916d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e13_thenReturn00() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 3.720075976020836E-30}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E13'; then return '3.720075976020836E-30'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e13_thenReturn3720075976020836e30() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d, true);

    // Assert
    assertEquals(3.720075976020836E-30d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -2.2303286755854332E-57}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '-2.2303286755854332E-57'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e13_thenReturn22303286755854332e57() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 10.0d, 1.0E-13d, 10.0d, 0.0d, true);

    // Assert
    assertEquals(-2.2303286755854332E-57d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -6.3078363050340004E7}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '-6.3078363050340004E7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e13_thenReturn63078363050340004e7() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-6.3078363050340004E7d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return minus one hundred.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E13'; then return minus one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e13_thenReturnMinusOneHundred() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-100.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 1.0E-13d, 10.0d, 10.0d, 1.0E13d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E14'; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e14_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d, true);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E14'; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e14_thenReturnNegative_infinity2() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 1.0E14d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E14'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e14_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(1.0E14d, 1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e14_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e14_thenReturnZero2() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E26}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when '1.0E26'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_when10e26_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(1.0E13d, 10.0d, 1.0E26d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code 3.720075976020836E-42}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when 'false'; then return '3.720075976020836E-42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenFalse_thenReturn3720075976020836e42() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(3.720075976020836E-42d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenFalse_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenFalse_thenReturnZero2() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenFalse_thenReturnZero3() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d, false);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, true);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenNegative_infinity_thenReturnZero2() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, false);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when 'true'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenTrue_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 3.720075976020836E-42}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when zero; then return '3.720075976020836E-42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenZero_thenReturn3720075976020836e42() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d, true);

    // Assert
    assertEquals(3.720075976020836E-42d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code -84.25545996911387}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when zero; then return '-84.25545996911387'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenZero_thenReturn8425545996911387() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 0.0d, 0.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-84.25545996911387d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code -2.6881171418161354E45}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when zero; then return '-2.6881171418161354E45'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenZero_thenReturn26881171418161354e45() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(-2.6881171418161354E45d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when zero; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenZero_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#theta(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#theta(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, double, double, boolean); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.theta(double, double, double, double, double, double, boolean)"
  })
  void testTheta_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult =
        BlackScholesFormulaRepository.theta(10.0d, 10.0d, 10.0d, 0.0d, 10.0d, 0.0d, true);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code -8.413447460769564}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when '-1.0E-10'; then return '-8.413447460769564'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_when10e10_thenReturn8413447460769564() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(0.0d, 0.0d, 0.0d, 0.0d, 10.0d, -1.0E-10d, false);

    // Assert
    assertEquals(-8.413447460769564d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_when10e13_thenReturn00() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-0.0d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_when10e13_thenReturn002() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(1.0E-13d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-0.0d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return minus ten.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when '1.0E13'; then return minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_when10e13_thenReturnMinusTen() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(0.0d, 1.0E13d, 0.0d, 0.0d, 10.0d, 0.0d, false);

    // Assert
    assertEquals(-10.0d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(10.0d, 10.0d, 10.0d, 10.0d, 1.0E13d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601673797E13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when '3.1622776601673797E13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_when31622776601673797e13_thenReturn00() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(
            3.1622776601683797E13d, 3.1622776601673797E13d, 10.0d, 1.0E13d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-0.0d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when '3.1622776601683797E13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_when31622776601683797e13_thenReturn00() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(
            3.1622776601683797E13d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-0.0d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code -5.199471140200717}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when 'false'; then return '-5.199471140200717'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_whenFalse_thenReturn5199471140200717() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(0.0d, 0.0d, 0.0d, 0.0d, 10.0d, 0.0d, false);

    // Assert
    assertEquals(-5.199471140200717d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return {@code 1.6847508040319229E-4}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when minus one; then return '1.6847508040319229E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_whenMinusOne_thenReturn16847508040319229e4() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(1.0E-13d, 10.0d, 1.0d, 10.0d, 10.0d, -1.0d, true);

    // Assert
    assertEquals(1.6847508040319229E-4d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_whenNegative_infinity_thenReturn00() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(
            0.0d, 10.0d, 0.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(-0.0d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(
            0.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code -1.822764854946986E-8}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when one; then return '-1.822764854946986E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_whenOne_thenReturn1822764854946986e8() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(10.0d, 10.0d, 1.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-1.822764854946986E-8d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code -0.03898947309435042}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when one; then return '-0.03898947309435042'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_whenOne_thenReturn003898947309435042() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(1.0E-13d, 10.0d, 1.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-0.03898947309435042d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when POSITIVE_INFINITY; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_whenPositive_infinity_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(
            0.0d, 10.0d, Double.POSITIVE_INFINITY, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when POSITIVE_INFINITY; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_whenPositive_infinity_thenReturnNegative_infinity2() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(
            0.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, true);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when 'true'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_whenTrue_thenReturn00() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-0.0d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#charm(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#charm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test charm(double, double, double, double, double, double, boolean); when zero; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.charm(double, double, double, double, double, double, boolean)"
  })
  void testCharm_whenZero_thenReturn00() {
    // Arrange and Act
    double actualCharmResult =
        BlackScholesFormulaRepository.charm(0.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-0.0d, actualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code -2.968447038370705E-4}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when '0.5'; then return '-2.968447038370705E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_when05_thenReturn2968447038370705e4() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(10.0d, 10.0d, 0.5d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-2.968447038370705E-4d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code -0.06900778057067992}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when '0.5'; then return '-0.06900778057067992'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_when05_thenReturn006900778057067992() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(10.0d, 1.0E-13d, 0.5d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-0.06900778057067992d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -9.99999999999}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '-9.99999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_when10e13_thenReturn999999999999() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            10.0d, 1.0E-13d, 1.0E-13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-9.99999999999d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -2523137.522010572}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '-2523137.522010572'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_when10e13_thenReturn2523137522010572() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(10.0d, 10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-2523137.522010572d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(10.0d, 10.0d, 10.0d, 10.0d, 1.0E-13d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            1.0E-13d, 10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            1.0E-13d, 10.0d, 1.0E-13d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 3.720075976020836E-44}.
   *   <li>Then return {@code 2.0683982467844424E20}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when '3.720075976020836E-44'; then return '2.0683982467844424E20'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_when3720075976020836e44_thenReturn20683982467844424e20() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            10.0d, 10.0d, 3.720075976020836E-44d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(2.0683982467844424E20d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 3.720075976020836E-44}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when '3.720075976020836E-44'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_when3720075976020836e44_thenReturnZero() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            3.720075976020836E-44d, 10.0d, 3.720075976020836E-44d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 3.720075976020836E-44}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when '3.720075976020836E-44'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_when3720075976020836e44_thenReturnZero2() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            3.720075976020836E-44d,
            10.0d,
            3.720075976020836E-44d,
            10.0d,
            10.0d,
            Double.NEGATIVE_INFINITY,
            true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code -2523127.522010572}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when 'false'; then return '-2523127.522010572'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenFalse_thenReturn2523127522010572() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(10.0d, 10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(-2523127.522010572d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when POSITIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenPositive_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            Double.POSITIVE_INFINITY, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when POSITIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenPositive_infinity_thenReturnPositive_infinity2() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            10.0d,
            10.0d,
            Double.POSITIVE_INFINITY,
            10.0d,
            Double.NEGATIVE_INFINITY,
            Double.POSITIVE_INFINITY,
            true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when POSITIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenPositive_infinity_thenReturnZero() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            10.0d, 10.0d, Double.POSITIVE_INFINITY, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when POSITIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenPositive_infinity_thenReturnZero2() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            Double.POSITIVE_INFINITY,
            Double.POSITIVE_INFINITY,
            10.0d,
            10.0d,
            Double.NEGATIVE_INFINITY,
            10.0d,
            true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when POSITIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenPositive_infinity_thenReturnZero3() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            Double.POSITIVE_INFINITY,
            10.0d,
            Double.POSITIVE_INFINITY,
            10.0d,
            Double.NEGATIVE_INFINITY,
            10.0d,
            true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when POSITIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenPositive_infinity_thenReturnZero4() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            Double.POSITIVE_INFINITY,
            10.0d,
            10.0d,
            10.0d,
            Double.NEGATIVE_INFINITY,
            Double.NEGATIVE_INFINITY,
            true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when POSITIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenPositive_infinity_thenReturnZero5() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            10.0d,
            10.0d,
            Double.POSITIVE_INFINITY,
            10.0d,
            Double.NEGATIVE_INFINITY,
            Double.NEGATIVE_INFINITY,
            true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when 'true'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenTrue_thenReturnZero() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when zero; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenZero_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            10.0d, 10.0d, 0.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when zero; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenZero_thenReturnPositive_infinity2() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            Double.POSITIVE_INFINITY, 10.0d, 0.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualCharm(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualCharm(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test dualCharm(double, double, double, double, double, double, boolean); when zero; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualCharm(double, double, double, double, double, double, boolean)"
  })
  void testDualCharm_whenZero_thenReturnPositive_infinity3() {
    // Arrange and Act
    double actualDualCharmResult =
        BlackScholesFormulaRepository.dualCharm(
            10.0d, 10.0d, Double.POSITIVE_INFINITY, 0.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualCharmResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '-1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10e10_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, -1.0E-10d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 1.269943259167025E-14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0E-13'; then return '1.269943259167025E-14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10e13_thenReturn1269943259167025e14() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(1.269943259167025E-14d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 0.0020127244262657003}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0E-13'; then return '0.0020127244262657003'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10e13_thenReturn00020127244262657003() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0020127244262657003d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(0.0d, 0.0d, 0.0d, 1.0E-13d, 1.0E13d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10e13_thenReturnZero4() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(1.0E13d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10e13_thenReturnZero5() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(
            1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10000000000000002e13_thenReturnZero3() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10000000000000002e13_thenReturnZero4() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(
            1.0000000000000002E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_when10000000000000002e13_thenReturnZero5() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(
            1.0E13d, 10.0d, 0.0d, 10.0d, 10.0d, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when minus ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_whenMinusTen_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, -10.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_whenNegative_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_whenNegative_infinity_thenReturnZero2() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(
            10.0d, 10.0d, 0.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when POSITIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_whenPositive_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(
            Double.POSITIVE_INFINITY,
            10.0d,
            10.0d,
            10.0d,
            Double.NEGATIVE_INFINITY,
            Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when POSITIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_whenPositive_infinity_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vega(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vega(double, double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vega(double, double, double, double, double, double)"
  })
  void testVega_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult =
        BlackScholesFormulaRepository.vega(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '-1.0E-10'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10e10_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, -1.0E-10d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code -0.3989422804014327}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0E13'; then return '-0.3989422804014327'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10e13_thenReturn03989422804014327() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 0.0d);

    // Assert
    assertEquals(-0.3989422804014327d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(1.0E-13d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(1.0E-13d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10e13_thenReturnZero4() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10e13_thenReturnZero5() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            1.0E-13d, 10.0d, 0.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10e13_thenReturnZero6() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            1.0E-13d, 0.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10e13_thenReturnZero7() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            1.0E-13d, 10.0d, 10.0d, 0.0d, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0000000000000002E13'; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10000000000000002e13_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0000000000000002E13'; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10000000000000002e13_thenReturnNegative_infinity2() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            1.0000000000000002E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_when10000000000000002e13_thenReturnZero3() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_whenNegative_infinity_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            10.0d, 0.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_whenNegative_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when POSITIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_whenPositive_infinity_thenReturnZero() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(
            1.0E-13d, 10.0d, 0.0d, Double.POSITIVE_INFINITY, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vanna(double, double, double, double, double, double)"
  })
  void testVanna_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualVannaResult =
        BlackScholesFormulaRepository.vanna(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when '-1.0E-10'; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_when10e10_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(0.0d, 0.0d, 0.0d, 0.0d, 10.0d, -1.0E-10d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(0.0d, 0.0d, 0.0d, 1.0E13d, 10.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(0.0d, 1.0E13d, 0.0d, 0.0d, 10.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_when10e13_thenReturnZero4() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(1.0E-13d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601673797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when '3.1622776601673797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_when31622776601673797e13_thenReturnZero() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(
            3.1622776601683797E13d, 3.1622776601673797E13d, 10.0d, 1.0E13d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when '3.1622776601683797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_when31622776601683797e13_thenReturnZero() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(
            3.1622776601683797E13d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(
            1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_whenNegative_infinity_thenReturnZero2() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(
            1.0E-13d, 0.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_whenNegative_infinity_thenReturnZero3() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(
            1.0E-13d, 10.0d, 0.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_whenNegative_infinity_thenReturnZero4() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(
            1.0E-13d, 10.0d, 10.0d, 0.0d, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_whenNegative_infinity_thenReturnZero5() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(
            1.0E-13d, 0.0d, 10.0d, 0.0d, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when POSITIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_whenPositive_infinity_thenReturnZero() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(
            1.0E-13d, 10.0d, 0.0d, Double.POSITIVE_INFINITY, 10.0d, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when POSITIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_whenPositive_infinity_thenReturnZero2() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(
            1.0E-13d, 10.0d, 0.0d, 10.0d, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#dualVanna(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 0.3989422804014327}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#dualVanna(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double, double, double); when zero; then return '0.3989422804014327'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.dualVanna(double, double, double, double, double, double)"
  })
  void testDualVanna_whenZero_thenReturn03989422804014327() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackScholesFormulaRepository.dualVanna(0.0d, 0.0d, 0.0d, 0.0d, 10.0d, 0.0d);

    // Assert
    assertEquals(0.3989422804014327d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -3.0277590264187425E-19}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E-13'; then return '-3.0277590264187425E-19'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e13_thenReturn30277590264187425e19() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(10.0d, 10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-3.0277590264187425E-19d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E-13'; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e13_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(
            10.0d, 10.0d, 10.0d, 1.0E-13d, Double.NEGATIVE_INFINITY, 10.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e13_thenReturnZero4() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(10.0d, 10.0d, 10.0d, 10.0d, 1.0E13d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e13_thenReturnZero5() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(1.0E13d, 10.0d, 10.0d, 0.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e14_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e14_thenReturnZero2() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e14_thenReturnZero3() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e14_thenReturnZero4() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(1.0E13d, 10.0d, 10.0d, 1.0E14d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e14_thenReturnZero5() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d, 1.0E14d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E27}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E27'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e27_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(1.0E14d, 1.0E27d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E27}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0E27'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10e27_thenReturnZero2() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(1.0E14d, 10.0d, 1.0E27d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_whenNegative_infinity_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 1.4840955931403378E-43}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when zero; then return '1.4840955931403378E-43'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_whenZero_thenReturn14840955931403378e43() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(10.0d, 10.0d, 10.0d, 0.0d, 10.0d, 0.0d);

    // Assert
    assertEquals(1.4840955931403378E-43d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_whenZero_thenReturnZero2() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vomma(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vomma(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vomma(double, double, double, double, double, double)"
  })
  void testVomma_whenZero_thenReturnZero3() {
    // Arrange and Act
    double actualVommaResult =
        BlackScholesFormulaRepository.vomma(10.0d, 10.0d, 10.0d, 0.0d, 1.0E13d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -6307831.305016339}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E-13'; then return '-6307831.305016339'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e13_thenReturn6307831305016339() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(10.0d, 10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-6307831.305016339d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e13_thenReturnZero4() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e13_thenReturnZero5() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(10.0d, 10.0d, 10.0d, 10.0d, 1.0E13d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e13_thenReturnZero6() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(1.0E13d, 10.0d, 10.0d, 0.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e13_thenReturnZero7() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(10.0d, 10.0d, 10.0d, 0.0d, 1.0E13d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e14_thenReturnZero() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e14_thenReturnZero2() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e14_thenReturnZero3() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e14_thenReturnZero4() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(1.0E13d, 10.0d, 10.0d, 1.0E14d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e14_thenReturnZero5() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d, 1.0E14d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E27}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E27'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e27_thenReturnZero() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(1.0E14d, 1.0E27d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E27}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0E27'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10e27_thenReturnZero2() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(1.0E14d, 10.0d, 1.0E27d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_whenNegative_infinity_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_whenNegative_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(
            10.0d, 10.0d, 10.0d, 0.0d, Double.NEGATIVE_INFINITY, 10.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 4.669656728043321E-42}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when zero; then return '4.669656728043321E-42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_whenZero_thenReturn4669656728043321e42() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(10.0d, 10.0d, 10.0d, 0.0d, 10.0d, 0.0d);

    // Assert
    assertEquals(4.669656728043321E-42d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#vegaBleed(double, double, double, double, double,
   * double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#vegaBleed(double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vegaBleed(double, double, double, double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.vegaBleed(double, double, double, double, double, double)"
  })
  void testVegaBleed_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualVegaBleedResult =
        BlackScholesFormulaRepository.vegaBleed(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVegaBleedResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code -0.03361093916948218}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '0.5'; then return '-0.03361093916948218'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when05_thenReturn003361093916948218() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(10.0d, 10.0d, 0.5d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(-0.03361093916948218d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 7.879582594516134E-5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '0.5'; then return '7.879582594516134E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when05_thenReturn7879582594516134e5() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(10.0d, 10.0d, 0.5d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(7.879582594516134E-5d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '-1.0E-10'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e10_thenReturn00() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(0.0d, 0.0d, 1.0E13d, 0.0d, 1.0E13d, -1.0E-10d, false);

    // Assert
    assertEquals(-0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 3.720075976020836E-42}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0E13'; then return '3.720075976020836E-42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e13_thenReturn3720075976020836e42() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(1.0E13d, 10.0d, 10.0d, 0.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(3.720075976020836E-42d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -3.720075976020836E-42}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '-3.720075976020836E-42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e13_thenReturn3720075976020836e422() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(-3.720075976020836E-42d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 4.999994953729956E-13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '4.999994953729956E-13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e13_thenReturn4999994953729956e13() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(10.0d, 10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(4.999994953729956E-13d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 3.7200759760208366E-56}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '3.7200759760208366E-56'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e13_thenReturn37200759760208366e56() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(3.7200759760208366E-56d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(1.0E13d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e14_thenReturnZero() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e14_thenReturnZero2() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(10.0d, 10.0d, 1.0E14d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e14_thenReturnZero3() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(10.0d, 10.0d, 1.0E14d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E27}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0E27'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10e27_thenReturnZero() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(1.0E14d, 1.0E27d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when 'false'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_whenFalse_thenReturn00() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(0.0d, 0.0d, 1.0E13d, 0.0d, 1.0E13d, 0.0d, false);

    // Assert
    assertEquals(-0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_whenFalse_thenReturnZero() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_whenFalse_thenReturnZero2() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(1.0E13d, 10.0d, 10.0d, 0.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when minus ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_whenMinusTen_thenReturnZero() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, -10.0d, true);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when minus ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_whenMinusTen_thenReturnZero2() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(1.0E13d, 10.0d, 10.0d, 0.0d, 10.0d, -10.0d, true);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_whenNegative_infinity_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, false);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_whenNegative_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when 'true'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_whenTrue_thenReturnZero() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#rho(double, double, double, double, double, double,
   * boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#rho(double, double, double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test rho(double, double, double, double, double, double, boolean); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.rho(double, double, double, double, double, double, boolean)"
  })
  void testRho_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualRhoResult =
        BlackScholesFormulaRepository.rho(10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 1.0E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0E13'; then return '1.0E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10e13_thenReturn10e14() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0E14d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 1.0E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0E13'; then return '1.0E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10e13_thenReturn10e142() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(1.0E13d, 10.0d, 10.0d, 1.0E13d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0E14d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 5.000007569397567E-13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0E-13'; then return '5.000007569397567E-13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10e13_thenReturn5000007569397567e13() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(10.0d, 10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(5.000007569397567E-13d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return one hundred.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0E-13'; then return one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10e13_thenReturnOneHundred() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(100.0d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(10.0d, 1.0E-13d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return {@code 1.0E15}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0E14'; then return '1.0E15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10e14_thenReturn10e15() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(1.0E14d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0E15d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return {@code 1.0E15}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0E14'; then return '1.0E15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10e14_thenReturn10e152() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(10.0d, 10.0d, 1.0E14d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0E15d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0E14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10e14_thenReturnZero() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0E14d, false);

    // Assert
    assertEquals(0.0d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E27}.
   *   <li>Then return {@code 1.0E15}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0E27'; then return '1.0E15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10e27_thenReturn10e15() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(1.0E14d, 1.0E27d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0E15d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0000000000000002E13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10000000000000002e13_thenReturn00() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 1.0000000000000002E13d, false);

    // Assert
    assertEquals(-0.0d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(
            0.0d, 0.0d, 0.0d, 0.0d, 1.0000000000000002E13d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_whenFalse_thenReturnZero() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return {@code 1.3838965267367375E-73}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when minus ten; then return '1.3838965267367375E-73'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_whenMinusTen_thenReturn13838965267367375e73() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(1.0E13d, 10.0d, 10.0d, 10.0d, 10.0d, -10.0d, true);

    // Assert
    assertEquals(1.3838965267367375E-73d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When minus ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when minus ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_whenMinusTen_thenReturnZero() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(1.0E13d, 10.0d, 10.0d, 0.0d, 10.0d, -10.0d, true);

    // Assert
    assertEquals(0.0d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_whenNegative_infinity_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, false);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_whenNegative_infinity_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, 10.0d, true);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@link Double#NEGATIVE_INFINITY}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when NEGATIVE_INFINITY; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_whenNegative_infinity_thenReturnZero() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(
            10.0d, 10.0d, 10.0d, 10.0d, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, true);

    // Assert
    assertEquals(0.0d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 9.999999990134123}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when one; then return '9.999999990134123'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_whenOne_thenReturn9999999990134123() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(10.0d, 10.0d, 1.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(9.999999990134123d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return one hundred.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when 'true'; then return one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_whenTrue_thenReturnOneHundred() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(100.0d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when zero; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_whenZero_thenReturn00() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(0.0d, 0.0d, 0.0d, 0.0d, 1.0E13d, 0.0d, false);

    // Assert
    assertEquals(-0.0d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 1.0E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when zero; then return '1.0E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_whenZero_thenReturn10e14() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(1.0E13d, 10.0d, 10.0d, 0.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0E14d, actualCarryRhoResult);
  }

  /**
   * Test {@link BlackScholesFormulaRepository#carryRho(double, double, double, double, double,
   * double, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackScholesFormulaRepository#carryRho(double, double, double,
   * double, double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test carryRho(double, double, double, double, double, double, boolean); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackScholesFormulaRepository.carryRho(double, double, double, double, double, double, boolean)"
  })
  void testCarryRho_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualCarryRhoResult =
        BlackScholesFormulaRepository.carryRho(1.0E13d, 10.0d, 10.0d, 0.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualCarryRhoResult);
  }
}
