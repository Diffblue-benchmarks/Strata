package com.opengamma.strata.report.cashflow;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.opengamma.strata.market.explain.ExplainKey;
import com.opengamma.strata.report.cashflow.CashFlowReport.Builder;
import com.opengamma.strata.report.cashflow.CashFlowReport.Meta;
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
import org.mockito.Mockito;

class CashFlowReportDiffblueTest {
  /**
   * Test Builder {@link Builder#build()}.
   *
   * <p>Method under test: {@link Builder#build()}
   */
  @Test
  @DisplayName("Test Builder build()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"CashFlowReport Builder.build()", "String Builder.toString()"})
  void testBuilderBuild() {
    // Arrange and Act
    Builder actualBuilderResult = CashFlowReport.builder();
    Builder actualColumnHeadersResult = actualBuilderResult.columnHeaders(new ArrayList<>());
    Builder actualColumnKeysResult = actualColumnHeadersResult.columnKeys(new ArrayList<>());
    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    ImmutableTable<Integer, Integer, Object> data =
        builderResult
            .orderColumnsBy(mock(Comparator.class))
            .orderRowsBy(mock(Comparator.class))
            .build();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CashFlowReport actualCashFlowReport =
        actualColumnKeysResult
            .data(data)
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(valuationDate)
            .build();

    // Assert
    LocalDate valuationDate2 = actualCashFlowReport.getValuationDate();
    assertEquals("1970-01-01", valuationDate2.toString());
    assertEquals(0, actualCashFlowReport.getColumnCount());
    assertEquals(0, actualCashFlowReport.getRowCount());
    ImmutableTable<Integer, Integer, Object> data2 = actualCashFlowReport.getData();
    assertTrue(data2.isEmpty());
    assertSame(data, data2);
    assertSame(valuationDate, valuationDate2);
    assertSame(Instant.EPOCH, actualCashFlowReport.getRunInstant());
    assertSame(actualCashFlowReport.getColumnHeaders(), actualCashFlowReport.getColumnKeys());
  }

  /**
   * Test Builder {@link Builder#columnHeaders(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code columnHeaders}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnHeaders(List)}
   */
  @Test
  @DisplayName("Test Builder columnHeaders(List) with 'List'; given 'columnHeaders'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnHeaders(List)"})
  void testBuilderColumnHeadersWithList_givenColumnHeaders() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    ArrayList<String> columnHeaders = new ArrayList<>();
    columnHeaders.add("columnHeaders");

    // Act
    Builder actualColumnHeadersResult = builderResult.columnHeaders(columnHeaders);

