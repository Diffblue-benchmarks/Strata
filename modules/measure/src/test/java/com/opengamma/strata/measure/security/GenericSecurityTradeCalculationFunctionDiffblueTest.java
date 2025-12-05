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
import com.opengamma.strata.product.GenericSecurityTrade;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GenericSecurityTradeCalculationFunctionDiffblueTest {
  /**
   * Test {@link GenericSecurityTradeCalculationFunction#targetType()}.
   *
   * <p>Method under test: {@link GenericSecurityTradeCalculationFunction#targetType()}
   */
  @Test
  @DisplayName("Test targetType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class GenericSecurityTradeCalculationFunction.targetType()"})
  void testTargetType() {
    // Arrange and Act
    Class<GenericSecurityTrade> actualTargetTypeResult =
        new GenericSecurityTradeCalculationFunction().targetType();

    // Assert
    Class<GenericSecurityTrade> expectedTargetTypeResult = GenericSecurityTrade.class;
    assertEquals(expectedTargetTypeResult, actualTargetTypeResult);
  }

  /**
   * Test {@link GenericSecurityTradeCalculationFunction#supportedMeasures()}.
   *
   * <p>Method under test: {@link GenericSecurityTradeCalculationFunction#supportedMeasures()}
   */
  @Test
  @DisplayName("Test supportedMeasures()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Set GenericSecurityTradeCalculationFunction.supportedMeasures()"})
  void testSupportedMeasures() {
    // Arrange, Act and Assert
    assertEquals(1, new GenericSecurityTradeCalculationFunction().supportedMeasures().size());
  }

  /**
   * Test {@link GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code GenericSecurityTrade},
   * {@code Set}, {@code CalculationParameters}, {@code ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityTrade', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityTradeCalculationFunction.calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityTradeSetCalculationParametersScenarioMarketDataReferenceData() {
    // Arrange
    GenericSecurityTradeCalculationFunction genericSecurityTradeCalculationFunction =
        new GenericSecurityTradeCalculationFunction();
    HashSet<Measure> measures = new HashSet<>();
    CalculationParameters parameters = CalculationParameters.empty();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap scenarioMarketData =
        new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act and Assert
    assertTrue(
        genericSecurityTradeCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .isEmpty());
  }

  /**
   * Test {@link GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code GenericSecurityTrade},
   * {@code Set}, {@code CalculationParameters}, {@code ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityTrade', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityTradeCalculationFunction.calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityTradeSetCalculationParametersScenarioMarketDataReferenceData2() {
    // Arrange
    GenericSecurityTradeCalculationFunction genericSecurityTradeCalculationFunction =
        new GenericSecurityTradeCalculationFunction();

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
        genericSecurityTradeCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .size());
  }

  /**
   * Test {@link GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code GenericSecurityTrade},
   * {@code Set}, {@code CalculationParameters}, {@code ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityTrade', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityTradeCalculationFunction.calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityTradeSetCalculationParametersScenarioMarketDataReferenceData3() {
    // Arrange
    GenericSecurityTradeCalculationFunction genericSecurityTradeCalculationFunction =
        new GenericSecurityTradeCalculationFunction();

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
        genericSecurityTradeCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .size());
  }

  /**
   * Test {@link GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code GenericSecurityTrade},
   * {@code Set}, {@code CalculationParameters}, {@code ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityTrade', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityTradeCalculationFunction.calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityTradeSetCalculationParametersScenarioMarketDataReferenceData4() {
    // Arrange
    GenericSecurityTradeCalculationFunction genericSecurityTradeCalculationFunction =
        new GenericSecurityTradeCalculationFunction();

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
        genericSecurityTradeCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .size());
  }

  /**
   * Test {@link GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code GenericSecurityTrade},
   * {@code Set}, {@code CalculationParameters}, {@code ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityTrade', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityTradeCalculationFunction.calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityTradeSetCalculationParametersScenarioMarketDataReferenceData5() {
    // Arrange
    GenericSecurityTradeCalculationFunction genericSecurityTradeCalculationFunction =
        new GenericSecurityTradeCalculationFunction();

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
        genericSecurityTradeCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .size());
  }

  /**
   * Test {@link GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)} with {@code GenericSecurityTrade},
   * {@code Set}, {@code CalculationParameters}, {@code ScenarioMarketData}, {@code ReferenceData}.
   *
   * <p>Method under test: {@link
   * GenericSecurityTradeCalculationFunction#calculate(GenericSecurityTrade, Set,
   * CalculationParameters, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData) with 'GenericSecurityTrade', 'Set', 'CalculationParameters', 'ScenarioMarketData', 'ReferenceData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.util.Map GenericSecurityTradeCalculationFunction.calculate(GenericSecurityTrade, Set, CalculationParameters, ScenarioMarketData, ReferenceData)"
  })
  void
      testCalculateWithGenericSecurityTradeSetCalculationParametersScenarioMarketDataReferenceData6() {
    // Arrange
    GenericSecurityTradeCalculationFunction genericSecurityTradeCalculationFunction =
        new GenericSecurityTradeCalculationFunction();

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
        genericSecurityTradeCalculationFunction
            .calculate(null, measures, parameters, scenarioMarketData, mock(ReferenceData.class))
            .size());
  }
}
