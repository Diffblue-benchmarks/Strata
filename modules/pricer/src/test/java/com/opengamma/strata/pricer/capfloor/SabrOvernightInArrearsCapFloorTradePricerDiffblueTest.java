package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.pricer.DiscountingPaymentPricer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrOvernightInArrearsCapFloorTradePricerDiffblueTest {
  /**
   * Test {@link
   * SabrOvernightInArrearsCapFloorTradePricer#SabrOvernightInArrearsCapFloorTradePricer(SabrOvernightInArrearsCapFloorProductPricer,
   * DiscountingPaymentPricer)}.
   *
   * <p>Method under test: {@link
   * SabrOvernightInArrearsCapFloorTradePricer#SabrOvernightInArrearsCapFloorTradePricer(SabrOvernightInArrearsCapFloorProductPricer,
   * DiscountingPaymentPricer)}
   */
  @Test
  @DisplayName(
      "Test new SabrOvernightInArrearsCapFloorTradePricer(SabrOvernightInArrearsCapFloorProductPricer, DiscountingPaymentPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SabrOvernightInArrearsCapFloorTradePricer.<init>(SabrOvernightInArrearsCapFloorProductPricer, DiscountingPaymentPricer)"
  })
  void testNewSabrOvernightInArrearsCapFloorTradePricer() {
    // Arrange and Act
    SabrOvernightInArrearsCapFloorTradePricer actualSabrOvernightInArrearsCapFloorTradePricer =
        new SabrOvernightInArrearsCapFloorTradePricer(
            SabrOvernightInArrearsCapFloorProductPricer.DEFAULT, DiscountingPaymentPricer.DEFAULT);

    // Assert
    assertSame(
        DiscountingPaymentPricer.DEFAULT,
        actualSabrOvernightInArrearsCapFloorTradePricer.getPaymentPricer());
    assertSame(
        SabrOvernightInArrearsCapFloorProductPricer.DEFAULT,
        actualSabrOvernightInArrearsCapFloorTradePricer.getProductPricer());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SabrOvernightInArrearsCapFloorTradePricer#getPaymentPricer()}
   *   <li>{@link SabrOvernightInArrearsCapFloorTradePricer#getProductPricer()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DiscountingPaymentPricer SabrOvernightInArrearsCapFloorTradePricer.getPaymentPricer()",
    "SabrOvernightInArrearsCapFloorProductPricer SabrOvernightInArrearsCapFloorTradePricer.getProductPricer()"
  })
  void testGettersAndSetters() {
    // Arrange
    SabrOvernightInArrearsCapFloorTradePricer sabrOvernightInArrearsCapFloorTradePricer =
        new SabrOvernightInArrearsCapFloorTradePricer(
            SabrOvernightInArrearsCapFloorProductPricer.DEFAULT, DiscountingPaymentPricer.DEFAULT);

    // Act
    DiscountingPaymentPricer actualPaymentPricer =
        sabrOvernightInArrearsCapFloorTradePricer.getPaymentPricer();

    // Assert
    assertSame(DiscountingPaymentPricer.DEFAULT, actualPaymentPricer);
    assertSame(
        SabrOvernightInArrearsCapFloorProductPricer.DEFAULT,
        sabrOvernightInArrearsCapFloorTradePricer.getProductPricer());
  }
}
