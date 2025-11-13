package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.swap.DiscountingSwapLegPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrOvernightInArrearsCapFloorProductPricerDiffblueTest {
  /**
   * Test {@link
   * SabrOvernightInArrearsCapFloorProductPricer#SabrOvernightInArrearsCapFloorProductPricer(SabrOvernightInArrearsCapFloorLegPricer,
   * DiscountingSwapLegPricer)}.
   *
   * <p>Method under test: {@link
   * SabrOvernightInArrearsCapFloorProductPricer#SabrOvernightInArrearsCapFloorProductPricer(SabrOvernightInArrearsCapFloorLegPricer,
   * DiscountingSwapLegPricer)}
   */
  @Test
  @DisplayName(
      "Test new SabrOvernightInArrearsCapFloorProductPricer(SabrOvernightInArrearsCapFloorLegPricer, DiscountingSwapLegPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SabrOvernightInArrearsCapFloorProductPricer.<init>(SabrOvernightInArrearsCapFloorLegPricer, DiscountingSwapLegPricer)"
  })
  void testNewSabrOvernightInArrearsCapFloorProductPricer() {
    // Arrange and Act
    SabrOvernightInArrearsCapFloorProductPricer actualSabrOvernightInArrearsCapFloorProductPricer =
        new SabrOvernightInArrearsCapFloorProductPricer(
            SabrOvernightInArrearsCapFloorLegPricer.DEFAULT, DiscountingSwapLegPricer.DEFAULT);

    // Assert
    assertSame(
        SabrOvernightInArrearsCapFloorLegPricer.DEFAULT,
        actualSabrOvernightInArrearsCapFloorProductPricer.getCapFloorLegPricer());
    assertSame(
        DiscountingSwapLegPricer.DEFAULT,
        actualSabrOvernightInArrearsCapFloorProductPricer.getPayLegPricer());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SabrOvernightInArrearsCapFloorProductPricer#getCapFloorLegPricer()}
   *   <li>{@link SabrOvernightInArrearsCapFloorProductPricer#getPayLegPricer()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrOvernightInArrearsCapFloorLegPricer SabrOvernightInArrearsCapFloorProductPricer.getCapFloorLegPricer()",
    "DiscountingSwapLegPricer SabrOvernightInArrearsCapFloorProductPricer.getPayLegPricer()"
  })
  void testGettersAndSetters() {
    // Arrange
    SabrOvernightInArrearsCapFloorProductPricer sabrOvernightInArrearsCapFloorProductPricer =
        new SabrOvernightInArrearsCapFloorProductPricer(
            SabrOvernightInArrearsCapFloorLegPricer.DEFAULT, DiscountingSwapLegPricer.DEFAULT);

    // Act
    SabrOvernightInArrearsCapFloorLegPricer actualCapFloorLegPricer =
        sabrOvernightInArrearsCapFloorProductPricer.getCapFloorLegPricer();

    // Assert
    assertSame(SabrOvernightInArrearsCapFloorLegPricer.DEFAULT, actualCapFloorLegPricer);
    assertSame(
        DiscountingSwapLegPricer.DEFAULT,
        sabrOvernightInArrearsCapFloorProductPricer.getPayLegPricer());
  }
}
