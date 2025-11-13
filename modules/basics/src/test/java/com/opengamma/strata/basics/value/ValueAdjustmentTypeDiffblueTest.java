package com.opengamma.strata.basics.value;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ValueAdjustmentTypeDiffblueTest {
  /**
   * Test {@link ValueAdjustmentType#of(String)}.
   *
   * <ul>
   *   <li>When {@code DELTA_AMOUNT}.
   *   <li>Then return {@code DELTA_AMOUNT}.
   * </ul>
   *
   * <p>Method under test: {@link ValueAdjustmentType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'DELTA_AMOUNT'; then return 'DELTA_AMOUNT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueAdjustmentType ValueAdjustmentType.of(String)"})
  void testOf_whenDeltaAmount_thenReturnDeltaAmount() {
    // Arrange, Act and Assert
    assertEquals(ValueAdjustmentType.DELTA_AMOUNT, ValueAdjustmentType.of("DELTA_AMOUNT"));
  }
}
