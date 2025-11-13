package com.opengamma.strata.market.cube.interpolator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.cube.interpolator.GridCubeInterpolator.Bound;
import com.opengamma.strata.market.cube.interpolator.GridCubeInterpolator.ConstantSurfaceInterpolator;
import com.opengamma.strata.market.cube.interpolator.GridCubeInterpolator.Meta;
import com.opengamma.strata.market.curve.interpolator.BoundCurveInterpolator;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolators;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolators;
import com.opengamma.strata.market.surface.interpolator.BoundSurfaceInterpolator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class GridCubeInterpolatorDiffblueTest {
  /**
   * Test {@link GridCubeInterpolator#bind(DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link GridCubeInterpolator#bind(DoubleArray, DoubleArray, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test bind(DoubleArray, DoubleArray, DoubleArray, DoubleArray); when DoubleArray with value is ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.cube.interpolator.BoundCubeInterpolator GridCubeInterpolator.bind(DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testBind_whenDoubleArrayWithValueIsTen_thenThrowIllegalArgumentException() {
    // Arrange
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC);
    DoubleArray xValues = DoubleArray.of(10.0d);
    DoubleArray yValues = DoubleArray.filled(3);
    DoubleArray zValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.bind(xValues, yValues, zValues, DoubleArray.filled(3)));
  }

  /**
   * Test {@link GridCubeInterpolator#bind(DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return {@link Bound}.
   * </ul>
   *
   * <p>Method under test: {@link GridCubeInterpolator#bind(DoubleArray, DoubleArray, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test bind(DoubleArray, DoubleArray, DoubleArray, DoubleArray); when DoubleArray; then return Bound")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.cube.interpolator.BoundCubeInterpolator GridCubeInterpolator.bind(DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testBind_whenDoubleArray_thenReturnBound() {
    // Arrange
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC);
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();
    DoubleArray zValues = DoubleArray.of();

    // Act and Assert
    assertTrue(ofResult.bind(xValues, yValues, zValues, DoubleArray.of()) instanceof Bound);
  }

  /**
   * Test Bound {@link Bound#firstPartialDerivatives(double, double, double)}.
   *
   * <p>Method under test: {@link Bound#firstPartialDerivatives(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound firstPartialDerivatives(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives Bound.firstPartialDerivatives(double, double, double)"})
  void testBoundFirstPartialDerivatives() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.firstDerivative(anyDouble())).thenReturn(10.0d);
    when(boundCurveInterpolator.interpolate(anyDouble())).thenReturn(10.0d);

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundSurfaceInterpolator[] yzInterpolators =
        new BoundSurfaceInterpolator[] {new ConstantSurfaceInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yzInterpolators);

    // Act
    ValueDerivatives actualFirstPartialDerivativesResult =
        bound.firstPartialDerivatives(2.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).firstDerivative(2.0d);
    verify(boundCurveInterpolator, atLeast(1)).interpolate(2.0d);
    verify(xInterpolator, atLeast(1))
        .bind(
            isA(DoubleArray.class),
            Mockito.<DoubleArray>any(),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    DoubleArray derivatives = actualFirstPartialDerivativesResult.getDerivatives();
    assertEquals(1, derivatives.dimensions());
    assertEquals(10.0d, actualFirstPartialDerivativesResult.getValue());
    assertEquals(10.0d, derivatives.max());
    assertEquals(10.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, derivatives.size());
    assertEquals(30.0d, derivatives.sum());
    assertFalse(derivatives.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#firstPartialDerivatives(double, double, double)}.
   *
   * <p>Method under test: {@link Bound#firstPartialDerivatives(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound firstPartialDerivatives(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives Bound.firstPartialDerivatives(double, double, double)"})
  void testBoundFirstPartialDerivatives2() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.firstDerivative(anyDouble())).thenReturn(10.0d);
    when(boundCurveInterpolator.interpolate(anyDouble())).thenReturn(10.0d);

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            DoubleArray.of(),
            new BoundSurfaceInterpolator[] {});

    // Act
    ValueDerivatives actualFirstPartialDerivativesResult =
        bound.firstPartialDerivatives(2.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).firstDerivative(2.0d);
    verify(boundCurveInterpolator, atLeast(1)).interpolate(2.0d);
    verify(xInterpolator, atLeast(1))
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    DoubleArray derivatives = actualFirstPartialDerivativesResult.getDerivatives();
    assertEquals(1, derivatives.dimensions());
    assertEquals(10.0d, actualFirstPartialDerivativesResult.getValue());
    assertEquals(10.0d, derivatives.max());
    assertEquals(10.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, derivatives.size());
    assertEquals(30.0d, derivatives.sum());
    assertFalse(derivatives.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#firstPartialDerivatives(double, double, double)}.
   *
   * <p>Method under test: {@link Bound#firstPartialDerivatives(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound firstPartialDerivatives(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives Bound.firstPartialDerivatives(double, double, double)"})
  void testBoundFirstPartialDerivatives3() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.firstDerivative(anyDouble())).thenReturn(10.0d);
    when(boundCurveInterpolator.interpolate(anyDouble())).thenReturn(10.0d);

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    DoubleArray xValuesUnique = DoubleArray.of();
    ConstantSurfaceInterpolator constantSurfaceInterpolator =
        new ConstantSurfaceInterpolator(10.0d);

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            new BoundSurfaceInterpolator[] {
              constantSurfaceInterpolator, new ConstantSurfaceInterpolator(10.0d)
            });

    // Act
    ValueDerivatives actualFirstPartialDerivativesResult =
        bound.firstPartialDerivatives(2.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).firstDerivative(2.0d);
    verify(boundCurveInterpolator, atLeast(1)).interpolate(2.0d);
    verify(xInterpolator, atLeast(1))
        .bind(
            isA(DoubleArray.class),
            Mockito.<DoubleArray>any(),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    DoubleArray derivatives = actualFirstPartialDerivativesResult.getDerivatives();
    assertEquals(1, derivatives.dimensions());
    assertEquals(10.0d, actualFirstPartialDerivativesResult.getValue());
    assertEquals(10.0d, derivatives.max());
    assertEquals(10.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(3, derivatives.size());
    assertEquals(30.0d, derivatives.sum());
    assertFalse(derivatives.isEmpty());
    assertArrayEquals(new double[] {10.0d, 10.0d, 10.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double, double)}.
   *
   * <p>Method under test: {@link Bound#interpolate(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double, double)"})
  void testBoundInterpolate() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.interpolate(anyDouble())).thenReturn(10.0d);

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundSurfaceInterpolator[] yzInterpolators =
        new BoundSurfaceInterpolator[] {new ConstantSurfaceInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yzInterpolators);

    // Act
    double actualInterpolateResult = bound.interpolate(2.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).interpolate(2.0d);
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double, double)}.
   *
   * <p>Method under test: {@link Bound#interpolate(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double, double)"})
  void testBoundInterpolate2() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.interpolate(anyDouble())).thenReturn(10.0d);

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            DoubleArray.of(),
            new BoundSurfaceInterpolator[] {});

    // Act
    double actualInterpolateResult = bound.interpolate(2.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).interpolate(2.0d);
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double, double)}.
   *
   * <p>Method under test: {@link Bound#interpolate(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double, double)"})
  void testBoundInterpolate3() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.interpolate(anyDouble())).thenReturn(10.0d);

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    DoubleArray xValuesUnique = DoubleArray.of();
    ConstantSurfaceInterpolator constantSurfaceInterpolator =
        new ConstantSurfaceInterpolator(10.0d);

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            new BoundSurfaceInterpolator[] {
              constantSurfaceInterpolator, new ConstantSurfaceInterpolator(10.0d)
            });

    // Act
    double actualInterpolateResult = bound.interpolate(2.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).interpolate(2.0d);
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double, double)}.
   *
   * <p>Method under test: {@link Bound#interpolate(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double, double)"})
  void testBoundInterpolate4() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.interpolate(anyDouble())).thenReturn(10.0d);

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundSurfaceInterpolator[] yzInterpolators =
        new BoundSurfaceInterpolator[] {new ConstantSurfaceInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yzInterpolators);

    // Act
    double actualInterpolateResult = bound.interpolate(10.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).interpolate(10.0d);
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#interpolate(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double, double); when '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double, double)"})
  void testBoundInterpolate_when05() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.interpolate(anyDouble())).thenReturn(10.0d);

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundSurfaceInterpolator[] yzInterpolators =
        new BoundSurfaceInterpolator[] {new ConstantSurfaceInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yzInterpolators);

    // Act
    double actualInterpolateResult = bound.interpolate(0.5d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).interpolate(0.5d);
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#interpolate(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double, double); when zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double, double)"})
  void testBoundInterpolate_whenZero() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.interpolate(anyDouble())).thenReturn(10.0d);

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundSurfaceInterpolator[] yzInterpolators =
        new BoundSurfaceInterpolator[] {new ConstantSurfaceInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yzInterpolators);

    // Act
    double actualInterpolateResult = bound.interpolate(0.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).interpolate(0.0d);
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#parameterSensitivity(double, double, double)}.
   *
   * <p>Method under test: {@link Bound#parameterSensitivity(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound parameterSensitivity(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.parameterSensitivity(double, double, double)"})
  void testBoundParameterSensitivity() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.parameterSensitivity(anyDouble())).thenReturn(DoubleArray.of());

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            DoubleArray.of(),
            new BoundSurfaceInterpolator[] {});

    // Act
    DoubleArray actualParameterSensitivityResult = bound.parameterSensitivity(2.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).parameterSensitivity(2.0d);
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(0.0d, actualParameterSensitivityResult.max());
    assertEquals(0.0d, actualParameterSensitivityResult.min());
    assertEquals(0.0d, actualParameterSensitivityResult.sum());
    List<Double> toListResult = actualParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualParameterSensitivityResult.size());
    assertFalse(actualParameterSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, actualParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#parameterSensitivity(double, double, double)}.
   *
   * <p>Method under test: {@link Bound#parameterSensitivity(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound parameterSensitivity(double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.parameterSensitivity(double, double, double)"})
  void testBoundParameterSensitivity2() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.parameterSensitivity(anyDouble())).thenReturn(DoubleArray.of());

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    DoubleArray xValuesUnique = DoubleArray.of();
    ConstantSurfaceInterpolator constantSurfaceInterpolator = new ConstantSurfaceInterpolator(1.0d);

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            new BoundSurfaceInterpolator[] {
              constantSurfaceInterpolator, new ConstantSurfaceInterpolator(1.0d)
            });

    // Act
    DoubleArray actualParameterSensitivityResult = bound.parameterSensitivity(2.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).parameterSensitivity(2.0d);
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(0.0d, actualParameterSensitivityResult.max());
    assertEquals(0.0d, actualParameterSensitivityResult.min());
    assertEquals(0.0d, actualParameterSensitivityResult.sum());
    List<Double> toListResult = actualParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualParameterSensitivityResult.size());
    assertFalse(actualParameterSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, actualParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#parameterSensitivity(double, double, double)}.
   *
   * <ul>
   *   <li>Then return {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#parameterSensitivity(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound parameterSensitivity(double, double, double); then return EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.parameterSensitivity(double, double, double)"})
  void testBoundParameterSensitivity_thenReturnEmpty() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.parameterSensitivity(anyDouble())).thenReturn(DoubleArray.of());

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundSurfaceInterpolator[] yzInterpolators =
        new BoundSurfaceInterpolator[] {new ConstantSurfaceInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            0,
            xValuesUnique,
            yzInterpolators);

    // Act
    DoubleArray actualParameterSensitivityResult = bound.parameterSensitivity(2.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).parameterSensitivity(2.0d);
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertSame(DoubleArray.EMPTY, actualParameterSensitivityResult);
  }

  /**
   * Test Bound {@link Bound#parameterSensitivity(double, double, double)}.
   *
   * <ul>
   *   <li>Then return max is one.
   * </ul>
   *
   * <p>Method under test: {@link Bound#parameterSensitivity(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound parameterSensitivity(double, double, double); then return max is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.parameterSensitivity(double, double, double)"})
  void testBoundParameterSensitivity_thenReturnMaxIsOne() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.parameterSensitivity(anyDouble())).thenReturn(DoubleArray.of(1.0d));

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundSurfaceInterpolator[] yzInterpolators =
        new BoundSurfaceInterpolator[] {new ConstantSurfaceInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yzInterpolators);

    // Act
    DoubleArray actualParameterSensitivityResult = bound.parameterSensitivity(2.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).parameterSensitivity(2.0d);
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(1.0d, actualParameterSensitivityResult.max());
    assertEquals(1.0d, actualParameterSensitivityResult.sum());
    List<Double> toListResult = actualParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {1.0d, 0.0d, 0.0d}, actualParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#parameterSensitivity(double, double, double)}.
   *
   * <ul>
   *   <li>Then return max is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#parameterSensitivity(double, double, double)}
   */
  @Test
  @DisplayName("Test Bound parameterSensitivity(double, double, double); then return max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.parameterSensitivity(double, double, double)"})
  void testBoundParameterSensitivity_thenReturnMaxIsZero() {
    // Arrange
    BoundCurveInterpolator boundCurveInterpolator = mock(BoundCurveInterpolator.class);
    when(boundCurveInterpolator.parameterSensitivity(anyDouble())).thenReturn(DoubleArray.of());

    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(boundCurveInterpolator);
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundSurfaceInterpolator[] yzInterpolators =
        new BoundSurfaceInterpolator[] {new ConstantSurfaceInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yzInterpolators);

    // Act
    DoubleArray actualParameterSensitivityResult = bound.parameterSensitivity(2.0d, 3.0d, 10.0d);

    // Assert
    verify(boundCurveInterpolator).parameterSensitivity(2.0d);
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(0.0d, actualParameterSensitivityResult.max());
    assertEquals(0.0d, actualParameterSensitivityResult.min());
    assertEquals(0.0d, actualParameterSensitivityResult.sum());
    List<Double> toListResult = actualParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(3, actualParameterSensitivityResult.size());
    assertFalse(actualParameterSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, actualParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test ConstantSurfaceInterpolator {@link
   * ConstantSurfaceInterpolator#firstPartialDerivatives(double, double)}.
   *
   * <p>Method under test: {@link ConstantSurfaceInterpolator#firstPartialDerivatives(double,
   * double)}
   */
  @Test
  @DisplayName("Test ConstantSurfaceInterpolator firstPartialDerivatives(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives ConstantSurfaceInterpolator.firstPartialDerivatives(double, double)"
  })
  void testConstantSurfaceInterpolatorFirstPartialDerivatives() {
    // Arrange and Act
    ValueDerivatives actualFirstPartialDerivativesResult =
        new ConstantSurfaceInterpolator(10.0d).firstPartialDerivatives(2.0d, 3.0d);

    // Assert
    DoubleArray derivatives = actualFirstPartialDerivativesResult.getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1, derivatives.dimensions());
    assertEquals(10.0d, actualFirstPartialDerivativesResult.getValue());
    assertEquals(2, derivatives.size());
    assertFalse(derivatives.isEmpty());
    assertArrayEquals(new double[] {0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test ConstantSurfaceInterpolator {@link ConstantSurfaceInterpolator#interpolate(double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurfaceInterpolator#interpolate(double, double)}
   */
  @Test
  @DisplayName("Test ConstantSurfaceInterpolator interpolate(double, double); when '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantSurfaceInterpolator.interpolate(double, double)"})
  void testConstantSurfaceInterpolatorInterpolate_when05() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new ConstantSurfaceInterpolator(10.0d).interpolate(0.5d, 3.0d));
  }

  /**
   * Test ConstantSurfaceInterpolator {@link ConstantSurfaceInterpolator#interpolate(double,
   * double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurfaceInterpolator#interpolate(double, double)}
   */
  @Test
  @DisplayName("Test ConstantSurfaceInterpolator interpolate(double, double); when '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantSurfaceInterpolator.interpolate(double, double)"})
  void testConstantSurfaceInterpolatorInterpolate_when052() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new ConstantSurfaceInterpolator(10.0d).interpolate(-0.5d, 3.0d));
  }

  /**
   * Test ConstantSurfaceInterpolator {@link ConstantSurfaceInterpolator#interpolate(double,
   * double)}.
   *
   * <ul>
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurfaceInterpolator#interpolate(double, double)}
   */
  @Test
  @DisplayName("Test ConstantSurfaceInterpolator interpolate(double, double); when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantSurfaceInterpolator.interpolate(double, double)"})
  void testConstantSurfaceInterpolatorInterpolate_whenTen() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new ConstantSurfaceInterpolator(10.0d).interpolate(10.0d, 3.0d));
  }

  /**
   * Test ConstantSurfaceInterpolator {@link ConstantSurfaceInterpolator#interpolate(double,
   * double)}.
   *
   * <ul>
   *   <li>When two.
   * </ul>
   *
   * <p>Method under test: {@link ConstantSurfaceInterpolator#interpolate(double, double)}
   */
  @Test
  @DisplayName("Test ConstantSurfaceInterpolator interpolate(double, double); when two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantSurfaceInterpolator.interpolate(double, double)"})
  void testConstantSurfaceInterpolatorInterpolate_whenTwo() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new ConstantSurfaceInterpolator(10.0d).interpolate(2.0d, 3.0d));
  }

  /**
   * Test ConstantSurfaceInterpolator {@link
   * ConstantSurfaceInterpolator#parameterSensitivity(double, double)}.
   *
   * <p>Method under test: {@link ConstantSurfaceInterpolator#parameterSensitivity(double, double)}
   */
  @Test
  @DisplayName("Test ConstantSurfaceInterpolator parameterSensitivity(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "DoubleArray ConstantSurfaceInterpolator.parameterSensitivity(double, double)"
  })
  void testConstantSurfaceInterpolatorParameterSensitivity() {
    // Arrange and Act
    DoubleArray actualParameterSensitivityResult =
        new ConstantSurfaceInterpolator(10.0d).parameterSensitivity(2.0d, 3.0d);

    // Assert
    assertEquals(1, actualParameterSensitivityResult.dimensions());
    assertEquals(1, actualParameterSensitivityResult.size());
    List<Double> toListResult = actualParameterSensitivityResult.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.0d, actualParameterSensitivityResult.max());
    assertEquals(1.0d, actualParameterSensitivityResult.min());
    assertEquals(1.0d, actualParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertFalse(actualParameterSensitivityResult.isEmpty());
    assertArrayEquals(new double[] {1.0d}, actualParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link GridCubeInterpolator#meta()}.
   *
   * <p>Method under test: {@link GridCubeInterpolator#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta GridCubeInterpolator.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = GridCubeInterpolator.meta();

    // Assert
    assertTrue(actualMetaResult.xExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xInterpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yInterpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.zExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.zExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.zInterpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link GridCubeInterpolator#metaBean()}.
   *
   * <p>Method under test: {@link GridCubeInterpolator#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta GridCubeInterpolator.metaBean()"})
  void testMetaBean() {
    // Arrange
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC);

    // Act and Assert
    assertSame(Meta.INSTANCE, ofResult.metaBean());
  }

  /**
   * Test {@link GridCubeInterpolator#equals(Object)}, and {@link GridCubeInterpolator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GridCubeInterpolator#equals(Object)}
   *   <li>{@link GridCubeInterpolator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridCubeInterpolator.equals(Object)",
    "int GridCubeInterpolator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC);
    GridCubeInterpolator ofResult2 =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link GridCubeInterpolator#equals(Object)}, and {@link GridCubeInterpolator#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GridCubeInterpolator#equals(Object)}
   *   <li>{@link GridCubeInterpolator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridCubeInterpolator.equals(Object)",
    "int GridCubeInterpolator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link GridCubeInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridCubeInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridCubeInterpolator.equals(Object)",
    "int GridCubeInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC));
  }

  /**
   * Test {@link GridCubeInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridCubeInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridCubeInterpolator.equals(Object)",
    "int GridCubeInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.LINEAR,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC));
  }

  /**
   * Test {@link GridCubeInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridCubeInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridCubeInterpolator.equals(Object)",
    "int GridCubeInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.LINEAR,
            CurveInterpolators.DOUBLE_QUADRATIC);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC));
  }

  /**
   * Test {@link GridCubeInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridCubeInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridCubeInterpolator.equals(Object)",
    "int GridCubeInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.LINEAR);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC));
  }

  /**
   * Test {@link GridCubeInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridCubeInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridCubeInterpolator.equals(Object)",
    "int GridCubeInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.FLAT,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC));
  }

  /**
   * Test {@link GridCubeInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridCubeInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridCubeInterpolator.equals(Object)",
    "int GridCubeInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    GridCubeInterpolator ofResult =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.FLAT,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.FLAT,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC));
  }

  /**
   * Test {@link GridCubeInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridCubeInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridCubeInterpolator.equals(Object)",
    "int GridCubeInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC),
        null);
  }

  /**
   * Test {@link GridCubeInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridCubeInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridCubeInterpolator.equals(Object)",
    "int GridCubeInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC),
        "Different type to GridCubeInterpolator");
  }

  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends GridCubeInterpolator> actualBeanTypeResult =
        GridCubeInterpolator.meta().beanType();

    // Assert
    Class<GridCubeInterpolator> expectedBeanTypeResult = GridCubeInterpolator.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#xExtrapolatorLeft()}
   *   <li>{@link Meta#xExtrapolatorRight()}
   *   <li>{@link Meta#xInterpolator()}
   *   <li>{@link Meta#yExtrapolatorLeft()}
   *   <li>{@link Meta#yExtrapolatorRight()}
   *   <li>{@link Meta#yInterpolator()}
   *   <li>{@link Meta#zExtrapolatorLeft()}
   *   <li>{@link Meta#zExtrapolatorRight()}
   *   <li>{@link Meta#zInterpolator()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.xExtrapolatorLeft()",
    "MetaProperty Meta.xExtrapolatorRight()",
    "MetaProperty Meta.xInterpolator()",
    "MetaProperty Meta.yExtrapolatorLeft()",
    "MetaProperty Meta.yExtrapolatorRight()",
    "MetaProperty Meta.yInterpolator()",
    "MetaProperty Meta.zExtrapolatorLeft()",
    "MetaProperty Meta.zExtrapolatorRight()",
    "MetaProperty Meta.zInterpolator()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = GridCubeInterpolator.meta();

    // Act
    MetaProperty<CurveExtrapolator> actualXExtrapolatorLeftResult = metaResult.xExtrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualXExtrapolatorRightResult =
        metaResult.xExtrapolatorRight();
    MetaProperty<CurveInterpolator> actualXInterpolatorResult = metaResult.xInterpolator();
    MetaProperty<CurveExtrapolator> actualYExtrapolatorLeftResult = metaResult.yExtrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualYExtrapolatorRightResult =
        metaResult.yExtrapolatorRight();
    MetaProperty<CurveInterpolator> actualYInterpolatorResult = metaResult.yInterpolator();
    MetaProperty<CurveExtrapolator> actualZExtrapolatorLeftResult = metaResult.zExtrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualZExtrapolatorRightResult =
        metaResult.zExtrapolatorRight();

    // Assert
    assertTrue(actualXExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualXExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(actualXInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualYExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualYExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(actualYInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualZExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualZExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(metaResult.zInterpolator() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code xExtrapolatorRight}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'xExtrapolatorRight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsXExtrapolatorRight() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GridCubeInterpolator.meta().metaPropertyGet("xExtrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zInterpolator() instanceof DirectMetaProperty);
    assertEquals("xExtrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xExtrapolatorRight());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code yExtrapolatorRight}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'yExtrapolatorRight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsYExtrapolatorRight() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GridCubeInterpolator.meta().metaPropertyGet("yExtrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zInterpolator() instanceof DirectMetaProperty);
    assertEquals("yExtrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yExtrapolatorRight());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>Then return name is {@code zExtrapolatorRight}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); then return name is 'zExtrapolatorRight'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_thenReturnNameIsZExtrapolatorRight() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GridCubeInterpolator.meta().metaPropertyGet("zExtrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zInterpolator() instanceof DirectMetaProperty);
    assertEquals("zExtrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zExtrapolatorRight());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(GridCubeInterpolator.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code xExtrapolatorLeft}.
   *   <li>Then return name is {@code xExtrapolatorLeft}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'xExtrapolatorLeft'; then return name is 'xExtrapolatorLeft'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenXExtrapolatorLeft_thenReturnNameIsXExtrapolatorLeft() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GridCubeInterpolator.meta().metaPropertyGet("xExtrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zInterpolator() instanceof DirectMetaProperty);
    assertEquals("xExtrapolatorLeft", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xExtrapolatorLeft());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code xInterpolator}.
   *   <li>Then return name is {@code xInterpolator}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'xInterpolator'; then return name is 'xInterpolator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenXInterpolator_thenReturnNameIsXInterpolator() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GridCubeInterpolator.meta().metaPropertyGet("xInterpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zInterpolator() instanceof DirectMetaProperty);
    assertEquals("xInterpolator", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xInterpolator());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yExtrapolatorLeft}.
   *   <li>Then return name is {@code yExtrapolatorLeft}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yExtrapolatorLeft'; then return name is 'yExtrapolatorLeft'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYExtrapolatorLeft_thenReturnNameIsYExtrapolatorLeft() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GridCubeInterpolator.meta().metaPropertyGet("yExtrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zInterpolator() instanceof DirectMetaProperty);
    assertEquals("yExtrapolatorLeft", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yExtrapolatorLeft());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code yInterpolator}.
   *   <li>Then return name is {@code yInterpolator}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'yInterpolator'; then return name is 'yInterpolator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenYInterpolator_thenReturnNameIsYInterpolator() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GridCubeInterpolator.meta().metaPropertyGet("yInterpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zInterpolator() instanceof DirectMetaProperty);
    assertEquals("yInterpolator", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yInterpolator());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code zExtrapolatorLeft}.
   *   <li>Then return name is {@code zExtrapolatorLeft}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'zExtrapolatorLeft'; then return name is 'zExtrapolatorLeft'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenZExtrapolatorLeft_thenReturnNameIsZExtrapolatorLeft() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GridCubeInterpolator.meta().metaPropertyGet("zExtrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zInterpolator() instanceof DirectMetaProperty);
    assertEquals("zExtrapolatorLeft", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zExtrapolatorLeft());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code zInterpolator}.
   *   <li>Then return name is {@code zInterpolator}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'zInterpolator'; then return name is 'zInterpolator'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenZInterpolator_thenReturnNameIsZInterpolator() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        GridCubeInterpolator.meta().metaPropertyGet("zInterpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).xInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).yInterpolator() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(((Meta) metaBeanResult).zExtrapolatorRight() instanceof DirectMetaProperty);
    assertEquals("zInterpolator", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).zInterpolator());
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        GridCubeInterpolator.meta().metaPropertyMap();

    // Assert
    assertEquals(9, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("xExtrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("xExtrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("xInterpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yExtrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yExtrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yInterpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("zExtrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("zExtrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("zInterpolator") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(GridCubeInterpolator.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange
    Meta metaResult = GridCubeInterpolator.meta();
    GridCubeInterpolator bean =
        GridCubeInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveInterpolators.DOUBLE_QUADRATIC);

    // Act and Assert
    assertThrows(
        NoSuchElementException.class, () -> metaResult.propertyGet(bean, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () ->
            GridCubeInterpolator.meta()
                .propertySet(mock(Bean.class), "xExtrapolatorLeft", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            GridCubeInterpolator.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code xExtrapolatorLeft}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'xExtrapolatorLeft'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenXExtrapolatorLeft_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GridCubeInterpolator.meta()
                .propertySet(mock(Bean.class), "xExtrapolatorLeft", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code xExtrapolatorRight}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'xExtrapolatorRight'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenXExtrapolatorRight_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GridCubeInterpolator.meta()
                .propertySet(mock(Bean.class), "xExtrapolatorRight", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code xInterpolator}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'xInterpolator'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenXInterpolator_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GridCubeInterpolator.meta()
                .propertySet(mock(Bean.class), "xInterpolator", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yExtrapolatorLeft}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yExtrapolatorLeft'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYExtrapolatorLeft_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GridCubeInterpolator.meta()
                .propertySet(mock(Bean.class), "yExtrapolatorLeft", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yExtrapolatorRight}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yExtrapolatorRight'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYExtrapolatorRight_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GridCubeInterpolator.meta()
                .propertySet(mock(Bean.class), "yExtrapolatorRight", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code yInterpolator}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'yInterpolator'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenYInterpolator_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GridCubeInterpolator.meta()
                .propertySet(mock(Bean.class), "yInterpolator", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code zExtrapolatorLeft}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'zExtrapolatorLeft'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenZExtrapolatorLeft_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GridCubeInterpolator.meta()
                .propertySet(mock(Bean.class), "zExtrapolatorLeft", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code zExtrapolatorRight}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'zExtrapolatorRight'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenZExtrapolatorRight_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GridCubeInterpolator.meta()
                .propertySet(mock(Bean.class), "zExtrapolatorRight", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code zInterpolator}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'zInterpolator'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenZInterpolator_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            GridCubeInterpolator.meta()
                .propertySet(mock(Bean.class), "zInterpolator", "New Value", true));
  }
}
