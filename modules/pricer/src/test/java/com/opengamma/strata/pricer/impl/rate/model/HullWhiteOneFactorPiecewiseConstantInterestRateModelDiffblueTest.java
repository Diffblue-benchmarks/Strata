package com.opengamma.strata.pricer.impl.rate.model;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.tuple.Pair;
import java.util.List;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class HullWhiteOneFactorPiecewiseConstantInterestRateModelDiffblueTest {
  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRate(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRate(double, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRate(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when DoubleArray; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRate(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRate_whenDoubleArray_thenReturnNaN() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertEquals(
        Double.NaN,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRate(
            2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of()));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRate(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRate(double, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRate(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRate(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRate_whenFilledThree_thenReturnNaN() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.filled(3);
    DoubleArray alphaFixed = DoubleArray.filled(3);
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertEquals(
        Double.NaN,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRate(
            2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of()));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRate(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRate(double, DoubleArray, DoubleArray,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRate(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRate(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRate_whenFilledThree_thenReturnNaN2() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(
        Double.NaN,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRate(
            2.0d,
            discountedCashFlowFixed,
            alphaFixed,
            discountedCashFlowIbor,
            DoubleArray.filled(3)));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when DoubleArray; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx1_whenDoubleArray_thenReturnNaN() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertEquals(
        Double.NaN,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRateDx1(
            2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of()));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx1_whenFilledThree_thenReturnNaN() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.filled(3);
    DoubleArray alphaFixed = DoubleArray.filled(3);
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertEquals(
        Double.NaN,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRateDx1(
            2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of()));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx1_whenFilledThree_thenReturnNaN2() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(
        Double.NaN,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRateDx1(
            2.0d,
            discountedCashFlowFixed,
            alphaFixed,
            discountedCashFlowIbor,
            DoubleArray.filled(3)));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx2(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when DoubleArray; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx2(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx2_whenDoubleArray_thenReturnNaN() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertEquals(
        Double.NaN,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRateDx2(
            2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of()));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx2(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx2(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx2_whenFilledThree_thenReturnNaN() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.filled(3);
    DoubleArray alphaFixed = DoubleArray.filled(3);
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertEquals(
        Double.NaN,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRateDx2(
            2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of()));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx2(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx2(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx2_whenFilledThree_thenReturnNaN2() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.filled(3);

    // Act and Assert
    assertEquals(
        Double.NaN,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRateDx2(
            2.0d,
            discountedCashFlowFixed,
            alphaFixed,
            discountedCashFlowIbor,
            DoubleArray.filled(3)));
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcfi1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return Derivatives is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcfi1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDdcfi1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when DoubleArray; then return Derivatives is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDdcfi1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDdcfi1_whenDoubleArray_thenReturnDerivativesIsEmpty() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDdcfi1(
                2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of())
            .getDerivatives());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcfi1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Derivatives is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcfi1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDdcfi1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Derivatives is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDdcfi1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDdcfi1_whenFilledThree_thenReturnDerivativesIsEmpty() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.filled(3);
    DoubleArray alphaFixed = DoubleArray.filled(3);
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDdcfi1(
                2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of())
            .getDerivatives());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcfi1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Derivatives size is three.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcfi1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDdcfi1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Derivatives size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDdcfi1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDdcfi1_whenFilledThree_thenReturnDerivativesSizeIsThree() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.filled(3);

    // Act and Assert
    DoubleArray derivatives =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDdcfi1(
                2.0d,
                discountedCashFlowFixed,
                alphaFixed,
                discountedCashFlowIbor,
                DoubleArray.filled(3))
            .getDerivatives();
    assertEquals(3, derivatives.size());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertFalse(derivatives.isEmpty());
    assertEquals(Double.NEGATIVE_INFINITY, derivatives.max());
    assertEquals(Double.NEGATIVE_INFINITY, derivatives.min());
    assertEquals(Double.NEGATIVE_INFINITY, derivatives.sum());
    assertEquals(Double.NEGATIVE_INFINITY, toListResult.get(0).doubleValue());
    assertEquals(Double.NEGATIVE_INFINITY, toListResult.get(1).doubleValue());
    assertEquals(Double.NEGATIVE_INFINITY, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcff1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return Derivatives is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcff1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDdcff1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when DoubleArray; then return Derivatives is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDdcff1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDdcff1_whenDoubleArray_thenReturnDerivativesIsEmpty() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDdcff1(
                2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of())
            .getDerivatives());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcff1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Derivatives is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcff1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDdcff1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Derivatives is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDdcff1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDdcff1_whenFilledThree_thenReturnDerivativesIsEmpty() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.filled(3);

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDdcff1(
                2.0d,
                discountedCashFlowFixed,
                alphaFixed,
                discountedCashFlowIbor,
                DoubleArray.filled(3))
            .getDerivatives());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcff1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Derivatives size is three.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDdcff1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDdcff1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Derivatives size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDdcff1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDdcff1_whenFilledThree_thenReturnDerivativesSizeIsThree() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.filled(3);
    DoubleArray alphaFixed = DoubleArray.filled(3);
    DoubleArray discountedCashFlowIbor = DoubleArray.filled(3);

    // Act and Assert
    DoubleArray derivatives =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDdcff1(
                2.0d,
                discountedCashFlowFixed,
                alphaFixed,
                discountedCashFlowIbor,
                DoubleArray.filled(3))
            .getDerivatives();
    assertEquals(3, derivatives.size());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertFalse(derivatives.isEmpty());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDai1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return Derivatives is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDai1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDai1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when DoubleArray; then return Derivatives is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDai1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDai1_whenDoubleArray_thenReturnDerivativesIsEmpty() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDai1(
                2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of())
            .getDerivatives());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDai1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Derivatives is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDai1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDai1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Derivatives is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDai1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDai1_whenFilledThree_thenReturnDerivativesIsEmpty() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.filled(3);
    DoubleArray alphaFixed = DoubleArray.filled(3);
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDai1(
                2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of())
            .getDerivatives());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDai1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Derivatives size is three.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDai1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDai1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Derivatives size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDai1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDai1_whenFilledThree_thenReturnDerivativesSizeIsThree() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.filled(3);

    // Act and Assert
    DoubleArray derivatives =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDai1(
                2.0d,
                discountedCashFlowFixed,
                alphaFixed,
                discountedCashFlowIbor,
                DoubleArray.filled(3))
            .getDerivatives();
    assertEquals(3, derivatives.size());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertFalse(derivatives.isEmpty());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDaf1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return Derivatives is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDaf1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDaf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when DoubleArray; then return Derivatives is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDaf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDaf1_whenDoubleArray_thenReturnDerivativesIsEmpty() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDaf1(
                2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of())
            .getDerivatives());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDaf1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Derivatives is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDaf1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDaf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Derivatives is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDaf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDaf1_whenFilledThree_thenReturnDerivativesIsEmpty() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.filled(3);

    // Act and Assert
    assertSame(
        DoubleArray.EMPTY,
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDaf1(
                2.0d,
                discountedCashFlowFixed,
                alphaFixed,
                discountedCashFlowIbor,
                DoubleArray.filled(3))
            .getDerivatives());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDaf1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Derivatives size is three.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDaf1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDaf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Derivatives size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.basics.value.ValueDerivatives HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDaf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDaf1_whenFilledThree_thenReturnDerivativesSizeIsThree() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.filled(3);
    DoubleArray alphaFixed = DoubleArray.filled(3);
    DoubleArray discountedCashFlowIbor = DoubleArray.filled(3);

    // Act and Assert
    DoubleArray derivatives =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDaf1(
                2.0d,
                discountedCashFlowFixed,
                alphaFixed,
                discountedCashFlowIbor,
                DoubleArray.filled(3))
            .getDerivatives();
    assertEquals(3, derivatives.size());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertFalse(derivatives.isEmpty());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Ddcf1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return First is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Ddcf1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx2Ddcf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when DoubleArray; then return First is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx2Ddcf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx2Ddcf1_whenDoubleArray_thenReturnFirstIsEmpty() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act
    Pair<DoubleArray, DoubleArray> actualSwapRateDx2Ddcf1Result =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRateDx2Ddcf1(
            2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of());

    // Assert
    DoubleArray doubleArray = DoubleArray.EMPTY;
    assertSame(doubleArray, actualSwapRateDx2Ddcf1Result.getFirst());
    assertSame(doubleArray, actualSwapRateDx2Ddcf1Result.getSecond());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Ddcf1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Second size is three.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Ddcf1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx2Ddcf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Second size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx2Ddcf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx2Ddcf1_whenFilledThree_thenReturnSecondSizeIsThree() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.filled(3);

    // Act and Assert
    DoubleArray second =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDx2Ddcf1(
                2.0d,
                discountedCashFlowFixed,
                alphaFixed,
                discountedCashFlowIbor,
                DoubleArray.filled(3))
            .getSecond();
    assertEquals(3, second.size());
    List<Double> toListResult = second.toList();
    assertEquals(3, toListResult.size());
    assertFalse(second.isEmpty());
    assertEquals(Double.NaN, second.max());
    assertEquals(Double.NaN, second.min());
    assertEquals(Double.NaN, second.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN}, second.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Ddcf1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Second size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Ddcf1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx2Ddcf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Second size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx2Ddcf1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx2Ddcf1_whenFilledThree_thenReturnSecondSizeIsZero() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.filled(3);
    DoubleArray alphaFixed = DoubleArray.filled(3);
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act
    Pair<DoubleArray, DoubleArray> actualSwapRateDx2Ddcf1Result =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRateDx2Ddcf1(
            2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of());

    // Assert
    DoubleArray second = actualSwapRateDx2Ddcf1Result.getSecond();
    assertEquals(0, second.size());
    assertEquals(0.0d, second.sum());
    DoubleArray first = actualSwapRateDx2Ddcf1Result.getFirst();
    assertEquals(3, first.size());
    assertEquals(3, first.toList().size());
    assertFalse(first.isEmpty());
    assertTrue(second.isEmpty());
    assertTrue(second.toList().isEmpty());
    assertEquals(Double.NaN, first.max());
    assertEquals(Double.NaN, first.min());
    assertEquals(Double.NaN, first.sum());
    assertArrayEquals(new double[] {}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Da1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return First is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Da1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx2Da1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when DoubleArray; then return First is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx2Da1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx2Da1_whenDoubleArray_thenReturnFirstIsEmpty() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act
    Pair<DoubleArray, DoubleArray> actualSwapRateDx2Da1Result =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRateDx2Da1(
            2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of());

    // Assert
    DoubleArray doubleArray = DoubleArray.EMPTY;
    assertSame(doubleArray, actualSwapRateDx2Da1Result.getFirst());
    assertSame(doubleArray, actualSwapRateDx2Da1Result.getSecond());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Da1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Second size is three.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Da1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx2Da1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Second size is three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx2Da1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx2Da1_whenFilledThree_thenReturnSecondSizeIsThree() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.of();
    DoubleArray alphaFixed = DoubleArray.of();
    DoubleArray discountedCashFlowIbor = DoubleArray.filled(3);

    // Act and Assert
    DoubleArray second =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT
            .swapRateDx2Da1(
                2.0d,
                discountedCashFlowFixed,
                alphaFixed,
                discountedCashFlowIbor,
                DoubleArray.filled(3))
            .getSecond();
    assertEquals(3, second.size());
    List<Double> toListResult = second.toList();
    assertEquals(3, toListResult.size());
    assertFalse(second.isEmpty());
    assertEquals(Double.NaN, second.max());
    assertEquals(Double.NaN, second.min());
    assertEquals(Double.NaN, second.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN}, second.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Da1(double,
   * DoubleArray, DoubleArray, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Second size is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#swapRateDx2Da1(double, DoubleArray,
   * DoubleArray, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test swapRateDx2Da1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray); when filled three; then return Second size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair HullWhiteOneFactorPiecewiseConstantInterestRateModel.swapRateDx2Da1(double, DoubleArray, DoubleArray, DoubleArray, DoubleArray)"
  })
  void testSwapRateDx2Da1_whenFilledThree_thenReturnSecondSizeIsZero() {
    // Arrange
    DoubleArray discountedCashFlowFixed = DoubleArray.filled(3);
    DoubleArray alphaFixed = DoubleArray.filled(3);
    DoubleArray discountedCashFlowIbor = DoubleArray.of();

    // Act
    Pair<DoubleArray, DoubleArray> actualSwapRateDx2Da1Result =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.swapRateDx2Da1(
            2.0d, discountedCashFlowFixed, alphaFixed, discountedCashFlowIbor, DoubleArray.of());

    // Assert
    DoubleArray second = actualSwapRateDx2Da1Result.getSecond();
    assertEquals(0, second.size());
    assertEquals(0.0d, second.sum());
    DoubleArray first = actualSwapRateDx2Da1Result.getFirst();
    assertEquals(3, first.size());
    assertEquals(3, first.toList().size());
    assertFalse(first.isEmpty());
    assertTrue(second.isEmpty());
    assertTrue(second.toList().isEmpty());
    assertEquals(Double.NaN, first.max());
    assertEquals(Double.NaN, first.min());
    assertEquals(Double.NaN, first.sum());
    assertArrayEquals(new double[] {}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#meta()}.
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean HullWhiteOneFactorPiecewiseConstantInterestRateModel.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<HullWhiteOneFactorPiecewiseConstantInterestRateModel> actualMetaResult =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    assertTrue(actualMetaResult.metaPropertyMap().isEmpty());
    assertTrue(actualMetaResult.isBuildable());
    Class<HullWhiteOneFactorPiecewiseConstantInterestRateModel> expectedBeanTypeResult =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#metaBean()}.
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "TypedMetaBean HullWhiteOneFactorPiecewiseConstantInterestRateModel.metaBean()"
  })
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<HullWhiteOneFactorPiecewiseConstantInterestRateModel> actualMetaBeanResult =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    assertTrue(actualMetaBeanResult.metaPropertyMap().isEmpty());
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<HullWhiteOneFactorPiecewiseConstantInterestRateModel> expectedBeanTypeResult =
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#equals(Object)}, and {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#equals(Object)}
   *   <li>{@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantInterestRateModel.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantInterestRateModel.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    HullWhiteOneFactorPiecewiseConstantInterestRateModel
        hullWhiteOneFactorPiecewiseConstantInterestRateModel =
            HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT;
    HullWhiteOneFactorPiecewiseConstantInterestRateModel
        hullWhiteOneFactorPiecewiseConstantInterestRateModel2 =
            HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT;

    // Act and Assert
    assertEquals(
        hullWhiteOneFactorPiecewiseConstantInterestRateModel,
        hullWhiteOneFactorPiecewiseConstantInterestRateModel2);
    assertEquals(
        hullWhiteOneFactorPiecewiseConstantInterestRateModel.hashCode(),
        hullWhiteOneFactorPiecewiseConstantInterestRateModel2.hashCode());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#equals(Object)}, and {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#equals(Object)}
   *   <li>{@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantInterestRateModel.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantInterestRateModel.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    HullWhiteOneFactorPiecewiseConstantInterestRateModel
        hullWhiteOneFactorPiecewiseConstantInterestRateModel =
            HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT;

    // Act and Assert
    assertEquals(
        hullWhiteOneFactorPiecewiseConstantInterestRateModel,
        hullWhiteOneFactorPiecewiseConstantInterestRateModel);
    int expectedHashCodeResult = hullWhiteOneFactorPiecewiseConstantInterestRateModel.hashCode();
    assertEquals(
        expectedHashCodeResult, hullWhiteOneFactorPiecewiseConstantInterestRateModel.hashCode());
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantInterestRateModel.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantInterestRateModel.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT, 1);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantInterestRateModel.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantInterestRateModel.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT, null);
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link
   * HullWhiteOneFactorPiecewiseConstantInterestRateModel#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean HullWhiteOneFactorPiecewiseConstantInterestRateModel.equals(Object)",
    "int HullWhiteOneFactorPiecewiseConstantInterestRateModel.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT,
        "Different type to HullWhiteOneFactorPiecewiseConstantInterestRateModel");
  }

  /**
   * Test {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#toString()}.
   *
   * <p>Method under test: {@link HullWhiteOneFactorPiecewiseConstantInterestRateModel#toString()}
   */
  @Test
  @DisplayName("Test toString()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "java.lang.String HullWhiteOneFactorPiecewiseConstantInterestRateModel.toString()"
  })
  void testToString() {
    // Arrange, Act and Assert
    assertEquals(
        "HullWhiteOneFactorPiecewiseConstantInterestRateModel{}",
        HullWhiteOneFactorPiecewiseConstantInterestRateModel.DEFAULT.toString());
  }
}
