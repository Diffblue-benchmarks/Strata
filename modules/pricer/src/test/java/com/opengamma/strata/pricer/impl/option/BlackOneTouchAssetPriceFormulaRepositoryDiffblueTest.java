package com.opengamma.strata.pricer.impl.option;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.product.option.BarrierType;
import com.opengamma.strata.product.option.KnockType;
import com.opengamma.strata.product.option.SimpleConstantContinuousBarrier;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BlackOneTouchAssetPriceFormulaRepositoryDiffblueTest {
  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 1.0E-6}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); then return '1.0E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchAssetPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn10e6() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        1.0E-6d,
        blackOneTouchAssetPriceFormulaRepository.price(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d)));
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 9.72535986417347}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); then return '9.72535986417347'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchAssetPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn972535986417347() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        9.72535986417347d,
        blackOneTouchAssetPriceFormulaRepository.price(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 0.2746401358265294}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); then return '0.2746401358265294'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchAssetPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn02746401358265294() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.2746401358265294d,
        blackOneTouchAssetPriceFormulaRepository.price(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchAssetPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturnNaN() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        Double.NaN,
        blackOneTouchAssetPriceFormulaRepository.price(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, -0.5d)));
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchAssetPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturnTen() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        10.0d,
        blackOneTouchAssetPriceFormulaRepository.price(
            10.0d,
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.2746370678174087}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); when '0.5'; then return '0.2746370678174087'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchAssetPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when05_thenReturn02746370678174087() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.2746370678174087d,
        blackOneTouchAssetPriceFormulaRepository.price(
            10.0d,
            0.5d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 9.838967742226394E-7}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); when '0.5'; then return '9.838967742226394E-7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchAssetPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when05_thenReturn9838967742226394e7() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        9.838967742226394E-7d,
        blackOneTouchAssetPriceFormulaRepository.price(
            1.0E-6d,
            0.5d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d)));
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-6}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); when '1.0E-6'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchAssetPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when10e6_thenReturnZero() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackOneTouchAssetPriceFormulaRepository.price(
            10.0d,
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return {@code 0.8648199118396523}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); when '-6.0136873569177505'; then return '0.8648199118396523'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchAssetPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when60136873569177505_thenReturn08648199118396523() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.8648199118396523d,
        blackOneTouchAssetPriceFormulaRepository.price(
            10.0d,
            0.5d,
            10.0d,
            -6.0136873569177505d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); when '-6.0136873569177505'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchAssetPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when60136873569177505_thenReturnZero() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackOneTouchAssetPriceFormulaRepository.price(
            10.0d,
            -6.0136873569177505d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchAssetPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchAssetPriceFormulaRepository.priceAdjoint(
            10.0d,
            0.5d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-0.005493010990576486d, toListResult.get(0).doubleValue());
    assertEquals(-0.013710787623941626d, derivatives.min());
    assertEquals(-0.013710787623941626d, toListResult.get(1).doubleValue());
    assertEquals(0.011689519417772564d, derivatives.sum());
    assertEquals(0.032914047660487694d, derivatives.max());
    assertEquals(0.2746370678174087d, actualPriceAdjointResult.getValue());
    assertEquals(6.319960260793677E-5d, toListResult.get(4).doubleValue());
    assertEquals(6.591469953668689E-4d, toListResult.get(5).doubleValue());
    assertArrayEquals(
        new double[] {
          -0.005493010990576486d,
          -0.013710787623941626d,
          -0.0027430762261718244d,
          0.032914047660487694d,
          6.319960260793677E-5d,
          6.591469953668689E-4d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchAssetPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint2() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchAssetPriceFormulaRepository.priceAdjoint(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-4.186388755564988E-81d, toListResult.get(4).doubleValue());
    assertEquals(-6.591363259836709E-4d, toListResult.get(5).doubleValue());
    assertEquals(-97.2535986417347d, derivatives.min());
    assertEquals(-97.2535986417347d, toListResult.get(1).doubleValue());
    assertEquals(0.9883787000203729d, derivatives.sum());
    assertEquals(1.0054928027165306d, toListResult.get(0).doubleValue());
    assertEquals(9.72535986417347d, actualPriceAdjointResult.getValue());
    assertEquals(97.27005360810487d, derivatives.max());
    assertArrayEquals(
        new double[] {
          1.0054928027165306d,
          -97.2535986417347d,
          97.27005360810487d,
          -0.03290993274035144d,
          -4.186388755564988E-81d,
          -6.591363259836709E-4d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchAssetPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint3() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchAssetPriceFormulaRepository.priceAdjoint(
            10.0d,
            0.5d,
            10.0d,
            -6.0136873569177505d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-0.0013028614311361051d, toListResult.get(5).doubleValue());
    assertEquals(-0.01134010188214345d, derivatives.sum());
    assertEquals(-0.09975471543278346d, toListResult.get(1).doubleValue());
    assertEquals(-0.12899821819441504d, derivatives.min());
    assertEquals(0.015032396851978864d, toListResult.get(0).doubleValue());
    assertEquals(0.18968909935820052d, derivatives.max());
    assertEquals(0.18968909935820052d, toListResult.get(4).doubleValue());
    assertEquals(0.8648199118396523d, actualPriceAdjointResult.getValue());
    assertArrayEquals(
        new double[] {
          0.015032396851978864d,
          -0.09975471543278346d,
          0.01399419696601175d,
          -0.12899821819441504d,
          0.18968909935820052d,
          -0.0013028614311361051d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code -2.68634927515972E-7}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); then return Derivatives min is '-2.68634927515972E-7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchAssetPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesMinIs268634927515972e7() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchAssetPriceFormulaRepository.priceAdjoint(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-2.68634927515972E-7d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-2.68634927515972E-7d, toListResult.get(1).doubleValue());
    assertEquals(1.0E-6d, actualPriceAdjointResult.getValue());
    assertEquals(1.9002192666780935E-82d, toListResult.get(4).doubleValue());
    assertEquals(2.446731344488087E-72d, toListResult.get(5).doubleValue());
    assertArrayEquals(
        new double[] {
          1.0d,
          -2.68634927515972E-7d,
          2.68634927515972E-7d,
          -6.617444900424221E-23d,
          1.9002192666780935E-82d,
          2.446731344488087E-72d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code -9.999999999999999E-6}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); then return Derivatives min is '-9.999999999999999E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchAssetPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesMinIs9999999999999999e6() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchAssetPriceFormulaRepository.priceAdjoint(
            10.0d,
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-9.999999999999999E-6d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-9.999999999999999E-6d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, actualPriceAdjointResult.getValue());
    assertArrayEquals(
        new double[] {1.0d, -9.999999999999999E-6d, 9.999999999999999E-6d, 0.0d, 0.0d, 0.0d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives toList first doubleValue is {@code -0.00549280271653059}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); then return Derivatives toList first doubleValue is '-0.00549280271653059'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchAssetPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesToListFirstDoubleValueIs000549280271653059() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchAssetPriceFormulaRepository.priceAdjoint(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-0.00549280271653059d, toListResult.get(0).doubleValue());
    assertEquals(-0.013712471975146431d, derivatives.min());
    assertEquals(-0.013712471975146431d, toListResult.get(1).doubleValue());
    assertEquals(0.0116212999796288d, derivatives.sum());
    assertEquals(0.032909932740351436d, derivatives.max());
    assertEquals(0.2746401358265294d, actualPriceAdjointResult.getValue());
    assertEquals(4.186388755564496E-81d, toListResult.get(4).doubleValue());
    assertEquals(6.591363259836709E-4d, toListResult.get(5).doubleValue());
    assertArrayEquals(
        new double[] {
          -0.00549280271653059d,
          -0.013712471975146431d,
          -0.002742494395029287d,
          0.032909932740351436d,
          4.186388755564496E-81d,
          6.591363259836709E-4d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Value is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); then return Value is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchAssetPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnValueIsNaN() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchAssetPriceFormulaRepository.priceAdjoint(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, -0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(Double.NaN, actualPriceAdjointResult.getValue());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(4).doubleValue());
    assertEquals(Double.NaN, toListResult.get(5).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return Derivatives min is {@code -2.59630291173223E-7}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); when '0.5'; then return Derivatives min is '-2.59630291173223E-7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchAssetPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_when05_thenReturnDerivativesMinIs259630291173223e7() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchAssetPriceFormulaRepository.priceAdjoint(
            1.0E-6d,
            0.5d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-2.59630291173223E-7d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-2.59630291173223E-7d, toListResult.get(1).doubleValue());
    assertEquals(0.9898729588523375d, toListResult.get(0).doubleValue());
    assertEquals(2.647596238071416E-7d, toListResult.get(4).doubleValue());
    assertEquals(4099.955550203185d, derivatives.max());
    assertEquals(4099.955550203185d, toListResult.get(5).doubleValue());
    assertEquals(4100.945423450466d, derivatives.sum());
    assertEquals(9.838967742226394E-7d, actualPriceAdjointResult.getValue());
    assertArrayEquals(
        new double[] {
          0.9898729588523375d,
          -2.59630291173223E-7d,
          2.624375396451876E-7d,
          2.0861465436784894E-8d,
          2.647596238071416E-7d,
          4099.955550203185d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-6}.
   *   <li>Then return Derivatives max is zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); when '1.0E-6'; then return Derivatives max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchAssetPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_when10e6_thenReturnDerivativesMaxIsZero() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act and Assert
    DoubleArray derivatives =
        blackOneTouchAssetPriceFormulaRepository
            .priceAdjoint(
                10.0d,
                1.0E-6d,
                10.0d,
                10.0d,
                10.0d,
                SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d))
            .getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchAssetPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); when '-6.0136873569177505'; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchAssetPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_when60136873569177505_thenReturnValueIsZero() {
    // Arrange
    BlackOneTouchAssetPriceFormulaRepository blackOneTouchAssetPriceFormulaRepository =
        new BlackOneTouchAssetPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchAssetPriceFormulaRepository.priceAdjoint(
            10.0d,
            -6.0136873569177505d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d));

    // Assert
    assertEquals(0.0d, actualPriceAdjointResult.getValue());
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(4).doubleValue());
    assertEquals(Double.NaN, toListResult.get(5).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, 0.0d, Double.NaN, Double.NaN, Double.NaN, Double.NaN},
        derivatives.toArrayUnsafe(),
        0.0);
  }
}
