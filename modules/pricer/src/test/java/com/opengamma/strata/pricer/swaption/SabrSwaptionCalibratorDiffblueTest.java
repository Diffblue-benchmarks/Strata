package com.opengamma.strata.pricer.swaption;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.collect.array.DoubleArray;
import com.opengamma.strata.collect.tuple.Pair;
import com.opengamma.strata.market.surface.Surface;
import com.opengamma.strata.market.surface.interpolator.SurfaceInterpolator;
import com.opengamma.strata.math.MathException;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.option.TenorRawOptionData;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.swap.type.FixedFloatSwapConvention;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SabrSwaptionCalibratorDiffblueTest {
  /**
   * Test {@link SabrSwaptionCalibrator#calibrateWithFixedBetaAndShift(SabrSwaptionDefinition,
   * ZonedDateTime, TenorRawOptionData, RatesProvider, Surface, Surface)} with {@code definition},
   * {@code calibrationDateTime}, {@code data}, {@code ratesProvider}, {@code betaSurface}, {@code
   * shiftSurface}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#calibrateWithFixedBetaAndShift(SabrSwaptionDefinition, ZonedDateTime,
   * TenorRawOptionData, RatesProvider, Surface, Surface)}
   */
  @Test
  @DisplayName(
      "Test calibrateWithFixedBetaAndShift(SabrSwaptionDefinition, ZonedDateTime, TenorRawOptionData, RatesProvider, Surface, Surface) with 'definition', 'calibrationDateTime', 'data', 'ratesProvider', 'betaSurface', 'shiftSurface'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.swaption.SabrParametersSwaptionVolatilities SabrSwaptionCalibrator.calibrateWithFixedBetaAndShift(SabrSwaptionDefinition, ZonedDateTime, TenorRawOptionData, RatesProvider, Surface, Surface)"
  })
  void
      testCalibrateWithFixedBetaAndShiftWithDefinitionCalibrationDateTimeDataRatesProviderBetaSurfaceShiftSurface() {
    // Arrange
    FixedFloatSwapConvention convention = mock(FixedFloatSwapConvention.class);
    when(convention.getFloatingLeg()).thenThrow(new MathException());
    SabrSwaptionDefinition definition =
        SabrSwaptionDefinition.of(
            SwaptionVolatilitiesName.of("Name"),
            convention,
            mock(DayCount.class),
            mock(SurfaceInterpolator.class));
    ZonedDateTime calibrationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            SabrSwaptionCalibrator.DEFAULT.calibrateWithFixedBetaAndShift(
                definition, calibrationDateTime, null, new MockRatesProvider(), null, null));
    verify(convention).getFloatingLeg();
  }

  /**
   * Test {@link SabrSwaptionCalibrator#calibrateWithFixedBetaAndShift(SabrSwaptionDefinition,
   * ZonedDateTime, TenorRawOptionData, RatesProvider, Surface, Surface, boolean)} with {@code
   * definition}, {@code calibrationDateTime}, {@code data}, {@code ratesProvider}, {@code
   * betaSurface}, {@code shiftSurface}, {@code stopOnMathException}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#calibrateWithFixedBetaAndShift(SabrSwaptionDefinition, ZonedDateTime,
   * TenorRawOptionData, RatesProvider, Surface, Surface, boolean)}
   */
  @Test
  @DisplayName(
      "Test calibrateWithFixedBetaAndShift(SabrSwaptionDefinition, ZonedDateTime, TenorRawOptionData, RatesProvider, Surface, Surface, boolean) with 'definition', 'calibrationDateTime', 'data', 'ratesProvider', 'betaSurface', 'shiftSurface', 'stopOnMathException'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "com.opengamma.strata.pricer.swaption.SabrParametersSwaptionVolatilities SabrSwaptionCalibrator.calibrateWithFixedBetaAndShift(SabrSwaptionDefinition, ZonedDateTime, TenorRawOptionData, RatesProvider, Surface, Surface, boolean)"
  })
  void
      testCalibrateWithFixedBetaAndShiftWithDefinitionCalibrationDateTimeDataRatesProviderBetaSurfaceShiftSurfaceStopOnMathException() {
    // Arrange
    FixedFloatSwapConvention convention = mock(FixedFloatSwapConvention.class);
    when(convention.getFloatingLeg()).thenThrow(new MathException());
    SabrSwaptionDefinition definition =
        SabrSwaptionDefinition.of(
            SwaptionVolatilitiesName.of("Name"),
            convention,
            mock(DayCount.class),
            mock(SurfaceInterpolator.class));
    ZonedDateTime calibrationDateTime =
        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC);

    // Act and Assert
    assertThrows(
        MathException.class,
        () ->
            SabrSwaptionCalibrator.DEFAULT.calibrateWithFixedBetaAndShift(
                definition, calibrationDateTime, null, new MockRatesProvider(), null, null, true));
    verify(convention).getFloatingLeg();
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted() {
    // Arrange
    DoubleArray strikes = DoubleArray.of();
    DoubleArray blackVolatilities = DoubleArray.filled(3);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                10.0d, 10.0d, 10.0d, strikes, blackVolatilities, 10.0d);

    // Assert
    DoubleArray second =
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond();
    assertEquals(1.0d, second.max());
    assertEquals(1.0d, second.min());
    List<Double> toListResult = second.toList();
    assertEquals(3, toListResult.size());
    assertEquals(1.0d, toListResult.get(0).doubleValue());
    assertEquals(1.0d, toListResult.get(1).doubleValue());
    assertEquals(1.0d, toListResult.get(2).doubleValue());
    assertEquals(3.0d, second.sum());
    assertSame(
        blackVolatilities,
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst());
    assertArrayEquals(new double[] {1.0d, 1.0d, 1.0d}, second.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted2() {
    // Arrange
    DoubleArray strikes = DoubleArray.filled(3);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                10.0d, 1.0d, 10.0d, strikes, DoubleArray.filled(3), 10.0d);

    // Assert
    assertEquals(
        strikes, actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst());
    assertEquals(
        strikes, actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond());
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted3() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                10.0d, 1.0d, 10.0d, strikes, DoubleArray.filled(3), 10.0d);

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst();
    assertEquals(0.0d, first.max());
    assertEquals(0.0d, first.min());
    List<Double> toListResult = first.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0d}, first.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {0.0d},
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult
            .getSecond()
            .toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted4() {
    // Arrange
    DoubleArray strikes = DoubleArray.filled(3);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                1.0E13d, 1.0d, 10.0d, strikes, DoubleArray.filled(3), 10.0d);

    // Assert
    assertEquals(
        strikes, actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst());
    assertEquals(
        strikes, actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond());
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted5() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                10.0d, 20.0d, 10.0d, strikes, DoubleArray.of(10.0d), 10.0d);

    // Assert
    DoubleArray second =
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond();
    List<Double> toListResult = second.toList();
    assertEquals(1, toListResult.size());
    assertEquals(5.499555384800876E-55d, second.max());
    assertEquals(5.499555384800876E-55d, second.min());
    assertEquals(5.499555384800876E-55d, second.sum());
    assertEquals(5.499555384800876E-55d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {0.611851121289703d},
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst().toArrayUnsafe(),
        0.0);
    assertArrayEquals(new double[] {5.499555384800876E-55d}, second.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted6() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                10.0d, 1.0E13d, 10.0d, strikes, DoubleArray.of(10.0d), 10.0d);

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst();
    List<Double> toListResult = first.toList();
    assertEquals(1, toListResult.size());
    assertEquals(1.585295848795513E-12d, first.max());
    assertEquals(1.585295848795513E-12d, first.min());
    assertEquals(1.585295848795513E-12d, first.sum());
    assertEquals(1.585295848795513E-12d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.585295848795513E-12d}, first.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {Double.POSITIVE_INFINITY},
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult
            .getSecond()
            .toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted7() {
    // Arrange
    DoubleArray strikes = DoubleArray.filled(3);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                1.0E-13d, 1.0d, 10.0d, strikes, DoubleArray.filled(3), 0.5d);

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst();
    assertEquals(2.640106331956292E-16d, first.sum());
    assertEquals(8.800354439854306E-17d, first.max());
    assertEquals(8.800354439854306E-17d, first.min());
    DoubleArray second =
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond();
    assertEquals(Double.NaN, second.max());
    assertEquals(Double.NaN, second.min());
    assertEquals(Double.NaN, second.sum());
    assertArrayEquals(
        new double[] {8.800354439854306E-17d, 8.800354439854306E-17d, 8.800354439854306E-17d},
        first.toArrayUnsafe(),
        0.0);
    assertArrayEquals(
        new double[] {Double.NaN, Double.NaN, Double.NaN}, second.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted8() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                1.0E13d, 20.0d, 10.0d, strikes, DoubleArray.of(10.0d), 10.0d);

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst();
    List<Double> toListResult = first.toList();
    assertEquals(1, toListResult.size());
    DoubleArray second =
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond();
    List<Double> toListResult2 = second.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(1.982797831997311E-49d, second.max());
    assertEquals(1.982797831997311E-49d, second.min());
    assertEquals(1.982797831997311E-49d, second.sum());
    assertEquals(1.982797831997311E-49d, toListResult2.get(0).doubleValue());
    assertEquals(2.487702714001642d, first.max());
    assertEquals(2.487702714001642d, first.min());
    assertEquals(2.487702714001642d, first.sum());
    assertEquals(2.487702714001642d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {1.982797831997311E-49d}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {2.487702714001642d}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted9() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                -6.0136873569177505d, 20.0d, 10.0d, strikes, DoubleArray.of(10.0d), 10.0d);

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst();
    assertEquals(0.4044655324934703d, first.max());
    assertEquals(0.4044655324934703d, first.min());
    assertEquals(0.4044655324934703d, first.sum());
    List<Double> toListResult = first.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.4044655324934703d, toListResult.get(0).doubleValue());
    DoubleArray second =
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond();
    List<Double> toListResult2 = second.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(3.297020006966469E-55d, second.max());
    assertEquals(3.297020006966469E-55d, second.min());
    assertEquals(3.297020006966469E-55d, second.sum());
    assertEquals(3.297020006966469E-55d, toListResult2.get(0).doubleValue());
    assertArrayEquals(new double[] {0.4044655324934703d}, first.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {3.297020006966469E-55d}, second.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted10() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                10.0d, 20.0d, 1.0E13d, strikes, DoubleArray.of(10.0d), 10.0d);

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst();
    List<Double> toListResult = first.toList();
    assertEquals(1, toListResult.size());
    assertEquals(6.118511212897029E-7d, first.max());
    assertEquals(6.118511212897029E-7d, first.min());
    assertEquals(6.118511212897029E-7d, first.sum());
    assertEquals(6.118511212897029E-7d, toListResult.get(0).doubleValue());
    assertArrayEquals(
        new double[] {0.0d},
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult
            .getSecond()
            .toArrayUnsafe(),
        0.0);
    assertArrayEquals(new double[] {6.118511212897029E-7d}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted11() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                -6.0136873569177505d, 1.0E13d, 10.0d, strikes, DoubleArray.of(10.0d), 10.0d);

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst();
    assertEquals(0.0d, first.max());
    assertEquals(0.0d, first.min());
    List<Double> toListResult = first.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    DoubleArray second =
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond();
    List<Double> toListResult2 = second.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(Double.POSITIVE_INFINITY, second.max());
    assertEquals(Double.POSITIVE_INFINITY, second.min());
    assertEquals(Double.POSITIVE_INFINITY, second.sum());
    assertEquals(Double.POSITIVE_INFINITY, toListResult2.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0d}, first.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, second.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted12() {
    // Arrange
    DoubleArray strikes = DoubleArray.filled(1);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                10.0d, 1.0E13d, 10.0d, strikes, DoubleArray.of(10.0d), 10.0d);

    // Assert
    DoubleArray second =
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond();
    List<Double> toListResult = second.toList();
    assertEquals(1, toListResult.size());
    assertEquals(
        strikes, actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst());
    assertEquals(Double.POSITIVE_INFINITY, second.max());
    assertEquals(Double.POSITIVE_INFINITY, second.min());
    assertEquals(Double.POSITIVE_INFINITY, second.sum());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, second.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted13() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                10.0d, 20.0d, 10.0d, strikes, DoubleArray.of(1.0E13d), 10.0d);

    // Assert
    DoubleArray second =
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond();
    List<Double> toListResult = second.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    DoubleArray first = actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst();
    assertEquals(0.611851121289703d, first.max());
    assertEquals(0.611851121289703d, first.min());
    assertEquals(0.611851121289703d, first.sum());
    List<Double> toListResult2 = first.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(0.611851121289703d, toListResult2.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0d}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {0.611851121289703d}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <ul>
   *   <li>Then return First is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double); then return First is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted_thenReturnFirstIsEmpty() {
    // Arrange
    DoubleArray strikes = DoubleArray.of();

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                10.0d, 10.0d, 10.0d, strikes, DoubleArray.of(), 10.0d);

    // Assert
    DoubleArray doubleArray = DoubleArray.EMPTY;
    assertSame(
        doubleArray, actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst());
    assertSame(
        doubleArray, actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond());
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double,
   * double, double, DoubleArray, DoubleArray, double)}.
   *
   * <ul>
   *   <li>Then return First is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double,
   * double, DoubleArray, DoubleArray, double)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double); then return First is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(double, double, double, DoubleArray, DoubleArray, double)"
  })
  void testBlackVolatilitiesShiftedFromBlackVolatilitiesShifted_thenReturnFirstIsEmpty2() {
    // Arrange
    DoubleArray strikes = DoubleArray.of();

    // Act
    Pair<DoubleArray, DoubleArray>
        actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult =
            SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromBlackVolatilitiesShifted(
                10.0d, 1.0d, 10.0d, strikes, DoubleArray.of(), 10.0d);

    // Assert
    DoubleArray doubleArray = DoubleArray.EMPTY;
    assertSame(
        doubleArray, actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getFirst());
    assertSame(
        doubleArray, actualBlackVolatilitiesShiftedFromBlackVolatilitiesShiftedResult.getSecond());
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double, double, double,
   * DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return First max is {@code 5.294735740568878}.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double,
   * double, double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray); then return First max is '5.294735740568878'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromPrices_thenReturnFirstMaxIs5294735740568878() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromPricesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromPrices(
            2.0E-15d, 10.0d, 10.0d, strikes, DoubleArray.of(10.0d));

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromPricesResult.getFirst();
    List<Double> toListResult = first.toList();
    assertEquals(1, toListResult.size());
    DoubleArray second = actualBlackVolatilitiesShiftedFromPricesResult.getSecond();
    List<Double> toListResult2 = second.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(5.294735740568878d, first.max());
    assertEquals(5.294735740568878d, first.min());
    assertEquals(5.294735740568878d, first.sum());
    assertEquals(5.294735740568878d, toListResult.get(0).doubleValue());
    assertEquals(9.28612361916888E13d, second.max());
    assertEquals(9.28612361916888E13d, second.min());
    assertEquals(9.28612361916888E13d, second.sum());
    assertEquals(9.28612361916888E13d, toListResult2.get(0).doubleValue());
    assertArrayEquals(new double[] {5.294735740568878d}, first.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {9.28612361916888E13d}, second.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double, double, double,
   * DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return First max is {@link Double#POSITIVE_INFINITY}.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double,
   * double, double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray); then return First max is POSITIVE_INFINITY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromPrices_thenReturnFirstMaxIsPositive_infinity() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromPricesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromPrices(
            10.0d, 10.0d, 0.0d, strikes, DoubleArray.of(10.0d));

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromPricesResult.getFirst();
    List<Double> toListResult = first.toList();
    assertEquals(1, toListResult.size());
    assertEquals(Double.POSITIVE_INFINITY, first.max());
    assertEquals(Double.POSITIVE_INFINITY, first.min());
    assertEquals(Double.POSITIVE_INFINITY, first.sum());
    assertEquals(Double.POSITIVE_INFINITY, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, first.toArrayUnsafe(), 0.0);
    assertArrayEquals(
        new double[] {Double.POSITIVE_INFINITY},
        actualBlackVolatilitiesShiftedFromPricesResult.getSecond().toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double, double, double,
   * DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return First max is zero.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double,
   * double, double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray); then return First max is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromPrices_thenReturnFirstMaxIsZero() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromPricesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromPrices(
            10.0d, 10.0d, 10.0d, strikes, DoubleArray.of(2.0E-15d));

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromPricesResult.getFirst();
    assertEquals(0.0d, first.max());
    assertEquals(0.0d, first.min());
    List<Double> toListResult = first.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0d, toListResult.get(0).doubleValue());
    DoubleArray second = actualBlackVolatilitiesShiftedFromPricesResult.getSecond();
    List<Double> toListResult2 = second.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(Double.POSITIVE_INFINITY, second.max());
    assertEquals(Double.POSITIVE_INFINITY, second.min());
    assertEquals(Double.POSITIVE_INFINITY, second.sum());
    assertEquals(Double.POSITIVE_INFINITY, toListResult2.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0d}, first.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {Double.POSITIVE_INFINITY}, second.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double, double, double,
   * DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return Second max is {@code 0.1378112422684597}.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double,
   * double, double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray); then return Second max is '0.1378112422684597'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromPrices_thenReturnSecondMaxIs01378112422684597() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(0.3d);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromPricesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromPrices(
            10.0d, 10.0d, 10.0d, strikes, DoubleArray.of(10.0d));

    // Assert
    DoubleArray second = actualBlackVolatilitiesShiftedFromPricesResult.getSecond();
    assertEquals(0.1378112422684597d, second.max());
    assertEquals(0.1378112422684597d, second.min());
    assertEquals(0.1378112422684597d, second.sum());
    List<Double> toListResult = second.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.1378112422684597d, toListResult.get(0).doubleValue());
    DoubleArray first = actualBlackVolatilitiesShiftedFromPricesResult.getFirst();
    assertEquals(0.1578842794998022d, first.max());
    assertEquals(0.1578842794998022d, first.min());
    assertEquals(0.1578842794998022d, first.sum());
    List<Double> toListResult2 = first.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(0.1578842794998022d, toListResult2.get(0).doubleValue());
    assertArrayEquals(new double[] {0.1378112422684597d}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {0.1578842794998022d}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double, double, double,
   * DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return Second max is {@code 0.7980697494406583}.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double,
   * double, double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray); then return Second max is '0.7980697494406583'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromPrices_thenReturnSecondMaxIs07980697494406583() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromPricesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromPrices(
            0.3d, 10.0d, 10.0d, strikes, DoubleArray.of(10.0d));

    // Assert
    DoubleArray second = actualBlackVolatilitiesShiftedFromPricesResult.getSecond();
    assertEquals(0.7980697494406583d, second.max());
    assertEquals(0.7980697494406583d, second.min());
    assertEquals(0.7980697494406583d, second.sum());
    List<Double> toListResult = second.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.7980697494406583d, toListResult.get(0).doubleValue());
    DoubleArray first = actualBlackVolatilitiesShiftedFromPricesResult.getFirst();
    List<Double> toListResult2 = first.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(1.4588729258103048d, first.max());
    assertEquals(1.4588729258103048d, first.min());
    assertEquals(1.4588729258103048d, first.sum());
    assertEquals(1.4588729258103048d, toListResult2.get(0).doubleValue());
    assertArrayEquals(new double[] {0.7980697494406583d}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {1.4588729258103048d}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double, double, double,
   * DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return Second max is {@code 0.16298787242134535}.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double,
   * double, double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray); then return Second max is '0.16298787242134535'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromPrices_thenReturnSecondMaxIs016298787242134535() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromPricesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromPrices(
            2.0d, 10.0d, 10.0d, strikes, DoubleArray.of(10.0d));

    // Assert
    DoubleArray second = actualBlackVolatilitiesShiftedFromPricesResult.getSecond();
    assertEquals(0.16298787242134535d, second.max());
    assertEquals(0.16298787242134535d, second.min());
    assertEquals(0.16298787242134535d, second.sum());
    List<Double> toListResult = second.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.16298787242134535d, toListResult.get(0).doubleValue());
    DoubleArray first = actualBlackVolatilitiesShiftedFromPricesResult.getFirst();
    assertEquals(0.9568039299597743d, first.max());
    assertEquals(0.9568039299597743d, first.min());
    assertEquals(0.9568039299597743d, first.sum());
    List<Double> toListResult2 = first.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(0.9568039299597743d, toListResult2.get(0).doubleValue());
    assertArrayEquals(new double[] {0.16298787242134535d}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {0.9568039299597743d}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double, double, double,
   * DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return Second max is {@code 2.5237181399123678E8}.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double,
   * double, double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray); then return Second max is '2.5237181399123678E8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromPrices_thenReturnSecondMaxIs25237181399123678e8() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromPricesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromPrices(
            0.3d, 10.0d, 1.0E-16d, strikes, DoubleArray.of(10.0d));

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromPricesResult.getFirst();
    List<Double> toListResult = first.toList();
    assertEquals(1, toListResult.size());
    DoubleArray second = actualBlackVolatilitiesShiftedFromPricesResult.getSecond();
    List<Double> toListResult2 = second.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(2.5237181399123678E8d, second.max());
    assertEquals(2.5237181399123678E8d, second.min());
    assertEquals(2.5237181399123678E8d, second.sum());
    assertEquals(2.5237181399123678E8d, toListResult2.get(0).doubleValue());
    assertEquals(4.613361262314408E8d, first.max());
    assertEquals(4.613361262314408E8d, first.min());
    assertEquals(4.613361262314408E8d, first.sum());
    assertEquals(4.613361262314408E8d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {2.5237181399123678E8d}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {4.613361262314408E8d}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double, double, double,
   * DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return Second max is {@code 0.049756305719111535}.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double,
   * double, double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray); then return Second max is '0.049756305719111535'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromPrices_thenReturnSecondMaxIs0049756305719111535() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromPricesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromPrices(
            10.0d, 10.0d, 10.0d, strikes, DoubleArray.of(10.0d));

    // Assert
    DoubleArray second = actualBlackVolatilitiesShiftedFromPricesResult.getSecond();
    assertEquals(0.049756305719111535d, second.max());
    assertEquals(0.049756305719111535d, second.min());
    assertEquals(0.049756305719111535d, second.sum());
    List<Double> toListResult = second.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.049756305719111535d, toListResult.get(0).doubleValue());
    DoubleArray first = actualBlackVolatilitiesShiftedFromPricesResult.getFirst();
    assertEquals(0.4265847738115239d, first.max());
    assertEquals(0.4265847738115239d, first.min());
    assertEquals(0.4265847738115239d, first.sum());
    List<Double> toListResult2 = first.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(0.4265847738115239d, toListResult2.get(0).doubleValue());
    assertArrayEquals(new double[] {0.049756305719111535d}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {0.4265847738115239d}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double, double, double,
   * DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return Second max is {@code 4.9995087235339234E13}.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double,
   * double, double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray); then return Second max is '4.9995087235339234E13'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromPrices_thenReturnSecondMaxIs49995087235339234e13() {
    // Arrange
    DoubleArray strikes = DoubleArray.filled(1);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromPricesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromPrices(
            2.0E-15d, 10.0d, 10.0d, strikes, DoubleArray.of(10.0d));

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromPricesResult.getFirst();
    List<Double> toListResult = first.toList();
    assertEquals(1, toListResult.size());
    DoubleArray second = actualBlackVolatilitiesShiftedFromPricesResult.getSecond();
    List<Double> toListResult2 = second.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(4.9995087235339234E13d, second.max());
    assertEquals(4.9995087235339234E13d, second.min());
    assertEquals(4.9995087235339234E13d, second.sum());
    assertEquals(4.9995087235339234E13d, toListResult2.get(0).doubleValue());
    assertEquals(5.221332011471594d, first.max());
    assertEquals(5.221332011471594d, first.min());
    assertEquals(5.221332011471594d, first.sum());
    assertEquals(5.221332011471594d, toListResult.get(0).doubleValue());
    assertArrayEquals(new double[] {4.9995087235339234E13d}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {5.221332011471594d}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double, double, double,
   * DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When {@link DoubleArray}.
   *   <li>Then return First is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double,
   * double, double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray); when DoubleArray; then return First is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromPrices_whenDoubleArray_thenReturnFirstIsEmpty() {
    // Arrange
    DoubleArray strikes = DoubleArray.of();

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromPricesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromPrices(
            10.0d, 10.0d, 10.0d, strikes, DoubleArray.of());

    // Assert
    DoubleArray doubleArray = DoubleArray.EMPTY;
    assertSame(doubleArray, actualBlackVolatilitiesShiftedFromPricesResult.getFirst());
    assertSame(doubleArray, actualBlackVolatilitiesShiftedFromPricesResult.getSecond());
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double, double, double,
   * DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>When filled three.
   *   <li>Then return Second is First.
   * </ul>
   *
   * <p>Method under test: {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromPrices(double,
   * double, double, DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray); when filled three; then return Second is First")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromPrices(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromPrices_whenFilledThree_thenReturnSecondIsFirst() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromPricesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromPrices(
            10.0d, 10.0d, 10.0d, strikes, DoubleArray.filled(3));

    // Assert
    DoubleArray first = actualBlackVolatilitiesShiftedFromPricesResult.getFirst();
    assertEquals(first, actualBlackVolatilitiesShiftedFromPricesResult.getSecond());
    assertArrayEquals(new double[] {0.0d}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromNormalVolatilities(double,
   * double, double, DoubleArray, DoubleArray)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromNormalVolatilities(double, double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromNormalVolatilities(double, double, double, DoubleArray, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromNormalVolatilities(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromNormalVolatilities() {
    // Arrange
    DoubleArray strikes = DoubleArray.filled(3);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromNormalVolatilities(
            10.0d, 10.0d, 10.0d, strikes, DoubleArray.filled(3));

    // Assert
    DoubleArray second = actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult.getSecond();
    assertEquals(0.06931471805599453d, second.max());
    assertEquals(0.06931471805599453d, second.min());
    List<Double> toListResult = second.toList();
    assertEquals(3, toListResult.size());
    assertEquals(0.06931471805599453d, toListResult.get(0).doubleValue());
    assertEquals(0.06931471805599453d, toListResult.get(1).doubleValue());
    assertEquals(0.06931471805599453d, toListResult.get(2).doubleValue());
    assertEquals(0.20794415416798356d, second.sum());
    assertEquals(3, second.size());
    assertEquals(strikes, actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult.getFirst());
    assertArrayEquals(
        new double[] {0.06931471805599453d, 0.06931471805599453d, 0.06931471805599453d},
        second.toArrayUnsafe(),
        0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromNormalVolatilities(double,
   * double, double, DoubleArray, DoubleArray)}.
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromNormalVolatilities(double, double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromNormalVolatilities(double, double, double, DoubleArray, DoubleArray)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromNormalVolatilities(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromNormalVolatilities2() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromNormalVolatilities(
            10.0d, 10.0d, 10.0d, strikes, DoubleArray.of(10.0d));

    // Assert
    DoubleArray second = actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult.getSecond();
    assertEquals(0.0750766215943234d, second.max());
    assertEquals(0.0750766215943234d, second.min());
    assertEquals(0.0750766215943234d, second.sum());
    List<Double> toListResult = second.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.0750766215943234d, toListResult.get(0).doubleValue());
    DoubleArray first = actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult.getFirst();
    assertEquals(0.5681733564861629d, first.max());
    assertEquals(0.5681733564861629d, first.min());
    assertEquals(0.5681733564861629d, first.sum());
    List<Double> toListResult2 = first.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(0.5681733564861629d, toListResult2.get(0).doubleValue());
    assertArrayEquals(new double[] {0.0750766215943234d}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {0.5681733564861629d}, first.toArrayUnsafe(), 0.0);
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromNormalVolatilities(double,
   * double, double, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return First is {@link DoubleArray#EMPTY}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromNormalVolatilities(double, double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromNormalVolatilities(double, double, double, DoubleArray, DoubleArray); then return First is EMPTY")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromNormalVolatilities(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromNormalVolatilities_thenReturnFirstIsEmpty() {
    // Arrange
    DoubleArray strikes = DoubleArray.of();

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromNormalVolatilities(
            10.0d, 10.0d, 10.0d, strikes, DoubleArray.of());

    // Assert
    DoubleArray doubleArray = DoubleArray.EMPTY;
    assertSame(doubleArray, actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult.getFirst());
    assertSame(doubleArray, actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult.getSecond());
  }

  /**
   * Test {@link SabrSwaptionCalibrator#blackVolatilitiesShiftedFromNormalVolatilities(double,
   * double, double, DoubleArray, DoubleArray)}.
   *
   * <ul>
   *   <li>Then return Second max is {@code 0.05}.
   * </ul>
   *
   * <p>Method under test: {@link
   * SabrSwaptionCalibrator#blackVolatilitiesShiftedFromNormalVolatilities(double, double, double,
   * DoubleArray, DoubleArray)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilitiesShiftedFromNormalVolatilities(double, double, double, DoubleArray, DoubleArray); then return Second max is '0.05'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Pair SabrSwaptionCalibrator.blackVolatilitiesShiftedFromNormalVolatilities(double, double, double, DoubleArray, DoubleArray)"
  })
  void testBlackVolatilitiesShiftedFromNormalVolatilities_thenReturnSecondMaxIs005() {
    // Arrange
    DoubleArray strikes = DoubleArray.of(10.0d);

    // Act
    Pair<DoubleArray, DoubleArray> actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult =
        SabrSwaptionCalibrator.DEFAULT.blackVolatilitiesShiftedFromNormalVolatilities(
            10.0d, 10.0d, 10.0d, strikes, DoubleArray.filled(3));

    // Assert
    DoubleArray second = actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult.getSecond();
    assertEquals(0.05d, second.max());
    assertEquals(0.05d, second.min());
    assertEquals(0.05d, second.sum());
    List<Double> toListResult = second.toList();
    assertEquals(1, toListResult.size());
    assertEquals(0.05d, toListResult.get(0).doubleValue());
    DoubleArray first = actualBlackVolatilitiesShiftedFromNormalVolatilitiesResult.getFirst();
    assertEquals(0.0d, first.max());
    assertEquals(0.0d, first.min());
    List<Double> toListResult2 = first.toList();
    assertEquals(1, toListResult2.size());
    assertEquals(0.0d, toListResult2.get(0).doubleValue());
    assertArrayEquals(new double[] {0.05d}, second.toArrayUnsafe(), 0.0);
    assertArrayEquals(new double[] {0.0d}, first.toArrayUnsafe(), 0.0);
  }
}
