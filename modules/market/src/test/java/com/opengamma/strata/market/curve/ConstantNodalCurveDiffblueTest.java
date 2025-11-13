package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.ConstantNodalCurve.Builder;
import com.opengamma.strata.market.curve.ConstantNodalCurve.Meta;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
import com.opengamma.strata.market.param.UnitParameterSensitivity;
import java.util.ArrayList;
import java.util.HashMap;
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
import org.mockito.Mockito;

class ConstantNodalCurveDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantNodalCurve Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualBuilderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    ConstantNodalCurve actualConstantNodalCurve =
        actualBuilderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    // Assert
    DoubleArray xValues = actualConstantNodalCurve.getXValues();
    assertEquals(1, xValues.dimensions());
    assertEquals(1, xValues.size());
    assertEquals(1, actualConstantNodalCurve.getParameterCount());
    List<Double> toListResult = xValues.toList();
    assertEquals(1, toListResult.size());
    assertEquals(10.0d, xValues.max());
    assertEquals(10.0d, xValues.min());
    assertEquals(10.0d, xValues.sum());
    assertEquals(10.0d, actualConstantNodalCurve.getXValue());
    assertEquals(10.0d, actualConstantNodalCurve.getYValue());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertFalse(xValues.isEmpty());
    assertSame(name, actualConstantNodalCurve.getName());
    assertSame(metadata, actualConstantNodalCurve.getMetadata());
    assertArrayEquals(new double[] {10.0d}, xValues.toArrayUnsafe(), 0.0);
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
    assertNull(ConstantNodalCurve.builder().get("metadata"));
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
        NoSuchElementException.class, () -> ConstantNodalCurve.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code xValue}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'xValue'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenXValue_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, ((Double) ConstantNodalCurve.builder().get("xValue")).doubleValue());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code yValue}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'yValue'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenYValue_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(0.0d, ((Double) ConstantNodalCurve.builder().get("yValue")).doubleValue());
  }

  /**
   * Test Builder {@link Builder#metadata(CurveMetadata)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then builder build XValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#metadata(CurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test Builder metadata(CurveMetadata); when CurveName with 'Name'; then builder build XValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.metadata(CurveMetadata)"})
  void testBuilderMetadata_whenCurveNameWithName_thenBuilderBuildXValueIsZero() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);

    // Act
    Builder actualMetadataResult = builderResult.metadata(metadata);

    // Assert
    ConstantNodalCurve constantNodalCurve = builderResult.build();
    assertEquals(0.0d, constantNodalCurve.getXValue());
    assertEquals(0.0d, constantNodalCurve.getYValue());
    assertEquals(1, constantNodalCurve.getParameterCount());
    assertSame(builderResult, actualMetadataResult);
    assertSame(name, constantNodalCurve.getName());
    assertSame(metadata, constantNodalCurve.getMetadata());
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
        () -> ConstantNodalCurve.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code metadata}.
   *   <li>Then builder build XValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'metadata'; then builder build XValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenMetadata_thenBuilderBuildXValueIsZero() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata ofResult = DefaultCurveMetadata.of(name);

    // Act
    Builder actualSetResult = builderResult.set("metadata", ofResult);

    // Assert
    ConstantNodalCurve constantNodalCurve = builderResult.build();
    assertEquals(0.0d, constantNodalCurve.getXValue());
    assertEquals(0.0d, constantNodalCurve.getYValue());
    assertEquals(1, constantNodalCurve.getParameterCount());
    assertSame(builderResult, actualSetResult);
    assertSame(name, constantNodalCurve.getName());
    assertSame(ofResult, constantNodalCurve.getMetadata());
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
    Builder builderResult = ConstantNodalCurve.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#xValue(double)}.
   *
   * <p>Method under test: {@link Builder#xValue(double)}
   */
  @Test
  @DisplayName("Test Builder xValue(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.xValue(double)"})
  void testBuilderXValue() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();

    // Act
    Builder actualXValueResult = builderResult.xValue(10.0d);

    // Assert
    assertSame(builderResult, actualXValueResult);
  }

  /**
   * Test Builder {@link Builder#yValue(double)}.
   *
   * <p>Method under test: {@link Builder#yValue(double)}
   */
  @Test
  @DisplayName("Test Builder yValue(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.yValue(double)"})
  void testBuilderYValue() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();

    // Act
    Builder actualYValueResult = builderResult.yValue(10.0d);

    // Assert
    assertSame(builderResult, actualYValueResult);
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
    Class<? extends ConstantNodalCurve> actualBeanTypeResult = ConstantNodalCurve.meta().beanType();

    // Assert
    Class<ConstantNodalCurve> expectedBeanTypeResult = ConstantNodalCurve.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#metadata()}
   *   <li>{@link Meta#xValue()}
   *   <li>{@link Meta#yValue()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.metadata()",
    "MetaProperty Meta.xValue()",
    "MetaProperty Meta.yValue()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ConstantNodalCurve.meta();

    // Act
    MetaProperty<CurveMetadata> actualMetadataResult = metaResult.metadata();
    MetaProperty<Double> actualXValueResult = metaResult.xValue();

    // Assert
    assertTrue(actualMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualXValueResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yValue() instanceof DirectMetaProperty);
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
        ConstantNodalCurve.meta().metaPropertyGet("metadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Double> xValueResult = ((Meta) metaBeanResult).xValue();
    assertTrue(xValueResult instanceof DirectMetaProperty);
    MetaProperty<Double> yValueResult = ((Meta) metaBeanResult).yValue();
    assertTrue(yValueResult instanceof DirectMetaProperty);
    assertEquals("metadata", actualMetaPropertyGetResult.name());
    Class<CurveMetadata> expectedPropertyTypeResult = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).metadata());
    assertSame(metaBeanResult, xValueResult.metaBean());
    assertSame(metaBeanResult, yValueResult.metaBean());
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
    assertNull(ConstantNodalCurve.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code xValue}.
   *   <li>Then return name is {@code xValue}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'xValue'; then return name is 'xValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenXValue_thenReturnNameIsXValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ConstantNodalCurve.meta().metaPropertyGet("xValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<Double> yValueResult = ((Meta) metaBeanResult).yValue();
    assertTrue(yValueResult instanceof DirectMetaProperty);
    assertEquals("xValue", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValue());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, yValueResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yValue}.
   *   <li>Then return name is {@code yValue}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'yValue'; then return name is 'yValue'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYValue_thenReturnNameIsYValue() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ConstantNodalCurve.meta().metaPropertyGet("yValue");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<Double> xValueResult = ((Meta) metaBeanResult).xValue();
    assertTrue(xValueResult instanceof DirectMetaProperty);
    assertEquals("yValue", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValue());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, xValueResult.metaBean());
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
        ConstantNodalCurve.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("metadata");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("xValue");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("yValue");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("double", getResult2.propertyType().getName());
    assertEquals("double", getResult3.propertyType().getName());
    assertEquals("metadata", getResult.name());
    assertEquals("xValue", getResult2.name());
    assertEquals("yValue", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<ConstantNodalCurve> expectedDeclaringTypeResult = ConstantNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult, getResult.declaringType());
    Class<ConstantNodalCurve> expectedDeclaringTypeResult2 = ConstantNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult2, getResult2.declaringType());
    Class<ConstantNodalCurve> expectedDeclaringTypeResult3 = ConstantNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<CurveMetadata> expectedPropertyTypeResult = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult, getResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metaBeanResult);
    assertSame(meta, getResult2.metaBean());
    assertSame(meta, getResult3.metaBean());
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
    Meta metaResult = ConstantNodalCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act and Assert
    assertSame(
        metadata,
        metaResult.propertyGet(
            builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build(),
            "metadata",
            true));
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
    Meta metaResult = ConstantNodalCurve.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d),
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
    assertNull(ConstantNodalCurve.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code xValue}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'xValue'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenXValue_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = ConstantNodalCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    builderResult
                        .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
                        .xValue(10.0d)
                        .yValue(10.0d)
                        .build(),
                    "xValue",
                    true))
            .doubleValue());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code yValue}.
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'yValue'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenYValue_thenReturnDoubleValueIsTen() {
    // Arrange
    Meta metaResult = ConstantNodalCurve.meta();

    Builder builderResult = ConstantNodalCurve.builder();

    // Act and Assert
    assertEquals(
        10.0d,
        ((Double)
                metaResult.propertyGet(
                    builderResult
                        .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
                        .xValue(10.0d)
                        .yValue(10.0d)
                        .build(),
                    "yValue",
                    true))
            .doubleValue());
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
            ConstantNodalCurve.meta()
                .propertySet(mock(Bean.class), "metadata", "New Value", false));
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
            ConstantNodalCurve.meta().propertySet(mock(Bean.class), "metadata", "New Value", true));
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
            ConstantNodalCurve.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code xValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'xValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenXValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ConstantNodalCurve.meta().propertySet(mock(Bean.class), "xValue", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yValue}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yValue'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYValue_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> ConstantNodalCurve.meta().propertySet(mock(Bean.class), "yValue", "New Value", true));
  }

  /**
   * Test {@link ConstantNodalCurve#of(CurveMetadata, double, double)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with name is {@code metadata}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantNodalCurve#of(CurveMetadata, double, double)}
   */
  @Test
  @DisplayName(
      "Test of(CurveMetadata, double, double); when CurveName with name is 'metadata'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantNodalCurve ConstantNodalCurve.of(CurveMetadata, double, double)"})
  void testOf_whenCurveNameWithNameIsMetadata_thenThrowIllegalArgumentException() {
    // Arrange
    CurveName curveName = CurveName.of("metadata");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata metadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ConstantNodalCurve.of(metadata, 10.0d, 10.0d));
  }

  /**
   * Test {@link ConstantNodalCurve#of(CurveMetadata, double, double)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then Metadata return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantNodalCurve#of(CurveMetadata, double, double)}
   */
  @Test
  @DisplayName(
      "Test of(CurveMetadata, double, double); when CurveName with 'Name'; then Metadata return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantNodalCurve ConstantNodalCurve.of(CurveMetadata, double, double)"})
  void testOf_whenCurveNameWithName_thenMetadataReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);

    // Act
    ConstantNodalCurve actualOfResult = ConstantNodalCurve.of(metadata, 10.0d, 10.0d);

    // Assert
    CurveMetadata metadata2 = actualOfResult.getMetadata();
    assertTrue(metadata2 instanceof DefaultCurveMetadata);
    assertEquals(1, actualOfResult.getParameterCount());
    assertEquals(10.0d, actualOfResult.getXValue());
    assertEquals(10.0d, actualOfResult.getYValue());
    assertSame(name, actualOfResult.getName());
    assertSame(metadata, metadata2);
  }

  /**
   * Test {@link ConstantNodalCurve#getParameter(int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link ConstantNodalCurve#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); when zero; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantNodalCurve.getParameter(int)"})
  void testGetParameter_whenZero_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d)
            .getParameter(0));
  }

  /**
   * Test {@link ConstantNodalCurve#withParameter(int, double)}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantNodalCurve ConstantNodalCurve.withParameter(int, double)"})
  void testWithParameter() {
    // Arrange
    ConstantNodalCurve ofResult =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d);

    // Act
    ConstantNodalCurve actualWithParameterResult = ofResult.withParameter(0, 10.0d);

    // Assert
    assertEquals(ofResult, actualWithParameterResult);
  }

  /**
   * Test {@link ConstantNodalCurve#withPerturbation(ParameterPerturbation)}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ConstantNodalCurve ConstantNodalCurve.withPerturbation(ParameterPerturbation)"
  })
  void testWithPerturbation() {
    // Arrange
    ConstantNodalCurve ofResult =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    ConstantNodalCurve actualWithPerturbationResult = ofResult.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
    assertEquals(ofResult, actualWithPerturbationResult);
  }

  /**
   * Test {@link ConstantNodalCurve#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantNodalCurve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ConstantNodalCurve ConstantNodalCurve.withPerturbation(ParameterPerturbation)"
  })
  void testWithPerturbation_thenThrowIllegalArgumentException() {
    // Arrange
    ConstantNodalCurve ofResult =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d);

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.withPerturbation(perturbation));
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
  }

  /**
   * Test {@link ConstantNodalCurve#getXValues()}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#getXValues()}
   */
  @Test
  @DisplayName("Test getXValues()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray ConstantNodalCurve.getXValues()"})
  void testGetXValues() {
    // Arrange and Act
    DoubleArray actualXValues =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d)
            .getXValues();

    // Assert
    assertEquals(1, actualXValues.dimensions());
    assertEquals(1, actualXValues.size());
    List<Double> toListResult = actualXValues.toList();
    assertEquals(1, toListResult.size());
    assertEquals(10.0d, actualXValues.max());
    assertEquals(10.0d, actualXValues.min());
    assertEquals(10.0d, actualXValues.sum());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertFalse(actualXValues.isEmpty());
    assertArrayEquals(new double[] {10.0d}, actualXValues.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ConstantNodalCurve#getYValues()}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#getYValues()}
   */
  @Test
  @DisplayName("Test getYValues()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray ConstantNodalCurve.getYValues()"})
  void testGetYValues() {
    // Arrange and Act
    DoubleArray actualYValues =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d)
            .getYValues();

    // Assert
    assertEquals(1, actualYValues.dimensions());
    assertEquals(1, actualYValues.size());
    List<Double> toListResult = actualYValues.toList();
    assertEquals(1, toListResult.size());
    assertEquals(10.0d, actualYValues.max());
    assertEquals(10.0d, actualYValues.min());
    assertEquals(10.0d, actualYValues.sum());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertFalse(actualYValues.isEmpty());
    assertArrayEquals(new double[] {10.0d}, actualYValues.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ConstantNodalCurve#yValue(double)}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#yValue(double)}
   */
  @Test
  @DisplayName("Test yValue(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantNodalCurve.yValue(double)"})
  void testYValue() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d)
            .yValue(2.0d));
  }

  /**
   * Test {@link ConstantNodalCurve#yValueParameterSensitivity(double)}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#yValueParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test yValueParameterSensitivity(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity ConstantNodalCurve.yValueParameterSensitivity(double)"
  })
  void testYValueParameterSensitivity() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    UnitParameterSensitivity actualYValueParameterSensitivityResult =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(name), 10.0d, 10.0d)
            .yValueParameterSensitivity(2.0d);

    // Assert
    ImmutableList<ParameterMetadata> parameterMetadata =
        actualYValueParameterSensitivityResult.getParameterMetadata();
    assertEquals(1, parameterMetadata.size());
    assertTrue(parameterMetadata.get(0) instanceof SimpleCurveParameterMetadata);
    DoubleArray sensitivity = actualYValueParameterSensitivityResult.getSensitivity();
    assertEquals(1, sensitivity.dimensions());
    assertEquals(1, sensitivity.size());
    assertEquals(1, actualYValueParameterSensitivityResult.getParameterCount());
    assertEquals(1, sensitivity.toList().size());
    assertEquals(1.0d, sensitivity.max());
    assertEquals(1.0d, sensitivity.min());
    assertEquals(1.0d, sensitivity.sum());
    assertEquals(1.0d, actualYValueParameterSensitivityResult.total());
    assertFalse(sensitivity.isEmpty());
    assertFalse(actualYValueParameterSensitivityResult.getParameterSplit().isPresent());
    assertSame(name, actualYValueParameterSensitivityResult.getMarketDataName());
    assertArrayEquals(new double[] {1.0d}, sensitivity.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ConstantNodalCurve#firstDerivative(double)}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#firstDerivative(double)}
   */
  @Test
  @DisplayName("Test firstDerivative(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantNodalCurve.firstDerivative(double)"})
  void testFirstDerivative() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d)
            .firstDerivative(2.0d));
  }

  /**
   * Test {@link ConstantNodalCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantNodalCurve ConstantNodalCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata() {
    // Arrange
    ConstantNodalCurve ofResult =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d);

    // Act
    ConstantNodalCurve actualWithMetadataResult =
        ofResult.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(ofResult, actualWithMetadataResult);
  }

  /**
   * Test {@link ConstantNodalCurve#withMetadata(CurveMetadata)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantNodalCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantNodalCurve ConstantNodalCurve.withMetadata(CurveMetadata)"})
  void testWithMetadata_thenThrowIllegalArgumentException() {
    // Arrange
    ConstantNodalCurve ofResult =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d);
    CurveName curveName = CurveName.of("metadata");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata metadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    // Act and Assert
    assertThrows(IllegalArgumentException.class, () -> ofResult.withMetadata(metadata));
  }

  /**
   * Test {@link ConstantNodalCurve#withYValues(DoubleArray)}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#withYValues(DoubleArray)}
   */
  @Test
  @DisplayName("Test withYValues(DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantNodalCurve ConstantNodalCurve.withYValues(DoubleArray)"})
  void testWithYValues() {
    // Arrange
    ConstantNodalCurve ofResult =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d);

    // Act
    ConstantNodalCurve actualWithYValuesResult = ofResult.withYValues(DoubleArray.of(10.0d));

    // Assert
    assertEquals(ofResult, actualWithYValuesResult);
  }

  /**
   * Test {@link ConstantNodalCurve#withValues(DoubleArray, DoubleArray)}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#withValues(DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName("Test withValues(DoubleArray, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConstantNodalCurve ConstantNodalCurve.withValues(DoubleArray, DoubleArray)"})
  void testWithValues() {
    // Arrange
    ConstantNodalCurve ofResult =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d);
    DoubleArray xValues = DoubleArray.of(10.0d);

    // Act
    ConstantNodalCurve actualWithValuesResult = ofResult.withValues(xValues, DoubleArray.of(10.0d));

    // Assert
    assertEquals(ofResult, actualWithValuesResult);
  }

  /**
   * Test {@link ConstantNodalCurve#withNode(double, double, ParameterMetadata)}.
   *
   * <ul>
   *   <li>Then Metadata return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantNodalCurve#withNode(double, double, ParameterMetadata)}
   */
  @Test
  @DisplayName(
      "Test withNode(double, double, ParameterMetadata); then Metadata return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ConstantNodalCurve ConstantNodalCurve.withNode(double, double, ParameterMetadata)"
  })
  void testWithNode_thenMetadataReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");
    ConstantNodalCurve ofResult = ConstantNodalCurve.of(DefaultCurveMetadata.of(name), 2.0d, 10.0d);

    // Act
    ConstantNodalCurve actualWithNodeResult =
        ofResult.withNode(
            2.0d, 3.0d, SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d));

    // Assert
    assertTrue(actualWithNodeResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(1, actualWithNodeResult.getParameterCount());
    assertEquals(2.0d, actualWithNodeResult.getXValue());
    assertEquals(3.0d, actualWithNodeResult.getYValue());
    assertSame(name, actualWithNodeResult.getName());
  }

  /**
   * Test {@link ConstantNodalCurve#createParameterSensitivity(DoubleArray)} with {@code
   * sensitivities}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#createParameterSensitivity(DoubleArray)}
   */
  @Test
  @DisplayName("Test createParameterSensitivity(DoubleArray) with 'sensitivities'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity ConstantNodalCurve.createParameterSensitivity(DoubleArray)"
  })
  void testCreateParameterSensitivityWithSensitivities() {
    // Arrange
    CurveName name = CurveName.of("Name");
    ConstantNodalCurve ofResult =
        ConstantNodalCurve.of(DefaultCurveMetadata.of(name), 10.0d, 10.0d);
    DoubleArray sensitivities = DoubleArray.of(10.0d);

    // Act
    UnitParameterSensitivity actualCreateParameterSensitivityResult =
        ofResult.createParameterSensitivity(sensitivities);

    // Assert
    ImmutableList<ParameterMetadata> parameterMetadata =
        actualCreateParameterSensitivityResult.getParameterMetadata();
    assertEquals(1, parameterMetadata.size());
    assertTrue(parameterMetadata.get(0) instanceof SimpleCurveParameterMetadata);
    assertEquals(1, actualCreateParameterSensitivityResult.getParameterCount());
    assertEquals(10.0d, actualCreateParameterSensitivityResult.total());
    assertFalse(actualCreateParameterSensitivityResult.getParameterSplit().isPresent());
    assertSame(sensitivities, actualCreateParameterSensitivityResult.getSensitivity());
    assertSame(name, actualCreateParameterSensitivityResult.getMarketDataName());
  }

  /**
   * Test {@link ConstantNodalCurve#meta()}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ConstantNodalCurve.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ConstantNodalCurve.meta();

    // Assert
    MetaProperty<CurveMetadata> metadataResult = actualMetaResult.metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<Double> xValueResult = actualMetaResult.xValue();
    assertTrue(xValueResult instanceof DirectMetaProperty);
    MetaProperty<Double> yValueResult = actualMetaResult.yValue();
    assertTrue(yValueResult instanceof DirectMetaProperty);
    assertEquals("double", xValueResult.propertyType().getName());
    assertEquals("double", yValueResult.propertyType().getName());
    assertEquals("metadata", metadataResult.name());
    assertEquals("xValue", xValueResult.name());
    assertEquals("yValue", yValueResult.name());
    assertEquals(PropertyStyle.IMMUTABLE, metadataResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, xValueResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, yValueResult.style());
    assertTrue(actualMetaResult.isBuildable());
    Class<ConstantNodalCurve> expectedDeclaringTypeResult = ConstantNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult, metadataResult.declaringType());
    Class<ConstantNodalCurve> expectedDeclaringTypeResult2 = ConstantNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult2, xValueResult.declaringType());
    Class<ConstantNodalCurve> expectedDeclaringTypeResult3 = ConstantNodalCurve.class;
    assertEquals(expectedDeclaringTypeResult3, yValueResult.declaringType());
    Class<CurveMetadata> expectedPropertyTypeResult = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult, metadataResult.propertyType());
    Meta meta = Meta.INSTANCE;
    assertSame(meta, metadataResult.metaBean());
    assertSame(meta, xValueResult.metaBean());
    assertSame(meta, yValueResult.metaBean());
  }

  /**
   * Test {@link ConstantNodalCurve#metaBean()}.
   *
   * <p>Method under test: {@link ConstantNodalCurve#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ConstantNodalCurve.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        ConstantNodalCurve.of(DefaultCurveMetadata.of(CurveName.of("Name")), 10.0d, 10.0d)
            .metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantNodalCurve#toString()}
   *   <li>{@link ConstantNodalCurve#getMetadata()}
   *   <li>{@link ConstantNodalCurve#getParameterCount()}
   *   <li>{@link ConstantNodalCurve#getXValue()}
   *   <li>{@link ConstantNodalCurve#getYValue()}
   *   <li>{@link ConstantNodalCurve#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveMetadata ConstantNodalCurve.getMetadata()",
    "int ConstantNodalCurve.getParameterCount()",
    "double ConstantNodalCurve.getXValue()",
    "double ConstantNodalCurve.getYValue()",
    "Builder ConstantNodalCurve.toBuilder()",
    "String ConstantNodalCurve.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    ConstantNodalCurve constantNodalCurve =
        builderResult.metadata(metadata).xValue(10.0d).yValue(10.0d).build();

    // Act
    String actualToStringResult = constantNodalCurve.toString();
    CurveMetadata actualMetadata = constantNodalCurve.getMetadata();
    int actualParameterCount = constantNodalCurve.getParameterCount();
    double actualXValue = constantNodalCurve.getXValue();
    double actualYValue = constantNodalCurve.getYValue();
    constantNodalCurve.toBuilder();

    // Assert
    assertEquals(
        "ConstantNodalCurve{metadata=DefaultCurveMetadata{curveName=Name, xValueType=Unknown, yValueType=Unknown,"
            + " info={}, parameterMetadata=null}, xValue=10.0, yValue=10.0}",
        actualToStringResult);
    assertEquals(1, actualParameterCount);
    assertEquals(10.0d, actualXValue);
    assertEquals(10.0d, actualYValue);
    assertSame(metadata, actualMetadata);
  }

  /**
   * Test {@link ConstantNodalCurve#equals(Object)}, and {@link ConstantNodalCurve#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantNodalCurve#equals(Object)}
   *   <li>{@link ConstantNodalCurve#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantNodalCurve.equals(Object)",
    "int ConstantNodalCurve.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve2 =
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(constantNodalCurve, constantNodalCurve2);
    assertEquals(constantNodalCurve.hashCode(), constantNodalCurve2.hashCode());
  }

  /**
   * Test {@link ConstantNodalCurve#equals(Object)}, and {@link ConstantNodalCurve#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ConstantNodalCurve#equals(Object)}
   *   <li>{@link ConstantNodalCurve#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantNodalCurve.equals(Object)",
    "int ConstantNodalCurve.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    // Act and Assert
    assertEquals(constantNodalCurve, constantNodalCurve);
    int expectedHashCodeResult = constantNodalCurve.hashCode();
    assertEquals(expectedHashCodeResult, constantNodalCurve.hashCode());
  }

  /**
   * Test {@link ConstantNodalCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantNodalCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantNodalCurve.equals(Object)",
    "int ConstantNodalCurve.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();

    // Act and Assert
    assertNotEquals(
        constantNodalCurve,
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
  }

  /**
   * Test {@link ConstantNodalCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantNodalCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantNodalCurve.equals(Object)",
    "int ConstantNodalCurve.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(0.5d)
            .yValue(10.0d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();

    // Act and Assert
    assertNotEquals(
        constantNodalCurve,
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
  }

  /**
   * Test {@link ConstantNodalCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantNodalCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantNodalCurve.equals(Object)",
    "int ConstantNodalCurve.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();
    ConstantNodalCurve constantNodalCurve =
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(0.5d)
            .build();

    Builder builderResult2 = ConstantNodalCurve.builder();

    // Act and Assert
    assertNotEquals(
        constantNodalCurve,
        builderResult2
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build());
  }

  /**
   * Test {@link ConstantNodalCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantNodalCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantNodalCurve.equals(Object)",
    "int ConstantNodalCurve.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();

    // Act and Assert
    assertNotEquals(
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build(),
        null);
  }

  /**
   * Test {@link ConstantNodalCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ConstantNodalCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ConstantNodalCurve.equals(Object)",
    "int ConstantNodalCurve.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = ConstantNodalCurve.builder();

    // Act and Assert
    assertNotEquals(
        builderResult
            .metadata(DefaultCurveMetadata.of(CurveName.of("Name")))
            .xValue(10.0d)
            .yValue(10.0d)
            .build(),
        "Different type to ConstantNodalCurve");
  }
}
