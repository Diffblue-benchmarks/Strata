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

  /**
   * Test {@link StudentTTwoTailedCriticalValueCalculator#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return doubleValue is {@code 0.6998120613124365}.
   * </ul>
   *
   * <p>Method under test: {@link StudentTTwoTailedCriticalValueCalculator#apply(Double)}
   */
  @Test
  @DisplayName(
      "Test apply(Double) with 'Double'; when '0.5'; then return doubleValue is '0.6998120613124365'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double StudentTTwoTailedCriticalValueCalculator.apply(Double)"})
  void testApplyWithDouble_when05_thenReturnDoubleValueIs06998120613124365() {
    // Arrange, Act and Assert
    assertEquals(
        0.6998120613124365d,
        new StudentTTwoTailedCriticalValueCalculator(10.0d).apply(0.5d).doubleValue());
  }

  /**
   * Test {@link StudentTTwoTailedCriticalValueCalculator#apply(Double)} with {@code Double}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return doubleValue is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link StudentTTwoTailedCriticalValueCalculator#apply(Double)}
   */
  @Test
  @DisplayName("Test apply(Double) with 'Double'; when zero; then return doubleValue is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Double StudentTTwoTailedCriticalValueCalculator.apply(Double)"})
  void testApplyWithDouble_whenZero_thenReturnDoubleValueIs05() {
    // Arrange, Act and Assert
    assertEquals(
        0.5d, new StudentTTwoTailedCriticalValueCalculator(10.0d).apply(0.0d).doubleValue());
  }
}
