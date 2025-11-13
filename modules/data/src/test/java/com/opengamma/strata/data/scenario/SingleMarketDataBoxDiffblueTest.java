package com.opengamma.strata.data.scenario;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
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
import com.opengamma.strata.data.scenario.SingleMarketDataBox.Builder;
import com.opengamma.strata.data.scenario.SingleMarketDataBox.Meta;
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

class SingleMarketDataBoxDiffblueTest {
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
    Builder<Object> builderResult = SingleMarketDataBox.builder();

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
    Builder<Object> builderResult = SingleMarketDataBox.builder();

    // Act and Assert
    assertNull(builderResult.get("value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then builder build SingleValue is {@code New Value}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then builder build SingleValue is 'New Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenBuilderBuildSingleValueIsNewValue() {
    // Arrange
    Builder<Object> builderResult = SingleMarketDataBox.builder();

    // Act
    Builder<Object> actualSetResult = builderResult.set("value", "New Value");

    // Assert
    SingleMarketDataBox<Object> singleMarketDataBox = builderResult.build();
    assertEquals("New Value", singleMarketDataBox.getSingleValue());
    assertEquals("New Value", singleMarketDataBox.getValue());
    assertEquals(-1, singleMarketDataBox.getScenarioCount());
    assertFalse(singleMarketDataBox.isScenarioValue());
    assertTrue(singleMarketDataBox.isSingleValue());
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, singleMarketDataBox.getMarketDataType());
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
    Builder<Object> builderResult = SingleMarketDataBox.builder();

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
    Builder<Object> builderResult = SingleMarketDataBox.builder();

    // Act
    Builder<Object> actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#value(Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then builder build SingleValue is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#value(Object)}
   */
  @Test
  @DisplayName(
      "Test Builder value(Object); when 'Value'; then builder build SingleValue is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.value(Object)"})
  void testBuilderValue_whenValue_thenBuilderBuildSingleValueIsValue() {
    // Arrange
    Builder<Object> builderResult = SingleMarketDataBox.builder();

    // Act
    Builder<Object> actualValueResult = builderResult.value("Value");

    // Assert
    SingleMarketDataBox<Object> singleMarketDataBox = builderResult.build();
    assertEquals("Value", singleMarketDataBox.getSingleValue());
    assertEquals("Value", singleMarketDataBox.getValue());
    assertEquals(-1, singleMarketDataBox.getScenarioCount());
    assertFalse(singleMarketDataBox.isScenarioValue());
    assertTrue(singleMarketDataBox.isSingleValue());
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, singleMarketDataBox.getMarketDataType());
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
    Meta<Object> metaSingleMarketDataBoxResult = SingleMarketDataBox.metaSingleMarketDataBox(cls);

    // Act
    Class<? extends SingleMarketDataBox<Object>> actualBeanTypeResult =
        metaSingleMarketDataBoxResult.beanType();

    // Assert
    Class<SingleMarketDataBox> expectedBeanTypeResult = SingleMarketDataBox.class;
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
    Meta<Object> metaSingleMarketDataBoxResult = SingleMarketDataBox.metaSingleMarketDataBox(cls);

