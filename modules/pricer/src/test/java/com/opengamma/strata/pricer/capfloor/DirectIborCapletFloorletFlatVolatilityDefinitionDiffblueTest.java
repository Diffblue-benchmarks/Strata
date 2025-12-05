package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
import com.opengamma.strata.pricer.capfloor.DirectIborCapletFloorletFlatVolatilityDefinition.Builder;
import com.opengamma.strata.pricer.capfloor.DirectIborCapletFloorletFlatVolatilityDefinition.Meta;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DirectIborCapletFloorletFlatVolatilityDefinitionDiffblueTest {
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
    Builder builderResult = DirectIborCapletFloorletFlatVolatilityDefinition.builder();

    // Act
    Builder actualDayCountResult = builderResult.dayCount(mock(DayCount.class));

    // Assert
    assertSame(builderResult, actualDayCountResult);
  }

  /**
   * Test Builder {@link Builder#extrapolatorLeft(CurveExtrapolator)}.
   *
   * <ul>
   *   <li>When {@link CurveExtrapolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#extrapolatorLeft(CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test Builder extrapolatorLeft(CurveExtrapolator); when CurveExtrapolator; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.extrapolatorLeft(CurveExtrapolator)"})
  void testBuilderExtrapolatorLeft_whenCurveExtrapolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DirectIborCapletFloorletFlatVolatilityDefinition.builder();

    // Act
    Builder actualExtrapolatorLeftResult =
        builderResult.extrapolatorLeft(mock(CurveExtrapolator.class));

    // Assert
    assertSame(builderResult, actualExtrapolatorLeftResult);
  }

  /**
   * Test Builder {@link Builder#extrapolatorRight(CurveExtrapolator)}.
   *
   * <ul>
   *   <li>When {@link CurveExtrapolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#extrapolatorRight(CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test Builder extrapolatorRight(CurveExtrapolator); when CurveExtrapolator; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.extrapolatorRight(CurveExtrapolator)"})
  void testBuilderExtrapolatorRight_whenCurveExtrapolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DirectIborCapletFloorletFlatVolatilityDefinition.builder();

    // Act
    Builder actualExtrapolatorRightResult =
        builderResult.extrapolatorRight(mock(CurveExtrapolator.class));

    // Assert
    assertSame(builderResult, actualExtrapolatorRightResult);
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
    assertNull(DirectIborCapletFloorletFlatVolatilityDefinition.builder().get("dayCount"));
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
    assertNull(DirectIborCapletFloorletFlatVolatilityDefinition.builder().get("extrapolatorLeft"));
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
    assertNull(DirectIborCapletFloorletFlatVolatilityDefinition.builder().get("extrapolatorRight"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'index'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenIndex_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(DirectIborCapletFloorletFlatVolatilityDefinition.builder().get("index"));
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
    assertNull(DirectIborCapletFloorletFlatVolatilityDefinition.builder().get("interpolator"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code lambda}.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'lambda'; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenLambda_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        ((Double) DirectIborCapletFloorletFlatVolatilityDefinition.builder().get("lambda"))
            .doubleValue());
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
    assertNull(DirectIborCapletFloorletFlatVolatilityDefinition.builder().get("name"));
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
        () -> DirectIborCapletFloorletFlatVolatilityDefinition.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#index(IborIndex)}.
   *
   * <ul>
   *   <li>When {@link IborIndex}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#index(IborIndex)}
   */
  @Test
  @DisplayName("Test Builder index(IborIndex); when IborIndex; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.index(IborIndex)"})
  void testBuilderIndex_whenIborIndex_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DirectIborCapletFloorletFlatVolatilityDefinition.builder();

    // Act
    Builder actualIndexResult = builderResult.index(mock(IborIndex.class));

    // Assert
    assertSame(builderResult, actualIndexResult);
  }

  /**
   * Test Builder {@link Builder#interpolator(CurveInterpolator)}.
   *
   * <ul>
   *   <li>When {@link CurveInterpolator}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#interpolator(CurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test Builder interpolator(CurveInterpolator); when CurveInterpolator; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.interpolator(CurveInterpolator)"})
  void testBuilderInterpolator_whenCurveInterpolator_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DirectIborCapletFloorletFlatVolatilityDefinition.builder();

    // Act
    Builder actualInterpolatorResult = builderResult.interpolator(mock(CurveInterpolator.class));

    // Assert
    assertSame(builderResult, actualInterpolatorResult);
  }

  /**
   * Test Builder {@link Builder#lambda(double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#lambda(double)}
   */
  @Test
  @DisplayName("Test Builder lambda(double); when ten; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.lambda(double)"})
  void testBuilderLambda_whenTen_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DirectIborCapletFloorletFlatVolatilityDefinition.builder();

    // Act
    Builder actualLambdaResult = builderResult.lambda(10.0d);

    // Assert
    assertSame(builderResult, actualLambdaResult);
  }

  /**
   * Test Builder {@link Builder#name(IborCapletFloorletVolatilitiesName)}.
   *
   * <ul>
   *   <li>When {@link IborCapletFloorletVolatilitiesName} with {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#name(IborCapletFloorletVolatilitiesName)}
   */
  @Test
  @DisplayName(
      "Test Builder name(IborCapletFloorletVolatilitiesName); when IborCapletFloorletVolatilitiesName with 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.name(IborCapletFloorletVolatilitiesName)"})
  void testBuilderName_whenIborCapletFloorletVolatilitiesNameWithName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = DirectIborCapletFloorletFlatVolatilityDefinition.builder();

    // Act
    Builder actualNameResult = builderResult.name(IborCapletFloorletVolatilitiesName.of("Name"));

    // Assert
    assertSame(builderResult, actualNameResult);
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
        () ->
            DirectIborCapletFloorletFlatVolatilityDefinition.builder()
                .set("Property Name", "New Value"));
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
    Builder builderResult = DirectIborCapletFloorletFlatVolatilityDefinition.builder();

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
    Class<? extends DirectIborCapletFloorletFlatVolatilityDefinition> actualBeanTypeResult =
        DirectIborCapletFloorletFlatVolatilityDefinition.meta().beanType();

    // Assert
    Class<DirectIborCapletFloorletFlatVolatilityDefinition> expectedBeanTypeResult =
        DirectIborCapletFloorletFlatVolatilityDefinition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#extrapolatorLeft()}
   *   <li>{@link Meta#extrapolatorRight()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#interpolator()}
   *   <li>{@link Meta#lambda()}
   *   <li>{@link Meta#name()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.extrapolatorLeft()",
    "MetaProperty Meta.extrapolatorRight()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.interpolator()",
    "MetaProperty Meta.lambda()",
    "MetaProperty Meta.name()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = DirectIborCapletFloorletFlatVolatilityDefinition.meta();

    // Act
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<CurveExtrapolator> actualExtrapolatorLeftResult = metaResult.extrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualExtrapolatorRightResult = metaResult.extrapolatorRight();
    MetaProperty<IborIndex> actualIndexResult = metaResult.index();
    MetaProperty<CurveInterpolator> actualInterpolatorResult = metaResult.interpolator();
    MetaProperty<Double> actualLambdaResult = metaResult.lambda();

    // Assert
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualLambdaResult instanceof DirectMetaProperty);
    assertTrue(metaResult.name() instanceof DirectMetaProperty);
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
        DirectIborCapletFloorletFlatVolatilityDefinition.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lambda() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
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
        DirectIborCapletFloorletFlatVolatilityDefinition.meta().metaPropertyGet("extrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lambda() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
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
        DirectIborCapletFloorletFlatVolatilityDefinition.meta()
            .metaPropertyGet("extrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lambda() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertEquals("extrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).extrapolatorRight());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then return name is {@code index}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'index'; then return name is 'index'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenIndex_thenReturnNameIsIndex() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DirectIborCapletFloorletFlatVolatilityDefinition.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lambda() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<IborIndex> expectedPropertyTypeResult = IborIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
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
        DirectIborCapletFloorletFlatVolatilityDefinition.meta().metaPropertyGet("interpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lambda() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertEquals("interpolator", actualMetaPropertyGetResult.name());
    Class<CurveInterpolator> expectedPropertyTypeResult = CurveInterpolator.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).interpolator());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code lambda}.
   *   <li>Then return propertyType Name is {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'lambda'; then return propertyType Name is 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenLambda_thenReturnPropertyTypeNameIsDouble() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        DirectIborCapletFloorletFlatVolatilityDefinition.meta().metaPropertyGet("lambda");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).name() instanceof DirectMetaProperty);
    assertEquals("double", actualMetaPropertyGetResult.propertyType().getName());
    assertEquals("lambda", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).lambda());
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
        DirectIborCapletFloorletFlatVolatilityDefinition.meta().metaPropertyGet("name");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).lambda() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("name", actualMetaPropertyGetResult.name());
    Class<IborCapletFloorletVolatilitiesName> expectedPropertyTypeResult =
        IborCapletFloorletVolatilitiesName.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).name());
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
        DirectIborCapletFloorletFlatVolatilityDefinition.meta().metaPropertyGet("Property Name"));
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
        DirectIborCapletFloorletFlatVolatilityDefinition.meta().metaPropertyMap();

    // Assert
    assertEquals(7, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("extrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("extrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("interpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("lambda") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
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
        DirectIborCapletFloorletFlatVolatilityDefinition.meta()
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
            DirectIborCapletFloorletFlatVolatilityDefinition.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
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
            DirectIborCapletFloorletFlatVolatilityDefinition.meta()
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
            DirectIborCapletFloorletFlatVolatilityDefinition.meta()
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
            DirectIborCapletFloorletFlatVolatilityDefinition.meta()
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
            DirectIborCapletFloorletFlatVolatilityDefinition.meta()
                .propertySet(mock(Bean.class), "dayCount", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code index}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'index'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenIndex_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DirectIborCapletFloorletFlatVolatilityDefinition.meta()
                .propertySet(mock(Bean.class), "index", "New Value", true));
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
            DirectIborCapletFloorletFlatVolatilityDefinition.meta()
                .propertySet(mock(Bean.class), "interpolator", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code lambda}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'lambda'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenLambda_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            DirectIborCapletFloorletFlatVolatilityDefinition.meta()
                .propertySet(mock(Bean.class), "lambda", "New Value", true));
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
            DirectIborCapletFloorletFlatVolatilityDefinition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link
   * DirectIborCapletFloorletFlatVolatilityDefinition#of(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)} with
   * {@code name}, {@code index}, {@code dayCount}, {@code lambda}, {@code interpolator}, {@code
   * extrapolatorLeft}, {@code extrapolatorRight}.
   *
   * <p>Method under test: {@link
   * DirectIborCapletFloorletFlatVolatilityDefinition#of(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test of(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, CurveInterpolator, CurveExtrapolator, CurveExtrapolator) with 'name', 'index', 'dayCount', 'lambda', 'interpolator', 'extrapolatorLeft', 'extrapolatorRight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DirectIborCapletFloorletFlatVolatilityDefinition DirectIborCapletFloorletFlatVolatilityDefinition.of(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, CurveInterpolator, CurveExtrapolator, CurveExtrapolator)"
  })
  void testOfWithNameIndexDayCountLambdaInterpolatorExtrapolatorLeftExtrapolatorRight() {
    // Arrange
    IborCapletFloorletVolatilitiesName name = IborCapletFloorletVolatilitiesName.of("Name");
    IborIndex index = mock(IborIndex.class);
    DayCount dayCount = mock(DayCount.class);
    CurveInterpolator interpolator = mock(CurveInterpolator.class);
    CurveExtrapolator extrapolatorLeft = mock(CurveExtrapolator.class);
    CurveExtrapolator extrapolatorRight = mock(CurveExtrapolator.class);

    // Act
    DirectIborCapletFloorletFlatVolatilityDefinition actualOfResult =
        DirectIborCapletFloorletFlatVolatilityDefinition.of(
            name, index, dayCount, 10.0d, interpolator, extrapolatorLeft, extrapolatorRight);

    // Assert
    assertEquals(10.0d, actualOfResult.getLambda());
    assertSame(name, actualOfResult.getName());
    assertSame(dayCount, actualOfResult.getDayCount());
    assertSame(index, actualOfResult.getIndex());
    assertSame(extrapolatorLeft, actualOfResult.getExtrapolatorLeft());
    assertSame(extrapolatorRight, actualOfResult.getExtrapolatorRight());
    assertSame(interpolator, actualOfResult.getInterpolator());
  }

  /**
   * Test {@link
   * DirectIborCapletFloorletFlatVolatilityDefinition#of(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, CurveInterpolator)} with {@code name}, {@code index}, {@code
   * dayCount}, {@code lambda}, {@code interpolator}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Lambda is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * DirectIborCapletFloorletFlatVolatilityDefinition#of(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, CurveInterpolator)}
   */
  @Test
  @DisplayName(
      "Test of(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, CurveInterpolator) with 'name', 'index', 'dayCount', 'lambda', 'interpolator'; when ten; then return Lambda is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DirectIborCapletFloorletFlatVolatilityDefinition DirectIborCapletFloorletFlatVolatilityDefinition.of(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, CurveInterpolator)"
  })
  void testOfWithNameIndexDayCountLambdaInterpolator_whenTen_thenReturnLambdaIsTen() {
    // Arrange
    IborCapletFloorletVolatilitiesName name = IborCapletFloorletVolatilitiesName.of("Name");
    IborIndex index = mock(IborIndex.class);
    DayCount dayCount = mock(DayCount.class);
    CurveInterpolator interpolator = mock(CurveInterpolator.class);

    // Act
    DirectIborCapletFloorletFlatVolatilityDefinition actualOfResult =
        DirectIborCapletFloorletFlatVolatilityDefinition.of(
            name, index, dayCount, 10.0d, interpolator);

    // Assert
    assertEquals(10.0d, actualOfResult.getLambda());
    assertSame(name, actualOfResult.getName());
    assertSame(dayCount, actualOfResult.getDayCount());
    assertSame(index, actualOfResult.getIndex());
    assertSame(interpolator, actualOfResult.getInterpolator());
  }

  /**
   * Test {@link DirectIborCapletFloorletFlatVolatilityDefinition#meta()}.
   *
   * <p>Method under test: {@link DirectIborCapletFloorletFlatVolatilityDefinition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta DirectIborCapletFloorletFlatVolatilityDefinition.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = DirectIborCapletFloorletFlatVolatilityDefinition.meta();

    // Assert
    assertTrue(actualMetaResult.dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.index() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.lambda() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }
}
