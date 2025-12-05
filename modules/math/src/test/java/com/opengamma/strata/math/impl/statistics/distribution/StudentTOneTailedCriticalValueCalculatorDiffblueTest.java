package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.cern.MersenneTwister;
import com.opengamma.strata.math.impl.cern.RandomEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StudentTOneTailedCriticalValueCalculatorDiffblueTest {
  /**
   * Test {@link
   * StudentTOneTailedCriticalValueCalculator#StudentTOneTailedCriticalValueCalculator(double)}.
   *
   * <p>Method under test: {@link
   * StudentTOneTailedCriticalValueCalculator#StudentTOneTailedCriticalValueCalculator(double)}
   */
  @Test
  @DisplayName("Test new StudentTOneTailedCriticalValueCalculator(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentTOneTailedCriticalValueCalculator.<init>(double)"})
  void testNewStudentTOneTailedCriticalValueCalculator() {
    // Arrange, Act and Assert
    assertEquals(
        -64.3467904533507d,
        new StudentTOneTailedCriticalValueCalculator(10.0d).apply(1.0E-14d).doubleValue());
  }

  /**
   * Test {@link
   * StudentTOneTailedCriticalValueCalculator#StudentTOneTailedCriticalValueCalculator(double,
   * RandomEngine)}.
   *
   * <p>Method under test: {@link
   * StudentTOneTailedCriticalValueCalculator#StudentTOneTailedCriticalValueCalculator(double,
   * RandomEngine)}
   */
  @Test
  @DisplayName("Test new StudentTOneTailedCriticalValueCalculator(double, RandomEngine)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentTOneTailedCriticalValueCalculator.<init>(double, RandomEngine)"})
  void testNewStudentTOneTailedCriticalValueCalculator2() {
    // Arrange and Act
    StudentTOneTailedCriticalValueCalculator actualStudentTOneTailedCriticalValueCalculator =
        new StudentTOneTailedCriticalValueCalculator(10.0d, new MersenneTwister());

    // Assert
    assertEquals(
        -64.3467904533507d,
        actualStudentTOneTailedCriticalValueCalculator.apply(1.0E-14d).doubleValue());
  }

  /**
   * Test {@link
   * StudentTOneTailedCriticalValueCalculator#StudentTOneTailedCriticalValueCalculator(double)}.
   *
   * <ul>
   *   <li>Then return apply {@code 0.5} doubleValue is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * StudentTOneTailedCriticalValueCalculator#StudentTOneTailedCriticalValueCalculator(double)}
   */
  @Test
  @DisplayName(
      "Test new StudentTOneTailedCriticalValueCalculator(double); then return apply '0.5' doubleValue is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentTOneTailedCriticalValueCalculator.<init>(double)"})
  void testNewStudentTOneTailedCriticalValueCalculator_thenReturnApply05DoubleValueIs05() {
    // Arrange, Act and Assert
    assertEquals(
        0.5d, new StudentTOneTailedCriticalValueCalculator(10.0d).apply(0.5d).doubleValue());
  }

  /**
   * Test {@link
   * StudentTOneTailedCriticalValueCalculator#StudentTOneTailedCriticalValueCalculator(double,
   * RandomEngine)}.
   *
   * <ul>
   *   <li>Then return apply {@code 0.5} doubleValue is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link
   * StudentTOneTailedCriticalValueCalculator#StudentTOneTailedCriticalValueCalculator(double,
   * RandomEngine)}
   */
  @Test
  @DisplayName(
      "Test new StudentTOneTailedCriticalValueCalculator(double, RandomEngine); then return apply '0.5' doubleValue is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentTOneTailedCriticalValueCalculator.<init>(double, RandomEngine)"})
  void testNewStudentTOneTailedCriticalValueCalculator_thenReturnApply05DoubleValueIs052() {
    // Arrange and Act
    StudentTOneTailedCriticalValueCalculator actualStudentTOneTailedCriticalValueCalculator =
        new StudentTOneTailedCriticalValueCalculator(10.0d, new MersenneTwister());

    // Assert
    assertEquals(0.5d, actualStudentTOneTailedCriticalValueCalculator.apply(0.5d).doubleValue());
  }
}
