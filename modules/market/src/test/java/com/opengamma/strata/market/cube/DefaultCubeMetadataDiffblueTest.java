package com.opengamma.strata.market.cube;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.cube.DefaultCubeMetadata.Meta;
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

class DefaultCubeMetadataDiffblueTest {
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
    Class<? extends DefaultCubeMetadata> actualBeanTypeResult =
        DefaultCubeMetadata.meta().beanType();

    // Assert
    Class<DefaultCubeMetadata> expectedBeanTypeResult = DefaultCubeMetadata.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#cubeName()}
   *   <li>{@link Meta#info()}
   *   <li>{@link Meta#parameterMetadata()}
   *   <li>{@link Meta#wValueType()}
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
    "MetaProperty Meta.cubeName()",
    "MetaProperty Meta.info()",
    "MetaProperty Meta.parameterMetadata()",
    "MetaProperty Meta.wValueType()",
    "MetaProperty Meta.xValueType()",
    "MetaProperty Meta.yValueType()",
    "MetaProperty Meta.zValueType()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = DefaultCubeMetadata.meta();

    // Act
    MetaProperty<CubeName> actualCubeNameResult = metaResult.cubeName();
    MetaProperty<ImmutableMap<CubeInfoType<?>, Object>> actualInfoResult = metaResult.info();
    MetaProperty<List<ParameterMetadata>> actualParameterMetadataResult =
        metaResult.parameterMetadata();
    MetaProperty<ValueType> actualWValueTypeResult = metaResult.wValueType();
    MetaProperty<ValueType> actualXValueTypeResult = metaResult.xValueType();
    MetaProperty<ValueType> actualYValueTypeResult = metaResult.yValueType();

    // Assert
    assertTrue(actualCubeNameResult instanceof DirectMetaProperty);
    assertTrue(actualInfoResult instanceof DirectMetaProperty);
    assertTrue(actualParameterMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualWValueTypeResult instanceof DirectMetaProperty);
    assertTrue(actualXValueTypeResult instanceof DirectMetaProperty);
    assertTrue(actualYValueTypeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.zValueType() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code cubeName}.
   *   <li>Then return name is {@code cubeName}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'cubeName'; then return name is 'cubeName'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCubeName_thenReturnNameIsCubeName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DefaultCubeMetadata.meta().metaPropertyGet("cubeName");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).wValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zValueType() instanceof DirectMetaProperty);
    assertEquals("cubeName", actualMetaPropertyGetResult.name());
    Class<CubeName> expectedPropertyTypeResult = CubeName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).cubeName());
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
        DefaultCubeMetadata.meta().metaPropertyGet("info");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cubeName() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).wValueType() instanceof DirectMetaProperty);
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
        DefaultCubeMetadata.meta().metaPropertyGet("parameterMetadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cubeName() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).wValueType() instanceof DirectMetaProperty);
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
    assertNull(DefaultCubeMetadata.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code wValueType}.
   *   <li>Then return name is {@code wValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'wValueType'; then return name is 'wValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenWValueType_thenReturnNameIsWValueType() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DefaultCubeMetadata.meta().metaPropertyGet("wValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cubeName() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zValueType() instanceof DirectMetaProperty);
    assertEquals("wValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).wValueType());
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
        DefaultCubeMetadata.meta().metaPropertyGet("xValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cubeName() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).wValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zValueType() instanceof DirectMetaProperty);
    assertEquals("xValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValueType());
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
        DefaultCubeMetadata.meta().metaPropertyGet("yValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cubeName() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).wValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zValueType() instanceof DirectMetaProperty);
    assertEquals("yValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValueType());
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
        DefaultCubeMetadata.meta().metaPropertyGet("zValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).cubeName() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).info() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).wValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("zValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zValueType());
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
        DefaultCubeMetadata.meta().metaPropertyMap();

    // Assert
    assertEquals(7, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("cubeName") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("info") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("parameterMetadata") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("wValueType") instanceof DirectMetaProperty);
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
    assertNull(DefaultCubeMetadata.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code cubeName}.
   *   <li>Then return {@link CubeName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'cubeName'; then return CubeName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenCubeName_thenReturnCubeNameWithName() {
    // Arrange
    Meta metaResult = DefaultCubeMetadata.meta();
    CubeName name = CubeName.of("Name");

    // Act and Assert
    assertSame(name, metaResult.propertyGet(DefaultCubeMetadata.of(name), "cubeName", true));
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
    Meta metaResult = DefaultCubeMetadata.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                DefaultCubeMetadata.of(CubeName.of("Name")), "Property Name", false));
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
    Meta metaResult = DefaultCubeMetadata.meta();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(DefaultCubeMetadata.of(CubeName.of("Name")), "info", true);

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
    Meta metaResult = DefaultCubeMetadata.meta();

    // Act and Assert
    assertNull(
        metaResult.propertyGet(
            DefaultCubeMetadata.of(CubeName.of("Name")), "parameterMetadata", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code wValueType}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'wValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenWValueType() {
    // Arrange
    Meta metaResult = DefaultCubeMetadata.meta();
    DefaultCubeMetadata bean = DefaultCubeMetadata.of(CubeName.of("Name"));

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "wValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).UNKNOWN;
    assertSame(valueType, bean.getWValueType());
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
    assertSame(valueType, bean.getZValueType());
    assertSame(valueType, actualPropertyGetResult);
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
    Meta metaResult = DefaultCubeMetadata.meta();
    DefaultCubeMetadata bean = DefaultCubeMetadata.of(CubeName.of("Name"));

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "xValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).UNKNOWN;
    assertSame(valueType, bean.getWValueType());
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
    Meta metaResult = DefaultCubeMetadata.meta();
    DefaultCubeMetadata bean = DefaultCubeMetadata.of(CubeName.of("Name"));

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "yValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).UNKNOWN;
    assertSame(valueType, bean.getWValueType());
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
    Meta metaResult = DefaultCubeMetadata.meta();
    DefaultCubeMetadata bean = DefaultCubeMetadata.of(CubeName.of("Name"));

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "zValueType", true);

    // Assert
    ValueType valueType = ((ValueType) actualPropertyGetResult).UNKNOWN;
    assertSame(valueType, bean.getWValueType());
    assertSame(valueType, bean.getXValueType());
    assertSame(valueType, bean.getYValueType());
    assertSame(valueType, bean.getZValueType());
    assertSame(valueType, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code cubeName}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'cubeName'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCubeName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DefaultCubeMetadata.meta()
                .propertySet(mock(Bean.class), "cubeName", "New Value", true));
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
            DefaultCubeMetadata.meta()
                .propertySet(mock(Bean.class), "cubeName", "New Value", false));
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
        () -> DefaultCubeMetadata.meta().propertySet(mock(Bean.class), "info", "New Value", true));
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
            DefaultCubeMetadata.meta()
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
            DefaultCubeMetadata.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code wValueType}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'wValueType'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenWValueType_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DefaultCubeMetadata.meta()
                .propertySet(mock(Bean.class), "wValueType", "New Value", true));
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
            DefaultCubeMetadata.meta()
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
            DefaultCubeMetadata.meta()
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
            DefaultCubeMetadata.meta()
                .propertySet(mock(Bean.class), "zValueType", "New Value", true));
  }

  /**
   * Test {@link DefaultCubeMetadata#of(CubeName)} with {@code CubeName}.
   *
   * <ul>
   *   <li>When {@link CubeName} with {@code Name}.
   *   <li>Then return WValueType Name is {@code Unknown}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#of(CubeName)}
   */
  @Test
  @DisplayName(
      "Test of(CubeName) with 'CubeName'; when CubeName with 'Name'; then return WValueType Name is 'Unknown'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.of(CubeName)"})
  void testOfWithCubeName_whenCubeNameWithName_thenReturnWValueTypeNameIsUnknown() {
    // Arrange
    CubeName name = CubeName.of("Name");

    // Act
    DefaultCubeMetadata actualOfResult = DefaultCubeMetadata.of(name);

    // Assert
    ValueType wValueType = actualOfResult.getWValueType();
    assertEquals("Unknown", wValueType.getName());
    assertEquals("Unknown", wValueType.toString());
    assertFalse(actualOfResult.getParameterMetadata().isPresent());
    assertTrue(actualOfResult.getInfo().isEmpty());
    assertSame(wValueType, actualOfResult.getXValueType());
    assertSame(wValueType, actualOfResult.getYValueType());
    assertSame(wValueType, actualOfResult.getZValueType());
    assertSame(name, actualOfResult.getCubeName());
  }

  /**
   * Test {@link DefaultCubeMetadata#of(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return CubeName Name is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#of(String)}
   */
  @Test
  @DisplayName("Test of(String) with 'String'; when 'Name'; then return CubeName Name is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.of(String)"})
  void testOfWithString_whenName_thenReturnCubeNameNameIsName() {
    // Arrange and Act
    DefaultCubeMetadata actualOfResult = DefaultCubeMetadata.of("Name");

    // Assert
    CubeName cubeName = actualOfResult.getCubeName();
    assertEquals("Name", cubeName.getName());
    ValueType wValueType = actualOfResult.getWValueType();
    assertEquals("Unknown", wValueType.getName());
    assertEquals("Unknown", wValueType.toString());
    assertFalse(actualOfResult.getParameterMetadata().isPresent());
    assertTrue(actualOfResult.getInfo().isEmpty());
    Class<Cube> expectedMarketDataType = Cube.class;
    assertEquals(expectedMarketDataType, cubeName.getMarketDataType());
    assertSame(wValueType, actualOfResult.getXValueType());
    assertSame(wValueType, actualOfResult.getYValueType());
    assertSame(wValueType, actualOfResult.getZValueType());
  }

  /**
   * Test {@link DefaultCubeMetadata#getInfo(CubeInfoType)} with {@code CubeInfoType}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#getInfo(CubeInfoType)}
   */
  @Test
  @DisplayName("Test getInfo(CubeInfoType) with 'CubeInfoType'; given CubeName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultCubeMetadata.getInfo(CubeInfoType)"})
  void testGetInfoWithCubeInfoType_givenCubeNameWithName() {
    // Arrange
    DefaultCubeMetadata ofResult = DefaultCubeMetadata.of(CubeName.of("Name"));
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.getInfo(type));
  }

  /**
   * Test {@link DefaultCubeMetadata#getInfo(CubeInfoType)} with {@code CubeInfoType}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#getInfo(CubeInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(CubeInfoType) with 'CubeInfoType'; given CubeName with 'Name'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultCubeMetadata.getInfo(CubeInfoType)"})
  void testGetInfoWithCubeInfoType_givenCubeNameWithName_whenNull() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> DefaultCubeMetadata.of(CubeName.of("Name")).getInfo(null));
  }

  /**
   * Test {@link DefaultCubeMetadata#getInfo(CubeInfoType)} with {@code CubeInfoType}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code 42} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#getInfo(CubeInfoType)}
   */
  @Test
  @DisplayName("Test getInfo(CubeInfoType) with 'CubeInfoType'; given HashMap() of '42' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultCubeMetadata.getInfo(CubeInfoType)"})
  void testGetInfoWithCubeInfoType_givenHashMapOf42IsValue() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("DayCount");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("42");
    info.put(ofResult2, "Value");
    CubeName cubeName = CubeName.of("Cube info not found for type '{}'");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> defaultCubeMetadata.getInfo(type));
  }

  /**
   * Test {@link DefaultCubeMetadata#getInfo(CubeInfoType)} with {@code CubeInfoType}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code DayCount} is {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#getInfo(CubeInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(CubeInfoType) with 'CubeInfoType'; given HashMap() of 'DayCount' is 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultCubeMetadata.getInfo(CubeInfoType)"})
  void testGetInfoWithCubeInfoType_givenHashMapOfDayCountIsValue_thenReturnValue() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("DayCount");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("Name");
    info.put(ofResult2, "Value");
    CubeName cubeName = CubeName.of("Cube info not found for type '{}'");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act and Assert
    assertEquals("Value", defaultCubeMetadata.getInfo(type));
  }

  /**
   * Test {@link DefaultCubeMetadata#getInfo(CubeInfoType)} with {@code CubeInfoType}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code MoneynessType} is {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#getInfo(CubeInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(CubeInfoType) with 'CubeInfoType'; given HashMap() of 'MoneynessType' is 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultCubeMetadata.getInfo(CubeInfoType)"})
  void testGetInfoWithCubeInfoType_givenHashMapOfMoneynessTypeIsValue_thenReturnValue() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("MoneynessType");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("Name");
    info.put(ofResult2, "Value");
    CubeName cubeName = CubeName.of("Cube info not found for type '{}'");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act and Assert
    assertEquals("Value", defaultCubeMetadata.getInfo(type));
  }

  /**
   * Test {@link DefaultCubeMetadata#getInfo(CubeInfoType)} with {@code CubeInfoType}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#getInfo(CubeInfoType)}
   */
  @Test
  @DisplayName(
      "Test getInfo(CubeInfoType) with 'CubeInfoType'; given HashMap() of 'Name' is 'Value'; then return 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object DefaultCubeMetadata.getInfo(CubeInfoType)"})
  void testGetInfoWithCubeInfoType_givenHashMapOfNameIsValue_thenReturnValue() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("Name");
    info.put(ofResult, "Value");
    CubeName cubeName = CubeName.of("Cube info not found for type '{}'");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act and Assert
    assertEquals("Value", defaultCubeMetadata.getInfo(type));
  }

  /**
   * Test {@link DefaultCubeMetadata#getParameterMetadata()}.
   *
   * <p>Method under test: {@link DefaultCubeMetadata#getParameterMetadata()}
   */
  @Test
  @DisplayName("Test getParameterMetadata()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCubeMetadata.getParameterMetadata()"})
  void testGetParameterMetadata() {
    // Arrange, Act and Assert
    assertFalse(DefaultCubeMetadata.of(CubeName.of("Name")).getParameterMetadata().isPresent());
  }

  /**
   * Test {@link DefaultCubeMetadata#findInfo(CubeInfoType)}.
   *
   * <ul>
   *   <li>Given {@link DefaultCubeMetadata} with name is {@link CubeName}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#findInfo(CubeInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(CubeInfoType); given DefaultCubeMetadata with name is CubeName; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCubeMetadata.findInfo(CubeInfoType)"})
  void testFindInfo_givenDefaultCubeMetadataWithNameIsCubeName_thenReturnNotPresent() {
    // Arrange
    DefaultCubeMetadata ofResult = DefaultCubeMetadata.of(CubeName.of("Name"));
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act and Assert
    assertFalse(ofResult.findInfo(type).isPresent());
  }

  /**
   * Test {@link DefaultCubeMetadata#findInfo(CubeInfoType)}.
   *
   * <ul>
   *   <li>Given {@link DefaultCubeMetadata} with name is {@link CubeName}.
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#findInfo(CubeInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(CubeInfoType); given DefaultCubeMetadata with name is CubeName; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCubeMetadata.findInfo(CubeInfoType)"})
  void testFindInfo_givenDefaultCubeMetadataWithNameIsCubeName_whenNull() {
    // Arrange, Act and Assert
    assertFalse(DefaultCubeMetadata.of(CubeName.of("Name")).findInfo(null).isPresent());
  }

  /**
   * Test {@link DefaultCubeMetadata#findInfo(CubeInfoType)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code 42} is {@code Value}.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#findInfo(CubeInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(CubeInfoType); given HashMap() of '42' is 'Value'; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCubeMetadata.findInfo(CubeInfoType)"})
  void testFindInfo_givenHashMapOf42IsValue_thenReturnNotPresent() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("DayCount");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("42");
    info.put(ofResult2, "Value");
    CubeName cubeName = CubeName.of("Name");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    Optional<Object> actualFindInfoResult = defaultCubeMetadata.findInfo(type);

    // Assert
    assertFalse(actualFindInfoResult.isPresent());
  }

  /**
   * Test {@link DefaultCubeMetadata#findInfo(CubeInfoType)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code DayCount} is {@code Value}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#findInfo(CubeInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(CubeInfoType); given HashMap() of 'DayCount' is 'Value'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCubeMetadata.findInfo(CubeInfoType)"})
  void testFindInfo_givenHashMapOfDayCountIsValue_thenReturnGetIsValue() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("DayCount");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("Name");
    info.put(ofResult2, "Value");
    CubeName cubeName = CubeName.of("Name");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    Optional<Object> actualFindInfoResult = defaultCubeMetadata.findInfo(type);

    // Assert
    assertEquals("Value", actualFindInfoResult.get());
    assertTrue(actualFindInfoResult.isPresent());
  }

  /**
   * Test {@link DefaultCubeMetadata#findInfo(CubeInfoType)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code MoneynessType} is {@code Value}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#findInfo(CubeInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(CubeInfoType); given HashMap() of 'MoneynessType' is 'Value'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCubeMetadata.findInfo(CubeInfoType)"})
  void testFindInfo_givenHashMapOfMoneynessTypeIsValue_thenReturnGetIsValue() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("MoneynessType");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("Name");
    info.put(ofResult2, "Value");
    CubeName cubeName = CubeName.of("Name");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    Optional<Object> actualFindInfoResult = defaultCubeMetadata.findInfo(type);

    // Assert
    assertEquals("Value", actualFindInfoResult.get());
    assertTrue(actualFindInfoResult.isPresent());
  }

  /**
   * Test {@link DefaultCubeMetadata#findInfo(CubeInfoType)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return {@link Optional#get()} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#findInfo(CubeInfoType)}
   */
  @Test
  @DisplayName(
      "Test findInfo(CubeInfoType); given HashMap() of 'Name' is 'Value'; then return get() is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional DefaultCubeMetadata.findInfo(CubeInfoType)"})
  void testFindInfo_givenHashMapOfNameIsValue_thenReturnGetIsValue() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("Name");
    info.put(ofResult, "Value");
    CubeName cubeName = CubeName.of("Name");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    Optional<Object> actualFindInfoResult = defaultCubeMetadata.findInfo(type);

    // Assert
    assertEquals("Value", actualFindInfoResult.get());
    assertTrue(actualFindInfoResult.isPresent());
  }

  /**
   * Test {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}.
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}
   */
  @Test
  @DisplayName("Test withInfo(CubeInfoType, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withInfo(CubeInfoType, Object)"})
  void testWithInfo() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("Name");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("type");
    info.put(ofResult2, "Value");
    CubeName cubeName = CubeName.of("type");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    DefaultCubeMetadata actualWithInfoResult = defaultCubeMetadata.withInfo(type, "Value");

    // Assert
    assertEquals(defaultCubeMetadata, actualWithInfoResult);
  }

  /**
   * Test {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with name is {@code type}.
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(CubeInfoType, Object); given CubeName with name is 'type'; then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withInfo(CubeInfoType, Object)"})
  void testWithInfo_givenCubeNameWithNameIsType_thenReturnInfoSizeIsOne() {
    // Arrange
    CubeName cubeName = CubeName.of("type");
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    DefaultCubeMetadata actualWithInfoResult = defaultCubeMetadata.withInfo(type, "Value");

    // Assert
    ValueType wValueType = actualWithInfoResult.getWValueType();
    assertEquals("BlackVolatility", wValueType.getName());
    assertEquals("BlackVolatility", wValueType.toString());
    CubeName cubeName2 = actualWithInfoResult.getCubeName();
    assertEquals("type", cubeName2.getName());
    assertEquals(1, actualWithInfoResult.getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualWithInfoResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(wValueType, actualWithInfoResult.getXValueType());
    assertSame(wValueType, actualWithInfoResult.getYValueType());
    assertSame(wValueType, actualWithInfoResult.getZValueType());
    assertSame(cubeName, cubeName2);
  }

  /**
   * Test {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with {@code Name}.
   *   <li>Then return CubeName Name is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(CubeInfoType, Object); given CubeName with 'Name'; then return CubeName Name is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withInfo(CubeInfoType, Object)"})
  void testWithInfo_givenCubeNameWithName_thenReturnCubeNameNameIsName() {
    // Arrange
    CubeName name = CubeName.of("Name");
    DefaultCubeMetadata ofResult = DefaultCubeMetadata.of(name);
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    DefaultCubeMetadata actualWithInfoResult = ofResult.withInfo(type, "Value");

    // Assert
    CubeName cubeName = actualWithInfoResult.getCubeName();
    assertEquals("Name", cubeName.getName());
    ValueType wValueType = actualWithInfoResult.getWValueType();
    assertEquals("Unknown", wValueType.getName());
    assertEquals("Unknown", wValueType.toString());
    assertFalse(actualWithInfoResult.getParameterMetadata().isPresent());
    assertSame(wValueType, actualWithInfoResult.getXValueType());
    assertSame(wValueType, actualWithInfoResult.getYValueType());
    assertSame(wValueType, actualWithInfoResult.getZValueType());
    assertSame(name, cubeName);
  }

  /**
   * Test {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code type} is {@code Value}.
   *   <li>Then return Info size is two.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(CubeInfoType, Object); given HashMap() of 'type' is 'Value'; then return Info size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withInfo(CubeInfoType, Object)"})
  void testWithInfo_givenHashMapOfTypeIsValue_thenReturnInfoSizeIsTwo() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("type");
    info.put(ofResult, "Value");
    CubeName cubeName = CubeName.of("type");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    DefaultCubeMetadata actualWithInfoResult = defaultCubeMetadata.withInfo(type, "Value");

    // Assert
    ValueType wValueType = actualWithInfoResult.getWValueType();
    assertEquals("BlackVolatility", wValueType.getName());
    assertEquals("BlackVolatility", wValueType.toString());
    CubeName cubeName2 = actualWithInfoResult.getCubeName();
    assertEquals("type", cubeName2.getName());
    assertEquals(2, actualWithInfoResult.getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualWithInfoResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(wValueType, actualWithInfoResult.getXValueType());
    assertSame(wValueType, actualWithInfoResult.getYValueType());
    assertSame(wValueType, actualWithInfoResult.getZValueType());
    assertSame(cubeName, cubeName2);
  }

  /**
   * Test {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code xValueType} is {@code Value}.
   *   <li>Then return Info size is two.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(CubeInfoType, Object); given HashMap() of 'xValueType' is 'Value'; then return Info size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withInfo(CubeInfoType, Object)"})
  void testWithInfo_givenHashMapOfXValueTypeIsValue_thenReturnInfoSizeIsTwo() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("xValueType");
    info.put(ofResult, "Value");
    CubeName cubeName = CubeName.of("type");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    DefaultCubeMetadata actualWithInfoResult = defaultCubeMetadata.withInfo(type, "Value");

    // Assert
    ValueType wValueType = actualWithInfoResult.getWValueType();
    assertEquals("BlackVolatility", wValueType.getName());
    assertEquals("BlackVolatility", wValueType.toString());
    CubeName cubeName2 = actualWithInfoResult.getCubeName();
    assertEquals("type", cubeName2.getName());
    assertEquals(2, actualWithInfoResult.getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualWithInfoResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(wValueType, actualWithInfoResult.getXValueType());
    assertSame(wValueType, actualWithInfoResult.getYValueType());
    assertSame(wValueType, actualWithInfoResult.getZValueType());
    assertSame(cubeName, cubeName2);
  }

  /**
   * Test {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return {@link DefaultCubeMetadata} with name is {@link CubeName}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withInfo(CubeInfoType, Object)}
   */
  @Test
  @DisplayName(
      "Test withInfo(CubeInfoType, Object); when 'null'; then return DefaultCubeMetadata with name is CubeName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withInfo(CubeInfoType, Object)"})
  void testWithInfo_whenNull_thenReturnDefaultCubeMetadataWithNameIsCubeName() {
    // Arrange
    DefaultCubeMetadata ofResult = DefaultCubeMetadata.of(CubeName.of("Name"));
    CubeInfoType<Object> type = CubeInfoType.of("Name");

    // Act
    DefaultCubeMetadata actualWithInfoResult = ofResult.withInfo(type, null);

    // Assert
    assertEquals(ofResult, actualWithInfoResult);
  }

  /**
   * Test {@link DefaultCubeMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Given {@link CubeName} with name is {@code cubeName}.
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); given CubeName with name is 'cubeName'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_givenCubeNameWithNameIsCubeName_thenReturnInfoEmpty() {
    // Arrange
    CubeName cubeName = CubeName.of("cubeName");
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultCubeMetadata actualWithParameterMetadataResult =
        defaultCubeMetadata.withParameterMetadata(null);

    // Assert
    ValueType wValueType = actualWithParameterMetadataResult.getWValueType();
    assertEquals("BlackVolatility", wValueType.getName());
    assertEquals("BlackVolatility", wValueType.toString());
    CubeName cubeName2 = actualWithParameterMetadataResult.getCubeName();
    assertEquals("cubeName", cubeName2.getName());
    assertTrue(actualWithParameterMetadataResult.getInfo().isEmpty());
    assertSame(wValueType, actualWithParameterMetadataResult.getXValueType());
    assertSame(wValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(wValueType, actualWithParameterMetadataResult.getZValueType());
    assertSame(cubeName, cubeName2);
  }

  /**
   * Test {@link DefaultCubeMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code cubeName} is {@code Value}.
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); given HashMap() of 'cubeName' is 'Value'; then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_givenHashMapOfCubeNameIsValue_thenReturnInfoSizeIsOne() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("cubeName");
    info.put(ofResult, "Value");
    CubeName cubeName = CubeName.of("cubeName");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultCubeMetadata actualWithParameterMetadataResult =
        defaultCubeMetadata.withParameterMetadata(null);

    // Assert
    ValueType wValueType = actualWithParameterMetadataResult.getWValueType();
    assertEquals("BlackVolatility", wValueType.getName());
    assertEquals("BlackVolatility", wValueType.toString());
    CubeName cubeName2 = actualWithParameterMetadataResult.getCubeName();
    assertEquals("cubeName", cubeName2.getName());
    assertEquals(1, actualWithParameterMetadataResult.getInfo().size());
    assertSame(wValueType, actualWithParameterMetadataResult.getXValueType());
    assertSame(wValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(wValueType, actualWithParameterMetadataResult.getZValueType());
    assertSame(cubeName, cubeName2);
  }

  /**
   * Test {@link DefaultCubeMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code DayCount} is {@code Value}.
   *   <li>Then return Info size is two.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); given HashMap() of 'DayCount' is 'Value'; then return Info size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_givenHashMapOfDayCountIsValue_thenReturnInfoSizeIsTwo() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("DayCount");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("cubeName");
    info.put(ofResult2, "Value");
    CubeName cubeName = CubeName.of("cubeName");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultCubeMetadata actualWithParameterMetadataResult =
        defaultCubeMetadata.withParameterMetadata(null);

    // Assert
    ValueType wValueType = actualWithParameterMetadataResult.getWValueType();
    assertEquals("BlackVolatility", wValueType.getName());
    assertEquals("BlackVolatility", wValueType.toString());
    CubeName cubeName2 = actualWithParameterMetadataResult.getCubeName();
    assertEquals("cubeName", cubeName2.getName());
    assertEquals(2, actualWithParameterMetadataResult.getInfo().size());
    assertSame(wValueType, actualWithParameterMetadataResult.getXValueType());
    assertSame(wValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(wValueType, actualWithParameterMetadataResult.getZValueType());
    assertSame(cubeName, cubeName2);
  }

  /**
   * Test {@link DefaultCubeMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   *   <li>Then return Info size is two.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); given HashMap() of 'Name' is 'Value'; then return Info size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_givenHashMapOfNameIsValue_thenReturnInfoSizeIsTwo() {
    // Arrange
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("Name");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("cubeName");
    info.put(ofResult2, "Value");
    CubeName cubeName = CubeName.of("cubeName");

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act
    DefaultCubeMetadata actualWithParameterMetadataResult =
        defaultCubeMetadata.withParameterMetadata(null);

    // Assert
    ValueType wValueType = actualWithParameterMetadataResult.getWValueType();
    assertEquals("BlackVolatility", wValueType.getName());
    assertEquals("BlackVolatility", wValueType.toString());
    CubeName cubeName2 = actualWithParameterMetadataResult.getCubeName();
    assertEquals("cubeName", cubeName2.getName());
    assertEquals(2, actualWithParameterMetadataResult.getInfo().size());
    assertSame(wValueType, actualWithParameterMetadataResult.getXValueType());
    assertSame(wValueType, actualWithParameterMetadataResult.getYValueType());
    assertSame(wValueType, actualWithParameterMetadataResult.getZValueType());
    assertSame(cubeName, cubeName2);
  }

  /**
   * Test {@link DefaultCubeMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCubeMetadata} with name is {@link CubeName}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); then return DefaultCubeMetadata with name is CubeName")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_thenReturnDefaultCubeMetadataWithNameIsCubeName() {
    // Arrange
    DefaultCubeMetadata ofResult = DefaultCubeMetadata.of(CubeName.of("Name"));

    // Act
    DefaultCubeMetadata actualWithParameterMetadataResult = ofResult.withParameterMetadata(null);

    // Assert
    assertSame(ofResult, actualWithParameterMetadataResult);
  }

  /**
   * Test {@link DefaultCubeMetadata#withParameterMetadata(List)}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return ParameterMetadata Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#withParameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test withParameterMetadata(List); when ArrayList(); then return ParameterMetadata Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DefaultCubeMetadata DefaultCubeMetadata.withParameterMetadata(List)"})
  void testWithParameterMetadata_whenArrayList_thenReturnParameterMetadataEmpty() {
    // Arrange
    DefaultCubeMetadata ofResult = DefaultCubeMetadata.of(CubeName.of("Name"));

    // Act and Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        ofResult.withParameterMetadata(new ArrayList<>()).getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
  }

  /**
   * Test {@link DefaultCubeMetadata#meta()}.
   *
   * <p>Method under test: {@link DefaultCubeMetadata#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DefaultCubeMetadata.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DefaultCubeMetadata.meta();

    // Assert
    assertTrue(actualMetaResult.cubeName() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.info() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.wValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.zValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link DefaultCubeMetadata#DefaultCubeMetadata(CubeName, ValueType, ValueType, ValueType,
   * ValueType, Map, List)}.
   *
   * <ul>
   *   <li>Given of {@code DayCount}.
   *   <li>When {@link HashMap#HashMap()} of {@code DayCount} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#DefaultCubeMetadata(CubeName, ValueType,
   * ValueType, ValueType, ValueType, Map, List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultCubeMetadata(CubeName, ValueType, ValueType, ValueType, ValueType, Map, List); given of 'DayCount'; when HashMap() of 'DayCount' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCubeMetadata.<init>(CubeName, ValueType, ValueType, ValueType, ValueType, Map, List)"
  })
  void testNewDefaultCubeMetadata_givenOfDayCount_whenHashMapOfDayCountIsValue() {
    // Arrange
    CubeName cubeName = CubeName.of("Name");

    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("DayCount");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("cubeName");
    info.put(ofResult2, "Value");

    // Act
    DefaultCubeMetadata actualDefaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDefaultCubeMetadata.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertEquals(info, actualDefaultCubeMetadata.getInfo());
  }

  /**
   * Test {@link DefaultCubeMetadata#DefaultCubeMetadata(CubeName, ValueType, ValueType, ValueType,
   * ValueType, Map, List)}.
   *
   * <ul>
   *   <li>Given of {@code Name}.
   *   <li>When {@link HashMap#HashMap()} of {@code Name} is {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#DefaultCubeMetadata(CubeName, ValueType,
   * ValueType, ValueType, ValueType, Map, List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultCubeMetadata(CubeName, ValueType, ValueType, ValueType, ValueType, Map, List); given of 'Name'; when HashMap() of 'Name' is 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCubeMetadata.<init>(CubeName, ValueType, ValueType, ValueType, ValueType, Map, List)"
  })
  void testNewDefaultCubeMetadata_givenOfName_whenHashMapOfNameIsValue() {
    // Arrange
    CubeName cubeName = CubeName.of("Name");

    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("Name");
    info.put(ofResult, "Value");
    CubeInfoType<?> ofResult2 = CubeInfoType.of("cubeName");
    info.put(ofResult2, "Value");

    // Act
    DefaultCubeMetadata actualDefaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDefaultCubeMetadata.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertEquals(info, actualDefaultCubeMetadata.getInfo());
  }

  /**
   * Test {@link DefaultCubeMetadata#DefaultCubeMetadata(CubeName, ValueType, ValueType, ValueType,
   * ValueType, Map, List)}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   *   <li>Then return ParameterMetadata Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#DefaultCubeMetadata(CubeName, ValueType,
   * ValueType, ValueType, ValueType, Map, List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultCubeMetadata(CubeName, ValueType, ValueType, ValueType, ValueType, Map, List); given 'Value'; then return ParameterMetadata Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCubeMetadata.<init>(CubeName, ValueType, ValueType, ValueType, ValueType, Map, List)"
  })
  void testNewDefaultCubeMetadata_givenValue_thenReturnParameterMetadataEmpty() {
    // Arrange
    CubeName cubeName = CubeName.of("Name");

    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();
    CubeInfoType<?> ofResult = CubeInfoType.of("cubeName");
    info.put(ofResult, "Value");

    // Act
    DefaultCubeMetadata actualDefaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDefaultCubeMetadata.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertEquals(info, actualDefaultCubeMetadata.getInfo());
  }

  /**
   * Test {@link DefaultCubeMetadata#DefaultCubeMetadata(CubeName, ValueType, ValueType, ValueType,
   * ValueType, Map, List)}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return ParameterMetadata Empty.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#DefaultCubeMetadata(CubeName, ValueType,
   * ValueType, ValueType, ValueType, Map, List)}
   */
  @Test
  @DisplayName(
      "Test new DefaultCubeMetadata(CubeName, ValueType, ValueType, ValueType, ValueType, Map, List); when HashMap(); then return ParameterMetadata Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCubeMetadata.<init>(CubeName, ValueType, ValueType, ValueType, ValueType, Map, List)"
  })
  void testNewDefaultCubeMetadata_whenHashMap_thenReturnParameterMetadataEmpty() {
    // Arrange
    CubeName cubeName = CubeName.of("Name");
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();

    // Act
    DefaultCubeMetadata actualDefaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Assert
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDefaultCubeMetadata.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertEquals(info, actualDefaultCubeMetadata.getInfo());
  }

  /**
   * Test {@link DefaultCubeMetadata#metaBean()}.
   *
   * <p>Method under test: {@link DefaultCubeMetadata#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DefaultCubeMetadata.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(Meta.INSTANCE, DefaultCubeMetadata.of(CubeName.of("Name")).metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCubeMetadata#toString()}
   *   <li>{@link DefaultCubeMetadata#getCubeName()}
   *   <li>{@link DefaultCubeMetadata#getInfo()}
   *   <li>{@link DefaultCubeMetadata#getWValueType()}
   *   <li>{@link DefaultCubeMetadata#getXValueType()}
   *   <li>{@link DefaultCubeMetadata#getYValueType()}
   *   <li>{@link DefaultCubeMetadata#getZValueType()}
   *   <li>{@link DefaultCubeMetadata#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CubeName DefaultCubeMetadata.getCubeName()",
    "ImmutableMap DefaultCubeMetadata.getInfo()",
    "ValueType DefaultCubeMetadata.getWValueType()",
    "ValueType DefaultCubeMetadata.getXValueType()",
    "ValueType DefaultCubeMetadata.getYValueType()",
    "ValueType DefaultCubeMetadata.getZValueType()",
    "DefaultCubeMetadataBuilder DefaultCubeMetadata.toBuilder()",
    "String DefaultCubeMetadata.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CubeName name = CubeName.of("Name");
    DefaultCubeMetadata ofResult = DefaultCubeMetadata.of(name);

    // Act
    String actualToStringResult = ofResult.toString();
    CubeName actualCubeName = ofResult.getCubeName();
    ImmutableMap<CubeInfoType<?>, Object> actualInfo = ofResult.getInfo();
    ValueType actualWValueType = ofResult.getWValueType();
    ValueType actualXValueType = ofResult.getXValueType();
    ValueType actualYValueType = ofResult.getYValueType();
    ValueType actualZValueType = ofResult.getZValueType();
    ofResult.toBuilder();

    // Assert
    assertEquals(
        "DefaultCubeMetadata{cubeName=Name, xValueType=Unknown, yValueType=Unknown, zValueType=Unknown,"
            + " wValueType=Unknown, info={}, parameterMetadata=null}",
        actualToStringResult);
    assertTrue(actualInfo.isEmpty());
    assertSame(name, actualCubeName);
    ValueType valueType = ValueType.UNKNOWN;
    assertSame(valueType, actualWValueType);
    assertSame(valueType, actualXValueType);
    assertSame(valueType, actualYValueType);
    assertSame(valueType, actualZValueType);
  }

  /**
   * Test {@link DefaultCubeMetadata#equals(Object)}, and {@link DefaultCubeMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCubeMetadata#equals(Object)}
   *   <li>{@link DefaultCubeMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCubeMetadata.equals(Object)",
    "int DefaultCubeMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    DefaultCubeMetadata ofResult = DefaultCubeMetadata.of(CubeName.of("Name"));
    DefaultCubeMetadata ofResult2 = DefaultCubeMetadata.of(CubeName.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link DefaultCubeMetadata#equals(Object)}, and {@link DefaultCubeMetadata#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DefaultCubeMetadata#equals(Object)}
   *   <li>{@link DefaultCubeMetadata#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCubeMetadata.equals(Object)",
    "int DefaultCubeMetadata.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    DefaultCubeMetadata ofResult = DefaultCubeMetadata.of(CubeName.of("Name"));

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link DefaultCubeMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCubeMetadata.equals(Object)",
    "int DefaultCubeMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    DefaultCubeMetadata ofResult = DefaultCubeMetadata.of(mock(CubeName.class));

    // Act and Assert
    assertNotEquals(ofResult, DefaultCubeMetadata.of(CubeName.of("Name")));
  }

  /**
   * Test {@link DefaultCubeMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCubeMetadata.equals(Object)",
    "int DefaultCubeMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    CubeName cubeName = CubeName.of("Name");
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();

    DefaultCubeMetadata defaultCubeMetadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    assertNotEquals(defaultCubeMetadata, DefaultCubeMetadata.of(CubeName.of("Name")));
  }

  /**
   * Test {@link DefaultCubeMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then throw exception.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then throw exception")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCubeMetadata.equals(Object)",
    "int DefaultCubeMetadata.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenThrowException() {
    // Arrange
    CubeName name = mock(CubeName.class);
    when(name.getName()).thenThrow(new IllegalArgumentException());
    DefaultCubeMetadata ofResult = DefaultCubeMetadata.of(name);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.equals(DefaultCubeMetadata.of(mock(CubeName.class))));
  }

  /**
   * Test {@link DefaultCubeMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCubeMetadata.equals(Object)",
    "int DefaultCubeMetadata.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(DefaultCubeMetadata.of(CubeName.of("Name")), null);
  }

  /**
   * Test {@link DefaultCubeMetadata#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCubeMetadata#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean DefaultCubeMetadata.equals(Object)",
    "int DefaultCubeMetadata.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        DefaultCubeMetadata.of(CubeName.of("Name")), "Different type to DefaultCubeMetadata");
  }
}
