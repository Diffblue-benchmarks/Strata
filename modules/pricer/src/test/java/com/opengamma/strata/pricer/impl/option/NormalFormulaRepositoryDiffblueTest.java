package com.opengamma.strata.pricer.impl.option;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.product.common.PutCall;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class NormalFormulaRepositoryDiffblueTest {
  /**
   * Test {@link NormalFormulaRepository#price(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return {@code 18.241241314072113}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#price(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, PutCall); when '1.0E-16'; then return '18.241241314072113'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.price(double, double, double, double, PutCall)"
  })
  void testPrice_when10e16_thenReturn18241241314072113() {
    // Arrange and Act
    double actualPriceResult =
        NormalFormulaRepository.price(1.0E-16d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(18.241241314072113d, actualPriceResult);
  }

  /**
   * Test {@link NormalFormulaRepository#price(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#price(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, PutCall); when '1.0E-16'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.price(double, double, double, double, PutCall)"
  })
  void testPrice_when10e16_thenReturnTen() {
    // Arrange and Act
    double actualPriceResult =
        NormalFormulaRepository.price(1.0E-16d, 10.0d, 1.0E-16d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(10.0d, actualPriceResult);
  }

  /**
   * Test {@link NormalFormulaRepository#price(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 0.2236067977499789}.
   *   <li>Then return {@code 10.029363748689713}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#price(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, PutCall); when '0.2236067977499789'; then return '10.029363748689713'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.price(double, double, double, double, PutCall)"
  })
  void testPrice_when02236067977499789_thenReturn10029363748689713() {
    // Arrange and Act
    double actualPriceResult =
        NormalFormulaRepository.price(1.0E-16d, 10.0d, 0.2236067977499789d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(10.029363748689713d, actualPriceResult);
  }

  /**
   * Test {@link NormalFormulaRepository#price(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#price(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, PutCall); when '-6.0136873569177505'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.price(double, double, double, double, PutCall)"
  })
  void testPrice_when60136873569177505_thenReturnNaN() {
    // Arrange and Act
    double actualPriceResult =
        NormalFormulaRepository.price(10.0d, 10.0d, -6.0136873569177505d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(Double.NaN, actualPriceResult);
  }

  /**
   * Test {@link NormalFormulaRepository#price(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@link PutCall#CALL}.
   *   <li>Then return {@code 12.615662610100802}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#price(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, PutCall); when CALL; then return '12.615662610100802'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.price(double, double, double, double, PutCall)"
  })
  void testPrice_whenCall_thenReturn12615662610100802() {
    // Arrange and Act
    double actualPriceResult =
        NormalFormulaRepository.price(10.0d, 10.0d, 10.0d, 10.0d, PutCall.CALL);

    // Assert
    assertEquals(12.615662610100802d, actualPriceResult);
  }

  /**
   * Test {@link NormalFormulaRepository#price(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 10.000673355312507}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#price(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, PutCall); when one; then return '10.000673355312507'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.price(double, double, double, double, PutCall)"
  })
  void testPrice_whenOne_thenReturn10000673355312507() {
    // Arrange and Act
    double actualPriceResult =
        NormalFormulaRepository.price(1.0E-16d, 10.0d, 10.0d, 1.0d, PutCall.PUT);

    // Assert
    assertEquals(10.000673355312507d, actualPriceResult);
  }

  /**
   * Test {@link NormalFormulaRepository#price(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code PUT}.
   *   <li>Then return {@code 12.615662610100802}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#price(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test price(double, double, double, double, PutCall); when 'PUT'; then return '12.615662610100802'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.price(double, double, double, double, PutCall)"
  })
  void testPrice_whenPut_thenReturn12615662610100802() {
    // Arrange and Act
    double actualPriceResult =
        NormalFormulaRepository.price(10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(12.615662610100802d, actualPriceResult);
  }

  /**
   * Test {@link NormalFormulaRepository#price(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#price(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test price(double, double, double, double, PutCall); when zero; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.price(double, double, double, double, PutCall)"
  })
  void testPrice_whenZero_thenReturnTen() {
    // Arrange and Act
    double actualPriceResult =
        NormalFormulaRepository.price(1.0E-16d, 10.0d, 0.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(10.0d, actualPriceResult);
  }

  /**
   * Test {@link NormalFormulaRepository#price(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#price(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test price(double, double, double, double, PutCall); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.price(double, double, double, double, PutCall)"
  })
  void testPrice_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualPriceResult =
        NormalFormulaRepository.price(10.0d, 10.0d, 0.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualPriceResult);
  }

  /**
   * Test {@link NormalFormulaRepository#priceAdjoint(double, double, double, double, double,
   * PutCall)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code -9.827740511602725}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#priceAdjoint(double, double, double,
   * double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, PutCall); then return Derivatives min is '-9.827740511602725'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives NormalFormulaRepository.priceAdjoint(double, double, double, double, double, PutCall)"
  })
  void testPriceAdjoint_thenReturnDerivativesMinIs9827740511602725() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        NormalFormulaRepository.priceAdjoint(
            1.0E-16d, 10.0d, 0.2236067977499789d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-9.827740511602725d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-9.827740511602725d, toListResult.get(0).doubleValue());
    assertEquals(0.20162323708698793d, derivatives.sum());
    assertEquals(0.2016232370869883d, toListResult.get(1).doubleValue());
    assertEquals(100.29363748689713d, actualPriceAdjointResult.getValue());
    assertEquals(9.827740511602725d, derivatives.max());
    assertEquals(9.827740511602725d, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {-9.827740511602725d, 0.2016232370869883d, 9.827740511602725d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link NormalFormulaRepository#priceAdjoint(double, double, double, double, double,
   * PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return Derivatives min is {@code -6.240851829770753}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#priceAdjoint(double, double, double,
   * double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, PutCall); when '1.0E-16'; then return Derivatives min is '-6.240851829770753'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives NormalFormulaRepository.priceAdjoint(double, double, double, double, double, PutCall)"
  })
  void testPriceAdjoint_when10e16_thenReturnDerivativesMinIs6240851829770753() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        NormalFormulaRepository.priceAdjoint(1.0E-16d, 10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-6.240851829770753d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-6.240851829770753d, toListResult.get(0).doubleValue());
    assertEquals(12.00038948430136d, derivatives.max());
    assertEquals(12.00038948430136d, derivatives.sum());
    assertEquals(12.00038948430136d, toListResult.get(1).doubleValue());
    assertEquals(182.41241314072113d, actualPriceAdjointResult.getValue());
    assertEquals(6.240851829770753d, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {-6.240851829770753d, 12.00038948430136d, 6.240851829770753d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link NormalFormulaRepository#priceAdjoint(double, double, double, double, double,
   * PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return Derivatives min is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#priceAdjoint(double, double, double,
   * double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, PutCall); when '1.0E-16'; then return Derivatives min is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives NormalFormulaRepository.priceAdjoint(double, double, double, double, double, PutCall)"
  })
  void testPriceAdjoint_when10e16_thenReturnDerivativesMinIsMinusTen() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        NormalFormulaRepository.priceAdjoint(1.0E-16d, 10.0d, 1.0E-16d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-10.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, derivatives.max());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(100.0d, actualPriceAdjointResult.getValue());
    assertArrayEquals(new double[] {-10.0d, 0.0d, 10.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link NormalFormulaRepository#priceAdjoint(double, double, double, double, double,
   * PutCall)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return Value is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#priceAdjoint(double, double, double,
   * double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, PutCall); when '-6.0136873569177505'; then return Value is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives NormalFormulaRepository.priceAdjoint(double, double, double, double, double, PutCall)"
  })
  void testPriceAdjoint_when60136873569177505_thenReturnValueIsNaN() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        NormalFormulaRepository.priceAdjoint(
            10.0d, 10.0d, -6.0136873569177505d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(Double.NaN, actualPriceAdjointResult.getValue());
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
   * Test {@link NormalFormulaRepository#priceAdjoint(double, double, double, double, double,
   * PutCall)}.
   *
   * <ul>
   *   <li>When {@link PutCall#CALL}.
   *   <li>Then return Derivatives toList third doubleValue is minus five.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#priceAdjoint(double, double, double,
   * double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, PutCall); when CALL; then return Derivatives toList third doubleValue is minus five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives NormalFormulaRepository.priceAdjoint(double, double, double, double, double, PutCall)"
  })
  void testPriceAdjoint_whenCall_thenReturnDerivativesToListThirdDoubleValueIsMinusFive() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        NormalFormulaRepository.priceAdjoint(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, PutCall.CALL);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-5.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-5.0d, toListResult.get(2).doubleValue());
    assertEquals(12.615662610100802d, derivatives.max());
    assertEquals(12.615662610100802d, derivatives.sum());
    assertEquals(12.615662610100802d, toListResult.get(1).doubleValue());
    assertEquals(126.15662610100802d, actualPriceAdjointResult.getValue());
    assertEquals(5.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {5.0d, 12.615662610100802d, -5.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link NormalFormulaRepository#priceAdjoint(double, double, double, double, double,
   * PutCall)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return Derivatives min is {@code -9.992172988709987}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#priceAdjoint(double, double, double,
   * double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, PutCall); when one; then return Derivatives min is '-9.992172988709987'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives NormalFormulaRepository.priceAdjoint(double, double, double, double, double, PutCall)"
  })
  void testPriceAdjoint_whenOne_thenReturnDerivativesMinIs9992172988709987() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        NormalFormulaRepository.priceAdjoint(1.0E-16d, 10.0d, 10.0d, 1.0d, 10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-9.992172988709987d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-9.992172988709987d, toListResult.get(0).doubleValue());
    assertEquals(0.08500366602520337d, derivatives.sum());
    assertEquals(0.08500366602520351d, toListResult.get(1).doubleValue());
    assertEquals(100.00673355312507d, actualPriceAdjointResult.getValue());
    assertEquals(9.992172988709987d, derivatives.max());
    assertEquals(9.992172988709987d, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {-9.992172988709987d, 0.08500366602520351d, 9.992172988709987d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link NormalFormulaRepository#priceAdjoint(double, double, double, double, double,
   * PutCall)}.
   *
   * <ul>
   *   <li>When {@code PUT}.
   *   <li>Then return Derivatives toList first doubleValue is minus five.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#priceAdjoint(double, double, double,
   * double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, PutCall); when 'PUT'; then return Derivatives toList first doubleValue is minus five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives NormalFormulaRepository.priceAdjoint(double, double, double, double, double, PutCall)"
  })
  void testPriceAdjoint_whenPut_thenReturnDerivativesToListFirstDoubleValueIsMinusFive() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        NormalFormulaRepository.priceAdjoint(10.0d, 10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-5.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-5.0d, toListResult.get(0).doubleValue());
    assertEquals(12.615662610100802d, derivatives.max());
    assertEquals(12.615662610100802d, derivatives.sum());
    assertEquals(12.615662610100802d, toListResult.get(1).doubleValue());
    assertEquals(126.15662610100802d, actualPriceAdjointResult.getValue());
    assertEquals(5.0d, toListResult.get(2).doubleValue());
    assertArrayEquals(
        new double[] {-5.0d, 12.615662610100802d, 5.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link NormalFormulaRepository#priceAdjoint(double, double, double, double, double,
   * PutCall)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Derivatives min is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#priceAdjoint(double, double, double,
   * double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, PutCall); when zero; then return Derivatives min is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives NormalFormulaRepository.priceAdjoint(double, double, double, double, double, PutCall)"
  })
  void testPriceAdjoint_whenZero_thenReturnDerivativesMinIs00() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        NormalFormulaRepository.priceAdjoint(10.0d, 10.0d, 0.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-0.0d, toListResult.get(0).doubleValue());
    assertEquals(0.0d, actualPriceAdjointResult.getValue());
    assertEquals(0.0d, derivatives.max());
    assertEquals(0.0d, toListResult.get(2).doubleValue());
    assertArrayEquals(new double[] {-0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link NormalFormulaRepository#priceAdjoint(double, double, double, double, double,
   * PutCall)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Derivatives min is minus ten.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#priceAdjoint(double, double, double,
   * double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjoint(double, double, double, double, double, PutCall); when zero; then return Derivatives min is minus ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives NormalFormulaRepository.priceAdjoint(double, double, double, double, double, PutCall)"
  })
  void testPriceAdjoint_whenZero_thenReturnDerivativesMinIsMinusTen() {
    // Arrange and Act
    ValueDerivatives actualPriceAdjointResult =
        NormalFormulaRepository.priceAdjoint(1.0E-16d, 10.0d, 0.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointResult.getDerivatives();
    assertEquals(-10.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(3, toListResult.size());
    assertEquals(-10.0d, toListResult.get(0).doubleValue());
    assertEquals(10.0d, derivatives.max());
    assertEquals(10.0d, toListResult.get(2).doubleValue());
    assertEquals(100.0d, actualPriceAdjointResult.getValue());
    assertArrayEquals(new double[] {-10.0d, 0.0d, 10.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link NormalFormulaRepository#delta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return {@code -0.6240851829770753}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#delta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, PutCall); when '1.0E-16'; then return '-0.6240851829770753'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.delta(double, double, double, double, PutCall)"
  })
  void testDelta_when10e16_thenReturn06240851829770753() {
    // Arrange and Act
    double actualDeltaResult =
        NormalFormulaRepository.delta(1.0E-16d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(-0.6240851829770753d, actualDeltaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#delta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#delta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, PutCall); when '1.0E-16'; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.delta(double, double, double, double, PutCall)"
  })
  void testDelta_when10e16_thenReturnMinusOne() {
    // Arrange and Act
    double actualDeltaResult =
        NormalFormulaRepository.delta(1.0E-16d, 10.0d, 1.0E-16d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(-1.0d, actualDeltaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#delta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 0.2236067977499789}.
   *   <li>Then return {@code -0.9827740511602725}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#delta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, PutCall); when '0.2236067977499789'; then return '-0.9827740511602725'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.delta(double, double, double, double, PutCall)"
  })
  void testDelta_when02236067977499789_thenReturn09827740511602725() {
    // Arrange and Act
    double actualDeltaResult =
        NormalFormulaRepository.delta(1.0E-16d, 10.0d, 0.2236067977499789d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(-0.9827740511602725d, actualDeltaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#delta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#delta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, PutCall); when '-6.0136873569177505'; then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.delta(double, double, double, double, PutCall)"
  })
  void testDelta_when60136873569177505_thenReturn00() {
    // Arrange and Act
    double actualDeltaResult =
        NormalFormulaRepository.delta(10.0d, 10.0d, -6.0136873569177505d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(-0.0d, actualDeltaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#delta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@link PutCall#CALL}.
   *   <li>Then return {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#delta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test delta(double, double, double, double, PutCall); when CALL; then return '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.delta(double, double, double, double, PutCall)"
  })
  void testDelta_whenCall_thenReturn05() {
    // Arrange and Act
    double actualDeltaResult =
        NormalFormulaRepository.delta(10.0d, 10.0d, 10.0d, 10.0d, PutCall.CALL);

    // Assert
    assertEquals(0.5d, actualDeltaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#delta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code -0.9992172988709987}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#delta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, PutCall); when one; then return '-0.9992172988709987'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.delta(double, double, double, double, PutCall)"
  })
  void testDelta_whenOne_thenReturn09992172988709987() {
    // Arrange and Act
    double actualDeltaResult =
        NormalFormulaRepository.delta(1.0E-16d, 10.0d, 10.0d, 1.0d, PutCall.PUT);

    // Assert
    assertEquals(-0.9992172988709987d, actualDeltaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#delta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code PUT}.
   *   <li>Then return {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#delta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, PutCall); when 'PUT'; then return '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.delta(double, double, double, double, PutCall)"
  })
  void testDelta_whenPut_thenReturn05() {
    // Arrange and Act
    double actualDeltaResult =
        NormalFormulaRepository.delta(10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(-0.5d, actualDeltaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#delta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#delta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test delta(double, double, double, double, PutCall); when zero; then return '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.delta(double, double, double, double, PutCall)"
  })
  void testDelta_whenZero_thenReturn05() {
    // Arrange and Act
    double actualDeltaResult =
        NormalFormulaRepository.delta(10.0d, 10.0d, 0.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(-0.5d, actualDeltaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#delta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return minus one.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#delta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test delta(double, double, double, double, PutCall); when zero; then return minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.delta(double, double, double, double, PutCall)"
  })
  void testDelta_whenZero_thenReturnMinusOne() {
    // Arrange and Act
    double actualDeltaResult =
        NormalFormulaRepository.delta(1.0E-16d, 10.0d, 0.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(-1.0d, actualDeltaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#delta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#delta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test delta(double, double, double, double, PutCall); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.delta(double, double, double, double, PutCall)"
  })
  void testDelta_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualDeltaResult =
        NormalFormulaRepository.delta(10.0d, 1.0E-16d, 0.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualDeltaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#gamma(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code -0.252313252202016}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#gamma(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, PutCall); when '-0.5'; then return '-0.252313252202016'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.gamma(double, double, double, double, PutCall)"
  })
  void testGamma_when05_thenReturn0252313252202016() {
    // Arrange and Act
    double actualGammaResult =
        NormalFormulaRepository.gamma(10.0d, 10.0d, 10.0d, -0.5d, PutCall.PUT);

    // Assert
    assertEquals(-0.252313252202016d, actualGammaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#gamma(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#gamma(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, PutCall); when '1.0E-16'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.gamma(double, double, double, double, PutCall)"
  })
  void testGamma_when10e16_thenReturnZero() {
    // Arrange and Act
    double actualGammaResult =
        NormalFormulaRepository.gamma(1.0E-16d, 10.0d, 10.0d, -0.5d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualGammaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#gamma(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@link PutCall#CALL}.
   *   <li>Then return {@code 0.0126156626101008}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#gamma(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, PutCall); when CALL; then return '0.0126156626101008'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.gamma(double, double, double, double, PutCall)"
  })
  void testGamma_whenCall_thenReturn00126156626101008() {
    // Arrange and Act
    double actualGammaResult =
        NormalFormulaRepository.gamma(10.0d, 10.0d, 10.0d, 10.0d, PutCall.CALL);

    // Assert
    assertEquals(0.0126156626101008d, actualGammaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#gamma(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code PUT}.
   *   <li>Then return {@code 0.0126156626101008}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#gamma(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test gamma(double, double, double, double, PutCall); when 'PUT'; then return '0.0126156626101008'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.gamma(double, double, double, double, PutCall)"
  })
  void testGamma_whenPut_thenReturn00126156626101008() {
    // Arrange and Act
    double actualGammaResult =
        NormalFormulaRepository.gamma(10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0126156626101008d, actualGammaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#theta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code 0.03153915652525201}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#theta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, PutCall); when '-0.5'; then return '0.03153915652525201'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.theta(double, double, double, double, PutCall)"
  })
  void testTheta_when05_thenReturn003153915652525201() {
    // Arrange and Act
    double actualThetaResult =
        NormalFormulaRepository.theta(10.0d, 10.0d, 10.0d, -0.5d, PutCall.PUT);

    // Assert
    assertEquals(0.03153915652525201d, actualThetaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#theta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#theta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, PutCall); when '1.0E-16'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.theta(double, double, double, double, PutCall)"
  })
  void testTheta_when10e16_thenReturnZero() {
    // Arrange and Act
    double actualThetaResult =
        NormalFormulaRepository.theta(1.0E-16d, 10.0d, 10.0d, -0.5d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualThetaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#theta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@link PutCall#CALL}.
   *   <li>Then return {@code -0.63078313050504}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#theta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, PutCall); when CALL; then return '-0.63078313050504'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.theta(double, double, double, double, PutCall)"
  })
  void testTheta_whenCall_thenReturn063078313050504() {
    // Arrange and Act
    double actualThetaResult =
        NormalFormulaRepository.theta(10.0d, 10.0d, 10.0d, 10.0d, PutCall.CALL);

    // Assert
    assertEquals(-0.63078313050504d, actualThetaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#theta(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code PUT}.
   *   <li>Then return {@code -0.63078313050504}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#theta(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test theta(double, double, double, double, PutCall); when 'PUT'; then return '-0.63078313050504'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.theta(double, double, double, double, PutCall)"
  })
  void testTheta_whenPut_thenReturn063078313050504() {
    // Arrange and Act
    double actualThetaResult =
        NormalFormulaRepository.theta(10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(-0.63078313050504d, actualThetaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#vega(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code 1.2615662610100802}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#vega(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, PutCall); when '-0.5'; then return '1.2615662610100802'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.vega(double, double, double, double, PutCall)"
  })
  void testVega_when05_thenReturn12615662610100802() {
    // Arrange and Act
    double actualVegaResult = NormalFormulaRepository.vega(10.0d, 10.0d, 10.0d, -0.5d, PutCall.PUT);

    // Assert
    assertEquals(1.2615662610100802d, actualVegaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#vega(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#vega(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, PutCall); when '1.0E-16'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.vega(double, double, double, double, PutCall)"
  })
  void testVega_when10e16_thenReturnZero() {
    // Arrange and Act
    double actualVegaResult =
        NormalFormulaRepository.vega(1.0E-16d, 10.0d, 10.0d, -0.5d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualVegaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#vega(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@link PutCall#CALL}.
   *   <li>Then return {@code 1.2615662610100802}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#vega(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, PutCall); when CALL; then return '1.2615662610100802'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.vega(double, double, double, double, PutCall)"
  })
  void testVega_whenCall_thenReturn12615662610100802() {
    // Arrange and Act
    double actualVegaResult =
        NormalFormulaRepository.vega(10.0d, 10.0d, 10.0d, 10.0d, PutCall.CALL);

    // Assert
    assertEquals(1.2615662610100802d, actualVegaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#vega(double, double, double, double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code PUT}.
   *   <li>Then return {@code 1.2615662610100802}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#vega(double, double, double, double,
   * PutCall)}
   */
  @Test
  @DisplayName(
      "Test vega(double, double, double, double, PutCall); when 'PUT'; then return '1.2615662610100802'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.vega(double, double, double, double, PutCall)"
  })
  void testVega_whenPut_thenReturn12615662610100802() {
    // Arrange and Act
    double actualVegaResult = NormalFormulaRepository.vega(10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(1.2615662610100802d, actualVegaResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code -0.5}.
   *   <li>Then return {@code 0.572814530337436}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when '-0.5'; then return '0.572814530337436'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_when05_thenReturn0572814530337436() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            10.0d, -0.5d, 1.0E-10d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.572814530337436d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code 7.92665459521202E-12}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when '1.0E-10'; then return '7.92665459521202E-12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_when10e10_thenReturn792665459521202e12() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            1.0E-10d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(7.92665459521202E-12d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code 250662.82746310002}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when '1.0E-10'; then return '250662.82746310002'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_when10e10_thenReturn25066282746310002() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            10.0d, 10.0d, 10.0d, 1.0E-10d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(250662.82746310002d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code 3.3735702735575304}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when '1.0E-10'; then return '3.3735702735575304'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_when10e10_thenReturn33735702735575304() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            10.0d, 10.0d, 1.0E-10d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(3.3735702735575304d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return {@code 0.7926654594815685}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when '1.0E-16'; then return '0.7926654594815685'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_when10e16_thenReturn07926654594815685() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            10.0d, 1.0E-16d, 1.0E-10d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.7926654594815685d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when '1.0E-16'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_when10e16_thenReturnZero() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            1.0E-16d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-16}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when '1.0E-16'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_when10e16_thenReturnZero2() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            1.0E-10d, 1.0E-16d, 1.0E-10d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code -5.0E-11}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when '-5.0E-11'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_when50e11_thenReturnZero() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            -5.0E-11d, 10.0d, 10.0d, 0.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 9.99999E-10}.
   *   <li>Then return {@code 0.7926654591248694}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when '9.99999E-10'; then return '0.7926654591248694'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_when999999e10_thenReturn07926654591248694() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            10.0d, 1.0E-16d, 9.99999E-10d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.7926654591248694d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code -6.0136873569177505}.
   *   <li>Then return {@code 4.605126863643422}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when '-6.0136873569177505'; then return '4.605126863643422'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_when60136873569177505_thenReturn4605126863643422() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            10.0d, 10.0d, -6.0136873569177505d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(4.605126863643422d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code CALL}.
   *   <li>Then return {@code 0.7926654595212018}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when 'CALL'; then return '0.7926654595212018'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_whenCall_thenReturn07926654595212018() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, PutCall.CALL);

    // Assert
    assertEquals(0.7926654595212018d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@link Double#NaN}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when NaN; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_whenNaN_thenReturnZero() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            Double.NaN, Double.NaN, 10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code PUT}.
   *   <li>Then return {@code 0.7926654595212018}.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when 'PUT'; then return '0.7926654595212018'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_whenPut_thenReturn07926654595212018() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.7926654595212018d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatility(double, double, double, double, double,
   * double, PutCall)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link NormalFormulaRepository#impliedVolatility(double, double, double,
   * double, double, double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatility(double, double, double, double, double, double, PutCall); when zero; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatility(double, double, double, double, double, double, PutCall)"
  })
  void testImpliedVolatility_whenZero_thenReturnZero() {
    // Arrange and Act
    double actualImpliedVolatilityResult =
        NormalFormulaRepository.impliedVolatility(
            0.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualImpliedVolatilityResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatilityFromBlackApproximated(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>Then return {@code 4.5655114661169806E-12}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalFormulaRepository#impliedVolatilityFromBlackApproximated(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromBlackApproximated(double, double, double, double); then return '4.5655114661169806E-12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatilityFromBlackApproximated(double, double, double, double)"
  })
  void testImpliedVolatilityFromBlackApproximated_thenReturn45655114661169806e12() {
    // Arrange and Act
    double actualImpliedVolatilityFromBlackApproximatedResult =
        NormalFormulaRepository.impliedVolatilityFromBlackApproximated(
            1.0E-10d, 1.0E-10d, 10.0d, 10.0d);

    // Assert
    assertEquals(4.5655114661169806E-12d, actualImpliedVolatilityFromBlackApproximatedResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatilityFromBlackApproximated(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>Then return {@code 0.057265328899421576}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalFormulaRepository#impliedVolatilityFromBlackApproximated(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromBlackApproximated(double, double, double, double); then return '0.057265328899421576'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatilityFromBlackApproximated(double, double, double, double)"
  })
  void testImpliedVolatilityFromBlackApproximated_thenReturn0057265328899421576() {
    // Arrange and Act
    double actualImpliedVolatilityFromBlackApproximatedResult =
        NormalFormulaRepository.impliedVolatilityFromBlackApproximated(0.001d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.057265328899421576d, actualImpliedVolatilityFromBlackApproximatedResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatilityFromBlackApproximated(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When one.
   *   <li>Then return {@code 0.17996243083855556}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalFormulaRepository#impliedVolatilityFromBlackApproximated(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromBlackApproximated(double, double, double, double); when one; then return '0.17996243083855556'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatilityFromBlackApproximated(double, double, double, double)"
  })
  void testImpliedVolatilityFromBlackApproximated_whenOne_thenReturn017996243083855556() {
    // Arrange and Act
    double actualImpliedVolatilityFromBlackApproximatedResult =
        NormalFormulaRepository.impliedVolatilityFromBlackApproximated(1.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.17996243083855556d, actualImpliedVolatilityFromBlackApproximatedResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatilityFromBlackApproximated(double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@code 0.45655114661169804}.
   * </ul>
   *
   * <p>Method under test: {@link
   * NormalFormulaRepository#impliedVolatilityFromBlackApproximated(double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test impliedVolatilityFromBlackApproximated(double, double, double, double); when ten; then return '0.45655114661169804'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double NormalFormulaRepository.impliedVolatilityFromBlackApproximated(double, double, double, double)"
  })
  void testImpliedVolatilityFromBlackApproximated_whenTen_thenReturn045655114661169804() {
    // Arrange and Act
    double actualImpliedVolatilityFromBlackApproximatedResult =
        NormalFormulaRepository.impliedVolatilityFromBlackApproximated(10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    assertEquals(0.45655114661169804d, actualImpliedVolatilityFromBlackApproximatedResult);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatilityFromBlackApproximatedAdjoint(double,
   * double, double, double)}.
   *
   * <p>Method under test: {@link
   * NormalFormulaRepository#impliedVolatilityFromBlackApproximatedAdjoint(double, double, double,
   * double)}
   */
  @Test
  @DisplayName("Test impliedVolatilityFromBlackApproximatedAdjoint(double, double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives NormalFormulaRepository.impliedVolatilityFromBlackApproximatedAdjoint(double, double, double, double)"
  })
  void testImpliedVolatilityFromBlackApproximatedAdjoint() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityFromBlackApproximatedAdjointResult =
        NormalFormulaRepository.impliedVolatilityFromBlackApproximatedAdjoint(
            10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    DoubleArray derivatives =
        actualImpliedVolatilityFromBlackApproximatedAdjointResult.getDerivatives();
    assertEquals(-0.11876167572958157d, derivatives.max());
    assertEquals(-0.11876167572958157d, derivatives.min());
    assertEquals(-0.11876167572958157d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(-0.11876167572958157d, toListResult.get(0).doubleValue());
    assertEquals(
        0.45655114661169804d, actualImpliedVolatilityFromBlackApproximatedAdjointResult.getValue());
    assertArrayEquals(new double[] {-0.11876167572958157d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link NormalFormulaRepository#impliedVolatilityFromBlackApproximatedAdjoint(double,
   * double, double, double)}.
   *
   * <p>Method under test: {@link
   * NormalFormulaRepository#impliedVolatilityFromBlackApproximatedAdjoint(double, double, double,
   * double)}
   */
  @Test
  @DisplayName("Test impliedVolatilityFromBlackApproximatedAdjoint(double, double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives NormalFormulaRepository.impliedVolatilityFromBlackApproximatedAdjoint(double, double, double, double)"
  })
  void testImpliedVolatilityFromBlackApproximatedAdjoint2() {
    // Arrange and Act
    ValueDerivatives actualImpliedVolatilityFromBlackApproximatedAdjointResult =
        NormalFormulaRepository.impliedVolatilityFromBlackApproximatedAdjoint(
            0.001d, 10.0d, 10.0d, 10.0d);

    // Assert
    DoubleArray derivatives =
        actualImpliedVolatilityFromBlackApproximatedAdjointResult.getDerivatives();
    assertEquals(-0.016321024221453897d, derivatives.max());
    assertEquals(-0.016321024221453897d, derivatives.min());
    assertEquals(-0.016321024221453897d, derivatives.sum());
    List<Double> toListResult = derivatives.toList();
    assertEquals(1, toListResult.size());
    assertEquals(-0.016321024221453897d, toListResult.get(0).doubleValue());
    assertEquals(
        0.057265328899421576d,
        actualImpliedVolatilityFromBlackApproximatedAdjointResult.getValue());
    assertArrayEquals(new double[] {-0.016321024221453897d}, derivatives.toArrayUnsafe(), 0.0);
  }
}
