package com.opengamma.strata.market.explain;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.market.explain.ExplainMap.Meta;
import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ExplainMapDiffblueTest {
  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends ExplainMap> actualBeanTypeResult = ExplainMap.meta().beanType();

    // Assert
    Class<ExplainMap> expectedBeanTypeResult = ExplainMap.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#map()}.
   *
   * <p>Method under test: {@link Meta#map()}
   */
  @Test
  @DisplayName("Test Meta map()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.map()"})
  void testMetaMap() {
    // Arrange, Act and Assert
    assertTrue(ExplainMap.meta().map() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code map}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'map'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMap_thenReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = ExplainMap.meta().metaPropertyGet("map");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("map", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<ExplainMap> expectedDeclaringTypeResult = ExplainMap.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ExplainMap.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = ExplainMap.meta().metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("map");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("map", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<ExplainMap> expectedDeclaringTypeResult = ExplainMap.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ExplainMap.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when empty; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEmpty_thenReturnMap() {
    // Arrange
    Meta metaResult = ExplainMap.meta();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(ExplainMap.empty(), "map", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = ExplainMap.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(ExplainMap.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> ExplainMap.meta().propertySet(mock(Bean.class), "map", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code map}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'map'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMap_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ExplainMap.meta().propertySet(mock(Bean.class), "map", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> ExplainMap.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link ExplainMap#of(Map)}.
   *
   * <ul>
   *   <li>Given of {@code map}.
   *   <li>When {@link HashMap#HashMap()} of {@code map} is {@code Value}.
   *   <li>Then return not Empty.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map); given of 'map'; when HashMap() of 'map' is 'Value'; then return not Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMap ExplainMap.of(Map)"})
  void testOf_givenOfMap_whenHashMapOfMapIsValue_thenReturnNotEmpty() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("map");
    map.put(ofResult, "Value");

    // Act
    ExplainMap actualOfResult = ExplainMap.of(map);

    // Assert
    assertFalse(actualOfResult.isEmpty());
    assertEquals(map, actualOfResult.getMap());
  }

  /**
   * Test {@link ExplainMap#of(Map)}.
   *
   * <ul>
   *   <li>Given of {@code Name}.
   *   <li>When {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return not Empty.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map); given of 'Name'; when HashMap() of 'Name' is 'Value'; then return not Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMap ExplainMap.of(Map)"})
  void testOf_givenOfName_whenHashMapOfNameIsValue_thenReturnNotEmpty() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("Name");
    map.put(ofResult, "Value");
    ExplainKey<?> ofResult2 = ExplainKey.of("map");
    map.put(ofResult2, "Value");

    // Act
    ExplainMap actualOfResult = ExplainMap.of(map);

    // Assert
    assertFalse(actualOfResult.isEmpty());
    assertEquals(map, actualOfResult.getMap());
  }

  /**
   * Test {@link ExplainMap#of(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map); when HashMap(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMap ExplainMap.of(Map)"})
  void testOf_whenHashMap_thenReturnEmpty() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();

    // Act
    ExplainMap actualOfResult = ExplainMap.of(map);

    // Assert
    assertTrue(actualOfResult.isEmpty());
    assertEquals(map, actualOfResult.getMap());
  }

  /**
   * Test {@link ExplainMap#empty()}.
   *
   * <p>Method under test: {@link ExplainMap#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMap ExplainMap.empty()"})
  void testEmpty() {
    // Arrange and Act
    ExplainMap actualEmptyResult = ExplainMap.empty();

    // Assert
    assertTrue(actualEmptyResult.getMap().isEmpty());
    assertTrue(actualEmptyResult.isEmpty());
  }

  /**
   * Test {@link ExplainMap#get(ExplainKey)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@link ExplainKey} with {@code Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#get(ExplainKey)}
   */
  @Test
  @DisplayName(
      "Test get(ExplainKey); given empty; when ExplainKey with 'Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExplainMap.get(ExplainKey)"})
  void testGet_givenEmpty_whenExplainKeyWithName_thenReturnNotPresent() {
    // Arrange
    ExplainMap emptyResult = ExplainMap.empty();
    ExplainKey<Object> key = ExplainKey.of("Name");

    // Act and Assert
    assertFalse(emptyResult.get(key).isPresent());
  }

  /**
   * Test {@link ExplainMap#get(ExplainKey)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#get(ExplainKey)}
   */
  @Test
  @DisplayName("Test get(ExplainKey); given empty; when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExplainMap.get(ExplainKey)"})
  void testGet_givenEmpty_whenNull_thenReturnNotPresent() {
    // Arrange, Act and Assert
    assertFalse(ExplainMap.empty().get(null).isPresent());
  }

  /**
   * Test {@link ExplainMap#get(ExplainKey)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code 42} is {@code Value}.
   *   <li>When {@link ExplainKey} with {@code Name}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#get(ExplainKey)}
   */
  @Test
  @DisplayName(
      "Test get(ExplainKey); given HashMap() of '42' is 'Value'; when ExplainKey with 'Name'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExplainMap.get(ExplainKey)"})
  void testGet_givenHashMapOf42IsValue_whenExplainKeyWithName_thenReturnNotPresent() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("ConvexityAdjustedRate");
    map.put(ofResult, "Value");
    ExplainKey<?> ofResult2 = ExplainKey.of("42");
    map.put(ofResult2, "Value");
    ExplainMap ofResult3 = ExplainMap.of(map);
    ExplainKey<Object> key = ExplainKey.of("Name");

    // Act and Assert
    assertFalse(ofResult3.get(key).isPresent());
  }

  /**
   * Test {@link ExplainMap#get(ExplainKey)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code ForwardRate} is {@code Value}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#get(ExplainKey)}
   */
  @Test
  @DisplayName(
      "Test get(ExplainKey); given HashMap() of 'ForwardRate' is 'Value'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExplainMap.get(ExplainKey)"})
  void testGet_givenHashMapOfForwardRateIsValue_thenReturnNotPresent() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("ConvexityAdjustedRate");
    map.put(ofResult, "Value");
    ExplainKey<?> ofResult2 = ExplainKey.of("ForwardRate");
    map.put(ofResult2, "Value");
    ExplainMap ofResult3 = ExplainMap.of(map);
    ExplainKey<Object> key = ExplainKey.of("Name");

    // Act and Assert
    assertFalse(ofResult3.get(key).isPresent());
  }

  /**
   * Test {@link ExplainMap#get(ExplainKey)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>When {@link ExplainKey} with {@code Name}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#get(ExplainKey)}
   */
  @Test
  @DisplayName(
      "Test get(ExplainKey); given HashMap() of 'Name' is 'Value'; when ExplainKey with 'Name'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExplainMap.get(ExplainKey)"})
  void testGet_givenHashMapOfNameIsValue_whenExplainKeyWithName_thenReturnGetIsValue() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("Name");
    map.put(ofResult, "Value");
    ExplainMap ofResult2 = ExplainMap.of(map);
    ExplainKey<Object> key = ExplainKey.of("Name");

    // Act
    Optional<Object> actualGetResult = ofResult2.get(key);

    // Assert
    assertEquals("Value", actualGetResult.get());
    assertTrue(actualGetResult.isPresent());
  }

  /**
   * Test {@link ExplainMap#get(ExplainKey)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>When {@link ExplainKey} with {@code Name}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#get(ExplainKey)}
   */
  @Test
  @DisplayName(
      "Test get(ExplainKey); given HashMap() of 'Name' is 'Value'; when ExplainKey with 'Name'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ExplainMap.get(ExplainKey)"})
  void testGet_givenHashMapOfNameIsValue_whenExplainKeyWithName_thenReturnGetIsValue2() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("ConvexityAdjustedRate");
    map.put(ofResult, "Value");
    ExplainKey<?> ofResult2 = ExplainKey.of("Name");
    map.put(ofResult2, "Value");
    ExplainMap ofResult3 = ExplainMap.of(map);
    ExplainKey<Object> key = ExplainKey.of("Name");

    // Act
    Optional<Object> actualGetResult = ofResult3.get(key);

    // Assert
    assertEquals("Value", actualGetResult.get());
    assertTrue(actualGetResult.isPresent());
  }

  /**
   * Test {@link ExplainMap#explanationString()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return {@code ExplainMap { }}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#explanationString()}
   */
  @Test
  @DisplayName("Test explanationString(); given empty; then return 'ExplainMap { }'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ExplainMap.explanationString()"})
  void testExplanationString_givenEmpty_thenReturnExplainMap() {
    // Arrange, Act and Assert
    assertEquals("ExplainMap {\n}\n", ExplainMap.empty().explanationString());
  }

  /**
   * Test {@link ExplainMap#explanationString()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@link ArrayList#ArrayList()}.
   *   <li>Then return {@code ExplainMap { Name = [] }}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#explanationString()}
   */
  @Test
  @DisplayName(
      "Test explanationString(); given HashMap() of 'Name' is ArrayList(); then return 'ExplainMap { Name = [] }'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ExplainMap.explanationString()"})
  void testExplanationString_givenHashMapOfNameIsArrayList_thenReturnExplainMapName() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("Name");
    map.put(ofResult, new ArrayList<>());
    ExplainMap ofResult2 = ExplainMap.of(map);

    // Act and Assert
    assertEquals("ExplainMap {\n  Name = []\n}\n", ofResult2.explanationString());
  }

  /**
   * Test {@link ExplainMap#explanationString()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@link
   *       AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} with {@code Key} and {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#explanationString()}
   */
  @Test
  @DisplayName(
      "Test explanationString(); given HashMap() of 'Name' is SimpleEntry(Object, Object) with 'Key' and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ExplainMap.explanationString()"})
  void testExplanationString_givenHashMapOfNameIsSimpleEntryWithKeyAndValue() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("Name");
    map.put(ofResult, new SimpleEntry<>("Key", "Value"));
    ExplainMap ofResult2 = ExplainMap.of(map);

    // Act and Assert
    assertEquals("ExplainMap {\n  Name = Key=Value\n}\n", ofResult2.explanationString());
  }

  /**
   * Test {@link ExplainMap#explanationString()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return {@code ExplainMap { Name = Value }}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#explanationString()}
   */
  @Test
  @DisplayName(
      "Test explanationString(); given HashMap() of 'Name' is 'Value'; then return 'ExplainMap { Name = Value }'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ExplainMap.explanationString()"})
  void testExplanationString_givenHashMapOfNameIsValue_thenReturnExplainMapNameValue() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("Name");
    map.put(ofResult, "Value");
    ExplainMap ofResult2 = ExplainMap.of(map);

    // Act and Assert
    assertEquals("ExplainMap {\n  Name = Value\n}\n", ofResult2.explanationString());
  }

  /**
   * Test {@link ExplainMap#explanationString()}.
   *
   * <ul>
   *   <li>Given {@link AbstractMap.SimpleEntry#SimpleEntry(Object, Object)} with {@code Key} and
   *       {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#explanationString()}
   */
  @Test
  @DisplayName("Test explanationString(); given SimpleEntry(Object, Object) with 'Key' and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String ExplainMap.explanationString()"})
  void testExplanationString_givenSimpleEntryWithKeyAndValue() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("Name");
    map.put(ofResult, new SimpleEntry<>(new SimpleEntry<>("Key", "Value")));
    ExplainMap ofResult2 = ExplainMap.of(map);

    // Act and Assert
    assertEquals("ExplainMap {\n  Name = Key=Value\n}\n", ofResult2.explanationString());
  }

  /**
   * Test {@link ExplainMap#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return empty.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName("Test convertedTo(Currency, FxRateProvider); given empty; then return empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMap ExplainMap.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo_givenEmpty_thenReturnEmpty() {
    // Arrange
    ExplainMap emptyResult = ExplainMap.empty();

    // Act
    ExplainMap actualConvertedToResult = emptyResult.convertedTo(null, mock(FxRateProvider.class));

    // Assert
    assertEquals(emptyResult, actualConvertedToResult);
  }

  /**
   * Test {@link ExplainMap#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code map} is {@code Value}.
   *   <li>Then return {@link ExplainMap} with map is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider); given HashMap() of 'map' is 'Value'; then return ExplainMap with map is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMap ExplainMap.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo_givenHashMapOfMapIsValue_thenReturnExplainMapWithMapIsHashMap() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("map");
    map.put(ofResult, "Value");
    ExplainKey<?> ofResult2 = ExplainKey.of("Name");
    map.put(ofResult2, "Value");
    ExplainMap ofResult3 = ExplainMap.of(map);

    // Act
    ExplainMap actualConvertedToResult = ofResult3.convertedTo(null, mock(FxRateProvider.class));

    // Assert
    assertEquals(ofResult3, actualConvertedToResult);
  }

  /**
   * Test {@link ExplainMap#convertedTo(Currency, FxRateProvider)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return {@link ExplainMap} with map is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#convertedTo(Currency, FxRateProvider)}
   */
  @Test
  @DisplayName(
      "Test convertedTo(Currency, FxRateProvider); given HashMap() of 'Name' is 'Value'; then return ExplainMap with map is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ExplainMap ExplainMap.convertedTo(Currency, FxRateProvider)"})
  void testConvertedTo_givenHashMapOfNameIsValue_thenReturnExplainMapWithMapIsHashMap() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("Name");
    map.put(ofResult, "Value");
    ExplainMap ofResult2 = ExplainMap.of(map);

    // Act
    ExplainMap actualConvertedToResult = ofResult2.convertedTo(null, mock(FxRateProvider.class));

    // Assert
    assertEquals(ofResult2, actualConvertedToResult);
  }

  /**
   * Test {@link ExplainMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given empty; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExplainMap.isEmpty()"})
  void testIsEmpty_givenEmpty_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(ExplainMap.empty().isEmpty());
  }

  /**
   * Test {@link ExplainMap#isEmpty()}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#isEmpty()}
   */
  @Test
  @DisplayName("Test isEmpty(); given HashMap() of 'Name' is 'Value'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExplainMap.isEmpty()"})
  void testIsEmpty_givenHashMapOfNameIsValue_thenReturnFalse() {
    // Arrange
    HashMap<ExplainKey<?>, Object> map = new HashMap<>();
    ExplainKey<?> ofResult = ExplainKey.of("Name");
    map.put(ofResult, "Value");
    ExplainMap ofResult2 = ExplainMap.of(map);

    // Act and Assert
    assertFalse(ofResult2.isEmpty());
  }

  /**
   * Test {@link ExplainMap#meta()}.
   *
   * <p>Method under test: {@link ExplainMap#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ExplainMap.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ExplainMap.meta();

    // Assert
    MetaProperty<ImmutableMap<ExplainKey<?>, Object>> mapResult = actualMetaResult.map();
    assertTrue(mapResult instanceof DirectMetaProperty);
    assertEquals("map", mapResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, mapResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, mapResult.propertyType());
    Class<ExplainMap> expectedDeclaringTypeResult = ExplainMap.class;
    assertEquals(expectedDeclaringTypeResult, mapResult.declaringType());
    assertSame(Meta.INSTANCE, mapResult.metaBean());
  }

  /**
   * Test {@link ExplainMap#metaBean()}.
   *
   * <p>Method under test: {@link ExplainMap#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ExplainMap.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, ExplainMap.empty().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExplainMap#toString()}
   *   <li>{@link ExplainMap#getMap()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableMap ExplainMap.getMap()", "String ExplainMap.toString()"})
  void testGettersAndSetters() {
    // Arrange
    ExplainMap emptyResult = ExplainMap.empty();

    // Act
    String actualToStringResult = emptyResult.toString();

    // Assert
    assertEquals("ExplainMap{map={}}", actualToStringResult);
    assertTrue(emptyResult.getMap().isEmpty());
  }

  /**
   * Test {@link ExplainMap#equals(Object)}, and {@link ExplainMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExplainMap#equals(Object)}
   *   <li>{@link ExplainMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExplainMap.equals(Object)", "int ExplainMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    ExplainMap emptyResult = ExplainMap.empty();
    ExplainMap emptyResult2 = ExplainMap.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link ExplainMap#equals(Object)}, and {@link ExplainMap#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ExplainMap#equals(Object)}
   *   <li>{@link ExplainMap#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExplainMap.equals(Object)", "int ExplainMap.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    ExplainMap emptyResult = ExplainMap.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link ExplainMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExplainMap.equals(Object)", "int ExplainMap.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ExplainMap.empty(), null);
  }

  /**
   * Test {@link ExplainMap#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ExplainMap#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean ExplainMap.equals(Object)", "int ExplainMap.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(ExplainMap.empty(), "Different type to ExplainMap");
  }
}
