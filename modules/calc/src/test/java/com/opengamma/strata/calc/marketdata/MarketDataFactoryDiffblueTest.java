package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MarketDataFactoryDiffblueTest {
  /**
   * Test {@link MarketDataFactory#of(ObservableDataProvider, TimeSeriesProvider,
   * MarketDataFunction[])} with {@code ObservableDataProvider}, {@code TimeSeriesProvider}, {@code
   * MarketDataFunction[]}.
   *
   * <p>Method under test: {@link MarketDataFactory#of(ObservableDataProvider, TimeSeriesProvider,
   * MarketDataFunction[])}
   */
  @Test
  @DisplayName(
      "Test of(ObservableDataProvider, TimeSeriesProvider, MarketDataFunction[]) with 'ObservableDataProvider', 'TimeSeriesProvider', 'MarketDataFunction[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MarketDataFactory MarketDataFactory.of(ObservableDataProvider, TimeSeriesProvider, MarketDataFunction[])"
  })
  void testOfWithObservableDataProviderTimeSeriesProviderMarketDataFunction() {
    // Arrange, Act and Assert
    assertTrue(
        MarketDataFactory.of(mock(ObservableDataProvider.class), mock(TimeSeriesProvider.class))
            instanceof DefaultMarketDataFactory);
  }
}
