package com.opengamma.strata.examples.report;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.report.framework.format.ReportOutputFormat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReportOutputFormatParameterConverterDiffblueTest {
  /**
   * Test {@link ReportOutputFormatParameterConverter#convert(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   *   <li>Then return {@code ASCII_TABLE}.
   * </ul>
   *
   * <p>Method under test: {@link ReportOutputFormatParameterConverter#convert(String)}
   */
  @Test
  @DisplayName("Test convert(String); when '42'; then return 'ASCII_TABLE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReportOutputFormat ReportOutputFormatParameterConverter.convert(String)"})
  void testConvert_when42_thenReturnAsciiTable() {
    // Arrange, Act and Assert
    assertEquals(
        ReportOutputFormat.ASCII_TABLE, new ReportOutputFormatParameterConverter().convert("42"));
  }

  /**
   * Test {@link ReportOutputFormatParameterConverter#convert(String)}.
   *
   * <ul>
   *   <li>When {@code c}.
   *   <li>Then return {@code CSV}.
   * </ul>
   *
   * <p>Method under test: {@link ReportOutputFormatParameterConverter#convert(String)}
   */
  @Test
  @DisplayName("Test convert(String); when 'c'; then return 'CSV'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReportOutputFormat ReportOutputFormatParameterConverter.convert(String)"})
  void testConvert_whenC_thenReturnCsv() {
    // Arrange, Act and Assert
    assertEquals(ReportOutputFormat.CSV, new ReportOutputFormatParameterConverter().convert("c"));
  }
}
