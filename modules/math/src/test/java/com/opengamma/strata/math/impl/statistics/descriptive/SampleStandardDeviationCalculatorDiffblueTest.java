package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SampleStandardDeviationCalculatorDiffblueTest {
  /**
   * Test {@link SampleStandardDeviationCalculator#apply(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return doubleValue is {@code 4.618802153517006}.
   * </ul>
   *
   * <p>Method under test: {@link SampleStandardDeviationCalculator#apply(double[])}
   */
  @Test
  @DisplayName(
      "Test apply(double[]) with 'double[]'; then return doubleValue is '4.618802153517006'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double SampleStandardDeviationCalculator.apply(double[])"})
  void testApplyWithDouble_thenReturnDoubleValueIs4618802153517006() {
    // Arrange, Act and Assert
    assertEquals(
        4.618802153517006d,
        new SampleStandardDeviationCalculator()
            .apply(new double[] {2.0d, 10.0d, 2.0d, 10.0d})
            .doubleValue());
  }
}
