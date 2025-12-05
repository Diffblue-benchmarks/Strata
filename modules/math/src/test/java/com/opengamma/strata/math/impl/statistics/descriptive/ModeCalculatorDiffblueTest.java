package com.opengamma.strata.math.impl.statistics.descriptive;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.MathException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ModeCalculatorDiffblueTest {
  /**
   * Test {@link ModeCalculator#apply(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>When array of {@code double} with {@code 1.0E-16} and ten.
   *   <li>Then throw {@link MathException}.
   * </ul>
   *
   * <p>Method under test: {@link ModeCalculator#apply(double[])}
   */
  @Test
  @DisplayName(
      "Test apply(double[]) with 'double[]'; when array of double with '1.0E-16' and ten; then throw MathException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double ModeCalculator.apply(double[])"})
  void testApplyWithDouble_whenArrayOfDoubleWith10e16AndTen_thenThrowMathException() {
    // Arrange, Act and Assert
    assertThrows(
        MathException.class,
        () -> new ModeCalculator().apply(new double[] {1.0E-16d, 10.0d, 2.0d, 10.0d}));
  }

  /**
   * Test {@link ModeCalculator#apply(double[])} with {@code double[]}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and ten.
   *   <li>Then return doubleValue is two.
   * </ul>
   *
   * <p>Method under test: {@link ModeCalculator#apply(double[])}
   */
  @Test
  @DisplayName(
      "Test apply(double[]) with 'double[]'; when array of double with two and ten; then return doubleValue is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Double ModeCalculator.apply(double[])"})
  void testApplyWithDouble_whenArrayOfDoubleWithTwoAndTen_thenReturnDoubleValueIsTwo() {
    // Arrange, Act and Assert
    assertEquals(
        2.0d, new ModeCalculator().apply(new double[] {2.0d, 10.0d, 2.0d, 10.0d}).doubleValue());
  }
}
