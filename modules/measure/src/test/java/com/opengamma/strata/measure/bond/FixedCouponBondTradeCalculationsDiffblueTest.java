package com.opengamma.strata.measure.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
import com.opengamma.strata.product.LegalEntityId;
import com.opengamma.strata.product.bond.ResolvedFixedCouponBondTrade;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FixedCouponBondTradeCalculationsDiffblueTest {
  /**
   * Test {@link FixedCouponBondTradeCalculations#pv01CalibratedSum(ResolvedFixedCouponBondTrade,
   * LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code
   * lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FixedCouponBondTradeCalculations#pv01CalibratedSum(ResolvedFixedCouponBondTrade,
   * LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedFixedCouponBondTrade, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FixedCouponBondTradeCalculations.pv01CalibratedSum(ResolvedFixedCouponBondTrade, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeLookupMarketData_thenReturnAmountsSizeIsZero() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        FixedCouponBondTradeCalculations.DEFAULT.pv01CalibratedSum(
            null, lookup, ImmutableScenarioMarketData.empty());

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
   * Test {@link FixedCouponBondTradeCalculations#pv01MarketQuoteSum(ResolvedFixedCouponBondTrade,
   * LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code
   * lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FixedCouponBondTradeCalculations#pv01MarketQuoteSum(ResolvedFixedCouponBondTrade,
   * LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedFixedCouponBondTrade, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FixedCouponBondTradeCalculations.pv01MarketQuoteSum(ResolvedFixedCouponBondTrade, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeLookupMarketData_thenReturnAmountsSizeIsZero() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualPv01MarketQuoteSumResult =
        FixedCouponBondTradeCalculations.DEFAULT.pv01MarketQuoteSum(
            null, lookup, ImmutableScenarioMarketData.empty());

    // Assert
    MultiCurrencyAmountArray amounts = actualPv01MarketQuoteSumResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualPv01MarketQuoteSumResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualPv01MarketQuoteSumResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualPv01MarketQuoteSumResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link FixedCouponBondTradeCalculations#currencyExposure(ResolvedFixedCouponBondTrade,
   * LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)} with {@code trade}, {@code
   * lookup}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * FixedCouponBondTradeCalculations#currencyExposure(ResolvedFixedCouponBondTrade,
   * LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedFixedCouponBondTrade, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData) with 'trade', 'lookup', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray FixedCouponBondTradeCalculations.currencyExposure(ResolvedFixedCouponBondTrade, LegalEntityDiscountingMarketDataLookup, ScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeLookupMarketData_thenReturnAmountsSizeIsZero() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualCurrencyExposureResult =
        FixedCouponBondTradeCalculations.DEFAULT.currencyExposure(
            null, lookup, ImmutableScenarioMarketData.empty());

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
}
