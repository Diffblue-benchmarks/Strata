package com.opengamma.strata.math.impl.function;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.impl.differentiation.FiniteDifferenceType;
import com.opengamma.strata.math.impl.function.special.IncompleteBetaFunction;
import com.opengamma.strata.math.impl.function.special.InverseIncompleteBetaFunction;
import com.opengamma.strata.math.impl.function.special.TopHatFunction;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DoubleFunction1DDiffblueTest {
  /**
   * Test {@link DoubleFunction1D#derivative()}.
   *
   * <p>Method under test: {@link DoubleFunction1D#derivative()}
   */
  @Test
  @DisplayName("Test derivative()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.derivative()"})
  void testDerivative() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    RealPolynomialFunction1D actualDerivativeResult = realPolynomialFunction1D.derivative();
    double actualApplyAsDoubleResult = actualDerivativeResult.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualDerivativeResult instanceof RealPolynomialFunction1D);
    assertEquals(200.00000000000028d, actualApplyAsDoubleResult);
    RealPolynomialFunction1D derivativeResult = actualDerivativeResult.derivative();
    assertArrayEquals(
        new double[] {6.0000000000000005E-15d},
        derivativeResult.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {20.0d, 6.0000000000000005E-15d}, derivativeResult.getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0E-15d, 20.0d, 3.0000000000000002E-15d},
        ((RealPolynomialFunction1D) actualDerivativeResult).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link DoubleFunction1D#derivative(FiniteDifferenceType, double)} with {@code
   * FiniteDifferenceType}, {@code double}.
   *
   * <p>Method under test: {@link DoubleFunction1D#derivative(FiniteDifferenceType, double)}
   */
  @Test
  @DisplayName(
      "Test derivative(FiniteDifferenceType, double) with 'FiniteDifferenceType', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.derivative(FiniteDifferenceType, double)"})
  void testDerivativeWithFiniteDifferenceTypeDouble() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act and Assert
    assertEquals(
        200.15625d,
        realPolynomialFunction1D
            .derivative(FiniteDifferenceType.FORWARD, 0.015625d)
            .applyAsDouble(10.0d));
  }

  /**
   * Test {@link DoubleFunction1D#derivative(FiniteDifferenceType, double)} with {@code
   * FiniteDifferenceType}, {@code double}.
   *
   * <p>Method under test: {@link DoubleFunction1D#derivative(FiniteDifferenceType, double)}
   */
  @Test
  @DisplayName(
      "Test derivative(FiniteDifferenceType, double) with 'FiniteDifferenceType', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.derivative(FiniteDifferenceType, double)"})
  void testDerivativeWithFiniteDifferenceTypeDouble2() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act and Assert
    assertEquals(
        200.00000000000364d,
        realPolynomialFunction1D
            .derivative(FiniteDifferenceType.CENTRAL, 0.015625d)
            .applyAsDouble(10.0d));
  }

  /**
   * Test {@link DoubleFunction1D#derivative(FiniteDifferenceType, double)} with {@code
   * FiniteDifferenceType}, {@code double}.
   *
   * <p>Method under test: {@link DoubleFunction1D#derivative(FiniteDifferenceType, double)}
   */
  @Test
  @DisplayName(
      "Test derivative(FiniteDifferenceType, double) with 'FiniteDifferenceType', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.derivative(FiniteDifferenceType, double)"})
  void testDerivativeWithFiniteDifferenceTypeDouble3() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act and Assert
    assertEquals(
        199.84375000000728d,
        realPolynomialFunction1D
            .derivative(FiniteDifferenceType.BACKWARD, 0.015625d)
            .applyAsDouble(10.0d));
  }

  /**
   * Test {@link DoubleFunction1D#add(double)} with {@code a}.
   *
   * <p>Method under test: {@link DoubleFunction1D#add(double)}
   */
  @Test
  @DisplayName("Test add(double) with 'a'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.add(double)"})
  void testAddWithA() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    RealPolynomialFunction1D actualAddResult = realPolynomialFunction1D.add(10.0d);
    double actualApplyAsDoubleResult = actualAddResult.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualAddResult instanceof RealPolynomialFunction1D);
    assertEquals(1020.0000000000011d, actualApplyAsDoubleResult);
    RealPolynomialFunction1D derivativeResult = actualAddResult.derivative();
    RealPolynomialFunction1D derivativeResult2 = derivativeResult.derivative();
    assertArrayEquals(
        new double[] {6.0000000000000005E-15d},
        derivativeResult2.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {20.0d, 6.0000000000000005E-15d}, derivativeResult2.getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0E-15d, 20.0d, 3.0000000000000002E-15d},
        derivativeResult.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {20.0d, 1.0E-15d, 10.0d, 1.0E-15d},
        ((RealPolynomialFunction1D) actualAddResult).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link DoubleFunction1D#add(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Then return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleFunction1D#add(DoubleFunction1D)}
   */
  @Test
  @DisplayName("Test add(DoubleFunction1D) with 'f'; then return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.add(DoubleFunction1D)"})
  void testAddWithF_thenReturnRealPolynomialFunction1D() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);
    RealPolynomialFunction1D f = new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    DoubleFunction1D actualAddResult = realPolynomialFunction1D.add(f);
    double actualApplyAsDoubleResult = actualAddResult.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualAddResult instanceof RealPolynomialFunction1D);
    assertEquals(2020.0000000000023d, actualApplyAsDoubleResult);
    DoubleFunction1D derivativeResult = actualAddResult.derivative();
    DoubleFunction1D derivativeResult2 = derivativeResult.derivative();
    assertArrayEquals(
        new double[] {1.2000000000000001E-14d},
        ((RealPolynomialFunction1D) derivativeResult2.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {40.0d, 1.2000000000000001E-14d},
        ((RealPolynomialFunction1D) derivativeResult2).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {2.0E-15d, 40.0d, 6.0000000000000005E-15d},
        ((RealPolynomialFunction1D) derivativeResult).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {20.0d, 2.0E-15d, 20.0d, 2.0E-15d},
        ((RealPolynomialFunction1D) actualAddResult).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link DoubleFunction1D#divide(double)} with {@code a}.
   *
   * <p>Method under test: {@link DoubleFunction1D#divide(double)}
   */
  @Test
  @DisplayName("Test divide(double) with 'a'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.divide(double)"})
  void testDivideWithA() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    RealPolynomialFunction1D actualDivideResult = realPolynomialFunction1D.divide(10.0d);
    double actualApplyAsDoubleResult = actualDivideResult.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualDivideResult instanceof RealPolynomialFunction1D);
    assertEquals(101.00000000000011d, actualApplyAsDoubleResult);
    RealPolynomialFunction1D derivativeResult = actualDivideResult.derivative();
    RealPolynomialFunction1D derivativeResult2 = derivativeResult.derivative();
    assertArrayEquals(
        new double[] {6.000000000000001E-16d},
        derivativeResult2.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {2.0d, 6.000000000000001E-16d}, derivativeResult2.getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0000000000000001E-16d, 2.0d, 3.0000000000000004E-16d},
        derivativeResult.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0d, 1.0000000000000001E-16d, 1.0d, 1.0000000000000001E-16d},
        ((RealPolynomialFunction1D) actualDivideResult).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link DoubleFunction1D#divide(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return applyAsDouble ten is {@code 101.00000000000011}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleFunction1D#divide(DoubleFunction1D)}
   */
  @Test
  @DisplayName(
      "Test divide(DoubleFunction1D) with 'f'; given ten; then return applyAsDouble ten is '101.00000000000011'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.divide(DoubleFunction1D)"})
  void testDivideWithF_givenTen_thenReturnApplyAsDoubleTenIs10100000000000011() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    DoubleFunction1D f = mock(DoubleFunction1D.class);
    when(f.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    DoubleFunction1D actualDivideResult = realPolynomialFunction1D.divide(f);
    double actualApplyAsDoubleResult = actualDivideResult.applyAsDouble(10.0d);

    // Assert
    verify(f).applyAsDouble(10.0d);
    assertEquals(101.00000000000011d, actualApplyAsDoubleResult);
    RealPolynomialFunction1D derivativeResult = realPolynomialFunction1D.derivative();
    RealPolynomialFunction1D derivativeResult2 = derivativeResult.derivative();
    assertArrayEquals(
        new double[] {6.0000000000000005E-15d},
        derivativeResult2.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {20.0d, 6.0000000000000005E-15d}, derivativeResult2.getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0E-15d, 20.0d, 3.0000000000000002E-15d},
        derivativeResult.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
        realPolynomialFunction1D.getCoefficients(),
        0.0);
  }

  /**
   * Test {@link DoubleFunction1D#divide(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>When {@link DoubleFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleFunction1D#divide(DoubleFunction1D)}
   */
  @Test
  @DisplayName("Test divide(DoubleFunction1D) with 'f'; when DoubleFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.divide(DoubleFunction1D)"})
  void testDivideWithF_whenDoubleFunction1D() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    realPolynomialFunction1D.divide(mock(DoubleFunction1D.class));

    // Assert that nothing has changed
    RealPolynomialFunction1D derivativeResult = realPolynomialFunction1D.derivative();
    RealPolynomialFunction1D derivativeResult2 = derivativeResult.derivative();
    assertArrayEquals(
        new double[] {6.0000000000000005E-15d},
        derivativeResult2.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {20.0d, 6.0000000000000005E-15d}, derivativeResult2.getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0E-15d, 20.0d, 3.0000000000000002E-15d},
        derivativeResult.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
        realPolynomialFunction1D.getCoefficients(),
        0.0);
  }

  /**
   * Test {@link DoubleFunction1D#multiply(double)} with {@code a}.
   *
   * <p>Method under test: {@link DoubleFunction1D#multiply(double)}
   */
  @Test
  @DisplayName("Test multiply(double) with 'a'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.multiply(double)"})
  void testMultiplyWithA() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    RealPolynomialFunction1D actualMultiplyResult = realPolynomialFunction1D.multiply(10.0d);
    double actualApplyAsDoubleResult = actualMultiplyResult.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualMultiplyResult instanceof RealPolynomialFunction1D);
    assertEquals(10100.000000000011d, actualApplyAsDoubleResult);
    RealPolynomialFunction1D derivativeResult = actualMultiplyResult.derivative();
    RealPolynomialFunction1D derivativeResult2 = derivativeResult.derivative();
    assertArrayEquals(
        new double[] {6.000000000000001E-14d},
        derivativeResult2.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {200.0d, 6.000000000000001E-14d}, derivativeResult2.getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0000000000000002E-14d, 200.0d, 3.0000000000000005E-14d},
        derivativeResult.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {100.0d, 1.0000000000000002E-14d, 100.0d, 1.0000000000000002E-14d},
        ((RealPolynomialFunction1D) actualMultiplyResult).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link DoubleFunction1D#multiply(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Then return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleFunction1D#multiply(DoubleFunction1D)}
   */
  @Test
  @DisplayName("Test multiply(DoubleFunction1D) with 'f'; then return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.multiply(DoubleFunction1D)"})
  void testMultiplyWithF_thenReturnRealPolynomialFunction1D() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);
    RealPolynomialFunction1D f = new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    DoubleFunction1D actualMultiplyResult = realPolynomialFunction1D.multiply(f);
    double actualApplyAsDoubleResult = actualMultiplyResult.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualMultiplyResult instanceof RealPolynomialFunction1D);
    assertEquals(1020100.0000000021d, actualApplyAsDoubleResult);
    DoubleFunction1D derivativeResult = actualMultiplyResult.derivative();
    DoubleFunction1D derivativeResult2 = derivativeResult.derivative();
    DoubleFunction1D derivativeResult3 = derivativeResult2.derivative();
    DoubleFunction1D derivativeResult4 = derivativeResult3.derivative();
    DoubleFunction1D derivativeResult5 = derivativeResult4.derivative();
    assertArrayEquals(
        new double[] {7.200000000000001E-28d},
        ((RealPolynomialFunction1D) derivativeResult5.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {2.4000000000000003E-12d, 7.200000000000001E-28d},
        ((RealPolynomialFunction1D) derivativeResult5).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {2400.0d, 2.4000000000000003E-12d, 3.6000000000000003E-28d},
        ((RealPolynomialFunction1D) derivativeResult4).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {2.4000000000000004E-13d, 2400.0d, 1.2000000000000001E-12d, 1.2E-28d},
        ((RealPolynomialFunction1D) derivativeResult3).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {400.0d, 2.4000000000000004E-13d, 1200.0d, 4.0000000000000006E-13d, 3.0E-29d},
        ((RealPolynomialFunction1D) derivativeResult2).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {
          2.0000000000000003E-14d,
          400.0d,
          1.2000000000000002E-13d,
          400.0d,
          1.0000000000000002E-13d,
          6.0000000000000005E-30d
        },
        ((RealPolynomialFunction1D) derivativeResult).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {
          100.0d,
          2.0000000000000003E-14d,
          200.0d,
          4.0000000000000006E-14d,
          100.0d,
          2.0000000000000003E-14d,
          1.0E-30d
        },
        ((RealPolynomialFunction1D) actualMultiplyResult).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link DoubleFunction1D#subtract(double)} with {@code a}.
   *
   * <p>Method under test: {@link DoubleFunction1D#subtract(double)}
   */
  @Test
  @DisplayName("Test subtract(double) with 'a'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.subtract(double)"})
  void testSubtractWithA() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    RealPolynomialFunction1D actualSubtractResult = realPolynomialFunction1D.subtract(10.0d);
    double actualApplyAsDoubleResult = actualSubtractResult.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualSubtractResult instanceof RealPolynomialFunction1D);
    assertEquals(1000.0000000000011d, actualApplyAsDoubleResult);
    RealPolynomialFunction1D derivativeResult = actualSubtractResult.derivative();
    RealPolynomialFunction1D derivativeResult2 = derivativeResult.derivative();
    assertArrayEquals(
        new double[] {6.0000000000000005E-15d},
        derivativeResult2.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {20.0d, 6.0000000000000005E-15d}, derivativeResult2.getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0E-15d, 20.0d, 3.0000000000000002E-15d},
        derivativeResult.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.0E-15d, 10.0d, 1.0E-15d},
        ((RealPolynomialFunction1D) actualSubtractResult).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link DoubleFunction1D#subtract(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Then return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleFunction1D#subtract(DoubleFunction1D)}
   */
  @Test
  @DisplayName("Test subtract(DoubleFunction1D) with 'f'; then return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.subtract(DoubleFunction1D)"})
  void testSubtractWithF_thenReturnRealPolynomialFunction1D() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);
    RealPolynomialFunction1D f = new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    DoubleFunction1D actualSubtractResult = realPolynomialFunction1D.subtract(f);
    double actualApplyAsDoubleResult = actualSubtractResult.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualSubtractResult instanceof RealPolynomialFunction1D);
    assertEquals(0.0d, actualApplyAsDoubleResult);
    DoubleFunction1D derivativeResult = actualSubtractResult.derivative();
    DoubleFunction1D derivativeResult2 = derivativeResult.derivative();
    assertArrayEquals(
        new double[] {0.0d},
        ((RealPolynomialFunction1D) derivativeResult2.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d},
        ((RealPolynomialFunction1D) derivativeResult2).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d},
        ((RealPolynomialFunction1D) derivativeResult).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d},
        ((RealPolynomialFunction1D) actualSubtractResult).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link DoubleFunction1D#from(Function)}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>When {@link Function} {@link Function#apply(Object)} return ten.
   *   <li>Then return applyAsDouble ten is ten.
   * </ul>
   *
   * <p>Method under test: {@link DoubleFunction1D#from(Function)}
   */
  @Test
  @DisplayName(
      "Test from(Function); given ten; when Function apply(Object) return ten; then return applyAsDouble ten is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.from(Function)"})
  void testFrom_givenTen_whenFunctionApplyReturnTen_thenReturnApplyAsDoubleTenIsTen() {
    // Arrange
    Function<Double, Double> f = mock(Function.class);
    when(f.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    double actualApplyAsDoubleResult = DoubleFunction1D.from(f).applyAsDouble(10.0d);

    // Assert
    verify(f).apply(10.0d);
    assertEquals(10.0d, actualApplyAsDoubleResult);
  }

  /**
   * Test {@link DoubleFunction1D#from(Function)}.
   *
   * <ul>
   *   <li>Then return applyAsDouble {@code 0.5} is {@code 0.47639976575461507}.
   * </ul>
   *
   * <p>Method under test: {@link DoubleFunction1D#from(Function)}
   */
  @Test
  @DisplayName("Test from(Function); then return applyAsDouble '0.5' is '0.47639976575461507'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.from(Function)"})
  void testFrom_thenReturnApplyAsDouble05Is047639976575461507() {
    // Arrange, Act and Assert
    assertEquals(
        0.47639976575461507d,
        DoubleFunction1D.from(new InverseIncompleteBetaFunction(10.0d, 10.0d)).applyAsDouble(0.5d));
  }

  /**
   * Test {@link DoubleFunction1D#from(Function)}.
   *
   * <ul>
   *   <li>Then return applyAsDouble {@code 0.5} is zero.
   * </ul>
   *
   * <p>Method under test: {@link DoubleFunction1D#from(Function)}
   */
  @Test
  @DisplayName("Test from(Function); then return applyAsDouble '0.5' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.from(Function)"})
  void testFrom_thenReturnApplyAsDouble05IsZero() {
    // Arrange
    TopHatFunction f = new TopHatFunction(1.0d, 10.0d, 3.0d);

    // Act and Assert
    assertEquals(0.0d, DoubleFunction1D.from(f).applyAsDouble(0.5d));
    assertEquals(3.0d, f.apply(2.0d).doubleValue());
  }

  /**
   * Test {@link DoubleFunction1D#from(Function)}.
   *
   * <ul>
   *   <li>Then return applyAsDouble one is one.
   * </ul>
   *
   * <p>Method under test: {@link DoubleFunction1D#from(Function)}
   */
  @Test
  @DisplayName("Test from(Function); then return applyAsDouble one is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D DoubleFunction1D.from(Function)"})
  void testFrom_thenReturnApplyAsDoubleOneIsOne() {
    // Arrange, Act and Assert
    assertEquals(
        1.0d, DoubleFunction1D.from(new IncompleteBetaFunction(10.0d, 10.0d)).applyAsDouble(1.0d));
  }
}
