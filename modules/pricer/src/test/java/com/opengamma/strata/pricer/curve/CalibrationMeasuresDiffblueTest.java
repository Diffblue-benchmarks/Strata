package com.opengamma.strata.pricer.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableSet;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.ResolvedTrade;
import com.opengamma.strata.product.deposit.ResolvedIborFixingDepositTrade;
import com.opengamma.strata.product.deposit.ResolvedTermDepositTrade;
import com.opengamma.strata.product.fx.ResolvedFxSwapTrade;
import com.opengamma.strata.product.index.ResolvedIborFutureTrade;
import com.opengamma.strata.product.index.ResolvedOvernightFutureTrade;
import com.opengamma.strata.product.swap.ResolvedSwapTrade;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class CalibrationMeasuresDiffblueTest {
  /**
   * Test {@link CalibrationMeasures#of(String, CalibrationMeasure[])} with {@code String}, {@code
   * CalibrationMeasure[]}.
   *
   * <ul>
   *   <li>Then return TradeTypes size is one.
   * </ul>
   *
   * <p>Method under test: {@link CalibrationMeasures#of(String, CalibrationMeasure[])}
   */
  @Test
  @DisplayName(
      "Test of(String, CalibrationMeasure[]) with 'String', 'CalibrationMeasure[]'; then return TradeTypes size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalibrationMeasures CalibrationMeasures.of(String, CalibrationMeasure[])"})
  void testOfWithStringCalibrationMeasure_thenReturnTradeTypesSizeIsOne() {
    // Arrange
    CalibrationMeasure<? extends ResolvedTrade> calibrationMeasure = mock(CalibrationMeasure.class);
    Class<ResolvedTrade> forNameResult = ResolvedTrade.class;
    org.mockito.Mockito.<Class<? extends ResolvedTrade>>when(calibrationMeasure.getTradeType())
        .thenReturn(forNameResult);

    // Act
    CalibrationMeasures actualOfResult = CalibrationMeasures.of("Name", calibrationMeasure);

    // Assert
    verify(calibrationMeasure).getTradeType();
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
    ImmutableSet<Class<?>> tradeTypes = actualOfResult.getTradeTypes();
    assertEquals(1, tradeTypes.size());
    assertTrue(tradeTypes.contains(ResolvedTrade.class));
  }

  /**
   * Test {@link CalibrationMeasures#of(String, CalibrationMeasure[])} with {@code String}, {@code
   * CalibrationMeasure[]}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return TradeTypes Empty.
   * </ul>
   *
   * <p>Method under test: {@link CalibrationMeasures#of(String, CalibrationMeasure[])}
   */
  @Test
  @DisplayName(
      "Test of(String, CalibrationMeasure[]) with 'String', 'CalibrationMeasure[]'; when 'Name'; then return TradeTypes Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalibrationMeasures CalibrationMeasures.of(String, CalibrationMeasure[])"})
  void testOfWithStringCalibrationMeasure_whenName_thenReturnTradeTypesEmpty() {
    // Arrange and Act
    CalibrationMeasures actualOfResult = CalibrationMeasures.of("Name");

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
    assertTrue(actualOfResult.getTradeTypes().isEmpty());
  }

  /**
   * Test {@link CalibrationMeasures#of(String, List)} with {@code String}, {@code List}.
   *
   * <ul>
   *   <li>When {@code Name}.
   *   <li>Then return {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link CalibrationMeasures#of(String, List)}
   */
  @Test
  @DisplayName("Test of(String, List) with 'String', 'List'; when 'Name'; then return 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CalibrationMeasures CalibrationMeasures.of(String, List)"})
  void testOfWithStringList_whenName_thenReturnName() {
    // Arrange and Act
    CalibrationMeasures actualOfResult = CalibrationMeasures.of("Name", new ArrayList<>());

    // Assert
    assertEquals("Name", actualOfResult.getName());
    assertEquals("Name", actualOfResult.toString());
    assertTrue(actualOfResult.getTradeTypes().isEmpty());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CalibrationMeasures#getName()}
   *   <li>{@link CalibrationMeasures#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String CalibrationMeasures.getName()",
    "String CalibrationMeasures.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    CalibrationMeasures ofResult = CalibrationMeasures.of("Name", new ArrayList<>());

    // Act
    String actualName = ofResult.getName();

    // Assert
    assertEquals("Name", actualName);
    assertEquals("Name", ofResult.toString());
  }

  /**
   * Test {@link CalibrationMeasures#getTradeTypes()}.
   *
   * <ul>
   *   <li>Given {@link CalibrationMeasures#MARKET_QUOTE}.
   *   <li>Then return size is six.
   * </ul>
   *
   * <p>Method under test: {@link CalibrationMeasures#getTradeTypes()}
   */
  @Test
  @DisplayName("Test getTradeTypes(); given MARKET_QUOTE; then return size is six")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet CalibrationMeasures.getTradeTypes()"})
  void testGetTradeTypes_givenMarket_quote_thenReturnSizeIsSix() {
    // Arrange and Act
    ImmutableSet<Class<?>> actualTradeTypes = CalibrationMeasures.MARKET_QUOTE.getTradeTypes();

    // Assert
    assertEquals(6, actualTradeTypes.size());
    assertTrue(actualTradeTypes.contains(ResolvedIborFixingDepositTrade.class));
    assertTrue(actualTradeTypes.contains(ResolvedTermDepositTrade.class));
    assertTrue(actualTradeTypes.contains(ResolvedIborFutureTrade.class));
    assertTrue(actualTradeTypes.contains(ResolvedOvernightFutureTrade.class));
    assertTrue(actualTradeTypes.contains(ResolvedSwapTrade.class));
  }

  /**
   * Test {@link CalibrationMeasures#getTradeTypes()}.
   *
   * <ul>
   *   <li>Given {@link CalibrationMeasures#PAR_SPREAD}.
   *   <li>Then return size is seven.
   * </ul>
   *
   * <p>Method under test: {@link CalibrationMeasures#getTradeTypes()}
   */
  @Test
  @DisplayName("Test getTradeTypes(); given PAR_SPREAD; then return size is seven")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet CalibrationMeasures.getTradeTypes()"})
  void testGetTradeTypes_givenPar_spread_thenReturnSizeIsSeven() {
    // Arrange and Act
    ImmutableSet<Class<?>> actualTradeTypes = CalibrationMeasures.PAR_SPREAD.getTradeTypes();

    // Assert
    assertEquals(7, actualTradeTypes.size());
    assertTrue(actualTradeTypes.contains(ResolvedIborFixingDepositTrade.class));
    assertTrue(actualTradeTypes.contains(ResolvedTermDepositTrade.class));
    assertTrue(actualTradeTypes.contains(ResolvedFxSwapTrade.class));
    assertTrue(actualTradeTypes.contains(ResolvedIborFutureTrade.class));
    assertTrue(actualTradeTypes.contains(ResolvedOvernightFutureTrade.class));
    assertTrue(actualTradeTypes.contains(ResolvedSwapTrade.class));
  }

  /**
   * Test {@link CalibrationMeasures#getTradeTypes()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link CalibrationMeasures#getTradeTypes()}
   */
  @Test
  @DisplayName("Test getTradeTypes(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableSet CalibrationMeasures.getTradeTypes()"})
  void testGetTradeTypes_thenReturnSizeIsOne() {
    // Arrange
    CalibrationMeasure<? extends ResolvedTrade> calibrationMeasure = mock(CalibrationMeasure.class);
    Class<ResolvedTrade> forNameResult = ResolvedTrade.class;
    org.mockito.Mockito.<Class<? extends ResolvedTrade>>when(calibrationMeasure.getTradeType())
        .thenReturn(forNameResult);

    // Act
    ImmutableSet<Class<?>> actualTradeTypes =
        CalibrationMeasures.of("Name", calibrationMeasure).getTradeTypes();

    // Assert
    verify(calibrationMeasure).getTradeType();
    assertEquals(1, actualTradeTypes.size());
    assertTrue(actualTradeTypes.contains(ResolvedTrade.class));
  }

  /**
   * Test {@link CalibrationMeasures#value(ResolvedTrade, RatesProvider)}.
   *
   * <ul>
   *   <li>Given {@link CalibrationMeasures} with {@code Name} and measures is {@link
   *       ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link CalibrationMeasures#value(ResolvedTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test value(ResolvedTrade, RatesProvider); given CalibrationMeasures with 'Name' and measures is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double CalibrationMeasures.value(ResolvedTrade, RatesProvider)"})
  void testValue_givenCalibrationMeasuresWithNameAndMeasuresIsArrayList() {
    // Arrange
    CalibrationMeasures ofResult = CalibrationMeasures.of("Name", new ArrayList<>());
    ResolvedTrade trade = mock(ResolvedTrade.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.value(trade, new MockRatesProvider()));
  }

  /**
   * Test {@link CalibrationMeasures#value(ResolvedTrade, RatesProvider)}.
   *
   * <ul>
   *   <li>Given {@code ResolvedTrade}.
   *   <li>Then calls {@link CalibrationMeasure#getTradeType()}.
   * </ul>
   *
   * <p>Method under test: {@link CalibrationMeasures#value(ResolvedTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test value(ResolvedTrade, RatesProvider); given 'com.opengamma.strata.product.ResolvedTrade'; then calls getTradeType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double CalibrationMeasures.value(ResolvedTrade, RatesProvider)"})
  void testValue_givenComOpengammaStrataProductResolvedTrade_thenCallsGetTradeType() {
    // Arrange
    CalibrationMeasure<? extends ResolvedTrade> calibrationMeasure = mock(CalibrationMeasure.class);
    Class<ResolvedTrade> forNameResult = ResolvedTrade.class;
    org.mockito.Mockito.<Class<? extends ResolvedTrade>>when(calibrationMeasure.getTradeType())
        .thenReturn(forNameResult);

    ArrayList<CalibrationMeasure<? extends ResolvedTrade>> measures = new ArrayList<>();
    measures.add(calibrationMeasure);
    CalibrationMeasures ofResult = CalibrationMeasures.of("Name", measures);
    ResolvedTrade trade = mock(ResolvedTrade.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class, () -> ofResult.value(trade, new MockRatesProvider()));
    verify(calibrationMeasure).getTradeType();
  }

  /**
   * Test {@link CalibrationMeasures#value(ResolvedTrade, RatesProvider)}.
   *
   * <ul>
   *   <li>Given {@link CalibrationMeasures#MARKET_QUOTE}.
   *   <li>When {@link ResolvedTrade}.
   *   <li>Then throw {@link IllegalArgumentException}.
   * </ul>
   *
   * <p>Method under test: {@link CalibrationMeasures#value(ResolvedTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test value(ResolvedTrade, RatesProvider); given MARKET_QUOTE; when ResolvedTrade; then throw IllegalArgumentException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double CalibrationMeasures.value(ResolvedTrade, RatesProvider)"})
  void testValue_givenMarket_quote_whenResolvedTrade_thenThrowIllegalArgumentException() {
    // Arrange
    ResolvedTrade trade = mock(ResolvedTrade.class);

    // Act and Assert
    assertThrows(
        IllegalArgumentException.class,
        () -> CalibrationMeasures.MARKET_QUOTE.value(trade, new MockRatesProvider()));
  }
}
