package com.opengamma.strata.math.impl.cern;

import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PersistentObjectDiffblueTest {
  /**
   * Test {@link PersistentObject#clone()}.
   *
   * <p>Method under test: {@link PersistentObject#clone()}
   */
  @Test
  @DisplayName("Test clone()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Object PersistentObject.clone()"})
  void testClone() {
    // Arrange, Act and Assert
    assertTrue(new MersenneTwister().clone() instanceof MersenneTwister);
  }
}
