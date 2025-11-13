package com.opengamma.strata.measure.fxopt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyPair;
import com.opengamma.strata.calc.runner.CalculationParameter;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.pricer.fxopt.FxOptionVolatilitiesId;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FxOptionMarketDataLookupDiffblueTest {
  /**
   * Test {@link FxOptionMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <ul>
   *   <li>When {@link HashMap#HashMap()}.
   *   <li>Then return {@link DefaultFxOptionMarketDataLookup}.
   * </ul>
   *
   * <p>Method under test: {@link FxOptionMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'volatilityIds'; when HashMap(); then return DefaultFxOptionMarketDataLookup")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxOptionMarketDataLookup FxOptionMarketDataLookup.of(Map)"})
  void testOfWithVolatilityIds_whenHashMap_thenReturnDefaultFxOptionMarketDataLookup() {
    // Arrange
    HashMap<CurrencyPair, FxOptionVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    FxOptionMarketDataLookup actualOfResult = FxOptionMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult instanceof DefaultFxOptionMarketDataLookup);
    assertTrue(actualOfResult.getVolatilityCurrencyPairs().isEmpty());
    assertEquals(
        volatilityIds, ((DefaultFxOptionMarketDataLookup) actualOfResult).getVolatilityIds());
  }

  /**
   * Test {@link FxOptionMarketDataLookup#queryType()}.
   *
   * <p>Method under test: {@link FxOptionMarketDataLookup#queryType()}
   */
  @Test
  @DisplayName("Test queryType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class FxOptionMarketDataLookup.queryType()"})
  void testQueryType() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act
    Class<? extends CalculationParameter> actualQueryTypeResult = ofResult.queryType();

    // Assert
    Class<FxOptionMarketDataLookup> expectedQueryTypeResult = FxOptionMarketDataLookup.class;
    assertEquals(expectedQueryTypeResult, actualQueryTypeResult);
  }

  /**
   * Test {@link FxOptionMarketDataLookup#requirements(CurrencyPair[])} with {@code CurrencyPair[]}.
   *
   * <ul>
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link FxOptionMarketDataLookup#requirements(CurrencyPair[])}
   */
  @Test
  @DisplayName(
      "Test requirements(CurrencyPair[]) with 'CurrencyPair[]'; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements FxOptionMarketDataLookup.requirements(CurrencyPair[])"})
  void testRequirementsWithCurrencyPair_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());

    // Act
    FunctionRequirements actualRequirementsResult = ofResult.requirements();

    // Assert
    ObservableSource observableSource = actualRequirementsResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    ImmutableSet<Currency> outputCurrencies = actualRequirementsResult.getOutputCurrencies();
    assertTrue(outputCurrencies.isEmpty());
    assertSame(outputCurrencies, actualRequirementsResult.getTimeSeriesRequirements());
    assertSame(outputCurrencies, actualRequirementsResult.getValueRequirements());
  }

  /**
   * Test {@link FxOptionMarketDataLookup#marketDataView(MarketData)} with {@code MarketData}.
   *
   * <ul>
   *   <li>Then return {@link DefaultFxOptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link FxOptionMarketDataLookup#marketDataView(MarketData)}
   */
  @Test
  @DisplayName(
      "Test marketDataView(MarketData) with 'MarketData'; then return DefaultFxOptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FxOptionMarketData FxOptionMarketDataLookup.marketDataView(MarketData)"})
  void testMarketDataViewWithMarketData_thenReturnDefaultFxOptionMarketData() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    FxOptionMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultFxOptionMarketData);
    assertNull(actualMarketDataViewResult.getValuationDate());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
  }

  /**
   * Test {@link FxOptionMarketDataLookup#marketDataView(ScenarioMarketData)} with {@code
   * ScenarioMarketData}.
   *
   * <p>Method under test: {@link FxOptionMarketDataLookup#marketDataView(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(ScenarioMarketData) with 'ScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FxOptionScenarioMarketData FxOptionMarketDataLookup.marketDataView(ScenarioMarketData)"
  })
  void testMarketDataViewWithScenarioMarketData() {
    // Arrange
    DefaultFxOptionMarketDataLookup ofResult = DefaultFxOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    FxOptionScenarioMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultFxOptionScenarioMarketData);
    assertEquals(1, actualMarketDataViewResult.getScenarioCount());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
  }
}
