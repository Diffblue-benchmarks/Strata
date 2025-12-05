package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.ResolvableCalculationTarget;
import com.opengamma.strata.calc.Column;
import com.opengamma.strata.calc.Column.Builder;
import com.opengamma.strata.calc.ColumnHeader;
import com.opengamma.strata.calc.ColumnName;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.ReportingCurrency;
import com.opengamma.strata.calc.Results;
import com.opengamma.strata.calc.runner.ListenerWrapperTest.Listener;
import com.opengamma.strata.collect.result.Result;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ListenerWrapperDiffblueTest {
  /**
   * Test {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List, List)}.
   *
   * <p>Method under test: {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List,
   * List)}
   */
  @Test
  @DisplayName("Test new ListenerWrapper(CalculationListener, int, List, List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListenerWrapper.<init>(CalculationListener, int, List, List)"})
  void testNewListenerWrapper() throws InterruptedException, ExecutionException {
    // Arrange
    ResultsListener listener = new ResultsListener();

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost"));
    ArrayList<Column> columns = new ArrayList<>();

    // Act
    ListenerWrapper actualListenerWrapper = new ListenerWrapper(listener, 1, targets, columns);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    CalculationResults result = CalculationResults.of(target, new ArrayList<>());
    actualListenerWrapper.accept(result);

    // Assert
    Results getResult = listener.getFuture().get();
    assertEquals(0, getResult.getColumnCount());
    ImmutableList<Result<?>> cells = getResult.getCells();
    assertEquals(columns, cells);
    assertSame(cells, getResult.getColumns());
    assertSame(cells, result.getCells());
  }

  /**
   * Test {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List, List)}.
   *
   * <p>Method under test: {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List,
   * List)}
   */
  @Test
  @DisplayName("Test new ListenerWrapper(CalculationListener, int, List, List)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListenerWrapper.<init>(CalculationListener, int, List, List)"})
  void testNewListenerWrapper2() throws InterruptedException, ExecutionException {
    // Arrange
    ResultsListener listener = new ResultsListener();

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost"));
    targets.add(
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost"));
    ArrayList<Column> columns = new ArrayList<>();

    // Act
    ListenerWrapper actualListenerWrapper = new ListenerWrapper(listener, 1, targets, columns);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    CalculationResults result = CalculationResults.of(target, new ArrayList<>());
    actualListenerWrapper.accept(result);

    // Assert
    Results getResult = listener.getFuture().get();
    assertEquals(0, getResult.getColumnCount());
    ImmutableList<Result<?>> cells = getResult.getCells();
    assertEquals(columns, cells);
    assertSame(cells, getResult.getColumns());
    assertSame(cells, result.getCells());
  }

  /**
   * Test {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List, List)}.
   *
   * <ul>
   *   <li>Then {@link ResultsListener} (default constructor) Future ColumnCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List,
   * List)}
   */
  @Test
  @DisplayName(
      "Test new ListenerWrapper(CalculationListener, int, List, List); then ResultsListener (default constructor) Future ColumnCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListenerWrapper.<init>(CalculationListener, int, List, List)"})
  void testNewListenerWrapper_thenResultsListenerFutureColumnCountIsOne()
      throws InterruptedException, ExecutionException {
    // Arrange
    ResultsListener listener = new ResultsListener();
    ArrayList<CalculationTarget> targets = new ArrayList<>();

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    Builder measureResult = builderResult.measure(measure);
    ColumnName name = ColumnName.of("Name");

    Builder nameResult = measureResult.name(name);
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    ListenerWrapper actualListenerWrapper = new ListenerWrapper(listener, 1, targets, columns);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    actualListenerWrapper.accept(CalculationResults.of(target, new ArrayList<>()));

    // Assert
    Results getResult = listener.getFuture().get();
    assertEquals(1, getResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = getResult.getColumns();
    assertEquals(1, columns2.size());
    assertEquals(1, columns.size());
    ColumnHeader getResult2 = columns2.get(0);
    assertFalse(getResult2.getCurrency().isPresent());
    Column getResult3 = columns.get(0);
    assertSame(name, getResult3.getName());
    assertSame(name, getResult2.getName());
    assertSame(measure, getResult3.getMeasure());
    assertSame(measure, getResult2.getMeasure());
  }

  /**
   * Test {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List, List)}.
   *
   * <ul>
   *   <li>Then {@link ResultsListener} (default constructor) Future ColumnCount is two.
   * </ul>
   *
   * <p>Method under test: {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List,
   * List)}
   */
  @Test
  @DisplayName(
      "Test new ListenerWrapper(CalculationListener, int, List, List); then ResultsListener (default constructor) Future ColumnCount is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListenerWrapper.<init>(CalculationListener, int, List, List)"})
  void testNewListenerWrapper_thenResultsListenerFutureColumnCountIsTwo()
      throws InterruptedException, ExecutionException {
    // Arrange
    ResultsListener listener = new ResultsListener();
    ArrayList<CalculationTarget> targets = new ArrayList<>();

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult2 = Column.builder();
    ImmutableMeasure measure = ImmutableMeasure.of("Name");

    Builder measureResult2 = builderResult2.measure(measure);
    ColumnName name = ColumnName.of("Name");

    Builder nameResult2 = measureResult2.name(name);
    columns.add(
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    ListenerWrapper actualListenerWrapper = new ListenerWrapper(listener, 1, targets, columns);
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    actualListenerWrapper.accept(CalculationResults.of(target, new ArrayList<>()));

    // Assert
    Results getResult = listener.getFuture().get();
    assertEquals(2, getResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = getResult.getColumns();
    assertEquals(2, columns2.size());
    assertEquals(2, columns.size());
    ColumnHeader expectedGetResult = columns2.get(0);
    assertEquals(expectedGetResult, columns2.get(1));
    Column getResult2 = columns.get(1);
    assertSame(name, getResult2.getName());
    assertSame(measure, getResult2.getMeasure());
  }

  /**
   * Test {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List, List)}.
   *
   * <ul>
   *   <li>Then {@link ResultsListener} (default constructor) Future ColumnCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List,
   * List)}
   */
  @Test
  @DisplayName(
      "Test new ListenerWrapper(CalculationListener, int, List, List); then ResultsListener (default constructor) Future ColumnCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListenerWrapper.<init>(CalculationListener, int, List, List)"})
  void testNewListenerWrapper_thenResultsListenerFutureColumnCountIsZero()
      throws InterruptedException, ExecutionException {
    // Arrange
    ResultsListener listener = new ResultsListener();
    ArrayList<CalculationTarget> targets = new ArrayList<>();

    // Act
    ListenerWrapper actualListenerWrapper =
        new ListenerWrapper(listener, 1, targets, new ArrayList<>());
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    CalculationResults result = CalculationResults.of(target, new ArrayList<>());
    actualListenerWrapper.accept(result);

    // Assert
    Results getResult = listener.getFuture().get();
    assertEquals(0, getResult.getColumnCount());
    ImmutableList<Result<?>> cells = getResult.getCells();
    assertEquals(targets, cells);
    assertSame(cells, getResult.getColumns());
    assertSame(cells, result.getCells());
  }

  /**
   * Test {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List, List)}.
   *
   * <ul>
   *   <li>Then {@link ResultsListener} (default constructor) Future RowCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List,
   * List)}
   */
  @Test
  @DisplayName(
      "Test new ListenerWrapper(CalculationListener, int, List, List); then ResultsListener (default constructor) Future RowCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListenerWrapper.<init>(CalculationListener, int, List, List)"})
  void testNewListenerWrapper_thenResultsListenerFutureRowCountIsZero()
      throws InterruptedException, ExecutionException {
    // Arrange
    ResultsListener listener = new ResultsListener();
    ArrayList<CalculationTarget> targets = new ArrayList<>();

    // Act
    new ListenerWrapper(listener, 1, targets, new ArrayList<>()).accept(null);

    // Assert
    CompletableFuture<Results> future = listener.getFuture();
    Results getResult = future.get();
    assertEquals(0, getResult.getRowCount());
    assertTrue(getResult.getCells().isEmpty());
    assertTrue(future.isDone());
  }

  /**
   * Test {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List, List)}.
   *
   * <ul>
   *   <li>When {@link CountDownLatch#CountDownLatch(int)} with three.
   * </ul>
   *
   * <p>Method under test: {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List,
   * List)}
   */
  @Test
  @DisplayName(
      "Test new ListenerWrapper(CalculationListener, int, List, List); when CountDownLatch(int) with three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListenerWrapper.<init>(CalculationListener, int, List, List)"})
  void testNewListenerWrapper_whenCountDownLatchWithThree() {
    // Arrange
    LinkedList<String> errors = new LinkedList<>();
    Listener listener = new Listener(errors, new CountDownLatch(3));
    ArrayList<CalculationTarget> targets = new ArrayList<>();

    // Act
    ListenerWrapper actualListenerWrapper =
        new ListenerWrapper(listener, 1, targets, new ArrayList<>());
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    CalculationResults result = CalculationResults.of(target, new ArrayList<>());
    actualListenerWrapper.accept(result);

    // Assert that nothing has changed
    assertTrue(result.getCells().isEmpty());
  }

  /**
   * Test {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List, List)}.
   *
   * <ul>
   *   <li>When {@link CountDownLatch#CountDownLatch(int)} with three.
   * </ul>
   *
   * <p>Method under test: {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List,
   * List)}
   */
  @Test
  @DisplayName(
      "Test new ListenerWrapper(CalculationListener, int, List, List); when CountDownLatch(int) with three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListenerWrapper.<init>(CalculationListener, int, List, List)"})
  void testNewListenerWrapper_whenCountDownLatchWithThree2() {
    // Arrange
    LinkedList<String> errors = new LinkedList<>();
    Listener listener = new Listener(errors, new CountDownLatch(3));
    ArrayList<CalculationTarget> targets = new ArrayList<>();

    // Act
    ListenerWrapper actualListenerWrapper =
        new ListenerWrapper(listener, 0, targets, new ArrayList<>());
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    CalculationResults result = CalculationResults.of(target, new ArrayList<>());
    actualListenerWrapper.accept(result);

    // Assert that nothing has changed
    assertTrue(result.getCells().isEmpty());
  }

  /**
   * Test {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List, List)}.
   *
   * <ul>
   *   <li>When {@link Listener#Listener(Queue, CountDownLatch)} with errors is {@link
   *       LinkedList#LinkedList()} and latch is {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List,
   * List)}
   */
  @Test
  @DisplayName(
      "Test new ListenerWrapper(CalculationListener, int, List, List); when Listener(Queue, CountDownLatch) with errors is LinkedList() and latch is 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListenerWrapper.<init>(CalculationListener, int, List, List)"})
  void testNewListenerWrapper_whenListenerWithErrorsIsLinkedListAndLatchIsNull() {
    // Arrange
    Listener listener = new Listener(new LinkedList<>(), null);
    ArrayList<CalculationTarget> targets = new ArrayList<>();

    // Act
    ListenerWrapper actualListenerWrapper =
        new ListenerWrapper(listener, 1, targets, new ArrayList<>());
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    CalculationResults result = CalculationResults.of(target, new ArrayList<>());
    actualListenerWrapper.accept(result);

    // Assert that nothing has changed
    assertTrue(result.getCells().isEmpty());
  }

  /**
   * Test {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List, List)}.
   *
   * <ul>
   *   <li>When zero.
   *   <li>Then {@link ResultsListener} (default constructor) Future ColumnCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ListenerWrapper#ListenerWrapper(CalculationListener, int, List,
   * List)}
   */
  @Test
  @DisplayName(
      "Test new ListenerWrapper(CalculationListener, int, List, List); when zero; then ResultsListener (default constructor) Future ColumnCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void ListenerWrapper.<init>(CalculationListener, int, List, List)"})
  void testNewListenerWrapper_whenZero_thenResultsListenerFutureColumnCountIsZero()
      throws InterruptedException, ExecutionException {
    // Arrange
    ResultsListener listener = new ResultsListener();
    ArrayList<CalculationTarget> targets = new ArrayList<>();

    // Act
    ListenerWrapper actualListenerWrapper =
        new ListenerWrapper(listener, 0, targets, new ArrayList<>());
    UnresolvableTarget target =
        new UnresolvableTarget(
            mock(ResolvableCalculationTarget.class), "Not all who wander are lost");
    CalculationResults result = CalculationResults.of(target, new ArrayList<>());
    actualListenerWrapper.accept(result);

    // Assert
    Results getResult = listener.getFuture().get();
    assertEquals(0, getResult.getColumnCount());
    ImmutableList<Result<?>> cells = getResult.getCells();
    assertEquals(targets, cells);
    assertSame(cells, getResult.getColumns());
    assertSame(cells, result.getCells());
  }
}
