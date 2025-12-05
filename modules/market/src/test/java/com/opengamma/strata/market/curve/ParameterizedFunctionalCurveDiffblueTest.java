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
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.ParameterizedFunctionalCurve.Builder;
import com.opengamma.strata.market.curve.ParameterizedFunctionalCurve.Meta;
import com.opengamma.strata.market.param.ParameterMetadata;
import com.opengamma.strata.market.param.ParameterPerturbation;
import com.opengamma.strata.market.param.UnitParameterSensitivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ParameterizedFunctionalCurveDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ParameterizedFunctionalCurve Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange
    BiFunction<DoubleArray, Double, Double> derivativeFunction = mock(BiFunction.class);

    // Act
    Builder actualDerivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(derivativeFunction);
    CurveName name = CurveName.of("Name");
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(name);
    Builder actualMetadataResult = actualDerivativeFunctionResult.metadata(metadata);
    BiFunction<DoubleArray, Double, DoubleArray> sensitivityFunction = mock(BiFunction.class);
    BiFunction<DoubleArray, Double, Double> valueFunction = mock(BiFunction.class);
    ParameterizedFunctionalCurve actualParameterizedFunctionalCurve =
        actualMetadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(sensitivityFunction)
            .valueFunction(valueFunction)
            .build();

    // Assert
    assertEquals(0, actualParameterizedFunctionalCurve.getParameterCount());
    assertSame(name, actualParameterizedFunctionalCurve.getName());
    assertSame(metadata, actualParameterizedFunctionalCurve.getMetadata());
    assertSame(DoubleArray.EMPTY, actualParameterizedFunctionalCurve.getParameters());
    assertSame(derivativeFunction, actualParameterizedFunctionalCurve.getDerivativeFunction());
    assertSame(sensitivityFunction, actualParameterizedFunctionalCurve.getSensitivityFunction());
    assertSame(valueFunction, actualParameterizedFunctionalCurve.getValueFunction());
  }

  /**
   * Test Builder {@link Builder#derivativeFunction(BiFunction)}.
   *
   * <ul>
   *   <li>When {@link BiFunction}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#derivativeFunction(BiFunction)}
   */
  @Test
  @DisplayName("Test Builder derivativeFunction(BiFunction); when BiFunction; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.derivativeFunction(BiFunction)"})
  void testBuilderDerivativeFunction_whenBiFunction_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurve.builder();

    // Act
    Builder actualDerivativeFunctionResult =
        builderResult.derivativeFunction(mock(BiFunction.class));

    // Assert
    assertSame(builderResult, actualDerivativeFunctionResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code derivativeFunction}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'derivativeFunction'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDerivativeFunction_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ParameterizedFunctionalCurve.builder().get("derivativeFunction"));
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
    assertNull(ParameterizedFunctionalCurve.builder().get("metadata"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'parameters'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenParameters_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ParameterizedFunctionalCurve.builder().get("parameters"));
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
        () -> ParameterizedFunctionalCurve.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code sensitivityFunction}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'sensitivityFunction'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenSensitivityFunction_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ParameterizedFunctionalCurve.builder().get("sensitivityFunction"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code valueFunction}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'valueFunction'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenValueFunction_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ParameterizedFunctionalCurve.builder().get("valueFunction"));
  }

  /**
   * Test Builder {@link Builder#metadata(CurveMetadata)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#metadata(CurveMetadata)}
   */
  @Test
  @DisplayName(
      "Test Builder metadata(CurveMetadata); when CurveName with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.metadata(CurveMetadata)"})
  void testBuilderMetadata_whenCurveNameWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurve.builder();

    // Act
    Builder actualMetadataResult =
        builderResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertSame(builderResult, actualMetadataResult);
  }

  /**
   * Test Builder {@link Builder#parameters(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameters(DoubleArray)}
   */
  @Test
  @DisplayName("Test Builder parameters(DoubleArray); when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameters(DoubleArray)"})
  void testBuilderParameters_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurve.builder();

    // Act
    Builder actualParametersResult = builderResult.parameters(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualParametersResult);
  }

  /**
   * Test Builder {@link Builder#sensitivityFunction(BiFunction)}.
   *
   * <ul>
   *   <li>When {@link BiFunction}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#sensitivityFunction(BiFunction)}
   */
  @Test
  @DisplayName("Test Builder sensitivityFunction(BiFunction); when BiFunction; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.sensitivityFunction(BiFunction)"})
  void testBuilderSensitivityFunction_whenBiFunction_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurve.builder();

    // Act
    Builder actualSensitivityFunctionResult =
        builderResult.sensitivityFunction(mock(BiFunction.class));

    // Assert
    assertSame(builderResult, actualSensitivityFunctionResult);
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
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> ParameterizedFunctionalCurve.builder().set("Property Name", "New Value"));
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
    Builder builderResult = ParameterizedFunctionalCurve.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#valueFunction(BiFunction)}.
   *
   * <ul>
   *   <li>When {@link BiFunction}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valueFunction(BiFunction)}
   */
  @Test
  @DisplayName("Test Builder valueFunction(BiFunction); when BiFunction; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valueFunction(BiFunction)"})
  void testBuilderValueFunction_whenBiFunction_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurve.builder();

    // Act
    Builder actualValueFunctionResult = builderResult.valueFunction(mock(BiFunction.class));

    // Assert
    assertSame(builderResult, actualValueFunctionResult);
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
    Class<? extends ParameterizedFunctionalCurve> actualBeanTypeResult =
        ParameterizedFunctionalCurve.meta().beanType();

    // Assert
    Class<ParameterizedFunctionalCurve> expectedBeanTypeResult = ParameterizedFunctionalCurve.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#derivativeFunction()}
   *   <li>{@link Meta#metadata()}
   *   <li>{@link Meta#parameters()}
   *   <li>{@link Meta#sensitivityFunction()}
   *   <li>{@link Meta#valueFunction()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.derivativeFunction()",
    "MetaProperty Meta.metadata()",
    "MetaProperty Meta.parameters()",
    "MetaProperty Meta.sensitivityFunction()",
    "MetaProperty Meta.valueFunction()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ParameterizedFunctionalCurve.meta();

    // Act
    MetaProperty<BiFunction<DoubleArray, Double, Double>> actualDerivativeFunctionResult =
        metaResult.derivativeFunction();
    MetaProperty<CurveMetadata> actualMetadataResult = metaResult.metadata();
    MetaProperty<DoubleArray> actualParametersResult = metaResult.parameters();
    MetaProperty<BiFunction<DoubleArray, Double, DoubleArray>> actualSensitivityFunctionResult =
        metaResult.sensitivityFunction();

    // Assert
    assertTrue(actualDerivativeFunctionResult instanceof DirectMetaProperty);
    assertTrue(actualMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualParametersResult instanceof DirectMetaProperty);
    assertTrue(actualSensitivityFunctionResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valueFunction() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code derivativeFunction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'derivativeFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsDerivativeFunction() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ParameterizedFunctionalCurve.meta().metaPropertyGet("derivativeFunction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> parametersResult = ((Meta) metaBeanResult).parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    MetaProperty<BiFunction<DoubleArray, Double, DoubleArray>> sensitivityFunctionResult =
        ((Meta) metaBeanResult).sensitivityFunction();
    assertTrue(sensitivityFunctionResult instanceof DirectMetaProperty);
    MetaProperty<BiFunction<DoubleArray, Double, Double>> valueFunctionResult =
        ((Meta) metaBeanResult).valueFunction();
    assertTrue(valueFunctionResult instanceof DirectMetaProperty);
    assertEquals("derivativeFunction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).derivativeFunction());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, parametersResult.metaBean());
    assertSame(metaBeanResult, sensitivityFunctionResult.metaBean());
    assertSame(metaBeanResult, valueFunctionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code sensitivityFunction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'sensitivityFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsSensitivityFunction() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ParameterizedFunctionalCurve.meta().metaPropertyGet("sensitivityFunction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BiFunction<DoubleArray, Double, Double>> derivativeFunctionResult =
        ((Meta) metaBeanResult).derivativeFunction();
    assertTrue(derivativeFunctionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> parametersResult = ((Meta) metaBeanResult).parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    MetaProperty<BiFunction<DoubleArray, Double, Double>> valueFunctionResult =
        ((Meta) metaBeanResult).valueFunction();
    assertTrue(valueFunctionResult instanceof DirectMetaProperty);
    assertEquals("sensitivityFunction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).sensitivityFunction());
    assertSame(metaBeanResult, derivativeFunctionResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, parametersResult.metaBean());
    assertSame(metaBeanResult, valueFunctionResult.metaBean());
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
        ParameterizedFunctionalCurve.meta().metaPropertyGet("metadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BiFunction<DoubleArray, Double, Double>> derivativeFunctionResult =
        ((Meta) metaBeanResult).derivativeFunction();
    assertTrue(derivativeFunctionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> parametersResult = ((Meta) metaBeanResult).parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    MetaProperty<BiFunction<DoubleArray, Double, DoubleArray>> sensitivityFunctionResult =
        ((Meta) metaBeanResult).sensitivityFunction();
    assertTrue(sensitivityFunctionResult instanceof DirectMetaProperty);
    MetaProperty<BiFunction<DoubleArray, Double, Double>> valueFunctionResult =
        ((Meta) metaBeanResult).valueFunction();
    assertTrue(valueFunctionResult instanceof DirectMetaProperty);
    assertEquals("metadata", actualMetaPropertyGetResult.name());
    Class<CurveMetadata> expectedPropertyTypeResult = CurveMetadata.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).metadata());
    assertSame(metaBeanResult, derivativeFunctionResult.metaBean());
    assertSame(metaBeanResult, parametersResult.metaBean());
    assertSame(metaBeanResult, sensitivityFunctionResult.metaBean());
    assertSame(metaBeanResult, valueFunctionResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then return name is {@code parameters}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'parameters'; then return name is 'parameters'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenParameters_thenReturnNameIsParameters() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ParameterizedFunctionalCurve.meta().metaPropertyGet("parameters");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BiFunction<DoubleArray, Double, Double>> derivativeFunctionResult =
        ((Meta) metaBeanResult).derivativeFunction();
    assertTrue(derivativeFunctionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<BiFunction<DoubleArray, Double, DoubleArray>> sensitivityFunctionResult =
        ((Meta) metaBeanResult).sensitivityFunction();
    assertTrue(sensitivityFunctionResult instanceof DirectMetaProperty);
    MetaProperty<BiFunction<DoubleArray, Double, Double>> valueFunctionResult =
        ((Meta) metaBeanResult).valueFunction();
    assertTrue(valueFunctionResult instanceof DirectMetaProperty);
    assertEquals("parameters", actualMetaPropertyGetResult.name());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).parameters());
    assertSame(metaBeanResult, derivativeFunctionResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, sensitivityFunctionResult.metaBean());
    assertSame(metaBeanResult, valueFunctionResult.metaBean());
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
    assertNull(ParameterizedFunctionalCurve.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valueFunction}.
   *   <li>Then return name is {@code valueFunction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valueFunction'; then return name is 'valueFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValueFunction_thenReturnNameIsValueFunction() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ParameterizedFunctionalCurve.meta().metaPropertyGet("valueFunction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<BiFunction<DoubleArray, Double, Double>> derivativeFunctionResult =
        ((Meta) metaBeanResult).derivativeFunction();
    assertTrue(derivativeFunctionResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> parametersResult = ((Meta) metaBeanResult).parameters();
    assertTrue(parametersResult instanceof DirectMetaProperty);
    MetaProperty<BiFunction<DoubleArray, Double, DoubleArray>> sensitivityFunctionResult =
        ((Meta) metaBeanResult).sensitivityFunction();
    assertTrue(sensitivityFunctionResult instanceof DirectMetaProperty);
    assertEquals("valueFunction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valueFunction());
    assertSame(metaBeanResult, derivativeFunctionResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, parametersResult.metaBean());
    assertSame(metaBeanResult, sensitivityFunctionResult.metaBean());
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
        ParameterizedFunctionalCurve.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("derivativeFunction") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("metadata") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("parameters") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("sensitivityFunction") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("valueFunction") instanceof DirectMetaProperty);
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
    Meta metaResult = ParameterizedFunctionalCurve.meta();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    Builder metadataResult = derivativeFunctionResult.metadata(metadata);

    // Act and Assert
    assertSame(
        metadata,
        metaResult.propertyGet(
            metadataResult
                .parameters(DoubleArray.of())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .build(),
            "metadata",
            true));
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
        ParameterizedFunctionalCurve.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code derivativeFunction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'derivativeFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDerivativeFunction() {
    // Arrange
    Meta metaResult = ParameterizedFunctionalCurve.meta();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve bean =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    metaResult.propertyGet(bean, "derivativeFunction", true);

    // Assert that nothing has changed
    assertSame(DoubleArray.EMPTY, bean.getParameters());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'parameters'; then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenParameters_thenReturnEmpty() {
    // Arrange
    Meta metaResult = ParameterizedFunctionalCurve.meta();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve bean =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "parameters", true);

    // Assert
    DoubleArray doubleArray = ((DoubleArray) actualPropertyGetResult).EMPTY;
    assertSame(doubleArray, bean.getParameters());
    assertSame(doubleArray, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> ParameterizedFunctionalCurve.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivityFunction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'sensitivityFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenSensitivityFunction() {
    // Arrange
    Meta metaResult = ParameterizedFunctionalCurve.meta();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve bean =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    metaResult.propertyGet(bean, "sensitivityFunction", true);

    // Assert that nothing has changed
    assertSame(DoubleArray.EMPTY, bean.getParameters());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code valueFunction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'valueFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenValueFunction() {
    // Arrange
    Meta metaResult = ParameterizedFunctionalCurve.meta();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve bean =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    metaResult.propertyGet(bean, "valueFunction", true);

    // Assert that nothing has changed
    assertSame(DoubleArray.EMPTY, bean.getParameters());
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code derivativeFunction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'derivativeFunction'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDerivativeFunction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ParameterizedFunctionalCurve.meta()
                .propertySet(mock(Bean.class), "derivativeFunction", "New Value", true));
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
            ParameterizedFunctionalCurve.meta()
                .propertySet(mock(Bean.class), "derivativeFunction", "New Value", false));
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
            ParameterizedFunctionalCurve.meta()
                .propertySet(mock(Bean.class), "metadata", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code parameters}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'parameters'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenParameters_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ParameterizedFunctionalCurve.meta()
                .propertySet(mock(Bean.class), "parameters", "New Value", true));
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
            ParameterizedFunctionalCurve.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivityFunction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'sensitivityFunction'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSensitivityFunction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ParameterizedFunctionalCurve.meta()
                .propertySet(mock(Bean.class), "sensitivityFunction", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valueFunction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valueFunction'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValueFunction_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ParameterizedFunctionalCurve.meta()
                .propertySet(mock(Bean.class), "valueFunction", "New Value", true));
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#of(CurveMetadata, DoubleArray, BiFunction, BiFunction,
   * BiFunction)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return ParameterCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#of(CurveMetadata, DoubleArray,
   * BiFunction, BiFunction, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test of(CurveMetadata, DoubleArray, BiFunction, BiFunction, BiFunction); when DoubleArray with value is ten; then return ParameterCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.of(CurveMetadata, DoubleArray, BiFunction, BiFunction, BiFunction)"
  })
  void testOf_whenDoubleArrayWithValueIsTen_thenReturnParameterCountIsOne() {
    // Arrange
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    DoubleArray parameters = DoubleArray.of(10.0d);

    // Act
    ParameterizedFunctionalCurve actualOfResult =
        ParameterizedFunctionalCurve.of(
            metadata,
            parameters,
            mock(BiFunction.class),
            mock(BiFunction.class),
            mock(BiFunction.class));

    // Assert
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(1, actualOfResult.getParameterCount());
    assertSame(parameters, actualOfResult.getParameters());
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#of(CurveMetadata, DoubleArray, BiFunction, BiFunction,
   * BiFunction)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return ParameterCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#of(CurveMetadata, DoubleArray,
   * BiFunction, BiFunction, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test of(CurveMetadata, DoubleArray, BiFunction, BiFunction, BiFunction); when DoubleArray; then return ParameterCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.of(CurveMetadata, DoubleArray, BiFunction, BiFunction, BiFunction)"
  })
  void testOf_whenDoubleArray_thenReturnParameterCountIsZero() {
    // Arrange
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act
    ParameterizedFunctionalCurve actualOfResult =
        ParameterizedFunctionalCurve.of(
            metadata,
            DoubleArray.of(),
            mock(BiFunction.class),
            mock(BiFunction.class),
            mock(BiFunction.class));

    // Assert
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(0, actualOfResult.getParameterCount());
    assertSame(DoubleArray.EMPTY, actualOfResult.getParameters());
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#of(CurveMetadata, DoubleArray, BiFunction, BiFunction,
   * BiFunction)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return ParameterCount is three.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#of(CurveMetadata, DoubleArray,
   * BiFunction, BiFunction, BiFunction)}
   */
  @Test
  @DisplayName(
      "Test of(CurveMetadata, DoubleArray, BiFunction, BiFunction, BiFunction); when filled three; then return ParameterCount is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.of(CurveMetadata, DoubleArray, BiFunction, BiFunction, BiFunction)"
  })
  void testOf_whenFilledThree_thenReturnParameterCountIsThree() {
    // Arrange
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    DoubleArray parameters = DoubleArray.filled(3);

    // Act
    ParameterizedFunctionalCurve actualOfResult =
        ParameterizedFunctionalCurve.of(
            metadata,
            parameters,
            mock(BiFunction.class),
            mock(BiFunction.class),
            mock(BiFunction.class));

    // Assert
    assertTrue(actualOfResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(3, actualOfResult.getParameterCount());
    assertSame(parameters, actualOfResult.getParameters());
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#getParameterCount()}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#getParameterCount()}
   */
  @Test
  @DisplayName("Test getParameterCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ParameterizedFunctionalCurve.getParameterCount()"})
  void testGetParameterCount() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertEquals(
        0,
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build()
            .getParameterCount());
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#getParameter(int)}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#getParameter(int)}
   */
  @Test
  @DisplayName("Test getParameter(int); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ParameterizedFunctionalCurve.getParameter(int)"})
  void testGetParameter_thenReturnZero() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertEquals(
        0.0d,
        metadataResult
            .parameters(DoubleArray.filled(3))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build()
            .getParameter(1));
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#withParameter(int, double)}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.withParameter(int, double)"
  })
  void testWithParameter() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of(10.0d))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    ParameterizedFunctionalCurve actualWithParameterResult =
        parameterizedFunctionalCurve.withParameter(0, 10.0d);

    // Assert
    assertEquals(parameterizedFunctionalCurve, actualWithParameterResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#withParameter(int, double)}.
   *
   * <ul>
   *   <li>Then Metadata return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#withParameter(int, double)}
   */
  @Test
  @DisplayName("Test withParameter(int, double); then Metadata return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.withParameter(int, double)"
  })
  void testWithParameter_thenMetadataReturnDefaultCurveMetadata() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    ParameterizedFunctionalCurve actualWithParameterResult =
        metadataResult
            .parameters(DoubleArray.filled(3))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build()
            .withParameter(1, 10.0d);

    // Assert
    assertTrue(actualWithParameterResult.getMetadata() instanceof DefaultCurveMetadata);
    DoubleArray parameters = actualWithParameterResult.getParameters();
    assertEquals(0.0d, parameters.min());
    List<Double> toListResult = parameters.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(3, parameters.size());
    assertEquals(3, actualWithParameterResult.getParameterCount());
    assertArrayEquals(new double[] {0.0d, 10.0d, 0.0d}, parameters.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#withPerturbation(ParameterPerturbation)}.
   *
   * <p>Method under test: {@link
   * ParameterizedFunctionalCurve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.withPerturbation(ParameterPerturbation)"
  })
  void testWithPerturbation() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    ParameterizedFunctionalCurve actualWithPerturbationResult =
        parameterizedFunctionalCurve.withPerturbation(mock(ParameterPerturbation.class));

    // Assert
    assertEquals(parameterizedFunctionalCurve, actualWithPerturbationResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#withPerturbation(ParameterPerturbation)}.
   *
   * <p>Method under test: {@link
   * ParameterizedFunctionalCurve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName("Test withPerturbation(ParameterPerturbation)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.withPerturbation(ParameterPerturbation)"
  })
  void testWithPerturbation2() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of(10.0d))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    ParameterizedFunctionalCurve actualWithPerturbationResult =
        parameterizedFunctionalCurve.withPerturbation(perturbation);

    // Assert
    verify(perturbation).perturbParameter(eq(0), eq(10.0d), isA(ParameterMetadata.class));
    assertEquals(parameterizedFunctionalCurve, actualWithPerturbationResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#withPerturbation(ParameterPerturbation)}.
   *
   * <ul>
   *   <li>Then Metadata return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ParameterizedFunctionalCurve#withPerturbation(ParameterPerturbation)}
   */
  @Test
  @DisplayName(
      "Test withPerturbation(ParameterPerturbation); then Metadata return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.withPerturbation(ParameterPerturbation)"
  })
  void testWithPerturbation_thenMetadataReturnDefaultCurveMetadata() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.filled(3))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    ParameterPerturbation perturbation = mock(ParameterPerturbation.class);
    when(perturbation.perturbParameter(anyInt(), anyDouble(), Mockito.<ParameterMetadata>any()))
        .thenReturn(10.0d);

    // Act
    ParameterizedFunctionalCurve actualWithPerturbationResult =
        parameterizedFunctionalCurve.withPerturbation(perturbation);

    // Assert
    verify(perturbation, atLeast(1))
        .perturbParameter(anyInt(), eq(0.0d), isA(ParameterMetadata.class));
    assertTrue(actualWithPerturbationResult.getMetadata() instanceof DefaultCurveMetadata);
    DoubleArray parameters = actualWithPerturbationResult.getParameters();
    List<Double> toListResult = parameters.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, parameters.size());
    assertEquals(3, actualWithPerturbationResult.getParameterCount());
    assertEquals(30.0d, parameters.sum());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, parameters.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#yValue(double)}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#yValue(double)}
   */
  @Test
  @DisplayName("Test yValue(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ParameterizedFunctionalCurve.yValue(double)"})
  void testYValue() {
    // Arrange
    BiFunction<DoubleArray, Double, Double> valueFunction = mock(BiFunction.class);
    when(valueFunction.apply(Mockito.<DoubleArray>any(), Mockito.<Double>any())).thenReturn(10.0d);

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    double actualYValueResult =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(valueFunction)
            .build()
            .yValue(2.0d);

    // Assert
    verify(valueFunction).apply(isA(DoubleArray.class), eq(2.0d));
    assertEquals(10.0d, actualYValueResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#yValueParameterSensitivity(double)}.
   *
   * <ul>
   *   <li>Then return ParameterCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#yValueParameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test yValueParameterSensitivity(double); then return ParameterCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity ParameterizedFunctionalCurve.yValueParameterSensitivity(double)"
  })
  void testYValueParameterSensitivity_thenReturnParameterCountIsZero() {
    // Arrange
    BiFunction<DoubleArray, Double, DoubleArray> sensitivityFunction = mock(BiFunction.class);
    when(sensitivityFunction.apply(Mockito.<DoubleArray>any(), Mockito.<Double>any()))
        .thenReturn(DoubleArray.of());

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));
    CurveName name = CurveName.of("Name");

    Builder metadataResult = derivativeFunctionResult.metadata(DefaultCurveMetadata.of(name));

    // Act
    UnitParameterSensitivity actualYValueParameterSensitivityResult =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(sensitivityFunction)
            .valueFunction(mock(BiFunction.class))
            .build()
            .yValueParameterSensitivity(2.0d);

    // Assert
    verify(sensitivityFunction).apply(isA(DoubleArray.class), eq(2.0d));
    assertEquals(0, actualYValueParameterSensitivityResult.getParameterCount());
    assertEquals(0.0d, actualYValueParameterSensitivityResult.total());
    assertFalse(actualYValueParameterSensitivityResult.getParameterSplit().isPresent());
    assertTrue(actualYValueParameterSensitivityResult.getParameterMetadata().isEmpty());
    assertSame(name, actualYValueParameterSensitivityResult.getMarketDataName());
    assertSame(DoubleArray.EMPTY, actualYValueParameterSensitivityResult.getSensitivity());
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#firstDerivative(double)}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#firstDerivative(double)}
   */
  @Test
  @DisplayName("Test firstDerivative(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ParameterizedFunctionalCurve.firstDerivative(double)"})
  void testFirstDerivative() {
    // Arrange
    BiFunction<DoubleArray, Double, Double> derivativeFunction = mock(BiFunction.class);
    when(derivativeFunction.apply(Mockito.<DoubleArray>any(), Mockito.<Double>any()))
        .thenReturn(10.0d);

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(derivativeFunction);

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act
    double actualFirstDerivativeResult =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build()
            .firstDerivative(2.0d);

    // Assert
    verify(derivativeFunction).apply(isA(DoubleArray.class), eq(2.0d));
    assertEquals(10.0d, actualFirstDerivativeResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.withMetadata(CurveMetadata)"
  })
  void testWithMetadata() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    ParameterizedFunctionalCurve actualWithMetadataResult =
        parameterizedFunctionalCurve.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(parameterizedFunctionalCurve, actualWithMetadataResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.withMetadata(CurveMetadata)"
  })
  void testWithMetadata2() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.filled(3))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    ParameterizedFunctionalCurve actualWithMetadataResult =
        parameterizedFunctionalCurve.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(parameterizedFunctionalCurve, actualWithMetadataResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#withMetadata(CurveMetadata)}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#withMetadata(CurveMetadata)}
   */
  @Test
  @DisplayName("Test withMetadata(CurveMetadata)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.withMetadata(CurveMetadata)"
  })
  void testWithMetadata3() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of(10.0d))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    ParameterizedFunctionalCurve actualWithMetadataResult =
        parameterizedFunctionalCurve.withMetadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertEquals(parameterizedFunctionalCurve, actualWithMetadataResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#withParameters(DoubleArray)}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#withParameters(DoubleArray)}
   */
  @Test
  @DisplayName("Test withParameters(DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.withParameters(DoubleArray)"
  })
  void testWithParameters() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    ParameterizedFunctionalCurve actualWithParametersResult =
        parameterizedFunctionalCurve.withParameters(DoubleArray.of());

    // Assert
    assertEquals(parameterizedFunctionalCurve, actualWithParametersResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#withParameters(DoubleArray)}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#withParameters(DoubleArray)}
   */
  @Test
  @DisplayName("Test withParameters(DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.withParameters(DoubleArray)"
  })
  void testWithParameters2() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.filled(3))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    ParameterizedFunctionalCurve actualWithParametersResult =
        parameterizedFunctionalCurve.withParameters(DoubleArray.filled(3));

    // Assert
    assertEquals(parameterizedFunctionalCurve, actualWithParametersResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#withParameters(DoubleArray)}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#withParameters(DoubleArray)}
   */
  @Test
  @DisplayName("Test withParameters(DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurve.withParameters(DoubleArray)"
  })
  void testWithParameters3() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of(10.0d))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    ParameterizedFunctionalCurve actualWithParametersResult =
        parameterizedFunctionalCurve.withParameters(DoubleArray.of(10.0d));

    // Assert
    assertEquals(parameterizedFunctionalCurve, actualWithParametersResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#createParameterSensitivity(DoubleArray)} with {@code
   * sensitivities}.
   *
   * <ul>
   *   <li>Then return ParameterCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ParameterizedFunctionalCurve#createParameterSensitivity(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test createParameterSensitivity(DoubleArray) with 'sensitivities'; then return ParameterCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "UnitParameterSensitivity ParameterizedFunctionalCurve.createParameterSensitivity(DoubleArray)"
  })
  void testCreateParameterSensitivityWithSensitivities_thenReturnParameterCountIsZero() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));
    CurveName name = CurveName.of("Name");

    Builder metadataResult = derivativeFunctionResult.metadata(DefaultCurveMetadata.of(name));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    UnitParameterSensitivity actualCreateParameterSensitivityResult =
        parameterizedFunctionalCurve.createParameterSensitivity(DoubleArray.of());

    // Assert
    assertEquals(0, actualCreateParameterSensitivityResult.getParameterCount());
    assertEquals(0.0d, actualCreateParameterSensitivityResult.total());
    assertFalse(actualCreateParameterSensitivityResult.getParameterSplit().isPresent());
    assertTrue(actualCreateParameterSensitivityResult.getParameterMetadata().isEmpty());
    assertSame(name, actualCreateParameterSensitivityResult.getMarketDataName());
    assertSame(DoubleArray.EMPTY, actualCreateParameterSensitivityResult.getSensitivity());
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#meta()}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ParameterizedFunctionalCurve.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ParameterizedFunctionalCurve.meta();

    // Assert
    assertTrue(actualMetaResult.derivativeFunction() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.metadata() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameters() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.sensitivityFunction() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.valueFunction() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#metaBean()}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ParameterizedFunctionalCurve.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build()
            .metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ParameterizedFunctionalCurve#toString()}
   *   <li>{@link ParameterizedFunctionalCurve#getDerivativeFunction()}
   *   <li>{@link ParameterizedFunctionalCurve#getMetadata()}
   *   <li>{@link ParameterizedFunctionalCurve#getParameters()}
   *   <li>{@link ParameterizedFunctionalCurve#getSensitivityFunction()}
   *   <li>{@link ParameterizedFunctionalCurve#getValueFunction()}
   *   <li>{@link ParameterizedFunctionalCurve#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BiFunction ParameterizedFunctionalCurve.getDerivativeFunction()",
    "CurveMetadata ParameterizedFunctionalCurve.getMetadata()",
    "DoubleArray ParameterizedFunctionalCurve.getParameters()",
    "BiFunction ParameterizedFunctionalCurve.getSensitivityFunction()",
    "BiFunction ParameterizedFunctionalCurve.getValueFunction()",
    "Builder ParameterizedFunctionalCurve.toBuilder()",
    "String ParameterizedFunctionalCurve.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    Builder metadataResult = derivativeFunctionResult.metadata(metadata);
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act
    parameterizedFunctionalCurve.toString();
    parameterizedFunctionalCurve.getDerivativeFunction();
    CurveMetadata actualMetadata = parameterizedFunctionalCurve.getMetadata();
    DoubleArray actualParameters = parameterizedFunctionalCurve.getParameters();
    parameterizedFunctionalCurve.getSensitivityFunction();
    parameterizedFunctionalCurve.getValueFunction();
    parameterizedFunctionalCurve.toBuilder();

    // Assert
    assertSame(metadata, actualMetadata);
    assertSame(DoubleArray.EMPTY, actualParameters);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#equals(Object)}, and {@link
   * ParameterizedFunctionalCurve#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ParameterizedFunctionalCurve#equals(Object)}
   *   <li>{@link ParameterizedFunctionalCurve#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurve.equals(Object)",
    "int ParameterizedFunctionalCurve.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    // Act and Assert
    assertEquals(parameterizedFunctionalCurve, parameterizedFunctionalCurve);
    int expectedHashCodeResult = parameterizedFunctionalCurve.hashCode();
    assertEquals(expectedHashCodeResult, parameterizedFunctionalCurve.hashCode());
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurve.equals(Object)",
    "int ParameterizedFunctionalCurve.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    Builder derivativeFunctionResult2 =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult2 =
        derivativeFunctionResult2.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertNotEquals(
        parameterizedFunctionalCurve,
        metadataResult2
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build());
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurve.equals(Object)",
    "int ParameterizedFunctionalCurve.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));
    CurveName curveName = CurveName.of("Name");
    HashMap<CurveInfoType<?>, Object> info = new HashMap<>();

    DefaultCurveMetadata metadata =
        new DefaultCurveMetadata(
            curveName,
            ValueType.BLACK_VOLATILITY,
            ValueType.BLACK_VOLATILITY,
            info,
            new ArrayList<>());

    Builder metadataResult = derivativeFunctionResult.metadata(metadata);
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    Builder derivativeFunctionResult2 =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult2 =
        derivativeFunctionResult2.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertNotEquals(
        parameterizedFunctionalCurve,
        metadataResult2
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build());
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurve.equals(Object)",
    "int ParameterizedFunctionalCurve.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));
    ParameterizedFunctionalCurve parameterizedFunctionalCurve =
        metadataResult
            .parameters(DoubleArray.filled(3))
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build();

    Builder derivativeFunctionResult2 =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult2 =
        derivativeFunctionResult2.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertNotEquals(
        parameterizedFunctionalCurve,
        metadataResult2
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build());
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurve.equals(Object)",
    "int ParameterizedFunctionalCurve.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertNotEquals(
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build(),
        null);
  }

  /**
   * Test {@link ParameterizedFunctionalCurve#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurve#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurve.equals(Object)",
    "int ParameterizedFunctionalCurve.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurve.builder().derivativeFunction(mock(BiFunction.class));

    Builder metadataResult =
        derivativeFunctionResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Act and Assert
    assertNotEquals(
        metadataResult
            .parameters(DoubleArray.of())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .build(),
        "Different type to ParameterizedFunctionalCurve");
  }
}
