package com.opengamma.strata.measure.fxopt;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.data.MarketDataId;
import com.opengamma.strata.measure.curve.TestMarketDataMap;
import com.opengamma.strata.measure.rate.RatesMarketData;
import com.opengamma.strata.measure.rate.RatesScenarioMarketData;
import com.opengamma.strata.pricer.DiscountingPaymentPricer;
import com.opengamma.strata.pricer.fxopt.BlackFxSingleBarrierOptionTradePricer;
import com.opengamma.strata.pricer.fxopt.FxOptionVolatilities;
import com.opengamma.strata.pricer.fxopt.ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer;
import com.opengamma.strata.pricer.fxopt.ImpliedTrinomialTreeFxSingleBarrierOptionTradePricer;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.fxopt.ResolvedFxSingleBarrierOptionTrade;
import java.time.LocalDate;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FxSingleBarrierOptionMeasureCalculationsDiffblueTest {
  /**
   * Test {@link
   * FxSingleBarrierOptionMeasureCalculations#vegaMarketQuoteBucketed(ResolvedFxSingleBarrierOptionTrade,
   * RatesProvider, FxOptionVolatilities, FxSingleBarrierOptionMethod)} with {@code trade}, {@code
   * ratesProvider}, {@code volatilities}, {@code method}.
   *
   * <p>Method under test: {@link
   * FxSingleBarrierOptionMeasureCalculations#vegaMarketQuoteBucketed(ResolvedFxSingleBarrierOptionTrade,
   * RatesProvider, FxOptionVolatilities, FxSingleBarrierOptionMethod)}
   */
  @Test
  @DisplayName(
      "Test vegaMarketQuoteBucketed(ResolvedFxSingleBarrierOptionTrade, RatesProvider, FxOptionVolatilities, FxSingleBarrierOptionMethod) with 'trade', 'ratesProvider', 'volatilities', 'method'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.param.CurrencyParameterSensitivities FxSingleBarrierOptionMeasureCalculations.vegaMarketQuoteBucketed(ResolvedFxSingleBarrierOptionTrade, RatesProvider, FxOptionVolatilities, FxSingleBarrierOptionMethod)"
  })
  void testVegaMarketQuoteBucketedWithTradeRatesProviderVolatilitiesMethod() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            FxSingleBarrierOptionMeasureCalculations.DEFAULT.vegaMarketQuoteBucketed(
                null, new MockRatesProvider(), null, FxSingleBarrierOptionMethod.TRINOMIAL_TREE));
  }

  /**
   * Test {@link
   * FxSingleBarrierOptionMeasureCalculations#currentCash(ResolvedFxSingleBarrierOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod)} with {@code
   * trade}, {@code ratesMarketData}, {@code optionMarketData}, {@code method}.
   *
   * <p>Method under test: {@link
   * FxSingleBarrierOptionMeasureCalculations#currentCash(ResolvedFxSingleBarrierOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxSingleBarrierOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod) with 'trade', 'ratesMarketData', 'optionMarketData', 'method'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FxSingleBarrierOptionMeasureCalculations.currentCash(ResolvedFxSingleBarrierOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod)"
  })
  void testCurrentCashWithTradeRatesMarketDataOptionMarketDataMethod() {
    // Arrange
    RatesScenarioMarketData ratesMarketData = mock(RatesScenarioMarketData.class);
    when(ratesMarketData.getScenarioCount()).thenThrow(new IllegalArgumentException());
    DefaultFxOptionMarketDataLookup lookup = DefaultFxOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultFxOptionScenarioMarketData optionMarketData =
        DefaultFxOptionScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            FxSingleBarrierOptionMeasureCalculations.DEFAULT.currentCash(
                null, ratesMarketData, optionMarketData, FxSingleBarrierOptionMethod.BLACK));
    verify(ratesMarketData).getScenarioCount();
  }

  /**
   * Test {@link
   * FxSingleBarrierOptionMeasureCalculations#currentCash(ResolvedFxSingleBarrierOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod)} with {@code
   * trade}, {@code ratesMarketData}, {@code optionMarketData}, {@code method}.
   *
   * <p>Method under test: {@link
   * FxSingleBarrierOptionMeasureCalculations#currentCash(ResolvedFxSingleBarrierOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxSingleBarrierOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod) with 'trade', 'ratesMarketData', 'optionMarketData', 'method'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FxSingleBarrierOptionMeasureCalculations.currentCash(ResolvedFxSingleBarrierOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod)"
  })
  void testCurrentCashWithTradeRatesMarketDataOptionMarketDataMethod2() {
    // Arrange
    RatesScenarioMarketData ratesMarketData = mock(RatesScenarioMarketData.class);
    when(ratesMarketData.scenario(anyInt())).thenThrow(new IllegalArgumentException());
    when(ratesMarketData.getScenarioCount()).thenReturn(1);
    DefaultFxOptionMarketDataLookup lookup = DefaultFxOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultFxOptionScenarioMarketData optionMarketData =
        DefaultFxOptionScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            FxSingleBarrierOptionMeasureCalculations.DEFAULT.currentCash(
                null, ratesMarketData, optionMarketData, FxSingleBarrierOptionMethod.BLACK));
    verify(ratesMarketData).getScenarioCount();
    verify(ratesMarketData).scenario(0);
  }

  /**
   * Test {@link
   * FxSingleBarrierOptionMeasureCalculations#currentCash(ResolvedFxSingleBarrierOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod)} with {@code
   * trade}, {@code ratesMarketData}, {@code optionMarketData}, {@code method}.
   *
   * <p>Method under test: {@link
   * FxSingleBarrierOptionMeasureCalculations#currentCash(ResolvedFxSingleBarrierOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxSingleBarrierOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod) with 'trade', 'ratesMarketData', 'optionMarketData', 'method'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FxSingleBarrierOptionMeasureCalculations.currentCash(ResolvedFxSingleBarrierOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxSingleBarrierOptionMethod)"
  })
  void testCurrentCashWithTradeRatesMarketDataOptionMarketDataMethod3() {
    // Arrange
    RatesMarketData ratesMarketData = mock(RatesMarketData.class);
    when(ratesMarketData.getValuationDate()).thenThrow(new IllegalArgumentException());

    RatesScenarioMarketData ratesMarketData2 = mock(RatesScenarioMarketData.class);
    when(ratesMarketData2.scenario(anyInt())).thenReturn(ratesMarketData);
    when(ratesMarketData2.getScenarioCount()).thenReturn(1);
    DefaultFxOptionMarketDataLookup lookup = DefaultFxOptionMarketDataLookup.of(new HashMap<>());
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    HashMap<MarketDataId<?>, Object> valueMap = new HashMap<>();

    TestMarketDataMap marketData = new TestMarketDataMap(valuationDate, valueMap, new HashMap<>());

    DefaultFxOptionScenarioMarketData optionMarketData =
        DefaultFxOptionScenarioMarketData.of(lookup, marketData);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            FxSingleBarrierOptionMeasureCalculations.DEFAULT.currentCash(
                null, ratesMarketData2, optionMarketData, FxSingleBarrierOptionMethod.BLACK));
    verify(ratesMarketData).getValuationDate();
    verify(ratesMarketData2).getScenarioCount();
    verify(ratesMarketData2).scenario(0);
  }

  /**
   * Test {@link
   * FxSingleBarrierOptionMeasureCalculations#currentCash(ResolvedFxSingleBarrierOptionTrade,
   * LocalDate, FxSingleBarrierOptionMethod)} with {@code trade}, {@code valuationDate}, {@code
   * method}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleBarrierOptionMeasureCalculations#currentCash(ResolvedFxSingleBarrierOptionTrade,
   * LocalDate, FxSingleBarrierOptionMethod)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxSingleBarrierOptionTrade, LocalDate, FxSingleBarrierOptionMethod) with 'trade', 'valuationDate', 'method'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount FxSingleBarrierOptionMeasureCalculations.currentCash(ResolvedFxSingleBarrierOptionTrade, LocalDate, FxSingleBarrierOptionMethod)"
  })
  void testCurrentCashWithTradeValuationDateMethod_thenReturnNull() {
    // Arrange
    BlackFxSingleBarrierOptionTradePricer blackPricer =
        mock(BlackFxSingleBarrierOptionTradePricer.class);
    when(blackPricer.currentCash(
            Mockito.<ResolvedFxSingleBarrierOptionTrade>any(), Mockito.<LocalDate>any()))
        .thenReturn(null);
    ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer productPricer =
        new ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer();
    ImpliedTrinomialTreeFxSingleBarrierOptionTradePricer trinomialTreePricer =
        new ImpliedTrinomialTreeFxSingleBarrierOptionTradePricer(
            productPricer, new DiscountingPaymentPricer());

    FxSingleBarrierOptionMeasureCalculations fxSingleBarrierOptionMeasureCalculations =
        new FxSingleBarrierOptionMeasureCalculations(blackPricer, trinomialTreePricer);

    // Act
    CurrencyAmount actualCurrentCashResult =
        fxSingleBarrierOptionMeasureCalculations.currentCash(
            null, LocalDate.of(1970, 1, 1), FxSingleBarrierOptionMethod.BLACK);

    // Assert
    verify(blackPricer).currentCash(isNull(), isA(LocalDate.class));
    assertNull(actualCurrentCashResult);
  }
}
