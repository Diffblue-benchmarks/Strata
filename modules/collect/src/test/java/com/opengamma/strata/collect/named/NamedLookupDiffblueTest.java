package com.opengamma.strata.collect.named;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NamedLookupDiffblueTest {
  /**
   * Test {@link NamedLookup#lookup(String)}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link NamedLookup#lookup(String)}
   */
  @Test
  @DisplayName("Test lookup(String); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"com.opengamma.strata.collect.named.Named NamedLookup.lookup(String)"})
  void testLookup_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(new SampleInvalid2LookupFunction("Bad Construcor").lookup("Name"));
  }
}
