package com.opengamma.strata.math.impl.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.function.BiFunction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class IntegratorRepeated2DDiffblueTest {
  /**
   * Test {@link IntegratorRepeated2D#integrate(BiFunction, Double[], Double[])} with {@code
   * BiFunction}, {@code Double[]}, {@code Double[]}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link IntegratorRepeated2D#integrate(BiFunction, Double[], Double[])}
   */
  @Test
  @DisplayName(
      "Test integrate(BiFunction, Double[], Double[]) with 'BiFunction', 'Double[]', 'Double[]'; given ten; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double IntegratorRepeated2D.integrate(BiFunction, Double[], Double[])"})
  void testIntegrateWithBiFunctionDoubleDouble_givenTen_thenReturnDoubleValueIsZero() {
    // Arrange
    IntegratorRepeated2D integratorRepeated2D =
        new IntegratorRepeated2D(new RungeKuttaIntegrator1D());

    BiFunction<Double, Double, Double> f = mock(BiFunction.class);
    when(f.apply(Mockito.<Double>any(), Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    Double actualIntegrateResult =
        integratorRepeated2D.integrate(f, new Double[] {10.0d, 0.5d}, new Double[] {10.0d, 0.5d});

    // Assert
    verify(f, atLeast(1)).apply(10.0d, 0.5d);
    assertEquals(0.0d, actualIntegrateResult.doubleValue());
  }
}
