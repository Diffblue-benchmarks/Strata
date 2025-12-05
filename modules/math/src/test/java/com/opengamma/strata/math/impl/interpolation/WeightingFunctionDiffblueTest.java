package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class WeightingFunctionDiffblueTest {
  /**
   * Test {@link WeightingFunction#of(String)}.
   *
   * <ul>
   *   <li>When {@code Linear}.
   *   <li>Then return {@link LinearWeightingFunction}.
   * </ul>
   *
   * <p>Method under test: {@link WeightingFunction#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Linear'; then return LinearWeightingFunction")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"WeightingFunction WeightingFunction.of(String)"})
  void testOf_whenLinear_thenReturnLinearWeightingFunction() {
    // Arrange and Act
    WeightingFunction actualOfResult = WeightingFunction.of("Linear");

    // Assert
    assertTrue(actualOfResult instanceof LinearWeightingFunction);
    assertEquals("Linear", actualOfResult.getName());
  }

  /**
   * Test {@link WeightingFunction#of(String)}.
   *
   * <ul>
   *   <li>When {@code Sine}.
   *   <li>Then return {@link SineWeightingFunction}.
   * </ul>
   *
   * <p>Method under test: {@link WeightingFunction#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Sine'; then return SineWeightingFunction")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"WeightingFunction WeightingFunction.of(String)"})
  void testOf_whenSine_thenReturnSineWeightingFunction() {
    // Arrange and Act
    WeightingFunction actualOfResult = WeightingFunction.of("Sine");

    // Assert
    assertTrue(actualOfResult instanceof SineWeightingFunction);
    assertEquals("Sine", actualOfResult.getName());
  }

  /**
   * Test {@link WeightingFunction#of(String)}.
   *
   * <ul>
   *   <li>When {@code Unique Name}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link WeightingFunction#of(String)}
   */
  @Test
  @DisplayName("Test of(String); when 'Unique Name'; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"WeightingFunction WeightingFunction.of(String)"})
  void testOf_whenUniqueName_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> WeightingFunction.of("Unique Name"));
  }
}
