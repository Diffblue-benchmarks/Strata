package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ReferenceData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrIborCapletFloorletVolatilityBootstrapperDiffblueTest {
  /**
   * Test {@link SabrIborCapletFloorletVolatilityBootstrapper#of(VolatilityIborCapFloorLegPricer,
   * SabrIborCapletFloorletPeriodPricer, double, ReferenceData)}.
   *
   * <ul>
   *   <li>When {@link BlackIborCapFloorLegPricer#DEFAULT}.
   *   <li>Then LegPricer return {@link BlackIborCapFloorLegPricer}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrIborCapletFloorletVolatilityBootstrapper#of(VolatilityIborCapFloorLegPricer,
   * SabrIborCapletFloorletPeriodPricer, double, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(VolatilityIborCapFloorLegPricer, SabrIborCapletFloorletPeriodPricer, double, ReferenceData); when DEFAULT; then LegPricer return BlackIborCapFloorLegPricer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrIborCapletFloorletVolatilityBootstrapper SabrIborCapletFloorletVolatilityBootstrapper.of(VolatilityIborCapFloorLegPricer, SabrIborCapletFloorletPeriodPricer, double, ReferenceData)"
  })
  void testOf_whenDefault_thenLegPricerReturnBlackIborCapFloorLegPricer() {
    // Arrange
    ReferenceData referenceData = mock(ReferenceData.class);

    // Act
    SabrIborCapletFloorletVolatilityBootstrapper actualOfResult =
        SabrIborCapletFloorletVolatilityBootstrapper.of(
            BlackIborCapFloorLegPricer.DEFAULT,
            SabrIborCapletFloorletPeriodPricer.DEFAULT,
            0.015625d,
            referenceData);

    // Assert
    VolatilityIborCapFloorLegPricer legPricer = actualOfResult.getLegPricer();
    assertTrue(legPricer instanceof BlackIborCapFloorLegPricer);
    assertTrue(legPricer.getPeriodPricer() instanceof BlackIborCapletFloorletPeriodPricer);
    assertSame(BlackIborCapFloorLegPricer.DEFAULT, legPricer);
    assertSame(referenceData, actualOfResult.getReferenceData());
  }
}
