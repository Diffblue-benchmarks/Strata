package com.opengamma.strata.loader;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.date.MarketTenor;
import com.opengamma.strata.basics.date.Tenor;
import com.opengamma.strata.basics.schedule.Frequency;
import com.opengamma.strata.collect.BasisPoints;
import com.opengamma.strata.collect.Decimal;
import com.opengamma.strata.collect.Percentage;
import com.opengamma.strata.collect.result.ParseFailureException;
import com.opengamma.strata.product.common.BuySell;
import java.math.BigDecimal;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LoaderUtilsDiffblueTest {
  /**
   * Test {@link LoaderUtils#findIndex(String)}.
   *
   * <ul>
   *   <li>When {@code Reference}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#findIndex(String)}
   */
  @Test
  @DisplayName("Test findIndex(String); when 'Reference'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.basics.index.Index LoaderUtils.findIndex(String)"})
  void testFindIndex_whenReference_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.findIndex("Reference"));
  }

  /**
   * Test {@link LoaderUtils#parseBoolean(String)}.
   *
   * <p>Method under test: {@link LoaderUtils#parseBoolean(String)}
   */
  @Test
  @DisplayName("Test parseBoolean(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean LoaderUtils.parseBoolean(String)"})
  void testParseBoolean() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBoolean("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseInteger(String)}.
   *
   * <ul>
   *   <li>When {@code 1}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseInteger(String)}
   */
  @Test
  @DisplayName("Test parseInteger(String); when '1'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LoaderUtils.parseInteger(String)"})
  void testParseInteger_when1_thenReturnOne() {
    // Arrange, Act and Assert
    assertEquals(1, LoaderUtils.parseInteger("1"));
  }

  /**
   * Test {@link LoaderUtils#parseInteger(String)}.
   *
   * <ul>
   *   <li>When {@code com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseInteger(String)}
   */
  @Test
  @DisplayName("Test parseInteger(String); when 'com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LoaderUtils.parseInteger(String)"})
  void testParseInteger_whenComOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> LoaderUtils.parseInteger("com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseInteger(String)}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseInteger(String)}
   */
  @Test
  @DisplayName("Test parseInteger(String); when ','; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LoaderUtils.parseInteger(String)"})
  void testParseInteger_whenComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseInteger(","));
  }

  /**
   * Test {@link LoaderUtils#parseInteger(String)}.
   *
   * <ul>
   *   <li>When {@code -,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseInteger(String)}
   */
  @Test
  @DisplayName("Test parseInteger(String); when '-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LoaderUtils.parseInteger(String)"})
  void testParseInteger_whenDashComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseInteger("-,"));
  }

  /**
   * Test {@link LoaderUtils#parseInteger(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseInteger(String)}
   */
  @Test
  @DisplayName("Test parseInteger(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LoaderUtils.parseInteger(String)"})
  void testParseInteger_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseInteger("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseInteger(String)}.
   *
   * <ul>
   *   <li>When {@code {U},}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseInteger(String)}
   */
  @Test
  @DisplayName("Test parseInteger(String); when '{U},'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LoaderUtils.parseInteger(String)"})
  void testParseInteger_whenU_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseInteger("{U},"));
  }

  /**
   * Test {@link LoaderUtils#parseInteger(String)}.
   *
   * <ul>
   *   <li>When {@code ({U}}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseInteger(String)}
   */
  @Test
  @DisplayName("Test parseInteger(String); when '({U}'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int LoaderUtils.parseInteger(String)"})
  void testParseInteger_whenU_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseInteger("({U}"));
  }

  /**
   * Test {@link LoaderUtils#parseDouble(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDouble(String)}
   */
  @Test
  @DisplayName("Test parseDouble(String); when '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDouble(String)"})
  void testParseDouble_when42_thenReturnFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(42.0d, LoaderUtils.parseDouble("42"));
  }

  /**
   * Test {@link LoaderUtils#parseDouble(String)}.
   *
   * <ul>
   *   <li>When {@code 42-,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDouble(String)}
   */
  @Test
  @DisplayName("Test parseDouble(String); when '42-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDouble(String)"})
  void testParseDouble_when42_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDouble("42-,"));
  }

  /**
   * Test {@link LoaderUtils#parseDouble(String)}.
   *
   * <ul>
   *   <li>When {@code B}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDouble(String)}
   */
  @Test
  @DisplayName("Test parseDouble(String); when 'B'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDouble(String)"})
  void testParseDouble_whenB_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDouble("B"));
  }

  /**
   * Test {@link LoaderUtils#parseDouble(String)}.
   *
   * <ul>
   *   <li>When {@code com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDouble(String)}
   */
  @Test
  @DisplayName("Test parseDouble(String); when 'com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDouble(String)"})
  void testParseDouble_whenComOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> LoaderUtils.parseDouble("com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseDouble(String)}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDouble(String)}
   */
  @Test
  @DisplayName("Test parseDouble(String); when ','; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDouble(String)"})
  void testParseDouble_whenComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDouble(","));
  }

  /**
   * Test {@link LoaderUtils#parseDouble(String)}.
   *
   * <ul>
   *   <li>When {@code -,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDouble(String)}
   */
  @Test
  @DisplayName("Test parseDouble(String); when '-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDouble(String)"})
  void testParseDouble_whenDashComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDouble("-,"));
  }

  /**
   * Test {@link LoaderUtils#parseDouble(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDouble(String)}
   */
  @Test
  @DisplayName("Test parseDouble(String); when empty string; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDouble(String)"})
  void testParseDouble_whenEmptyString_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDouble(""));
  }

  /**
   * Test {@link LoaderUtils#parseDouble(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDouble(String)}
   */
  @Test
  @DisplayName("Test parseDouble(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDouble(String)"})
  void testParseDouble_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDouble("("));
  }

  /**
   * Test {@link LoaderUtils#parseDouble(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDouble(String)}
   */
  @Test
  @DisplayName("Test parseDouble(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDouble(String)"})
  void testParseDouble_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDouble("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseDouble(String)}.
   *
   * <ul>
   *   <li>When {@code {U},}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDouble(String)}
   */
  @Test
  @DisplayName("Test parseDouble(String); when '{U},'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDouble(String)"})
  void testParseDouble_whenU_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDouble("{U},"));
  }

  /**
   * Test {@link LoaderUtils#parseDouble(String)}.
   *
   * <ul>
   *   <li>When {@code ({U}}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDouble(String)}
   */
  @Test
  @DisplayName("Test parseDouble(String); when '({U}'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDouble(String)"})
  void testParseDouble_whenU_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDouble("({U}"));
  }

  /**
   * Test {@link LoaderUtils#parseDoublePercent(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code 0.42}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDoublePercent(String)}
   */
  @Test
  @DisplayName("Test parseDoublePercent(String); when '42'; then return '0.42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDoublePercent(String)"})
  void testParseDoublePercent_when42_thenReturn042() {
    // Arrange, Act and Assert
    assertEquals(0.42d, LoaderUtils.parseDoublePercent("42"));
  }

  /**
   * Test {@link LoaderUtils#parseDoublePercent(String)}.
   *
   * <ul>
   *   <li>When {@code 42-,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDoublePercent(String)}
   */
  @Test
  @DisplayName("Test parseDoublePercent(String); when '42-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDoublePercent(String)"})
  void testParseDoublePercent_when42_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDoublePercent("42-,"));
  }

  /**
   * Test {@link LoaderUtils#parseDoublePercent(String)}.
   *
   * <ul>
   *   <li>When {@code B}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDoublePercent(String)}
   */
  @Test
  @DisplayName("Test parseDoublePercent(String); when 'B'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDoublePercent(String)"})
  void testParseDoublePercent_whenB_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDoublePercent("B"));
  }

  /**
   * Test {@link LoaderUtils#parseDoublePercent(String)}.
   *
   * <ul>
   *   <li>When {@code com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDoublePercent(String)}
   */
  @Test
  @DisplayName(
      "Test parseDoublePercent(String); when 'com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDoublePercent(String)"})
  void testParseDoublePercent_whenComOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> LoaderUtils.parseDoublePercent("com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseDoublePercent(String)}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDoublePercent(String)}
   */
  @Test
  @DisplayName("Test parseDoublePercent(String); when ','; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDoublePercent(String)"})
  void testParseDoublePercent_whenComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDoublePercent(","));
  }

  /**
   * Test {@link LoaderUtils#parseDoublePercent(String)}.
   *
   * <ul>
   *   <li>When {@code -,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDoublePercent(String)}
   */
  @Test
  @DisplayName("Test parseDoublePercent(String); when '-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDoublePercent(String)"})
  void testParseDoublePercent_whenDashComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDoublePercent("-,"));
  }

  /**
   * Test {@link LoaderUtils#parseDoublePercent(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDoublePercent(String)}
   */
  @Test
  @DisplayName(
      "Test parseDoublePercent(String); when empty string; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDoublePercent(String)"})
  void testParseDoublePercent_whenEmptyString_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDoublePercent(""));
  }

  /**
   * Test {@link LoaderUtils#parseDoublePercent(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDoublePercent(String)}
   */
  @Test
  @DisplayName("Test parseDoublePercent(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDoublePercent(String)"})
  void testParseDoublePercent_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDoublePercent("("));
  }

  /**
   * Test {@link LoaderUtils#parseDoublePercent(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDoublePercent(String)}
   */
  @Test
  @DisplayName("Test parseDoublePercent(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDoublePercent(String)"})
  void testParseDoublePercent_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDoublePercent("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseDoublePercent(String)}.
   *
   * <ul>
   *   <li>When {@code {U},}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDoublePercent(String)}
   */
  @Test
  @DisplayName("Test parseDoublePercent(String); when '{U},'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDoublePercent(String)"})
  void testParseDoublePercent_whenU_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDoublePercent("{U},"));
  }

  /**
   * Test {@link LoaderUtils#parseDoublePercent(String)}.
   *
   * <ul>
   *   <li>When {@code ({U}}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDoublePercent(String)}
   */
  @Test
  @DisplayName("Test parseDoublePercent(String); when '({U}'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double LoaderUtils.parseDoublePercent(String)"})
  void testParseDoublePercent_whenU_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDoublePercent("({U}"));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code 2.3}.
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 2.3}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimal(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimal(String); when '2.3'; then return BigDecimal(String) with '2.3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimal(String)"})
  void testParseBigDecimal_when23_thenReturnBigDecimalWith23() {
    // Arrange and Act
    BigDecimal actualParseBigDecimalResult = LoaderUtils.parseBigDecimal("2.3");

    // Assert
    assertEquals(new BigDecimal("2.3"), actualParseBigDecimalResult);
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code 2.3,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimal(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimal(String); when '2.3,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimal(String)"})
  void testParseBigDecimal_when23_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimal("2.3,"));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code (2.3}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimal(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimal(String); when '(2.3'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimal(String)"})
  void testParseBigDecimal_when23_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimal("(2.3"));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code 2.3com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimal(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimal(String); when '2.3com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimal(String)"})
  void testParseBigDecimal_when23comOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> LoaderUtils.parseBigDecimal("2.3com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimal(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimal(String); when 'com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimal(String)"})
  void testParseBigDecimal_whenComOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> LoaderUtils.parseBigDecimal("com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimal(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimal(String); when ','; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimal(String)"})
  void testParseBigDecimal_whenComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimal(","));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code -,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimal(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimal(String); when '-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimal(String)"})
  void testParseBigDecimal_whenDashComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimal("-,"));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimal(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimal(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimal(String)"})
  void testParseBigDecimal_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimal("("));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code 2.3}.
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 0.023}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalPercent(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimalPercent(String); when '2.3'; then return BigDecimal(String) with '0.023'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalPercent(String)"})
  void testParseBigDecimalPercent_when23_thenReturnBigDecimalWith0023() {
    // Arrange and Act
    BigDecimal actualParseBigDecimalPercentResult = LoaderUtils.parseBigDecimalPercent("2.3");

    // Assert
    assertEquals(new BigDecimal("0.023"), actualParseBigDecimalPercentResult);
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code 2.3,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimalPercent(String); when '2.3,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalPercent(String)"})
  void testParseBigDecimalPercent_when23_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimalPercent("2.3,"));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code (2.3}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimalPercent(String); when '(2.3'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalPercent(String)"})
  void testParseBigDecimalPercent_when23_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimalPercent("(2.3"));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code 2.3com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalPercent(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimalPercent(String); when '2.3com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalPercent(String)"})
  void testParseBigDecimalPercent_when23comOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            LoaderUtils.parseBigDecimalPercent(
                "2.3com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalPercent(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimalPercent(String); when 'com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalPercent(String)"})
  void testParseBigDecimalPercent_whenComOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            LoaderUtils.parseBigDecimalPercent(
                "com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimalPercent(String); when ','; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalPercent(String)"})
  void testParseBigDecimalPercent_whenComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimalPercent(","));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code -,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimalPercent(String); when '-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalPercent(String)"})
  void testParseBigDecimalPercent_whenDashComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimalPercent("-,"));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimalPercent(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalPercent(String)"})
  void testParseBigDecimalPercent_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimalPercent("("));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code 2.3}.
   *   <li>Then return {@link BigDecimal#BigDecimal(String)} with {@code 0.00023}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimalBasisPoint(String); when '2.3'; then return BigDecimal(String) with '0.00023'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalBasisPoint(String)"})
  void testParseBigDecimalBasisPoint_when23_thenReturnBigDecimalWith000023() {
    // Arrange and Act
    BigDecimal actualParseBigDecimalBasisPointResult = LoaderUtils.parseBigDecimalBasisPoint("2.3");

    // Assert
    assertEquals(new BigDecimal("0.00023"), actualParseBigDecimalBasisPointResult);
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code 2.3,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimalBasisPoint(String); when '2.3,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalBasisPoint(String)"})
  void testParseBigDecimalBasisPoint_when23_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimalBasisPoint("2.3,"));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code (2.3}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimalBasisPoint(String); when '(2.3'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalBasisPoint(String)"})
  void testParseBigDecimalBasisPoint_when23_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimalBasisPoint("(2.3"));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code 2.3com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimalBasisPoint(String); when '2.3com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalBasisPoint(String)"})
  void testParseBigDecimalBasisPoint_when23comOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            LoaderUtils.parseBigDecimalBasisPoint(
                "2.3com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimalBasisPoint(String); when 'com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalBasisPoint(String)"})
  void testParseBigDecimalBasisPoint_whenComOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            LoaderUtils.parseBigDecimalBasisPoint(
                "com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimalBasisPoint(String); when ','; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalBasisPoint(String)"})
  void testParseBigDecimalBasisPoint_whenComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimalBasisPoint(","));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code -,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName(
      "Test parseBigDecimalBasisPoint(String); when '-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalBasisPoint(String)"})
  void testParseBigDecimalBasisPoint_whenDashComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimalBasisPoint("-,"));
  }

  /**
   * Test {@link LoaderUtils#parseBigDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBigDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName("Test parseBigDecimalBasisPoint(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BigDecimal LoaderUtils.parseBigDecimalBasisPoint(String)"})
  void testParseBigDecimalBasisPoint_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBigDecimalBasisPoint("("));
  }

  /**
   * Test {@link LoaderUtils#parseDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return negated signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimal(String)}
   */
  @Test
  @DisplayName("Test parseDecimal(String); when '42'; then return negated signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimal(String)"})
  void testParseDecimal_when42_thenReturnNegatedSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualParseDecimalResult = LoaderUtils.parseDecimal("42");

    // Assert
    Decimal negatedResult = actualParseDecimalResult.negated();
    assertEquals(-1, negatedResult.signum());
    assertEquals(0, negatedResult.scale());
    assertEquals(0, actualParseDecimalResult.scale());
    assertEquals(1, actualParseDecimalResult.signum());
    assertFalse(negatedResult.isZero());
    assertFalse(actualParseDecimalResult.isZero());
    assertEquals(actualParseDecimalResult, negatedResult.abs());
    Decimal actualAbsResult = actualParseDecimalResult.abs();
    assertEquals(actualParseDecimalResult, actualAbsResult);
    assertEquals(actualParseDecimalResult, negatedResult.negated());
  }

  /**
   * Test {@link LoaderUtils#parseDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code 42-,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimal(String)}
   */
  @Test
  @DisplayName("Test parseDecimal(String); when '42-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimal(String)"})
  void testParseDecimal_when42_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimal("42-,"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code B}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimal(String)}
   */
  @Test
  @DisplayName("Test parseDecimal(String); when 'B'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimal(String)"})
  void testParseDecimal_whenB_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimal("B"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimal(String)}
   */
  @Test
  @DisplayName("Test parseDecimal(String); when 'com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimal(String)"})
  void testParseDecimal_whenComOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> LoaderUtils.parseDecimal("com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimal(String)}
   */
  @Test
  @DisplayName("Test parseDecimal(String); when ','; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimal(String)"})
  void testParseDecimal_whenComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimal(","));
  }

  /**
   * Test {@link LoaderUtils#parseDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code -,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimal(String)}
   */
  @Test
  @DisplayName("Test parseDecimal(String); when '-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimal(String)"})
  void testParseDecimal_whenDashComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimal("-,"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimal(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimal(String)}
   */
  @Test
  @DisplayName("Test parseDecimal(String); when empty string; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimal(String)"})
  void testParseDecimal_whenEmptyString_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimal(""));
  }

  /**
   * Test {@link LoaderUtils#parseDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimal(String)}
   */
  @Test
  @DisplayName("Test parseDecimal(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimal(String)"})
  void testParseDecimal_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimal("("));
  }

  /**
   * Test {@link LoaderUtils#parseDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimal(String)}
   */
  @Test
  @DisplayName("Test parseDecimal(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimal(String)"})
  void testParseDecimal_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimal("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code {U},}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimal(String)}
   */
  @Test
  @DisplayName("Test parseDecimal(String); when '{U},'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimal(String)"})
  void testParseDecimal_whenU_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimal("{U},"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimal(String)}.
   *
   * <ul>
   *   <li>When {@code ({U}}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimal(String)}
   */
  @Test
  @DisplayName("Test parseDecimal(String); when '({U}'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimal(String)"})
  void testParseDecimal_whenU_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimal("({U}"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return negated signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalPercent(String)}
   */
  @Test
  @DisplayName(
      "Test parseDecimalPercent(String); when '42'; then return negated signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalPercent(String)"})
  void testParseDecimalPercent_when42_thenReturnNegatedSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualParseDecimalPercentResult = LoaderUtils.parseDecimalPercent("42");

    // Assert
    Decimal negatedResult = actualParseDecimalPercentResult.negated();
    assertEquals(-1, negatedResult.signum());
    assertEquals(1, actualParseDecimalPercentResult.signum());
    assertEquals(2, negatedResult.scale());
    assertEquals(2, actualParseDecimalPercentResult.scale());
    assertFalse(negatedResult.isZero());
    assertFalse(actualParseDecimalPercentResult.isZero());
    assertEquals(actualParseDecimalPercentResult, negatedResult.abs());
    Decimal actualAbsResult = actualParseDecimalPercentResult.abs();
    assertEquals(actualParseDecimalPercentResult, actualAbsResult);
    assertEquals(actualParseDecimalPercentResult, negatedResult.negated());
  }

  /**
   * Test {@link LoaderUtils#parseDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code 42-,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseDecimalPercent(String); when '42-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalPercent(String)"})
  void testParseDecimalPercent_when42_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalPercent("42-,"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code B}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseDecimalPercent(String); when 'B'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalPercent(String)"})
  void testParseDecimalPercent_whenB_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalPercent("B"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalPercent(String)}
   */
  @Test
  @DisplayName(
      "Test parseDecimalPercent(String); when 'com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalPercent(String)"})
  void testParseDecimalPercent_whenComOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> LoaderUtils.parseDecimalPercent("com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseDecimalPercent(String); when ','; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalPercent(String)"})
  void testParseDecimalPercent_whenComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalPercent(","));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code -,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseDecimalPercent(String); when '-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalPercent(String)"})
  void testParseDecimalPercent_whenDashComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalPercent("-,"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalPercent(String)}
   */
  @Test
  @DisplayName(
      "Test parseDecimalPercent(String); when empty string; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalPercent(String)"})
  void testParseDecimalPercent_whenEmptyString_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalPercent(""));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseDecimalPercent(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalPercent(String)"})
  void testParseDecimalPercent_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalPercent("("));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseDecimalPercent(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalPercent(String)"})
  void testParseDecimalPercent_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalPercent("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code {U},}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseDecimalPercent(String); when '{U},'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalPercent(String)"})
  void testParseDecimalPercent_whenU_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalPercent("{U},"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalPercent(String)}.
   *
   * <ul>
   *   <li>When {@code ({U}}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalPercent(String)}
   */
  @Test
  @DisplayName("Test parseDecimalPercent(String); when '({U}'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalPercent(String)"})
  void testParseDecimalPercent_whenU_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalPercent("({U}"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return negated signum is minus one.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName(
      "Test parseDecimalBasisPoint(String); when '42'; then return negated signum is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalBasisPoint(String)"})
  void testParseDecimalBasisPoint_when42_thenReturnNegatedSignumIsMinusOne() {
    // Arrange and Act
    Decimal actualParseDecimalBasisPointResult = LoaderUtils.parseDecimalBasisPoint("42");

    // Assert
    Decimal negatedResult = actualParseDecimalBasisPointResult.negated();
    assertEquals(-1, negatedResult.signum());
    assertEquals(1, actualParseDecimalBasisPointResult.signum());
    assertEquals(4, negatedResult.scale());
    assertEquals(4, actualParseDecimalBasisPointResult.scale());
    assertFalse(negatedResult.isZero());
    assertFalse(actualParseDecimalBasisPointResult.isZero());
    assertEquals(actualParseDecimalBasisPointResult, negatedResult.abs());
    Decimal actualAbsResult = actualParseDecimalBasisPointResult.abs();
    assertEquals(actualParseDecimalBasisPointResult, actualAbsResult);
    assertEquals(actualParseDecimalBasisPointResult, negatedResult.negated());
  }

  /**
   * Test {@link LoaderUtils#parseDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code 42-,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName("Test parseDecimalBasisPoint(String); when '42-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalBasisPoint(String)"})
  void testParseDecimalBasisPoint_when42_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalBasisPoint("42-,"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code B}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName("Test parseDecimalBasisPoint(String); when 'B'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalBasisPoint(String)"})
  void testParseDecimalBasisPoint_whenB_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalBasisPoint("B"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName(
      "Test parseDecimalBasisPoint(String); when 'com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalBasisPoint(String)"})
  void testParseDecimalBasisPoint_whenComOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            LoaderUtils.parseDecimalBasisPoint(
                "com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName("Test parseDecimalBasisPoint(String); when ','; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalBasisPoint(String)"})
  void testParseDecimalBasisPoint_whenComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalBasisPoint(","));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code -,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName("Test parseDecimalBasisPoint(String); when '-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalBasisPoint(String)"})
  void testParseDecimalBasisPoint_whenDashComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalBasisPoint("-,"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName(
      "Test parseDecimalBasisPoint(String); when empty string; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalBasisPoint(String)"})
  void testParseDecimalBasisPoint_whenEmptyString_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalBasisPoint(""));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName("Test parseDecimalBasisPoint(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalBasisPoint(String)"})
  void testParseDecimalBasisPoint_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalBasisPoint("("));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName("Test parseDecimalBasisPoint(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalBasisPoint(String)"})
  void testParseDecimalBasisPoint_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalBasisPoint("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code {U},}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName("Test parseDecimalBasisPoint(String); when '{U},'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalBasisPoint(String)"})
  void testParseDecimalBasisPoint_whenU_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalBasisPoint("{U},"));
  }

  /**
   * Test {@link LoaderUtils#parseDecimalBasisPoint(String)}.
   *
   * <ul>
   *   <li>When {@code ({U}}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDecimalBasisPoint(String)}
   */
  @Test
  @DisplayName("Test parseDecimalBasisPoint(String); when '({U}'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Decimal LoaderUtils.parseDecimalBasisPoint(String)"})
  void testParseDecimalBasisPoint_whenU_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDecimalBasisPoint("({U}"));
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName(
      "Test parsePercentage(String); when '42'; then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_when42_thenReturnToDecimalFormAbsAbsIsToDecimalForm() {
    // Arrange and Act
    Percentage actualParsePercentageResult = LoaderUtils.parsePercentage("42");

    // Assert
    Decimal toDecimalFormResult = actualParsePercentageResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualParsePercentageResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code 42%}.
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName(
      "Test parsePercentage(String); when '42%'; then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_when42_thenReturnToDecimalFormAbsAbsIsToDecimalForm2() {
    // Arrange and Act
    Percentage actualParsePercentageResult = LoaderUtils.parsePercentage("42%");

    // Assert
    Decimal toDecimalFormResult = actualParsePercentageResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualParsePercentageResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code 42-,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName("Test parsePercentage(String); when '42-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_when42_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePercentage("42-,"));
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code 42pct}.
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName(
      "Test parsePercentage(String); when '42pct'; then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_when42pct_thenReturnToDecimalFormAbsAbsIsToDecimalForm() {
    // Arrange and Act
    Percentage actualParsePercentageResult = LoaderUtils.parsePercentage("42pct");

    // Assert
    Decimal toDecimalFormResult = actualParsePercentageResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valuePercentResult = actualParsePercentageResult.valuePercent();
    assertEquals(valuePercentResult, valuePercentResult.abs().abs());
    Decimal negatedResult2 = valuePercentResult.negated();
    assertEquals(valuePercentResult, negatedResult2.abs());
    assertEquals(valuePercentResult, negatedResult2.negated());
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code B}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName("Test parsePercentage(String); when 'B'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_whenB_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePercentage("B"));
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName("Test parsePercentage(String); when ','; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_whenComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePercentage(","));
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code -,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName("Test parsePercentage(String); when '-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_whenDashComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePercentage("-,"));
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName("Test parsePercentage(String); when empty string; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_whenEmptyString_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePercentage(""));
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName("Test parsePercentage(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePercentage("("));
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code pct}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName("Test parsePercentage(String); when 'pct'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_whenPct_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePercentage("pct"));
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code %}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName("Test parsePercentage(String); when '%'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_whenPercentSign_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePercentage("%"));
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName("Test parsePercentage(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePercentage("Str"));
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code {U},}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName("Test parsePercentage(String); when '{U},'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_whenU_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePercentage("{U},"));
  }

  /**
   * Test {@link LoaderUtils#parsePercentage(String)}.
   *
   * <ul>
   *   <li>When {@code ({U}}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePercentage(String)}
   */
  @Test
  @DisplayName("Test parsePercentage(String); when '({U}'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Percentage LoaderUtils.parsePercentage(String)"})
  void testParsePercentage_whenU_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePercentage("({U}"));
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName(
      "Test parseBasisPoints(String); when '42'; then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_when42_thenReturnToDecimalFormAbsAbsIsToDecimalForm() {
    // Arrange and Act
    BasisPoints actualParseBasisPointsResult = LoaderUtils.parseBasisPoints("42");

    // Assert
    Decimal toDecimalFormResult = actualParseBasisPointsResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualParseBasisPointsResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code 42-,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName("Test parseBasisPoints(String); when '42-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_when42_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBasisPoints("42-,"));
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code 42bps}.
   *   <li>Then return toDecimalForm abs abs is toDecimalForm.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName(
      "Test parseBasisPoints(String); when '42bps'; then return toDecimalForm abs abs is toDecimalForm")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_when42bps_thenReturnToDecimalFormAbsAbsIsToDecimalForm() {
    // Arrange and Act
    BasisPoints actualParseBasisPointsResult = LoaderUtils.parseBasisPoints("42bps");

    // Assert
    Decimal toDecimalFormResult = actualParseBasisPointsResult.toDecimalForm();
    assertEquals(toDecimalFormResult, toDecimalFormResult.abs().abs());
    Decimal negatedResult = toDecimalFormResult.negated();
    assertEquals(toDecimalFormResult, negatedResult.abs());
    assertEquals(toDecimalFormResult, negatedResult.negated());
    Decimal valueBasisPointsResult = actualParseBasisPointsResult.valueBasisPoints();
    assertEquals(valueBasisPointsResult, valueBasisPointsResult.abs().abs());
    Decimal negatedResult2 = valueBasisPointsResult.negated();
    assertEquals(valueBasisPointsResult, negatedResult2.abs());
    assertEquals(valueBasisPointsResult, negatedResult2.negated());
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code B}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName("Test parseBasisPoints(String); when 'B'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_whenB_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBasisPoints("B"));
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code bps}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName("Test parseBasisPoints(String); when 'bps'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_whenBps_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBasisPoints("bps"));
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code com.opengamma.strata.collect.result.FailureItem:}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName(
      "Test parseBasisPoints(String); when 'com.opengamma.strata.collect.result.FailureItem:'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_whenComOpengammaStrataCollectResultFailureItem() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> LoaderUtils.parseBasisPoints("com.opengamma.strata.collect.result.FailureItem: "));
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code ,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName("Test parseBasisPoints(String); when ','; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_whenComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBasisPoints(","));
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code -,}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName("Test parseBasisPoints(String); when '-,'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_whenDashComma_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBasisPoints("-,"));
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName("Test parseBasisPoints(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBasisPoints("("));
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName("Test parseBasisPoints(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBasisPoints("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code {U},}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName("Test parseBasisPoints(String); when '{U},'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_whenU_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBasisPoints("{U},"));
  }

  /**
   * Test {@link LoaderUtils#parseBasisPoints(String)}.
   *
   * <ul>
   *   <li>When {@code ({U}}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBasisPoints(String)}
   */
  @Test
  @DisplayName("Test parseBasisPoints(String); when '({U}'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BasisPoints LoaderUtils.parseBasisPoints(String)"})
  void testParseBasisPoints_whenU_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBasisPoints("({U}"));
  }

  /**
   * Test {@link LoaderUtils#parseDate(String, DateTimeFormatter[])} with {@code str}, {@code
   * formatters}.
   *
   * <ul>
   *   <li>When {@code null} and {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDate(String, DateTimeFormatter[])}
   */
  @Test
  @DisplayName(
      "Test parseDate(String, DateTimeFormatter[]) with 'str', 'formatters'; when 'null' and 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.LocalDate LoaderUtils.parseDate(String, DateTimeFormatter[])"})
  void testParseDateWithStrFormatters_whenNullAndNull_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDate("Str", null, null));
  }

  /**
   * Test {@link LoaderUtils#parseDate(String)} with {@code str}.
   *
   * <ul>
   *   <li>When a string.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDate(String)}
   */
  @Test
  @DisplayName("Test parseDate(String) with 'str'; when a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.LocalDate LoaderUtils.parseDate(String)"})
  void testParseDateWithStr_whenAString() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            LoaderUtils.parseDate(
                "Unable to parse date from '{value}', must be formatted as 'yyyy-MM-dd', 'yyyyMMdd', 'yyyy/M/d',"
                    + " 'd/M/yyyy', 'd-MMM-yyyy', 'dMMMyyyy', 'd/M/yy', 'd-MMM-yy' or 'dMMMyy'"));
  }

  /**
   * Test {@link LoaderUtils#parseDate(String)} with {@code str}.
   *
   * <ul>
   *   <li>When {@code stackTrace}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDate(String)}
   */
  @Test
  @DisplayName("Test parseDate(String) with 'str'; when 'stackTrace'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.LocalDate LoaderUtils.parseDate(String)"})
  void testParseDateWithStr_whenStackTrace() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDate("stackTrace"));
  }

  /**
   * Test {@link LoaderUtils#parseDate(String)} with {@code str}.
   *
   * <ul>
   *   <li>When {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDate(String)}
   */
  @Test
  @DisplayName("Test parseDate(String) with 'str'; when 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.LocalDate LoaderUtils.parseDate(String)"})
  void testParseDateWithStr_whenStr() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDate("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseDate(String)} with {@code str}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDate(String)}
   */
  @Test
  @DisplayName("Test parseDate(String) with 'str'; when '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.LocalDate LoaderUtils.parseDate(String)"})
  void testParseDateWithStr_whenU() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDate("{U}"));
  }

  /**
   * Test {@link LoaderUtils#parseDate(String)} with {@code str}.
   *
   * <ul>
   *   <li>When {@code {U}cause}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDate(String)}
   */
  @Test
  @DisplayName("Test parseDate(String) with 'str'; when '{U}cause'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.LocalDate LoaderUtils.parseDate(String)"})
  void testParseDateWithStr_whenUCause() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDate("{U}cause"));
  }

  /**
   * Test {@link LoaderUtils#parseYearMonth(String)}.
   *
   * <ul>
   *   <li>When {@code 42{U}}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseYearMonth(String)}
   */
  @Test
  @DisplayName("Test parseYearMonth(String); when '42{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.YearMonth LoaderUtils.parseYearMonth(String)"})
  void testParseYearMonth_when42U() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseYearMonth("42{U}"));
  }

  /**
   * Test {@link LoaderUtils#parseYearMonth(String)}.
   *
   * <ul>
   *   <li>When a string.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseYearMonth(String)}
   */
  @Test
  @DisplayName("Test parseYearMonth(String); when a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.YearMonth LoaderUtils.parseYearMonth(String)"})
  void testParseYearMonth_whenAString() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            LoaderUtils.parseYearMonth(
                "Unable to parse year-month from '{value}', must be formatted as 'yyyy-MM', 'yyyyMM', 'MMM-yyyy',"
                    + " 'MMMyyyy', 'MMM-yy' or 'MMMyy'"));
  }

  /**
   * Test {@link LoaderUtils#parseYearMonth(String)}.
   *
   * <ul>
   *   <li>When a string.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseYearMonth(String)}
   */
  @Test
  @DisplayName("Test parseYearMonth(String); when a string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.YearMonth LoaderUtils.parseYearMonth(String)"})
  void testParseYearMonth_whenAString2() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            LoaderUtils.parseYearMonth(
                "42Unable to parse year-month from '{value}', must be formatted as 'yyyy-MM', 'yyyyMM', 'MMM-yyyy',"
                    + " 'MMMyyyy', 'MMM-yy' or 'MMMyy'"));
  }

  /**
   * Test {@link LoaderUtils#parseYearMonth(String)}.
   *
   * <ul>
   *   <li>When {@code message}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseYearMonth(String)}
   */
  @Test
  @DisplayName("Test parseYearMonth(String); when 'message'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.YearMonth LoaderUtils.parseYearMonth(String)"})
  void testParseYearMonth_whenMessage() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseYearMonth("message"));
  }

  /**
   * Test {@link LoaderUtils#parseYearMonth(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseYearMonth(String)}
   */
  @Test
  @DisplayName("Test parseYearMonth(String); when 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.YearMonth LoaderUtils.parseYearMonth(String)"})
  void testParseYearMonth_whenStr() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseYearMonth("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseTime(String)}.
   *
   * <p>Method under test: {@link LoaderUtils#parseTime(String)}
   */
  @Test
  @DisplayName("Test parseTime(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.LocalTime LoaderUtils.parseTime(String)"})
  void testParseTime() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseTime("Str"));
  }

  /**
   * Test {@link LoaderUtils#parsePeriod(String)}.
   *
   * <ul>
   *   <li>When {@code P}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePeriod(String)}
   */
  @Test
  @DisplayName("Test parsePeriod(String); when 'P'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Period LoaderUtils.parsePeriod(String)"})
  void testParsePeriod_whenP() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePeriod("P"));
  }

  /**
   * Test {@link LoaderUtils#parsePeriod(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parsePeriod(String)}
   */
  @Test
  @DisplayName("Test parsePeriod(String); when 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Period LoaderUtils.parsePeriod(String)"})
  void testParsePeriod_whenStr() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePeriod("Str"));
  }

  /**
   * Test {@link LoaderUtils#tryParsePeriod(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParsePeriod(String)}
   */
  @Test
  @DisplayName("Test tryParsePeriod(String); when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParsePeriod(String)"})
  void testTryParsePeriod_whenNull_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Period> actualTryParsePeriodResult = LoaderUtils.tryParsePeriod(null);

    // Assert
    assertFalse(actualTryParsePeriodResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParsePeriod(String)}.
   *
   * <ul>
   *   <li>When {@code P{U}}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParsePeriod(String)}
   */
  @Test
  @DisplayName("Test tryParsePeriod(String); when 'P{U}'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParsePeriod(String)"})
  void testTryParsePeriod_whenPU_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Period> actualTryParsePeriodResult = LoaderUtils.tryParsePeriod("P{U}");

    // Assert
    assertFalse(actualTryParsePeriodResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParsePeriod(String)}.
   *
   * <ul>
   *   <li>When {@code P}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParsePeriod(String)}
   */
  @Test
  @DisplayName("Test tryParsePeriod(String); when 'P'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParsePeriod(String)"})
  void testTryParsePeriod_whenP_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Period> actualTryParsePeriodResult = LoaderUtils.tryParsePeriod("P");

    // Assert
    assertFalse(actualTryParsePeriodResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParsePeriod(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParsePeriod(String)}
   */
  @Test
  @DisplayName("Test tryParsePeriod(String); when 'Str'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParsePeriod(String)"})
  void testTryParsePeriod_whenStr_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Period> actualTryParsePeriodResult = LoaderUtils.tryParsePeriod("Str");

    // Assert
    assertFalse(actualTryParsePeriodResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#parseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test parseMarketTenor(String); when empty string; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor LoaderUtils.parseMarketTenor(String)"})
  void testParseMarketTenor_whenEmptyString_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseMarketTenor(""));
  }

  /**
   * Test {@link LoaderUtils#parseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test parseMarketTenor(String); when 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor LoaderUtils.parseMarketTenor(String)"})
  void testParseMarketTenor_whenNull_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseMarketTenor(null));
  }

  /**
   * Test {@link LoaderUtils#parseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code ON}.
   *   <li>Then return Code is {@code ON}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test parseMarketTenor(String); when 'ON'; then return Code is 'ON'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor LoaderUtils.parseMarketTenor(String)"})
  void testParseMarketTenor_whenOn_thenReturnCodeIsOn() {
    // Arrange and Act
    MarketTenor actualParseMarketTenorResult = LoaderUtils.parseMarketTenor("ON");

    // Assert
    assertEquals("ON", actualParseMarketTenorResult.getCode());
    assertEquals("ON", actualParseMarketTenorResult.toString());
    assertTrue(actualParseMarketTenorResult.isNonStandardSpotLag());
  }

  /**
   * Test {@link LoaderUtils#parseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code P}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test parseMarketTenor(String); when 'P'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor LoaderUtils.parseMarketTenor(String)"})
  void testParseMarketTenor_whenP_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseMarketTenor("P"));
  }

  /**
   * Test {@link LoaderUtils#parseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code SN}.
   *   <li>Then return Code is {@code SN}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test parseMarketTenor(String); when 'SN'; then return Code is 'SN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor LoaderUtils.parseMarketTenor(String)"})
  void testParseMarketTenor_whenSn_thenReturnCodeIsSn() {
    // Arrange and Act
    MarketTenor actualParseMarketTenorResult = LoaderUtils.parseMarketTenor("SN");

    // Assert
    assertEquals("SN", actualParseMarketTenorResult.getCode());
    assertEquals("SN", actualParseMarketTenorResult.toString());
    assertFalse(actualParseMarketTenorResult.isNonStandardSpotLag());
  }

  /**
   * Test {@link LoaderUtils#parseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test parseMarketTenor(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor LoaderUtils.parseMarketTenor(String)"})
  void testParseMarketTenor_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseMarketTenor("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code SW}.
   *   <li>Then return Tenor toString is {@code 1W}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test parseMarketTenor(String); when 'SW'; then return Tenor toString is '1W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor LoaderUtils.parseMarketTenor(String)"})
  void testParseMarketTenor_whenSw_thenReturnTenorToStringIs1w() {
    // Arrange and Act
    MarketTenor actualParseMarketTenorResult = LoaderUtils.parseMarketTenor("SW");

    // Assert
    Tenor tenor = actualParseMarketTenorResult.getTenor();
    assertEquals("1W", tenor.toString());
    assertEquals("SW", actualParseMarketTenorResult.getCode());
    assertEquals("SW", actualParseMarketTenorResult.toString());
    assertEquals(7, tenor.getPeriod().getDays());
    assertTrue(tenor.isWeekBased());
  }

  /**
   * Test {@link LoaderUtils#parseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code TN}.
   *   <li>Then return Code is {@code TN}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test parseMarketTenor(String); when 'TN'; then return Code is 'TN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketTenor LoaderUtils.parseMarketTenor(String)"})
  void testParseMarketTenor_whenTn_thenReturnCodeIsTn() {
    // Arrange and Act
    MarketTenor actualParseMarketTenorResult = LoaderUtils.parseMarketTenor("TN");

    // Assert
    assertEquals("TN", actualParseMarketTenorResult.getCode());
    assertEquals("TN", actualParseMarketTenorResult.toString());
    assertTrue(actualParseMarketTenorResult.isNonStandardSpotLag());
  }

  /**
   * Test {@link LoaderUtils#tryParseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code 42D}.
   *   <li>Then return {@link Optional#get()} Code is {@code 6W}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseMarketTenor(String); when '42D'; then return get() Code is '6W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseMarketTenor(String)"})
  void testTryParseMarketTenor_when42d_thenReturnGetCodeIs6w() {
    // Arrange and Act
    Optional<MarketTenor> actualTryParseMarketTenorResult = LoaderUtils.tryParseMarketTenor("42D");

    // Assert
    MarketTenor getResult = actualTryParseMarketTenorResult.get();
    assertEquals("6W", getResult.getCode());
    assertEquals("6W", getResult.toString());
    Tenor tenor = getResult.getTenor();
    assertEquals("6W", tenor.toString());
    assertEquals(42, tenor.getPeriod().getDays());
  }

  /**
   * Test {@link LoaderUtils#tryParseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseMarketTenor(String); when empty string; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseMarketTenor(String)"})
  void testTryParseMarketTenor_whenEmptyString_thenReturnNotPresent() {
    // Arrange and Act
    Optional<MarketTenor> actualTryParseMarketTenorResult = LoaderUtils.tryParseMarketTenor("");

    // Assert
    assertFalse(actualTryParseMarketTenorResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseMarketTenor(String); when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseMarketTenor(String)"})
  void testTryParseMarketTenor_whenNull_thenReturnNotPresent() {
    // Arrange and Act
    Optional<MarketTenor> actualTryParseMarketTenorResult = LoaderUtils.tryParseMarketTenor(null);

    // Assert
    assertFalse(actualTryParseMarketTenorResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code ON}.
   *   <li>Then return {@link Optional#get()} Code is {@code ON}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseMarketTenor(String); when 'ON'; then return get() Code is 'ON'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseMarketTenor(String)"})
  void testTryParseMarketTenor_whenOn_thenReturnGetCodeIsOn() {
    // Arrange and Act
    Optional<MarketTenor> actualTryParseMarketTenorResult = LoaderUtils.tryParseMarketTenor("ON");

    // Assert
    MarketTenor getResult = actualTryParseMarketTenorResult.get();
    assertEquals("ON", getResult.getCode());
    assertEquals("ON", getResult.toString());
    assertTrue(getResult.isNonStandardSpotLag());
  }

  /**
   * Test {@link LoaderUtils#tryParseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code PtoParse}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseMarketTenor(String); when 'PtoParse'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseMarketTenor(String)"})
  void testTryParseMarketTenor_whenPtoParse_thenReturnNotPresent() {
    // Arrange and Act
    Optional<MarketTenor> actualTryParseMarketTenorResult =
        LoaderUtils.tryParseMarketTenor("PtoParse");

    // Assert
    assertFalse(actualTryParseMarketTenorResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code SN}.
   *   <li>Then return {@link Optional#get()} Tenor toString is {@code 1D}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseMarketTenor(String)}
   */
  @Test
  @DisplayName(
      "Test tryParseMarketTenor(String); when 'SN'; then return get() Tenor toString is '1D'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseMarketTenor(String)"})
  void testTryParseMarketTenor_whenSn_thenReturnGetTenorToStringIs1d() {
    // Arrange and Act
    Optional<MarketTenor> actualTryParseMarketTenorResult = LoaderUtils.tryParseMarketTenor("SN");

    // Assert
    MarketTenor getResult = actualTryParseMarketTenorResult.get();
    Tenor tenor = getResult.getTenor();
    assertEquals("1D", tenor.toString());
    assertEquals("SN", getResult.getCode());
    assertEquals("SN", getResult.toString());
    assertEquals(1, tenor.getPeriod().getDays());
    assertFalse(getResult.isNonStandardSpotLag());
    assertFalse(tenor.isWeekBased());
  }

  /**
   * Test {@link LoaderUtils#tryParseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseMarketTenor(String); when 'Str'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseMarketTenor(String)"})
  void testTryParseMarketTenor_whenStr_thenReturnNotPresent() {
    // Arrange and Act
    Optional<MarketTenor> actualTryParseMarketTenorResult = LoaderUtils.tryParseMarketTenor("Str");

    // Assert
    assertFalse(actualTryParseMarketTenorResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code SW}.
   *   <li>Then return {@link Optional#get()} Tenor toString is {@code 1W}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseMarketTenor(String)}
   */
  @Test
  @DisplayName(
      "Test tryParseMarketTenor(String); when 'SW'; then return get() Tenor toString is '1W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseMarketTenor(String)"})
  void testTryParseMarketTenor_whenSw_thenReturnGetTenorToStringIs1w() {
    // Arrange and Act
    Optional<MarketTenor> actualTryParseMarketTenorResult = LoaderUtils.tryParseMarketTenor("SW");

    // Assert
    MarketTenor getResult = actualTryParseMarketTenorResult.get();
    Tenor tenor = getResult.getTenor();
    assertEquals("1W", tenor.toString());
    assertEquals("SW", getResult.getCode());
    assertEquals("SW", getResult.toString());
    assertEquals(7, tenor.getPeriod().getDays());
  }

  /**
   * Test {@link LoaderUtils#tryParseMarketTenor(String)}.
   *
   * <ul>
   *   <li>When {@code TN}.
   *   <li>Then return {@link Optional#get()} Code is {@code TN}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseMarketTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseMarketTenor(String); when 'TN'; then return get() Code is 'TN'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseMarketTenor(String)"})
  void testTryParseMarketTenor_whenTn_thenReturnGetCodeIsTn() {
    // Arrange and Act
    Optional<MarketTenor> actualTryParseMarketTenorResult = LoaderUtils.tryParseMarketTenor("TN");

    // Assert
    MarketTenor getResult = actualTryParseMarketTenorResult.get();
    assertEquals("TN", getResult.getCode());
    assertEquals("TN", getResult.toString());
    assertTrue(getResult.isNonStandardSpotLag());
  }

  /**
   * Test {@link LoaderUtils#parseTenor(String)}.
   *
   * <ul>
   *   <li>When {@code P}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseTenor(String)}
   */
  @Test
  @DisplayName("Test parseTenor(String); when 'P'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor LoaderUtils.parseTenor(String)"})
  void testParseTenor_whenP() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseTenor("P"));
  }

  /**
   * Test {@link LoaderUtils#parseTenor(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseTenor(String)}
   */
  @Test
  @DisplayName("Test parseTenor(String); when 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Tenor LoaderUtils.parseTenor(String)"})
  void testParseTenor_whenStr() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseTenor("Str"));
  }

  /**
   * Test {@link LoaderUtils#tryParseTenor(String)}.
   *
   * <ul>
   *   <li>When {@code 42D}.
   *   <li>Then return {@link Optional#get()} Units size is three.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseTenor(String); when '42D'; then return get() Units size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseTenor(String)"})
  void testTryParseTenor_when42d_thenReturnGetUnitsSizeIsThree() {
    // Arrange and Act
    Optional<Tenor> actualTryParseTenorResult = LoaderUtils.tryParseTenor("42D");

    // Assert
    Tenor getResult = actualTryParseTenorResult.get();
    List<TemporalUnit> units = getResult.getUnits();
    assertEquals(3, units.size());
    TemporalUnit getResult2 = units.get(0);
    assertTrue(getResult2 instanceof ChronoUnit);
    TemporalUnit getResult3 = units.get(1);
    assertTrue(getResult3 instanceof ChronoUnit);
    TemporalUnit getResult4 = units.get(2);
    assertTrue(getResult4 instanceof ChronoUnit);
    assertEquals("6W", getResult.toString());
    Period period = getResult.getPeriod();
    assertEquals(0, period.getMonths());
    assertEquals(0, period.getYears());
    assertEquals(0L, period.toTotalMonths());
    assertEquals(42, period.getDays());
    assertEquals(ChronoUnit.DAYS, getResult4);
    assertEquals(ChronoUnit.MONTHS, getResult3);
    assertEquals(ChronoUnit.YEARS, getResult2);
    assertFalse(getResult.isMonthBased());
    assertFalse(period.isNegative());
    assertFalse(period.isZero());
    assertTrue(getResult.isWeekBased());
    assertTrue(actualTryParseTenorResult.isPresent());
    assertSame(units, period.getUnits());
  }

  /**
   * Test {@link LoaderUtils#tryParseTenor(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseTenor(String); when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseTenor(String)"})
  void testTryParseTenor_whenNull_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Tenor> actualTryParseTenorResult = LoaderUtils.tryParseTenor(null);

    // Assert
    assertFalse(actualTryParseTenorResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseTenor(String)}.
   *
   * <ul>
   *   <li>When {@code P}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseTenor(String); when 'P'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseTenor(String)"})
  void testTryParseTenor_whenP_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Tenor> actualTryParseTenorResult = LoaderUtils.tryParseTenor("P");

    // Assert
    assertFalse(actualTryParseTenorResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseTenor(String)}.
   *
   * <ul>
   *   <li>When {@code PP}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseTenor(String); when 'PP'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseTenor(String)"})
  void testTryParseTenor_whenPp_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Tenor> actualTryParseTenorResult = LoaderUtils.tryParseTenor("PP");

    // Assert
    assertFalse(actualTryParseTenorResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseTenor(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseTenor(String)}
   */
  @Test
  @DisplayName("Test tryParseTenor(String); when 'Str'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseTenor(String)"})
  void testTryParseTenor_whenStr_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Tenor> actualTryParseTenorResult = LoaderUtils.tryParseTenor("Str");

    // Assert
    assertFalse(actualTryParseTenorResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#parseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code 0T}.
   *   <li>Then return toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseFrequency(String)}
   */
  @Test
  @DisplayName("Test parseFrequency(String); when '0T'; then return toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency LoaderUtils.parseFrequency(String)"})
  void testParseFrequency_when0t_thenReturnToStringIsTerm() {
    // Arrange and Act
    Frequency actualParseFrequencyResult = LoaderUtils.parseFrequency("0T");

    // Assert
    assertEquals("Term", actualParseFrequencyResult.toString());
    assertEquals(0, actualParseFrequencyResult.eventsPerYear());
    assertEquals(0.0d, actualParseFrequencyResult.eventsPerYearEstimate());
    assertEquals(3, actualParseFrequencyResult.getUnits().size());
    assertFalse(actualParseFrequencyResult.isAnnual());
    assertFalse(actualParseFrequencyResult.isMonthBased());
    assertFalse(actualParseFrequencyResult.isWeekBased());
    assertTrue(actualParseFrequencyResult.isTerm());
  }

  /**
   * Test {@link LoaderUtils#parseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code 1T}.
   *   <li>Then return toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseFrequency(String)}
   */
  @Test
  @DisplayName("Test parseFrequency(String); when '1T'; then return toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency LoaderUtils.parseFrequency(String)"})
  void testParseFrequency_when1t_thenReturnToStringIsTerm() {
    // Arrange and Act
    Frequency actualParseFrequencyResult = LoaderUtils.parseFrequency("1T");

    // Assert
    assertEquals("Term", actualParseFrequencyResult.toString());
    assertEquals(0, actualParseFrequencyResult.eventsPerYear());
    assertEquals(0.0d, actualParseFrequencyResult.eventsPerYearEstimate());
    assertEquals(3, actualParseFrequencyResult.getUnits().size());
    assertFalse(actualParseFrequencyResult.isAnnual());
    assertFalse(actualParseFrequencyResult.isMonthBased());
    assertFalse(actualParseFrequencyResult.isWeekBased());
    assertTrue(actualParseFrequencyResult.isTerm());
  }

  /**
   * Test {@link LoaderUtils#parseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseFrequency(String)}
   */
  @Test
  @DisplayName("Test parseFrequency(String); when 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency LoaderUtils.parseFrequency(String)"})
  void testParseFrequency_whenNull_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseFrequency(null));
  }

  /**
   * Test {@link LoaderUtils#parseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code P}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseFrequency(String)}
   */
  @Test
  @DisplayName("Test parseFrequency(String); when 'P'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency LoaderUtils.parseFrequency(String)"})
  void testParseFrequency_whenP_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseFrequency("P"));
  }

  /**
   * Test {@link LoaderUtils#parseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseFrequency(String)}
   */
  @Test
  @DisplayName("Test parseFrequency(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency LoaderUtils.parseFrequency(String)"})
  void testParseFrequency_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseFrequency("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code T}.
   *   <li>Then return toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseFrequency(String)}
   */
  @Test
  @DisplayName("Test parseFrequency(String); when 'T'; then return toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency LoaderUtils.parseFrequency(String)"})
  void testParseFrequency_whenT_thenReturnToStringIsTerm() {
    // Arrange and Act
    Frequency actualParseFrequencyResult = LoaderUtils.parseFrequency("T");

    // Assert
    assertEquals("Term", actualParseFrequencyResult.toString());
    assertEquals(0, actualParseFrequencyResult.eventsPerYear());
    assertEquals(0.0d, actualParseFrequencyResult.eventsPerYearEstimate());
    assertEquals(3, actualParseFrequencyResult.getUnits().size());
    assertFalse(actualParseFrequencyResult.isAnnual());
    assertFalse(actualParseFrequencyResult.isMonthBased());
    assertFalse(actualParseFrequencyResult.isWeekBased());
    assertTrue(actualParseFrequencyResult.isTerm());
  }

  /**
   * Test {@link LoaderUtils#parseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code Term}.
   *   <li>Then return toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseFrequency(String)}
   */
  @Test
  @DisplayName("Test parseFrequency(String); when 'Term'; then return toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Frequency LoaderUtils.parseFrequency(String)"})
  void testParseFrequency_whenTerm_thenReturnToStringIsTerm() {
    // Arrange and Act
    Frequency actualParseFrequencyResult = LoaderUtils.parseFrequency("Term");

    // Assert
    assertEquals("Term", actualParseFrequencyResult.toString());
    assertEquals(0, actualParseFrequencyResult.eventsPerYear());
    assertEquals(0.0d, actualParseFrequencyResult.eventsPerYearEstimate());
    assertEquals(3, actualParseFrequencyResult.getUnits().size());
    assertFalse(actualParseFrequencyResult.isAnnual());
    assertFalse(actualParseFrequencyResult.isMonthBased());
    assertFalse(actualParseFrequencyResult.isWeekBased());
    assertTrue(actualParseFrequencyResult.isTerm());
  }

  /**
   * Test {@link LoaderUtils#tryParseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code 0T}.
   *   <li>Then return {@link Optional#get()} toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseFrequency(String)}
   */
  @Test
  @DisplayName("Test tryParseFrequency(String); when '0T'; then return get() toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseFrequency(String)"})
  void testTryParseFrequency_when0t_thenReturnGetToStringIsTerm() {
    // Arrange and Act
    Optional<Frequency> actualTryParseFrequencyResult = LoaderUtils.tryParseFrequency("0T");

    // Assert
    Frequency getResult = actualTryParseFrequencyResult.get();
    assertEquals("Term", getResult.toString());
    assertEquals(0, getResult.eventsPerYear());
    Period period = getResult.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0.0d, getResult.eventsPerYearEstimate());
    assertEquals(10000, period.getYears());
    assertEquals(120000L, period.toTotalMonths());
    assertFalse(getResult.isWeekBased());
    assertTrue(getResult.isTerm());
  }

  /**
   * Test {@link LoaderUtils#tryParseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code 1T}.
   *   <li>Then return {@link Optional#get()} toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseFrequency(String)}
   */
  @Test
  @DisplayName("Test tryParseFrequency(String); when '1T'; then return get() toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseFrequency(String)"})
  void testTryParseFrequency_when1t_thenReturnGetToStringIsTerm() {
    // Arrange and Act
    Optional<Frequency> actualTryParseFrequencyResult = LoaderUtils.tryParseFrequency("1T");

    // Assert
    Frequency getResult = actualTryParseFrequencyResult.get();
    assertEquals("Term", getResult.toString());
    assertEquals(0, getResult.eventsPerYear());
    Period period = getResult.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0.0d, getResult.eventsPerYearEstimate());
    assertEquals(10000, period.getYears());
    assertEquals(120000L, period.toTotalMonths());
    assertFalse(getResult.isWeekBased());
    assertTrue(getResult.isTerm());
  }

  /**
   * Test {@link LoaderUtils#tryParseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code 42D}.
   *   <li>Then return {@link Optional#get()} toString is {@code P6W}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseFrequency(String)}
   */
  @Test
  @DisplayName("Test tryParseFrequency(String); when '42D'; then return get() toString is 'P6W'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseFrequency(String)"})
  void testTryParseFrequency_when42d_thenReturnGetToStringIsP6w() {
    // Arrange and Act
    Optional<Frequency> actualTryParseFrequencyResult = LoaderUtils.tryParseFrequency("42D");

    // Assert
    Frequency getResult = actualTryParseFrequencyResult.get();
    assertEquals("P6W", getResult.toString());
    Period period = getResult.getPeriod();
    assertEquals(0, period.getYears());
    assertEquals(0L, period.toTotalMonths());
    assertEquals(42, period.getDays());
    assertEquals(8.666666666666666d, getResult.eventsPerYearEstimate());
    assertFalse(getResult.isTerm());
    assertTrue(getResult.isWeekBased());
  }

  /**
   * Test {@link LoaderUtils#tryParseFrequency(String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseFrequency(String)}
   */
  @Test
  @DisplayName("Test tryParseFrequency(String); when empty string; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseFrequency(String)"})
  void testTryParseFrequency_whenEmptyString_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Frequency> actualTryParseFrequencyResult = LoaderUtils.tryParseFrequency("");

    // Assert
    assertFalse(actualTryParseFrequencyResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseFrequency(String)}
   */
  @Test
  @DisplayName("Test tryParseFrequency(String); when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseFrequency(String)"})
  void testTryParseFrequency_whenNull_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Frequency> actualTryParseFrequencyResult = LoaderUtils.tryParseFrequency(null);

    // Assert
    assertFalse(actualTryParseFrequencyResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code P}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseFrequency(String)}
   */
  @Test
  @DisplayName("Test tryParseFrequency(String); when 'P'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseFrequency(String)"})
  void testTryParseFrequency_whenP_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Frequency> actualTryParseFrequencyResult = LoaderUtils.tryParseFrequency("P");

    // Assert
    assertFalse(actualTryParseFrequencyResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseFrequency(String)}
   */
  @Test
  @DisplayName("Test tryParseFrequency(String); when 'Str'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseFrequency(String)"})
  void testTryParseFrequency_whenStr_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Frequency> actualTryParseFrequencyResult = LoaderUtils.tryParseFrequency("Str");

    // Assert
    assertFalse(actualTryParseFrequencyResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code T}.
   *   <li>Then return {@link Optional#get()} toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseFrequency(String)}
   */
  @Test
  @DisplayName("Test tryParseFrequency(String); when 'T'; then return get() toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseFrequency(String)"})
  void testTryParseFrequency_whenT_thenReturnGetToStringIsTerm() {
    // Arrange and Act
    Optional<Frequency> actualTryParseFrequencyResult = LoaderUtils.tryParseFrequency("T");

    // Assert
    Frequency getResult = actualTryParseFrequencyResult.get();
    assertEquals("Term", getResult.toString());
    assertEquals(0, getResult.eventsPerYear());
    Period period = getResult.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0.0d, getResult.eventsPerYearEstimate());
    assertEquals(10000, period.getYears());
    assertEquals(120000L, period.toTotalMonths());
    assertFalse(getResult.isWeekBased());
    assertTrue(getResult.isTerm());
  }

  /**
   * Test {@link LoaderUtils#tryParseFrequency(String)}.
   *
   * <ul>
   *   <li>When {@code Term}.
   *   <li>Then return {@link Optional#get()} toString is {@code Term}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseFrequency(String)}
   */
  @Test
  @DisplayName("Test tryParseFrequency(String); when 'Term'; then return get() toString is 'Term'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseFrequency(String)"})
  void testTryParseFrequency_whenTerm_thenReturnGetToStringIsTerm() {
    // Arrange and Act
    Optional<Frequency> actualTryParseFrequencyResult = LoaderUtils.tryParseFrequency("Term");

    // Assert
    Frequency getResult = actualTryParseFrequencyResult.get();
    assertEquals("Term", getResult.toString());
    assertEquals(0, getResult.eventsPerYear());
    Period period = getResult.getPeriod();
    assertEquals(0, period.getDays());
    assertEquals(0.0d, getResult.eventsPerYearEstimate());
    assertEquals(10000, period.getYears());
    assertEquals(120000L, period.toTotalMonths());
    assertFalse(getResult.isWeekBased());
    assertTrue(getResult.isTerm());
  }

  /**
   * Test {@link LoaderUtils#parseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code currencyCode}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseCurrency(String)}
   */
  @Test
  @DisplayName("Test parseCurrency(String); when 'currencyCode'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency LoaderUtils.parseCurrency(String)"})
  void testParseCurrency_whenCurrencyCode_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseCurrency("currencyCode"));
  }

  /**
   * Test {@link LoaderUtils#parseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseCurrency(String)}
   */
  @Test
  @DisplayName("Test parseCurrency(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency LoaderUtils.parseCurrency(String)"})
  void testParseCurrency_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseCurrency("("));
  }

  /**
   * Test {@link LoaderUtils#parseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseCurrency(String)}
   */
  @Test
  @DisplayName("Test parseCurrency(String); when 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency LoaderUtils.parseCurrency(String)"})
  void testParseCurrency_whenNull_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseCurrency(null));
  }

  /**
   * Test {@link LoaderUtils#parseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then return Code is {@code STR}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseCurrency(String)}
   */
  @Test
  @DisplayName("Test parseCurrency(String); when 'Str'; then return Code is 'STR'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency LoaderUtils.parseCurrency(String)"})
  void testParseCurrency_whenStr_thenReturnCodeIsStr() {
    // Arrange and Act
    Currency actualParseCurrencyResult = LoaderUtils.parseCurrency("Str");

    // Assert
    assertEquals("STR", actualParseCurrencyResult.getCode());
    assertEquals("STR", actualParseCurrencyResult.toString());
    Currency triangulationCurrency = actualParseCurrencyResult.getTriangulationCurrency();
    assertEquals("USD", triangulationCurrency.getCode());
    assertEquals("USD", triangulationCurrency.toString());
    assertEquals(0, actualParseCurrencyResult.getMinorUnitDigits());
    assertEquals(2, triangulationCurrency.getMinorUnitDigits());
    assertSame(Currency.USD, triangulationCurrency.getTriangulationCurrency());
  }

  /**
   * Test {@link LoaderUtils#parseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code {U}}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseCurrency(String)}
   */
  @Test
  @DisplayName("Test parseCurrency(String); when '{U}'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency LoaderUtils.parseCurrency(String)"})
  void testParseCurrency_whenU_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseCurrency("{U}"));
  }

  /**
   * Test {@link LoaderUtils#parseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code USD}.
   *   <li>Then return Code is {@code USD}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseCurrency(String)}
   */
  @Test
  @DisplayName("Test parseCurrency(String); when 'USD'; then return Code is 'USD'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Currency LoaderUtils.parseCurrency(String)"})
  void testParseCurrency_whenUsd_thenReturnCodeIsUsd() {
    // Arrange and Act
    Currency actualParseCurrencyResult = LoaderUtils.parseCurrency("USD");

    // Assert
    assertEquals("USD", actualParseCurrencyResult.getCode());
    assertEquals("USD", actualParseCurrencyResult.toString());
    assertEquals(2, actualParseCurrencyResult.getMinorUnitDigits());
    Currency actualTriangulationCurrency = actualParseCurrencyResult.getTriangulationCurrency();
    assertSame(actualParseCurrencyResult, actualTriangulationCurrency);
  }

  /**
   * Test {@link LoaderUtils#tryParseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code (42}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseCurrency(String)}
   */
  @Test
  @DisplayName("Test tryParseCurrency(String); when '(42'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseCurrency(String)"})
  void testTryParseCurrency_when42_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Currency> actualTryParseCurrencyResult = LoaderUtils.tryParseCurrency("(42");

    // Assert
    assertFalse(actualTryParseCurrencyResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code BUY}.
   *   <li>Then return {@link Optional#get()} Code is {@code BUY}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseCurrency(String)}
   */
  @Test
  @DisplayName("Test tryParseCurrency(String); when 'BUY'; then return get() Code is 'BUY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseCurrency(String)"})
  void testTryParseCurrency_whenBuy_thenReturnGetCodeIsBuy() {
    // Arrange and Act
    Optional<Currency> actualTryParseCurrencyResult = LoaderUtils.tryParseCurrency("BUY");

    // Assert
    Currency getResult = actualTryParseCurrencyResult.get();
    assertEquals("BUY", getResult.getCode());
    assertEquals("BUY", getResult.toString());
    Currency triangulationCurrency = getResult.getTriangulationCurrency();
    assertEquals("USD", triangulationCurrency.getCode());
    assertEquals("USD", triangulationCurrency.toString());
    assertEquals(0, getResult.getMinorUnitDigits());
    assertEquals(2, triangulationCurrency.getMinorUnitDigits());
    assertTrue(actualTryParseCurrencyResult.isPresent());
    assertSame(
        triangulationCurrency.getTriangulationCurrency(),
        triangulationCurrency.getTriangulationCurrency());
  }

  /**
   * Test {@link LoaderUtils#tryParseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code CAP}.
   *   <li>Then return {@link Optional#get()} Code is {@code CAP}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseCurrency(String)}
   */
  @Test
  @DisplayName("Test tryParseCurrency(String); when 'CAP'; then return get() Code is 'CAP'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseCurrency(String)"})
  void testTryParseCurrency_whenCap_thenReturnGetCodeIsCap() {
    // Arrange and Act
    Optional<Currency> actualTryParseCurrencyResult = LoaderUtils.tryParseCurrency("CAP");

    // Assert
    Currency getResult = actualTryParseCurrencyResult.get();
    assertEquals("CAP", getResult.getCode());
    assertEquals("CAP", getResult.toString());
    Currency triangulationCurrency = getResult.getTriangulationCurrency();
    assertEquals("USD", triangulationCurrency.getCode());
    assertEquals("USD", triangulationCurrency.toString());
    assertEquals(0, getResult.getMinorUnitDigits());
    assertEquals(2, triangulationCurrency.getMinorUnitDigits());
    assertTrue(actualTryParseCurrencyResult.isPresent());
    assertSame(
        triangulationCurrency.getTriangulationCurrency(),
        triangulationCurrency.getTriangulationCurrency());
  }

  /**
   * Test {@link LoaderUtils#tryParseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseCurrency(String)}
   */
  @Test
  @DisplayName("Test tryParseCurrency(String); when '('; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseCurrency(String)"})
  void testTryParseCurrency_whenLeftParenthesis_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Currency> actualTryParseCurrencyResult = LoaderUtils.tryParseCurrency("(");

    // Assert
    assertFalse(actualTryParseCurrencyResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseCurrency(String)}
   */
  @Test
  @DisplayName("Test tryParseCurrency(String); when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseCurrency(String)"})
  void testTryParseCurrency_whenNull_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Currency> actualTryParseCurrencyResult = LoaderUtils.tryParseCurrency(null);

    // Assert
    assertFalse(actualTryParseCurrencyResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#tryParseCurrency(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#tryParseCurrency(String)}
   */
  @Test
  @DisplayName("Test tryParseCurrency(String); when 'Str'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional LoaderUtils.tryParseCurrency(String)"})
  void testTryParseCurrency_whenStr_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Currency> actualTryParseCurrencyResult = LoaderUtils.tryParseCurrency("Str");

    // Assert
    assertFalse(actualTryParseCurrencyResult.isPresent());
  }

  /**
   * Test {@link LoaderUtils#parseDayCount(String)}.
   *
   * <ul>
   *   <li>When {@code act/act}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDayCount(String)}
   */
  @Test
  @DisplayName("Test parseDayCount(String); when 'act/act'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.basics.date.DayCount LoaderUtils.parseDayCount(String)"})
  void testParseDayCount_whenActAct_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> LoaderUtils.parseDayCount("act/act"));
  }

  /**
   * Test {@link LoaderUtils#parseDayCount(String)}.
   *
   * <ul>
   *   <li>When {@code actual/actualU}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDayCount(String)}
   */
  @Test
  @DisplayName(
      "Test parseDayCount(String); when 'actual/actualU'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.basics.date.DayCount LoaderUtils.parseDayCount(String)"})
  void testParseDayCount_whenActualActualU_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDayCount("actual/actualU"));
  }

  /**
   * Test {@link LoaderUtils#parseDayCount(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseDayCount(String)}
   */
  @Test
  @DisplayName("Test parseDayCount(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.basics.date.DayCount LoaderUtils.parseDayCount(String)"})
  void testParseDayCount_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseDayCount("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseBusinessDayConvention(String)}.
   *
   * <ul>
   *   <li>When {@code F}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBusinessDayConvention(String)}
   */
  @Test
  @DisplayName("Test parseBusinessDayConvention(String); when 'F'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.BusinessDayConvention LoaderUtils.parseBusinessDayConvention(String)"
  })
  void testParseBusinessDayConvention_whenF_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> LoaderUtils.parseBusinessDayConvention("F"));
  }

  /**
   * Test {@link LoaderUtils#parseBusinessDayConvention(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBusinessDayConvention(String)}
   */
  @Test
  @DisplayName("Test parseBusinessDayConvention(String); when '('")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.BusinessDayConvention LoaderUtils.parseBusinessDayConvention(String)"
  })
  void testParseBusinessDayConvention_whenLeftParenthesis() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBusinessDayConvention("("));
  }

  /**
   * Test {@link LoaderUtils#parseBusinessDayConvention(String)}.
   *
   * <ul>
   *   <li>When {@code M}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBusinessDayConvention(String)}
   */
  @Test
  @DisplayName("Test parseBusinessDayConvention(String); when 'M'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.BusinessDayConvention LoaderUtils.parseBusinessDayConvention(String)"
  })
  void testParseBusinessDayConvention_whenM_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> LoaderUtils.parseBusinessDayConvention("M"));
  }

  /**
   * Test {@link LoaderUtils#parseBusinessDayConvention(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBusinessDayConvention(String)}
   */
  @Test
  @DisplayName(
      "Test parseBusinessDayConvention(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.date.BusinessDayConvention LoaderUtils.parseBusinessDayConvention(String)"
  })
  void testParseBusinessDayConvention_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBusinessDayConvention("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseRollConvention(String)}.
   *
   * <ul>
   *   <li>When {@code day31}.
   *   <li>Then return DayOfMonth is thirty-one.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseRollConvention(String)}
   */
  @Test
  @DisplayName(
      "Test parseRollConvention(String); when 'day31'; then return DayOfMonth is thirty-one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.schedule.RollConvention LoaderUtils.parseRollConvention(String)"
  })
  void testParseRollConvention_whenDay31_thenReturnDayOfMonthIsThirtyOne() {
    // Arrange, Act and Assert
    assertEquals(31, LoaderUtils.parseRollConvention("day31").getDayOfMonth());
  }

  /**
   * Test {@link LoaderUtils#parseRollConvention(String)}.
   *
   * <ul>
   *   <li>When {@code (}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseRollConvention(String)}
   */
  @Test
  @DisplayName("Test parseRollConvention(String); when '('; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.schedule.RollConvention LoaderUtils.parseRollConvention(String)"
  })
  void testParseRollConvention_whenLeftParenthesis_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseRollConvention("("));
  }

  /**
   * Test {@link LoaderUtils#parseRollConvention(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseRollConvention(String)}
   */
  @Test
  @DisplayName("Test parseRollConvention(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.schedule.RollConvention LoaderUtils.parseRollConvention(String)"
  })
  void testParseRollConvention_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseRollConvention("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseBuySell(String)}.
   *
   * <ul>
   *   <li>When {@code B}.
   *   <li>Then return {@code BUY}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBuySell(String)}
   */
  @Test
  @DisplayName("Test parseBuySell(String); when 'B'; then return 'BUY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BuySell LoaderUtils.parseBuySell(String)"})
  void testParseBuySell_whenB_thenReturnBuy() {
    // Arrange, Act and Assert
    assertEquals(BuySell.BUY, LoaderUtils.parseBuySell("B"));
  }

  /**
   * Test {@link LoaderUtils#parseBuySell(String)}.
   *
   * <ul>
   *   <li>When {@code BUY}.
   *   <li>Then return {@code BUY}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBuySell(String)}
   */
  @Test
  @DisplayName("Test parseBuySell(String); when 'BUY'; then return 'BUY'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BuySell LoaderUtils.parseBuySell(String)"})
  void testParseBuySell_whenBuy_thenReturnBuy() {
    // Arrange, Act and Assert
    assertEquals(BuySell.BUY, LoaderUtils.parseBuySell("BUY"));
  }

  /**
   * Test {@link LoaderUtils#parseBuySell(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseBuySell(String)}
   */
  @Test
  @DisplayName("Test parseBuySell(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BuySell LoaderUtils.parseBuySell(String)"})
  void testParseBuySell_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBuySell("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseCapFloor(String)}.
   *
   * <p>Method under test: {@link LoaderUtils#parseCapFloor(String)}
   */
  @Test
  @DisplayName("Test parseCapFloor(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.product.common.CapFloor LoaderUtils.parseCapFloor(String)"
  })
  void testParseCapFloor() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseCapFloor("Str"));
  }

  /**
   * Test {@link LoaderUtils#parsePayReceive(String)}.
   *
   * <p>Method under test: {@link LoaderUtils#parsePayReceive(String)}
   */
  @Test
  @DisplayName("Test parsePayReceive(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.product.common.PayReceive LoaderUtils.parsePayReceive(String)"
  })
  void testParsePayReceive() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePayReceive("Str"));
  }

  /**
   * Test {@link LoaderUtils#parsePutCall(String)}.
   *
   * <p>Method under test: {@link LoaderUtils#parsePutCall(String)}
   */
  @Test
  @DisplayName("Test parsePutCall(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.product.common.PutCall LoaderUtils.parsePutCall(String)"
  })
  void testParsePutCall() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parsePutCall("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseLongShort(String)}.
   *
   * <p>Method under test: {@link LoaderUtils#parseLongShort(String)}
   */
  @Test
  @DisplayName("Test parseLongShort(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.product.common.LongShort LoaderUtils.parseLongShort(String)"
  })
  void testParseLongShort() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseLongShort("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseBarrierType(String)}.
   *
   * <p>Method under test: {@link LoaderUtils#parseBarrierType(String)}
   */
  @Test
  @DisplayName("Test parseBarrierType(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.product.option.BarrierType LoaderUtils.parseBarrierType(String)"
  })
  void testParseBarrierType() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseBarrierType("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseKnockType(String)}.
   *
   * <p>Method under test: {@link LoaderUtils#parseKnockType(String)}
   */
  @Test
  @DisplayName("Test parseKnockType(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.product.option.KnockType LoaderUtils.parseKnockType(String)"
  })
  void testParseKnockType() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseKnockType("Str"));
  }

  /**
   * Test {@link LoaderUtils#parseRedCode(String)}.
   *
   * <ul>
   *   <li>When {@code reason}.
   *   <li>Then return Value is {@code reason}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseRedCode(String)}
   */
  @Test
  @DisplayName("Test parseRedCode(String); when 'reason'; then return Value is 'reason'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StandardId LoaderUtils.parseRedCode(String)"})
  void testParseRedCode_whenReason_thenReturnValueIsReason() {
    // Arrange and Act
    StandardId actualParseRedCodeResult = LoaderUtils.parseRedCode("reason");

    // Assert
    assertEquals("RED6", actualParseRedCodeResult.getScheme());
    assertEquals("reason", actualParseRedCodeResult.getValue());
  }

  /**
   * Test {@link LoaderUtils#parseRedCode(String)}.
   *
   * <ul>
   *   <li>When {@code secondStr}.
   *   <li>Then return Scheme is {@code RED9}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseRedCode(String)}
   */
  @Test
  @DisplayName("Test parseRedCode(String); when 'secondStr'; then return Scheme is 'RED9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StandardId LoaderUtils.parseRedCode(String)"})
  void testParseRedCode_whenSecondStr_thenReturnSchemeIsRed9() {
    // Arrange and Act
    StandardId actualParseRedCodeResult = LoaderUtils.parseRedCode("secondStr");

    // Assert
    assertEquals("RED9", actualParseRedCodeResult.getScheme());
    assertEquals("secondStr", actualParseRedCodeResult.getValue());
  }

  /**
   * Test {@link LoaderUtils#parseRedCode(String)}.
   *
   * <ul>
   *   <li>When {@code second}.
   *   <li>Then return Value is {@code second}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseRedCode(String)}
   */
  @Test
  @DisplayName("Test parseRedCode(String); when 'second'; then return Value is 'second'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StandardId LoaderUtils.parseRedCode(String)"})
  void testParseRedCode_whenSecond_thenReturnValueIsSecond() {
    // Arrange and Act
    StandardId actualParseRedCodeResult = LoaderUtils.parseRedCode("second");

    // Assert
    assertEquals("RED6", actualParseRedCodeResult.getScheme());
    assertEquals("second", actualParseRedCodeResult.getValue());
  }

  /**
   * Test {@link LoaderUtils#parseRedCode(String)}.
   *
   * <ul>
   *   <li>When {@code Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LoaderUtils#parseRedCode(String)}
   */
  @Test
  @DisplayName("Test parseRedCode(String); when 'Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"StandardId LoaderUtils.parseRedCode(String)"})
  void testParseRedCode_whenStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> LoaderUtils.parseRedCode("Str"));
  }
}
