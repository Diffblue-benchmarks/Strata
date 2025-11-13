package com.opengamma.strata.measure.security;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.calc.Measure;
import com.opengamma.strata.calc.runner.CalculationParameters;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.measure.AdvancedMeasures;
import com.opengamma.strata.measure.Measures;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.product.GenericSecurityPosition;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GenericSecurityPositionCalculationFunctionDiffblueTest {
  /**
   * Test {@link GenericSecurityPositionCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link GenericSecurityPositionCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class GenericSecurityPositionCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<GenericSecurityPosition> actualTargetTypeResult =
        new GenericSecurityPositionCalculationFunction().targetType();

    // Assert
    Class<GenericSecurityPosition> expectedTargetTypeResult = GenericSecurityPosition.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link GenericSecurityPositionCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link GenericSecurityPositionCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set GenericSecurityPositionCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(1, new GenericSecurityPositionCalculationFunction().supportedMeasures().size());
  }

  /**
   * Test {@link GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code
   * GenericSecurityPosition}, {@code Set}, {@code CalculationParameters}, {@code
   * ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityPosition', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityPositionCalculationFunction.calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityPositionSetCalculationParametersScenarioMarketDataReferenceData() {
    // Arrange
    GenericSecurityPositionCalculationFunction genericSecurityPositionCalculationFunction =
        new GenericSecurityPositionCalculationFunction();
    HashSet<Measure> measures = new HashSet<>();
    CalculationParameters parameters = CalculationParameters.empty();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap scenarioMarketData =
        new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertTrue(
        genericSecurityPositionCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .isEmpty());
  }

  /**
   * Test {@link GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code
   * GenericSecurityPosition}, {@code Set}, {@code CalculationParameters}, {@code
   * ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityPosition', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityPositionCalculationFunction.calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityPositionSetCalculationParametersScenarioMarketDataReferenceData2() {
    // Arrange
    GenericSecurityPositionCalculationFunction genericSecurityPositionCalculationFunction =
        new GenericSecurityPositionCalculationFunction();

    HashSet<Measure> measures = new HashSet<>();
    measures.add(AdvancedMeasures.PV01_SEMI_PARALLEL_GAMMA_BUCKETED);
    CalculationParameters parameters = CalculationParameters.empty();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap scenarioMarketData =
        new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertEquals(
        1,
        genericSecurityPositionCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .size());
  }

  /**
   * Test {@link GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code
   * GenericSecurityPosition}, {@code Set}, {@code CalculationParameters}, {@code
   * ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityPosition', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityPositionCalculationFunction.calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityPositionSetCalculationParametersScenarioMarketDataReferenceData3() {
    // Arrange
    GenericSecurityPositionCalculationFunction genericSecurityPositionCalculationFunction =
        new GenericSecurityPositionCalculationFunction();

    HashSet<Measure> measures = new HashSet<>();
    measures.add(AdvancedMeasures.PV01_SEMI_PARALLEL_GAMMA_BUCKETED);
    measures.add(AdvancedMeasures.PV01_SEMI_PARALLEL_GAMMA_BUCKETED);
    CalculationParameters parameters = CalculationParameters.empty();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap scenarioMarketData =
        new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertEquals(
        1,
        genericSecurityPositionCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .size());
  }

  /**
   * Test {@link GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code
   * GenericSecurityPosition}, {@code Set}, {@code CalculationParameters}, {@code
   * ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityPosition', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityPositionCalculationFunction.calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityPositionSetCalculationParametersScenarioMarketDataReferenceData4() {
    // Arrange
    GenericSecurityPositionCalculationFunction genericSecurityPositionCalculationFunction =
        new GenericSecurityPositionCalculationFunction();

    HashSet<Measure> measures = new HashSet<>();
    measures.add(Measures.CURRENCY_EXPOSURE);
    CalculationParameters parameters = CalculationParameters.empty();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap scenarioMarketData =
        new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertEquals(
        1,
        genericSecurityPositionCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .size());
  }

  /**
   * Test {@link GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code
   * GenericSecurityPosition}, {@code Set}, {@code CalculationParameters}, {@code
   * ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityPosition', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityPositionCalculationFunction.calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityPositionSetCalculationParametersScenarioMarketDataReferenceData5() {
    // Arrange
    GenericSecurityPositionCalculationFunction genericSecurityPositionCalculationFunction =
        new GenericSecurityPositionCalculationFunction();

    HashSet<Measure> measures = new HashSet<>();
    measures.add(Measures.PRESENT_VALUE);
    CalculationParameters parameters = CalculationParameters.empty();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap scenarioMarketData =
        new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertEquals(
        1,
        genericSecurityPositionCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .size());
  }

  /**
   * Test {@link GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code
   * GenericSecurityPosition}, {@code Set}, {@code CalculationParameters}, {@code
   * ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityPositionCalculationFunction#calculate(GenericSecurityPosition, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityPosition', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityPositionCalculationFunction.calculate(GenericSecurityPosition, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityPositionSetCalculationParametersScenarioMarketDataReferenceData6() {
    // Arrange
    GenericSecurityPositionCalculationFunction genericSecurityPositionCalculationFunction =
        new GenericSecurityPositionCalculationFunction();

    HashSet<Measure> measures = new HashSet<>();
    measures.add(AdvancedMeasures.PV01_SINGLE_NODE_GAMMA_BUCKETED);
    measures.add(AdvancedMeasures.PV01_SEMI_PARALLEL_GAMMA_BUCKETED);
    CalculationParameters parameters = CalculationParameters.empty();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap scenarioMarketData =
        new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertEquals(
        2,
        genericSecurityPositionCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .size());
  }
}
