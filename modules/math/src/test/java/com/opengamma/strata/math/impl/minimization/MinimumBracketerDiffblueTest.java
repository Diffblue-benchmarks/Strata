package com.opengamma.strata.math.impl.minimization;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MinimumBracketerDiffblueTest {
  /**
   * Test {@link MinimumBracketer#checkInputs(Function, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-15}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MinimumBracketer#checkInputs(Function, double, double)}
   */
  @Test
  @DisplayName("Test checkInputs(Function, double, double); when '1.0E-15'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MinimumBracketer.checkInputs(Function, double, double)"})
  void testCheckInputs_when10e15_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> new ParabolicMinimumBracketer().checkInputs(mock(Function.class), 1.0E-15d, 10.0d));
  }

  /**
   * Test {@link MinimumBracketer#checkInputs(Function, double, double)}.
   *
   * <ul>
   *   <li>When {@link Function}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MinimumBracketer#checkInputs(Function, double, double)}
   */
  @Test
  @DisplayName(
      "Test checkInputs(Function, double, double); when Function; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MinimumBracketer.checkInputs(Function, double, double)"})
  void testCheckInputs_whenFunction_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new ParabolicMinimumBracketer().checkInputs(mock(Function.class), 10.0d, 10.0d));
  }

  /**
   * Test {@link MinimumBracketer#checkInputs(Function, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link MinimumBracketer#checkInputs(Function, double, double)}
   */
  @Test
  @DisplayName("Test checkInputs(Function, double, double); when NaN; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MinimumBracketer.checkInputs(Function, double, double)"})
  void testCheckInputs_whenNaN_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> new ParabolicMinimumBracketer().checkInputs(mock(Function.class), Double.NaN, 10.0d));
  }

  /**
   * Test {@link MinimumBracketer#checkInputs(Function, double, double)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link MinimumBracketer#checkInputs(Function, double, double)}
   */
  @Test
  @DisplayName(
      "Test checkInputs(Function, double, double); when NaN; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void MinimumBracketer.checkInputs(Function, double, double)"})
  void testCheckInputs_whenNaN_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new ParabolicMinimumBracketer()
                .checkInputs(mock(Function.class), Double.NaN, Double.NaN));
  }
}
