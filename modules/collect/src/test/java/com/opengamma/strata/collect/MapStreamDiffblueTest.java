package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSortedMap;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MapStreamDiffblueTest {
  /**
   * Test {@link MapStream#keys()}.
   *
   * <p>Method under test: {@link MapStream#keys()}
   */
  @Test
  @DisplayName("Test keys()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream MapStream.keys()"})
  void testKeys() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act
    Stream<Object> actualKeysResult = emptyResult.keys();

    // Assert
    assertTrue(actualKeysResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MapStream#values()}.
   *
   * <p>Method under test: {@link MapStream#values()}
   */
  @Test
  @DisplayName("Test values()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream MapStream.values()"})
  void testValues() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act
    Stream<Object> actualValuesResult = emptyResult.values();

    // Assert
    assertTrue(actualValuesResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MapStream#map(BiFunction)} with {@code BiFunction}.
   *
   * <p>Method under test: {@link MapStream#map(BiFunction)}
   */
  @Test
  @DisplayName("Test map(BiFunction) with 'BiFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream MapStream.map(BiFunction)"})
  void testMapWithBiFunction() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act
    Stream<Object> actualMapResult = emptyResult.map(mock(BiFunction.class));

    // Assert
    assertTrue(actualMapResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MapStream#map(Function)} with {@code Function}.
   *
   * <p>Method under test: {@link MapStream#map(Function)}
   */
  @Test
  @DisplayName("Test map(Function) with 'Function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream MapStream.map(Function)"})
  void testMapWithFunction() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act
    Stream<Object> actualMapResult = emptyResult.map(mock(Function.class));

    // Assert
    assertTrue(actualMapResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MapStream#flatMap(BiFunction)} with {@code BiFunction}.
   *
   * <p>Method under test: {@link MapStream#flatMap(BiFunction)}
   */
  @Test
  @DisplayName("Test flatMap(BiFunction) with 'BiFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream MapStream.flatMap(BiFunction)"})
  void testFlatMapWithBiFunction() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act
    Stream<Object> actualFlatMapResult = emptyResult.flatMap(mock(BiFunction.class));

    // Assert
    assertTrue(actualFlatMapResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MapStream#flatMap(Function)} with {@code Function}.
   *
   * <p>Method under test: {@link MapStream#flatMap(Function)}
   */
  @Test
  @DisplayName("Test flatMap(Function) with 'Function'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream MapStream.flatMap(Function)"})
  void testFlatMapWithFunction() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act
    Stream<Object> actualFlatMapResult = emptyResult.flatMap(mock(Function.class));

    // Assert
    assertTrue(actualFlatMapResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MapStream#minKeys(Comparator)}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#minKeys(Comparator)}
   */
  @Test
  @DisplayName(
      "Test minKeys(Comparator); given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.minKeys(Comparator)"})
  void testMinKeys_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Optional<Entry<Object, Object>> actualMinKeysResult = ofResult.minKeys(comparator);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualMinKeysResult.isPresent());
  }

  /**
   * Test {@link MapStream#minKeys(Comparator)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>When {@link Comparator}.
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#minKeys(Comparator)}
   */
  @Test
  @DisplayName(
      "Test minKeys(Comparator); given builder 'Key' is 'Value'; when Comparator; then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.minKeys(Comparator)"})
  void testMinKeys_givenBuilderKeyIsValue_whenComparator_thenReturnPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.minKeys(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#minKeys(Comparator)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#minKeys(Comparator)}
   */
  @Test
  @DisplayName(
      "Test minKeys(Comparator); given Comparator compare(Object, Object) return one; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.minKeys(Comparator)"})
  void testMinKeys_givenComparatorCompareReturnOne_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        orderKeysByResult.orderValuesBy(valueComparator).build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Optional<Entry<Object, Object>> actualMinKeysResult = ofResult.minKeys(comparator);

    // Assert
    verify(valueComparator).compare(isA(Object.class), isA(Object.class));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualMinKeysResult.isPresent());
  }

  /**
   * Test {@link MapStream#minKeys(Comparator)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Comparator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#minKeys(Comparator)}
   */
  @Test
  @DisplayName("Test minKeys(Comparator); given empty; when Comparator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.minKeys(Comparator)"})
  void testMinKeys_givenEmpty_whenComparator_thenReturnNotPresent() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.minKeys(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#minKeys(Comparator)}.
   *
   * <ul>
   *   <li>When {@link Comparator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#minKeys(Comparator)}
   */
  @Test
  @DisplayName("Test minKeys(Comparator); when Comparator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.minKeys(Comparator)"})
  void testMinKeys_whenComparator_thenReturnNotPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertFalse(ofResult.minKeys(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#minValues(Comparator)}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#minValues(Comparator)}
   */
  @Test
  @DisplayName(
      "Test minValues(Comparator); given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.minValues(Comparator)"})
  void testMinValues_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Optional<Entry<Object, Object>> actualMinValuesResult = ofResult.minValues(comparator);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualMinValuesResult.isPresent());
  }

  /**
   * Test {@link MapStream#minValues(Comparator)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>When {@link Comparator}.
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#minValues(Comparator)}
   */
  @Test
  @DisplayName(
      "Test minValues(Comparator); given builder 'Key' is 'Value'; when Comparator; then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.minValues(Comparator)"})
  void testMinValues_givenBuilderKeyIsValue_whenComparator_thenReturnPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.minValues(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#minValues(Comparator)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#minValues(Comparator)}
   */
  @Test
  @DisplayName(
      "Test minValues(Comparator); given Comparator compare(Object, Object) return one; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.minValues(Comparator)"})
  void testMinValues_givenComparatorCompareReturnOne_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        orderKeysByResult.orderValuesBy(valueComparator).build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Optional<Entry<Object, Object>> actualMinValuesResult = ofResult.minValues(comparator);

    // Assert
    verify(valueComparator).compare(isA(Object.class), isA(Object.class));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualMinValuesResult.isPresent());
  }

  /**
   * Test {@link MapStream#minValues(Comparator)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Comparator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#minValues(Comparator)}
   */
  @Test
  @DisplayName("Test minValues(Comparator); given empty; when Comparator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.minValues(Comparator)"})
  void testMinValues_givenEmpty_whenComparator_thenReturnNotPresent() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.minValues(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#minValues(Comparator)}.
   *
   * <ul>
   *   <li>When {@link Comparator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#minValues(Comparator)}
   */
  @Test
  @DisplayName("Test minValues(Comparator); when Comparator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.minValues(Comparator)"})
  void testMinValues_whenComparator_thenReturnNotPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertFalse(ofResult.minValues(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#maxKeys(Comparator)}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#maxKeys(Comparator)}
   */
  @Test
  @DisplayName(
      "Test maxKeys(Comparator); given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.maxKeys(Comparator)"})
  void testMaxKeys_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Optional<Entry<Object, Object>> actualMaxKeysResult = ofResult.maxKeys(comparator);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualMaxKeysResult.isPresent());
  }

  /**
   * Test {@link MapStream#maxKeys(Comparator)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>When {@link Comparator}.
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#maxKeys(Comparator)}
   */
  @Test
  @DisplayName(
      "Test maxKeys(Comparator); given builder 'Key' is 'Value'; when Comparator; then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.maxKeys(Comparator)"})
  void testMaxKeys_givenBuilderKeyIsValue_whenComparator_thenReturnPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.maxKeys(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#maxKeys(Comparator)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#maxKeys(Comparator)}
   */
  @Test
  @DisplayName(
      "Test maxKeys(Comparator); given Comparator compare(Object, Object) return one; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.maxKeys(Comparator)"})
  void testMaxKeys_givenComparatorCompareReturnOne_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        orderKeysByResult.orderValuesBy(valueComparator).build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Optional<Entry<Object, Object>> actualMaxKeysResult = ofResult.maxKeys(comparator);

    // Assert
    verify(valueComparator).compare(isA(Object.class), isA(Object.class));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualMaxKeysResult.isPresent());
  }

  /**
   * Test {@link MapStream#maxKeys(Comparator)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Comparator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#maxKeys(Comparator)}
   */
  @Test
  @DisplayName("Test maxKeys(Comparator); given empty; when Comparator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.maxKeys(Comparator)"})
  void testMaxKeys_givenEmpty_whenComparator_thenReturnNotPresent() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.maxKeys(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#maxKeys(Comparator)}.
   *
   * <ul>
   *   <li>When {@link Comparator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#maxKeys(Comparator)}
   */
  @Test
  @DisplayName("Test maxKeys(Comparator); when Comparator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.maxKeys(Comparator)"})
  void testMaxKeys_whenComparator_thenReturnNotPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertFalse(ofResult.maxKeys(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#maxValues(Comparator)}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#maxValues(Comparator)}
   */
  @Test
  @DisplayName(
      "Test maxValues(Comparator); given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.maxValues(Comparator)"})
  void testMaxValues_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Optional<Entry<Object, Object>> actualMaxValuesResult = ofResult.maxValues(comparator);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualMaxValuesResult.isPresent());
  }

  /**
   * Test {@link MapStream#maxValues(Comparator)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>When {@link Comparator}.
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#maxValues(Comparator)}
   */
  @Test
  @DisplayName(
      "Test maxValues(Comparator); given builder 'Key' is 'Value'; when Comparator; then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.maxValues(Comparator)"})
  void testMaxValues_givenBuilderKeyIsValue_whenComparator_thenReturnPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.maxValues(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#maxValues(Comparator)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#maxValues(Comparator)}
   */
  @Test
  @DisplayName(
      "Test maxValues(Comparator); given Comparator compare(Object, Object) return one; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.maxValues(Comparator)"})
  void testMaxValues_givenComparatorCompareReturnOne_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        orderKeysByResult.orderValuesBy(valueComparator).build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Comparator<Object> comparator = mock(Comparator.class);
    when(comparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    // Act
    Optional<Entry<Object, Object>> actualMaxValuesResult = ofResult.maxValues(comparator);

    // Assert
    verify(valueComparator).compare(isA(Object.class), isA(Object.class));
    verify(comparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualMaxValuesResult.isPresent());
  }

  /**
   * Test {@link MapStream#maxValues(Comparator)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Comparator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#maxValues(Comparator)}
   */
  @Test
  @DisplayName("Test maxValues(Comparator); given empty; when Comparator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.maxValues(Comparator)"})
  void testMaxValues_givenEmpty_whenComparator_thenReturnNotPresent() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.maxValues(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#maxValues(Comparator)}.
   *
   * <ul>
   *   <li>When {@link Comparator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#maxValues(Comparator)}
   */
  @Test
  @DisplayName("Test maxValues(Comparator); when Comparator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.maxValues(Comparator)"})
  void testMaxValues_whenComparator_thenReturnNotPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertFalse(ofResult.maxValues(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#anyMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#anyMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test anyMatch(BiPredicate) with 'BiPredicate'; given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.anyMatch(BiPredicate)"})
  void testAnyMatchWithBiPredicate_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put(42, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BiPredicate<Object, Object> predicate = mock(BiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualAnyMatchResult = ofResult.anyMatch(predicate);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(predicate).test(isA(Object.class), isA(Object.class));
    assertTrue(actualAnyMatchResult);
  }

  /**
   * Test {@link MapStream#anyMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#anyMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test anyMatch(BiPredicate) with 'BiPredicate'; given builder 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.anyMatch(BiPredicate)"})
  void testAnyMatchWithBiPredicate_givenBuilderKeyIsValue_thenReturnTrue() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BiPredicate<Object, Object> predicate = mock(BiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualAnyMatchResult = ofResult.anyMatch(predicate);

    // Assert
    verify(predicate).test(isA(Object.class), isA(Object.class));
    assertTrue(actualAnyMatchResult);
  }

  /**
   * Test {@link MapStream#anyMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link BiPredicate}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#anyMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test anyMatch(BiPredicate) with 'BiPredicate'; given empty; when BiPredicate; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.anyMatch(BiPredicate)"})
  void testAnyMatchWithBiPredicate_givenEmpty_whenBiPredicate_thenReturnFalse() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.anyMatch(mock(BiPredicate.class)));
  }

  /**
   * Test {@link MapStream#anyMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#anyMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test anyMatch(BiPredicate) with 'BiPredicate'; given HashMap() 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.anyMatch(BiPredicate)"})
  void testAnyMatchWithBiPredicate_givenHashMapKeyIsValue_thenReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");
    MapStream<Object, Object> ofResult = MapStream.of(map);

    BiPredicate<Object, Object> predicate = mock(BiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualAnyMatchResult = ofResult.anyMatch(predicate);

    // Assert
    verify(predicate).test(isA(Object.class), isA(Object.class));
    assertTrue(actualAnyMatchResult);
  }

  /**
   * Test {@link MapStream#anyMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>When {@link BiPredicate}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#anyMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test anyMatch(BiPredicate) with 'BiPredicate'; when BiPredicate; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.anyMatch(BiPredicate)"})
  void testAnyMatchWithBiPredicate_whenBiPredicate_thenReturnFalse() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertFalse(ofResult.anyMatch(mock(BiPredicate.class)));
  }

  /**
   * Test {@link MapStream#anyMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#anyMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test anyMatch(Predicate) with 'Predicate'; given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.anyMatch(Predicate)"})
  void testAnyMatchWithPredicate_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put(42, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Predicate<Entry<Object, Object>> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Entry<Object, Object>>any())).thenReturn(true);

    // Act
    boolean actualAnyMatchResult = ofResult.anyMatch(predicate);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(predicate).test(isA(Entry.class));
    assertTrue(actualAnyMatchResult);
  }

  /**
   * Test {@link MapStream#anyMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#anyMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test anyMatch(Predicate) with 'Predicate'; given builder 'Key' is 'Value'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.anyMatch(Predicate)"})
  void testAnyMatchWithPredicate_givenBuilderKeyIsValue_thenReturnTrue() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Predicate<Entry<Object, Object>> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Entry<Object, Object>>any())).thenReturn(true);

    // Act
    boolean actualAnyMatchResult = ofResult.anyMatch(predicate);

    // Assert
    verify(predicate).test(isA(Entry.class));
    assertTrue(actualAnyMatchResult);
  }

  /**
   * Test {@link MapStream#anyMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#anyMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test anyMatch(Predicate) with 'Predicate'; given empty; when Predicate; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.anyMatch(Predicate)"})
  void testAnyMatchWithPredicate_givenEmpty_whenPredicate_thenReturnFalse() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.anyMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link MapStream#anyMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#anyMatch(Predicate)}
   */
  @Test
  @DisplayName("Test anyMatch(Predicate) with 'Predicate'; when Predicate; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.anyMatch(Predicate)"})
  void testAnyMatchWithPredicate_whenPredicate_thenReturnFalse() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertFalse(ofResult.anyMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link MapStream#allMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#allMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test allMatch(BiPredicate) with 'BiPredicate'; given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.allMatch(BiPredicate)"})
  void testAllMatchWithBiPredicate_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put(42, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BiPredicate<Object, Object> predicate = mock(BiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualAllMatchResult = ofResult.allMatch(predicate);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(predicate, atLeast(1)).test(Mockito.<Object>any(), isA(Object.class));
    assertTrue(actualAllMatchResult);
  }

  /**
   * Test {@link MapStream#allMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>When {@link BiPredicate} {@link BiPredicate#test(Object, Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#allMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test allMatch(BiPredicate) with 'BiPredicate'; given builder 'Key' is 'Value'; when BiPredicate test(Object, Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.allMatch(BiPredicate)"})
  void testAllMatchWithBiPredicate_givenBuilderKeyIsValue_whenBiPredicateTestReturnTrue() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BiPredicate<Object, Object> predicate = mock(BiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualAllMatchResult = ofResult.allMatch(predicate);

    // Assert
    verify(predicate).test(isA(Object.class), isA(Object.class));
    assertTrue(actualAllMatchResult);
  }

  /**
   * Test {@link MapStream#allMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link BiPredicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#allMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test allMatch(BiPredicate) with 'BiPredicate'; given empty; when BiPredicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.allMatch(BiPredicate)"})
  void testAllMatchWithBiPredicate_givenEmpty_whenBiPredicate_thenReturnTrue() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertTrue(emptyResult.allMatch(mock(BiPredicate.class)));
  }

  /**
   * Test {@link MapStream#allMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#allMatch(BiPredicate)}
   */
  @Test
  @DisplayName("Test allMatch(BiPredicate) with 'BiPredicate'; given 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.allMatch(BiPredicate)"})
  void testAllMatchWithBiPredicate_givenFalse_thenReturnFalse() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BiPredicate<Object, Object> predicate = mock(BiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(false);

    // Act
    boolean actualAllMatchResult = ofResult.allMatch(predicate);

    // Assert
    verify(predicate).test(isA(Object.class), isA(Object.class));
    assertFalse(actualAllMatchResult);
  }

  /**
   * Test {@link MapStream#allMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>When {@link BiPredicate} {@link BiPredicate#test(Object, Object)} return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#allMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test allMatch(BiPredicate) with 'BiPredicate'; given HashMap() 'Key' is 'Value'; when BiPredicate test(Object, Object) return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.allMatch(BiPredicate)"})
  void testAllMatchWithBiPredicate_givenHashMapKeyIsValue_whenBiPredicateTestReturnTrue() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");
    MapStream<Object, Object> ofResult = MapStream.of(map);

    BiPredicate<Object, Object> predicate = mock(BiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualAllMatchResult = ofResult.allMatch(predicate);

    // Assert
    verify(predicate).test(isA(Object.class), isA(Object.class));
    assertTrue(actualAllMatchResult);
  }

  /**
   * Test {@link MapStream#allMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>When {@link BiPredicate}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#allMatch(BiPredicate)}
   */
  @Test
  @DisplayName("Test allMatch(BiPredicate) with 'BiPredicate'; when BiPredicate")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.allMatch(BiPredicate)"})
  void testAllMatchWithBiPredicate_whenBiPredicate() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.allMatch(mock(BiPredicate.class)));
  }

  /**
   * Test {@link MapStream#allMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#allMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test allMatch(Predicate) with 'Predicate'; given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.allMatch(Predicate)"})
  void testAllMatchWithPredicate_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put(42, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Predicate<Entry<Object, Object>> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Entry<Object, Object>>any())).thenReturn(true);

    // Act
    boolean actualAllMatchResult = ofResult.allMatch(predicate);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(predicate, atLeast(1)).test(Mockito.<Entry<Object, Object>>any());
    assertTrue(actualAllMatchResult);
  }

  /**
   * Test {@link MapStream#allMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#allMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test allMatch(Predicate) with 'Predicate'; given empty; when Predicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.allMatch(Predicate)"})
  void testAllMatchWithPredicate_givenEmpty_whenPredicate_thenReturnTrue() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertTrue(emptyResult.allMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link MapStream#allMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>Given {@code false}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#allMatch(Predicate)}
   */
  @Test
  @DisplayName("Test allMatch(Predicate) with 'Predicate'; given 'false'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.allMatch(Predicate)"})
  void testAllMatchWithPredicate_givenFalse_thenReturnFalse() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Predicate<Entry<Object, Object>> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Entry<Object, Object>>any())).thenReturn(false);

    // Act
    boolean actualAllMatchResult = ofResult.allMatch(predicate);

    // Assert
    verify(predicate).test(isA(Entry.class));
    assertFalse(actualAllMatchResult);
  }

  /**
   * Test {@link MapStream#allMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>Given {@code true}.
   *   <li>When {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then calls {@link Predicate#test(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#allMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test allMatch(Predicate) with 'Predicate'; given 'true'; when Predicate test(Object) return 'true'; then calls test(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.allMatch(Predicate)"})
  void testAllMatchWithPredicate_givenTrue_whenPredicateTestReturnTrue_thenCallsTest() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Predicate<Entry<Object, Object>> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Entry<Object, Object>>any())).thenReturn(true);

    // Act
    boolean actualAllMatchResult = ofResult.allMatch(predicate);

    // Assert
    verify(predicate).test(isA(Entry.class));
    assertTrue(actualAllMatchResult);
  }

  /**
   * Test {@link MapStream#allMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#allMatch(Predicate)}
   */
  @Test
  @DisplayName("Test allMatch(Predicate) with 'Predicate'; when Predicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.allMatch(Predicate)"})
  void testAllMatchWithPredicate_whenPredicate_thenReturnTrue() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.allMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link MapStream#noneMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#noneMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test noneMatch(BiPredicate) with 'BiPredicate'; given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.noneMatch(BiPredicate)"})
  void testNoneMatchWithBiPredicate_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put(42, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BiPredicate<Object, Object> predicate = mock(BiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualNoneMatchResult = ofResult.noneMatch(predicate);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(predicate).test(isA(Object.class), isA(Object.class));
    assertFalse(actualNoneMatchResult);
  }

  /**
   * Test {@link MapStream#noneMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#noneMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test noneMatch(BiPredicate) with 'BiPredicate'; given builder 'Key' is 'Value'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.noneMatch(BiPredicate)"})
  void testNoneMatchWithBiPredicate_givenBuilderKeyIsValue_thenReturnFalse() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BiPredicate<Object, Object> predicate = mock(BiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualNoneMatchResult = ofResult.noneMatch(predicate);

    // Assert
    verify(predicate).test(isA(Object.class), isA(Object.class));
    assertFalse(actualNoneMatchResult);
  }

  /**
   * Test {@link MapStream#noneMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link BiPredicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#noneMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test noneMatch(BiPredicate) with 'BiPredicate'; given empty; when BiPredicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.noneMatch(BiPredicate)"})
  void testNoneMatchWithBiPredicate_givenEmpty_whenBiPredicate_thenReturnTrue() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertTrue(emptyResult.noneMatch(mock(BiPredicate.class)));
  }

  /**
   * Test {@link MapStream#noneMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#noneMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test noneMatch(BiPredicate) with 'BiPredicate'; given HashMap() 'Key' is 'Value'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.noneMatch(BiPredicate)"})
  void testNoneMatchWithBiPredicate_givenHashMapKeyIsValue_thenReturnFalse() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");
    MapStream<Object, Object> ofResult = MapStream.of(map);

    BiPredicate<Object, Object> predicate = mock(BiPredicate.class);
    when(predicate.test(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(true);

    // Act
    boolean actualNoneMatchResult = ofResult.noneMatch(predicate);

    // Assert
    verify(predicate).test(isA(Object.class), isA(Object.class));
    assertFalse(actualNoneMatchResult);
  }

  /**
   * Test {@link MapStream#noneMatch(BiPredicate)} with {@code BiPredicate}.
   *
   * <ul>
   *   <li>When {@link BiPredicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#noneMatch(BiPredicate)}
   */
  @Test
  @DisplayName(
      "Test noneMatch(BiPredicate) with 'BiPredicate'; when BiPredicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.noneMatch(BiPredicate)"})
  void testNoneMatchWithBiPredicate_whenBiPredicate_thenReturnTrue() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.noneMatch(mock(BiPredicate.class)));
  }

  /**
   * Test {@link MapStream#noneMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#noneMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test noneMatch(Predicate) with 'Predicate'; given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.noneMatch(Predicate)"})
  void testNoneMatchWithPredicate_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put(42, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Predicate<Entry<Object, Object>> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Entry<Object, Object>>any())).thenReturn(true);

    // Act
    boolean actualNoneMatchResult = ofResult.noneMatch(predicate);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(predicate).test(isA(Entry.class));
    assertFalse(actualNoneMatchResult);
  }

  /**
   * Test {@link MapStream#noneMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#noneMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test noneMatch(Predicate) with 'Predicate'; given builder 'Key' is 'Value'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.noneMatch(Predicate)"})
  void testNoneMatchWithPredicate_givenBuilderKeyIsValue_thenReturnFalse() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Predicate<Entry<Object, Object>> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Entry<Object, Object>>any())).thenReturn(true);

    // Act
    boolean actualNoneMatchResult = ofResult.noneMatch(predicate);

    // Assert
    verify(predicate).test(isA(Entry.class));
    assertFalse(actualNoneMatchResult);
  }

  /**
   * Test {@link MapStream#noneMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#noneMatch(Predicate)}
   */
  @Test
  @DisplayName(
      "Test noneMatch(Predicate) with 'Predicate'; given empty; when Predicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.noneMatch(Predicate)"})
  void testNoneMatchWithPredicate_givenEmpty_whenPredicate_thenReturnTrue() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertTrue(emptyResult.noneMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link MapStream#noneMatch(Predicate)} with {@code Predicate}.
   *
   * <ul>
   *   <li>When {@link Predicate}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#noneMatch(Predicate)}
   */
  @Test
  @DisplayName("Test noneMatch(Predicate) with 'Predicate'; when Predicate; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.noneMatch(Predicate)"})
  void testNoneMatchWithPredicate_whenPredicate_thenReturnTrue() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.noneMatch(mock(Predicate.class)));
  }

  /**
   * Test {@link MapStream#toMap(BiFunction)} with {@code BiFunction}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return {@code Key} is {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap(BiFunction)}
   */
  @Test
  @DisplayName(
      "Test toMap(BiFunction) with 'BiFunction'; given 'Apply'; then return 'Key' is 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap(BiFunction)"})
  void testToMapWithBiFunction_givenApply_thenReturnKeyIsApply() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    builderResult.put(ofResult, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    Builder<Object, Object> orderKeysByResult =
        expectedValuesPerKeyResult.orderKeysBy(keyComparator);

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        orderKeysByResult.orderValuesBy(valueComparator).build();
    MapStream<Object, Object> ofResult2 = MapStream.of(multimap);

    BiFunction<Object, Object, Object> mergeFn = mock(BiFunction.class);
    when(mergeFn.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    ImmutableMap<Object, Object> actualToMapResult = ofResult2.toMap(mergeFn);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(valueComparator).compare(isA(Object.class), isA(Object.class));
    verify(mergeFn).apply(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToMapResult.size());
    assertEquals("Apply", actualToMapResult.get("Key"));
  }

  /**
   * Test {@link MapStream#toMap(BiFunction)} with {@code BiFunction}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then return forty-two is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap(BiFunction)}
   */
  @Test
  @DisplayName(
      "Test toMap(BiFunction) with 'BiFunction'; given builder forty-two is 'Value'; then return forty-two is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap(BiFunction)"})
  void testToMapWithBiFunction_givenBuilderFortyTwoIsValue_thenReturnFortyTwoIsValue() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableMap<Object, Object> actualToMapResult = ofResult.toMap(mock(BiFunction.class));

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToMapResult.size());
    assertEquals("Value", actualToMapResult.get("Key"));
    assertEquals("Value", actualToMapResult.get(42));
  }

  /**
   * Test {@link MapStream#toMap(BiFunction)} with {@code BiFunction}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap(BiFunction)}
   */
  @Test
  @DisplayName(
      "Test toMap(BiFunction) with 'BiFunction'; given builder 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap(BiFunction)"})
  void testToMapWithBiFunction_givenBuilderKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableMap<Object, Object> actualToMapResult = ofResult.toMap(mock(BiFunction.class));

    // Assert
    assertEquals(1, actualToMapResult.size());
    assertEquals("Value", actualToMapResult.get("Key"));
  }

  /**
   * Test {@link MapStream#toMap(BiFunction)} with {@code BiFunction}.
   *
   * <ul>
   *   <li>Given builder of is {@code Value}.
   *   <li>When {@link BiFunction}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap(BiFunction)}
   */
  @Test
  @DisplayName(
      "Test toMap(BiFunction) with 'BiFunction'; given builder of is 'Value'; when BiFunction; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap(BiFunction)"})
  void testToMapWithBiFunction_givenBuilderOfIsValue_whenBiFunction_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    builderResult.put(ofResult, "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult2 = MapStream.of(multimap);

    // Act and Assert
    assertEquals(1, ofResult2.toMap(mock(BiFunction.class)).size());
  }

  /**
   * Test {@link MapStream#toMap(BiFunction)} with {@code BiFunction}.
   *
   * <ul>
   *   <li>Given builder of is {@code Value}.
   *   <li>When {@link BiFunction}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap(BiFunction)}
   */
  @Test
  @DisplayName(
      "Test toMap(BiFunction) with 'BiFunction'; given builder of is 'Value'; when BiFunction; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap(BiFunction)"})
  void testToMapWithBiFunction_givenBuilderOfIsValue_whenBiFunction_thenReturnSizeIsTwo() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    builderResult.put(ofResult, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult2 = MapStream.of(multimap);

    // Act
    ImmutableMap<Object, Object> actualToMapResult = ofResult2.toMap(mock(BiFunction.class));

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToMapResult.size());
    assertEquals("Value", actualToMapResult.get("Key"));
  }

  /**
   * Test {@link MapStream#toMap(BiFunction)} with {@code BiFunction}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link BiFunction}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap(BiFunction)}
   */
  @Test
  @DisplayName(
      "Test toMap(BiFunction) with 'BiFunction'; given empty; when BiFunction; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap(BiFunction)"})
  void testToMapWithBiFunction_givenEmpty_whenBiFunction_thenReturnEmpty() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertTrue(emptyResult.toMap(mock(BiFunction.class)).isEmpty());
  }

  /**
   * Test {@link MapStream#toMap(BiFunction)} with {@code BiFunction}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap(BiFunction)}
   */
  @Test
  @DisplayName("Test toMap(BiFunction) with 'BiFunction'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap(BiFunction)"})
  void testToMapWithBiFunction_thenReturnEmpty() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.toMap(mock(BiFunction.class)).isEmpty());
  }

  /**
   * Test {@link MapStream#toMap()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap()}
   */
  @Test
  @DisplayName("Test toMap(); given builder 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap()"})
  void testToMap_givenBuilderKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableMap<Object, Object> actualToMapResult = ofResult.toMap();

    // Assert
    assertEquals(1, actualToMapResult.size());
    assertEquals("Value", actualToMapResult.get("Key"));
  }

  /**
   * Test {@link MapStream#toMap()}.
   *
   * <ul>
   *   <li>Given builder of is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap()}
   */
  @Test
  @DisplayName("Test toMap(); given builder of is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap()"})
  void testToMap_givenBuilderOfIsValue_thenReturnSizeIsTwo() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    builderResult.put(ofResult, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult2 = MapStream.of(multimap);

    // Act
    ImmutableMap<Object, Object> actualToMapResult = ofResult2.toMap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToMapResult.size());
    assertEquals("Value", actualToMapResult.get("Key"));
  }

  /**
   * Test {@link MapStream#toMap()}.
   *
   * <ul>
   *   <li>Given builder of is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap()}
   */
  @Test
  @DisplayName("Test toMap(); given builder of is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap()"})
  void testToMap_givenBuilderOfIsValue_thenReturnSizeIsTwo2() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    builderResult.put(ofResult, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult2 = MapStream.of(multimap);

    // Act
    ImmutableMap<Object, Object> actualToMapResult = ofResult2.toMap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToMapResult.size());
    assertEquals("Value", actualToMapResult.get("Key"));
  }

  /**
   * Test {@link MapStream#toMap()}.
   *
   * <ul>
   *   <li>Given builder one is {@code Value}.
   *   <li>Then return one is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap()}
   */
  @Test
  @DisplayName("Test toMap(); given builder one is 'Value'; then return one is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap()"})
  void testToMap_givenBuilderOneIsValue_thenReturnOneIsValue() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(1, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableMap<Object, Object> actualToMapResult = ofResult.toMap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToMapResult.size());
    assertEquals("Value", actualToMapResult.get("Key"));
    assertEquals("Value", actualToMapResult.get(1));
  }

  /**
   * Test {@link MapStream#toMap()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap()}
   */
  @Test
  @DisplayName("Test toMap(); given empty; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap()"})
  void testToMap_givenEmpty_thenReturnEmpty() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertTrue(emptyResult.toMap().isEmpty());
  }

  /**
   * Test {@link MapStream#toMap()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMap()}
   */
  @Test
  @DisplayName("Test toMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMap()"})
  void testToMap_thenReturnEmpty() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.toMap().isEmpty());
  }

  /**
   * Test {@link MapStream#toMapGrouping()}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMapGrouping()}
   */
  @Test
  @DisplayName("Test toMapGrouping(); given builder forty-two is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMapGrouping()"})
  void testToMapGrouping_givenBuilderFortyTwoIsValue_thenReturnSizeIsTwo() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableMap<Object, List<Object>> actualToMapGroupingResult = ofResult.toMapGrouping();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToMapGroupingResult.size());
    List<Object> getResult = actualToMapGroupingResult.get(42);
    assertEquals(1, getResult.size());
    assertEquals("Value", getResult.get(0));
    assertEquals(getResult, actualToMapGroupingResult.get("Key"));
  }

  /**
   * Test {@link MapStream#toMapGrouping()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return {@code Key} size is one.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMapGrouping()}
   */
  @Test
  @DisplayName(
      "Test toMapGrouping(); given builder 'Key' is 'Value'; then return 'Key' size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMapGrouping()"})
  void testToMapGrouping_givenBuilderKeyIsValue_thenReturnKeySizeIsOne() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableMap<Object, List<Object>> actualToMapGroupingResult = ofResult.toMapGrouping();

    // Assert
    assertEquals(1, actualToMapGroupingResult.size());
    List<Object> getResult = actualToMapGroupingResult.get("Key");
    assertEquals(1, getResult.size());
    assertEquals("Value", getResult.get(0));
  }

  /**
   * Test {@link MapStream#toMapGrouping()}.
   *
   * <ul>
   *   <li>Given builder of is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMapGrouping()}
   */
  @Test
  @DisplayName("Test toMapGrouping(); given builder of is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMapGrouping()"})
  void testToMapGrouping_givenBuilderOfIsValue_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    builderResult.put(ofResult, "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult2 = MapStream.of(multimap);

    // Act and Assert
    assertEquals(1, ofResult2.toMapGrouping().size());
  }

  /**
   * Test {@link MapStream#toMapGrouping()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMapGrouping()}
   */
  @Test
  @DisplayName("Test toMapGrouping(); given empty; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMapGrouping()"})
  void testToMapGrouping_givenEmpty_thenReturnEmpty() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertTrue(emptyResult.toMapGrouping().isEmpty());
  }

  /**
   * Test {@link MapStream#toMapGrouping()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toMapGrouping()}
   */
  @Test
  @DisplayName("Test toMapGrouping(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap MapStream.toMapGrouping()"})
  void testToMapGrouping_thenReturnEmpty() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.toMapGrouping().isEmpty());
  }

  /**
   * Test {@link MapStream#groupingAndThen()}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#groupingAndThen()}
   */
  @Test
  @DisplayName(
      "Test groupingAndThen(); given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MapStream MapStream.groupingAndThen()"})
  void testGroupingAndThen_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ofResult.groupingAndThen();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult.put(
        builderResult2
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToListMultimapResult.size());
    assertEquals(2, actualToListMultimapResult.entries().size());
    assertEquals(2, actualToListMultimapResult.keys().size());
    assertFalse(actualToListMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap2() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult2.put(
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult2.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult2.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToListMultimapResult.size());
    assertEquals(2, actualToListMultimapResult.entries().size());
    assertEquals(2, actualToListMultimapResult.keys().size());
    assertFalse(actualToListMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap3() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult2.put(orderKeysByResult.orderValuesBy(valueComparator).build(), "Value");
    builderResult2.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult2.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    verify(valueComparator).compare(isA(Object.class), isA(Object.class));
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToListMultimapResult.size());
    assertEquals(2, actualToListMultimapResult.entries().size());
    assertEquals(2, actualToListMultimapResult.keys().size());
    assertFalse(actualToListMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap4() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult.put(
        1,
        builderResult2
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build());
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    Builder<Object, Object> builderResult3 = ImmutableListMultimap.builder();
    builderResult3.put(
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult3.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult2 = builderResult3.expectedValuesPerKey(42);

    Comparator<Object> keyComparator2 = mock(Comparator.class);
    when(keyComparator2.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult2
            .orderKeysBy(keyComparator2)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(keyComparator2).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToListMultimapResult.size());
    assertEquals(2, actualToListMultimapResult.entries().size());
    assertEquals(2, actualToListMultimapResult.keys().size());
    assertFalse(actualToListMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap(); given builder 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap_givenBuilderKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    assertEquals(1, actualToListMultimapResult.size());
    assertEquals(1, actualToListMultimapResult.entries().size());
    assertEquals(1, actualToListMultimapResult.keys().size());
    assertFalse(actualToListMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap(); given builder 'Key' is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap_givenBuilderKeyIsValue_thenReturnSizeIsTwo() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        orderKeysByResult.orderValuesBy(valueComparator).build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    verify(valueComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToListMultimapResult.size());
    assertEquals(2, actualToListMultimapResult.entries().size());
    assertEquals(2, actualToListMultimapResult.keys().size());
    assertFalse(actualToListMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <ul>
   *   <li>Given builder one is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap(); given builder one is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap_givenBuilderOneIsValue_thenReturnSizeIsTwo() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(1, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToListMultimapResult.size());
    assertEquals(2, actualToListMultimapResult.entries().size());
    assertEquals(2, actualToListMultimapResult.keys().size());
    assertFalse(actualToListMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <ul>
   *   <li>Given builder one is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap(); given builder one is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap_givenBuilderOneIsValue_thenReturnSizeIsTwo2() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(1, "Value");

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult.put(
        builderResult2
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToListMultimapResult.size());
    assertEquals(2, actualToListMultimapResult.entries().size());
    assertEquals(2, actualToListMultimapResult.keys().size());
    assertFalse(actualToListMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <ul>
   *   <li>Given builder one is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap(); given builder one is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap_givenBuilderOneIsValue_thenReturnSizeIsTwo3() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(1, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult2.put(
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult2.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult2 = builderResult2.expectedValuesPerKey(42);

    Comparator<Object> keyComparator2 = mock(Comparator.class);
    when(keyComparator2.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult2
            .orderKeysBy(keyComparator2)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(keyComparator2).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToListMultimapResult.size());
    assertEquals(2, actualToListMultimapResult.entries().size());
    assertEquals(2, actualToListMultimapResult.keys().size());
    assertFalse(actualToListMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <ul>
   *   <li>Given builder one is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap(); given builder one is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap_givenBuilderOneIsValue_thenReturnSizeIsTwo4() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(1, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult2.put(
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");

    Builder<Object, Object> builderResult3 = ImmutableListMultimap.builder();
    builderResult2.put(
        builderResult3
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");

    Builder<Object, Object> expectedValuesPerKeyResult2 = builderResult2.expectedValuesPerKey(42);

    Comparator<Object> keyComparator2 = mock(Comparator.class);
    when(keyComparator2.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult2
            .orderKeysBy(keyComparator2)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(keyComparator2).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToListMultimapResult.size());
    assertEquals(2, actualToListMultimapResult.entries().size());
    assertEquals(2, actualToListMultimapResult.keys().size());
    assertFalse(actualToListMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <ul>
   *   <li>Given builder one is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap(); given builder one is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap_givenBuilderOneIsValue_thenReturnSizeIsTwo5() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> immutableListMultimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult2.put(1, "Value");
    builderResult2.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult2.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    Builder<Object, Object> builderResult3 = ImmutableListMultimap.builder();
    builderResult3.put(
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult3.put(immutableListMultimap, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult2 = builderResult3.expectedValuesPerKey(42);

    Comparator<Object> keyComparator2 = mock(Comparator.class);
    when(keyComparator2.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult2
            .orderKeysBy(keyComparator2)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(keyComparator2).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToListMultimapResult.size());
    assertEquals(2, actualToListMultimapResult.entries().size());
    assertEquals(2, actualToListMultimapResult.keys().size());
    assertFalse(actualToListMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap(); given empty; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap_givenEmpty_thenReturnSizeIsZero() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = emptyResult.toListMultimap();

    // Assert
    assertEquals(0, actualToListMultimapResult.size());
    assertTrue(actualToListMultimapResult.isEmpty());
    assertTrue(actualToListMultimapResult.entries().isEmpty());
    assertTrue(actualToListMultimapResult.keys().isEmpty());
  }

  /**
   * Test {@link MapStream#toListMultimap()}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toListMultimap()}
   */
  @Test
  @DisplayName("Test toListMultimap(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableListMultimap MapStream.toListMultimap()"})
  void testToListMultimap_thenReturnSizeIsZero() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableListMultimap<Object, Object> actualToListMultimapResult = ofResult.toListMultimap();

    // Assert
    assertEquals(0, actualToListMultimapResult.size());
    assertTrue(actualToListMultimapResult.isEmpty());
    assertTrue(actualToListMultimapResult.entries().isEmpty());
    assertTrue(actualToListMultimapResult.keys().isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();

    ImmutableSetMultimap.Builder<Object, Object> builderResult2 = ImmutableSetMultimap.builder();
    builderResult.put(
        builderResult2
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap2() {
    // Arrange
    ImmutableSetMultimap.Builder<Object, Object> builderResult = ImmutableSetMultimap.builder();
    builderResult.put("Key", "Value");

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult2.put(
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult2.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult2.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap3() {
    // Arrange
    ImmutableSetMultimap.Builder<Object, Object> builderResult = ImmutableSetMultimap.builder();

    ImmutableSetMultimap.Builder<Object, Object> builderResult2 = ImmutableSetMultimap.builder();
    builderResult.putAll(
        1,
        builderResult2
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build());
    builderResult.put("Key", "Value");

    ImmutableSetMultimap.Builder<Object, Object> expectedValuesPerKeyResult =
        builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    Builder<Object, Object> builderResult3 = ImmutableListMultimap.builder();
    builderResult3.put(
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult3.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult2 = builderResult3.expectedValuesPerKey(42);

    Comparator<Object> keyComparator2 = mock(Comparator.class);
    when(keyComparator2.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult2
            .orderKeysBy(keyComparator2)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(keyComparator2).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given builder All {@code Key} is array of {@link Object} with {@code Values}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap(); given builder All 'Key' is array of Object with 'Values'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenBuilderAllKeyIsArrayOfObjectWithValues() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.putAll("Key", "Values");
    builderResult.put("Key", "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        orderKeysByResult.orderValuesBy(valueComparator).build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(valueComparator, atLeast(1)).compare(isA(Object.class), Mockito.<Object>any());
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given builder All {@code Key} is array of {@link Object} with {@code Values}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap(); given builder All 'Key' is array of Object with 'Values'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenBuilderAllKeyIsArrayOfObjectWithValues2() {
    // Arrange
    ImmutableSetMultimap.Builder<Object, Object> builderResult = ImmutableSetMultimap.builder();
    builderResult.putAll("Key", "Values");
    builderResult.put("Key", "Value");

    ImmutableSetMultimap.Builder<Object, Object> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult2.put(orderKeysByResult.orderValuesBy(valueComparator).build(), "Value");
    builderResult2.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult2.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(valueComparator, atLeast(1)).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given builder All one is array of {@link Object} with {@code Values}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap(); given builder All one is array of Object with 'Values'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenBuilderAllOneIsArrayOfObjectWithValues() {
    // Arrange
    ImmutableSetMultimap.Builder<Object, Object> builderResult = ImmutableSetMultimap.builder();
    builderResult.putAll(1, "Values");
    builderResult.put("Key", "Value");

    ImmutableSetMultimap.Builder<Object, Object> expectedValuesPerKeyResult =
        builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult2.put(
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult2.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult2 = builderResult2.expectedValuesPerKey(42);

    Comparator<Object> keyComparator2 = mock(Comparator.class);
    when(keyComparator2.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult2
            .orderKeysBy(keyComparator2)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(keyComparator2).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given builder All one is array of {@link Object} with {@code Values}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap(); given builder All one is array of Object with 'Values'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenBuilderAllOneIsArrayOfObjectWithValues2() {
    // Arrange
    ImmutableSetMultimap.Builder<Object, Object> builderResult = ImmutableSetMultimap.builder();
    builderResult.putAll(1, "Values");
    builderResult.put("Key", "Value");

    ImmutableSetMultimap.Builder<Object, Object> expectedValuesPerKeyResult =
        builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    Builder<Object, Object> builderResult2 = ImmutableListMultimap.builder();
    builderResult2.put(
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");

    ImmutableSetMultimap.Builder<Object, Object> builderResult3 = ImmutableSetMultimap.builder();
    builderResult2.put(
        builderResult3
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");

    Builder<Object, Object> expectedValuesPerKeyResult2 = builderResult2.expectedValuesPerKey(42);

    Comparator<Object> keyComparator2 = mock(Comparator.class);
    when(keyComparator2.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult2
            .orderKeysBy(keyComparator2)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(keyComparator2).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given builder All one is array of {@link Object} with {@code Values}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap(); given builder All one is array of Object with 'Values'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenBuilderAllOneIsArrayOfObjectWithValues3() {
    // Arrange
    ImmutableSetMultimap.Builder<Object, Object> builderResult = ImmutableSetMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableSetMultimap<Object, Object> immutableSetMultimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    ImmutableSetMultimap.Builder<Object, Object> builderResult2 = ImmutableSetMultimap.builder();
    builderResult2.putAll(1, "Values");
    builderResult2.put("Key", "Value");

    ImmutableSetMultimap.Builder<Object, Object> expectedValuesPerKeyResult =
        builderResult2.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);

    Builder<Object, Object> builderResult3 = ImmutableListMultimap.builder();
    builderResult3.put(
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult3.put(immutableSetMultimap, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult2 = builderResult3.expectedValuesPerKey(42);

    Comparator<Object> keyComparator2 = mock(Comparator.class);
    when(keyComparator2.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult2
            .orderKeysBy(keyComparator2)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(keyComparator2).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given builder All one is empty array of {@link Object}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName(
      "Test toSetMultimap(); given builder All one is empty array of Object; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenBuilderAllOneIsEmptyArrayOfObject_thenReturnSizeIsTwo() {
    // Arrange
    ImmutableSetMultimap.Builder<Object, Object> builderResult = ImmutableSetMultimap.builder();
    builderResult.put("Key", "Value");

    ImmutableSetMultimap.Builder<Object, Object> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableSetMultimap<Object, Object> immutableSetMultimap =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    ImmutableSetMultimap.Builder<Object, Object> builderResult2 = ImmutableSetMultimap.builder();
    builderResult2.putAll(1);
    builderResult2.put("Key", "Value");

    Builder<Object, Object> builderResult3 = ImmutableListMultimap.builder();
    builderResult3.put(
        builderResult2
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult3.put(immutableSetMultimap, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult3.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(valueComparator, atLeast(1)).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given builder All one is empty array of {@link Object}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName(
      "Test toSetMultimap(); given builder All one is empty array of Object; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenBuilderAllOneIsEmptyArrayOfObject_thenReturnSizeIsTwo2() {
    // Arrange
    ImmutableSetMultimap.Builder<Object, Object> builderResult = ImmutableSetMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableSetMultimap<Object, Object> immutableSetMultimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    ImmutableSetMultimap.Builder<Object, Object> builderResult2 = ImmutableSetMultimap.builder();
    builderResult2.putAll(1);

    ImmutableSetMultimap.Builder<Object, Object> builderResult3 = ImmutableSetMultimap.builder();
    builderResult2.put(
        builderResult3
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");

    Builder<Object, Object> builderResult4 = ImmutableListMultimap.builder();
    builderResult4.put(
        builderResult2
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    builderResult4.put(immutableSetMultimap, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult4.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap(); given builder 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenBuilderKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    assertEquals(1, actualToSetMultimapResult.size());
    assertEquals(1, actualToSetMultimapResult.keys().size());
    assertEquals(1, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap(); given builder 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenBuilderKeyIsValue_thenReturnSizeIsOne2() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        orderKeysByResult.orderValuesBy(valueComparator).build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(valueComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(1, actualToSetMultimapResult.size());
    assertEquals(1, actualToSetMultimapResult.keys().size());
    assertEquals(1, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given builder one is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap(); given builder one is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenBuilderOneIsValue_thenReturnSizeIsTwo() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(1, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given builder one is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap(); given builder one is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenBuilderOneIsValue_thenReturnSizeIsTwo2() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(1, "Value");

    ImmutableSetMultimap.Builder<Object, Object> builderResult2 = ImmutableSetMultimap.builder();
    builderResult.put(
        builderResult2
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToSetMultimapResult.size());
    assertEquals(2, actualToSetMultimapResult.keys().size());
    assertEquals(2, actualToSetMultimapResult.entries().size());
    assertFalse(actualToSetMultimapResult.isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap(); given empty; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_givenEmpty_thenReturnSizeIsZero() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = emptyResult.toSetMultimap();

    // Assert
    assertEquals(0, actualToSetMultimapResult.size());
    assertTrue(actualToSetMultimapResult.isEmpty());
    assertTrue(actualToSetMultimapResult.keys().isEmpty());
    assertTrue(actualToSetMultimapResult.entries().isEmpty());
  }

  /**
   * Test {@link MapStream#toSetMultimap()}.
   *
   * <ul>
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toSetMultimap()}
   */
  @Test
  @DisplayName("Test toSetMultimap(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSetMultimap MapStream.toSetMultimap()"})
  void testToSetMultimap_thenReturnSizeIsZero() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    ImmutableSetMultimap<Object, Object> actualToSetMultimapResult = ofResult.toSetMultimap();

    // Assert
    assertEquals(0, actualToSetMultimapResult.size());
    assertTrue(actualToSetMultimapResult.isEmpty());
    assertTrue(actualToSetMultimapResult.keys().isEmpty());
    assertTrue(actualToSetMultimapResult.entries().isEmpty());
  }

  /**
   * Test {@link MapStream#forEach(BiConsumer)} with {@code BiConsumer}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#forEach(BiConsumer)}
   */
  @Test
  @DisplayName(
      "Test forEach(BiConsumer) with 'BiConsumer'; given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapStream.forEach(BiConsumer)"})
  void testForEachWithBiConsumer_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put(42, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BiConsumer<Object, Object> action = mock(BiConsumer.class);
    doNothing().when(action).accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    ofResult.forEach(action);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(action, atLeast(1)).accept(Mockito.<Object>any(), isA(Object.class));
  }

  /**
   * Test {@link MapStream#forEach(BiConsumer)} with {@code BiConsumer}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then calls {@link BiConsumer#accept(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#forEach(BiConsumer)}
   */
  @Test
  @DisplayName(
      "Test forEach(BiConsumer) with 'BiConsumer'; given builder 'Key' is 'Value'; then calls accept(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapStream.forEach(BiConsumer)"})
  void testForEachWithBiConsumer_givenBuilderKeyIsValue_thenCallsAccept() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BiConsumer<Object, Object> action = mock(BiConsumer.class);
    doNothing().when(action).accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    ofResult.forEach(action);

    // Assert
    verify(action).accept(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link MapStream#forEach(BiConsumer)} with {@code BiConsumer}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then calls {@link BiConsumer#accept(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#forEach(BiConsumer)}
   */
  @Test
  @DisplayName(
      "Test forEach(BiConsumer) with 'BiConsumer'; given HashMap() 'Key' is 'Value'; then calls accept(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapStream.forEach(BiConsumer)"})
  void testForEachWithBiConsumer_givenHashMapKeyIsValue_thenCallsAccept() {
    // Arrange
    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");
    MapStream<Object, Object> ofResult = MapStream.of(map);

    BiConsumer<Object, Object> action = mock(BiConsumer.class);
    doNothing().when(action).accept(Mockito.<Object>any(), Mockito.<Object>any());

    // Act
    ofResult.forEach(action);

    // Assert
    verify(action).accept(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link MapStream#forEach(Consumer)} with {@code Consumer}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#forEach(Consumer)}
   */
  @Test
  @DisplayName(
      "Test forEach(Consumer) with 'Consumer'; given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapStream.forEach(Consumer)"})
  void testForEachWithConsumer_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put(42, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Consumer<Entry<Object, Object>> action = mock(Consumer.class);
    doNothing().when(action).accept(Mockito.<Entry<Object, Object>>any());

    // Act
    ofResult.forEach(action);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(action, atLeast(1)).accept(Mockito.<Entry<Object, Object>>any());
  }

  /**
   * Test {@link MapStream#forEach(Consumer)} with {@code Consumer}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then calls {@link Consumer#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#forEach(Consumer)}
   */
  @Test
  @DisplayName(
      "Test forEach(Consumer) with 'Consumer'; given builder 'Key' is 'Value'; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapStream.forEach(Consumer)"})
  void testForEachWithConsumer_givenBuilderKeyIsValue_thenCallsAccept() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Consumer<Entry<Object, Object>> action = mock(Consumer.class);
    doNothing().when(action).accept(Mockito.<Entry<Object, Object>>any());

    // Act
    ofResult.forEach(action);

    // Assert
    verify(action).accept(isA(Entry.class));
  }

  /**
   * Test {@link MapStream#forEachOrdered(Consumer)}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#forEachOrdered(Consumer)}
   */
  @Test
  @DisplayName(
      "Test forEachOrdered(Consumer); given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapStream.forEachOrdered(Consumer)"})
  void testForEachOrdered_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put(42, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Consumer<Entry<Object, Object>> action = mock(Consumer.class);
    doNothing().when(action).accept(Mockito.<Entry<Object, Object>>any());

    // Act
    ofResult.forEachOrdered(action);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(action, atLeast(1)).accept(Mockito.<Entry<Object, Object>>any());
  }

  /**
   * Test {@link MapStream#forEachOrdered(Consumer)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then calls {@link Consumer#accept(Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#forEachOrdered(Consumer)}
   */
  @Test
  @DisplayName(
      "Test forEachOrdered(Consumer); given builder 'Key' is 'Value'; then calls accept(Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapStream.forEachOrdered(Consumer)"})
  void testForEachOrdered_givenBuilderKeyIsValue_thenCallsAccept() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Consumer<Entry<Object, Object>> action = mock(Consumer.class);
    doNothing().when(action).accept(Mockito.<Entry<Object, Object>>any());

    // Act
    ofResult.forEachOrdered(action);

    // Assert
    verify(action).accept(isA(Entry.class));
  }

  /**
   * Test {@link MapStream#toArray(IntFunction)} with {@code IntFunction}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toArray(IntFunction)}
   */
  @Test
  @DisplayName(
      "Test toArray(IntFunction) with 'IntFunction'; given builder 'Key' is 'Value'; then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] MapStream.toArray(IntFunction)"})
  void testToArrayWithIntFunction_givenBuilderKeyIsValue_thenReturnArrayLengthIsOne() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    IntFunction<Object[]> generator = mock(IntFunction.class);
    when(generator.apply(anyInt())).thenReturn(new Object[] {"Apply"});

    // Act
    Object[] actualToArrayResult = ofResult.toArray(generator);

    // Assert
    verify(generator).apply(1);
    assertEquals(1, actualToArrayResult.length);
  }

  /**
   * Test {@link MapStream#toArray(IntFunction)} with {@code IntFunction}.
   *
   * <ul>
   *   <li>Given empty array of {@link Object}.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toArray(IntFunction)}
   */
  @Test
  @DisplayName(
      "Test toArray(IntFunction) with 'IntFunction'; given empty array of Object; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] MapStream.toArray(IntFunction)"})
  void testToArrayWithIntFunction_givenEmptyArrayOfObject_thenReturnArrayLengthIsZero() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    IntFunction<Object[]> generator = mock(IntFunction.class);
    when(generator.apply(anyInt())).thenReturn(new Object[] {});

    // Act
    Object[] actualToArrayResult = ofResult.toArray(generator);

    // Assert
    verify(generator).apply(0);
    assertEquals(0, actualToArrayResult.length);
  }

  /**
   * Test {@link MapStream#toArray(IntFunction)} with {@code IntFunction}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toArray(IntFunction)}
   */
  @Test
  @DisplayName(
      "Test toArray(IntFunction) with 'IntFunction'; given empty; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] MapStream.toArray(IntFunction)"})
  void testToArrayWithIntFunction_givenEmpty_thenReturnArrayLengthIsZero() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    IntFunction<Object[]> generator = mock(IntFunction.class);
    when(generator.apply(anyInt())).thenReturn(new Object[] {});

    // Act
    Object[] actualToArrayResult = emptyResult.toArray(generator);

    // Assert
    verify(generator).apply(0);
    assertEquals(0, actualToArrayResult.length);
  }

  /**
   * Test {@link MapStream#toArray()}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then return array length is two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toArray()}
   */
  @Test
  @DisplayName(
      "Test toArray(); given builder forty-two is 'Value'; then return array length is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] MapStream.toArray()"})
  void testToArray_givenBuilderFortyTwoIsValue_thenReturnArrayLengthIsTwo() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    Object[] actualToArrayResult = ofResult.toArray();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2, actualToArrayResult.length);
  }

  /**
   * Test {@link MapStream#toArray()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given builder 'Key' is 'Value'; then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] MapStream.toArray()"})
  void testToArray_givenBuilderKeyIsValue_thenReturnArrayLengthIsOne() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertEquals(1, ofResult.toArray().length);
  }

  /**
   * Test {@link MapStream#toArray()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); given empty; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] MapStream.toArray()"})
  void testToArray_givenEmpty_thenReturnArrayLengthIsZero() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertEquals(0, emptyResult.toArray().length);
  }

  /**
   * Test {@link MapStream#toArray()}.
   *
   * <ul>
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#toArray()}
   */
  @Test
  @DisplayName("Test toArray(); then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object[] MapStream.toArray()"})
  void testToArray_thenReturnArrayLengthIsZero() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertEquals(0, ofResult.toArray().length);
  }

  /**
   * Test {@link MapStream#reduce(BinaryOperator)} with {@code BinaryOperator}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#reduce(BinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(BinaryOperator) with 'BinaryOperator'; given builder 'Key' is 'Value'; then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.reduce(BinaryOperator)"})
  void testReduceWithBinaryOperator_givenBuilderKeyIsValue_thenReturnPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.reduce(mock(BinaryOperator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#reduce(BinaryOperator)} with {@code BinaryOperator}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link BinaryOperator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#reduce(BinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(BinaryOperator) with 'BinaryOperator'; given empty; when BinaryOperator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.reduce(BinaryOperator)"})
  void testReduceWithBinaryOperator_givenEmpty_whenBinaryOperator_thenReturnNotPresent() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.reduce(mock(BinaryOperator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#reduce(BinaryOperator)} with {@code BinaryOperator}.
   *
   * <ul>
   *   <li>Then return {@link Optional#get()} is {@link AbstractMap.SimpleEntry#SimpleEntry(Object,
   *       Object)} with {@code Key} and {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#reduce(BinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(BinaryOperator) with 'BinaryOperator'; then return get() is SimpleEntry(Object, Object) with 'Key' and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.reduce(BinaryOperator)"})
  void testReduceWithBinaryOperator_thenReturnGetIsSimpleEntryWithKeyAndValue() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BinaryOperator<Entry<Object, Object>> accumulator = mock(BinaryOperator.class);
    SimpleEntry<Object, Object> simpleEntry = new SimpleEntry<>("Key", "Value");
    when(accumulator.apply(
            Mockito.<Entry<Object, Object>>any(), Mockito.<Entry<Object, Object>>any()))
        .thenReturn(simpleEntry);

    // Act
    Optional<Entry<Object, Object>> actualReduceResult = ofResult.reduce(accumulator);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(accumulator).apply(isA(Entry.class), isA(Entry.class));
    assertTrue(actualReduceResult.isPresent());
    assertSame(simpleEntry, actualReduceResult.get());
  }

  /**
   * Test {@link MapStream#reduce(BinaryOperator)} with {@code BinaryOperator}.
   *
   * <ul>
   *   <li>When {@link BinaryOperator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#reduce(BinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(BinaryOperator) with 'BinaryOperator'; when BinaryOperator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.reduce(BinaryOperator)"})
  void testReduceWithBinaryOperator_whenBinaryOperator_thenReturnNotPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertFalse(ofResult.reduce(mock(BinaryOperator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#reduce(Entry, BinaryOperator)} with {@code Entry}, {@code
   * BinaryOperator}.
   *
   * <p>Method under test: {@link MapStream#reduce(Entry, BinaryOperator)}
   */
  @Test
  @DisplayName("Test reduce(Entry, BinaryOperator) with 'Entry', 'BinaryOperator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry MapStream.reduce(Entry, BinaryOperator)"})
  void testReduceWithEntryBinaryOperator() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);
    SimpleEntry<Object, Object> identity = new SimpleEntry<>("Key", "Value");

    // Act
    Entry<Object, Object> actualReduceResult =
        ofResult.reduce(identity, mock(BinaryOperator.class));

    // Assert
    assertSame(identity, actualReduceResult);
  }

  /**
   * Test {@link MapStream#reduce(Entry, BinaryOperator)} with {@code Entry}, {@code
   * BinaryOperator}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then calls {@link BinaryOperator#apply(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#reduce(Entry, BinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(Entry, BinaryOperator) with 'Entry', 'BinaryOperator'; given builder 'Key' is 'Value'; then calls apply(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry MapStream.reduce(Entry, BinaryOperator)"})
  void testReduceWithEntryBinaryOperator_givenBuilderKeyIsValue_thenCallsApply() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);
    SimpleEntry<Object, Object> identity = new SimpleEntry<>("Key", "Value");

    BinaryOperator<Entry<Object, Object>> accumulator = mock(BinaryOperator.class);
    SimpleEntry<Object, Object> simpleEntry = new SimpleEntry<>("Key", "Value");
    when(accumulator.apply(
            Mockito.<Entry<Object, Object>>any(), Mockito.<Entry<Object, Object>>any()))
        .thenReturn(simpleEntry);

    // Act
    Entry<Object, Object> actualReduceResult = ofResult.reduce(identity, accumulator);

    // Assert
    verify(accumulator).apply(isA(Entry.class), isA(Entry.class));
    assertSame(simpleEntry, actualReduceResult);
  }

  /**
   * Test {@link MapStream#reduce(Entry, BinaryOperator)} with {@code Entry}, {@code
   * BinaryOperator}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link BinaryOperator}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#reduce(Entry, BinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(Entry, BinaryOperator) with 'Entry', 'BinaryOperator'; given empty; when BinaryOperator")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Entry MapStream.reduce(Entry, BinaryOperator)"})
  void testReduceWithEntryBinaryOperator_givenEmpty_whenBinaryOperator() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();
    SimpleEntry<Object, Object> identity = new SimpleEntry<>("Key", "Value");

    // Act
    Entry<Object, Object> actualReduceResult =
        emptyResult.reduce(identity, mock(BinaryOperator.class));

    // Assert
    assertSame(identity, actualReduceResult);
  }

  /**
   * Test {@link MapStream#reduce(Object, BiFunction, BinaryOperator)} with {@code Object}, {@code
   * BiFunction}, {@code BinaryOperator}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return {@code Identity}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#reduce(Object, BiFunction, BinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(Object, BiFunction, BinaryOperator) with 'Object', 'BiFunction', 'BinaryOperator'; given empty; then return 'Identity'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapStream.reduce(Object, BiFunction, BinaryOperator)"})
  void testReduceWithObjectBiFunctionBinaryOperator_givenEmpty_thenReturnIdentity() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertEquals(
        "Identity",
        emptyResult.reduce("Identity", mock(BiFunction.class), mock(BinaryOperator.class)));
  }

  /**
   * Test {@link MapStream#reduce(Object, BiFunction, BinaryOperator)} with {@code Object}, {@code
   * BiFunction}, {@code BinaryOperator}.
   *
   * <ul>
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#reduce(Object, BiFunction, BinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(Object, BiFunction, BinaryOperator) with 'Object', 'BiFunction', 'BinaryOperator'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapStream.reduce(Object, BiFunction, BinaryOperator)"})
  void testReduceWithObjectBiFunctionBinaryOperator_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put(42, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BiFunction<Object, Entry<Object, Object>, Object> accumulator = mock(BiFunction.class);
    when(accumulator.apply(Mockito.<Object>any(), Mockito.<Entry<Object, Object>>any()))
        .thenReturn("Apply");

    // Act
    Object actualReduceResult =
        ofResult.reduce("Identity", accumulator, mock(BinaryOperator.class));

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(accumulator, atLeast(1))
        .apply(Mockito.<Object>any(), Mockito.<Entry<Object, Object>>any());
    assertEquals("Apply", actualReduceResult);
  }

  /**
   * Test {@link MapStream#reduce(Object, BiFunction, BinaryOperator)} with {@code Object}, {@code
   * BiFunction}, {@code BinaryOperator}.
   *
   * <ul>
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#reduce(Object, BiFunction, BinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(Object, BiFunction, BinaryOperator) with 'Object', 'BiFunction', 'BinaryOperator'; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapStream.reduce(Object, BiFunction, BinaryOperator)"})
  void testReduceWithObjectBiFunctionBinaryOperator_thenReturnApply() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    BiFunction<Object, Entry<Object, Object>, Object> accumulator = mock(BiFunction.class);
    when(accumulator.apply(Mockito.<Object>any(), Mockito.<Entry<Object, Object>>any()))
        .thenReturn("Apply");

    // Act
    Object actualReduceResult =
        ofResult.reduce("Identity", accumulator, mock(BinaryOperator.class));

    // Assert
    verify(accumulator).apply(isA(Object.class), isA(Entry.class));
    assertEquals("Apply", actualReduceResult);
  }

  /**
   * Test {@link MapStream#reduce(Object, BiFunction, BinaryOperator)} with {@code Object}, {@code
   * BiFunction}, {@code BinaryOperator}.
   *
   * <ul>
   *   <li>When {@link BiFunction}.
   *   <li>Then return {@code Identity}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#reduce(Object, BiFunction, BinaryOperator)}
   */
  @Test
  @DisplayName(
      "Test reduce(Object, BiFunction, BinaryOperator) with 'Object', 'BiFunction', 'BinaryOperator'; when BiFunction; then return 'Identity'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapStream.reduce(Object, BiFunction, BinaryOperator)"})
  void testReduceWithObjectBiFunctionBinaryOperator_whenBiFunction_thenReturnIdentity() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertEquals(
        "Identity",
        ofResult.reduce("Identity", mock(BiFunction.class), mock(BinaryOperator.class)));
  }

  /**
   * Test {@link MapStream#findFirst()}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#findFirst()}
   */
  @Test
  @DisplayName(
      "Test findFirst(); given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.findFirst()"})
  void testFindFirst_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    Optional<Entry<Object, Object>> actualFindFirstResult = ofResult.findFirst();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualFindFirstResult.isPresent());
  }

  /**
   * Test {@link MapStream#findFirst()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#findFirst()}
   */
  @Test
  @DisplayName("Test findFirst(); given builder 'Key' is 'Value'; then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.findFirst()"})
  void testFindFirst_givenBuilderKeyIsValue_thenReturnPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.findFirst().isPresent());
  }

  /**
   * Test {@link MapStream#findFirst()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#findFirst()}
   */
  @Test
  @DisplayName("Test findFirst(); given empty; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.findFirst()"})
  void testFindFirst_givenEmpty_thenReturnNotPresent() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.findFirst().isPresent());
  }

  /**
   * Test {@link MapStream#findFirst()}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#findFirst()}
   */
  @Test
  @DisplayName("Test findFirst(); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.findFirst()"})
  void testFindFirst_thenReturnNotPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertFalse(ofResult.findFirst().isPresent());
  }

  /**
   * Test {@link MapStream#findAny()}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#findAny()}
   */
  @Test
  @DisplayName(
      "Test findAny(); given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.findAny()"})
  void testFindAny_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    Optional<Entry<Object, Object>> actualFindAnyResult = ofResult.findAny();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertTrue(actualFindAnyResult.isPresent());
  }

  /**
   * Test {@link MapStream#findAny()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#findAny()}
   */
  @Test
  @DisplayName("Test findAny(); given builder 'Key' is 'Value'; then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.findAny()"})
  void testFindAny_givenBuilderKeyIsValue_thenReturnPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.findAny().isPresent());
  }

  /**
   * Test {@link MapStream#findAny()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#findAny()}
   */
  @Test
  @DisplayName("Test findAny(); given empty; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.findAny()"})
  void testFindAny_givenEmpty_thenReturnNotPresent() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.findAny().isPresent());
  }

  /**
   * Test {@link MapStream#findAny()}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#findAny()}
   */
  @Test
  @DisplayName("Test findAny(); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.findAny()"})
  void testFindAny_thenReturnNotPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertFalse(ofResult.findAny().isPresent());
  }

  /**
   * Test {@link MapStream#iterator()}.
   *
   * <p>Method under test: {@link MapStream#iterator()}
   */
  @Test
  @DisplayName("Test iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Iterator MapStream.iterator()"})
  void testIterator() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.iterator().hasNext());
  }

  /**
   * Test {@link MapStream#spliterator()}.
   *
   * <p>Method under test: {@link MapStream#spliterator()}
   */
  @Test
  @DisplayName("Test spliterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Spliterator MapStream.spliterator()"})
  void testSpliterator() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertEquals(0L, emptyResult.spliterator().getExactSizeIfKnown());
  }

  /**
   * Test {@link MapStream#isParallel()}.
   *
   * <p>Method under test: {@link MapStream#isParallel()}
   */
  @Test
  @DisplayName("Test isParallel()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MapStream.isParallel()"})
  void testIsParallel() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.isParallel());
  }

  /**
   * Test {@link MapStream#collect(Supplier, BiConsumer, BiConsumer)} with {@code supplier}, {@code
   * accumulator}, {@code combiner}.
   *
   * <p>Method under test: {@link MapStream#collect(Supplier, BiConsumer, BiConsumer)}
   */
  @Test
  @DisplayName(
      "Test collect(Supplier, BiConsumer, BiConsumer) with 'supplier', 'accumulator', 'combiner'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapStream.collect(Supplier, BiConsumer, BiConsumer)"})
  void testCollectWithSupplierAccumulatorCombiner() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Supplier<Object> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn("Get");

    // Act
    Object actualCollectResult =
        ofResult.collect(supplier, mock(BiConsumer.class), mock(BiConsumer.class));

    // Assert
    verify(supplier).get();
    assertEquals("Get", actualCollectResult);
  }

  /**
   * Test {@link MapStream#collect(Supplier, BiConsumer, BiConsumer)} with {@code supplier}, {@code
   * accumulator}, {@code combiner}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Supplier} {@link Supplier#get()} return {@code Get}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#collect(Supplier, BiConsumer, BiConsumer)}
   */
  @Test
  @DisplayName(
      "Test collect(Supplier, BiConsumer, BiConsumer) with 'supplier', 'accumulator', 'combiner'; given empty; when Supplier get() return 'Get'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapStream.collect(Supplier, BiConsumer, BiConsumer)"})
  void testCollectWithSupplierAccumulatorCombiner_givenEmpty_whenSupplierGetReturnGet() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    Supplier<Object> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn("Get");

    // Act
    Object actualCollectResult =
        emptyResult.collect(supplier, mock(BiConsumer.class), mock(BiConsumer.class));

    // Assert
    verify(supplier).get();
    assertEquals("Get", actualCollectResult);
  }

  /**
   * Test {@link MapStream#collect(Supplier, BiConsumer, BiConsumer)} with {@code supplier}, {@code
   * accumulator}, {@code combiner}.
   *
   * <ul>
   *   <li>Then calls {@link BiConsumer#accept(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#collect(Supplier, BiConsumer, BiConsumer)}
   */
  @Test
  @DisplayName(
      "Test collect(Supplier, BiConsumer, BiConsumer) with 'supplier', 'accumulator', 'combiner'; then calls accept(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapStream.collect(Supplier, BiConsumer, BiConsumer)"})
  void testCollectWithSupplierAccumulatorCombiner_thenCallsAccept() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Supplier<Object> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn("Get");

    BiConsumer<Object, Entry<Object, Object>> accumulator = mock(BiConsumer.class);
    doNothing()
        .when(accumulator)
        .accept(Mockito.<Object>any(), Mockito.<Entry<Object, Object>>any());

    // Act
    Object actualCollectResult = ofResult.collect(supplier, accumulator, mock(BiConsumer.class));

    // Assert
    verify(accumulator).accept(isA(Object.class), isA(Entry.class));
    verify(supplier).get();
    assertEquals("Get", actualCollectResult);
  }

  /**
   * Test {@link MapStream#collect(Supplier, BiConsumer, BiConsumer)} with {@code supplier}, {@code
   * accumulator}, {@code combiner}.
   *
   * <ul>
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#collect(Supplier, BiConsumer, BiConsumer)}
   */
  @Test
  @DisplayName(
      "Test collect(Supplier, BiConsumer, BiConsumer) with 'supplier', 'accumulator', 'combiner'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MapStream.collect(Supplier, BiConsumer, BiConsumer)"})
  void testCollectWithSupplierAccumulatorCombiner_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put(42, "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Supplier<Object> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn("Get");

    BiConsumer<Object, Entry<Object, Object>> accumulator = mock(BiConsumer.class);
    doNothing()
        .when(accumulator)
        .accept(Mockito.<Object>any(), Mockito.<Entry<Object, Object>>any());

    // Act
    Object actualCollectResult = ofResult.collect(supplier, accumulator, mock(BiConsumer.class));

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(accumulator, atLeast(1)).accept(isA(Object.class), Mockito.<Entry<Object, Object>>any());
    verify(supplier).get();
    assertEquals("Get", actualCollectResult);
  }

  /**
   * Test {@link MapStream#min(Comparator)}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#min(Comparator)}
   */
  @Test
  @DisplayName(
      "Test min(Comparator); given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.min(Comparator)"})
  void testMin_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Comparator<Entry<Object, Object>> comparator = mock(Comparator.class);
    when(comparator.compare(
            Mockito.<Entry<Object, Object>>any(), Mockito.<Entry<Object, Object>>any()))
        .thenReturn(1);

    // Act
    Optional<Entry<Object, Object>> actualMinResult = ofResult.min(comparator);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(comparator).compare(isA(Entry.class), isA(Entry.class));
    assertTrue(actualMinResult.isPresent());
  }

  /**
   * Test {@link MapStream#min(Comparator)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>When {@link Comparator}.
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#min(Comparator)}
   */
  @Test
  @DisplayName(
      "Test min(Comparator); given builder 'Key' is 'Value'; when Comparator; then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.min(Comparator)"})
  void testMin_givenBuilderKeyIsValue_whenComparator_thenReturnPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.min(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#min(Comparator)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Comparator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#min(Comparator)}
   */
  @Test
  @DisplayName("Test min(Comparator); given empty; when Comparator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.min(Comparator)"})
  void testMin_givenEmpty_whenComparator_thenReturnNotPresent() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.min(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#min(Comparator)}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#min(Comparator)}
   */
  @Test
  @DisplayName("Test min(Comparator); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.min(Comparator)"})
  void testMin_thenReturnNotPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertFalse(ofResult.min(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#max(Comparator)}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#max(Comparator)}
   */
  @Test
  @DisplayName(
      "Test max(Comparator); given builder forty-two is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.max(Comparator)"})
  void testMax_givenBuilderFortyTwoIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    Comparator<Entry<Object, Object>> comparator = mock(Comparator.class);
    when(comparator.compare(
            Mockito.<Entry<Object, Object>>any(), Mockito.<Entry<Object, Object>>any()))
        .thenReturn(1);

    // Act
    Optional<Entry<Object, Object>> actualMaxResult = ofResult.max(comparator);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    verify(comparator).compare(isA(Entry.class), isA(Entry.class));
    assertTrue(actualMaxResult.isPresent());
  }

  /**
   * Test {@link MapStream#max(Comparator)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>When {@link Comparator}.
   *   <li>Then return Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#max(Comparator)}
   */
  @Test
  @DisplayName(
      "Test max(Comparator); given builder 'Key' is 'Value'; when Comparator; then return Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.max(Comparator)"})
  void testMax_givenBuilderKeyIsValue_whenComparator_thenReturnPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertTrue(ofResult.max(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#max(Comparator)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link Comparator}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#max(Comparator)}
   */
  @Test
  @DisplayName("Test max(Comparator); given empty; when Comparator; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.max(Comparator)"})
  void testMax_givenEmpty_whenComparator_thenReturnNotPresent() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertFalse(emptyResult.max(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#max(Comparator)}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#max(Comparator)}
   */
  @Test
  @DisplayName("Test max(Comparator); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MapStream.max(Comparator)"})
  void testMax_thenReturnNotPresent() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertFalse(ofResult.max(mock(Comparator.class)).isPresent());
  }

  /**
   * Test {@link MapStream#count()}.
   *
   * <ul>
   *   <li>Given builder forty-two is {@code Value}.
   *   <li>Then return two.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#count()}
   */
  @Test
  @DisplayName("Test count(); given builder forty-two is 'Value'; then return two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapStream.count()"})
  void testCount_givenBuilderFortyTwoIsValue_thenReturnTwo() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(42, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> multimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act
    long actualCountResult = ofResult.count();

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(2L, actualCountResult);
  }

  /**
   * Test {@link MapStream#count()}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#count()}
   */
  @Test
  @DisplayName("Test count(); given builder 'Key' is 'Value'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapStream.count()"})
  void testCount_givenBuilderKeyIsValue_thenReturnOne() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertEquals(1L, ofResult.count());
  }

  /**
   * Test {@link MapStream#count()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#count()}
   */
  @Test
  @DisplayName("Test count(); given empty; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapStream.count()"})
  void testCount_givenEmpty_thenReturnZero() {
    // Arrange
    MapStream<Object, Object> emptyResult = MapStream.empty();

    // Act and Assert
    assertEquals(0L, emptyResult.count());
  }

  /**
   * Test {@link MapStream#count()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link MapStream#count()}
   */
  @Test
  @DisplayName("Test count(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"long MapStream.count()"})
  void testCount_thenReturnZero() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<Object, Object> multimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();
    MapStream<Object, Object> ofResult = MapStream.of(multimap);

    // Act and Assert
    assertEquals(0L, ofResult.count());
  }
}
