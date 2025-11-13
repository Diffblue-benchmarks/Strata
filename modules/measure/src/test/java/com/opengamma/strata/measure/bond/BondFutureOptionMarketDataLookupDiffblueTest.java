package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.runner.CalculationParameter;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.pricer.bond.BondFutureVolatilitiesId;
import com.opengamma.strata.product.SecurityId;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BondFutureOptionMarketDataLookupDiffblueTest {
  /**
   * Test {@link BondFutureOptionMarketDataLookup#of(Map)} with {@code volatilityIds}.
   *
   * <ul>
   *   <li>Then return {@link DefaultBondFutureOptionMarketDataLookup}.
   * </ul>
   *
   * <p>Method under test: {@link BondFutureOptionMarketDataLookup#of(Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map) with 'volatilityIds'; then return DefaultBondFutureOptionMarketDataLookup")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"BondFutureOptionMarketDataLookup BondFutureOptionMarketDataLookup.of(Map)"})
  void testOfWithVolatilityIds_thenReturnDefaultBondFutureOptionMarketDataLookup() {
    // Arrange
    HashMap<SecurityId, BondFutureVolatilitiesId> volatilityIds = new HashMap<>();

    // Act
    BondFutureOptionMarketDataLookup actualOfResult =
        BondFutureOptionMarketDataLookup.of(volatilityIds);

    // Assert
    assertTrue(actualOfResult instanceof DefaultBondFutureOptionMarketDataLookup);
    assertTrue(actualOfResult.getVolatilitySecurityIds().isEmpty());
    assertEquals(
        volatilityIds,
        ((DefaultBondFutureOptionMarketDataLookup) actualOfResult).getVolatilityIds());
  }

  /**
   * Test {@link BondFutureOptionMarketDataLookup#queryType()}.
   *
   * <p>Method under test: {@link BondFutureOptionMarketDataLookup#queryType()}
   */
  @Test
  @DisplayName("Test queryType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class BondFutureOptionMarketDataLookup.queryType()"})
  void testQueryType() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

    // Act
    Class<? extends CalculationParameter> actualQueryTypeResult = ofResult.queryType();

    // Assert
    Class<BondFutureOptionMarketDataLookup> expectedQueryTypeResult =
        BondFutureOptionMarketDataLookup.class;
    assertEquals(expectedQueryTypeResult, actualQueryTypeResult);
  }

  /**
   * Test {@link BondFutureOptionMarketDataLookup#requirements(SecurityId[])} with {@code
   * SecurityId[]}.
   *
   * <ul>
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link BondFutureOptionMarketDataLookup#requirements(SecurityId[])}
   */
  @Test
  @DisplayName(
      "Test requirements(SecurityId[]) with 'SecurityId[]'; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "FunctionRequirements BondFutureOptionMarketDataLookup.requirements(SecurityId[])"
  })
  void testRequirementsWithSecurityId_thenReturnObservableSourceNameIsNone() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());

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
   * Test {@link BondFutureOptionMarketDataLookup#marketDataView(MarketData)} with {@code
   * MarketData}.
   *
   * <ul>
   *   <li>Then return {@link DefaultBondFutureOptionMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link BondFutureOptionMarketDataLookup#marketDataView(MarketData)}
   */
  @Test
  @DisplayName(
      "Test marketDataView(MarketData) with 'MarketData'; then return DefaultBondFutureOptionMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BondFutureOptionMarketData BondFutureOptionMarketDataLookup.marketDataView(MarketData)"
  })
  void testMarketDataViewWithMarketData_thenReturnDefaultBondFutureOptionMarketData() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    MarketData marketData = mock(MarketData.class);

    // Act
    BondFutureOptionMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultBondFutureOptionMarketData);
    assertNull(actualMarketDataViewResult.getValuationDate());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
  }

  /**
   * Test {@link BondFutureOptionMarketDataLookup#marketDataView(ScenarioMarketData)} with {@code
   * ScenarioMarketData}.
   *
   * <p>Method under test: {@link
   * BondFutureOptionMarketDataLookup#marketDataView(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(ScenarioMarketData) with 'ScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BondFutureOptionScenarioMarketData BondFutureOptionMarketDataLookup.marketDataView(ScenarioMarketData)"
  })
  void testMarketDataViewWithScenarioMarketData() {
    // Arrange
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    BondFutureOptionScenarioMarketData actualMarketDataViewResult =
        ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultBondFutureOptionScenarioMarketData);
    assertEquals(1, actualMarketDataViewResult.getScenarioCount());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
  }

  /**
   * Test {@link BondFutureOptionMarketDataLookup#marketDataView(ScenarioMarketData)} with {@code
   * ScenarioMarketData}.
   *
   * <ul>
   *   <li>Given {@link HashMap#HashMap()} All is {@link HashMap#HashMap()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BondFutureOptionMarketDataLookup#marketDataView(ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test marketDataView(ScenarioMarketData) with 'ScenarioMarketData'; given HashMap() All is HashMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BondFutureOptionScenarioMarketData BondFutureOptionMarketDataLookup.marketDataView(ScenarioMarketData)"
  })
  void testMarketDataViewWithScenarioMarketData_givenHashMapAllIsHashMap() {
    // Arrange
    HashMap<SecurityId, BondFutureVolatilitiesId> volatilityIds = new HashMap<>();
    volatilityIds.putAll(new HashMap<>());
    DefaultBondFutureOptionMarketDataLookup ofResult =
        DefaultBondFutureOptionMarketDataLookup.of(volatilityIds);
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    BondFutureOptionScenarioMarketData actualMarketDataViewResult =
        ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultBondFutureOptionScenarioMarketData);
    assertEquals(1, actualMarketDataViewResult.getScenarioCount());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
  }
}
