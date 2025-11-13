package com.opengamma.strata.pricer.rate;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.impl.rate.DispatchingRateComputationFn;
import com.opengamma.strata.product.rate.RateComputation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RateComputationFnDiffblueTest {
  /**
   * Test {@link RateComputationFn#standard()}.
   *
   * <p>Method under test: {@link RateComputationFn#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RateComputationFn RateComputationFn.standard()"})
  void testStandard() {
    // Arrange and Act
    RateComputationFn<RateComputation> actualStandardResult = RateComputationFn.standard();

    // Assert
    assertTrue(actualStandardResult instanceof DispatchingRateComputationFn);
  }
}
