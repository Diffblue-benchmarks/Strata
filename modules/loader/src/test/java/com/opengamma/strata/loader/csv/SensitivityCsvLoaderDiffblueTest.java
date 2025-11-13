package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ListMultimap;
import com.google.common.io.CharSource;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.collect.io.StringCharSource;
import com.opengamma.strata.collect.result.FailureItem;
import com.opengamma.strata.collect.result.ValueWithFailures;
import com.opengamma.strata.market.sensitivity.CurveSensitivities;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SensitivityCsvLoaderDiffblueTest {
  /**
   * Test {@link SensitivityCsvLoader#standard()}.
   *
   * <p>Method under test: {@link SensitivityCsvLoader#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SensitivityCsvLoader SensitivityCsvLoader.standard()"})
  void testStandard() {
    // Arrange, Act and Assert
    assertFalse(SensitivityCsvLoader.standard().isKnownFormat(null));
  }

  /**
   * Test {@link SensitivityCsvLoader#of(ReferenceData)} with {@code refData}.
   *
   * <ul>
   *   <li>When {@link ReferenceData}.
   *   <li>Then return not KnownFormat is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#of(ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(ReferenceData) with 'refData'; when ReferenceData; then return not KnownFormat is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SensitivityCsvLoader SensitivityCsvLoader.of(ReferenceData)"})
  void testOfWithRefData_whenReferenceData_thenReturnNotKnownFormatIsNull() {
    // Arrange, Act and Assert
    assertFalse(SensitivityCsvLoader.of(mock(ReferenceData.class)).isKnownFormat(null));
  }

  /**
   * Test {@link SensitivityCsvLoader#of(SensitivityCsvInfoResolver)} with {@code resolver}.
   *
   * <ul>
   *   <li>When {@link SensitivityCsvInfoResolver}.
   *   <li>Then return not KnownFormat is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#of(SensitivityCsvInfoResolver)}
   */
  @Test
  @DisplayName(
      "Test of(SensitivityCsvInfoResolver) with 'resolver'; when SensitivityCsvInfoResolver; then return not KnownFormat is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SensitivityCsvLoader SensitivityCsvLoader.of(SensitivityCsvInfoResolver)"})
  void testOfWithResolver_whenSensitivityCsvInfoResolver_thenReturnNotKnownFormatIsNull() {
    // Arrange, Act and Assert
    assertFalse(
        SensitivityCsvLoader.of(mock(SensitivityCsvInfoResolver.class)).isKnownFormat(null));
  }

  /**
   * Test {@link SensitivityCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName("Test isKnownFormat(CharSource); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SensitivityCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenNull() {
    // Arrange, Act and Assert
    assertFalse(SensitivityCsvLoader.standard().isKnownFormat(null));
  }

  /**
   * Test {@link SensitivityCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName("Test isKnownFormat(CharSource); when StringCharSource with 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SensitivityCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStr() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    // Act and Assert
    assertFalse(standardResult.isKnownFormat(StringCharSource.of("Str")));
  }

  /**
   * Test {@link SensitivityCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName("Test isKnownFormat(CharSource); when StringCharSource with str is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SensitivityCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsNull() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    // Act and Assert
    assertFalse(standardResult.isKnownFormat(StringCharSource.of(null)));
  }

  /**
   * Test {@link SensitivityCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName("Test isKnownFormat(CharSource); when StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SensitivityCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsNumberSign() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    // Act and Assert
    assertFalse(standardResult.isKnownFormat(StringCharSource.of("#")));
  }

  /**
   * Test {@link SensitivityCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName("Test isKnownFormat(CharSource); when StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SensitivityCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsSemicolon() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    // Act and Assert
    assertFalse(standardResult.isKnownFormat(StringCharSource.of(";")));
  }

  /**
   * Test {@link SensitivityCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code Sensitivity Date}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(CharSource); when StringCharSource with str is 'Sensitivity Date'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SensitivityCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsSensitivityDate() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    // Act and Assert
    assertFalse(standardResult.isKnownFormat(StringCharSource.of("Sensitivity Date")));
  }

  /**
   * Test {@link SensitivityCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code Sensitivity Tenor}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(CharSource); when StringCharSource with str is 'Sensitivity Tenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean SensitivityCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsSensitivityTenor() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    // Act and Assert
    assertFalse(standardResult.isKnownFormat(StringCharSource.of("Sensitivity Tenor")));
  }

  /**
   * Test {@link SensitivityCsvLoader#load(Collection)}.
   *
   * <p>Method under test: {@link SensitivityCsvLoader#load(Collection)}
   */
  @Test
  @DisplayName("Test load(Collection)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures SensitivityCsvLoader.load(Collection)"})
  void testLoad() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    // Act
    ValueWithFailures<ListMultimap<String, CurveSensitivities>> actualLoadResult =
        standardResult.load(new ArrayList<>());

    // Assert
    assertFalse(actualLoadResult.hasFailures());
    assertTrue(actualLoadResult.getFailures().isEmpty());
  }

  /**
   * Test {@link SensitivityCsvLoader#parseAndMerge(Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code Sensitivity Date}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#parseAndMerge(Collection)}
   */
  @Test
  @DisplayName(
      "Test parseAndMerge(Collection); given StringCharSource with str is 'Sensitivity Date'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures SensitivityCsvLoader.parseAndMerge(Collection)"})
  void testParseAndMerge_givenStringCharSourceWithStrIsSensitivityDate() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("Sensitivity Date"));

    // Act
    ValueWithFailures<CurveSensitivities> actualParseAndMergeResult =
        standardResult.parseAndMerge(charSources);

    // Assert
    assertFalse(actualParseAndMergeResult.hasFailures());
    CurveSensitivities value = actualParseAndMergeResult.getValue();
    assertFalse(value.getId().isPresent());
    assertTrue(value.getTypedSensitivities().isEmpty());
    assertTrue(actualParseAndMergeResult.getFailures().isEmpty());
    assertTrue(value.getInfo().getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link SensitivityCsvLoader#parseAndMerge(Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code Sensitivity Tenor}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#parseAndMerge(Collection)}
   */
  @Test
  @DisplayName(
      "Test parseAndMerge(Collection); given StringCharSource with str is 'Sensitivity Tenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures SensitivityCsvLoader.parseAndMerge(Collection)"})
  void testParseAndMerge_givenStringCharSourceWithStrIsSensitivityTenor() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("Sensitivity Tenor"));

    // Act
    ValueWithFailures<CurveSensitivities> actualParseAndMergeResult =
        standardResult.parseAndMerge(charSources);

    // Assert
    assertFalse(actualParseAndMergeResult.hasFailures());
    CurveSensitivities value = actualParseAndMergeResult.getValue();
    assertFalse(value.getId().isPresent());
    assertTrue(value.getTypedSensitivities().isEmpty());
    assertTrue(actualParseAndMergeResult.getFailures().isEmpty());
    assertTrue(value.getInfo().getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link SensitivityCsvLoader#parseAndMerge(Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code {U}}.
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#parseAndMerge(Collection)}
   */
  @Test
  @DisplayName(
      "Test parseAndMerge(Collection); given StringCharSource with str is '{U}'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures SensitivityCsvLoader.parseAndMerge(Collection)"})
  void testParseAndMerge_givenStringCharSourceWithStrIsU_thenReturnFailuresSizeIsTwo() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));

    // Act and Assert
    ImmutableList<FailureItem> failures = standardResult.parseAndMerge(charSources).getFailures();
    assertEquals(2, failures.size());
    FailureItem expectedGetResult = failures.get(0);
    assertEquals(expectedGetResult, failures.get(1));
  }

  /**
   * Test {@link SensitivityCsvLoader#parseAndMerge(Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not hasFailures.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#parseAndMerge(Collection)}
   */
  @Test
  @DisplayName("Test parseAndMerge(Collection); when ArrayList(); then return not hasFailures")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures SensitivityCsvLoader.parseAndMerge(Collection)"})
  void testParseAndMerge_whenArrayList_thenReturnNotHasFailures() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    // Act
    ValueWithFailures<CurveSensitivities> actualParseAndMergeResult =
        standardResult.parseAndMerge(new ArrayList<>());

    // Assert
    assertFalse(actualParseAndMergeResult.hasFailures());
    CurveSensitivities value = actualParseAndMergeResult.getValue();
    assertFalse(value.getId().isPresent());
    assertTrue(value.getTypedSensitivities().isEmpty());
    assertTrue(actualParseAndMergeResult.getFailures().isEmpty());
    assertTrue(value.getInfo().getAttributeTypes().isEmpty());
  }

  /**
   * Test {@link SensitivityCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code Sensitivity Date}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection) with 'charSources'; given StringCharSource with str is 'Sensitivity Date'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures SensitivityCsvLoader.parse(Collection)"})
  void testParseWithCharSources_givenStringCharSourceWithStrIsSensitivityDate() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("Sensitivity Date"));

    // Act
    ValueWithFailures<ListMultimap<String, CurveSensitivities>> actualParseResult =
        standardResult.parse(charSources);

    // Assert
    assertFalse(actualParseResult.hasFailures());
    assertTrue(actualParseResult.getFailures().isEmpty());
  }

  /**
   * Test {@link SensitivityCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code Sensitivity Tenor}.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection) with 'charSources'; given StringCharSource with str is 'Sensitivity Tenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures SensitivityCsvLoader.parse(Collection)"})
  void testParseWithCharSources_givenStringCharSourceWithStrIsSensitivityTenor() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("Sensitivity Tenor"));

    // Act
    ValueWithFailures<ListMultimap<String, CurveSensitivities>> actualParseResult =
        standardResult.parse(charSources);

    // Assert
    assertFalse(actualParseResult.hasFailures());
    assertTrue(actualParseResult.getFailures().isEmpty());
  }

  /**
   * Test {@link SensitivityCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection) with 'charSources'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures SensitivityCsvLoader.parse(Collection)"})
  void testParseWithCharSources_thenReturnFailuresSizeIsTwo() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

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
   * Test {@link SensitivityCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not hasFailures.
   * </ul>
   *
   * <p>Method under test: {@link SensitivityCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection) with 'charSources'; when ArrayList(); then return not hasFailures")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures SensitivityCsvLoader.parse(Collection)"})
  void testParseWithCharSources_whenArrayList_thenReturnNotHasFailures() {
    // Arrange
    SensitivityCsvLoader standardResult = SensitivityCsvLoader.standard();

    // Act
    ValueWithFailures<ListMultimap<String, CurveSensitivities>> actualParseResult =
        standardResult.parse(new ArrayList<>());

    // Assert
    assertFalse(actualParseResult.hasFailures());
    assertTrue(actualParseResult.getFailures().isEmpty());
  }
}
