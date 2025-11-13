package com.opengamma.strata.calc.marketdata;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.collect.result.Failure;
import com.opengamma.strata.collect.result.FailureReason;
import com.opengamma.strata.collect.result.Result;
import com.opengamma.strata.collect.timeseries.LocalDateDoubleTimeSeries;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TimeSeriesProviderDiffblueTest {
  /**
   * Test {@link TimeSeriesProvider#none()}.
   *
   * <p>Method under test: {@link TimeSeriesProvider#none()}
   */
  @Test
  @DisplayName("Test none()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TimeSeriesProvider TimeSeriesProvider.none()"})
  void testNone() {
    // Arrange and Act
    TimeSeriesProvider actualNoneResult = TimeSeriesProvider.none();
    Result<LocalDateDoubleTimeSeries> actualProvideTimeSeriesResult =
        actualNoneResult.provideTimeSeries(new MarketDataNodeTest().new TestIdA("42"));

    // Assert
    assertTrue(actualNoneResult instanceof NoTimeSeriesProvider);
    Failure failure = actualProvideTimeSeriesResult.getFailure();
    assertEquals(
        "No time-series provider configured, unable to provide time-series for 'TestId1 [id=test~42]'",
        failure.getMessage());
    assertEquals(1, failure.getItems().size());
    assertEquals(FailureReason.MISSING_DATA, failure.getReason());
    Result<LocalDateDoubleTimeSeries> provideTimeSeriesResult =
        actualNoneResult.provideTimeSeries(null);
    assertFalse(provideTimeSeriesResult.isSuccess());
    assertFalse(actualProvideTimeSeriesResult.isSuccess());
    Optional<LocalDateDoubleTimeSeries> getResult = provideTimeSeriesResult.get();
    assertFalse(getResult.isPresent());
    assertTrue(provideTimeSeriesResult.isFailure());
    assertTrue(actualProvideTimeSeriesResult.isFailure());
    assertSame(getResult, actualProvideTimeSeriesResult.get());
  }

  /**
   * Test {@link TimeSeriesProvider#empty()}.
   *
   * <p>Method under test: {@link TimeSeriesProvider#empty()}
   */
  @Test
  @DisplayName("Test empty()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TimeSeriesProvider TimeSeriesProvider.empty()"})
  void testEmpty() {
    // Arrange and Act
    TimeSeriesProvider actualEmptyResult = TimeSeriesProvider.empty();
    Result<LocalDateDoubleTimeSeries> actualProvideTimeSeriesResult =
        actualEmptyResult.provideTimeSeries(new MarketDataNodeTest().new TestIdA("42"));

    // Assert
    assertTrue(actualEmptyResult instanceof EmptyTimeSeriesProvider);
    Result<LocalDateDoubleTimeSeries> provideTimeSeriesResult =
        actualEmptyResult.provideTimeSeries(null);
    assertFalse(provideTimeSeriesResult.isFailure());
    assertTrue(provideTimeSeriesResult.isSuccess());
    assertTrue(provideTimeSeriesResult.get().isPresent());
    assertEquals(provideTimeSeriesResult, actualProvideTimeSeriesResult);
  }
}
