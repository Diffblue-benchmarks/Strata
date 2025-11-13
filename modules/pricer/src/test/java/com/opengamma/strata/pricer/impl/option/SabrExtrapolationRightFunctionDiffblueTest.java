package com.opengamma.strata.pricer.impl.option;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.value.ValueDerivatives;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.pricer.impl.volatility.smile.SabrFormulaData;
import com.opengamma.strata.pricer.impl.volatility.smile.SabrHaganVolatilityFunctionProvider;
import com.opengamma.strata.pricer.impl.volatility.smile.VolatilityFunctionProvider;
import com.opengamma.strata.product.common.PutCall;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrExtrapolationRightFunctionDiffblueTest {
  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double, double, double,
   * VolatilityFunctionProvider)} with {@code forward}, {@code sabrData}, {@code cutOffStrike},
   * {@code timeToExpiry}, {@code mu}, {@code volatilityFunction}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double,
   * double, double, VolatilityFunctionProvider)}
   */
  @Test
  @DisplayName(
      "Test of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider) with 'forward', 'sabrData', 'cutOffStrike', 'timeToExpiry', 'mu', 'volatilityFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider)"
  })
  void testOfWithForwardSabrDataCutOffStrikeTimeToExpiryMuVolatilityFunction() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(
            10.0d, sabrData, 10.0d, 10.0d, 10.0d, SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Assert
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[3], 0.0);
    assertArrayEquals(
        new double[] {0.10000000000000003d, -3.7947076036992655E-19d, 0.0d},
        actualOfResult.getParameterDerivativeForward(),
        0.0);
    assertArrayEquals(
        new double[] {40.328436022934554d, -200.0000000000009d, 500.00000000000455d},
        actualOfResult.getParameter(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.0d, -1.0d, 10.0d},
        actualOfResult.getSabrData().getParameters().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double, double, double,
   * VolatilityFunctionProvider)} with {@code forward}, {@code sabrData}, {@code cutOffStrike},
   * {@code timeToExpiry}, {@code mu}, {@code volatilityFunction}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double,
   * double, double, VolatilityFunctionProvider)}
   */
  @Test
  @DisplayName(
      "Test of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider) with 'forward', 'sabrData', 'cutOffStrike', 'timeToExpiry', 'mu', 'volatilityFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider)"
  })
  void testOfWithForwardSabrDataCutOffStrikeTimeToExpiryMuVolatilityFunction2() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(
            1.0E-6d, sabrData, 10.0d, 10.0d, 10.0d, SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Assert
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertArrayEquals(new double[] {-100.0d, 0.0d, 0.0d}, actualOfResult.getParameter(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, actualOfResult.getParameterDerivativeForward(), 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[3], 0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.0d, -1.0d, 10.0d},
        actualOfResult.getSabrData().getParameters().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double, double, double,
   * VolatilityFunctionProvider)} with {@code forward}, {@code sabrData}, {@code cutOffStrike},
   * {@code timeToExpiry}, {@code mu}, {@code volatilityFunction}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double,
   * double, double, VolatilityFunctionProvider)}
   */
  @Test
  @DisplayName(
      "Test of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider) with 'forward', 'sabrData', 'cutOffStrike', 'timeToExpiry', 'mu', 'volatilityFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider)"
  })
  void testOfWithForwardSabrDataCutOffStrikeTimeToExpiryMuVolatilityFunction3() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 1.0E-6d, -1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(
            10.0d, sabrData, 10.0d, 10.0d, 10.0d, SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Assert
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertSame(sabrData, actualOfResult.getSabrData());
    assertArrayEquals(
        new double[] {-6.115818661210636E10d, 5.995301088035745E11d, 1.2051760362683578E11d},
        parameterDerivativeSabr[2],
        0.0);
    assertArrayEquals(
        new double[] {1.476189868797954E10d, -1.447100257166791E11d, -2.908962413021558E10d},
        actualOfResult.getParameterDerivativeForward(),
        0.0);
    assertArrayEquals(
        new double[] {2.038606611816519E9d, -1.9984340796461246E10d, -4.017254225410409E9d},
        parameterDerivativeSabr[3],
        0.0);
    assertArrayEquals(
        new double[] {4.055796394429149E17d, -8.111592786853926E18d, 4.055796392424777E19d},
        actualOfResult.getParameter(),
        0.0);
    assertArrayEquals(
        new double[] {5.850299391927118E9d, -5.735014108979975E10d, -1.1528531211879206E10d},
        parameterDerivativeSabr[1],
        0.0);
    assertArrayEquals(
        new double[] {9.642618178018928E8d, -9.45260192684542E9d, -1.9001630035471005E9d},
        parameterDerivativeSabr[0],
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double, double, double,
   * VolatilityFunctionProvider)} with {@code forward}, {@code sabrData}, {@code cutOffStrike},
   * {@code timeToExpiry}, {@code mu}, {@code volatilityFunction}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double,
   * double, double, VolatilityFunctionProvider)}
   */
  @Test
  @DisplayName(
      "Test of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider) with 'forward', 'sabrData', 'cutOffStrike', 'timeToExpiry', 'mu', 'volatilityFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider)"
  })
  void testOfWithForwardSabrDataCutOffStrikeTimeToExpiryMuVolatilityFunction4() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(
            10.0d, sabrData, -0.5d, 10.0d, 10.0d, SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Assert
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertArrayEquals(
        new double[] {0.08638375985314753d, -0.006586761688802539d, -0.0010797969981643533d},
        actualOfResult.getParameterDerivativeForward(),
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[3], 0.0);
    assertArrayEquals(
        new double[] {10.514007759954042d, 10.070294784580494d, 1.2616213151927425d},
        actualOfResult.getParameter(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.0d, -1.0d, 10.0d},
        actualOfResult.getSabrData().getParameters().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double, double, double,
   * VolatilityFunctionProvider)} with {@code forward}, {@code sabrData}, {@code cutOffStrike},
   * {@code timeToExpiry}, {@code mu}, {@code volatilityFunction}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double,
   * double, double, VolatilityFunctionProvider)}
   */
  @Test
  @DisplayName(
      "Test of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider) with 'forward', 'sabrData', 'cutOffStrike', 'timeToExpiry', 'mu', 'volatilityFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider)"
  })
  void testOfWithForwardSabrDataCutOffStrikeTimeToExpiryMuVolatilityFunction5() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(
            10.0d, sabrData, 10.0d, 1.0E-6d, 10.0d, SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Assert
    assertEquals(1.0E-6d, actualOfResult.getTimeToExpiry());
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertArrayEquals(new double[] {-10000.0d, 0.0d, 0.0d}, actualOfResult.getParameter(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, actualOfResult.getParameterDerivativeForward(), 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[3], 0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.0d, -1.0d, 10.0d},
        actualOfResult.getSabrData().getParameters().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double, double, double,
   * VolatilityFunctionProvider)} with {@code forward}, {@code sabrData}, {@code cutOffStrike},
   * {@code timeToExpiry}, {@code mu}, {@code volatilityFunction}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double,
   * double, double, VolatilityFunctionProvider)}
   */
  @Test
  @DisplayName(
      "Test of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider) with 'forward', 'sabrData', 'cutOffStrike', 'timeToExpiry', 'mu', 'volatilityFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider)"
  })
  void testOfWithForwardSabrDataCutOffStrikeTimeToExpiryMuVolatilityFunction6() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, 1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(
            1.0E-6d, sabrData, 10.0d, 10.0d, 10.0d, SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Assert
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertArrayEquals(new double[] {-100.0d, 0.0d, 0.0d}, actualOfResult.getParameter(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, actualOfResult.getParameterDerivativeForward(), 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[3], 0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 1.0d, 10.0d},
        actualOfResult.getSabrData().getParameters().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double, double, double,
   * VolatilityFunctionProvider)} with {@code forward}, {@code sabrData}, {@code cutOffStrike},
   * {@code timeToExpiry}, {@code mu}, {@code volatilityFunction}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, SabrFormulaData, double,
   * double, double, VolatilityFunctionProvider)}
   */
  @Test
  @DisplayName(
      "Test of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider) with 'forward', 'sabrData', 'cutOffStrike', 'timeToExpiry', 'mu', 'volatilityFunction'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, SabrFormulaData, double, double, double, VolatilityFunctionProvider)"
  })
  void testOfWithForwardSabrDataCutOffStrikeTimeToExpiryMuVolatilityFunction7() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, 1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(
            10.0d, sabrData, -0.5d, 10.0d, 10.0d, SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Assert
    assertEquals(-0.5d, actualOfResult.getCutOffStrike());
    assertSame(sabrData, actualOfResult.getSabrData());
    assertArrayEquals(
        new double[] {0.08638375985314753d, -0.006586761688802539d, -0.0010797969981643533d},
        actualOfResult.getParameterDerivativeForward(),
        0.0);
    assertArrayEquals(
        new double[] {10.514007759954042d, 10.070294784580494d, 1.2616213151927425d},
        actualOfResult.getParameter(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData, double, double)}
   * with {@code forward}, {@code timeToExpiry}, {@code sabrData}, {@code cutOffStrike}, {@code mu}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, SabrFormulaData, double, double) with 'forward', 'timeToExpiry', 'sabrData', 'cutOffStrike', 'mu'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, double, SabrFormulaData, double, double)"
  })
  void testOfWithForwardTimeToExpirySabrDataCutOffStrikeMu() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Assert
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[3], 0.0);
    assertArrayEquals(
        new double[] {0.10000000000000003d, -3.7947076036992655E-19d, 0.0d},
        actualOfResult.getParameterDerivativeForward(),
        0.0);
    assertArrayEquals(
        new double[] {40.328436022934554d, -200.0000000000009d, 500.00000000000455d},
        actualOfResult.getParameter(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.0d, -1.0d, 10.0d},
        actualOfResult.getSabrData().getParameters().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData, double, double)}
   * with {@code forward}, {@code timeToExpiry}, {@code sabrData}, {@code cutOffStrike}, {@code mu}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, SabrFormulaData, double, double) with 'forward', 'timeToExpiry', 'sabrData', 'cutOffStrike', 'mu'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, double, SabrFormulaData, double, double)"
  })
  void testOfWithForwardTimeToExpirySabrDataCutOffStrikeMu2() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(1.0E-6d, 10.0d, sabrData, 10.0d, 10.0d);

    // Assert
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertArrayEquals(new double[] {-100.0d, 0.0d, 0.0d}, actualOfResult.getParameter(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, actualOfResult.getParameterDerivativeForward(), 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[3], 0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.0d, -1.0d, 10.0d},
        actualOfResult.getSabrData().getParameters().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData, double, double)}
   * with {@code forward}, {@code timeToExpiry}, {@code sabrData}, {@code cutOffStrike}, {@code mu}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, SabrFormulaData, double, double) with 'forward', 'timeToExpiry', 'sabrData', 'cutOffStrike', 'mu'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, double, SabrFormulaData, double, double)"
  })
  void testOfWithForwardTimeToExpirySabrDataCutOffStrikeMu3() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 1.0E-6d, -1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Assert
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertSame(sabrData, actualOfResult.getSabrData());
    assertArrayEquals(
        new double[] {-6.115818661210636E10d, 5.995301088035745E11d, 1.2051760362683578E11d},
        parameterDerivativeSabr[2],
        0.0);
    assertArrayEquals(
        new double[] {1.476189868797954E10d, -1.447100257166791E11d, -2.908962413021558E10d},
        actualOfResult.getParameterDerivativeForward(),
        0.0);
    assertArrayEquals(
        new double[] {2.038606611816519E9d, -1.9984340796461246E10d, -4.017254225410409E9d},
        parameterDerivativeSabr[3],
        0.0);
    assertArrayEquals(
        new double[] {4.055796394429149E17d, -8.111592786853926E18d, 4.055796392424777E19d},
        actualOfResult.getParameter(),
        0.0);
    assertArrayEquals(
        new double[] {5.850299391927118E9d, -5.735014108979975E10d, -1.1528531211879206E10d},
        parameterDerivativeSabr[1],
        0.0);
    assertArrayEquals(
        new double[] {9.642618178018928E8d, -9.45260192684542E9d, -1.9001630035471005E9d},
        parameterDerivativeSabr[0],
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData, double, double)}
   * with {@code forward}, {@code timeToExpiry}, {@code sabrData}, {@code cutOffStrike}, {@code mu}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, SabrFormulaData, double, double) with 'forward', 'timeToExpiry', 'sabrData', 'cutOffStrike', 'mu'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, double, SabrFormulaData, double, double)"
  })
  void testOfWithForwardTimeToExpirySabrDataCutOffStrikeMu4() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, -0.5d, 10.0d);

    // Assert
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertArrayEquals(
        new double[] {0.08638375985314753d, -0.006586761688802539d, -0.0010797969981643533d},
        actualOfResult.getParameterDerivativeForward(),
        0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[3], 0.0);
    assertArrayEquals(
        new double[] {10.514007759954042d, 10.070294784580494d, 1.2616213151927425d},
        actualOfResult.getParameter(),
        0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.0d, -1.0d, 10.0d},
        actualOfResult.getSabrData().getParameters().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData, double, double)}
   * with {@code forward}, {@code timeToExpiry}, {@code sabrData}, {@code cutOffStrike}, {@code mu}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, SabrFormulaData, double, double) with 'forward', 'timeToExpiry', 'sabrData', 'cutOffStrike', 'mu'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, double, SabrFormulaData, double, double)"
  })
  void testOfWithForwardTimeToExpirySabrDataCutOffStrikeMu5() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, 1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(1.0E-6d, 10.0d, sabrData, 10.0d, 10.0d);

    // Assert
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertArrayEquals(new double[] {-100.0d, 0.0d, 0.0d}, actualOfResult.getParameter(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, actualOfResult.getParameterDerivativeForward(), 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[3], 0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.0d, 1.0d, 10.0d},
        actualOfResult.getSabrData().getParameters().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData, double, double)}
   * with {@code forward}, {@code timeToExpiry}, {@code sabrData}, {@code cutOffStrike}, {@code mu}.
   *
   * <ul>
   *   <li>Then return CutOffStrike is {@code -0.5}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, SabrFormulaData, double, double) with 'forward', 'timeToExpiry', 'sabrData', 'cutOffStrike', 'mu'; then return CutOffStrike is '-0.5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, double, SabrFormulaData, double, double)"
  })
  void testOfWithForwardTimeToExpirySabrDataCutOffStrikeMu_thenReturnCutOffStrikeIs05() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, 1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, -0.5d, 10.0d);

    // Assert
    assertEquals(-0.5d, actualOfResult.getCutOffStrike());
    assertSame(sabrData, actualOfResult.getSabrData());
    assertArrayEquals(
        new double[] {0.08638375985314753d, -0.006586761688802539d, -0.0010797969981643533d},
        actualOfResult.getParameterDerivativeForward(),
        0.0);
    assertArrayEquals(
        new double[] {10.514007759954042d, 10.070294784580494d, 1.2616213151927425d},
        actualOfResult.getParameter(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData, double, double)}
   * with {@code forward}, {@code timeToExpiry}, {@code sabrData}, {@code cutOffStrike}, {@code mu}.
   *
   * <ul>
   *   <li>Then return TimeToExpiry is {@code 1.0E-6}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#of(double, double, SabrFormulaData,
   * double, double)}
   */
  @Test
  @DisplayName(
      "Test of(double, double, SabrFormulaData, double, double) with 'forward', 'timeToExpiry', 'sabrData', 'cutOffStrike', 'mu'; then return TimeToExpiry is '1.0E-6'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SabrExtrapolationRightFunction SabrExtrapolationRightFunction.of(double, double, SabrFormulaData, double, double)"
  })
  void testOfWithForwardTimeToExpirySabrDataCutOffStrikeMu_thenReturnTimeToExpiryIs10e6() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);

    // Act
    SabrExtrapolationRightFunction actualOfResult =
        SabrExtrapolationRightFunction.of(10.0d, 1.0E-6d, sabrData, 10.0d, 10.0d);

    // Assert
    assertEquals(1.0E-6d, actualOfResult.getTimeToExpiry());
    double[][] parameterDerivativeSabr = actualOfResult.getParameterDerivativeSabr();
    assertEquals(4, parameterDerivativeSabr.length);
    assertArrayEquals(new double[] {-10000.0d, 0.0d, 0.0d}, actualOfResult.getParameter(), 0.0);
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, actualOfResult.getParameterDerivativeForward(), 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, parameterDerivativeSabr[3], 0.0);
    assertArrayEquals(
        new double[] {10.0d, 10.0d, -1.0d, 10.0d},
        actualOfResult.getSabrData().getParameters().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#price(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#price(double, PutCall)}
   */
  @Test
  @DisplayName("Test price(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrExtrapolationRightFunction.price(double, PutCall)"})
  void testPrice() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.price(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#price(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#price(double, PutCall)}
   */
  @Test
  @DisplayName("Test price(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrExtrapolationRightFunction.price(double, PutCall)"})
  void testPrice2() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 0.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.price(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#price(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#price(double, PutCall)}
   */
  @Test
  @DisplayName("Test price(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrExtrapolationRightFunction.price(double, PutCall)"})
  void testPrice3() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.price(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#price(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return {@code 9.999999999999}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#price(double, PutCall)}
   */
  @Test
  @DisplayName("Test price(double, PutCall); then return '9.999999999999'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrExtrapolationRightFunction.price(double, PutCall)"})
  void testPrice_thenReturn9999999999999() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(9.999999999999d, ofResult.price(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#price(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#price(double, PutCall)}
   */
  @Test
  @DisplayName("Test price(double, PutCall); then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrExtrapolationRightFunction.price(double, PutCall)"})
  void testPrice_thenReturnTen() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.price(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#price(double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#price(double, PutCall)}
   */
  @Test
  @DisplayName("Test price(double, PutCall); when '1.0E-12'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrExtrapolationRightFunction.price(double, PutCall)"})
  void testPrice_when10e12_thenReturnZero() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.price(1.0E-12d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#price(double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code CALL}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#price(double, PutCall)}
   */
  @Test
  @DisplayName("Test price(double, PutCall); when 'CALL'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double SabrExtrapolationRightFunction.price(double, PutCall)"})
  void testPrice_whenCall_thenReturnTen() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(10.0d, ofResult.price(10.0d, PutCall.CALL));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeStrike(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeStrike(double, PutCall)"
  })
  void testPriceDerivativeStrike() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(Double.NaN, ofResult.priceDerivativeStrike(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeStrike(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeStrike(double, PutCall)"
  })
  void testPriceDerivativeStrike2() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(1.0d, ofResult.priceDerivativeStrike(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeStrike(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeStrike(double, PutCall)"
  })
  void testPriceDerivativeStrike3() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 0.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.priceDerivativeStrike(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeStrike(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeStrike(double, PutCall)"
  })
  void testPriceDerivativeStrike4() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(1.0d, ofResult.priceDerivativeStrike(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeStrike(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeStrike(double, PutCall)"
  })
  void testPriceDerivativeStrike5() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(0.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 0.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.priceDerivativeStrike(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeStrike(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeStrike(double, PutCall)"
  })
  void testPriceDerivativeStrike6() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(0.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 1.0E-24d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(1.0d, ofResult.priceDerivativeStrike(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeStrike(double, PutCall); then return '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeStrike(double, PutCall)"
  })
  void testPriceDerivativeStrike_thenReturn00() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(-0.0d, ofResult.priceDerivativeStrike(10.0d, PutCall.CALL));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return {@link Double#NaN}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeStrike(double, PutCall); then return NaN")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeStrike(double, PutCall)"
  })
  void testPriceDerivativeStrike_thenReturnNaN() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 1.0E-24d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(Double.NaN, ofResult.priceDerivativeStrike(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeStrike(double, PutCall); then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeStrike(double, PutCall)"
  })
  void testPriceDerivativeStrike_thenReturnOne() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(1.0d, ofResult.priceDerivativeStrike(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeStrike(double, PutCall); when '1.0E-12'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeStrike(double, PutCall)"
  })
  void testPriceDerivativeStrike_when10e12_thenReturnZero() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.priceDerivativeStrike(1.0E-12d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code CALL}.
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeStrike(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeStrike(double, PutCall); when 'CALL'; then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeStrike(double, PutCall)"
  })
  void testPriceDerivativeStrike_whenCall_thenReturnZero() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.priceDerivativeStrike(10.0d, PutCall.CALL));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward2() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(Double.NaN, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward3() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward4() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 0.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward5() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(-1.0d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward6() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 1.0E-24d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(Double.NaN, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward7() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(-1.0d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward8() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 10.0d, sabrData, 1.0d, 10.0d);

    // Act and Assert
    assertEquals(-1.0d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward9() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(0.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 0.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward10() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 0.0d, sabrData, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(-1.0d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward11() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 1.0E-12d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(-1.0d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward12() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, 1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(-1.0d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return {@code -0.9999534903588332}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall); then return '-0.9999534903588332'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward_thenReturn09999534903588332() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0d, 10.0d);

    // Act and Assert
    assertEquals(-0.9999534903588332d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return {@code -0.9999991249048829}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall); then return '-0.9999991249048829'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward_thenReturn09999991249048829() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, -0.5d, 10.0d);

    // Act and Assert
    assertEquals(-0.9999991249048829d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return {@code -1.0000002178835679}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall); then return '-1.0000002178835679'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward_thenReturn10000002178835679() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 10.0d, sabrData, -0.5d, 10.0d);

    // Act and Assert
    assertEquals(-1.0000002178835679d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return {@code -0.9999534903588332}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall); then return '-0.9999534903588332'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward_thenReturn099995349035883322() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, 1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0d, 10.0d);

    // Act and Assert
    assertEquals(-0.9999534903588332d, ofResult.priceDerivativeForward(10.0d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall); when '1.0E-12'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward_when10e12() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.priceDerivativeForward(1.0E-12d, PutCall.PUT));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code CALL}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall); when 'CALL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward_whenCall() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act and Assert
    assertEquals(0.0d, ofResult.priceDerivativeForward(10.0d, PutCall.CALL));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceDerivativeForward(double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code CALL}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceDerivativeForward(double,
   * PutCall)}
   */
  @Test
  @DisplayName("Test priceDerivativeForward(double, PutCall); when 'CALL'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "double SabrExtrapolationRightFunction.priceDerivativeForward(double, PutCall)"
  })
  void testPriceDerivativeForward_whenCall_thenReturnOne() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertEquals(1.0d, ofResult.priceDerivativeForward(10.0d, PutCall.CALL));
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    DoubleArray derivatives = ofResult.priceAdjointSabr(10.0d, PutCall.PUT).getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(3).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, 0.0d, Double.NaN}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr2() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(-0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.0d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, actualPriceAdjointSabrResult.getValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, -0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr3() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 0.0d, sabrData, 10.0d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualPriceAdjointSabrResult.getValue());
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr4() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualPriceAdjointSabrResult.getValue());
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr5() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 1.0E-24d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    DoubleArray derivatives = ofResult.priceAdjointSabr(10.0d, PutCall.PUT).getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(Double.NaN, derivatives.max());
    assertEquals(Double.NaN, derivatives.min());
    assertEquals(Double.NaN, derivatives.sum());
    assertEquals(Double.NaN, toListResult.get(0).doubleValue());
    assertEquals(Double.NaN, toListResult.get(1).doubleValue());
    assertEquals(Double.NaN, toListResult.get(3).doubleValue());
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, 0.0d, Double.NaN}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr6() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 10.0d, sabrData, 1.0d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertEquals(9.999999999999d, actualPriceAdjointSabrResult.getValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr7() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(0.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 0.0d, sabrData, 10.0d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualPriceAdjointSabrResult.getValue());
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr8() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 0.0d, sabrData, 1.0E-12d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualPriceAdjointSabrResult.getValue());
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr9() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 1.0E-12d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    assertEquals(0.0d, actualPriceAdjointSabrResult.getValue());
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return Derivatives toList second doubleValue is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjointSabr(double, PutCall); then return Derivatives toList second doubleValue is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr_thenReturnDerivativesToListSecondDoubleValueIs00() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.0d, toListResult.get(1).doubleValue());
    assertEquals(-0.0d, toListResult.get(2).doubleValue());
    assertEquals(9.999999999999d, actualPriceAdjointSabrResult.getValue());
    assertArrayEquals(new double[] {0.0d, -0.0d, -0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return Value is {@code 1.020944303320448E-5}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjointSabr(double, PutCall); then return Value is '1.020944303320448E-5'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr_thenReturnValueIs1020944303320448e5() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, -0.5d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertEquals(1.020944303320448E-5d, actualPriceAdjointSabrResult.getValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return Value is {@code 4.650964116681422E-4}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjointSabr(double, PutCall); then return Value is '4.650964116681422E-4'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr_thenReturnValueIs4650964116681422e4() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertEquals(4.650964116681422E-4d, actualPriceAdjointSabrResult.getValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return Value is {@code 10.000002178834679}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall); then return Value is '10.000002178834679'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr_thenReturnValueIs10000002178834679() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-12d, 10.0d, sabrData, -0.5d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertEquals(10.000002178834679d, actualPriceAdjointSabrResult.getValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <ul>
   *   <li>Then return Value is ten.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall); then return Value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr_thenReturnValueIsTen() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(-0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.0d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, actualPriceAdjointSabrResult.getValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, -0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code 1.0E-12}.
   *   <li>Then return Derivatives min is {@code -0.0}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName(
      "Test priceAdjointSabr(double, PutCall); when '1.0E-12'; then return Derivatives min is '-0.0'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr_when10e12_thenReturnDerivativesMinIs00() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult =
        ofResult.priceAdjointSabr(1.0E-12d, PutCall.PUT);

    // Assert
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(-0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.0d, toListResult.get(3).doubleValue());
    assertEquals(0.0d, actualPriceAdjointSabrResult.getValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, -0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code CALL}.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall); when 'CALL'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr_whenCall() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-12d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.CALL);

    // Assert
    assertEquals(0.0d, actualPriceAdjointSabrResult.getValue());
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(0.0d, toListResult.get(3).doubleValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, 0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}.
   *
   * <ul>
   *   <li>When {@code CALL}.
   *   <li>Then return Value is ten.
   * </ul>
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#priceAdjointSabr(double, PutCall)}
   */
  @Test
  @DisplayName("Test priceAdjointSabr(double, PutCall); when 'CALL'; then return Value is ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ValueDerivatives SabrExtrapolationRightFunction.priceAdjointSabr(double, PutCall)"
  })
  void testPriceAdjointSabr_whenCall_thenReturnValueIsTen() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act
    ValueDerivatives actualPriceAdjointSabrResult = ofResult.priceAdjointSabr(10.0d, PutCall.CALL);

    // Assert
    DoubleArray derivatives = actualPriceAdjointSabrResult.getDerivatives();
    assertEquals(-0.0d, derivatives.min());
    List<Double> toListResult = derivatives.toList();
    assertEquals(4, toListResult.size());
    assertEquals(-0.0d, toListResult.get(3).doubleValue());
    assertEquals(10.0d, actualPriceAdjointSabrResult.getValue());
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d, -0.0d}, derivatives.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertArrayEquals(
        new double[] {0.10000000000000003d, -3.7947076036992655E-19d, 0.0d},
        ofResult.getParameterDerivativeForward(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward2() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(1.0E-15d, 1.0E-15d, 1.0E-15d, 1.0E-15d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(
            1.0E-15d,
            sabrData,
            1.0E-15d,
            1.0E-15d,
            1.0E-15d,
            SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Act and Assert
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, ofResult.getParameterDerivativeForward(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward3() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-15d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertArrayEquals(
        new double[] {0.0d, 0.0d, 0.0d}, ofResult.getParameterDerivativeForward(), 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward4() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(1.0E-15d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertArrayEquals(
        new double[] {1.4741139483722643E10d, -1.445065244423554E11d, -2.9048716283306885E10d},
        ofResult.getParameterDerivativeForward(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward5() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 1.0E-5d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertArrayEquals(
        new double[] {1.476189228186809E10d, -1.4470996291793784E11d, -2.908961150640664E10d},
        ofResult.getParameterDerivativeForward(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward6() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-15d, 10.0d);

    // Act and Assert
    assertArrayEquals(
        new double[] {0.0d, 1.0785207688568523E-77d, 2.4286128663675304E-62d},
        ofResult.getParameterDerivativeForward(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward7() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-5d, 10.0d);

    // Act and Assert
    assertArrayEquals(
        new double[] {1.8183679186455336E-26d, 5.999992133608409E-16d, -1.9999980445066336E-21d},
        ofResult.getParameterDerivativeForward(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward8() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, -0.5d, 10.0d);

    // Act and Assert
    assertArrayEquals(
        new double[] {0.08638375985314753d, -0.006586761688802539d, -0.0010797969981643533d},
        ofResult.getParameterDerivativeForward(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward9() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(1.0E-15d, 1.0E-15d, 1.0E-15d, 1.0E-15d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(
            1.0E-15d,
            sabrData,
            1.0E-15d,
            10.0d,
            1.0E-15d,
            SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Act and Assert
    assertArrayEquals(
        new double[] {9.93264986582358E-41d, 1.1027456576577308E-25d, 9.932649865823579E-11d},
        ofResult.getParameterDerivativeForward(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward10() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(1.0E-15d, 10.0d, 1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act and Assert
    assertArrayEquals(
        new double[] {1.4705431164248854E10d, -1.441564754749371E11d, -2.897834940662942E10d},
        ofResult.getParameterDerivativeForward(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward11() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 1.0E-5d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-15d, 10.0d);

    // Act and Assert
    assertArrayEquals(
        new double[] {6.250000000000003E-123d, 1.1909943112776046E-77d, 2.5000000000000005E-62d},
        ofResult.getParameterDerivativeForward(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeForward()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeForward()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[] SabrExtrapolationRightFunction.getParameterDerivativeForward()"})
  void testGetParameterDerivativeForward12() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, 1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-15d, 10.0d);

    // Act and Assert
    assertArrayEquals(
        new double[] {0.0d, 1.0785207688568523E-77d, 2.4286128663675304E-62d},
        ofResult.getParameterDerivativeForward(),
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeSabr()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] SabrExtrapolationRightFunction.getParameterDerivativeSabr()"})
  void testGetParameterDerivativeSabr() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act
    double[][] actualParameterDerivativeSabr = ofResult.getParameterDerivativeSabr();

    // Assert
    assertEquals(4, actualParameterDerivativeSabr.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[3], 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeSabr()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] SabrExtrapolationRightFunction.getParameterDerivativeSabr()"})
  void testGetParameterDerivativeSabr2() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(1.0E-15d, 1.0E-15d, 1.0E-15d, 1.0E-15d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(
            1.0E-15d,
            sabrData,
            1.0E-15d,
            1.0E-15d,
            1.0E-15d,
            SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Act
    double[][] actualParameterDerivativeSabr = ofResult.getParameterDerivativeSabr();

    // Assert
    assertEquals(4, actualParameterDerivativeSabr.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[3], 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeSabr()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] SabrExtrapolationRightFunction.getParameterDerivativeSabr()"})
  void testGetParameterDerivativeSabr3() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(1.0E-15d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act
    double[][] actualParameterDerivativeSabr = ofResult.getParameterDerivativeSabr();

    // Assert
    assertEquals(4, actualParameterDerivativeSabr.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[3], 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeSabr()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] SabrExtrapolationRightFunction.getParameterDerivativeSabr()"})
  void testGetParameterDerivativeSabr4() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(1.0E-15d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act
    double[][] actualParameterDerivativeSabr = ofResult.getParameterDerivativeSabr();

    // Assert
    assertEquals(4, actualParameterDerivativeSabr.length);
    assertArrayEquals(
        new double[] {-556.2024538796494d, 5452.420110157654d, 1096.0460465702736d},
        actualParameterDerivativeSabr[1],
        0.0);
    assertArrayEquals(
        new double[] {-58681.1841294296d, 575177.9895176064d, 115622.40974480992d},
        actualParameterDerivativeSabr[2],
        0.0);
    assertArrayEquals(
        new double[] {1939.969946087641d, -19014.41613408244d, -3822.2829262771766d},
        actualParameterDerivativeSabr[3],
        0.0);
    assertArrayEquals(
        new double[] {9.8258841480356E18d, -9.632256473464316E19d, -1.9362771788408037E19d},
        actualParameterDerivativeSabr[0],
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeSabr()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] SabrExtrapolationRightFunction.getParameterDerivativeSabr()"})
  void testGetParameterDerivativeSabr5() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 1.0E-5d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 10.0d, 10.0d);

    // Act
    double[][] actualParameterDerivativeSabr = ofResult.getParameterDerivativeSabr();

    // Assert
    assertEquals(4, actualParameterDerivativeSabr.length);
    assertArrayEquals(
        new double[] {-6.115914535379012E10d, 5.995395072919338E11d, 1.205194929119263E11d},
        actualParameterDerivativeSabr[2],
        0.0);
    assertArrayEquals(
        new double[] {2.0386422395167763E9d, -1.9984690052712303E10d, -4.0173244329376826E9d},
        actualParameterDerivativeSabr[3],
        0.0);
    assertArrayEquals(
        new double[] {5.850634934804379E9d, -5.735343039690251E10d, -1.15291924287287E10d},
        actualParameterDerivativeSabr[1],
        0.0);
    assertArrayEquals(
        new double[] {9.64286358030899E8d, -9.452842493267761E9d, -1.9002113622338867E9d},
        actualParameterDerivativeSabr[0],
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeSabr()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] SabrExtrapolationRightFunction.getParameterDerivativeSabr()"})
  void testGetParameterDerivativeSabr6() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-15d, 10.0d);

    // Act
    double[][] actualParameterDerivativeSabr = ofResult.getParameterDerivativeSabr();

    // Assert
    assertEquals(4, actualParameterDerivativeSabr.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[3], 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeSabr()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] SabrExtrapolationRightFunction.getParameterDerivativeSabr()"})
  void testGetParameterDerivativeSabr7() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-5d, 10.0d);

    // Act
    double[][] actualParameterDerivativeSabr = ofResult.getParameterDerivativeSabr();

    // Assert
    assertEquals(4, actualParameterDerivativeSabr.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[3], 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeSabr()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] SabrExtrapolationRightFunction.getParameterDerivativeSabr()"})
  void testGetParameterDerivativeSabr8() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 10.0d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, -0.5d, 10.0d);

    // Act
    double[][] actualParameterDerivativeSabr = ofResult.getParameterDerivativeSabr();

    // Assert
    assertEquals(4, actualParameterDerivativeSabr.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[3], 0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeSabr()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] SabrExtrapolationRightFunction.getParameterDerivativeSabr()"})
  void testGetParameterDerivativeSabr9() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(1.0E-15d, 1.0E-15d, 1.0E-15d, 1.0E-15d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(
            1.0E-15d,
            sabrData,
            1.0E-15d,
            10.0d,
            1.0E-15d,
            SabrHaganVolatilityFunctionProvider.DEFAULT);

    // Act
    double[][] actualParameterDerivativeSabr = ofResult.getParameterDerivativeSabr();

    // Assert
    assertEquals(4, actualParameterDerivativeSabr.length);
    assertArrayEquals(
        new double[] {-2.750940086743264E-46d, -3.0541570236666966E-31d, -2.7509400867432637E-16d},
        actualParameterDerivativeSabr[0],
        0.0);
    assertArrayEquals(
        new double[] {-3.276603264056639E-64d, -3.6377603863176224E-49d, -3.276603264056639E-34d},
        actualParameterDerivativeSabr[2],
        0.0);
    assertArrayEquals(
        new double[] {-9.013851611769625E-71d, -1.0007385599941213E-55d, -9.013851611769623E-41d},
        actualParameterDerivativeSabr[3],
        0.0);
    assertArrayEquals(
        new double[] {2.135869274090587E-59d, 2.3712912456847887E-44d, 2.1358692740905866E-29d},
        actualParameterDerivativeSabr[1],
        0.0);
  }

  /**
   * Test {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}.
   *
   * <p>Method under test: {@link SabrExtrapolationRightFunction#getParameterDerivativeSabr()}
   */
  @Test
  @DisplayName("Test getParameterDerivativeSabr()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double[][] SabrExtrapolationRightFunction.getParameterDerivativeSabr()"})
  void testGetParameterDerivativeSabr10() {
    // Arrange
    SabrFormulaData sabrData = SabrFormulaData.of(10.0d, 1.0E-5d, -1.0d, 10.0d);
    SabrExtrapolationRightFunction ofResult =
        SabrExtrapolationRightFunction.of(10.0d, 10.0d, sabrData, 1.0E-15d, 10.0d);

    // Act
    double[][] actualParameterDerivativeSabr = ofResult.getParameterDerivativeSabr();

    // Assert
    assertEquals(4, actualParameterDerivativeSabr.length);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[0], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[1], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[2], 0.0);
    assertArrayEquals(new double[] {0.0d, 0.0d, 0.0d}, actualParameterDerivativeSabr[3], 0.0);
  }
}
