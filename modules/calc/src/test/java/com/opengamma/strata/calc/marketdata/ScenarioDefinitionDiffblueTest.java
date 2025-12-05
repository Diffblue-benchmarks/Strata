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
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.calc.marketdata.ScenarioDefinition.Builder;
import com.opengamma.strata.calc.marketdata.ScenarioDefinition.Meta;
import java.util.ArrayList;
import java.util.List;
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

class ScenarioDefinitionDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioDefinition Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualBuilderResult = ScenarioDefinition.builder();
    Builder actualMappingsResult = actualBuilderResult.mappings(new ArrayList<>());
    ScenarioDefinition actualScenarioDefinition =
        actualMappingsResult.scenarioNames(new ArrayList<>()).build();

    // Assert
    assertEquals(0, actualScenarioDefinition.getScenarioCount());
    assertSame(actualScenarioDefinition.getMappings(), actualScenarioDefinition.getScenarioNames());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code mappings}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'mappings'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenMappings_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = ScenarioDefinition.builder().get("mappings");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
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
        NoSuchElementException.class, () -> ScenarioDefinition.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code scenarioNames}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'scenarioNames'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenScenarioNames_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = ScenarioDefinition.builder().get("scenarioNames");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#mappings(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#mappings(List)}
   */
  @Test
  @DisplayName("Test Builder mappings(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.mappings(List)"})
  void testBuilderMappingsWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    // Act
    Builder actualMappingsResult = builderResult.mappings(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualMappingsResult);
  }

  /**
   * Test Builder {@link Builder#mappings(PerturbationMapping[])} with {@code
   * PerturbationMapping[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#mappings(PerturbationMapping[])}
   */
  @Test
  @DisplayName(
      "Test Builder mappings(PerturbationMapping[]) with 'PerturbationMapping[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.mappings(PerturbationMapping[])"})
  void testBuilderMappingsWithPerturbationMapping_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    // Act
    Builder actualMappingsResult = builderResult.mappings();

    // Assert
    assertSame(builderResult, actualMappingsResult);
  }

  /**
   * Test Builder {@link Builder#scenarioNames(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>Then return build ScenarioCount is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#scenarioNames(List)}
   */
  @Test
  @DisplayName(
      "Test Builder scenarioNames(List) with 'List'; given 'foo'; then return build ScenarioCount is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.scenarioNames(List)"})
  void testBuilderScenarioNamesWithList_givenFoo_thenReturnBuildScenarioCountIsTwo() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    ArrayList<String> scenarioNames = new ArrayList<>();
    scenarioNames.add("foo");
    scenarioNames.add("scenarioNames");

    // Act and Assert
    ScenarioDefinition scenarioDefinition = builderResult.scenarioNames(scenarioNames).build();
    assertEquals(2, scenarioDefinition.getScenarioCount());
    ScenarioDefinition scenarioDefinition2 = builderResult.build();
    assertEquals(2, scenarioDefinition2.getScenarioCount());
    assertEquals(scenarioNames, scenarioDefinition.getScenarioNames());
    assertEquals(scenarioNames, scenarioDefinition2.getScenarioNames());
  }

  /**
   * Test Builder {@link Builder#scenarioNames(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return build ScenarioCount is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#scenarioNames(List)}
   */
  @Test
  @DisplayName(
      "Test Builder scenarioNames(List) with 'List'; then return build ScenarioCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.scenarioNames(List)"})
  void testBuilderScenarioNamesWithList_thenReturnBuildScenarioCountIsOne() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    ArrayList<String> scenarioNames = new ArrayList<>();
    scenarioNames.add("scenarioNames");

    // Act and Assert
    ScenarioDefinition scenarioDefinition = builderResult.scenarioNames(scenarioNames).build();
    assertEquals(1, scenarioDefinition.getScenarioCount());
    ScenarioDefinition scenarioDefinition2 = builderResult.build();
    assertEquals(1, scenarioDefinition2.getScenarioCount());
    assertEquals(scenarioNames, scenarioDefinition.getScenarioNames());
    assertEquals(scenarioNames, scenarioDefinition2.getScenarioNames());
  }

  /**
   * Test Builder {@link Builder#scenarioNames(List)} with {@code List}.
   *
   * <ul>
   *   <li>Then return build ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#scenarioNames(List)}
   */
  @Test
  @DisplayName(
      "Test Builder scenarioNames(List) with 'List'; then return build ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.scenarioNames(List)"})
  void testBuilderScenarioNamesWithList_thenReturnBuildScenarioCountIsZero() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();
    ArrayList<String> scenarioNames = new ArrayList<>();

    // Act and Assert
    ScenarioDefinition scenarioDefinition = builderResult.scenarioNames(scenarioNames).build();
    assertEquals(0, scenarioDefinition.getScenarioCount());
    assertEquals(0, builderResult.build().getScenarioCount());
    ImmutableList<PerturbationMapping<?>> mappings = scenarioDefinition.getMappings();
    assertEquals(scenarioNames, mappings);
    assertSame(mappings, scenarioDefinition.getScenarioNames());
  }

  /**
   * Test Builder {@link Builder#scenarioNames(String[])} with {@code String[]}.
   *
   * <ul>
   *   <li>Then builder build ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#scenarioNames(String[])}
   */
  @Test
  @DisplayName(
      "Test Builder scenarioNames(String[]) with 'String[]'; then builder build ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.scenarioNames(String[])"})
  void testBuilderScenarioNamesWithString_thenBuilderBuildScenarioCountIsZero() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    // Act
    Builder actualScenarioNamesResult = builderResult.scenarioNames();

    // Assert
    assertEquals(0, builderResult.build().getScenarioCount());
    assertSame(builderResult, actualScenarioNamesResult);
  }

  /**
   * Test Builder {@link Builder#scenarioNames(String[])} with {@code String[]}.
   *
   * <ul>
   *   <li>Then return build ScenarioNames size is one.
   * </ul>
   *
   * <p>Method under test: {@link Builder#scenarioNames(String[])}
   */
  @Test
  @DisplayName(
      "Test Builder scenarioNames(String[]) with 'String[]'; then return build ScenarioNames size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.scenarioNames(String[])"})
  void testBuilderScenarioNamesWithString_thenReturnBuildScenarioNamesSizeIsOne() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    // Act and Assert
    ScenarioDefinition scenarioDefinition = builderResult.scenarioNames("Scenario Names").build();
    ImmutableList<String> scenarioNames = scenarioDefinition.getScenarioNames();
    assertEquals(1, scenarioNames.size());
    assertEquals("Scenario Names", scenarioNames.get(0));
    assertEquals(1, scenarioDefinition.getScenarioCount());
    assertEquals(1, builderResult.build().getScenarioCount());
  }

  /**
   * Test Builder {@link Builder#scenarioNames(String[])} with {@code String[]}.
   *
   * <ul>
   *   <li>Then return build ScenarioNames size is two.
   * </ul>
   *
   * <p>Method under test: {@link Builder#scenarioNames(String[])}
   */
  @Test
  @DisplayName(
      "Test Builder scenarioNames(String[]) with 'String[]'; then return build ScenarioNames size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.scenarioNames(String[])"})
  void testBuilderScenarioNamesWithString_thenReturnBuildScenarioNamesSizeIsTwo() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    // Act and Assert
    ScenarioDefinition scenarioDefinition =
        builderResult.scenarioNames("scenarioNames", "Scenario Names").build();
    ImmutableList<String> scenarioNames = scenarioDefinition.getScenarioNames();
    assertEquals(2, scenarioNames.size());
    assertEquals("Scenario Names", scenarioNames.get(1));
    assertEquals("scenarioNames", scenarioNames.get(0));
    assertEquals(2, scenarioDefinition.getScenarioCount());
    assertEquals(2, builderResult.build().getScenarioCount());
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
        () -> ScenarioDefinition.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code mappings}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'mappings'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenMappings_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    // Act
    Builder actualSetResult = builderResult.set("mappings", new ArrayList<>());

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
    Builder builderResult = ScenarioDefinition.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test {@link ScenarioDefinition#empty()}.
   *
   * <p>Method under test: {@link ScenarioDefinition#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioDefinition ScenarioDefinition.empty()"})
  void testEmpty() {
    // Arrange and Act
    ScenarioDefinition actualEmptyResult = ScenarioDefinition.empty();

    // Assert
    assertEquals(0, actualEmptyResult.getScenarioCount());
    ImmutableList<PerturbationMapping<?>> mappings = actualEmptyResult.getMappings();
    assertTrue(mappings.isEmpty());
    assertSame(mappings, actualEmptyResult.getScenarioNames());
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
    Class<? extends ScenarioDefinition> actualBeanTypeResult = ScenarioDefinition.meta().beanType();

    // Assert
    Class<ScenarioDefinition> expectedBeanTypeResult = ScenarioDefinition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta {@link Meta#builder()}.
   *
   * <p>Method under test: {@link Meta#builder()}
   */
  @Test
  @DisplayName("Test Meta builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Meta.builder()"})
  void testMetaBuilder() {
    // Arrange, Act and Assert
    ScenarioDefinition scenarioDefinition = ScenarioDefinition.meta().builder().build();
    assertEquals(0, scenarioDefinition.getScenarioCount());
    ImmutableList<PerturbationMapping<?>> mappings = scenarioDefinition.getMappings();
    assertTrue(mappings.isEmpty());
    assertSame(mappings, scenarioDefinition.getScenarioNames());
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#mappings()}
   *   <li>{@link Meta#scenarioNames()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.mappings()", "MetaProperty Meta.scenarioNames()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ScenarioDefinition.meta();

    // Act
    MetaProperty<ImmutableList<PerturbationMapping<?>>> actualMappingsResult =
        metaResult.mappings();

    // Assert
    assertTrue(actualMappingsResult instanceof DirectMetaProperty);
    assertTrue(metaResult.scenarioNames() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean mappings return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean mappings return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanMappingsReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ScenarioDefinition.meta().metaPropertyGet("scenarioNames");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<PerturbationMapping<?>>> mappingsResult =
        ((Meta) metaBeanResult).mappings();
    assertTrue(mappingsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("mappings", mappingsResult.name());
    assertEquals("scenarioNames", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, mappingsResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, mappingsResult.propertyType());
    Class<ScenarioDefinition> expectedDeclaringTypeResult = ScenarioDefinition.class;
    assertEquals(expectedDeclaringTypeResult, mappingsResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).scenarioNames());
    assertSame(Meta.INSTANCE, mappingsResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean scenarioNames return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean scenarioNames return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanScenarioNamesReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ScenarioDefinition.meta().metaPropertyGet("mappings");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<String>> scenarioNamesResult =
        ((Meta) metaBeanResult).scenarioNames();
    assertTrue(scenarioNamesResult instanceof DirectMetaProperty);
    assertEquals("mappings", actualMetaPropertyGetResult.name());
    assertEquals("scenarioNames", scenarioNamesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, scenarioNamesResult.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, scenarioNamesResult.propertyType());
    Class<ScenarioDefinition> expectedDeclaringTypeResult = ScenarioDefinition.class;
    assertEquals(expectedDeclaringTypeResult, scenarioNamesResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).mappings());
    assertSame(Meta.INSTANCE, scenarioNamesResult.metaBean());
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
    assertNull(ScenarioDefinition.meta().metaPropertyGet("Property Name"));
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
        ScenarioDefinition.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("mappings");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("scenarioNames");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertEquals("mappings", getResult.name());
    assertEquals("scenarioNames", getResult2.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<ImmutableList> expectedPropertyTypeResult2 = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<ScenarioDefinition> expectedDeclaringTypeResult = ScenarioDefinition.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ScenarioDefinition> expectedDeclaringTypeResult2 = ScenarioDefinition.class;
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
    assertNull(ScenarioDefinition.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When empty.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when empty; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenEmpty_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = ScenarioDefinition.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> metaResult.propertyGet(ScenarioDefinition.empty(), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code mappings}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'mappings'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenMappings_thenReturnList() {
    // Arrange
    Meta metaResult = ScenarioDefinition.meta();

    Builder builderResult = ScenarioDefinition.builder();

    Builder mappingsResult = builderResult.mappings(new ArrayList<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            mappingsResult.scenarioNames(new ArrayList<>()).build(), "mappings", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code scenarioNames}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'scenarioNames'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenScenarioNames_thenReturnList() {
    // Arrange
    Meta metaResult = ScenarioDefinition.meta();

    Builder builderResult = ScenarioDefinition.builder();

    Builder mappingsResult = builderResult.mappings(new ArrayList<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            mappingsResult.scenarioNames(new ArrayList<>()).build(), "scenarioNames", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
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
            ScenarioDefinition.meta()
                .propertySet(mock(Bean.class), "mappings", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code mappings}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'mappings'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMappings_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ScenarioDefinition.meta().propertySet(mock(Bean.class), "mappings", "New Value", true));
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
            ScenarioDefinition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code scenarioNames}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'scenarioNames'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenScenarioNames_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ScenarioDefinition.meta()
                .propertySet(mock(Bean.class), "scenarioNames", "New Value", true));
  }

  /**
   * Test {@link ScenarioDefinition#ofMappings(List, List)} with {@code mappings}, {@code
   * scenarioNames}.
   *
   * <ul>
   *   <li>Then return ScenarioCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioDefinition#ofMappings(List, List)}
   */
  @Test
  @DisplayName(
      "Test ofMappings(List, List) with 'mappings', 'scenarioNames'; then return ScenarioCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ScenarioDefinition ScenarioDefinition.ofMappings(List, List)"})
  void testOfMappingsWithMappingsScenarioNames_thenReturnScenarioCountIsZero() {
    // Arrange
    ArrayList<PerturbationMapping<?>> mappings = new ArrayList<>();

    // Act
    ScenarioDefinition actualOfMappingsResult =
        ScenarioDefinition.ofMappings(mappings, new ArrayList<>());

    // Assert
    assertEquals(0, actualOfMappingsResult.getScenarioCount());
    ImmutableList<PerturbationMapping<?>> mappings2 = actualOfMappingsResult.getMappings();
    assertEquals(mappings, mappings2);
    assertSame(mappings2, actualOfMappingsResult.getScenarioNames());
  }

  /**
   * Test {@link ScenarioDefinition#repeatItems(List, int, int)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioDefinition#repeatItems(List, int, int)}
   */
  @Test
  @DisplayName(
      "Test repeatItems(List, int, int); given '42'; when ArrayList() add '42'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ScenarioDefinition.repeatItems(List, int, int)"})
  void testRepeatItems_given42_whenArrayListAdd42_thenReturnEmpty() {
    // Arrange
    ArrayList<Object> inputs = new ArrayList<>();
    inputs.add("42");
    inputs.add("42");

    // Act
    List<Object> actualRepeatItemsResult = ScenarioDefinition.repeatItems(inputs, 3, 3);

    // Assert
    assertTrue(actualRepeatItemsResult.isEmpty());
  }

  /**
   * Test {@link ScenarioDefinition#repeatItems(List, int, int)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 42}.
   *   <li>Then return size is three.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioDefinition#repeatItems(List, int, int)}
   */
  @Test
  @DisplayName(
      "Test repeatItems(List, int, int); given '42'; when ArrayList() add '42'; then return size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ScenarioDefinition.repeatItems(List, int, int)"})
  void testRepeatItems_given42_whenArrayListAdd42_thenReturnSizeIsThree() {
    // Arrange
    ArrayList<Object> inputs = new ArrayList<>();
    inputs.add("42");

    // Act
    List<Object> actualRepeatItemsResult = ScenarioDefinition.repeatItems(inputs, 3, 3);

    // Assert
    assertEquals(3, actualRepeatItemsResult.size());
    assertEquals("42", actualRepeatItemsResult.get(0));
    assertEquals("42", actualRepeatItemsResult.get(1));
    assertEquals("42", actualRepeatItemsResult.get(2));
  }

  /**
   * Test {@link ScenarioDefinition#repeatItems(List, int, int)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When eleven.
   *   <li>Then return size is eighty-eight.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioDefinition#repeatItems(List, int, int)}
   */
  @Test
  @DisplayName(
      "Test repeatItems(List, int, int); given '42'; when eleven; then return size is eighty-eight")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ScenarioDefinition.repeatItems(List, int, int)"})
  void testRepeatItems_given42_whenEleven_thenReturnSizeIsEightyEight() {
    // Arrange
    ArrayList<Object> inputs = new ArrayList<>();
    inputs.add("42");

    // Act
    List<Object> actualRepeatItemsResult = ScenarioDefinition.repeatItems(inputs, 96, 11);

    // Assert
    assertEquals(88, actualRepeatItemsResult.size());
    assertEquals("42", actualRepeatItemsResult.get(82));
    assertEquals("42", actualRepeatItemsResult.get(83));
    assertEquals("42", actualRepeatItemsResult.get(84));
    assertEquals("42", actualRepeatItemsResult.get(85));
    assertEquals("42", actualRepeatItemsResult.get(86));
    assertEquals("42", actualRepeatItemsResult.get(87));
  }

  /**
   * Test {@link ScenarioDefinition#repeatItems(List, int, int)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When ninety-six.
   *   <li>Then return size is ninety-six.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioDefinition#repeatItems(List, int, int)}
   */
  @Test
  @DisplayName(
      "Test repeatItems(List, int, int); given '42'; when ninety-six; then return size is ninety-six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List ScenarioDefinition.repeatItems(List, int, int)"})
  void testRepeatItems_given42_whenNinetySix_thenReturnSizeIsNinetySix() {
    // Arrange
    ArrayList<Object> inputs = new ArrayList<>();
    inputs.add("42");

    // Act
    List<Object> actualRepeatItemsResult = ScenarioDefinition.repeatItems(inputs, 96, 3);

    // Assert
    assertEquals(96, actualRepeatItemsResult.size());
    assertEquals("42", actualRepeatItemsResult.get(90));
    assertEquals("42", actualRepeatItemsResult.get(91));
    assertEquals("42", actualRepeatItemsResult.get(92));
    assertEquals("42", actualRepeatItemsResult.get(93));
    assertEquals("42", actualRepeatItemsResult.get(94));
    assertEquals("42", actualRepeatItemsResult.get(95));
  }

  /**
   * Test {@link ScenarioDefinition#getScenarioCount()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioDefinition#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); given ArrayList() add 'foo'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ScenarioDefinition.getScenarioCount()"})
  void testGetScenarioCount_givenArrayListAddFoo_thenReturnOne() {
    // Arrange
    ArrayList<String> scenarioNames = new ArrayList<>();
    scenarioNames.add("foo");

    // Act and Assert
    assertEquals(
        1, ScenarioDefinition.ofMappings(new ArrayList<>(), scenarioNames).getScenarioCount());
  }

  /**
   * Test {@link ScenarioDefinition#getScenarioCount()}.
   *
   * <ul>
   *   <li>Given empty.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioDefinition#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); given empty; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ScenarioDefinition.getScenarioCount()"})
  void testGetScenarioCount_givenEmpty_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(0, ScenarioDefinition.empty().getScenarioCount());
  }

  /**
   * Test {@link ScenarioDefinition#meta()}.
   *
   * <p>Method under test: {@link ScenarioDefinition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ScenarioDefinition.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ScenarioDefinition.meta();

    // Assert
    MetaProperty<ImmutableList<PerturbationMapping<?>>> mappingsResult =
        actualMetaResult.mappings();
    assertTrue(mappingsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<String>> scenarioNamesResult = actualMetaResult.scenarioNames();
    assertTrue(scenarioNamesResult instanceof DirectMetaProperty);
    assertEquals("mappings", mappingsResult.name());
    assertEquals("scenarioNames", scenarioNamesResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, mappingsResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, scenarioNamesResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, mappingsResult.propertyType());
    Class<ImmutableList> expectedPropertyTypeResult2 = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult2, scenarioNamesResult.propertyType());
    Class<ScenarioDefinition> expectedDeclaringTypeResult = ScenarioDefinition.class;
    assertEquals(expectedDeclaringTypeResult, mappingsResult.declaringType());
    Class<ScenarioDefinition> expectedDeclaringTypeResult2 = ScenarioDefinition.class;
    assertEquals(expectedDeclaringTypeResult2, scenarioNamesResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, mappingsResult.metaBean());
    assertSame(meta, scenarioNamesResult.metaBean());
  }

  /**
   * Test {@link ScenarioDefinition#metaBean()}.
   *
   * <p>Method under test: {@link ScenarioDefinition#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ScenarioDefinition.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, ScenarioDefinition.empty().metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ScenarioDefinition#toString()}
   *   <li>{@link ScenarioDefinition#getMappings()}
   *   <li>{@link ScenarioDefinition#getScenarioNames()}
   *   <li>{@link ScenarioDefinition#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList ScenarioDefinition.getMappings()",
    "ImmutableList ScenarioDefinition.getScenarioNames()",
    "Builder ScenarioDefinition.toBuilder()",
    "String ScenarioDefinition.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    Builder mappingsResult = builderResult.mappings(new ArrayList<>());
    ScenarioDefinition scenarioDefinition = mappingsResult.scenarioNames(new ArrayList<>()).build();

    // Act
    String actualToStringResult = scenarioDefinition.toString();
    ImmutableList<PerturbationMapping<?>> actualMappings = scenarioDefinition.getMappings();
    ImmutableList<String> actualScenarioNames = scenarioDefinition.getScenarioNames();
    scenarioDefinition.toBuilder();

    // Assert
    assertEquals("ScenarioDefinition{mappings=[], scenarioNames=[]}", actualToStringResult);
    assertSame(actualMappings, actualScenarioNames);
  }

  /**
   * Test {@link ScenarioDefinition#equals(Object)}, and {@link ScenarioDefinition#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ScenarioDefinition#equals(Object)}
   *   <li>{@link ScenarioDefinition#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ScenarioDefinition.equals(Object)",
    "int ScenarioDefinition.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    Builder mappingsResult = builderResult.mappings(new ArrayList<>());
    ScenarioDefinition scenarioDefinition = mappingsResult.scenarioNames(new ArrayList<>()).build();

    Builder builderResult2 = ScenarioDefinition.builder();

    Builder mappingsResult2 = builderResult2.mappings(new ArrayList<>());
    ScenarioDefinition scenarioDefinition2 =
        mappingsResult2.scenarioNames(new ArrayList<>()).build();

    // Act and Assert
    assertEquals(scenarioDefinition, scenarioDefinition2);
    assertEquals(scenarioDefinition.hashCode(), scenarioDefinition2.hashCode());
  }

  /**
   * Test {@link ScenarioDefinition#equals(Object)}, and {@link ScenarioDefinition#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ScenarioDefinition#equals(Object)}
   *   <li>{@link ScenarioDefinition#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ScenarioDefinition.equals(Object)",
    "int ScenarioDefinition.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    Builder mappingsResult = builderResult.mappings(new ArrayList<>());
    ScenarioDefinition scenarioDefinition = mappingsResult.scenarioNames(new ArrayList<>()).build();

    // Act and Assert
    assertEquals(scenarioDefinition, scenarioDefinition);
    int expectedHashCodeResult = scenarioDefinition.hashCode();
    assertEquals(expectedHashCodeResult, scenarioDefinition.hashCode());
  }

  /**
   * Test {@link ScenarioDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ScenarioDefinition.equals(Object)",
    "int ScenarioDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<String> scenarioNames = new ArrayList<>();
    scenarioNames.add("foo");

    Builder builderResult = ScenarioDefinition.builder();
    ScenarioDefinition scenarioDefinition =
        builderResult.mappings(new ArrayList<>()).scenarioNames(scenarioNames).build();

    Builder builderResult2 = ScenarioDefinition.builder();

    Builder mappingsResult = builderResult2.mappings(new ArrayList<>());

    // Act and Assert
    assertNotEquals(scenarioDefinition, mappingsResult.scenarioNames(new ArrayList<>()).build());
  }

  /**
   * Test {@link ScenarioDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ScenarioDefinition.equals(Object)",
    "int ScenarioDefinition.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    Builder mappingsResult = builderResult.mappings(new ArrayList<>());

    // Act and Assert
    assertNotEquals(mappingsResult.scenarioNames(new ArrayList<>()).build(), null);
  }

  /**
   * Test {@link ScenarioDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ScenarioDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ScenarioDefinition.equals(Object)",
    "int ScenarioDefinition.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ScenarioDefinition.builder();

    Builder mappingsResult = builderResult.mappings(new ArrayList<>());

    // Act and Assert
    assertNotEquals(
        mappingsResult.scenarioNames(new ArrayList<>()).build(),
        "Different type to ScenarioDefinition");
  }
}
