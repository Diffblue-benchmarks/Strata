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
import com.opengamma.strata.basics.index.IborIndex;
import com.opengamma.strata.calc.runner.CalculationParameter;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.pricer.index.IborFutureOptionVolatilitiesId;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborFutureOptionMarketDataLookupDiffblueTest {
  /**
   * Test {@link IborFutureOptionMarketDataLookup#of(IborIndex, IborFutureOptionVolatilitiesId)}
   * with {@code index}, {@code volatilityId}.
   *
   * <ul>
   *   <li>Then return {@link DefaultIborFutureOptionMarketDataLookup}.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureOptionMarketDataLookup#of(IborIndex,
   * IborFutureOptionVolatilitiesId)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, IborFutureOptionVolatilitiesId) with 'index', 'volatilityId'; then return DefaultIborFutureOptionMarketDataLookup")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborFutureOptionMarketDataLookup IborFutureOptionMarketDataLookup.of(IborIndex, IborFutureOptionVolatilitiesId)"
  })
  void testOfWithIndexVolatilityId_thenReturnDefaultIborFutureOptionMarketDataLookup() {
    // Arrange
    IborIndex index = mock(IborIndex.class);

    // Act
    IborFutureOptionMarketDataLookup actualOfResult =
        IborFutureOptionMarketDataLookup.of(index, IborFutureOptionVolatilitiesId.of("Name"));

    // Assert
    assertTrue(actualOfResult instanceof DefaultIborFutureOptionMarketDataLookup);
    assertEquals(1, actualOfResult.getVolatilityIndices().size());
    assertEquals(
        1, ((DefaultIborFutureOptionMarketDataLookup) actualOfResult).getVolatilityIds().size());
  }

  /**
   * Test {@link IborFutureOptionMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <p>Method under test: {@link IborFutureOptionMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'volatilityIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborFutureOptionMarketDataLookup IborFutureOptionMarketDataLookup.of(Map)"})
  void testOfWithVolatilityIds() {
    // Arrange
    HashMap<IborIndex, IborFutureOptionVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    IborFutureOptionMarketDataLookup actualOfResult =
        IborFutureOptionMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult instanceof DefaultIborFutureOptionMarketDataLookup);
    assertTrue(actualOfResult.getVolatilityIndices().isEmpty());
    assertEquals(
        volatilityIds,
        ((DefaultIborFutureOptionMarketDataLookup) actualOfResult).getVolatilityIds());
  }

  /**
   * Test {@link IborFutureOptionMarketDataLookup#queryType()}.
   *
   * <p>Method under test: {@link IborFutureOptionMarketDataLookup#queryType()}
   */
  @Test
  @DisplayName("Test queryType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class IborFutureOptionMarketDataLookup.queryType()"})
  void testQueryType() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act
    Class<? extends CalculationParameter> actualQueryTypeResult = ofResult.queryType();

    // Assert
    Class<IborFutureOptionMarketDataLookup> expectedQueryTypeResult =
        IborFutureOptionMarketDataLookup.class;
    assertEquals(expectedQueryTypeResult, actualQueryTypeResult);
  }

  /**
   * Test {@link IborFutureOptionMarketDataLookup#requirements(IborIndex[])} with {@code
   * IborIndex[]}.
   *
   * <ul>
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureOptionMarketDataLookup#requirements(IborIndex[])}
   */
  @Test
  @DisplayName(
      "Test requirements(IborIndex[]) with 'IborIndex[]'; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FunctionRequirements IborFutureOptionMarketDataLookup.requirements(IborIndex[])"
  })
  void testRequirementsWithIborIndex_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());

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
   * Test {@link IborFutureOptionMarketDataLookup#marketDataView(MarketData)} with {@code
   * MarketData}.
   *
   * <ul>
   *   <li>Then return {@link DefaultIborFutureOptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link IborFutureOptionMarketDataLookup#marketDataView(MarketData)}
   */
  @Test
  @DisplayName(
      "Test marketDataView(MarketData) with 'MarketData'; then return DefaultIborFutureOptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborFutureOptionMarketData IborFutureOptionMarketDataLookup.marketDataView(MarketData)"
  })
  void testMarketDataViewWithMarketData_thenReturnDefaultIborFutureOptionMarketData() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    IborFutureOptionMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultIborFutureOptionMarketData);
    assertNull(actualMarketDataViewResult.getValuationDate());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
  }

  /**
   * Test {@link IborFutureOptionMarketDataLookup#marketDataView(ScenarioMarketData)} with {@code
   * ScenarioMarketData}.
   *
   * <p>Method under test: {@link
   * IborFutureOptionMarketDataLookup#marketDataView(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(ScenarioMarketData) with 'ScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborFutureOptionScenarioMarketData IborFutureOptionMarketDataLookup.marketDataView(ScenarioMarketData)"
  })
  void testMarketDataViewWithScenarioMarketData() {
    // Arrange
    DefaultIborFutureOptionMarketDataLookup ofResult =
        DefaultIborFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    IborFutureOptionScenarioMarketData actualMarketDataViewResult =
        ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultIborFutureOptionScenarioMarketData);
    assertEquals(1, actualMarketDataViewResult.getScenarioCount());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
  }
}
