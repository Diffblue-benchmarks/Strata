package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NormalIborCapFloorLegPricerDiffblueTest {
  /**
   * Test {@link
   * NormalIborCapFloorLegPricer#NormalIborCapFloorLegPricer(NormalIborCapletFloorletPeriodPricer)}.
   *
   * <p>Method under test: {@link
   * NormalIborCapFloorLegPricer#NormalIborCapFloorLegPricer(NormalIborCapletFloorletPeriodPricer)}
   */
  @Test
  @DisplayName("Test new NormalIborCapFloorLegPricer(NormalIborCapletFloorletPeriodPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void NormalIborCapFloorLegPricer.<init>(NormalIborCapletFloorletPeriodPricer)"
  })
  void testNewNormalIborCapFloorLegPricer() {
    // Arrange, Act and Assert
    VolatilityIborCapletFloorletPeriodPricer periodPricer =
        new NormalIborCapFloorLegPricer(NormalIborCapletFloorletPeriodPricer.DEFAULT)
            .getPeriodPricer();
    assertTrue(periodPricer instanceof NormalIborCapletFloorletPeriodPricer);
    assertSame(NormalIborCapletFloorletPeriodPricer.DEFAULT, periodPricer);
  }
}
