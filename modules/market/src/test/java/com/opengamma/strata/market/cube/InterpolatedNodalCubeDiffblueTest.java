package com.opengamma.strata.market.cube;

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
import com.opengamma.strata.market.cube.InterpolatedNodalCube.Builder;
import com.opengamma.strata.market.cube.InterpolatedNodalCube.Meta;
import com.opengamma.strata.market.cube.interpolator.BoundCubeInterpolator;
import com.opengamma.strata.market.cube.interpolator.CubeInterpolator;
import com.opengamma.strata.market.cube.interpolator.GridCubeInterpolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolators;
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

class InterpolatedNodalCubeDiffblueTest {
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
    assertNull(InterpolatedNodalCube.builder().get("interpolator"));
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
    assertNull(InterpolatedNodalCube.builder().get("metadata"));
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
        NoSuchElementException.class, () -> InterpolatedNodalCube.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code wValues}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'wValues'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenWValues_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(InterpolatedNodalCube.builder().get("wValues"));
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
    assertNull(InterpolatedNodalCube.builder().get("xValues"));
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
    assertNull(InterpolatedNodalCube.builder().get("yValues"));
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
    assertNull(InterpolatedNodalCube.builder().get("zValues"));
  }

  /**
   * Test Builder {@link Builder#interpolator(CubeInterpolator)}.
   *
   * <ul>
   *   <li>When {@link CubeInterpolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#interpolator(CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Builder interpolator(CubeInterpolator); when CubeInterpolator; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.interpolator(CubeInterpolator)"})
  void testBuilderInterpolator_whenCubeInterpolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalCube.builder();

    // Act
    Builder actualInterpolatorResult = builderResult.interpolator(mock(CubeInterpolator.class));

    // Assert
    assertSame(builderResult, actualInterpolatorResult);
  }

  /**
   * Test Builder {@link Builder#metadata(CubeMetadata)}.
   *
   * <ul>
   *   <li>When {@link CubeName} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#metadata(CubeMetadata)}
   */
  @Test
  @DisplayName(
      "Test Builder metadata(CubeMetadata); when CubeName with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.metadata(CubeMetadata)"})
  void testBuilderMetadata_whenCubeNameWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalCube.builder();

    // Act
    Builder actualMetadataResult =
        builderResult.metadata(DefaultCubeMetadata.of(CubeName.of("Name")));

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
        () -> InterpolatedNodalCube.builder().set("Property Name", "New Value"));
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
    Builder builderResult = InterpolatedNodalCube.builder();
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC);

    // Act
    Builder actualSetResult = builderResult.set("interpolator", ofResult);

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
    Builder builderResult = InterpolatedNodalCube.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#wValues(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#wValues(DoubleArray)}
   */
  @Test
  @DisplayName("Test Builder wValues(DoubleArray); when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.wValues(DoubleArray)"})
  void testBuilderWValues_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalCube.builder();

    // Act
    Builder actualWValuesResult = builderResult.wValues(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualWValuesResult);
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
    Builder builderResult = InterpolatedNodalCube.builder();

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
    Builder builderResult = InterpolatedNodalCube.builder();

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
    Builder builderResult = InterpolatedNodalCube.builder();

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
    Class<? extends InterpolatedNodalCube> actualBeanTypeResult =
        InterpolatedNodalCube.meta().beanType();

    // Assert
    Class<InterpolatedNodalCube> expectedBeanTypeResult = InterpolatedNodalCube.class;
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
   *   <li>{@link Meta#wValues()}
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
    "MetaProperty Meta.wValues()",
    "MetaProperty Meta.xValues()",
    "MetaProperty Meta.yValues()",
    "MetaProperty Meta.zValues()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = InterpolatedNodalCube.meta();

    // Act
    MetaProperty<CubeInterpolator> actualInterpolatorResult = metaResult.interpolator();
    MetaProperty<CubeMetadata> actualMetadataResult = metaResult.metadata();
    MetaProperty<DoubleArray> actualWValuesResult = metaResult.wValues();
    MetaProperty<DoubleArray> actualXValuesResult = metaResult.xValues();
    MetaProperty<DoubleArray> actualYValuesResult = metaResult.yValues();

    // Assert
    assertTrue(actualInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualWValuesResult instanceof DirectMetaProperty);
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
        InterpolatedNodalCube.meta().metaPropertyGet("interpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).metadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).wValues() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValues() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValues() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zValues() instanceof DirectMetaProperty);
    assertEquals("interpolator", actualMetaPropertyGetResult.name());
    Class<CubeInterpolator> expectedPropertyTypeResult = CubeInterpolator.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).interpolator());
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
        InterpolatedNodalCube.meta().metaPropertyGet("metadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).wValues() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValues() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValues() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zValues() instanceof DirectMetaProperty);
    assertEquals("metadata", actualMetaPropertyGetResult.name());
    Class<CubeMetadata> expectedPropertyTypeResult = CubeMetadata.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).metadata());
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
    assertNull(InterpolatedNodalCube.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code wValues}.
   *   <li>Then return name is {@code wValues}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'wValues'; then return name is 'wValues'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenWValues_thenReturnNameIsWValues() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedNodalCube.meta().metaPropertyGet("wValues");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CubeInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CubeMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> xValuesResult = ((Meta) metaBeanResult).xValues();
    assertTrue(xValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> yValuesResult = ((Meta) metaBeanResult).yValues();
    assertTrue(yValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> zValuesResult = ((Meta) metaBeanResult).zValues();
    assertTrue(zValuesResult instanceof DirectMetaProperty);
    assertEquals("wValues", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).wValues());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, xValuesResult.metaBean());
    assertSame(metaBeanResult, yValuesResult.metaBean());
    assertSame(metaBeanResult, zValuesResult.metaBean());
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
        InterpolatedNodalCube.meta().metaPropertyGet("xValues");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CubeInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CubeMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> wValuesResult = ((Meta) metaBeanResult).wValues();
    assertTrue(wValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> yValuesResult = ((Meta) metaBeanResult).yValues();
    assertTrue(yValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> zValuesResult = ((Meta) metaBeanResult).zValues();
    assertTrue(zValuesResult instanceof DirectMetaProperty);
    assertEquals("xValues", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValues());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, wValuesResult.metaBean());
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
        InterpolatedNodalCube.meta().metaPropertyGet("yValues");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CubeInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CubeMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> wValuesResult = ((Meta) metaBeanResult).wValues();
    assertTrue(wValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> xValuesResult = ((Meta) metaBeanResult).xValues();
    assertTrue(xValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> zValuesResult = ((Meta) metaBeanResult).zValues();
    assertTrue(zValuesResult instanceof DirectMetaProperty);
    assertEquals("yValues", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValues());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, wValuesResult.metaBean());
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
        InterpolatedNodalCube.meta().metaPropertyGet("zValues");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CubeInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CubeMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> wValuesResult = ((Meta) metaBeanResult).wValues();
    assertTrue(wValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> xValuesResult = ((Meta) metaBeanResult).xValues();
    assertTrue(xValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> yValuesResult = ((Meta) metaBeanResult).yValues();
    assertTrue(yValuesResult instanceof DirectMetaProperty);
    assertEquals("zValues", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zValues());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, wValuesResult.metaBean());
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
        InterpolatedNodalCube.meta().metaPropertyMap();

    // Assert
    assertEquals(6, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("interpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("metadata") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("wValues") instanceof DirectMetaProperty);
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
    assertNull(InterpolatedNodalCube.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> InterpolatedNodalCube.meta().propertyGet(mock(Bean.class), "Property Name", false));
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
            InterpolatedNodalCube.meta()
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
            InterpolatedNodalCube.meta()
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
            InterpolatedNodalCube.meta()
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
            InterpolatedNodalCube.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code wValues}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'wValues'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenWValues_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedNodalCube.meta()
                .propertySet(mock(Bean.class), "wValues", "New Value", true));
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
            InterpolatedNodalCube.meta()
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
            InterpolatedNodalCube.meta()
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
            InterpolatedNodalCube.meta()
                .propertySet(mock(Bean.class), "zValues", "New Value", true));
  }

  /**
   * Test {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray,
   * DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>Given {@link BoundCubeInterpolator}.
   *   <li>Then Metadata return {@link DefaultCubeMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); given BoundCubeInterpolator; then Metadata return DefaultCubeMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOf_givenBoundCubeInterpolator_thenMetadataReturnDefaultCubeMetadata() {
    // Arrange
    CubeName name = CubeName.of("Name");
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(name);
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.filled(3);
    DoubleArray wValues = DoubleArray.filled(3);

    CubeInterpolator interpolator = mock(CubeInterpolator.class);
    when(interpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any()))
        .thenReturn(mock(BoundCubeInterpolator.class));

    // Act
    InterpolatedNodalCube actualOfResult =
        InterpolatedNodalCube.of(metadata, xValues, yValues, zValues, wValues, interpolator);

    // Assert
    verify(interpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class));
    CubeMetadata metadata2 = actualOfResult.getMetadata();
    assertTrue(metadata2 instanceof DefaultCubeMetadata);
    assertEquals(3, actualOfResult.getParameterCount());
    assertSame(wValues, actualOfResult.getWValues());
    assertSame(xValues, actualOfResult.getXValues());
    assertSame(yValues, actualOfResult.getYValues());
    assertSame(zValues, actualOfResult.getZValues());
    assertSame(name, actualOfResult.getName());
    assertSame(metadata, metadata2);
    assertSame(interpolator, actualOfResult.getInterpolator());
  }

  /**
   * Test {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray,
   * DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOf_givenIllegalArgumentException() {
    // Arrange
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(CubeName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.filled(3);
    DoubleArray wValues = DoubleArray.filled(3);

    CubeInterpolator interpolator = mock(CubeInterpolator.class);
    when(interpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> InterpolatedNodalCube.of(metadata, xValues, yValues, zValues, wValues, interpolator));
    verify(interpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class));
  }

  /**
   * Test {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray,
   * DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>When {@link CubeName} with name is {@code metadata}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); when CubeName with name is 'metadata'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOf_whenCubeNameWithNameIsMetadata_thenThrowIllegalArgumentException() {
    // Arrange
    CubeName cubeName = CubeName.of("metadata");
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();

    DefaultCubeMetadata metadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalCube.of(
                metadata,
                xValues,
                yValues,
                zValues,
                DoubleArray.filled(3),
                mock(CubeInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray,
   * DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); when DoubleArray; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOf_whenDoubleArray_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(CubeName.of("Name"));
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray zValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalCube.of(
                metadata,
                xValues,
                yValues,
                zValues,
                DoubleArray.of(),
                mock(CubeInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray,
   * DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); when filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOf_whenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(CubeName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.of();
    DoubleArray zValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalCube.of(
                metadata,
                xValues,
                yValues,
                zValues,
                DoubleArray.of(),
                mock(CubeInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray,
   * DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); when filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOf_whenFilledThree_thenThrowIllegalArgumentException2() {
    // Arrange
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(CubeName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalCube.of(
                metadata,
                xValues,
                yValues,
                zValues,
                DoubleArray.of(),
                mock(CubeInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray,
   * DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#of(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); when filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.of(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOf_whenFilledThree_thenThrowIllegalArgumentException3() {
    // Arrange
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(CubeName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalCube.of(
                metadata,
                xValues,
                yValues,
                zValues,
                DoubleArray.of(),
                mock(CubeInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>Given {@link BoundCubeInterpolator}.
   *   <li>Then Metadata return {@link DefaultCubeMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); given BoundCubeInterpolator; then Metadata return DefaultCubeMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOfUnsorted_givenBoundCubeInterpolator_thenMetadataReturnDefaultCubeMetadata() {
    // Arrange
    CubeName name = CubeName.of("Name");
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(name);
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.filled(3);
    DoubleArray wValues = DoubleArray.filled(3);

    CubeInterpolator interpolator = mock(CubeInterpolator.class);
    when(interpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any()))
        .thenReturn(mock(BoundCubeInterpolator.class));

    // Act
    InterpolatedNodalCube actualOfUnsortedResult =
        InterpolatedNodalCube.ofUnsorted(
            metadata, xValues, yValues, zValues, wValues, interpolator);

    // Assert
    verify(interpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class));
    assertTrue(actualOfUnsortedResult.getMetadata() instanceof DefaultCubeMetadata);
    assertEquals(1, actualOfUnsortedResult.getParameterCount());
    assertSame(name, actualOfUnsortedResult.getName());
    assertSame(interpolator, actualOfUnsortedResult.getInterpolator());
  }

  /**
   * Test {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOfUnsorted_givenIllegalArgumentException() {
    // Arrange
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(CubeName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.filled(3);
    DoubleArray wValues = DoubleArray.filled(3);

    CubeInterpolator interpolator = mock(CubeInterpolator.class);
    when(interpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalCube.ofUnsorted(
                metadata, xValues, yValues, zValues, wValues, interpolator));
    verify(interpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(DoubleArray.class));
  }

  /**
   * Test {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>When {@link CubeName} with name is {@code metadata}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); when CubeName with name is 'metadata'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOfUnsorted_whenCubeNameWithNameIsMetadata_thenThrowIllegalArgumentException() {
    // Arrange
    CubeName cubeName = CubeName.of("metadata");
    HashMap<CubeInfoType<?>, Object> info = new HashMap<>();

    DefaultCubeMetadata metadata =
        new DefaultCubeMetadata(
            cubeName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalCube.ofUnsorted(
                metadata,
                xValues,
                yValues,
                zValues,
                DoubleArray.filled(3),
                mock(CubeInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); when DoubleArray; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOfUnsorted_whenDoubleArray_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(CubeName.of("Name"));
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray zValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalCube.ofUnsorted(
                metadata,
                xValues,
                yValues,
                zValues,
                DoubleArray.of(),
                mock(CubeInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); when filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOfUnsorted_whenFilledThree_thenThrowIllegalArgumentException() {
    // Arrange
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(CubeName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.of();
    DoubleArray zValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalCube.ofUnsorted(
                metadata,
                xValues,
                yValues,
                zValues,
                DoubleArray.of(),
                mock(CubeInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); when filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOfUnsorted_whenFilledThree_thenThrowIllegalArgumentException2() {
    // Arrange
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(CubeName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.of();

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalCube.ofUnsorted(
                metadata,
                xValues,
                yValues,
                zValues,
                DoubleArray.of(),
                mock(CubeInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray, CubeInterpolator)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link InterpolatedNodalCube#ofUnsorted(CubeMetadata, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)}
   */
  @Test
  @DisplayName(
      "Test ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator); when filled three; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCube InterpolatedNodalCube.ofUnsorted(CubeMetadata, DoubleArray, DoubleArray, DoubleArray, DoubleArray, CubeInterpolator)"
  })
  void testOfUnsorted_whenFilledThree_thenThrowIllegalArgumentException3() {
    // Arrange
    DefaultCubeMetadata metadata = DefaultCubeMetadata.of(CubeName.of("Name"));
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            InterpolatedNodalCube.ofUnsorted(
                metadata,
                xValues,
                yValues,
                zValues,
                DoubleArray.of(),
                mock(CubeInterpolator.class)));
  }

  /**
   * Test {@link InterpolatedNodalCube#meta()}.
   *
   * <p>Method under test: {@link InterpolatedNodalCube#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta InterpolatedNodalCube.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = InterpolatedNodalCube.meta();

    // Assert
    assertTrue(actualMetaResult.interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.metadata() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.wValues() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xValues() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yValues() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.zValues() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }
}
