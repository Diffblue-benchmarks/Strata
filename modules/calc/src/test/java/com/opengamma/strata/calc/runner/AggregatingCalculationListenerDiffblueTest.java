package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.calc.Results;
import com.opengamma.strata.collect.result.Result;
import java.util.ArrayList;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AggregatingCalculationListenerDiffblueTest {
  /**
   * Test {@link AggregatingCalculationListener#calculationsComplete()}.
   *
   * <ul>
   *   <li>Then {@link ResultsListener} (default constructor) Future ColumnCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link AggregatingCalculationListener#calculationsComplete()}
   */
  @Test
  @DisplayName(
      "Test calculationsComplete(); then ResultsListener (default constructor) Future ColumnCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AggregatingCalculationListener.calculationsComplete()"})
  void testCalculationsComplete_thenResultsListenerFutureColumnCountIsZero()
      throws InterruptedException, ExecutionException {
    // Arrange
    ResultsListener resultsListener = new ResultsListener();
    ArrayList<CalculationTarget> targets = new ArrayList<>();
    resultsListener.calculationsStarted(targets, new ArrayList<>());

    // Act
    resultsListener.calculationsComplete();

    // Assert
    CompletableFuture<Results> future = resultsListener.getFuture();
    Results getResult = future.get();
    assertEquals(0, getResult.getColumnCount());
    assertEquals(0, getResult.getRowCount());
    ImmutableList<Result<?>> cells = getResult.getCells();
    assertTrue(cells.isEmpty());
    assertTrue(future.isDone());
    assertSame(cells, getResult.getColumns());
  }
}
