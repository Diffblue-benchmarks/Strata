package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.regression.LeastSquaresRegressionResult;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PolynomialsLeastSquaresFitterDiffblueTest {
  /**
   * Test {@link PolynomialsLeastSquaresFitter#regress(double[], double[], int)} with {@code xData},
   * {@code yData}, {@code degree}.
   *
   * <p>Method under test: {@link PolynomialsLeastSquaresFitter#regress(double[], double[], int)}
   */
  @Test
  @DisplayName("Test regress(double[], double[], int) with 'xData', 'yData', 'degree'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquaresRegressionResult PolynomialsLeastSquaresFitter.regress(double[], double[], int)"
  })
  void testRegressWithXDataYDataDegree() {
    // Arrange and Act
    LeastSquaresRegressionResult actualRegressResult =
        new PolynomialsLeastSquaresFitter()
            .regress(
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                1);

    // Assert
    assertNull(actualRegressResult.getPValues());
    assertNull(actualRegressResult.getStandardErrorOfBetas());
    assertNull(actualRegressResult.getTStatistics());
    assertEquals(0.0d, actualRegressResult.getAdjustedRSquared());
    assertEquals(0.0d, actualRegressResult.getMeanSquareError());
    assertEquals(0.0d, actualRegressResult.getRSquared());
    assertTrue(actualRegressResult.hasIntercept());
    assertArrayEquals(
        new double[] {8.881784197001252E-16d, 0.9999999999999998d},
        actualRegressResult.getBetas(),
        0.0);
    assertArrayEquals(
        new double[] {0.0d, -6.661338147750939E-16d, 0.0d, -6.661338147750939E-16d},
        actualRegressResult.getResiduals(),
        0.0);
  }

  /**
   * Test {@link PolynomialsLeastSquaresFitter#regress(double[], double[], int)} with {@code xData},
   * {@code yData}, {@code degree}.
   *
   * <p>Method under test: {@link PolynomialsLeastSquaresFitter#regress(double[], double[], int)}
   */
  @Test
  @DisplayName("Test regress(double[], double[], int) with 'xData', 'yData', 'degree'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquaresRegressionResult PolynomialsLeastSquaresFitter.regress(double[], double[], int)"
  })
  void testRegressWithXDataYDataDegree2() {
    // Arrange and Act
    LeastSquaresRegressionResult actualRegressResult =
        new PolynomialsLeastSquaresFitter()
            .regress(
                new double[] {1.0E9d, 1.0d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                1);

    // Assert
    assertNull(actualRegressResult.getPValues());
    assertNull(actualRegressResult.getStandardErrorOfBetas());
    assertNull(actualRegressResult.getTStatistics());
    assertEquals(0.0d, actualRegressResult.getAdjustedRSquared());
    assertEquals(0.0d, actualRegressResult.getMeanSquareError());
    assertEquals(0.0d, actualRegressResult.getRSquared());
    assertTrue(actualRegressResult.hasIntercept());
    assertArrayEquals(
        new double[] {3.9999999579999983d, 6.000000096000004E-9d},
        actualRegressResult.getBetas(),
        0.0);
    assertArrayEquals(
        new double[] {
          -5.4000002691623195E-8d, -2.9999999639999984d, 5.999999982000001d, -2.9999999639999984d
        },
        actualRegressResult.getResiduals(),
        0.0);
  }

  /**
   * Test {@link PolynomialsLeastSquaresFitter#regress(double[], double[], int)} with {@code xData},
   * {@code yData}, {@code degree}.
   *
   * <p>Method under test: {@link PolynomialsLeastSquaresFitter#regress(double[], double[], int)}
   */
  @Test
  @DisplayName("Test regress(double[], double[], int) with 'xData', 'yData', 'degree'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquaresRegressionResult PolynomialsLeastSquaresFitter.regress(double[], double[], int)"
  })
  void testRegressWithXDataYDataDegree3() {
    // Arrange and Act
    LeastSquaresRegressionResult actualRegressResult =
        new PolynomialsLeastSquaresFitter()
            .regress(
                new double[] {0.5d, 1.0d, 10.0d, 1.0d}, new double[] {10.0d, 1.0d, 10.0d, 1.0d}, 2);

    // Assert
    assertNull(actualRegressResult.getPValues());
    assertNull(actualRegressResult.getStandardErrorOfBetas());
    assertNull(actualRegressResult.getTStatistics());
    assertEquals(0.0d, actualRegressResult.getAdjustedRSquared());
    assertEquals(0.0d, actualRegressResult.getMeanSquareError());
    assertEquals(0.0d, actualRegressResult.getRSquared());
    assertTrue(actualRegressResult.hasIntercept());
    assertArrayEquals(
        new double[] {20.00000000000007d, -21.00000000000011d, 2.0000000000000107d},
        actualRegressResult.getBetas(),
        0.0);
    assertArrayEquals(
        new double[] {
          -1.7763568394002505E-14d,
          2.842170943040401E-14d,
          -5.684341886080802E-14d,
          2.842170943040401E-14d
        },
        actualRegressResult.getResiduals(),
        0.0);
  }

  /**
   * Test {@link PolynomialsLeastSquaresFitter#regress(double[], double[], int)} with {@code xData},
   * {@code yData}, {@code degree}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Betas is array of {@code double} with {@code 5.5}.
   * </ul>
   *
   * <p>Method under test: {@link PolynomialsLeastSquaresFitter#regress(double[], double[], int)}
   */
  @Test
  @DisplayName(
      "Test regress(double[], double[], int) with 'xData', 'yData', 'degree'; when zero; then return Betas is array of double with '5.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "LeastSquaresRegressionResult PolynomialsLeastSquaresFitter.regress(double[], double[], int)"
  })
  void testRegressWithXDataYDataDegree_whenZero_thenReturnBetasIsArrayOfDoubleWith55() {
    // Arrange and Act
    LeastSquaresRegressionResult actualRegressResult =
        new PolynomialsLeastSquaresFitter()
            .regress(
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                0);

    // Assert
    assertNull(actualRegressResult.getPValues());
    assertNull(actualRegressResult.getStandardErrorOfBetas());
    assertNull(actualRegressResult.getTStatistics());
    assertEquals(0.0d, actualRegressResult.getAdjustedRSquared());
    assertEquals(0.0d, actualRegressResult.getMeanSquareError());
    assertEquals(0.0d, actualRegressResult.getRSquared());
    assertTrue(actualRegressResult.hasIntercept());
    assertArrayEquals(new double[] {5.5d}, actualRegressResult.getBetas(), 0.0);
    assertArrayEquals(
        new double[] {4.5d, -4.5d, 4.5d, -4.5d}, actualRegressResult.getResiduals(), 0.0);
  }

  /**
   * Test {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[], int, boolean)}.
   *
   * <ul>
   *   <li>Then return RMat total is {@code 0.1307928454612808}.
   * </ul>
   *
   * <p>Method under test: {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[],
   * int, boolean)}
   */
  @Test
  @DisplayName(
      "Test regressVerbose(double[], double[], int, boolean); then return RMat total is '0.1307928454612808'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PolynomialsLeastSquaresFitterResult PolynomialsLeastSquaresFitter.regressVerbose(double[], double[], int, boolean)"
  })
  void testRegressVerbose_thenReturnRMatTotalIs01307928454612808() {
    // Arrange and Act
    PolynomialsLeastSquaresFitterResult actualRegressVerboseResult =
        new PolynomialsLeastSquaresFitter()
            .regressVerbose(
                new double[] {0.5d, 1.0d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                2,
                true);

    // Assert
    DoubleMatrix rMat = actualRegressVerboseResult.getRMat();
    assertEquals(0.1307928454612808d, rMat.total());
    assertEquals(3.592459381734991E-14d, actualRegressVerboseResult.getDiffNorm());
    double[][] toArrayUnsafeResult = rMat.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {3.125d, 4.589389937671455d}, actualRegressVerboseResult.getMeanAndStd(), 0.0);
    assertArrayEquals(
        new double[] {-2.0d, 0.0d, -1.4999999999999998d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(
        new double[] {-26.093749999999968d, -39.009814470207345d, 42.124999999999964d},
        actualRegressVerboseResult.getCoeff(),
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.18054922000014464d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.7320508075688772d, 1.718192817892259d}, toArrayUnsafeResult[1], 0.0);
  }

  /**
   * Test {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[], int, boolean)}.
   *
   * <ul>
   *   <li>Then return RMat total is {@code -1.888840524086862}.
   * </ul>
   *
   * <p>Method under test: {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[],
   * int, boolean)}
   */
  @Test
  @DisplayName(
      "Test regressVerbose(double[], double[], int, boolean); then return RMat total is '-1.888840524086862'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PolynomialsLeastSquaresFitterResult PolynomialsLeastSquaresFitter.regressVerbose(double[], double[], int, boolean)"
  })
  void testRegressVerbose_thenReturnRMatTotalIs1888840524086862() {
    // Arrange and Act
    PolynomialsLeastSquaresFitterResult actualRegressVerboseResult =
        new PolynomialsLeastSquaresFitter()
            .regressVerbose(
                new double[] {10.0d, 0.5d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                2,
                true);

    // Assert
    DoubleMatrix rMat = actualRegressVerboseResult.getRMat();
    assertEquals(-1.888840524086862d, rMat.total());
    double[][] toArrayUnsafeResult = rMat.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertEquals(4.021398830883446E-15d, actualRegressVerboseResult.getDiffNorm());
    assertArrayEquals(
        new double[] {5.375d, 5.344389581607987d}, actualRegressVerboseResult.getMeanAndStd(), 0.0);
    assertArrayEquals(new double[] {-2.0d, 0.0d, -1.5d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, -0.11433157012929418d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.7320508075688772d, -0.006559761526444927d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {3.2450657894736965d, 5.203747750513043d, 3.006578947368405d},
        actualRegressVerboseResult.getCoeff(),
        0.0);
  }

  /**
   * Test {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[], int, boolean)}.
   *
   * <ul>
   *   <li>Then return RMat total is {@code -0.035898355468368656}.
   * </ul>
   *
   * <p>Method under test: {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[],
   * int, boolean)}
   */
  @Test
  @DisplayName(
      "Test regressVerbose(double[], double[], int, boolean); then return RMat total is '-0.035898355468368656'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PolynomialsLeastSquaresFitterResult PolynomialsLeastSquaresFitter.regressVerbose(double[], double[], int, boolean)"
  })
  void testRegressVerbose_thenReturnRMatTotalIs0035898355468368656() {
    // Arrange and Act
    PolynomialsLeastSquaresFitterResult actualRegressVerboseResult =
        new PolynomialsLeastSquaresFitter()
            .regressVerbose(
                new double[] {1.0E9d, 1.0d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                2,
                true);

    // Assert
    DoubleMatrix rMat = actualRegressVerboseResult.getRMat();
    assertEquals(-0.035898355468368656d, rMat.total());
    assertEquals(3.5824821234259925E-7d, actualRegressVerboseResult.getDiffNorm());
    double[][] toArrayUnsafeResult = rMat.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertArrayEquals(
        new double[] {2.50000003E8d, 4.99999998E8d},
        actualRegressVerboseResult.getMeanAndStd(),
        0.0);
    assertArrayEquals(
        new double[] {-2.0d, -2.220446049250313E-16d, -1.5d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 2.9393876954810705E-8d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {0.0d, 1.7320508075688774d, 1.732050807568877d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {1.8750000411083415E8d, 2.5000000114777887E8d, -2.4999999814777893E8d},
        actualRegressVerboseResult.getCoeff(),
        0.0);
  }

  /**
   * Test {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[], int, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return RMat total is minus four.
   * </ul>
   *
   * <p>Method under test: {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[],
   * int, boolean)}
   */
  @Test
  @DisplayName(
      "Test regressVerbose(double[], double[], int, boolean); when 'false'; then return RMat total is minus four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PolynomialsLeastSquaresFitterResult PolynomialsLeastSquaresFitter.regressVerbose(double[], double[], int, boolean)"
  })
  void testRegressVerbose_whenFalse_thenReturnRMatTotalIsMinusFour() {
    // Arrange and Act
    PolynomialsLeastSquaresFitterResult actualRegressVerboseResult =
        new PolynomialsLeastSquaresFitter()
            .regressVerbose(
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                1,
                false);

    // Assert
    DoubleMatrix rMat = actualRegressVerboseResult.getRMat();
    assertEquals(-4.0d, rMat.total());
    double[][] toArrayUnsafeResult = rMat.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertEquals(9.42055475210265E-16d, actualRegressVerboseResult.getDiffNorm());
    assertArrayEquals(new double[] {-2.0d, -11.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(new double[] {0.0d, 9.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {8.881784197001252E-16d, 0.9999999999999998d},
        actualRegressVerboseResult.getCoeff(),
        0.0);
  }

  /**
   * Test {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[], int, boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return RMat total is {@code -0.2679491924311228}.
   * </ul>
   *
   * <p>Method under test: {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[],
   * int, boolean)}
   */
  @Test
  @DisplayName(
      "Test regressVerbose(double[], double[], int, boolean); when one; then return RMat total is '-0.2679491924311228'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PolynomialsLeastSquaresFitterResult PolynomialsLeastSquaresFitter.regressVerbose(double[], double[], int, boolean)"
  })
  void testRegressVerbose_whenOne_thenReturnRMatTotalIs02679491924311228() {
    // Arrange and Act
    PolynomialsLeastSquaresFitterResult actualRegressVerboseResult =
        new PolynomialsLeastSquaresFitter()
            .regressVerbose(
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                1,
                true);

    // Assert
    DoubleMatrix rMat = actualRegressVerboseResult.getRMat();
    assertEquals(-0.2679491924311228d, rMat.total());
    assertEquals(1.2560739669470201E-15d, actualRegressVerboseResult.getDiffNorm());
    double[][] toArrayUnsafeResult = rMat.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertArrayEquals(new double[] {-2.0d, -2.220446049250313E-16d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(new double[] {0.0d, 1.7320508075688772d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {5.499999999999999d, 5.196152422706632d},
        actualRegressVerboseResult.getCoeff(),
        0.0);
    assertArrayEquals(
        new double[] {5.5d, 5.196152422706632d}, actualRegressVerboseResult.getMeanAndStd(), 0.0);
  }

  /**
   * Test {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[], int, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return RMat total is minus two.
   * </ul>
   *
   * <p>Method under test: {@link PolynomialsLeastSquaresFitter#regressVerbose(double[], double[],
   * int, boolean)}
   */
  @Test
  @DisplayName(
      "Test regressVerbose(double[], double[], int, boolean); when zero; then return RMat total is minus two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "PolynomialsLeastSquaresFitterResult PolynomialsLeastSquaresFitter.regressVerbose(double[], double[], int, boolean)"
  })
  void testRegressVerbose_whenZero_thenReturnRMatTotalIsMinusTwo() {
    // Arrange and Act
    PolynomialsLeastSquaresFitterResult actualRegressVerboseResult =
        new PolynomialsLeastSquaresFitter()
            .regressVerbose(
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                new double[] {10.0d, 1.0d, 10.0d, 1.0d},
                0,
                true);

    // Assert
    DoubleMatrix rMat = actualRegressVerboseResult.getRMat();
    assertEquals(-2.0d, rMat.total());
    assertEquals(3, actualRegressVerboseResult.getDof());
    assertEquals(4, rMat.size());
    double[][] toArrayUnsafeResult = rMat.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertEquals(9.0d, actualRegressVerboseResult.getDiffNorm());
    assertArrayEquals(new double[] {-2.0d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(new double[] {5.5d}, actualRegressVerboseResult.getCoeff(), 0.0);
    assertArrayEquals(
        new double[] {5.5d, 5.196152422706632d}, actualRegressVerboseResult.getMeanAndStd(), 0.0);
  }
}
