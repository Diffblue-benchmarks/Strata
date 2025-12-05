package com.opengamma.strata.calc.runner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableList;
import com.opengamma.strata.basics.CalculationTarget;
import com.opengamma.strata.calc.Column;
import com.opengamma.strata.calc.Column.Builder;
import com.opengamma.strata.calc.ColumnHeader;
import com.opengamma.strata.calc.ColumnName;
import com.opengamma.strata.calc.ImmutableMeasure;
import com.opengamma.strata.calc.ReportingCurrency;
import com.opengamma.strata.calc.Results;
import com.opengamma.strata.collect.result.Result;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ResultsListenerDiffblueTest {
  /**
   * Test {@link ResultsListener#createAggregateResult()}.
   *
   * <ul>
   *   <li>Then return ColumnCount is five.
   * </ul>
   *
   * <p>Method under test: {@link ResultsListener#createAggregateResult()}
   */
  @Test
  @DisplayName("Test createAggregateResult(); then return ColumnCount is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Results ResultsListener.createAggregateResult()"})
  void testCreateAggregateResult_thenReturnColumnCountIsFive() {
    // Arrange
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

    ResultsListener resultsListener = new ResultsListener();
    resultsListener.calculationsStarted(new ArrayList<>(), columns);

    // Act
    Results actualCreateAggregateResultResult = resultsListener.createAggregateResult();

    // Assert
    assertEquals(5, actualCreateAggregateResultResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = actualCreateAggregateResultResult.getColumns();
    assertEquals(5, columns2.size());
    ColumnHeader expectedGetResult = columns2.get(0);
    assertEquals(expectedGetResult, columns2.get(4));
  }

  /**
   * Test {@link ResultsListener#createAggregateResult()}.
   *
   * <ul>
   *   <li>Then return ColumnCount is four.
   * </ul>
   *
   * <p>Method under test: {@link ResultsListener#createAggregateResult()}
   */
  @Test
  @DisplayName("Test createAggregateResult(); then return ColumnCount is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Results ResultsListener.createAggregateResult()"})
  void testCreateAggregateResult_thenReturnColumnCountIsFour() {
    // Arrange
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

    ResultsListener resultsListener = new ResultsListener();
    resultsListener.calculationsStarted(new ArrayList<>(), columns);

    // Act
    Results actualCreateAggregateResultResult = resultsListener.createAggregateResult();

    // Assert
    assertEquals(4, actualCreateAggregateResultResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = actualCreateAggregateResultResult.getColumns();
    assertEquals(4, columns2.size());
    ColumnHeader getResult = columns2.get(0);
    assertEquals(getResult, columns2.get(2));
    assertEquals(getResult, columns2.get(3));
  }

  /**
   * Test {@link ResultsListener#createAggregateResult()}.
   *
   * <ul>
   *   <li>Then return ColumnCount is one.
   * </ul>
   *
   * <p>Method under test: {@link ResultsListener#createAggregateResult()}
   */
  @Test
  @DisplayName("Test createAggregateResult(); then return ColumnCount is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Results ResultsListener.createAggregateResult()"})
  void testCreateAggregateResult_thenReturnColumnCountIsOne() {
    // Arrange
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

    ResultsListener resultsListener = new ResultsListener();
    resultsListener.calculationsStarted(new ArrayList<>(), columns);

    // Act
    Results actualCreateAggregateResultResult = resultsListener.createAggregateResult();

    // Assert
    assertEquals(1, actualCreateAggregateResultResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = actualCreateAggregateResultResult.getColumns();
    assertEquals(1, columns2.size());
    ColumnHeader getResult = columns2.get(0);
    assertFalse(getResult.getCurrency().isPresent());
    assertSame(name, getResult.getName());
    assertSame(measure, getResult.getMeasure());
  }

  /**
   * Test {@link ResultsListener#createAggregateResult()}.
   *
   * <ul>
   *   <li>Then return ColumnCount is two.
   * </ul>
   *
   * <p>Method under test: {@link ResultsListener#createAggregateResult()}
   */
  @Test
  @DisplayName("Test createAggregateResult(); then return ColumnCount is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Results ResultsListener.createAggregateResult()"})
  void testCreateAggregateResult_thenReturnColumnCountIsTwo() {
    // Arrange
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

    ResultsListener resultsListener = new ResultsListener();
    resultsListener.calculationsStarted(new ArrayList<>(), columns);

    // Act
    Results actualCreateAggregateResultResult = resultsListener.createAggregateResult();

    // Assert
    assertEquals(2, actualCreateAggregateResultResult.getColumnCount());
    ImmutableList<ColumnHeader> columns2 = actualCreateAggregateResultResult.getColumns();
    assertEquals(2, columns2.size());
    ColumnHeader expectedGetResult = columns2.get(0);
    assertEquals(expectedGetResult, columns2.get(1));
  }

  /**
   * Test {@link ResultsListener#createAggregateResult()}.
   *
   * <ul>
   *   <li>Then return ColumnCount is zero.
   * </ul>
   *
   * <p>Method under test: {@link ResultsListener#createAggregateResult()}
   */
  @Test
  @DisplayName("Test createAggregateResult(); then return ColumnCount is zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Results ResultsListener.createAggregateResult()"})
  void testCreateAggregateResult_thenReturnColumnCountIsZero() {
    // Arrange
    ResultsListener resultsListener = new ResultsListener();
    ArrayList<CalculationTarget> targets = new ArrayList<>();
    resultsListener.calculationsStarted(targets, new ArrayList<>());

    // Act
    Results actualCreateAggregateResultResult = resultsListener.createAggregateResult();

    // Assert
    assertEquals(0, actualCreateAggregateResultResult.getColumnCount());
    assertEquals(0, actualCreateAggregateResultResult.getRowCount());
    ImmutableList<Result<?>> cells = actualCreateAggregateResultResult.getCells();
    assertTrue(cells.isEmpty());
    assertSame(cells, actualCreateAggregateResultResult.getColumns());
  }
}
