package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.function.ObjIntFunction;
import com.opengamma.strata.data.scenario.ScenarioMarketDataBox.Builder;
import com.opengamma.strata.data.scenario.ScenarioMarketDataBox.Meta;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.joda.beans.Bean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ScenarioMarketDataBoxDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange
    Builder<Object> builderResult = ScenarioMarketDataBox.builder();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> builderResult.get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'value'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenValue_thenReturnNull() {
    // Arrange
    Builder<Object> builderResult = ScenarioMarketDataBox.builder();

    // Act and Assert
    assertNull(builderResult.get("value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then builder build ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then builder build ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenBuilderBuildScenarioCountIsZero() {
    // Arrange
    Builder<Object> builderResult = ScenarioMarketDataBox.builder();
    DefaultScenarioArray<Object> ofResult = DefaultScenarioArray.of(new ArrayList<>());

    // Act
    Builder<Object> actualSetResult = builderResult.set("value", ofResult);

    // Assert
    ScenarioMarketDataBox<Object> scenarioMarketDataBox = builderResult.build();
    assertEquals(0, scenarioMarketDataBox.getScenarioCount());
    assertFalse(scenarioMarketDataBox.isSingleValue());
    assertTrue(scenarioMarketDataBox.isScenarioValue());
    Stream<Object> streamResult = scenarioMarketDataBox.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertSame(ofResult, scenarioMarketDataBox.getScenarioValue());
    assertSame(ofResult, scenarioMarketDataBox.getValue());
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange
    Builder<Object> builderResult = ScenarioMarketDataBox.builder();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> builderResult.set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder<Object> builderResult = ScenarioMarketDataBox.builder();

    // Act
    Builder<Object> actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#value(ScenarioArray)}.
   *
   * <ul>
   *   <li>Then builder build ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#value(ScenarioArray)}
   */
  @Test
  @DisplayName("Test Builder value(ScenarioArray); then builder build ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.value(ScenarioArray)"})
  void testBuilderValue_thenBuilderBuildScenarioCountIsZero() {
    // Arrange
    Builder<Object> builderResult = ScenarioMarketDataBox.builder();
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());

    // Act
    Builder<Object> actualValueResult = builderResult.value(value);

    // Assert
    ScenarioMarketDataBox<Object> scenarioMarketDataBox = builderResult.build();
    assertEquals(0, scenarioMarketDataBox.getScenarioCount());
    assertFalse(scenarioMarketDataBox.isSingleValue());
    assertTrue(scenarioMarketDataBox.isScenarioValue());
    Stream<Object> streamResult = scenarioMarketDataBox.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertSame(value, scenarioMarketDataBox.getScenarioValue());
    assertSame(value, scenarioMarketDataBox.getValue());
    assertSame(builderResult, actualValueResult);
  }

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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaScenarioMarketDataBoxResult =
        ScenarioMarketDataBox.metaScenarioMarketDataBox(cls);

    // Act
    Class<? extends ScenarioMarketDataBox<Object>> actualBeanTypeResult =
        metaScenarioMarketDataBoxResult.beanType();

    // Assert
    Class<ScenarioMarketDataBox> expectedBeanTypeResult = ScenarioMarketDataBox.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaScenarioMarketDataBoxResult =
        ScenarioMarketDataBox.metaScenarioMarketDataBox(cls);

    // Act and Assert
    assertNull(metaScenarioMarketDataBoxResult.metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'value'; then return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValue_thenReturnDirectMetaProperty() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaScenarioMarketDataBoxResult =
        ScenarioMarketDataBox.metaScenarioMarketDataBox(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaScenarioMarketDataBoxResult.metaPropertyGet("value");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("value", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<ScenarioArray> expectedPropertyTypeResult = ScenarioArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<ScenarioMarketDataBox> expectedDeclaringTypeResult = ScenarioMarketDataBox.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    assertSame(Meta.INSTANCE, actualMetaPropertyGetResult.metaBean());
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaScenarioMarketDataBoxResult =
        ScenarioMarketDataBox.metaScenarioMarketDataBox(cls);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        metaScenarioMarketDataBoxResult.metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("value");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("value", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ScenarioArray> expectedPropertyTypeResult = ScenarioArray.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<ScenarioMarketDataBox> expectedDeclaringTypeResult = ScenarioMarketDataBox.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultScenarioArray} with values is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then return DefaultScenarioArray with values is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnDefaultScenarioArrayWithValuesIsArrayList() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaScenarioMarketDataBoxResult =
        ScenarioMarketDataBox.metaScenarioMarketDataBox(cls);
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> bean = ScenarioMarketDataBox.of(value);

    // Act and Assert
    assertSame(value, metaScenarioMarketDataBoxResult.propertyGet(bean, "value", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenThrowNoSuchElementException() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaScenarioMarketDataBoxResult =
        ScenarioMarketDataBox.metaScenarioMarketDataBox(cls);
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> bean = ScenarioMarketDataBox.of(value);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaScenarioMarketDataBoxResult.propertyGet(bean, "Property Name", false));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaScenarioMarketDataBoxResult =
        ScenarioMarketDataBox.metaScenarioMarketDataBox(cls);

    // Act and Assert
    assertNull(
        metaScenarioMarketDataBoxResult.propertyGet(mock(Bean.class), "Property Name", true));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaScenarioMarketDataBoxResult =
        ScenarioMarketDataBox.metaScenarioMarketDataBox(cls);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            metaScenarioMarketDataBoxResult.propertySet(
                mock(Bean.class), "value", "New Value", false));
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
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaScenarioMarketDataBoxResult =
        ScenarioMarketDataBox.metaScenarioMarketDataBox(cls);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaScenarioMarketDataBoxResult.propertySet(
                mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'value'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValue_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaScenarioMarketDataBoxResult =
        ScenarioMarketDataBox.metaScenarioMarketDataBox(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaScenarioMarketDataBoxResult.propertySet(
                mock(Bean.class), "value", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#value()}.
   *
   * <p>Method under test: {@link Meta#value()}
   */
  @Test
  @DisplayName("Test Meta value()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.value()"})
  void testMetaValue() {
    // Arrange, Act and Assert
    assertTrue(ScenarioMarketDataBox.meta().value() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link ScenarioMarketDataBox#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>Then return ScenarioValue ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; given '42'; then return ScenarioValue ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketDataBox ScenarioMarketDataBox.of(List)"})
  void testOfWithList_given42_thenReturnScenarioValueScenarioCountIsOne() {
    // Arrange
    ArrayList<Object> values = new ArrayList<>();
    values.add("42");

    // Act
    ScenarioMarketDataBox<Object> actualOfResult = ScenarioMarketDataBox.of(values);

    // Assert
    ScenarioArray<Object> scenarioValue = actualOfResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertEquals(1, scenarioValue.getScenarioCount());
    assertEquals(1, actualOfResult.getScenarioCount());
    Stream<Object> streamResult = scenarioValue.stream();
    assertEquals(1, streamResult.limit(5).collect(Collectors.toList()).size());
    Stream<Object> streamResult2 = actualOfResult.stream();
    assertEquals(1, streamResult2.limit(5).collect(Collectors.toList()).size());
  }

  /**
   * Test {@link ScenarioMarketDataBox#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return ScenarioValue stream limit five collect toList size is two.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; then return ScenarioValue stream limit five collect toList size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketDataBox ScenarioMarketDataBox.of(List)"})
  void testOfWithList_thenReturnScenarioValueStreamLimitFiveCollectToListSizeIsTwo() {
    // Arrange
    ArrayList<Object> values = new ArrayList<>();
    values.add("42");
    values.add("42");

    // Act
    ScenarioMarketDataBox<Object> actualOfResult = ScenarioMarketDataBox.of(values);

    // Assert
    ScenarioArray<Object> scenarioValue = actualOfResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    Stream<Object> streamResult = scenarioValue.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    assertEquals("42", collectResult.get(1));
    Stream<Object> streamResult2 = actualOfResult.stream();
    List<Object> collectResult2 = streamResult2.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult2.size());
    assertEquals("42", collectResult2.get(1));
    assertEquals(2, scenarioValue.getScenarioCount());
    assertEquals(2, actualOfResult.getScenarioCount());
  }

  /**
   * Test {@link ScenarioMarketDataBox#of(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return ScenarioValue ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#of(List)}
   */
  @Test
  @DisplayName(
      "Test of(List) with 'List'; when ArrayList(); then return ScenarioValue ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketDataBox ScenarioMarketDataBox.of(List)"})
  void testOfWithList_whenArrayList_thenReturnScenarioValueScenarioCountIsZero() {
    // Arrange and Act
    ScenarioMarketDataBox<Object> actualOfResult = ScenarioMarketDataBox.of(new ArrayList<>());

    // Assert
    ScenarioArray<Object> scenarioValue = actualOfResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertEquals(0, scenarioValue.getScenarioCount());
    assertEquals(0, actualOfResult.getScenarioCount());
    Stream<Object> streamResult = scenarioValue.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Stream<Object> streamResult2 = actualOfResult.stream();
    assertTrue(streamResult2.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link ScenarioMarketDataBox#of(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>Then return ScenarioValue ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#of(Object[])}
   */
  @Test
  @DisplayName("Test of(Object[]) with 'Object[]'; then return ScenarioValue ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketDataBox ScenarioMarketDataBox.of(Object[])"})
  void testOfWithObject_thenReturnScenarioValueScenarioCountIsZero() {
    // Arrange and Act
    ScenarioMarketDataBox<Object> actualOfResult = ScenarioMarketDataBox.of();

    // Assert
    ScenarioArray<Object> scenarioValue = actualOfResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertEquals(0, scenarioValue.getScenarioCount());
    assertEquals(0, actualOfResult.getScenarioCount());
    assertTrue(((DefaultScenarioArray<Object>) scenarioValue).getValues().isEmpty());
    Stream<Object> streamResult = scenarioValue.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Stream<Object> streamResult2 = actualOfResult.stream();
    assertTrue(streamResult2.limit(5).collect(Collectors.toList()).isEmpty());
    assertSame(scenarioValue, actualOfResult.getValue());
  }

  /**
   * Test {@link ScenarioMarketDataBox#of(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code Values} and {@code Values}.
   *   <li>Then return ScenarioValue Values size is two.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#of(Object[])}
   */
  @Test
  @DisplayName(
      "Test of(Object[]) with 'Object[]'; when 'Values' and 'Values'; then return ScenarioValue Values size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketDataBox ScenarioMarketDataBox.of(Object[])"})
  void testOfWithObject_whenValuesAndValues_thenReturnScenarioValueValuesSizeIsTwo() {
    // Arrange and Act
    ScenarioMarketDataBox<Object> actualOfResult = ScenarioMarketDataBox.of("Values", "Values");

    // Assert
    ScenarioArray<Object> scenarioValue = actualOfResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    ImmutableList<Object> values = ((DefaultScenarioArray<Object>) scenarioValue).getValues();
    assertEquals(2, values.size());
    assertEquals("Values", values.get(1));
    Stream<Object> streamResult = scenarioValue.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult.size());
    assertEquals("Values", collectResult.get(1));
    Stream<Object> streamResult2 = actualOfResult.stream();
    List<Object> collectResult2 = streamResult2.limit(5).collect(Collectors.toList());
    assertEquals(2, collectResult2.size());
    assertEquals("Values", collectResult2.get(1));
    assertEquals(2, scenarioValue.getScenarioCount());
    assertEquals(2, actualOfResult.getScenarioCount());
    assertSame(scenarioValue, actualOfResult.getValue());
  }

  /**
   * Test {@link ScenarioMarketDataBox#of(Object[])} with {@code Object[]}.
   *
   * <ul>
   *   <li>When {@code Values}.
   *   <li>Then return ScenarioValue ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#of(Object[])}
   */
  @Test
  @DisplayName(
      "Test of(Object[]) with 'Object[]'; when 'Values'; then return ScenarioValue ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketDataBox ScenarioMarketDataBox.of(Object[])"})
  void testOfWithObject_whenValues_thenReturnScenarioValueScenarioCountIsOne() {
    // Arrange and Act
    ScenarioMarketDataBox<Object> actualOfResult = ScenarioMarketDataBox.of("Values");

    // Assert
    ScenarioArray<Object> scenarioValue = actualOfResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertEquals(1, scenarioValue.getScenarioCount());
    assertEquals(1, actualOfResult.getScenarioCount());
    assertEquals(1, ((DefaultScenarioArray<Object>) scenarioValue).getValues().size());
    Stream<Object> streamResult = scenarioValue.stream();
    assertEquals(1, streamResult.limit(5).collect(Collectors.toList()).size());
    Stream<Object> streamResult2 = actualOfResult.stream();
    assertEquals(1, streamResult2.limit(5).collect(Collectors.toList()).size());
    assertSame(scenarioValue, actualOfResult.getValue());
  }

  /**
   * Test {@link ScenarioMarketDataBox#of(ScenarioArray)} with {@code ScenarioArray}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#of(ScenarioArray)}
   */
  @Test
  @DisplayName("Test of(ScenarioArray) with 'ScenarioArray'; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioMarketDataBox ScenarioMarketDataBox.of(ScenarioArray)"})
  void testOfWithScenarioArray_thenReturnScenarioCountIsZero() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());

    // Act
    ScenarioMarketDataBox<Object> actualOfResult = ScenarioMarketDataBox.of(value);

    // Assert
    assertEquals(0, actualOfResult.getScenarioCount());
    assertFalse(actualOfResult.isSingleValue());
    assertTrue(actualOfResult.isScenarioValue());
    Stream<Object> streamResult = actualOfResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    assertSame(value, actualOfResult.getScenarioValue());
    assertSame(value, actualOfResult.getValue());
  }

  /**
   * Test {@link ScenarioMarketDataBox#getSingleValue()}.
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#getSingleValue()}
   */
  @Test
  @DisplayName("Test getSingleValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ScenarioMarketDataBox.getSingleValue()"})
  void testGetSingleValue() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.getSingleValue());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ScenarioMarketDataBox#toString()}
   *   <li>{@link ScenarioMarketDataBox#getScenarioValue()}
   *   <li>{@link ScenarioMarketDataBox#getValue()}
   *   <li>{@link ScenarioMarketDataBox#isSingleValue()}
   *   <li>{@link ScenarioMarketDataBox#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ScenarioArray ScenarioMarketDataBox.getScenarioValue()",
    "ScenarioArray ScenarioMarketDataBox.getValue()",
    "boolean ScenarioMarketDataBox.isSingleValue()",
    "Builder ScenarioMarketDataBox.toBuilder()",
    "String ScenarioMarketDataBox.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act
    String actualToStringResult = ofResult.toString();
    ScenarioArray<Object> actualScenarioValue = ofResult.getScenarioValue();
    ScenarioArray<Object> actualValue = ofResult.getValue();
    boolean actualIsSingleValueResult = ofResult.isSingleValue();
    ofResult.toBuilder();

    // Assert
    assertEquals(
        "ScenarioMarketDataBox{value=DefaultScenarioArray{values=[]}}", actualToStringResult);
    assertFalse(actualIsSingleValueResult);
    assertSame(value, actualScenarioValue);
    assertSame(value, actualValue);
  }

  /**
   * Test {@link ScenarioMarketDataBox#getValue(int)} with {@code int}.
   *
   * <ul>
   *   <li>Given {@link IntFunction} {@link IntFunction#apply(int)} return {@code Apply}.
   *   <li>When one.
   *   <li>Then return {@code Apply}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#getValue(int)}
   */
  @Test
  @DisplayName(
      "Test getValue(int) with 'int'; given IntFunction apply(int) return 'Apply'; when one; then return 'Apply'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ScenarioMarketDataBox.getValue(int)"})
  void testGetValueWithInt_givenIntFunctionApplyReturnApply_whenOne_thenReturnApply() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(3, valueFunction);
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act
    Object actualValue = ofResult.getValue(1);

    // Assert
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertEquals("Apply", actualValue);
  }

  /**
   * Test {@link ScenarioMarketDataBox#getValue(int)} with {@code int}.
   *
   * <ul>
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#getValue(int)}
   */
  @Test
  @DisplayName("Test getValue(int) with 'int'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object ScenarioMarketDataBox.getValue(int)"})
  void testGetValueWithInt_thenReturnValue() {
    // Arrange
    SingleScenarioArray<Object> value = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act and Assert
    assertEquals("Value", ofResult.getValue(1));
  }

  /**
   * Test {@link ScenarioMarketDataBox#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return three.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ScenarioMarketDataBox.getScenarioCount()"})
  void testGetScenarioCount_thenReturnThree() {
    // Arrange
    SingleScenarioArray<Object> value = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act and Assert
    assertEquals(3, ofResult.getScenarioCount());
  }

  /**
   * Test {@link ScenarioMarketDataBox#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ScenarioMarketDataBox.getScenarioCount()"})
  void testGetScenarioCount_thenReturnZero() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act and Assert
    assertEquals(0, ofResult.getScenarioCount());
  }

  /**
   * Test {@link ScenarioMarketDataBox#getMarketDataType()}.
   *
   * <ul>
   *   <li>Given {@link DefaultScenarioArray} with {@code Values}.
   *   <li>Then return {@link String}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#getMarketDataType()}
   */
  @Test
  @DisplayName(
      "Test getMarketDataType(); given DefaultScenarioArray with 'Values'; then return String")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class ScenarioMarketDataBox.getMarketDataType()"})
  void testGetMarketDataType_givenDefaultScenarioArrayWithValues_thenReturnString() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act
    Class<?> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }

  /**
   * Test {@link ScenarioMarketDataBox#getMarketDataType()}.
   *
   * <ul>
   *   <li>Given {@link SingleScenarioArray} with scenarioCount is three and {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#getMarketDataType()}
   */
  @Test
  @DisplayName(
      "Test getMarketDataType(); given SingleScenarioArray with scenarioCount is three and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class ScenarioMarketDataBox.getMarketDataType()"})
  void testGetMarketDataType_givenSingleScenarioArrayWithScenarioCountIsThreeAndValue() {
    // Arrange
    SingleScenarioArray<Object> value = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act
    Class<?> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }

  /**
   * Test {@link ScenarioMarketDataBox#map(Function)}.
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#map(Function)}
   */
  @Test
  @DisplayName("Test map(Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.map(Function)"})
  void testMap() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(Double.SIZE, valueFunction);
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    Function<Object, Object> fn = mock(Function.class);
    when(fn.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualMapResult = ofResult.map(fn);

    // Assert
    verify(fn, atLeast(1)).apply(isA(Object.class));
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertTrue(actualMapResult instanceof ScenarioMarketDataBox);
    assertEquals(ofResult, actualMapResult);
  }

  /**
   * Test {@link ScenarioMarketDataBox#map(Function)}.
   *
   * <ul>
   *   <li>Given {@link DefaultScenarioArray} with values is {@link ArrayList#ArrayList()}.
   *   <li>When {@link Function}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#map(Function)}
   */
  @Test
  @DisplayName(
      "Test map(Function); given DefaultScenarioArray with values is ArrayList(); when Function")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.map(Function)"})
  void testMap_givenDefaultScenarioArrayWithValuesIsArrayList_whenFunction() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act
    MarketDataBox<Object> actualMapResult = ofResult.map(mock(Function.class));

    // Assert
    assertTrue(actualMapResult instanceof ScenarioMarketDataBox);
    assertEquals(ofResult, actualMapResult);
  }

  /**
   * Test {@link ScenarioMarketDataBox#map(Function)}.
   *
   * <ul>
   *   <li>Given {@link DefaultScenarioArray} with {@code Values}.
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#map(Function)}
   */
  @Test
  @DisplayName(
      "Test map(Function); given DefaultScenarioArray with 'Values'; then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.map(Function)"})
  void testMap_givenDefaultScenarioArrayWithValues_thenReturnScenarioCountIsOne() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    Function<Object, Object> fn = mock(Function.class);
    when(fn.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualMapResult = ofResult.map(fn);

    // Assert
    verify(fn).apply(isA(Object.class));
    ScenarioArray<Object> scenarioValue = actualMapResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualMapResult instanceof ScenarioMarketDataBox);
    assertEquals(1, actualMapResult.getScenarioCount());
    assertEquals(1, scenarioValue.getScenarioCount());
    assertEquals(1, ((DefaultScenarioArray<Object>) scenarioValue).getValues().size());
    Stream<Object> streamResult = actualMapResult.stream();
    assertEquals(1, streamResult.limit(5).collect(Collectors.toList()).size());
    Stream<Object> streamResult2 = scenarioValue.stream();
    assertEquals(1, streamResult2.limit(5).collect(Collectors.toList()).size());
    assertSame(scenarioValue, ((ScenarioMarketDataBox<Object>) actualMapResult).getValue());
  }

  /**
   * Test {@link ScenarioMarketDataBox#map(Function)}.
   *
   * <ul>
   *   <li>Given {@link IllegalStateException#IllegalStateException()}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#map(Function)}
   */
  @Test
  @DisplayName(
      "Test map(Function); given IllegalStateException(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.map(Function)"})
  void testMap_givenIllegalStateException_thenThrowIllegalStateException() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    Function<Object, Object> fn = mock(Function.class);
    when(fn.apply(Mockito.<Object>any())).thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.map(fn));
    verify(fn).apply(isA(Object.class));
  }

  /**
   * Test {@link ScenarioMarketDataBox#map(Function)}.
   *
   * <ul>
   *   <li>Then calls {@link IntFunction#apply(int)}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#map(Function)}
   */
  @Test
  @DisplayName("Test map(Function); then calls apply(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.map(Function)"})
  void testMap_thenCallsApply() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(3, valueFunction);
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    Function<Object, Object> fn = mock(Function.class);
    when(fn.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualMapResult = ofResult.map(fn);

    // Assert
    verify(fn, atLeast(1)).apply(isA(Object.class));
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertTrue(actualMapResult instanceof ScenarioMarketDataBox);
    assertEquals(ofResult, actualMapResult);
  }

  /**
   * Test {@link ScenarioMarketDataBox#map(Function)}.
   *
   * <ul>
   *   <li>Then return ScenarioValue Values size is three.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#map(Function)}
   */
  @Test
  @DisplayName("Test map(Function); then return ScenarioValue Values size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.map(Function)"})
  void testMap_thenReturnScenarioValueValuesSizeIsThree() {
    // Arrange
    SingleScenarioArray<Object> value = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    Function<Object, Object> fn = mock(Function.class);
    when(fn.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualMapResult = ofResult.map(fn);

    // Assert
    verify(fn, atLeast(1)).apply(isA(Object.class));
    ScenarioArray<Object> scenarioValue = actualMapResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualMapResult instanceof ScenarioMarketDataBox);
    ImmutableList<Object> values = ((DefaultScenarioArray<Object>) scenarioValue).getValues();
    assertEquals(3, values.size());
    assertEquals("Apply", values.get(2));
    Stream<Object> streamResult = scenarioValue.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals("Apply", collectResult.get(2));
    assertEquals(3, actualMapResult.getScenarioCount());
    assertEquals(3, scenarioValue.getScenarioCount());
    Stream<Object> streamResult2 = actualMapResult.stream();
    assertEquals(3, streamResult2.limit(5).collect(Collectors.toList()).size());
    assertSame(scenarioValue, ((ScenarioMarketDataBox<Object>) actualMapResult).getValue());
  }

  /**
   * Test {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}.
   *
   * <ul>
   *   <li>Given {@link IllegalStateException#IllegalStateException()}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(int, ObjIntFunction); given IllegalStateException(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.mapWithIndex(int, ObjIntFunction)"})
  void testMapWithIndex_givenIllegalStateException_thenThrowIllegalStateException() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(3, valueFunction);
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    ObjIntFunction<Object, Object> fn = mock(ObjIntFunction.class);
    when(fn.apply(Mockito.<Object>any(), anyInt())).thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.mapWithIndex(3, fn));
    verify(fn).apply(isA(Object.class), eq(0));
    verify(valueFunction, atLeast(1)).apply(anyInt());
  }

  /**
   * Test {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}.
   *
   * <ul>
   *   <li>Given {@link SingleScenarioArray} with scenarioCount is three and {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(int, ObjIntFunction); given SingleScenarioArray with scenarioCount is three and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.mapWithIndex(int, ObjIntFunction)"})
  void testMapWithIndex_givenSingleScenarioArrayWithScenarioCountIsThreeAndValue() {
    // Arrange
    SingleScenarioArray<Object> value = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    ObjIntFunction<Object, Object> fn = mock(ObjIntFunction.class);
    when(fn.apply(Mockito.<Object>any(), anyInt())).thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.mapWithIndex(3, fn));
    verify(fn).apply(isA(Object.class), eq(0));
  }

  /**
   * Test {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}.
   *
   * <ul>
   *   <li>Then return {@link ScenarioMarketDataBox} with value is {@link DefaultScenarioArray}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(int, ObjIntFunction); then return ScenarioMarketDataBox with value is DefaultScenarioArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.mapWithIndex(int, ObjIntFunction)"})
  void testMapWithIndex_thenReturnScenarioMarketDataBoxWithValueIsDefaultScenarioArray() {
    // Arrange
    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(3, valueFunction);
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    ObjIntFunction<Object, Object> fn = mock(ObjIntFunction.class);
    when(fn.apply(Mockito.<Object>any(), anyInt())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualMapWithIndexResult = ofResult.mapWithIndex(3, fn);

    // Assert
    verify(fn, atLeast(1)).apply(isA(Object.class), anyInt());
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertTrue(actualMapWithIndexResult instanceof ScenarioMarketDataBox);
    assertEquals(ofResult, actualMapWithIndexResult);
  }

  /**
   * Test {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}.
   *
   * <ul>
   *   <li>Then ScenarioValue return {@link DefaultScenarioArray}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(int, ObjIntFunction); then ScenarioValue return DefaultScenarioArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.mapWithIndex(int, ObjIntFunction)"})
  void testMapWithIndex_thenScenarioValueReturnDefaultScenarioArray() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    ObjIntFunction<Object, Object> fn = mock(ObjIntFunction.class);
    when(fn.apply(Mockito.<Object>any(), anyInt())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualMapWithIndexResult = ofResult.mapWithIndex(1, fn);

    // Assert
    verify(fn).apply(isA(Object.class), eq(0));
    ScenarioArray<Object> scenarioValue = actualMapWithIndexResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualMapWithIndexResult instanceof ScenarioMarketDataBox);
    assertEquals(1, actualMapWithIndexResult.getScenarioCount());
    assertEquals(1, scenarioValue.getScenarioCount());
    assertEquals(1, ((DefaultScenarioArray<Object>) scenarioValue).getValues().size());
    Stream<Object> streamResult = actualMapWithIndexResult.stream();
    assertEquals(1, streamResult.limit(5).collect(Collectors.toList()).size());
    Stream<Object> streamResult2 = scenarioValue.stream();
    assertEquals(1, streamResult2.limit(5).collect(Collectors.toList()).size());
    assertSame(
        scenarioValue, ((ScenarioMarketDataBox<Object>) actualMapWithIndexResult).getValue());
  }

  /**
   * Test {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}
   */
  @Test
  @DisplayName("Test mapWithIndex(int, ObjIntFunction); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.mapWithIndex(int, ObjIntFunction)"})
  void testMapWithIndex_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.mapWithIndex(3, mock(ObjIntFunction.class)));
  }

  /**
   * Test {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}.
   *
   * <ul>
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#mapWithIndex(int, ObjIntFunction)}
   */
  @Test
  @DisplayName("Test mapWithIndex(int, ObjIntFunction); when zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.mapWithIndex(int, ObjIntFunction)"})
  void testMapWithIndex_whenZero() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act
    MarketDataBox<Object> actualMapWithIndexResult =
        ofResult.mapWithIndex(0, mock(ObjIntFunction.class));

    // Assert
    assertTrue(actualMapWithIndexResult instanceof ScenarioMarketDataBox);
    assertEquals(ofResult, actualMapWithIndexResult);
  }

  /**
   * Test {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When {@link IntFunction} {@link IntFunction#apply(int)} return {@code Apply}.
   *   <li>Then calls {@link IntFunction#apply(int)}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); given 'Apply'; when IntFunction apply(int) return 'Apply'; then calls apply(int)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_givenApply_whenIntFunctionApplyReturnApply_thenCallsApply() {
    // Arrange
    SingleScenarioArray<Object> value = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");
    DefaultScenarioArray<Object> value2 = DefaultScenarioArray.of(3, valueFunction);
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value2);

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.combineWith(other, fn));
    verify(fn).apply(isA(Object.class), isA(Object.class));
    verify(valueFunction, atLeast(1)).apply(anyInt());
  }

  /**
   * Test {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>Then return {@link ScenarioMarketDataBox} with value is {@link DefaultScenarioArray}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); then return ScenarioMarketDataBox with value is DefaultScenarioArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_thenReturnScenarioMarketDataBoxWithValueIsDefaultScenarioArray() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);
    DefaultScenarioArray<Object> value2 = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value2);

    // Act
    MarketDataBox<Object> actualCombineWithResult =
        ofResult.combineWith(other, mock(BiFunction.class));

    // Assert
    assertTrue(actualCombineWithResult instanceof ScenarioMarketDataBox);
    assertEquals(ofResult, actualCombineWithResult);
  }

  /**
   * Test {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>Then return {@link ScenarioMarketDataBox} with value is {@link DefaultScenarioArray}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); then return ScenarioMarketDataBox with value is DefaultScenarioArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_thenReturnScenarioMarketDataBoxWithValueIsDefaultScenarioArray2() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);
    SingleMarketDataBox<Object> other = SingleMarketDataBox.of("Value");

    // Act
    MarketDataBox<Object> actualCombineWithResult =
        ofResult.combineWith(other, mock(BiFunction.class));

    // Assert
    assertTrue(actualCombineWithResult instanceof ScenarioMarketDataBox);
    assertEquals(ofResult, actualCombineWithResult);
  }

  /**
   * Test {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>Then ScenarioValue return {@link DefaultScenarioArray}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); then ScenarioValue return DefaultScenarioArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_thenScenarioValueReturnDefaultScenarioArray() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);
    DefaultScenarioArray<Object> value2 = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value2);

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualCombineWithResult = ofResult.combineWith(other, fn);

    // Assert
    verify(fn).apply(isA(Object.class), isA(Object.class));
    ScenarioArray<Object> scenarioValue = actualCombineWithResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualCombineWithResult instanceof ScenarioMarketDataBox);
    ImmutableList<Object> values = ((DefaultScenarioArray<Object>) scenarioValue).getValues();
    assertEquals(1, values.size());
    assertEquals("Apply", values.get(0));
    Stream<Object> streamResult = actualCombineWithResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("Apply", collectResult.get(0));
    Stream<Object> streamResult2 = scenarioValue.stream();
    List<Object> collectResult2 = streamResult2.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult2.size());
    assertEquals("Apply", collectResult2.get(0));
    assertEquals(1, actualCombineWithResult.getScenarioCount());
    assertEquals(1, scenarioValue.getScenarioCount());
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, actualCombineWithResult.getMarketDataType());
    assertSame(scenarioValue, ((ScenarioMarketDataBox<Object>) actualCombineWithResult).getValue());
  }

  /**
   * Test {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName("Test combineWith(MarketDataBox, BiFunction); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_thenThrowIllegalArgumentException() {
    // Arrange
    SingleScenarioArray<Object> value = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);
    DefaultScenarioArray<Object> value2 = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value2);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.combineWith(other, mock(BiFunction.class)));
  }

  /**
   * Test {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link DefaultScenarioArray} with {@code Values}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); when DefaultScenarioArray with 'Values'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_whenDefaultScenarioArrayWithValues() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);
    DefaultScenarioArray<Object> value2 = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value2);

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.combineWith(other, fn));
    verify(fn).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link DefaultScenarioArray} with values is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); when DefaultScenarioArray with values is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_whenDefaultScenarioArrayWithValuesIsArrayList() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);
    DefaultScenarioArray<Object> value2 = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value2);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.combineWith(other, mock(BiFunction.class)));
  }

  /**
   * Test {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link SingleMarketDataBox} with {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName("Test combineWith(MarketDataBox, BiFunction); when SingleMarketDataBox with 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_whenSingleMarketDataBoxWithValue() {
    // Arrange
    SingleScenarioArray<Object> value = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);
    SingleMarketDataBox<Object> other = SingleMarketDataBox.of("Value");

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.combineWith(other, fn));
    verify(fn).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link SingleMarketDataBox} with {@code Value}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); when SingleMarketDataBox with 'Value'; then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_whenSingleMarketDataBoxWithValue_thenThrowIllegalStateException() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);
    SingleMarketDataBox<Object> other = SingleMarketDataBox.of("Value");

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.combineWith(other, fn));
    verify(fn).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link SingleScenarioArray} with scenarioCount is three and {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); when SingleScenarioArray with scenarioCount is three and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_whenSingleScenarioArrayWithScenarioCountIsThreeAndValue() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);
    SingleScenarioArray<Object> value2 = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value2);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.combineWith(other, mock(BiFunction.class)));
  }

  /**
   * Test {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link SingleScenarioArray} with scenarioCount is three and {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); when SingleScenarioArray with scenarioCount is three and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox ScenarioMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_whenSingleScenarioArrayWithScenarioCountIsThreeAndValue2() {
    // Arrange
    SingleScenarioArray<Object> value = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);
    SingleScenarioArray<Object> value2 = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value2);

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.combineWith(other, fn));
    verify(fn).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link ScenarioMarketDataBox#stream()}.
   *
   * <ul>
   *   <li>Then return limit five collect toList Empty.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#stream()}
   */
  @Test
  @DisplayName("Test stream(); then return limit five collect toList Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream ScenarioMarketDataBox.stream()"})
  void testStream_thenReturnLimitFiveCollectToListEmpty() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act
    Stream<Object> actualStreamResult = ofResult.stream();

    // Assert
    assertTrue(actualStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link ScenarioMarketDataBox#stream()}.
   *
   * <ul>
   *   <li>Then return limit five collect toList size is three.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#stream()}
   */
  @Test
  @DisplayName("Test stream(); then return limit five collect toList size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream ScenarioMarketDataBox.stream()"})
  void testStream_thenReturnLimitFiveCollectToListSizeIsThree() {
    // Arrange
    SingleScenarioArray<Object> value = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act
    Stream<Object> actualStreamResult = ofResult.stream();

    // Assert
    List<Object> collectResult = actualStreamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals("Value", collectResult.get(0));
    assertEquals("Value", collectResult.get(1));
    assertEquals("Value", collectResult.get(2));
  }

  /**
   * Test {@link ScenarioMarketDataBox#meta()}.
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ScenarioMarketDataBox.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ScenarioMarketDataBox.meta();

    // Assert
    MetaProperty<ScenarioArray> valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ScenarioArray> expectedPropertyTypeResult = ScenarioArray.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    Class<ScenarioMarketDataBox> expectedDeclaringTypeResult = ScenarioMarketDataBox.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
  }

  /**
   * Test {@link ScenarioMarketDataBox#metaScenarioMarketDataBox(Class)}.
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#metaScenarioMarketDataBox(Class)}
   */
  @Test
  @DisplayName("Test metaScenarioMarketDataBox(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ScenarioMarketDataBox.metaScenarioMarketDataBox(Class)"})
  void testMetaScenarioMarketDataBox() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Meta<Object> actualMetaScenarioMarketDataBoxResult =
        ScenarioMarketDataBox.metaScenarioMarketDataBox(cls);

    // Assert
    MetaProperty<ScenarioArray<Object>> valueResult = actualMetaScenarioMarketDataBoxResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaScenarioMarketDataBoxResult.isBuildable());
    Class<ScenarioArray> expectedPropertyTypeResult = ScenarioArray.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    Class<ScenarioMarketDataBox> expectedDeclaringTypeResult = ScenarioMarketDataBox.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
  }

  /**
   * Test {@link ScenarioMarketDataBox#metaBean()}.
   *
   * <p>Method under test: {@link ScenarioMarketDataBox#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ScenarioMarketDataBox.metaBean()"})
  void testMetaBean() {
    // Arrange
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> ofResult = ScenarioMarketDataBox.of(value);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }
}
