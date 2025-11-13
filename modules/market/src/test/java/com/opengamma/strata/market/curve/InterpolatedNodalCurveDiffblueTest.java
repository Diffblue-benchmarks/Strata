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
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.InterpolatedNodalCurve.Builder;
import com.opengamma.strata.market.curve.InterpolatedNodalCurve.Meta;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolators;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolators;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class InterpolatedNodalCurveDiffblueTest {
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
    Builder builderResult = InterpolatedNodalCurve.builder();

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
    Builder builderResult = InterpolatedNodalCurve.builder();

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
    assertNull(InterpolatedNodalCurve.builder().get("interpolator"));
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
    assertNull(InterpolatedNodalCurve.builder().get("metadata"));
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
        NoSuchElementException.class, () -> InterpolatedNodalCurve.builder().get("Property Name"));
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
    assertNull(InterpolatedNodalCurve.builder().get("xValues"));
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
    assertNull(InterpolatedNodalCurve.builder().get("yValues"));
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
    Builder builderResult = InterpolatedNodalCurve.builder();

    // Act
    Builder actualInterpolatorResult =
        builderResult.interpolator(CurveInterpolators.DOUBLE_QUADRATIC);

    // Assert
    assertSame(builderResult, actualInterpolatorResult);
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
    Builder builderResult = InterpolatedNodalCurve.builder();

    // Act
    Builder actualMetadataResult =
        builderResult.metadata(DefaultCurveMetadata.of(CurveName.of("Name")));

    // Assert
    assertSame(builderResult, actualMetadataResult);
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
        () -> InterpolatedNodalCurve.builder().set("Property Name", "New Value"));
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
    Builder builderResult = InterpolatedNodalCurve.builder();

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
    Builder builderResult = InterpolatedNodalCurve.builder();

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
    Builder builderResult = InterpolatedNodalCurve.builder();

    // Act
    Builder actualYValuesResult = builderResult.yValues(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualYValuesResult);
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
    Class<? extends InterpolatedNodalCurve> actualBeanTypeResult =
        InterpolatedNodalCurve.meta().beanType();

    // Assert
    Class<InterpolatedNodalCurve> expectedBeanTypeResult = InterpolatedNodalCurve.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#extrapolatorLeft()}
   *   <li>{@link Meta#extrapolatorRight()}
   *   <li>{@link Meta#interpolator()}
   *   <li>{@link Meta#metadata()}
   *   <li>{@link Meta#xValues()}
   *   <li>{@link Meta#yValues()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.extrapolatorLeft()",
    "MetaProperty Meta.extrapolatorRight()",
    "MetaProperty Meta.interpolator()",
    "MetaProperty Meta.metadata()",
    "MetaProperty Meta.xValues()",
    "MetaProperty Meta.yValues()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = InterpolatedNodalCurve.meta();

    // Act
    MetaProperty<CurveExtrapolator> actualExtrapolatorLeftResult = metaResult.extrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualExtrapolatorRightResult = metaResult.extrapolatorRight();
    MetaProperty<CurveInterpolator> actualInterpolatorResult = metaResult.interpolator();
    MetaProperty<CurveMetadata> actualMetadataResult = metaResult.metadata();
    MetaProperty<DoubleArray> actualXValuesResult = metaResult.xValues();

    // Assert
    assertTrue(actualExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(actualInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetadataResult instanceof DirectMetaProperty);
    assertTrue(actualXValuesResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yValues() instanceof DirectMetaProperty);
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
        InterpolatedNodalCurve.meta().metaPropertyGet("extrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveExtrapolator> extrapolatorRightResult =
        ((Meta) metaBeanResult).extrapolatorRight();
    assertTrue(extrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> xValuesResult = ((Meta) metaBeanResult).xValues();
    assertTrue(xValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> yValuesResult = ((Meta) metaBeanResult).yValues();
    assertTrue(yValuesResult instanceof DirectMetaProperty);
    assertEquals("extrapolatorLeft", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).extrapolatorLeft());
    assertSame(metaBeanResult, extrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, xValuesResult.metaBean());
    assertSame(metaBeanResult, yValuesResult.metaBean());
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
        InterpolatedNodalCurve.meta().metaPropertyGet("extrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveExtrapolator> extrapolatorLeftResult =
        ((Meta) metaBeanResult).extrapolatorLeft();
    assertTrue(extrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> xValuesResult = ((Meta) metaBeanResult).xValues();
    assertTrue(xValuesResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> yValuesResult = ((Meta) metaBeanResult).yValues();
    assertTrue(yValuesResult instanceof DirectMetaProperty);
    assertEquals("extrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).extrapolatorRight());
    assertSame(metaBeanResult, extrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, xValuesResult.metaBean());
    assertSame(metaBeanResult, yValuesResult.metaBean());
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
        InterpolatedNodalCurve.meta().metaPropertyGet("interpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).metadata() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValues() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValues() instanceof DirectMetaProperty);
    assertEquals("interpolator", actualMetaPropertyGetResult.name());
    Class<CurveInterpolator> expectedPropertyTypeResult = CurveInterpolator.class;
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
        InterpolatedNodalCurve.meta().metaPropertyGet("metadata");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xValues() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yValues() instanceof DirectMetaProperty);
    assertEquals("metadata", actualMetaPropertyGetResult.name());
    Class<CurveMetadata> expectedPropertyTypeResult = CurveMetadata.class;
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
    assertNull(InterpolatedNodalCurve.meta().metaPropertyGet("Property Name"));
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
        InterpolatedNodalCurve.meta().metaPropertyGet("xValues");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveExtrapolator> extrapolatorLeftResult =
        ((Meta) metaBeanResult).extrapolatorLeft();
    assertTrue(extrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> extrapolatorRightResult =
        ((Meta) metaBeanResult).extrapolatorRight();
    assertTrue(extrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> yValuesResult = ((Meta) metaBeanResult).yValues();
    assertTrue(yValuesResult instanceof DirectMetaProperty);
    assertEquals("xValues", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xValues());
    assertSame(metaBeanResult, extrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, extrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, yValuesResult.metaBean());
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
        InterpolatedNodalCurve.meta().metaPropertyGet("yValues");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<CurveExtrapolator> extrapolatorLeftResult =
        ((Meta) metaBeanResult).extrapolatorLeft();
    assertTrue(extrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> extrapolatorRightResult =
        ((Meta) metaBeanResult).extrapolatorRight();
    assertTrue(extrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> interpolatorResult = ((Meta) metaBeanResult).interpolator();
    assertTrue(interpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveMetadata> metadataResult = ((Meta) metaBeanResult).metadata();
    assertTrue(metadataResult instanceof DirectMetaProperty);
    MetaProperty<DoubleArray> xValuesResult = ((Meta) metaBeanResult).xValues();
    assertTrue(xValuesResult instanceof DirectMetaProperty);
    assertEquals("yValues", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yValues());
    assertSame(metaBeanResult, extrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, extrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, interpolatorResult.metaBean());
    assertSame(metaBeanResult, metadataResult.metaBean());
    assertSame(metaBeanResult, xValuesResult.metaBean());
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
        InterpolatedNodalCurve.meta().metaPropertyMap();

    // Assert
    assertEquals(6, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("extrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("extrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("interpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("metadata") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("xValues") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yValues") instanceof DirectMetaProperty);
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
    assertNull(InterpolatedNodalCurve.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'null'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenNull_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> InterpolatedNodalCurve.meta().propertyGet(null, "Property Name", false));
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
            InterpolatedNodalCurve.meta()
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
            InterpolatedNodalCurve.meta()
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
            InterpolatedNodalCurve.meta()
                .propertySet(mock(Bean.class), "extrapolatorLeft", "New Value", false));
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
            InterpolatedNodalCurve.meta()
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
            InterpolatedNodalCurve.meta()
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
            InterpolatedNodalCurve.meta()
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
            InterpolatedNodalCurve.meta()
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
            InterpolatedNodalCurve.meta()
                .propertySet(mock(Bean.class), "yValues", "New Value", true));
  }
}
