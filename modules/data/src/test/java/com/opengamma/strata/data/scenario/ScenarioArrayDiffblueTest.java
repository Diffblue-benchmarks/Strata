package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ScenarioArrayDiffblueTest {
  /**
   * Test {@link ScenarioArray#of(int, IntFunction)} with {@code int}, {@code IntFunction}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When five.
   *   <li>Then return Values size is five.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; given 'Apply'; when five; then return Values size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_givenApply_whenFive_thenReturnValuesSizeIsFive() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");

    // Act
    ScenarioArray<Object> actualOfResult = ScenarioArray.of(5, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertTrue(actualOfResult instanceof DefaultScenarioArray);
    ImmutableList<Object> values = ((DefaultScenarioArray<Object>) actualOfResult).getValues();
    assertEquals(5, values.size());
    assertEquals("Apply", values.get(4));
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(5, collectResult.size());
    assertEquals("Apply", collectResult.get(4));
    assertEquals(5, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link ScenarioArray#of(int, IntFunction)} with {@code int}, {@code IntFunction}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When four.
   *   <li>Then return Values size is four.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; given 'Apply'; when four; then return Values size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_givenApply_whenFour_thenReturnValuesSizeIsFour() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");

    // Act
    ScenarioArray<Object> actualOfResult = ScenarioArray.of(4, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertTrue(actualOfResult instanceof DefaultScenarioArray);
    ImmutableList<Object> values = ((DefaultScenarioArray<Object>) actualOfResult).getValues();
    assertEquals(4, values.size());
    assertEquals("Apply", values.get(3));
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(4, collectResult.size());
    assertEquals("Apply", collectResult.get(3));
    assertEquals(4, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link ScenarioArray#of(int, IntFunction)} with {@code int}, {@code IntFunction}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When one.
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; given 'Apply'; when one; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_givenApply_whenOne_thenReturnValuesSizeIsOne() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");

    // Act
    ScenarioArray<Object> actualOfResult = ScenarioArray.of(1, valueFunction);

    // Assert
    verify(valueFunction).apply(0);
    assertTrue(actualOfResult instanceof DefaultScenarioArray);
    ImmutableList<Object> values = ((DefaultScenarioArray<Object>) actualOfResult).getValues();
    assertEquals(1, values.size());
    assertEquals("Apply", values.get(0));
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("Apply", collectResult.get(0));
    assertEquals(1, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link ScenarioArray#of(int, IntFunction)} with {@code int}, {@code IntFunction}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When three.
   *   <li>Then return Values size is three.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioArray#of(int, IntFunction)}
   */
  @Test
  @DisplayName(
      "Test of(int, IntFunction) with 'int', 'IntFunction'; given 'Apply'; when three; then return Values size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioArray.of(int, IntFunction)"})
  void testOfWithIntIntFunction_givenApply_whenThree_thenReturnValuesSizeIsThree() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");

    // Act
    ScenarioArray<Object> actualOfResult = ScenarioArray.of(3, valueFunction);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertTrue(actualOfResult instanceof DefaultScenarioArray);
    ImmutableList<Object> values = ((DefaultScenarioArray<Object>) actualOfResult).getValues();
    assertEquals(3, values.size());
    assertEquals("Apply", values.get(1));
    assertEquals("Apply", values.get(2));
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals("Apply", collectResult.get(1));
    assertEquals("Apply", collectResult.get(2));
    assertEquals(3, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link ScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return stream limit five collect toList size is one.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioArray#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given '42'; then return stream limit five collect toList size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioArray.of(List)"})
  void testOfWithList_given42_thenReturnStreamLimitFiveCollectToListSizeIsOne() {
    // Arrange
    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    ScenarioArray<Object> actualOfResult = ScenarioArray.of(values);

    // Assert
    assertTrue(actualOfResult instanceof DefaultScenarioArray);
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("42", collectResult.get(0));
    assertEquals(1, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link ScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return stream limit five collect toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioArray#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given '42'; then return stream limit five collect toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioArray.of(List)"})
  void testOfWithList_given42_thenReturnStreamLimitFiveCollectToListSizeIsTwo() {
    // Arrange
    ArrayList<Object> values = new ArrayList<>();
    values.add("42");
    values.add("42");

    // Act
    ScenarioArray<Object> actualOfResult = ScenarioArray.of(values);

    // Assert
    assertTrue(actualOfResult instanceof DefaultScenarioArray);
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    assertEquals("42", collectResult.get(1));
    assertEquals(2, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link ScenarioArray#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioArray#of(List)}
   */
  @Test
  @DisplayName("Test of(List) with 'List'; when ArrayList(); then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioArray.of(List)"})
  void testOfWithList_whenArrayList_thenReturnScenarioCountIsZero() {
    // Arrange
    ArrayList<Object> values = new ArrayList<>();

    // Act
    ScenarioArray<Object> actualOfResult = ScenarioArray.of(values);

    // Assert
    assertTrue(actualOfResult instanceof DefaultScenarioArray);
    assertEquals(0, actualOfResult.getScenarioCount());
    Stream<Object> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertEquals(values, ((DefaultScenarioArray<Object>) actualOfResult).getValues());
  }

  /**
   * Test {@link ScenarioArray#of(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioArray#of(Object[])}
   */
  @Test
  @DisplayName("Test of(Object[]) with 'Object[]'; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioArray.of(Object[])"})
  void testOfWithObject_thenReturnScenarioCountIsZero() {
    // Arrange and Act
    ScenarioArray<Object> actualOfResult = ScenarioArray.of();

    // Assert
    assertTrue(actualOfResult instanceof DefaultScenarioArray);
    assertEquals(0, actualOfResult.getScenarioCount());
    assertTrue(((DefaultScenarioArray<Object>) actualOfResult).getValues().isEmpty());
    Stream<Object> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link ScenarioArray#of(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code Values} and {@code Values}.
   *   <li>Then return Values size is two.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioArray#of(Object[])}
   */
  @Test
  @DisplayName(
      "Test of(Object[]) with 'Object[]'; when 'Values' and 'Values'; then return Values size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioArray.of(Object[])"})
  void testOfWithObject_whenValuesAndValues_thenReturnValuesSizeIsTwo() {
    // Arrange and Act
    ScenarioArray<Object> actualOfResult = ScenarioArray.of("Values", "Values");

    // Assert
    assertTrue(actualOfResult instanceof DefaultScenarioArray);
    ImmutableList<Object> values = ((DefaultScenarioArray<Object>) actualOfResult).getValues();
    assertEquals(2, values.size());
    assertEquals("Values", values.get(1));
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    assertEquals("Values", collectResult.get(1));
    assertEquals(2, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link ScenarioArray#of(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code Values}.
   *   <li>Then return Values size is one.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioArray#of(Object[])}
   */
  @Test
  @DisplayName("Test of(Object[]) with 'Object[]'; when 'Values'; then return Values size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioArray.of(Object[])"})
  void testOfWithObject_whenValues_thenReturnValuesSizeIsOne() {
    // Arrange and Act
    ScenarioArray<Object> actualOfResult = ScenarioArray.of("Values");

    // Assert
    assertTrue(actualOfResult instanceof DefaultScenarioArray);
    ImmutableList<Object> values = ((DefaultScenarioArray<Object>) actualOfResult).getValues();
    assertEquals(1, values.size());
    assertEquals("Values", values.get(0));
    Stream<Object> streamResult = actualOfResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("Values", collectResult.get(0));
    assertEquals(1, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link ScenarioArray#ofSingleValue(int, Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return {@link SingleScenarioArray}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioArray#ofSingleValue(int, Object)}
   */
  @Test
  @DisplayName("Test ofSingleValue(int, Object); when 'Value'; then return SingleScenarioArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray ScenarioArray.ofSingleValue(int, Object)"})
  void testOfSingleValue_whenValue_thenReturnSingleScenarioArray() {
    // Arrange and Act
    ScenarioArray<Object> actualOfSingleValueResult = ScenarioArray.ofSingleValue(3, "Value");

    // Assert
    assertTrue(actualOfSingleValueResult instanceof SingleScenarioArray);
    assertEquals("Value", ((SingleScenarioArray<Object>) actualOfSingleValueResult).getValue());
    assertEquals(3, actualOfSingleValueResult.getScenarioCount());
  }
}
