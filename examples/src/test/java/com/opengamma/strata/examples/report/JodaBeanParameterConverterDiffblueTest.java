package com.opengamma.strata.examples.report;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.beust.jcommander.ParameterException;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JodaBeanParameterConverterDiffblueTest {
  /**
   * Test {@link JodaBeanParameterConverter#convert(String)}.
   *
   * <ul>
   *   <li>When {@code foo.txt}.
   * </ul>
   *
   * <p>Method under test: {@link JodaBeanParameterConverter#convert(String)}
   */
  @Test
  @DisplayName("Test convert(String); when 'foo.txt'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Object JodaBeanParameterConverter.convert(String)"})
  void testConvert_whenFooTxt() {
    // Arrange, Act and Assert
    assertThrows(
        ParameterException.class, () -> new TradeListParameterConverter().convert("foo.txt"));
  }

  /**
   * Test {@link JodaBeanParameterConverter#convert(String)}.
   *
   * <ul>
   *   <li>When {@code Invalid file: {}}.
   * </ul>
   *
   * <p>Method under test: {@link JodaBeanParameterConverter#convert(String)}
   */
  @Test
  @DisplayName("Test convert(String); when 'Invalid file: {}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Object JodaBeanParameterConverter.convert(String)"})
  void testConvert_whenInvalidFile() {
    // Arrange, Act and Assert
    assertThrows(
        ParameterException.class,
        () -> new TradeListParameterConverter().convert("Invalid file: {}"));
  }
}
