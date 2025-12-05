package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.ImmutableReferenceData;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.basics.ReferenceDataId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborCapletFloorletVolatilityCalibratorDiffblueTest {
  /**
   * Test {@link IborCapletFloorletVolatilityCalibrator#getReferenceData()}.
   *
   * <p>Method under test: {@link IborCapletFloorletVolatilityCalibrator#getReferenceData()}
   */
  @Test
  @DisplayName("Test getReferenceData()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ReferenceData IborCapletFloorletVolatilityCalibrator.getReferenceData()"})
  void testGetReferenceData() {
    // Arrange and Act
    ReferenceData actualReferenceData =
        DirectIborCapletFloorletFlatVolatilityCalibrator.standard().getReferenceData();
    Object actualQueryValueOrNullResult =
        actualReferenceData.queryValueOrNull(mock(ReferenceDataId.class));

    // Assert
    assertTrue(actualReferenceData instanceof ImmutableReferenceData);
    assertNull(actualQueryValueOrNullResult);
    assertEquals(30, ((ImmutableReferenceData) actualReferenceData).getValues().size());
  }

  /**
   * Test {@link IborCapletFloorletVolatilityCalibrator#getLegPricer()}.
   *
   * <p>Method under test: {@link IborCapletFloorletVolatilityCalibrator#getLegPricer()}
   */
  @Test
  @DisplayName("Test getLegPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "VolatilityIborCapFloorLegPricer IborCapletFloorletVolatilityCalibrator.getLegPricer()"
  })
  void testGetLegPricer() {
    // Arrange, Act and Assert
    assertSame(
        VolatilityIborCapFloorLegPricer.DEFAULT,
        DirectIborCapletFloorletFlatVolatilityCalibrator.standard().getLegPricer());
  }
}
