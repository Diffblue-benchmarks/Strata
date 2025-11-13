package com.opengamma.strata.math.impl.util;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.array.DoubleMatrix;
import com.opengamma.strata.math.impl.function.special.IncompleteBetaFunction;
import com.opengamma.strata.math.impl.function.special.IncompleteGammaFunction;
import com.opengamma.strata.math.impl.function.special.InverseIncompleteBetaFunction;
import com.opengamma.strata.math.impl.function.special.TopHatFunction;
import java.util.List;
import java.util.function.Function;
import org.apache.commons.math3.exception.NotStrictlyPositiveException;
import org.apache.commons.math3.exception.NumberIsTooLargeException;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.ArrayRealVector;
import org.apache.commons.math3.linear.BlockRealMatrix;
import org.apache.commons.math3.linear.DiagonalMatrix;
import org.apache.commons.math3.linear.OpenMapRealMatrix;
import org.apache.commons.math3.linear.OpenMapRealVector;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.RealVector;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CommonsMathWrapperDiffblueTest {
  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName("Test wrapUnivariate(Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate() {
    // Arrange
    IncompleteGammaFunction f = new IncompleteGammaFunction(1.0E-12d);

    // Act
    double actualValueResult = CommonsMathWrapper.wrapUnivariate(f).value(10.0d);

    // Assert
    assertEquals(0.9999999999999512d, f.apply(2.0d).doubleValue());
    assertEquals(1.0d, actualValueResult);
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>Then return value {@code 0.5} is {@code 0.5000000000001835}.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName("Test wrapUnivariate(Function); then return value '0.5' is '0.5000000000001835'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_thenReturnValue05Is05000000000001835() {
    // Arrange, Act and Assert
    assertEquals(
        0.5000000000001835d,
        CommonsMathWrapper.wrapUnivariate(new IncompleteBetaFunction(10.0d, 10.0d)).value(0.5d));
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>Then return value {@code 0.5} is {@code 0.005703300096583667}.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName("Test wrapUnivariate(Function); then return value '0.5' is '0.005703300096583667'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_thenReturnValue05Is0005703300096583667() {
    // Arrange, Act and Assert
    assertEquals(
        0.005703300096583667d,
        CommonsMathWrapper.wrapUnivariate(new InverseIncompleteBetaFunction(0.27061d, 10.0d))
            .value(0.5d));
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>Then return value {@code 0.5} is {@code 0.21380535720306396}.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName("Test wrapUnivariate(Function); then return value '0.5' is '0.21380535720306396'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_thenReturnValue05Is021380535720306396() {
    // Arrange, Act and Assert
    assertEquals(
        0.21380535720306396d,
        CommonsMathWrapper.wrapUnivariate(new InverseIncompleteBetaFunction(3.0d, 10.0d))
            .value(0.5d));
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>Then return value {@code 0.5} is {@code 0.47639976575461507}.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName("Test wrapUnivariate(Function); then return value '0.5' is '0.47639976575461507'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_thenReturnValue05Is047639976575461507() {
    // Arrange, Act and Assert
    assertEquals(
        0.47639976575461507d,
        CommonsMathWrapper.wrapUnivariate(new InverseIncompleteBetaFunction(10.0d, 10.0d))
            .value(0.5d));
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>Then return value {@code 0.5} is zero.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName("Test wrapUnivariate(Function); then return value '0.5' is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_thenReturnValue05IsZero() {
    // Arrange
    TopHatFunction f = new TopHatFunction(1.0d, 10.0d, 3.0d);

    // Act and Assert
    assertEquals(0.0d, CommonsMathWrapper.wrapUnivariate(f).value(0.5d));
    assertEquals(3.0d, f.apply(2.0d).doubleValue());
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>Then return value ten is {@code 0.5420702855281083}.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName("Test wrapUnivariate(Function); then return value ten is '0.5420702855281083'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_thenReturnValueTenIs05420702855281083() {
    // Arrange
    IncompleteGammaFunction f = new IncompleteGammaFunction(10.0d);

    // Act and Assert
    assertEquals(0.5420702855281083d, CommonsMathWrapper.wrapUnivariate(f).value(10.0d));
    assertEquals(4.649807501725987E-5d, f.apply(2.0d).doubleValue());
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>When {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is
   *       {@code 0.5} and b is {@code 1.0E-12}.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName(
      "Test wrapUnivariate(Function); when IncompleteBetaFunction(double, double) with a is '0.5' and b is '1.0E-12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_whenIncompleteBetaFunctionWithAIs05AndBIs10e12() {
    // Arrange, Act and Assert
    assertEquals(
        1.0d,
        CommonsMathWrapper.wrapUnivariate(new IncompleteBetaFunction(0.5d, 1.0E-12d)).value(1.0d));
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>When {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is one
   *       and b is {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName(
      "Test wrapUnivariate(Function); when IncompleteBetaFunction(double, double) with a is one and b is '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_whenIncompleteBetaFunctionWithAIsOneAndBIs05() {
    // Arrange, Act and Assert
    assertEquals(
        1.0d,
        CommonsMathWrapper.wrapUnivariate(new IncompleteBetaFunction(1.0d, 0.5d)).value(1.0d));
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>When {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is one
   *       and b is {@code 1.0E-12}.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName(
      "Test wrapUnivariate(Function); when IncompleteBetaFunction(double, double) with a is one and b is '1.0E-12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_whenIncompleteBetaFunctionWithAIsOneAndBIs10e12() {
    // Arrange, Act and Assert
    assertEquals(
        1.0d,
        CommonsMathWrapper.wrapUnivariate(new IncompleteBetaFunction(1.0d, 1.0E-12d)).value(1.0d));
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>When {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is one
   *       and b is ten.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName(
      "Test wrapUnivariate(Function); when IncompleteBetaFunction(double, double) with a is one and b is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_whenIncompleteBetaFunctionWithAIsOneAndBIsTen() {
    // Arrange, Act and Assert
    assertEquals(
        1.0d,
        CommonsMathWrapper.wrapUnivariate(new IncompleteBetaFunction(1.0d, 10.0d)).value(1.0d));
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>When {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is ten
   *       and b is one.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName(
      "Test wrapUnivariate(Function); when IncompleteBetaFunction(double, double) with a is ten and b is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_whenIncompleteBetaFunctionWithAIsTenAndBIsOne() {
    // Arrange, Act and Assert
    assertEquals(
        1.0d,
        CommonsMathWrapper.wrapUnivariate(new IncompleteBetaFunction(10.0d, 1.0d)).value(1.0d));
  }

  /**
   * Test {@link CommonsMathWrapper#wrapUnivariate(Function)}.
   *
   * <ul>
   *   <li>When {@link IncompleteBetaFunction#IncompleteBetaFunction(double, double)} with a is ten
   *       and b is ten.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapUnivariate(Function)}
   */
  @Test
  @DisplayName(
      "Test wrapUnivariate(Function); when IncompleteBetaFunction(double, double) with a is ten and b is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "org.apache.commons.math3.analysis.UnivariateFunction CommonsMathWrapper.wrapUnivariate(Function)"
  })
  void testWrapUnivariate_whenIncompleteBetaFunctionWithAIsTenAndBIsTen() {
    // Arrange, Act and Assert
    assertEquals(
        1.0d,
        CommonsMathWrapper.wrapUnivariate(new IncompleteBetaFunction(10.0d, 10.0d)).value(1.0d));
  }

  /**
   * Test {@link CommonsMathWrapper#wrap(DoubleArray)} with {@code DoubleArray}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return {@link ArrayRealVector}.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrap(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test wrap(DoubleArray) with 'DoubleArray'; when DoubleArray; then return ArrayRealVector")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealVector CommonsMathWrapper.wrap(DoubleArray)"})
  void testWrapWithDoubleArray_whenDoubleArray_thenReturnArrayRealVector() {
    // Arrange and Act
    RealVector actualWrapResult = CommonsMathWrapper.wrap(DoubleArray.of());

    // Assert
    assertTrue(actualWrapResult instanceof ArrayRealVector);
    assertEquals(-1, actualWrapResult.getMaxIndex());
    assertEquals(-1, actualWrapResult.getMinIndex());
    assertEquals(0, actualWrapResult.getDimension());
    assertEquals(0.0d, actualWrapResult.getL1Norm());
    assertEquals(0.0d, actualWrapResult.getLInfNorm());
    assertEquals(0.0d, actualWrapResult.getNorm());
    assertFalse(actualWrapResult.iterator().hasNext());
    assertFalse(actualWrapResult.isInfinite());
    assertFalse(actualWrapResult.isNaN());
    assertEquals(Double.NaN, actualWrapResult.getMaxValue());
    assertEquals(Double.NaN, actualWrapResult.getMinValue());
    assertArrayEquals(new double[] {}, ((ArrayRealVector) actualWrapResult).getDataRef(), 0.0);
  }

  /**
   * Test {@link CommonsMathWrapper#wrap(DoubleMatrix)} with {@code DoubleMatrix}.
   *
   * <ul>
   *   <li>Then return {@link Array2DRowRealMatrix}.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrap(DoubleMatrix)}
   */
  @Test
  @DisplayName("Test wrap(DoubleMatrix) with 'DoubleMatrix'; then return Array2DRowRealMatrix")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealMatrix CommonsMathWrapper.wrap(DoubleMatrix)"})
  void testWrapWithDoubleMatrix_thenReturnArray2DRowRealMatrix() {
    // Arrange and Act
    RealMatrix actualWrapResult =
        CommonsMathWrapper.wrap(
            DoubleMatrix.ofUnsafe(new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}}));

    // Assert
    assertTrue(actualWrapResult instanceof Array2DRowRealMatrix);
    assertEquals(1, actualWrapResult.getRowDimension());
    double[][] dataRef = ((Array2DRowRealMatrix) actualWrapResult).getDataRef();
    assertEquals(1, dataRef.length);
    double[][] data = actualWrapResult.getData();
    assertEquals(1, data.length);
    assertEquals(10.0d, actualWrapResult.getNorm());
    assertEquals(14.159802258506296d, actualWrapResult.getFrobeniusNorm());
    assertEquals(4, actualWrapResult.getColumnDimension());
    assertFalse(actualWrapResult.isSquare());
    assertFalse(((Array2DRowRealMatrix) actualWrapResult).isTransposable());
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, dataRef[0], 0.0);
    assertArrayEquals(new double[] {10.0d, 0.5d, 10.0d, 0.5d}, data[0], 0.0);
  }

  /**
   * Test {@link CommonsMathWrapper#wrapAsMatrix(DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return RowDimension is zero.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapAsMatrix(DoubleArray)}
   */
  @Test
  @DisplayName("Test wrapAsMatrix(DoubleArray); when DoubleArray; then return RowDimension is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealMatrix CommonsMathWrapper.wrapAsMatrix(DoubleArray)"})
  void testWrapAsMatrix_whenDoubleArray_thenReturnRowDimensionIsZero() {
    // Arrange and Act
    RealMatrix actualWrapAsMatrixResult = CommonsMathWrapper.wrapAsMatrix(DoubleArray.of());

    // Assert
    assertTrue(actualWrapAsMatrixResult instanceof Array2DRowRealMatrix);
    assertEquals(0, actualWrapAsMatrixResult.getRowDimension());
    assertEquals(0, ((Array2DRowRealMatrix) actualWrapAsMatrixResult).getDataRef().length);
    assertFalse(((Array2DRowRealMatrix) actualWrapAsMatrixResult).isTransposable());
  }

  /**
   * Test {@link CommonsMathWrapper#wrapAsMatrix(DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return FrobeniusNorm is zero.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#wrapAsMatrix(DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test wrapAsMatrix(DoubleArray); when filled three; then return FrobeniusNorm is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"RealMatrix CommonsMathWrapper.wrapAsMatrix(DoubleArray)"})
  void testWrapAsMatrix_whenFilledThree_thenReturnFrobeniusNormIsZero() {
    // Arrange and Act
    RealMatrix actualWrapAsMatrixResult = CommonsMathWrapper.wrapAsMatrix(DoubleArray.filled(3));

    // Assert
    assertTrue(actualWrapAsMatrixResult instanceof Array2DRowRealMatrix);
    assertEquals(0.0d, actualWrapAsMatrixResult.getFrobeniusNorm());
    assertEquals(0.0d, actualWrapAsMatrixResult.getNorm());
    assertEquals(1, actualWrapAsMatrixResult.getColumnDimension());
    assertEquals(3, actualWrapAsMatrixResult.getRowDimension());
    double[][] dataRef = ((Array2DRowRealMatrix) actualWrapAsMatrixResult).getDataRef();
    assertEquals(3, dataRef.length);
    double[][] data = actualWrapAsMatrixResult.getData();
    assertEquals(3, data.length);
    assertFalse(actualWrapAsMatrixResult.isSquare());
    assertArrayEquals(new double[] {0.0d}, dataRef[0], 0.0);
    assertArrayEquals(new double[] {0.0d}, dataRef[1], 0.0);
    assertArrayEquals(new double[] {0.0d}, dataRef[2], 0.0);
    assertArrayEquals(new double[] {0.0d}, data[0], 0.0);
    assertArrayEquals(new double[] {0.0d}, data[1], 0.0);
    assertArrayEquals(new double[] {0.0d}, data[2], 0.0);
  }

  /**
   * Test {@link CommonsMathWrapper#unwrap(RealMatrix)} with {@code RealMatrix}.
   *
   * <p>Method under test: {@link CommonsMathWrapper#unwrap(RealMatrix)}
   */
  @Test
  @DisplayName("Test unwrap(RealMatrix) with 'RealMatrix'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix CommonsMathWrapper.unwrap(RealMatrix)"})
  void testUnwrapWithRealMatrix() throws NotStrictlyPositiveException {
    // Arrange and Act
    DoubleMatrix actualUnwrapResult = CommonsMathWrapper.unwrap(new Array2DRowRealMatrix(1, 1));

    // Assert
    assertEquals(1, actualUnwrapResult.size());
    double[][] toArrayUnsafeResult = actualUnwrapResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertFalse(actualUnwrapResult.isEmpty());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link CommonsMathWrapper#unwrap(RealMatrix)} with {@code RealMatrix}.
   *
   * <p>Method under test: {@link CommonsMathWrapper#unwrap(RealMatrix)}
   */
  @Test
  @DisplayName("Test unwrap(RealMatrix) with 'RealMatrix'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix CommonsMathWrapper.unwrap(RealMatrix)"})
  void testUnwrapWithRealMatrix2() throws NotStrictlyPositiveException, NumberIsTooLargeException {
    // Arrange and Act
    DoubleMatrix actualUnwrapResult = CommonsMathWrapper.unwrap(new OpenMapRealMatrix(1, 1));

    // Assert
    assertEquals(1, actualUnwrapResult.size());
    double[][] toArrayUnsafeResult = actualUnwrapResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertFalse(actualUnwrapResult.isEmpty());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link CommonsMathWrapper#unwrap(RealMatrix)} with {@code RealMatrix}.
   *
   * <ul>
   *   <li>When {@link Array2DRowRealMatrix#Array2DRowRealMatrix()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#unwrap(RealMatrix)}
   */
  @Test
  @DisplayName(
      "Test unwrap(RealMatrix) with 'RealMatrix'; when Array2DRowRealMatrix(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix CommonsMathWrapper.unwrap(RealMatrix)"})
  void testUnwrapWithRealMatrix_whenArray2DRowRealMatrix_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleMatrix actualUnwrapResult = CommonsMathWrapper.unwrap(new Array2DRowRealMatrix());

    // Assert
    assertEquals(0, actualUnwrapResult.size());
    assertEquals(0, actualUnwrapResult.toArrayUnsafe().length);
    assertEquals(0.0d, actualUnwrapResult.total());
    assertEquals(2, actualUnwrapResult.dimensions());
    assertTrue(actualUnwrapResult.isEmpty());
    assertTrue(actualUnwrapResult.isSquare());
  }

  /**
   * Test {@link CommonsMathWrapper#unwrap(RealMatrix)} with {@code RealMatrix}.
   *
   * <ul>
   *   <li>When {@link BlockRealMatrix#BlockRealMatrix(int, int)} with rows is one and columns is
   *       one.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#unwrap(RealMatrix)}
   */
  @Test
  @DisplayName(
      "Test unwrap(RealMatrix) with 'RealMatrix'; when BlockRealMatrix(int, int) with rows is one and columns is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix CommonsMathWrapper.unwrap(RealMatrix)"})
  void testUnwrapWithRealMatrix_whenBlockRealMatrixWithRowsIsOneAndColumnsIsOne()
      throws NotStrictlyPositiveException {
    // Arrange and Act
    DoubleMatrix actualUnwrapResult = CommonsMathWrapper.unwrap(new BlockRealMatrix(1, 1));

    // Assert
    assertEquals(1, actualUnwrapResult.size());
    double[][] toArrayUnsafeResult = actualUnwrapResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertFalse(actualUnwrapResult.isEmpty());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link CommonsMathWrapper#unwrap(RealMatrix)} with {@code RealMatrix}.
   *
   * <ul>
   *   <li>When {@link DiagonalMatrix#DiagonalMatrix(int)} with dimension is one.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#unwrap(RealMatrix)}
   */
  @Test
  @DisplayName(
      "Test unwrap(RealMatrix) with 'RealMatrix'; when DiagonalMatrix(int) with dimension is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleMatrix CommonsMathWrapper.unwrap(RealMatrix)"})
  void testUnwrapWithRealMatrix_whenDiagonalMatrixWithDimensionIsOne()
      throws NotStrictlyPositiveException {
    // Arrange and Act
    DoubleMatrix actualUnwrapResult = CommonsMathWrapper.unwrap(new DiagonalMatrix(1));

    // Assert
    assertEquals(1, actualUnwrapResult.size());
    double[][] toArrayUnsafeResult = actualUnwrapResult.toArrayUnsafe();
    assertEquals(1, toArrayUnsafeResult.length);
    assertFalse(actualUnwrapResult.isEmpty());
    assertArrayEquals(new double[] {0.0d}, toArrayUnsafeResult[0], 0.0);
  }

  /**
   * Test {@link CommonsMathWrapper#unwrap(RealVector)} with {@code RealVector}.
   *
   * <ul>
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#unwrap(RealVector)}
   */
  @Test
  @DisplayName("Test unwrap(RealVector) with 'RealVector'; then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray CommonsMathWrapper.unwrap(RealVector)"})
  void testUnwrapWithRealVector_thenReturnMaxIsZero() {
    // Arrange and Act
    DoubleArray actualUnwrapResult = CommonsMathWrapper.unwrap(new OpenMapRealVector(1));

    // Assert
    assertEquals(0.0d, actualUnwrapResult.max());
    assertEquals(0.0d, actualUnwrapResult.min());
    List<Double> toListResult = actualUnwrapResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(1, actualUnwrapResult.size());
    assertFalse(actualUnwrapResult.isEmpty());
    assertArrayEquals(new double[] {0.0d}, actualUnwrapResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CommonsMathWrapper#unwrap(RealVector)} with {@code RealVector}.
   *
   * <ul>
   *   <li>When {@link ArrayRealVector#ArrayRealVector()}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#unwrap(RealVector)}
   */
  @Test
  @DisplayName(
      "Test unwrap(RealVector) with 'RealVector'; when ArrayRealVector(); then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray CommonsMathWrapper.unwrap(RealVector)"})
  void testUnwrapWithRealVector_whenArrayRealVector_thenReturnSizeIsZero() {
    // Arrange and Act
    DoubleArray actualUnwrapResult = CommonsMathWrapper.unwrap(new ArrayRealVector());

    // Assert
    assertEquals(0, actualUnwrapResult.size());
    assertTrue(actualUnwrapResult.isEmpty());
    assertTrue(actualUnwrapResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualUnwrapResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link CommonsMathWrapper#unwrap(RealVector)} with {@code RealVector}.
   *
   * <ul>
   *   <li>When {@link OpenMapRealVector#OpenMapRealVector(int)} with dimension is zero.
   * </ul>
   *
   * <p>Method under test: {@link CommonsMathWrapper#unwrap(RealVector)}
   */
  @Test
  @DisplayName(
      "Test unwrap(RealVector) with 'RealVector'; when OpenMapRealVector(int) with dimension is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray CommonsMathWrapper.unwrap(RealVector)"})
  void testUnwrapWithRealVector_whenOpenMapRealVectorWithDimensionIsZero() {
    // Arrange and Act
    DoubleArray actualUnwrapResult = CommonsMathWrapper.unwrap(new OpenMapRealVector(0));

    // Assert
    assertEquals(0, actualUnwrapResult.size());
    assertTrue(actualUnwrapResult.isEmpty());
    assertTrue(actualUnwrapResult.toList().isEmpty());
    assertArrayEquals(new double[] {}, actualUnwrapResult.toArrayUnsafe(), 0.0);
  }
}
