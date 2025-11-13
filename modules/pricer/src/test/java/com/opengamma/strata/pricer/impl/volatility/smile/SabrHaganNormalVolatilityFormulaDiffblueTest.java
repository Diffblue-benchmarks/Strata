package com.opengamma.strata.pricer.impl.volatility.smile;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ValueType;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrHaganNormalVolatilityFormulaDiffblueTest {
  /**
   * Test {@link SabrHaganNormalVolatilityFormula#getVolatilityType()}.
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#getVolatilityType()}
   */
  @Test
  @DisplayName("Test getVolatilityType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ValueType SabrHaganNormalVolatilityFormula.getVolatilityType()"})
  void testGetVolatilityType() {
    // Arrange, Act and Assert
    assertSame(
        ValueType.NORMAL_VOLATILITY, SabrHaganNormalVolatilityFormula.DEFAULT.getVolatilityType());
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatility(double, double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code -406.6416667713346}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double); when '1.0E-10'; then return '-406.6416667713346'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatility_when10e10_thenReturn4066416667713346() {
    // Arrange, Act and Assert
    assertEquals(
        -406.6416667713346d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatility(
            0.0d, 1.0E-10d, 10.0d, 10.0d, 0.0d, -0.9999899999999999d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatility(double, double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-10}.
   *   <li>Then return {@code -406.64166681199833}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double); when '1.0E-10'; then return '-406.64166681199833'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatility_when10e10_thenReturn40664166681199833() {
    // Arrange, Act and Assert
    assertEquals(
        -406.64166681199833d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatility(
            0.0d, 1.0E-10d, 10.0d, 10.0d, 0.0d, 0.9999899999999999d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatility(double, double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.99999}.
   *   <li>Then return {@code 3.5822732418318988E16}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double); when '0.99999'; then return '3.5822732418318988E16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatility_when099999_thenReturn35822732418318988e16() {
    // Arrange, Act and Assert
    assertEquals(
        3.5822732418318988E16d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatility(
            0.99999d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatility(double, double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.99999}.
   *   <li>Then return {@code 3.5822732418464864E16}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double); when '0.99999'; then return '3.5822732418464864E16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatility_when099999_thenReturn35822732418464864e16() {
    // Arrange, Act and Assert
    assertEquals(
        3.5822732418464864E16d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatility(
            10.0d, 0.99999d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatility(double, double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.9999899999999999}.
   *   <li>Then return {@code -406.64166679166647}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double); when '0.9999899999999999'; then return '-406.64166679166647'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatility_when09999899999999999_thenReturn40664166679166647() {
    // Arrange, Act and Assert
    assertEquals(
        -406.64166679166647d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatility(
            0.0d, 0.0d, 10.0d, 10.0d, 0.0d, 0.9999899999999999d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatility(double, double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.9999899999999999}.
   *   <li>Then return {@code -406.64166679166647}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double); when '-0.9999899999999999'; then return '-406.64166679166647'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatility_when09999899999999999_thenReturn406641666791666472() {
    // Arrange, Act and Assert
    assertEquals(
        -406.64166679166647d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatility(
            0.0d, 0.0d, 10.0d, 10.0d, 0.0d, -0.9999899999999999d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatility(double, double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 3.333333333333333E32}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double); when zero; then return '3.333333333333333E32'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatility_whenZero_thenReturn3333333333333333e32() {
    // Arrange, Act and Assert
    assertEquals(
        3.333333333333333E32d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatility(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityAdjoint(double, double, double, double,
   * double, double, double)}.
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityAdjoint(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName("Test volatilityAdjoint(double, double, double, double, double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjoint() {
    // Arrange and Act
    ValueDerivatives actualVolatilityAdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityAdjoint(
            0.99999d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(2.1539138420521958E12d, toListResult.get(4).doubleValue());
    assertEquals(3.5822732418318988E16d, actualVolatilityAdjointResult.getValue());
    assertEquals(4.5097362143042136E16d, toListResult.get(1).doubleValue());
    assertEquals(5.520684063798339E17d, derivatives.max());
    assertEquals(5.520684063798339E17d, toListResult.get(0).doubleValue());
    assertEquals(6517183.842074845d, derivatives.min());
    assertEquals(6517183.842074845d, toListResult.get(5).doubleValue());
    assertEquals(7.251581192382286E17d, derivatives.sum());
    assertArrayEquals(
        new double[] {
          5.520684063798339E17d,
          4.5097362143042136E16d,
          1.0746819718976362E16d,
          1.1724337707601706E17d,
          2.1539138420521958E12d,
          6517183.842074845d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityAdjoint(double, double, double, double,
   * double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.99999}.
   *   <li>Then return Derivatives min is {@code -4.546159875389375E11}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityAdjoint(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, double, double, double, double); when '0.99999'; then return Derivatives min is '-4.546159875389375E11'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjoint_when099999_thenReturnDerivativesMinIs4546159875389375e11() {
    // Arrange and Act
    ValueDerivatives actualVolatilityAdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityAdjoint(
            10.0d, 0.99999d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualVolatilityAdjointResult.getDerivatives();
    assertEquals(-4.546159875389375E11d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-4.546159875389375E11d, toListResult.get(4).doubleValue());
    assertEquals(3.5822732418464864E16d, actualVolatilityAdjointResult.getValue());
    assertEquals(4.509736214328508E16d, toListResult.get(0).doubleValue());
    assertEquals(5.5206840638280186E17d, derivatives.max());
    assertEquals(5.5206840638280186E17d, toListResult.get(1).doubleValue());
    assertEquals(6502595.276151104d, toListResult.get(5).doubleValue());
    assertEquals(7.251555107122991E17d, derivatives.sum());
    assertArrayEquals(
        new double[] {
          4.509736214328508E16d,
          5.5206840638280186E17d,
          1.0746819719034714E16d,
          1.1724337707666243E17d,
          -4.546159875389375E11d,
          6502595.276151104d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityAdjoint(double, double, double, double,
   * double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Derivatives min is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityAdjoint(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, double, double, double, double); when zero; then return Derivatives min is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjoint_whenZero_thenReturnDerivativesMinIs00() {
    // Arrange and Act
    ValueDerivatives actualVolatilityAdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityAdjoint(
            10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 0.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualVolatilityAdjointResult.getDerivatives();
    assertEquals(-0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(5, toListResult.size());
    assertEquals(-0.0d, toListResult.get(0).doubleValue());
    assertEquals(-0.0d, toListResult.get(3).doubleValue());
    assertEquals(0.0d, toListResult.get(1).doubleValue());
    assertEquals(166.66666666666663d, derivatives.max());
    assertEquals(166.66666666666663d, toListResult.get(4).doubleValue());
    assertEquals(250.99999999999994d, derivatives.sum());
    assertEquals(5, derivatives.size());
    assertEquals(843.3333333333331d, actualVolatilityAdjointResult.getValue());
    assertArrayEquals(
        new double[] {-0.0d, 0.0d, 84.33333333333331d, -0.0d, 166.66666666666663d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityAdjoint(double, double, double, double,
   * double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return Derivatives min is {@code 1.6666666666666665E12}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityAdjoint(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, double, double, double, double); when zero; then return Derivatives min is '1.6666666666666665E12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjoint_whenZero_thenReturnDerivativesMinIs16666666666666665e12() {
    // Arrange and Act
    ValueDerivatives actualVolatilityAdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityAdjoint(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualVolatilityAdjointResult.getDerivatives();
    assertEquals(1.6666666666666665E12d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(1.6666666666666665E12d, toListResult.get(5).doubleValue());
    assertEquals(2.3775850929940456E33d, derivatives.max());
    assertEquals(2.4999999999999996E23d, toListResult.get(4).doubleValue());
    assertEquals(3.333333333333333E32d, actualVolatilityAdjointResult.getValue());
    assertEquals(3.410918426577379E33d, derivatives.sum());
    assertEquals(4.666666666666667E32d, toListResult.get(0).doubleValue());
    assertEquals(4.666666666666667E32d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {
          4.666666666666667E32d,
          4.666666666666667E32d,
          9.999999999999999E31d,
          2.3775850929940456E33d,
          2.4999999999999996E23d,
          1.6666666666666665E12d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double, double, double,
   * double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 3.333333334583333E32}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBetaNonZero(double, double, double, double, double, double, double); when '0.5'; then return '3.333333334583333E32'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBetaNonZero(double, double, double, double, double, double, double)"
  })
  void testVolatilityBetaNonZero_when05_thenReturn3333333334583333e32() {
    // Arrange, Act and Assert
    assertEquals(
        3.333333334583333E32d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBetaNonZero(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 0.5d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double, double, double,
   * double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.99999}.
   *   <li>Then return {@code 3.5822732418318988E16}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBetaNonZero(double, double, double, double, double, double, double); when '0.99999'; then return '3.5822732418318988E16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBetaNonZero(double, double, double, double, double, double, double)"
  })
  void testVolatilityBetaNonZero_when099999_thenReturn35822732418318988e16() {
    // Arrange, Act and Assert
    assertEquals(
        3.5822732418318988E16d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBetaNonZero(
            0.99999d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double, double, double,
   * double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.99999}.
   *   <li>Then return {@code 3.5822732418464864E16}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBetaNonZero(double, double, double, double, double, double, double); when '0.99999'; then return '3.5822732418464864E16'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBetaNonZero(double, double, double, double, double, double, double)"
  })
  void testVolatilityBetaNonZero_when099999_thenReturn35822732418464864e16() {
    // Arrange, Act and Assert
    assertEquals(
        3.5822732418464864E16d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBetaNonZero(
            10.0d, 0.99999d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double, double, double,
   * double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.9999899999999999}.
   *   <li>Then return {@code -4.066416667916667E-98}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBetaNonZero(double, double, double, double, double, double, double); when '0.9999899999999999'; then return '-4.066416667916667E-98'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBetaNonZero(double, double, double, double, double, double, double)"
  })
  void testVolatilityBetaNonZero_when09999899999999999_thenReturn4066416667916667e98() {
    // Arrange, Act and Assert
    assertEquals(
        -4.066416667916667E-98d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBetaNonZero(
            1.0E-10d, 1.0E-10d, 10.0d, 10.0d, 10.0d, 0.9999899999999999d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double, double, double,
   * double, double, double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.9999899999999999}.
   *   <li>Then return {@code -4.066416667916667E-98}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBetaNonZero(double, double, double, double, double, double, double); when '-0.9999899999999999'; then return '-4.066416667916667E-98'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBetaNonZero(double, double, double, double, double, double, double)"
  })
  void testVolatilityBetaNonZero_when09999899999999999_thenReturn4066416667916667e982() {
    // Arrange, Act and Assert
    assertEquals(
        -4.066416667916667E-98d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBetaNonZero(
            1.0E-10d, 1.0E-10d, 10.0d, 10.0d, 10.0d, -0.9999899999999999d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double, double, double,
   * double, double, double, double)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then return {@code 3.333333333333333E32}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZero(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBetaNonZero(double, double, double, double, double, double, double); when zero; then return '3.333333333333333E32'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBetaNonZero(double, double, double, double, double, double, double)"
  })
  void testVolatilityBetaNonZero_whenZero_thenReturn3333333333333333e32() {
    // Arrange, Act and Assert
    assertEquals(
        3.333333333333333E32d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBetaNonZero(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZeroAdjoint(double, double,
   * double, double, double, double, double)}.
   *
   * <p>Method under test: {@link
   * SabrHaganNormalVolatilityFormula#volatilityBetaNonZeroAdjoint(double, double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBetaNonZeroAdjoint(double, double, double, double, double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.volatilityBetaNonZeroAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityBetaNonZeroAdjoint() {
    // Arrange and Act
    ValueDerivatives actualVolatilityBetaNonZeroAdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBetaNonZeroAdjoint(
            0.99999d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualVolatilityBetaNonZeroAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(2.1539138420521958E12d, toListResult.get(4).doubleValue());
    assertEquals(3.5822732418318988E16d, actualVolatilityBetaNonZeroAdjointResult.getValue());
    assertEquals(4.5097362143042136E16d, toListResult.get(1).doubleValue());
    assertEquals(5.520684063798339E17d, derivatives.max());
    assertEquals(5.520684063798339E17d, toListResult.get(0).doubleValue());
    assertEquals(6517183.842074845d, derivatives.min());
    assertEquals(6517183.842074845d, toListResult.get(5).doubleValue());
    assertEquals(7.251581192382286E17d, derivatives.sum());
    assertArrayEquals(
        new double[] {
          5.520684063798339E17d,
          4.5097362143042136E16d,
          1.0746819718976362E16d,
          1.1724337707601706E17d,
          2.1539138420521958E12d,
          6517183.842074845d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZeroAdjoint(double, double,
   * double, double, double, double, double)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code -4.546159875389375E11}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrHaganNormalVolatilityFormula#volatilityBetaNonZeroAdjoint(double, double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBetaNonZeroAdjoint(double, double, double, double, double, double, double); then return Derivatives min is '-4.546159875389375E11'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.volatilityBetaNonZeroAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityBetaNonZeroAdjoint_thenReturnDerivativesMinIs4546159875389375e11() {
    // Arrange and Act
    ValueDerivatives actualVolatilityBetaNonZeroAdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBetaNonZeroAdjoint(
            10.0d, 0.99999d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualVolatilityBetaNonZeroAdjointResult.getDerivatives();
    assertEquals(-4.546159875389375E11d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-4.546159875389375E11d, toListResult.get(4).doubleValue());
    assertEquals(3.5822732418464864E16d, actualVolatilityBetaNonZeroAdjointResult.getValue());
    assertEquals(4.509736214328508E16d, toListResult.get(0).doubleValue());
    assertEquals(5.5206840638280186E17d, derivatives.max());
    assertEquals(5.5206840638280186E17d, toListResult.get(1).doubleValue());
    assertEquals(6502595.276151104d, toListResult.get(5).doubleValue());
    assertEquals(7.251555107122991E17d, derivatives.sum());
    assertArrayEquals(
        new double[] {
          4.509736214328508E16d,
          5.5206840638280186E17d,
          1.0746819719034714E16d,
          1.1724337707666243E17d,
          -4.546159875389375E11d,
          6502595.276151104d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBetaNonZeroAdjoint(double, double,
   * double, double, double, double, double)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code 1.6666666666666665E12}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrHaganNormalVolatilityFormula#volatilityBetaNonZeroAdjoint(double, double, double, double,
   * double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBetaNonZeroAdjoint(double, double, double, double, double, double, double); then return Derivatives min is '1.6666666666666665E12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.volatilityBetaNonZeroAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityBetaNonZeroAdjoint_thenReturnDerivativesMinIs16666666666666665e12() {
    // Arrange and Act
    ValueDerivatives actualVolatilityBetaNonZeroAdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBetaNonZeroAdjoint(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualVolatilityBetaNonZeroAdjointResult.getDerivatives();
    assertEquals(1.6666666666666665E12d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(1.6666666666666665E12d, toListResult.get(5).doubleValue());
    assertEquals(2.3775850929940456E33d, derivatives.max());
    assertEquals(2.4999999999999996E23d, toListResult.get(4).doubleValue());
    assertEquals(3.333333333333333E32d, actualVolatilityBetaNonZeroAdjointResult.getValue());
    assertEquals(3.410918426577379E33d, derivatives.sum());
    assertEquals(4.666666666666667E32d, toListResult.get(0).doubleValue());
    assertEquals(4.666666666666667E32d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {
          4.666666666666667E32d,
          4.666666666666667E32d,
          9.999999999999999E31d,
          2.3775850929940456E33d,
          2.4999999999999996E23d,
          1.6666666666666665E12d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   *   <li>Then return {@code 530.8333333333335}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double,
   * double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBeta0(double, double, double, double, double, double); when '0.5'; then return '530.8333333333335'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBeta0(double, double, double, double, double, double)"
  })
  void testVolatilityBeta0_when05_thenReturn5308333333333335() {
    // Arrange, Act and Assert
    assertEquals(
        530.8333333333335d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBeta0(
            10.0d, 10.0d, 10.0d, 10.0d, 0.5d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-6}.
   *   <li>Then return {@code 843.3333333320834}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double,
   * double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBeta0(double, double, double, double, double, double); when '1.0E-6'; then return '843.3333333320834'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBeta0(double, double, double, double, double, double)"
  })
  void testVolatilityBeta0_when10e6_thenReturn8433333333320834() {
    // Arrange, Act and Assert
    assertEquals(
        843.3333333320834d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBeta0(
            10.0d, 10.0d, 10.0d, 10.0d, 1.0E-6d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.99999}.
   *   <li>Then return {@code 1353.8048518423093}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double,
   * double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBeta0(double, double, double, double, double, double); when '0.99999'; then return '1353.8048518423093'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBeta0(double, double, double, double, double, double)"
  })
  void testVolatilityBeta0_when099999_thenReturn13538048518423093() {
    // Arrange, Act and Assert
    assertEquals(
        1353.8048518423093d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBeta0(
            10.0d, 0.99999d, 10.0d, 10.0d, 0.5d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.99999}.
   *   <li>Then return {@code 1880.1333146929494}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double,
   * double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBeta0(double, double, double, double, double, double); when '0.99999'; then return '1880.1333146929494'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBeta0(double, double, double, double, double, double)"
  })
  void testVolatilityBeta0_when099999_thenReturn18801333146929494() {
    // Arrange, Act and Assert
    assertEquals(
        1880.1333146929494d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBeta0(
            0.99999d, 10.0d, 10.0d, 10.0d, 0.5d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.9999899999999999}.
   *   <li>Then return {@code -406.64166679166647}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double,
   * double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBeta0(double, double, double, double, double, double); when '0.9999899999999999'; then return '-406.64166679166647'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBeta0(double, double, double, double, double, double)"
  })
  void testVolatilityBeta0_when09999899999999999_thenReturn40664166679166647() {
    // Arrange, Act and Assert
    assertEquals(
        -406.64166679166647d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBeta0(
            10.0d, 10.0d, 10.0d, 10.0d, 0.9999899999999999d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double, double, double,
   * double, double)}.
   *
   * <ul>
   *   <li>When {@code -0.9999899999999999}.
   *   <li>Then return {@code -406.64166679166647}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBeta0(double, double,
   * double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBeta0(double, double, double, double, double, double); when '-0.9999899999999999'; then return '-406.64166679166647'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganNormalVolatilityFormula.volatilityBeta0(double, double, double, double, double, double)"
  })
  void testVolatilityBeta0_when09999899999999999_thenReturn406641666791666472() {
    // Arrange, Act and Assert
    assertEquals(
        -406.64166679166647d,
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBeta0(
            10.0d, 10.0d, 10.0d, 10.0d, -0.9999899999999999d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBeta0Adjoint(double, double, double,
   * double, double, double)}.
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBeta0Adjoint(double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName("Test volatilityBeta0Adjoint(double, double, double, double, double, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.volatilityBeta0Adjoint(double, double, double, double, double, double)"
  })
  void testVolatilityBeta0Adjoint() {
    // Arrange and Act
    ValueDerivatives actualVolatilityBeta0AdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBeta0Adjoint(
            10.0d, 10.0d, 10.0d, 10.0d, 0.9999899999999999d, 10.0d);

    // Assert
    DoubleArray derivatives = actualVolatilityBeta0AdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(5, toListResult.size());
    assertEquals(-203.31880018749925d, toListResult.get(1).doubleValue());
    assertEquals(-2499.975d, derivatives.min());
    assertEquals(-2499.975d, toListResult.get(3).doubleValue());
    assertEquals(-2623.9675000374996d, derivatives.sum());
    assertEquals(-406.64166679166647d, actualVolatilityBeta0AdjointResult.getValue());
    assertEquals(-83.3283333583333d, toListResult.get(4).doubleValue());
    assertEquals(203.31880018749925d, derivatives.max());
    assertEquals(203.31880018749925d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {
          203.31880018749925d,
          -203.31880018749925d,
          -40.66416667916665d,
          -2499.975d,
          -83.3283333583333d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBeta0Adjoint(double, double, double,
   * double, double, double)}.
   *
   * <ul>
   *   <li>Then return Derivatives min is {@code -10051.015517701242}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBeta0Adjoint(double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBeta0Adjoint(double, double, double, double, double, double); then return Derivatives min is '-10051.015517701242'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.volatilityBeta0Adjoint(double, double, double, double, double, double)"
  })
  void testVolatilityBeta0Adjoint_thenReturnDerivativesMinIs10051015517701242() {
    // Arrange and Act
    ValueDerivatives actualVolatilityBeta0AdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBeta0Adjoint(
            0.99999d, 10.0d, 10.0d, 10.0d, 0.9999899999999999d, 10.0d);

    // Assert
    DoubleArray derivatives = actualVolatilityBeta0AdjointResult.getDerivatives();
    assertEquals(-10051.015517701242d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(5, toListResult.size());
    assertEquals(-10051.015517701242d, toListResult.get(3).doubleValue());
    assertEquals(-10535.658320154547d, derivatives.sum());
    assertEquals(-107.57444027779093d, toListResult.get(1).doubleValue());
    assertEquals(-1589.4183674705594d, actualVolatilityBeta0AdjointResult.getValue());
    assertEquals(-422.5180695307015d, toListResult.get(4).doubleValue());
    assertEquals(107.57444027779093d, derivatives.max());
    assertEquals(107.57444027779093d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {
          107.57444027779093d,
          -107.57444027779093d,
          -62.12473292260381d,
          -10051.015517701242d,
          -422.5180695307015d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#volatilityBeta0Adjoint(double, double, double,
   * double, double, double)}.
   *
   * <ul>
   *   <li>When {@code 0.99999}.
   *   <li>Then return Value is {@code -256.1880768937323}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#volatilityBeta0Adjoint(double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityBeta0Adjoint(double, double, double, double, double, double); when '0.99999'; then return Value is '-256.1880768937323'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.volatilityBeta0Adjoint(double, double, double, double, double, double)"
  })
  void testVolatilityBeta0Adjoint_when099999_thenReturnValueIs2561880768937323() {
    // Arrange and Act
    ValueDerivatives actualVolatilityBeta0AdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.volatilityBeta0Adjoint(
            10.0d, 0.99999d, 10.0d, 10.0d, 0.9999899999999999d, 10.0d);

    // Assert
    assertEquals(-256.1880768937323d, actualVolatilityBeta0AdjointResult.getValue());
    DoubleArray derivatives = actualVolatilityBeta0AdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(5, toListResult.size());
    assertEquals(-26.22363953619446d, toListResult.get(0).doubleValue());
    assertEquals(-76.09893600651962d, derivatives.min());
    assertEquals(-76.09893600651962d, toListResult.get(4).doubleValue());
    assertEquals(1791685.8277559478d, derivatives.sum());
    assertEquals(1791763.9441978375d, derivatives.max());
    assertEquals(1791763.9441978375d, toListResult.get(3).doubleValue());
    assertEquals(26.22363953619446d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {
          -26.22363953619446d,
          26.22363953619446d,
          -2.0175058831586767d,
          1791763.9441978375d,
          -76.09893600651962d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#zetaOverXhat(double, double)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-6}.
   *   <li>Then return {@code 0.999995}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#zetaOverXhat(double, double)}
   */
  @Test
  @DisplayName("Test zetaOverXhat(double, double); when '1.0E-6'; then return '0.999995'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrHaganNormalVolatilityFormula.zetaOverXhat(double, double)"})
  void testZetaOverXhat_when10e6_thenReturn0999995() {
    // Arrange, Act and Assert
    assertEquals(0.999995d, SabrHaganNormalVolatilityFormula.DEFAULT.zetaOverXhat(1.0E-6d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#zetaOverXhat(double, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-6}.
   *   <li>Then return {@code 1.000005}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#zetaOverXhat(double, double)}
   */
  @Test
  @DisplayName("Test zetaOverXhat(double, double); when '-1.0E-6'; then return '1.000005'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrHaganNormalVolatilityFormula.zetaOverXhat(double, double)"})
  void testZetaOverXhat_when10e6_thenReturn1000005() {
    // Arrange, Act and Assert
    assertEquals(1.000005d, SabrHaganNormalVolatilityFormula.DEFAULT.zetaOverXhat(-1.0E-6d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#zetaOverXhat(double, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0000000000000002E-6}.
   *   <li>Then return {@code 1.000004999935252}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#zetaOverXhat(double, double)}
   */
  @Test
  @DisplayName(
      "Test zetaOverXhat(double, double); when '-1.0000000000000002E-6'; then return '1.000004999935252'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrHaganNormalVolatilityFormula.zetaOverXhat(double, double)"})
  void testZetaOverXhat_when10000000000000002e6_thenReturn1000004999935252() {
    // Arrange, Act and Assert
    assertEquals(
        1.000004999935252d,
        SabrHaganNormalVolatilityFormula.DEFAULT.zetaOverXhat(-1.0000000000000002E-6d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#zetaOverXhat(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#zetaOverXhat(double, double)}
   */
  @Test
  @DisplayName("Test zetaOverXhat(double, double); when ten; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrHaganNormalVolatilityFormula.zetaOverXhat(double, double)"})
  void testZetaOverXhat_whenTen_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(Double.NaN, SabrHaganNormalVolatilityFormula.DEFAULT.zetaOverXhat(10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#zetaOverXhatAdjoint(double, double)}.
   *
   * <ul>
   *   <li>Then return Derivatives sum is {@code -4.999989748599972}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#zetaOverXhatAdjoint(double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test zetaOverXhatAdjoint(double, double); then return Derivatives sum is '-4.999989748599972'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.zetaOverXhatAdjoint(double, double)"
  })
  void testZetaOverXhatAdjoint_thenReturnDerivativesSumIs4999989748599972() {
    // Arrange and Act
    ValueDerivatives actualZetaOverXhatAdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.zetaOverXhatAdjoint(
            -1.0000000000000002E-6d, 10.0d);

    // Assert
    DoubleArray derivatives = actualZetaOverXhatAdjointResult.getDerivatives();
    assertEquals(-4.999989748599972d, derivatives.sum());
    assertEquals(-4.9999902485869825d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(-4.9999902485869825d, toListResult.get(0).doubleValue());
    assertEquals(1.000004999935252d, actualZetaOverXhatAdjointResult.getValue());
    assertEquals(4.999870108213234E-7d, derivatives.max());
    assertEquals(4.999870108213234E-7d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {-4.9999902485869825d, 4.999870108213234E-7d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#zetaOverXhatAdjoint(double, double)}.
   *
   * <ul>
   *   <li>When {@code -1.0E-6}.
   *   <li>Then return Derivatives sum is {@code -4.9999995}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#zetaOverXhatAdjoint(double,
   * double)}
   */
  @Test
  @DisplayName(
      "Test zetaOverXhatAdjoint(double, double); when '-1.0E-6'; then return Derivatives sum is '-4.9999995'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.zetaOverXhatAdjoint(double, double)"
  })
  void testZetaOverXhatAdjoint_when10e6_thenReturnDerivativesSumIs49999995() {
    // Arrange and Act
    ValueDerivatives actualZetaOverXhatAdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.zetaOverXhatAdjoint(-1.0E-6d, 10.0d);

    // Assert
    DoubleArray derivatives = actualZetaOverXhatAdjointResult.getDerivatives();
    assertEquals(-4.9999995d, derivatives.sum());
    assertEquals(-5.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(-5.0d, toListResult.get(0).doubleValue());
    assertEquals(1.000005d, actualZetaOverXhatAdjointResult.getValue());
    assertEquals(5.0E-7d, derivatives.max());
    assertEquals(5.0E-7d, toListResult.get(1).doubleValue());
    assertArrayEquals(new double[] {-5.0d, 5.0E-7d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrHaganNormalVolatilityFormula#zetaOverXhatAdjoint(double, double)}.
   *
   * <ul>
   *   <li>When ten.
   *   <li>Then return Value is {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganNormalVolatilityFormula#zetaOverXhatAdjoint(double,
   * double)}
   */
  @Test
  @DisplayName("Test zetaOverXhatAdjoint(double, double); when ten; then return Value is NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganNormalVolatilityFormula.zetaOverXhatAdjoint(double, double)"
  })
  void testZetaOverXhatAdjoint_whenTen_thenReturnValueIsNaN() {
    // Arrange and Act
    ValueDerivatives actualZetaOverXhatAdjointResult =
        SabrHaganNormalVolatilityFormula.DEFAULT.zetaOverXhatAdjoint(10.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualZetaOverXhatAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(2, toListResult.size());
    assertEquals(Double.NaN, actualZetaOverXhatAdjointResult.getValue());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertArrayEquals(new double[] {Double.NaN, Double.NaN}, derivatives.toArrayUnsafe(), 0.0);
  }
}
