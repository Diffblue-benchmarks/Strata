package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.io.StringCharSource;
import com.opengamma.strata.collect.result.ParseFailureException;
import com.opengamma.strata.market.curve.CurveName;
import com.opengamma.strata.market.curve.SeasonalityDefinition;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SeasonalityDefinitionCsvLoaderDiffblueTest {
  /**
   * Test {@link SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}
   */
  @Test
  @DisplayName(
      "Test parseSeasonalityDefinitions(CharSource); when 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(CharSource)"})
  void testParseSeasonalityDefinitions_whenNull_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(null));
  }

  /**
   * Test {@link SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is empty string.
   * </ul>
   *
   * <p>Method under test: {@link
   * SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}
   */
  @Test
  @DisplayName(
      "Test parseSeasonalityDefinitions(CharSource); when StringCharSource with str is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(CharSource)"})
  void testParseSeasonalityDefinitions_whenStringCharSourceWithStrIsEmptyString() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(StringCharSource.of("")));
  }

  /**
   * Test {@link SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is lf.
   * </ul>
   *
   * <p>Method under test: {@link
   * SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}
   */
  @Test
  @DisplayName("Test parseSeasonalityDefinitions(CharSource); when StringCharSource with str is lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(CharSource)"})
  void testParseSeasonalityDefinitions_whenStringCharSourceWithStrIsLf() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(StringCharSource.of("\n")));
  }

  /**
   * Test {@link SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}
   */
  @Test
  @DisplayName(
      "Test parseSeasonalityDefinitions(CharSource); when StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(CharSource)"})
  void testParseSeasonalityDefinitions_whenStringCharSourceWithStrIsNumberSign() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(StringCharSource.of("#")));
  }

  /**
   * Test {@link SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}
   */
  @Test
  @DisplayName(
      "Test parseSeasonalityDefinitions(CharSource); when StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(CharSource)"})
  void testParseSeasonalityDefinitions_whenStringCharSourceWithStrIsSemicolon() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(StringCharSource.of(";")));
  }

  /**
   * Test {@link SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with {@code Str}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * SeasonalityDefinitionCsvLoader#parseSeasonalityDefinitions(CharSource)}
   */
  @Test
  @DisplayName(
      "Test parseSeasonalityDefinitions(CharSource); when StringCharSource with 'Str'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(CharSource)"})
  void testParseSeasonalityDefinitions_whenStringCharSourceWithStr_thenReturnEmpty() {
    // Arrange and Act
    Map<CurveName, SeasonalityDefinition> actualParseSeasonalityDefinitionsResult =
        SeasonalityDefinitionCsvLoader.parseSeasonalityDefinitions(StringCharSource.of("Str"));

    // Assert
    assertTrue(actualParseSeasonalityDefinitionsResult.isEmpty());
  }
}
