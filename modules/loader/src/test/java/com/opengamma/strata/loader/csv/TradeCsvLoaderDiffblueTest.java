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
import com.opengamma.strata.product.Trade;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeCsvLoaderDiffblueTest {
  /**
   * Test {@link TradeCsvLoader#load(Collection)} with {@code Collection}.
   *
   * <p>Method under test: {@link TradeCsvLoader#load(Collection)}
   */
  @Test
  @DisplayName("Test load(Collection) with 'Collection'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.load(Collection)"})
  void testLoadWithCollection() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    // Act
    ValueWithFailures<List<Trade>> actualLoadResult = standardResult.load(new ArrayList<>());

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualLoadResult.hasFailures());
    ImmutableList<FailureItem> failures = actualLoadResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualLoadResult.getValue());
  }

  /**
   * Test {@link TradeCsvLoader#load(ResourceLocator[])} with {@code ResourceLocator[]}.
   *
   * <ul>
   *   <li>Then standard parse {@code null} Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#load(ResourceLocator[])}
   */
  @Test
  @DisplayName(
      "Test load(ResourceLocator[]) with 'ResourceLocator[]'; then standard parse 'null' Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.load(ResourceLocator[])"})
  void testLoadWithResourceLocator_thenStandardParseNullFailuresSizeIsOne() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    // Act
    ValueWithFailures<List<Trade>> actualLoadResult = standardResult.load();

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualLoadResult.hasFailures());
    ImmutableList<FailureItem> failures = actualLoadResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualLoadResult.getValue());
  }

  /**
   * Test {@link TradeCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName("Test isKnownFormat(CharSource); when 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenNull_thenReturnFalse() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult = standardResult.isKnownFormat(null);

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualIsKnownFormatResult);
  }

  /**
   * Test {@link TradeCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code null}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(CharSource); when StringCharSource with str is 'null'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsNull_thenReturnFalse() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult = standardResult.isKnownFormat(StringCharSource.of(null));

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualIsKnownFormatResult);
  }

  /**
   * Test {@link TradeCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code #}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(CharSource); when StringCharSource with str is '#'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsNumberSign_thenReturnFalse() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult = standardResult.isKnownFormat(StringCharSource.of("#"));

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualIsKnownFormatResult);
  }

  /**
   * Test {@link TradeCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@code ;}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(CharSource); when StringCharSource with str is ';'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsSemicolon_thenReturnFalse() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult = standardResult.isKnownFormat(StringCharSource.of(";"));

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualIsKnownFormatResult);
  }

  /**
   * Test {@link TradeCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with str is {@link CsvLoaderColumns#TRADE_TYPE_FIELD}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(CharSource); when StringCharSource with str is TRADE_TYPE_FIELD; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStrIsTrade_type_field_thenReturnTrue() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult =
        standardResult.isKnownFormat(StringCharSource.of(CsvLoaderColumns.TRADE_TYPE_FIELD));

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertTrue(actualIsKnownFormatResult);
  }

  /**
   * Test {@link TradeCsvLoader#isKnownFormat(CharSource)}.
   *
   * <ul>
   *   <li>When {@link StringCharSource} with {@code Str}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#isKnownFormat(CharSource)}
   */
  @Test
  @DisplayName(
      "Test isKnownFormat(CharSource); when StringCharSource with 'Str'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeCsvLoader.isKnownFormat(CharSource)"})
  void testIsKnownFormat_whenStringCharSourceWithStr_thenReturnFalse() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    // Act
    boolean actualIsKnownFormatResult = standardResult.isKnownFormat(StringCharSource.of("Str"));

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualIsKnownFormatResult);
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection, Class)} with {@code charSources}, {@code
   * tradeType}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@link CsvLoaderColumns#TRADE_TYPE_FIELD}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection, Class)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, Class) with 'charSources', 'tradeType'; given StringCharSource with str is TRADE_TYPE_FIELD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection, Class)"})
  void testParseWithCharSourcesTradeType_givenStringCharSourceWithStrIsTrade_type_field() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of(CsvLoaderColumns.TRADE_TYPE_FIELD));
    Class<Trade> tradeType = Trade.class;

    // Act
    ValueWithFailures<List<Trade>> actualParseResult = standardResult.parse(charSources, tradeType);

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualParseResult.hasFailures());
    ImmutableList<FailureItem> failures = actualParseResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualParseResult.getValue());
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection, Class)} with {@code charSources}, {@code
   * tradeType}.
   *
   * <ul>
   *   <li>Then return Failures size is five.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection, Class)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, Class) with 'charSources', 'tradeType'; then return Failures size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection, Class)"})
  void testParseWithCharSourcesTradeType_thenReturnFailuresSizeIsFive() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("Str"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));
    Class<Trade> tradeType = Trade.class;

    // Act and Assert
    ImmutableList<FailureItem> failures =
        standardResult.parse(charSources, tradeType).getFailures();
    assertEquals(5, failures.size());
    FailureItem expectedGetResult = failures.get(0);
    assertEquals(expectedGetResult, failures.get(4));
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection, Class)} with {@code charSources}, {@code
   * tradeType}.
   *
   * <ul>
   *   <li>Then return Failures size is four.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection, Class)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, Class) with 'charSources', 'tradeType'; then return Failures size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection, Class)"})
  void testParseWithCharSourcesTradeType_thenReturnFailuresSizeIsFour() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("Str"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));
    Class<Trade> tradeType = Trade.class;

    // Act and Assert
    ImmutableList<FailureItem> failures =
        standardResult.parse(charSources, tradeType).getFailures();
    assertEquals(4, failures.size());
    FailureItem getResult = failures.get(0);
    assertEquals(getResult, failures.get(2));
    assertEquals(getResult, failures.get(3));
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection, Class)} with {@code charSources}, {@code
   * tradeType}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection, Class)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, Class) with 'charSources', 'tradeType'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection, Class)"})
  void testParseWithCharSourcesTradeType_thenReturnFailuresSizeIsTwo() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));
    Class<Trade> tradeType = Trade.class;

    // Act and Assert
    ImmutableList<FailureItem> failures =
        standardResult.parse(charSources, tradeType).getFailures();
    assertEquals(2, failures.size());
    FailureItem expectedGetResult = failures.get(0);
    assertEquals(expectedGetResult, failures.get(1));
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection, Class)} with {@code charSources}, {@code
   * tradeType}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not hasFailures.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection, Class)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, Class) with 'charSources', 'tradeType'; when ArrayList(); then return not hasFailures")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection, Class)"})
  void testParseWithCharSourcesTradeType_whenArrayList_thenReturnNotHasFailures() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();
    ArrayList<CharSource> charSources = new ArrayList<>();
    Class<Trade> tradeType = Trade.class;

    // Act
    ValueWithFailures<List<Trade>> actualParseResult = standardResult.parse(charSources, tradeType);

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualParseResult.hasFailures());
    ImmutableList<FailureItem> failures = actualParseResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualParseResult.getValue());
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection, List)} with {@code charSources}, {@code
   * tradeTypes}.
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection, List)}
   */
  @Test
  @DisplayName("Test parse(Collection, List) with 'charSources', 'tradeTypes'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection, List)"})
  void testParseWithCharSourcesTradeTypes() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of(CsvLoaderColumns.TRADE_TYPE_FIELD));

    // Act
    ValueWithFailures<List<Trade>> actualParseResult =
        standardResult.parse(charSources, new ArrayList<>());

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualParseResult.hasFailures());
    assertTrue(actualParseResult.getFailures().isEmpty());
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection, List)} with {@code charSources}, {@code
   * tradeTypes}.
   *
   * <ul>
   *   <li>Given {@code Trade}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection, List)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, List) with 'charSources', 'tradeTypes'; given 'com.opengamma.strata.product.Trade'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection, List)"})
  void testParseWithCharSourcesTradeTypes_givenComOpengammaStrataProductTrade() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();
    ArrayList<CharSource> charSources = new ArrayList<>();

    ArrayList<Class<? extends Trade>> tradeTypes = new ArrayList<>();
    Class<Trade> forNameResult = Trade.class;
    tradeTypes.add(forNameResult);

    // Act
    ValueWithFailures<List<Trade>> actualParseResult =
        standardResult.parse(charSources, tradeTypes);

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualParseResult.hasFailures());
    assertTrue(actualParseResult.getFailures().isEmpty());
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection, List)} with {@code charSources}, {@code
   * tradeTypes}.
   *
   * <ul>
   *   <li>Given {@code Trade}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection, List)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, List) with 'charSources', 'tradeTypes'; given 'com.opengamma.strata.product.Trade'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection, List)"})
  void testParseWithCharSourcesTradeTypes_givenComOpengammaStrataProductTrade2() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();
    ArrayList<CharSource> charSources = new ArrayList<>();

    ArrayList<Class<? extends Trade>> tradeTypes = new ArrayList<>();
    Class<Trade> forNameResult = Trade.class;
    tradeTypes.add(forNameResult);
    Class<Trade> forNameResult2 = Trade.class;
    tradeTypes.add(forNameResult2);

    // Act
    ValueWithFailures<List<Trade>> actualParseResult =
        standardResult.parse(charSources, tradeTypes);

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualParseResult.hasFailures());
    assertTrue(actualParseResult.getFailures().isEmpty());
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection, List)} with {@code charSources}, {@code
   * tradeTypes}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection, List)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, List) with 'charSources', 'tradeTypes'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection, List)"})
  void testParseWithCharSourcesTradeTypes_thenReturnFailuresSizeIsTwo() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of("{U}"));
    charSources.add(StringCharSource.of("value"));

    // Act and Assert
    ImmutableList<FailureItem> failures =
        standardResult.parse(charSources, new ArrayList<>()).getFailures();
    assertEquals(2, failures.size());
    FailureItem expectedGetResult = failures.get(0);
    assertEquals(expectedGetResult, failures.get(1));
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection, List)} with {@code charSources}, {@code
   * tradeTypes}.
   *
   * <ul>
   *   <li>Then standard parse {@code null} Failures size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection, List)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection, List) with 'charSources', 'tradeTypes'; then standard parse 'null' Failures size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection, List)"})
  void testParseWithCharSourcesTradeTypes_thenStandardParseNullFailuresSizeIsOne() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();
    ArrayList<CharSource> charSources = new ArrayList<>();

    // Act
    ValueWithFailures<List<Trade>> actualParseResult =
        standardResult.parse(charSources, new ArrayList<>());

    // Assert
    assertEquals(1, standardResult.parse(null).getFailures().size());
    assertFalse(actualParseResult.hasFailures());
    assertTrue(actualParseResult.getFailures().isEmpty());
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Given {@link StringCharSource} with str is {@link CsvLoaderColumns#TRADE_TYPE_FIELD}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection) with 'charSources'; given StringCharSource with str is TRADE_TYPE_FIELD")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection)"})
  void testParseWithCharSources_givenStringCharSourceWithStrIsTrade_type_field() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    ArrayList<CharSource> charSources = new ArrayList<>();
    charSources.add(StringCharSource.of(CsvLoaderColumns.TRADE_TYPE_FIELD));

    // Act
    ValueWithFailures<List<Trade>> actualParseResult = standardResult.parse(charSources);

    // Assert
    assertFalse(actualParseResult.hasFailures());
    ImmutableList<FailureItem> failures = actualParseResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualParseResult.getValue());
  }

  /**
   * Test {@link TradeCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Then return Failures size is five.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection) with 'charSources'; then return Failures size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection)"})
  void testParseWithCharSources_thenReturnFailuresSizeIsFive() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

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
   * Test {@link TradeCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Then return Failures size is four.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection) with 'charSources'; then return Failures size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection)"})
  void testParseWithCharSources_thenReturnFailuresSizeIsFour() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

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
   * Test {@link TradeCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>Then return Failures size is two.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName("Test parse(Collection) with 'charSources'; then return Failures size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection)"})
  void testParseWithCharSources_thenReturnFailuresSizeIsTwo() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

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
   * Test {@link TradeCsvLoader#parse(Collection)} with {@code charSources}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not hasFailures.
   * </ul>
   *
   * <p>Method under test: {@link TradeCsvLoader#parse(Collection)}
   */
  @Test
  @DisplayName(
      "Test parse(Collection) with 'charSources'; when ArrayList(); then return not hasFailures")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueWithFailures TradeCsvLoader.parse(Collection)"})
  void testParseWithCharSources_whenArrayList_thenReturnNotHasFailures() {
    // Arrange
    TradeCsvLoader standardResult = TradeCsvLoader.standard();

    // Act
    ValueWithFailures<List<Trade>> actualParseResult = standardResult.parse(new ArrayList<>());

    // Assert
    assertFalse(actualParseResult.hasFailures());
    ImmutableList<FailureItem> failures = actualParseResult.getFailures();
    assertTrue(failures.isEmpty());
    assertSame(failures, actualParseResult.getValue());
  }
}
