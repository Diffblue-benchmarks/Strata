package com.opengamma.strata.basics.index;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.Tenor;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class FloatingRateIndexDiffblueTest {
  /**
   * Test {@link FloatingRateIndex#parse(String, Tenor)} with {@code indexStr}, {@code
   * defaultIborTenor}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateIndex#parse(String, Tenor)}
   */
  @Test
  @DisplayName(
      "Test parse(String, Tenor) with 'indexStr', 'defaultIborTenor'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateIndex FloatingRateIndex.parse(String, Tenor)"})
  void testParseWithIndexStrDefaultIborTenor_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> FloatingRateIndex.parse("Index Str", Tenor.TENOR_10M));
  }

  /**
   * Test {@link FloatingRateIndex#parse(String)} with {@code indexStr}.
   *
   * <ul>
   *   <li>When {@code Index Str}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link FloatingRateIndex#parse(String)}
   */
  @Test
  @DisplayName(
      "Test parse(String) with 'indexStr'; when 'Index Str'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"FloatingRateIndex FloatingRateIndex.parse(String)"})
  void testParseWithIndexStr_whenIndexStr_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> FloatingRateIndex.parse("Index Str"));
  }

  /**
   * Test {@link FloatingRateIndex#tryParse(String)} with {@code indexStr}.
   *
   * <p>Method under test: {@link FloatingRateIndex#tryParse(String)}
   */
  @Test
  @DisplayName("Test tryParse(String) with 'indexStr'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional FloatingRateIndex.tryParse(String)"})
  void testTryParseWithIndexStr() {
    // Arrange and Act
    Optional<FloatingRateIndex> actualTryParseResult = FloatingRateIndex.tryParse("Index Str");

    // Assert
    assertFalse(actualTryParseResult.isPresent());
  }

  /**
   * Test {@link FloatingRateIndex#tryParse(String, Tenor)} with {@code indexStr}, {@code
   * defaultIborTenor}.
   *
   * <p>Method under test: {@link FloatingRateIndex#tryParse(String, Tenor)}
   */
  @Test
  @DisplayName("Test tryParse(String, Tenor) with 'indexStr', 'defaultIborTenor'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Optional FloatingRateIndex.tryParse(String, Tenor)"})
  void testTryParseWithIndexStrDefaultIborTenor() {
    // Arrange and Act
    Optional<FloatingRateIndex> actualTryParseResult =
        FloatingRateIndex.tryParse("Index Str", Tenor.TENOR_10M);

    // Assert
    assertFalse(actualTryParseResult.isPresent());
  }
}
