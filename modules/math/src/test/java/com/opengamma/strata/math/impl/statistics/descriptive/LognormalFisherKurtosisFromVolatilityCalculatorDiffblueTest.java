package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LognormalFisherKurtosisFromVolatilityCalculatorDiffblueTest {
  /**
   * Test {@link LognormalFisherKurtosisFromVolatilityCalculator#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When fifteen.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LognormalFisherKurtosisFromVolatilityCalculator#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when fifteen; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double LognormalFisherKurtosisFromVolatilityCalculator.applyAsDouble(double, double)"
  })
  void testApplyAsDouble_whenFifteen_thenReturnPositive_infinity() {
    // Arrange, Act and Assert
    assertEquals(
        Double.POSITIVE_INFINITY,
        new LognormalFisherKurtosisFromVolatilityCalculator().applyAsDouble(15.0d, 10.0d));
  }

  /**
   * Test {@link LognormalFisherKurtosisFromVolatilityCalculator#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 2.354066412416787E17}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LognormalFisherKurtosisFromVolatilityCalculator#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when one; then return '2.354066412416787E17'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double LognormalFisherKurtosisFromVolatilityCalculator.applyAsDouble(double, double)"
  })
  void testApplyAsDouble_whenOne_thenReturn2354066412416787e17() {
    // Arrange, Act and Assert
    assertEquals(
        2.354066412416787E17d,
        new LognormalFisherKurtosisFromVolatilityCalculator().applyAsDouble(1.0d, 10.0d));
  }

  /**
   * Test {@link LognormalFisherKurtosisFromVolatilityCalculator#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When sixteen.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LognormalFisherKurtosisFromVolatilityCalculator#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when sixteen; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double LognormalFisherKurtosisFromVolatilityCalculator.applyAsDouble(double, double)"
  })
  void testApplyAsDouble_whenSixteen_thenReturnPositive_infinity() {
    // Arrange, Act and Assert
    assertEquals(
        Double.POSITIVE_INFINITY,
        new LognormalFisherKurtosisFromVolatilityCalculator().applyAsDouble(16.0d, 10.0d));
  }

  /**
   * Test {@link LognormalFisherKurtosisFromVolatilityCalculator#applyAsDouble(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * LognormalFisherKurtosisFromVolatilityCalculator#applyAsDouble(double, double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double, double); when ten; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double LognormalFisherKurtosisFromVolatilityCalculator.applyAsDouble(double, double)"
  })
  void testApplyAsDouble_whenTen_thenReturnPositive_infinity() {
    // Arrange, Act and Assert
    assertEquals(
        Double.POSITIVE_INFINITY,
        new LognormalFisherKurtosisFromVolatilityCalculator().applyAsDouble(10.0d, 10.0d));
  }
}
