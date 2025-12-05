package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.io.StringCharSource;
import com.opengamma.strata.collect.result.ParseFailureException;
import com.opengamma.strata.market.curve.CurveGroupName;
import com.opengamma.strata.market.curve.CurveName;
import com.opengamma.strata.market.curve.RatesCurveGroup;
import com.opengamma.strata.market.curve.RatesCurveGroup.Builder;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatesCurvesCsvLoaderDiffblueTest {
  /**
   * Test {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is empty string.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with str is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap RatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStrIsEmptyString() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    ArrayList<CharSource> curveValueCharSources = new ArrayList<>();
    curveValueCharSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCurvesCsvLoader.parse(
                datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is lf.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with str is lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap RatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStrIsLf() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    ArrayList<CharSource> curveValueCharSources = new ArrayList<>();
    curveValueCharSources.add(StringCharSource.of("\n"));
    curveValueCharSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCurvesCsvLoader.parse(
                datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap RatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStrIsNumberSign() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    ArrayList<CharSource> curveValueCharSources = new ArrayList<>();
    curveValueCharSources.add(StringCharSource.of("#"));
    curveValueCharSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCurvesCsvLoader.parse(
                datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap RatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStrIsSemicolon() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    ArrayList<CharSource> curveValueCharSources = new ArrayList<>();
    curveValueCharSources.add(StringCharSource.of(";"));
    curveValueCharSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCurvesCsvLoader.parse(
                datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with str is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap RatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStrIsU() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    ArrayList<CharSource> curveValueCharSources = new ArrayList<>();
    curveValueCharSources.add(StringCharSource.of("{U}"));
    curveValueCharSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCurvesCsvLoader.parse(
                datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with {@code Str}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with 'Str'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap RatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStr_thenReturnSizeIsZero() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    LinkedHashSet<CharSource> curveValueCharSources = new LinkedHashSet<>();
    curveValueCharSources.add(StringCharSource.of("Str"));

    // Act
    ImmutableListMultimap<LocalDate, RatesCurveGroup> actualParseResult =
        RatesCurvesCsvLoader.parse(
            datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources);

    // Assert
    assertEquals(0, actualParseResult.size());
    assertTrue(actualParseResult.isEmpty());
    assertTrue(actualParseResult.entries().isEmpty());
    assertTrue(actualParseResult.keys().isEmpty());
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap RatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_whenArrayList_thenReturnSizeIsZero() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    // Act
    ImmutableListMultimap<LocalDate, RatesCurveGroup> actualParseResult =
        RatesCurvesCsvLoader.parse(
            datePredicate, groupsCharSource, settingsCharSource, new ArrayList<>());

    // Assert
    assertEquals(0, actualParseResult.size());
    assertTrue(actualParseResult.isEmpty());
    assertTrue(actualParseResult.entries().isEmpty());
    assertTrue(actualParseResult.keys().isEmpty());
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); when 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap RatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_whenNull_thenThrowParseFailureException() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource groupsCharSource = StringCharSource.of("Str");

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> RatesCurvesCsvLoader.parse(datePredicate, groupsCharSource, null, new ArrayList<>()));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}
   */
  @Test
  @DisplayName("Test parseCurveSettings(CharSource); when 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map RatesCurvesCsvLoader.parseCurveSettings(CharSource)"})
  void testParseCurveSettings_whenNull_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(ParseFailureException.class, () -> RatesCurvesCsvLoader.parseCurveSettings(null));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is empty string.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}
   */
  @Test
  @DisplayName(
      "Test parseCurveSettings(CharSource); when StringCharSource with str is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map RatesCurvesCsvLoader.parseCurveSettings(CharSource)"})
  void testParseCurveSettings_whenStringCharSourceWithStrIsEmptyString() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> RatesCurvesCsvLoader.parseCurveSettings(StringCharSource.of("")));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is lf.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}
   */
  @Test
  @DisplayName("Test parseCurveSettings(CharSource); when StringCharSource with str is lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map RatesCurvesCsvLoader.parseCurveSettings(CharSource)"})
  void testParseCurveSettings_whenStringCharSourceWithStrIsLf() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> RatesCurvesCsvLoader.parseCurveSettings(StringCharSource.of("\n")));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}
   */
  @Test
  @DisplayName("Test parseCurveSettings(CharSource); when StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map RatesCurvesCsvLoader.parseCurveSettings(CharSource)"})
  void testParseCurveSettings_whenStringCharSourceWithStrIsNumberSign() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> RatesCurvesCsvLoader.parseCurveSettings(StringCharSource.of("#")));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}
   */
  @Test
  @DisplayName("Test parseCurveSettings(CharSource); when StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map RatesCurvesCsvLoader.parseCurveSettings(CharSource)"})
  void testParseCurveSettings_whenStringCharSourceWithStrIsSemicolon() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> RatesCurvesCsvLoader.parseCurveSettings(StringCharSource.of(";")));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with {@code Str}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#parseCurveSettings(CharSource)}
   */
  @Test
  @DisplayName(
      "Test parseCurveSettings(CharSource); when StringCharSource with 'Str'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map RatesCurvesCsvLoader.parseCurveSettings(CharSource)"})
  void testParseCurveSettings_whenStringCharSourceWithStr_thenReturnEmpty() {
    // Arrange and Act
    Map<CurveName, LoadedCurveSettings> actualParseCurveSettingsResult =
        RatesCurvesCsvLoader.parseCurveSettings(StringCharSource.of("Str"));

    // Assert
    assertTrue(actualParseCurveSettingsResult.isEmpty());
  }

  /**
   * Test {@link RatesCurvesCsvLoader#writeCurveSettings(File, RatesCurveGroup)} with {@code file},
   * {@code group}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#writeCurveSettings(File, RatesCurveGroup)}
   */
  @Test
  @DisplayName(
      "Test writeCurveSettings(File, RatesCurveGroup) with 'file', 'group'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RatesCurvesCsvLoader.writeCurveSettings(File, RatesCurveGroup)"})
  void testWriteCurveSettingsWithFileGroup_thenThrowUncheckedIOException() {
    // Arrange
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "foo", "42");

    // Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () -> RatesCurvesCsvLoader.writeCurveSettings(getResult.toFile(), null));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#writeCurveSettings(Appendable, RatesCurveGroup)} with {@code
   * underlying}, {@code group}.
   *
   * <ul>
   *   <li>Then {@link CharArrayWriter#CharArrayWriter()} size is eighty-two.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#writeCurveSettings(Appendable,
   * RatesCurveGroup)}
   */
  @Test
  @DisplayName(
      "Test writeCurveSettings(Appendable, RatesCurveGroup) with 'underlying', 'group'; then CharArrayWriter() size is eighty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RatesCurvesCsvLoader.writeCurveSettings(Appendable, RatesCurveGroup)"})
  void testWriteCurveSettingsWithUnderlyingGroup_thenCharArrayWriterSizeIsEightyTwo() {
    // Arrange
    CharArrayWriter underlying = new CharArrayWriter();

    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());
    RatesCurveGroup group =
        forwardCurvesResult.name(CurveGroupName.of(CsvLoaderColumns.NAME_FIELD)).build();

    // Act
    RatesCurvesCsvLoader.writeCurveSettings(underlying, group);

    // Assert
    assertEquals(82, underlying.size());
  }

  /**
   * Test {@link RatesCurvesCsvLoader#writeCurveNodes(File, LocalDate, RatesCurveGroup)} with {@code
   * file}, {@code valuationDate}, {@code group}.
   *
   * <ul>
   *   <li>Then throw {@link UncheckedIOException}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#writeCurveNodes(File, LocalDate,
   * RatesCurveGroup)}
   */
  @Test
  @DisplayName(
      "Test writeCurveNodes(File, LocalDate, RatesCurveGroup) with 'file', 'valuationDate', 'group'; then throw UncheckedIOException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RatesCurvesCsvLoader.writeCurveNodes(File, LocalDate, RatesCurveGroup)"})
  void testWriteCurveNodesWithFileValuationDateGroup_thenThrowUncheckedIOException() {
    // Arrange
    Path getResult = Paths.get(System.getProperty("java.io.tmpdir"), "foo", "42");

    // Act and Assert
    assertThrows(
        UncheckedIOException.class,
        () ->
            RatesCurvesCsvLoader.writeCurveNodes(
                getResult.toFile(), LocalDate.of(1970, 1, 1), null));
  }

  /**
   * Test {@link RatesCurvesCsvLoader#writeCurveNodes(Appendable, LocalDate, RatesCurveGroup)} with
   * {@code underlying}, {@code valuationDate}, {@code group}.
   *
   * <p>Method under test: {@link RatesCurvesCsvLoader#writeCurveNodes(Appendable, LocalDate,
   * RatesCurveGroup)}
   */
  @Test
  @DisplayName(
      "Test writeCurveNodes(Appendable, LocalDate, RatesCurveGroup) with 'underlying', 'valuationDate', 'group'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void RatesCurvesCsvLoader.writeCurveNodes(Appendable, LocalDate, RatesCurveGroup)"
  })
  void testWriteCurveNodesWithUnderlyingValuationDateGroup() {
    // Arrange
    CharArrayWriter underlying = new CharArrayWriter();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);

    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());
    RatesCurveGroup group =
        forwardCurvesResult.name(CurveGroupName.of(CsvLoaderColumns.NAME_FIELD)).build();

    // Act
    RatesCurvesCsvLoader.writeCurveNodes(underlying, valuationDate, group);

    // Assert
    assertEquals(43, underlying.size());
  }
}
