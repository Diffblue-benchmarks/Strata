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

class SurfaceIborCapletFloorletVolatilityBootstrapperDiffblueTest {
  /**
   * Test {@link SurfaceIborCapletFloorletVolatilityBootstrapper#of(VolatilityIborCapFloorLegPricer,
   * ReferenceData)}.
   *
   * <ul>
   *   <li>When {@link BlackIborCapFloorLegPricer#DEFAULT}.
   *   <li>Then LegPricer return {@link BlackIborCapFloorLegPricer}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SurfaceIborCapletFloorletVolatilityBootstrapper#of(VolatilityIborCapFloorLegPricer,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(VolatilityIborCapFloorLegPricer, ReferenceData); when DEFAULT; then LegPricer return BlackIborCapFloorLegPricer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceIborCapletFloorletVolatilityBootstrapper SurfaceIborCapletFloorletVolatilityBootstrapper.of(VolatilityIborCapFloorLegPricer, ReferenceData)"
  })
  void testOf_whenDefault_thenLegPricerReturnBlackIborCapFloorLegPricer() {
    // Arrange
    ReferenceData referenceData = mock(ReferenceData.class);

    // Act
    SurfaceIborCapletFloorletVolatilityBootstrapper actualOfResult =
        SurfaceIborCapletFloorletVolatilityBootstrapper.of(
            BlackIborCapFloorLegPricer.DEFAULT, referenceData);

    // Assert
    VolatilityIborCapFloorLegPricer legPricer = actualOfResult.getLegPricer();
    assertTrue(legPricer instanceof BlackIborCapFloorLegPricer);
    assertTrue(legPricer.getPeriodPricer() instanceof BlackIborCapletFloorletPeriodPricer);
    assertSame(BlackIborCapFloorLegPricer.DEFAULT, legPricer);
    assertSame(referenceData, actualOfResult.getReferenceData());
  }
}
