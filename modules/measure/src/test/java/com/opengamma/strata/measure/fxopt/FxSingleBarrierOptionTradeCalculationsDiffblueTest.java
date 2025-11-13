package com.opengamma.strata.measure.fxopt;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.pricer.DiscountingPaymentPricer;
import com.opengamma.strata.pricer.fxopt.BlackFxSingleBarrierOptionTradePricer;
import com.opengamma.strata.pricer.fxopt.FxOptionVolatilities;
import com.opengamma.strata.pricer.fxopt.ImpliedTrinomialTreeFxSingleBarrierOptionProductPricer;
import com.opengamma.strata.pricer.fxopt.ImpliedTrinomialTreeFxSingleBarrierOptionTradePricer;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.pricer.rate.SimpleRatesProvider;
import com.opengamma.strata.product.fxopt.ResolvedFxSingleBarrierOptionTrade;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FxSingleBarrierOptionTradeCalculationsDiffblueTest {
  /**
   * Test {@link
   * FxSingleBarrierOptionTradeCalculations#currentCash(ResolvedFxSingleBarrierOptionTrade,
   * RatesProvider, FxOptionVolatilities, FxSingleBarrierOptionMethod)} with {@code trade}, {@code
   * ratesProvider}, {@code volatilities}, {@code method}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * FxSingleBarrierOptionTradeCalculations#currentCash(ResolvedFxSingleBarrierOptionTrade,
   * RatesProvider, FxOptionVolatilities, FxSingleBarrierOptionMethod)}
   */
  @Test
  @DisplayName(
      "Test currentCash(ResolvedFxSingleBarrierOptionTrade, RatesProvider, FxOptionVolatilities, FxSingleBarrierOptionMethod) with 'trade', 'ratesProvider', 'volatilities', 'method'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyAmount FxSingleBarrierOptionTradeCalculations.currentCash(ResolvedFxSingleBarrierOptionTrade, RatesProvider, FxOptionVolatilities, FxSingleBarrierOptionMethod)"
  })
  void testCurrentCashWithTradeRatesProviderVolatilitiesMethod_thenReturnNull() {
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

    FxSingleBarrierOptionTradeCalculations fxSingleBarrierOptionTradeCalculations =
        new FxSingleBarrierOptionTradeCalculations(blackPricer, trinomialTreePricer);

    // Act
    CurrencyAmount actualCurrentCashResult =
        fxSingleBarrierOptionTradeCalculations.currentCash(
            null, new SimpleRatesProvider(), null, FxSingleBarrierOptionMethod.BLACK);

    // Assert
    verify(blackPricer).currentCash(isNull(), isNull());
    assertNull(actualCurrentCashResult);
  }
}
