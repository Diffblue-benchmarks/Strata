package com.opengamma.strata.math.impl.minimization;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PositiveOrZeroDiffblueTest {
  /**
   * Test {@link PositiveOrZero#apply(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is {@code -0.5}.
   *   <li>Then return {@code false}.
   * </ul>
   *
   * <p>Method under test: {@link PositiveOrZero#apply(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test apply(DoubleArray) with 'DoubleArray'; when DoubleArray with value is '-0.5'; then return 'false'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Boolean PositiveOrZero.apply(DoubleArray)"})
  void testApplyWithDoubleArray_whenDoubleArrayWithValueIs05_thenReturnFalse() {
    // Arrange
    PositiveOrZero positiveOrZero = new PositiveOrZero();

    // Act and Assert
    assertFalse(positiveOrZero.apply(DoubleArray.of(-0.5d)));
  }

  /**
   * Test {@link PositiveOrZero#apply(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PositiveOrZero#apply(DoubleArray)}
   */
  @Test
  @DisplayName("Test apply(DoubleArray) with 'DoubleArray'; when DoubleArray; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Boolean PositiveOrZero.apply(DoubleArray)"})
  void testApplyWithDoubleArray_whenDoubleArray_thenReturnTrue() {
    // Arrange
    PositiveOrZero positiveOrZero = new PositiveOrZero();

    // Act and Assert
    assertTrue(positiveOrZero.apply(DoubleArray.of()));
  }

  /**
   * Test {@link PositiveOrZero#apply(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return {@code true}.
   * </ul>
   *
   * <p>Method under test: {@link PositiveOrZero#apply(DoubleArray)}
   */
  @Test
  @DisplayName("Test apply(DoubleArray) with 'DoubleArray'; when filled three; then return 'true'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Boolean PositiveOrZero.apply(DoubleArray)"})
  void testApplyWithDoubleArray_whenFilledThree_thenReturnTrue() {
    // Arrange
    PositiveOrZero positiveOrZero = new PositiveOrZero();

    // Act and Assert
    assertTrue(positiveOrZero.apply(DoubleArray.filled(3)));
  }
}
