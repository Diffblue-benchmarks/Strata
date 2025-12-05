package com.opengamma.strata.report.framework.expression;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.calc.runner.CalculationFunctions;
import com.opengamma.strata.collect.result.Result;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MapTokenEvaluatorDiffblueTest {
  /**
   * Test {@link MapTokenEvaluator#tokens(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link HashMap#HashMap()} {@code 42} is {@code Value}.
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link MapTokenEvaluator#tokens(Map)}
   */
  @Test
  @DisplayName(
      "Test tokens(Map) with 'Map'; given '42'; when HashMap() '42' is 'Value'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set MapTokenEvaluator.tokens(Map)"})
  void testTokensWithMap_given42_whenHashMap42IsValue_thenReturnSizeIsTwo() {
    // Arrange
    MapTokenEvaluator mapTokenEvaluator = new MapTokenEvaluator();

    HashMap<Object, Object> map = new HashMap<>();
    map.put("42", "Value");
    map.put("Key", "Value");

    // Act
    Set<String> actualTokensResult = mapTokenEvaluator.tokens(map);

    // Assert
    assertEquals(2, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("42"));
    assertTrue(actualTokensResult.contains("key"));
  }

  /**
   * Test {@link MapTokenEvaluator#tokens(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>Given {@code Key}.
   *   <li>When {@link HashMap#HashMap()} {@code Key} is {@code Value}.
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link MapTokenEvaluator#tokens(Map)}
   */
  @Test
  @DisplayName(
      "Test tokens(Map) with 'Map'; given 'Key'; when HashMap() 'Key' is 'Value'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set MapTokenEvaluator.tokens(Map)"})
  void testTokensWithMap_givenKey_whenHashMapKeyIsValue_thenReturnSizeIsOne() {
    // Arrange
    MapTokenEvaluator mapTokenEvaluator = new MapTokenEvaluator();

    HashMap<Object, Object> map = new HashMap<>();
    map.put("Key", "Value");

    // Act
    Set<String> actualTokensResult = mapTokenEvaluator.tokens(map);

    // Assert
    assertEquals(1, actualTokensResult.size());
    assertTrue(actualTokensResult.contains("key"));
  }

  /**
   * Test {@link MapTokenEvaluator#tokens(Map)} with {@code Map}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link MapTokenEvaluator#tokens(Map)}
   */
  @Test
  @DisplayName("Test tokens(Map) with 'Map'; when HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set MapTokenEvaluator.tokens(Map)"})
  void testTokensWithMap_whenHashMap_thenReturnEmpty() {
    // Arrange
    MapTokenEvaluator mapTokenEvaluator = new MapTokenEvaluator();

    // Act and Assert
    assertTrue(mapTokenEvaluator.tokens(new HashMap<>()).isEmpty());
  }

  /**
   * Test {@link MapTokenEvaluator#evaluate(Map, CalculationFunctions, String, List)} with {@code
   * Map}, {@code CalculationFunctions}, {@code String}, {@code List}.
   *
   * <ul>
   *   <li>Then return Result Value is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MapTokenEvaluator#evaluate(Map, CalculationFunctions, String,
   * List)}
   */
  @Test
  @DisplayName(
      "Test evaluate(Map, CalculationFunctions, String, List) with 'Map', 'CalculationFunctions', 'String', 'List'; then return Result Value is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.report.framework.expression.EvaluationResult MapTokenEvaluator.evaluate(Map, CalculationFunctions, String, List)"
  })
  void testEvaluateWithMapCalculationFunctionsStringList_thenReturnResultValueIsValue() {
    // Arrange
    MapTokenEvaluator mapTokenEvaluator = new MapTokenEvaluator();

    HashMap<Object, Object> map = new HashMap<>();
    map.put("{U}", "Value");
    CalculationFunctions functions = mock(CalculationFunctions.class);

    // Act and Assert
    Result<?> result =
        mapTokenEvaluator.evaluate(map, functions, "{U}", new ArrayList<>()).getResult();
    assertEquals("Value", result.getValue());
    Optional<?> getResult = result.get();
    assertEquals("Value", getResult.get());
    assertFalse(result.isFailure());
    assertTrue(result.isSuccess());
    assertTrue(getResult.isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link MapTokenEvaluator}
   *   <li>{@link MapTokenEvaluator#getTargetType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MapTokenEvaluator.<init>()", "Class MapTokenEvaluator.getTargetType()"})
  void testGettersAndSetters() {
    // Arrange and Act
    Class<?> actualTargetType = new MapTokenEvaluator().getTargetType();

    // Assert
    Class<Map> expectedTargetType = Map.class;
    assertEquals(expectedTargetType, actualTargetType);
  }
}
