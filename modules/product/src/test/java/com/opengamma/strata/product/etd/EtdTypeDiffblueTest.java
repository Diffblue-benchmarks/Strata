package com.opengamma.strata.product.etd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EtdTypeDiffblueTest {
  /**
   * Test {@link EtdType#of(String)}.
   *
   * <ul>
   *   <li>When {@code FUTURE}.
   *   <li>Then return {@code FUTURE}.
   * </ul>
   *
   * <p>Method under test: {@link EtdType#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'FUTURE'; then return 'FUTURE'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"EtdType EtdType.of(String)"})
  void testOf_whenFuture_thenReturnFuture() {
    // Arrange, Act and Assert
    assertEquals(EtdType.FUTURE, EtdType.of("FUTURE"));
  }

  /**
   * Test {@link EtdType#toString()}.
   *
   * <p>Method under test: {@link EtdType#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String EtdType.toString()"})
  void testToString() {
    // Arrange, Act and Assert
    assertEquals("Future", EtdType.valueOf("FUTURE").toString());
  }
}
