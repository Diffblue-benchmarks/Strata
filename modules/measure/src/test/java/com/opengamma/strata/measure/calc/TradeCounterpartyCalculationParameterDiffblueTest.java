package com.opengamma.strata.measure.calc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.StandardId;
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

class TradeCounterpartyCalculationParameterDiffblueTest {
  /**
   * Test {@link TradeCounterpartyCalculationParameter#of(Map, CalculationParameter)}.
   *
   * <ul>
   *   <li>Given {@link FxVanillaOptionMethod#BLACK}.
   *   <li>When {@link HashMap#HashMap()} {@code null} is {@link FxVanillaOptionMethod#BLACK}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCounterpartyCalculationParameter#of(Map,
   * CalculationParameter)}
   */
  @Test
  @DisplayName(
      "Test of(Map, CalculationParameter); given BLACK; when HashMap() 'null' is BLACK; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TradeCounterpartyCalculationParameter TradeCounterpartyCalculationParameter.of(Map, CalculationParameter)"
  })
  void testOf_givenBlack_whenHashMapNullIsBlack_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<StandardId, CalculationParameter> parameters = new HashMap<>();
    parameters.put(null, FxVanillaOptionMethod.BLACK);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            TradeCounterpartyCalculationParameter.of(
                parameters, FxSingleBarrierOptionMethod.BLACK));
  }

  /**
   * Test {@link TradeCounterpartyCalculationParameter#of(Map, CalculationParameter)}.
   *
   * <ul>
   *   <li>Then DefaultParameter return {@link FxSingleBarrierOptionMethod}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCounterpartyCalculationParameter#of(Map,
   * CalculationParameter)}
   */
  @Test
  @DisplayName(
      "Test of(Map, CalculationParameter); then DefaultParameter return FxSingleBarrierOptionMethod")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TradeCounterpartyCalculationParameter TradeCounterpartyCalculationParameter.of(Map, CalculationParameter)"
  })
  void testOf_thenDefaultParameterReturnFxSingleBarrierOptionMethod() {
    // Arrange
    HashMap<StandardId, CalculationParameter> parameters = new HashMap<>();
    parameters.put(StandardId.of("Scheme", "42"), FxSingleBarrierOptionMethod.BLACK);

    // Act
    TradeCounterpartyCalculationParameter actualOfResult =
        TradeCounterpartyCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

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
   * Test {@link TradeCounterpartyCalculationParameter#of(Map, CalculationParameter)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCounterpartyCalculationParameter#of(Map,
   * CalculationParameter)}
   */
  @Test
  @DisplayName("Test of(Map, CalculationParameter); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TradeCounterpartyCalculationParameter TradeCounterpartyCalculationParameter.of(Map, CalculationParameter)"
  })
  void testOf_thenThrowIllegalArgumentException() {
    // Arrange
    HashMap<StandardId, CalculationParameter> parameters = new HashMap<>();
    parameters.put(null, CmsSabrExtrapolationParams.of(10.0d, 10.0d));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            TradeCounterpartyCalculationParameter.of(
                parameters, FxSingleBarrierOptionMethod.BLACK));
  }

  /**
   * Test {@link TradeCounterpartyCalculationParameter#filter(CalculationTarget, Measure)}.
   *
   * <ul>
   *   <li>Then return not Present.
   * </ul>
   *
   * <p>Method under test: {@link TradeCounterpartyCalculationParameter#filter(CalculationTarget,
   * Measure)}
   */
  @Test
  @DisplayName("Test filter(CalculationTarget, Measure); then return not Present")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Optional TradeCounterpartyCalculationParameter.filter(CalculationTarget, Measure)"
  })
  void testFilter_thenReturnNotPresent() {
    // Arrange
    HashMap<StandardId, CalculationParameter> parameters = new HashMap<>();
    parameters.put(StandardId.of("Scheme", "42"), FxSingleBarrierOptionMethod.BLACK);
    TradeCounterpartyCalculationParameter ofResult =
        TradeCounterpartyCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    // Act and Assert
    assertFalse(
        ofResult
            .filter(CurveSensitivities.empty(), AdvancedMeasures.PV01_SEMI_PARALLEL_GAMMA_BUCKETED)
            .isPresent());
  }

  /**
   * Test {@link TradeCounterpartyCalculationParameter#meta()}.
   *
   * <p>Method under test: {@link TradeCounterpartyCalculationParameter#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean TradeCounterpartyCalculationParameter.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<TradeCounterpartyCalculationParameter> actualMetaResult =
        TradeCounterpartyCalculationParameter.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("defaultParameter"));
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(metaPropertyMapResult.containsKey("queryType"));
    assertTrue(actualMetaResult.isBuildable());
    Class<TradeCounterpartyCalculationParameter> expectedBeanTypeResult =
        TradeCounterpartyCalculationParameter.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link TradeCounterpartyCalculationParameter#metaBean()}.
   *
   * <ul>
   *   <li>Then return {@link LightMetaBean}.
   * </ul>
   *
   * <p>Method under test: {@link TradeCounterpartyCalculationParameter#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean(); then return LightMetaBean")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean TradeCounterpartyCalculationParameter.metaBean()"})
  void testMetaBean_thenReturnLightMetaBean() {
    // Arrange
    HashMap<StandardId, CalculationParameter> parameters = new HashMap<>();
    parameters.put(StandardId.of("Scheme", "42"), FxSingleBarrierOptionMethod.BLACK);
    TradeCounterpartyCalculationParameter ofResult =
        TradeCounterpartyCalculationParameter.of(parameters, FxSingleBarrierOptionMethod.BLACK);

    // Act
    TypedMetaBean<TradeCounterpartyCalculationParameter> actualMetaBeanResult = ofResult.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    Map<String, MetaProperty<?>> metaPropertyMapResult = actualMetaBeanResult.metaPropertyMap();
    assertEquals(3, metaPropertyMapResult.size());
    assertTrue(metaPropertyMapResult.containsKey("defaultParameter"));
    assertTrue(metaPropertyMapResult.containsKey("parameters"));
    assertTrue(metaPropertyMapResult.containsKey("queryType"));
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<TradeCounterpartyCalculationParameter> expectedBeanTypeResult =
        TradeCounterpartyCalculationParameter.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
