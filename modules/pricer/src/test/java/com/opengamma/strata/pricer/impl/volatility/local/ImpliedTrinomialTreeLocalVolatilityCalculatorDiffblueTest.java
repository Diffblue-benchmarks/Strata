package com.opengamma.strata.pricer.impl.volatility.local;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.tuple.DoublesPair;
import com.opengamma.strata.market.surface.DefaultSurfaceMetadata;
import com.opengamma.strata.market.surface.InterpolatedNodalSurface;
import com.opengamma.strata.market.surface.Surface;
import com.opengamma.strata.market.surface.SurfaceName;
import com.opengamma.strata.market.surface.interpolator.GridSurfaceInterpolator;
import com.opengamma.strata.pricer.fxopt.RecombiningTrinomialTreeData;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ImpliedTrinomialTreeLocalVolatilityCalculatorDiffblueTest {
  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName("Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(1, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
                impliedVolatilitySurface, 10.0d, interestRate, mock(Function.class)));
    verify(impliedVolatilitySurface).zValue(isA(DoublesPair.class));
    verify(interestRate).apply(10.0d);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName("Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility2() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(1, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
                impliedVolatilitySurface, 10.0d, interestRate, dividendRate));
    verify(impliedVolatilitySurface).zValue(isA(DoublesPair.class));
    verify(interestRate).apply(10.0d);
    verify(dividendRate).apply(10.0d);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName("Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility3() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray zValues = actualLocalVolatilityFromImpliedVolatilityResult.getZValues();
    assertEquals(1.477875875184979E16d, zValues.min());
    List<Double> toListResult = zValues.toList();
    assertEquals(2, toListResult.size());
    assertEquals(1.477875875184979E16d, toListResult.get(0).doubleValue());
    assertEquals(2.0900321061906048E16d, zValues.max());
    assertEquals(2.0900321061906048E16d, toListResult.get(1).doubleValue());
    assertEquals(3.567907981375584E16d, zValues.sum());
    assertArrayEquals(
        new double[] {1.477875875184979E16d, 2.0900321061906048E16d}, zValues.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.000000000000002d},
        actualLocalVolatilityFromImpliedVolatilityResult.getYValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {5.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName("Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility4() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(4, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray zValues = actualLocalVolatilityFromImpliedVolatilityResult.getZValues();
    List<Double> toListResult = zValues.toList();
    assertEquals(10, toListResult.size());
    assertEquals(2.2597146119891135E11d, zValues.min());
    assertEquals(2.2597146119891135E11d, toListResult.get(0).doubleValue());
    assertEquals(3.195719051362761E11d, toListResult.get(1).doubleValue());
    assertEquals(3.5007348237603436E11d, toListResult.get(8).doubleValue());
    assertArrayEquals(
        new double[] {
          10.0d,
          10.0d,
          1.2774849224904235E-11d,
          9.999999999999998d,
          7.827881037143874E12d,
          1.6319677271903636E-23d,
          1.2774849224904235E-11d,
          9.999999999999998d,
          7.827881037143873E12d,
          6.127572153167665E24d
        },
        actualLocalVolatilityFromImpliedVolatilityResult.getYValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          2.2597146119891135E11d,
          3.195719051362761E11d,
          3.5007348237603436E11d,
          3.5007348237603436E11d,
          3.5007348237603436E11d,
          3.500734823760343E11d,
          3.5007348237603436E11d,
          3.5007348237603436E11d,
          3.5007348237603436E11d,
          3.500734823760344E11d
        },
        zValues.toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {2.5d, 5.0d, 7.5d, 7.5d, 7.5d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName("Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility5() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 4.368234204907535E34d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    assertTrue(
        actualLocalVolatilityFromImpliedVolatilityResult.getMetadata()
            instanceof DefaultSurfaceMetadata);
    assertTrue(
        actualLocalVolatilityFromImpliedVolatilityResult.getInterpolator()
            instanceof GridSurfaceInterpolator);
    DoubleArray yValues = actualLocalVolatilityFromImpliedVolatilityResult.getYValues();
    assertEquals(4.368234204907535E34d, yValues.max());
    assertEquals(4.368234204907535E34d, yValues.min());
    assertEquals(8.73646840981507E34d, yValues.sum());
    assertArrayEquals(
        new double[] {1.477875875184979E16d, 2.0900321061906048E16d},
        actualLocalVolatilityFromImpliedVolatilityResult.getZValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {4.368234204907535E34d, 4.368234204907535E34d}, yValues.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {5.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName("Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility6() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(-10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray zValues = actualLocalVolatilityFromImpliedVolatilityResult.getZValues();
    List<Double> toListResult = zValues.toList();
    assertEquals(2, toListResult.size());
    assertEquals(2.355342527860876E34d, zValues.min());
    assertEquals(2.355342527860876E34d, toListResult.get(0).doubleValue());
    assertEquals(3.33095734693498E34d, zValues.max());
    assertEquals(3.33095734693498E34d, toListResult.get(1).doubleValue());
    assertEquals(5.686299874795856E34d, zValues.sum());
    assertArrayEquals(
        new double[] {10.0d, 10.000000000000002d},
        actualLocalVolatilityFromImpliedVolatilityResult.getYValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {2.355342527860876E34d, 3.33095734693498E34d}, zValues.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {5.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName("Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility7() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(4, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(4.368234204907535E34d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray zValues = actualLocalVolatilityFromImpliedVolatilityResult.getZValues();
    List<Double> toListResult = zValues.toList();
    assertEquals(10, toListResult.size());
    assertEquals(Double.NaN, toListResult.get(8).doubleValue());
    assertEquals(Double.NaN, toListResult.get(9).doubleValue());
    assertArrayEquals(
        new double[] {
          10.0d,
          10.0d,
          1.2774849224904235E-11d,
          9.999999999999998d,
          7.827881037143874E12d,
          1.6319677271903636E-23d,
          1.2774849224904235E-11d,
          9.999999999999998d,
          7.827881037143873E12d,
          6.127572153167665E24d
        },
        actualLocalVolatilityFromImpliedVolatilityResult.getYValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {2.5d, 5.0d, 7.5d, 7.5d, 7.5d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN
        },
        zValues.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Given {@code 1.0E13}.
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code 1.0E13}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); given '1.0E13'; when Function apply(Object) return '1.0E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_given10e13_whenFunctionApplyReturn10e13() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(1.0E13d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray zValues = actualLocalVolatilityFromImpliedVolatilityResult.getZValues();
    List<Double> toListResult = zValues.toList();
    assertEquals(2, toListResult.size());
    assertEquals(Double.NaN, zValues.max());
    assertEquals(Double.NaN, zValues.min());
    assertEquals(Double.NaN, zValues.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {10.0d, 10.000000000000002d},
        actualLocalVolatilityFromImpliedVolatilityResult.getYValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {5.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(new double[] {Double.NaN, Double.NaN}, zValues.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>When {@link Function} {@link Function#apply(Object)} return zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); given zero; when Function apply(Object) return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_givenZero_whenFunctionApplyReturnZero() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(0.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
                impliedVolatilitySurface, 10.0d, interestRate, dividendRate));
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return Name Name is {@code localVol_null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); then return Name Name is 'localVol_null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_thenReturnNameNameIsLocalVolNull() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(null);
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals(
        "localVol_null", actualLocalVolatilityFromImpliedVolatilityResult.getName().getName());
    assertArrayEquals(
        new double[] {1.477875875184979E16d, 2.0900321061906048E16d},
        actualLocalVolatilityFromImpliedVolatilityResult.getZValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.000000000000002d},
        actualLocalVolatilityFromImpliedVolatilityResult.getYValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {5.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return XValues sum is twenty-five.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); then return XValues sum is twenty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_thenReturnXValuesSumIsTwentyFive() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(4, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(0.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray xValues = actualLocalVolatilityFromImpliedVolatilityResult.getXValues();
    assertEquals(25.0d, xValues.sum());
    assertEquals(4, xValues.size());
    DoubleArray yValues = actualLocalVolatilityFromImpliedVolatilityResult.getYValues();
    assertEquals(4, yValues.size());
    DoubleArray zValues = actualLocalVolatilityFromImpliedVolatilityResult.getZValues();
    assertEquals(4, zValues.size());
    assertEquals(4, actualLocalVolatilityFromImpliedVolatilityResult.getParameterCount());
    assertEquals(4, xValues.toList().size());
    assertEquals(4, yValues.toList().size());
    assertEquals(4, zValues.toList().size());
    assertEquals(40.0d, yValues.sum());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d, 10.0d}, yValues.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {2.5d, 5.0d, 7.5d, 10.0d}, xValues.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN},
        zValues.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return YValues max is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); then return YValues max is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_thenReturnYValuesMaxIsTen() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(0.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray yValues = actualLocalVolatilityFromImpliedVolatilityResult.getYValues();
    assertEquals(10.0d, yValues.max());
    assertArrayEquals(new double[] {10.0d, 10.0d}, yValues.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {5.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN},
        actualLocalVolatilityFromImpliedVolatilityResult.getZValues().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return YValues toList size is ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); then return YValues toList size is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_thenReturnYValuesToListSizeIsTen() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(4, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 4.368234204907535E34d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    assertTrue(
        actualLocalVolatilityFromImpliedVolatilityResult.getMetadata()
            instanceof DefaultSurfaceMetadata);
    assertTrue(
        actualLocalVolatilityFromImpliedVolatilityResult.getInterpolator()
            instanceof GridSurfaceInterpolator);
    DoubleArray yValues = actualLocalVolatilityFromImpliedVolatilityResult.getYValues();
    assertEquals(10, yValues.toList().size());
    DoubleArray zValues = actualLocalVolatilityFromImpliedVolatilityResult.getZValues();
    assertEquals(2.259714611989114E11d, zValues.min());
    assertEquals(2.676667027250591E58d, yValues.max());
    assertEquals(2.67666702725743E58d, yValues.sum());
    assertEquals(7.128817247218155E10d, yValues.min());
    assertArrayEquals(
        new double[] {
          2.259714611989114E11d,
          3.1957190513627625E11d,
          3.500734823760344E11d,
          3.5007348237603436E11d,
          3.5007348237603436E11d,
          3.500734823760344E11d,
          3.500734823760344E11d,
          3.5007348237603436E11d,
          3.500734823760344E11d,
          3.500734823760344E11d
        },
        zValues.toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {2.5d, 5.0d, 7.5d, 7.5d, 7.5d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          4.368234204907535E34d,
          4.368234204907535E34d,
          5.580353334676319E22d,
          4.3682342049075345E34d,
          3.4194017698398947E46d,
          7.128817247218155E10d,
          5.580353334676319E22d,
          4.3682342049075345E34d,
          3.419401769839894E46d,
          2.676667027250591E58d
        },
        yValues.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return ZValues max is {@code 12.710440782519743}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); then return ZValues max is '12.710440782519743'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_thenReturnZValuesMaxIs12710440782519743() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(3.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray zValues = actualLocalVolatilityFromImpliedVolatilityResult.getZValues();
    assertEquals(12.710440782519743d, zValues.max());
    List<Double> toListResult = zValues.toList();
    assertEquals(2, toListResult.size());
    assertEquals(12.710440782519743d, toListResult.get(1).doubleValue());
    assertEquals(21.921568248902247d, zValues.sum());
    assertEquals(9.211127466382502d, zValues.min());
    assertEquals(9.211127466382502d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {10.0d, 10.000000000000002d},
        actualLocalVolatilityFromImpliedVolatilityResult.getYValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {5.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {9.211127466382502d, 12.710440782519743d}, zValues.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return ZValues max is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); then return ZValues max is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_thenReturnZValuesMaxIsNaN() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(4.368234204907535E34d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray zValues = actualLocalVolatilityFromImpliedVolatilityResult.getZValues();
    List<Double> toListResult = zValues.toList();
    assertEquals(2, toListResult.size());
    assertEquals(Double.NaN, zValues.max());
    assertEquals(Double.NaN, zValues.min());
    assertEquals(Double.NaN, zValues.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {10.0d, 10.000000000000002d},
        actualLocalVolatilityFromImpliedVolatilityResult.getYValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {5.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(new double[] {Double.NaN, Double.NaN}, zValues.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return ZValues max is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); then return ZValues max is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_thenReturnZValuesMaxIsNaN2() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(4.368234204907535E34d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(impliedVolatilitySurface).getName();
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray zValues = actualLocalVolatilityFromImpliedVolatilityResult.getZValues();
    List<Double> toListResult = zValues.toList();
    assertEquals(2, toListResult.size());
    assertEquals(Double.NaN, zValues.max());
    assertEquals(Double.NaN, zValues.min());
    assertEquals(Double.NaN, zValues.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {10.0d, 10.000000000000002d},
        actualLocalVolatilityFromImpliedVolatilityResult.getYValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {5.0d, 10.0d},
        actualLocalVolatilityFromImpliedVolatilityResult.getXValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(new double[] {Double.NaN, Double.NaN}, zValues.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return minus ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); when Function apply(Object) return minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_whenFunctionApplyReturnMinusTen() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(-10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
                impliedVolatilitySurface, 10.0d, interestRate, dividendRate));
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>When {@link Function} {@link Function#apply(Object)} return minus ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromImpliedVolatility(Surface,
   * double, Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromImpliedVolatility(Surface, double, Function, Function); when Function apply(Object) return minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromImpliedVolatility_whenFunctionApplyReturnMinusTen2() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(4, 10.0d);

    Surface impliedVolatilitySurface = mock(Surface.class);
    when(impliedVolatilitySurface.zValue(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(-10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromImpliedVolatility(
                impliedVolatilitySurface, 10.0d, interestRate, dividendRate));
    verify(impliedVolatilitySurface, atLeast(1)).zValue(Mockito.<DoublesPair>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName("Test calibrateImpliedVolatility(Function, double, Function, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(1.0E13d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    RecombiningTrinomialTreeData actualCalibrateImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(impliedVolatilitySurface, atLeast(1)).apply(Mockito.<DoublesPair>any());
    assertEquals(20, actualCalibrateImpliedVolatilityResult.getTransitionProbability().size());
    assertEquals(21, actualCalibrateImpliedVolatilityResult.getStateValue().toArrayUnsafe().length);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d
        },
        actualCalibrateImpliedVolatilityResult.getDiscountFactor().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d,
          0.15d,
          0.3d,
          0.44999999999999996d,
          0.6d,
          0.75d,
          0.8999999999999999d,
          1.05d,
          1.2d,
          1.3499999999999999d,
          1.5d,
          1.65d,
          1.7999999999999998d,
          1.95d,
          2.1d,
          2.25d,
          2.4d,
          2.55d,
          2.6999999999999997d,
          2.85d,
          3.0d
        },
        actualCalibrateImpliedVolatilityResult.getTime().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName("Test calibrateImpliedVolatility(Function, double, Function, Function)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility2() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(1.0E-13d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(1.0E13d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    RecombiningTrinomialTreeData actualCalibrateImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(impliedVolatilitySurface, atLeast(1)).apply(Mockito.<DoublesPair>any());
    assertEquals(20, actualCalibrateImpliedVolatilityResult.getTransitionProbability().size());
    assertEquals(21, actualCalibrateImpliedVolatilityResult.getStateValue().toArrayUnsafe().length);
    assertArrayEquals(
        new double[] {
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d,
          0.0d, 0.0d, 0.0d, 0.0d, 0.0d
        },
        actualCalibrateImpliedVolatilityResult.getDiscountFactor().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d,
          0.15d,
          0.3d,
          0.44999999999999996d,
          0.6d,
          0.75d,
          0.8999999999999999d,
          1.05d,
          1.2d,
          1.3499999999999999d,
          1.5d,
          1.65d,
          1.7999999999999998d,
          1.95d,
          2.1d,
          2.25d,
          2.4d,
          2.55d,
          2.6999999999999997d,
          2.85d,
          3.0d
        },
        actualCalibrateImpliedVolatilityResult.getTime().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); given IllegalArgumentException()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_givenIllegalArgumentException() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
                impliedVolatilitySurface, 10.0d, interestRate, dividendRate));
    verify(impliedVolatilitySurface).apply(isA(DoublesPair.class));
    verify(interestRate).apply(3.0d);
    verify(dividendRate).apply(3.0d);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>When {@link Function}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); given IllegalArgumentException(); when Function")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_givenIllegalArgumentException_whenFunction() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any()))
        .thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
                impliedVolatilitySurface, 10.0d, mock(Function.class), mock(Function.class)));
    verify(impliedVolatilitySurface).apply(isA(DoublesPair.class));
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Given {@link IllegalArgumentException#IllegalArgumentException()}.
   *   <li>When {@link Function}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); given IllegalArgumentException(); when Function")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_givenIllegalArgumentException_whenFunction2() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
                impliedVolatilitySurface, 10.0d, interestRate, mock(Function.class)));
    verify(impliedVolatilitySurface).apply(isA(DoublesPair.class));
    verify(interestRate).apply(3.0d);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Given minus ten.
   *   <li>When {@link Function} {@link Function#apply(Object)} return minus ten.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); given minus ten; when Function apply(Object) return minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_givenMinusTen_whenFunctionApplyReturnMinusTen() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(3.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(-10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
                impliedVolatilitySurface, 10.0d, interestRate, dividendRate));
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(impliedVolatilitySurface, atLeast(1)).apply(Mockito.<DoublesPair>any());
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Given zero.
   *   <li>Then return DiscountFactor max is one.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); given zero; then return DiscountFactor max is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_givenZero_thenReturnDiscountFactorMaxIsOne() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(3.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(0.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    RecombiningTrinomialTreeData actualCalibrateImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(impliedVolatilitySurface, atLeast(1)).apply(Mockito.<DoublesPair>any());
    DoubleArray discountFactor = actualCalibrateImpliedVolatilityResult.getDiscountFactor();
    assertEquals(1.0d, discountFactor.max());
    assertEquals(1.0d, discountFactor.min());
    assertEquals(
        11.542803096610507d, actualCalibrateImpliedVolatilityResult.getStateValue().total());
    assertEquals(20.0d, discountFactor.sum());
    assertArrayEquals(
        new double[] {
          1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d, 1.0d,
          1.0d, 1.0d, 1.0d, 1.0d, 1.0d
        },
        discountFactor.toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d,
          0.15d,
          0.3d,
          0.44999999999999996d,
          0.6d,
          0.75d,
          0.8999999999999999d,
          1.05d,
          1.2d,
          1.3499999999999999d,
          1.5d,
          1.65d,
          1.7999999999999998d,
          1.95d,
          2.1d,
          2.25d,
          2.4d,
          2.55d,
          2.6999999999999997d,
          2.85d,
          3.0d
        },
        actualCalibrateImpliedVolatilityResult.getTime().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return DiscountFactor min is {@code 0.6376281516217727}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); then return DiscountFactor min is '0.6376281516217727'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_thenReturnDiscountFactorMinIs06376281516217727() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(3.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    RecombiningTrinomialTreeData actualCalibrateImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(impliedVolatilitySurface, atLeast(1)).apply(Mockito.<DoublesPair>any());
    DoubleArray discountFactor = actualCalibrateImpliedVolatilityResult.getDiscountFactor();
    assertEquals(0.6376281516217727d, discountFactor.min());
    assertEquals(0.6376281516217737d, discountFactor.max());
    assertEquals(12.752563032435464d, discountFactor.sum());
    assertArrayEquals(
        new double[] {
          0.6376281516217733d,
          0.6376281516217733d,
          0.6376281516217733d,
          0.6376281516217733d,
          0.6376281516217733d,
          0.6376281516217732d,
          0.6376281516217734d,
          0.6376281516217729d,
          0.6376281516217737d,
          0.6376281516217732d,
          0.6376281516217732d,
          0.6376281516217737d,
          0.6376281516217732d,
          0.6376281516217732d,
          0.6376281516217727d,
          0.6376281516217737d,
          0.6376281516217737d,
          0.6376281516217732d,
          0.6376281516217732d,
          0.6376281516217727d
        },
        discountFactor.toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d,
          0.15d,
          0.3d,
          0.44999999999999996d,
          0.6d,
          0.75d,
          0.8999999999999999d,
          1.05d,
          1.2d,
          1.3499999999999999d,
          1.5d,
          1.65d,
          1.7999999999999998d,
          1.95d,
          2.1d,
          2.25d,
          2.4d,
          2.55d,
          2.6999999999999997d,
          2.85d,
          3.0d
        },
        actualCalibrateImpliedVolatilityResult.getTime().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return Spot is {@code 10.000000000013411}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); then return Spot is '10.000000000013411'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_thenReturnSpotIs10000000000013411() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(1.0E-13d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    RecombiningTrinomialTreeData actualCalibrateImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
            impliedVolatilitySurface, 10.000000000013411d, interestRate, dividendRate);

    // Assert
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(impliedVolatilitySurface, atLeast(1)).apply(Mockito.<DoublesPair>any());
    assertEquals(10.000000000013411d, actualCalibrateImpliedVolatilityResult.getSpot());
    assertEquals(
        210.00000000014083d, actualCalibrateImpliedVolatilityResult.getStateValue().total());
    assertArrayEquals(
        new double[] {
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843018d,
          0.22313016014842943d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843062d,
          0.22313016014842899d
        },
        actualCalibrateImpliedVolatilityResult.getDiscountFactor().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d,
          0.15d,
          0.3d,
          0.44999999999999996d,
          0.6d,
          0.75d,
          0.8999999999999999d,
          1.05d,
          1.2d,
          1.3499999999999999d,
          1.5d,
          1.65d,
          1.7999999999999998d,
          1.95d,
          2.1d,
          2.25d,
          2.4d,
          2.55d,
          2.6999999999999997d,
          2.85d,
          3.0d
        },
        actualCalibrateImpliedVolatilityResult.getTime().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return StateValue total is {@code 1.0012223472029919E14}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); then return StateValue total is '1.0012223472029919E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_thenReturnStateValueTotalIs10012223472029919e14() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    RecombiningTrinomialTreeData actualCalibrateImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
            impliedVolatilitySurface, 1.0E14d, interestRate, dividendRate);

    // Assert
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(impliedVolatilitySurface, atLeast(1)).apply(Mockito.<DoublesPair>any());
    assertEquals(
        1.0012223472029919E14d, actualCalibrateImpliedVolatilityResult.getStateValue().total());
    assertEquals(1.0E14d, actualCalibrateImpliedVolatilityResult.getSpot());
    assertArrayEquals(
        new double[] {
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843018d,
          0.22313016014842943d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843062d,
          0.22313016014842899d
        },
        actualCalibrateImpliedVolatilityResult.getDiscountFactor().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d,
          0.15d,
          0.3d,
          0.44999999999999996d,
          0.6d,
          0.75d,
          0.8999999999999999d,
          1.05d,
          1.2d,
          1.3499999999999999d,
          1.5d,
          1.65d,
          1.7999999999999998d,
          1.95d,
          2.1d,
          2.25d,
          2.4d,
          2.55d,
          2.6999999999999997d,
          2.85d,
          3.0d
        },
        actualCalibrateImpliedVolatilityResult.getTime().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return TransitionProbability size is twenty.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); then return TransitionProbability size is twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_thenReturnTransitionProbabilitySizeIsTwenty() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    RecombiningTrinomialTreeData actualCalibrateImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(impliedVolatilitySurface, atLeast(1)).apply(Mockito.<DoublesPair>any());
    assertEquals(20, actualCalibrateImpliedVolatilityResult.getTransitionProbability().size());
    assertEquals(21, actualCalibrateImpliedVolatilityResult.getStateValue().toArrayUnsafe().length);
    assertArrayEquals(
        new double[] {
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843018d,
          0.22313016014842943d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843062d,
          0.22313016014842899d
        },
        actualCalibrateImpliedVolatilityResult.getDiscountFactor().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d,
          0.15d,
          0.3d,
          0.44999999999999996d,
          0.6d,
          0.75d,
          0.8999999999999999d,
          1.05d,
          1.2d,
          1.3499999999999999d,
          1.5d,
          1.65d,
          1.7999999999999998d,
          1.95d,
          2.1d,
          2.25d,
          2.4d,
          2.55d,
          2.6999999999999997d,
          2.85d,
          3.0d
        },
        actualCalibrateImpliedVolatilityResult.getTime().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return TransitionProbability size is twenty.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); then return TransitionProbability size is twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_thenReturnTransitionProbabilitySizeIsTwenty2() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(1.0E-13d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    RecombiningTrinomialTreeData actualCalibrateImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(impliedVolatilitySurface, atLeast(1)).apply(Mockito.<DoublesPair>any());
    assertEquals(20, actualCalibrateImpliedVolatilityResult.getTransitionProbability().size());
    assertEquals(21, actualCalibrateImpliedVolatilityResult.getStateValue().toArrayUnsafe().length);
    assertArrayEquals(
        new double[] {
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843018d,
          0.22313016014842943d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843062d,
          0.22313016014842899d
        },
        actualCalibrateImpliedVolatilityResult.getDiscountFactor().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d,
          0.15d,
          0.3d,
          0.44999999999999996d,
          0.6d,
          0.75d,
          0.8999999999999999d,
          1.05d,
          1.2d,
          1.3499999999999999d,
          1.5d,
          1.65d,
          1.7999999999999998d,
          1.95d,
          2.1d,
          2.25d,
          2.4d,
          2.55d,
          2.6999999999999997d,
          2.85d,
          3.0d
        },
        actualCalibrateImpliedVolatilityResult.getTime().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return TransitionProbability size is twenty.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); then return TransitionProbability size is twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_thenReturnTransitionProbabilitySizeIsTwenty3() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(3.0d);

    // Act
    RecombiningTrinomialTreeData actualCalibrateImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
            impliedVolatilitySurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(impliedVolatilitySurface, atLeast(1)).apply(Mockito.<DoublesPair>any());
    assertEquals(20, actualCalibrateImpliedVolatilityResult.getTransitionProbability().size());
    assertEquals(21, actualCalibrateImpliedVolatilityResult.getStateValue().toArrayUnsafe().length);
    assertArrayEquals(
        new double[] {
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843018d,
          0.22313016014842943d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843062d,
          0.22313016014842899d
        },
        actualCalibrateImpliedVolatilityResult.getDiscountFactor().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d,
          0.15d,
          0.3d,
          0.44999999999999996d,
          0.6d,
          0.75d,
          0.8999999999999999d,
          1.05d,
          1.2d,
          1.3499999999999999d,
          1.5d,
          1.65d,
          1.7999999999999998d,
          1.95d,
          2.1d,
          2.25d,
          2.4d,
          2.55d,
          2.6999999999999997d,
          2.85d,
          3.0d
        },
        actualCalibrateImpliedVolatilityResult.getTime().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return StateValue total is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#calibrateImpliedVolatility(Function, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test calibrateImpliedVolatility(Function, double, Function, Function); when zero; then return StateValue total is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "RecombiningTrinomialTreeData ImpliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(Function, double, Function, Function)"
  })
  void testCalibrateImpliedVolatility_whenZero_thenReturnStateValueTotalIsZero() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Function<DoublesPair, Double> impliedVolatilitySurface = mock(Function.class);
    when(impliedVolatilitySurface.apply(Mockito.<DoublesPair>any())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    RecombiningTrinomialTreeData actualCalibrateImpliedVolatilityResult =
        impliedTrinomialTreeLocalVolatilityCalculator.calibrateImpliedVolatility(
            impliedVolatilitySurface, 0.0d, interestRate, dividendRate);

    // Assert
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(impliedVolatilitySurface, atLeast(1)).apply(isA(DoublesPair.class));
    assertEquals(0.0d, actualCalibrateImpliedVolatilityResult.getStateValue().total());
    assertEquals(0.0d, actualCalibrateImpliedVolatilityResult.getSpot());
    assertArrayEquals(
        new double[] {
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843018d,
          0.22313016014842943d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014842982d,
          0.22313016014843062d,
          0.22313016014842899d
        },
        actualCalibrateImpliedVolatilityResult.getDiscountFactor().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          0.0d,
          0.15d,
          0.3d,
          0.44999999999999996d,
          0.6d,
          0.75d,
          0.8999999999999999d,
          1.05d,
          1.2d,
          1.3499999999999999d,
          1.5d,
          1.65d,
          1.7999999999999998d,
          1.95d,
          2.1d,
          2.25d,
          2.4d,
          2.55d,
          2.6999999999999997d,
          2.85d,
          3.0d
        },
        actualCalibrateImpliedVolatilityResult.getTime().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Given {@code 1.0E-16}.
   *   <li>Then return ZValues sum is {@code 0.06524662804306648}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromPrice(Surface, double, Function, Function); given '1.0E-16'; then return ZValues sum is '0.06524662804306648'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromPrice_given10e16_thenReturnZValuesSumIs006524662804306648() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Surface callPriceSurface = mock(Surface.class);
    when(callPriceSurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(callPriceSurface.zValue(anyDouble(), anyDouble())).thenReturn(1.0E-16d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromPriceResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(
            callPriceSurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(callPriceSurface).getName();
    verify(callPriceSurface, atLeast(1)).zValue(eq(3.0d), anyDouble());
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray zValues = actualLocalVolatilityFromPriceResult.getZValues();
    assertEquals(0.06524662804306648d, zValues.sum());
    assertEquals(1.2481811545343252E-4d, zValues.min());
    DoubleArray yValues = actualLocalVolatilityFromPriceResult.getYValues();
    assertEquals(10.018691669608947d, yValues.max());
    assertEquals(2.0442222593352612E-4d, zValues.max());
    DoubleArray xValues = actualLocalVolatilityFromPriceResult.getXValues();
    assertEquals(362, xValues.size());
    assertEquals(362, yValues.size());
    assertEquals(362, zValues.size());
    assertEquals(362, actualLocalVolatilityFromPriceResult.getParameterCount());
    assertEquals(362, xValues.toList().size());
    assertEquals(362, yValues.toList().size());
    assertEquals(362, zValues.toList().size());
    assertEquals(362, xValues.toArrayUnsafe().length);
    assertEquals(362, yValues.toArrayUnsafe().length);
    assertEquals(362, zValues.toArrayUnsafe().length);
    assertEquals(3620.001165651048d, yValues.sum());
    assertEquals(766.800000000001d, xValues.sum());
    assertEquals(9.981343203059488d, yValues.min());
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Given {@code -1.0E-16}.
   *   <li>When {@link Function} {@link Function#apply(Object)} return {@code -1.0E-16}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromPrice(Surface, double, Function, Function); given '-1.0E-16'; when Function apply(Object) return '-1.0E-16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromPrice_given10e16_whenFunctionApplyReturn10e16() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface callPriceSurface = mock(Surface.class);
    when(callPriceSurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(callPriceSurface.zValue(anyDouble(), anyDouble())).thenReturn(0.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(-1.0E-16d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromPriceResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(
            callPriceSurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(callPriceSurface).getName();
    verify(callPriceSurface, atLeast(1)).zValue(anyDouble(), eq(10.0d));
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    assertTrue(
        actualLocalVolatilityFromPriceResult.getMetadata() instanceof DefaultSurfaceMetadata);
    assertTrue(
        actualLocalVolatilityFromPriceResult.getInterpolator() instanceof GridSurfaceInterpolator);
    DoubleArray xValues = actualLocalVolatilityFromPriceResult.getXValues();
    assertEquals(10.0d, xValues.max());
    assertEquals(15.0d, xValues.sum());
    assertEquals(2, xValues.size());
    DoubleArray yValues = actualLocalVolatilityFromPriceResult.getYValues();
    assertEquals(2, yValues.size());
    DoubleArray zValues = actualLocalVolatilityFromPriceResult.getZValues();
    assertEquals(2, zValues.size());
    assertEquals(2, actualLocalVolatilityFromPriceResult.getParameterCount());
    assertEquals(2, xValues.toList().size());
    assertEquals(2, yValues.toList().size());
    assertEquals(2, zValues.toList().size());
    assertEquals(20.0d, yValues.sum());
    assertEquals(5.0d, xValues.min());
    assertArrayEquals(new double[] {10.0d, 10.0d}, yValues.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {5.0d, 10.0d}, xValues.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {Double.NaN, Double.NaN}, zValues.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Given {@code null}.
   *   <li>Then return Name Name is {@code localVol_null}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromPrice(Surface, double, Function, Function); given 'null'; then return Name Name is 'localVol_null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromPrice_givenNull_thenReturnNameNameIsLocalVolNull() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface callPriceSurface = mock(Surface.class);
    when(callPriceSurface.getName()).thenReturn(null);
    when(callPriceSurface.zValue(anyDouble(), anyDouble())).thenReturn(0.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromPriceResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(
            callPriceSurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(callPriceSurface).getName();
    verify(callPriceSurface, atLeast(1)).zValue(anyDouble(), eq(10.0d));
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    assertEquals("localVol_null", actualLocalVolatilityFromPriceResult.getName().getName());
    assertArrayEquals(
        new double[] {10.0d, 10.0d},
        actualLocalVolatilityFromPriceResult.getYValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {5.0d, 10.0d},
        actualLocalVolatilityFromPriceResult.getXValues().toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN},
        actualLocalVolatilityFromPriceResult.getZValues().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then Metadata return {@link DefaultSurfaceMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromPrice(Surface, double, Function, Function); then Metadata return DefaultSurfaceMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromPrice_thenMetadataReturnDefaultSurfaceMetadata() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(2, 10.0d);

    Surface callPriceSurface = mock(Surface.class);
    when(callPriceSurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(callPriceSurface.zValue(anyDouble(), anyDouble())).thenReturn(0.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromPriceResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(
            callPriceSurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(callPriceSurface).getName();
    verify(callPriceSurface, atLeast(1)).zValue(anyDouble(), eq(10.0d));
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    assertTrue(
        actualLocalVolatilityFromPriceResult.getMetadata() instanceof DefaultSurfaceMetadata);
    assertTrue(
        actualLocalVolatilityFromPriceResult.getInterpolator() instanceof GridSurfaceInterpolator);
    DoubleArray xValues = actualLocalVolatilityFromPriceResult.getXValues();
    assertEquals(10.0d, xValues.max());
    assertEquals(15.0d, xValues.sum());
    assertEquals(2, xValues.size());
    DoubleArray yValues = actualLocalVolatilityFromPriceResult.getYValues();
    assertEquals(2, yValues.size());
    DoubleArray zValues = actualLocalVolatilityFromPriceResult.getZValues();
    assertEquals(2, zValues.size());
    assertEquals(2, actualLocalVolatilityFromPriceResult.getParameterCount());
    assertEquals(2, xValues.toList().size());
    assertEquals(2, yValues.toList().size());
    assertEquals(2, zValues.toList().size());
    assertEquals(20.0d, yValues.sum());
    assertEquals(5.0d, xValues.min());
    assertArrayEquals(new double[] {10.0d, 10.0d}, yValues.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {5.0d, 10.0d}, xValues.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {Double.NaN, Double.NaN}, zValues.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then return XValues size is twenty.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromPrice(Surface, double, Function, Function); then return XValues size is twenty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromPrice_thenReturnXValuesSizeIsTwenty() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator();

    Surface callPriceSurface = mock(Surface.class);
    when(callPriceSurface.getName()).thenReturn(SurfaceName.of("Name"));
    when(callPriceSurface.zValue(anyDouble(), anyDouble())).thenReturn(0.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    // Act
    InterpolatedNodalSurface actualLocalVolatilityFromPriceResult =
        impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(
            callPriceSurface, 10.0d, interestRate, dividendRate);

    // Assert
    verify(callPriceSurface).getName();
    verify(callPriceSurface, atLeast(1)).zValue(3.0d, 10.0d);
    verify(dividendRate, atLeast(1)).apply(Mockito.<Double>any());
    verify(interestRate, atLeast(1)).apply(Mockito.<Double>any());
    DoubleArray xValues = actualLocalVolatilityFromPriceResult.getXValues();
    assertEquals(20, xValues.size());
    DoubleArray yValues = actualLocalVolatilityFromPriceResult.getYValues();
    assertEquals(20, yValues.size());
    DoubleArray zValues = actualLocalVolatilityFromPriceResult.getZValues();
    assertEquals(20, zValues.size());
    assertEquals(20, actualLocalVolatilityFromPriceResult.getParameterCount());
    assertEquals(20, xValues.toList().size());
    assertEquals(20, yValues.toList().size());
    assertEquals(20, zValues.toList().size());
    assertEquals(200.0d, yValues.sum());
    assertEquals(31.5d, xValues.sum());
    assertArrayEquals(
        new double[] {
          0.15d,
          0.3d,
          0.44999999999999996d,
          0.6d,
          0.75d,
          0.8999999999999999d,
          1.05d,
          1.2d,
          1.3499999999999999d,
          1.5d,
          1.65d,
          1.7999999999999998d,
          1.95d,
          2.1d,
          2.25d,
          2.4d,
          2.55d,
          2.6999999999999997d,
          2.85d,
          3.0d
        },
        xValues.toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d,
          10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d
        },
        yValues.toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN,
          Double.NaN
        },
        zValues.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromPrice(Surface, double, Function, Function); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromPrice_thenThrowIllegalArgumentException() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(1, 10.0d);

    Surface callPriceSurface = mock(Surface.class);
    when(callPriceSurface.zValue(anyDouble(), anyDouble())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(
                callPriceSurface, 10.0d, interestRate, mock(Function.class)));
    verify(callPriceSurface).zValue(10.0d, 10.0d);
    verify(interestRate).apply(10.0d);
  }

  /**
   * Test {@link ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface,
   * double, Function, Function)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link
   * ImpliedTrinomialTreeLocalVolatilityCalculator#localVolatilityFromPrice(Surface, double,
   * Function, Function)}
   */
  @Test
  @DisplayName(
      "Test localVolatilityFromPrice(Surface, double, Function, Function); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "InterpolatedNodalSurface ImpliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(Surface, double, Function, Function)"
  })
  void testLocalVolatilityFromPrice_thenThrowIllegalArgumentException2() {
    // Arrange
    ImpliedTrinomialTreeLocalVolatilityCalculator impliedTrinomialTreeLocalVolatilityCalculator =
        new ImpliedTrinomialTreeLocalVolatilityCalculator(1, 10.0d);

    Surface callPriceSurface = mock(Surface.class);
    when(callPriceSurface.zValue(anyDouble(), anyDouble())).thenReturn(10.0d);

    Function<Double, Double> interestRate = mock(Function.class);
    when(interestRate.apply(Mockito.<Double>any())).thenReturn(10.0d);

    Function<Double, Double> dividendRate = mock(Function.class);
    when(dividendRate.apply(Mockito.<Double>any())).thenThrow(new IllegalArgumentException());

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            impliedTrinomialTreeLocalVolatilityCalculator.localVolatilityFromPrice(
                callPriceSurface, 10.0d, interestRate, dividendRate));
    verify(callPriceSurface).zValue(10.0d, 10.0d);
    verify(dividendRate).apply(10.0d);
    verify(interestRate, atLeast(1)).apply(10.0d);
  }
}
