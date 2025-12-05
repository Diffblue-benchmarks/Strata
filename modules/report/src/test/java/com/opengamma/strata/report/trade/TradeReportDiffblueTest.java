package com.opengamma.strata.report.trade;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.opengamma.strata.collect.result.Result;
import com.opengamma.strata.report.trade.TradeReport.Builder;
import com.opengamma.strata.report.trade.TradeReport.Meta;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.joda.beans.Bean;
import org.joda.beans.MetaBean;
import org.joda.beans.MetaProperty;
import org.joda.beans.impl.direct.DirectMetaProperty;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class TradeReportDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"TradeReport Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualBuilderResult = TradeReport.builder();
    Builder actualColumnsResult = actualBuilderResult.columns(new ArrayList<>());
    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();
    ImmutableTable<Integer, Integer, Result<?>> data =
        builderResult
            .orderColumnsBy(mock(Comparator.class))
            .orderRowsBy(mock(Comparator.class))
            .build();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    TradeReport actualTradeReport =
        actualColumnsResult
            .data(data)
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(valuationDate)
            .build();

    // Assert
    LocalDate valuationDate2 = actualTradeReport.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertEquals(0, actualTradeReport.getColumnCount());
    assertEquals(0, actualTradeReport.getRowCount());
    ImmutableTable<Integer, Integer, Result<?>> data2 = actualTradeReport.getData();
    assertTrue(data2.isEmpty());
    assertSame(data, data2);
    assertSame(valuationDate, valuationDate2);
    assertSame(Instant.EPOCH, actualTradeReport.getRunInstant());
    assertSame(actualTradeReport.getColumnHeaders(), actualTradeReport.getColumns());
  }

  /**
   * Test Builder {@link Builder#columns(List)} with {@code List}.
   *
   * <p>Method under test: {@link Builder#columns(List)}
   */
  @Test
  @DisplayName("Test Builder columns(List) with 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(List)"})
  void testBuilderColumnsWithList() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    // Act
    Builder actualColumnsResult = builderResult.columns(columns);

    // Assert
    assertSame(builderResult, actualColumnsResult);
  }

  /**
   * Test Builder {@link Builder#columns(List)} with {@code List}.
   *
   * <p>Method under test: {@link Builder#columns(List)}
   */
  @Test
  @DisplayName("Test Builder columns(List) with 'List'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(List)"})
  void testBuilderColumnsWithList2() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    // Act
    Builder actualColumnsResult = builderResult.columns(columns);

    // Assert
    assertSame(builderResult, actualColumnsResult);
  }

  /**
   * Test Builder {@link Builder#columns(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columns(List)}
   */
  @Test
  @DisplayName("Test Builder columns(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(List)"})
  void testBuilderColumnsWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    // Act
    Builder actualColumnsResult = builderResult.columns(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualColumnsResult);
  }

  /**
   * Test Builder {@link Builder#columns(TradeReportColumn[])} with {@code TradeReportColumn[]}.
   *
   * <p>Method under test: {@link Builder#columns(TradeReportColumn[])}
   */
  @Test
  @DisplayName("Test Builder columns(TradeReportColumn[]) with 'TradeReportColumn[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(TradeReportColumn[])"})
  void testBuilderColumnsWithTradeReportColumn() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    // Act
    Builder actualColumnsResult =
        builderResult.columns(
            TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    // Assert
    assertSame(builderResult, actualColumnsResult);
  }

  /**
   * Test Builder {@link Builder#columns(TradeReportColumn[])} with {@code TradeReportColumn[]}.
   *
   * <p>Method under test: {@link Builder#columns(TradeReportColumn[])}
   */
  @Test
  @DisplayName("Test Builder columns(TradeReportColumn[]) with 'TradeReportColumn[]'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(TradeReportColumn[])"})
  void testBuilderColumnsWithTradeReportColumn2() {
    // Arrange
    Builder builderResult = TradeReport.builder();
    TradeReportColumn tradeReportColumn =
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build();

    // Act
    Builder actualColumnsResult =
        builderResult.columns(
            tradeReportColumn,
            TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    // Assert
    assertSame(builderResult, actualColumnsResult);
  }

  /**
   * Test Builder {@link Builder#columns(TradeReportColumn[])} with {@code TradeReportColumn[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columns(TradeReportColumn[])}
   */
  @Test
  @DisplayName(
      "Test Builder columns(TradeReportColumn[]) with 'TradeReportColumn[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columns(TradeReportColumn[])"})
  void testBuilderColumnsWithTradeReportColumn_thenReturnBuilder() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    // Act
    Builder actualColumnsResult = builderResult.columns();

    // Assert
    assertSame(builderResult, actualColumnsResult);
  }

  /**
   * Test Builder {@link Builder#data(Table)}.
   *
   * <ul>
   *   <li>When create.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#data(Table)}
   */
  @Test
  @DisplayName("Test Builder data(Table); when create; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.data(Table)"})
  void testBuilderData_whenCreate_thenReturnBuilder() {
    // Arrange
    Builder builderResult = TradeReport.builder();
    HashBasedTable<Integer, Integer, Result<?>> data = HashBasedTable.create();

    // Act
    Builder actualDataResult = builderResult.data(data);

    // Assert
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'columns'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenColumns_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = TradeReport.builder().get("columns");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code data}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'data'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenData_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(() -> TradeReport.builder().get("data"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(NoSuchElementException.class, () -> TradeReport.builder().get("Property Name"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code runInstant}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'runInstant'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenRunInstant_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TradeReport.builder().get("runInstant"));
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'valuationDate'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenValuationDate_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TradeReport.builder().get("valuationDate"));
  }

  /**
   * Test Builder {@link Builder#runInstant(Instant)}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#runInstant(Instant)}
   */
  @Test
  @DisplayName("Test Builder runInstant(Instant); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.runInstant(Instant)"})
  void testBuilderRunInstant_thenReturnBuilder() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    // Act
    Builder actualRunInstantResult =
        builderResult.runInstant(
            LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant());

    // Assert
    assertSame(builderResult, actualRunInstantResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> TradeReport.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'columns'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenColumns_thenReturnBuilder() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    // Act
    Builder actualSetResult = builderResult.set("columns", new ArrayList<>());

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(MetaProperty, Object)} with {@code property}, {@code value}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(MetaProperty, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(MetaProperty, Object) with 'property', 'value'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(MetaProperty, Object)"})
  void testBuilderSetWithPropertyValue_thenReturnBuilder() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    // Act
    Builder actualSetResult =
        builderResult.set((MetaProperty<?>) null, "!ConstantUsedForTestCoveragePurposes!");

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#valuationDate(LocalDate)}.
   *
   * <ul>
   *   <li>When {@link LocalDate} with {@code 1970} and one and one.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#valuationDate(LocalDate)}
   */
  @Test
  @DisplayName(
      "Test Builder valuationDate(LocalDate); when LocalDate with '1970' and one and one; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.valuationDate(LocalDate)"})
  void testBuilderValuationDate_whenLocalDateWith1970AndOneAndOne_thenReturnBuilder() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    // Act
    Builder actualValuationDateResult = builderResult.valuationDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualValuationDateResult);
  }

  /**
   * Test {@link TradeReport#getRowCount()}.
   *
   * <p>Method under test: {@link TradeReport#getRowCount()}
   */
  @Test
  @DisplayName("Test getRowCount()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int TradeReport.getRowCount()"})
  void testGetRowCount() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertEquals(
        0,
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build()
            .getRowCount());
  }

  /**
   * Test {@link TradeReport#getColumnHeaders()}.
   *
   * <ul>
   *   <li>Then return Empty.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#getColumnHeaders()}
   */
  @Test
  @DisplayName("Test getColumnHeaders(); then return Empty")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList TradeReport.getColumnHeaders()"})
  void testGetColumnHeaders_thenReturnEmpty() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertTrue(
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build()
            .getColumnHeaders()
            .isEmpty());
  }

  /**
   * Test {@link TradeReport#getColumnHeaders()}.
   *
   * <ul>
   *   <li>Then return size is five.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#getColumnHeaders()}
   */
  @Test
  @DisplayName("Test getColumnHeaders(); then return size is five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList TradeReport.getColumnHeaders()"})
  void testGetColumnHeaders_thenReturnSizeIsFive() {
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
    ImmutableList<String> actualColumnHeaders =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build()
            .getColumnHeaders();

    // Assert
    assertEquals(5, actualColumnHeaders.size());
    assertEquals("Header", actualColumnHeaders.get(2));
    assertEquals("Header", actualColumnHeaders.get(3));
    assertEquals("Header", actualColumnHeaders.get(4));
  }

  /**
   * Test {@link TradeReport#getColumnHeaders()}.
   *
   * <ul>
   *   <li>Then return size is four.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#getColumnHeaders()}
   */
  @Test
  @DisplayName("Test getColumnHeaders(); then return size is four")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList TradeReport.getColumnHeaders()"})
  void testGetColumnHeaders_thenReturnSizeIsFour() {
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
    ImmutableList<String> actualColumnHeaders =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build()
            .getColumnHeaders();

    // Assert
    assertEquals(4, actualColumnHeaders.size());
    assertEquals("Header", actualColumnHeaders.get(1));
    assertEquals("Header", actualColumnHeaders.get(2));
    assertEquals("Header", actualColumnHeaders.get(3));
  }

  /**
   * Test {@link TradeReport#getColumnHeaders()}.
   *
   * <ul>
   *   <li>Then return size is one.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#getColumnHeaders()}
   */
  @Test
  @DisplayName("Test getColumnHeaders(); then return size is one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList TradeReport.getColumnHeaders()"})
  void testGetColumnHeaders_thenReturnSizeIsOne() {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    Builder columnsResult = TradeReport.builder().columns(columns);

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();

    // Act
    ImmutableList<String> actualColumnHeaders =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build()
            .getColumnHeaders();

    // Assert
    assertEquals(1, actualColumnHeaders.size());
    assertEquals("Header", actualColumnHeaders.get(0));
  }

  /**
   * Test {@link TradeReport#getColumnHeaders()}.
   *
   * <ul>
   *   <li>Then return size is two.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#getColumnHeaders()}
   */
  @Test
  @DisplayName("Test getColumnHeaders(); then return size is two")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ImmutableList TradeReport.getColumnHeaders()"})
  void testGetColumnHeaders_thenReturnSizeIsTwo() {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    Builder columnsResult = TradeReport.builder().columns(columns);

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();

    // Act
    ImmutableList<String> actualColumnHeaders =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build()
            .getColumnHeaders();

    // Assert
    assertEquals(2, actualColumnHeaders.size());
    assertEquals("Header", actualColumnHeaders.get(0));
    assertEquals("Header", actualColumnHeaders.get(1));
  }

  /**
   * Test Meta {@link Meta#beanType()}.
   *
   * <p>Method under test: {@link Meta#beanType()}
   */
  @Test
  @DisplayName("Test Meta beanType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Class Meta.beanType()"})
  void testMetaBeanType() {
    // Arrange and Act
    Class<? extends TradeReport> actualBeanTypeResult = TradeReport.meta().beanType();

    // Assert
    Class<TradeReport> expectedBeanTypeResult = TradeReport.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#columns()}
   *   <li>{@link Meta#data()}
   *   <li>{@link Meta#runInstant()}
   *   <li>{@link Meta#valuationDate()}
   * </ul>
   */
  @Test
  @DisplayName("Test Meta getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "MetaProperty Meta.columns()",
    "MetaProperty Meta.data()",
    "MetaProperty Meta.runInstant()",
    "MetaProperty Meta.valuationDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = TradeReport.meta();

    // Act
    MetaProperty<ImmutableList<TradeReportColumn>> actualColumnsResult = metaResult.columns();
    MetaProperty<ImmutableTable<Integer, Integer, Result<?>>> actualDataResult = metaResult.data();
    MetaProperty<Instant> actualRunInstantResult = metaResult.runInstant();

    // Assert
    assertTrue(actualColumnsResult instanceof DirectMetaProperty);
    assertTrue(actualDataResult instanceof DirectMetaProperty);
    assertTrue(actualRunInstantResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then return name is {@code columns}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'columns'; then return name is 'columns'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenColumns_thenReturnNameIsColumns() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = TradeReport.meta().metaPropertyGet("columns");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableTable<Integer, Integer, Result<?>>> dataResult =
        ((Meta) metaBeanResult).data();
    assertTrue(dataResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Instant> runInstantResult = ((Meta) metaBeanResult).runInstant();
    assertTrue(runInstantResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("columns", actualMetaPropertyGetResult.name());
    Class<ImmutableList> expectedPropertyTypeResult = ImmutableList.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).columns());
    assertSame(metaBeanResult, dataResult.metaBean());
    assertSame(metaBeanResult, runInstantResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code data}.
   *   <li>Then return name is {@code data}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'data'; then return name is 'data'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenData_thenReturnNameIsData() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = TradeReport.meta().metaPropertyGet("data");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<TradeReportColumn>> columnsResult =
        ((Meta) metaBeanResult).columns();
    assertTrue(columnsResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Instant> runInstantResult = ((Meta) metaBeanResult).runInstant();
    assertTrue(runInstantResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("data", actualMetaPropertyGetResult.name());
    Class<ImmutableTable> expectedPropertyTypeResult = ImmutableTable.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).data());
    assertSame(metaBeanResult, columnsResult.metaBean());
    assertSame(metaBeanResult, runInstantResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName("Test Meta metaPropertyGet(String); when 'Property Name'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenPropertyName_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TradeReport.meta().metaPropertyGet("Property Name"));
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code runInstant}.
   *   <li>Then return name is {@code runInstant}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'runInstant'; then return name is 'runInstant'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenRunInstant_thenReturnNameIsRunInstant() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult = TradeReport.meta().metaPropertyGet("runInstant");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<TradeReportColumn>> columnsResult =
        ((Meta) metaBeanResult).columns();
    assertTrue(columnsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableTable<Integer, Integer, Result<?>>> dataResult =
        ((Meta) metaBeanResult).data();
    assertTrue(dataResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("runInstant", actualMetaPropertyGetResult.name());
    Class<Instant> expectedPropertyTypeResult = Instant.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).runInstant());
    assertSame(metaBeanResult, columnsResult.metaBean());
    assertSame(metaBeanResult, dataResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then return name is {@code valuationDate}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'valuationDate'; then return name is 'valuationDate'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenValuationDate_thenReturnNameIsValuationDate() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        TradeReport.meta().metaPropertyGet("valuationDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<TradeReportColumn>> columnsResult =
        ((Meta) metaBeanResult).columns();
    assertTrue(columnsResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableTable<Integer, Integer, Result<?>>> dataResult =
        ((Meta) metaBeanResult).data();
    assertTrue(dataResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Instant> runInstantResult = ((Meta) metaBeanResult).runInstant();
    assertTrue(runInstantResult instanceof DirectMetaProperty);
    assertEquals("valuationDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDate());
    assertSame(metaBeanResult, columnsResult.metaBean());
    assertSame(metaBeanResult, dataResult.metaBean());
    assertSame(metaBeanResult, runInstantResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyMap()}.
   *
   * <p>Method under test: {@link Meta#metaPropertyMap()}
   */
  @Test
  @DisplayName("Test Meta metaPropertyMap()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map Meta.metaPropertyMap()"})
  void testMetaMetaPropertyMap() {
    // Arrange and Act
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult = TradeReport.meta().metaPropertyMap();

    // Assert
    assertEquals(4, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("columns") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("data") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("runInstant") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("valuationDate") instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet() {
    // Arrange
    Meta metaResult = TradeReport.meta();

    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();
    TradeReport bean =
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act
    Object actualPropertyGetResult = metaResult.propertyGet(bean, "runInstant", true);

    // Assert
    Instant instant = ((Instant) actualPropertyGetResult).EPOCH;
    assertSame(instant, bean.getRunInstant());
    assertSame(instant, actualPropertyGetResult);
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@link Bean}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when Bean; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenBean_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(TradeReport.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'columns'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenColumns_thenReturnList() {
    // Arrange
    Meta metaResult = TradeReport.meta();

    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
            columnsResult
                .data(
                    builderResult2
                        .orderColumnsBy(mock(Comparator.class))
                        .orderRowsBy(mock(Comparator.class))
                        .build())
                .runInstant(
                    LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                .valuationDate(LocalDate.of(1970, 1, 1))
                .build(),
            "columns",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code data}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'data'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenData_thenDoesNotThrow() {
    // Arrange
    Meta metaResult = TradeReport.meta();

    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();

    // Act
    assertDoesNotThrow(
        () ->
            metaResult.propertyGet(
                columnsResult
                    .data(
                        builderResult2
                            .orderColumnsBy(mock(Comparator.class))
                            .orderRowsBy(mock(Comparator.class))
                            .build())
                    .runInstant(
                        LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
                    .valuationDate(LocalDate.of(1970, 1, 1))
                    .build(),
                "data",
                true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'false'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenFalse_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> TradeReport.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code columns}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'columns'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenColumns_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> TradeReport.meta().propertySet(mock(Bean.class), "columns", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code data}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'data'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenData_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> TradeReport.meta().propertySet(mock(Bean.class), "data", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code false}.
   *   <li>Then throw {@link UnsupportedOperationException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'false'; then throw UnsupportedOperationException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenFalse_thenThrowUnsupportedOperationException() {
    // Arrange, Act and Assert
    assertThrows(
        UnsupportedOperationException.class,
        () -> TradeReport.meta().propertySet(mock(Bean.class), "columns", "New Value", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code Property Name}.
   *   <li>Then throw {@link NoSuchElementException}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'Property Name'; then throw NoSuchElementException")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenPropertyName_thenThrowNoSuchElementException() {
    // Arrange, Act and Assert
    assertThrows(
        NoSuchElementException.class,
        () -> TradeReport.meta().propertySet(mock(Bean.class), "Property Name", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code runInstant}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'runInstant'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenRunInstant_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> TradeReport.meta().propertySet(mock(Bean.class), "runInstant", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code valuationDate}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'valuationDate'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenValuationDate_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> TradeReport.meta().propertySet(mock(Bean.class), "valuationDate", "New Value", true));
  }

  /**
   * Test {@link TradeReport#writeCsv(OutputStream)}.
   *
   * <p>Method under test: {@link TradeReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName("Test writeCsv(OutputStream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeReport.writeCsv(OutputStream)"})
  void testWriteCsv() throws UnsupportedEncodingException {
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
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    tradeReport.writeCsv(out);

    // Assert
    byte[] expectedToByteArrayResult = "Header,Header,Header,Header\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link TradeReport#writeCsv(OutputStream)}.
   *
   * <p>Method under test: {@link TradeReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName("Test writeCsv(OutputStream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeReport.writeCsv(OutputStream)"})
  void testWriteCsv2() throws UnsupportedEncodingException {
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
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    tradeReport.writeCsv(out);

    // Assert
    byte[] expectedToByteArrayResult = "Header,Header,Header,Header,Header\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link TradeReport#writeCsv(OutputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayOutputStream#ByteArrayOutputStream()} toByteArray is array of {@code
   *       byte} with lf.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test writeCsv(OutputStream); then ByteArrayOutputStream() toByteArray is array of byte with lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeReport.writeCsv(OutputStream)"})
  void testWriteCsv_thenByteArrayOutputStreamToByteArrayIsArrayOfByteWithLf() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    tradeReport.writeCsv(out);

    // Assert
    assertArrayEquals(new byte[] {'\n'}, out.toByteArray());
  }

  /**
   * Test {@link TradeReport#writeCsv(OutputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayOutputStream#ByteArrayOutputStream()} toByteArray is {@code Header}
   *       Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test writeCsv(OutputStream); then ByteArrayOutputStream() toByteArray is 'Header' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeReport.writeCsv(OutputStream)"})
  void testWriteCsv_thenByteArrayOutputStreamToByteArrayIsHeaderBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    Builder columnsResult = TradeReport.builder().columns(columns);

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    tradeReport.writeCsv(out);

    // Assert
    byte[] expectedToByteArrayResult = "Header\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link TradeReport#writeCsv(OutputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayOutputStream#ByteArrayOutputStream()} toByteArray is {@code
   *       Header,Header} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test writeCsv(OutputStream); then ByteArrayOutputStream() toByteArray is 'Header,Header' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeReport.writeCsv(OutputStream)"})
  void testWriteCsv_thenByteArrayOutputStreamToByteArrayIsHeaderHeaderBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    Builder columnsResult = TradeReport.builder().columns(columns);

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    tradeReport.writeCsv(out);

    // Assert
    byte[] expectedToByteArrayResult = "Header,Header\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link TradeReport#writeAsciiTable(OutputStream)}.
   *
   * <p>Method under test: {@link TradeReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName("Test writeAsciiTable(OutputStream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable() throws UnsupportedEncodingException {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    tradeReport.writeAsciiTable(out);

    // Assert
    byte[] expectedToByteArrayResult = "+\n|\n+\n+\n\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link TradeReport#writeAsciiTable(OutputStream)}.
   *
   * <ul>
   *   <li>Then array length is eighty-one.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName("Test writeAsciiTable(OutputStream); then array length is eighty-one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable_thenArrayLengthIsEightyOne() {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    Builder columnsResult = TradeReport.builder().columns(columns);

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    tradeReport.writeAsciiTable(out);

    // Assert
    assertEquals(81, out.toByteArray().length);
  }

  /**
   * Test {@link TradeReport#writeAsciiTable(OutputStream)}.
   *
   * <ul>
   *   <li>Then array length is one hundred eighty-nine.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName("Test writeAsciiTable(OutputStream); then array length is one hundred eighty-nine")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable_thenArrayLengthIsOneHundredEightyNine() {
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
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    tradeReport.writeAsciiTable(out);

    // Assert
    assertEquals(189, out.toByteArray().length);
  }

  /**
   * Test {@link TradeReport#writeAsciiTable(OutputStream)}.
   *
   * <ul>
   *   <li>Then array length is one hundred fifty-three.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName("Test writeAsciiTable(OutputStream); then array length is one hundred fifty-three")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable_thenArrayLengthIsOneHundredFiftyThree() {
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
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    tradeReport.writeAsciiTable(out);

    // Assert
    assertEquals(153, out.toByteArray().length);
  }

  /**
   * Test {@link TradeReport#writeAsciiTable(OutputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayOutputStream#ByteArrayOutputStream()} toByteArray is {@code
   *       +--------+ | Header | +--------+ +--------+} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test writeAsciiTable(OutputStream); then ByteArrayOutputStream() toByteArray is '+--------+ | Header | +--------+ +--------+' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void TradeReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable_thenByteArrayOutputStreamToByteArrayIsHeaderBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    Builder columnsResult = TradeReport.builder().columns(columns);

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    tradeReport.writeAsciiTable(out);

    // Assert
    byte[] expectedToByteArrayResult =
        "+--------+\n| Header |\n+--------+\n+--------+\n\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link TradeReport#meta()}.
   *
   * <p>Method under test: {@link TradeReport#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TradeReport.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = TradeReport.meta();

    // Assert
    assertTrue(actualMetaResult.columns() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.data() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.runInstant() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.valuationDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link TradeReport#metaBean()}.
   *
   * <p>Method under test: {@link TradeReport#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta TradeReport.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build()
            .metaBean());
  }

  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeReport#toString()}
   *   <li>{@link TradeReport#getColumns()}
   *   <li>{@link TradeReport#getData()}
   *   <li>{@link TradeReport#getRunInstant()}
   *   <li>{@link TradeReport#getValuationDate()}
   *   <li>{@link TradeReport#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList TradeReport.getColumns()",
    "ImmutableTable TradeReport.getData()",
    "Instant TradeReport.getRunInstant()",
    "LocalDate TradeReport.getValuationDate()",
    "Builder TradeReport.toBuilder()",
    "String TradeReport.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(valuationDate)
            .build();

    // Act
    String actualToStringResult = tradeReport.toString();
    ImmutableList<TradeReportColumn> actualColumns = tradeReport.getColumns();
    ImmutableTable<Integer, Integer, Result<?>> actualData = tradeReport.getData();
    Instant actualRunInstant = tradeReport.getRunInstant();
    LocalDate actualValuationDate = tradeReport.getValuationDate();
    tradeReport.toBuilder();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertEquals(
        "TradeReport{valuationDate=1970-01-01, runInstant=1970-01-01T00:00:00Z, columns=[], data={}}",
        actualToStringResult);
    assertTrue(actualData.isEmpty());
    assertTrue(actualColumns.isEmpty());
    assertSame(valuationDate, actualValuationDate);
    assertSame(Instant.EPOCH, actualRunInstant);
  }

  /**
   * Test {@link TradeReport#equals(Object)}, and {@link TradeReport#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeReport#equals(Object)}
   *   <li>{@link TradeReport#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeReport.equals(Object)", "int TradeReport.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    Builder builderResult3 = TradeReport.builder();

    Builder columnsResult2 = builderResult3.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult4 = ImmutableTable.builder();
    TradeReport tradeReport2 =
        columnsResult2
            .data(
                builderResult4
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertEquals(tradeReport, tradeReport2);
    assertEquals(tradeReport.hashCode(), tradeReport2.hashCode());
  }

  /**
   * Test {@link TradeReport#equals(Object)}, and {@link TradeReport#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link TradeReport#equals(Object)}
   *   <li>{@link TradeReport#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeReport.equals(Object)", "int TradeReport.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertEquals(tradeReport, tradeReport);
    int expectedHashCodeResult = tradeReport.hashCode();
    assertEquals(expectedHashCodeResult, tradeReport.hashCode());
  }

  /**
   * Test {@link TradeReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeReport.equals(Object)", "int TradeReport.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<TradeReportColumn> columns = new ArrayList<>();
    columns.add(
        TradeReportColumn.builder().header("Header").ignoreFailures(true).value("42").build());

    Builder columnsResult = TradeReport.builder().columns(columns);

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult = ImmutableTable.builder();
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    Builder builderResult2 = TradeReport.builder();

    Builder columnsResult2 = builderResult2.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult3 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        tradeReport,
        columnsResult2
            .data(
                builderResult3
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link TradeReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeReport.equals(Object)", "int TradeReport.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    Builder builderResult3 = TradeReport.builder();

    Builder columnsResult2 = builderResult3.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult4 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        tradeReport,
        columnsResult2
            .data(
                builderResult4
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link TradeReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeReport.equals(Object)", "int TradeReport.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();
    TradeReport tradeReport =
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.now())
            .build();

    Builder builderResult3 = TradeReport.builder();

    Builder columnsResult2 = builderResult3.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult4 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        tradeReport,
        columnsResult2
            .data(
                builderResult4
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build());
  }

  /**
   * Test {@link TradeReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeReport.equals(Object)", "int TradeReport.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build(),
        null);
  }

  /**
   * Test {@link TradeReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link TradeReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean TradeReport.equals(Object)", "int TradeReport.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = TradeReport.builder();

    Builder columnsResult = builderResult.columns(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Result<?>> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        columnsResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build(),
        "Different type to TradeReport");
  }
}
