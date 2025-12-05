package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HermiteCoefficientsProviderDiffblueTest {
  /**
   * Test {@link HermiteCoefficientsProvider#solve(double[], double[], double[], double[],
   * double[])} with {@code values}, {@code intervals}, {@code slopes}, {@code first}, {@code
   * second}.
   *
   * <ul>
   *   <li>Then return array length is four.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#solve(double[], double[], double[],
   * double[], double[])}
   */
  @Test
  @DisplayName(
      "Test solve(double[], double[], double[], double[], double[]) with 'values', 'intervals', 'slopes', 'first', 'second'; then return array length is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[][] HermiteCoefficientsProvider.solve(double[], double[], double[], double[], double[])"
  })
  void testSolveWithValuesIntervalsSlopesFirstSecond_thenReturnArrayLengthIsFour() {
    // Arrange and Act
    double[][] actualSolveResult =
        new HermiteCoefficientsProvider()
            .solve(
                new double[] {10.0d, 3.0d, 10.0d, 3.0d},
                new double[] {10.0d, 3.0d, 10.0d, 3.0d},
                new double[] {10.0d, 3.0d, 10.0d, 3.0d},
                new double[] {0.5d, 3.0d, 0.5d, 3.0d, 0.5d, 3.0d, 0.5d, 3.0d},
                new double[] {0.5d, 3.0d, 0.5d, 3.0d, 0.5d, 3.0d, 0.5d, 3.0d});

    // Assert
    assertEquals(4, actualSolveResult.length);
    assertArrayEquals(
        new double[] {0.006200000000000001d, -0.1475d, 0.9249999999999999d, 0.25d, 0.5d, 10.0d},
        actualSolveResult[0],
        0.0);
    assertArrayEquals(
        new double[] {0.006200000000000001d, -0.1475d, 0.9249999999999999d, 0.25d, 0.5d, 10.0d},
        actualSolveResult[2],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0462962962962963d, -0.20370370370370372d, -0.3055555555555556d, 1.5d, 3.0d, 3.0d
        },
        actualSolveResult[1],
        0.0);
    assertArrayEquals(
        new double[] {
          0.0462962962962963d, -0.20370370370370372d, -0.3055555555555556d, 1.5d, 3.0d, 3.0d
        },
        actualSolveResult[3],
        0.0);
  }

  /**
   * Test {@link HermiteCoefficientsProvider#solve(double[], double[], double[], double[],
   * double[])} with {@code values}, {@code intervals}, {@code slopes}, {@code first}, {@code
   * second}.
   *
   * <ul>
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#solve(double[], double[], double[],
   * double[], double[])}
   */
  @Test
  @DisplayName(
      "Test solve(double[], double[], double[], double[], double[]) with 'values', 'intervals', 'slopes', 'first', 'second'; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[][] HermiteCoefficientsProvider.solve(double[], double[], double[], double[], double[])"
  })
  void testSolveWithValuesIntervalsSlopesFirstSecond_thenReturnArrayLengthIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0,
        new HermiteCoefficientsProvider()
            .solve(
                new double[] {10.0d, 3.0d, 10.0d, 3.0d},
                new double[] {},
                new double[] {10.0d, 3.0d, 10.0d, 3.0d},
                new double[] {10.0d, 3.0d, 10.0d, 3.0d},
                new double[] {10.0d, 3.0d, 10.0d, 3.0d})
            .length);
  }

  /**
   * Test {@link HermiteCoefficientsProvider#solve(double[], double[], double[], double[])} with
   * {@code values}, {@code intervals}, {@code slopes}, {@code first}.
   *
   * <ul>
   *   <li>Then return array length is four.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#solve(double[], double[], double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test solve(double[], double[], double[], double[]) with 'values', 'intervals', 'slopes', 'first'; then return array length is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[][] HermiteCoefficientsProvider.solve(double[], double[], double[], double[])"
  })
  void testSolveWithValuesIntervalsSlopesFirst_thenReturnArrayLengthIsFour() {
    // Arrange and Act
    double[][] actualSolveResult =
        new HermiteCoefficientsProvider()
            .solve(
                new double[] {10.0d, 3.0d, 10.0d, 3.0d},
                new double[] {10.0d, 3.0d, 10.0d, 3.0d},
                new double[] {10.0d, 3.0d, 10.0d, 3.0d},
                new double[] {3.0d, 2.0d, 3.0d, 2.0d, 3.0d, 2.0d, 3.0d, 2.0d});

    // Assert
    assertEquals(4, actualSolveResult.length);
    assertArrayEquals(
        new double[] {-0.1111111111111111d, 0.6666666666666666d, 2.0d, 3.0d},
        actualSolveResult[1],
        0.0);
    assertArrayEquals(
        new double[] {-0.1111111111111111d, 0.6666666666666666d, 2.0d, 3.0d},
        actualSolveResult[3],
        0.0);
    assertArrayEquals(new double[] {-0.15d, 2.2d, 3.0d, 10.0d}, actualSolveResult[0], 0.0);
    assertArrayEquals(new double[] {-0.15d, 2.2d, 3.0d, 10.0d}, actualSolveResult[2], 0.0);
  }

  /**
   * Test {@link HermiteCoefficientsProvider#solve(double[], double[], double[], double[])} with
   * {@code values}, {@code intervals}, {@code slopes}, {@code first}.
   *
   * <ul>
   *   <li>Then return array length is zero.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#solve(double[], double[], double[],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test solve(double[], double[], double[], double[]) with 'values', 'intervals', 'slopes', 'first'; then return array length is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double[][] HermiteCoefficientsProvider.solve(double[], double[], double[], double[])"
  })
  void testSolveWithValuesIntervalsSlopesFirst_thenReturnArrayLengthIsZero() {
    // Arrange, Act and Assert
    assertEquals(
        0,
        new HermiteCoefficientsProvider()
            .solve(
                new double[] {10.0d, 3.0d, 10.0d, 3.0d},
                new double[] {},
                new double[] {10.0d, 3.0d, 10.0d, 3.0d},
                new double[] {10.0d, 3.0d, 10.0d, 3.0d})
            .length);
  }

  /**
   * Test {@link HermiteCoefficientsProvider#intervalsCalculator(double[])}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with minus seven and seven.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#intervalsCalculator(double[])}
   */
  @Test
  @DisplayName(
      "Test intervalsCalculator(double[]); then return array of double with minus seven and seven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] HermiteCoefficientsProvider.intervalsCalculator(double[])"})
  void testIntervalsCalculator_thenReturnArrayOfDoubleWithMinusSevenAndSeven() {
    // Arrange and Act
    double[] actualIntervalsCalculatorResult =
        new HermiteCoefficientsProvider()
            .intervalsCalculator(new double[] {10.0d, 3.0d, 10.0d, 3.0d});

    // Assert
    assertArrayEquals(new double[] {-7.0d, 7.0d, -7.0d}, actualIntervalsCalculatorResult, 0.0);
  }

  /**
   * Test {@link HermiteCoefficientsProvider#slopesCalculator(double[], double[])}.
   *
   * <ul>
   *   <li>Then return array of {@code double} with {@code -0.7} and {@code 2.3333333333333335}.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#slopesCalculator(double[], double[])}
   */
  @Test
  @DisplayName(
      "Test slopesCalculator(double[], double[]); then return array of double with '-0.7' and '2.3333333333333335'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] HermiteCoefficientsProvider.slopesCalculator(double[], double[])"})
  void testSlopesCalculator_thenReturnArrayOfDoubleWith07And23333333333333335() {
    // Arrange and Act
    double[] actualSlopesCalculatorResult =
        new HermiteCoefficientsProvider()
            .slopesCalculator(
                new double[] {10.0d, 3.0d, 10.0d, 3.0d}, new double[] {10.0d, 3.0d, 10.0d, 3.0d});

    // Assert
    assertArrayEquals(
        new double[] {-0.7d, 2.3333333333333335d, -0.7d}, actualSlopesCalculatorResult, 0.0);
  }

  /**
   * Test {@link HermiteCoefficientsProvider#slopeSensitivityCalculator(double[])}.
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#slopeSensitivityCalculator(double[])}
   */
  @Test
  @DisplayName("Test slopeSensitivityCalculator(double[])")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] HermiteCoefficientsProvider.slopeSensitivityCalculator(double[])"})
  void testSlopeSensitivityCalculator() {
    // Arrange and Act
    double[][] actualSlopeSensitivityCalculatorResult =
        new HermiteCoefficientsProvider()
            .slopeSensitivityCalculator(new double[] {10.0d, 3.0d, 10.0d, 3.0d});

    // Assert
    assertEquals(4, actualSlopeSensitivityCalculatorResult.length);
    assertArrayEquals(
        new double[] {-0.1d, 0.1d, 0.0d, 0.0d, 0.0d},
        actualSlopeSensitivityCalculatorResult[0],
        0.0);
    assertArrayEquals(
        new double[] {0.0d, -0.3333333333333333d, 0.3333333333333333d, 0.0d, 0.0d},
        actualSlopeSensitivityCalculatorResult[1],
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, -0.1d, 0.1d, 0.0d},
        actualSlopeSensitivityCalculatorResult[2],
        0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, -0.3333333333333333d, 0.3333333333333333d},
        actualSlopeSensitivityCalculatorResult[3],
        0.0);
  }

  /**
   * Test {@link HermiteCoefficientsProvider#endpointDerivatives(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code -1.5}.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#endpointDerivatives(double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test endpointDerivatives(double, double, double, double); when '-0.5'; then return '-1.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HermiteCoefficientsProvider.endpointDerivatives(double, double, double, double)"
  })
  void testEndpointDerivatives_when05_thenReturn15() {
    // Arrange, Act and Assert
    assertEquals(
        -1.5d, new HermiteCoefficientsProvider().endpointDerivatives(10.0d, 10.0d, -0.5d, 10.0d));
  }

  /**
   * Test {@link HermiteCoefficientsProvider#endpointDerivatives(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code 15.25}.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#endpointDerivatives(double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test endpointDerivatives(double, double, double, double); when '-0.5'; then return '15.25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HermiteCoefficientsProvider.endpointDerivatives(double, double, double, double)"
  })
  void testEndpointDerivatives_when05_thenReturn1525() {
    // Arrange, Act and Assert
    assertEquals(
        15.25d, new HermiteCoefficientsProvider().endpointDerivatives(10.0d, 10.0d, 10.0d, -0.5d));
  }

  /**
   * Test {@link HermiteCoefficientsProvider#endpointDerivatives(double, double, double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#endpointDerivatives(double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test endpointDerivatives(double, double, double, double); when one; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HermiteCoefficientsProvider.endpointDerivatives(double, double, double, double)"
  })
  void testEndpointDerivatives_whenOne_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d, new HermiteCoefficientsProvider().endpointDerivatives(1.0d, 10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link HermiteCoefficientsProvider#endpointDerivatives(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#endpointDerivatives(double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test endpointDerivatives(double, double, double, double); when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HermiteCoefficientsProvider.endpointDerivatives(double, double, double, double)"
  })
  void testEndpointDerivatives_whenTen_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d, new HermiteCoefficientsProvider().endpointDerivatives(10.0d, 10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link HermiteCoefficientsProvider#endpointDerivatives(double, double, double, double)}.
   *
   * <ul>
   *   <li>When three.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#endpointDerivatives(double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test endpointDerivatives(double, double, double, double); when three; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HermiteCoefficientsProvider.endpointDerivatives(double, double, double, double)"
  })
  void testEndpointDerivatives_whenThree_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d, new HermiteCoefficientsProvider().endpointDerivatives(3.0d, 10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link HermiteCoefficientsProvider#endpointDerivatives(double, double, double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#endpointDerivatives(double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test endpointDerivatives(double, double, double, double); when two; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HermiteCoefficientsProvider.endpointDerivatives(double, double, double, double)"
  })
  void testEndpointDerivatives_whenTwo_thenReturnTen() {
    // Arrange, Act and Assert
    assertEquals(
        10.0d, new HermiteCoefficientsProvider().endpointDerivatives(2.0d, 10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link HermiteCoefficientsProvider#endpointDerivatives(double, double, double, double)}.
   *
   * <ul>
   *   <li>When two.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link HermiteCoefficientsProvider#endpointDerivatives(double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test endpointDerivatives(double, double, double, double); when two; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HermiteCoefficientsProvider.endpointDerivatives(double, double, double, double)"
  })
  void testEndpointDerivatives_whenTwo_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d, new HermiteCoefficientsProvider().endpointDerivatives(10.0d, 10.0d, 2.0d, 10.0d));
  }
}
