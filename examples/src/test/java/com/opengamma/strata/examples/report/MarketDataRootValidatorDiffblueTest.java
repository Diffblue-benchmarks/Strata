package com.opengamma.strata.examples.report;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.beust.jcommander.ParameterException;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.File;
import java.nio.file.Paths;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataRootValidatorDiffblueTest {
  /**
   * Test {@link MarketDataRootValidator#validate(String, File)} with {@code String}, {@code File}.
   *
   * <ul>
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRootValidator#validate(String, File)}
   */
  @Test
  @DisplayName("Test validate(String, File) with 'String', 'File'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MarketDataRootValidator.validate(String, File)"})
  void testValidateWithStringFile_thenDoesNotThrow() throws ParameterException {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            new MarketDataRootValidator()
                .validate("Name", Paths.get(System.getProperty("java.io.tmpdir"), "").toFile()));
  }

  /**
   * Test {@link MarketDataRootValidator#validate(String, File)} with {@code String}, {@code File}.
   *
   * <ul>
   *   <li>Then throw {@link ParameterException}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataRootValidator#validate(String, File)}
   */
  @Test
  @DisplayName("Test validate(String, File) with 'String', 'File'; then throw ParameterException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MarketDataRootValidator.validate(String, File)"})
  void testValidateWithStringFile_thenThrowParameterException() throws ParameterException {
    // Arrange, Act and Assert
    assertThrows(
        ParameterException.class,
        () ->
            new MarketDataRootValidator()
                .validate(
                    "Name", Paths.get(System.getProperty("java.io.tmpdir"), "test.txt").toFile()));
  }
}
