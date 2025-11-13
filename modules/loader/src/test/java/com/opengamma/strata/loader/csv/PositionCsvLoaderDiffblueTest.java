package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.CharSource;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.collect.io.ResourceLocator;
import com.opengamma.strata.collect.io.StringCharSource;
import com.opengamma.strata.collect.result.FailureItem;
import com.opengamma.strata.collect.result.FailureReason;
import com.opengamma.strata.collect.result.ValueWithFailures;
import com.opengamma.strata.product.Position;
import com.opengamma.strata.product.SecurityPosition;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PositionCsvLoaderDiffblueTest {
  /**
   * Test {@link PositionCsvLoader#load(Collection)} with {@code Collection}.
   *
   * <p>Method under test: {@link PositionCsvLoader#load(Collection)}
   */
  @Test
  @DisplayName("Test load(Collection) with 'Collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.load(Collection)"})
  void testLoadWithCollection() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    // Act
    ValueWithFailures<List<Position>> actualLoadResult = standardResult.load(new ArrayList<>());

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualLoadResult.hasFailures());
    ImmutableList<FailureItem> failures = actualLoadResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualLoadResult.getValue());
  }

  /**
   * Test {@link PositionCsvLoader#load(ResourceLocator[])} with {@code ResourceLocator[]}.
   *
   * <ul>
   *   <li>Then standard parse {@code null} Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#load(ResourceLocator[])}
   */
  @Test
  @DisplayName(
      "Test load(ResourceLocator[]) with 'ResourceLocator[]'; then standard parse 'null' Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.load(ResourceLocator[])"})
  void testLoadWithResourceLocator_thenStandardParseNullFailuresSizeIsOne() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    // Act
    ValueWithFailures<List<Position>> actualLoadResult = standardResult.load();

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualLoadResult.hasFailures());
    ImmutableList<FailureItem> failures = actualLoadResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualLoadResult.getValue());
  }

  /**
   * Test {@link PositionCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName("Test isKnownFormat(CharSource); then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_thenReturnTrue() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult =
        standardResult.isKnownFormat(StringCharSource.of(CsvLoaderColumns.POSITION_TYPE_FIELD));

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertTrue(actualIsKnownFormatResult);
  }

  /**
   * Test {@link PositionCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName("Test isKnownFormat(CharSource); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenNull_thenReturnFalse() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult = standardResult.isKnownFormat(null);

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualIsKnownFormatResult);
  }

  /**
   * Test {@link PositionCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(CharSource); when StringCharSource with str is 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsNull_thenReturnFalse() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult = standardResult.isKnownFormat(StringCharSource.of(null));

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualIsKnownFormatResult);
  }

  /**
   * Test {@link PositionCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(CharSource); when StringCharSource with str is '#'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsNumberSign_thenReturnFalse() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult = standardResult.isKnownFormat(StringCharSource.of("#"));

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualIsKnownFormatResult);
  }

  /**
   * Test {@link PositionCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(CharSource); when StringCharSource with str is ';'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsSemicolon_thenReturnFalse() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult = standardResult.isKnownFormat(StringCharSource.of(";"));

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualIsKnownFormatResult);
  }

  /**
   * Test {@link PositionCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with {@code Str}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(CharSource); when StringCharSource with 'Str'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PositionCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStr_thenReturnFalse() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult = standardResult.isKnownFormat(StringCharSource.of("Str"));

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualIsKnownFormatResult);
  }

  /**
   * Test {@link PositionCsvLoader#parse(Collection, Class)} with {@code charSources}, {@code
   * positionType}.
   *
   * <p>Method under test: {@link PositionCsvLoader#parse(Collection, Class)}
   */
  @Test
  @DisplayName("Test parse(Collection, Class) with 'charSources', 'positionType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parse(Collection, Class)"})
  void testParseWithCharSourcesPositionType() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of(CsvLoaderColumns.POSITION_TYPE_FIELD));
    Class<Position> positionType = Position.class;

    // Act
    ValueWithFailures<List<Position>> actualParseResult =
        standardResult.parse(charSources, positionType);

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualParseResult.hasFailures());
    ImmutableList<FailureItem> failures = actualParseResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualParseResult.getValue());
  }

  /**
   * Test {@link PositionCsvLoader#parse(Collection, Class)} with {@code charSources}, {@code
   * positionType}.
   *
   * <ul>
   *   <li>Then return Failures size is five.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parse(Collection, Class)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, Class) with 'charSources', 'positionType'; then return Failures size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parse(Collection, Class)"})
  void testParseWithCharSourcesPositionType_thenReturnFailuresSizeIsFive() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("Str"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));
    Class<Position> positionType = Position.class;

    // Act and Assert
    ImmutableList<FailureItem> failures =
        standardResult.parse(charSources, positionType).getFailures();
    assertEquals(5, failures.size());
    FailureItem expectedGetResult = failures.get(0);
    assertEquals(expectedGetResult, failures.get(4));
  }

  /**
   * Test {@link PositionCsvLoader#parse(Collection, Class)} with {@code charSources}, {@code
   * positionType}.
   *
   * <ul>
   *   <li>Then return Failures size is four.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parse(Collection, Class)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, Class) with 'charSources', 'positionType'; then return Failures size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parse(Collection, Class)"})
  void testParseWithCharSourcesPositionType_thenReturnFailuresSizeIsFour() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("Str"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));
    Class<Position> positionType = Position.class;

    // Act and Assert
    ImmutableList<FailureItem> failures =
        standardResult.parse(charSources, positionType).getFailures();
    assertEquals(4, failures.size());
    FailureItem getResult = failures.get(0);
    assertEquals(getResult, failures.get(2));
    assertEquals(getResult, failures.get(3));
  }

  /**
   * Test {@link PositionCsvLoader#parse(Collection, Class)} with {@code charSources}, {@code
   * positionType}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parse(Collection, Class)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, Class) with 'charSources', 'positionType'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parse(Collection, Class)"})
  void testParseWithCharSourcesPositionType_thenReturnFailuresSizeIsTwo() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));
    Class<Position> positionType = Position.class;

    // Act and Assert
    ImmutableList<FailureItem> failures =
        standardResult.parse(charSources, positionType).getFailures();
    assertEquals(2, failures.size());
    FailureItem expectedGetResult = failures.get(0);
    assertEquals(expectedGetResult, failures.get(1));
  }

  /**
   * Test {@link PositionCsvLoader#parse(Collection, Class)} with {@code charSources}, {@code
   * positionType}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not hasFailures.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parse(Collection, Class)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, Class) with 'charSources', 'positionType'; when ArrayList(); then return not hasFailures")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parse(Collection, Class)"})
  void testParseWithCharSourcesPositionType_whenArrayList_thenReturnNotHasFailures() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();
    ArrayList<CharSource> charSources = new ArrayList<>();
    Class<Position> positionType = Position.class;

    // Act
    ValueWithFailures<List<Position>> actualParseResult =
        standardResult.parse(charSources, positionType);

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualParseResult.hasFailures());
    ImmutableList<FailureItem> failures = actualParseResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualParseResult.getValue());
  }

  /**
   * Test {@link PositionCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Given standard.
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not hasFailures.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection) with 'charSources'; given standard; when ArrayList(); then return not hasFailures")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parse(Collection)"})
  void testParseWithCharSources_givenStandard_whenArrayList_thenReturnNotHasFailures() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    // Act
    ValueWithFailures<List<Position>> actualParseResult = standardResult.parse(new ArrayList<>());

    // Assert
    assertFalse(actualParseResult.hasFailures());
    ImmutableList<FailureItem> failures = actualParseResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualParseResult.getValue());
  }

  /**
   * Test {@link PositionCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@link CsvLoaderColumns#POSITION_TYPE_FIELD}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection) with 'charSources'; given StringCharSource with str is POSITION_TYPE_FIELD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parse(Collection)"})
  void testParseWithCharSources_givenStringCharSourceWithStrIsPosition_type_field() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of(CsvLoaderColumns.POSITION_TYPE_FIELD));

    // Act
    ValueWithFailures<List<Position>> actualParseResult = standardResult.parse(charSources);

    // Assert
    assertFalse(actualParseResult.hasFailures());
    ImmutableList<FailureItem> failures = actualParseResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualParseResult.getValue());
  }

  /**
   * Test {@link PositionCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Then return Failures second is Failures first.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection) with 'charSources'; then return Failures second is Failures first")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parse(Collection)"})
  void testParseWithCharSources_thenReturnFailuresSecondIsFailuresFirst() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));

    // Act and Assert
    ImmutableList<FailureItem> failures = standardResult.parse(charSources).getFailures();
    assertEquals(2, failures.size());
    FailureItem expectedGetResult = failures.get(0);
    assertEquals(expectedGetResult, failures.get(1));
  }

  /**
   * Test {@link PositionCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Then return Failures size is five.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection) with 'charSources'; then return Failures size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parse(Collection)"})
  void testParseWithCharSources_thenReturnFailuresSizeIsFive() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("Str"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));

    // Act and Assert
    ImmutableList<FailureItem> failures = standardResult.parse(charSources).getFailures();
    assertEquals(5, failures.size());
    FailureItem expectedGetResult = failures.get(0);
    assertEquals(expectedGetResult, failures.get(4));
  }

  /**
   * Test {@link PositionCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Then return Failures size is four.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection) with 'charSources'; then return Failures size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parse(Collection)"})
  void testParseWithCharSources_thenReturnFailuresSizeIsFour() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("Str"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));

    // Act and Assert
    ImmutableList<FailureItem> failures = standardResult.parse(charSources).getFailures();
    assertEquals(4, failures.size());
    FailureItem getResult = failures.get(0);
    assertEquals(getResult, failures.get(2));
    assertEquals(getResult, failures.get(3));
  }

  /**
   * Test {@link PositionCsvLoader#parseLightweight(Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@link CsvLoaderColumns#POSITION_TYPE_FIELD}.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parseLightweight(Collection)}
   */
  @Test
  @DisplayName(
      "Test parseLightweight(Collection); given StringCharSource with str is POSITION_TYPE_FIELD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parseLightweight(Collection)"})
  void testParseLightweight_givenStringCharSourceWithStrIsPosition_type_field() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of(CsvLoaderColumns.POSITION_TYPE_FIELD));

    // Act
    ValueWithFailures<List<SecurityPosition>> actualParseLightweightResult =
        standardResult.parseLightweight(charSources);

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualParseLightweightResult.hasFailures());
    ImmutableList<FailureItem> failures = actualParseLightweightResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualParseLightweightResult.getValue());
  }

  /**
   * Test {@link PositionCsvLoader#parseLightweight(Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code {U}}.
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parseLightweight(Collection)}
   */
  @Test
  @DisplayName(
      "Test parseLightweight(Collection); given StringCharSource with str is '{U}'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parseLightweight(Collection)"})
  void testParseLightweight_givenStringCharSourceWithStrIsU_thenReturnFailuresSizeIsTwo() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));

    // Act and Assert
    ImmutableList<FailureItem> failures =
        standardResult.parseLightweight(charSources).getFailures();
    assertEquals(2, failures.size());
    FailureItem expectedGetResult = failures.get(0);
    assertEquals(expectedGetResult, failures.get(1));
  }

  /**
   * Test {@link PositionCsvLoader#parseLightweight(Collection)}.
   *
   * <ul>
   *   <li>Then return Failures size is five.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parseLightweight(Collection)}
   */
  @Test
  @DisplayName("Test parseLightweight(Collection); then return Failures size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parseLightweight(Collection)"})
  void testParseLightweight_thenReturnFailuresSizeIsFive() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("Str"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));

    // Act and Assert
    ImmutableList<FailureItem> failures =
        standardResult.parseLightweight(charSources).getFailures();
    assertEquals(5, failures.size());
    FailureItem expectedGetResult = failures.get(0);
    assertEquals(expectedGetResult, failures.get(4));
  }

  /**
   * Test {@link PositionCsvLoader#parseLightweight(Collection)}.
   *
   * <ul>
   *   <li>Then return Failures size is four.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parseLightweight(Collection)}
   */
  @Test
  @DisplayName("Test parseLightweight(Collection); then return Failures size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parseLightweight(Collection)"})
  void testParseLightweight_thenReturnFailuresSizeIsFour() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("Str"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));

    // Act and Assert
    ImmutableList<FailureItem> failures =
        standardResult.parseLightweight(charSources).getFailures();
    assertEquals(4, failures.size());
    FailureItem getResult = failures.get(0);
    assertEquals(getResult, failures.get(2));
    assertEquals(getResult, failures.get(3));
  }

  /**
   * Test {@link PositionCsvLoader#parseLightweight(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not hasFailures.
   * </ul>
   *
   * <p>Method under test: {@link PositionCsvLoader#parseLightweight(Collection)}
   */
  @Test
  @DisplayName("Test parseLightweight(Collection); when ArrayList(); then return not hasFailures")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures PositionCsvLoader.parseLightweight(Collection)"})
  void testParseLightweight_whenArrayList_thenReturnNotHasFailures() {
    // Arrange
    PositionCsvLoader standardResult = PositionCsvLoader.standard();

    // Act
    ValueWithFailures<List<SecurityPosition>> actualParseLightweightResult =
        standardResult.parseLightweight(new ArrayList<>());

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualParseLightweightResult.hasFailures());
    ImmutableList<FailureItem> failures = actualParseLightweightResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualParseLightweightResult.getValue());
  }
}
