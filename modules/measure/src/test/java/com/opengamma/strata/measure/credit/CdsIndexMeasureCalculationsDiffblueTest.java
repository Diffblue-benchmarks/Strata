package com.opengamma.strata.measure.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.StandardId;
import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.MultiCurrencyAmount;
import com.opengamma.strata.basics.currency.MultiCurrencyAmountArray;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.data.ObservableSource;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.MultiCurrencyScenarioArray;
import com.opengamma.strata.market.curve.CurveId;
import com.opengamma.strata.pricer.credit.AccrualOnDefaultFormula;
import com.opengamma.strata.pricer.credit.IsdaHomogenousCdsIndexTradePricer;
import com.opengamma.strata.product.credit.ResolvedCdsIndexTrade;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CdsIndexMeasureCalculationsDiffblueTest {
  /**
   * Test {@link
   * CdsIndexMeasureCalculations#CdsIndexMeasureCalculations(IsdaHomogenousCdsIndexTradePricer)}.
   *
   * <ul>
   *   <li>Then return expectedLoss {@code null} and {@code null} is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * CdsIndexMeasureCalculations#CdsIndexMeasureCalculations(IsdaHomogenousCdsIndexTradePricer)}
   */
  @Test
  @DisplayName(
      "Test new CdsIndexMeasureCalculations(IsdaHomogenousCdsIndexTradePricer); then return expectedLoss 'null' and 'null' is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CdsIndexMeasureCalculations.<init>(IsdaHomogenousCdsIndexTradePricer)"})
  void testNewCdsIndexMeasureCalculations_thenReturnExpectedLossNullAndNullIsNull() {
    // Arrange
    IsdaHomogenousCdsIndexTradePricer tradePricer = mock(IsdaHomogenousCdsIndexTradePricer.class);
    when(tradePricer.getAccrualOnDefaultFormula())
        .thenReturn(AccrualOnDefaultFormula.ORIGINAL_ISDA);

    // Act
    CdsIndexMeasureCalculations actualCdsIndexMeasureCalculations =
        new CdsIndexMeasureCalculations(tradePricer);

    // Assert
    verify(tradePricer, atLeast(1)).getAccrualOnDefaultFormula();
    assertNull(actualCdsIndexMeasureCalculations.expectedLoss(null, null));
  }

  /**
   * Test {@link CdsIndexMeasureCalculations#ir01MarketQuoteParallel(ResolvedCdsIndexTrade,
   * CreditRatesScenarioMarketData, ReferenceData)} with {@code trade}, {@code marketData}, {@code
   * refData}.
   *
   * <p>Method under test: {@link
   * CdsIndexMeasureCalculations#ir01MarketQuoteParallel(ResolvedCdsIndexTrade,
   * CreditRatesScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test ir01MarketQuoteParallel(ResolvedCdsIndexTrade, CreditRatesScenarioMarketData, ReferenceData) with 'trade', 'marketData', 'refData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray CdsIndexMeasureCalculations.ir01MarketQuoteParallel(ResolvedCdsIndexTrade, CreditRatesScenarioMarketData, ReferenceData)"
  })
  void testIr01MarketQuoteParallelWithTradeMarketDataRefData() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualIr01MarketQuoteParallelResult =
        CdsIndexMeasureCalculations.DEFAULT.ir01MarketQuoteParallel(
            null,
            DefaultCreditRatesScenarioMarketData.of(lookup, ImmutableScenarioMarketData.empty()),
            mock(ReferenceData.class));

    // Assert
    MultiCurrencyAmountArray amounts = actualIr01MarketQuoteParallelResult.getAmounts();
    assertEquals(0, amounts.getSize());
    assertEquals(0, amounts.size());
    assertEquals(0, actualIr01MarketQuoteParallelResult.getScenarioCount());
    assertTrue(amounts.getValues().isEmpty());
    Stream<MultiCurrencyAmount> streamResult = actualIr01MarketQuoteParallelResult.stream();
    assertTrue(streamResult.limit(5).collect(Collectors.toList()).isEmpty());
    Set<Currency> currencies = actualIr01MarketQuoteParallelResult.getCurrencies();
    assertTrue(currencies.isEmpty());
    assertSame(currencies, amounts.getCurrencies());
  }

  /**
   * Test {@link CdsIndexMeasureCalculations#pv01CalibratedSum(ResolvedCdsIndexTrade,
   * CreditRatesScenarioMarketData, ReferenceData)} with {@code trade}, {@code marketData}, {@code
   * refData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * CdsIndexMeasureCalculations#pv01CalibratedSum(ResolvedCdsIndexTrade,
   * CreditRatesScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test pv01CalibratedSum(ResolvedCdsIndexTrade, CreditRatesScenarioMarketData, ReferenceData) with 'trade', 'marketData', 'refData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray CdsIndexMeasureCalculations.pv01CalibratedSum(ResolvedCdsIndexTrade, CreditRatesScenarioMarketData, ReferenceData)"
  })
  void testPv01CalibratedSumWithTradeMarketDataRefData_thenReturnAmountsSizeIsZero() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualPv01CalibratedSumResult =
        CdsIndexMeasureCalculations.DEFAULT.pv01CalibratedSum(
            null,
            DefaultCreditRatesScenarioMarketData.of(lookup, ImmutableScenarioMarketData.empty()),
            mock(ReferenceData.class));

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
   * Test {@link CdsIndexMeasureCalculations#pv01MarketQuoteSum(ResolvedCdsIndexTrade,
   * CreditRatesScenarioMarketData, ReferenceData)} with {@code trade}, {@code marketData}, {@code
   * refData}.
   *
   * <ul>
   *   <li>Then return Amounts Size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * CdsIndexMeasureCalculations#pv01MarketQuoteSum(ResolvedCdsIndexTrade,
   * CreditRatesScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test pv01MarketQuoteSum(ResolvedCdsIndexTrade, CreditRatesScenarioMarketData, ReferenceData) with 'trade', 'marketData', 'refData'; then return Amounts Size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MultiCurrencyScenarioArray CdsIndexMeasureCalculations.pv01MarketQuoteSum(ResolvedCdsIndexTrade, CreditRatesScenarioMarketData, ReferenceData)"
  })
  void testPv01MarketQuoteSumWithTradeMarketDataRefData_thenReturnAmountsSizeIsZero() {
    // Arrange
    HashMap<Pair<StandardId, Currency>, CurveId> creditCurveIds = new HashMap<>();
    HashMap<Currency, CurveId> discountCurveIds = new HashMap<>();
    HashMap<StandardId, CurveId> recoveryRateCurveIds = new HashMap<>();

    DefaultCreditRatesMarketDataLookup lookup =
        DefaultCreditRatesMarketDataLookup.of(
            creditCurveIds, discountCurveIds, recoveryRateCurveIds, ObservableSource.of("Name"));

    // Act
    MultiCurrencyScenarioArray actualPv01MarketQuoteSumResult =
        CdsIndexMeasureCalculations.DEFAULT.pv01MarketQuoteSum(
            null,
            DefaultCreditRatesScenarioMarketData.of(lookup, ImmutableScenarioMarketData.empty()),
            mock(ReferenceData.class));

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
}
