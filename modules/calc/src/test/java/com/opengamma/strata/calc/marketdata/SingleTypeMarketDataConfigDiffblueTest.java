package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.calc.marketdata.SingleTypeMarketDataConfig.Builder;
import com.opengamma.strata.calc.marketdata.SingleTypeMarketDataConfig.Meta;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SingleTypeMarketDataConfigDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SingleTypeMarketDataConfig Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualBuilderResult = SingleTypeMarketDataConfig.builder();
    Builder actualConfigObjectsResult = actualBuilderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;
    SingleTypeMarketDataConfig actualSingleTypeMarketDataConfig =
        actualConfigObjectsResult.configType(configType).build();

    // Assert
    Class<Object> expectedConfigType = Object.class;
    assertEquals(expectedConfigType, actualSingleTypeMarketDataConfig.getConfigType());
  }

  /**
   * Test Builder {@link Builder#configObjects(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#configObjects(Map)}
   */
  @Test
  @DisplayName("Test Builder configObjects(Map); when HashMap(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.configObjects(Map)"})
  void testBuilderConfigObjects_whenHashMap_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SingleTypeMarketDataConfig.builder();

    // Act
    Builder actualConfigObjectsResult = builderResult.configObjects(new HashMap<>());

    // Assert
    assertSame(builderResult, actualConfigObjectsResult);
  }

  /**
   * Test Builder {@link Builder#configType(Class)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then builder build ConfigType is {@link Object}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#configType(Class)}
   */
  @Test
  @DisplayName(
      "Test Builder configType(Class); when 'java.lang.Object'; then builder build ConfigType is Object")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.configType(Class)"})
  void testBuilderConfigType_whenJavaLangObject_thenBuilderBuildConfigTypeIsObject() {
    // Arrange
    Builder builderResult = SingleTypeMarketDataConfig.builder();
    Class<Object> configType = Object.class;

    // Act
    Builder actualConfigTypeResult = builderResult.configType(configType);

    // Assert
    Class<Object> expectedConfigType = Object.class;
    assertEquals(expectedConfigType, builderResult.build().getConfigType());
    assertSame(builderResult, actualConfigTypeResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code configObjects}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'configObjects'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenConfigObjects_thenReturnMap() {
    // Arrange and Act
    Object actualGetResult = SingleTypeMarketDataConfig.builder().get("configObjects");

    // Assert
    assertTrue(actualGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code configType}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'configType'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenConfigType_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(SingleTypeMarketDataConfig.builder().get("configType"));
  }

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
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> SingleTypeMarketDataConfig.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then return build ConfigObjects Empty.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then return build ConfigObjects Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenReturnBuildConfigObjectsEmpty() {
    // Arrange
    Builder builderResult = SingleTypeMarketDataConfig.builder();
    Class<Object> forNameResult = Object.class;

    // Act and Assert
    SingleTypeMarketDataConfig singleTypeMarketDataConfig =
        builderResult.set("configType", forNameResult).build();
    assertTrue(singleTypeMarketDataConfig.getConfigObjects().isEmpty());
    Class<Object> expectedConfigType = Object.class;
    assertEquals(expectedConfigType, singleTypeMarketDataConfig.getConfigType());
    Class<Object> expectedConfigType2 = Object.class;
    assertEquals(expectedConfigType2, builderResult.build().getConfigType());
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
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> SingleTypeMarketDataConfig.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code configObjects}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'configObjects'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenConfigObjects_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SingleTypeMarketDataConfig.builder();

    // Act
    Builder actualSetResult = builderResult.set("configObjects", new HashMap<>());

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Builder builderResult = SingleTypeMarketDataConfig.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link SingleTypeMarketDataConfig#meta()}.
   *
   * <p>Method under test: {@link SingleTypeMarketDataConfig#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SingleTypeMarketDataConfig.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SingleTypeMarketDataConfig.meta();

    // Assert
    MetaProperty<ImmutableMap<String, Object>> configObjectsResult =
        actualMetaResult.configObjects();
    assertTrue(configObjectsResult instanceof DirectMetaProperty);
    MetaProperty<Class<?>> configTypeResult = actualMetaResult.configType();
    assertTrue(configTypeResult instanceof DirectMetaProperty);
    assertEquals("configObjects", configObjectsResult.name());
    assertEquals("configType", configTypeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, configObjectsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, configTypeResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, configObjectsResult.propertyType());
    Class<SingleTypeMarketDataConfig> expectedDeclaringTypeResult =
        SingleTypeMarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, configObjectsResult.declaringType());
    Class<SingleTypeMarketDataConfig> expectedDeclaringTypeResult2 =
        SingleTypeMarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult2, configTypeResult.declaringType());
    Class<Class> expectedPropertyTypeResult2 = Class.class;
    assertEquals(expectedPropertyTypeResult2, configTypeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, configObjectsResult.metaBean());
    assertSame(meta, configTypeResult.metaBean());
  }

  /**
   * Test {@link SingleTypeMarketDataConfig#metaBean()}.
   *
   * <p>Method under test: {@link SingleTypeMarketDataConfig#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SingleTypeMarketDataConfig.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;

    // Act and Assert
    assertSame(Meta.INSTANCE, configObjectsResult.configType(configType).build().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingleTypeMarketDataConfig#toString()}
   *   <li>{@link SingleTypeMarketDataConfig#getConfigObjects()}
   *   <li>{@link SingleTypeMarketDataConfig#getConfigType()}
   *   <li>{@link SingleTypeMarketDataConfig#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap SingleTypeMarketDataConfig.getConfigObjects()",
    "Class SingleTypeMarketDataConfig.getConfigType()",
    "Builder SingleTypeMarketDataConfig.toBuilder()",
    "String SingleTypeMarketDataConfig.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;
    SingleTypeMarketDataConfig singleTypeMarketDataConfig =
        configObjectsResult.configType(configType).build();

    // Act
    String actualToStringResult = singleTypeMarketDataConfig.toString();
    ImmutableMap<String, Object> actualConfigObjects =
        singleTypeMarketDataConfig.getConfigObjects();
    Class<?> actualConfigType = singleTypeMarketDataConfig.getConfigType();
    singleTypeMarketDataConfig.toBuilder();

    // Assert
    assertEquals(
        "SingleTypeMarketDataConfig{configType=class java.lang.Object, configObjects={}}",
        actualToStringResult);
    assertTrue(actualConfigObjects.isEmpty());
    Class<Object> expectedConfigType = Object.class;
    assertEquals(expectedConfigType, actualConfigType);
  }

  /**
   * Test {@link SingleTypeMarketDataConfig#equals(Object)}, and {@link
   * SingleTypeMarketDataConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingleTypeMarketDataConfig#equals(Object)}
   *   <li>{@link SingleTypeMarketDataConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleTypeMarketDataConfig.equals(Object)",
    "int SingleTypeMarketDataConfig.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;
    SingleTypeMarketDataConfig singleTypeMarketDataConfig =
        configObjectsResult.configType(configType).build();

    Builder builderResult2 = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult2 = builderResult2.configObjects(new HashMap<>());
    Class<Object> configType2 = Object.class;
    SingleTypeMarketDataConfig singleTypeMarketDataConfig2 =
        configObjectsResult2.configType(configType2).build();

    // Act and Assert
    assertEquals(singleTypeMarketDataConfig, singleTypeMarketDataConfig2);
    assertEquals(singleTypeMarketDataConfig.hashCode(), singleTypeMarketDataConfig2.hashCode());
  }

  /**
   * Test {@link SingleTypeMarketDataConfig#equals(Object)}, and {@link
   * SingleTypeMarketDataConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SingleTypeMarketDataConfig#equals(Object)}
   *   <li>{@link SingleTypeMarketDataConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleTypeMarketDataConfig.equals(Object)",
    "int SingleTypeMarketDataConfig.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;
    SingleTypeMarketDataConfig singleTypeMarketDataConfig =
        configObjectsResult.configType(configType).build();

    // Act and Assert
    assertEquals(singleTypeMarketDataConfig, singleTypeMarketDataConfig);
    int expectedHashCodeResult = singleTypeMarketDataConfig.hashCode();
    assertEquals(expectedHashCodeResult, singleTypeMarketDataConfig.hashCode());
  }

  /**
   * Test {@link SingleTypeMarketDataConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleTypeMarketDataConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleTypeMarketDataConfig.equals(Object)",
    "int SingleTypeMarketDataConfig.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMap<String, Object> configObjects = new HashMap<>();
    configObjects.put("Key", "Value");

    Builder configObjectsResult = SingleTypeMarketDataConfig.builder().configObjects(configObjects);
    Class<Object> configType = Object.class;
    SingleTypeMarketDataConfig singleTypeMarketDataConfig =
        configObjectsResult.configType(configType).build();

    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult2 = builderResult.configObjects(new HashMap<>());
    Class<Object> configType2 = Object.class;

    // Act and Assert
    assertNotEquals(
        singleTypeMarketDataConfig, configObjectsResult2.configType(configType2).build());
  }

  /**
   * Test {@link SingleTypeMarketDataConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleTypeMarketDataConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleTypeMarketDataConfig.equals(Object)",
    "int SingleTypeMarketDataConfig.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<SingleTypeMarketDataConfig> configType = SingleTypeMarketDataConfig.class;
    SingleTypeMarketDataConfig singleTypeMarketDataConfig =
        configObjectsResult.configType(configType).build();

    Builder builderResult2 = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult2 = builderResult2.configObjects(new HashMap<>());
    Class<Object> configType2 = Object.class;

    // Act and Assert
    assertNotEquals(
        singleTypeMarketDataConfig, configObjectsResult2.configType(configType2).build());
  }

  /**
   * Test {@link SingleTypeMarketDataConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleTypeMarketDataConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleTypeMarketDataConfig.equals(Object)",
    "int SingleTypeMarketDataConfig.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;

    // Act and Assert
    assertNotEquals(configObjectsResult.configType(configType).build(), null);
  }

  /**
   * Test {@link SingleTypeMarketDataConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SingleTypeMarketDataConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SingleTypeMarketDataConfig.equals(Object)",
    "int SingleTypeMarketDataConfig.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;

    // Act and Assert
    assertNotEquals(
        configObjectsResult.configType(configType).build(),
        "Different type to SingleTypeMarketDataConfig");
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
    // Arrange and Act
    Class<? extends SingleTypeMarketDataConfig> actualBeanTypeResult =
        SingleTypeMarketDataConfig.meta().beanType();

    // Assert
    Class<SingleTypeMarketDataConfig> expectedBeanTypeResult = SingleTypeMarketDataConfig.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#configObjects()}
   *   <li>{@link Meta#configType()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.configObjects()", "MetaProperty Meta.configType()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SingleTypeMarketDataConfig.meta();

    // Act
    MetaProperty<ImmutableMap<String, Object>> actualConfigObjectsResult =
        metaResult.configObjects();

    // Assert
    assertTrue(actualConfigObjectsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.configType() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean configObjects return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean configObjects return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanConfigObjectsReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SingleTypeMarketDataConfig.meta().metaPropertyGet("configType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<String, Object>> configObjectsResult =
        ((Meta) metaBeanResult).configObjects();
    assertTrue(configObjectsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("configObjects", configObjectsResult.name());
    assertEquals("configType", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, configObjectsResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, configObjectsResult.propertyType());
    Class<SingleTypeMarketDataConfig> expectedDeclaringTypeResult =
        SingleTypeMarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, configObjectsResult.declaringType());
    Class<Class> expectedPropertyTypeResult2 = Class.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).configType());
    assertSame(Meta.INSTANCE, configObjectsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean configType return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean configType return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanConfigTypeReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SingleTypeMarketDataConfig.meta().metaPropertyGet("configObjects");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Class<?>> configTypeResult = ((Meta) metaBeanResult).configType();
    assertTrue(configTypeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("configObjects", actualMetaPropertyGetResult.name());
    assertEquals("configType", configTypeResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, configTypeResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<SingleTypeMarketDataConfig> expectedDeclaringTypeResult =
        SingleTypeMarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, configTypeResult.declaringType());
    Class<Class> expectedPropertyTypeResult2 = Class.class;
    assertEquals(expectedPropertyTypeResult2, configTypeResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).configObjects());
    assertSame(Meta.INSTANCE, configTypeResult.metaBean());
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
    assertNull(SingleTypeMarketDataConfig.meta().metaPropertyGet("Property Name"));
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        SingleTypeMarketDataConfig.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("configType");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("configObjects");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("configObjects", getResult2.name());
    assertEquals("configType", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<SingleTypeMarketDataConfig> expectedDeclaringTypeResult =
        SingleTypeMarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<SingleTypeMarketDataConfig> expectedDeclaringTypeResult2 =
        SingleTypeMarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<Class> expectedPropertyTypeResult2 = Class.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
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
    assertNull(
        SingleTypeMarketDataConfig.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'java.lang.Object'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenJavaLangObject_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = SingleTypeMarketDataConfig.meta();

    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;

    // Act
    assertDoesNotThrow(
        () ->
            metaResult.propertyGet(
                configObjectsResult.configType(configType).build(), "configType", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'java.lang.Object'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenJavaLangObject_thenReturnMap() {
    // Arrange
    Meta metaResult = SingleTypeMarketDataConfig.meta();

    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            configObjectsResult.configType(configType).build(), "configObjects", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> SingleTypeMarketDataConfig.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code configObjects}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'configObjects'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenConfigObjects_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SingleTypeMarketDataConfig.meta()
                .propertySet(mock(Bean.class), "configObjects", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code configType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'configType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenConfigType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SingleTypeMarketDataConfig.meta()
                .propertySet(mock(Bean.class), "configType", "New Value", true));
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
        () ->
            SingleTypeMarketDataConfig.meta()
                .propertySet(mock(Bean.class), "configObjects", "New Value", false));
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
        () ->
            SingleTypeMarketDataConfig.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
