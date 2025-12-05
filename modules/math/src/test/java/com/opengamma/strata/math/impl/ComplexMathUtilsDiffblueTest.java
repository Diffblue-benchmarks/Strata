package com.opengamma.strata.math.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ComplexMathUtilsDiffblueTest {
  /**
   * Test {@link ComplexMathUtils#add(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is ten.
   *   <li>Then return Real is twelve.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test add(double, ComplexNumber) with 'x', 'z'; when ComplexNumber(double) with real is ten; then return Real is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(double, ComplexNumber)"})
  void testAddWithXZ_whenComplexNumberWithRealIsTen_thenReturnRealIsTwelve() {
    // Arrange and Act
    ComplexNumber actualAddResult = ComplexMathUtils.add(2.0d, new ComplexNumber(10.0d));

    // Assert
    assertEquals(0.0d, actualAddResult.getImaginary());
    assertEquals(12.0d, actualAddResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#add(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test add(double, ComplexNumber) with 'x', 'z'; when I; then return Imaginary is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(double, ComplexNumber)"})
  void testAddWithXZ_whenI_thenReturnImaginaryIsOne() {
    // Arrange and Act
    ComplexNumber actualAddResult = ComplexMathUtils.add(2.0d, ComplexNumber.I);

    // Assert
    assertEquals(1.0d, actualAddResult.getImaginary());
    assertEquals(2.0d, actualAddResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#add(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is minus one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test add(double, ComplexNumber) with 'x', 'z'; when MINUS_I; then return Imaginary is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(double, ComplexNumber)"})
  void testAddWithXZ_whenMinus_i_thenReturnImaginaryIsMinusOne() {
    // Arrange and Act
    ComplexNumber actualAddResult = ComplexMathUtils.add(2.0d, ComplexNumber.MINUS_I);

    // Assert
    assertEquals(-1.0d, actualAddResult.getImaginary());
    assertEquals(2.0d, actualAddResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#add(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test add(double, ComplexNumber) with 'x', 'z'; when ZERO; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(double, ComplexNumber)"})
  void testAddWithXZ_whenZero_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualAddResult = ComplexMathUtils.add(2.0d, ComplexNumber.ZERO);

    // Assert
    assertEquals(0.0d, actualAddResult.getImaginary());
    assertEquals(2.0d, actualAddResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#add(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is ten.
   *   <li>Then return Imaginary is one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test add(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when ComplexNumber(double) with real is ten; then return Imaginary is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(ComplexNumber, ComplexNumber)"})
  void testAddWithZ1Z2_whenComplexNumberWithRealIsTen_thenReturnImaginaryIsOne() {
    // Arrange and Act
    ComplexNumber actualAddResult = ComplexMathUtils.add(new ComplexNumber(10.0d), ComplexNumber.I);

    // Assert
    assertEquals(1.0d, actualAddResult.getImaginary());
    assertEquals(10.0d, actualAddResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#add(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test add(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(ComplexNumber, ComplexNumber)"})
  void testAddWithZ1Z2_whenI_thenReturnRealIsZero() {
    // Arrange and Act
    ComplexNumber actualAddResult = ComplexMathUtils.add(ComplexNumber.I, ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualAddResult.getReal());
    assertEquals(2.0d, actualAddResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#add(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test add(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when MINUS_I; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(ComplexNumber, ComplexNumber)"})
  void testAddWithZ1Z2_whenMinus_i_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.ZERO, ComplexMathUtils.add(ComplexNumber.MINUS_I, ComplexNumber.I));
  }

  /**
   * Test {@link ComplexMathUtils#add(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return {@link ComplexNumber#I}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName("Test add(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when ZERO; then return I")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(ComplexNumber, ComplexNumber)"})
  void testAddWithZ1Z2_whenZero_thenReturnI() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.I, ComplexMathUtils.add(ComplexNumber.ZERO, ComplexNumber.I));
  }

  /**
   * Test {@link ComplexMathUtils#add(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is ten.
   *   <li>Then return Real is twelve.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test add(ComplexNumber, double) with 'z', 'x'; when ComplexNumber(double) with real is ten; then return Real is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(ComplexNumber, double)"})
  void testAddWithZX_whenComplexNumberWithRealIsTen_thenReturnRealIsTwelve() {
    // Arrange and Act
    ComplexNumber actualAddResult = ComplexMathUtils.add(new ComplexNumber(10.0d), 2.0d);

    // Assert
    assertEquals(0.0d, actualAddResult.getImaginary());
    assertEquals(12.0d, actualAddResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#add(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test add(ComplexNumber, double) with 'z', 'x'; when I; then return Imaginary is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(ComplexNumber, double)"})
  void testAddWithZX_whenI_thenReturnImaginaryIsOne() {
    // Arrange and Act
    ComplexNumber actualAddResult = ComplexMathUtils.add(ComplexNumber.I, 2.0d);

    // Assert
    assertEquals(1.0d, actualAddResult.getImaginary());
    assertEquals(2.0d, actualAddResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#add(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is minus one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test add(ComplexNumber, double) with 'z', 'x'; when MINUS_I; then return Imaginary is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(ComplexNumber, double)"})
  void testAddWithZX_whenMinus_i_thenReturnImaginaryIsMinusOne() {
    // Arrange and Act
    ComplexNumber actualAddResult = ComplexMathUtils.add(ComplexNumber.MINUS_I, 2.0d);

    // Assert
    assertEquals(-1.0d, actualAddResult.getImaginary());
    assertEquals(2.0d, actualAddResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#add(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test add(ComplexNumber, double) with 'z', 'x'; when ZERO; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(ComplexNumber, double)"})
  void testAddWithZX_whenZero_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualAddResult = ComplexMathUtils.add(ComplexNumber.ZERO, 2.0d);

    // Assert
    assertEquals(0.0d, actualAddResult.getImaginary());
    assertEquals(2.0d, actualAddResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#add(ComplexNumber[])} with {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#add(ComplexNumber[])}
   */
  @Test
  @DisplayName("Test add(ComplexNumber[]) with 'z'; when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.add(ComplexNumber[])"})
  void testAddWithZ_whenI_thenReturnRealIsZero() {
    // Arrange
    ComplexNumber[] z = new ComplexNumber[] {ComplexNumber.I};

    // Act
    ComplexNumber actualAddResult = ComplexMathUtils.add(z);

    // Assert
    assertEquals(0.0d, actualAddResult.getReal());
    assertEquals(1, z.length);
    assertEquals(1.0d, actualAddResult.getImaginary());
    assertSame(ComplexNumber.I, z[0]);
  }

  /**
   * Test {@link ComplexMathUtils#arg(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return {@code 1.5707963267948966}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#arg(ComplexNumber)}
   */
  @Test
  @DisplayName("Test arg(ComplexNumber); when I; then return '1.5707963267948966'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ComplexMathUtils.arg(ComplexNumber)"})
  void testArg_whenI_thenReturn15707963267948966() {
    // Arrange, Act and Assert
    assertEquals(1.5707963267948966d, ComplexMathUtils.arg(ComplexNumber.I));
  }

  /**
   * Test {@link ComplexMathUtils#conjugate(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return {@link ComplexNumber#MINUS_I}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#conjugate(ComplexNumber)}
   */
  @Test
  @DisplayName("Test conjugate(ComplexNumber); when I; then return MINUS_I")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.conjugate(ComplexNumber)"})
  void testConjugate_whenI_thenReturnMinus_i() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.MINUS_I, ComplexMathUtils.conjugate(ComplexNumber.I));
  }

  /**
   * Test {@link ComplexMathUtils#divide(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is one.
   *   <li>Then return Imaginary is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test divide(double, ComplexNumber) with 'x', 'z'; when ComplexNumber(double) with real is one; then return Imaginary is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(double, ComplexNumber)"})
  void testDivideWithXZ_whenComplexNumberWithRealIsOne_thenReturnImaginaryIs00() {
    // Arrange and Act
    ComplexNumber actualDivideResult = ComplexMathUtils.divide(2.0d, new ComplexNumber(1.0d));

    // Assert
    assertEquals(-0.0d, actualDivideResult.getImaginary());
    assertEquals(2.0d, actualDivideResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#divide(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is minus two.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test divide(double, ComplexNumber) with 'x', 'z'; when I; then return Imaginary is minus two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(double, ComplexNumber)"})
  void testDivideWithXZ_whenI_thenReturnImaginaryIsMinusTwo() {
    // Arrange and Act
    ComplexNumber actualDivideResult = ComplexMathUtils.divide(2.0d, ComplexNumber.I);

    // Assert
    assertEquals(-2.0d, actualDivideResult.getImaginary());
    assertEquals(0.0d, actualDivideResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#divide(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is two.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test divide(double, ComplexNumber) with 'x', 'z'; when MINUS_I; then return Imaginary is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(double, ComplexNumber)"})
  void testDivideWithXZ_whenMinus_i_thenReturnImaginaryIsTwo() {
    // Arrange and Act
    ComplexNumber actualDivideResult = ComplexMathUtils.divide(2.0d, ComplexNumber.MINUS_I);

    // Assert
    assertEquals(0.0d, actualDivideResult.getReal());
    assertEquals(2.0d, actualDivideResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#divide(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return Imaginary is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test divide(double, ComplexNumber) with 'x', 'z'; when ZERO; then return Imaginary is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(double, ComplexNumber)"})
  void testDivideWithXZ_whenZero_thenReturnImaginaryIsNaN() {
    // Arrange and Act
    ComplexNumber actualDivideResult = ComplexMathUtils.divide(2.0d, ComplexNumber.ZERO);

    // Assert
    assertEquals(Double.NaN, actualDivideResult.getImaginary());
    assertEquals(Double.NaN, actualDivideResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#divide(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is one.
   *   <li>Then return {@link ComplexNumber#I}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test divide(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when ComplexNumber(double) with real is one; then return I")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(ComplexNumber, ComplexNumber)"})
  void testDivideWithZ1Z2_whenComplexNumberWithRealIsOne_thenReturnI() {
    // Arrange and Act
    ComplexNumber actualDivideResult =
        ComplexMathUtils.divide(ComplexNumber.I, new ComplexNumber(1.0d));

    // Assert
    assertEquals(ComplexNumber.I, actualDivideResult);
  }

  /**
   * Test {@link ComplexMathUtils#divide(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is one.
   *   <li>Then return {@link ComplexNumber#MINUS_I}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test divide(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when ComplexNumber(double) with real is one; then return MINUS_I")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(ComplexNumber, ComplexNumber)"})
  void testDivideWithZ1Z2_whenComplexNumberWithRealIsOne_thenReturnMinus_i() {
    // Arrange, Act and Assert
    assertEquals(
        ComplexNumber.MINUS_I, ComplexMathUtils.divide(new ComplexNumber(1.0d), ComplexNumber.I));
  }

  /**
   * Test {@link ComplexMathUtils#divide(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test divide(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when I; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(ComplexNumber, ComplexNumber)"})
  void testDivideWithZ1Z2_whenI_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualDivideResult = ComplexMathUtils.divide(ComplexNumber.I, ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualDivideResult.getImaginary());
    assertEquals(1.0d, actualDivideResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#divide(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test divide(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when MINUS_I; then return Imaginary is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(ComplexNumber, ComplexNumber)"})
  void testDivideWithZ1Z2_whenMinus_i_thenReturnImaginaryIs00() {
    // Arrange and Act
    ComplexNumber actualDivideResult =
        ComplexMathUtils.divide(ComplexNumber.MINUS_I, ComplexNumber.I);

    // Assert
    assertEquals(-0.0d, actualDivideResult.getImaginary());
    assertEquals(-1.0d, actualDivideResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#divide(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test divide(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(ComplexNumber, ComplexNumber)"})
  void testDivideWithZ1Z2_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.ZERO, ComplexMathUtils.divide(ComplexNumber.ZERO, ComplexNumber.I));
  }

  /**
   * Test {@link ComplexMathUtils#divide(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is ten.
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test divide(ComplexNumber, double) with 'z', 'x'; when ComplexNumber(double) with real is ten; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(ComplexNumber, double)"})
  void testDivideWithZX_whenComplexNumberWithRealIsTen_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualDivideResult = ComplexMathUtils.divide(new ComplexNumber(10.0d), 2.0d);

    // Assert
    assertEquals(0.0d, actualDivideResult.getImaginary());
    assertEquals(5.0d, actualDivideResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#divide(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test divide(ComplexNumber, double) with 'z', 'x'; when I; then return Imaginary is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(ComplexNumber, double)"})
  void testDivideWithZX_whenI_thenReturnImaginaryIs05() {
    // Arrange and Act
    ComplexNumber actualDivideResult = ComplexMathUtils.divide(ComplexNumber.I, 2.0d);

    // Assert
    assertEquals(0.0d, actualDivideResult.getReal());
    assertEquals(0.5d, actualDivideResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#divide(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test divide(ComplexNumber, double) with 'z', 'x'; when MINUS_I; then return Imaginary is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(ComplexNumber, double)"})
  void testDivideWithZX_whenMinus_i_thenReturnImaginaryIs05() {
    // Arrange and Act
    ComplexNumber actualDivideResult = ComplexMathUtils.divide(ComplexNumber.MINUS_I, 2.0d);

    // Assert
    assertEquals(-0.5d, actualDivideResult.getImaginary());
    assertEquals(0.0d, actualDivideResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#divide(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#divide(ComplexNumber, double)}
   */
  @Test
  @DisplayName("Test divide(ComplexNumber, double) with 'z', 'x'; when ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.divide(ComplexNumber, double)"})
  void testDivideWithZX_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.ZERO, ComplexMathUtils.divide(ComplexNumber.ZERO, 2.0d));
  }

  /**
   * Test {@link ComplexMathUtils#exp(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is {@code 0.5403023058681398}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#exp(ComplexNumber)}
   */
  @Test
  @DisplayName("Test exp(ComplexNumber); when I; then return Real is '0.5403023058681398'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.exp(ComplexNumber)"})
  void testExp_whenI_thenReturnRealIs05403023058681398() {
    // Arrange and Act
    ComplexNumber actualExpResult = ComplexMathUtils.exp(ComplexNumber.I);

    // Assert
    assertEquals(0.5403023058681398d, actualExpResult.getReal());
    assertEquals(0.8414709848078965d, actualExpResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#inverse(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is one.
   *   <li>Then return Imaginary is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#inverse(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test inverse(ComplexNumber); when ComplexNumber(double) with real is one; then return Imaginary is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.inverse(ComplexNumber)"})
  void testInverse_whenComplexNumberWithRealIsOne_thenReturnImaginaryIs00() {
    // Arrange and Act
    ComplexNumber actualInverseResult = ComplexMathUtils.inverse(new ComplexNumber(1.0d));

    // Assert
    assertEquals(-0.0d, actualInverseResult.getImaginary());
    assertEquals(1.0d, actualInverseResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#inverse(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return {@link ComplexNumber#MINUS_I}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#inverse(ComplexNumber)}
   */
  @Test
  @DisplayName("Test inverse(ComplexNumber); when I; then return MINUS_I")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.inverse(ComplexNumber)"})
  void testInverse_whenI_thenReturnMinus_i() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.MINUS_I, ComplexMathUtils.inverse(ComplexNumber.I));
  }

  /**
   * Test {@link ComplexMathUtils#log(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#log(ComplexNumber)}
   */
  @Test
  @DisplayName("Test log(ComplexNumber); when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.log(ComplexNumber)"})
  void testLog_whenI_thenReturnRealIsZero() {
    // Arrange and Act
    ComplexNumber actualLogResult = ComplexMathUtils.log(ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualLogResult.getReal());
    assertEquals(1.5707963267948966d, actualLogResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#mod(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#mod(ComplexNumber)}
   */
  @Test
  @DisplayName("Test mod(ComplexNumber); when I; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ComplexMathUtils.mod(ComplexNumber)"})
  void testMod_whenI_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1.0d, ComplexMathUtils.mod(ComplexNumber.I));
  }

  /**
   * Test {@link ComplexMathUtils#square(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is minus one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#square(ComplexNumber)}
   */
  @Test
  @DisplayName("Test square(ComplexNumber); when I; then return Real is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.square(ComplexNumber)"})
  void testSquare_whenI_thenReturnRealIsMinusOne() {
    // Arrange and Act
    ComplexNumber actualSquareResult = ComplexMathUtils.square(ComplexNumber.I);

    // Assert
    assertEquals(-1.0d, actualSquareResult.getReal());
    assertEquals(0.0d, actualSquareResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#multiply(ComplexNumber, ComplexNumber)} with {@code
   * ComplexNumber}, {@code ComplexNumber}.
   *
   * <ul>
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test multiply(ComplexNumber, ComplexNumber) with 'ComplexNumber', 'ComplexNumber'; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(ComplexNumber, ComplexNumber)"})
  void testMultiplyWithComplexNumberComplexNumber_thenReturnRealIsZero() {
    // Arrange and Act
    ComplexNumber actualMultiplyResult =
        ComplexMathUtils.multiply(new ComplexNumber(10.0d), ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualMultiplyResult.getReal());
    assertEquals(10.0d, actualMultiplyResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#multiply(ComplexNumber, ComplexNumber)} with {@code
   * ComplexNumber}, {@code ComplexNumber}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is minus one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test multiply(ComplexNumber, ComplexNumber) with 'ComplexNumber', 'ComplexNumber'; when I; then return Real is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(ComplexNumber, ComplexNumber)"})
  void testMultiplyWithComplexNumberComplexNumber_whenI_thenReturnRealIsMinusOne() {
    // Arrange and Act
    ComplexNumber actualMultiplyResult =
        ComplexMathUtils.multiply(ComplexNumber.I, ComplexNumber.I);

    // Assert
    assertEquals(-1.0d, actualMultiplyResult.getReal());
    assertEquals(0.0d, actualMultiplyResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#multiply(ComplexNumber, ComplexNumber)} with {@code
   * ComplexNumber}, {@code ComplexNumber}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Real is one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test multiply(ComplexNumber, ComplexNumber) with 'ComplexNumber', 'ComplexNumber'; when MINUS_I; then return Real is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(ComplexNumber, ComplexNumber)"})
  void testMultiplyWithComplexNumberComplexNumber_whenMinus_i_thenReturnRealIsOne() {
    // Arrange and Act
    ComplexNumber actualMultiplyResult =
        ComplexMathUtils.multiply(ComplexNumber.MINUS_I, ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualMultiplyResult.getImaginary());
    assertEquals(1.0d, actualMultiplyResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#multiply(ComplexNumber, ComplexNumber)} with {@code
   * ComplexNumber}, {@code ComplexNumber}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test multiply(ComplexNumber, ComplexNumber) with 'ComplexNumber', 'ComplexNumber'; when ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(ComplexNumber, ComplexNumber)"})
  void testMultiplyWithComplexNumberComplexNumber_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        ComplexNumber.ZERO, ComplexMathUtils.multiply(ComplexNumber.ZERO, ComplexNumber.I));
  }

  /**
   * Test {@link ComplexMathUtils#multiply(ComplexNumber, double)} with {@code ComplexNumber},
   * {@code double}.
   *
   * <ul>
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test multiply(ComplexNumber, double) with 'ComplexNumber', 'double'; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(ComplexNumber, double)"})
  void testMultiplyWithComplexNumberDouble_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(new ComplexNumber(10.0d), 2.0d);

    // Assert
    assertEquals(0.0d, actualMultiplyResult.getImaginary());
    assertEquals(20.0d, actualMultiplyResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#multiply(ComplexNumber, double)} with {@code ComplexNumber},
   * {@code double}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is two.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test multiply(ComplexNumber, double) with 'ComplexNumber', 'double'; when I; then return Imaginary is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(ComplexNumber, double)"})
  void testMultiplyWithComplexNumberDouble_whenI_thenReturnImaginaryIsTwo() {
    // Arrange and Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(ComplexNumber.I, 2.0d);

    // Assert
    assertEquals(0.0d, actualMultiplyResult.getReal());
    assertEquals(2.0d, actualMultiplyResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#multiply(ComplexNumber, double)} with {@code ComplexNumber},
   * {@code double}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is minus two.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test multiply(ComplexNumber, double) with 'ComplexNumber', 'double'; when MINUS_I; then return Imaginary is minus two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(ComplexNumber, double)"})
  void testMultiplyWithComplexNumberDouble_whenMinus_i_thenReturnImaginaryIsMinusTwo() {
    // Arrange and Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(ComplexNumber.MINUS_I, 2.0d);

    // Assert
    assertEquals(-2.0d, actualMultiplyResult.getImaginary());
    assertEquals(0.0d, actualMultiplyResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#multiply(ComplexNumber, double)} with {@code ComplexNumber},
   * {@code double}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test multiply(ComplexNumber, double) with 'ComplexNumber', 'double'; when ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(ComplexNumber, double)"})
  void testMultiplyWithComplexNumberDouble_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.ZERO, ComplexMathUtils.multiply(ComplexNumber.ZERO, 2.0d));
  }

  /**
   * Test {@link ComplexMathUtils#multiply(ComplexNumber[])} with {@code ComplexNumber[]}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I} and {@link ComplexNumber#I}.
   *   <li>Then return Real is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(ComplexNumber[])}
   */
  @Test
  @DisplayName(
      "Test multiply(ComplexNumber[]) with 'ComplexNumber[]'; when I and I; then return Real is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(ComplexNumber[])"})
  void testMultiplyWithComplexNumber_whenIAndI_thenReturnRealIs00() {
    // Arrange
    ComplexNumber[] z = new ComplexNumber[] {ComplexNumber.I, ComplexNumber.I, ComplexNumber.I};

    // Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(z);

    // Assert
    assertEquals(-0.0d, actualMultiplyResult.getReal());
    assertEquals(-1.0d, actualMultiplyResult.getImaginary());
    assertEquals(3, z.length);
    assertSame(ComplexNumber.I, z[2]);
  }

  /**
   * Test {@link ComplexMathUtils#multiply(ComplexNumber[])} with {@code ComplexNumber[]}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I} and {@link ComplexNumber#I}.
   *   <li>Then return Real is minus one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(ComplexNumber[])}
   */
  @Test
  @DisplayName(
      "Test multiply(ComplexNumber[]) with 'ComplexNumber[]'; when I and I; then return Real is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(ComplexNumber[])"})
  void testMultiplyWithComplexNumber_whenIAndI_thenReturnRealIsMinusOne() {
    // Arrange
    ComplexNumber[] z = new ComplexNumber[] {ComplexNumber.I, ComplexNumber.I};

    // Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(z);

    // Assert
    assertEquals(-1.0d, actualMultiplyResult.getReal());
    assertEquals(0.0d, actualMultiplyResult.getImaginary());
    assertEquals(2, z.length);
    assertSame(ComplexNumber.I, z[1]);
  }

  /**
   * Test {@link ComplexMathUtils#multiply(ComplexNumber[])} with {@code ComplexNumber[]}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(ComplexNumber[])}
   */
  @Test
  @DisplayName(
      "Test multiply(ComplexNumber[]) with 'ComplexNumber[]'; when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(ComplexNumber[])"})
  void testMultiplyWithComplexNumber_whenI_thenReturnRealIsZero() {
    // Arrange
    ComplexNumber[] z = new ComplexNumber[] {ComplexNumber.I};

    // Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(z);

    // Assert
    assertEquals(0.0d, actualMultiplyResult.getReal());
    assertEquals(1, z.length);
    assertEquals(1.0d, actualMultiplyResult.getImaginary());
    assertSame(ComplexNumber.I, z[0]);
  }

  /**
   * Test {@link ComplexMathUtils#multiply(double, ComplexNumber)} with {@code double}, {@code
   * ComplexNumber}.
   *
   * <ul>
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test multiply(double, ComplexNumber) with 'double', 'ComplexNumber'; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(double, ComplexNumber)"})
  void testMultiplyWithDoubleComplexNumber_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(2.0d, new ComplexNumber(10.0d));

    // Assert
    assertEquals(0.0d, actualMultiplyResult.getImaginary());
    assertEquals(20.0d, actualMultiplyResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#multiply(double, ComplexNumber[])} with {@code double}, {@code
   * ComplexNumber[]}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I} and {@link ComplexNumber#I}.
   *   <li>Then return Real is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(double, ComplexNumber[])}
   */
  @Test
  @DisplayName(
      "Test multiply(double, ComplexNumber[]) with 'double', 'ComplexNumber[]'; when I and I; then return Real is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(double, ComplexNumber[])"})
  void testMultiplyWithDoubleComplexNumber_whenIAndI_thenReturnRealIs00() {
    // Arrange
    ComplexNumber[] z = new ComplexNumber[] {ComplexNumber.I, ComplexNumber.I, ComplexNumber.I};

    // Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(2.0d, z);

    // Assert
    assertEquals(-0.0d, actualMultiplyResult.getReal());
    assertEquals(-2.0d, actualMultiplyResult.getImaginary());
    assertEquals(3, z.length);
    assertSame(ComplexNumber.I, z[2]);
  }

  /**
   * Test {@link ComplexMathUtils#multiply(double, ComplexNumber[])} with {@code double}, {@code
   * ComplexNumber[]}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I} and {@link ComplexNumber#I}.
   *   <li>Then return Real is minus two.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(double, ComplexNumber[])}
   */
  @Test
  @DisplayName(
      "Test multiply(double, ComplexNumber[]) with 'double', 'ComplexNumber[]'; when I and I; then return Real is minus two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(double, ComplexNumber[])"})
  void testMultiplyWithDoubleComplexNumber_whenIAndI_thenReturnRealIsMinusTwo() {
    // Arrange
    ComplexNumber[] z = new ComplexNumber[] {ComplexNumber.I, ComplexNumber.I};

    // Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(2.0d, z);

    // Assert
    assertEquals(-2.0d, actualMultiplyResult.getReal());
    assertEquals(0.0d, actualMultiplyResult.getImaginary());
    assertEquals(2, z.length);
    assertSame(ComplexNumber.I, z[1]);
  }

  /**
   * Test {@link ComplexMathUtils#multiply(double, ComplexNumber)} with {@code double}, {@code
   * ComplexNumber}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is two.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test multiply(double, ComplexNumber) with 'double', 'ComplexNumber'; when I; then return Imaginary is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(double, ComplexNumber)"})
  void testMultiplyWithDoubleComplexNumber_whenI_thenReturnImaginaryIsTwo() {
    // Arrange and Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(2.0d, ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualMultiplyResult.getReal());
    assertEquals(2.0d, actualMultiplyResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#multiply(double, ComplexNumber[])} with {@code double}, {@code
   * ComplexNumber[]}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(double, ComplexNumber[])}
   */
  @Test
  @DisplayName(
      "Test multiply(double, ComplexNumber[]) with 'double', 'ComplexNumber[]'; when I; then return Real is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(double, ComplexNumber[])"})
  void testMultiplyWithDoubleComplexNumber_whenI_thenReturnRealIsZero() {
    // Arrange
    ComplexNumber[] z = new ComplexNumber[] {ComplexNumber.I};

    // Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(2.0d, z);

    // Assert
    assertEquals(0.0d, actualMultiplyResult.getReal());
    assertEquals(1, z.length);
    assertEquals(2.0d, actualMultiplyResult.getImaginary());
    assertSame(ComplexNumber.I, z[0]);
  }

  /**
   * Test {@link ComplexMathUtils#multiply(double, ComplexNumber)} with {@code double}, {@code
   * ComplexNumber}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is minus two.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test multiply(double, ComplexNumber) with 'double', 'ComplexNumber'; when MINUS_I; then return Imaginary is minus two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(double, ComplexNumber)"})
  void testMultiplyWithDoubleComplexNumber_whenMinus_i_thenReturnImaginaryIsMinusTwo() {
    // Arrange and Act
    ComplexNumber actualMultiplyResult = ComplexMathUtils.multiply(2.0d, ComplexNumber.MINUS_I);

    // Assert
    assertEquals(-2.0d, actualMultiplyResult.getImaginary());
    assertEquals(0.0d, actualMultiplyResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#multiply(double, ComplexNumber)} with {@code double}, {@code
   * ComplexNumber}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#multiply(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test multiply(double, ComplexNumber) with 'double', 'ComplexNumber'; when ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.multiply(double, ComplexNumber)"})
  void testMultiplyWithDoubleComplexNumber_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.ZERO, ComplexMathUtils.multiply(2.0d, ComplexNumber.ZERO));
  }

  /**
   * Test {@link ComplexMathUtils#pow(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is ten.
   *   <li>Then return Real is {@code 1024.0}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test pow(double, ComplexNumber) with 'x', 'z'; when ComplexNumber(double) with real is ten; then return Real is '1024.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(double, ComplexNumber)"})
  void testPowWithXZ_whenComplexNumberWithRealIsTen_thenReturnRealIs10240() {
    // Arrange and Act
    ComplexNumber actualPowResult = ComplexMathUtils.pow(2.0d, new ComplexNumber(10.0d));

    // Assert
    assertEquals(0.0d, actualPowResult.getImaginary());
    assertEquals(1024.0d, actualPowResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#pow(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is {@code 0.6389612763136348}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test pow(double, ComplexNumber) with 'x', 'z'; when I; then return Imaginary is '0.6389612763136348'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(double, ComplexNumber)"})
  void testPowWithXZ_whenI_thenReturnImaginaryIs06389612763136348() {
    // Arrange and Act
    ComplexNumber actualPowResult = ComplexMathUtils.pow(2.0d, ComplexNumber.I);

    // Assert
    assertEquals(0.6389612763136348d, actualPowResult.getImaginary());
    assertEquals(0.7692389013639721d, actualPowResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#pow(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is {@code -0.6389612763136348}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test pow(double, ComplexNumber) with 'x', 'z'; when MINUS_I; then return Imaginary is '-0.6389612763136348'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(double, ComplexNumber)"})
  void testPowWithXZ_whenMinus_i_thenReturnImaginaryIs06389612763136348() {
    // Arrange and Act
    ComplexNumber actualPowResult = ComplexMathUtils.pow(2.0d, ComplexNumber.MINUS_I);

    // Assert
    assertEquals(-0.6389612763136348d, actualPowResult.getImaginary());
    assertEquals(0.7692389013639721d, actualPowResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#pow(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return Real is one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(double, ComplexNumber)}
   */
  @Test
  @DisplayName("Test pow(double, ComplexNumber) with 'x', 'z'; when ZERO; then return Real is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(double, ComplexNumber)"})
  void testPowWithXZ_whenZero_thenReturnRealIsOne() {
    // Arrange and Act
    ComplexNumber actualPowResult = ComplexMathUtils.pow(2.0d, ComplexNumber.ZERO);

    // Assert
    assertEquals(0.0d, actualPowResult.getImaginary());
    assertEquals(1.0d, actualPowResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#pow(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is ten.
   *   <li>Then return Real is {@code -0.6682015101903132}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test pow(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when ComplexNumber(double) with real is ten; then return Real is '-0.6682015101903132'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(ComplexNumber, ComplexNumber)"})
  void testPowWithZ1Z2_whenComplexNumberWithRealIsTen_thenReturnRealIs06682015101903132() {
    // Arrange and Act
    ComplexNumber actualPowResult = ComplexMathUtils.pow(new ComplexNumber(10.0d), ComplexNumber.I);

    // Assert
    assertEquals(-0.6682015101903132d, actualPowResult.getReal());
    assertEquals(0.743980336957493d, actualPowResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#pow(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Real is {@code 0.20787957635076193}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test pow(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when I; then return Real is '0.20787957635076193'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(ComplexNumber, ComplexNumber)"})
  void testPowWithZ1Z2_whenI_thenReturnRealIs020787957635076193() {
    // Arrange and Act
    ComplexNumber actualPowResult = ComplexMathUtils.pow(ComplexNumber.I, ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualPowResult.getImaginary());
    assertEquals(0.20787957635076193d, actualPowResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#pow(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Real is {@code 4.810477380965351}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test pow(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when MINUS_I; then return Real is '4.810477380965351'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(ComplexNumber, ComplexNumber)"})
  void testPowWithZ1Z2_whenMinus_i_thenReturnRealIs4810477380965351() {
    // Arrange and Act
    ComplexNumber actualPowResult = ComplexMathUtils.pow(ComplexNumber.MINUS_I, ComplexNumber.I);

    // Assert
    assertEquals(0.0d, actualPowResult.getImaginary());
    assertEquals(4.810477380965351d, actualPowResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#pow(ComplexNumber, ComplexNumber)} with {@code z1}, {@code z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return Imaginary is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test pow(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when ZERO; then return Imaginary is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(ComplexNumber, ComplexNumber)"})
  void testPowWithZ1Z2_whenZero_thenReturnImaginaryIsNaN() {
    // Arrange and Act
    ComplexNumber actualPowResult = ComplexMathUtils.pow(ComplexNumber.ZERO, ComplexNumber.I);

    // Assert
    assertEquals(Double.NaN, actualPowResult.getImaginary());
    assertEquals(Double.NaN, actualPowResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#pow(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is ten.
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test pow(ComplexNumber, double) with 'z', 'x'; when ComplexNumber(double) with real is ten; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(ComplexNumber, double)"})
  void testPowWithZX_whenComplexNumberWithRealIsTen_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualPowResult = ComplexMathUtils.pow(new ComplexNumber(10.0d), 2.0d);

    // Assert
    assertEquals(0.0d, actualPowResult.getImaginary());
    assertEquals(100.0d, actualPowResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#pow(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is {@code 1.2246467991473532E-16}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test pow(ComplexNumber, double) with 'z', 'x'; when I; then return Imaginary is '1.2246467991473532E-16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(ComplexNumber, double)"})
  void testPowWithZX_whenI_thenReturnImaginaryIs12246467991473532e16() {
    // Arrange and Act
    ComplexNumber actualPowResult = ComplexMathUtils.pow(ComplexNumber.I, 2.0d);

    // Assert
    assertEquals(-1.0d, actualPowResult.getReal());
    assertEquals(1.2246467991473532E-16d, actualPowResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#pow(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is {@code -1.2246467991473532E-16}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test pow(ComplexNumber, double) with 'z', 'x'; when MINUS_I; then return Imaginary is '-1.2246467991473532E-16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(ComplexNumber, double)"})
  void testPowWithZX_whenMinus_i_thenReturnImaginaryIs12246467991473532e16() {
    // Arrange and Act
    ComplexNumber actualPowResult = ComplexMathUtils.pow(ComplexNumber.MINUS_I, 2.0d);

    // Assert
    assertEquals(-1.0d, actualPowResult.getReal());
    assertEquals(-1.2246467991473532E-16d, actualPowResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#pow(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#pow(ComplexNumber, double)}
   */
  @Test
  @DisplayName("Test pow(ComplexNumber, double) with 'z', 'x'; when ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.pow(ComplexNumber, double)"})
  void testPowWithZX_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.ZERO, ComplexMathUtils.pow(ComplexNumber.ZERO, 2.0d));
  }

  /**
   * Test {@link ComplexMathUtils#sqrt(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is minus one.
   *   <li>Then return {@link ComplexNumber#I}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#sqrt(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test sqrt(ComplexNumber); when ComplexNumber(double) with real is minus one; then return I")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.sqrt(ComplexNumber)"})
  void testSqrt_whenComplexNumberWithRealIsMinusOne_thenReturnI() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.I, ComplexMathUtils.sqrt(new ComplexNumber(-1.0d)));
  }

  /**
   * Test {@link ComplexMathUtils#sqrt(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is one.
   *   <li>Then return {@link ComplexNumber#ComplexNumber(double)} with real is one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#sqrt(ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test sqrt(ComplexNumber); when ComplexNumber(double) with real is one; then return ComplexNumber(double) with real is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.sqrt(ComplexNumber)"})
  void testSqrt_whenComplexNumberWithRealIsOne_thenReturnComplexNumberWithRealIsOne() {
    // Arrange
    ComplexNumber z = new ComplexNumber(1.0d);

    // Act
    ComplexNumber actualSqrtResult = ComplexMathUtils.sqrt(z);

    // Assert
    assertEquals(z, actualSqrtResult);
  }

  /**
   * Test {@link ComplexMathUtils#sqrt(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is {@code 0.7071067811865475}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#sqrt(ComplexNumber)}
   */
  @Test
  @DisplayName("Test sqrt(ComplexNumber); when I; then return Imaginary is '0.7071067811865475'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.sqrt(ComplexNumber)"})
  void testSqrt_whenI_thenReturnImaginaryIs07071067811865475() {
    // Arrange and Act
    ComplexNumber actualSqrtResult = ComplexMathUtils.sqrt(ComplexNumber.I);

    // Assert
    assertEquals(0.7071067811865475d, actualSqrtResult.getImaginary());
    assertEquals(0.7071067811865476d, actualSqrtResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#sqrt(ComplexNumber)}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#sqrt(ComplexNumber)}
   */
  @Test
  @DisplayName("Test sqrt(ComplexNumber); when ZERO; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.sqrt(ComplexNumber)"})
  void testSqrt_whenZero_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualSqrtResult = ComplexMathUtils.sqrt(ComplexNumber.ZERO);

    // Assert
    assertEquals(0.0d, actualSqrtResult.getImaginary());
    assertEquals(0.0d, actualSqrtResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#subtract(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is ten.
   *   <li>Then return Real is minus eight.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test subtract(double, ComplexNumber) with 'x', 'z'; when ComplexNumber(double) with real is ten; then return Real is minus eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(double, ComplexNumber)"})
  void testSubtractWithXZ_whenComplexNumberWithRealIsTen_thenReturnRealIsMinusEight() {
    // Arrange and Act
    ComplexNumber actualSubtractResult = ComplexMathUtils.subtract(2.0d, new ComplexNumber(10.0d));

    // Assert
    assertEquals(-0.0d, actualSubtractResult.getImaginary());
    assertEquals(-8.0d, actualSubtractResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#subtract(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is minus one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test subtract(double, ComplexNumber) with 'x', 'z'; when I; then return Imaginary is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(double, ComplexNumber)"})
  void testSubtractWithXZ_whenI_thenReturnImaginaryIsMinusOne() {
    // Arrange and Act
    ComplexNumber actualSubtractResult = ComplexMathUtils.subtract(2.0d, ComplexNumber.I);

    // Assert
    assertEquals(-1.0d, actualSubtractResult.getImaginary());
    assertEquals(2.0d, actualSubtractResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#subtract(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test subtract(double, ComplexNumber) with 'x', 'z'; when MINUS_I; then return Imaginary is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(double, ComplexNumber)"})
  void testSubtractWithXZ_whenMinus_i_thenReturnImaginaryIsOne() {
    // Arrange and Act
    ComplexNumber actualSubtractResult = ComplexMathUtils.subtract(2.0d, ComplexNumber.MINUS_I);

    // Assert
    assertEquals(1.0d, actualSubtractResult.getImaginary());
    assertEquals(2.0d, actualSubtractResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#subtract(double, ComplexNumber)} with {@code x}, {@code z}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return Imaginary is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(double, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test subtract(double, ComplexNumber) with 'x', 'z'; when ZERO; then return Imaginary is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(double, ComplexNumber)"})
  void testSubtractWithXZ_whenZero_thenReturnImaginaryIs00() {
    // Arrange and Act
    ComplexNumber actualSubtractResult = ComplexMathUtils.subtract(2.0d, ComplexNumber.ZERO);

    // Assert
    assertEquals(-0.0d, actualSubtractResult.getImaginary());
    assertEquals(2.0d, actualSubtractResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#subtract(ComplexNumber, ComplexNumber)} with {@code z1}, {@code
   * z2}.
   *
   * <ul>
   *   <li>Then return Imaginary is minus one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test subtract(ComplexNumber, ComplexNumber) with 'z1', 'z2'; then return Imaginary is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(ComplexNumber, ComplexNumber)"})
  void testSubtractWithZ1Z2_thenReturnImaginaryIsMinusOne() {
    // Arrange and Act
    ComplexNumber actualSubtractResult =
        ComplexMathUtils.subtract(new ComplexNumber(10.0d), ComplexNumber.I);

    // Assert
    assertEquals(-1.0d, actualSubtractResult.getImaginary());
    assertEquals(10.0d, actualSubtractResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#subtract(ComplexNumber, ComplexNumber)} with {@code z1}, {@code
   * z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return {@link ComplexNumber#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test subtract(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when I; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(ComplexNumber, ComplexNumber)"})
  void testSubtractWithZ1Z2_whenI_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(ComplexNumber.ZERO, ComplexMathUtils.subtract(ComplexNumber.I, ComplexNumber.I));
  }

  /**
   * Test {@link ComplexMathUtils#subtract(ComplexNumber, ComplexNumber)} with {@code z1}, {@code
   * z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is minus two.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test subtract(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when MINUS_I; then return Imaginary is minus two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(ComplexNumber, ComplexNumber)"})
  void testSubtractWithZ1Z2_whenMinus_i_thenReturnImaginaryIsMinusTwo() {
    // Arrange and Act
    ComplexNumber actualSubtractResult =
        ComplexMathUtils.subtract(ComplexNumber.MINUS_I, ComplexNumber.I);

    // Assert
    assertEquals(-2.0d, actualSubtractResult.getImaginary());
    assertEquals(0.0d, actualSubtractResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#subtract(ComplexNumber, ComplexNumber)} with {@code z1}, {@code
   * z2}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return {@link ComplexNumber#MINUS_I}.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(ComplexNumber, ComplexNumber)}
   */
  @Test
  @DisplayName(
      "Test subtract(ComplexNumber, ComplexNumber) with 'z1', 'z2'; when ZERO; then return MINUS_I")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(ComplexNumber, ComplexNumber)"})
  void testSubtractWithZ1Z2_whenZero_thenReturnMinus_i() {
    // Arrange, Act and Assert
    assertEquals(
        ComplexNumber.MINUS_I, ComplexMathUtils.subtract(ComplexNumber.ZERO, ComplexNumber.I));
  }

  /**
   * Test {@link ComplexMathUtils#subtract(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ComplexNumber(double)} with real is ten.
   *   <li>Then return Real is eight.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test subtract(ComplexNumber, double) with 'z', 'x'; when ComplexNumber(double) with real is ten; then return Real is eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(ComplexNumber, double)"})
  void testSubtractWithZX_whenComplexNumberWithRealIsTen_thenReturnRealIsEight() {
    // Arrange and Act
    ComplexNumber actualSubtractResult = ComplexMathUtils.subtract(new ComplexNumber(10.0d), 2.0d);

    // Assert
    assertEquals(0.0d, actualSubtractResult.getImaginary());
    assertEquals(8.0d, actualSubtractResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#subtract(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#I}.
   *   <li>Then return Imaginary is one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test subtract(ComplexNumber, double) with 'z', 'x'; when I; then return Imaginary is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(ComplexNumber, double)"})
  void testSubtractWithZX_whenI_thenReturnImaginaryIsOne() {
    // Arrange and Act
    ComplexNumber actualSubtractResult = ComplexMathUtils.subtract(ComplexNumber.I, 2.0d);

    // Assert
    assertEquals(-2.0d, actualSubtractResult.getReal());
    assertEquals(1.0d, actualSubtractResult.getImaginary());
  }

  /**
   * Test {@link ComplexMathUtils#subtract(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#MINUS_I}.
   *   <li>Then return Imaginary is minus one.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test subtract(ComplexNumber, double) with 'z', 'x'; when MINUS_I; then return Imaginary is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(ComplexNumber, double)"})
  void testSubtractWithZX_whenMinus_i_thenReturnImaginaryIsMinusOne() {
    // Arrange and Act
    ComplexNumber actualSubtractResult = ComplexMathUtils.subtract(ComplexNumber.MINUS_I, 2.0d);

    // Assert
    assertEquals(-1.0d, actualSubtractResult.getImaginary());
    assertEquals(-2.0d, actualSubtractResult.getReal());
  }

  /**
   * Test {@link ComplexMathUtils#subtract(ComplexNumber, double)} with {@code z}, {@code x}.
   *
   * <ul>
   *   <li>When {@link ComplexNumber#ZERO}.
   *   <li>Then return Imaginary is zero.
   * </ul>
   *
   * <p>Method under test: {@link ComplexMathUtils#subtract(ComplexNumber, double)}
   */
  @Test
  @DisplayName(
      "Test subtract(ComplexNumber, double) with 'z', 'x'; when ZERO; then return Imaginary is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ComplexNumber ComplexMathUtils.subtract(ComplexNumber, double)"})
  void testSubtractWithZX_whenZero_thenReturnImaginaryIsZero() {
    // Arrange and Act
    ComplexNumber actualSubtractResult = ComplexMathUtils.subtract(ComplexNumber.ZERO, 2.0d);

    // Assert
    assertEquals(-2.0d, actualSubtractResult.getReal());
    assertEquals(0.0d, actualSubtractResult.getImaginary());
  }
}
