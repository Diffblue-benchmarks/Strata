package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BlackIborCapFloorLegPricerDiffblueTest {
  /**
   * Test {@link
   * BlackIborCapFloorLegPricer#BlackIborCapFloorLegPricer(BlackIborCapletFloorletPeriodPricer)}.
   *
   * <p>Method under test: {@link
   * BlackIborCapFloorLegPricer#BlackIborCapFloorLegPricer(BlackIborCapletFloorletPeriodPricer)}
   */
  @Test
  @DisplayName("Test new BlackIborCapFloorLegPricer(BlackIborCapletFloorletPeriodPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void BlackIborCapFloorLegPricer.<init>(BlackIborCapletFloorletPeriodPricer)"})
  void testNewBlackIborCapFloorLegPricer() {
    // Arrange, Act and Assert
    VolatilityIborCapletFloorletPeriodPricer periodPricer =
        new BlackIborCapFloorLegPricer(BlackIborCapletFloorletPeriodPricer.DEFAULT)
            .getPeriodPricer();
    assertTrue(periodPricer instanceof BlackIborCapletFloorletPeriodPricer);
    assertSame(BlackIborCapletFloorletPeriodPricer.DEFAULT, periodPricer);
  }
}
