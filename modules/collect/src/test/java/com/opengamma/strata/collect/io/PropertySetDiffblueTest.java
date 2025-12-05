package com.opengamma.strata.collect.io;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class PropertySetDiffblueTest {
  /**
   * Test {@link PropertySet#empty()}.
   *
   * <p>Method under test: {@link PropertySet#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.empty()"})
  void testEmpty() {
    // Arrange, Act and Assert
    assertTrue(PropertySet.empty().isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given {@code keyValues}.
   *   <li>When {@link HashMap#HashMap()} {@code keyValues} is {@code 42}.
   *   <li>Then return not Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'Map'; given 'keyValues'; when HashMap() 'keyValues' is '42'; then return not Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Map)"})
  void testOfWithMap_givenKeyValues_whenHashMapKeyValuesIs42_thenReturnNotEmpty() {
    // Arrange
    HashMap<String, String> keyValues = new HashMap<>();
    keyValues.put("keyValues", "42");

    // Act
    PropertySet actualOfResult = PropertySet.of(keyValues);

    // Assert
    assertFalse(actualOfResult.isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code keyValues}.
   *   <li>Then return not Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'Map'; given 'Key'; when HashMap() 'Key' is 'keyValues'; then return not Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Map)"})
  void testOfWithMap_givenKey_whenHashMapKeyIsKeyValues_thenReturnNotEmpty() {
    // Arrange
    HashMap<String, String> keyValues = new HashMap<>();
    keyValues.put("Key", "keyValues");
    keyValues.put("keyValues", "42");

    // Act
    PropertySet actualOfResult = PropertySet.of(keyValues);

    // Assert
    assertFalse(actualOfResult.isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'Map'; when HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Map)"})
  void testOfWithMap_whenHashMap_thenReturnEmpty() {
    // Arrange and Act
    PropertySet actualOfResult = PropertySet.of(new HashMap<>());

    // Assert
    assertTrue(actualOfResult.isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Multimap)} with {@code Multimap}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When create empty string is {@code 42}.
   *   <li>Then return not Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Multimap)}
   */
  @Test
  @DisplayName(
      "Test of(Multimap) with 'Multimap'; given empty string; when create empty string is '42'; then return not Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Multimap)"})
  void testOfWithMultimap_givenEmptyString_whenCreateEmptyStringIs42_thenReturnNotEmpty() {
    // Arrange
    LinkedListMultimap<String, String> keyValues = LinkedListMultimap.create();
    keyValues.put("", "42");
    keyValues.put("", "");

    // Act and Assert
    assertFalse(PropertySet.of(keyValues).isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Multimap)} with {@code Multimap}.
   *
   * <ul>
   *   <li>Given empty string.
   *   <li>When create empty string is empty string.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Multimap)}
   */
  @Test
  @DisplayName(
      "Test of(Multimap) with 'Multimap'; given empty string; when create empty string is empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Multimap)"})
  void testOfWithMultimap_givenEmptyString_whenCreateEmptyStringIsEmptyString() {
    // Arrange
    LinkedListMultimap<String, String> keyValues = LinkedListMultimap.create();
    keyValues.put("", "");

    // Act and Assert
    assertFalse(PropertySet.of(keyValues).isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Multimap)} with {@code Multimap}.
   *
   * <ul>
   *   <li>Given {@code keyValues}.
   *   <li>When create {@code Key} is {@code keyValues}.
   *   <li>Then return not Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Multimap)}
   */
  @Test
  @DisplayName(
      "Test of(Multimap) with 'Multimap'; given 'keyValues'; when create 'Key' is 'keyValues'; then return not Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Multimap)"})
  void testOfWithMultimap_givenKeyValues_whenCreateKeyIsKeyValues_thenReturnNotEmpty() {
    // Arrange
    LinkedListMultimap<String, String> keyValues = LinkedListMultimap.create();
    keyValues.put("Key", "keyValues");
    keyValues.put("keyValues", "42");
    keyValues.put("", "");

    // Act and Assert
    assertFalse(PropertySet.of(keyValues).isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Multimap)} with {@code Multimap}.
   *
   * <ul>
   *   <li>Given {@code keyValues}.
   *   <li>When create {@code keyValues} is {@code 42}.
   *   <li>Then return not Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Multimap)}
   */
  @Test
  @DisplayName(
      "Test of(Multimap) with 'Multimap'; given 'keyValues'; when create 'keyValues' is '42'; then return not Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Multimap)"})
  void testOfWithMultimap_givenKeyValues_whenCreateKeyValuesIs42_thenReturnNotEmpty() {
    // Arrange
    LinkedListMultimap<String, String> keyValues = LinkedListMultimap.create();
    keyValues.put("keyValues", "42");
    keyValues.put("", "");

    // Act and Assert
    assertFalse(PropertySet.of(keyValues).isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Multimap)} with {@code Multimap}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When builder {@code Key} is {@code 42}.
   *   <li>Then return not Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Multimap)}
   */
  @Test
  @DisplayName(
      "Test of(Multimap) with 'Multimap'; given 'Key'; when builder 'Key' is '42'; then return not Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Multimap)"})
  void testOfWithMultimap_givenKey_whenBuilderKeyIs42_thenReturnNotEmpty() {
    // Arrange
    ImmutableSetMultimap.Builder<String, String> builderResult = ImmutableSetMultimap.builder();
    builderResult.put("Key", "42");
    ImmutableSetMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act and Assert
    assertFalse(PropertySet.of(keyValues).isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Multimap)} with {@code Multimap}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When builder {@code Key} is {@code 42}.
   *   <li>Then return not Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Multimap)}
   */
  @Test
  @DisplayName(
      "Test of(Multimap) with 'Multimap'; given 'Key'; when builder 'Key' is '42'; then return not Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Multimap)"})
  void testOfWithMultimap_givenKey_whenBuilderKeyIs42_thenReturnNotEmpty2() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act and Assert
    assertFalse(PropertySet.of(keyValues).isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Multimap)} with {@code Multimap}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When builder {@code Key} is {@code keyValues}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Multimap)}
   */
  @Test
  @DisplayName(
      "Test of(Multimap) with 'Multimap'; given one; when builder 'Key' is 'keyValues'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Multimap)"})
  void testOfWithMultimap_givenOne_whenBuilderKeyIsKeyValues_thenCallsCompare() {
    // Arrange
    ImmutableSetMultimap.Builder<String, String> builderResult = ImmutableSetMultimap.builder();
    builderResult.put("Key", "keyValues");
    builderResult.put("Key", "42");

    ImmutableSetMultimap.Builder<String, String> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableSetMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    PropertySet actualOfResult = PropertySet.of(keyValues);

    // Assert
    verify(valueComparator, atLeast(1)).compare("42", "keyValues");
    assertFalse(actualOfResult.isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Multimap)} with {@code Multimap}.
   *
   * <ul>
   *   <li>Given {@link AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} with {@code keyValues}
   *       and {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Multimap)}
   */
  @Test
  @DisplayName(
      "Test of(Multimap) with 'Multimap'; given SimpleEntry(Object, Object) with 'keyValues' and '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Multimap)"})
  void testOfWithMultimap_givenSimpleEntryWithKeyValuesAnd42() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put(new SimpleEntry<>("keyValues", "42"));
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    PropertySet actualOfResult = PropertySet.of(keyValues);

    // Assert
    verify(keyComparator).compare("Key", "keyValues");
    assertFalse(actualOfResult.isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Multimap)} with {@code Multimap}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>When builder {@code 42} is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Multimap)}
   */
  @Test
  @DisplayName(
      "Test of(Multimap) with 'Multimap'; given 'Value'; when builder '42' is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Multimap)"})
  void testOfWithMultimap_givenValue_whenBuilder42IsValue_thenCallsCompare() {
    // Arrange
    ImmutableSetMultimap.Builder<String, String> builderResult = ImmutableSetMultimap.builder();
    builderResult.put("42", "Value");
    builderResult.put("Key", "keyValues");
    builderResult.put("Key", "42");

    ImmutableSetMultimap.Builder<String, String> expectedValuesPerKeyResult =
        builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);

    ImmutableSetMultimap.Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableSetMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    PropertySet actualOfResult = PropertySet.of(keyValues);

    // Assert
    verify(valueComparator, atLeast(1)).compare("42", "keyValues");
    verify(keyComparator).compare("Key", "42");
    assertFalse(actualOfResult.isEmpty());
  }

  /**
   * Test {@link PropertySet#of(Multimap)} with {@code Multimap}.
   *
   * <ul>
   *   <li>When create.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#of(Multimap)}
   */
  @Test
  @DisplayName("Test of(Multimap) with 'Multimap'; when create; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.of(Multimap)"})
  void testOfWithMultimap_whenCreate_thenReturnEmpty() {
    // Arrange
    ArrayListMultimap<String, String> keyValues = ArrayListMultimap.create();

    // Act and Assert
    assertTrue(PropertySet.of(keyValues).isEmpty());
  }

  /**
   * Test {@link PropertySet#keys()}.
   *
   * <ul>
   *   <li>Given builder {@code 42} is {@code Value}.
   *   <li>Then return contains {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#keys()}
   */
  @Test
  @DisplayName("Test keys(); given builder '42' is 'Value'; then return contains '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet PropertySet.keys()"})
  void testKeys_givenBuilder42IsValue_thenReturnContains42() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("42", "Value");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    ImmutableSet<String> actualKeysResult = PropertySet.of(keyValues).keys();

    // Assert
    verify(keyComparator).compare("Key", "42");
    assertEquals(2, actualKeysResult.size());
    assertTrue(actualKeysResult.contains("42"));
    assertTrue(actualKeysResult.contains("Key"));
  }

  /**
   * Test {@link PropertySet#keys()}.
   *
   * <ul>
   *   <li>Given builder empty string is {@code Value}.
   *   <li>Then return contains empty string.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#keys()}
   */
  @Test
  @DisplayName(
      "Test keys(); given builder empty string is 'Value'; then return contains empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet PropertySet.keys()"})
  void testKeys_givenBuilderEmptyStringIsValue_thenReturnContainsEmptyString() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("", "Value");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    ImmutableSet<String> actualKeysResult = PropertySet.of(keyValues).keys();

    // Assert
    verify(keyComparator).compare("Key", "");
    assertEquals(2, actualKeysResult.size());
    assertTrue(actualKeysResult.contains(""));
    assertTrue(actualKeysResult.contains("Key"));
  }

  /**
   * Test {@link PropertySet#keys()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#keys()}
   */
  @Test
  @DisplayName("Test keys(); given builder 'Key' is '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet PropertySet.keys()"})
  void testKeys_givenBuilderKeyIs42_thenReturnSizeIsOne() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    ImmutableSet<String> actualKeysResult = PropertySet.of(keyValues).keys();

    // Assert
    assertEquals(1, actualKeysResult.size());
    assertTrue(actualKeysResult.contains("Key"));
  }

  /**
   * Test {@link PropertySet#keys()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#keys()}
   */
  @Test
  @DisplayName("Test keys(); given empty; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet PropertySet.keys()"})
  void testKeys_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(PropertySet.empty().keys().isEmpty());
  }

  /**
   * Test {@link PropertySet#asMultimap()}.
   *
   * <p>Method under test: {@link PropertySet#asMultimap()}
   */
  @Test
  @DisplayName("Test asMultimap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap PropertySet.asMultimap()"})
  void testAsMultimap() {
    // Arrange and Act
    ImmutableListMultimap<String, String> actualAsMultimapResult = PropertySet.empty().asMultimap();

    // Assert
    assertEquals(0, actualAsMultimapResult.size());
    assertTrue(actualAsMultimapResult.isEmpty());
    assertTrue(actualAsMultimapResult.entries().isEmpty());
    assertTrue(actualAsMultimapResult.keys().isEmpty());
  }

  /**
   * Test {@link PropertySet#asMap()}.
   *
   * <ul>
   *   <li>Given builder {@code 42} is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#asMap()}
   */
  @Test
  @DisplayName("Test asMap(); given builder '42' is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap PropertySet.asMap()"})
  void testAsMap_givenBuilder42IsValue_thenReturnSizeIsTwo() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("42", "Value");
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);

    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    ImmutableMap<String, String> actualAsMapResult = PropertySet.of(keyValues).asMap();

    // Assert
    verify(valueComparator).compare("42", "key");
    verify(keyComparator).compare("Key", "42");
    assertEquals(2, actualAsMapResult.size());
    assertEquals("Value", actualAsMapResult.get("42"));
    assertEquals("key,42", actualAsMapResult.get("Key"));
  }

  /**
   * Test {@link PropertySet#asMap()}.
   *
   * <ul>
   *   <li>Given builder empty string is {@code key}.
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#asMap()}
   */
  @Test
  @DisplayName("Test asMap(); given builder empty string is 'key'; then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap PropertySet.asMap()"})
  void testAsMap_givenBuilderEmptyStringIsKey_thenReturnSizeIsFour() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("key", "42");
    builderResult.put("42", "Value");
    builderResult.put("", "key");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    ImmutableMap<String, String> actualAsMapResult = PropertySet.of(keyValues).asMap();

    // Assert
    verify(keyComparator, atLeast(1)).compare(Mockito.<String>any(), Mockito.<String>any());
    assertEquals(4, actualAsMapResult.size());
    assertEquals("42", actualAsMapResult.get("Key"));
    assertEquals("42", actualAsMapResult.get("key"));
    assertEquals("key", actualAsMapResult.get(""));
    assertTrue(actualAsMapResult.containsKey("42"));
  }

  /**
   * Test {@link PropertySet#asMap()}.
   *
   * <ul>
   *   <li>Given builder empty string is {@code Value}.
   *   <li>Then return empty string is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#asMap()}
   */
  @Test
  @DisplayName(
      "Test asMap(); given builder empty string is 'Value'; then return empty string is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap PropertySet.asMap()"})
  void testAsMap_givenBuilderEmptyStringIsValue_thenReturnEmptyStringIsValue() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("", "Value");
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);

    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    ImmutableMap<String, String> actualAsMapResult = PropertySet.of(keyValues).asMap();

    // Assert
    verify(valueComparator).compare("42", "key");
    verify(keyComparator).compare("Key", "");
    assertEquals(2, actualAsMapResult.size());
    assertEquals("Value", actualAsMapResult.get(""));
    assertEquals("key,42", actualAsMapResult.get("Key"));
  }

  /**
   * Test {@link PropertySet#asMap()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#asMap()}
   */
  @Test
  @DisplayName("Test asMap(); given builder 'Key' is '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap PropertySet.asMap()"})
  void testAsMap_givenBuilderKeyIs42_thenReturnSizeIsOne() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    ImmutableMap<String, String> actualAsMapResult = PropertySet.of(keyValues).asMap();

    // Assert
    assertEquals(1, actualAsMapResult.size());
    assertEquals("42", actualAsMapResult.get("Key"));
  }

  /**
   * Test {@link PropertySet#asMap()}.
   *
   * <ul>
   *   <li>Given builder {@code key} is {@code 42}.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#asMap()}
   */
  @Test
  @DisplayName("Test asMap(); given builder 'key' is '42'; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap PropertySet.asMap()"})
  void testAsMap_givenBuilderKeyIs42_thenReturnSizeIsThree() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("key", "42");
    builderResult.put("42", "Value");
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);

    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    ImmutableMap<String, String> actualAsMapResult = PropertySet.of(keyValues).asMap();

    // Assert
    verify(keyComparator, atLeast(1)).compare(Mockito.<String>any(), Mockito.<String>any());
    verify(valueComparator).compare("42", "key");
    assertEquals(3, actualAsMapResult.size());
    assertEquals("42", actualAsMapResult.get("key"));
    assertEquals("Value", actualAsMapResult.get("42"));
    assertEquals("key,42", actualAsMapResult.get("Key"));
  }

  /**
   * Test {@link PropertySet#asMap()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code key}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#asMap()}
   */
  @Test
  @DisplayName("Test asMap(); given builder 'Key' is 'key'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap PropertySet.asMap()"})
  void testAsMap_givenBuilderKeyIsKey_thenReturnSizeIsOne() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    ImmutableMap<String, String> actualAsMapResult = PropertySet.of(keyValues).asMap();

    // Assert
    verify(valueComparator).compare("42", "key");
    assertEquals(1, actualAsMapResult.size());
    assertEquals("key,42", actualAsMapResult.get("Key"));
  }

  /**
   * Test {@link PropertySet#asMap()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#asMap()}
   */
  @Test
  @DisplayName("Test asMap(); given empty; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap PropertySet.asMap()"})
  void testAsMap_givenEmpty_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(PropertySet.empty().asMap().isEmpty());
  }

  /**
   * Test {@link PropertySet#isEmpty()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code 42}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given builder 'Key' is '42'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.isEmpty()"})
  void testIsEmpty_givenBuilderKeyIs42_thenReturnFalse() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act and Assert
    assertFalse(PropertySet.of(keyValues).isEmpty());
  }

  /**
   * Test {@link PropertySet#isEmpty()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given empty; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.isEmpty()"})
  void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(PropertySet.empty().isEmpty());
  }

  /**
   * Test {@link PropertySet#contains(String)}.
   *
   * <ul>
   *   <li>Given builder {@code 42} is {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#contains(String)}
   */
  @Test
  @DisplayName("Test contains(String); given builder '42' is '42'; when 'Key'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.contains(String)"})
  void testContains_givenBuilder42Is42_whenKey_thenReturnFalse() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put(new SimpleEntry<>("key", "42"));
    builderResult.put("42", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    boolean actualContainsResult = PropertySet.of(keyValues).contains("Key");

    // Assert
    verify(keyComparator).compare("42", "key");
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link PropertySet#contains(String)}.
   *
   * <ul>
   *   <li>Given builder empty string is {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#contains(String)}
   */
  @Test
  @DisplayName(
      "Test contains(String); given builder empty string is '42'; when 'Key'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.contains(String)"})
  void testContains_givenBuilderEmptyStringIs42_whenKey_thenReturnFalse() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put(new SimpleEntry<>("key", "42"));
    builderResult.put("", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    boolean actualContainsResult = PropertySet.of(keyValues).contains("Key");

    // Assert
    verify(keyComparator).compare("", "key");
    assertFalse(actualContainsResult);
  }

  /**
   * Test {@link PropertySet#contains(String)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#contains(String)}
   */
  @Test
  @DisplayName("Test contains(String); given builder 'Key' is '42'; when 'Key'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.contains(String)"})
  void testContains_givenBuilderKeyIs42_whenKey_thenReturnTrue() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act and Assert
    assertTrue(PropertySet.of(keyValues).contains("Key"));
  }

  /**
   * Test {@link PropertySet#contains(String)}.
   *
   * <ul>
   *   <li>Given builder {@link AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} with {@code
   *       foo} and {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#contains(String)}
   */
  @Test
  @DisplayName(
      "Test contains(String); given builder SimpleEntry(Object, Object) with 'foo' and '42'; when 'Key'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.contains(String)"})
  void testContains_givenBuilderSimpleEntryWithFooAnd42_whenKey_thenReturnTrue() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put(new SimpleEntry<>("foo", "42"));
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    boolean actualContainsResult = PropertySet.of(keyValues).contains("Key");

    // Assert
    verify(keyComparator).compare("Key", "foo");
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link PropertySet#contains(String)}.
   *
   * <ul>
   *   <li>Given builder {@link AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} with {@code
   *       key} and {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#contains(String)}
   */
  @Test
  @DisplayName(
      "Test contains(String); given builder SimpleEntry(Object, Object) with 'key' and '42'; when 'Key'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.contains(String)"})
  void testContains_givenBuilderSimpleEntryWithKeyAnd42_whenKey_thenReturnTrue() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put(new SimpleEntry<>("key", "42"));
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    boolean actualContainsResult = PropertySet.of(keyValues).contains("Key");

    // Assert
    verify(keyComparator).compare("Key", "key");
    assertTrue(actualContainsResult);
  }

  /**
   * Test {@link PropertySet#contains(String)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code Key}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#contains(String)}
   */
  @Test
  @DisplayName("Test contains(String); given empty; when 'Key'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.contains(String)"})
  void testContains_givenEmpty_whenKey_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(PropertySet.empty().contains("Key"));
  }

  /**
   * Test {@link PropertySet#value(String)}.
   *
   * <ul>
   *   <li>Given builder {@code 42} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code key,42}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#value(String)}
   */
  @Test
  @DisplayName(
      "Test value(String); given builder '42' is 'Value'; when 'Key'; then return 'key,42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PropertySet.value(String)"})
  void testValue_givenBuilder42IsValue_whenKey_thenReturnKey42() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("42", "Value");
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);

    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    String actualValueResult = PropertySet.of(keyValues).value("Key");

    // Assert
    verify(valueComparator).compare("42", "key");
    verify(keyComparator).compare("Key", "42");
    assertEquals("key,42", actualValueResult);
  }

  /**
   * Test {@link PropertySet#value(String)}.
   *
   * <ul>
   *   <li>Given builder {@code 42} is {@code Value}.
   *   <li>When {@code key}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#value(String)}
   */
  @Test
  @DisplayName(
      "Test value(String); given builder '42' is 'Value'; when 'key'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PropertySet.value(String)"})
  void testValue_givenBuilder42IsValue_whenKey_thenThrowIllegalArgumentException() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("42", "Value");
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);

    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> PropertySet.of(keyValues).value("key"));
    verify(valueComparator).compare("42", "key");
    verify(keyComparator).compare("Key", "42");
  }

  /**
   * Test {@link PropertySet#value(String)}.
   *
   * <ul>
   *   <li>Given builder empty string is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code key,42}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#value(String)}
   */
  @Test
  @DisplayName(
      "Test value(String); given builder empty string is 'Value'; when 'Key'; then return 'key,42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PropertySet.value(String)"})
  void testValue_givenBuilderEmptyStringIsValue_whenKey_thenReturnKey42() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("", "Value");
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);

    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    String actualValueResult = PropertySet.of(keyValues).value("Key");

    // Assert
    verify(valueComparator).compare("42", "key");
    verify(keyComparator).compare("Key", "");
    assertEquals("key,42", actualValueResult);
  }

  /**
   * Test {@link PropertySet#value(String)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#value(String)}
   */
  @Test
  @DisplayName("Test value(String); given builder 'Key' is '42'; when 'Key'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PropertySet.value(String)"})
  void testValue_givenBuilderKeyIs42_whenKey_thenReturn42() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act and Assert
    assertEquals("42", PropertySet.of(keyValues).value("Key"));
  }

  /**
   * Test {@link PropertySet#value(String)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code key}.
   *   <li>When {@code Key}.
   *   <li>Then return {@code key,42}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#value(String)}
   */
  @Test
  @DisplayName("Test value(String); given builder 'Key' is 'key'; when 'Key'; then return 'key,42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PropertySet.value(String)"})
  void testValue_givenBuilderKeyIsKey_whenKey_thenReturnKey42() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    String actualValueResult = PropertySet.of(keyValues).value("Key");

    // Assert
    verify(valueComparator).compare("42", "key");
    assertEquals("key,42", actualValueResult);
  }

  /**
   * Test {@link PropertySet#value(String)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code Key}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#value(String)}
   */
  @Test
  @DisplayName("Test value(String); given empty; when 'Key'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PropertySet.value(String)"})
  void testValue_givenEmpty_whenKey_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> PropertySet.empty().value("Key"));
  }

  /**
   * Test {@link PropertySet#findValue(String)}.
   *
   * <ul>
   *   <li>Given builder {@code 42} is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@link Optional#get()} is {@code key,42}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#findValue(String)}
   */
  @Test
  @DisplayName(
      "Test findValue(String); given builder '42' is 'Value'; when 'Key'; then return get() is 'key,42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional PropertySet.findValue(String)"})
  void testFindValue_givenBuilder42IsValue_whenKey_thenReturnGetIsKey42() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("42", "Value");
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);

    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    Optional<String> actualFindValueResult = PropertySet.of(keyValues).findValue("Key");

    // Assert
    verify(valueComparator).compare("42", "key");
    verify(keyComparator).compare("Key", "42");
    assertEquals("key,42", actualFindValueResult.get());
    assertTrue(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link PropertySet#findValue(String)}.
   *
   * <ul>
   *   <li>Given builder {@code 42} is {@code Value}.
   *   <li>When {@code key}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#findValue(String)}
   */
  @Test
  @DisplayName(
      "Test findValue(String); given builder '42' is 'Value'; when 'key'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional PropertySet.findValue(String)"})
  void testFindValue_givenBuilder42IsValue_whenKey_thenReturnNotPresent() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("42", "Value");
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);

    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    Optional<String> actualFindValueResult = PropertySet.of(keyValues).findValue("key");

    // Assert
    verify(valueComparator).compare("42", "key");
    verify(keyComparator).compare("Key", "42");
    assertFalse(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link PropertySet#findValue(String)}.
   *
   * <ul>
   *   <li>Given builder empty string is {@code Value}.
   *   <li>When {@code Key}.
   *   <li>Then return {@link Optional#get()} is {@code key,42}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#findValue(String)}
   */
  @Test
  @DisplayName(
      "Test findValue(String); given builder empty string is 'Value'; when 'Key'; then return get() is 'key,42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional PropertySet.findValue(String)"})
  void testFindValue_givenBuilderEmptyStringIsValue_whenKey_thenReturnGetIsKey42() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("", "Value");
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);

    Builder<String, String> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    Optional<String> actualFindValueResult = PropertySet.of(keyValues).findValue("Key");

    // Assert
    verify(valueComparator).compare("42", "key");
    verify(keyComparator).compare("Key", "");
    assertEquals("key,42", actualFindValueResult.get());
    assertTrue(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link PropertySet#findValue(String)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return {@link Optional#get()} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#findValue(String)}
   */
  @Test
  @DisplayName(
      "Test findValue(String); given builder 'Key' is '42'; when 'Key'; then return get() is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional PropertySet.findValue(String)"})
  void testFindValue_givenBuilderKeyIs42_whenKey_thenReturnGetIs42() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    Optional<String> actualFindValueResult = PropertySet.of(keyValues).findValue("Key");

    // Assert
    assertEquals("42", actualFindValueResult.get());
    assertTrue(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link PropertySet#findValue(String)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code key}.
   *   <li>When {@code Key}.
   *   <li>Then return {@link Optional#get()} is {@code key,42}.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#findValue(String)}
   */
  @Test
  @DisplayName(
      "Test findValue(String); given builder 'Key' is 'key'; when 'Key'; then return get() is 'key,42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional PropertySet.findValue(String)"})
  void testFindValue_givenBuilderKeyIsKey_whenKey_thenReturnGetIsKey42() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "key");
    builderResult.put("Key", "42");

    Builder<String, String> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<String> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    // Act
    Optional<String> actualFindValueResult = PropertySet.of(keyValues).findValue("Key");

    // Assert
    verify(valueComparator).compare("42", "key");
    assertEquals("key,42", actualFindValueResult.get());
    assertTrue(actualFindValueResult.isPresent());
  }

  /**
   * Test {@link PropertySet#findValue(String)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code Key}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#findValue(String)}
   */
  @Test
  @DisplayName("Test findValue(String); given empty; when 'Key'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional PropertySet.findValue(String)"})
  void testFindValue_givenEmpty_whenKey_thenReturnNotPresent() {
    // Arrange, Act and Assert
    assertFalse(PropertySet.empty().findValue("Key").isPresent());
  }

  /**
   * Test {@link PropertySet#valueList(String)}.
   *
   * <ul>
   *   <li>Given builder {@code 42} is {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#valueList(String)}
   */
  @Test
  @DisplayName("Test valueList(String); given builder '42' is '42'; when 'Key'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList PropertySet.valueList(String)"})
  void testValueList_givenBuilder42Is42_whenKey_thenReturnEmpty() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put(new SimpleEntry<>("key", "42"));
    builderResult.put("42", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    ImmutableList<String> actualValueListResult = PropertySet.of(keyValues).valueList("Key");

    // Assert
    verify(keyComparator).compare("42", "key");
    assertTrue(actualValueListResult.isEmpty());
  }

  /**
   * Test {@link PropertySet#valueList(String)}.
   *
   * <ul>
   *   <li>Given builder empty string is {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#valueList(String)}
   */
  @Test
  @DisplayName(
      "Test valueList(String); given builder empty string is '42'; when 'Key'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList PropertySet.valueList(String)"})
  void testValueList_givenBuilderEmptyStringIs42_whenKey_thenReturnEmpty() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put(new SimpleEntry<>("key", "42"));
    builderResult.put("", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    ImmutableList<String> actualValueListResult = PropertySet.of(keyValues).valueList("Key");

    // Assert
    verify(keyComparator).compare("", "key");
    assertTrue(actualValueListResult.isEmpty());
  }

  /**
   * Test {@link PropertySet#valueList(String)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#valueList(String)}
   */
  @Test
  @DisplayName(
      "Test valueList(String); given builder 'Key' is '42'; when 'Key'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList PropertySet.valueList(String)"})
  void testValueList_givenBuilderKeyIs42_whenKey_thenReturnSizeIsOne() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    ImmutableList<String> actualValueListResult = PropertySet.of(keyValues).valueList("Key");

    // Assert
    assertEquals(1, actualValueListResult.size());
    assertEquals("42", actualValueListResult.get(0));
  }

  /**
   * Test {@link PropertySet#valueList(String)}.
   *
   * <ul>
   *   <li>Given builder {@link AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} with {@code
   *       foo} and {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#valueList(String)}
   */
  @Test
  @DisplayName(
      "Test valueList(String); given builder SimpleEntry(Object, Object) with 'foo' and '42'; when 'Key'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList PropertySet.valueList(String)"})
  void testValueList_givenBuilderSimpleEntryWithFooAnd42_whenKey_thenReturnSizeIsOne() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put(new SimpleEntry<>("foo", "42"));
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    ImmutableList<String> actualValueListResult = PropertySet.of(keyValues).valueList("Key");

    // Assert
    verify(keyComparator).compare("Key", "foo");
    assertEquals(1, actualValueListResult.size());
    assertEquals("42", actualValueListResult.get(0));
  }

  /**
   * Test {@link PropertySet#valueList(String)}.
   *
   * <ul>
   *   <li>Given builder {@link AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} with {@code
   *       key} and {@code 42}.
   *   <li>When {@code Key}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#valueList(String)}
   */
  @Test
  @DisplayName(
      "Test valueList(String); given builder SimpleEntry(Object, Object) with 'key' and '42'; when 'Key'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList PropertySet.valueList(String)"})
  void testValueList_givenBuilderSimpleEntryWithKeyAnd42_whenKey_thenReturnSizeIsOne() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put(new SimpleEntry<>("key", "42"));
    builderResult.put("Key", "42");

    Builder<String, String> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<String> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<String>any(), Mockito.<String>any())).thenReturn(1);
    ImmutableListMultimap<String, String> keyValues =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    ImmutableList<String> actualValueListResult = PropertySet.of(keyValues).valueList("Key");

    // Assert
    verify(keyComparator).compare("Key", "key");
    assertEquals(1, actualValueListResult.size());
    assertEquals("42", actualValueListResult.get(0));
  }

  /**
   * Test {@link PropertySet#valueList(String)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code Key}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#valueList(String)}
   */
  @Test
  @DisplayName("Test valueList(String); given empty; when 'Key'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList PropertySet.valueList(String)"})
  void testValueList_givenEmpty_whenKey_thenReturnEmpty() {
    // Arrange, Act and Assert
    assertTrue(PropertySet.empty().valueList("Key").isEmpty());
  }

  /**
   * Test {@link PropertySet#combinedWith(PropertySet)}.
   *
   * <p>Method under test: {@link PropertySet#combinedWith(PropertySet)}
   */
  @Test
  @DisplayName("Test combinedWith(PropertySet)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.combinedWith(PropertySet)"})
  void testCombinedWith() {
    // Arrange
    PropertySet emptyResult = PropertySet.empty();

    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    PropertySet other = PropertySet.of(keyValues);

    // Act
    PropertySet actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertSame(other, actualCombinedWithResult);
  }

  /**
   * Test {@link PropertySet#combinedWith(PropertySet)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#combinedWith(PropertySet)}
   */
  @Test
  @DisplayName("Test combinedWith(PropertySet); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.combinedWith(PropertySet)"})
  void testCombinedWith_whenEmpty_thenReturnEmpty() {
    // Arrange
    PropertySet emptyResult = PropertySet.empty();
    PropertySet other = PropertySet.empty();

    // Act
    PropertySet actualCombinedWithResult = emptyResult.combinedWith(other);

    // Assert
    assertSame(other, actualCombinedWithResult);
  }

  /**
   * Test {@link PropertySet#overrideWith(PropertySet)}.
   *
   * <p>Method under test: {@link PropertySet#overrideWith(PropertySet)}
   */
  @Test
  @DisplayName("Test overrideWith(PropertySet)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.overrideWith(PropertySet)"})
  void testOverrideWith() {
    // Arrange
    PropertySet emptyResult = PropertySet.empty();

    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "42");
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    PropertySet other = PropertySet.of(keyValues);

    // Act
    PropertySet actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertSame(other, actualOverrideWithResult);
  }

  /**
   * Test {@link PropertySet#overrideWith(PropertySet)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#overrideWith(PropertySet)}
   */
  @Test
  @DisplayName("Test overrideWith(PropertySet); when empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PropertySet PropertySet.overrideWith(PropertySet)"})
  void testOverrideWith_whenEmpty_thenReturnEmpty() {
    // Arrange
    PropertySet emptyResult = PropertySet.empty();
    PropertySet other = PropertySet.empty();

    // Act
    PropertySet actualOverrideWithResult = emptyResult.overrideWith(other);

    // Assert
    assertSame(other, actualOverrideWithResult);
  }

  /**
   * Test {@link PropertySet#equals(Object)}, and {@link PropertySet#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PropertySet#equals(Object)}
   *   <li>{@link PropertySet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.equals(Object)", "int PropertySet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    PropertySet emptyResult = PropertySet.empty();
    PropertySet emptyResult2 = PropertySet.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link PropertySet#equals(Object)}, and {@link PropertySet#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PropertySet#equals(Object)}
   *   <li>{@link PropertySet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.equals(Object)", "int PropertySet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    PropertySet ofResult = PropertySet.of(keyValues);
    PropertySet emptyResult = PropertySet.empty();

    // Act and Assert
    assertEquals(ofResult, emptyResult);
    assertEquals(ofResult.hashCode(), emptyResult.hashCode());
  }

  /**
   * Test {@link PropertySet#equals(Object)}, and {@link PropertySet#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PropertySet#equals(Object)}
   *   <li>{@link PropertySet#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.equals(Object)", "int PropertySet.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    PropertySet emptyResult = PropertySet.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link PropertySet#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.equals(Object)", "int PropertySet.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder<String, String> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<String, String> keyValues =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act and Assert
    assertNotEquals(PropertySet.of(keyValues), 1);
  }

  /**
   * Test {@link PropertySet#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.equals(Object)", "int PropertySet.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PropertySet.empty(), null);
  }

  /**
   * Test {@link PropertySet#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PropertySet#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PropertySet.equals(Object)", "int PropertySet.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(PropertySet.empty(), "Different type to PropertySet");
  }

  /**
   * Test {@link PropertySet#toString()}.
   *
   * <p>Method under test: {@link PropertySet#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PropertySet.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("{}", PropertySet.empty().toString());
  }
}
