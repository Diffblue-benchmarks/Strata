package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.ConstantCurve;
import com.opengamma.strata.market.curve.Curve;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
import com.opengamma.strata.pricer.capfloor.SabrIborCapletFloorletVolatilityCalibrationDefinition.Builder;
import com.opengamma.strata.pricer.capfloor.SabrIborCapletFloorletVolatilityCalibrationDefinition.Meta;
import com.opengamma.strata.pricer.impl.volatility.smile.SabrHaganNormalVolatilityFormula;
import com.opengamma.strata.pricer.model.SabrVolatilityFormula;
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

class SabrIborCapletFloorletVolatilityCalibrationDefinitionDiffblueTest {
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
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

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
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

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
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

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
    assertNull(SabrIborCapletFloorletVolatilityCalibrationDefinition.builder().get("dayCount"));
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
    assertNull(
        SabrIborCapletFloorletVolatilityCalibrationDefinition.builder().get("extrapolatorLeft"));
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
    assertNull(
        SabrIborCapletFloorletVolatilityCalibrationDefinition.builder().get("extrapolatorRight"));
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
    assertNull(SabrIborCapletFloorletVolatilityCalibrationDefinition.builder().get("index"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code initialParameters}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'initialParameters'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenInitialParameters_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        SabrIborCapletFloorletVolatilityCalibrationDefinition.builder().get("initialParameters"));
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
        () -> SabrIborCapletFloorletVolatilityCalibrationDefinition.builder().get("Property Name"));
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
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    // Act
    Builder actualIndexResult = builderResult.index(mock(IborIndex.class));

    // Assert
    assertSame(builderResult, actualIndexResult);
  }

  /**
   * Test Builder {@link Builder#initialParameters(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#initialParameters(DoubleArray)}
   */
  @Test
  @DisplayName("Test Builder initialParameters(DoubleArray); when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.initialParameters(DoubleArray)"})
  void testBuilderInitialParameters_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    // Act
    Builder actualInitialParametersResult = builderResult.initialParameters(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualInitialParametersResult);
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
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    // Act
    Builder actualInterpolatorResult = builderResult.interpolator(mock(CurveInterpolator.class));

    // Assert
    assertSame(builderResult, actualInterpolatorResult);
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
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    // Act
    Builder actualNameResult = builderResult.name(IborCapletFloorletVolatilitiesName.of("Name"));

    // Assert
    assertSame(builderResult, actualNameResult);
  }

  /**
   * Test Builder {@link Builder#parameterCurveNodes(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterCurveNodes(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder parameterCurveNodes(DoubleArray[]) with 'DoubleArray[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterCurveNodes(DoubleArray[])"})
  void testBuilderParameterCurveNodesWithDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    // Act
    Builder actualParameterCurveNodesResult = builderResult.parameterCurveNodes();

    // Assert
    assertSame(builderResult, actualParameterCurveNodesResult);
  }

  /**
   * Test Builder {@link Builder#parameterCurveNodes(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} and {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterCurveNodes(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder parameterCurveNodes(DoubleArray[]) with 'DoubleArray[]'; when DoubleArray and DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterCurveNodes(DoubleArray[])"})
  void testBuilderParameterCurveNodesWithDoubleArray_whenDoubleArrayAndDoubleArray() {
    // Arrange
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();
    DoubleArray ofResult = DoubleArray.of();

    // Act
    Builder actualParameterCurveNodesResult =
        builderResult.parameterCurveNodes(ofResult, DoubleArray.of());

    // Assert
    assertSame(builderResult, actualParameterCurveNodesResult);
  }

  /**
   * Test Builder {@link Builder#parameterCurveNodes(DoubleArray[])} with {@code DoubleArray[]}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterCurveNodes(DoubleArray[])}
   */
  @Test
  @DisplayName(
      "Test Builder parameterCurveNodes(DoubleArray[]) with 'DoubleArray[]'; when DoubleArray; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterCurveNodes(DoubleArray[])"})
  void testBuilderParameterCurveNodesWithDoubleArray_whenDoubleArray_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    // Act
    Builder actualParameterCurveNodesResult = builderResult.parameterCurveNodes(DoubleArray.of());

    // Assert
    assertSame(builderResult, actualParameterCurveNodesResult);
  }

  /**
   * Test Builder {@link Builder#parameterCurveNodes(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterCurveNodes(List)}
   */
  @Test
  @DisplayName("Test Builder parameterCurveNodes(List) with 'List'; given DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterCurveNodes(List)"})
  void testBuilderParameterCurveNodesWithList_givenDoubleArray() {
    // Arrange
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    ArrayList<DoubleArray> parameterCurveNodes = new ArrayList<>();
    parameterCurveNodes.add(DoubleArray.of());

    // Act
    Builder actualParameterCurveNodesResult =
        builderResult.parameterCurveNodes(parameterCurveNodes);

    // Assert
    assertSame(builderResult, actualParameterCurveNodesResult);
  }

  /**
   * Test Builder {@link Builder#parameterCurveNodes(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@link DoubleArray}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterCurveNodes(List)}
   */
  @Test
  @DisplayName("Test Builder parameterCurveNodes(List) with 'List'; given DoubleArray")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterCurveNodes(List)"})
  void testBuilderParameterCurveNodesWithList_givenDoubleArray2() {
    // Arrange
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    ArrayList<DoubleArray> parameterCurveNodes = new ArrayList<>();
    parameterCurveNodes.add(DoubleArray.of());
    parameterCurveNodes.add(DoubleArray.of());

    // Act
    Builder actualParameterCurveNodesResult =
        builderResult.parameterCurveNodes(parameterCurveNodes);

    // Assert
    assertSame(builderResult, actualParameterCurveNodesResult);
  }

  /**
   * Test Builder {@link Builder#parameterCurveNodes(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#parameterCurveNodes(List)}
   */
  @Test
  @DisplayName(
      "Test Builder parameterCurveNodes(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.parameterCurveNodes(List)"})
  void testBuilderParameterCurveNodesWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    // Act
    Builder actualParameterCurveNodesResult = builderResult.parameterCurveNodes(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualParameterCurveNodesResult);
  }

  /**
   * Test Builder {@link Builder#sabrVolatilityFormula(SabrVolatilityFormula)}.
   *
   * <ul>
   *   <li>When {@link SabrHaganNormalVolatilityFormula#DEFAULT}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#sabrVolatilityFormula(SabrVolatilityFormula)}
   */
  @Test
  @DisplayName(
      "Test Builder sabrVolatilityFormula(SabrVolatilityFormula); when DEFAULT; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.sabrVolatilityFormula(SabrVolatilityFormula)"})
  void testBuilderSabrVolatilityFormula_whenDefault_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    // Act
    Builder actualSabrVolatilityFormulaResult =
        builderResult.sabrVolatilityFormula(SabrHaganNormalVolatilityFormula.DEFAULT);

    // Assert
    assertSame(builderResult, actualSabrVolatilityFormulaResult);
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
            SabrIborCapletFloorletVolatilityCalibrationDefinition.builder()
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
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#shiftCurve(Curve)}.
   *
   * <ul>
   *   <li>When {@link Curve}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#shiftCurve(Curve)}
   */
  @Test
  @DisplayName("Test Builder shiftCurve(Curve); when Curve; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.shiftCurve(Curve)"})
  void testBuilderShiftCurve_whenCurve_thenReturnBuilder() {
    // Arrange
    Builder builderResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.builder();

    // Act
    Builder actualShiftCurveResult = builderResult.shiftCurve(mock(Curve.class));

    // Assert
    assertSame(builderResult, actualShiftCurveResult);
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
    Class<? extends SabrIborCapletFloorletVolatilityCalibrationDefinition> actualBeanTypeResult =
        SabrIborCapletFloorletVolatilityCalibrationDefinition.meta().beanType();

    // Assert
    Class<SabrIborCapletFloorletVolatilityCalibrationDefinition> expectedBeanTypeResult =
        SabrIborCapletFloorletVolatilityCalibrationDefinition.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#betaCurve()}
   *   <li>{@link Meta#dayCount()}
   *   <li>{@link Meta#extrapolatorLeft()}
   *   <li>{@link Meta#extrapolatorRight()}
   *   <li>{@link Meta#index()}
   *   <li>{@link Meta#initialParameters()}
   *   <li>{@link Meta#interpolator()}
   *   <li>{@link Meta#name()}
   *   <li>{@link Meta#parameterCurveNodes()}
   *   <li>{@link Meta#rhoCurve()}
   *   <li>{@link Meta#sabrVolatilityFormula()}
   *   <li>{@link Meta#shiftCurve()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.betaCurve()",
    "MetaProperty Meta.dayCount()",
    "MetaProperty Meta.extrapolatorLeft()",
    "MetaProperty Meta.extrapolatorRight()",
    "MetaProperty Meta.index()",
    "MetaProperty Meta.initialParameters()",
    "MetaProperty Meta.interpolator()",
    "MetaProperty Meta.name()",
    "MetaProperty Meta.parameterCurveNodes()",
    "MetaProperty Meta.rhoCurve()",
    "MetaProperty Meta.sabrVolatilityFormula()",
    "MetaProperty Meta.shiftCurve()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.meta();

    // Act
    MetaProperty<Curve> actualBetaCurveResult = metaResult.betaCurve();
    MetaProperty<DayCount> actualDayCountResult = metaResult.dayCount();
    MetaProperty<CurveExtrapolator> actualExtrapolatorLeftResult = metaResult.extrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualExtrapolatorRightResult = metaResult.extrapolatorRight();
    MetaProperty<IborIndex> actualIndexResult = metaResult.index();
    MetaProperty<DoubleArray> actualInitialParametersResult = metaResult.initialParameters();
    MetaProperty<CurveInterpolator> actualInterpolatorResult = metaResult.interpolator();
    MetaProperty<IborCapletFloorletVolatilitiesName> actualNameResult = metaResult.name();
    MetaProperty<ImmutableList<DoubleArray>> actualParameterCurveNodesResult =
        metaResult.parameterCurveNodes();
    MetaProperty<Curve> actualRhoCurveResult = metaResult.rhoCurve();
    MetaProperty<SabrVolatilityFormula> actualSabrVolatilityFormulaResult =
        metaResult.sabrVolatilityFormula();

    // Assert
    assertTrue(actualBetaCurveResult instanceof DirectMetaProperty);
    assertTrue(actualDayCountResult instanceof DirectMetaProperty);
    assertTrue(actualExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(actualIndexResult instanceof DirectMetaProperty);
    assertTrue(actualInitialParametersResult instanceof DirectMetaProperty);
    assertTrue(actualInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualNameResult instanceof DirectMetaProperty);
    assertTrue(actualParameterCurveNodesResult instanceof DirectMetaProperty);
    assertTrue(actualRhoCurveResult instanceof DirectMetaProperty);
    assertTrue(actualSabrVolatilityFormulaResult instanceof DirectMetaProperty);
    assertTrue(metaResult.shiftCurve() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code betaCurve}.
   *   <li>Then return name is {@code betaCurve}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'betaCurve'; then return name is 'betaCurve'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenBetaCurve_thenReturnNameIsBetaCurve() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SabrIborCapletFloorletVolatilityCalibrationDefinition.meta().metaPropertyGet("betaCurve");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialParameters() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("betaCurve", actualMetaPropertyGetResult.name());
    Class<Curve> expectedPropertyTypeResult = Curve.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).betaCurve());
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
        SabrIborCapletFloorletVolatilityCalibrationDefinition.meta().metaPropertyGet("dayCount");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).betaCurve() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialParameters() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
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
        SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()
            .metaPropertyGet("extrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).betaCurve() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialParameters() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
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
        SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()
            .metaPropertyGet("extrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).betaCurve() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialParameters() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
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
        SabrIborCapletFloorletVolatilityCalibrationDefinition.meta().metaPropertyGet("index");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).betaCurve() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialParameters() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("index", actualMetaPropertyGetResult.name());
    Class<IborIndex> expectedPropertyTypeResult = IborIndex.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).index());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code initialParameters}.
   *   <li>Then return name is {@code initialParameters}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'initialParameters'; then return name is 'initialParameters'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenInitialParameters_thenReturnNameIsInitialParameters() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()
            .metaPropertyGet("initialParameters");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).betaCurve() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("initialParameters", actualMetaPropertyGetResult.name());
    Class<DoubleArray> expectedPropertyTypeResult = DoubleArray.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).initialParameters());
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
        SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()
            .metaPropertyGet("interpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(((Meta) metaBeanResult).betaCurve() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).dayCount() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).index() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).initialParameters() instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertEquals("interpolator", actualMetaPropertyGetResult.name());
    Class<CurveInterpolator> expectedPropertyTypeResult = CurveInterpolator.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).interpolator());
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
        SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()
            .metaPropertyGet("Property Name"));
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
        SabrIborCapletFloorletVolatilityCalibrationDefinition.meta().metaPropertyMap();

    // Assert
    assertEquals(12, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("betaCurve") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("dayCount") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("extrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("extrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("index") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("initialParameters") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("interpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("name") instanceof DirectMetaProperty);
    assertTrue(
        actualMetaPropertyMapResult.get("parameterCurveNodes") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("rhoCurve") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("shiftCurve") instanceof DirectMetaProperty);
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
            SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()
                .propertyGet(mock(Bean.class), "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'true'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenTrue_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(
        SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()
            .propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code betaCurve}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'betaCurve'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenBetaCurve_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()
                .propertySet(mock(Bean.class), "betaCurve", "New Value", true));
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
            SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()
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
            SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()
                .propertySet(mock(Bean.class), "betaCurve", "New Value", false));
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
            SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test {@link
   * SabrIborCapletFloorletVolatilityCalibrationDefinition#ofFixedBeta(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator,
   * CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)} with {@code name}, {@code index},
   * {@code dayCount}, {@code beta}, {@code alphaCurveNodes}, {@code rhoCurveNodes}, {@code
   * nuCurveNodes}, {@code interpolator}, {@code extrapolatorLeft}, {@code extrapolatorRight},
   * {@code sabrVolatilityFormula}.
   *
   * <p>Method under test: {@link
   * SabrIborCapletFloorletVolatilityCalibrationDefinition#ofFixedBeta(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator,
   * CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)}
   */
  @Test
  @DisplayName(
      "Test ofFixedBeta(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator, CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula) with 'name', 'index', 'dayCount', 'beta', 'alphaCurveNodes', 'rhoCurveNodes', 'nuCurveNodes', 'interpolator', 'extrapolatorLeft', 'extrapolatorRight', 'sabrVolatilityFormula'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrIborCapletFloorletVolatilityCalibrationDefinition SabrIborCapletFloorletVolatilityCalibrationDefinition.ofFixedBeta(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator, CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)"
  })
  void
      testOfFixedBetaWithNameIndexDayCountBetaAlphaCurveNodesRhoCurveNodesNuCurveNodesInterpolatorExtrapolatorLeftExtrapolatorRightSabrVolatilityFormula() {
    // Arrange
    IborCapletFloorletVolatilitiesName name = IborCapletFloorletVolatilitiesName.of("Name");
    IborIndex index = mock(IborIndex.class);
    DayCount dayCount = mock(DayCount.class);
    DoubleArray alphaCurveNodes = DoubleArray.filled(3);
    DoubleArray rhoCurveNodes = DoubleArray.filled(3);
    CurveInterpolator interpolator = mock(CurveInterpolator.class);
    CurveExtrapolator extrapolatorLeft = mock(CurveExtrapolator.class);
    CurveExtrapolator extrapolatorRight = mock(CurveExtrapolator.class);

    // Act
    SabrIborCapletFloorletVolatilityCalibrationDefinition actualOfFixedBetaResult =
        SabrIborCapletFloorletVolatilityCalibrationDefinition.ofFixedBeta(
            name,
            index,
            dayCount,
            10.0d,
            alphaCurveNodes,
            rhoCurveNodes,
            DoubleArray.filled(3),
            interpolator,
            extrapolatorLeft,
            extrapolatorRight,
            SabrHaganNormalVolatilityFormula.DEFAULT);

    // Assert
    assertTrue(actualOfFixedBetaResult.getShiftCurve() instanceof ConstantCurve);
    SabrVolatilityFormula sabrVolatilityFormula =
        actualOfFixedBetaResult.getSabrVolatilityFormula();
    assertTrue(sabrVolatilityFormula instanceof SabrHaganNormalVolatilityFormula);
    assertEquals(4, actualOfFixedBetaResult.getParameterCurveNodes().size());
    assertFalse(actualOfFixedBetaResult.getRhoCurve().isPresent());
    assertSame(name, actualOfFixedBetaResult.getName());
    assertSame(SabrHaganNormalVolatilityFormula.DEFAULT, sabrVolatilityFormula);
    assertSame(dayCount, actualOfFixedBetaResult.getDayCount());
    assertSame(index, actualOfFixedBetaResult.getIndex());
    assertSame(extrapolatorLeft, actualOfFixedBetaResult.getExtrapolatorLeft());
    assertSame(extrapolatorRight, actualOfFixedBetaResult.getExtrapolatorRight());
    assertSame(interpolator, actualOfFixedBetaResult.getInterpolator());
  }

  /**
   * Test {@link
   * SabrIborCapletFloorletVolatilityCalibrationDefinition#ofFixedBeta(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator,
   * CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)} with {@code name}, {@code index},
   * {@code dayCount}, {@code beta}, {@code shift}, {@code alphaCurveNodes}, {@code rhoCurveNodes},
   * {@code nuCurveNodes}, {@code interpolator}, {@code extrapolatorLeft}, {@code
   * extrapolatorRight}, {@code sabrVolatilityFormula}.
   *
   * <p>Method under test: {@link
   * SabrIborCapletFloorletVolatilityCalibrationDefinition#ofFixedBeta(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator,
   * CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)}
   */
  @Test
  @DisplayName(
      "Test ofFixedBeta(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator, CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula) with 'name', 'index', 'dayCount', 'beta', 'shift', 'alphaCurveNodes', 'rhoCurveNodes', 'nuCurveNodes', 'interpolator', 'extrapolatorLeft', 'extrapolatorRight', 'sabrVolatilityFormula'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrIborCapletFloorletVolatilityCalibrationDefinition SabrIborCapletFloorletVolatilityCalibrationDefinition.ofFixedBeta(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator, CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)"
  })
  void
      testOfFixedBetaWithNameIndexDayCountBetaShiftAlphaCurveNodesRhoCurveNodesNuCurveNodesInterpolatorExtrapolatorLeftExtrapolatorRightSabrVolatilityFormula() {
    // Arrange
    IborCapletFloorletVolatilitiesName name = IborCapletFloorletVolatilitiesName.of("Name");
    IborIndex index = mock(IborIndex.class);
    DayCount dayCount = mock(DayCount.class);
    DoubleArray alphaCurveNodes = DoubleArray.filled(3);
    DoubleArray rhoCurveNodes = DoubleArray.filled(3);
    CurveInterpolator interpolator = mock(CurveInterpolator.class);
    CurveExtrapolator extrapolatorLeft = mock(CurveExtrapolator.class);
    CurveExtrapolator extrapolatorRight = mock(CurveExtrapolator.class);

    // Act
    SabrIborCapletFloorletVolatilityCalibrationDefinition actualOfFixedBetaResult =
        SabrIborCapletFloorletVolatilityCalibrationDefinition.ofFixedBeta(
            name,
            index,
            dayCount,
            10.0d,
            10.0d,
            alphaCurveNodes,
            rhoCurveNodes,
            DoubleArray.filled(3),
            interpolator,
            extrapolatorLeft,
            extrapolatorRight,
            SabrHaganNormalVolatilityFormula.DEFAULT);

    // Assert
    assertTrue(actualOfFixedBetaResult.getShiftCurve() instanceof ConstantCurve);
    SabrVolatilityFormula sabrVolatilityFormula =
        actualOfFixedBetaResult.getSabrVolatilityFormula();
    assertTrue(sabrVolatilityFormula instanceof SabrHaganNormalVolatilityFormula);
    assertEquals(4, actualOfFixedBetaResult.getParameterCurveNodes().size());
    assertFalse(actualOfFixedBetaResult.getRhoCurve().isPresent());
    assertSame(name, actualOfFixedBetaResult.getName());
    assertSame(SabrHaganNormalVolatilityFormula.DEFAULT, sabrVolatilityFormula);
    assertSame(dayCount, actualOfFixedBetaResult.getDayCount());
    assertSame(index, actualOfFixedBetaResult.getIndex());
    assertSame(extrapolatorLeft, actualOfFixedBetaResult.getExtrapolatorLeft());
    assertSame(extrapolatorRight, actualOfFixedBetaResult.getExtrapolatorRight());
    assertSame(interpolator, actualOfFixedBetaResult.getInterpolator());
  }

  /**
   * Test {@link
   * SabrIborCapletFloorletVolatilityCalibrationDefinition#ofFixedRho(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator,
   * CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)} with {@code name}, {@code index},
   * {@code dayCount}, {@code rho}, {@code alphaCurveNodes}, {@code betaCurveNodes}, {@code
   * nuCurveNodes}, {@code interpolator}, {@code extrapolatorLeft}, {@code extrapolatorRight},
   * {@code sabrVolatilityFormula}.
   *
   * <p>Method under test: {@link
   * SabrIborCapletFloorletVolatilityCalibrationDefinition#ofFixedRho(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator,
   * CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)}
   */
  @Test
  @DisplayName(
      "Test ofFixedRho(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator, CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula) with 'name', 'index', 'dayCount', 'rho', 'alphaCurveNodes', 'betaCurveNodes', 'nuCurveNodes', 'interpolator', 'extrapolatorLeft', 'extrapolatorRight', 'sabrVolatilityFormula'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrIborCapletFloorletVolatilityCalibrationDefinition SabrIborCapletFloorletVolatilityCalibrationDefinition.ofFixedRho(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator, CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)"
  })
  void
      testOfFixedRhoWithNameIndexDayCountRhoAlphaCurveNodesBetaCurveNodesNuCurveNodesInterpolatorExtrapolatorLeftExtrapolatorRightSabrVolatilityFormula() {
    // Arrange
    IborCapletFloorletVolatilitiesName name = IborCapletFloorletVolatilitiesName.of("Name");
    IborIndex index = mock(IborIndex.class);
    DayCount dayCount = mock(DayCount.class);
    DoubleArray alphaCurveNodes = DoubleArray.filled(3);
    DoubleArray betaCurveNodes = DoubleArray.filled(3);
    CurveInterpolator interpolator = mock(CurveInterpolator.class);
    CurveExtrapolator extrapolatorLeft = mock(CurveExtrapolator.class);
    CurveExtrapolator extrapolatorRight = mock(CurveExtrapolator.class);

    // Act
    SabrIborCapletFloorletVolatilityCalibrationDefinition actualOfFixedRhoResult =
        SabrIborCapletFloorletVolatilityCalibrationDefinition.ofFixedRho(
            name,
            index,
            dayCount,
            10.0d,
            alphaCurveNodes,
            betaCurveNodes,
            DoubleArray.filled(3),
            interpolator,
            extrapolatorLeft,
            extrapolatorRight,
            SabrHaganNormalVolatilityFormula.DEFAULT);

    // Assert
    assertTrue(actualOfFixedRhoResult.getShiftCurve() instanceof ConstantCurve);
    SabrVolatilityFormula sabrVolatilityFormula = actualOfFixedRhoResult.getSabrVolatilityFormula();
    assertTrue(sabrVolatilityFormula instanceof SabrHaganNormalVolatilityFormula);
    assertEquals(4, actualOfFixedRhoResult.getParameterCurveNodes().size());
    assertFalse(actualOfFixedRhoResult.getBetaCurve().isPresent());
    assertSame(name, actualOfFixedRhoResult.getName());
    assertSame(SabrHaganNormalVolatilityFormula.DEFAULT, sabrVolatilityFormula);
    assertSame(dayCount, actualOfFixedRhoResult.getDayCount());
    assertSame(index, actualOfFixedRhoResult.getIndex());
    assertSame(extrapolatorLeft, actualOfFixedRhoResult.getExtrapolatorLeft());
    assertSame(extrapolatorRight, actualOfFixedRhoResult.getExtrapolatorRight());
    assertSame(interpolator, actualOfFixedRhoResult.getInterpolator());
  }

  /**
   * Test {@link
   * SabrIborCapletFloorletVolatilityCalibrationDefinition#ofFixedRho(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator,
   * CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)} with {@code name}, {@code index},
   * {@code dayCount}, {@code rho}, {@code shift}, {@code alphaCurveNodes}, {@code betaCurveNodes},
   * {@code nuCurveNodes}, {@code interpolator}, {@code extrapolatorLeft}, {@code
   * extrapolatorRight}, {@code sabrVolatilityFormula}.
   *
   * <p>Method under test: {@link
   * SabrIborCapletFloorletVolatilityCalibrationDefinition#ofFixedRho(IborCapletFloorletVolatilitiesName,
   * IborIndex, DayCount, double, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator,
   * CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)}
   */
  @Test
  @DisplayName(
      "Test ofFixedRho(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator, CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula) with 'name', 'index', 'dayCount', 'rho', 'shift', 'alphaCurveNodes', 'betaCurveNodes', 'nuCurveNodes', 'interpolator', 'extrapolatorLeft', 'extrapolatorRight', 'sabrVolatilityFormula'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrIborCapletFloorletVolatilityCalibrationDefinition SabrIborCapletFloorletVolatilityCalibrationDefinition.ofFixedRho(IborCapletFloorletVolatilitiesName, IborIndex, DayCount, double, double, DoubleArray, DoubleArray, DoubleArray, CurveInterpolator, CurveExtrapolator, CurveExtrapolator, SabrVolatilityFormula)"
  })
  void
      testOfFixedRhoWithNameIndexDayCountRhoShiftAlphaCurveNodesBetaCurveNodesNuCurveNodesInterpolatorExtrapolatorLeftExtrapolatorRightSabrVolatilityFormula() {
    // Arrange
    IborCapletFloorletVolatilitiesName name = IborCapletFloorletVolatilitiesName.of("Name");
    IborIndex index = mock(IborIndex.class);
    DayCount dayCount = mock(DayCount.class);
    DoubleArray alphaCurveNodes = DoubleArray.filled(3);
    DoubleArray betaCurveNodes = DoubleArray.filled(3);
    CurveInterpolator interpolator = mock(CurveInterpolator.class);
    CurveExtrapolator extrapolatorLeft = mock(CurveExtrapolator.class);
    CurveExtrapolator extrapolatorRight = mock(CurveExtrapolator.class);

    // Act
    SabrIborCapletFloorletVolatilityCalibrationDefinition actualOfFixedRhoResult =
        SabrIborCapletFloorletVolatilityCalibrationDefinition.ofFixedRho(
            name,
            index,
            dayCount,
            10.0d,
            10.0d,
            alphaCurveNodes,
            betaCurveNodes,
            DoubleArray.filled(3),
            interpolator,
            extrapolatorLeft,
            extrapolatorRight,
            SabrHaganNormalVolatilityFormula.DEFAULT);

    // Assert
    assertTrue(actualOfFixedRhoResult.getShiftCurve() instanceof ConstantCurve);
    SabrVolatilityFormula sabrVolatilityFormula = actualOfFixedRhoResult.getSabrVolatilityFormula();
    assertTrue(sabrVolatilityFormula instanceof SabrHaganNormalVolatilityFormula);
    assertEquals(4, actualOfFixedRhoResult.getParameterCurveNodes().size());
    assertFalse(actualOfFixedRhoResult.getBetaCurve().isPresent());
    assertSame(name, actualOfFixedRhoResult.getName());
    assertSame(SabrHaganNormalVolatilityFormula.DEFAULT, sabrVolatilityFormula);
    assertSame(dayCount, actualOfFixedRhoResult.getDayCount());
    assertSame(index, actualOfFixedRhoResult.getIndex());
    assertSame(extrapolatorLeft, actualOfFixedRhoResult.getExtrapolatorLeft());
    assertSame(extrapolatorRight, actualOfFixedRhoResult.getExtrapolatorRight());
    assertSame(interpolator, actualOfFixedRhoResult.getInterpolator());
  }

  /**
   * Test {@link SabrIborCapletFloorletVolatilityCalibrationDefinition#meta()}.
   *
   * <p>Method under test: {@link SabrIborCapletFloorletVolatilityCalibrationDefinition#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta SabrIborCapletFloorletVolatilityCalibrationDefinition.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = SabrIborCapletFloorletVolatilityCalibrationDefinition.meta();

    // Assert
    assertTrue(actualMetaResult.betaCurve() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.dayCount() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.extrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.extrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.index() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.initialParameters() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.interpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.name() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.parameterCurveNodes() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.rhoCurve() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.sabrVolatilityFormula() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.shiftCurve() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }
}
