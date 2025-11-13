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
import com.opengamma.strata.pricer.fx.DiscountingFxSingleProductPricer;
import com.opengamma.strata.pricer.fxopt.BlackFxVanillaOptionTradePricer;
import com.opengamma.strata.pricer.fxopt.FxOptionVolatilities;
import com.opengamma.strata.pricer.fxopt.VannaVolgaFxVanillaOptionProductPricer;
import com.opengamma.strata.pricer.fxopt.VannaVolgaFxVanillaOptionTradePricer;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.fxopt.ResolvedFxVanillaOptionTrade;
import java.time.LocalDate;
import java.util.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FxVanillaOptionMeasureCalculationsDiffblueTest {
  /**
   * Test {@link FxVanillaOptionMeasureCalculations#delta(ResolvedFxVanillaOptionTrade,
   * RatesProvider, FxOptionVolatilities, FxVanillaOptionMethod)} with {@code trade}, {@code
   * ratesProvider}, {@code volatilities}, {@code method}.
   *
   * <p>Method under test: {@link
   * FxVanillaOptionMeasureCalculations#delta(ResolvedFxVanillaOptionTrade, RatesProvider,
   * FxOptionVolatilities, FxVanillaOptionMethod)}
   */
  @Test
  @DisplayName(
      "Test delta(ResolvedFxVanillaOptionTrade, RatesProvider, FxOptionVolatilities, FxVanillaOptionMethod) with 'trade', 'ratesProvider', 'volatilities', 'method'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double FxVanillaOptionMeasureCalculations.delta(ResolvedFxVanillaOptionTrade, RatesProvider, FxOptionVolatilities, FxVanillaOptionMethod)"
  })
  void testDeltaWithTradeRatesProviderVolatilitiesMethod() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            FxVanillaOptionMeasureCalculations.DEFAULT.delta(
                null, new MockRatesProvider(), null, FxVanillaOptionMethod.VANNA_VOLGA));
  }

  /**
   * Test {@link FxVanillaOptionMeasureCalculations#currentCash(ResolvedFxVanillaOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod)} with {@code
   * trade}, {@code ratesMarketData}, {@code optionMarketData}, {@code method}.
   *
   * <p>Method under test: {@link
   * FxVanillaOptionMeasureCalculations#currentCash(ResolvedFxVanillaOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxVanillaOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod) with 'trade', 'ratesMarketData', 'optionMarketData', 'method'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FxVanillaOptionMeasureCalculations.currentCash(ResolvedFxVanillaOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod)"
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
            FxVanillaOptionMeasureCalculations.DEFAULT.currentCash(
                null, ratesMarketData, optionMarketData, FxVanillaOptionMethod.BLACK));
    verify(ratesMarketData).getScenarioCount();
  }

  /**
   * Test {@link FxVanillaOptionMeasureCalculations#currentCash(ResolvedFxVanillaOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod)} with {@code
   * trade}, {@code ratesMarketData}, {@code optionMarketData}, {@code method}.
   *
   * <p>Method under test: {@link
   * FxVanillaOptionMeasureCalculations#currentCash(ResolvedFxVanillaOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxVanillaOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod) with 'trade', 'ratesMarketData', 'optionMarketData', 'method'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FxVanillaOptionMeasureCalculations.currentCash(ResolvedFxVanillaOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod)"
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
            FxVanillaOptionMeasureCalculations.DEFAULT.currentCash(
                null, ratesMarketData, optionMarketData, FxVanillaOptionMethod.BLACK));
    verify(ratesMarketData).getScenarioCount();
    verify(ratesMarketData).scenario(0);
  }

  /**
   * Test {@link FxVanillaOptionMeasureCalculations#currentCash(ResolvedFxVanillaOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod)} with {@code
   * trade}, {@code ratesMarketData}, {@code optionMarketData}, {@code method}.
   *
   * <p>Method under test: {@link
   * FxVanillaOptionMeasureCalculations#currentCash(ResolvedFxVanillaOptionTrade,
   * RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxVanillaOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod) with 'trade', 'ratesMarketData', 'optionMarketData', 'method'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.data.scenario.CurrencyScenarioArray FxVanillaOptionMeasureCalculations.currentCash(ResolvedFxVanillaOptionTrade, RatesScenarioMarketData, FxOptionScenarioMarketData, FxVanillaOptionMethod)"
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
            FxVanillaOptionMeasureCalculations.DEFAULT.currentCash(
                null, ratesMarketData2, optionMarketData, FxVanillaOptionMethod.BLACK));
    verify(ratesMarketData).getValuationDate();
    verify(ratesMarketData2).getScenarioCount();
    verify(ratesMarketData2).scenario(0);
  }

  /**
   * Test {@link FxVanillaOptionMeasureCalculations#currentCash(ResolvedFxVanillaOptionTrade,
   * LocalDate, FxVanillaOptionMethod)} with {@code trade}, {@code valuationDate}, {@code method}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxVanillaOptionMeasureCalculations#currentCash(ResolvedFxVanillaOptionTrade, LocalDate,
   * FxVanillaOptionMethod)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxVanillaOptionTrade, LocalDate, FxVanillaOptionMethod) with 'trade', 'valuationDate', 'method'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount FxVanillaOptionMeasureCalculations.currentCash(ResolvedFxVanillaOptionTrade, LocalDate, FxVanillaOptionMethod)"
  })
  void testCurrentCashWithTradeValuationDateMethod_thenReturnNull() {
    // Arrange
    BlackFxVanillaOptionTradePricer blackPricer = mock(BlackFxVanillaOptionTradePricer.class);
    when(blackPricer.currentCash(
            Mockito.<ResolvedFxVanillaOptionTrade>any(), Mockito.<LocalDate>any()))
        .thenReturn(null);
    VannaVolgaFxVanillaOptionProductPricer productPricer =
        new VannaVolgaFxVanillaOptionProductPricer(
            new DiscountingFxSingleProductPricer(new DiscountingPaymentPricer()));
    VannaVolgaFxVanillaOptionTradePricer vannaVolgaPricer =
        new VannaVolgaFxVanillaOptionTradePricer(productPricer, new DiscountingPaymentPricer());

    FxVanillaOptionMeasureCalculations fxVanillaOptionMeasureCalculations =
        new FxVanillaOptionMeasureCalculations(blackPricer, vannaVolgaPricer);

    // Act
    CurrencyAmount actualCurrentCashResult =
        fxVanillaOptionMeasureCalculations.currentCash(
            null, LocalDate.of(1970, 1, 1), FxVanillaOptionMethod.BLACK);

    // Assert
    verify(blackPricer).currentCash(isNull(), isA(LocalDate.class));
    assertNull(actualCurrentCashResult);
  }
}
