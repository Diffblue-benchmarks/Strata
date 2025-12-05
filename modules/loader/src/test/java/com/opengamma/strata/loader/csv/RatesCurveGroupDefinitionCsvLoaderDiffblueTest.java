package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.io.StringCharSource;
import com.opengamma.strata.collect.result.ParseFailureException;
import com.opengamma.strata.market.curve.CurveGroupName;
import com.opengamma.strata.market.curve.RatesCurveGroup;
import com.opengamma.strata.market.curve.RatesCurveGroup.Builder;
import com.opengamma.strata.market.curve.RatesCurveGroupDefinition;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatesCurveGroupDefinitionCsvLoaderDiffblueTest {
  /**
   * Test {@link RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}
   */
  @Test
  @DisplayName(
      "Test parseCurveGroupDefinitions(CharSource); when 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(CharSource)"
  })
  void testParseCurveGroupDefinitions_whenNull_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(null));
  }

  /**
   * Test {@link RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is empty string.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}
   */
  @Test
  @DisplayName(
      "Test parseCurveGroupDefinitions(CharSource); when StringCharSource with str is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(CharSource)"
  })
  void testParseCurveGroupDefinitions_whenStringCharSourceWithStrIsEmptyString() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(StringCharSource.of("")));
  }

  /**
   * Test {@link RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is lf.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}
   */
  @Test
  @DisplayName("Test parseCurveGroupDefinitions(CharSource); when StringCharSource with str is lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(CharSource)"
  })
  void testParseCurveGroupDefinitions_whenStringCharSourceWithStrIsLf() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(
                StringCharSource.of("\n")));
  }

  /**
   * Test {@link RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}
   */
  @Test
  @DisplayName("Test parseCurveGroupDefinitions(CharSource); when StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(CharSource)"
  })
  void testParseCurveGroupDefinitions_whenStringCharSourceWithStrIsNumberSign() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(
                StringCharSource.of("#")));
  }

  /**
   * Test {@link RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}
   */
  @Test
  @DisplayName("Test parseCurveGroupDefinitions(CharSource); when StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(CharSource)"
  })
  void testParseCurveGroupDefinitions_whenStringCharSourceWithStrIsSemicolon() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(
                StringCharSource.of(";")));
  }

  /**
   * Test {@link RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with {@code Str}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinitionCsvLoader#parseCurveGroupDefinitions(CharSource)}
   */
  @Test
  @DisplayName(
      "Test parseCurveGroupDefinitions(CharSource); when StringCharSource with 'Str'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "List RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(CharSource)"
  })
  void testParseCurveGroupDefinitions_whenStringCharSourceWithStr_thenReturnEmpty() {
    // Arrange and Act
    List<RatesCurveGroupDefinition> actualParseCurveGroupDefinitionsResult =
        RatesCurveGroupDefinitionCsvLoader.parseCurveGroupDefinitions(StringCharSource.of("Str"));

    // Assert
    assertTrue(actualParseCurveGroupDefinitionsResult.isEmpty());
  }

  /**
   * Test {@link RatesCurveGroupDefinitionCsvLoader#writeCurveGroupDefinition(File,
   * RatesCurveGroupDefinition[])} with {@code file}, {@code groups}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionCsvLoader#writeCurveGroupDefinition(File,
   * RatesCurveGroupDefinition[])}
   */
  @Test
  @DisplayName(
      "Test writeCurveGroupDefinition(File, RatesCurveGroupDefinition[]) with 'file', 'groups'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurveGroupDefinitionCsvLoader.writeCurveGroupDefinition(File, RatesCurveGroupDefinition[])"
  })
  void testWriteCurveGroupDefinitionWithFileGroups_thenThrowUncheckedIOException() {
    // Arrange
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "foo", "42");

    // Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            RatesCurveGroupDefinitionCsvLoader.writeCurveGroupDefinition(getResult.toFile(), null));
  }

  /**
   * Test {@link RatesCurveGroupDefinitionCsvLoader#writeCurveGroupDefinition(Appendable,
   * RatesCurveGroupDefinition[])} with {@code underlying}, {@code groups}.
   *
   * <p>Method under test: {@link
   * RatesCurveGroupDefinitionCsvLoader#writeCurveGroupDefinition(Appendable,
   * RatesCurveGroupDefinition[])}
   */
  @Test
  @DisplayName(
      "Test writeCurveGroupDefinition(Appendable, RatesCurveGroupDefinition[]) with 'underlying', 'groups'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurveGroupDefinitionCsvLoader.writeCurveGroupDefinition(Appendable, RatesCurveGroupDefinition[])"
  })
  void testWriteCurveGroupDefinitionWithUnderlyingGroups() {
    // Arrange
    CharArrayWriter underlying = new CharArrayWriter();

    // Act
    RatesCurveGroupDefinitionCsvLoader.writeCurveGroupDefinition(underlying);

    // Assert
    assertEquals(43, underlying.size());
  }

  /**
   * Test {@link RatesCurveGroupDefinitionCsvLoader#writeCurveGroup(File, RatesCurveGroup[])} with
   * {@code file}, {@code groups}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionCsvLoader#writeCurveGroup(File,
   * RatesCurveGroup[])}
   */
  @Test
  @DisplayName(
      "Test writeCurveGroup(File, RatesCurveGroup[]) with 'file', 'groups'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurveGroupDefinitionCsvLoader.writeCurveGroup(File, RatesCurveGroup[])"
  })
  void testWriteCurveGroupWithFileGroups_thenThrowUncheckedIOException() {
    // Arrange
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "foo", "42");

    // Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () -> RatesCurveGroupDefinitionCsvLoader.writeCurveGroup(getResult.toFile(), null));
  }

  /**
   * Test {@link RatesCurveGroupDefinitionCsvLoader#writeCurveGroup(Appendable, RatesCurveGroup[])}
   * with {@code underlying}, {@code groups}.
   *
   * <ul>
   *   <li>Then {@link CharArrayWriter#CharArrayWriter()} size is forty-three.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveGroupDefinitionCsvLoader#writeCurveGroup(Appendable,
   * RatesCurveGroup[])}
   */
  @Test
  @DisplayName(
      "Test writeCurveGroup(Appendable, RatesCurveGroup[]) with 'underlying', 'groups'; then CharArrayWriter() size is forty-three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurveGroupDefinitionCsvLoader.writeCurveGroup(Appendable, RatesCurveGroup[])"
  })
  void testWriteCurveGroupWithUnderlyingGroups_thenCharArrayWriterSizeIsFortyThree() {
    // Arrange
    CharArrayWriter underlying = new CharArrayWriter();

    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());
    RatesCurveGroup ratesCurveGroup =
        forwardCurvesResult.name(CurveGroupName.of(CsvLoaderColumns.NAME_FIELD)).build();

    // Act
    RatesCurveGroupDefinitionCsvLoader.writeCurveGroup(underlying, ratesCurveGroup);

    // Assert
    assertEquals(43, underlying.size());
  }
}
