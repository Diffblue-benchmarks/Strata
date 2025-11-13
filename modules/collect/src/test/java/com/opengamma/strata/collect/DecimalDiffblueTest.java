package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.DoubleUnaryOperator;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DecimalDiffblueTest {
  /**
   * Test {@link Decimal#of(BigDecimal)} with {@code BigDecimal}.
   *
   * <ul>
   *   <li>When {@link BigDecimal#BigDecimal(String)} with {@code 2.3}.
   *   <li>Then return negated scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test of(BigDecimal) with 'BigDecimal'; when BigDecimal(String) with '2.3'; then return negated scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(BigDecimal)"})
  void testOfWithBigDecimal_whenBigDecimalWith23_thenReturnNegatedScaleIsOne() {
    // Arrange and Act
    Decimal actualOfResult = Decimal.of(new BigDecimal("2.3"));

    // Assert
    Decimal negatedResult = actualOfResult.negated();
    assertEquals(1, negatedResult.scale());
    assertEquals(1, actualOfResult.scale());
    assertEquals(actualOfResult, negatedResult.abs());
    Decimal actualAbsResult = actualOfResult.abs();
    assertEquals(actualOfResult, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#of(BigDecimal)} with {@code BigDecimal}.
   *
   * <ul>
   *   <li>When {@link BigDecimal#BigDecimal(String)} with {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(BigDecimal)}
   */
  @Test
  @DisplayName("Test of(BigDecimal) with 'BigDecimal'; when BigDecimal(String) with '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(BigDecimal)"})
  void testOfWithBigDecimal_whenBigDecimalWith42() {
    // Arrange and Act
    Decimal actualOfResult = Decimal.of(new BigDecimal("42"));

    // Assert
    Decimal negatedResult = actualOfResult.negated();
    assertEquals(actualOfResult, negatedResult.abs().abs());
    assertEquals(actualOfResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualOfResult.abs();
    assertEquals(actualOfResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#of(BigDecimal)} with {@code BigDecimal}.
   *
   * <ul>
   *   <li>When valueOf {@link Long#MAX_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test of(BigDecimal) with 'BigDecimal'; when valueOf MAX_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(BigDecimal)"})
  void testOfWithBigDecimal_whenValueOfMax_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.of(BigDecimal.valueOf(Long.MAX_VALUE)));
  }

  /**
   * Test {@link Decimal#of(BigDecimal)} with {@code BigDecimal}.
   *
   * <ul>
   *   <li>When valueOf zero.
   *   <li>Then return signum is zero.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test of(BigDecimal) with 'BigDecimal'; when valueOf zero; then return signum is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(BigDecimal)"})
  void testOfWithBigDecimal_whenValueOfZero_thenReturnSignumIsZero() {
    // Arrange and Act
    Decimal actualOfResult = Decimal.of(BigDecimal.valueOf(0L));

    // Assert
    assertEquals(0, actualOfResult.signum());
    assertTrue(actualOfResult.isZero());
    Decimal decimal = Decimal.ZERO;
    assertEquals(decimal, actualOfResult.abs());
    assertEquals(decimal, actualOfResult.negated());
  }

  /**
   * Test {@link Decimal#of(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(double)}
   */
  @Test
  @DisplayName("Test of(double) with 'double'; when '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(double)"})
  void testOfWithDouble_when05() {
    // Arrange and Act
    Decimal actualOfResult = Decimal.of(0.5d);

    // Assert
    Decimal negatedResult = actualOfResult.negated();
    assertEquals(actualOfResult, negatedResult.abs().abs());
    assertEquals(actualOfResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualOfResult.abs();
    assertEquals(actualOfResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#of(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(double)}
   */
  @Test
  @DisplayName("Test of(double) with 'double'; when '-0.5'; then return signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(double)"})
  void testOfWithDouble_when05_thenReturnSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualOfResult = Decimal.of(-0.5d);

    // Assert
    assertEquals(-1, actualOfResult.signum());
    Decimal absResult = actualOfResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualOfResult.negated());
    assertEquals(actualOfResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#of(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(double)}
   */
  @Test
  @DisplayName("Test of(double) with 'double'; when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(double)"})
  void testOfWithDouble_whenNaN_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.of(Double.NaN));
  }

  /**
   * Test {@link Decimal#of(double)} with {@code double}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return negated scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(double)}
   */
  @Test
  @DisplayName("Test of(double) with 'double'; when ten; then return negated scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(double)"})
  void testOfWithDouble_whenTen_thenReturnNegatedScaleIsZero() {
    // Arrange and Act
    Decimal actualOfResult = Decimal.of(10.0d);

    // Assert
    Decimal negatedResult = actualOfResult.negated();
    assertEquals(0, negatedResult.scale());
    assertEquals(0, actualOfResult.scale());
    assertEquals(actualOfResult, negatedResult.abs());
    Decimal actualAbsResult = actualOfResult.abs();
    assertEquals(actualOfResult, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#of(long)} with {@code long}.
   *
   * <ul>
   *   <li>When {@code 1000000000000000000}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(long)}
   */
  @Test
  @DisplayName(
      "Test of(long) with 'long'; when '1000000000000000000'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(long)"})
  void testOfWithLong_when1000000000000000000_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.of(1000000000000000000L));
  }

  /**
   * Test {@link Decimal#of(long)} with {@code long}.
   *
   * <ul>
   *   <li>When {@code -1000000000000000000}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(long)}
   */
  @Test
  @DisplayName(
      "Test of(long) with 'long'; when '-1000000000000000000'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(long)"})
  void testOfWithLong_when1000000000000000000_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.of(-1000000000000000000L));
  }

  /**
   * Test {@link Decimal#of(long)} with {@code long}.
   *
   * <ul>
   *   <li>When forty-two.
   *   <li>Then return negated signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(long)}
   */
  @Test
  @DisplayName("Test of(long) with 'long'; when forty-two; then return negated signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(long)"})
  void testOfWithLong_whenFortyTwo_thenReturnNegatedSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualOfResult = Decimal.of(42L);

    // Assert
    Decimal negatedResult = actualOfResult.negated();
    assertEquals(-1, negatedResult.signum());
    assertEquals(0, negatedResult.scale());
    assertEquals(0, actualOfResult.scale());
    assertEquals(1, actualOfResult.signum());
    assertFalse(negatedResult.isZero());
    assertFalse(actualOfResult.isZero());
    assertEquals(actualOfResult, negatedResult.abs());
    Decimal actualAbsResult = actualOfResult.abs();
    assertEquals(actualOfResult, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return negated signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(String)}
   */
  @Test
  @DisplayName("Test of(String) with 'String'; when '42'; then return negated signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(String)"})
  void testOfWithString_when42_thenReturnNegatedSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualOfResult = Decimal.of("42");

    // Assert
    Decimal negatedResult = actualOfResult.negated();
    assertEquals(-1, negatedResult.signum());
    assertEquals(0, negatedResult.scale());
    assertEquals(0, actualOfResult.scale());
    assertEquals(1, actualOfResult.signum());
    assertFalse(negatedResult.isZero());
    assertFalse(actualOfResult.isZero());
    assertEquals(actualOfResult, negatedResult.abs());
    Decimal actualAbsResult = actualOfResult.abs();
    assertEquals(actualOfResult, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code 42E42}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(String)}
   */
  @Test
  @DisplayName("Test of(String) with 'String'; when '42E42'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(String)"})
  void testOfWithString_when42e42_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.of("42E42"));
  }

  /**
   * Test {@link Decimal#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code E}.
   *   <li>Then throw {@link NumberFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(String)}
   */
  @Test
  @DisplayName("Test of(String) with 'String'; when 'E'; then throw NumberFormatException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(String)"})
  void testOfWithString_whenE_thenThrowNumberFormatException() {
    // Arrange, Act and Assert
    assertThrows(NumberFormatException.class, () -> Decimal.of("E"));
  }

  /**
   * Test {@link Decimal#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link NumberFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#of(String)}
   */
  @Test
  @DisplayName("Test of(String) with 'String'; when empty string; then throw NumberFormatException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.of(String)"})
  void testOfWithString_whenEmptyString_thenThrowNumberFormatException() {
    // Arrange, Act and Assert
    assertThrows(NumberFormatException.class, () -> Decimal.of(""));
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When {@code 1000000000000000000}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName(
      "Test ofScaled(long, int); when '1000000000000000000'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_when1000000000000000000_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.ofScaled(1000000000000000000L, 0));
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When {@code 1000000000000000000}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName(
      "Test ofScaled(long, int); when '1000000000000000000'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_when1000000000000000000_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.ofScaled(1000000000000000000L, -1));
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When {@code -1000000000000000000}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName(
      "Test ofScaled(long, int); when '-1000000000000000000'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_when1000000000000000000_thenThrowIllegalArgumentException3() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.ofScaled(-1000000000000000000L, 0));
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName("Test ofScaled(long, int); when eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_whenEighteen() {
    // Arrange and Act
    Decimal actualOfScaledResult = Decimal.ofScaled(1000000000000000000L, 18);

    // Assert
    Decimal negatedResult = actualOfScaledResult.negated();
    assertEquals(actualOfScaledResult, negatedResult.abs().abs());
    assertEquals(actualOfScaledResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualOfScaledResult.abs();
    assertEquals(actualOfScaledResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When minus eighteen.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName("Test ofScaled(long, int); when minus eighteen; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_whenMinusEighteen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.ofScaled(999999999999999999L, -18));
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName("Test ofScaled(long, int); when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.ofScaled(999999999999999999L, -1));
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When minus seventeen.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName(
      "Test ofScaled(long, int); when minus seventeen; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_whenMinusSeventeen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.ofScaled(18L, -17));
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When nineteen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName("Test ofScaled(long, int); when nineteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_whenNineteen() {
    // Arrange and Act
    Decimal actualOfScaledResult = Decimal.ofScaled(1L, 19);

    // Assert
    Decimal actualAbsResult = actualOfScaledResult.abs();
    assertEquals(actualOfScaledResult, actualAbsResult);
    Decimal actualNegatedResult = actualOfScaledResult.negated();
    assertEquals(actualOfScaledResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When nineteen.
   *   <li>Then return negated scale is eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName("Test ofScaled(long, int); when nineteen; then return negated scale is eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_whenNineteen_thenReturnNegatedScaleIsEighteen() {
    // Arrange and Act
    Decimal actualOfScaledResult = Decimal.ofScaled(999999999999999999L, 19);

    // Assert
    Decimal negatedResult = actualOfScaledResult.negated();
    assertEquals(18, negatedResult.scale());
    assertEquals(18, actualOfScaledResult.scale());
    assertEquals(actualOfScaledResult, negatedResult.abs());
    Decimal actualAbsResult = actualOfScaledResult.abs();
    assertEquals(actualOfScaledResult, actualAbsResult);
    assertEquals(actualOfScaledResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName("Test ofScaled(long, int); when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_whenOne() {
    // Arrange and Act
    Decimal actualOfScaledResult = Decimal.ofScaled(1L, -1);

    // Assert
    Decimal negatedResult = actualOfScaledResult.negated();
    assertEquals(actualOfScaledResult, negatedResult.abs().abs());
    assertEquals(actualOfScaledResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualOfScaledResult.abs();
    assertEquals(actualOfScaledResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return negated scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName("Test ofScaled(long, int); when one; then return negated scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_whenOne_thenReturnNegatedScaleIsOne() {
    // Arrange and Act
    Decimal actualOfScaledResult = Decimal.ofScaled(1L, 1);

    // Assert
    Decimal negatedResult = actualOfScaledResult.negated();
    assertEquals(1, negatedResult.scale());
    assertEquals(1, actualOfScaledResult.scale());
    assertEquals(actualOfScaledResult, negatedResult.abs());
    Decimal actualAbsResult = actualOfScaledResult.abs();
    assertEquals(actualOfScaledResult, actualAbsResult);
    assertEquals(actualOfScaledResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When thirty-six.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName("Test ofScaled(long, int); when thirty-six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_whenThirtySix() {
    // Arrange and Act
    Decimal actualOfScaledResult = Decimal.ofScaled(999999999999999999L, 36);

    // Assert
    Decimal actualAbsResult = actualOfScaledResult.abs();
    assertEquals(actualOfScaledResult, actualAbsResult);
    Decimal actualNegatedResult = actualOfScaledResult.negated();
    assertEquals(actualOfScaledResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName("Test ofScaled(long, int); when zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_whenZero() {
    // Arrange and Act
    Decimal actualOfScaledResult = Decimal.ofScaled(0L, 0);

    // Assert
    Decimal actualAbsResult = actualOfScaledResult.abs();
    assertEquals(actualOfScaledResult, actualAbsResult);
    Decimal actualNegatedResult = actualOfScaledResult.negated();
    assertEquals(actualOfScaledResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#ofScaled(long, int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return negated is {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#ofScaled(long, int)}
   */
  @Test
  @DisplayName("Test ofScaled(long, int); when zero; then return negated is MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.ofScaled(long, int)"})
  void testOfScaled_whenZero_thenReturnNegatedIsMin_value() {
    // Arrange and Act
    Decimal actualOfScaledResult = Decimal.ofScaled(999999999999999999L, 0);

    // Assert
    Decimal actualAbsResult = actualOfScaledResult.abs();
    assertEquals(actualOfScaledResult, actualAbsResult);
    assertEquals(Decimal.MIN_VALUE, actualOfScaledResult.negated());
  }

  /**
   * Test {@link Decimal#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return negated signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '42'; then return negated signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.parse(String)"})
  void testParse_when42_thenReturnNegatedSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualParseResult = Decimal.parse("42");

    // Assert
    Decimal negatedResult = actualParseResult.negated();
    assertEquals(-1, negatedResult.signum());
    assertEquals(0, negatedResult.scale());
    assertEquals(0, actualParseResult.scale());
    assertEquals(1, actualParseResult.signum());
    assertFalse(negatedResult.isZero());
    assertFalse(actualParseResult.isZero());
    assertEquals(actualParseResult, negatedResult.abs());
    Decimal actualAbsResult = actualParseResult.abs();
    assertEquals(actualParseResult, actualAbsResult);
    assertEquals(actualParseResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 42E42}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '42E42'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.parse(String)"})
  void testParse_when42e42_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.parse("42E42"));
  }

  /**
   * Test {@link Decimal#parse(String)}.
   *
   * <ul>
   *   <li>When {@code E}.
   *   <li>Then throw {@link NumberFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'E'; then throw NumberFormatException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.parse(String)"})
  void testParse_whenE_thenThrowNumberFormatException() {
    // Arrange, Act and Assert
    assertThrows(NumberFormatException.class, () -> Decimal.parse("E"));
  }

  /**
   * Test {@link Decimal#parse(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link NumberFormatException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when empty string; then throw NumberFormatException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.parse(String)"})
  void testParse_whenEmptyString_thenThrowNumberFormatException() {
    // Arrange, Act and Assert
    assertThrows(NumberFormatException.class, () -> Decimal.parse(""));
  }

  /**
   * Test {@link Decimal#unscaledValue()}.
   *
   * <p>Method under test: {@link Decimal#unscaledValue()}
   */
  @Test
  @DisplayName("Test unscaledValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Decimal.unscaledValue()"})
  void testUnscaledValue() {
    // Arrange, Act and Assert
    assertEquals(999999999999999999L, Decimal.MAX_VALUE.unscaledValue());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Decimal#toString()}
   *   <li>{@link Decimal#scale()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Decimal.scale()", "String Decimal.toString()"})
  void testGettersAndSetters() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    String actualToStringResult = ofResult.toString();

    // Assert
    assertEquals("42", actualToStringResult);
    assertEquals(0, ofResult.scale());
  }

  /**
   * Test {@link Decimal#plus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test plus(Decimal) with 'Decimal'; given MAX_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(Decimal)"})
  void testPlusWithDecimal_givenMax_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.plus(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#plus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(Decimal)}
   */
  @Test
  @DisplayName("Test plus(Decimal) with 'Decimal'; given MAX_VALUE; when ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(Decimal)"})
  void testPlusWithDecimal_givenMax_value_whenZero() {
    // Arrange and Act
    Decimal actualPlusResult = Decimal.MAX_VALUE.plus(Decimal.ZERO);

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.abs().abs());
    assertEquals(actualPlusResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#plus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(Decimal)}
   */
  @Test
  @DisplayName("Test plus(Decimal) with 'Decimal'; given MIN_VALUE; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(Decimal)"})
  void testPlusWithDecimal_givenMin_value_thenReturnAbsAbs() {
    // Arrange and Act
    Decimal actualPlusResult = Decimal.MIN_VALUE.plus(Decimal.of(42L));

    // Assert
    Decimal absResult = actualPlusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualPlusResult.negated());
    assertEquals(actualPlusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#plus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test plus(Decimal) with 'Decimal'; given MIN_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(Decimal)"})
  void testPlusWithDecimal_givenMin_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MIN_VALUE.plus(Decimal.MIN_VALUE));
  }

  /**
   * Test {@link Decimal#plus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test plus(Decimal) with 'Decimal'; given MIN_VALUE; when MAX_VALUE; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(Decimal)"})
  void testPlusWithDecimal_givenMin_value_whenMax_value_thenReturnZero() {
    // Arrange, Act and Assert
    assertSame(Decimal.ZERO, Decimal.MIN_VALUE.plus(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#plus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -1486618625} and eighteen.
   *   <li>Then return {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test plus(Decimal) with 'Decimal'; given ofScaled '-1486618625' and eighteen; then return MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(Decimal)"})
  void testPlusWithDecimal_givenOfScaled1486618625AndEighteen_thenReturnMin_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-1486618625L, 18);

    // Act and Assert
    assertEquals(Decimal.MIN_VALUE, ofScaledResult.plus(Decimal.MIN_VALUE));
  }

  /**
   * Test {@link Decimal#plus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -1486618625} and one.
   *   <li>Then return abs scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test plus(Decimal) with 'Decimal'; given ofScaled '-1486618625' and one; then return abs scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(Decimal)"})
  void testPlusWithDecimal_givenOfScaled1486618625AndOne_thenReturnAbsScaleIsOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-1486618625L, 1);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(Decimal.of(42L));

    // Assert
    Decimal absResult = actualPlusResult.abs();
    assertEquals(1, absResult.scale());
    assertEquals(1, actualPlusResult.scale());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualPlusResult.negated());
    assertEquals(actualPlusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#plus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -1486618625} and one.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test plus(Decimal) with 'Decimal'; given ofScaled '-1486618625' and one; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(Decimal)"})
  void testPlusWithDecimal_givenOfScaled1486618625AndOne_whenMax_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-1486618625L, 1);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(Decimal.MAX_VALUE);

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.abs().abs());
    assertEquals(actualPlusResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#plus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled {@code 999999999999999999} and one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(Decimal)}
   */
  @Test
  @DisplayName("Test plus(Decimal) with 'Decimal'; given ofScaled '999999999999999999' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(Decimal)"})
  void testPlusWithDecimal_givenOfScaled999999999999999999AndOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(999999999999999999L, 1);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(Decimal.of(42L));

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.abs().abs());
    assertEquals(actualPlusResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#plus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(Decimal)}
   */
  @Test
  @DisplayName("Test plus(Decimal) with 'Decimal'; given ZERO; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(Decimal)"})
  void testPlusWithDecimal_givenZero_whenMax_value() {
    // Arrange and Act
    Decimal actualPlusResult = Decimal.ZERO.plus(Decimal.MAX_VALUE);

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.abs().abs());
    assertEquals(actualPlusResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#plus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(Decimal)}
   */
  @Test
  @DisplayName("Test plus(Decimal) with 'Decimal'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(Decimal)"})
  void testPlusWithDecimal_thenThrowIllegalArgumentException() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-1486618625L, 1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofScaledResult.plus(Decimal.MIN_VALUE));
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName("Test plus(double) with 'double'; given MAX_VALUE; when '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenMax_value_when05() {
    // Arrange and Act
    Decimal actualPlusResult = Decimal.MAX_VALUE.plus(-0.5d);

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.abs().abs());
    assertEquals(actualPlusResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code 0.5}.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName(
      "Test plus(double) with 'double'; given MAX_VALUE; when '0.5'; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenMax_value_when05_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertEquals(Decimal.MAX_VALUE, Decimal.MAX_VALUE.plus(0.5d));
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName(
      "Test plus(double) with 'double'; given MAX_VALUE; when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenMax_value_whenNaN_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.plus(Double.NaN));
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName(
      "Test plus(double) with 'double'; given MAX_VALUE; when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenMax_value_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.plus(10.0d));
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When zero.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName("Test plus(double) with 'double'; given MAX_VALUE; when zero; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenMax_value_whenZero_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertSame(Decimal.MAX_VALUE, Decimal.MAX_VALUE.plus(0.0d));
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When ten.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName("Test plus(double) with 'double'; given MIN_VALUE; when ten; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenMin_value_whenTen_thenReturnAbsAbs() {
    // Arrange and Act
    Decimal actualPlusResult = Decimal.MIN_VALUE.plus(10.0d);

    // Assert
    Decimal absResult = actualPlusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualPlusResult.negated());
    assertEquals(actualPlusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and one.
   *   <li>When {@code -0.5}.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName(
      "Test plus(double) with 'double'; given ofScaled '-999999999999999999' and one; when '-0.5'; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenOfScaled999999999999999999AndOne_when05_thenReturnAbsAbs() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 1);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(-0.5d);

    // Assert
    Decimal absResult = actualPlusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualPlusResult.negated());
    assertEquals(actualPlusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled {@code 999999999999999999} and one.
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName(
      "Test plus(double) with 'double'; given ofScaled '999999999999999999' and one; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenOfScaled999999999999999999AndOne_whenTen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(999999999999999999L, 1);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(10.0d);

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.abs().abs());
    assertEquals(actualPlusResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled minus five and one.
   *   <li>When {@code -0.5}.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName(
      "Test plus(double) with 'double'; given ofScaled minus five and one; when '-0.5'; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenOfScaledMinusFiveAndOne_when05_thenReturnAbsAbs() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-5L, 1);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(-0.5d);

    // Assert
    Decimal absResult = actualPlusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualPlusResult.negated());
    assertEquals(actualPlusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled minus five and one.
   *   <li>When {@code 0.5}.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName(
      "Test plus(double) with 'double'; given ofScaled minus five and one; when '0.5'; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenOfScaledMinusFiveAndOne_when05_thenReturnZero() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-5L, 1);

    // Act and Assert
    assertSame(Decimal.ZERO, ofScaledResult.plus(0.5d));
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled one and eighteen.
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName("Test plus(double) with 'double'; given ofScaled one and eighteen; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenOfScaledOneAndEighteen_whenTen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 18);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(10.0d);

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.abs().abs());
    assertEquals(actualPlusResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When ten.
   *   <li>Then return negated scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName(
      "Test plus(double) with 'double'; given ofScaled one and one; when ten; then return negated scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenOfScaledOneAndOne_whenTen_thenReturnNegatedScaleIsOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(10.0d);

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(1, negatedResult.scale());
    assertEquals(1, actualPlusResult.scale());
    assertEquals(actualPlusResult, negatedResult.abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
    assertEquals(actualPlusResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(double)}
   */
  @Test
  @DisplayName("Test plus(double) with 'double'; given ZERO; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(double)"})
  void testPlusWithDouble_givenZero_whenTen() {
    // Arrange and Act
    Decimal actualPlusResult = Decimal.ZERO.plus(10.0d);

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.abs().abs());
    assertEquals(actualPlusResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code -999999999999999999}.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName(
      "Test plus(long) with 'long'; given MAX_VALUE; when '-999999999999999999'; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenMax_value_when999999999999999999_thenReturnZero() {
    // Arrange, Act and Assert
    assertSame(Decimal.ZERO, Decimal.MAX_VALUE.plus(-999999999999999999L));
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code -1000000000000000000}.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName(
      "Test plus(long) with 'long'; given MAX_VALUE; when '-1000000000000000000'; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenMax_value_when1000000000000000000_thenReturnAbsAbs() {
    // Arrange and Act
    Decimal actualPlusResult = Decimal.MAX_VALUE.plus(-1000000000000000000L);

    // Assert
    Decimal absResult = actualPlusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualPlusResult.negated());
    assertEquals(actualPlusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Long#MAX_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName(
      "Test plus(long) with 'long'; given MAX_VALUE; when MAX_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenMax_value_whenMax_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.plus(Long.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName(
      "Test plus(long) with 'long'; given MAX_VALUE; when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenMax_value_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.plus(1L));
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When zero.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName("Test plus(long) with 'long'; given MAX_VALUE; when zero; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenMax_value_whenZero_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertSame(Decimal.MAX_VALUE, Decimal.MAX_VALUE.plus(0L));
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When {@code -999999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName("Test plus(long) with 'long'; given MIN_VALUE; when '-999999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenMin_value_when999999999999999999() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.MIN_VALUE.plus(-999999999999999999L));
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When {@code -1000000000000000000}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName("Test plus(long) with 'long'; given MIN_VALUE; when '-1000000000000000000'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenMin_value_when1000000000000000000() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.MIN_VALUE.plus(-1000000000000000000L));
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When one.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName("Test plus(long) with 'long'; given MIN_VALUE; when one; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenMin_value_whenOne_thenReturnAbsAbs() {
    // Arrange and Act
    Decimal actualPlusResult = Decimal.MIN_VALUE.plus(1L);

    // Assert
    Decimal absResult = actualPlusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualPlusResult.negated());
    assertEquals(actualPlusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled {@code 999999999999999999} and one.
   *   <li>When {@code 999999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName(
      "Test plus(long) with 'long'; given ofScaled '999999999999999999' and one; when '999999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenOfScaled999999999999999999AndOne_when999999999999999999() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(999999999999999999L, 1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofScaledResult.plus(999999999999999999L));
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled {@code 999999999999999999} and one.
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName("Test plus(long) with 'long'; given ofScaled '999999999999999999' and one; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenOfScaled999999999999999999AndOne_whenOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(999999999999999999L, 1);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(1L);

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.abs().abs());
    assertEquals(actualPlusResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled one and eighteen.
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName("Test plus(long) with 'long'; given ofScaled one and eighteen; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenOfScaledOneAndEighteen_whenOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 18);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(1L);

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.abs().abs());
    assertEquals(actualPlusResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@code -999999999999999999}.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName(
      "Test plus(long) with 'long'; given ofScaled one and one; when '-999999999999999999'; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenOfScaledOneAndOne_when999999999999999999_thenReturnAbsAbs() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(-999999999999999999L);

    // Assert
    Decimal absResult = actualPlusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualPlusResult.negated());
    assertEquals(actualPlusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When one.
   *   <li>Then return negated scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName(
      "Test plus(long) with 'long'; given ofScaled one and one; when one; then return negated scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_givenOfScaledOneAndOne_whenOne_thenReturnNegatedScaleIsOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualPlusResult = ofScaledResult.plus(1L);

    // Assert
    Decimal negatedResult = actualPlusResult.negated();
    assertEquals(1, negatedResult.scale());
    assertEquals(1, actualPlusResult.scale());
    assertEquals(actualPlusResult, negatedResult.abs());
    Decimal actualAbsResult = actualPlusResult.abs();
    assertEquals(actualPlusResult, actualAbsResult);
    assertEquals(actualPlusResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#plus(long)} with {@code long}.
   *
   * <ul>
   *   <li>When {@code 1000000000000000000}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#plus(long)}
   */
  @Test
  @DisplayName(
      "Test plus(long) with 'long'; when '1000000000000000000'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.plus(long)"})
  void testPlusWithLong_when1000000000000000000_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.MAX_VALUE.plus(1000000000000000000L));
  }

  /**
   * Test {@link Decimal#minus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test minus(Decimal) with 'Decimal'; given Decimal with value is forty-two; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(Decimal)"})
  void testMinusWithDecimal_givenDecimalWithValueIsFortyTwo_thenReturnAbsAbs() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualMinusResult = ofResult.minus(Decimal.MAX_VALUE);

    // Assert
    Decimal absResult = actualMinusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test minus(Decimal) with 'Decimal'; given MAX_VALUE; when MAX_VALUE; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(Decimal)"})
  void testMinusWithDecimal_givenMax_value_whenMax_value_thenReturnZero() {
    // Arrange, Act and Assert
    assertSame(Decimal.ZERO, Decimal.MAX_VALUE.minus(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#minus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#ZERO}.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test minus(Decimal) with 'Decimal'; given MAX_VALUE; when ZERO; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(Decimal)"})
  void testMinusWithDecimal_givenMax_value_whenZero_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertSame(Decimal.MAX_VALUE, Decimal.MAX_VALUE.minus(Decimal.ZERO));
  }

  /**
   * Test {@link Decimal#minus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test minus(Decimal) with 'Decimal'; given MIN_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(Decimal)"})
  void testMinusWithDecimal_givenMin_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MIN_VALUE.minus(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#minus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -1486618625} and eighteen.
   *   <li>When {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test minus(Decimal) with 'Decimal'; given ofScaled '-1486618625' and eighteen; when MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(Decimal)"})
  void testMinusWithDecimal_givenOfScaled1486618625AndEighteen_whenMin_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-1486618625L, 18);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(Decimal.MIN_VALUE);

    // Assert
    Decimal negatedResult = actualMinusResult.negated();
    assertEquals(actualMinusResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMinusResult.abs();
    assertEquals(actualMinusResult, actualAbsResult);
    assertEquals(actualMinusResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#minus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -1486618625} and one.
   *   <li>When {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test minus(Decimal) with 'Decimal'; given ofScaled '-1486618625' and one; when MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(Decimal)"})
  void testMinusWithDecimal_givenOfScaled1486618625AndOne_whenMin_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-1486618625L, 1);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(Decimal.MIN_VALUE);

    // Assert
    Decimal negatedResult = actualMinusResult.negated();
    assertEquals(actualMinusResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMinusResult.abs();
    assertEquals(actualMinusResult, actualAbsResult);
    assertEquals(actualMinusResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#minus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(Decimal)}
   */
  @Test
  @DisplayName("Test minus(Decimal) with 'Decimal'; given ofScaled '-999999999999999999' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(Decimal)"})
  void testMinusWithDecimal_givenOfScaled999999999999999999AndOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 1);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(Decimal.of(42L));

    // Assert
    Decimal absResult = actualMinusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test minus(Decimal) with 'Decimal'; given ZERO; when MAX_VALUE; then return MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(Decimal)"})
  void testMinusWithDecimal_givenZero_whenMax_value_thenReturnMin_value() {
    // Arrange, Act and Assert
    assertEquals(Decimal.MIN_VALUE, Decimal.ZERO.minus(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#minus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(Decimal)}
   */
  @Test
  @DisplayName("Test minus(Decimal) with 'Decimal'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(Decimal)"})
  void testMinusWithDecimal_thenThrowIllegalArgumentException() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-1486618625L, 1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofScaledResult.minus(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#minus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>When {@link Decimal} with value is forty-two.
   *   <li>Then return abs scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test minus(Decimal) with 'Decimal'; when Decimal with value is forty-two; then return abs scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(Decimal)"})
  void testMinusWithDecimal_whenDecimalWithValueIsFortyTwo_thenReturnAbsScaleIsOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-1486618625L, 1);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(Decimal.of(42L));

    // Assert
    Decimal absResult = actualMinusResult.abs();
    assertEquals(1, absResult.scale());
    assertEquals(1, actualMinusResult.scale());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>When {@link Decimal#MIN_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(Decimal)}
   */
  @Test
  @DisplayName(
      "Test minus(Decimal) with 'Decimal'; when MIN_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(Decimal)"})
  void testMinusWithDecimal_whenMin_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.minus(Decimal.MIN_VALUE));
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName("Test minus(double) with 'double'; given MAX_VALUE; when '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenMax_value_when05() {
    // Arrange and Act
    Decimal actualMinusResult = Decimal.MAX_VALUE.minus(0.5d);

    // Assert
    Decimal negatedResult = actualMinusResult.negated();
    assertEquals(actualMinusResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMinusResult.abs();
    assertEquals(actualMinusResult, actualAbsResult);
    assertEquals(actualMinusResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code -0.5}.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'double'; given MAX_VALUE; when '-0.5'; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenMax_value_when05_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertEquals(Decimal.MAX_VALUE, Decimal.MAX_VALUE.minus(-0.5d));
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'double'; given MAX_VALUE; when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenMax_value_whenNaN_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.minus(Double.NaN));
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName("Test minus(double) with 'double'; given MAX_VALUE; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenMax_value_whenTen() {
    // Arrange and Act
    Decimal actualMinusResult = Decimal.MAX_VALUE.minus(10.0d);

    // Assert
    Decimal negatedResult = actualMinusResult.negated();
    assertEquals(actualMinusResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMinusResult.abs();
    assertEquals(actualMinusResult, actualAbsResult);
    assertEquals(actualMinusResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When zero.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'double'; given MAX_VALUE; when zero; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenMax_value_whenZero_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertSame(Decimal.MAX_VALUE, Decimal.MAX_VALUE.minus(0.0d));
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'double'; given MIN_VALUE; when ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenMin_value_whenTen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MIN_VALUE.minus(10.0d));
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and one.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'double'; given ofScaled '-999999999999999999' and one; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenOfScaled999999999999999999AndOne_thenReturnAbsAbs() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 1);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(10.0d);

    // Assert
    Decimal absResult = actualMinusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled {@code 999999999999999999} and one.
   *   <li>When {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'double'; given ofScaled '999999999999999999' and one; when '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenOfScaled999999999999999999AndOne_when05() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(999999999999999999L, 1);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(-0.5d);

    // Assert
    Decimal negatedResult = actualMinusResult.negated();
    assertEquals(actualMinusResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMinusResult.abs();
    assertEquals(actualMinusResult, actualAbsResult);
    assertEquals(actualMinusResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and thirty-five.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'double'; given ofScaled '-999999999999999999' and thirty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenOfScaled999999999999999999AndThirtyFive() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 35);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(10.0d);

    // Assert
    Decimal absResult = actualMinusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled minus five and one.
   *   <li>When {@code 0.5}.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'double'; given ofScaled minus five and one; when '0.5'; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenOfScaledMinusFiveAndOne_when05_thenReturnAbsAbs() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-5L, 1);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(0.5d);

    // Assert
    Decimal absResult = actualMinusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled one and eighteen.
   *   <li>Then return abs scale is seventeen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'double'; given ofScaled one and eighteen; then return abs scale is seventeen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenOfScaledOneAndEighteen_thenReturnAbsScaleIsSeventeen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 18);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(10.0d);

    // Assert
    Decimal absResult = actualMinusResult.abs();
    assertEquals(17, absResult.scale());
    assertEquals(17, actualMinusResult.scale());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled one and minus one.
   *   <li>When ten.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'double'; given ofScaled one and minus one; when ten; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenOfScaledOneAndMinusOne_whenTen_thenReturnZero() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, -1);

    // Act and Assert
    assertSame(Decimal.ZERO, ofScaledResult.minus(10.0d));
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When ten.
   *   <li>Then return abs scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName(
      "Test minus(double) with 'double'; given ofScaled one and one; when ten; then return abs scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenOfScaledOneAndOne_whenTen_thenReturnAbsScaleIsOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(10.0d);

    // Assert
    Decimal absResult = actualMinusResult.abs();
    assertEquals(1, absResult.scale());
    assertEquals(1, actualMinusResult.scale());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When ten.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(double)}
   */
  @Test
  @DisplayName("Test minus(double) with 'double'; given ZERO; when ten; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(double)"})
  void testMinusWithDouble_givenZero_whenTen_thenReturnAbsAbs() {
    // Arrange and Act
    Decimal actualMinusResult = Decimal.ZERO.minus(10.0d);

    // Assert
    Decimal absResult = actualMinusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code 999999999999999999}.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName(
      "Test minus(long) with 'long'; given MAX_VALUE; when '999999999999999999'; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenMax_value_when999999999999999999_thenReturnZero() {
    // Arrange, Act and Assert
    assertSame(Decimal.ZERO, Decimal.MAX_VALUE.minus(999999999999999999L));
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code 1000000000000000000}.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName(
      "Test minus(long) with 'long'; given MAX_VALUE; when '1000000000000000000'; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenMax_value_when1000000000000000000_thenReturnAbsAbs() {
    // Arrange and Act
    Decimal actualMinusResult = Decimal.MAX_VALUE.minus(1000000000000000000L);

    // Assert
    Decimal absResult = actualMinusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName("Test minus(long) with 'long'; given MAX_VALUE; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenMax_value_whenOne() {
    // Arrange and Act
    Decimal actualMinusResult = Decimal.MAX_VALUE.minus(1L);

    // Assert
    Decimal negatedResult = actualMinusResult.negated();
    assertEquals(actualMinusResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMinusResult.abs();
    assertEquals(actualMinusResult, actualAbsResult);
    assertEquals(actualMinusResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When zero.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName("Test minus(long) with 'long'; given MAX_VALUE; when zero; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenMax_value_whenZero_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertSame(Decimal.MAX_VALUE, Decimal.MAX_VALUE.minus(0L));
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When {@code 1000000000000000000}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName("Test minus(long) with 'long'; given MIN_VALUE; when '1000000000000000000'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenMin_value_when1000000000000000000() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.MIN_VALUE.minus(1000000000000000000L));
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When {@link Long#MAX_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName(
      "Test minus(long) with 'long'; given MIN_VALUE; when MAX_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenMin_value_whenMax_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MIN_VALUE.minus(Long.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName(
      "Test minus(long) with 'long'; given MIN_VALUE; when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenMin_value_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MIN_VALUE.minus(1L));
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and one.
   *   <li>When {@code 999999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName(
      "Test minus(long) with 'long'; given ofScaled '-999999999999999999' and one; when '999999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenOfScaled999999999999999999AndOne_when999999999999999999() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofScaledResult.minus(999999999999999999L));
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and one.
   *   <li>When one.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName(
      "Test minus(long) with 'long'; given ofScaled '-999999999999999999' and one; when one; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenOfScaled999999999999999999AndOne_whenOne_thenReturnAbsAbs() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 1);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(1L);

    // Assert
    Decimal absResult = actualMinusResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled one and eighteen.
   *   <li>Then return abs scale is eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName(
      "Test minus(long) with 'long'; given ofScaled one and eighteen; then return abs scale is eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenOfScaledOneAndEighteen_thenReturnAbsScaleIsEighteen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 18);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(1L);

    // Assert
    Decimal absResult = actualMinusResult.abs();
    assertEquals(18, absResult.scale());
    assertEquals(18, actualMinusResult.scale());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName("Test minus(long) with 'long'; given ofScaled one and one; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenOfScaledOneAndOne_thenReturnMax_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertEquals(Decimal.MAX_VALUE, ofScaledResult.minus(-999999999999999999L));
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When one.
   *   <li>Then return abs scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName(
      "Test minus(long) with 'long'; given ofScaled one and one; when one; then return abs scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_givenOfScaledOneAndOne_whenOne_thenReturnAbsScaleIsOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualMinusResult = ofScaledResult.minus(1L);

    // Assert
    Decimal absResult = actualMinusResult.abs();
    assertEquals(1, absResult.scale());
    assertEquals(1, actualMinusResult.scale());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMinusResult.negated());
    assertEquals(actualMinusResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>When {@code -999999999999999999}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName(
      "Test minus(long) with 'long'; when '-999999999999999999'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_when999999999999999999_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.MAX_VALUE.minus(-999999999999999999L));
  }

  /**
   * Test {@link Decimal#minus(long)} with {@code long}.
   *
   * <ul>
   *   <li>When {@code -1000000000000000000}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#minus(long)}
   */
  @Test
  @DisplayName(
      "Test minus(long) with 'long'; when '-1000000000000000000'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.minus(long)"})
  void testMinusWithLong_when1000000000000000000_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.MAX_VALUE.minus(-1000000000000000000L));
  }

  /**
   * Test {@link Decimal#multipliedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(Decimal)}
   */
  @Test
  @DisplayName("Test multipliedBy(Decimal) with 'Decimal'; given Decimal with value is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(Decimal)"})
  void testMultipliedByWithDecimal_givenDecimalWithValueIsFortyTwo() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualMultipliedByResult = ofResult.multipliedBy(Decimal.of(42L));

    // Assert
    Decimal negatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#multipliedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is minus five.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(Decimal)}
   */
  @Test
  @DisplayName("Test multipliedBy(Decimal) with 'Decimal'; given Decimal with value is minus five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(Decimal)"})
  void testMultipliedByWithDecimal_givenDecimalWithValueIsMinusFive() {
    // Arrange
    Decimal ofResult = Decimal.of(-5L);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.multipliedBy(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#multipliedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is minus five.
   *   <li>When {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(Decimal)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(Decimal) with 'Decimal'; given Decimal with value is minus five; when MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(Decimal)"})
  void testMultipliedByWithDecimal_givenDecimalWithValueIsMinusFive_whenMin_value() {
    // Arrange
    Decimal ofResult = Decimal.of(-5L);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.multipliedBy(Decimal.MIN_VALUE));
  }

  /**
   * Test {@link Decimal#multipliedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(Decimal)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(Decimal) with 'Decimal'; given MAX_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(Decimal)"})
  void testMultipliedByWithDecimal_givenMax_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.MAX_VALUE.multipliedBy(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#multipliedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(Decimal)}
   */
  @Test
  @DisplayName("Test multipliedBy(Decimal) with 'Decimal'; given MAX_VALUE; when ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(Decimal)"})
  void testMultipliedByWithDecimal_givenMax_value_whenZero() {
    // Arrange and Act
    Decimal actualMultipliedByResult = Decimal.MAX_VALUE.multipliedBy(Decimal.ZERO);

    // Assert
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#multipliedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -1486618625} and eighteen.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(Decimal)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(Decimal) with 'Decimal'; given ofScaled '-1486618625' and eighteen; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(Decimal)"})
  void testMultipliedByWithDecimal_givenOfScaled1486618625AndEighteen_thenReturnAbsAbs() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-1486618625L, 18);

    // Act
    Decimal actualMultipliedByResult = ofScaledResult.multipliedBy(Decimal.of(42L));

    // Assert
    Decimal absResult = actualMultipliedByResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMultipliedByResult.negated());
    assertEquals(actualMultipliedByResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#multipliedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled eight and eighteen.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(Decimal)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(Decimal) with 'Decimal'; given ofScaled eight and eighteen; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(Decimal)"})
  void testMultipliedByWithDecimal_givenOfScaledEightAndEighteen_whenMax_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(8L, 18);

    // Act
    Decimal actualMultipliedByResult = ofScaledResult.multipliedBy(Decimal.MAX_VALUE);

    // Assert
    Decimal negatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#multipliedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(Decimal)}
   */
  @Test
  @DisplayName("Test multipliedBy(Decimal) with 'Decimal'; given ZERO; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(Decimal)"})
  void testMultipliedByWithDecimal_givenZero_whenMax_value() {
    // Arrange and Act
    Decimal actualMultipliedByResult = Decimal.ZERO.multipliedBy(Decimal.MAX_VALUE);

    // Assert
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#multipliedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then return abs scale is eight.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(Decimal)}
   */
  @Test
  @DisplayName("Test multipliedBy(Decimal) with 'Decimal'; then return abs scale is eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(Decimal)"})
  void testMultipliedByWithDecimal_thenReturnAbsScaleIsEight() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-1486618625L, 18);

    // Act
    Decimal actualMultipliedByResult = ofScaledResult.multipliedBy(Decimal.MAX_VALUE);

    // Assert
    Decimal absResult = actualMultipliedByResult.abs();
    assertEquals(8, absResult.scale());
    assertEquals(8, actualMultipliedByResult.scale());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMultipliedByResult.negated());
    assertEquals(actualMultipliedByResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(double) with 'double'; given Decimal with value is forty-two; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_givenDecimalWithValueIsFortyTwo_whenTen() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualMultipliedByResult = ofResult.multipliedBy(10.0d);

    // Assert
    Decimal negatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(double) with 'double'; given MAX_VALUE; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_givenMax_value_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.multipliedBy(10.0d));
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'double'; given MAX_VALUE; when '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_givenMax_value_when05() {
    // Arrange and Act
    Decimal actualMultipliedByResult = Decimal.MAX_VALUE.multipliedBy(0.5d);

    // Assert
    Decimal negatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code -0.5}.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(double) with 'double'; given MAX_VALUE; when '-0.5'; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_givenMax_value_when05_thenReturnAbsAbs() {
    // Arrange and Act
    Decimal actualMultipliedByResult = Decimal.MAX_VALUE.multipliedBy(-0.5d);

    // Assert
    Decimal absResult = actualMultipliedByResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMultipliedByResult.negated());
    assertEquals(actualMultipliedByResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'double'; given MAX_VALUE; when zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_givenMax_value_whenZero() {
    // Arrange and Act
    Decimal actualMultipliedByResult = Decimal.MAX_VALUE.multipliedBy(0.0d);

    // Assert
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled {@link Long#MAX_VALUE} and one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'double'; given ofScaled MAX_VALUE and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_givenOfScaledMax_valueAndOne() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Decimal.ofScaled(Long.MAX_VALUE, 1).multipliedBy(10.0d));
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled {@link Long#MIN_VALUE} and one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'double'; given ofScaled MIN_VALUE and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_givenOfScaledMin_valueAndOne() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Decimal.ofScaled(Long.MIN_VALUE, 1).multipliedBy(10.0d));
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled one and eighteen.
   *   <li>When {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(double) with 'double'; given ofScaled one and eighteen; when '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_givenOfScaledOneAndEighteen_when05() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 18);

    // Act
    Decimal actualMultipliedByResult = ofScaledResult.multipliedBy(0.5d);

    // Assert
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'double'; given ofScaled one and one; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_givenOfScaledOneAndOne_whenTen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualMultipliedByResult = ofScaledResult.multipliedBy(10.0d);

    // Assert
    Decimal negatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'double'; given ZERO; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_givenZero_whenTen() {
    // Arrange and Act
    Decimal actualMultipliedByResult = Decimal.ZERO.multipliedBy(10.0d);

    // Assert
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'double'; then return MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_thenReturnMin_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 1);

    // Act and Assert
    assertEquals(Decimal.MIN_VALUE, ofScaledResult.multipliedBy(10.0d));
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return scale is eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double) with 'double'; then return scale is eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_thenReturnScaleIsEighteen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(3L, 18);

    // Act
    Decimal actualMultipliedByResult = ofScaledResult.multipliedBy(0.5d);

    // Assert
    assertEquals(18, actualMultipliedByResult.scale());
    Decimal negatedResult = actualMultipliedByResult.negated();
    assertEquals(18, negatedResult.scale());
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.abs());
    assertEquals(actualMultipliedByResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#multipliedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(double)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(double) with 'double'; when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(double)"})
  void testMultipliedByWithDouble_whenNaN_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.multipliedBy(Double.NaN));
  }

  /**
   * Test {@link Decimal#multipliedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When one.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long) with 'long'; given MAX_VALUE; when one; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(long)"})
  void testMultipliedByWithLong_givenMax_value_whenOne_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertEquals(Decimal.MAX_VALUE, Decimal.MAX_VALUE.multipliedBy(1L));
  }

  /**
   * Test {@link Decimal#multipliedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long) with 'long'; given MAX_VALUE; when zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(long)"})
  void testMultipliedByWithLong_givenMax_value_whenZero() {
    // Arrange and Act
    Decimal actualMultipliedByResult = Decimal.MAX_VALUE.multipliedBy(0L);

    // Assert
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#multipliedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When minus five.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long) with 'long'; given MIN_VALUE; when minus five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(long)"})
  void testMultipliedByWithLong_givenMin_value_whenMinusFive() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MIN_VALUE.multipliedBy(-5L));
  }

  /**
   * Test {@link Decimal#multipliedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>Then return ofScaled one and one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long) with 'long'; given ofScaled one and one; then return ofScaled one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(long)"})
  void testMultipliedByWithLong_givenOfScaledOneAndOne_thenReturnOfScaledOneAndOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualMultipliedByResult = ofScaledResult.multipliedBy(1L);

    // Assert
    assertEquals(ofScaledResult, actualMultipliedByResult);
  }

  /**
   * Test {@link Decimal#multipliedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Long#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long) with 'long'; given ofScaled one and one; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(long)"})
  void testMultipliedByWithLong_givenOfScaledOneAndOne_whenMax_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualMultipliedByResult = ofScaledResult.multipliedBy(Long.MAX_VALUE);

    // Assert
    Decimal negatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#multipliedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long) with 'long'; given ofScaled one and one; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(long)"})
  void testMultipliedByWithLong_givenOfScaledOneAndOne_whenTen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualMultipliedByResult = ofScaledResult.multipliedBy(10L);

    // Assert
    Decimal negatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#multipliedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long) with 'long'; given ZERO; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(long)"})
  void testMultipliedByWithLong_givenZero_whenOne() {
    // Arrange and Act
    Decimal actualMultipliedByResult = Decimal.ZERO.multipliedBy(1L);

    // Assert
    Decimal actualAbsResult = actualMultipliedByResult.abs();
    assertEquals(actualMultipliedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualMultipliedByResult.negated();
    assertEquals(actualMultipliedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#multipliedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Then return {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long) with 'long'; then return MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(long)"})
  void testMultipliedByWithLong_thenReturnMin_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 1);

    // Act and Assert
    assertEquals(Decimal.MIN_VALUE, ofScaledResult.multipliedBy(10L));
  }

  /**
   * Test {@link Decimal#multipliedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>When {@code -1486618625}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long) with 'long'; when '-1486618625'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(long)"})
  void testMultipliedByWithLong_when1486618625_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.MAX_VALUE.multipliedBy(-1486618625L));
  }

  /**
   * Test {@link Decimal#multipliedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>When minus five.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long) with 'long'; when minus five; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.multipliedBy(long)"})
  void testMultipliedByWithLong_whenMinusFive_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.multipliedBy(-5L));
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code -1486618625}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName("Test movePoint(int); given MAX_VALUE; when '-1486618625'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenMax_value_when1486618625() {
    // Arrange and Act
    Decimal actualMovePointResult = Decimal.MAX_VALUE.movePoint(-1486618625);

    // Assert
    Decimal actualAbsResult = actualMovePointResult.abs();
    assertEquals(actualMovePointResult, actualAbsResult);
    Decimal actualNegatedResult = actualMovePointResult.negated();
    assertEquals(actualMovePointResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Integer#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName("Test movePoint(int); given MAX_VALUE; when MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenMax_value_whenMin_value() {
    // Arrange and Act
    Decimal actualMovePointResult = Decimal.MAX_VALUE.movePoint(Integer.MIN_VALUE);

    // Assert
    Decimal actualAbsResult = actualMovePointResult.abs();
    assertEquals(actualMovePointResult, actualAbsResult);
    Decimal actualNegatedResult = actualMovePointResult.negated();
    assertEquals(actualMovePointResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When minus one.
   *   <li>Then return scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName("Test movePoint(int); given MAX_VALUE; when minus one; then return scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenMax_value_whenMinusOne_thenReturnScaleIsOne() {
    // Arrange and Act
    Decimal actualMovePointResult = Decimal.MAX_VALUE.movePoint(-1);

    // Assert
    assertEquals(1, actualMovePointResult.scale());
    Decimal negatedResult = actualMovePointResult.negated();
    assertEquals(1, negatedResult.scale());
    Decimal actualAbsResult = actualMovePointResult.abs();
    assertEquals(actualMovePointResult, actualAbsResult);
    assertEquals(actualMovePointResult, negatedResult.abs());
    assertEquals(actualMovePointResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName(
      "Test movePoint(int); given MAX_VALUE; when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenMax_value_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.movePoint(1));
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When thirty-six.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName(
      "Test movePoint(int); given MAX_VALUE; when thirty-six; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenMax_value_whenThirtySix_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.movePoint(36));
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When zero.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName("Test movePoint(int); given MAX_VALUE; when zero; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenMax_value_whenZero_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertSame(Decimal.MAX_VALUE, Decimal.MAX_VALUE.movePoint(0));
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given ofScaled eighteen and one.
   *   <li>When eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName("Test movePoint(int); given ofScaled eighteen and one; when eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenOfScaledEighteenAndOne_whenEighteen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(18L, 1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofScaledResult.movePoint(18));
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given ofScaled minus eighteen and one.
   *   <li>Then return signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName(
      "Test movePoint(int); given ofScaled minus eighteen and one; then return signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenOfScaledMinusEighteenAndOne_thenReturnSignumIsMinusOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-18L, 1);

    // Act
    Decimal actualMovePointResult = ofScaledResult.movePoint(-18);

    // Assert
    assertEquals(-1, actualMovePointResult.signum());
    Decimal absResult = actualMovePointResult.abs();
    assertEquals(18, absResult.scale());
    assertEquals(18, actualMovePointResult.scale());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMovePointResult.negated());
    assertEquals(actualMovePointResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given ofScaled minus eighteen and one.
   *   <li>When eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName("Test movePoint(int); given ofScaled minus eighteen and one; when eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenOfScaledMinusEighteenAndOne_whenEighteen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-18L, 1);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofScaledResult.movePoint(18));
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When minus eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName("Test movePoint(int); given ofScaled one and one; when minus eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenOfScaledOneAndOne_whenMinusEighteen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualMovePointResult = ofScaledResult.movePoint(-18);

    // Assert
    Decimal actualAbsResult = actualMovePointResult.abs();
    assertEquals(actualMovePointResult, actualAbsResult);
    Decimal actualNegatedResult = actualMovePointResult.negated();
    assertEquals(actualMovePointResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When minus one.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName("Test movePoint(int); given ZERO; when minus one; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenZero_whenMinusOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(Decimal.ZERO, Decimal.ZERO.movePoint(-1));
  }

  /**
   * Test {@link Decimal#movePoint(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When one.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#movePoint(int)}
   */
  @Test
  @DisplayName("Test movePoint(int); given ZERO; when one; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.movePoint(int)"})
  void testMovePoint_givenZero_whenOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(Decimal.ZERO, Decimal.ZERO.movePoint(1));
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal, RoundingMode)} with {@code Decimal}, {@code
   * RoundingMode}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(Decimal, RoundingMode) with 'Decimal', 'RoundingMode'; given MAX_VALUE; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal, RoundingMode)"})
  void testDividedByWithDecimalRoundingMode_givenMax_value_whenMax_value() {
    // Arrange and Act
    Decimal actualDividedByResult = Decimal.MAX_VALUE.dividedBy(Decimal.MAX_VALUE, RoundingMode.UP);

    // Assert
    Decimal negatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    assertEquals(actualDividedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal, RoundingMode)} with {@code Decimal}, {@code
   * RoundingMode}.
   *
   * <ul>
   *   <li>Given ofScaled eighteen and eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(Decimal, RoundingMode) with 'Decimal', 'RoundingMode'; given ofScaled eighteen and eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal, RoundingMode)"})
  void testDividedByWithDecimalRoundingMode_givenOfScaledEighteenAndEighteen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(18L, 18);

    // Act
    Decimal actualDividedByResult = ofScaledResult.dividedBy(Decimal.MAX_VALUE, RoundingMode.UP);

    // Assert
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal, RoundingMode)} with {@code Decimal}, {@code
   * RoundingMode}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(Decimal, RoundingMode) with 'Decimal', 'RoundingMode'; given ZERO; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal, RoundingMode)"})
  void testDividedByWithDecimalRoundingMode_givenZero_whenMax_value() {
    // Arrange and Act
    Decimal actualDividedByResult = Decimal.ZERO.dividedBy(Decimal.MAX_VALUE, RoundingMode.UP);

    // Assert
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal, RoundingMode)} with {@code Decimal}, {@code
   * RoundingMode}.
   *
   * <ul>
   *   <li>Then return scale is eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(Decimal, RoundingMode) with 'Decimal', 'RoundingMode'; then return scale is eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal, RoundingMode)"})
  void testDividedByWithDecimalRoundingMode_thenReturnScaleIsEighteen() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualDividedByResult = ofResult.dividedBy(Decimal.MAX_VALUE, RoundingMode.UP);

    // Assert
    assertEquals(18, actualDividedByResult.scale());
    Decimal negatedResult = actualDividedByResult.negated();
    assertEquals(18, negatedResult.scale());
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    assertEquals(actualDividedByResult, negatedResult.abs());
    assertEquals(actualDividedByResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal, RoundingMode)} with {@code Decimal}, {@code
   * RoundingMode}.
   *
   * <ul>
   *   <li>Then return scale is seventeen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(Decimal, RoundingMode) with 'Decimal', 'RoundingMode'; then return scale is seventeen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal, RoundingMode)"})
  void testDividedByWithDecimalRoundingMode_thenReturnScaleIsSeventeen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(18L, -1);

    // Act
    Decimal actualDividedByResult = ofScaledResult.dividedBy(Decimal.MAX_VALUE, RoundingMode.UP);

    // Assert
    assertEquals(17, actualDividedByResult.scale());
    Decimal negatedResult = actualDividedByResult.negated();
    assertEquals(17, negatedResult.scale());
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    assertEquals(actualDividedByResult, negatedResult.abs());
    assertEquals(actualDividedByResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal, RoundingMode)} with {@code Decimal}, {@code
   * RoundingMode}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(Decimal, RoundingMode) with 'Decimal', 'RoundingMode'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal, RoundingMode)"})
  void testDividedByWithDecimalRoundingMode_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Decimal.MAX_VALUE.dividedBy(Decimal.ofScaled(18L, 18), RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(Decimal) with 'Decimal'; given Decimal with value is forty-two; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal)"})
  void testDividedByWithDecimal_givenDecimalWithValueIsFortyTwo_whenMax_value() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualDividedByResult = ofResult.dividedBy(Decimal.MAX_VALUE);

    // Assert
    Decimal negatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    assertEquals(actualDividedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal)}
   */
  @Test
  @DisplayName("Test dividedBy(Decimal) with 'Decimal'; given MAX_VALUE; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal)"})
  void testDividedByWithDecimal_givenMax_value_whenMax_value() {
    // Arrange and Act
    Decimal actualDividedByResult = Decimal.MAX_VALUE.dividedBy(Decimal.MAX_VALUE);

    // Assert
    Decimal negatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    assertEquals(actualDividedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled eighteen and eighteen.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(Decimal) with 'Decimal'; given ofScaled eighteen and eighteen; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal)"})
  void testDividedByWithDecimal_givenOfScaledEighteenAndEighteen_whenMax_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(18L, 18);

    // Act
    Decimal actualDividedByResult = ofScaledResult.dividedBy(Decimal.MAX_VALUE);

    // Assert
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled eighteen and two.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(Decimal) with 'Decimal'; given ofScaled eighteen and two; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal)"})
  void testDividedByWithDecimal_givenOfScaledEighteenAndTwo_whenMax_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(18L, 2);

    // Act
    Decimal actualDividedByResult = ofScaledResult.dividedBy(Decimal.MAX_VALUE);

    // Assert
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled {@link Long#MAX_VALUE} and eighteen.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(Decimal) with 'Decimal'; given ofScaled MAX_VALUE and eighteen; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal)"})
  void testDividedByWithDecimal_givenOfScaledMax_valueAndEighteen_whenMax_value() {
    // Arrange and Act
    Decimal actualDividedByResult =
        Decimal.ofScaled(Long.MAX_VALUE, 18).dividedBy(Decimal.MAX_VALUE);

    // Assert
    Decimal negatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    assertEquals(actualDividedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal)}
   */
  @Test
  @DisplayName("Test dividedBy(Decimal) with 'Decimal'; given ZERO; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal)"})
  void testDividedByWithDecimal_givenZero_whenMax_value() {
    // Arrange and Act
    Decimal actualDividedByResult = Decimal.ZERO.dividedBy(Decimal.MAX_VALUE);

    // Assert
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#dividedBy(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(Decimal)}
   */
  @Test
  @DisplayName("Test dividedBy(Decimal) with 'Decimal'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(Decimal)"})
  void testDividedByWithDecimal_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Decimal.MAX_VALUE.dividedBy(Decimal.ofScaled(18L, 18)));
  }

  /**
   * Test {@link Decimal#dividedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code 0.5}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(double)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(double) with 'double'; given MAX_VALUE; when '0.5'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(double)"})
  void testDividedByWithDouble_givenMax_value_when05_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.dividedBy(0.5d));
  }

  /**
   * Test {@link Decimal#dividedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code -0.5}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(double)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(double) with 'double'; given MAX_VALUE; when '-0.5'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(double)"})
  void testDividedByWithDouble_givenMax_value_when05_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.dividedBy(-0.5d));
  }

  /**
   * Test {@link Decimal#dividedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(double)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(double) with 'double'; given MAX_VALUE; when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(double)"})
  void testDividedByWithDouble_givenMax_value_whenNaN_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.dividedBy(Double.NaN));
  }

  /**
   * Test {@link Decimal#dividedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When one.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(double)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(double) with 'double'; given MAX_VALUE; when one; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(double)"})
  void testDividedByWithDouble_givenMax_value_whenOne_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertEquals(Decimal.MAX_VALUE, Decimal.MAX_VALUE.dividedBy(1.0d));
  }

  /**
   * Test {@link Decimal#dividedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When ten.
   *   <li>Then return scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(double)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(double) with 'double'; given MAX_VALUE; when ten; then return scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(double)"})
  void testDividedByWithDouble_givenMax_value_whenTen_thenReturnScaleIsOne() {
    // Arrange and Act
    Decimal actualDividedByResult = Decimal.MAX_VALUE.dividedBy(10.0d);

    // Assert
    assertEquals(1, actualDividedByResult.scale());
    Decimal negatedResult = actualDividedByResult.negated();
    assertEquals(1, negatedResult.scale());
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    assertEquals(actualDividedByResult, negatedResult.abs());
    assertEquals(actualDividedByResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#dividedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given ofScaled one and eighteen.
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(double)}
   */
  @Test
  @DisplayName("Test dividedBy(double) with 'double'; given ofScaled one and eighteen; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(double)"})
  void testDividedByWithDouble_givenOfScaledOneAndEighteen_whenTen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 18);

    // Act
    Decimal actualDividedByResult = ofScaledResult.dividedBy(10.0d);

    // Assert
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#dividedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(double)}
   */
  @Test
  @DisplayName("Test dividedBy(double) with 'double'; given ZERO; when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(double)"})
  void testDividedByWithDouble_givenZero_whenTen() {
    // Arrange and Act
    Decimal actualDividedByResult = Decimal.ZERO.dividedBy(10.0d);

    // Assert
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#dividedBy(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(double)}
   */
  @Test
  @DisplayName("Test dividedBy(double) with 'double'; then return signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(double)"})
  void testDividedByWithDouble_thenReturnSignumIsMinusOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-1486618625L, 18);

    // Act
    Decimal actualDividedByResult = ofScaledResult.dividedBy(10.0d);

    // Assert
    assertEquals(-1, actualDividedByResult.signum());
    Decimal absResult = actualDividedByResult.abs();
    assertEquals(18, absResult.scale());
    assertEquals(18, actualDividedByResult.scale());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualDividedByResult.negated());
    assertEquals(actualDividedByResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#dividedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   *   <li>When {@link Long#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(long)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(long) with 'long'; given Decimal with value is forty-two; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(long)"})
  void testDividedByWithLong_givenDecimalWithValueIsFortyTwo_whenMax_value() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualDividedByResult = ofResult.dividedBy(Long.MAX_VALUE);

    // Assert
    Decimal negatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    assertEquals(actualDividedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#dividedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code -999999999999999999}.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(long)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(long) with 'long'; given MAX_VALUE; when '-999999999999999999'; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(long)"})
  void testDividedByWithLong_givenMax_value_when999999999999999999_thenReturnAbsAbs() {
    // Arrange and Act
    Decimal actualDividedByResult = Decimal.MAX_VALUE.dividedBy(-999999999999999999L);

    // Assert
    Decimal absResult = actualDividedByResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualDividedByResult.negated());
    assertEquals(actualDividedByResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#dividedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Long#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(long)}
   */
  @Test
  @DisplayName("Test dividedBy(long) with 'long'; given MAX_VALUE; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(long)"})
  void testDividedByWithLong_givenMax_value_whenMax_value() {
    // Arrange and Act
    Decimal actualDividedByResult = Decimal.MAX_VALUE.dividedBy(Long.MAX_VALUE);

    // Assert
    Decimal negatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    assertEquals(actualDividedByResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#dividedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When one.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(long)}
   */
  @Test
  @DisplayName("Test dividedBy(long) with 'long'; given MAX_VALUE; when one; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(long)"})
  void testDividedByWithLong_givenMax_value_whenOne_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertSame(Decimal.MAX_VALUE, Decimal.MAX_VALUE.dividedBy(1L));
  }

  /**
   * Test {@link Decimal#dividedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When ten.
   *   <li>Then return scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(long)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(long) with 'long'; given MAX_VALUE; when ten; then return scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(long)"})
  void testDividedByWithLong_givenMax_value_whenTen_thenReturnScaleIsOne() {
    // Arrange and Act
    Decimal actualDividedByResult = Decimal.MAX_VALUE.dividedBy(10L);

    // Assert
    assertEquals(1, actualDividedByResult.scale());
    Decimal negatedResult = actualDividedByResult.negated();
    assertEquals(1, negatedResult.scale());
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    assertEquals(actualDividedByResult, negatedResult.abs());
    assertEquals(actualDividedByResult, negatedResult.negated());
  }

  /**
   * Test {@link Decimal#dividedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@code -999999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(long)}
   */
  @Test
  @DisplayName(
      "Test dividedBy(long) with 'long'; given ofScaled one and one; when '-999999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(long)"})
  void testDividedByWithLong_givenOfScaledOneAndOne_when999999999999999999() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualDividedByResult = ofScaledResult.dividedBy(-999999999999999999L);

    // Assert
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#dividedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Long#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(long)}
   */
  @Test
  @DisplayName("Test dividedBy(long) with 'long'; given ofScaled one and one; when MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(long)"})
  void testDividedByWithLong_givenOfScaledOneAndOne_whenMax_value() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualDividedByResult = ofScaledResult.dividedBy(Long.MAX_VALUE);

    // Assert
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#dividedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When {@code -999999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(long)}
   */
  @Test
  @DisplayName("Test dividedBy(long) with 'long'; given ZERO; when '-999999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(long)"})
  void testDividedByWithLong_givenZero_when999999999999999999() {
    // Arrange and Act
    Decimal actualDividedByResult = Decimal.ZERO.dividedBy(-999999999999999999L);

    // Assert
    Decimal actualAbsResult = actualDividedByResult.abs();
    assertEquals(actualDividedByResult, actualAbsResult);
    Decimal actualNegatedResult = actualDividedByResult.negated();
    assertEquals(actualDividedByResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#dividedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When ten.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(long)}
   */
  @Test
  @DisplayName("Test dividedBy(long) with 'long'; given ZERO; when ten; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(long)"})
  void testDividedByWithLong_givenZero_whenTen_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(Decimal.ZERO, Decimal.ZERO.dividedBy(10L));
  }

  /**
   * Test {@link Decimal#dividedBy(long)} with {@code long}.
   *
   * <ul>
   *   <li>Then return abs is ofScaled {@link Long#MAX_VALUE} and one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#dividedBy(long)}
   */
  @Test
  @DisplayName("Test dividedBy(long) with 'long'; then return abs is ofScaled MAX_VALUE and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.dividedBy(long)"})
  void testDividedByWithLong_thenReturnAbsIsOfScaledMax_valueAndOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(Long.MAX_VALUE, 1);

    // Act
    Decimal actualDividedByResult = ofScaledResult.dividedBy(-1L);

    // Assert
    assertEquals(ofScaledResult, actualDividedByResult.abs());
    assertEquals(ofScaledResult, actualDividedByResult.negated());
  }

  /**
   * Test {@link Decimal#remainder(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#remainder(Decimal)}
   */
  @Test
  @DisplayName("Test remainder(Decimal); given MAX_VALUE; when MAX_VALUE; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.remainder(Decimal)"})
  void testRemainder_givenMax_value_whenMax_value_thenReturnZero() {
    // Arrange, Act and Assert
    assertSame(Decimal.ZERO, Decimal.MAX_VALUE.remainder(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#remainder(Decimal)}.
   *
   * <ul>
   *   <li>Then return {@link Decimal} with value is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#remainder(Decimal)}
   */
  @Test
  @DisplayName("Test remainder(Decimal); then return Decimal with value is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.remainder(Decimal)"})
  void testRemainder_thenReturnDecimalWithValueIsFortyTwo() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualRemainderResult = ofResult.remainder(Decimal.MAX_VALUE);

    // Assert
    assertEquals(ofResult, actualRemainderResult);
  }

  /**
   * Test {@link Decimal#remainder(Decimal)}.
   *
   * <ul>
   *   <li>Then return ofScaled eighteen and eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#remainder(Decimal)}
   */
  @Test
  @DisplayName("Test remainder(Decimal); then return ofScaled eighteen and eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.remainder(Decimal)"})
  void testRemainder_thenReturnOfScaledEighteenAndEighteen() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(18L, 18);

    // Act
    Decimal actualRemainderResult = ofScaledResult.remainder(Decimal.MAX_VALUE);

    // Assert
    assertEquals(ofScaledResult, actualRemainderResult);
  }

  /**
   * Test {@link Decimal#remainder(Decimal)}.
   *
   * <ul>
   *   <li>Then return ofScaled eighteen and minus one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#remainder(Decimal)}
   */
  @Test
  @DisplayName("Test remainder(Decimal); then return ofScaled eighteen and minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.remainder(Decimal)"})
  void testRemainder_thenReturnOfScaledEighteenAndMinusOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(18L, -1);

    // Act
    Decimal actualRemainderResult = ofScaledResult.remainder(Decimal.MAX_VALUE);

    // Assert
    assertEquals(ofScaledResult, actualRemainderResult);
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   *   <li>When {@code CEILING}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given Decimal with value is forty-two; when 'CEILING'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenDecimalWithValueIsFortyTwo_whenCeiling() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualRoundToScaleResult = ofResult.roundToScale(-17, RoundingMode.CEILING);

    // Assert
    Decimal negatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, negatedResult.abs().abs());
    assertEquals(actualRoundToScaleResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualRoundToScaleResult.abs();
    assertEquals(actualRoundToScaleResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   *   <li>When {@code DOWN}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given Decimal with value is forty-two; when 'DOWN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenDecimalWithValueIsFortyTwo_whenDown() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualRoundToScaleResult = ofResult.roundToScale(-17, RoundingMode.DOWN);

    // Assert
    Decimal actualAbsResult = actualRoundToScaleResult.abs();
    assertEquals(actualRoundToScaleResult, actualAbsResult);
    Decimal actualNegatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   *   <li>When {@code HALF_DOWN}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given Decimal with value is forty-two; when 'HALF_DOWN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenDecimalWithValueIsFortyTwo_whenHalfDown() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualRoundToScaleResult = ofResult.roundToScale(-17, RoundingMode.HALF_DOWN);

    // Assert
    Decimal actualAbsResult = actualRoundToScaleResult.abs();
    assertEquals(actualRoundToScaleResult, actualAbsResult);
    Decimal actualNegatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   *   <li>When {@code HALF_UP}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given Decimal with value is forty-two; when 'HALF_UP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenDecimalWithValueIsFortyTwo_whenHalfUp() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualRoundToScaleResult = ofResult.roundToScale(-17, RoundingMode.HALF_UP);

    // Assert
    Decimal actualAbsResult = actualRoundToScaleResult.abs();
    assertEquals(actualRoundToScaleResult, actualAbsResult);
    Decimal actualNegatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is forty-two.
   *   <li>When {@code UP}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given Decimal with value is forty-two; when 'UP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenDecimalWithValueIsFortyTwo_whenUp() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);

    // Act
    Decimal actualRoundToScaleResult = ofResult.roundToScale(-17, RoundingMode.UP);

    // Assert
    Decimal negatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, negatedResult.abs().abs());
    assertEquals(actualRoundToScaleResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualRoundToScaleResult.abs();
    assertEquals(actualRoundToScaleResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code CEILING}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given MAX_VALUE; when 'CEILING'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenMax_value_whenCeiling_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Decimal.MAX_VALUE.roundToScale(-17, RoundingMode.CEILING));
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code DOWN}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName("Test roundToScale(int, RoundingMode); given MAX_VALUE; when 'DOWN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenMax_value_whenDown() {
    // Arrange and Act
    Decimal actualRoundToScaleResult = Decimal.MAX_VALUE.roundToScale(-17, RoundingMode.DOWN);

    // Assert
    Decimal negatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, negatedResult.abs().abs());
    assertEquals(actualRoundToScaleResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualRoundToScaleResult.abs();
    assertEquals(actualRoundToScaleResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code FLOOR}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName("Test roundToScale(int, RoundingMode); given MAX_VALUE; when 'FLOOR'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenMax_value_whenFloor() {
    // Arrange and Act
    Decimal actualRoundToScaleResult = Decimal.MAX_VALUE.roundToScale(-17, RoundingMode.FLOOR);

    // Assert
    Decimal negatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, negatedResult.abs().abs());
    assertEquals(actualRoundToScaleResult, negatedResult.negated().abs());
    Decimal actualAbsResult = actualRoundToScaleResult.abs();
    assertEquals(actualRoundToScaleResult, actualAbsResult);
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code HALF_DOWN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given MAX_VALUE; when 'HALF_DOWN'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenMax_value_whenHalfDown_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Decimal.MAX_VALUE.roundToScale(-17, RoundingMode.HALF_DOWN));
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code HALF_UP}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given MAX_VALUE; when 'HALF_UP'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenMax_value_whenHalfUp_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Decimal.MAX_VALUE.roundToScale(-17, RoundingMode.HALF_UP));
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When one.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given MAX_VALUE; when one; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenMax_value_whenOne_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertSame(Decimal.MAX_VALUE, Decimal.MAX_VALUE.roundToScale(1, RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code UP}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given MAX_VALUE; when 'UP'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenMax_value_whenUp_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.MAX_VALUE.roundToScale(-17, RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When {@code CEILING}.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given MIN_VALUE; when 'CEILING'; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenMin_value_whenCeiling_thenReturnAbsAbs() {
    // Arrange and Act
    Decimal actualRoundToScaleResult = Decimal.MIN_VALUE.roundToScale(-17, RoundingMode.CEILING);

    // Assert
    Decimal absResult = actualRoundToScaleResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualRoundToScaleResult.negated());
    assertEquals(actualRoundToScaleResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When {@code FLOOR}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given MIN_VALUE; when 'FLOOR'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenMin_value_whenFloor_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Decimal.MIN_VALUE.roundToScale(-17, RoundingMode.FLOOR));
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When {@code HALF_UP}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given MIN_VALUE; when 'HALF_UP'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenMin_value_whenHalfUp_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Decimal.MIN_VALUE.roundToScale(-17, RoundingMode.HALF_UP));
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and eighteen.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given ofScaled '-999999999999999999' and eighteen; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenOfScaled999999999999999999AndEighteen_thenReturnAbsAbs() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 18);

    // Act
    Decimal actualRoundToScaleResult = ofScaledResult.roundToScale(-17, RoundingMode.FLOOR);

    // Assert
    Decimal absResult = actualRoundToScaleResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualRoundToScaleResult.negated());
    assertEquals(actualRoundToScaleResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and eighteen.
   *   <li>When one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given ofScaled '-999999999999999999' and eighteen; when one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenOfScaled999999999999999999AndEighteen_whenOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 18);

    // Act
    Decimal actualRoundToScaleResult = ofScaledResult.roundToScale(1, RoundingMode.FLOOR);

    // Assert
    Decimal absResult = actualRoundToScaleResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualRoundToScaleResult.negated());
    assertEquals(actualRoundToScaleResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and one.
   *   <li>Then return abs abs.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given ofScaled '-999999999999999999' and one; then return abs abs")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenOfScaled999999999999999999AndOne_thenReturnAbsAbs() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 1);

    // Act
    Decimal actualRoundToScaleResult = ofScaledResult.roundToScale(-17, RoundingMode.FLOOR);

    // Assert
    Decimal absResult = actualRoundToScaleResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualRoundToScaleResult.negated());
    assertEquals(actualRoundToScaleResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and one.
   *   <li>When {@code HALF_UP}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given ofScaled '-999999999999999999' and one; when 'HALF_UP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenOfScaled999999999999999999AndOne_whenHalfUp() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 1);

    // Act
    Decimal actualRoundToScaleResult = ofScaledResult.roundToScale(-17, RoundingMode.HALF_UP);

    // Assert
    Decimal absResult = actualRoundToScaleResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualRoundToScaleResult.negated());
    assertEquals(actualRoundToScaleResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled eighteen and eighteen.
   *   <li>When {@code FLOOR}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given ofScaled eighteen and eighteen; when 'FLOOR'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenOfScaledEighteenAndEighteen_whenFloor() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(18L, 18);

    // Act
    Decimal actualRoundToScaleResult = ofScaledResult.roundToScale(-17, RoundingMode.FLOOR);

    // Assert
    Decimal actualAbsResult = actualRoundToScaleResult.abs();
    assertEquals(actualRoundToScaleResult, actualAbsResult);
    Decimal actualNegatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled minus eighteen and eighteen.
   *   <li>Then return abs scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given ofScaled minus eighteen and eighteen; then return abs scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenOfScaledMinusEighteenAndEighteen_thenReturnAbsScaleIsOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-18L, 18);

    // Act
    Decimal actualRoundToScaleResult = ofScaledResult.roundToScale(1, RoundingMode.FLOOR);

    // Assert
    Decimal absResult = actualRoundToScaleResult.abs();
    assertEquals(1, absResult.scale());
    assertEquals(1, actualRoundToScaleResult.scale());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualRoundToScaleResult.negated());
    assertEquals(actualRoundToScaleResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@code HALF_UP}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName("Test roundToScale(int, RoundingMode); given ofScaled one and one; when 'HALF_UP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenOfScaledOneAndOne_whenHalfUp() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualRoundToScaleResult = ofScaledResult.roundToScale(-17, RoundingMode.HALF_UP);

    // Assert
    Decimal actualAbsResult = actualRoundToScaleResult.abs();
    assertEquals(actualRoundToScaleResult, actualAbsResult);
    Decimal actualNegatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When {@code DOWN}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName("Test roundToScale(int, RoundingMode); given ZERO; when 'DOWN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenZero_whenDown() {
    // Arrange and Act
    Decimal actualRoundToScaleResult = Decimal.ZERO.roundToScale(-17, RoundingMode.DOWN);

    // Assert
    Decimal actualAbsResult = actualRoundToScaleResult.abs();
    assertEquals(actualRoundToScaleResult, actualAbsResult);
    Decimal actualNegatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, actualNegatedResult);
  }

  /**
   * Test {@link Decimal#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>When minus eighteen.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); when minus eighteen; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToScale(int, RoundingMode)"})
  void testRoundToScale_whenMinusEighteen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Decimal.MAX_VALUE.roundToScale(-18, RoundingMode.DOWN));
  }

  /**
   * Test {@link Decimal#roundToPrecision(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When eighteen.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToPrecision(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToPrecision(int, RoundingMode); given MAX_VALUE; when eighteen; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToPrecision(int, RoundingMode)"})
  void testRoundToPrecision_givenMax_value_whenEighteen_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertSame(Decimal.MAX_VALUE, Decimal.MAX_VALUE.roundToPrecision(18, RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#roundToPrecision(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToPrecision(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToPrecision(int, RoundingMode); given MAX_VALUE; when one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToPrecision(int, RoundingMode)"})
  void testRoundToPrecision_givenMax_value_whenOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Decimal.MAX_VALUE.roundToPrecision(1, RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#roundToPrecision(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When zero.
   *   <li>Then return {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToPrecision(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToPrecision(int, RoundingMode); given MAX_VALUE; when zero; then return MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToPrecision(int, RoundingMode)"})
  void testRoundToPrecision_givenMax_value_whenZero_thenReturnMax_value() {
    // Arrange, Act and Assert
    assertEquals(Decimal.MAX_VALUE, Decimal.MAX_VALUE.roundToPrecision(0, RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#roundToPrecision(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When one.
   *   <li>Then return ofScaled one and one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToPrecision(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToPrecision(int, RoundingMode); given ofScaled one and one; when one; then return ofScaled one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToPrecision(int, RoundingMode)"})
  void testRoundToPrecision_givenOfScaledOneAndOne_whenOne_thenReturnOfScaledOneAndOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act
    Decimal actualRoundToPrecisionResult = ofScaledResult.roundToPrecision(1, RoundingMode.UP);

    // Assert
    assertEquals(ofScaledResult, actualRoundToPrecisionResult);
  }

  /**
   * Test {@link Decimal#roundToPrecision(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>When one.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#roundToPrecision(int, RoundingMode)}
   */
  @Test
  @DisplayName("Test roundToPrecision(int, RoundingMode); given ZERO; when one; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.roundToPrecision(int, RoundingMode)"})
  void testRoundToPrecision_givenZero_whenOne_thenReturnZero() {
    // Arrange, Act and Assert
    assertSame(Decimal.ZERO, Decimal.ZERO.roundToPrecision(1, RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#isZero()}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isZero()}
   */
  @Test
  @DisplayName("Test isZero(); given MAX_VALUE; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isZero()"})
  void testIsZero_givenMax_value_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Decimal.MAX_VALUE.isZero());
  }

  /**
   * Test {@link Decimal#isZero()}.
   *
   * <ul>
   *   <li>Given {@link Decimal#ZERO}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isZero()}
   */
  @Test
  @DisplayName("Test isZero(); given ZERO; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isZero()"})
  void testIsZero_givenZero_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Decimal.ZERO.isZero());
  }

  /**
   * Test {@link Decimal#abs()}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#abs()}
   */
  @Test
  @DisplayName("Test abs(); given MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.abs()"})
  void testAbs_givenMax_value() {
    // Arrange, Act and Assert
    assertEquals(Decimal.MAX_VALUE, Decimal.MAX_VALUE.abs());
  }

  /**
   * Test {@link Decimal#abs()}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#abs()}
   */
  @Test
  @DisplayName("Test abs(); given MIN_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.abs()"})
  void testAbs_givenMin_value() {
    // Arrange, Act and Assert
    assertEquals(Decimal.MAX_VALUE, Decimal.MIN_VALUE.abs());
  }

  /**
   * Test {@link Decimal#negated()}.
   *
   * <p>Method under test: {@link Decimal#negated()}
   */
  @Test
  @DisplayName("Test negated()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.negated()"})
  void testNegated() {
    // Arrange, Act and Assert
    assertEquals(Decimal.MIN_VALUE, Decimal.MAX_VALUE.negated());
  }

  /**
   * Test {@link Decimal#signum()}.
   *
   * <p>Method under test: {@link Decimal#signum()}
   */
  @Test
  @DisplayName("Test signum()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Decimal.signum()"})
  void testSignum() {
    // Arrange, Act and Assert
    assertEquals(1, Decimal.MAX_VALUE.signum());
  }

  /**
   * Test {@link Decimal#mapAsDouble(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@code 0.5}.
   *   <li>Then return abs abs scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsDouble(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAsDouble(DoubleUnaryOperator); given '0.5'; then return abs abs scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsDouble(DoubleUnaryOperator)"})
  void testMapAsDouble_given05_thenReturnAbsAbsScaleIsOne() {
    // Arrange
    DoubleUnaryOperator fn = mock(DoubleUnaryOperator.class);
    when(fn.applyAsDouble(anyDouble())).thenReturn(0.5d);

    // Act
    Decimal actualMapAsDoubleResult = Decimal.MAX_VALUE.mapAsDouble(fn);

    // Assert
    verify(fn).applyAsDouble(1.0E18d);
    Decimal absResult = actualMapAsDoubleResult.abs();
    assertEquals(1, absResult.abs().scale());
    assertEquals(1, absResult.scale());
    Decimal negatedResult = actualMapAsDoubleResult.negated();
    assertEquals(1, negatedResult.abs().scale());
    assertEquals(1, actualMapAsDoubleResult.scale());
    assertEquals(1, absResult.negated().scale());
    assertEquals(1, negatedResult.scale());
    assertEquals(1, negatedResult.negated().scale());
  }

  /**
   * Test {@link Decimal#mapAsDouble(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@code -0.5}.
   *   <li>Then return signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsDouble(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAsDouble(DoubleUnaryOperator); given '-0.5'; then return signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsDouble(DoubleUnaryOperator)"})
  void testMapAsDouble_given05_thenReturnSignumIsMinusOne() {
    // Arrange
    DoubleUnaryOperator fn = mock(DoubleUnaryOperator.class);
    when(fn.applyAsDouble(anyDouble())).thenReturn(-0.5d);

    // Act
    Decimal actualMapAsDoubleResult = Decimal.MAX_VALUE.mapAsDouble(fn);

    // Assert
    verify(fn).applyAsDouble(1.0E18d);
    assertEquals(-1, actualMapAsDoubleResult.signum());
    Decimal absResult = actualMapAsDoubleResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualMapAsDoubleResult.negated());
    assertEquals(actualMapAsDoubleResult, absResult.negated());
  }

  /**
   * Test {@link Decimal#mapAsDouble(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsDouble(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapAsDouble(DoubleUnaryOperator); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsDouble(DoubleUnaryOperator)"})
  void testMapAsDouble_givenIllegalArgumentException() {
    // Arrange
    DoubleUnaryOperator fn = mock(DoubleUnaryOperator.class);
    when(fn.applyAsDouble(anyDouble())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.mapAsDouble(fn));
    verify(fn).applyAsDouble(1.0E18d);
  }

  /**
   * Test {@link Decimal#mapAsDouble(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link Double#NaN}.
   *   <li>When {@link DoubleUnaryOperator} {@link DoubleUnaryOperator#applyAsDouble(double)} return
   *       {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsDouble(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAsDouble(DoubleUnaryOperator); given NaN; when DoubleUnaryOperator applyAsDouble(double) return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsDouble(DoubleUnaryOperator)"})
  void testMapAsDouble_givenNaN_whenDoubleUnaryOperatorApplyAsDoubleReturnNaN() {
    // Arrange
    DoubleUnaryOperator fn = mock(DoubleUnaryOperator.class);
    when(fn.applyAsDouble(anyDouble())).thenReturn(Double.NaN);

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.mapAsDouble(fn));
    verify(fn).applyAsDouble(1.0E18d);
  }

  /**
   * Test {@link Decimal#mapAsDouble(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsDouble(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAsDouble(DoubleUnaryOperator); given ofScaled '-999999999999999999' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsDouble(DoubleUnaryOperator)"})
  void testMapAsDouble_givenOfScaled999999999999999999AndOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 1);

    DoubleUnaryOperator fn = mock(DoubleUnaryOperator.class);
    when(fn.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    Decimal actualMapAsDoubleResult = ofScaledResult.mapAsDouble(fn);

    // Assert
    verify(fn).applyAsDouble(-1.0E17d);
    Decimal negatedResult = actualMapAsDoubleResult.negated();
    assertEquals(actualMapAsDoubleResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMapAsDoubleResult.abs();
    assertEquals(actualMapAsDoubleResult, actualAbsResult);
    assertEquals(actualMapAsDoubleResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#mapAsDouble(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given ofScaled {@code 999999999999999999} and one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsDouble(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapAsDouble(DoubleUnaryOperator); given ofScaled '999999999999999999' and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsDouble(DoubleUnaryOperator)"})
  void testMapAsDouble_givenOfScaled999999999999999999AndOne2() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(999999999999999999L, 1);

    DoubleUnaryOperator fn = mock(DoubleUnaryOperator.class);
    when(fn.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    Decimal actualMapAsDoubleResult = ofScaledResult.mapAsDouble(fn);

    // Assert
    verify(fn).applyAsDouble(1.0E17d);
    Decimal negatedResult = actualMapAsDoubleResult.negated();
    assertEquals(actualMapAsDoubleResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMapAsDoubleResult.abs();
    assertEquals(actualMapAsDoubleResult, actualAbsResult);
    assertEquals(actualMapAsDoubleResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#mapAsDouble(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsDouble(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName("Test mapAsDouble(DoubleUnaryOperator); given ofScaled one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsDouble(DoubleUnaryOperator)"})
  void testMapAsDouble_givenOfScaledOneAndOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    DoubleUnaryOperator fn = mock(DoubleUnaryOperator.class);
    when(fn.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    Decimal actualMapAsDoubleResult = ofScaledResult.mapAsDouble(fn);

    // Assert
    verify(fn).applyAsDouble(0.1d);
    Decimal negatedResult = actualMapAsDoubleResult.negated();
    assertEquals(actualMapAsDoubleResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMapAsDoubleResult.abs();
    assertEquals(actualMapAsDoubleResult, actualAbsResult);
    assertEquals(actualMapAsDoubleResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#mapAsDouble(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link DoubleUnaryOperator} {@link DoubleUnaryOperator#applyAsDouble(double)} return
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsDouble(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAsDouble(DoubleUnaryOperator); given ten; when DoubleUnaryOperator applyAsDouble(double) return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsDouble(DoubleUnaryOperator)"})
  void testMapAsDouble_givenTen_whenDoubleUnaryOperatorApplyAsDoubleReturnTen() {
    // Arrange
    DoubleUnaryOperator fn = mock(DoubleUnaryOperator.class);
    when(fn.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    Decimal actualMapAsDoubleResult = Decimal.MAX_VALUE.mapAsDouble(fn);

    // Assert
    verify(fn).applyAsDouble(1.0E18d);
    Decimal negatedResult = actualMapAsDoubleResult.negated();
    assertEquals(actualMapAsDoubleResult, negatedResult.abs().abs());
    Decimal actualAbsResult = actualMapAsDoubleResult.abs();
    assertEquals(actualMapAsDoubleResult, actualAbsResult);
    assertEquals(actualMapAsDoubleResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Decimal#mapAsBigDecimal(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link BigDecimal#BigDecimal(String)} with {@code 2.3}.
   *   <li>Then return abs abs abs scale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsBigDecimal(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAsBigDecimal(UnaryOperator); given BigDecimal(String) with '2.3'; then return abs abs abs scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsBigDecimal(UnaryOperator)"})
  void testMapAsBigDecimal_givenBigDecimalWith23_thenReturnAbsAbsAbsScaleIsOne() {
    // Arrange
    UnaryOperator<BigDecimal> fn = mock(UnaryOperator.class);
    when(fn.apply(Mockito.<BigDecimal>any())).thenReturn(new BigDecimal("2.3"));

    // Act
    Decimal actualMapAsBigDecimalResult = Decimal.MAX_VALUE.mapAsBigDecimal(fn);

    // Assert
    verify(fn).apply(isA(BigDecimal.class));
    Decimal absResult = actualMapAsBigDecimalResult.abs();
    Decimal absResult2 = absResult.abs();
    assertEquals(1, absResult2.abs().scale());
    assertEquals(1, absResult2.scale());
    Decimal negatedResult = actualMapAsBigDecimalResult.negated();
    Decimal absResult3 = negatedResult.abs();
    assertEquals(1, absResult3.abs().scale());
    assertEquals(1, absResult.scale());
    Decimal negatedResult2 = absResult.negated();
    assertEquals(1, negatedResult2.abs().scale());
    assertEquals(1, absResult3.scale());
    Decimal negatedResult3 = negatedResult.negated();
    assertEquals(1, negatedResult3.abs().scale());
    assertEquals(1, actualMapAsBigDecimalResult.scale());
    assertEquals(1, absResult2.negated().scale());
    assertEquals(1, negatedResult2.scale());
    assertEquals(1, absResult3.negated().scale());
    assertEquals(1, negatedResult.scale());
    assertEquals(1, negatedResult2.negated().scale());
    assertEquals(1, negatedResult3.scale());
    assertEquals(1, negatedResult3.negated().scale());
  }

  /**
   * Test {@link Decimal#mapAsBigDecimal(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link BigDecimal#BigDecimal(String)} with {@code 42}.
   *   <li>Then return negated signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsBigDecimal(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAsBigDecimal(UnaryOperator); given BigDecimal(String) with '42'; then return negated signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsBigDecimal(UnaryOperator)"})
  void testMapAsBigDecimal_givenBigDecimalWith42_thenReturnNegatedSignumIsMinusOne() {
    // Arrange
    UnaryOperator<BigDecimal> fn = mock(UnaryOperator.class);
    when(fn.apply(Mockito.<BigDecimal>any())).thenReturn(new BigDecimal("42"));

    // Act
    Decimal actualMapAsBigDecimalResult = Decimal.MAX_VALUE.mapAsBigDecimal(fn);

    // Assert
    verify(fn).apply(isA(BigDecimal.class));
    Decimal negatedResult = actualMapAsBigDecimalResult.negated();
    assertEquals(-1, negatedResult.signum());
    Decimal absResult = actualMapAsBigDecimalResult.abs();
    assertEquals(0, absResult.scale());
    assertEquals(0, actualMapAsBigDecimalResult.scale());
    assertEquals(0, negatedResult.scale());
    assertEquals(1, absResult.signum());
    assertEquals(1, actualMapAsBigDecimalResult.signum());
    assertFalse(absResult.isZero());
    assertFalse(actualMapAsBigDecimalResult.isZero());
    assertFalse(negatedResult.isZero());
  }

  /**
   * Test {@link Decimal#mapAsBigDecimal(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsBigDecimal(UnaryOperator)}
   */
  @Test
  @DisplayName("Test mapAsBigDecimal(UnaryOperator); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsBigDecimal(UnaryOperator)"})
  void testMapAsBigDecimal_givenIllegalArgumentException() {
    // Arrange
    UnaryOperator<BigDecimal> fn = mock(UnaryOperator.class);
    when(fn.apply(Mockito.<BigDecimal>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.mapAsBigDecimal(fn));
    verify(fn).apply(isA(BigDecimal.class));
  }

  /**
   * Test {@link Decimal#mapAsBigDecimal(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given valueOf {@link Long#MAX_VALUE}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsBigDecimal(UnaryOperator)}
   */
  @Test
  @DisplayName("Test mapAsBigDecimal(UnaryOperator); given valueOf MAX_VALUE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsBigDecimal(UnaryOperator)"})
  void testMapAsBigDecimal_givenValueOfMax_value() {
    // Arrange
    UnaryOperator<BigDecimal> fn = mock(UnaryOperator.class);
    when(fn.apply(Mockito.<BigDecimal>any())).thenReturn(BigDecimal.valueOf(Long.MAX_VALUE));

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.mapAsBigDecimal(fn));
    verify(fn).apply(isA(BigDecimal.class));
  }

  /**
   * Test {@link Decimal#mapAsBigDecimal(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given valueOf zero.
   *   <li>Then return {@link Decimal#ZERO}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#mapAsBigDecimal(UnaryOperator)}
   */
  @Test
  @DisplayName("Test mapAsBigDecimal(UnaryOperator); given valueOf zero; then return ZERO")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Decimal.mapAsBigDecimal(UnaryOperator)"})
  void testMapAsBigDecimal_givenValueOfZero_thenReturnZero() {
    // Arrange
    UnaryOperator<BigDecimal> fn = mock(UnaryOperator.class);
    when(fn.apply(Mockito.<BigDecimal>any())).thenReturn(BigDecimal.valueOf(0L));

    // Act
    Decimal actualMapAsBigDecimalResult = Decimal.MAX_VALUE.mapAsBigDecimal(fn);

    // Assert
    verify(fn).apply(isA(BigDecimal.class));
    assertSame(Decimal.ZERO, actualMapAsBigDecimalResult);
  }

  /**
   * Test {@link Decimal#doubleValue()}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code 1.0E18}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#doubleValue()}
   */
  @Test
  @DisplayName("Test doubleValue(); given MAX_VALUE; then return '1.0E18'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Decimal.doubleValue()"})
  void testDoubleValue_givenMax_value_thenReturn10e18() {
    // Arrange, Act and Assert
    assertEquals(1.0E18d, Decimal.MAX_VALUE.doubleValue());
  }

  /**
   * Test {@link Decimal#doubleValue()}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and one.
   *   <li>Then return {@code -1.0E17}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#doubleValue()}
   */
  @Test
  @DisplayName(
      "Test doubleValue(); given ofScaled '-999999999999999999' and one; then return '-1.0E17'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Decimal.doubleValue()"})
  void testDoubleValue_givenOfScaled999999999999999999AndOne_thenReturn10e17() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 1);

    // Act and Assert
    assertEquals(-1.0E17d, ofScaledResult.doubleValue());
  }

  /**
   * Test {@link Decimal#doubleValue()}.
   *
   * <ul>
   *   <li>Given ofScaled {@code 999999999999999999} and one.
   *   <li>Then return {@code 1.0E17}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#doubleValue()}
   */
  @Test
  @DisplayName(
      "Test doubleValue(); given ofScaled '999999999999999999' and one; then return '1.0E17'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Decimal.doubleValue()"})
  void testDoubleValue_givenOfScaled999999999999999999AndOne_thenReturn10e172() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(999999999999999999L, 1);

    // Act and Assert
    assertEquals(1.0E17d, ofScaledResult.doubleValue());
  }

  /**
   * Test {@link Decimal#doubleValue()}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>Then return {@code 0.1}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#doubleValue()}
   */
  @Test
  @DisplayName("Test doubleValue(); given ofScaled one and one; then return '0.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Decimal.doubleValue()"})
  void testDoubleValue_givenOfScaledOneAndOne_thenReturn01() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertEquals(0.1d, ofScaledResult.doubleValue());
  }

  /**
   * Test {@link Decimal#longValue()}.
   *
   * <p>Method under test: {@link Decimal#longValue()}
   */
  @Test
  @DisplayName("Test longValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long Decimal.longValue()"})
  void testLongValue() {
    // Arrange, Act and Assert
    assertEquals(999999999999999999L, Decimal.MAX_VALUE.longValue());
  }

  /**
   * Test {@link Decimal#toBigDecimal()}.
   *
   * <p>Method under test: {@link Decimal#toBigDecimal()}
   */
  @Test
  @DisplayName("Test toBigDecimal()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal Decimal.toBigDecimal()"})
  void testToBigDecimal() {
    // Arrange and Act
    BigDecimal actualToBigDecimalResult = Decimal.MAX_VALUE.toBigDecimal();

    // Assert
    assertEquals(new BigDecimal("999999999999999999"), actualToBigDecimalResult);
  }

  /**
   * Test {@link Decimal#toFixedScale(int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return fixedScale is one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#toFixedScale(int)}
   */
  @Test
  @DisplayName("Test toFixedScale(int); when one; then return fixedScale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedScaleDecimal Decimal.toFixedScale(int)"})
  void testToFixedScale_whenOne_thenReturnFixedScaleIsOne() {
    // Arrange and Act
    FixedScaleDecimal actualToFixedScaleResult = Decimal.MAX_VALUE.toFixedScale(1);

    // Assert
    assertEquals(1, actualToFixedScaleResult.fixedScale());
    assertSame(Decimal.MAX_VALUE, actualToFixedScaleResult.decimal());
  }

  /**
   * Test {@link Decimal#formatAtLeast(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#formatAtLeast(int)}
   */
  @Test
  @DisplayName(
      "Test formatAtLeast(int); given MAX_VALUE; when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.formatAtLeast(int)"})
  void testFormatAtLeast_givenMax_value_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.formatAtLeast(-1));
  }

  /**
   * Test {@link Decimal#formatAtLeast(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When nineteen.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#formatAtLeast(int)}
   */
  @Test
  @DisplayName(
      "Test formatAtLeast(int); given MAX_VALUE; when nineteen; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.formatAtLeast(int)"})
  void testFormatAtLeast_givenMax_value_whenNineteen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Decimal.MAX_VALUE.formatAtLeast(19));
  }

  /**
   * Test {@link Decimal#formatAtLeast(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When one.
   *   <li>Then return {@code 999999999999999999.0}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#formatAtLeast(int)}
   */
  @Test
  @DisplayName(
      "Test formatAtLeast(int); given MAX_VALUE; when one; then return '999999999999999999.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.formatAtLeast(int)"})
  void testFormatAtLeast_givenMax_value_whenOne_thenReturn9999999999999999990() {
    // Arrange, Act and Assert
    assertEquals("999999999999999999.0", Decimal.MAX_VALUE.formatAtLeast(1));
  }

  /**
   * Test {@link Decimal#formatAtLeast(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When zero.
   *   <li>Then return {@code 999999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#formatAtLeast(int)}
   */
  @Test
  @DisplayName(
      "Test formatAtLeast(int); given MAX_VALUE; when zero; then return '999999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.formatAtLeast(int)"})
  void testFormatAtLeast_givenMax_value_whenZero_thenReturn999999999999999999() {
    // Arrange, Act and Assert
    assertEquals("999999999999999999", Decimal.MAX_VALUE.formatAtLeast(0));
  }

  /**
   * Test {@link Decimal#formatAtLeast(int)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When one.
   *   <li>Then return {@code -999999999999999999.0}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#formatAtLeast(int)}
   */
  @Test
  @DisplayName(
      "Test formatAtLeast(int); given MIN_VALUE; when one; then return '-999999999999999999.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.formatAtLeast(int)"})
  void testFormatAtLeast_givenMin_value_whenOne_thenReturn9999999999999999990() {
    // Arrange, Act and Assert
    assertEquals("-999999999999999999.0", Decimal.MIN_VALUE.formatAtLeast(1));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@code DOWN}.
   *   <li>Then return {@code 999999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given MAX_VALUE; when 'DOWN'; then return '999999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenMax_value_whenDown_thenReturn999999999999999999() {
    // Arrange, Act and Assert
    assertEquals("999999999999999999", Decimal.MAX_VALUE.format(0, RoundingMode.DOWN));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When minus one.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given MAX_VALUE; when minus one; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenMax_value_whenMinusOne_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.MAX_VALUE.format(-1, RoundingMode.DOWN));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When nineteen.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given MAX_VALUE; when nineteen; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenMax_value_whenNineteen_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> Decimal.MAX_VALUE.format(19, RoundingMode.DOWN));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When one.
   *   <li>Then return {@code 999999999999999999.0}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given MAX_VALUE; when one; then return '999999999999999999.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenMax_value_whenOne_thenReturn9999999999999999990() {
    // Arrange, Act and Assert
    assertEquals("999999999999999999.0", Decimal.MAX_VALUE.format(1, RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When one.
   *   <li>Then return {@code -999999999999999999.0}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given MIN_VALUE; when one; then return '-999999999999999999.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenMin_value_whenOne_thenReturn9999999999999999990() {
    // Arrange, Act and Assert
    assertEquals("-999999999999999999.0", Decimal.MIN_VALUE.format(1, RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled {@code -999999999999999999} and eighteen.
   *   <li>When one.
   *   <li>Then return {@code -1.0}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled '-999999999999999999' and eighteen; when one; then return '-1.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaled999999999999999999AndEighteen_whenOne_thenReturn10() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-999999999999999999L, 18);

    // Act and Assert
    assertEquals("-1.0", ofScaledResult.format(1, RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled eighteen and one.
   *   <li>When {@code DOWN}.
   *   <li>Then return {@code 1}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled eighteen and one; when 'DOWN'; then return '1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledEighteenAndOne_whenDown_thenReturn1() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(18L, 1);

    // Act and Assert
    assertEquals("1", ofScaledResult.format(0, RoundingMode.DOWN));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled eighteen and one.
   *   <li>When {@code HALF_UP}.
   *   <li>Then return {@code 2}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled eighteen and one; when 'HALF_UP'; then return '2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledEighteenAndOne_whenHalfUp_thenReturn2() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(18L, 1);

    // Act and Assert
    assertEquals("2", ofScaledResult.format(0, RoundingMode.HALF_UP));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled minus eighteen and one.
   *   <li>When {@code CEILING}.
   *   <li>Then return {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled minus eighteen and one; when 'CEILING'; then return '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledMinusEighteenAndOne_whenCeiling_thenReturn1() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-18L, 1);

    // Act and Assert
    assertEquals("-1", ofScaledResult.format(0, RoundingMode.CEILING));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled minus eighteen and one.
   *   <li>When {@code FLOOR}.
   *   <li>Then return {@code -2}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled minus eighteen and one; when 'FLOOR'; then return '-2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledMinusEighteenAndOne_whenFloor_thenReturn2() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-18L, 1);

    // Act and Assert
    assertEquals("-2", ofScaledResult.format(0, RoundingMode.FLOOR));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled minus eighteen and one.
   *   <li>When {@code HALF_UP}.
   *   <li>Then return {@code -2}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled minus eighteen and one; when 'HALF_UP'; then return '-2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledMinusEighteenAndOne_whenHalfUp_thenReturn2() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(-18L, 1);

    // Act and Assert
    assertEquals("-2", ofScaledResult.format(0, RoundingMode.HALF_UP));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled one and eighteen.
   *   <li>When {@code HALF_UP}.
   *   <li>Then return {@code 0}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled one and eighteen; when 'HALF_UP'; then return '0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledOneAndEighteen_whenHalfUp_thenReturn0() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 18);

    // Act and Assert
    assertEquals("0", ofScaledResult.format(0, RoundingMode.HALF_UP));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled one and eighteen.
   *   <li>When one.
   *   <li>Then return {@code 0.1}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled one and eighteen; when one; then return '0.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledOneAndEighteen_whenOne_thenReturn01() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 18);

    // Act and Assert
    assertEquals("0.1", ofScaledResult.format(1, RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@code CEILING}.
   *   <li>Then return {@code 1}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled one and one; when 'CEILING'; then return '1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledOneAndOne_whenCeiling_thenReturn1() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertEquals("1", ofScaledResult.format(0, RoundingMode.CEILING));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@code DOWN}.
   *   <li>Then return {@code 0}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled one and one; when 'DOWN'; then return '0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledOneAndOne_whenDown_thenReturn0() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertEquals("0", ofScaledResult.format(0, RoundingMode.DOWN));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@code FLOOR}.
   *   <li>Then return {@code 0}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled one and one; when 'FLOOR'; then return '0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledOneAndOne_whenFloor_thenReturn0() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertEquals("0", ofScaledResult.format(0, RoundingMode.FLOOR));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@code HALF_DOWN}.
   *   <li>Then return {@code 0}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled one and one; when 'HALF_DOWN'; then return '0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledOneAndOne_whenHalfDown_thenReturn0() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertEquals("0", ofScaledResult.format(0, RoundingMode.HALF_DOWN));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@code HALF_UP}.
   *   <li>Then return {@code 0}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled one and one; when 'HALF_UP'; then return '0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledOneAndOne_whenHalfUp_thenReturn0() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertEquals("0", ofScaledResult.format(0, RoundingMode.HALF_UP));
  }

  /**
   * Test {@link Decimal#format(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@code UP}.
   *   <li>Then return {@code 1}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#format(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test format(int, RoundingMode); given ofScaled one and one; when 'UP'; then return '1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Decimal.format(int, RoundingMode)"})
  void testFormat_givenOfScaledOneAndOne_whenUp_thenReturn1() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertEquals("1", ofScaledResult.format(0, RoundingMode.UP));
  }

  /**
   * Test {@link Decimal#isGreaterThan(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isGreaterThan(Decimal)}
   */
  @Test
  @DisplayName("Test isGreaterThan(Decimal); given MAX_VALUE; when MAX_VALUE; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isGreaterThan(Decimal)"})
  void testIsGreaterThan_givenMax_value_whenMax_value_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Decimal.MAX_VALUE.isGreaterThan(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#isGreaterThan(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#MIN_VALUE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isGreaterThan(Decimal)}
   */
  @Test
  @DisplayName("Test isGreaterThan(Decimal); given MAX_VALUE; when MIN_VALUE; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isGreaterThan(Decimal)"})
  void testIsGreaterThan_givenMax_value_whenMin_value_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Decimal.MAX_VALUE.isGreaterThan(Decimal.MIN_VALUE));
  }

  /**
   * Test {@link Decimal#isGreaterThan(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When ofScaled one and one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isGreaterThan(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isGreaterThan(Decimal); given MAX_VALUE; when ofScaled one and one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isGreaterThan(Decimal)"})
  void testIsGreaterThan_givenMax_value_whenOfScaledOneAndOne_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Decimal.MAX_VALUE.isGreaterThan(Decimal.ofScaled(1L, 1)));
  }

  /**
   * Test {@link Decimal#isGreaterThan(Decimal)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isGreaterThan(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isGreaterThan(Decimal); given ofScaled one and one; when MAX_VALUE; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isGreaterThan(Decimal)"})
  void testIsGreaterThan_givenOfScaledOneAndOne_whenMax_value_thenReturnFalse() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertFalse(ofScaledResult.isGreaterThan(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#isGreaterThan(Decimal)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Decimal#ZERO}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isGreaterThan(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isGreaterThan(Decimal); given ofScaled one and one; when ZERO; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isGreaterThan(Decimal)"})
  void testIsGreaterThan_givenOfScaledOneAndOne_whenZero_thenReturnTrue() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertTrue(ofScaledResult.isGreaterThan(Decimal.ZERO));
  }

  /**
   * Test {@link Decimal#isGreaterThanEqualTo(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isGreaterThanEqualTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isGreaterThanEqualTo(Decimal); given MAX_VALUE; when MAX_VALUE; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isGreaterThanEqualTo(Decimal)"})
  void testIsGreaterThanEqualTo_givenMax_value_whenMax_value_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Decimal.MAX_VALUE.isGreaterThanEqualTo(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#isGreaterThanEqualTo(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When ofScaled one and one.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isGreaterThanEqualTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isGreaterThanEqualTo(Decimal); given MAX_VALUE; when ofScaled one and one; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isGreaterThanEqualTo(Decimal)"})
  void testIsGreaterThanEqualTo_givenMax_value_whenOfScaledOneAndOne_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Decimal.MAX_VALUE.isGreaterThanEqualTo(Decimal.ofScaled(1L, 1)));
  }

  /**
   * Test {@link Decimal#isGreaterThanEqualTo(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isGreaterThanEqualTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isGreaterThanEqualTo(Decimal); given MIN_VALUE; when MAX_VALUE; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isGreaterThanEqualTo(Decimal)"})
  void testIsGreaterThanEqualTo_givenMin_value_whenMax_value_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Decimal.MIN_VALUE.isGreaterThanEqualTo(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#isGreaterThanEqualTo(Decimal)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isGreaterThanEqualTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isGreaterThanEqualTo(Decimal); given ofScaled one and one; when MAX_VALUE; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isGreaterThanEqualTo(Decimal)"})
  void testIsGreaterThanEqualTo_givenOfScaledOneAndOne_whenMax_value_thenReturnFalse() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertFalse(ofScaledResult.isGreaterThanEqualTo(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#isGreaterThanEqualTo(Decimal)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Decimal#ZERO}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isGreaterThanEqualTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isGreaterThanEqualTo(Decimal); given ofScaled one and one; when ZERO; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isGreaterThanEqualTo(Decimal)"})
  void testIsGreaterThanEqualTo_givenOfScaledOneAndOne_whenZero_thenReturnTrue() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertTrue(ofScaledResult.isGreaterThanEqualTo(Decimal.ZERO));
  }

  /**
   * Test {@link Decimal#isLessThan(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isLessThan(Decimal)}
   */
  @Test
  @DisplayName("Test isLessThan(Decimal); given MAX_VALUE; when MAX_VALUE; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isLessThan(Decimal)"})
  void testIsLessThan_givenMax_value_whenMax_value_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Decimal.MAX_VALUE.isLessThan(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#isLessThan(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When ofScaled one and one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isLessThan(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isLessThan(Decimal); given MAX_VALUE; when ofScaled one and one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isLessThan(Decimal)"})
  void testIsLessThan_givenMax_value_whenOfScaledOneAndOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Decimal.MAX_VALUE.isLessThan(Decimal.ofScaled(1L, 1)));
  }

  /**
   * Test {@link Decimal#isLessThan(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MIN_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isLessThan(Decimal)}
   */
  @Test
  @DisplayName("Test isLessThan(Decimal); given MIN_VALUE; when MAX_VALUE; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isLessThan(Decimal)"})
  void testIsLessThan_givenMin_value_whenMax_value_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Decimal.MIN_VALUE.isLessThan(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#isLessThan(Decimal)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isLessThan(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isLessThan(Decimal); given ofScaled one and one; when MAX_VALUE; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isLessThan(Decimal)"})
  void testIsLessThan_givenOfScaledOneAndOne_whenMax_value_thenReturnTrue() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertTrue(ofScaledResult.isLessThan(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#isLessThan(Decimal)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Decimal#ZERO}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isLessThan(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isLessThan(Decimal); given ofScaled one and one; when ZERO; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isLessThan(Decimal)"})
  void testIsLessThan_givenOfScaledOneAndOne_whenZero_thenReturnFalse() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertFalse(ofScaledResult.isLessThan(Decimal.ZERO));
  }

  /**
   * Test {@link Decimal#isLessThanEqualTo(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isLessThanEqualTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isLessThanEqualTo(Decimal); given MAX_VALUE; when MAX_VALUE; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isLessThanEqualTo(Decimal)"})
  void testIsLessThanEqualTo_givenMax_value_whenMax_value_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Decimal.MAX_VALUE.isLessThanEqualTo(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#isLessThanEqualTo(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#MIN_VALUE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isLessThanEqualTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isLessThanEqualTo(Decimal); given MAX_VALUE; when MIN_VALUE; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isLessThanEqualTo(Decimal)"})
  void testIsLessThanEqualTo_givenMax_value_whenMin_value_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Decimal.MAX_VALUE.isLessThanEqualTo(Decimal.MIN_VALUE));
  }

  /**
   * Test {@link Decimal#isLessThanEqualTo(Decimal)}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When ofScaled one and one.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isLessThanEqualTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isLessThanEqualTo(Decimal); given MAX_VALUE; when ofScaled one and one; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isLessThanEqualTo(Decimal)"})
  void testIsLessThanEqualTo_givenMax_value_whenOfScaledOneAndOne_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Decimal.MAX_VALUE.isLessThanEqualTo(Decimal.ofScaled(1L, 1)));
  }

  /**
   * Test {@link Decimal#isLessThanEqualTo(Decimal)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isLessThanEqualTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isLessThanEqualTo(Decimal); given ofScaled one and one; when MAX_VALUE; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isLessThanEqualTo(Decimal)"})
  void testIsLessThanEqualTo_givenOfScaledOneAndOne_whenMax_value_thenReturnTrue() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertTrue(ofScaledResult.isLessThanEqualTo(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#isLessThanEqualTo(Decimal)}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Decimal#ZERO}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#isLessThanEqualTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test isLessThanEqualTo(Decimal); given ofScaled one and one; when ZERO; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.isLessThanEqualTo(Decimal)"})
  void testIsLessThanEqualTo_givenOfScaledOneAndOne_whenZero_thenReturnFalse() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertFalse(ofScaledResult.isLessThanEqualTo(Decimal.ZERO));
  }

  /**
   * Test {@link Decimal#compareTo(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#compareTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Decimal) with 'Decimal'; given MAX_VALUE; when MAX_VALUE; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Decimal.compareTo(Decimal)"})
  void testCompareToWithDecimal_givenMax_value_whenMax_value_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, Decimal.MAX_VALUE.compareTo(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#compareTo(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Decimal#MAX_VALUE}.
   *   <li>When ofScaled one and one.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#compareTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Decimal) with 'Decimal'; given MAX_VALUE; when ofScaled one and one; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Decimal.compareTo(Decimal)"})
  void testCompareToWithDecimal_givenMax_value_whenOfScaledOneAndOne_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, Decimal.MAX_VALUE.compareTo(Decimal.ofScaled(1L, 1)));
  }

  /**
   * Test {@link Decimal#compareTo(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Decimal#MAX_VALUE}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#compareTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Decimal) with 'Decimal'; given ofScaled one and one; when MAX_VALUE; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Decimal.compareTo(Decimal)"})
  void testCompareToWithDecimal_givenOfScaledOneAndOne_whenMax_value_thenReturnMinusOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertEquals(-1, ofScaledResult.compareTo(Decimal.MAX_VALUE));
  }

  /**
   * Test {@link Decimal#compareTo(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given ofScaled one and one.
   *   <li>When {@link Decimal#ZERO}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#compareTo(Decimal)}
   */
  @Test
  @DisplayName(
      "Test compareTo(Decimal) with 'Decimal'; given ofScaled one and one; when ZERO; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Decimal.compareTo(Decimal)"})
  void testCompareToWithDecimal_givenOfScaledOneAndOne_whenZero_thenReturnOne() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertEquals(1, ofScaledResult.compareTo(Decimal.ZERO));
  }

  /**
   * Test {@link Decimal#equals(Object)}, and {@link Decimal#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Decimal#equals(Object)}
   *   <li>{@link Decimal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.equals(Object)", "int Decimal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Decimal decimal = Decimal.MAX_VALUE;
    Decimal decimal2 = Decimal.MAX_VALUE;

    // Act and Assert
    assertEquals(decimal, decimal2);
    assertEquals(decimal.hashCode(), decimal2.hashCode());
  }

  /**
   * Test {@link Decimal#equals(Object)}, and {@link Decimal#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Decimal#equals(Object)}
   *   <li>{@link Decimal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.equals(Object)", "int Decimal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    Decimal ofResult = Decimal.of(42L);
    Decimal ofResult2 = Decimal.of(42L);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link Decimal#equals(Object)}, and {@link Decimal#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Decimal#equals(Object)}
   *   <li>{@link Decimal#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.equals(Object)", "int Decimal.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Decimal decimal = Decimal.MAX_VALUE;

    // Act and Assert
    assertEquals(decimal, decimal);
    int expectedHashCodeResult = decimal.hashCode();
    assertEquals(expectedHashCodeResult, decimal.hashCode());
  }

  /**
   * Test {@link Decimal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.equals(Object)", "int Decimal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Decimal.MIN_VALUE, Decimal.MAX_VALUE);
  }

  /**
   * Test {@link Decimal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.equals(Object)", "int Decimal.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Decimal ofScaledResult = Decimal.ofScaled(1L, 1);

    // Act and Assert
    assertNotEquals(ofScaledResult, Decimal.of(1L));
  }

  /**
   * Test {@link Decimal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.equals(Object)", "int Decimal.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Decimal.MAX_VALUE, null);
  }

  /**
   * Test {@link Decimal#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Decimal#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Decimal.equals(Object)", "int Decimal.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Decimal.MAX_VALUE, "Different type to Decimal");
  }
}
