package com.opengamma.strata.market.curve;

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
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.DefaultCurveMetadata.Meta;
import com.opengamma.strata.market.param.ParameterMetadata;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DefaultCurveMetadataDiffblueTest {
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
    Class<? extends DefaultCurveMetadata> actualBeanTypeResult =
        DefaultCurveMetadata.meta().beanType();

    // Assert
    Class<DefaultCurveMetadata> expectedBeanTypeResult = DefaultCurveMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#curveName()}
   *   <li>{@link Meta#info()}
   *   <li>{@link Meta#parameterMetadata()}
   *   <li>{@link Meta#xValueType()}
   *   <li>{@link Meta#yValueType()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.curveName()",
    "MetaProperty Meta.info()",
    "MetaProperty Meta.parameterMetadata()",
    "MetaProperty Meta.xValueType()",
    "MetaProperty Meta.yValueType()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = DefaultCurveMetadata.meta();

    // Act
    MetaProperty<CurveName> actualCurveNameResult = metaResult.curveName();
    MetaProperty<ImmutableMap<CurveInfoType<?>, Object>> actualInfoResult = metaResult.info();
    MetaProperty<List<ParameterMetadata>> actualParameterMetadataResult =
        metaResult.parameterMetadata();
    MetaProperty<ValueType> actualXValueTypeResult = metaResult.xValueType();

    // Assert
    assertTrue(actualCurveNameResult instanceof DirectMetaProperty);
    assertTrue(actualInfoResult instanceof DirectMetaProperty);
    assertTrue(actualParameterMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualXValueTypeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yValueType() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code curveName}.
   *   <li>Then return name is {@code curveName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'curveName'; then return name is 'curveName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurveName_thenReturnNameIsCurveName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DefaultCurveMetadata.meta().metaPropertyGet("curveName");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<CurveInfoType<?>, Object>> infoResult =
        ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<List<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> xValueTypeResult = ((Meta) metaBeanResult).xValueType();
    assertTrue(xValueTypeResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> yValueTypeResult = ((Meta) metaBeanResult).yValueType();
    assertTrue(yValueTypeResult instanceof DirectMetaProperty);
    assertEquals("curveName", actualMetaPropertyGetResult.name());
    Class<CurveName> expectedPropertyTypeResult = CurveName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).curveName());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then return name is {@code info}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'info'; then return name is 'info'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenInfo_thenReturnNameIsInfo() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DefaultCurveMetadata.meta().metaPropertyGet("info");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveName> curveNameResult = ((Meta) metaBeanResult).curveName();
    assertTrue(curveNameResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<List<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> xValueTypeResult = ((Meta) metaBeanResult).xValueType();
    assertTrue(xValueTypeResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> yValueTypeResult = ((Meta) metaBeanResult).yValueType();
    assertTrue(yValueTypeResult instanceof DirectMetaProperty);
    assertEquals("info", actualMetaPropertyGetResult.name());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).info());
    assertSame(metaBeanResult, curveNameResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code parameterMetadata}.
   *   <li>Then return name is {@code parameterMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'parameterMetadata'; then return name is 'parameterMetadata'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenParameterMetadata_thenReturnNameIsParameterMetadata() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DefaultCurveMetadata.meta().metaPropertyGet("parameterMetadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveName> curveNameResult = ((Meta) metaBeanResult).curveName();
    assertTrue(curveNameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<CurveInfoType<?>, Object>> infoResult =
        ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> xValueTypeResult = ((Meta) metaBeanResult).xValueType();
    assertTrue(xValueTypeResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> yValueTypeResult = ((Meta) metaBeanResult).yValueType();
    assertTrue(yValueTypeResult instanceof DirectMetaProperty);
    assertEquals("parameterMetadata", actualMetaPropertyGetResult.name());
    Class<List> expectedPropertyTypeResult = List.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).parameterMetadata());
    assertSame(metaBeanResult, curveNameResult.metaBean());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
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
    assertNull(DefaultCurveMetadata.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code xValueType}.
   *   <li>Then return name is {@code xValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'xValueType'; then return name is 'xValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenXValueType_thenReturnNameIsXValueType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DefaultCurveMetadata.meta().metaPropertyGet("xValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveName> curveNameResult = ((Meta) metaBeanResult).curveName();
    assertTrue(curveNameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<CurveInfoType<?>, Object>> infoResult =
        ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<List<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> yValueTypeResult = ((Meta) metaBeanResult).yValueType();
    assertTrue(yValueTypeResult instanceof DirectMetaProperty);
    assertEquals("xValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValueType());
    assertSame(metaBeanResult, curveNameResult.metaBean());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yValueType}.
   *   <li>Then return name is {@code yValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yValueType'; then return name is 'yValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYValueType_thenReturnNameIsYValueType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DefaultCurveMetadata.meta().metaPropertyGet("yValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveName> curveNameResult = ((Meta) metaBeanResult).curveName();
    assertTrue(curveNameResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableMap<CurveInfoType<?>, Object>> infoResult =
        ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<List<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> xValueTypeResult = ((Meta) metaBeanResult).xValueType();
    assertTrue(xValueTypeResult instanceof DirectMetaProperty);
    assertEquals("yValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValueType());
    assertSame(metaBeanResult, curveNameResult.metaBean());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
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
        DefaultCurveMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("curveName") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("info") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("parameterMetadata") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("xValueType") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yValueType") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet() {
    // Arrange
    Meta metaResult = DefaultCurveMetadata.meta();
    DefaultCurveMetadata bean = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "xValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).UNKNOWN;
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
    assertSame(valueType, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet2() {
    // Arrange
    Meta metaResult = DefaultCurveMetadata.meta();
    DefaultCurveMetadata bean = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "yValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).UNKNOWN;
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
    assertSame(valueType, actualPropertyGetResult);
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
    assertNull(DefaultCurveMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code curveName}.
   *   <li>Then return {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'curveName'; then return CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCurveName_thenReturnCurveNameWithName() {
    // Arrange
    Meta metaResult = DefaultCurveMetadata.meta();
    CurveName name = CurveName.of("Name");

    // Act and Assert
    assertSame(name, metaResult.propertyGet(DefaultCurveMetadata.of(name), "curveName", true));
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
    Meta metaResult = DefaultCurveMetadata.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                DefaultCurveMetadata.of(CurveName.of("Name")), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then return {@link Map}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'info'; then return Map")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenInfo_thenReturnMap() {
    // Arrange
    Meta metaResult = DefaultCurveMetadata.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(DefaultCurveMetadata.of(CurveName.of("Name")), "info", true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof Map);
    assertTrue(((Map<Object, Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameterMetadata}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'parameterMetadata'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenParameterMetadata_thenReturnNull() {
    // Arrange
    Meta metaResult = DefaultCurveMetadata.meta();

    // Act and Assert
    assertNull(
        metaResult.propertyGet(
            DefaultCurveMetadata.of(CurveName.of("Name")), "parameterMetadata", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code curveName}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'curveName'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurveName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DefaultCurveMetadata.meta()
                .propertySet(mock(Bean.class), "curveName", "New Value", true));
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
            DefaultCurveMetadata.meta()
                .propertySet(mock(Bean.class), "curveName", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code info}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'info'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInfo_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> DefaultCurveMetadata.meta().propertySet(mock(Bean.class), "info", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameterMetadata}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'parameterMetadata'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenParameterMetadata_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DefaultCurveMetadata.meta()
                .propertySet(mock(Bean.class), "parameterMetadata", "New Value", true));
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
            DefaultCurveMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code xValueType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'xValueType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenXValueType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DefaultCurveMetadata.meta()
                .propertySet(mock(Bean.class), "xValueType", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yValueType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yValueType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYValueType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DefaultCurveMetadata.meta()
                .propertySet(mock(Bean.class), "yValueType", "New Value", true));
  }

  /**
   * Test {@link DefaultCurveMetadata#of(CurveName)} with {@code CurveName}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then return XValueType Name is {@code Unknown}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#of(CurveName)}
   */
  @Test
  @DisplayName(
      "Test of(CurveName) with 'CurveName'; when CurveName with 'Name'; then return XValueType Name is 'Unknown'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.of(CurveName)"})
  void testOfWithCurveName_whenCurveNameWithName_thenReturnXValueTypeNameIsUnknown() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    DefaultCurveMetadata actualOfResult = DefaultCurveMetadata.of(name);

    // Assert
    ValueType xValueType = actualOfResult.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertFalse(actualOfResult.getParameterMetadata().isPresent());
    assertTrue(actualOfResult.getInfo().isEmpty());
    assertSame(xValueType, actualOfResult.getYValueType());
    assertSame(name, actualOfResult.getCurveName());
  }

  /**
   * Test {@link DefaultCurveMetadata#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return CurveName Name is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#of(String)}
   */
  @Test
  @DisplayName("Test of(String) with 'String'; when 'Name'; then return CurveName Name is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.of(String)"})
  void testOfWithString_whenName_thenReturnCurveNameNameIsName() {
    // Arrange and Act
    DefaultCurveMetadata actualOfResult = DefaultCurveMetadata.of("Name");

    // Assert
    CurveName curveName = actualOfResult.getCurveName();
    assertEquals("Name", curveName.getName());
    ValueType xValueType = actualOfResult.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertFalse(actualOfResult.getParameterMetadata().isPresent());
    assertTrue(actualOfResult.getInfo().isEmpty());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
    assertSame(xValueType, actualOfResult.getYValueType());
  }

  /**
   * Test {@link DefaultCurveMetadata#getInfo(CurveInfoType)} with {@code CurveInfoType}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#getInfo(CurveInfoType)}
   */
  @Test
  @DisplayName("Test getInfo(CurveInfoType) with 'CurveInfoType'; given CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultCurveMetadata.getInfo(CurveInfoType)"})
  void testGetInfoWithCurveInfoType_givenCurveNameWithName() {
    // Arrange
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(CurveName.of("Name"));
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getInfo(type));
  }

  /**
   * Test {@link DefaultCurveMetadata#getInfo(CurveInfoType)} with {@code CurveInfoType}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#getInfo(CurveInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(CurveInfoType) with 'CurveInfoType'; given CurveName with 'Name'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultCurveMetadata.getInfo(CurveInfoType)"})
  void testGetInfoWithCurveInfoType_givenCurveNameWithName_whenNull() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> DefaultCurveMetadata.of(CurveName.of("Name")).getInfo(null));
  }

  /**
   * Test {@link DefaultCurveMetadata#getInfo(CurveInfoType)} with {@code CurveInfoType}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code 42} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#getInfo(CurveInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(CurveInfoType) with 'CurveInfoType'; given HashMap() of '42' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultCurveMetadata.getInfo(CurveInfoType)"})
  void testGetInfoWithCurveInfoType_givenHashMapOf42IsValue() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("CdsIndexFactor");
    info.put(ofResult, "Value");
    CurveInfoType<?> ofResult2 = CurveInfoType.of("42");
    info.put(ofResult2, "Value");
    CurveName curveName = CurveName.of("Curve info not found for type '{}'");

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> defaultCurveMetadata.getInfo(type));
  }

  /**
   * Test {@link DefaultCurveMetadata#getInfo(CurveInfoType)} with {@code CurveInfoType}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code CdsIndexFactor} is {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#getInfo(CurveInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(CurveInfoType) with 'CurveInfoType'; given HashMap() of 'CdsIndexFactor' is 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultCurveMetadata.getInfo(CurveInfoType)"})
  void testGetInfoWithCurveInfoType_givenHashMapOfCdsIndexFactorIsValue_thenReturnValue() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("CdsIndexFactor");
    info.put(ofResult, "Value");
    CurveInfoType<?> ofResult2 = CurveInfoType.of("Name");
    info.put(ofResult2, "Value");
    CurveName curveName = CurveName.of("Curve info not found for type '{}'");

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act and Assert
    assertEquals("Value", defaultCurveMetadata.getInfo(type));
  }

  /**
   * Test {@link DefaultCurveMetadata#getInfo(CurveInfoType)} with {@code CurveInfoType}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#getInfo(CurveInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(CurveInfoType) with 'CurveInfoType'; given HashMap() of 'Name' is 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultCurveMetadata.getInfo(CurveInfoType)"})
  void testGetInfoWithCurveInfoType_givenHashMapOfNameIsValue_thenReturnValue() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("Name");
    info.put(ofResult, "Value");
    CurveName curveName = CurveName.of("Curve info not found for type '{}'");

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act and Assert
    assertEquals("Value", defaultCurveMetadata.getInfo(type));
  }

  /**
   * Test {@link DefaultCurveMetadata#getParameterMetadata()}.
   *
   * <p>Method under test: {@link DefaultCurveMetadata#getParameterMetadata()}
   */
  @Test
  @DisplayName("Test getParameterMetadata()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCurveMetadata.getParameterMetadata()"})
  void testGetParameterMetadata() {
    // Arrange, Act and Assert
    assertFalse(DefaultCurveMetadata.of(CurveName.of("Name")).getParameterMetadata().isPresent());
  }

  /**
   * Test {@link DefaultCurveMetadata#findInfo(CurveInfoType)}.
   *
   * <ul>
   *   <li>Given {@link DefaultCurveMetadata} with name is {@link CurveName}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#findInfo(CurveInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(CurveInfoType); given DefaultCurveMetadata with name is CurveName; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCurveMetadata.findInfo(CurveInfoType)"})
  void testFindInfo_givenDefaultCurveMetadataWithNameIsCurveName_thenReturnNotPresent() {
    // Arrange
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(CurveName.of("Name"));
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act and Assert
    assertFalse(ofResult.findInfo(type).isPresent());
  }

  /**
   * Test {@link DefaultCurveMetadata#findInfo(CurveInfoType)}.
   *
   * <ul>
   *   <li>Given {@link DefaultCurveMetadata} with name is {@link CurveName}.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#findInfo(CurveInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(CurveInfoType); given DefaultCurveMetadata with name is CurveName; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCurveMetadata.findInfo(CurveInfoType)"})
  void testFindInfo_givenDefaultCurveMetadataWithNameIsCurveName_whenNull() {
    // Arrange, Act and Assert
    assertFalse(DefaultCurveMetadata.of(CurveName.of("Name")).findInfo(null).isPresent());
  }

  /**
   * Test {@link DefaultCurveMetadata#findInfo(CurveInfoType)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code 42} is {@code Value}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#findInfo(CurveInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(CurveInfoType); given HashMap() of '42' is 'Value'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCurveMetadata.findInfo(CurveInfoType)"})
  void testFindInfo_givenHashMapOf42IsValue_thenReturnNotPresent() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("CdsIndexFactor");
    info.put(ofResult, "Value");
    CurveInfoType<?> ofResult2 = CurveInfoType.of("42");
    info.put(ofResult2, "Value");
    CurveName curveName = CurveName.of("Name");

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act
    Optional<Object> actualFindInfoResult = defaultCurveMetadata.findInfo(type);

    // Assert
    assertFalse(actualFindInfoResult.isPresent());
  }

  /**
   * Test {@link DefaultCurveMetadata#findInfo(CurveInfoType)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code CdsIndexFactor} is {@code Value}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#findInfo(CurveInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(CurveInfoType); given HashMap() of 'CdsIndexFactor' is 'Value'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCurveMetadata.findInfo(CurveInfoType)"})
  void testFindInfo_givenHashMapOfCdsIndexFactorIsValue_thenReturnGetIsValue() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("CdsIndexFactor");
    info.put(ofResult, "Value");
    CurveInfoType<?> ofResult2 = CurveInfoType.of("Name");
    info.put(ofResult2, "Value");
    CurveName curveName = CurveName.of("Name");

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act
    Optional<Object> actualFindInfoResult = defaultCurveMetadata.findInfo(type);

    // Assert
    assertEquals("Value", actualFindInfoResult.get());
    assertTrue(actualFindInfoResult.isPresent());
  }

  /**
   * Test {@link DefaultCurveMetadata#findInfo(CurveInfoType)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#findInfo(CurveInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(CurveInfoType); given HashMap() of 'Name' is 'Value'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCurveMetadata.findInfo(CurveInfoType)"})
  void testFindInfo_givenHashMapOfNameIsValue_thenReturnGetIsValue() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("Name");
    info.put(ofResult, "Value");
    CurveName curveName = CurveName.of("Name");

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act
    Optional<Object> actualFindInfoResult = defaultCurveMetadata.findInfo(type);

    // Assert
    assertEquals("Value", actualFindInfoResult.get());
    assertTrue(actualFindInfoResult.isPresent());
  }

  /**
   * Test {@link DefaultCurveMetadata#withInfo(CurveInfoType, Object)}.
   *
   * <p>Method under test: {@link DefaultCurveMetadata#withInfo(CurveInfoType, Object)}
   */
  @Test
  @DisplayName("Test withInfo(CurveInfoType, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.withInfo(CurveInfoType, Object)"})
  void testWithInfo() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("Name");
    info.put(ofResult, "Value");
    CurveInfoType<?> ofResult2 = CurveInfoType.of("type");
    info.put(ofResult2, "Value");
    CurveName curveName = CurveName.of("type");

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act
    DefaultCurveMetadata actualWithInfoResult = defaultCurveMetadata.withInfo(type, "Value");

    // Assert
    assertEquals(defaultCurveMetadata, actualWithInfoResult);
  }

  /**
   * Test {@link DefaultCurveMetadata#withInfo(CurveInfoType, Object)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with {@code Name}.
   *   <li>Then return CurveName Name is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#withInfo(CurveInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(CurveInfoType, Object); given CurveName with 'Name'; then return CurveName Name is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.withInfo(CurveInfoType, Object)"})
  void testWithInfo_givenCurveNameWithName_thenReturnCurveNameNameIsName() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(name);
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act
    DefaultCurveMetadata actualWithInfoResult = ofResult.withInfo(type, "Value");

    // Assert
    CurveName curveName = actualWithInfoResult.getCurveName();
    assertEquals("Name", curveName.getName());
    ValueType xValueType = actualWithInfoResult.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertEquals(1, actualWithInfoResult.getInfo().size());
    assertFalse(actualWithInfoResult.getParameterMetadata().isPresent());
    assertSame(xValueType, actualWithInfoResult.getYValueType());
    assertSame(name, curveName);
  }

  /**
   * Test {@link DefaultCurveMetadata#withInfo(CurveInfoType, Object)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code type} is {@code Value}.
   *   <li>Then return Info size is two.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#withInfo(CurveInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(CurveInfoType, Object); given HashMap() of 'type' is 'Value'; then return Info size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.withInfo(CurveInfoType, Object)"})
  void testWithInfo_givenHashMapOfTypeIsValue_thenReturnInfoSizeIsTwo() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("type");
    info.put(ofResult, "Value");
    CurveName curveName = CurveName.of("type");

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act
    DefaultCurveMetadata actualWithInfoResult = defaultCurveMetadata.withInfo(type, "Value");

    // Assert
    ValueType xValueType = actualWithInfoResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    CurveName curveName2 = actualWithInfoResult.getCurveName();
    assertEquals("type", curveName2.getName());
    assertEquals(2, actualWithInfoResult.getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualWithInfoResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(xValueType, actualWithInfoResult.getYValueType());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link DefaultCurveMetadata#withInfo(CurveInfoType, Object)}.
   *
   * <ul>
   *   <li>Then return XValueType Name is {@code BlackVolatility}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#withInfo(CurveInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(CurveInfoType, Object); then return XValueType Name is 'BlackVolatility'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.withInfo(CurveInfoType, Object)"})
  void testWithInfo_thenReturnXValueTypeNameIsBlackVolatility() {
    // Arrange
    CurveName curveName = CurveName.of("type");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act
    DefaultCurveMetadata actualWithInfoResult = defaultCurveMetadata.withInfo(type, "Value");

    // Assert
    ValueType xValueType = actualWithInfoResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    CurveName curveName2 = actualWithInfoResult.getCurveName();
    assertEquals("type", curveName2.getName());
    assertEquals(1, actualWithInfoResult.getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualWithInfoResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(xValueType, actualWithInfoResult.getYValueType());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link DefaultCurveMetadata#withInfo(CurveInfoType, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link DefaultCurveMetadata} with name is {@link CurveName}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#withInfo(CurveInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(CurveInfoType, Object); when 'null'; then return DefaultCurveMetadata with name is CurveName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.withInfo(CurveInfoType, Object)"})
  void testWithInfo_whenNull_thenReturnDefaultCurveMetadataWithNameIsCurveName() {
    // Arrange
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(CurveName.of("Name"));
    CurveInfoType<Object> type = CurveInfoType.of("Name");

    // Act
    DefaultCurveMetadata actualWithInfoResult = ofResult.withInfo(type, null);

    // Assert
    assertEquals(ofResult, actualWithInfoResult);
  }

  /**
   * Test {@link DefaultCurveMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Given {@link CurveName} with name is {@code curveName}.
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); given CurveName with name is 'curveName'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_givenCurveNameWithNameIsCurveName_thenReturnInfoEmpty() {
    // Arrange
    CurveName curveName = CurveName.of("curveName");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultCurveMetadata actualWithParameterMetadataResult =
        defaultCurveMetadata.withParameterMetadata(null);

    // Assert
    ValueType xValueType = actualWithParameterMetadataResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    CurveName curveName2 = actualWithParameterMetadataResult.getCurveName();
    assertEquals("curveName", curveName2.getName());
    assertTrue(actualWithParameterMetadataResult.getInfo().isEmpty());
    assertSame(xValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link DefaultCurveMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code curveName} is {@code Value}.
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); given HashMap() of 'curveName' is 'Value'; then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_givenHashMapOfCurveNameIsValue_thenReturnInfoSizeIsOne() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("curveName");
    info.put(ofResult, "Value");
    CurveName curveName = CurveName.of("curveName");

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultCurveMetadata actualWithParameterMetadataResult =
        defaultCurveMetadata.withParameterMetadata(null);

    // Assert
    ValueType xValueType = actualWithParameterMetadataResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    CurveName curveName2 = actualWithParameterMetadataResult.getCurveName();
    assertEquals("curveName", curveName2.getName());
    assertEquals(1, actualWithParameterMetadataResult.getInfo().size());
    assertSame(xValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link DefaultCurveMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return Info size is two.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); given HashMap() of 'Name' is 'Value'; then return Info size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_givenHashMapOfNameIsValue_thenReturnInfoSizeIsTwo() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("Name");
    info.put(ofResult, "Value");
    CurveInfoType<?> ofResult2 = CurveInfoType.of("curveName");
    info.put(ofResult2, "Value");
    CurveName curveName = CurveName.of("curveName");

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultCurveMetadata actualWithParameterMetadataResult =
        defaultCurveMetadata.withParameterMetadata(null);

    // Assert
    ValueType xValueType = actualWithParameterMetadataResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    CurveName curveName2 = actualWithParameterMetadataResult.getCurveName();
    assertEquals("curveName", curveName2.getName());
    assertEquals(2, actualWithParameterMetadataResult.getInfo().size());
    assertSame(xValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link DefaultCurveMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code xValueType} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName("Test withParameterMetadata(List); given HashMap() of 'xValueType' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_givenHashMapOfXValueTypeIsValue() {
    // Arrange
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("Name");
    info.put(ofResult, "Value");
    CurveInfoType<?> ofResult2 = CurveInfoType.of("xValueType");
    info.put(ofResult2, "Value");
    CurveName curveName = CurveName.of("curveName");

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultCurveMetadata actualWithParameterMetadataResult =
        defaultCurveMetadata.withParameterMetadata(null);

    // Assert
    ValueType xValueType = actualWithParameterMetadataResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    CurveName curveName2 = actualWithParameterMetadataResult.getCurveName();
    assertEquals("curveName", curveName2.getName());
    assertEquals(2, actualWithParameterMetadataResult.getInfo().size());
    assertSame(xValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(curveName, curveName2);
  }

  /**
   * Test {@link DefaultCurveMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata} with name is {@link CurveName}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); then return DefaultCurveMetadata with name is CurveName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_thenReturnDefaultCurveMetadataWithNameIsCurveName() {
    // Arrange
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act
    DefaultCurveMetadata actualWithParameterMetadataResult = ofResult.withParameterMetadata(null);

    // Assert
    assertSame(ofResult, actualWithParameterMetadataResult);
  }

  /**
   * Test {@link DefaultCurveMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return CurveName Name is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); when ArrayList(); then return CurveName Name is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCurveMetadata DefaultCurveMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_whenArrayList_thenReturnCurveNameNameIsName() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(name);

    // Act
    DefaultCurveMetadata actualWithParameterMetadataResult =
        ofResult.withParameterMetadata(new ArrayList<>());

    // Assert
    CurveName curveName = actualWithParameterMetadataResult.getCurveName();
    assertEquals("Name", curveName.getName());
    ValueType xValueType = actualWithParameterMetadataResult.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualWithParameterMetadataResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(xValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(name, curveName);
  }

  /**
   * Test {@link DefaultCurveMetadata#meta()}.
   *
   * <p>Method under test: {@link DefaultCurveMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DefaultCurveMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DefaultCurveMetadata.meta();

    // Assert
    assertTrue(actualMetaResult.curveName() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.info() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link DefaultCurveMetadata#DefaultCurveMetadata(CurveName, ValueType, ValueType, Map,
   * List)}.
   *
   * <ul>
   *   <li>Given of {@code Name}.
   *   <li>When {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#DefaultCurveMetadata(CurveName, ValueType,
   * ValueType, Map, List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultCurveMetadata(CurveName, ValueType, ValueType, Map, List); given of 'Name'; when HashMap() of 'Name' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCurveMetadata.<init>(CurveName, ValueType, ValueType, Map, List)"
  })
  void testNewDefaultCurveMetadata_givenOfName_whenHashMapOfNameIsValue() {
    // Arrange
    CurveName curveName = CurveName.of("Name");

    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("Name");
    info.put(ofResult, "Value");
    CurveInfoType<?> ofResult2 = CurveInfoType.of("curveName");
    info.put(ofResult2, "Value");

    // Act
    DefaultCurveMetadata actualDefaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDefaultCurveMetadata.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertEquals(info, actualDefaultCurveMetadata.getInfo());
  }

  /**
   * Test {@link DefaultCurveMetadata#DefaultCurveMetadata(CurveName, ValueType, ValueType, Map,
   * List)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>Then return ParameterMetadata Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#DefaultCurveMetadata(CurveName, ValueType,
   * ValueType, Map, List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultCurveMetadata(CurveName, ValueType, ValueType, Map, List); given 'Value'; then return ParameterMetadata Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCurveMetadata.<init>(CurveName, ValueType, ValueType, Map, List)"
  })
  void testNewDefaultCurveMetadata_givenValue_thenReturnParameterMetadataEmpty() {
    // Arrange
    CurveName curveName = CurveName.of("Name");

    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();
    CurveInfoType<?> ofResult = CurveInfoType.of("curveName");
    info.put(ofResult, "Value");

    // Act
    DefaultCurveMetadata actualDefaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDefaultCurveMetadata.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertEquals(info, actualDefaultCurveMetadata.getInfo());
  }

  /**
   * Test {@link DefaultCurveMetadata#DefaultCurveMetadata(CurveName, ValueType, ValueType, Map,
   * List)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ParameterMetadata Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#DefaultCurveMetadata(CurveName, ValueType,
   * ValueType, Map, List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultCurveMetadata(CurveName, ValueType, ValueType, Map, List); when HashMap(); then return ParameterMetadata Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCurveMetadata.<init>(CurveName, ValueType, ValueType, Map, List)"
  })
  void testNewDefaultCurveMetadata_whenHashMap_thenReturnParameterMetadataEmpty() {
    // Arrange
    CurveName curveName = CurveName.of("Name");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    // Act
    DefaultCurveMetadata actualDefaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDefaultCurveMetadata.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertEquals(info, actualDefaultCurveMetadata.getInfo());
  }

  /**
   * Test {@link DefaultCurveMetadata#metaBean()}.
   *
   * <p>Method under test: {@link DefaultCurveMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DefaultCurveMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, DefaultCurveMetadata.of(CurveName.of("Name")).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCurveMetadata#toString()}
   *   <li>{@link DefaultCurveMetadata#getCurveName()}
   *   <li>{@link DefaultCurveMetadata#getInfo()}
   *   <li>{@link DefaultCurveMetadata#getXValueType()}
   *   <li>{@link DefaultCurveMetadata#getYValueType()}
   *   <li>{@link DefaultCurveMetadata#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveName DefaultCurveMetadata.getCurveName()",
    "ImmutableMap DefaultCurveMetadata.getInfo()",
    "ValueType DefaultCurveMetadata.getXValueType()",
    "ValueType DefaultCurveMetadata.getYValueType()",
    "DefaultCurveMetadataBuilder DefaultCurveMetadata.toBuilder()",
    "String DefaultCurveMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(name);

    // Act
    String actualToStringResult = ofResult.toString();
    CurveName actualCurveName = ofResult.getCurveName();
    ImmutableMap<CurveInfoType<?>, Object> actualInfo = ofResult.getInfo();
    ValueType actualXValueType = ofResult.getXValueType();
    ValueType actualYValueType = ofResult.getYValueType();
    ofResult.toBuilder();

    // Assert
    assertEquals(
        "DefaultCurveMetadata{curveName=Name, xValueType=Unknown, yValueType=Unknown, info={}, parameterMetadata"
            + "=null}",
        actualToStringResult);
    assertTrue(actualInfo.isEmpty());
    assertSame(name, actualCurveName);
    ValueType valueType = ValueType.UNKNOWN;
    assertSame(valueType, actualXValueType);
    assertSame(valueType, actualYValueType);
  }

  /**
   * Test {@link DefaultCurveMetadata#equals(Object)}, and {@link DefaultCurveMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCurveMetadata#equals(Object)}
   *   <li>{@link DefaultCurveMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCurveMetadata.equals(Object)",
    "int DefaultCurveMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(CurveName.of("Name"));
    DefaultCurveMetadata ofResult2 = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultCurveMetadata#equals(Object)}, and {@link DefaultCurveMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCurveMetadata#equals(Object)}
   *   <li>{@link DefaultCurveMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCurveMetadata.equals(Object)",
    "int DefaultCurveMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultCurveMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCurveMetadata.equals(Object)",
    "int DefaultCurveMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    CurveName curveName = CurveName.of("Name");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata defaultCurveMetadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    assertNotEquals(defaultCurveMetadata, DefaultCurveMetadata.of(CurveName.of("Name")));
  }

  /**
   * Test {@link DefaultCurveMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCurveMetadata.equals(Object)",
    "int DefaultCurveMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(CurveName.of("name"));

    // Act and Assert
    assertNotEquals(ofResult, DefaultCurveMetadata.of(CurveName.of("Name")));
  }

  /**
   * Test {@link DefaultCurveMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCurveMetadata.equals(Object)",
    "int DefaultCurveMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DefaultCurveMetadata.of(CurveName.of("Name")), null);
  }

  /**
   * Test {@link DefaultCurveMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCurveMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCurveMetadata.equals(Object)",
    "int DefaultCurveMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        DefaultCurveMetadata.of(CurveName.of("Name")), "Different type to DefaultCurveMetadata");
  }
}
