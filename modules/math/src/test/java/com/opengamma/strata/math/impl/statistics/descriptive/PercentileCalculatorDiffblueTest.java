package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PercentileCalculatorDiffblueTest {
  /**
   * Test {@link PercentileCalculator#apply(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return doubleValue is six.
   * </ul>
   *
   * <p>Method under test: {@link PercentileCalculator#apply(double[])}
   */
  @Test
  @DisplayName("Test apply(double[]) with 'double[]'; then return doubleValue is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double PercentileCalculator.apply(double[])"})
  void testApplyWithDouble_thenReturnDoubleValueIsSix() {
    // Arrange, Act and Assert
    assertEquals(
        6.0d,
        new PercentileCalculator(0.5d)
            .apply(new double[] {2.0d, 10.0d, 2.0d, 10.0d})
            .doubleValue());
  }

  /**
   * Test {@link PercentileCalculator#apply(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return doubleValue is ten.
   * </ul>
   *
   * <p>Method under test: {@link PercentileCalculator#apply(double[])}
   */
  @Test
  @DisplayName("Test apply(double[]) with 'double[]'; then return doubleValue is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double PercentileCalculator.apply(double[])"})
  void testApplyWithDouble_thenReturnDoubleValueIsTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        new PercentileCalculator(0.9999999999999999d)
            .apply(new double[] {2.0d, 10.0d, 2.0d, 10.0d})
            .doubleValue());
  }

  /**
   * Test {@link PercentileCalculator#apply(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>Then return doubleValue is two.
   * </ul>
   *
   * <p>Method under test: {@link PercentileCalculator#apply(double[])}
   */
  @Test
  @DisplayName("Test apply(double[]) with 'double[]'; then return doubleValue is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double PercentileCalculator.apply(double[])"})
  void testApplyWithDouble_thenReturnDoubleValueIsTwo() {
    // Arrange, Act and Assert
    assertEquals(
        2.0d,
        new PercentileCalculator(1.0E-10d)
            .apply(new double[] {2.0d, 10.0d, 2.0d, 10.0d})
            .doubleValue());
  }
}
