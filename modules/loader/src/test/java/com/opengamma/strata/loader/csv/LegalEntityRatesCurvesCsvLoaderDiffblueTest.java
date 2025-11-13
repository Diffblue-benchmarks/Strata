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
import com.opengamma.strata.market.curve.LegalEntityCurveGroup;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.function.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LegalEntityRatesCurvesCsvLoaderDiffblueTest {
  /**
   * Test {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource,
   * CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap LegalEntityRatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStr() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    LinkedHashSet<CharSource> curveValueCharSources = new LinkedHashSet<>();
    curveValueCharSources.add(StringCharSource.of("Str"));

    // Act
    ImmutableListMultimap<LocalDate, LegalEntityCurveGroup> actualParseResult =
        LegalEntityRatesCurvesCsvLoader.parse(
            datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources);

    // Assert
    assertEquals(0, actualParseResult.size());
    assertTrue(actualParseResult.isEmpty());
    assertTrue(actualParseResult.entries().isEmpty());
    assertTrue(actualParseResult.keys().isEmpty());
  }

  /**
   * Test {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is empty string.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource,
   * CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with str is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap LegalEntityRatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
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
            LegalEntityRatesCurvesCsvLoader.parse(
                datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources));
  }

  /**
   * Test {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is lf.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource,
   * CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with str is lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap LegalEntityRatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
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
            LegalEntityRatesCurvesCsvLoader.parse(
                datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources));
  }

  /**
   * Test {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource,
   * CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap LegalEntityRatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
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
            LegalEntityRatesCurvesCsvLoader.parse(
                datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources));
  }

  /**
   * Test {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource,
   * CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap LegalEntityRatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
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
            LegalEntityRatesCurvesCsvLoader.parse(
                datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources));
  }

  /**
   * Test {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource,
   * CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); given StringCharSource with str is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap LegalEntityRatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
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
            LegalEntityRatesCurvesCsvLoader.parse(
                datePredicate, groupsCharSource, settingsCharSource, curveValueCharSources));
  }

  /**
   * Test {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource,
   * CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); when ArrayList(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap LegalEntityRatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_whenArrayList_thenReturnSizeIsZero() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    // Act
    ImmutableListMultimap<LocalDate, LegalEntityCurveGroup> actualParseResult =
        LegalEntityRatesCurvesCsvLoader.parse(
            datePredicate, groupsCharSource, settingsCharSource, new ArrayList<>());

    // Assert
    assertEquals(0, actualParseResult.size());
    assertTrue(actualParseResult.isEmpty());
    assertTrue(actualParseResult.entries().isEmpty());
    assertTrue(actualParseResult.keys().isEmpty());
  }

  /**
   * Test {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource,
   * CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); when 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap LegalEntityRatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_whenNull_thenThrowParseFailureException() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            LegalEntityRatesCurvesCsvLoader.parse(
                datePredicate, null, settingsCharSource, new ArrayList<>()));
  }

  /**
   * Test {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource,
   * CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); when 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap LegalEntityRatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_whenNull_thenThrowParseFailureException2() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);
    StringCharSource groupsCharSource = StringCharSource.of("Str");

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            LegalEntityRatesCurvesCsvLoader.parse(
                datePredicate, groupsCharSource, null, new ArrayList<>()));
  }

  /**
   * Test {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link LegalEntityRatesCurvesCsvLoader#parse(Predicate, CharSource,
   * CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, CharSource, CharSource, Collection); when 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap LegalEntityRatesCurvesCsvLoader.parse(Predicate, CharSource, CharSource, Collection)"
  })
  void testParse_whenNull_thenThrowParseFailureException3() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () -> LegalEntityRatesCurvesCsvLoader.parse(datePredicate, null, null, new ArrayList<>()));
  }
}
