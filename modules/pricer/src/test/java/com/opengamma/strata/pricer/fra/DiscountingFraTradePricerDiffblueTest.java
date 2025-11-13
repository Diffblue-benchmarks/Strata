package com.opengamma.strata.pricer.fra;

import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingFraTradePricerDiffblueTest {
  /**
   * Test {@link DiscountingFraTradePricer#DiscountingFraTradePricer(DiscountingFraProductPricer)}.
   *
   * <ul>
   *   <li>When {@link DiscountingFraProductPricer#DEFAULT}.
   *   <li>Then return ProductPricer is {@link DiscountingFraProductPricer#DEFAULT}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DiscountingFraTradePricer#DiscountingFraTradePricer(DiscountingFraProductPricer)}
   */
  @Test
  @DisplayName(
      "Test new DiscountingFraTradePricer(DiscountingFraProductPricer); when DEFAULT; then return ProductPricer is DEFAULT")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DiscountingFraTradePricer.<init>(DiscountingFraProductPricer)"})
  void testNewDiscountingFraTradePricer_whenDefault_thenReturnProductPricerIsDefault() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingFraProductPricer.DEFAULT,
        new DiscountingFraTradePricer(DiscountingFraProductPricer.DEFAULT).getProductPricer());
  }

  /**
   * Test {@link DiscountingFraTradePricer#getProductPricer()}.
   *
   * <p>Method under test: {@link DiscountingFraTradePricer#getProductPricer()}
   */
  @Test
  @DisplayName("Test getProductPricer()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DiscountingFraProductPricer DiscountingFraTradePricer.getProductPricer()"})
  void testGetProductPricer() {
    // Arrange, Act and Assert
    assertSame(
        DiscountingFraProductPricer.DEFAULT,
        new DiscountingFraTradePricer(DiscountingFraProductPricer.DEFAULT).getProductPricer());
  }
}
