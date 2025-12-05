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
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.market.curve.RepoGroup;
import com.opengamma.strata.product.LegalEntityId;
import com.opengamma.strata.product.bond.ResolvedBondFutureTrade;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BondFutureMeasureCalculationsDiffblueTest {
  /**
   * Test {@link BondFutureMeasureCalculations#pv01CalibratedSum(ResolvedBondFutureTrade,
   * LegalEntityDiscountingScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BondFutureMeasureCalculations#pv01CalibratedSum(ResolvedBondFutureTrade,
   * LegalEntityDiscountingScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedBondFutureTrade, LegalEntityDiscountingScenarioMarketData) with 'trade', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray BondFutureMeasureCalculations.pv01CalibratedSum(ResolvedBondFutureTrade, LegalEntityDiscountingScenarioMarketData)"
  })
  void testPv01CalibratedSumWithTradeMarketData_thenReturnAmountsSizeIsZero() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        BondFutureMeasureCalculations.DEFAULT.pv01CalibratedSum(
            null,
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
   * Test {@link BondFutureMeasureCalculations#pv01MarketQuoteSum(ResolvedBondFutureTrade,
   * LegalEntityDiscountingScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BondFutureMeasureCalculations#pv01MarketQuoteSum(ResolvedBondFutureTrade,
   * LegalEntityDiscountingScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedBondFutureTrade, LegalEntityDiscountingScenarioMarketData) with 'trade', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray BondFutureMeasureCalculations.pv01MarketQuoteSum(ResolvedBondFutureTrade, LegalEntityDiscountingScenarioMarketData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketData_thenReturnAmountsSizeIsZero() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualPv01MarketQuoteSumResult =
        BondFutureMeasureCalculations.DEFAULT.pv01MarketQuoteSum(
            null,
            DefaultLegalEntityDiscountingScenarioMarketData.of(
                lookup, ImmutableScenarioMarketData.empty()));

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
   * Test {@link BondFutureMeasureCalculations#currencyExposure(ResolvedBondFutureTrade,
   * LegalEntityDiscountingScenarioMarketData)} with {@code trade}, {@code marketData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * BondFutureMeasureCalculations#currencyExposure(ResolvedBondFutureTrade,
   * LegalEntityDiscountingScenarioMarketData)}
   */
  @Test
  @DisplayName(
      "Test currencyExposure(ResolvedBondFutureTrade, LegalEntityDiscountingScenarioMarketData) with 'trade', 'marketData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray BondFutureMeasureCalculations.currencyExposure(ResolvedBondFutureTrade, LegalEntityDiscountingScenarioMarketData)"
  })
  void testCurrencyExposureWithTradeMarketData_thenReturnAmountsSizeIsZero() {
    // Arrange
    HashMap<LegalEntityId, RepoGroup> repoCurveGroups = new HashMap<>();
    HashMap<Pair<RepoGroup, Currency>, CurveId> repoCurveIds = new HashMap<>();

    DefaultLegalEntityDiscountingMarketDataLookup lookup =
        DefaultLegalEntityDiscountingMarketDataLookup.of(
            repoCurveGroups, repoCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualCurrencyExposureResult =
        BondFutureMeasureCalculations.DEFAULT.currencyExposure(
            null,
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
}
