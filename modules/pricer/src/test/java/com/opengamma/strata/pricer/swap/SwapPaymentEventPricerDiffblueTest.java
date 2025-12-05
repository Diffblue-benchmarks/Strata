package com.opengamma.strata.pricer.swap;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.impl.swap.DispatchingSwapPaymentEventPricer;
import com.opengamma.strata.product.swap.SwapPaymentEvent;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SwapPaymentEventPricerDiffblueTest {
  /**
   * Test {@link SwapPaymentEventPricer#standard()}.
   *
   * <p>Method under test: {@link SwapPaymentEventPricer#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SwapPaymentEventPricer SwapPaymentEventPricer.standard()"})
  void testStandard() {
    // Arrange and Act
    SwapPaymentEventPricer<SwapPaymentEvent> actualStandardResult =
        SwapPaymentEventPricer.standard();

    // Assert
    assertTrue(actualStandardResult instanceof DispatchingSwapPaymentEventPricer);
  }
}
