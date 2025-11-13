package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.calc.Column;
import com.opengamma.strata.calc.Column.Builder;
import com.opengamma.strata.calc.ColumnHeader;
import com.opengamma.strata.calc.ColumnName;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.Measure;
import com.opengamma.strata.calc.ReportingCurrency;
import com.opengamma.strata.calc.Results;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DefaultCalculationTaskRunnerDiffblueTest {
  /**
   * Test {@link DefaultCalculationTaskRunner#calculate(CalculationTasks, MarketData,
   * ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationTaskRunner#calculate(CalculationTasks,
   * MarketData, ReferenceData)}
   */
  @Test
  @DisplayName("Test calculate(CalculationTasks, MarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationTaskRunner.calculate(CalculationTasks, MarketData, ReferenceData)"
  })
  void testCalculate() {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();
    ImmutableMeasure measure = ImmutableMeasure.of("scenarioCount", true);

    Builder measureResult = builderResult.measure(measure);
    ColumnName name = ColumnName.of("Name");

    Builder nameResult = measureResult.name(name);
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);

    // Act
    Results actualCalculateResult =
        ofMultiThreadedResult.calculate(tasks, mock(MarketData.class), mock(ReferenceData.class));

    // Assert
    assertEquals(0, actualCalculateResult.getRowCount());
    assertEquals(1, actualCalculateResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = actualCalculateResult.getColumns();
    assertEquals(1, columns2.size());
    ColumnHeader getResult = columns2.get(0);
    assertFalse(getResult.getCurrency().isPresent());
    assertTrue(actualCalculateResult.getCells().isEmpty());
    assertSame(name, getResult.getName());
    assertSame(measure, getResult.getMeasure());
  }

  /**
   * Test {@link DefaultCalculationTaskRunner#calculate(CalculationTasks, MarketData,
   * ReferenceData)}.
   *
   * <ul>
   *   <li>Then return Columns first Measure is {@link ImmutableMeasure} with {@code Name}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationTaskRunner#calculate(CalculationTasks,
   * MarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(CalculationTasks, MarketData, ReferenceData); then return Columns first Measure is ImmutableMeasure with 'Name'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationTaskRunner.calculate(CalculationTasks, MarketData, ReferenceData)"
  })
  void testCalculate_thenReturnColumnsFirstMeasureIsImmutableMeasureWithName() {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

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
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);

    // Act
    Results actualCalculateResult =
        ofMultiThreadedResult.calculate(tasks, mock(MarketData.class), mock(ReferenceData.class));

    // Assert
    assertEquals(0, actualCalculateResult.getRowCount());
    assertEquals(1, actualCalculateResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = actualCalculateResult.getColumns();
    assertEquals(1, columns2.size());
    ColumnHeader getResult = columns2.get(0);
    assertFalse(getResult.getCurrency().isPresent());
    assertTrue(actualCalculateResult.getCells().isEmpty());
    assertSame(name, getResult.getName());
    assertSame(measure, getResult.getMeasure());
  }

  /**
   * Test {@link DefaultCalculationTaskRunner#calculateAsync(CalculationTasks, MarketData,
   * ReferenceData, CalculationListener)}.
   *
   * <ul>
   *   <li>Then calls {@link CalculationListener#calculationsComplete()}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationTaskRunner#calculateAsync(CalculationTasks,
   * MarketData, ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateAsync(CalculationTasks, MarketData, ReferenceData, CalculationListener); then calls calculationsComplete()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationTaskRunner.calculateAsync(CalculationTasks, MarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateAsync_thenCallsCalculationsComplete() {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

    ArrayList<Column> columns = new ArrayList<>();

    Builder measureResult = Column.builder().measure(mock(Measure.class));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);
    MarketData marketData = mock(MarketData.class);
    ReferenceData refData = mock(ReferenceData.class);

    CalculationListener listener = mock(CalculationListener.class);
    doNothing().when(listener).calculationsComplete();
    doNothing()
        .when(listener)
        .calculationsStarted(Mockito.<List<CalculationTarget>>any(), Mockito.<List<Column>>any());

    // Act
    ofMultiThreadedResult.calculateAsync(tasks, marketData, refData, listener);

    // Assert
    verify(listener).calculationsComplete();
    verify(listener).calculationsStarted(isA(List.class), isA(List.class));
  }

  /**
   * Test {@link DefaultCalculationTaskRunner#calculateAsync(CalculationTasks, MarketData,
   * ReferenceData, CalculationListener)}.
   *
   * <ul>
   *   <li>Then {@link ResultsListener} (default constructor) Future RowCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationTaskRunner#calculateAsync(CalculationTasks,
   * MarketData, ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateAsync(CalculationTasks, MarketData, ReferenceData, CalculationListener); then ResultsListener (default constructor) Future RowCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationTaskRunner.calculateAsync(CalculationTasks, MarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateAsync_thenResultsListenerFutureRowCountIsZero()
      throws InterruptedException, ExecutionException {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

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
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);
    MarketData marketData = mock(MarketData.class);
    ReferenceData refData = mock(ReferenceData.class);
    ResultsListener listener = new ResultsListener();

    // Act
    ofMultiThreadedResult.calculateAsync(tasks, marketData, refData, listener);

    // Assert
    CompletableFuture<Results> future = listener.getFuture();
    Results getResult = future.get();
    assertEquals(0, getResult.getRowCount());
    assertEquals(1, getResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = getResult.getColumns();
    assertEquals(1, columns2.size());
    ColumnHeader getResult2 = columns2.get(0);
    assertFalse(getResult2.getCurrency().isPresent());
    assertTrue(future.isDone());
    assertSame(name, getResult2.getName());
    assertSame(measure, getResult2.getMeasure());
  }

  /**
   * Test {@link DefaultCalculationTaskRunner#calculateMultiScenario(CalculationTasks,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return ColumnCount is five.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCalculationTaskRunner#calculateMultiScenario(CalculationTasks, ScenarioMarketData,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationTasks, ScenarioMarketData, ReferenceData); then return ColumnCount is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationTaskRunner.calculateMultiScenario(CalculationTasks, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario_thenReturnColumnCountIsFive() {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

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

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    columns.add(
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult3 = Column.builder();

    Builder measureResult3 = builderResult3.measure(ImmutableMeasure.of("Name"));

    Builder nameResult3 = measureResult3.name(ColumnName.of("Name"));
    columns.add(
        nameResult3
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult4 = Column.builder();

    Builder measureResult4 = builderResult4.measure(ImmutableMeasure.of("Name"));

    Builder nameResult4 = measureResult4.name(ColumnName.of("Name"));
    columns.add(
        nameResult4
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult5 = Column.builder();

    Builder measureResult5 = builderResult5.measure(ImmutableMeasure.of("Name"));

    Builder nameResult5 = measureResult5.name(ColumnName.of("Name"));
    columns.add(
        nameResult5
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);

    // Act
    Results actualCalculateMultiScenarioResult =
        ofMultiThreadedResult.calculateMultiScenario(
            tasks, ImmutableScenarioMarketData.empty(), mock(ReferenceData.class));

    // Assert
    assertEquals(5, actualCalculateMultiScenarioResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = actualCalculateMultiScenarioResult.getColumns();
    assertEquals(5, columns2.size());
    ColumnHeader expectedGetResult = columns2.get(0);
    assertEquals(expectedGetResult, columns2.get(4));
  }

  /**
   * Test {@link DefaultCalculationTaskRunner#calculateMultiScenario(CalculationTasks,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return ColumnCount is four.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCalculationTaskRunner#calculateMultiScenario(CalculationTasks, ScenarioMarketData,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationTasks, ScenarioMarketData, ReferenceData); then return ColumnCount is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationTaskRunner.calculateMultiScenario(CalculationTasks, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario_thenReturnColumnCountIsFour() {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

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

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    columns.add(
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult3 = Column.builder();

    Builder measureResult3 = builderResult3.measure(ImmutableMeasure.of("Name"));

    Builder nameResult3 = measureResult3.name(ColumnName.of("Name"));
    columns.add(
        nameResult3
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult4 = Column.builder();

    Builder measureResult4 = builderResult4.measure(ImmutableMeasure.of("Name"));

    Builder nameResult4 = measureResult4.name(ColumnName.of("Name"));
    columns.add(
        nameResult4
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);

    // Act
    Results actualCalculateMultiScenarioResult =
        ofMultiThreadedResult.calculateMultiScenario(
            tasks, ImmutableScenarioMarketData.empty(), mock(ReferenceData.class));

    // Assert
    assertEquals(4, actualCalculateMultiScenarioResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = actualCalculateMultiScenarioResult.getColumns();
    assertEquals(4, columns2.size());
    ColumnHeader getResult = columns2.get(0);
    assertEquals(getResult, columns2.get(2));
    assertEquals(getResult, columns2.get(3));
  }

  /**
   * Test {@link DefaultCalculationTaskRunner#calculateMultiScenario(CalculationTasks,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return ColumnCount is two.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCalculationTaskRunner#calculateMultiScenario(CalculationTasks, ScenarioMarketData,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationTasks, ScenarioMarketData, ReferenceData); then return ColumnCount is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationTaskRunner.calculateMultiScenario(CalculationTasks, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario_thenReturnColumnCountIsTwo() {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

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

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    columns.add(
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);

    // Act
    Results actualCalculateMultiScenarioResult =
        ofMultiThreadedResult.calculateMultiScenario(
            tasks, ImmutableScenarioMarketData.empty(), mock(ReferenceData.class));

    // Assert
    assertEquals(2, actualCalculateMultiScenarioResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = actualCalculateMultiScenarioResult.getColumns();
    assertEquals(2, columns2.size());
    ColumnHeader expectedGetResult = columns2.get(0);
    assertEquals(expectedGetResult, columns2.get(1));
  }

  /**
   * Test {@link DefaultCalculationTaskRunner#calculateMultiScenario(CalculationTasks,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <ul>
   *   <li>Then return RowCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCalculationTaskRunner#calculateMultiScenario(CalculationTasks, ScenarioMarketData,
   * ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationTasks, ScenarioMarketData, ReferenceData); then return RowCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationTaskRunner.calculateMultiScenario(CalculationTasks, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario_thenReturnRowCountIsZero() {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

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
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);

    // Act
    Results actualCalculateMultiScenarioResult =
        ofMultiThreadedResult.calculateMultiScenario(
            tasks, ImmutableScenarioMarketData.empty(), mock(ReferenceData.class));

    // Assert
    assertEquals(0, actualCalculateMultiScenarioResult.getRowCount());
    assertEquals(1, actualCalculateMultiScenarioResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = actualCalculateMultiScenarioResult.getColumns();
    assertEquals(1, columns2.size());
    ColumnHeader getResult = columns2.get(0);
    assertFalse(getResult.getCurrency().isPresent());
    assertTrue(actualCalculateMultiScenarioResult.getCells().isEmpty());
    assertSame(name, getResult.getName());
    assertSame(measure, getResult.getMeasure());
  }

  /**
   * Test {@link DefaultCalculationTaskRunner#calculateMultiScenarioAsync(CalculationTasks,
   * ScenarioMarketData, ReferenceData, CalculationListener)}.
   *
   * <ul>
   *   <li>Then {@link ResultsListener} (default constructor) Future ColumnCount is five.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCalculationTaskRunner#calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData,
   * ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData, ReferenceData, CalculationListener); then ResultsListener (default constructor) Future ColumnCount is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationTaskRunner.calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateMultiScenarioAsync_thenResultsListenerFutureColumnCountIsFive()
      throws InterruptedException, ExecutionException {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

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

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    columns.add(
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult3 = Column.builder();

    Builder measureResult3 = builderResult3.measure(ImmutableMeasure.of("Name"));

    Builder nameResult3 = measureResult3.name(ColumnName.of("Name"));
    columns.add(
        nameResult3
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult4 = Column.builder();

    Builder measureResult4 = builderResult4.measure(ImmutableMeasure.of("Name"));

    Builder nameResult4 = measureResult4.name(ColumnName.of("Name"));
    columns.add(
        nameResult4
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult5 = Column.builder();

    Builder measureResult5 = builderResult5.measure(ImmutableMeasure.of("Name"));

    Builder nameResult5 = measureResult5.name(ColumnName.of("Name"));
    columns.add(
        nameResult5
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);
    ImmutableScenarioMarketData marketData = ImmutableScenarioMarketData.empty();
    ReferenceData refData = mock(ReferenceData.class);
    ResultsListener listener = new ResultsListener();

    // Act
    ofMultiThreadedResult.calculateMultiScenarioAsync(tasks, marketData, refData, listener);

    // Assert
    Results getResult = listener.getFuture().get();
    assertEquals(5, getResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = getResult.getColumns();
    assertEquals(5, columns2.size());
    ColumnHeader expectedGetResult = columns2.get(0);
    assertEquals(expectedGetResult, columns2.get(4));
  }

  /**
   * Test {@link DefaultCalculationTaskRunner#calculateMultiScenarioAsync(CalculationTasks,
   * ScenarioMarketData, ReferenceData, CalculationListener)}.
   *
   * <ul>
   *   <li>Then {@link ResultsListener} (default constructor) Future ColumnCount is four.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCalculationTaskRunner#calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData,
   * ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData, ReferenceData, CalculationListener); then ResultsListener (default constructor) Future ColumnCount is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationTaskRunner.calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateMultiScenarioAsync_thenResultsListenerFutureColumnCountIsFour()
      throws InterruptedException, ExecutionException {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

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

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    columns.add(
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult3 = Column.builder();

    Builder measureResult3 = builderResult3.measure(ImmutableMeasure.of("Name"));

    Builder nameResult3 = measureResult3.name(ColumnName.of("Name"));
    columns.add(
        nameResult3
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    Builder builderResult4 = Column.builder();

    Builder measureResult4 = builderResult4.measure(ImmutableMeasure.of("Name"));

    Builder nameResult4 = measureResult4.name(ColumnName.of("Name"));
    columns.add(
        nameResult4
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);
    ImmutableScenarioMarketData marketData = ImmutableScenarioMarketData.empty();
    ReferenceData refData = mock(ReferenceData.class);
    ResultsListener listener = new ResultsListener();

    // Act
    ofMultiThreadedResult.calculateMultiScenarioAsync(tasks, marketData, refData, listener);

    // Assert
    Results getResult = listener.getFuture().get();
    assertEquals(4, getResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = getResult.getColumns();
    assertEquals(4, columns2.size());
    ColumnHeader expectedGetResult = columns2.get(0);
    assertEquals(expectedGetResult, columns2.get(2));
  }

  /**
   * Test {@link DefaultCalculationTaskRunner#calculateMultiScenarioAsync(CalculationTasks,
   * ScenarioMarketData, ReferenceData, CalculationListener)}.
   *
   * <ul>
   *   <li>Then {@link ResultsListener} (default constructor) Future ColumnCount is two.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCalculationTaskRunner#calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData,
   * ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData, ReferenceData, CalculationListener); then ResultsListener (default constructor) Future ColumnCount is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationTaskRunner.calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateMultiScenarioAsync_thenResultsListenerFutureColumnCountIsTwo()
      throws InterruptedException, ExecutionException {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

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

    Builder measureResult2 = builderResult2.measure(ImmutableMeasure.of("Name"));

    Builder nameResult2 = measureResult2.name(ColumnName.of("Name"));
    columns.add(
        nameResult2
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);
    ImmutableScenarioMarketData marketData = ImmutableScenarioMarketData.empty();
    ReferenceData refData = mock(ReferenceData.class);
    ResultsListener listener = new ResultsListener();

    // Act
    ofMultiThreadedResult.calculateMultiScenarioAsync(tasks, marketData, refData, listener);

    // Assert
    Results getResult = listener.getFuture().get();
    assertEquals(2, getResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = getResult.getColumns();
    assertEquals(2, columns2.size());
    ColumnHeader expectedGetResult = columns2.get(0);
    assertEquals(expectedGetResult, columns2.get(1));
  }

  /**
   * Test {@link DefaultCalculationTaskRunner#calculateMultiScenarioAsync(CalculationTasks,
   * ScenarioMarketData, ReferenceData, CalculationListener)}.
   *
   * <ul>
   *   <li>Then {@link ResultsListener} (default constructor) Future RowCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCalculationTaskRunner#calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData,
   * ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData, ReferenceData, CalculationListener); then ResultsListener (default constructor) Future RowCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationTaskRunner.calculateMultiScenarioAsync(CalculationTasks, ScenarioMarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateMultiScenarioAsync_thenResultsListenerFutureRowCountIsZero()
      throws InterruptedException, ExecutionException {
    // Arrange
    DefaultCalculationTaskRunner ofMultiThreadedResult =
        DefaultCalculationTaskRunner.ofMultiThreaded();

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
    CalculationTasks tasks = CalculationTasks.of(new ArrayList<>(), columns);
    ImmutableScenarioMarketData marketData = ImmutableScenarioMarketData.empty();
    ReferenceData refData = mock(ReferenceData.class);
    ResultsListener listener = new ResultsListener();

    // Act
    ofMultiThreadedResult.calculateMultiScenarioAsync(tasks, marketData, refData, listener);

    // Assert
    CompletableFuture<Results> future = listener.getFuture();
    Results getResult = future.get();
    assertEquals(0, getResult.getRowCount());
    assertEquals(1, getResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = getResult.getColumns();
    assertEquals(1, columns2.size());
    ColumnHeader getResult2 = columns2.get(0);
    assertFalse(getResult2.getCurrency().isPresent());
    assertTrue(future.isDone());
    assertSame(name, getResult2.getName());
    assertSame(measure, getResult2.getMeasure());
  }
}
