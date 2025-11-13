package com.opengamma.strata.market.curve;

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
import com.opengamma.strata.market.param.ParameterMetadata;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CurvesDiffblueTest {
  /**
   * Test {@link Curves#zeroRates(CurveName, DayCount, List)} with {@code CurveName}, {@code
   * DayCount}, {@code List}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#zeroRates(CurveName, DayCount, List)}
   */
  @Test
  @DisplayName(
      "Test zeroRates(CurveName, DayCount, List) with 'CurveName', 'DayCount', 'List'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.zeroRates(CurveName, DayCount, List)"})
  void testZeroRatesWithCurveNameDayCountList_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act
    CurveMetadata actualZeroRatesResult = Curves.zeroRates(name, dayCount, new ArrayList<>());

    // Assert
    assertTrue(actualZeroRatesResult instanceof DefaultCurveMetadata);
    ValueType xValueType = actualZeroRatesResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    ValueType yValueType = actualZeroRatesResult.getYValueType();
    assertEquals("ZeroRate", yValueType.getName());
    assertEquals("ZeroRate", yValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualZeroRatesResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualZeroRatesResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualZeroRatesResult.getCurveName());
  }

  /**
   * Test {@link Curves#zeroRates(CurveName, DayCount)} with {@code CurveName}, {@code DayCount}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#zeroRates(CurveName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test zeroRates(CurveName, DayCount) with 'CurveName', 'DayCount'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.zeroRates(CurveName, DayCount)"})
  void testZeroRatesWithCurveNameDayCount_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualZeroRatesResult = Curves.zeroRates(name, mock(DayCount.class));

    // Assert
    assertTrue(actualZeroRatesResult instanceof DefaultCurveMetadata);
    ValueType xValueType = actualZeroRatesResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    ValueType yValueType = actualZeroRatesResult.getYValueType();
    assertEquals("ZeroRate", yValueType.getName());
    assertEquals("ZeroRate", yValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualZeroRatesResult).getInfo().size());
    assertFalse(actualZeroRatesResult.getParameterMetadata().isPresent());
    assertSame(name, actualZeroRatesResult.getCurveName());
  }

  /**
   * Test {@link Curves#zeroRates(String, DayCount)} with {@code String}, {@code DayCount}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#zeroRates(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test zeroRates(String, DayCount) with 'String', 'DayCount'; when 'Name'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.zeroRates(String, DayCount)"})
  void testZeroRatesWithStringDayCount_whenName_thenReturnDefaultCurveMetadata() {
    // Arrange and Act
    CurveMetadata actualZeroRatesResult = Curves.zeroRates("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualZeroRatesResult instanceof DefaultCurveMetadata);
    CurveName curveName = actualZeroRatesResult.getCurveName();
    assertEquals("Name", curveName.getName());
    ValueType xValueType = actualZeroRatesResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    ValueType yValueType = actualZeroRatesResult.getYValueType();
    assertEquals("ZeroRate", yValueType.getName());
    assertEquals("ZeroRate", yValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualZeroRatesResult).getInfo().size());
    assertFalse(actualZeroRatesResult.getParameterMetadata().isPresent());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
  }

  /**
   * Test {@link Curves#forwardRates(CurveName, DayCount, List)} with {@code CurveName}, {@code
   * DayCount}, {@code List}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#forwardRates(CurveName, DayCount, List)}
   */
  @Test
  @DisplayName(
      "Test forwardRates(CurveName, DayCount, List) with 'CurveName', 'DayCount', 'List'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.forwardRates(CurveName, DayCount, List)"})
  void testForwardRatesWithCurveNameDayCountList_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act
    CurveMetadata actualForwardRatesResult = Curves.forwardRates(name, dayCount, new ArrayList<>());

    // Assert
    assertTrue(actualForwardRatesResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualForwardRatesResult.getYValueType();
    assertEquals("ForwardRate", yValueType.getName());
    assertEquals("ForwardRate", yValueType.toString());
    ValueType xValueType = actualForwardRatesResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualForwardRatesResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualForwardRatesResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualForwardRatesResult.getCurveName());
  }

  /**
   * Test {@link Curves#forwardRates(CurveName, DayCount)} with {@code CurveName}, {@code DayCount}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#forwardRates(CurveName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test forwardRates(CurveName, DayCount) with 'CurveName', 'DayCount'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.forwardRates(CurveName, DayCount)"})
  void testForwardRatesWithCurveNameDayCount_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualForwardRatesResult = Curves.forwardRates(name, mock(DayCount.class));

    // Assert
    assertTrue(actualForwardRatesResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualForwardRatesResult.getYValueType();
    assertEquals("ForwardRate", yValueType.getName());
    assertEquals("ForwardRate", yValueType.toString());
    ValueType xValueType = actualForwardRatesResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualForwardRatesResult).getInfo().size());
    assertFalse(actualForwardRatesResult.getParameterMetadata().isPresent());
    assertSame(name, actualForwardRatesResult.getCurveName());
  }

  /**
   * Test {@link Curves#forwardRates(String, DayCount)} with {@code String}, {@code DayCount}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#forwardRates(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test forwardRates(String, DayCount) with 'String', 'DayCount'; when 'Name'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.forwardRates(String, DayCount)"})
  void testForwardRatesWithStringDayCount_whenName_thenReturnDefaultCurveMetadata() {
    // Arrange and Act
    CurveMetadata actualForwardRatesResult = Curves.forwardRates("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualForwardRatesResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualForwardRatesResult.getYValueType();
    assertEquals("ForwardRate", yValueType.getName());
    assertEquals("ForwardRate", yValueType.toString());
    CurveName curveName = actualForwardRatesResult.getCurveName();
    assertEquals("Name", curveName.getName());
    ValueType xValueType = actualForwardRatesResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualForwardRatesResult).getInfo().size());
    assertFalse(actualForwardRatesResult.getParameterMetadata().isPresent());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
  }

  /**
   * Test {@link Curves#discountFactors(CurveName, DayCount, List)} with {@code CurveName}, {@code
   * DayCount}, {@code List}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#discountFactors(CurveName, DayCount, List)}
   */
  @Test
  @DisplayName(
      "Test discountFactors(CurveName, DayCount, List) with 'CurveName', 'DayCount', 'List'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.discountFactors(CurveName, DayCount, List)"})
  void testDiscountFactorsWithCurveNameDayCountList_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act
    CurveMetadata actualDiscountFactorsResult =
        Curves.discountFactors(name, dayCount, new ArrayList<>());

    // Assert
    assertTrue(actualDiscountFactorsResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualDiscountFactorsResult.getYValueType();
    assertEquals("DiscountFactor", yValueType.getName());
    assertEquals("DiscountFactor", yValueType.toString());
    ValueType xValueType = actualDiscountFactorsResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualDiscountFactorsResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualDiscountFactorsResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualDiscountFactorsResult.getCurveName());
  }

  /**
   * Test {@link Curves#discountFactors(CurveName, DayCount)} with {@code CurveName}, {@code
   * DayCount}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#discountFactors(CurveName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test discountFactors(CurveName, DayCount) with 'CurveName', 'DayCount'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.discountFactors(CurveName, DayCount)"})
  void testDiscountFactorsWithCurveNameDayCount_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualDiscountFactorsResult = Curves.discountFactors(name, mock(DayCount.class));

    // Assert
    assertTrue(actualDiscountFactorsResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualDiscountFactorsResult.getYValueType();
    assertEquals("DiscountFactor", yValueType.getName());
    assertEquals("DiscountFactor", yValueType.toString());
    ValueType xValueType = actualDiscountFactorsResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualDiscountFactorsResult).getInfo().size());
    assertFalse(actualDiscountFactorsResult.getParameterMetadata().isPresent());
    assertSame(name, actualDiscountFactorsResult.getCurveName());
  }

  /**
   * Test {@link Curves#discountFactors(String, DayCount)} with {@code String}, {@code DayCount}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#discountFactors(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test discountFactors(String, DayCount) with 'String', 'DayCount'; when 'Name'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.discountFactors(String, DayCount)"})
  void testDiscountFactorsWithStringDayCount_whenName_thenReturnDefaultCurveMetadata() {
    // Arrange and Act
    CurveMetadata actualDiscountFactorsResult =
        Curves.discountFactors("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualDiscountFactorsResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualDiscountFactorsResult.getYValueType();
    assertEquals("DiscountFactor", yValueType.getName());
    assertEquals("DiscountFactor", yValueType.toString());
    CurveName curveName = actualDiscountFactorsResult.getCurveName();
    assertEquals("Name", curveName.getName());
    ValueType xValueType = actualDiscountFactorsResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualDiscountFactorsResult).getInfo().size());
    assertFalse(actualDiscountFactorsResult.getParameterMetadata().isPresent());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
  }

  /**
   * Test {@link Curves#prices(CurveName, List)} with {@code CurveName}, {@code List}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#prices(CurveName, List)}
   */
  @Test
  @DisplayName(
      "Test prices(CurveName, List) with 'CurveName', 'List'; when CurveName with 'Name'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.prices(CurveName, List)"})
  void testPricesWithCurveNameList_whenCurveNameWithName_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualPricesResult = Curves.prices(name, new ArrayList<>());

    // Assert
    assertTrue(actualPricesResult instanceof DefaultCurveMetadata);
    ValueType xValueType = actualPricesResult.getXValueType();
    assertEquals("Months", xValueType.getName());
    assertEquals("Months", xValueType.toString());
    ValueType yValueType = actualPricesResult.getYValueType();
    assertEquals("PriceIndex", yValueType.getName());
    assertEquals("PriceIndex", yValueType.toString());
    assertTrue(((DefaultCurveMetadata) actualPricesResult).getInfo().isEmpty());
    Optional<List<ParameterMetadata>> parameterMetadata = actualPricesResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualPricesResult.getCurveName());
  }

  /**
   * Test {@link Curves#prices(CurveName)} with {@code CurveName}.
   *
   * <ul>
   *   <li>When {@link CurveName} with {@code Name}.
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#prices(CurveName)}
   */
  @Test
  @DisplayName(
      "Test prices(CurveName) with 'CurveName'; when CurveName with 'Name'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.prices(CurveName)"})
  void testPricesWithCurveName_whenCurveNameWithName_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualPricesResult = Curves.prices(name);

    // Assert
    assertTrue(actualPricesResult instanceof DefaultCurveMetadata);
    ValueType xValueType = actualPricesResult.getXValueType();
    assertEquals("Months", xValueType.getName());
    assertEquals("Months", xValueType.toString());
    ValueType yValueType = actualPricesResult.getYValueType();
    assertEquals("PriceIndex", yValueType.getName());
    assertEquals("PriceIndex", yValueType.toString());
    assertFalse(actualPricesResult.getParameterMetadata().isPresent());
    assertTrue(((DefaultCurveMetadata) actualPricesResult).getInfo().isEmpty());
    assertSame(name, actualPricesResult.getCurveName());
  }

  /**
   * Test {@link Curves#prices(String)} with {@code String}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#prices(String)}
   */
  @Test
  @DisplayName("Test prices(String) with 'String'; when 'Name'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.prices(String)"})
  void testPricesWithString_whenName_thenReturnDefaultCurveMetadata() {
    // Arrange and Act
    CurveMetadata actualPricesResult = Curves.prices("Name");

    // Assert
    assertTrue(actualPricesResult instanceof DefaultCurveMetadata);
    ValueType xValueType = actualPricesResult.getXValueType();
    assertEquals("Months", xValueType.getName());
    assertEquals("Months", xValueType.toString());
    CurveName curveName = actualPricesResult.getCurveName();
    assertEquals("Name", curveName.getName());
    ValueType yValueType = actualPricesResult.getYValueType();
    assertEquals("PriceIndex", yValueType.getName());
    assertEquals("PriceIndex", yValueType.toString());
    assertFalse(actualPricesResult.getParameterMetadata().isPresent());
    assertTrue(((DefaultCurveMetadata) actualPricesResult).getInfo().isEmpty());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
  }

  /**
   * Test {@link Curves#blackVolatilityByExpiry(CurveName, DayCount, List)} with {@code CurveName},
   * {@code DayCount}, {@code List}.
   *
   * <p>Method under test: {@link Curves#blackVolatilityByExpiry(CurveName, DayCount, List)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiry(CurveName, DayCount, List) with 'CurveName', 'DayCount', 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.blackVolatilityByExpiry(CurveName, DayCount, List)"})
  void testBlackVolatilityByExpiryWithCurveNameDayCountList() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act
    CurveMetadata actualBlackVolatilityByExpiryResult =
        Curves.blackVolatilityByExpiry(name, dayCount, new ArrayList<>());

    // Assert
    assertTrue(actualBlackVolatilityByExpiryResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualBlackVolatilityByExpiryResult.getYValueType();
    assertEquals("BlackVolatility", yValueType.getName());
    assertEquals("BlackVolatility", yValueType.toString());
    ValueType xValueType = actualBlackVolatilityByExpiryResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualBlackVolatilityByExpiryResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualBlackVolatilityByExpiryResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualBlackVolatilityByExpiryResult.getCurveName());
  }

  /**
   * Test {@link Curves#blackVolatilityByExpiry(CurveName, DayCount)} with {@code CurveName}, {@code
   * DayCount}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#blackVolatilityByExpiry(CurveName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiry(CurveName, DayCount) with 'CurveName', 'DayCount'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.blackVolatilityByExpiry(CurveName, DayCount)"})
  void testBlackVolatilityByExpiryWithCurveNameDayCount_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualBlackVolatilityByExpiryResult =
        Curves.blackVolatilityByExpiry(name, mock(DayCount.class));

    // Assert
    assertTrue(actualBlackVolatilityByExpiryResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualBlackVolatilityByExpiryResult.getYValueType();
    assertEquals("BlackVolatility", yValueType.getName());
    assertEquals("BlackVolatility", yValueType.toString());
    ValueType xValueType = actualBlackVolatilityByExpiryResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualBlackVolatilityByExpiryResult).getInfo().size());
    assertFalse(actualBlackVolatilityByExpiryResult.getParameterMetadata().isPresent());
    assertSame(name, actualBlackVolatilityByExpiryResult.getCurveName());
  }

  /**
   * Test {@link Curves#blackVolatilityByExpiry(String, DayCount)} with {@code String}, {@code
   * DayCount}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#blackVolatilityByExpiry(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test blackVolatilityByExpiry(String, DayCount) with 'String', 'DayCount'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.blackVolatilityByExpiry(String, DayCount)"})
  void testBlackVolatilityByExpiryWithStringDayCount_thenReturnDefaultCurveMetadata() {
    // Arrange and Act
    CurveMetadata actualBlackVolatilityByExpiryResult =
        Curves.blackVolatilityByExpiry("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualBlackVolatilityByExpiryResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualBlackVolatilityByExpiryResult.getYValueType();
    assertEquals("BlackVolatility", yValueType.getName());
    assertEquals("BlackVolatility", yValueType.toString());
    CurveName curveName = actualBlackVolatilityByExpiryResult.getCurveName();
    assertEquals("Name", curveName.getName());
    ValueType xValueType = actualBlackVolatilityByExpiryResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualBlackVolatilityByExpiryResult).getInfo().size());
    assertFalse(actualBlackVolatilityByExpiryResult.getParameterMetadata().isPresent());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
  }

  /**
   * Test {@link Curves#normalVolatilityByExpiry(CurveName, DayCount, List)} with {@code CurveName},
   * {@code DayCount}, {@code List}.
   *
   * <p>Method under test: {@link Curves#normalVolatilityByExpiry(CurveName, DayCount, List)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiry(CurveName, DayCount, List) with 'CurveName', 'DayCount', 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.normalVolatilityByExpiry(CurveName, DayCount, List)"})
  void testNormalVolatilityByExpiryWithCurveNameDayCountList() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act
    CurveMetadata actualNormalVolatilityByExpiryResult =
        Curves.normalVolatilityByExpiry(name, dayCount, new ArrayList<>());

    // Assert
    assertTrue(actualNormalVolatilityByExpiryResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualNormalVolatilityByExpiryResult.getYValueType();
    assertEquals("NormalVolatility", yValueType.getName());
    assertEquals("NormalVolatility", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualNormalVolatilityByExpiryResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualNormalVolatilityByExpiryResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualNormalVolatilityByExpiryResult.getCurveName());
  }

  /**
   * Test {@link Curves#normalVolatilityByExpiry(CurveName, DayCount)} with {@code CurveName},
   * {@code DayCount}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#normalVolatilityByExpiry(CurveName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiry(CurveName, DayCount) with 'CurveName', 'DayCount'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.normalVolatilityByExpiry(CurveName, DayCount)"})
  void testNormalVolatilityByExpiryWithCurveNameDayCount_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualNormalVolatilityByExpiryResult =
        Curves.normalVolatilityByExpiry(name, mock(DayCount.class));

    // Assert
    assertTrue(actualNormalVolatilityByExpiryResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualNormalVolatilityByExpiryResult.getYValueType();
    assertEquals("NormalVolatility", yValueType.getName());
    assertEquals("NormalVolatility", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualNormalVolatilityByExpiryResult).getInfo().size());
    assertFalse(actualNormalVolatilityByExpiryResult.getParameterMetadata().isPresent());
    assertSame(name, actualNormalVolatilityByExpiryResult.getCurveName());
  }

  /**
   * Test {@link Curves#normalVolatilityByExpiry(String, DayCount)} with {@code String}, {@code
   * DayCount}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#normalVolatilityByExpiry(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test normalVolatilityByExpiry(String, DayCount) with 'String', 'DayCount'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.normalVolatilityByExpiry(String, DayCount)"})
  void testNormalVolatilityByExpiryWithStringDayCount_thenReturnDefaultCurveMetadata() {
    // Arrange and Act
    CurveMetadata actualNormalVolatilityByExpiryResult =
        Curves.normalVolatilityByExpiry("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualNormalVolatilityByExpiryResult instanceof DefaultCurveMetadata);
    CurveName curveName = actualNormalVolatilityByExpiryResult.getCurveName();
    assertEquals("Name", curveName.getName());
    ValueType yValueType = actualNormalVolatilityByExpiryResult.getYValueType();
    assertEquals("NormalVolatility", yValueType.getName());
    assertEquals("NormalVolatility", yValueType.toString());
    ValueType xValueType = actualNormalVolatilityByExpiryResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualNormalVolatilityByExpiryResult).getInfo().size());
    assertFalse(actualNormalVolatilityByExpiryResult.getParameterMetadata().isPresent());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
  }

  /**
   * Test {@link Curves#recoveryRates(CurveName, DayCount, List)} with {@code CurveName}, {@code
   * DayCount}, {@code List}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#recoveryRates(CurveName, DayCount, List)}
   */
  @Test
  @DisplayName(
      "Test recoveryRates(CurveName, DayCount, List) with 'CurveName', 'DayCount', 'List'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.recoveryRates(CurveName, DayCount, List)"})
  void testRecoveryRatesWithCurveNameDayCountList_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act
    CurveMetadata actualRecoveryRatesResult =
        Curves.recoveryRates(name, dayCount, new ArrayList<>());

    // Assert
    assertTrue(actualRecoveryRatesResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualRecoveryRatesResult.getYValueType();
    assertEquals("RecoveryRate", yValueType.getName());
    assertEquals("RecoveryRate", yValueType.toString());
    ValueType xValueType = actualRecoveryRatesResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualRecoveryRatesResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualRecoveryRatesResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualRecoveryRatesResult.getCurveName());
  }

  /**
   * Test {@link Curves#recoveryRates(CurveName, DayCount)} with {@code CurveName}, {@code
   * DayCount}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#recoveryRates(CurveName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test recoveryRates(CurveName, DayCount) with 'CurveName', 'DayCount'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.recoveryRates(CurveName, DayCount)"})
  void testRecoveryRatesWithCurveNameDayCount_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualRecoveryRatesResult = Curves.recoveryRates(name, mock(DayCount.class));

    // Assert
    assertTrue(actualRecoveryRatesResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualRecoveryRatesResult.getYValueType();
    assertEquals("RecoveryRate", yValueType.getName());
    assertEquals("RecoveryRate", yValueType.toString());
    ValueType xValueType = actualRecoveryRatesResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualRecoveryRatesResult).getInfo().size());
    assertFalse(actualRecoveryRatesResult.getParameterMetadata().isPresent());
    assertSame(name, actualRecoveryRatesResult.getCurveName());
  }

  /**
   * Test {@link Curves#recoveryRates(String, DayCount)} with {@code String}, {@code DayCount}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#recoveryRates(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test recoveryRates(String, DayCount) with 'String', 'DayCount'; when 'Name'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.recoveryRates(String, DayCount)"})
  void testRecoveryRatesWithStringDayCount_whenName_thenReturnDefaultCurveMetadata() {
    // Arrange and Act
    CurveMetadata actualRecoveryRatesResult = Curves.recoveryRates("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualRecoveryRatesResult instanceof DefaultCurveMetadata);
    CurveName curveName = actualRecoveryRatesResult.getCurveName();
    assertEquals("Name", curveName.getName());
    ValueType yValueType = actualRecoveryRatesResult.getYValueType();
    assertEquals("RecoveryRate", yValueType.getName());
    assertEquals("RecoveryRate", yValueType.toString());
    ValueType xValueType = actualRecoveryRatesResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualRecoveryRatesResult).getInfo().size());
    assertFalse(actualRecoveryRatesResult.getParameterMetadata().isPresent());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)} with {@code
   * CurveName}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(CurveName, DayCount, ValueType) with 'CurveName', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.sabrParameterByExpiry(CurveName, DayCount, ValueType)"})
  void testSabrParameterByExpiryWithCurveNameDayCountValueType() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Curves.sabrParameterByExpiry(
                CurveName.of("Name"), mock(DayCount.class), ValueType.BLACK_VOLATILITY));
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)} with {@code
   * CurveName}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(CurveName, DayCount, ValueType) with 'CurveName', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.sabrParameterByExpiry(CurveName, DayCount, ValueType)"})
  void testSabrParameterByExpiryWithCurveNameDayCountValueType2() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry(name, mock(DayCount.class), ValueType.SABR_ALPHA);

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryResult.getParameterMetadata().isPresent());
    assertSame(name, actualSabrParameterByExpiryResult.getCurveName());
    assertSame(ValueType.SABR_ALPHA, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)} with {@code
   * CurveName}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(CurveName, DayCount, ValueType) with 'CurveName', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.sabrParameterByExpiry(CurveName, DayCount, ValueType)"})
  void testSabrParameterByExpiryWithCurveNameDayCountValueType3() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry(name, mock(DayCount.class), ValueType.SABR_BETA);

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryResult.getParameterMetadata().isPresent());
    assertSame(name, actualSabrParameterByExpiryResult.getCurveName());
    assertSame(ValueType.SABR_BETA, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)} with {@code
   * CurveName}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(CurveName, DayCount, ValueType) with 'CurveName', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.sabrParameterByExpiry(CurveName, DayCount, ValueType)"})
  void testSabrParameterByExpiryWithCurveNameDayCountValueType4() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry(name, mock(DayCount.class), ValueType.SABR_NU);

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryResult.getParameterMetadata().isPresent());
    assertSame(name, actualSabrParameterByExpiryResult.getCurveName());
    assertSame(ValueType.SABR_NU, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)} with {@code
   * CurveName}, {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(CurveName, DayCount, ValueType) with 'CurveName', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.sabrParameterByExpiry(CurveName, DayCount, ValueType)"})
  void testSabrParameterByExpiryWithCurveNameDayCountValueType5() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry(name, mock(DayCount.class), ValueType.SABR_RHO);

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryResult.getParameterMetadata().isPresent());
    assertSame(name, actualSabrParameterByExpiryResult.getCurveName());
    assertSame(ValueType.SABR_RHO, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType, List)} with {@code
   * CurveName}, {@code DayCount}, {@code ValueType}, {@code List}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType,
   * List)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(CurveName, DayCount, ValueType, List) with 'CurveName', 'DayCount', 'ValueType', 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveMetadata Curves.sabrParameterByExpiry(CurveName, DayCount, ValueType, List)"
  })
  void testSabrParameterByExpiryWithCurveNameDayCountValueTypeList() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Curves.sabrParameterByExpiry(
                name, dayCount, ValueType.BLACK_VOLATILITY, new ArrayList<>()));
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType, List)} with {@code
   * CurveName}, {@code DayCount}, {@code ValueType}, {@code List}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType,
   * List)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(CurveName, DayCount, ValueType, List) with 'CurveName', 'DayCount', 'ValueType', 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveMetadata Curves.sabrParameterByExpiry(CurveName, DayCount, ValueType, List)"
  })
  void testSabrParameterByExpiryWithCurveNameDayCountValueTypeList2() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry(name, dayCount, ValueType.SABR_ALPHA, new ArrayList<>());

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualSabrParameterByExpiryResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualSabrParameterByExpiryResult.getCurveName());
    assertSame(ValueType.SABR_ALPHA, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType, List)} with {@code
   * CurveName}, {@code DayCount}, {@code ValueType}, {@code List}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType,
   * List)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(CurveName, DayCount, ValueType, List) with 'CurveName', 'DayCount', 'ValueType', 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveMetadata Curves.sabrParameterByExpiry(CurveName, DayCount, ValueType, List)"
  })
  void testSabrParameterByExpiryWithCurveNameDayCountValueTypeList3() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry(name, dayCount, ValueType.SABR_BETA, new ArrayList<>());

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualSabrParameterByExpiryResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualSabrParameterByExpiryResult.getCurveName());
    assertSame(ValueType.SABR_BETA, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType, List)} with {@code
   * CurveName}, {@code DayCount}, {@code ValueType}, {@code List}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType,
   * List)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(CurveName, DayCount, ValueType, List) with 'CurveName', 'DayCount', 'ValueType', 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveMetadata Curves.sabrParameterByExpiry(CurveName, DayCount, ValueType, List)"
  })
  void testSabrParameterByExpiryWithCurveNameDayCountValueTypeList4() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry(name, dayCount, ValueType.SABR_NU, new ArrayList<>());

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualSabrParameterByExpiryResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualSabrParameterByExpiryResult.getCurveName());
    assertSame(ValueType.SABR_NU, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType, List)} with {@code
   * CurveName}, {@code DayCount}, {@code ValueType}, {@code List}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType,
   * List)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(CurveName, DayCount, ValueType, List) with 'CurveName', 'DayCount', 'ValueType', 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurveMetadata Curves.sabrParameterByExpiry(CurveName, DayCount, ValueType, List)"
  })
  void testSabrParameterByExpiryWithCurveNameDayCountValueTypeList5() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry(name, dayCount, ValueType.SABR_RHO, new ArrayList<>());

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualSabrParameterByExpiryResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualSabrParameterByExpiryResult.getCurveName());
    assertSame(ValueType.SABR_RHO, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)} with {@code
   * CurveName}, {@code DayCount}, {@code ValueType}.
   *
   * <ul>
   *   <li>Then return Info Empty.
   * </ul>
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(CurveName, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(CurveName, DayCount, ValueType) with 'CurveName', 'DayCount', 'ValueType'; then return Info Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.sabrParameterByExpiry(CurveName, DayCount, ValueType)"})
  void testSabrParameterByExpiryWithCurveNameDayCountValueType_thenReturnInfoEmpty() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry(name, null, ValueType.SABR_ALPHA);

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    assertFalse(actualSabrParameterByExpiryResult.getParameterMetadata().isPresent());
    assertTrue(((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().isEmpty());
    assertSame(name, actualSabrParameterByExpiryResult.getCurveName());
    assertSame(ValueType.SABR_ALPHA, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(String, DayCount, ValueType)} with {@code String},
   * {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(String, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(String, DayCount, ValueType) with 'String', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.sabrParameterByExpiry(String, DayCount, ValueType)"})
  void testSabrParameterByExpiryWithStringDayCountValueType() {
    // Arrange, Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () ->
            Curves.sabrParameterByExpiry("Name", mock(DayCount.class), ValueType.BLACK_VOLATILITY));
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(String, DayCount, ValueType)} with {@code String},
   * {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(String, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(String, DayCount, ValueType) with 'String', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.sabrParameterByExpiry(String, DayCount, ValueType)"})
  void testSabrParameterByExpiryWithStringDayCountValueType2() {
    // Arrange and Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry("Name", mock(DayCount.class), ValueType.SABR_ALPHA);

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    CurveName curveName = actualSabrParameterByExpiryResult.getCurveName();
    assertEquals("Name", curveName.getName());
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryResult.getParameterMetadata().isPresent());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
    assertSame(ValueType.SABR_ALPHA, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(String, DayCount, ValueType)} with {@code String},
   * {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(String, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(String, DayCount, ValueType) with 'String', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.sabrParameterByExpiry(String, DayCount, ValueType)"})
  void testSabrParameterByExpiryWithStringDayCountValueType3() {
    // Arrange and Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry("Name", mock(DayCount.class), ValueType.SABR_BETA);

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    CurveName curveName = actualSabrParameterByExpiryResult.getCurveName();
    assertEquals("Name", curveName.getName());
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryResult.getParameterMetadata().isPresent());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
    assertSame(ValueType.SABR_BETA, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(String, DayCount, ValueType)} with {@code String},
   * {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(String, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(String, DayCount, ValueType) with 'String', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.sabrParameterByExpiry(String, DayCount, ValueType)"})
  void testSabrParameterByExpiryWithStringDayCountValueType4() {
    // Arrange and Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry("Name", mock(DayCount.class), ValueType.SABR_NU);

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    CurveName curveName = actualSabrParameterByExpiryResult.getCurveName();
    assertEquals("Name", curveName.getName());
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryResult.getParameterMetadata().isPresent());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
    assertSame(ValueType.SABR_NU, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#sabrParameterByExpiry(String, DayCount, ValueType)} with {@code String},
   * {@code DayCount}, {@code ValueType}.
   *
   * <p>Method under test: {@link Curves#sabrParameterByExpiry(String, DayCount, ValueType)}
   */
  @Test
  @DisplayName(
      "Test sabrParameterByExpiry(String, DayCount, ValueType) with 'String', 'DayCount', 'ValueType'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.sabrParameterByExpiry(String, DayCount, ValueType)"})
  void testSabrParameterByExpiryWithStringDayCountValueType5() {
    // Arrange and Act
    CurveMetadata actualSabrParameterByExpiryResult =
        Curves.sabrParameterByExpiry("Name", mock(DayCount.class), ValueType.SABR_RHO);

    // Assert
    assertTrue(actualSabrParameterByExpiryResult instanceof DefaultCurveMetadata);
    CurveName curveName = actualSabrParameterByExpiryResult.getCurveName();
    assertEquals("Name", curveName.getName());
    assertEquals(1, ((DefaultCurveMetadata) actualSabrParameterByExpiryResult).getInfo().size());
    assertFalse(actualSabrParameterByExpiryResult.getParameterMetadata().isPresent());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
    assertSame(ValueType.SABR_RHO, actualSabrParameterByExpiryResult.getYValueType());
    assertSame(ValueType.YEAR_FRACTION, actualSabrParameterByExpiryResult.getXValueType());
  }

  /**
   * Test {@link Curves#correlationByExpiry(CurveName, DayCount, List)} with {@code CurveName},
   * {@code DayCount}, {@code List}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#correlationByExpiry(CurveName, DayCount, List)}
   */
  @Test
  @DisplayName(
      "Test correlationByExpiry(CurveName, DayCount, List) with 'CurveName', 'DayCount', 'List'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.correlationByExpiry(CurveName, DayCount, List)"})
  void testCorrelationByExpiryWithCurveNameDayCountList_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");
    DayCount dayCount = mock(DayCount.class);

    // Act
    CurveMetadata actualCorrelationByExpiryResult =
        Curves.correlationByExpiry(name, dayCount, new ArrayList<>());

    // Assert
    assertTrue(actualCorrelationByExpiryResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualCorrelationByExpiryResult.getYValueType();
    assertEquals("CORRELATION", yValueType.getName());
    assertEquals("CORRELATION", yValueType.toString());
    ValueType xValueType = actualCorrelationByExpiryResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualCorrelationByExpiryResult).getInfo().size());
    Optional<List<ParameterMetadata>> parameterMetadata =
        actualCorrelationByExpiryResult.getParameterMetadata();
    assertTrue(parameterMetadata.get().isEmpty());
    assertTrue(parameterMetadata.isPresent());
    assertSame(name, actualCorrelationByExpiryResult.getCurveName());
  }

  /**
   * Test {@link Curves#correlationByExpiry(CurveName, DayCount)} with {@code CurveName}, {@code
   * DayCount}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#correlationByExpiry(CurveName, DayCount)}
   */
  @Test
  @DisplayName(
      "Test correlationByExpiry(CurveName, DayCount) with 'CurveName', 'DayCount'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.correlationByExpiry(CurveName, DayCount)"})
  void testCorrelationByExpiryWithCurveNameDayCount_thenReturnDefaultCurveMetadata() {
    // Arrange
    CurveName name = CurveName.of("Name");

    // Act
    CurveMetadata actualCorrelationByExpiryResult =
        Curves.correlationByExpiry(name, mock(DayCount.class));

    // Assert
    assertTrue(actualCorrelationByExpiryResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualCorrelationByExpiryResult.getYValueType();
    assertEquals("CORRELATION", yValueType.getName());
    assertEquals("CORRELATION", yValueType.toString());
    ValueType xValueType = actualCorrelationByExpiryResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualCorrelationByExpiryResult).getInfo().size());
    assertFalse(actualCorrelationByExpiryResult.getParameterMetadata().isPresent());
    assertSame(name, actualCorrelationByExpiryResult.getCurveName());
  }

  /**
   * Test {@link Curves#correlationByExpiry(String, DayCount)} with {@code String}, {@code
   * DayCount}.
   *
   * <ul>
   *   <li>Then return {@link DefaultCurveMetadata}.
   * </ul>
   *
   * <p>Method under test: {@link Curves#correlationByExpiry(String, DayCount)}
   */
  @Test
  @DisplayName(
      "Test correlationByExpiry(String, DayCount) with 'String', 'DayCount'; then return DefaultCurveMetadata")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CurveMetadata Curves.correlationByExpiry(String, DayCount)"})
  void testCorrelationByExpiryWithStringDayCount_thenReturnDefaultCurveMetadata() {
    // Arrange and Act
    CurveMetadata actualCorrelationByExpiryResult =
        Curves.correlationByExpiry("Name", mock(DayCount.class));

    // Assert
    assertTrue(actualCorrelationByExpiryResult instanceof DefaultCurveMetadata);
    ValueType yValueType = actualCorrelationByExpiryResult.getYValueType();
    assertEquals("CORRELATION", yValueType.getName());
    assertEquals("CORRELATION", yValueType.toString());
    CurveName curveName = actualCorrelationByExpiryResult.getCurveName();
    assertEquals("Name", curveName.getName());
    ValueType xValueType = actualCorrelationByExpiryResult.getXValueType();
    assertEquals("YearFraction", xValueType.getName());
    assertEquals("YearFraction", xValueType.toString());
    assertEquals(1, ((DefaultCurveMetadata) actualCorrelationByExpiryResult).getInfo().size());
    assertFalse(actualCorrelationByExpiryResult.getParameterMetadata().isPresent());
    Class<Curve> expectedMarketDataType = Curve.class;
    assertEquals(expectedMarketDataType, curveName.getMarketDataType());
  }
}
