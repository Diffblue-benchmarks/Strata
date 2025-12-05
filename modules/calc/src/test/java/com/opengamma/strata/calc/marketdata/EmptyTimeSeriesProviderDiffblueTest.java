package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.result.Result;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import com.opengamma.strata.data.ObservableId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class EmptyTimeSeriesProviderDiffblueTest {
  /**
   * Test {@link EmptyTimeSeriesProvider#provideTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Given {@link EmptyTimeSeriesProvider} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link EmptyTimeSeriesProvider#provideTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName(
      "Test provideTimeSeries(ObservableId); given EmptyTimeSeriesProvider (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result EmptyTimeSeriesProvider.provideTimeSeries(ObservableId)"})
  void testProvideTimeSeries_givenEmptyTimeSeriesProvider() {
    // Arrange
    EmptyTimeSeriesProvider emptyTimeSeriesProvider = new EmptyTimeSeriesProvider();

    // Act
    Result<LocalDateDoubleTimeSeries> actualProvideTimeSeriesResult =
        emptyTimeSeriesProvider.provideTimeSeries(new MarketDataNodeTest().new TestIdA("42"));

    // Assert
    assertFalse(actualProvideTimeSeriesResult.isFailure());
    assertTrue(actualProvideTimeSeriesResult.isSuccess());
    assertTrue(actualProvideTimeSeriesResult.get().isPresent());
  }

  /**
   * Test {@link EmptyTimeSeriesProvider#provideTimeSeries(ObservableId)}.
   *
   * <ul>
   *   <li>Given {@link EmptyTimeSeriesProvider#INSTANCE}.
   * </ul>
   *
   * <p>Method under test: {@link EmptyTimeSeriesProvider#provideTimeSeries(ObservableId)}
   */
  @Test
  @DisplayName("Test provideTimeSeries(ObservableId); given INSTANCE")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Result EmptyTimeSeriesProvider.provideTimeSeries(ObservableId)"})
  void testProvideTimeSeries_givenInstance() {
    // Arrange and Act
    Result<LocalDateDoubleTimeSeries> actualProvideTimeSeriesResult =
        EmptyTimeSeriesProvider.INSTANCE.provideTimeSeries(
            new MarketDataNodeTest().new TestIdA("42"));

    // Assert
    assertFalse(actualProvideTimeSeriesResult.isFailure());
    assertTrue(actualProvideTimeSeriesResult.isSuccess());
    assertTrue(actualProvideTimeSeriesResult.get().isPresent());
  }
}
