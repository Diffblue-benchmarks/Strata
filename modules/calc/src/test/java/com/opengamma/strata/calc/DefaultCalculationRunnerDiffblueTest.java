package com.opengamma.strata.calc;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.basics.ReferenceData;
import com.opengamma.strata.calc.Column.Builder;
import com.opengamma.strata.calc.runner.CalculationFunction;
import com.opengamma.strata.calc.runner.CalculationFunctions;
import com.opengamma.strata.calc.runner.CalculationListener;
import com.opengamma.strata.calc.runner.CalculationParameters;
import com.opengamma.strata.calc.runner.CalculationTaskRunner;
import com.opengamma.strata.calc.runner.CalculationTasks;
import com.opengamma.strata.calc.runner.ResultsListener;
import com.opengamma.strata.calc.runner.TestParameter;
import com.opengamma.strata.calc.runner.TestParameter2;
import com.opengamma.strata.data.MarketData;
import com.opengamma.strata.data.scenario.ImmutableScenarioMarketData;
import com.opengamma.strata.data.scenario.ScenarioMarketData;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class DefaultCalculationRunnerDiffblueTest {
  /**
   * Test {@link DefaultCalculationRunner#DefaultCalculationRunner(CalculationTaskRunner)}.
   *
   * <ul>
   *   <li>Then return TaskRunner is {@link CalculationTaskRunner}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCalculationRunner#DefaultCalculationRunner(CalculationTaskRunner)}
   */
  @Test
  @DisplayName(
      "Test new DefaultCalculationRunner(CalculationTaskRunner); then return TaskRunner is CalculationTaskRunner")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultCalculationRunner.<init>(CalculationTaskRunner)"})
  void testNewDefaultCalculationRunner_thenReturnTaskRunnerIsCalculationTaskRunner() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);

    // Act and Assert
    assertSame(taskRunner, new DefaultCalculationRunner(taskRunner).getTaskRunner());
  }

  /**
   * Test {@link DefaultCalculationRunner#DefaultCalculationRunner(CalculationTaskRunner)}.
   *
   * <ul>
   *   <li>Then return TaskRunner is {@link CalculationTaskRunner}.
   * </ul>
   *
   * <p>Method under test: {@link
   * DefaultCalculationRunner#DefaultCalculationRunner(CalculationTaskRunner)}
   */
  @Test
  @DisplayName(
      "Test new DefaultCalculationRunner(CalculationTaskRunner); then return TaskRunner is CalculationTaskRunner")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void DefaultCalculationRunner.<init>(CalculationTaskRunner)"})
  void testNewDefaultCalculationRunner_thenReturnTaskRunnerIsCalculationTaskRunner2() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);

    // Act and Assert
    assertSame(taskRunner, new DefaultCalculationRunner(taskRunner).getTaskRunner());
  }

  /**
   * Test {@link DefaultCalculationRunner#calculate(CalculationRules, List, List, MarketData,
   * ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculate(CalculationRules, List, List,
   * MarketData, ReferenceData)}
   */
  @Test
  @DisplayName("Test calculate(CalculationRules, List, List, MarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculate(CalculationRules, List, List, MarketData, ReferenceData)"
  })
  void testCalculate() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculate(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateResult =
        defaultCalculationRunner.calculate(
            calculationRules, targets, columns2, null, mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner).calculate(isA(CalculationTasks.class), isNull(), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculate(CalculationRules, List, List, MarketData,
   * ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculate(CalculationRules, List, List,
   * MarketData, ReferenceData)}
   */
  @Test
  @DisplayName("Test calculate(CalculationRules, List, List, MarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculate(CalculationRules, List, List, MarketData, ReferenceData)"
  })
  void testCalculate2() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculate(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter2());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateResult =
        defaultCalculationRunner.calculate(
            calculationRules, targets, columns2, null, mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner).calculate(isA(CalculationTasks.class), isNull(), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculate(CalculationRules, List, List, MarketData,
   * ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculate(CalculationRules, List, List,
   * MarketData, ReferenceData)}
   */
  @Test
  @DisplayName("Test calculate(CalculationRules, List, List, MarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculate(CalculationRules, List, List, MarketData, ReferenceData)"
  })
  void testCalculate3() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculate(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateResult =
        defaultCalculationRunner.calculate(
            calculationRules, targets, columns2, null, mock(ReferenceData.class));

    // Assert
    verify(functions, atLeast(1)).getFunction(Mockito.<CalculationTarget>any());
    verify(taskRunner).calculate(isA(CalculationTasks.class), isNull(), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculate(CalculationRules, List, List, MarketData,
   * ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculate(CalculationRules, List, List,
   * MarketData, ReferenceData)}
   */
  @Test
  @DisplayName("Test calculate(CalculationRules, List, List, MarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculate(CalculationRules, List, List, MarketData, ReferenceData)"
  })
  void testCalculate4() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculate(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateResult =
        defaultCalculationRunner.calculate(
            calculationRules, targets, columns2, null, mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner).calculate(isA(CalculationTasks.class), isNull(), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculate(CalculationRules, List, List, MarketData,
   * ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculate(CalculationRules, List, List,
   * MarketData, ReferenceData)}
   */
  @Test
  @DisplayName("Test calculate(CalculationRules, List, List, MarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculate(CalculationRules, List, List, MarketData, ReferenceData)"
  })
  void testCalculate5() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculate(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter2());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateResult =
        defaultCalculationRunner.calculate(
            calculationRules, targets, columns2, null, mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner).calculate(isA(CalculationTasks.class), isNull(), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculate(CalculationRules, List, List, MarketData,
   * ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculate(CalculationRules, List, List,
   * MarketData, ReferenceData)}
   */
  @Test
  @DisplayName("Test calculate(CalculationRules, List, List, MarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculate(CalculationRules, List, List, MarketData, ReferenceData)"
  })
  void testCalculate6() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculate(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateResult =
        defaultCalculationRunner.calculate(
            calculationRules, targets, columns2, null, mock(ReferenceData.class));

    // Assert
    verify(functions, atLeast(1)).getFunction(Mockito.<CalculationTarget>any());
    verify(taskRunner).calculate(isA(CalculationTasks.class), isNull(), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculate(CalculationRules, List, List, MarketData,
   * ReferenceData)}.
   *
   * <ul>
   *   <li>Then return {@link Results} with columns is {@link ArrayList#ArrayList()} and cells is
   *       {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculate(CalculationRules, List, List,
   * MarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(CalculationRules, List, List, MarketData, ReferenceData); then return Results with columns is ArrayList() and cells is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculate(CalculationRules, List, List, MarketData, ReferenceData)"
  })
  void testCalculate_thenReturnResultsWithColumnsIsArrayListAndCellsIsArrayList() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculate(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules =
        CalculationRules.of(functions, CalculationParameters.empty());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateResult =
        defaultCalculationRunner.calculate(
            calculationRules, targets, columns2, null, mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner).calculate(isA(CalculationTasks.class), isNull(), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculate(CalculationRules, List, List, MarketData,
   * ReferenceData)}.
   *
   * <ul>
   *   <li>Then return {@link Results} with columns is {@link ArrayList#ArrayList()} and cells is
   *       {@link ArrayList#ArrayList()}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculate(CalculationRules, List, List,
   * MarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculate(CalculationRules, List, List, MarketData, ReferenceData); then return Results with columns is ArrayList() and cells is ArrayList()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculate(CalculationRules, List, List, MarketData, ReferenceData)"
  })
  void testCalculate_thenReturnResultsWithColumnsIsArrayListAndCellsIsArrayList2() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculate(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules =
        CalculationRules.of(functions, CalculationParameters.empty());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateResult =
        defaultCalculationRunner.calculate(
            calculationRules, targets, columns2, null, mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner).calculate(isA(CalculationTasks.class), isNull(), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List, List, MarketData,
   * ReferenceData, CalculationListener)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List,
   * List, MarketData, ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationRunner.calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateAsync() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    doNothing()
        .when(taskRunner)
        .calculateAsync(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any(),
            Mockito.<CalculationListener>any());
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    defaultCalculationRunner.calculateAsync(
        calculationRules, targets, columns, null, refData, new ResultsListener());

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateAsync(
            isA(CalculationTasks.class),
            isNull(),
            isA(ReferenceData.class),
            isA(CalculationListener.class));
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List, List, MarketData,
   * ReferenceData, CalculationListener)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List,
   * List, MarketData, ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationRunner.calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateAsync2() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    doNothing()
        .when(taskRunner)
        .calculateAsync(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any(),
            Mockito.<CalculationListener>any());
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter2());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    defaultCalculationRunner.calculateAsync(
        calculationRules, targets, columns, null, refData, new ResultsListener());

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateAsync(
            isA(CalculationTasks.class),
            isNull(),
            isA(ReferenceData.class),
            isA(CalculationListener.class));
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List, List, MarketData,
   * ReferenceData, CalculationListener)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List,
   * List, MarketData, ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationRunner.calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateAsync3() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    doNothing()
        .when(taskRunner)
        .calculateAsync(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any(),
            Mockito.<CalculationListener>any());
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    defaultCalculationRunner.calculateAsync(
        calculationRules, targets, columns, null, refData, new ResultsListener());

    // Assert
    verify(functions, atLeast(1)).getFunction(Mockito.<CalculationTarget>any());
    verify(taskRunner)
        .calculateAsync(
            isA(CalculationTasks.class),
            isNull(),
            isA(ReferenceData.class),
            isA(CalculationListener.class));
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List, List, MarketData,
   * ReferenceData, CalculationListener)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List,
   * List, MarketData, ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationRunner.calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateAsync4() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    doNothing()
        .when(taskRunner)
        .calculateAsync(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any(),
            Mockito.<CalculationListener>any());
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    defaultCalculationRunner.calculateAsync(
        calculationRules, targets, columns, null, refData, new ResultsListener());

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateAsync(
            isA(CalculationTasks.class),
            isNull(),
            isA(ReferenceData.class),
            isA(CalculationListener.class));
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List, List, MarketData,
   * ReferenceData, CalculationListener)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List,
   * List, MarketData, ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationRunner.calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateAsync5() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    doNothing()
        .when(taskRunner)
        .calculateAsync(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any(),
            Mockito.<CalculationListener>any());
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter2());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    defaultCalculationRunner.calculateAsync(
        calculationRules, targets, columns, null, refData, new ResultsListener());

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateAsync(
            isA(CalculationTasks.class),
            isNull(),
            isA(ReferenceData.class),
            isA(CalculationListener.class));
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List, List, MarketData,
   * ReferenceData, CalculationListener)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List,
   * List, MarketData, ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationRunner.calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateAsync6() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    doNothing()
        .when(taskRunner)
        .calculateAsync(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any(),
            Mockito.<CalculationListener>any());
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    defaultCalculationRunner.calculateAsync(
        calculationRules, targets, columns, null, refData, new ResultsListener());

    // Assert
    verify(functions, atLeast(1)).getFunction(Mockito.<CalculationTarget>any());
    verify(taskRunner)
        .calculateAsync(
            isA(CalculationTasks.class),
            isNull(),
            isA(ReferenceData.class),
            isA(CalculationListener.class));
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List, List, MarketData,
   * ReferenceData, CalculationListener)}.
   *
   * <ul>
   *   <li>Then calls {@link CalculationFunctions#getFunction(CalculationTarget)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List,
   * List, MarketData, ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener); then calls getFunction(CalculationTarget)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationRunner.calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateAsync_thenCallsGetFunction() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    doNothing()
        .when(taskRunner)
        .calculateAsync(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any(),
            Mockito.<CalculationListener>any());
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules =
        CalculationRules.of(functions, CalculationParameters.empty());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    defaultCalculationRunner.calculateAsync(
        calculationRules, targets, columns, null, refData, new ResultsListener());

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateAsync(
            isA(CalculationTasks.class),
            isNull(),
            isA(ReferenceData.class),
            isA(CalculationListener.class));
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List, List, MarketData,
   * ReferenceData, CalculationListener)}.
   *
   * <ul>
   *   <li>Then calls {@link CalculationFunctions#getFunction(CalculationTarget)}.
   * </ul>
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateAsync(CalculationRules, List,
   * List, MarketData, ReferenceData, CalculationListener)}
   */
  @Test
  @DisplayName(
      "Test calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener); then calls getFunction(CalculationTarget)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void DefaultCalculationRunner.calculateAsync(CalculationRules, List, List, MarketData, ReferenceData, CalculationListener)"
  })
  void testCalculateAsync_thenCallsGetFunction2() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    doNothing()
        .when(taskRunner)
        .calculateAsync(
            Mockito.<CalculationTasks>any(),
            Mockito.<MarketData>any(),
            Mockito.<ReferenceData>any(),
            Mockito.<CalculationListener>any());
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules =
        CalculationRules.of(functions, CalculationParameters.empty());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());
    ReferenceData refData = mock(ReferenceData.class);

    // Act
    defaultCalculationRunner.calculateAsync(
        calculationRules, targets, columns, null, refData, new ResultsListener());

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateAsync(
            isA(CalculationTasks.class),
            isNull(),
            isA(ReferenceData.class),
            isA(CalculationListener.class));
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules, List, List,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules,
   * List, List, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculateMultiScenario(
            Mockito.<CalculationTasks>any(),
            Mockito.<ScenarioMarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules =
        CalculationRules.of(functions, CalculationParameters.empty());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateMultiScenarioResult =
        defaultCalculationRunner.calculateMultiScenario(
            calculationRules,
            targets,
            columns2,
            ImmutableScenarioMarketData.empty(),
            mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateMultiScenario(
            isA(CalculationTasks.class), isA(ScenarioMarketData.class), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateMultiScenarioResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules, List, List,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules,
   * List, List, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario2() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculateMultiScenario(
            Mockito.<CalculationTasks>any(),
            Mockito.<ScenarioMarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateMultiScenarioResult =
        defaultCalculationRunner.calculateMultiScenario(
            calculationRules,
            targets,
            columns2,
            ImmutableScenarioMarketData.empty(),
            mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateMultiScenario(
            isA(CalculationTasks.class), isA(ScenarioMarketData.class), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateMultiScenarioResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules, List, List,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules,
   * List, List, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario3() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculateMultiScenario(
            Mockito.<CalculationTasks>any(),
            Mockito.<ScenarioMarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter2());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateMultiScenarioResult =
        defaultCalculationRunner.calculateMultiScenario(
            calculationRules,
            targets,
            columns2,
            ImmutableScenarioMarketData.empty(),
            mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateMultiScenario(
            isA(CalculationTasks.class), isA(ScenarioMarketData.class), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateMultiScenarioResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules, List, List,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules,
   * List, List, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario4() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculateMultiScenario(
            Mockito.<CalculationTasks>any(),
            Mockito.<ScenarioMarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateMultiScenarioResult =
        defaultCalculationRunner.calculateMultiScenario(
            calculationRules,
            targets,
            columns2,
            ImmutableScenarioMarketData.empty(),
            mock(ReferenceData.class));

    // Assert
    verify(functions, atLeast(1)).getFunction(Mockito.<CalculationTarget>any());
    verify(taskRunner)
        .calculateMultiScenario(
            isA(CalculationTasks.class), isA(ScenarioMarketData.class), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateMultiScenarioResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules, List, List,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules,
   * List, List, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario5() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculateMultiScenario(
            Mockito.<CalculationTasks>any(),
            Mockito.<ScenarioMarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules =
        CalculationRules.of(functions, CalculationParameters.empty());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateMultiScenarioResult =
        defaultCalculationRunner.calculateMultiScenario(
            calculationRules,
            targets,
            columns2,
            ImmutableScenarioMarketData.empty(),
            mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateMultiScenario(
            isA(CalculationTasks.class), isA(ScenarioMarketData.class), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateMultiScenarioResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules, List, List,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules,
   * List, List, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario6() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculateMultiScenario(
            Mockito.<CalculationTasks>any(),
            Mockito.<ScenarioMarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateMultiScenarioResult =
        defaultCalculationRunner.calculateMultiScenario(
            calculationRules,
            targets,
            columns2,
            ImmutableScenarioMarketData.empty(),
            mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateMultiScenario(
            isA(CalculationTasks.class), isA(ScenarioMarketData.class), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateMultiScenarioResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules, List, List,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules,
   * List, List, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario7() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculateMultiScenario(
            Mockito.<CalculationTasks>any(),
            Mockito.<ScenarioMarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter2());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateMultiScenarioResult =
        defaultCalculationRunner.calculateMultiScenario(
            calculationRules,
            targets,
            columns2,
            ImmutableScenarioMarketData.empty(),
            mock(ReferenceData.class));

    // Assert
    verify(functions).getFunction(isA(CalculationTarget.class));
    verify(taskRunner)
        .calculateMultiScenario(
            isA(CalculationTasks.class), isA(ScenarioMarketData.class), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateMultiScenarioResult);
  }

  /**
   * Test {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules, List, List,
   * ScenarioMarketData, ReferenceData)}.
   *
   * <p>Method under test: {@link DefaultCalculationRunner#calculateMultiScenario(CalculationRules,
   * List, List, ScenarioMarketData, ReferenceData)}
   */
  @Test
  @DisplayName(
      "Test calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Results DefaultCalculationRunner.calculateMultiScenario(CalculationRules, List, List, ScenarioMarketData, ReferenceData)"
  })
  void testCalculateMultiScenario8() {
    // Arrange
    CalculationTaskRunner taskRunner = mock(CalculationTaskRunner.class);
    ArrayList<ColumnHeader> columns = new ArrayList<>();
    Results ofResult = Results.of(columns, new ArrayList<>());
    when(taskRunner.calculateMultiScenario(
            Mockito.<CalculationTasks>any(),
            Mockito.<ScenarioMarketData>any(),
            Mockito.<ReferenceData>any()))
        .thenReturn(ofResult);
    DefaultCalculationRunner defaultCalculationRunner = new DefaultCalculationRunner(taskRunner);

    CalculationFunctions functions = mock(CalculationFunctions.class);
    Mockito.<CalculationFunction<? super CalculationTarget>>when(
            functions.getFunction(Mockito.<CalculationTarget>any()))
        .thenReturn(mock(CalculationFunction.class));
    CalculationRules calculationRules = CalculationRules.of(functions, new TestParameter());

    ArrayList<CalculationTarget> targets = new ArrayList<>();
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));
    targets.add(mock(CalculationTarget.class));

    ArrayList<Column> columns2 = new ArrayList<>();

    Builder builderResult = Column.builder();

    Builder measureResult = builderResult.measure(ImmutableMeasure.of("Name"));

    Builder nameResult = measureResult.name(ColumnName.of("Name"));
    columns2.add(
        nameResult
            .parameters(CalculationParameters.empty())
            .reportingCurrency(ReportingCurrency.NATURAL)
            .build());

    // Act
    Results actualCalculateMultiScenarioResult =
        defaultCalculationRunner.calculateMultiScenario(
            calculationRules,
            targets,
            columns2,
            ImmutableScenarioMarketData.empty(),
            mock(ReferenceData.class));

    // Assert
    verify(functions, atLeast(1)).getFunction(Mockito.<CalculationTarget>any());
    verify(taskRunner)
        .calculateMultiScenario(
            isA(CalculationTasks.class), isA(ScenarioMarketData.class), isA(ReferenceData.class));
    assertSame(ofResult, actualCalculateMultiScenarioResult);
  }
}
