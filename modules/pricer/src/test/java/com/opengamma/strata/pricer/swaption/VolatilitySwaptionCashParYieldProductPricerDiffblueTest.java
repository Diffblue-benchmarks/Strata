package com.opengamma.strata.pricer.swaption;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer;
import com.opengamma.strata.product.swap.ResolvedSwapLeg;
import com.opengamma.strata.product.swaption.ResolvedSwaption;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class VolatilitySwaptionCashParYieldProductPricerDiffblueTest {
  /**
   * Test {@link
   * VolatilitySwaptionCashParYieldProductPricer#VolatilitySwaptionCashParYieldProductPricer(DiscountingSwapProductPricer)}.
   *
   * <ul>
   *   <li>Then return SwapPricer is {@link DiscountingSwapProductPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * VolatilitySwaptionCashParYieldProductPricer#VolatilitySwaptionCashParYieldProductPricer(DiscountingSwapProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new VolatilitySwaptionCashParYieldProductPricer(DiscountingSwapProductPricer); then return SwapPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void VolatilitySwaptionCashParYieldProductPricer.<init>(DiscountingSwapProductPricer)"
  })
  void testNewVolatilitySwaptionCashParYieldProductPricer_thenReturnSwapPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapProductPricer.DEFAULT,
        new VolatilitySwaptionCashParYieldProductPricer(DiscountingSwapProductPricer.DEFAULT)
            .getSwapPricer());
  }

  /**
   * Test {@link VolatilitySwaptionCashParYieldProductPricer#getSwapPricer()}.
   *
   * <p>Method under test: {@link VolatilitySwaptionCashParYieldProductPricer#getSwapPricer()}
   */
  @Test
  @DisplayName("Test getSwapPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingSwapProductPricer VolatilitySwaptionCashParYieldProductPricer.getSwapPricer()"
  })
  void testGetSwapPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingSwapProductPricer.DEFAULT,
        new VolatilitySwaptionCashParYieldProductPricer(DiscountingSwapProductPricer.DEFAULT)
            .getSwapPricer());
  }

  /**
   * Test {@link VolatilitySwaptionCashParYieldProductPricer#calculateNumeraire(ResolvedSwaption,
   * ResolvedSwapLeg, double, RatesProvider)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * VolatilitySwaptionCashParYieldProductPricer#calculateNumeraire(ResolvedSwaption,
   * ResolvedSwapLeg, double, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test calculateNumeraire(ResolvedSwaption, ResolvedSwapLeg, double, RatesProvider); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double VolatilitySwaptionCashParYieldProductPricer.calculateNumeraire(ResolvedSwaption, ResolvedSwapLeg, double, RatesProvider)"
  })
  void testCalculateNumeraire_thenThrowIllegalArgumentException() {
    // Arrange
    DiscountingSwapProductPricer swapPricer = mock(DiscountingSwapProductPricer.class);
    when(swapPricer.getLegPricer()).thenThrow(new IllegalArgumentException());
    BlackSwaptionCashParYieldProductPricer blackSwaptionCashParYieldProductPricer =
        new BlackSwaptionCashParYieldProductPricer(swapPricer);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            blackSwaptionCashParYieldProductPricer.calculateNumeraire(
                null, null, 10.0d, new MockRatesProvider()));
    verify(swapPricer).getLegPricer();
  }
}
