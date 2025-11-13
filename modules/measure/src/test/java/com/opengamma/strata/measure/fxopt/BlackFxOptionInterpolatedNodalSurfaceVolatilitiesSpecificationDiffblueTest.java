package com.opengamma.strata.measure.fxopt;

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
import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
import com.opengamma.strata.measure.fxopt.BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.Builder;
import com.opengamma.strata.measure.fxopt.BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.Meta;
import com.opengamma.strata.pricer.fxopt.FxOptionVolatilitiesName;
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

class BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecificationDiffblueTest {
  /**
   * Test Builder {@link Builder#dayCount(DayCount)}.
   *
   * <ul>
   *   <li>When {@link DayCount}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#dayCount(DayCount)}
   */
  @Test
  @DisplayName("Test Builder dayCount(DayCount); when DayCount; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.dayCount(DayCount)"})
  void testBuilderDayCount_whenDayCount_thenReturnBuilder() {
    // Arrange
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

    // Act
    Builder actualDayCountResult = builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code currencyPair}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'currencyPair'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenCurrencyPair_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder()
            .get("currencyPair"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code dayCount}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'dayCount'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenDayCount_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder().get("dayCount"));
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
    assertNull(
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder().get("name"));
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
    Object actualGetResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder().get("nodes");

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
        () ->
            BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder()
                .get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#name(FxOptionVolatilitiesName)}.
   *
   * <ul>
   *   <li>When {@link FxOptionVolatilitiesName} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(FxOptionVolatilitiesName)}
   */
  @Test
  @DisplayName(
      "Test Builder name(FxOptionVolatilitiesName); when FxOptionVolatilitiesName with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(FxOptionVolatilitiesName)"})
  void testBuilderName_whenFxOptionVolatilitiesNameWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

    // Act
    Builder actualNameResult = builderResult.name(FxOptionVolatilitiesName.of("Name"));

    // Assert
    assertSame(builderResult, actualNameResult);
  }

  /**
   * Test Builder {@link Builder#nodes(FxOptionVolatilitiesNode[])} with {@code
   * FxOptionVolatilitiesNode[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#nodes(FxOptionVolatilitiesNode[])}
   */
  @Test
  @DisplayName(
      "Test Builder nodes(FxOptionVolatilitiesNode[]) with 'FxOptionVolatilitiesNode[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.nodes(FxOptionVolatilitiesNode[])"})
  void testBuilderNodesWithFxOptionVolatilitiesNode_thenReturnBuilder() {
    // Arrange
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

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
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

    // Act
    Builder actualNodesResult = builderResult.nodes(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualNodesResult);
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
        () ->
            BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder()
                .set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code currencyPair}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'currencyPair'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenCurrencyPair_thenReturnBuilder() {
    // Arrange
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

    // Act
    Builder actualSetResult = builderResult.set("currencyPair", null);

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
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#strikeExtrapolatorLeft(CurveExtrapolator)}.
   *
   * <ul>
   *   <li>When {@link CurveExtrapolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#strikeExtrapolatorLeft(CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test Builder strikeExtrapolatorLeft(CurveExtrapolator); when CurveExtrapolator; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.strikeExtrapolatorLeft(CurveExtrapolator)"})
  void testBuilderStrikeExtrapolatorLeft_whenCurveExtrapolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

    // Act
    Builder actualStrikeExtrapolatorLeftResult =
        builderResult.strikeExtrapolatorLeft(mock(CurveExtrapolator.class));

    // Assert
    assertSame(builderResult, actualStrikeExtrapolatorLeftResult);
  }

  /**
   * Test Builder {@link Builder#strikeExtrapolatorRight(CurveExtrapolator)}.
   *
   * <ul>
   *   <li>When {@link CurveExtrapolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#strikeExtrapolatorRight(CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test Builder strikeExtrapolatorRight(CurveExtrapolator); when CurveExtrapolator; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.strikeExtrapolatorRight(CurveExtrapolator)"})
  void testBuilderStrikeExtrapolatorRight_whenCurveExtrapolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

    // Act
    Builder actualStrikeExtrapolatorRightResult =
        builderResult.strikeExtrapolatorRight(mock(CurveExtrapolator.class));

    // Assert
    assertSame(builderResult, actualStrikeExtrapolatorRightResult);
  }

  /**
   * Test Builder {@link Builder#strikeInterpolator(CurveInterpolator)}.
   *
   * <ul>
   *   <li>When {@link CurveInterpolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#strikeInterpolator(CurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Builder strikeInterpolator(CurveInterpolator); when CurveInterpolator; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.strikeInterpolator(CurveInterpolator)"})
  void testBuilderStrikeInterpolator_whenCurveInterpolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

    // Act
    Builder actualStrikeInterpolatorResult =
        builderResult.strikeInterpolator(mock(CurveInterpolator.class));

    // Assert
    assertSame(builderResult, actualStrikeInterpolatorResult);
  }

  /**
   * Test Builder {@link Builder#timeExtrapolatorLeft(CurveExtrapolator)}.
   *
   * <ul>
   *   <li>When {@link CurveExtrapolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#timeExtrapolatorLeft(CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test Builder timeExtrapolatorLeft(CurveExtrapolator); when CurveExtrapolator; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.timeExtrapolatorLeft(CurveExtrapolator)"})
  void testBuilderTimeExtrapolatorLeft_whenCurveExtrapolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

    // Act
    Builder actualTimeExtrapolatorLeftResult =
        builderResult.timeExtrapolatorLeft(mock(CurveExtrapolator.class));

    // Assert
    assertSame(builderResult, actualTimeExtrapolatorLeftResult);
  }

  /**
   * Test Builder {@link Builder#timeExtrapolatorRight(CurveExtrapolator)}.
   *
   * <ul>
   *   <li>When {@link CurveExtrapolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#timeExtrapolatorRight(CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test Builder timeExtrapolatorRight(CurveExtrapolator); when CurveExtrapolator; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.timeExtrapolatorRight(CurveExtrapolator)"})
  void testBuilderTimeExtrapolatorRight_whenCurveExtrapolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

    // Act
    Builder actualTimeExtrapolatorRightResult =
        builderResult.timeExtrapolatorRight(mock(CurveExtrapolator.class));

    // Assert
    assertSame(builderResult, actualTimeExtrapolatorRightResult);
  }

  /**
   * Test Builder {@link Builder#timeInterpolator(CurveInterpolator)}.
   *
   * <ul>
   *   <li>When {@link CurveInterpolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#timeInterpolator(CurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Builder timeInterpolator(CurveInterpolator); when CurveInterpolator; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.timeInterpolator(CurveInterpolator)"})
  void testBuilderTimeInterpolator_whenCurveInterpolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.builder();

    // Act
    Builder actualTimeInterpolatorResult =
        builderResult.timeInterpolator(mock(CurveInterpolator.class));

    // Assert
    assertSame(builderResult, actualTimeInterpolatorResult);
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
    Class<? extends BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification>
        actualBeanTypeResult =
            BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta().beanType();

    // Assert
    Class<BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification> expectedBeanTypeResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#currencyPair()}
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#nodes()}
   *   <li>{@link Meta#strikeExtrapolatorLeft()}
   *   <li>{@link Meta#strikeExtrapolatorRight()}
   *   <li>{@link Meta#strikeInterpolator()}
   *   <li>{@link Meta#timeExtrapolatorLeft()}
   *   <li>{@link Meta#timeExtrapolatorRight()}
   *   <li>{@link Meta#timeInterpolator()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.currencyPair()",
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.nodes()",
    "MetaProperty Meta.strikeExtrapolatorLeft()",
    "MetaProperty Meta.strikeExtrapolatorRight()",
    "MetaProperty Meta.strikeInterpolator()",
    "MetaProperty Meta.timeExtrapolatorLeft()",
    "MetaProperty Meta.timeExtrapolatorRight()",
    "MetaProperty Meta.timeInterpolator()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta();

    // Act
    MetaProperty<CurrencyPair> actualCurrencyPairResult = metaResult.currencyPair();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<FxOptionVolatilitiesName> actualNameResult = metaResult.name();
    MetaProperty<ImmutableList<FxOptionVolatilitiesNode>> actualNodesResult = metaResult.nodes();
    MetaProperty<CurveExtrapolator> actualStrikeExtrapolatorLeftResult =
        metaResult.strikeExtrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualStrikeExtrapolatorRightResult =
        metaResult.strikeExtrapolatorRight();
    MetaProperty<CurveInterpolator> actualStrikeInterpolatorResult =
        metaResult.strikeInterpolator();
    MetaProperty<CurveExtrapolator> actualTimeExtrapolatorLeftResult =
        metaResult.timeExtrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualTimeExtrapolatorRightResult =
        metaResult.timeExtrapolatorRight();

    // Assert
    assertTrue(actualCurrencyPairResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(actualNodesResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(actualStrikeInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualTimeExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualTimeExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(metaResult.timeInterpolator() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code strikeExtrapolatorLeft}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'strikeExtrapolatorLeft'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsStrikeExtrapolatorLeft() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .metaPropertyGet("strikeExtrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currencyPair() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertEquals("strikeExtrapolatorLeft", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strikeExtrapolatorLeft());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code strikeExtrapolatorRight}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'strikeExtrapolatorRight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsStrikeExtrapolatorRight() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .metaPropertyGet("strikeExtrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currencyPair() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertEquals("strikeExtrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strikeExtrapolatorRight());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code strikeInterpolator}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'strikeInterpolator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsStrikeInterpolator() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .metaPropertyGet("strikeInterpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currencyPair() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertEquals("strikeInterpolator", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).strikeInterpolator());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code timeExtrapolatorLeft}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'timeExtrapolatorLeft'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsTimeExtrapolatorLeft() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .metaPropertyGet("timeExtrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currencyPair() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertEquals("timeExtrapolatorLeft", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeExtrapolatorLeft());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code timeExtrapolatorRight}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'timeExtrapolatorRight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsTimeExtrapolatorRight() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .metaPropertyGet("timeExtrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currencyPair() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertEquals("timeExtrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeExtrapolatorRight());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code currencyPair}.
   *   <li>Then return name is {@code currencyPair}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'currencyPair'; then return name is 'currencyPair'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenCurrencyPair_thenReturnNameIsCurrencyPair() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .metaPropertyGet("currencyPair");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertEquals("currencyPair", actualMetaPropertyGetResult.name());
    Class<CurrencyPair> expectedPropertyTypeResult = CurrencyPair.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).currencyPair());
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
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currencyPair() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertEquals("dayCount", actualMetaPropertyGetResult.name());
    Class<DayCount> expectedPropertyTypeResult = DayCount.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).dayCount());
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
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currencyPair() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<FxOptionVolatilitiesName> expectedPropertyTypeResult = FxOptionVolatilitiesName.class;
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
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .metaPropertyGet("nodes");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currencyPair() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeInterpolator() instanceof DirectMetaProperty);
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
    assertNull(
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code timeInterpolator}.
   *   <li>Then return name is {@code timeInterpolator}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'timeInterpolator'; then return name is 'timeInterpolator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenTimeInterpolator_thenReturnNameIsTimeInterpolator() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .metaPropertyGet("timeInterpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).currencyPair() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).nodes() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).strikeInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).timeExtrapolatorRight() instanceof DirectMetaProperty);
    assertEquals("timeInterpolator", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).timeInterpolator());
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
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta().metaPropertyMap();

    // Assert
    assertEquals(10, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("currencyPair") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("nodes") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("strikeExtrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("strikeExtrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("strikeInterpolator") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("timeExtrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("timeExtrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("timeInterpolator") instanceof DirectMetaProperty);
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
        BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
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
            BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
                .propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code currencyPair}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'currencyPair'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenCurrencyPair_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
                .propertySet(mock(Bean.class), "currencyPair", "New Value", true));
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
            BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", true));
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
            BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
                .propertySet(mock(Bean.class), "currencyPair", "New Value", false));
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
            BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
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
            BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
                .propertySet(mock(Bean.class), "nodes", "New Value", true));
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
            BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code strikeExtrapolatorLeft}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'strikeExtrapolatorLeft'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenStrikeExtrapolatorLeft_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            BlackFxOptionInterpolatedNodalSurfaceVolatilitiesSpecification.meta()
                .propertySet(mock(Bean.class), "strikeExtrapolatorLeft", "New Value", true));
  }
}
