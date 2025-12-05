package com.opengamma.strata.basics;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StandardSchemesDiffblueTest {
  /**
   * Test {@link StandardSchemes#splitTicMic(StandardId)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link StandardSchemes#splitTicMic(StandardId)}
   */
  @Test
  @DisplayName("Test splitTicMic(StandardId); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.collect.tuple.Pair StandardSchemes.splitTicMic(StandardId)"
  })
  void testSplitTicMic_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> StandardSchemes.splitTicMic(StandardId.of("Scheme", "42")));
  }
}
