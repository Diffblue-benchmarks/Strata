package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class GeometricMeanCalculatorDiffblueTest {
  /**
   * Test {@link GeometricMeanCalculator#apply(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 4.47213595499958}.
   * </ul>
   *
   * <p>Method under test: {@link GeometricMeanCalculator#apply(double[])}
   */
  @Test
  @DisplayName(
      "Test apply(double[]) with 'double[]'; then return doubleValue is '4.47213595499958'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double GeometricMeanCalculator.apply(double[])"})
  void testApplyWithDouble_thenReturnDoubleValueIs447213595499958() {
    // Arrange, Act and Assert
    assertEquals(
        4.47213595499958d,
        new GeometricMeanCalculator().apply(new double[] {2.0d, 10.0d, 2.0d, 10.0d}).doubleValue());
  }
}
