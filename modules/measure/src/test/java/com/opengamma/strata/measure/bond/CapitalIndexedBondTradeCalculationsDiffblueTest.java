package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmountArray;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.MultiCurrencyScenarioArray;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.market.curve.RepoGroup;
import com.opengamma.strata.measure.rate.RatesMarketDataLookup;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.product.LegalEntityId;
import com.opengamma.strata.product.bond.ResolvedCapitalIndexedBondTrade;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CapitalIndexedBondTradeCalculationsDiffblueTest {
  /**
   * Test {@link
   * CapitalIndexedBondTradeCalculations#pv01CalibratedSum(ResolvedCapitalIndexedBondTrade,
   * RatesMarketDataLookup, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)} with {@code
   * trade}, {@code ratesLookup}, {@code legalEntityLookup}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * CapitalIndexedBondTradeCalculations#pv01CalibratedSum(ResolvedCapitalIndexedBondTrade,
   * RatesMarketDataLookup, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedCapitalIndexedBondTrade, RatesMarketDataLookup, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData) with 'trade', 'ratesLookup', 'legalEntityLookup', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray CapitalIndexedBondTradeCalculations.pv01CalibratedSum(ResolvedCapitalIndexedBondTrade, RatesMarketDataLookup, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeRatesLookupLegalEntityLookupMarketData() {
    // Arrange
    RatesMarketDataLookup ratesLookup = mock(RatesMarketDataLookup.class);
    when(ratesLookup.marketDataView(Mockito.<ScenarioMarketData>any()))
        .thenReturn(mock(RatesScenarioMarketData.class));
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup legalEntityLookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        CapitalIndexedBondTradeCalculations.DEFAULT.pv01CalibratedSum(
            null, ratesLookup, legalEntityLookup, ImmutableScenarioMarketData.empty());

    // Assert
    verify(ratesLookup).marketDataView(isA(ScenarioMarketData.class));
    MultiCurrencyAmountArray amounts = actualPv01CalibratedSumResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualPv01CalibratedSumResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualPv01CalibratedSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualPv01CalibratedSumResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link
   * CapitalIndexedBondTradeCalculations#currencyExposure(ResolvedCapitalIndexedBondTrade,
   * RatesMarketDataLookup, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)} with {@code
   * trade}, {@code ratesLookup}, {@code legalEntityLookup}, {@code marketData}.
   *
   * <p>Method under test: {@link
   * CapitalIndexedBondTradeCalculations#currencyExposure(ResolvedCapitalIndexedBondTrade,
   * RatesMarketDataLookup, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedCapitalIndexedBondTrade, RatesMarketDataLookup, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData) with 'trade', 'ratesLookup', 'legalEntityLookup', 'marketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray CapitalIndexedBondTradeCalculations.currencyExposure(ResolvedCapitalIndexedBondTrade, RatesMarketDataLookup, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeRatesLookupLegalEntityLookupMarketData() {
    // Arrange
    RatesMarketDataLookup ratesLookup = mock(RatesMarketDataLookup.class);
    when(ratesLookup.marketDataView(Mockito.<ScenarioMarketData>any()))
        .thenReturn(mock(RatesScenarioMarketData.class));
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup legalEntityLookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualCurrencyExposureResult =
        CapitalIndexedBondTradeCalculations.DEFAULT.currencyExposure(
            null, ratesLookup, legalEntityLookup, ImmutableScenarioMarketData.empty());

    // Assert
    verify(ratesLookup).marketDataView(isA(ScenarioMarketData.class));
    MultiCurrencyAmountArray amounts = actualCurrencyExposureResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualCurrencyExposureResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualCurrencyExposureResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualCurrencyExposureResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }
}
