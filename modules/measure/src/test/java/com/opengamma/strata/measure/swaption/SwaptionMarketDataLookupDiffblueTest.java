package com.opengamma.strata.measure.swaption;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.index.RateIndex;
import com.opengamma.strata.calc.runner.CalculationParameter;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.pricer.swaption.SwaptionVolatilitiesId;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwaptionMarketDataLookupDiffblueTest {
  /**
   * Test {@link SwaptionMarketDataLookup#of(RateIndex, SwaptionVolatilitiesId)} with {@code index},
   * {@code volatilityId}.
   *
   * <ul>
   *   <li>Then return {@link DefaultSwaptionMarketDataLookup}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionMarketDataLookup#of(RateIndex, SwaptionVolatilitiesId)}
   */
  @Test
  @DisplayName(
      "Test of(RateIndex, SwaptionVolatilitiesId) with 'index', 'volatilityId'; then return DefaultSwaptionMarketDataLookup")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwaptionMarketDataLookup SwaptionMarketDataLookup.of(RateIndex, SwaptionVolatilitiesId)"
  })
  void testOfWithIndexVolatilityId_thenReturnDefaultSwaptionMarketDataLookup() {
    // Arrange
    RateIndex index = mock(RateIndex.class);

    // Act
    SwaptionMarketDataLookup actualOfResult =
        SwaptionMarketDataLookup.of(index, SwaptionVolatilitiesId.of("Name"));

    // Assert
    assertTrue(actualOfResult instanceof DefaultSwaptionMarketDataLookup);
    assertEquals(1, actualOfResult.getVolatilityIndices().size());
    assertEquals(1, ((DefaultSwaptionMarketDataLookup) actualOfResult).getVolatilityIds().size());
  }

  /**
   * Test {@link SwaptionMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <p>Method under test: {@link SwaptionMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'volatilityIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionMarketDataLookup SwaptionMarketDataLookup.of(Map)"})
  void testOfWithVolatilityIds() {
    // Arrange
    HashMap<RateIndex, SwaptionVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    SwaptionMarketDataLookup actualOfResult = SwaptionMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult instanceof DefaultSwaptionMarketDataLookup);
    assertTrue(actualOfResult.getVolatilityIndices().isEmpty());
    assertEquals(
        volatilityIds, ((DefaultSwaptionMarketDataLookup) actualOfResult).getVolatilityIds());
  }

  /**
   * Test {@link SwaptionMarketDataLookup#queryType()}.
   *
   * <p>Method under test: {@link SwaptionMarketDataLookup#queryType()}
   */
  @Test
  @DisplayName("Test queryType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class SwaptionMarketDataLookup.queryType()"})
  void testQueryType() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

    // Act
    Class<? extends CalculationParameter> actualQueryTypeResult = ofResult.queryType();

    // Assert
    Class<SwaptionMarketDataLookup> expectedQueryTypeResult = SwaptionMarketDataLookup.class;
    assertEquals(expectedQueryTypeResult, actualQueryTypeResult);
  }

  /**
   * Test {@link SwaptionMarketDataLookup#requirements(RateIndex[])} with {@code RateIndex[]}.
   *
   * <ul>
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionMarketDataLookup#requirements(RateIndex[])}
   */
  @Test
  @DisplayName(
      "Test requirements(RateIndex[]) with 'RateIndex[]'; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements SwaptionMarketDataLookup.requirements(RateIndex[])"})
  void testRequirementsWithRateIndex_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());

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
   * Test {@link SwaptionMarketDataLookup#marketDataView(MarketData)} with {@code MarketData}.
   *
   * <ul>
   *   <li>Then return {@link DefaultSwaptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link SwaptionMarketDataLookup#marketDataView(MarketData)}
   */
  @Test
  @DisplayName(
      "Test marketDataView(MarketData) with 'MarketData'; then return DefaultSwaptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwaptionMarketData SwaptionMarketDataLookup.marketDataView(MarketData)"})
  void testMarketDataViewWithMarketData_thenReturnDefaultSwaptionMarketData() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    SwaptionMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultSwaptionMarketData);
    assertNull(actualMarketDataViewResult.getValuationDate());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
  }

  /**
   * Test {@link SwaptionMarketDataLookup#marketDataView(ScenarioMarketData)} with {@code
   * ScenarioMarketData}.
   *
   * <p>Method under test: {@link SwaptionMarketDataLookup#marketDataView(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(ScenarioMarketData) with 'ScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwaptionScenarioMarketData SwaptionMarketDataLookup.marketDataView(ScenarioMarketData)"
  })
  void testMarketDataViewWithScenarioMarketData() {
    // Arrange
    DefaultSwaptionMarketDataLookup ofResult = DefaultSwaptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    SwaptionScenarioMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultSwaptionScenarioMarketData);
    assertEquals(1, actualMarketDataViewResult.getScenarioCount());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
  }
}
