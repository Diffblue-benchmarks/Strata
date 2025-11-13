package com.opengamma.strata.report.framework.format;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DoubleValueFormatterDiffblueTest {
  /**
   * Test {@link DoubleValueFormatter#formatForCsv(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link DoubleValueFormatter#formatForCsv(Double)}
   */
  @Test
  @DisplayName("Test formatForCsv(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String DoubleValueFormatter.formatForCsv(Double)"})
  void testFormatForCsvWithDouble() {
    // Arrange, Act and Assert
    assertEquals("10", DoubleValueFormatter.INSTANCE.formatForCsv(10.0d));
  }

  /**
   * Test {@link DoubleValueFormatter#formatForDisplay(Double)} with {@code Double}.
   *
   * <p>Method under test: {@link DoubleValueFormatter#formatForDisplay(Double)}
   */
  @Test
  @DisplayName("Test formatForDisplay(Double) with 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String DoubleValueFormatter.formatForDisplay(Double)"})
  void testFormatForDisplayWithDouble() {
    // Arrange, Act and Assert
    assertEquals("10.00", DoubleValueFormatter.INSTANCE.formatForDisplay(10.0d));
  }

  /**
   * Test {@link DoubleValueFormatter#formatForDisplay(double, int)} with {@code double}, {@code
   * int}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleValueFormatter#formatForDisplay(double, int)}
   */
  @Test
  @DisplayName(
      "Test formatForDisplay(double, int) with 'double', 'int'; when '0.5'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String DoubleValueFormatter.formatForDisplay(double, int)"})
  void testFormatForDisplayWithDoubleInt_when05_thenReturn05() {
    // Arrange, Act and Assert
    assertEquals("0.5", DoubleValueFormatter.INSTANCE.formatForDisplay(0.5d, 1));
  }

  /**
   * Test {@link DoubleValueFormatter#formatForDisplay(double, int)} with {@code double}, {@code
   * int}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 10.0}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleValueFormatter#formatForDisplay(double, int)}
   */
  @Test
  @DisplayName(
      "Test formatForDisplay(double, int) with 'double', 'int'; when ten; then return '10.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.String DoubleValueFormatter.formatForDisplay(double, int)"})
  void testFormatForDisplayWithDoubleInt_whenTen_thenReturn100() {
    // Arrange, Act and Assert
    assertEquals("10.0", DoubleValueFormatter.INSTANCE.formatForDisplay(10.0d, 1));
  }
}
