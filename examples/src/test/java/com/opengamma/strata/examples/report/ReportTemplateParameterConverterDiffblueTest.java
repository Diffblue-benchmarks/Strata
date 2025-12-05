package com.opengamma.strata.examples.report;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.beust.jcommander.ParameterException;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ReportTemplateParameterConverterDiffblueTest {
  /**
   * Test {@link ReportTemplateParameterConverter#convert(String)}.
   *
   * <p>Method under test: {@link ReportTemplateParameterConverter#convert(String)}
   */
  @Test
  @DisplayName("Test convert(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.report.ReportTemplate ReportTemplateParameterConverter.convert(String)"
  })
  void testConvert() {
    // Arrange, Act and Assert
    assertThrows(
        ParameterException.class, () -> new ReportTemplateParameterConverter().convert("foo.txt"));
  }
}
