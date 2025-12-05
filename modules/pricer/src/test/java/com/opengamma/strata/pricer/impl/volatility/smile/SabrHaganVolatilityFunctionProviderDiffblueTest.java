package com.opengamma.strata.pricer.impl.volatility.smile;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.market.ValueType;
import java.util.List;
import org.joda.beans.TypedMetaBean;
import org.joda.beans.impl.light.LightMetaBean;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrHaganVolatilityFunctionProviderDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SabrHaganVolatilityFunctionProvider#toString()}
   *   <li>{@link SabrHaganVolatilityFunctionProvider#getVolatilityType()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueType SabrHaganVolatilityFunctionProvider.getVolatilityType()",
    "String SabrHaganVolatilityFunctionProvider.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    SabrHaganVolatilityFunctionProvider sabrHaganVolatilityFunctionProvider =
        SabrHaganVolatilityFunctionProvider.DEFAULT;

    // Act
    String actualToStringResult = sabrHaganVolatilityFunctionProvider.toString();

    // Assert
    assertEquals("SABR (Hagan)", actualToStringResult);
    assertSame(ValueType.BLACK_VOLATILITY, sabrHaganVolatilityFunctionProvider.getVolatilityType());
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble() {
    // Arrange, Act and Assert
    assertEquals(
        3.375000025E31d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble2() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0E-10d, 0.0d, 0.0d, 0.0d, -1.0000000000000002E-8d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble3() {
    // Arrange, Act and Assert
    assertEquals(
        8.192040033488044E35d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            24.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble4() {
    // Arrange, Act and Assert
    assertEquals(
        9.283960124042574E15d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0d, 10.0d, 10.0d, 10.0d, 10.0d, -1.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble5() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
                10.0d, 1.0E-12d, 10.0d, 10.0d, 10.0d, 1.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 1.0E-6}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'; then return '1.0E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble_thenReturn10e6() {
    // Arrange, Act and Assert
    assertEquals(
        1.0E-6d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 1.0E-6}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'; then return '1.0E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble_thenReturn10e62() {
    // Arrange, Act and Assert
    assertEquals(
        1.0E-6d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0E-12d, 10.0d, 10.0d, 10.0d, 1.0E-12d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 1.0E-6}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'; then return '1.0E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble_thenReturn10e63() {
    // Arrange, Act and Assert
    assertEquals(
        1.0E-6d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0E-12d, 10.0d, 10.0d, 10.0d, 1.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return {@code 1.0E-6}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'; then return '1.0E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble_thenReturn10e64() {
    // Arrange, Act and Assert
    assertEquals(
        1.0E-6d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0E-12d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble_thenReturnNaN() {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0E-12d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'; then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble_thenReturnNaN2() {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            10.0d, 1.0E-12d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble_thenReturnZero() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0E-10d, 0.0d, 0.0d, 0.0d, -1.0E-8d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When {@code 0.5}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'; when '0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble_when05() {
    // Arrange, Act and Assert
    assertEquals(
        Double.NaN,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0d, 0.5d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When {@code 1.0E-7}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'; when '1.0E-7'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble_when10e7() {
    // Arrange, Act and Assert
    assertEquals(
        1.0E-6d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0E-12d, 10.0d, 10.0d, 10.0d, 1.0E-7d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When {@code 1.0E-8}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'; when '1.0E-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble_when10e8() {
    // Arrange, Act and Assert
    assertEquals(
        0.0d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0E-10d, 0.0d, 0.0d, 0.0d, 1.0E-8d, 10.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double, double,
   * double, double, double)} with {@code double}, {@code double}, {@code double}, {@code double},
   * {@code double}, {@code double}, {@code double}.
   *
   * <ul>
   *   <li>When minus one.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'; when minus one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, double, double, double, double)"
  })
  void testVolatilityWithDoubleDoubleDoubleDoubleDoubleDoubleDouble_whenMinusOne() {
    // Arrange, Act and Assert
    assertEquals(
        1.0E-6d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(
            1.0E-12d, 10.0d, 10.0d, 10.0d, 10.0d, -1.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(
        3.3749999974999998E31d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(10.0d, 10.0d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData2() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(
        9.283960124042574E15d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(1.0d, 10.0d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData3() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 1.0E-12d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(
        1.2471745605430739E14d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(1.0E-12d, 10.0d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData4() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 1.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(
        1.0E-6d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(1.0E-12d, 10.0d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData5() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 1.0E-7d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(
        2.8862788463575396E16d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(1.0E-12d, 10.0d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData6() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, 1.0d, 10.0d);

    // Act and Assert
    assertEquals(
        1.0E-6d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(1.0E-12d, 10.0d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData7() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(
        9.284515633827606E15d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(1.0d, 10.0d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData8() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(
        1.0855530060222094E-4d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(10.0d, 1.0E-12d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData9() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, 1.0d, 10.0d);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(10.0d, 1.0E-12d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <ul>
   *   <li>Then return {@code 1.0E-6}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'; then return '1.0E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData_thenReturn10e6() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(
        1.0E-6d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(1.0E-12d, 10.0d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <ul>
   *   <li>Then return {@code 1.0E-6}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'; then return '1.0E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData_thenReturn10e62() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(
        1.0E-6d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(10.0d, 1.0E-12d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <ul>
   *   <li>Then return {@code 8.19204003295681E35}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'; then return '8.19204003295681E35'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData_thenReturn819204003295681e35() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(
        8.19204003295681E35d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(24.0d, 10.0d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <ul>
   *   <li>Then return {@code 7.784573671251273E-5}.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'; then return '7.784573671251273E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData_thenReturn7784573671251273e5() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(
        7.784573671251273E-5d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(1.0E-12d, 10.0d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatility(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatility(double, double,
   * double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatility(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatility(double, double, double, SabrFormulaData)"
  })
  void testVolatilityWithDoubleDoubleDoubleSabrFormulaData_thenReturnZero() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(0.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    assertEquals(
        0.0d, SabrHaganVolatilityFunctionProvider.DEFAULT.volatility(10.0d, 10.0d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * double, double, double, double)} with {@code double}, {@code double}, {@code double}, {@code
   * double}, {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleDoubleDoubleDoubleDouble() {
    // Arrange and Act
    ValueDerivatives actualVolatilityAdjointResult =
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatilityAdjoint(
            10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualVolatilityAdjointResult.getDerivatives();
    assertEquals(2.406367418419397E32d, derivatives.max());
    assertEquals(2.4999999974999996E22d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(2.4999999974999996E22d, toListResult.get(4).doubleValue());
    assertEquals(2.499999997516666E22d, toListResult.get(5).doubleValue());
    assertEquals(3.3750000250000005E31d, actualVolatilityAdjointResult.getValue());
    assertEquals(3.418867423919397E32d, derivatives.sum());
    assertEquals(4.556250020812501E31d, toListResult.get(0).doubleValue());
    assertEquals(4.5562500241875E31d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {
          4.556250020812501E31d,
          4.5562500241875E31d,
          1.0125000049999999E31d,
          2.406367418419397E32d,
          2.4999999974999996E22d,
          2.499999997516666E22d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * double, double, double, double)} with {@code double}, {@code double}, {@code double}, {@code
   * double}, {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleDoubleDoubleDoubleDouble2() {
    // Arrange, Act and Assert
    DoubleArray derivatives =
        SabrHaganVolatilityFunctionProvider.DEFAULT
            .volatilityAdjoint(1.0E-12d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d)
            .getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-0.0d, toListResult.get(4).doubleValue());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(5).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, -0.0d, Double.NaN},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * double, double, double, double)} with {@code double}, {@code double}, {@code double}, {@code
   * double}, {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleDoubleDoubleDoubleDouble3() {
    // Arrange, Act and Assert
    DoubleArray derivatives =
        SabrHaganVolatilityFunctionProvider.DEFAULT
            .volatilityAdjoint(1.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d)
            .getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(Double.NEGATIVE_INFINITY, toListResult.get(5).doubleValue());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(0).doubleValue());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(4).doubleValue());
    assertArrayEquals(
        new double[] {
          Double.POSITIVE_INFINITY,
          Double.NaN,
          Double.POSITIVE_INFINITY,
          Double.POSITIVE_INFINITY,
          Double.POSITIVE_INFINITY,
          Double.NEGATIVE_INFINITY
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * double, double, double, double)} with {@code double}, {@code double}, {@code double}, {@code
   * double}, {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleDoubleDoubleDoubleDouble4() {
    // Arrange and Act
    ValueDerivatives actualVolatilityAdjointResult =
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatilityAdjoint(
            10.0d, 1.0E-12d, 10.0d, 10.0d, 10.0d, 10.0d, 10.0d);

    // Assert
    DoubleArray derivatives = actualVolatilityAdjointResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(Double.NaN, actualVolatilityAdjointResult.getValue());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(4).doubleValue());
    assertEquals(Double.NaN, toListResult.get(5).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN, Double.NaN},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * double, double, double, double)} with {@code double}, {@code double}, {@code double}, {@code
   * double}, {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleDoubleDoubleDoubleDouble5() {
    // Arrange, Act and Assert
    DoubleArray derivatives =
        SabrHaganVolatilityFunctionProvider.DEFAULT
            .volatilityAdjoint(10.0d, 10.0d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d)
            .getDerivatives();
    assertEquals(-1.2415666666666668E13d, derivatives.min());
    assertEquals(-1.2415666666666668E13d, derivatives.sum());
    assertEquals(0.0d, derivatives.max());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, -1.2415666666666668E13d, 0.0d, 0.0d, 0.0d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * double, double, double, double)} with {@code double}, {@code double}, {@code double}, {@code
   * double}, {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleDoubleDoubleDoubleDouble6() {
    // Arrange, Act and Assert
    DoubleArray derivatives =
        SabrHaganVolatilityFunctionProvider.DEFAULT
            .volatilityAdjoint(1.0E-12d, 10.0d, 10.0d, 0.0d, 10.0d, 10.0d, 10.0d)
            .getDerivatives();
    assertEquals(0.0d, derivatives.min());
    assertEquals(1.0E7d, derivatives.max());
    assertEquals(1.0E7d, derivatives.sum());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0E7d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * double, double, double, double)} with {@code double}, {@code double}, {@code double}, {@code
   * double}, {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleDoubleDoubleDoubleDouble7() {
    // Arrange, Act and Assert
    DoubleArray derivatives =
        SabrHaganVolatilityFunctionProvider.DEFAULT
            .volatilityAdjoint(1.0E-12d, 10.0d, 10.0d, 10.0d, 10.0d, 1.0d, 10.0d)
            .getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-1.1481515425139608E-5d, toListResult.get(5).doubleValue());
    assertEquals(-2.3229159966409586E-4d, toListResult.get(4).doubleValue());
    assertEquals(-5239977.466670359d, derivatives.min());
    assertEquals(-5239977.466670359d, toListResult.get(0).doubleValue());
    assertEquals(-5239977.4668930825d, derivatives.sum());
    assertEquals(2.0847002770708453E-5d, derivatives.max());
    assertEquals(2.3446949042032195E-7d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {
          -5239977.466670359d,
          2.3446949042032195E-7d,
          -3.216980624963526E-8d,
          2.0847002770708453E-5d,
          -2.3229159966409586E-4d,
          -1.1481515425139608E-5d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * double, double, double, double)} with {@code double}, {@code double}, {@code double}, {@code
   * double}, {@code double}, {@code double}, {@code double}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, double, double, double, double)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, double, double, double, double) with 'double', 'double', 'double', 'double', 'double', 'double', 'double'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, double, double, double, double)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleDoubleDoubleDoubleDouble8() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            SabrHaganVolatilityFunctionProvider.DEFAULT.volatilityAdjoint(
                10.0d, 1.0E-12d, 10.0d, 10.0d, 10.0d, 1.0d, 10.0d));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, SabrFormulaData)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleSabrFormulaData() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    ValueDerivatives actualVolatilityAdjointResult =
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatilityAdjoint(10.0d, 10.0d, 10.0d, data);

    // Assert
    DoubleArray derivatives = actualVolatilityAdjointResult.getDerivatives();
    assertEquals(-2.500000000083333E21d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-2.500000000083333E21d, toListResult.get(5).doubleValue());
    assertEquals(2.406367405480179E32d, derivatives.max());
    assertEquals(2.5000000002499996E22d, toListResult.get(4).doubleValue());
    assertEquals(3.3749999975E31d, actualVolatilityAdjointResult.getValue());
    assertEquals(3.41886740520518E32d, derivatives.sum());
    assertEquals(4.5562499975812495E31d, toListResult.get(1).doubleValue());
    assertEquals(4.556249997918749E31d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {
          4.556249997918749E31d,
          4.5562499975812495E31d,
          1.0124999995E31d,
          2.406367405480179E32d,
          2.5000000002499996E22d,
          -2.500000000083333E21d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, SabrFormulaData)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleSabrFormulaData2() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    DoubleArray derivatives =
        SabrHaganVolatilityFunctionProvider.DEFAULT
            .volatilityAdjoint(1.0E-12d, 10.0d, 10.0d, data)
            .getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(5).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN, Double.NaN, 0.0d, Double.NaN},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, SabrFormulaData)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleSabrFormulaData3() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    ValueDerivatives actualVolatilityAdjointResult =
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatilityAdjoint(1.0d, 10.0d, 10.0d, data);

    // Assert
    DoubleArray derivatives = actualVolatilityAdjointResult.getDerivatives();
    assertEquals(-5.554976712225234E10d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-5.554976712225234E10d, toListResult.get(5).doubleValue());
    assertEquals(1.1060349878252086E16d, toListResult.get(1).doubleValue());
    assertEquals(1.40068424045620256E17d, derivatives.max());
    assertEquals(1.40068424045620256E17d, toListResult.get(0).doubleValue());
    assertEquals(1.84274791367055872E17d, derivatives.sum());
    assertEquals(5.555145396132197E11d, toListResult.get(4).doubleValue());
    assertEquals(9.283960124042578E15d, actualVolatilityAdjointResult.getValue());
    assertArrayEquals(
        new double[] {
          1.40068424045620256E17d,
          1.1060349878252086E16d,
          2.7852435869793455E15d,
          3.036027389143168E16d,
          5.555145396132197E11d,
          -5.554976712225234E10d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, SabrFormulaData)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleSabrFormulaData4() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    DoubleArray derivatives =
        SabrHaganVolatilityFunctionProvider.DEFAULT
            .volatilityAdjoint(10.0d, 1.0E-12d, 10.0d, data)
            .getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-1.6064952144220188E-5d, toListResult.get(5).doubleValue());
    assertEquals(-571539.3464525124d, derivatives.sum());
    assertEquals(-571539.34678431d, derivatives.min());
    assertEquals(-571539.34678431d, toListResult.get(1).doubleValue());
    assertEquals(3.2389016419798764E-4d, derivatives.max());
    assertEquals(3.2389016419798764E-4d, toListResult.get(4).doubleValue());
    assertEquals(5.715393467843099E-7d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {
          5.715393467843099E-7d,
          -571539.34678431d,
          0.0d,
          2.3400921219113192E-5d,
          3.2389016419798764E-4d,
          -1.6064952144220188E-5d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, SabrFormulaData)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleSabrFormulaData5() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(0.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    DoubleArray derivatives =
        SabrHaganVolatilityFunctionProvider.DEFAULT
            .volatilityAdjoint(10.0d, 10.0d, 10.0d, data)
            .getDerivatives();
    assertEquals(-4.066666666666667E10d, derivatives.min());
    assertEquals(-4.066666666666667E10d, derivatives.sum());
    assertEquals(0.0d, derivatives.max());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, -4.066666666666667E10d, 0.0d, 0.0d, 0.0d},
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, SabrFormulaData)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleSabrFormulaData6() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(0.0d, 10.0d, -1.0d, 10.0d);

    // Act and Assert
    DoubleArray derivatives =
        SabrHaganVolatilityFunctionProvider.DEFAULT
            .volatilityAdjoint(1.0E-12d, 10.0d, 10.0d, data)
            .getDerivatives();
    assertEquals(0.0d, derivatives.min());
    assertEquals(1.0E7d, derivatives.max());
    assertEquals(1.0E7d, derivatives.sum());
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 1.0E7d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, SabrFormulaData)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleSabrFormulaData7() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, 1.0d, 10.0d);

    // Act and Assert
    DoubleArray derivatives =
        SabrHaganVolatilityFunctionProvider.DEFAULT
            .volatilityAdjoint(1.0E-12d, 10.0d, 10.0d, data)
            .getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(6, toListResult.size());
    assertEquals(-1.1481515425139608E-5d, toListResult.get(5).doubleValue());
    assertEquals(-2.3229159966409586E-4d, toListResult.get(4).doubleValue());
    assertEquals(-5239977.466670359d, derivatives.min());
    assertEquals(-5239977.466670359d, toListResult.get(0).doubleValue());
    assertEquals(-5239977.4668930825d, derivatives.sum());
    assertEquals(2.0847002770708453E-5d, derivatives.max());
    assertEquals(2.3446949042032195E-7d, toListResult.get(1).doubleValue());
    assertArrayEquals(
        new double[] {
          -5239977.466670359d,
          2.3446949042032195E-7d,
          -3.216980624963526E-8d,
          2.0847002770708453E-5d,
          -2.3229159966409586E-4d,
          -1.1481515425139608E-5d
        },
        derivatives.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double, double, double,
   * SabrFormulaData)} with {@code double}, {@code double}, {@code double}, {@code SabrFormulaData}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint(double,
   * double, double, SabrFormulaData)}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint(double, double, double, SabrFormulaData) with 'double', 'double', 'double', 'SabrFormulaData'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrHaganVolatilityFunctionProvider.volatilityAdjoint(double, double, double, SabrFormulaData)"
  })
  void testVolatilityAdjointWithDoubleDoubleDoubleSabrFormulaData8() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, 1.0d, 10.0d);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            SabrHaganVolatilityFunctionProvider.DEFAULT.volatilityAdjoint(
                10.0d, 1.0E-12d, 10.0d, data));
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint2(double, double, double,
   * SabrFormulaData, double[], double[][])} with {@code double}, {@code double}, {@code double},
   * {@code SabrFormulaData}, {@code double[]}, {@code double[][]}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint2(double,
   * double, double, SabrFormulaData, double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint2(double, double, double, SabrFormulaData, double[], double[][]) with 'double', 'double', 'double', 'SabrFormulaData', 'double[]', 'double[][]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatilityAdjoint2(double, double, double, SabrFormulaData, double[], double[][])"
  })
  void testVolatilityAdjoint2WithDoubleDoubleDoubleSabrFormulaDataDoubleDouble() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    double[] volatilityD =
        new double[] {
          10.0d, -1000000.0d, 10.0d, -1000000.0d, 10.0d, -1000000.0d, 10.0d, -1000000.0d
        };
    double[][] volatilityD2 =
        new double[][] {
          new double[] {10.0d, -1000000.0d, 10.0d, -1000000.0d},
          new double[] {10.0d, -1000000.0d, 10.0d, -1000000.0d}
        };

    // Act
    double actualVolatilityAdjoint2Result =
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatilityAdjoint2(
            10.0d, 10.0d, 10.0d, data, volatilityD, volatilityD2);

    // Assert
    assertEquals(2, volatilityD2.length);
    assertEquals(3.3749999975E31d, actualVolatilityAdjoint2Result);
    assertArrayEquals(
        new double[] {5.467499998655626E31d, 6.37874999780625E31d, 10.0d, -1000000.0d},
        volatilityD2[0],
        0.0);
    assertArrayEquals(
        new double[] {6.37874999780625E31d, 5.467499998081876E31d, 10.0d, -1000000.0d},
        volatilityD2[1],
        0.0);
    assertArrayEquals(
        new double[] {
          4.55624999791875E31d,
          4.55624999758125E31d,
          1.0124999994999998E31d,
          2.4063674054801793E32d,
          2.5000000002499996E22d,
          -2.500000000083333E21d,
          10.0d,
          -1000000.0d
        },
        volatilityD,
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint2(double, double, double,
   * SabrFormulaData, double[], double[][])} with {@code double}, {@code double}, {@code double},
   * {@code SabrFormulaData}, {@code double[]}, {@code double[][]}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#volatilityAdjoint2(double,
   * double, double, SabrFormulaData, double[], double[][])}
   */
  @Test
  @DisplayName(
      "Test volatilityAdjoint2(double, double, double, SabrFormulaData, double[], double[][]) with 'double', 'double', 'double', 'SabrFormulaData', 'double[]', 'double[][]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrHaganVolatilityFunctionProvider.volatilityAdjoint2(double, double, double, SabrFormulaData, double[], double[][])"
  })
  void testVolatilityAdjoint2WithDoubleDoubleDoubleSabrFormulaDataDoubleDouble2() {
    // Arrange
    SabrFormulaData data = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    double[] volatilityD =
        new double[] {
          10.0d, -1000000.0d, 10.0d, -1000000.0d, 10.0d, -1000000.0d, 10.0d, -1000000.0d
        };
    double[][] volatilityD2 =
        new double[][] {
          new double[] {10.0d, -1000000.0d, 10.0d, -1000000.0d},
          new double[] {10.0d, -1000000.0d, 10.0d, -1000000.0d}
        };

    // Act and Assert
    assertEquals(
        1.0E-6d,
        SabrHaganVolatilityFunctionProvider.DEFAULT.volatilityAdjoint2(
            1.0E-6d, 10.0d, 10.0d, data, volatilityD, volatilityD2));
    assertEquals(2, volatilityD2.length);
    assertArrayEquals(
        new double[] {-2.636844375385099E12d, -261501.94372768307d, 10.0d, -1000000.0d},
        volatilityD2[0],
        0.0);
    assertArrayEquals(
        new double[] {-261501.94372768307d, -0.02434394417398836d, 10.0d, -1000000.0d},
        volatilityD2[1],
        0.0);
    assertArrayEquals(
        new double[] {
          -82488.28331296892d,
          -0.008024502986353285d,
          -0.0058928835246912364d,
          0.10408502849273357d,
          0.22164022994874982d,
          -0.006561906994890181d,
          10.0d,
          -1000000.0d
        },
        volatilityD,
        0.0);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#equals(Object)}, and {@link
   * SabrHaganVolatilityFunctionProvider#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SabrHaganVolatilityFunctionProvider#equals(Object)}
   *   <li>{@link SabrHaganVolatilityFunctionProvider#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SabrHaganVolatilityFunctionProvider.equals(Object)",
    "int SabrHaganVolatilityFunctionProvider.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SabrHaganVolatilityFunctionProvider sabrHaganVolatilityFunctionProvider =
        SabrHaganVolatilityFunctionProvider.DEFAULT;
    SabrHaganVolatilityFunctionProvider sabrHaganVolatilityFunctionProvider2 =
        SabrHaganVolatilityFunctionProvider.DEFAULT;

    // Act and Assert
    assertEquals(sabrHaganVolatilityFunctionProvider, sabrHaganVolatilityFunctionProvider2);
    assertEquals(
        sabrHaganVolatilityFunctionProvider.hashCode(),
        sabrHaganVolatilityFunctionProvider2.hashCode());
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#equals(Object)}, and {@link
   * SabrHaganVolatilityFunctionProvider#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SabrHaganVolatilityFunctionProvider#equals(Object)}
   *   <li>{@link SabrHaganVolatilityFunctionProvider#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SabrHaganVolatilityFunctionProvider.equals(Object)",
    "int SabrHaganVolatilityFunctionProvider.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SabrHaganVolatilityFunctionProvider sabrHaganVolatilityFunctionProvider =
        SabrHaganVolatilityFunctionProvider.DEFAULT;

    // Act and Assert
    assertEquals(sabrHaganVolatilityFunctionProvider, sabrHaganVolatilityFunctionProvider);
    int expectedHashCodeResult = sabrHaganVolatilityFunctionProvider.hashCode();
    assertEquals(expectedHashCodeResult, sabrHaganVolatilityFunctionProvider.hashCode());
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SabrHaganVolatilityFunctionProvider.equals(Object)",
    "int SabrHaganVolatilityFunctionProvider.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SabrHaganVolatilityFunctionProvider.DEFAULT, 1);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SabrHaganVolatilityFunctionProvider.equals(Object)",
    "int SabrHaganVolatilityFunctionProvider.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(SabrHaganVolatilityFunctionProvider.DEFAULT, null);
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SabrHaganVolatilityFunctionProvider.equals(Object)",
    "int SabrHaganVolatilityFunctionProvider.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        SabrHaganVolatilityFunctionProvider.DEFAULT,
        "Different type to SabrHaganVolatilityFunctionProvider");
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#meta()}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SabrHaganVolatilityFunctionProvider.meta()"})
  void testMeta() {
    // Arrange and Act
    TypedMetaBean<SabrHaganVolatilityFunctionProvider> actualMetaResult =
        SabrHaganVolatilityFunctionProvider.meta();

    // Assert
    assertTrue(actualMetaResult instanceof LightMetaBean);
    assertTrue(actualMetaResult.metaPropertyMap().isEmpty());
    assertTrue(actualMetaResult.isBuildable());
    Class<SabrHaganVolatilityFunctionProvider> expectedBeanTypeResult =
        SabrHaganVolatilityFunctionProvider.class;
    assertEquals(expectedBeanTypeResult, actualMetaResult.beanType());
  }

  /**
   * Test {@link SabrHaganVolatilityFunctionProvider#metaBean()}.
   *
   * <p>Method under test: {@link SabrHaganVolatilityFunctionProvider#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TypedMetaBean SabrHaganVolatilityFunctionProvider.metaBean()"})
  void testMetaBean() {
    // Arrange and Act
    TypedMetaBean<SabrHaganVolatilityFunctionProvider> actualMetaBeanResult =
        SabrHaganVolatilityFunctionProvider.DEFAULT.metaBean();

    // Assert
    assertTrue(actualMetaBeanResult instanceof LightMetaBean);
    assertTrue(actualMetaBeanResult.metaPropertyMap().isEmpty());
    assertTrue(actualMetaBeanResult.isBuildable());
    Class<SabrHaganVolatilityFunctionProvider> expectedBeanTypeResult =
        SabrHaganVolatilityFunctionProvider.class;
    assertEquals(expectedBeanTypeResult, actualMetaBeanResult.beanType());
  }
}
