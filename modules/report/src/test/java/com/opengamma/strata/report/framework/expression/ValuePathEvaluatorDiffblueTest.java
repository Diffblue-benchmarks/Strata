package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.calc.Measure;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ValuePathEvaluatorDiffblueTest {
  /**
   * Test {@link ValuePathEvaluator#measure(String)}.
   *
   * <ul>
   *   <li>When {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link ValuePathEvaluator#measure(String)}
   */
  @Test
  @DisplayName("Test measure(String); when '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ValuePathEvaluator.measure(String)"})
  void testMeasure_when42() {
    // Arrange and Act
    Optional<Measure> actualMeasureResult = ValuePathEvaluator.measure("42");

    // Assert
    assertFalse(actualMeasureResult.isPresent());
  }

  /**
   * Test {@link ValuePathEvaluator#measure(String)}.
   *
   * <ul>
   *   <li>When {@code Invalid root: {}. Value path must start with one of: {}}.
   * </ul>
   *
   * <p>Method under test: {@link ValuePathEvaluator#measure(String)}
   */
  @Test
  @DisplayName(
      "Test measure(String); when 'Invalid root: {}. Value path must start with one of: {}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ValuePathEvaluator.measure(String)"})
  void testMeasure_whenInvalidRootValuePathMustStartWithOneOf() {
    // Arrange and Act
    Optional<Measure> actualMeasureResult =
        ValuePathEvaluator.measure("Invalid root: {}. Value path must start with one of: {}");

    // Assert
    assertFalse(actualMeasureResult.isPresent());
  }

  /**
   * Test {@link ValuePathEvaluator#tokens(Object)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashSet#HashSet()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link ValuePathEvaluator#tokens(Object)}
   */
  @Test
  @DisplayName("Test tokens(Object); given '42'; when HashSet() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ValuePathEvaluator.tokens(Object)"})
  void testTokens_given42_whenHashSetAdd42_thenReturnSizeIsTwo() {
    // Arrange
    HashSet<String> stringSet = new HashSet<>();
    stringSet.add("42");
    stringSet.add("foo");

    // Act
    Set<String> actualTokensResult = ValuePathEvaluator.tokens(stringSet);

    // Assert
    assertEquals(2, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("0"));
    assertTrue(actualTokensResult.contains("1"));
  }

  /**
   * Test {@link ValuePathEvaluator#tokens(Object)}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When {@link HashSet#HashSet()} add empty string.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link ValuePathEvaluator#tokens(Object)}
   */
  @Test
  @DisplayName(
      "Test tokens(Object); given empty string; when HashSet() add empty string; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ValuePathEvaluator.tokens(Object)"})
  void testTokens_givenEmptyString_whenHashSetAddEmptyString_thenReturnSizeIsThree() {
    // Arrange
    HashSet<String> stringSet = new HashSet<>();
    stringSet.add("");
    stringSet.add("42");
    stringSet.add("foo");

    // Act
    Set<String> actualTokensResult = ValuePathEvaluator.tokens(stringSet);

    // Assert
    assertEquals(3, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("0"));
    assertTrue(actualTokensResult.contains("1"));
    assertTrue(actualTokensResult.contains("2"));
  }

  /**
   * Test {@link ValuePathEvaluator#tokens(Object)}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashSet#HashSet()} add {@code foo}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link ValuePathEvaluator#tokens(Object)}
   */
  @Test
  @DisplayName(
      "Test tokens(Object); given 'foo'; when HashSet() add 'foo'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ValuePathEvaluator.tokens(Object)"})
  void testTokens_givenFoo_whenHashSetAddFoo_thenReturnSizeIsOne() {
    // Arrange
    HashSet<String> stringSet = new HashSet<>();
    stringSet.add("foo");

    // Act
    Set<String> actualTokensResult = ValuePathEvaluator.tokens(stringSet);

    // Assert
    assertEquals(1, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("0"));
  }

  /**
   * Test {@link ValuePathEvaluator#tokens(Object)}.
   *
   * <ul>
   *   <li>When {@link HashSet#HashSet()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ValuePathEvaluator#tokens(Object)}
   */
  @Test
  @DisplayName("Test tokens(Object); when HashSet(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ValuePathEvaluator.tokens(Object)"})
  void testTokens_whenHashSet_thenReturnEmpty() {
    // Arrange and Act
    Set<String> actualTokensResult = ValuePathEvaluator.tokens(new HashSet<>());

    // Assert
    assertTrue(actualTokensResult.isEmpty());
  }

  /**
   * Test {@link ValuePathEvaluator#tokens(Object)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ValuePathEvaluator#tokens(Object)}
   */
  @Test
  @DisplayName("Test tokens(Object); when 'Object'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set ValuePathEvaluator.tokens(Object)"})
  void testTokens_whenObject_thenReturnEmpty() {
    // Arrange and Act
    Set<String> actualTokensResult = ValuePathEvaluator.tokens("Object");

    // Assert
    assertTrue(actualTokensResult.isEmpty());
  }
}
