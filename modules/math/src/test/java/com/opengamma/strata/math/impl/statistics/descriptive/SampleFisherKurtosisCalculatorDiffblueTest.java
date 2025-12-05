package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SampleFisherKurtosisCalculatorDiffblueTest {
  /**
   * Test {@link SampleFisherKurtosisCalculator#apply(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return doubleValue is minus six.
   * </ul>
   *
   * <p>Method under test: {@link SampleFisherKurtosisCalculator#apply(double[])}
   */
  @Test
  @DisplayName("Test apply(double[]) with 'double[]'; then return doubleValue is minus six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double SampleFisherKurtosisCalculator.apply(double[])"})
  void testApplyWithDouble_thenReturnDoubleValueIsMinusSix() {
    // Arrange, Act and Assert
    assertEquals(
        -6.0d,
        new SampleFisherKurtosisCalculator()
            .apply(new double[] {2.0d, 10.0d, 2.0d, 10.0d})
            .doubleValue());
  }
}
