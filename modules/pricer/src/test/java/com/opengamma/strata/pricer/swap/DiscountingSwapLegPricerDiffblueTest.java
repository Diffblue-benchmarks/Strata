package com.opengamma.strata.pricer.swap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.pricer.impl.swap.DispatchingSwapPaymentEventPricer;
import com.opengamma.strata.pricer.impl.swap.DispatchingSwapPaymentPeriodPricer;
import com.opengamma.strata.product.swap.SwapPaymentEvent;
import com.opengamma.strata.product.swap.SwapPaymentPeriod;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class DiscountingSwapLegPricerDiffblueTest {
  /**
   * Test {@link DiscountingSwapLegPricer#DiscountingSwapLegPricer(SwapPaymentPeriodPricer,
   * SwapPaymentEventPricer)}.
   *
   * <p>Method under test: {@link
   * DiscountingSwapLegPricer#DiscountingSwapLegPricer(SwapPaymentPeriodPricer,
   * SwapPaymentEventPricer)}
   */
  @Test
  @DisplayName("Test new DiscountingSwapLegPricer(SwapPaymentPeriodPricer, SwapPaymentEventPricer)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DiscountingSwapLegPricer.<init>(SwapPaymentPeriodPricer, SwapPaymentEventPricer)"
  })
  void testNewDiscountingSwapLegPricer() {
    // Arrange and Act
    DiscountingSwapLegPricer actualDiscountingSwapLegPricer =
        new DiscountingSwapLegPricer(
            DispatchingSwapPaymentPeriodPricer.DEFAULT, DispatchingSwapPaymentEventPricer.DEFAULT);

    // Assert
    SwapPaymentEventPricer<SwapPaymentEvent> eventPricer =
        actualDiscountingSwapLegPricer.getEventPricer();
    assertTrue(eventPricer instanceof DispatchingSwapPaymentEventPricer);
    SwapPaymentPeriodPricer<SwapPaymentPeriod> periodPricer =
        actualDiscountingSwapLegPricer.getPeriodPricer();
    assertTrue(periodPricer instanceof DispatchingSwapPaymentPeriodPricer);
    assertSame(DispatchingSwapPaymentEventPricer.DEFAULT, eventPricer);
    assertSame(DispatchingSwapPaymentPeriodPricer.DEFAULT, periodPricer);
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link DiscountingSwapLegPricer#getEventPricer()}
   *   <li>{@link DiscountingSwapLegPricer#getPeriodPricer()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SwapPaymentEventPricer DiscountingSwapLegPricer.getEventPricer()",
    "SwapPaymentPeriodPricer DiscountingSwapLegPricer.getPeriodPricer()"
  })
  void testGettersAndSetters() {
    // Arrange
    DiscountingSwapLegPricer discountingSwapLegPricer =
        new DiscountingSwapLegPricer(
            DispatchingSwapPaymentPeriodPricer.DEFAULT, DispatchingSwapPaymentEventPricer.DEFAULT);

    // Act
    SwapPaymentEventPricer<SwapPaymentEvent> actualEventPricer =
        discountingSwapLegPricer.getEventPricer();

    // Assert
    assertTrue(actualEventPricer instanceof DispatchingSwapPaymentEventPricer);
    assertTrue(
        discountingSwapLegPricer.getPeriodPricer() instanceof DispatchingSwapPaymentPeriodPricer);
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash(int, int, double)} with {@code
   * nbPaymentsPerYear}, {@code nbPeriods}, {@code yield}.
   *
   * <ul>
   *   <li>Then return {@code 0.07692307692307691}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test annuityCash(int, int, double) with 'nbPaymentsPerYear', 'nbPeriods', 'yield'; then return '0.07692307692307691'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DiscountingSwapLegPricer.annuityCash(int, int, double)"})
  void testAnnuityCashWithNbPaymentsPerYearNbPeriodsYield_thenReturn007692307692307691() {
    // Arrange, Act and Assert
    assertEquals(
        0.07692307692307691d,
        DiscountingSwapLegPricer.DEFAULT.annuityCash(
            3, 1, DiscountingSwapProductPricerTest.TOLERANCE_PV_PS));
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash(int, int, double)} with {@code
   * nbPaymentsPerYear}, {@code nbPeriods}, {@code yield}.
   *
   * <ul>
   *   <li>Then return {@code 0.09467455621301775}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test annuityCash(int, int, double) with 'nbPaymentsPerYear', 'nbPeriods', 'yield'; then return '0.09467455621301775'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DiscountingSwapLegPricer.annuityCash(int, int, double)"})
  void testAnnuityCashWithNbPaymentsPerYearNbPeriodsYield_thenReturn009467455621301775() {
    // Arrange, Act and Assert
    assertEquals(
        0.09467455621301775d,
        DiscountingSwapLegPricer.DEFAULT.annuityCash(
            3, 2, DiscountingSwapProductPricerTest.TOLERANCE_PV_PS));
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash(int, int, double)} with {@code
   * nbPaymentsPerYear}, {@code nbPeriods}, {@code yield}.
   *
   * <ul>
   *   <li>Then return {@code 0.09877105143377332}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test annuityCash(int, int, double) with 'nbPaymentsPerYear', 'nbPeriods', 'yield'; then return '0.09877105143377332'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DiscountingSwapLegPricer.annuityCash(int, int, double)"})
  void testAnnuityCashWithNbPaymentsPerYearNbPeriodsYield_thenReturn009877105143377332() {
    // Arrange, Act and Assert
    assertEquals(
        0.09877105143377332d,
        DiscountingSwapLegPricer.DEFAULT.annuityCash(
            3, 3, DiscountingSwapProductPricerTest.TOLERANCE_PV_PS));
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash(int, int, double)} with {@code
   * nbPaymentsPerYear}, {@code nbPeriods}, {@code yield}.
   *
   * <ul>
   *   <li>Then return {@code 0.9999333370368518}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test annuityCash(int, int, double) with 'nbPaymentsPerYear', 'nbPeriods', 'yield'; then return '0.9999333370368518'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DiscountingSwapLegPricer.annuityCash(int, int, double)"})
  void testAnnuityCashWithNbPaymentsPerYearNbPeriodsYield_thenReturn09999333370368518() {
    // Arrange, Act and Assert
    assertEquals(0.9999333370368518d, DiscountingSwapLegPricer.DEFAULT.annuityCash(3, 3, 1.0E-4d));
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash(int, int, double)} with {@code
   * nbPaymentsPerYear}, {@code nbPeriods}, {@code yield}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test annuityCash(int, int, double) with 'nbPaymentsPerYear', 'nbPeriods', 'yield'; when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double DiscountingSwapLegPricer.annuityCash(int, int, double)"})
  void testAnnuityCashWithNbPaymentsPerYearNbPeriodsYield_whenZero_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        DiscountingSwapLegPricer.DEFAULT.annuityCash(
            3, 0, DiscountingSwapProductPricerTest.TOLERANCE_PV_PS));
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash1(int, int, double)}.
   *
   * <ul>
   *   <li>Then return Derivatives max is {@code -0.008264462809917356}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash1(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test annuityCash1(int, int, double); then return Derivatives max is '-0.008264462809917356'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives DiscountingSwapLegPricer.annuityCash1(int, int, double)"})
  void testAnnuityCash1_thenReturnDerivativesMaxIs0008264462809917356() {
    // Arrange and Act
    ValueDerivatives actualAnnuityCash1Result =
        DiscountingSwapLegPricer.DEFAULT.annuityCash1(
            1, 1, DiscountingSwapProductPricerTest.TOLERANCE_PV_PS);

    // Assert
    DoubleArray derivatives = actualAnnuityCash1Result.getDerivatives();
    assertEquals(-0.008264462809917356d, derivatives.max());
    assertEquals(-0.008264462809917356d, derivatives.min());
    assertEquals(-0.008264462809917356d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(-0.008264462809917356d, toListResult.get(0).doubleValue());
    assertEquals(0.09090909090909091d, actualAnnuityCash1Result.getValue());
    assertArrayEquals(new double[] {-0.008264462809917356d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash1(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-4}.
   *   <li>Then return Derivatives max is {@code -0.9998000299960005}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash1(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test annuityCash1(int, int, double); when '1.0E-4'; then return Derivatives max is '-0.9998000299960005'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives DiscountingSwapLegPricer.annuityCash1(int, int, double)"})
  void testAnnuityCash1_when10e4_thenReturnDerivativesMaxIs09998000299960005() {
    // Arrange and Act
    ValueDerivatives actualAnnuityCash1Result =
        DiscountingSwapLegPricer.DEFAULT.annuityCash1(1, 1, 1.0E-4d);

    // Assert
    DoubleArray derivatives = actualAnnuityCash1Result.getDerivatives();
    assertEquals(-0.9998000299960005d, derivatives.max());
    assertEquals(-0.9998000299960005d, derivatives.min());
    assertEquals(-0.9998000299960005d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(-0.9998000299960005d, toListResult.get(0).doubleValue());
    assertEquals(0.9999000099990001d, actualAnnuityCash1Result.getValue());
    assertArrayEquals(new double[] {-0.9998000299960005d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash1(int, int, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash1(int, int, double)}
   */
  @Test
  @DisplayName("Test annuityCash1(int, int, double); when zero; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives DiscountingSwapLegPricer.annuityCash1(int, int, double)"})
  void testAnnuityCash1_whenZero_thenReturnValueIsZero() {
    // Arrange and Act
    ValueDerivatives actualAnnuityCash1Result =
        DiscountingSwapLegPricer.DEFAULT.annuityCash1(
            1, 0, DiscountingSwapProductPricerTest.TOLERANCE_PV_PS);

    // Assert
    assertEquals(0.0d, actualAnnuityCash1Result.getValue());
    DoubleArray derivatives = actualAnnuityCash1Result.getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash2(int, int, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-4}.
   *   <li>Then return Derivatives min is {@code -0.9998000299960005}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash2(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test annuityCash2(int, int, double); when '1.0E-4'; then return Derivatives min is '-0.9998000299960005'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives DiscountingSwapLegPricer.annuityCash2(int, int, double)"})
  void testAnnuityCash2_when10e4_thenReturnDerivativesMinIs09998000299960005() {
    // Arrange and Act
    ValueDerivatives actualAnnuityCash2Result =
        DiscountingSwapLegPricer.DEFAULT.annuityCash2(1, 1, 1.0E-4d);

    // Assert
    DoubleArray derivatives = actualAnnuityCash2Result.getDerivatives();
    assertEquals(-0.9998000299960005d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(-0.9998000299960005d, toListResult.get(0).doubleValue());
    assertEquals(0.9996000899840024d, derivatives.sum());
    assertEquals(0.9999000099990001d, actualAnnuityCash2Result.getValue());
    assertEquals(1.9994001199800029d, derivatives.max());
    assertEquals(1.9994001199800029d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {-0.9998000299960005d, 1.9994001199800029d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash2(int, int, double)}.
   *
   * <ul>
   *   <li>When {@link DiscountingSwapProductPricerTest#TOLERANCE_PV_PS}.
   *   <li>Then return Derivatives sum is {@code -0.0067618332081142}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash2(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test annuityCash2(int, int, double); when TOLERANCE_PV_PS; then return Derivatives sum is '-0.0067618332081142'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives DiscountingSwapLegPricer.annuityCash2(int, int, double)"})
  void testAnnuityCash2_whenTolerance_pv_ps_thenReturnDerivativesSumIs00067618332081142() {
    // Arrange and Act
    ValueDerivatives actualAnnuityCash2Result =
        DiscountingSwapLegPricer.DEFAULT.annuityCash2(
            1, 1, DiscountingSwapProductPricerTest.TOLERANCE_PV_PS);

    // Assert
    DoubleArray derivatives = actualAnnuityCash2Result.getDerivatives();
    assertEquals(-0.0067618332081142d, derivatives.sum());
    assertEquals(-0.008264462809917356d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(-0.008264462809917356d, toListResult.get(0).doubleValue());
    assertEquals(0.0015026296018031554d, derivatives.max());
    assertEquals(0.0015026296018031554d, toListResult.get(1).doubleValue());
    assertEquals(0.09090909090909091d, actualAnnuityCash2Result.getValue());
    assertArrayEquals(
        new double[] {-0.008264462809917356d, 0.0015026296018031554d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash3(int, int, double)}.
   *
   * <ul>
   *   <li>Then return Derivatives sum is {@code -0.007171641281333243}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash3(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test annuityCash3(int, int, double); then return Derivatives sum is '-0.007171641281333243'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives DiscountingSwapLegPricer.annuityCash3(int, int, double)"})
  void testAnnuityCash3_thenReturnDerivativesSumIs0007171641281333243() {
    // Arrange and Act
    ValueDerivatives actualAnnuityCash3Result =
        DiscountingSwapLegPricer.DEFAULT.annuityCash3(
            1, 1, DiscountingSwapProductPricerTest.TOLERANCE_PV_PS);

    // Assert
    DoubleArray derivatives = actualAnnuityCash3Result.getDerivatives();
    assertEquals(-0.007171641281333243d, derivatives.sum());
    assertEquals(-0.008264462809917356d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-0.008264462809917356d, toListResult.get(0).doubleValue());
    assertEquals(-4.098080732190423E-4d, toListResult.get(2).doubleValue());
    assertEquals(0.0015026296018031554d, derivatives.max());
    assertEquals(0.0015026296018031554d, toListResult.get(1).doubleValue());
    assertEquals(0.09090909090909091d, actualAnnuityCash3Result.getValue());
    assertArrayEquals(
        new double[] {-0.008264462809917356d, 0.0015026296018031554d, -4.098080732190423E-4d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link DiscountingSwapLegPricer#annuityCash3(int, int, double)}.
   *
   * <ul>
   *   <li>Then return Derivatives toList first doubleValue is {@code -0.9998000299960005}.
   * </ul>
   *
   * <p>Method under test: {@link DiscountingSwapLegPricer#annuityCash3(int, int, double)}
   */
  @Test
  @DisplayName(
      "Test annuityCash3(int, int, double); then return Derivatives toList first doubleValue is '-0.9998000299960005'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives DiscountingSwapLegPricer.annuityCash3(int, int, double)"})
  void testAnnuityCash3_thenReturnDerivativesToListFirstDoubleValueIs09998000299960005() {
    // Arrange and Act
    ValueDerivatives actualAnnuityCash3Result =
        DiscountingSwapLegPricer.DEFAULT.annuityCash3(1, 1, 1.0E-4d);

    // Assert
    DoubleArray derivatives = actualAnnuityCash3Result.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-0.9998000299960005d, toListResult.get(0).doubleValue());
    assertEquals(-4.998000509896018d, derivatives.sum());
    assertEquals(-5.997600599880021d, derivatives.min());
    assertEquals(-5.997600599880021d, toListResult.get(2).doubleValue());
    assertEquals(0.9999000099990001d, actualAnnuityCash3Result.getValue());
    assertEquals(1.9994001199800029d, derivatives.max());
    assertEquals(1.9994001199800029d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {-0.9998000299960005d, 1.9994001199800029d, -5.997600599880021d},
        derivatives.toArrayUnsafe(),
        0.0);
  }
}
