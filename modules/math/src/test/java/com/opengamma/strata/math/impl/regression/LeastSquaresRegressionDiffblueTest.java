package com.opengamma.strata.math.impl.regression;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class LeastSquaresRegressionDiffblueTest {
  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[], double[])} with {@code
   * double[][]}, {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and ten.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[], double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[], double[]) with 'double[][]', 'double[]', 'double[]'; when array of double with two and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[], double[])"})
  void testCheckDataWithDoubleDoubleDouble_whenArrayOfDoubleWithTwoAndTen() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d}));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[][], double[])} with {@code
   * double[][]}, {@code double[][]}, {@code double[]}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and ten.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[][],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[][], double[]) with 'double[][]', 'double[][]', 'double[]'; when array of double with two and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[][], double[])"})
  void testCheckDataWithDoubleDoubleDouble_whenArrayOfDoubleWithTwoAndTen2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d}));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[], double[])} with {@code
   * double[][]}, {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[], double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[], double[]) with 'double[][]', 'double[]', 'double[]'; when empty 2D array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[], double[])"})
  void testCheckDataWithDoubleDoubleDouble_whenEmpty2dArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    new double[][] {},
                    new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d}));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[][], double[])} with {@code
   * double[][]}, {@code double[][]}, {@code double[]}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[][],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[][], double[]) with 'double[][]', 'double[][]', 'double[]'; when empty 2D array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[][], double[])"})
  void testCheckDataWithDoubleDoubleDouble_whenEmpty2dArrayOfDouble2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    new double[][] {},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d}));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[], double[])} with {@code
   * double[][]}, {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[], double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[], double[]) with 'double[][]', 'double[]', 'double[]'; when empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[], double[])"})
  void testCheckDataWithDoubleDoubleDouble_whenEmptyArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                    new double[] {}));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[][], double[])} with {@code
   * double[][]}, {@code double[][]}, {@code double[]}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[][],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[][], double[]) with 'double[][]', 'double[][]', 'double[]'; when empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[][], double[])"})
  void testCheckDataWithDoubleDoubleDouble_whenEmptyArrayOfDouble2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {}));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[], double[])} with {@code
   * double[][]}, {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[], double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[], double[]) with 'double[][]', 'double[]', 'double[]'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[], double[])"})
  void testCheckDataWithDoubleDoubleDouble_whenNull() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                    null));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[], double[])} with {@code
   * double[][]}, {@code double[]}, {@code double[]}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[], double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[], double[]) with 'double[][]', 'double[]', 'double[]'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[], double[])"})
  void testCheckDataWithDoubleDoubleDouble_whenNull2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    null,
                    new double[] {10.0d, 0.5d, 10.0d, 0.5d},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d}));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[][], double[])} with {@code
   * double[][]}, {@code double[][]}, {@code double[]}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[][],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[][], double[]) with 'double[][]', 'double[][]', 'double[]'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[][], double[])"})
  void testCheckDataWithDoubleDoubleDouble_whenNull3() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    null));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[][], double[])} with {@code
   * double[][]}, {@code double[][]}, {@code double[]}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[][],
   * double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[][], double[]) with 'double[][]', 'double[][]', 'double[]'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[][], double[])"})
  void testCheckDataWithDoubleDoubleDouble_whenNull4() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    null,
                    new double[][] {new double[] {10.0d, 0.5d, 10.0d, 0.5d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d}));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[])} with {@code double[][]},
   * {@code double[]}.
   *
   * <ul>
   *   <li>When array of {@code double} with two and ten.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[]) with 'double[][]', 'double[]'; when array of double with two and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[])"})
  void testCheckDataWithDoubleDouble_whenArrayOfDoubleWithTwoAndTen() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}},
                    new double[] {3.0d, 10.0d, 3.0d, 10.0d}));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[])} with {@code double[][]},
   * {@code double[]}.
   *
   * <ul>
   *   <li>When empty 2D array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[]) with 'double[][]', 'double[]'; when empty 2D array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[])"})
  void testCheckDataWithDoubleDouble_whenEmpty2dArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(new double[][] {}, new double[] {3.0d, 10.0d, 3.0d, 10.0d}));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[])} with {@code double[][]},
   * {@code double[]}.
   *
   * <ul>
   *   <li>When empty array of {@code double}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[])}
   */
  @Test
  @DisplayName(
      "Test checkData(double[][], double[]) with 'double[][]', 'double[]'; when empty array of double")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[])"})
  void testCheckDataWithDoubleDouble_whenEmptyArrayOfDouble() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(
                    new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}}, new double[] {}));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[])} with {@code double[][]},
   * {@code double[]}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[])}
   */
  @Test
  @DisplayName("Test checkData(double[][], double[]) with 'double[][]', 'double[]'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[])"})
  void testCheckDataWithDoubleDouble_whenNull() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}}, null));
  }

  /**
   * Test {@link LeastSquaresRegression#checkData(double[][], double[])} with {@code double[][]},
   * {@code double[]}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#checkData(double[][], double[])}
   */
  @Test
  @DisplayName("Test checkData(double[][], double[]) with 'double[][]', 'double[]'; when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void LeastSquaresRegression.checkData(double[][], double[])"})
  void testCheckDataWithDoubleDouble_whenNull2() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            new GeneralizedLeastSquaresRegression()
                .checkData(null, new double[] {3.0d, 10.0d, 3.0d, 10.0d}));
  }

  /**
   * Test {@link LeastSquaresRegression#addInterceptVariable(double[][], boolean)}.
   *
   * <ul>
   *   <li>Then return first element is array of {@code double} with one and two.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#addInterceptVariable(double[][], boolean)}
   */
  @Test
  @DisplayName(
      "Test addInterceptVariable(double[][], boolean); then return first element is array of double with one and two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] LeastSquaresRegression.addInterceptVariable(double[][], boolean)"})
  void testAddInterceptVariable_thenReturnFirstElementIsArrayOfDoubleWithOneAndTwo() {
    // Arrange and Act
    double[][] actualAddInterceptVariableResult =
        new GeneralizedLeastSquaresRegression()
            .addInterceptVariable(new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}}, true);

    // Assert
    assertEquals(1, actualAddInterceptVariableResult.length);
    assertArrayEquals(
        new double[] {1.0d, 2.0d, 10.0d, 2.0d, 10.0d}, actualAddInterceptVariableResult[0], 0.0);
  }

  /**
   * Test {@link LeastSquaresRegression#addInterceptVariable(double[][], boolean)}.
   *
   * <ul>
   *   <li>Then return first element is array of {@code double} with two and ten.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#addInterceptVariable(double[][], boolean)}
   */
  @Test
  @DisplayName(
      "Test addInterceptVariable(double[][], boolean); then return first element is array of double with two and ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] LeastSquaresRegression.addInterceptVariable(double[][], boolean)"})
  void testAddInterceptVariable_thenReturnFirstElementIsArrayOfDoubleWithTwoAndTen() {
    // Arrange and Act
    double[][] actualAddInterceptVariableResult =
        new GeneralizedLeastSquaresRegression()
            .addInterceptVariable(new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}}, false);

    // Assert
    assertEquals(1, actualAddInterceptVariableResult.length);
    assertArrayEquals(
        new double[] {2.0d, 10.0d, 2.0d, 10.0d}, actualAddInterceptVariableResult[0], 0.0);
  }

  /**
   * Test {@link LeastSquaresRegression#convertArray(double[])} with {@code double[]}.
   *
   * <p>Method under test: {@link LeastSquaresRegression#convertArray(double[])}
   */
  @Test
  @DisplayName("Test convertArray(double[]) with 'double[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] LeastSquaresRegression.convertArray(double[])"})
  void testConvertArrayWithDouble() {
    // Arrange and Act
    double[] actualConvertArrayResult =
        new GeneralizedLeastSquaresRegression()
            .convertArray(new double[] {2.0d, 10.0d, 2.0d, 10.0d});

    // Assert
    assertArrayEquals(new double[] {2.0d, 10.0d, 2.0d, 10.0d}, actualConvertArrayResult, 0.0);
  }

  /**
   * Test {@link LeastSquaresRegression#convertArray(double[][])} with {@code double[][]}.
   *
   * <ul>
   *   <li>Then return array length is one.
   * </ul>
   *
   * <p>Method under test: {@link LeastSquaresRegression#convertArray(double[][])}
   */
  @Test
  @DisplayName("Test convertArray(double[][]) with 'double[][]'; then return array length is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] LeastSquaresRegression.convertArray(double[][])"})
  void testConvertArrayWithDouble_thenReturnArrayLengthIsOne() {
    // Arrange and Act
    double[][] actualConvertArrayResult =
        new GeneralizedLeastSquaresRegression()
            .convertArray(new double[][] {new double[] {2.0d, 10.0d, 2.0d, 10.0d}});

    // Assert
    assertEquals(1, actualConvertArrayResult.length);
    assertArrayEquals(new double[] {2.0d, 10.0d, 2.0d, 10.0d}, actualConvertArrayResult[0], 0.0);
  }
}
