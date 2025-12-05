package com.opengamma.strata.pricer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CompoundedRateTypeDiffblueTest {
  /**
   * Test {@link CompoundedRateType#of(String)}.
   *
   * <ul>
   *   <li>When {@code CONTINUOUS}.
   *   <li>Then return {@code CONTINUOUS}.
   * </ul>
   *
   * <p>Method under test: {@link CompoundedRateType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'CONTINUOUS'; then return 'CONTINUOUS'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CompoundedRateType CompoundedRateType.of(String)"})
  void testOf_whenContinuous_thenReturnContinuous() {
    // Arrange, Act and Assert
    assertEquals(CompoundedRateType.CONTINUOUS, CompoundedRateType.of("CONTINUOUS"));
  }

  /**
   * Test {@link CompoundedRateType#toString()}.
   *
   * <p>Method under test: {@link CompoundedRateType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CompoundedRateType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Periodic", CompoundedRateType.valueOf("PERIODIC").toString());
  }
}
