package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricerDiffblueTest {
  /**
   * Test {@link
   * VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer#VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer(SabrOvernightInArrearsCapletFloorletPeriodPricer,
   * double)}.
   *
   * <p>Method under test: {@link
   * VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer#VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer(SabrOvernightInArrearsCapletFloorletPeriodPricer,
   * double)}
   */
  @Test
  @DisplayName(
      "Test new VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer(SabrOvernightInArrearsCapletFloorletPeriodPricer, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer.<init>(SabrOvernightInArrearsCapletFloorletPeriodPricer, double)"
  })
  void testNewVerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer() {
    // Arrange and Act
    VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer
        actualVerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer =
            new VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer(
                SabrOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT, 10.0d);

    // Assert
    assertEquals(
        10.0d,
        actualVerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer.getSpread());
    assertSame(
        SabrOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT,
        actualVerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer
            .getVanillaOptionProductPricer());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer#getSpread()}
   *   <li>{@link
   *       VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer#getVanillaOptionProductPricer()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer.getSpread()",
    "SabrOvernightInArrearsCapletFloorletPeriodPricer VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer.getVanillaOptionProductPricer()"
  })
  void testGettersAndSetters() {
    // Arrange
    VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer
        verticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer =
            new VerticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer(
                SabrOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT, 10.0d);

    // Act
    double actualSpread =
        verticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer.getSpread();

    // Assert
    assertEquals(10.0d, actualSpread);
    assertSame(
        SabrOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT,
        verticalSpreadSabrOvernightInArrearsCapletFloorletBinaryPeriodPricer
            .getVanillaOptionProductPricer());
  }
}
