package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.io.ResourceLocator;
import com.opengamma.strata.collect.io.StringCharSource;
import com.opengamma.strata.collect.result.ParseFailureException;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.ObservableId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixingSeriesCsvLoaderDiffblueTest {
  /**
   * Test {@link FixingSeriesCsvLoader#load(Collection)} with {@code Collection}.
   *
   * <p>Method under test: {@link FixingSeriesCsvLoader#load(Collection)}
   */
  @Test
  @DisplayName("Test load(Collection) with 'Collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FixingSeriesCsvLoader.load(Collection)"})
  void testLoadWithCollection() {
    // Arrange and Act
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> actualLoadResult =
        FixingSeriesCsvLoader.load(new ArrayList<>());

    // Assert
    assertTrue(actualLoadResult.isEmpty());
  }

  /**
   * Test {@link FixingSeriesCsvLoader#load(ResourceLocator[])} with {@code ResourceLocator[]}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FixingSeriesCsvLoader#load(ResourceLocator[])}
   */
  @Test
  @DisplayName("Test load(ResourceLocator[]) with 'ResourceLocator[]'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FixingSeriesCsvLoader.load(ResourceLocator[])"})
  void testLoadWithResourceLocator_thenReturnEmpty() {
    // Arrange and Act
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> actualLoadResult =
        FixingSeriesCsvLoader.load();

    // Assert
    assertTrue(actualLoadResult.isEmpty());
  }

  /**
   * Test {@link FixingSeriesCsvLoader#parse(Collection)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link FixingSeriesCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection); given 'null'; when LinkedHashSet() add 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FixingSeriesCsvLoader.parse(Collection)"})
  void testParse_givenNull_whenLinkedHashSetAddNull_thenThrowParseFailureException() {
    // Arrange
    LinkedHashSet<CharSource> charSources = new LinkedHashSet<>();
    charSources.add(null);

    // Act and Assert
    assertThrows(ParseFailureException.class, () -> FixingSeriesCsvLoader.parse(charSources));
  }

  /**
   * Test {@link FixingSeriesCsvLoader#parse(Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link FixingSeriesCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection); given StringCharSource with 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FixingSeriesCsvLoader.parse(Collection)"})
  void testParse_givenStringCharSourceWithStr() {
    // Arrange
    LinkedHashSet<CharSource> charSources = new LinkedHashSet<>();
    charSources.add(StringCharSource.of("Str"));

    // Act
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> actualParseResult =
        FixingSeriesCsvLoader.parse(charSources);

    // Assert
    assertTrue(actualParseResult.isEmpty());
  }

  /**
   * Test {@link FixingSeriesCsvLoader#parse(Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is empty string.
   * </ul>
   *
   * <p>Method under test: {@link FixingSeriesCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection); given StringCharSource with str is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FixingSeriesCsvLoader.parse(Collection)"})
  void testParse_givenStringCharSourceWithStrIsEmptyString() {
    // Arrange
    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(ParseFailureException.class, () -> FixingSeriesCsvLoader.parse(charSources));
  }

  /**
   * Test {@link FixingSeriesCsvLoader#parse(Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is lf.
   * </ul>
   *
   * <p>Method under test: {@link FixingSeriesCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection); given StringCharSource with str is lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FixingSeriesCsvLoader.parse(Collection)"})
  void testParse_givenStringCharSourceWithStrIsLf() {
    // Arrange
    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("\n"));
    charSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(ParseFailureException.class, () -> FixingSeriesCsvLoader.parse(charSources));
  }

  /**
   * Test {@link FixingSeriesCsvLoader#parse(Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link FixingSeriesCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection); given StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FixingSeriesCsvLoader.parse(Collection)"})
  void testParse_givenStringCharSourceWithStrIsNumberSign() {
    // Arrange
    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("#"));
    charSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(ParseFailureException.class, () -> FixingSeriesCsvLoader.parse(charSources));
  }

  /**
   * Test {@link FixingSeriesCsvLoader#parse(Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link FixingSeriesCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection); given StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FixingSeriesCsvLoader.parse(Collection)"})
  void testParse_givenStringCharSourceWithStrIsSemicolon() {
    // Arrange
    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of(";"));
    charSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(ParseFailureException.class, () -> FixingSeriesCsvLoader.parse(charSources));
  }

  /**
   * Test {@link FixingSeriesCsvLoader#parse(Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link FixingSeriesCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection); given StringCharSource with str is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FixingSeriesCsvLoader.parse(Collection)"})
  void testParse_givenStringCharSourceWithStrIsU() {
    // Arrange
    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(ParseFailureException.class, () -> FixingSeriesCsvLoader.parse(charSources));
  }

  /**
   * Test {@link FixingSeriesCsvLoader#parse(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FixingSeriesCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FixingSeriesCsvLoader.parse(Collection)"})
  void testParse_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    ImmutableMap<ObservableId, LocalDateDoubleTimeSeries> actualParseResult =
        FixingSeriesCsvLoader.parse(new ArrayList<>());

    // Assert
    assertTrue(actualParseResult.isEmpty());
  }
}
