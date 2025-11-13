package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.CharSource;
import com.opengamma.strata.basics.currency.FxRate;
import com.opengamma.strata.collect.io.ResourceLocator;
import com.opengamma.strata.collect.io.StringCharSource;
import com.opengamma.strata.collect.result.ParseFailureException;
import com.opengamma.strata.data.FxRateId;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxRatesCsvLoaderDiffblueTest {
  /**
   * Test {@link FxRatesCsvLoader#load(LocalDate, Collection)} with {@code LocalDate}, {@code
   * Collection}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#load(LocalDate, Collection)}
   */
  @Test
  @DisplayName(
      "Test load(LocalDate, Collection) with 'LocalDate', 'Collection'; when LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.load(LocalDate, Collection)"})
  void testLoadWithLocalDateCollection_whenLocalDateWith1970AndOneAndOne() {
    // Arrange
    LocalDate marketDataDate = LocalDate.of(1970, 1, 1);

    // Act
    ImmutableMap<FxRateId, FxRate> actualLoadResult =
        FxRatesCsvLoader.load(marketDataDate, new ArrayList<>());

    // Assert
    assertTrue(actualLoadResult.isEmpty());
  }

  /**
   * Test {@link FxRatesCsvLoader#load(LocalDate, Collection)} with {@code LocalDate}, {@code
   * Collection}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#load(LocalDate, Collection)}
   */
  @Test
  @DisplayName("Test load(LocalDate, Collection) with 'LocalDate', 'Collection'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.load(LocalDate, Collection)"})
  void testLoadWithLocalDateCollection_whenNull() {
    // Arrange and Act
    ImmutableMap<FxRateId, FxRate> actualLoadResult =
        FxRatesCsvLoader.load((LocalDate) null, new ArrayList<>());

    // Assert
    assertTrue(actualLoadResult.isEmpty());
  }

  /**
   * Test {@link FxRatesCsvLoader#load(LocalDate, ResourceLocator[])} with {@code LocalDate}, {@code
   * ResourceLocator[]}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#load(LocalDate, ResourceLocator[])}
   */
  @Test
  @DisplayName(
      "Test load(LocalDate, ResourceLocator[]) with 'LocalDate', 'ResourceLocator[]'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.load(LocalDate, ResourceLocator[])"})
  void testLoadWithLocalDateResourceLocator_thenReturnEmpty() {
    // Arrange and Act
    ImmutableMap<FxRateId, FxRate> actualLoadResult =
        FxRatesCsvLoader.load(LocalDate.of(1970, 1, 1));

    // Assert
    assertTrue(actualLoadResult.isEmpty());
  }

  /**
   * Test {@link FxRatesCsvLoader#load(LocalDate, ResourceLocator[])} with {@code LocalDate}, {@code
   * ResourceLocator[]}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#load(LocalDate, ResourceLocator[])}
   */
  @Test
  @DisplayName(
      "Test load(LocalDate, ResourceLocator[]) with 'LocalDate', 'ResourceLocator[]'; when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.load(LocalDate, ResourceLocator[])"})
  void testLoadWithLocalDateResourceLocator_whenNull_thenReturnEmpty() {
    // Arrange and Act
    ImmutableMap<FxRateId, FxRate> actualLoadResult = FxRatesCsvLoader.load((LocalDate) null);

    // Assert
    assertTrue(actualLoadResult.isEmpty());
  }

  /**
   * Test {@link FxRatesCsvLoader#load(Set, Collection)} with {@code Set}, {@code Collection}.
   *
   * <ul>
   *   <li>Given {@link LocalDate} with {@code 1970} and one and one.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#load(Set, Collection)}
   */
  @Test
  @DisplayName(
      "Test load(Set, Collection) with 'Set', 'Collection'; given LocalDate with '1970' and one and one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.load(Set, Collection)"})
  void testLoadWithSetCollection_givenLocalDateWith1970AndOneAndOne() {
    // Arrange
    HashSet<LocalDate> marketDataDates = new HashSet<>();
    marketDataDates.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableMap<LocalDate, ImmutableMap<FxRateId, FxRate>> actualLoadResult =
        FxRatesCsvLoader.load(marketDataDates, new ArrayList<>());

    // Assert
    assertTrue(actualLoadResult.isEmpty());
  }

  /**
   * Test {@link FxRatesCsvLoader#load(Set, Collection)} with {@code Set}, {@code Collection}.
   *
   * <ul>
   *   <li>Given now.
   *   <li>When {@link HashSet#HashSet()} add now.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#load(Set, Collection)}
   */
  @Test
  @DisplayName(
      "Test load(Set, Collection) with 'Set', 'Collection'; given now; when HashSet() add now")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.load(Set, Collection)"})
  void testLoadWithSetCollection_givenNow_whenHashSetAddNow() {
    // Arrange
    HashSet<LocalDate> marketDataDates = new HashSet<>();
    marketDataDates.add(LocalDate.now());
    marketDataDates.add(LocalDate.of(1970, 1, 1));

    // Act
    ImmutableMap<LocalDate, ImmutableMap<FxRateId, FxRate>> actualLoadResult =
        FxRatesCsvLoader.load(marketDataDates, new ArrayList<>());

    // Assert
    assertTrue(actualLoadResult.isEmpty());
  }

  /**
   * Test {@link FxRatesCsvLoader#load(Set, Collection)} with {@code Set}, {@code Collection}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#load(Set, Collection)}
   */
  @Test
  @DisplayName("Test load(Set, Collection) with 'Set', 'Collection'; when HashSet()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.load(Set, Collection)"})
  void testLoadWithSetCollection_whenHashSet() {
    // Arrange
    HashSet<LocalDate> marketDataDates = new HashSet<>();

    // Act
    ImmutableMap<LocalDate, ImmutableMap<FxRateId, FxRate>> actualLoadResult =
        FxRatesCsvLoader.load(marketDataDates, new ArrayList<>());

    // Assert
    assertTrue(actualLoadResult.isEmpty());
  }

  /**
   * Test {@link FxRatesCsvLoader#load(Set, ResourceLocator[])} with {@code Set}, {@code
   * ResourceLocator[]}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#load(Set, ResourceLocator[])}
   */
  @Test
  @DisplayName(
      "Test load(Set, ResourceLocator[]) with 'Set', 'ResourceLocator[]'; when HashSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.load(Set, ResourceLocator[])"})
  void testLoadWithSetResourceLocator_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    ImmutableMap<LocalDate, ImmutableMap<FxRateId, FxRate>> actualLoadResult =
        FxRatesCsvLoader.load(new HashSet<>());

    // Assert
    assertTrue(actualLoadResult.isEmpty());
  }

  /**
   * Test {@link FxRatesCsvLoader#loadAllDates(Collection)} with {@code Collection}.
   *
   * <p>Method under test: {@link FxRatesCsvLoader#loadAllDates(Collection)}
   */
  @Test
  @DisplayName("Test loadAllDates(Collection) with 'Collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.loadAllDates(Collection)"})
  void testLoadAllDatesWithCollection() {
    // Arrange and Act
    ImmutableMap<LocalDate, ImmutableMap<FxRateId, FxRate>> actualLoadAllDatesResult =
        FxRatesCsvLoader.loadAllDates(new ArrayList<>());

    // Assert
    assertTrue(actualLoadAllDatesResult.isEmpty());
  }

  /**
   * Test {@link FxRatesCsvLoader#loadAllDates(ResourceLocator[])} with {@code ResourceLocator[]}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#loadAllDates(ResourceLocator[])}
   */
  @Test
  @DisplayName("Test loadAllDates(ResourceLocator[]) with 'ResourceLocator[]'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.loadAllDates(ResourceLocator[])"})
  void testLoadAllDatesWithResourceLocator_thenReturnEmpty() {
    // Arrange and Act
    ImmutableMap<LocalDate, ImmutableMap<FxRateId, FxRate>> actualLoadAllDatesResult =
        FxRatesCsvLoader.loadAllDates();

    // Assert
    assertTrue(actualLoadAllDatesResult.isEmpty());
  }

  /**
   * Test {@link FxRatesCsvLoader#parse(Predicate, Collection)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>When {@link LinkedHashSet#LinkedHashSet()} add {@code null}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#parse(Predicate, Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Predicate, Collection); given 'null'; when LinkedHashSet() add 'null'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.parse(Predicate, Collection)"})
  void testParse_givenNull_whenLinkedHashSetAddNull_thenThrowParseFailureException() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);

    LinkedHashSet<CharSource> charSources = new LinkedHashSet<>();
    charSources.add(null);

    // Act and Assert
    assertThrows(
        ParseFailureException.class, () -> FxRatesCsvLoader.parse(datePredicate, charSources));
  }

  /**
   * Test {@link FxRatesCsvLoader#parse(Predicate, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#parse(Predicate, Collection)}
   */
  @Test
  @DisplayName("Test parse(Predicate, Collection); given StringCharSource with 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.parse(Predicate, Collection)"})
  void testParse_givenStringCharSourceWithStr() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);

    LinkedHashSet<CharSource> charSources = new LinkedHashSet<>();
    charSources.add(StringCharSource.of("Str"));

    // Act
    ImmutableMap<LocalDate, ImmutableMap<FxRateId, FxRate>> actualParseResult =
        FxRatesCsvLoader.parse(datePredicate, charSources);

    // Assert
    assertTrue(actualParseResult.isEmpty());
  }

  /**
   * Test {@link FxRatesCsvLoader#parse(Predicate, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is empty string.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#parse(Predicate, Collection)}
   */
  @Test
  @DisplayName("Test parse(Predicate, Collection); given StringCharSource with str is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.parse(Predicate, Collection)"})
  void testParse_givenStringCharSourceWithStrIsEmptyString() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class, () -> FxRatesCsvLoader.parse(datePredicate, charSources));
  }

  /**
   * Test {@link FxRatesCsvLoader#parse(Predicate, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is lf.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#parse(Predicate, Collection)}
   */
  @Test
  @DisplayName("Test parse(Predicate, Collection); given StringCharSource with str is lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.parse(Predicate, Collection)"})
  void testParse_givenStringCharSourceWithStrIsLf() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("\n"));
    charSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class, () -> FxRatesCsvLoader.parse(datePredicate, charSources));
  }

  /**
   * Test {@link FxRatesCsvLoader#parse(Predicate, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#parse(Predicate, Collection)}
   */
  @Test
  @DisplayName("Test parse(Predicate, Collection); given StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.parse(Predicate, Collection)"})
  void testParse_givenStringCharSourceWithStrIsNumberSign() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("#"));
    charSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class, () -> FxRatesCsvLoader.parse(datePredicate, charSources));
  }

  /**
   * Test {@link FxRatesCsvLoader#parse(Predicate, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#parse(Predicate, Collection)}
   */
  @Test
  @DisplayName("Test parse(Predicate, Collection); given StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.parse(Predicate, Collection)"})
  void testParse_givenStringCharSourceWithStrIsSemicolon() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of(";"));
    charSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class, () -> FxRatesCsvLoader.parse(datePredicate, charSources));
  }

  /**
   * Test {@link FxRatesCsvLoader#parse(Predicate, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code {U}}.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#parse(Predicate, Collection)}
   */
  @Test
  @DisplayName("Test parse(Predicate, Collection); given StringCharSource with str is '{U}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.parse(Predicate, Collection)"})
  void testParse_givenStringCharSourceWithStrIsU() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class, () -> FxRatesCsvLoader.parse(datePredicate, charSources));
  }

  /**
   * Test {@link FxRatesCsvLoader#parse(Predicate, Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link FxRatesCsvLoader#parse(Predicate, Collection)}
   */
  @Test
  @DisplayName("Test parse(Predicate, Collection); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap FxRatesCsvLoader.parse(Predicate, Collection)"})
  void testParse_whenArrayList_thenReturnEmpty() {
    // Arrange
    Predicate<LocalDate> datePredicate = mock(Predicate.class);

    // Act
    ImmutableMap<LocalDate, ImmutableMap<FxRateId, FxRate>> actualParseResult =
        FxRatesCsvLoader.parse(datePredicate, new ArrayList<>());

    // Assert
    assertTrue(actualParseResult.isEmpty());
  }
}
