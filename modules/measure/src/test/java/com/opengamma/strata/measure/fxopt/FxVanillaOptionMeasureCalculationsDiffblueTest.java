package com.opengamma.strata.measure.fxopt;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.currency.CurrencyAmount;
import com.opengamma.strata.pricer.DiscountingPaymentPricer;
import com.opengamma.strata.pricer.fx.DiscountingFxSingleProductPricer;
import com.opengamma.strata.pricer.fxopt.BlackFxVanillaOptionTradePricer;
import com.opengamma.strata.pricer.fxopt.VannaVolgaFxVanillaOptionProductPricer;
import com.opengamma.strata.pricer.fxopt.VannaVolgaFxVanillaOptionTradePricer;
import com.opengamma.strata.product.fxopt.ResolvedFxVanillaOptionTrade;
import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FxVanillaOptionMeasureCalculationsDiffblueTest {
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
