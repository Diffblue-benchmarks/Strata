package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PriceIndexCalculationMethodDiffblueTest {
  /**
   * Test {@link PriceIndexCalculationMethod#of(String)}.
   *
   * <ul>
   *   <li>When {@code INTERPOLATED}.
   *   <li>Then return {@code INTERPOLATED}.
   * </ul>
   *
   * <p>Method under test: {@link PriceIndexCalculationMethod#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'INTERPOLATED'; then return 'INTERPOLATED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"PriceIndexCalculationMethod PriceIndexCalculationMethod.of(String)"})
  void testOf_whenInterpolated_thenReturnInterpolated() {
    // Arrange, Act and Assert
    assertEquals(
        PriceIndexCalculationMethod.INTERPOLATED, PriceIndexCalculationMethod.of("INTERPOLATED"));
  }

  /**
   * Test {@link PriceIndexCalculationMethod#toString()}.
   *
   * <p>Method under test: {@link PriceIndexCalculationMethod#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String PriceIndexCalculationMethod.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Monthly", PriceIndexCalculationMethod.valueOf("MONTHLY").toString());
  }
}
