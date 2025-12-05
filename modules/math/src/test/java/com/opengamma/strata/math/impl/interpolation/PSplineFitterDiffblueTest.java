package com.opengamma.strata.math.impl.interpolation;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.statistics.leastsquare.GeneralizedLeastSquareResults;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class PSplineFitterDiffblueTest {
  /**
   * Test {@link PSplineFitter#solve(List, List, List, double, double, int, int, double, int)} with
   * {@code List}, {@code List}, {@code List}, {@code double}, {@code double}, {@code int}, {@code
   * int}, {@code double}, {@code int}.
   *
   * <p>Method under test: {@link PSplineFitter#solve(List, List, List, double, double, int, int,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, double, double, int, int, double, int) with 'List', 'List', 'List', 'double', 'double', 'int', 'int', 'double', 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults PSplineFitter.solve(List, List, List, double, double, int, int, double, int)"
  })
  void testSolveWithListListListDoubleDoubleIntIntDoubleInt() {
    // Arrange
    PSplineFitter pSplineFitter = new PSplineFitter();

    ArrayList<Double> x = new ArrayList<>();
    x.add(1.0d);

    ArrayList<Double> y = new ArrayList<>();
    y.add(1.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(1.0d);

    // Act
    GeneralizedLeastSquareResults<Double> actualSolveResult =
        pSplineFitter.solve(x, y, sigma, 0.5d, 10.0d, 2, 1, 10.0d, 1);

    // Assert
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.9999999999999979d, fitParameters.min());
    List<Double> toListResult = fitParameters.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.9999999999999979d, toListResult.get(1).doubleValue());
    assertEquals(0.999999999999998d, fitParameters.max());
    assertEquals(0.999999999999998d, toListResult.get(0).doubleValue());
    assertEquals(1.999999999999996d, fitParameters.sum());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(3.993608332681372E-30d, actualSolveResult.getChiSq());
    assertEquals(4.080055401662042d, covariance.total());
    assertArrayEquals(
        new double[] {0.9950138504155105d, 1.0897506925207732d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {0.999999999999998d, 0.9999999999999979d}, fitParameters.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {1.0002770083102475d, 0.9950138504155103d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PSplineFitter#solve(List, List, List, double, double, int, int, double, int)} with
   * {@code List}, {@code List}, {@code List}, {@code double}, {@code double}, {@code int}, {@code
   * int}, {@code double}, {@code int}.
   *
   * <p>Method under test: {@link PSplineFitter#solve(List, List, List, double, double, int, int,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, double, double, int, int, double, int) with 'List', 'List', 'List', 'double', 'double', 'int', 'int', 'double', 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults PSplineFitter.solve(List, List, List, double, double, int, int, double, int)"
  })
  void testSolveWithListListListDoubleDoubleIntIntDoubleInt2() {
    // Arrange
    PSplineFitter pSplineFitter = new PSplineFitter();

    ArrayList<Double> x = new ArrayList<>();
    x.add(0.5d);

    ArrayList<Double> y = new ArrayList<>();
    y.add(1.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(1.0d);

    // Act
    GeneralizedLeastSquareResults<Double> actualSolveResult =
        pSplineFitter.solve(x, y, sigma, 0.5d, 10.0d, 2, 1, 10.0d, 1);

    // Assert
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.9999999999999996d, fitParameters.min());
    List<Double> toListResult = fitParameters.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.9999999999999996d, toListResult.get(1).doubleValue());
    assertEquals(0.9999999999999997d, fitParameters.max());
    assertEquals(0.9999999999999997d, toListResult.get(0).doubleValue());
    assertEquals(1.1093356479670479E-31d, actualSolveResult.getChiSq());
    assertEquals(1.9999999999999991d, fitParameters.sum());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4.099999999999999d, covariance.total());
    assertArrayEquals(
        new double[] {0.9999999999999996d, 1.0999999999999996d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {0.9999999999999997d, 0.9999999999999996d},
        fitParameters.toArrayUnsafe(),
        0.0);
    assertArrayEquals(new double[] {0.9999999999999997d, 1.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PSplineFitter#solve(List, List, List, double, double, int, int, double, int)} with
   * {@code List}, {@code List}, {@code List}, {@code double}, {@code double}, {@code int}, {@code
   * int}, {@code double}, {@code int}.
   *
   * <p>Method under test: {@link PSplineFitter#solve(List, List, List, double, double, int, int,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, double, double, int, int, double, int) with 'List', 'List', 'List', 'double', 'double', 'int', 'int', 'double', 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults PSplineFitter.solve(List, List, List, double, double, int, int, double, int)"
  })
  void testSolveWithListListListDoubleDoubleIntIntDoubleInt3() {
    // Arrange
    PSplineFitter pSplineFitter = new PSplineFitter();

    ArrayList<Double> x = new ArrayList<>();
    x.add(10.0d);

    ArrayList<Double> y = new ArrayList<>();
    y.add(1.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(1.0d);

    // Act
    GeneralizedLeastSquareResults<Double> actualSolveResult =
        pSplineFitter.solve(x, y, sigma, 0.5d, 10.0d, 2, 1, 10.0d, 1);

    // Assert
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.9999999999999992d, fitParameters.min());
    List<Double> toListResult = fitParameters.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.9999999999999992d, toListResult.get(1).doubleValue());
    assertEquals(0.9999999999999993d, fitParameters.max());
    assertEquals(0.9999999999999993d, toListResult.get(0).doubleValue());
    assertEquals(1.9999999999999987d, fitParameters.sum());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4.099999999999997d, covariance.total());
    assertEquals(6.039716305598372E-31d, actualSolveResult.getChiSq());
    assertArrayEquals(
        new double[] {0.9999999999999991d, 0.9999999999999992d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {0.9999999999999993d, 0.9999999999999992d},
        fitParameters.toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {1.099999999999999d, 0.9999999999999993d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link PSplineFitter#solve(List, List, List, double, double, int, int, double, int)} with
   * {@code List}, {@code List}, {@code List}, {@code double}, {@code double}, {@code int}, {@code
   * int}, {@code double}, {@code int}.
   *
   * <p>Method under test: {@link PSplineFitter#solve(List, List, List, double, double, int, int,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, double, double, int, int, double, int) with 'List', 'List', 'List', 'double', 'double', 'int', 'int', 'double', 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults PSplineFitter.solve(List, List, List, double, double, int, int, double, int)"
  })
  void testSolveWithListListListDoubleDoubleIntIntDoubleInt4() {
    // Arrange
    PSplineFitter pSplineFitter = new PSplineFitter();

    ArrayList<Double> x = new ArrayList<>();
    x.add(1.0d);

    ArrayList<Double> y = new ArrayList<>();
    y.add(1.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(1.0d);

    // Act
    GeneralizedLeastSquareResults<Double> actualSolveResult =
        pSplineFitter.solve(x, y, sigma, 0.5d, 10.0d, 2, 1, 1.0d, 1);

    // Assert
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.9999999999999999d, fitParameters.min());
    List<Double> toListResult = fitParameters.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.9999999999999999d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, fitParameters.max());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(1.232595164407831E-32d, actualSolveResult.getChiSq());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(2.0d, fitParameters.sum());
    assertEquals(4.800554016620499d, covariance.total());
    assertArrayEquals(
        new double[] {0.9501385041551246d, 1.897506925207756d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {1.0027700831024933d, 0.9501385041551251d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {1.0d, 0.9999999999999999d}, fitParameters.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link PSplineFitter#solve(List, List, List, double, double, int, int, double, int)} with
   * {@code List}, {@code List}, {@code List}, {@code double}, {@code double}, {@code int}, {@code
   * int}, {@code double}, {@code int}.
   *
   * <p>Method under test: {@link PSplineFitter#solve(List, List, List, double, double, int, int,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, double, double, int, int, double, int) with 'List', 'List', 'List', 'double', 'double', 'int', 'int', 'double', 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults PSplineFitter.solve(List, List, List, double, double, int, int, double, int)"
  })
  void testSolveWithListListListDoubleDoubleIntIntDoubleInt5() {
    // Arrange
    PSplineFitter pSplineFitter = new PSplineFitter();

    ArrayList<Double> x = new ArrayList<>();
    x.add(1.0d);

    ArrayList<Double> y = new ArrayList<>();
    y.add(1.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(1.0d);

    // Act
    GeneralizedLeastSquareResults<Double> actualSolveResult =
        pSplineFitter.solve(x, y, sigma, 0.5d, 10.0d, 2, 1, 0.0d, 1);

    // Assert
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.05846153846153847d, fitParameters.min());
    List<Double> toListResult = fitParameters.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.05846153846153847d, toListResult.get(1).doubleValue());
    assertEquals(1.0523076923076926d, fitParameters.max());
    assertEquals(1.0523076923076926d, toListResult.get(0).doubleValue());
    assertEquals(1.1107692307692312d, fitParameters.sum());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(1.233808284023669d, covariance.total());
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4.930380657631324E-32d, actualSolveResult.getChiSq());
    assertArrayEquals(
        new double[] {0.06151952662721894d, 0.003417751479289941d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {1.0523076923076926d, 0.05846153846153847d},
        fitParameters.toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {1.107351479289941d, 0.06151952662721895d}, toArrayUnsafeResult[0], 0.0);
  }
}
