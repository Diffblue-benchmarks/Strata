package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.Decimal;
import java.math.BigDecimal;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurrencyDiffblueTest {
  /**
   * Test {@link Currency#getAvailableCurrencies()}.
   *
   * <p>Method under test: {@link Currency#getAvailableCurrencies()}
   */
  @Test
  @DisplayName("Test getAvailableCurrencies()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set Currency.getAvailableCurrencies()"})
  void testGetAvailableCurrencies() {
    // Arrange and Act
    Set<Currency> actualAvailableCurrencies = Currency.getAvailableCurrencies();

    // Assert
    assertEquals(55, actualAvailableCurrencies.size());
  }

  /**
   * Test {@link Currency#of(String)}.
   *
   * <ul>
   *   <li>When {@code GBP}.
   *   <li>Then return Code is {@code GBP}.
   * </ul>
   *
   * <p>Method under test: {@link Currency#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'GBP'; then return Code is 'GBP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency Currency.of(String)"})
  void testOf_whenGbp_thenReturnCodeIsGbp() {
    // Arrange and Act
    Currency actualOfResult = Currency.of("GBP");

    // Assert
    assertEquals("GBP", actualOfResult.getCode());
    assertEquals("GBP", actualOfResult.toString());
    Currency triangulationCurrency = actualOfResult.getTriangulationCurrency();
    assertEquals("USD", triangulationCurrency.getCode());
    assertEquals("USD", triangulationCurrency.toString());
    assertEquals(2, triangulationCurrency.getMinorUnitDigits());
    assertSame(Currency.USD, triangulationCurrency.getTriangulationCurrency());
  }

  /**
   * Test {@link Currency#of(String)}.
   *
   * <ul>
   *   <li>When {@code USD}.
   *   <li>Then return Code is {@code USD}.
   * </ul>
   *
   * <p>Method under test: {@link Currency#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'USD'; then return Code is 'USD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency Currency.of(String)"})
  void testOf_whenUsd_thenReturnCodeIsUsd() {
    // Arrange and Act
    Currency actualOfResult = Currency.of("USD");

    // Assert
    assertEquals("USD", actualOfResult.getCode());
    assertEquals("USD", actualOfResult.toString());
    assertEquals(2, actualOfResult.getMinorUnitDigits());
    assertSame(Currency.USD, actualOfResult.getTriangulationCurrency());
  }

  /**
   * Test {@link Currency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code GBP}.
   *   <li>Then return Code is {@code GBP}.
   * </ul>
   *
   * <p>Method under test: {@link Currency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'GBP'; then return Code is 'GBP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency Currency.parse(String)"})
  void testParse_whenGbp_thenReturnCodeIsGbp() {
    // Arrange and Act
    Currency actualParseResult = Currency.parse("GBP");

    // Assert
    assertEquals("GBP", actualParseResult.getCode());
    assertEquals("GBP", actualParseResult.toString());
    Currency triangulationCurrency = actualParseResult.getTriangulationCurrency();
    assertEquals("USD", triangulationCurrency.getCode());
    assertEquals("USD", triangulationCurrency.toString());
    assertEquals(2, triangulationCurrency.getMinorUnitDigits());
    assertSame(Currency.USD, triangulationCurrency.getTriangulationCurrency());
  }

  /**
   * Test {@link Currency#parse(String)}.
   *
   * <ul>
   *   <li>When {@code USD}.
   *   <li>Then return Code is {@code USD}.
   * </ul>
   *
   * <p>Method under test: {@link Currency#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'USD'; then return Code is 'USD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency Currency.parse(String)"})
  void testParse_whenUsd_thenReturnCodeIsUsd() {
    // Arrange and Act
    Currency actualParseResult = Currency.parse("USD");

    // Assert
    assertEquals("USD", actualParseResult.getCode());
    assertEquals("USD", actualParseResult.toString());
    assertEquals(2, actualParseResult.getMinorUnitDigits());
    assertSame(Currency.USD, actualParseResult.getTriangulationCurrency());
  }

  /**
   * Test {@link Currency#Currency(String, int, String)}.
   *
   * <ul>
   *   <li>When {@code Code}.
   *   <li>Then return {@code Code}.
   * </ul>
   *
   * <p>Method under test: {@link Currency#Currency(String, int, String)}
   */
  @Test
  @DisplayName("Test new Currency(String, int, String); when 'Code'; then return 'Code'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Currency.<init>(String, int, String)"})
  void testNewCurrency_whenCode_thenReturnCode() {
    // Arrange and Act
    Currency actualCurrency = new Currency("Code", 1, "GBP");

    // Assert
    assertEquals("Code", actualCurrency.getCode());
    assertEquals("Code", actualCurrency.toString());
    assertEquals(1, actualCurrency.getMinorUnitDigits());
    assertSame(Currency.GBP, actualCurrency.getTriangulationCurrency());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Currency#getCode()}
   *   <li>{@link Currency#getMinorUnitDigits()}
   *   <li>{@link Currency#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String Currency.getCode()",
    "int Currency.getMinorUnitDigits()",
    "String Currency.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Currency currency = new Currency("Code", 1, "GBP");

    // Act
    String actualCode = currency.getCode();
    int actualMinorUnitDigits = currency.getMinorUnitDigits();

    // Assert
    assertEquals("Code", actualCode);
    assertEquals("Code", currency.toString());
    assertEquals(1, actualMinorUnitDigits);
  }

  /**
   * Test {@link Currency#getTriangulationCurrency()}.
   *
   * <ul>
   *   <li>Given {@link Currency#AED}.
   *   <li>Then return {@link Currency#USD}.
   * </ul>
   *
   * <p>Method under test: {@link Currency#getTriangulationCurrency()}
   */
  @Test
  @DisplayName("Test getTriangulationCurrency(); given AED; then return USD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency Currency.getTriangulationCurrency()"})
  void testGetTriangulationCurrency_givenAed_thenReturnUsd() {
    // Arrange, Act and Assert
    assertSame(Currency.USD, Currency.AED.getTriangulationCurrency());
  }

  /**
   * Test {@link Currency#roundMinorUnits(BigDecimal)} with {@code BigDecimal}.
   *
   * <ul>
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 2.30}.
   * </ul>
   *
   * <p>Method under test: {@link Currency#roundMinorUnits(BigDecimal)}
   */
  @Test
  @DisplayName(
      "Test roundMinorUnits(BigDecimal) with 'BigDecimal'; then return BigDecimal(String) with '2.30'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal Currency.roundMinorUnits(BigDecimal)"})
  void testRoundMinorUnitsWithBigDecimal_thenReturnBigDecimalWith230() {
    // Arrange and Act
    BigDecimal actualRoundMinorUnitsResult = Currency.AED.roundMinorUnits(new BigDecimal("2.3"));

    // Assert
    assertEquals(new BigDecimal("2.30"), actualRoundMinorUnitsResult);
  }

  /**
   * Test {@link Currency#roundMinorUnits(Decimal)} with {@code Decimal}.
   *
   * <p>Method under test: {@link Currency#roundMinorUnits(Decimal)}
   */
  @Test
  @DisplayName("Test roundMinorUnits(Decimal) with 'Decimal'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Currency.roundMinorUnits(Decimal)"})
  void testRoundMinorUnitsWithDecimal() {
    // Arrange
    Currency currency = new Currency("Code", -1, "GBP");

    // Act
    Decimal actualRoundMinorUnitsResult = currency.roundMinorUnits(Decimal.of(42L));

    // Assert
    Decimal actualAbsResult = actualRoundMinorUnitsResult.abs();
    assertEquals(actualRoundMinorUnitsResult, actualAbsResult);
    Decimal negatedResult = actualRoundMinorUnitsResult.negated();
    assertEquals(actualRoundMinorUnitsResult, negatedResult.abs().abs());
    assertEquals(actualRoundMinorUnitsResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Currency#roundMinorUnits(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Currency#CLP}.
   *   <li>When ofScaled {@link Long#MAX_VALUE} and eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Currency#roundMinorUnits(Decimal)}
   */
  @Test
  @DisplayName(
      "Test roundMinorUnits(Decimal) with 'Decimal'; given CLP; when ofScaled MAX_VALUE and eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Currency.roundMinorUnits(Decimal)"})
  void testRoundMinorUnitsWithDecimal_givenClp_whenOfScaledMax_valueAndEighteen() {
    // Arrange and Act
    Decimal actualRoundMinorUnitsResult =
        Currency.CLP.roundMinorUnits(Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Assert
    Decimal actualAbsResult = actualRoundMinorUnitsResult.abs();
    assertEquals(actualRoundMinorUnitsResult, actualAbsResult);
    Decimal negatedResult = actualRoundMinorUnitsResult.negated();
    assertEquals(actualRoundMinorUnitsResult, negatedResult.abs().abs());
    assertEquals(actualRoundMinorUnitsResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Currency#roundMinorUnits(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Currency#CLP}.
   *   <li>When ofScaled {@link Long#MAX_VALUE} and three.
   * </ul>
   *
   * <p>Method under test: {@link Currency#roundMinorUnits(Decimal)}
   */
  @Test
  @DisplayName(
      "Test roundMinorUnits(Decimal) with 'Decimal'; given CLP; when ofScaled MAX_VALUE and three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Currency.roundMinorUnits(Decimal)"})
  void testRoundMinorUnitsWithDecimal_givenClp_whenOfScaledMax_valueAndThree() {
    // Arrange and Act
    Decimal actualRoundMinorUnitsResult =
        Currency.CLP.roundMinorUnits(Decimal.ofScaled(Long.MAX_VALUE, 3));

    // Assert
    Decimal actualAbsResult = actualRoundMinorUnitsResult.abs();
    assertEquals(actualRoundMinorUnitsResult, actualAbsResult);
    Decimal negatedResult = actualRoundMinorUnitsResult.negated();
    assertEquals(actualRoundMinorUnitsResult, negatedResult.abs().abs());
    assertEquals(actualRoundMinorUnitsResult, negatedResult.negated().abs());
  }

  /**
   * Test {@link Currency#roundMinorUnits(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Currency#CLP}.
   *   <li>When ofScaled two and eighteen.
   * </ul>
   *
   * <p>Method under test: {@link Currency#roundMinorUnits(Decimal)}
   */
  @Test
  @DisplayName(
      "Test roundMinorUnits(Decimal) with 'Decimal'; given CLP; when ofScaled two and eighteen")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Currency.roundMinorUnits(Decimal)"})
  void testRoundMinorUnitsWithDecimal_givenClp_whenOfScaledTwoAndEighteen() {
    // Arrange and Act
    Decimal actualRoundMinorUnitsResult = Currency.CLP.roundMinorUnits(Decimal.ofScaled(2L, 18));

    // Assert
    Decimal actualAbsResult = actualRoundMinorUnitsResult.abs();
    assertEquals(actualRoundMinorUnitsResult, actualAbsResult);
    Decimal actualNegatedResult = actualRoundMinorUnitsResult.negated();
    assertEquals(actualRoundMinorUnitsResult, actualNegatedResult);
  }

  /**
   * Test {@link Currency#roundMinorUnits(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Given {@link Currency#CLP}.
   *   <li>When ofScaled two and two.
   * </ul>
   *
   * <p>Method under test: {@link Currency#roundMinorUnits(Decimal)}
   */
  @Test
  @DisplayName("Test roundMinorUnits(Decimal) with 'Decimal'; given CLP; when ofScaled two and two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Currency.roundMinorUnits(Decimal)"})
  void testRoundMinorUnitsWithDecimal_givenClp_whenOfScaledTwoAndTwo() {
    // Arrange and Act
    Decimal actualRoundMinorUnitsResult = Currency.CLP.roundMinorUnits(Decimal.ofScaled(2L, 2));

    // Assert
    Decimal actualAbsResult = actualRoundMinorUnitsResult.abs();
    assertEquals(actualRoundMinorUnitsResult, actualAbsResult);
    Decimal actualNegatedResult = actualRoundMinorUnitsResult.negated();
    assertEquals(actualRoundMinorUnitsResult, actualNegatedResult);
  }

  /**
   * Test {@link Currency#roundMinorUnits(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then return {@link Decimal} with value is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link Currency#roundMinorUnits(Decimal)}
   */
  @Test
  @DisplayName(
      "Test roundMinorUnits(Decimal) with 'Decimal'; then return Decimal with value is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Currency.roundMinorUnits(Decimal)"})
  void testRoundMinorUnitsWithDecimal_thenReturnDecimalWithValueIsFortyTwo() {
    // Arrange
    Decimal amount = Decimal.of(42L);

    // Act
    Decimal actualRoundMinorUnitsResult = Currency.AED.roundMinorUnits(amount);

    // Assert
    assertSame(amount, actualRoundMinorUnitsResult);
  }

  /**
   * Test {@link Currency#roundMinorUnits(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then return {@link Decimal} with value is zero.
   * </ul>
   *
   * <p>Method under test: {@link Currency#roundMinorUnits(Decimal)}
   */
  @Test
  @DisplayName(
      "Test roundMinorUnits(Decimal) with 'Decimal'; then return Decimal with value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Currency.roundMinorUnits(Decimal)"})
  void testRoundMinorUnitsWithDecimal_thenReturnDecimalWithValueIsZero() {
    // Arrange
    Currency currency = new Currency("Code", -1, "GBP");
    Decimal amount = Decimal.of(0L);

    // Act
    Decimal actualRoundMinorUnitsResult = currency.roundMinorUnits(amount);

    // Assert
    assertEquals(amount, actualRoundMinorUnitsResult);
  }

  /**
   * Test {@link Currency#roundMinorUnits(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then return scale is two.
   * </ul>
   *
   * <p>Method under test: {@link Currency#roundMinorUnits(Decimal)}
   */
  @Test
  @DisplayName("Test roundMinorUnits(Decimal) with 'Decimal'; then return scale is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Currency.roundMinorUnits(Decimal)"})
  void testRoundMinorUnitsWithDecimal_thenReturnScaleIsTwo() {
    // Arrange and Act
    Decimal actualRoundMinorUnitsResult =
        Currency.AED.roundMinorUnits(Decimal.ofScaled(Long.MAX_VALUE, 18));

    // Assert
    assertEquals(2, actualRoundMinorUnitsResult.scale());
    Decimal negatedResult = actualRoundMinorUnitsResult.negated();
    assertEquals(2, negatedResult.scale());
    Decimal actualAbsResult = actualRoundMinorUnitsResult.abs();
    assertEquals(actualRoundMinorUnitsResult, actualAbsResult);
    assertEquals(actualRoundMinorUnitsResult, negatedResult.abs());
    assertEquals(actualRoundMinorUnitsResult, negatedResult.negated());
  }

  /**
   * Test {@link Currency#roundMinorUnits(Decimal)} with {@code Decimal}.
   *
   * <ul>
   *   <li>Then return signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link Currency#roundMinorUnits(Decimal)}
   */
  @Test
  @DisplayName("Test roundMinorUnits(Decimal) with 'Decimal'; then return signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal Currency.roundMinorUnits(Decimal)"})
  void testRoundMinorUnitsWithDecimal_thenReturnSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualRoundMinorUnitsResult =
        Currency.CLP.roundMinorUnits(Decimal.ofScaled(Long.MIN_VALUE, 3));

    // Assert
    assertEquals(-1, actualRoundMinorUnitsResult.signum());
    Decimal absResult = actualRoundMinorUnitsResult.abs();
    assertEquals(actualRoundMinorUnitsResult, absResult.negated());
    Decimal absResult2 = absResult.abs();
    assertEquals(absResult2, absResult2);
    assertEquals(absResult2, actualRoundMinorUnitsResult.negated());
  }

  /**
   * Test {@link Currency#roundMinorUnits(double)} with {@code double}.
   *
   * <ul>
   *   <li>Given {@link Currency#AED}.
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link Currency#roundMinorUnits(double)}
   */
  @Test
  @DisplayName("Test roundMinorUnits(double) with 'double'; given AED; when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Currency.roundMinorUnits(double)"})
  void testRoundMinorUnitsWithDouble_givenAed_whenTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, Currency.AED.roundMinorUnits(10.0d));
  }

  /**
   * Test {@link Currency#compareTo(Currency)} with {@code Currency}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link Currency#compareTo(Currency)}
   */
  @Test
  @DisplayName("Test compareTo(Currency) with 'Currency'; when AED; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int Currency.compareTo(Currency)"})
  void testCompareToWithCurrency_whenAed_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, Currency.AED.compareTo(Currency.AED));
  }

  /**
   * Test {@link Currency#equals(Object)}, and {@link Currency#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Currency#equals(Object)}
   *   <li>{@link Currency#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Currency.equals(Object)", "int Currency.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Currency currency = Currency.AED;
    Currency currency2 = Currency.AED;

    // Act and Assert
    assertEquals(currency, currency2);
    assertEquals(currency.hashCode(), currency2.hashCode());
  }

  /**
   * Test {@link Currency#equals(Object)}, and {@link Currency#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Currency#equals(Object)}
   *   <li>{@link Currency#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Currency.equals(Object)", "int Currency.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    Currency currency = new Currency("Code", 1, "GBP");
    Currency currency2 = new Currency("Code", 1, "GBP");

    // Act and Assert
    assertEquals(currency, currency2);
    assertEquals(currency.hashCode(), currency2.hashCode());
  }

  /**
   * Test {@link Currency#equals(Object)}, and {@link Currency#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Currency#equals(Object)}
   *   <li>{@link Currency#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Currency.equals(Object)", "int Currency.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Currency currency = Currency.AED;

    // Act and Assert
    assertEquals(currency, currency);
    int expectedHashCodeResult = currency.hashCode();
    assertEquals(expectedHashCodeResult, currency.hashCode());
  }

  /**
   * Test {@link Currency#equals(Currency)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link Currency#AED}.
   *   <li>When {@link Currency#AED}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link Currency#equals(Currency)}
   */
  @Test
  @DisplayName("Test equals(Currency) with 'other'; given AED; when AED; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Currency.equals(Currency)"})
  void testEqualsWithOther_givenAed_whenAed_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(Currency.AED.equals(Currency.AED));
  }

  /**
   * Test {@link Currency#equals(Currency)} with {@code other}.
   *
   * <ul>
   *   <li>Given {@link Currency#ARS}.
   *   <li>When {@link Currency#AED}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link Currency#equals(Currency)}
   */
  @Test
  @DisplayName("Test equals(Currency) with 'other'; given ARS; when AED; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Currency.equals(Currency)"})
  void testEqualsWithOther_givenArs_whenAed_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(Currency.ARS.equals(Currency.AED));
  }

  /**
   * Test {@link Currency#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Currency#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Currency.equals(Object)", "int Currency.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Currency.ARS, Currency.AED);
  }

  /**
   * Test {@link Currency#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Currency#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Currency.equals(Object)", "int Currency.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Currency.AED, null);
  }

  /**
   * Test {@link Currency#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link Currency#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean Currency.equals(Object)", "int Currency.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(Currency.AED, "Different type to Currency");
  }
}
