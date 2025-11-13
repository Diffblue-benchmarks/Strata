package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmountArray;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.MultiCurrencyScenarioArray;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.market.curve.RepoGroup;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.pricer.bond.DiscountingCapitalIndexedBondTradePricer;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
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

class CapitalIndexedBondMeasureCalculationsDiffblueTest {
  /**
   * Test {@link
   * CapitalIndexedBondMeasureCalculations#pv01CalibratedSum(ResolvedCapitalIndexedBondTrade,
   * RatesScenarioMarketData, LegalEntityDiscountingScenarioMarketData)} with {@code trade}, {@code
   * ratesMarketData}, {@code legalEntityMarketData}.
   *
   * <p>Method under test: {@link
   * CapitalIndexedBondMeasureCalculations#pv01CalibratedSum(ResolvedCapitalIndexedBondTrade,
   * RatesScenarioMarketData, LegalEntityDiscountingScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedCapitalIndexedBondTrade, RatesScenarioMarketData, LegalEntityDiscountingScenarioMarketData) with 'trade', 'ratesMarketData', 'legalEntityMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray CapitalIndexedBondMeasureCalculations.pv01CalibratedSum(ResolvedCapitalIndexedBondTrade, RatesScenarioMarketData, LegalEntityDiscountingScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeRatesMarketDataLegalEntityMarketData() {
    // Arrange
    RatesScenarioMarketData ratesMarketData = mock(RatesScenarioMarketData.class);
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        CapitalIndexedBondMeasureCalculations.DEFAULT.pv01CalibratedSum(
            null,
            ratesMarketData,
            DefaultLegalEntityDiscountingScenarioMarketData.of(
                lookup, ImmutableScenarioMarketData.empty()));

    // Assert
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
   * CapitalIndexedBondMeasureCalculations#currencyExposure(ResolvedCapitalIndexedBondTrade,
   * RatesScenarioMarketData, LegalEntityDiscountingScenarioMarketData)} with {@code trade}, {@code
   * ratesMarketData}, {@code legalEntityMarketData}.
   *
   * <p>Method under test: {@link
   * CapitalIndexedBondMeasureCalculations#currencyExposure(ResolvedCapitalIndexedBondTrade,
   * RatesScenarioMarketData, LegalEntityDiscountingScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedCapitalIndexedBondTrade, RatesScenarioMarketData, LegalEntityDiscountingScenarioMarketData) with 'trade', 'ratesMarketData', 'legalEntityMarketData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray CapitalIndexedBondMeasureCalculations.currencyExposure(ResolvedCapitalIndexedBondTrade, RatesScenarioMarketData, LegalEntityDiscountingScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeRatesMarketDataLegalEntityMarketData() {
    // Arrange
    RatesScenarioMarketData ratesMarketData = mock(RatesScenarioMarketData.class);
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualCurrencyExposureResult =
        CapitalIndexedBondMeasureCalculations.DEFAULT.currencyExposure(
            null,
            ratesMarketData,
            DefaultLegalEntityDiscountingScenarioMarketData.of(
                lookup, ImmutableScenarioMarketData.empty()));

    // Assert
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

  /**
   * Test {@link CapitalIndexedBondMeasureCalculations#currentCash(ResolvedCapitalIndexedBondTrade,
   * RatesProvider)} with {@code trade}, {@code ratesProvider}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CapitalIndexedBondMeasureCalculations#currentCash(ResolvedCapitalIndexedBondTrade,
   * RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedCapitalIndexedBondTrade, RatesProvider) with 'trade', 'ratesProvider'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount CapitalIndexedBondMeasureCalculations.currentCash(ResolvedCapitalIndexedBondTrade, RatesProvider)"
  })
  void testCurrentCashWithTradeRatesProvider_thenReturnNull() {
    // Arrange
    DiscountingCapitalIndexedBondTradePricer tradePricer =
        mock(DiscountingCapitalIndexedBondTradePricer.class);
    when(tradePricer.currentCash(
            Mockito.<ResolvedCapitalIndexedBondTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(null);
    CapitalIndexedBondMeasureCalculations capitalIndexedBondMeasureCalculations =
        new CapitalIndexedBondMeasureCalculations(tradePricer);

    // Act
    CurrencyAmount actualCurrentCashResult =
        capitalIndexedBondMeasureCalculations.currentCash(null, new MockRatesProvider());

    // Assert
    verify(tradePricer).currentCash(isNull(), isA(RatesProvider.class));
    assertNull(actualCurrentCashResult);
  }
}
