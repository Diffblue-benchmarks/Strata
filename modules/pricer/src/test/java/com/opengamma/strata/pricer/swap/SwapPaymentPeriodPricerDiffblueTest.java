package com.opengamma.strata.pricer.swap;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.impl.swap.DispatchingSwapPaymentPeriodPricer;
import com.opengamma.strata.product.swap.SwapPaymentPeriod;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwapPaymentPeriodPricerDiffblueTest {
  /**
   * Test {@link SwapPaymentPeriodPricer#standard()}.
   *
   * <p>Method under test: {@link SwapPaymentPeriodPricer#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwapPaymentPeriodPricer SwapPaymentPeriodPricer.standard()"})
  void testStandard() {
    // Arrange and Act
    SwapPaymentPeriodPricer<SwapPaymentPeriod> actualStandardResult =
        SwapPaymentPeriodPricer.standard();

    // Assert
    assertTrue(actualStandardResult instanceof DispatchingSwapPaymentPeriodPricer);
  }
}
