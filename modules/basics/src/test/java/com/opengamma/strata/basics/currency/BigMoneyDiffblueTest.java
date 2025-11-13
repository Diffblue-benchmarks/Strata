package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.Decimal;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class BigMoneyDiffblueTest {
  /**
   * Test {@link BigMoney#zero(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return Value scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#zero(Currency)}
   */
  @Test
  @DisplayName("Test zero(Currency); when AED; then return Value scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.zero(Currency)"})
  void testZero_whenAed_thenReturnValueScaleIsZero() {
    // Arrange and Act
    BigMoney actualZeroResult = BigMoney.zero(Currency.AED);

    // Assert
    Decimal value = actualZeroResult.getValue();
    assertEquals(0, value.scale());
    assertEquals(0, value.signum());
    assertTrue(actualZeroResult.isZero());
    assertTrue(value.isZero());
    assertEquals(new BigDecimal("0.00"), actualZeroResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    Decimal actualNegatedResult = value.negated();
    assertEquals(value, actualNegatedResult);
    BigMoney actualNegatedResult2 = actualZeroResult.negated();
    assertSame(actualZeroResult, actualNegatedResult2);
    BigMoney actualNegativeResult = actualZeroResult.negative();
    assertSame(actualZeroResult, actualNegativeResult);
    BigMoney actualPositiveResult = actualZeroResult.positive();
    assertSame(actualZeroResult, actualPositiveResult);
    assertSame(Currency.AED, actualZeroResult.getCurrency());
  }

  /**
   * Test {@link BigMoney#of(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -0.50}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyAmount) with 'CurrencyAmount'; then return negated Amount is BigDecimal(String) with '-0.50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(CurrencyAmount)"})
  void testOfWithCurrencyAmount_thenReturnNegatedAmountIsBigDecimalWith050() {
    // Arrange and Act
    BigMoney actualOfResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 0.5d));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-0.50");
    BigMoney negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("0.50"), actualOfResult.getAmount());
    Decimal value = actualOfResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#of(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return Value scale is eight.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test of(CurrencyAmount) with 'CurrencyAmount'; then return Value scale is eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(CurrencyAmount)"})
  void testOfWithCurrencyAmount_thenReturnValueScaleIsEight() {
    // Arrange and Act
    BigMoney actualOfResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d));

    // Assert
    Decimal value = actualOfResult.getValue();
    assertEquals(8, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-1E-8");
    BigMoney negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1E-8"), actualOfResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#of(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return Value scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test of(CurrencyAmount) with 'CurrencyAmount'; then return Value scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(CurrencyAmount)"})
  void testOfWithCurrencyAmount_thenReturnValueScaleIsZero() {
    // Arrange and Act
    BigMoney actualOfResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    Decimal value = actualOfResult.getValue();
    assertEquals(0, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-10.00");
    BigMoney negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("10.00"), actualOfResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#of(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return Value signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyAmount) with 'CurrencyAmount'; then return Value signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(CurrencyAmount)"})
  void testOfWithCurrencyAmount_thenReturnValueSignumIsMinusOne() {
    // Arrange and Act
    BigMoney actualOfResult = BigMoney.of(CurrencyAmount.of(Currency.AED, -0.5d));

    // Assert
    assertEquals(-1, actualOfResult.getValue().signum());
    assertEquals(new BigDecimal("-0.50"), actualOfResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("0.50");
    BigMoney negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.negative());
    BigMoney actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
  }

  /**
   * Test {@link BigMoney#of(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <ul>
   *   <li>When {@link BigDecimal#BigDecimal(String)} with {@code 2.3}.
   *   <li>Then return Value scale is one.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(Currency, BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, BigDecimal) with 'Currency', 'BigDecimal'; when BigDecimal(String) with '2.3'; then return Value scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(Currency, BigDecimal)"})
  void testOfWithCurrencyBigDecimal_whenBigDecimalWith23_thenReturnValueScaleIsOne() {
    // Arrange and Act
    BigMoney actualOfResult = BigMoney.of(Currency.AED, new BigDecimal("2.3"));

    // Assert
    Decimal value = actualOfResult.getValue();
    assertEquals(1, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-2.30");
    BigMoney negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("2.30"), actualOfResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#of(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <ul>
   *   <li>When {@link BigDecimal#BigDecimal(String)} with {@code 42}.
   *   <li>Then return Value scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(Currency, BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, BigDecimal) with 'Currency', 'BigDecimal'; when BigDecimal(String) with '42'; then return Value scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(Currency, BigDecimal)"})
  void testOfWithCurrencyBigDecimal_whenBigDecimalWith42_thenReturnValueScaleIsZero() {
    // Arrange and Act
    BigMoney actualOfResult = BigMoney.of(Currency.AED, new BigDecimal("42"));

    // Assert
    Decimal value = actualOfResult.getValue();
    assertEquals(0, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-42.00");
    BigMoney negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("42.00"), actualOfResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#of(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>When {@link Decimal} with value is forty-two.
   *   <li>Then return not Zero.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Decimal) with 'Currency', 'Decimal'; when Decimal with value is forty-two; then return not Zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(Currency, Decimal)"})
  void testOfWithCurrencyDecimal_whenDecimalWithValueIsFortyTwo_thenReturnNotZero() {
    // Arrange
    Decimal amount = Decimal.of(42L);

    // Act
    BigMoney actualOfResult = BigMoney.of(Currency.AED, amount);

    // Assert
    assertFalse(actualOfResult.isZero());
    assertEquals(new BigDecimal("42.00"), actualOfResult.getAmount());
    BigMoney actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
    assertSame(amount, actualOfResult.getValue());
    assertSame(Currency.AED, actualOfResult.getCurrency());
  }

  /**
   * Test {@link BigMoney#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -0.50}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; when '0.5'; then return negated Amount is BigDecimal(String) with '-0.50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(Currency, double)"})
  void testOfWithCurrencyDouble_when05_thenReturnNegatedAmountIsBigDecimalWith050() {
    // Arrange and Act
    BigMoney actualOfResult = BigMoney.of(Currency.AED, 0.5d);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-0.50");
    BigMoney negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("0.50"), actualOfResult.getAmount());
    Decimal value = actualOfResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return Value signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; when '-0.5'; then return Value signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(Currency, double)"})
  void testOfWithCurrencyDouble_when05_thenReturnValueSignumIsMinusOne() {
    // Arrange and Act
    BigMoney actualOfResult = BigMoney.of(Currency.AED, -0.5d);

    // Assert
    assertEquals(-1, actualOfResult.getValue().signum());
    assertEquals(new BigDecimal("-0.50"), actualOfResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("0.50");
    BigMoney negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.negative());
    BigMoney actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
  }

  /**
   * Test {@link BigMoney#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>When {@code 1.0E-8}.
   *   <li>Then return Value scale is eight.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; when '1.0E-8'; then return Value scale is eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(Currency, double)"})
  void testOfWithCurrencyDouble_when10e8_thenReturnValueScaleIsEight() {
    // Arrange and Act
    BigMoney actualOfResult = BigMoney.of(Currency.AED, 1.0E-8d);

    // Assert
    Decimal value = actualOfResult.getValue();
    assertEquals(8, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-1E-8");
    BigMoney negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1E-8"), actualOfResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Value scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; when ten; then return Value scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(Currency, double)"})
  void testOfWithCurrencyDouble_whenTen_thenReturnValueScaleIsZero() {
    // Arrange and Act
    BigMoney actualOfResult = BigMoney.of(Currency.AED, 10.0d);

    // Assert
    Decimal value = actualOfResult.getValue();
    assertEquals(0, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-10.00");
    BigMoney negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("10.00"), actualOfResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#of(Money)} with {@code Money}.
   *
   * <ul>
   *   <li>Then return not Zero.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#of(Money)}
   */
  @Test
  @DisplayName("Test of(Money) with 'Money'; then return not Zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.of(Money)"})
  void testOfWithMoney_thenReturnNotZero() {
    // Arrange and Act
    BigMoney actualOfResult = BigMoney.of(Money.of(CurrencyAmount.of(Currency.AED, 10.0d)));

    // Assert
    assertFalse(actualOfResult.isZero());
    assertEquals(new BigDecimal("10.00"), actualOfResult.getAmount());
    BigMoney actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.parse(String)"})
  void testParse_when10_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> BigMoney.parse("10"));
  }

  /**
   * Test {@link BigMoney#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Amount Str}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Amount Str'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.parse(String)"})
  void testParse_whenAmountStr_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> BigMoney.parse("Amount Str"));
  }

  /**
   * Test {@link BigMoney#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Unable to parse amount, invalid format:}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#parse(String)}
   */
  @Test
  @DisplayName(
      "Test parse(String); when 'Unable to parse amount, invalid format:'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.parse(String)"})
  void testParse_whenUnableToParseAmountInvalidFormat_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> BigMoney.parse("Unable to parse amount, invalid format: "));
  }

  /**
   * Test {@link BigMoney#getAmount()}.
   *
   * <ul>
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 10}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#getAmount()}
   */
  @Test
  @DisplayName("Test getAmount(); then return BigDecimal(String) with '10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal BigMoney.getAmount()"})
  void testGetAmount_thenReturnBigDecimalWith10() {
    // Arrange and Act
    BigDecimal actualAmount = BigMoney.of(CurrencyAmount.of(Currency.CLP, 10.0d)).getAmount();

    // Assert
    assertEquals(new BigDecimal("10"), actualAmount);
  }

  /**
   * Test {@link BigMoney#getAmount()}.
   *
   * <ul>
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 10.00}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#getAmount()}
   */
  @Test
  @DisplayName("Test getAmount(); then return BigDecimal(String) with '10.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal BigMoney.getAmount()"})
  void testGetAmount_thenReturnBigDecimalWith1000() {
    // Arrange and Act
    BigDecimal actualAmount = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d)).getAmount();

    // Assert
    assertEquals(new BigDecimal("10.00"), actualAmount);
  }

  /**
   * Test {@link BigMoney#multipliedBy(long)}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -21.00}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long); then return negated Amount is BigDecimal(String) with '-21.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.multipliedBy(long)"})
  void testMultipliedBy_thenReturnNegatedAmountIsBigDecimalWith2100() {
    // Arrange and Act
    BigMoney actualMultipliedByResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 0.5d)).multipliedBy(42L);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-21.00");
    BigMoney negatedResult = actualMultipliedByResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("21.00"), actualMultipliedByResult.getAmount());
    Decimal value = actualMultipliedByResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.negated());
    assertEquals(actualMultipliedByResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#multipliedBy(long)}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -420.00}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long); then return negated Amount is BigDecimal(String) with '-420.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.multipliedBy(long)"})
  void testMultipliedBy_thenReturnNegatedAmountIsBigDecimalWith42000() {
    // Arrange and Act
    BigMoney actualMultipliedByResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d)).multipliedBy(42L);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-420.00");
    BigMoney negatedResult = actualMultipliedByResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("420.00"), actualMultipliedByResult.getAmount());
    Decimal value = actualMultipliedByResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.negated());
    assertEquals(actualMultipliedByResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#multipliedBy(long)}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code
   *       -92233720368.547758}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long); then return negated Amount is BigDecimal(String) with '-92233720368.547758'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.multipliedBy(long)"})
  void testMultipliedBy_thenReturnNegatedAmountIsBigDecimalWith92233720368547758() {
    // Arrange and Act
    BigMoney actualMultipliedByResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)).multipliedBy(Long.MAX_VALUE);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-92233720368.547758");
    BigMoney negatedResult = actualMultipliedByResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("92233720368.547758"), actualMultipliedByResult.getAmount());
    Decimal value = actualMultipliedByResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.negated());
    assertEquals(actualMultipliedByResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#multipliedBy(long)}.
   *
   * <ul>
   *   <li>Then return Value scale is eight.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long); then return Value scale is eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.multipliedBy(long)"})
  void testMultipliedBy_thenReturnValueScaleIsEight() {
    // Arrange and Act
    BigMoney actualMultipliedByResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)).multipliedBy(42L);

    // Assert
    Decimal value = actualMultipliedByResult.getValue();
    assertEquals(8, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-4.2E-7");
    BigMoney negatedResult = actualMultipliedByResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("4.2E-7"), actualMultipliedByResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualMultipliedByResult, negatedResult.negated());
    assertEquals(actualMultipliedByResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#multipliedBy(long)}.
   *
   * <ul>
   *   <li>When {@link Long#MIN_VALUE}.
   *   <li>Then return Value signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long); when MIN_VALUE; then return Value signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.multipliedBy(long)"})
  void testMultipliedBy_whenMin_value_thenReturnValueSignumIsMinusOne() {
    // Arrange and Act
    BigMoney actualMultipliedByResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)).multipliedBy(Long.MIN_VALUE);

    // Assert
    assertEquals(-1, actualMultipliedByResult.getValue().signum());
    assertEquals(new BigDecimal("-92233720368.547758"), actualMultipliedByResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("92233720368.547758");
    BigMoney negatedResult = actualMultipliedByResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualMultipliedByResult, negatedResult.negated());
    assertEquals(actualMultipliedByResult, negatedResult.negative());
    BigMoney actualNegativeResult = actualMultipliedByResult.negative();
    assertSame(actualMultipliedByResult, actualNegativeResult);
  }

  /**
   * Test {@link BigMoney#multipliedBy(long)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Value signum is zero.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long); when zero; then return Value signum is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.multipliedBy(long)"})
  void testMultipliedBy_whenZero_thenReturnValueSignumIsZero() {
    // Arrange and Act
    BigMoney actualMultipliedByResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d)).multipliedBy(0L);

    // Assert
    Decimal value = actualMultipliedByResult.getValue();
    assertEquals(0, value.signum());
    assertTrue(actualMultipliedByResult.isZero());
    assertTrue(value.isZero());
    assertEquals(new BigDecimal("0.00"), actualMultipliedByResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    Decimal actualNegatedResult = value.negated();
    assertEquals(value, actualNegatedResult);
    BigMoney actualNegatedResult2 = actualMultipliedByResult.negated();
    assertSame(actualMultipliedByResult, actualNegatedResult2);
    BigMoney actualNegativeResult = actualMultipliedByResult.negative();
    assertSame(actualMultipliedByResult, actualNegativeResult);
    BigMoney actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.map(UnaryOperator)"})
  void testMap_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    BigMoney ofResult = BigMoney.of(Currency.AED, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.map(mapper));
    verify(mapper).apply(isA(Decimal.class));
  }

  /**
   * Test {@link BigMoney#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return {@link BigMoney} with currency is {@link Currency#AED} and amount is {@link
   *       Decimal}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); then return BigMoney with currency is AED and amount is Decimal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.map(UnaryOperator)"})
  void testMap_thenReturnBigMoneyWithCurrencyIsAedAndAmountIsDecimal() {
    // Arrange
    BigMoney ofResult = BigMoney.of(Currency.AED, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.of(42L));

    // Act
    BigMoney actualMapResult = ofResult.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    assertEquals(ofResult, actualMapResult);
  }

  /**
   * Test {@link BigMoney#mapAmount(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link BigDecimal#BigDecimal(String)} with {@code 2.3}.
   *   <li>Then return Value scale is one.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#mapAmount(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAmount(UnaryOperator); given BigDecimal(String) with '2.3'; then return Value scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.mapAmount(UnaryOperator)"})
  void testMapAmount_givenBigDecimalWith23_thenReturnValueScaleIsOne() {
    // Arrange
    BigMoney ofResult = BigMoney.of(Currency.AED, Decimal.of(42L));

    UnaryOperator<BigDecimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<BigDecimal>any())).thenReturn(new BigDecimal("2.3"));

    // Act
    BigMoney actualMapAmountResult = ofResult.mapAmount(mapper);

    // Assert
    verify(mapper).apply(isA(BigDecimal.class));
    Decimal value = actualMapAmountResult.getValue();
    assertEquals(1, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-2.30");
    BigMoney negatedResult = actualMapAmountResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    BigDecimal expectedAmount2 = new BigDecimal("-2.30");
    BigMoney negativeResult = actualMapAmountResult.negative();
    assertEquals(expectedAmount2, negativeResult.getAmount());
    assertEquals(new BigDecimal("2.30"), actualMapAmountResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualMapAmountResult, negatedResult.negated());
    assertEquals(actualMapAmountResult, negativeResult.negated());
    assertEquals(actualMapAmountResult, negatedResult.positive());
    assertEquals(actualMapAmountResult, negativeResult.positive());
  }

  /**
   * Test {@link BigMoney#mapAmount(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return {@link BigMoney} with currency is {@link Currency#AED} and amount is {@link
   *       Decimal}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#mapAmount(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAmount(UnaryOperator); then return BigMoney with currency is AED and amount is Decimal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.mapAmount(UnaryOperator)"})
  void testMapAmount_thenReturnBigMoneyWithCurrencyIsAedAndAmountIsDecimal() {
    // Arrange
    BigMoney ofResult = BigMoney.of(Currency.AED, Decimal.of(42L));

    UnaryOperator<BigDecimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<BigDecimal>any())).thenReturn(new BigDecimal("42"));

    // Act
    BigMoney actualMapAmountResult = ofResult.mapAmount(mapper);

    // Assert
    verify(mapper).apply(isA(BigDecimal.class));
    assertEquals(ofResult, actualMapAmountResult);
  }

  /**
   * Test {@link BigMoney#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       1.0E-8}.
   *   <li>When {@code CEILING}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given CurrencyAmount with currency is AED and amount is '1.0E-8'; when 'CEILING'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenCurrencyAmountWithCurrencyIsAedAndAmountIs10e8_whenCeiling() {
    // Arrange and Act
    BigMoney actualRoundToScaleResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)).roundToScale(1, RoundingMode.CEILING);

    // Assert
    Decimal value = actualRoundToScaleResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney negatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, negatedResult.negated());
    assertEquals(actualRoundToScaleResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualRoundToScaleResult.positive();
    assertSame(actualRoundToScaleResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       1.0E-8}.
   *   <li>When {@code UP}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); given CurrencyAmount with currency is AED and amount is '1.0E-8'; when 'UP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.roundToScale(int, RoundingMode)"})
  void testRoundToScale_givenCurrencyAmountWithCurrencyIsAedAndAmountIs10e8_whenUp() {
    // Arrange and Act
    BigMoney actualRoundToScaleResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)).roundToScale(1, RoundingMode.UP);

    // Assert
    Decimal value = actualRoundToScaleResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney negatedResult = actualRoundToScaleResult.negated();
    assertEquals(actualRoundToScaleResult, negatedResult.negated());
    assertEquals(actualRoundToScaleResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualRoundToScaleResult.positive();
    assertSame(actualRoundToScaleResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>Then return negative is negated.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName("Test roundToScale(int, RoundingMode); then return negative is negated")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.roundToScale(int, RoundingMode)"})
  void testRoundToScale_thenReturnNegativeIsNegated() {
    // Arrange and Act
    BigMoney actualRoundToScaleResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d)).roundToScale(1, RoundingMode.UP);

    // Assert
    Decimal value = actualRoundToScaleResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney negatedResult = actualRoundToScaleResult.negated();
    assertEquals(negatedResult, actualRoundToScaleResult.negative());
    BigMoney actualNegativeResult = negatedResult.negative();
    assertSame(negatedResult, actualNegativeResult);
    BigMoney actualPositiveResult = actualRoundToScaleResult.positive();
    assertSame(actualRoundToScaleResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>When {@code DOWN}.
   *   <li>Then return Value negated is Value.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); when 'DOWN'; then return Value negated is Value")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.roundToScale(int, RoundingMode)"})
  void testRoundToScale_whenDown_thenReturnValueNegatedIsValue() {
    // Arrange and Act
    BigMoney actualRoundToScaleResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)).roundToScale(1, RoundingMode.DOWN);

    // Assert
    Decimal value = actualRoundToScaleResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    Decimal actualNegatedResult = value.negated();
    assertEquals(value, actualNegatedResult);
    BigMoney actualNegatedResult2 = actualRoundToScaleResult.negated();
    assertSame(actualRoundToScaleResult, actualNegatedResult2);
    BigMoney actualNegativeResult = actualRoundToScaleResult.negative();
    assertSame(actualRoundToScaleResult, actualNegativeResult);
    BigMoney actualPositiveResult = actualRoundToScaleResult.positive();
    assertSame(actualRoundToScaleResult, actualPositiveResult);
    assertSame(
        actualRoundToScaleResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency(),
        actualRoundToScaleResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
  }

  /**
   * Test {@link BigMoney#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>When {@code FLOOR}.
   *   <li>Then return Value negated is Value.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); when 'FLOOR'; then return Value negated is Value")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.roundToScale(int, RoundingMode)"})
  void testRoundToScale_whenFloor_thenReturnValueNegatedIsValue() {
    // Arrange and Act
    BigMoney actualRoundToScaleResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)).roundToScale(1, RoundingMode.FLOOR);

    // Assert
    Decimal value = actualRoundToScaleResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    Decimal actualNegatedResult = value.negated();
    assertEquals(value, actualNegatedResult);
    BigMoney actualNegatedResult2 = actualRoundToScaleResult.negated();
    assertSame(actualRoundToScaleResult, actualNegatedResult2);
    BigMoney actualNegativeResult = actualRoundToScaleResult.negative();
    assertSame(actualRoundToScaleResult, actualNegativeResult);
    BigMoney actualPositiveResult = actualRoundToScaleResult.positive();
    assertSame(actualRoundToScaleResult, actualPositiveResult);
    assertSame(
        actualRoundToScaleResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency(),
        actualRoundToScaleResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
  }

  /**
   * Test {@link BigMoney#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>When {@code HALF_DOWN}.
   *   <li>Then return Value negated is Value.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); when 'HALF_DOWN'; then return Value negated is Value")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.roundToScale(int, RoundingMode)"})
  void testRoundToScale_whenHalfDown_thenReturnValueNegatedIsValue() {
    // Arrange and Act
    BigMoney actualRoundToScaleResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d))
            .roundToScale(1, RoundingMode.HALF_DOWN);

    // Assert
    Decimal value = actualRoundToScaleResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    Decimal actualNegatedResult = value.negated();
    assertEquals(value, actualNegatedResult);
    BigMoney actualNegatedResult2 = actualRoundToScaleResult.negated();
    assertSame(actualRoundToScaleResult, actualNegatedResult2);
    BigMoney actualNegativeResult = actualRoundToScaleResult.negative();
    assertSame(actualRoundToScaleResult, actualNegativeResult);
    BigMoney actualPositiveResult = actualRoundToScaleResult.positive();
    assertSame(actualRoundToScaleResult, actualPositiveResult);
    assertSame(
        actualRoundToScaleResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency(),
        actualRoundToScaleResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
  }

  /**
   * Test {@link BigMoney#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>When {@code HALF_UP}.
   *   <li>Then return Value negated is Value.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); when 'HALF_UP'; then return Value negated is Value")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.roundToScale(int, RoundingMode)"})
  void testRoundToScale_whenHalfUp_thenReturnValueNegatedIsValue() {
    // Arrange and Act
    BigMoney actualRoundToScaleResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)).roundToScale(1, RoundingMode.HALF_UP);

    // Assert
    Decimal value = actualRoundToScaleResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    Decimal actualNegatedResult = value.negated();
    assertEquals(value, actualNegatedResult);
    BigMoney actualNegatedResult2 = actualRoundToScaleResult.negated();
    assertSame(actualRoundToScaleResult, actualNegatedResult2);
    BigMoney actualNegativeResult = actualRoundToScaleResult.negative();
    assertSame(actualRoundToScaleResult, actualNegativeResult);
    BigMoney actualPositiveResult = actualRoundToScaleResult.positive();
    assertSame(actualRoundToScaleResult, actualPositiveResult);
    assertSame(
        actualRoundToScaleResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency(),
        actualRoundToScaleResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
  }

  /**
   * Test {@link BigMoney#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -20.00}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); when minus one; then return negated Amount is BigDecimal(String) with '-20.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.roundToScale(int, RoundingMode)"})
  void testRoundToScale_whenMinusOne_thenReturnNegatedAmountIsBigDecimalWith2000() {
    // Arrange and Act
    BigMoney actualRoundToScaleResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d)).roundToScale(-1, RoundingMode.UP);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-20.00");
    BigMoney negatedResult = actualRoundToScaleResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("20.00"), actualRoundToScaleResult.getAmount());
    Decimal value = actualRoundToScaleResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualRoundToScaleResult, negatedResult.negated());
    assertEquals(actualRoundToScaleResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualRoundToScaleResult.positive();
    assertSame(actualRoundToScaleResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#roundToScale(int, RoundingMode)}.
   *
   * <ul>
   *   <li>When minus one.
   *   <li>Then return negative is negated.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#roundToScale(int, RoundingMode)}
   */
  @Test
  @DisplayName(
      "Test roundToScale(int, RoundingMode); when minus one; then return negative is negated")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.roundToScale(int, RoundingMode)"})
  void testRoundToScale_whenMinusOne_thenReturnNegativeIsNegated() {
    // Arrange and Act
    BigMoney actualRoundToScaleResult =
        BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d))
            .roundToScale(-1, RoundingMode.HALF_DOWN);

    // Assert
    Decimal value = actualRoundToScaleResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney negatedResult = actualRoundToScaleResult.negated();
    assertEquals(negatedResult, actualRoundToScaleResult.negative());
    BigMoney actualNegativeResult = negatedResult.negative();
    assertSame(negatedResult, actualNegativeResult);
    BigMoney actualPositiveResult = actualRoundToScaleResult.positive();
    assertSame(actualRoundToScaleResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#isZero()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is ten.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#isZero()}
   */
  @Test
  @DisplayName(
      "Test isZero(); given CurrencyAmount with currency is AED and amount is ten; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BigMoney.isZero()"})
  void testIsZero_givenCurrencyAmountWithCurrencyIsAedAndAmountIsTen_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d)).isZero());
  }

  /**
   * Test {@link BigMoney#isPositive()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       -0.5}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#isPositive()}
   */
  @Test
  @DisplayName(
      "Test isPositive(); given CurrencyAmount with currency is AED and amount is '-0.5'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BigMoney.isPositive()"})
  void testIsPositive_givenCurrencyAmountWithCurrencyIsAedAndAmountIs05_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(BigMoney.of(CurrencyAmount.of(Currency.AED, -0.5d)).isPositive());
  }

  /**
   * Test {@link BigMoney#isPositive()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#isPositive()}
   */
  @Test
  @DisplayName(
      "Test isPositive(); given CurrencyAmount with currency is AED and amount is ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BigMoney.isPositive()"})
  void testIsPositive_givenCurrencyAmountWithCurrencyIsAedAndAmountIsTen_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d)).isPositive());
  }

  /**
   * Test {@link BigMoney#isNegative()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       -0.5}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#isNegative()}
   */
  @Test
  @DisplayName(
      "Test isNegative(); given CurrencyAmount with currency is AED and amount is '-0.5'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BigMoney.isNegative()"})
  void testIsNegative_givenCurrencyAmountWithCurrencyIsAedAndAmountIs05_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(BigMoney.of(CurrencyAmount.of(Currency.AED, -0.5d)).isNegative());
  }

  /**
   * Test {@link BigMoney#isNegative()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#isNegative()}
   */
  @Test
  @DisplayName("Test isNegative(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean BigMoney.isNegative()"})
  void testIsNegative_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d)).isNegative());
  }

  /**
   * Test {@link BigMoney#negated()}.
   *
   * <ul>
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#negated()}
   */
  @Test
  @DisplayName("Test negated(); then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.negated()"})
  void testNegated_thenReturnCurrencyCodeIsAed() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    BigMoney actualNegatedResult = ofResult.negated();

    // Assert
    Currency currency = actualNegatedResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    Decimal value = actualNegatedResult.getValue();
    assertEquals(-1, value.signum());
    assertEquals(0, value.scale());
    assertEquals(2, currency.getMinorUnitDigits());
    assertFalse(actualNegatedResult.isZero());
    assertFalse(value.isZero());
    assertEquals(new BigDecimal("-10.00"), actualNegatedResult.getAmount());
    assertEquals(ofResult, actualNegatedResult.positive());
    BigMoney actualNegativeResult = actualNegatedResult.negative();
    assertSame(actualNegatedResult, actualNegativeResult);
  }

  /**
   * Test {@link BigMoney#positive()}.
   *
   * <ul>
   *   <li>Then return {@link BigMoney} with {@link CurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#positive()}
   */
  @Test
  @DisplayName("Test positive(); then return BigMoney with CurrencyAmount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.positive()"})
  void testPositive_thenReturnBigMoneyWithCurrencyAmount() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    BigMoney actualPositiveResult = ofResult.positive();

    // Assert
    assertSame(ofResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#positive()}.
   *
   * <ul>
   *   <li>Then return Value scale is one.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#positive()}
   */
  @Test
  @DisplayName("Test positive(); then return Value scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.positive()"})
  void testPositive_thenReturnValueScaleIsOne() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, -0.5d));

    // Act
    BigMoney actualPositiveResult = ofResult.positive();

    // Assert
    Decimal value = actualPositiveResult.getValue();
    assertEquals(1, value.scale());
    assertEquals(new BigDecimal("0.50"), actualPositiveResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(ofResult, actualPositiveResult.negated());
    assertEquals(ofResult, actualPositiveResult.negative());
  }

  /**
   * Test {@link BigMoney#negative()}.
   *
   * <ul>
   *   <li>Then return {@link BigMoney} with {@link CurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#negative()}
   */
  @Test
  @DisplayName("Test negative(); then return BigMoney with CurrencyAmount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.negative()"})
  void testNegative_thenReturnBigMoneyWithCurrencyAmount() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, -0.5d));

    // Act
    BigMoney actualNegativeResult = ofResult.negative();

    // Assert
    assertSame(ofResult, actualNegativeResult);
  }

  /**
   * Test {@link BigMoney#negative()}.
   *
   * <ul>
   *   <li>Then return Value scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#negative()}
   */
  @Test
  @DisplayName("Test negative(); then return Value scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.negative()"})
  void testNegative_thenReturnValueScaleIsZero() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    BigMoney actualNegativeResult = ofResult.negative();

    // Assert
    assertEquals(0, actualNegativeResult.getValue().scale());
    assertEquals(new BigDecimal("-10.00"), actualNegativeResult.getAmount());
    assertEquals(ofResult, actualNegativeResult.negated());
    assertEquals(ofResult, actualNegativeResult.positive());
  }

  /**
   * Test {@link BigMoney#toCurrencyAmount()}.
   *
   * <ul>
   *   <li>Then return {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is
   *       {@code 1.0E-8}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#toCurrencyAmount()}
   */
  @Test
  @DisplayName(
      "Test toCurrencyAmount(); then return CurrencyAmount with currency is AED and amount is '1.0E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount BigMoney.toCurrencyAmount()"})
  void testToCurrencyAmount_thenReturnCurrencyAmountWithCurrencyIsAedAndAmountIs10e8() {
    // Arrange
    CurrencyAmount currencyAmount = CurrencyAmount.of(Currency.AED, 1.0E-8d);

    // Act and Assert
    assertEquals(currencyAmount, BigMoney.of(currencyAmount).toCurrencyAmount());
  }

  /**
   * Test {@link BigMoney#toCurrencyAmount()}.
   *
   * <ul>
   *   <li>Then return {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#toCurrencyAmount()}
   */
  @Test
  @DisplayName(
      "Test toCurrencyAmount(); then return CurrencyAmount with currency is AED and amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount BigMoney.toCurrencyAmount()"})
  void testToCurrencyAmount_thenReturnCurrencyAmountWithCurrencyIsAedAndAmountIsTen() {
    // Arrange
    CurrencyAmount currencyAmount = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act and Assert
    assertEquals(currencyAmount, BigMoney.of(currencyAmount).toCurrencyAmount());
  }

  /**
   * Test {@link BigMoney#toMoney()}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return Amount is BigDecimal(String) with '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money BigMoney.toMoney()"})
  void testToMoney_thenReturnAmountIsBigDecimalWith1() {
    // Arrange and Act
    Money actualToMoneyResult = BigMoney.of(CurrencyAmount.of(Currency.CLP, -0.5d)).toMoney();

    // Assert
    assertEquals(new BigDecimal("-1"), actualToMoneyResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("1");
    Money negatedResult = actualToMoneyResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualToMoneyResult, negatedResult.negated());
    assertEquals(actualToMoneyResult, negatedResult.negative());
    Money actualNegativeResult = actualToMoneyResult.negative();
    assertSame(actualToMoneyResult, actualNegativeResult);
  }

  /**
   * Test {@link BigMoney#toMoney()}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return negated Amount is BigDecimal(String) with '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money BigMoney.toMoney()"})
  void testToMoney_thenReturnNegatedAmountIsBigDecimalWith1() {
    // Arrange and Act
    Money actualToMoneyResult = BigMoney.of(CurrencyAmount.of(Currency.CLP, 0.5d)).toMoney();

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-1");
    Money negatedResult = actualToMoneyResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1"), actualToMoneyResult.getAmount());
    assertEquals(actualToMoneyResult, negatedResult.negated());
    assertEquals(actualToMoneyResult, negatedResult.positive());
    Money actualPositiveResult = actualToMoneyResult.positive();
    assertSame(actualToMoneyResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#toMoney()}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1E+1}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return negated Amount is BigDecimal(String) with '-1E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money BigMoney.toMoney()"})
  void testToMoney_thenReturnNegatedAmountIsBigDecimalWith1e1() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");

    // Act
    Money actualToMoneyResult = BigMoney.of(CurrencyAmount.of(currency, 10.0d)).toMoney();

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-1E+1");
    Money negatedResult = actualToMoneyResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1E+1"), actualToMoneyResult.getAmount());
    assertEquals(actualToMoneyResult, negatedResult.negated());
    assertEquals(actualToMoneyResult, negatedResult.positive());
    assertSame(currency, actualToMoneyResult.getCurrency());
    assertSame(currency, negatedResult.getCurrency());
    Money actualPositiveResult = actualToMoneyResult.positive();
    assertSame(actualToMoneyResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#toMoney()}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -10.00}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return negated Amount is BigDecimal(String) with '-10.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money BigMoney.toMoney()"})
  void testToMoney_thenReturnNegatedAmountIsBigDecimalWith1000() {
    // Arrange and Act
    Money actualToMoneyResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d)).toMoney();

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-10.00");
    Money negatedResult = actualToMoneyResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("10.00"), actualToMoneyResult.getAmount());
    assertEquals(actualToMoneyResult, negatedResult.negated());
    assertEquals(actualToMoneyResult, negatedResult.positive());
    Money actualPositiveResult = actualToMoneyResult.positive();
    assertSame(actualToMoneyResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#toMoney()}.
   *
   * <ul>
   *   <li>Then return Value decimal signum is zero.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return Value decimal signum is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money BigMoney.toMoney()"})
  void testToMoney_thenReturnValueDecimalSignumIsZero() {
    // Arrange and Act
    Money actualToMoneyResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)).toMoney();

    // Assert
    Decimal decimalResult = actualToMoneyResult.getValue().decimal();
    assertEquals(0, decimalResult.signum());
    assertTrue(actualToMoneyResult.isZero());
    assertTrue(decimalResult.isZero());
    assertEquals(new BigDecimal("0.00"), actualToMoneyResult.getAmount());
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    Decimal actualNegatedResult = decimalResult.negated();
    assertEquals(decimalResult, actualNegatedResult);
    Money actualNegatedResult2 = actualToMoneyResult.negated();
    assertSame(actualToMoneyResult, actualNegatedResult2);
    Money actualNegativeResult = actualToMoneyResult.negative();
    assertSame(actualToMoneyResult, actualNegativeResult);
    Money actualPositiveResult = actualToMoneyResult.positive();
    assertSame(actualToMoneyResult, actualPositiveResult);
    assertSame(
        actualToMoneyResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualToMoneyResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, BigDecimal)} with {@code Currency}, {@code
   * BigDecimal}.
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, BigDecimal)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, BigDecimal) with 'Currency', 'BigDecimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, BigDecimal)"})
  void testConvertedToWithCurrencyBigDecimal() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, new BigDecimal("2.3"));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-23.00");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("23.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Decimal value = actualConvertedToResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, BigDecimal)} with {@code Currency}, {@code
   * BigDecimal}.
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, BigDecimal)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, BigDecimal) with 'Currency', 'BigDecimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, BigDecimal)"})
  void testConvertedToWithCurrencyBigDecimal2() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, new BigDecimal("42"));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-420.00");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("420.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Decimal value = actualConvertedToResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, BigDecimal)} with {@code Currency}, {@code
   * BigDecimal}.
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, BigDecimal)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, BigDecimal) with 'Currency', 'BigDecimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, BigDecimal)"})
  void testConvertedToWithCurrencyBigDecimal3() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 0.5d));

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, new BigDecimal("42"));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-21.00");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("21.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Decimal value = actualConvertedToResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, BigDecimal)} with {@code Currency}, {@code
   * BigDecimal}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, BigDecimal) with 'Currency', 'BigDecimal'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, BigDecimal)"})
  void testConvertedToWithCurrencyBigDecimal_thenThrowIllegalArgumentException() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.convertedTo(Currency.AED, new BigDecimal("2.3")));
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, BigDecimal)} with {@code Currency}, {@code
   * BigDecimal}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, BigDecimal) with 'Currency', 'BigDecimal'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, BigDecimal)"})
  void testConvertedToWithCurrencyBigDecimal_thenThrowIllegalArgumentException2() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.convertedTo(Currency.AED, new BigDecimal("42")));
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 0.5d));

    // Act
    BigMoney actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, Decimal.ofScaled(Long.MAX_VALUE, 1));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-461168601842738790.00");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("461168601842738790.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Decimal value = actualConvertedToResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return {@link BigMoney} with {@link CurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return BigMoney with CurrencyAmount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnBigMoneyWithCurrencyAmount() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.of(1L));

    // Assert
    assertSame(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1.00}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return negated Amount is BigDecimal(String) with '-1.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnNegatedAmountIsBigDecimalWith100() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.ofScaled(1L, 1));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-1.00");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Decimal value = actualConvertedToResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -21.00}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return negated Amount is BigDecimal(String) with '-21.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnNegatedAmountIsBigDecimalWith2100() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 0.5d));

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.of(42L));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-21.00");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("21.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Decimal value = actualConvertedToResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -420.00}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return negated Amount is BigDecimal(String) with '-420.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnNegatedAmountIsBigDecimalWith42000() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.of(42L));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-420.00");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("420.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Decimal value = actualConvertedToResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return Value is {@link Decimal} with value is zero.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return Value is Decimal with value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnValueIsDecimalWithValueIsZero() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 10.0d));
    Decimal fxRate = Decimal.of(0L);

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, fxRate);

    // Assert
    assertEquals(fxRate, actualConvertedToResult.getValue());
    BigMoney actualNegatedResult = actualConvertedToResult.negated();
    assertSame(actualConvertedToResult, actualNegatedResult);
    BigMoney actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
    assertSame(
        actualConvertedToResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualConvertedToResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return Value negated is Value.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return Value negated is Value")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnValueNegatedIsValue() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.ofScaled(1L, 18));

    // Assert
    Decimal value = actualConvertedToResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    Decimal actualNegatedResult = value.negated();
    assertEquals(value, actualNegatedResult);
    BigMoney actualNegatedResult2 = actualConvertedToResult.negated();
    assertSame(actualConvertedToResult, actualNegatedResult2);
    BigMoney actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
    assertSame(
        actualConvertedToResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualConvertedToResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return Value negated is Value.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return Value negated is Value")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnValueNegatedIsValue2() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 1.0E-8d));

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.ofScaled(1L, 18));

    // Assert
    Decimal value = actualConvertedToResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    Decimal actualNegatedResult = value.negated();
    assertEquals(value, actualNegatedResult);
    BigMoney actualNegatedResult2 = actualConvertedToResult.negated();
    assertSame(actualConvertedToResult, actualNegatedResult2);
    BigMoney actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
    assertSame(
        actualConvertedToResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualConvertedToResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return Value scale is eight.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return Value scale is eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnValueScaleIsEight() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 1.0E-8d));

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.of(42L));

    // Assert
    Decimal value = actualConvertedToResult.getValue();
    assertEquals(8, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-4.2E-7");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("4.2E-7"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return Value scale is twelve.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return Value scale is twelve")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnValueScaleIsTwelve() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    // Act
    BigMoney actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Assert
    Decimal value = actualConvertedToResult.getValue();
    assertEquals(12, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-92.233720368548");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("92.233720368548"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return Value signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return Value signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnValueSignumIsMinusOne() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, -0.5d));

    // Act
    BigMoney actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, Decimal.ofScaled(Long.MAX_VALUE, 1));

    // Assert
    assertEquals(-1, actualConvertedToResult.getValue().signum());
    assertEquals(new BigDecimal("-461168601842738790.00"), actualConvertedToResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("461168601842738790.00");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.negative());
    BigMoney actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenThrowIllegalArgumentException() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.convertedTo(Currency.AED, Decimal.of(42L)));
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>When ofScaled {@link Long#MAX_VALUE} and eighteen.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; when ofScaled MAX_VALUE and eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_whenOfScaledMax_valueAndEighteen() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.convertedTo(Currency.AED, Decimal.ofScaled(Long.MAX_VALUE, 18)));
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>When ofScaled one and one.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; when ofScaled one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_whenOfScaledOneAndOne() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.convertedTo(Currency.AED, Decimal.ofScaled(1L, 1)));
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 1.0E-8d));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(10.0d);

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(1.0E-8d), isA(Currency.class), isA(Currency.class));
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Decimal value = actualConvertedToResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return negative is negated.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'; given ten; then return negative is negated")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider_givenTen_thenReturnNegativeIsNegated() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(10.0d);

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Decimal value = actualConvertedToResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(negatedResult, actualConvertedToResult.negative());
    BigMoney actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
    BigMoney actualNegativeResult = negatedResult.negative();
    assertSame(negatedResult, actualNegativeResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <ul>
   *   <li>Then return {@link BigMoney} with {@link CurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'; then return BigMoney with CurrencyAmount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider_thenReturnBigMoneyWithCurrencyAmount() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    BigMoney actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, mock(FxRateProvider.class));

    // Assert
    assertSame(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <ul>
   *   <li>Then return Value negated scale is one.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'; then return Value negated scale is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider_thenReturnValueNegatedScaleIsOne() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(0.5d);

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
    assertEquals(1, actualConvertedToResult.getValue().negated().scale());
    BigDecimal expectedAmount = new BigDecimal("-0.50");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    BigDecimal expectedAmount2 = new BigDecimal("-0.50");
    BigMoney negativeResult = actualConvertedToResult.negative();
    assertEquals(expectedAmount2, negativeResult.getAmount());
    assertEquals(new BigDecimal("0.50"), actualConvertedToResult.getAmount());
    BigDecimal expectedAmount3 = new BigDecimal("0.50");
    assertEquals(expectedAmount3, negatedResult.negated().getAmount());
    BigDecimal expectedAmount4 = new BigDecimal("0.50");
    assertEquals(expectedAmount4, negativeResult.negated().getAmount());
    BigDecimal expectedAmount5 = new BigDecimal("0.50");
    assertEquals(expectedAmount5, negatedResult.positive().getAmount());
    BigDecimal expectedAmount6 = new BigDecimal("0.50");
    assertEquals(expectedAmount6, negativeResult.positive().getAmount());
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <ul>
   *   <li>Then return Value signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'; then return Value signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider_thenReturnValueSignumIsMinusOne() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(-0.5d);

    // Act
    BigMoney actualConvertedToResult = ofResult.convertedTo(Currency.AED, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
    assertEquals(-1, actualConvertedToResult.getValue().signum());
    assertEquals(new BigDecimal("-0.50"), actualConvertedToResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("0.50");
    BigMoney negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negative());
    assertEquals(negatedResult, actualConvertedToResult.positive());
    BigMoney actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
    BigMoney actualPositiveResult = negatedResult.positive();
    assertSame(negatedResult, actualPositiveResult);
  }

  /**
   * Test {@link BigMoney#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link BigMoney#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney BigMoney.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider_thenThrowIllegalArgumentException() {
    // Arrange
    BigMoney ofResult = BigMoney.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.convertedTo(Currency.AED, rateProvider));
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
  }
}
