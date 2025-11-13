package com.opengamma.strata.product.fra.type;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FraConventionLookupDiffblueTest {
  /**
   * Test {@link FraConventionLookup#lookup(String)}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link FraConventionLookup#lookup(String)}
   */
  @Test
  @DisplayName("Test lookup(String); when 'Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.product.fra.type.FraConvention FraConventionLookup.lookup(String)"
  })
  void testLookup_whenName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FraConventionLookup.INSTANCE.lookup("Name"));
  }
}
