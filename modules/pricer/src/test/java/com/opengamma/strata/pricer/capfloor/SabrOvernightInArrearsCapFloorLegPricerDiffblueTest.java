package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrOvernightInArrearsCapFloorLegPricerDiffblueTest {
  /**
   * Test {@link
   * SabrOvernightInArrearsCapFloorLegPricer#SabrOvernightInArrearsCapFloorLegPricer(SabrOvernightInArrearsCapletFloorletPeriodPricer)}.
   *
   * <ul>
   *   <li>Then return PeriodPricer is {@link
   *       SabrOvernightInArrearsCapletFloorletPeriodPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrOvernightInArrearsCapFloorLegPricer#SabrOvernightInArrearsCapFloorLegPricer(SabrOvernightInArrearsCapletFloorletPeriodPricer)}
   */
  @Test
  @DisplayName(
      "Test new SabrOvernightInArrearsCapFloorLegPricer(SabrOvernightInArrearsCapletFloorletPeriodPricer); then return PeriodPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SabrOvernightInArrearsCapFloorLegPricer.<init>(SabrOvernightInArrearsCapletFloorletPeriodPricer)"
  })
  void testNewSabrOvernightInArrearsCapFloorLegPricer_thenReturnPeriodPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        SabrOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT,
        new SabrOvernightInArrearsCapFloorLegPricer(
                SabrOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT)
            .getPeriodPricer());
  }

  /**
   * Test {@link SabrOvernightInArrearsCapFloorLegPricer#getPeriodPricer()}.
   *
   * <p>Method under test: {@link SabrOvernightInArrearsCapFloorLegPricer#getPeriodPricer()}
   */
  @Test
  @DisplayName("Test getPeriodPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrOvernightInArrearsCapletFloorletPeriodPricer SabrOvernightInArrearsCapFloorLegPricer.getPeriodPricer()"
  })
  void testGetPeriodPricer() {
    // Arrange, Act and Assert
    assertSame(
        SabrOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT,
        new SabrOvernightInArrearsCapFloorLegPricer(
                SabrOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT)
            .getPeriodPricer());
  }
}
