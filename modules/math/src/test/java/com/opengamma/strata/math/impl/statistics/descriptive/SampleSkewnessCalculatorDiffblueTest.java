package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SampleSkewnessCalculatorDiffblueTest {
  /**
   * Test {@link SampleSkewnessCalculator#apply(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and ten.
   *   <li>Then return doubleValue is zero.
   * </ul>
   *
   * <p>Method under test: {@link SampleSkewnessCalculator#apply(double[])}
   */
  @Test
  @DisplayName(
      "Test apply(double[]) with 'double[]'; when array of double with two and ten; then return doubleValue is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double SampleSkewnessCalculator.apply(double[])"})
  void testApplyWithDouble_whenArrayOfDoubleWithTwoAndTen_thenReturnDoubleValueIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        new SampleSkewnessCalculator()
            .apply(new double[] {2.0d, 10.0d, 2.0d, 10.0d})
            .doubleValue());
  }
}
