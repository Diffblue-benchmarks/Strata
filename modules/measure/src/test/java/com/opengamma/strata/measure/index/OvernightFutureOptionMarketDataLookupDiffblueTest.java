package com.opengamma.strata.measure.index;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.index.OvernightIndex;
import com.opengamma.strata.calc.runner.CalculationParameter;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.pricer.index.OvernightFutureOptionVolatilitiesId;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class OvernightFutureOptionMarketDataLookupDiffblueTest {
  /**
   * Test {@link OvernightFutureOptionMarketDataLookup#of(OvernightIndex,
   * OvernightFutureOptionVolatilitiesId)} with {@code index}, {@code volatilityId}.
   *
   * <p>Method under test: {@link OvernightFutureOptionMarketDataLookup#of(OvernightIndex,
   * OvernightFutureOptionVolatilitiesId)}
   */
  @Test
  @DisplayName(
      "Test of(OvernightIndex, OvernightFutureOptionVolatilitiesId) with 'index', 'volatilityId'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureOptionMarketDataLookup OvernightFutureOptionMarketDataLookup.of(OvernightIndex, OvernightFutureOptionVolatilitiesId)"
  })
  void testOfWithIndexVolatilityId() {
    // Arrange
    OvernightIndex index = mock(OvernightIndex.class);

    // Act
    OvernightFutureOptionMarketDataLookup actualOfResult =
        OvernightFutureOptionMarketDataLookup.of(
            index, OvernightFutureOptionVolatilitiesId.of("Name"));

    // Assert
    assertTrue(actualOfResult instanceof DefaultOvernightFutureOptionMarketDataLookup);
    assertEquals(1, actualOfResult.getVolatilityIndices().size());
    assertEquals(
        1,
        ((DefaultOvernightFutureOptionMarketDataLookup) actualOfResult).getVolatilityIds().size());
  }

  /**
   * Test {@link OvernightFutureOptionMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <p>Method under test: {@link OvernightFutureOptionMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'volatilityIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureOptionMarketDataLookup OvernightFutureOptionMarketDataLookup.of(Map)"
  })
  void testOfWithVolatilityIds() {
    // Arrange
    HashMap<OvernightIndex, OvernightFutureOptionVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    OvernightFutureOptionMarketDataLookup actualOfResult =
        OvernightFutureOptionMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult instanceof DefaultOvernightFutureOptionMarketDataLookup);
    assertTrue(actualOfResult.getVolatilityIndices().isEmpty());
    assertEquals(
        volatilityIds,
        ((DefaultOvernightFutureOptionMarketDataLookup) actualOfResult).getVolatilityIds());
  }

  /**
   * Test {@link OvernightFutureOptionMarketDataLookup#queryType()}.
   *
   * <p>Method under test: {@link OvernightFutureOptionMarketDataLookup#queryType()}
   */
  @Test
  @DisplayName("Test queryType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class OvernightFutureOptionMarketDataLookup.queryType()"})
  void testQueryType() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act
    Class<? extends CalculationParameter> actualQueryTypeResult = ofResult.queryType();

    // Assert
    Class<OvernightFutureOptionMarketDataLookup> expectedQueryTypeResult =
        OvernightFutureOptionMarketDataLookup.class;
    assertEquals(expectedQueryTypeResult, actualQueryTypeResult);
  }

  /**
   * Test {@link OvernightFutureOptionMarketDataLookup#requirements(OvernightIndex[])} with {@code
   * OvernightIndex[]}.
   *
   * <ul>
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link
   * OvernightFutureOptionMarketDataLookup#requirements(OvernightIndex[])}
   */
  @Test
  @DisplayName(
      "Test requirements(OvernightIndex[]) with 'OvernightIndex[]'; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FunctionRequirements OvernightFutureOptionMarketDataLookup.requirements(OvernightIndex[])"
  })
  void testRequirementsWithOvernightIndex_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());

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
   * Test {@link OvernightFutureOptionMarketDataLookup#marketDataView(MarketData)} with {@code
   * MarketData}.
   *
   * <p>Method under test: {@link OvernightFutureOptionMarketDataLookup#marketDataView(MarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(MarketData) with 'MarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureOptionMarketData OvernightFutureOptionMarketDataLookup.marketDataView(MarketData)"
  })
  void testMarketDataViewWithMarketData() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    OvernightFutureOptionMarketData actualMarketDataViewResult =
        ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultOvernightFutureOptionMarketData);
    assertNull(actualMarketDataViewResult.getValuationDate());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
  }

  /**
   * Test {@link OvernightFutureOptionMarketDataLookup#marketDataView(ScenarioMarketData)} with
   * {@code ScenarioMarketData}.
   *
   * <p>Method under test: {@link
   * OvernightFutureOptionMarketDataLookup#marketDataView(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(ScenarioMarketData) with 'ScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "OvernightFutureOptionScenarioMarketData OvernightFutureOptionMarketDataLookup.marketDataView(ScenarioMarketData)"
  })
  void testMarketDataViewWithScenarioMarketData() {
    // Arrange
    DefaultOvernightFutureOptionMarketDataLookup ofResult =
        DefaultOvernightFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    OvernightFutureOptionScenarioMarketData actualMarketDataViewResult =
        ofResult.marketDataView(marketData);

    // Assert
    assertTrue(
        actualMarketDataViewResult instanceof DefaultOvernightFutureOptionScenarioMarketData);
    assertEquals(1, actualMarketDataViewResult.getScenarioCount());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
  }
}
