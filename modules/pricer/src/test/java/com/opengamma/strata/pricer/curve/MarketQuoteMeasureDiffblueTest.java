package com.opengamma.strata.pricer.curve;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.market.param.CurrencyParameterSensitivities;
import com.opengamma.strata.market.sensitivity.PointSensitivities;
import com.opengamma.strata.pricer.impl.MockRatesProvider;
import com.opengamma.strata.pricer.rate.RatesProvider;
import com.opengamma.strata.product.ResolvedTrade;
import java.util.function.BiFunction;
import java.util.function.ToDoubleBiFunction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MarketQuoteMeasureDiffblueTest {
  /**
   * Test {@link MarketQuoteMeasure#of(String, Class, ToDoubleBiFunction, BiFunction)}.
   *
   * <ul>
   *   <li>When {@link ToDoubleBiFunction}.
   *   <li>Then return toString is {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link MarketQuoteMeasure#of(String, Class, ToDoubleBiFunction,
   * BiFunction)}
   */
  @Test
  @DisplayName(
      "Test of(String, Class, ToDoubleBiFunction, BiFunction); when ToDoubleBiFunction; then return toString is 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketQuoteMeasure MarketQuoteMeasure.of(String, Class, ToDoubleBiFunction, BiFunction)"
  })
  void testOf_whenToDoubleBiFunction_thenReturnToStringIsName() {
    // Arrange
    Class<ResolvedTrade> tradeType = ResolvedTrade.class;

    // Act
    MarketQuoteMeasure<ResolvedTrade> actualOfResult =
        MarketQuoteMeasure.of(
            "Name", tradeType, mock(ToDoubleBiFunction.class), mock(BiFunction.class));

    // Assert
    assertEquals("Name", actualOfResult.toString());
    Class<ResolvedTrade> expectedTradeType = ResolvedTrade.class;
    assertEquals(expectedTradeType, actualOfResult.getTradeType());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link MarketQuoteMeasure#getTradeType()}
   *   <li>{@link MarketQuoteMeasure#toString()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Class MarketQuoteMeasure.getTradeType()",
    "String MarketQuoteMeasure.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Class<ResolvedTrade> tradeType = ResolvedTrade.class;
    MarketQuoteMeasure<ResolvedTrade> ofResult =
        MarketQuoteMeasure.of(
            "Name", tradeType, mock(ToDoubleBiFunction.class), mock(BiFunction.class));

    // Act
    Class<ResolvedTrade> actualTradeType = ofResult.getTradeType();

    // Assert
    assertEquals("Name", ofResult.toString());
    Class<ResolvedTrade> expectedTradeType = ResolvedTrade.class;
    assertEquals(expectedTradeType, actualTradeType);
  }

  /**
   * Test {@link MarketQuoteMeasure#value(ResolvedTrade, RatesProvider)}.
   *
   * <ul>
   *   <li>Given {@link ToDoubleBiFunction} {@link ToDoubleBiFunction#applyAsDouble(Object, Object)}
   *       return ten.
   *   <li>When {@code null}.
   *   <li>Then return ten.
   * </ul>
   *
   * <p>Method under test: {@link MarketQuoteMeasure#value(ResolvedTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test value(ResolvedTrade, RatesProvider); given ToDoubleBiFunction applyAsDouble(Object, Object) return ten; when 'null'; then return ten")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"double MarketQuoteMeasure.value(ResolvedTrade, RatesProvider)"})
  void testValue_givenToDoubleBiFunctionApplyAsDoubleReturnTen_whenNull_thenReturnTen() {
    // Arrange
    ToDoubleBiFunction<ResolvedTrade, RatesProvider> valueFn = mock(ToDoubleBiFunction.class);
    when(valueFn.applyAsDouble(Mockito.<ResolvedTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(10.0d);
    Class<ResolvedTrade> tradeType = ResolvedTrade.class;

    MarketQuoteMeasure<ResolvedTrade> ofResult =
        MarketQuoteMeasure.of("Name", tradeType, valueFn, mock(BiFunction.class));

    // Act
    double actualValueResult = ofResult.value(null, new MockRatesProvider());

    // Assert
    verify(valueFn).applyAsDouble(isNull(), isA(RatesProvider.class));
    assertEquals(10.0d, actualValueResult);
  }

  /**
   * Test {@link MarketQuoteMeasure#sensitivities(ResolvedTrade, RatesProvider)}.
   *
   * <ul>
   *   <li>Given {@link BiFunction} {@link BiFunction#apply(Object, Object)} return empty.
   *   <li>When {@code null}.
   *   <li>Then return size is zero.
   * </ul>
   *
   * <p>Method under test: {@link MarketQuoteMeasure#sensitivities(ResolvedTrade, RatesProvider)}
   */
  @Test
  @DisplayName(
      "Test sensitivities(ResolvedTrade, RatesProvider); given BiFunction apply(Object, Object) return empty; when 'null'; then return size is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "CurrencyParameterSensitivities MarketQuoteMeasure.sensitivities(ResolvedTrade, RatesProvider)"
  })
  void testSensitivities_givenBiFunctionApplyReturnEmpty_whenNull_thenReturnSizeIsZero() {
    // Arrange
    BiFunction<ResolvedTrade, RatesProvider, PointSensitivities> sensitivityFn =
        mock(BiFunction.class);
    when(sensitivityFn.apply(Mockito.<ResolvedTrade>any(), Mockito.<RatesProvider>any()))
        .thenReturn(PointSensitivities.empty());
    Class<ResolvedTrade> tradeType = ResolvedTrade.class;

    MarketQuoteMeasure<ResolvedTrade> ofResult =
        MarketQuoteMeasure.of("Name", tradeType, mock(ToDoubleBiFunction.class), sensitivityFn);

    // Act
    CurrencyParameterSensitivities actualSensitivitiesResult =
        ofResult.sensitivities(null, new MockRatesProvider());

    // Assert
    verify(sensitivityFn).apply(isNull(), isA(RatesProvider.class));
    assertEquals(0, actualSensitivitiesResult.size());
    assertTrue(actualSensitivitiesResult.getSensitivities().isEmpty());
  }
}