    // Act and Assert
    assertNull(metaSingleMarketDataBoxResult.metaPropertyGet("Property Name"));
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
    Meta<Object> metaSingleMarketDataBoxResult = SingleMarketDataBox.metaSingleMarketDataBox(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaSingleMarketDataBoxResult.metaPropertyGet("value");

    // Assert
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("value", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, actualMetaPropertyGetResult.style());
    Class<SingleMarketDataBox> expectedDeclaringTypeResult = SingleMarketDataBox.class;
    assertEquals(expectedDeclaringTypeResult, actualMetaPropertyGetResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
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
    Meta<Object> metaSingleMarketDataBoxResult = SingleMarketDataBox.metaSingleMarketDataBox(cls);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        metaSingleMarketDataBoxResult.metaPropertyMap();

    // Assert
    assertEquals(1, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("value");
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("value", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<SingleMarketDataBox> expectedDeclaringTypeResult = SingleMarketDataBox.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    assertSame(Meta.INSTANCE, getResult.metaBean());
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
    Meta<Object> metaSingleMarketDataBoxResult = SingleMarketDataBox.metaSingleMarketDataBox(cls);
    SingleMarketDataBox<Object> bean = SingleMarketDataBox.of("Value");

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaSingleMarketDataBoxResult.propertyGet(bean, "Property Name", false));
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
    Meta<Object> metaSingleMarketDataBoxResult = SingleMarketDataBox.metaSingleMarketDataBox(cls);

    // Act and Assert
    assertNull(metaSingleMarketDataBoxResult.propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValue_thenReturnValue() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaSingleMarketDataBoxResult = SingleMarketDataBox.metaSingleMarketDataBox(cls);
    SingleMarketDataBox<Object> bean = SingleMarketDataBox.of("Value");

    // Act and Assert
    assertEquals("Value", metaSingleMarketDataBoxResult.propertyGet(bean, "value", false));
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
    Meta<Object> metaSingleMarketDataBoxResult = SingleMarketDataBox.metaSingleMarketDataBox(cls);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            metaSingleMarketDataBoxResult.propertySet(
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
    Meta<Object> metaSingleMarketDataBoxResult = SingleMarketDataBox.metaSingleMarketDataBox(cls);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaSingleMarketDataBoxResult.propertySet(
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
    Meta<Object> metaSingleMarketDataBoxResult = SingleMarketDataBox.metaSingleMarketDataBox(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaSingleMarketDataBoxResult.propertySet(
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
    assertTrue(SingleMarketDataBox.meta().value() instanceof DirectMetaProperty);
  }

  /**
   * Test {@link SingleMarketDataBox#of(Object)}.
   *
   * <ul>
   *   <li>When {@code Value}.
   *   <li>Then return SingleValue is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#of(Object)}
   */
  @Test
  @DisplayName("Test of(Object); when 'Value'; then return SingleValue is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SingleMarketDataBox SingleMarketDataBox.of(Object)"})
  void testOf_whenValue_thenReturnSingleValueIsValue() {
    // Arrange and Act
    SingleMarketDataBox<Object> actualOfResult = SingleMarketDataBox.of("Value");

    // Assert
    assertEquals("Value", actualOfResult.getSingleValue());
    assertEquals("Value", actualOfResult.getValue());
    assertEquals(-1, actualOfResult.getScenarioCount());
    assertFalse(actualOfResult.isScenarioValue());
    assertTrue(actualOfResult.isSingleValue());
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
  }

  /**
   * Test {@link SingleMarketDataBox#getScenarioValue()}.
   *
   * <p>Method under test: {@link SingleMarketDataBox#getScenarioValue()}
   */
  @Test
  @DisplayName("Test getScenarioValue()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioArray SingleMarketDataBox.getScenarioValue()"})
  void testGetScenarioValue() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.getScenarioValue());
  }

  /**
   * Test {@link SingleMarketDataBox#getValue(int)} with {@code int}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#getValue(int)}
   */
  @Test
  @DisplayName("Test getValue(int) with 'int'; when one; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object SingleMarketDataBox.getValue(int)"})
  void testGetValueWithInt_whenOne_thenReturnValue() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    // Act and Assert
    assertEquals("Value", ofResult.getValue(1));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingleMarketDataBox#toString()}
   *   <li>{@link SingleMarketDataBox#getScenarioCount()}
   *   <li>{@link SingleMarketDataBox#getSingleValue()}
   *   <li>{@link SingleMarketDataBox#getValue()}
   *   <li>{@link SingleMarketDataBox#isSingleValue()}
   *   <li>{@link SingleMarketDataBox#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "int SingleMarketDataBox.getScenarioCount()",
    "Object SingleMarketDataBox.getSingleValue()",
    "Object SingleMarketDataBox.getValue()",
    "boolean SingleMarketDataBox.isSingleValue()",
    "Builder SingleMarketDataBox.toBuilder()",
    "String SingleMarketDataBox.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    // Act
    String actualToStringResult = ofResult.toString();
    int actualScenarioCount = ofResult.getScenarioCount();
    Object actualSingleValue = ofResult.getSingleValue();
    Object actualValue = ofResult.getValue();
    boolean actualIsSingleValueResult = ofResult.isSingleValue();
    ofResult.toBuilder();

    // Assert
    assertEquals("SingleMarketDataBox{value=Value}", actualToStringResult);
    assertEquals("Value", actualSingleValue);
    assertEquals("Value", actualValue);
    assertEquals(-1, actualScenarioCount);
    assertTrue(actualIsSingleValueResult);
  }

  /**
   * Test {@link SingleMarketDataBox#getMarketDataType()}.
   *
   * <p>Method under test: {@link SingleMarketDataBox#getMarketDataType()}
   */
  @Test
  @DisplayName("Test getMarketDataType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class SingleMarketDataBox.getMarketDataType()"})
  void testGetMarketDataType() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    // Act
    Class<?> actualMarketDataType = ofResult.getMarketDataType();

    // Assert
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
  }

  /**
   * Test {@link SingleMarketDataBox#map(Function)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code Apply}.
   *   <li>Then return {@link SingleMarketDataBox}.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#map(Function)}
   */
  @Test
  @DisplayName(
      "Test map(Function); given 'Apply'; when Function apply(Object) return 'Apply'; then return SingleMarketDataBox")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.map(Function)"})
  void testMap_givenApply_whenFunctionApplyReturnApply_thenReturnSingleMarketDataBox() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    Function<Object, Object> fn = mock(Function.class);
    when(fn.apply(Mockito.<Object>any())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualMapResult = ofResult.map(fn);

    // Assert
    verify(fn).apply(isA(Object.class));
    assertTrue(actualMapResult instanceof SingleMarketDataBox);
    assertEquals("Apply", actualMapResult.getSingleValue());
    assertEquals("Apply", ((SingleMarketDataBox<Object>) actualMapResult).getValue());
    assertEquals(-1, actualMapResult.getScenarioCount());
    assertFalse(actualMapResult.isScenarioValue());
    assertTrue(actualMapResult.isSingleValue());
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, actualMapResult.getMarketDataType());
  }

  /**
   * Test {@link SingleMarketDataBox#map(Function)}.
   *
   * <ul>
   *   <li>Given {@link IllegalStateException#IllegalStateException()}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#map(Function)}
   */
  @Test
  @DisplayName(
      "Test map(Function); given IllegalStateException(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.map(Function)"})
  void testMap_givenIllegalStateException_thenThrowIllegalStateException() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    Function<Object, Object> fn = mock(Function.class);
    when(fn.apply(Mockito.<Object>any())).thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.map(fn));
    verify(fn).apply(isA(Object.class));
  }

