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

class BasisPointsDiffblueTest {
  /**
   * Test {@link BasisPoints#of(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then return toDecimalForm scale is twelve.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#of(Decimal)}
   */
  @Test
  @DisplayName("Test of(Decimal) with 'Decimal'; then return toDecimalForm scale is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.of(Decimal)"})
  void testOfWithDecimal_thenReturnToDecimalFormScaleIsTwelve() {
    // Arrange and Act
    BasisPoints actualOfResult = BasisPoints.of(Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Assert
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    assertEquals(12, toDecimalFormResult.scale());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(12, negatedResult.scale());
    Decimal valueBasisPointsResult = actualOfResult.valueBasisPoints();
    assertEquals(8, valueBasisPointsResult.scale());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(8, negatedResult2.scale());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal actualAbsResult2 = valueBasisPointsResult.abs();
    assertEquals(valueBasisPointsResult, actualAbsResult2);
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link BasisPoints#of(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then return toDecimalForm signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#of(Decimal)}
   */
  @Test
  @DisplayName("Test of(Decimal) with 'Decimal'; then return toDecimalForm signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.of(Decimal)"})
  void testOfWithDecimal_thenReturnToDecimalFormSignumIsMinusOne() {
    // Arrange and Act
    BasisPoints actualOfResult = BasisPoints.of(Decimal.ofScaled(-999999999999999999L, 18));

    // Assert
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    assertEquals(-1, toDecimalFormResult.signum());
    Decimal valueBasisPointsResult = actualOfResult.valueBasisPoints();
    assertEquals(-1, valueBasisPointsResult.signum());
    Decimal absResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, absResult.negated());
    Decimal absResult2 = valueBasisPointsResult.abs();
    assertEquals(valueBasisPointsResult, absResult2.negated());
    Decimal absResult3 = absResult.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    Decimal absResult4 = absResult2.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valueBasisPointsResult.negated());
  }

  /**
   * Test {@link BasisPoints#of(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return toDecimalForm negated scale is four.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#of(Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Decimal) with 'Decimal'; when MAX_VALUE; then return toDecimalForm negated scale is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.of(Decimal)"})
  void testOfWithDecimal_whenMax_value_thenReturnToDecimalFormNegatedScaleIsFour() {
    // Arrange and Act
    BasisPoints actualOfResult = BasisPoints.of(Decimal.MAX_VALUE);

    // Assert
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(4, negatedResult.scale());
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    assertSame(Decimal.MAX_VALUE, actualOfResult.valueBasisPoints());
  }

  /**
   * Test {@link BasisPoints#of(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>When ofScaled eight and eighteen.
   *   <li>Then return toDecimalForm is {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#of(Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Decimal) with 'Decimal'; when ofScaled eight and eighteen; then return toDecimalForm is ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.of(Decimal)"})
  void testOfWithDecimal_whenOfScaledEightAndEighteen_thenReturnToDecimalFormIsZero() {
    // Arrange and Act
    BasisPoints actualOfResult = BasisPoints.of(Decimal.ofScaled(8L, 18));

    // Assert
    Decimal decimal = Decimal.ZERO;
    assertEquals(decimal, actualOfResult.toDecimalForm());
    assertSame(decimal, actualOfResult.valueBasisPoints());
  }

  /**
   * Test {@link BasisPoints#of(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return toDecimalForm negated scale is five.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#of(double)}
   */
  @Test
  @DisplayName(
      "Test of(double) with 'double'; when '0.5'; then return toDecimalForm negated scale is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.of(double)"})
  void testOfWithDouble_when05_thenReturnToDecimalFormNegatedScaleIsFive() {
    // Arrange and Act
    BasisPoints actualOfResult = BasisPoints.of(0.5d);

    // Assert
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(5, negatedResult.scale());
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualOfResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link BasisPoints#of(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return toDecimalForm signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#of(double)}
   */
  @Test
  @DisplayName(
      "Test of(double) with 'double'; when '-0.5'; then return toDecimalForm signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.of(double)"})
  void testOfWithDouble_when05_thenReturnToDecimalFormSignumIsMinusOne() {
    // Arrange and Act
    BasisPoints actualOfResult = BasisPoints.of(-0.5d);

    // Assert
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    assertEquals(-1, toDecimalFormResult.signum());
    Decimal valueBasisPointsResult = actualOfResult.valueBasisPoints();
    assertEquals(-1, valueBasisPointsResult.signum());
    Decimal absResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, absResult.negated());
    Decimal absResult2 = valueBasisPointsResult.abs();
    assertEquals(valueBasisPointsResult, absResult2.negated());
    Decimal absResult3 = absResult.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    Decimal absResult4 = absResult2.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valueBasisPointsResult.negated());
  }

  /**
   * Test {@link BasisPoints#of(double)} with {@code double}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return valueBasisPoints scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#of(double)}
   */
  @Test
  @DisplayName(
      "Test of(double) with 'double'; when ten; then return valueBasisPoints scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.of(double)"})
  void testOfWithDouble_whenTen_thenReturnValueBasisPointsScaleIsZero() {
    // Arrange and Act
    BasisPoints actualOfResult = BasisPoints.of(10.0d);

    // Assert
    Decimal valueBasisPointsResult = actualOfResult.valueBasisPoints();
    assertEquals(0, valueBasisPointsResult.scale());
    Decimal negatedResult = valueBasisPointsResult.negated();
    assertEquals(0, negatedResult.scale());
    Decimal toDecimalFormResult = actualOfResult.toDecimalForm();
    assertEquals(3, toDecimalFormResult.scale());
    Decimal negatedResult2 = toDecimalFormResult.negated();
    assertEquals(3, negatedResult2.scale());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    assertEquals(toDecimalFormResult, negatedResult2.abs());
    assertEquals(toDecimalFormResult, negatedResult2.negated());
    Decimal actualAbsResult2 = valueBasisPointsResult.abs();
    assertEquals(valueBasisPointsResult, actualAbsResult2);
    assertEquals(valueBasisPointsResult, negatedResult.abs());
    assertEquals(valueBasisPointsResult, negatedResult.negated());
  }

  /**
   * Test {@link BasisPoints#fromDecimalForm(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>When {@link Decimal#ZERO}.
   *   <li>Then return toDecimalForm is {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#fromDecimalForm(Decimal)}
   */
  @Test
  @DisplayName(
      "Test fromDecimalForm(Decimal) with 'Decimal'; when ZERO; then return toDecimalForm is ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.fromDecimalForm(Decimal)"})
  void testFromDecimalFormWithDecimal_whenZero_thenReturnToDecimalFormIsZero() {
    // Arrange and Act
    BasisPoints actualFromDecimalFormResult = BasisPoints.fromDecimalForm(Decimal.ZERO);

    // Assert
    Decimal decimal = Decimal.ZERO;
    assertEquals(decimal, actualFromDecimalFormResult.toDecimalForm());
    assertEquals(decimal, actualFromDecimalFormResult.valueBasisPoints());
  }

  /**
   * Test {@link BasisPoints#fromDecimalForm(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return toDecimalForm negated scale is one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#fromDecimalForm(double)}
   */
  @Test
  @DisplayName(
      "Test fromDecimalForm(double) with 'double'; when '0.5'; then return toDecimalForm negated scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.fromDecimalForm(double)"})
  void testFromDecimalFormWithDouble_when05_thenReturnToDecimalFormNegatedScaleIsOne() {
    // Arrange and Act
    BasisPoints actualFromDecimalFormResult = BasisPoints.fromDecimalForm(0.5d);

    // Assert
    Decimal toDecimalFormResult = actualFromDecimalFormResult.toDecimalForm();
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(1, negatedResult.scale());
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualFromDecimalFormResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link BasisPoints#fromDecimalForm(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return toDecimalForm signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#fromDecimalForm(double)}
   */
  @Test
  @DisplayName(
      "Test fromDecimalForm(double) with 'double'; when '-0.5'; then return toDecimalForm signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.fromDecimalForm(double)"})
  void testFromDecimalFormWithDouble_when05_thenReturnToDecimalFormSignumIsMinusOne() {
    // Arrange and Act
    BasisPoints actualFromDecimalFormResult = BasisPoints.fromDecimalForm(-0.5d);

    // Assert
    Decimal toDecimalFormResult = actualFromDecimalFormResult.toDecimalForm();
    assertEquals(-1, toDecimalFormResult.signum());
    Decimal valueBasisPointsResult = actualFromDecimalFormResult.valueBasisPoints();
    assertEquals(-1, valueBasisPointsResult.signum());
    Decimal absResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, absResult.negated());
    Decimal absResult2 = valueBasisPointsResult.abs();
    assertEquals(valueBasisPointsResult, absResult2.negated());
    Decimal absResult3 = absResult.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    Decimal absResult4 = absResult2.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valueBasisPointsResult.negated());
  }

  /**
   * Test {@link BasisPoints#fromDecimalForm(double)} with {@code double}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return toDecimalForm scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#fromDecimalForm(double)}
   */
  @Test
  @DisplayName(
      "Test fromDecimalForm(double) with 'double'; when ten; then return toDecimalForm scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.fromDecimalForm(double)"})
  void testFromDecimalFormWithDouble_whenTen_thenReturnToDecimalFormScaleIsZero() {
    // Arrange and Act
    BasisPoints actualFromDecimalFormResult = BasisPoints.fromDecimalForm(10.0d);

    // Assert
    Decimal toDecimalFormResult = actualFromDecimalFormResult.toDecimalForm();
    assertEquals(0, toDecimalFormResult.scale());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(0, negatedResult.scale());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualFromDecimalFormResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link BasisPoints#fromPercentage(Percentage)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm signum is one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#fromPercentage(Percentage)}
   */
  @Test
  @DisplayName("Test fromPercentage(Percentage); then return toDecimalForm signum is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.fromPercentage(Percentage)"})
  void testFromPercentage_thenReturnToDecimalFormSignumIsOne() {
    // Arrange
    Percentage percentage = Percentage.of(Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Act
    BasisPoints actualFromPercentageResult = BasisPoints.fromPercentage(percentage);

    // Assert
    Decimal toDecimalFormResult = actualFromPercentageResult.toDecimalForm();
    assertEquals(1, toDecimalFormResult.signum());
    Decimal valueBasisPointsResult = actualFromPercentageResult.valueBasisPoints();
    assertEquals(1, valueBasisPointsResult.signum());
    assertEquals(12, toDecimalFormResult.scale());
    assertEquals(8, valueBasisPointsResult.scale());
    assertFalse(toDecimalFormResult.isZero());
    assertFalse(valueBasisPointsResult.isZero());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualAbsResult2 = valueBasisPointsResult.abs();
    assertEquals(valueBasisPointsResult, actualAbsResult2);
    assertEquals(percentage, actualFromPercentageResult.toPercentage());
  }

  /**
   * Test {@link BasisPoints#fromPercentage(Percentage)}.
   *
   * <ul>
   *   <li>When {@link Percentage#ZERO}.
   *   <li>Then return toDecimalForm scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#fromPercentage(Percentage)}
   */
  @Test
  @DisplayName(
      "Test fromPercentage(Percentage); when ZERO; then return toDecimalForm scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.fromPercentage(Percentage)"})
  void testFromPercentage_whenZero_thenReturnToDecimalFormScaleIsZero() {
    // Arrange and Act
    BasisPoints actualFromPercentageResult = BasisPoints.fromPercentage(Percentage.ZERO);

    // Assert
    Decimal toDecimalFormResult = actualFromPercentageResult.toDecimalForm();
    assertEquals(0, toDecimalFormResult.scale());
    assertEquals(0, toDecimalFormResult.signum());
    assertTrue(toDecimalFormResult.isZero());
    assertEquals(toDecimalFormResult, actualFromPercentageResult.valueBasisPoints());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualNegatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, actualNegatedResult);
    assertEquals(Percentage.ZERO, actualFromPercentageResult.toPercentage());
  }

  /**
   * Test {@link BasisPoints#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '42'; then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.parse(String)"})
  void testParse_when42_thenReturnToDecimalFormAbsAbsIsToDecimalForm() {
    // Arrange and Act
    BasisPoints actualParseResult = BasisPoints.parse("42");

    // Assert
    Decimal toDecimalFormResult = actualParseResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualParseResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link BasisPoints#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42bps}.
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#parse(String)}
   */
  @Test
  @DisplayName(
      "Test parse(String); when '42bps'; then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.parse(String)"})
  void testParse_when42bps_thenReturnToDecimalFormAbsAbsIsToDecimalForm() {
    // Arrange and Act
    BasisPoints actualParseResult = BasisPoints.parse("42bps");

    // Assert
    Decimal toDecimalFormResult = actualParseResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualParseResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link BasisPoints#valueBasisPoints()}.
   *
   * <p>Method under test: {@link BasisPoints#valueBasisPoints()}
   */
  @Test
  @DisplayName("Test valueBasisPoints()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal BasisPoints.valueBasisPoints()"})
  void testValueBasisPoints() {
    // Arrange, Act and Assert
    assertSame(Decimal.ZERO, BasisPoints.ZERO.valueBasisPoints());
  }

  /**
   * Test {@link BasisPoints#toDecimalForm()}.
   *
   * <ul>
   *   <li>Given {@link BasisPoints#ZERO}.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#toDecimalForm()}
   */
  @Test
  @DisplayName("Test toDecimalForm(); given ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal BasisPoints.toDecimalForm()"})
  void testToDecimalForm_givenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(Decimal.ZERO, BasisPoints.ZERO.toDecimalForm());
  }

  /**
   * Test {@link BasisPoints#toDecimalForm()}.
   *
   * <ul>
   *   <li>Then return negated signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#toDecimalForm()}
   */
  @Test
  @DisplayName("Test toDecimalForm(); then return negated signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal BasisPoints.toDecimalForm()"})
  void testToDecimalForm_thenReturnNegatedSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualToDecimalFormResult = BasisPoints.of(Decimal.MAX_VALUE).toDecimalForm();

    // Assert
    Decimal negatedResult = actualToDecimalFormResult.negated();
    assertEquals(-1, negatedResult.signum());
    assertEquals(1, actualToDecimalFormResult.signum());
    assertEquals(4, actualToDecimalFormResult.scale());
    assertEquals(4, negatedResult.scale());
    assertFalse(actualToDecimalFormResult.isZero());
    assertFalse(negatedResult.isZero());
    Decimal actualAbsResult = actualToDecimalFormResult.abs();
    assertEquals(actualToDecimalFormResult, actualAbsResult);
    assertEquals(actualToDecimalFormResult, negatedResult.abs());
    assertEquals(actualToDecimalFormResult, negatedResult.negated());
  }

  /**
   * Test {@link BasisPoints#toPercentage()}.
   *
   * <ul>
   *   <li>Given {@link BasisPoints#ZERO}.
   *   <li>Then return {@link Percentage#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#toPercentage()}
   */
  @Test
  @DisplayName("Test toPercentage(); given ZERO; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage BasisPoints.toPercentage()"})
  void testToPercentage_givenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(Percentage.ZERO, BasisPoints.ZERO.toPercentage());
  }

  /**
   * Test {@link BasisPoints#toPercentage()}.
   *
   * <ul>
   *   <li>Then return toDecimalForm signum is one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#toPercentage()}
   */
  @Test
  @DisplayName("Test toPercentage(); then return toDecimalForm signum is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage BasisPoints.toPercentage()"})
  void testToPercentage_thenReturnToDecimalFormSignumIsOne() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.MAX_VALUE);

    // Act
    Percentage actualToPercentageResult = ofResult.toPercentage();

    // Assert
    Decimal toDecimalFormResult = actualToPercentageResult.toDecimalForm();
    assertEquals(1, toDecimalFormResult.signum());
    Decimal valuePercentResult = actualToPercentageResult.valuePercent();
    assertEquals(1, valuePercentResult.signum());
    assertEquals(2, valuePercentResult.scale());
    assertEquals(4, toDecimalFormResult.scale());
    assertFalse(toDecimalFormResult.isZero());
    assertFalse(valuePercentResult.isZero());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualAbsResult2 = valuePercentResult.abs();
    assertEquals(valuePercentResult, actualAbsResult2);
    assertEquals(ofResult, actualToPercentageResult.toBasisPoints());
  }

  /**
   * Test {@link BasisPoints#plus(BasisPoints)}.
   *
   * <ul>
   *   <li>Given {@link BasisPoints} with basisPoints is ofScaled {@code 999999999999999999} and
   *       one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#plus(BasisPoints)}
   */
  @Test
  @DisplayName(
      "Test plus(BasisPoints); given BasisPoints with basisPoints is ofScaled '999999999999999999' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.plus(BasisPoints)"})
  void testPlus_givenBasisPointsWithBasisPointsIsOfScaled999999999999999999AndOne() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.ofScaled(999999999999999999L, 1));

    // Act
    BasisPoints actualPlusResult = ofResult.plus(BasisPoints.of(Decimal.of(42L)));

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualPlusResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link BasisPoints#plus(BasisPoints)}.
   *
   * <ul>
   *   <li>Given {@link BasisPoints#ZERO}.
   *   <li>When {@link BasisPoints#ZERO}.
   *   <li>Then return valueBasisPoints is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#plus(BasisPoints)}
   */
  @Test
  @DisplayName(
      "Test plus(BasisPoints); given ZERO; when ZERO; then return valueBasisPoints is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.plus(BasisPoints)"})
  void testPlus_givenZero_whenZero_thenReturnValueBasisPointsIsToDecimalForm() {
    // Arrange and Act
    BasisPoints actualPlusResult = BasisPoints.ZERO.plus(BasisPoints.ZERO);

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    assertEquals(toDecimalFormResult, actualPlusResult.valueBasisPoints());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualNegatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, actualNegatedResult);
  }

  /**
   * Test {@link BasisPoints#plus(BasisPoints)}.
   *
   * <ul>
   *   <li>Then return {@link BasisPoints} with basisPoints is {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#plus(BasisPoints)}
   */
  @Test
  @DisplayName("Test plus(BasisPoints); then return BasisPoints with basisPoints is MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.plus(BasisPoints)"})
  void testPlus_thenReturnBasisPointsWithBasisPointsIsMax_value() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.MAX_VALUE);

    // Act
    BasisPoints actualPlusResult = ofResult.plus(BasisPoints.ZERO);

    // Assert
    assertEquals(ofResult, actualPlusResult);
  }

  /**
   * Test {@link BasisPoints#plus(BasisPoints)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#plus(BasisPoints)}
   */
  @Test
  @DisplayName("Test plus(BasisPoints); then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.plus(BasisPoints)"})
  void testPlus_thenReturnToDecimalFormAbsAbsIsToDecimalForm() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.ofScaled(-1486618625L, 1));

    // Act
    BasisPoints actualPlusResult = ofResult.plus(BasisPoints.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualPlusResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link BasisPoints#plus(BasisPoints)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm abs negated is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#plus(BasisPoints)}
   */
  @Test
  @DisplayName("Test plus(BasisPoints); then return toDecimalForm abs negated is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.plus(BasisPoints)"})
  void testPlus_thenReturnToDecimalFormAbsNegatedIsToDecimalForm() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.MIN_VALUE);

    // Act
    BasisPoints actualPlusResult = ofResult.plus(BasisPoints.of(Decimal.of(42L)));

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    Decimal absResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, absResult.negated());
    Decimal valueBasisPointsResult = actualPlusResult.valueBasisPoints();
    Decimal absResult2 = valueBasisPointsResult.abs();
    assertEquals(valueBasisPointsResult, absResult2.negated());
    Decimal absResult3 = absResult.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    Decimal absResult4 = absResult2.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valueBasisPointsResult.negated());
  }

  /**
   * Test {@link BasisPoints#plus(BasisPoints)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm scale is three.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#plus(BasisPoints)}
   */
  @Test
  @DisplayName("Test plus(BasisPoints); then return toDecimalForm scale is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.plus(BasisPoints)"})
  void testPlus_thenReturnToDecimalFormScaleIsThree() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.ofScaled(-1635280488L, 1));

    // Act
    BasisPoints actualPlusResult = ofResult.plus(BasisPoints.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    assertEquals(3, toDecimalFormResult.scale());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(3, negatedResult.scale());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualPlusResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link BasisPoints#plus(BasisPoints)}.
   *
   * <ul>
   *   <li>Then return valueBasisPoints is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#plus(BasisPoints)}
   */
  @Test
  @DisplayName("Test plus(BasisPoints); then return valueBasisPoints is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.plus(BasisPoints)"})
  void testPlus_thenReturnValueBasisPointsIsToDecimalForm() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.MIN_VALUE);

    // Act
    BasisPoints actualPlusResult = ofResult.plus(BasisPoints.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    assertEquals(toDecimalFormResult, actualPlusResult.valueBasisPoints());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualNegatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, actualNegatedResult);
  }

  /**
   * Test {@link BasisPoints#plus(BasisPoints)}.
   *
   * <ul>
   *   <li>Then return valueBasisPoints scale is one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#plus(BasisPoints)}
   */
  @Test
  @DisplayName("Test plus(BasisPoints); then return valueBasisPoints scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.plus(BasisPoints)"})
  void testPlus_thenReturnValueBasisPointsScaleIsOne() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.ofScaled(-1486618625L, 1));

    // Act
    BasisPoints actualPlusResult = ofResult.plus(BasisPoints.of(Decimal.of(42L)));

    // Assert
    Decimal valueBasisPointsResult = actualPlusResult.valueBasisPoints();
    assertEquals(1, valueBasisPointsResult.scale());
    Decimal absResult = valueBasisPointsResult.abs();
    assertEquals(1, absResult.scale());
    Decimal toDecimalFormResult = actualPlusResult.toDecimalForm();
    assertEquals(5, toDecimalFormResult.scale());
    Decimal absResult2 = toDecimalFormResult.abs();
    assertEquals(5, absResult2.scale());
    assertEquals(toDecimalFormResult, absResult2.negated());
    assertEquals(valueBasisPointsResult, absResult.negated());
    Decimal absResult3 = absResult2.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    Decimal absResult4 = absResult.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valueBasisPointsResult.negated());
  }

  /**
   * Test {@link BasisPoints#minus(BasisPoints)}.
   *
   * <ul>
   *   <li>Given {@link BasisPoints} with basisPoints is ofScaled {@code -999999999999999999} and
   *       one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#minus(BasisPoints)}
   */
  @Test
  @DisplayName(
      "Test minus(BasisPoints); given BasisPoints with basisPoints is ofScaled '-999999999999999999' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.minus(BasisPoints)"})
  void testMinus_givenBasisPointsWithBasisPointsIsOfScaled999999999999999999AndOne() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.ofScaled(-999999999999999999L, 1));

    // Act
    BasisPoints actualMinusResult = ofResult.minus(BasisPoints.of(Decimal.of(42L)));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal absResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, absResult.negated());
    Decimal valueBasisPointsResult = actualMinusResult.valueBasisPoints();
    Decimal absResult2 = valueBasisPointsResult.abs();
    assertEquals(valueBasisPointsResult, absResult2.negated());
    Decimal absResult3 = absResult.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    Decimal absResult4 = absResult2.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valueBasisPointsResult.negated());
  }

  /**
   * Test {@link BasisPoints#minus(BasisPoints)}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#minus(BasisPoints)}
   */
  @Test
  @DisplayName("Test minus(BasisPoints); given Decimal with value is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.minus(BasisPoints)"})
  void testMinus_givenDecimalWithValueIsFortyTwo() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.of(42L));

    // Act
    BasisPoints actualMinusResult = ofResult.minus(BasisPoints.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal absResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, absResult.negated());
    Decimal valueBasisPointsResult = actualMinusResult.valueBasisPoints();
    Decimal absResult2 = valueBasisPointsResult.abs();
    assertEquals(valueBasisPointsResult, absResult2.negated());
    Decimal absResult3 = absResult.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    Decimal absResult4 = absResult2.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valueBasisPointsResult.negated());
  }

  /**
   * Test {@link BasisPoints#minus(BasisPoints)}.
   *
   * <ul>
   *   <li>Given {@link BasisPoints#ZERO}.
   *   <li>Then return toDecimalForm abs negated is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#minus(BasisPoints)}
   */
  @Test
  @DisplayName(
      "Test minus(BasisPoints); given ZERO; then return toDecimalForm abs negated is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.minus(BasisPoints)"})
  void testMinus_givenZero_thenReturnToDecimalFormAbsNegatedIsToDecimalForm() {
    // Arrange and Act
    BasisPoints actualMinusResult = BasisPoints.ZERO.minus(BasisPoints.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal absResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, absResult.negated());
    Decimal valueBasisPointsResult = actualMinusResult.valueBasisPoints();
    Decimal absResult2 = valueBasisPointsResult.abs();
    assertEquals(valueBasisPointsResult, absResult2.negated());
    Decimal absResult3 = absResult.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    Decimal absResult4 = absResult2.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valueBasisPointsResult.negated());
  }

  /**
   * Test {@link BasisPoints#minus(BasisPoints)}.
   *
   * <ul>
   *   <li>Given {@link BasisPoints#ZERO}.
   *   <li>When {@link BasisPoints#ZERO}.
   *   <li>Then return valueBasisPoints is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#minus(BasisPoints)}
   */
  @Test
  @DisplayName(
      "Test minus(BasisPoints); given ZERO; when ZERO; then return valueBasisPoints is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.minus(BasisPoints)"})
  void testMinus_givenZero_whenZero_thenReturnValueBasisPointsIsToDecimalForm() {
    // Arrange and Act
    BasisPoints actualMinusResult = BasisPoints.ZERO.minus(BasisPoints.ZERO);

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    assertEquals(toDecimalFormResult, actualMinusResult.valueBasisPoints());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualNegatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, actualNegatedResult);
  }

  /**
   * Test {@link BasisPoints#minus(BasisPoints)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm negated scale is four.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#minus(BasisPoints)}
   */
  @Test
  @DisplayName("Test minus(BasisPoints); then return toDecimalForm negated scale is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.minus(BasisPoints)"})
  void testMinus_thenReturnToDecimalFormNegatedScaleIsFour() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.ofScaled(-1486618625L, 1));

    // Act
    BasisPoints actualMinusResult = ofResult.minus(BasisPoints.of(Decimal.MIN_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(4, negatedResult.scale());
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualMinusResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link BasisPoints#minus(BasisPoints)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm scale is three.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#minus(BasisPoints)}
   */
  @Test
  @DisplayName("Test minus(BasisPoints); then return toDecimalForm scale is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.minus(BasisPoints)"})
  void testMinus_thenReturnToDecimalFormScaleIsThree() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.ofScaled(-1635280488L, 1));

    // Act
    BasisPoints actualMinusResult = ofResult.minus(BasisPoints.of(Decimal.MIN_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    assertEquals(3, toDecimalFormResult.scale());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(3, negatedResult.scale());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualMinusResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link BasisPoints#minus(BasisPoints)}.
   *
   * <ul>
   *   <li>Then return valueBasisPoints is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#minus(BasisPoints)}
   */
  @Test
  @DisplayName("Test minus(BasisPoints); then return valueBasisPoints is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.minus(BasisPoints)"})
  void testMinus_thenReturnValueBasisPointsIsToDecimalForm() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.MAX_VALUE);

    // Act
    BasisPoints actualMinusResult = ofResult.minus(BasisPoints.of(Decimal.MAX_VALUE));

    // Assert
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    assertEquals(toDecimalFormResult, actualMinusResult.valueBasisPoints());
    Decimal actualAbsResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, actualAbsResult);
    Decimal actualNegatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, actualNegatedResult);
  }

  /**
   * Test {@link BasisPoints#minus(BasisPoints)}.
   *
   * <ul>
   *   <li>When {@link Decimal} with value is forty-two.
   *   <li>Then return valueBasisPoints scale is one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#minus(BasisPoints)}
   */
  @Test
  @DisplayName(
      "Test minus(BasisPoints); when Decimal with value is forty-two; then return valueBasisPoints scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.minus(BasisPoints)"})
  void testMinus_whenDecimalWithValueIsFortyTwo_thenReturnValueBasisPointsScaleIsOne() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.ofScaled(-1486618625L, 1));

    // Act
    BasisPoints actualMinusResult = ofResult.minus(BasisPoints.of(Decimal.of(42L)));

    // Assert
    Decimal valueBasisPointsResult = actualMinusResult.valueBasisPoints();
    assertEquals(1, valueBasisPointsResult.scale());
    Decimal absResult = valueBasisPointsResult.abs();
    assertEquals(1, absResult.scale());
    Decimal toDecimalFormResult = actualMinusResult.toDecimalForm();
    assertEquals(5, toDecimalFormResult.scale());
    Decimal absResult2 = toDecimalFormResult.abs();
    assertEquals(5, absResult2.scale());
    assertEquals(toDecimalFormResult, absResult2.negated());
    assertEquals(valueBasisPointsResult, absResult.negated());
    Decimal absResult3 = absResult2.abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, toDecimalFormResult.negated());
    Decimal absResult4 = absResult.abs();
    assertEquals(absResult4, absResult4);
    assertEquals(absResult4, valueBasisPointsResult.negated());
  }

  /**
   * Test {@link BasisPoints#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>Then return toDecimalForm negated abs abs abs scale is four.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); given MAX_VALUE; then return toDecimalForm negated abs abs abs scale is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.map(UnaryOperator)"})
  void testMap_givenMax_value_thenReturnToDecimalFormNegatedAbsAbsAbsScaleIsFour() {
    // Arrange
    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.MAX_VALUE);

    // Act
    BasisPoints actualMapResult = BasisPoints.ZERO.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    Decimal negatedResult = actualMapResult.toDecimalForm().negated();
    Decimal absResult = negatedResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(4, absResult2.abs().scale());
    assertEquals(4, absResult2.scale());
    Decimal negatedResult2 = negatedResult.negated();
    Decimal absResult3 = negatedResult2.abs();
    assertEquals(4, absResult3.abs().scale());
    assertEquals(4, absResult.scale());
    Decimal negatedResult3 = absResult.negated();
    assertEquals(4, negatedResult3.abs().scale());
    assertEquals(4, absResult3.scale());
    Decimal negatedResult4 = negatedResult2.negated();
    assertEquals(4, negatedResult4.abs().scale());
    assertEquals(4, negatedResult.scale());
    assertEquals(4, absResult2.negated().scale());
    assertEquals(4, negatedResult3.scale());
    assertEquals(4, absResult3.negated().scale());
    assertEquals(4, negatedResult2.scale());
    assertEquals(4, negatedResult3.negated().scale());
    assertEquals(4, negatedResult4.scale());
    assertEquals(4, negatedResult4.negated().scale());
  }

  /**
   * Test {@link BasisPoints#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given ofScaled eight and eighteen.
   *   <li>Then return {@link BasisPoints#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#map(UnaryOperator)}
   */
  @Test
  @DisplayName("Test map(UnaryOperator); given ofScaled eight and eighteen; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.map(UnaryOperator)"})
  void testMap_givenOfScaledEightAndEighteen_thenReturnZero() {
    // Arrange
    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.ofScaled(8L, 18));

    // Act
    BasisPoints actualMapResult = BasisPoints.ZERO.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    assertEquals(BasisPoints.ZERO, actualMapResult);
  }

  /**
   * Test {@link BasisPoints#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given ofScaled {@link Long#MAX_VALUE} and eighteen.
   *   <li>Then return toDecimalForm scale is twelve.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); given ofScaled MAX_VALUE and eighteen; then return toDecimalForm scale is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.map(UnaryOperator)"})
  void testMap_givenOfScaledMax_valueAndEighteen_thenReturnToDecimalFormScaleIsTwelve() {
    // Arrange
    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Act
    BasisPoints actualMapResult = BasisPoints.ZERO.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    Decimal toDecimalFormResult = actualMapResult.toDecimalForm();
    assertEquals(12, toDecimalFormResult.scale());
    Decimal absResult = toDecimalFormResult.abs();
    assertEquals(12, absResult.scale());
    assertEquals(12, absResult.abs().scale());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(12, negatedResult.abs().scale());
    assertEquals(12, negatedResult.scale());
    assertEquals(12, absResult.negated().scale());
    assertEquals(12, negatedResult.negated().scale());
    Decimal valueBasisPointsResult = actualMapResult.valueBasisPoints();
    assertEquals(8, valueBasisPointsResult.scale());
    Decimal absResult2 = valueBasisPointsResult.abs();
    assertEquals(8, absResult2.scale());
    assertEquals(8, absResult2.abs().scale());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(8, negatedResult2.abs().scale());
    assertEquals(8, negatedResult2.scale());
    assertEquals(8, absResult2.negated().scale());
    assertEquals(8, negatedResult2.negated().scale());
  }

  /**
   * Test {@link BasisPoints#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return toDecimalForm signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#map(UnaryOperator)}
   */
  @Test
  @DisplayName("Test map(UnaryOperator); then return toDecimalForm signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints BasisPoints.map(UnaryOperator)"})
  void testMap_thenReturnToDecimalFormSignumIsMinusOne() {
    // Arrange
    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any()))
        .thenReturn(Decimal.ofScaled(-999999999999999999L, 18));

    // Act
    BasisPoints actualMapResult = BasisPoints.ZERO.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    Decimal toDecimalFormResult = actualMapResult.toDecimalForm();
    assertEquals(-1, toDecimalFormResult.signum());
    Decimal valueBasisPointsResult = actualMapResult.valueBasisPoints();
    assertEquals(-1, valueBasisPointsResult.signum());
    Decimal absResult = toDecimalFormResult.abs();
    assertEquals(toDecimalFormResult, absResult.negated());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, toDecimalFormResult.negated());
    Decimal absResult3 = valueBasisPointsResult.abs().abs().abs();
    assertEquals(absResult3, absResult3);
    assertEquals(absResult3, valueBasisPointsResult.negated());
  }

  /**
   * Test {@link BasisPoints#compareTo(BasisPoints)} with {@code BasisPoints}.
   *
   * <ul>
   *   <li>Given {@link BasisPoints#ZERO}.
   *   <li>When {@link BasisPoints#ZERO}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#compareTo(BasisPoints)}
   */
  @Test
  @DisplayName(
      "Test compareTo(BasisPoints) with 'BasisPoints'; given ZERO; when ZERO; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BasisPoints.compareTo(BasisPoints)"})
  void testCompareToWithBasisPoints_givenZero_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, BasisPoints.ZERO.compareTo(BasisPoints.ZERO));
  }

  /**
   * Test {@link BasisPoints#compareTo(BasisPoints)} with {@code BasisPoints}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#compareTo(BasisPoints)}
   */
  @Test
  @DisplayName("Test compareTo(BasisPoints) with 'BasisPoints'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BasisPoints.compareTo(BasisPoints)"})
  void testCompareToWithBasisPoints_thenReturnMinusOne() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.ofScaled(1L, 1));

    // Act and Assert
    assertEquals(-1, ofResult.compareTo(BasisPoints.of(Decimal.MAX_VALUE)));
  }

  /**
   * Test {@link BasisPoints#compareTo(BasisPoints)} with {@code BasisPoints}.
   *
   * <ul>
   *   <li>When {@link BasisPoints} with basisPoints is {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#compareTo(BasisPoints)}
   */
  @Test
  @DisplayName(
      "Test compareTo(BasisPoints) with 'BasisPoints'; when BasisPoints with basisPoints is MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BasisPoints.compareTo(BasisPoints)"})
  void testCompareToWithBasisPoints_whenBasisPointsWithBasisPointsIsMin_value() {
    // Arrange
    BasisPoints ofResult = BasisPoints.of(Decimal.ofScaled(1L, 1));

    // Act and Assert
    assertEquals(1, ofResult.compareTo(BasisPoints.of(Decimal.MIN_VALUE)));
  }

  /**
   * Test {@link BasisPoints#compareTo(BasisPoints)} with {@code BasisPoints}.
   *
   * <ul>
   *   <li>When {@link BasisPoints#ZERO}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#compareTo(BasisPoints)}
   */
  @Test
  @DisplayName("Test compareTo(BasisPoints) with 'BasisPoints'; when ZERO; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int BasisPoints.compareTo(BasisPoints)"})
  void testCompareToWithBasisPoints_whenZero_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, BasisPoints.of(Decimal.ofScaled(1L, 1)).compareTo(BasisPoints.ZERO));
  }

  /**
   * Test {@link BasisPoints#equals(Object)}, and {@link BasisPoints#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BasisPoints#equals(Object)}
   *   <li>{@link BasisPoints#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BasisPoints.equals(Object)", "int BasisPoints.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    BasisPoints basisPoints = BasisPoints.ZERO;
    BasisPoints basisPoints2 = BasisPoints.ZERO;

    // Act and Assert
    assertEquals(basisPoints, basisPoints2);
    assertEquals(basisPoints.hashCode(), basisPoints2.hashCode());
  }

  /**
   * Test {@link BasisPoints#equals(Object)}, and {@link BasisPoints#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link BasisPoints#equals(Object)}
   *   <li>{@link BasisPoints#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BasisPoints.equals(Object)", "int BasisPoints.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    BasisPoints basisPoints = BasisPoints.ZERO;

    // Act and Assert
    assertEquals(basisPoints, basisPoints);
    int expectedHashCodeResult = basisPoints.hashCode();
    assertEquals(expectedHashCodeResult, basisPoints.hashCode());
  }

  /**
   * Test {@link BasisPoints#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BasisPoints.equals(Object)", "int BasisPoints.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BasisPoints.of(Decimal.MAX_VALUE), BasisPoints.ZERO);
  }

  /**
   * Test {@link BasisPoints#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BasisPoints.equals(Object)", "int BasisPoints.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BasisPoints.ZERO, null);
  }

  /**
   * Test {@link BasisPoints#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link BasisPoints#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BasisPoints.equals(Object)", "int BasisPoints.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(BasisPoints.ZERO, "Different type to BasisPoints");
  }

  /**
   * Test {@link BasisPoints#toString()}.
   *
   * <p>Method under test: {@link BasisPoints#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String BasisPoints.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("999999999999999999bps", BasisPoints.of(Decimal.MAX_VALUE).toString());
  }
}
