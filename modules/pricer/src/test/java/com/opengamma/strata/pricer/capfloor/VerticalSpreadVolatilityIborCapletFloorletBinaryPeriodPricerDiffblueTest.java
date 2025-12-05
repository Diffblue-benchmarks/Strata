package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricerDiffblueTest {
  /**
   * Test {@link
   * VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer#VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer(VolatilityIborCapletFloorletPeriodPricer,
   * double)}.
   *
   * <p>Method under test: {@link
   * VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer#VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer(VolatilityIborCapletFloorletPeriodPricer,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer(VolatilityIborCapletFloorletPeriodPricer, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer.<init>(VolatilityIborCapletFloorletPeriodPricer, double)"
  })
  void testNewVerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer() {
    // Arrange and Act
    VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer
        actualVerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer =
            new VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer(
                BlackIborCapletFloorletPeriodPricer.DEFAULT, 10.0d);

    // Assert
    VolatilityIborCapletFloorletPeriodPricer vanillaOptionProductPricer =
        actualVerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer
            .getVanillaOptionProductPricer();
    assertTrue(vanillaOptionProductPricer instanceof BlackIborCapletFloorletPeriodPricer);
    assertEquals(
        10.0d, actualVerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer.getSpread());
    assertSame(BlackIborCapletFloorletPeriodPricer.DEFAULT, vanillaOptionProductPricer);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer#getSpread()}
   *   <li>{@link
   *       VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer#getVanillaOptionProductPricer()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer.getSpread()",
    "VolatilityIborCapletFloorletPeriodPricer VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer.getVanillaOptionProductPricer()"
  })
  void testGettersAndSetters() {
    // Arrange
    VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer
        verticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer =
            new VerticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer(
                BlackIborCapletFloorletPeriodPricer.DEFAULT, 10.0d);

    // Act
    double actualSpread = verticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer.getSpread();

    // Assert
    assertTrue(
        verticalSpreadVolatilityIborCapletFloorletBinaryPeriodPricer.getVanillaOptionProductPricer()
            instanceof BlackIborCapletFloorletPeriodPricer);
    assertEquals(10.0d, actualSpread);
  }
}
