package com.opengamma.strata.examples.report;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.beust.jcommander.ParameterException;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LocalDateParameterConverterDiffblueTest {
  /**
   * Test {@link LocalDateParameterConverter#convert(String)}.
   *
   * <p>Method under test: {@link LocalDateParameterConverter#convert(String)}
   */
  @Test
  @DisplayName("Test convert(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.time.LocalDate LocalDateParameterConverter.convert(String)"})
  void testConvert() {
    // Arrange, Act and Assert
    assertThrows(ParameterException.class, () -> new LocalDateParameterConverter().convert("42"));
  }
}