  /**
   * Test {@link SingleMarketDataBox#mapWithIndex(int, ObjIntFunction)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When one.
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#mapWithIndex(int, ObjIntFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(int, ObjIntFunction); given 'Apply'; when one; then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.mapWithIndex(int, ObjIntFunction)"})
  void testMapWithIndex_givenApply_whenOne_thenReturnScenarioCountIsOne() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

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
   * Test {@link SingleMarketDataBox#mapWithIndex(int, ObjIntFunction)}.
   *
   * <ul>
   *   <li>Given {@code Apply}.
   *   <li>When three.
   *   <li>Then return ScenarioValue Values size is three.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#mapWithIndex(int, ObjIntFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(int, ObjIntFunction); given 'Apply'; when three; then return ScenarioValue Values size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.mapWithIndex(int, ObjIntFunction)"})
  void testMapWithIndex_givenApply_whenThree_thenReturnScenarioValueValuesSizeIsThree() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    ObjIntFunction<Object, Object> fn = mock(ObjIntFunction.class);
    when(fn.apply(Mockito.<Object>any(), anyInt())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualMapWithIndexResult = ofResult.mapWithIndex(3, fn);

    // Assert
    verify(fn, atLeast(1)).apply(isA(Object.class), anyInt());
    ScenarioArray<Object> scenarioValue = actualMapWithIndexResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualMapWithIndexResult instanceof ScenarioMarketDataBox);
    ImmutableList<Object> values = ((DefaultScenarioArray<Object>) scenarioValue).getValues();
    assertEquals(3, values.size());
    assertEquals("Apply", values.get(2));
    Stream<Object> streamResult = scenarioValue.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals("Apply", collectResult.get(2));
    assertEquals(3, actualMapWithIndexResult.getScenarioCount());
    assertEquals(3, scenarioValue.getScenarioCount());
    Stream<Object> streamResult2 = actualMapWithIndexResult.stream();
    assertEquals(3, streamResult2.limit(5).collect(Collectors.toList()).size());
    assertSame(
        scenarioValue, ((ScenarioMarketDataBox<Object>) actualMapWithIndexResult).getValue());
  }

  /**
   * Test {@link SingleMarketDataBox#mapWithIndex(int, ObjIntFunction)}.
   *
   * <ul>
   *   <li>Given {@link IllegalStateException#IllegalStateException()}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#mapWithIndex(int, ObjIntFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(int, ObjIntFunction); given IllegalStateException(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.mapWithIndex(int, ObjIntFunction)"})
  void testMapWithIndex_givenIllegalStateException_thenThrowIllegalStateException() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    ObjIntFunction<Object, Object> fn = mock(ObjIntFunction.class);
    when(fn.apply(Mockito.<Object>any(), anyInt())).thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.mapWithIndex(3, fn));
    verify(fn).apply(isA(Object.class), eq(0));
  }

  /**
   * Test {@link SingleMarketDataBox#mapWithIndex(int, ObjIntFunction)}.
   *
   * <ul>
   *   <li>When {@link Double#SIZE}.
   *   <li>Then return stream limit five collect toList size is five.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#mapWithIndex(int, ObjIntFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(int, ObjIntFunction); when SIZE; then return stream limit five collect toList size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.mapWithIndex(int, ObjIntFunction)"})
  void testMapWithIndex_whenSize_thenReturnStreamLimitFiveCollectToListSizeIsFive() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    ObjIntFunction<Object, Object> fn = mock(ObjIntFunction.class);
    when(fn.apply(Mockito.<Object>any(), anyInt())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualMapWithIndexResult = ofResult.mapWithIndex(Double.SIZE, fn);

    // Assert
    verify(fn, atLeast(1)).apply(isA(Object.class), anyInt());
    ScenarioArray<Object> scenarioValue = actualMapWithIndexResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualMapWithIndexResult instanceof ScenarioMarketDataBox);
    Stream<Object> streamResult = actualMapWithIndexResult.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(5, collectResult.size());
    assertEquals("Apply", collectResult.get(3));
    assertEquals("Apply", collectResult.get(4));
    Stream<Object> streamResult2 = scenarioValue.stream();
    assertEquals(5, streamResult2.limit(5).collect(Collectors.toList()).size());
    assertEquals(Double.SIZE, actualMapWithIndexResult.getScenarioCount());
    assertEquals(Double.SIZE, scenarioValue.getScenarioCount());
    assertEquals(Double.SIZE, ((DefaultScenarioArray<Object>) scenarioValue).getValues().size());
    assertSame(
        scenarioValue, ((ScenarioMarketDataBox<Object>) actualMapWithIndexResult).getValue());
  }

  /**
   * Test {@link SingleMarketDataBox#mapWithIndex(int, ObjIntFunction)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#mapWithIndex(int, ObjIntFunction)}
   */
  @Test
  @DisplayName(
      "Test mapWithIndex(int, ObjIntFunction); when zero; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.mapWithIndex(int, ObjIntFunction)"})
  void testMapWithIndex_whenZero_thenReturnScenarioCountIsZero() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    // Act
    MarketDataBox<Object> actualMapWithIndexResult =
        ofResult.mapWithIndex(0, mock(ObjIntFunction.class));

    // Assert
    ScenarioArray<Object> scenarioValue = actualMapWithIndexResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualMapWithIndexResult instanceof ScenarioMarketDataBox);
    assertEquals(0, actualMapWithIndexResult.getScenarioCount());
    assertEquals(0, scenarioValue.getScenarioCount());
    assertTrue(((DefaultScenarioArray<Object>) scenarioValue).getValues().isEmpty());
    Stream<Object> streamResult = actualMapWithIndexResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Stream<Object> streamResult2 = scenarioValue.stream();
    assertTrue(streamResult2.limit(5).collect(Collectors.toList()).isEmpty());
    assertSame(
        scenarioValue, ((ScenarioMarketDataBox<Object>) actualMapWithIndexResult).getValue());
  }

  /**
   * Test {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <p>Method under test: {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName("Test combineWith(MarketDataBox, BiFunction)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(3, valueFunction);
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value);

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualCombineWithResult = ofResult.combineWith(other, fn);

    // Assert
    verify(fn, atLeast(1)).apply(isA(Object.class), isA(Object.class));
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertTrue(actualCombineWithResult instanceof ScenarioMarketDataBox);
    assertEquals(other, actualCombineWithResult);
  }

  /**
   * Test {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <p>Method under test: {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName("Test combineWith(MarketDataBox, BiFunction)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith2() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    IntFunction<Object> valueFunction = mock(IntFunction.class);
    when(valueFunction.apply(anyInt())).thenReturn("Apply");
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(Double.SIZE, valueFunction);
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value);

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualCombineWithResult = ofResult.combineWith(other, fn);

    // Assert
    verify(fn, atLeast(1)).apply(isA(Object.class), isA(Object.class));
    verify(valueFunction, atLeast(1)).apply(anyInt());
    assertTrue(actualCombineWithResult instanceof ScenarioMarketDataBox);
    assertEquals(other, actualCombineWithResult);
  }

  /**
   * Test {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>Given {@link IllegalStateException#IllegalStateException()}.
   *   <li>Then throw {@link IllegalStateException}.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); given IllegalStateException(); then throw IllegalStateException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_givenIllegalStateException_thenThrowIllegalStateException() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value);

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any()))
        .thenThrow(new IllegalStateException());

    // Act and Assert
    assertThrows(IllegalStateException.class, () -> ofResult.combineWith(other, fn));
    verify(fn).apply(isA(Object.class), isA(Object.class));
  }

  /**
   * Test {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>Then return ScenarioValue Values size is three.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); then return ScenarioValue Values size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_thenReturnScenarioValueValuesSizeIsThree() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of(42);
    SingleScenarioArray<Object> value = SingleScenarioArray.of(3, "Value");
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value);

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualCombineWithResult = ofResult.combineWith(other, fn);

    // Assert
    verify(fn, atLeast(1)).apply(isA(Object.class), isA(Object.class));
    ScenarioArray<Object> scenarioValue = actualCombineWithResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualCombineWithResult instanceof ScenarioMarketDataBox);
    ImmutableList<Object> values = ((DefaultScenarioArray<Object>) scenarioValue).getValues();
    assertEquals(3, values.size());
    assertEquals("Apply", values.get(2));
    Stream<Object> streamResult = scenarioValue.stream();
    List<Object> collectResult = streamResult.limit(5).collect(Collectors.toList());
    assertEquals(3, collectResult.size());
    assertEquals("Apply", collectResult.get(2));
    assertEquals(3, actualCombineWithResult.getScenarioCount());
    assertEquals(3, scenarioValue.getScenarioCount());
    Stream<Object> streamResult2 = actualCombineWithResult.stream();
    assertEquals(3, streamResult2.limit(5).collect(Collectors.toList()).size());
    assertSame(scenarioValue, ((ScenarioMarketDataBox<Object>) actualCombineWithResult).getValue());
  }

  /**
   * Test {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link DefaultScenarioArray} with values is {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); when DefaultScenarioArray with values is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_whenDefaultScenarioArrayWithValuesIsArrayList() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of(new ArrayList<>());
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value);

    // Act
    MarketDataBox<Object> actualCombineWithResult =
        ofResult.combineWith(other, mock(BiFunction.class));

    // Assert
    assertTrue(actualCombineWithResult instanceof ScenarioMarketDataBox);
    assertEquals(other, actualCombineWithResult);
  }

  /**
   * Test {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link DefaultScenarioArray} with {@code Values}.
   *   <li>Then return ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); when DefaultScenarioArray with 'Values'; then return ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_whenDefaultScenarioArrayWithValues_thenReturnScenarioCountIsOne() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");
    DefaultScenarioArray<Object> value = DefaultScenarioArray.of("Values");
    ScenarioMarketDataBox<Object> other = ScenarioMarketDataBox.of(value);

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualCombineWithResult = ofResult.combineWith(other, fn);

    // Assert
    verify(fn).apply(isA(Object.class), isA(Object.class));
    ScenarioArray<Object> scenarioValue = actualCombineWithResult.getScenarioValue();
    assertTrue(scenarioValue instanceof DefaultScenarioArray);
    assertTrue(actualCombineWithResult instanceof ScenarioMarketDataBox);
    assertEquals(1, actualCombineWithResult.getScenarioCount());
    assertEquals(1, scenarioValue.getScenarioCount());
    assertEquals(1, ((DefaultScenarioArray<Object>) scenarioValue).getValues().size());
    Stream<Object> streamResult = actualCombineWithResult.stream();
    assertEquals(1, streamResult.limit(5).collect(Collectors.toList()).size());
    Stream<Object> streamResult2 = scenarioValue.stream();
    assertEquals(1, streamResult2.limit(5).collect(Collectors.toList()).size());
    assertSame(scenarioValue, ((ScenarioMarketDataBox<Object>) actualCombineWithResult).getValue());
  }

  /**
   * Test {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link SingleMarketDataBox} with {@code Value}.
   *   <li>Then return {@link SingleMarketDataBox}.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#combineWith(MarketDataBox, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test combineWith(MarketDataBox, BiFunction); when SingleMarketDataBox with 'Value'; then return SingleMarketDataBox")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataBox SingleMarketDataBox.combineWith(MarketDataBox, BiFunction)"})
  void testCombineWith_whenSingleMarketDataBoxWithValue_thenReturnSingleMarketDataBox() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of(42);
    SingleMarketDataBox<Object> other = SingleMarketDataBox.of("Value");

    BiFunction<Object, Object, Object> fn = mock(BiFunction.class);
    when(fn.apply(Mockito.<Object>any(), Mockito.<Object>any())).thenReturn("Apply");

    // Act
    MarketDataBox<Object> actualCombineWithResult = ofResult.combineWith(other, fn);

    // Assert
    verify(fn).apply(isA(Object.class), isA(Object.class));
    assertTrue(actualCombineWithResult instanceof SingleMarketDataBox);
    assertEquals("Apply", actualCombineWithResult.getSingleValue());
    assertEquals("Apply", ((SingleMarketDataBox<Object>) actualCombineWithResult).getValue());
    assertEquals(-1, actualCombineWithResult.getScenarioCount());
    assertFalse(actualCombineWithResult.isScenarioValue());
    assertTrue(actualCombineWithResult.isSingleValue());
    Class<String> expectedMarketDataType = String.class;
    assertEquals(expectedMarketDataType, actualCombineWithResult.getMarketDataType());
  }

  /**
   * Test {@link SingleMarketDataBox#stream()}.
   *
   * <p>Method under test: {@link SingleMarketDataBox#stream()}
   */
  @Test
  @DisplayName("Test stream()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Stream SingleMarketDataBox.stream()"})
  void testStream() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    // Act
    Stream<Object> actualStreamResult = ofResult.stream();

    // Assert
    List<Object> collectResult = actualStreamResult.limit(5).collect(Collectors.toList());
    assertEquals(1, collectResult.size());
    assertEquals("Value", collectResult.get(0));
  }

  /**
   * Test {@link SingleMarketDataBox#meta()}.
   *
   * <p>Method under test: {@link SingleMarketDataBox#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SingleMarketDataBox.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SingleMarketDataBox.meta();

    // Assert
    MetaProperty valueResult = actualMetaResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<SingleMarketDataBox> expectedDeclaringTypeResult = SingleMarketDataBox.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
  }

  /**
   * Test {@link SingleMarketDataBox#metaSingleMarketDataBox(Class)}.
   *
   * <p>Method under test: {@link SingleMarketDataBox#metaSingleMarketDataBox(Class)}
   */
  @Test
  @DisplayName("Test metaSingleMarketDataBox(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SingleMarketDataBox.metaSingleMarketDataBox(Class)"})
  void testMetaSingleMarketDataBox() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Meta<Object> actualMetaSingleMarketDataBoxResult =
        SingleMarketDataBox.metaSingleMarketDataBox(cls);

    // Assert
    MetaProperty<Object> valueResult = actualMetaSingleMarketDataBoxResult.value();
    assertTrue(valueResult instanceof DirectMetaProperty);
    assertEquals("value", valueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, valueResult.style());
    assertTrue(actualMetaSingleMarketDataBoxResult.isBuildable());
    Class<SingleMarketDataBox> expectedDeclaringTypeResult = SingleMarketDataBox.class;
    assertEquals(expectedDeclaringTypeResult, valueResult.declaringType());
    Class<Object> expectedPropertyTypeResult = Object.class;
    assertEquals(expectedPropertyTypeResult, valueResult.propertyType());
    assertSame(Meta.INSTANCE, valueResult.metaBean());
  }

  /**
   * Test {@link SingleMarketDataBox#metaBean()}.
   *
   * <p>Method under test: {@link SingleMarketDataBox#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SingleMarketDataBox.metaBean()"})
  void testMetaBean() {
    // Arrange
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link SingleMarketDataBox#equals(Object)}, and {@link SingleMarketDataBox#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingleMarketDataBox#equals(Object)}
   *   <li>{@link SingleMarketDataBox#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleMarketDataBox.equals(Object)",
    "int SingleMarketDataBox.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder<Object> builderResult = SingleMarketDataBox.builder();
    SingleMarketDataBox<Object> singleMarketDataBox =
        builderResult.set("value", "New Value").build();

    Builder<Object> builderResult2 = SingleMarketDataBox.builder();
    SingleMarketDataBox<Object> singleMarketDataBox2 =
        builderResult2.set("value", "New Value").build();

    // Act and Assert
    assertEquals(singleMarketDataBox, singleMarketDataBox2);
    assertEquals(singleMarketDataBox.hashCode(), singleMarketDataBox2.hashCode());
  }

  /**
   * Test {@link SingleMarketDataBox#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleMarketDataBox.equals(Object)",
    "int SingleMarketDataBox.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder<Object> builderResult = SingleMarketDataBox.builder();
    SingleMarketDataBox<Object> singleMarketDataBox = builderResult.set("value", 42).build();

    Builder<Object> builderResult2 = SingleMarketDataBox.builder();

    // Act and Assert
    assertNotEquals(singleMarketDataBox, builderResult2.set("value", "New Value").build());
  }

  /**
   * Test {@link SingleMarketDataBox#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleMarketDataBox#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleMarketDataBox.equals(Object)",
    "int SingleMarketDataBox.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder<Object> builderResult = SingleMarketDataBox.builder();
    SingleMarketDataBox<Object> ofResult = SingleMarketDataBox.of("Value");
    SingleMarketDataBox<Object> singleMarketDataBox = builderResult.set("value", ofResult).build();

    Builder<Object> builderResult2 = SingleMarketDataBox.builder();

    // Act and Assert
    assertNotEquals(singleMarketDataBox, builderResult2.set("value", "New Value").build());
  }
}
