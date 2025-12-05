package com.opengamma.strata.report.trade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableTable;
import com.opengamma.strata.collect.result.Result;
import com.opengamma.strata.report.trade.TradeReport.Builder;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeReportFormatterDiffblueTest {
  /**
   * Test {@link TradeReportFormatter#getColumnTypes(TradeReport)} with {@code TradeReport}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportFormatter#getColumnTypes(TradeReport)}
   */
  @Test
  @DisplayName("Test getColumnTypes(TradeReport) with 'TradeReport'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List TradeReportFormatter.getColumnTypes(TradeReport)"})
  void testGetColumnTypesWithTradeReport_thenReturnEmpty() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertTrue(
        TradeReportFormatter.INSTANCE
            .getColumnTypes(
                columnsResult
                    .data(
                        builderResult2
                            .orderColumnsBy(mock(Comparator.class))
                            .orderRowsBy(mock(Comparator.class))
                            .build())
                    .runInstant(
                        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                    .valuationDate(LocalDate.of(1970, 1, 1))
                    .build())
            .isEmpty());
  }

  /**
   * Test {@link TradeReportFormatter#getColumnTypes(TradeReport)} with {@code TradeReport}.
   *
   * <ul>
   *   <li>Then return size is five.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportFormatter#getColumnTypes(TradeReport)}
   */
  @Test
  @DisplayName("Test getColumnTypes(TradeReport) with 'TradeReport'; then return size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List TradeReportFormatter.getColumnTypes(TradeReport)"})
  void testGetColumnTypesWithTradeReport_thenReturnSizeIsFive() {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    Builder columnsResult = TradeReport.builder().columns(columns);

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();

    // Act
    List<Class<?>> actualColumnTypes =
        TradeReportFormatter.INSTANCE.getColumnTypes(
            columnsResult
                .data(
                    builderResult
                        .orderColumnsBy(mock(Comparator.class))
                        .orderRowsBy(mock(Comparator.class))
                        .build())
                .runInstant(
                    LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build());

    // Assert
    assertEquals(5, actualColumnTypes.size());
    Class<Object> expectedGetResult = Object.class;
    assertEquals(expectedGetResult, actualColumnTypes.get(2));
    Class<Object> expectedGetResult2 = Object.class;
    assertEquals(expectedGetResult2, actualColumnTypes.get(3));
    Class<Object> expectedGetResult3 = Object.class;
    assertEquals(expectedGetResult3, actualColumnTypes.get(4));
  }

  /**
   * Test {@link TradeReportFormatter#getColumnTypes(TradeReport)} with {@code TradeReport}.
   *
   * <ul>
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportFormatter#getColumnTypes(TradeReport)}
   */
  @Test
  @DisplayName("Test getColumnTypes(TradeReport) with 'TradeReport'; then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List TradeReportFormatter.getColumnTypes(TradeReport)"})
  void testGetColumnTypesWithTradeReport_thenReturnSizeIsFour() {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    Builder columnsResult = TradeReport.builder().columns(columns);

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();

    // Act
    List<Class<?>> actualColumnTypes =
        TradeReportFormatter.INSTANCE.getColumnTypes(
            columnsResult
                .data(
                    builderResult
                        .orderColumnsBy(mock(Comparator.class))
                        .orderRowsBy(mock(Comparator.class))
                        .build())
                .runInstant(
                    LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build());

    // Assert
    assertEquals(4, actualColumnTypes.size());
    Class<Object> expectedGetResult = Object.class;
    assertEquals(expectedGetResult, actualColumnTypes.get(1));
    Class<Object> expectedGetResult2 = Object.class;
    assertEquals(expectedGetResult2, actualColumnTypes.get(2));
    Class<Object> expectedGetResult3 = Object.class;
    assertEquals(expectedGetResult3, actualColumnTypes.get(3));
  }

  /**
   * Test {@link TradeReportFormatter#getColumnTypes(TradeReport)} with {@code TradeReport}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportFormatter#getColumnTypes(TradeReport)}
   */
  @Test
  @DisplayName("Test getColumnTypes(TradeReport) with 'TradeReport'; then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List TradeReportFormatter.getColumnTypes(TradeReport)"})
  void testGetColumnTypesWithTradeReport_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    Builder columnsResult = TradeReport.builder().columns(columns);

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();

    // Act
    List<Class<?>> actualColumnTypes =
        TradeReportFormatter.INSTANCE.getColumnTypes(
            columnsResult
                .data(
                    builderResult
                        .orderColumnsBy(mock(Comparator.class))
                        .orderRowsBy(mock(Comparator.class))
                        .build())
                .runInstant(
                    LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build());

    // Assert
    assertEquals(1, actualColumnTypes.size());
    Class<Object> expectedGetResult = Object.class;
    assertEquals(expectedGetResult, actualColumnTypes.get(0));
  }

  /**
   * Test {@link TradeReportFormatter#getColumnTypes(TradeReport)} with {@code TradeReport}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link TradeReportFormatter#getColumnTypes(TradeReport)}
   */
  @Test
  @DisplayName("Test getColumnTypes(TradeReport) with 'TradeReport'; then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"List TradeReportFormatter.getColumnTypes(TradeReport)"})
  void testGetColumnTypesWithTradeReport_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    Builder columnsResult = TradeReport.builder().columns(columns);

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();

    // Act
    List<Class<?>> actualColumnTypes =
        TradeReportFormatter.INSTANCE.getColumnTypes(
            columnsResult
                .data(
                    builderResult
                        .orderColumnsBy(mock(Comparator.class))
                        .orderRowsBy(mock(Comparator.class))
                        .build())
                .runInstant(
                    LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build());

    // Assert
    assertEquals(2, actualColumnTypes.size());
    Class<Object> expectedGetResult = Object.class;
    assertEquals(expectedGetResult, actualColumnTypes.get(0));
    Class<Object> expectedGetResult2 = Object.class;
    assertEquals(expectedGetResult2, actualColumnTypes.get(1));
  }
}
