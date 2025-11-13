package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PopulationStandardDeviationCalculatorDiffblueTest {
  /**
   * Test {@link PopulationStandardDeviationCalculator#apply(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and ten.
   *   <li>Then return doubleValue is four.
   * </ul>
   *
   * <p>Method under test: {@link PopulationStandardDeviationCalculator#apply(double[])}
   */
  @Test
  @DisplayName(
      "Test apply(double[]) with 'double[]'; when array of double with two and ten; then return doubleValue is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double PopulationStandardDeviationCalculator.apply(double[])"})
  void testApplyWithDouble_whenArrayOfDoubleWithTwoAndTen_thenReturnDoubleValueIsFour() {
    // Arrange, Act and Assert
    assertEquals(
        4.0d,
        new PopulationStandardDeviationCalculator()
            .apply(new double[] {2.0d, 10.0d, 2.0d, 10.0d})
            .doubleValue());
  }
}
