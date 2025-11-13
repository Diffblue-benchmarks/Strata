package com.opengamma.strata.market.surface;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.market.ValueType;
import com.opengamma.strata.market.model.MoneynessType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SurfacesDiffblueTest {
  /**
   * Test {@link Surfaces#blackVolatilityByExpiryTenor(String, DayCount)} with {@code String},
   * {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryTenor(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryTenor(String, DayCount) with 'String', 'DayCount'; then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SurfaceMetadata Surfaces.blackVolatilityByExpiryTenor(String, DayCount)"})
  void testBlackVolatilityByExpiryTenorWithStringDayCount_thenReturnInfoSizeIsOne() {
    // Arrange and Act
    SurfaceMetadata actualBlackVolatilityByExpiryTenorResult =
        Surfaces.blackVolatilityByExpiryTenor("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualBlackVolatilityByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryTenorResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    SurfaceName surfaceName = actualBlackVolatilityByExpiryTenorResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType xValueType = actualBlackVolatilityByExpiryTenorResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryTenorResult).getInfo().size());
    assertFalse(actualBlackVolatilityByExpiryTenorResult.getParameterMetadata().isPresent());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
    assertSame(xValueType, actualBlackVolatilityByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#blackVolatilityByExpiryTenor(String, DayCount)} with {@code String},
   * {@code DayCount}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryTenor(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryTenor(String, DayCount) with 'String', 'DayCount'; when 'Name'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SurfaceMetadata Surfaces.blackVolatilityByExpiryTenor(String, DayCount)"})
  void testBlackVolatilityByExpiryTenorWithStringDayCount_whenName_thenReturnInfoEmpty() {
    // Arrange and Act
    SurfaceMetadata actualBlackVolatilityByExpiryTenorResult =
        Surfaces.blackVolatilityByExpiryTenor("Name", null);

    // Assert
    assertTrue(actualBlackVolatilityByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryTenorResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    SurfaceName surfaceName = actualBlackVolatilityByExpiryTenorResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType xValueType = actualBlackVolatilityByExpiryTenorResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualBlackVolatilityByExpiryTenorResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryTenorResult).getInfo().isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
    assertSame(xValueType, actualBlackVolatilityByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#blackVolatilityByExpiryTenor(SurfaceName, DayCount)} with {@code
   * SurfaceName}, {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryTenor(SurfaceName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryTenor(SurfaceName, DayCount) with 'SurfaceName', 'DayCount'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.blackVolatilityByExpiryTenor(SurfaceName, DayCount)"
  })
  void testBlackVolatilityByExpiryTenorWithSurfaceNameDayCount_thenReturnInfoEmpty() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualBlackVolatilityByExpiryTenorResult =
        Surfaces.blackVolatilityByExpiryTenor(name, null);

    // Assert
    assertTrue(actualBlackVolatilityByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryTenorResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    ValueType xValueType = actualBlackVolatilityByExpiryTenorResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualBlackVolatilityByExpiryTenorResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryTenorResult).getInfo().isEmpty());
    assertSame(xValueType, actualBlackVolatilityByExpiryTenorResult.getYValueType());
    assertSame(name, actualBlackVolatilityByExpiryTenorResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#blackVolatilityByExpiryTenor(SurfaceName, DayCount)} with {@code
   * SurfaceName}, {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryTenor(SurfaceName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryTenor(SurfaceName, DayCount) with 'SurfaceName', 'DayCount'; then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.blackVolatilityByExpiryTenor(SurfaceName, DayCount)"
  })
  void testBlackVolatilityByExpiryTenorWithSurfaceNameDayCount_thenReturnInfoSizeIsOne() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualBlackVolatilityByExpiryTenorResult =
        Surfaces.blackVolatilityByExpiryTenor(name, mock(DayCount.class));

    // Assert
    assertTrue(actualBlackVolatilityByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryTenorResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    ValueType xValueType = actualBlackVolatilityByExpiryTenorResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryTenorResult).getInfo().size());
    assertFalse(actualBlackVolatilityByExpiryTenorResult.getParameterMetadata().isPresent());
    assertSame(xValueType, actualBlackVolatilityByExpiryTenorResult.getYValueType());
    assertSame(name, actualBlackVolatilityByExpiryTenorResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#blackVolatilityByExpiryStrike(String, DayCount)} with {@code String},
   * {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryStrike(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryStrike(String, DayCount) with 'String', 'DayCount'; then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SurfaceMetadata Surfaces.blackVolatilityByExpiryStrike(String, DayCount)"})
  void testBlackVolatilityByExpiryStrikeWithStringDayCount_thenReturnInfoSizeIsOne() {
    // Arrange and Act
    SurfaceMetadata actualBlackVolatilityByExpiryStrikeResult =
        Surfaces.blackVolatilityByExpiryStrike("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualBlackVolatilityByExpiryStrikeResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryStrikeResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    SurfaceName surfaceName = actualBlackVolatilityByExpiryStrikeResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType yValueType = actualBlackVolatilityByExpiryStrikeResult.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = actualBlackVolatilityByExpiryStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryStrikeResult).getInfo().size());
    assertFalse(actualBlackVolatilityByExpiryStrikeResult.getParameterMetadata().isPresent());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
  }

  /**
   * Test {@link Surfaces#blackVolatilityByExpiryStrike(String, DayCount)} with {@code String},
   * {@code DayCount}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryStrike(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryStrike(String, DayCount) with 'String', 'DayCount'; when 'Name'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SurfaceMetadata Surfaces.blackVolatilityByExpiryStrike(String, DayCount)"})
  void testBlackVolatilityByExpiryStrikeWithStringDayCount_whenName_thenReturnInfoEmpty() {
    // Arrange and Act
    SurfaceMetadata actualBlackVolatilityByExpiryStrikeResult =
        Surfaces.blackVolatilityByExpiryStrike("Name", null);

    // Assert
    assertTrue(actualBlackVolatilityByExpiryStrikeResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryStrikeResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    SurfaceName surfaceName = actualBlackVolatilityByExpiryStrikeResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType yValueType = actualBlackVolatilityByExpiryStrikeResult.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = actualBlackVolatilityByExpiryStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualBlackVolatilityByExpiryStrikeResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryStrikeResult).getInfo().isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
  }

  /**
   * Test {@link Surfaces#blackVolatilityByExpiryStrike(SurfaceName, DayCount)} with {@code
   * SurfaceName}, {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryStrike(SurfaceName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryStrike(SurfaceName, DayCount) with 'SurfaceName', 'DayCount'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.blackVolatilityByExpiryStrike(SurfaceName, DayCount)"
  })
  void testBlackVolatilityByExpiryStrikeWithSurfaceNameDayCount_thenReturnInfoEmpty() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualBlackVolatilityByExpiryStrikeResult =
        Surfaces.blackVolatilityByExpiryStrike(name, null);

    // Assert
    assertTrue(actualBlackVolatilityByExpiryStrikeResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryStrikeResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    ValueType yValueType = actualBlackVolatilityByExpiryStrikeResult.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = actualBlackVolatilityByExpiryStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualBlackVolatilityByExpiryStrikeResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryStrikeResult).getInfo().isEmpty());
    assertSame(name, actualBlackVolatilityByExpiryStrikeResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#blackVolatilityByExpiryStrike(SurfaceName, DayCount)} with {@code
   * SurfaceName}, {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryStrike(SurfaceName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryStrike(SurfaceName, DayCount) with 'SurfaceName', 'DayCount'; then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.blackVolatilityByExpiryStrike(SurfaceName, DayCount)"
  })
  void testBlackVolatilityByExpiryStrikeWithSurfaceNameDayCount_thenReturnInfoSizeIsOne() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualBlackVolatilityByExpiryStrikeResult =
        Surfaces.blackVolatilityByExpiryStrike(name, mock(DayCount.class));

    // Assert
    assertTrue(actualBlackVolatilityByExpiryStrikeResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryStrikeResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    ValueType yValueType = actualBlackVolatilityByExpiryStrikeResult.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = actualBlackVolatilityByExpiryStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryStrikeResult).getInfo().size());
    assertFalse(actualBlackVolatilityByExpiryStrikeResult.getParameterMetadata().isPresent());
    assertSame(name, actualBlackVolatilityByExpiryStrikeResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#blackVolatilityByExpiryLogMoneyness(String, DayCount)} with {@code
   * String}, {@code DayCount}.
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryLogMoneyness(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryLogMoneyness(String, DayCount) with 'String', 'DayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.blackVolatilityByExpiryLogMoneyness(String, DayCount)"
  })
  void testBlackVolatilityByExpiryLogMoneynessWithStringDayCount() {
    // Arrange and Act
    SurfaceMetadata actualBlackVolatilityByExpiryLogMoneynessResult =
        Surfaces.blackVolatilityByExpiryLogMoneyness("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualBlackVolatilityByExpiryLogMoneynessResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    ValueType yValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getYValueType();
    assertEquals("LogMoneyness", yValueType.getName());
    assertEquals("LogMoneyness", yValueType.toString());
    SurfaceName surfaceName = actualBlackVolatilityByExpiryLogMoneynessResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType xValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1,
        ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryLogMoneynessResult)
            .getInfo()
            .size());
    assertFalse(actualBlackVolatilityByExpiryLogMoneynessResult.getParameterMetadata().isPresent());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
  }

  /**
   * Test {@link Surfaces#blackVolatilityByExpiryLogMoneyness(String, DayCount)} with {@code
   * String}, {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryLogMoneyness(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryLogMoneyness(String, DayCount) with 'String', 'DayCount'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.blackVolatilityByExpiryLogMoneyness(String, DayCount)"
  })
  void testBlackVolatilityByExpiryLogMoneynessWithStringDayCount_thenReturnInfoEmpty() {
    // Arrange and Act
    SurfaceMetadata actualBlackVolatilityByExpiryLogMoneynessResult =
        Surfaces.blackVolatilityByExpiryLogMoneyness("Name", null);

    // Assert
    assertTrue(actualBlackVolatilityByExpiryLogMoneynessResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    ValueType yValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getYValueType();
    assertEquals("LogMoneyness", yValueType.getName());
    assertEquals("LogMoneyness", yValueType.toString());
    SurfaceName surfaceName = actualBlackVolatilityByExpiryLogMoneynessResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType xValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualBlackVolatilityByExpiryLogMoneynessResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryLogMoneynessResult)
            .getInfo()
            .isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
  }

  /**
   * Test {@link Surfaces#blackVolatilityByExpiryLogMoneyness(SurfaceName, DayCount)} with {@code
   * SurfaceName}, {@code DayCount}.
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryLogMoneyness(SurfaceName,
   * DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryLogMoneyness(SurfaceName, DayCount) with 'SurfaceName', 'DayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.blackVolatilityByExpiryLogMoneyness(SurfaceName, DayCount)"
  })
  void testBlackVolatilityByExpiryLogMoneynessWithSurfaceNameDayCount() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualBlackVolatilityByExpiryLogMoneynessResult =
        Surfaces.blackVolatilityByExpiryLogMoneyness(name, mock(DayCount.class));

    // Assert
    assertTrue(actualBlackVolatilityByExpiryLogMoneynessResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    ValueType yValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getYValueType();
    assertEquals("LogMoneyness", yValueType.getName());
    assertEquals("LogMoneyness", yValueType.toString());
    ValueType xValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1,
        ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryLogMoneynessResult)
            .getInfo()
            .size());
    assertFalse(actualBlackVolatilityByExpiryLogMoneynessResult.getParameterMetadata().isPresent());
    assertSame(name, actualBlackVolatilityByExpiryLogMoneynessResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#blackVolatilityByExpiryLogMoneyness(SurfaceName, DayCount)} with {@code
   * SurfaceName}, {@code DayCount}.
   *
   * <p>Method under test: {@link Surfaces#blackVolatilityByExpiryLogMoneyness(SurfaceName,
   * DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiryLogMoneyness(SurfaceName, DayCount) with 'SurfaceName', 'DayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.blackVolatilityByExpiryLogMoneyness(SurfaceName, DayCount)"
  })
  void testBlackVolatilityByExpiryLogMoneynessWithSurfaceNameDayCount2() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualBlackVolatilityByExpiryLogMoneynessResult =
        Surfaces.blackVolatilityByExpiryLogMoneyness(name, null);

    // Assert
    assertTrue(actualBlackVolatilityByExpiryLogMoneynessResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getZValueType();
    assertEquals("BlackVolatility", zValueType.getName());
    assertEquals("BlackVolatility", zValueType.toString());
    ValueType yValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getYValueType();
    assertEquals("LogMoneyness", yValueType.getName());
    assertEquals("LogMoneyness", yValueType.toString());
    ValueType xValueType = actualBlackVolatilityByExpiryLogMoneynessResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualBlackVolatilityByExpiryLogMoneynessResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualBlackVolatilityByExpiryLogMoneynessResult)
            .getInfo()
            .isEmpty());
    assertSame(name, actualBlackVolatilityByExpiryLogMoneynessResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpiryTenor(String, DayCount)} with {@code String},
   * {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpiryTenor(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryTenor(String, DayCount) with 'String', 'DayCount'; then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SurfaceMetadata Surfaces.normalVolatilityByExpiryTenor(String, DayCount)"})
  void testNormalVolatilityByExpiryTenorWithStringDayCount_thenReturnInfoSizeIsOne() {
    // Arrange and Act
    SurfaceMetadata actualNormalVolatilityByExpiryTenorResult =
        Surfaces.normalVolatilityByExpiryTenor("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualNormalVolatilityByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    SurfaceName surfaceName = actualNormalVolatilityByExpiryTenorResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType zValueType = actualNormalVolatilityByExpiryTenorResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryTenorResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualNormalVolatilityByExpiryTenorResult).getInfo().size());
    assertFalse(actualNormalVolatilityByExpiryTenorResult.getParameterMetadata().isPresent());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
    assertSame(xValueType, actualNormalVolatilityByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpiryTenor(String, DayCount)} with {@code String},
   * {@code DayCount}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpiryTenor(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryTenor(String, DayCount) with 'String', 'DayCount'; when 'Name'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SurfaceMetadata Surfaces.normalVolatilityByExpiryTenor(String, DayCount)"})
  void testNormalVolatilityByExpiryTenorWithStringDayCount_whenName_thenReturnInfoEmpty() {
    // Arrange and Act
    SurfaceMetadata actualNormalVolatilityByExpiryTenorResult =
        Surfaces.normalVolatilityByExpiryTenor("Name", null);

    // Assert
    assertTrue(actualNormalVolatilityByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    SurfaceName surfaceName = actualNormalVolatilityByExpiryTenorResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType zValueType = actualNormalVolatilityByExpiryTenorResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryTenorResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualNormalVolatilityByExpiryTenorResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualNormalVolatilityByExpiryTenorResult).getInfo().isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
    assertSame(xValueType, actualNormalVolatilityByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpiryTenor(SurfaceName, DayCount)} with {@code
   * SurfaceName}, {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpiryTenor(SurfaceName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryTenor(SurfaceName, DayCount) with 'SurfaceName', 'DayCount'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.normalVolatilityByExpiryTenor(SurfaceName, DayCount)"
  })
  void testNormalVolatilityByExpiryTenorWithSurfaceNameDayCount_thenReturnInfoEmpty() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualNormalVolatilityByExpiryTenorResult =
        Surfaces.normalVolatilityByExpiryTenor(name, null);

    // Assert
    assertTrue(actualNormalVolatilityByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualNormalVolatilityByExpiryTenorResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryTenorResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualNormalVolatilityByExpiryTenorResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualNormalVolatilityByExpiryTenorResult).getInfo().isEmpty());
    assertSame(xValueType, actualNormalVolatilityByExpiryTenorResult.getYValueType());
    assertSame(name, actualNormalVolatilityByExpiryTenorResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpiryTenor(SurfaceName, DayCount)} with {@code
   * SurfaceName}, {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpiryTenor(SurfaceName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryTenor(SurfaceName, DayCount) with 'SurfaceName', 'DayCount'; then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.normalVolatilityByExpiryTenor(SurfaceName, DayCount)"
  })
  void testNormalVolatilityByExpiryTenorWithSurfaceNameDayCount_thenReturnInfoSizeIsOne() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualNormalVolatilityByExpiryTenorResult =
        Surfaces.normalVolatilityByExpiryTenor(name, mock(DayCount.class));

    // Assert
    assertTrue(actualNormalVolatilityByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualNormalVolatilityByExpiryTenorResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryTenorResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualNormalVolatilityByExpiryTenorResult).getInfo().size());
    assertFalse(actualNormalVolatilityByExpiryTenorResult.getParameterMetadata().isPresent());
    assertSame(xValueType, actualNormalVolatilityByExpiryTenorResult.getYValueType());
    assertSame(name, actualNormalVolatilityByExpiryTenorResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpiryStrike(String, DayCount)} with {@code String},
   * {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpiryStrike(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryStrike(String, DayCount) with 'String', 'DayCount'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SurfaceMetadata Surfaces.normalVolatilityByExpiryStrike(String, DayCount)"})
  void testNormalVolatilityByExpiryStrikeWithStringDayCount_thenReturnInfoEmpty() {
    // Arrange and Act
    SurfaceMetadata actualNormalVolatilityByExpiryStrikeResult =
        Surfaces.normalVolatilityByExpiryStrike("Name", null);

    // Assert
    assertTrue(actualNormalVolatilityByExpiryStrikeResult instanceof DefaultSurfaceMetadata);
    SurfaceName surfaceName = actualNormalVolatilityByExpiryStrikeResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType zValueType = actualNormalVolatilityByExpiryStrikeResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType yValueType = actualNormalVolatilityByExpiryStrikeResult.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualNormalVolatilityByExpiryStrikeResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualNormalVolatilityByExpiryStrikeResult).getInfo().isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpiryStrike(String, DayCount)} with {@code String},
   * {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info size is one.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpiryStrike(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryStrike(String, DayCount) with 'String', 'DayCount'; then return Info size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SurfaceMetadata Surfaces.normalVolatilityByExpiryStrike(String, DayCount)"})
  void testNormalVolatilityByExpiryStrikeWithStringDayCount_thenReturnInfoSizeIsOne() {
    // Arrange and Act
    SurfaceMetadata actualNormalVolatilityByExpiryStrikeResult =
        Surfaces.normalVolatilityByExpiryStrike("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualNormalVolatilityByExpiryStrikeResult instanceof DefaultSurfaceMetadata);
    SurfaceName surfaceName = actualNormalVolatilityByExpiryStrikeResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType zValueType = actualNormalVolatilityByExpiryStrikeResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType yValueType = actualNormalVolatilityByExpiryStrikeResult.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualNormalVolatilityByExpiryStrikeResult).getInfo().size());
    assertFalse(actualNormalVolatilityByExpiryStrikeResult.getParameterMetadata().isPresent());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpiryStrike(SurfaceName, DayCount)} with {@code
   * SurfaceName}, {@code DayCount}.
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpiryStrike(SurfaceName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryStrike(SurfaceName, DayCount) with 'SurfaceName', 'DayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.normalVolatilityByExpiryStrike(SurfaceName, DayCount)"
  })
  void testNormalVolatilityByExpiryStrikeWithSurfaceNameDayCount() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualNormalVolatilityByExpiryStrikeResult =
        Surfaces.normalVolatilityByExpiryStrike(name, mock(DayCount.class));

    // Assert
    assertTrue(actualNormalVolatilityByExpiryStrikeResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualNormalVolatilityByExpiryStrikeResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType yValueType = actualNormalVolatilityByExpiryStrikeResult.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualNormalVolatilityByExpiryStrikeResult).getInfo().size());
    assertFalse(actualNormalVolatilityByExpiryStrikeResult.getParameterMetadata().isPresent());
    assertSame(name, actualNormalVolatilityByExpiryStrikeResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpiryStrike(SurfaceName, DayCount)} with {@code
   * SurfaceName}, {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpiryStrike(SurfaceName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryStrike(SurfaceName, DayCount) with 'SurfaceName', 'DayCount'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.normalVolatilityByExpiryStrike(SurfaceName, DayCount)"
  })
  void testNormalVolatilityByExpiryStrikeWithSurfaceNameDayCount_thenReturnInfoEmpty() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualNormalVolatilityByExpiryStrikeResult =
        Surfaces.normalVolatilityByExpiryStrike(name, null);

    // Assert
    assertTrue(actualNormalVolatilityByExpiryStrikeResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualNormalVolatilityByExpiryStrikeResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType yValueType = actualNormalVolatilityByExpiryStrikeResult.getYValueType();
    assertEquals("Strike", yValueType.getName());
    assertEquals("Strike", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualNormalVolatilityByExpiryStrikeResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualNormalVolatilityByExpiryStrikeResult).getInfo().isEmpty());
    assertSame(name, actualNormalVolatilityByExpiryStrikeResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(String, DayCount, MoneynessType)}
   * with {@code String}, {@code DayCount}, {@code MoneynessType}.
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(String, DayCount,
   * MoneynessType)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpirySimpleMoneyness(String, DayCount, MoneynessType) with 'String', 'DayCount', 'MoneynessType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.normalVolatilityByExpirySimpleMoneyness(String, DayCount, MoneynessType)"
  })
  void testNormalVolatilityByExpirySimpleMoneynessWithStringDayCountMoneynessType() {
    // Arrange and Act
    SurfaceMetadata actualNormalVolatilityByExpirySimpleMoneynessResult =
        Surfaces.normalVolatilityByExpirySimpleMoneyness(
            "Name", mock(DayCount.class), MoneynessType.PRICE);

    // Assert
    assertTrue(
        actualNormalVolatilityByExpirySimpleMoneynessResult instanceof DefaultSurfaceMetadata);
    SurfaceName surfaceName = actualNormalVolatilityByExpirySimpleMoneynessResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType zValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType yValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getYValueType();
    assertEquals("SimpleMoneyness", yValueType.getName());
    assertEquals("SimpleMoneyness", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        2,
        ((DefaultSurfaceMetadata) actualNormalVolatilityByExpirySimpleMoneynessResult)
            .getInfo()
            .size());
    assertFalse(
        actualNormalVolatilityByExpirySimpleMoneynessResult.getParameterMetadata().isPresent());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(String, DayCount, MoneynessType)}
   * with {@code String}, {@code DayCount}, {@code MoneynessType}.
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(String, DayCount,
   * MoneynessType)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpirySimpleMoneyness(String, DayCount, MoneynessType) with 'String', 'DayCount', 'MoneynessType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.normalVolatilityByExpirySimpleMoneyness(String, DayCount, MoneynessType)"
  })
  void testNormalVolatilityByExpirySimpleMoneynessWithStringDayCountMoneynessType2() {
    // Arrange and Act
    SurfaceMetadata actualNormalVolatilityByExpirySimpleMoneynessResult =
        Surfaces.normalVolatilityByExpirySimpleMoneyness("Name", mock(DayCount.class), null);

    // Assert
    assertTrue(
        actualNormalVolatilityByExpirySimpleMoneynessResult instanceof DefaultSurfaceMetadata);
    SurfaceName surfaceName = actualNormalVolatilityByExpirySimpleMoneynessResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType zValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType yValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getYValueType();
    assertEquals("SimpleMoneyness", yValueType.getName());
    assertEquals("SimpleMoneyness", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1,
        ((DefaultSurfaceMetadata) actualNormalVolatilityByExpirySimpleMoneynessResult)
            .getInfo()
            .size());
    assertFalse(
        actualNormalVolatilityByExpirySimpleMoneynessResult.getParameterMetadata().isPresent());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(String, DayCount, MoneynessType)}
   * with {@code String}, {@code DayCount}, {@code MoneynessType}.
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(String, DayCount,
   * MoneynessType)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpirySimpleMoneyness(String, DayCount, MoneynessType) with 'String', 'DayCount', 'MoneynessType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.normalVolatilityByExpirySimpleMoneyness(String, DayCount, MoneynessType)"
  })
  void testNormalVolatilityByExpirySimpleMoneynessWithStringDayCountMoneynessType3() {
    // Arrange and Act
    SurfaceMetadata actualNormalVolatilityByExpirySimpleMoneynessResult =
        Surfaces.normalVolatilityByExpirySimpleMoneyness("Name", null, null);

    // Assert
    assertTrue(
        actualNormalVolatilityByExpirySimpleMoneynessResult instanceof DefaultSurfaceMetadata);
    SurfaceName surfaceName = actualNormalVolatilityByExpirySimpleMoneynessResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    ValueType zValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType yValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getYValueType();
    assertEquals("SimpleMoneyness", yValueType.getName());
    assertEquals("SimpleMoneyness", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(
        actualNormalVolatilityByExpirySimpleMoneynessResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualNormalVolatilityByExpirySimpleMoneynessResult)
            .getInfo()
            .isEmpty());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(SurfaceName, DayCount,
   * MoneynessType)} with {@code SurfaceName}, {@code DayCount}, {@code MoneynessType}.
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(SurfaceName,
   * DayCount, MoneynessType)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpirySimpleMoneyness(SurfaceName, DayCount, MoneynessType) with 'SurfaceName', 'DayCount', 'MoneynessType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.normalVolatilityByExpirySimpleMoneyness(SurfaceName, DayCount, MoneynessType)"
  })
  void testNormalVolatilityByExpirySimpleMoneynessWithSurfaceNameDayCountMoneynessType() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualNormalVolatilityByExpirySimpleMoneynessResult =
        Surfaces.normalVolatilityByExpirySimpleMoneyness(
            name, mock(DayCount.class), MoneynessType.PRICE);

    // Assert
    assertTrue(
        actualNormalVolatilityByExpirySimpleMoneynessResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType yValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getYValueType();
    assertEquals("SimpleMoneyness", yValueType.getName());
    assertEquals("SimpleMoneyness", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        2,
        ((DefaultSurfaceMetadata) actualNormalVolatilityByExpirySimpleMoneynessResult)
            .getInfo()
            .size());
    assertFalse(
        actualNormalVolatilityByExpirySimpleMoneynessResult.getParameterMetadata().isPresent());
    assertSame(name, actualNormalVolatilityByExpirySimpleMoneynessResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(SurfaceName, DayCount,
   * MoneynessType)} with {@code SurfaceName}, {@code DayCount}, {@code MoneynessType}.
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(SurfaceName,
   * DayCount, MoneynessType)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpirySimpleMoneyness(SurfaceName, DayCount, MoneynessType) with 'SurfaceName', 'DayCount', 'MoneynessType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.normalVolatilityByExpirySimpleMoneyness(SurfaceName, DayCount, MoneynessType)"
  })
  void testNormalVolatilityByExpirySimpleMoneynessWithSurfaceNameDayCountMoneynessType2() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualNormalVolatilityByExpirySimpleMoneynessResult =
        Surfaces.normalVolatilityByExpirySimpleMoneyness(name, mock(DayCount.class), null);

    // Assert
    assertTrue(
        actualNormalVolatilityByExpirySimpleMoneynessResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType yValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getYValueType();
    assertEquals("SimpleMoneyness", yValueType.getName());
    assertEquals("SimpleMoneyness", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1,
        ((DefaultSurfaceMetadata) actualNormalVolatilityByExpirySimpleMoneynessResult)
            .getInfo()
            .size());
    assertFalse(
        actualNormalVolatilityByExpirySimpleMoneynessResult.getParameterMetadata().isPresent());
    assertSame(name, actualNormalVolatilityByExpirySimpleMoneynessResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(SurfaceName, DayCount,
   * MoneynessType)} with {@code SurfaceName}, {@code DayCount}, {@code MoneynessType}.
   *
   * <p>Method under test: {@link Surfaces#normalVolatilityByExpirySimpleMoneyness(SurfaceName,
   * DayCount, MoneynessType)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpirySimpleMoneyness(SurfaceName, DayCount, MoneynessType) with 'SurfaceName', 'DayCount', 'MoneynessType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.normalVolatilityByExpirySimpleMoneyness(SurfaceName, DayCount, MoneynessType)"
  })
  void testNormalVolatilityByExpirySimpleMoneynessWithSurfaceNameDayCountMoneynessType3() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualNormalVolatilityByExpirySimpleMoneynessResult =
        Surfaces.normalVolatilityByExpirySimpleMoneyness(name, null, null);

    // Assert
    assertTrue(
        actualNormalVolatilityByExpirySimpleMoneynessResult instanceof DefaultSurfaceMetadata);
    ValueType zValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getZValueType();
    assertEquals("NormalVolatility", zValueType.getName());
    assertEquals("NormalVolatility", zValueType.toString());
    ValueType yValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getYValueType();
    assertEquals("SimpleMoneyness", yValueType.getName());
    assertEquals("SimpleMoneyness", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpirySimpleMoneynessResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(
        actualNormalVolatilityByExpirySimpleMoneynessResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualNormalVolatilityByExpirySimpleMoneynessResult)
            .getInfo()
            .isEmpty());
    assertSame(name, actualNormalVolatilityByExpirySimpleMoneynessResult.getSurfaceName());
  }

  /**
   * Test {@link Surfaces#sabrParameterByExpiryTenor(String, DayCount, ValueType)} with {@code
   * String}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Surfaces#sabrParameterByExpiryTenor(String, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiryTenor(String, DayCount, ValueType) with 'String', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.sabrParameterByExpiryTenor(String, DayCount, ValueType)"
  })
  void testSabrParameterByExpiryTenorWithStringDayCountValueType() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Surfaces.sabrParameterByExpiryTenor(
                "Name", mock(DayCount.class), ValueType.BLACK_VOLATILITY));
  }

  /**
   * Test {@link Surfaces#sabrParameterByExpiryTenor(String, DayCount, ValueType)} with {@code
   * String}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Surfaces#sabrParameterByExpiryTenor(String, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiryTenor(String, DayCount, ValueType) with 'String', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.sabrParameterByExpiryTenor(String, DayCount, ValueType)"
  })
  void testSabrParameterByExpiryTenorWithStringDayCountValueType2() {
    // Arrange and Act
    SurfaceMetadata actualSabrParameterByExpiryTenorResult =
        Surfaces.sabrParameterByExpiryTenor("Name", mock(DayCount.class), ValueType.SABR_ALPHA);

    // Assert
    assertTrue(actualSabrParameterByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    SurfaceName surfaceName = actualSabrParameterByExpiryTenorResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualSabrParameterByExpiryTenorResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryTenorResult.getParameterMetadata().isPresent());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
    assertSame(ValueType.SABR_ALPHA, actualSabrParameterByExpiryTenorResult.getZValueType());
    ValueType valueType = ValueType.YEAR_FRACTION;
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getXValueType());
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#sabrParameterByExpiryTenor(String, DayCount, ValueType)} with {@code
   * String}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Surfaces#sabrParameterByExpiryTenor(String, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiryTenor(String, DayCount, ValueType) with 'String', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.sabrParameterByExpiryTenor(String, DayCount, ValueType)"
  })
  void testSabrParameterByExpiryTenorWithStringDayCountValueType3() {
    // Arrange and Act
    SurfaceMetadata actualSabrParameterByExpiryTenorResult =
        Surfaces.sabrParameterByExpiryTenor("Name", mock(DayCount.class), ValueType.SABR_BETA);

    // Assert
    assertTrue(actualSabrParameterByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    SurfaceName surfaceName = actualSabrParameterByExpiryTenorResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualSabrParameterByExpiryTenorResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryTenorResult.getParameterMetadata().isPresent());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
    assertSame(ValueType.SABR_BETA, actualSabrParameterByExpiryTenorResult.getZValueType());
    ValueType valueType = ValueType.YEAR_FRACTION;
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getXValueType());
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#sabrParameterByExpiryTenor(String, DayCount, ValueType)} with {@code
   * String}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Surfaces#sabrParameterByExpiryTenor(String, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiryTenor(String, DayCount, ValueType) with 'String', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.sabrParameterByExpiryTenor(String, DayCount, ValueType)"
  })
  void testSabrParameterByExpiryTenorWithStringDayCountValueType4() {
    // Arrange and Act
    SurfaceMetadata actualSabrParameterByExpiryTenorResult =
        Surfaces.sabrParameterByExpiryTenor("Name", mock(DayCount.class), ValueType.SABR_NU);

    // Assert
    assertTrue(actualSabrParameterByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    SurfaceName surfaceName = actualSabrParameterByExpiryTenorResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualSabrParameterByExpiryTenorResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryTenorResult.getParameterMetadata().isPresent());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
    assertSame(ValueType.SABR_NU, actualSabrParameterByExpiryTenorResult.getZValueType());
    ValueType valueType = ValueType.YEAR_FRACTION;
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getXValueType());
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#sabrParameterByExpiryTenor(String, DayCount, ValueType)} with {@code
   * String}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Surfaces#sabrParameterByExpiryTenor(String, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiryTenor(String, DayCount, ValueType) with 'String', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.sabrParameterByExpiryTenor(String, DayCount, ValueType)"
  })
  void testSabrParameterByExpiryTenorWithStringDayCountValueType5() {
    // Arrange and Act
    SurfaceMetadata actualSabrParameterByExpiryTenorResult =
        Surfaces.sabrParameterByExpiryTenor("Name", mock(DayCount.class), ValueType.SABR_RHO);

    // Assert
    assertTrue(actualSabrParameterByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    SurfaceName surfaceName = actualSabrParameterByExpiryTenorResult.getSurfaceName();
    assertEquals("Name", surfaceName.getName());
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualSabrParameterByExpiryTenorResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryTenorResult.getParameterMetadata().isPresent());
    Class<Surface> expectedMarketDataType = Surface.class;
    assertEquals(expectedMarketDataType, surfaceName.getMarketDataType());
    assertSame(ValueType.SABR_RHO, actualSabrParameterByExpiryTenorResult.getZValueType());
    ValueType valueType = ValueType.YEAR_FRACTION;
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getXValueType());
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)} with {@code
   * SurfaceName}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount,
   * ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType) with 'SurfaceName', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)"
  })
  void testSabrParameterByExpiryTenorWithSurfaceNameDayCountValueType() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Surfaces.sabrParameterByExpiryTenor(
                SurfaceName.of("Name"), mock(DayCount.class), ValueType.BLACK_VOLATILITY));
  }

  /**
   * Test {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)} with {@code
   * SurfaceName}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount,
   * ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType) with 'SurfaceName', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)"
  })
  void testSabrParameterByExpiryTenorWithSurfaceNameDayCountValueType2() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualSabrParameterByExpiryTenorResult =
        Surfaces.sabrParameterByExpiryTenor(name, mock(DayCount.class), ValueType.SABR_ALPHA);

    // Assert
    assertTrue(actualSabrParameterByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualSabrParameterByExpiryTenorResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryTenorResult.getParameterMetadata().isPresent());
    assertSame(name, actualSabrParameterByExpiryTenorResult.getSurfaceName());
    assertSame(ValueType.SABR_ALPHA, actualSabrParameterByExpiryTenorResult.getZValueType());
    ValueType valueType = ValueType.YEAR_FRACTION;
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getXValueType());
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)} with {@code
   * SurfaceName}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount,
   * ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType) with 'SurfaceName', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)"
  })
  void testSabrParameterByExpiryTenorWithSurfaceNameDayCountValueType3() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualSabrParameterByExpiryTenorResult =
        Surfaces.sabrParameterByExpiryTenor(name, mock(DayCount.class), ValueType.SABR_BETA);

    // Assert
    assertTrue(actualSabrParameterByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualSabrParameterByExpiryTenorResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryTenorResult.getParameterMetadata().isPresent());
    assertSame(name, actualSabrParameterByExpiryTenorResult.getSurfaceName());
    assertSame(ValueType.SABR_BETA, actualSabrParameterByExpiryTenorResult.getZValueType());
    ValueType valueType = ValueType.YEAR_FRACTION;
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getXValueType());
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)} with {@code
   * SurfaceName}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount,
   * ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType) with 'SurfaceName', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)"
  })
  void testSabrParameterByExpiryTenorWithSurfaceNameDayCountValueType4() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualSabrParameterByExpiryTenorResult =
        Surfaces.sabrParameterByExpiryTenor(name, null, ValueType.SABR_ALPHA);

    // Assert
    assertTrue(actualSabrParameterByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    assertFalse(actualSabrParameterByExpiryTenorResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultSurfaceMetadata) actualSabrParameterByExpiryTenorResult).getInfo().isEmpty());
    assertSame(name, actualSabrParameterByExpiryTenorResult.getSurfaceName());
    assertSame(ValueType.SABR_ALPHA, actualSabrParameterByExpiryTenorResult.getZValueType());
    ValueType valueType = ValueType.YEAR_FRACTION;
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getXValueType());
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)} with {@code
   * SurfaceName}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount,
   * ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType) with 'SurfaceName', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)"
  })
  void testSabrParameterByExpiryTenorWithSurfaceNameDayCountValueType5() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualSabrParameterByExpiryTenorResult =
        Surfaces.sabrParameterByExpiryTenor(name, mock(DayCount.class), ValueType.SABR_NU);

    // Assert
    assertTrue(actualSabrParameterByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualSabrParameterByExpiryTenorResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryTenorResult.getParameterMetadata().isPresent());
    assertSame(name, actualSabrParameterByExpiryTenorResult.getSurfaceName());
    assertSame(ValueType.SABR_NU, actualSabrParameterByExpiryTenorResult.getZValueType());
    ValueType valueType = ValueType.YEAR_FRACTION;
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getXValueType());
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getYValueType());
  }

  /**
   * Test {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)} with {@code
   * SurfaceName}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Surfaces#sabrParameterByExpiryTenor(SurfaceName, DayCount,
   * ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType) with 'SurfaceName', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "SurfaceMetadata Surfaces.sabrParameterByExpiryTenor(SurfaceName, DayCount, ValueType)"
  })
  void testSabrParameterByExpiryTenorWithSurfaceNameDayCountValueType6() {
    // Arrange
    SurfaceName name = SurfaceName.of("Name");

    // Act
    SurfaceMetadata actualSabrParameterByExpiryTenorResult =
        Surfaces.sabrParameterByExpiryTenor(name, mock(DayCount.class), ValueType.SABR_RHO);

    // Assert
    assertTrue(actualSabrParameterByExpiryTenorResult instanceof DefaultSurfaceMetadata);
    assertEquals(
        1, ((DefaultSurfaceMetadata) actualSabrParameterByExpiryTenorResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryTenorResult.getParameterMetadata().isPresent());
    assertSame(name, actualSabrParameterByExpiryTenorResult.getSurfaceName());
    assertSame(ValueType.SABR_RHO, actualSabrParameterByExpiryTenorResult.getZValueType());
    ValueType valueType = ValueType.YEAR_FRACTION;
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getXValueType());
    assertSame(valueType, actualSabrParameterByExpiryTenorResult.getYValueType());
  }
}
