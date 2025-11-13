package com.opengamma.strata.loader.csv;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.google.common.io.CharSource;
import com.opengamma.strata.collect.io.StringCharSource;
import com.opengamma.strata.collect.result.ParseFailureException;
import com.opengamma.strata.market.curve.CurveGroupName;
import com.opengamma.strata.market.curve.CurveNodeClashAction;
import com.opengamma.strata.market.curve.CurveNodeDate;
import com.opengamma.strata.market.curve.CurveNodeDateOrder;
import com.opengamma.strata.market.curve.RatesCurveGroupDefinition;
import com.opengamma.strata.market.observable.QuoteId;
import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RatesCalibrationCsvLoaderDiffblueTest {
  /**
   * Test {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is empty string.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(CharSource, CharSource, Collection); given StringCharSource with str is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parse(CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStrIsEmptyString() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    ArrayList<CharSource> curveNodeCharSources = new ArrayList<>();
    curveNodeCharSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCalibrationCsvLoader.parse(
                groupsCharSource, settingsCharSource, curveNodeCharSources));
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(CharSource, CharSource, Collection); given StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parse(CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStrIsNumberSign() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    ArrayList<CharSource> curveNodeCharSources = new ArrayList<>();
    curveNodeCharSources.add(StringCharSource.of("#"));

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCalibrationCsvLoader.parse(
                groupsCharSource, settingsCharSource, curveNodeCharSources));
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(CharSource, CharSource, Collection); given StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parse(CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStrIsSemicolon() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    ArrayList<CharSource> curveNodeCharSources = new ArrayList<>();
    curveNodeCharSources.add(StringCharSource.of(";"));

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCalibrationCsvLoader.parse(
                groupsCharSource, settingsCharSource, curveNodeCharSources));
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code source}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(CharSource, CharSource, Collection); given StringCharSource with str is 'source'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parse(CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStrIsSource() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    ArrayList<CharSource> curveNodeCharSources = new ArrayList<>();
    curveNodeCharSources.add(StringCharSource.of("source"));

    // Act
    ImmutableMap<CurveGroupName, RatesCurveGroupDefinition> actualParseResult =
        RatesCalibrationCsvLoader.parse(groupsCharSource, settingsCharSource, curveNodeCharSources);

    // Assert
    assertTrue(actualParseResult.isEmpty());
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code source}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(CharSource, CharSource, Collection); given StringCharSource with str is 'source'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parse(CharSource, CharSource, Collection)"
  })
  void testParse_givenStringCharSourceWithStrIsSource2() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    ArrayList<CharSource> curveNodeCharSources = new ArrayList<>();
    curveNodeCharSources.add(StringCharSource.of("source"));
    curveNodeCharSources.add(StringCharSource.of("source"));

    // Act
    ImmutableMap<CurveGroupName, RatesCurveGroupDefinition> actualParseResult =
        RatesCalibrationCsvLoader.parse(groupsCharSource, settingsCharSource, curveNodeCharSources);

    // Assert
    assertTrue(actualParseResult.isEmpty());
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource, Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parse(CharSource, CharSource,
   * Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(CharSource, CharSource, Collection); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parse(CharSource, CharSource, Collection)"
  })
  void testParse_whenArrayList_thenReturnEmpty() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");

    // Act
    ImmutableMap<CurveGroupName, RatesCurveGroupDefinition> actualParseResult =
        RatesCalibrationCsvLoader.parse(groupsCharSource, settingsCharSource, new ArrayList<>());

    // Assert
    assertTrue(actualParseResult.isEmpty());
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is empty string.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource,
   * CharSource, CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parseWithSeasonality(CharSource, CharSource, CharSource, Collection); given StringCharSource with str is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parseWithSeasonality(CharSource, CharSource, CharSource, Collection)"
  })
  void testParseWithSeasonality_givenStringCharSourceWithStrIsEmptyString() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");
    StringCharSource seasonalityResource = StringCharSource.of("Str");

    ArrayList<CharSource> curveNodeCharSources = new ArrayList<>();
    curveNodeCharSources.add(StringCharSource.of(""));

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCalibrationCsvLoader.parseWithSeasonality(
                groupsCharSource, settingsCharSource, seasonalityResource, curveNodeCharSources));
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code #}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource,
   * CharSource, CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parseWithSeasonality(CharSource, CharSource, CharSource, Collection); given StringCharSource with str is '#'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parseWithSeasonality(CharSource, CharSource, CharSource, Collection)"
  })
  void testParseWithSeasonality_givenStringCharSourceWithStrIsNumberSign() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");
    StringCharSource seasonalityResource = StringCharSource.of("Str");

    ArrayList<CharSource> curveNodeCharSources = new ArrayList<>();
    curveNodeCharSources.add(StringCharSource.of("#"));

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCalibrationCsvLoader.parseWithSeasonality(
                groupsCharSource, settingsCharSource, seasonalityResource, curveNodeCharSources));
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code ;}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource,
   * CharSource, CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parseWithSeasonality(CharSource, CharSource, CharSource, Collection); given StringCharSource with str is ';'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parseWithSeasonality(CharSource, CharSource, CharSource, Collection)"
  })
  void testParseWithSeasonality_givenStringCharSourceWithStrIsSemicolon() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");
    StringCharSource seasonalityResource = StringCharSource.of("Str");

    ArrayList<CharSource> curveNodeCharSources = new ArrayList<>();
    curveNodeCharSources.add(StringCharSource.of(";"));

    // Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCalibrationCsvLoader.parseWithSeasonality(
                groupsCharSource, settingsCharSource, seasonalityResource, curveNodeCharSources));
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code source}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource,
   * CharSource, CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parseWithSeasonality(CharSource, CharSource, CharSource, Collection); given StringCharSource with str is 'source'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parseWithSeasonality(CharSource, CharSource, CharSource, Collection)"
  })
  void testParseWithSeasonality_givenStringCharSourceWithStrIsSource() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");
    StringCharSource seasonalityResource = StringCharSource.of("Str");

    ArrayList<CharSource> curveNodeCharSources = new ArrayList<>();
    curveNodeCharSources.add(StringCharSource.of("source"));

    // Act
    ImmutableMap<CurveGroupName, RatesCurveGroupDefinition> actualParseWithSeasonalityResult =
        RatesCalibrationCsvLoader.parseWithSeasonality(
            groupsCharSource, settingsCharSource, seasonalityResource, curveNodeCharSources);

    // Assert
    assertTrue(actualParseWithSeasonalityResult.isEmpty());
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@code source}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource,
   * CharSource, CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parseWithSeasonality(CharSource, CharSource, CharSource, Collection); given StringCharSource with str is 'source'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parseWithSeasonality(CharSource, CharSource, CharSource, Collection)"
  })
  void testParseWithSeasonality_givenStringCharSourceWithStrIsSource2() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");
    StringCharSource seasonalityResource = StringCharSource.of("Str");

    ArrayList<CharSource> curveNodeCharSources = new ArrayList<>();
    curveNodeCharSources.add(StringCharSource.of("source"));
    curveNodeCharSources.add(StringCharSource.of("source"));

    // Act
    ImmutableMap<CurveGroupName, RatesCurveGroupDefinition> actualParseWithSeasonalityResult =
        RatesCalibrationCsvLoader.parseWithSeasonality(
            groupsCharSource, settingsCharSource, seasonalityResource, curveNodeCharSources);

    // Assert
    assertTrue(actualParseWithSeasonalityResult.isEmpty());
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource, CharSource, CharSource,
   * Collection)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#parseWithSeasonality(CharSource,
   * CharSource, CharSource, Collection)}
   */
  @Test
  @DisplayName(
      "Test parseWithSeasonality(CharSource, CharSource, CharSource, Collection); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap RatesCalibrationCsvLoader.parseWithSeasonality(CharSource, CharSource, CharSource, Collection)"
  })
  void testParseWithSeasonality_whenArrayList_thenReturnEmpty() {
    // Arrange
    StringCharSource groupsCharSource = StringCharSource.of("Str");
    StringCharSource settingsCharSource = StringCharSource.of("Str");
    StringCharSource seasonalityResource = StringCharSource.of("Str");

    // Act
    ImmutableMap<CurveGroupName, RatesCurveGroupDefinition> actualParseWithSeasonalityResult =
        RatesCalibrationCsvLoader.parseWithSeasonality(
            groupsCharSource, settingsCharSource, seasonalityResource, new ArrayList<>());

    // Assert
    assertTrue(actualParseWithSeasonalityResult.isEmpty());
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#curveIborFutureCurveNode(String, String, String, QuoteId,
   * double, CurveNodeDate, CurveNodeDateOrder)}.
   *
   * <ul>
   *   <li>When {@code Time Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#curveIborFutureCurveNode(String, String,
   * String, QuoteId, double, CurveNodeDate, CurveNodeDateOrder)}
   */
  @Test
  @DisplayName(
      "Test curveIborFutureCurveNode(String, String, String, QuoteId, double, CurveNodeDate, CurveNodeDateOrder); when 'Time Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.curve.node.IborFutureCurveNode RatesCalibrationCsvLoader.curveIborFutureCurveNode(String, String, String, QuoteId, double, CurveNodeDate, CurveNodeDateOrder)"
  })
  void testCurveIborFutureCurveNode_whenTimeStr_thenThrowParseFailureException() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCalibrationCsvLoader.curveIborFutureCurveNode(
                "Convention Str",
                "Time Str",
                "Label",
                null,
                10.0d,
                null,
                CurveNodeDateOrder.of(1, CurveNodeClashAction.EXCEPTION)));
  }

  /**
   * Test {@link RatesCalibrationCsvLoader#curveIborFutureCurveNode(String, String, String, QuoteId,
   * double, CurveNodeDate, CurveNodeDateOrder)}.
   *
   * <ul>
   *   <li>When {@code Time Str}.
   *   <li>Then throw {@link ParseFailureException}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCalibrationCsvLoader#curveIborFutureCurveNode(String, String,
   * String, QuoteId, double, CurveNodeDate, CurveNodeDateOrder)}
   */
  @Test
  @DisplayName(
      "Test curveIborFutureCurveNode(String, String, String, QuoteId, double, CurveNodeDate, CurveNodeDateOrder); when 'Time Str'; then throw ParseFailureException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.curve.node.IborFutureCurveNode RatesCalibrationCsvLoader.curveIborFutureCurveNode(String, String, String, QuoteId, double, CurveNodeDate, CurveNodeDateOrder)"
  })
  void testCurveIborFutureCurveNode_whenTimeStr_thenThrowParseFailureException2() {
    // Arrange, Act and Assert
    assertThrows(
        ParseFailureException.class,
        () ->
            RatesCalibrationCsvLoader.curveIborFutureCurveNode(
                "Convention Str", "Time Str", "Label", null, 10.0d, null, null));
  }
}