    // Assert
    assertSame(builderResult, actualColumnHeadersResult);
  }

  /**
   * Test Builder {@link Builder#columnHeaders(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given {@code foo}.
   *   <li>When {@link ArrayList#ArrayList()} add {@code foo}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnHeaders(List)}
   */
  @Test
  @DisplayName(
      "Test Builder columnHeaders(List) with 'List'; given 'foo'; when ArrayList() add 'foo'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnHeaders(List)"})
  void testBuilderColumnHeadersWithList_givenFoo_whenArrayListAddFoo_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    ArrayList<String> columnHeaders = new ArrayList<>();
    columnHeaders.add("foo");
    columnHeaders.add("columnHeaders");

    // Act
    Builder actualColumnHeadersResult = builderResult.columnHeaders(columnHeaders);

    // Assert
    assertSame(builderResult, actualColumnHeadersResult);
  }

  /**
   * Test Builder {@link Builder#columnHeaders(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnHeaders(List)}
   */
  @Test
  @DisplayName(
      "Test Builder columnHeaders(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnHeaders(List)"})
  void testBuilderColumnHeadersWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    // Act
    Builder actualColumnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualColumnHeadersResult);
  }

  /**
   * Test Builder {@link Builder#columnHeaders(String[])} with {@code String[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnHeaders(String[])}
   */
  @Test
  @DisplayName("Test Builder columnHeaders(String[]) with 'String[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnHeaders(String[])"})
  void testBuilderColumnHeadersWithString_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    // Act
    Builder actualColumnHeadersResult = builderResult.columnHeaders();

    // Assert
    assertSame(builderResult, actualColumnHeadersResult);
  }

  /**
   * Test Builder {@link Builder#columnHeaders(String[])} with {@code String[]}.
   *
   * <ul>
   *   <li>When {@code columnHeaders} and {@code Column Headers}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnHeaders(String[])}
   */
  @Test
  @DisplayName(
      "Test Builder columnHeaders(String[]) with 'String[]'; when 'columnHeaders' and 'Column Headers'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnHeaders(String[])"})
  void testBuilderColumnHeadersWithString_whenColumnHeadersAndColumnHeaders() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    // Act
    Builder actualColumnHeadersResult =
        builderResult.columnHeaders("columnHeaders", "Column Headers");

    // Assert
    assertSame(builderResult, actualColumnHeadersResult);
  }

  /**
   * Test Builder {@link Builder#columnHeaders(String[])} with {@code String[]}.
   *
   * <ul>
   *   <li>When {@code Column Headers}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnHeaders(String[])}
   */
  @Test
  @DisplayName(
      "Test Builder columnHeaders(String[]) with 'String[]'; when 'Column Headers'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnHeaders(String[])"})
  void testBuilderColumnHeadersWithString_whenColumnHeaders_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    // Act
    Builder actualColumnHeadersResult = builderResult.columnHeaders("Column Headers");

    // Assert
    assertSame(builderResult, actualColumnHeadersResult);
  }

  /**
   * Test Builder {@link Builder#columnKeys(ExplainKey[])} with {@code ExplainKey[]}.
   *
   * <ul>
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnKeys(ExplainKey[])}
   */
  @Test
  @DisplayName("Test Builder columnKeys(ExplainKey[]) with 'ExplainKey[]'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnKeys(ExplainKey[])"})
  void testBuilderColumnKeysWithExplainKey_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    // Act
    Builder actualColumnKeysResult = builderResult.columnKeys();

    // Assert
    assertSame(builderResult, actualColumnKeysResult);
  }

  /**
   * Test Builder {@link Builder#columnKeys(ExplainKey[])} with {@code ExplainKey[]}.
   *
   * <ul>
   *   <li>When of {@code columnKeys} and of {@code columnKeys}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnKeys(ExplainKey[])}
   */
  @Test
  @DisplayName(
      "Test Builder columnKeys(ExplainKey[]) with 'ExplainKey[]'; when of 'columnKeys' and of 'columnKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnKeys(ExplainKey[])"})
  void testBuilderColumnKeysWithExplainKey_whenOfColumnKeysAndOfColumnKeys() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();
    ExplainKey<?> ofResult = ExplainKey.of("columnKeys");
    ExplainKey<?> ofResult2 = ExplainKey.of("columnKeys");

    // Act
    Builder actualColumnKeysResult = builderResult.columnKeys(ofResult, ofResult2);

    // Assert
    assertSame(builderResult, actualColumnKeysResult);
  }

  /**
   * Test Builder {@link Builder#columnKeys(ExplainKey[])} with {@code ExplainKey[]}.
   *
   * <ul>
   *   <li>When of {@code Name}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnKeys(ExplainKey[])}
   */
  @Test
  @DisplayName(
      "Test Builder columnKeys(ExplainKey[]) with 'ExplainKey[]'; when of 'Name'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnKeys(ExplainKey[])"})
  void testBuilderColumnKeysWithExplainKey_whenOfName_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();
    ExplainKey<?> ofResult = ExplainKey.of("Name");

    // Act
    Builder actualColumnKeysResult = builderResult.columnKeys(ofResult);

    // Assert
    assertSame(builderResult, actualColumnKeysResult);
  }

  /**
   * Test Builder {@link Builder#columnKeys(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given of {@code columnKeys}.
   *   <li>When {@link ArrayList#ArrayList()} add of {@code columnKeys}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnKeys(List)}
   */
  @Test
  @DisplayName(
      "Test Builder columnKeys(List) with 'List'; given of 'columnKeys'; when ArrayList() add of 'columnKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnKeys(List)"})
  void testBuilderColumnKeysWithList_givenOfColumnKeys_whenArrayListAddOfColumnKeys() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    ArrayList<ExplainKey<?>> columnKeys = new ArrayList<>();
    ExplainKey<?> ofResult = ExplainKey.of("columnKeys");
    columnKeys.add(ofResult);

    // Act
    Builder actualColumnKeysResult = builderResult.columnKeys(columnKeys);

    // Assert
    assertSame(builderResult, actualColumnKeysResult);
  }

  /**
   * Test Builder {@link Builder#columnKeys(List)} with {@code List}.
   *
   * <ul>
   *   <li>Given of {@code columnKeys}.
   *   <li>When {@link ArrayList#ArrayList()} add of {@code columnKeys}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnKeys(List)}
   */
  @Test
  @DisplayName(
      "Test Builder columnKeys(List) with 'List'; given of 'columnKeys'; when ArrayList() add of 'columnKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnKeys(List)"})
  void testBuilderColumnKeysWithList_givenOfColumnKeys_whenArrayListAddOfColumnKeys2() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    ArrayList<ExplainKey<?>> columnKeys = new ArrayList<>();
    ExplainKey<?> ofResult = ExplainKey.of("columnKeys");
    columnKeys.add(ofResult);
    ExplainKey<?> ofResult2 = ExplainKey.of("columnKeys");
    columnKeys.add(ofResult2);

    // Act
    Builder actualColumnKeysResult = builderResult.columnKeys(columnKeys);

    // Assert
    assertSame(builderResult, actualColumnKeysResult);
  }

  /**
   * Test Builder {@link Builder#columnKeys(List)} with {@code List}.
   *
   * <ul>
   *   <li>When {@link ArrayList#ArrayList()}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#columnKeys(List)}
   */
  @Test
  @DisplayName("Test Builder columnKeys(List) with 'List'; when ArrayList(); then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.columnKeys(List)"})
  void testBuilderColumnKeysWithList_whenArrayList_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    // Act
    Builder actualColumnKeysResult = builderResult.columnKeys(new ArrayList<>());

    // Assert
    assertSame(builderResult, actualColumnKeysResult);
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
    Builder builderResult = CashFlowReport.builder();
    HashBasedTable<Integer, Integer, Object> data = HashBasedTable.create();

    // Act
    Builder actualDataResult = builderResult.data(data);

    // Assert
    assertSame(builderResult, actualDataResult);
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code columnHeaders}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName(
      "Test Builder get(String) with 'propertyName'; when 'columnHeaders'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenColumnHeaders_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = CashFlowReport.builder().get("columnHeaders");

    // Assert
    assertTrue(actualGetResult instanceof List);
    assertTrue(((List<Object>) actualGetResult).isEmpty());
  }

  /**
   * Test Builder {@link Builder#get(String)} with {@code propertyName}.
   *
   * <ul>
   *   <li>When {@code columnKeys}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Builder#get(String)}
   */
  @Test
  @DisplayName("Test Builder get(String) with 'propertyName'; when 'columnKeys'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Builder.get(String)"})
  void testBuilderGetWithPropertyName_whenColumnKeys_thenReturnList() {
    // Arrange and Act
    Object actualGetResult = CashFlowReport.builder().get("columnKeys");

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
    assertDoesNotThrow(() -> CashFlowReport.builder().get("data"));
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
    assertThrows(NoSuchElementException.class, () -> CashFlowReport.builder().get("Property Name"));
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
    assertNull(CashFlowReport.builder().get("runInstant"));
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
    assertNull(CashFlowReport.builder().get("valuationDate"));
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
    Builder builderResult = CashFlowReport.builder();

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
        () -> CashFlowReport.builder().set("Property Name", "New Value"));
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code columnHeaders}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'columnHeaders'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenColumnHeaders_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    // Act
    Builder actualSetResult = builderResult.set("columnHeaders", new ArrayList<>());

    // Assert
    assertSame(builderResult, actualSetResult);
  }

  /**
   * Test Builder {@link Builder#set(String, Object)} with {@code propertyName}, {@code newValue}.
   *
   * <ul>
   *   <li>When {@code columnKeys}.
   *   <li>Then return builder.
   * </ul>
   *
   * <p>Method under test: {@link Builder#set(String, Object)}
   */
  @Test
  @DisplayName(
      "Test Builder set(String, Object) with 'propertyName', 'newValue'; when 'columnKeys'; then return builder")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Builder Builder.set(String, Object)"})
  void testBuilderSetWithPropertyNameNewValue_whenColumnKeys_thenReturnBuilder() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    // Act
    Builder actualSetResult = builderResult.set("columnKeys", new ArrayList<>());

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
    Builder builderResult = CashFlowReport.builder();

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
    Builder builderResult = CashFlowReport.builder();

    // Act
    Builder actualValuationDateResult = builderResult.valuationDate(LocalDate.of(1970, 1, 1));

    // Assert
    assertSame(builderResult, actualValuationDateResult);
  }

  /**
   * Test {@link CashFlowReport#getRowCount()}.
   *
   * <ul>
   *   <li>Given {@link ImmutableTable.Builder#put(Object, Object, Object)} with rowKey is one and
   *       columnKey is one and {@code Value}.
   *   <li>Then return one.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#getRowCount()}
   */
  @Test
  @DisplayName(
      "Test getRowCount(); given put(Object, Object, Object) with rowKey is one and columnKey is one and 'Value'; then return one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CashFlowReport.getRowCount()"})
  void testGetRowCount_givenPutWithRowKeyIsOneAndColumnKeyIsOneAndValue_thenReturnOne() {
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
        1,
        columnHeadersResult
            .columnKeys(new ArrayList<>())
            .data(data)
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build()
            .getRowCount());
  }

  /**
   * Test {@link CashFlowReport#getRowCount()}.
   *
   * <ul>
   *   <li>Then calls {@link Comparator#compare(Object, Object)}.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#getRowCount()}
   */
  @Test
  @DisplayName("Test getRowCount(); then calls compare(Object, Object)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CashFlowReport.getRowCount()"})
  void testGetRowCount_thenCallsCompare() {
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
    int actualRowCount =
        columnHeadersResult
            .columnKeys(new ArrayList<>())
            .data(data)
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build()
            .getRowCount();

    // Assert
    verify(columnComparator).compare(1, 0);
    verify(rowComparator).compare(1, 1);
    assertEquals(1, actualRowCount);
  }

  /**
   * Test {@link CashFlowReport#getRowCount()}.
   *
   * <ul>
   *   <li>Then return zero.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#getRowCount()}
   */
  @Test
  @DisplayName("Test getRowCount(); then return zero")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"int CashFlowReport.getRowCount()"})
  void testGetRowCount_thenReturnZero() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertEquals(
        0,
        columnKeysResult
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
    Class<? extends CashFlowReport> actualBeanTypeResult = CashFlowReport.meta().beanType();

    // Assert
    Class<CashFlowReport> expectedBeanTypeResult = CashFlowReport.class;
    assertEquals(expectedBeanTypeResult, actualBeanTypeResult);
  }

  /**
   * Test Meta getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link Meta#columnHeaders()}
   *   <li>{@link Meta#columnKeys()}
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
    "MetaProperty Meta.columnHeaders()",
    "MetaProperty Meta.columnKeys()",
    "MetaProperty Meta.data()",
    "MetaProperty Meta.runInstant()",
    "MetaProperty Meta.valuationDate()"
  })
  void testMetaGettersAndSetters() {
    // Arrange
    Meta metaResult = CashFlowReport.meta();

    // Act
    MetaProperty<ImmutableList<String>> actualColumnHeadersResult = metaResult.columnHeaders();
    MetaProperty<ImmutableList<ExplainKey<?>>> actualColumnKeysResult = metaResult.columnKeys();
    MetaProperty<ImmutableTable<Integer, Integer, Object>> actualDataResult = metaResult.data();
    MetaProperty<Instant> actualRunInstantResult = metaResult.runInstant();

    // Assert
    assertTrue(actualColumnHeadersResult instanceof DirectMetaProperty);
    assertTrue(actualColumnKeysResult instanceof DirectMetaProperty);
    assertTrue(actualDataResult instanceof DirectMetaProperty);
    assertTrue(actualRunInstantResult instanceof DirectMetaProperty);
    assertTrue(metaResult.valuationDate() instanceof DirectMetaProperty);
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code columnHeaders}.
   *   <li>Then return name is {@code columnHeaders}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'columnHeaders'; then return name is 'columnHeaders'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenColumnHeaders_thenReturnNameIsColumnHeaders() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CashFlowReport.meta().metaPropertyGet("columnHeaders");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<ExplainKey<?>>> columnKeysResult =
        ((Meta) metaBeanResult).columnKeys();
    assertTrue(columnKeysResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableTable<Integer, Integer, Object>> dataResult =
        ((Meta) metaBeanResult).data();
    assertTrue(dataResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Instant> runInstantResult = ((Meta) metaBeanResult).runInstant();
    assertTrue(runInstantResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("columnHeaders", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).columnHeaders());
    assertSame(metaBeanResult, columnKeysResult.metaBean());
    assertSame(metaBeanResult, dataResult.metaBean());
    assertSame(metaBeanResult, runInstantResult.metaBean());
    assertSame(metaBeanResult, valuationDateResult.metaBean());
  }

  /**
   * Test Meta {@link Meta#metaPropertyGet(String)}.
   *
   * <ul>
   *   <li>When {@code columnKeys}.
   *   <li>Then return name is {@code columnKeys}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#metaPropertyGet(String)}
   */
  @Test
  @DisplayName(
      "Test Meta metaPropertyGet(String); when 'columnKeys'; then return name is 'columnKeys'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"MetaProperty Meta.metaPropertyGet(String)"})
  void testMetaMetaPropertyGet_whenColumnKeys_thenReturnNameIsColumnKeys() {
    // Arrange and Act
    MetaProperty<?> actualMetaPropertyGetResult =
        CashFlowReport.meta().metaPropertyGet("columnKeys");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<String>> columnHeadersResult =
        ((Meta) metaBeanResult).columnHeaders();
    assertTrue(columnHeadersResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableTable<Integer, Integer, Object>> dataResult =
        ((Meta) metaBeanResult).data();
    assertTrue(dataResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Instant> runInstantResult = ((Meta) metaBeanResult).runInstant();
    assertTrue(runInstantResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("columnKeys", actualMetaPropertyGetResult.name());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).columnKeys());
    assertSame(metaBeanResult, columnHeadersResult.metaBean());
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
    MetaProperty<?> actualMetaPropertyGetResult = CashFlowReport.meta().metaPropertyGet("data");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<String>> columnHeadersResult =
        ((Meta) metaBeanResult).columnHeaders();
    assertTrue(columnHeadersResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ExplainKey<?>>> columnKeysResult =
        ((Meta) metaBeanResult).columnKeys();
    assertTrue(columnKeysResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Instant> runInstantResult = ((Meta) metaBeanResult).runInstant();
    assertTrue(runInstantResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("data", actualMetaPropertyGetResult.name());
    Class<ImmutableTable> expectedPropertyTypeResult = ImmutableTable.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).data());
    assertSame(metaBeanResult, columnHeadersResult.metaBean());
    assertSame(metaBeanResult, columnKeysResult.metaBean());
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
    assertNull(CashFlowReport.meta().metaPropertyGet("Property Name"));
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
    MetaProperty<?> actualMetaPropertyGetResult =
        CashFlowReport.meta().metaPropertyGet("runInstant");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<String>> columnHeadersResult =
        ((Meta) metaBeanResult).columnHeaders();
    assertTrue(columnHeadersResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ExplainKey<?>>> columnKeysResult =
        ((Meta) metaBeanResult).columnKeys();
    assertTrue(columnKeysResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableTable<Integer, Integer, Object>> dataResult =
        ((Meta) metaBeanResult).data();
    assertTrue(dataResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<LocalDate> valuationDateResult = ((Meta) metaBeanResult).valuationDate();
    assertTrue(valuationDateResult instanceof DirectMetaProperty);
    assertEquals("runInstant", actualMetaPropertyGetResult.name());
    Class<Instant> expectedPropertyTypeResult = Instant.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).runInstant());
    assertSame(metaBeanResult, columnHeadersResult.metaBean());
    assertSame(metaBeanResult, columnKeysResult.metaBean());
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
        CashFlowReport.meta().metaPropertyGet("valuationDate");

    // Assert
    MetaBean metaBeanResult = actualMetaPropertyGetResult.metaBean();
    assertTrue(metaBeanResult instanceof Meta);
    MetaProperty<ImmutableList<String>> columnHeadersResult =
        ((Meta) metaBeanResult).columnHeaders();
    assertTrue(columnHeadersResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableList<ExplainKey<?>>> columnKeysResult =
        ((Meta) metaBeanResult).columnKeys();
    assertTrue(columnKeysResult instanceof DirectMetaProperty);
    MetaProperty<ImmutableTable<Integer, Integer, Object>> dataResult =
        ((Meta) metaBeanResult).data();
    assertTrue(dataResult instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyGetResult instanceof DirectMetaProperty);
    MetaProperty<Instant> runInstantResult = ((Meta) metaBeanResult).runInstant();
    assertTrue(runInstantResult instanceof DirectMetaProperty);
    assertEquals("valuationDate", actualMetaPropertyGetResult.name());
    Class<LocalDate> expectedPropertyTypeResult = LocalDate.class;
    assertEquals(expectedPropertyTypeResult, actualMetaPropertyGetResult.propertyType());
    assertSame(actualMetaPropertyGetResult, ((Meta) metaBeanResult).valuationDate());
    assertSame(metaBeanResult, columnHeadersResult.metaBean());
    assertSame(metaBeanResult, columnKeysResult.metaBean());
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
    Map<String, MetaProperty<?>> actualMetaPropertyMapResult =
        CashFlowReport.meta().metaPropertyMap();

    // Assert
    assertEquals(5, actualMetaPropertyMapResult.size());
    assertTrue(actualMetaPropertyMapResult.get("columnHeaders") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("columnKeys") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("data") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("runInstant") instanceof DirectMetaProperty);
    assertTrue(actualMetaPropertyMapResult.get("valuationDate") instanceof DirectMetaProperty);
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
    assertNull(CashFlowReport.meta().propertyGet(mock(Bean.class), "Property Name", true));
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code columnHeaders}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertyGet(Bean, String, boolean); when 'columnHeaders'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenColumnHeaders_thenReturnList() {
    // Arrange
    Meta metaResult = CashFlowReport.meta();

    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
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
            "columnHeaders",
            true);

    // Assert
    assertTrue(actualPropertyGetResult instanceof List);
    assertTrue(((List<Object>) actualPropertyGetResult).isEmpty());
  }

  /**
   * Test Meta {@link Meta#propertyGet(Bean, String, boolean)}.
   *
   * <ul>
   *   <li>When {@code columnKeys}.
   *   <li>Then return {@link List}.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertyGet(Bean, String, boolean)}
   */
  @Test
  @DisplayName("Test Meta propertyGet(Bean, String, boolean); when 'columnKeys'; then return List")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object Meta.propertyGet(Bean, String, boolean)"})
  void testMetaPropertyGet_whenColumnKeys_thenReturnList() {
    // Arrange
    Meta metaResult = CashFlowReport.meta();

    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();

    // Act
    Object actualPropertyGetResult =
        metaResult.propertyGet(
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
            "columnKeys",
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
    Meta metaResult = CashFlowReport.meta();

    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();

    // Act
    assertDoesNotThrow(
        () ->
            metaResult.propertyGet(
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
        () -> CashFlowReport.meta().propertyGet(null, "Property Name", false));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code columnHeaders}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'columnHeaders'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenColumnHeaders_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () ->
            CashFlowReport.meta()
                .propertySet(mock(Bean.class), "columnHeaders", "New Value", true));
  }

  /**
   * Test Meta {@link Meta#propertySet(Bean, String, Object, boolean)}.
   *
   * <ul>
   *   <li>When {@code columnKeys}.
   *   <li>Then does not throw.
   * </ul>
   *
   * <p>Method under test: {@link Meta#propertySet(Bean, String, Object, boolean)}
   */
  @Test
  @DisplayName(
      "Test Meta propertySet(Bean, String, Object, boolean); when 'columnKeys'; then does not throw")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void Meta.propertySet(Bean, String, Object, boolean)"})
  void testMetaPropertySet_whenColumnKeys_thenDoesNotThrow() {
    // Arrange, Act and Assert
    assertDoesNotThrow(
        () -> CashFlowReport.meta().propertySet(mock(Bean.class), "columnKeys", "New Value", true));
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
        () -> CashFlowReport.meta().propertySet(mock(Bean.class), "data", "New Value", true));
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
        () ->
            CashFlowReport.meta()
                .propertySet(mock(Bean.class), "columnHeaders", "New Value", false));
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
        () ->
            CashFlowReport.meta()
                .propertySet(mock(Bean.class), "Property Name", "New Value", true));
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
        () -> CashFlowReport.meta().propertySet(mock(Bean.class), "runInstant", "New Value", true));
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
        () ->
            CashFlowReport.meta()
                .propertySet(mock(Bean.class), "valuationDate", "New Value", true));
  }

  /**
   * Test {@link CashFlowReport#writeCsv(OutputStream)}.
   *
   * <p>Method under test: {@link CashFlowReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName("Test writeCsv(OutputStream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeCsv(OutputStream)"})
  void testWriteCsv() throws UnsupportedEncodingException {
    // Arrange
    ArrayList<String> columnHeaders = new ArrayList<>();
    columnHeaders.add(",");

    Builder columnHeadersResult = CashFlowReport.builder().columnHeaders(columnHeaders);

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    CashFlowReport cashFlowReport =
        columnKeysResult
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
    cashFlowReport.writeCsv(out);

    // Assert
    byte[] expectedToByteArrayResult = "\",\"\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link CashFlowReport#writeCsv(OutputStream)}.
   *
   * <ul>
   *   <li>Given {@link ImmutableTable.Builder#put(Object, Object, Object)} with rowKey is
   *       thirty-four and columnKey is zero and {@code Value}.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test writeCsv(OutputStream); given put(Object, Object, Object) with rowKey is thirty-four and columnKey is zero and 'Value'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeCsv(OutputStream)"})
  void testWriteCsv_givenPutWithRowKeyIsThirtyFourAndColumnKeyIsZeroAndValue()
      throws UnsupportedEncodingException {
    // Arrange
    ArrayList<String> columnHeaders = new ArrayList<>();
    columnHeaders.add("line");

    Builder columnHeadersResult = CashFlowReport.builder().columnHeaders(columnHeaders);

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    builderResult.put(34, 0, "Value");
    builderResult.put(1, 1, "Value");

    Comparator<Integer> columnComparator = mock(Comparator.class);
    when(columnComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);

    ImmutableTable.Builder<Integer, Integer, Object> orderColumnsByResult =
        builderResult.orderColumnsBy(columnComparator);

    Comparator<Integer> rowComparator = mock(Comparator.class);
    when(rowComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(orderColumnsByResult.orderRowsBy(rowComparator).build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    cashFlowReport.writeCsv(out);

    // Assert
    verify(columnComparator).compare(1, 0);
    verify(rowComparator, atLeast(1)).compare(1, 34);
    byte[] expectedToByteArrayResult = "line\n\n\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link CashFlowReport#writeCsv(OutputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayOutputStream#ByteArrayOutputStream()} toByteArray is array of {@code
   *       byte} with lf.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test writeCsv(OutputStream); then ByteArrayOutputStream() toByteArray is array of byte with lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeCsv(OutputStream)"})
  void testWriteCsv_thenByteArrayOutputStreamToByteArrayIsArrayOfByteWithLf() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();
    CashFlowReport cashFlowReport =
        columnKeysResult
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
    cashFlowReport.writeCsv(out);

    // Assert
    assertArrayEquals(new byte[] {'\n'}, out.toByteArray());
  }

  /**
   * Test {@link CashFlowReport#writeCsv(OutputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayOutputStream#ByteArrayOutputStream()} toByteArray is array of {@code
   *       byte} with lf and lf.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test writeCsv(OutputStream); then ByteArrayOutputStream() toByteArray is array of byte with lf and lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeCsv(OutputStream)"})
  void testWriteCsv_thenByteArrayOutputStreamToByteArrayIsArrayOfByteWithLfAndLf() {
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
    CashFlowReport cashFlowReport =
        columnHeadersResult
            .columnKeys(new ArrayList<>())
            .data(data)
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    cashFlowReport.writeCsv(out);

    // Assert
    assertArrayEquals(new byte[] {'\n', '\n'}, out.toByteArray());
  }

  /**
   * Test {@link CashFlowReport#writeCsv(OutputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayOutputStream#ByteArrayOutputStream()} toByteArray is array of {@code
   *       byte} with lf and lf.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test writeCsv(OutputStream); then ByteArrayOutputStream() toByteArray is array of byte with lf and lf")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeCsv(OutputStream)"})
  void testWriteCsv_thenByteArrayOutputStreamToByteArrayIsArrayOfByteWithLfAndLf2() {
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
    CashFlowReport cashFlowReport =
        columnHeadersResult
            .columnKeys(new ArrayList<>())
            .data(data)
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    cashFlowReport.writeCsv(out);

    // Assert
    verify(columnComparator).compare(1, 0);
    verify(rowComparator).compare(1, 1);
    assertArrayEquals(new byte[] {'\n', '\n'}, out.toByteArray());
  }

  /**
   * Test {@link CashFlowReport#writeCsv(OutputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayOutputStream#ByteArrayOutputStream()} toByteArray is {@code line}
   *       Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test writeCsv(OutputStream); then ByteArrayOutputStream() toByteArray is 'line' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeCsv(OutputStream)"})
  void testWriteCsv_thenByteArrayOutputStreamToByteArrayIsLineBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    ArrayList<String> columnHeaders = new ArrayList<>();
    columnHeaders.add("line");

    Builder columnHeadersResult = CashFlowReport.builder().columnHeaders(columnHeaders);

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    builderResult.put(1, 0, "Value");
    builderResult.put(1, 1, "Value");

    Comparator<Integer> columnComparator = mock(Comparator.class);
    when(columnComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);

    ImmutableTable.Builder<Integer, Integer, Object> orderColumnsByResult =
        builderResult.orderColumnsBy(columnComparator);

    Comparator<Integer> rowComparator = mock(Comparator.class);
    when(rowComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(orderColumnsByResult.orderRowsBy(rowComparator).build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    cashFlowReport.writeCsv(out);

    // Assert
    verify(columnComparator).compare(1, 0);
    verify(rowComparator).compare(1, 1);
    byte[] expectedToByteArrayResult = "line\n\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link CashFlowReport#writeCsv(OutputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayOutputStream#ByteArrayOutputStream()} toByteArray is {@code ",",line
   *       ,} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#writeCsv(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test writeCsv(OutputStream); then ByteArrayOutputStream() toByteArray is '\",\",line ,' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeCsv(OutputStream)"})
  void testWriteCsv_thenByteArrayOutputStreamToByteArrayIsLineBytesIsUtf82()
      throws UnsupportedEncodingException {
    // Arrange
    ArrayList<String> columnHeaders = new ArrayList<>();
    columnHeaders.add(",");
    columnHeaders.add("line");

    Builder columnHeadersResult = CashFlowReport.builder().columnHeaders(columnHeaders);

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    builderResult.put(1, 0, "Value");
    builderResult.put(1, 1, "Value");

    Comparator<Integer> columnComparator = mock(Comparator.class);
    when(columnComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);

    ImmutableTable.Builder<Integer, Integer, Object> orderColumnsByResult =
        builderResult.orderColumnsBy(columnComparator);

    Comparator<Integer> rowComparator = mock(Comparator.class);
    when(rowComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(orderColumnsByResult.orderRowsBy(rowComparator).build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    cashFlowReport.writeCsv(out);

    // Assert
    verify(columnComparator).compare(1, 0);
    verify(rowComparator).compare(1, 1);
    byte[] expectedToByteArrayResult = "\",\",line\n,\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link CashFlowReport#writeAsciiTable(OutputStream)}.
   *
   * <p>Method under test: {@link CashFlowReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName("Test writeAsciiTable(OutputStream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable() throws UnsupportedEncodingException {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();
    CashFlowReport cashFlowReport =
        columnKeysResult
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
    cashFlowReport.writeAsciiTable(out);

    // Assert
    byte[] expectedToByteArrayResult = "+\n|\n+\n+\n\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link CashFlowReport#writeAsciiTable(OutputStream)}.
   *
   * <p>Method under test: {@link CashFlowReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName("Test writeAsciiTable(OutputStream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable2() throws UnsupportedEncodingException {
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
    CashFlowReport cashFlowReport =
        columnHeadersResult
            .columnKeys(new ArrayList<>())
            .data(data)
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    cashFlowReport.writeAsciiTable(out);

    // Assert
    byte[] expectedToByteArrayResult = "+\n|\n+\n|\n+\n\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link CashFlowReport#writeAsciiTable(OutputStream)}.
   *
   * <p>Method under test: {@link CashFlowReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName("Test writeAsciiTable(OutputStream)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable3() throws UnsupportedEncodingException {
    // Arrange
    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    builderResult.put(1, 2, "Value");
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
    CashFlowReport cashFlowReport =
        columnHeadersResult
            .columnKeys(new ArrayList<>())
            .data(data)
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    cashFlowReport.writeAsciiTable(out);

    // Assert
    verify(rowComparator).compare(1, 1);
    verify(columnComparator).compare(1, 2);
    byte[] expectedToByteArrayResult = "+\n|\n+\n|\n+\n\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link CashFlowReport#writeAsciiTable(OutputStream)}.
   *
   * <ul>
   *   <li>Then array length is three hundred one.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName("Test writeAsciiTable(OutputStream); then array length is three hundred one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable_thenArrayLengthIsThreeHundredOne() {
    // Arrange
    ArrayList<String> columnHeaders = new ArrayList<>();
    columnHeaders.add("Number of headers {} must match number of alignments {}");

    Builder columnHeadersResult = CashFlowReport.builder().columnHeaders(columnHeaders);

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    builderResult.put(1, 2, "Value");
    builderResult.put(1, 1, "Value");

    Comparator<Integer> columnComparator = mock(Comparator.class);
    when(columnComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);

    ImmutableTable.Builder<Integer, Integer, Object> orderColumnsByResult =
        builderResult.orderColumnsBy(columnComparator);

    Comparator<Integer> rowComparator = mock(Comparator.class);
    when(rowComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(orderColumnsByResult.orderRowsBy(rowComparator).build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    cashFlowReport.writeAsciiTable(out);

    // Assert
    verify(rowComparator).compare(1, 1);
    verify(columnComparator).compare(1, 2);
    byte[] toByteArrayResult = out.toByteArray();
    assertEquals(301, toByteArrayResult.length);
    assertEquals('+', toByteArrayResult[298]);
    assertEquals('-', toByteArrayResult[282]);
    assertEquals('-', toByteArrayResult[283]);
    assertEquals('-', toByteArrayResult[284]);
    assertEquals('-', toByteArrayResult[285]);
    assertEquals('-', toByteArrayResult[286]);
    assertEquals('-', toByteArrayResult[287]);
    assertEquals('-', toByteArrayResult[288]);
    assertEquals('-', toByteArrayResult[289]);
    assertEquals('-', toByteArrayResult[290]);
    assertEquals('-', toByteArrayResult[291]);
    assertEquals('-', toByteArrayResult[292]);
    assertEquals('-', toByteArrayResult[293]);
    assertEquals('-', toByteArrayResult[294]);
    assertEquals('-', toByteArrayResult[295]);
    assertEquals('-', toByteArrayResult[296]);
    assertEquals('-', toByteArrayResult[297]);
    assertEquals('\n', toByteArrayResult[299]);
    assertEquals('\n', toByteArrayResult[300]);
  }

  /**
   * Test {@link CashFlowReport#writeAsciiTable(OutputStream)}.
   *
   * <ul>
   *   <li>Then array length is three hundred sixty-one.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName("Test writeAsciiTable(OutputStream); then array length is three hundred sixty-one")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable_thenArrayLengthIsThreeHundredSixtyOne() {
    // Arrange
    ArrayList<String> columnHeaders = new ArrayList<>();
    columnHeaders.add("Number of headers {} must match number of alignments {}");

    Builder columnHeadersResult = CashFlowReport.builder().columnHeaders(columnHeaders);

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    builderResult.put(2, 2, "Value");
    builderResult.put(1, 1, "Value");

    Comparator<Integer> columnComparator = mock(Comparator.class);
    when(columnComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);

    ImmutableTable.Builder<Integer, Integer, Object> orderColumnsByResult =
        builderResult.orderColumnsBy(columnComparator);

    Comparator<Integer> rowComparator = mock(Comparator.class);
    when(rowComparator.compare(Mockito.<Integer>any(), Mockito.<Integer>any())).thenReturn(1);
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(orderColumnsByResult.orderRowsBy(rowComparator).build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();
    ByteArrayOutputStream out = new ByteArrayOutputStream();

    // Act
    cashFlowReport.writeAsciiTable(out);

    // Assert
    verify(columnComparator).compare(1, 2);
    verify(rowComparator, atLeast(1)).compare(1, 2);
    assertEquals(361, out.toByteArray().length);
  }

  /**
   * Test {@link CashFlowReport#writeAsciiTable(OutputStream)}.
   *
   * <ul>
   *   <li>Then array length is two hundred eighty-five.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName("Test writeAsciiTable(OutputStream); then array length is two hundred eighty-five")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable_thenArrayLengthIsTwoHundredEightyFive() {
    // Arrange
    ArrayList<String> columnHeaders = new ArrayList<>();
    columnHeaders.add("Number of headers {} must match number of alignments {}");
    columnHeaders.add("category");

    Builder columnHeadersResult = CashFlowReport.builder().columnHeaders(columnHeaders);

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    CashFlowReport cashFlowReport =
        columnKeysResult
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
    cashFlowReport.writeAsciiTable(out);

    // Assert
    byte[] toByteArrayResult = out.toByteArray();
    assertEquals(285, toByteArrayResult.length);
    assertEquals('+', toByteArrayResult[271]);
    assertEquals('+', toByteArrayResult[282]);
    assertEquals('-', toByteArrayResult[260]);
    assertEquals('-', toByteArrayResult[261]);
    assertEquals('-', toByteArrayResult[262]);
    assertEquals('-', toByteArrayResult[263]);
    assertEquals('-', toByteArrayResult[264]);
    assertEquals('-', toByteArrayResult[265]);
    assertEquals('-', toByteArrayResult[266]);
    assertEquals('-', toByteArrayResult[267]);
    assertEquals('-', toByteArrayResult[268]);
    assertEquals('-', toByteArrayResult[269]);
    assertEquals('-', toByteArrayResult[270]);
    assertEquals('-', toByteArrayResult[272]);
    assertEquals('-', toByteArrayResult[273]);
    assertEquals('-', toByteArrayResult[274]);
    assertEquals('-', toByteArrayResult[275]);
    assertEquals('\n', toByteArrayResult[283]);
    assertEquals('\n', toByteArrayResult[284]);
  }

  /**
   * Test {@link CashFlowReport#writeAsciiTable(OutputStream)}.
   *
   * <ul>
   *   <li>Then {@link ByteArrayOutputStream#ByteArrayOutputStream()} toByteArray is {@code
   *       +----------+ | category | +----------+ +----------+} Bytes is {@code UTF-8}.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#writeAsciiTable(OutputStream)}
   */
  @Test
  @DisplayName(
      "Test writeAsciiTable(OutputStream); then ByteArrayOutputStream() toByteArray is '+----------+ | category | +----------+ +----------+' Bytes is 'UTF-8'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void CashFlowReport.writeAsciiTable(OutputStream)"})
  void testWriteAsciiTable_thenByteArrayOutputStreamToByteArrayIsCategoryBytesIsUtf8()
      throws UnsupportedEncodingException {
    // Arrange
    ArrayList<String> columnHeaders = new ArrayList<>();
    columnHeaders.add("category");

    Builder columnHeadersResult = CashFlowReport.builder().columnHeaders(columnHeaders);

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    CashFlowReport cashFlowReport =
        columnKeysResult
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
    cashFlowReport.writeAsciiTable(out);

    // Assert
    byte[] expectedToByteArrayResult =
        "+----------+\n| category |\n+----------+\n+----------+\n\n".getBytes("UTF-8");
    assertArrayEquals(expectedToByteArrayResult, out.toByteArray());
  }

  /**
   * Test {@link CashFlowReport#meta()}.
   *
   * <p>Method under test: {@link CashFlowReport#meta()}
   */
  @Test
  @DisplayName("Test meta()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CashFlowReport.meta()"})
  void testMeta() {
    // Arrange and Act
    Meta actualMetaResult = CashFlowReport.meta();

    // Assert
    assertTrue(actualMetaResult.columnHeaders() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.columnKeys() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.data() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.runInstant() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.valuationDate() instanceof DirectMetaProperty);
    assertTrue(actualMetaResult.isBuildable());
  }

  /**
   * Test {@link CashFlowReport#metaBean()}.
   *
   * <p>Method under test: {@link CashFlowReport#metaBean()}
   */
  @Test
  @DisplayName("Test metaBean()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Meta CashFlowReport.metaBean()"})
  void testMetaBean() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertSame(
        Meta.INSTANCE,
        columnKeysResult
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
   *   <li>{@link CashFlowReport#toString()}
   *   <li>{@link CashFlowReport#getColumnHeaders()}
   *   <li>{@link CashFlowReport#getColumnKeys()}
   *   <li>{@link CashFlowReport#getData()}
   *   <li>{@link CashFlowReport#getRunInstant()}
   *   <li>{@link CashFlowReport#getValuationDate()}
   *   <li>{@link CashFlowReport#toBuilder()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "ImmutableList CashFlowReport.getColumnHeaders()",
    "ImmutableList CashFlowReport.getColumnKeys()",
    "ImmutableTable CashFlowReport.getData()",
    "Instant CashFlowReport.getRunInstant()",
    "LocalDate CashFlowReport.getValuationDate()",
    "Builder CashFlowReport.toBuilder()",
    "String CashFlowReport.toString()"
  })
  void testGettersAndSetters() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();
    LocalDate valuationDate = LocalDate.of(1970, 1, 1);
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(valuationDate)
            .build();

    // Act
    String actualToStringResult = cashFlowReport.toString();
    ImmutableList<String> actualColumnHeaders = cashFlowReport.getColumnHeaders();
    ImmutableList<ExplainKey<?>> actualColumnKeys = cashFlowReport.getColumnKeys();
    ImmutableTable<Integer, Integer, Object> actualData = cashFlowReport.getData();
    Instant actualRunInstant = cashFlowReport.getRunInstant();
    LocalDate actualValuationDate = cashFlowReport.getValuationDate();
    cashFlowReport.toBuilder();

    // Assert
    assertEquals("1970-01-01", actualValuationDate.toString());
    assertEquals(
        "CashFlowReport{valuationDate=1970-01-01, runInstant=1970-01-01T00:00:00Z, columnKeys=[], columnHeaders=[],"
            + " data={}}",
        actualToStringResult);
    assertTrue(actualData.isEmpty());
    assertSame(actualColumnHeaders, actualColumnKeys);
    assertSame(valuationDate, actualValuationDate);
    assertSame(Instant.EPOCH, actualRunInstant);
  }

  /**
   * Test {@link CashFlowReport#equals(Object)}, and {@link CashFlowReport#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CashFlowReport#equals(Object)}
   *   <li>{@link CashFlowReport#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CashFlowReport.equals(Object)", "int CashFlowReport.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    Builder builderResult3 = CashFlowReport.builder();

    Builder columnHeadersResult2 = builderResult3.columnHeaders(new ArrayList<>());

    Builder columnKeysResult2 = columnHeadersResult2.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult4 = ImmutableTable.builder();
    CashFlowReport cashFlowReport2 =
        columnKeysResult2
            .data(
                builderResult4
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertEquals(cashFlowReport, cashFlowReport2);
    assertEquals(cashFlowReport.hashCode(), cashFlowReport2.hashCode());
  }

  /**
   * Test {@link CashFlowReport#equals(Object)}, and {@link CashFlowReport#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link CashFlowReport#equals(Object)}
   *   <li>{@link CashFlowReport#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CashFlowReport.equals(Object)", "int CashFlowReport.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    // Act and Assert
    assertEquals(cashFlowReport, cashFlowReport);
    int expectedHashCodeResult = cashFlowReport.hashCode();
    assertEquals(expectedHashCodeResult, cashFlowReport.hashCode());
  }

  /**
   * Test {@link CashFlowReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CashFlowReport.equals(Object)", "int CashFlowReport.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    ArrayList<String> columnHeaders = new ArrayList<>();
    columnHeaders.add("foo");

    Builder columnHeadersResult = CashFlowReport.builder().columnHeaders(columnHeaders);

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult = ImmutableTable.builder();
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(
                builderResult
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    Builder builderResult2 = CashFlowReport.builder();

    Builder columnHeadersResult2 = builderResult2.columnHeaders(new ArrayList<>());

    Builder columnKeysResult2 = columnHeadersResult2.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult3 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        cashFlowReport,
        columnKeysResult2
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
   * Test {@link CashFlowReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CashFlowReport.equals(Object)", "int CashFlowReport.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    ArrayList<ExplainKey<?>> columnKeys = new ArrayList<>();
    ExplainKey<?> ofResult = ExplainKey.of("Name");
    columnKeys.add(ofResult);

    Builder builderResult = CashFlowReport.builder();

    Builder columnKeysResult =
        builderResult.columnHeaders(new ArrayList<>()).columnKeys(columnKeys);

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    Builder builderResult3 = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult3.columnHeaders(new ArrayList<>());

    Builder columnKeysResult2 = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult4 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        cashFlowReport,
        columnKeysResult2
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
   * Test {@link CashFlowReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CashFlowReport.equals(Object)", "int CashFlowReport.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
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
    CashFlowReport cashFlowReport =
        columnHeadersResult
            .columnKeys(new ArrayList<>())
            .data(data)
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    Builder builderResult3 = CashFlowReport.builder();

    Builder columnHeadersResult2 = builderResult3.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult2.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult4 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        cashFlowReport,
        columnKeysResult
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
   * Test {@link CashFlowReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CashFlowReport.equals(Object)", "int CashFlowReport.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.now().atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build();

    Builder builderResult3 = CashFlowReport.builder();

    Builder columnHeadersResult2 = builderResult3.columnHeaders(new ArrayList<>());

    Builder columnKeysResult2 = columnHeadersResult2.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult4 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        cashFlowReport,
        columnKeysResult2
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
   * Test {@link CashFlowReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CashFlowReport.equals(Object)", "int CashFlowReport.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();
    CashFlowReport cashFlowReport =
        columnKeysResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.now())
            .build();

    Builder builderResult3 = CashFlowReport.builder();

    Builder columnHeadersResult2 = builderResult3.columnHeaders(new ArrayList<>());

    Builder columnKeysResult2 = columnHeadersResult2.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult4 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        cashFlowReport,
        columnKeysResult2
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
   * Test {@link CashFlowReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CashFlowReport.equals(Object)", "int CashFlowReport.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        columnKeysResult
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
   * Test {@link CashFlowReport#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link CashFlowReport#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"boolean CashFlowReport.equals(Object)", "int CashFlowReport.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange
    Builder builderResult = CashFlowReport.builder();

    Builder columnHeadersResult = builderResult.columnHeaders(new ArrayList<>());

    Builder columnKeysResult = columnHeadersResult.columnKeys(new ArrayList<>());

    ImmutableTable.Builder<Integer, Integer, Object> builderResult2 = ImmutableTable.builder();

    // Act and Assert
    assertNotEquals(
        columnKeysResult
            .data(
                builderResult2
                    .orderColumnsBy(mock(Comparator.class))
                    .orderRowsBy(mock(Comparator.class))
                    .build())
            .runInstant(LocalDate.of(1970, 1, 1).atStartOfDay().atZone(ZoneOffset.UTC).toInstant())
            .valuationDate(LocalDate.of(1970, 1, 1))
            .build(),
        "Different type to CashFlowReport");
  }
}
