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
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.ParameterizedFunctionalCurveDefinition.Builder;
import com.opengamma.strata.market.curve.ParameterizedFunctionalCurveDefinition.Meta;
import com.opengamma.strata.market.param.ParameterMetadata;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.BiFunction;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ParameterizedFunctionalCurveDefinitionDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Builder#build()}
   *   <li>{@link Builder#dayCount(DayCount)}
   * </ul>
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurveDefinition Builder.build()",
    "Builder Builder.dayCount(DayCount)",
    "String Builder.toString()"
  })
  void testBuilderBuild() {
    // Arrange
    DayCount dayCount = mock(DayCount.class);
    BiFunction<DoubleArray, Double, Double> derivativeFunction = mock(BiFunction.class);

    // Act
    Builder actualDerivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(dayCount)
            .derivativeFunction(derivativeFunction);
    Builder actualInitialGuessResult =
        actualDerivativeFunctionResult.initialGuess(new ArrayList<>());
    CurveName name = CurveName.of("Name");
    Builder actualNameResult = actualInitialGuessResult.name(name);
    Builder actualNodesResult = actualNameResult.nodes(new ArrayList<>());
    BiFunction<DoubleArray, Double, DoubleArray> sensitivityFunction = mock(BiFunction.class);
    BiFunction<DoubleArray, Double, Double> valueFunction = mock(BiFunction.class);
    ParameterizedFunctionalCurveDefinition actualParameterizedFunctionalCurveDefinition =
        actualNodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(sensitivityFunction)
            .valueFunction(valueFunction)
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build();

    // Assert
    assertEquals(0, actualParameterizedFunctionalCurveDefinition.getParameterCount());
    Optional<DayCount> dayCount2 = actualParameterizedFunctionalCurveDefinition.getDayCount();
    assertTrue(dayCount2.isPresent());
    assertSame(name, actualParameterizedFunctionalCurveDefinition.getName());
    ValueType valueType = ValueType.BLACK_VOLATILITY;
    assertSame(valueType, actualParameterizedFunctionalCurveDefinition.getXValueType());
    assertSame(valueType, actualParameterizedFunctionalCurveDefinition.getYValueType());
    assertSame(dayCount, dayCount2.get());
    assertSame(
        derivativeFunction, actualParameterizedFunctionalCurveDefinition.getDerivativeFunction());
    assertSame(
        sensitivityFunction, actualParameterizedFunctionalCurveDefinition.getSensitivityFunction());
    assertSame(valueFunction, actualParameterizedFunctionalCurveDefinition.getValueFunction());
    assertSame(
        actualParameterizedFunctionalCurveDefinition.getInitialGuess(),
        actualParameterizedFunctionalCurveDefinition.getNodes());
    assertSame(
        actualParameterizedFunctionalCurveDefinition.getInitialGuess(),
        actualParameterizedFunctionalCurveDefinition.getParameterMetadata());
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
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

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
    assertNull(ParameterizedFunctionalCurveDefinition.builder().get("derivativeFunction"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code initialGuess}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'initialGuess'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenInitialGuess_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = ParameterizedFunctionalCurveDefinition.builder().get("initialGuess");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(ParameterizedFunctionalCurveDefinition.builder().get("name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code nodes}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'nodes'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenNodes_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = ParameterizedFunctionalCurveDefinition.builder().get("nodes");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code parameterMetadata}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'parameterMetadata'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenParameterMetadata_thenReturnList() {
    // Arrange and Act
    Object actualGetResult =
        ParameterizedFunctionalCurveDefinition.builder().get("parameterMetadata");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
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
        () -> ParameterizedFunctionalCurveDefinition.builder().get("Property Name"));
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
    assertNull(ParameterizedFunctionalCurveDefinition.builder().get("sensitivityFunction"));
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
    assertNull(ParameterizedFunctionalCurveDefinition.builder().get("valueFunction"));
  }

  /**
   * Test Builder {@link Builder#initialGuess(Double[])} with {@code Double[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#initialGuess(Double[])}
   */
  @Test
  @DisplayName("Test Builder initialGuess(Double[]) with 'Double[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.initialGuess(Double[])"})
  void testBuilderInitialGuessWithDouble_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualInitialGuessResult = builderResult.initialGuess();

    // Assert
    assertSame(builderResult, actualInitialGuessResult);
  }

  /**
   * Test Builder {@link Builder#initialGuess(Double[])} with {@code Double[]}.
   *
   * <ul>
   *   <li>When ten and {@code 0.5}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#initialGuess(Double[])}
   */
  @Test
  @DisplayName(
      "Test Builder initialGuess(Double[]) with 'Double[]'; when ten and '0.5'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.initialGuess(Double[])"})
  void testBuilderInitialGuessWithDouble_whenTenAnd05_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualInitialGuessResult = builderResult.initialGuess(10.0d, 0.5d);

    // Assert
    assertSame(builderResult, actualInitialGuessResult);
  }

  /**
   * Test Builder {@link Builder#initialGuess(Double[])} with {@code Double[]}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#initialGuess(Double[])}
   */
  @Test
  @DisplayName("Test Builder initialGuess(Double[]) with 'Double[]'; when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.initialGuess(Double[])"})
  void testBuilderInitialGuessWithDouble_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualInitialGuessResult = builderResult.initialGuess(10.0d);

    // Assert
    assertSame(builderResult, actualInitialGuessResult);
  }

  /**
   * Test Builder {@link Builder#initialGuess(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code 0.5}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code 0.5}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#initialGuess(List)}
   */
  @Test
  @DisplayName(
      "Test Builder initialGuess(List) with 'List'; given '0.5'; when ArrayList() add '0.5'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.initialGuess(List)"})
  void testBuilderInitialGuessWithList_given05_whenArrayListAdd05_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    ArrayList<Double> initialGuess = new ArrayList<>();
    initialGuess.add(0.5d);
    initialGuess.add(10.0d);

    // Act
    Builder actualInitialGuessResult = builderResult.initialGuess(initialGuess);

    // Assert
    assertSame(builderResult, actualInitialGuessResult);
  }

  /**
   * Test Builder {@link Builder#initialGuess(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link ArrayList#ArrayList()} add ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#initialGuess(List)}
   */
  @Test
  @DisplayName(
      "Test Builder initialGuess(List) with 'List'; given ten; when ArrayList() add ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.initialGuess(List)"})
  void testBuilderInitialGuessWithList_givenTen_whenArrayListAddTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    ArrayList<Double> initialGuess = new ArrayList<>();
    initialGuess.add(10.0d);

    // Act
    Builder actualInitialGuessResult = builderResult.initialGuess(initialGuess);

    // Assert
    assertSame(builderResult, actualInitialGuessResult);
  }

  /**
   * Test Builder {@link Builder#initialGuess(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#initialGuess(List)}
   */
  @Test
  @DisplayName("Test Builder initialGuess(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.initialGuess(List)"})
  void testBuilderInitialGuessWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualInitialGuessResult = builderResult.initialGuess(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualInitialGuessResult);
  }

  /**
   * Test Builder {@link Builder#name(CurveName)}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(CurveName)}
   */
  @Test
  @DisplayName("Test Builder name(CurveName); when CurveName with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(CurveName)"})
  void testBuilderName_whenCurveNameWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualNameResult = builderResult.name(CurveName.of("Name"));

    // Assert
    assertSame(builderResult, actualNameResult);
  }

  /**
   * Test Builder {@link Builder#nodes(CurveNode[])} with {@code CurveNode[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#nodes(CurveNode[])}
   */
  @Test
  @DisplayName("Test Builder nodes(CurveNode[]) with 'CurveNode[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.nodes(CurveNode[])"})
  void testBuilderNodesWithCurveNode_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualNodesResult = builderResult.nodes();

    // Assert
    assertSame(builderResult, actualNodesResult);
  }

  /**
   * Test Builder {@link Builder#nodes(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#nodes(List)}
   */
  @Test
  @DisplayName("Test Builder nodes(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.nodes(List)"})
  void testBuilderNodesWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualNodesResult = builderResult.nodes(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualNodesResult);
  }

  /**
   * Test Builder {@link Builder#parameterMetadata(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterMetadata(List)}
   */
  @Test
  @DisplayName(
      "Test Builder parameterMetadata(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterMetadata(List)"})
  void testBuilderParameterMetadataWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualParameterMetadataResult = builderResult.parameterMetadata(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }

  /**
   * Test Builder {@link Builder#parameterMetadata(ParameterMetadata[])} with {@code
   * ParameterMetadata[]}.
   *
   * <p>Method under test: {@link Builder#parameterMetadata(ParameterMetadata[])}
   */
  @Test
  @DisplayName("Test Builder parameterMetadata(ParameterMetadata[]) with 'ParameterMetadata[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterMetadata(ParameterMetadata[])"})
  void testBuilderParameterMetadataWithParameterMetadata() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualParameterMetadataResult =
        builderResult.parameterMetadata(
            SimpleCurveParameterMetadata.of(ValueType.BLACK_VOLATILITY, 10.0d));

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
  }

  /**
   * Test Builder {@link Builder#parameterMetadata(ParameterMetadata[])} with {@code
   * ParameterMetadata[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterMetadata(ParameterMetadata[])}
   */
  @Test
  @DisplayName(
      "Test Builder parameterMetadata(ParameterMetadata[]) with 'ParameterMetadata[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterMetadata(ParameterMetadata[])"})
  void testBuilderParameterMetadataWithParameterMetadata_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualParameterMetadataResult = builderResult.parameterMetadata();

    // Assert
    assertSame(builderResult, actualParameterMetadataResult);
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
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

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
        () -> ParameterizedFunctionalCurveDefinition.builder().set("Property Name", "New Value"));
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
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

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
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualValueFunctionResult = builderResult.valueFunction(mock(BiFunction.class));

    // Assert
    assertSame(builderResult, actualValueFunctionResult);
  }

  /**
   * Test Builder {@link Builder#xValueType(ValueType)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#xValueType(ValueType)}
   */
  @Test
  @DisplayName("Test Builder xValueType(ValueType); when BLACK_VOLATILITY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.xValueType(ValueType)"})
  void testBuilderXValueType_whenBlack_volatility_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualXValueTypeResult = builderResult.xValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualXValueTypeResult);
  }

  /**
   * Test Builder {@link Builder#yValueType(ValueType)}.
   *
   * <ul>
   *   <li>When {@link ValueType#BLACK_VOLATILITY}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#yValueType(ValueType)}
   */
  @Test
  @DisplayName("Test Builder yValueType(ValueType); when BLACK_VOLATILITY; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.yValueType(ValueType)"})
  void testBuilderYValueType_whenBlack_volatility_thenReturnBuilder() {
    // Arrange
    Builder builderResult = ParameterizedFunctionalCurveDefinition.builder();

    // Act
    Builder actualYValueTypeResult = builderResult.yValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualYValueTypeResult);
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#filtered(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add ten.
   *   <li>Then return ParameterCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#filtered(LocalDate,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test filtered(LocalDate, ReferenceData); given ArrayList() add ten; then return ParameterCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurveDefinition ParameterizedFunctionalCurveDefinition.filtered(LocalDate, ReferenceData)"
  })
  void testFiltered_givenArrayListAddTen_thenReturnParameterCountIsOne() {
    // Arrange
    ArrayList<Double> initialGuess = new ArrayList<>();
    initialGuess.add(10.0d);

    Builder initialGuessResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class))
            .initialGuess(initialGuess);

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    ParameterizedFunctionalCurveDefinition actualFilteredResult =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build()
            .filtered(LocalDate.of(1970, 1, 1), mock(ReferenceData.class));

    // Assert
    assertEquals(1, actualFilteredResult.getParameterCount());
    ImmutableList<Double> initialGuess2 = actualFilteredResult.getInitialGuess();
    assertEquals(1, initialGuess2.size());
    assertEquals(1, actualFilteredResult.getParameterMetadata().size());
    assertEquals(10.0d, initialGuess2.get(0).doubleValue());
    assertTrue(actualFilteredResult.getNodes().isEmpty());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#filtered(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return ParameterCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#filtered(LocalDate,
   * ReferenceData)}
   */
  @Test
  @DisplayName("Test filtered(LocalDate, ReferenceData); then return ParameterCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurveDefinition ParameterizedFunctionalCurveDefinition.filtered(LocalDate, ReferenceData)"
  })
  void testFiltered_thenReturnParameterCountIsZero() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    ParameterizedFunctionalCurveDefinition actualFilteredResult =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build()
            .filtered(LocalDate.of(1970, 1, 1), mock(ReferenceData.class));

    // Assert
    assertEquals(0, actualFilteredResult.getParameterCount());
    ImmutableList<Double> initialGuess = actualFilteredResult.getInitialGuess();
    assertTrue(initialGuess.isEmpty());
    assertSame(initialGuess, actualFilteredResult.getNodes());
    assertSame(initialGuess, actualFilteredResult.getParameterMetadata());
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
    Class<? extends ParameterizedFunctionalCurveDefinition> actualBeanTypeResult =
        ParameterizedFunctionalCurveDefinition.meta().beanType();

    // Assert
    Class<ParameterizedFunctionalCurveDefinition> expectedBeanTypeResult =
        ParameterizedFunctionalCurveDefinition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#derivativeFunction()}
   *   <li>{@link Meta#initialGuess()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#nodes()}
   *   <li>{@link Meta#parameterMetadata()}
   *   <li>{@link Meta#sensitivityFunction()}
   *   <li>{@link Meta#valueFunction()}
   *   <li>{@link Meta#xValueType()}
   *   <li>{@link Meta#yValueType()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.derivativeFunction()",
    "MetaProperty Meta.initialGuess()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.nodes()",
    "MetaProperty Meta.parameterMetadata()",
    "MetaProperty Meta.sensitivityFunction()",
    "MetaProperty Meta.valueFunction()",
    "MetaProperty Meta.xValueType()",
    "MetaProperty Meta.yValueType()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = ParameterizedFunctionalCurveDefinition.meta();

    // Act
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<BiFunction<DoubleArray, Double, Double>> actualDerivativeFunctionResult =
        metaResult.derivativeFunction();
    MetaProperty<ImmutableList<Double>> actualInitialGuessResult = metaResult.initialGuess();
    MetaProperty<CurveName> actualNameResult = metaResult.name();
    MetaProperty<ImmutableList<CurveNode>> actualNodesResult = metaResult.nodes();
    MetaProperty<ImmutableList<ParameterMetadata>> actualParameterMetadataResult =
        metaResult.parameterMetadata();
    MetaProperty<BiFunction<DoubleArray, Double, DoubleArray>> actualSensitivityFunctionResult =
        metaResult.sensitivityFunction();
    MetaProperty<BiFunction<DoubleArray, Double, Double>> actualValueFunctionResult =
        metaResult.valueFunction();
    MetaProperty<ValueType> actualXValueTypeResult = metaResult.xValueType();

    // Assert
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualDerivativeFunctionResult instanceof DirectMetaProperty);
    assertTrue(actualInitialGuessResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(actualNodesResult instanceof DirectMetaProperty);
    assertTrue(actualParameterMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualSensitivityFunctionResult instanceof DirectMetaProperty);
    assertTrue(actualValueFunctionResult instanceof DirectMetaProperty);
    assertTrue(actualXValueTypeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yValueType() instanceof DirectMetaProperty);
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
        ParameterizedFunctionalCurveDefinition.meta().metaPropertyGet("derivativeFunction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialGuess() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sensitivityFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valueFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("derivativeFunction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).derivativeFunction());
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
        ParameterizedFunctionalCurveDefinition.meta().metaPropertyGet("sensitivityFunction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).derivativeFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialGuess() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valueFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("sensitivityFunction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).sensitivityFunction());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return name is {@code dayCount}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'dayCount'; then return name is 'dayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenDayCount_thenReturnNameIsDayCount() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ParameterizedFunctionalCurveDefinition.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).derivativeFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialGuess() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sensitivityFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valueFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code initialGuess}.
   *   <li>Then return name is {@code initialGuess}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'initialGuess'; then return name is 'initialGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenInitialGuess_thenReturnNameIsInitialGuess() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ParameterizedFunctionalCurveDefinition.meta().metaPropertyGet("initialGuess");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).derivativeFunction() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sensitivityFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valueFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("initialGuess", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).initialGuess());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@code name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'name'; then return 'name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenName_thenReturnName() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ParameterizedFunctionalCurveDefinition.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).derivativeFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialGuess() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sensitivityFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valueFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<CurveName> expectedPropertyTypeResult = CurveName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code nodes}.
   *   <li>Then return name is {@code nodes}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'nodes'; then return name is 'nodes'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenNodes_thenReturnNameIsNodes() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        ParameterizedFunctionalCurveDefinition.meta().metaPropertyGet("nodes");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).derivativeFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialGuess() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sensitivityFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valueFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("nodes", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).nodes());
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
        ParameterizedFunctionalCurveDefinition.meta().metaPropertyGet("parameterMetadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).derivativeFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialGuess() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sensitivityFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valueFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("parameterMetadata", actualMetaPropertyGetResult.name());
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
    assertNull(ParameterizedFunctionalCurveDefinition.meta().metaPropertyGet("Property Name"));
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
        ParameterizedFunctionalCurveDefinition.meta().metaPropertyGet("valueFunction");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).derivativeFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialGuess() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sensitivityFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("valueFunction", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valueFunction());
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
        ParameterizedFunctionalCurveDefinition.meta().metaPropertyGet("xValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).derivativeFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialGuess() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sensitivityFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valueFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
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
        ParameterizedFunctionalCurveDefinition.meta().metaPropertyGet("yValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).derivativeFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialGuess() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).sensitivityFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).valueFunction() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertEquals("yValueType", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValueType());
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
        ParameterizedFunctionalCurveDefinition.meta().metaPropertyMap();

    // Assert
    assertEquals(10, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("derivativeFunction") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("initialGuess") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("nodes") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("parameterMetadata") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("sensitivityFunction") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("valueFunction") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("xValueType") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yValueType") instanceof DirectMetaProperty);
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
        ParameterizedFunctionalCurveDefinition.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDayCount_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = ParameterizedFunctionalCurveDefinition.meta();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    assertDoesNotThrow(
        () ->
            metaResult.propertyGet(
                nodesResult
                    .parameterMetadata(new ArrayList<>())
                    .sensitivityFunction(mock(BiFunction.class))
                    .valueFunction(mock(BiFunction.class))
                    .xValueType(ValueType.BLACK_VOLATILITY)
                    .yValueType(ValueType.BLACK_VOLATILITY)
                    .build(),
                "dayCount",
                true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code derivativeFunction}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'derivativeFunction'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenDerivativeFunction_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = ParameterizedFunctionalCurveDefinition.meta();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    assertDoesNotThrow(
        () ->
            metaResult.propertyGet(
                nodesResult
                    .parameterMetadata(new ArrayList<>())
                    .sensitivityFunction(mock(BiFunction.class))
                    .valueFunction(mock(BiFunction.class))
                    .xValueType(ValueType.BLACK_VOLATILITY)
                    .yValueType(ValueType.BLACK_VOLATILITY)
                    .build(),
                "derivativeFunction",
                true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code initialGuess}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'initialGuess'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenInitialGuess_thenReturnList() {
    // Arrange
    Meta metaResult = ParameterizedFunctionalCurveDefinition.meta();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            "initialGuess",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then return {@link CurveName} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'name'; then return CurveName with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenName_thenReturnCurveNameWithName() {
    // Arrange
    Meta metaResult = ParameterizedFunctionalCurveDefinition.meta();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());
    CurveName name = CurveName.of("Name");

    Builder nameResult = initialGuessResult.name(name);

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act and Assert
    assertSame(
        name,
        metaResult.propertyGet(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            "name",
            false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code nodes}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'nodes'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenNodes_thenReturnList() {
    // Arrange
    Meta metaResult = ParameterizedFunctionalCurveDefinition.meta();

    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            nodesResult
                .parameterMetadata(new ArrayList<>())
                .sensitivityFunction(mock(BiFunction.class))
                .valueFunction(mock(BiFunction.class))
                .xValueType(ValueType.BLACK_VOLATILITY)
                .yValueType(ValueType.BLACK_VOLATILITY)
                .build(),
            "nodes",
            false);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
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
        () ->
            ParameterizedFunctionalCurveDefinition.meta()
                .propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dayCount'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDayCount_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ParameterizedFunctionalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'dayCount'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenDayCount_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            ParameterizedFunctionalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", false));
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
            ParameterizedFunctionalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "derivativeFunction", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code initialGuess}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'initialGuess'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenInitialGuess_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ParameterizedFunctionalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "initialGuess", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code name}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'name'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenName_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ParameterizedFunctionalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code nodes}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'nodes'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenNodes_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            ParameterizedFunctionalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "nodes", "New Value", true));
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
            ParameterizedFunctionalCurveDefinition.meta()
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
            ParameterizedFunctionalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code sensitivityFunction}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertySet(Bean, String, Object, boolean); when 'sensitivityFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenSensitivityFunction() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            ParameterizedFunctionalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "sensitivityFunction", "New Value", false));
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#metadata(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add ten.
   *   <li>Then return ParameterMetadata size is one.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#metadata(LocalDate,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test metadata(LocalDate, ReferenceData); given ArrayList() add ten; then return ParameterMetadata size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveMetadata ParameterizedFunctionalCurveDefinition.metadata(LocalDate, ReferenceData)"
  })
  void testMetadata_givenArrayListAddTen_thenReturnParameterMetadataSizeIsOne() {
    // Arrange
    ArrayList<Double> initialGuess = new ArrayList<>();
    initialGuess.add(10.0d);

    Builder initialGuessResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class))
            .initialGuess(initialGuess);
    CurveName name = CurveName.of("Name");

    Builder nameResult = initialGuessResult.name(name);

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    CurveMetadata actualMetadataResult =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build()
            .metadata(LocalDate.of(1970, 1, 1), mock(ReferenceData.class));

    // Assert
    assertTrue(actualMetadataResult instanceof DefaultCurveMetadata);
    ValueType xValueType = actualMetadataResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualMetadataResult.getParameterMetadata();
    assertEquals(1, parameterMetadata.get().size());
    assertEquals(1, ((DefaultCurveMetadata) actualMetadataResult).getInfo().size());
    assertTrue(parameterMetadata.isPresent());
    assertSame(xValueType, actualMetadataResult.getYValueType());
    assertSame(name, actualMetadataResult.getCurveName());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#metadata(LocalDate, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return ParameterMetadata Empty.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#metadata(LocalDate,
   * ReferenceData)}
   */
  @Test
  @DisplayName("Test metadata(LocalDate, ReferenceData); then return ParameterMetadata Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveMetadata ParameterizedFunctionalCurveDefinition.metadata(LocalDate, ReferenceData)"
  })
  void testMetadata_thenReturnParameterMetadataEmpty() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());
    CurveName name = CurveName.of("Name");

    Builder nameResult = initialGuessResult.name(name);

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act
    CurveMetadata actualMetadataResult =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build()
            .metadata(LocalDate.of(1970, 1, 1), mock(ReferenceData.class));

    // Assert
    assertTrue(actualMetadataResult instanceof DefaultCurveMetadata);
    ValueType xValueType = actualMetadataResult.getXValueType();
    assertEquals("BlackVolatility", xValueType.getName());
    assertEquals("BlackVolatility", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualMetadataResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualMetadataResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(xValueType, actualMetadataResult.getYValueType());
    assertSame(name, actualMetadataResult.getCurveName());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#curve(LocalDate, CurveMetadata,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then return ParameterCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#curve(LocalDate,
   * CurveMetadata, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test curve(LocalDate, CurveMetadata, DoubleArray); when DoubleArray with value is ten; then return ParameterCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurveDefinition.curve(LocalDate, CurveMetadata, DoubleArray)"
  })
  void testCurve_whenDoubleArrayWithValueIsTen_thenReturnParameterCountIsOne() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());
    ParameterizedFunctionalCurveDefinition parameterizedFunctionalCurveDefinition =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    DoubleArray parameters = DoubleArray.of(10.0d);

    // Act
    ParameterizedFunctionalCurve actualCurveResult =
        parameterizedFunctionalCurveDefinition.curve(valuationDate, metadata, parameters);

    // Assert
    assertTrue(actualCurveResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(1, actualCurveResult.getParameterCount());
    assertSame(parameters, actualCurveResult.getParameters());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#curve(LocalDate, CurveMetadata,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return ParameterCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#curve(LocalDate,
   * CurveMetadata, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test curve(LocalDate, CurveMetadata, DoubleArray); when DoubleArray; then return ParameterCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurveDefinition.curve(LocalDate, CurveMetadata, DoubleArray)"
  })
  void testCurve_whenDoubleArray_thenReturnParameterCountIsZero() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());
    ParameterizedFunctionalCurveDefinition parameterizedFunctionalCurveDefinition =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));

    // Act
    ParameterizedFunctionalCurve actualCurveResult =
        parameterizedFunctionalCurveDefinition.curve(valuationDate, metadata, DoubleArray.of());

    // Assert
    assertTrue(actualCurveResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(0, actualCurveResult.getParameterCount());
    assertSame(DoubleArray.EMPTY, actualCurveResult.getParameters());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#curve(LocalDate, CurveMetadata,
   * DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return ParameterCount is three.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#curve(LocalDate,
   * CurveMetadata, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test curve(LocalDate, CurveMetadata, DoubleArray); when filled three; then return ParameterCount is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ParameterizedFunctionalCurve ParameterizedFunctionalCurveDefinition.curve(LocalDate, CurveMetadata, DoubleArray)"
  })
  void testCurve_whenFilledThree_thenReturnParameterCountIsThree() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());
    ParameterizedFunctionalCurveDefinition parameterizedFunctionalCurveDefinition =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    DefaultCurveMetadata metadata = DefaultCurveMetadata.of(CurveName.of("Name"));
    DoubleArray parameters = DoubleArray.filled(3);

    // Act
    ParameterizedFunctionalCurve actualCurveResult =
        parameterizedFunctionalCurveDefinition.curve(valuationDate, metadata, parameters);

    // Assert
    assertTrue(actualCurveResult.getMetadata() instanceof DefaultCurveMetadata);
    assertEquals(3, actualCurveResult.getParameterCount());
    assertSame(parameters, actualCurveResult.getParameters());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#getParameterCount()}.
   *
   * <ul>
   *   <li>Given {@link ArrayList#ArrayList()} add ten.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#getParameterCount()}
   */
  @Test
  @DisplayName("Test getParameterCount(); given ArrayList() add ten; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ParameterizedFunctionalCurveDefinition.getParameterCount()"})
  void testGetParameterCount_givenArrayListAddTen_thenReturnOne() {
    // Arrange
    ArrayList<Double> initialGuess = new ArrayList<>();
    initialGuess.add(10.0d);

    Builder initialGuessResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class))
            .initialGuess(initialGuess);

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act and Assert
    assertEquals(
        1,
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build()
            .getParameterCount());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#getParameterCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#getParameterCount()}
   */
  @Test
  @DisplayName("Test getParameterCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int ParameterizedFunctionalCurveDefinition.getParameterCount()"})
  void testGetParameterCount_thenReturnZero() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act and Assert
    assertEquals(
        0,
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build()
            .getParameterCount());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#initialGuess(MarketData)}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#initialGuess(MarketData)}
   */
  @Test
  @DisplayName("Test initialGuess(MarketData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList ParameterizedFunctionalCurveDefinition.initialGuess(MarketData)"
  })
  void testInitialGuess() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act and Assert
    assertTrue(
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build()
            .initialGuess(null)
            .isEmpty());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#meta()}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ParameterizedFunctionalCurveDefinition.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = ParameterizedFunctionalCurveDefinition.meta();

    // Assert
    assertTrue(actualMetaResult.dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.derivativeFunction() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.initialGuess() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.nodes() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameterMetadata() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.sensitivityFunction() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.valueFunction() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yValueType() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#metaBean()}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta ParameterizedFunctionalCurveDefinition.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build()
            .metaBean());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#getDayCount()}.
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#getDayCount()}
   */
  @Test
  @DisplayName("Test getDayCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional ParameterizedFunctionalCurveDefinition.getDayCount()"})
  void testGetDayCount() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act and Assert
    assertTrue(
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build()
            .getDayCount()
            .isPresent());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ParameterizedFunctionalCurveDefinition#toString()}
   *   <li>{@link ParameterizedFunctionalCurveDefinition#getDerivativeFunction()}
   *   <li>{@link ParameterizedFunctionalCurveDefinition#getInitialGuess()}
   *   <li>{@link ParameterizedFunctionalCurveDefinition#getName()}
   *   <li>{@link ParameterizedFunctionalCurveDefinition#getNodes()}
   *   <li>{@link ParameterizedFunctionalCurveDefinition#getParameterMetadata()}
   *   <li>{@link ParameterizedFunctionalCurveDefinition#getSensitivityFunction()}
   *   <li>{@link ParameterizedFunctionalCurveDefinition#getValueFunction()}
   *   <li>{@link ParameterizedFunctionalCurveDefinition#getXValueType()}
   *   <li>{@link ParameterizedFunctionalCurveDefinition#getYValueType()}
   *   <li>{@link ParameterizedFunctionalCurveDefinition#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BiFunction ParameterizedFunctionalCurveDefinition.getDerivativeFunction()",
    "ImmutableList ParameterizedFunctionalCurveDefinition.getInitialGuess()",
    "CurveName ParameterizedFunctionalCurveDefinition.getName()",
    "ImmutableList ParameterizedFunctionalCurveDefinition.getNodes()",
    "ImmutableList ParameterizedFunctionalCurveDefinition.getParameterMetadata()",
    "BiFunction ParameterizedFunctionalCurveDefinition.getSensitivityFunction()",
    "BiFunction ParameterizedFunctionalCurveDefinition.getValueFunction()",
    "ValueType ParameterizedFunctionalCurveDefinition.getXValueType()",
    "ValueType ParameterizedFunctionalCurveDefinition.getYValueType()",
    "Builder ParameterizedFunctionalCurveDefinition.toBuilder()",
    "String ParameterizedFunctionalCurveDefinition.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());
    CurveName name = CurveName.of("Name");

    Builder nameResult = initialGuessResult.name(name);

    Builder nodesResult = nameResult.nodes(new ArrayList<>());
    ParameterizedFunctionalCurveDefinition parameterizedFunctionalCurveDefinition =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build();

    // Act
    parameterizedFunctionalCurveDefinition.toString();
    parameterizedFunctionalCurveDefinition.getDerivativeFunction();
    ImmutableList<Double> actualInitialGuess =
        parameterizedFunctionalCurveDefinition.getInitialGuess();
    CurveName actualName = parameterizedFunctionalCurveDefinition.getName();
    ImmutableList<CurveNode> actualNodes = parameterizedFunctionalCurveDefinition.getNodes();
    ImmutableList<ParameterMetadata> actualParameterMetadata =
        parameterizedFunctionalCurveDefinition.getParameterMetadata();
    parameterizedFunctionalCurveDefinition.getSensitivityFunction();
    parameterizedFunctionalCurveDefinition.getValueFunction();
    ValueType actualXValueType = parameterizedFunctionalCurveDefinition.getXValueType();
    ValueType actualYValueType = parameterizedFunctionalCurveDefinition.getYValueType();
    parameterizedFunctionalCurveDefinition.toBuilder();

    // Assert
    assertSame(actualInitialGuess, actualNodes);
    assertSame(actualInitialGuess, actualParameterMetadata);
    assertSame(name, actualName);
    ValueType valueType = ValueType.BLACK_VOLATILITY;
    assertSame(valueType, actualXValueType);
    assertSame(valueType, actualYValueType);
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#equals(Object)}, and {@link
   * ParameterizedFunctionalCurveDefinition#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link ParameterizedFunctionalCurveDefinition#equals(Object)}
   *   <li>{@link ParameterizedFunctionalCurveDefinition#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurveDefinition.equals(Object)",
    "int ParameterizedFunctionalCurveDefinition.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());
    ParameterizedFunctionalCurveDefinition parameterizedFunctionalCurveDefinition =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build();

    // Act and Assert
    assertEquals(parameterizedFunctionalCurveDefinition, parameterizedFunctionalCurveDefinition);
    int expectedHashCodeResult = parameterizedFunctionalCurveDefinition.hashCode();
    assertEquals(expectedHashCodeResult, parameterizedFunctionalCurveDefinition.hashCode());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurveDefinition.equals(Object)",
    "int ParameterizedFunctionalCurveDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());
    ParameterizedFunctionalCurveDefinition parameterizedFunctionalCurveDefinition =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build();

    Builder derivativeFunctionResult2 =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult2 = derivativeFunctionResult2.initialGuess(new ArrayList<>());

    Builder nameResult2 = initialGuessResult2.name(CurveName.of("Name"));

    Builder nodesResult2 = nameResult2.nodes(new ArrayList<>());

    // Act and Assert
    assertNotEquals(
        parameterizedFunctionalCurveDefinition,
        nodesResult2
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurveDefinition.equals(Object)",
    "int ParameterizedFunctionalCurveDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());
    ParameterizedFunctionalCurveDefinition parameterizedFunctionalCurveDefinition =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build();

    Builder derivativeFunctionResult2 =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult2 = derivativeFunctionResult2.initialGuess(new ArrayList<>());

    Builder nameResult2 = initialGuessResult2.name(CurveName.of("Name"));

    Builder nodesResult2 = nameResult2.nodes(new ArrayList<>());

    // Act and Assert
    assertNotEquals(
        parameterizedFunctionalCurveDefinition,
        nodesResult2
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurveDefinition.equals(Object)",
    "int ParameterizedFunctionalCurveDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());
    ParameterizedFunctionalCurveDefinition parameterizedFunctionalCurveDefinition =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.CORRELATION)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build();

    Builder derivativeFunctionResult2 =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult2 = derivativeFunctionResult2.initialGuess(new ArrayList<>());

    Builder nameResult2 = initialGuessResult2.name(CurveName.of("Name"));

    Builder nodesResult2 = nameResult2.nodes(new ArrayList<>());

    // Act and Assert
    assertNotEquals(
        parameterizedFunctionalCurveDefinition,
        nodesResult2
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurveDefinition.equals(Object)",
    "int ParameterizedFunctionalCurveDefinition.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());
    ParameterizedFunctionalCurveDefinition parameterizedFunctionalCurveDefinition =
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.CORRELATION)
            .build();

    Builder derivativeFunctionResult2 =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult2 = derivativeFunctionResult2.initialGuess(new ArrayList<>());

    Builder nameResult2 = initialGuessResult2.name(CurveName.of("Name"));

    Builder nodesResult2 = nameResult2.nodes(new ArrayList<>());

    // Act and Assert
    assertNotEquals(
        parameterizedFunctionalCurveDefinition,
        nodesResult2
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build());
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurveDefinition.equals(Object)",
    "int ParameterizedFunctionalCurveDefinition.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act and Assert
    assertNotEquals(
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build(),
        null);
  }

  /**
   * Test {@link ParameterizedFunctionalCurveDefinition#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedFunctionalCurveDefinition#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean ParameterizedFunctionalCurveDefinition.equals(Object)",
    "int ParameterizedFunctionalCurveDefinition.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder derivativeFunctionResult =
        ParameterizedFunctionalCurveDefinition.builder()
            .dayCount(mock(DayCount.class))
            .derivativeFunction(mock(BiFunction.class));

    Builder initialGuessResult = derivativeFunctionResult.initialGuess(new ArrayList<>());

    Builder nameResult = initialGuessResult.name(CurveName.of("Name"));

    Builder nodesResult = nameResult.nodes(new ArrayList<>());

    // Act and Assert
    assertNotEquals(
        nodesResult
            .parameterMetadata(new ArrayList<>())
            .sensitivityFunction(mock(BiFunction.class))
            .valueFunction(mock(BiFunction.class))
            .xValueType(ValueType.BLACK_VOLATILITY)
            .yValueType(ValueType.BLACK_VOLATILITY)
            .build(),
        "Different type to ParameterizedFunctionalCurveDefinition");
  }
}
