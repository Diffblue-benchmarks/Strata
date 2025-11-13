package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.calc.marketdata.PerturbationMapping.Builder;
import com.opengamma.strata.calc.marketdata.PerturbationMapping.Meta;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.scenario.MarketDataBox;
import com.opengamma.strata.data.scenario.ScenarioPerturbation;
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
import org.mockito.Mockito;

class PerturbationMappingDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PerturbationMapping Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange and Act
    Builder<Object> actualBuilderResult = PerturbationMapping.builder();
    IdFilter<?> filter = new IdFilter<>(mock(MarketDataId.class));
    Builder<Object> actualFilterResult = actualBuilderResult.filter(filter);
    Class<Object> marketDataType = Object.class;
    ScenarioPerturbation<Object> perturbation = mock(ScenarioPerturbation.class);
    PerturbationMapping<Object> actualPerturbationMapping =
        actualFilterResult.marketDataType(marketDataType).perturbation(perturbation).build();

    // Assert
    assertEquals(0, actualPerturbationMapping.getScenarioCount());
    Class<Object> expectedMarketDataType = Object.class;
    assertEquals(expectedMarketDataType, actualPerturbationMapping.getMarketDataType());
    assertSame(filter, actualPerturbationMapping.getFilter());
    assertSame(perturbation, actualPerturbationMapping.getPerturbation());
  }

  /**
   * Test Builder {@link Builder#filter(MarketDataFilter)}.
   *
   * <ul>
   *   <li>When {@link IdFilter#IdFilter(MarketDataId)} with id is {@link MarketDataId}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#filter(MarketDataFilter)}
   */
  @Test
  @DisplayName(
      "Test Builder filter(MarketDataFilter); when IdFilter(MarketDataId) with id is MarketDataId; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.filter(MarketDataFilter)"})
  void testBuilderFilter_whenIdFilterWithIdIsMarketDataId_thenReturnBuilder() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    // Act
    Builder<Object> actualFilterResult =
        builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));

    // Assert
    assertSame(builderResult, actualFilterResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code filter}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'filter'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenFilter_thenReturnNull() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    // Act and Assert
    assertNull(builderResult.get("filter"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code marketDataType}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'marketDataType'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenMarketDataType_thenReturnNull() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    // Act and Assert
    assertNull(builderResult.get("marketDataType"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code perturbation}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'perturbation'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPerturbation_thenReturnNull() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    // Act and Assert
    assertNull(builderResult.get("perturbation"));
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
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    // Act and Assert
    assertThrows(NoSuchElementException.class, () -> builderResult.get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#marketDataType(Class)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#marketDataType(Class)}
   */
  @Test
  @DisplayName("Test Builder marketDataType(Class); when 'java.lang.Object'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.marketDataType(Class)"})
  void testBuilderMarketDataType_whenJavaLangObject_thenReturnBuilder() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();
    Class<Object> marketDataType = Object.class;

    // Act
    Builder<Object> actualMarketDataTypeResult = builderResult.marketDataType(marketDataType);

    // Assert
    assertSame(builderResult, actualMarketDataTypeResult);
  }

  /**
   * Test Builder {@link Builder#perturbation(ScenarioPerturbation)}.
   *
   * <ul>
   *   <li>When {@link ScenarioPerturbation}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#perturbation(ScenarioPerturbation)}
   */
  @Test
  @DisplayName(
      "Test Builder perturbation(ScenarioPerturbation); when ScenarioPerturbation; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.perturbation(ScenarioPerturbation)"})
  void testBuilderPerturbation_whenScenarioPerturbation_thenReturnBuilder() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    // Act
    Builder<Object> actualPerturbationResult =
        builderResult.perturbation(mock(ScenarioPerturbation.class));

    // Assert
    assertSame(builderResult, actualPerturbationResult);
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
    Builder<Object> builderResult = PerturbationMapping.builder();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> builderResult.set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code filter}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'filter'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenFilter_thenReturnBuilder() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    // Act
    Builder<Object> actualSetResult =
        builderResult.set("filter", new IdFilter<>(mock(MarketDataId.class)));

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
    Builder<Object> builderResult = PerturbationMapping.builder();

    // Act
    Builder<Object> actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act
    Class<? extends PerturbationMapping<Object>> actualBeanTypeResult =
        metaPerturbationMappingResult.beanType();

    // Assert
    Class<PerturbationMapping> expectedBeanTypeResult = PerturbationMapping.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#filter()}
   *   <li>{@link Meta#marketDataType()}
   *   <li>{@link Meta#perturbation()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.filter()",
    "MetaProperty Meta.marketDataType()",
    "MetaProperty Meta.perturbation()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = PerturbationMapping.meta();

    // Act
    MetaProperty<MarketDataFilter> actualFilterResult = metaResult.filter();
    MetaProperty<Class> actualMarketDataTypeResult = metaResult.marketDataType();

    // Assert
    assertTrue(actualFilterResult instanceof DirectMetaProperty);
    assertTrue(actualMarketDataTypeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.perturbation() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code filter}.
   *   <li>Then return name is {@code filter}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'filter'; then return name is 'filter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenFilter_thenReturnNameIsFilter() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaPerturbationMappingResult.metaPropertyGet("filter");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Class<Object>> marketDataTypeResult =
        ((Meta<Object>) metaBeanResult).marketDataType();
    assertTrue(marketDataTypeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ScenarioPerturbation<Object>> perturbationResult =
        ((Meta<Object>) metaBeanResult).perturbation();
    assertTrue(perturbationResult instanceof DirectMetaProperty);
    assertEquals("filter", actualMetaPropertyGetResult.name());
    Class<MarketDataFilter> expectedPropertyTypeResult = MarketDataFilter.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).filter());
    assertSame(metaBeanResult, marketDataTypeResult.metaBean());
    assertSame(metaBeanResult, perturbationResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code marketDataType}.
   *   <li>Then return name is {@code marketDataType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'marketDataType'; then return name is 'marketDataType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMarketDataType_thenReturnNameIsMarketDataType() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaPerturbationMappingResult.metaPropertyGet("marketDataType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<MarketDataFilter<?, ?>> filterResult = ((Meta<Object>) metaBeanResult).filter();
    assertTrue(filterResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ScenarioPerturbation<Object>> perturbationResult =
        ((Meta<Object>) metaBeanResult).perturbation();
    assertTrue(perturbationResult instanceof DirectMetaProperty);
    assertEquals("marketDataType", actualMetaPropertyGetResult.name());
    Class<Class> expectedPropertyTypeResult = Class.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).marketDataType());
    assertSame(metaBeanResult, filterResult.metaBean());
    assertSame(metaBeanResult, perturbationResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code perturbation}.
   *   <li>Then return name is {@code perturbation}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'perturbation'; then return name is 'perturbation'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPerturbation_thenReturnNameIsPerturbation() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act
    MetaProperty<?> actualMetaPropertyGetResult =
        metaPerturbationMappingResult.metaPropertyGet("perturbation");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<MarketDataFilter<?, ?>> filterResult = ((Meta<Object>) metaBeanResult).filter();
    assertTrue(filterResult instanceof DirectMetaProperty);
    MetaProperty<Class<Object>> marketDataTypeResult =
        ((Meta<Object>) metaBeanResult).marketDataType();
    assertTrue(marketDataTypeResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("perturbation", actualMetaPropertyGetResult.name());
    Class<ScenarioPerturbation> expectedPropertyTypeResult = ScenarioPerturbation.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta<Object>) metaBeanResult).perturbation());
    assertSame(metaBeanResult, filterResult.metaBean());
    assertSame(metaBeanResult, marketDataTypeResult.metaBean());
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
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act and Assert
    assertNull(metaPerturbationMappingResult.metaPropertyGet("Property Name"));
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
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        metaPerturbationMappingResult.metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("marketDataType");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("filter");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("perturbation");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("filter", getResult2.name());
    assertEquals("marketDataType", getResult.name());
    assertEquals("perturbation", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<MarketDataFilter> expectedPropertyTypeResult = MarketDataFilter.class;
    assertEquals(expectedPropertyTypeResult, getResult2.propertyType());
    Class<PerturbationMapping> expectedDeclaringTypeResult = PerturbationMapping.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<PerturbationMapping> expectedDeclaringTypeResult2 = PerturbationMapping.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<PerturbationMapping> expectedDeclaringTypeResult3 = PerturbationMapping.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<ScenarioPerturbation> expectedPropertyTypeResult2 = ScenarioPerturbation.class;
    assertEquals(expectedPropertyTypeResult2, getResult3.propertyType());
    Class<Class> expectedPropertyTypeResult3 = Class.class;
    assertEquals(expectedPropertyTypeResult3, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult3.metaBean());
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
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act and Assert
    assertNull(metaPerturbationMappingResult.propertyGet(mock(Bean.class), "Property Name", true));
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
    Class<Object> cls = Object.class;
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaPerturbationMappingResult.propertyGet(
                filterResult
                    .marketDataType(marketDataType)
                    .perturbation(mock(ScenarioPerturbation.class))
                    .build(),
                "Property Name",
                false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code Object}.
   *   <li>Then return {@link IdFilter}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'java.lang.Object'; then return IdFilter")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenJavaLangObject_thenReturnIdFilter() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    Builder<Object> builderResult = PerturbationMapping.builder();
    IdFilter<?> filter = new IdFilter<>(mock(MarketDataId.class));

    Builder<Object> filterResult = builderResult.filter(filter);
    Class<Object> marketDataType = Object.class;

    // Act
    Object actualPropertyGetResult =
        metaPerturbationMappingResult.propertyGet(
            filterResult
                .marketDataType(marketDataType)
                .perturbation(mock(ScenarioPerturbation.class))
                .build(),
            "filter",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof IdFilter);
    assertSame(filter, actualPropertyGetResult);
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
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            metaPerturbationMappingResult.propertySet(
                mock(Bean.class), "filter", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code filter}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'filter'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFilter_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaPerturbationMappingResult.propertySet(
                mock(Bean.class), "filter", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code marketDataType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'marketDataType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMarketDataType_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaPerturbationMappingResult.propertySet(
                mock(Bean.class), "marketDataType", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code perturbation}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'perturbation'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPerturbation_thenDoesNotThrow() {
    // Arrange
    Class<Object> cls = Object.class;
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act and Assert
    assertDoesNotThrow(
        () ->
            metaPerturbationMappingResult.propertySet(
                mock(Bean.class), "perturbation", "New Value", true));
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
    Meta<Object> metaPerturbationMappingResult = PerturbationMapping.metaPerturbationMapping(cls);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaPerturbationMappingResult.propertySet(
                mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link PerturbationMapping#of(MarketDataFilter, ScenarioPerturbation)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then Filter return {@link IdFilter}.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#of(MarketDataFilter, ScenarioPerturbation)}
   */
  @Test
  @DisplayName(
      "Test of(MarketDataFilter, ScenarioPerturbation); given 'java.lang.Object'; then Filter return IdFilter")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PerturbationMapping PerturbationMapping.of(MarketDataFilter, ScenarioPerturbation)"
  })
  void testOf_givenJavaLangObject_thenFilterReturnIdFilter() {
    // Arrange
    IdFilter<?> filter = new IdFilter<>(mock(MarketDataId.class));

    ScenarioPerturbation<Object> perturbation = mock(ScenarioPerturbation.class);
    Class<Object> forNameResult = Object.class;
    when(perturbation.getMarketDataType()).thenReturn(forNameResult);

    // Act
    PerturbationMapping<Object> actualOfResult = PerturbationMapping.of(filter, perturbation);

    // Assert
    verify(perturbation).getMarketDataType();
    MarketDataFilter<?, ?> filter2 = actualOfResult.getFilter();
    assertTrue(filter2 instanceof IdFilter);
    assertEquals(0, actualOfResult.getScenarioCount());
    Class<Object> expectedMarketDataType = Object.class;
    assertEquals(expectedMarketDataType, actualOfResult.getMarketDataType());
    assertSame(filter, filter2);
    assertSame(perturbation, actualOfResult.getPerturbation());
  }

  /**
   * Test {@link PerturbationMapping#matches(MarketDataId, MarketDataBox, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#matches(MarketDataId, MarketDataBox,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test matches(MarketDataId, MarketDataBox, ReferenceData); given IllegalArgumentException(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PerturbationMapping.matches(MarketDataId, MarketDataBox, ReferenceData)"
  })
  void testMatches_givenIllegalArgumentException_thenThrowIllegalArgumentException() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;
    PerturbationMapping<Object> perturbationMapping =
        filterResult
            .marketDataType(marketDataType)
            .perturbation(mock(ScenarioPerturbation.class))
            .build();
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);

    MarketDataBox<Object> marketData = mock(MarketDataBox.class);
    Mockito.<Class<?>>when(marketData.getMarketDataType())
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> perturbationMapping.matches(marketDataId, marketData, mock(ReferenceData.class)));
    verify(marketData).getMarketDataType();
  }

  /**
   * Test {@link PerturbationMapping#matches(MarketDataId, MarketDataBox, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link TestingName#TestingName(String)} with {@code Name}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#matches(MarketDataId, MarketDataBox,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test matches(MarketDataId, MarketDataBox, ReferenceData); given TestingName(String) with 'Name'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PerturbationMapping.matches(MarketDataId, MarketDataBox, ReferenceData)"
  })
  void testMatches_givenTestingNameWithName_thenReturnFalse() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new NameFilter<>(new TestingName("Name")));
    Class<Object> marketDataType = Object.class;
    PerturbationMapping<Object> perturbationMapping =
        filterResult
            .marketDataType(marketDataType)
            .perturbation(mock(ScenarioPerturbation.class))
            .build();
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);

    MarketDataBox<Object> marketData = mock(MarketDataBox.class);
    Class<Object> forNameResult = Object.class;
    Mockito.<Class<?>>when(marketData.getMarketDataType()).thenReturn(forNameResult);

    // Act
    boolean actualMatchesResult =
        perturbationMapping.matches(marketDataId, marketData, mock(ReferenceData.class));

    // Assert
    verify(marketData).getMarketDataType();
    assertFalse(actualMatchesResult);
  }

  /**
   * Test {@link PerturbationMapping#matches(MarketDataId, MarketDataBox, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#matches(MarketDataId, MarketDataBox,
   * ReferenceData)}
   */
  @Test
  @DisplayName("Test matches(MarketDataId, MarketDataBox, ReferenceData); then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PerturbationMapping.matches(MarketDataId, MarketDataBox, ReferenceData)"
  })
  void testMatches_thenReturnFalse() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;
    PerturbationMapping<Object> perturbationMapping =
        filterResult
            .marketDataType(marketDataType)
            .perturbation(mock(ScenarioPerturbation.class))
            .build();
    MarketDataId<Object> marketDataId = mock(MarketDataId.class);

    MarketDataBox<Object> marketData = mock(MarketDataBox.class);
    Class<Object> forNameResult = Object.class;
    Mockito.<Class<?>>when(marketData.getMarketDataType()).thenReturn(forNameResult);

    // Act
    boolean actualMatchesResult =
        perturbationMapping.matches(marketDataId, marketData, mock(ReferenceData.class));

    // Assert
    verify(marketData).getMarketDataType();
    assertFalse(actualMatchesResult);
  }

  /**
   * Test {@link PerturbationMapping#applyPerturbation(MarketDataBox, ReferenceData)}.
   *
   * <p>Method under test: {@link PerturbationMapping#applyPerturbation(MarketDataBox,
   * ReferenceData)}
   */
  @Test
  @DisplayName("Test applyPerturbation(MarketDataBox, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataBox PerturbationMapping.applyPerturbation(MarketDataBox, ReferenceData)"
  })
  void testApplyPerturbation() {
    // Arrange
    ScenarioPerturbation<Object> perturbation = mock(ScenarioPerturbation.class);
    when(perturbation.applyTo(Mockito.<MarketDataBox<Object>>any(), Mockito.<ReferenceData>any()))
        .thenThrow(new IllegalArgumentException());

    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;
    PerturbationMapping<Object> perturbationMapping =
        filterResult.marketDataType(marketDataType).perturbation(perturbation).build();

    MarketDataBox<Object> marketData = mock(MarketDataBox.class);
    Class<Object> forNameResult = Object.class;
    Mockito.<Class<?>>when(marketData.getMarketDataType()).thenReturn(forNameResult);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> perturbationMapping.applyPerturbation(marketData, mock(ReferenceData.class)));
    verify(marketData).getMarketDataType();
    verify(perturbation).applyTo(isA(MarketDataBox.class), isA(ReferenceData.class));
  }

  /**
   * Test {@link PerturbationMapping#applyPerturbation(MarketDataBox, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#applyPerturbation(MarketDataBox,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test applyPerturbation(MarketDataBox, ReferenceData); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataBox PerturbationMapping.applyPerturbation(MarketDataBox, ReferenceData)"
  })
  void testApplyPerturbation_givenIllegalArgumentException() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;
    PerturbationMapping<Object> perturbationMapping =
        filterResult
            .marketDataType(marketDataType)
            .perturbation(mock(ScenarioPerturbation.class))
            .build();

    MarketDataBox<Object> marketData = mock(MarketDataBox.class);
    Mockito.<Class<?>>when(marketData.getMarketDataType())
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> perturbationMapping.applyPerturbation(marketData, mock(ReferenceData.class)));
    verify(marketData).getMarketDataType();
  }

  /**
   * Test {@link PerturbationMapping#applyPerturbation(MarketDataBox, ReferenceData)}.
   *
   * <ul>
   *   <li>Then calls {@link ScenarioPerturbation#applyTo(MarketDataBox, ReferenceData)}.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#applyPerturbation(MarketDataBox,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test applyPerturbation(MarketDataBox, ReferenceData); then calls applyTo(MarketDataBox, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataBox PerturbationMapping.applyPerturbation(MarketDataBox, ReferenceData)"
  })
  void testApplyPerturbation_thenCallsApplyTo() {
    // Arrange
    ScenarioPerturbation<Object> perturbation = mock(ScenarioPerturbation.class);
    when(perturbation.applyTo(Mockito.<MarketDataBox<Object>>any(), Mockito.<ReferenceData>any()))
        .thenReturn(mock(MarketDataBox.class));

    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;
    PerturbationMapping<Object> perturbationMapping =
        filterResult.marketDataType(marketDataType).perturbation(perturbation).build();

    MarketDataBox<Object> marketData = mock(MarketDataBox.class);
    Class<Object> forNameResult = Object.class;
    Mockito.<Class<?>>when(marketData.getMarketDataType()).thenReturn(forNameResult);

    // Act
    perturbationMapping.applyPerturbation(marketData, mock(ReferenceData.class));

    // Assert
    verify(marketData).getMarketDataType();
    verify(perturbation).applyTo(isA(MarketDataBox.class), isA(ReferenceData.class));
  }

  /**
   * Test {@link PerturbationMapping#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then return three.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then return three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int PerturbationMapping.getScenarioCount()"})
  void testGetScenarioCount_thenReturnThree() {
    // Arrange
    ScenarioPerturbation<Object> perturbation = mock(ScenarioPerturbation.class);
    when(perturbation.getScenarioCount()).thenReturn(3);

    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;

    // Act
    int actualScenarioCount =
        filterResult
            .marketDataType(marketDataType)
            .perturbation(perturbation)
            .build()
            .getScenarioCount();

    // Assert
    verify(perturbation).getScenarioCount();
    assertEquals(3, actualScenarioCount);
  }

  /**
   * Test {@link PerturbationMapping#getScenarioCount()}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#getScenarioCount()}
   */
  @Test
  @DisplayName("Test getScenarioCount(); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int PerturbationMapping.getScenarioCount()"})
  void testGetScenarioCount_thenThrowIllegalArgumentException() {
    // Arrange
    ScenarioPerturbation<Object> perturbation = mock(ScenarioPerturbation.class);
    when(perturbation.getScenarioCount()).thenThrow(new IllegalArgumentException());

    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            filterResult
                .marketDataType(marketDataType)
                .perturbation(perturbation)
                .build()
                .getScenarioCount());
    verify(perturbation).getScenarioCount();
  }

  /**
   * Test {@link PerturbationMapping#meta()}.
   *
   * <p>Method under test: {@link PerturbationMapping#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PerturbationMapping.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = PerturbationMapping.meta();

    // Assert
    MetaProperty<MarketDataFilter> filterResult = actualMetaResult.filter();
    assertTrue(filterResult instanceof DirectMetaProperty);
    MetaProperty<Class> marketDataTypeResult = actualMetaResult.marketDataType();
    assertTrue(marketDataTypeResult instanceof DirectMetaProperty);
    MetaProperty<ScenarioPerturbation> perturbationResult = actualMetaResult.perturbation();
    assertTrue(perturbationResult instanceof DirectMetaProperty);
    assertEquals("filter", filterResult.name());
    assertEquals("marketDataType", marketDataTypeResult.name());
    assertEquals("perturbation", perturbationResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, filterResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, marketDataTypeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, perturbationResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<MarketDataFilter> expectedPropertyTypeResult = MarketDataFilter.class;
    assertEquals(expectedPropertyTypeResult, filterResult.propertyType());
    Class<PerturbationMapping> expectedDeclaringTypeResult = PerturbationMapping.class;
    assertEquals(expectedDeclaringTypeResult, filterResult.declaringType());
    Class<PerturbationMapping> expectedDeclaringTypeResult2 = PerturbationMapping.class;
    assertEquals(expectedDeclaringTypeResult2, marketDataTypeResult.declaringType());
    Class<PerturbationMapping> expectedDeclaringTypeResult3 = PerturbationMapping.class;
    assertEquals(expectedDeclaringTypeResult3, perturbationResult.declaringType());
    Class<ScenarioPerturbation> expectedPropertyTypeResult2 = ScenarioPerturbation.class;
    assertEquals(expectedPropertyTypeResult2, perturbationResult.propertyType());
    Class<Class> expectedPropertyTypeResult3 = Class.class;
    assertEquals(expectedPropertyTypeResult3, marketDataTypeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, filterResult.metaBean());
    assertSame(meta, marketDataTypeResult.metaBean());
    assertSame(meta, perturbationResult.metaBean());
  }

  /**
   * Test {@link PerturbationMapping#metaPerturbationMapping(Class)}.
   *
   * <p>Method under test: {@link PerturbationMapping#metaPerturbationMapping(Class)}
   */
  @Test
  @DisplayName("Test metaPerturbationMapping(Class)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PerturbationMapping.metaPerturbationMapping(Class)"})
  void testMetaPerturbationMapping() {
    // Arrange
    Class<Object> cls = Object.class;

    // Act
    Meta<Object> actualMetaPerturbationMappingResult =
        PerturbationMapping.metaPerturbationMapping(cls);

    // Assert
    MetaProperty<MarketDataFilter<?, ?>> filterResult =
        actualMetaPerturbationMappingResult.filter();
    assertTrue(filterResult instanceof DirectMetaProperty);
    MetaProperty<Class<Object>> marketDataTypeResult =
        actualMetaPerturbationMappingResult.marketDataType();
    assertTrue(marketDataTypeResult instanceof DirectMetaProperty);
    MetaProperty<ScenarioPerturbation<Object>> perturbationResult =
        actualMetaPerturbationMappingResult.perturbation();
    assertTrue(perturbationResult instanceof DirectMetaProperty);
    assertEquals("filter", filterResult.name());
    assertEquals("marketDataType", marketDataTypeResult.name());
    assertEquals("perturbation", perturbationResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, filterResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, marketDataTypeResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, perturbationResult.style());
    assertTrue(actualMetaPerturbationMappingResult.isBuildable());
    Class<MarketDataFilter> expectedPropertyTypeResult = MarketDataFilter.class;
    assertEquals(expectedPropertyTypeResult, filterResult.propertyType());
    Class<PerturbationMapping> expectedDeclaringTypeResult = PerturbationMapping.class;
    assertEquals(expectedDeclaringTypeResult, filterResult.declaringType());
    Class<PerturbationMapping> expectedDeclaringTypeResult2 = PerturbationMapping.class;
    assertEquals(expectedDeclaringTypeResult2, marketDataTypeResult.declaringType());
    Class<PerturbationMapping> expectedDeclaringTypeResult3 = PerturbationMapping.class;
    assertEquals(expectedDeclaringTypeResult3, perturbationResult.declaringType());
    Class<ScenarioPerturbation> expectedPropertyTypeResult2 = ScenarioPerturbation.class;
    assertEquals(expectedPropertyTypeResult2, perturbationResult.propertyType());
    Class<Class> expectedPropertyTypeResult3 = Class.class;
    assertEquals(expectedPropertyTypeResult3, marketDataTypeResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, filterResult.metaBean());
    assertSame(meta, marketDataTypeResult.metaBean());
    assertSame(meta, perturbationResult.metaBean());
  }

  /**
   * Test {@link PerturbationMapping#metaBean()}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return {@link Meta#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); given 'java.lang.Object'; then return INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta PerturbationMapping.metaBean()"})
  void testMetaBean_givenJavaLangObject_thenReturnInstance() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        filterResult
            .marketDataType(marketDataType)
            .perturbation(mock(ScenarioPerturbation.class))
            .build()
            .metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PerturbationMapping#toString()}
   *   <li>{@link PerturbationMapping#getFilter()}
   *   <li>{@link PerturbationMapping#getMarketDataType()}
   *   <li>{@link PerturbationMapping#getPerturbation()}
   *   <li>{@link PerturbationMapping#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataFilter PerturbationMapping.getFilter()",
    "Class PerturbationMapping.getMarketDataType()",
    "ScenarioPerturbation PerturbationMapping.getPerturbation()",
    "Builder PerturbationMapping.toBuilder()",
    "String PerturbationMapping.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();
    IdFilter<?> filter = new IdFilter<>(mock(MarketDataId.class));

    Builder<Object> filterResult = builderResult.filter(filter);
    Class<Object> marketDataType = Object.class;
    PerturbationMapping<Object> perturbationMapping =
        filterResult
            .marketDataType(marketDataType)
            .perturbation(mock(ScenarioPerturbation.class))
            .build();

    // Act
    perturbationMapping.toString();
    MarketDataFilter<?, ?> actualFilter = perturbationMapping.getFilter();
    Class<Object> actualMarketDataType = perturbationMapping.getMarketDataType();
    perturbationMapping.getPerturbation();
    perturbationMapping.toBuilder();

    // Assert
    Class<Object> expectedMarketDataType = Object.class;
    assertEquals(expectedMarketDataType, actualMarketDataType);
    assertSame(filter, actualFilter);
  }

  /**
   * Test {@link PerturbationMapping#equals(Object)}, and {@link PerturbationMapping#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link PerturbationMapping#equals(Object)}
   *   <li>{@link PerturbationMapping#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PerturbationMapping.equals(Object)",
    "int PerturbationMapping.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;
    PerturbationMapping<Object> perturbationMapping =
        filterResult
            .marketDataType(marketDataType)
            .perturbation(mock(ScenarioPerturbation.class))
            .build();

    // Act and Assert
    assertEquals(perturbationMapping, perturbationMapping);
    int expectedHashCodeResult = perturbationMapping.hashCode();
    assertEquals(expectedHashCodeResult, perturbationMapping.hashCode());
  }

  /**
   * Test {@link PerturbationMapping#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PerturbationMapping.equals(Object)",
    "int PerturbationMapping.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;
    PerturbationMapping<Object> perturbationMapping =
        filterResult
            .marketDataType(marketDataType)
            .perturbation(mock(ScenarioPerturbation.class))
            .build();

    Builder<Object> builderResult2 = PerturbationMapping.builder();

    Builder<Object> filterResult2 = builderResult2.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType2 = Object.class;

    // Act and Assert
    assertNotEquals(
        perturbationMapping,
        filterResult2
            .marketDataType(marketDataType2)
            .perturbation(mock(ScenarioPerturbation.class))
            .build());
  }

  /**
   * Test {@link PerturbationMapping#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PerturbationMapping.equals(Object)",
    "int PerturbationMapping.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;

    // Act and Assert
    assertNotEquals(
        filterResult
            .marketDataType(marketDataType)
            .perturbation(mock(ScenarioPerturbation.class))
            .build(),
        null);
  }

  /**
   * Test {@link PerturbationMapping#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link PerturbationMapping#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean PerturbationMapping.equals(Object)",
    "int PerturbationMapping.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder<Object> builderResult = PerturbationMapping.builder();

    Builder<Object> filterResult = builderResult.filter(new IdFilter<>(mock(MarketDataId.class)));
    Class<Object> marketDataType = Object.class;

    // Act and Assert
    assertNotEquals(
        filterResult
            .marketDataType(marketDataType)
            .perturbation(mock(ScenarioPerturbation.class))
            .build(),
        "Different type to PerturbationMapping");
  }
}
