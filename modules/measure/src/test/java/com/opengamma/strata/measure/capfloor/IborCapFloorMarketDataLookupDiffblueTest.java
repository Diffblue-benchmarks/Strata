package com.opengamma.strata.measure.capfloor;

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
import com.opengamma.strata.pricer.capfloor.IborCapletFloorletVolatilitiesId;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborCapFloorMarketDataLookupDiffblueTest {
  /**
   * Test {@link IborCapFloorMarketDataLookup#of(IborIndex, IborCapletFloorletVolatilitiesId)} with
   * {@code index}, {@code volatilityId}.
   *
   * <ul>
   *   <li>Then return {@link DefaultIborCapFloorMarketDataLookup}.
   * </ul>
   *
   * <p>Method under test: {@link IborCapFloorMarketDataLookup#of(IborIndex,
   * IborCapletFloorletVolatilitiesId)}
   */
  @Test
  @DisplayName(
      "Test of(IborIndex, IborCapletFloorletVolatilitiesId) with 'index', 'volatilityId'; then return DefaultIborCapFloorMarketDataLookup")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapFloorMarketDataLookup IborCapFloorMarketDataLookup.of(IborIndex, IborCapletFloorletVolatilitiesId)"
  })
  void testOfWithIndexVolatilityId_thenReturnDefaultIborCapFloorMarketDataLookup() {
    // Arrange
    IborIndex index = mock(IborIndex.class);

    // Act
    IborCapFloorMarketDataLookup actualOfResult =
        IborCapFloorMarketDataLookup.of(index, IborCapletFloorletVolatilitiesId.of("Name"));

    // Assert
    assertTrue(actualOfResult instanceof DefaultIborCapFloorMarketDataLookup);
    assertEquals(1, actualOfResult.getVolatilityIndices().size());
    assertEquals(
        1, ((DefaultIborCapFloorMarketDataLookup) actualOfResult).getVolatilityIds().size());
  }

  /**
   * Test {@link IborCapFloorMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <p>Method under test: {@link IborCapFloorMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName("Test of(Map) with 'volatilityIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborCapFloorMarketDataLookup IborCapFloorMarketDataLookup.of(Map)"})
  void testOfWithVolatilityIds() {
    // Arrange
    HashMap<IborIndex, IborCapletFloorletVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    IborCapFloorMarketDataLookup actualOfResult = IborCapFloorMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult instanceof DefaultIborCapFloorMarketDataLookup);
    assertTrue(actualOfResult.getVolatilityIndices().isEmpty());
    assertEquals(
        volatilityIds, ((DefaultIborCapFloorMarketDataLookup) actualOfResult).getVolatilityIds());
  }

  /**
   * Test {@link IborCapFloorMarketDataLookup#queryType()}.
   *
   * <p>Method under test: {@link IborCapFloorMarketDataLookup#queryType()}
   */
  @Test
  @DisplayName("Test queryType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class IborCapFloorMarketDataLookup.queryType()"})
  void testQueryType() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

    // Act
    Class<? extends CalculationParameter> actualQueryTypeResult = ofResult.queryType();

    // Assert
    Class<IborCapFloorMarketDataLookup> expectedQueryTypeResult =
        IborCapFloorMarketDataLookup.class;
    assertEquals(expectedQueryTypeResult, actualQueryTypeResult);
  }

  /**
   * Test {@link IborCapFloorMarketDataLookup#requirements(IborIndex[])} with {@code IborIndex[]}.
   *
   * <ul>
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link IborCapFloorMarketDataLookup#requirements(IborIndex[])}
   */
  @Test
  @DisplayName(
      "Test requirements(IborIndex[]) with 'IborIndex[]'; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements IborCapFloorMarketDataLookup.requirements(IborIndex[])"})
  void testRequirementsWithIborIndex_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());

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
   * Test {@link IborCapFloorMarketDataLookup#marketDataView(MarketData)} with {@code MarketData}.
   *
   * <ul>
   *   <li>Then return {@link DefaultIborCapFloorMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link IborCapFloorMarketDataLookup#marketDataView(MarketData)}
   */
  @Test
  @DisplayName(
      "Test marketDataView(MarketData) with 'MarketData'; then return DefaultIborCapFloorMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapFloorMarketData IborCapFloorMarketDataLookup.marketDataView(MarketData)"
  })
  void testMarketDataViewWithMarketData_thenReturnDefaultIborCapFloorMarketData() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    IborCapFloorMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultIborCapFloorMarketData);
    assertNull(actualMarketDataViewResult.getValuationDate());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
  }

  /**
   * Test {@link IborCapFloorMarketDataLookup#marketDataView(ScenarioMarketData)} with {@code
   * ScenarioMarketData}.
   *
   * <p>Method under test: {@link IborCapFloorMarketDataLookup#marketDataView(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(ScenarioMarketData) with 'ScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "IborCapFloorScenarioMarketData IborCapFloorMarketDataLookup.marketDataView(ScenarioMarketData)"
  })
  void testMarketDataViewWithScenarioMarketData() {
    // Arrange
    DefaultIborCapFloorMarketDataLookup ofResult =
        DefaultIborCapFloorMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    IborCapFloorScenarioMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultIborCapFloorScenarioMarketData);
    assertEquals(1, actualMarketDataViewResult.getScenarioCount());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
  }
}
