package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Locale;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NumberFormatterDiffblueTest {
  /**
   * Test {@link NumberFormatter#of(boolean, int)} with {@code grouped}, {@code decimalPlaces}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return format one is {@code 1.0}.
   * </ul>
   *
   * <p>Method under test: {@link NumberFormatter#of(boolean, int)}
   */
  @Test
  @DisplayName(
      "Test of(boolean, int) with 'grouped', 'decimalPlaces'; when one; then return format one is '1.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NumberFormatter NumberFormatter.of(boolean, int)"})
  void testOfWithGroupedDecimalPlaces_whenOne_thenReturnFormatOneIs10() {
    // Arrange and Act
    NumberFormatter actualOfResult = NumberFormatter.of(true, 1);

    // Assert
    assertEquals("1.0", actualOfResult.format(1L));
    assertEquals("10.0", actualOfResult.format(10.0d));
  }

  /**
   * Test {@link NumberFormatter#of(boolean, int, int)} with {@code grouped}, {@code
   * minDecimalPlaces}, {@code maxDecimalPlaces}.
   *
   * <ul>
   *   <li>Then return format one is {@code 1.0}.
   * </ul>
   *
   * <p>Method under test: {@link NumberFormatter#of(boolean, int, int)}
   */
  @Test
  @DisplayName(
      "Test of(boolean, int, int) with 'grouped', 'minDecimalPlaces', 'maxDecimalPlaces'; then return format one is '1.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NumberFormatter NumberFormatter.of(boolean, int, int)"})
  void testOfWithGroupedMinDecimalPlacesMaxDecimalPlaces_thenReturnFormatOneIs10() {
    // Arrange and Act
    NumberFormatter actualOfResult = NumberFormatter.of(true, 1, 3);

    // Assert
    assertEquals("1.0", actualOfResult.format(1L));
    assertEquals("10.0", actualOfResult.format(10.0d));
  }

  /**
   * Test {@link NumberFormatter#ofPercentage(boolean, int, int)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return format ten is {@code 1,000.0%}.
   * </ul>
   *
   * <p>Method under test: {@link NumberFormatter#ofPercentage(boolean, int, int)}
   */
  @Test
  @DisplayName(
      "Test ofPercentage(boolean, int, int); when one; then return format ten is '1,000.0%'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NumberFormatter NumberFormatter.ofPercentage(boolean, int, int)"})
  void testOfPercentage_whenOne_thenReturnFormatTenIs10000() {
    // Arrange and Act
    NumberFormatter actualOfPercentageResult = NumberFormatter.ofPercentage(true, 1, 3);

    // Assert
    assertEquals("1,000.0%", actualOfPercentageResult.format(10.0d));
    assertEquals("100.0%", actualOfPercentageResult.format(1L));
  }

  /**
   * Test {@link NumberFormatter#ofPattern(String, Locale)}.
   *
   * <ul>
   *   <li>When {@code Pattern}.
   *   <li>Then return format one is {@code Pattern1}.
   * </ul>
   *
   * <p>Method under test: {@link NumberFormatter#ofPattern(String, Locale)}
   */
  @Test
  @DisplayName(
      "Test ofPattern(String, Locale); when 'Pattern'; then return format one is 'Pattern1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NumberFormatter NumberFormatter.ofPattern(String, Locale)"})
  void testOfPattern_whenPattern_thenReturnFormatOneIsPattern1() {
    // Arrange and Act
    NumberFormatter actualOfPatternResult =
        NumberFormatter.ofPattern("Pattern", Locale.getDefault());

    // Assert
    assertEquals("Pattern1", actualOfPatternResult.format(1L));
    assertEquals("Pattern10", actualOfPatternResult.format(10.0d));
  }

  /**
   * Test {@link NumberFormatter#ofLocalizedNumber(Locale)}.
   *
   * <ul>
   *   <li>When Default.
   *   <li>Then return format one is {@code 1}.
   * </ul>
   *
   * <p>Method under test: {@link NumberFormatter#ofLocalizedNumber(Locale)}
   */
  @Test
  @DisplayName("Test ofLocalizedNumber(Locale); when Default; then return format one is '1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"NumberFormatter NumberFormatter.ofLocalizedNumber(Locale)"})
  void testOfLocalizedNumber_whenDefault_thenReturnFormatOneIs1() {
    // Arrange and Act
    NumberFormatter actualOfLocalizedNumberResult =
        NumberFormatter.ofLocalizedNumber(Locale.getDefault());

    // Assert
    assertEquals("1", actualOfLocalizedNumberResult.format(1L));
    assertEquals("10", actualOfLocalizedNumberResult.format(10.0d));
  }

  /**
   * Test {@link NumberFormatter#format(double)} with {@code double}.
   *
   * <p>Method under test: {@link NumberFormatter#format(double)}
   */
  @Test
  @DisplayName("Test format(double) with 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String NumberFormatter.format(double)"})
  void testFormatWithDouble() {
    // Arrange, Act and Assert
    assertEquals("1,000.0%", NumberFormatter.ofPercentage(true, 1, 3).format(10.0d));
  }

  /**
   * Test {@link NumberFormatter#format(long)} with {@code long}.
   *
   * <p>Method under test: {@link NumberFormatter#format(long)}
   */
  @Test
  @DisplayName("Test format(long) with 'long'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String NumberFormatter.format(long)"})
  void testFormatWithLong() {
    // Arrange, Act and Assert
    assertEquals("100.0%", NumberFormatter.ofPercentage(true, 1, 3).format(1L));
  }

  /**
   * Test {@link NumberFormatter#parse(String)}.
   *
   * <ul>
   *   <li>Given ofLocalizedNumber Default.
   *   <li>When {@code 42}.
   *   <li>Then return forty-two.
   * </ul>
   *
   * <p>Method under test: {@link NumberFormatter#parse(String)}
   */
  @Test
  @DisplayName(
      "Test parse(String); given ofLocalizedNumber Default; when '42'; then return forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NumberFormatter.parse(String)"})
  void testParse_givenOfLocalizedNumberDefault_when42_thenReturnFortyTwo() {
    // Arrange, Act and Assert
    assertEquals(42.0d, NumberFormatter.ofLocalizedNumber(Locale.getDefault()).parse("42"));
  }

  /**
   * Test {@link NumberFormatter#parse(String)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link NumberFormatter#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double NumberFormatter.parse(String)"})
  void testParse_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> NumberFormatter.ofPercentage(true, 1, 3).parse("Text"));
  }
}
