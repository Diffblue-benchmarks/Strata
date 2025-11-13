package com.opengamma.strata.math.impl.minimization;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GoldenSectionMinimizer1DDiffblueTest {
  /**
   * Test {@link GoldenSectionMinimizer1D#minimize(Function, Double)} with {@code Function}, {@code
   * Double}.
   *
   * <p>Method under test: {@link GoldenSectionMinimizer1D#minimize(Function, Double)}
   */
  @Test
  @DisplayName("Test minimize(Function, Double) with 'Function', 'Double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double GoldenSectionMinimizer1D.minimize(Function, Double)"})
  void testMinimizeWithFunctionDouble() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> new GoldenSectionMinimizer1D().minimize(mock(Function.class), 10.0d));
  }
}
