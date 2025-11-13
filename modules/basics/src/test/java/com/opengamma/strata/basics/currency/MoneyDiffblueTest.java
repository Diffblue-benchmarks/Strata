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
import com.opengamma.strata.collect.FixedScaleDecimal;
import java.math.BigDecimal;
import java.util.function.UnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MoneyDiffblueTest {
  /**
   * Test {@link Money#zero(Currency)}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code 0E+1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#zero(Currency)}
   */
  @Test
  @DisplayName("Test zero(Currency); then return Amount is BigDecimal(String) with '0E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.zero(Currency)"})
  void testZero_thenReturnAmountIsBigDecimalWith0e1() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");

    // Act
    Money actualZeroResult = Money.zero(currency);

    // Assert
    assertEquals(new BigDecimal("0E+1"), actualZeroResult.getAmount());
    assertSame(currency, actualZeroResult.getCurrency());
    Money actualNegatedResult = actualZeroResult.negated();
    assertSame(actualZeroResult, actualNegatedResult);
    Money actualNegativeResult = actualZeroResult.negative();
    assertSame(actualZeroResult, actualNegativeResult);
    Money actualPositiveResult = actualZeroResult.positive();
    assertSame(actualZeroResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#zero(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return Value fixedScale is two.
   * </ul>
   *
   * <p>Method under test: {@link Money#zero(Currency)}
   */
  @Test
  @DisplayName("Test zero(Currency); when AED; then return Value fixedScale is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.zero(Currency)"})
  void testZero_whenAed_thenReturnValueFixedScaleIsTwo() {
    // Arrange and Act
    Money actualZeroResult = Money.zero(Currency.AED);

    // Assert
    assertEquals(2, actualZeroResult.getValue().fixedScale());
    assertEquals(new BigDecimal("0.00"), actualZeroResult.getAmount());
    Money actualNegatedResult = actualZeroResult.negated();
    assertSame(actualZeroResult, actualNegatedResult);
    Money actualNegativeResult = actualZeroResult.negative();
    assertSame(actualZeroResult, actualNegativeResult);
    Money actualPositiveResult = actualZeroResult.positive();
    assertSame(actualZeroResult, actualPositiveResult);
    assertSame(Currency.AED, actualZeroResult.getCurrency());
  }

  /**
   * Test {@link Money#of(BigMoney)} with {@code BigMoney}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(BigMoney)}
   */
  @Test
  @DisplayName(
      "Test of(BigMoney) with 'BigMoney'; then return Amount is BigDecimal(String) with '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(BigMoney)"})
  void testOfWithBigMoney_thenReturnAmountIsBigDecimalWith1() {
    // Arrange and Act
    Money actualOfResult = Money.of(BigMoney.of(CurrencyAmount.of(Currency.CLP, -0.5d)));

    // Assert
    assertEquals(new BigDecimal("-1"), actualOfResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("1");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.negative());
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#of(BigMoney)} with {@code BigMoney}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(BigMoney)}
   */
  @Test
  @DisplayName(
      "Test of(BigMoney) with 'BigMoney'; then return negated Amount is BigDecimal(String) with '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(BigMoney)"})
  void testOfWithBigMoney_thenReturnNegatedAmountIsBigDecimalWith1() {
    // Arrange and Act
    Money actualOfResult = Money.of(BigMoney.of(CurrencyAmount.of(Currency.CLP, 0.5d)));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-1");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(BigMoney)} with {@code BigMoney}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1E+1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(BigMoney)}
   */
  @Test
  @DisplayName(
      "Test of(BigMoney) with 'BigMoney'; then return negated Amount is BigDecimal(String) with '-1E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(BigMoney)"})
  void testOfWithBigMoney_thenReturnNegatedAmountIsBigDecimalWith1e1() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");

    // Act
    Money actualOfResult = Money.of(BigMoney.of(CurrencyAmount.of(currency, 10.0d)));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-1E+1");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1E+1"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    assertSame(currency, negatedResult.getCurrency());
    assertSame(currency, actualOfResult.getCurrency());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(BigMoney)} with {@code BigMoney}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -10.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(BigMoney)}
   */
  @Test
  @DisplayName(
      "Test of(BigMoney) with 'BigMoney'; then return negated Amount is BigDecimal(String) with '-10.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(BigMoney)"})
  void testOfWithBigMoney_thenReturnNegatedAmountIsBigDecimalWith1000() {
    // Arrange and Act
    Money actualOfResult = Money.of(BigMoney.of(CurrencyAmount.of(Currency.AED, 10.0d)));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-10.00");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("10.00"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(BigMoney)} with {@code BigMoney}.
   *
   * <ul>
   *   <li>Then return Value decimal signum is zero.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(BigMoney)}
   */
  @Test
  @DisplayName("Test of(BigMoney) with 'BigMoney'; then return Value decimal signum is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(BigMoney)"})
  void testOfWithBigMoney_thenReturnValueDecimalSignumIsZero() {
    // Arrange and Act
    Money actualOfResult = Money.of(BigMoney.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)));

    // Assert
    Decimal decimalResult = actualOfResult.getValue().decimal();
    assertEquals(0, decimalResult.signum());
    assertTrue(actualOfResult.isZero());
    assertTrue(decimalResult.isZero());
    assertEquals(new BigDecimal("0.00"), actualOfResult.getAmount());
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    Decimal actualNegatedResult = decimalResult.negated();
    assertEquals(decimalResult, actualNegatedResult);
    assertSame(
        actualOfResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualOfResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    Money actualNegatedResult2 = actualOfResult.negated();
    assertSame(actualOfResult, actualNegatedResult2);
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyAmount) with 'CurrencyAmount'; then return Amount is BigDecimal(String) with '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(CurrencyAmount)"})
  void testOfWithCurrencyAmount_thenReturnAmountIsBigDecimalWith1() {
    // Arrange and Act
    Money actualOfResult = Money.of(CurrencyAmount.of(Currency.CLP, -0.5d));

    // Assert
    assertEquals(new BigDecimal("-1"), actualOfResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("1");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.negative());
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#of(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -0.50}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyAmount) with 'CurrencyAmount'; then return Amount is BigDecimal(String) with '-0.50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(CurrencyAmount)"})
  void testOfWithCurrencyAmount_thenReturnAmountIsBigDecimalWith050() {
    // Arrange and Act
    Money actualOfResult = Money.of(CurrencyAmount.of(Currency.AED, -0.5d));

    // Assert
    assertEquals(new BigDecimal("-0.50"), actualOfResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("0.50");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.negative());
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#of(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyAmount) with 'CurrencyAmount'; then return negated Amount is BigDecimal(String) with '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(CurrencyAmount)"})
  void testOfWithCurrencyAmount_thenReturnNegatedAmountIsBigDecimalWith1() {
    // Arrange and Act
    Money actualOfResult = Money.of(CurrencyAmount.of(Currency.CLP, 0.5d));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-1");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1E+1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyAmount) with 'CurrencyAmount'; then return negated Amount is BigDecimal(String) with '-1E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(CurrencyAmount)"})
  void testOfWithCurrencyAmount_thenReturnNegatedAmountIsBigDecimalWith1e1() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");

    // Act
    Money actualOfResult = Money.of(CurrencyAmount.of(currency, 10.0d));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-1E+1");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1E+1"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    assertSame(currency, negatedResult.getCurrency());
    assertSame(currency, actualOfResult.getCurrency());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -0.50}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyAmount) with 'CurrencyAmount'; then return negated Amount is BigDecimal(String) with '-0.50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(CurrencyAmount)"})
  void testOfWithCurrencyAmount_thenReturnNegatedAmountIsBigDecimalWith050() {
    // Arrange and Act
    Money actualOfResult = Money.of(CurrencyAmount.of(Currency.AED, 0.5d));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-0.50");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("0.50"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -10.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyAmount) with 'CurrencyAmount'; then return negated Amount is BigDecimal(String) with '-10.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(CurrencyAmount)"})
  void testOfWithCurrencyAmount_thenReturnNegatedAmountIsBigDecimalWith1000() {
    // Arrange and Act
    Money actualOfResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-10.00");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("10.00"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return Value decimal signum is zero.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test of(CurrencyAmount) with 'CurrencyAmount'; then return Value decimal signum is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(CurrencyAmount)"})
  void testOfWithCurrencyAmount_thenReturnValueDecimalSignumIsZero() {
    // Arrange and Act
    Money actualOfResult = Money.of(CurrencyAmount.of(Currency.AED, 1.0E-8d));

    // Assert
    Decimal decimalResult = actualOfResult.getValue().decimal();
    assertEquals(0, decimalResult.signum());
    assertTrue(actualOfResult.isZero());
    assertTrue(decimalResult.isZero());
    assertEquals(new BigDecimal("0.00"), actualOfResult.getAmount());
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    Decimal actualNegatedResult = decimalResult.negated();
    assertEquals(decimalResult, actualNegatedResult);
    assertSame(
        actualOfResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualOfResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    Money actualNegatedResult2 = actualOfResult.negated();
    assertSame(actualOfResult, actualNegatedResult2);
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1E+1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, BigDecimal) with 'Currency', 'BigDecimal'; then return negated Amount is BigDecimal(String) with '-1E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, BigDecimal)"})
  void testOfWithCurrencyBigDecimal_thenReturnNegatedAmountIsBigDecimalWith1e1() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");

    // Act
    Money actualOfResult = Money.of(currency, new BigDecimal("5.6"));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-1E+1");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1E+1"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    assertSame(currency, negatedResult.getCurrency());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -5}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, BigDecimal) with 'Currency', 'BigDecimal'; then return negated Amount is BigDecimal(String) with '-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, BigDecimal)"})
  void testOfWithCurrencyBigDecimal_thenReturnNegatedAmountIsBigDecimalWith5() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.CLP, new BigDecimal("4.5"));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-5");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("5"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <ul>
   *   <li>Then return Zero.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, BigDecimal)}
   */
  @Test
  @DisplayName("Test of(Currency, BigDecimal) with 'Currency', 'BigDecimal'; then return Zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, BigDecimal)"})
  void testOfWithCurrencyBigDecimal_thenReturnZero() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");

    // Act
    Money actualOfResult = Money.of(currency, new BigDecimal("2.3"));

    // Assert
    assertTrue(actualOfResult.isZero());
    assertEquals(new BigDecimal("0E+1"), actualOfResult.getAmount());
    Money actualNegatedResult = actualOfResult.negated();
    assertSame(actualOfResult, actualNegatedResult);
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return Value fixedScale is two.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, BigDecimal) with 'Currency', 'BigDecimal'; when AED; then return Value fixedScale is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, BigDecimal)"})
  void testOfWithCurrencyBigDecimal_whenAed_thenReturnValueFixedScaleIsTwo() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.AED, new BigDecimal("2.3"));

    // Assert
    assertEquals(2, actualOfResult.getValue().fixedScale());
    BigDecimal expectedAmount = new BigDecimal("-2.30");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("2.30"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
    Currency currency = Currency.AED;
    assertSame(currency, negatedResult.getCurrency());
    assertSame(currency, actualOfResult.getCurrency());
  }

  /**
   * Test {@link Money#of(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <ul>
   *   <li>When {@link Currency#CLP}.
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -2}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, BigDecimal) with 'Currency', 'BigDecimal'; when CLP; then return negated Amount is BigDecimal(String) with '-2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, BigDecimal)"})
  void testOfWithCurrencyBigDecimal_whenClp_thenReturnNegatedAmountIsBigDecimalWith2() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.CLP, new BigDecimal("2.3"));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-2");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("2"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <p>Method under test: {@link Money#of(Currency, Decimal)}
   */
  @Test
  @DisplayName("Test of(Currency, Decimal) with 'Currency', 'Decimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, Decimal)"})
  void testOfWithCurrencyDecimal() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.CLP, Decimal.ofScaled(Long.MAX_VALUE, 3));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-9223372036854776");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("9223372036854776"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code 0E+1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Decimal) with 'Currency', 'Decimal'; then return Amount is BigDecimal(String) with '0E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, Decimal)"})
  void testOfWithCurrencyDecimal_thenReturnAmountIsBigDecimalWith0e1() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");

    // Act
    Money actualOfResult = Money.of(currency, Decimal.of(0L));

    // Assert
    assertEquals(new BigDecimal("0E+1"), actualOfResult.getAmount());
    Money actualNegatedResult = actualOfResult.negated();
    assertSame(actualOfResult, actualNegatedResult);
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code
   *       -9223372036854776}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Decimal) with 'Currency', 'Decimal'; then return Amount is BigDecimal(String) with '-9223372036854776'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, Decimal)"})
  void testOfWithCurrencyDecimal_thenReturnAmountIsBigDecimalWith9223372036854776() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.CLP, Decimal.ofScaled(Long.MIN_VALUE, 3));

    // Assert
    assertEquals(new BigDecimal("-9223372036854776"), actualOfResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("9223372036854776");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.negative());
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#of(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -4E+1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Decimal) with 'Currency', 'Decimal'; then return negated Amount is BigDecimal(String) with '-4E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, Decimal)"})
  void testOfWithCurrencyDecimal_thenReturnNegatedAmountIsBigDecimalWith4e1() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");

    // Act
    Money actualOfResult = Money.of(currency, Decimal.of(42L));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-4E+1");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("4E+1"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    assertSame(currency, negatedResult.getCurrency());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -9}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Decimal) with 'Currency', 'Decimal'; then return negated Amount is BigDecimal(String) with '-9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, Decimal)"})
  void testOfWithCurrencyDecimal_thenReturnNegatedAmountIsBigDecimalWith9() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.CLP, Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-9");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("9"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -9.22}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Decimal) with 'Currency', 'Decimal'; then return negated Amount is BigDecimal(String) with '-9.22'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, Decimal)"})
  void testOfWithCurrencyDecimal_thenReturnNegatedAmountIsBigDecimalWith922() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.AED, Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-9.22");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("9.22"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -42.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Decimal) with 'Currency', 'Decimal'; then return negated Amount is BigDecimal(String) with '-42.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, Decimal)"})
  void testOfWithCurrencyDecimal_thenReturnNegatedAmountIsBigDecimalWith4200() {
    // Arrange
    Decimal amount = Decimal.of(42L);

    // Act
    Money actualOfResult = Money.of(Currency.AED, amount);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-42.00");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("42.00"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
    assertSame(amount, actualOfResult.getValue().decimal());
  }

  /**
   * Test {@link Money#of(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>When ofScaled two and eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, Decimal) with 'Currency', 'Decimal'; when ofScaled two and eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, Decimal)"})
  void testOfWithCurrencyDecimal_whenOfScaledTwoAndEighteen() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.CLP, Decimal.ofScaled(2L, 18));

    // Assert
    Decimal decimalResult = actualOfResult.getValue().decimal();
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    Decimal actualNegatedResult = decimalResult.negated();
    assertEquals(decimalResult, actualNegatedResult);
    assertSame(
        actualOfResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualOfResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    Money actualNegatedResult2 = actualOfResult.negated();
    assertSame(actualOfResult, actualNegatedResult2);
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>When ofScaled two and two.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, Decimal)}
   */
  @Test
  @DisplayName("Test of(Currency, Decimal) with 'Currency', 'Decimal'; when ofScaled two and two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, Decimal)"})
  void testOfWithCurrencyDecimal_whenOfScaledTwoAndTwo() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.CLP, Decimal.ofScaled(2L, 2));

    // Assert
    Decimal decimalResult = actualOfResult.getValue().decimal();
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    Decimal actualNegatedResult = decimalResult.negated();
    assertEquals(decimalResult, actualNegatedResult);
    assertSame(
        actualOfResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualOfResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    Money actualNegatedResult2 = actualOfResult.negated();
    assertSame(actualOfResult, actualNegatedResult2);
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1E+1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; then return negated Amount is BigDecimal(String) with '-1E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, double)"})
  void testOfWithCurrencyDouble_thenReturnNegatedAmountIsBigDecimalWith1e1() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");

    // Act
    Money actualOfResult = Money.of(currency, 10.0d);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-1E+1");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1E+1"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    assertSame(currency, negatedResult.getCurrency());
    assertSame(currency, actualOfResult.getCurrency());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -0.50}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; when '-0.5'; then return Amount is BigDecimal(String) with '-0.50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, double)"})
  void testOfWithCurrencyDouble_when05_thenReturnAmountIsBigDecimalWith050() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.AED, -0.5d);

    // Assert
    assertEquals(new BigDecimal("-0.50"), actualOfResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("0.50");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.negative());
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -0.50}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; when '0.5'; then return negated Amount is BigDecimal(String) with '-0.50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, double)"})
  void testOfWithCurrencyDouble_when05_thenReturnNegatedAmountIsBigDecimalWith050() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.AED, 0.5d);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-0.50");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("0.50"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>When {@code 1.0E-8}.
   *   <li>Then return Value decimal signum is zero.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; when '1.0E-8'; then return Value decimal signum is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, double)"})
  void testOfWithCurrencyDouble_when10e8_thenReturnValueDecimalSignumIsZero() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.AED, 1.0E-8d);

    // Assert
    Decimal decimalResult = actualOfResult.getValue().decimal();
    assertEquals(0, decimalResult.signum());
    assertTrue(actualOfResult.isZero());
    assertTrue(decimalResult.isZero());
    assertEquals(new BigDecimal("0.00"), actualOfResult.getAmount());
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    Decimal actualNegatedResult = decimalResult.negated();
    assertEquals(decimalResult, actualNegatedResult);
    assertSame(
        actualOfResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualOfResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    Money actualNegatedResult2 = actualOfResult.negated();
    assertSame(actualOfResult, actualNegatedResult2);
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>When {@link Currency#CLP}.
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; when CLP; then return Amount is BigDecimal(String) with '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, double)"})
  void testOfWithCurrencyDouble_whenClp_thenReturnAmountIsBigDecimalWith1() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.CLP, -0.5d);

    // Assert
    assertEquals(new BigDecimal("-1"), actualOfResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("1");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.negative());
    Money actualNegativeResult = actualOfResult.negative();
    assertSame(actualOfResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>When {@link Currency#CLP}.
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; when CLP; then return negated Amount is BigDecimal(String) with '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, double)"})
  void testOfWithCurrencyDouble_whenClp_thenReturnNegatedAmountIsBigDecimalWith1() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.CLP, 0.5d);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-1");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#of(Currency, double)} with {@code Currency}, {@code double}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -10.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'Currency', 'double'; when ten; then return negated Amount is BigDecimal(String) with '-10.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.of(Currency, double)"})
  void testOfWithCurrencyDouble_whenTen_thenReturnNegatedAmountIsBigDecimalWith1000() {
    // Arrange and Act
    Money actualOfResult = Money.of(Currency.AED, 10.0d);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-10.00");
    Money negatedResult = actualOfResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("10.00"), actualOfResult.getAmount());
    assertEquals(actualOfResult, negatedResult.negated());
    assertEquals(actualOfResult, negatedResult.positive());
    Money actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 10}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Money#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '10'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.parse(String)"})
  void testParse_when10_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Money.parse("10"));
  }

  /**
   * Test {@link Money#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Amount Str}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Money#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Amount Str'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.parse(String)"})
  void testParse_whenAmountStr_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> Money.parse("Amount Str"));
  }

  /**
   * Test {@link Money#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Unable to parse amount, invalid format:}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Money#parse(String)}
   */
  @Test
  @DisplayName(
      "Test parse(String); when 'Unable to parse amount, invalid format:'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.parse(String)"})
  void testParse_whenUnableToParseAmountInvalidFormat_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> Money.parse("Unable to parse amount, invalid format: "));
  }

  /**
   * Test {@link Money#getAmount()}.
   *
   * <ul>
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 10.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#getAmount()}
   */
  @Test
  @DisplayName("Test getAmount(); then return BigDecimal(String) with '10.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal Money.getAmount()"})
  void testGetAmount_thenReturnBigDecimalWith1000() {
    // Arrange and Act
    BigDecimal actualAmount = Money.of(CurrencyAmount.of(Currency.AED, 10.0d)).getAmount();

    // Assert
    assertEquals(new BigDecimal("10.00"), actualAmount);
  }

  /**
   * Test {@link Money#getValue()}.
   *
   * <ul>
   *   <li>Then return decimal negated signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Money#getValue()}
   */
  @Test
  @DisplayName("Test getValue(); then return decimal negated signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FixedScaleDecimal Money.getValue()"})
  void testGetValue_thenReturnDecimalNegatedSignumIsMinusOne() {
    // Arrange and Act
    FixedScaleDecimal actualValue = Money.of(CurrencyAmount.of(Currency.AED, 10.0d)).getValue();

    // Assert
    Decimal decimalResult = actualValue.decimal();
    Decimal negatedResult = decimalResult.negated();
    assertEquals(-1, negatedResult.signum());
    assertEquals(0, negatedResult.scale());
    assertEquals(0, decimalResult.scale());
    assertEquals(1, decimalResult.signum());
    assertEquals(2, actualValue.fixedScale());
    assertFalse(negatedResult.isZero());
    assertFalse(decimalResult.isZero());
    assertEquals(decimalResult, negatedResult.abs());
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    assertEquals(decimalResult, negatedResult.negated());
  }

  /**
   * Test {@link Money#plus(Money)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Money#plus(Money)}
   */
  @Test
  @DisplayName("Test plus(Money); given CurrencyAmount with currency is AED and amount is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.plus(Money)"})
  void testPlus_givenCurrencyAmountWithCurrencyIsAedAndAmountIs05() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 0.5d));

    // Act
    Money actualPlusResult = ofResult.plus(Money.of(CurrencyAmount.of(Currency.AED, 10.0d)));

    // Assert
    Money negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.negated());
    assertEquals(actualPlusResult, negatedResult.positive());
    Money actualPositiveResult = actualPlusResult.positive();
    assertSame(actualPlusResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#plus(Money)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       1.0E-8}.
   * </ul>
   *
   * <p>Method under test: {@link Money#plus(Money)}
   */
  @Test
  @DisplayName("Test plus(Money); given CurrencyAmount with currency is AED and amount is '1.0E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.plus(Money)"})
  void testPlus_givenCurrencyAmountWithCurrencyIsAedAndAmountIs10e8() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 1.0E-8d));

    // Act
    Money actualPlusResult = ofResult.plus(Money.of(CurrencyAmount.of(Currency.AED, 10.0d)));

    // Assert
    Money negatedResult = actualPlusResult.negated();
    assertEquals(negatedResult, actualPlusResult.negative());
    Money actualNegativeResult = negatedResult.negative();
    assertSame(negatedResult, actualNegativeResult);
    Money actualPositiveResult = actualPlusResult.positive();
    assertSame(actualPlusResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#plus(Money)}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -20.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#plus(Money)}
   */
  @Test
  @DisplayName("Test plus(Money); then return negated Amount is BigDecimal(String) with '-20.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.plus(Money)"})
  void testPlus_thenReturnNegatedAmountIsBigDecimalWith2000() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    Money actualPlusResult = ofResult.plus(Money.of(CurrencyAmount.of(Currency.AED, 10.0d)));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-20.00");
    Money negatedResult = actualPlusResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("20.00"), actualPlusResult.getAmount());
    assertEquals(actualPlusResult, negatedResult.negated());
    assertEquals(actualPlusResult, negatedResult.positive());
    Money actualPositiveResult = actualPlusResult.positive();
    assertSame(actualPlusResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#plus(Money)}.
   *
   * <ul>
   *   <li>When {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Money#plus(Money)}
   */
  @Test
  @DisplayName("Test plus(Money); when CurrencyAmount with currency is AED and amount is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.plus(Money)"})
  void testPlus_whenCurrencyAmountWithCurrencyIsAedAndAmountIs05() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    Money actualPlusResult = ofResult.plus(Money.of(CurrencyAmount.of(Currency.AED, 0.5d)));

    // Assert
    Money negatedResult = actualPlusResult.negated();
    assertEquals(actualPlusResult, negatedResult.negated());
    assertEquals(actualPlusResult, negatedResult.positive());
    Money actualPositiveResult = actualPlusResult.positive();
    assertSame(actualPlusResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#plus(Money)}.
   *
   * <ul>
   *   <li>When {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       1.0E-8}.
   * </ul>
   *
   * <p>Method under test: {@link Money#plus(Money)}
   */
  @Test
  @DisplayName("Test plus(Money); when CurrencyAmount with currency is AED and amount is '1.0E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.plus(Money)"})
  void testPlus_whenCurrencyAmountWithCurrencyIsAedAndAmountIs10e8() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    Money actualPlusResult = ofResult.plus(Money.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)));

    // Assert
    Money negatedResult = actualPlusResult.negated();
    assertEquals(negatedResult, actualPlusResult.negative());
    Money actualNegativeResult = negatedResult.negative();
    assertSame(negatedResult, actualNegativeResult);
    Money actualPositiveResult = actualPlusResult.positive();
    assertSame(actualPlusResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#multipliedBy(long)}.
   *
   * <p>Method under test: {@link Money#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.multipliedBy(long)"})
  void testMultipliedBy() {
    // Arrange and Act
    Money actualMultipliedByResult =
        Money.of(CurrencyAmount.of(new Currency("currency", 42, "GBP"), 1.0E-8d)).multipliedBy(42L);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-4.20000000000000000000000000000000000E-7");
    Money negatedResult = actualMultipliedByResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(
        new BigDecimal("4.20000000000000000000000000000000000E-7"),
        actualMultipliedByResult.getAmount());
    assertEquals(actualMultipliedByResult, negatedResult.negated());
    assertEquals(actualMultipliedByResult, negatedResult.positive());
    Money actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#multipliedBy(long)}.
   *
   * <p>Method under test: {@link Money#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.multipliedBy(long)"})
  void testMultipliedBy2() {
    // Arrange and Act
    Money actualMultipliedByResult =
        Money.of(CurrencyAmount.of(new Currency("currency", 42, "GBP"), 1.0E-8d))
            .multipliedBy(Long.MAX_VALUE);

    // Assert
    BigDecimal expectedAmount =
        new BigDecimal("-92233720368.547758000000000000000000000000000000000000");
    Money negatedResult = actualMultipliedByResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(
        new BigDecimal("92233720368.547758000000000000000000000000000000000000"),
        actualMultipliedByResult.getAmount());
    assertEquals(actualMultipliedByResult, negatedResult.negated());
    assertEquals(actualMultipliedByResult, negatedResult.positive());
    Money actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#multipliedBy(long)}.
   *
   * <p>Method under test: {@link Money#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.multipliedBy(long)"})
  void testMultipliedBy3() {
    // Arrange and Act
    Money actualMultipliedByResult =
        Money.of(CurrencyAmount.of(new Currency("currency", 42, "GBP"), 1.0E-8d))
            .multipliedBy(Long.MIN_VALUE);

    // Assert
    assertEquals(
        new BigDecimal("-92233720368.547758000000000000000000000000000000000000"),
        actualMultipliedByResult.getAmount());
    BigDecimal expectedAmount =
        new BigDecimal("92233720368.547758000000000000000000000000000000000000");
    Money negatedResult = actualMultipliedByResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualMultipliedByResult, negatedResult.negated());
    assertEquals(actualMultipliedByResult, negatedResult.negative());
    Money actualNegativeResult = actualMultipliedByResult.negative();
    assertSame(actualMultipliedByResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#multipliedBy(long)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       1.0E-8}.
   * </ul>
   *
   * <p>Method under test: {@link Money#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long); given CurrencyAmount with currency is AED and amount is '1.0E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.multipliedBy(long)"})
  void testMultipliedBy_givenCurrencyAmountWithCurrencyIsAedAndAmountIs10e8() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 1.0E-8d));

    // Act
    Money actualMultipliedByResult = ofResult.multipliedBy(42L);

    // Assert
    assertEquals(ofResult, actualMultipliedByResult);
  }

  /**
   * Test {@link Money#multipliedBy(long)}.
   *
   * <ul>
   *   <li>Then return {@link Money} with {@link CurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link Money#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long); then return Money with CurrencyAmount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.multipliedBy(long)"})
  void testMultipliedBy_thenReturnMoneyWithCurrencyAmount() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(new Currency("currency", -1, "GBP"), 1.0E-8d));

    // Act
    Money actualMultipliedByResult = ofResult.multipliedBy(42L);

    // Assert
    assertEquals(ofResult, actualMultipliedByResult);
  }

  /**
   * Test {@link Money#multipliedBy(long)}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -4.2E+2}.
   * </ul>
   *
   * <p>Method under test: {@link Money#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long); then return negated Amount is BigDecimal(String) with '-4.2E+2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.multipliedBy(long)"})
  void testMultipliedBy_thenReturnNegatedAmountIsBigDecimalWith42e2() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");

    // Act
    Money actualMultipliedByResult = Money.of(CurrencyAmount.of(currency, 10.0d)).multipliedBy(42L);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-4.2E+2");
    Money negatedResult = actualMultipliedByResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("4.2E+2"), actualMultipliedByResult.getAmount());
    assertEquals(actualMultipliedByResult, negatedResult.negated());
    assertEquals(actualMultipliedByResult, negatedResult.positive());
    assertSame(currency, negatedResult.getCurrency());
    Money actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#multipliedBy(long)}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -21.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long); then return negated Amount is BigDecimal(String) with '-21.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.multipliedBy(long)"})
  void testMultipliedBy_thenReturnNegatedAmountIsBigDecimalWith2100() {
    // Arrange and Act
    Money actualMultipliedByResult =
        Money.of(CurrencyAmount.of(Currency.AED, 0.5d)).multipliedBy(42L);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-21.00");
    Money negatedResult = actualMultipliedByResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("21.00"), actualMultipliedByResult.getAmount());
    assertEquals(actualMultipliedByResult, negatedResult.negated());
    assertEquals(actualMultipliedByResult, negatedResult.positive());
    Money actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#multipliedBy(long)}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -420.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#multipliedBy(long)}
   */
  @Test
  @DisplayName(
      "Test multipliedBy(long); then return negated Amount is BigDecimal(String) with '-420.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.multipliedBy(long)"})
  void testMultipliedBy_thenReturnNegatedAmountIsBigDecimalWith42000() {
    // Arrange and Act
    Money actualMultipliedByResult =
        Money.of(CurrencyAmount.of(Currency.AED, 10.0d)).multipliedBy(42L);

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-420.00");
    Money negatedResult = actualMultipliedByResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("420.00"), actualMultipliedByResult.getAmount());
    assertEquals(actualMultipliedByResult, negatedResult.negated());
    assertEquals(actualMultipliedByResult, negatedResult.positive());
    Money actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#multipliedBy(long)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Value decimal abs is Value decimal.
   * </ul>
   *
   * <p>Method under test: {@link Money#multipliedBy(long)}
   */
  @Test
  @DisplayName("Test multipliedBy(long); when zero; then return Value decimal abs is Value decimal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.multipliedBy(long)"})
  void testMultipliedBy_whenZero_thenReturnValueDecimalAbsIsValueDecimal() {
    // Arrange and Act
    Money actualMultipliedByResult =
        Money.of(CurrencyAmount.of(Currency.AED, 10.0d)).multipliedBy(0L);

    // Assert
    Decimal decimalResult = actualMultipliedByResult.getValue().decimal();
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    Decimal actualNegatedResult = decimalResult.negated();
    assertEquals(decimalResult, actualNegatedResult);
    assertSame(
        actualMultipliedByResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency(),
        actualMultipliedByResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
    Money actualNegatedResult2 = actualMultipliedByResult.negated();
    assertSame(actualMultipliedByResult, actualNegatedResult2);
    Money actualNegativeResult = actualMultipliedByResult.negative();
    assertSame(actualMultipliedByResult, actualNegativeResult);
    Money actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link Decimal} with value is zero.
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code 0E+1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); given Decimal with value is zero; then return Amount is BigDecimal(String) with '0E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.map(UnaryOperator)"})
  void testMap_givenDecimalWithValueIsZero_thenReturnAmountIsBigDecimalWith0e1() {
    // Arrange
    Currency currency = new Currency("mapper", -1, "GBP");
    Money ofResult = Money.of(currency, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.of(0L));

    // Act
    Money actualMapResult = ofResult.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    assertEquals(new BigDecimal("0E+1"), actualMapResult.getAmount());
    assertSame(currency, actualMapResult.getCurrency());
    Money actualNegatedResult = actualMapResult.negated();
    assertSame(actualMapResult, actualNegatedResult);
    Money actualNegativeResult = actualMapResult.negative();
    assertSame(actualMapResult, actualNegativeResult);
    Money actualPositiveResult = actualMapResult.positive();
    assertSame(actualMapResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Money#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.map(UnaryOperator)"})
  void testMap_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    Money ofResult = Money.of(Currency.AED, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.map(mapper));
    verify(mapper).apply(isA(Decimal.class));
  }

  /**
   * Test {@link Money#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given ofScaled {@link Long#MAX_VALUE} and eighteen.
   *   <li>Then return Value decimal scale is two.
   * </ul>
   *
   * <p>Method under test: {@link Money#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); given ofScaled MAX_VALUE and eighteen; then return Value decimal scale is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.map(UnaryOperator)"})
  void testMap_givenOfScaledMax_valueAndEighteen_thenReturnValueDecimalScaleIsTwo() {
    // Arrange
    Money ofResult = Money.of(Currency.AED, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Act
    Money actualMapResult = ofResult.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    Decimal decimalResult = actualMapResult.getValue().decimal();
    assertEquals(2, decimalResult.scale());
    BigDecimal expectedAmount = new BigDecimal("-9.22");
    Money negatedResult = actualMapResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    BigDecimal expectedAmount2 = new BigDecimal("-9.22");
    Money negativeResult = actualMapResult.negative();
    assertEquals(expectedAmount2, negativeResult.getAmount());
    assertEquals(new BigDecimal("9.22"), actualMapResult.getAmount());
    BigDecimal expectedAmount3 = new BigDecimal("9.22");
    assertEquals(expectedAmount3, negatedResult.negated().getAmount());
    BigDecimal expectedAmount4 = new BigDecimal("9.22");
    assertEquals(expectedAmount4, negativeResult.negated().getAmount());
    BigDecimal expectedAmount5 = new BigDecimal("9.22");
    assertEquals(expectedAmount5, negatedResult.positive().getAmount());
    BigDecimal expectedAmount6 = new BigDecimal("9.22");
    assertEquals(expectedAmount6, negativeResult.positive().getAmount());
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
  }

  /**
   * Test {@link Money#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given ofScaled two and eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Money#map(UnaryOperator)}
   */
  @Test
  @DisplayName("Test map(UnaryOperator); given ofScaled two and eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.map(UnaryOperator)"})
  void testMap_givenOfScaledTwoAndEighteen() {
    // Arrange
    Money ofResult = Money.of(Currency.CLP, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.ofScaled(2L, 18));

    // Act
    Money actualMapResult = ofResult.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    assertEquals(new BigDecimal("0"), actualMapResult.getAmount());
    Money actualNegatedResult = actualMapResult.negated();
    assertSame(actualMapResult, actualNegatedResult);
    assertSame(Decimal.ZERO, actualMapResult.getValue().decimal());
  }

  /**
   * Test {@link Money#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given ofScaled two and two.
   *   <li>When {@link UnaryOperator} {@link UnaryOperator#apply(Object)} return ofScaled two and
   *       two.
   * </ul>
   *
   * <p>Method under test: {@link Money#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); given ofScaled two and two; when UnaryOperator apply(Object) return ofScaled two and two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.map(UnaryOperator)"})
  void testMap_givenOfScaledTwoAndTwo_whenUnaryOperatorApplyReturnOfScaledTwoAndTwo() {
    // Arrange
    Money ofResult = Money.of(Currency.CLP, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.ofScaled(2L, 2));

    // Act
    Money actualMapResult = ofResult.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    assertEquals(new BigDecimal("0"), actualMapResult.getAmount());
    Money actualNegatedResult = actualMapResult.negated();
    assertSame(actualMapResult, actualNegatedResult);
    assertSame(Decimal.ZERO, actualMapResult.getValue().decimal());
  }

  /**
   * Test {@link Money#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code
   *       -9223372036854776}.
   * </ul>
   *
   * <p>Method under test: {@link Money#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); then return Amount is BigDecimal(String) with '-9223372036854776'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.map(UnaryOperator)"})
  void testMap_thenReturnAmountIsBigDecimalWith9223372036854776() {
    // Arrange
    Money ofResult = Money.of(Currency.CLP, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.ofScaled(Long.MIN_VALUE, 3));

    // Act
    Money actualMapResult = ofResult.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    assertEquals(new BigDecimal("-9223372036854776"), actualMapResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("9223372036854776");
    Money negatedResult = actualMapResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualMapResult, negatedResult.negative());
    assertEquals(negatedResult, actualMapResult.positive());
    Money actualPositiveResult = negatedResult.positive();
    assertSame(negatedResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return {@link Money} with currency is {@link Currency#AED} and amount is {@link
   *       Decimal}.
   * </ul>
   *
   * <p>Method under test: {@link Money#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); then return Money with currency is AED and amount is Decimal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.map(UnaryOperator)"})
  void testMap_thenReturnMoneyWithCurrencyIsAedAndAmountIsDecimal() {
    // Arrange
    Money ofResult = Money.of(Currency.AED, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.of(42L));

    // Act
    Money actualMapResult = ofResult.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    assertEquals(ofResult, actualMapResult);
  }

  /**
   * Test {@link Money#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return {@link Money} with currency is {@link Currency#Currency(String, int, String)}
   *       and amount is {@link Decimal}.
   * </ul>
   *
   * <p>Method under test: {@link Money#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); then return Money with currency is Currency(String, int, String) and amount is Decimal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.map(UnaryOperator)"})
  void testMap_thenReturnMoneyWithCurrencyIsCurrencyAndAmountIsDecimal() {
    // Arrange
    Currency currency = new Currency("mapper", -1, "GBP");
    Money ofResult = Money.of(currency, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.of(42L));

    // Act
    Money actualMapResult = ofResult.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    assertEquals(ofResult, actualMapResult);
  }

  /**
   * Test {@link Money#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -9}.
   * </ul>
   *
   * <p>Method under test: {@link Money#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); then return negated Amount is BigDecimal(String) with '-9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.map(UnaryOperator)"})
  void testMap_thenReturnNegatedAmountIsBigDecimalWith9() {
    // Arrange
    Money ofResult = Money.of(Currency.CLP, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Act
    Money actualMapResult = ofResult.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    BigDecimal expectedAmount = new BigDecimal("-9");
    Money negatedResult = actualMapResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    BigDecimal expectedAmount2 = new BigDecimal("-9");
    Money negatedResult2 = negatedResult.negated();
    assertEquals(expectedAmount2, negatedResult2.negated().getAmount());
    BigDecimal expectedAmount3 = new BigDecimal("-9");
    Money negativeResult = actualMapResult.negative();
    Money negatedResult3 = negativeResult.negated();
    assertEquals(expectedAmount3, negatedResult3.negated().getAmount());
    BigDecimal expectedAmount4 = new BigDecimal("-9");
    Money positiveResult = negatedResult.positive();
    assertEquals(expectedAmount4, positiveResult.negated().getAmount());
    BigDecimal expectedAmount5 = new BigDecimal("-9");
    Money positiveResult2 = negativeResult.positive();
    assertEquals(expectedAmount5, positiveResult2.negated().getAmount());
    assertEquals(new BigDecimal("-9"), negativeResult.getAmount());
    BigDecimal expectedAmount6 = new BigDecimal("-9");
    assertEquals(expectedAmount6, negatedResult2.negative().getAmount());
    BigDecimal expectedAmount7 = new BigDecimal("-9");
    assertEquals(expectedAmount7, negatedResult3.negative().getAmount());
    BigDecimal expectedAmount8 = new BigDecimal("-9");
    assertEquals(expectedAmount8, positiveResult.negative().getAmount());
    BigDecimal expectedAmount9 = new BigDecimal("-9");
    assertEquals(expectedAmount9, positiveResult2.negative().getAmount());
    assertEquals(new BigDecimal("9"), actualMapResult.getAmount());
  }

  /**
   * Test {@link Money#map(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code
   *       -9223372036854776}.
   * </ul>
   *
   * <p>Method under test: {@link Money#map(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test map(UnaryOperator); then return negated Amount is BigDecimal(String) with '-9223372036854776'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.map(UnaryOperator)"})
  void testMap_thenReturnNegatedAmountIsBigDecimalWith9223372036854776() {
    // Arrange
    Money ofResult = Money.of(Currency.CLP, Decimal.of(42L));

    UnaryOperator<Decimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<Decimal>any())).thenReturn(Decimal.ofScaled(Long.MAX_VALUE, 3));

    // Act
    Money actualMapResult = ofResult.map(mapper);

    // Assert
    verify(mapper).apply(isA(Decimal.class));
    BigDecimal expectedAmount = new BigDecimal("-9223372036854776");
    Money negatedResult = actualMapResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    BigDecimal expectedAmount2 = new BigDecimal("-9223372036854776");
    Money negatedResult2 = negatedResult.negated();
    assertEquals(expectedAmount2, negatedResult2.negated().getAmount());
    BigDecimal expectedAmount3 = new BigDecimal("-9223372036854776");
    Money negativeResult = actualMapResult.negative();
    Money negatedResult3 = negativeResult.negated();
    assertEquals(expectedAmount3, negatedResult3.negated().getAmount());
    BigDecimal expectedAmount4 = new BigDecimal("-9223372036854776");
    Money positiveResult = negatedResult.positive();
    assertEquals(expectedAmount4, positiveResult.negated().getAmount());
    BigDecimal expectedAmount5 = new BigDecimal("-9223372036854776");
    Money positiveResult2 = negativeResult.positive();
    assertEquals(expectedAmount5, positiveResult2.negated().getAmount());
    assertEquals(new BigDecimal("-9223372036854776"), negativeResult.getAmount());
    BigDecimal expectedAmount6 = new BigDecimal("-9223372036854776");
    assertEquals(expectedAmount6, negatedResult2.negative().getAmount());
    BigDecimal expectedAmount7 = new BigDecimal("-9223372036854776");
    assertEquals(expectedAmount7, negatedResult3.negative().getAmount());
    BigDecimal expectedAmount8 = new BigDecimal("-9223372036854776");
    assertEquals(expectedAmount8, positiveResult.negative().getAmount());
    BigDecimal expectedAmount9 = new BigDecimal("-9223372036854776");
    assertEquals(expectedAmount9, positiveResult2.negative().getAmount());
    assertEquals(new BigDecimal("9223372036854776"), actualMapResult.getAmount());
    assertEquals(new BigDecimal("9223372036854776"), negatedResult2.getAmount());
    assertEquals(new BigDecimal("9223372036854776"), negatedResult3.getAmount());
    assertEquals(new BigDecimal("9223372036854776"), positiveResult.getAmount());
    assertEquals(new BigDecimal("9223372036854776"), positiveResult2.getAmount());
  }

  /**
   * Test {@link Money#mapAmount(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link BigDecimal#BigDecimal(String)} with {@code 4.5}.
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -5}.
   * </ul>
   *
   * <p>Method under test: {@link Money#mapAmount(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAmount(UnaryOperator); given BigDecimal(String) with '4.5'; then return negated Amount is BigDecimal(String) with '-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.mapAmount(UnaryOperator)"})
  void testMapAmount_givenBigDecimalWith45_thenReturnNegatedAmountIsBigDecimalWith5() {
    // Arrange
    Money ofResult = Money.of(Currency.CLP, Decimal.of(42L));

    UnaryOperator<BigDecimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<BigDecimal>any())).thenReturn(new BigDecimal("4.5"));

    // Act
    Money actualMapAmountResult = ofResult.mapAmount(mapper);

    // Assert
    verify(mapper).apply(isA(BigDecimal.class));
    BigDecimal expectedAmount = new BigDecimal("-5");
    Money negatedResult = actualMapAmountResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    BigDecimal expectedAmount2 = new BigDecimal("-5");
    Money negatedResult2 = negatedResult.negated();
    assertEquals(expectedAmount2, negatedResult2.negated().getAmount());
    BigDecimal expectedAmount3 = new BigDecimal("-5");
    Money negativeResult = actualMapAmountResult.negative();
    Money negatedResult3 = negativeResult.negated();
    assertEquals(expectedAmount3, negatedResult3.negated().getAmount());
    BigDecimal expectedAmount4 = new BigDecimal("-5");
    Money positiveResult = negatedResult.positive();
    assertEquals(expectedAmount4, positiveResult.negated().getAmount());
    BigDecimal expectedAmount5 = new BigDecimal("-5");
    Money positiveResult2 = negativeResult.positive();
    assertEquals(expectedAmount5, positiveResult2.negated().getAmount());
    assertEquals(new BigDecimal("-5"), negativeResult.getAmount());
    BigDecimal expectedAmount6 = new BigDecimal("-5");
    assertEquals(expectedAmount6, negatedResult2.negative().getAmount());
    BigDecimal expectedAmount7 = new BigDecimal("-5");
    assertEquals(expectedAmount7, negatedResult3.negative().getAmount());
    BigDecimal expectedAmount8 = new BigDecimal("-5");
    assertEquals(expectedAmount8, positiveResult.negative().getAmount());
    BigDecimal expectedAmount9 = new BigDecimal("-5");
    assertEquals(expectedAmount9, positiveResult2.negative().getAmount());
    assertEquals(new BigDecimal("5"), actualMapAmountResult.getAmount());
  }

  /**
   * Test {@link Money#mapAmount(UnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link BigDecimal#BigDecimal(String)} with {@code 5.6}.
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1E+1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#mapAmount(UnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAmount(UnaryOperator); given BigDecimal(String) with '5.6'; then return negated Amount is BigDecimal(String) with '-1E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.mapAmount(UnaryOperator)"})
  void testMapAmount_givenBigDecimalWith56_thenReturnNegatedAmountIsBigDecimalWith1e1() {
    // Arrange
    Currency currency = new Currency("mapper", -1, "GBP");
    Money ofResult = Money.of(currency, Decimal.of(42L));

    UnaryOperator<BigDecimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<BigDecimal>any())).thenReturn(new BigDecimal("5.6"));

    // Act
    Money actualMapAmountResult = ofResult.mapAmount(mapper);

    // Assert
    verify(mapper).apply(isA(BigDecimal.class));
    BigDecimal expectedAmount = new BigDecimal("-1E+1");
    Money negatedResult = actualMapAmountResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1E+1"), actualMapAmountResult.getAmount());
    assertEquals(actualMapAmountResult, negatedResult.negated());
    assertEquals(actualMapAmountResult, negatedResult.positive());
    assertSame(currency, negatedResult.getCurrency());
  }

  /**
   * Test {@link Money#mapAmount(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link Money#mapAmount(UnaryOperator)}
   */
  @Test
  @DisplayName("Test mapAmount(UnaryOperator); then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.mapAmount(UnaryOperator)"})
  void testMapAmount_thenReturnCurrencyCodeIsAed() {
    // Arrange
    Money ofResult = Money.of(Currency.AED, Decimal.of(42L));

    UnaryOperator<BigDecimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<BigDecimal>any())).thenReturn(new BigDecimal("2.3"));

    // Act
    Money actualMapAmountResult = ofResult.mapAmount(mapper);

    // Assert
    verify(mapper).apply(isA(BigDecimal.class));
    Currency currency = actualMapAmountResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    assertEquals(2, currency.getMinorUnitDigits());
    assertEquals(2, actualMapAmountResult.getValue().fixedScale());
    BigDecimal expectedAmount = new BigDecimal("-2.30");
    Money negatedResult = actualMapAmountResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("2.30"), actualMapAmountResult.getAmount());
    assertEquals(actualMapAmountResult, negatedResult.negated());
    assertEquals(actualMapAmountResult, negatedResult.positive());
    assertSame(currency, negatedResult.getCurrency());
    Money actualPositiveResult = actualMapAmountResult.positive();
    assertSame(actualMapAmountResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#mapAmount(UnaryOperator)}.
   *
   * <ul>
   *   <li>Then return Zero.
   * </ul>
   *
   * <p>Method under test: {@link Money#mapAmount(UnaryOperator)}
   */
  @Test
  @DisplayName("Test mapAmount(UnaryOperator); then return Zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.mapAmount(UnaryOperator)"})
  void testMapAmount_thenReturnZero() {
    // Arrange
    Currency currency = new Currency("mapper", -1, "GBP");
    Money ofResult = Money.of(currency, Decimal.of(42L));

    UnaryOperator<BigDecimal> mapper = mock(UnaryOperator.class);
    when(mapper.apply(Mockito.<BigDecimal>any())).thenReturn(new BigDecimal("2.3"));

    // Act
    Money actualMapAmountResult = ofResult.mapAmount(mapper);

    // Assert
    verify(mapper).apply(isA(BigDecimal.class));
    assertTrue(actualMapAmountResult.isZero());
    assertEquals(new BigDecimal("0E+1"), actualMapAmountResult.getAmount());
    Money actualNegatedResult = actualMapAmountResult.negated();
    assertSame(actualMapAmountResult, actualNegatedResult);
    Money actualNegativeResult = actualMapAmountResult.negative();
    assertSame(actualMapAmountResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#isZero()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       1.0E-8}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Money#isZero()}
   */
  @Test
  @DisplayName(
      "Test isZero(); given CurrencyAmount with currency is AED and amount is '1.0E-8'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Money.isZero()"})
  void testIsZero_givenCurrencyAmountWithCurrencyIsAedAndAmountIs10e8_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Money.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)).isZero());
  }

  /**
   * Test {@link Money#isZero()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is ten.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Money#isZero()}
   */
  @Test
  @DisplayName(
      "Test isZero(); given CurrencyAmount with currency is AED and amount is ten; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Money.isZero()"})
  void testIsZero_givenCurrencyAmountWithCurrencyIsAedAndAmountIsTen_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Money.of(CurrencyAmount.of(Currency.AED, 10.0d)).isZero());
  }

  /**
   * Test {@link Money#isPositive()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Money#isPositive()}
   */
  @Test
  @DisplayName(
      "Test isPositive(); given CurrencyAmount with currency is AED and amount is ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Money.isPositive()"})
  void testIsPositive_givenCurrencyAmountWithCurrencyIsAedAndAmountIsTen_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Money.of(CurrencyAmount.of(Currency.AED, 10.0d)).isPositive());
  }

  /**
   * Test {@link Money#isPositive()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Money#isPositive()}
   */
  @Test
  @DisplayName("Test isPositive(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Money.isPositive()"})
  void testIsPositive_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Money.of(CurrencyAmount.of(Currency.AED, 1.0E-8d)).isPositive());
  }

  /**
   * Test {@link Money#isNegative()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       -0.5}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Money#isNegative()}
   */
  @Test
  @DisplayName(
      "Test isNegative(); given CurrencyAmount with currency is AED and amount is '-0.5'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Money.isNegative()"})
  void testIsNegative_givenCurrencyAmountWithCurrencyIsAedAndAmountIs05_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Money.of(CurrencyAmount.of(Currency.AED, -0.5d)).isNegative());
  }

  /**
   * Test {@link Money#isNegative()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Money#isNegative()}
   */
  @Test
  @DisplayName("Test isNegative(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Money.isNegative()"})
  void testIsNegative_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Money.of(CurrencyAmount.of(Currency.AED, 10.0d)).isNegative());
  }

  /**
   * Test {@link Money#negated()}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1E+1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#negated()}
   */
  @Test
  @DisplayName("Test negated(); then return Amount is BigDecimal(String) with '-1E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.negated()"})
  void testNegated_thenReturnAmountIsBigDecimalWith1e1() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");
    Money ofResult = Money.of(CurrencyAmount.of(currency, 10.0d));

    // Act
    Money actualNegatedResult = ofResult.negated();

    // Assert
    assertEquals(new BigDecimal("-1E+1"), actualNegatedResult.getAmount());
    assertEquals(ofResult, actualNegatedResult.positive());
    assertSame(currency, actualNegatedResult.getCurrency());
    Money actualNegativeResult = actualNegatedResult.negative();
    assertSame(actualNegatedResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#negated()}.
   *
   * <ul>
   *   <li>Then return {@link Money} with {@link CurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link Money#negated()}
   */
  @Test
  @DisplayName("Test negated(); then return Money with CurrencyAmount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.negated()"})
  void testNegated_thenReturnMoneyWithCurrencyAmount() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 1.0E-8d));

    // Act
    Money actualNegatedResult = ofResult.negated();

    // Assert
    assertSame(ofResult, actualNegatedResult);
  }

  /**
   * Test {@link Money#negated()}.
   *
   * <ul>
   *   <li>Then return Value decimal signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Money#negated()}
   */
  @Test
  @DisplayName("Test negated(); then return Value decimal signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.negated()"})
  void testNegated_thenReturnValueDecimalSignumIsMinusOne() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    Money actualNegatedResult = ofResult.negated();

    // Assert
    Decimal decimalResult = actualNegatedResult.getValue().decimal();
    assertEquals(-1, decimalResult.signum());
    assertFalse(decimalResult.isZero());
    assertEquals(new BigDecimal("-10.00"), actualNegatedResult.getAmount());
    assertEquals(ofResult, actualNegatedResult.positive());
    assertSame(
        actualNegatedResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualNegatedResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    Money actualNegativeResult = actualNegatedResult.negative();
    assertSame(actualNegatedResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#positive()}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code 0.50}.
   * </ul>
   *
   * <p>Method under test: {@link Money#positive()}
   */
  @Test
  @DisplayName("Test positive(); then return Amount is BigDecimal(String) with '0.50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.positive()"})
  void testPositive_thenReturnAmountIsBigDecimalWith050() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, -0.5d));

    // Act
    Money actualPositiveResult = ofResult.positive();

    // Assert
    assertEquals(new BigDecimal("0.50"), actualPositiveResult.getAmount());
    assertEquals(ofResult, actualPositiveResult.negated());
    assertEquals(ofResult, actualPositiveResult.negative());
  }

  /**
   * Test {@link Money#positive()}.
   *
   * <ul>
   *   <li>Then return {@link Money} with {@link CurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link Money#positive()}
   */
  @Test
  @DisplayName("Test positive(); then return Money with CurrencyAmount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.positive()"})
  void testPositive_thenReturnMoneyWithCurrencyAmount() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    Money actualPositiveResult = ofResult.positive();

    // Assert
    assertSame(ofResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#negative()}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1E+1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#negative()}
   */
  @Test
  @DisplayName("Test negative(); then return Amount is BigDecimal(String) with '-1E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.negative()"})
  void testNegative_thenReturnAmountIsBigDecimalWith1e1() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");
    Money ofResult = Money.of(CurrencyAmount.of(currency, 10.0d));

    // Act
    Money actualNegativeResult = ofResult.negative();

    // Assert
    assertEquals(new BigDecimal("-1E+1"), actualNegativeResult.getAmount());
    assertEquals(ofResult, actualNegativeResult.negated());
    assertEquals(ofResult, actualNegativeResult.positive());
    assertSame(currency, actualNegativeResult.getCurrency());
  }

  /**
   * Test {@link Money#negative()}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -10.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#negative()}
   */
  @Test
  @DisplayName("Test negative(); then return Amount is BigDecimal(String) with '-10.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.negative()"})
  void testNegative_thenReturnAmountIsBigDecimalWith1000() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    Money actualNegativeResult = ofResult.negative();

    // Assert
    assertEquals(new BigDecimal("-10.00"), actualNegativeResult.getAmount());
    assertEquals(ofResult, actualNegativeResult.negated());
    assertEquals(ofResult, actualNegativeResult.positive());
  }

  /**
   * Test {@link Money#negative()}.
   *
   * <ul>
   *   <li>Then return {@link Money} with {@link CurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link Money#negative()}
   */
  @Test
  @DisplayName("Test negative(); then return Money with CurrencyAmount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.negative()"})
  void testNegative_thenReturnMoneyWithCurrencyAmount() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 1.0E-8d));

    // Act
    Money actualNegativeResult = ofResult.negative();

    // Assert
    assertSame(ofResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#toCurrencyAmount()}.
   *
   * <ul>
   *   <li>Then return {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is
   *       {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Money#toCurrencyAmount()}
   */
  @Test
  @DisplayName(
      "Test toCurrencyAmount(); then return CurrencyAmount with currency is AED and amount is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount Money.toCurrencyAmount()"})
  void testToCurrencyAmount_thenReturnCurrencyAmountWithCurrencyIsAedAndAmountIs05() {
    // Arrange
    CurrencyAmount currencyAmount = CurrencyAmount.of(Currency.AED, 0.5d);

    // Act and Assert
    assertEquals(currencyAmount, Money.of(currencyAmount).toCurrencyAmount());
  }

  /**
   * Test {@link Money#toCurrencyAmount()}.
   *
   * <ul>
   *   <li>Then return {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link Money#toCurrencyAmount()}
   */
  @Test
  @DisplayName(
      "Test toCurrencyAmount(); then return CurrencyAmount with currency is AED and amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount Money.toCurrencyAmount()"})
  void testToCurrencyAmount_thenReturnCurrencyAmountWithCurrencyIsAedAndAmountIsTen() {
    // Arrange
    CurrencyAmount currencyAmount = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act and Assert
    assertEquals(currencyAmount, Money.of(currencyAmount).toCurrencyAmount());
  }

  /**
   * Test {@link Money#toBigMoney()}.
   *
   * <ul>
   *   <li>Then return not Zero.
   * </ul>
   *
   * <p>Method under test: {@link Money#toBigMoney()}
   */
  @Test
  @DisplayName("Test toBigMoney(); then return not Zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney Money.toBigMoney()"})
  void testToBigMoney_thenReturnNotZero() {
    // Arrange and Act
    BigMoney actualToBigMoneyResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d)).toBigMoney();

    // Assert
    assertFalse(actualToBigMoneyResult.isZero());
    assertEquals(new BigDecimal("10.00"), actualToBigMoneyResult.getAmount());
    BigMoney actualPositiveResult = actualToBigMoneyResult.positive();
    assertSame(actualToBigMoneyResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, BigDecimal)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, BigDecimal) with 'Currency', 'BigDecimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, BigDecimal)"})
  void testConvertedToWithCurrencyBigDecimal() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, new BigDecimal("2.3"));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-23.00");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("23.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, BigDecimal)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, BigDecimal) with 'Currency', 'BigDecimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, BigDecimal)"})
  void testConvertedToWithCurrencyBigDecimal2() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, new BigDecimal("42"));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-420.00");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("420.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, BigDecimal)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, BigDecimal) with 'Currency', 'BigDecimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, BigDecimal)"})
  void testConvertedToWithCurrencyBigDecimal3() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 0.5d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, new BigDecimal("42"));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-21.00");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("21.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <ul>
   *   <li>Then return Value decimal signum is zero.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, BigDecimal) with 'Currency', 'BigDecimal'; then return Value decimal signum is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, BigDecimal)"})
  void testConvertedToWithCurrencyBigDecimal_thenReturnValueDecimalSignumIsZero() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 1.0E-8d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, new BigDecimal("2.3"));

    // Assert
    Decimal decimalResult = actualConvertedToResult.getValue().decimal();
    assertEquals(0, decimalResult.signum());
    assertTrue(actualConvertedToResult.isZero());
    assertTrue(decimalResult.isZero());
    assertEquals(new BigDecimal("0.00"), actualConvertedToResult.getAmount());
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    Decimal actualNegatedResult = decimalResult.negated();
    assertEquals(decimalResult, actualNegatedResult);
    assertSame(
        actualConvertedToResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualConvertedToResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
    Money actualNegatedResult2 = actualConvertedToResult.negated();
    assertSame(actualConvertedToResult, actualNegatedResult2);
    Money actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, BigDecimal) with 'Currency', 'BigDecimal'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, BigDecimal)"})
  void testConvertedToWithCurrencyBigDecimal_thenThrowIllegalArgumentException() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.convertedTo(Currency.AED, new BigDecimal("2.3")));
  }

  /**
   * Test {@link Money#convertedTo(Currency, BigDecimal)} with {@code Currency}, {@code BigDecimal}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, BigDecimal) with 'Currency', 'BigDecimal'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, BigDecimal)"})
  void testConvertedToWithCurrencyBigDecimal_thenThrowIllegalArgumentException2() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.convertedTo(Currency.AED, new BigDecimal("42")));
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 1.0E-8d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.of(42L));

    // Assert
    Decimal decimalResult = actualConvertedToResult.getValue().decimal();
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    Decimal actualNegatedResult = decimalResult.negated();
    assertEquals(decimalResult, actualNegatedResult);
    assertSame(
        actualConvertedToResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualConvertedToResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
    Money actualNegatedResult2 = actualConvertedToResult.negated();
    assertSame(actualConvertedToResult, actualNegatedResult2);
    Money actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal2() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 10.0d));
    Decimal fxRate = Decimal.of(0L);

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, fxRate);

    // Assert
    assertEquals(fxRate, actualConvertedToResult.getValue().decimal());
    assertSame(
        actualConvertedToResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualConvertedToResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
    Money actualNegatedResult = actualConvertedToResult.negated();
    assertSame(actualConvertedToResult, actualNegatedResult);
    Money actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal3() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 0.5d));

    // Act
    Money actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, Decimal.ofScaled(Long.MAX_VALUE, 1));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-461168601842738790.00");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("461168601842738790.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal4() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, -0.5d));

    // Act
    Money actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, Decimal.ofScaled(Long.MAX_VALUE, 1));

    // Assert
    assertEquals(new BigDecimal("-461168601842738790.00"), actualConvertedToResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("461168601842738790.00");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.negative());
    Money actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -14.87}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return Amount is BigDecimal(String) with '-14.87'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnAmountIsBigDecimalWith1487() {
    // Arrange
    Money ofResult =
        Money.of(
            CurrencyAmount.of(
                new Currency("FX rate must be 1 when no conversion required", 66820, "GBP"),
                1.0E-8d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.of(-1486618625L));

    // Assert
    assertEquals(new BigDecimal("-14.87"), actualConvertedToResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("14.87");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.negative());
    Money actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return {@link Money} with {@link CurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return Money with CurrencyAmount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnMoneyWithCurrencyAmount() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.of(1L));

    // Assert
    assertSame(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return negated Amount is BigDecimal(String) with '-1.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnNegatedAmountIsBigDecimalWith100() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.ofScaled(1L, 1));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-1.00");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -21.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return negated Amount is BigDecimal(String) with '-21.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnNegatedAmountIsBigDecimalWith2100() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 0.5d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.of(42L));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-21.00");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("21.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -420.00}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return negated Amount is BigDecimal(String) with '-420.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnNegatedAmountIsBigDecimalWith42000() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.of(42L));

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-420.00");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("420.00"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then return Value decimal abs is Value decimal.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then return Value decimal abs is Value decimal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenReturnValueDecimalAbsIsValueDecimal() {
    // Arrange
    Money ofResult =
        Money.of(
            CurrencyAmount.of(
                new Currency("FX rate must be 1 when no conversion required", 66820, "GBP"),
                1.0E-8d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, Decimal.of(42L));

    // Assert
    Decimal decimalResult = actualConvertedToResult.getValue().decimal();
    Decimal actualAbsResult = decimalResult.abs();
    assertEquals(decimalResult, actualAbsResult);
    Decimal actualNegatedResult = decimalResult.negated();
    assertEquals(decimalResult, actualNegatedResult);
    assertSame(
        actualConvertedToResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualConvertedToResult
            .getCurrency()
            .getTriangulationCurrency()
            .getTriangulationCurrency());
    Money actualNegatedResult2 = actualConvertedToResult.negated();
    assertSame(actualConvertedToResult, actualNegatedResult2);
    Money actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenThrowIllegalArgumentException() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.convertedTo(Currency.AED, Decimal.of(42L)));
  }

  /**
   * Test {@link Money#convertedTo(Currency, Decimal)} with {@code Currency}, {@code Decimal}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, Decimal)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, Decimal) with 'Currency', 'Decimal'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, Decimal)"})
  void testConvertedToWithCurrencyDecimal_thenThrowIllegalArgumentException2() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.convertedTo(Currency.AED, Decimal.ofScaled(1L, 1)));
  }

  /**
   * Test {@link Money#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 0.5d));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(10.0d);

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(0.5d), isA(Currency.class), isA(Currency.class));
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider2() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(0.5d);

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
    BigDecimal expectedAmount = new BigDecimal("-0.50");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    BigDecimal expectedAmount2 = new BigDecimal("-0.50");
    Money negativeResult = actualConvertedToResult.negative();
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
   * Test {@link Money#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider3() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(0.5d);

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.CLP, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
    BigDecimal expectedAmount = new BigDecimal("-1");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1"), actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    assertEquals(negatedResult, actualConvertedToResult.negative());
    Money actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
    Money actualNegativeResult = negatedResult.negative();
    assertSame(negatedResult, actualNegativeResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'; then return Amount is BigDecimal(String) with '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider_thenReturnAmountIsBigDecimalWith1() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(-0.5d);

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.CLP, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
    assertEquals(new BigDecimal("-1"), actualConvertedToResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("1");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negative());
    assertEquals(negatedResult, actualConvertedToResult.positive());
    Money actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
    Money actualPositiveResult = negatedResult.positive();
    assertSame(negatedResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -0.50}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'; then return Amount is BigDecimal(String) with '-0.50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider_thenReturnAmountIsBigDecimalWith050() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(-0.5d);

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
    assertEquals(new BigDecimal("-0.50"), actualConvertedToResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("0.50");
    Money negatedResult = actualConvertedToResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negative());
    assertEquals(negatedResult, actualConvertedToResult.positive());
    Money actualNegativeResult = actualConvertedToResult.negative();
    assertSame(actualConvertedToResult, actualNegativeResult);
    Money actualPositiveResult = negatedResult.positive();
    assertSame(negatedResult, actualPositiveResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <ul>
   *   <li>Then return {@link Money} with {@link CurrencyAmount}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'; then return Money with CurrencyAmount")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider_thenReturnMoneyWithCurrencyAmount() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.AED, 10.0d));

    // Act
    Money actualConvertedToResult = ofResult.convertedTo(Currency.AED, mock(FxRateProvider.class));

    // Assert
    assertSame(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link Money#convertedTo(Currency, FxRateProvider)} with {@code Currency}, {@code
   * FxRateProvider}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link Money#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider) with 'Currency', 'FxRateProvider'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money Money.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithCurrencyFxRateProvider_thenThrowIllegalArgumentException() {
    // Arrange
    Money ofResult = Money.of(CurrencyAmount.of(Currency.ARS, 10.0d));

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.convertedTo(Currency.AED, rateProvider));
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
  }
}
