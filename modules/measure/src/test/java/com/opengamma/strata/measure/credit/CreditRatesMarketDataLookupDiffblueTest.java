package com.opengamma.strata.measure.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableMap;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.calc.runner.CalculationParameter;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.pricer.credit.CreditRatesProvider;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CreditRatesMarketDataLookupDiffblueTest {
  /**
   * Test {@link CreditRatesMarketDataLookup#of(Map, Map, Map)} with {@code creditCurveIds}, {@code
   * discountCurveIds}, {@code recoveryRateCurveIds}.
   *
   * <p>Method under test: {@link CreditRatesMarketDataLookup#of(Map, Map, Map)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, Map) with 'creditCurveIds', 'discountCurveIds', 'recoveryRateCurveIds'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CreditRatesMarketDataLookup CreditRatesMarketDataLookup.of(Map, Map, Map)"})
  void testOfWithCreditCurveIdsDiscountCurveIdsRecoveryRateCurveIds() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();

    // Act
    CreditRatesMarketDataLookup actualOfResult =
        CreditRatesMarketDataLookup.of(creditCurveIds, discountCurveIds, new HashMap<>());

    // Assert
    assertTrue(actualOfResult instanceof DefaultCreditRatesMarketDataLookup);
    ImmutableMap<Pair<StandardId, Currency>, CurveId> creditCurveIds2 =
        ((DefaultCreditRatesMarketDataLookup) actualOfResult).getCreditCurveIds();
    assertEquals(creditCurveIds, creditCurveIds2);
    assertSame(
        creditCurveIds2,
        ((DefaultCreditRatesMarketDataLookup) actualOfResult).getDiscountCurveIds());
    assertSame(
        creditCurveIds2,
        ((DefaultCreditRatesMarketDataLookup) actualOfResult).getRecoveryRateCurveIds());
  }

  /**
   * Test {@link CreditRatesMarketDataLookup#of(Map, Map, Map, ObservableSource)} with {@code
   * creditCurveIds}, {@code discountCurveIds}, {@code recoveryRateCurveIds}, {@code
   * observableSource}.
   *
   * <p>Method under test: {@link CreditRatesMarketDataLookup#of(Map, Map, Map, ObservableSource)}
   */
  @Test
  @DisplayName(
      "Test of(Map, Map, Map, ObservableSource) with 'creditCurveIds', 'discountCurveIds', 'recoveryRateCurveIds', 'observableSource'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CreditRatesMarketDataLookup CreditRatesMarketDataLookup.of(Map, Map, Map, ObservableSource)"
  })
  void testOfWithCreditCurveIdsDiscountCurveIdsRecoveryRateCurveIdsObservableSource() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    // Act
    CreditRatesMarketDataLookup actualOfResult =
        CreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Assert
    assertTrue(actualOfResult instanceof DefaultCreditRatesMarketDataLookup);
    ImmutableMap<Pair<StandardId, Currency>, CurveId> creditCurveIds2 =
        ((DefaultCreditRatesMarketDataLookup) actualOfResult).getCreditCurveIds();
    assertEquals(creditCurveIds, creditCurveIds2);
    assertSame(
        creditCurveIds2,
        ((DefaultCreditRatesMarketDataLookup) actualOfResult).getDiscountCurveIds());
    assertSame(
        creditCurveIds2,
        ((DefaultCreditRatesMarketDataLookup) actualOfResult).getRecoveryRateCurveIds());
  }

  /**
   * Test {@link CreditRatesMarketDataLookup#queryType()}.
   *
   * <p>Method under test: {@link CreditRatesMarketDataLookup#queryType()}
   */
  @Test
  @DisplayName("Test queryType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class CreditRatesMarketDataLookup.queryType()"})
  void testQueryType() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act
    Class<? extends CalculationParameter> actualQueryTypeResult = ofResult.queryType();

    // Assert
    Class<CreditRatesMarketDataLookup> expectedQueryTypeResult = CreditRatesMarketDataLookup.class;
    assertEquals(expectedQueryTypeResult, actualQueryTypeResult);
  }

  /**
   * Test {@link CreditRatesMarketDataLookup#marketDataView(MarketData)} with {@code MarketData}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCreditRatesMarketData}.
   * </ul>
   *
   * <p>Method under test: {@link CreditRatesMarketDataLookup#marketDataView(MarketData)}
   */
  @Test
  @DisplayName(
      "Test marketDataView(MarketData) with 'MarketData'; then return DefaultCreditRatesMarketData")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CreditRatesMarketData CreditRatesMarketDataLookup.marketDataView(MarketData)"
  })
  void testMarketDataViewWithMarketData_thenReturnDefaultCreditRatesMarketData() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    MarketData marketData = mock(MarketData.class);

    // Act
    CreditRatesMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultCreditRatesMarketData);
    CreditRatesProvider creditRatesProviderResult =
        actualMarketDataViewResult.creditRatesProvider();
    assertTrue(creditRatesProviderResult instanceof DefaultLookupCreditRatesProvider);
    assertNull(actualMarketDataViewResult.getValuationDate());
    assertNull(creditRatesProviderResult.getValuationDate());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
    assertSame(
        ofResult, ((DefaultLookupCreditRatesProvider) creditRatesProviderResult).getLookup());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
    assertSame(
        marketData, ((DefaultLookupCreditRatesProvider) creditRatesProviderResult).getMarketData());
  }

  /**
   * Test {@link CreditRatesMarketDataLookup#marketDataView(ScenarioMarketData)} with {@code
   * ScenarioMarketData}.
   *
   * <p>Method under test: {@link CreditRatesMarketDataLookup#marketDataView(ScenarioMarketData)}
   */
  @Test
  @DisplayName("Test marketDataView(ScenarioMarketData) with 'ScenarioMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CreditRatesScenarioMarketData CreditRatesMarketDataLookup.marketDataView(ScenarioMarketData)"
  })
  void testMarketDataViewWithScenarioMarketData() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup ofResult =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    // Act
    CreditRatesScenarioMarketData actualMarketDataViewResult = ofResult.marketDataView(marketData);

    // Assert
    assertTrue(actualMarketDataViewResult instanceof DefaultCreditRatesScenarioMarketData);
    assertEquals(1, actualMarketDataViewResult.getScenarioCount());
    assertSame(marketData, actualMarketDataViewResult.getMarketData());
    assertSame(ofResult, actualMarketDataViewResult.getLookup());
  }
}
