package com.opengamma.strata.product.deposit.type;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class IborFixingDepositConventionLookupDiffblueTest {
  /**
   * Test {@link IborFixingDepositConventionLookup#lookup(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link IborFixingDepositConventionLookup#lookup(String)}
   */
  @Test
  @DisplayName("Test lookup(String); when 'Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.product.deposit.type.IborFixingDepositConvention IborFixingDepositConventionLookup.lookup(String)"
  })
  void testLookup_whenName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(IborFixingDepositConventionLookup.INSTANCE.lookup("Name"));
  }

  /**
   * Test {@link IborFixingDepositConventionLookup#lookupAll()}.
   *
   * <p>Method under test: {@link IborFixingDepositConventionLookup#lookupAll()}
   */
  @Test
  @DisplayName("Test lookupAll()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.Map IborFixingDepositConventionLookup.lookupAll()"})
  void testLookupAll() {
    // Arrange, Act and Assert
    assertTrue(IborFixingDepositConventionLookup.INSTANCE.lookupAll().isEmpty());
  }
}
