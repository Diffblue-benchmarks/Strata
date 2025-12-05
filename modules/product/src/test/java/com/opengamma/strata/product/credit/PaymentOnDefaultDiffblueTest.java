package com.opengamma.strata.product.credit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PaymentOnDefaultDiffblueTest {
  /**
   * Test {@link PaymentOnDefault#of(String)}.
   *
   * <ul>
   *   <li>When {@code ACCRUED_PREMIUM}.
   *   <li>Then return {@code ACCRUED_PREMIUM}.
   * </ul>
   *
   * <p>Method under test: {@link PaymentOnDefault#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'ACCRUED_PREMIUM'; then return 'ACCRUED_PREMIUM'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PaymentOnDefault PaymentOnDefault.of(String)"})
  void testOf_whenAccruedPremium_thenReturnAccruedPremium() {
    // Arrange, Act and Assert
    assertEquals(PaymentOnDefault.ACCRUED_PREMIUM, PaymentOnDefault.of("ACCRUED_PREMIUM"));
  }

  /**
   * Test {@link PaymentOnDefault#isAccruedInterest()}.
   *
   * <ul>
   *   <li>Given {@code ACCRUED_PREMIUM}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PaymentOnDefault#isAccruedInterest()}
   */
  @Test
  @DisplayName("Test isAccruedInterest(); given 'ACCRUED_PREMIUM'; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PaymentOnDefault.isAccruedInterest()"})
  void testIsAccruedInterest_givenAccruedPremium_thenReturnTrue() {
    // Arrange, Act and Assert
    assertTrue(PaymentOnDefault.ACCRUED_PREMIUM.isAccruedInterest());
  }

  /**
   * Test {@link PaymentOnDefault#isAccruedInterest()}.
   *
   * <ul>
   *   <li>Given {@code NONE}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PaymentOnDefault#isAccruedInterest()}
   */
  @Test
  @DisplayName("Test isAccruedInterest(); given 'NONE'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean PaymentOnDefault.isAccruedInterest()"})
  void testIsAccruedInterest_givenNone_thenReturnFalse() {
    // Arrange, Act and Assert
    assertFalse(PaymentOnDefault.NONE.isAccruedInterest());
  }

  /**
   * Test {@link PaymentOnDefault#toString()}.
   *
   * <p>Method under test: {@link PaymentOnDefault#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PaymentOnDefault.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("AccruedPremium", PaymentOnDefault.valueOf("ACCRUED_PREMIUM").toString());
  }
}
