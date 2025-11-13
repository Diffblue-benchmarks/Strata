package com.opengamma.strata.math.impl.function;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class RealPolynomialFunction1DDiffblueTest {
  /**
   * Test {@link RealPolynomialFunction1D#RealPolynomialFunction1D(double[])}.
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#RealPolynomialFunction1D(double[])}
   */
  @Test
  @DisplayName("Test new RealPolynomialFunction1D(double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void RealPolynomialFunction1D.<init>(double[])"})
  void testNewRealPolynomialFunction1D() {
    // Arrange and Act
    RealPolynomialFunction1D actualRealPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Assert
    RealPolynomialFunction1D derivativeResult = actualRealPolynomialFunction1D.derivative();
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
        actualRealPolynomialFunction1D.getCoefficients(),
        0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#applyAsDouble(double)}.
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#applyAsDouble(double)}
   */
  @Test
  @DisplayName("Test applyAsDouble(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double RealPolynomialFunction1D.applyAsDouble(double)"})
  void testApplyAsDouble() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act and Assert
    assertEquals(50.00000000000001d, realPolynomialFunction1D.applyAsDouble(2.0d));
  }

  /**
   * Test {@link RealPolynomialFunction1D#getCoefficients()}.
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#getCoefficients()}
   */
  @Test
  @DisplayName("Test getCoefficients()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] RealPolynomialFunction1D.getCoefficients()"})
  void testGetCoefficients() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act and Assert
    assertArrayEquals(
        new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
        realPolynomialFunction1D.getCoefficients(),
        0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#add(double)} with {@code a}.
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#add(double)}
   */
  @Test
  @DisplayName("Test add(double) with 'a'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealPolynomialFunction1D RealPolynomialFunction1D.add(double)"})
  void testAddWithA() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    RealPolynomialFunction1D actualAddResult = realPolynomialFunction1D.add(10.0d);

    // Assert
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
        new double[] {20.0d, 1.0E-15d, 10.0d, 1.0E-15d}, actualAddResult.getCoefficients(), 0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#add(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return applyAsDouble ten is {@code 1020.0000000000011}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#add(DoubleFunction1D)}
   */
  @Test
  @DisplayName(
      "Test add(DoubleFunction1D) with 'f'; given ten; then return applyAsDouble ten is '1020.0000000000011'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.add(DoubleFunction1D)"})
  void testAddWithF_givenTen_thenReturnApplyAsDoubleTenIs10200000000000011() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    DoubleFunction1D f = mock(DoubleFunction1D.class);
    when(f.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    DoubleFunction1D actualAddResult = realPolynomialFunction1D.add(f);
    double actualApplyAsDoubleResult = actualAddResult.applyAsDouble(10.0d);

    // Assert
    verify(f).applyAsDouble(10.0d);
    assertEquals(1020.0000000000011d, actualApplyAsDoubleResult);
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
   * Test {@link RealPolynomialFunction1D#add(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Then return applyAsDouble ten is {@code 1.010202E7}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#add(DoubleFunction1D)}
   */
  @Test
  @DisplayName("Test add(DoubleFunction1D) with 'f'; then return applyAsDouble ten is '1.010202E7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.add(DoubleFunction1D)"})
  void testAddWithF_thenReturnApplyAsDoubleTenIs1010202e7() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);
    RealPolynomialFunction1D f =
        new RealPolynomialFunction1D(10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d);

    // Act
    DoubleFunction1D actualAddResult = realPolynomialFunction1D.add(f);
    double actualApplyAsDoubleResult = actualAddResult.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualAddResult instanceof RealPolynomialFunction1D);
    assertEquals(1.010202E7d, actualApplyAsDoubleResult);
    RealPolynomialFunction1D derivativeResult = realPolynomialFunction1D.derivative();
    assertArrayEquals(
        new double[] {20.0d, 6.0000000000000005E-15d},
        derivativeResult.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0E-15d, 20.0d, 3.0000000000000002E-15d},
        derivativeResult.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
        realPolynomialFunction1D.getCoefficients(),
        0.0);
    RealPolynomialFunction1D derivativeResult2 = f.derivative();
    assertArrayEquals(
        new double[] {20.0d, 0.0d, 120.0d, 0.0d, 300.0d, 0.0d},
        derivativeResult2.derivative().getCoefficients(),
        0.0);
    DoubleFunction1D derivativeResult3 = actualAddResult.derivative();
    assertArrayEquals(
        new double[] {40.0d, 6.0000000000000005E-15d, 120.0d, 0.0d, 300.0d, 0.0d},
        ((RealPolynomialFunction1D) derivativeResult3.derivative()).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 20.0d, 0.0d, 40.0d, 0.0d, 60.0d, 0.0d},
        derivativeResult2.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0E-15d, 40.0d, 3.0000000000000002E-15d, 40.0d, 0.0d, 60.0d, 0.0d},
        ((RealPolynomialFunction1D) derivativeResult3).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d},
        f.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {20.0d, 1.0E-15d, 20.0d, 1.0E-15d, 10.0d, 0.0d, 10.0d, 0.0d},
        ((RealPolynomialFunction1D) actualAddResult).getCoefficients(),
        0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#add(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Then return applyAsDouble ten is {@code 2020.0000000000023}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#add(DoubleFunction1D)}
   */
  @Test
  @DisplayName(
      "Test add(DoubleFunction1D) with 'f'; then return applyAsDouble ten is '2020.0000000000023'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.add(DoubleFunction1D)"})
  void testAddWithF_thenReturnApplyAsDoubleTenIs20200000000000023() {
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
    assertEquals(realPolynomialFunction1D, f);
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
   * Test {@link RealPolynomialFunction1D#add(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>When {@link DoubleFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#add(DoubleFunction1D)}
   */
  @Test
  @DisplayName("Test add(DoubleFunction1D) with 'f'; when DoubleFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.add(DoubleFunction1D)"})
  void testAddWithF_whenDoubleFunction1D() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    realPolynomialFunction1D.add(mock(DoubleFunction1D.class));

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
   * Test {@link RealPolynomialFunction1D#derivative()}.
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#derivative()}
   */
  @Test
  @DisplayName("Test derivative()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealPolynomialFunction1D RealPolynomialFunction1D.derivative()"})
  void testDerivative() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act and Assert
    assertArrayEquals(
        new double[] {1.0E-15d, 20.0d, 3.0000000000000002E-15d},
        realPolynomialFunction1D.derivative().getCoefficients(),
        0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#divide(double)} with {@code a}.
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#divide(double)}
   */
  @Test
  @DisplayName("Test divide(double) with 'a'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealPolynomialFunction1D RealPolynomialFunction1D.divide(double)"})
  void testDivideWithA() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    RealPolynomialFunction1D actualDivideResult = realPolynomialFunction1D.divide(10.0d);

    // Assert
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
        actualDivideResult.getCoefficients(),
        0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#multiply(double)} with {@code a}.
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#multiply(double)}
   */
  @Test
  @DisplayName("Test multiply(double) with 'a'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealPolynomialFunction1D RealPolynomialFunction1D.multiply(double)"})
  void testMultiplyWithA() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    RealPolynomialFunction1D actualMultiplyResult = realPolynomialFunction1D.multiply(10.0d);

    // Assert
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
        actualMultiplyResult.getCoefficients(),
        0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#multiply(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return applyAsDouble ten is {@code 10100.000000000011}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#multiply(DoubleFunction1D)}
   */
  @Test
  @DisplayName(
      "Test multiply(DoubleFunction1D) with 'f'; given ten; then return applyAsDouble ten is '10100.000000000011'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.multiply(DoubleFunction1D)"})
  void testMultiplyWithF_givenTen_thenReturnApplyAsDoubleTenIs10100000000000011() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    DoubleFunction1D f = mock(DoubleFunction1D.class);
    when(f.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    DoubleFunction1D actualMultiplyResult = realPolynomialFunction1D.multiply(f);
    double actualApplyAsDoubleResult = actualMultiplyResult.applyAsDouble(10.0d);

    // Assert
    verify(f).applyAsDouble(10.0d);
    assertEquals(10100.000000000011d, actualApplyAsDoubleResult);
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
   * Test {@link RealPolynomialFunction1D#multiply(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Then return {@link RealPolynomialFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#multiply(DoubleFunction1D)}
   */
  @Test
  @DisplayName("Test multiply(DoubleFunction1D) with 'f'; then return RealPolynomialFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.multiply(DoubleFunction1D)"})
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
    assertEquals(realPolynomialFunction1D, f);
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
   * Test {@link RealPolynomialFunction1D#multiply(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>When {@link DoubleFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#multiply(DoubleFunction1D)}
   */
  @Test
  @DisplayName("Test multiply(DoubleFunction1D) with 'f'; when DoubleFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.multiply(DoubleFunction1D)"})
  void testMultiplyWithF_whenDoubleFunction1D() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    realPolynomialFunction1D.multiply(mock(DoubleFunction1D.class));

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
   * Test {@link RealPolynomialFunction1D#subtract(double)} with {@code a}.
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#subtract(double)}
   */
  @Test
  @DisplayName("Test subtract(double) with 'a'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealPolynomialFunction1D RealPolynomialFunction1D.subtract(double)"})
  void testSubtractWithA() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    RealPolynomialFunction1D actualSubtractResult = realPolynomialFunction1D.subtract(10.0d);

    // Assert
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
        actualSubtractResult.getCoefficients(),
        0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#subtract(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Given ten.
   *   <li>Then return applyAsDouble ten is {@code 1000.0000000000011}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#subtract(DoubleFunction1D)}
   */
  @Test
  @DisplayName(
      "Test subtract(DoubleFunction1D) with 'f'; given ten; then return applyAsDouble ten is '1000.0000000000011'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.subtract(DoubleFunction1D)"})
  void testSubtractWithF_givenTen_thenReturnApplyAsDoubleTenIs10000000000000011() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    DoubleFunction1D f = mock(DoubleFunction1D.class);
    when(f.applyAsDouble(anyDouble())).thenReturn(10.0d);

    // Act
    DoubleFunction1D actualSubtractResult = realPolynomialFunction1D.subtract(f);
    double actualApplyAsDoubleResult = actualSubtractResult.applyAsDouble(10.0d);

    // Assert
    verify(f).applyAsDouble(10.0d);
    assertEquals(1000.0000000000011d, actualApplyAsDoubleResult);
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
   * Test {@link RealPolynomialFunction1D#subtract(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Then return applyAsDouble ten is {@code 1.01E7}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#subtract(DoubleFunction1D)}
   */
  @Test
  @DisplayName(
      "Test subtract(DoubleFunction1D) with 'f'; then return applyAsDouble ten is '1.01E7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.subtract(DoubleFunction1D)"})
  void testSubtractWithF_thenReturnApplyAsDoubleTenIs101e7() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d);
    RealPolynomialFunction1D f = new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    DoubleFunction1D actualSubtractResult = realPolynomialFunction1D.subtract(f);
    double actualApplyAsDoubleResult = actualSubtractResult.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualSubtractResult instanceof RealPolynomialFunction1D);
    assertEquals(1.01E7d, actualApplyAsDoubleResult);
    RealPolynomialFunction1D derivativeResult = f.derivative();
    assertArrayEquals(
        new double[] {20.0d, 6.0000000000000005E-15d},
        derivativeResult.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0E-15d, 20.0d, 3.0000000000000002E-15d},
        derivativeResult.getCoefficients(),
        0.0);
    assertArrayEquals(new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d}, f.getCoefficients(), 0.0);
    DoubleFunction1D derivativeResult2 = actualSubtractResult.derivative();
    assertArrayEquals(
        new double[] {0.0d, -6.0000000000000005E-15d, 120.0d, 0.0d, 300.0d, 0.0d},
        ((RealPolynomialFunction1D) derivativeResult2.derivative()).getCoefficients(),
        0.0);
    RealPolynomialFunction1D derivativeResult3 = realPolynomialFunction1D.derivative();
    assertArrayEquals(
        new double[] {20.0d, 0.0d, 120.0d, 0.0d, 300.0d, 0.0d},
        derivativeResult3.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {-1.0E-15d, 0.0d, -3.0000000000000002E-15d, 40.0d, 0.0d, 60.0d, 0.0d},
        ((RealPolynomialFunction1D) derivativeResult2).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 20.0d, 0.0d, 40.0d, 0.0d, 60.0d, 0.0d},
        derivativeResult3.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, -1.0E-15d, 0.0d, -1.0E-15d, 10.0d, 0.0d, 10.0d, 0.0d},
        ((RealPolynomialFunction1D) actualSubtractResult).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d},
        realPolynomialFunction1D.getCoefficients(),
        0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#subtract(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Then return applyAsDouble ten is {@code -1.01E7}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#subtract(DoubleFunction1D)}
   */
  @Test
  @DisplayName(
      "Test subtract(DoubleFunction1D) with 'f'; then return applyAsDouble ten is '-1.01E7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.subtract(DoubleFunction1D)"})
  void testSubtractWithF_thenReturnApplyAsDoubleTenIs101e72() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);
    RealPolynomialFunction1D f =
        new RealPolynomialFunction1D(10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d);

    // Act
    DoubleFunction1D actualSubtractResult = realPolynomialFunction1D.subtract(f);
    double actualApplyAsDoubleResult = actualSubtractResult.applyAsDouble(10.0d);

    // Assert
    assertTrue(actualSubtractResult instanceof RealPolynomialFunction1D);
    assertEquals(-1.01E7d, actualApplyAsDoubleResult);
    RealPolynomialFunction1D derivativeResult = realPolynomialFunction1D.derivative();
    assertArrayEquals(
        new double[] {20.0d, 6.0000000000000005E-15d},
        derivativeResult.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0E-15d, 20.0d, 3.0000000000000002E-15d},
        derivativeResult.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 1.0E-15d, 10.0d, 1.0E-15d},
        realPolynomialFunction1D.getCoefficients(),
        0.0);
    DoubleFunction1D derivativeResult2 = actualSubtractResult.derivative();
    assertArrayEquals(
        new double[] {0.0d, 6.0000000000000005E-15d, -120.0d, -0.0d, -300.0d, -0.0d},
        ((RealPolynomialFunction1D) derivativeResult2.derivative()).getCoefficients(),
        0.0);
    RealPolynomialFunction1D derivativeResult3 = f.derivative();
    assertArrayEquals(
        new double[] {20.0d, 0.0d, 120.0d, 0.0d, 300.0d, 0.0d},
        derivativeResult3.derivative().getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 20.0d, 0.0d, 40.0d, 0.0d, 60.0d, 0.0d},
        derivativeResult3.getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {1.0E-15d, 0.0d, 3.0000000000000002E-15d, -40.0d, -0.0d, -60.0d, -0.0d},
        ((RealPolynomialFunction1D) derivativeResult2).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.0E-15d, 0.0d, 1.0E-15d, -10.0d, -0.0d, -10.0d, -0.0d},
        ((RealPolynomialFunction1D) actualSubtractResult).getCoefficients(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d},
        f.getCoefficients(),
        0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#subtract(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>Then return applyAsDouble ten is zero.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#subtract(DoubleFunction1D)}
   */
  @Test
  @DisplayName("Test subtract(DoubleFunction1D) with 'f'; then return applyAsDouble ten is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.subtract(DoubleFunction1D)"})
  void testSubtractWithF_thenReturnApplyAsDoubleTenIsZero() {
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
    assertEquals(realPolynomialFunction1D, f);
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
   * Test {@link RealPolynomialFunction1D#subtract(DoubleFunction1D)} with {@code f}.
   *
   * <ul>
   *   <li>When {@link DoubleFunction1D}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#subtract(DoubleFunction1D)}
   */
  @Test
  @DisplayName("Test subtract(DoubleFunction1D) with 'f'; when DoubleFunction1D")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleFunction1D RealPolynomialFunction1D.subtract(DoubleFunction1D)"})
  void testSubtractWithF_whenDoubleFunction1D() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    realPolynomialFunction1D.subtract(mock(DoubleFunction1D.class));

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
   * Test {@link RealPolynomialFunction1D#toMonic()}.
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#toMonic()}
   */
  @Test
  @DisplayName("Test toMonic()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealPolynomialFunction1D RealPolynomialFunction1D.toMonic()"})
  void testToMonic() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act
    RealPolynomialFunction1D actualToMonicResult = realPolynomialFunction1D.toMonic();

    // Assert
    RealPolynomialFunction1D derivativeResult = actualToMonicResult.derivative();
    RealPolynomialFunction1D derivativeResult2 = derivativeResult.derivative();
    assertArrayEquals(new double[] {6.0d}, derivativeResult2.derivative().getCoefficients(), 0.0);
    assertArrayEquals(new double[] {2.0E16d, 6.0d}, derivativeResult2.getCoefficients(), 0.0);
    assertArrayEquals(new double[] {1.0d, 2.0E16d, 3.0d}, derivativeResult.getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {1.0E16d, 1.0d, 1.0E16d, 1.0d}, actualToMonicResult.getCoefficients(), 0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#toMonic()}.
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#toMonic()}
   */
  @Test
  @DisplayName("Test toMonic()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealPolynomialFunction1D RealPolynomialFunction1D.toMonic()"})
  void testToMonic2() {
    // Arrange and Act
    RealPolynomialFunction1D actualToMonicResult =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, Double.NaN).toMonic();

    // Assert
    RealPolynomialFunction1D derivativeResult = actualToMonicResult.derivative();
    RealPolynomialFunction1D derivativeResult2 = derivativeResult.derivative();
    assertArrayEquals(
        new double[] {Double.NaN}, derivativeResult2.derivative().getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN}, derivativeResult2.getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN}, derivativeResult.getCoefficients(), 0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN},
        actualToMonicResult.getCoefficients(),
        0.0);
  }

  /**
   * Test {@link RealPolynomialFunction1D#toMonic()}.
   *
   * <ul>
   *   <li>Then return {@link RealPolynomialFunction1D#RealPolynomialFunction1D(double[])} with
   *       coefficients is ten and {@code 1.0E-15}.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#toMonic()}
   */
  @Test
  @DisplayName(
      "Test toMonic(); then return RealPolynomialFunction1D(double[]) with coefficients is ten and '1.0E-15'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealPolynomialFunction1D RealPolynomialFunction1D.toMonic()"})
  void testToMonic_thenReturnRealPolynomialFunction1DWithCoefficientsIsTenAnd10e15() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0d);

    // Act
    RealPolynomialFunction1D actualToMonicResult = realPolynomialFunction1D.toMonic();

    // Assert
    assertEquals(realPolynomialFunction1D, actualToMonicResult);
  }

  /**
   * Test {@link RealPolynomialFunction1D#equals(Object)}, and {@link
   * RealPolynomialFunction1D#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RealPolynomialFunction1D#equals(Object)}
   *   <li>{@link RealPolynomialFunction1D#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RealPolynomialFunction1D.equals(Object)",
    "int RealPolynomialFunction1D.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);
    RealPolynomialFunction1D realPolynomialFunction1D2 =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act and Assert
    assertEquals(realPolynomialFunction1D, realPolynomialFunction1D2);
    assertEquals(realPolynomialFunction1D.hashCode(), realPolynomialFunction1D2.hashCode());
  }

  /**
   * Test {@link RealPolynomialFunction1D#equals(Object)}, and {@link
   * RealPolynomialFunction1D#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link RealPolynomialFunction1D#equals(Object)}
   *   <li>{@link RealPolynomialFunction1D#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RealPolynomialFunction1D.equals(Object)",
    "int RealPolynomialFunction1D.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act and Assert
    assertEquals(realPolynomialFunction1D, realPolynomialFunction1D);
    int expectedHashCodeResult = realPolynomialFunction1D.hashCode();
    assertEquals(expectedHashCodeResult, realPolynomialFunction1D.hashCode());
  }

  /**
   * Test {@link RealPolynomialFunction1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RealPolynomialFunction1D.equals(Object)",
    "int RealPolynomialFunction1D.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    RealPolynomialFunction1D realPolynomialFunction1D =
        new RealPolynomialFunction1D(
            10.0d, 1.0E-15d, 10.0d, 1.0E-15d, 10.0d, 1.0E-15d, 10.0d, 1.0E-15d);

    // Act and Assert
    assertNotEquals(
        realPolynomialFunction1D, new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d));
  }

  /**
   * Test {@link RealPolynomialFunction1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RealPolynomialFunction1D.equals(Object)",
    "int RealPolynomialFunction1D.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d), null);
  }

  /**
   * Test {@link RealPolynomialFunction1D#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link RealPolynomialFunction1D#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean RealPolynomialFunction1D.equals(Object)",
    "int RealPolynomialFunction1D.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        new RealPolynomialFunction1D(10.0d, 1.0E-15d, 10.0d, 1.0E-15d),
        "Different type to RealPolynomialFunction1D");
  }
}
