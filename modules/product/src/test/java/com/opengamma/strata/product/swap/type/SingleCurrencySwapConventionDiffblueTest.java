package com.opengamma.strata.product.swap.type;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SingleCurrencySwapConventionDiffblueTest {
  /**
   * Test {@link SingleCurrencySwapConvention#of(String)}.
   *
   * <ul>
   *   <li>When {@code Unique Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link SingleCurrencySwapConvention#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Unique Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SingleCurrencySwapConvention SingleCurrencySwapConvention.of(String)"})
  void testOf_whenUniqueName_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> SingleCurrencySwapConvention.of("Unique Name"));
  }
}
