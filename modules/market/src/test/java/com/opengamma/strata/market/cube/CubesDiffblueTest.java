package com.opengamma.strata.market.cube;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.date.DayCount;
import com.opengamma.strata.market.ValueType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CubesDiffblueTest {
  /**
   * Test {@link Cubes#normalVolatilityByExpiryTenorStrike(CubeName, DayCount)} with {@code
   * CubeName}, {@code DayCount}.
   *
   * <p>Method under test: {@link Cubes#normalVolatilityByExpiryTenorStrike(CubeName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryTenorStrike(CubeName, DayCount) with 'CubeName', 'DayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CubeMetadata Cubes.normalVolatilityByExpiryTenorStrike(CubeName, DayCount)"})
  void testNormalVolatilityByExpiryTenorStrikeWithCubeNameDayCount() {
    // Arrange
    CubeName name = CubeName.of("Name");

    // Act
    CubeMetadata actualNormalVolatilityByExpiryTenorStrikeResult =
        Cubes.normalVolatilityByExpiryTenorStrike(name, mock(DayCount.class));

    // Assert
    assertTrue(actualNormalVolatilityByExpiryTenorStrikeResult instanceof DefaultCubeMetadata);
    ValueType wValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getWValueType();
    assertEquals("NormalVolatility", wValueType.getName());
    assertEquals("NormalVolatility", wValueType.toString());
    ValueType zValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getZValueType();
    assertEquals("Strike", zValueType.getName());
    assertEquals("Strike", zValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1,
        ((DefaultCubeMetadata) actualNormalVolatilityByExpiryTenorStrikeResult).getInfo().size());
    assertFalse(actualNormalVolatilityByExpiryTenorStrikeResult.getParameterMetadata().isPresent());
    assertSame(xValueType, actualNormalVolatilityByExpiryTenorStrikeResult.getYValueType());
    assertSame(name, actualNormalVolatilityByExpiryTenorStrikeResult.getCubeName());
  }

  /**
   * Test {@link Cubes#normalVolatilityByExpiryTenorStrike(CubeName, DayCount)} with {@code
   * CubeName}, {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Cubes#normalVolatilityByExpiryTenorStrike(CubeName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryTenorStrike(CubeName, DayCount) with 'CubeName', 'DayCount'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CubeMetadata Cubes.normalVolatilityByExpiryTenorStrike(CubeName, DayCount)"})
  void testNormalVolatilityByExpiryTenorStrikeWithCubeNameDayCount_thenReturnInfoEmpty() {
    // Arrange
    CubeName name = CubeName.of("Name");

    // Act
    CubeMetadata actualNormalVolatilityByExpiryTenorStrikeResult =
        Cubes.normalVolatilityByExpiryTenorStrike(name, null);

    // Assert
    assertTrue(actualNormalVolatilityByExpiryTenorStrikeResult instanceof DefaultCubeMetadata);
    ValueType wValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getWValueType();
    assertEquals("NormalVolatility", wValueType.getName());
    assertEquals("NormalVolatility", wValueType.toString());
    ValueType zValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getZValueType();
    assertEquals("Strike", zValueType.getName());
    assertEquals("Strike", zValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualNormalVolatilityByExpiryTenorStrikeResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultCubeMetadata) actualNormalVolatilityByExpiryTenorStrikeResult)
            .getInfo()
            .isEmpty());
    assertSame(xValueType, actualNormalVolatilityByExpiryTenorStrikeResult.getYValueType());
    assertSame(name, actualNormalVolatilityByExpiryTenorStrikeResult.getCubeName());
  }

  /**
   * Test {@link Cubes#normalVolatilityByExpiryTenorStrike(String, DayCount)} with {@code String},
   * {@code DayCount}.
   *
   * <p>Method under test: {@link Cubes#normalVolatilityByExpiryTenorStrike(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryTenorStrike(String, DayCount) with 'String', 'DayCount'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CubeMetadata Cubes.normalVolatilityByExpiryTenorStrike(String, DayCount)"})
  void testNormalVolatilityByExpiryTenorStrikeWithStringDayCount() {
    // Arrange and Act
    CubeMetadata actualNormalVolatilityByExpiryTenorStrikeResult =
        Cubes.normalVolatilityByExpiryTenorStrike("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualNormalVolatilityByExpiryTenorStrikeResult instanceof DefaultCubeMetadata);
    CubeName cubeName = actualNormalVolatilityByExpiryTenorStrikeResult.getCubeName();
    assertEquals("Name", cubeName.getName());
    ValueType wValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getWValueType();
    assertEquals("NormalVolatility", wValueType.getName());
    assertEquals("NormalVolatility", wValueType.toString());
    ValueType zValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getZValueType();
    assertEquals("Strike", zValueType.getName());
    assertEquals("Strike", zValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(
        1,
        ((DefaultCubeMetadata) actualNormalVolatilityByExpiryTenorStrikeResult).getInfo().size());
    assertFalse(actualNormalVolatilityByExpiryTenorStrikeResult.getParameterMetadata().isPresent());
    Class<Cube> expectedMarketDataType = Cube.class;
    assertEquals(expectedMarketDataType, cubeName.getMarketDataType());
    assertSame(xValueType, actualNormalVolatilityByExpiryTenorStrikeResult.getYValueType());
  }

  /**
   * Test {@link Cubes#normalVolatilityByExpiryTenorStrike(String, DayCount)} with {@code String},
   * {@code DayCount}.
   *
   * <ul>
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Cubes#normalVolatilityByExpiryTenorStrike(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiryTenorStrike(String, DayCount) with 'String', 'DayCount'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CubeMetadata Cubes.normalVolatilityByExpiryTenorStrike(String, DayCount)"})
  void testNormalVolatilityByExpiryTenorStrikeWithStringDayCount_thenReturnInfoEmpty() {
    // Arrange and Act
    CubeMetadata actualNormalVolatilityByExpiryTenorStrikeResult =
        Cubes.normalVolatilityByExpiryTenorStrike("Name", null);

    // Assert
    assertTrue(actualNormalVolatilityByExpiryTenorStrikeResult instanceof DefaultCubeMetadata);
    CubeName cubeName = actualNormalVolatilityByExpiryTenorStrikeResult.getCubeName();
    assertEquals("Name", cubeName.getName());
    ValueType wValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getWValueType();
    assertEquals("NormalVolatility", wValueType.getName());
    assertEquals("NormalVolatility", wValueType.toString());
    ValueType zValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getZValueType();
    assertEquals("Strike", zValueType.getName());
    assertEquals("Strike", zValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryTenorStrikeResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertFalse(actualNormalVolatilityByExpiryTenorStrikeResult.getParameterMetadata().isPresent());
    assertTrue(
        ((DefaultCubeMetadata) actualNormalVolatilityByExpiryTenorStrikeResult)
            .getInfo()
            .isEmpty());
    Class<Cube> expectedMarketDataType = Cube.class;
    assertEquals(expectedMarketDataType, cubeName.getMarketDataType());
    assertSame(xValueType, actualNormalVolatilityByExpiryTenorStrikeResult.getYValueType());
  }
}
