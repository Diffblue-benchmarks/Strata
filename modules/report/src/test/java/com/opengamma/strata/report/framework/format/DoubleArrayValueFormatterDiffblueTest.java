package com.opengamma.strata.report.framework.format;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DoubleArrayValueFormatterDiffblueTest {
  /**
   * Test {@link DoubleArrayValueFormatter#formatForCsv(double[])} with {@code double[]}.
   *
   * <p>Method under test: {@link DoubleArrayValueFormatter#formatForCsv(double[])}
   */
  @Test
  @DisplayName("Test formatForCsv(double[]) with 'double[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DoubleArrayValueFormatter.formatForCsv(double[])"})
  void testFormatForCsvWithDouble() {
    // Arrange and Act
    String actualFormatForCsvResult =
        DoubleArrayValueFormatter.INSTANCE.formatForCsv(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals("[10.0 0.5 10.0 0.5]", actualFormatForCsvResult);
  }

  /**
   * Test {@link DoubleArrayValueFormatter#formatForDisplay(double[])} with {@code double[]}.
   *
   * <p>Method under test: {@link DoubleArrayValueFormatter#formatForDisplay(double[])}
   */
  @Test
  @DisplayName("Test formatForDisplay(double[]) with 'double[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String DoubleArrayValueFormatter.formatForDisplay(double[])"})
  void testFormatForDisplayWithDouble() {
    // Arrange and Act
    String actualFormatForDisplayResult =
        DoubleArrayValueFormatter.INSTANCE.formatForDisplay(
            new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertEquals("[10.0, 0.5, 10.0, 0.5]", actualFormatForDisplayResult);
  }
}
