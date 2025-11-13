package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SampleVarianceCalculatorDiffblueTest {
  /**
   * Test {@link SampleVarianceCalculator#apply(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 21.333333333333332}.
   * </ul>
   *
   * <p>Method under test: {@link SampleVarianceCalculator#apply(double[])}
   */
  @Test
  @DisplayName(
      "Test apply(double[]) with 'double[]'; then return doubleValue is '21.333333333333332'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double SampleVarianceCalculator.apply(double[])"})
  void testApplyWithDouble_thenReturnDoubleValueIs21333333333333332() {
    // Arrange, Act and Assert
    assertEquals(
        21.333333333333332d,
        new SampleVarianceCalculator()
            .apply(new double[] {2.0d, 10.0d, 2.0d, 10.0d})
            .doubleValue());
  }
}
