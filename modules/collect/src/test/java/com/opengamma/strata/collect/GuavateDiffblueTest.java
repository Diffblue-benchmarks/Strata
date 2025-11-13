package com.opengamma.strata.collect;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableListMultimap.Builder;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.ListMultimap;
import com.opengamma.strata.collect.Guavate.CallerClassSecurityManager;
import com.opengamma.strata.collect.Guavate.OnlyCollector;
import com.opengamma.strata.collect.tuple.ObjIntPair;
import com.opengamma.strata.collect.tuple.Pair;
import java.security.AccessControlContext;
import java.time.Duration;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GuavateDiffblueTest {
  /**
   * Test CallerClassSecurityManager new {@link CallerClassSecurityManager} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link
   * CallerClassSecurityManager}
   */
  @Test
  @DisplayName(
      "Test CallerClassSecurityManager new CallerClassSecurityManager (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CallerClassSecurityManager.<init>()"})
  void testCallerClassSecurityManagerNewCallerClassSecurityManager() {
    // Arrange, Act and Assert
    Object securityContext = new CallerClassSecurityManager().getSecurityContext();
    assertTrue(securityContext instanceof AccessControlContext);
    assertNull(((AccessControlContext) securityContext).getDomainCombiner());
  }

  /**
   * Test {@link Guavate#concatToList(Iterable[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is five.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToList(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToList(Iterable[]); given '42'; when ArrayList() add '42'; then return size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatToList(Iterable[])"})
  void testConcatToList_given42_whenArrayListAdd42_thenReturnSizeIsFive() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    ImmutableList<Object> actualConcatToListResult = Guavate.concatToList(objectList);

    // Assert
    assertEquals(5, actualConcatToListResult.size());
    assertEquals("42", actualConcatToListResult.get(2));
    assertEquals("42", actualConcatToListResult.get(3));
    assertEquals("42", actualConcatToListResult.get(4));
  }

  /**
   * Test {@link Guavate#concatToList(Iterable[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToList(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToList(Iterable[]); given '42'; when ArrayList() add '42'; then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatToList(Iterable[])"})
  void testConcatToList_given42_whenArrayListAdd42_thenReturnSizeIsFour() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    ImmutableList<Object> actualConcatToListResult = Guavate.concatToList(objectList);

    // Assert
    assertEquals(4, actualConcatToListResult.size());
    assertEquals("42", actualConcatToListResult.get(2));
    assertEquals("42", actualConcatToListResult.get(3));
  }

  /**
   * Test {@link Guavate#concatToList(Iterable[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToList(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToList(Iterable[]); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatToList(Iterable[])"})
  void testConcatToList_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act
    ImmutableList<Object> actualConcatToListResult = Guavate.concatToList(objectList);

    // Assert
    assertEquals(1, actualConcatToListResult.size());
    assertEquals("42", actualConcatToListResult.get(0));
  }

  /**
   * Test {@link Guavate#concatToList(Iterable[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToList(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToList(Iterable[]); given '42'; when ArrayList() add '42'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatToList(Iterable[])"})
  void testConcatToList_given42_whenArrayListAdd42_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    ImmutableList<Object> actualConcatToListResult = Guavate.concatToList(objectList);

    // Assert
    assertEquals(2, actualConcatToListResult.size());
    assertEquals("42", actualConcatToListResult.get(0));
    assertEquals("42", actualConcatToListResult.get(1));
  }

  /**
   * Test {@link Guavate#concatToList(Iterable[])}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToList(Iterable[])}
   */
  @Test
  @DisplayName("Test concatToList(Iterable[]); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatToList(Iterable[])"})
  void testConcatToList_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    ImmutableList<Object> actualConcatToListResult = Guavate.concatToList(new ArrayList<>());

    // Assert
    assertTrue(actualConcatToListResult.isEmpty());
  }

  /**
   * Test {@link Guavate#concatItemsToList(Iterable, Object[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return first is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatItemsToList(Iterable, Object[])}
   */
  @Test
  @DisplayName(
      "Test concatItemsToList(Iterable, Object[]); given '42'; when ArrayList() add '42'; then return first is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatItemsToList(Iterable, Object[])"})
  void testConcatItemsToList_given42_whenArrayListAdd42_thenReturnFirstIs42() {
    // Arrange
    ArrayList<Object> baseList = new ArrayList<>();
    baseList.add("42");

    // Act
    ImmutableList<Object> actualConcatItemsToListResult =
        Guavate.concatItemsToList(baseList, "Additional Items");

    // Assert
    assertEquals(2, actualConcatItemsToListResult.size());
    assertEquals("42", actualConcatItemsToListResult.get(0));
    assertEquals("Additional Items", actualConcatItemsToListResult.get(1));
  }

  /**
   * Test {@link Guavate#concatItemsToList(Iterable, Object[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is five.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatItemsToList(Iterable, Object[])}
   */
  @Test
  @DisplayName(
      "Test concatItemsToList(Iterable, Object[]); given '42'; when ArrayList() add '42'; then return size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatItemsToList(Iterable, Object[])"})
  void testConcatItemsToList_given42_whenArrayListAdd42_thenReturnSizeIsFive() {
    // Arrange
    ArrayList<Object> baseList = new ArrayList<>();
    baseList.add("42");
    baseList.add("42");

    // Act
    ImmutableList<Object> actualConcatItemsToListResult =
        Guavate.concatItemsToList(
            baseList, "Additional Items", "Additional Items", "Additional Items");

    // Assert
    assertEquals(5, actualConcatItemsToListResult.size());
    assertEquals("42", actualConcatItemsToListResult.get(1));
    assertEquals("Additional Items", actualConcatItemsToListResult.get(2));
    assertEquals("Additional Items", actualConcatItemsToListResult.get(3));
    assertEquals("Additional Items", actualConcatItemsToListResult.get(4));
  }

  /**
   * Test {@link Guavate#concatItemsToList(Iterable, Object[])}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} iterator.
   *   <li>Then calls {@link Iterable#iterator()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatItemsToList(Iterable, Object[])}
   */
  @Test
  @DisplayName(
      "Test concatItemsToList(Iterable, Object[]); given ArrayList() iterator; then calls iterator()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatItemsToList(Iterable, Object[])"})
  void testConcatItemsToList_givenArrayListIterator_thenCallsIterator() {
    // Arrange
    Iterable<Object> baseList = mock(Iterable.class);

    ArrayList<Object> objectList = new ArrayList<>();
    when(baseList.iterator()).thenReturn(objectList.iterator());

    // Act
    ImmutableList<Object> actualConcatItemsToListResult =
        Guavate.concatItemsToList(baseList, "Additional Items");

    // Assert
    verify(baseList).iterator();
    assertEquals(1, actualConcatItemsToListResult.size());
    assertEquals("Additional Items", actualConcatItemsToListResult.get(0));
  }

  /**
   * Test {@link Guavate#concatItemsToList(Iterable, Object[])}.
   *
   * <ul>
   *   <li>When {@code Additional Items} and {@code Additional Items}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatItemsToList(Iterable, Object[])}
   */
  @Test
  @DisplayName(
      "Test concatItemsToList(Iterable, Object[]); when 'Additional Items' and 'Additional Items'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatItemsToList(Iterable, Object[])"})
  void testConcatItemsToList_whenAdditionalItemsAndAdditionalItems_thenReturnSizeIsTwo() {
    // Arrange and Act
    ImmutableList<Object> actualConcatItemsToListResult =
        Guavate.concatItemsToList(new ArrayList<>(), "Additional Items", "Additional Items");

    // Assert
    assertEquals(2, actualConcatItemsToListResult.size());
    assertEquals("Additional Items", actualConcatItemsToListResult.get(0));
    assertEquals("Additional Items", actualConcatItemsToListResult.get(1));
  }

  /**
   * Test {@link Guavate#concatItemsToList(Iterable, Object[])}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatItemsToList(Iterable, Object[])}
   */
  @Test
  @DisplayName(
      "Test concatItemsToList(Iterable, Object[]); when ArrayList(); then return ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatItemsToList(Iterable, Object[])"})
  void testConcatItemsToList_whenArrayList_thenReturnArrayList() {
    // Arrange
    ArrayList<Object> baseList = new ArrayList<>();

    // Act
    ImmutableList<Object> actualConcatItemsToListResult = Guavate.concatItemsToList(baseList);

    // Assert
    assertEquals(baseList, actualConcatItemsToListResult);
  }

  /**
   * Test {@link Guavate#concatItemsToList(Iterable, Object[])}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatItemsToList(Iterable, Object[])}
   */
  @Test
  @DisplayName(
      "Test concatItemsToList(Iterable, Object[]); when ArrayList(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatItemsToList(Iterable, Object[])"})
  void testConcatItemsToList_whenArrayList_thenReturnSizeIsOne() {
    // Arrange and Act
    ImmutableList<Object> actualConcatItemsToListResult =
        Guavate.concatItemsToList(new ArrayList<>(), "Additional Items");

    // Assert
    assertEquals(1, actualConcatItemsToListResult.size());
    assertEquals("Additional Items", actualConcatItemsToListResult.get(0));
  }

  /**
   * Test {@link Guavate#concatItemsToList(Iterable, Object[])}.
   *
   * <ul>
   *   <li>When one thousand.
   *   <li>Then return first intValue is one thousand.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatItemsToList(Iterable, Object[])}
   */
  @Test
  @DisplayName(
      "Test concatItemsToList(Iterable, Object[]); when one thousand; then return first intValue is one thousand")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.concatItemsToList(Iterable, Object[])"})
  void testConcatItemsToList_whenOneThousand_thenReturnFirstIntValueIsOneThousand() {
    // Arrange
    ConcurrentHashMultiset<Object> baseList = ConcurrentHashMultiset.create();

    // Act
    ImmutableList<Object> actualConcatItemsToListResult = Guavate.concatItemsToList(baseList, 1000);

    // Assert
    assertEquals(1, actualConcatItemsToListResult.size());
    assertEquals(1000, ((Integer) actualConcatItemsToListResult.get(0)).intValue());
  }

  /**
   * Test {@link Guavate#concatToSet(Iterable[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToSet(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToSet(Iterable[]); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.concatToSet(Iterable[])"})
  void testConcatToSet_given42_whenArrayListAdd42_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");

    // Act
    ImmutableSet<Object> actualConcatToSetResult = Guavate.concatToSet(objectList);

    // Assert
    assertEquals(1, actualConcatToSetResult.size());
  }

  /**
   * Test {@link Guavate#concatToSet(Iterable[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToSet(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToSet(Iterable[]); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.concatToSet(Iterable[])"})
  void testConcatToSet_given42_whenArrayListAdd42_thenReturnSizeIsOne2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");

    // Act
    ImmutableSet<Object> actualConcatToSetResult = Guavate.concatToSet(objectList);

    // Assert
    assertEquals(1, actualConcatToSetResult.size());
  }

  /**
   * Test {@link Guavate#concatToSet(Iterable[])}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToSet(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToSet(Iterable[]); given '42'; when ArrayList() add '42'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.concatToSet(Iterable[])"})
  void testConcatToSet_given42_whenArrayListAdd42_thenReturnSizeIsOne3() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add("42");
    objectList.add("42");
    objectList.add("42");

    // Act
    ImmutableSet<Object> actualConcatToSetResult = Guavate.concatToSet(objectList);

    // Assert
    assertEquals(1, actualConcatToSetResult.size());
  }

  /**
   * Test {@link Guavate#concatToSet(Iterable[])}.
   *
   * <ul>
   *   <li>Given forty-two.
   *   <li>When {@link ArrayList#ArrayList()} add forty-two.
   *   <li>Then return size is five.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToSet(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToSet(Iterable[]); given forty-two; when ArrayList() add forty-two; then return size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.concatToSet(Iterable[])"})
  void testConcatToSet_givenFortyTwo_whenArrayListAddFortyTwo_thenReturnSizeIsFive() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(42);
    objectList.add(2);
    objectList.add(-1);
    objectList.add(0);
    objectList.add("42");

    // Act
    ImmutableSet<Object> actualConcatToSetResult = Guavate.concatToSet(objectList);

    // Assert
    assertEquals(5, actualConcatToSetResult.size());
  }

  /**
   * Test {@link Guavate#concatToSet(Iterable[])}.
   *
   * <ul>
   *   <li>Given minus one.
   *   <li>When {@link ArrayList#ArrayList()} add minus one.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToSet(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToSet(Iterable[]); given minus one; when ArrayList() add minus one; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.concatToSet(Iterable[])"})
  void testConcatToSet_givenMinusOne_whenArrayListAddMinusOne_thenReturnSizeIsThree() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(-1);
    objectList.add(0);
    objectList.add("42");

    // Act
    ImmutableSet<Object> actualConcatToSetResult = Guavate.concatToSet(objectList);

    // Assert
    assertEquals(3, actualConcatToSetResult.size());
  }

  /**
   * Test {@link Guavate#concatToSet(Iterable[])}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When {@link ArrayList#ArrayList()} add one.
   *   <li>Then return size is six.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToSet(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToSet(Iterable[]); given one; when ArrayList() add one; then return size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.concatToSet(Iterable[])"})
  void testConcatToSet_givenOne_whenArrayListAddOne_thenReturnSizeIsSix() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(1);
    objectList.add(42);
    objectList.add(2);
    objectList.add(-1);
    objectList.add(0);
    objectList.add("42");

    // Act
    ImmutableSet<Object> actualConcatToSetResult = Guavate.concatToSet(objectList);

    // Assert
    assertEquals(6, actualConcatToSetResult.size());
  }

  /**
   * Test {@link Guavate#concatToSet(Iterable[])}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link ArrayList#ArrayList()} add two.
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToSet(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToSet(Iterable[]); given two; when ArrayList() add two; then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.concatToSet(Iterable[])"})
  void testConcatToSet_givenTwo_whenArrayListAddTwo_thenReturnSizeIsFour() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(2);
    objectList.add(-1);
    objectList.add(0);
    objectList.add("42");

    // Act
    ImmutableSet<Object> actualConcatToSetResult = Guavate.concatToSet(objectList);

    // Assert
    assertEquals(4, actualConcatToSetResult.size());
  }

  /**
   * Test {@link Guavate#concatToSet(Iterable[])}.
   *
   * <ul>
   *   <li>Given two.
   *   <li>When {@link ArrayList#ArrayList()} add two.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToSet(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToSet(Iterable[]); given two; when ArrayList() add two; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.concatToSet(Iterable[])"})
  void testConcatToSet_givenTwo_whenArrayListAddTwo_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(2);
    objectList.add("42");

    // Act
    ImmutableSet<Object> actualConcatToSetResult = Guavate.concatToSet(objectList);

    // Assert
    assertEquals(2, actualConcatToSetResult.size());
  }

  /**
   * Test {@link Guavate#concatToSet(Iterable[])}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link ArrayList#ArrayList()} add zero.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToSet(Iterable[])}
   */
  @Test
  @DisplayName(
      "Test concatToSet(Iterable[]); given zero; when ArrayList() add zero; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.concatToSet(Iterable[])"})
  void testConcatToSet_givenZero_whenArrayListAddZero_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    objectList.add(0);
    objectList.add("42");

    // Act
    ImmutableSet<Object> actualConcatToSetResult = Guavate.concatToSet(objectList);

    // Assert
    assertEquals(2, actualConcatToSetResult.size());
  }

  /**
   * Test {@link Guavate#concatToSet(Iterable[])}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#concatToSet(Iterable[])}
   */
  @Test
  @DisplayName("Test concatToSet(Iterable[]); when ArrayList(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.concatToSet(Iterable[])"})
  void testConcatToSet_whenArrayList_thenReturnEmpty() {
    // Arrange and Act
    ImmutableSet<Object> actualConcatToSetResult = Guavate.concatToSet(new ArrayList<>());

    // Assert
    assertTrue(actualConcatToSetResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map, BiFunction)} with {@code first}, {@code second},
   * {@code mergeFn}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map, BiFunction) with 'first', 'second', 'mergeFn'; given 'Apply'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map, BiFunction)"})
  void testCombineMapsWithFirstSecondMergeFn_givenApply_thenReturnSizeIsOne() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("Key", "Value");

    HashMap<Object, Object> second = new HashMap<>();
    second.put("Key", "Value");

    BiFunction<Object, Object, Object> mergeFn = mock(BiFunction.class);
    when(mergeFn.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, second, mergeFn);

    // Assert
    verify(mergeFn).apply(isA(Object.class), isA(Object.class));
    assertEquals(1, actualCombineMapsResult.size());
    assertEquals("Apply", actualCombineMapsResult.get("Key"));
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map, BiFunction)} with {@code first}, {@code second},
   * {@code mergeFn}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map, BiFunction) with 'first', 'second', 'mergeFn'; given 'Key'; when HashMap(); then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map, BiFunction)"})
  void testCombineMapsWithFirstSecondMergeFn_givenKey_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, new HashMap<>(), mock(BiFunction.class));

    // Assert
    assertEquals(first, actualCombineMapsResult);
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map, BiFunction)} with {@code first}, {@code second},
   * {@code mergeFn}.
   *
   * <ul>
   *   <li>Given of.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map, BiFunction) with 'first', 'second', 'mergeFn'; given of; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map, BiFunction)"})
  void testCombineMapsWithFirstSecondMergeFn_givenOf_thenReturnSizeIsTwo() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    first.put(ofResult, "Value");

    HashMap<Object, Object> second = new HashMap<>();
    second.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, second, mock(BiFunction.class));

    // Assert
    assertEquals(2, actualCombineMapsResult.size());
    assertEquals("Value", actualCombineMapsResult.get("Key"));
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map, BiFunction)} with {@code first}, {@code second},
   * {@code mergeFn}.
   *
   * <ul>
   *   <li>Given of.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map, BiFunction) with 'first', 'second', 'mergeFn'; given of; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map, BiFunction)"})
  void testCombineMapsWithFirstSecondMergeFn_givenOf_thenReturnSizeIsTwo2() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("Key", "Value");

    HashMap<Object, Object> second = new HashMap<>();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    second.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, second, mock(BiFunction.class));

    // Assert
    assertEquals(2, actualCombineMapsResult.size());
    assertEquals("Value", actualCombineMapsResult.get("Key"));
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map, BiFunction)} with {@code first}, {@code second},
   * {@code mergeFn}.
   *
   * <ul>
   *   <li>Given of.
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map, BiFunction) with 'first', 'second', 'mergeFn'; given of; when HashMap(); then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map, BiFunction)"})
  void testCombineMapsWithFirstSecondMergeFn_givenOf_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    first.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, new HashMap<>(), mock(BiFunction.class));

    // Assert
    assertEquals(first, actualCombineMapsResult);
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map, BiFunction)} with {@code first}, {@code second},
   * {@code mergeFn}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>Then return one is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map, BiFunction) with 'first', 'second', 'mergeFn'; given one; then return one is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map, BiFunction)"})
  void testCombineMapsWithFirstSecondMergeFn_givenOne_thenReturnOneIsValue() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put(1, "Value");

    HashMap<Object, Object> second = new HashMap<>();
    second.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, second, mock(BiFunction.class));

    // Assert
    assertEquals(2, actualCombineMapsResult.size());
    assertEquals("Value", actualCombineMapsResult.get("Key"));
    assertEquals("Value", actualCombineMapsResult.get(1));
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map, BiFunction)} with {@code first}, {@code second},
   * {@code mergeFn}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map, BiFunction) with 'first', 'second', 'mergeFn'; given zero; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map, BiFunction)"})
  void testCombineMapsWithFirstSecondMergeFn_givenZero_thenReturnSizeIsThree() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("Key", "Value");
    first.put(0, "Value");

    HashMap<Object, Object> second = new HashMap<>();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    second.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, second, mock(BiFunction.class));

    // Assert
    assertEquals(3, actualCombineMapsResult.size());
    assertEquals("Value", actualCombineMapsResult.get("Key"));
    assertEquals("Value", actualCombineMapsResult.get(0));
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map, BiFunction)} with {@code first}, {@code second},
   * {@code mergeFn}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return zero is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map, BiFunction) with 'first', 'second', 'mergeFn'; given zero; then return zero is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map, BiFunction)"})
  void testCombineMapsWithFirstSecondMergeFn_givenZero_thenReturnZeroIsValue() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put(0, "Value");

    HashMap<Object, Object> second = new HashMap<>();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    second.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, second, mock(BiFunction.class));

    // Assert
    assertEquals(2, actualCombineMapsResult.size());
    assertEquals("Value", actualCombineMapsResult.get(0));
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map, BiFunction)} with {@code first}, {@code second},
   * {@code mergeFn}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map, BiFunction) with 'first', 'second', 'mergeFn'; when HashMap(); then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map, BiFunction)"})
  void testCombineMapsWithFirstSecondMergeFn_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, new HashMap<>(), mock(BiFunction.class));

    // Assert
    assertEquals(first, actualCombineMapsResult);
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code Value}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map) with 'first', 'second'; given '42'; when HashMap() '42' is 'Value'; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map)"})
  void testCombineMapsWithFirstSecond_given42_whenHashMap42IsValue_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("42", "Value");
    first.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsResult);
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code foo} is {@code Value}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map) with 'first', 'second'; given 'foo'; when HashMap() 'foo' is 'Value'; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map)"})
  void testCombineMapsWithFirstSecond_givenFoo_whenHashMapFooIsValue_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("foo", "Value");
    first.put(-1, "Value");
    first.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsResult);
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link HashMap#HashMap()} {@code foo} is {@code Value}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map) with 'first', 'second'; given 'foo'; when HashMap() 'foo' is 'Value'; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map)"})
  void testCombineMapsWithFirstSecond_givenFoo_whenHashMapFooIsValue_thenReturnHashMap2() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("42", "Value");
    first.put("foo", "Value");
    first.put(-1, "Value");
    first.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsResult);
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given forty-two.
   *   <li>When {@link HashMap#HashMap()} forty-two is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map) with 'first', 'second'; given forty-two; when HashMap() forty-two is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map)"})
  void testCombineMapsWithFirstSecond_givenFortyTwo_whenHashMapFortyTwoIsValue() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put(42, "Value");
    first.put("42", "Value");
    first.put("foo", "Value");
    first.put(-1, "Value");
    first.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsResult);
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map) with 'first', 'second'; given 'Key'; when HashMap(); then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map)"})
  void testCombineMapsWithFirstSecond_givenKey_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsResult);
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given minus one.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map) with 'first', 'second'; given minus one; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map)"})
  void testCombineMapsWithFirstSecond_givenMinusOne_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put(-1, "Value");
    first.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsResult);
  }

  /**
   * Test {@link Guavate#combineMaps(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMaps(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMaps(Map, Map) with 'first', 'second'; when HashMap(); then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMaps(Map, Map)"})
  void testCombineMapsWithFirstSecond_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();

    // Act
    ImmutableMap<Object, Object> actualCombineMapsResult =
        Guavate.combineMaps(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Entry[])} with {@code baseMap}, {@code
   * additionalEntries}.
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map.Entry[])}
   */
  @Test
  @DisplayName("Test combineMapsOverwriting(Map, Entry[]) with 'baseMap', 'additionalEntries'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map.Entry[])"})
  void testCombineMapsOverwritingWithBaseMapAdditionalEntries() {
    // Arrange
    HashMap<Object, Object> baseMap = new HashMap<>();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    baseMap.put(ofResult, "Value");
    ImmutableSortedMap<String, Object> ofResult2 = ImmutableSortedMap.of();

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(baseMap, new SimpleEntry<>(ofResult2, "Value"));

    // Assert
    assertEquals(baseMap, actualCombineMapsOverwritingResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Entry[])} with {@code baseMap}, {@code
   * additionalEntries}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map.Entry[])}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Entry[]) with 'baseMap', 'additionalEntries'; given 'Key'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map.Entry[])"})
  void testCombineMapsOverwritingWithBaseMapAdditionalEntries_givenKey() {
    // Arrange
    HashMap<Object, Object> baseMap = new HashMap<>();
    baseMap.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(baseMap, new SimpleEntry<>("Key", "Value"));

    // Assert
    assertEquals(baseMap, actualCombineMapsOverwritingResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Entry[])} with {@code baseMap}, {@code
   * additionalEntries}.
   *
   * <ul>
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map.Entry[])}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Entry[]) with 'baseMap', 'additionalEntries'; then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map.Entry[])"})
  void testCombineMapsOverwritingWithBaseMapAdditionalEntries_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> baseMap = new HashMap<>();

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(baseMap);

    // Assert
    assertEquals(baseMap, actualCombineMapsOverwritingResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Entry[])} with {@code baseMap}, {@code
   * additionalEntries}.
   *
   * <ul>
   *   <li>Then return minus one is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map.Entry[])}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Entry[]) with 'baseMap', 'additionalEntries'; then return minus one is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map.Entry[])"})
  void testCombineMapsOverwritingWithBaseMapAdditionalEntries_thenReturnMinusOneIsValue() {
    // Arrange
    HashMap<Object, Object> baseMap = new HashMap<>();
    baseMap.put(-1, "Value");
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    baseMap.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(baseMap, new SimpleEntry<>("Key", "Value"));

    // Assert
    assertEquals(3, actualCombineMapsOverwritingResult.size());
    assertEquals("Value", actualCombineMapsOverwritingResult.get("Key"));
    assertEquals("Value", actualCombineMapsOverwritingResult.get(-1));
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Entry[])} with {@code baseMap}, {@code
   * additionalEntries}.
   *
   * <ul>
   *   <li>Then return one is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map.Entry[])}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Entry[]) with 'baseMap', 'additionalEntries'; then return one is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map.Entry[])"})
  void testCombineMapsOverwritingWithBaseMapAdditionalEntries_thenReturnOneIsValue() {
    // Arrange
    HashMap<Object, Object> baseMap = new HashMap<>();
    baseMap.put(1, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(baseMap, new SimpleEntry<>("Key", "Value"));

    // Assert
    assertEquals(2, actualCombineMapsOverwritingResult.size());
    assertEquals("Value", actualCombineMapsOverwritingResult.get("Key"));
    assertEquals("Value", actualCombineMapsOverwritingResult.get(1));
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Entry[])} with {@code baseMap}, {@code
   * additionalEntries}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map.Entry[])}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Entry[]) with 'baseMap', 'additionalEntries'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map.Entry[])"})
  void testCombineMapsOverwritingWithBaseMapAdditionalEntries_thenReturnSizeIsOne() {
    // Arrange
    HashMap<Object, Object> baseMap = new HashMap<>();

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(baseMap, new SimpleEntry<>("Key", "Value"));

    // Assert
    assertEquals(1, actualCombineMapsOverwritingResult.size());
    assertEquals("Value", actualCombineMapsOverwritingResult.get("Key"));
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Entry[])} with {@code baseMap}, {@code
   * additionalEntries}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map.Entry[])}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Entry[]) with 'baseMap', 'additionalEntries'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map.Entry[])"})
  void testCombineMapsOverwritingWithBaseMapAdditionalEntries_thenReturnSizeIsTwo() {
    // Arrange
    HashMap<Object, Object> baseMap = new HashMap<>();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    baseMap.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(baseMap, new SimpleEntry<>("Key", "Value"));

    // Assert
    assertEquals(2, actualCombineMapsOverwritingResult.size());
    assertEquals("Value", actualCombineMapsOverwritingResult.get("Key"));
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Entry[])} with {@code baseMap}, {@code
   * additionalEntries}.
   *
   * <ul>
   *   <li>Then return zero is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map.Entry[])}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Entry[]) with 'baseMap', 'additionalEntries'; then return zero is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map.Entry[])"})
  void testCombineMapsOverwritingWithBaseMapAdditionalEntries_thenReturnZeroIsValue() {
    // Arrange
    HashMap<Object, Object> baseMap = new HashMap<>();
    baseMap.put(0, "Value");
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    baseMap.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(baseMap, new SimpleEntry<>("Key", "Value"));

    // Assert
    assertEquals(3, actualCombineMapsOverwritingResult.size());
    assertEquals("Value", actualCombineMapsOverwritingResult.get("Key"));
    assertEquals("Value", actualCombineMapsOverwritingResult.get(0));
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Map) with 'first', 'second'; given '42'; when HashMap() '42' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map)"})
  void testCombineMapsOverwritingWithFirstSecond_given42_whenHashMap42IsValue() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("42", "Value");
    first.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsOverwritingResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given minus one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map)}
   */
  @Test
  @DisplayName("Test combineMapsOverwriting(Map, Map) with 'first', 'second'; given minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map)"})
  void testCombineMapsOverwritingWithFirstSecond_givenMinusOne() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put(-1, "Value");
    first.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsOverwritingResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given minus one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map)}
   */
  @Test
  @DisplayName("Test combineMapsOverwriting(Map, Map) with 'first', 'second'; given minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map)"})
  void testCombineMapsOverwritingWithFirstSecond_givenMinusOne2() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put(-1, "Value");
    first.put("Key", "Value");
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    first.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsOverwritingResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given of.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Map) with 'first', 'second'; given of; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map)"})
  void testCombineMapsOverwritingWithFirstSecond_givenOf_thenReturnSizeIsTwo() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("Key", "Value");

    HashMap<Object, Object> second = new HashMap<>();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    second.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(first, second);

    // Assert
    assertEquals(2, actualCombineMapsOverwritingResult.size());
    assertEquals("Value", actualCombineMapsOverwritingResult.get("Key"));
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given of.
   *   <li>When {@link HashMap#HashMap()} of is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Map) with 'first', 'second'; given of; when HashMap() of is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map)"})
  void testCombineMapsOverwritingWithFirstSecond_givenOf_whenHashMapOfIsValue() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    first.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsOverwritingResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given of.
   *   <li>When {@link HashMap#HashMap()} of is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Map) with 'first', 'second'; given of; when HashMap() of is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map)"})
  void testCombineMapsOverwritingWithFirstSecond_givenOf_whenHashMapOfIsValue2() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("Key", "Value");
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    first.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsOverwritingResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link HashMap#HashMap()} zero is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Map) with 'first', 'second'; given zero; when HashMap() zero is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map)"})
  void testCombineMapsOverwritingWithFirstSecond_givenZero_whenHashMapZeroIsValue() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put(0, "Value");
    ImmutableSortedMap<String, Object> ofResult = ImmutableSortedMap.of();
    first.put(ofResult, "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsOverwritingResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Map) with 'first', 'second'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map)"})
  void testCombineMapsOverwritingWithFirstSecond_whenHashMapKeyIsValue() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsOverwritingResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Map) with 'first', 'second'; when HashMap() 'Key' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map)"})
  void testCombineMapsOverwritingWithFirstSecond_whenHashMapKeyIsValue2() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();
    first.put("Key", "Value");

    HashMap<Object, Object> second = new HashMap<>();
    second.put("Key", "Value");

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(first, second);

    // Assert
    assertEquals(first, actualCombineMapsOverwritingResult);
  }

  /**
   * Test {@link Guavate#combineMapsOverwriting(Map, Map)} with {@code first}, {@code second}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineMapsOverwriting(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test combineMapsOverwriting(Map, Map) with 'first', 'second'; when HashMap(); then return HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap Guavate.combineMapsOverwriting(Map, Map)"})
  void testCombineMapsOverwritingWithFirstSecond_whenHashMap_thenReturnHashMap() {
    // Arrange
    HashMap<Object, Object> first = new HashMap<>();

    // Act
    ImmutableMap<Object, Object> actualCombineMapsOverwritingResult =
        Guavate.combineMapsOverwriting(first, new HashMap<>());

    // Assert
    assertEquals(first, actualCombineMapsOverwritingResult);
  }

  /**
   * Test OnlyCollector {@link OnlyCollector#characteristics()}.
   *
   * <p>Method under test: {@link OnlyCollector#characteristics()}
   */
  @Test
  @DisplayName("Test OnlyCollector characteristics()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Set OnlyCollector.characteristics()"})
  void testOnlyCollectorCharacteristics() {
    // Arrange
    OnlyCollector<Object> onlyCollector = new OnlyCollector<>();

    // Act and Assert
    assertTrue(onlyCollector.characteristics().isEmpty());
  }

  /**
   * Test OnlyCollector {@link OnlyCollector#combiner()}.
   *
   * <p>Method under test: {@link OnlyCollector#combiner()}
   */
  @Test
  @DisplayName("Test OnlyCollector combiner()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator OnlyCollector.combiner()"})
  void testOnlyCollectorCombiner() {
    // Arrange
    OnlyCollector<Object> onlyCollector = new OnlyCollector<>();

    // Act
    BinaryOperator<OnlyCollector<Object>> actualCombinerResult = onlyCollector.combiner();
    OnlyCollector<Object> onlyCollector2 = new OnlyCollector<>();

    // Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> actualCombinerResult.apply(onlyCollector2, new OnlyCollector<>()));
  }

  /**
   * Test OnlyCollector {@link OnlyCollector#finisher()}.
   *
   * <p>Method under test: {@link OnlyCollector#finisher()}
   */
  @Test
  @DisplayName("Test OnlyCollector finisher()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function OnlyCollector.finisher()"})
  void testOnlyCollectorFinisher() {
    // Arrange
    OnlyCollector<Object> onlyCollector = new OnlyCollector<>();

    // Act
    Function<OnlyCollector<Object>, Optional<Object>> actualFinisherResult =
        onlyCollector.finisher();

    // Assert
    assertFalse(actualFinisherResult.apply(new OnlyCollector<>()).isPresent());
  }

  /**
   * Test {@link Guavate#tryCatchToOptional(Supplier, Consumer)} with {@code resultSupplier}, {@code
   * exceptionHandler}.
   *
   * <p>Method under test: {@link Guavate#tryCatchToOptional(Supplier, Consumer)}
   */
  @Test
  @DisplayName(
      "Test tryCatchToOptional(Supplier, Consumer) with 'resultSupplier', 'exceptionHandler'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.tryCatchToOptional(Supplier, Consumer)"})
  void testTryCatchToOptionalWithResultSupplierExceptionHandler() {
    // Arrange
    Supplier<Object> resultSupplier = mock(Supplier.class);
    when(resultSupplier.get()).thenThrow(new RuntimeException());

    Consumer<RuntimeException> exceptionHandler = mock(Consumer.class);
    doThrow(new RuntimeException()).when(exceptionHandler).accept(Mockito.<RuntimeException>any());

    // Act and Assert
    assertThrows(
        RuntimeException.class, () -> Guavate.tryCatchToOptional(resultSupplier, exceptionHandler));
    verify(exceptionHandler).accept(isA(RuntimeException.class));
    verify(resultSupplier).get();
  }

  /**
   * Test {@link Guavate#tryCatchToOptional(Supplier, Consumer)} with {@code resultSupplier}, {@code
   * exceptionHandler}.
   *
   * <ul>
   *   <li>Then return {@link Optional#get()} is {@code Get}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#tryCatchToOptional(Supplier, Consumer)}
   */
  @Test
  @DisplayName(
      "Test tryCatchToOptional(Supplier, Consumer) with 'resultSupplier', 'exceptionHandler'; then return get() is 'Get'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.tryCatchToOptional(Supplier, Consumer)"})
  void testTryCatchToOptionalWithResultSupplierExceptionHandler_thenReturnGetIsGet() {
    // Arrange
    Supplier<Object> resultSupplier = mock(Supplier.class);
    when(resultSupplier.get()).thenReturn("Get");

    // Act
    Optional<Object> actualTryCatchToOptionalResult =
        Guavate.tryCatchToOptional(resultSupplier, mock(Consumer.class));

    // Assert
    verify(resultSupplier).get();
    assertEquals("Get", actualTryCatchToOptionalResult.get());
    assertTrue(actualTryCatchToOptionalResult.isPresent());
  }

  /**
   * Test {@link Guavate#tryCatchToOptional(Supplier, Consumer)} with {@code resultSupplier}, {@code
   * exceptionHandler}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#tryCatchToOptional(Supplier, Consumer)}
   */
  @Test
  @DisplayName(
      "Test tryCatchToOptional(Supplier, Consumer) with 'resultSupplier', 'exceptionHandler'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.tryCatchToOptional(Supplier, Consumer)"})
  void testTryCatchToOptionalWithResultSupplierExceptionHandler_thenReturnNotPresent() {
    // Arrange
    Supplier<Object> resultSupplier = mock(Supplier.class);
    when(resultSupplier.get()).thenThrow(new RuntimeException());

    Consumer<RuntimeException> exceptionHandler = mock(Consumer.class);
    doNothing().when(exceptionHandler).accept(Mockito.<RuntimeException>any());

    // Act
    Optional<Object> actualTryCatchToOptionalResult =
        Guavate.tryCatchToOptional(resultSupplier, exceptionHandler);

    // Assert
    verify(exceptionHandler).accept(isA(RuntimeException.class));
    verify(resultSupplier).get();
    assertFalse(actualTryCatchToOptionalResult.isPresent());
  }

  /**
   * Test {@link Guavate#tryCatchToOptional(Supplier)} with {@code resultSupplier}.
   *
   * <ul>
   *   <li>Given {@code Get}.
   *   <li>Then return {@link Optional#get()} is {@code Get}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#tryCatchToOptional(Supplier)}
   */
  @Test
  @DisplayName(
      "Test tryCatchToOptional(Supplier) with 'resultSupplier'; given 'Get'; then return get() is 'Get'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.tryCatchToOptional(Supplier)"})
  void testTryCatchToOptionalWithResultSupplier_givenGet_thenReturnGetIsGet() {
    // Arrange
    Supplier<Object> resultSupplier = mock(Supplier.class);
    when(resultSupplier.get()).thenReturn("Get");

    // Act
    Optional<Object> actualTryCatchToOptionalResult = Guavate.tryCatchToOptional(resultSupplier);

    // Assert
    verify(resultSupplier).get();
    assertEquals("Get", actualTryCatchToOptionalResult.get());
    assertTrue(actualTryCatchToOptionalResult.isPresent());
  }

  /**
   * Test {@link Guavate#tryCatchToOptional(Supplier)} with {@code resultSupplier}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#tryCatchToOptional(Supplier)}
   */
  @Test
  @DisplayName("Test tryCatchToOptional(Supplier) with 'resultSupplier'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.tryCatchToOptional(Supplier)"})
  void testTryCatchToOptionalWithResultSupplier_thenReturnNotPresent() {
    // Arrange
    Supplier<Object> resultSupplier = mock(Supplier.class);
    when(resultSupplier.get()).thenThrow(new RuntimeException());

    // Act
    Optional<Object> actualTryCatchToOptionalResult = Guavate.tryCatchToOptional(resultSupplier);

    // Assert
    verify(resultSupplier).get();
    assertFalse(actualTryCatchToOptionalResult.isPresent());
  }

  /**
   * Test {@link Guavate#firstNonEmpty(Optional[])} with {@code optionals}.
   *
   * <ul>
   *   <li>When empty and empty.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#firstNonEmpty(Optional[])}
   */
  @Test
  @DisplayName(
      "Test firstNonEmpty(Optional[]) with 'optionals'; when empty and empty; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.firstNonEmpty(Optional[])"})
  void testFirstNonEmptyWithOptionals_whenEmptyAndEmpty_thenReturnNotPresent() {
    // Arrange
    Optional<?> emptyResult = Optional.empty();
    Optional<?> emptyResult2 = Optional.empty();
    Optional<?> emptyResult3 = Optional.empty();
    Optional<?> emptyResult4 = Optional.empty();
    Optional<?> emptyResult5 = Optional.empty();
    Optional<?> emptyResult6 = Optional.empty();
    Optional<?> emptyResult7 = Optional.empty();
    Optional<?> emptyResult8 = Optional.empty();
    Optional<?> emptyResult9 = Optional.empty();
    Optional<?> emptyResult10 = Optional.empty();
    Optional<?> emptyResult11 = Optional.empty();
    Optional<?> emptyResult12 = Optional.empty();
    Optional<?> emptyResult13 = Optional.empty();
    Optional<?> emptyResult14 = Optional.empty();
    Optional<?> emptyResult15 = Optional.empty();
    Optional<?> emptyResult16 = Optional.empty();
    Optional<?> emptyResult17 = Optional.empty();
    Optional<?> emptyResult18 = Optional.empty();

    // Act
    Optional<Object> actualFirstNonEmptyResult =
        Guavate.firstNonEmpty(
            emptyResult,
            emptyResult2,
            emptyResult3,
            emptyResult4,
            emptyResult5,
            emptyResult6,
            emptyResult7,
            emptyResult8,
            emptyResult9,
            emptyResult10,
            emptyResult11,
            emptyResult12,
            emptyResult13,
            emptyResult14,
            emptyResult15,
            emptyResult16,
            emptyResult17,
            emptyResult18);

    // Assert
    assertFalse(actualFirstNonEmptyResult.isPresent());
  }

  /**
   * Test {@link Guavate#firstNonEmpty(Optional[])} with {@code optionals}.
   *
   * <ul>
   *   <li>When of {@code Value}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#firstNonEmpty(Optional[])}
   */
  @Test
  @DisplayName(
      "Test firstNonEmpty(Optional[]) with 'optionals'; when of 'Value'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.firstNonEmpty(Optional[])"})
  void testFirstNonEmptyWithOptionals_whenOfValue_thenReturnGetIsValue() {
    // Arrange
    Optional<?> ofResult = Optional.of("Value");

    // Act
    Optional<Object> actualFirstNonEmptyResult = Guavate.firstNonEmpty(ofResult);

    // Assert
    assertEquals("Value", actualFirstNonEmptyResult.get());
    assertTrue(actualFirstNonEmptyResult.isPresent());
  }

  /**
   * Test {@link Guavate#firstNonEmpty(Supplier[])} with {@code suppliers}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#firstNonEmpty(Supplier[])}
   */
  @Test
  @DisplayName("Test firstNonEmpty(Supplier[]) with 'suppliers'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.firstNonEmpty(Supplier[])"})
  void testFirstNonEmptyWithSuppliers_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Object> actualFirstNonEmptyResult = Guavate.firstNonEmpty(new Supplier[] {});

    // Assert
    assertFalse(actualFirstNonEmptyResult.isPresent());
  }

  /**
   * Test {@link Guavate#first(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link Optional#get()} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#first(Iterable)}
   */
  @Test
  @DisplayName(
      "Test first(Iterable); given '42'; when ArrayList() add '42'; then return get() is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.first(Iterable)"})
  void testFirst_given42_whenArrayListAdd42_thenReturnGetIs42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    Optional<Object> actualFirstResult = Guavate.first(iterable);

    // Assert
    assertEquals("42", actualFirstResult.get());
    assertTrue(actualFirstResult.isPresent());
  }

  /**
   * Test {@link Guavate#first(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#first(Iterable)}
   */
  @Test
  @DisplayName("Test first(Iterable); when ArrayList(); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.first(Iterable)"})
  void testFirst_whenArrayList_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Object> actualFirstResult = Guavate.first(new ArrayList<>());

    // Assert
    assertFalse(actualFirstResult.isPresent());
  }

  /**
   * Test {@link Guavate#only(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return {@link Optional#get()} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#only(Iterable)}
   */
  @Test
  @DisplayName(
      "Test only(Iterable); given '42'; when ArrayList() add '42'; then return get() is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.only(Iterable)"})
  void testOnly_given42_whenArrayListAdd42_thenReturnGetIs42() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");

    // Act
    Optional<Object> actualOnlyResult = Guavate.only(iterable);

    // Assert
    assertEquals("42", actualOnlyResult.get());
    assertTrue(actualOnlyResult.isPresent());
  }

  /**
   * Test {@link Guavate#only(Iterable)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#only(Iterable)}
   */
  @Test
  @DisplayName(
      "Test only(Iterable); given '42'; when ArrayList() add '42'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.only(Iterable)"})
  void testOnly_given42_whenArrayListAdd42_thenReturnNotPresent() {
    // Arrange
    ArrayList<Object> iterable = new ArrayList<>();
    iterable.add("42");
    iterable.add("42");

    // Act
    Optional<Object> actualOnlyResult = Guavate.only(iterable);

    // Assert
    assertFalse(actualOnlyResult.isPresent());
  }

  /**
   * Test {@link Guavate#only(Iterable)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#only(Iterable)}
   */
  @Test
  @DisplayName("Test only(Iterable); when ArrayList(); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.only(Iterable)"})
  void testOnly_whenArrayList_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Object> actualOnlyResult = Guavate.only(new ArrayList<>());

    // Assert
    assertFalse(actualOnlyResult.isPresent());
  }

  /**
   * Test {@link Guavate#list(Object, Object[])}.
   *
   * <ul>
   *   <li>When {@code First}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#list(Object, Object[])}
   */
  @Test
  @DisplayName("Test list(Object, Object[]); when 'First'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.list(Object, Object[])"})
  void testList_whenFirst_thenReturnSizeIsOne() {
    // Arrange and Act
    ImmutableList<Object> actualListResult = Guavate.list("First");

    // Assert
    assertEquals(1, actualListResult.size());
    assertEquals("First", actualListResult.get(0));
  }

  /**
   * Test {@link Guavate#list(Object, Object[])}.
   *
   * <ul>
   *   <li>When {@code Remaining}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#list(Object, Object[])}
   */
  @Test
  @DisplayName("Test list(Object, Object[]); when 'Remaining'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList Guavate.list(Object, Object[])"})
  void testList_whenRemaining_thenReturnSizeIsTwo() {
    // Arrange and Act
    ImmutableList<Object> actualListResult = Guavate.list("First", "Remaining");

    // Assert
    assertEquals(2, actualListResult.size());
    assertEquals("First", actualListResult.get(0));
    assertEquals("Remaining", actualListResult.get(1));
  }

  /**
   * Test {@link Guavate#set(Object, Object[])}.
   *
   * <ul>
   *   <li>When {@code First}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#set(Object, Object[])}
   */
  @Test
  @DisplayName("Test set(Object, Object[]); when 'First'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.set(Object, Object[])"})
  void testSet_whenFirst_thenReturnSizeIsOne() {
    // Arrange and Act
    ImmutableSet<Object> actualSetResult = Guavate.set("First");

    // Assert
    assertEquals(1, actualSetResult.size());
  }

  /**
   * Test {@link Guavate#set(Object, Object[])}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#set(Object, Object[])}
   */
  @Test
  @DisplayName("Test set(Object, Object[]); when one; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.set(Object, Object[])"})
  void testSet_whenOne_thenReturnSizeIsTwo() {
    // Arrange and Act
    ImmutableSet<Object> actualSetResult = Guavate.set(1, "Remaining");

    // Assert
    assertEquals(2, actualSetResult.size());
  }

  /**
   * Test {@link Guavate#set(Object, Object[])}.
   *
   * <ul>
   *   <li>When {@code Remaining} and {@code Remaining}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#set(Object, Object[])}
   */
  @Test
  @DisplayName(
      "Test set(Object, Object[]); when 'Remaining' and 'Remaining'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.set(Object, Object[])"})
  void testSet_whenRemainingAndRemaining_thenReturnSizeIsTwo() {
    // Arrange and Act
    ImmutableSet<Object> actualSetResult = Guavate.set("First", "Remaining", "Remaining");

    // Assert
    assertEquals(2, actualSetResult.size());
  }

  /**
   * Test {@link Guavate#set(Object, Object[])}.
   *
   * <ul>
   *   <li>When {@code Remaining}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#set(Object, Object[])}
   */
  @Test
  @DisplayName("Test set(Object, Object[]); when 'Remaining'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet Guavate.set(Object, Object[])"})
  void testSet_whenRemaining_thenReturnSizeIsTwo() {
    // Arrange and Act
    ImmutableSet<Object> actualSetResult = Guavate.set("First", "Remaining");

    // Assert
    assertEquals(2, actualSetResult.size());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName("Test combineListMultimaps(ListMultimap, ListMultimap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps() {
    // Arrange
    Builder<?, ?> builderResult = ImmutableListMultimap.builder();
    ImmutableListMultimap<?, ?> first =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    Builder<?, ?> builderResult2 = ImmutableListMultimap.builder();
    ImmutableListMultimap<?, ?> second =
        builderResult2
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(0, actualCombineListMultimapsResult.size());
    assertTrue(actualCombineListMultimapsResult.isEmpty());
    assertTrue(actualCombineListMultimapsResult.entries().isEmpty());
    assertTrue(actualCombineListMultimapsResult.keys().isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName("Test combineListMultimaps(ListMultimap, ListMultimap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps2() {
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
    ImmutableListMultimap<Object, Object> immutableListMultimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    first.put(immutableListMultimap, "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(1, actualCombineListMultimapsResult.size());
    assertEquals(1, actualCombineListMultimapsResult.entries().size());
    assertEquals(1, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName("Test combineListMultimaps(ListMultimap, ListMultimap)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps3() {
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
    ImmutableListMultimap<Object, Object> immutableListMultimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    first.put(immutableListMultimap, "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(1, actualCombineListMultimapsResult.size());
    assertEquals(1, actualCombineListMultimapsResult.entries().size());
    assertEquals(1, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>Given builder {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); given builder 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_givenBuilderKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    ImmutableListMultimap<Object, Object> immutableListMultimap =
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build();

    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    first.put(immutableListMultimap, "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(1, actualCombineListMultimapsResult.size());
    assertEquals(1, actualCombineListMultimapsResult.entries().size());
    assertEquals(1, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>Given builder one is {@code Value}.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); given builder one is 'Value'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_givenBuilderOneIsValue_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put(1, "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> expectedValuesPerKeyResult = builderResult.expectedValuesPerKey(42);

    Comparator<Object> keyComparator = mock(Comparator.class);
    when(keyComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> immutableListMultimap =
        expectedValuesPerKeyResult
            .orderKeysBy(keyComparator)
            .orderValuesBy(mock(Comparator.class))
            .build();

    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    first.put(immutableListMultimap, "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    verify(keyComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(1, actualCombineListMultimapsResult.size());
    assertEquals(1, actualCombineListMultimapsResult.entries().size());
    assertEquals(1, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>Given {@link Comparator} {@link Comparator#compare(Object, Object)} return one.
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); given Comparator compare(Object, Object) return one; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_givenComparatorCompareReturnOne_thenCallsCompare() {
    // Arrange
    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    builderResult.put("Key", "Value");
    builderResult.put("Key", "Value");

    Builder<Object, Object> orderKeysByResult =
        builderResult.expectedValuesPerKey(42).orderKeysBy(mock(Comparator.class));

    Comparator<Object> valueComparator = mock(Comparator.class);
    when(valueComparator.compare(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn(1);
    ImmutableListMultimap<Object, Object> immutableListMultimap =
        orderKeysByResult.orderValuesBy(valueComparator).build();

    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    first.put(immutableListMultimap, "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    verify(valueComparator).compare(isA(Object.class), isA(Object.class));
    assertEquals(1, actualCombineListMultimapsResult.size());
    assertEquals(1, actualCombineListMultimapsResult.entries().size());
    assertEquals(1, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When create {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); given 'Key'; when create 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_givenKey_whenCreateKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    first.put("Key", "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(1, actualCombineListMultimapsResult.size());
    assertEquals(1, actualCombineListMultimapsResult.entries().size());
    assertEquals(1, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When create {@code Key} is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); given 'Key'; when create 'Key' is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_givenKey_whenCreateKeyIsValue_thenReturnSizeIsTwo() {
    // Arrange
    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    first.put("Key", "Value");
    first.put("Key", "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(2, actualCombineListMultimapsResult.size());
    assertEquals(2, actualCombineListMultimapsResult.entries().size());
    assertEquals(2, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When create {@code Key} is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); given 'Key'; when create 'Key' is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_givenKey_whenCreateKeyIsValue_thenReturnSizeIsTwo2() {
    // Arrange
    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();

    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    first.put(
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    first.put("Key", "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(2, actualCombineListMultimapsResult.size());
    assertEquals(2, actualCombineListMultimapsResult.entries().size());
    assertEquals(2, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When create {@code Key} is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); given 'Key'; when create 'Key' is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_givenKey_whenCreateKeyIsValue_thenReturnSizeIsTwo3() {
    // Arrange
    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    first.put("Key", "Value");

    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    first.put(
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(2, actualCombineListMultimapsResult.size());
    assertEquals(2, actualCombineListMultimapsResult.entries().size());
    assertEquals(2, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>Given minus one.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); given minus one; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_givenMinusOne_thenReturnSizeIsThree() {
    // Arrange
    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    first.put(-1, "Value");
    first.put("Key", "Value");

    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    first.put(
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(3, actualCombineListMultimapsResult.size());
    assertEquals(3, actualCombineListMultimapsResult.entries().size());
    assertEquals(3, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>Given one.
   *   <li>When create one is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); given one; when create one is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_givenOne_whenCreateOneIsValue_thenReturnSizeIsTwo() {
    // Arrange
    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    first.put(1, "Value");
    first.put("Key", "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(2, actualCombineListMultimapsResult.size());
    assertEquals(2, actualCombineListMultimapsResult.entries().size());
    assertEquals(2, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName("Test combineListMultimaps(ListMultimap, ListMultimap); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_thenReturnSizeIsOne() {
    // Arrange
    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();

    Builder<Object, Object> builderResult = ImmutableListMultimap.builder();
    first.put(
        builderResult
            .expectedValuesPerKey(42)
            .orderKeysBy(mock(Comparator.class))
            .orderValuesBy(mock(Comparator.class))
            .build(),
        "Value");
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(1, actualCombineListMultimapsResult.size());
    assertEquals(1, actualCombineListMultimapsResult.entries().size());
    assertEquals(1, actualCombineListMultimapsResult.keys().size());
    assertFalse(actualCombineListMultimapsResult.isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>When create.
   *   <li>Then return create.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); when create; then return create")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_whenCreate_thenReturnCreate() {
    // Arrange
    ArrayListMultimap<?, ?> first = ArrayListMultimap.create();
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(first, actualCombineListMultimapsResult);
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>When create.
   *   <li>Then return create.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); when create; then return create")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_whenCreate_thenReturnCreate2() {
    // Arrange
    ArrayListMultimap<?, ?> first = ArrayListMultimap.create();
    LinkedListMultimap<Object, Object> second = LinkedListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(first, actualCombineListMultimapsResult);
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>When create.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); when create; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_whenCreate_thenReturnSizeIsZero() {
    // Arrange
    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    ArrayListMultimap<?, ?> second = ArrayListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(0, actualCombineListMultimapsResult.size());
    assertTrue(actualCombineListMultimapsResult.isEmpty());
    assertTrue(actualCombineListMultimapsResult.entries().isEmpty());
    assertTrue(actualCombineListMultimapsResult.keys().isEmpty());
  }

  /**
   * Test {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}.
   *
   * <ul>
   *   <li>When create.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineListMultimaps(ListMultimap, ListMultimap)}
   */
  @Test
  @DisplayName(
      "Test combineListMultimaps(ListMultimap, ListMultimap); when create; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableListMultimap Guavate.combineListMultimaps(ListMultimap, ListMultimap)"
  })
  void testCombineListMultimaps_whenCreate_thenReturnSizeIsZero2() {
    // Arrange
    LinkedListMultimap<Object, Object> first = LinkedListMultimap.create();
    LinkedListMultimap<Object, Object> second = LinkedListMultimap.create();

    // Act
    ImmutableListMultimap<Object, Object> actualCombineListMultimapsResult =
        Guavate.combineListMultimaps(first, second);

    // Assert
    assertEquals(0, actualCombineListMultimapsResult.size());
    assertTrue(actualCombineListMultimapsResult.isEmpty());
    assertTrue(actualCombineListMultimapsResult.entries().isEmpty());
    assertTrue(actualCombineListMultimapsResult.keys().isEmpty());
  }

  /**
   * Test {@link Guavate#boxed(OptionalDouble)} with {@code OptionalDouble}.
   *
   * <ul>
   *   <li>Then return {@link Optional#get()} doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#boxed(OptionalDouble)}
   */
  @Test
  @DisplayName(
      "Test boxed(OptionalDouble) with 'OptionalDouble'; then return get() doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.boxed(OptionalDouble)"})
  void testBoxedWithOptionalDouble_thenReturnGetDoubleValueIsTen() {
    // Arrange and Act
    Optional<Double> actualBoxedResult = Guavate.boxed(OptionalDouble.of(10.0d));

    // Assert
    assertEquals(10.0d, actualBoxedResult.get().doubleValue());
    assertTrue(actualBoxedResult.isPresent());
  }

  /**
   * Test {@link Guavate#boxed(OptionalDouble)} with {@code OptionalDouble}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#boxed(OptionalDouble)}
   */
  @Test
  @DisplayName(
      "Test boxed(OptionalDouble) with 'OptionalDouble'; when empty; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.boxed(OptionalDouble)"})
  void testBoxedWithOptionalDouble_whenEmpty_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Double> actualBoxedResult = Guavate.boxed(OptionalDouble.empty());

    // Assert
    assertFalse(actualBoxedResult.isPresent());
  }

  /**
   * Test {@link Guavate#boxed(OptionalInt)} with {@code OptionalInt}.
   *
   * <ul>
   *   <li>Then return {@link Optional#get()} intValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#boxed(OptionalInt)}
   */
  @Test
  @DisplayName(
      "Test boxed(OptionalInt) with 'OptionalInt'; then return get() intValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.boxed(OptionalInt)"})
  void testBoxedWithOptionalInt_thenReturnGetIntValueIsFortyTwo() {
    // Arrange and Act
    Optional<Integer> actualBoxedResult = Guavate.boxed(OptionalInt.of(42));

    // Assert
    assertEquals(42, actualBoxedResult.get().intValue());
    assertTrue(actualBoxedResult.isPresent());
  }

  /**
   * Test {@link Guavate#boxed(OptionalInt)} with {@code OptionalInt}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#boxed(OptionalInt)}
   */
  @Test
  @DisplayName("Test boxed(OptionalInt) with 'OptionalInt'; when empty; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.boxed(OptionalInt)"})
  void testBoxedWithOptionalInt_whenEmpty_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Integer> actualBoxedResult = Guavate.boxed(OptionalInt.empty());

    // Assert
    assertFalse(actualBoxedResult.isPresent());
  }

  /**
   * Test {@link Guavate#boxed(OptionalLong)} with {@code OptionalLong}.
   *
   * <ul>
   *   <li>Then return {@link Optional#get()} longValue is forty-two.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#boxed(OptionalLong)}
   */
  @Test
  @DisplayName(
      "Test boxed(OptionalLong) with 'OptionalLong'; then return get() longValue is forty-two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.boxed(OptionalLong)"})
  void testBoxedWithOptionalLong_thenReturnGetLongValueIsFortyTwo() {
    // Arrange and Act
    Optional<Long> actualBoxedResult = Guavate.boxed(OptionalLong.of(42L));

    // Assert
    assertEquals(42L, actualBoxedResult.get().longValue());
    assertTrue(actualBoxedResult.isPresent());
  }

  /**
   * Test {@link Guavate#boxed(OptionalLong)} with {@code OptionalLong}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#boxed(OptionalLong)}
   */
  @Test
  @DisplayName("Test boxed(OptionalLong) with 'OptionalLong'; when empty; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional Guavate.boxed(OptionalLong)"})
  void testBoxedWithOptionalLong_whenEmpty_thenReturnNotPresent() {
    // Arrange and Act
    Optional<Long> actualBoxedResult = Guavate.boxed(OptionalLong.empty());

    // Assert
    assertFalse(actualBoxedResult.isPresent());
  }

  /**
   * Test {@link Guavate#stream(Iterable)} with {@code iterable}.
   *
   * <p>Method under test: {@link Guavate#stream(Iterable)}
   */
  @Test
  @DisplayName("Test stream(Iterable) with 'iterable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream Guavate.stream(Iterable)"})
  void testStreamWithIterable() {
    // Arrange and Act
    Stream<Object> actualStreamResult = Guavate.stream(new ArrayList<>());

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link Guavate#stream(Optional)} with {@code optional}.
   *
   * <ul>
   *   <li>Then return limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#stream(Optional)}
   */
  @Test
  @DisplayName(
      "Test stream(Optional) with 'optional'; then return limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream Guavate.stream(Optional)"})
  void testStreamWithOptional_thenReturnLimitFiveCollectToListSizeIsOne() {
    // Arrange
    Optional<Object> optional = Optional.of("Value");

    // Act
    Stream<Object> actualStreamResult = Guavate.stream(optional);

    // Assert
    List<Object> collectResult = actualStreamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("Value", collectResult.get(0));
  }

  /**
   * Test {@link Guavate#stream(Optional)} with {@code optional}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#stream(Optional)}
   */
  @Test
  @DisplayName(
      "Test stream(Optional) with 'optional'; when empty; then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream Guavate.stream(Optional)"})
  void testStreamWithOptional_whenEmpty_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange
    Optional<Object> optional = Optional.empty();

    // Act
    Stream<Object> actualStreamResult = Guavate.stream(optional);

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link Guavate#in(Stream)}.
   *
   * <p>Method under test: {@link Guavate#in(Stream)}
   */
  @Test
  @DisplayName("Test in(Stream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable Guavate.in(Stream)"})
  void testIn() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Stream<Object> stream = objectList.stream();

    // Act
    Iterable<Object> actualInResult = Guavate.in(stream);

    // Assert
    assertFalse(actualInResult.iterator().hasNext());
  }

  /**
   * Test {@link Guavate#inOptional(Optional)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#inOptional(Optional)}
   */
  @Test
  @DisplayName("Test inOptional(Optional); when empty; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable Guavate.inOptional(Optional)"})
  void testInOptional_whenEmpty_thenReturnEmpty() {
    // Arrange
    Optional<Object> optional = Optional.empty();

    // Act
    Iterable<Object> actualInOptionalResult = Guavate.inOptional(optional);
    Iterator<Object> actualIteratorResult = actualInOptionalResult.iterator();

    // Assert
    assertTrue(actualInOptionalResult instanceof List);
    assertFalse(actualIteratorResult.hasNext());
    assertTrue(((List<Object>) actualInOptionalResult).isEmpty());
  }

  /**
   * Test {@link Guavate#inOptional(Optional)}.
   *
   * <ul>
   *   <li>When {@link Optional} with {@code Value}.
   *   <li>Then return iterator next is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#inOptional(Optional)}
   */
  @Test
  @DisplayName(
      "Test inOptional(Optional); when Optional with 'Value'; then return iterator next is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable Guavate.inOptional(Optional)"})
  void testInOptional_whenOptionalWithValue_thenReturnIteratorNextIsValue() {
    // Arrange
    Optional<Object> optional = Optional.of("Value");

    // Act
    Iterable<Object> actualInOptionalResult = Guavate.inOptional(optional);
    Iterator<Object> actualIteratorResult = actualInOptionalResult.iterator();

    // Assert
    assertTrue(actualInOptionalResult instanceof List);
    assertEquals("Value", actualIteratorResult.next());
    assertEquals(1, ((List<Object>) actualInOptionalResult).size());
    assertEquals("Value", ((List<Object>) actualInOptionalResult).get(0));
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link Guavate#inNullable(Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#inNullable(Object)}
   */
  @Test
  @DisplayName("Test inNullable(Object); when 'null'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable Guavate.inNullable(Object)"})
  void testInNullable_whenNull_thenReturnEmpty() {
    // Arrange and Act
    Iterable<Object> actualInNullableResult = Guavate.inNullable(null);
    Iterator<Object> actualIteratorResult = actualInNullableResult.iterator();

    // Assert
    assertTrue(actualInNullableResult instanceof List);
    assertFalse(actualIteratorResult.hasNext());
    assertTrue(((List<Object>) actualInNullableResult).isEmpty());
  }

  /**
   * Test {@link Guavate#inNullable(Object)}.
   *
   * <ul>
   *   <li>When {@code Nullable}.
   *   <li>Then return iterator next is {@code Nullable}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#inNullable(Object)}
   */
  @Test
  @DisplayName("Test inNullable(Object); when 'Nullable'; then return iterator next is 'Nullable'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable Guavate.inNullable(Object)"})
  void testInNullable_whenNullable_thenReturnIteratorNextIsNullable() {
    // Arrange and Act
    Iterable<Object> actualInNullableResult = Guavate.inNullable("Nullable");
    Iterator<Object> actualIteratorResult = actualInNullableResult.iterator();

    // Assert
    assertTrue(actualInNullableResult instanceof List);
    assertEquals("Nullable", actualIteratorResult.next());
    assertEquals(1, ((List<Object>) actualInNullableResult).size());
    assertEquals("Nullable", ((List<Object>) actualInNullableResult).get(0));
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link Guavate#inTryCatchIgnore(Supplier)}.
   *
   * <ul>
   *   <li>Given {@code Get}.
   *   <li>Then return iterator next is {@code Get}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#inTryCatchIgnore(Supplier)}
   */
  @Test
  @DisplayName("Test inTryCatchIgnore(Supplier); given 'Get'; then return iterator next is 'Get'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable Guavate.inTryCatchIgnore(Supplier)"})
  void testInTryCatchIgnore_givenGet_thenReturnIteratorNextIsGet() {
    // Arrange
    Supplier<Object> supplier = mock(Supplier.class);
    when(supplier.get()).thenReturn("Get");

    // Act
    Iterable<Object> actualInTryCatchIgnoreResult = Guavate.inTryCatchIgnore(supplier);
    Iterator<Object> actualIteratorResult = actualInTryCatchIgnoreResult.iterator();

    // Assert
    verify(supplier).get();
    assertTrue(actualInTryCatchIgnoreResult instanceof List);
    assertEquals("Get", actualIteratorResult.next());
    assertEquals(1, ((List<Object>) actualInTryCatchIgnoreResult).size());
    assertEquals("Get", ((List<Object>) actualInTryCatchIgnoreResult).get(0));
    assertFalse(actualIteratorResult.hasNext());
  }

  /**
   * Test {@link Guavate#inTryCatchIgnore(Supplier)}.
   *
   * <ul>
   *   <li>Given {@link RuntimeException#RuntimeException()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#inTryCatchIgnore(Supplier)}
   */
  @Test
  @DisplayName("Test inTryCatchIgnore(Supplier); given RuntimeException(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Iterable Guavate.inTryCatchIgnore(Supplier)"})
  void testInTryCatchIgnore_givenRuntimeException_thenReturnEmpty() {
    // Arrange
    Supplier<Object> supplier = mock(Supplier.class);
    when(supplier.get()).thenThrow(new RuntimeException());

    // Act
    Iterable<Object> actualInTryCatchIgnoreResult = Guavate.inTryCatchIgnore(supplier);
    Iterator<Object> actualIteratorResult = actualInTryCatchIgnoreResult.iterator();

    // Assert
    verify(supplier).get();
    assertTrue(actualInTryCatchIgnoreResult instanceof List);
    assertFalse(actualIteratorResult.hasNext());
    assertTrue(((List<Object>) actualInTryCatchIgnoreResult).isEmpty());
  }

  /**
   * Test {@link Guavate#zipWithIndex(Stream)}.
   *
   * <p>Method under test: {@link Guavate#zipWithIndex(Stream)}
   */
  @Test
  @DisplayName("Test zipWithIndex(Stream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream Guavate.zipWithIndex(Stream)"})
  void testZipWithIndex() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Stream<Object> stream = objectList.stream();

    // Act
    Stream<ObjIntPair<Object>> actualZipWithIndexResult = Guavate.zipWithIndex(stream);

    // Assert
    assertTrue(actualZipWithIndexResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link Guavate#zip(Stream, Stream)} with {@code stream1}, {@code stream2}.
   *
   * <p>Method under test: {@link Guavate#zip(Stream, Stream)}
   */
  @Test
  @DisplayName("Test zip(Stream, Stream) with 'stream1', 'stream2'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream Guavate.zip(Stream, Stream)"})
  void testZipWithStream1Stream2() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Stream<Object> stream1 = objectList.stream();

    ArrayList<Object> objectList2 = new ArrayList<>();
    Stream<Object> stream2 = objectList2.stream();

    // Act
    Stream<Pair<Object, Object>> actualZipResult = Guavate.zip(stream1, stream2);

    // Assert
    assertTrue(actualZipResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link Guavate#zip(Stream, Stream, BiFunction)} with {@code stream1}, {@code stream2},
   * {@code zipper}.
   *
   * <p>Method under test: {@link Guavate#zip(Stream, Stream, BiFunction)}
   */
  @Test
  @DisplayName("Test zip(Stream, Stream, BiFunction) with 'stream1', 'stream2', 'zipper'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream Guavate.zip(Stream, Stream, BiFunction)"})
  void testZipWithStream1Stream2Zipper() {
    // Arrange
    ArrayList<Object> objectList = new ArrayList<>();
    Stream<Object> stream1 = objectList.stream();

    ArrayList<Object> objectList2 = new ArrayList<>();
    Stream<Object> stream2 = objectList2.stream();

    // Act
    Stream<Object> actualZipResult = Guavate.zip(stream1, stream2, mock(BiFunction.class));

    // Assert
    assertTrue(actualZipResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link Guavate#not(Predicate)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code false}.
   *   <li>Then return not test {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#not(Predicate)}
   */
  @Test
  @DisplayName(
      "Test not(Predicate); given Predicate test(Object) return 'false'; then return not test '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Guavate.not(Predicate)"})
  void testNot_givenPredicateTestReturnFalse_thenReturnNotTest42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(false);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.negate()).thenReturn(predicate);

    // Act
    Predicate<Object> actualNotResult = Guavate.not(predicate2);
    boolean actualTestResult = actualNotResult.test("42");

    // Assert
    verify(predicate2).negate();
    verify(predicate).test(isA(Object.class));
    assertFalse(actualTestResult);
  }

  /**
   * Test {@link Guavate#not(Predicate)}.
   *
   * <ul>
   *   <li>Given {@link Predicate} {@link Predicate#test(Object)} return {@code true}.
   *   <li>Then return test {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#not(Predicate)}
   */
  @Test
  @DisplayName(
      "Test not(Predicate); given Predicate test(Object) return 'true'; then return test '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Predicate Guavate.not(Predicate)"})
  void testNot_givenPredicateTestReturnTrue_thenReturnTest42() {
    // Arrange
    Predicate<Object> predicate = mock(Predicate.class);
    when(predicate.test(Mockito.<Object>any())).thenReturn(true);

    Predicate<Object> predicate2 = mock(Predicate.class);
    when(predicate2.negate()).thenReturn(predicate);

    // Act
    Predicate<Object> actualNotResult = Guavate.not(predicate2);
    boolean actualTestResult = actualNotResult.test("42");

    // Assert
    verify(predicate2).negate();
    verify(predicate).test(isA(Object.class));
    assertTrue(actualTestResult);
  }

  /**
   * Test {@link Guavate#ensureOnlyOne()}.
   *
   * <p>Method under test: {@link Guavate#ensureOnlyOne()}
   */
  @Test
  @DisplayName("Test ensureOnlyOne()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Guavate.ensureOnlyOne()"})
  void testEnsureOnlyOne() {
    // Arrange and Act
    BinaryOperator<Object> actualEnsureOnlyOneResult = Guavate.ensureOnlyOne();

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualEnsureOnlyOneResult.apply("42", "42"));
  }

  /**
   * Test {@link Guavate#ensureOnlyOne(String, Object[])} with {@code String}, {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code Args} and {@code Args}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#ensureOnlyOne(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ensureOnlyOne(String, Object[]) with 'String', 'Object[]'; when 'Args' and 'Args'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Guavate.ensureOnlyOne(String, Object[])"})
  void testEnsureOnlyOneWithStringObject_whenArgsAndArgs() {
    // Arrange and Act
    BinaryOperator<Object> actualEnsureOnlyOneResult =
        Guavate.ensureOnlyOne("Not all who wander are lost", "Args", "Args");

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualEnsureOnlyOneResult.apply("42", "42"));
  }

  /**
   * Test {@link Guavate#ensureOnlyOne(String, Object[])} with {@code String}, {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#ensureOnlyOne(String, Object[])}
   */
  @Test
  @DisplayName("Test ensureOnlyOne(String, Object[]) with 'String', 'Object[]'; when '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Guavate.ensureOnlyOne(String, Object[])"})
  void testEnsureOnlyOneWithStringObject_whenLeftCurlyBracketRightCurlyBracket() {
    // Arrange and Act
    BinaryOperator<Object> actualEnsureOnlyOneResult = Guavate.ensureOnlyOne("{}", "Args");

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualEnsureOnlyOneResult.apply("42", "42"));
  }

  /**
   * Test {@link Guavate#ensureOnlyOne(String, Object[])} with {@code String}, {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code {}}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#ensureOnlyOne(String, Object[])}
   */
  @Test
  @DisplayName("Test ensureOnlyOne(String, Object[]) with 'String', 'Object[]'; when '{}'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Guavate.ensureOnlyOne(String, Object[])"})
  void testEnsureOnlyOneWithStringObject_whenLeftCurlyBracketRightCurlyBracket2() {
    // Arrange and Act
    BinaryOperator<Object> actualEnsureOnlyOneResult = Guavate.ensureOnlyOne("{}");

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualEnsureOnlyOneResult.apply("42", "42"));
  }

  /**
   * Test {@link Guavate#ensureOnlyOne(String, Object[])} with {@code String}, {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code Not all who wander are lost}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#ensureOnlyOne(String, Object[])}
   */
  @Test
  @DisplayName(
      "Test ensureOnlyOne(String, Object[]) with 'String', 'Object[]'; when 'Not all who wander are lost'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BinaryOperator Guavate.ensureOnlyOne(String, Object[])"})
  void testEnsureOnlyOneWithStringObject_whenNotAllWhoWanderAreLost() {
    // Arrange and Act
    BinaryOperator<Object> actualEnsureOnlyOneResult =
        Guavate.ensureOnlyOne("Not all who wander are lost", "Args");

    // Assert
    assertThrows(IllegalArgumentException.class, () -> actualEnsureOnlyOneResult.apply("42", "42"));
  }

  /**
   * Test {@link Guavate#casting(Class)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return apply {@code 42} is {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#casting(Class)}
   */
  @Test
  @DisplayName("Test casting(Class); when 'java.lang.Object'; then return apply '42' is '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Guavate.casting(Class)"})
  void testCasting_whenJavaLangObject_thenReturnApply42Is42() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Function<Object, Object> actualCastingResult = Guavate.casting(cls);

    // Assert
    assertEquals("42", actualCastingResult.apply("42"));
  }

  /**
   * Test {@link Guavate#filtering(Class)}.
   *
   * <ul>
   *   <li>Then return apply {@code 42} limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#filtering(Class)}
   */
  @Test
  @DisplayName(
      "Test filtering(Class); then return apply '42' limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Guavate.filtering(Class)"})
  void testFiltering_thenReturnApply42LimitFiveCollectToListSizeIsOne() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Function<Object, Stream<Object>> actualFilteringResult = Guavate.filtering(cls);
    Stream<Object> actualApplyResult = actualFilteringResult.apply("42");

    // Assert
    List<Object> collectResult = actualApplyResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("42", collectResult.get(0));
  }

  /**
   * Test {@link Guavate#filteringOptional()}.
   *
   * <p>Method under test: {@link Guavate#filteringOptional()}
   */
  @Test
  @DisplayName("Test filteringOptional()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Guavate.filteringOptional()"})
  void testFilteringOptional() {
    // Arrange and Act
    Function<Optional<Object>, Stream<Object>> actualFilteringOptionalResult =
        Guavate.filteringOptional();
    Optional<Object> ofResult = Optional.of("Value");
    Stream<Object> actualApplyResult = actualFilteringOptionalResult.apply(ofResult);

    // Assert
    List<Object> collectResult = actualApplyResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("Value", collectResult.get(0));
  }

  /**
   * Test {@link Guavate#filteringOptional()}.
   *
   * <ul>
   *   <li>Then return apply empty limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#filteringOptional()}
   */
  @Test
  @DisplayName("Test filteringOptional(); then return apply empty limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Function Guavate.filteringOptional()"})
  void testFilteringOptional_thenReturnApplyEmptyLimitFiveCollectToListEmpty() {
    // Arrange and Act
    Function<Optional<Object>, Stream<Object>> actualFilteringOptionalResult =
        Guavate.filteringOptional();
    Optional<Object> emptyResult = Optional.empty();
    Stream<Object> actualApplyResult = actualFilteringOptionalResult.apply(emptyResult);

    // Assert
    assertTrue(actualApplyResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link Guavate#toOnly()}.
   *
   * <p>Method under test: {@link Guavate#toOnly()}
   */
  @Test
  @DisplayName("Test toOnly()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Collector Guavate.toOnly()"})
  void testToOnly() {
    // Arrange and Act
    Collector<Object, ?, Optional<Object>> actualToOnlyResult = Guavate.toOnly();

    // Assert
    assertTrue(actualToOnlyResult instanceof OnlyCollector);
  }

  /**
   * Test {@link Guavate#combineFuturesAsList(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return {@link CompletableFuture#get()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineFuturesAsList(List)}
   */
  @Test
  @DisplayName("Test combineFuturesAsList(List); when ArrayList(); then return get() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CompletableFuture Guavate.combineFuturesAsList(List)"})
  void testCombineFuturesAsList_whenArrayList_thenReturnGetEmpty()
      throws InterruptedException, ExecutionException {
    // Arrange and Act
    CompletableFuture<List<Object>> actualCombineFuturesAsListResult =
        Guavate.combineFuturesAsList(new ArrayList<>());

    // Assert
    assertTrue(actualCombineFuturesAsListResult.get().isEmpty());
    assertTrue(actualCombineFuturesAsListResult.isDone());
  }

  /**
   * Test {@link Guavate#combineFuturesAsMap(Map)}.
   *
   * <ul>
   *   <li>Given {@link CompletableFuture#CompletableFuture()} obtrudeValue {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineFuturesAsMap(Map)}
   */
  @Test
  @DisplayName("Test combineFuturesAsMap(Map); given CompletableFuture() obtrudeValue 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CompletableFuture Guavate.combineFuturesAsMap(Map)"})
  void testCombineFuturesAsMap_givenCompletableFutureObtrudeValueNull() {
    // Arrange
    CompletableFuture<?> completableFuture = new CompletableFuture<>();
    completableFuture.obtrudeValue(null);

    HashMap<Object, CompletableFuture<?>> futures = new HashMap<>();
    futures.put("Key", completableFuture);

    // Act
    CompletableFuture<Map<Object, Object>> actualCombineFuturesAsMapResult =
        Guavate.combineFuturesAsMap(futures);

    // Assert
    assertTrue(actualCombineFuturesAsMapResult.isDone());
  }

  /**
   * Test {@link Guavate#combineFuturesAsMap(Map)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()}.
   *   <li>When {@link HashMap#HashMap()} All is {@link HashMap#HashMap()}.
   *   <li>Then return {@link CompletableFuture#get()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineFuturesAsMap(Map)}
   */
  @Test
  @DisplayName(
      "Test combineFuturesAsMap(Map); given HashMap(); when HashMap() All is HashMap(); then return get() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CompletableFuture Guavate.combineFuturesAsMap(Map)"})
  void testCombineFuturesAsMap_givenHashMap_whenHashMapAllIsHashMap_thenReturnGetEmpty()
      throws InterruptedException, ExecutionException {
    // Arrange
    HashMap<Object, CompletableFuture<?>> futures = new HashMap<>();
    futures.putAll(new HashMap<>());

    // Act
    CompletableFuture<Map<Object, Object>> actualCombineFuturesAsMapResult =
        Guavate.combineFuturesAsMap(futures);

    // Assert
    assertTrue(actualCombineFuturesAsMapResult.get().isEmpty());
    assertTrue(actualCombineFuturesAsMapResult.isDone());
  }

  /**
   * Test {@link Guavate#combineFuturesAsMap(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link CompletableFuture#get()} Empty.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#combineFuturesAsMap(Map)}
   */
  @Test
  @DisplayName("Test combineFuturesAsMap(Map); when HashMap(); then return get() Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CompletableFuture Guavate.combineFuturesAsMap(Map)"})
  void testCombineFuturesAsMap_whenHashMap_thenReturnGetEmpty()
      throws InterruptedException, ExecutionException {
    // Arrange and Act
    CompletableFuture<Map<Object, Object>> actualCombineFuturesAsMapResult =
        Guavate.combineFuturesAsMap(new HashMap<>());

    // Assert
    assertTrue(actualCombineFuturesAsMapResult.get().isEmpty());
    assertTrue(actualCombineFuturesAsMapResult.isDone());
  }

  /**
   * Test {@link Guavate#poll(ScheduledExecutorService, Duration, Duration, Supplier)}.
   *
   * <ul>
   *   <li>Then {@link ScheduledThreadPoolExecutor#ScheduledThreadPoolExecutor(int)} with three
   *       CompletedTaskCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#poll(ScheduledExecutorService, Duration, Duration,
   * Supplier)}
   */
  @Test
  @DisplayName(
      "Test poll(ScheduledExecutorService, Duration, Duration, Supplier); then ScheduledThreadPoolExecutor(int) with three CompletedTaskCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CompletableFuture Guavate.poll(ScheduledExecutorService, Duration, Duration, Supplier)"
  })
  void testPoll_thenScheduledThreadPoolExecutorWithThreeCompletedTaskCountIsZero() {
    // Arrange
    ScheduledThreadPoolExecutor executorService = new ScheduledThreadPoolExecutor(3);

    // Act
    Guavate.poll(
        executorService, Duration.ofSeconds(1L), Duration.ofSeconds(1L), mock(Supplier.class));

    // Assert
    assertEquals(0L, executorService.getCompletedTaskCount());
    assertEquals(1, executorService.getLargestPoolSize());
  }

  /**
   * Test {@link Guavate#genericClass(Class)}.
   *
   * <p>Method under test: {@link Guavate#genericClass(Class)}
   */
  @Test
  @DisplayName("Test genericClass(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Guavate.genericClass(Class)"})
  void testGenericClass() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Class<Object> actualGenericClassResult = Guavate.genericClass(cls);

    // Assert
    Class<Object> expectedGenericClassResult = Object.class;
    assertEquals(expectedGenericClassResult, actualGenericClassResult);
  }

  /**
   * Test {@link Guavate#substringBeforeFirst(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#substringBeforeFirst(String, String)}
   */
  @Test
  @DisplayName(
      "Test substringBeforeFirst(String, String); when empty string; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Guavate.substringBeforeFirst(String, String)"})
  void testSubstringBeforeFirst_whenEmptyString_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", Guavate.substringBeforeFirst("Str", ""));
  }

  /**
   * Test {@link Guavate#substringBeforeFirst(String, String)}.
   *
   * <ul>
   *   <li>When {@code Separator}.
   *   <li>Then return {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#substringBeforeFirst(String, String)}
   */
  @Test
  @DisplayName("Test substringBeforeFirst(String, String); when 'Separator'; then return 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Guavate.substringBeforeFirst(String, String)"})
  void testSubstringBeforeFirst_whenSeparator_thenReturnStr() {
    // Arrange, Act and Assert
    assertEquals("Str", Guavate.substringBeforeFirst("Str", "Separator"));
  }

  /**
   * Test {@link Guavate#substringAfterFirst(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#substringAfterFirst(String, String)}
   */
  @Test
  @DisplayName("Test substringAfterFirst(String, String); when empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Guavate.substringAfterFirst(String, String)"})
  void testSubstringAfterFirst_whenEmptyString() {
    // Arrange, Act and Assert
    assertEquals("Str", Guavate.substringAfterFirst("Str", ""));
  }

  /**
   * Test {@link Guavate#substringAfterFirst(String, String)}.
   *
   * <ul>
   *   <li>When {@code Separator}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#substringAfterFirst(String, String)}
   */
  @Test
  @DisplayName("Test substringAfterFirst(String, String); when 'Separator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Guavate.substringAfterFirst(String, String)"})
  void testSubstringAfterFirst_whenSeparator() {
    // Arrange, Act and Assert
    assertEquals("Str", Guavate.substringAfterFirst("Str", "Separator"));
  }

  /**
   * Test {@link Guavate#substringBeforeLast(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#substringBeforeLast(String, String)}
   */
  @Test
  @DisplayName("Test substringBeforeLast(String, String); when empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Guavate.substringBeforeLast(String, String)"})
  void testSubstringBeforeLast_whenEmptyString() {
    // Arrange, Act and Assert
    assertEquals("Str", Guavate.substringBeforeLast("Str", ""));
  }

  /**
   * Test {@link Guavate#substringBeforeLast(String, String)}.
   *
   * <ul>
   *   <li>When {@code Separator}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#substringBeforeLast(String, String)}
   */
  @Test
  @DisplayName("Test substringBeforeLast(String, String); when 'Separator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Guavate.substringBeforeLast(String, String)"})
  void testSubstringBeforeLast_whenSeparator() {
    // Arrange, Act and Assert
    assertEquals("Str", Guavate.substringBeforeLast("Str", "Separator"));
  }

  /**
   * Test {@link Guavate#substringAfterLast(String, String)}.
   *
   * <ul>
   *   <li>When empty string.
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#substringAfterLast(String, String)}
   */
  @Test
  @DisplayName(
      "Test substringAfterLast(String, String); when empty string; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Guavate.substringAfterLast(String, String)"})
  void testSubstringAfterLast_whenEmptyString_thenReturnEmptyString() {
    // Arrange, Act and Assert
    assertEquals("", Guavate.substringAfterLast("Str", ""));
  }

  /**
   * Test {@link Guavate#substringAfterLast(String, String)}.
   *
   * <ul>
   *   <li>When {@code Separator}.
   *   <li>Then return {@code Str}.
   * </ul>
   *
   * <p>Method under test: {@link Guavate#substringAfterLast(String, String)}
   */
  @Test
  @DisplayName("Test substringAfterLast(String, String); when 'Separator'; then return 'Str'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String Guavate.substringAfterLast(String, String)"})
  void testSubstringAfterLast_whenSeparator_thenReturnStr() {
    // Arrange, Act and Assert
    assertEquals("Str", Guavate.substringAfterLast("Str", "Separator"));
  }
}
