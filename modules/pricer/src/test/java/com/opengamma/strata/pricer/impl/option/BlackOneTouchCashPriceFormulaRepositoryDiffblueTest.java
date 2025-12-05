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

class BlackOneTouchCashPriceFormulaRepositoryDiffblueTest {
  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 1.0E-7}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); then return '1.0E-7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchCashPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn10e7() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        1.0E-7d,
        blackOneTouchCashPriceFormulaRepository.price(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d)));
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 0.5492802716530588}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); then return '0.5492802716530588'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchCashPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn05492802716530588() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.5492802716530588d,
        blackOneTouchCashPriceFormulaRepository.price(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 0.9999900000499998}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); then return '0.9999900000499998'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchCashPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn09999900000499998() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.9999900000499998d,
        blackOneTouchCashPriceFormulaRepository.price(
            10.0d,
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@code 1.0276165777435628E-81}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); then return '1.0276165777435628E-81'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchCashPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturn10276165777435628e81() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        1.0276165777435628E-81d,
        blackOneTouchCashPriceFormulaRepository.price(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchCashPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_thenReturnNaN() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        Double.NaN,
        blackOneTouchCashPriceFormulaRepository.price(
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, -0.5d)));
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.5492741356348174}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); when '0.5'; then return '0.5492741356348174'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchCashPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when05_thenReturn05492741356348174() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.5492741356348174d,
        blackOneTouchCashPriceFormulaRepository.price(
            10.0d,
            0.5d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 9.838967742226394E-8}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); when '0.5'; then return '9.838967742226394E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchCashPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when05_thenReturn9838967742226394e8() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        9.838967742226394E-8d,
        blackOneTouchCashPriceFormulaRepository.price(
            1.0E-6d,
            0.5d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d)));
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-6}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); when '1.0E-6'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchCashPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when10e6_thenReturnZero() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackOneTouchCashPriceFormulaRepository.price(
            10.0d,
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return {@code 1.7296398236793047}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); when '-6.0136873569177505'; then return '1.7296398236793047'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchCashPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when60136873569177505_thenReturn17296398236793047() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        1.7296398236793047d,
        blackOneTouchCashPriceFormulaRepository.price(
            10.0d,
            0.5d,
            10.0d,
            -6.0136873569177505d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#price(double, double, double, double,
   * double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#price(double, double,
   * double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, double, SimpleConstantContinuousBarrier); when '-6.0136873569177505'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackOneTouchCashPriceFormulaRepository.price(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPrice_when60136873569177505_thenReturnZero() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act and Assert
    assertEquals(
        0.0d,
        blackOneTouchCashPriceFormulaRepository.price(
            10.0d,
            -6.0136873569177505d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d)));
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchCashPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchCashPriceFormulaRepository.priceAdjoint(
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
    assertEquals(-0.010986021981152972d, toListResult.get(0).doubleValue());
    assertEquals(-0.02742157524788325d, derivatives.min());
    assertEquals(-0.02742157524788325d, toListResult.get(1).doubleValue());
    assertEquals(0.0013182939907337378d, toListResult.get(5).doubleValue());
    assertEquals(0.023379038835545127d, derivatives.sum());
    assertEquals(0.06582809532097539d, derivatives.max());
    assertEquals(0.5492741356348174d, actualPriceAdjointResult.getValue());
    assertEquals(1.2639920521587353E-4d, toListResult.get(4).doubleValue());
    assertArrayEquals(
        new double[] {
          -0.010986021981152972d,
          -0.02742157524788325d,
          -0.005486152452343649d,
          0.06582809532097539d,
          1.2639920521587353E-4d,
          0.0013182939907337378d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchCashPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint2() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchCashPriceFormulaRepository.priceAdjoint(
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
    assertEquals(-1.0276165777435627E-80d, toListResult.get(1).doubleValue());
    assertEquals(-1.864894328856148E-80d, toListResult.get(4).doubleValue());
    assertEquals(-2.5005838007807365E-80d, derivatives.min());
    assertEquals(-3.1766193089717305E-84d, toListResult.get(5).doubleValue());
    assertEquals(-4.972887900999829E-80d, derivatives.sum());
    assertEquals(1.0276165777435628E-81d, actualPriceAdjointResult.getValue());
    assertEquals(4.1301414927778324E-81d, derivatives.max());
    assertEquals(7.510319033731903E-83d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {
          7.510319033731903E-83d,
          -1.0276165777435627E-80d,
          4.1301414927778324E-81d,
          -2.5005838007807365E-80d,
          -1.864894328856148E-80d,
          -3.1766193089717305E-84d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchCashPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint3() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchCashPriceFormulaRepository.priceAdjoint(
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
    assertEquals(-0.0026057228622722102d, toListResult.get(5).doubleValue());
    assertEquals(-0.0226802037642869d, derivatives.sum());
    assertEquals(-0.1995094308655669d, toListResult.get(1).doubleValue());
    assertEquals(-0.2579964363888301d, derivatives.min());
    assertEquals(0.03006479370395773d, toListResult.get(0).doubleValue());
    assertEquals(0.37937819871640105d, derivatives.max());
    assertEquals(0.37937819871640105d, toListResult.get(4).doubleValue());
    assertEquals(1.7296398236793047d, actualPriceAdjointResult.getValue());
    assertArrayEquals(
        new double[] {
          0.03006479370395773d,
          -0.1995094308655669d,
          0.0279883939320235d,
          -0.2579964363888301d,
          0.37937819871640105d,
          -0.0026057228622722102d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchCashPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint4() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchCashPriceFormulaRepository.priceAdjoint(
            10.0d,
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_OUT, 0.5d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-9.999900000499998E-7d, toListResult.get(1).doubleValue());
    assertEquals(-9.999900000499998d, derivatives.min());
    assertEquals(-9.999900000499998d, toListResult.get(4).doubleValue());
    assertEquals(-9.999901000489999d, derivatives.sum());
    assertEquals(0.9999900000499998d, actualPriceAdjointResult.getValue());
    assertArrayEquals(
        new double[] {0.0d, -9.999900000499998E-7d, 0.0d, 0.0d, -9.999900000499998d, 0.0d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code -2.686349275159719E-8}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); then return Derivatives min is '-2.686349275159719E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchCashPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesMinIs2686349275159719e8() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchCashPriceFormulaRepository.priceAdjoint(
            1.0E-6d,
            10.0d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-2.686349275159719E-8d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-2.686349275159719E-8d, toListResult.get(1).doubleValue());
    assertEquals(0.1d, derivatives.max());
    assertEquals(0.1d, derivatives.sum());
    assertEquals(0.1d, toListResult.get(0).doubleValue());
    assertEquals(1.0E-7d, actualPriceAdjointResult.getValue());
    assertEquals(1.9002192666780916E-83d, toListResult.get(4).doubleValue());
    assertEquals(2.446731344488069E-73d, toListResult.get(5).doubleValue());
    assertArrayEquals(
        new double[] {
          0.1d,
          -2.686349275159719E-8d,
          2.6863492751597198E-8d,
          3.800438533356183E-83d,
          1.9002192666780916E-83d,
          2.446731344488069E-73d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Derivatives toList first doubleValue is {@code -0.01098560543306118}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); then return Derivatives toList first doubleValue is '-0.01098560543306118'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchCashPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnDerivativesToListFirstDoubleValueIs001098560543306118() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchCashPriceFormulaRepository.priceAdjoint(
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
    assertEquals(-0.01098560543306118d, toListResult.get(0).doubleValue());
    assertEquals(-0.027424943950292855d, derivatives.min());
    assertEquals(-0.027424943950292855d, toListResult.get(1).doubleValue());
    assertEquals(0.0013182726519673418d, toListResult.get(5).doubleValue());
    assertEquals(0.023242599959257614d, derivatives.sum());
    assertEquals(0.06581986548070287d, derivatives.max());
    assertEquals(0.5492802716530588d, actualPriceAdjointResult.getValue());
    assertEquals(8.372777511128992E-81d, toListResult.get(4).doubleValue());
    assertArrayEquals(
        new double[] {
          -0.01098560543306118d,
          -0.027424943950292855d,
          -0.005484988790058574d,
          0.06581986548070287d,
          8.372777511128992E-81d,
          0.0013182726519673418d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>Then return Value is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); then return Value is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchCashPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_thenReturnValueIsNaN() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchCashPriceFormulaRepository.priceAdjoint(
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
   * Test {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return Derivatives min is {@code -2.5963029117322297E-8}.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); when '0.5'; then return Derivatives min is '-2.5963029117322297E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchCashPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_when05_thenReturnDerivativesMinIs25963029117322297e8() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchCashPriceFormulaRepository.priceAdjoint(
            1.0E-6d,
            0.5d,
            10.0d,
            10.0d,
            10.0d,
            SimpleConstantContinuousBarrier.of(BarrierType.UP, KnockType.KNOCK_IN, 10.0d));

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-2.5963029117322297E-8d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-2.5963029117322297E-8d, toListResult.get(1).doubleValue());
    assertEquals(0.09898729588523376d, toListResult.get(0).doubleValue());
    assertEquals(2.6475962380714158E-8d, toListResult.get(4).doubleValue());
    assertEquals(409.9955550203183d, derivatives.max());
    assertEquals(409.9955550203183d, toListResult.get(5).doubleValue());
    assertEquals(410.09454234504636d, derivatives.sum());
    assertEquals(9.838967742226394E-8d, actualPriceAdjointResult.getValue());
    assertArrayEquals(
        new double[] {
          0.09898729588523376d,
          -2.5963029117322297E-8d,
          2.6243753964518764E-8d,
          2.0861465436784827E-9d,
          2.6475962380714158E-8d,
          409.9955550203183d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-6}.
   *   <li>Then return Derivatives min is zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); when '1.0E-6'; then return Derivatives min is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchCashPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_when10e6_thenReturnDerivativesMinIsZero() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act and Assert
    DoubleArray derivatives =
        blackOneTouchCashPriceFormulaRepository
            .priceAdjoint(
                10.0d,
                1.0E-6d,
                10.0d,
                10.0d,
                10.0d,
                SimpleConstantContinuousBarrier.of(BarrierType.DOWN, KnockType.KNOCK_IN, 0.5d))
            .getDerivatives();
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(0.0d, toListResult.get(4).doubleValue());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double, double, double,
   * double, double, SimpleConstantContinuousBarrier)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackOneTouchCashPriceFormulaRepository#priceAdjoint(double,
   * double, double, double, double, SimpleConstantContinuousBarrier)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier); when '-6.0136873569177505'; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackOneTouchCashPriceFormulaRepository.priceAdjoint(double, double, double, double, double, SimpleConstantContinuousBarrier)"
  })
  void testPriceAdjoint_when60136873569177505_thenReturnValueIsZero() {
    // Arrange
    BlackOneTouchCashPriceFormulaRepository blackOneTouchCashPriceFormulaRepository =
        new BlackOneTouchCashPriceFormulaRepository();

    // Act
    ValueDerivatives actualPriceAdjointResult =
        blackOneTouchCashPriceFormulaRepository.priceAdjoint(
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
