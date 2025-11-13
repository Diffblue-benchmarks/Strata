package com.opengamma.strata.product.swap;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborRateResetMethodDiffblueTest {
  /**
   * Test {@link IborRateResetMethod#of(String)}.
   *
   * <ul>
   *   <li>When {@code UNWEIGHTED}.
   *   <li>Then return {@code UNWEIGHTED}.
   * </ul>
   *
   * <p>Method under test: {@link IborRateResetMethod#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'UNWEIGHTED'; then return 'UNWEIGHTED'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"IborRateResetMethod IborRateResetMethod.of(String)"})
  void testOf_whenUnweighted_thenReturnUnweighted() {
    // Arrange, Act and Assert
    assertEquals(IborRateResetMethod.UNWEIGHTED, IborRateResetMethod.of("UNWEIGHTED"));
  }

  /**
   * Test {@link IborRateResetMethod#toString()}.
   *
   * <p>Method under test: {@link IborRateResetMethod#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String IborRateResetMethod.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Unweighted", IborRateResetMethod.valueOf("UNWEIGHTED").toString());
  }
}
