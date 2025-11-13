package com.opengamma.strata.pricer.cms;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.impl.swap.DispatchingSwapPaymentEventPricer;
import com.opengamma.strata.pricer.impl.swap.DispatchingSwapPaymentPeriodPricer;
import com.opengamma.strata.pricer.swap.DiscountingSwapLegPricer;
import com.opengamma.strata.pricer.swap.DiscountingSwapProductPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrExtrapolationReplicationCmsPeriodPricerDiffblueTest {
  /**
   * Test {@link SabrExtrapolationReplicationCmsPeriodPricer#of(double, double)} with {@code
   * cutOffStrike}, {@code mu}.
   *
   * <p>Method under test: {@link SabrExtrapolationReplicationCmsPeriodPricer#of(double, double)}
   */
  @Test
  @DisplayName("Test of(double, double) with 'cutOffStrike', 'mu'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationReplicationCmsPeriodPricer SabrExtrapolationReplicationCmsPeriodPricer.of(double, double)"
  })
  void testOfWithCutOffStrikeMu() {
    // Arrange and Act
    SabrExtrapolationReplicationCmsPeriodPricer actualOfResult =
        SabrExtrapolationReplicationCmsPeriodPricer.of(10.0d, 10.0d);

    // Assert
    DiscountingSwapLegPricer legPricer = actualOfResult.getSwapPricer().getLegPricer();
    assertTrue(legPricer.getEventPricer() instanceof DispatchingSwapPaymentEventPricer);
    assertTrue(legPricer.getPeriodPricer() instanceof DispatchingSwapPaymentPeriodPricer);
    assertEquals(10.0d, actualOfResult.getCutOffStrike());
    assertEquals(10.0d, actualOfResult.getMu());
  }

  /**
   * Test {@link SabrExtrapolationReplicationCmsPeriodPricer#of(DiscountingSwapProductPricer,
   * double, double)} with {@code swapPricer}, {@code cutOffStrike}, {@code mu}.
   *
   * <ul>
   *   <li>When {@link DiscountingSwapProductPricer#DEFAULT}.
   *   <li>Then return CutOffStrike is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrExtrapolationReplicationCmsPeriodPricer#of(DiscountingSwapProductPricer, double, double)}
   */
  @Test
  @DisplayName(
      "Test of(DiscountingSwapProductPricer, double, double) with 'swapPricer', 'cutOffStrike', 'mu'; when DEFAULT; then return CutOffStrike is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationReplicationCmsPeriodPricer SabrExtrapolationReplicationCmsPeriodPricer.of(DiscountingSwapProductPricer, double, double)"
  })
  void testOfWithSwapPricerCutOffStrikeMu_whenDefault_thenReturnCutOffStrikeIsTen() {
    // Arrange and Act
    SabrExtrapolationReplicationCmsPeriodPricer actualOfResult =
        SabrExtrapolationReplicationCmsPeriodPricer.of(
            DiscountingSwapProductPricer.DEFAULT, 10.0d, 10.0d);

    // Assert
    assertEquals(10.0d, actualOfResult.getCutOffStrike());
    assertEquals(10.0d, actualOfResult.getMu());
    assertSame(DiscountingSwapProductPricer.DEFAULT, actualOfResult.getSwapPricer());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SabrExtrapolationReplicationCmsPeriodPricer#getCutOffStrike()}
   *   <li>{@link SabrExtrapolationReplicationCmsPeriodPricer#getMu()}
   *   <li>{@link SabrExtrapolationReplicationCmsPeriodPricer#getSwapPricer()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationReplicationCmsPeriodPricer.getCutOffStrike()",
    "double SabrExtrapolationReplicationCmsPeriodPricer.getMu()",
    "DiscountingSwapProductPricer SabrExtrapolationReplicationCmsPeriodPricer.getSwapPricer()"
  })
  void testGettersAndSetters() {
    // Arrange
    SabrExtrapolationReplicationCmsPeriodPricer ofResult =
        SabrExtrapolationReplicationCmsPeriodPricer.of(
            DiscountingSwapProductPricer.DEFAULT, 10.0d, 10.0d);

    // Act
    double actualCutOffStrike = ofResult.getCutOffStrike();
    double actualMu = ofResult.getMu();

    // Assert
    assertEquals(10.0d, actualCutOffStrike);
    assertEquals(10.0d, actualMu);
    assertSame(DiscountingSwapProductPricer.DEFAULT, ofResult.getSwapPricer());
  }
}
