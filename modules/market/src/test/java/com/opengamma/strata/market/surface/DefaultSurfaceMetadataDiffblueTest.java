package com.opengamma.strata.market.surface;

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
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.surface.DefaultSurfaceMetadata.Meta;
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

class DefaultSurfaceMetadataDiffblueTest {
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
    Class<? extends DefaultSurfaceMetadata> actualBeanTypeResult =
        DefaultSurfaceMetadata.meta().beanType();

    // Assert
    Class<DefaultSurfaceMetadata> expectedBeanTypeResult = DefaultSurfaceMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#info()}
   *   <li>{@link Meta#parameterMetadata()}
   *   <li>{@link Meta#surfaceName()}
   *   <li>{@link Meta#xValueType()}
   *   <li>{@link Meta#yValueType()}
   *   <li>{@link Meta#zValueType()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.info()",
    "MetaProperty Meta.parameterMetadata()",
    "MetaProperty Meta.surfaceName()",
    "MetaProperty Meta.xValueType()",
    "MetaProperty Meta.yValueType()",
    "MetaProperty Meta.zValueType()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = DefaultSurfaceMetadata.meta();

    // Act
    MetaProperty<ImmutableMap<SurfaceInfoType<?>, Object>> actualInfoResult = metaResult.info();
    MetaProperty<List<ParameterMetadata>> actualParameterMetadataResult =
        metaResult.parameterMetadata();
    MetaProperty<SurfaceName> actualSurfaceNameResult = metaResult.surfaceName();
    MetaProperty<ValueType> actualXValueTypeResult = metaResult.xValueType();
    MetaProperty<ValueType> actualYValueTypeResult = metaResult.yValueType();

    // Assert
    assertTrue(actualInfoResult instanceof DirectMetaProperty);
    assertTrue(actualParameterMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualSurfaceNameResult instanceof DirectMetaProperty);
    assertTrue(actualXValueTypeResult instanceof DirectMetaProperty);
    assertTrue(actualYValueTypeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.zValueType() instanceof DirectMetaProperty);
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
        DefaultSurfaceMetadata.meta().metaPropertyGet("info");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).surfaceName() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zValueType() instanceof DirectMetaProperty);
    assertEquals("info", actualMetaPropertyGetResult.name());
    Class<ImmutableMap> expectedPropertyTypeResult = ImmutableMap.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).info());
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
        DefaultSurfaceMetadata.meta().metaPropertyGet("parameterMetadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).surfaceName() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zValueType() instanceof DirectMetaProperty);
    assertEquals("parameterMetadata", actualMetaPropertyGetResult.name());
    Class<List> expectedPropertyTypeResult = List.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).parameterMetadata());
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
    assertNull(DefaultSurfaceMetadata.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code surfaceName}.
   *   <li>Then return name is {@code surfaceName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'surfaceName'; then return name is 'surfaceName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenSurfaceName_thenReturnNameIsSurfaceName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DefaultSurfaceMetadata.meta().metaPropertyGet("surfaceName");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zValueType() instanceof DirectMetaProperty);
    assertEquals("surfaceName", actualMetaPropertyGetResult.name());
    Class<SurfaceName> expectedPropertyTypeResult = SurfaceName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).surfaceName());
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
        DefaultSurfaceMetadata.meta().metaPropertyGet("xValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<SurfaceInfoType<?>, Object>> infoResult =
        ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<List<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceName> surfaceNameResult = ((Meta) metaBeanResult).surfaceName();
    assertTrue(surfaceNameResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> yValueTypeResult = ((Meta) metaBeanResult).yValueType();
    assertTrue(yValueTypeResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> zValueTypeResult = ((Meta) metaBeanResult).zValueType();
    assertTrue(zValueTypeResult instanceof DirectMetaProperty);
    assertEquals("xValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValueType());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, surfaceNameResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
    assertSame(metaBeanResult, zValueTypeResult.metaBean());
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
        DefaultSurfaceMetadata.meta().metaPropertyGet("yValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<SurfaceInfoType<?>, Object>> infoResult =
        ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<List<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceName> surfaceNameResult = ((Meta) metaBeanResult).surfaceName();
    assertTrue(surfaceNameResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> xValueTypeResult = ((Meta) metaBeanResult).xValueType();
    assertTrue(xValueTypeResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> zValueTypeResult = ((Meta) metaBeanResult).zValueType();
    assertTrue(zValueTypeResult instanceof DirectMetaProperty);
    assertEquals("yValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValueType());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, surfaceNameResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, zValueTypeResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code zValueType}.
   *   <li>Then return name is {@code zValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'zValueType'; then return name is 'zValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenZValueType_thenReturnNameIsZValueType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DefaultSurfaceMetadata.meta().metaPropertyGet("zValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableMap<SurfaceInfoType<?>, Object>> infoResult =
        ((Meta) metaBeanResult).info();
    assertTrue(infoResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<List<ParameterMetadata>> parameterMetadataResult =
        ((Meta) metaBeanResult).parameterMetadata();
    assertTrue(parameterMetadataResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceName> surfaceNameResult = ((Meta) metaBeanResult).surfaceName();
    assertTrue(surfaceNameResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> xValueTypeResult = ((Meta) metaBeanResult).xValueType();
    assertTrue(xValueTypeResult instanceof DirectMetaProperty);
    MetaProperty<ValueType> yValueTypeResult = ((Meta) metaBeanResult).yValueType();
    assertTrue(yValueTypeResult instanceof DirectMetaProperty);
    assertEquals("zValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zValueType());
    assertSame(metaBeanResult, infoResult.metaBean());
    assertSame(metaBeanResult, parameterMetadataResult.metaBean());
    assertSame(metaBeanResult, surfaceNameResult.metaBean());
    assertSame(metaBeanResult, xValueTypeResult.metaBean());
    assertSame(metaBeanResult, yValueTypeResult.metaBean());
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
        DefaultSurfaceMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(6, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("info") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("parameterMetadata") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("surfaceName") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("xValueType") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yValueType") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("zValueType") instanceof DirectMetaProperty);
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
    assertNull(DefaultSurfaceMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = DefaultSurfaceMetadata.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                DefaultSurfaceMetadata.of(SurfaceName.of("Name")), "Property Name", false));
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
    Meta metaResult = DefaultSurfaceMetadata.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), "info", true);

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
    Meta metaResult = DefaultSurfaceMetadata.meta();

    // Act and Assert
    assertNull(
        metaResult.propertyGet(
            DefaultSurfaceMetadata.of(SurfaceName.of("Name")), "parameterMetadata", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code surfaceName}.
   *   <li>Then return {@link SurfaceName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'surfaceName'; then return SurfaceName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSurfaceName_thenReturnSurfaceNameWithName() {
    // Arrange
    Meta metaResult = DefaultSurfaceMetadata.meta();
    SurfaceName name = SurfaceName.of("Name");

    // Act and Assert
    assertSame(name, metaResult.propertyGet(DefaultSurfaceMetadata.of(name), "surfaceName", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code xValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'xValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenXValueType() {
    // Arrange
    Meta metaResult = DefaultSurfaceMetadata.meta();
    DefaultSurfaceMetadata bean = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "xValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).UNKNOWN;
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
    assertSame(valueType, bean.getZValueType());
    assertSame(valueType, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code yValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'yValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenYValueType() {
    // Arrange
    Meta metaResult = DefaultSurfaceMetadata.meta();
    DefaultSurfaceMetadata bean = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "yValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).UNKNOWN;
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
    assertSame(valueType, bean.getZValueType());
    assertSame(valueType, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code zValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'zValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenZValueType() {
    // Arrange
    Meta metaResult = DefaultSurfaceMetadata.meta();
    DefaultSurfaceMetadata bean = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "zValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).UNKNOWN;
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
    assertSame(valueType, bean.getZValueType());
    assertSame(valueType, actualPropertyGetResult);
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
            DefaultSurfaceMetadata.meta()
                .propertySet(mock(Bean.class), "info", "New Value", false));
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
        () ->
            DefaultSurfaceMetadata.meta().propertySet(mock(Bean.class), "info", "New Value", true));
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
            DefaultSurfaceMetadata.meta()
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
            DefaultSurfaceMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code surfaceName}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'surfaceName'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSurfaceName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DefaultSurfaceMetadata.meta()
                .propertySet(mock(Bean.class), "surfaceName", "New Value", true));
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
            DefaultSurfaceMetadata.meta()
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
            DefaultSurfaceMetadata.meta()
                .propertySet(mock(Bean.class), "yValueType", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code zValueType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'zValueType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenZValueType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DefaultSurfaceMetadata.meta()
                .propertySet(mock(Bean.class), "zValueType", "New Value", true));
  }

  /**
   * Test {@link DefaultSurfaceMetadata#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return SurfaceName Name is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#of(String)}
   */
  @Test
  @DisplayName("Test of(String) with 'String'; when 'Name'; then return SurfaceName Name is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultSurfaceMetadata DefaultSurfaceMetadata.of(String)"})
  void testOfWithString_whenName_thenReturnSurfaceNameNameIsName() {
    // Arrange and Act
    DefaultSurfaceMetadata actualOfResult = DefaultSurfaceMetadata.of("Name");

    // Assert
    SurfaceName surfaceName = actualOfResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType xValueType = actualOfResult.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertFalse(actualOfResult.getParameterMetadata().isPresent());
    assertTrue(actualOfResult.getInfo().isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
    assertSame(xValueType, actualOfResult.getYValueType());
    assertSame(xValueType, actualOfResult.getZValueType());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#of(SurfaceName)} with {@code SurfaceName}.
   *
   * <ul>
   *   <li>When {@link SurfaceName} with {@code Name}.
   *   <li>Then return XValueType Name is {@code Unknown}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#of(SurfaceName)}
   */
  @Test
  @DisplayName(
      "Test of(SurfaceName) with 'SurfaceName'; when SurfaceName with 'Name'; then return XValueType Name is 'Unknown'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultSurfaceMetadata DefaultSurfaceMetadata.of(SurfaceName)"})
  void testOfWithSurfaceName_whenSurfaceNameWithName_thenReturnXValueTypeNameIsUnknown() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    DefaultSurfaceMetadata actualOfResult = DefaultSurfaceMetadata.of(name);

    // Assert
    ValueType xValueType = actualOfResult.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertFalse(actualOfResult.getParameterMetadata().isPresent());
    assertTrue(actualOfResult.getInfo().isEmpty());
    assertSame(xValueType, actualOfResult.getYValueType());
    assertSame(xValueType, actualOfResult.getZValueType());
    assertSame(name, actualOfResult.getSurfaceName());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)} with {@code SurfaceInfoType}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code DayCount} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(SurfaceInfoType) with 'SurfaceInfoType'; given HashMap() of 'DayCount' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultSurfaceMetadata.getInfo(SurfaceInfoType)"})
  void testGetInfoWithSurfaceInfoType_givenHashMapOfDayCountIsValue() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("DayCount");
    info.put(ofResult, "Value");
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("Surface info not found for type '{}'");
    info.put(ofResult2, "Value");
    SurfaceName surfaceName = SurfaceName.of("Surface info not found for type '{}'");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> defaultSurfaceMetadata.getInfo(type));
  }

  /**
   * Test {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)} with {@code SurfaceInfoType}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(SurfaceInfoType) with 'SurfaceInfoType'; given HashMap() of 'Name' is 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultSurfaceMetadata.getInfo(SurfaceInfoType)"})
  void testGetInfoWithSurfaceInfoType_givenHashMapOfNameIsValue_thenReturnValue() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("Name");
    info.put(ofResult, "Value");
    SurfaceName surfaceName = SurfaceName.of("Surface info not found for type '{}'");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act and Assert
    assertEquals("Value", defaultSurfaceMetadata.getInfo(type));
  }

  /**
   * Test {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)} with {@code SurfaceInfoType}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(SurfaceInfoType) with 'SurfaceInfoType'; given HashMap() of 'Name' is 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultSurfaceMetadata.getInfo(SurfaceInfoType)"})
  void testGetInfoWithSurfaceInfoType_givenHashMapOfNameIsValue_thenReturnValue2() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("Name");
    info.put(ofResult, "Value");
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("Surface info not found for type '{}'");
    info.put(ofResult2, "Value");
    SurfaceName surfaceName = SurfaceName.of("Surface info not found for type '{}'");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act and Assert
    assertEquals("Value", defaultSurfaceMetadata.getInfo(type));
  }

  /**
   * Test {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)} with {@code SurfaceInfoType}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Surface info not found for type '{}'} is {@code
   *       Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(SurfaceInfoType) with 'SurfaceInfoType'; given HashMap() of 'Surface info not found for type '{}'' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultSurfaceMetadata.getInfo(SurfaceInfoType)"})
  void testGetInfoWithSurfaceInfoType_givenHashMapOfSurfaceInfoNotFoundForTypeIsValue() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("Surface info not found for type '{}'");
    info.put(ofResult, "Value");
    SurfaceName surfaceName = SurfaceName.of("Surface info not found for type '{}'");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> defaultSurfaceMetadata.getInfo(type));
  }

  /**
   * Test {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)} with {@code SurfaceInfoType}.
   *
   * <ul>
   *   <li>Given {@link SurfaceName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(SurfaceInfoType) with 'SurfaceInfoType'; given SurfaceName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultSurfaceMetadata.getInfo(SurfaceInfoType)"})
  void testGetInfoWithSurfaceInfoType_givenSurfaceNameWithName() {
    // Arrange
    DefaultSurfaceMetadata ofResult = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getInfo(type));
  }

  /**
   * Test {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)} with {@code SurfaceInfoType}.
   *
   * <ul>
   *   <li>Given {@link SurfaceName} with {@code Name}.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(SurfaceInfoType) with 'SurfaceInfoType'; given SurfaceName with 'Name'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultSurfaceMetadata.getInfo(SurfaceInfoType)"})
  void testGetInfoWithSurfaceInfoType_givenSurfaceNameWithName_whenNull() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> DefaultSurfaceMetadata.of(SurfaceName.of("Name")).getInfo(null));
  }

  /**
   * Test {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)} with {@code SurfaceInfoType}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#getInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(SurfaceInfoType) with 'SurfaceInfoType'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultSurfaceMetadata.getInfo(SurfaceInfoType)"})
  void testGetInfoWithSurfaceInfoType_thenThrowIllegalArgumentException() {
    // Arrange
    SurfaceName surfaceName = SurfaceName.of("Surface info not found for type '{}'");
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> defaultSurfaceMetadata.getInfo(type));
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultSurfaceMetadata#toString()}
   *   <li>{@link DefaultSurfaceMetadata#getInfo()}
   *   <li>{@link DefaultSurfaceMetadata#getSurfaceName()}
   *   <li>{@link DefaultSurfaceMetadata#getXValueType()}
   *   <li>{@link DefaultSurfaceMetadata#getYValueType()}
   *   <li>{@link DefaultSurfaceMetadata#getZValueType()}
   *   <li>{@link DefaultSurfaceMetadata#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableMap DefaultSurfaceMetadata.getInfo()",
    "SurfaceName DefaultSurfaceMetadata.getSurfaceName()",
    "ValueType DefaultSurfaceMetadata.getXValueType()",
    "ValueType DefaultSurfaceMetadata.getYValueType()",
    "ValueType DefaultSurfaceMetadata.getZValueType()",
    "DefaultSurfaceMetadataBuilder DefaultSurfaceMetadata.toBuilder()",
    "String DefaultSurfaceMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");
    DefaultSurfaceMetadata ofResult = DefaultSurfaceMetadata.of(name);

    // Act
    String actualToStringResult = ofResult.toString();
    ImmutableMap<SurfaceInfoType<?>, Object> actualInfo = ofResult.getInfo();
    SurfaceName actualSurfaceName = ofResult.getSurfaceName();
    ValueType actualXValueType = ofResult.getXValueType();
    ValueType actualYValueType = ofResult.getYValueType();
    ValueType actualZValueType = ofResult.getZValueType();
    ofResult.toBuilder();

    // Assert
    assertEquals(
        "DefaultSurfaceMetadata{surfaceName=Name, xValueType=Unknown, yValueType=Unknown, zValueType=Unknown,"
            + " info={}, parameterMetadata=null}",
        actualToStringResult);
    assertTrue(actualInfo.isEmpty());
    assertSame(name, actualSurfaceName);
    ValueType valueType = ValueType.UNKNOWN;
    assertSame(valueType, actualXValueType);
    assertSame(valueType, actualYValueType);
    assertSame(valueType, actualZValueType);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#getParameterMetadata()}.
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#getParameterMetadata()}
   */
  @Test
  @DisplayName("Test getParameterMetadata()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultSurfaceMetadata.getParameterMetadata()"})
  void testGetParameterMetadata() {
    // Arrange, Act and Assert
    assertFalse(
        DefaultSurfaceMetadata.of(SurfaceName.of("Name")).getParameterMetadata().isPresent());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#findInfo(SurfaceInfoType)}.
   *
   * <ul>
   *   <li>Given {@link DefaultSurfaceMetadata} with name is {@link SurfaceName}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#findInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(SurfaceInfoType); given DefaultSurfaceMetadata with name is SurfaceName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultSurfaceMetadata.findInfo(SurfaceInfoType)"})
  void testFindInfo_givenDefaultSurfaceMetadataWithNameIsSurfaceName() {
    // Arrange
    DefaultSurfaceMetadata ofResult = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act and Assert
    assertFalse(ofResult.findInfo(type).isPresent());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#findInfo(SurfaceInfoType)}.
   *
   * <ul>
   *   <li>Given {@link DefaultSurfaceMetadata} with name is {@link SurfaceName}.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#findInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(SurfaceInfoType); given DefaultSurfaceMetadata with name is SurfaceName; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultSurfaceMetadata.findInfo(SurfaceInfoType)"})
  void testFindInfo_givenDefaultSurfaceMetadataWithNameIsSurfaceName_whenNull() {
    // Arrange, Act and Assert
    assertFalse(DefaultSurfaceMetadata.of(SurfaceName.of("Name")).findInfo(null).isPresent());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#findInfo(SurfaceInfoType)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code 42} is {@code Value}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#findInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(SurfaceInfoType); given HashMap() of '42' is 'Value'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultSurfaceMetadata.findInfo(SurfaceInfoType)"})
  void testFindInfo_givenHashMapOf42IsValue_thenReturnNotPresent() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("DayCount");
    info.put(ofResult, "Value");
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("42");
    info.put(ofResult2, "Value");
    SurfaceName surfaceName = SurfaceName.of("Name");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act
    Optional<Object> actualFindInfoResult = defaultSurfaceMetadata.findInfo(type);

    // Assert
    assertFalse(actualFindInfoResult.isPresent());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#findInfo(SurfaceInfoType)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code DayCount} is {@code Value}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#findInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(SurfaceInfoType); given HashMap() of 'DayCount' is 'Value'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultSurfaceMetadata.findInfo(SurfaceInfoType)"})
  void testFindInfo_givenHashMapOfDayCountIsValue_thenReturnGetIsValue() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("DayCount");
    info.put(ofResult, "Value");
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("Name");
    info.put(ofResult2, "Value");
    SurfaceName surfaceName = SurfaceName.of("Name");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act
    Optional<Object> actualFindInfoResult = defaultSurfaceMetadata.findInfo(type);

    // Assert
    assertEquals("Value", actualFindInfoResult.get());
    assertTrue(actualFindInfoResult.isPresent());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#findInfo(SurfaceInfoType)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#findInfo(SurfaceInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(SurfaceInfoType); given HashMap() of 'Name' is 'Value'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultSurfaceMetadata.findInfo(SurfaceInfoType)"})
  void testFindInfo_givenHashMapOfNameIsValue_thenReturnGetIsValue() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("Name");
    info.put(ofResult, "Value");
    SurfaceName surfaceName = SurfaceName.of("Name");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act
    Optional<Object> actualFindInfoResult = defaultSurfaceMetadata.findInfo(type);

    // Assert
    assertEquals("Value", actualFindInfoResult.get());
    assertTrue(actualFindInfoResult.isPresent());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}.
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}
   */
  @Test
  @DisplayName("Test withInfo(SurfaceInfoType, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadata DefaultSurfaceMetadata.withInfo(SurfaceInfoType, Object)"
  })
  void testWithInfo() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("Name");
    info.put(ofResult, "Value");
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("type");
    info.put(ofResult2, "Value");
    SurfaceName surfaceName = SurfaceName.of("type");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act
    DefaultSurfaceMetadata actualWithInfoResult = defaultSurfaceMetadata.withInfo(type, "Value");

    // Assert
    assertEquals(defaultSurfaceMetadata, actualWithInfoResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code DayCount} is {@code Value}.
   *   <li>Then return Info size is three.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(SurfaceInfoType, Object); given HashMap() of 'DayCount' is 'Value'; then return Info size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadata DefaultSurfaceMetadata.withInfo(SurfaceInfoType, Object)"
  })
  void testWithInfo_givenHashMapOfDayCountIsValue_thenReturnInfoSizeIsThree() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("DayCount");
    info.put(ofResult, "Value");
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("type");
    info.put(ofResult2, "Value");
    SurfaceName surfaceName = SurfaceName.of("type");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act
    DefaultSurfaceMetadata actualWithInfoResult = defaultSurfaceMetadata.withInfo(type, "Value");

    // Assert
    ValueType xValueType = actualWithInfoResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    SurfaceName surfaceName2 = actualWithInfoResult.getSurfaceName();
    assertEquals("type", surfaceName2.getName());
    assertEquals(3, actualWithInfoResult.getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualWithInfoResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(xValueType, actualWithInfoResult.getYValueType());
    assertSame(xValueType, actualWithInfoResult.getZValueType());
    assertSame(surfaceName, surfaceName2);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code type} is {@code Value}.
   *   <li>Then return Info size is two.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(SurfaceInfoType, Object); given HashMap() of 'type' is 'Value'; then return Info size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadata DefaultSurfaceMetadata.withInfo(SurfaceInfoType, Object)"
  })
  void testWithInfo_givenHashMapOfTypeIsValue_thenReturnInfoSizeIsTwo() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("type");
    info.put(ofResult, "Value");
    SurfaceName surfaceName = SurfaceName.of("type");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act
    DefaultSurfaceMetadata actualWithInfoResult = defaultSurfaceMetadata.withInfo(type, "Value");

    // Assert
    ValueType xValueType = actualWithInfoResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    SurfaceName surfaceName2 = actualWithInfoResult.getSurfaceName();
    assertEquals("type", surfaceName2.getName());
    assertEquals(2, actualWithInfoResult.getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualWithInfoResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(xValueType, actualWithInfoResult.getYValueType());
    assertSame(xValueType, actualWithInfoResult.getZValueType());
    assertSame(surfaceName, surfaceName2);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}.
   *
   * <ul>
   *   <li>Given {@link SurfaceName} with name is {@code type}.
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(SurfaceInfoType, Object); given SurfaceName with name is 'type'; then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadata DefaultSurfaceMetadata.withInfo(SurfaceInfoType, Object)"
  })
  void testWithInfo_givenSurfaceNameWithNameIsType_thenReturnInfoSizeIsOne() {
    // Arrange
    SurfaceName surfaceName = SurfaceName.of("type");
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act
    DefaultSurfaceMetadata actualWithInfoResult = defaultSurfaceMetadata.withInfo(type, "Value");

    // Assert
    ValueType xValueType = actualWithInfoResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    SurfaceName surfaceName2 = actualWithInfoResult.getSurfaceName();
    assertEquals("type", surfaceName2.getName());
    assertEquals(1, actualWithInfoResult.getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualWithInfoResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(xValueType, actualWithInfoResult.getYValueType());
    assertSame(xValueType, actualWithInfoResult.getZValueType());
    assertSame(surfaceName, surfaceName2);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}.
   *
   * <ul>
   *   <li>Given {@link SurfaceName} with {@code Name}.
   *   <li>Then return SurfaceName Name is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(SurfaceInfoType, Object); given SurfaceName with 'Name'; then return SurfaceName Name is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadata DefaultSurfaceMetadata.withInfo(SurfaceInfoType, Object)"
  })
  void testWithInfo_givenSurfaceNameWithName_thenReturnSurfaceNameNameIsName() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");
    DefaultSurfaceMetadata ofResult = DefaultSurfaceMetadata.of(name);
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act
    DefaultSurfaceMetadata actualWithInfoResult = ofResult.withInfo(type, "Value");

    // Assert
    SurfaceName surfaceName = actualWithInfoResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType xValueType = actualWithInfoResult.getXValueType();
    assertEquals("Unknown", xValueType.getName());
    assertEquals("Unknown", xValueType.toString());
    assertFalse(actualWithInfoResult.getParameterMetadata().isPresent());
    assertSame(xValueType, actualWithInfoResult.getYValueType());
    assertSame(xValueType, actualWithInfoResult.getZValueType());
    assertSame(name, surfaceName);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link DefaultSurfaceMetadata} with name is {@link SurfaceName}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withInfo(SurfaceInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(SurfaceInfoType, Object); when 'null'; then return DefaultSurfaceMetadata with name is SurfaceName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DefaultSurfaceMetadata DefaultSurfaceMetadata.withInfo(SurfaceInfoType, Object)"
  })
  void testWithInfo_whenNull_thenReturnDefaultSurfaceMetadataWithNameIsSurfaceName() {
    // Arrange
    DefaultSurfaceMetadata ofResult = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    SurfaceInfoType<Object> type = SurfaceInfoType.of("Name");

    // Act
    DefaultSurfaceMetadata actualWithInfoResult = ofResult.withInfo(type, null);

    // Assert
    assertEquals(ofResult, actualWithInfoResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return Info size is two.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); given HashMap() of 'Name' is 'Value'; then return Info size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultSurfaceMetadata DefaultSurfaceMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_givenHashMapOfNameIsValue_thenReturnInfoSizeIsTwo() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("Name");
    info.put(ofResult, "Value");
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("surfaceName");
    info.put(ofResult2, "Value");
    SurfaceName surfaceName = SurfaceName.of("surfaceName");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultSurfaceMetadata actualWithParameterMetadataResult =
        defaultSurfaceMetadata.withParameterMetadata(null);

    // Assert
    ValueType xValueType = actualWithParameterMetadataResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    SurfaceName surfaceName2 = actualWithParameterMetadataResult.getSurfaceName();
    assertEquals("surfaceName", surfaceName2.getName());
    assertEquals(2, actualWithParameterMetadataResult.getInfo().size());
    assertSame(xValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(xValueType, actualWithParameterMetadataResult.getZValueType());
    assertSame(surfaceName, surfaceName2);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultSurfaceMetadata} with name is {@link SurfaceName}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); then return DefaultSurfaceMetadata with name is SurfaceName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultSurfaceMetadata DefaultSurfaceMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_thenReturnDefaultSurfaceMetadataWithNameIsSurfaceName() {
    // Arrange
    DefaultSurfaceMetadata ofResult = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));

    // Act
    DefaultSurfaceMetadata actualWithParameterMetadataResult = ofResult.withParameterMetadata(null);

    // Assert
    assertSame(ofResult, actualWithParameterMetadataResult);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName("Test withParameterMetadata(List); then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultSurfaceMetadata DefaultSurfaceMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_thenReturnInfoEmpty() {
    // Arrange
    SurfaceName surfaceName = SurfaceName.of("surfaceName");
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultSurfaceMetadata actualWithParameterMetadataResult =
        defaultSurfaceMetadata.withParameterMetadata(null);

    // Assert
    ValueType xValueType = actualWithParameterMetadataResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    SurfaceName surfaceName2 = actualWithParameterMetadataResult.getSurfaceName();
    assertEquals("surfaceName", surfaceName2.getName());
    assertTrue(actualWithParameterMetadataResult.getInfo().isEmpty());
    assertSame(xValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(xValueType, actualWithParameterMetadataResult.getZValueType());
    assertSame(surfaceName, surfaceName2);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName("Test withParameterMetadata(List); then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultSurfaceMetadata DefaultSurfaceMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_thenReturnInfoSizeIsOne() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("surfaceName");
    info.put(ofResult, "Value");
    SurfaceName surfaceName = SurfaceName.of("surfaceName");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultSurfaceMetadata actualWithParameterMetadataResult =
        defaultSurfaceMetadata.withParameterMetadata(null);

    // Assert
    ValueType xValueType = actualWithParameterMetadataResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    SurfaceName surfaceName2 = actualWithParameterMetadataResult.getSurfaceName();
    assertEquals("surfaceName", surfaceName2.getName());
    assertEquals(1, actualWithParameterMetadataResult.getInfo().size());
    assertSame(xValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(xValueType, actualWithParameterMetadataResult.getZValueType());
    assertSame(surfaceName, surfaceName2);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Then return Info size is three.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName("Test withParameterMetadata(List); then return Info size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultSurfaceMetadata DefaultSurfaceMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_thenReturnInfoSizeIsThree() {
    // Arrange
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("DayCount");
    info.put(ofResult, "Value");
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("Name");
    info.put(ofResult2, "Value");
    SurfaceInfoType<?> ofResult3 = SurfaceInfoType.of("surfaceName");
    info.put(ofResult3, "Value");
    SurfaceName surfaceName = SurfaceName.of("surfaceName");

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultSurfaceMetadata actualWithParameterMetadataResult =
        defaultSurfaceMetadata.withParameterMetadata(null);

    // Assert
    ValueType xValueType = actualWithParameterMetadataResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    SurfaceName surfaceName2 = actualWithParameterMetadataResult.getSurfaceName();
    assertEquals("surfaceName", surfaceName2.getName());
    assertEquals(3, actualWithParameterMetadataResult.getInfo().size());
    assertSame(xValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(xValueType, actualWithParameterMetadataResult.getZValueType());
    assertSame(surfaceName, surfaceName2);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return ParameterMetadata Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); when ArrayList(); then return ParameterMetadata Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultSurfaceMetadata DefaultSurfaceMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_whenArrayList_thenReturnParameterMetadataEmpty() {
    // Arrange
    DefaultSurfaceMetadata ofResult = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));

    // Act and Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        ofResult.withParameterMetadata(new ArrayList<>()).getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#meta()}.
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DefaultSurfaceMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DefaultSurfaceMetadata.meta();

    // Assert
    assertTrue(actualMetaResult.info() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.surfaceName() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.zValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#DefaultSurfaceMetadata(SurfaceName, ValueType, ValueType,
   * ValueType, Map, List)}.
   *
   * <ul>
   *   <li>Given of {@code DayCount}.
   *   <li>When {@link HashMap#HashMap()} of {@code DayCount} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#DefaultSurfaceMetadata(SurfaceName,
   * ValueType, ValueType, ValueType, Map, List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultSurfaceMetadata(SurfaceName, ValueType, ValueType, ValueType, Map, List); given of 'DayCount'; when HashMap() of 'DayCount' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultSurfaceMetadata.<init>(SurfaceName, ValueType, ValueType, ValueType, Map, List)"
  })
  void testNewDefaultSurfaceMetadata_givenOfDayCount_whenHashMapOfDayCountIsValue() {
    // Arrange
    SurfaceName surfaceName = SurfaceName.of("Name");

    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("DayCount");
    info.put(ofResult, "Value");
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("Name");
    info.put(ofResult2, "Value");
    SurfaceInfoType<?> ofResult3 = SurfaceInfoType.of("surfaceName");
    info.put(ofResult3, "Value");

    // Act
    DefaultSurfaceMetadata actualDefaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDefaultSurfaceMetadata.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertEquals(info, actualDefaultSurfaceMetadata.getInfo());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#DefaultSurfaceMetadata(SurfaceName, ValueType, ValueType,
   * ValueType, Map, List)}.
   *
   * <ul>
   *   <li>Given of {@code Name}.
   *   <li>When {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#DefaultSurfaceMetadata(SurfaceName,
   * ValueType, ValueType, ValueType, Map, List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultSurfaceMetadata(SurfaceName, ValueType, ValueType, ValueType, Map, List); given of 'Name'; when HashMap() of 'Name' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultSurfaceMetadata.<init>(SurfaceName, ValueType, ValueType, ValueType, Map, List)"
  })
  void testNewDefaultSurfaceMetadata_givenOfName_whenHashMapOfNameIsValue() {
    // Arrange
    SurfaceName surfaceName = SurfaceName.of("Name");

    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("Name");
    info.put(ofResult, "Value");
    SurfaceInfoType<?> ofResult2 = SurfaceInfoType.of("surfaceName");
    info.put(ofResult2, "Value");

    // Act
    DefaultSurfaceMetadata actualDefaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDefaultSurfaceMetadata.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertEquals(info, actualDefaultSurfaceMetadata.getInfo());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#DefaultSurfaceMetadata(SurfaceName, ValueType, ValueType,
   * ValueType, Map, List)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>Then return ParameterMetadata Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#DefaultSurfaceMetadata(SurfaceName,
   * ValueType, ValueType, ValueType, Map, List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultSurfaceMetadata(SurfaceName, ValueType, ValueType, ValueType, Map, List); given 'Value'; then return ParameterMetadata Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultSurfaceMetadata.<init>(SurfaceName, ValueType, ValueType, ValueType, Map, List)"
  })
  void testNewDefaultSurfaceMetadata_givenValue_thenReturnParameterMetadataEmpty() {
    // Arrange
    SurfaceName surfaceName = SurfaceName.of("Name");

    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();
    SurfaceInfoType<?> ofResult = SurfaceInfoType.of("surfaceName");
    info.put(ofResult, "Value");

    // Act
    DefaultSurfaceMetadata actualDefaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDefaultSurfaceMetadata.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertEquals(info, actualDefaultSurfaceMetadata.getInfo());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#DefaultSurfaceMetadata(SurfaceName, ValueType, ValueType,
   * ValueType, Map, List)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ParameterMetadata Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#DefaultSurfaceMetadata(SurfaceName,
   * ValueType, ValueType, ValueType, Map, List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultSurfaceMetadata(SurfaceName, ValueType, ValueType, ValueType, Map, List); when HashMap(); then return ParameterMetadata Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultSurfaceMetadata.<init>(SurfaceName, ValueType, ValueType, ValueType, Map, List)"
  })
  void testNewDefaultSurfaceMetadata_whenHashMap_thenReturnParameterMetadataEmpty() {
    // Arrange
    SurfaceName surfaceName = SurfaceName.of("Name");
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();

    // Act
    DefaultSurfaceMetadata actualDefaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDefaultSurfaceMetadata.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertEquals(info, actualDefaultSurfaceMetadata.getInfo());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#metaBean()}.
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DefaultSurfaceMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, DefaultSurfaceMetadata.of(SurfaceName.of("Name")).metaBean());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#equals(Object)}, and {@link
   * DefaultSurfaceMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultSurfaceMetadata#equals(Object)}
   *   <li>{@link DefaultSurfaceMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSurfaceMetadata.equals(Object)",
    "int DefaultSurfaceMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultSurfaceMetadata ofResult = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    DefaultSurfaceMetadata ofResult2 = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#equals(Object)}, and {@link
   * DefaultSurfaceMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultSurfaceMetadata#equals(Object)}
   *   <li>{@link DefaultSurfaceMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSurfaceMetadata.equals(Object)",
    "int DefaultSurfaceMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultSurfaceMetadata ofResult = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultSurfaceMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSurfaceMetadata.equals(Object)",
    "int DefaultSurfaceMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SurfaceName surfaceName = SurfaceName.of("Name");
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();

    DefaultSurfaceMetadata defaultSurfaceMetadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    assertNotEquals(defaultSurfaceMetadata, DefaultSurfaceMetadata.of(SurfaceName.of("Name")));
  }

  /**
   * Test {@link DefaultSurfaceMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSurfaceMetadata.equals(Object)",
    "int DefaultSurfaceMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    DefaultSurfaceMetadata ofResult = DefaultSurfaceMetadata.of(SurfaceName.of("name"));

    // Act and Assert
    assertNotEquals(ofResult, DefaultSurfaceMetadata.of(SurfaceName.of("Name")));
  }

  /**
   * Test {@link DefaultSurfaceMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSurfaceMetadata.equals(Object)",
    "int DefaultSurfaceMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), null);
  }

  /**
   * Test {@link DefaultSurfaceMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultSurfaceMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultSurfaceMetadata.equals(Object)",
    "int DefaultSurfaceMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        DefaultSurfaceMetadata.of(SurfaceName.of("Name")),
        "Different type to DefaultSurfaceMetadata");
  }
}
