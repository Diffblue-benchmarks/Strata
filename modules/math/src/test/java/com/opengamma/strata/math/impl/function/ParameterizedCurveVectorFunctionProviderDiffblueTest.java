package com.opengamma.strata.math.impl.function;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ParameterizedCurveVectorFunctionProviderDiffblueTest {
  /**
   * Test {@link ParameterizedCurveVectorFunctionProvider#from(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return {@link ParameterizedCurveVectorFunction}.
   * </ul>
   *
   * <p>Method under test: {@link ParameterizedCurveVectorFunctionProvider#from(double[])}
   */
  @Test
  @DisplayName("Test from(double[]) with 'double[]'; then return ParameterizedCurveVectorFunction")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"VectorFunction ParameterizedCurveVectorFunctionProvider.from(double[])"})
  void testFromWithDouble_thenReturnParameterizedCurveVectorFunction() {
    // Arrange and Act
    VectorFunction actualFromResult =
        new ParameterizedCurveVectorFunctionProvider(mock(ParameterizedCurve.class))
            .from(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Assert
    assertTrue(actualFromResult instanceof ParameterizedCurveVectorFunction);
    assertEquals(0, actualFromResult.getLengthOfDomain());
    assertEquals(4, actualFromResult.getLengthOfRange());
  }
}
