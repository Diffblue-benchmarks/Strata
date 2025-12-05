package com.opengamma.strata.calc.marketdata;

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
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.calc.ColumnName;
import com.opengamma.strata.calc.marketdata.MarketDataConfig.Meta;
import com.opengamma.strata.calc.marketdata.SingleTypeMarketDataConfig.Builder;
import com.opengamma.strata.collect.TypedString;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataConfigDiffblueTest {
  /**
   * Test {@link MarketDataConfig#empty()}.
   *
   * <p>Method under test: {@link MarketDataConfig#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MarketDataConfig MarketDataConfig.empty()"})
  void testEmpty() {
    // Arrange and Act
    MarketDataConfig actualEmptyResult = MarketDataConfig.empty();

    // Assert
    Meta metaBeanResult = actualEmptyResult.metaBean();
    MetaProperty<ImmutableMap<Class<?>, SingleTypeMarketDataConfig>> configsResult =
        metaBeanResult.configs();
    assertTrue(configsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Class<?>, Object>> defaultConfigsResult =
        metaBeanResult.defaultConfigs();
    assertTrue(defaultConfigsResult instanceof DirectMetaProperty);
    assertEquals("configs", configsResult.name());
    assertEquals("defaultConfigs", defaultConfigsResult.name());
    Set<String> propertyNamesResult = actualEmptyResult.propertyNames();
    assertEquals(2, propertyNamesResult.size());
    assertEquals(PropertyStyle.IMMUTABLE, configsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, defaultConfigsResult.style());
    assertTrue(propertyNamesResult.contains("configs"));
    assertTrue(propertyNamesResult.contains("defaultConfigs"));
    assertTrue(metaBeanResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, configsResult.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, defaultConfigsResult.propertyType());
    Class<MarketDataConfig> expectedDeclaringTypeResult = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, configsResult.declaringType());
    Class<MarketDataConfig> expectedDeclaringTypeResult2 = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult2, defaultConfigsResult.declaringType());
    assertSame(metaBeanResult, configsResult.metaBean());
    assertSame(metaBeanResult, defaultConfigsResult.metaBean());
  }

  /**
   * Test {@link MarketDataConfig#get(Class, String)} with {@code Class}, {@code String}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#get(Class, String)}
   */
  @Test
  @DisplayName(
      "Test get(Class, String) with 'Class', 'String'; given empty; when 'Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MarketDataConfig.get(Class, String)"})
  void testGetWithClassString_givenEmpty_whenName_thenThrowIllegalArgumentException() {
    // Arrange
    MarketDataConfig emptyResult = MarketDataConfig.empty();
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> emptyResult.get(type, "Name"));
  }

  /**
   * Test {@link MarketDataConfig#get(Class, String)} with {@code Class}, {@code String}.
   *
   * <ul>
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#get(Class, String)}
   */
  @Test
  @DisplayName("Test get(Class, String) with 'Class', 'String'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MarketDataConfig.get(Class, String)"})
  void testGetWithClassString_thenReturnValue() {
    // Arrange
    HashMap<String, Object> configObjects = new HashMap<>();
    configObjects.put("{}", "Value");
    configObjects.put("No configuration found with type {} and name {}", "Value");

    Builder configObjectsResult = SingleTypeMarketDataConfig.builder().configObjects(configObjects);
    Class<Object> configType = Object.class;
    SingleTypeMarketDataConfig singleTypeMarketDataConfig =
        configObjectsResult.configType(configType).build();

    HashMap<Class<?>, SingleTypeMarketDataConfig> configs = new HashMap<>();
    Class<Object> forNameResult = Object.class;

    configs.put(forNameResult, singleTypeMarketDataConfig);
    MarketDataConfig marketDataConfig = new MarketDataConfig(configs, new HashMap<>());
    Class<Object> type = Object.class;

    // Act and Assert
    assertEquals(
        "Value", marketDataConfig.get(type, "No configuration found with type {} and name {}"));
  }

  /**
   * Test {@link MarketDataConfig#get(Class, String)} with {@code Class}, {@code String}.
   *
   * <ul>
   *   <li>When {@code No configuration found with type {} and name {}}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#get(Class, String)}
   */
  @Test
  @DisplayName(
      "Test get(Class, String) with 'Class', 'String'; when 'No configuration found with type {} and name {}'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MarketDataConfig.get(Class, String)"})
  void testGetWithClassString_whenNoConfigurationFoundWithTypeAndName_thenReturnValue() {
    // Arrange
    HashMap<String, Object> configObjects = new HashMap<>();
    configObjects.put("No configuration found with type {} and name {}", "Value");

    Builder configObjectsResult = SingleTypeMarketDataConfig.builder().configObjects(configObjects);
    Class<Object> configType = Object.class;
    SingleTypeMarketDataConfig singleTypeMarketDataConfig =
        configObjectsResult.configType(configType).build();

    HashMap<Class<?>, SingleTypeMarketDataConfig> configs = new HashMap<>();
    Class<Object> forNameResult = Object.class;

    configs.put(forNameResult, singleTypeMarketDataConfig);
    MarketDataConfig marketDataConfig = new MarketDataConfig(configs, new HashMap<>());
    Class<Object> type = Object.class;

    // Act and Assert
    assertEquals(
        "Value", marketDataConfig.get(type, "No configuration found with type {} and name {}"));
  }

  /**
   * Test {@link MarketDataConfig#get(Class, TypedString)} with {@code Class}, {@code TypedString}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#get(Class, TypedString)}
   */
  @Test
  @DisplayName(
      "Test get(Class, TypedString) with 'Class', 'TypedString'; given empty; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MarketDataConfig.get(Class, TypedString)"})
  void testGetWithClassTypedString_givenEmpty_thenThrowIllegalArgumentException() {
    // Arrange
    MarketDataConfig emptyResult = MarketDataConfig.empty();
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> emptyResult.get(type, ColumnName.of("Name")));
  }

  /**
   * Test {@link MarketDataConfig#get(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given {@code ImmutableList}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#get(Class)}
   */
  @Test
  @DisplayName(
      "Test get(Class) with 'Class'; given 'com.google.common.collect.ImmutableList'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MarketDataConfig.get(Class)"})
  void testGetWithClass_givenComGoogleCommonCollectImmutableList_thenReturnValue() {
    // Arrange
    HashMap<Class<?>, Object> defaultConfigs = new HashMap<>();
    Class<ImmutableList> forNameResult = ImmutableList.class;
    defaultConfigs.put(forNameResult, "Value");
    Class<Object> forNameResult2 = Object.class;
    defaultConfigs.put(forNameResult2, "Value");
    MarketDataConfig marketDataConfig = new MarketDataConfig(new HashMap<>(), defaultConfigs);
    Class<Object> type = Object.class;

    // Act and Assert
    assertEquals("Value", marketDataConfig.get(type));
  }

  /**
   * Test {@link MarketDataConfig#get(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given {@code MarketDataConfig}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#get(Class)}
   */
  @Test
  @DisplayName(
      "Test get(Class) with 'Class'; given 'com.opengamma.strata.calc.marketdata.MarketDataConfig'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MarketDataConfig.get(Class)"})
  void testGetWithClass_givenComOpengammaStrataCalcMarketdataMarketDataConfig() {
    // Arrange
    HashMap<Class<?>, Object> defaultConfigs = new HashMap<>();
    Class<ImmutableList> forNameResult = ImmutableList.class;
    defaultConfigs.put(forNameResult, "Value");
    Class<MarketDataConfig> forNameResult2 = MarketDataConfig.class;
    defaultConfigs.put(forNameResult2, "Value");
    MarketDataConfig marketDataConfig = new MarketDataConfig(new HashMap<>(), defaultConfigs);
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> marketDataConfig.get(type));
  }

  /**
   * Test {@link MarketDataConfig#get(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code Object}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#get(Class)}
   */
  @Test
  @DisplayName(
      "Test get(Class) with 'Class'; given empty; when 'java.lang.Object'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MarketDataConfig.get(Class)"})
  void testGetWithClass_givenEmpty_whenJavaLangObject_thenThrowIllegalArgumentException() {
    // Arrange
    MarketDataConfig emptyResult = MarketDataConfig.empty();
    Class<Object> type = Object.class;

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> emptyResult.get(type));
  }

  /**
   * Test {@link MarketDataConfig#get(Class)} with {@code Class}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@code Object}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#get(Class)}
   */
  @Test
  @DisplayName(
      "Test get(Class) with 'Class'; given 'java.lang.Object'; when 'java.lang.Object'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object MarketDataConfig.get(Class)"})
  void testGetWithClass_givenJavaLangObject_whenJavaLangObject_thenReturnValue() {
    // Arrange
    HashMap<Class<?>, Object> defaultConfigs = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    defaultConfigs.put(forNameResult, "Value");
    MarketDataConfig marketDataConfig = new MarketDataConfig(new HashMap<>(), defaultConfigs);
    Class<Object> type = Object.class;

    // Act and Assert
    assertEquals("Value", marketDataConfig.get(type));
  }

  /**
   * Test {@link MarketDataConfig#find(Class)}.
   *
   * <ul>
   *   <li>Given {@code ImmutableList}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#find(Class)}
   */
  @Test
  @DisplayName(
      "Test find(Class); given 'com.google.common.collect.ImmutableList'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MarketDataConfig.find(Class)"})
  void testFind_givenComGoogleCommonCollectImmutableList_thenReturnGetIsValue() {
    // Arrange
    HashMap<Class<?>, Object> defaultConfigs = new HashMap<>();
    Class<ImmutableList> forNameResult = ImmutableList.class;
    defaultConfigs.put(forNameResult, "Value");
    Class<Object> forNameResult2 = Object.class;
    defaultConfigs.put(forNameResult2, "Value");
    MarketDataConfig marketDataConfig = new MarketDataConfig(new HashMap<>(), defaultConfigs);
    Class<Object> type = Object.class;

    // Act
    Optional<Object> actualFindResult = marketDataConfig.find(type);

    // Assert
    assertEquals("Value", actualFindResult.get());
    assertTrue(actualFindResult.isPresent());
  }

  /**
   * Test {@link MarketDataConfig#find(Class)}.
   *
   * <ul>
   *   <li>Given {@code MarketDataConfig}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#find(Class)}
   */
  @Test
  @DisplayName("Test find(Class); given 'com.opengamma.strata.calc.marketdata.MarketDataConfig'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MarketDataConfig.find(Class)"})
  void testFind_givenComOpengammaStrataCalcMarketdataMarketDataConfig() {
    // Arrange
    HashMap<Class<?>, Object> defaultConfigs = new HashMap<>();
    Class<ImmutableList> forNameResult = ImmutableList.class;
    defaultConfigs.put(forNameResult, "Value");
    Class<MarketDataConfig> forNameResult2 = MarketDataConfig.class;
    defaultConfigs.put(forNameResult2, "Value");
    MarketDataConfig marketDataConfig = new MarketDataConfig(new HashMap<>(), defaultConfigs);
    Class<Object> type = Object.class;

    // Act and Assert
    assertFalse(marketDataConfig.find(type).isPresent());
  }

  /**
   * Test {@link MarketDataConfig#find(Class)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code Object}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#find(Class)}
   */
  @Test
  @DisplayName("Test find(Class); given empty; when 'java.lang.Object'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MarketDataConfig.find(Class)"})
  void testFind_givenEmpty_whenJavaLangObject_thenReturnNotPresent() {
    // Arrange
    MarketDataConfig emptyResult = MarketDataConfig.empty();
    Class<Object> type = Object.class;

    // Act and Assert
    assertFalse(emptyResult.find(type).isPresent());
  }

  /**
   * Test {@link MarketDataConfig#find(Class)}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>When {@code null}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#find(Class)}
   */
  @Test
  @DisplayName("Test find(Class); given empty; when 'null'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MarketDataConfig.find(Class)"})
  void testFind_givenEmpty_whenNull_thenReturnNotPresent() {
    // Arrange, Act and Assert
    assertFalse(MarketDataConfig.empty().find(null).isPresent());
  }

  /**
   * Test {@link MarketDataConfig#find(Class)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When {@code Object}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#find(Class)}
   */
  @Test
  @DisplayName(
      "Test find(Class); given 'java.lang.Object'; when 'java.lang.Object'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional MarketDataConfig.find(Class)"})
  void testFind_givenJavaLangObject_whenJavaLangObject_thenReturnGetIsValue() {
    // Arrange
    HashMap<Class<?>, Object> defaultConfigs = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    defaultConfigs.put(forNameResult, "Value");
    MarketDataConfig marketDataConfig = new MarketDataConfig(new HashMap<>(), defaultConfigs);
    Class<Object> type = Object.class;

    // Act
    Optional<Object> actualFindResult = marketDataConfig.find(type);

    // Assert
    assertEquals("Value", actualFindResult.get());
    assertTrue(actualFindResult.isPresent());
  }

  /**
   * Test {@link MarketDataConfig#meta()}.
   *
   * <p>Method under test: {@link MarketDataConfig#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MarketDataConfig.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = MarketDataConfig.meta();

    // Assert
    MetaProperty<ImmutableMap<Class<?>, SingleTypeMarketDataConfig>> configsResult =
        actualMetaResult.configs();
    assertTrue(configsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Class<?>, Object>> defaultConfigsResult =
        actualMetaResult.defaultConfigs();
    assertTrue(defaultConfigsResult instanceof DirectMetaProperty);
    assertEquals("configs", configsResult.name());
    assertEquals("defaultConfigs", defaultConfigsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, configsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, defaultConfigsResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, configsResult.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, defaultConfigsResult.propertyType());
    Class<MarketDataConfig> expectedDeclaringTypeResult = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, configsResult.declaringType());
    Class<MarketDataConfig> expectedDeclaringTypeResult2 = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult2, defaultConfigsResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, configsResult.metaBean());
    assertSame(meta, defaultConfigsResult.metaBean());
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
    Class<? extends MarketDataConfig> actualBeanTypeResult = MarketDataConfig.meta().beanType();

    // Assert
    Class<MarketDataConfig> expectedBeanTypeResult = MarketDataConfig.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#configs()}
   *   <li>{@link Meta#defaultConfigs()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.configs()", "MetaProperty Meta.defaultConfigs()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = MarketDataConfig.meta();

    // Act
    MetaProperty<ImmutableMap<Class<?>, SingleTypeMarketDataConfig>> actualConfigsResult =
        metaResult.configs();

    // Assert
    assertTrue(actualConfigsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.defaultConfigs() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean configs return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then metaBean configs return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanConfigsReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        MarketDataConfig.meta().metaPropertyGet("defaultConfigs");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Class<?>, SingleTypeMarketDataConfig>> configsResult =
        ((Meta) metaBeanResult).configs();
    assertTrue(configsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("configs", configsResult.name());
    assertEquals("defaultConfigs", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, configsResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, configsResult.propertyType());
    Class<MarketDataConfig> expectedDeclaringTypeResult = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, configsResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).defaultConfigs());
    assertSame(Meta.INSTANCE, configsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean defaultConfigs return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean defaultConfigs return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanDefaultConfigsReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        MarketDataConfig.meta().metaPropertyGet("configs");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<Class<?>, Object>> defaultConfigsResult =
        ((Meta) metaBeanResult).defaultConfigs();
    assertTrue(defaultConfigsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("configs", actualMetaPropertyGetResult.name());
    assertEquals("defaultConfigs", defaultConfigsResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, defaultConfigsResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, defaultConfigsResult.propertyType());
    Class<MarketDataConfig> expectedDeclaringTypeResult = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, defaultConfigsResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).configs());
    assertSame(Meta.INSTANCE, defaultConfigsResult.metaBean());
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
    assertNull(MarketDataConfig.meta().metaPropertyGet("Property Name"));
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
        MarketDataConfig.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("configs");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("defaultConfigs");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("configs", getResult.name());
    assertEquals("defaultConfigs", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<MarketDataConfig> expectedDeclaringTypeResult = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<MarketDataConfig> expectedDeclaringTypeResult2 = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
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
    assertNull(MarketDataConfig.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code configs}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'configs'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenConfigs_thenReturnMap() {
    // Arrange
    Meta metaResult = MarketDataConfig.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(MarketDataConfig.empty(), "configs", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code defaultConfigs}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'defaultConfigs'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDefaultConfigs_thenReturnMap() {
    // Arrange
    Meta metaResult = MarketDataConfig.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(MarketDataConfig.empty(), "defaultConfigs", true);

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
    Meta metaResult = MarketDataConfig.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(MarketDataConfig.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code configs}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'configs'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenConfigs_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> MarketDataConfig.meta().propertySet(mock(Bean.class), "configs", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code defaultConfigs}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'defaultConfigs'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDefaultConfigs_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            MarketDataConfig.meta()
                .propertySet(mock(Bean.class), "defaultConfigs", "New Value", true));
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
        () -> MarketDataConfig.meta().propertySet(mock(Bean.class), "configs", "New Value", false));
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
            MarketDataConfig.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link MarketDataConfig#MarketDataConfig(Map, Map)}.
   *
   * <ul>
   *   <li>Given {@code ImmutableList}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#MarketDataConfig(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new MarketDataConfig(Map, Map); given 'com.google.common.collect.ImmutableList'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MarketDataConfig.<init>(Map, Map)"})
  void testNewMarketDataConfig_givenComGoogleCommonCollectImmutableList() {
    // Arrange
    HashMap<Class<?>, SingleTypeMarketDataConfig> configs = new HashMap<>();
    Class<ImmutableList> forNameResult = ImmutableList.class;

    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;
    configs.put(forNameResult, configObjectsResult.configType(configType).build());
    Class<Object> forNameResult2 = Object.class;

    Builder builderResult2 = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult2 = builderResult2.configObjects(new HashMap<>());
    Class<Object> configType2 = Object.class;
    configs.put(forNameResult2, configObjectsResult2.configType(configType2).build());

    // Act
    MarketDataConfig actualMarketDataConfig = new MarketDataConfig(configs, new HashMap<>());

    // Assert
    Meta metaBeanResult = actualMarketDataConfig.metaBean();
    MetaProperty<ImmutableMap<Class<?>, SingleTypeMarketDataConfig>> configsResult =
        metaBeanResult.configs();
    assertTrue(configsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Class<?>, Object>> defaultConfigsResult =
        metaBeanResult.defaultConfigs();
    assertTrue(defaultConfigsResult instanceof DirectMetaProperty);
    assertEquals("configs", configsResult.name());
    assertEquals("defaultConfigs", defaultConfigsResult.name());
    Set<String> propertyNamesResult = actualMarketDataConfig.propertyNames();
    assertEquals(2, propertyNamesResult.size());
    assertEquals(PropertyStyle.IMMUTABLE, configsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, defaultConfigsResult.style());
    assertTrue(propertyNamesResult.contains("configs"));
    assertTrue(propertyNamesResult.contains("defaultConfigs"));
    assertTrue(metaBeanResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, configsResult.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, defaultConfigsResult.propertyType());
    Class<MarketDataConfig> expectedDeclaringTypeResult = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, configsResult.declaringType());
    Class<MarketDataConfig> expectedDeclaringTypeResult2 = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult2, defaultConfigsResult.declaringType());
    assertSame(metaBeanResult, configsResult.metaBean());
    assertSame(metaBeanResult, defaultConfigsResult.metaBean());
  }

  /**
   * Test {@link MarketDataConfig#MarketDataConfig(Map, Map)}.
   *
   * <ul>
   *   <li>Given {@link Object}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#MarketDataConfig(Map, Map)}
   */
  @Test
  @DisplayName("Test new MarketDataConfig(Map, Map); given Object")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MarketDataConfig.<init>(Map, Map)"})
  void testNewMarketDataConfig_givenObject() {
    // Arrange
    HashMap<Class<?>, SingleTypeMarketDataConfig> configs = new HashMap<>();
    Class<Object> forNameResult = Object.class;

    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;
    configs.put(forNameResult, configObjectsResult.configType(configType).build());

    // Act
    MarketDataConfig actualMarketDataConfig = new MarketDataConfig(configs, new HashMap<>());

    // Assert
    Meta metaBeanResult = actualMarketDataConfig.metaBean();
    MetaProperty<ImmutableMap<Class<?>, SingleTypeMarketDataConfig>> configsResult =
        metaBeanResult.configs();
    assertTrue(configsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Class<?>, Object>> defaultConfigsResult =
        metaBeanResult.defaultConfigs();
    assertTrue(defaultConfigsResult instanceof DirectMetaProperty);
    assertEquals("configs", configsResult.name());
    assertEquals("defaultConfigs", defaultConfigsResult.name());
    Set<String> propertyNamesResult = actualMarketDataConfig.propertyNames();
    assertEquals(2, propertyNamesResult.size());
    assertEquals(PropertyStyle.IMMUTABLE, configsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, defaultConfigsResult.style());
    assertTrue(propertyNamesResult.contains("configs"));
    assertTrue(propertyNamesResult.contains("defaultConfigs"));
    assertTrue(metaBeanResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, configsResult.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, defaultConfigsResult.propertyType());
    Class<MarketDataConfig> expectedDeclaringTypeResult = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, configsResult.declaringType());
    Class<MarketDataConfig> expectedDeclaringTypeResult2 = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult2, defaultConfigsResult.declaringType());
    assertSame(metaBeanResult, configsResult.metaBean());
    assertSame(metaBeanResult, defaultConfigsResult.metaBean());
  }

  /**
   * Test {@link MarketDataConfig#MarketDataConfig(Map, Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then metaBean configs return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#MarketDataConfig(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test new MarketDataConfig(Map, Map); when HashMap(); then metaBean configs return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MarketDataConfig.<init>(Map, Map)"})
  void testNewMarketDataConfig_whenHashMap_thenMetaBeanConfigsReturnDirectMetaProperty() {
    // Arrange
    HashMap<Class<?>, SingleTypeMarketDataConfig> configs = new HashMap<>();

    // Act
    MarketDataConfig actualMarketDataConfig = new MarketDataConfig(configs, new HashMap<>());

    // Assert
    Meta metaBeanResult = actualMarketDataConfig.metaBean();
    MetaProperty<ImmutableMap<Class<?>, SingleTypeMarketDataConfig>> configsResult =
        metaBeanResult.configs();
    assertTrue(configsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<Class<?>, Object>> defaultConfigsResult =
        metaBeanResult.defaultConfigs();
    assertTrue(defaultConfigsResult instanceof DirectMetaProperty);
    assertEquals("configs", configsResult.name());
    assertEquals("defaultConfigs", defaultConfigsResult.name());
    Set<String> propertyNamesResult = actualMarketDataConfig.propertyNames();
    assertEquals(2, propertyNamesResult.size());
    assertEquals(PropertyStyle.IMMUTABLE, configsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, defaultConfigsResult.style());
    assertTrue(propertyNamesResult.contains("configs"));
    assertTrue(propertyNamesResult.contains("defaultConfigs"));
    assertTrue(metaBeanResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, configsResult.propertyType());
    Class<ImmutableMap> expectedPropertyTypeResult2 = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult2, defaultConfigsResult.propertyType());
    Class<MarketDataConfig> expectedDeclaringTypeResult = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult, configsResult.declaringType());
    Class<MarketDataConfig> expectedDeclaringTypeResult2 = MarketDataConfig.class;
    assertEquals(expectedDeclaringTypeResult2, defaultConfigsResult.declaringType());
    assertSame(metaBeanResult, configsResult.metaBean());
    assertSame(metaBeanResult, defaultConfigsResult.metaBean());
  }

  /**
   * Test {@link MarketDataConfig#metaBean()}.
   *
   * <p>Method under test: {@link MarketDataConfig#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta MarketDataConfig.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, MarketDataConfig.empty().metaBean());
  }

  /**
   * Test {@link MarketDataConfig#equals(Object)}, and {@link MarketDataConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataConfig#equals(Object)}
   *   <li>{@link MarketDataConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataConfig.equals(Object)", "int MarketDataConfig.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    MarketDataConfig emptyResult = MarketDataConfig.empty();
    MarketDataConfig emptyResult2 = MarketDataConfig.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult2);
    assertEquals(emptyResult.hashCode(), emptyResult2.hashCode());
  }

  /**
   * Test {@link MarketDataConfig#equals(Object)}, and {@link MarketDataConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataConfig#equals(Object)}
   *   <li>{@link MarketDataConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataConfig.equals(Object)", "int MarketDataConfig.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual2() {
    // Arrange
    HashMap<Class<?>, SingleTypeMarketDataConfig> configs = new HashMap<>();
    MarketDataConfig marketDataConfig = new MarketDataConfig(configs, new HashMap<>());
    MarketDataConfig emptyResult = MarketDataConfig.empty();

    // Act and Assert
    assertEquals(marketDataConfig, emptyResult);
    assertEquals(marketDataConfig.hashCode(), emptyResult.hashCode());
  }

  /**
   * Test {@link MarketDataConfig#equals(Object)}, and {@link MarketDataConfig#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketDataConfig#equals(Object)}
   *   <li>{@link MarketDataConfig#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataConfig.equals(Object)", "int MarketDataConfig.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    MarketDataConfig emptyResult = MarketDataConfig.empty();

    // Act and Assert
    assertEquals(emptyResult, emptyResult);
    int expectedHashCodeResult = emptyResult.hashCode();
    assertEquals(expectedHashCodeResult, emptyResult.hashCode());
  }

  /**
   * Test {@link MarketDataConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataConfig.equals(Object)", "int MarketDataConfig.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMap<Class<?>, SingleTypeMarketDataConfig> configs = new HashMap<>();
    MarketDataConfig marketDataConfig = new MarketDataConfig(configs, new HashMap<>());

    // Act and Assert
    assertNotEquals(marketDataConfig, 1);
  }

  /**
   * Test {@link MarketDataConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataConfig.equals(Object)", "int MarketDataConfig.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<Class<?>, SingleTypeMarketDataConfig> configs = new HashMap<>();
    Class<Object> forNameResult = Object.class;

    Builder builderResult = SingleTypeMarketDataConfig.builder();

    Builder configObjectsResult = builderResult.configObjects(new HashMap<>());
    Class<Object> configType = Object.class;
    configs.put(forNameResult, configObjectsResult.configType(configType).build());
    MarketDataConfig marketDataConfig = new MarketDataConfig(configs, new HashMap<>());

    // Act and Assert
    assertNotEquals(marketDataConfig, MarketDataConfig.empty());
  }

  /**
   * Test {@link MarketDataConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataConfig.equals(Object)", "int MarketDataConfig.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashMap<Class<?>, Object> defaultConfigs = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    defaultConfigs.put(forNameResult, "Value");
    MarketDataConfig marketDataConfig = new MarketDataConfig(new HashMap<>(), defaultConfigs);

    // Act and Assert
    assertNotEquals(marketDataConfig, MarketDataConfig.empty());
  }

  /**
   * Test {@link MarketDataConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataConfig.equals(Object)", "int MarketDataConfig.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(MarketDataConfig.empty(), null);
  }

  /**
   * Test {@link MarketDataConfig#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link MarketDataConfig#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean MarketDataConfig.equals(Object)", "int MarketDataConfig.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(MarketDataConfig.empty(), "Different type to MarketDataConfig");
  }

  /**
   * Test {@link MarketDataConfig#toString()}.
   *
   * <p>Method under test: {@link MarketDataConfig#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String MarketDataConfig.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals(
        "MarketDataConfig{configs={}, defaultConfigs={}}", MarketDataConfig.empty().toString());
  }
}
