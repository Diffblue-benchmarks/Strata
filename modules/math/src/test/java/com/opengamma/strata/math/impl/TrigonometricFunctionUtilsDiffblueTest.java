package com.opengamma.strata.math.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TrigonometricFunctionUtilsDiffblueTest {
  /**
   * Test {@link TrigonometricFunctionUtils#acos(double)} with {@code x}.
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acos(double)}
   */
  @Test
  @DisplayName("Test acos(double) with 'x'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.acos(double)"})
  void testAcosWithX() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, TrigonometricFunctionUtils.acos(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#acos(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>Then return Imaginary is {@code -2.993222846126381}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acos(ComplexNumber)}
   */
  @Test
  @DisplayName("Test acos(ComplexNumber) with 'z'; then return Imaginary is '-2.993222846126381'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.acos(ComplexNumber)"})
  void testAcosWithZ_thenReturnImaginaryIs2993222846126381() {
    // Arrange and Act
    ComplexNumber actualAcosResult = TrigonometricFunctionUtils.acos(new ComplexNumber(10.0d));

    // Assert
    assertEquals(-2.993222846126381d, actualAcosResult.getImaginary());
    assertEquals(0.0d, actualAcosResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#acos(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>Then return Imaginary is {@code -1.0612750619050357}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acos(ComplexNumber)}
   */
  @Test
  @DisplayName("Test acos(ComplexNumber) with 'z'; then return Imaginary is '-1.0612750619050357'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.acos(ComplexNumber)"})
  void testAcosWithZ_thenReturnImaginaryIs10612750619050357() {
    // Arrange and Act
    ComplexNumber actualAcosResult = TrigonometricFunctionUtils.acos(new ComplexNumber(1.0d, 1.0d));

    // Assert
    assertEquals(-1.0612750619050357d, actualAcosResult.getImaginary());
    assertEquals(0.9045568943023814d, actualAcosResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#acos(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is {@link Double#NaN}.
   *   <li>Then return Imaginary is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acos(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test acos(ComplexNumber) with 'z'; when ComplexNumber(double) with real is NaN; then return Imaginary is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.acos(ComplexNumber)"})
  void testAcosWithZ_whenComplexNumberWithRealIsNaN_thenReturnImaginaryIsNaN() {
    // Arrange and Act
    ComplexNumber actualAcosResult = TrigonometricFunctionUtils.acos(new ComplexNumber(Double.NaN));

    // Assert
    assertEquals(Double.NaN, actualAcosResult.getImaginary());
    assertEquals(Double.NaN, actualAcosResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#acos(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is one.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acos(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test acos(ComplexNumber) with 'z'; when ComplexNumber(double) with real is one; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.acos(ComplexNumber)"})
  void testAcosWithZ_whenComplexNumberWithRealIsOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.ZERO, TrigonometricFunctionUtils.acos(new ComplexNumber(1.0d)));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#acos(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is {@code -0.8813735870195429}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acos(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test acos(ComplexNumber) with 'z'; when I; then return Imaginary is '-0.8813735870195429'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.acos(ComplexNumber)"})
  void testAcosWithZ_whenI_thenReturnImaginaryIs08813735870195429() {
    // Arrange and Act
    ComplexNumber actualAcosResult = TrigonometricFunctionUtils.acos(ComplexNumber.I);

    // Assert
    assertEquals(-0.8813735870195429d, actualAcosResult.getImaginary());
    assertEquals(1.5707963267948966d, actualAcosResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#acosh(double)} with {@code x}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return {@code 1.3169578969248166}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acosh(double)}
   */
  @Test
  @DisplayName("Test acosh(double) with 'x'; when two; then return '1.3169578969248166'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.acosh(double)"})
  void testAcoshWithX_whenTwo_thenReturn13169578969248166() {
    // Arrange, Act and Assert
    assertEquals(1.3169578969248166d, TrigonometricFunctionUtils.acosh(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#acosh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>Then return Imaginary is {@code 0.9045568943023814}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acosh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test acosh(ComplexNumber) with 'z'; then return Imaginary is '0.9045568943023814'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.acosh(ComplexNumber)"})
  void testAcoshWithZ_thenReturnImaginaryIs09045568943023814() {
    // Arrange and Act
    ComplexNumber actualAcoshResult =
        TrigonometricFunctionUtils.acosh(new ComplexNumber(1.0d, 1.0d));

    // Assert
    assertEquals(0.9045568943023814d, actualAcoshResult.getImaginary());
    assertEquals(1.0612750619050357d, actualAcoshResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#acosh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is {@link Double#NaN}.
   *   <li>Then return Imaginary is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acosh(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test acosh(ComplexNumber) with 'z'; when ComplexNumber(double) with real is NaN; then return Imaginary is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.acosh(ComplexNumber)"})
  void testAcoshWithZ_whenComplexNumberWithRealIsNaN_thenReturnImaginaryIsNaN() {
    // Arrange and Act
    ComplexNumber actualAcoshResult =
        TrigonometricFunctionUtils.acosh(new ComplexNumber(Double.NaN));

    // Assert
    assertEquals(Double.NaN, actualAcoshResult.getImaginary());
    assertEquals(Double.NaN, actualAcoshResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#acosh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is one.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acosh(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test acosh(ComplexNumber) with 'z'; when ComplexNumber(double) with real is one; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.acosh(ComplexNumber)"})
  void testAcoshWithZ_whenComplexNumberWithRealIsOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.ZERO, TrigonometricFunctionUtils.acosh(new ComplexNumber(1.0d)));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#acosh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is ten.
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acosh(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test acosh(ComplexNumber) with 'z'; when ComplexNumber(double) with real is ten; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.acosh(ComplexNumber)"})
  void testAcoshWithZ_whenComplexNumberWithRealIsTen_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualAcoshResult = TrigonometricFunctionUtils.acosh(new ComplexNumber(10.0d));

    // Assert
    assertEquals(0.0d, actualAcoshResult.getImaginary());
    assertEquals(2.993222846126381d, actualAcoshResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#acosh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is {@code 0.8813735870195429}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#acosh(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test acosh(ComplexNumber) with 'z'; when I; then return Real is '0.8813735870195429'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.acosh(ComplexNumber)"})
  void testAcoshWithZ_whenI_thenReturnRealIs08813735870195429() {
    // Arrange and Act
    ComplexNumber actualAcoshResult = TrigonometricFunctionUtils.acosh(ComplexNumber.I);

    // Assert
    assertEquals(0.8813735870195429d, actualAcoshResult.getReal());
    assertEquals(1.5707963267948966d, actualAcoshResult.getImaginary());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asin(double)} with {@code x}.
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asin(double)}
   */
  @Test
  @DisplayName("Test asin(double) with 'x'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.asin(double)"})
  void testAsinWithX() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, TrigonometricFunctionUtils.asin(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asin(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>Then return Imaginary is {@code -2.993222846126381}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asin(ComplexNumber)}
   */
  @Test
  @DisplayName("Test asin(ComplexNumber) with 'z'; then return Imaginary is '-2.993222846126381'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.asin(ComplexNumber)"})
  void testAsinWithZ_thenReturnImaginaryIs2993222846126381() {
    // Arrange and Act
    ComplexNumber actualAsinResult = TrigonometricFunctionUtils.asin(new ComplexNumber(10.0d));

    // Assert
    assertEquals(-2.993222846126381d, actualAsinResult.getImaginary());
    assertEquals(1.5707963267948966d, actualAsinResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asin(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>Then return Real is {@code 0.6662394324925153}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asin(ComplexNumber)}
   */
  @Test
  @DisplayName("Test asin(ComplexNumber) with 'z'; then return Real is '0.6662394324925153'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.asin(ComplexNumber)"})
  void testAsinWithZ_thenReturnRealIs06662394324925153() {
    // Arrange and Act
    ComplexNumber actualAsinResult = TrigonometricFunctionUtils.asin(new ComplexNumber(1.0d, 1.0d));

    // Assert
    assertEquals(0.6662394324925153d, actualAsinResult.getReal());
    assertEquals(1.0612750619050355d, actualAsinResult.getImaginary());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asin(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is {@link Double#NaN}.
   *   <li>Then return Imaginary is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asin(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test asin(ComplexNumber) with 'z'; when ComplexNumber(double) with real is NaN; then return Imaginary is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.asin(ComplexNumber)"})
  void testAsinWithZ_whenComplexNumberWithRealIsNaN_thenReturnImaginaryIsNaN() {
    // Arrange and Act
    ComplexNumber actualAsinResult = TrigonometricFunctionUtils.asin(new ComplexNumber(Double.NaN));

    // Assert
    assertEquals(Double.NaN, actualAsinResult.getImaginary());
    assertEquals(Double.NaN, actualAsinResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asin(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is one.
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asin(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test asin(ComplexNumber) with 'z'; when ComplexNumber(double) with real is one; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.asin(ComplexNumber)"})
  void testAsinWithZ_whenComplexNumberWithRealIsOne_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualAsinResult = TrigonometricFunctionUtils.asin(new ComplexNumber(1.0d));

    // Assert
    assertEquals(0.0d, actualAsinResult.getImaginary());
    assertEquals(1.5707963267948966d, actualAsinResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asin(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asin(ComplexNumber)}
   */
  @Test
  @DisplayName("Test asin(ComplexNumber) with 'z'; when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.asin(ComplexNumber)"})
  void testAsinWithZ_whenI_thenReturnRealIsZero() {
    // Arrange and Act
    ComplexNumber actualAsinResult = TrigonometricFunctionUtils.asin(ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualAsinResult.getReal());
    assertEquals(0.8813735870195428d, actualAsinResult.getImaginary());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asinh(double)} with {@code x}.
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asinh(double)}
   */
  @Test
  @DisplayName("Test asinh(double) with 'x'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.asinh(double)"})
  void testAsinhWithX() {
    // Arrange, Act and Assert
    assertEquals(1.4436354751788103d, TrigonometricFunctionUtils.asinh(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asinh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>Then return Imaginary is {@code 0.6662394324925153}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asinh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test asinh(ComplexNumber) with 'z'; then return Imaginary is '0.6662394324925153'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.asinh(ComplexNumber)"})
  void testAsinhWithZ_thenReturnImaginaryIs06662394324925153() {
    // Arrange and Act
    ComplexNumber actualAsinhResult =
        TrigonometricFunctionUtils.asinh(new ComplexNumber(1.0d, 1.0d));

    // Assert
    assertEquals(0.6662394324925153d, actualAsinhResult.getImaginary());
    assertEquals(1.0612750619050357d, actualAsinhResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asinh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>Then return Imaginary is {@code 1.0634400235777521}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asinh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test asinh(ComplexNumber) with 'z'; then return Imaginary is '1.0634400235777521'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.asinh(ComplexNumber)"})
  void testAsinhWithZ_thenReturnImaginaryIs10634400235777521() {
    // Arrange and Act
    ComplexNumber actualAsinhResult =
        TrigonometricFunctionUtils.asinh(new ComplexNumber(1.0d, 2.0d));

    // Assert
    assertEquals(1.0634400235777521d, actualAsinhResult.getImaginary());
    assertEquals(1.4693517443681852d, actualAsinhResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asinh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>Then return Imaginary is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asinh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test asinh(ComplexNumber) with 'z'; then return Imaginary is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.asinh(ComplexNumber)"})
  void testAsinhWithZ_thenReturnImaginaryIsNaN() {
    // Arrange and Act
    ComplexNumber actualAsinhResult =
        TrigonometricFunctionUtils.asinh(new ComplexNumber(Double.NaN, 1.0d));

    // Assert
    assertEquals(Double.NaN, actualAsinhResult.getImaginary());
    assertEquals(Double.NaN, actualAsinhResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asinh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asinh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test asinh(ComplexNumber) with 'z'; when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.asinh(ComplexNumber)"})
  void testAsinhWithZ_whenI_thenReturnRealIsZero() {
    // Arrange and Act
    ComplexNumber actualAsinhResult = TrigonometricFunctionUtils.asinh(ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualAsinhResult.getReal());
    assertEquals(1.5707963267948966d, actualAsinhResult.getImaginary());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#asinh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#asinh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test asinh(ComplexNumber) with 'z'; when ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.asinh(ComplexNumber)"})
  void testAsinhWithZ_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.ZERO, TrigonometricFunctionUtils.asinh(ComplexNumber.ZERO));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#atan(double)} with {@code x}.
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#atan(double)}
   */
  @Test
  @DisplayName("Test atan(double) with 'x'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.atan(double)"})
  void testAtanWithX() {
    // Arrange, Act and Assert
    assertEquals(1.1071487177940904d, TrigonometricFunctionUtils.atan(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#atan(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#atan(ComplexNumber)}
   */
  @Test
  @DisplayName("Test atan(ComplexNumber) with 'z'; when I; then return Imaginary is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.atan(ComplexNumber)"})
  void testAtanWithZ_whenI_thenReturnImaginaryIsNaN() {
    // Arrange and Act
    ComplexNumber actualAtanResult = TrigonometricFunctionUtils.atan(ComplexNumber.I);

    // Assert
    assertEquals(Double.NaN, actualAtanResult.getImaginary());
    assertEquals(Double.NaN, actualAtanResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#atan(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#atan(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test atan(ComplexNumber) with 'z'; when MINUS_I; then return Imaginary is NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.atan(ComplexNumber)"})
  void testAtanWithZ_whenMinus_i_thenReturnImaginaryIsNegative_infinity() {
    // Arrange and Act
    ComplexNumber actualAtanResult = TrigonometricFunctionUtils.atan(ComplexNumber.MINUS_I);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualAtanResult.getImaginary());
    assertEquals(Double.NaN, actualAtanResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#atanh(double)} with {@code x}.
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#atanh(double)}
   */
  @Test
  @DisplayName("Test atanh(double) with 'x'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.atanh(double)"})
  void testAtanhWithX() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, TrigonometricFunctionUtils.atanh(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#atanh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#atanh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test atanh(ComplexNumber) with 'z'; when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.atanh(ComplexNumber)"})
  void testAtanhWithZ_whenI_thenReturnRealIsZero() {
    // Arrange and Act
    ComplexNumber actualAtanhResult = TrigonometricFunctionUtils.atanh(ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualAtanhResult.getReal());
    assertEquals(0.7853981633974483d, actualAtanhResult.getImaginary());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#atanh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#atanh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test atanh(ComplexNumber) with 'z'; when ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.atanh(ComplexNumber)"})
  void testAtanhWithZ_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.ZERO, TrigonometricFunctionUtils.atanh(ComplexNumber.ZERO));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#cos(double)} with {@code x}.
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#cos(double)}
   */
  @Test
  @DisplayName("Test cos(double) with 'x'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.cos(double)"})
  void testCosWithX() {
    // Arrange, Act and Assert
    assertEquals(-0.4161468365471424d, TrigonometricFunctionUtils.cos(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#cos(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#cos(ComplexNumber)}
   */
  @Test
  @DisplayName("Test cos(ComplexNumber) with 'z'; when I; then return Imaginary is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.cos(ComplexNumber)"})
  void testCosWithZ_whenI_thenReturnImaginaryIs00() {
    // Arrange and Act
    ComplexNumber actualCosResult = TrigonometricFunctionUtils.cos(ComplexNumber.I);

    // Assert
    assertEquals(-0.0d, actualCosResult.getImaginary());
    assertEquals(1.543080634815244d, actualCosResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#cosh(double)} with {@code x}.
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#cosh(double)}
   */
  @Test
  @DisplayName("Test cosh(double) with 'x'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.cosh(double)"})
  void testCoshWithX() {
    // Arrange, Act and Assert
    assertEquals(3.7621956910836314d, TrigonometricFunctionUtils.cosh(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#cosh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#cosh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test cosh(ComplexNumber) with 'z'; when I; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.cosh(ComplexNumber)"})
  void testCoshWithZ_whenI_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualCoshResult = TrigonometricFunctionUtils.cosh(ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualCoshResult.getImaginary());
    assertEquals(0.5403023058681398d, actualCoshResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#sin(double)} with {@code x}.
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#sin(double)}
   */
  @Test
  @DisplayName("Test sin(double) with 'x'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.sin(double)"})
  void testSinWithX() {
    // Arrange, Act and Assert
    assertEquals(0.9092974268256817d, TrigonometricFunctionUtils.sin(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#sin(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#sin(ComplexNumber)}
   */
  @Test
  @DisplayName("Test sin(ComplexNumber) with 'z'; when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.sin(ComplexNumber)"})
  void testSinWithZ_whenI_thenReturnRealIsZero() {
    // Arrange and Act
    ComplexNumber actualSinResult = TrigonometricFunctionUtils.sin(ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualSinResult.getReal());
    assertEquals(1.1752011936438014d, actualSinResult.getImaginary());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#sinh(double)} with {@code x}.
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#sinh(double)}
   */
  @Test
  @DisplayName("Test sinh(double) with 'x'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.sinh(double)"})
  void testSinhWithX() {
    // Arrange, Act and Assert
    assertEquals(3.626860407847019d, TrigonometricFunctionUtils.sinh(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#sinh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#sinh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test sinh(ComplexNumber) with 'z'; when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.sinh(ComplexNumber)"})
  void testSinhWithZ_whenI_thenReturnRealIsZero() {
    // Arrange and Act
    ComplexNumber actualSinhResult = TrigonometricFunctionUtils.sinh(ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualSinhResult.getReal());
    assertEquals(0.8414709848078965d, actualSinhResult.getImaginary());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#tan(double)} with {@code x}.
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#tan(double)}
   */
  @Test
  @DisplayName("Test tan(double) with 'x'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.tan(double)"})
  void testTanWithX() {
    // Arrange, Act and Assert
    assertEquals(-2.185039863261519d, TrigonometricFunctionUtils.tan(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#tan(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is two.
   *   <li>Then return Real is {@code -2.185039863261519}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#tan(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test tan(ComplexNumber) with 'z'; when ComplexNumber(double) with real is two; then return Real is '-2.185039863261519'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.tan(ComplexNumber)"})
  void testTanWithZ_whenComplexNumberWithRealIsTwo_thenReturnRealIs2185039863261519() {
    // Arrange and Act
    ComplexNumber actualTanResult = TrigonometricFunctionUtils.tan(new ComplexNumber(2.0d));

    // Assert
    assertEquals(-2.185039863261519d, actualTanResult.getReal());
    assertEquals(0.0d, actualTanResult.getImaginary());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#tan(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#tan(ComplexNumber)}
   */
  @Test
  @DisplayName("Test tan(ComplexNumber) with 'z'; when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.tan(ComplexNumber)"})
  void testTanWithZ_whenI_thenReturnRealIsZero() {
    // Arrange and Act
    ComplexNumber actualTanResult = TrigonometricFunctionUtils.tan(ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualTanResult.getReal());
    assertEquals(0.7615941559557649d, actualTanResult.getImaginary());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#tanh(double)} with {@code x}.
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#tanh(double)}
   */
  @Test
  @DisplayName("Test tanh(double) with 'x'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double TrigonometricFunctionUtils.tanh(double)"})
  void testTanhWithX() {
    // Arrange, Act and Assert
    assertEquals(0.9640275800758169d, TrigonometricFunctionUtils.tanh(2.0d));
  }

  /**
   * Test {@link TrigonometricFunctionUtils#tanh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>Then return Imaginary is {@code -0.2717525853195117}.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#tanh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test tanh(ComplexNumber) with 'z'; then return Imaginary is '-0.2717525853195117'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.tanh(ComplexNumber)"})
  void testTanhWithZ_thenReturnImaginaryIs02717525853195117() {
    // Arrange and Act
    ComplexNumber actualTanhResult =
        TrigonometricFunctionUtils.tanh(new ComplexNumber(-1.0d, -1.0d));

    // Assert
    assertEquals(-0.2717525853195117d, actualTanhResult.getImaginary());
    assertEquals(-1.0839233273386946d, actualTanhResult.getReal());
  }

  /**
   * Test {@link TrigonometricFunctionUtils#tanh(ComplexNumber)} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link TrigonometricFunctionUtils#tanh(ComplexNumber)}
   */
  @Test
  @DisplayName("Test tanh(ComplexNumber) with 'z'; when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber TrigonometricFunctionUtils.tanh(ComplexNumber)"})
  void testTanhWithZ_whenI_thenReturnRealIsZero() {
    // Arrange and Act
    ComplexNumber actualTanhResult = TrigonometricFunctionUtils.tanh(ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualTanhResult.getReal());
    assertEquals(1.557407724654902d, actualTanhResult.getImaginary());
  }
}
