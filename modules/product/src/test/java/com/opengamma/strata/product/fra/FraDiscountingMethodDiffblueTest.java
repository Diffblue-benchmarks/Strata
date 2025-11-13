package com.opengamma.strata.product.fra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FraDiscountingMethodDiffblueTest {
  /**
   * Test {@link FraDiscountingMethod#of(String)}.
   *
   * <ul>
   *   <li>When {@code AFMA}.
   *   <li>Then return {@code AFMA}.
   * </ul>
   *
   * <p>Method under test: {@link FraDiscountingMethod#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'AFMA'; then return 'AFMA'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FraDiscountingMethod FraDiscountingMethod.of(String)"})
  void testOf_whenAfma_thenReturnAfma() {
    // Arrange, Act and Assert
    assertEquals(FraDiscountingMethod.AFMA, FraDiscountingMethod.of("AFMA"));
  }

  /**
   * Test {@link FraDiscountingMethod#toString()}.
   *
   * <p>Method under test: {@link FraDiscountingMethod#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String FraDiscountingMethod.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("None", FraDiscountingMethod.valueOf("NONE").toString());
  }
}
