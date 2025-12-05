package com.opengamma.strata.math.impl.function;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
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
