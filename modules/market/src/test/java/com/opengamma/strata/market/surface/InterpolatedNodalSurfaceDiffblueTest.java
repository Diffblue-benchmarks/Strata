package com.opengamma.strata.market.surface;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolators;
import com.opengamma.strata.market.surface.InterpolatedNodalSurface.Builder;
import com.opengamma.strata.market.surface.InterpolatedNodalSurface.Meta;
import com.opengamma.strata.market.surface.interpolator.BoundSurfaceInterpolator;
import com.opengamma.strata.market.surface.interpolator.GridSurfaceInterpolator;
import com.opengamma.strata.market.surface.interpolator.SurfaceInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class InterpolatedNodalSurfaceDiffblueTest {
  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code interpolator}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'interpolator'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenInterpolator_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(InterpolatedNodalSurface.builder().get("interpolator"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code metadata}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'metadata'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenMetadata_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(InterpolatedNodalSurface.builder().get("metadata"));
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
        () -> InterpolatedNodalSurface.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code xValues}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'xValues'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenXValues_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(InterpolatedNodalSurface.builder().get("xValues"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code yValues}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'yValues'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenYValues_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(InterpolatedNodalSurface.builder().get("yValues"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code zValues}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'zValues'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenZValues_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(InterpolatedNodalSurface.builder().get("zValues"));
  }

  /**
   * Test Builder {@link Builder#interpolator(SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>When {@link SurfaceInterpolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#interpolator(SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Builder interpolator(SurfaceInterpolator); when SurfaceInterpolator; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.interpolator(SurfaceInterpolator)"})
  void testBuilderInterpolator_whenSurfaceInterpolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalSurface.builder();

    // Act
    Builder actualInterpolatorResult = builderResult.interpolator(mock(SurfaceInterpolator.class));

    // Assert
    assertSame(builderResult, actualInterpolatorResult);
  }

  /**
   * Test Builder {@link Builder#metadata(SurfaceMetadata)}.
   *
   * <ul>
   *   <li>When {@link SurfaceName} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#metadata(SurfaceMetadata)}
   */
  @Test
  @DisplayName(
      "Test Builder metadata(SurfaceMetadata); when SurfaceName with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.metadata(SurfaceMetadata)"})
  void testBuilderMetadata_whenSurfaceNameWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalSurface.builder();

    // Act
    Builder actualMetadataResult =
        builderResult.metadata(DefaultSurfaceMetadata.of(SurfaceName.of("Name")));

    // Assert
    assertSame(builderResult, actualMetadataResult);
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
        () -> InterpolatedNodalSurface.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code interpolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'interpolator'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenInterpolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalSurface.builder();

    // Act
    Builder actualSetResult =
        builderResult.set(
            "interpolator",
            GridSurfaceInterpolator.of(
                CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC));

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
    Builder builderResult = InterpolatedNodalSurface.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#xValues(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#xValues(DoubleArray)}
   */
  @Test
  @DisplayName("Test Builder xValues(DoubleArray); when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.xValues(DoubleArray)"})
  void testBuilderXValues_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalSurface.builder();

    // Act
    Builder actualXValuesResult = builderResult.xValues(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualXValuesResult);
  }

  /**
   * Test Builder {@link Builder#yValues(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#yValues(DoubleArray)}
   */
  @Test
  @DisplayName("Test Builder yValues(DoubleArray); when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.yValues(DoubleArray)"})
  void testBuilderYValues_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalSurface.builder();

    // Act
    Builder actualYValuesResult = builderResult.yValues(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualYValuesResult);
  }

  /**
   * Test Builder {@link Builder#zValues(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#zValues(DoubleArray)}
   */
  @Test
  @DisplayName("Test Builder zValues(DoubleArray); when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.zValues(DoubleArray)"})
  void testBuilderZValues_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalSurface.builder();

    // Act
    Builder actualZValuesResult = builderResult.zValues(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualZValuesResult);
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
    Class<? extends InterpolatedNodalSurface> actualBeanTypeResult =
        InterpolatedNodalSurface.meta().beanType();

    // Assert
    Class<InterpolatedNodalSurface> expectedBeanTypeResult = InterpolatedNodalSurface.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#interpolator()}
   *   <li>{@link Meta#metadata()}
   *   <li>{@link Meta#xValues()}
   *   <li>{@link Meta#yValues()}
   *   <li>{@link Meta#zValues()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.interpolator()",
    "MetaProperty Meta.metadata()",
    "MetaProperty Meta.xValues()",
    "MetaProperty Meta.yValues()",
    "MetaProperty Meta.zValues()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = InterpolatedNodalSurface.meta();

    // Act
    MetaProperty<SurfaceInterpolator> actualInterpolatorResult = metaResult.interpolator();
    MetaProperty<SurfaceMetadata> actualMetadataResult = metaResult.metadata();
    MetaProperty<DoubleArray> actualXValuesResult = metaResult.xValues();
    MetaProperty<DoubleArray> actualYValuesResult = metaResult.yValues();

    // Assert
    assertTrue(actualInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualXValuesResult instanceof DirectMetaProperty);
    assertTrue(actualYValuesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.zValues() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code interpolator}.
   *   <li>Then return name is {@code interpolator}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'interpolator'; then return name is 'interpolator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenInterpolator_thenReturnNameIsInterpolator() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedNodalSurface.meta().metaPropertyGet("interpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> xValuesResult = ((Meta) metaBeanResult).xValues();
    assertTrue(xValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> yValuesResult = ((Meta) metaBeanResult).yValues();
    assertTrue(yValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> zValuesResult = ((Meta) metaBeanResult).zValues();
    assertTrue(zValuesResult instanceof DirectMetaProperty);
    assertEquals("interpolator", actualMetaPropertyGetResult.name());
    Class<SurfaceInterpolator> expectedPropertyTypeResult = SurfaceInterpolator.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).interpolator());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, xValuesResult.metaBean());
    assertSame(metaBeanResult, yValuesResult.metaBean());
    assertSame(metaBeanResult, zValuesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code metadata}.
   *   <li>Then return name is {@code metadata}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'metadata'; then return name is 'metadata'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenMetadata_thenReturnNameIsMetadata() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedNodalSurface.meta().metaPropertyGet("metadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<SurfaceInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> xValuesResult = ((Meta) metaBeanResult).xValues();
    assertTrue(xValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> yValuesResult = ((Meta) metaBeanResult).yValues();
    assertTrue(yValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> zValuesResult = ((Meta) metaBeanResult).zValues();
    assertTrue(zValuesResult instanceof DirectMetaProperty);
    assertEquals("metadata", actualMetaPropertyGetResult.name());
    Class<SurfaceMetadata> expectedPropertyTypeResult = SurfaceMetadata.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).metadata());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, xValuesResult.metaBean());
    assertSame(metaBeanResult, yValuesResult.metaBean());
    assertSame(metaBeanResult, zValuesResult.metaBean());
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
    assertNull(InterpolatedNodalSurface.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code xValues}.
   *   <li>Then return name is {@code xValues}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'xValues'; then return name is 'xValues'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenXValues_thenReturnNameIsXValues() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedNodalSurface.meta().metaPropertyGet("xValues");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<SurfaceInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> yValuesResult = ((Meta) metaBeanResult).yValues();
    assertTrue(yValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> zValuesResult = ((Meta) metaBeanResult).zValues();
    assertTrue(zValuesResult instanceof DirectMetaProperty);
    assertEquals("xValues", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValues());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, yValuesResult.metaBean());
    assertSame(metaBeanResult, zValuesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yValues}.
   *   <li>Then return name is {@code yValues}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'yValues'; then return name is 'yValues'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYValues_thenReturnNameIsYValues() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedNodalSurface.meta().metaPropertyGet("yValues");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<SurfaceInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> xValuesResult = ((Meta) metaBeanResult).xValues();
    assertTrue(xValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> zValuesResult = ((Meta) metaBeanResult).zValues();
    assertTrue(zValuesResult instanceof DirectMetaProperty);
    assertEquals("yValues", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValues());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, xValuesResult.metaBean());
    assertSame(metaBeanResult, zValuesResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code zValues}.
   *   <li>Then return name is {@code zValues}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'zValues'; then return name is 'zValues'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenZValues_thenReturnNameIsZValues() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedNodalSurface.meta().metaPropertyGet("zValues");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<SurfaceInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> xValuesResult = ((Meta) metaBeanResult).xValues();
    assertTrue(xValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> yValuesResult = ((Meta) metaBeanResult).yValues();
    assertTrue(yValuesResult instanceof DirectMetaProperty);
    assertEquals("zValues", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zValues());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, xValuesResult.metaBean());
    assertSame(metaBeanResult, yValuesResult.metaBean());
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
        InterpolatedNodalSurface.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("interpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("metadata") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("xValues") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yValues") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("zValues") instanceof DirectMetaProperty);
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
        InterpolatedNodalSurface.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            InterpolatedNodalSurface.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
            InterpolatedNodalSurface.meta()
                .propertySet(mock(Bean.class), "interpolator", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code interpolator}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'interpolator'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInterpolator_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedNodalSurface.meta()
                .propertySet(mock(Bean.class), "interpolator", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code metadata}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'metadata'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenMetadata_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedNodalSurface.meta()
                .propertySet(mock(Bean.class), "metadata", "New Value", true));
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
            InterpolatedNodalSurface.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code xValues}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'xValues'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenXValues_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedNodalSurface.meta()
                .propertySet(mock(Bean.class), "xValues", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yValues}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yValues'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYValues_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedNodalSurface.meta()
                .propertySet(mock(Bean.class), "yValues", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code zValues}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'zValues'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenZValues_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedNodalSurface.meta()
                .propertySet(mock(Bean.class), "zValues", "New Value", true));
  }

  /**
   * Test {@link InterpolatedNodalSurface#of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray,
   * SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#of(SurfaceMetadata, DoubleArray,
   * DoubleArray, DoubleArray, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator); when DoubleArray; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface InterpolatedNodalSurface.of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator)"
  })
  void testOf_whenDoubleArray_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalSurface.of(
                metadata, xValues, yValues, DoubleArray.of(), mock(SurfaceInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalSurface#of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray,
   * SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#of(SurfaceMetadata, DoubleArray,
   * DoubleArray, DoubleArray, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator); when filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface InterpolatedNodalSurface.of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator)"
  })
  void testOf_whenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalSurface.of(
                metadata, xValues, yValues, DoubleArray.of(), mock(SurfaceInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalSurface#of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray,
   * SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#of(SurfaceMetadata, DoubleArray,
   * DoubleArray, DoubleArray, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator); when filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface InterpolatedNodalSurface.of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator)"
  })
  void testOf_whenFilledThree_thenThrowIllegalArgumentException2() {
    // Arrange
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalSurface.of(
                metadata, xValues, yValues, DoubleArray.of(), mock(SurfaceInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalSurface#of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray,
   * SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#of(SurfaceMetadata, DoubleArray,
   * DoubleArray, DoubleArray, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator); when filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface InterpolatedNodalSurface.of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator)"
  })
  void testOf_whenFilledThree_thenThrowIllegalArgumentException3() {
    // Arrange
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalSurface.of(
                metadata,
                xValues,
                yValues,
                DoubleArray.filled(3),
                mock(SurfaceInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalSurface#of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray,
   * SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>When {@link SurfaceName} with name is {@code metadata}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#of(SurfaceMetadata, DoubleArray,
   * DoubleArray, DoubleArray, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator); when SurfaceName with name is 'metadata'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface InterpolatedNodalSurface.of(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator)"
  })
  void testOf_whenSurfaceNameWithNameIsMetadata_thenThrowIllegalArgumentException() {
    // Arrange
    SurfaceName surfaceName = SurfaceName.of("metadata");
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();

    DefaultSurfaceMetadata metadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalSurface.of(
                metadata,
                xValues,
                yValues,
                DoubleArray.filled(3),
                mock(SurfaceInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray,
   * DoubleArray, SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray,
   * DoubleArray, DoubleArray, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface InterpolatedNodalSurface.ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator)"
  })
  void testOfUnsorted_givenIllegalArgumentException() {
    // Arrange
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.filled(3);

    SurfaceInterpolator interpolator = mock(SurfaceInterpolator.class);
    when(interpolator.bind(
            Mockito.<DoubleArray>any(), Mockito.<DoubleArray>any(), Mockito.<DoubleArray>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalSurface.ofUnsorted(metadata, xValues, yValues, zValues, interpolator));
    verify(interpolator)
        .bind(isA(DoubleArray.class), isA(DoubleArray.class), isA(DoubleArray.class));
  }

  /**
   * Test {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray,
   * DoubleArray, SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>Then Metadata return {@link DefaultSurfaceMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray,
   * DoubleArray, DoubleArray, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator); then Metadata return DefaultSurfaceMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface InterpolatedNodalSurface.ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator)"
  })
  void testOfUnsorted_thenMetadataReturnDefaultSurfaceMetadata() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(name);
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.filled(3);

    SurfaceInterpolator interpolator = mock(SurfaceInterpolator.class);
    when(interpolator.bind(
            Mockito.<DoubleArray>any(), Mockito.<DoubleArray>any(), Mockito.<DoubleArray>any()))
        .thenReturn(mock(BoundSurfaceInterpolator.class));

    // Act
    InterpolatedNodalSurface actualOfUnsortedResult =
        InterpolatedNodalSurface.ofUnsorted(metadata, xValues, yValues, zValues, interpolator);

    // Assert
    verify(interpolator)
        .bind(isA(DoubleArray.class), isA(DoubleArray.class), isA(DoubleArray.class));
    assertTrue(actualOfUnsortedResult.getMetadata() instanceof DefaultSurfaceMetadata);
    assertEquals(1, actualOfUnsortedResult.getParameterCount());
    assertSame(name, actualOfUnsortedResult.getName());
    assertSame(interpolator, actualOfUnsortedResult.getInterpolator());
  }

  /**
   * Test {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray,
   * DoubleArray, SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray,
   * DoubleArray, DoubleArray, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator); when DoubleArray; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface InterpolatedNodalSurface.ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator)"
  })
  void testOfUnsorted_whenDoubleArray_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalSurface.ofUnsorted(
                metadata, xValues, yValues, DoubleArray.of(), mock(SurfaceInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray,
   * DoubleArray, SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray,
   * DoubleArray, DoubleArray, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator); when DoubleArray; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface InterpolatedNodalSurface.ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator)"
  })
  void testOfUnsorted_whenDoubleArray_thenThrowIllegalArgumentException2() {
    // Arrange
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalSurface.ofUnsorted(
                metadata, xValues, yValues, DoubleArray.of(), mock(SurfaceInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray,
   * DoubleArray, SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray,
   * DoubleArray, DoubleArray, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator); when DoubleArray; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface InterpolatedNodalSurface.ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator)"
  })
  void testOfUnsorted_whenDoubleArray_thenThrowIllegalArgumentException3() {
    // Arrange
    DefaultSurfaceMetadata metadata = DefaultSurfaceMetadata.of(SurfaceName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalSurface.ofUnsorted(
                metadata, xValues, yValues, DoubleArray.of(), mock(SurfaceInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray,
   * DoubleArray, SurfaceInterpolator)}.
   *
   * <ul>
   *   <li>When {@link SurfaceName} with name is {@code metadata}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#ofUnsorted(SurfaceMetadata, DoubleArray,
   * DoubleArray, DoubleArray, SurfaceInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator); when SurfaceName with name is 'metadata'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface InterpolatedNodalSurface.ofUnsorted(SurfaceMetadata, DoubleArray, DoubleArray, DoubleArray, SurfaceInterpolator)"
  })
  void testOfUnsorted_whenSurfaceNameWithNameIsMetadata() {
    // Arrange
    SurfaceName surfaceName = SurfaceName.of("metadata");
    HashMap<SurfaceInfoType<?>, Object> info = new HashMap<>();

    DefaultSurfaceMetadata metadata =
        new DefaultSurfaceMetadata(
            surfaceName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalSurface.ofUnsorted(
                metadata,
                xValues,
                yValues,
                DoubleArray.filled(3),
                mock(SurfaceInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalSurface#meta()}.
   *
   * <p>Method under test: {@link InterpolatedNodalSurface#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta InterpolatedNodalSurface.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = InterpolatedNodalSurface.meta();

    // Assert
    assertTrue(actualMetaResult.interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.metadata() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xValues() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yValues() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.zValues() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }
}
