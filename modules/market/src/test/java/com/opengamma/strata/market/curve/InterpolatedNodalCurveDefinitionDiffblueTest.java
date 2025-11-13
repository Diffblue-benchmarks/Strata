package com.opengamma.strata.market.curve;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.curve.InterpolatedNodalCurveDefinition.Builder;
import com.opengamma.strata.market.curve.InterpolatedNodalCurveDefinition.Meta;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolators;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolators;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InterpolatedNodalCurveDefinitionDiffblueTest {
  /**
   * Test {@link InterpolatedNodalCurveDefinition#builder()}.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link InterpolatedNodalCurveDefinition#builder()}
   *   <li>{@link InterpolatedNodalCurveDefinition#compoundingPerYear(Integer)}
   *   <li>{@link InterpolatedNodalCurveDefinition#dayCount(DayCount)}
   * </ul>
   */
  @Test
  @DisplayName("Test builder()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalCurveDefinition Builder.build()",
    "Builder Builder.compoundingPerYear(Integer)",
    "Builder Builder.dayCount(DayCount)",
    "String Builder.toString()"
  })
  void testBuilder() {
    // Arrange and Act
    Builder actualInterpolatorResult =
        InterpolatedNodalCurveDefinition.builder()
            .compoundingPerYear(1)
            .dayCount(mock(DayCount.class))
            .extrapolatorLeft(CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE)
            .extrapolatorRight(CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE)
            .interpolator(CurveInterpolators.DOUBLE_QUADRATIC);
    Builder actualNameResult = actualInterpolatorResult.name(CurveName.of("Name"));
    Builder actualXValueTypeResult =
        actualNameResult.nodes(new ArrayList<>()).xValueType(ValueType.BLACK_VOLATILITY);
    Builder actualYValueTypeResult = actualXValueTypeResult.yValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(actualXValueTypeResult, actualYValueTypeResult);
  }

  /**
   * Test Builder {@link Builder#extrapolatorLeft(CurveExtrapolator)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#extrapolatorLeft(CurveExtrapolator)}
   */
  @Test
  @DisplayName("Test Builder extrapolatorLeft(CurveExtrapolator); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.extrapolatorLeft(CurveExtrapolator)"})
  void testBuilderExtrapolatorLeft_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalCurveDefinition.builder();

    // Act
    Builder actualExtrapolatorLeftResult =
        builderResult.extrapolatorLeft(CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE);

    // Assert
    assertSame(builderResult, actualExtrapolatorLeftResult);
  }

  /**
   * Test Builder {@link Builder#extrapolatorRight(CurveExtrapolator)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#extrapolatorRight(CurveExtrapolator)}
   */
  @Test
  @DisplayName("Test Builder extrapolatorRight(CurveExtrapolator); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.extrapolatorRight(CurveExtrapolator)"})
  void testBuilderExtrapolatorRight_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalCurveDefinition.builder();

    // Act
    Builder actualExtrapolatorRightResult =
        builderResult.extrapolatorRight(CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE);

    // Assert
    assertSame(builderResult, actualExtrapolatorRightResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code extrapolatorLeft}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'extrapolatorLeft'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExtrapolatorLeft_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(InterpolatedNodalCurveDefinition.builder().get("extrapolatorLeft"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code extrapolatorRight}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'extrapolatorRight'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenExtrapolatorRight_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(InterpolatedNodalCurveDefinition.builder().get("extrapolatorRight"));
  }

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
    assertNull(InterpolatedNodalCurveDefinition.builder().get("interpolator"));
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
    assertNull(InterpolatedNodalCurveDefinition.builder().get("name"));
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
    Object actualGetResult = InterpolatedNodalCurveDefinition.builder().get("nodes");

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
        () -> InterpolatedNodalCurveDefinition.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#interpolator(CurveInterpolator)}.
   *
   * <ul>
   *   <li>When {@link CurveInterpolators#DOUBLE_QUADRATIC}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#interpolator(CurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Builder interpolator(CurveInterpolator); when DOUBLE_QUADRATIC; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.interpolator(CurveInterpolator)"})
  void testBuilderInterpolator_whenDouble_quadratic_thenReturnBuilder() {
    // Arrange
    Builder builderResult = InterpolatedNodalCurveDefinition.builder();

    // Act
    Builder actualInterpolatorResult =
        builderResult.interpolator(CurveInterpolators.DOUBLE_QUADRATIC);

    // Assert
    assertSame(builderResult, actualInterpolatorResult);
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
    Builder builderResult = InterpolatedNodalCurveDefinition.builder();

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
    Builder builderResult = InterpolatedNodalCurveDefinition.builder();

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
    Builder builderResult = InterpolatedNodalCurveDefinition.builder();

    // Act
    Builder actualNodesResult = builderResult.nodes(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualNodesResult);
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
        () -> InterpolatedNodalCurveDefinition.builder().set("Property Name", "New Value"));
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
    Builder builderResult = InterpolatedNodalCurveDefinition.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
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
    Builder builderResult = InterpolatedNodalCurveDefinition.builder();

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
    Builder builderResult = InterpolatedNodalCurveDefinition.builder();

    // Act
    Builder actualYValueTypeResult = builderResult.yValueType(ValueType.BLACK_VOLATILITY);

    // Assert
    assertSame(builderResult, actualYValueTypeResult);
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
    Class<? extends InterpolatedNodalCurveDefinition> actualBeanTypeResult =
        InterpolatedNodalCurveDefinition.meta().beanType();

    // Assert
    Class<InterpolatedNodalCurveDefinition> expectedBeanTypeResult =
        InterpolatedNodalCurveDefinition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#compoundingPerYear()}
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#extrapolatorLeft()}
   *   <li>{@link Meta#extrapolatorRight()}
   *   <li>{@link Meta#interpolator()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#nodes()}
   *   <li>{@link Meta#xValueType()}
   *   <li>{@link Meta#yValueType()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.compoundingPerYear()",
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.extrapolatorLeft()",
    "MetaProperty Meta.extrapolatorRight()",
    "MetaProperty Meta.interpolator()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.nodes()",
    "MetaProperty Meta.xValueType()",
    "MetaProperty Meta.yValueType()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = InterpolatedNodalCurveDefinition.meta();

    // Act
    MetaProperty<Integer> actualCompoundingPerYearResult = metaResult.compoundingPerYear();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<CurveExtrapolator> actualExtrapolatorLeftResult = metaResult.extrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualExtrapolatorRightResult = metaResult.extrapolatorRight();
    MetaProperty<CurveInterpolator> actualInterpolatorResult = metaResult.interpolator();
    MetaProperty<CurveName> actualNameResult = metaResult.name();
    MetaProperty<ImmutableList<CurveNode>> actualNodesResult = metaResult.nodes();
    MetaProperty<ValueType> actualXValueTypeResult = metaResult.xValueType();

    // Assert
    assertTrue(actualCompoundingPerYearResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(actualInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(actualNodesResult instanceof DirectMetaProperty);
    assertTrue(actualXValueTypeResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yValueType() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code compoundingPerYear}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'compoundingPerYear'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsCompoundingPerYear() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedNodalCurveDefinition.meta().metaPropertyGet("compoundingPerYear");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("compoundingPerYear", actualMetaPropertyGetResult.name());
    Class<Integer> expectedPropertyTypeResult = Integer.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).compoundingPerYear());
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
        InterpolatedNodalCurveDefinition.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).compoundingPerYear() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
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
   *   <li>When {@code extrapolatorLeft}.
   *   <li>Then return name is {@code extrapolatorLeft}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'extrapolatorLeft'; then return name is 'extrapolatorLeft'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExtrapolatorLeft_thenReturnNameIsExtrapolatorLeft() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedNodalCurveDefinition.meta().metaPropertyGet("extrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).compoundingPerYear() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("extrapolatorLeft", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).extrapolatorLeft());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code extrapolatorRight}.
   *   <li>Then return name is {@code extrapolatorRight}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'extrapolatorRight'; then return name is 'extrapolatorRight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenExtrapolatorRight_thenReturnNameIsExtrapolatorRight() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        InterpolatedNodalCurveDefinition.meta().metaPropertyGet("extrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).compoundingPerYear() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("extrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).extrapolatorRight());
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
        InterpolatedNodalCurveDefinition.meta().metaPropertyGet("interpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).compoundingPerYear() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("interpolator", actualMetaPropertyGetResult.name());
    Class<CurveInterpolator> expectedPropertyTypeResult = CurveInterpolator.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).interpolator());
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
        InterpolatedNodalCurveDefinition.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).compoundingPerYear() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
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
        InterpolatedNodalCurveDefinition.meta().metaPropertyGet("nodes");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).compoundingPerYear() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValueType() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValueType() instanceof DirectMetaProperty);
    assertEquals("nodes", actualMetaPropertyGetResult.name());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).nodes());
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
    assertNull(InterpolatedNodalCurveDefinition.meta().metaPropertyGet("Property Name"));
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
        InterpolatedNodalCurveDefinition.meta().metaPropertyGet("xValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).compoundingPerYear() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
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
        InterpolatedNodalCurveDefinition.meta().metaPropertyGet("yValueType");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).compoundingPerYear() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
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
        InterpolatedNodalCurveDefinition.meta().metaPropertyMap();

    // Assert
    assertEquals(9, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("compoundingPerYear") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("extrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("extrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("interpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("nodes") instanceof DirectMetaProperty);
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
        InterpolatedNodalCurveDefinition.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
        () -> InterpolatedNodalCurveDefinition.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code compoundingPerYear}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'compoundingPerYear'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCompoundingPerYear_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedNodalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "compoundingPerYear", "New Value", true));
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
            InterpolatedNodalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code extrapolatorLeft}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'extrapolatorLeft'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExtrapolatorLeft_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedNodalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "extrapolatorLeft", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code extrapolatorRight}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'extrapolatorRight'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenExtrapolatorRight_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            InterpolatedNodalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "extrapolatorRight", "New Value", true));
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
            InterpolatedNodalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "compoundingPerYear", "New Value", false));
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
            InterpolatedNodalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "interpolator", "New Value", true));
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
            InterpolatedNodalCurveDefinition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }
}
