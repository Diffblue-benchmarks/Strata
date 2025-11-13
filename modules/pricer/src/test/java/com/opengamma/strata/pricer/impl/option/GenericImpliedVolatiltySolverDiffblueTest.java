package com.opengamma.strata.pricer.impl.option;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.math.MathException;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GenericImpliedVolatiltySolverDiffblueTest {
  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double)} with {@code optionPrice}.
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double)}
   */
  @Test
  @DisplayName("Test impliedVolatility(double) with 'optionPrice'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double)"})
  void testImpliedVolatilityWithOptionPrice() {
    // Arrange
    Function<Double, double[]> priceAndVegaFunc = mock(Function.class);
    when(priceAndVegaFunc.apply(Mockito.<Double>any()))
        .thenReturn(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act
    double actualImpliedVolatilityResult =
        new GenericImpliedVolatiltySolver(priceAndVegaFunc).impliedVolatility(10.0d);

    // Assert
    verify(priceAndVegaFunc, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(0.3d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double)} with {@code optionPrice}.
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double)}
   */
  @Test
  @DisplayName("Test impliedVolatility(double) with 'optionPrice'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double)"})
  void testImpliedVolatilityWithOptionPrice2() {
    // Arrange
    Function<Double, double[]> priceAndVegaFunc = mock(Function.class);
    when(priceAndVegaFunc.apply(Mockito.<Double>any()))
        .thenReturn(new double[] {0.3d, 0.1d, 0.3d, 0.1d, 0.3d, 0.1d, 0.3d, 0.1d});

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new GenericImpliedVolatiltySolver(priceAndVegaFunc).impliedVolatility(10.0d));
    verify(priceAndVegaFunc, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)} with {@code
   * optionPrice}, {@code volGuess}.
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)}
   */
  @Test
  @DisplayName("Test impliedVolatility(double, double) with 'optionPrice', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double, double)"})
  void testImpliedVolatilityWithOptionPriceVolGuess() {
    // Arrange
    Function<Double, double[]> priceAndVegaFunc = mock(Function.class);
    when(priceAndVegaFunc.apply(Mockito.<Double>any()))
        .thenReturn(new double[] {10.0d, 0.5d, 10.0d, 0.5d});

    // Act
    double actualImpliedVolatilityResult =
        new GenericImpliedVolatiltySolver(priceAndVegaFunc).impliedVolatility(10.0d, 10.0d);

    // Assert
    verify(priceAndVegaFunc, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(10.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)} with {@code
   * optionPrice}, {@code volGuess}.
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)}
   */
  @Test
  @DisplayName("Test impliedVolatility(double, double) with 'optionPrice', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double, double)"})
  void testImpliedVolatilityWithOptionPriceVolGuess2() {
    // Arrange
    Function<Double, double[]> priceAndVegaFunc = mock(Function.class);
    when(priceAndVegaFunc.apply(Mockito.<Double>any())).thenThrow(new MathException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new GenericImpliedVolatiltySolver(priceAndVegaFunc).impliedVolatility(10.0d, 10.0d));
    verify(priceAndVegaFunc).apply(9.9d);
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)} with {@code
   * optionPrice}, {@code volGuess}.
   *
   * <ul>
   *   <li>Given {@link Function} {@link Function#apply(Object)} return {@code 0.1}.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double) with 'optionPrice', 'volGuess'; given Function apply(Object) return '0.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double, double)"})
  void testImpliedVolatilityWithOptionPriceVolGuess_givenFunctionApplyReturn01() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(0.1d);
    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, mock(Function.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> genericImpliedVolatiltySolver.impliedVolatility(10.0d, 10.0d));
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)} with {@code
   * optionPrice}, {@code volGuess}.
   *
   * <ul>
   *   <li>Given {@link Function} {@link Function#apply(Object)} return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double) with 'optionPrice', 'volGuess'; given Function apply(Object) return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double, double)"})
  void testImpliedVolatilityWithOptionPriceVolGuess_givenFunctionApplyReturnNaN() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(Double.NaN);
    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, mock(Function.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> genericImpliedVolatiltySolver.impliedVolatility(10.0d, 10.0d));
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)} with {@code
   * optionPrice}, {@code volGuess}.
   *
   * <ul>
   *   <li>Given {@link Function} {@link Function#apply(Object)} return zero.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double) with 'optionPrice', 'volGuess'; given Function apply(Object) return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double, double)"})
  void testImpliedVolatilityWithOptionPriceVolGuess_givenFunctionApplyReturnZero() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> vegaFunc = mock(Function.class);
    when(vegaFunc.apply(Mockito.<Double>any())).thenReturn(0.0d);

    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, vegaFunc);

    // Act
    double actualImpliedVolatilityResult =
        genericImpliedVolatiltySolver.impliedVolatility(10.0d, 10.0d);

    // Assert
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
    verify(vegaFunc).apply(10.0d);
    assertEquals(10.1d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)} with {@code
   * optionPrice}, {@code volGuess}.
   *
   * <ul>
   *   <li>Then return {@code 10.1}.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double) with 'optionPrice', 'volGuess'; then return '10.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double, double)"})
  void testImpliedVolatilityWithOptionPriceVolGuess_thenReturn101() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> vegaFunc = mock(Function.class);
    when(vegaFunc.apply(Mockito.<Double>any())).thenReturn(Double.NaN);

    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, vegaFunc);

    // Act
    double actualImpliedVolatilityResult =
        genericImpliedVolatiltySolver.impliedVolatility(10.0d, 10.0d);

    // Assert
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
    verify(vegaFunc).apply(10.0d);
    assertEquals(10.1d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)} with {@code
   * optionPrice}, {@code volGuess}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double) with 'optionPrice', 'volGuess'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double, double)"})
  void testImpliedVolatilityWithOptionPriceVolGuess_thenReturnTen() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> vegaFunc = mock(Function.class);
    when(vegaFunc.apply(Mockito.<Double>any())).thenReturn(10.0d);

    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, vegaFunc);

    // Act
    double actualImpliedVolatilityResult =
        genericImpliedVolatiltySolver.impliedVolatility(10.0d, 10.0d);

    // Assert
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
    verify(vegaFunc).apply(10.0d);
    assertEquals(10.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)} with {@code
   * optionPrice}, {@code volGuess}.
   *
   * <ul>
   *   <li>When {@code 0.1}.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)}
   */
  @Test
  @DisplayName("Test impliedVolatility(double, double) with 'optionPrice', 'volGuess'; when '0.1'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double, double)"})
  void testImpliedVolatilityWithOptionPriceVolGuess_when01() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(10.0d);
    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, mock(Function.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> genericImpliedVolatiltySolver.impliedVolatility(0.1d, 10.0d));
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)} with {@code
   * optionPrice}, {@code volGuess}.
   *
   * <ul>
   *   <li>When {@code 9.9}.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)}
   */
  @Test
  @DisplayName("Test impliedVolatility(double, double) with 'optionPrice', 'volGuess'; when '9.9'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double, double)"})
  void testImpliedVolatilityWithOptionPriceVolGuess_when99() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(10.0d);
    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, mock(Function.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> genericImpliedVolatiltySolver.impliedVolatility(9.9d, 10.0d));
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)} with {@code
   * optionPrice}, {@code volGuess}.
   *
   * <ul>
   *   <li>When {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double) with 'optionPrice', 'volGuess'; when POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double, double)"})
  void testImpliedVolatilityWithOptionPriceVolGuess_whenPositive_infinity() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(10.0d);
    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, mock(Function.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> genericImpliedVolatiltySolver.impliedVolatility(Double.POSITIVE_INFINITY, 10.0d));
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double)} with {@code optionPrice}.
   *
   * <ul>
   *   <li>Given {@link Function} {@link Function#apply(Object)} return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double) with 'optionPrice'; given Function apply(Object) return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double)"})
  void testImpliedVolatilityWithOptionPrice_givenFunctionApplyReturnNaN() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(Double.NaN);
    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, mock(Function.class));

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> genericImpliedVolatiltySolver.impliedVolatility(10.0d));
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double)} with {@code optionPrice}.
   *
   * <ul>
   *   <li>Given {@link Function} {@link Function#apply(Object)} return {@link Double#NaN}.
   *   <li>Then return {@code 0.4}.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double) with 'optionPrice'; given Function apply(Object) return NaN; then return '0.4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double)"})
  void testImpliedVolatilityWithOptionPrice_givenFunctionApplyReturnNaN_thenReturn04() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> vegaFunc = mock(Function.class);
    when(vegaFunc.apply(Mockito.<Double>any())).thenReturn(Double.NaN);

    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, vegaFunc);

    // Act
    double actualImpliedVolatilityResult = genericImpliedVolatiltySolver.impliedVolatility(10.0d);

    // Assert
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
    verify(vegaFunc).apply(0.3d);
    assertEquals(0.4d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double)} with {@code optionPrice}.
   *
   * <ul>
   *   <li>Given {@link Function} {@link Function#apply(Object)} return ten.
   *   <li>Then return {@code 0.3}.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double) with 'optionPrice'; given Function apply(Object) return ten; then return '0.3'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double)"})
  void testImpliedVolatilityWithOptionPrice_givenFunctionApplyReturnTen_thenReturn03() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> vegaFunc = mock(Function.class);
    when(vegaFunc.apply(Mockito.<Double>any())).thenReturn(10.0d);

    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, vegaFunc);

    // Act
    double actualImpliedVolatilityResult = genericImpliedVolatiltySolver.impliedVolatility(10.0d);

    // Assert
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
    verify(vegaFunc).apply(0.3d);
    assertEquals(0.3d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double)} with {@code optionPrice}.
   *
   * <ul>
   *   <li>Given {@link Function} {@link Function#apply(Object)} return zero.
   *   <li>Then return {@code 0.4}.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double) with 'optionPrice'; given Function apply(Object) return zero; then return '0.4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double)"})
  void testImpliedVolatilityWithOptionPrice_givenFunctionApplyReturnZero_thenReturn04() {
    // Arrange
    Function<Double, Double> priceFunc = mock(Function.class);
    when(priceFunc.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> vegaFunc = mock(Function.class);
    when(vegaFunc.apply(Mockito.<Double>any())).thenReturn(0.0d);

    GenericImpliedVolatiltySolver genericImpliedVolatiltySolver =
        new GenericImpliedVolatiltySolver(priceFunc, vegaFunc);

    // Act
    double actualImpliedVolatilityResult = genericImpliedVolatiltySolver.impliedVolatility(10.0d);

    // Assert
    verify(priceFunc, atLeast(1)).apply(Mockito.<Double>any());
    verify(vegaFunc).apply(0.3d);
    assertEquals(0.4d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link GenericImpliedVolatiltySolver#impliedVolatility(double)} with {@code optionPrice}.
   *
   * <ul>
   *   <li>Given {@link Function} {@link Function#apply(Object)} throw {@link
   *       MathException#MathException()}.
   * </ul>
   *
   * <p>Method under test: {@link GenericImpliedVolatiltySolver#impliedVolatility(double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double) with 'optionPrice'; given Function apply(Object) throw MathException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double GenericImpliedVolatiltySolver.impliedVolatility(double)"})
  void testImpliedVolatilityWithOptionPrice_givenFunctionApplyThrowMathException() {
    // Arrange
    Function<Double, double[]> priceAndVegaFunc = mock(Function.class);
    when(priceAndVegaFunc.apply(Mockito.<Double>any())).thenThrow(new MathException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> new GenericImpliedVolatiltySolver(priceAndVegaFunc).impliedVolatility(10.0d));
    verify(priceAndVegaFunc).apply(0.19999999999999998d);
  }
}
