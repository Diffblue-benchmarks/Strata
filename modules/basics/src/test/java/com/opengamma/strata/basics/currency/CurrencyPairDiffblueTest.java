package com.opengamma.strata.basics.currency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurrencyPairDiffblueTest {
  /**
   * Test {@link CurrencyPair#getAvailablePairs()}.
   *
   * <p>Method under test: {@link CurrencyPair#getAvailablePairs()}
   */
  @Test
  @DisplayName("Test getAvailablePairs()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set CurrencyPair.getAvailablePairs()"})
  void testGetAvailablePairs() {
    // Arrange and Act
    Set<CurrencyPair> actualAvailablePairs = CurrencyPair.getAvailablePairs();

    // Assert
    assertEquals(92, actualAvailablePairs.size());
  }

  /**
   * Test {@link CurrencyPair#of(Currency, Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#AED}.
   *   <li>Then return RateDigits is four.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#of(Currency, Currency)}
   */
  @Test
  @DisplayName("Test of(Currency, Currency); when AED; then return RateDigits is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair CurrencyPair.of(Currency, Currency)"})
  void testOf_whenAed_thenReturnRateDigitsIsFour() {
    // Arrange and Act
    CurrencyPair actualOfResult = CurrencyPair.of(Currency.AED, Currency.AED);

    // Assert
    assertEquals(4, actualOfResult.getRateDigits());
    assertTrue(actualOfResult.isIdentity());
    CurrencyPair actualInverseResult = actualOfResult.inverse();
    assertEquals(actualOfResult, actualInverseResult);
    CurrencyPair actualToConventionalResult = actualOfResult.toConventional();
    assertSame(actualOfResult, actualToConventionalResult);
    Currency currency = Currency.AED;
    assertSame(currency, actualOfResult.getBase());
    assertSame(currency, actualOfResult.getCounter());
  }

  /**
   * Test {@link CurrencyPair#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Pair Str}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Pair Str'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair CurrencyPair.parse(String)"})
  void testParse_whenPairStr_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> CurrencyPair.parse("Pair Str"));
  }

  /**
   * Test {@link CurrencyPair#parse(String)}.
   *
   * <ul>
   *   <li>When {@code UUU/UUU}.
   *   <li>Then return Base Code is {@code UUU}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'UUU/UUU'; then return Base Code is 'UUU'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair CurrencyPair.parse(String)"})
  void testParse_whenUuuUuu_thenReturnBaseCodeIsUuu() {
    // Arrange and Act
    CurrencyPair actualParseResult = CurrencyPair.parse("UUU/UUU");

    // Assert
    Currency base = actualParseResult.getBase();
    assertEquals("UUU", base.getCode());
    assertEquals("UUU", base.toString());
    assertEquals(0, base.getMinorUnitDigits());
    assertEquals(0, actualParseResult.getRateDigits());
    assertTrue(actualParseResult.isIdentity());
    CurrencyPair actualInverseResult = actualParseResult.inverse();
    assertEquals(actualParseResult, actualInverseResult);
    assertSame(base, actualParseResult.getCounter());
    CurrencyPair actualToConventionalResult = actualParseResult.toConventional();
    assertSame(actualParseResult, actualToConventionalResult);
  }

  /**
   * Test {@link CurrencyPair#inverse()}.
   *
   * <ul>
   *   <li>Then return {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#inverse()}
   */
  @Test
  @DisplayName("Test inverse(); then return CurrencyPair with base is AED and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair CurrencyPair.inverse()"})
  void testInverse_thenReturnCurrencyPairWithBaseIsAedAndCounterIsAed() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.AED, Currency.AED);

    // Act
    CurrencyPair actualInverseResult = ofResult.inverse();

    // Assert
    assertEquals(ofResult, actualInverseResult);
  }

  /**
   * Test {@link CurrencyPair#contains(Currency)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#contains(Currency)}
   */
  @Test
  @DisplayName(
      "Test contains(Currency); given CurrencyPair with base is AED and counter is AED; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.contains(Currency)"})
  void testContains_givenCurrencyPairWithBaseIsAedAndCounterIsAed_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurrencyPair.of(Currency.AED, Currency.AED).contains(Currency.AED));
  }

  /**
   * Test {@link CurrencyPair#contains(Currency)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#ARS} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#contains(Currency)}
   */
  @Test
  @DisplayName(
      "Test contains(Currency); given CurrencyPair with base is ARS and counter is AED; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.contains(Currency)"})
  void testContains_givenCurrencyPairWithBaseIsArsAndCounterIsAed_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurrencyPair.of(Currency.ARS, Currency.AED).contains(Currency.AED));
  }

  /**
   * Test {@link CurrencyPair#contains(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#ARS}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#contains(Currency)}
   */
  @Test
  @DisplayName("Test contains(Currency); when ARS; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.contains(Currency)"})
  void testContains_whenArs_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CurrencyPair.of(Currency.AED, Currency.AED).contains(Currency.ARS));
  }

  /**
   * Test {@link CurrencyPair#other(Currency)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   *   <li>When {@link Currency#AED}.
   *   <li>Then return {@link Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#other(Currency)}
   */
  @Test
  @DisplayName(
      "Test other(Currency); given CurrencyPair with base is AED and counter is AED; when AED; then return AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency CurrencyPair.other(Currency)"})
  void testOther_givenCurrencyPairWithBaseIsAedAndCounterIsAed_whenAed_thenReturnAed() {
    // Arrange, Act and Assert
    assertSame(Currency.AED, CurrencyPair.of(Currency.AED, Currency.AED).other(Currency.AED));
  }

  /**
   * Test {@link CurrencyPair#other(Currency)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#ARS} and counter is {@link
   *       Currency#AED}.
   *   <li>When {@link Currency#AED}.
   *   <li>Then return {@link Currency#ARS}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#other(Currency)}
   */
  @Test
  @DisplayName(
      "Test other(Currency); given CurrencyPair with base is ARS and counter is AED; when AED; then return ARS")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency CurrencyPair.other(Currency)"})
  void testOther_givenCurrencyPairWithBaseIsArsAndCounterIsAed_whenAed_thenReturnArs() {
    // Arrange, Act and Assert
    assertSame(Currency.ARS, CurrencyPair.of(Currency.ARS, Currency.AED).other(Currency.AED));
  }

  /**
   * Test {@link CurrencyPair#other(Currency)}.
   *
   * <ul>
   *   <li>When {@link Currency#ARS}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#other(Currency)}
   */
  @Test
  @DisplayName("Test other(Currency); when ARS; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency CurrencyPair.other(Currency)"})
  void testOther_whenArs_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> CurrencyPair.of(Currency.AED, Currency.AED).other(Currency.ARS));
  }

  /**
   * Test {@link CurrencyPair#isIdentity()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isIdentity()}
   */
  @Test
  @DisplayName(
      "Test isIdentity(); given CurrencyPair with base is AED and counter is AED; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isIdentity()"})
  void testIsIdentity_givenCurrencyPairWithBaseIsAedAndCounterIsAed_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurrencyPair.of(Currency.AED, Currency.AED).isIdentity());
  }

  /**
   * Test {@link CurrencyPair#isIdentity()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#ARS} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isIdentity()}
   */
  @Test
  @DisplayName(
      "Test isIdentity(); given CurrencyPair with base is ARS and counter is AED; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isIdentity()"})
  void testIsIdentity_givenCurrencyPairWithBaseIsArsAndCounterIsAed_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CurrencyPair.of(Currency.ARS, Currency.AED).isIdentity());
  }

  /**
   * Test {@link CurrencyPair#isInverse(CurrencyPair)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isInverse(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test isInverse(CurrencyPair); given CurrencyPair with base is AED and counter is AED; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isInverse(CurrencyPair)"})
  void testIsInverse_givenCurrencyPairWithBaseIsAedAndCounterIsAed_thenReturnTrue() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.AED, Currency.AED);

    // Act and Assert
    assertTrue(ofResult.isInverse(CurrencyPair.of(Currency.AED, Currency.AED)));
  }

  /**
   * Test {@link CurrencyPair#isInverse(CurrencyPair)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#ARS}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isInverse(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test isInverse(CurrencyPair); given CurrencyPair with base is AED and counter is ARS; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isInverse(CurrencyPair)"})
  void testIsInverse_givenCurrencyPairWithBaseIsAedAndCounterIsArs_thenReturnFalse() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.AED, Currency.ARS);

    // Act and Assert
    assertFalse(ofResult.isInverse(CurrencyPair.of(Currency.AED, Currency.AED)));
  }

  /**
   * Test {@link CurrencyPair#isInverse(CurrencyPair)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#ARS} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isInverse(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test isInverse(CurrencyPair); given CurrencyPair with base is ARS and counter is AED; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isInverse(CurrencyPair)"})
  void testIsInverse_givenCurrencyPairWithBaseIsArsAndCounterIsAed_thenReturnFalse() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.ARS, Currency.AED);

    // Act and Assert
    assertFalse(ofResult.isInverse(CurrencyPair.of(Currency.AED, Currency.AED)));
  }

  /**
   * Test {@link CurrencyPair#cross(CurrencyPair)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#cross(CurrencyPair)}
   */
  @Test
  @DisplayName("Test cross(CurrencyPair); given CurrencyPair with base is AED and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CurrencyPair.cross(CurrencyPair)"})
  void testCross_givenCurrencyPairWithBaseIsAedAndCounterIsAed() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.AED, Currency.AED);

    // Act and Assert
    assertFalse(ofResult.cross(CurrencyPair.of(Currency.AED, Currency.AED)).isPresent());
  }

  /**
   * Test {@link CurrencyPair#cross(CurrencyPair)}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#ARS} and counter is {@link
   *       Currency#BGN}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#cross(CurrencyPair)}
   */
  @Test
  @DisplayName("Test cross(CurrencyPair); given CurrencyPair with base is ARS and counter is BGN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CurrencyPair.cross(CurrencyPair)"})
  void testCross_givenCurrencyPairWithBaseIsArsAndCounterIsBgn() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.ARS, Currency.BGN);

    // Act and Assert
    assertFalse(ofResult.cross(CurrencyPair.of(Currency.AUD, Currency.AED)).isPresent());
  }

  /**
   * Test {@link CurrencyPair#cross(CurrencyPair)}.
   *
   * <ul>
   *   <li>Then return {@link Optional#get()} Counter Code is {@code AUD}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#cross(CurrencyPair)}
   */
  @Test
  @DisplayName("Test cross(CurrencyPair); then return get() Counter Code is 'AUD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CurrencyPair.cross(CurrencyPair)"})
  void testCross_thenReturnGetCounterCodeIsAud() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.EUR, Currency.AED);

    // Act and Assert
    CurrencyPair getResult = ofResult.cross(CurrencyPair.of(Currency.AUD, Currency.AED)).get();
    Currency counter = getResult.getCounter();
    assertEquals("AUD", counter.getCode());
    assertEquals("AUD", counter.toString());
    Currency base = getResult.getBase();
    assertEquals("EUR", base.getCode());
    assertEquals("EUR", base.toString());
    CurrencyPair inverseResult = getResult.inverse();
    assertEquals(5, inverseResult.getRateDigits());
    assertEquals(5, getResult.getRateDigits());
    assertEquals(getResult, inverseResult.inverse());
    assertEquals(getResult, inverseResult.toConventional());
    assertSame(base, inverseResult.getCounter());
    assertSame(counter, inverseResult.getBase());
    CurrencyPair actualToConventionalResult = getResult.toConventional();
    assertSame(getResult, actualToConventionalResult);
  }

  /**
   * Test {@link CurrencyPair#cross(CurrencyPair)}.
   *
   * <ul>
   *   <li>Then return {@link Optional#get()} Counter Code is {@code CLP}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#cross(CurrencyPair)}
   */
  @Test
  @DisplayName("Test cross(CurrencyPair); then return get() Counter Code is 'CLP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CurrencyPair.cross(CurrencyPair)"})
  void testCross_thenReturnGetCounterCodeIsClp() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.ARS, Currency.AED);

    // Act and Assert
    CurrencyPair getResult = ofResult.cross(CurrencyPair.of(Currency.CLP, Currency.AED)).get();
    Currency counter = getResult.getCounter();
    assertEquals("CLP", counter.getCode());
    assertEquals("CLP", counter.toString());
    assertEquals(0, counter.getMinorUnitDigits());
    CurrencyPair inverseResult = getResult.inverse();
    assertEquals(2, inverseResult.getRateDigits());
    assertEquals(2, getResult.getRateDigits());
    assertEquals(getResult, inverseResult.inverse());
    assertEquals(getResult, inverseResult.toConventional());
    assertSame(counter, inverseResult.getBase());
    CurrencyPair actualToConventionalResult = getResult.toConventional();
    assertSame(getResult, actualToConventionalResult);
  }

  /**
   * Test {@link CurrencyPair#cross(CurrencyPair)}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#cross(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test cross(CurrencyPair); when CurrencyPair with base is AED and counter is AED; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CurrencyPair.cross(CurrencyPair)"})
  void testCross_whenCurrencyPairWithBaseIsAedAndCounterIsAed_thenReturnNotPresent() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.ARS, Currency.AED);

    // Act and Assert
    assertFalse(ofResult.cross(CurrencyPair.of(Currency.AED, Currency.AED)).isPresent());
  }

  /**
   * Test {@link CurrencyPair#cross(CurrencyPair)}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#ARS}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#cross(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test cross(CurrencyPair); when CurrencyPair with base is AED and counter is ARS; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CurrencyPair.cross(CurrencyPair)"})
  void testCross_whenCurrencyPairWithBaseIsAedAndCounterIsArs_thenReturnNotPresent() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.ARS, Currency.AED);

    // Act and Assert
    assertFalse(ofResult.cross(CurrencyPair.of(Currency.AED, Currency.ARS)).isPresent());
  }

  /**
   * Test {@link CurrencyPair#cross(CurrencyPair)}.
   *
   * <ul>
   *   <li>When {@link CurrencyPair} with base is {@link Currency#ARS} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#cross(CurrencyPair)}
   */
  @Test
  @DisplayName(
      "Test cross(CurrencyPair); when CurrencyPair with base is ARS and counter is AED; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional CurrencyPair.cross(CurrencyPair)"})
  void testCross_whenCurrencyPairWithBaseIsArsAndCounterIsAed_thenReturnNotPresent() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.ARS, Currency.AED);

    // Act and Assert
    assertFalse(ofResult.cross(CurrencyPair.of(Currency.ARS, Currency.AED)).isPresent());
  }

  /**
   * Test {@link CurrencyPair#isConventional()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isConventional()}
   */
  @Test
  @DisplayName(
      "Test isConventional(); given CurrencyPair with base is AED and counter is AED; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isConventional()"})
  void testIsConventional_givenCurrencyPairWithBaseIsAedAndCounterIsAed_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurrencyPair.of(Currency.AED, Currency.AED).isConventional());
  }

  /**
   * Test {@link CurrencyPair#isConventional()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AUD}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isConventional()}
   */
  @Test
  @DisplayName(
      "Test isConventional(); given CurrencyPair with base is AED and counter is AUD; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isConventional()"})
  void testIsConventional_givenCurrencyPairWithBaseIsAedAndCounterIsAud_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CurrencyPair.of(Currency.AED, Currency.AUD).isConventional());
  }

  /**
   * Test {@link CurrencyPair#isConventional()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#ARS} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isConventional()}
   */
  @Test
  @DisplayName(
      "Test isConventional(); given CurrencyPair with base is ARS and counter is AED; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isConventional()"})
  void testIsConventional_givenCurrencyPairWithBaseIsArsAndCounterIsAed_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CurrencyPair.of(Currency.ARS, Currency.AED).isConventional());
  }

  /**
   * Test {@link CurrencyPair#isConventional()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isConventional()}
   */
  @Test
  @DisplayName(
      "Test isConventional(); given CurrencyPair with base is AUD and counter is AED; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isConventional()"})
  void testIsConventional_givenCurrencyPairWithBaseIsAudAndCounterIsAed_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurrencyPair.of(Currency.AUD, Currency.AED).isConventional());
  }

  /**
   * Test {@link CurrencyPair#isConventional()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#AUD}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isConventional()}
   */
  @Test
  @DisplayName(
      "Test isConventional(); given CurrencyPair with base is AUD and counter is AUD; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isConventional()"})
  void testIsConventional_givenCurrencyPairWithBaseIsAudAndCounterIsAud_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurrencyPair.of(Currency.AUD, Currency.AUD).isConventional());
  }

  /**
   * Test {@link CurrencyPair#isConventional()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#CAD}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isConventional()}
   */
  @Test
  @DisplayName(
      "Test isConventional(); given CurrencyPair with base is AUD and counter is CAD; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isConventional()"})
  void testIsConventional_givenCurrencyPairWithBaseIsAudAndCounterIsCad_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(CurrencyPair.of(Currency.AUD, Currency.CAD).isConventional());
  }

  /**
   * Test {@link CurrencyPair#isConventional()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#EUR}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#isConventional()}
   */
  @Test
  @DisplayName(
      "Test isConventional(); given CurrencyPair with base is AUD and counter is EUR; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.isConventional()"})
  void testIsConventional_givenCurrencyPairWithBaseIsAudAndCounterIsEur_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(CurrencyPair.of(Currency.AUD, Currency.EUR).isConventional());
  }

  /**
   * Test {@link CurrencyPair#toConventional()}.
   *
   * <ul>
   *   <li>Then return Counter Code is {@code ARS}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toConventional()}
   */
  @Test
  @DisplayName("Test toConventional(); then return Counter Code is 'ARS'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair CurrencyPair.toConventional()"})
  void testToConventional_thenReturnCounterCodeIsArs() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.ARS, Currency.AED);

    // Act
    CurrencyPair actualToConventionalResult = ofResult.toConventional();

    // Assert
    Currency counter = actualToConventionalResult.getCounter();
    assertEquals("ARS", counter.getCode());
    assertEquals("ARS", counter.toString());
    assertEquals(ofResult, actualToConventionalResult.inverse());
    Currency triangulationCurrency =
        actualToConventionalResult.getBase().getTriangulationCurrency().getTriangulationCurrency();
    assertSame(triangulationCurrency, triangulationCurrency);
    assertSame(triangulationCurrency, counter.getTriangulationCurrency());
  }

  /**
   * Test {@link CurrencyPair#toConventional()}.
   *
   * <ul>
   *   <li>Then return Counter Code is {@code AUD}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toConventional()}
   */
  @Test
  @DisplayName("Test toConventional(); then return Counter Code is 'AUD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair CurrencyPair.toConventional()"})
  void testToConventional_thenReturnCounterCodeIsAud() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.AUD, Currency.EUR);

    // Act
    CurrencyPair actualToConventionalResult = ofResult.toConventional();

    // Assert
    Currency counter = actualToConventionalResult.getCounter();
    assertEquals("AUD", counter.getCode());
    assertEquals("AUD", counter.toString());
    Currency base = actualToConventionalResult.getBase();
    assertEquals("EUR", base.getCode());
    assertEquals("EUR", base.toString());
    assertEquals(5, actualToConventionalResult.getRateDigits());
    assertEquals(ofResult, actualToConventionalResult.inverse());
  }

  /**
   * Test {@link CurrencyPair#toConventional()}.
   *
   * <ul>
   *   <li>Then return {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toConventional()}
   */
  @Test
  @DisplayName(
      "Test toConventional(); then return CurrencyPair with base is AED and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair CurrencyPair.toConventional()"})
  void testToConventional_thenReturnCurrencyPairWithBaseIsAedAndCounterIsAed() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.AED, Currency.AED);

    // Act
    CurrencyPair actualToConventionalResult = ofResult.toConventional();

    // Assert
    assertSame(ofResult, actualToConventionalResult);
  }

  /**
   * Test {@link CurrencyPair#toConventional()}.
   *
   * <ul>
   *   <li>Then return {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#AED}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toConventional()}
   */
  @Test
  @DisplayName(
      "Test toConventional(); then return CurrencyPair with base is AUD and counter is AED")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair CurrencyPair.toConventional()"})
  void testToConventional_thenReturnCurrencyPairWithBaseIsAudAndCounterIsAed() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.AUD, Currency.AED);

    // Act
    CurrencyPair actualToConventionalResult = ofResult.toConventional();

    // Assert
    assertSame(ofResult, actualToConventionalResult);
  }

  /**
   * Test {@link CurrencyPair#toConventional()}.
   *
   * <ul>
   *   <li>Then return {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#AUD}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toConventional()}
   */
  @Test
  @DisplayName(
      "Test toConventional(); then return CurrencyPair with base is AUD and counter is AUD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair CurrencyPair.toConventional()"})
  void testToConventional_thenReturnCurrencyPairWithBaseIsAudAndCounterIsAud() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.AUD, Currency.AUD);

    // Act
    CurrencyPair actualToConventionalResult = ofResult.toConventional();

    // Assert
    assertSame(ofResult, actualToConventionalResult);
  }

  /**
   * Test {@link CurrencyPair#toConventional()}.
   *
   * <ul>
   *   <li>Then return {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#CAD}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toConventional()}
   */
  @Test
  @DisplayName(
      "Test toConventional(); then return CurrencyPair with base is AUD and counter is CAD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair CurrencyPair.toConventional()"})
  void testToConventional_thenReturnCurrencyPairWithBaseIsAudAndCounterIsCad() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.AUD, Currency.CAD);

    // Act
    CurrencyPair actualToConventionalResult = ofResult.toConventional();

    // Assert
    assertSame(ofResult, actualToConventionalResult);
  }

  /**
   * Test {@link CurrencyPair#toConventional()}.
   *
   * <ul>
   *   <li>Then return inverse is {@link CurrencyPair} with base is {@link Currency#AED} and counter
   *       is {@link Currency#AUD}.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toConventional()}
   */
  @Test
  @DisplayName(
      "Test toConventional(); then return inverse is CurrencyPair with base is AED and counter is AUD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurrencyPair CurrencyPair.toConventional()"})
  void testToConventional_thenReturnInverseIsCurrencyPairWithBaseIsAedAndCounterIsAud() {
    // Arrange
    CurrencyPair ofResult = CurrencyPair.of(Currency.AED, Currency.AUD);

    // Act
    CurrencyPair actualToConventionalResult = ofResult.toConventional();

    // Assert
    assertEquals(ofResult, actualToConventionalResult.inverse());
    Currency triangulationCurrency =
        actualToConventionalResult.getBase().getTriangulationCurrency().getTriangulationCurrency();
    assertSame(triangulationCurrency, triangulationCurrency);
    assertSame(
        triangulationCurrency, actualToConventionalResult.getCounter().getTriangulationCurrency());
  }

  /**
   * Test {@link CurrencyPair#toSet()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toSet()}
   */
  @Test
  @DisplayName(
      "Test toSet(); given CurrencyPair with base is AED and counter is AED; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet CurrencyPair.toSet()"})
  void testToSet_givenCurrencyPairWithBaseIsAedAndCounterIsAed_thenReturnSizeIsOne() {
    // Arrange, Act and Assert
    assertEquals(1, CurrencyPair.of(Currency.AED, Currency.AED).toSet().size());
  }

  /**
   * Test {@link CurrencyPair#toSet()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AUD}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toSet()}
   */
  @Test
  @DisplayName(
      "Test toSet(); given CurrencyPair with base is AED and counter is AUD; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet CurrencyPair.toSet()"})
  void testToSet_givenCurrencyPairWithBaseIsAedAndCounterIsAud_thenReturnSizeIsTwo() {
    // Arrange, Act and Assert
    assertEquals(2, CurrencyPair.of(Currency.AED, Currency.AUD).toSet().size());
  }

  /**
   * Test {@link CurrencyPair#toSet()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#ARS} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toSet()}
   */
  @Test
  @DisplayName(
      "Test toSet(); given CurrencyPair with base is ARS and counter is AED; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet CurrencyPair.toSet()"})
  void testToSet_givenCurrencyPairWithBaseIsArsAndCounterIsAed_thenReturnSizeIsTwo() {
    // Arrange, Act and Assert
    assertEquals(2, CurrencyPair.of(Currency.ARS, Currency.AED).toSet().size());
  }

  /**
   * Test {@link CurrencyPair#toSet()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toSet()}
   */
  @Test
  @DisplayName(
      "Test toSet(); given CurrencyPair with base is AUD and counter is AED; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet CurrencyPair.toSet()"})
  void testToSet_givenCurrencyPairWithBaseIsAudAndCounterIsAed_thenReturnSizeIsTwo() {
    // Arrange, Act and Assert
    assertEquals(2, CurrencyPair.of(Currency.AUD, Currency.AED).toSet().size());
  }

  /**
   * Test {@link CurrencyPair#toSet()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#AUD}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toSet()}
   */
  @Test
  @DisplayName(
      "Test toSet(); given CurrencyPair with base is AUD and counter is AUD; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet CurrencyPair.toSet()"})
  void testToSet_givenCurrencyPairWithBaseIsAudAndCounterIsAud_thenReturnSizeIsOne() {
    // Arrange, Act and Assert
    assertEquals(1, CurrencyPair.of(Currency.AUD, Currency.AUD).toSet().size());
  }

  /**
   * Test {@link CurrencyPair#toSet()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#CAD}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toSet()}
   */
  @Test
  @DisplayName(
      "Test toSet(); given CurrencyPair with base is AUD and counter is CAD; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet CurrencyPair.toSet()"})
  void testToSet_givenCurrencyPairWithBaseIsAudAndCounterIsCad_thenReturnSizeIsTwo() {
    // Arrange, Act and Assert
    assertEquals(2, CurrencyPair.of(Currency.AUD, Currency.CAD).toSet().size());
  }

  /**
   * Test {@link CurrencyPair#toSet()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#EUR}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toSet()}
   */
  @Test
  @DisplayName(
      "Test toSet(); given CurrencyPair with base is AUD and counter is EUR; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet CurrencyPair.toSet()"})
  void testToSet_givenCurrencyPairWithBaseIsAudAndCounterIsEur_thenReturnSizeIsTwo() {
    // Arrange, Act and Assert
    assertEquals(2, CurrencyPair.of(Currency.AUD, Currency.EUR).toSet().size());
  }

  /**
   * Test {@link CurrencyPair#toSet()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#BGN} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#toSet()}
   */
  @Test
  @DisplayName(
      "Test toSet(); given CurrencyPair with base is BGN and counter is AED; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.google.common.collect.ImmutableSet CurrencyPair.toSet()"})
  void testToSet_givenCurrencyPairWithBaseIsBgnAndCounterIsAed_thenReturnSizeIsTwo() {
    // Arrange, Act and Assert
    assertEquals(2, CurrencyPair.of(Currency.BGN, Currency.AED).toSet().size());
  }

  /**
   * Test {@link CurrencyPair#getRateDigits()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AED} and counter is {@link
   *       Currency#AED}.
   *   <li>Then return four.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#getRateDigits()}
   */
  @Test
  @DisplayName(
      "Test getRateDigits(); given CurrencyPair with base is AED and counter is AED; then return four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CurrencyPair.getRateDigits()"})
  void testGetRateDigits_givenCurrencyPairWithBaseIsAedAndCounterIsAed_thenReturnFour() {
    // Arrange, Act and Assert
    assertEquals(4, CurrencyPair.of(Currency.AED, Currency.AED).getRateDigits());
  }

  /**
   * Test {@link CurrencyPair#getRateDigits()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#AUD}.
   *   <li>Then return four.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#getRateDigits()}
   */
  @Test
  @DisplayName(
      "Test getRateDigits(); given CurrencyPair with base is AUD and counter is AUD; then return four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CurrencyPair.getRateDigits()"})
  void testGetRateDigits_givenCurrencyPairWithBaseIsAudAndCounterIsAud_thenReturnFour() {
    // Arrange, Act and Assert
    assertEquals(4, CurrencyPair.of(Currency.AUD, Currency.AUD).getRateDigits());
  }

  /**
   * Test {@link CurrencyPair#getRateDigits()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#AUD} and counter is {@link
   *       Currency#CAD}.
   *   <li>Then return four.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#getRateDigits()}
   */
  @Test
  @DisplayName(
      "Test getRateDigits(); given CurrencyPair with base is AUD and counter is CAD; then return four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CurrencyPair.getRateDigits()"})
  void testGetRateDigits_givenCurrencyPairWithBaseIsAudAndCounterIsCad_thenReturnFour() {
    // Arrange, Act and Assert
    assertEquals(4, CurrencyPair.of(Currency.AUD, Currency.CAD).getRateDigits());
  }

  /**
   * Test {@link CurrencyPair#getRateDigits()}.
   *
   * <ul>
   *   <li>Given {@link CurrencyPair} with base is {@link Currency#CAD} and counter is {@link
   *       Currency#AUD}.
   *   <li>Then return four.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#getRateDigits()}
   */
  @Test
  @DisplayName(
      "Test getRateDigits(); given CurrencyPair with base is CAD and counter is AUD; then return four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CurrencyPair.getRateDigits()"})
  void testGetRateDigits_givenCurrencyPairWithBaseIsCadAndCounterIsAud_thenReturnFour() {
    // Arrange, Act and Assert
    assertEquals(4, CurrencyPair.of(Currency.CAD, Currency.AUD).getRateDigits());
  }

  /**
   * Test {@link CurrencyPair#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CurrencyPair#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CurrencyPair.equals(Object)", "int CurrencyPair.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(CurrencyPair.of(Currency.AED, Currency.AED), "Obj");
  }
}
