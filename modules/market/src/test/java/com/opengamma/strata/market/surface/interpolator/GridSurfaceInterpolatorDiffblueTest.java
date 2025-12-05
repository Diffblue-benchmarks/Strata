package com.opengamma.strata.market.surface.interpolator;

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
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.curve.interpolator.BoundCurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.BoundCurveInterpolator;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolator;
import com.opengamma.strata.market.curve.interpolator.CurveExtrapolators;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolator;
import com.opengamma.strata.market.curve.interpolator.CurveInterpolators;
import com.opengamma.strata.market.surface.interpolator.GridSurfaceInterpolator.Bound;
import com.opengamma.strata.market.surface.interpolator.GridSurfaceInterpolator.ConstantCurveInterpolator;
import com.opengamma.strata.market.surface.interpolator.GridSurfaceInterpolator.Meta;
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

class GridSurfaceInterpolatorDiffblueTest {
  /**
   * Test {@link GridSurfaceInterpolator#bind(DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link GridSurfaceInterpolator#bind(DoubleArray, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test bind(DoubleArray, DoubleArray, DoubleArray); then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.surface.interpolator.BoundSurfaceInterpolator GridSurfaceInterpolator.bind(DoubleArray, DoubleArray, DoubleArray)"
  })
  void testBind_thenThrowIllegalArgumentException() {
    // Arrange
    GridSurfaceInterpolator ofResult =
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC);
    DoubleArray xValues = DoubleArray.filled(3);
    DoubleArray yValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.bind(xValues, yValues, DoubleArray.filled(3)));
  }

  /**
   * Test {@link GridSurfaceInterpolator#bind(DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray} with value is ten.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link GridSurfaceInterpolator#bind(DoubleArray, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test bind(DoubleArray, DoubleArray, DoubleArray); when DoubleArray with value is ten; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.surface.interpolator.BoundSurfaceInterpolator GridSurfaceInterpolator.bind(DoubleArray, DoubleArray, DoubleArray)"
  })
  void testBind_whenDoubleArrayWithValueIsTen_thenThrowIllegalArgumentException() {
    // Arrange
    GridSurfaceInterpolator ofResult =
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC);
    DoubleArray xValues = DoubleArray.of(10.0d);
    DoubleArray yValues = DoubleArray.filled(3);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> ofResult.bind(xValues, yValues, DoubleArray.filled(3)));
  }

  /**
   * Test {@link GridSurfaceInterpolator#bind(DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return {@link Bound}.
   * </ul>
   *
   * <p>Method under test: {@link GridSurfaceInterpolator#bind(DoubleArray, DoubleArray,
   * DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test bind(DoubleArray, DoubleArray, DoubleArray); when DoubleArray; then return Bound")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.market.surface.interpolator.BoundSurfaceInterpolator GridSurfaceInterpolator.bind(DoubleArray, DoubleArray, DoubleArray)"
  })
  void testBind_whenDoubleArray_thenReturnBound() {
    // Arrange
    GridSurfaceInterpolator ofResult =
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC);
    DoubleArray xValues = DoubleArray.of();
    DoubleArray yValues = DoubleArray.of();

    // Act and Assert
    assertTrue(ofResult.bind(xValues, yValues, DoubleArray.of()) instanceof Bound);
  }

  /**
   * Test Bound {@link Bound#firstPartialDerivatives(double, double)}.
   *
   * <p>Method under test: {@link Bound#firstPartialDerivatives(double, double)}
   */
  @Test
  @DisplayName("Test Bound firstPartialDerivatives(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives Bound.firstPartialDerivatives(double, double)"})
  void testBoundFirstPartialDerivatives() {
    // Arrange
    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(new ConstantCurveInterpolator(10.0d));
    DoubleArray xValuesUnique = DoubleArray.of();
    ConstantCurveInterpolator constantCurveInterpolator = new ConstantCurveInterpolator(10.0d);

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            new BoundCurveInterpolator[] {
              constantCurveInterpolator, new ConstantCurveInterpolator(10.0d)
            });

    // Act
    ValueDerivatives actualFirstPartialDerivativesResult =
        bound.firstPartialDerivatives(2.0d, 3.0d);

    // Assert
    verify(xInterpolator, atLeast(1))
        .bind(
            isA(DoubleArray.class),
            Mockito.<DoubleArray>any(),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    DoubleArray derivatives = actualFirstPartialDerivativesResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(1, derivatives.dimensions());
    assertEquals(10.0d, actualFirstPartialDerivativesResult.getValue());
    assertEquals(10.0d, derivatives.max());
    assertEquals(10.0d, derivatives.sum());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(2, derivatives.size());
    assertFalse(derivatives.isEmpty());
    assertArrayEquals(new double[] {0.0d, 10.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#firstPartialDerivatives(double, double)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#firstPartialDerivatives(double, double)}
   */
  @Test
  @DisplayName(
      "Test Bound firstPartialDerivatives(double, double); then return Derivatives min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueDerivatives Bound.firstPartialDerivatives(double, double)"})
  void testBoundFirstPartialDerivatives_thenReturnDerivativesMinIsZero() {
    // Arrange
    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(new ConstantCurveInterpolator(10.0d));
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundCurveInterpolator[] yInterpolators =
        new BoundCurveInterpolator[] {new ConstantCurveInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yInterpolators);

    // Act
    ValueDerivatives actualFirstPartialDerivativesResult =
        bound.firstPartialDerivatives(2.0d, 3.0d);

    // Assert
    verify(xInterpolator, atLeast(1))
        .bind(
            isA(DoubleArray.class),
            Mockito.<DoubleArray>any(),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    DoubleArray derivatives = actualFirstPartialDerivativesResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertEquals(1, derivatives.dimensions());
    assertEquals(10.0d, actualFirstPartialDerivativesResult.getValue());
    assertEquals(10.0d, derivatives.max());
    assertEquals(10.0d, derivatives.sum());
    assertEquals(10.0d, toListResult.get(1).doubleValue());
    assertEquals(2, derivatives.size());
    assertFalse(derivatives.isEmpty());
    assertArrayEquals(new double[] {0.0d, 10.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double)}.
   *
   * <p>Method under test: {@link Bound#interpolate(double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double)"})
  void testBoundInterpolate() {
    // Arrange
    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(new ConstantCurveInterpolator(10.0d));
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundCurveInterpolator[] yInterpolators =
        new BoundCurveInterpolator[] {new ConstantCurveInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yInterpolators);

    // Act
    double actualInterpolateResult = bound.interpolate(2.0d, 3.0d);

    // Assert
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double)}.
   *
   * <p>Method under test: {@link Bound#interpolate(double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double)"})
  void testBoundInterpolate2() {
    // Arrange
    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(new ConstantCurveInterpolator(10.0d));
    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            DoubleArray.of(),
            new BoundCurveInterpolator[] {});

    // Act
    double actualInterpolateResult = bound.interpolate(2.0d, 3.0d);

    // Assert
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double)}.
   *
   * <p>Method under test: {@link Bound#interpolate(double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double)"})
  void testBoundInterpolate3() {
    // Arrange
    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(new ConstantCurveInterpolator(10.0d));
    DoubleArray xValuesUnique = DoubleArray.of();
    ConstantCurveInterpolator constantCurveInterpolator = new ConstantCurveInterpolator(10.0d);

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            new BoundCurveInterpolator[] {
              constantCurveInterpolator, new ConstantCurveInterpolator(10.0d)
            });

    // Act
    double actualInterpolateResult = bound.interpolate(2.0d, 3.0d);

    // Assert
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#interpolate(double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double); when '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double)"})
  void testBoundInterpolate_when05() {
    // Arrange
    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(new ConstantCurveInterpolator(10.0d));
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundCurveInterpolator[] yInterpolators =
        new BoundCurveInterpolator[] {new ConstantCurveInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yInterpolators);

    // Act
    double actualInterpolateResult = bound.interpolate(0.5d, 3.0d);

    // Assert
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link Bound#interpolate(double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double); when '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double)"})
  void testBoundInterpolate_when052() {
    // Arrange
    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(new ConstantCurveInterpolator(10.0d));
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundCurveInterpolator[] yInterpolators =
        new BoundCurveInterpolator[] {new ConstantCurveInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yInterpolators);

    // Act
    double actualInterpolateResult = bound.interpolate(-0.5d, 3.0d);

    // Assert
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#interpolate(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   * </ul>
   *
   * <p>Method under test: {@link Bound#interpolate(double, double)}
   */
  @Test
  @DisplayName("Test Bound interpolate(double, double); when ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double Bound.interpolate(double, double)"})
  void testBoundInterpolate_whenTen() {
    // Arrange
    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(new ConstantCurveInterpolator(10.0d));
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundCurveInterpolator[] yInterpolators =
        new BoundCurveInterpolator[] {new ConstantCurveInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yInterpolators);

    // Act
    double actualInterpolateResult = bound.interpolate(10.0d, 3.0d);

    // Assert
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(10.0d, actualInterpolateResult);
  }

  /**
   * Test Bound {@link Bound#parameterSensitivity(double, double)}.
   *
   * <p>Method under test: {@link Bound#parameterSensitivity(double, double)}
   */
  @Test
  @DisplayName("Test Bound parameterSensitivity(double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.parameterSensitivity(double, double)"})
  void testBoundParameterSensitivity() {
    // Arrange
    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(new ConstantCurveInterpolator(10.0d));
    DoubleArray xValuesUnique = DoubleArray.of();
    ConstantCurveInterpolator constantCurveInterpolator = new ConstantCurveInterpolator(1.0d);

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            new BoundCurveInterpolator[] {
              constantCurveInterpolator, new ConstantCurveInterpolator(1.0d)
            });

    // Act
    DoubleArray actualParameterSensitivityResult = bound.parameterSensitivity(2.0d, 3.0d);

    // Assert
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(0.0d, actualParameterSensitivityResult.min());
    List<Double> toListResult = actualParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, actualParameterSensitivityResult.dimensions());
    assertEquals(1.0d, actualParameterSensitivityResult.max());
    assertEquals(1.0d, actualParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(3, actualParameterSensitivityResult.size());
    assertFalse(actualParameterSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {1.0d, 0.0d, 0.0d}, actualParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test Bound {@link Bound#parameterSensitivity(double, double)}.
   *
   * <ul>
   *   <li>Then return min is zero.
   * </ul>
   *
   * <p>Method under test: {@link Bound#parameterSensitivity(double, double)}
   */
  @Test
  @DisplayName("Test Bound parameterSensitivity(double, double); then return min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray Bound.parameterSensitivity(double, double)"})
  void testBoundParameterSensitivity_thenReturnMinIsZero() {
    // Arrange
    CurveInterpolator xInterpolator = mock(CurveInterpolator.class);
    when(xInterpolator.bind(
            Mockito.<DoubleArray>any(),
            Mockito.<DoubleArray>any(),
            Mockito.<CurveExtrapolator>any(),
            Mockito.<CurveExtrapolator>any()))
        .thenReturn(new ConstantCurveInterpolator(10.0d));
    DoubleArray xValuesUnique = DoubleArray.of();
    BoundCurveInterpolator[] yInterpolators =
        new BoundCurveInterpolator[] {new ConstantCurveInterpolator(10.0d)};

    Bound bound =
        new Bound(
            xInterpolator,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            3,
            xValuesUnique,
            yInterpolators);

    // Act
    DoubleArray actualParameterSensitivityResult = bound.parameterSensitivity(2.0d, 3.0d);

    // Assert
    verify(xInterpolator)
        .bind(
            isA(DoubleArray.class),
            isA(DoubleArray.class),
            isA(CurveExtrapolator.class),
            isA(CurveExtrapolator.class));
    assertEquals(0.0d, actualParameterSensitivityResult.min());
    List<Double> toListResult = actualParameterSensitivityResult.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertEquals(1, actualParameterSensitivityResult.dimensions());
    assertEquals(1.0d, actualParameterSensitivityResult.max());
    assertEquals(1.0d, actualParameterSensitivityResult.sum());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(3, actualParameterSensitivityResult.size());
    assertFalse(actualParameterSensitivityResult.isEmpty());
    assertArrayEquals(
        new double[] {1.0d, 0.0d, 0.0d}, actualParameterSensitivityResult.toArrayUnsafe(), 0.0);
  }

  /**
   * Test ConstantCurveInterpolator {@link ConstantCurveInterpolator#bind(BoundCurveExtrapolator,
   * BoundCurveExtrapolator)}.
   *
   * <p>Method under test: {@link ConstantCurveInterpolator#bind(BoundCurveExtrapolator,
   * BoundCurveExtrapolator)}
   */
  @Test
  @DisplayName(
      "Test ConstantCurveInterpolator bind(BoundCurveExtrapolator, BoundCurveExtrapolator)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "BoundCurveInterpolator ConstantCurveInterpolator.bind(BoundCurveExtrapolator, BoundCurveExtrapolator)"
  })
  void testConstantCurveInterpolatorBind() {
    // Arrange
    ConstantCurveInterpolator constantCurveInterpolator = new ConstantCurveInterpolator(10.0d);

    // Act
    BoundCurveInterpolator actualBindResult =
        constantCurveInterpolator.bind(
            mock(BoundCurveExtrapolator.class), mock(BoundCurveExtrapolator.class));

    // Assert
    assertSame(constantCurveInterpolator, actualBindResult);
  }

  /**
   * Test ConstantCurveInterpolator {@link ConstantCurveInterpolator#firstDerivative(double)}.
   *
   * <p>Method under test: {@link ConstantCurveInterpolator#firstDerivative(double)}
   */
  @Test
  @DisplayName("Test ConstantCurveInterpolator firstDerivative(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantCurveInterpolator.firstDerivative(double)"})
  void testConstantCurveInterpolatorFirstDerivative() {
    // Arrange, Act and Assert
    assertEquals(0.0d, new ConstantCurveInterpolator(10.0d).firstDerivative(2.0d));
  }

  /**
   * Test ConstantCurveInterpolator {@link ConstantCurveInterpolator#interpolate(double)}.
   *
   * <p>Method under test: {@link ConstantCurveInterpolator#interpolate(double)}
   */
  @Test
  @DisplayName("Test ConstantCurveInterpolator interpolate(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double ConstantCurveInterpolator.interpolate(double)"})
  void testConstantCurveInterpolatorInterpolate() {
    // Arrange, Act and Assert
    assertEquals(10.0d, new ConstantCurveInterpolator(10.0d).interpolate(2.0d));
  }

  /**
   * Test ConstantCurveInterpolator {@link ConstantCurveInterpolator#parameterSensitivity(double)}.
   *
   * <p>Method under test: {@link ConstantCurveInterpolator#parameterSensitivity(double)}
   */
  @Test
  @DisplayName("Test ConstantCurveInterpolator parameterSensitivity(double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"DoubleArray ConstantCurveInterpolator.parameterSensitivity(double)"})
  void testConstantCurveInterpolatorParameterSensitivity() {
    // Arrange and Act
    DoubleArray actualParameterSensitivityResult =
        new ConstantCurveInterpolator(10.0d).parameterSensitivity(2.0d);

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
   * Test {@link GridSurfaceInterpolator#meta()}.
   *
   * <p>Method under test: {@link GridSurfaceInterpolator#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta GridSurfaceInterpolator.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = GridSurfaceInterpolator.meta();

    // Assert
    assertTrue(actualMetaResult.xExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.xInterpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yExtrapolatorLeft() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yExtrapolatorRight() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.yInterpolator() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link GridSurfaceInterpolator#metaBean()}.
   *
   * <p>Method under test: {@link GridSurfaceInterpolator#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta GridSurfaceInterpolator.metaBean()"})
  void testMetaBean() {
    // Arrange, Act and Assert
    assertSame(
        Meta.INSTANCE,
        GridSurfaceInterpolator.of(
                CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC)
            .metaBean());
  }

  /**
   * Test {@link GridSurfaceInterpolator#equals(Object)}, and {@link
   * GridSurfaceInterpolator#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GridSurfaceInterpolator#equals(Object)}
   *   <li>{@link GridSurfaceInterpolator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridSurfaceInterpolator.equals(Object)",
    "int GridSurfaceInterpolator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    GridSurfaceInterpolator ofResult =
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC);
    GridSurfaceInterpolator ofResult2 =
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC);

    // Act and Assert
    assertEquals(ofResult, ofResult2);
    assertEquals(ofResult.hashCode(), ofResult2.hashCode());
  }

  /**
   * Test {@link GridSurfaceInterpolator#equals(Object)}, and {@link
   * GridSurfaceInterpolator#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link GridSurfaceInterpolator#equals(Object)}
   *   <li>{@link GridSurfaceInterpolator#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridSurfaceInterpolator.equals(Object)",
    "int GridSurfaceInterpolator.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    GridSurfaceInterpolator ofResult =
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC);

    // Act and Assert
    assertEquals(ofResult, ofResult);
    int expectedHashCodeResult = ofResult.hashCode();
    assertEquals(expectedHashCodeResult, ofResult.hashCode());
  }

  /**
   * Test {@link GridSurfaceInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridSurfaceInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridSurfaceInterpolator.equals(Object)",
    "int GridSurfaceInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    GridSurfaceInterpolator ofResult =
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC));
  }

  /**
   * Test {@link GridSurfaceInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridSurfaceInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridSurfaceInterpolator.equals(Object)",
    "int GridSurfaceInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    GridSurfaceInterpolator ofResult =
        GridSurfaceInterpolator.of(CurveInterpolators.LINEAR, CurveInterpolators.DOUBLE_QUADRATIC);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC));
  }

  /**
   * Test {@link GridSurfaceInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridSurfaceInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridSurfaceInterpolator.equals(Object)",
    "int GridSurfaceInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    GridSurfaceInterpolator ofResult =
        GridSurfaceInterpolator.of(CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.LINEAR);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC));
  }

  /**
   * Test {@link GridSurfaceInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridSurfaceInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridSurfaceInterpolator.equals(Object)",
    "int GridSurfaceInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    GridSurfaceInterpolator ofResult =
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.FLAT,
            CurveInterpolators.DOUBLE_QUADRATIC,
            CurveExtrapolators.DISCOUNT_FACTOR_LINEAR_RIGHT_ZERO_RATE);

    // Act and Assert
    assertNotEquals(
        ofResult,
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC));
  }

  /**
   * Test {@link GridSurfaceInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridSurfaceInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridSurfaceInterpolator.equals(Object)",
    "int GridSurfaceInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC),
        null);
  }

  /**
   * Test {@link GridSurfaceInterpolator#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link GridSurfaceInterpolator#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean GridSurfaceInterpolator.equals(Object)",
    "int GridSurfaceInterpolator.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        GridSurfaceInterpolator.of(
            CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC),
        "Different type to GridSurfaceInterpolator");
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
    Class<? extends GridSurfaceInterpolator> actualBeanTypeResult =
        GridSurfaceInterpolator.meta().beanType();

    // Assert
    Class<GridSurfaceInterpolator> expectedBeanTypeResult = GridSurfaceInterpolator.class;
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
    "MetaProperty Meta.yInterpolator()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = GridSurfaceInterpolator.meta();

    // Act
    MetaProperty<CurveExtrapolator> actualXExtrapolatorLeftResult = metaResult.xExtrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualXExtrapolatorRightResult =
        metaResult.xExtrapolatorRight();
    MetaProperty<CurveInterpolator> actualXInterpolatorResult = metaResult.xInterpolator();
    MetaProperty<CurveExtrapolator> actualYExtrapolatorLeftResult = metaResult.yExtrapolatorLeft();
    MetaProperty<CurveExtrapolator> actualYExtrapolatorRightResult =
        metaResult.yExtrapolatorRight();

    // Assert
    assertTrue(actualXExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualXExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(actualXInterpolatorResult instanceof DirectMetaProperty);
    assertTrue(actualYExtrapolatorLeftResult instanceof DirectMetaProperty);
    assertTrue(actualYExtrapolatorRightResult instanceof DirectMetaProperty);
    assertTrue(metaResult.yInterpolator() instanceof DirectMetaProperty);
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
        GridSurfaceInterpolator.meta().metaPropertyGet("xExtrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> xExtrapolatorLeftResult =
        ((Meta) metaBeanResult).xExtrapolatorLeft();
    assertTrue(xExtrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> xInterpolatorResult = ((Meta) metaBeanResult).xInterpolator();
    assertTrue(xInterpolatorResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> yExtrapolatorLeftResult =
        ((Meta) metaBeanResult).yExtrapolatorLeft();
    assertTrue(yExtrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> yExtrapolatorRightResult =
        ((Meta) metaBeanResult).yExtrapolatorRight();
    assertTrue(yExtrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> yInterpolatorResult = ((Meta) metaBeanResult).yInterpolator();
    assertTrue(yInterpolatorResult instanceof DirectMetaProperty);
    assertEquals("xExtrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xExtrapolatorRight());
    assertSame(metaBeanResult, xExtrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, xInterpolatorResult.metaBean());
    assertSame(metaBeanResult, yExtrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, yExtrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, yInterpolatorResult.metaBean());
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
        GridSurfaceInterpolator.meta().metaPropertyGet("yExtrapolatorRight");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> xExtrapolatorLeftResult =
        ((Meta) metaBeanResult).xExtrapolatorLeft();
    assertTrue(xExtrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> xExtrapolatorRightResult =
        ((Meta) metaBeanResult).xExtrapolatorRight();
    assertTrue(xExtrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> xInterpolatorResult = ((Meta) metaBeanResult).xInterpolator();
    assertTrue(xInterpolatorResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> yExtrapolatorLeftResult =
        ((Meta) metaBeanResult).yExtrapolatorLeft();
    assertTrue(yExtrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> yInterpolatorResult = ((Meta) metaBeanResult).yInterpolator();
    assertTrue(yInterpolatorResult instanceof DirectMetaProperty);
    assertEquals("yExtrapolatorRight", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yExtrapolatorRight());
    assertSame(metaBeanResult, xExtrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, xExtrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, xInterpolatorResult.metaBean());
    assertSame(metaBeanResult, yExtrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, yInterpolatorResult.metaBean());
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
    assertNull(GridSurfaceInterpolator.meta().metaPropertyGet("Property Name"));
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
        GridSurfaceInterpolator.meta().metaPropertyGet("xExtrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> xExtrapolatorRightResult =
        ((Meta) metaBeanResult).xExtrapolatorRight();
    assertTrue(xExtrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> xInterpolatorResult = ((Meta) metaBeanResult).xInterpolator();
    assertTrue(xInterpolatorResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> yExtrapolatorLeftResult =
        ((Meta) metaBeanResult).yExtrapolatorLeft();
    assertTrue(yExtrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> yExtrapolatorRightResult =
        ((Meta) metaBeanResult).yExtrapolatorRight();
    assertTrue(yExtrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> yInterpolatorResult = ((Meta) metaBeanResult).yInterpolator();
    assertTrue(yInterpolatorResult instanceof DirectMetaProperty);
    assertEquals("xExtrapolatorLeft", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xExtrapolatorLeft());
    assertSame(metaBeanResult, xExtrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, xInterpolatorResult.metaBean());
    assertSame(metaBeanResult, yExtrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, yExtrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, yInterpolatorResult.metaBean());
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
        GridSurfaceInterpolator.meta().metaPropertyGet("xInterpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> xExtrapolatorLeftResult =
        ((Meta) metaBeanResult).xExtrapolatorLeft();
    assertTrue(xExtrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> xExtrapolatorRightResult =
        ((Meta) metaBeanResult).xExtrapolatorRight();
    assertTrue(xExtrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> yExtrapolatorLeftResult =
        ((Meta) metaBeanResult).yExtrapolatorLeft();
    assertTrue(yExtrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> yExtrapolatorRightResult =
        ((Meta) metaBeanResult).yExtrapolatorRight();
    assertTrue(yExtrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> yInterpolatorResult = ((Meta) metaBeanResult).yInterpolator();
    assertTrue(yInterpolatorResult instanceof DirectMetaProperty);
    assertEquals("xInterpolator", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).xInterpolator());
    assertSame(metaBeanResult, xExtrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, xExtrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, yExtrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, yExtrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, yInterpolatorResult.metaBean());
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
        GridSurfaceInterpolator.meta().metaPropertyGet("yExtrapolatorLeft");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> xExtrapolatorLeftResult =
        ((Meta) metaBeanResult).xExtrapolatorLeft();
    assertTrue(xExtrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> xExtrapolatorRightResult =
        ((Meta) metaBeanResult).xExtrapolatorRight();
    assertTrue(xExtrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> xInterpolatorResult = ((Meta) metaBeanResult).xInterpolator();
    assertTrue(xInterpolatorResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> yExtrapolatorRightResult =
        ((Meta) metaBeanResult).yExtrapolatorRight();
    assertTrue(yExtrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> yInterpolatorResult = ((Meta) metaBeanResult).yInterpolator();
    assertTrue(yInterpolatorResult instanceof DirectMetaProperty);
    assertEquals("yExtrapolatorLeft", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yExtrapolatorLeft());
    assertSame(metaBeanResult, xExtrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, xExtrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, xInterpolatorResult.metaBean());
    assertSame(metaBeanResult, yExtrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, yInterpolatorResult.metaBean());
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
        GridSurfaceInterpolator.meta().metaPropertyGet("yInterpolator");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> xExtrapolatorLeftResult =
        ((Meta) metaBeanResult).xExtrapolatorLeft();
    assertTrue(xExtrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> xExtrapolatorRightResult =
        ((Meta) metaBeanResult).xExtrapolatorRight();
    assertTrue(xExtrapolatorRightResult instanceof DirectMetaProperty);
    MetaProperty<CurveInterpolator> xInterpolatorResult = ((Meta) metaBeanResult).xInterpolator();
    assertTrue(xInterpolatorResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> yExtrapolatorLeftResult =
        ((Meta) metaBeanResult).yExtrapolatorLeft();
    assertTrue(yExtrapolatorLeftResult instanceof DirectMetaProperty);
    MetaProperty<CurveExtrapolator> yExtrapolatorRightResult =
        ((Meta) metaBeanResult).yExtrapolatorRight();
    assertTrue(yExtrapolatorRightResult instanceof DirectMetaProperty);
    assertEquals("yInterpolator", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).yInterpolator());
    assertSame(metaBeanResult, xExtrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, xExtrapolatorRightResult.metaBean());
    assertSame(metaBeanResult, xInterpolatorResult.metaBean());
    assertSame(metaBeanResult, yExtrapolatorLeftResult.metaBean());
    assertSame(metaBeanResult, yExtrapolatorRightResult.metaBean());
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
        GridSurfaceInterpolator.meta().metaPropertyMap();

    // Assert
    assertEquals(6, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("xExtrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("xExtrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("xInterpolator") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yExtrapolatorLeft") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yExtrapolatorRight") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("yInterpolator") instanceof DirectMetaProperty);
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
    assertNull(GridSurfaceInterpolator.meta().propertyGet(mock(Bean.class), "Property Name", true));
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
    Meta metaResult = GridSurfaceInterpolator.meta();

    // Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () ->
            metaResult.propertyGet(
                GridSurfaceInterpolator.of(
                    CurveInterpolators.DOUBLE_QUADRATIC, CurveInterpolators.DOUBLE_QUADRATIC),
                "Property Name",
                false));
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
            GridSurfaceInterpolator.meta()
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
            GridSurfaceInterpolator.meta()
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
            GridSurfaceInterpolator.meta()
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
            GridSurfaceInterpolator.meta()
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
            GridSurfaceInterpolator.meta()
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
            GridSurfaceInterpolator.meta()
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
            GridSurfaceInterpolator.meta()
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
            GridSurfaceInterpolator.meta()
                .propertySet(mock(Bean.class), "yInterpolator", "New Value", true));
  }
}
