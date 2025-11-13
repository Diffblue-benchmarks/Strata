package com.opengamma.strata.report.cashflow;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.ImmutableTable;
import com.opengamma.strata.report.cashflow.CashFlowReport.Builder;
import com.opengamma.strata.report.framework.format.ReportOutputFormat;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CashFlowReportFormatterDiffblueTest {
  /**
   * Test {@link CashFlowReportFormatter#getColumnTypes(CashFlowReport)} with {@code
   * CashFlowReport}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReportFormatter#getColumnTypes(CashFlowReport)}
   */
  @Test
  @DisplayName("Test getColumnTypes(CashFlowReport) with 'CashFlowReport'; then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.util.List CashFlowReportFormatter.getColumnTypes(CashFlowReport)"})
  void testGetColumnTypesWithCashFlowReport_thenReturnEmpty() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertTrue(
        CashFlowReportFormatter.INSTANCE
            .getColumnTypes(
                columnKeysResult
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
   * Test {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int, ReportOutputFormat)}
   * with {@code CashFlowReport}, {@code int}, {@code int}, {@code ReportOutputFormat}.
   *
   * <ul>
   *   <li>Given {@link Optional} with {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int,
   * ReportOutputFormat)}
   */
  @Test
  @DisplayName(
      "Test formatData(CashFlowReport, int, int, ReportOutputFormat) with 'CashFlowReport', 'int', 'int', 'ReportOutputFormat'; given Optional with 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String CashFlowReportFormatter.formatData(CashFlowReport, int, int, ReportOutputFormat)"
  })
  void testFormatDataWithCashFlowReportIntIntReportOutputFormat_givenOptionalWithValue() {
    // Arrange
    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    Optional<Object> ofResult = Optional.of("Value");
    builderResult.put(1, 1, ofResult);
    ImmutableTable<Integer, Integer, Object> data =
        builderResult
            .orderColumnsBy(mock(Comparator.class))
            .orderRowsBy(mock(Comparator.class))
            .build();

    Builder builderResult2 = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult2.columnHeaders(new ArrayList<>());

    // Act and Assert
    assertEquals(
        "Value",
        CashFlowReportFormatter.INSTANCE.formatData(
            columnHeadersResult
                .columnKeys(new ArrayList<>())
                .data(data)
                .runInstant(
                    LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            1,
            1,
            ReportOutputFormat.ASCII_TABLE));
  }

  /**
   * Test {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int, ReportOutputFormat)}
   * with {@code CashFlowReport}, {@code int}, {@code int}, {@code ReportOutputFormat}.
   *
   * <ul>
   *   <li>Given {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int,
   * ReportOutputFormat)}
   */
  @Test
  @DisplayName(
      "Test formatData(CashFlowReport, int, int, ReportOutputFormat) with 'CashFlowReport', 'int', 'int', 'ReportOutputFormat'; given 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String CashFlowReportFormatter.formatData(CashFlowReport, int, int, ReportOutputFormat)"
  })
  void testFormatDataWithCashFlowReportIntIntReportOutputFormat_givenValue() {
    // Arrange
    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    builderResult.put(1, 1, "Value");
    ImmutableTable<Integer, Integer, Object> data =
        builderResult
            .orderColumnsBy(mock(Comparator.class))
            .orderRowsBy(mock(Comparator.class))
            .build();

    Builder builderResult2 = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult2.columnHeaders(new ArrayList<>());

    // Act and Assert
    assertEquals(
        "Value",
        CashFlowReportFormatter.INSTANCE.formatData(
            columnHeadersResult
                .columnKeys(new ArrayList<>())
                .data(data)
                .runInstant(
                    LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            1,
            1,
            ReportOutputFormat.ASCII_TABLE));
  }

  /**
   * Test {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int, ReportOutputFormat)}
   * with {@code CashFlowReport}, {@code int}, {@code int}, {@code ReportOutputFormat}.
   *
   * <ul>
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int,
   * ReportOutputFormat)}
   */
  @Test
  @DisplayName(
      "Test formatData(CashFlowReport, int, int, ReportOutputFormat) with 'CashFlowReport', 'int', 'int', 'ReportOutputFormat'; then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String CashFlowReportFormatter.formatData(CashFlowReport, int, int, ReportOutputFormat)"
  })
  void testFormatDataWithCashFlowReportIntIntReportOutputFormat_thenCallsCompare() {
    // Arrange
    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    builderResult.put(1, 0, "Value");
    builderResult.put(1, 1, "Value");

    Comparator<Integer> columnComparator = mock(Comparator.class);
    when(columnComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);

    ImmutableTable.Builder<Integer, Integer, Object> orderColumnsByResult =
        builderResult.orderColumnsBy(columnComparator);

    Comparator<Integer> rowComparator = mock(Comparator.class);
    when(rowComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);
    ImmutableTable<Integer, Integer, Object> data =
        orderColumnsByResult.orderRowsBy(rowComparator).build();

    Builder builderResult2 = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult2.columnHeaders(new ArrayList<>());

    // Act
    String actualFormatDataResult =
        CashFlowReportFormatter.INSTANCE.formatData(
            columnHeadersResult
                .columnKeys(new ArrayList<>())
                .data(data)
                .runInstant(
                    LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            1,
            1,
            ReportOutputFormat.ASCII_TABLE);

    // Assert
    verify(columnComparator).compare(1, 0);
    verify(rowComparator).compare(1, 1);
    assertEquals("Value", actualFormatDataResult);
  }

  /**
   * Test {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int, ReportOutputFormat)}
   * with {@code CashFlowReport}, {@code int}, {@code int}, {@code ReportOutputFormat}.
   *
   * <ul>
   *   <li>Then return {@code 42}.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int,
   * ReportOutputFormat)}
   */
  @Test
  @DisplayName(
      "Test formatData(CashFlowReport, int, int, ReportOutputFormat) with 'CashFlowReport', 'int', 'int', 'ReportOutputFormat'; then return '42'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String CashFlowReportFormatter.formatData(CashFlowReport, int, int, ReportOutputFormat)"
  })
  void testFormatDataWithCashFlowReportIntIntReportOutputFormat_thenReturn42() {
    // Arrange
    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    builderResult.put(1, 1, 42);
    ImmutableTable<Integer, Integer, Object> data =
        builderResult
            .orderColumnsBy(mock(Comparator.class))
            .orderRowsBy(mock(Comparator.class))
            .build();

    Builder builderResult2 = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult2.columnHeaders(new ArrayList<>());

    // Act and Assert
    assertEquals(
        "42",
        CashFlowReportFormatter.INSTANCE.formatData(
            columnHeadersResult
                .columnKeys(new ArrayList<>())
                .data(data)
                .runInstant(
                    LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            1,
            1,
            ReportOutputFormat.ASCII_TABLE));
  }

  /**
   * Test {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int, ReportOutputFormat)}
   * with {@code CashFlowReport}, {@code int}, {@code int}, {@code ReportOutputFormat}.
   *
   * <ul>
   *   <li>Then return empty string.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int,
   * ReportOutputFormat)}
   */
  @Test
  @DisplayName(
      "Test formatData(CashFlowReport, int, int, ReportOutputFormat) with 'CashFlowReport', 'int', 'int', 'ReportOutputFormat'; then return empty string")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String CashFlowReportFormatter.formatData(CashFlowReport, int, int, ReportOutputFormat)"
  })
  void testFormatDataWithCashFlowReportIntIntReportOutputFormat_thenReturnEmptyString() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertEquals(
        "",
        CashFlowReportFormatter.INSTANCE.formatData(
            columnKeysResult
                .data(
                    builderResult2
                        .orderColumnsBy(mock(Comparator.class))
                        .orderRowsBy(mock(Comparator.class))
                        .build())
                .runInstant(
                    LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            1,
            1,
            ReportOutputFormat.ASCII_TABLE));
  }

  /**
   * Test {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int, ReportOutputFormat)}
   * with {@code CashFlowReport}, {@code int}, {@code int}, {@code ReportOutputFormat}.
   *
   * <ul>
   *   <li>When {@code CSV}.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReportFormatter#formatData(CashFlowReport, int, int,
   * ReportOutputFormat)}
   */
  @Test
  @DisplayName(
      "Test formatData(CashFlowReport, int, int, ReportOutputFormat) with 'CashFlowReport', 'int', 'int', 'ReportOutputFormat'; when 'CSV'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "String CashFlowReportFormatter.formatData(CashFlowReport, int, int, ReportOutputFormat)"
  })
  void testFormatDataWithCashFlowReportIntIntReportOutputFormat_whenCsv() {
    // Arrange
    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    builderResult.put(1, 0, "Value");
    builderResult.put(1, 1, "Value");

    Comparator<Integer> columnComparator = mock(Comparator.class);
    when(columnComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);

    ImmutableTable.Builder<Integer, Integer, Object> orderColumnsByResult =
        builderResult.orderColumnsBy(columnComparator);

    Comparator<Integer> rowComparator = mock(Comparator.class);
    when(rowComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);
    ImmutableTable<Integer, Integer, Object> data =
        orderColumnsByResult.orderRowsBy(rowComparator).build();

    Builder builderResult2 = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult2.columnHeaders(new ArrayList<>());

    // Act
    String actualFormatDataResult =
        CashFlowReportFormatter.INSTANCE.formatData(
            columnHeadersResult
                .columnKeys(new ArrayList<>())
                .data(data)
                .runInstant(
                    LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            1,
            1,
            ReportOutputFormat.CSV);

    // Assert
    verify(columnComparator).compare(1, 0);
    verify(rowComparator).compare(1, 1);
    assertEquals("Value", actualFormatDataResult);
  }
}
