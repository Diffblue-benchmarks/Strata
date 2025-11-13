package com.opengamma.strata.pricer.capfloor;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class VolatilityOvernightInArrearsCapletFloorletPeriodPricerDiffblueTest {
  /**
   * Test {@link VolatilityOvernightInArrearsCapletFloorletPeriodPricer#adjustedVolatility(double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code 5.7735026919539925}.
   * </ul>
   *
   * <p>Method under test: {@link
   * VolatilityOvernightInArrearsCapletFloorletPeriodPricer#adjustedVolatility(double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test adjustedVolatility(double, double, double); when '1.0E-10'; then return '5.7735026919539925'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double VolatilityOvernightInArrearsCapletFloorletPeriodPricer.adjustedVolatility(double, double, double)"
  })
  void testAdjustedVolatility_when10e10_thenReturn57735026919539925() {
    // Arrange, Act and Assert
    assertEquals(
        5.7735026919539925d,
        VolatilityOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT.adjustedVolatility(
            1.0E-10d, 10.0d, 10.0d));
  }

  /**
   * Test {@link VolatilityOvernightInArrearsCapletFloorletPeriodPricer#adjustedVolatility(double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.3333333333333333}.
   *   <li>Then return {@code 5.962847939999438}.
   * </ul>
   *
   * <p>Method under test: {@link
   * VolatilityOvernightInArrearsCapletFloorletPeriodPricer#adjustedVolatility(double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test adjustedVolatility(double, double, double); when '0.3333333333333333'; then return '5.962847939999438'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double VolatilityOvernightInArrearsCapletFloorletPeriodPricer.adjustedVolatility(double, double, double)"
  })
  void testAdjustedVolatility_when03333333333333333_thenReturn5962847939999438() {
    // Arrange, Act and Assert
    assertEquals(
        5.962847939999438d,
        VolatilityOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT.adjustedVolatility(
            0.3333333333333333d, 10.0d, 10.0d));
  }

  /**
   * Test {@link VolatilityOvernightInArrearsCapletFloorletPeriodPricer#adjustedVolatility(double,
   * double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * VolatilityOvernightInArrearsCapletFloorletPeriodPricer#adjustedVolatility(double, double,
   * double)}
   */
  @Test
  @DisplayName("Test adjustedVolatility(double, double, double); when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double VolatilityOvernightInArrearsCapletFloorletPeriodPricer.adjustedVolatility(double, double, double)"
  })
  void testAdjustedVolatility_whenTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d,
        VolatilityOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT.adjustedVolatility(
            10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link VolatilityOvernightInArrearsCapletFloorletPeriodPricer#adjustedVolatility(double,
   * double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 5.773502691896258}.
   * </ul>
   *
   * <p>Method under test: {@link
   * VolatilityOvernightInArrearsCapletFloorletPeriodPricer#adjustedVolatility(double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test adjustedVolatility(double, double, double); when zero; then return '5.773502691896258'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double VolatilityOvernightInArrearsCapletFloorletPeriodPricer.adjustedVolatility(double, double, double)"
  })
  void testAdjustedVolatility_whenZero_thenReturn5773502691896258() {
    // Arrange, Act and Assert
    assertEquals(
        5.773502691896258d,
        VolatilityOvernightInArrearsCapletFloorletPeriodPricer.DEFAULT.adjustedVolatility(
            0.0d, 10.0d, 10.0d));
  }
}
