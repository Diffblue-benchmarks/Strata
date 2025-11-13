package com.opengamma.strata.measure.rate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.FxRateProvider;
import com.opengamma.strata.basics.index.Index;
import com.opengamma.strata.calc.runner.CalculationParameter;
import com.opengamma.strata.calc.runner.FunctionRequirements;
import com.opengamma.strata.calc.runner.FxRateLookup;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.market.curve.CurveGroupName;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.market.curve.CurveName;
import com.opengamma.strata.market.curve.RatesCurveGroup;
import com.opengamma.strata.market.curve.RatesCurveGroup.Builder;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class RatesMarketDataLookupDiffblueTest {
  /**
   * Test {@link RatesMarketDataLookup#of(RatesCurveGroup)} with {@code curveGroup}.
   *
   * <ul>
   *   <li>Then return {@link DefaultRatesMarketDataLookup}.
   * </ul>
   *
   * <p>Method under test: {@link RatesMarketDataLookup#of(RatesCurveGroup)}
   */
  @Test
  @DisplayName(
      "Test of(RatesCurveGroup) with 'curveGroup'; then return DefaultRatesMarketDataLookup")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesMarketDataLookup RatesMarketDataLookup.of(RatesCurveGroup)"})
  void testOfWithCurveGroup_thenReturnDefaultRatesMarketDataLookup() {
    // Arrange
    Builder builderResult = RatesCurveGroup.builder();

    Builder discountCurvesResult = builderResult.discountCurves(new HashMap<>());

    Builder forwardCurvesResult = discountCurvesResult.forwardCurves(new HashMap<>());
    RatesCurveGroup curveGroup = forwardCurvesResult.name(CurveGroupName.of("Name")).build();

    // Act
    RatesMarketDataLookup actualOfResult = RatesMarketDataLookup.of(curveGroup);

    // Assert
    assertTrue(actualOfResult instanceof DefaultRatesMarketDataLookup);
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    ImmutableMap<Currency, CurveId> discountCurves =
        ((DefaultRatesMarketDataLookup) actualOfResult).getDiscountCurves();
    assertTrue(discountCurves.isEmpty());
    ImmutableSet<Currency> discountCurrencies = actualOfResult.getDiscountCurrencies();
    assertTrue(discountCurrencies.isEmpty());
    assertSame(discountCurves, ((DefaultRatesMarketDataLookup) actualOfResult).getForwardCurves());
    assertSame(discountCurrencies, actualOfResult.getForwardIndices());
  }

  /**
   * Test {@link RatesMarketDataLookup#of(Map, Map, ObservableSource, FxRateLookup)} with {@code
   * discountCurveIds}, {@code forwardCurveIds}, {@code obsSource}, {@code fxLookup}.
   *
   * <p>Method under test: {@link RatesMarketDataLookup#of(Map, Map, ObservableSource,
   * FxRateLookup)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, ObservableSource, FxRateLookup) with 'discountCurveIds', 'forwardCurveIds', 'obsSource', 'fxLookup'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesMarketDataLookup RatesMarketDataLookup.of(Map, Map, ObservableSource, FxRateLookup)"
  })
  void testOfWithDiscountCurveIdsForwardCurveIdsObsSourceFxLookup() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    ObservableSource obsSource = ObservableSource.of("Name");

    // Act
    RatesMarketDataLookup actualOfResult =
        RatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, obsSource, mock(FxRateLookup.class));

    // Assert
    assertTrue(actualOfResult instanceof DefaultRatesMarketDataLookup);
    ImmutableMap<Currency, CurveId> discountCurves =
        ((DefaultRatesMarketDataLookup) actualOfResult).getDiscountCurves();
    assertEquals(discountCurveIds, discountCurves);
    assertSame(discountCurves, ((DefaultRatesMarketDataLookup) actualOfResult).getForwardCurves());
    assertSame(obsSource, actualOfResult.getObservableSource());
  }

  /**
   * Test {@link RatesMarketDataLookup#of(Map, Map, ObservableSource, FxRateLookup)} with {@code
   * discountCurveIds}, {@code forwardCurveIds}, {@code obsSource}, {@code fxLookup}.
   *
   * <p>Method under test: {@link RatesMarketDataLookup#of(Map, Map, ObservableSource,
   * FxRateLookup)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, ObservableSource, FxRateLookup) with 'discountCurveIds', 'forwardCurveIds', 'obsSource', 'fxLookup'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesMarketDataLookup RatesMarketDataLookup.of(Map, Map, ObservableSource, FxRateLookup)"
  })
  void testOfWithDiscountCurveIdsForwardCurveIdsObsSourceFxLookup2() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    Index index = mock(Index.class);
    forwardCurveIds.put(index, CurveId.of("discountCurves", "discountCurves"));
    ObservableSource obsSource = ObservableSource.of("None");

    // Act
    RatesMarketDataLookup actualOfResult =
        RatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, obsSource, mock(FxRateLookup.class));

    // Assert
    assertTrue(actualOfResult instanceof DefaultRatesMarketDataLookup);
    assertEquals(1, actualOfResult.getForwardIndices().size());
    assertEquals(
        forwardCurveIds, ((DefaultRatesMarketDataLookup) actualOfResult).getForwardCurves());
    assertSame(obsSource, actualOfResult.getObservableSource());
  }

  /**
   * Test {@link RatesMarketDataLookup#of(Map, Map, ObservableSource, FxRateLookup)} with {@code
   * discountCurveIds}, {@code forwardCurveIds}, {@code obsSource}, {@code fxLookup}.
   *
   * <p>Method under test: {@link RatesMarketDataLookup#of(Map, Map, ObservableSource,
   * FxRateLookup)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, ObservableSource, FxRateLookup) with 'discountCurveIds', 'forwardCurveIds', 'obsSource', 'fxLookup'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesMarketDataLookup RatesMarketDataLookup.of(Map, Map, ObservableSource, FxRateLookup)"
  })
  void testOfWithDiscountCurveIdsForwardCurveIdsObsSourceFxLookup3() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    Index index = mock(Index.class);
    forwardCurveIds.put(index, CurveId.of("discountCurves", "discountCurves"));
    Index index2 = mock(Index.class);
    forwardCurveIds.put(index2, CurveId.of("discountCurves", "discountCurves"));
    ObservableSource obsSource = ObservableSource.of("None");

    // Act
    RatesMarketDataLookup actualOfResult =
        RatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, obsSource, mock(FxRateLookup.class));

    // Assert
    assertTrue(actualOfResult instanceof DefaultRatesMarketDataLookup);
    assertEquals(2, actualOfResult.getForwardIndices().size());
    assertEquals(
        forwardCurveIds, ((DefaultRatesMarketDataLookup) actualOfResult).getForwardCurves());
    assertSame(obsSource, actualOfResult.getObservableSource());
  }

  /**
   * Test {@link RatesMarketDataLookup#of(Map, Map)} with {@code discountCurveIds}, {@code
   * forwardCurveIds}.
   *
   * <ul>
   *   <li>Then return ForwardIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link RatesMarketDataLookup#of(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map) with 'discountCurveIds', 'forwardCurveIds'; then return ForwardIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesMarketDataLookup RatesMarketDataLookup.of(Map, Map)"})
  void testOfWithDiscountCurveIdsForwardCurveIds_thenReturnForwardIndicesSizeIsOne() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    Index index = mock(Index.class);
    forwardCurveIds.put(index, CurveId.of("discountCurves", "discountCurves"));

    // Act
    RatesMarketDataLookup actualOfResult =
        RatesMarketDataLookup.of(discountCurveIds, forwardCurveIds);

    // Assert
    assertTrue(actualOfResult instanceof DefaultRatesMarketDataLookup);
    assertEquals(1, actualOfResult.getForwardIndices().size());
    assertEquals(
        discountCurveIds, ((DefaultRatesMarketDataLookup) actualOfResult).getDiscountCurves());
    assertEquals(
        forwardCurveIds, ((DefaultRatesMarketDataLookup) actualOfResult).getForwardCurves());
  }

  /**
   * Test {@link RatesMarketDataLookup#of(Map, Map)} with {@code discountCurveIds}, {@code
   * forwardCurveIds}.
   *
   * <ul>
   *   <li>Then return ForwardIndices size is two.
   * </ul>
   *
   * <p>Method under test: {@link RatesMarketDataLookup#of(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map) with 'discountCurveIds', 'forwardCurveIds'; then return ForwardIndices size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesMarketDataLookup RatesMarketDataLookup.of(Map, Map)"})
  void testOfWithDiscountCurveIdsForwardCurveIds_thenReturnForwardIndicesSizeIsTwo() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    Index index = mock(Index.class);
    forwardCurveIds.put(index, CurveId.of("discountCurves", "discountCurves"));
    Index index2 = mock(Index.class);
    forwardCurveIds.put(index2, CurveId.of("discountCurves", "discountCurves"));

    // Act
    RatesMarketDataLookup actualOfResult =
        RatesMarketDataLookup.of(discountCurveIds, forwardCurveIds);

    // Assert
    assertTrue(actualOfResult instanceof DefaultRatesMarketDataLookup);
    assertEquals(2, actualOfResult.getForwardIndices().size());
    assertEquals(
        discountCurveIds, ((DefaultRatesMarketDataLookup) actualOfResult).getDiscountCurves());
    assertEquals(
        forwardCurveIds, ((DefaultRatesMarketDataLookup) actualOfResult).getForwardCurves());
  }

  /**
   * Test {@link RatesMarketDataLookup#of(Map, Map)} with {@code discountCurveIds}, {@code
   * forwardCurveIds}.
   *
   * <ul>
   *   <li>Then return ObservableSource Name is {@code None}.
   * </ul>
   *
   * <p>Method under test: {@link RatesMarketDataLookup#of(Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map) with 'discountCurveIds', 'forwardCurveIds'; then return ObservableSource Name is 'None'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesMarketDataLookup RatesMarketDataLookup.of(Map, Map)"})
  void testOfWithDiscountCurveIdsForwardCurveIds_thenReturnObservableSourceNameIsNone() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    // Act
    RatesMarketDataLookup actualOfResult =
        RatesMarketDataLookup.of(discountCurveIds, new HashMap<>());

    // Assert
    assertTrue(actualOfResult instanceof DefaultRatesMarketDataLookup);
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    ImmutableSet<Currency> discountCurrencies = actualOfResult.getDiscountCurrencies();
    assertTrue(discountCurrencies.isEmpty());
    assertSame(discountCurrencies, actualOfResult.getForwardIndices());
  }

  /**
   * Test {@link RatesMarketDataLookup#of(CurveGroupName, Map, Map)} with {@code groupName}, {@code
   * discountCurves}, {@code forwardCurves}.
   *
   * <p>Method under test: {@link RatesMarketDataLookup#of(CurveGroupName, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Map, Map) with 'groupName', 'discountCurves', 'forwardCurves'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesMarketDataLookup RatesMarketDataLookup.of(CurveGroupName, Map, Map)"})
  void testOfWithGroupNameDiscountCurvesForwardCurves() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    HashMap<Currency, CurveName> discountCurves = new HashMap<>();

    // Act
    RatesMarketDataLookup actualOfResult =
        RatesMarketDataLookup.of(groupName, discountCurves, new HashMap<>());

    // Assert
    assertTrue(actualOfResult instanceof DefaultRatesMarketDataLookup);
    ObservableSource observableSource = actualOfResult.getObservableSource();
    assertEquals("None", observableSource.getName());
    assertEquals("None", observableSource.toString());
    ImmutableMap<Currency, CurveId> discountCurves2 =
        ((DefaultRatesMarketDataLookup) actualOfResult).getDiscountCurves();
    assertTrue(discountCurves2.isEmpty());
    ImmutableSet<Currency> discountCurrencies = actualOfResult.getDiscountCurrencies();
    assertTrue(discountCurrencies.isEmpty());
    assertSame(discountCurves2, ((DefaultRatesMarketDataLookup) actualOfResult).getForwardCurves());
    assertSame(discountCurrencies, actualOfResult.getForwardIndices());
  }

  /**
   * Test {@link RatesMarketDataLookup#of(CurveGroupName, Map, Map)} with {@code groupName}, {@code
   * discountCurves}, {@code forwardCurves}.
   *
   * <ul>
   *   <li>Then return ForwardIndices size is one.
   * </ul>
   *
   * <p>Method under test: {@link RatesMarketDataLookup#of(CurveGroupName, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Map, Map) with 'groupName', 'discountCurves', 'forwardCurves'; then return ForwardIndices size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesMarketDataLookup RatesMarketDataLookup.of(CurveGroupName, Map, Map)"})
  void testOfWithGroupNameDiscountCurvesForwardCurves_thenReturnForwardIndicesSizeIsOne() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    HashMap<Currency, CurveName> discountCurves = new HashMap<>();

    HashMap<Index, CurveName> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);
    forwardCurves.put(index, CurveName.of("discountCurves"));

    // Act
    RatesMarketDataLookup actualOfResult =
        RatesMarketDataLookup.of(groupName, discountCurves, forwardCurves);

    // Assert
    assertTrue(actualOfResult instanceof DefaultRatesMarketDataLookup);
    assertEquals(1, actualOfResult.getForwardIndices().size());
    assertEquals(1, ((DefaultRatesMarketDataLookup) actualOfResult).getForwardCurves().size());
  }

  /**
   * Test {@link RatesMarketDataLookup#of(CurveGroupName, Map, Map)} with {@code groupName}, {@code
   * discountCurves}, {@code forwardCurves}.
   *
   * <ul>
   *   <li>Then return ForwardIndices size is two.
   * </ul>
   *
   * <p>Method under test: {@link RatesMarketDataLookup#of(CurveGroupName, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(CurveGroupName, Map, Map) with 'groupName', 'discountCurves', 'forwardCurves'; then return ForwardIndices size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesMarketDataLookup RatesMarketDataLookup.of(CurveGroupName, Map, Map)"})
  void testOfWithGroupNameDiscountCurvesForwardCurves_thenReturnForwardIndicesSizeIsTwo() {
    // Arrange
    CurveGroupName groupName = CurveGroupName.of("Name");
    HashMap<Currency, CurveName> discountCurves = new HashMap<>();

    HashMap<Index, CurveName> forwardCurves = new HashMap<>();
    Index index = mock(Index.class);
    forwardCurves.put(index, CurveName.of("curveGroupName"));
    Index index2 = mock(Index.class);
    forwardCurves.put(index2, CurveName.of("discountCurves"));

    // Act
    RatesMarketDataLookup actualOfResult =
        RatesMarketDataLookup.of(groupName, discountCurves, forwardCurves);

    // Assert
    assertTrue(actualOfResult instanceof DefaultRatesMarketDataLookup);
    assertEquals(2, actualOfResult.getForwardIndices().size());
    assertEquals(2, ((DefaultRatesMarketDataLookup) actualOfResult).getForwardCurves().size());
  }

  /**
   * Test {@link RatesMarketDataLookup#queryType()}.
   *
   * <p>Method under test: {@link RatesMarketDataLookup#queryType()}
   */
  @Test
  @DisplayName("Test queryType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class RatesMarketDataLookup.queryType()"})
  void testQueryType() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));

    // Act
    Class<? extends CalculationParameter> actualQueryTypeResult = ofResult.queryType();

    // Assert
    Class<RatesMarketDataLookup> expectedQueryTypeResult = RatesMarketDataLookup.class;
    assertEquals(expectedQueryTypeResult, actualQueryTypeResult);
  }

  /**
   * Test {@link RatesMarketDataLookup#requirements(Set)} with {@code currencies}.
   *
   * <p>Method under test: {@link RatesMarketDataLookup#requirements(Set)}
   */
  @Test
  @DisplayName("Test requirements(Set) with 'currencies'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FunctionRequirements RatesMarketDataLookup.requirements(Set)"})
  void testRequirementsWithCurrencies() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    ObservableSource obsSource = ObservableSource.of("Name");

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, obsSource, mock(FxRateLookup.class));
    HashSet<Currency> currencies = new HashSet<>();

    // Act
    FunctionRequirements actualRequirementsResult = ofResult.requirements(currencies);

    // Assert
    ImmutableSet<Currency> outputCurrencies = actualRequirementsResult.getOutputCurrencies();
    assertEquals(currencies, outputCurrencies);
    assertSame(outputCurrencies, actualRequirementsResult.getTimeSeriesRequirements());
    assertSame(outputCurrencies, actualRequirementsResult.getValueRequirements());
    assertSame(obsSource, actualRequirementsResult.getObservableSource());
  }

  /**
   * Test {@link RatesMarketDataLookup#marketDataView(MarketData)} with {@code MarketData}.
   *
   * <p>Method under test: {@link RatesMarketDataLookup#marketDataView(MarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(MarketData) with 'MarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RatesMarketData RatesMarketDataLookup.marketDataView(MarketData)"})
  void testMarketDataViewWithMarketData() {
    // Arrange
    FxRateLookup fxLookup = mock(FxRateLookup.class);
    when(fxLookup.fxRateProvider(Mockito.<MarketData>any())).thenReturn(mock(FxRateProvider.class));
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, ObservableSource.of("Name"), fxLookup);
    MarketData marketData = mock(MarketData.class);

    // Act
    RatesMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    verify(fxLookup).fxRateProvider(isA(MarketData.class));
    assertTrue(actualMarketDataViewResult.ratesProvider() instanceof DefaultLookupRatesProvider);
    assertTrue(actualMarketDataViewResult instanceof DefaultRatesMarketData);
    RatesMarketDataLookup lookup = actualMarketDataViewResult.getLookup();
    assertTrue(lookup instanceof DefaultRatesMarketDataLookup);
    assertNull(actualMarketDataViewResult.getValuationDate());
    assertSame(ofResult, lookup);
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
  }

  /**
   * Test {@link RatesMarketDataLookup#marketDataView(ScenarioMarketData)} with {@code
   * ScenarioMarketData}.
   *
   * <p>Method under test: {@link RatesMarketDataLookup#marketDataView(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(ScenarioMarketData) with 'ScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RatesScenarioMarketData RatesMarketDataLookup.marketDataView(ScenarioMarketData)"
  })
  void testMarketDataViewWithScenarioMarketData() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds,
            forwardCurveIds,
            ObservableSource.of("Name"),
            mock(FxRateLookup.class));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    RatesScenarioMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultRatesScenarioMarketData);
    assertEquals(1, actualMarketDataViewResult.getScenarioCount());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
  }

  /**
   * Test {@link RatesMarketDataLookup#getObservableSource()}.
   *
   * <p>Method under test: {@link RatesMarketDataLookup#getObservableSource()}
   */
  @Test
  @DisplayName("Test getObservableSource()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ObservableSource RatesMarketDataLookup.getObservableSource()"})
  void testGetObservableSource() {
    // Arrange
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<Index, CurveId> forwardCurveIds = new HashMap<>();
    ObservableSource obsSource = ObservableSource.of("Name");

    DefaultRatesMarketDataLookup ofResult =
        DefaultRatesMarketDataLookup.of(
            discountCurveIds, forwardCurveIds, obsSource, mock(FxRateLookup.class));

    // Act and Assert
    assertSame(obsSource, ofResult.getObservableSource());
  }
}
