package com.opengamma.strata.market.curve;

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
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.RatesCurveInputs.Builder;
import com.opengamma.strata.market.curve.RatesCurveInputs.Meta;
import java.util.ArrayList;
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

class RatesCurveInputsDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveInputs Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualBuilderResult = RatesCurveInputs.builder();
    DefaultCurveMetadata curveMetadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    Builder actualCurveMetadataResult = actualBuilderResult.curveMetadata(curveMetadata);

    // Assert
    assertSame(
        curveMetadata,
        actualCurveMetadataResult.marketData(new HashMap<>()).build().getCurveMetadata());
  }

  /**
   * Test Builder {@link Builder#curveMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link Builder#curveMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test Builder curveMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.curveMetadata(CurveMetadata)"})
  void testBuilderCurveMetadata() {
    // Arrange
    Builder builderResult = RatesCurveInputs.builder();
    DefaultCurveMetadata curveMetadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act
    Builder actualCurveMetadataResult = builderResult.curveMetadata(curveMetadata);

    // Assert
    assertSame(curveMetadata, builderResult.build().getCurveMetadata());
    assertSame(builderResult, actualCurveMetadataResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code curveMetadata}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'curveMetadata'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCurveMetadata_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(RatesCurveInputs.builder().get("curveMetadata"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code marketData}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'marketData'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenMarketData_thenReturnMap() {
    // Arrange and Act
    Object actualGetResult = RatesCurveInputs.builder().get("marketData");

    // Assert
    assertTrue(actualGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualGetResult).isEmpty());
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
        NoSuchElementException.class, () -> RatesCurveInputs.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#marketData(Map)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#marketData(Map)}
   */
  @Test
  @DisplayName("Test Builder marketData(Map); when HashMap(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.marketData(Map)"})
  void testBuilderMarketData_whenHashMap_thenReturnBuilder() {
    // Arrange
    Builder builderResult = RatesCurveInputs.builder();

    // Act
    Builder actualMarketDataResult = builderResult.marketData(new HashMap<>());

    // Assert
    assertSame(builderResult, actualMarketDataResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName("Test Builder set(String, Object) with 'propertyName', 'newValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue() {
    // Arrange
    Builder builderResult = RatesCurveInputs.builder();
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act
    Builder actualSetResult = builderResult.set("curveMetadata", ofResult);

    // Assert
    assertSame(ofResult, builderResult.build().getCurveMetadata());
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
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> RatesCurveInputs.builder().set("Property Name", "New Value"));
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
    Builder builderResult = RatesCurveInputs.builder();

    // Act
    Builder actualSetResult =
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
    // Arrange and Act
    Class<? extends RatesCurveInputs> actualBeanTypeResult = RatesCurveInputs.meta().beanType();

    // Assert
    Class<RatesCurveInputs> expectedBeanTypeResult = RatesCurveInputs.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#curveMetadata()}
   *   <li>{@link Meta#marketData()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.curveMetadata()", "MetaProperty Meta.marketData()"})
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = RatesCurveInputs.meta();

    // Act
    MetaProperty<CurveMetadata> actualCurveMetadataResult = metaResult.curveMetadata();

    // Assert
    assertTrue(actualCurveMetadataResult instanceof DirectMetaProperty);
    assertTrue(metaResult.marketData() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean curveMetadata return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean curveMetadata return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanCurveMetadataReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveInputs.meta().metaPropertyGet("marketData");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveMetadata> curveMetadataResult = ((Meta) metaBeanResult).curveMetadata();
    assertTrue(curveMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("curveMetadata", curveMetadataResult.name());
    assertEquals("marketData", actualMetaPropertyGetResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, curveMetadataResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    Class<CurveMetadata> expectedPropertyTypeResult2 = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult2, curveMetadataResult.propertyType());
    Class<RatesCurveInputs> expectedDeclaringTypeResult = RatesCurveInputs.class;
    assertEquals(expectedDeclaringTypeResult, curveMetadataResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).marketData());
    assertSame(Meta.INSTANCE, curveMetadataResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then metaBean marketData return {@link DirectMetaProperty}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); then metaBean marketData return DirectMetaProperty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenMetaBeanMarketDataReturnDirectMetaProperty() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        RatesCurveInputs.meta().metaPropertyGet("curveMetadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<? extends MarketDataId<?>, ?>> marketDataResult =
        ((Meta) metaBeanResult).marketData();
    assertTrue(marketDataResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("curveMetadata", actualMetaPropertyGetResult.name());
    assertEquals("marketData", marketDataResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, marketDataResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, marketDataResult.propertyType());
    Class<CurveMetadata> expectedPropertyTypeResult2 = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult2, actualMetaPropertyGetResult.propertyType());
    Class<RatesCurveInputs> expectedDeclaringTypeResult = RatesCurveInputs.class;
    assertEquals(expectedDeclaringTypeResult, marketDataResult.declaringType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).curveMetadata());
    assertSame(Meta.INSTANCE, marketDataResult.metaBean());
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
    assertNull(RatesCurveInputs.meta().metaPropertyGet("Property Name"));
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
        RatesCurveInputs.meta().metaPropertyMap();

    // Assert
    assertEquals(2, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("marketData");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("curveMetadata");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    assertEquals("curveMetadata", getResult2.name());
    assertEquals("marketData", getResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Class<CurveMetadata> expectedPropertyTypeResult2 = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult2, getResult2.propertyType());
    Class<RatesCurveInputs> expectedDeclaringTypeResult = RatesCurveInputs.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<RatesCurveInputs> expectedDeclaringTypeResult2 = RatesCurveInputs.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, metaBeanResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata} with name is {@link CurveName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); then return DefaultCurveMetadata with name is CurveName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_thenReturnDefaultCurveMetadataWithNameIsCurveName() {
    // Arrange
    Meta metaResult = RatesCurveInputs.meta();

    Builder builderResult = RatesCurveInputs.builder();
    DefaultCurveMetadata curveMetadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    Builder curveMetadataResult = builderResult.curveMetadata(curveMetadata);

    // Act and Assert
    assertSame(
        curveMetadata,
        metaResult.propertyGet(
            curveMetadataResult.marketData(new HashMap<>()).build(), "curveMetadata", true));
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
    Meta metaResult = RatesCurveInputs.meta();
    HashMap<MarketDataId<?>, Object> marketData = new HashMap<>();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                RatesCurveInputs.of(marketData, DefaultCurveMetadata.of(CurveName.of("Name"))),
                "Property Name",
                false));
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
    assertNull(RatesCurveInputs.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code marketData}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'marketData'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenMarketData_thenReturnMap() {
    // Arrange
    Meta metaResult = RatesCurveInputs.meta();

    Builder builderResult = RatesCurveInputs.builder();

    Builder curveMetadataResult =
        builderResult.curveMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            curveMetadataResult.marketData(new HashMap<>()).build(), "marketData", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code curveMetadata}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'curveMetadata'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurveMetadata_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveInputs.meta()
                .propertySet(mock(Bean.class), "curveMetadata", "New Value", true));
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
            RatesCurveInputs.meta()
                .propertySet(mock(Bean.class), "curveMetadata", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code marketData}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'marketData'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMarketData_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            RatesCurveInputs.meta().propertySet(mock(Bean.class), "marketData", "New Value", true));
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
            RatesCurveInputs.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link RatesCurveInputs#of(Map, CurveMetadata)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()}.
   *   <li>Then CurveMetadata return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputs#of(Map, CurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test of(Map, CurveMetadata); given HashMap(); then CurveMetadata return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveInputs RatesCurveInputs.of(Map, CurveMetadata)"})
  void testOf_givenHashMap_thenCurveMetadataReturnDefaultCurveMetadata() {
    // Arrange
    HashMap<MarketDataId<?>, Object> marketData = new HashMap<>();
    marketData.putAll(new HashMap<>());
    marketData.put(mock(MarketDataId.class), "Value");
    marketData.put(mock(MarketDataId.class), "Value");

    // Act
    RatesCurveInputs actualOfResult =
        RatesCurveInputs.of(marketData, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    CurveMetadata curveMetadata = actualOfResult.getCurveMetadata();
    assertTrue(curveMetadata instanceof DefaultCurveMetadata);
    assertEquals(2, actualOfResult.getMarketData().size());
    assertTrue(((DefaultCurveMetadata) curveMetadata).getInfo().isEmpty());
  }

  /**
   * Test {@link RatesCurveInputs#of(Map, CurveMetadata)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()}.
   *   <li>When {@link HashMap#HashMap()} All is {@link HashMap#HashMap()}.
   *   <li>Then return MarketData size is three.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputs#of(Map, CurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test of(Map, CurveMetadata); given HashMap(); when HashMap() All is HashMap(); then return MarketData size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveInputs RatesCurveInputs.of(Map, CurveMetadata)"})
  void testOf_givenHashMap_whenHashMapAllIsHashMap_thenReturnMarketDataSizeIsThree() {
    // Arrange
    HashMap<MarketDataId<?>, Object> marketData = new HashMap<>();
    marketData.put(mock(MarketDataId.class), "Value");
    marketData.putAll(new HashMap<>());
    marketData.put(mock(MarketDataId.class), "Value");
    marketData.put(mock(MarketDataId.class), "Value");

    // Act
    RatesCurveInputs actualOfResult =
        RatesCurveInputs.of(marketData, DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    CurveMetadata curveMetadata = actualOfResult.getCurveMetadata();
    assertTrue(curveMetadata instanceof DefaultCurveMetadata);
    assertEquals(3, actualOfResult.getMarketData().size());
    assertTrue(((DefaultCurveMetadata) curveMetadata).getInfo().isEmpty());
  }

  /**
   * Test {@link RatesCurveInputs#of(Map, CurveMetadata)}.
   *
   * <ul>
   *   <li>Given {@link MarketDataId}.
   *   <li>Then return MarketData size is one.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputs#of(Map, CurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test of(Map, CurveMetadata); given MarketDataId; then return MarketData size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveInputs RatesCurveInputs.of(Map, CurveMetadata)"})
  void testOf_givenMarketDataId_thenReturnMarketDataSizeIsOne() {
    // Arrange
    HashMap<MarketDataId<?>, Object> marketData = new HashMap<>();
    marketData.put(mock(MarketDataId.class), "Value");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act
    RatesCurveInputs actualOfResult = RatesCurveInputs.of(marketData, metadata);

    // Assert
    assertEquals(1, actualOfResult.getMarketData().size());
    assertSame(metadata, actualOfResult.getCurveMetadata());
  }

  /**
   * Test {@link RatesCurveInputs#of(Map, CurveMetadata)}.
   *
   * <ul>
   *   <li>Given {@link MarketDataId}.
   *   <li>Then return MarketData size is two.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputs#of(Map, CurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test of(Map, CurveMetadata); given MarketDataId; then return MarketData size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveInputs RatesCurveInputs.of(Map, CurveMetadata)"})
  void testOf_givenMarketDataId_thenReturnMarketDataSizeIsTwo() {
    // Arrange
    HashMap<MarketDataId<?>, Object> marketData = new HashMap<>();
    marketData.put(mock(MarketDataId.class), "Value");
    marketData.put(mock(MarketDataId.class), "Value");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act
    RatesCurveInputs actualOfResult = RatesCurveInputs.of(marketData, metadata);

    // Assert
    assertEquals(2, actualOfResult.getMarketData().size());
    assertSame(metadata, actualOfResult.getCurveMetadata());
  }

  /**
   * Test {@link RatesCurveInputs#of(Map, CurveMetadata)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return MarketData Empty.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputs#of(Map, CurveMetadata)}
   */
  @Test
  @DisplayName("Test of(Map, CurveMetadata); when HashMap(); then return MarketData Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesCurveInputs RatesCurveInputs.of(Map, CurveMetadata)"})
  void testOf_whenHashMap_thenReturnMarketDataEmpty() {
    // Arrange
    HashMap<MarketDataId<?>, Object> marketData = new HashMap<>();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act
    RatesCurveInputs actualOfResult = RatesCurveInputs.of(marketData, metadata);

    // Assert
    assertTrue(actualOfResult.getMarketData().isEmpty());
    assertSame(metadata, actualOfResult.getCurveMetadata());
  }

  /**
   * Test {@link RatesCurveInputs#meta()}.
   *
   * <p>Method under test: {@link RatesCurveInputs#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RatesCurveInputs.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = RatesCurveInputs.meta();

    // Assert
    MetaProperty<CurveMetadata> curveMetadataResult = actualMetaResult.curveMetadata();
    assertTrue(curveMetadataResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<? extends MarketDataId<?>, ?>> marketDataResult =
        actualMetaResult.marketData();
    assertTrue(marketDataResult instanceof DirectMetaProperty);
    assertEquals("curveMetadata", curveMetadataResult.name());
    assertEquals("marketData", marketDataResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, curveMetadataResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, marketDataResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, marketDataResult.propertyType());
    Class<CurveMetadata> expectedPropertyTypeResult2 = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult2, curveMetadataResult.propertyType());
    Class<RatesCurveInputs> expectedDeclaringTypeResult = RatesCurveInputs.class;
    assertEquals(expectedDeclaringTypeResult, curveMetadataResult.declaringType());
    Class<RatesCurveInputs> expectedDeclaringTypeResult2 = RatesCurveInputs.class;
    assertEquals(expectedDeclaringTypeResult2, marketDataResult.declaringType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, curveMetadataResult.metaBean());
    assertSame(meta, marketDataResult.metaBean());
  }

  /**
   * Test {@link RatesCurveInputs#metaBean()}.
   *
   * <p>Method under test: {@link RatesCurveInputs#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta RatesCurveInputs.metaBean()"})
  void testMetaBean() {
    // Arrange
    HashMap<MarketDataId<?>, Object> marketData = new HashMap<>();

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        RatesCurveInputs.of(marketData, DefaultCurveMetadata.of(CurveName.of("Name"))).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveInputs#toString()}
   *   <li>{@link RatesCurveInputs#getCurveMetadata()}
   *   <li>{@link RatesCurveInputs#getMarketData()}
   *   <li>{@link RatesCurveInputs#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveMetadata RatesCurveInputs.getCurveMetadata()",
    "ImmutableMap RatesCurveInputs.getMarketData()",
    "Builder RatesCurveInputs.toBuilder()",
    "String RatesCurveInputs.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = RatesCurveInputs.builder();
    DefaultCurveMetadata curveMetadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    Builder curveMetadataResult = builderResult.curveMetadata(curveMetadata);
    RatesCurveInputs ratesCurveInputs = curveMetadataResult.marketData(new HashMap<>()).build();

    // Act
    String actualToStringResult = ratesCurveInputs.toString();
    CurveMetadata actualCurveMetadata = ratesCurveInputs.getCurveMetadata();
    ratesCurveInputs.getMarketData();
    ratesCurveInputs.toBuilder();

    // Assert
    assertEquals(
        "RatesCurveInputs{marketData={}, curveMetadata=DefaultCurveMetadata{curveName=Name, xValueType=Unknown,"
            + " yValueType=Unknown, info={}, parameterMetadata=null}}",
        actualToStringResult);
    assertSame(curveMetadata, actualCurveMetadata);
  }

  /**
   * Test {@link RatesCurveInputs#equals(Object)}, and {@link RatesCurveInputs#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveInputs#equals(Object)}
   *   <li>{@link RatesCurveInputs#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveInputs.equals(Object)", "int RatesCurveInputs.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = RatesCurveInputs.builder();

    Builder curveMetadataResult =
        builderResult.curveMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    RatesCurveInputs ratesCurveInputs = curveMetadataResult.marketData(new HashMap<>()).build();

    Builder builderResult2 = RatesCurveInputs.builder();

    Builder curveMetadataResult2 =
        builderResult2.curveMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    RatesCurveInputs ratesCurveInputs2 = curveMetadataResult2.marketData(new HashMap<>()).build();

    // Act and Assert
    assertEquals(ratesCurveInputs, ratesCurveInputs2);
    assertEquals(ratesCurveInputs.hashCode(), ratesCurveInputs2.hashCode());
  }

  /**
   * Test {@link RatesCurveInputs#equals(Object)}, and {@link RatesCurveInputs#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RatesCurveInputs#equals(Object)}
   *   <li>{@link RatesCurveInputs#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveInputs.equals(Object)", "int RatesCurveInputs.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = RatesCurveInputs.builder();

    Builder curveMetadataResult =
        builderResult.curveMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    RatesCurveInputs ratesCurveInputs = curveMetadataResult.marketData(new HashMap<>()).build();

    // Act and Assert
    assertEquals(ratesCurveInputs, ratesCurveInputs);
    int expectedHashCodeResult = ratesCurveInputs.hashCode();
    assertEquals(expectedHashCodeResult, ratesCurveInputs.hashCode());
  }

  /**
   * Test {@link RatesCurveInputs#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputs#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveInputs.equals(Object)", "int RatesCurveInputs.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = RatesCurveInputs.builder();
    CurveName curveName = CurveName.of("Name");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata curveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    Builder curveMetadataResult = builderResult.curveMetadata(curveMetadata);
    RatesCurveInputs ratesCurveInputs = curveMetadataResult.marketData(new HashMap<>()).build();

    Builder builderResult2 = RatesCurveInputs.builder();

    Builder curveMetadataResult2 =
        builderResult2.curveMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertNotEquals(ratesCurveInputs, curveMetadataResult2.marketData(new HashMap<>()).build());
  }

  /**
   * Test {@link RatesCurveInputs#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputs#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveInputs.equals(Object)", "int RatesCurveInputs.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<MarketDataId<?>, Object> marketData = new HashMap<>();
    marketData.put(mock(MarketDataId.class), "Value");

    Builder builderResult = RatesCurveInputs.builder();
    RatesCurveInputs ratesCurveInputs =
        builderResult
            .curveMetadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .marketData(marketData)
            .build();

    Builder builderResult2 = RatesCurveInputs.builder();

    Builder curveMetadataResult =
        builderResult2.curveMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertNotEquals(ratesCurveInputs, curveMetadataResult.marketData(new HashMap<>()).build());
  }

  /**
   * Test {@link RatesCurveInputs#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputs#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveInputs.equals(Object)", "int RatesCurveInputs.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = RatesCurveInputs.builder();

    Builder curveMetadataResult =
        builderResult.curveMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertNotEquals(curveMetadataResult.marketData(new HashMap<>()).build(), null);
  }

  /**
   * Test {@link RatesCurveInputs#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RatesCurveInputs#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean RatesCurveInputs.equals(Object)", "int RatesCurveInputs.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = RatesCurveInputs.builder();

    Builder curveMetadataResult =
        builderResult.curveMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertNotEquals(
        curveMetadataResult.marketData(new HashMap<>()).build(),
        "Different type to RatesCurveInputs");
  }
}
