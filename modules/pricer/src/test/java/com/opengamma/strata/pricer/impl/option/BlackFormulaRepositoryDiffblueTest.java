package com.opengamma.strata.pricer.impl.option;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.tuple.Pair;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class BlackFormulaRepositoryDiffblueTest {
  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 9.99593047982555}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when '0.5'; then return '9.99593047982555'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_when05_thenReturn999593047982555() {
    // Arrange and Act
    double actualPriceResult = BlackFormulaRepository.price(10.0d, 10.0d, 0.5d, 10.0d, true);

    // Assert
    assertEquals(9.99593047982555d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 1.0E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when '1.0E13'; then return '1.0E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturn10e13() {
    // Arrange and Act
    double actualPriceResult = BlackFormulaRepository.price(1.0E13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0E13d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 1.0E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when '1.0E13'; then return '1.0E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturn10e132() {
    // Arrange and Act
    double actualPriceResult = BlackFormulaRepository.price(1.0E13d, 10.0d, 10.0d, 1.0E13d, true);

    // Assert
    assertEquals(1.0E13d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 1.2612133559741778E-12}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when '1.0E-13'; then return '1.2612133559741778E-12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturn12612133559741778e12() {
    // Arrange and Act
    double actualPriceResult = BlackFormulaRepository.price(10.0d, 10.0d, 10.0d, 1.0E-13d, true);

    // Assert
    assertEquals(1.2612133559741778E-12d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 1.2615662610571121E-5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when '1.0E-13'; then return '1.2615662610571121E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturn12615662610571121e5() {
    // Arrange and Act
    double actualPriceResult = BlackFormulaRepository.price(10.0d, 10.0d, 1.0E-13d, 10.0d, true);

    // Assert
    assertEquals(1.2615662610571121E-5d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when '1.0E13'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_when10e13_thenReturnTen() {
    // Arrange and Act
    double actualPriceResult = BlackFormulaRepository.price(10.0d, 10.0d, 10.0d, 1.0E13d, true);

    // Assert
    assertEquals(10.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 1.0000000000000002E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when '1.0000000000000002E13'; then return '1.0000000000000002E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_when10000000000000002e13_thenReturn10000000000000002e13() {
    // Arrange and Act
    double actualPriceResult =
        BlackFormulaRepository.price(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(1.0000000000000002E13d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 1.0000000000000002E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when '1.0000000000000002E13'; then return '1.0000000000000002E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_when10000000000000002e13_thenReturn10000000000000002e132() {
    // Arrange and Act
    double actualPriceResult =
        BlackFormulaRepository.price(
            1.0000000000000002E13d, 1.0000000000000002E13d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(1.0000000000000002E13d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 1.0000000000000002E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when '1.0000000000000002E13'; then return '1.0000000000000002E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_when10000000000000002e13_thenReturn10000000000000002e133() {
    // Arrange and Act
    double actualPriceResult =
        BlackFormulaRepository.price(
            1.0000000000000002E13d, 1.0000000000000002E13d, 0.0d, 0.0d, true);

    // Assert
    assertEquals(1.0000000000000002E13d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualPriceResult =
        BlackFormulaRepository.price(1.0000000000000002E13d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 7.0710678118654755}.
   *   <li>Then return {@code 9.875806693484478}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when '7.0710678118654755'; then return '9.875806693484478'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_when70710678118654755_thenReturn9875806693484478() {
    // Arrange and Act
    double actualPriceResult =
        BlackFormulaRepository.price(10.0d, 10.0d, 0.5d, 7.0710678118654755d, true);

    // Assert
    assertEquals(9.875806693484478d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, boolean); when 'false'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_whenFalse_thenReturnZero() {
    // Arrange and Act
    double actualPriceResult = BlackFormulaRepository.price(0.0d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName("Test price(double, double, double, double, boolean); when ten; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_whenTen_thenReturnTen() {
    // Arrange and Act
    double actualPriceResult = BlackFormulaRepository.price(10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(10.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#price(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#price(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName("Test price(double, double, double, double, boolean); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.price(double, double, double, double, boolean)"
  })
  void testPrice_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualPriceResult = BlackFormulaRepository.price(0.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code -0.006209665325776129}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); then return Derivatives min is '-0.006209665325776129'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_thenReturnDerivativesMinIs0006209665325776129() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(10.0d, 10.0d, 0.5d, 7.0710678118654755d, true);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-0.006209665325776129d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.006209665325776129d, toListResult.get(1).doubleValue());
    assertEquals(0.12394380141677806d, toListResult.get(3).doubleValue());
    assertEquals(0.8764150246784258d, toListResult.get(2).doubleValue());
    assertEquals(0.9937903346742238d, derivatives.max());
    assertEquals(0.9937903346742238d, toListResult.get(0).doubleValue());
    assertEquals(1.9879394954436513d, derivatives.sum());
    assertEquals(9.875806693484478d, actualPriceAdjointResult.getValue());
    assertArrayEquals(
        new double[] {
          0.9937903346742238d, -0.006209665325776129d, 0.8764150246784258d, 0.12394380141677806d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>Then return Derivatives toArrayUnsafe is array of {@code double} with zero and {@code
   *       -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); then return Derivatives toArrayUnsafe is array of double with zero and '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_thenReturnDerivativesToArrayUnsafeIsArrayOfDoubleWithZeroAnd00() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(0.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.0d, toListResult.get(1).doubleValue());
    assertEquals(0.0d, actualPriceAdjointResult.getValue());
    assertArrayEquals(new double[] {0.0d, -0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return Derivatives min is {@code -2.034760087224795E-4}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when '0.5'; then return Derivatives min is '-2.034760087224795E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_when05_thenReturnDerivativesMinIs2034760087224795e4() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(10.0d, 10.0d, 0.5d, 10.0d, true);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-2.034760087224795E-4d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-2.034760087224795E-4d, toListResult.get(1).doubleValue());
    assertEquals(0.0054457105758817705d, toListResult.get(3).doubleValue());
    assertEquals(0.054457105758817695d, toListResult.get(2).doubleValue());
    assertEquals(0.9997965239912775d, derivatives.max());
    assertEquals(0.9997965239912775d, toListResult.get(0).doubleValue());
    assertEquals(1.0594958643172545d, derivatives.sum());
    assertEquals(9.99593047982555d, actualPriceAdjointResult.getValue());
    assertArrayEquals(
        new double[] {
          0.9997965239912775d, -2.034760087224795E-4d, 0.054457105758817695d, 0.0054457105758817705d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return Derivatives min is {@code -0.4999993692168695}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when '1.0E-13'; then return Derivatives min is '-0.4999993692168695'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_when10e13_thenReturnDerivativesMinIs04999993692168695() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(10.0d, 10.0d, 1.0E-13d, 10.0d, true);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-0.4999993692168695d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.4999993692168695d, toListResult.get(1).doubleValue());
    assertEquals(0.5000006307831305d, toListResult.get(0).doubleValue());
    assertEquals(1.2615662610085032E-6d, toListResult.get(3).doubleValue());
    assertEquals(1.2615662610571121E-5d, actualPriceAdjointResult.getValue());
    assertEquals(6.3078313050425164E7d, derivatives.max());
    assertEquals(6.3078313050425164E7d, toListResult.get(2).doubleValue());
    assertEquals(6.307831305042768E7d, derivatives.sum());
    assertArrayEquals(
        new double[] {
          0.5000006307831305d, -0.4999993692168695d, 6.3078313050425164E7d, 1.2615662610085032E-6d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return Derivatives min is {@code -9.377937177057185E-51}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when '1.0E13'; then return Derivatives min is '-9.377937177057185E-51'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_when10e13_thenReturnDerivativesMinIs9377937177057185e51() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(1.0E13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-9.377937177057185E-51d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-9.377937177057185E-51d, toListResult.get(1).doubleValue());
    assertEquals(2.224762756075917E-48d, toListResult.get(2).doubleValue());
    assertEquals(4.449525512151834E-48d, toListResult.get(3).doubleValue());
    assertArrayEquals(
        new double[] {
          1.0d, -9.377937177057185E-51d, 2.224762756075917E-48d, 4.449525512151834E-48d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return Derivatives min is {@code -0.49999999999993694}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when '1.0E-13'; then return Derivatives min is '-0.49999999999993694'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_when10e13_thenReturnDerivativesMinIs049999999999993694() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(10.0d, 10.0d, 10.0d, 1.0E-13d, true);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-0.49999999999993694d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.49999999999993694d, toListResult.get(1).doubleValue());
    assertEquals(0.5000000000000631d, toListResult.get(0).doubleValue());
    assertEquals(1.2612133559741778E-12d, actualPriceAdjointResult.getValue());
    assertEquals(12.615662610100802d, derivatives.max());
    assertEquals(12.615662610100802d, toListResult.get(3).doubleValue());
    assertEquals(12.615662610100992d, derivatives.sum());
    assertEquals(6.307831305050401E-14d, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {
          0.5000000000000631d, -0.49999999999993694d, 6.307831305050401E-14d, 12.615662610100802d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return Derivatives min is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when '1.0E13'; then return Derivatives min is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_when10e13_thenReturnDerivativesMinIsMinusOne() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(0.0d, 1.0E13d, 0.0d, 0.0d, false);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-1.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-1.0d, toListResult.get(0).doubleValue());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertArrayEquals(new double[] {-1.0d, 1.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return Value is {@code 1.0E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when '1.0E13'; then return Value is '1.0E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_when10e13_thenReturnValueIs10e13() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(1.0E13d, 10.0d, 10.0d, 1.0E13d, true);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0E13d, actualPriceAdjointResult.getValue());
    assertArrayEquals(new double[] {1.0d, -0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return Value is ten.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when '1.0E13'; then return Value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_when10e13_thenReturnValueIsTen() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(10.0d, 10.0d, 10.0d, 1.0E13d, true);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.0d, toListResult.get(1).doubleValue());
    assertEquals(10.0d, actualPriceAdjointResult.getValue());
    assertArrayEquals(new double[] {1.0d, -0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return Derivatives min is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when '1.0000000000000002E13'; then return Derivatives min is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_when10000000000000002e13_thenReturnDerivativesMinIsMinusOne() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d, false);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-1.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-1.0d, toListResult.get(0).doubleValue());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertArrayEquals(new double[] {-1.0d, 1.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return Value is {@code 1.0000000000000002E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when '1.0000000000000002E13'; then return Value is '1.0000000000000002E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_when10000000000000002e13_thenReturnValueIs10000000000000002e13() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(
            1.0000000000000002E13d, 1.0000000000000002E13d, 0.0d, 0.0d, false);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0000000000000002E13d, actualPriceAdjointResult.getValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return Value is {@code 1.0000000000000002E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when '1.0000000000000002E13'; then return Value is '1.0000000000000002E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_when10000000000000002e13_thenReturnValueIs10000000000000002e132() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(
            1.0000000000000002E13d, 1.0000000000000002E13d, 0.0d, 0.0d, true);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0000000000000002E13d, actualPriceAdjointResult.getValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when '1.0000000000000002E13'; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_when10000000000000002e13_thenReturnValueIsZero() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(1.0000000000000002E13d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualPriceAdjointResult.getValue());
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when 'false'; then return Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_whenFalse_thenReturnValueIsZero() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(0.0d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualPriceAdjointResult.getValue());
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Derivatives min is {@code -1.2984035196700745E-56}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, boolean); when ten; then return Derivatives min is '-1.2984035196700745E-56'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.priceAdjoint(double, double, double, double, boolean)"
  })
  void testPriceAdjoint_whenTen_thenReturnDerivativesMinIs12984035196700745e56() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        BlackFormulaRepository.priceAdjoint(10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-1.2984035196700745E-56d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-1.2984035196700745E-56d, toListResult.get(1).doubleValue());
    assertEquals(3.258890980287203E-54d, toListResult.get(2).doubleValue());
    assertEquals(6.517781960574406E-54d, toListResult.get(3).doubleValue());
    assertArrayEquals(
        new double[] {
          1.0d, -1.2984035196700745E-56d, 3.258890980287203E-54d, 6.517781960574406E-54d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint2(double, double, double, double, boolean)}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint2(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName("Test priceAdjoint2(double, double, double, double, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair BlackFormulaRepository.priceAdjoint2(double, double, double, double, boolean)"
  })
  void testPriceAdjoint2() {
    // Arrange and Act
    Pair<ValueDerivatives, double[][]> actualPriceAdjoint2Result =
        BlackFormulaRepository.priceAdjoint2(10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    DoubleArray derivatives = actualPriceAdjoint2Result.getFirst().getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-1.2984035196700745E-56d, toListResult.get(1).doubleValue());
    double[][] second = actualPriceAdjoint2Result.getSecond();
    assertEquals(3, second.length);
    assertArrayEquals(
        new double[] {-6.517781960574406E-58d, 6.517781960574406E-58d, 3.2588909802872034E-55d},
        second[1],
        0.0);
    assertArrayEquals(
        new double[] {3.2588909802872034E-55d, 3.2588909802872034E-55d, -1.6294454901436019E-52d},
        second[2],
        0.0);
    assertArrayEquals(
        new double[] {6.517781960574406E-58d, -6.517781960574406E-58d, 3.2588909802872034E-55d},
        second[0],
        0.0);
    assertArrayEquals(
        new double[] {
          1.0d, -1.2984035196700745E-56d, 3.258890980287203E-54d, 6.517781960574406E-54d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint2(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return First Derivatives min is {@code -0.499999980052886}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint2(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint2(double, double, double, double, boolean); when '1.0E-16'; then return First Derivatives min is '-0.499999980052886'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair BlackFormulaRepository.priceAdjoint2(double, double, double, double, boolean)"
  })
  void testPriceAdjoint2_when10e16_thenReturnFirstDerivativesMinIs0499999980052886() {
    // Arrange and Act
    Pair<ValueDerivatives, double[][]> actualPriceAdjoint2Result =
        BlackFormulaRepository.priceAdjoint2(10.0d, 10.0d, 1.0E-16d, 10.0d, true);

    // Assert
    ValueDerivatives first = actualPriceAdjoint2Result.getFirst();
    DoubleArray derivatives = first.getDerivatives();
    assertEquals(-0.499999980052886d, derivatives.min());
    assertEquals(1.994711402007161E9d, derivatives.max());
    assertEquals(1.994711402007161E9d, derivatives.sum());
    double[][] second = actualPriceAdjoint2Result.getSecond();
    assertEquals(3, second.length);
    assertEquals(3.9894228098802387E-7d, first.getValue());
    assertArrayEquals(
        new double[] {-398942.2804014322d, 398942.2804014322d, 2.03125E-9d}, second[1], 0.0);
    assertArrayEquals(
        new double[] {1.994711402007161E-9d, 2.03125E-9d, -9.973557010035806E-24d}, second[2], 0.0);
    assertArrayEquals(
        new double[] {398942.2804014322d, -398942.2804014322d, 1.994711402007161E-9d},
        second[0],
        0.0);
    assertArrayEquals(
        new double[] {
          0.5000000199471141d, -0.499999980052886d, 1.994711402007161E9d, 3.989422804014322E-8d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint2(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return First Derivatives min is {@code -0.49999999999999994}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint2(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint2(double, double, double, double, boolean); when '1.0E-16'; then return First Derivatives min is '-0.49999999999999994'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair BlackFormulaRepository.priceAdjoint2(double, double, double, double, boolean)"
  })
  void testPriceAdjoint2_when10e16_thenReturnFirstDerivativesMinIs049999999999999994() {
    // Arrange and Act
    Pair<ValueDerivatives, double[][]> actualPriceAdjoint2Result =
        BlackFormulaRepository.priceAdjoint2(10.0d, 10.0d, 10.0d, 1.0E-16d, true);

    // Assert
    ValueDerivatives first = actualPriceAdjoint2Result.getFirst();
    DoubleArray derivatives = first.getDerivatives();
    assertEquals(-0.49999999999999994d, derivatives.min());
    assertEquals(1.7763568394002505E-15d, first.getValue());
    assertEquals(12.615662610100802d, derivatives.max());
    assertEquals(12.615662610100802d, derivatives.sum());
    double[][] second = actualPriceAdjoint2Result.getSecond();
    assertEquals(3, second.length);
    assertArrayEquals(
        new double[] {-1.2615662610100802E14d, 1.2615662610100802E14d, 0.0d}, second[1], 0.0);
    assertArrayEquals(
        new double[] {0.6307831305050401d, 0.0d, -3.1539156525252003E-15d}, second[2], 0.0);
    assertArrayEquals(
        new double[] {1.2615662610100802E14d, -1.2615662610100802E14d, 0.6307831305050401d},
        second[0],
        0.0);
    assertArrayEquals(
        new double[] {
          0.5000000000000001d, -0.49999999999999994d, 6.307831305050401E-17d, 12.615662610100802d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint2(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return First Derivatives min is minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint2(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint2(double, double, double, double, boolean); when '-6.0136873569177505'; then return First Derivatives min is minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair BlackFormulaRepository.priceAdjoint2(double, double, double, double, boolean)"
  })
  void testPriceAdjoint2_when60136873569177505_thenReturnFirstDerivativesMinIsMinusOne() {
    // Arrange and Act
    Pair<ValueDerivatives, double[][]> actualPriceAdjoint2Result =
        BlackFormulaRepository.priceAdjoint2(10.0d, -6.0136873569177505d, 10.0d, 10.0d, true);

    // Assert
    ValueDerivatives first = actualPriceAdjoint2Result.getFirst();
    DoubleArray derivatives = first.getDerivatives();
    assertEquals(-1.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-1.0d, toListResult.get(1).doubleValue());
    assertEquals(16.01368735691775d, first.getValue());
    double[][] second = actualPriceAdjoint2Result.getSecond();
    assertEquals(3, second.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, second[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, second[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, second[2], 0.0);
    assertArrayEquals(new double[] {1.0d, -1.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint2(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return First Value is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint2(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint2(double, double, double, double, boolean); when '-6.0136873569177505'; then return First Value is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair BlackFormulaRepository.priceAdjoint2(double, double, double, double, boolean)"
  })
  void testPriceAdjoint2_when60136873569177505_thenReturnFirstValueIs00() {
    // Arrange and Act
    Pair<ValueDerivatives, double[][]> actualPriceAdjoint2Result =
        BlackFormulaRepository.priceAdjoint2(-6.0136873569177505d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    ValueDerivatives first = actualPriceAdjoint2Result.getFirst();
    assertEquals(-0.0d, first.getValue());
    DoubleArray derivatives = first.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.0d, toListResult.get(1).doubleValue());
    double[][] second = actualPriceAdjoint2Result.getSecond();
    assertEquals(3, second.length);
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(2).doubleValue());
    assertEquals(Double.NaN, toListResult.get(3).doubleValue());
    assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, second[0], 0.0);
    assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, second[1], 0.0);
    assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, second[2], 0.0);
    assertArrayEquals(
        new double[] {0.0d, -0.0d, Double.NaN, Double.NaN}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint2(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return First Derivatives min is {@code -2.866515718791944E-7}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint2(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint2(double, double, double, double, boolean); when one; then return First Derivatives min is '-2.866515718791944E-7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair BlackFormulaRepository.priceAdjoint2(double, double, double, double, boolean)"
  })
  void testPriceAdjoint2_whenOne_thenReturnFirstDerivativesMinIs2866515718791944e7() {
    // Arrange and Act
    Pair<ValueDerivatives, double[][]> actualPriceAdjoint2Result =
        BlackFormulaRepository.priceAdjoint2(10.0d, 10.0d, 1.0d, 10.0d, true);

    // Assert
    ValueDerivatives first = actualPriceAdjoint2Result.getFirst();
    DoubleArray derivatives = first.getDerivatives();
    assertEquals(-2.866515718791944E-7d, derivatives.min());
    assertEquals(0.9999997133484281d, derivatives.max());
    assertEquals(1.0000886298677403d, derivatives.sum());
    double[][] second = actualPriceAdjoint2Result.getSecond();
    assertEquals(3, second.length);
    assertEquals(9.999994266968562d, first.getValue());
    assertArrayEquals(
        new double[] {-1.4867195147342977E-8d, 1.4867195147342977E-8d, 7.433597573671488E-7d},
        second[1],
        0.0);
    assertArrayEquals(
        new double[] {1.4867195147342977E-8d, -1.4867195147342977E-8d, 7.433597573671488E-7d},
        second[0],
        0.0);
    assertArrayEquals(
        new double[] {7.433597573671488E-7d, 7.433597573671488E-7d, -3.716798786835744E-5d},
        second[2],
        0.0);
    assertArrayEquals(
        new double[] {
          0.9999997133484281d, -2.866515718791944E-7d, 7.433597573671488E-5d, 1.4867195147342977E-5d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint2(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return First Derivatives min is {@code -0.05692314900332902}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint2(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint2(double, double, double, double, boolean); when one; then return First Derivatives min is '-0.05692314900332902'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair BlackFormulaRepository.priceAdjoint2(double, double, double, double, boolean)"
  })
  void testPriceAdjoint2_whenOne_thenReturnFirstDerivativesMinIs005692314900332902() {
    // Arrange and Act
    Pair<ValueDerivatives, double[][]> actualPriceAdjoint2Result =
        BlackFormulaRepository.priceAdjoint2(10.0d, 10.0d, 10.0d, 1.0d, true);

    // Assert
    ValueDerivatives first = actualPriceAdjoint2Result.getFirst();
    DoubleArray derivatives = first.getDerivatives();
    assertEquals(-0.05692314900332902d, derivatives.min());
    double[][] second = actualPriceAdjoint2Result.getSecond();
    assertEquals(3, second.length);
    assertEquals(3.614447853363625d, derivatives.max());
    assertEquals(4.681323948025148d, derivatives.sum());
    assertEquals(8.861537019933419d, first.getValue());
    assertArrayEquals(
        new double[] {-0.0036144478533636244d, 0.0036144478533636244d, 0.18072239266818121d},
        second[1],
        0.0);
    assertArrayEquals(
        new double[] {0.0036144478533636244d, -0.0036144478533636244d, 0.18072239266818124d},
        second[0],
        0.0);
    assertArrayEquals(
        new double[] {0.18072239266818124d, 0.18072239266818121d, -9.036119633409061d},
        second[2],
        0.0);
    assertArrayEquals(
        new double[] {
          0.9430768509966709d, -0.05692314900332902d, 0.18072239266818124d, 3.614447853363625d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint2(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return First Value is zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint2(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint2(double, double, double, double, boolean); when zero; then return First Value is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair BlackFormulaRepository.priceAdjoint2(double, double, double, double, boolean)"
  })
  void testPriceAdjoint2_whenZero_thenReturnFirstValueIsZero() {
    // Arrange and Act
    Pair<ValueDerivatives, double[][]> actualPriceAdjoint2Result =
        BlackFormulaRepository.priceAdjoint2(10.0d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    ValueDerivatives first = actualPriceAdjoint2Result.getFirst();
    assertEquals(0.0d, first.getValue());
    DoubleArray derivatives = first.getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    double[][] second = actualPriceAdjoint2Result.getSecond();
    assertEquals(3, second.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, second[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, second[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, second[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#priceAdjoint2(double, double, double, double, boolean)}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#priceAdjoint2(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName("Test priceAdjoint2(double, double, double, double, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair BlackFormulaRepository.priceAdjoint2(double, double, double, double, boolean)"
  })
  void testPriceAdjoint22() {
    // Arrange and Act
    Pair<ValueDerivatives, double[][]> actualPriceAdjoint2Result =
        BlackFormulaRepository.priceAdjoint2(10.0d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    DoubleArray derivatives = actualPriceAdjoint2Result.getFirst().getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-1.2984035196700745E-56d, toListResult.get(0).doubleValue());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    double[][] second = actualPriceAdjoint2Result.getSecond();
    assertEquals(3, second.length);
    assertArrayEquals(
        new double[] {-6.517781960574406E-58d, 6.517781960574406E-58d, 3.2588909802872034E-55d},
        second[1],
        0.0);
    assertArrayEquals(
        new double[] {3.2588909802872034E-55d, 3.2588909802872034E-55d, -1.6294454901436019E-52d},
        second[2],
        0.0);
    assertArrayEquals(
        new double[] {6.517781960574406E-58d, -6.517781960574406E-58d, 3.2588909802872034E-55d},
        second[0],
        0.0);
    assertArrayEquals(
        new double[] {
          -1.2984035196700745E-56d, 1.0d, 3.258890980287203E-54d, 6.517781960574406E-54d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 0.9997965239912775}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '0.5'; then return '0.9997965239912775'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when05_thenReturn09997965239912775() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(10.0d, 10.0d, 0.5d, 10.0d, true);

    // Assert
    assertEquals(0.9997965239912775d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 0.5000000000000631}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '1.0E-13'; then return '0.5000000000000631'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturn05000000000000631() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(10.0d, 10.0d, 10.0d, 1.0E-13d, true);

    // Assert
    assertEquals(0.5000000000000631d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 0.5000006307831305}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '1.0E-13'; then return '0.5000006307831305'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturn05000006307831305() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(10.0d, 10.0d, 1.0E-13d, 10.0d, true);

    // Assert
    assertEquals(0.5000006307831305d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '1.0E13'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnMinusOne() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(0.0d, 1.0E13d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(-1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '1.0E13'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnOne() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(1.0E13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '1.0E13'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnOne2() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(10.0d, 10.0d, 10.0d, 1.0E13d, true);

    // Assert
    assertEquals(1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '1.0E13'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnOne3() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(1.0E13d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(1.0E13d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(10.0d, 10.0d, 10.0d, 1.0E13d, false);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '1.0000000000000002E13'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when10000000000000002e13_thenReturnMinusOne() {
    // Arrange and Act
    double actualDeltaResult =
        BlackFormulaRepository.delta(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(-1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualDeltaResult =
        BlackFormulaRepository.delta(1.0000000000000002E13d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 7.0710678118654755}.
   *   <li>Then return {@code 0.9937903346742238}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when '7.0710678118654755'; then return '0.9937903346742238'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_when70710678118654755_thenReturn09937903346742238() {
    // Arrange and Act
    double actualDeltaResult =
        BlackFormulaRepository.delta(10.0d, 10.0d, 0.5d, 7.0710678118654755d, true);

    // Assert
    assertEquals(0.9937903346742238d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when 'false'; then return '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_whenFalse_thenReturn05() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(0.0d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(-0.5d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, boolean); when 'true'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_whenTrue_thenReturn05() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(10.0d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(0.5d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName("Test delta(double, double, double, double, boolean); when 'true'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_whenTrue_thenReturnOne() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName("Test delta(double, double, double, double, boolean); when 'true'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_whenTrue_thenReturnZero() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(0.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#delta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#delta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName("Test delta(double, double, double, double, boolean); when 'true'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.delta(double, double, double, double, boolean)"
  })
  void testDelta_whenTrue_thenReturnZero2() {
    // Arrange and Act
    double actualDeltaResult = BlackFormulaRepository.delta(0.0d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#strikeForDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 1.4035922178528373E218}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#strikeForDelta(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test strikeForDelta(double, double, double, double, boolean); when '0.5'; then return '1.4035922178528373E218'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.strikeForDelta(double, double, double, double, boolean)"
  })
  void testStrikeForDelta_when05_thenReturn14035922178528373e218() {
    // Arrange and Act
    double actualStrikeForDeltaResult =
        BlackFormulaRepository.strikeForDelta(10.0d, 0.5d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.4035922178528373E218d, actualStrikeForDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#strikeForDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#strikeForDelta(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test strikeForDelta(double, double, double, double, boolean); when '-1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.strikeForDelta(double, double, double, double, boolean)"
  })
  void testStrikeForDelta_when10e10_thenReturnZero() {
    // Arrange and Act
    double actualStrikeForDeltaResult =
        BlackFormulaRepository.strikeForDelta(0.0d, -1.0E-10d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualStrikeForDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#strikeForDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code -0.9999999999999999}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#strikeForDelta(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test strikeForDelta(double, double, double, double, boolean); when '-0.9999999999999999'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.strikeForDelta(double, double, double, double, boolean)"
  })
  void testStrikeForDelta_when09999999999999999_thenReturnZero() {
    // Arrange and Act
    double actualStrikeForDeltaResult =
        BlackFormulaRepository.strikeForDelta(0.0d, -0.9999999999999999d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualStrikeForDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.4999993692168695}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when '1.0E-13'; then return '-0.4999993692168695'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturn04999993692168695() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(10.0d, 10.0d, 1.0E-13d, 10.0d, true);

    // Assert
    assertEquals(-0.4999993692168695d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code -9.377937177057185E-51}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when '1.0E13'; then return '-9.377937177057185E-51'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturn9377937177057185e51() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(1.0E13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-9.377937177057185E-51d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.49999999999993694}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when '1.0E-13'; then return '-0.49999999999993694'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturn049999999999993694() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(10.0d, 10.0d, 10.0d, 1.0E-13d, true);

    // Assert
    assertEquals(-0.49999999999993694d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when '1.0E13'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnMinusOne() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(1.0E13d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(-1.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when '1.0E13'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnOne() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(0.0d, 1.0E13d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(1.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when '1.0E13'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnOne2() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(10.0d, 10.0d, 10.0d, 1.0E13d, false);

    // Assert
    assertEquals(1.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(1.0E13d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(10.0d, 10.0d, 10.0d, 1.0E13d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_when10e13_thenReturnZero3() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(1.0E-13d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when '1.0000000000000002E13'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_when10000000000000002e13_thenReturnOne() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(1.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(1.0000000000000002E13d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when 'false'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_whenFalse_thenReturn05() {
    // Arrange and Act
    double actualDualDeltaResult = BlackFormulaRepository.dualDelta(0.0d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.5d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code -0.05692314900332902}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when one; then return '-0.05692314900332902'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_whenOne_thenReturn005692314900332902() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(10.0d, 10.0d, 10.0d, 1.0d, true);

    // Assert
    assertEquals(-0.05692314900332902d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code -0.9999999999995863}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when one; then return '-0.9999999999995863'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_whenOne_thenReturn09999999999995863() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(1.0E13d, 10.0d, 10.0d, 1.0d, true);

    // Assert
    assertEquals(-0.9999999999995863d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when 'true'; then return '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_whenTrue_thenReturn05() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(10.0d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(-0.5d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code -1.2984035196700745E-56}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when 'true'; then return '-1.2984035196700745E-56'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_whenTrue_thenReturn12984035196700745e56() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-1.2984035196700745E-56d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test dualDelta(double, double, double, double, boolean); when 'true'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.dualDelta(double, double, double, double, boolean)"
  })
  void testDualDelta_whenTrue_thenReturnMinusOne() {
    // Arrange and Act
    double actualDualDeltaResult =
        BlackFormulaRepository.dualDelta(10.0d, 0.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-1.0d, actualDualDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when '1.0E13'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_when10e13_thenReturn05() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(10.0d, 10.0d, 10.0d, 1.0E13d, true);

    // Assert
    assertEquals(0.5d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when '1.0E13'; then return '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_when10e13_thenReturn052() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(10.0d, 10.0d, 10.0d, 1.0E13d, false);

    // Assert
    assertEquals(-0.5d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 0.8088781326943932}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when '1.0E13'; then return '0.8088781326943932'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_when10e13_thenReturn08088781326943932() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(1.0E13d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.8088781326943932d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 0.9708321999692783}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when '1.0E-13'; then return '0.9708321999692783'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_when10e13_thenReturn09708321999692783() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(1.0E13d, 1.0E-13d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.9708321999692783d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when '1.0E13'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_when10e13_thenReturnMinusOne() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(0.0d, 1.0E13d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(-1.0d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when '1.0E13'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_when10e13_thenReturnOne() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(1.0E13d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(1.0E13d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when '1.0000000000000002E13'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_when10000000000000002e13_thenReturnMinusOne() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(-1.0d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(1.0000000000000002E13d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(0.0d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when 'false'; then return '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_whenFalse_thenReturn05() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(0.0d, 0.0d, 0.0d, 0.0d, false);

    // Assert
    assertEquals(-0.5d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when 'true'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_whenTrue_thenReturn05() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(10.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.5d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when 'true'; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_whenTrue_thenReturn052() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(10.0d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(0.5d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when 'true'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_whenTrue_thenReturnOne() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(10.0d, 0.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(1.0d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when 'true'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_whenTrue_thenReturnZero() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(0.0d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#simpleDelta(double, double, double, double, boolean)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#simpleDelta(double, double, double, double,
   * boolean)}
   */
  @Test
  @DisplayName(
      "Test simpleDelta(double, double, double, double, boolean); when 'true'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.simpleDelta(double, double, double, double, boolean)"
  })
  void testSimpleDelta_whenTrue_thenReturnZero2() {
    // Arrange and Act
    double actualSimpleDeltaResult =
        BlackFormulaRepository.simpleDelta(0.0d, 10.0d, 0.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualSimpleDeltaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#gamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 4.449525512151833E-76}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#gamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double); when '1.0E13'; then return '4.449525512151833E-76'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.gamma(double, double, double, double)"})
  void testGamma_when10e13_thenReturn4449525512151833e76() {
    // Arrange and Act
    double actualGammaResult = BlackFormulaRepository.gamma(1.0E13d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(4.449525512151833E-76d, actualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#gamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#gamma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test gamma(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.gamma(double, double, double, double)"})
  void testGamma_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualGammaResult = BlackFormulaRepository.gamma(0.0d, 1.0E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#gamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#gamma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test gamma(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.gamma(double, double, double, double)"})
  void testGamma_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualGammaResult = BlackFormulaRepository.gamma(10.0d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#gamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 0.3989422804014327}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#gamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double); when '1.0000000000000002E13'; then return '0.3989422804014327'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.gamma(double, double, double, double)"})
  void testGamma_when10000000000000002e13_thenReturn03989422804014327() {
    // Arrange and Act
    double actualGammaResult =
        BlackFormulaRepository.gamma(1.0000000000000002E13d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.3989422804014327d, actualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#gamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#gamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.gamma(double, double, double, double)"})
  void testGamma_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualGammaResult =
        BlackFormulaRepository.gamma(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#gamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#gamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.gamma(double, double, double, double)"})
  void testGamma_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualGammaResult =
        BlackFormulaRepository.gamma(1.0000000000000002E13d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#gamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 6.517781960574406E-58}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#gamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double); when ten; then return '6.517781960574406E-58'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.gamma(double, double, double, double)"})
  void testGamma_whenTen_thenReturn6517781960574406e58() {
    // Arrange and Act
    double actualGammaResult = BlackFormulaRepository.gamma(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(6.517781960574406E-58d, actualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#gamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#gamma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test gamma(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.gamma(double, double, double, double)"})
  void testGamma_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualGammaResult = BlackFormulaRepository.gamma(0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#gamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#gamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double); when zero; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.gamma(double, double, double, double)"})
  void testGamma_whenZero_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualGammaResult = BlackFormulaRepository.gamma(0.0d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 4.449525512151766E-52}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double); when '1.0E13'; then return '4.449525512151766E-52'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualGamma(double, double, double, double)"})
  void testDualGamma_when10e13_thenReturn4449525512151766e52() {
    // Arrange and Act
    double actualDualGammaResult = BlackFormulaRepository.dualGamma(1.0E13d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(4.449525512151766E-52d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualGamma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test dualGamma(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualGamma(double, double, double, double)"})
  void testDualGamma_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualDualGammaResult = BlackFormulaRepository.dualGamma(0.0d, 1.0E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualGamma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test dualGamma(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualGamma(double, double, double, double)"})
  void testDualGamma_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualDualGammaResult = BlackFormulaRepository.dualGamma(10.0d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 0.3989422804014327}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double); when '1.0000000000000002E13'; then return '0.3989422804014327'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualGamma(double, double, double, double)"})
  void testDualGamma_when10000000000000002e13_thenReturn03989422804014327() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackFormulaRepository.dualGamma(
            1.0000000000000002E13d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.3989422804014327d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualGamma(double, double, double, double)"})
  void testDualGamma_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackFormulaRepository.dualGamma(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualGamma(double, double, double, double)"})
  void testDualGamma_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualDualGammaResult =
        BlackFormulaRepository.dualGamma(1.0000000000000002E13d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 6.517781960574406E-58}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double); when ten; then return '6.517781960574406E-58'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualGamma(double, double, double, double)"})
  void testDualGamma_whenTen_thenReturn6517781960574406e58() {
    // Arrange and Act
    double actualDualGammaResult = BlackFormulaRepository.dualGamma(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(6.517781960574406E-58d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualGamma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test dualGamma(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualGamma(double, double, double, double)"})
  void testDualGamma_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualDualGammaResult = BlackFormulaRepository.dualGamma(0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualGamma(double, double, double, double); when zero; then return POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualGamma(double, double, double, double)"})
  void testDualGamma_whenZero_thenReturnPositive_infinity() {
    // Arrange and Act
    double actualDualGammaResult = BlackFormulaRepository.dualGamma(0.0d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualDualGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#crossGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code -4.4495255121517654E-64}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#crossGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double); when '1.0E13'; then return '-4.4495255121517654E-64'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.crossGamma(double, double, double, double)"})
  void testCrossGamma_when10e13_thenReturn44495255121517654e64() {
    // Arrange and Act
    double actualCrossGammaResult = BlackFormulaRepository.crossGamma(1.0E13d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-4.4495255121517654E-64d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#crossGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#crossGamma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test crossGamma(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.crossGamma(double, double, double, double)"})
  void testCrossGamma_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualCrossGammaResult = BlackFormulaRepository.crossGamma(0.0d, 1.0E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#crossGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#crossGamma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test crossGamma(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.crossGamma(double, double, double, double)"})
  void testCrossGamma_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualCrossGammaResult = BlackFormulaRepository.crossGamma(10.0d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#crossGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code -0.3989422804014327}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#crossGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double); when '1.0000000000000002E13'; then return '-0.3989422804014327'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.crossGamma(double, double, double, double)"})
  void testCrossGamma_when10000000000000002e13_thenReturn03989422804014327() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackFormulaRepository.crossGamma(
            1.0000000000000002E13d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(-0.3989422804014327d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#crossGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#crossGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.crossGamma(double, double, double, double)"})
  void testCrossGamma_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackFormulaRepository.crossGamma(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#crossGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#crossGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.crossGamma(double, double, double, double)"})
  void testCrossGamma_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualCrossGammaResult =
        BlackFormulaRepository.crossGamma(1.0000000000000002E13d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#crossGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code -6.517781960574406E-58}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#crossGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double); when ten; then return '-6.517781960574406E-58'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.crossGamma(double, double, double, double)"})
  void testCrossGamma_whenTen_thenReturn6517781960574406e58() {
    // Arrange and Act
    double actualCrossGammaResult = BlackFormulaRepository.crossGamma(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-6.517781960574406E-58d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#crossGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#crossGamma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test crossGamma(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.crossGamma(double, double, double, double)"})
  void testCrossGamma_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualCrossGammaResult = BlackFormulaRepository.crossGamma(0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#crossGamma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#crossGamma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test crossGamma(double, double, double, double); when zero; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.crossGamma(double, double, double, double)"})
  void testCrossGamma_whenZero_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualCrossGammaResult = BlackFormulaRepository.crossGamma(0.0d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualCrossGammaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 99.9250581923127}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '0.5'; then return '99.9250581923127'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when05_thenReturn999250581923127() {
    // Arrange and Act
    double actualThetaResult = BlackFormulaRepository.theta(10.0d, 10.0d, 0.5d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(99.9250581923127d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e10_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(0.0d, 0.0d, 0.0d, 0.0d, false, 1.0E-10d);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E-13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturn00() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(0.0d, 0.0d, 1.0E-13d, 0.0d, false, 0.0d);

    // Assert
    assertEquals(-0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E-13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturn002() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(0.0d, 0.0d, 1.0E-13d, 1.0E-13d, false, 0.0d);

    // Assert
    assertEquals(-0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 1.0E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E13'; then return '1.0E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturn10e14() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(1.0E13d, 10.0d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(1.0E14d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 1.0E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E13'; then return '1.0E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturn10e142() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(1.0E13d, 10.0d, 1.0E13d, 0.0d, true, 10.0d);

    // Assert
    assertEquals(1.0E14d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 9.99999999999E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E13'; then return '9.99999999999E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturn999999999999e13() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(1.0E13d, 10.0d, 0.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(9.99999999999E13d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -6.3078313050299E7}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E-13'; then return '-6.3078313050299E7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturn63078313050299e7() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(10.0d, 10.0d, 1.0E-13d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(-6.3078313050299E7d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 50.000000000006246}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E-13'; then return '50.000000000006246'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturn50000000000006246() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(10.0d, 10.0d, 10.0d, 1.0E-13d, true, 10.0d);

    // Assert
    assertEquals(50.000000000006246d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return minus one hundred.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E13'; then return minus one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturnMinusOneHundred() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(10.0d, 10.0d, 1.0E13d, 0.0d, false, 10.0d);

    // Assert
    assertEquals(-100.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return one hundred.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E13'; then return one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturnOneHundred() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(10.0d, 10.0d, 1.0E13d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(100.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return one hundred.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E13'; then return one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturnOneHundred2() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(10.0d, 10.0d, 10.0d, 1.0E13d, true, 10.0d);

    // Assert
    assertEquals(100.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(10.0d, 10.0d, 1.0E13d, 0.0d, true, 10.0d);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(1.0E13d, 10.0d, 0.0d, 10.0d, false, 10.0d);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 9.999999999990002E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '9.999999999990002E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10000000000000002e13_thenReturn9999999999990002e13() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(1.0000000000000002E13d, 10.0d, 0.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(9.999999999990002E13d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 1.0000000000000002E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '1.0000000000000002E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10000000000000002e13_thenReturn10000000000000002e14() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(1.0000000000000002E13d, 10.0d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(1.0000000000000002E14d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 1.0000000000000002E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '1.0000000000000002E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10000000000000002e13_thenReturn10000000000000002e142() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(10.0d, 10.0d, 10.0d, 10.0d, true, 1.0000000000000002E13d);

    // Assert
    assertEquals(1.0000000000000002E14d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 1.0000000000000002E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '1.0000000000000002E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10000000000000002e13_thenReturn10000000000000002e143() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(
            1.0000000000000002E13d, 1.0000000000000002E13d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(1.0000000000000002E14d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 1.0000000000000002E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '1.0000000000000002E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10000000000000002e13_thenReturn10000000000000002e144() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(
            1.0000000000000002E13d, 1.0000000000000002E13d, 10.0d, 0.0d, true, 10.0d);

    // Assert
    assertEquals(1.0000000000000002E14d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 1.0000000000000002E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '1.0000000000000002E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10000000000000002e13_thenReturn10000000000000002e145() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(
            1.0000000000000002E13d, 1.0000000000000002E13d, 10.0d, 10.0d, false, 10.0d);

    // Assert
    assertEquals(1.0000000000000002E14d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return one hundred.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10000000000000002e13_thenReturnOneHundred() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(10.0d, 1.0000000000000002E13d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(100.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(0.0d, 0.0d, 0.0d, 0.0d, false, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 7.0710678118654755}.
   *   <li>Then return {@code 98.49843440315925}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when '7.0710678118654755'; then return '98.49843440315925'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_when70710678118654755_thenReturn9849843440315925() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(10.0d, 10.0d, 0.5d, 7.0710678118654755d, true, 10.0d);

    // Assert
    assertEquals(98.49843440315925d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when 'false'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_whenFalse_thenReturn00() {
    // Arrange and Act
    double actualThetaResult = BlackFormulaRepository.theta(0.0d, 0.0d, 0.0d, 0.0d, false, 0.0d);

    // Assert
    assertEquals(-0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return one hundred.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when 'true'; then return one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_whenTrue_thenReturnOneHundred() {
    // Arrange and Act
    double actualThetaResult =
        BlackFormulaRepository.theta(10.0d, 10.0d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(100.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code -1.9947114020071635}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when zero; then return '-1.9947114020071635'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_whenZero_thenReturn19947114020071635() {
    // Arrange and Act
    double actualThetaResult = BlackFormulaRepository.theta(10.0d, 10.0d, 0.0d, 0.0d, true, 10.0d);

    // Assert
    assertEquals(-1.9947114020071635d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when zero; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_whenZero_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualThetaResult = BlackFormulaRepository.theta(10.0d, 10.0d, 0.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#theta(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#theta(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, boolean, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.theta(double, double, double, double, boolean, double)"
  })
  void testTheta_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult = BlackFormulaRepository.theta(0.0d, 10.0d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 9.99999999999951E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '0.5'; then return '9.99999999999951E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when05_thenReturn999999999999951e13() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(10.0d, 1.0000000000000002E13d, 0.5d, 10.0d, false, 10.0d);

    // Assert
    assertEquals(9.99999999999951E13d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0E-10'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10e10_thenReturnZero() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(0.0d, 0.0d, 0.0d, 0.0d, false, 1.0E-10d);

    // Assert
    assertEquals(0.0d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0E-13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10e13_thenReturn00() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(0.0d, 0.0d, 1.0E-13d, 0.0d, false, 0.0d);

    // Assert
    assertEquals(-0.0d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0E-13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10e13_thenReturn002() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(0.0d, 0.0d, 1.0E-13d, 1.0E-13d, false, 0.0d);

    // Assert
    assertEquals(-0.0d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code -3.162556473781635E-48}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0E13'; then return '-3.162556473781635E-48'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10e13_thenReturn3162556473781635e48() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(1.0E13d, 10.0d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(-3.162556473781635E-48d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -4.999993692168695E13}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0E-13'; then return '-4.999993692168695E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10e13_thenReturn4999993692168695e13() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(
            10.0d, 10.0d, 1.0E-13d, 10.0d, true, 1.0000000000000002E13d);

    // Assert
    assertEquals(-4.999993692168695E13d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -6.307836305036208E7}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0E-13'; then return '-6.307836305036208E7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10e13_thenReturn6307836305036208e7() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(10.0d, 10.0d, 1.0E-13d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(-6.307836305036208E7d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -49.999999999993754}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0E-13'; then return '-49.999999999993754'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10e13_thenReturn49999999999993754() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(10.0d, 10.0d, 10.0d, 1.0E-13d, true, 10.0d);

    // Assert
    assertEquals(-49.999999999993754d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return minus one hundred.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0E13'; then return minus one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10e13_thenReturnMinusOneHundred() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(1.0E13d, 10.0d, 0.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(-100.0d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(10.0d, 10.0d, 10.0d, 1.0E13d, true, 10.0d);

    // Assert
    assertEquals(0.0d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(1.0E13d, 10.0d, 0.0d, 10.0d, false, 10.0d);

    // Assert
    assertEquals(0.0d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code -0.063078313050504}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '-0.063078313050504'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10000000000000002e13_thenReturn0063078313050504() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(
            1.0000000000000002E13d, 1.0000000000000002E13d, 10.0d, 0.0d, true, 10.0d);

    // Assert
    assertEquals(-0.063078313050504d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code -3.065068147829168E-48}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '-3.065068147829168E-48'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10000000000000002e13_thenReturn3065068147829168e48() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(10.0d, 1.0000000000000002E13d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(-3.065068147829168E-48d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code -3.162556473781636E-48}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '-3.162556473781636E-48'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10000000000000002e13_thenReturn3162556473781636e48() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(1.0000000000000002E13d, 10.0d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(-3.162556473781636E-48d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code -3.258890980287204E-42}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '-3.258890980287204E-42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10000000000000002e13_thenReturn3258890980287204e42() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(
            1.0000000000000002E13d, 1.0000000000000002E13d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(-3.258890980287204E-42d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 1.0000000000000002E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '1.0000000000000002E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10000000000000002e13_thenReturn10000000000000002e14() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(10.0d, 1.0000000000000002E13d, 10.0d, 10.0d, false, 10.0d);

    // Assert
    assertEquals(1.0000000000000002E14d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 1.0000000000000002E14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return '1.0000000000000002E14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10000000000000002e13_thenReturn10000000000000002e142() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(
            1.0000000000000002E13d, 1.0000000000000002E13d, 10.0d, 10.0d, false, 10.0d);

    // Assert
    assertEquals(1.0000000000000002E14d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return minus one hundred.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return minus one hundred")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10000000000000002e13_thenReturnMinusOneHundred() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(1.0000000000000002E13d, 10.0d, 0.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(-100.0d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(0.0d, 0.0d, 0.0d, 0.0d, false, 1.0000000000000002E13d);

    // Assert
    assertEquals(0.0d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when 'false'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_whenFalse_thenReturn00() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(0.0d, 0.0d, 0.0d, 0.0d, false, 0.0d);

    // Assert
    assertEquals(-0.0d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When {@code true}.
   *   <li>Then return {@code -4.557294499957278E-54}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when 'true'; then return '-4.557294499957278E-54'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_whenTrue_thenReturn4557294499957278e54() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(10.0d, 10.0d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(-4.557294499957278E-54d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code -1.9947114020071635}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when zero; then return '-1.9947114020071635'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_whenZero_thenReturn19947114020071635() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(10.0d, 10.0d, 0.0d, 0.0d, true, 10.0d);

    // Assert
    assertEquals(-1.9947114020071635d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when zero; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_whenZero_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(10.0d, 10.0d, 0.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(0.0d, 10.0d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(0.0d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#thetaMod(double, double, double, double, boolean, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#thetaMod(double, double, double, double,
   * boolean, double)}
   */
  @Test
  @DisplayName(
      "Test thetaMod(double, double, double, double, boolean, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.thetaMod(double, double, double, double, boolean, double)"
  })
  void testThetaMod_whenZero_thenReturnZero2() {
    // Arrange and Act
    double actualThetaModResult =
        BlackFormulaRepository.thetaMod(10.0d, 0.0d, 10.0d, 10.0d, true, 10.0d);

    // Assert
    assertEquals(0.0d, actualThetaModResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code -0.28209479177387814}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when '0.5'; then return '-0.28209479177387814'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when05_thenReturn028209479177387814() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(
            3.1622776601683797E13d, 3.1622776601683797E13d, 0.5d, 0.0d);

    // Assert
    assertEquals(-0.28209479177387814d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName("Test driftlessTheta(double, double, double, double); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when05_thenReturnZero() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(3.1622776601683797E13d, 10.0d, 0.5d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName("Test driftlessTheta(double, double, double, double); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when05_thenReturnZero2() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(
            3.1622776601683797E13d, 3.1622776601683797E13d, 0.5d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.8920620580763857}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when '1.0E-13'; then return '-0.8920620580763857'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when10e13_thenReturn08920620580763857() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(
            3.1622776601683797E13d, 3.1622776601683797E13d, 0.5d, 1.0E-13d);

    // Assert
    assertEquals(-0.8920620580763857d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -1.9947114020071637E-14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when '1.0E-13'; then return '-1.9947114020071637E-14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when10e13_thenReturn19947114020071637e14() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(0.0d, 0.0d, 0.0d, 1.0E-13d);

    // Assert
    assertEquals(-1.9947114020071637E-14d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code -2.2247627560759166E-48}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when '1.0E13'; then return '-2.2247627560759166E-48'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when10e13_thenReturn22247627560759166e48() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(1.0E13d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-2.2247627560759166E-48d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(0.0d, 1.0E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(10.0d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 9.999999999999999E-14}.
   *   <li>Then return {@code -1.9947114020071633E-14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when '9.999999999999999E-14'; then return '-1.9947114020071633E-14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when9999999999999999e14_thenReturn19947114020071633e14() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(0.0d, 0.0d, 0.0d, 9.999999999999999E-14d);

    // Assert
    assertEquals(-1.9947114020071633E-14d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601673797E13}.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when '3.1622776601673797E13'; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when31622776601673797e13_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(
            3.1622776601683797E13d, 3.1622776601673797E13d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when '3.1622776601683797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when31622776601683797e13_thenReturnZero() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(3.1622776601683797E13d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when '3.1622776601683797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_when31622776601683797e13_thenReturnZero2() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(3.1622776601683797E13d, 10.0d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName("Test driftlessTheta(double, double, double, double); when ten; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_whenTen_thenReturn00() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(10.0d, 10.0d, 10.0d, 0.0d);

    // Assert
    assertEquals(-0.0d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code -3.258890980287203E-54}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when ten; then return '-3.258890980287203E-54'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_whenTen_thenReturn3258890980287203e54() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-3.258890980287203E-54d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code -1.9947114020071635}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when ten; then return '-1.9947114020071635'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_whenTen_thenReturn19947114020071635() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(10.0d, 10.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(-1.9947114020071635d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test driftlessTheta(double, double, double, double); when ten; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_whenTen_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(10.0d, 10.0d, 0.0d, 10.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName("Test driftlessTheta(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#driftlessTheta(double, double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#driftlessTheta(double, double, double,
   * double)}
   */
  @Test
  @DisplayName("Test driftlessTheta(double, double, double, double); when zero; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.driftlessTheta(double, double, double, double)"
  })
  void testDriftlessTheta_whenZero_thenReturn00() {
    // Arrange and Act
    double actualDriftlessThetaResult =
        BlackFormulaRepository.driftlessTheta(0.0d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(-0.0d, actualDriftlessThetaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vega(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return {@code 4.4495255121518345E-48}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vega(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double); when '1.0E13'; then return '4.4495255121518345E-48'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vega(double, double, double, double)"})
  void testVega_when10e13_thenReturn44495255121518345e48() {
    // Arrange and Act
    double actualVegaResult = BlackFormulaRepository.vega(1.0E13d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(4.4495255121518345E-48d, actualVegaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vega(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vega(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vega(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vega(double, double, double, double)"})
  void testVega_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult = BlackFormulaRepository.vega(0.0d, 1.0E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vega(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vega(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vega(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vega(double, double, double, double)"})
  void testVega_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualVegaResult = BlackFormulaRepository.vega(10.0d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vega(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return {@code 0.3989422804014327}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vega(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double); when '1.0000000000000002E13'; then return '0.3989422804014327'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vega(double, double, double, double)"})
  void testVega_when10000000000000002e13_thenReturn03989422804014327() {
    // Arrange and Act
    double actualVegaResult =
        BlackFormulaRepository.vega(1.0000000000000002E13d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.3989422804014327d, actualVegaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vega(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vega(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vega(double, double, double, double)"})
  void testVega_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult = BlackFormulaRepository.vega(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vega(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vega(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vega(double, double, double, double)"})
  void testVega_when10000000000000002e13_thenReturnZero2() {
    // Arrange and Act
    double actualVegaResult = BlackFormulaRepository.vega(1.0000000000000002E13d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vega(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 6.517781960574408E-54}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vega(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double); when ten; then return '6.517781960574408E-54'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vega(double, double, double, double)"})
  void testVega_whenTen_thenReturn6517781960574408e54() {
    // Arrange and Act
    double actualVegaResult = BlackFormulaRepository.vega(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(6.517781960574408E-54d, actualVegaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vega(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 12.615662610100802}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vega(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double); when ten; then return '12.615662610100802'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vega(double, double, double, double)"})
  void testVega_whenTen_thenReturn12615662610100802() {
    // Arrange and Act
    double actualVegaResult = BlackFormulaRepository.vega(10.0d, 10.0d, 10.0d, 0.0d);

    // Assert
    assertEquals(12.615662610100802d, actualVegaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vega(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vega(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vega(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vega(double, double, double, double)"})
  void testVega_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult = BlackFormulaRepository.vega(0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vega(double, double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vega(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vega(double, double, double, double); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vega(double, double, double, double)"})
  void testVega_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult = BlackFormulaRepository.vega(0.0d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vanna(double, double, double, double); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_when05_thenReturnZero() {
    // Arrange and Act
    double actualVannaResult =
        BlackFormulaRepository.vanna(3.1622776601683797E13d, 10.0d, 0.5d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vanna(double, double, double, double); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_when05_thenReturnZero2() {
    // Arrange and Act
    double actualVannaResult =
        BlackFormulaRepository.vanna(3.1622776601683797E13d, 3.1622776601683797E13d, 0.5d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vanna(double, double, double, double); when '1.0E-13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualVannaResult = BlackFormulaRepository.vanna(0.0d, 0.0d, 0.0d, 1.0E-13d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vanna(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_when10e13_thenReturnZero2() {
    // Arrange and Act
    double actualVannaResult = BlackFormulaRepository.vanna(0.0d, 1.0E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 9.999999999999999E-14}.
   *   <li>Then return {@code -3.9894228040143276E12}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double); when '9.999999999999999E-14'; then return '-3.9894228040143276E12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_when9999999999999999e14_thenReturn39894228040143276e12() {
    // Arrange and Act
    double actualVannaResult =
        BlackFormulaRepository.vanna(0.0d, 0.0d, 0.0d, 9.999999999999999E-14d);

    // Assert
    assertEquals(-3.9894228040143276E12d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualVannaResult =
        BlackFormulaRepository.vanna(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601673797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double); when '3.1622776601673797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_when31622776601673797e13_thenReturnZero() {
    // Arrange and Act
    double actualVannaResult =
        BlackFormulaRepository.vanna(3.1622776601683797E13d, 3.1622776601673797E13d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double); when '3.1622776601683797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_when31622776601683797e13_thenReturnZero() {
    // Arrange and Act
    double actualVannaResult =
        BlackFormulaRepository.vanna(3.1622776601683797E13d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double); when '3.1622776601683797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_when31622776601683797e13_thenReturnZero2() {
    // Arrange and Act
    double actualVannaResult =
        BlackFormulaRepository.vanna(3.1622776601683797E13d, 10.0d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 2.101817822693787E-61}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double); when ten; then return '2.101817822693787E-61'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_whenTen_thenReturn2101817822693787e61() {
    // Arrange and Act
    double actualVannaResult = BlackFormulaRepository.vanna(1.0E13d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(2.101817822693787E-61d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 3.2588909802872037E-55}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double); when ten; then return '3.2588909802872037E-55'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_whenTen_thenReturn32588909802872037e55() {
    // Arrange and Act
    double actualVannaResult = BlackFormulaRepository.vanna(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(3.2588909802872037E-55d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vanna(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualVannaResult = BlackFormulaRepository.vanna(0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vanna(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_whenTen_thenReturnZero2() {
    // Arrange and Act
    double actualVannaResult = BlackFormulaRepository.vanna(10.0d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vanna(double, double, double, double); when zero; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vanna(double, double, double, double)"})
  void testVanna_whenZero_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualVannaResult = BlackFormulaRepository.vanna(0.0d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test dualVanna(double, double, double, double); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_when05_thenReturnZero() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackFormulaRepository.dualVanna(3.1622776601683797E13d, 10.0d, 0.5d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test dualVanna(double, double, double, double); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_when05_thenReturnZero2() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackFormulaRepository.dualVanna(
            3.1622776601683797E13d, 3.1622776601683797E13d, 0.5d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test dualVanna(double, double, double, double); when '1.0E-13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_when10e13_thenReturn00() {
    // Arrange and Act
    double actualDualVannaResult = BlackFormulaRepository.dualVanna(0.0d, 0.0d, 0.0d, 1.0E-13d);

    // Assert
    assertEquals(-0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test dualVanna(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualDualVannaResult = BlackFormulaRepository.dualVanna(0.0d, 1.0E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 9.999999999999999E-14}.
   *   <li>Then return {@code -3.9894228040143276E12}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double); when '9.999999999999999E-14'; then return '-3.9894228040143276E12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_when9999999999999999e14_thenReturn39894228040143276e12() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackFormulaRepository.dualVanna(0.0d, 0.0d, 0.0d, 9.999999999999999E-14d);

    // Assert
    assertEquals(-3.9894228040143276E12d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackFormulaRepository.dualVanna(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601673797E13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double); when '3.1622776601673797E13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_when31622776601673797e13_thenReturn00() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackFormulaRepository.dualVanna(
            3.1622776601683797E13d, 3.1622776601673797E13d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(-0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double); when '3.1622776601683797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_when31622776601683797e13_thenReturnZero() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackFormulaRepository.dualVanna(3.1622776601683797E13d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double); when '3.1622776601683797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_when31622776601683797e13_thenReturnZero2() {
    // Arrange and Act
    double actualDualVannaResult =
        BlackFormulaRepository.dualVanna(3.1622776601683797E13d, 10.0d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 2.3477076894580112E-49}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double); when ten; then return '2.3477076894580112E-49'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_whenTen_thenReturn23477076894580112e49() {
    // Arrange and Act
    double actualDualVannaResult = BlackFormulaRepository.dualVanna(1.0E13d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(2.3477076894580112E-49d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 3.2588909802872037E-55}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double); when ten; then return '3.2588909802872037E-55'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_whenTen_thenReturn32588909802872037e55() {
    // Arrange and Act
    double actualDualVannaResult = BlackFormulaRepository.dualVanna(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(3.2588909802872037E-55d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test dualVanna(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualDualVannaResult = BlackFormulaRepository.dualVanna(0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName("Test dualVanna(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_whenTen_thenReturnZero2() {
    // Arrange and Act
    double actualDualVannaResult = BlackFormulaRepository.dualVanna(10.0d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#dualVanna(double, double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NEGATIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#dualVanna(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test dualVanna(double, double, double, double); when zero; then return NEGATIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.dualVanna(double, double, double, double)"})
  void testDualVanna_whenZero_thenReturnNegative_infinity() {
    // Arrange and Act
    double actualDualVannaResult = BlackFormulaRepository.dualVanna(0.0d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(Double.NEGATIVE_INFINITY, actualDualVannaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vomma(double, double, double, double); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_when05_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult =
        BlackFormulaRepository.vomma(3.1622776601683797E13d, 10.0d, 0.5d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vomma(double, double, double, double); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_when05_thenReturnZero2() {
    // Arrange and Act
    double actualVommaResult =
        BlackFormulaRepository.vomma(3.1622776601683797E13d, 3.1622776601683797E13d, 0.5d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vomma(double, double, double, double); when '1.0E-13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_when10e13_thenReturn00() {
    // Arrange and Act
    double actualVommaResult = BlackFormulaRepository.vomma(0.0d, 0.0d, 0.0d, 1.0E-13d);

    // Assert
    assertEquals(-0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 8.920620580763857E25}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double); when '1.0E-13'; then return '8.920620580763857E25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_when10e13_thenReturn8920620580763857e25() {
    // Arrange and Act
    double actualVommaResult =
        BlackFormulaRepository.vomma(
            3.1622776601683797E13d, 3.1622776601683797E13d, 0.5d, 1.0E-13d);

    // Assert
    assertEquals(8.920620580763857E25d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vomma(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult = BlackFormulaRepository.vomma(0.0d, 1.0E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 9.999999999999999E-14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double); when '9.999999999999999E-14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_when9999999999999999e14_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult =
        BlackFormulaRepository.vomma(0.0d, 0.0d, 0.0d, 9.999999999999999E-14d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult =
        BlackFormulaRepository.vomma(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601673797E13}.
   *   <li>Then return {@code 3.989422804014327E-14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double); when '3.1622776601673797E13'; then return '3.989422804014327E-14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_when31622776601673797e13_thenReturn3989422804014327e14() {
    // Arrange and Act
    double actualVommaResult =
        BlackFormulaRepository.vomma(3.1622776601683797E13d, 3.1622776601673797E13d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(3.989422804014327E-14d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return {@code 3.989422804014327E-14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double); when '3.1622776601683797E13'; then return '3.989422804014327E-14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_when31622776601683797e13_thenReturn3989422804014327e14() {
    // Arrange and Act
    double actualVommaResult =
        BlackFormulaRepository.vomma(3.1622776601683797E13d, 3.1622776601683797E13d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(3.989422804014327E-14d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double); when '3.1622776601683797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_when31622776601683797e13_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult =
        BlackFormulaRepository.vomma(3.1622776601683797E13d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double); when '3.1622776601683797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_when31622776601683797e13_thenReturnZero2() {
    // Arrange and Act
    double actualVommaResult =
        BlackFormulaRepository.vomma(3.1622776601683797E13d, 10.0d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code -1.1089842839875806E-46}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double); when ten; then return '-1.1089842839875806E-46'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_whenTen_thenReturn11089842839875806e46() {
    // Arrange and Act
    double actualVommaResult = BlackFormulaRepository.vomma(1.0E13d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-1.1089842839875806E-46d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code -1.6294454901436019E-52}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test vomma(double, double, double, double); when ten; then return '-1.6294454901436019E-52'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_whenTen_thenReturn16294454901436019e52() {
    // Arrange and Act
    double actualVommaResult = BlackFormulaRepository.vomma(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-1.6294454901436019E-52d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vomma(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualVommaResult = BlackFormulaRepository.vomma(0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vomma(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_whenTen_thenReturnZero2() {
    // Arrange and Act
    double actualVommaResult = BlackFormulaRepository.vomma(10.0d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#vomma(double, double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#vomma(double, double, double, double)}
   */
  @Test
  @DisplayName("Test vomma(double, double, double, double); when zero; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.vomma(double, double, double, double)"})
  void testVomma_whenZero_thenReturnNaN() {
    // Arrange and Act
    double actualVommaResult = BlackFormulaRepository.vomma(0.0d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(Double.NaN, actualVommaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName("Test volga(double, double, double, double); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_when05_thenReturnZero() {
    // Arrange and Act
    double actualVolgaResult =
        BlackFormulaRepository.volga(3.1622776601683797E13d, 10.0d, 0.5d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName("Test volga(double, double, double, double); when '0.5'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_when05_thenReturnZero2() {
    // Arrange and Act
    double actualVolgaResult =
        BlackFormulaRepository.volga(3.1622776601683797E13d, 3.1622776601683797E13d, 0.5d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName("Test volga(double, double, double, double); when '1.0E-13'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_when10e13_thenReturn00() {
    // Arrange and Act
    double actualVolgaResult = BlackFormulaRepository.volga(0.0d, 0.0d, 0.0d, 1.0E-13d);

    // Assert
    assertEquals(-0.0d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-13}.
   *   <li>Then return {@code 8.920620580763857E25}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volga(double, double, double, double); when '1.0E-13'; then return '8.920620580763857E25'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_when10e13_thenReturn8920620580763857e25() {
    // Arrange and Act
    double actualVolgaResult =
        BlackFormulaRepository.volga(
            3.1622776601683797E13d, 3.1622776601683797E13d, 0.5d, 1.0E-13d);

    // Assert
    assertEquals(8.920620580763857E25d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName("Test volga(double, double, double, double); when '1.0E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_when10e13_thenReturnZero() {
    // Arrange and Act
    double actualVolgaResult = BlackFormulaRepository.volga(0.0d, 1.0E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 9.999999999999999E-14}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volga(double, double, double, double); when '9.999999999999999E-14'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_when9999999999999999e14_thenReturnZero() {
    // Arrange and Act
    double actualVolgaResult =
        BlackFormulaRepository.volga(0.0d, 0.0d, 0.0d, 9.999999999999999E-14d);

    // Assert
    assertEquals(0.0d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0000000000000002E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volga(double, double, double, double); when '1.0000000000000002E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_when10000000000000002e13_thenReturnZero() {
    // Arrange and Act
    double actualVolgaResult =
        BlackFormulaRepository.volga(0.0d, 1.0000000000000002E13d, 0.0d, 0.0d);

    // Assert
    assertEquals(0.0d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601673797E13}.
   *   <li>Then return {@code 3.989422804014327E-14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volga(double, double, double, double); when '3.1622776601673797E13'; then return '3.989422804014327E-14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_when31622776601673797e13_thenReturn3989422804014327e14() {
    // Arrange and Act
    double actualVolgaResult =
        BlackFormulaRepository.volga(3.1622776601683797E13d, 3.1622776601673797E13d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(3.989422804014327E-14d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return {@code 3.989422804014327E-14}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volga(double, double, double, double); when '3.1622776601683797E13'; then return '3.989422804014327E-14'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_when31622776601683797e13_thenReturn3989422804014327e14() {
    // Arrange and Act
    double actualVolgaResult =
        BlackFormulaRepository.volga(3.1622776601683797E13d, 3.1622776601683797E13d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(3.989422804014327E-14d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volga(double, double, double, double); when '3.1622776601683797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_when31622776601683797e13_thenReturnZero() {
    // Arrange and Act
    double actualVolgaResult =
        BlackFormulaRepository.volga(3.1622776601683797E13d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 3.1622776601683797E13}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volga(double, double, double, double); when '3.1622776601683797E13'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_when31622776601683797e13_thenReturnZero2() {
    // Arrange and Act
    double actualVolgaResult =
        BlackFormulaRepository.volga(3.1622776601683797E13d, 10.0d, 0.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code -1.1089842839875806E-46}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volga(double, double, double, double); when ten; then return '-1.1089842839875806E-46'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_whenTen_thenReturn11089842839875806e46() {
    // Arrange and Act
    double actualVolgaResult = BlackFormulaRepository.volga(1.0E13d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-1.1089842839875806E-46d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code -1.6294454901436019E-52}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volga(double, double, double, double); when ten; then return '-1.6294454901436019E-52'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_whenTen_thenReturn16294454901436019e52() {
    // Arrange and Act
    double actualVolgaResult = BlackFormulaRepository.volga(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-1.6294454901436019E-52d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName("Test volga(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_whenTen_thenReturnZero() {
    // Arrange and Act
    double actualVolgaResult = BlackFormulaRepository.volga(0.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName("Test volga(double, double, double, double); when ten; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_whenTen_thenReturnZero2() {
    // Arrange and Act
    double actualVolgaResult = BlackFormulaRepository.volga(10.0d, 10.0d, 10.0d, 1.0E13d);

    // Assert
    assertEquals(0.0d, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#volga(double, double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#volga(double, double, double, double)}
   */
  @Test
  @DisplayName("Test volga(double, double, double, double); when zero; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double BlackFormulaRepository.volga(double, double, double, double)"})
  void testVolga_whenZero_thenReturnNaN() {
    // Arrange and Act
    double actualVolgaResult = BlackFormulaRepository.volga(0.0d, 0.0d, 0.0d, 0.0d);

    // Assert
    assertEquals(Double.NaN, actualVolgaResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, double)}
   * with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, double)"
  })
  void testImpliedVolatilityWithOtmPriceForwardStrikeTimeToExpiryVolGuess() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(-1.0E-16d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, double)}
   * with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, double)"
  })
  void testImpliedVolatilityWithOtmPriceForwardStrikeTimeToExpiryVolGuess2() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(-1.0E-15d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(-8.800354439855185E-17d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, double)}
   * with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, double)"
  })
  void testImpliedVolatilityWithOtmPriceForwardStrikeTimeToExpiryVolGuess3() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(1.0E-16d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, double)}
   * with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, double)"
  })
  void testImpliedVolatilityWithOtmPriceForwardStrikeTimeToExpiryVolGuess4() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(1.0E-15d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, double)}
   * with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, double)"
  })
  void testImpliedVolatilityWithOtmPriceForwardStrikeTimeToExpiryVolGuess5() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(1.0E-16d, 1.0E-15d, 10.0d, 1.0E-16d, 10.0d);

    // Assert
    assertEquals(7.50275355376454E8d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, double)}
   * with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, double)"
  })
  void testImpliedVolatilityWithOtmPriceForwardStrikeTimeToExpiryVolGuess6() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(1.0E-16d, 1.0E-15d, 10.0d, 1.0E-15d, 10.0d);

    // Assert
    assertEquals(2.3725789952818525E8d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, double)}
   * with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, double)"
  })
  void testImpliedVolatilityWithOtmPriceForwardStrikeTimeToExpiryVolGuess7() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(1.0E-16d, 1.0E-15d, 10.0d, 1.0E-31d, 10.0d);

    // Assert
    assertEquals(2.3725789952818524E16d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, double)}
   * with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, double)"
  })
  void testImpliedVolatilityWithOtmPriceForwardStrikeTimeToExpiryVolGuess8() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(1.0E-16d, 1.0E-15d, 10.0d, 0.5d, 10.0d);

    // Assert
    assertEquals(10.610495830876747d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, double)}
   * with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, double)"
  })
  void testImpliedVolatilityWithOtmPriceForwardStrikeTimeToExpiryVolGuess9() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(1.0E-31d, 1.0E-15d, 10.0d, 0.5d, 10.0d);

    // Assert
    assertEquals(5.244550046745857d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, double)}
   * with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, double)"
  })
  void testImpliedVolatilityWithOtmPriceForwardStrikeTimeToExpiryVolGuess10() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(1.0E-16d, 0.5d, 10.0d, 0.5d, 10.0d);

    // Assert
    assertEquals(0.5333807353780828d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(-1.0E-15d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(-8.800354439855185E-17d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall2() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(10.0d, 10.0d, 1.0E-13d, 10.0d, true);

    // Assert
    assertEquals(3.5165533357372363d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall3() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(10.0d, 10.0d, 1.0E-13d, 1.0E-13d, true);

    // Assert
    assertEquals(3.516553335737233E7d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall4() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(10.0d, 10.0d, 1.0E-13d, 0.3d, true);

    // Assert
    assertEquals(20.30283015007569d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall5() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(10.0d, 10.0d, 1.0E-13d, 1.0E-15d, true);

    // Assert
    assertEquals(3.516553335737235E8d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall6() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(10.0d, 1.0E-13d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(3.516553335737236d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall7() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(10.0d, 1.0E-13d, 10.0d, 0.3d, false);

    // Assert
    assertEquals(20.302830150075685d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall8() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(10.0d, 1.0E-13d, 10.0d, 1.0E-29d, false);

    // Assert
    assertEquals(3.5165533357372335E15d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall9() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(10.0d, 10.0d, 0.1d, 1.0E-13d, true);

    // Assert
    assertEquals(5.18131763275445E7d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall10() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(10.0d, 10.0d, 1.0E-13d, 1.0E-7d, true);

    // Assert
    assertEquals(35165.53335737193d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall_thenReturnZero() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(-1.0E-16d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatility(double, double, double, double, boolean)}
   * with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code isCall}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatility(double, double, double,
   * double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatility(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityWithPriceForwardStrikeTimeToExpiryIsCall_thenReturnZero2() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        BlackFormulaRepository.impliedVolatility(-1.0E-16d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    assertEquals(0.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * double)} with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, double)"
  })
  void testImpliedVolatilityAdjointWithOtmPriceForwardStrikeTimeToExpiryVolGuess() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(1.0E-16d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * double)} with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, double)"
  })
  void testImpliedVolatilityAdjointWithOtmPriceForwardStrikeTimeToExpiryVolGuess2() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(1.0E-15d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.0d, actualImpliedVolatilityAdjointResult.getValue());
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.max());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.min());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.sum());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * double)} with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, double)"
  })
  void testImpliedVolatilityAdjointWithOtmPriceForwardStrikeTimeToExpiryVolGuess3() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(0.5d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.039659248606192875d, actualImpliedVolatilityAdjointResult.getValue());
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    assertEquals(0.07942254283026258d, derivatives.max());
    assertEquals(0.07942254283026258d, derivatives.min());
    assertEquals(0.07942254283026258d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.07942254283026258d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {0.07942254283026258d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * double)} with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, double)"
  })
  void testImpliedVolatilityAdjointWithOtmPriceForwardStrikeTimeToExpiryVolGuess4() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(1.0E-16d, 1.0E-15d, 10.0d, 1.0E-16d, 10.0d);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(4.9066003068620184E23d, derivatives.max());
    assertEquals(4.9066003068620184E23d, derivatives.min());
    assertEquals(4.9066003068620184E23d, derivatives.sum());
    assertEquals(4.9066003068620184E23d, toListResult.get(0).doubleValue());
    assertEquals(7.50275355376454E8d, actualImpliedVolatilityAdjointResult.getValue());
    assertArrayEquals(new double[] {4.9066003068620184E23d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * double)} with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, double)"
  })
  void testImpliedVolatilityAdjointWithOtmPriceForwardStrikeTimeToExpiryVolGuess5() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(1.0E-16d, 1.0E-15d, 10.0d, 1.0E-31d, 10.0d);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.5516032537765077E31d, derivatives.max());
    assertEquals(1.5516032537765077E31d, derivatives.min());
    assertEquals(1.5516032537765077E31d, derivatives.sum());
    assertEquals(1.5516032537765077E31d, toListResult.get(0).doubleValue());
    assertEquals(2.3725789952818524E16d, actualImpliedVolatilityAdjointResult.getValue());
    assertArrayEquals(new double[] {1.5516032537765077E31d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * double)} with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, double)"
  })
  void testImpliedVolatilityAdjointWithOtmPriceForwardStrikeTimeToExpiryVolGuess6() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(1.0E-16d, 1.0E-15d, 10.0d, 1.0E-15d, 10.0d);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.5516032537765078E23d, derivatives.max());
    assertEquals(1.5516032537765078E23d, derivatives.min());
    assertEquals(1.5516032537765078E23d, derivatives.sum());
    assertEquals(1.5516032537765078E23d, toListResult.get(0).doubleValue());
    assertEquals(2.3725789952818525E8d, actualImpliedVolatilityAdjointResult.getValue());
    assertArrayEquals(new double[] {1.5516032537765078E23d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * double)} with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, double)"
  })
  void testImpliedVolatilityAdjointWithOtmPriceForwardStrikeTimeToExpiryVolGuess7() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(1.0E-16d, 1.0E-15d, 10.0d, 0.5d, 10.0d);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(10.610495830876747d, actualImpliedVolatilityAdjointResult.getValue());
    assertEquals(6.938980699108277E15d, derivatives.max());
    assertEquals(6.938980699108277E15d, derivatives.min());
    assertEquals(6.938980699108277E15d, derivatives.sum());
    assertEquals(6.938980699108277E15d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {6.938980699108277E15d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * double)} with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, double)"
  })
  void testImpliedVolatilityAdjointWithOtmPriceForwardStrikeTimeToExpiryVolGuess8() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(1.0E-15d, 10.0d, 0.5d, 1.0E-16d, 10.0d);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(3.910305864290136E7d, actualImpliedVolatilityAdjointResult.getValue());
    assertEquals(6.351505917199927E20d, derivatives.max());
    assertEquals(6.351505917199927E20d, derivatives.min());
    assertEquals(6.351505917199927E20d, derivatives.sum());
    assertEquals(6.351505917199927E20d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {6.351505917199927E20d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * double)} with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, double)"
  })
  void testImpliedVolatilityAdjointWithOtmPriceForwardStrikeTimeToExpiryVolGuess9() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(1.0E-15d, 10.0d, 0.5d, 0.5d, 10.0d);

    // Assert
    assertEquals(0.5530007581933449d, actualImpliedVolatilityAdjointResult.getValue());
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(8.982386226195973E12d, derivatives.max());
    assertEquals(8.982386226195973E12d, derivatives.min());
    assertEquals(8.982386226195973E12d, derivatives.sum());
    assertEquals(8.982386226195973E12d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {8.982386226195973E12d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * double)} with {@code otmPrice}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * volGuess}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, double) with 'otmPrice', 'forward', 'strike', 'timeToExpiry', 'volGuess'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, double)"
  })
  void testImpliedVolatilityAdjointWithOtmPriceForwardStrikeTimeToExpiryVolGuess10() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(0.5d, 10.0d, 10.0d, 0.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(Double.POSITIVE_INFINITY, actualImpliedVolatilityAdjointResult.getValue());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.max());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.min());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.sum());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(-1.0E-16d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall2() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(0.3d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.023785569581675145d, actualImpliedVolatilityAdjointResult.getValue());
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    assertEquals(0.07932262241764108d, derivatives.max());
    assertEquals(0.07932262241764108d, derivatives.min());
    assertEquals(0.07932262241764108d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.07932262241764108d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {0.07932262241764108d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall3() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(1.0E-15d, 10.0d, 10.0d, 10.0d, true);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.max());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.min());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.sum());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall4() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(-1.0E-16d, 10.0d, 10.0d, 10.0d, false);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, derivatives.min());
    assertEquals(0.0d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall5() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(0.3d, 0.5d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.9787151824546283d, actualImpliedVolatilityAdjointResult.getValue());
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.8752301637358182d, derivatives.max());
    assertEquals(1.8752301637358182d, derivatives.min());
    assertEquals(1.8752301637358182d, derivatives.sum());
    assertEquals(1.8752301637358182d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.8752301637358182d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall6() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(0.3d, 10.0d, 10.0d, 0.0d, true);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(Double.POSITIVE_INFINITY, actualImpliedVolatilityAdjointResult.getValue());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.max());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.min());
    assertEquals(Double.POSITIVE_INFINITY, derivatives.sum());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall7() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(1.0E-15d, 0.3d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.14498716776141427d, actualImpliedVolatilityAdjointResult.getValue());
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(2.3632267218042983E12d, derivatives.max());
    assertEquals(2.3632267218042983E12d, derivatives.min());
    assertEquals(2.3632267218042983E12d, derivatives.sum());
    assertEquals(2.3632267218042983E12d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {2.3632267218042983E12d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall8() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(1.0E-15d, 0.5d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.12365472821951251d, actualImpliedVolatilityAdjointResult.getValue());
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(2.0085230712245312E12d, derivatives.max());
    assertEquals(2.0085230712245312E12d, derivatives.min());
    assertEquals(2.0085230712245312E12d, derivatives.sum());
    assertEquals(2.0085230712245312E12d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {2.0085230712245312E12d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall9() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(0.3d, 0.5d, 0.3d, 10.0d, true);

    // Assert
    assertEquals(0.3942901539181056d, actualImpliedVolatilityAdjointResult.getValue());
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(2.7032651758075903d, derivatives.max());
    assertEquals(2.7032651758075903d, derivatives.min());
    assertEquals(2.7032651758075903d, derivatives.sum());
    assertEquals(2.7032651758075903d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {2.7032651758075903d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall10() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(0.3d, 0.5d, 10.0d, 1.0E-16d, true);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(3.09496915714389E8d, actualImpliedVolatilityAdjointResult.getValue());
    assertEquals(5.92999845445567E8d, derivatives.max());
    assertEquals(5.92999845445567E8d, derivatives.min());
    assertEquals(5.92999845445567E8d, derivatives.sum());
    assertEquals(5.92999845445567E8d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {5.92999845445567E8d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall11() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(3.0E-17d, 0.3d, 10.0d, 10.0d, true);

    // Assert
    assertEquals(0.1373325134816235d, actualImpliedVolatilityAdjointResult.getValue());
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(6.725350495905467E13d, derivatives.max());
    assertEquals(6.725350495905467E13d, derivatives.min());
    assertEquals(6.725350495905467E13d, derivatives.sum());
    assertEquals(6.725350495905467E13d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {6.725350495905467E13d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double, double, double,
   * boolean)} with {@code price}, {@code forward}, {@code strike}, {@code timeToExpiry}, {@code
   * isCall}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedVolatilityAdjoint(double, double,
   * double, double, boolean)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityAdjoint(double, double, double, double, boolean) with 'price', 'forward', 'strike', 'timeToExpiry', 'isCall'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityAdjoint(double, double, double, double, boolean)"
  })
  void testImpliedVolatilityAdjointWithPriceForwardStrikeTimeToExpiryIsCall12() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityAdjointResult =
        BlackFormulaRepository.impliedVolatilityAdjoint(0.3d, 0.5d, 0.3d, 1.0E-16d, true);

    // Assert
    DoubleArray derivatives = actualImpliedVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.2468549453595775E8d, actualImpliedVolatilityAdjointResult.getValue());
    assertEquals(8.548475074967488E8d, derivatives.max());
    assertEquals(8.548475074967488E8d, derivatives.min());
    assertEquals(8.548475074967488E8d, derivatives.sum());
    assertEquals(8.548475074967488E8d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {8.548475074967488E8d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedStrike(double, boolean, double, double, double)} with
   * {@code delta}, {@code isCall}, {@code forward}, {@code time}, {@code volatility}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedStrike(double, boolean, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedStrike(double, boolean, double, double, double) with 'delta', 'isCall', 'forward', 'time', 'volatility'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedStrike(double, boolean, double, double, double)"
  })
  void testImpliedStrikeWithDeltaIsCallForwardTimeVolatility() {
    // Arrange and Act
    double actualImpliedStrikeResult =
        BlackFormulaRepository.impliedStrike(0.5d, true, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(1.4035922178528373E218d, actualImpliedStrikeResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedStrike(double, boolean, double, double, double)} with
   * {@code delta}, {@code isCall}, {@code forward}, {@code time}, {@code volatility}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedStrike(double, boolean, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedStrike(double, boolean, double, double, double) with 'delta', 'isCall', 'forward', 'time', 'volatility'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedStrike(double, boolean, double, double, double)"
  })
  void testImpliedStrikeWithDeltaIsCallForwardTimeVolatility2() {
    // Arrange and Act
    double actualImpliedStrikeResult =
        BlackFormulaRepository.impliedStrike(0.1353352832366127d, true, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(1.883944203553051E233d, actualImpliedStrikeResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedStrike(double, boolean, double, double, double)} with
   * {@code delta}, {@code isCall}, {@code forward}, {@code time}, {@code volatility}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedStrike(double, boolean, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedStrike(double, boolean, double, double, double) with 'delta', 'isCall', 'forward', 'time', 'volatility'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedStrike(double, boolean, double, double, double)"
  })
  void testImpliedStrikeWithDeltaIsCallForwardTimeVolatility3() {
    // Arrange and Act
    double actualImpliedStrikeResult =
        BlackFormulaRepository.impliedStrike(1.0E-16d, true, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualImpliedStrikeResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedStrike(double, boolean, double, double, double)} with
   * {@code delta}, {@code isCall}, {@code forward}, {@code time}, {@code volatility}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedStrike(double, boolean, double,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedStrike(double, boolean, double, double, double) with 'delta', 'isCall', 'forward', 'time', 'volatility'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedStrike(double, boolean, double, double, double)"
  })
  void testImpliedStrikeWithDeltaIsCallForwardTimeVolatility4() {
    // Arrange and Act
    double actualImpliedStrikeResult =
        BlackFormulaRepository.impliedStrike(-1.0E-16d, false, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(1.6922875731776943E105d, actualImpliedStrikeResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedStrike(double, boolean, double, double, double,
   * double[])} with {@code delta}, {@code isCall}, {@code forward}, {@code time}, {@code
   * volatility}, {@code derivatives}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedStrike(double, boolean, double,
   * double, double, double[])}
   */
  @Test
  @DisplayName(
      "Test impliedStrike(double, boolean, double, double, double, double[]) with 'delta', 'isCall', 'forward', 'time', 'volatility', 'derivatives'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedStrike(double, boolean, double, double, double, double[])"
  })
  void testImpliedStrikeWithDeltaIsCallForwardTimeVolatilityDerivatives() {
    // Arrange
    double[] derivatives = new double[] {10.0d, -1.0d, 10.0d, -1.0d};

    // Act
    double actualImpliedStrikeResult =
        BlackFormulaRepository.impliedStrike(0.5d, true, 10.0d, 10.0d, 10.0d, derivatives);

    // Assert
    assertEquals(1.4035922178528373E218d, actualImpliedStrikeResult);
    assertArrayEquals(
        new double[] {
          -1.1125790703447026E220d,
          1.4035922178528373E217d,
          7.017961089264187E219d,
          1.4035922178528373E220d
        },
        derivatives,
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedStrike(double, boolean, double, double, double,
   * double[])} with {@code delta}, {@code isCall}, {@code forward}, {@code time}, {@code
   * volatility}, {@code derivatives}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedStrike(double, boolean, double,
   * double, double, double[])}
   */
  @Test
  @DisplayName(
      "Test impliedStrike(double, boolean, double, double, double, double[]) with 'delta', 'isCall', 'forward', 'time', 'volatility', 'derivatives'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedStrike(double, boolean, double, double, double, double[])"
  })
  void testImpliedStrikeWithDeltaIsCallForwardTimeVolatilityDerivatives2() {
    // Arrange
    double[] derivatives = new double[] {10.0d, -1.0d, 10.0d, -1.0d};

    // Act
    double actualImpliedStrikeResult =
        BlackFormulaRepository.impliedStrike(
            0.1353352832366127d, true, 10.0d, 10.0d, 10.0d, derivatives);

    // Assert
    assertEquals(1.883944203553051E233d, actualImpliedStrikeResult);
    assertArrayEquals(
        new double[] {
          -2.739255840512961E235d,
          1.883944203553051E232d,
          9.747839187992538E234d,
          1.9495678375985076E235d
        },
        derivatives,
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedStrike(double, boolean, double, double, double,
   * double[])} with {@code delta}, {@code isCall}, {@code forward}, {@code time}, {@code
   * volatility}, {@code derivatives}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedStrike(double, boolean, double,
   * double, double, double[])}
   */
  @Test
  @DisplayName(
      "Test impliedStrike(double, boolean, double, double, double, double[]) with 'delta', 'isCall', 'forward', 'time', 'volatility', 'derivatives'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedStrike(double, boolean, double, double, double, double[])"
  })
  void testImpliedStrikeWithDeltaIsCallForwardTimeVolatilityDerivatives3() {
    // Arrange
    double[] derivatives = new double[] {10.0d, -1.0d, 10.0d, -1.0d};

    // Act
    double actualImpliedStrikeResult =
        BlackFormulaRepository.impliedStrike(1.0E-16d, true, 10.0d, 10.0d, 10.0d, derivatives);

    // Assert
    assertEquals(Double.POSITIVE_INFINITY, actualImpliedStrikeResult);
    assertArrayEquals(
        new double[] {
          Double.NEGATIVE_INFINITY,
          Double.POSITIVE_INFINITY,
          Double.POSITIVE_INFINITY,
          Double.POSITIVE_INFINITY
        },
        derivatives,
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedStrike(double, boolean, double, double, double,
   * double[])} with {@code delta}, {@code isCall}, {@code forward}, {@code time}, {@code
   * volatility}, {@code derivatives}.
   *
   * <p>Method under test: {@link BlackFormulaRepository#impliedStrike(double, boolean, double,
   * double, double, double[])}
   */
  @Test
  @DisplayName(
      "Test impliedStrike(double, boolean, double, double, double, double[]) with 'delta', 'isCall', 'forward', 'time', 'volatility', 'derivatives'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedStrike(double, boolean, double, double, double, double[])"
  })
  void testImpliedStrikeWithDeltaIsCallForwardTimeVolatilityDerivatives4() {
    // Arrange
    double[] derivatives = new double[] {10.0d, -1.0d, 10.0d, -1.0d};

    // Act
    double actualImpliedStrikeResult =
        BlackFormulaRepository.impliedStrike(-1.0E-16d, false, 10.0d, 10.0d, 10.0d, derivatives);

    // Assert
    assertEquals(1.6922875731776943E105d, actualImpliedStrikeResult);
    assertArrayEquals(
        new double[] {
          -6.416378592897293E121d,
          1.6922875731776943E104d,
          6.2614211287019634E106d,
          1.2522842257403924E107d
        },
        derivatives,
        0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityFromNormalApproximated(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.7921194479056844}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackFormulaRepository#impliedVolatilityFromNormalApproximated(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromNormalApproximated(double, double, double, double); then return '0.7921194479056844'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatilityFromNormalApproximated(double, double, double, double)"
  })
  void testImpliedVolatilityFromNormalApproximated_thenReturn07921194479056844() {
    // Arrange and Act
    double actualImpliedVolatilityFromNormalApproximatedResult =
        BlackFormulaRepository.impliedVolatilityFromNormalApproximated(24.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.7921194479056844d, actualImpliedVolatilityFromNormalApproximatedResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityFromNormalApproximated(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.011202437764985721}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackFormulaRepository#impliedVolatilityFromNormalApproximated(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromNormalApproximated(double, double, double, double); then return '0.011202437764985721'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatilityFromNormalApproximated(double, double, double, double)"
  })
  void testImpliedVolatilityFromNormalApproximated_thenReturn0011202437764985721() {
    // Arrange and Act
    double actualImpliedVolatilityFromNormalApproximatedResult =
        BlackFormulaRepository.impliedVolatilityFromNormalApproximated(
            5670.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.011202437764985721d, actualImpliedVolatilityFromNormalApproximatedResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityFromNormalApproximated(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.001}.
   *   <li>Then return {@code 1.0000416703156616}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackFormulaRepository#impliedVolatilityFromNormalApproximated(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromNormalApproximated(double, double, double, double); when '0.001'; then return '1.0000416703156616'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatilityFromNormalApproximated(double, double, double, double)"
  })
  void testImpliedVolatilityFromNormalApproximated_when0001_thenReturn10000416703156616() {
    // Arrange and Act
    double actualImpliedVolatilityFromNormalApproximatedResult =
        BlackFormulaRepository.impliedVolatilityFromNormalApproximated(10.0d, 10.0d, 0.001d, 10.0d);

    // Assert
    assertEquals(1.0000416703156616d, actualImpliedVolatilityFromNormalApproximatedResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityFromNormalApproximated(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 1.0457799357533628}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackFormulaRepository#impliedVolatilityFromNormalApproximated(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromNormalApproximated(double, double, double, double); when one; then return '1.0457799357533628'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatilityFromNormalApproximated(double, double, double, double)"
  })
  void testImpliedVolatilityFromNormalApproximated_whenOne_thenReturn10457799357533628() {
    // Arrange and Act
    double actualImpliedVolatilityFromNormalApproximatedResult =
        BlackFormulaRepository.impliedVolatilityFromNormalApproximated(10.0d, 10.0d, 1.0d, 10.0d);

    // Assert
    assertEquals(1.0457799357533628d, actualImpliedVolatilityFromNormalApproximatedResult);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityFromNormalApproximatedAdjoint(double,
   * double, double, double)}.
   *
   * <p>Method under test: {@link
   * BlackFormulaRepository#impliedVolatilityFromNormalApproximatedAdjoint(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromNormalApproximatedAdjoint(double, double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityFromNormalApproximatedAdjoint(double, double, double, double)"
  })
  void testImpliedVolatilityFromNormalApproximatedAdjoint() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityFromNormalApproximatedAdjointResult =
        BlackFormulaRepository.impliedVolatilityFromNormalApproximatedAdjoint(
            24.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    DoubleArray derivatives =
        actualImpliedVolatilityFromNormalApproximatedAdjointResult.getDerivatives();
    assertEquals(0.13947554180369767d, derivatives.max());
    assertEquals(0.13947554180369767d, derivatives.min());
    assertEquals(0.13947554180369767d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.13947554180369767d, toListResult.get(0).doubleValue());
    assertEquals(
        0.7921194479056844d, actualImpliedVolatilityFromNormalApproximatedAdjointResult.getValue());
    assertArrayEquals(new double[] {0.13947554180369767d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityFromNormalApproximatedAdjoint(double,
   * double, double, double)}.
   *
   * <p>Method under test: {@link
   * BlackFormulaRepository#impliedVolatilityFromNormalApproximatedAdjoint(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromNormalApproximatedAdjoint(double, double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives BlackFormulaRepository.impliedVolatilityFromNormalApproximatedAdjoint(double, double, double, double)"
  })
  void testImpliedVolatilityFromNormalApproximatedAdjoint2() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityFromNormalApproximatedAdjointResult =
        BlackFormulaRepository.impliedVolatilityFromNormalApproximatedAdjoint(
            10.0d, 10.0d, 0.001d, 10.0d);

    // Assert
    DoubleArray derivatives =
        actualImpliedVolatilityFromNormalApproximatedAdjointResult.getDerivatives();
    assertEquals(0.10001250182457863d, derivatives.max());
    assertEquals(0.10001250182457863d, derivatives.min());
    assertEquals(0.10001250182457863d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.10001250182457863d, toListResult.get(0).doubleValue());
    assertEquals(
        1.0000416703156616d, actualImpliedVolatilityFromNormalApproximatedAdjointResult.getValue());
    assertArrayEquals(new double[] {0.10001250182457863d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityFromNormalApproximated2(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>Then return {@code 4.166666666666667E32}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackFormulaRepository#impliedVolatilityFromNormalApproximated2(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromNormalApproximated2(double, double, double, double); then return '4.166666666666667E32'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatilityFromNormalApproximated2(double, double, double, double)"
  })
  void testImpliedVolatilityFromNormalApproximated2_thenReturn4166666666666667e32() {
    // Arrange and Act
    double actualImpliedVolatilityFromNormalApproximated2Result =
        BlackFormulaRepository.impliedVolatilityFromNormalApproximated2(
            1.0E-10d, 1.0E-10d, 10.0d, 10.0d);

    // Assert
    assertEquals(4.166666666666667E32d, actualImpliedVolatilityFromNormalApproximated2Result);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityFromNormalApproximated2(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>Then return {@code 11257.706430336095}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackFormulaRepository#impliedVolatilityFromNormalApproximated2(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromNormalApproximated2(double, double, double, double); then return '11257.706430336095'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatilityFromNormalApproximated2(double, double, double, double)"
  })
  void testImpliedVolatilityFromNormalApproximated2_thenReturn11257706430336095() {
    // Arrange and Act
    double actualImpliedVolatilityFromNormalApproximated2Result =
        BlackFormulaRepository.impliedVolatilityFromNormalApproximated2(
            0.001d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(11257.706430336095d, actualImpliedVolatilityFromNormalApproximated2Result);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityFromNormalApproximated2(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 12.747553637490473}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackFormulaRepository#impliedVolatilityFromNormalApproximated2(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromNormalApproximated2(double, double, double, double); when one; then return '12.747553637490473'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatilityFromNormalApproximated2(double, double, double, double)"
  })
  void testImpliedVolatilityFromNormalApproximated2_whenOne_thenReturn12747553637490473() {
    // Arrange and Act
    double actualImpliedVolatilityFromNormalApproximated2Result =
        BlackFormulaRepository.impliedVolatilityFromNormalApproximated2(1.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(12.747553637490473d, actualImpliedVolatilityFromNormalApproximated2Result);
  }

  /**
   * Test {@link BlackFormulaRepository#impliedVolatilityFromNormalApproximated2(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 1.4166666666666667}.
   * </ul>
   *
   * <p>Method under test: {@link
   * BlackFormulaRepository#impliedVolatilityFromNormalApproximated2(double, double, double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromNormalApproximated2(double, double, double, double); when ten; then return '1.4166666666666667'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double BlackFormulaRepository.impliedVolatilityFromNormalApproximated2(double, double, double, double)"
  })
  void testImpliedVolatilityFromNormalApproximated2_whenTen_thenReturn14166666666666667() {
    // Arrange and Act
    double actualImpliedVolatilityFromNormalApproximated2Result =
        BlackFormulaRepository.impliedVolatilityFromNormalApproximated2(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(1.4166666666666667d, actualImpliedVolatilityFromNormalApproximated2Result);
  }
}
