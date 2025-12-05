package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrIborCapFloorLegPricerDiffblueTest {
  /**
   * Test {@link
   * SabrIborCapFloorLegPricer#SabrIborCapFloorLegPricer(SabrIborCapletFloorletPeriodPricer)}.
   *
   * <p>Method under test: {@link
   * SabrIborCapFloorLegPricer#SabrIborCapFloorLegPricer(SabrIborCapletFloorletPeriodPricer)}
   */
  @Test
  @DisplayName("Test new SabrIborCapFloorLegPricer(SabrIborCapletFloorletPeriodPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SabrIborCapFloorLegPricer.<init>(SabrIborCapletFloorletPeriodPricer)"})
  void testNewSabrIborCapFloorLegPricer() {
    // Arrange, Act and Assert
    VolatilityIborCapletFloorletPeriodPricer periodPricer =
        new SabrIborCapFloorLegPricer(SabrIborCapletFloorletPeriodPricer.DEFAULT).getPeriodPricer();
    assertTrue(periodPricer instanceof SabrIborCapletFloorletPeriodPricer);
    assertSame(SabrIborCapletFloorletPeriodPricer.DEFAULT, periodPricer);
  }
}
