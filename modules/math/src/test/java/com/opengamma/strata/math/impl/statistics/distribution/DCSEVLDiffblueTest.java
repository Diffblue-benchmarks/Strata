package com.opengamma.strata.math.impl.statistics.distribution;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.MathException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DCSEVLDiffblueTest {
  /**
   * Test {@link DCSEVL#compute(double, double[], int)}.
   *
   * <ul>
   *   <li>When {@code 1001}.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link DCSEVL#compute(double, double[], int)}
   */
  @Test
  @DisplayName("Test compute(double, double[], int); when '1001'; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DCSEVL.compute(double, double[], int)"})
  void testCompute_when1001_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class,
        () -> DCSEVL.compute(2.0d, new double[] {10.0d, 2.0d, 10.0d, 2.0d}, 1001));
  }

  /**
   * Test {@link DCSEVL#compute(double, double[], int)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002}.
   *   <li>Then return five.
   * </ul>
   *
   * <p>Method under test: {@link DCSEVL#compute(double, double[], int)}
   */
  @Test
  @DisplayName("Test compute(double, double[], int); when '1.0000000000000002'; then return five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DCSEVL.compute(double, double[], int)"})
  void testCompute_when10000000000000002_thenReturnFive() {
    // Arrange and Act
    double actualComputeResult =
        DCSEVL.compute(1.0000000000000002d, new double[] {10.0d, 2.0d, 10.0d, 2.0d}, 1);

    // Assert
    assertEquals(5.0d, actualComputeResult);
  }

  /**
   * Test {@link DCSEVL#compute(double, double[], int)}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link DCSEVL#compute(double, double[], int)}
   */
  @Test
  @DisplayName(
      "Test compute(double, double[], int); when empty array of double; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DCSEVL.compute(double, double[], int)"})
  void testCompute_whenEmptyArrayOfDouble_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class, () -> DCSEVL.compute(1.0000000000000002d, new double[] {}, 1));
  }

  /**
   * Test {@link DCSEVL#compute(double, double[], int)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link DCSEVL#compute(double, double[], int)}
   */
  @Test
  @DisplayName("Test compute(double, double[], int); when 'null'; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DCSEVL.compute(double, double[], int)"})
  void testCompute_whenNull_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(MathException.class, () -> DCSEVL.compute(2.0d, null, 1));
  }

  /**
   * Test {@link DCSEVL#compute(double, double[], int)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link DCSEVL#compute(double, double[], int)}
   */
  @Test
  @DisplayName("Test compute(double, double[], int); when two; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DCSEVL.compute(double, double[], int)"})
  void testCompute_whenTwo_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class,
        () -> DCSEVL.compute(2.0d, new double[] {10.0d, 2.0d, 10.0d, 2.0d}, 1));
  }

  /**
   * Test {@link DCSEVL#compute(double, double[], int)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link DCSEVL#compute(double, double[], int)}
   */
  @Test
  @DisplayName("Test compute(double, double[], int); when zero; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DCSEVL.compute(double, double[], int)"})
  void testCompute_whenZero_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class,
        () -> DCSEVL.compute(2.0d, new double[] {10.0d, 2.0d, 10.0d, 2.0d}, 0));
  }
}
