package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
import java.util.function.DoubleUnaryOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CurrencyAmountDiffblueTest {
  /**
   * Test {@link CurrencyAmount#zero(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return Amount is zero.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#zero(Currency)}
   */
  @Test
  @DisplayName("Test zero(Currency); when AED; then return Amount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.zero(Currency)"})
  void testZero_whenAed_thenReturnAmountIsZero() {
    // Arrange and Act
    CurrencyAmount actualZeroResult = CurrencyAmount.zero(Currency.AED);

    // Assert
    assertEquals(0.0d, actualZeroResult.getAmount());
    assertFalse(actualZeroResult.isNegative());
    assertFalse(actualZeroResult.isPositive());
    assertTrue(actualZeroResult.isZero());
    CurrencyAmount actualNegatedResult = actualZeroResult.negated();
    assertEquals(actualZeroResult, actualNegatedResult);
    CurrencyAmount actualNegativeResult = actualZeroResult.negative();
    assertSame(actualZeroResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = actualZeroResult.positive();
    assertSame(actualZeroResult, actualPositiveResult);
    assertSame(Currency.AED, actualZeroResult.getCurrency());
  }

  /**
   * Test {@link CurrencyAmount#of(Currency, double)} with {@code currency}, {@code amount}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return Amount is ten.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#of(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test of(Currency, double) with 'currency', 'amount'; when AED; then return Amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.of(Currency, double)"})
  void testOfWithCurrencyAmount_whenAed_thenReturnAmountIsTen() {
    // Arrange and Act
    CurrencyAmount actualOfResult = CurrencyAmount.of(Currency.AED, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getAmount());
    assertFalse(actualOfResult.isNegative());
    assertFalse(actualOfResult.isZero());
    assertTrue(actualOfResult.isPositive());
    CurrencyAmount actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
    assertSame(Currency.AED, actualOfResult.getCurrency());
  }

  /**
   * Test {@link CurrencyAmount#of(String, double)} with {@code currencyCode}, {@code amount}.
   *
   * <ul>
   *   <li>When {@code GBP}.
   *   <li>Then return Amount is ten.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#of(String, double)}
   */
  @Test
  @DisplayName(
      "Test of(String, double) with 'currencyCode', 'amount'; when 'GBP'; then return Amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.of(String, double)"})
  void testOfWithCurrencyCodeAmount_whenGbp_thenReturnAmountIsTen() {
    // Arrange and Act
    CurrencyAmount actualOfResult = CurrencyAmount.of("GBP", 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getAmount());
    assertFalse(actualOfResult.isNegative());
    assertFalse(actualOfResult.isZero());
    assertTrue(actualOfResult.isPositive());
    CurrencyAmount actualPositiveResult = actualOfResult.positive();
    assertSame(actualOfResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#parse(String)}.
   *
   * <ul>
   *   <li>When {@code 10}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when '10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.parse(String)"})
  void testParse_when10() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CurrencyAmount.parse("10"));
  }

  /**
   * Test {@link CurrencyAmount#parse(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.parse(String)"})
  void testParse_whenNull() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CurrencyAmount.parse(null));
  }

  /**
   * Test {@link CurrencyAmount#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Unable to parse amount, invalid format:}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Unable to parse amount, invalid format:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.parse(String)"})
  void testParse_whenUnableToParseAmountInvalidFormat() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> CurrencyAmount.parse("Unable to parse amount, invalid format: "));
  }

  /**
   * Test {@link CurrencyAmount#plus(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return Amount is twenty.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#plus(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test plus(CurrencyAmount) with 'CurrencyAmount'; then return Amount is twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.plus(CurrencyAmount)"})
  void testPlusWithCurrencyAmount_thenReturnAmountIsTwenty() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    CurrencyAmount actualPlusResult = ofResult.plus(CurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    assertEquals(20.0d, actualPlusResult.getAmount());
    assertFalse(actualPlusResult.isNegative());
    assertFalse(actualPlusResult.isZero());
    assertTrue(actualPlusResult.isPositive());
    CurrencyAmount actualPositiveResult = actualPlusResult.positive();
    assertSame(actualPlusResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#plus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return Amount is twenty.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#plus(double)}
   */
  @Test
  @DisplayName("Test plus(double) with 'double'; then return Amount is twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.plus(double)"})
  void testPlusWithDouble_thenReturnAmountIsTwenty() {
    // Arrange and Act
    CurrencyAmount actualPlusResult = CurrencyAmount.of(Currency.AED, 10.0d).plus(10.0d);

    // Assert
    assertEquals(20.0d, actualPlusResult.getAmount());
    assertFalse(actualPlusResult.isNegative());
    assertFalse(actualPlusResult.isZero());
    assertTrue(actualPlusResult.isPositive());
    CurrencyAmount actualPositiveResult = actualPlusResult.positive();
    assertSame(actualPlusResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#minus(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#minus(CurrencyAmount)}
   */
  @Test
  @DisplayName(
      "Test minus(CurrencyAmount) with 'CurrencyAmount'; then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.minus(CurrencyAmount)"})
  void testMinusWithCurrencyAmount_thenReturnCurrencyCodeIsAed() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    CurrencyAmount actualMinusResult = ofResult.minus(CurrencyAmount.of(Currency.AED, 10.0d));

    // Assert
    Currency currency = actualMinusResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    assertEquals(0.0d, actualMinusResult.getAmount());
    assertEquals(2, currency.getMinorUnitDigits());
    assertFalse(actualMinusResult.isNegative());
    assertFalse(actualMinusResult.isPositive());
    assertTrue(actualMinusResult.isZero());
    CurrencyAmount actualNegatedResult = actualMinusResult.negated();
    assertEquals(actualMinusResult, actualNegatedResult);
    CurrencyAmount actualNegativeResult = actualMinusResult.negative();
    assertSame(actualMinusResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = actualMinusResult.positive();
    assertSame(actualMinusResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#minus(double)} with {@code double}.
   *
   * <ul>
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#minus(double)}
   */
  @Test
  @DisplayName("Test minus(double) with 'double'; then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.minus(double)"})
  void testMinusWithDouble_thenReturnCurrencyCodeIsAed() {
    // Arrange and Act
    CurrencyAmount actualMinusResult = CurrencyAmount.of(Currency.AED, 10.0d).minus(10.0d);

    // Assert
    Currency currency = actualMinusResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    assertEquals(0.0d, actualMinusResult.getAmount());
    assertEquals(2, currency.getMinorUnitDigits());
    assertFalse(actualMinusResult.isNegative());
    assertFalse(actualMinusResult.isPositive());
    assertTrue(actualMinusResult.isZero());
    CurrencyAmount actualNegatedResult = actualMinusResult.negated();
    assertEquals(actualMinusResult, actualNegatedResult);
    CurrencyAmount actualNegativeResult = actualMinusResult.negative();
    assertSame(actualMinusResult, actualNegativeResult);
    CurrencyAmount actualPositiveResult = actualMinusResult.positive();
    assertSame(actualMinusResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#multipliedBy(double)}.
   *
   * <ul>
   *   <li>Then return Amount is one hundred.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#multipliedBy(double)}
   */
  @Test
  @DisplayName("Test multipliedBy(double); then return Amount is one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.multipliedBy(double)"})
  void testMultipliedBy_thenReturnAmountIsOneHundred() {
    // Arrange and Act
    CurrencyAmount actualMultipliedByResult =
        CurrencyAmount.of(Currency.AED, 10.0d).multipliedBy(10.0d);

    // Assert
    assertEquals(100.0d, actualMultipliedByResult.getAmount());
    assertFalse(actualMultipliedByResult.isNegative());
    assertFalse(actualMultipliedByResult.isZero());
    assertTrue(actualMultipliedByResult.isPositive());
    CurrencyAmount actualPositiveResult = actualMultipliedByResult.positive();
    assertSame(actualMultipliedByResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#mapAmount(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#mapAmount(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAmount(DoubleUnaryOperator); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.mapAmount(DoubleUnaryOperator)"})
  void testMapAmount_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    DoubleUnaryOperator mapper = mock(DoubleUnaryOperator.class);
    when(mapper.applyAsDouble(anyDouble())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.mapAmount(mapper));
    verify(mapper).applyAsDouble(10.0d);
  }

  /**
   * Test {@link CurrencyAmount#mapAmount(DoubleUnaryOperator)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#mapAmount(DoubleUnaryOperator)}
   */
  @Test
  @DisplayName(
      "Test mapAmount(DoubleUnaryOperator); given ten; then return CurrencyAmount with currency is AED and amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.mapAmount(DoubleUnaryOperator)"})
  void testMapAmount_givenTen_thenReturnCurrencyAmountWithCurrencyIsAedAndAmountIsTen() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    DoubleUnaryOperator mapper = mock(DoubleUnaryOperator.class);
    when(mapper.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    CurrencyAmount actualMapAmountResult = ofResult.mapAmount(mapper);

    // Assert
    verify(mapper).applyAsDouble(10.0d);
    assertEquals(ofResult, actualMapAmountResult);
  }

  /**
   * Test {@link CurrencyAmount#isZero()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is ten.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#isZero()}
   */
  @Test
  @DisplayName(
      "Test isZero(); given CurrencyAmount with currency is AED and amount is ten; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyAmount.isZero()"})
  void testIsZero_givenCurrencyAmountWithCurrencyIsAedAndAmountIsTen_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CurrencyAmount.of(Currency.AED, 10.0d).isZero());
  }

  /**
   * Test {@link CurrencyAmount#isZero()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is zero.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#isZero()}
   */
  @Test
  @DisplayName(
      "Test isZero(); given CurrencyAmount with currency is AED and amount is zero; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyAmount.isZero()"})
  void testIsZero_givenCurrencyAmountWithCurrencyIsAedAndAmountIsZero_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurrencyAmount.of(Currency.AED, 0.0d).isZero());
  }

  /**
   * Test {@link CurrencyAmount#isPositive()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is ten.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#isPositive()}
   */
  @Test
  @DisplayName(
      "Test isPositive(); given CurrencyAmount with currency is AED and amount is ten; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyAmount.isPositive()"})
  void testIsPositive_givenCurrencyAmountWithCurrencyIsAedAndAmountIsTen_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurrencyAmount.of(Currency.AED, 10.0d).isPositive());
  }

  /**
   * Test {@link CurrencyAmount#isPositive()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#isPositive()}
   */
  @Test
  @DisplayName("Test isPositive(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyAmount.isPositive()"})
  void testIsPositive_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CurrencyAmount.of(Currency.AED, 0.0d).isPositive());
  }

  /**
   * Test {@link CurrencyAmount#isNegative()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is {@code
   *       -0.5}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#isNegative()}
   */
  @Test
  @DisplayName(
      "Test isNegative(); given CurrencyAmount with currency is AED and amount is '-0.5'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyAmount.isNegative()"})
  void testIsNegative_givenCurrencyAmountWithCurrencyIsAedAndAmountIs05_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurrencyAmount.of(Currency.AED, -0.5d).isNegative());
  }

  /**
   * Test {@link CurrencyAmount#isNegative()}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#isNegative()}
   */
  @Test
  @DisplayName("Test isNegative(); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyAmount.isNegative()"})
  void testIsNegative_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CurrencyAmount.of(Currency.AED, 10.0d).isNegative());
  }

  /**
   * Test {@link CurrencyAmount#negated()}.
   *
   * <ul>
   *   <li>Then return Currency Code is {@code AED}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#negated()}
   */
  @Test
  @DisplayName("Test negated(); then return Currency Code is 'AED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.negated()"})
  void testNegated_thenReturnCurrencyCodeIsAed() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    CurrencyAmount actualNegatedResult = ofResult.negated();

    // Assert
    Currency currency = actualNegatedResult.getCurrency();
    assertEquals("AED", currency.getCode());
    assertEquals("AED", currency.toString());
    assertEquals(-10.0d, actualNegatedResult.getAmount());
    assertEquals(2, currency.getMinorUnitDigits());
    assertFalse(actualNegatedResult.isPositive());
    assertFalse(actualNegatedResult.isZero());
    assertTrue(actualNegatedResult.isNegative());
    assertEquals(ofResult, actualNegatedResult.positive());
    CurrencyAmount actualNegativeResult = actualNegatedResult.negative();
    assertSame(actualNegatedResult, actualNegativeResult);
  }

  /**
   * Test {@link CurrencyAmount#positive()}.
   *
   * <ul>
   *   <li>Then return Amount is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#positive()}
   */
  @Test
  @DisplayName("Test positive(); then return Amount is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.positive()"})
  void testPositive_thenReturnAmountIs05() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, -0.5d);

    // Act
    CurrencyAmount actualPositiveResult = ofResult.positive();

    // Assert
    assertEquals(0.5d, actualPositiveResult.getAmount());
    assertEquals(ofResult, actualPositiveResult.negated());
    assertEquals(ofResult, actualPositiveResult.negative());
  }

  /**
   * Test {@link CurrencyAmount#positive()}.
   *
   * <ul>
   *   <li>Then return {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is
   *       ten.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#positive()}
   */
  @Test
  @DisplayName("Test positive(); then return CurrencyAmount with currency is AED and amount is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.positive()"})
  void testPositive_thenReturnCurrencyAmountWithCurrencyIsAedAndAmountIsTen() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    CurrencyAmount actualPositiveResult = ofResult.positive();

    // Assert
    assertSame(ofResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#negative()}.
   *
   * <ul>
   *   <li>Then return Amount is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#negative()}
   */
  @Test
  @DisplayName("Test negative(); then return Amount is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.negative()"})
  void testNegative_thenReturnAmountIsMinusTen() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    CurrencyAmount actualNegativeResult = ofResult.negative();

    // Assert
    assertEquals(-10.0d, actualNegativeResult.getAmount());
    assertFalse(actualNegativeResult.isZero());
    assertTrue(actualNegativeResult.isNegative());
    assertEquals(ofResult, actualNegativeResult.negated());
    assertEquals(ofResult, actualNegativeResult.positive());
  }

  /**
   * Test {@link CurrencyAmount#negative()}.
   *
   * <ul>
   *   <li>Then return {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is
   *       zero.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#negative()}
   */
  @Test
  @DisplayName(
      "Test negative(); then return CurrencyAmount with currency is AED and amount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.negative()"})
  void testNegative_thenReturnCurrencyAmountWithCurrencyIsAedAndAmountIsZero() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 0.0d);

    // Act
    CurrencyAmount actualNegativeResult = ofResult.negative();

    // Assert
    assertSame(ofResult, actualNegativeResult);
  }

  /**
   * Test {@link CurrencyAmount#toMoney()}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return Amount is BigDecimal(String) with '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money CurrencyAmount.toMoney()"})
  void testToMoney_thenReturnAmountIsBigDecimalWith1() {
    // Arrange and Act
    Money actualToMoneyResult = CurrencyAmount.of(Currency.CLP, -0.5d).toMoney();

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
   * Test {@link CurrencyAmount#toMoney()}.
   *
   * <ul>
   *   <li>Then return Amount is {@link BigDecimal#BigDecimal(String)} with {@code -0.50}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return Amount is BigDecimal(String) with '-0.50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money CurrencyAmount.toMoney()"})
  void testToMoney_thenReturnAmountIsBigDecimalWith050() {
    // Arrange and Act
    Money actualToMoneyResult = CurrencyAmount.of(Currency.AED, -0.5d).toMoney();

    // Assert
    assertEquals(new BigDecimal("-0.50"), actualToMoneyResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("0.50");
    Money negatedResult = actualToMoneyResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualToMoneyResult, negatedResult.negated());
    assertEquals(actualToMoneyResult, negatedResult.negative());
    Money actualNegativeResult = actualToMoneyResult.negative();
    assertSame(actualToMoneyResult, actualNegativeResult);
  }

  /**
   * Test {@link CurrencyAmount#toMoney()}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return negated Amount is BigDecimal(String) with '-1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money CurrencyAmount.toMoney()"})
  void testToMoney_thenReturnNegatedAmountIsBigDecimalWith1() {
    // Arrange and Act
    Money actualToMoneyResult = CurrencyAmount.of(Currency.CLP, 0.5d).toMoney();

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
   * Test {@link CurrencyAmount#toMoney()}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -1E+1}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return negated Amount is BigDecimal(String) with '-1E+1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money CurrencyAmount.toMoney()"})
  void testToMoney_thenReturnNegatedAmountIsBigDecimalWith1e1() {
    // Arrange
    Currency currency = new Currency("currency", -1, "GBP");

    // Act
    Money actualToMoneyResult = CurrencyAmount.of(currency, 10.0d).toMoney();

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
   * Test {@link CurrencyAmount#toMoney()}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -0.50}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return negated Amount is BigDecimal(String) with '-0.50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money CurrencyAmount.toMoney()"})
  void testToMoney_thenReturnNegatedAmountIsBigDecimalWith050() {
    // Arrange and Act
    Money actualToMoneyResult = CurrencyAmount.of(Currency.AED, 0.5d).toMoney();

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-0.50");
    Money negatedResult = actualToMoneyResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("0.50"), actualToMoneyResult.getAmount());
    assertEquals(actualToMoneyResult, negatedResult.negated());
    assertEquals(actualToMoneyResult, negatedResult.positive());
    Money actualPositiveResult = actualToMoneyResult.positive();
    assertSame(actualToMoneyResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#toMoney()}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -10.00}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return negated Amount is BigDecimal(String) with '-10.00'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money CurrencyAmount.toMoney()"})
  void testToMoney_thenReturnNegatedAmountIsBigDecimalWith1000() {
    // Arrange and Act
    Money actualToMoneyResult = CurrencyAmount.of(Currency.AED, 10.0d).toMoney();

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
   * Test {@link CurrencyAmount#toMoney()}.
   *
   * <ul>
   *   <li>Then return Value decimal signum is zero.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toMoney()}
   */
  @Test
  @DisplayName("Test toMoney(); then return Value decimal signum is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Money CurrencyAmount.toMoney()"})
  void testToMoney_thenReturnValueDecimalSignumIsZero() {
    // Arrange and Act
    Money actualToMoneyResult = CurrencyAmount.of(Currency.AED, 1.0E-8d).toMoney();

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
    assertSame(
        actualToMoneyResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency(),
        actualToMoneyResult.getCurrency().getTriangulationCurrency().getTriangulationCurrency());
    Money actualNegatedResult2 = actualToMoneyResult.negated();
    assertSame(actualToMoneyResult, actualNegatedResult2);
    Money actualNegativeResult = actualToMoneyResult.negative();
    assertSame(actualToMoneyResult, actualNegativeResult);
    Money actualPositiveResult = actualToMoneyResult.positive();
    assertSame(actualToMoneyResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#toBigMoney()}.
   *
   * <ul>
   *   <li>Then return negated Amount is {@link BigDecimal#BigDecimal(String)} with {@code -0.50}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toBigMoney()}
   */
  @Test
  @DisplayName("Test toBigMoney(); then return negated Amount is BigDecimal(String) with '-0.50'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney CurrencyAmount.toBigMoney()"})
  void testToBigMoney_thenReturnNegatedAmountIsBigDecimalWith050() {
    // Arrange and Act
    BigMoney actualToBigMoneyResult = CurrencyAmount.of(Currency.AED, 0.5d).toBigMoney();

    // Assert
    BigDecimal expectedAmount = new BigDecimal("-0.50");
    BigMoney negatedResult = actualToBigMoneyResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("0.50"), actualToBigMoneyResult.getAmount());
    Decimal value = actualToBigMoneyResult.getValue();
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualToBigMoneyResult, negatedResult.negated());
    assertEquals(actualToBigMoneyResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualToBigMoneyResult.positive();
    assertSame(actualToBigMoneyResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#toBigMoney()}.
   *
   * <ul>
   *   <li>Then return Value scale is eight.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toBigMoney()}
   */
  @Test
  @DisplayName("Test toBigMoney(); then return Value scale is eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney CurrencyAmount.toBigMoney()"})
  void testToBigMoney_thenReturnValueScaleIsEight() {
    // Arrange and Act
    BigMoney actualToBigMoneyResult = CurrencyAmount.of(Currency.AED, 1.0E-8d).toBigMoney();

    // Assert
    Decimal value = actualToBigMoneyResult.getValue();
    assertEquals(8, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-1E-8");
    BigMoney negatedResult = actualToBigMoneyResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("1E-8"), actualToBigMoneyResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualToBigMoneyResult, negatedResult.negated());
    assertEquals(actualToBigMoneyResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualToBigMoneyResult.positive();
    assertSame(actualToBigMoneyResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#toBigMoney()}.
   *
   * <ul>
   *   <li>Then return Value scale is zero.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toBigMoney()}
   */
  @Test
  @DisplayName("Test toBigMoney(); then return Value scale is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney CurrencyAmount.toBigMoney()"})
  void testToBigMoney_thenReturnValueScaleIsZero() {
    // Arrange and Act
    BigMoney actualToBigMoneyResult = CurrencyAmount.of(Currency.AED, 10.0d).toBigMoney();

    // Assert
    Decimal value = actualToBigMoneyResult.getValue();
    assertEquals(0, value.scale());
    BigDecimal expectedAmount = new BigDecimal("-10.00");
    BigMoney negatedResult = actualToBigMoneyResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(new BigDecimal("10.00"), actualToBigMoneyResult.getAmount());
    Decimal actualAbsResult = value.abs();
    assertEquals(value, actualAbsResult);
    assertEquals(actualToBigMoneyResult, negatedResult.negated());
    assertEquals(actualToBigMoneyResult, negatedResult.positive());
    BigMoney actualPositiveResult = actualToBigMoneyResult.positive();
    assertSame(actualToBigMoneyResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#toBigMoney()}.
   *
   * <ul>
   *   <li>Then return Value signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toBigMoney()}
   */
  @Test
  @DisplayName("Test toBigMoney(); then return Value signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigMoney CurrencyAmount.toBigMoney()"})
  void testToBigMoney_thenReturnValueSignumIsMinusOne() {
    // Arrange and Act
    BigMoney actualToBigMoneyResult = CurrencyAmount.of(Currency.AED, -0.5d).toBigMoney();

    // Assert
    assertEquals(-1, actualToBigMoneyResult.getValue().signum());
    assertEquals(new BigDecimal("-0.50"), actualToBigMoneyResult.getAmount());
    BigDecimal expectedAmount = new BigDecimal("0.50");
    BigMoney negatedResult = actualToBigMoneyResult.negated();
    assertEquals(expectedAmount, negatedResult.getAmount());
    assertEquals(actualToBigMoneyResult, negatedResult.negated());
    assertEquals(actualToBigMoneyResult, negatedResult.negative());
    BigMoney actualNegativeResult = actualToBigMoneyResult.negative();
    assertSame(actualToBigMoneyResult, actualNegativeResult);
  }

  /**
   * Test {@link CurrencyAmount#convertedTo(Currency, double)} with {@code resultCurrency}, {@code
   * fxRate}.
   *
   * <p>Method under test: {@link CurrencyAmount#convertedTo(Currency, double)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, double) with 'resultCurrency', 'fxRate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.convertedTo(Currency, double)"})
  void testConvertedToWithResultCurrencyFxRate() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    CurrencyAmount actualConvertedToResult = ofResult.convertedTo(Currency.AED, 1.0d);

    // Assert
    assertSame(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link CurrencyAmount#convertedTo(Currency, double)} with {@code resultCurrency}, {@code
   * fxRate}.
   *
   * <ul>
   *   <li>Then return negated Amount is minus one hundred.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#convertedTo(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, double) with 'resultCurrency', 'fxRate'; then return negated Amount is minus one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.convertedTo(Currency, double)"})
  void testConvertedToWithResultCurrencyFxRate_thenReturnNegatedAmountIsMinusOneHundred() {
    // Arrange and Act
    CurrencyAmount actualConvertedToResult =
        CurrencyAmount.of(Currency.ARS, 10.0d).convertedTo(Currency.AED, 10.0d);

    // Assert
    CurrencyAmount negatedResult = actualConvertedToResult.negated();
    assertEquals(-100.0d, negatedResult.getAmount());
    assertEquals(100.0d, actualConvertedToResult.getAmount());
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    CurrencyAmount actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#convertedTo(Currency, double)} with {@code resultCurrency}, {@code
   * fxRate}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#convertedTo(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, double) with 'resultCurrency', 'fxRate'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.convertedTo(Currency, double)"})
  void testConvertedToWithResultCurrencyFxRate_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> CurrencyAmount.of(Currency.AED, 10.0d).convertedTo(Currency.AED, 10.0d));
  }

  /**
   * Test {@link CurrencyAmount#convertedTo(Currency, double)} with {@code resultCurrency}, {@code
   * fxRate}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#convertedTo(Currency, double)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, double) with 'resultCurrency', 'fxRate'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.convertedTo(Currency, double)"})
  void testConvertedToWithResultCurrencyFxRate_thenThrowIllegalArgumentException2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> CurrencyAmount.of(Currency.AED, 10.0d).convertedTo(Currency.AED, Double.NaN));
  }

  /**
   * Test {@link CurrencyAmount#convertedTo(Currency, FxRateProvider)} with {@code resultCurrency},
   * {@code rateProvider}.
   *
   * <p>Method under test: {@link CurrencyAmount#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider) with 'resultCurrency', 'rateProvider'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithResultCurrencyRateProvider() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act
    CurrencyAmount actualConvertedToResult =
        ofResult.convertedTo(Currency.AED, mock(FxRateProvider.class));

    // Assert
    assertSame(ofResult, actualConvertedToResult);
  }

  /**
   * Test {@link CurrencyAmount#convertedTo(Currency, FxRateProvider)} with {@code resultCurrency},
   * {@code rateProvider}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then calls {@link FxRateProvider#convert(double, Currency, Currency)}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider) with 'resultCurrency', 'rateProvider'; given ten; then calls convert(double, Currency, Currency)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithResultCurrencyRateProvider_givenTen_thenCallsConvert() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.ARS, 10.0d);

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenReturn(10.0d);

    // Act
    CurrencyAmount actualConvertedToResult = ofResult.convertedTo(Currency.AED, rateProvider);

    // Assert
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
    CurrencyAmount negatedResult = actualConvertedToResult.negated();
    assertEquals(actualConvertedToResult, negatedResult.negated());
    assertEquals(actualConvertedToResult, negatedResult.positive());
    CurrencyAmount actualPositiveResult = actualConvertedToResult.positive();
    assertSame(actualConvertedToResult, actualPositiveResult);
  }

  /**
   * Test {@link CurrencyAmount#convertedTo(Currency, FxRateProvider)} with {@code resultCurrency},
   * {@code rateProvider}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider) with 'resultCurrency', 'rateProvider'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyAmount CurrencyAmount.convertedTo(Currency, FxRateProvider)"})
  void testConvertedToWithResultCurrencyRateProvider_thenThrowIllegalArgumentException() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.ARS, 10.0d);

    FxRateProvider rateProvider = mock(FxRateProvider.class);
    when(rateProvider.convert(anyDouble(), Mockito.<Currency>any(), Mockito.<Currency>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.convertedTo(Currency.AED, rateProvider));
    verify(rateProvider).convert(eq(10.0d), isA(Currency.class), isA(Currency.class));
  }

  /**
   * Test {@link CurrencyAmount#compareTo(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#compareTo(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test compareTo(CurrencyAmount) with 'CurrencyAmount'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CurrencyAmount.compareTo(CurrencyAmount)"})
  void testCompareToWithCurrencyAmount_thenReturnMinusOne() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act and Assert
    assertEquals(-1, ofResult.compareTo(CurrencyAmount.of(Currency.ARS, 10.0d)));
  }

  /**
   * Test {@link CurrencyAmount#compareTo(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#compareTo(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test compareTo(CurrencyAmount) with 'CurrencyAmount'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CurrencyAmount.compareTo(CurrencyAmount)"})
  void testCompareToWithCurrencyAmount_thenReturnOne() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.ARS, 10.0d);

    // Act and Assert
    assertEquals(1, ofResult.compareTo(CurrencyAmount.of(Currency.AED, 10.0d)));
  }

  /**
   * Test {@link CurrencyAmount#compareTo(CurrencyAmount)} with {@code CurrencyAmount}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#compareTo(CurrencyAmount)}
   */
  @Test
  @DisplayName("Test compareTo(CurrencyAmount) with 'CurrencyAmount'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CurrencyAmount.compareTo(CurrencyAmount)"})
  void testCompareToWithCurrencyAmount_thenReturnZero() {
    // Arrange
    CurrencyAmount ofResult = CurrencyAmount.of(Currency.AED, 10.0d);

    // Act and Assert
    assertEquals(0, ofResult.compareTo(CurrencyAmount.of(Currency.AED, 10.0d)));
  }

  /**
   * Test {@link CurrencyAmount#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyAmount.equals(Object)", "int CurrencyAmount.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurrencyAmount.of(Currency.AED, 10.0d), "Obj");
  }

  /**
   * Test {@link CurrencyAmount#toString()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyAmount} with currency is {@link Currency#AED} and amount is ten.
   *   <li>Then return {@code AED 10}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toString()}
   */
  @Test
  @DisplayName(
      "Test toString(); given CurrencyAmount with currency is AED and amount is ten; then return 'AED 10'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CurrencyAmount.toString()"})
  void testToString_givenCurrencyAmountWithCurrencyIsAedAndAmountIsTen_thenReturnAed10() {
    // Arrange, Act and Assert
    assertEquals("AED 10", CurrencyAmount.of(Currency.AED, 10.0d).toString());
  }

  /**
   * Test {@link CurrencyAmount#toString()}.
   *
   * <ul>
   *   <li>Then return {@code AED 1.0E-8}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyAmount#toString()}
   */
  @Test
  @DisplayName("Test toString(); then return 'AED 1.0E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CurrencyAmount.toString()"})
  void testToString_thenReturnAed10e8() {
    // Arrange, Act and Assert
    assertEquals("AED 1.0E-8", CurrencyAmount.of(Currency.AED, 1.0E-8d).toString());
  }
}
