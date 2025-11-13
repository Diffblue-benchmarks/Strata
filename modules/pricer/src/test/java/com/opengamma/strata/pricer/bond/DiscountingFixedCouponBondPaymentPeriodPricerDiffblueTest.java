package com.opengamma.strata.pricer.bond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.market.sensitivity.MutablePointSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivity;
import com.opengamma.strata.product.bond.FixedCouponBondPaymentPeriod;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingFixedCouponBondPaymentPeriodPricerDiffblueTest {
  /**
   * Test {@link
   * DiscountingFixedCouponBondPaymentPeriodPricer#forecastValueSensitivity(FixedCouponBondPaymentPeriod,
   * IssuerCurveDiscountFactors)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then return build toMutable size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DiscountingFixedCouponBondPaymentPeriodPricer#forecastValueSensitivity(FixedCouponBondPaymentPeriod,
   * IssuerCurveDiscountFactors)}
   */
  @Test
  @DisplayName(
      "Test forecastValueSensitivity(FixedCouponBondPaymentPeriod, IssuerCurveDiscountFactors); when 'null'; then return build toMutable size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PointSensitivityBuilder DiscountingFixedCouponBondPaymentPeriodPricer.forecastValueSensitivity(FixedCouponBondPaymentPeriod, IssuerCurveDiscountFactors)"
  })
  void testForecastValueSensitivity_whenNull_thenReturnBuildToMutableSizeIsZero() {
    // Arrange, Act and Assert
    PointSensitivities pointSensitivities =
        DiscountingFixedCouponBondPaymentPeriodPricer.DEFAULT
            .forecastValueSensitivity(null, null)
            .build();
    MutablePointSensitivities toMutableResult = pointSensitivities.toMutable();
    assertEquals(0, toMutableResult.size());
    assertEquals(0, pointSensitivities.size());
    ImmutableList<PointSensitivity> sensitivities = pointSensitivities.getSensitivities();
    assertTrue(sensitivities.isEmpty());
    assertSame(sensitivities, toMutableResult.getSensitivities());
  }
}
