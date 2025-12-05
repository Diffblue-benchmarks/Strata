package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CompoundingMethodDiffblueTest {
  /**
   * Test {@link CompoundingMethod#of(String)}.
   *
   * <ul>
   *   <li>When {@code FLAT}.
   *   <li>Then return {@code FLAT}.
   * </ul>
   *
   * <p>Method under test: {@link CompoundingMethod#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'FLAT'; then return 'FLAT'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CompoundingMethod CompoundingMethod.of(String)"})
  void testOf_whenFlat_thenReturnFlat() {
    // Arrange, Act and Assert
    assertEquals(CompoundingMethod.FLAT, CompoundingMethod.of("FLAT"));
  }

  /**
   * Test {@link CompoundingMethod#toString()}.
   *
   * <p>Method under test: {@link CompoundingMethod#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String CompoundingMethod.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("None", CompoundingMethod.valueOf("NONE").toString());
  }
}
