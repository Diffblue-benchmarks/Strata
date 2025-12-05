package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PercentageDiffblueTest {
  /**
   * Test {@link Percentage#of(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then return toDecimalForm signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#of(Decimal)}
   */
  @Test
  @DisplayName("Test of(Decimal) with 'Decimal'; then return toDecimalForm signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.of(Decimal)"})
  void testOfWithDecimal_thenReturnToDecimalFormSignumIsMinusOne() {
    // Arrange and Act
    Percentage actualOfResult = Percentage.of(Decimal.ofScaled(-999999999999999999L, 18));

    // Assert
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    assertEquals(-1, toDecimalFormResult.signum());
    Decimal valuePercentResult = actualOfResult.valuePercent();
    assertEquals(-1, valuePercentResult.signum());
    Decimal absResult = toDecimalFormResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, toDecimalFormResult.negated());
    Decimal absResult3 = valuePercentResult.abs();
    Decimal absResult4 = absResult3.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valuePercentResult.negated());
    assertEquals(toDecimalFormResult, absResult.negated());
    assertEquals(valuePercentResult, absResult3.negated());
  }

  /**
   * Test {@link Percentage#of(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then return valuePercent negated scale is ten.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#of(Decimal)}
   */
  @Test
  @DisplayName("Test of(Decimal) with 'Decimal'; then return valuePercent negated scale is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.of(Decimal)"})
  void testOfWithDecimal_thenReturnValuePercentNegatedScaleIsTen() {
    // Arrange and Act
    Percentage actualOfResult = Percentage.of(Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Assert
    Decimal valuePercentResult = actualOfResult.valuePercent();
    Decimal negatedResult = valuePercentResult.negated();
    assertEquals(10, negatedResult.scale());
    assertEquals(10, valuePercentResult.scale());
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    Decimal negatedResult2 = toDecimalFormResult.negated();
    assertEquals(12, negatedResult2.scale());
    assertEquals(12, toDecimalFormResult.scale());
    assertEquals(toDecimalFormResult, negatedResult2.abs());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    assertEquals(toDecimalFormResult, negatedResult2.negated());
    assertEquals(valuePercentResult, negatedResult.abs());
    Decimal actualAbsResult2 = valuePercentResult.abs();
    assertEquals(valuePercentResult, actualAbsResult2);
    assertEquals(valuePercentResult, negatedResult.negated());
  }

  /**
   * Test {@link Percentage#of(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return toDecimalForm negated scale is two.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#of(Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Decimal) with 'Decimal'; when MAX_VALUE; then return toDecimalForm negated scale is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.of(Decimal)"})
  void testOfWithDecimal_whenMax_value_thenReturnToDecimalFormNegatedScaleIsTwo() {
    // Arrange and Act
    Percentage actualOfResult = Percentage.of(Decimal.MAX_VALUE);

    // Assert
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(2, negatedResult.scale());
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    assertSame(Decimal.MAX_VALUE, actualOfResult.valuePercent());
  }

  /**
   * Test {@link Percentage#of(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>When ofScaled ten and eighteen.
   *   <li>Then return toDecimalForm is {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#of(Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Decimal) with 'Decimal'; when ofScaled ten and eighteen; then return toDecimalForm is ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.of(Decimal)"})
  void testOfWithDecimal_whenOfScaledTenAndEighteen_thenReturnToDecimalFormIsZero() {
    // Arrange and Act
    Percentage actualOfResult = Percentage.of(Decimal.ofScaled(10L, 18));

    // Assert
    Decimal decimal = Decimal.ZERO;
    assertEquals(decimal, actualOfResult.toDecimalForm());
    assertSame(decimal, actualOfResult.valuePercent());
  }

  /**
   * Test {@link Percentage#of(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return toDecimalForm negated scale is three.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#of(double)}
   */
  @Test
  @DisplayName(
      "Test of(double) with 'double'; when '0.5'; then return toDecimalForm negated scale is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.of(double)"})
  void testOfWithDouble_when05_thenReturnToDecimalFormNegatedScaleIsThree() {
    // Arrange and Act
    Percentage actualOfResult = Percentage.of(0.5d);

    // Assert
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(3, negatedResult.scale());
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualOfResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link Percentage#of(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return toDecimalForm signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#of(double)}
   */
  @Test
  @DisplayName(
      "Test of(double) with 'double'; when '-0.5'; then return toDecimalForm signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.of(double)"})
  void testOfWithDouble_when05_thenReturnToDecimalFormSignumIsMinusOne() {
    // Arrange and Act
    Percentage actualOfResult = Percentage.of(-0.5d);

    // Assert
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    assertEquals(-1, toDecimalFormResult.signum());
    Decimal valuePercentResult = actualOfResult.valuePercent();
    assertEquals(-1, valuePercentResult.signum());
    Decimal absResult = toDecimalFormResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, toDecimalFormResult.negated());
    Decimal absResult3 = valuePercentResult.abs();
    Decimal absResult4 = absResult3.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valuePercentResult.negated());
    assertEquals(toDecimalFormResult, absResult.negated());
    assertEquals(valuePercentResult, absResult3.negated());
  }

  /**
   * Test {@link Percentage#of(double)} with {@code double}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return valuePercent negated scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#of(double)}
   */
  @Test
  @DisplayName(
      "Test of(double) with 'double'; when ten; then return valuePercent negated scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.of(double)"})
  void testOfWithDouble_whenTen_thenReturnValuePercentNegatedScaleIsZero() {
    // Arrange and Act
    Percentage actualOfResult = Percentage.of(10.0d);

    // Assert
    Decimal valuePercentResult = actualOfResult.valuePercent();
    Decimal negatedResult = valuePercentResult.negated();
    assertEquals(0, negatedResult.scale());
    assertEquals(0, valuePercentResult.scale());
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    Decimal negatedResult2 = toDecimalFormResult.negated();
    assertEquals(1, negatedResult2.scale());
    assertEquals(1, toDecimalFormResult.scale());
    assertEquals(toDecimalFormResult, negatedResult2.abs());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    assertEquals(toDecimalFormResult, negatedResult2.negated());
    assertEquals(valuePercentResult, negatedResult.abs());
    Decimal actualAbsResult2 = valuePercentResult.abs();
    assertEquals(valuePercentResult, actualAbsResult2);
    assertEquals(valuePercentResult, negatedResult.negated());
  }

  /**
   * Test {@link Percentage#fromDecimalForm(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>When {@link Decimal#ZERO}.
   *   <li>Then return toDecimalForm is {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#fromDecimalForm(Decimal)}
   */
  @Test
  @DisplayName(
      "Test fromDecimalForm(Decimal) with 'Decimal'; when ZERO; then return toDecimalForm is ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.fromDecimalForm(Decimal)"})
  void testFromDecimalFormWithDecimal_whenZero_thenReturnToDecimalFormIsZero() {
    // Arrange and Act
    Percentage actualFromDecimalFormResult = Percentage.fromDecimalForm(Decimal.ZERO);

    // Assert
    Decimal decimal = Decimal.ZERO;
    assertEquals(decimal, actualFromDecimalFormResult.toDecimalForm());
    assertEquals(decimal, actualFromDecimalFormResult.valuePercent());
  }

  /**
   * Test {@link Percentage#fromDecimalForm(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return toDecimalForm negated scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#fromDecimalForm(double)}
   */
  @Test
  @DisplayName(
      "Test fromDecimalForm(double) with 'double'; when '0.5'; then return toDecimalForm negated scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.fromDecimalForm(double)"})
  void testFromDecimalFormWithDouble_when05_thenReturnToDecimalFormNegatedScaleIsOne() {
    // Arrange and Act
    Percentage actualFromDecimalFormResult = Percentage.fromDecimalForm(0.5d);

    // Assert
    Decimal toDecimalFormResult = actualFromDecimalFormResult.toDecimalForm();
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(1, negatedResult.scale());
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualFromDecimalFormResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link Percentage#fromDecimalForm(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return toDecimalForm signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#fromDecimalForm(double)}
   */
  @Test
  @DisplayName(
      "Test fromDecimalForm(double) with 'double'; when '-0.5'; then return toDecimalForm signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.fromDecimalForm(double)"})
  void testFromDecimalFormWithDouble_when05_thenReturnToDecimalFormSignumIsMinusOne() {
    // Arrange and Act
    Percentage actualFromDecimalFormResult = Percentage.fromDecimalForm(-0.5d);

    // Assert
    Decimal toDecimalFormResult = actualFromDecimalFormResult.toDecimalForm();
    assertEquals(-1, toDecimalFormResult.signum());
    Decimal valuePercentResult = actualFromDecimalFormResult.valuePercent();
    assertEquals(-1, valuePercentResult.signum());
    Decimal absResult = toDecimalFormResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, toDecimalFormResult.negated());
    Decimal absResult3 = valuePercentResult.abs();
    Decimal absResult4 = absResult3.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valuePercentResult.negated());
    assertEquals(toDecimalFormResult, absResult.negated());
    assertEquals(valuePercentResult, absResult3.negated());
  }

  /**
   * Test {@link Percentage#fromDecimalForm(double)} with {@code double}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return toDecimalForm negated scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#fromDecimalForm(double)}
   */
  @Test
  @DisplayName(
      "Test fromDecimalForm(double) with 'double'; when ten; then return toDecimalForm negated scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.fromDecimalForm(double)"})
  void testFromDecimalFormWithDouble_whenTen_thenReturnToDecimalFormNegatedScaleIsZero() {
    // Arrange and Act
    Percentage actualFromDecimalFormResult = Percentage.fromDecimalForm(10.0d);

    // Assert
    Decimal toDecimalFormResult = actualFromDecimalFormResult.toDecimalForm();
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(0, negatedResult.scale());
    assertEquals(0, toDecimalFormResult.scale());
    assertEquals(toDecimalFormResult, negatedResult.abs());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualFromDecimalFormResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link Percentage#fromBasisPoints(BasisPoints)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm signum is one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#fromBasisPoints(BasisPoints)}
   */
  @Test
  @DisplayName("Test fromBasisPoints(BasisPoints); then return toDecimalForm signum is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.fromBasisPoints(BasisPoints)"})
  void testFromBasisPoints_thenReturnToDecimalFormSignumIsOne() {
    // Arrange
    BasisPoints basisPoints = BasisPoints.of(Decimal.MAX_VALUE);

    // Act
    Percentage actualFromBasisPointsResult = Percentage.fromBasisPoints(basisPoints);

    // Assert
    Decimal toDecimalFormResult = actualFromBasisPointsResult.toDecimalForm();
    assertEquals(1, toDecimalFormResult.signum());
    Decimal valuePercentResult = actualFromBasisPointsResult.valuePercent();
    assertEquals(1, valuePercentResult.signum());
    assertEquals(2, valuePercentResult.scale());
    assertEquals(4, toDecimalFormResult.scale());
    assertFalse(toDecimalFormResult.isZero());
    assertFalse(valuePercentResult.isZero());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualAbsResult2 = valuePercentResult.abs();
    assertEquals(valuePercentResult, actualAbsResult2);
    assertEquals(basisPoints, actualFromBasisPointsResult.toBasisPoints());
  }

  /**
   * Test {@link Percentage#fromBasisPoints(BasisPoints)}.
   *
   * <ul>
   *   <li>When {@link BasisPoints#ZERO}.
   *   <li>Then return toDecimalForm scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#fromBasisPoints(BasisPoints)}
   */
  @Test
  @DisplayName(
      "Test fromBasisPoints(BasisPoints); when ZERO; then return toDecimalForm scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.fromBasisPoints(BasisPoints)"})
  void testFromBasisPoints_whenZero_thenReturnToDecimalFormScaleIsZero() {
    // Arrange and Act
    Percentage actualFromBasisPointsResult = Percentage.fromBasisPoints(BasisPoints.ZERO);

    // Assert
    Decimal toDecimalFormResult = actualFromBasisPointsResult.toDecimalForm();
    assertEquals(0, toDecimalFormResult.scale());
    assertEquals(0, toDecimalFormResult.signum());
    assertTrue(toDecimalFormResult.isZero());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualNegatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, actualNegatedResult);
    assertEquals(toDecimalFormResult, actualFromBasisPointsResult.valuePercent());
    assertEquals(BasisPoints.ZERO, actualFromBasisPointsResult.toBasisPoints());
  }

  /**
   * Test {@link Percentage#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '42'; then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.parse(String)"})
  void testParse_when42_thenReturnToDecimalFormAbsAbsIsToDecimalForm() {
    // Arrange and Act
    Percentage actualParseResult = Percentage.parse("42");

    // Assert
    Decimal toDecimalFormResult = actualParseResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualParseResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link Percentage#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42%}.
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '42%'; then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.parse(String)"})
  void testParse_when42_thenReturnToDecimalFormAbsAbsIsToDecimalForm2() {
    // Arrange and Act
    Percentage actualParseResult = Percentage.parse("42%");

    // Assert
    Decimal toDecimalFormResult = actualParseResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualParseResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link Percentage#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42pct}.
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#parse(String)}
   */
  @Test
  @DisplayName(
      "Test parse(String); when '42pct'; then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.parse(String)"})
  void testParse_when42pct_thenReturnToDecimalFormAbsAbsIsToDecimalForm() {
    // Arrange and Act
    Percentage actualParseResult = Percentage.parse("42pct");

    // Assert
    Decimal toDecimalFormResult = actualParseResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualParseResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link Percentage#valuePercent()}.
   *
   * <p>Method under test: {@link Percentage#valuePercent()}
   */
  @Test
  @DisplayName("Test valuePercent()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Percentage.valuePercent()"})
  void testValuePercent() {
    // Arrange, Act and Assert
    assertSame(Decimal.ZERO, Percentage.ZERO.valuePercent());
  }

  /**
   * Test {@link Percentage#toDecimalForm()}.
   *
   * <ul>
   *   <li>Given {@link Percentage#ZERO}.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#toDecimalForm()}
   */
  @Test
  @DisplayName("Test toDecimalForm(); given ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Percentage.toDecimalForm()"})
  void testToDecimalForm_givenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(Decimal.ZERO, Percentage.ZERO.toDecimalForm());
  }

  /**
   * Test {@link Percentage#toDecimalForm()}.
   *
   * <ul>
   *   <li>Then return negated signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#toDecimalForm()}
   */
  @Test
  @DisplayName("Test toDecimalForm(); then return negated signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Percentage.toDecimalForm()"})
  void testToDecimalForm_thenReturnNegatedSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualToDecimalFormResult = Percentage.of(Decimal.MAX_VALUE).toDecimalForm();

    // Assert
    Decimal negatedResult = actualToDecimalFormResult.negated();
    assertEquals(-1, negatedResult.signum());
    assertEquals(1, actualToDecimalFormResult.signum());
    assertEquals(2, negatedResult.scale());
    assertEquals(2, actualToDecimalFormResult.scale());
    assertFalse(negatedResult.isZero());
    assertFalse(actualToDecimalFormResult.isZero());
    assertEquals(actualToDecimalFormResult, negatedResult.abs());
    Decimal actualAbsResult = actualToDecimalFormResult.abs();
    assertEquals(actualToDecimalFormResult, actualAbsResult);
    assertEquals(actualToDecimalFormResult, negatedResult.negated());
  }

  /**
   * Test {@link Percentage#toBasisPoints()}.
   *
   * <ul>
   *   <li>Given {@link Percentage#ZERO}.
   *   <li>Then return {@link BasisPoints#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#toBasisPoints()}
   */
  @Test
  @DisplayName("Test toBasisPoints(); given ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints Percentage.toBasisPoints()"})
  void testToBasisPoints_givenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(BasisPoints.ZERO, Percentage.ZERO.toBasisPoints());
  }

  /**
   * Test {@link Percentage#toBasisPoints()}.
   *
   * <ul>
   *   <li>Then return toDecimalForm signum is one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#toBasisPoints()}
   */
  @Test
  @DisplayName("Test toBasisPoints(); then return toDecimalForm signum is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints Percentage.toBasisPoints()"})
  void testToBasisPoints_thenReturnToDecimalFormSignumIsOne() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Act
    BasisPoints actualToBasisPointsResult = ofResult.toBasisPoints();

    // Assert
    Decimal toDecimalFormResult = actualToBasisPointsResult.toDecimalForm();
    assertEquals(1, toDecimalFormResult.signum());
    Decimal valueBasisPointsResult = actualToBasisPointsResult.valueBasisPoints();
    assertEquals(1, valueBasisPointsResult.signum());
    assertEquals(12, toDecimalFormResult.scale());
    assertEquals(8, valueBasisPointsResult.scale());
    assertFalse(toDecimalFormResult.isZero());
    assertFalse(valueBasisPointsResult.isZero());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualAbsResult2 = valueBasisPointsResult.abs();
    assertEquals(valueBasisPointsResult, actualAbsResult2);
    assertEquals(ofResult, actualToBasisPointsResult.toPercentage());
  }

  /**
   * Test {@link Percentage#plus(Percentage)}.
   *
   * <ul>
   *   <li>Given {@link Percentage} with percentage is {@link Decimal#MIN_VALUE}.
   *   <li>Then return toDecimalForm abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#plus(Percentage)}
   */
  @Test
  @DisplayName(
      "Test plus(Percentage); given Percentage with percentage is MIN_VALUE; then return toDecimalForm abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.plus(Percentage)"})
  void testPlus_givenPercentageWithPercentageIsMin_value_thenReturnToDecimalFormAbsAbs() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.MIN_VALUE);

    // Act
    Percentage actualPlusResult = ofResult.plus(Percentage.of(Decimal.of(42L)));

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    Decimal absResult = toDecimalFormResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, toDecimalFormResult.negated());
    Decimal valuePercentResult = actualPlusResult.valuePercent();
    Decimal absResult3 = valuePercentResult.abs();
    Decimal absResult4 = absResult3.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valuePercentResult.negated());
    assertEquals(toDecimalFormResult, absResult.negated());
    assertEquals(valuePercentResult, absResult3.negated());
  }

  /**
   * Test {@link Percentage#plus(Percentage)}.
   *
   * <ul>
   *   <li>Given {@link Percentage} with percentage is ofScaled {@code 999999999999999999} and one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#plus(Percentage)}
   */
  @Test
  @DisplayName(
      "Test plus(Percentage); given Percentage with percentage is ofScaled '999999999999999999' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.plus(Percentage)"})
  void testPlus_givenPercentageWithPercentageIsOfScaled999999999999999999AndOne() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.ofScaled(999999999999999999L, 1));

    // Act
    Percentage actualPlusResult = ofResult.plus(Percentage.of(Decimal.of(42L)));

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualPlusResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link Percentage#plus(Percentage)}.
   *
   * <ul>
   *   <li>Given {@link Percentage#ZERO}.
   *   <li>When {@link Percentage#ZERO}.
   *   <li>Then return toDecimalForm negated is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#plus(Percentage)}
   */
  @Test
  @DisplayName(
      "Test plus(Percentage); given ZERO; when ZERO; then return toDecimalForm negated is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.plus(Percentage)"})
  void testPlus_givenZero_whenZero_thenReturnToDecimalFormNegatedIsToDecimalForm() {
    // Arrange and Act
    Percentage actualPlusResult = Percentage.ZERO.plus(Percentage.ZERO);

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualNegatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, actualNegatedResult);
    assertEquals(toDecimalFormResult, actualPlusResult.valuePercent());
  }

  /**
   * Test {@link Percentage#plus(Percentage)}.
   *
   * <ul>
   *   <li>Then return {@link Percentage} with percentage is {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#plus(Percentage)}
   */
  @Test
  @DisplayName("Test plus(Percentage); then return Percentage with percentage is MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.plus(Percentage)"})
  void testPlus_thenReturnPercentageWithPercentageIsMax_value() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.MAX_VALUE);

    // Act
    Percentage actualPlusResult = ofResult.plus(Percentage.ZERO);

    // Assert
    assertEquals(ofResult, actualPlusResult);
  }

  /**
   * Test {@link Percentage#plus(Percentage)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#plus(Percentage)}
   */
  @Test
  @DisplayName("Test plus(Percentage); then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.plus(Percentage)"})
  void testPlus_thenReturnToDecimalFormAbsAbsIsToDecimalForm() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.ofScaled(-1486618625L, 1));

    // Act
    Percentage actualPlusResult = ofResult.plus(Percentage.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualPlusResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link Percentage#plus(Percentage)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm negated is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#plus(Percentage)}
   */
  @Test
  @DisplayName("Test plus(Percentage); then return toDecimalForm negated is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.plus(Percentage)"})
  void testPlus_thenReturnToDecimalFormNegatedIsToDecimalForm() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.MIN_VALUE);

    // Act
    Percentage actualPlusResult = ofResult.plus(Percentage.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualNegatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, actualNegatedResult);
    assertEquals(toDecimalFormResult, actualPlusResult.valuePercent());
  }

  /**
   * Test {@link Percentage#plus(Percentage)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm negated scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#plus(Percentage)}
   */
  @Test
  @DisplayName("Test plus(Percentage); then return toDecimalForm negated scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.plus(Percentage)"})
  void testPlus_thenReturnToDecimalFormNegatedScaleIsOne() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.ofScaled(-1635280488L, 1));

    // Act
    Percentage actualPlusResult = ofResult.plus(Percentage.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(1, negatedResult.scale());
    assertEquals(1, toDecimalFormResult.scale());
    assertEquals(toDecimalFormResult, negatedResult.abs());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualPlusResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link Percentage#plus(Percentage)}.
   *
   * <ul>
   *   <li>Then return valuePercent abs scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#plus(Percentage)}
   */
  @Test
  @DisplayName("Test plus(Percentage); then return valuePercent abs scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.plus(Percentage)"})
  void testPlus_thenReturnValuePercentAbsScaleIsOne() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.ofScaled(-1486618625L, 1));

    // Act
    Percentage actualPlusResult = ofResult.plus(Percentage.of(Decimal.of(42L)));

    // Assert
    Decimal valuePercentResult = actualPlusResult.valuePercent();
    Decimal absResult = valuePercentResult.abs();
    assertEquals(1, absResult.scale());
    assertEquals(1, valuePercentResult.scale());
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    Decimal absResult2 = toDecimalFormResult.abs();
    assertEquals(3, absResult2.scale());
    assertEquals(3, toDecimalFormResult.scale());
    Decimal absResult3 = absResult2.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    Decimal absResult4 = absResult.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valuePercentResult.negated());
    assertEquals(toDecimalFormResult, absResult2.negated());
    assertEquals(valuePercentResult, absResult.negated());
  }

  /**
   * Test {@link Percentage#minus(Percentage)}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   *   <li>Then return toDecimalForm abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#minus(Percentage)}
   */
  @Test
  @DisplayName(
      "Test minus(Percentage); given Decimal with value is forty-two; then return toDecimalForm abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.minus(Percentage)"})
  void testMinus_givenDecimalWithValueIsFortyTwo_thenReturnToDecimalFormAbsAbs() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.of(42L));

    // Act
    Percentage actualMinusResult = ofResult.minus(Percentage.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal absResult = toDecimalFormResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, toDecimalFormResult.negated());
    Decimal valuePercentResult = actualMinusResult.valuePercent();
    Decimal absResult3 = valuePercentResult.abs();
    Decimal absResult4 = absResult3.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valuePercentResult.negated());
    assertEquals(toDecimalFormResult, absResult.negated());
    assertEquals(valuePercentResult, absResult3.negated());
  }

  /**
   * Test {@link Percentage#minus(Percentage)}.
   *
   * <ul>
   *   <li>Given {@link Percentage} with percentage is ofScaled {@code -999999999999999999} and one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#minus(Percentage)}
   */
  @Test
  @DisplayName(
      "Test minus(Percentage); given Percentage with percentage is ofScaled '-999999999999999999' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.minus(Percentage)"})
  void testMinus_givenPercentageWithPercentageIsOfScaled999999999999999999AndOne() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.ofScaled(-999999999999999999L, 1));

    // Act
    Percentage actualMinusResult = ofResult.minus(Percentage.of(Decimal.of(42L)));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal absResult = toDecimalFormResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, toDecimalFormResult.negated());
    Decimal valuePercentResult = actualMinusResult.valuePercent();
    Decimal absResult3 = valuePercentResult.abs();
    Decimal absResult4 = absResult3.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valuePercentResult.negated());
    assertEquals(toDecimalFormResult, absResult.negated());
    assertEquals(valuePercentResult, absResult3.negated());
  }

  /**
   * Test {@link Percentage#minus(Percentage)}.
   *
   * <ul>
   *   <li>Given {@link Percentage#ZERO}.
   *   <li>Then return toDecimalForm abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#minus(Percentage)}
   */
  @Test
  @DisplayName("Test minus(Percentage); given ZERO; then return toDecimalForm abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.minus(Percentage)"})
  void testMinus_givenZero_thenReturnToDecimalFormAbsAbs() {
    // Arrange and Act
    Percentage actualMinusResult = Percentage.ZERO.minus(Percentage.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal absResult = toDecimalFormResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, toDecimalFormResult.negated());
    Decimal valuePercentResult = actualMinusResult.valuePercent();
    Decimal absResult3 = valuePercentResult.abs();
    Decimal absResult4 = absResult3.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valuePercentResult.negated());
    assertEquals(toDecimalFormResult, absResult.negated());
    assertEquals(valuePercentResult, absResult3.negated());
  }

  /**
   * Test {@link Percentage#minus(Percentage)}.
   *
   * <ul>
   *   <li>Given {@link Percentage#ZERO}.
   *   <li>When {@link Percentage#ZERO}.
   *   <li>Then return toDecimalForm negated is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#minus(Percentage)}
   */
  @Test
  @DisplayName(
      "Test minus(Percentage); given ZERO; when ZERO; then return toDecimalForm negated is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.minus(Percentage)"})
  void testMinus_givenZero_whenZero_thenReturnToDecimalFormNegatedIsToDecimalForm() {
    // Arrange and Act
    Percentage actualMinusResult = Percentage.ZERO.minus(Percentage.ZERO);

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualNegatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, actualNegatedResult);
    assertEquals(toDecimalFormResult, actualMinusResult.valuePercent());
  }

  /**
   * Test {@link Percentage#minus(Percentage)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm negated is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#minus(Percentage)}
   */
  @Test
  @DisplayName("Test minus(Percentage); then return toDecimalForm negated is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.minus(Percentage)"})
  void testMinus_thenReturnToDecimalFormNegatedIsToDecimalForm() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.MAX_VALUE);

    // Act
    Percentage actualMinusResult = ofResult.minus(Percentage.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualNegatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, actualNegatedResult);
    assertEquals(toDecimalFormResult, actualMinusResult.valuePercent());
  }

  /**
   * Test {@link Percentage#minus(Percentage)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm negated scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#minus(Percentage)}
   */
  @Test
  @DisplayName("Test minus(Percentage); then return toDecimalForm negated scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.minus(Percentage)"})
  void testMinus_thenReturnToDecimalFormNegatedScaleIsOne() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.ofScaled(-1635280488L, 1));

    // Act
    Percentage actualMinusResult = ofResult.minus(Percentage.of(Decimal.MIN_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(1, negatedResult.scale());
    assertEquals(1, toDecimalFormResult.scale());
    assertEquals(toDecimalFormResult, negatedResult.abs());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualMinusResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link Percentage#minus(Percentage)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm negated scale is two.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#minus(Percentage)}
   */
  @Test
  @DisplayName("Test minus(Percentage); then return toDecimalForm negated scale is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.minus(Percentage)"})
  void testMinus_thenReturnToDecimalFormNegatedScaleIsTwo() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.ofScaled(-1486618625L, 1));

    // Act
    Percentage actualMinusResult = ofResult.minus(Percentage.of(Decimal.MIN_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(2, negatedResult.scale());
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualMinusResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link Percentage#minus(Percentage)}.
   *
   * <ul>
   *   <li>When {@link Decimal} with value is forty-two.
   *   <li>Then return valuePercent abs scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#minus(Percentage)}
   */
  @Test
  @DisplayName(
      "Test minus(Percentage); when Decimal with value is forty-two; then return valuePercent abs scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.minus(Percentage)"})
  void testMinus_whenDecimalWithValueIsFortyTwo_thenReturnValuePercentAbsScaleIsOne() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.ofScaled(-1486618625L, 1));

    // Act
    Percentage actualMinusResult = ofResult.minus(Percentage.of(Decimal.of(42L)));

    // Assert
    Decimal valuePercentResult = actualMinusResult.valuePercent();
    Decimal absResult = valuePercentResult.abs();
    assertEquals(1, absResult.scale());
    assertEquals(1, valuePercentResult.scale());
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal absResult2 = toDecimalFormResult.abs();
    assertEquals(3, absResult2.scale());
    assertEquals(3, toDecimalFormResult.scale());
    Decimal absResult3 = absResult2.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    Decimal absResult4 = absResult.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valuePercentResult.negated());
    assertEquals(toDecimalFormResult, absResult2.negated());
    assertEquals(valuePercentResult, absResult.negated());
  }

  /**
   * Test {@link Percentage#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>Then return toDecimalForm negated abs abs abs scale is two.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); given MAX_VALUE; then return toDecimalForm negated abs abs abs scale is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.map(UnaryOperator)"})
  void testMap_givenMax_value_thenReturnToDecimalFormNegatedAbsAbsAbsScaleIsTwo() {
    // Arrange
    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.MAX_VALUE);

    // Act
    Percentage actualMapResult = Percentage.ZERO.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    Decimal negatedResult = actualMapResult.toDecimalForm().negated();
    Decimal absResult = negatedResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(2, absResult2.abs().scale());
    Decimal negatedResult2 = negatedResult.negated();
    Decimal absResult3 = negatedResult2.abs();
    assertEquals(2, absResult3.abs().scale());
    assertEquals(2, absResult2.scale());
    Decimal negatedResult3 = absResult.negated();
    assertEquals(2, negatedResult3.abs().scale());
    Decimal negatedResult4 = negatedResult2.negated();
    assertEquals(2, negatedResult4.abs().scale());
    assertEquals(2, absResult3.scale());
    assertEquals(2, absResult.scale());
    assertEquals(2, absResult2.negated().scale());
    assertEquals(2, absResult3.negated().scale());
    assertEquals(2, negatedResult3.scale());
    assertEquals(2, negatedResult3.negated().scale());
    assertEquals(2, negatedResult4.negated().scale());
    assertEquals(2, negatedResult4.scale());
    assertEquals(2, negatedResult2.scale());
    assertEquals(2, negatedResult.scale());
  }

  /**
   * Test {@link Percentage#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given ofScaled {@link Long#MAX_VALUE} and eighteen.
   *   <li>Then return valuePercent abs abs scale is ten.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); given ofScaled MAX_VALUE and eighteen; then return valuePercent abs abs scale is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.map(UnaryOperator)"})
  void testMap_givenOfScaledMax_valueAndEighteen_thenReturnValuePercentAbsAbsScaleIsTen() {
    // Arrange
    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Act
    Percentage actualMapResult = Percentage.ZERO.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    Decimal valuePercentResult = actualMapResult.valuePercent();
    Decimal absResult = valuePercentResult.abs();
    assertEquals(10, absResult.abs().scale());
    Decimal negatedResult = valuePercentResult.negated();
    assertEquals(10, negatedResult.abs().scale());
    assertEquals(10, absResult.scale());
    assertEquals(10, absResult.negated().scale());
    assertEquals(10, negatedResult.negated().scale());
    assertEquals(10, negatedResult.scale());
    assertEquals(10, valuePercentResult.scale());
    Decimal toDecimalFormResult = actualMapResult.toDecimalForm();
    Decimal absResult2 = toDecimalFormResult.abs();
    assertEquals(12, absResult2.abs().scale());
    Decimal negatedResult2 = toDecimalFormResult.negated();
    assertEquals(12, negatedResult2.abs().scale());
    assertEquals(12, absResult2.scale());
    assertEquals(12, absResult2.negated().scale());
    assertEquals(12, negatedResult2.negated().scale());
    assertEquals(12, negatedResult2.scale());
    assertEquals(12, toDecimalFormResult.scale());
  }

  /**
   * Test {@link Percentage#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given ofScaled ten and eighteen.
   *   <li>Then return {@link Percentage#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#map(UnaryOperator)}
   */
  @Test
  @DisplayName("Test map(UnaryOperator); given ofScaled ten and eighteen; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.map(UnaryOperator)"})
  void testMap_givenOfScaledTenAndEighteen_thenReturnZero() {
    // Arrange
    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.ofScaled(10L, 18));

    // Act
    Percentage actualMapResult = Percentage.ZERO.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    assertEquals(Percentage.ZERO, actualMapResult);
  }

  /**
   * Test {@link Percentage#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#map(UnaryOperator)}
   */
  @Test
  @DisplayName("Test map(UnaryOperator); then return toDecimalForm signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage Percentage.map(UnaryOperator)"})
  void testMap_thenReturnToDecimalFormSignumIsMinusOne() {
    // Arrange
    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any()))
        .thenReturn(Decimal.ofScaled(-999999999999999999L, 18));

    // Act
    Percentage actualMapResult = Percentage.ZERO.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    Decimal toDecimalFormResult = actualMapResult.toDecimalForm();
    assertEquals(-1, toDecimalFormResult.signum());
    Decimal valuePercentResult = actualMapResult.valuePercent();
    assertEquals(-1, valuePercentResult.signum());
    Decimal absResult = valuePercentResult.abs().abs().abs();
    assertEquals(absResult, absResult);
    assertEquals(absResult, valuePercentResult.negated());
    Decimal absResult2 = toDecimalFormResult.abs();
    Decimal absResult3 = absResult2.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    assertEquals(toDecimalFormResult, absResult2.negated());
  }

  /**
   * Test {@link Percentage#compareTo(Percentage)} with {@code Percentage}.
   *
   * <ul>
   *   <li>Given {@link Percentage#ZERO}.
   *   <li>When {@link Percentage#ZERO}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#compareTo(Percentage)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Percentage) with 'Percentage'; given ZERO; when ZERO; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Percentage.compareTo(Percentage)"})
  void testCompareToWithPercentage_givenZero_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, Percentage.ZERO.compareTo(Percentage.ZERO));
  }

  /**
   * Test {@link Percentage#compareTo(Percentage)} with {@code Percentage}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#compareTo(Percentage)}
   */
  @Test
  @DisplayName("Test compareTo(Percentage) with 'Percentage'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Percentage.compareTo(Percentage)"})
  void testCompareToWithPercentage_thenReturnMinusOne() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.ofScaled(1L, 1));

    // Act and Assert
    assertEquals(-1, ofResult.compareTo(Percentage.of(Decimal.MAX_VALUE)));
  }

  /**
   * Test {@link Percentage#compareTo(Percentage)} with {@code Percentage}.
   *
   * <ul>
   *   <li>When {@link Percentage} with percentage is {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#compareTo(Percentage)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Percentage) with 'Percentage'; when Percentage with percentage is MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Percentage.compareTo(Percentage)"})
  void testCompareToWithPercentage_whenPercentageWithPercentageIsMin_value() {
    // Arrange
    Percentage ofResult = Percentage.of(Decimal.ofScaled(1L, 1));

    // Act and Assert
    assertEquals(1, ofResult.compareTo(Percentage.of(Decimal.MIN_VALUE)));
  }

  /**
   * Test {@link Percentage#compareTo(Percentage)} with {@code Percentage}.
   *
   * <ul>
   *   <li>When {@link Percentage#ZERO}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#compareTo(Percentage)}
   */
  @Test
  @DisplayName("Test compareTo(Percentage) with 'Percentage'; when ZERO; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Percentage.compareTo(Percentage)"})
  void testCompareToWithPercentage_whenZero_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, Percentage.of(Decimal.ofScaled(1L, 1)).compareTo(Percentage.ZERO));
  }

  /**
   * Test {@link Percentage#equals(Object)}, and {@link Percentage#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Percentage#equals(Object)}
   *   <li>{@link Percentage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Percentage.equals(Object)", "int Percentage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Percentage percentage = Percentage.ZERO;
    Percentage percentage2 = Percentage.ZERO;

    // Act and Assert
    assertEquals(percentage, percentage2);
    assertEquals(percentage.hashCode(), percentage2.hashCode());
  }

  /**
   * Test {@link Percentage#equals(Object)}, and {@link Percentage#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Percentage#equals(Object)}
   *   <li>{@link Percentage#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Percentage.equals(Object)", "int Percentage.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Percentage percentage = Percentage.ZERO;

    // Act and Assert
    assertEquals(percentage, percentage);
    int expectedHashCodeResult = percentage.hashCode();
    assertEquals(expectedHashCodeResult, percentage.hashCode());
  }

  /**
   * Test {@link Percentage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Percentage.equals(Object)", "int Percentage.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Percentage.of(Decimal.MAX_VALUE), Percentage.ZERO);
  }

  /**
   * Test {@link Percentage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Percentage.equals(Object)", "int Percentage.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Percentage.ZERO, null);
  }

  /**
   * Test {@link Percentage#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Percentage#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Percentage.equals(Object)", "int Percentage.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Percentage.ZERO, "Different type to Percentage");
  }

  /**
   * Test {@link Percentage#toString()}.
   *
   * <p>Method under test: {@link Percentage#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Percentage.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("999999999999999999%", Percentage.of(Decimal.MAX_VALUE).toString());
  }
}
