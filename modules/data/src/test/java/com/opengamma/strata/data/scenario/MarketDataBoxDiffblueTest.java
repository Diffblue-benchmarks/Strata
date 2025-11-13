package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataBoxDiffblueTest {
  /**
   * Test {@link MarketDataBox#ofSingleValue(Object)}.
   *
   * <ul>
   *   <li>When {@code Single Value}.
   *   <li>Then return {@link SingleMarketDataBox}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataBox#ofSingleValue(Object)}
   */
  @Test
  @DisplayName("Test ofSingleValue(Object); when 'Single Value'; then return SingleMarketDataBox")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox MarketDataBox.ofSingleValue(Object)"})
  void testOfSingleValue_whenSingleValue_thenReturnSingleMarketDataBox() {
    // Arrange and Act
    MarketDataBox<Object> actualOfSingleValueResult = MarketDataBox.ofSingleValue("Single Value");

    // Assert
    assertTrue(actualOfSingleValueResult instanceof SingleMarketDataBox);
    assertEquals("Single Value", actualOfSingleValueResult.getSingleValue());
    assertEquals(
        "Single Value", ((SingleMarketDataBox<Object>) actualOfSingleValueResult).getValue());
    assertEquals(-1, actualOfSingleValueResult.getScenarioCount());
    assertFalse(actualOfSingleValueResult.isScenarioValue());
    assertTrue(actualOfSingleValueResult.isSingleValue());
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, actualOfSingleValueResult.getMarketDataType());
  }

  /**
   * Test {@link MarketDataBox#ofScenarioValue(ScenarioArray)}.
   *
   * <ul>
   *   <li>Then return {@link ScenarioMarketDataBox}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataBox#ofScenarioValue(ScenarioArray)}
   */
  @Test
  @DisplayName("Test ofScenarioValue(ScenarioArray); then return ScenarioMarketDataBox")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox MarketDataBox.ofScenarioValue(ScenarioArray)"})
  void testOfScenarioValue_thenReturnScenarioMarketDataBox() {
    // Arrange
    DefaultScenarioArray<Object> scenarioValue = DefaultScenarioArray.of(new ArrayList<>());

    // Act
    MarketDataBox<Object> actualOfScenarioValueResult =
        MarketDataBox.ofScenarioValue(scenarioValue);

    // Assert
    assertTrue(actualOfScenarioValueResult instanceof ScenarioMarketDataBox);
    assertEquals(0, actualOfScenarioValueResult.getScenarioCount());
    assertFalse(actualOfScenarioValueResult.isSingleValue());
    assertTrue(actualOfScenarioValueResult.isScenarioValue());
    Stream<Object> streamResult = actualOfScenarioValueResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertSame(scenarioValue, actualOfScenarioValueResult.getScenarioValue());
    assertSame(
        scenarioValue, ((ScenarioMarketDataBox<Object>) actualOfScenarioValueResult).getValue());
  }

  /**
   * Test {@link MarketDataBox#ofScenarioValues(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataBox#ofScenarioValues(List)}
   */
  @Test
  @DisplayName(
      "Test ofScenarioValues(List) with 'List'; given '42'; then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox MarketDataBox.ofScenarioValues(List)"})
  void testOfScenarioValuesWithList_given42_thenReturnScenarioCountIsOne() {
    // Arrange
    ArrayList<Object> scenarioValues = new ArrayList<>();
    scenarioValues.add("42");

    // Act
    MarketDataBox<Object> actualOfScenarioValuesResult =
        MarketDataBox.ofScenarioValues(scenarioValues);

    // Assert
    ScenarioArray<Object> scenarioValue = actualOfScenarioValuesResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualOfScenarioValuesResult instanceof ScenarioMarketDataBox);
    assertEquals(1, actualOfScenarioValuesResult.getScenarioCount());
    assertEquals(1, scenarioValue.getScenarioCount());
    Stream<Object> streamResult = actualOfScenarioValuesResult.stream();
    assertEquals(1, streamResult.limit(5).collect(Collectors.toList()).size());
    Stream<Object> streamResult2 = scenarioValue.stream();
    assertEquals(1, streamResult2.limit(5).collect(Collectors.toList()).size());
  }

  /**
   * Test {@link MarketDataBox#ofScenarioValues(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return stream limit five collect toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataBox#ofScenarioValues(List)}
   */
  @Test
  @DisplayName(
      "Test ofScenarioValues(List) with 'List'; then return stream limit five collect toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox MarketDataBox.ofScenarioValues(List)"})
  void testOfScenarioValuesWithList_thenReturnStreamLimitFiveCollectToListSizeIsTwo() {
    // Arrange
    ArrayList<Object> scenarioValues = new ArrayList<>();
    scenarioValues.add("42");
    scenarioValues.add("42");

    // Act
    MarketDataBox<Object> actualOfScenarioValuesResult =
        MarketDataBox.ofScenarioValues(scenarioValues);

    // Assert
    ScenarioArray<Object> scenarioValue = actualOfScenarioValuesResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualOfScenarioValuesResult instanceof ScenarioMarketDataBox);
    Stream<Object> streamResult = actualOfScenarioValuesResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    assertEquals("42", collectResult.get(1));
    Stream<Object> streamResult2 = scenarioValue.stream();
    List<Object> collectResult2 = streamResult2.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult2.size());
    assertEquals("42", collectResult2.get(1));
    assertEquals(2, actualOfScenarioValuesResult.getScenarioCount());
    assertEquals(2, scenarioValue.getScenarioCount());
  }

  /**
   * Test {@link MarketDataBox#ofScenarioValues(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataBox#ofScenarioValues(List)}
   */
  @Test
  @DisplayName(
      "Test ofScenarioValues(List) with 'List'; when ArrayList(); then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox MarketDataBox.ofScenarioValues(List)"})
  void testOfScenarioValuesWithList_whenArrayList_thenReturnScenarioCountIsZero() {
    // Arrange and Act
    MarketDataBox<Object> actualOfScenarioValuesResult =
        MarketDataBox.ofScenarioValues(new ArrayList<>());

    // Assert
    ScenarioArray<Object> scenarioValue = actualOfScenarioValuesResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualOfScenarioValuesResult instanceof ScenarioMarketDataBox);
    assertEquals(0, actualOfScenarioValuesResult.getScenarioCount());
    assertEquals(0, scenarioValue.getScenarioCount());
    Stream<Object> streamResult = actualOfScenarioValuesResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Stream<Object> streamResult2 = scenarioValue.stream();
    assertTrue(streamResult2.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link MarketDataBox#ofScenarioValues(Object[])} with {@code Object[]}.
   *
   * <p>Method under test: {@link MarketDataBox#ofScenarioValues(Object[])}
   */
  @Test
  @DisplayName("Test ofScenarioValues(Object[]) with 'Object[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox MarketDataBox.ofScenarioValues(Object[])"})
  void testOfScenarioValuesWithObject() {
    // Arrange and Act
    MarketDataBox<Object> actualOfScenarioValuesResult =
        MarketDataBox.ofScenarioValues("Scenario Values");

    // Assert
    ScenarioArray<Object> scenarioValue = actualOfScenarioValuesResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualOfScenarioValuesResult instanceof ScenarioMarketDataBox);
    Stream<Object> streamResult = actualOfScenarioValuesResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("Scenario Values", collectResult.get(0));
    assertEquals(1, actualOfScenarioValuesResult.getScenarioCount());
    assertEquals(1, scenarioValue.getScenarioCount());
    assertEquals(1, ((DefaultScenarioArray<Object>) scenarioValue).getValues().size());
    Stream<Object> streamResult2 = scenarioValue.stream();
    assertEquals(1, streamResult2.limit(5).collect(Collectors.toList()).size());
    assertFalse(actualOfScenarioValuesResult.isSingleValue());
    assertTrue(actualOfScenarioValuesResult.isScenarioValue());
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, actualOfScenarioValuesResult.getMarketDataType());
    assertSame(
        scenarioValue, ((ScenarioMarketDataBox<Object>) actualOfScenarioValuesResult).getValue());
  }

  /**
   * Test {@link MarketDataBox#isScenarioValue()}.
   *
   * <p>Method under test: {@link MarketDataBox#isScenarioValue()}
   */
  @Test
  @DisplayName("Test isScenarioValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataBox.isScenarioValue()"})
  void testIsScenarioValue() {
    // Arrange, Act and Assert
    assertFalse(new EmptyMarketDataBox().isScenarioValue());
  }
}
