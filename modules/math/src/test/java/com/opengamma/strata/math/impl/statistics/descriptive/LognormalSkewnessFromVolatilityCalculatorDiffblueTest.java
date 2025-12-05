package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LognormalSkewnessFromVolatilityCalculatorDiffblueTest {
  /**
   * Test {@link LognormalSkewnessFromVolatilityCalculator#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 47.4265947730152}.
   * </ul>
   *
   * <p>Method under test: {@link LognormalSkewnessFromVolatilityCalculator#applyAsDouble(double,
   * double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when '0.5'; then return '47.4265947730152'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double LognormalSkewnessFromVolatilityCalculator.applyAsDouble(double, double)"
  })
  void testApplyAsDouble_when05_thenReturn474265947730152() {
    // Arrange, Act and Assert
    assertEquals(
        47.4265947730152d,
        new LognormalSkewnessFromVolatilityCalculator().applyAsDouble(0.5d, 10.0d));
  }

  /**
   * Test {@link LognormalSkewnessFromVolatilityCalculator#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 3269239.984630479}.
   * </ul>
   *
   * <p>Method under test: {@link LognormalSkewnessFromVolatilityCalculator#applyAsDouble(double,
   * double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when one; then return '3269239.984630479'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double LognormalSkewnessFromVolatilityCalculator.applyAsDouble(double, double)"
  })
  void testApplyAsDouble_whenOne_thenReturn3269239984630479() {
    // Arrange, Act and Assert
    assertEquals(
        3269239.984630479d,
        new LognormalSkewnessFromVolatilityCalculator().applyAsDouble(1.0d, 10.0d));
  }

  /**
   * Test {@link LognormalSkewnessFromVolatilityCalculator#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link LognormalSkewnessFromVolatilityCalculator#applyAsDouble(double,
   * double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when ten; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double LognormalSkewnessFromVolatilityCalculator.applyAsDouble(double, double)"
  })
  void testApplyAsDouble_whenTen_thenReturnPositive_infinity() {
    // Arrange, Act and Assert
    assertEquals(
        Double.POSITIVE_INFINITY,
        new LognormalSkewnessFromVolatilityCalculator().applyAsDouble(10.0d, 10.0d));
  }

  /**
   * Test {@link LognormalSkewnessFromVolatilityCalculator#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return {@code 4.263389948314721E58}.
   * </ul>
   *
   * <p>Method under test: {@link LognormalSkewnessFromVolatilityCalculator#applyAsDouble(double,
   * double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when three; then return '4.263389948314721E58'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double LognormalSkewnessFromVolatilityCalculator.applyAsDouble(double, double)"
  })
  void testApplyAsDouble_whenThree_thenReturn4263389948314721e58() {
    // Arrange, Act and Assert
    assertEquals(
        4.263389948314721E58d,
        new LognormalSkewnessFromVolatilityCalculator().applyAsDouble(3.0d, 10.0d));
  }
}
