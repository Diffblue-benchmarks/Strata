package com.opengamma.strata.measure.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.calc.Measure;
import com.opengamma.strata.calc.runner.CalculationParameter;
import com.opengamma.strata.market.sensitivity.CurveSensitivities;
import com.opengamma.strata.measure.AdvancedMeasures;
import com.opengamma.strata.measure.cms.CmsSabrExtrapolationParams;
import com.opengamma.strata.measure.fxopt.FxSingleBarrierOptionMethod;
import com.opengamma.strata.measure.fxopt.FxVanillaOptionMethod;
import java.util.HashMap;
import java.util.Map;
import org.joda.beans.MetaProperty;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TargetTypeCalculationParameterDiffblueTest {
  /**
   * Test {@link TargetTypeCalculationParameter#of(Map, CalculationParameter)}.
   *
   * <ul>
   *   <li>Given {@link FxVanillaOptionMethod#BLACK}.
   *   <li>When {@link HashMap#HashMap()} {@link Object} is {@link FxVanillaOptionMethod#BLACK}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#of(Map, CalculationParameter)}
   */
  @Test
  @DisplayName(
      "Test of(Map, CalculationParameter); given BLACK; when HashMap() Object is BLACK; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TargetTypeCalculationParameter TargetTypeCalculationParameter.of(Map, CalculationParameter)"
  })
  void testOf_givenBlack_whenHashMapObjectIsBlack_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    parameters.put(forNameResult, FxVanillaOptionMethod.BLACK);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK));
  }

  /**
   * Test {@link TargetTypeCalculationParameter#of(Map, CalculationParameter)}.
   *
   * <ul>
   *   <li>Given {@link CmsSabrExtrapolationParams} with cutOffStrike is ten and mu is ten.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#of(Map, CalculationParameter)}
   */
  @Test
  @DisplayName(
      "Test of(Map, CalculationParameter); given CmsSabrExtrapolationParams with cutOffStrike is ten and mu is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TargetTypeCalculationParameter TargetTypeCalculationParameter.of(Map, CalculationParameter)"
  })
  void testOf_givenCmsSabrExtrapolationParamsWithCutOffStrikeIsTenAndMuIsTen() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    parameters.put(forNameResult, CmsSabrExtrapolationParams.of(10.0d, 10.0d));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK));
  }

  /**
   * Test {@link TargetTypeCalculationParameter#of(Map, CalculationParameter)}.
   *
   * <ul>
   *   <li>Given {@code CalculationParameter}.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#of(Map, CalculationParameter)}
   */
  @Test
  @DisplayName(
      "Test of(Map, CalculationParameter); given 'com.opengamma.strata.calc.runner.CalculationParameter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TargetTypeCalculationParameter TargetTypeCalculationParameter.of(Map, CalculationParameter)"
  })
  void testOf_givenComOpengammaStrataCalcRunnerCalculationParameter() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<CalculationParameter> forNameResult = CalculationParameter.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);
    Class<Object> forNameResult2 = Object.class;
    parameters.put(forNameResult2, FxSingleBarrierOptionMethod.BLACK);

    // Act
    TargetTypeCalculationParameter actualOfResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    // Assert
    CalculationParameter defaultParameter = actualOfResult.getDefaultParameter();
    assertTrue(defaultParameter instanceof FxSingleBarrierOptionMethod);
    assertEquals(FxSingleBarrierOptionMethod.BLACK, defaultParameter);
    assertEquals(parameters, actualOfResult.getParameters());
    Class<FxSingleBarrierOptionMethod> expectedQueryType = FxSingleBarrierOptionMethod.class;
    assertEquals(expectedQueryType, actualOfResult.getQueryType());
    Class<FxSingleBarrierOptionMethod> expectedQueryTypeResult = FxSingleBarrierOptionMethod.class;
    assertEquals(expectedQueryTypeResult, actualOfResult.queryType());
  }

  /**
   * Test {@link TargetTypeCalculationParameter#of(Map, CalculationParameter)}.
   *
   * <ul>
   *   <li>Given {@code TargetTypeCalculationParameter}.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#of(Map, CalculationParameter)}
   */
  @Test
  @DisplayName(
      "Test of(Map, CalculationParameter); given 'com.opengamma.strata.measure.calc.TargetTypeCalculationParameter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TargetTypeCalculationParameter TargetTypeCalculationParameter.of(Map, CalculationParameter)"
  })
  void testOf_givenComOpengammaStrataMeasureCalcTargetTypeCalculationParameter() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<TargetTypeCalculationParameter> forNameResult = TargetTypeCalculationParameter.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);
    Class<Object> forNameResult2 = Object.class;
    parameters.put(forNameResult2, FxSingleBarrierOptionMethod.BLACK);

    // Act
    TargetTypeCalculationParameter actualOfResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    // Assert
    CalculationParameter defaultParameter = actualOfResult.getDefaultParameter();
    assertTrue(defaultParameter instanceof FxSingleBarrierOptionMethod);
    assertEquals(FxSingleBarrierOptionMethod.BLACK, defaultParameter);
    assertEquals(parameters, actualOfResult.getParameters());
    Class<FxSingleBarrierOptionMethod> expectedQueryType = FxSingleBarrierOptionMethod.class;
    assertEquals(expectedQueryType, actualOfResult.getQueryType());
    Class<FxSingleBarrierOptionMethod> expectedQueryTypeResult = FxSingleBarrierOptionMethod.class;
    assertEquals(expectedQueryTypeResult, actualOfResult.queryType());
  }

  /**
   * Test {@link TargetTypeCalculationParameter#of(Map, CalculationParameter)}.
   *
   * <ul>
   *   <li>Then DefaultParameter return {@link FxSingleBarrierOptionMethod}.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#of(Map, CalculationParameter)}
   */
  @Test
  @DisplayName(
      "Test of(Map, CalculationParameter); then DefaultParameter return FxSingleBarrierOptionMethod")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TargetTypeCalculationParameter TargetTypeCalculationParameter.of(Map, CalculationParameter)"
  })
  void testOf_thenDefaultParameterReturnFxSingleBarrierOptionMethod() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);

    // Act
    TargetTypeCalculationParameter actualOfResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    // Assert
    CalculationParameter defaultParameter = actualOfResult.getDefaultParameter();
    assertTrue(defaultParameter instanceof FxSingleBarrierOptionMethod);
    assertEquals(FxSingleBarrierOptionMethod.BLACK, defaultParameter);
    assertEquals(parameters, actualOfResult.getParameters());
    Class<FxSingleBarrierOptionMethod> expectedQueryType = FxSingleBarrierOptionMethod.class;
    assertEquals(expectedQueryType, actualOfResult.getQueryType());
    Class<FxSingleBarrierOptionMethod> expectedQueryTypeResult = FxSingleBarrierOptionMethod.class;
    assertEquals(expectedQueryTypeResult, actualOfResult.queryType());
  }

  /**
   * Test {@link TargetTypeCalculationParameter#filter(CalculationTarget, Measure)}.
   *
   * <ul>
   *   <li>Given {@code CalculationParameter}.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#filter(CalculationTarget, Measure)}
   */
  @Test
  @DisplayName(
      "Test filter(CalculationTarget, Measure); given 'com.opengamma.strata.calc.runner.CalculationParameter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional TargetTypeCalculationParameter.filter(CalculationTarget, Measure)"
  })
  void testFilter_givenComOpengammaStrataCalcRunnerCalculationParameter() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<CalculationParameter> forNameResult = CalculationParameter.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);
    Class<Object> forNameResult2 = Object.class;
    parameters.put(forNameResult2, FxSingleBarrierOptionMethod.BLACK);
    TargetTypeCalculationParameter ofResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    // Act and Assert
    assertFalse(
        ofResult
            .filter(CurveSensitivities.empty(), AdvancedMeasures.PV01_SEMI_PARALLEL_GAMMA_BUCKETED)
            .isPresent());
  }

  /**
   * Test {@link TargetTypeCalculationParameter#filter(CalculationTarget, Measure)}.
   *
   * <ul>
   *   <li>Given {@code TargetTypeCalculationParameter}.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#filter(CalculationTarget, Measure)}
   */
  @Test
  @DisplayName(
      "Test filter(CalculationTarget, Measure); given 'com.opengamma.strata.measure.calc.TargetTypeCalculationParameter'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional TargetTypeCalculationParameter.filter(CalculationTarget, Measure)"
  })
  void testFilter_givenComOpengammaStrataMeasureCalcTargetTypeCalculationParameter() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<TargetTypeCalculationParameter> forNameResult = TargetTypeCalculationParameter.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);
    Class<Object> forNameResult2 = Object.class;
    parameters.put(forNameResult2, FxSingleBarrierOptionMethod.BLACK);
    TargetTypeCalculationParameter ofResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    // Act and Assert
    assertFalse(
        ofResult
            .filter(CurveSensitivities.empty(), AdvancedMeasures.PV01_SEMI_PARALLEL_GAMMA_BUCKETED)
            .isPresent());
  }

  /**
   * Test {@link TargetTypeCalculationParameter#filter(CalculationTarget, Measure)}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>When empty.
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#filter(CalculationTarget, Measure)}
   */
  @Test
  @DisplayName(
      "Test filter(CalculationTarget, Measure); given 'java.lang.Object'; when empty; then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional TargetTypeCalculationParameter.filter(CalculationTarget, Measure)"
  })
  void testFilter_givenJavaLangObject_whenEmpty_thenReturnNotPresent() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);
    TargetTypeCalculationParameter ofResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    // Act and Assert
    assertFalse(
        ofResult
            .filter(CurveSensitivities.empty(), AdvancedMeasures.PV01_SEMI_PARALLEL_GAMMA_BUCKETED)
            .isPresent());
  }

  /**
   * Test {@link TargetTypeCalculationParameter#meta()}.
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean TargetTypeCalculationParameter.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<TargetTypeCalculationParameter> actualMetaResult =
        TargetTypeCalculationParameter.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("defaultParameter"));
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(metaPropertyMapResult.containsKey("queryType"));
    assertTrue(actualMetaResult.isBuildable());
    Class<TargetTypeCalculationParameter> expectedBeanTypeResult =
        TargetTypeCalculationParameter.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link TargetTypeCalculationParameter#metaBean()}.
   *
   * <ul>
   *   <li>Given {@code Object}.
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); given 'java.lang.Object'; then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean TargetTypeCalculationParameter.metaBean()"})
  void testMetaBean_givenJavaLangObject_thenReturnLightMetaBean() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);
    TargetTypeCalculationParameter ofResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    // Act
    TypedMetaBean<TargetTypeCalculationParameter> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("defaultParameter"));
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(metaPropertyMapResult.containsKey("queryType"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<TargetTypeCalculationParameter> expectedBeanTypeResult =
        TargetTypeCalculationParameter.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link TargetTypeCalculationParameter#equals(Object)}, and {@link
   * TargetTypeCalculationParameter#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TargetTypeCalculationParameter#equals(Object)}
   *   <li>{@link TargetTypeCalculationParameter#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TargetTypeCalculationParameter.equals(Object)",
    "int TargetTypeCalculationParameter.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);
    TargetTypeCalculationParameter ofResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    HashMap<Class<?>, CalculationParameter> parameters2 = new HashMap<>();
    Class<Object> forNameResult2 = Object.class;
    parameters2.put(forNameResult2, FxSingleBarrierOptionMethod.BLACK);
    TargetTypeCalculationParameter ofResult2 =
        TargetTypeCalculationParameter.of(parameters2, FxSingleBarrierOptionMethod.BLACK);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link TargetTypeCalculationParameter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TargetTypeCalculationParameter.equals(Object)",
    "int TargetTypeCalculationParameter.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);
    TargetTypeCalculationParameter ofResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    HashMap<Class<?>, CalculationParameter> parameters2 = new HashMap<>();
    Class<CalculationParameter> forNameResult2 = CalculationParameter.class;
    parameters2.put(forNameResult2, FxSingleBarrierOptionMethod.BLACK);

    // Act and Assert
    assertNotEquals(
        ofResult,
        TargetTypeCalculationParameter.of(parameters2, FxSingleBarrierOptionMethod.BLACK));
  }

  /**
   * Test {@link TargetTypeCalculationParameter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TargetTypeCalculationParameter.equals(Object)",
    "int TargetTypeCalculationParameter.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);
    TargetTypeCalculationParameter ofResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    // Act and Assert
    assertNotEquals(ofResult, 1);
  }

  /**
   * Test {@link TargetTypeCalculationParameter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TargetTypeCalculationParameter.equals(Object)",
    "int TargetTypeCalculationParameter.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);
    TargetTypeCalculationParameter ofResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    // Act and Assert
    assertNotEquals(ofResult, null);
  }

  /**
   * Test {@link TargetTypeCalculationParameter#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TargetTypeCalculationParameter#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean TargetTypeCalculationParameter.equals(Object)",
    "int TargetTypeCalculationParameter.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    HashMap<Class<?>, CalculationParameter> parameters = new HashMap<>();
    Class<Object> forNameResult = Object.class;
    parameters.put(forNameResult, FxSingleBarrierOptionMethod.BLACK);
    TargetTypeCalculationParameter ofResult =
        TargetTypeCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.TRINOMIAL_TREE);

    HashMap<Class<?>, CalculationParameter> parameters2 = new HashMap<>();
    Class<Object> forNameResult2 = Object.class;
    parameters2.put(forNameResult2, FxSingleBarrierOptionMethod.BLACK);

    // Act and Assert
    assertNotEquals(
        ofResult,
        TargetTypeCalculationParameter.of(parameters2, FxSingleBarrierOptionMethod.BLACK));
  }
}
