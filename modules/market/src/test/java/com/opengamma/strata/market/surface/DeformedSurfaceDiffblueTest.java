package com.opengamma.strata.market.surface;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.tuple.DoublesPair;
import com.opengamma.strata.market.surface.DeformedSurface.Builder;
import com.opengamma.strata.market.surface.DeformedSurface.Meta;
import com.opengamma.strata.math.impl.function.ConcatenatedVectorFunction;
import com.opengamma.strata.math.impl.function.ParameterizedCurve;
import com.opengamma.strata.math.impl.function.ParameterizedCurveVectorFunction;
import com.opengamma.strata.math.impl.function.VectorFunction;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.PropertyStyle;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DeformedSurfaceDiffblueTest {
  /**
   * Test Builder {@link Builder#deformationFunction(Function)}.
   *
   * <ul>
   *   <li>When {@link Function}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#deformationFunction(Function)}
   */
  @Test
  @DisplayName("Test Builder deformationFunction(Function); when Function; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.deformationFunction(Function)"})
  void testBuilderDeformationFunction_whenFunction_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DeformedSurface.builder();

    // Act
    Builder actualDeformationFunctionResult =
        builderResult.deformationFunction(mock(Function.class));

    // Assert
    assertSame(builderResult, actualDeformationFunctionResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code deformationFunction}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'deformationFunction'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDeformationFunction_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(DeformedSurface.builder().get("deformationFunction"));
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
    assertNull(DeformedSurface.builder().get("metadata"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code originalSurface}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'originalSurface'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenOriginalSurface_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(DeformedSurface.builder().get("originalSurface"));
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
        NoSuchElementException.class, () -> DeformedSurface.builder().get("Property Name"));
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
    Builder builderResult = DeformedSurface.builder();

    // Act
    Builder actualMetadataResult =
        builderResult.metadata(DefaultSurfaceMetadata.of(SurfaceName.of("Name")));

    // Assert
    assertSame(builderResult, actualMetadataResult);
  }

  /**
   * Test Builder {@link Builder#originalSurface(Surface)}.
   *
   * <ul>
   *   <li>When {@link SurfaceName} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#originalSurface(Surface)}
   */
  @Test
  @DisplayName(
      "Test Builder originalSurface(Surface); when SurfaceName with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.originalSurface(Surface)"})
  void testBuilderOriginalSurface_whenSurfaceNameWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DeformedSurface.builder();

    // Act
    Builder actualOriginalSurfaceResult =
        builderResult.originalSurface(
            ConstantSurface.of(DefaultSurfaceMetadata.of(SurfaceName.of("Name")), 10.0d));

    // Assert
    assertSame(builderResult, actualOriginalSurfaceResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; given ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_givenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DeformedSurface.builder();

    ParameterizedCurve curve = mock(ParameterizedCurve.class);
    when(curve.getNumberOfParameters()).thenReturn(10);
    ParameterizedCurveVectorFunction parameterizedCurveVectorFunction =
        new ParameterizedCurveVectorFunction(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, curve);
    VectorFunction[] functions = new VectorFunction[] {parameterizedCurveVectorFunction};
    ConcatenatedVectorFunction concatenatedVectorFunction =
        new ConcatenatedVectorFunction(functions);

    // Act
    Builder actualSetResult = builderResult.set("deformationFunction", concatenatedVectorFunction);

    // Assert
    verify(curve).getNumberOfParameters();
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
        () -> DeformedSurface.builder().set("Property Name", "New Value"));
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
    Builder builderResult = DeformedSurface.builder();

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
    Class<? extends DeformedSurface> actualBeanTypeResult = DeformedSurface.meta().beanType();

    // Assert
    Class<DeformedSurface> expectedBeanTypeResult = DeformedSurface.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#deformationFunction()}
   *   <li>{@link Meta#metadata()}
   *   <li>{@link Meta#originalSurface()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.deformationFunction()",
    "MetaProperty Meta.metadata()",
    "MetaProperty Meta.originalSurface()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = DeformedSurface.meta();

    // Act
    MetaProperty<Function<DoublesPair, ValueDerivatives>> actualDeformationFunctionResult =
        metaResult.deformationFunction();
    MetaProperty<SurfaceMetadata> actualMetadataResult = metaResult.metadata();

    // Assert
    assertTrue(actualDeformationFunctionResult instanceof DirectMetaProperty);
    assertTrue(actualMetadataResult instanceof DirectMetaProperty);
    assertTrue(metaResult.originalSurface() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code deformationFunction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'deformationFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsDeformationFunction() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DeformedSurface.meta().metaPropertyGet("deformationFunction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<Surface> originalSurfaceResult = ((Meta) metaBeanResult).originalSurface();
    assertTrue(originalSurfaceResult instanceof DirectMetaProperty);
    assertEquals("deformationFunction", actualMetaPropertyGetResult.name());
    Class<Function> expectedPropertyTypeResult = Function.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).deformationFunction());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, originalSurfaceResult.metaBean());
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
        DeformedSurface.meta().metaPropertyGet("metadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Function<DoublesPair, ValueDerivatives>> deformationFunctionResult =
        ((Meta) metaBeanResult).deformationFunction();
    assertTrue(deformationFunctionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Surface> originalSurfaceResult = ((Meta) metaBeanResult).originalSurface();
    assertTrue(originalSurfaceResult instanceof DirectMetaProperty);
    assertEquals("metadata", actualMetaPropertyGetResult.name());
    Class<SurfaceMetadata> expectedPropertyTypeResult = SurfaceMetadata.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).metadata());
    assertSame(metaBeanResult, deformationFunctionResult.metaBean());
    assertSame(metaBeanResult, originalSurfaceResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code originalSurface}.
   *   <li>Then return name is {@code originalSurface}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'originalSurface'; then return name is 'originalSurface'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenOriginalSurface_thenReturnNameIsOriginalSurface() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DeformedSurface.meta().metaPropertyGet("originalSurface");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<Function<DoublesPair, ValueDerivatives>> deformationFunctionResult =
        ((Meta) metaBeanResult).deformationFunction();
    assertTrue(deformationFunctionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<SurfaceMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    assertEquals("originalSurface", actualMetaPropertyGetResult.name());
    Class<Surface> expectedPropertyTypeResult = Surface.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).originalSurface());
    assertSame(metaBeanResult, deformationFunctionResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
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
    assertNull(DeformedSurface.meta().metaPropertyGet("Property Name"));
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
        DeformedSurface.meta().metaPropertyMap();

    // Assert
    assertEquals(3, actualMetaPropertyMapResult.size());
    MetaProperty<?> getResult = actualMetaPropertyMapResult.get("metadata");
    MetaBean metaBeanResult = getResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<?> getResult2 = actualMetaPropertyMapResult.get("deformationFunction");
    assertTrue(getResult2 instanceof DirectMetaProperty);
    assertTrue(getResult instanceof DirectMetaProperty);
    MetaProperty<?> getResult3 = actualMetaPropertyMapResult.get("originalSurface");
    assertTrue(getResult3 instanceof DirectMetaProperty);
    assertEquals("deformationFunction", getResult2.name());
    assertEquals("metadata", getResult.name());
    assertEquals("originalSurface", getResult3.name());
    assertEquals(PropertyStyle.IMMUTABLE, getResult2.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult.style());
    assertEquals(PropertyStyle.IMMUTABLE, getResult3.style());
    Class<DeformedSurface> expectedDeclaringTypeResult = DeformedSurface.class;
    assertEquals(expectedDeclaringTypeResult, getResult2.declaringType());
    Class<DeformedSurface> expectedDeclaringTypeResult2 = DeformedSurface.class;
    assertEquals(expectedDeclaringTypeResult2, getResult.declaringType());
    Class<DeformedSurface> expectedDeclaringTypeResult3 = DeformedSurface.class;
    assertEquals(expectedDeclaringTypeResult3, getResult3.declaringType());
    Class<Surface> expectedPropertyTypeResult = Surface.class;
    assertEquals(expectedPropertyTypeResult, getResult3.propertyType());
    Class<SurfaceMetadata> expectedPropertyTypeResult2 = SurfaceMetadata.class;
    assertEquals(expectedPropertyTypeResult2, getResult.propertyType());
    Class<Function> expectedPropertyTypeResult3 = Function.class;
    assertEquals(expectedPropertyTypeResult3, getResult2.propertyType());
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
    // Arrange, Act and Assert
    assertNull(DeformedSurface.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> DeformedSurface.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code deformationFunction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'deformationFunction'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDeformationFunction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DeformedSurface.meta()
                .propertySet(mock(Bean.class), "deformationFunction", "New Value", true));
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
            DeformedSurface.meta()
                .propertySet(mock(Bean.class), "deformationFunction", "New Value", false));
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
        () -> DeformedSurface.meta().propertySet(mock(Bean.class), "metadata", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code originalSurface}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'originalSurface'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenOriginalSurface_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DeformedSurface.meta()
                .propertySet(mock(Bean.class), "originalSurface", "New Value", true));
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
            DeformedSurface.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
