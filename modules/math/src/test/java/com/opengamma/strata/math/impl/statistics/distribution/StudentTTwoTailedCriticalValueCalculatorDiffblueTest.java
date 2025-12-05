package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.cern.MersenneTwister;
import com.opengamma.strata.math.impl.cern.RandomEngine;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class StudentTTwoTailedCriticalValueCalculatorDiffblueTest {
  /**
   * Test {@link
   * StudentTTwoTailedCriticalValueCalculator#StudentTTwoTailedCriticalValueCalculator(double)}.
   *
   * <p>Method under test: {@link
   * StudentTTwoTailedCriticalValueCalculator#StudentTTwoTailedCriticalValueCalculator(double)}
   */
  @Test
  @DisplayName("Test new StudentTTwoTailedCriticalValueCalculator(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentTTwoTailedCriticalValueCalculator.<init>(double)"})
  void testNewStudentTTwoTailedCriticalValueCalculator() {
    // Arrange, Act and Assert
    assertEquals(
        0.6998120613124365d,
        new StudentTTwoTailedCriticalValueCalculator(10.0d).apply(0.5d).doubleValue());
  }

  /**
   * Test {@link
   * StudentTTwoTailedCriticalValueCalculator#StudentTTwoTailedCriticalValueCalculator(double)}.
   *
   * <p>Method under test: {@link
   * StudentTTwoTailedCriticalValueCalculator#StudentTTwoTailedCriticalValueCalculator(double)}
   */
  @Test
  @DisplayName("Test new StudentTTwoTailedCriticalValueCalculator(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentTTwoTailedCriticalValueCalculator.<init>(double)"})
  void testNewStudentTTwoTailedCriticalValueCalculator2() {
    // Arrange, Act and Assert
    assertEquals(
        0.5d, new StudentTTwoTailedCriticalValueCalculator(10.0d).apply(1.0E-14d).doubleValue());
  }

  /**
   * Test {@link
   * StudentTTwoTailedCriticalValueCalculator#StudentTTwoTailedCriticalValueCalculator(double,
   * RandomEngine)}.
   *
   * <p>Method under test: {@link
   * StudentTTwoTailedCriticalValueCalculator#StudentTTwoTailedCriticalValueCalculator(double,
   * RandomEngine)}
   */
  @Test
  @DisplayName("Test new StudentTTwoTailedCriticalValueCalculator(double, RandomEngine)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentTTwoTailedCriticalValueCalculator.<init>(double, RandomEngine)"})
  void testNewStudentTTwoTailedCriticalValueCalculator3() {
    // Arrange and Act
    StudentTTwoTailedCriticalValueCalculator actualStudentTTwoTailedCriticalValueCalculator =
        new StudentTTwoTailedCriticalValueCalculator(10.0d, new MersenneTwister());

    // Assert
    assertEquals(
        0.6998120613124365d,
        actualStudentTTwoTailedCriticalValueCalculator.apply(0.5d).doubleValue());
  }

  /**
   * Test {@link
   * StudentTTwoTailedCriticalValueCalculator#StudentTTwoTailedCriticalValueCalculator(double,
   * RandomEngine)}.
   *
   * <p>Method under test: {@link
   * StudentTTwoTailedCriticalValueCalculator#StudentTTwoTailedCriticalValueCalculator(double,
   * RandomEngine)}
   */
  @Test
  @DisplayName("Test new StudentTTwoTailedCriticalValueCalculator(double, RandomEngine)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void StudentTTwoTailedCriticalValueCalculator.<init>(double, RandomEngine)"})
  void testNewStudentTTwoTailedCriticalValueCalculator4() {
    // Arrange and Act
    StudentTTwoTailedCriticalValueCalculator actualStudentTTwoTailedCriticalValueCalculator =
        new StudentTTwoTailedCriticalValueCalculator(10.0d, new MersenneTwister());

    // Assert
    assertEquals(
        0.5d, actualStudentTTwoTailedCriticalValueCalculator.apply(1.0E-14d).doubleValue());
  }
}
