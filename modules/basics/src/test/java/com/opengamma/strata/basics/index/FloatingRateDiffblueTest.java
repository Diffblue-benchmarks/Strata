package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FloatingRateDiffblueTest {
  /**
   * Test {@link FloatingRate#parse(String)}.
   *
   * <ul>
   *   <li>When {@code Index Str}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRate#parse(String)}
   */
  @Test
  @DisplayName("Test parse(String); when 'Index Str'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRate FloatingRate.parse(String)"})
  void testParse_whenIndexStr_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> FloatingRate.parse("Index Str"));
  }

  /**
   * Test {@link FloatingRate#tryParse(String)}.
   *
   * <p>Method under test: {@link FloatingRate#tryParse(String)}
   */
  @Test
  @DisplayName("Test tryParse(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional FloatingRate.tryParse(String)"})
  void testTryParse() {
    // Arrange and Act
    Optional<FloatingRate> actualTryParseResult = FloatingRate.tryParse("Index Str");

    // Assert
    assertFalse(actualTryParseResult.isPresent());
  }
}
