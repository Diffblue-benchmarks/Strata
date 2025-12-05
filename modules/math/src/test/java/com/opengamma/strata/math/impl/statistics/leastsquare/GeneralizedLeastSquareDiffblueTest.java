package com.opengamma.strata.math.impl.statistics.leastsquare;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.interpolation.BasisFunctionAggregation;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GeneralizedLeastSquareDiffblueTest {
  /**
   * Test {@link GeneralizedLeastSquare#solve(double[], double[], double[], List, double, int)} with
   * {@code double[]}, {@code double[]}, {@code double[]}, {@code List}, {@code double}, {@code
   * int}.
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(double[], double[], double[], List,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test solve(double[], double[], double[], List, double, int) with 'double[]', 'double[]', 'double[]', 'List', 'double', 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(double[], double[], double[], List, double, int)"
  })
  void testSolveWithDoubleDoubleDoubleListDoubleInt() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Double>any())).thenReturn(10.0d);

    ArrayList<Function<Double, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Double> actualSolveResult =
        generalizedLeastSquare.solve(
            new double[] {2.0d, 10.0d, 2.0d, 10.0d},
            new double[] {3.0d, 10.0d, 3.0d, 10.0d},
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            basisFunctions,
            10.0d,
            1);

    // Assert
    verify(function2, atLeast(1)).apply(Mockito.<Double>any());
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(0.004950495049504951d, covariance.total());
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.4965346534653463d, fitParameters.min());
    assertEquals(0.4965346534653472d, fitParameters.max());
    assertEquals(0.9702970297029703d, actualSolveResult.getChiSq());
    assertEquals(0.9930693069306935d, fitParameters.sum());
    assertEquals(2, fitParameters.size());
    assertEquals(2, fitParameters.toList().size());
    assertEquals(2, covariance.toArrayUnsafe().length);
    assertEquals(4, covariance.size());
    assertArrayEquals(
        new double[] {0.4965346534653463d, 0.4965346534653472d},
        fitParameters.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(double[], double[], double[], List, double, int)} with
   * {@code double[]}, {@code double[]}, {@code double[]}, {@code List}, {@code double}, {@code
   * int}.
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(double[], double[], double[], List,
   * double, int)}
   */
  @Test
  @DisplayName(
      "Test solve(double[], double[], double[], List, double, int) with 'double[]', 'double[]', 'double[]', 'List', 'double', 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(double[], double[], double[], List, double, int)"
  })
  void testSolveWithDoubleDoubleDoubleListDoubleInt2() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    Function<Double, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> function3 = mock(Function.class);
    when(function3.apply(Mockito.<Double>any())).thenReturn(10.0d);

    ArrayList<Function<Double, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function3);
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Double> actualSolveResult =
        generalizedLeastSquare.solve(
            new double[] {2.0d, 10.0d, 2.0d, 10.0d},
            new double[] {3.0d, 10.0d, 3.0d, 10.0d},
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            basisFunctions,
            10.0d,
            1);

    // Assert
    verify(function3, atLeast(1)).apply(Mockito.<Double>any());
    verify(function2, atLeast(1)).apply(Mockito.<Double>any());
    verify(function, atLeast(1)).apply(Mockito.<Double>any());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(0.004950495049504948d, covariance.total());
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.3310231023102297d, fitParameters.min());
    assertEquals(0.33102310231023324d, fitParameters.max());
    assertEquals(0.9702970297029704d, actualSolveResult.getChiSq());
    assertEquals(0.9930693069306957d, fitParameters.sum());
    assertEquals(3, fitParameters.size());
    assertEquals(3, fitParameters.toList().size());
    assertEquals(3, covariance.toArrayUnsafe().length);
    assertEquals(9, covariance.size());
    assertArrayEquals(
        new double[] {0.33102310231023324d, 0.3310231023102328d, 0.3310231023102297d},
        fitParameters.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(List, List, List, List, double, int)} with {@code
   * List}, {@code List}, {@code List}, {@code List}, {@code double}, {@code int}.
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(List, List, List, List, double, int)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, List, double, int) with 'List', 'List', 'List', 'List', 'double', 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(List, List, List, List, double, int)"
  })
  void testSolveWithListListListListDoubleInt() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    ArrayList<Object> x = new ArrayList<>();
    x.add("42");

    ArrayList<Double> y = new ArrayList<>();
    y.add(10.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(10.0d);

    Function<Object, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Object>any())).thenReturn(10.0d);

    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Object> actualSolveResult =
        generalizedLeastSquare.solve(x, y, sigma, basisFunctions, 10.0d, 1);

    // Assert
    verify(function2).apply(isA(Object.class));
    verify(function).apply(isA(Object.class));
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.5000000000000001d, fitParameters.max());
    assertEquals(0.5000000000000001d, fitParameters.min());
    List<Double> toListResult = fitParameters.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.5000000000000001d, toListResult.get(0).doubleValue());
    assertEquals(0.5000000000000001d, toListResult.get(1).doubleValue());
    assertEquals(2, fitParameters.size());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4, covariance.size());
    assertArrayEquals(
        new double[] {0.22500000000000006d, 0.2750000000000001d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {0.2750000000000001d, 0.22500000000000006d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(
        new double[] {0.5000000000000001d, 0.5000000000000001d},
        fitParameters.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(List, List, List, List, double, int)} with {@code
   * List}, {@code List}, {@code List}, {@code List}, {@code double}, {@code int}.
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(List, List, List, List, double, int)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, List, double, int) with 'List', 'List', 'List', 'List', 'double', 'int'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(List, List, List, List, double, int)"
  })
  void testSolveWithListListListListDoubleInt2() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    ArrayList<Object> x = new ArrayList<>();
    x.add("42");

    ArrayList<Double> y = new ArrayList<>();
    y.add(10.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(10.0d);

    Function<Object, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function3 = mock(Function.class);
    when(function3.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function4 = mock(Function.class);
    when(function4.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function5 = mock(Function.class);
    when(function5.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function6 = mock(Function.class);
    when(function6.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function7 = mock(Function.class);
    when(function7.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function8 = mock(Function.class);
    when(function8.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function9 = mock(Function.class);
    when(function9.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function10 = mock(Function.class);
    when(function10.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function11 = mock(Function.class);
    when(function11.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function12 = mock(Function.class);
    when(function12.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function13 = mock(Function.class);
    when(function13.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function14 = mock(Function.class);
    when(function14.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function15 = mock(Function.class);
    when(function15.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function16 = mock(Function.class);
    when(function16.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function17 = mock(Function.class);
    when(function17.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function18 = mock(Function.class);
    when(function18.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function19 = mock(Function.class);
    when(function19.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function20 = mock(Function.class);
    when(function20.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function21 = mock(Function.class);
    when(function21.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function22 = mock(Function.class);
    when(function22.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function23 = mock(Function.class);
    when(function23.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function24 = mock(Function.class);
    when(function24.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function25 = mock(Function.class);
    when(function25.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function26 = mock(Function.class);
    when(function26.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function27 = mock(Function.class);
    when(function27.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function28 = mock(Function.class);
    when(function28.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function29 = mock(Function.class);
    when(function29.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function30 = mock(Function.class);
    when(function30.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function31 = mock(Function.class);
    when(function31.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function32 = mock(Function.class);
    when(function32.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function33 = mock(Function.class);
    when(function33.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function34 = mock(Function.class);
    when(function34.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function35 = mock(Function.class);
    when(function35.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function36 = mock(Function.class);
    when(function36.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function37 = mock(Function.class);
    when(function37.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function38 = mock(Function.class);
    when(function38.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function39 = mock(Function.class);
    when(function39.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function40 = mock(Function.class);
    when(function40.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function41 = mock(Function.class);
    when(function41.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function42 = mock(Function.class);
    when(function42.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function43 = mock(Function.class);
    when(function43.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function44 = mock(Function.class);
    when(function44.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function45 = mock(Function.class);
    when(function45.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function46 = mock(Function.class);
    when(function46.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function47 = mock(Function.class);
    when(function47.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function48 = mock(Function.class);
    when(function48.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function49 = mock(Function.class);
    when(function49.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function50 = mock(Function.class);
    when(function50.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function51 = mock(Function.class);
    when(function51.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function52 = mock(Function.class);
    when(function52.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function53 = mock(Function.class);
    when(function53.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function54 = mock(Function.class);
    when(function54.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function55 = mock(Function.class);
    when(function55.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function56 = mock(Function.class);
    when(function56.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function57 = mock(Function.class);
    when(function57.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function58 = mock(Function.class);
    when(function58.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function59 = mock(Function.class);
    when(function59.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function60 = mock(Function.class);
    when(function60.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function61 = mock(Function.class);
    when(function61.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function62 = mock(Function.class);
    when(function62.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function63 = mock(Function.class);
    when(function63.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function64 = mock(Function.class);
    when(function64.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function65 = mock(Function.class);
    when(function65.apply(Mockito.<Object>any())).thenReturn(10.0d);

    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function65);
    basisFunctions.add(function64);
    basisFunctions.add(function63);
    basisFunctions.add(function62);
    basisFunctions.add(function61);
    basisFunctions.add(function60);
    basisFunctions.add(function59);
    basisFunctions.add(function58);
    basisFunctions.add(function57);
    basisFunctions.add(function56);
    basisFunctions.add(function55);
    basisFunctions.add(function54);
    basisFunctions.add(function53);
    basisFunctions.add(function52);
    basisFunctions.add(function51);
    basisFunctions.add(function50);
    basisFunctions.add(function49);
    basisFunctions.add(function48);
    basisFunctions.add(function47);
    basisFunctions.add(function46);
    basisFunctions.add(function45);
    basisFunctions.add(function44);
    basisFunctions.add(function43);
    basisFunctions.add(function42);
    basisFunctions.add(function41);
    basisFunctions.add(function40);
    basisFunctions.add(function39);
    basisFunctions.add(function38);
    basisFunctions.add(function37);
    basisFunctions.add(function36);
    basisFunctions.add(function35);
    basisFunctions.add(function34);
    basisFunctions.add(function33);
    basisFunctions.add(function32);
    basisFunctions.add(function31);
    basisFunctions.add(function30);
    basisFunctions.add(function29);
    basisFunctions.add(function28);
    basisFunctions.add(function27);
    basisFunctions.add(function26);
    basisFunctions.add(function25);
    basisFunctions.add(function24);
    basisFunctions.add(function23);
    basisFunctions.add(function22);
    basisFunctions.add(function21);
    basisFunctions.add(function20);
    basisFunctions.add(function19);
    basisFunctions.add(function18);
    basisFunctions.add(function17);
    basisFunctions.add(function16);
    basisFunctions.add(function15);
    basisFunctions.add(function14);
    basisFunctions.add(function13);
    basisFunctions.add(function12);
    basisFunctions.add(function11);
    basisFunctions.add(function10);
    basisFunctions.add(function9);
    basisFunctions.add(function8);
    basisFunctions.add(function7);
    basisFunctions.add(function6);
    basisFunctions.add(function5);
    basisFunctions.add(function4);
    basisFunctions.add(function3);
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Object> actualSolveResult =
        generalizedLeastSquare.solve(x, y, sigma, basisFunctions, 10.0d, 1);

    // Assert
    verify(function65).apply(isA(Object.class));
    verify(function64).apply(isA(Object.class));
    verify(function63).apply(isA(Object.class));
    verify(function62).apply(isA(Object.class));
    verify(function61).apply(isA(Object.class));
    verify(function60).apply(isA(Object.class));
    verify(function59).apply(isA(Object.class));
    verify(function58).apply(isA(Object.class));
    verify(function57).apply(isA(Object.class));
    verify(function56).apply(isA(Object.class));
    verify(function55).apply(isA(Object.class));
    verify(function54).apply(isA(Object.class));
    verify(function53).apply(isA(Object.class));
    verify(function52).apply(isA(Object.class));
    verify(function51).apply(isA(Object.class));
    verify(function50).apply(isA(Object.class));
    verify(function49).apply(isA(Object.class));
    verify(function48).apply(isA(Object.class));
    verify(function47).apply(isA(Object.class));
    verify(function46).apply(isA(Object.class));
    verify(function45).apply(isA(Object.class));
    verify(function44).apply(isA(Object.class));
    verify(function43).apply(isA(Object.class));
    verify(function42).apply(isA(Object.class));
    verify(function41).apply(isA(Object.class));
    verify(function40).apply(isA(Object.class));
    verify(function39).apply(isA(Object.class));
    verify(function38).apply(isA(Object.class));
    verify(function37).apply(isA(Object.class));
    verify(function36).apply(isA(Object.class));
    verify(function35).apply(isA(Object.class));
    verify(function34).apply(isA(Object.class));
    verify(function33).apply(isA(Object.class));
    verify(function32).apply(isA(Object.class));
    verify(function31).apply(isA(Object.class));
    verify(function30).apply(isA(Object.class));
    verify(function29).apply(isA(Object.class));
    verify(function28).apply(isA(Object.class));
    verify(function27).apply(isA(Object.class));
    verify(function26).apply(isA(Object.class));
    verify(function25).apply(isA(Object.class));
    verify(function24).apply(isA(Object.class));
    verify(function23).apply(isA(Object.class));
    verify(function22).apply(isA(Object.class));
    verify(function21).apply(isA(Object.class));
    verify(function20).apply(isA(Object.class));
    verify(function19).apply(isA(Object.class));
    verify(function18).apply(isA(Object.class));
    verify(function17).apply(isA(Object.class));
    verify(function16).apply(isA(Object.class));
    verify(function15).apply(isA(Object.class));
    verify(function14).apply(isA(Object.class));
    verify(function13).apply(isA(Object.class));
    verify(function12).apply(isA(Object.class));
    verify(function11).apply(isA(Object.class));
    verify(function10).apply(isA(Object.class));
    verify(function9).apply(isA(Object.class));
    verify(function8).apply(isA(Object.class));
    verify(function7).apply(isA(Object.class));
    verify(function6).apply(isA(Object.class));
    verify(function5).apply(isA(Object.class));
    verify(function4).apply(isA(Object.class));
    verify(function3).apply(isA(Object.class));
    verify(function2).apply(isA(Object.class));
    verify(function).apply(isA(Object.class));
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.015384615384574474d, fitParameters.min());
    assertEquals(0.015384615384640199d, fitParameters.max());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(0.999999999999984d, covariance.total());
    assertEquals(1.0000000000000104d, fitParameters.sum());
    assertEquals(1.135959703518257E-28d, actualSolveResult.getChiSq());
    assertEquals(4225, covariance.size());
    assertEquals(65, fitParameters.size());
    assertEquals(65, fitParameters.toList().size());
    assertEquals(65, fitParameters.toArrayUnsafe().length);
    assertEquals(65, covariance.toArrayUnsafe().length);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(List, List, List, List, double, int)} with {@code
   * List}, {@code List}, {@code List}, {@code List}, {@code double}, {@code int}.
   *
   * <ul>
   *   <li>Then return FitParameters toList size is four.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(List, List, List, List, double, int)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, List, double, int) with 'List', 'List', 'List', 'List', 'double', 'int'; then return FitParameters toList size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(List, List, List, List, double, int)"
  })
  void testSolveWithListListListListDoubleInt_thenReturnFitParametersToListSizeIsFour() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    ArrayList<Object> x = new ArrayList<>();
    x.add("42");

    ArrayList<Double> y = new ArrayList<>();
    y.add(10.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(10.0d);

    Function<Object, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function3 = mock(Function.class);
    when(function3.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function4 = mock(Function.class);
    when(function4.apply(Mockito.<Object>any())).thenReturn(10.0d);

    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function4);
    basisFunctions.add(function3);
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Object> actualSolveResult =
        generalizedLeastSquare.solve(x, y, sigma, basisFunctions, 10.0d, 1);

    // Assert
    verify(function4).apply(isA(Object.class));
    verify(function3).apply(isA(Object.class));
    verify(function2).apply(isA(Object.class));
    verify(function).apply(isA(Object.class));
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    List<Double> toListResult = fitParameters.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.24999999999999997d, toListResult.get(1).doubleValue());
    assertEquals(0.2499999999999999d, fitParameters.min());
    assertEquals(0.2499999999999999d, toListResult.get(3).doubleValue());
    assertEquals(0.2500000000000001d, toListResult.get(2).doubleValue());
    assertEquals(0.2500000000000002d, fitParameters.max());
    assertEquals(0.2500000000000002d, toListResult.get(0).doubleValue());
    assertEquals(4, fitParameters.size());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertEquals(Short.SIZE, covariance.size());
    assertArrayEquals(
        new double[] {-2.7755575615628914E-17d, 0.024999999999999953d, 0.07499999999999997d, 0.15d},
        toArrayUnsafeResult[3],
        0.0);
    assertArrayEquals(
        new double[] {
          0.02499999999999998d, 0.05000000000000002d, 0.10000000000000002d, 0.07500000000000007d
        },
        toArrayUnsafeResult[2],
        0.0);
    assertArrayEquals(
        new double[] {0.075d, 0.1d, 0.04999999999999998d, 0.024999999999999988d},
        toArrayUnsafeResult[1],
        0.0);
    assertArrayEquals(
        new double[] {
          0.15000000000000013d, 0.07500000000000014d, 0.025000000000000015d, -6.938893903907228E-17d
        },
        toArrayUnsafeResult[0],
        0.0);
    assertArrayEquals(
        new double[] {
          0.2500000000000002d, 0.24999999999999997d, 0.2500000000000001d, 0.2499999999999999d
        },
        fitParameters.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(List, List, List, List, int[], double[], int[])} with
   * {@code List}, {@code List}, {@code List}, {@code List}, {@code int[]}, {@code double[]}, {@code
   * int[]}.
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(List, List, List, List, int[],
   * double[], int[])}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, List, int[], double[], int[]) with 'List', 'List', 'List', 'List', 'int[]', 'double[]', 'int[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(List, List, List, List, int[], double[], int[])"
  })
  void testSolveWithListListListListIntDoubleInt() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    ArrayList<Object> x = new ArrayList<>();
    x.add("42");

    ArrayList<Double> y = new ArrayList<>();
    y.add(10.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(10.0d);

    Function<Object, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function3 = mock(Function.class);
    when(function3.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function4 = mock(Function.class);
    when(function4.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function5 = mock(Function.class);
    when(function5.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function6 = mock(Function.class);
    when(function6.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function7 = mock(Function.class);
    when(function7.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function8 = mock(Function.class);
    when(function8.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function9 = mock(Function.class);
    when(function9.apply(Mockito.<Object>any())).thenReturn(10.0d);

    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function9);
    basisFunctions.add(function8);
    basisFunctions.add(function7);
    basisFunctions.add(function6);
    basisFunctions.add(function5);
    basisFunctions.add(function4);
    basisFunctions.add(function3);
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Object> actualSolveResult =
        generalizedLeastSquare.solve(
            x,
            y,
            sigma,
            basisFunctions,
            new int[] {3, 1, 3, 1},
            new double[] {10.0d, 1.0d, 10.0d, 1.0d},
            new int[] {1, 0, 1, 0});

    // Assert
    verify(function9).apply(isA(Object.class));
    verify(function8).apply(isA(Object.class));
    verify(function7).apply(isA(Object.class));
    verify(function6).apply(isA(Object.class));
    verify(function5).apply(isA(Object.class));
    verify(function4).apply(isA(Object.class));
    verify(function3).apply(isA(Object.class));
    verify(function2).apply(isA(Object.class));
    verify(function).apply(isA(Object.class));
    assertTrue(actualSolveResult.getFunction() instanceof BasisFunctionAggregation);
    assertEquals(0.03305785123966937d, actualSolveResult.getChiSq());
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.09090909090909091d, fitParameters.min());
    assertEquals(0.090909090909091d, fitParameters.max());
    assertEquals(0.8181818181818186d, fitParameters.sum());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(0.8181818181818191d, covariance.total());
    assertEquals(1, fitParameters.dimensions());
    assertEquals(2, covariance.dimensions());
    assertEquals(81, covariance.size());
    assertEquals(9, fitParameters.size());
    assertEquals(9, fitParameters.toList().size());
    assertEquals(9, covariance.toArrayUnsafe().length);
    assertFalse(fitParameters.isEmpty());
    assertFalse(covariance.isEmpty());
    assertTrue(covariance.isSquare());
    assertArrayEquals(
        new double[] {
          0.090909090909091d,
          0.09090909090909093d,
          0.09090909090909094d,
          0.09090909090909091d,
          0.09090909090909094d,
          0.09090909090909094d,
          0.09090909090909094d,
          0.09090909090909093d,
          0.090909090909091d
        },
        fitParameters.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(List, List, List, List)} with {@code List}, {@code
   * List}, {@code List}, {@code List}.
   *
   * <ul>
   *   <li>Then return FitParameters max is {@code 0.25}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(List, List, List, List)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, List) with 'List', 'List', 'List', 'List'; then return FitParameters max is '0.25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(List, List, List, List)"
  })
  void testSolveWithListListListList_thenReturnFitParametersMaxIs025() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    ArrayList<Object> x = new ArrayList<>();
    x.add("42");

    ArrayList<Double> y = new ArrayList<>();
    y.add(10.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(10.0d);

    Function<Object, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function3 = mock(Function.class);
    when(function3.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function4 = mock(Function.class);
    when(function4.apply(Mockito.<Object>any())).thenReturn(10.0d);

    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function4);
    basisFunctions.add(function3);
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Object> actualSolveResult =
        generalizedLeastSquare.solve(x, y, sigma, basisFunctions);

    // Assert
    verify(function4).apply(isA(Object.class));
    verify(function3).apply(isA(Object.class));
    verify(function2).apply(isA(Object.class));
    verify(function).apply(isA(Object.class));
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.25d, fitParameters.max());
    assertEquals(0.25d, fitParameters.min());
    List<Double> toListResult = fitParameters.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.25d, toListResult.get(0).doubleValue());
    assertEquals(0.25d, toListResult.get(1).doubleValue());
    assertEquals(0.25d, toListResult.get(2).doubleValue());
    assertEquals(0.25d, toListResult.get(3).doubleValue());
    assertEquals(4, fitParameters.size());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(4, toArrayUnsafeResult.length);
    assertEquals(Short.SIZE, covariance.size());
    assertArrayEquals(
        new double[] {0.0625d, 0.0625d, 0.0625d, 0.0625d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(
        new double[] {0.0625d, 0.0625d, 0.0625d, 0.0625d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(
        new double[] {0.0625d, 0.0625d, 0.0625d, 0.0625d}, toArrayUnsafeResult[2], 0.0);
    assertArrayEquals(
        new double[] {0.0625d, 0.0625d, 0.0625d, 0.0625d}, toArrayUnsafeResult[3], 0.0);
    assertArrayEquals(
        new double[] {0.25d, 0.25d, 0.25d, 0.25d}, fitParameters.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(List, List, List, List)} with {@code List}, {@code
   * List}, {@code List}, {@code List}.
   *
   * <ul>
   *   <li>Then return FitParameters max is {@code 0.028571428571428553}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(List, List, List, List)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, List) with 'List', 'List', 'List', 'List'; then return FitParameters max is '0.028571428571428553'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(List, List, List, List)"
  })
  void testSolveWithListListListList_thenReturnFitParametersMaxIs0028571428571428553() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    ArrayList<Object> x = new ArrayList<>();
    x.add("42");

    ArrayList<Double> y = new ArrayList<>();
    y.add(10.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(10.0d);

    Function<Object, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function3 = mock(Function.class);
    when(function3.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function4 = mock(Function.class);
    when(function4.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function5 = mock(Function.class);
    when(function5.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function6 = mock(Function.class);
    when(function6.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function7 = mock(Function.class);
    when(function7.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function8 = mock(Function.class);
    when(function8.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function9 = mock(Function.class);
    when(function9.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function10 = mock(Function.class);
    when(function10.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function11 = mock(Function.class);
    when(function11.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function12 = mock(Function.class);
    when(function12.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function13 = mock(Function.class);
    when(function13.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function14 = mock(Function.class);
    when(function14.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function15 = mock(Function.class);
    when(function15.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function16 = mock(Function.class);
    when(function16.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function17 = mock(Function.class);
    when(function17.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function18 = mock(Function.class);
    when(function18.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function19 = mock(Function.class);
    when(function19.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function20 = mock(Function.class);
    when(function20.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function21 = mock(Function.class);
    when(function21.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function22 = mock(Function.class);
    when(function22.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function23 = mock(Function.class);
    when(function23.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function24 = mock(Function.class);
    when(function24.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function25 = mock(Function.class);
    when(function25.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function26 = mock(Function.class);
    when(function26.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function27 = mock(Function.class);
    when(function27.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function28 = mock(Function.class);
    when(function28.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function29 = mock(Function.class);
    when(function29.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function30 = mock(Function.class);
    when(function30.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function31 = mock(Function.class);
    when(function31.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function32 = mock(Function.class);
    when(function32.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function33 = mock(Function.class);
    when(function33.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function34 = mock(Function.class);
    when(function34.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function35 = mock(Function.class);
    when(function35.apply(Mockito.<Object>any())).thenReturn(10.0d);

    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function35);
    basisFunctions.add(function34);
    basisFunctions.add(function33);
    basisFunctions.add(function32);
    basisFunctions.add(function31);
    basisFunctions.add(function30);
    basisFunctions.add(function29);
    basisFunctions.add(function28);
    basisFunctions.add(function27);
    basisFunctions.add(function26);
    basisFunctions.add(function25);
    basisFunctions.add(function24);
    basisFunctions.add(function23);
    basisFunctions.add(function22);
    basisFunctions.add(function21);
    basisFunctions.add(function20);
    basisFunctions.add(function19);
    basisFunctions.add(function18);
    basisFunctions.add(function17);
    basisFunctions.add(function16);
    basisFunctions.add(function15);
    basisFunctions.add(function14);
    basisFunctions.add(function13);
    basisFunctions.add(function12);
    basisFunctions.add(function11);
    basisFunctions.add(function10);
    basisFunctions.add(function9);
    basisFunctions.add(function8);
    basisFunctions.add(function7);
    basisFunctions.add(function6);
    basisFunctions.add(function5);
    basisFunctions.add(function4);
    basisFunctions.add(function3);
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Object> actualSolveResult =
        generalizedLeastSquare.solve(x, y, sigma, basisFunctions);

    // Assert
    verify(function35).apply(isA(Object.class));
    verify(function34).apply(isA(Object.class));
    verify(function33).apply(isA(Object.class));
    verify(function32).apply(isA(Object.class));
    verify(function31).apply(isA(Object.class));
    verify(function30).apply(isA(Object.class));
    verify(function29).apply(isA(Object.class));
    verify(function28).apply(isA(Object.class));
    verify(function27).apply(isA(Object.class));
    verify(function26).apply(isA(Object.class));
    verify(function25).apply(isA(Object.class));
    verify(function24).apply(isA(Object.class));
    verify(function23).apply(isA(Object.class));
    verify(function22).apply(isA(Object.class));
    verify(function21).apply(isA(Object.class));
    verify(function20).apply(isA(Object.class));
    verify(function19).apply(isA(Object.class));
    verify(function18).apply(isA(Object.class));
    verify(function17).apply(isA(Object.class));
    verify(function16).apply(isA(Object.class));
    verify(function15).apply(isA(Object.class));
    verify(function14).apply(isA(Object.class));
    verify(function13).apply(isA(Object.class));
    verify(function12).apply(isA(Object.class));
    verify(function11).apply(isA(Object.class));
    verify(function10).apply(isA(Object.class));
    verify(function9).apply(isA(Object.class));
    verify(function8).apply(isA(Object.class));
    verify(function7).apply(isA(Object.class));
    verify(function6).apply(isA(Object.class));
    verify(function5).apply(isA(Object.class));
    verify(function4).apply(isA(Object.class));
    verify(function3).apply(isA(Object.class));
    verify(function2).apply(isA(Object.class));
    verify(function).apply(isA(Object.class));
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.028571428571428553d, fitParameters.max());
    assertEquals(0.02857142857142855d, fitParameters.min());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(1.00000000000001d, covariance.total());
    assertEquals(1.135959703518257E-30d, actualSolveResult.getChiSq());
    assertEquals(1225, covariance.size());
    assertEquals(35, fitParameters.size());
    assertEquals(35, fitParameters.toList().size());
    assertEquals(35, covariance.toArrayUnsafe().length);
    assertArrayEquals(
        new double[] {
          0.02857142857142855d,
          0.02857142857142855d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d,
          0.028571428571428553d
        },
        fitParameters.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(List, List, List, List)} with {@code List}, {@code
   * List}, {@code List}, {@code List}.
   *
   * <ul>
   *   <li>Then return FitParameters min is {@code 0.4999999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(List, List, List, List)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, List) with 'List', 'List', 'List', 'List'; then return FitParameters min is '0.4999999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(List, List, List, List)"
  })
  void testSolveWithListListListList_thenReturnFitParametersMinIs04999999999999999() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    ArrayList<Object> x = new ArrayList<>();
    x.add("42");

    ArrayList<Double> y = new ArrayList<>();
    y.add(10.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(10.0d);

    Function<Object, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Object>any())).thenReturn(10.0d);

    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Object> actualSolveResult =
        generalizedLeastSquare.solve(x, y, sigma, basisFunctions);

    // Assert
    verify(function2).apply(isA(Object.class));
    verify(function).apply(isA(Object.class));
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.4999999999999999d, fitParameters.min());
    List<Double> toListResult = fitParameters.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.4999999999999999d, toListResult.get(1).doubleValue());
    assertEquals(0.5d, fitParameters.max());
    assertEquals(0.5d, toListResult.get(0).doubleValue());
    assertEquals(0.9999999999999999d, fitParameters.sum());
    assertEquals(2, fitParameters.size());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(2, toArrayUnsafeResult.length);
    assertEquals(4, covariance.size());
    assertArrayEquals(
        new double[] {0.24999999999999994d, 0.24999999999999994d}, toArrayUnsafeResult[1], 0.0);
    assertArrayEquals(new double[] {0.25d, 0.25d}, toArrayUnsafeResult[0], 0.0);
    assertArrayEquals(new double[] {0.5d, 0.4999999999999999d}, fitParameters.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(List, List, List, List)} with {@code List}, {@code
   * List}, {@code List}, {@code List}.
   *
   * <ul>
   *   <li>Then return FitParameters min is {@code 0.08333333333333334}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(List, List, List, List)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, List) with 'List', 'List', 'List', 'List'; then return FitParameters min is '0.08333333333333334'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(List, List, List, List)"
  })
  void testSolveWithListListListList_thenReturnFitParametersMinIs008333333333333334() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    ArrayList<Object> x = new ArrayList<>();
    x.add("42");

    ArrayList<Double> y = new ArrayList<>();
    y.add(10.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(10.0d);

    Function<Object, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function3 = mock(Function.class);
    when(function3.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function4 = mock(Function.class);
    when(function4.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function5 = mock(Function.class);
    when(function5.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function6 = mock(Function.class);
    when(function6.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function7 = mock(Function.class);
    when(function7.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function8 = mock(Function.class);
    when(function8.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function9 = mock(Function.class);
    when(function9.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function10 = mock(Function.class);
    when(function10.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function11 = mock(Function.class);
    when(function11.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function12 = mock(Function.class);
    when(function12.apply(Mockito.<Object>any())).thenReturn(10.0d);

    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function12);
    basisFunctions.add(function11);
    basisFunctions.add(function10);
    basisFunctions.add(function9);
    basisFunctions.add(function8);
    basisFunctions.add(function7);
    basisFunctions.add(function6);
    basisFunctions.add(function5);
    basisFunctions.add(function4);
    basisFunctions.add(function3);
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Object> actualSolveResult =
        generalizedLeastSquare.solve(x, y, sigma, basisFunctions);

    // Assert
    verify(function12).apply(isA(Object.class));
    verify(function11).apply(isA(Object.class));
    verify(function10).apply(isA(Object.class));
    verify(function9).apply(isA(Object.class));
    verify(function8).apply(isA(Object.class));
    verify(function7).apply(isA(Object.class));
    verify(function6).apply(isA(Object.class));
    verify(function5).apply(isA(Object.class));
    verify(function4).apply(isA(Object.class));
    verify(function3).apply(isA(Object.class));
    verify(function2).apply(isA(Object.class));
    verify(function).apply(isA(Object.class));
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.08333333333333334d, fitParameters.min());
    assertEquals(0.08333333333333337d, fitParameters.max());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(0.9999999999999974d, covariance.total());
    assertEquals(1.0000000000000004d, fitParameters.sum());
    assertEquals(12, fitParameters.size());
    assertEquals(12, fitParameters.toList().size());
    assertEquals(12, covariance.toArrayUnsafe().length);
    assertEquals(144, covariance.size());
    assertEquals(2.8398992587956424E-31d, actualSolveResult.getChiSq());
    assertArrayEquals(
        new double[] {
          0.08333333333333337d,
          0.08333333333333337d,
          0.08333333333333334d,
          0.08333333333333334d,
          0.08333333333333334d,
          0.08333333333333334d,
          0.08333333333333334d,
          0.08333333333333334d,
          0.08333333333333334d,
          0.08333333333333334d,
          0.08333333333333334d,
          0.08333333333333334d
        },
        fitParameters.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(List, List, List, List)} with {@code List}, {@code
   * List}, {@code List}, {@code List}.
   *
   * <ul>
   *   <li>Then return FitParameters min is {@code 0.11111111111111109}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(List, List, List, List)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, List) with 'List', 'List', 'List', 'List'; then return FitParameters min is '0.11111111111111109'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(List, List, List, List)"
  })
  void testSolveWithListListListList_thenReturnFitParametersMinIs011111111111111109() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    ArrayList<Object> x = new ArrayList<>();
    x.add("42");

    ArrayList<Double> y = new ArrayList<>();
    y.add(10.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(10.0d);

    Function<Object, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function3 = mock(Function.class);
    when(function3.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function4 = mock(Function.class);
    when(function4.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function5 = mock(Function.class);
    when(function5.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function6 = mock(Function.class);
    when(function6.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function7 = mock(Function.class);
    when(function7.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function8 = mock(Function.class);
    when(function8.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function9 = mock(Function.class);
    when(function9.apply(Mockito.<Object>any())).thenReturn(10.0d);

    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function9);
    basisFunctions.add(function8);
    basisFunctions.add(function7);
    basisFunctions.add(function6);
    basisFunctions.add(function5);
    basisFunctions.add(function4);
    basisFunctions.add(function3);
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Object> actualSolveResult =
        generalizedLeastSquare.solve(x, y, sigma, basisFunctions);

    // Assert
    verify(function9).apply(isA(Object.class));
    verify(function8).apply(isA(Object.class));
    verify(function7).apply(isA(Object.class));
    verify(function6).apply(isA(Object.class));
    verify(function5).apply(isA(Object.class));
    verify(function4).apply(isA(Object.class));
    verify(function3).apply(isA(Object.class));
    verify(function2).apply(isA(Object.class));
    verify(function).apply(isA(Object.class));
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.11111111111111109d, fitParameters.min());
    assertEquals(0.1111111111111112d, fitParameters.max());
    assertEquals(0.9999999999999998d, fitParameters.sum());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(1.0000000000000018d, covariance.total());
    assertEquals(3.1554436208840473E-32d, actualSolveResult.getChiSq());
    assertEquals(81, covariance.size());
    assertEquals(9, fitParameters.size());
    assertEquals(9, fitParameters.toList().size());
    assertEquals(9, covariance.toArrayUnsafe().length);
    assertArrayEquals(
        new double[] {
          0.1111111111111112d,
          0.11111111111111109d,
          0.11111111111111109d,
          0.11111111111111109d,
          0.11111111111111109d,
          0.11111111111111109d,
          0.11111111111111109d,
          0.11111111111111109d,
          0.11111111111111109d
        },
        fitParameters.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(List, List, List, List)} with {@code List}, {@code
   * List}, {@code List}, {@code List}.
   *
   * <ul>
   *   <li>Then return FitParameters min is {@code 0.015384615384615389}.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(List, List, List, List)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, List) with 'List', 'List', 'List', 'List'; then return FitParameters min is '0.015384615384615389'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(List, List, List, List)"
  })
  void testSolveWithListListListList_thenReturnFitParametersMinIs0015384615384615389() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    ArrayList<Object> x = new ArrayList<>();
    x.add("42");

    ArrayList<Double> y = new ArrayList<>();
    y.add(10.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(10.0d);

    Function<Object, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function2 = mock(Function.class);
    when(function2.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function3 = mock(Function.class);
    when(function3.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function4 = mock(Function.class);
    when(function4.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function5 = mock(Function.class);
    when(function5.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function6 = mock(Function.class);
    when(function6.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function7 = mock(Function.class);
    when(function7.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function8 = mock(Function.class);
    when(function8.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function9 = mock(Function.class);
    when(function9.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function10 = mock(Function.class);
    when(function10.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function11 = mock(Function.class);
    when(function11.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function12 = mock(Function.class);
    when(function12.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function13 = mock(Function.class);
    when(function13.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function14 = mock(Function.class);
    when(function14.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function15 = mock(Function.class);
    when(function15.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function16 = mock(Function.class);
    when(function16.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function17 = mock(Function.class);
    when(function17.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function18 = mock(Function.class);
    when(function18.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function19 = mock(Function.class);
    when(function19.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function20 = mock(Function.class);
    when(function20.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function21 = mock(Function.class);
    when(function21.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function22 = mock(Function.class);
    when(function22.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function23 = mock(Function.class);
    when(function23.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function24 = mock(Function.class);
    when(function24.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function25 = mock(Function.class);
    when(function25.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function26 = mock(Function.class);
    when(function26.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function27 = mock(Function.class);
    when(function27.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function28 = mock(Function.class);
    when(function28.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function29 = mock(Function.class);
    when(function29.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function30 = mock(Function.class);
    when(function30.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function31 = mock(Function.class);
    when(function31.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function32 = mock(Function.class);
    when(function32.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function33 = mock(Function.class);
    when(function33.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function34 = mock(Function.class);
    when(function34.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function35 = mock(Function.class);
    when(function35.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function36 = mock(Function.class);
    when(function36.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function37 = mock(Function.class);
    when(function37.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function38 = mock(Function.class);
    when(function38.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function39 = mock(Function.class);
    when(function39.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function40 = mock(Function.class);
    when(function40.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function41 = mock(Function.class);
    when(function41.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function42 = mock(Function.class);
    when(function42.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function43 = mock(Function.class);
    when(function43.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function44 = mock(Function.class);
    when(function44.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function45 = mock(Function.class);
    when(function45.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function46 = mock(Function.class);
    when(function46.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function47 = mock(Function.class);
    when(function47.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function48 = mock(Function.class);
    when(function48.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function49 = mock(Function.class);
    when(function49.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function50 = mock(Function.class);
    when(function50.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function51 = mock(Function.class);
    when(function51.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function52 = mock(Function.class);
    when(function52.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function53 = mock(Function.class);
    when(function53.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function54 = mock(Function.class);
    when(function54.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function55 = mock(Function.class);
    when(function55.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function56 = mock(Function.class);
    when(function56.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function57 = mock(Function.class);
    when(function57.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function58 = mock(Function.class);
    when(function58.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function59 = mock(Function.class);
    when(function59.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function60 = mock(Function.class);
    when(function60.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function61 = mock(Function.class);
    when(function61.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function62 = mock(Function.class);
    when(function62.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function63 = mock(Function.class);
    when(function63.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function64 = mock(Function.class);
    when(function64.apply(Mockito.<Object>any())).thenReturn(10.0d);

    Function<Object, Double> function65 = mock(Function.class);
    when(function65.apply(Mockito.<Object>any())).thenReturn(10.0d);

    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function65);
    basisFunctions.add(function64);
    basisFunctions.add(function63);
    basisFunctions.add(function62);
    basisFunctions.add(function61);
    basisFunctions.add(function60);
    basisFunctions.add(function59);
    basisFunctions.add(function58);
    basisFunctions.add(function57);
    basisFunctions.add(function56);
    basisFunctions.add(function55);
    basisFunctions.add(function54);
    basisFunctions.add(function53);
    basisFunctions.add(function52);
    basisFunctions.add(function51);
    basisFunctions.add(function50);
    basisFunctions.add(function49);
    basisFunctions.add(function48);
    basisFunctions.add(function47);
    basisFunctions.add(function46);
    basisFunctions.add(function45);
    basisFunctions.add(function44);
    basisFunctions.add(function43);
    basisFunctions.add(function42);
    basisFunctions.add(function41);
    basisFunctions.add(function40);
    basisFunctions.add(function39);
    basisFunctions.add(function38);
    basisFunctions.add(function37);
    basisFunctions.add(function36);
    basisFunctions.add(function35);
    basisFunctions.add(function34);
    basisFunctions.add(function33);
    basisFunctions.add(function32);
    basisFunctions.add(function31);
    basisFunctions.add(function30);
    basisFunctions.add(function29);
    basisFunctions.add(function28);
    basisFunctions.add(function27);
    basisFunctions.add(function26);
    basisFunctions.add(function25);
    basisFunctions.add(function24);
    basisFunctions.add(function23);
    basisFunctions.add(function22);
    basisFunctions.add(function21);
    basisFunctions.add(function20);
    basisFunctions.add(function19);
    basisFunctions.add(function18);
    basisFunctions.add(function17);
    basisFunctions.add(function16);
    basisFunctions.add(function15);
    basisFunctions.add(function14);
    basisFunctions.add(function13);
    basisFunctions.add(function12);
    basisFunctions.add(function11);
    basisFunctions.add(function10);
    basisFunctions.add(function9);
    basisFunctions.add(function8);
    basisFunctions.add(function7);
    basisFunctions.add(function6);
    basisFunctions.add(function5);
    basisFunctions.add(function4);
    basisFunctions.add(function3);
    basisFunctions.add(function2);
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Object> actualSolveResult =
        generalizedLeastSquare.solve(x, y, sigma, basisFunctions);

    // Assert
    verify(function65).apply(isA(Object.class));
    verify(function64).apply(isA(Object.class));
    verify(function63).apply(isA(Object.class));
    verify(function62).apply(isA(Object.class));
    verify(function61).apply(isA(Object.class));
    verify(function60).apply(isA(Object.class));
    verify(function59).apply(isA(Object.class));
    verify(function58).apply(isA(Object.class));
    verify(function57).apply(isA(Object.class));
    verify(function56).apply(isA(Object.class));
    verify(function55).apply(isA(Object.class));
    verify(function54).apply(isA(Object.class));
    verify(function53).apply(isA(Object.class));
    verify(function52).apply(isA(Object.class));
    verify(function51).apply(isA(Object.class));
    verify(function50).apply(isA(Object.class));
    verify(function49).apply(isA(Object.class));
    verify(function48).apply(isA(Object.class));
    verify(function47).apply(isA(Object.class));
    verify(function46).apply(isA(Object.class));
    verify(function45).apply(isA(Object.class));
    verify(function44).apply(isA(Object.class));
    verify(function43).apply(isA(Object.class));
    verify(function42).apply(isA(Object.class));
    verify(function41).apply(isA(Object.class));
    verify(function40).apply(isA(Object.class));
    verify(function39).apply(isA(Object.class));
    verify(function38).apply(isA(Object.class));
    verify(function37).apply(isA(Object.class));
    verify(function36).apply(isA(Object.class));
    verify(function35).apply(isA(Object.class));
    verify(function34).apply(isA(Object.class));
    verify(function33).apply(isA(Object.class));
    verify(function32).apply(isA(Object.class));
    verify(function31).apply(isA(Object.class));
    verify(function30).apply(isA(Object.class));
    verify(function29).apply(isA(Object.class));
    verify(function28).apply(isA(Object.class));
    verify(function27).apply(isA(Object.class));
    verify(function26).apply(isA(Object.class));
    verify(function25).apply(isA(Object.class));
    verify(function24).apply(isA(Object.class));
    verify(function23).apply(isA(Object.class));
    verify(function22).apply(isA(Object.class));
    verify(function21).apply(isA(Object.class));
    verify(function20).apply(isA(Object.class));
    verify(function19).apply(isA(Object.class));
    verify(function18).apply(isA(Object.class));
    verify(function17).apply(isA(Object.class));
    verify(function16).apply(isA(Object.class));
    verify(function15).apply(isA(Object.class));
    verify(function14).apply(isA(Object.class));
    verify(function13).apply(isA(Object.class));
    verify(function12).apply(isA(Object.class));
    verify(function11).apply(isA(Object.class));
    verify(function10).apply(isA(Object.class));
    verify(function9).apply(isA(Object.class));
    verify(function8).apply(isA(Object.class));
    verify(function7).apply(isA(Object.class));
    verify(function6).apply(isA(Object.class));
    verify(function5).apply(isA(Object.class));
    verify(function4).apply(isA(Object.class));
    verify(function3).apply(isA(Object.class));
    verify(function2).apply(isA(Object.class));
    verify(function).apply(isA(Object.class));
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(0.015384615384615389d, fitParameters.min());
    assertEquals(0.015384615384615392d, fitParameters.max());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(0.9999999999999731d, covariance.total());
    assertEquals(1.0000000000000018d, fitParameters.sum());
    assertEquals(4225, covariance.size());
    assertEquals(65, fitParameters.size());
    assertEquals(65, fitParameters.toList().size());
    assertEquals(65, fitParameters.toArrayUnsafe().length);
    assertEquals(65, covariance.toArrayUnsafe().length);
  }

  /**
   * Test {@link GeneralizedLeastSquare#solve(List, List, List, List)} with {@code List}, {@code
   * List}, {@code List}, {@code List}.
   *
   * <ul>
   *   <li>Then return FitParameters size is one.
   * </ul>
   *
   * <p>Method under test: {@link GeneralizedLeastSquare#solve(List, List, List, List)}
   */
  @Test
  @DisplayName(
      "Test solve(List, List, List, List) with 'List', 'List', 'List', 'List'; then return FitParameters size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "GeneralizedLeastSquareResults GeneralizedLeastSquare.solve(List, List, List, List)"
  })
  void testSolveWithListListListList_thenReturnFitParametersSizeIsOne() {
    // Arrange
    GeneralizedLeastSquare generalizedLeastSquare = new GeneralizedLeastSquare();

    ArrayList<Object> x = new ArrayList<>();
    x.add("42");

    ArrayList<Double> y = new ArrayList<>();
    y.add(10.0d);

    ArrayList<Double> sigma = new ArrayList<>();
    sigma.add(10.0d);

    Function<Object, Double> function = mock(Function.class);
    when(function.apply(Mockito.<Object>any())).thenReturn(10.0d);

    ArrayList<Function<Object, Double>> basisFunctions = new ArrayList<>();
    basisFunctions.add(function);

    // Act
    GeneralizedLeastSquareResults<Object> actualSolveResult =
        generalizedLeastSquare.solve(x, y, sigma, basisFunctions);

    // Assert
    verify(function).apply(isA(Object.class));
    DoubleArray fitParameters = actualSolveResult.getFitParameters();
    assertEquals(1, fitParameters.size());
    DoubleMatrix covariance = actualSolveResult.getCovariance();
    assertEquals(1, covariance.size());
    List<Double> toListResult = fitParameters.toList();
    assertEquals(1, toListResult.size());
    double[][] toArrayUnsafeResult = covariance.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertEquals(1.0d, fitParameters.max());
    assertEquals(1.0d, fitParameters.min());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.0d}, fitParameters.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {1.0d}, toArrayUnsafeResult[0], 0.0);
  }
}
