package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ImmutableReferenceData;
import com.opengamma.strata.basics.ReferenceData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DirectIborCapletFloorletVolatilityCalibratorDiffblueTest {
  /**
   * Test {@link DirectIborCapletFloorletVolatilityCalibrator#standard()}.
   *
   * <p>Method under test: {@link DirectIborCapletFloorletVolatilityCalibrator#standard()}
   */
  @Test
  @DisplayName("Test standard()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DirectIborCapletFloorletVolatilityCalibrator DirectIborCapletFloorletVolatilityCalibrator.standard()"
  })
  void testStandard() {
    // Arrange, Act and Assert
    ReferenceData referenceData =
        DirectIborCapletFloorletVolatilityCalibrator.standard().getReferenceData();
    assertTrue(referenceData instanceof ImmutableReferenceData);
    assertEquals(30, ((ImmutableReferenceData) referenceData).getValues().size());
  }

  /**
   * Test {@link DirectIborCapletFloorletVolatilityCalibrator#of(VolatilityIborCapFloorLegPricer,
   * double, ReferenceData)}.
   *
   * <ul>
   *   <li>When {@code 0.015625}.
   *   <li>Then LegPricer return {@link BlackIborCapFloorLegPricer}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DirectIborCapletFloorletVolatilityCalibrator#of(VolatilityIborCapFloorLegPricer, double,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test of(VolatilityIborCapFloorLegPricer, double, ReferenceData); when '0.015625'; then LegPricer return BlackIborCapFloorLegPricer")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DirectIborCapletFloorletVolatilityCalibrator DirectIborCapletFloorletVolatilityCalibrator.of(VolatilityIborCapFloorLegPricer, double, ReferenceData)"
  })
  void testOf_when0015625_thenLegPricerReturnBlackIborCapFloorLegPricer() {
    // Arrange
    ReferenceData referenceData = mock(ReferenceData.class);

    // Act
    DirectIborCapletFloorletVolatilityCalibrator actualOfResult =
        DirectIborCapletFloorletVolatilityCalibrator.of(
            BlackIborCapFloorLegPricer.DEFAULT, 0.015625d, referenceData);

    // Assert
    VolatilityIborCapFloorLegPricer legPricer = actualOfResult.getLegPricer();
    assertTrue(legPricer instanceof BlackIborCapFloorLegPricer);
    assertTrue(legPricer.getPeriodPricer() instanceof BlackIborCapletFloorletPeriodPricer);
    assertSame(BlackIborCapFloorLegPricer.DEFAULT, legPricer);
    assertSame(referenceData, actualOfResult.getReferenceData());
  }
}
